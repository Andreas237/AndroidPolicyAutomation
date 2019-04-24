// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import com.pactforcure.app.api.dto.*;
import java.util.Date;

// Referenced classes of package com.pactforcure.app.participant:
//			ParticipantSync, Participant

private static class ParticipantSync$ParticipantDtoParser
{

	private static Participant fromDto(User user)
	{
		Participant participant = new Participant();
	//    0    0:new             #19  <Class Participant>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Participant()>
	//    3    7:astore_2        
		user = ((User) (user.getAttributes()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #26  <Method Attributes User.getAttributes()>
	//    6   12:astore_0        
		int i;
		if(((Attributes) (user)).getNumDeliveries() == null)
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #32  <Method Integer Attributes.getNumDeliveries()>
	//*   9   17:ifnonnull       174
			i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_1        
		else
	//*  12   22:aload_2         
	//*  13   23:iload_1         
	//*  14   24:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//*  15   27:invokevirtual   #42  <Method void Participant.setNumDeliveries(Integer)>
	//*  16   30:aload_2         
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #46  <Method String Attributes.getFirstName()>
	//*  19   35:invokevirtual   #50  <Method void Participant.setFirstName(String)>
	//*  20   38:aload_2         
	//*  21   39:aload_0         
	//*  22   40:invokevirtual   #53  <Method String Attributes.getLastName()>
	//*  23   43:invokevirtual   #56  <Method void Participant.setLastName(String)>
	//*  24   46:aload_2         
	//*  25   47:aload_0         
	//*  26   48:invokevirtual   #59  <Method String Attributes.getEmail()>
	//*  27   51:invokevirtual   #62  <Method void Participant.setEmail(String)>
	//*  28   54:aload_2         
	//*  29   55:aload_0         
	//*  30   56:invokevirtual   #65  <Method Integer Attributes.getAge()>
	//*  31   59:invokevirtual   #68  <Method void Participant.setAge(Integer)>
	//*  32   62:aload_2         
	//*  33   63:aload_0         
	//*  34   64:invokevirtual   #71  <Method String Attributes.getRace()>
	//*  35   67:invokevirtual   #74  <Method void Participant.setRace(String)>
	//*  36   70:aload_2         
	//*  37   71:aload_0         
	//*  38   72:invokevirtual   #78  <Method Boolean Attributes.getOptOut()>
	//*  39   75:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//*  40   78:invokevirtual   #88  <Method void Participant.setOptOut(boolean)>
	//*  41   81:aload_2         
	//*  42   82:iconst_1        
	//*  43   83:invokevirtual   #91  <Method void Participant.setRegistered(boolean)>
	//*  44   86:aload_2         
	//*  45   87:iconst_1        
	//*  46   88:invokevirtual   #94  <Method void Participant.setUploaded(boolean)>
	//*  47   91:aload_2         
	//*  48   92:aload_0         
	//*  49   93:invokevirtual   #98  <Method Study Attributes.getStudy()>
	//*  50   96:invokevirtual   #103 <Method String Study.getStudyId()>
	//*  51   99:invokevirtual   #106 <Method void Participant.setStudyId(String)>
	//*  52  102:aload_2         
	//*  53  103:aload_0         
	//*  54  104:invokevirtual   #109 <Method String Attributes.getTelephone()>
	//*  55  107:invokevirtual   #112 <Method void Participant.setTelephone(String)>
	//*  56  110:aload_2         
	//*  57  111:aload_0         
	//*  58  112:invokevirtual   #115 <Method String Attributes.getAddress1()>
	//*  59  115:invokevirtual   #118 <Method void Participant.setAddress1(String)>
	//*  60  118:aload_2         
	//*  61  119:aload_0         
	//*  62  120:invokevirtual   #121 <Method String Attributes.getAddress2()>
	//*  63  123:invokevirtual   #124 <Method void Participant.setAddress2(String)>
	//*  64  126:aload_2         
	//*  65  127:aload_0         
	//*  66  128:invokevirtual   #127 <Method String Attributes.getCity()>
	//*  67  131:invokevirtual   #130 <Method void Participant.setCity(String)>
	//*  68  134:aload_2         
	//*  69  135:aload_0         
	//*  70  136:invokevirtual   #133 <Method String Attributes.getState()>
	//*  71  139:invokevirtual   #136 <Method void Participant.setState(String)>
	//*  72  142:aload_2         
	//*  73  143:aload_0         
	//*  74  144:invokevirtual   #139 <Method String Attributes.getZip()>
	//*  75  147:invokevirtual   #142 <Method void Participant.setZip(String)>
	//*  76  150:aload_2         
	//*  77  151:new             #144 <Class Date>
	//*  78  154:dup             
	//*  79  155:invokespecial   #145 <Method void Date()>
	//*  80  158:invokevirtual   #149 <Method void Participant.setSignedPDF(Date)>
	//*  81  161:aload_2         
	//*  82  162:aload_0         
	//*  83  163:invokevirtual   #152 <Method Boolean Attributes.getDnaRegistered()>
	//*  84  166:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//*  85  169:invokevirtual   #155 <Method void Participant.setDNAregistered(boolean)>
	//*  86  172:aload_2         
	//*  87  173:areturn         
			i = ((Attributes) (user)).getNumDeliveries().intValue();
	//   88  174:aload_0         
	//   89  175:invokevirtual   #32  <Method Integer Attributes.getNumDeliveries()>
	//   90  178:invokevirtual   #159 <Method int Integer.intValue()>
	//   91  181:istore_1        
		participant.setNumDeliveries(Integer.valueOf(i));
		participant.setFirstName(((Attributes) (user)).getFirstName());
		participant.setLastName(((Attributes) (user)).getLastName());
		participant.setEmail(((Attributes) (user)).getEmail());
		participant.setAge(((Attributes) (user)).getAge());
		participant.setRace(((Attributes) (user)).getRace());
		participant.setOptOut(((Attributes) (user)).getOptOut().booleanValue());
		participant.setRegistered(true);
		participant.setUploaded(true);
		participant.setStudyId(((Attributes) (user)).getStudy().getStudyId());
		participant.setTelephone(((Attributes) (user)).getTelephone());
		participant.setAddress1(((Attributes) (user)).getAddress1());
		participant.setAddress2(((Attributes) (user)).getAddress2());
		participant.setCity(((Attributes) (user)).getCity());
		participant.setState(((Attributes) (user)).getState());
		participant.setZip(((Attributes) (user)).getZip());
		participant.setSignedPDF(new Date());
		participant.setDNAregistered(((Attributes) (user)).getDnaRegistered().booleanValue());
		return participant;
	//*  92  182:goto            22
	}


/*
	static Participant access$000(User user)
	{
		return fromDto(user);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Participant fromDto(User)>
	//    2    4:areturn         
	}

*/

	private ParticipantSync$ParticipantDtoParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
