// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import io.michaelrocks.callmemaybe.CallMeMaybe;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.HashMap;
import java.util.Map;
import org.researchstack.backbone.model.ConsentDocument;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			FormActivity, AccountFormActivity

public class DemographicsFormActivity extends FormActivity
{
	public static class FormValidation
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

		FormValidation(Map map)
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


	public DemographicsFormActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void FormActivity()>
	//    2    4:return          
	}

	private String appendCountryCodeToRawNumber(String s)
	{
		String s1 = Res.getStudySpecificString(0x7f080210);
	//    0    0:ldc1            #42  <Int 0x7f080210>
	//    1    2:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//    2    5:astore_2        
		return (new StringBuilder()).append(s1).append(cleanNumber(s)).toString();
	//    3    6:new             #50  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #51  <Method void StringBuilder()>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #58  <Method String cleanNumber(String)>
	//   11   22:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   13   28:areturn         
	}

	private String cleanNumber(String s)
	{
		return s.trim().replace("+", "").replace("-", "").replace(" ", "");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method String String.trim()>
	//    2    4:ldc1            #69  <String "+">
	//    3    6:ldc1            #71  <String "">
	//    4    8:invokevirtual   #75  <Method String String.replace(CharSequence, CharSequence)>
	//    5   11:ldc1            #77  <String "-">
	//    6   13:ldc1            #71  <String "">
	//    7   15:invokevirtual   #75  <Method String String.replace(CharSequence, CharSequence)>
	//    8   18:ldc1            #79  <String " ">
	//    9   20:ldc1            #71  <String "">
	//   10   22:invokevirtual   #75  <Method String String.replace(CharSequence, CharSequence)>
	//   11   25:areturn         
	}

	private HashMap getFormData()
	{
		HashMap hashmap = new HashMap(3);
	//    0    0:new             #83  <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:invokespecial   #86  <Method void HashMap(int)>
	//    4    8:astore_1        
		hashmap.put("firstName", ((Object) (((Object) (firstNameView.getText())).toString().trim())));
	//    5    9:aload_1         
	//    6   10:ldc1            #16  <String "firstName">
	//    7   12:aload_0         
	//    8   13:getfield        #88  <Field EditText firstNameView>
	//    9   16:invokevirtual   #94  <Method android.text.Editable EditText.getText()>
	//   10   19:invokevirtual   #97  <Method String Object.toString()>
	//   11   22:invokevirtual   #67  <Method String String.trim()>
	//   12   25:invokevirtual   #101 <Method Object HashMap.put(Object, Object)>
	//   13   28:pop             
		hashmap.put("lastName", ((Object) (((Object) (lastNameView.getText())).toString().trim())));
	//   14   29:aload_1         
	//   15   30:ldc1            #19  <String "lastName">
	//   16   32:aload_0         
	//   17   33:getfield        #103 <Field EditText lastNameView>
	//   18   36:invokevirtual   #94  <Method android.text.Editable EditText.getText()>
	//   19   39:invokevirtual   #97  <Method String Object.toString()>
	//   20   42:invokevirtual   #67  <Method String String.trim()>
	//   21   45:invokevirtual   #101 <Method Object HashMap.put(Object, Object)>
	//   22   48:pop             
		hashmap.put("phone", ((Object) (((Object) (phoneView.getText())).toString().trim())));
	//   23   49:aload_1         
	//   24   50:ldc1            #22  <String "phone">
	//   25   52:aload_0         
	//   26   53:getfield        #105 <Field EditText phoneView>
	//   27   56:invokevirtual   #94  <Method android.text.Editable EditText.getText()>
	//   28   59:invokevirtual   #97  <Method String Object.toString()>
	//   29   62:invokevirtual   #67  <Method String String.trim()>
	//   30   65:invokevirtual   #101 <Method Object HashMap.put(Object, Object)>
	//   31   68:pop             
		return hashmap;
	//   32   69:aload_1         
	//   33   70:areturn         
	}

	private void goToAccountSetupScreen(HashMap hashmap)
	{
		Intent intent = new Intent(((Context) (this)), com/pactforcure/app/ui/AccountFormActivity);
	//    0    0:new             #111 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #113 <Class AccountFormActivity>
	//    4    7:invokespecial   #116 <Method void Intent(Context, Class)>
	//    5   10:astore_2        
		intent.putExtra("consentDocument", ((java.io.Serializable) (consentDocument)));
	//    6   11:aload_2         
	//    7   12:ldc1            #13  <String "consentDocument">
	//    8   14:aload_0         
	//    9   15:getfield        #118 <Field ConsentDocument consentDocument>
	//   10   18:invokevirtual   #122 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   11   21:pop             
		intent.putExtra("participantForm", ((java.io.Serializable) (hashmap)));
	//   12   22:aload_2         
	//   13   23:ldc1            #124 <String "participantForm">
	//   14   25:aload_1         
	//   15   26:invokevirtual   #122 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   16   29:pop             
		startActivity(intent);
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:invokevirtual   #128 <Method void startActivity(Intent)>
		overridePendingTransition(0x7f050019, 0x7f05001a);
	//   20   35:aload_0         
	//   21   36:ldc1            #129 <Int 0x7f050019>
	//   22   38:ldc1            #130 <Int 0x7f05001a>
	//   23   40:invokevirtual   #134 <Method void overridePendingTransition(int, int)>
	//   24   43:return          
	}

	static void lambda$onCreate$10(DemographicsFormActivity demographicsformactivity, View view, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
			demographicsformactivity.tryToFormatTelephoneNumber();
	//    2    4:aload_0         
	//    3    5:invokespecial   #140 <Method void tryToFormatTelephoneNumber()>
	//    4    8:return          
	}

	static void lambda$onCreate$11(DemographicsFormActivity demographicsformactivity, View view)
	{
		demographicsformactivity.tryToFormatTelephoneNumber();
	//    0    0:aload_0         
	//    1    1:invokespecial   #140 <Method void tryToFormatTelephoneNumber()>
		view = ((View) (demographicsformactivity.getFormData()));
	//    2    4:aload_0         
	//    3    5:invokespecial   #144 <Method HashMap getFormData()>
	//    4    8:astore_1        
		FormValidation formvalidation = new FormValidation(((Map) (view)));
	//    5    9:new             #8   <Class DemographicsFormActivity$FormValidation>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #147 <Method void DemographicsFormActivity$FormValidation(Map)>
	//    9   17:astore_2        
		if(formvalidation.isValid())
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #151 <Method boolean DemographicsFormActivity$FormValidation.isValid()>
	//*  12   22:ifeq            31
		{
			demographicsformactivity.goToAccountSetupScreen(((HashMap) (view)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #153 <Method void goToAccountSetupScreen(HashMap)>
			return;
	//   16   30:return          
		} else
		{
			Toast.makeText(((Context) (demographicsformactivity)), ((CharSequence) (formvalidation.firstErrorEncounteredMessage)), 1).show();
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:getfield        #156 <Field String DemographicsFormActivity$FormValidation.firstErrorEncounteredMessage>
	//   20   36:iconst_1        
	//   21   37:invokestatic    #162 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//   22   40:invokevirtual   #165 <Method void Toast.show()>
			return;
	//   23   43:return          
		}
	}

	private void tryToFormatTelephoneNumber()
	{
		Object obj;
		String s;
		obj = ((Object) (CallMeMaybe.getPhoneNumberUtil()));
	//    0    0:invokestatic    #173 <Method PhoneNumberUtil CallMeMaybe.getPhoneNumberUtil()>
	//    1    3:astore_2        
		s = Res.getStudyId().name();
	//    2    4:invokestatic    #177 <Method StudyId Res.getStudyId()>
	//    3    7:invokevirtual   #182 <Method String StudyId.name()>
	//    4   10:astore_3        
		Object obj1;
		obj1 = ((Object) (((PhoneNumberUtil) (obj)).parse(((Object) (phoneView.getText())).toString(), s)));
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #105 <Field EditText phoneView>
	//    8   16:invokevirtual   #94  <Method android.text.Editable EditText.getText()>
	//    9   19:invokevirtual   #97  <Method String Object.toString()>
	//   10   22:aload_3         
	//   11   23:invokevirtual   #188 <Method io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber PhoneNumberUtil.parse(String, String)>
	//   12   26:astore          4
		if(!((io.michaelrocks.libphonenumber.android.Phonenumber.PhoneNumber) (obj1)).hasCountryCode())
	//*  13   28:aload           4
	//*  14   30:invokevirtual   #193 <Method boolean io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.hasCountryCode()>
	//*  15   33:ifne            74
		{
			obj1 = ((Object) (((PhoneNumberUtil) (obj)).format(((PhoneNumberUtil) (obj)).parse(appendCountryCodeToRawNumber(((Object) (phoneView.getText())).toString()), s), io.michaelrocks.libphonenumber.android.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL)));
	//   16   36:aload_2         
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #105 <Field EditText phoneView>
	//   21   43:invokevirtual   #94  <Method android.text.Editable EditText.getText()>
	//   22   46:invokevirtual   #97  <Method String Object.toString()>
	//   23   49:invokespecial   #195 <Method String appendCountryCodeToRawNumber(String)>
	//   24   52:aload_3         
	//   25   53:invokevirtual   #188 <Method io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber PhoneNumberUtil.parse(String, String)>
	//   26   56:getstatic       #201 <Field io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL>
	//   27   59:invokevirtual   #205 <Method String PhoneNumberUtil.format(io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber, io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat)>
	//   28   62:astore          4
			phoneView.setText(((CharSequence) (obj1)));
	//   29   64:aload_0         
	//   30   65:getfield        #105 <Field EditText phoneView>
	//   31   68:aload           4
	//   32   70:invokevirtual   #209 <Method void EditText.setText(CharSequence)>
			return;
	//   33   73:return          
		}
		try
		{
			obj1 = ((Object) (((PhoneNumberUtil) (obj)).format(((io.michaelrocks.libphonenumber.android.Phonenumber.PhoneNumber) (obj1)), io.michaelrocks.libphonenumber.android.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL)));
	//   34   74:aload_2         
	//   35   75:aload           4
	//   36   77:getstatic       #201 <Field io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL>
	//   37   80:invokevirtual   #205 <Method String PhoneNumberUtil.format(io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber, io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat)>
	//   38   83:astore          4
			phoneView.setText(((CharSequence) (obj1)));
	//   39   85:aload_0         
	//   40   86:getfield        #105 <Field EditText phoneView>
	//   41   89:aload           4
	//   42   91:invokevirtual   #209 <Method void EditText.setText(CharSequence)>
			return;
	//   43   94:return          
		}
		catch(NumberParseException numberparseexception1)
	//*  44   95:astore          4
		{
			Log.d("ParticipantFormActivity", Log.getStackTraceString(((Throwable) (numberparseexception1))));
	//   45   97:ldc1            #25  <String "ParticipantFormActivity">
	//   46   99:aload           4
	//   47  101:invokestatic    #215 <Method String Log.getStackTraceString(Throwable)>
	//   48  104:invokestatic    #219 <Method int Log.d(String, String)>
	//   49  107:pop             
		}
		numberparseexception1 = ((NumberParseException) (appendCountryCodeToRawNumber(cleanNumber(((Object) (phoneView.getText())).toString()))));
	//   50  108:aload_0         
	//   51  109:aload_0         
	//   52  110:aload_0         
	//   53  111:getfield        #105 <Field EditText phoneView>
	//   54  114:invokevirtual   #94  <Method android.text.Editable EditText.getText()>
	//   55  117:invokevirtual   #97  <Method String Object.toString()>
	//   56  120:invokespecial   #58  <Method String cleanNumber(String)>
	//   57  123:invokespecial   #195 <Method String appendCountryCodeToRawNumber(String)>
	//   58  126:astore          4
		static class _cls1
		{

			static final int $SwitchMap$com$pactforcure$app$studies$StudyId[];

			static 
			{
				$SwitchMap$com$pactforcure$app$studies$StudyId = new int[StudyId.values().length];
			//    0    0:invokestatic    #18  <Method StudyId[] StudyId.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
				try
				{
					$SwitchMap$com$pactforcure$app$studies$StudyId[StudyId.US.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
			//    5   12:getstatic       #24  <Field StudyId StudyId.US>
			//    6   15:invokevirtual   #28  <Method int StudyId.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
			//*  10   23:getstatic       #31  <Field StudyId StudyId.AU>
			//*  11   26:invokevirtual   #28  <Method int StudyId.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
			//*  15   32:astore_0        
			//*  16   33:return          
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   34:astore_0        
				try
				{
					$SwitchMap$com$pactforcure$app$studies$StudyId[StudyId.AU.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  18   35:goto            20
			}
		}

		_cls1..SwitchMap.com.pactforcure.app.studies.StudyId[Res.getStudyId().ordinal()];
	//   59  128:getstatic       #223 <Field int[] DemographicsFormActivity$1.$SwitchMap$com$pactforcure$app$studies$StudyId>
	//   60  131:invokestatic    #177 <Method StudyId Res.getStudyId()>
	//   61  134:invokevirtual   #227 <Method int StudyId.ordinal()>
	//   62  137:iaload          
		JVM INSTR tableswitch 1 2: default 160
	//	               1 207
	//	               2 213;
	//   63  138:tableswitch     1 2: default 160
	//	               1 207
	//	               2 213
		   goto _L1 _L2 _L3
_L3:
		break MISSING_BLOCK_LABEL_213;
_L1:
		int i = 0;
	//   64  160:iconst_0        
	//   65  161:istore_1        
_L4:
		if(((String) (numberparseexception1)).length() >= i)
	//*  66  162:aload           4
	//*  67  164:invokevirtual   #230 <Method int String.length()>
	//*  68  167:iload_1         
	//*  69  168:icmplt          219
		{
			try
			{
				obj = ((Object) (((PhoneNumberUtil) (obj)).format(((PhoneNumberUtil) (obj)).parse(((String) (numberparseexception1)), s), io.michaelrocks.libphonenumber.android.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL)));
	//   70  171:aload_2         
	//   71  172:aload_2         
	//   72  173:aload           4
	//   73  175:aload_3         
	//   74  176:invokevirtual   #188 <Method io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber PhoneNumberUtil.parse(String, String)>
	//   75  179:getstatic       #201 <Field io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL>
	//   76  182:invokevirtual   #205 <Method String PhoneNumberUtil.format(io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber, io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberFormat)>
	//   77  185:astore_2        
				phoneView.setText(((CharSequence) (obj)));
	//   78  186:aload_0         
	//   79  187:getfield        #105 <Field EditText phoneView>
	//   80  190:aload_2         
	//   81  191:invokevirtual   #209 <Method void EditText.setText(CharSequence)>
				return;
	//   82  194:return          
			}
			catch(NumberParseException numberparseexception)
	//*  83  195:astore_2        
			{
				Log.d("ParticipantFormActivity", Log.getStackTraceString(((Throwable) (numberparseexception))));
	//   84  196:ldc1            #25  <String "ParticipantFormActivity">
	//   85  198:aload_2         
	//   86  199:invokestatic    #215 <Method String Log.getStackTraceString(Throwable)>
	//   87  202:invokestatic    #219 <Method int Log.d(String, String)>
	//   88  205:pop             
			}
			return;
	//   89  206:return          
		} else
	//*  90  207:bipush          11
	//*  91  209:istore_1        
	//*  92  210:goto            162
	//*  93  213:bipush          11
	//*  94  215:istore_1        
	//*  95  216:goto            162
		{
			return;
	//   96  219:return          
		}
_L2:
		i = 11;
		  goto _L4
		i = 11;
		  goto _L4
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #238 <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #240 <Method void FormActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected int getLayoutResId()
	{
		return 0x7f04001e;
	//    0    0:ldc1            #242 <Int 0x7f04001e>
	//    1    2:ireturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #247 <Method void FormActivity.onCreate(Bundle)>
		consentDocument = (ConsentDocument)getIntent().getSerializableExtra("consentDocument");
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #251 <Method Intent getIntent()>
	//    6   10:ldc1            #13  <String "consentDocument">
	//    7   12:invokevirtual   #255 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    8   15:checkcast       #257 <Class ConsentDocument>
	//    9   18:putfield        #118 <Field ConsentDocument consentDocument>
		setTitle(((CharSequence) (Res.getStudySpecificString(0x7f0802de))));
	//   10   21:aload_0         
	//   11   22:ldc2            #258 <Int 0x7f0802de>
	//   12   25:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//   13   28:invokevirtual   #261 <Method void setTitle(CharSequence)>
		firstNameLabelView = (TextView)findViewById(0x7f0e00b2);
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:ldc2            #262 <Int 0x7f0e00b2>
	//   17   36:invokevirtual   #266 <Method View findViewById(int)>
	//   18   39:checkcast       #268 <Class TextView>
	//   19   42:putfield        #270 <Field TextView firstNameLabelView>
		firstNameView = (EditText)findViewById(0x7f0e00b3);
	//   20   45:aload_0         
	//   21   46:aload_0         
	//   22   47:ldc2            #271 <Int 0x7f0e00b3>
	//   23   50:invokevirtual   #266 <Method View findViewById(int)>
	//   24   53:checkcast       #90  <Class EditText>
	//   25   56:putfield        #88  <Field EditText firstNameView>
		lastNameLabelView = (TextView)findViewById(0x7f0e00b4);
	//   26   59:aload_0         
	//   27   60:aload_0         
	//   28   61:ldc2            #272 <Int 0x7f0e00b4>
	//   29   64:invokevirtual   #266 <Method View findViewById(int)>
	//   30   67:checkcast       #268 <Class TextView>
	//   31   70:putfield        #274 <Field TextView lastNameLabelView>
		lastNameView = (EditText)findViewById(0x7f0e00b5);
	//   32   73:aload_0         
	//   33   74:aload_0         
	//   34   75:ldc2            #275 <Int 0x7f0e00b5>
	//   35   78:invokevirtual   #266 <Method View findViewById(int)>
	//   36   81:checkcast       #90  <Class EditText>
	//   37   84:putfield        #103 <Field EditText lastNameView>
		phoneLabelView = (TextView)findViewById(0x7f0e00b6);
	//   38   87:aload_0         
	//   39   88:aload_0         
	//   40   89:ldc2            #276 <Int 0x7f0e00b6>
	//   41   92:invokevirtual   #266 <Method View findViewById(int)>
	//   42   95:checkcast       #268 <Class TextView>
	//   43   98:putfield        #278 <Field TextView phoneLabelView>
		phoneView = (EditText)findViewById(0x7f0e00b7);
	//   44  101:aload_0         
	//   45  102:aload_0         
	//   46  103:ldc2            #279 <Int 0x7f0e00b7>
	//   47  106:invokevirtual   #266 <Method View findViewById(int)>
	//   48  109:checkcast       #90  <Class EditText>
	//   49  112:putfield        #105 <Field EditText phoneView>
		firstNameLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802d4))));
	//   50  115:aload_0         
	//   51  116:getfield        #270 <Field TextView firstNameLabelView>
	//   52  119:ldc2            #280 <Int 0x7f0802d4>
	//   53  122:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//   54  125:invokevirtual   #281 <Method void TextView.setText(CharSequence)>
		lastNameLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802d9))));
	//   55  128:aload_0         
	//   56  129:getfield        #274 <Field TextView lastNameLabelView>
	//   57  132:ldc2            #282 <Int 0x7f0802d9>
	//   58  135:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//   59  138:invokevirtual   #281 <Method void TextView.setText(CharSequence)>
		phoneLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802dc))));
	//   60  141:aload_0         
	//   61  142:getfield        #278 <Field TextView phoneLabelView>
	//   62  145:ldc2            #283 <Int 0x7f0802dc>
	//   63  148:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//   64  151:invokevirtual   #281 <Method void TextView.setText(CharSequence)>
		firstNameView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802f2))));
	//   65  154:aload_0         
	//   66  155:getfield        #88  <Field EditText firstNameView>
	//   67  158:ldc2            #284 <Int 0x7f0802f2>
	//   68  161:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//   69  164:invokevirtual   #287 <Method void EditText.setHint(CharSequence)>
		lastNameView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802f2))));
	//   70  167:aload_0         
	//   71  168:getfield        #103 <Field EditText lastNameView>
	//   72  171:ldc2            #284 <Int 0x7f0802f2>
	//   73  174:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//   74  177:invokevirtual   #287 <Method void EditText.setHint(CharSequence)>
		phoneView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802f2))));
	//   75  180:aload_0         
	//   76  181:getfield        #105 <Field EditText phoneView>
	//   77  184:ldc2            #284 <Int 0x7f0802f2>
	//   78  187:invokestatic    #48  <Method String Res.getStudySpecificString(int)>
	//   79  190:invokevirtual   #287 <Method void EditText.setHint(CharSequence)>
		CallMeMaybe.setPhoneNumberUtil(PhoneNumberUtil.createInstance(((Context) (this))));
	//   80  193:aload_0         
	//   81  194:invokestatic    #291 <Method PhoneNumberUtil PhoneNumberUtil.createInstance(Context)>
	//   82  197:invokestatic    #295 <Method void CallMeMaybe.setPhoneNumberUtil(PhoneNumberUtil)>
		class .Lambda._cls1
			implements android.view.View.OnFocusChangeListener
		{

			public static android.view.View.OnFocusChangeListener lambdaFactory$(DemographicsFormActivity demographicsformactivity)
			{
				return ((android.view.View.OnFocusChangeListener) (((.Lambda._cls1) (demographicsformactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class DemographicsFormActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void DemographicsFormActivity$$Lambda$1(DemographicsFormActivity)>
			//    4    8:areturn         
			}

			public void onFocusChange(View view, boolean flag)
			{
				DemographicsFormActivity.lambda$onCreate$10(arg$1, view, flag);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field DemographicsFormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void DemographicsFormActivity.lambda$onCreate$10(DemographicsFormActivity, View, boolean)>
			//    5    9:return          
			}

			private final DemographicsFormActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = DemographicsFormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field DemographicsFormActivity arg$1>
			//    5    9:return          
			}
		}

		phoneView.setOnFocusChangeListener(.Lambda._cls1.lambdaFactory.(this));
	//   83  200:aload_0         
	//   84  201:getfield        #105 <Field EditText phoneView>
	//   85  204:aload_0         
	//   86  205:invokestatic    #301 <Method android.view.View$OnFocusChangeListener DemographicsFormActivity$$Lambda$1.lambdaFactory$(DemographicsFormActivity)>
	//   87  208:invokevirtual   #305 <Method void EditText.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
		class .Lambda._cls2
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(DemographicsFormActivity demographicsformactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls2) (demographicsformactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class DemographicsFormActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void DemographicsFormActivity$$Lambda$2(DemographicsFormActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				DemographicsFormActivity.lambda$onCreate$11(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field DemographicsFormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void DemographicsFormActivity.lambda$onCreate$11(DemographicsFormActivity, View)>
			//    4    8:return          
			}

			private final DemographicsFormActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = DemographicsFormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field DemographicsFormActivity arg$1>
			//    5    9:return          
			}
		}

		bottomBarBtn.setOnClickListener(.Lambda._cls2.lambdaFactory.(this));
	//   88  211:aload_0         
	//   89  212:getfield        #308 <Field TextView bottomBarBtn>
	//   90  215:aload_0         
	//   91  216:invokestatic    #313 <Method android.view.View$OnClickListener DemographicsFormActivity$$Lambda$2.lambdaFactory$(DemographicsFormActivity)>
	//   92  219:invokevirtual   #317 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
	//   93  222:return          
	}

	public static final String CONSENT_DOCUMENT_EXTRA = "consentDocument";
	public static final String FIRST_NAME_KEY = "firstName";
	public static final String LAST_NAME_KEY = "lastName";
	public static final String PHONE_KEY = "phone";
	private static final String TAG = "ParticipantFormActivity";
	private ConsentDocument consentDocument;
	private TextView firstNameLabelView;
	private EditText firstNameView;
	private TextView lastNameLabelView;
	private EditText lastNameView;
	private TextView phoneLabelView;
	private EditText phoneView;
}
