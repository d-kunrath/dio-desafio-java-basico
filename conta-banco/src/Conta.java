/**
 * <h3>Conta</h3>
 * Account for DIO bank challenge
 * @author Daniel "DK"
 */
public class Conta {
  
  int accountNumber;
  String branch;
  String clientName;
  double balance;

  /**
   * Creates a DIO Banc Account 
   * @param accountNumber int 
   * @param branch
   * @param clientName
   * @param balance
   */
  public Conta(int accountNumber, String branch, String clientName, double balance) {
    this.accountNumber = accountNumber;
    this.branch = branch;
    this.clientName = clientName;
    this.balance = balance;
  }
}
