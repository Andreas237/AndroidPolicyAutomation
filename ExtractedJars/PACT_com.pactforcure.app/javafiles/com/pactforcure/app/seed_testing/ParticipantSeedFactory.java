// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.seed_testing;

import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.survey.Answer;
import java.util.*;

public class ParticipantSeedFactory
{

	public ParticipantSeedFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Map answerMapFromSurveyAnswersLog(String as[], String s, String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #14  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void HashMap()>
	//    3    7:astore          5
		int j = as.length;
	//    4    9:aload_0         
	//    5   10:arraylength     
	//    6   11:istore          4
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_3        
	//*   9   15:iload_3         
	//*  10   16:iload           4
	//*  11   18:icmpge          136
		{
			String as1[] = as[i].split("\\|");
	//   12   21:aload_0         
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:ldc1            #17  <String "\\|">
	//   16   26:invokevirtual   #23  <Method String[] String.split(String)>
	//   17   29:astore          9
			Date date = new Date(Long.valueOf(as1[0]).longValue());
	//   18   31:new             #25  <Class Date>
	//   19   34:dup             
	//   20   35:aload           9
	//   21   37:iconst_0        
	//   22   38:aaload          
	//   23   39:invokestatic    #31  <Method Long Long.valueOf(String)>
	//   24   42:invokevirtual   #35  <Method long Long.longValue()>
	//   25   45:invokespecial   #38  <Method void Date(long)>
	//   26   48:astore          6
			String s2 = as1[1];
	//   27   50:aload           9
	//   28   52:iconst_1        
	//   29   53:aaload          
	//   30   54:astore          7
			String s3 = as1[2];
	//   31   56:aload           9
	//   32   58:iconst_2        
	//   33   59:aaload          
	//   34   60:astore          8
			String s4 = as1[3];
	//   35   62:aload           9
	//   36   64:iconst_3        
	//   37   65:aaload          
	//   38   66:astore          9
			Answer answer = new Answer();
	//   39   68:new             #40  <Class Answer>
	//   40   71:dup             
	//   41   72:invokespecial   #41  <Method void Answer()>
	//   42   75:astore          10
			answer.setStudyId(s);
	//   43   77:aload           10
	//   44   79:aload_1         
	//   45   80:invokevirtual   #45  <Method void Answer.setStudyId(String)>
			answer.setSurveyCode(s1);
	//   46   83:aload           10
	//   47   85:aload_2         
	//   48   86:invokevirtual   #48  <Method void Answer.setSurveyCode(String)>
			answer.setDateAdded(date);
	//   49   89:aload           10
	//   50   91:aload           6
	//   51   93:invokevirtual   #52  <Method void Answer.setDateAdded(Date)>
			answer.setFormattedValue(s2);
	//   52   96:aload           10
	//   53   98:aload           7
	//   54  100:invokevirtual   #55  <Method void Answer.setFormattedValue(String)>
			answer.setQuestionCode(s3);
	//   55  103:aload           10
	//   56  105:aload           8
	//   57  107:invokevirtual   #58  <Method void Answer.setQuestionCode(String)>
			answer.setValue(s4);
	//   58  110:aload           10
	//   59  112:aload           9
	//   60  114:invokevirtual   #61  <Method void Answer.setValue(String)>
			((Map) (hashmap)).put(((Object) (s3)), ((Object) (answer)));
	//   61  117:aload           5
	//   62  119:aload           8
	//   63  121:aload           10
	//   64  123:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   65  128:pop             
		}

	//   66  129:iload_3         
	//   67  130:iconst_1        
	//   68  131:iadd            
	//   69  132:istore_3        
	//*  70  133:goto            15
		return ((Map) (hashmap));
	//   71  136:aload           5
	//   72  138:areturn         
	}

