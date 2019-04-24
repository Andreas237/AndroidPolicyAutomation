// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.*;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.util.Log;
import android.view.*;
import android.widget.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.consent.ConsentPdfFactory;
import com.pactforcure.app.core.message.SurveyUploadedMessage;
import com.pactforcure.app.participant.*;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.survey.PpdResultsStorage;
import com.pactforcure.app.util.DialogUtils;
import com.pactforcure.app.util.StringUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.researchstack.backbone.model.ConsentDocument;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			LandingActivity

public class ParticipantAddressFormActivity extends AppCompatActivity
{
	public static class FormValidation
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
			static class _cls2
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
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$studies$StudyId>
				//*  15   34:getstatic       #34  <Field StudyId StudyId.UK>
				//*  16   37:invokevirtual   #28  <Method int StudyId.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:return          
				//*  20   43:astore_0        
				//*  21   44:return          
				//*  22   45:astore_0        
				//*  23   46:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   49:astore_0        
					try
					{
						$SwitchMap$com$pactforcure$app$studies$StudyId[StudyId.AU.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$pactforcure$app$studies$StudyId[StudyId.UK.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  25   50:goto            20
				}
			}

			switch(_cls2..SwitchMap.com.pactforcure.app.studies.StudyId[Res.getStudyId().ordinal()])
		//*   6   15:getstatic       #59  <Field int[] ParticipantAddressFormActivity$2.$SwitchMap$com$pactforcure$app$studies$StudyId>
		//*   7   18:invokestatic    #65  <Method StudyId Res.getStudyId()>
		//*   8   21:invokevirtual   #71  <Method int StudyId.ordinal()>
		//*   9   24:iaload          
			{
		//*  10   25:tableswitch     1 3: default 52
		//		               1 54
		//		               2 60
		//		               3 66
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
			switch(_cls2..SwitchMap.com.pactforcure.app.studies.StudyId[Res.getStudyId().ordinal()])
		//*   6   15:getstatic       #59  <Field int[] ParticipantAddressFormActivity$2.$SwitchMap$com$pactforcure$app$studies$StudyId>
		//*   7   18:invokestatic    #65  <Method StudyId Res.getStudyId()>
		//*   8   21:invokevirtual   #71  <Method int StudyId.ordinal()>
		//*   9   24:iaload          
			{
		//*  10   25:tableswitch     1 3: default 52
		//		               1 54
		//		               2 60
		//		               3 66
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


	public ParticipantAddressFormActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	private void displayRegistrationError(String s)
	{
		bottomBarBtn.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TextView bottomBarBtn>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #84  <Method void TextView.setVisibility(int)>
		progressBar.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field ProgressBar progressBar>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #87  <Method void ProgressBar.setVisibility(int)>
		messageView.setText(((CharSequence) (s)));
	//    8   17:aload_0         
	//    9   18:getfield        #61  <Field TextView messageView>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		bottomBarBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f08036e))));
	//   12   25:aload_0         
	//   13   26:getfield        #78  <Field TextView bottomBarBtn>
	//   14   29:ldc1            #92  <Int 0x7f08036e>
	//   15   31:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//   16   34:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
	//   17   37:return          
	}

	private Map getFormData()
	{
		HashMap hashmap = new HashMap(5);
	//    0    0:new             #102 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:invokespecial   #104 <Method void HashMap(int)>
	//    4    8:astore_1        
		((Map) (hashmap)).put("address1", ((Object) (((Object) (address1View.getText())).toString().trim())));
	//    5    9:aload_1         
	//    6   10:ldc1            #15  <String "address1">
	//    7   12:aload_0         
	//    8   13:getfield        #106 <Field EditText address1View>
	//    9   16:invokevirtual   #112 <Method android.text.Editable EditText.getText()>
	//   10   19:invokevirtual   #118 <Method String Object.toString()>
	//   11   22:invokevirtual   #123 <Method String String.trim()>
	//   12   25:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   13   30:pop             
		((Map) (hashmap)).put("address2", ((Object) (((Object) (address2View.getText())).toString().trim())));
	//   14   31:aload_1         
	//   15   32:ldc1            #18  <String "address2">
	//   16   34:aload_0         
	//   17   35:getfield        #131 <Field EditText address2View>
	//   18   38:invokevirtual   #112 <Method android.text.Editable EditText.getText()>
	//   19   41:invokevirtual   #118 <Method String Object.toString()>
	//   20   44:invokevirtual   #123 <Method String String.trim()>
	//   21   47:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   22   52:pop             
		((Map) (hashmap)).put("city", ((Object) (((Object) (cityView.getText())).toString().trim())));
	//   23   53:aload_1         
	//   24   54:ldc1            #21  <String "city">
	//   25   56:aload_0         
	//   26   57:getfield        #133 <Field EditText cityView>
	//   27   60:invokevirtual   #112 <Method android.text.Editable EditText.getText()>
	//   28   63:invokevirtual   #118 <Method String Object.toString()>
	//   29   66:invokevirtual   #123 <Method String String.trim()>
	//   30   69:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   31   74:pop             
		((Map) (hashmap)).put("state", ((Object) (((Object) (stateView.getText())).toString().trim())));
	//   32   75:aload_1         
	//   33   76:ldc1            #27  <String "state">
	//   34   78:aload_0         
	//   35   79:getfield        #135 <Field EditText stateView>
	//   36   82:invokevirtual   #112 <Method android.text.Editable EditText.getText()>
	//   37   85:invokevirtual   #118 <Method String Object.toString()>
	//   38   88:invokevirtual   #123 <Method String String.trim()>
	//   39   91:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   40   96:pop             
		((Map) (hashmap)).put("zip", ((Object) (((Object) (zipView.getText())).toString().trim())));
	//   41   97:aload_1         
	//   42   98:ldc1            #33  <String "zip">
	//   43  100:aload_0         
	//   44  101:getfield        #137 <Field EditText zipView>
	//   45  104:invokevirtual   #112 <Method android.text.Editable EditText.getText()>
	//   46  107:invokevirtual   #118 <Method String Object.toString()>
	//   47  110:invokevirtual   #123 <Method String String.trim()>
	//   48  113:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//   49  118:pop             
		return ((Map) (hashmap));
	//   50  119:aload_1         
	//   51  120:areturn         
	}

	private void goToThankYouDnaScreen()
	{
		Intent intent = new Intent(((Context) (this)), com/pactforcure/app/ui/LandingActivity);
	//    0    0:new             #141 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #143 <Class LandingActivity>
	//    4    7:invokespecial   #146 <Method void Intent(Context, Class)>
	//    5   10:astore_1        
		intent.putExtra("reasonExtra", 1);
	//    6   11:aload_1         
	//    7   12:ldc1            #148 <String "reasonExtra">
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #152 <Method Intent Intent.putExtra(String, int)>
	//   10   18:pop             
		startActivity(intent);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #156 <Method void startActivity(Intent)>
		finish();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #159 <Method void finish()>
	//   16   28:return          
	}

	static void lambda$onCreate$22(ParticipantAddressFormActivity participantaddressformactivity, View view)
	{
		view = ((View) (participantaddressformactivity.getFormData()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method Map getFormData()>
	//    2    4:astore_1        
		FormValidation formvalidation = new FormValidation(((Map) (view)));
	//    3    5:new             #10  <Class ParticipantAddressFormActivity$FormValidation>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #166 <Method void ParticipantAddressFormActivity$FormValidation(Map)>
	//    7   13:astore_2        
		if(formvalidation.isValid())
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #170 <Method boolean ParticipantAddressFormActivity$FormValidation.isValid()>
	//*  10   18:ifeq            27
		{
			participantaddressformactivity.registerDnaInfo(((Map) (view)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #173 <Method void registerDnaInfo(Map)>
			return;
	//   14   26:return          
		} else
		{
			Toast.makeText(((Context) (participantaddressformactivity)), ((CharSequence) (formvalidation.firstErrorEncounteredMessage)), 1).show();
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:getfield        #176 <Field String ParticipantAddressFormActivity$FormValidation.firstErrorEncounteredMessage>
	//   18   32:iconst_1        
	//   19   33:invokestatic    #182 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//   20   36:invokevirtual   #185 <Method void Toast.show()>
			return;
	//   21   39:return          
		}
	}

	static void lambda$onOptionsItemSelected$23(ParticipantAddressFormActivity participantaddressformactivity, DialogInterface dialoginterface, int i)
	{
		participantaddressformactivity.setResult(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #190 <Method void setResult(int)>
		participantaddressformactivity.finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #159 <Method void finish()>
	//    5    9:return          
	}

	private void registerDnaInfo(Map map)
	{
		boolean flag;
		final Participant participant;
		messageView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802f0))));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field TextView messageView>
	//    2    4:ldc1            #197 <Int 0x7f0802f0>
	//    3    6:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//    4    9:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		progressBar.setVisibility(0);
	//    5   12:aload_0         
	//    6   13:getfield        #65  <Field ProgressBar progressBar>
	//    7   16:iconst_0        
	//    8   17:invokevirtual   #87  <Method void ProgressBar.setVisibility(int)>
		bottomBarBtn.setVisibility(8);
	//    9   20:aload_0         
	//   10   21:getfield        #78  <Field TextView bottomBarBtn>
	//   11   24:bipush          8
	//   12   26:invokevirtual   #84  <Method void TextView.setVisibility(int)>
		participant = ParticipantStorage.getParticipant();
	//   13   29:invokestatic    #203 <Method Participant ParticipantStorage.getParticipant()>
	//   14   32:astore_3        
		Participant.updateAddressUsingForm(participant, map);
	//   15   33:aload_3         
	//   16   34:aload_1         
	//   17   35:invokestatic    #209 <Method void Participant.updateAddressUsingForm(Participant, Map)>
		ParticipantStorage.saveParticipant(participant);
	//   18   38:aload_3         
	//   19   39:invokestatic    #213 <Method void ParticipantStorage.saveParticipant(Participant)>
		flag = false;
	//   20   42:iconst_0        
	//   21   43:istore_2        
		map = "";
	//   22   44:ldc1            #215 <String "">
	//   23   46:astore_1        
		ConsentPdfFactory.genConsentPdf(consentDocument, participant.buildName(), participant.getDnaBase64Signature(), "dna_consent.pdf");
	//   24   47:aload_0         
	//   25   48:getfield        #217 <Field ConsentDocument consentDocument>
	//   26   51:aload_3         
	//   27   52:invokevirtual   #220 <Method String Participant.buildName()>
	//   28   55:aload_3         
	//   29   56:invokevirtual   #223 <Method String Participant.getDnaBase64Signature()>
	//   30   59:ldc1            #225 <String "dna_consent.pdf">
	//   31   61:invokestatic    #231 <Method void ConsentPdfFactory.genConsentPdf(ConsentDocument, String, String, String)>
_L1:
		if(flag)
	//*  32   64:iload_2         
	//*  33   65:ifeq            95
		{
			displayRegistrationError(((String) (map)));
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokespecial   #76  <Method void displayRegistrationError(String)>
			return;
	//   37   73:return          
		} else
	//*  38   74:astore_1        
	//*  39   75:ldc1            #30  <String "ParticipantAddressFormA">
	//*  40   77:ldc1            #233 <String "error registering participant">
	//*  41   79:aload_1         
	//*  42   80:invokestatic    #239 <Method int Log.e(String, String, Throwable)>
	//*  43   83:pop             
	//*  44   84:ldc1            #240 <Int 0x7f080259>
	//*  45   86:invokestatic    #243 <Method String Res.getRegularString(int)>
	//*  46   89:astore_1        
	//*  47   90:iconst_1        
	//*  48   91:istore_2        
	//*  49   92:goto            64
		{
			(new ParticipantServerAgent()).registerDna(new DtoCallback() {

				public void onError(CodeDescriptionError codedescriptionerror)
				{
					displayRegistrationError(codedescriptionerror.getUserFriendlyErrorMessage());
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ParticipantAddressFormActivity this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #34  <Method String CodeDescriptionError.getUserFriendlyErrorMessage()>
				//    4    8:invokestatic    #38  <Method void ParticipantAddressFormActivity.access$300(ParticipantAddressFormActivity, String)>
				//    5   11:return          
				}

				public void onSuccess(ParticipantRegistrationResponse participantregistrationresponse)
				{
					messageView.setText("");
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ParticipantAddressFormActivity this$0>
				//    2    4:invokestatic    #44  <Method TextView ParticipantAddressFormActivity.access$000(ParticipantAddressFormActivity)>
				//    3    7:ldc1            #46  <String "">
				//    4    9:invokevirtual   #52  <Method void TextView.setText(CharSequence)>
					progressBar.setVisibility(8);
				//    5   12:aload_0         
				//    6   13:getfield        #20  <Field ParticipantAddressFormActivity this$0>
				//    7   16:invokestatic    #56  <Method ProgressBar ParticipantAddressFormActivity.access$100(ParticipantAddressFormActivity)>
				//    8   19:bipush          8
				//    9   21:invokevirtual   #62  <Method void ProgressBar.setVisibility(int)>
					PpdResultsStorage.setGivenDnaConsent(Res.getStudyId(), true);
				//   10   24:invokestatic    #68  <Method StudyId Res.getStudyId()>
				//   11   27:iconst_1        
				//   12   28:invokestatic    #74  <Method void PpdResultsStorage.setGivenDnaConsent(StudyId, boolean)>
					PpdResultsStorage.setAreHealthEconomicQuestionnairesAvailable(Res.getStudyId(), true);
				//   13   31:invokestatic    #68  <Method StudyId Res.getStudyId()>
				//   14   34:iconst_1        
				//   15   35:invokestatic    #77  <Method void PpdResultsStorage.setAreHealthEconomicQuestionnairesAvailable(StudyId, boolean)>
					participant.setDNAregistered(true);
				//   16   38:aload_0         
				//   17   39:getfield        #22  <Field Participant val$participant>
				//   18   42:iconst_1        
				//   19   43:invokevirtual   #83  <Method void Participant.setDNAregistered(boolean)>
					ParticipantStorage.saveParticipant(participant);
				//   20   46:aload_0         
				//   21   47:getfield        #22  <Field Participant val$participant>
				//   22   50:invokestatic    #89  <Method void ParticipantStorage.saveParticipant(Participant)>
					EventBus.getDefault().postSticky(((Object) (new SurveyUploadedMessage())));
				//   23   53:invokestatic    #95  <Method EventBus EventBus.getDefault()>
				//   24   56:new             #97  <Class SurveyUploadedMessage>
				//   25   59:dup             
				//   26   60:invokespecial   #98  <Method void SurveyUploadedMessage()>
				//   27   63:invokevirtual   #102 <Method void EventBus.postSticky(Object)>
					goToThankYouDnaScreen();
				//   28   66:aload_0         
				//   29   67:getfield        #20  <Field ParticipantAddressFormActivity this$0>
				//   30   70:invokestatic    #106 <Method void ParticipantAddressFormActivity.access$200(ParticipantAddressFormActivity)>
				//   31   73:return          
				}

				public volatile void onSuccess(Object obj)
				{
					onSuccess((ParticipantRegistrationResponse)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #108 <Class ParticipantRegistrationResponse>
				//    3    5:invokevirtual   #110 <Method void onSuccess(ParticipantRegistrationResponse)>
				//    4    8:return          
				}

				final ParticipantAddressFormActivity this$0;
				final Participant val$participant;

			
			{
				this$0 = ParticipantAddressFormActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ParticipantAddressFormActivity this$0>
				participant = participant1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Participant val$participant>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   50   95:new             #245 <Class ParticipantServerAgent>
	//   51   98:dup             
	//   52   99:invokespecial   #246 <Method void ParticipantServerAgent()>
	//   53  102:new             #6   <Class ParticipantAddressFormActivity$1>
	//   54  105:dup             
	//   55  106:aload_0         
	//   56  107:aload_3         
	//   57  108:invokespecial   #249 <Method void ParticipantAddressFormActivity$1(ParticipantAddressFormActivity, Participant)>
	//   58  111:invokevirtual   #253 <Method void ParticipantServerAgent.registerDna(DtoCallback)>
			return;
	//   59  114:return          
		}
		map;
_L2:
		Log.e("ParticipantAddressFormA", "error registering participant", ((Throwable) (map)));
		map = ((Map) (Res.getRegularString(0x7f080259)));
		flag = true;
		  goto _L1
		map;
	//   60  115:astore_1        
		  goto _L2
	//*  61  116:goto            75
		map;
	//   62  119:astore_1        
		  goto _L2
	//*  63  120:goto            75
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #262 <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #264 <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #269 <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040027);
	//    3    5:aload_0         
	//    4    6:ldc2            #270 <Int 0x7f040027>
	//    5    9:invokevirtual   #273 <Method void setContentView(int)>
		consentDocument = (ConsentDocument)getIntent().getSerializableExtra("consentDocument");
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #277 <Method Intent getIntent()>
	//    9   17:ldc1            #24  <String "consentDocument">
	//   10   19:invokevirtual   #281 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   11   22:checkcast       #283 <Class ConsentDocument>
	//   12   25:putfield        #217 <Field ConsentDocument consentDocument>
		address1LabelView = (TextView)findViewById(0x7f0e00e1);
	//   13   28:aload_0         
	//   14   29:aload_0         
	//   15   30:ldc2            #284 <Int 0x7f0e00e1>
	//   16   33:invokevirtual   #288 <Method View findViewById(int)>
	//   17   36:checkcast       #80  <Class TextView>
	//   18   39:putfield        #290 <Field TextView address1LabelView>
		address1View = (EditText)findViewById(0x7f0e00e2);
	//   19   42:aload_0         
	//   20   43:aload_0         
	//   21   44:ldc2            #291 <Int 0x7f0e00e2>
	//   22   47:invokevirtual   #288 <Method View findViewById(int)>
	//   23   50:checkcast       #108 <Class EditText>
	//   24   53:putfield        #106 <Field EditText address1View>
		address2LabelView = (TextView)findViewById(0x7f0e00e3);
	//   25   56:aload_0         
	//   26   57:aload_0         
	//   27   58:ldc2            #292 <Int 0x7f0e00e3>
	//   28   61:invokevirtual   #288 <Method View findViewById(int)>
	//   29   64:checkcast       #80  <Class TextView>
	//   30   67:putfield        #294 <Field TextView address2LabelView>
		address2View = (EditText)findViewById(0x7f0e00e4);
	//   31   70:aload_0         
	//   32   71:aload_0         
	//   33   72:ldc2            #295 <Int 0x7f0e00e4>
	//   34   75:invokevirtual   #288 <Method View findViewById(int)>
	//   35   78:checkcast       #108 <Class EditText>
	//   36   81:putfield        #131 <Field EditText address2View>
		cityLabelView = (TextView)findViewById(0x7f0e00e5);
	//   37   84:aload_0         
	//   38   85:aload_0         
	//   39   86:ldc2            #296 <Int 0x7f0e00e5>
	//   40   89:invokevirtual   #288 <Method View findViewById(int)>
	//   41   92:checkcast       #80  <Class TextView>
	//   42   95:putfield        #298 <Field TextView cityLabelView>
		cityView = (EditText)findViewById(0x7f0e00e6);
	//   43   98:aload_0         
	//   44   99:aload_0         
	//   45  100:ldc2            #299 <Int 0x7f0e00e6>
	//   46  103:invokevirtual   #288 <Method View findViewById(int)>
	//   47  106:checkcast       #108 <Class EditText>
	//   48  109:putfield        #133 <Field EditText cityView>
		stateLabelView = (TextView)findViewById(0x7f0e00e7);
	//   49  112:aload_0         
	//   50  113:aload_0         
	//   51  114:ldc2            #300 <Int 0x7f0e00e7>
	//   52  117:invokevirtual   #288 <Method View findViewById(int)>
	//   53  120:checkcast       #80  <Class TextView>
	//   54  123:putfield        #302 <Field TextView stateLabelView>
		stateView = (EditText)findViewById(0x7f0e00e8);
	//   55  126:aload_0         
	//   56  127:aload_0         
	//   57  128:ldc2            #303 <Int 0x7f0e00e8>
	//   58  131:invokevirtual   #288 <Method View findViewById(int)>
	//   59  134:checkcast       #108 <Class EditText>
	//   60  137:putfield        #135 <Field EditText stateView>
		zipLabelView = (TextView)findViewById(0x7f0e00e9);
	//   61  140:aload_0         
	//   62  141:aload_0         
	//   63  142:ldc2            #304 <Int 0x7f0e00e9>
	//   64  145:invokevirtual   #288 <Method View findViewById(int)>
	//   65  148:checkcast       #80  <Class TextView>
	//   66  151:putfield        #306 <Field TextView zipLabelView>
		zipView = (EditText)findViewById(0x7f0e00ea);
	//   67  154:aload_0         
	//   68  155:aload_0         
	//   69  156:ldc2            #307 <Int 0x7f0e00ea>
	//   70  159:invokevirtual   #288 <Method View findViewById(int)>
	//   71  162:checkcast       #108 <Class EditText>
	//   72  165:putfield        #137 <Field EditText zipView>
		messageView = (TextView)findViewById(0x7f0e00a7);
	//   73  168:aload_0         
	//   74  169:aload_0         
	//   75  170:ldc2            #308 <Int 0x7f0e00a7>
	//   76  173:invokevirtual   #288 <Method View findViewById(int)>
	//   77  176:checkcast       #80  <Class TextView>
	//   78  179:putfield        #61  <Field TextView messageView>
		bottomBarBtn = (TextView)findViewById(0x7f0e00a8);
	//   79  182:aload_0         
	//   80  183:aload_0         
	//   81  184:ldc2            #309 <Int 0x7f0e00a8>
	//   82  187:invokevirtual   #288 <Method View findViewById(int)>
	//   83  190:checkcast       #80  <Class TextView>
	//   84  193:putfield        #78  <Field TextView bottomBarBtn>
		progressBar = (ProgressBar)findViewById(0x7f0e00a9);
	//   85  196:aload_0         
	//   86  197:aload_0         
	//   87  198:ldc2            #310 <Int 0x7f0e00a9>
	//   88  201:invokevirtual   #288 <Method View findViewById(int)>
	//   89  204:checkcast       #86  <Class ProgressBar>
	//   90  207:putfield        #65  <Field ProgressBar progressBar>
		address1LabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802c1))));
	//   91  210:aload_0         
	//   92  211:getfield        #290 <Field TextView address1LabelView>
	//   93  214:ldc2            #311 <Int 0x7f0802c1>
	//   94  217:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//   95  220:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		address2LabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802c2))));
	//   96  223:aload_0         
	//   97  224:getfield        #294 <Field TextView address2LabelView>
	//   98  227:ldc2            #312 <Int 0x7f0802c2>
	//   99  230:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  100  233:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		cityLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802c4))));
	//  101  236:aload_0         
	//  102  237:getfield        #298 <Field TextView cityLabelView>
	//  103  240:ldc2            #313 <Int 0x7f0802c4>
	//  104  243:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  105  246:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		stateLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802ca))));
	//  106  249:aload_0         
	//  107  250:getfield        #302 <Field TextView stateLabelView>
	//  108  253:ldc2            #314 <Int 0x7f0802ca>
	//  109  256:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  110  259:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		zipLabelView.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802cd))));
	//  111  262:aload_0         
	//  112  263:getfield        #306 <Field TextView zipLabelView>
	//  113  266:ldc2            #315 <Int 0x7f0802cd>
	//  114  269:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  115  272:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
		address1View.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802f2))));
	//  116  275:aload_0         
	//  117  276:getfield        #106 <Field EditText address1View>
	//  118  279:ldc2            #316 <Int 0x7f0802f2>
	//  119  282:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  120  285:invokevirtual   #319 <Method void EditText.setHint(CharSequence)>
		address2View.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802b5))));
	//  121  288:aload_0         
	//  122  289:getfield        #131 <Field EditText address2View>
	//  123  292:ldc2            #320 <Int 0x7f0802b5>
	//  124  295:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  125  298:invokevirtual   #319 <Method void EditText.setHint(CharSequence)>
		cityView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802f2))));
	//  126  301:aload_0         
	//  127  302:getfield        #133 <Field EditText cityView>
	//  128  305:ldc2            #316 <Int 0x7f0802f2>
	//  129  308:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  130  311:invokevirtual   #319 <Method void EditText.setHint(CharSequence)>
		stateView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802f2))));
	//  131  314:aload_0         
	//  132  315:getfield        #135 <Field EditText stateView>
	//  133  318:ldc2            #316 <Int 0x7f0802f2>
	//  134  321:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  135  324:invokevirtual   #319 <Method void EditText.setHint(CharSequence)>
		zipView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f0802f2))));
	//  136  327:aload_0         
	//  137  328:getfield        #137 <Field EditText zipView>
	//  138  331:ldc2            #316 <Int 0x7f0802f2>
	//  139  334:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  140  337:invokevirtual   #319 <Method void EditText.setHint(CharSequence)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//  141  340:aload_0         
	//  142  341:aload_0         
	//  143  342:ldc2            #321 <Int 0x7f0e00af>
	//  144  345:invokevirtual   #288 <Method View findViewById(int)>
	//  145  348:checkcast       #323 <Class Toolbar>
	//  146  351:putfield        #325 <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//  147  354:aload_0         
	//  148  355:aload_0         
	//  149  356:getfield        #325 <Field Toolbar toolbar>
	//  150  359:invokevirtual   #329 <Method void setSupportActionBar(Toolbar)>
		setTitle(((CharSequence) (Res.getStudySpecificString(0x7f0802cc))));
	//  151  362:aload_0         
	//  152  363:ldc2            #330 <Int 0x7f0802cc>
	//  153  366:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//  154  369:invokevirtual   #333 <Method void setTitle(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ParticipantAddressFormActivity participantaddressformactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (participantaddressformactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class ParticipantAddressFormActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ParticipantAddressFormActivity$$Lambda$1(ParticipantAddressFormActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				ParticipantAddressFormActivity.lambda$onCreate$22(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ParticipantAddressFormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ParticipantAddressFormActivity.lambda$onCreate$22(ParticipantAddressFormActivity, View)>
			//    4    8:return          
			}

			private final ParticipantAddressFormActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ParticipantAddressFormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ParticipantAddressFormActivity arg$1>
			//    5    9:return          
			}
		}

		bottomBarBtn.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//  155  372:aload_0         
	//  156  373:getfield        #78  <Field TextView bottomBarBtn>
	//  157  376:aload_0         
	//  158  377:invokestatic    #339 <Method android.view.View$OnClickListener ParticipantAddressFormActivity$$Lambda$1.lambdaFactory$(ParticipantAddressFormActivity)>
	//  159  380:invokevirtual   #343 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		bundle = ((Bundle) (Res.getStudyId()));
	//  160  383:invokestatic    #347 <Method StudyId Res.getStudyId()>
	//  161  386:astore_1        
		_cls2..SwitchMap.com.pactforcure.app.studies.StudyId[((StudyId) (bundle)).ordinal()];
	//  162  387:getstatic       #351 <Field int[] ParticipantAddressFormActivity$2.$SwitchMap$com$pactforcure$app$studies$StudyId>
	//  163  390:aload_1         
	//  164  391:invokevirtual   #357 <Method int StudyId.ordinal()>
	//  165  394:iaload          
		JVM INSTR tableswitch 1 2: default 416
	//	               1 480
	//	               2 485;
	//  166  395:tableswitch     1 2: default 416
	//	               1 480
	//	               2 485
		   goto _L1 _L2 _L3
