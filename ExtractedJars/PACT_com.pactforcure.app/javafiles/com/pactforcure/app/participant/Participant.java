// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.raizlabs.android.dbflow.structure.BaseModel;
import java.util.Date;
import java.util.Map;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;

public class Participant extends BaseModel
{

	public Participant()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void BaseModel()>
	//    2    4:return          
	}

	public static Participant fromEligibility(TaskResult taskresult)
	{
		Participant participant = new Participant();
	//    0    0:new             #2   <Class Participant>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void Participant()>
	//    3    7:astore_1        
		participant.numDeliveries = Integer.valueOf(0);
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//    7   13:putfield        #50  <Field Integer numDeliveries>
		participant.race = (String)taskresult.getStepResult("eligibilityQRace").getResult();
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:ldc1            #52  <String "eligibilityQRace">
	//   11   20:invokevirtual   #58  <Method StepResult TaskResult.getStepResult(String)>
	//   12   23:invokevirtual   #64  <Method Object StepResult.getResult()>
	//   13   26:checkcast       #66  <Class String>
	//   14   29:putfield        #68  <Field String race>
		participant.age = (Integer)taskresult.getStepResult("eligibilityQ2").getResult();
	//   15   32:aload_1         
	//   16   33:aload_0         
	//   17   34:ldc1            #70  <String "eligibilityQ2">
	//   18   36:invokevirtual   #58  <Method StepResult TaskResult.getStepResult(String)>
	//   19   39:invokevirtual   #64  <Method Object StepResult.getResult()>
	//   20   42:checkcast       #44  <Class Integer>
	//   21   45:putfield        #72  <Field Integer age>
		participant.studyId = Res.getStudyId().name();
	//   22   48:aload_1         
	//   23   49:invokestatic    #78  <Method StudyId Res.getStudyId()>
	//   24   52:invokevirtual   #84  <Method String StudyId.name()>
	//   25   55:putfield        #86  <Field String studyId>
		return participant;
	//   26   58:aload_1         
	//   27   59:areturn         
	}

	public static void updateAddressUsingForm(Participant participant, Map map)
	{
		participant.address1 = (String)map.get("address1");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #89  <String "address1">
	//    3    4:invokeinterface #95  <Method Object Map.get(Object)>
	//    4    9:checkcast       #66  <Class String>
	//    5   12:putfield        #97  <Field String address1>
		participant.address2 = (String)map.get("address2");
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #98  <String "address2">
	//    9   19:invokeinterface #95  <Method Object Map.get(Object)>
	//   10   24:checkcast       #66  <Class String>
	//   11   27:putfield        #100 <Field String address2>
		participant.city = (String)map.get("city");
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #101 <String "city">
	//   15   34:invokeinterface #95  <Method Object Map.get(Object)>
	//   16   39:checkcast       #66  <Class String>
	//   17   42:putfield        #103 <Field String city>
		participant.state = (String)map.get("state");
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #104 <String "state">
	//   21   49:invokeinterface #95  <Method Object Map.get(Object)>
	//   22   54:checkcast       #66  <Class String>
	//   23   57:putfield        #106 <Field String state>
		participant.zip = (String)map.get("zip");
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #107 <String "zip">
	//   27   64:invokeinterface #95  <Method Object Map.get(Object)>
	//   28   69:checkcast       #66  <Class String>
	//   29   72:putfield        #109 <Field String zip>
	//   30   75:return          
	}

	public static void updateWithDataFromRegistrationForm(Participant participant, Map map)
	{
		participant.activeStatus = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #114 <Field boolean activeStatus>
		participant.optOut = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #116 <Field boolean optOut>
		participant.firstName = (String)map.get("firstName");
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:ldc1            #117 <String "firstName">
	//    9   14:invokeinterface #95  <Method Object Map.get(Object)>
	//   10   19:checkcast       #66  <Class String>
	//   11   22:putfield        #119 <Field String firstName>
		participant.lastName = (String)map.get("lastName");
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:ldc1            #120 <String "lastName">
	//   15   29:invokeinterface #95  <Method Object Map.get(Object)>
	//   16   34:checkcast       #66  <Class String>
	//   17   37:putfield        #122 <Field String lastName>
		participant.telephone = (String)map.get("phone");
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:ldc1            #124 <String "phone">
	//   21   44:invokeinterface #95  <Method Object Map.get(Object)>
	//   22   49:checkcast       #66  <Class String>
	//   23   52:putfield        #126 <Field String telephone>
		participant.email = (String)map.get("email");
	//   24   55:aload_0         
	//   25   56:aload_1         
	//   26   57:ldc1            #127 <String "email">
	//   27   59:invokeinterface #95  <Method Object Map.get(Object)>
	//   28   64:checkcast       #66  <Class String>
	//   29   67:putfield        #129 <Field String email>
	//   30   70:return          
	}

	public String buildName()
	{
		return (new StringBuilder()).append(firstName).append(" ").append(lastName).toString();
	//    0    0:new             #132 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #133 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field String firstName>
	//    5   11:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #139 <String " ">
	//    7   16:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #122 <Field String lastName>
	//   10   23:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	public String getAddress1()
	{
		return address1;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String address1>
	//    2    4:areturn         
	}

	public String getAddress2()
	{
		return address2;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String address2>
	//    2    4:areturn         
	}

	public Integer getAge()
	{
		return age;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Integer age>
	//    2    4:areturn         
	}

	public String getBase64Signature()
	{
		return base64Signature;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field String base64Signature>
	//    2    4:areturn         
	}

	public String getCity()
	{
		return city;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String city>
	//    2    4:areturn         
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field String code>
	//    2    4:areturn         
	}

	public String getDnaBase64Signature()
	{
		return dnaBase64Signature;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String dnaBase64Signature>
	//    2    4:areturn         
	}

	public String getEmail()
	{
		return email;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field String email>
	//    2    4:areturn         
	}

	public String getFirstName()
	{
		return firstName;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field String firstName>
	//    2    4:areturn         
	}

	public long getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field long id>
	//    2    4:lreturn         
	}

	public String getLastName()
	{
		return lastName;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field String lastName>
	//    2    4:areturn         
	}

	public Integer getNumDeliveries()
	{
		return numDeliveries;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Integer numDeliveries>
	//    2    4:areturn         
	}

	public String getRace()
	{
		return race;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String race>
	//    2    4:areturn         
	}

	public Date getSignedDNAPDF()
	{
		return signedDNAPDF;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field Date signedDNAPDF>
	//    2    4:areturn         
	}

	public Date getSignedPDF()
	{
		return signedPDF;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field Date signedPDF>
	//    2    4:areturn         
	}

	public String getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String state>
	//    2    4:areturn         
	}

	public String getStudyId()
	{
		return studyId;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String studyId>
	//    2    4:areturn         
	}

	public String getTelephone()
	{
		return telephone;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field String telephone>
	//    2    4:areturn         
	}

	public String getZip()
	{
		return zip;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String zip>
	//    2    4:areturn         
	}

	public boolean isActiveStatus()
	{
		return activeStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean activeStatus>
	//    2    4:ireturn         
	}

	public boolean isDNAregistered()
	{
		return DNAregistered;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field boolean DNAregistered>
	//    2    4:ireturn         
	}

	public boolean isInWatchStudy()
	{
		return inWatchStudy;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field boolean inWatchStudy>
	//    2    4:ireturn         
	}

	public boolean isOptOut()
	{
		return optOut;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field boolean optOut>
	//    2    4:ireturn         
	}

	public boolean isRegistered()
	{
		return registered;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field boolean registered>
	//    2    4:ireturn         
	}

	public boolean isUploaded()
	{
		return isUploaded;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field boolean isUploaded>
	//    2    4:ireturn         
	}

	public void setActiveStatus(boolean flag)
	{
		activeStatus = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field boolean activeStatus>
	//    3    5:return          
	}

	public void setAddress1(String s)
	{
		address1 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field String address1>
	//    3    5:return          
	}

	public void setAddress2(String s)
	{
		address2 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field String address2>
	//    3    5:return          
	}

	public void setAge(Integer integer)
	{
		age = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field Integer age>
	//    3    5:return          
	}

	public void setBase64Signature(String s)
	{
		base64Signature = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field String base64Signature>
	//    3    5:return          
	}

	public void setCity(String s)
	{
		city = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field String city>
	//    3    5:return          
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field String code>
	//    3    5:return          
	}

	public void setDNAregistered(boolean flag)
	{
		DNAregistered = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #180 <Field boolean DNAregistered>
	//    3    5:return          
	}

	public void setDnaBase64Signature(String s)
	{
		dnaBase64Signature = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field String dnaBase64Signature>
	//    3    5:return          
	}

	public void setEmail(String s)
	{
		email = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field String email>
	//    3    5:return          
	}

	public void setFirstName(String s)
	{
		firstName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field String firstName>
	//    3    5:return          
	}

	public void setId(int i)
	{
		id = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:putfield        #162 <Field long id>
	//    4    6:return          
	}

	public void setInWatchStudy(boolean flag)
	{
		inWatchStudy = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #183 <Field boolean inWatchStudy>
	//    3    5:return          
	}

	public void setLastName(String s)
	{
		lastName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field String lastName>
	//    3    5:return          
	}

	public void setNumDeliveries(Integer integer)
	{
		numDeliveries = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field Integer numDeliveries>
	//    3    5:return          
	}

	public void setOptOut(boolean flag)
	{
		optOut = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field boolean optOut>
	//    3    5:return          
	}

	public void setRace(String s)
	{
		race = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field String race>
	//    3    5:return          
	}

	public void setRegistered(boolean flag)
	{
		registered = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #187 <Field boolean registered>
	//    3    5:return          
	}

	public void setSignedDNAPDF(Date date)
	{
		signedDNAPDF = date;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field Date signedDNAPDF>
	//    3    5:return          
	}

	public void setSignedPDF(Date date)
	{
		signedPDF = date;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field Date signedPDF>
	//    3    5:return          
	}

	public void setState(String s)
	{
		state = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field String state>
	//    3    5:return          
	}

	public void setStudyId(String s)
	{
		studyId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field String studyId>
	//    3    5:return          
	}

	public void setTelephone(String s)
	{
		telephone = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field String telephone>
	//    3    5:return          
	}

	public void setUploaded(boolean flag)
	{
		isUploaded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field boolean isUploaded>
	//    3    5:return          
	}

	public void setZip(String s)
	{
		zip = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field String zip>
	//    3    5:return          
	}

	boolean DNAregistered;
	boolean activeStatus;
	String address1;
	String address2;
	Integer age;
	String base64Signature;
	String city;
	String code;
	String dnaBase64Signature;
	String email;
	String firstName;
	long id;
	boolean inWatchStudy;
	boolean isUploaded;
	String lastName;
	Integer numDeliveries;
	boolean optOut;
	String race;
	boolean registered;
	Date signedDNAPDF;
	Date signedPDF;
	String state;
	String studyId;
	String telephone;
	String zip;
}
