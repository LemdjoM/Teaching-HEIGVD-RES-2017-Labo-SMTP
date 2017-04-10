package smtp;

import model.mail.Message;
import model.prank.Prank;

import java.io.IOException;

/**
 * Created by lemdjo on 04.04.2017.
 */
public interface ISmtpClient {
    public void sendMessage(String serverName, int port, Prank p) throws IOException, SmtpException;
}
