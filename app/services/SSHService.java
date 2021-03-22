package services;

import models.VMConnection;
import models.VMInfo;
import models.VMPowerState;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.connection.channel.direct.Session.Command;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;

import java.io.Console;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SSHService {
    private VMConnection connection;
    private static final Console con = System.console();

    public SSHService(VMConnection connection) {
        this.connection = connection;
    }


    public String executeCommand(String command) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec(command);
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
            return res;
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }
//vim-cmd vmscvc/power.on (vmId)
    public List<VMInfo> listVms() throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/getallvms |  awk '{print $1, $2}'");
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(res);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
            return stringToVmList(res);
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }

    public void startVM(String vmID) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/power.on " +vmID );
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(res);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }

    public void sotopVM(String vmID) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/power.off " +vmID );
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(res);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());

        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }
    public void suspendVM(String vmID) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/power.suspend " +vmID );
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(res);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }

    public void resetVM(String vmID) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String res = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/power.reset " +vmID );
            res = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(res);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());

        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }

    private List<VMInfo> stringToVmList(String res) {
        String[] arr = res.split("\n");
        System.out.println(arr[0]);
        List<VMInfo> result = new ArrayList<VMInfo>();
        for (int i = 1; i < arr.length; i++) {
            // accessing each element of array
            String line = arr[i];
            System.out.println(line);
            String[] vmarray = line.split("\\s+");
            System.out.println(Arrays.toString(vmarray));
            result.add(new VMInfo(vmarray[1], vmarray[0]));
        }
        return result;
    }

    public VMPowerState getVMState(String vmId, String name) throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect(connection.getServer(), connection.getPort());
        Session session = null;
        String pow = null;
        try {
            ssh.authPassword(connection.getUsername(), connection.getPassword());
            session = ssh.startSession();
            final Command cmd = session.exec("vim-cmd vmsvc/power.getstate " + vmId + " | tail -1" ); // | tail -1 aby pokazac sam state
            pow = IOUtils.readFully(cmd.getInputStream()).toString();
            cmd.join(5, TimeUnit.SECONDS);
            System.out.println(pow);
            con.writer().print("\n** exit status: " + cmd.getExitStatus());
            return stringToPowerState(vmId, name, pow);
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (IOException e) {
                // Do Nothing
            }
            ssh.disconnect();
        }
    }

    private VMPowerState stringToPowerState(String vmId, String vmName, String res) {
        String state = res; //todo: wyciągnij z wyniku komendy 'res' sam state wirtualnej  maszyny
        return new VMPowerState(vmId, vmName, state);
    }
}