	public static Map seedBimfAnswers(String s)
	{
		return answerMapFromSurveyAnswersLog(new String[] {
			"1490220650177|somewhat agree|BIMF19|somewhat agree", "1490220642077|somewhat disagree|BIMF12|somewhat disagree", "1490220640070|somewhat agree|BIMF11|somewhat agree", "1490220629127|disagree|BIMF2|disagree", "1490220643274|neutral|BIMF13|neutral", "1490220638998|agree|BIMF10|agree", "1490220633695|agree|BIMF6|agree", "1490220635085|somewhat agree|BIMF7|somewhat agree", "1490220645625|somewhat disagree|BIMF15|somewhat disagree", "1490220630306|somewhat disagree|BIMF3|somewhat disagree", 
			"1490220637859|somewhat agree|BIMF9|somewhat agree", "1490220651254|somewhat agree|BIMF20|somewhat agree", "1490220647842|neutral|BIMF17|neutral", "1490220627089|somewhat disagree|BIMF1|somewhat disagree", "1490220644465|neutral|BIMF14|neutral", "1490220632698|somewhat agree|BIMF5|somewhat agree", "1490220636673|agree|BIMF8|agree", "1490220631477|somewhat disagree|BIMF4|somewhat disagree", "1490220649065|somewhat agree|BIMF18|somewhat agree", "1490220646747|somewhat disagree|BIMF16|somewhat disagree"
		}, s, "HealthEconomics-BIMF");
	//    0    0:bipush          20
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #74  <String "1490220650177|somewhat agree|BIMF19|somewhat agree">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #76  <String "1490220642077|somewhat disagree|BIMF12|somewhat disagree">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #78  <String "1490220640070|somewhat agree|BIMF11|somewhat agree">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #80  <String "1490220629127|disagree|BIMF2|disagree">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #82  <String "1490220643274|neutral|BIMF13|neutral">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #84  <String "1490220638998|agree|BIMF10|agree">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #86  <String "1490220633695|agree|BIMF6|agree">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #88  <String "1490220635085|somewhat agree|BIMF7|somewhat agree">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #90  <String "1490220645625|somewhat disagree|BIMF15|somewhat disagree">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #92  <String "1490220630306|somewhat disagree|BIMF3|somewhat disagree">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #94  <String "1490220637859|somewhat agree|BIMF9|somewhat agree">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #96  <String "1490220651254|somewhat agree|BIMF20|somewhat agree">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #98  <String "1490220647842|neutral|BIMF17|neutral">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #100 <String "1490220627089|somewhat disagree|BIMF1|somewhat disagree">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #102 <String "1490220644465|neutral|BIMF14|neutral">
	//   61   88:aastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #104 <String "1490220632698|somewhat agree|BIMF5|somewhat agree">
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #106 <String "1490220636673|agree|BIMF8|agree">
	//   69  100:aastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #108 <String "1490220631477|somewhat disagree|BIMF4|somewhat disagree">
	//   73  106:aastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #110 <String "1490220649065|somewhat agree|BIMF18|somewhat agree">
	//   77  112:aastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #112 <String "1490220646747|somewhat disagree|BIMF16|somewhat disagree">
	//   81  118:aastore         
	//   82  119:aload_0         
	//   83  120:ldc1            #114 <String "HealthEconomics-BIMF">
	//   84  122:invokestatic    #116 <Method Map answerMapFromSurveyAnswersLog(String[], String, String)>
	//   85  125:areturn         
	}

	public static Map seedHrpqAnswers(String s)
	{
		return answerMapFromSurveyAnswersLog(new String[] {
			"1490392045188|yes|HRPQ3a|yes", "1490392039779|employed part-time|HRPQ1|employed part-time", "1490392058577|3|HRPQ3b|3", "1490392043174|20|HRPQ2|20", "1490454690709|100|HRPQ4|100"
		}, s, "HealthEconomics-HRPQ");
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #120 <String "1490392045188|yes|HRPQ3a|yes">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #122 <String "1490392039779|employed part-time|HRPQ1|employed part-time">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #124 <String "1490392058577|3|HRPQ3b|3">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #126 <String "1490392043174|20|HRPQ2|20">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #128 <String "1490454690709|100|HRPQ4|100">
	//   21   28:aastore         
	//   22   29:aload_0         
	//   23   30:ldc1            #130 <String "HealthEconomics-HRPQ">
	//   24   32:invokestatic    #116 <Method Map answerMapFromSurveyAnswersLog(String[], String, String)>
	//   25   35:areturn         
	}

