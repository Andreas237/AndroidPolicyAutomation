// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;

import java.util.List;

// Referenced classes of package com.pactforcure.app.api.dto:
//			Study

public class Attributes
{

	public Attributes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		responses = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #56  <Field List responses>
	//    5    9:return          
	}

	public String getAddress1()
	{
		return address1;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String address1>
	//    2    4:areturn         
	}

	public String getAddress2()
	{
		return address2;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String address2>
	//    2    4:areturn         
	}

	public Integer getAge()
	{
		return age;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Integer age>
	//    2    4:areturn         
	}

	public Object getChallenges()
	{
		return challenges;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Object challenges>
	//    2    4:areturn         
	}

	public String getCity()
	{
		return city;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String city>
	//    2    4:areturn         
	}

	public String getConsentAppVersion()
	{
		return consentAppVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String consentAppVersion>
	//    2    4:areturn         
	}

	public String getConsentPDF()
	{
		return consentPDF;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String consentPDF>
	//    2    4:areturn         
	}

	public String getCreated()
	{
		return created;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String created>
	//    2    4:areturn         
	}

	public Object getCredentials()
	{
		return credentials;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Object credentials>
	//    2    4:areturn         
	}

	public String getCustomDemographicData1()
	{
		return customDemographicData1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String customDemographicData1>
	//    2    4:areturn         
	}

	public String getCustomDemographicData2()
	{
		return customDemographicData2;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String customDemographicData2>
	//    2    4:areturn         
	}

	public String getCustomDemographicData3()
	{
		return customDemographicData3;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String customDemographicData3>
	//    2    4:areturn         
	}

	public String getCustomDemographicData4()
	{
		return customDemographicData4;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String customDemographicData4>
	//    2    4:areturn         
	}

	public String getDnaAppVersion()
	{
		return dnaAppVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String dnaAppVersion>
	//    2    4:areturn         
	}

	public String getDnaConsentPDF()
	{
		return dnaConsentPDF;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String dnaConsentPDF>
	//    2    4:areturn         
	}

	public Boolean getDnaEmailSent()
	{
		return dnaEmailSent;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Boolean dnaEmailSent>
	//    2    4:areturn         
	}

	public Boolean getDnaKitCompleted()
	{
		return dnaKitCompleted;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Boolean dnaKitCompleted>
	//    2    4:areturn         
	}

	public Boolean getDnaRegistered()
	{
		return dnaRegistered;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Boolean dnaRegistered>
	//    2    4:areturn         
	}

	public String getEmail()
	{
		return email;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field String email>
	//    2    4:areturn         
	}

	public Boolean getEmailSent()
	{
		return emailSent;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Boolean emailSent>
	//    2    4:areturn         
	}

	public Object getEmailVerified()
	{
		return emailVerified;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field Object emailVerified>
	//    2    4:areturn         
	}

	public Integer getEpdsScore()
	{
		return epdsScore;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Integer epdsScore>
	//    2    4:areturn         
	}

	public String getFirstName()
	{
		return firstName;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field String firstName>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field String fullName>
	//    2    4:areturn         
	}

	public Boolean getInWatchStudy()
	{
		return inWatchStudy;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Boolean inWatchStudy>
	//    2    4:areturn         
	}

	public String getLastLanguage()
	{
		return lastLanguage;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field String lastLanguage>
	//    2    4:areturn         
	}

	public String getLastName()
	{
		return lastName;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field String lastName>
	//    2    4:areturn         
	}

	public Integer getLastTipIndex()
	{
		return lastTipIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field Integer lastTipIndex>
	//    2    4:areturn         
	}

	public String getLastUpdated()
	{
		return lastUpdated;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field String lastUpdated>
	//    2    4:areturn         
	}

	public Integer getNumDeliveries()
	{
		return numDeliveries;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Integer numDeliveries>
	//    2    4:areturn         
	}

	public Boolean getOptOut()
	{
		return optOut;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field Boolean optOut>
	//    2    4:areturn         
	}

	public String getRace()
	{
		return race;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field String race>
	//    2    4:areturn         
	}

	public List getResponses()
	{
		return responses;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List responses>
	//    2    4:areturn         
	}

	public String getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field String state>
	//    2    4:areturn         
	}

	public Boolean getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field Boolean status>
	//    2    4:areturn         
	}

	public Study getStudy()
	{
		return study;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field Study study>
	//    2    4:areturn         
	}

	public String getTelephone()
	{
		return telephone;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field String telephone>
	//    2    4:areturn         
	}

	public String getUsername()
	{
		return username;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field String username>
	//    2    4:areturn         
	}

	public String getZip()
	{
		return zip;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field String zip>
	//    2    4:areturn         
	}

	public void setAddress1(String s)
	{
		address1 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field String address1>
	//    3    5:return          
	}

	public void setAddress2(String s)
	{
		address2 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field String address2>
	//    3    5:return          
	}

	public void setAge(Integer integer)
	{
		age = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field Integer age>
	//    3    5:return          
	}

	public void setChallenges(Object obj)
	{
		challenges = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field Object challenges>
	//    3    5:return          
	}

	public void setCity(String s)
	{
		city = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field String city>
	//    3    5:return          
	}

	public void setConsentAppVersion(String s)
	{
		consentAppVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field String consentAppVersion>
	//    3    5:return          
	}

	public void setConsentPDF(String s)
	{
		consentPDF = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field String consentPDF>
	//    3    5:return          
	}

	public void setCreated(String s)
	{
		created = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field String created>
	//    3    5:return          
	}

	public void setCredentials(Object obj)
	{
		credentials = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field Object credentials>
	//    3    5:return          
	}

	public void setCustomDemographicData1(String s)
	{
		customDemographicData1 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field String customDemographicData1>
	//    3    5:return          
	}

	public void setCustomDemographicData2(String s)
	{
		customDemographicData2 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field String customDemographicData2>
	//    3    5:return          
	}

	public void setCustomDemographicData3(String s)
	{
		customDemographicData3 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field String customDemographicData3>
	//    3    5:return          
	}

	public void setCustomDemographicData4(String s)
	{
		customDemographicData4 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String customDemographicData4>
	//    3    5:return          
	}

	public void setDnaAppVersion(String s)
	{
		dnaAppVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field String dnaAppVersion>
	//    3    5:return          
	}

	public void setDnaConsentPDF(String s)
	{
		dnaConsentPDF = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field String dnaConsentPDF>
	//    3    5:return          
	}

	public void setDnaEmailSent(Boolean boolean1)
	{
		dnaEmailSent = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field Boolean dnaEmailSent>
	//    3    5:return          
	}

	public void setDnaKitCompleted(Boolean boolean1)
	{
		dnaKitCompleted = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field Boolean dnaKitCompleted>
	//    3    5:return          
	}

	public void setDnaRegistered(Boolean boolean1)
	{
		dnaRegistered = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field Boolean dnaRegistered>
	//    3    5:return          
	}

	public void setEmail(String s)
	{
		email = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field String email>
	//    3    5:return          
	}

	public void setEmailSent(Boolean boolean1)
	{
		emailSent = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field Boolean emailSent>
	//    3    5:return          
	}

	public void setEmailVerified(Object obj)
	{
		emailVerified = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field Object emailVerified>
	//    3    5:return          
	}

	public void setEpdsScore(Integer integer)
	{
		epdsScore = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field Integer epdsScore>
	//    3    5:return          
	}

	public void setFirstName(String s)
	{
		firstName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field String firstName>
	//    3    5:return          
	}

	public void setFullName(String s)
	{
		fullName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field String fullName>
	//    3    5:return          
	}

	public void setInWatchStudy(Boolean boolean1)
	{
		inWatchStudy = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field Boolean inWatchStudy>
	//    3    5:return          
	}

	public void setLastLanguage(String s)
	{
		lastLanguage = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #144 <Field String lastLanguage>
	//    3    5:return          
	}

	public void setLastName(String s)
	{
		lastName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field String lastName>
	//    3    5:return          
	}

	public void setLastTipIndex(Integer integer)
	{
		lastTipIndex = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #150 <Field Integer lastTipIndex>
	//    3    5:return          
	}

	public void setLastUpdated(String s)
	{
		lastUpdated = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field String lastUpdated>
	//    3    5:return          
	}

	public void setNumDeliveries(Integer integer)
	{
		numDeliveries = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field Integer numDeliveries>
	//    3    5:return          
	}

	public void setOptOut(Boolean boolean1)
	{
		optOut = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field Boolean optOut>
	//    3    5:return          
	}

	public void setRace(String s)
	{
		race = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field String race>
	//    3    5:return          
	}

	public void setResponses(List list)
	{
		responses = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field List responses>
	//    3    5:return          
	}

	public void setState(String s)
	{
		state = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field String state>
	//    3    5:return          
	}

	public void setStatus(Boolean boolean1)
	{
		status = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field Boolean status>
	//    3    5:return          
	}

	public void setStudy(Study study1)
	{
		study = study1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field Study study>
	//    3    5:return          
	}

	public void setTelephone(String s)
	{
		telephone = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field String telephone>
	//    3    5:return          
	}

	public void setUsername(String s)
	{
		username = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #182 <Field String username>
	//    3    5:return          
	}

	public void setZip(String s)
	{
		zip = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #185 <Field String zip>
	//    3    5:return          
	}

	private String address1;
	private String address2;
	private Integer age;
	private Object challenges;
	private String city;
	private String consentAppVersion;
	private String consentPDF;
	private String created;
	private Object credentials;
	private String customDemographicData1;
	private String customDemographicData2;
	private String customDemographicData3;
	private String customDemographicData4;
	private String dnaAppVersion;
	private String dnaConsentPDF;
	private Boolean dnaEmailSent;
	private Boolean dnaKitCompleted;
	private Boolean dnaRegistered;
	private String email;
	private Boolean emailSent;
	private Object emailVerified;
	private Integer epdsScore;
	private String firstName;
	private String fullName;
	private Boolean inWatchStudy;
	private String lastLanguage;
	private String lastName;
	private Integer lastTipIndex;
	private String lastUpdated;
	private Integer numDeliveries;
	private Boolean optOut;
	private String race;
	private List responses;
	private String state;
	private Boolean status;
	private Study study;
	private String telephone;
	private String username;
	private String zip;
}
