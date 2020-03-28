package org.mycompany;

public class ScenarioOneResp2 {
	
	private String refId;
    private String reqTime;
	private String rplTime;
	EpfAccount epfAccount = new EpfAccount(); 
	EpfProfile epfProfile = new EpfProfile();
	
	 // Getter Methods 

	 public String getRefId() {
	  return refId;
	 }

	 public String getReqTime() {
	  return reqTime;
	 }

	 public String getRplTime() {
	  return rplTime;
	 }

	 public EpfAccount getEpfAccount() {
	  return epfAccount;
	 }

	 public EpfProfile getEpfProfile() {
	  return epfProfile;
	 }

	 // Setter Methods 

	 public void setRefId(String refId) {
	  this.refId = refId;
	 }

	 public void setReqTime(String reqTime) {
	  this.reqTime = reqTime;
	 }

	 public void setRplTime(String rplTime) {
	  this.rplTime = rplTime;
	 }

	 public void setEpfAccount(EpfAccount epfAccount) {
	  this.epfAccount = epfAccount;
	 }

	 public void setEpfProfile(EpfProfile epfProfile) {
	  this.epfProfile = epfProfile;
	 }


		public class EpfAccount {
			 public float totalBalance;
			 public float account1Balance;
			 public float account2Balance;

	         
			 // Getter Methods 

			 public float getTotalBalance() {
			  return totalBalance;
			 }

			 public float getAccount1Balance() {
			  return account1Balance;
			 }

			 public float getAccount2Balance() {
			  return account2Balance;
			 }

			 // Setter Methods 

			 public void setTotalBalance(float totalBalance) {
			  this.totalBalance = totalBalance;
			 }

			 public void setAccount1Balance(float account1Balance) {
			  this.account1Balance = account1Balance;
			 }

			 public void setAccount2Balance(float account2Balance) {
			  this.account2Balance = account2Balance;
			 }
			}


		public class EpfProfile {
			 public String name;
			 public String epfNo;
			 public String idNo;
			 public String passportNo = null;
			 public String dob;
			 public String race;
			 public String religion;
			 public String epfMembershipDate;
			 public String iAkaunMembershipDate;
			 public String iAkaunStatus;


			 // Getter Methods 

			 public String getName() {
			  return name;
			 }

			 public String getEpfNo() {
			  return epfNo;
			 }

			 public String getIdNo() {
			  return idNo;
			 }

			 public String getPassportNo() {
			  return passportNo;
			 }

			 public String getDob() {
			  return dob;
			 }

			 public String getRace() {
			  return race;
			 }

			 public String getReligion() {
			  return religion;
			 }

			 public String getEpfMembershipDate() {
			  return epfMembershipDate;
			 }

			 public String getIAkaunMembershipDate() {
			  return iAkaunMembershipDate;
			 }

			 public String getIAkaunStatus() {
			  return iAkaunStatus;
			 }

			 // Setter Methods 

			 public void setName(String name) {
			  this.name = name;
			 }

			 public void setEpfNo(String epfNo) {
			  this.epfNo = epfNo;
			 }

			 public void setIdNo(String idNo) {
			  this.idNo = idNo;
			 }

			 public void setPassportNo(String passportNo) {
			  this.passportNo = passportNo;
			 }

			 public void setDob(String dob) {
			  this.dob = dob;
			 }

			 public void setRace(String race) {
			  this.race = race;
			 }

			 public void setReligion(String religion) {
			  this.religion = religion;
			 }

			 public void setEpfMembershipDate(String epfMembershipDate) {
			  this.epfMembershipDate = epfMembershipDate;
			 }

			 public void setIAkaunMembershipDate(String iAkaunMembershipDate) {
			  this.iAkaunMembershipDate = iAkaunMembershipDate;
			 }

			 public void setIAkaunStatus(String iAkaunStatus) {
			  this.iAkaunStatus = iAkaunStatus;
			 }
			}




}

	