	public static Map seedHruqAnswers(String s)
	{
		return answerMapFromSurveyAnswersLog(new String[] {
			"1490297317844|1|HRUQ3c|1", "1490297313158|2|HRUQ2d|2", "1490297309840|1|HRUQ2b|1", "1490297319567|1|HRUQ3d|1", "1490297320842|yes|HRUQ4a|yes", "1490297334398|1|HRUQ5d|1", "1490297322465|1|HRUQ4b|1", "1490297308318|yes|HRUQ2a|yes", "1490297330109|2|HRUQ5b|2", "1490297326983|1|HRUQ4d|1", 
			"1490297314350|yes|HRUQ3a|yes", "1490297316021|1|HRUQ3b|1", "1490297305013|1|HRUQ1c|1", "1490297336565|2|HRUQ6a|2", "1490297303107|4|HRUQ1b|4", "1490297301174|yes|HRUQ1a|yes", "1490297331735|1|HRUQ5c|1", "1490297324857|1|HRUQ4c|1", "1490297311438|3|HRUQ2c|3", "1490297328314|yes|HRUQ5a|yes", 
			"1490297306801|2|HRUQ1d|2"
		}, s, "HealthEconomics-HRUQ");
	//    0    0:bipush          21
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #133 <String "1490297317844|1|HRUQ3c|1">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #135 <String "1490297313158|2|HRUQ2d|2">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #137 <String "1490297309840|1|HRUQ2b|1">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #139 <String "1490297319567|1|HRUQ3d|1">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #141 <String "1490297320842|yes|HRUQ4a|yes">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #143 <String "1490297334398|1|HRUQ5d|1">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #145 <String "1490297322465|1|HRUQ4b|1">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #147 <String "1490297308318|yes|HRUQ2a|yes">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #149 <String "1490297330109|2|HRUQ5b|2">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #151 <String "1490297326983|1|HRUQ4d|1">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #153 <String "1490297314350|yes|HRUQ3a|yes">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #155 <String "1490297316021|1|HRUQ3b|1">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #157 <String "1490297305013|1|HRUQ1c|1">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #159 <String "1490297336565|2|HRUQ6a|2">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #161 <String "1490297303107|4|HRUQ1b|4">
	//   61   88:aastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #163 <String "1490297301174|yes|HRUQ1a|yes">
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #165 <String "1490297331735|1|HRUQ5c|1">
	//   69  100:aastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #167 <String "1490297324857|1|HRUQ4c|1">
	//   73  106:aastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #169 <String "1490297311438|3|HRUQ2c|3">
	//   77  112:aastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #171 <String "1490297328314|yes|HRUQ5a|yes">
	//   81  118:aastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #173 <String "1490297306801|2|HRUQ1d|2">
	//   85  124:aastore         
	//   86  125:aload_0         
	//   87  126:ldc1            #175 <String "HealthEconomics-HRUQ">
	//   88  128:invokestatic    #116 <Method Map answerMapFromSurveyAnswersLog(String[], String, String)>
	//   89  131:areturn         
	}

