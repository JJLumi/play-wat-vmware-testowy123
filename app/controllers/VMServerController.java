package controllers;

import com.typesafe.config.Config;
import models.VMConnection;
import models.VMInfo;
import models.VMPowerState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.SSHService;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import static play.libs.Scala.asScala;

@Singleton
public class VMServerController extends Controller {
    private MessagesApi messagesApi;
    private final Config config;
    private final Form<ConnectionData> form;
    private VMConnection vmConnection;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    public VMServerController(FormFactory formFactory, MessagesApi messagesApi, Config config) {
        this.form = formFactory.form(ConnectionData.class);
        this.messagesApi = messagesApi;
        this.config = config;
    }

    public Result setCredentials(Http.Request request) {
        final Form<ConnectionData> boundForm = form.bindFromRequest(request);
        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.index.render(boundForm, request, messagesApi.preferred(request)));
        } else {
            ConnectionData data = boundForm.get();
            System.out.println("data: " + data);
            this.vmConnection = new VMConnection(data.getServer(), Integer.parseInt(data.getPort()), data.getUsername(), data.getPassword());
            return redirect(routes.VMServerController.listVMs())
                    .flashing("info", "Connection data received");
        }
    }

//testgit
    public Result listVMs() {
        List<VMInfo> infos = new ArrayList<>();
        try {
            System.out.println("server: " + vmConnection.getServer());
            System.out.println("username: " + vmConnection.getUsername());
           SSHService ssh = new SSHService(vmConnection);
            infos = ssh.listVms();
        } catch (Exception ex) {
            logger.error("ERROR: " + ex.getMessage());
            return ok(views.html.vmlist.render(asScala(infos)));
        } finally {
            return ok(views.html.vmlist.render(asScala(infos)));
        }
    }


    public Result stopVM(String vmId) { //vmID
        System.out.println("STOP: " + vmId);
        System.out.println("VM Conn: " + vmConnection);
        try {
            SSHService ssh = new SSHService(vmConnection);
            ssh.sotopVM(vmId);
        }
        finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

    public Result startVM(String vmId) {
        System.out.println("START: " + vmId);
        System.out.println("VM Conn: " + vmConnection);
        try {
            SSHService ssh = new SSHService(vmConnection);
            ssh.startVM(vmId);

        } finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

    public Result suspendVM(String vmId) {
        System.out.println("SUSPEND: " + vmId);
        System.out.println("VM Conn: " + vmConnection);
        try {
            SSHService ssh = new SSHService(vmConnection);
            ssh.suspendVM(vmId);        }
        finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

    public Result resetVM(String vmId) {
        System.out.println("RESET: " + vmId);
        System.out.println("VM Conn: " + vmConnection);
        try {
            SSHService ssh = new SSHService(vmConnection);
            ssh.resetVM(vmId);

        } finally {
            return redirect(routes.VMServerController.listVMs());
        }
    }

    public Result getVMState(String vmId, String name) {
        System.out.println("GET VM State: " + vmId);
        System.out.println("VM Conn: " + vmConnection);
        VMPowerState state = null;
        try {
            SSHService ssh = new SSHService(vmConnection);
            state = ssh.getVMState(vmId, name);
        } finally {
            return ok(views.html.vmstate.render(state));
        }
    }

}

