// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.util.StringUtils;
import java.util.Map;

// Referenced classes of package com.pactforcure.app.ui:
//			ParticipantAddressFormActivity

public static class ParticipantAddressFormActivity$FormValidation
{

	private boolean isAuStateValid(String s)
	{
		return s.matches("ACT|NSW|NT|QLD|SA|TAS|VIC|WA|JBT");
	//    0    0:aload_1         
	//    1    1:ldc1            #26  <String "ACT|NSW|NT|QLD|SA|TAS|VIC|WA|JBT">
	//    2    3:invokevirtual   #31  <Method boolean String.matches(String)>
	//    3    6:ireturn         
	}

	private boolean isAuZipValid(String s)
	{
		return s.matches("^[0-9]{4}$");
	//    0    0:aload_1         
	//    1    1:ldc1            #34  <String "^[0-9]{4}$">
	//    2    3:invokevirtual   #31  <Method boolean String.matches(String)>
	//    3    6:ireturn         
	}

	private boolean isCityValid()
	{
		return StringUtils.isAlphaSpaceDash(((CharSequence) ((String)formData.get("city"))), true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map formData>
	//    2    4:ldc1            #38  <String "city">
	//    3    6:invokeinterface #44  <Method Object Map.get(Object)>
	//    4   11:checkcast       #28  <Class String>
	//    5   14:iconst_1        
	//    6   15:invokestatic    #50  <Method boolean StringUtils.isAlphaSpaceDash(CharSequence, boolean)>
	//    7   18:ireturn         
	}

	private boolean isStateValid()
	{
		String s = (String)formData.get("state");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map formData>
	//    2    4:ldc1            #53  <String "state">
	//    3    6:invokeinterface #44  <Method Object Map.get(Object)>
	//    4   11:checkcast       #28  <Class String>
	//    5   14:astore_1        
		switch(ParticipantAddressFormActivity._cls2.$SwitchMap$com$pactforcure$app$studies$StudyId[Res.getStudyId().ordinal()])
	//*   6   15:getstatic       #59  <Field int[] ParticipantAddressFormActivity$2.$SwitchMap$com$pactforcure$app$studies$StudyId>
	//*   7   18:invokestatic    #65  <Method StudyId Res.getStudyId()>
	//*   8   21:invokevirtual   #71  <Method int StudyId.ordinal()>
	//*   9   24:iaload          
		{
	//*  10   25:tableswitch     1 3: default 52
	//	               1 54
	//	               2 60
	//	               3 66
		default:
			return false;
	//   11   52:iconst_0        
	//   12   53:ireturn         

		case 1: // '\001'
			return isUsStateValid(s);
	//   13   54:aload_0         
	//   14   55:aload_1         
	//   15   56:invokespecial   #74  <Method boolean isUsStateValid(String)>
	//   16   59:ireturn         

		case 2: // '\002'
			return isAuStateValid(s);
	//   17   60:aload_0         
	//   18   61:aload_1         
	//   19   62:invokespecial   #76  <Method boolean isAuStateValid(String)>
	//   20   65:ireturn         

		case 3: // '\003'
			return isUkStateValid(s);
	//   21   66:aload_0         
	//   22   67:aload_1         
	//   23   68:invokespecial   #79  <Method boolean isUkStateValid(String)>
	//   24   71:ireturn         
		}
	}

	private boolean isUkStateValid(String s)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private boolean isUkZipValid(String s)
	{
		return s.matches("^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) ?[0-9][ABD-HJLNP-UW-Z]{2})$");
	//    0    0:aload_1         
	//    1    1:ldc1            #82  <String "^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) ?[0-9][ABD-HJLNP-UW-Z]{2})$">
	//    2    3:invokevirtual   #31  <Method boolean String.matches(String)>
	//    3    6:ireturn         
	}

	private boolean isUsStateValid(String s)
	{
		return s.matches("AL|AK|AS|AZ|AR|CA|CO|CT|DE|DC|FM|FL|GA|GU|HI|ID|IL|IN|IA|KS|KY|LA|ME|MH|MD|MA|MI|MN|MS|MO|MT|NE|NV|NH|NJ|NM|NY|NC|ND|MP|OH|OK|OR|PW|PA|PR|RI|SC|SD|TN|TX|UT|VT|VI|VA|WA|WV|WI|WY");
	//    0    0:aload_1         
	//    1    1:ldc1            #84  <String "AL|AK|AS|AZ|AR|CA|CO|CT|DE|DC|FM|FL|GA|GU|HI|ID|IL|IN|IA|KS|KY|LA|ME|MH|MD|MA|MI|MN|MS|MO|MT|NE|NV|NH|NJ|NM|NY|NC|ND|MP|OH|OK|OR|PW|PA|PR|RI|SC|SD|TN|TX|UT|VT|VI|VA|WA|WV|WI|WY">
	//    2    3:invokevirtual   #31  <Method boolean String.matches(String)>
	//    3    6:ireturn         
	}

	private boolean isUsZipValid(String s)
	{
		return s.matches("^[0-9]{5}(-[0-9]{4})?$");
	//    0    0:aload_1         
	//    1    1:ldc1            #87  <String "^[0-9]{5}(-[0-9]{4})?$">
	//    2    3:invokevirtual   #31  <Method boolean String.matches(String)>
	//    3    6:ireturn         
	}

	private boolean isZipValid()
	{
		String s = (String)formData.get("zip");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map formData>
	//    2    4:ldc1            #90  <String "zip">
	//    3    6:invokeinterface #44  <Method Object Map.get(Object)>
	//    4   11:checkcast       #28  <Class String>
	//    5   14:astore_1        
		switch(ParticipantAddressFormActivity._cls2.$SwitchMap$com$pactforcure$app$studies$StudyId[Res.getStudyId().ordinal()])
	//*   6   15:getstatic       #59  <Field int[] ParticipantAddressFormActivity$2.$SwitchMap$com$pactforcure$app$studies$StudyId>
	//*   7   18:invokestatic    #65  <Method StudyId Res.getStudyId()>
	//*   8   21:invokevirtual   #71  <Method int StudyId.ordinal()>
	//*   9   24:iaload          
		{
	//*  10   25:tableswitch     1 3: default 52
	//	               1 54
	//	               2 60
	//	               3 66
		default:
			return false;
	//   11   52:iconst_0        
	//   12   53:ireturn         

		case 1: // '\001'
			return isUsZipValid(s);
	//   13   54:aload_0         
	//   14   55:aload_1         
	//   15   56:invokespecial   #92  <Method boolean isUsZipValid(String)>
	//   16   59:ireturn         

		case 2: // '\002'
			return isAuZipValid(s);
	//   17   60:aload_0         
	//   18   61:aload_1         
	//   19   62:invokespecial   #94  <Method boolean isAuZipValid(String)>
	//   20   65:ireturn         

		case 3: // '\003'
			return isUkZipValid(s);
	//   21   66:aload_0         
	//   22   67:aload_1         
	//   23   68:invokespecial   #96  <Method boolean isUkZipValid(String)>
	//   24   71:ireturn         
		}
	}

	boolean isValid()
	{
		if(((String)formData.get("address1")).length() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map formData>
	//*   2    4:ldc1            #99  <String "address1">
	//*   3    6:invokeinterface #44  <Method Object Map.get(Object)>
	//*   4   11:checkcast       #28  <Class String>
	//*   5   14:invokevirtual   #102 <Method int String.length()>
	//*   6   17:ifne            31
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802c3);
	//    7   20:aload_0         
	//    8   21:ldc1            #103 <Int 0x7f0802c3>
	//    9   23:invokestatic    #107 <Method String Res.getStudySpecificString(int)>
	//   10   26:putfield        #109 <Field String firstErrorEncounteredMessage>
			return false;
	//   11   29:iconst_0        
	//   12   30:ireturn         
		}
		if(((String)formData.get("city")).length() == 0)
	//*  13   31:aload_0         
	//*  14   32:getfield        #19  <Field Map formData>
	//*  15   35:ldc1            #38  <String "city">
	//*  16   37:invokeinterface #44  <Method Object Map.get(Object)>
	//*  17   42:checkcast       #28  <Class String>
	//*  18   45:invokevirtual   #102 <Method int String.length()>
	//*  19   48:ifne            62
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802c5);
	//   20   51:aload_0         
	//   21   52:ldc1            #110 <Int 0x7f0802c5>
	//   22   54:invokestatic    #107 <Method String Res.getStudySpecificString(int)>
	//   23   57:putfield        #109 <Field String firstErrorEncounteredMessage>
			return false;
	//   24   60:iconst_0        
	//   25   61:ireturn         
		}
		if(((String)formData.get("state")).length() == 0)
	//*  26   62:aload_0         
	//*  27   63:getfield        #19  <Field Map formData>
	//*  28   66:ldc1            #53  <String "state">
	//*  29   68:invokeinterface #44  <Method Object Map.get(Object)>
	//*  30   73:checkcast       #28  <Class String>
	//*  31   76:invokevirtual   #102 <Method int String.length()>
	//*  32   79:ifne            93
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802cb);
	//   33   82:aload_0         
	//   34   83:ldc1            #111 <Int 0x7f0802cb>
	//   35   85:invokestatic    #107 <Method String Res.getStudySpecificString(int)>
	//   36   88:putfield        #109 <Field String firstErrorEncounteredMessage>
			return false;
	//   37   91:iconst_0        
	//   38   92:ireturn         
		}
		if(((String)formData.get("zip")).length() == 0)
	//*  39   93:aload_0         
	//*  40   94:getfield        #19  <Field Map formData>
	//*  41   97:ldc1            #90  <String "zip">
	//*  42   99:invokeinterface #44  <Method Object Map.get(Object)>
	//*  43  104:checkcast       #28  <Class String>
	//*  44  107:invokevirtual   #102 <Method int String.length()>
	//*  45  110:ifne            124
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802ce);
	//   46  113:aload_0         
	//   47  114:ldc1            #112 <Int 0x7f0802ce>
	//   48  116:invokestatic    #107 <Method String Res.getStudySpecificString(int)>
	//   49  119:putfield        #109 <Field String firstErrorEncounteredMessage>
			return false;
	//   50  122:iconst_0        
	//   51  123:ireturn         
		}
		if(!isCityValid())
	//*  52  124:aload_0         
	//*  53  125:invokespecial   #114 <Method boolean isCityValid()>
	//*  54  128:ifne            142
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802c7);
	//   55  131:aload_0         
	//   56  132:ldc1            #115 <Int 0x7f0802c7>
	//   57  134:invokestatic    #107 <Method String Res.getStudySpecificString(int)>
	//   58  137:putfield        #109 <Field String firstErrorEncounteredMessage>
			return false;
	//   59  140:iconst_0        
	//   60  141:ireturn         
		}
		if(!isStateValid())
	//*  61  142:aload_0         
	//*  62  143:invokespecial   #117 <Method boolean isStateValid()>
	//*  63  146:ifne            160
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802c8);
	//   64  149:aload_0         
	//   65  150:ldc1            #118 <Int 0x7f0802c8>
	//   66  152:invokestatic    #107 <Method String Res.getStudySpecificString(int)>
	//   67  155:putfield        #109 <Field String firstErrorEncounteredMessage>
			return false;
	//   68  158:iconst_0        
	//   69  159:ireturn         
		}
		if(!isZipValid())
	//*  70  160:aload_0         
	//*  71  161:invokespecial   #120 <Method boolean isZipValid()>
	//*  72  164:ifne            178
		{
			firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802c9);
	//   73  167:aload_0         
	//   74  168:ldc1            #121 <Int 0x7f0802c9>
	//   75  170:invokestatic    #107 <Method String Res.getStudySpecificString(int)>
	//   76  173:putfield        #109 <Field String firstErrorEncounteredMessage>
			return false;
	//   77  176:iconst_0        
	//   78  177:ireturn         
		} else
		{
			return true;
	//   79  178:iconst_1        
	//   80  179:ireturn         
		}
	}

	String firstErrorEncounteredMessage;
	private final Map formData;

	ParticipantAddressFormActivity$FormValidation(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		formData = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Map formData>
	//    5    9:return          
	}
}