	public static Participant seedParticipant()
	{
		Participant participant = new Participant();
	//    0    0:new             #179 <Class Participant>
	//    1    3:dup             
	//    2    4:invokespecial   #180 <Method void Participant()>
	//    3    7:astore_0        
		participant.setNumDeliveries(Integer.valueOf(1));
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//    7   13:invokevirtual   #189 <Method void Participant.setNumDeliveries(Integer)>
		participant.setFirstName("Mary");
	//    8   16:aload_0         
	//    9   17:ldc1            #191 <String "Mary">
	//   10   19:invokevirtual   #194 <Method void Participant.setFirstName(String)>
		participant.setLastName("Ann");
	//   11   22:aload_0         
	//   12   23:ldc1            #196 <String "Ann">
	//   13   25:invokevirtual   #199 <Method void Participant.setLastName(String)>
		participant.setRace("white");
	//   14   28:aload_0         
	//   15   29:ldc1            #201 <String "white">
	//   16   31:invokevirtual   #204 <Method void Participant.setRace(String)>
		participant.setStudyId("US");
	//   17   34:aload_0         
	//   18   35:ldc1            #206 <String "US">
	//   19   37:invokevirtual   #207 <Method void Participant.setStudyId(String)>
		participant.setTelephone("894632");
	//   20   40:aload_0         
	//   21   41:ldc1            #209 <String "894632">
	//   22   43:invokevirtual   #212 <Method void Participant.setTelephone(String)>
		participant.setEmail("alala@lala.com");
	//   23   46:aload_0         
	//   24   47:ldc1            #214 <String "alala@lala.com">
	//   25   49:invokevirtual   #217 <Method void Participant.setEmail(String)>
		participant.setAddress1("Street 1");
	//   26   52:aload_0         
	//   27   53:ldc1            #219 <String "Street 1">
	//   28   55:invokevirtual   #222 <Method void Participant.setAddress1(String)>
		participant.setAddress2("Ap 874");
	//   29   58:aload_0         
	//   30   59:ldc1            #224 <String "Ap 874">
	//   31   61:invokevirtual   #227 <Method void Participant.setAddress2(String)>
		participant.setCity("Cityax");
	//   32   64:aload_0         
	//   33   65:ldc1            #229 <String "Cityax">
	//   34   67:invokevirtual   #232 <Method void Participant.setCity(String)>
		participant.setState("QLD");
	//   35   70:aload_0         
	//   36   71:ldc1            #234 <String "QLD">
	//   37   73:invokevirtual   #237 <Method void Participant.setState(String)>
		participant.setZip("74123");
	//   38   76:aload_0         
	//   39   77:ldc1            #239 <String "74123">
	//   40   79:invokevirtual   #242 <Method void Participant.setZip(String)>
		participant.setSignedPDF(new Date());
	//   41   82:aload_0         
	//   42   83:new             #25  <Class Date>
	//   43   86:dup             
	//   44   87:invokespecial   #243 <Method void Date()>
	//   45   90:invokevirtual   #246 <Method void Participant.setSignedPDF(Date)>
		participant.setAge(Integer.valueOf(27));
	//   46   93:aload_0         
	//   47   94:bipush          27
	//   48   96:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//   49   99:invokevirtual   #249 <Method void Participant.setAge(Integer)>
		return participant;
	//   50  102:aload_0         
	//   51  103:areturn         
	}

