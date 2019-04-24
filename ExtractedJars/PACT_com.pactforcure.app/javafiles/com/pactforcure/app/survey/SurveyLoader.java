// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.pactforcure.app.studies.Res;
import com.pactforcure.app.util.FileUtils;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Referenced classes of package com.pactforcure.app.survey:
//			SurveyParsingException, Survey, QuestionParser

public class SurveyLoader
{

	public SurveyLoader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Survey fromJson(int i)
		throws ParseException, SurveyParsingException
	{
		Object obj;
		Object obj1;
		obj = ((Object) (new JSONParser()));
	//    0    0:new             #18  <Class JSONParser>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void JSONParser()>
	//    3    7:astore_1        
		obj1 = ((Object) (FileUtils.rawResToString(i)));
	//    4    8:iload_0         
	//    5    9:invokestatic    #25  <Method String FileUtils.rawResToString(int)>
	//    6   12:astore_2        
		obj1 = ((Object) ((JSONObject)((JSONParser) (obj)).parse(((String) (obj1)))));
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #29  <Method Object JSONParser.parse(String)>
	//   10   18:checkcast       #31  <Class JSONObject>
	//   11   21:astore_2        
		obj = ((Object) (new Survey()));
	//   12   22:new             #33  <Class Survey>
	//   13   25:dup             
	//   14   26:invokespecial   #34  <Method void Survey()>
	//   15   29:astore_1        
		Object obj2 = ((JSONObject) (obj1)).get("name");
	//   16   30:aload_2         
	//   17   31:ldc1            #36  <String "name">
	//   18   33:invokevirtual   #40  <Method Object JSONObject.get(Object)>
	//   19   36:astore_3        
		if(obj2 instanceof String)
	//*  20   37:aload_3         
	//*  21   38:instanceof      #42  <Class String>
	//*  22   41:ifeq            189
		{
			((Survey) (obj)).setName((String)obj2);
	//   23   44:aload_1         
	//   24   45:aload_3         
	//   25   46:checkcast       #42  <Class String>
	//   26   49:invokevirtual   #46  <Method void Survey.setName(String)>
			obj2 = ((JSONObject) (obj1)).get("code");
	//   27   52:aload_2         
	//   28   53:ldc1            #48  <String "code">
	//   29   55:invokevirtual   #40  <Method Object JSONObject.get(Object)>
	//   30   58:astore_3        
			if(obj2 instanceof String)
	//*  31   59:aload_3         
	//*  32   60:instanceof      #42  <Class String>
	//*  33   63:ifeq            199
			{
				((Survey) (obj)).setCode((String)obj2);
	//   34   66:aload_1         
	//   35   67:aload_3         
	//   36   68:checkcast       #42  <Class String>
	//   37   71:invokevirtual   #51  <Method void Survey.setCode(String)>
				obj2 = ((JSONObject) (obj1)).get("estimateString");
	//   38   74:aload_2         
	//   39   75:ldc1            #53  <String "estimateString">
	//   40   77:invokevirtual   #40  <Method Object JSONObject.get(Object)>
	//   41   80:astore_3        
				if(obj2 instanceof String)
	//*  42   81:aload_3         
	//*  43   82:instanceof      #42  <Class String>
	//*  44   85:ifeq            96
					((Survey) (obj)).setEstimateString((String)obj2);
	//   45   88:aload_1         
	//   46   89:aload_3         
	//   47   90:checkcast       #42  <Class String>
	//   48   93:invokevirtual   #56  <Method void Survey.setEstimateString(String)>
				obj2 = ((JSONObject) (obj1)).get("order");
	//   49   96:aload_2         
	//   50   97:ldc1            #58  <String "order">
	//   51   99:invokevirtual   #40  <Method Object JSONObject.get(Object)>
	//   52  102:astore_3        
				if(obj2 instanceof Long)
	//*  53  103:aload_3         
	//*  54  104:instanceof      #60  <Class Long>
	//*  55  107:ifeq            121
					((Survey) (obj)).setOrder(((Long)obj2).intValue());
	//   56  110:aload_1         
	//   57  111:aload_3         
	//   58  112:checkcast       #60  <Class Long>
	//   59  115:invokevirtual   #64  <Method int Long.intValue()>
	//   60  118:invokevirtual   #68  <Method void Survey.setOrder(int)>
				obj2 = ((JSONObject) (obj1)).get("hidden");
	//   61  121:aload_2         
	//   62  122:ldc1            #70  <String "hidden">
	//   63  124:invokevirtual   #40  <Method Object JSONObject.get(Object)>
	//   64  127:astore_3        
				if(obj2 instanceof Boolean)
	//*  65  128:aload_3         
	//*  66  129:instanceof      #72  <Class Boolean>
	//*  67  132:ifeq            146
					((Survey) (obj)).setHidden(((Boolean)obj2).booleanValue());
	//   68  135:aload_1         
	//   69  136:aload_3         
	//   70  137:checkcast       #72  <Class Boolean>
	//   71  140:invokevirtual   #76  <Method boolean Boolean.booleanValue()>
	//   72  143:invokevirtual   #80  <Method void Survey.setHidden(boolean)>
				obj1 = ((JSONObject) (obj1)).get("questions");
	//   73  146:aload_2         
	//   74  147:ldc1            #82  <String "questions">
	//   75  149:invokevirtual   #40  <Method Object JSONObject.get(Object)>
	//   76  152:astore_2        
				if(!(obj1 instanceof JSONArray))
					break MISSING_BLOCK_LABEL_261;
	//   77  153:aload_2         
	//   78  154:instanceof      #84  <Class JSONArray>
	//   79  157:ifeq            261
				obj1 = ((Object) ((JSONArray)obj1));
	//   80  160:aload_2         
	//   81  161:checkcast       #84  <Class JSONArray>
	//   82  164:astore_2        
				if(((JSONArray) (obj1)).size() == 0)
	//*  83  165:aload_2         
	//*  84  166:invokevirtual   #87  <Method int JSONArray.size()>
	//*  85  169:ifne            209
					throw new SurveyParsingException("The survey must have at least one question in the json");
	//   86  172:new             #15  <Class SurveyParsingException>
	//   87  175:dup             
	//   88  176:ldc1            #89  <String "The survey must have at least one question in the json">
	//   89  178:invokespecial   #91  <Method void SurveyParsingException(String)>
	//   90  181:athrow          
				break MISSING_BLOCK_LABEL_209;
			}
			break MISSING_BLOCK_LABEL_199;
		}
	//*  91  182:astore_1        
	//*  92  183:aload_1         
	//*  93  184:invokevirtual   #94  <Method void ParseException.printStackTrace()>
	//*  94  187:aload_1         
	//*  95  188:athrow          
		throw new SurveyParsingException("The Survey must have a name in the json");
	//   96  189:new             #15  <Class SurveyParsingException>
	//   97  192:dup             
	//   98  193:ldc1            #96  <String "The Survey must have a name in the json">
	//   99  195:invokespecial   #91  <Method void SurveyParsingException(String)>
	//  100  198:athrow          
		throw new SurveyParsingException("The Survey must have a code in the json");
	//  101  199:new             #15  <Class SurveyParsingException>
	//  102  202:dup             
	//  103  203:ldc1            #98  <String "The Survey must have a code in the json">
	//  104  205:invokespecial   #91  <Method void SurveyParsingException(String)>
	//  105  208:athrow          
		((Survey) (obj)).setQuestions(((List) (new ArrayList())));
	//  106  209:aload_1         
	//  107  210:new             #100 <Class ArrayList>
	//  108  213:dup             
	//  109  214:invokespecial   #101 <Method void ArrayList()>
	//  110  217:invokevirtual   #105 <Method void Survey.setQuestions(List)>
		Question question;
		for(obj1 = ((Object) (((JSONArray) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); ((Survey) (obj)).getQuestions().add(((Object) (question))))
	//* 111  220:aload_2         
	//* 112  221:invokevirtual   #109 <Method Iterator JSONArray.iterator()>
	//* 113  224:astore_2        
	//* 114  225:aload_2         
	//* 115  226:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//* 116  231:ifeq            271
			question = QuestionParser.fromJsonObject((JSONObject)((Iterator) (obj1)).next());
	//  117  234:aload_2         
	//  118  235:invokeinterface #118 <Method Object Iterator.next()>
	//  119  240:checkcast       #31  <Class JSONObject>
	//  120  243:invokestatic    #124 <Method Question QuestionParser.fromJsonObject(JSONObject)>
	//  121  246:astore_3        

	//  122  247:aload_1         
	//  123  248:invokevirtual   #128 <Method List Survey.getQuestions()>
	//  124  251:aload_3         
	//  125  252:invokeinterface #134 <Method boolean List.add(Object)>
	//  126  257:pop             
		break MISSING_BLOCK_LABEL_271;
	//  127  258:goto            225
		try
		{
			throw new SurveyParsingException("The survey must have a questions array field");
	//  128  261:new             #15  <Class SurveyParsingException>
	//  129  264:dup             
	//  130  265:ldc1            #136 <String "The survey must have a questions array field">
	//  131  267:invokespecial   #91  <Method void SurveyParsingException(String)>
	//  132  270:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			((ParseException) (obj)).printStackTrace();
			throw obj;
		}
		return ((Survey) (obj));
	//  133  271:aload_1         
	//  134  272:areturn         
	}

	public static Survey fromSurveyCode(int i)
		throws ParseException, SurveyParsingException
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     2131623942 2131623955: default 72
	//	               2131623942 74
	//	               2131623943 72
	//	               2131623944 92
	//	               2131623945 101
	//	               2131623946 110
	//	               2131623947 119
	//	               2131623948 72
	//	               2131623949 72
	//	               2131623950 72
	//	               2131623951 72
	//	               2131623952 72
	//	               2131623953 72
	//	               2131623954 72
	//	               2131623955 83
		case 2131623943: 
		case 2131623948: 
		case 2131623949: 
		case 2131623950: 
		case 2131623951: 
		case 2131623952: 
		case 2131623953: 
		case 2131623954: 
		default:
			return null;
	//    2   72:aconst_null     
	//    3   73:areturn         

		case 2131623942: 
			return fromJson(Res.getStudySpecificRawId(0x7f070010));
	//    4   74:ldc1            #141 <Int 0x7f070010>
	//    5   76:invokestatic    #147 <Method int Res.getStudySpecificRawId(int)>
	//    6   79:invokestatic    #149 <Method Survey fromJson(int)>
	//    7   82:areturn         

		case 2131623955: 
			return fromJson(Res.getStudySpecificRawId(0x7f07001c));
	//    8   83:ldc1            #150 <Int 0x7f07001c>
	//    9   85:invokestatic    #147 <Method int Res.getStudySpecificRawId(int)>
	//   10   88:invokestatic    #149 <Method Survey fromJson(int)>
	//   11   91:areturn         

		case 2131623944: 
			return fromJson(Res.getStudySpecificRawId(0x7f070012));
	//   12   92:ldc1            #151 <Int 0x7f070012>
	//   13   94:invokestatic    #147 <Method int Res.getStudySpecificRawId(int)>
	//   14   97:invokestatic    #149 <Method Survey fromJson(int)>
	//   15  100:areturn         

		case 2131623945: 
			return fromJson(Res.getStudySpecificRawId(0x7f070013));
	//   16  101:ldc1            #152 <Int 0x7f070013>
	//   17  103:invokestatic    #147 <Method int Res.getStudySpecificRawId(int)>
	//   18  106:invokestatic    #149 <Method Survey fromJson(int)>
	//   19  109:areturn         

		case 2131623946: 
			return fromJson(Res.getStudySpecificRawId(0x7f070014));
	//   20  110:ldc1            #153 <Int 0x7f070014>
	//   21  112:invokestatic    #147 <Method int Res.getStudySpecificRawId(int)>
	//   22  115:invokestatic    #149 <Method Survey fromJson(int)>
	//   23  118:areturn         

		case 2131623947: 
			return fromJson(Res.getStudySpecificRawId(0x7f070015));
	//   24  119:ldc1            #154 <Int 0x7f070015>
	//   25  121:invokestatic    #147 <Method int Res.getStudySpecificRawId(int)>
	//   26  124:invokestatic    #149 <Method Survey fromJson(int)>
	//   27  127:areturn         
		}
	}

