// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.SwitchCompat;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.CurrentConnectionState;
import com.irobot.core.OTAUIServiceData;
import com.irobot.core.OTAUIServiceDataCallback;
import com.irobot.core.OTAUIServiceDataState;
import com.irobot.core.PMIApplicationService;
import com.irobot.core.PMIAssetService;
import com.irobot.core.SoftwareUpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.core.ViewId;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotAvailableLanguages;
import com.irobot.home.model.RobotPreferences;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.StandbyModeInfo;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.ConnectivityStateReceiver;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, RobotSettingsPresenter, MapPrivacyActivity_, WebViewActivity_, 
//			AboutRobotTableViewActivity_, AboutDockListActivity_, RoombaV2LanguageListActivity_, RoombaV1LanguageListActivity_, 
//			BinBehaviorActivity_, WifiSettingsActivity_, ResetTableViewActivity_, RemoveButtonActivity_, 
//			IRobotApplication

public class RobotSettingsActivity extends BaseFragmentActivity
	implements android.widget.CompoundButton.OnCheckedChangeListener, RobotSettingsPresenter.a, com.irobot.home.util.ConnectivityStateReceiver.a
{
	private class a extends OTAUIServiceDataCallback
	{

		public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
		{
			if(otauiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			Object obj = ((Object) (otauiservicedata.getDataStates()));
		//    3    5:aload_1         
		//    4    6:invokevirtual   #27  <Method ArrayList OTAUIServiceData.getDataStates()>
		//    5    9:astore_3        
			String s1 = RobotSettingsActivity.z();
		//    6   10:invokestatic    #31  <Method String RobotSettingsActivity.z()>
		//    7   13:astore          4
			StringBuilder stringbuilder = new StringBuilder();
		//    8   15:new             #33  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #34  <Method void StringBuilder()>
		//   11   22:astore          5
			stringbuilder.append("Change list: ");
		//   12   24:aload           5
		//   13   26:ldc1            #36  <String "Change list: ">
		//   14   28:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   16   32:aload           5
		//   17   34:aload_3         
		//   18   35:invokevirtual   #45  <Method String ArrayList.toString()>
		//   19   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
			com.irobot.home.util.o.b(s1, stringbuilder.toString());
		//   21   42:aload           4
		//   22   44:aload           5
		//   23   46:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   24   49:invokestatic    #52  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   25   52:aload_3         
		//   26   53:invokevirtual   #56  <Method Iterator ArrayList.iterator()>
		//   27   56:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   28   57:aload_3         
		//   29   58:invokeinterface #62  <Method boolean Iterator.hasNext()>
		//   30   63:ifeq            143
				OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
		//   31   66:aload_3         
		//   32   67:invokeinterface #66  <Method Object Iterator.next()>
		//   33   72:checkcast       #68  <Class OTAUIServiceDataState>
		//   34   75:astore          4
				static class _cls2
				{

					static final int a[];

					static 
					{
						a = new int[OTAUIServiceDataState.values().length];
					//    0    0:invokestatic    #18  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] a>
						try
						{
							a[OTAUIServiceDataState.ExpeditedOTAStatus.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field OTAUIServiceDataState OTAUIServiceDataState.ExpeditedOTAStatus>
					//    6   15:invokevirtual   #28  <Method int OTAUIServiceDataState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] a>
					//*  10   23:getstatic       #31  <Field OTAUIServiceDataState OTAUIServiceDataState.SoftwareUpdateStatus>
					//*  11   26:invokevirtual   #28  <Method int OTAUIServiceDataState.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   15   32:astore_0        
						try
						{
							a[OTAUIServiceDataState.SoftwareUpdateStatus.ordinal()] = 2;
						}
					//*  16   33:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   17   36:astore_0        
					//*  18   37:return          
					}
				}

				switch(com.irobot.home._cls2.a[otauiservicedatastate.ordinal()])
		//*  35   77:getstatic       #73  <Field int[] com.irobot.home.RobotSettingsActivity$2.a>
		//*  36   80:aload           4
		//*  37   82:invokevirtual   #77  <Method int OTAUIServiceDataState.ordinal()>
		//*  38   85:iaload          
				{
		//*  39   86:tableswitch     1 2: default 108
		//		               1 57
		//		               2 111
		//*  40  108:goto            57
				case 2: // '\002'
					RobotSettingsActivity robotsettingsactivity = a;
		//   41  111:aload_0         
		//   42  112:getfield        #12  <Field RobotSettingsActivity a>
		//   43  115:astore          4
					boolean flag;
					if(otauiservicedata.getSoftwareUpdateStatus() == SoftwareUpdateStatus.AvailableAndReady)
		//*  44  117:aload_1         
		//*  45  118:invokevirtual   #81  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
		//*  46  121:getstatic       #87  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
		//*  47  124:if_acmpne       132
						flag = true;
		//   48  127:iconst_1        
		//   49  128:istore_2        
					else
		//*  50  129:goto            134
						flag = false;
		//   51  132:iconst_0        
		//   52  133:istore_2        
					robotsettingsactivity.g(flag);
		//   53  134:aload           4
		//   54  136:iload_2         
		//   55  137:invokevirtual   #91  <Method void RobotSettingsActivity.g(boolean)>
					break;
				}
			} while(true);
		//*  56  140:goto            57
		//   57  143:return          
		}

		final RobotSettingsActivity a;

		private a()
		{
			a = RobotSettingsActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field RobotSettingsActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
		//    5    9:return          
		}

	}

	private class b
		implements android.widget.TextView.OnEditorActionListener
	{

		public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
		{
			InputMethodManager inputmethodmanager = (InputMethodManager)a.getSystemService("input_method");
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field RobotSettingsActivity a>
		//    2    4:ldc1            #30  <String "input_method">
		//    3    6:invokevirtual   #34  <Method Object RobotSettingsActivity.getSystemService(String)>
		//    4    9:checkcast       #36  <Class InputMethodManager>
		//    5   12:astore          4
			Robot robot = com.irobot.home.util.j.o(a.b);
		//    6   14:aload_0         
		//    7   15:getfield        #17  <Field RobotSettingsActivity a>
		//    8   18:getfield        #39  <Field String com.irobot.home.RobotSettingsActivity.b>
		//    9   21:invokestatic    #45  <Method Robot j.o(String)>
		//   10   24:astore          5
			if(i1 == 6 || keyevent.getKeyCode() == 66)
		//*  11   26:iload_2         
		//*  12   27:bipush          6
		//*  13   29:icmpeq          41
		//*  14   32:aload_3         
		//*  15   33:invokevirtual   #51  <Method int KeyEvent.getKeyCode()>
		//*  16   36:bipush          66
		//*  17   38:icmpne          221
			{
				textview = ((TextView) (textview.getText().toString()));
		//   18   41:aload_1         
		//   19   42:invokevirtual   #57  <Method CharSequence TextView.getText()>
		//   20   45:invokeinterface #63  <Method String CharSequence.toString()>
		//   21   50:astore_1        
				if(!((String) (textview)).isEmpty() && !Robot.f(((String) (textview))))
		//*  22   51:aload_1         
		//*  23   52:invokevirtual   #69  <Method boolean String.isEmpty()>
		//*  24   55:ifne            102
		//*  25   58:aload_1         
		//*  26   59:invokestatic    #75  <Method boolean Robot.f(String)>
		//*  27   62:ifne            102
				{
					(new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f0405).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(this, inputmethodmanager) {

						public void onClick(DialogInterface dialoginterface, int i1)
						{
							b.a.f.requestFocus();
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field RobotSettingsActivity$b b>
						//    2    4:getfield        #32  <Field RobotSettingsActivity com.irobot.home.RobotSettingsActivity$b.a>
						//    3    7:getfield        #36  <Field EditText RobotSettingsActivity.f>
						//    4   10:invokevirtual   #42  <Method boolean EditText.requestFocus()>
						//    5   13:pop             
							a.showSoftInput(((View) (b.a.f)), 1);
						//    6   14:aload_0         
						//    7   15:getfield        #23  <Field InputMethodManager a>
						//    8   18:aload_0         
						//    9   19:getfield        #21  <Field RobotSettingsActivity$b b>
						//   10   22:getfield        #32  <Field RobotSettingsActivity com.irobot.home.RobotSettingsActivity$b.a>
						//   11   25:getfield        #36  <Field EditText RobotSettingsActivity.f>
						//   12   28:iconst_1        
						//   13   29:invokevirtual   #48  <Method boolean InputMethodManager.showSoftInput(View, int)>
						//   14   32:pop             
						//   15   33:return          
						}

						final InputMethodManager a;
						final b b;

			
			{
				b = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field RobotSettingsActivity$b b>
				a = inputmethodmanager;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field InputMethodManager a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
					}
).show();
		//   28   65:new             #77  <Class android.app.AlertDialog$Builder>
		//   29   68:dup             
		//   30   69:aload_0         
		//   31   70:getfield        #17  <Field RobotSettingsActivity a>
		//   32   73:invokespecial   #80  <Method void android.app.AlertDialog$Builder(android.content.Context)>
		//   33   76:ldc1            #81  <Int 0x7f0f0405>
		//   34   78:invokevirtual   #85  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
		//   35   81:ldc1            #86  <Int 0x7f0f05bb>
		//   36   83:new             #11  <Class RobotSettingsActivity$b$1>
		//   37   86:dup             
		//   38   87:aload_0         
		//   39   88:aload           4
		//   40   90:invokespecial   #89  <Method void RobotSettingsActivity$b$1(RobotSettingsActivity$b, InputMethodManager)>
		//   41   93:invokevirtual   #93  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
		//   42   96:invokevirtual   #97  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
		//   43   99:pop             
					return false;
		//   44  100:iconst_0        
		//   45  101:ireturn         
				}
				if(!((String) (textview)).isEmpty() && !((String) (textview)).equals(((Object) (robot.i()))))
		//*  46  102:aload_1         
		//*  47  103:invokevirtual   #69  <Method boolean String.isEmpty()>
		//*  48  106:ifne            221
		//*  49  109:aload_1         
		//*  50  110:aload           5
		//*  51  112:invokevirtual   #100 <Method String Robot.i()>
		//*  52  115:invokevirtual   #104 <Method boolean String.equals(Object)>
		//*  53  118:ifne            221
				{
					com.irobot.home.RobotSettingsActivity.a(a).a(((String) (textview)));
		//   54  121:aload_0         
		//   55  122:getfield        #17  <Field RobotSettingsActivity a>
		//   56  125:invokestatic    #107 <Method RobotPreferences com.irobot.home.RobotSettingsActivity.a(RobotSettingsActivity)>
		//   57  128:aload_1         
		//   58  129:invokevirtual   #112 <Method void RobotPreferences.a(String)>
					keyevent = ((KeyEvent) (robot.s()));
		//   59  132:aload           5
		//   60  134:invokevirtual   #116 <Method AssetId Robot.s()>
		//   61  137:astore_3        
					keyevent = ((KeyEvent) (Assembler.getInstance().getPMIApplicationService().getAsset(((AssetId) (keyevent)).getId())));
		//   62  138:invokestatic    #122 <Method Assembler Assembler.getInstance()>
		//   63  141:invokevirtual   #126 <Method PMIApplicationService Assembler.getPMIApplicationService()>
		//   64  144:aload_3         
		//   65  145:invokevirtual   #131 <Method String AssetId.getId()>
		//   66  148:invokevirtual   #137 <Method PMIAssetService PMIApplicationService.getAsset(String)>
		//   67  151:astore_3        
					if(keyevent != null)
		//*  68  152:aload_3         
		//*  69  153:ifnull          196
						try
						{
							JSONObject jsonobject = new JSONObject();
		//   70  156:new             #139 <Class JSONObject>
		//   71  159:dup             
		//   72  160:invokespecial   #140 <Method void JSONObject()>
		//   73  163:astore          5
							jsonobject.put("name", ((Object) (textview)));
		//   74  165:aload           5
		//   75  167:ldc1            #142 <String "name">
		//   76  169:aload_1         
		//   77  170:invokevirtual   #146 <Method JSONObject JSONObject.put(String, Object)>
		//   78  173:pop             
							((PMIAssetService) (keyevent)).postStateCommand("SetName", jsonobject.toString());
		//   79  174:aload_3         
		//   80  175:ldc1            #148 <String "SetName">
		//   81  177:aload           5
		//   82  179:invokevirtual   #149 <Method String JSONObject.toString()>
		//   83  182:invokevirtual   #155 <Method void PMIAssetService.postStateCommand(String, String)>
						}
		//*  84  185:goto            213
						// Misplaced declaration of an exception variable
						catch(KeyEvent keyevent)
		//*  85  188:astore_3        
						{
							((JSONException) (keyevent)).printStackTrace();
		//   86  189:aload_3         
		//   87  190:invokevirtual   #158 <Method void JSONException.printStackTrace()>
						}
					else
		//*  88  193:goto            213
						a.r.a(com.irobot.home.RobotSettingsActivity.a(a));
		//   89  196:aload_0         
		//   90  197:getfield        #17  <Field RobotSettingsActivity a>
		//   91  200:getfield        #162 <Field com.irobot.home.q.b RobotSettingsActivity.r>
		//   92  203:aload_0         
		//   93  204:getfield        #17  <Field RobotSettingsActivity a>
		//   94  207:invokestatic    #107 <Method RobotPreferences com.irobot.home.RobotSettingsActivity.a(RobotSettingsActivity)>
		//   95  210:invokevirtual   #167 <Method void com.irobot.home.q.b.a(RobotPreferences)>
					a.b(((String) (textview)));
		//   96  213:aload_0         
		//   97  214:getfield        #17  <Field RobotSettingsActivity a>
		//   98  217:aload_1         
		//   99  218:invokevirtual   #169 <Method void com.irobot.home.RobotSettingsActivity.b(String)>
				}
			}
			a.f.setVisibility(8);
		//  100  221:aload_0         
		//  101  222:getfield        #17  <Field RobotSettingsActivity a>
		//  102  225:getfield        #172 <Field EditText RobotSettingsActivity.f>
		//  103  228:bipush          8
		//  104  230:invokevirtual   #178 <Method void EditText.setVisibility(int)>
			a.c.setVisibility(0);
		//  105  233:aload_0         
		//  106  234:getfield        #17  <Field RobotSettingsActivity a>
		//  107  237:getfield        #182 <Field CustomTextView RobotSettingsActivity.c>
		//  108  240:iconst_0        
		//  109  241:invokevirtual   #185 <Method void CustomTextView.setVisibility(int)>
			inputmethodmanager.hideSoftInputFromWindow(a.f.getWindowToken(), 0);
		//  110  244:aload           4
		//  111  246:aload_0         
		//  112  247:getfield        #17  <Field RobotSettingsActivity a>
		//  113  250:getfield        #172 <Field EditText RobotSettingsActivity.f>
		//  114  253:invokevirtual   #189 <Method android.os.IBinder EditText.getWindowToken()>
		//  115  256:iconst_0        
		//  116  257:invokevirtual   #193 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
		//  117  260:pop             
			return false;
		//  118  261:iconst_0        
		//  119  262:ireturn         
		}

		final RobotSettingsActivity a;

		private b()
		{
			a = RobotSettingsActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field RobotSettingsActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}


	public RobotSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void BaseFragmentActivity()>
		N = new a();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class RobotSettingsActivity$a>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #85  <Method void RobotSettingsActivity$a(RobotSettingsActivity, RobotSettingsActivity$1)>
	//    8   14:putfield        #87  <Field RobotSettingsActivity$a N>
	//    9   17:return          
	}

	private void A()
	{
		boolean flag = I.getServiceData().isConnectedLocally();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field AssetNetworkUIService I>
	//    2    4:invokevirtual   #95  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//    3    7:invokevirtual   #101 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//    4   10:istore_2        
		j.setEnabled(flag);
	//    5   11:aload_0         
	//    6   12:getfield        #103 <Field View j>
	//    7   15:iload_2         
	//    8   16:invokevirtual   #109 <Method void View.setEnabled(boolean)>
		int i1;
		if(flag)
	//*   9   19:iload_2         
	//*  10   20:ifeq            29
			i1 = 0x7f1001e2;
	//   11   23:ldc1            #110 <Int 0x7f1001e2>
	//   12   25:istore_1        
		else
	//*  13   26:goto            32
			i1 = 0x7f1001ec;
	//   14   29:ldc1            #111 <Int 0x7f1001ec>
	//   15   31:istore_1        
		c.setTextAppearance(((android.content.Context) (this)), i1);
	//   16   32:aload_0         
	//   17   33:getfield        #113 <Field CustomTextView c>
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:invokevirtual   #119 <Method void CustomTextView.setTextAppearance(android.content.Context, int)>
	//   21   41:return          
	}

	static RobotPreferences a(RobotSettingsActivity robotsettingsactivity)
	{
		return robotsettingsactivity.G;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field RobotPreferences G>
	//    2    4:areturn         
	}

	private void h(boolean flag)
	{
		int i1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			i1 = 0x7f1001e2;
	//    2    4:ldc1            #110 <Int 0x7f1001e2>
	//    3    6:istore_2        
		else
	//*   4    7:goto            13
			i1 = 0x7f1001ec;
	//    5   10:ldc1            #111 <Int 0x7f1001ec>
	//    6   12:istore_2        
		n.setEnabled(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #124 <Field View n>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #109 <Method void View.setEnabled(boolean)>
		((Button)n).setTextAppearance(((android.content.Context) (this)), i1);
	//   11   21:aload_0         
	//   12   22:getfield        #124 <Field View n>
	//   13   25:checkcast       #126 <Class Button>
	//   14   28:aload_0         
	//   15   29:iload_2         
	//   16   30:invokevirtual   #127 <Method void Button.setTextAppearance(android.content.Context, int)>
	//   17   33:return          
	}

	private void i(boolean flag)
	{
		int i1;
		String s1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			i1 = 0x7f0f01aa;
	//    2    4:ldc1            #128 <Int 0x7f0f01aa>
	//    3    6:istore_2        
		else
	//*   4    7:aload_0         
	//*   5    8:iload_2         
	//*   6    9:invokevirtual   #132 <Method String getString(int)>
	//*   7   12:astore_3        
	//*   8   13:goto            22
			i1 = 0x7f0f01a9;
	//    9   16:ldc1            #133 <Int 0x7f0f01a9>
	//   10   18:istore_2        
		s1 = getString(i1);
	//*  11   19:goto            7
		com.irobot.home.util.j.a(e, s1);
	//   12   22:aload_0         
	//   13   23:getfield        #135 <Field RelativeLayout e>
	//   14   26:aload_3         
	//   15   27:invokestatic    #140 <Method void j.a(RelativeLayout, String)>
	//   16   30:return          
	}

	static String z()
	{
		return D;
	//    0    0:getstatic       #143 <Field String D>
	//    1    3:areturn         
	}

	public void a(String s1)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #147 <Method boolean isFinishing()>
	//*   2    4:ifne            58
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #150 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			c(s1);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #152 <Method void c(String)>
			w.setVisibility(8);
	//   10   20:aload_0         
	//   11   21:getfield        #154 <Field ProgressBar w>
	//   12   24:bipush          8
	//   13   26:invokevirtual   #160 <Method void ProgressBar.setVisibility(int)>
			d.setVisibility(0);
	//   14   29:aload_0         
	//   15   30:getfield        #162 <Field CustomTextView d>
	//   16   33:iconst_0        
	//   17   34:invokevirtual   #163 <Method void CustomTextView.setVisibility(int)>
			com.irobot.home.util.j.a(k, v, I.getServiceData().isConnectedLocally());
	//   18   37:aload_0         
	//   19   38:getfield        #165 <Field View k>
	//   20   41:aload_0         
	//   21   42:getfield        #167 <Field CustomTextView v>
	//   22   45:aload_0         
	//   23   46:getfield        #89  <Field AssetNetworkUIService I>
	//   24   49:invokevirtual   #95  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   25   52:invokevirtual   #101 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//   26   55:invokestatic    #170 <Method void j.a(View, CustomTextView, boolean)>
		}
	//   27   58:return          
	}

	public void a(boolean flag)
	{
		K = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #172 <Field boolean K>
	//    3    5:return          
	}

	public void b(String s1)
	{
		Object obj = ((Object) (com.irobot.home.util.j.o(b)));
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field String b>
	//    2    4:invokestatic    #177 <Method Robot j.o(String)>
	//    3    7:astore          6
		E = com.irobot.home.util.j.a(x, getString(0x7f0f048f), ((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #179 <Field RelativeLayout x>
	//    7   14:aload_0         
	//    8   15:ldc1            #180 <Int 0x7f0f048f>
	//    9   17:invokevirtual   #132 <Method String getString(int)>
	//   10   20:aload_0         
	//   11   21:invokestatic    #183 <Method SwitchCompat j.a(RelativeLayout, String, android.widget.CompoundButton$OnCheckedChangeListener)>
	//   12   24:putfield        #185 <Field SwitchCompat E>
		E.setChecked(i.f);
	//   13   27:aload_0         
	//   14   28:getfield        #185 <Field SwitchCompat E>
	//   15   31:getstatic       #189 <Field boolean i.f>
	//   16   34:invokevirtual   #194 <Method void SwitchCompat.setChecked(boolean)>
		((Button)l).setText(((CharSequence) (getString(0x7f0f075a, new Object[] {
			s1
		}))));
	//   17   37:aload_0         
	//   18   38:getfield        #196 <Field View l>
	//   19   41:checkcast       #126 <Class Button>
	//   20   44:aload_0         
	//   21   45:ldc1            #197 <Int 0x7f0f075a>
	//   22   47:iconst_1        
	//   23   48:anewarray       Object[]
	//   24   51:dup             
	//   25   52:iconst_0        
	//   26   53:aload_1         
	//   27   54:aastore         
	//   28   55:invokevirtual   #202 <Method String getString(int, Object[])>
	//   29   58:invokevirtual   #206 <Method void Button.setText(CharSequence)>
		((Button)m).setText(((CharSequence) (getString(0x7f0f074a, new Object[] {
			s1
		}))));
	//   30   61:aload_0         
	//   31   62:getfield        #208 <Field View m>
	//   32   65:checkcast       #126 <Class Button>
	//   33   68:aload_0         
	//   34   69:ldc1            #209 <Int 0x7f0f074a>
	//   35   71:iconst_1        
	//   36   72:anewarray       Object[]
	//   37   75:dup             
	//   38   76:iconst_0        
	//   39   77:aload_1         
	//   40   78:aastore         
	//   41   79:invokevirtual   #202 <Method String getString(int, Object[])>
	//   42   82:invokevirtual   #206 <Method void Button.setText(CharSequence)>
		u.setText(((CharSequence) (getString(0x7f0f0026, new Object[] {
			s1
		}))));
	//   43   85:aload_0         
	//   44   86:getfield        #211 <Field CustomTextView u>
	//   45   89:aload_0         
	//   46   90:ldc1            #212 <Int 0x7f0f0026>
	//   47   92:iconst_1        
	//   48   93:anewarray       Object[]
	//   49   96:dup             
	//   50   97:iconst_0        
	//   51   98:aload_1         
	//   52   99:aastore         
	//   53  100:invokevirtual   #202 <Method String getString(int, Object[])>
	//   54  103:invokevirtual   #213 <Method void CustomTextView.setText(CharSequence)>
		boolean flag;
		if(I.getServiceData().getCurrentConnectionState() == CurrentConnectionState.ConnectedLocally)
	//*  55  106:aload_0         
	//*  56  107:getfield        #89  <Field AssetNetworkUIService I>
	//*  57  110:invokevirtual   #95  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  58  113:invokevirtual   #217 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//*  59  116:getstatic       #223 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*  60  119:if_acmpne       127
			flag = true;
	//   61  122:iconst_1        
	//   62  123:istore_2        
		else
	//*  63  124:goto            129
			flag = false;
	//   64  127:iconst_0        
	//   65  128:istore_2        
		boolean flag1;
		if(I.getServiceData().getCurrentConnectionState() == CurrentConnectionState.ConnectedRemotely)
	//*  66  129:aload_0         
	//*  67  130:getfield        #89  <Field AssetNetworkUIService I>
	//*  68  133:invokevirtual   #95  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  69  136:invokevirtual   #217 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//*  70  139:getstatic       #226 <Field CurrentConnectionState CurrentConnectionState.ConnectedRemotely>
	//*  71  142:if_acmpne       150
			flag1 = true;
	//   72  145:iconst_1        
	//   73  146:istore_3        
		else
	//*  74  147:goto            152
			flag1 = false;
	//   75  150:iconst_0        
	//   76  151:istore_3        
		Object obj1 = ((Object) ((CustomTextView)y.findViewById(0x7f09042a)));
	//   77  152:aload_0         
	//   78  153:getfield        #228 <Field RelativeLayout y>
	//   79  156:ldc1            #229 <Int 0x7f09042a>
	//   80  158:invokevirtual   #235 <Method View RelativeLayout.findViewById(int)>
	//   81  161:checkcast       #115 <Class CustomTextView>
	//   82  164:astore          7
		RelativeLayout relativelayout = y;
	//   83  166:aload_0         
	//   84  167:getfield        #228 <Field RelativeLayout y>
	//   85  170:astore          8
		boolean flag2;
		if(!flag && !flag1)
	//*  86  172:iload_2         
	//*  87  173:ifne            189
	//*  88  176:iload_3         
	//*  89  177:ifeq            183
	//*  90  180:goto            189
			flag2 = false;
	//   91  183:iconst_0        
	//   92  184:istore          4
		else
	//*  93  186:goto            192
			flag2 = true;
	//   94  189:iconst_1        
	//   95  190:istore          4
		com.irobot.home.util.j.a(((View) (relativelayout)), ((CustomTextView) (obj1)), flag2);
	//   96  192:aload           8
	//   97  194:aload           7
	//   98  196:iload           4
	//   99  198:invokestatic    #170 <Method void j.a(View, CustomTextView, boolean)>
		boolean flag3 = I.getServiceData().isConnectedLocally();
	//  100  201:aload_0         
	//  101  202:getfield        #89  <Field AssetNetworkUIService I>
	//  102  205:invokevirtual   #95  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//  103  208:invokevirtual   #101 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//  104  211:istore          5
		obj = ((Object) (((Robot) (obj)).k()));
	//  105  213:aload           6
	//  106  215:invokevirtual   #240 <Method RobotAvailableLanguages Robot.k()>
	//  107  218:astore          6
		if(obj != null && ((RobotAvailableLanguages) (obj)).b() > 0)
	//* 108  220:aload           6
	//* 109  222:ifnull          238
	//* 110  225:aload           6
	//* 111  227:invokevirtual   #245 <Method int RobotAvailableLanguages.b()>
	//* 112  230:ifle            238
			flag = true;
	//  113  233:iconst_1        
	//  114  234:istore_2        
		else
	//* 115  235:goto            240
			flag = false;
	//  116  238:iconst_0        
	//  117  239:istore_2        
		obj = ((Object) (k));
	//  118  240:aload_0         
	//  119  241:getfield        #165 <Field View k>
	//  120  244:astore          6
		obj1 = ((Object) (v));
	//  121  246:aload_0         
	//  122  247:getfield        #167 <Field CustomTextView v>
	//  123  250:astore          7
		if(flag3 && flag)
	//* 124  252:iload           5
	//* 125  254:ifeq            267
	//* 126  257:iload_2         
	//* 127  258:ifeq            267
			flag2 = true;
	//  128  261:iconst_1        
	//  129  262:istore          4
		else
	//* 130  264:goto            270
			flag2 = false;
	//  131  267:iconst_0        
	//  132  268:istore          4
		com.irobot.home.util.j.a(((View) (obj)), ((CustomTextView) (obj1)), flag2);
	//  133  270:aload           6
	//  134  272:aload           7
	//  135  274:iload           4
	//  136  276:invokestatic    #170 <Method void j.a(View, CustomTextView, boolean)>
		l.setEnabled(flag3);
	//  137  279:aload_0         
	//  138  280:getfield        #196 <Field View l>
	//  139  283:iload           5
	//  140  285:invokevirtual   #109 <Method void View.setEnabled(boolean)>
		int i1;
		if(flag3)
	//* 141  288:iload           5
	//* 142  290:ifeq            299
			i1 = 0x7f1001e2;
	//  143  293:ldc1            #110 <Int 0x7f1001e2>
	//  144  295:istore_2        
		else
	//* 145  296:goto            302
			i1 = 0x7f1001ec;
	//  146  299:ldc1            #111 <Int 0x7f1001ec>
	//  147  301:istore_2        
		((Button)l).setTextAppearance(((android.content.Context) (this)), i1);
	//  148  302:aload_0         
	//  149  303:getfield        #196 <Field View l>
	//  150  306:checkcast       #126 <Class Button>
	//  151  309:aload_0         
	//  152  310:iload_2         
	//  153  311:invokevirtual   #127 <Method void Button.setTextAppearance(android.content.Context, int)>
		((Button)m).setTextAppearance(((android.content.Context) (this)), 0x7f1001e2);
	//  154  314:aload_0         
	//  155  315:getfield        #208 <Field View m>
	//  156  318:checkcast       #126 <Class Button>
	//  157  321:aload_0         
	//  158  322:ldc1            #110 <Int 0x7f1001e2>
	//  159  324:invokevirtual   #127 <Method void Button.setTextAppearance(android.content.Context, int)>
		A();
	//  160  327:aload_0         
	//  161  328:invokespecial   #247 <Method void A()>
		c.setText(((CharSequence) (s1)));
	//  162  331:aload_0         
	//  163  332:getfield        #113 <Field CustomTextView c>
	//  164  335:aload_1         
	//  165  336:invokevirtual   #213 <Method void CustomTextView.setText(CharSequence)>
		obj = ((Object) (j));
	//  166  339:aload_0         
	//  167  340:getfield        #103 <Field View j>
	//  168  343:astore          6
		obj1 = ((Object) (new StringBuilder()));
	//  169  345:new             #249 <Class StringBuilder>
	//  170  348:dup             
	//  171  349:invokespecial   #250 <Method void StringBuilder()>
	//  172  352:astore          7
		((StringBuilder) (obj1)).append(getString(0x7f0f0775));
	//  173  354:aload           7
	//  174  356:aload_0         
	//  175  357:ldc1            #251 <Int 0x7f0f0775>
	//  176  359:invokevirtual   #132 <Method String getString(int)>
	//  177  362:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//  178  365:pop             
		((StringBuilder) (obj1)).append(s1);
	//  179  366:aload           7
	//  180  368:aload_1         
	//  181  369:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//  182  372:pop             
		((View) (obj)).setContentDescription(((CharSequence) (((StringBuilder) (obj1)).toString())));
	//  183  373:aload           6
	//  184  375:aload           7
	//  185  377:invokevirtual   #258 <Method String StringBuilder.toString()>
	//  186  380:invokevirtual   #261 <Method void View.setContentDescription(CharSequence)>
		l.setContentDescription(((CharSequence) (getString(0x7f0f075a, new Object[] {
			s1
		}))));
	//  187  383:aload_0         
	//  188  384:getfield        #196 <Field View l>
	//  189  387:aload_0         
	//  190  388:ldc1            #197 <Int 0x7f0f075a>
	//  191  390:iconst_1        
	//  192  391:anewarray       Object[]
	//  193  394:dup             
	//  194  395:iconst_0        
	//  195  396:aload_1         
	//  196  397:aastore         
	//  197  398:invokevirtual   #202 <Method String getString(int, Object[])>
	//  198  401:invokevirtual   #261 <Method void View.setContentDescription(CharSequence)>
		m.setContentDescription(((CharSequence) (getString(0x7f0f074a, new Object[] {
			s1
		}))));
	//  199  404:aload_0         
	//  200  405:getfield        #208 <Field View m>
	//  201  408:aload_0         
	//  202  409:ldc1            #209 <Int 0x7f0f074a>
	//  203  411:iconst_1        
	//  204  412:anewarray       Object[]
	//  205  415:dup             
	//  206  416:iconst_0        
	//  207  417:aload_1         
	//  208  418:aastore         
	//  209  419:invokevirtual   #202 <Method String getString(int, Object[])>
	//  210  422:invokevirtual   #261 <Method void View.setContentDescription(CharSequence)>
	//  211  425:return          
	}

	public void b(boolean flag)
	{
		h(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #263 <Method void h(boolean)>
	//    3    5:return          
	}

	void c(String s1)
	{
		d.setText(((CharSequence) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field CustomTextView d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #213 <Method void CustomTextView.setText(CharSequence)>
		d.setContentDescription(((CharSequence) (s1)));
	//    4    8:aload_0         
	//    5    9:getfield        #162 <Field CustomTextView d>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #264 <Method void CustomTextView.setContentDescription(CharSequence)>
	//    8   16:return          
	}

	void c(boolean flag)
	{
		String s1 = com.irobot.home.util.j.a(b).a().getSku();
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field String b>
	//    2    4:invokestatic    #269 <Method a j.a(String)>
	//    3    7:invokevirtual   #274 <Method AssetInfo a.a()>
	//    4   10:invokevirtual   #279 <Method String AssetInfo.getSku()>
	//    5   13:astore_2        
		Locale locale = Locale.getDefault();
	//    6   14:invokestatic    #285 <Method Locale Locale.getDefault()>
	//    7   17:astore_3        
		H = A.getStandbyModeInfo(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((android.content.Context) (this))), s1);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #287 <Field CustomerCareRestClient A>
	//   11   23:aload_3         
	//   12   24:invokestatic    #290 <Method String j.a(Locale)>
	//   13   27:aload_0         
	//   14   28:invokestatic    #293 <Method String j.h(android.content.Context)>
	//   15   31:aload_2         
	//   16   32:invokeinterface #299 <Method StandbyModeInfo CustomerCareRestClient.getStandbyModeInfo(String, String, String)>
	//   17   37:putfield        #301 <Field StandbyModeInfo H>
		if(flag)
	//*  18   40:iload_1         
	//*  19   41:ifeq            91
			try
			{
				h();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #303 <Method void h()>
				return;
	//   22   48:return          
			}
			catch(Exception exception)
	//*  23   49:astore_2        
			{
				String s2 = D;
	//   24   50:getstatic       #143 <Field String D>
	//   25   53:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   26   54:new             #249 <Class StringBuilder>
	//   27   57:dup             
	//   28   58:invokespecial   #250 <Method void StringBuilder()>
	//   29   61:astore          4
				stringbuilder.append("Error in getStandbyModeInfo: ");
	//   30   63:aload           4
	//   31   65:ldc2            #305 <String "Error in getStandbyModeInfo: ">
	//   32   68:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
				stringbuilder.append(exception.getMessage());
	//   34   72:aload           4
	//   35   74:aload_2         
	//   36   75:invokevirtual   #308 <Method String Exception.getMessage()>
	//   37   78:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:pop             
				com.irobot.home.util.o.e(s2, stringbuilder.toString());
	//   39   82:aload_3         
	//   40   83:aload           4
	//   41   85:invokevirtual   #258 <Method String StringBuilder.toString()>
	//   42   88:invokestatic    #313 <Method void o.e(String, String)>
			}
		return;
	//   43   91:return          
	}

	public void d(boolean flag)
	{
		com.irobot.home.util.j.a(y, 0x7f0f00e4);
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field RelativeLayout y>
	//    2    4:ldc2            #314 <Int 0x7f0f00e4>
	//    3    7:invokestatic    #317 <Method TextView j.a(RelativeLayout, int)>
	//    4   10:pop             
		RelativeLayout relativelayout = y;
	//    5   11:aload_0         
	//    6   12:getfield        #228 <Field RelativeLayout y>
	//    7   15:astore_3        
		int i1;
		String s1;
		if(flag)
	//*   8   16:iload_1         
	//*   9   17:ifeq            34
			i1 = 0x7f0f0603;
	//   10   20:ldc2            #318 <Int 0x7f0f0603>
	//   11   23:istore_2        
		else
	//*  12   24:aload_0         
	//*  13   25:iload_2         
	//*  14   26:invokevirtual   #132 <Method String getString(int)>
	//*  15   29:astore          4
	//*  16   31:goto            41
			i1 = 0x7f0f041f;
	//   17   34:ldc2            #319 <Int 0x7f0f041f>
	//   18   37:istore_2        
		s1 = getString(i1);
	//*  19   38:goto            24
		com.irobot.home.util.j.c(relativelayout, s1);
	//   20   41:aload_3         
	//   21   42:aload           4
	//   22   44:invokestatic    #322 <Method TextView j.c(RelativeLayout, String)>
	//   23   47:pop             
		y.setVisibility(0);
	//   24   48:aload_0         
	//   25   49:getfield        #228 <Field RelativeLayout y>
	//   26   52:iconst_0        
	//   27   53:invokevirtual   #323 <Method void RelativeLayout.setVisibility(int)>
		L = flag;
	//   28   56:aload_0         
	//   29   57:iload_1         
	//   30   58:putfield        #325 <Field boolean L>
	//   31   61:return          
	}

	public void d_()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #147 <Method boolean isFinishing()>
	//*   2    4:ifne            22
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #150 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			c("");
	//    7   15:aload_0         
	//    8   16:ldc2            #328 <String "">
	//    9   19:invokevirtual   #152 <Method void c(String)>
		}
	//   10   22:return          
	}

	void e()
	{
		b(0x7f0f07f8);
	//    0    0:aload_0         
	//    1    1:ldc2            #329 <Int 0x7f0f07f8>
	//    2    4:invokevirtual   #331 <Method void b(int)>
		setResult(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #334 <Method void setResult(int)>
		ConnectivityStateReceiver.a().a(((com.irobot.home.util.ConnectivityStateReceiver.a) (this)));
	//    6   12:invokestatic    #339 <Method ConnectivityStateReceiver ConnectivityStateReceiver.a()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #342 <Method boolean ConnectivityStateReceiver.a(com.irobot.home.util.ConnectivityStateReceiver$a)>
	//    9   19:pop             
		if(G == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #122 <Field RobotPreferences G>
	//*  12   24:ifnonnull       55
		{
			G = new RobotPreferences();
	//   13   27:aload_0         
	//   14   28:new             #344 <Class RobotPreferences>
	//   15   31:dup             
	//   16   32:invokespecial   #345 <Method void RobotPreferences()>
	//   17   35:putfield        #122 <Field RobotPreferences G>
			G.a(com.irobot.home.util.j.o(b).a());
	//   18   38:aload_0         
	//   19   39:getfield        #122 <Field RobotPreferences G>
	//   20   42:aload_0         
	//   21   43:getfield        #174 <Field String b>
	//   22   46:invokestatic    #177 <Method Robot j.o(String)>
	//   23   49:invokevirtual   #348 <Method RobotPreferences Robot.a()>
	//   24   52:invokevirtual   #351 <Method void RobotPreferences.a(RobotPreferences)>
		}
		B = new com.irobot.home.view.b(((android.content.Context) (this)));
	//   25   55:aload_0         
	//   26   56:new             #353 <Class b>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #356 <Method void b(android.content.Context)>
	//   30   64:putfield        #358 <Field b B>
		AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//   31   67:aload_0         
	//   32   68:getfield        #174 <Field String b>
	//   33   71:invokestatic    #269 <Method a j.a(String)>
	//   34   74:invokevirtual   #274 <Method AssetInfo a.a()>
	//   35   77:astore_1        
		I = Assembler.getInstance().getNetworkUIService(assetinfo.getAssetId());
	//   36   78:aload_0         
	//   37   79:invokestatic    #364 <Method Assembler Assembler.getInstance()>
	//   38   82:aload_1         
	//   39   83:invokevirtual   #368 <Method AssetId AssetInfo.getAssetId()>
	//   40   86:invokevirtual   #372 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   41   89:putfield        #89  <Field AssetNetworkUIService I>
		b(assetinfo.getName());
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:invokevirtual   #375 <Method String AssetInfo.getName()>
	//   45   97:invokevirtual   #377 <Method void b(String)>
		A = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   46  100:aload_0         
	//   47  101:aload_0         
	//   48  102:invokestatic    #380 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   49  105:putfield        #287 <Field CustomerCareRestClient A>
		c(false);
	//   50  108:aload_0         
	//   51  109:iconst_0        
	//   52  110:invokevirtual   #382 <Method void c(boolean)>
		f.setOnEditorActionListener(((android.widget.TextView.OnEditorActionListener) (new b())));
	//   53  113:aload_0         
	//   54  114:getfield        #384 <Field EditText f>
	//   55  117:new             #19  <Class RobotSettingsActivity$b>
	//   56  120:dup             
	//   57  121:aload_0         
	//   58  122:aconst_null     
	//   59  123:invokespecial   #385 <Method void RobotSettingsActivity$b(RobotSettingsActivity, RobotSettingsActivity$1)>
	//   60  126:invokevirtual   #391 <Method void EditText.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		f.setFilters(new InputFilter[] {
			new android.text.InputFilter.LengthFilter(16)
		});
	//   61  129:aload_0         
	//   62  130:getfield        #384 <Field EditText f>
	//   63  133:iconst_1        
	//   64  134:anewarray       InputFilter[]
	//   65  137:dup             
	//   66  138:iconst_0        
	//   67  139:new             #395 <Class android.text.InputFilter$LengthFilter>
	//   68  142:dup             
	//   69  143:bipush          16
	//   70  145:invokespecial   #397 <Method void android.text.InputFilter$LengthFilter(int)>
	//   71  148:aastore         
	//   72  149:invokevirtual   #401 <Method void EditText.setFilters(InputFilter[])>
		((Button)n).setText(0x7f0f0799);
	//   73  152:aload_0         
	//   74  153:getfield        #124 <Field View n>
	//   75  156:checkcast       #126 <Class Button>
	//   76  159:ldc2            #402 <Int 0x7f0f0799>
	//   77  162:invokevirtual   #404 <Method void Button.setText(int)>
		J = new RobotSettingsPresenter(((RobotSettingsPresenter.a) (this)), assetinfo, Assembler.getInstance());
	//   78  165:aload_0         
	//   79  166:new             #406 <Class RobotSettingsPresenter>
	//   80  169:dup             
	//   81  170:aload_0         
	//   82  171:aload_1         
	//   83  172:invokestatic    #364 <Method Assembler Assembler.getInstance()>
	//   84  175:invokespecial   #409 <Method void RobotSettingsPresenter(RobotSettingsPresenter$a, AssetInfo, Assembler)>
	//   85  178:putfield        #411 <Field RobotSettingsPresenter J>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.Settings, assetinfo);
	//   86  181:invokestatic    #416 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   87  184:getstatic       #422 <Field ViewId ViewId.Settings>
	//   88  187:aload_1         
	//   89  188:invokevirtual   #426 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		C = Assembler.getInstance().getUpdateUIService(assetinfo.getAssetId());
	//   90  191:aload_0         
	//   91  192:invokestatic    #364 <Method Assembler Assembler.getInstance()>
	//   92  195:aload_1         
	//   93  196:invokevirtual   #368 <Method AssetId AssetInfo.getAssetId()>
	//   94  199:invokevirtual   #430 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   95  202:putfield        #432 <Field UpdateUIService C>
		I = Assembler.getInstance().getNetworkUIService(assetinfo.getAssetId());
	//   96  205:aload_0         
	//   97  206:invokestatic    #364 <Method Assembler Assembler.getInstance()>
	//   98  209:aload_1         
	//   99  210:invokevirtual   #368 <Method AssetId AssetInfo.getAssetId()>
	//  100  213:invokevirtual   #372 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//  101  216:putfield        #89  <Field AssetNetworkUIService I>
		h(com.irobot.home.util.j.a());
	//  102  219:aload_0         
	//  103  220:invokestatic    #434 <Method boolean j.a()>
	//  104  223:invokespecial   #263 <Method void h(boolean)>
	//  105  226:return          
	}

	public void e(boolean flag)
	{
		M = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #436 <Field boolean M>
		F = com.irobot.home.util.j.a(e, getString(0x7f0f01ab), ((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #135 <Field RelativeLayout e>
	//    6   10:aload_0         
	//    7   11:ldc2            #437 <Int 0x7f0f01ab>
	//    8   14:invokevirtual   #132 <Method String getString(int)>
	//    9   17:aload_0         
	//   10   18:invokestatic    #183 <Method SwitchCompat j.a(RelativeLayout, String, android.widget.CompoundButton$OnCheckedChangeListener)>
	//   11   21:putfield        #439 <Field SwitchCompat F>
		i(flag);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #441 <Method void i(boolean)>
		F.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//   15   29:aload_0         
	//   16   30:getfield        #439 <Field SwitchCompat F>
	//   17   33:aconst_null     
	//   18   34:invokevirtual   #445 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		F.setChecked(flag);
	//   19   37:aload_0         
	//   20   38:getfield        #439 <Field SwitchCompat F>
	//   21   41:iload_1         
	//   22   42:invokevirtual   #194 <Method void SwitchCompat.setChecked(boolean)>
		F.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//   23   45:aload_0         
	//   24   46:getfield        #439 <Field SwitchCompat F>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #445 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		e.setVisibility(0);
	//   27   53:aload_0         
	//   28   54:getfield        #135 <Field RelativeLayout e>
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #323 <Method void RelativeLayout.setVisibility(int)>
	//   31   61:return          
	}

	void f()
	{
		if(H != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field StandbyModeInfo H>
	//*   2    4:ifnull          12
		{
			h();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #303 <Method void h()>
			return;
	//    5   11:return          
		} else
		{
			c(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #382 <Method void c(boolean)>
			return;
	//    9   17:return          
		}
	}

	public void f(boolean flag)
	{
		M = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #436 <Field boolean M>
		z.setVisibility(0);
	//    3    5:aload_0         
	//    4    6:getfield        #447 <Field CustomButton z>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #450 <Method void CustomButton.setVisibility(int)>
		i.setVisibility(0);
	//    7   13:aload_0         
	//    8   14:getfield        #452 <Field View i>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #453 <Method void View.setVisibility(int)>
	//   11   21:return          
	}

	void g()
	{
		com.irobot.home.MapPrivacyActivity_.a(((android.content.Context) (this))).b(true).a(M).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #458 <Method MapPrivacyActivity_$a com.irobot.home.MapPrivacyActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #463 <Method MapPrivacyActivity_$a com.irobot.home.MapPrivacyActivity_$a.b(boolean)>
	//    4    8:aload_0         
	//    5    9:getfield        #436 <Field boolean M>
	//    6   12:invokevirtual   #465 <Method MapPrivacyActivity_$a com.irobot.home.MapPrivacyActivity_$a.a(boolean)>
	//    7   15:invokevirtual   #468 <Method org.androidannotations.api.a.e com.irobot.home.MapPrivacyActivity_$a.a()>
	//    8   18:pop             
	//    9   19:return          
	}

	protected void g(boolean flag)
	{
		View view = o.findViewById(0x7f090470);
	//    0    0:aload_0         
	//    1    1:getfield        #470 <Field RelativeLayout o>
	//    2    4:ldc2            #471 <Int 0x7f090470>
	//    3    7:invokevirtual   #235 <Method View RelativeLayout.findViewById(int)>
	//    4   10:astore          4
		byte byte1 = 8;
	//    5   12:bipush          8
	//    6   14:istore_3        
		byte byte0;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            24
			byte0 = 0;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		else
	//*  11   21:goto            27
			byte0 = 8;
	//   12   24:bipush          8
	//   13   26:istore_2        
		view.setVisibility(((int) (byte0)));
	//   14   27:aload           4
	//   15   29:iload_2         
	//   16   30:invokevirtual   #453 <Method void View.setVisibility(int)>
		view = o.findViewById(0x7f090054);
	//   17   33:aload_0         
	//   18   34:getfield        #470 <Field RelativeLayout o>
	//   19   37:ldc2            #472 <Int 0x7f090054>
	//   20   40:invokevirtual   #235 <Method View RelativeLayout.findViewById(int)>
	//   21   43:astore          4
		if(flag)
	//*  22   45:iload_1         
	//*  23   46:ifeq            54
			byte0 = byte1;
	//   24   49:iload_3         
	//   25   50:istore_2        
		else
	//*  26   51:goto            56
			byte0 = 0;
	//   27   54:iconst_0        
	//   28   55:istore_2        
		view.setVisibility(((int) (byte0)));
	//   29   56:aload           4
	//   30   58:iload_2         
	//   31   59:invokevirtual   #453 <Method void View.setVisibility(int)>
	//   32   62:return          
	}

	void h()
	{
		if(H != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field StandbyModeInfo H>
	//*   2    4:ifnull          77
		{
			WebViewActivity_.a a1 = com.irobot.home.WebViewActivity_.a(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #477 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(android.content.Context)>
	//    5   11:astore_2        
			Object obj;
			if(H.standbyModeLink == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #301 <Field StandbyModeInfo H>
	//*   8   16:getfield        #482 <Field String StandbyModeInfo.standbyModeLink>
	//*   9   19:ifnonnull       29
				obj = "";
	//   10   22:ldc2            #328 <String "">
	//   11   25:astore_1        
			else
	//*  12   26:goto            37
				obj = ((Object) (H.standbyModeLink));
	//   13   29:aload_0         
	//   14   30:getfield        #301 <Field StandbyModeInfo H>
	//   15   33:getfield        #482 <Field String StandbyModeInfo.standbyModeLink>
	//   16   36:astore_1        
			a1.a(((String) (obj))).a(Integer.valueOf(0x7f0f079a)).a();
	//   17   37:aload_2         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #487 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//   20   42:ldc2            #488 <Int 0x7f0f079a>
	//   21   45:invokestatic    #494 <Method Integer Integer.valueOf(int)>
	//   22   48:invokevirtual   #497 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   23   51:invokevirtual   #498 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   24   54:pop             
			obj = ((Object) (com.irobot.home.util.j.a(b).a()));
	//   25   55:aload_0         
	//   26   56:getfield        #174 <Field String b>
	//   27   59:invokestatic    #269 <Method a j.a(String)>
	//   28   62:invokevirtual   #274 <Method AssetInfo a.a()>
	//   29   65:astore_1        
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.ReducedPowerStandby, ((AssetInfo) (obj)));
	//   30   66:invokestatic    #416 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   31   69:getstatic       #501 <Field ViewId ViewId.ReducedPowerStandby>
	//   32   72:aload_1         
	//   33   73:invokevirtual   #426 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
			return;
	//   34   76:return          
		} else
		{
			com.irobot.home.util.o.b(D, "Cannot process standByMode, Standby Mode info not available.");
	//   35   77:getstatic       #143 <Field String D>
	//   36   80:ldc2            #503 <String "Cannot process standByMode, Standby Mode info not available.">
	//   37   83:invokestatic    #505 <Method void o.b(String, String)>
			return;
	//   38   86:return          
		}
	}

	public void i()
	{
		A();
	//    0    0:aload_0         
	//    1    1:invokespecial   #247 <Method void A()>
		if(!j.isEnabled())
	//*   2    4:aload_0         
	//*   3    5:getfield        #103 <Field View j>
	//*   4    8:invokevirtual   #508 <Method boolean View.isEnabled()>
	//*   5   11:ifne            15
		{
			return;
	//    6   14:return          
		} else
		{
			c.setVisibility(8);
	//    7   15:aload_0         
	//    8   16:getfield        #113 <Field CustomTextView c>
	//    9   19:bipush          8
	//   10   21:invokevirtual   #163 <Method void CustomTextView.setVisibility(int)>
			f.setVisibility(0);
	//   11   24:aload_0         
	//   12   25:getfield        #384 <Field EditText f>
	//   13   28:iconst_0        
	//   14   29:invokevirtual   #509 <Method void EditText.setVisibility(int)>
			f.setHint(c.getText());
	//   15   32:aload_0         
	//   16   33:getfield        #384 <Field EditText f>
	//   17   36:aload_0         
	//   18   37:getfield        #113 <Field CustomTextView c>
	//   19   40:invokevirtual   #513 <Method CharSequence CustomTextView.getText()>
	//   20   43:invokevirtual   #516 <Method void EditText.setHint(CharSequence)>
			f.requestFocus();
	//   21   46:aload_0         
	//   22   47:getfield        #384 <Field EditText f>
	//   23   50:invokevirtual   #519 <Method boolean EditText.requestFocus()>
	//   24   53:pop             
			f.setText("");
	//   25   54:aload_0         
	//   26   55:getfield        #384 <Field EditText f>
	//   27   58:ldc2            #328 <String "">
	//   28   61:invokevirtual   #520 <Method void EditText.setText(CharSequence)>
			InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
	//   29   64:aload_0         
	//   30   65:ldc2            #522 <String "input_method">
	//   31   68:invokevirtual   #526 <Method Object getSystemService(String)>
	//   32   71:checkcast       #528 <Class InputMethodManager>
	//   33   74:astore_1        
			f.post(new Runnable(inputmethodmanager) {

				public void run()
				{
					a.showSoftInput(((View) (b.f)), 1);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field InputMethodManager a>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field RobotSettingsActivity b>
				//    4    8:getfield        #29  <Field EditText RobotSettingsActivity.f>
				//    5   11:iconst_1        
				//    6   12:invokevirtual   #35  <Method boolean InputMethodManager.showSoftInput(View, int)>
				//    7   15:pop             
				//    8   16:return          
				}

				final InputMethodManager a;
				final RobotSettingsActivity b;

			
			{
				b = RobotSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotSettingsActivity b>
				a = inputmethodmanager;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field InputMethodManager a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   34   75:aload_0         
	//   35   76:getfield        #384 <Field EditText f>
	//   36   79:new             #12  <Class RobotSettingsActivity$1>
	//   37   82:dup             
	//   38   83:aload_0         
	//   39   84:aload_1         
	//   40   85:invokespecial   #531 <Method void RobotSettingsActivity$1(RobotSettingsActivity, InputMethodManager)>
	//   41   88:invokevirtual   #535 <Method boolean EditText.post(Runnable)>
	//   42   91:pop             
			return;
	//   43   92:return          
		}
	}

	public void j()
	{
		com.irobot.home.AboutRobotTableViewActivity_.a(((android.content.Context) (this))).a(b).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #540 <Method AboutRobotTableViewActivity_$a com.irobot.home.AboutRobotTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field String b>
	//    4    8:invokevirtual   #545 <Method AboutRobotTableViewActivity_$a com.irobot.home.AboutRobotTableViewActivity_$a.a(String)>
	//    5   11:invokevirtual   #546 <Method org.androidannotations.api.a.e com.irobot.home.AboutRobotTableViewActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	public void k()
	{
		com.irobot.home.AboutDockListActivity_.a(((android.content.Context) (this))).a(b).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #551 <Method AboutDockListActivity_$a com.irobot.home.AboutDockListActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field String b>
	//    4    8:invokevirtual   #556 <Method AboutDockListActivity_$a com.irobot.home.AboutDockListActivity_$a.a(String)>
	//    5   11:invokevirtual   #557 <Method org.androidannotations.api.a.e com.irobot.home.AboutDockListActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	public void l()
	{
		if(AssetCapabilityUtils.isAwsEnabledAsset(com.irobot.home.util.j.a(b).a()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #174 <Field String b>
	//*   2    4:invokestatic    #269 <Method a j.a(String)>
	//*   3    7:invokevirtual   #274 <Method AssetInfo a.a()>
	//*   4   10:invokestatic    #563 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*   5   13:ifeq            40
		{
			com.irobot.home.RoombaV2LanguageListActivity_.a(((android.content.Context) (this))).a(b).a(K).a(3);
	//    6   16:aload_0         
	//    7   17:invokestatic    #568 <Method RoombaV2LanguageListActivity_$a com.irobot.home.RoombaV2LanguageListActivity_.a(android.content.Context)>
	//    8   20:aload_0         
	//    9   21:getfield        #174 <Field String b>
	//   10   24:invokevirtual   #573 <Method RoombaV2LanguageListActivity_$a com.irobot.home.RoombaV2LanguageListActivity_$a.a(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #172 <Field boolean K>
	//   13   31:invokevirtual   #576 <Method RoombaV2LanguageListActivity_$a com.irobot.home.RoombaV2LanguageListActivity_$a.a(boolean)>
	//   14   34:iconst_3        
	//   15   35:invokevirtual   #579 <Method org.androidannotations.api.a.e com.irobot.home.RoombaV2LanguageListActivity_$a.a(int)>
	//   16   38:pop             
			return;
	//   17   39:return          
		} else
		{
			com.irobot.home.RoombaV1LanguageListActivity_.a(((android.content.Context) (this))).a(b).a(K).a(3);
	//   18   40:aload_0         
	//   19   41:invokestatic    #584 <Method RoombaV1LanguageListActivity_$a com.irobot.home.RoombaV1LanguageListActivity_.a(android.content.Context)>
	//   20   44:aload_0         
	//   21   45:getfield        #174 <Field String b>
	//   22   48:invokevirtual   #589 <Method RoombaV1LanguageListActivity_$a com.irobot.home.RoombaV1LanguageListActivity_$a.a(String)>
	//   23   51:aload_0         
	//   24   52:getfield        #172 <Field boolean K>
	//   25   55:invokevirtual   #592 <Method RoombaV1LanguageListActivity_$a com.irobot.home.RoombaV1LanguageListActivity_$a.a(boolean)>
	//   26   58:iconst_3        
	//   27   59:invokevirtual   #593 <Method org.androidannotations.api.a.e com.irobot.home.RoombaV1LanguageListActivity_$a.a(int)>
	//   28   62:pop             
			return;
	//   29   63:return          
		}
	}

	public void m()
	{
		com.irobot.home.BinBehaviorActivity_.a(((android.content.Context) (this))).a(L).a(b).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #598 <Method BinBehaviorActivity_$a com.irobot.home.BinBehaviorActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #325 <Field boolean L>
	//    4    8:invokevirtual   #603 <Method BinBehaviorActivity_$a com.irobot.home.BinBehaviorActivity_$a.a(boolean)>
	//    5   11:aload_0         
	//    6   12:getfield        #174 <Field String b>
	//    7   15:invokevirtual   #606 <Method BinBehaviorActivity_$a com.irobot.home.BinBehaviorActivity_$a.a(String)>
	//    8   18:invokevirtual   #607 <Method org.androidannotations.api.a.e com.irobot.home.BinBehaviorActivity_$a.a()>
	//    9   21:pop             
	//   10   22:return          
	}

	public void n()
	{
		com.irobot.home.WifiSettingsActivity_.a(((android.content.Context) (this))).a(b).b(com.irobot.home.util.j.a(b).a().getName()).a(2);
	//    0    0:aload_0         
	//    1    1:invokestatic    #612 <Method WifiSettingsActivity_$a com.irobot.home.WifiSettingsActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field String b>
	//    4    8:invokevirtual   #617 <Method WifiSettingsActivity_$a com.irobot.home.WifiSettingsActivity_$a.a(String)>
	//    5   11:aload_0         
	//    6   12:getfield        #174 <Field String b>
	//    7   15:invokestatic    #269 <Method a j.a(String)>
	//    8   18:invokevirtual   #274 <Method AssetInfo a.a()>
	//    9   21:invokevirtual   #375 <Method String AssetInfo.getName()>
	//   10   24:invokevirtual   #619 <Method WifiSettingsActivity_$a com.irobot.home.WifiSettingsActivity_$a.b(String)>
	//   11   27:iconst_2        
	//   12   28:invokevirtual   #620 <Method org.androidannotations.api.a.e com.irobot.home.WifiSettingsActivity_$a.a(int)>
	//   13   31:pop             
	//   14   32:return          
	}

	public void o()
	{
		com.irobot.home.ResetTableViewActivity_.a(((android.content.Context) (this))).a(b).a(0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #625 <Method ResetTableViewActivity_$a com.irobot.home.ResetTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field String b>
	//    4    8:invokevirtual   #630 <Method ResetTableViewActivity_$a com.irobot.home.ResetTableViewActivity_$a.a(String)>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #631 <Method org.androidannotations.api.a.e com.irobot.home.ResetTableViewActivity_$a.a(int)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 47
	//	               1 47
	//	               2 35
	//	               3 62
	//*   2   32:goto            62
		case 2: // '\002'
			if(j1 == -1)
	//*   3   35:iload_2         
	//*   4   36:iconst_m1       
	//*   5   37:icmpne          62
				finish();
	//    6   40:aload_0         
	//    7   41:invokevirtual   #636 <Method void finish()>
			break;

	//*   8   44:goto            62
		case 0: // '\0'
		case 1: // '\001'
			if(j1 == -1)
	//*   9   47:iload_2         
	//*  10   48:iconst_m1       
	//*  11   49:icmpne          61
			{
				setResult(-1);
	//   12   52:aload_0         
	//   13   53:iconst_m1       
	//   14   54:invokevirtual   #334 <Method void setResult(int)>
				finish();
	//   15   57:aload_0         
	//   16   58:invokevirtual   #636 <Method void finish()>
			}
			return;
	//   17   61:return          
		}
		if(G == null)
	//*  18   62:aload_0         
	//*  19   63:getfield        #122 <Field RobotPreferences G>
	//*  20   66:ifnonnull       80
			G = new RobotPreferences();
	//   21   69:aload_0         
	//   22   70:new             #344 <Class RobotPreferences>
	//   23   73:dup             
	//   24   74:invokespecial   #345 <Method void RobotPreferences()>
	//   25   77:putfield        #122 <Field RobotPreferences G>
		G.a(com.irobot.home.util.j.o(b).a());
	//   26   80:aload_0         
	//   27   81:getfield        #122 <Field RobotPreferences G>
	//   28   84:aload_0         
	//   29   85:getfield        #174 <Field String b>
	//   30   88:invokestatic    #177 <Method Robot j.o(String)>
	//   31   91:invokevirtual   #348 <Method RobotPreferences Robot.a()>
	//   32   94:invokevirtual   #351 <Method void RobotPreferences.a(RobotPreferences)>
		b(com.irobot.home.util.j.a(b).a().getName());
	//   33   97:aload_0         
	//   34   98:aload_0         
	//   35   99:getfield        #174 <Field String b>
	//   36  102:invokestatic    #269 <Method a j.a(String)>
	//   37  105:invokevirtual   #274 <Method AssetInfo a.a()>
	//   38  108:invokevirtual   #375 <Method String AssetInfo.getName()>
	//   39  111:invokevirtual   #377 <Method void b(String)>
	//   40  114:return          
	}

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(compoundbutton == E)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #185 <Field SwitchCompat E>
	//*   3    5:if_acmpne       56
		{
			compoundbutton = ((CompoundButton) (getSharedPreferences("DEVEL", 0).edit()));
	//    4    8:aload_0         
	//    5    9:ldc2            #640 <String "DEVEL">
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #644 <Method SharedPreferences getSharedPreferences(String, int)>
	//    8   16:invokeinterface #650 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   21:astore_1        
			((android.content.SharedPreferences.Editor) (compoundbutton)).putBoolean("metric_units_key", E.isChecked());
	//   10   22:aload_1         
	//   11   23:ldc2            #652 <String "metric_units_key">
	//   12   26:aload_0         
	//   13   27:getfield        #185 <Field SwitchCompat E>
	//   14   30:invokevirtual   #655 <Method boolean SwitchCompat.isChecked()>
	//   15   33:invokeinterface #661 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   16   38:pop             
			i.f = E.isChecked();
	//   17   39:aload_0         
	//   18   40:getfield        #185 <Field SwitchCompat E>
	//   19   43:invokevirtual   #655 <Method boolean SwitchCompat.isChecked()>
	//   20   46:putstatic       #189 <Field boolean i.f>
			((android.content.SharedPreferences.Editor) (compoundbutton)).apply();
	//   21   49:aload_1         
	//   22   50:invokeinterface #664 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   23   55:return          
		}
		if(compoundbutton == F)
	//*  24   56:aload_1         
	//*  25   57:aload_0         
	//*  26   58:getfield        #439 <Field SwitchCompat F>
	//*  27   61:if_acmpne       72
			J.a(flag);
	//   28   64:aload_0         
	//   29   65:getfield        #411 <Field RobotSettingsPresenter J>
	//   30   68:iload_2         
	//   31   69:invokevirtual   #666 <Method void com.irobot.home.RobotSettingsPresenter.a(boolean)>
	//   32   72:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #669 <Method void BaseFragmentActivity.onDestroy()>
		ConnectivityStateReceiver.a().b(((com.irobot.home.util.ConnectivityStateReceiver.a) (this)));
	//    2    4:invokestatic    #339 <Method ConnectivityStateReceiver ConnectivityStateReceiver.a()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #671 <Method boolean ConnectivityStateReceiver.b(com.irobot.home.util.ConnectivityStateReceiver$a)>
	//    5   11:pop             
	//    6   12:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void BaseFragmentActivity.onStart()>
		C.registerUISubscriber(((OTAUIServiceDataCallback) (N)));
	//    2    4:aload_0         
	//    3    5:getfield        #432 <Field UpdateUIService C>
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field RobotSettingsActivity$a N>
	//    6   12:invokevirtual   #680 <Method boolean UpdateUIService.registerUISubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
		J.a();
	//    8   16:aload_0         
	//    9   17:getfield        #411 <Field RobotSettingsPresenter J>
	//   10   20:invokevirtual   #682 <Method void com.irobot.home.RobotSettingsPresenter.a()>
	//   11   23:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #685 <Method void BaseFragmentActivity.onStop()>
		C.unregisterSubscriber(((OTAUIServiceDataCallback) (N)));
	//    2    4:aload_0         
	//    3    5:getfield        #432 <Field UpdateUIService C>
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field RobotSettingsActivity$a N>
	//    6   12:invokevirtual   #688 <Method boolean UpdateUIService.unregisterSubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
		J.b();
	//    8   16:aload_0         
	//    9   17:getfield        #411 <Field RobotSettingsPresenter J>
	//   10   20:invokevirtual   #690 <Method void com.irobot.home.RobotSettingsPresenter.b()>
	//   11   23:return          
	}

	public void p()
	{
		com.irobot.home.RemoveButtonActivity_.a(((android.content.Context) (this))).a(b).b(com.irobot.home.util.j.a(b).a().getName()).a(1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #696 <Method RemoveButtonActivity_$a com.irobot.home.RemoveButtonActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field String b>
	//    4    8:invokevirtual   #701 <Method RemoveButtonActivity_$a com.irobot.home.RemoveButtonActivity_$a.a(String)>
	//    5   11:aload_0         
	//    6   12:getfield        #174 <Field String b>
	//    7   15:invokestatic    #269 <Method a j.a(String)>
	//    8   18:invokevirtual   #274 <Method AssetInfo a.a()>
	//    9   21:invokevirtual   #375 <Method String AssetInfo.getName()>
	//   10   24:invokevirtual   #703 <Method RemoveButtonActivity_$a com.irobot.home.RemoveButtonActivity_$a.b(String)>
	//   11   27:iconst_1        
	//   12   28:invokevirtual   #704 <Method org.androidannotations.api.a.e com.irobot.home.RemoveButtonActivity_$a.a(int)>
	//   13   31:pop             
	//   14   32:return          
	}

	public void q()
	{
		y.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field RelativeLayout y>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #323 <Method void RelativeLayout.setVisibility(int)>
	//    4    9:return          
	}

	public void r()
	{
		e.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field RelativeLayout e>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #323 <Method void RelativeLayout.setVisibility(int)>
	//    4    9:return          
	}

	public void s()
	{
		z.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #447 <Field CustomButton z>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #450 <Method void CustomButton.setVisibility(int)>
		i.setVisibility(8);
	//    4    9:aload_0         
	//    5   10:getfield        #452 <Field View i>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #453 <Method void View.setVisibility(int)>
	//    8   18:return          
	}

	public void t()
	{
		n.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field View n>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #453 <Method void View.setVisibility(int)>
		g.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #709 <Field View g>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #453 <Method void View.setVisibility(int)>
	//    8   16:return          
	}

	public void x()
	{
		n.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field View n>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #453 <Method void View.setVisibility(int)>
		g.setVisibility(8);
	//    4    9:aload_0         
	//    5   10:getfield        #709 <Field View g>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #453 <Method void View.setVisibility(int)>
	//    8   18:return          
	}

	public void y()
	{
		t.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #711 <Field RelativeLayout t>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #323 <Method void RelativeLayout.setVisibility(int)>
		h.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #713 <Field View h>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #453 <Method void View.setVisibility(int)>
	//    8   16:return          
	}

	private static final String D = "RobotSettingsActivity";
	CustomerCareRestClient A;
	com.irobot.home.view.b B;
	UpdateUIService C;
	private SwitchCompat E;
	private SwitchCompat F;
	private RobotPreferences G;
	private StandbyModeInfo H;
	private AssetNetworkUIService I;
	private RobotSettingsPresenter J;
	private boolean K;
	private boolean L;
	private boolean M;
	private a N;
	IRobotApplication a;
	String b;
	CustomTextView c;
	CustomTextView d;
	RelativeLayout e;
	EditText f;
	View g;
	View h;
	View i;
	View j;
	View k;
	View l;
	View m;
	View n;
	RelativeLayout o;
	RelativeLayout t;
	CustomTextView u;
	CustomTextView v;
	ProgressBar w;
	RelativeLayout x;
	RelativeLayout y;
	CustomButton z;

	static 
	{
	//    0    0:return          
	}
}