	public static Map seedPpdAnswers(String s)
	{
		return answerMapFromSurveyAnswersLog(new String[] {
			"1486158225364|1|ppdE1|1", "1486158226724|no|ppdE2a|no", "1486158227896|no|ppdE3|no", "1486158229118|no|EPDS01a|0", "1486158229119|1st|EPDS02|1", "1486158233552|26 years|EPDS04|26", "1486158235009|no|EPDS04b|0", "1486159210242|0-4 weeks after this delivery|EPDS05|zeroToFourWeeks", "1486159212927|1-3 months|EPDS06|oneToThreeMonths", "1486159214739|never|EPDS07|never", 
			"1486159215622|never|EPDS08|never", "1486159216467|never|EPDS09|never", "1486159219428|never|EPDS10|never", "1486159231409|never|EPDS11|never", "1486159232179|never|EPDS12|never", "1486159232864|never|EPDS13|never", "1486159233519|never|EPDS14|never", "1486159236862|never|EPDS15|never", "1486159237674|never|EPDS16|never", "1486159238487|never|EPDS17|never", 
			"1486159240445|no|EPDS18|0", "1486159241145|no|EPDS19|0", "1486159241857|no|EPDS20|0", "1486159241858|no|EPDS21|0", "1486159241859|no|EPDS22|0", "1486159241860|no|EPDS23|0", "1486159241861|no|PP1|1", "1486159244988|no|PP2|1", "1486159246953|no|PP3|1", "1486159247882|no|PP4|1"
		}, s, "PPD");
	//    0    0:bipush          30
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #252 <String "1486158225364|1|ppdE1|1">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #254 <String "1486158226724|no|ppdE2a|no">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc2            #256 <String "1486158227896|no|ppdE3|no">
	//   13   20:aastore         
	//   14   21:dup             
	//   15   22:iconst_3        
	//   16   23:ldc2            #258 <String "1486158229118|no|EPDS01a|0">
	//   17   26:aastore         
	//   18   27:dup             
	//   19   28:iconst_4        
	//   20   29:ldc2            #260 <String "1486158229119|1st|EPDS02|1">
	//   21   32:aastore         
	//   22   33:dup             
	//   23   34:iconst_5        
	//   24   35:ldc2            #262 <String "1486158233552|26 years|EPDS04|26">
	//   25   38:aastore         
	//   26   39:dup             
	//   27   40:bipush          6
	//   28   42:ldc2            #264 <String "1486158235009|no|EPDS04b|0">
	//   29   45:aastore         
	//   30   46:dup             
	//   31   47:bipush          7
	//   32   49:ldc2            #266 <String "1486159210242|0-4 weeks after this delivery|EPDS05|zeroToFourWeeks">
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:bipush          8
	//   36   56:ldc2            #268 <String "1486159212927|1-3 months|EPDS06|oneToThreeMonths">
	//   37   59:aastore         
	//   38   60:dup             
	//   39   61:bipush          9
	//   40   63:ldc2            #270 <String "1486159214739|never|EPDS07|never">
	//   41   66:aastore         
	//   42   67:dup             
	//   43   68:bipush          10
	//   44   70:ldc2            #272 <String "1486159215622|never|EPDS08|never">
	//   45   73:aastore         
	//   46   74:dup             
	//   47   75:bipush          11
	//   48   77:ldc2            #274 <String "1486159216467|never|EPDS09|never">
	//   49   80:aastore         
	//   50   81:dup             
	//   51   82:bipush          12
	//   52   84:ldc2            #276 <String "1486159219428|never|EPDS10|never">
	//   53   87:aastore         
	//   54   88:dup             
	//   55   89:bipush          13
	//   56   91:ldc2            #278 <String "1486159231409|never|EPDS11|never">
	//   57   94:aastore         
	//   58   95:dup             
	//   59   96:bipush          14
	//   60   98:ldc2            #280 <String "1486159232179|never|EPDS12|never">
	//   61  101:aastore         
	//   62  102:dup             
	//   63  103:bipush          15
	//   64  105:ldc2            #282 <String "1486159232864|never|EPDS13|never">
	//   65  108:aastore         
	//   66  109:dup             
	//   67  110:bipush          16
	//   68  112:ldc2            #284 <String "1486159233519|never|EPDS14|never">
	//   69  115:aastore         
	//   70  116:dup             
	//   71  117:bipush          17
	//   72  119:ldc2            #286 <String "1486159236862|never|EPDS15|never">
	//   73  122:aastore         
	//   74  123:dup             
	//   75  124:bipush          18
	//   76  126:ldc2            #288 <String "1486159237674|never|EPDS16|never">
	//   77  129:aastore         
	//   78  130:dup             
	//   79  131:bipush          19
	//   80  133:ldc2            #290 <String "1486159238487|never|EPDS17|never">
	//   81  136:aastore         
	//   82  137:dup             
	//   83  138:bipush          20
	//   84  140:ldc2            #292 <String "1486159240445|no|EPDS18|0">
	//   85  143:aastore         
	//   86  144:dup             
	//   87  145:bipush          21
	//   88  147:ldc2            #294 <String "1486159241145|no|EPDS19|0">
	//   89  150:aastore         
	//   90  151:dup             
	//   91  152:bipush          22
	//   92  154:ldc2            #296 <String "1486159241857|no|EPDS20|0">
	//   93  157:aastore         
	//   94  158:dup             
	//   95  159:bipush          23
	//   96  161:ldc2            #298 <String "1486159241858|no|EPDS21|0">
	//   97  164:aastore         
	//   98  165:dup             
	//   99  166:bipush          24
	//  100  168:ldc2            #300 <String "1486159241859|no|EPDS22|0">
	//  101  171:aastore         
	//  102  172:dup             
	//  103  173:bipush          25
	//  104  175:ldc2            #302 <String "1486159241860|no|EPDS23|0">
	//  105  178:aastore         
	//  106  179:dup             
	//  107  180:bipush          26
	//  108  182:ldc2            #304 <String "1486159241861|no|PP1|1">
	//  109  185:aastore         
	//  110  186:dup             
	//  111  187:bipush          27
	//  112  189:ldc2            #306 <String "1486159244988|no|PP2|1">
	//  113  192:aastore         
	//  114  193:dup             
	//  115  194:bipush          28
	//  116  196:ldc2            #308 <String "1486159246953|no|PP3|1">
	//  117  199:aastore         
	//  118  200:dup             
	//  119  201:bipush          29
	//  120  203:ldc2            #310 <String "1486159247882|no|PP4|1">
	//  121  206:aastore         
	//  122  207:aload_0         
	//  123  208:ldc2            #312 <String "PPD">
	//  124  211:invokestatic    #116 <Method Map answerMapFromSurveyAnswersLog(String[], String, String)>
	//  125  214:areturn         
	}