	public static Survey fromSurveyStringCode(String s)
		throws ParseException, SurveyParsingException
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_1        
		s.hashCode();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #159 <Method int String.hashCode()>
		JVM INSTR lookupswitch 6: default 64
	//	               -706907381: 134
	//	               -706719882: 148
	//	               -706719727: 162
	//	               -706404705: 176
	//	               79428: 120
	//	               737020781: 106;
	//    4    6:lookupswitch    6: default 64
	//	               -706907381: 134
	//	               -706719882: 148
	//	               -706719727: 162
	//	               -706404705: 176
	//	               79428: 120
	//	               737020781: 106
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		break; /* Loop/switch isn't completed */
_L5:
		break MISSING_BLOCK_LABEL_176;
_L8:
		switch(byte0)
	//*   5   64:iload_1         
		{
	//*   6   65:tableswitch     0 5: default 104
	//	               0 190
	//	               1 196
	//	               2 202
	//	               3 208
	//	               4 214
	//	               5 220
		default:
			return null;
	//    7  104:aconst_null     
	//    8  105:areturn         

	//*   9  106:aload_0         
	//*  10  107:ldc1            #161 <String "Eligibility">
	//*  11  109:invokevirtual   #164 <Method boolean String.equals(Object)>
	//*  12  112:ifeq            64
	//*  13  115:iconst_0        
	//*  14  116:istore_1        
	//*  15  117:goto            64
	//*  16  120:aload_0         
	//*  17  121:ldc1            #166 <String "PPD">
	//*  18  123:invokevirtual   #164 <Method boolean String.equals(Object)>
	//*  19  126:ifeq            64
	//*  20  129:iconst_1        
	//*  21  130:istore_1        
	//*  22  131:goto            64
	//*  23  134:aload_0         
	//*  24  135:ldc1            #168 <String "HealthEconomics-BIMF">
	//*  25  137:invokevirtual   #164 <Method boolean String.equals(Object)>
	//*  26  140:ifeq            64
	//*  27  143:iconst_2        
	//*  28  144:istore_1        
	//*  29  145:goto            64
	//*  30  148:aload_0         
	//*  31  149:ldc1            #170 <String "HealthEconomics-HRPQ">
	//*  32  151:invokevirtual   #164 <Method boolean String.equals(Object)>
	//*  33  154:ifeq            64
	//*  34  157:iconst_3        
	//*  35  158:istore_1        
	//*  36  159:goto            64
	//*  37  162:aload_0         
	//*  38  163:ldc1            #172 <String "HealthEconomics-HRUQ">
	//*  39  165:invokevirtual   #164 <Method boolean String.equals(Object)>
	//*  40  168:ifeq            64
	//*  41  171:iconst_4        
	//*  42  172:istore_1        
	//*  43  173:goto            64
	//*  44  176:aload_0         
	//*  45  177:ldc1            #174 <String "HealthEconomics-SF12">
	//*  46  179:invokevirtual   #164 <Method boolean String.equals(Object)>
	//*  47  182:ifeq            64
	//*  48  185:iconst_5        
	//*  49  186:istore_1        
	//*  50  187:goto            64
		case 0: // '\0'
			return fromSurveyCode(0x7f0e0006);
	//   51  190:ldc1            #175 <Int 0x7f0e0006>
	//   52  192:invokestatic    #177 <Method Survey fromSurveyCode(int)>
	//   53  195:areturn         

		case 1: // '\001'
			return fromSurveyCode(0x7f0e0013);
	//   54  196:ldc1            #178 <Int 0x7f0e0013>
	//   55  198:invokestatic    #177 <Method Survey fromSurveyCode(int)>
	//   56  201:areturn         

		case 2: // '\002'
			return fromSurveyCode(0x7f0e0008);
	//   57  202:ldc1            #179 <Int 0x7f0e0008>
	//   58  204:invokestatic    #177 <Method Survey fromSurveyCode(int)>
	//   59  207:areturn         

		case 3: // '\003'
			return fromSurveyCode(0x7f0e0009);
	//   60  208:ldc1            #180 <Int 0x7f0e0009>
	//   61  210:invokestatic    #177 <Method Survey fromSurveyCode(int)>
	//   62  213:areturn         

		case 4: // '\004'
			return fromSurveyCode(0x7f0e000a);
	//   63  214:ldc1            #181 <Int 0x7f0e000a>
	//   64  216:invokestatic    #177 <Method Survey fromSurveyCode(int)>
	//   65  219:areturn         

		case 5: // '\005'
			return fromSurveyCode(0x7f0e000b);
	//   66  220:ldc1            #182 <Int 0x7f0e000b>
	//   67  222:invokestatic    #177 <Method Survey fromSurveyCode(int)>
	//   68  225:areturn         
		}
_L7:
		if(s.equals("Eligibility"))
			byte0 = 0;
		  goto _L8
_L6:
		if(s.equals("PPD"))
			byte0 = 1;
		  goto _L8
_L2:
		if(s.equals("HealthEconomics-BIMF"))
			byte0 = 2;
		  goto _L8
_L3:
		if(s.equals("HealthEconomics-HRPQ"))
			byte0 = 3;
		  goto _L8
_L4:
		if(s.equals("HealthEconomics-HRUQ"))
			byte0 = 4;
		  goto _L8
		if(s.equals("HealthEconomics-SF12"))
			byte0 = 5;
		  goto _L8
	}
}