_L1:
		byte byte0 = 2;
	//  167  416:iconst_2        
	//  168  417:istore_2        
_L5:
		stateView.setFilters(new InputFilter[] {
			new android.text.InputFilter.LengthFilter(((int) (byte0))), new android.text.InputFilter.AllCaps()
		});
	//  169  418:aload_0         
	//  170  419:getfield        #135 <Field EditText stateView>
	//  171  422:iconst_2        
	//  172  423:anewarray       InputFilter[]
	//  173  426:dup             
	//  174  427:iconst_0        
	//  175  428:new             #361 <Class android.text.InputFilter$LengthFilter>
	//  176  431:dup             
	//  177  432:iload_2         
	//  178  433:invokespecial   #362 <Method void android.text.InputFilter$LengthFilter(int)>
	//  179  436:aastore         
	//  180  437:dup             
	//  181  438:iconst_1        
	//  182  439:new             #364 <Class android.text.InputFilter$AllCaps>
	//  183  442:dup             
	//  184  443:invokespecial   #365 <Method void android.text.InputFilter$AllCaps()>
	//  185  446:aastore         
	//  186  447:invokevirtual   #369 <Method void EditText.setFilters(InputFilter[])>
		if(bundle == StudyId.AU)
	//* 187  450:aload_1         
	//* 188  451:getstatic       #373 <Field StudyId StudyId.AU>
	//* 189  454:if_acmpne       479
			zipView.setFilters(new InputFilter[] {
				new android.text.InputFilter.LengthFilter(4)
			});
	//  190  457:aload_0         
	//  191  458:getfield        #137 <Field EditText zipView>
	//  192  461:iconst_1        
	//  193  462:anewarray       InputFilter[]
	//  194  465:dup             
	//  195  466:iconst_0        
	//  196  467:new             #361 <Class android.text.InputFilter$LengthFilter>
	//  197  470:dup             
	//  198  471:iconst_4        
	//  199  472:invokespecial   #362 <Method void android.text.InputFilter$LengthFilter(int)>
	//  200  475:aastore         
	//  201  476:invokevirtual   #369 <Method void EditText.setFilters(InputFilter[])>
		return;
	//  202  479:return          