	public static Map seedSf12Answers(String s)
	{
		return answerMapFromSurveyAnswersLog(new String[] {
			"1490200110930|quite a bit|SFHS8|quite a bit", "1490200108539|most of the time|SFHS6|most of the time", "1490200109772|most of the time|SFHS7|most of the time", "1490200102477|good|SFHS1|good", "1490200115577|some of the time|SFHS12|some of the time", "1490200112109|some of the time|SFHS9|some of the time", "1490200107335|most of the time|SFHS5|most of the time", "1490200114369|some of the time|SFHS11|some of the time", "1490200104946|not limited at all|SFHS3|not limited at all", "1490200113206|some of the time|SFHS10|some of the time", 
			"1490200106071|most of the time|SFHS4|most of the time", "1490200103639|limited a little|SFHS2|limited a little"
		}, s, "HealthEconomics-SF12");
	//    0    0:bipush          12
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc2            #315 <String "1490200110930|quite a bit|SFHS8|quite a bit">
	//    5   10:aastore         
	//    6   11:dup             
	//    7   12:iconst_1        
	//    8   13:ldc2            #317 <String "1490200108539|most of the time|SFHS6|most of the time">
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_2        
	//   12   19:ldc2            #319 <String "1490200109772|most of the time|SFHS7|most of the time">
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_3        
	//   16   25:ldc2            #321 <String "1490200102477|good|SFHS1|good">
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_4        
	//   20   31:ldc2            #323 <String "1490200115577|some of the time|SFHS12|some of the time">
	//   21   34:aastore         
	//   22   35:dup             
	//   23   36:iconst_5        
	//   24   37:ldc2            #325 <String "1490200112109|some of the time|SFHS9|some of the time">
	//   25   40:aastore         
	//   26   41:dup             
	//   27   42:bipush          6
	//   28   44:ldc2            #327 <String "1490200107335|most of the time|SFHS5|most of the time">
	//   29   47:aastore         
	//   30   48:dup             
	//   31   49:bipush          7
	//   32   51:ldc2            #329 <String "1490200114369|some of the time|SFHS11|some of the time">
	//   33   54:aastore         
	//   34   55:dup             
	//   35   56:bipush          8
	//   36   58:ldc2            #331 <String "1490200104946|not limited at all|SFHS3|not limited at all">
	//   37   61:aastore         
	//   38   62:dup             
	//   39   63:bipush          9
	//   40   65:ldc2            #333 <String "1490200113206|some of the time|SFHS10|some of the time">
	//   41   68:aastore         
	//   42   69:dup             
	//   43   70:bipush          10
	//   44   72:ldc2            #335 <String "1490200106071|most of the time|SFHS4|most of the time">
	//   45   75:aastore         
	//   46   76:dup             
	//   47   77:bipush          11
	//   48   79:ldc2            #337 <String "1490200103639|limited a little|SFHS2|limited a little">
	//   49   82:aastore         
	//   50   83:aload_0         
	//   51   84:ldc2            #339 <String "HealthEconomics-SF12">
	//   52   87:invokestatic    #116 <Method Map answerMapFromSurveyAnswersLog(String[], String, String)>
	//   53   90:areturn         
	}
}
