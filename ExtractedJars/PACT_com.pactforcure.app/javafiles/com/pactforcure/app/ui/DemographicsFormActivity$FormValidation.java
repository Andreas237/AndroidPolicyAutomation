// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import io.michaelrocks.callmemaybe.CallMeMaybe;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.Map;

// Referenced classes of package com.pactforcure.app.ui:
//			DemographicsFormActivity

public static class DemographicsFormActivity$FormValidation
{

	boolean isValid()
	{
label0:
		{
			if(((String)formData.get("firstName")).length() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map formData>
	//*   2    4:ldc1            #28  <String "firstName">
	//*   3    6:invokeinterface #34  <Method Object Map.get(Object)>
	//*   4   11:checkcast       #36  <Class String>
	//*   5   14:invokevirtual   #40  <Method int String.length()>
	//*   6   17:ifne            31
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d5);
	//    7   20:aload_0         
	//    8   21:ldc1            #41  <Int 0x7f0802d5>
	//    9   23:invokestatic    #47  <Method String Res.getStudySpecificString(int)>
	//   10   26:putfield        #49  <Field String firstErrorEncounteredMessage>
				return false;
	//   11   29:iconst_0        
	//   12   30:ireturn         
			}
			if(((String)formData.get("lastName")).length() == 0)
	//*  13   31:aload_0         
	//*  14   32:getfield        #19  <Field Map formData>
	//*  15   35:ldc1            #51  <String "lastName">
	//*  16   37:invokeinterface #34  <Method Object Map.get(Object)>
	//*  17   42:checkcast       #36  <Class String>
	//*  18   45:invokevirtual   #40  <Method int String.length()>
	//*  19   48:ifne            62
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802da);
	//   20   51:aload_0         
	//   21   52:ldc1            #52  <Int 0x7f0802da>
	//   22   54:invokestatic    #47  <Method String Res.getStudySpecificString(int)>
	//   23   57:putfield        #49  <Field String firstErrorEncounteredMessage>
				return false;
	//   24   60:iconst_0        
	//   25   61:ireturn         
			}
			if(((String)formData.get("phone")).length() == 0)
	//*  26   62:aload_0         
	//*  27   63:getfield        #19  <Field Map formData>
	//*  28   66:ldc1            #54  <String "phone">
	//*  29   68:invokeinterface #34  <Method Object Map.get(Object)>
	//*  30   73:checkcast       #36  <Class String>
	//*  31   76:invokevirtual   #40  <Method int String.length()>
	//*  32   79:ifne            93
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802dd);
	//   33   82:aload_0         
	//   34   83:ldc1            #55  <Int 0x7f0802dd>
	//   35   85:invokestatic    #47  <Method String Res.getStudySpecificString(int)>
	//   36   88:putfield        #49  <Field String firstErrorEncounteredMessage>
				return false;
	//   37   91:iconst_0        
	//   38   92:ireturn         
			}
			try
			{
				PhoneNumberUtil phonenumberutil = CallMeMaybe.getPhoneNumberUtil();
	//   39   93:invokestatic    #61  <Method PhoneNumberUtil CallMeMaybe.getPhoneNumberUtil()>
	//   40   96:astore_1        
				if(phonenumberutil.isValidNumber(phonenumberutil.parse((String)formData.get("phone"), Res.getStudyId().name())))
					break label0;
	//   41   97:aload_1         
	//   42   98:aload_1         
	//   43   99:aload_0         
	//   44  100:getfield        #19  <Field Map formData>
	//   45  103:ldc1            #54  <String "phone">
	//   46  105:invokeinterface #34  <Method Object Map.get(Object)>
	//   47  110:checkcast       #36  <Class String>
	//   48  113:invokestatic    #65  <Method StudyId Res.getStudyId()>
	//   49  116:invokevirtual   #71  <Method String StudyId.name()>
	//   50  119:invokevirtual   #77  <Method io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber PhoneNumberUtil.parse(String, String)>
	//   51  122:invokevirtual   #81  <Method boolean PhoneNumberUtil.isValidNumber(io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber)>
	//   52  125:ifne            151
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d8);
	//   53  128:aload_0         
	//   54  129:ldc1            #82  <Int 0x7f0802d8>
	//   55  131:invokestatic    #47  <Method String Res.getStudySpecificString(int)>
	//   56  134:putfield        #49  <Field String firstErrorEncounteredMessage>
			}
	//*  57  137:iconst_0        
	//*  58  138:ireturn         
			catch(NumberParseException numberparseexception)
	//*  59  139:astore_1        
			{
				firstErrorEncounteredMessage = Res.getStudySpecificString(0x7f0802d8);
	//   60  140:aload_0         
	//   61  141:ldc1            #82  <Int 0x7f0802d8>
	//   62  143:invokestatic    #47  <Method String Res.getStudySpecificString(int)>
	//   63  146:putfield        #49  <Field String firstErrorEncounteredMessage>
				return false;
	//   64  149:iconst_0        
	//   65  150:ireturn         
			}
			return false;
		}
		return true;
	//   66  151:iconst_1        
	//   67  152:ireturn         
	}

	String firstErrorEncounteredMessage;
	private final Map formData;

	DemographicsFormActivity$FormValidation(Map map)
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