_L2:
		byte0 = 2;
	//  203  480:iconst_2        
	//  204  481:istore_2        
		continue; /* Loop/switch isn't completed */
	//  205  482:goto            418
_L3:
		byte0 = 3;
	//  206  485:iconst_3        
	//  207  486:istore_2        
		if(true) goto _L5; else goto _L4
	//  208  487:goto            418
_L4:
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0003);
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field Toolbar toolbar>
	//    2    4:ldc2            #377 <Int 0x7f0f0003>
	//    3    7:invokevirtual   #380 <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		class .Lambda._cls2
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(ParticipantAddressFormActivity participantaddressformactivity)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls2) (participantaddressformactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class ParticipantAddressFormActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ParticipantAddressFormActivity$$Lambda$2(ParticipantAddressFormActivity)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				ParticipantAddressFormActivity.lambda$onOptionsItemSelected$23(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ParticipantAddressFormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void ParticipantAddressFormActivity.lambda$onOptionsItemSelected$23(ParticipantAddressFormActivity, DialogInterface, int)>
			//    5    9:return          
			}

			private final ParticipantAddressFormActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ParticipantAddressFormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ParticipantAddressFormActivity arg$1>
			//    5    9:return          
			}
		}

		menuitem = ((MenuItem) ((new android.support.v7.app.AlertDialog.Builder(((Context) (this)))).setTitle(((CharSequence) (getString(0x7f080078)))).setNegativeButton(0x7f080077, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(0x7f08006b, .Lambda._cls2.lambdaFactory.(this)).create()));
	//    0    0:new             #384 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #386 <Method void android.support.v7.app.AlertDialog$Builder(Context)>
	//    4    8:aload_0         
	//    5    9:ldc2            #387 <Int 0x7f080078>
	//    6   12:invokevirtual   #390 <Method String getString(int)>
	//    7   15:invokevirtual   #393 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    8   18:ldc2            #394 <Int 0x7f080077>
	//    9   21:aconst_null     
	//   10   22:invokevirtual   #398 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   25:ldc2            #399 <Int 0x7f08006b>
	//   12   28:aload_0         
	//   13   29:invokestatic    #404 <Method android.content.DialogInterface$OnClickListener ParticipantAddressFormActivity$$Lambda$2.lambdaFactory$(ParticipantAddressFormActivity)>
	//   14   32:invokevirtual   #407 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   15   35:invokevirtual   #411 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   16   38:astore_1        
		DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (menuitem)));
	//   17   39:aload_1         
	//   18   40:invokestatic    #417 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
		((AlertDialog) (menuitem)).show();
	//   19   43:aload_1         
	//   20   44:invokevirtual   #420 <Method void AlertDialog.show()>
		return true;
	//   21   47:iconst_1        
	//   22   48:ireturn         
	}

	public static final String ADDRESS1_KEY = "address1";
	public static final String ADDRESS2_KEY = "address2";
	public static final String CITY_KEY = "city";
	public static final String CONSENT_DOCUMENT_EXTRA = "consentDocument";
	public static final String STATE_KEY = "state";
	private static final String TAG = "ParticipantAddressFormA";
	public static final String ZIP_KEY = "zip";
	private TextView address1LabelView;
	private EditText address1View;
	private TextView address2LabelView;
	private EditText address2View;
	private TextView bottomBarBtn;
	private TextView cityLabelView;
	private EditText cityView;
	private ConsentDocument consentDocument;
	private TextView messageView;
	private ProgressBar progressBar;
	private TextView stateLabelView;
	private EditText stateView;
	private Toolbar toolbar;
	private TextView zipLabelView;
	private EditText zipView;


/*
	static TextView access$000(ParticipantAddressFormActivity participantaddressformactivity)
	{
		return participantaddressformactivity.messageView;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field TextView messageView>
	//    2    4:areturn         
	}

*/


/*
	static ProgressBar access$100(ParticipantAddressFormActivity participantaddressformactivity)
	{
		return participantaddressformactivity.progressBar;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field ProgressBar progressBar>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(ParticipantAddressFormActivity participantaddressformactivity)
	{
		participantaddressformactivity.goToThankYouDnaScreen();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void goToThankYouDnaScreen()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(ParticipantAddressFormActivity participantaddressformactivity, String s)
	{
		participantaddressformactivity.displayRegistrationError(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void displayRegistrationError(String)>
		return;
	//    3    5:return          
	}

*/
}
