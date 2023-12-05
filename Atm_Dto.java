package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atm_Dto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AccountId;
	private String AccountName;
	private long AccountNumber;
	private long AccountPhoneNumber;
	private String AccountAddress;
	private int AccountPin;
	private int AccountBalance;
	private int AccountDeposit;
	public int getAccountId() {
		return AccountId;
	}
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public long getAccountPhoneNumber() {
		return AccountPhoneNumber;
	}
	public void setAccountPhoneNumber(long accountPhoneNumber) {
		AccountPhoneNumber = accountPhoneNumber;
	}
	public String getAccountAddress() {
		return AccountAddress;
	}
	public void setAccountAddress(String accountAddress) {
		AccountAddress = accountAddress;
	}
	public int getAccountPin() {
		return AccountPin;
	}
	public void setAccountPin(int accountPin) {
		AccountPin = accountPin;
	}
	public int getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}
	public int getAccountDeposit() {
		return AccountDeposit;
	}
	public void setAccountDeposit(int accountDeposit) {
		AccountDeposit = accountDeposit;
	}
	@Override
	public String toString() {
		return "Atm_Dto [AccountId=" + AccountId + ", AccountName=" + AccountName + ", AccountNumber=" + AccountNumber
				+ ", AccountPhoneNumber=" + AccountPhoneNumber + ", AccountAddress=" + AccountAddress + ", AccountPin="
				+ AccountPin + ", AccountBalance=" + AccountBalance + ", AccountDeposit=" + AccountDeposit + "]";
	}	
}
