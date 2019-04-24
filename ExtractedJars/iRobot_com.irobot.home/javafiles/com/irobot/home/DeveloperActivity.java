// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.irobot.core.AccountService;
import com.irobot.core.AccountUtils;
import com.irobot.core.ApplicationUIService;
import com.irobot.core.ApplicationUIServiceCommand;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.CommandTierAgent;
import com.irobot.core.CommandType;
import com.irobot.core.CurrentConnectionState;
import com.irobot.core.EventType;
import com.irobot.core.FeatureType;
import com.irobot.core.GigyaConst;
import com.irobot.core.MissionSubsystem;
import com.irobot.core.NetworkDiagnosticEvent;
import com.irobot.core.NetworkDiagnostics;
import com.irobot.core.NetworkManager;
import com.irobot.core.NetworkScenarios;
import com.irobot.core.NetworkStatistics;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceCommand;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.UpdateUIService;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.model.w;
import com.irobot.home.q.b;
import com.irobot.home.util.AssetSoftwareUpdateUtils;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication, SelectRobotTypeActivity_, AccountLoginActivity_, 
//			i, LocalOtaHttpsActivity_, MapCustomizationActivity_, CustomerRegistrationActivity_, 
//			LogStreamActivity_, ShowLogcatActivity_, RobotCleaningPreferencesActivity_, OtaMqttActivity_

public class DeveloperActivity extends BaseFragmentActivity
	implements i.b, com.irobot.home.q.b.a
{

	public DeveloperActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void BaseFragmentActivity()>
		M = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #91  <Field AssetInfo M>
		J = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #93  <Field boolean J>
	//    8   14:return          
	}

	private void K()
	{
	//    0    0:return          
	}

	private boolean L()
	{
		Object obj = ((Object) (com.irobot.home.util.j.j()));
	//    0    0:invokestatic    #100 <Method a j.j()>
	//    1    3:astore_1        
		String s1;
		if(obj == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       42
		{
			obj = ((Object) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("No current robot")));
	//    4    8:new             #102 <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    8   16:ldc1            #107 <String "No current robot">
	//    9   18:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   10   21:astore_1        
			s1 = "You need to connect to a robot before running meta OTA";
	//   11   22:ldc1            #113 <String "You need to connect to a robot before running meta OTA">
	//   12   24:astore_2        
		} else
	//*  13   25:aload_1         
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//*  16   30:ldc1            #117 <Int 0x7f0f017d>
	//*  17   32:aconst_null     
	//*  18   33:invokevirtual   #121 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//*  19   36:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//*  20   39:pop             
	//*  21   40:iconst_0        
	//*  22   41:ireturn         
		if(!AssetCapabilityUtils.isVacuumingRobot(((a) (obj)).a()))
	//*  23   42:aload_1         
	//*  24   43:invokevirtual   #130 <Method AssetInfo a.a()>
	//*  25   46:invokestatic    #136 <Method boolean AssetCapabilityUtils.isVacuumingRobot(AssetInfo)>
	//*  26   49:ifne            72
		{
			obj = ((Object) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("No current robot")));
	//   27   52:new             #102 <Class android.app.AlertDialog$Builder>
	//   28   55:dup             
	//   29   56:aload_0         
	//   30   57:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   31   60:ldc1            #107 <String "No current robot">
	//   32   62:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   33   65:astore_1        
			s1 = "Model asset must be of type roomba.";
	//   34   66:ldc1            #138 <String "Model asset must be of type roomba.">
	//   35   68:astore_2        
		} else
	//*  36   69:goto            25
		{
			obj = ((Object) (((a) (obj)).b()));
	//   37   72:aload_1         
	//   38   73:invokevirtual   #141 <Method AssetId a.b()>
	//   39   76:astore_1        
			if(obj != null && !Assembler.getInstance().getNetworkUIService(((AssetId) (obj))).getServiceData().getCurrentConnectionState().equals(((Object) (CurrentConnectionState.ConnectedLocally))))
	//*  40   77:aload_1         
	//*  41   78:ifnull          123
	//*  42   81:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//*  43   84:aload_1         
	//*  44   85:invokevirtual   #151 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//*  45   88:invokevirtual   #157 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  46   91:invokevirtual   #163 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//*  47   94:getstatic       #169 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*  48   97:invokevirtual   #173 <Method boolean CurrentConnectionState.equals(Object)>
	//*  49  100:ifne            123
			{
				obj = ((Object) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Robot not locally connected")));
	//   50  103:new             #102 <Class android.app.AlertDialog$Builder>
	//   51  106:dup             
	//   52  107:aload_0         
	//   53  108:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   54  111:ldc1            #175 <String "Robot not locally connected">
	//   55  113:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   56  116:astore_1        
				s1 = "You must be on a local connection with your robot.";
	//   57  117:ldc1            #177 <String "You must be on a local connection with your robot.">
	//   58  119:astore_2        
			} else
	//*  59  120:goto            25
			{
				return true;
	//   60  123:iconst_1        
	//   61  124:ireturn         
			}
		}
		((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (s1))).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
		return false;
	}

	private ArrayList M()
	{
		ArrayList arraylist = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			"research.test", "dev.test", "prod", "prod-cn", "stage", "test-qual.test", "int-test", "stage-cn"
		}))))));
	//    0    0:new             #180 <Class ArrayList>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:anewarray       String[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #184 <String "research.test">
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:ldc1            #186 <String "dev.test">
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #188 <String "prod">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:ldc1            #190 <String "prod-cn">
	//   19   28:aastore         
	//   20   29:dup             
	//   21   30:iconst_4        
	//   22   31:ldc1            #192 <String "stage">
	//   23   33:aastore         
	//   24   34:dup             
	//   25   35:iconst_5        
	//   26   36:ldc1            #194 <String "test-qual.test">
	//   27   38:aastore         
	//   28   39:dup             
	//   29   40:bipush          6
	//   30   42:ldc1            #196 <String "int-test">
	//   31   44:aastore         
	//   32   45:dup             
	//   33   46:bipush          7
	//   34   48:ldc1            #198 <String "stage-cn">
	//   35   50:aastore         
	//   36   51:invokestatic    #204 <Method java.util.List Arrays.asList(Object[])>
	//   37   54:invokespecial   #207 <Method void ArrayList(java.util.Collection)>
	//   38   57:astore_2        
		for(int i1 = 1; i1 <= 29; i1++)
	//*  39   58:iconst_1        
	//*  40   59:istore_1        
	//*  41   60:iload_1         
	//*  42   61:bipush          29
	//*  43   63:icmpgt          82
			arraylist.add(((Object) (com.irobot.home.util.j.b(i1))));
	//   44   66:aload_2         
	//   45   67:iload_1         
	//   46   68:invokestatic    #210 <Method String j.b(int)>
	//   47   71:invokevirtual   #213 <Method boolean ArrayList.add(Object)>
	//   48   74:pop             

	//   49   75:iload_1         
	//   50   76:iconst_1        
	//   51   77:iadd            
	//   52   78:istore_1        
	//*  53   79:goto            60
		return arraylist;
	//   54   82:aload_2         
	//   55   83:areturn         
	}

	private ArrayList N()
	{
		return new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			"prod", "stage"
		}))))));
	//    0    0:new             #180 <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #188 <String "prod">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #192 <String "stage">
	//   11   17:aastore         
	//   12   18:invokestatic    #204 <Method java.util.List Arrays.asList(Object[])>
	//   13   21:invokespecial   #207 <Method void ArrayList(java.util.Collection)>
	//   14   24:areturn         
	}

	private void O()
	{
		com.irobot.home.util.j.a(((android.content.Context) (this)), "Not Supported on Braava Jet", 0x7f080201).show();
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <String "Not Supported on Braava Jet">
	//    2    3:ldc1            #218 <Int 0x7f080201>
	//    3    5:invokestatic    #221 <Method Toast j.a(android.content.Context, String, int)>
	//    4    8:invokevirtual   #225 <Method void Toast.show()>
	//    5   11:return          
	}

	static int a(DeveloperActivity developeractivity, int i1)
	{
		developeractivity.L = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #228 <Field int L>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private int a(ArrayList arraylist)
	{
		int j1 = arraylist.indexOf(((Object) (com.irobot.home.util.j.r())));
	//    0    0:aload_1         
	//    1    1:invokestatic    #233 <Method String j.r()>
	//    2    4:invokevirtual   #237 <Method int ArrayList.indexOf(Object)>
	//    3    7:istore_3        
		int i1 = j1;
	//    4    8:iload_3         
	//    5    9:istore_2        
		if(j1 == -1)
	//*   6   10:iload_3         
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          17
			i1 = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		return i1;
	//   11   17:iload_2         
	//   12   18:ireturn         
	}

	static TextView a(DeveloperActivity developeractivity)
	{
		return developeractivity.K;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field TextView K>
	//    2    4:areturn         
	}

	static TextView a(DeveloperActivity developeractivity, TextView textview)
	{
		developeractivity.K = textview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #241 <Field TextView K>
		return textview;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private boolean a(String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #249 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            32
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage("Enter a valid Meta OTA url above.").setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    3    7:new             #102 <Class android.app.AlertDialog$Builder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    7   15:ldc1            #251 <String "Enter a valid Meta OTA url above.">
	//    8   17:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    9   20:ldc1            #252 <Int 0x7f0f05bb>
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   12   26:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   13   29:pop             
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		} else
		{
			return L();
	//   16   32:aload_0         
	//   17   33:invokespecial   #257 <Method boolean L()>
	//   18   36:ireturn         
		}
	}

	private int b(ArrayList arraylist)
	{
		int j1 = arraylist.indexOf(((Object) (com.irobot.home.util.j.s())));
	//    0    0:aload_1         
	//    1    1:invokestatic    #260 <Method String j.s()>
	//    2    4:invokevirtual   #237 <Method int ArrayList.indexOf(Object)>
	//    3    7:istore_3        
		int i1 = j1;
	//    4    8:iload_3         
	//    5    9:istore_2        
		if(j1 == -1)
	//*   6   10:iload_3         
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          17
			i1 = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		return i1;
	//   11   17:iload_2         
	//   12   18:ireturn         
	}

	static com.irobot.home.i.a b(DeveloperActivity developeractivity)
	{
		return developeractivity.N;
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field com.irobot.home.i.a N>
	//    2    4:areturn         
	}

	static int c(DeveloperActivity developeractivity)
	{
		return developeractivity.L;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field int L>
	//    2    4:ireturn         
	}

	void A()
	{
		NetworkStatistics networkstatistics = NetworkManager.defaultManager().networkStatistics();
	//    0    0:invokestatic    #270 <Method NetworkManager NetworkManager.defaultManager()>
	//    1    3:invokevirtual   #274 <Method NetworkStatistics NetworkManager.networkStatistics()>
	//    2    6:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    3    8:new             #276 <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #277 <Method void StringBuilder()>
	//    6   15:astore          6
		String s1 = System.lineSeparator();
	//    7   17:invokestatic    #282 <Method String System.lineSeparator()>
	//    8   20:astore          7
		NetworkScenarios anetworkscenarios[] = NetworkScenarios.values();
	//    9   22:invokestatic    #288 <Method NetworkScenarios[] NetworkScenarios.values()>
	//   10   25:astore          8
		int j1 = anetworkscenarios.length;
	//   11   27:aload           8
	//   12   29:arraylength     
	//   13   30:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  14   31:iconst_0        
	//*  15   32:istore_1        
	//*  16   33:iload_1         
	//*  17   34:iload_2         
	//*  18   35:icmpge          269
		{
			NetworkScenarios networkscenarios = anetworkscenarios[i1];
	//   19   38:aload           8
	//   20   40:iload_1         
	//   21   41:aaload          
	//   22   42:astore          9
			if(networkscenarios == NetworkScenarios.LastScenario)
	//*  23   44:aload           9
	//*  24   46:getstatic       #292 <Field NetworkScenarios NetworkScenarios.LastScenario>
	//*  25   49:if_acmpne       55
				continue;
	//   26   52:goto            262
			stringbuilder.append(networkscenarios.toString());
	//   27   55:aload           6
	//   28   57:aload           9
	//   29   59:invokevirtual   #295 <Method String NetworkScenarios.toString()>
	//   30   62:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
			stringbuilder.append(s1);
	//   32   66:aload           6
	//   33   68:aload           7
	//   34   70:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
			stringbuilder.append("Total Connection Attempts: ");
	//   36   74:aload           6
	//   37   76:ldc2            #301 <String "Total Connection Attempts: ">
	//   38   79:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
			stringbuilder.append(networkstatistics.statisticTotalAttempts(networkscenarios));
	//   40   83:aload           6
	//   41   85:aload           5
	//   42   87:aload           9
	//   43   89:invokevirtual   #307 <Method long NetworkStatistics.statisticTotalAttempts(NetworkScenarios)>
	//   44   92:invokevirtual   #310 <Method StringBuilder StringBuilder.append(long)>
	//   45   95:pop             
			stringbuilder.append(s1);
	//   46   96:aload           6
	//   47   98:aload           7
	//   48  100:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   49  103:pop             
			stringbuilder.append("Avg Success Time and Count: ");
	//   50  104:aload           6
	//   51  106:ldc2            #312 <String "Avg Success Time and Count: ">
	//   52  109:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   53  112:pop             
			stringbuilder.append(networkstatistics.statisticSuccessAverageTimeMsec(networkscenarios));
	//   54  113:aload           6
	//   55  115:aload           5
	//   56  117:aload           9
	//   57  119:invokevirtual   #315 <Method long NetworkStatistics.statisticSuccessAverageTimeMsec(NetworkScenarios)>
	//   58  122:invokevirtual   #310 <Method StringBuilder StringBuilder.append(long)>
	//   59  125:pop             
			stringbuilder.append(" ");
	//   60  126:aload           6
	//   61  128:ldc2            #317 <String " ">
	//   62  131:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   63  134:pop             
			stringbuilder.append(networkstatistics.statisticSuccessCount(networkscenarios));
	//   64  135:aload           6
	//   65  137:aload           5
	//   66  139:aload           9
	//   67  141:invokevirtual   #320 <Method long NetworkStatistics.statisticSuccessCount(NetworkScenarios)>
	//   68  144:invokevirtual   #310 <Method StringBuilder StringBuilder.append(long)>
	//   69  147:pop             
			stringbuilder.append(s1);
	//   70  148:aload           6
	//   71  150:aload           7
	//   72  152:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   73  155:pop             
			long l1 = networkstatistics.statisticFailureAverageTimeMsec(networkscenarios);
	//   74  156:aload           5
	//   75  158:aload           9
	//   76  160:invokevirtual   #323 <Method long NetworkStatistics.statisticFailureAverageTimeMsec(NetworkScenarios)>
	//   77  163:lstore_3        
			if(l1 > 0L)
	//*  78  164:lload_3         
	//*  79  165:lconst_0        
	//*  80  166:lcmp            
	//*  81  167:ifle            216
			{
				stringbuilder.append("Avg Failure Time and Count: ");
	//   82  170:aload           6
	//   83  172:ldc2            #325 <String "Avg Failure Time and Count: ">
	//   84  175:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   85  178:pop             
				stringbuilder.append(l1);
	//   86  179:aload           6
	//   87  181:lload_3         
	//   88  182:invokevirtual   #310 <Method StringBuilder StringBuilder.append(long)>
	//   89  185:pop             
				stringbuilder.append(" ");
	//   90  186:aload           6
	//   91  188:ldc2            #317 <String " ">
	//   92  191:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   93  194:pop             
				stringbuilder.append(networkstatistics.statisticFailureCount(networkscenarios));
	//   94  195:aload           6
	//   95  197:aload           5
	//   96  199:aload           9
	//   97  201:invokevirtual   #328 <Method long NetworkStatistics.statisticFailureCount(NetworkScenarios)>
	//   98  204:invokevirtual   #310 <Method StringBuilder StringBuilder.append(long)>
	//   99  207:pop             
				stringbuilder.append(s1);
	//  100  208:aload           6
	//  101  210:aload           7
	//  102  212:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  103  215:pop             
			}
			l1 = networkstatistics.statisticFailureLowSignalStrengthCount(networkscenarios);
	//  104  216:aload           5
	//  105  218:aload           9
	//  106  220:invokevirtual   #331 <Method long NetworkStatistics.statisticFailureLowSignalStrengthCount(NetworkScenarios)>
	//  107  223:lstore_3        
			if(l1 > 0L)
	//* 108  224:lload_3         
	//* 109  225:lconst_0        
	//* 110  226:lcmp            
	//* 111  227:ifle            254
			{
				stringbuilder.append("Failures during Low Signal: ");
	//  112  230:aload           6
	//  113  232:ldc2            #333 <String "Failures during Low Signal: ">
	//  114  235:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  115  238:pop             
				stringbuilder.append(l1);
	//  116  239:aload           6
	//  117  241:lload_3         
	//  118  242:invokevirtual   #310 <Method StringBuilder StringBuilder.append(long)>
	//  119  245:pop             
				stringbuilder.append(s1);
	//  120  246:aload           6
	//  121  248:aload           7
	//  122  250:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  123  253:pop             
			}
			stringbuilder.append(s1);
	//  124  254:aload           6
	//  125  256:aload           7
	//  126  258:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  127  261:pop             
		}

	//  128  262:iload_1         
	//  129  263:iconst_1        
	//  130  264:iadd            
	//  131  265:istore_1        
	//* 132  266:goto            33
		Object obj = ((Object) (networkstatistics.successfulNetworkInterfaces()));
	//  133  269:aload           5
	//  134  271:invokevirtual   #337 <Method HashMap NetworkStatistics.successfulNetworkInterfaces()>
	//  135  274:astore          8
		stringbuilder.append("Successful Interfaces:");
	//  136  276:aload           6
	//  137  278:ldc2            #339 <String "Successful Interfaces:">
	//  138  281:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  139  284:pop             
		stringbuilder.append(s1);
	//  140  285:aload           6
	//  141  287:aload           7
	//  142  289:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  143  292:pop             
		for(obj = ((Object) (((HashMap) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.append(s1))
	//* 144  293:aload           8
	//* 145  295:invokevirtual   #345 <Method Set HashMap.entrySet()>
	//* 146  298:invokeinterface #351 <Method Iterator Set.iterator()>
	//* 147  303:astore          8
	//* 148  305:aload           8
	//* 149  307:invokeinterface #356 <Method boolean Iterator.hasNext()>
	//* 150  312:ifeq            376
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//  151  315:aload           8
	//  152  317:invokeinterface #360 <Method Object Iterator.next()>
	//  153  322:checkcast       #362 <Class java.util.Map$Entry>
	//  154  325:astore          9
			stringbuilder.append((String)entry.getKey());
	//  155  327:aload           6
	//  156  329:aload           9
	//  157  331:invokeinterface #365 <Method Object java.util.Map$Entry.getKey()>
	//  158  336:checkcast       #182 <Class String>
	//  159  339:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  160  342:pop             
			stringbuilder.append(": ");
	//  161  343:aload           6
	//  162  345:ldc2            #367 <String ": ">
	//  163  348:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  164  351:pop             
			stringbuilder.append(entry.getValue());
	//  165  352:aload           6
	//  166  354:aload           9
	//  167  356:invokeinterface #370 <Method Object java.util.Map$Entry.getValue()>
	//  168  361:invokevirtual   #373 <Method StringBuilder StringBuilder.append(Object)>
	//  169  364:pop             
		}

	//  170  365:aload           6
	//  171  367:aload           7
	//  172  369:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  173  372:pop             
	//* 174  373:goto            305
		obj = ((Object) (networkstatistics.failureNetworkInterfaces()));
	//  175  376:aload           5
	//  176  378:invokevirtual   #376 <Method HashMap NetworkStatistics.failureNetworkInterfaces()>
	//  177  381:astore          8
		if(!((HashMap) (obj)).isEmpty())
	//* 178  383:aload           8
	//* 179  385:invokevirtual   #378 <Method boolean HashMap.isEmpty()>
	//* 180  388:ifne            499
		{
			stringbuilder.append(s1);
	//  181  391:aload           6
	//  182  393:aload           7
	//  183  395:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  184  398:pop             
			stringbuilder.append("Failed Interfaces:");
	//  185  399:aload           6
	//  186  401:ldc2            #380 <String "Failed Interfaces:">
	//  187  404:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  188  407:pop             
			stringbuilder.append(s1);
	//  189  408:aload           6
	//  190  410:aload           7
	//  191  412:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  192  415:pop             
			for(obj = ((Object) (((HashMap) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.append(s1))
	//* 193  416:aload           8
	//* 194  418:invokevirtual   #345 <Method Set HashMap.entrySet()>
	//* 195  421:invokeinterface #351 <Method Iterator Set.iterator()>
	//* 196  426:astore          8
	//* 197  428:aload           8
	//* 198  430:invokeinterface #356 <Method boolean Iterator.hasNext()>
	//* 199  435:ifeq            499
			{
				java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
	//  200  438:aload           8
	//  201  440:invokeinterface #360 <Method Object Iterator.next()>
	//  202  445:checkcast       #362 <Class java.util.Map$Entry>
	//  203  448:astore          9
				stringbuilder.append((String)entry1.getKey());
	//  204  450:aload           6
	//  205  452:aload           9
	//  206  454:invokeinterface #365 <Method Object java.util.Map$Entry.getKey()>
	//  207  459:checkcast       #182 <Class String>
	//  208  462:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  209  465:pop             
				stringbuilder.append(": ");
	//  210  466:aload           6
	//  211  468:ldc2            #367 <String ": ">
	//  212  471:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  213  474:pop             
				stringbuilder.append(entry1.getValue());
	//  214  475:aload           6
	//  215  477:aload           9
	//  216  479:invokeinterface #370 <Method Object java.util.Map$Entry.getValue()>
	//  217  484:invokevirtual   #373 <Method StringBuilder StringBuilder.append(Object)>
	//  218  487:pop             
			}

	//  219  488:aload           6
	//  220  490:aload           7
	//  221  492:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  222  495:pop             
		}
	//* 223  496:goto            428
		stringbuilder.append(s1);
	//  224  499:aload           6
	//  225  501:aload           7
	//  226  503:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  227  506:pop             
		stringbuilder.append("Discounted Failures:");
	//  228  507:aload           6
	//  229  509:ldc2            #382 <String "Discounted Failures:">
	//  230  512:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//  231  515:pop             
		stringbuilder.append(((int) (networkstatistics.totalDiscountedFailures())));
	//  232  516:aload           6
	//  233  518:aload           5
	//  234  520:invokevirtual   #386 <Method short NetworkStatistics.totalDiscountedFailures()>
	//  235  523:invokevirtual   #389 <Method StringBuilder StringBuilder.append(int)>
	//  236  526:pop             
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Network Statistics").setMessage(((CharSequence) (stringbuilder.toString()))).setPositiveButton("Reset Values", new android.content.DialogInterface.OnClickListener(networkstatistics) {

			public void onClick(DialogInterface dialoginterface, int k1)
			{
				a.resetStatistics();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field NetworkStatistics a>
			//    2    4:invokevirtual   #31  <Method void NetworkStatistics.resetStatistics()>
			//    3    7:return          
			}

			final NetworkStatistics a;
			final DeveloperActivity b;

			
			{
				b = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DeveloperActivity b>
				a = networkstatistics;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field NetworkStatistics a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//  237  527:new             #102 <Class android.app.AlertDialog$Builder>
	//  238  530:dup             
	//  239  531:aload_0         
	//  240  532:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//  241  535:ldc2            #391 <String "Network Statistics">
	//  242  538:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//  243  541:aload           6
	//  244  543:invokevirtual   #392 <Method String StringBuilder.toString()>
	//  245  546:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//  246  549:ldc2            #394 <String "Reset Values">
	//  247  552:new             #14  <Class DeveloperActivity$11>
	//  248  555:dup             
	//  249  556:aload_0         
	//  250  557:aload           5
	//  251  559:invokespecial   #397 <Method void DeveloperActivity$11(DeveloperActivity, NetworkStatistics)>
	//  252  562:invokevirtual   #400 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  253  565:ldc1            #117 <Int 0x7f0f017d>
	//  254  567:aconst_null     
	//  255  568:invokevirtual   #121 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//  256  571:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//  257  574:pop             
		networkstatistics.logStatistics();
	//  258  575:aload           5
	//  259  577:invokevirtual   #403 <Method void NetworkStatistics.logStatistics()>
	//  260  580:return          
	}

	void B()
	{
		NetworkDiagnostics networkdiagnostics = NetworkManager.defaultManager().networkDiagnostics();
	//    0    0:invokestatic    #270 <Method NetworkManager NetworkManager.defaultManager()>
	//    1    3:invokevirtual   #407 <Method NetworkDiagnostics NetworkManager.networkDiagnostics()>
	//    2    6:astore_1        
		N.a(((Object) (this)), EventType.NetworkDiagnosticEvent);
	//    3    7:aload_0         
	//    4    8:getfield        #263 <Field com.irobot.home.i.a N>
	//    5   11:aload_0         
	//    6   12:getstatic       #413 <Field EventType EventType.NetworkDiagnosticEvent>
	//    7   15:invokevirtual   #418 <Method void com.irobot.home.i.a.a(Object, EventType)>
		View view = LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b00a2, ((android.view.ViewGroup) (null)));
	//    8   18:aload_0         
	//    9   19:invokestatic    #424 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//   10   22:ldc2            #425 <Int 0x7f0b00a2>
	//   11   25:aconst_null     
	//   12   26:invokevirtual   #429 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   13   29:astore_2        
		K = (TextView)view.findViewById(0x7f090438);
	//   14   30:aload_0         
	//   15   31:aload_2         
	//   16   32:ldc2            #430 <Int 0x7f090438>
	//   17   35:invokevirtual   #436 <Method View View.findViewById(int)>
	//   18   38:checkcast       #438 <Class TextView>
	//   19   41:putfield        #241 <Field TextView K>
		K.setMovementMethod(((android.text.method.MovementMethod) (new LinkMovementMethod())));
	//   20   44:aload_0         
	//   21   45:getfield        #241 <Field TextView K>
	//   22   48:new             #440 <Class LinkMovementMethod>
	//   23   51:dup             
	//   24   52:invokespecial   #441 <Method void LinkMovementMethod()>
	//   25   55:invokevirtual   #445 <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((Button)view.findViewById(0x7f0901e5)).setOnClickListener(new android.view.View.OnClickListener(networkdiagnostics) {

			public void onClick(View view1)
			{
				com.irobot.home.DeveloperActivity.a(b).setText("");
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field DeveloperActivity b>
			//    2    4:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//    3    7:ldc1            #31  <String "">
			//    4    9:invokevirtual   #37  <Method void TextView.setText(CharSequence)>
				com.irobot.home.DeveloperActivity.a(b).scrollTo(0, 0);
			//    5   12:aload_0         
			//    6   13:getfield        #19  <Field DeveloperActivity b>
			//    7   16:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//    8   19:iconst_0        
			//    9   20:iconst_0        
			//   10   21:invokevirtual   #41  <Method void TextView.scrollTo(int, int)>
				com.irobot.home.DeveloperActivity.a(b, a.checkInternetConnectivity());
			//   11   24:aload_0         
			//   12   25:getfield        #19  <Field DeveloperActivity b>
			//   13   28:aload_0         
			//   14   29:getfield        #21  <Field NetworkDiagnostics a>
			//   15   32:invokevirtual   #47  <Method int NetworkDiagnostics.checkInternetConnectivity()>
			//   16   35:invokestatic    #50  <Method int com.irobot.home.DeveloperActivity.a(DeveloperActivity, int)>
			//   17   38:pop             
			//   18   39:return          
			}

			final NetworkDiagnostics a;
			final DeveloperActivity b;

			
			{
				b = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DeveloperActivity b>
				a = networkdiagnostics;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field NetworkDiagnostics a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   26   58:aload_2         
	//   27   59:ldc2            #446 <Int 0x7f0901e5>
	//   28   62:invokevirtual   #436 <Method View View.findViewById(int)>
	//   29   65:checkcast       #448 <Class Button>
	//   30   68:new             #16  <Class DeveloperActivity$12>
	//   31   71:dup             
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:invokespecial   #451 <Method void DeveloperActivity$12(DeveloperActivity, NetworkDiagnostics)>
	//   35   77:invokevirtual   #455 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		((Button)view.findViewById(0x7f090156)).setOnClickListener(new android.view.View.OnClickListener(networkdiagnostics) {

			public void onClick(View view1)
			{
				com.irobot.home.DeveloperActivity.a(b).setText("");
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field DeveloperActivity b>
			//    2    4:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//    3    7:ldc1            #31  <String "">
			//    4    9:invokevirtual   #37  <Method void TextView.setText(CharSequence)>
				com.irobot.home.DeveloperActivity.a(b).scrollTo(0, 0);
			//    5   12:aload_0         
			//    6   13:getfield        #19  <Field DeveloperActivity b>
			//    7   16:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//    8   19:iconst_0        
			//    9   20:iconst_0        
			//   10   21:invokevirtual   #41  <Method void TextView.scrollTo(int, int)>
				com.irobot.home.DeveloperActivity.a(b, a.checkDiscovery());
			//   11   24:aload_0         
			//   12   25:getfield        #19  <Field DeveloperActivity b>
			//   13   28:aload_0         
			//   14   29:getfield        #21  <Field NetworkDiagnostics a>
			//   15   32:invokevirtual   #47  <Method int NetworkDiagnostics.checkDiscovery()>
			//   16   35:invokestatic    #50  <Method int com.irobot.home.DeveloperActivity.a(DeveloperActivity, int)>
			//   17   38:pop             
			//   18   39:return          
			}

			final NetworkDiagnostics a;
			final DeveloperActivity b;

			
			{
				b = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DeveloperActivity b>
				a = networkdiagnostics;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field NetworkDiagnostics a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   36   80:aload_2         
	//   37   81:ldc2            #456 <Int 0x7f090156>
	//   38   84:invokevirtual   #436 <Method View View.findViewById(int)>
	//   39   87:checkcast       #448 <Class Button>
	//   40   90:new             #18  <Class DeveloperActivity$13>
	//   41   93:dup             
	//   42   94:aload_0         
	//   43   95:aload_1         
	//   44   96:invokespecial   #457 <Method void DeveloperActivity$13(DeveloperActivity, NetworkDiagnostics)>
	//   45   99:invokevirtual   #455 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		((Button)view.findViewById(0x7f090273)).setOnClickListener(new android.view.View.OnClickListener(networkdiagnostics) {

			public void onClick(View view1)
			{
				com.irobot.home.DeveloperActivity.a(b).setText("");
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field DeveloperActivity b>
			//    2    4:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//    3    7:ldc1            #31  <String "">
			//    4    9:invokevirtual   #37  <Method void TextView.setText(CharSequence)>
				com.irobot.home.DeveloperActivity.a(b).scrollTo(0, 0);
			//    5   12:aload_0         
			//    6   13:getfield        #19  <Field DeveloperActivity b>
			//    7   16:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//    8   19:iconst_0        
			//    9   20:iconst_0        
			//   10   21:invokevirtual   #41  <Method void TextView.scrollTo(int, int)>
				com.irobot.home.DeveloperActivity.a(b, a.checkMqttPort());
			//   11   24:aload_0         
			//   12   25:getfield        #19  <Field DeveloperActivity b>
			//   13   28:aload_0         
			//   14   29:getfield        #21  <Field NetworkDiagnostics a>
			//   15   32:invokevirtual   #47  <Method int NetworkDiagnostics.checkMqttPort()>
			//   16   35:invokestatic    #50  <Method int com.irobot.home.DeveloperActivity.a(DeveloperActivity, int)>
			//   17   38:pop             
			//   18   39:return          
			}

			final NetworkDiagnostics a;
			final DeveloperActivity b;

			
			{
				b = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DeveloperActivity b>
				a = networkdiagnostics;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field NetworkDiagnostics a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   46  102:aload_2         
	//   47  103:ldc2            #458 <Int 0x7f090273>
	//   48  106:invokevirtual   #436 <Method View View.findViewById(int)>
	//   49  109:checkcast       #448 <Class Button>
	//   50  112:new             #20  <Class DeveloperActivity$2>
	//   51  115:dup             
	//   52  116:aload_0         
	//   53  117:aload_1         
	//   54  118:invokespecial   #459 <Method void DeveloperActivity$2(DeveloperActivity, NetworkDiagnostics)>
	//   55  121:invokevirtual   #455 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setView(view).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener(this) {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				if(com.irobot.home.DeveloperActivity.b(b) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field DeveloperActivity b>
			//*   2    4:invokestatic    #28  <Method com.irobot.home.i.a com.irobot.home.DeveloperActivity.b(DeveloperActivity)>
			//*   3    7:ifnull          27
					com.irobot.home.DeveloperActivity.b(b).b(((Object) (a)), EventType.NetworkDiagnosticEvent);
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field DeveloperActivity b>
			//    6   14:invokestatic    #28  <Method com.irobot.home.i.a com.irobot.home.DeveloperActivity.b(DeveloperActivity)>
			//    7   17:aload_0         
			//    8   18:getfield        #20  <Field DeveloperActivity a>
			//    9   21:getstatic       #34  <Field EventType EventType.NetworkDiagnosticEvent>
			//   10   24:invokevirtual   #39  <Method void com.irobot.home.i.a.b(Object, EventType)>
				com.irobot.home.DeveloperActivity.a(b, ((TextView) (null)));
			//   11   27:aload_0         
			//   12   28:getfield        #18  <Field DeveloperActivity b>
			//   13   31:aconst_null     
			//   14   32:invokestatic    #42  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity, TextView)>
			//   15   35:pop             
				com.irobot.home.DeveloperActivity.a(b, 0);
			//   16   36:aload_0         
			//   17   37:getfield        #18  <Field DeveloperActivity b>
			//   18   40:iconst_0        
			//   19   41:invokestatic    #45  <Method int com.irobot.home.DeveloperActivity.a(DeveloperActivity, int)>
			//   20   44:pop             
			//   21   45:return          
			}

			final DeveloperActivity a;
			final DeveloperActivity b;

			
			{
				b = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field DeveloperActivity b>
				a = developeractivity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field DeveloperActivity a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Object()>
			//    8   14:return          
			}
		}
).setTitle("Network Diagnostics").show();
	//   56  124:new             #102 <Class android.app.AlertDialog$Builder>
	//   57  127:dup             
	//   58  128:aload_0         
	//   59  129:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   60  132:aload_2         
	//   61  133:invokevirtual   #463 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//   62  136:ldc2            #465 <String "Cancel">
	//   63  139:new             #22  <Class DeveloperActivity$3>
	//   64  142:dup             
	//   65  143:aload_0         
	//   66  144:aload_0         
	//   67  145:invokespecial   #468 <Method void DeveloperActivity$3(DeveloperActivity, DeveloperActivity)>
	//   68  148:invokevirtual   #470 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   69  151:ldc2            #472 <String "Network Diagnostics">
	//   70  154:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   71  157:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   72  160:pop             
	//   73  161:return          
	}

	void C()
	{
		Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.ClearAppReviewFeedbackData, ((com.irobot.core.ApplicationUIServiceData) (null)));
	//    0    0:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #476 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    2    6:getstatic       #482 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.ClearAppReviewFeedbackData>
	//    3    9:aconst_null     
	//    4   10:invokevirtual   #488 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, com.irobot.core.ApplicationUIServiceData)>
		Toast.makeText(((android.content.Context) (this)), "App review timestamp reset", 0).show();
	//    5   13:aload_0         
	//    6   14:ldc2            #490 <String "App review timestamp reset">
	//    7   17:iconst_0        
	//    8   18:invokestatic    #494 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//    9   21:invokevirtual   #225 <Method void Toast.show()>
	//   10   24:return          
	}

	void D()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Deprovision All Robots?").setMessage("All Robot information will be deleted from the iRobot HOME application.").setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				a.r.a(((com.irobot.home.q.b.a) (a)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeveloperActivity a>
			//    2    4:getfield        #26  <Field b DeveloperActivity.r>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field DeveloperActivity a>
			//    5   11:invokevirtual   #31  <Method void b.a(com.irobot.home.q.b$a)>
				a.r.b();
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field DeveloperActivity a>
			//    8   18:getfield        #26  <Field b DeveloperActivity.r>
			//    9   21:invokevirtual   #34  <Method void b.b()>
			//   10   24:return          
			}

			final DeveloperActivity a;

			
			{
				a = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeveloperActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #102 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #496 <String "Deprovision All Robots?">
	//    5   11:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    6   14:ldc2            #498 <String "All Robot information will be deleted from the iRobot HOME application.">
	//    7   17:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    8   20:ldc1            #252 <Int 0x7f0f05bb>
	//    9   22:new             #26  <Class DeveloperActivity$5>
	//   10   25:dup             
	//   11   26:aload_0         
	//   12   27:invokespecial   #501 <Method void DeveloperActivity$5(DeveloperActivity)>
	//   13   30:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   14   33:ldc1            #117 <Int 0x7f0f017d>
	//   15   35:aconst_null     
	//   16   36:invokevirtual   #121 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   17   39:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   18   42:pop             
	//   19   43:return          
	}

	public void E()
	{
		r.a(((com.irobot.home.q.b.a) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #504 <Field b r>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #509 <Method void b.a(com.irobot.home.q.b$a)>
		G.h().g();
	//    4    8:aload_0         
	//    5    9:getfield        #511 <Field IRobotApplication G>
	//    6   12:invokevirtual   #516 <Method IRobotModel IRobotApplication.h()>
	//    7   15:invokevirtual   #520 <Method void IRobotModel.g()>
		G.k();
	//    8   18:aload_0         
	//    9   19:getfield        #511 <Field IRobotApplication G>
	//   10   22:invokevirtual   #522 <Method void com.irobot.home.IRobotApplication.k()>
		Intent intent = new Intent(((android.content.Context) (this)), com/irobot/home/SelectRobotTypeActivity_);
	//   11   25:new             #524 <Class Intent>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:ldc2            #526 <Class SelectRobotTypeActivity_>
	//   15   33:invokespecial   #529 <Method void Intent(android.content.Context, Class)>
	//   16   36:astore_1        
		intent.addFlags(0x14008000);
	//   17   37:aload_1         
	//   18   38:ldc2            #530 <Int 0x14008000>
	//   19   41:invokevirtual   #534 <Method Intent Intent.addFlags(int)>
	//   20   44:pop             
		startActivity(intent);
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #538 <Method void startActivity(Intent)>
		finish();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #541 <Method void finish()>
	//   26   54:return          
	}

	protected void F()
	{
		G.a(false);
	//    0    0:aload_0         
	//    1    1:getfield        #511 <Field IRobotApplication G>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #544 <Method void com.irobot.home.IRobotApplication.a(boolean)>
		Toast.makeText(((android.content.Context) (this)), "Legal terms declined.", 0).show();
	//    4    8:aload_0         
	//    5    9:ldc2            #546 <String "Legal terms declined.">
	//    6   12:iconst_0        
	//    7   13:invokestatic    #494 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//    8   16:invokevirtual   #225 <Method void Toast.show()>
	//    9   19:return          
	}

	protected void G()
	{
		G.a(true);
	//    0    0:aload_0         
	//    1    1:getfield        #511 <Field IRobotApplication G>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #544 <Method void com.irobot.home.IRobotApplication.a(boolean)>
		G.a("0.9");
	//    4    8:aload_0         
	//    5    9:getfield        #511 <Field IRobotApplication G>
	//    6   12:ldc2            #548 <String "0.9">
	//    7   15:invokevirtual   #551 <Method void com.irobot.home.IRobotApplication.a(String)>
		Toast.makeText(((android.content.Context) (this)), "Legal terms set to version 0.9", 0).show();
	//    8   18:aload_0         
	//    9   19:ldc2            #553 <String "Legal terms set to version 0.9">
	//   10   22:iconst_0        
	//   11   23:invokestatic    #494 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   12   26:invokevirtual   #225 <Method void Toast.show()>
	//   13   29:return          
	}

	protected void H()
	{
		Assembler.getInstance().getAccountService().logout();
	//    0    0:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #557 <Method AccountService Assembler.getAccountService()>
	//    2    6:invokevirtual   #562 <Method void AccountService.logout()>
		com.irobot.home.util.j.a(((android.app.Activity) (this)), com.irobot.home.AccountLoginActivity_.a(((android.content.Context) (this))).b());
	//    3    9:aload_0         
	//    4   10:aload_0         
	//    5   11:invokestatic    #567 <Method AccountLoginActivity_$a com.irobot.home.AccountLoginActivity_.a(android.content.Context)>
	//    6   14:invokevirtual   #572 <Method Intent com.irobot.home.AccountLoginActivity_$a.b()>
	//    7   17:invokestatic    #575 <Method void j.a(android.app.Activity, Intent)>
	//    8   20:return          
	}

	protected void I()
	{
		throw new RuntimeException("This is a crash");
	//    0    0:new             #577 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #579 <String "This is a crash">
	//    3    7:invokespecial   #581 <Method void RuntimeException(String)>
	//    4   10:athrow          
	}

	protected void J()
	{
		com.irobot.home.util.o.b("Developer", "Sending query command to dock.");
	//    0    0:ldc2            #583 <String "Developer">
	//    1    3:ldc2            #585 <String "Sending query command to dock.">
	//    2    6:invokestatic    #590 <Method void o.b(String, String)>
		Assembler.getInstance().getMissionSubsystem(M.getAssetId()).sendCommand(CommandType.QUERYDOCK);
	//    3    9:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//    4   12:aload_0         
	//    5   13:getfield        #91  <Field AssetInfo M>
	//    6   16:invokevirtual   #595 <Method AssetId AssetInfo.getAssetId()>
	//    7   19:invokevirtual   #599 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//    8   22:getstatic       #605 <Field CommandType CommandType.QUERYDOCK>
	//    9   25:invokevirtual   #610 <Method void MissionSubsystem.sendCommand(CommandType)>
		Toast.makeText(((android.content.Context) (this)), "Please return to the clean screen to check dock status.", 0).show();
	//   10   28:aload_0         
	//   11   29:ldc2            #612 <String "Please return to the clean screen to check dock status.">
	//   12   32:iconst_0        
	//   13   33:invokestatic    #494 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   14   36:invokevirtual   #225 <Method void Toast.show()>
	//   15   39:return          
	}

	public void a(Parcelable parcelable)
	{
	//    0    0:return          
	}

	protected void a(boolean flag)
	{
		D.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field CustomButton D>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #620 <Method void CustomButton.setEnabled(boolean)>
	//    4    8:return          
	}

	public void b(Parcelable parcelable)
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Test meta OTA").setMessage("Robot firmware update preparation for meta OTA failed.").setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #102 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #622 <String "Test meta OTA">
	//    5   11:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    6   14:ldc2            #624 <String "Robot firmware update preparation for meta OTA failed.">
	//    7   17:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    8   20:ldc1            #252 <Int 0x7f0f05bb>
	//    9   22:aconst_null     
	//   10   23:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   26:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   29:pop             
	//   13   30:return          
	}

	public void c(Parcelable parcelable)
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Test meta OTA").setMessage("Robot firmware package upload via meta OTA finished succesfully.").setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #102 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #622 <String "Test meta OTA">
	//    5   11:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    6   14:ldc2            #626 <String "Robot firmware package upload via meta OTA finished succesfully.">
	//    7   17:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    8   20:ldc1            #252 <Int 0x7f0f05bb>
	//    9   22:aconst_null     
	//   10   23:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   26:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   29:pop             
	//   13   30:return          
	}

	public void d(Parcelable parcelable)
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Test meta OTA").setMessage("Robot firmware package upload via meta OTA failed.").setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #102 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #622 <String "Test meta OTA">
	//    5   11:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    6   14:ldc2            #628 <String "Robot firmware package upload via meta OTA failed.">
	//    7   17:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    8   20:ldc1            #252 <Int 0x7f0f05bb>
	//    9   22:aconst_null     
	//   10   23:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   26:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   29:pop             
	//   13   30:return          
	}

	void e()
	{
		b(0x7f0f0263);
	//    0    0:aload_0         
	//    1    1:ldc2            #629 <Int 0x7f0f0263>
	//    2    4:invokevirtual   #632 <Method void b(int)>
		Object obj = ((Object) (getSharedPreferences("DEVEL", 0)));
	//    3    7:aload_0         
	//    4    8:ldc2            #634 <String "DEVEL">
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #638 <Method SharedPreferences getSharedPreferences(String, int)>
	//    7   15:astore_1        
		a.setChecked(((SharedPreferences) (obj)).getBoolean("devel_website", i.m));
	//    8   16:aload_0         
	//    9   17:getfield        #640 <Field SwitchCompat a>
	//   10   20:aload_1         
	//   11   21:ldc2            #642 <String "devel_website">
	//   12   24:getstatic       #646 <Field boolean i.m>
	//   13   27:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   14   32:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		b.setChecked(((SharedPreferences) (obj)).getBoolean("manual_select_soft_ap", false));
	//   15   35:aload_0         
	//   16   36:getfield        #659 <Field SwitchCompat b>
	//   17   39:aload_1         
	//   18   40:ldc2            #661 <String "manual_select_soft_ap">
	//   19   43:iconst_0        
	//   20   44:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   21   49:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		c.setChecked(((SharedPreferences) (obj)).getBoolean("use_cloud", true));
	//   22   52:aload_0         
	//   23   53:getfield        #663 <Field SwitchCompat c>
	//   24   56:aload_1         
	//   25   57:ldc2            #665 <String "use_cloud">
	//   26   60:iconst_1        
	//   27   61:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   28   66:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		d.setChecked(((SharedPreferences) (obj)).getBoolean("reset_robot_after_setup", true));
	//   29   69:aload_0         
	//   30   70:getfield        #667 <Field SwitchCompat d>
	//   31   73:aload_1         
	//   32   74:ldc2            #669 <String "reset_robot_after_setup">
	//   33   77:iconst_1        
	//   34   78:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   35   83:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		f.setChecked(((SharedPreferences) (obj)).getBoolean("use_demo_map", false));
	//   36   86:aload_0         
	//   37   87:getfield        #671 <Field SwitchCompat f>
	//   38   90:aload_1         
	//   39   91:ldc2            #673 <String "use_demo_map">
	//   40   94:iconst_0        
	//   41   95:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   42  100:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		h.setChecked(((SharedPreferences) (obj)).getBoolean("enable_keepoutzones", false));
	//   43  103:aload_0         
	//   44  104:getfield        #675 <Field SwitchCompat h>
	//   45  107:aload_1         
	//   46  108:ldc2            #677 <String "enable_keepoutzones">
	//   47  111:iconst_0        
	//   48  112:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   49  117:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		i.setChecked(((SharedPreferences) (obj)).getBoolean("show_dirt_detect", true) ^ true);
	//   50  120:aload_0         
	//   51  121:getfield        #679 <Field SwitchCompat i>
	//   52  124:aload_1         
	//   53  125:ldc2            #681 <String "show_dirt_detect">
	//   54  128:iconst_1        
	//   55  129:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   56  134:iconst_1        
	//   57  135:ixor            
	//   58  136:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		j.setChecked(((SharedPreferences) (obj)).getBoolean("enable_notification_center", false));
	//   59  139:aload_0         
	//   60  140:getfield        #683 <Field SwitchCompat j>
	//   61  143:aload_1         
	//   62  144:ldc2            #685 <String "enable_notification_center">
	//   63  147:iconst_0        
	//   64  148:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   65  153:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		k.setChecked(((SharedPreferences) (obj)).getBoolean("show_care_on_clean_screen", false));
	//   66  156:aload_0         
	//   67  157:getfield        #687 <Field SwitchCompat k>
	//   68  160:aload_1         
	//   69  161:ldc2            #689 <String "show_care_on_clean_screen">
	//   70  164:iconst_0        
	//   71  165:invokeinterface #652 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   72  170:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
		obj = ((Object) (com.irobot.home.util.j.j()));
	//   73  173:invokestatic    #100 <Method a j.j()>
	//   74  176:astore_1        
		if(obj != null)
	//*  75  177:aload_1         
	//*  76  178:ifnull          321
		{
			M = ((a) (obj)).a();
	//   77  181:aload_0         
	//   78  182:aload_1         
	//   79  183:invokevirtual   #130 <Method AssetInfo a.a()>
	//   80  186:putfield        #91  <Field AssetInfo M>
			if(!AssetCapabilityUtils.isCloudCapable(M))
	//*  81  189:aload_0         
	//*  82  190:getfield        #91  <Field AssetInfo M>
	//*  83  193:invokestatic    #692 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  84  196:ifne            264
			{
				e.setEnabled(false);
	//   85  199:aload_0         
	//   86  200:getfield        #694 <Field SwitchCompat e>
	//   87  203:iconst_0        
	//   88  204:invokevirtual   #695 <Method void SwitchCompat.setEnabled(boolean)>
				m.setTextColor(getResources().getColor(0x7f06006d));
	//   89  207:aload_0         
	//   90  208:getfield        #697 <Field CustomTextView m>
	//   91  211:aload_0         
	//   92  212:invokevirtual   #701 <Method Resources getResources()>
	//   93  215:ldc2            #702 <Int 0x7f06006d>
	//   94  218:invokevirtual   #708 <Method int Resources.getColor(int)>
	//   95  221:invokevirtual   #713 <Method void CustomTextView.setTextColor(int)>
				g.setEnabled(false);
	//   96  224:aload_0         
	//   97  225:getfield        #715 <Field SwitchCompat g>
	//   98  228:iconst_0        
	//   99  229:invokevirtual   #695 <Method void SwitchCompat.setEnabled(boolean)>
				h.setEnabled(false);
	//  100  232:aload_0         
	//  101  233:getfield        #675 <Field SwitchCompat h>
	//  102  236:iconst_0        
	//  103  237:invokevirtual   #695 <Method void SwitchCompat.setEnabled(boolean)>
				j.setEnabled(false);
	//  104  240:aload_0         
	//  105  241:getfield        #683 <Field SwitchCompat j>
	//  106  244:iconst_0        
	//  107  245:invokevirtual   #695 <Method void SwitchCompat.setEnabled(boolean)>
				f.setEnabled(false);
	//  108  248:aload_0         
	//  109  249:getfield        #671 <Field SwitchCompat f>
	//  110  252:iconst_0        
	//  111  253:invokevirtual   #695 <Method void SwitchCompat.setEnabled(boolean)>
				c.setEnabled(false);
	//  112  256:aload_0         
	//  113  257:getfield        #663 <Field SwitchCompat c>
	//  114  260:iconst_0        
	//  115  261:invokevirtual   #695 <Method void SwitchCompat.setEnabled(boolean)>
			}
			n.setText(((CharSequence) (M.getAssetId().getId())));
	//  116  264:aload_0         
	//  117  265:getfield        #717 <Field CustomTextView n>
	//  118  268:aload_0         
	//  119  269:getfield        #91  <Field AssetInfo M>
	//  120  272:invokevirtual   #595 <Method AssetId AssetInfo.getAssetId()>
	//  121  275:invokevirtual   #722 <Method String AssetId.getId()>
	//  122  278:invokevirtual   #726 <Method void CustomTextView.setText(CharSequence)>
			P = Assembler.getInstance().getSettingsSubsystem(M.getAssetId());
	//  123  281:aload_0         
	//  124  282:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//  125  285:aload_0         
	//  126  286:getfield        #91  <Field AssetInfo M>
	//  127  289:invokevirtual   #595 <Method AssetId AssetInfo.getAssetId()>
	//  128  292:invokevirtual   #730 <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//  129  295:putfield        #732 <Field SettingsSubsystem P>
			a(P.getServiceData().getAvailableSettings().contains(((Object) (SettingType.DockCommunication))));
	//  130  298:aload_0         
	//  131  299:aload_0         
	//  132  300:getfield        #732 <Field SettingsSubsystem P>
	//  133  303:invokevirtual   #737 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//  134  306:invokevirtual   #743 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//  135  309:getstatic       #749 <Field SettingType SettingType.DockCommunication>
	//  136  312:invokevirtual   #754 <Method boolean HashSet.contains(Object)>
	//  137  315:invokevirtual   #755 <Method void a(boolean)>
		} else
	//* 138  318:goto            331
		{
			n.setText("Not Available");
	//  139  321:aload_0         
	//  140  322:getfield        #717 <Field CustomTextView n>
	//  141  325:ldc2            #757 <String "Not Available">
	//  142  328:invokevirtual   #726 <Method void CustomTextView.setText(CharSequence)>
		}
		N = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//  143  331:aload_0         
	//  144  332:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//  145  335:invokevirtual   #761 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//  146  338:checkcast       #415 <Class com.irobot.home.i.a>
	//  147  341:putfield        #263 <Field com.irobot.home.i.a N>
		K();
	//  148  344:aload_0         
	//  149  345:invokespecial   #763 <Method void K()>
		f();
	//  150  348:aload_0         
	//  151  349:invokevirtual   #765 <Method void f()>
		g();
	//  152  352:aload_0         
	//  153  353:invokevirtual   #766 <Method void g()>
		getWindow().setSoftInputMode(3);
	//  154  356:aload_0         
	//  155  357:invokevirtual   #770 <Method Window getWindow()>
	//  156  360:iconst_3        
	//  157  361:invokevirtual   #775 <Method void Window.setSoftInputMode(int)>
		E.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
			{
				adapterview = ((AdapterView) (adapterview.getItemAtPosition(i1).toString()));
			//    0    0:aload_1         
			//    1    1:iload_3         
			//    2    2:invokevirtual   #28  <Method Object AdapterView.getItemAtPosition(int)>
			//    3    5:invokevirtual   #32  <Method String Object.toString()>
			//    4    8:astore_1        
				if(com.irobot.home.util.j.i(((String) (adapterview))))
			//*   5    9:aload_1         
			//*   6   10:invokestatic    #38  <Method boolean j.i(String)>
			//*   7   13:ifeq            85
				{
					view = ((View) (new StringBuilder()));
			//    8   16:new             #40  <Class StringBuilder>
			//    9   19:dup             
			//   10   20:invokespecial   #41  <Method void StringBuilder()>
			//   11   23:astore_2        
					((StringBuilder) (view)).append("selected env: ");
			//   12   24:aload_2         
			//   13   25:ldc1            #43  <String "selected env: ">
			//   14   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   15   30:pop             
					((StringBuilder) (view)).append(((String) (adapterview)));
			//   16   31:aload_2         
			//   17   32:aload_1         
			//   18   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   19   36:pop             
					com.irobot.home.util.o.b("Developer", ((StringBuilder) (view)).toString());
			//   20   37:ldc1            #49  <String "Developer">
			//   21   39:aload_2         
			//   22   40:invokevirtual   #50  <Method String StringBuilder.toString()>
			//   23   43:invokestatic    #56  <Method void o.b(String, String)>
					com.irobot.home.util.j.p(((String) (adapterview)));
			//   24   46:aload_1         
			//   25   47:invokestatic    #60  <Method void j.p(String)>
					adapterview = ((AdapterView) (com.irobot.home.util.j.p()));
			//   26   50:invokestatic    #62  <Method String j.p()>
			//   27   53:astore_1        
					view = ((View) (new StringBuilder()));
			//   28   54:new             #40  <Class StringBuilder>
			//   29   57:dup             
			//   30   58:invokespecial   #41  <Method void StringBuilder()>
			//   31   61:astore_2        
					((StringBuilder) (view)).append("Axeda Simulator is");
			//   32   62:aload_2         
			//   33   63:ldc1            #64  <String "Axeda Simulator is">
			//   34   65:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   35   68:pop             
					((StringBuilder) (view)).append(((String) (adapterview)));
			//   36   69:aload_2         
			//   37   70:aload_1         
			//   38   71:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   39   74:pop             
					com.irobot.home.util.o.b("Developer", ((StringBuilder) (view)).toString());
			//   40   75:ldc1            #49  <String "Developer">
			//   41   77:aload_2         
			//   42   78:invokevirtual   #50  <Method String StringBuilder.toString()>
			//   43   81:invokestatic    #56  <Method void o.b(String, String)>
					return;
			//   44   84:return          
				} else
				{
					com.irobot.home.util.o.e("Developer", "AWS environment selector returned invalid string");
			//   45   85:ldc1            #49  <String "Developer">
			//   46   87:ldc1            #66  <String "AWS environment selector returned invalid string">
			//   47   89:invokestatic    #68  <Method void o.e(String, String)>
					return;
			//   48   92:return          
				}
			}

			public void onNothingSelected(AdapterView adapterview)
			{
			//    0    0:return          
			}

			final DeveloperActivity a;

			
			{
				a = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeveloperActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  158  364:aload_0         
	//  159  365:getfield        #777 <Field Spinner E>
	//  160  368:new             #10  <Class DeveloperActivity$1>
	//  161  371:dup             
	//  162  372:aload_0         
	//  163  373:invokespecial   #778 <Method void DeveloperActivity$1(DeveloperActivity)>
	//  164  376:invokevirtual   #784 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		F.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
			{
				adapterview = ((AdapterView) (adapterview.getItemAtPosition(i1).toString()));
			//    0    0:aload_1         
			//    1    1:iload_3         
			//    2    2:invokevirtual   #28  <Method Object AdapterView.getItemAtPosition(int)>
			//    3    5:invokevirtual   #32  <Method String Object.toString()>
			//    4    8:astore_1        
				if(com.irobot.home.util.j.i(((String) (adapterview))))
			//*   5    9:aload_1         
			//*   6   10:invokestatic    #38  <Method boolean j.i(String)>
			//*   7   13:ifeq            51
				{
					view = ((View) (new StringBuilder()));
			//    8   16:new             #40  <Class StringBuilder>
			//    9   19:dup             
			//   10   20:invokespecial   #41  <Method void StringBuilder()>
			//   11   23:astore_2        
					((StringBuilder) (view)).append("selected sitecore env: ");
			//   12   24:aload_2         
			//   13   25:ldc1            #43  <String "selected sitecore env: ">
			//   14   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   15   30:pop             
					((StringBuilder) (view)).append(((String) (adapterview)));
			//   16   31:aload_2         
			//   17   32:aload_1         
			//   18   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   19   36:pop             
					com.irobot.home.util.o.b("Developer", ((StringBuilder) (view)).toString());
			//   20   37:ldc1            #49  <String "Developer">
			//   21   39:aload_2         
			//   22   40:invokevirtual   #50  <Method String StringBuilder.toString()>
			//   23   43:invokestatic    #56  <Method void o.b(String, String)>
					com.irobot.home.util.j.q(((String) (adapterview)));
			//   24   46:aload_1         
			//   25   47:invokestatic    #60  <Method void j.q(String)>
					return;
			//   26   50:return          
				} else
				{
					com.irobot.home.util.o.e("Developer", "SiteCore environment selector returned invalid string");
			//   27   51:ldc1            #49  <String "Developer">
			//   28   53:ldc1            #62  <String "SiteCore environment selector returned invalid string">
			//   29   55:invokestatic    #64  <Method void o.e(String, String)>
					return;
			//   30   58:return          
				}
			}

			public void onNothingSelected(AdapterView adapterview)
			{
			//    0    0:return          
			}

			final DeveloperActivity a;

			
			{
				a = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeveloperActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  165  379:aload_0         
	//  166  380:getfield        #786 <Field Spinner F>
	//  167  383:new             #28  <Class DeveloperActivity$6>
	//  168  386:dup             
	//  169  387:aload_0         
	//  170  388:invokespecial   #787 <Method void DeveloperActivity$6(DeveloperActivity)>
	//  171  391:invokevirtual   #784 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		obj = ((Object) (M()));
	//  172  394:aload_0         
	//  173  395:invokespecial   #789 <Method ArrayList M()>
	//  174  398:astore_1        
		ArrayAdapter arrayadapter = new ArrayAdapter(((android.content.Context) (this)), 0x1090008, ((java.util.List) (obj)));
	//  175  399:new             #791 <Class ArrayAdapter>
	//  176  402:dup             
	//  177  403:aload_0         
	//  178  404:ldc2            #792 <Int 0x1090008>
	//  179  407:aload_1         
	//  180  408:invokespecial   #795 <Method void ArrayAdapter(android.content.Context, int, java.util.List)>
	//  181  411:astore_2        
		arrayadapter.setDropDownViewResource(0x1090009);
	//  182  412:aload_2         
	//  183  413:ldc2            #796 <Int 0x1090009>
	//  184  416:invokevirtual   #799 <Method void ArrayAdapter.setDropDownViewResource(int)>
		E.setAdapter(((android.widget.SpinnerAdapter) (arrayadapter)));
	//  185  419:aload_0         
	//  186  420:getfield        #777 <Field Spinner E>
	//  187  423:aload_2         
	//  188  424:invokevirtual   #803 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		O = a(((ArrayList) (obj)));
	//  189  427:aload_0         
	//  190  428:aload_0         
	//  191  429:aload_1         
	//  192  430:invokespecial   #805 <Method int a(ArrayList)>
	//  193  433:putfield        #807 <Field int O>
		E.setSelection(O);
	//  194  436:aload_0         
	//  195  437:getfield        #777 <Field Spinner E>
	//  196  440:aload_0         
	//  197  441:getfield        #807 <Field int O>
	//  198  444:invokevirtual   #810 <Method void Spinner.setSelection(int)>
		obj = ((Object) (N()));
	//  199  447:aload_0         
	//  200  448:invokespecial   #812 <Method ArrayList N()>
	//  201  451:astore_1        
		arrayadapter = new ArrayAdapter(((android.content.Context) (this)), 0x1090008, ((java.util.List) (obj)));
	//  202  452:new             #791 <Class ArrayAdapter>
	//  203  455:dup             
	//  204  456:aload_0         
	//  205  457:ldc2            #792 <Int 0x1090008>
	//  206  460:aload_1         
	//  207  461:invokespecial   #795 <Method void ArrayAdapter(android.content.Context, int, java.util.List)>
	//  208  464:astore_2        
		arrayadapter.setDropDownViewResource(0x1090009);
	//  209  465:aload_2         
	//  210  466:ldc2            #796 <Int 0x1090009>
	//  211  469:invokevirtual   #799 <Method void ArrayAdapter.setDropDownViewResource(int)>
		F.setAdapter(((android.widget.SpinnerAdapter) (arrayadapter)));
	//  212  472:aload_0         
	//  213  473:getfield        #786 <Field Spinner F>
	//  214  476:aload_2         
	//  215  477:invokevirtual   #803 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		F.setSelection(b(((ArrayList) (obj))));
	//  216  480:aload_0         
	//  217  481:getfield        #786 <Field Spinner F>
	//  218  484:aload_0         
	//  219  485:aload_1         
	//  220  486:invokespecial   #814 <Method int b(ArrayList)>
	//  221  489:invokevirtual   #810 <Method void Spinner.setSelection(int)>
		J = false;
	//  222  492:aload_0         
	//  223  493:iconst_0        
	//  224  494:putfield        #93  <Field boolean J>
		obj = ((Object) (Assembler.getInstance().getAccountService()));
	//  225  497:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//  226  500:invokevirtual   #557 <Method AccountService Assembler.getAccountService()>
	//  227  503:astore_1        
		B.setEnabled(((AccountService) (obj)).isLoggedIn());
	//  228  504:aload_0         
	//  229  505:getfield        #816 <Field CustomButton B>
	//  230  508:aload_1         
	//  231  509:invokevirtual   #819 <Method boolean AccountService.isLoggedIn()>
	//  232  512:invokevirtual   #620 <Method void CustomButton.setEnabled(boolean)>
		f.setEnabled(true);
	//  233  515:aload_0         
	//  234  516:getfield        #671 <Field SwitchCompat f>
	//  235  519:iconst_1        
	//  236  520:invokevirtual   #695 <Method void SwitchCompat.setEnabled(boolean)>
	//  237  523:return          
	}

	void f()
	{
		w.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #821 <Field CustomButton w>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #620 <Method void CustomButton.setEnabled(boolean)>
		if(M != null && AssetCapabilityUtils.isNonCloudCapableMoppingRobot(M))
	//*   4    8:aload_0         
	//*   5    9:getfield        #91  <Field AssetInfo M>
	//*   6   12:ifnull          52
	//*   7   15:aload_0         
	//*   8   16:getfield        #91  <Field AssetInfo M>
	//*   9   19:invokestatic    #824 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*  10   22:ifeq            52
		{
			N.a(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   11   25:aload_0         
	//   12   26:getfield        #263 <Field com.irobot.home.i.a N>
	//   13   29:aload_0         
	//   14   30:getstatic       #827 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   15   33:invokevirtual   #418 <Method void com.irobot.home.i.a.a(Object, EventType)>
			Assembler.getInstance().getUpdateUIService(M.getAssetId()).queryForSoftwareUpdate();
	//   16   36:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//   17   39:aload_0         
	//   18   40:getfield        #91  <Field AssetInfo M>
	//   19   43:invokevirtual   #595 <Method AssetId AssetInfo.getAssetId()>
	//   20   46:invokevirtual   #831 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   21   49:invokevirtual   #836 <Method void UpdateUIService.queryForSoftwareUpdate()>
		}
	//   22   52:return          
	}

	void g()
	{
		boolean flag;
		if(M != null && !AssetCapabilityUtils.isNonCloudCapableMoppingRobot(M) && AssetCapabilityUtils.isAwsEnabledAsset(M))
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field AssetInfo M>
	//*   2    4:ifnull          44
	//*   3    7:aload_0         
	//*   4    8:getfield        #91  <Field AssetInfo M>
	//*   5   11:invokestatic    #824 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*   6   14:ifne            44
	//*   7   17:aload_0         
	//*   8   18:getfield        #91  <Field AssetInfo M>
	//*   9   21:invokestatic    #839 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*  10   24:ifeq            44
			flag = P.getServiceData().getBooleanSetting(SettingType.PMapLearningAllowed);
	//   11   27:aload_0         
	//   12   28:getfield        #732 <Field SettingsSubsystem P>
	//   13   31:invokevirtual   #737 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   14   34:getstatic       #842 <Field SettingType SettingType.PMapLearningAllowed>
	//   15   37:invokevirtual   #846 <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
	//   16   40:istore_1        
		else
	//*  17   41:goto            46
			flag = false;
	//   18   44:iconst_0        
	//   19   45:istore_1        
		g.setChecked(flag);
	//   20   46:aload_0         
	//   21   47:getfield        #715 <Field SwitchCompat g>
	//   22   50:iload_1         
	//   23   51:invokevirtual   #657 <Method void SwitchCompat.setChecked(boolean)>
	//   24   54:return          
	}

	void h()
	{
		if(J)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field boolean J>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    4    8:aload_0         
	//    5    9:ldc2            #634 <String "DEVEL">
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #638 <Method SharedPreferences getSharedPreferences(String, int)>
	//    8   16:invokeinterface #850 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   21:astore_1        
			editor.putBoolean("devel_website", a.isChecked());
	//   10   22:aload_1         
	//   11   23:ldc2            #642 <String "devel_website">
	//   12   26:aload_0         
	//   13   27:getfield        #640 <Field SwitchCompat a>
	//   14   30:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   15   33:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   16   38:pop             
			editor.putBoolean("manual_select_soft_ap", b.isChecked());
	//   17   39:aload_1         
	//   18   40:ldc2            #661 <String "manual_select_soft_ap">
	//   19   43:aload_0         
	//   20   44:getfield        #659 <Field SwitchCompat b>
	//   21   47:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   22   50:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   23   55:pop             
			editor.putBoolean("use_cloud", c.isChecked());
	//   24   56:aload_1         
	//   25   57:ldc2            #665 <String "use_cloud">
	//   26   60:aload_0         
	//   27   61:getfield        #663 <Field SwitchCompat c>
	//   28   64:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   29   67:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   30   72:pop             
			editor.putBoolean("reset_robot_after_setup", d.isChecked());
	//   31   73:aload_1         
	//   32   74:ldc2            #669 <String "reset_robot_after_setup">
	//   33   77:aload_0         
	//   34   78:getfield        #667 <Field SwitchCompat d>
	//   35   81:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   36   84:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   37   89:pop             
			i.c = a.isChecked();
	//   38   90:aload_0         
	//   39   91:getfield        #640 <Field SwitchCompat a>
	//   40   94:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   41   97:putstatic       #861 <Field boolean i.c>
			i.d = b.isChecked();
	//   42  100:aload_0         
	//   43  101:getfield        #659 <Field SwitchCompat b>
	//   44  104:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   45  107:putstatic       #863 <Field boolean i.d>
			i.e = c.isChecked();
	//   46  110:aload_0         
	//   47  111:getfield        #663 <Field SwitchCompat c>
	//   48  114:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   49  117:putstatic       #865 <Field boolean i.e>
			i.g = d.isChecked();
	//   50  120:aload_0         
	//   51  121:getfield        #667 <Field SwitchCompat d>
	//   52  124:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   53  127:putstatic       #867 <Field boolean i.g>
			editor.apply();
	//   54  130:aload_1         
	//   55  131:invokeinterface #870 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   56  136:return          
		}
	}

	void i()
	{
		if(J)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field boolean J>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		Object obj = ((Object) (com.irobot.home.util.j.k()));
	//    4    8:invokestatic    #872 <Method AssetId j.k()>
	//    5   11:astore_1        
		if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          39
		{
			obj = ((Object) (Assembler.getInstance().getCommandTierAgent(((AssetId) (obj)))));
	//    8   16:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #876 <Method CommandTierAgent Assembler.getCommandTierAgent(AssetId)>
	//   11   23:astore_1        
			if(obj != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          39
				((CommandTierAgent) (obj)).setFakeRemoteNetworkDownMessages(e.isChecked());
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #694 <Field SwitchCompat e>
	//   17   33:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   18   36:invokevirtual   #881 <Method void CommandTierAgent.setFakeRemoteNetworkDownMessages(boolean)>
		}
	//   19   39:return          
	}

	void j()
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    0    0:aload_0         
	//    1    1:ldc2            #634 <String "DEVEL">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #638 <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    8:invokeinterface #850 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_1        
		editor.putBoolean("use_demo_map", f.isChecked());
	//    6   14:aload_1         
	//    7   15:ldc2            #673 <String "use_demo_map">
	//    8   18:aload_0         
	//    9   19:getfield        #671 <Field SwitchCompat f>
	//   10   22:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   11   25:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   12   30:pop             
		i.h = f.isChecked();
	//   13   31:aload_0         
	//   14   32:getfield        #671 <Field SwitchCompat f>
	//   15   35:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   16   38:putstatic       #883 <Field boolean i.h>
		editor.apply();
	//   17   41:aload_1         
	//   18   42:invokeinterface #870 <Method void android.content.SharedPreferences$Editor.apply()>
		Assembler.getInstance().setMapDemoModeEnabled(f.isChecked());
	//   19   47:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//   20   50:aload_0         
	//   21   51:getfield        #671 <Field SwitchCompat f>
	//   22   54:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   23   57:invokevirtual   #886 <Method void Assembler.setMapDemoModeEnabled(boolean)>
	//   24   60:return          
	}

	void k()
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    0    0:aload_0         
	//    1    1:ldc2            #634 <String "DEVEL">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #638 <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    8:invokeinterface #850 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_1        
		editor.putBoolean("show_dirt_detect", i.isChecked() ^ true);
	//    6   14:aload_1         
	//    7   15:ldc2            #681 <String "show_dirt_detect">
	//    8   18:aload_0         
	//    9   19:getfield        #679 <Field SwitchCompat i>
	//   10   22:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   11   25:iconst_1        
	//   12   26:ixor            
	//   13   27:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   14   32:pop             
		i.i = i.isChecked() ^ true;
	//   15   33:aload_0         
	//   16   34:getfield        #679 <Field SwitchCompat i>
	//   17   37:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   18   40:iconst_1        
	//   19   41:ixor            
	//   20   42:putstatic       #888 <Field boolean i.i>
		editor.apply();
	//   21   45:aload_1         
	//   22   46:invokeinterface #870 <Method void android.content.SharedPreferences$Editor.apply()>
	//   23   51:return          
	}

	void l()
	{
		if(P.getServiceData().getAvailableSettings().contains(((Object) (SettingType.PMapLearningAllowed))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #732 <Field SettingsSubsystem P>
	//*   2    4:invokevirtual   #737 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//*   3    7:invokevirtual   #743 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//*   4   10:getstatic       #842 <Field SettingType SettingType.PMapLearningAllowed>
	//*   5   13:invokevirtual   #754 <Method boolean HashSet.contains(Object)>
	//*   6   16:ifeq            48
		{
			SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//    7   19:invokestatic    #891 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    8   22:astore_1        
			settingsuiservicedata.setBooleanSetting(SettingType.PMapLearningAllowed, g.isChecked());
	//    9   23:aload_1         
	//   10   24:getstatic       #842 <Field SettingType SettingType.PMapLearningAllowed>
	//   11   27:aload_0         
	//   12   28:getfield        #715 <Field SwitchCompat g>
	//   13   31:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   14   34:invokevirtual   #895 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
			P.sendCommand(SettingsUIServiceCommand.UpdateSetting, settingsuiservicedata);
	//   15   37:aload_0         
	//   16   38:getfield        #732 <Field SettingsSubsystem P>
	//   17   41:getstatic       #901 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//   18   44:aload_1         
	//   19   45:invokevirtual   #904 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
		}
	//   20   48:return          
	}

	void m()
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    0    0:aload_0         
	//    1    1:ldc2            #634 <String "DEVEL">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #638 <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    8:invokeinterface #850 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_1        
		editor.putBoolean("enable_keepoutzones", h.isChecked());
	//    6   14:aload_1         
	//    7   15:ldc2            #677 <String "enable_keepoutzones">
	//    8   18:aload_0         
	//    9   19:getfield        #675 <Field SwitchCompat h>
	//   10   22:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   11   25:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   12   30:pop             
		i.k = h.isChecked();
	//   13   31:aload_0         
	//   14   32:getfield        #675 <Field SwitchCompat h>
	//   15   35:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   16   38:putstatic       #906 <Field boolean i.k>
		editor.apply();
	//   17   41:aload_1         
	//   18   42:invokeinterface #870 <Method void android.content.SharedPreferences$Editor.apply()>
		Assembler.getInstance().setKeepOutZonesEnabled(h.isChecked());
	//   19   47:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//   20   50:aload_0         
	//   21   51:getfield        #675 <Field SwitchCompat h>
	//   22   54:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   23   57:invokevirtual   #909 <Method void Assembler.setKeepOutZonesEnabled(boolean)>
	//   24   60:return          
	}

	void n()
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    0    0:aload_0         
	//    1    1:ldc2            #634 <String "DEVEL">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #638 <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    8:invokeinterface #850 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_1        
		editor.putBoolean("enable_notification_center", j.isChecked());
	//    6   14:aload_1         
	//    7   15:ldc2            #685 <String "enable_notification_center">
	//    8   18:aload_0         
	//    9   19:getfield        #683 <Field SwitchCompat j>
	//   10   22:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   11   25:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   12   30:pop             
		i.l = j.isChecked();
	//   13   31:aload_0         
	//   14   32:getfield        #683 <Field SwitchCompat j>
	//   15   35:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   16   38:putstatic       #911 <Field boolean i.l>
		editor.apply();
	//   17   41:aload_1         
	//   18   42:invokeinterface #870 <Method void android.content.SharedPreferences$Editor.apply()>
	//   19   47:return          
	}

	void o()
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences("DEVEL", 0).edit();
	//    0    0:aload_0         
	//    1    1:ldc2            #634 <String "DEVEL">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #638 <Method SharedPreferences getSharedPreferences(String, int)>
	//    4    8:invokeinterface #850 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_1        
		editor.putBoolean("show_care_on_clean_screen", k.isChecked());
	//    6   14:aload_1         
	//    7   15:ldc2            #689 <String "show_care_on_clean_screen">
	//    8   18:aload_0         
	//    9   19:getfield        #687 <Field SwitchCompat k>
	//   10   22:invokevirtual   #853 <Method boolean SwitchCompat.isChecked()>
	//   11   25:invokeinterface #859 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   12   30:pop             
		editor.apply();
	//   13   31:aload_1         
	//   14   32:invokeinterface #870 <Method void android.content.SharedPreferences$Editor.apply()>
	//   15   37:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		if(assetupdateavailabilityevent.updateInfo() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #920 <Method com.irobot.core.FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//*   2    4:ifnull          41
		{
			if(N != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #263 <Field com.irobot.home.i.a N>
	//*   5   11:ifnull          25
				N.b(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//    6   14:aload_0         
	//    7   15:getfield        #263 <Field com.irobot.home.i.a N>
	//    8   18:aload_0         
	//    9   19:getstatic       #827 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   10   22:invokevirtual   #922 <Method void com.irobot.home.i.a.b(Object, EventType)>
			I.a(assetupdateavailabilityevent);
	//   11   25:aload_0         
	//   12   26:getfield        #924 <Field AssetSoftwareUpdateUtils I>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #928 <Method void AssetSoftwareUpdateUtils.a(AssetUpdateAvailabilityEvent)>
			w.setEnabled(true);
	//   15   33:aload_0         
	//   16   34:getfield        #821 <Field CustomButton w>
	//   17   37:iconst_1        
	//   18   38:invokevirtual   #620 <Method void CustomButton.setEnabled(boolean)>
		}
	//   19   41:return          
	}

	public void onBackPressed()
	{
		IRobotApplication irobotapplication = (IRobotApplication)getApplication();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #934 <Method android.app.Application getApplication()>
	//    2    4:checkcast       #513 <Class IRobotApplication>
	//    3    7:astore_2        
		String s1;
		if(i.c)
	//*   4    8:getstatic       #861 <Field boolean i.c>
	//*   5   11:ifeq            21
			s1 = "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/";
	//    6   14:ldc2            #936 <String "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/">
	//    7   17:astore_1        
		else
	//*   8   18:goto            25
			s1 = "https://homesupport.irobot.com/cc/api/v1/";
	//    9   21:ldc2            #938 <String "https://homesupport.irobot.com/cc/api/v1/">
	//   10   24:astore_1        
		irobotapplication.b(s1);
	//   11   25:aload_2         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #940 <Method void com.irobot.home.IRobotApplication.b(String)>
		if(B.isEnabled() && O != E.getSelectedItemPosition())
	//*  14   30:aload_0         
	//*  15   31:getfield        #816 <Field CustomButton B>
	//*  16   34:invokevirtual   #943 <Method boolean CustomButton.isEnabled()>
	//*  17   37:ifeq            58
	//*  18   40:aload_0         
	//*  19   41:getfield        #807 <Field int O>
	//*  20   44:aload_0         
	//*  21   45:getfield        #777 <Field Spinner E>
	//*  22   48:invokevirtual   #947 <Method int Spinner.getSelectedItemPosition()>
	//*  23   51:icmpeq          58
			H();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #949 <Method void H()>
		super.onBackPressed();
	//   26   58:aload_0         
	//   27   59:invokespecial   #951 <Method void BaseFragmentActivity.onBackPressed()>
	//   28   62:return          
	}

	public void onNetworkDiagnosticEvent(NetworkDiagnosticEvent networkdiagnosticevent)
	{
		(new Handler(Looper.getMainLooper())).post(new Runnable(networkdiagnosticevent) {

			public void run()
			{
				if(com.irobot.home.DeveloperActivity.a(b) != null && a.executionId() == DeveloperActivity.c(b))
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field DeveloperActivity b>
			//*   2    4:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//*   3    7:ifnull          70
			//*   4   10:aload_0         
			//*   5   11:getfield        #21  <Field NetworkDiagnosticEvent a>
			//*   6   14:invokevirtual   #35  <Method int NetworkDiagnosticEvent.executionId()>
			//*   7   17:aload_0         
			//*   8   18:getfield        #19  <Field DeveloperActivity b>
			//*   9   21:invokestatic    #39  <Method int DeveloperActivity.c(DeveloperActivity)>
			//*  10   24:icmpne          70
				{
					TextView textview = com.irobot.home.DeveloperActivity.a(b);
			//   11   27:aload_0         
			//   12   28:getfield        #19  <Field DeveloperActivity b>
			//   13   31:invokestatic    #29  <Method TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity)>
			//   14   34:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
			//   15   35:new             #41  <Class StringBuilder>
			//   16   38:dup             
			//   17   39:invokespecial   #42  <Method void StringBuilder()>
			//   18   42:astore_2        
					stringbuilder.append(a.progress());
			//   19   43:aload_2         
			//   20   44:aload_0         
			//   21   45:getfield        #21  <Field NetworkDiagnosticEvent a>
			//   22   48:invokevirtual   #46  <Method String NetworkDiagnosticEvent.progress()>
			//   23   51:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//   24   54:pop             
					stringbuilder.append("\n");
			//   25   55:aload_2         
			//   26   56:ldc1            #52  <String "\n">
			//   27   58:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//   28   61:pop             
					textview.append(((CharSequence) (stringbuilder.toString())));
			//   29   62:aload_1         
			//   30   63:aload_2         
			//   31   64:invokevirtual   #55  <Method String StringBuilder.toString()>
			//   32   67:invokevirtual   #60  <Method void TextView.append(CharSequence)>
				}
			//   33   70:return          
			}

			final NetworkDiagnosticEvent a;
			final DeveloperActivity b;

			
			{
				b = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DeveloperActivity b>
				a = networkdiagnosticevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field NetworkDiagnosticEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:new             #955 <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #961 <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #964 <Method void Handler(Looper)>
	//    4   10:new             #24  <Class DeveloperActivity$4>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #967 <Method void DeveloperActivity$4(DeveloperActivity, NetworkDiagnosticEvent)>
	//    9   19:invokevirtual   #971 <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	void p()
	{
		Object obj = ((Object) (((Object) (o.getText())).toString()));
	//    0    0:aload_0         
	//    1    1:getfield        #974 <Field EditText o>
	//    2    4:invokevirtual   #980 <Method android.text.Editable EditText.getText()>
	//    3    7:invokevirtual   #983 <Method String Object.toString()>
	//    4   10:astore_1        
		if(a(((String) (obj))))
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:invokespecial   #985 <Method boolean a(String)>
	//*   8   16:ifeq            151
		{
			Object obj1 = ((Object) (((w)com.irobot.home.util.j.j()).c()));
	//    9   19:invokestatic    #100 <Method a j.j()>
	//   10   22:checkcast       #987 <Class w>
	//   11   25:invokevirtual   #990 <Method Robot w.c()>
	//   12   28:astore_2        
			obj1 = ((Object) (G.e(((Robot) (obj1)).r())));
	//   13   29:aload_0         
	//   14   30:getfield        #511 <Field IRobotApplication G>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #993 <Method String Robot.r()>
	//   17   37:invokevirtual   #996 <Method com.irobot.home.i IRobotApplication.e(String)>
	//   18   40:astore_2        
			if(obj1 == null)
	//*  19   41:aload_2         
	//*  20   42:ifnonnull       78
			{
				obj = ((Object) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("No update manager").setMessage("Could not create an update manager for running meta OTA")));
	//   21   45:new             #102 <Class android.app.AlertDialog$Builder>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   25   53:ldc2            #998 <String "No update manager">
	//   26   56:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   27   59:ldc2            #1000 <String "Could not create an update manager for running meta OTA">
	//   28   62:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   29   65:astore_1        
			} else
	//*  30   66:aload_1         
	//*  31   67:ldc1            #117 <Int 0x7f0f017d>
	//*  32   69:aconst_null     
	//*  33   70:invokevirtual   #121 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//*  34   73:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//*  35   76:pop             
	//*  36   77:return          
			{
				((com.irobot.home.i) (obj1)).a(((i.b) (this)));
	//   37   78:aload_2         
	//   38   79:aload_0         
	//   39   80:invokevirtual   #1005 <Method void com.irobot.home.i.a(i$b)>
				android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Test meta OTA?");
	//   40   83:new             #102 <Class android.app.AlertDialog$Builder>
	//   41   86:dup             
	//   42   87:aload_0         
	//   43   88:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   44   91:ldc2            #1007 <String "Test meta OTA?">
	//   45   94:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   46   97:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   47   98:new             #276 <Class StringBuilder>
	//   48  101:dup             
	//   49  102:invokespecial   #277 <Method void StringBuilder()>
	//   50  105:astore          4
				stringbuilder.append("Robot firmware package will be installed via ");
	//   51  107:aload           4
	//   52  109:ldc2            #1009 <String "Robot firmware package will be installed via ">
	//   53  112:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   54  115:pop             
				stringbuilder.append(((String) (obj)));
	//   55  116:aload           4
	//   56  118:aload_1         
	//   57  119:invokevirtual   #299 <Method StringBuilder StringBuilder.append(String)>
	//   58  122:pop             
				obj = ((Object) (builder.setMessage(((CharSequence) (stringbuilder.toString()))).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(((com.irobot.home.i) (obj1)), ((String) (obj))) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						a.a(b, true, ((Parcelable) (null)));
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field com.irobot.home.i a>
					//    2    4:aload_0         
					//    3    5:getfield        #25  <Field String b>
					//    4    8:iconst_1        
					//    5    9:aconst_null     
					//    6   10:invokevirtual   #35  <Method void com.irobot.home.i.a(String, boolean, Parcelable)>
					//    7   13:return          
					}

					final com.irobot.home.i a;
					final String b;
					final DeveloperActivity c;

			
			{
				c = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DeveloperActivity c>
				a = i1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.irobot.home.i a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
)));
	//   59  123:aload_3         
	//   60  124:aload           4
	//   61  126:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   62  129:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   63  132:ldc1            #252 <Int 0x7f0f05bb>
	//   64  134:new             #30  <Class DeveloperActivity$7>
	//   65  137:dup             
	//   66  138:aload_0         
	//   67  139:aload_2         
	//   68  140:aload_1         
	//   69  141:invokespecial   #1012 <Method void DeveloperActivity$7(DeveloperActivity, com.irobot.home.i, String)>
	//   70  144:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   71  147:astore_1        
			}
			((android.app.AlertDialog.Builder) (obj)).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
			return;
		} else
	//*  72  148:goto            66
		{
			return;
	//   73  151:return          
		}
	}

	protected void q()
	{
		if(L())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #257 <Method boolean L()>
	//*   2    4:ifeq            19
		{
			com.irobot.home.LocalOtaHttpsActivity_.a(((android.content.Context) (this))).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #1018 <Method LocalOtaHttpsActivity_$a com.irobot.home.LocalOtaHttpsActivity_.a(android.content.Context)>
	//    5   11:invokevirtual   #1023 <Method org.androidannotations.api.a.e com.irobot.home.LocalOtaHttpsActivity_$a.a()>
	//    6   14:pop             
			finish();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #541 <Method void finish()>
		}
	//    9   19:return          
	}

	void r()
	{
		a a1 = com.irobot.home.util.j.j();
	//    0    0:invokestatic    #100 <Method a j.j()>
	//    1    3:astore_1        
		if(a1 != null && !AssetCapabilityUtils.isNonCloudCapableMoppingRobot(a1.a()))
	//*   2    4:aload_1         
	//*   3    5:ifnull          40
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #130 <Method AssetInfo a.a()>
	//*   6   12:invokestatic    #824 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*   7   15:ifeq            21
	//*   8   18:goto            40
		{
			com.irobot.home.MapCustomizationActivity_.a(((android.content.Context) (this))).a(a1.b().getId()).a();
	//    9   21:aload_0         
	//   10   22:invokestatic    #1028 <Method MapCustomizationActivity_$a com.irobot.home.MapCustomizationActivity_.a(android.content.Context)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #141 <Method AssetId a.b()>
	//   13   29:invokevirtual   #722 <Method String AssetId.getId()>
	//   14   32:invokevirtual   #1033 <Method MapCustomizationActivity_$a com.irobot.home.MapCustomizationActivity_$a.a(String)>
	//   15   35:invokevirtual   #1034 <Method org.androidannotations.api.a.e com.irobot.home.MapCustomizationActivity_$a.a()>
	//   16   38:pop             
			return;
	//   17   39:return          
		} else
		{
			O();
	//   18   40:aload_0         
	//   19   41:invokespecial   #1036 <Method void O()>
			return;
	//   20   44:return          
		}
	}

	void s()
	{
		a a1 = com.irobot.home.util.j.j();
	//    0    0:invokestatic    #100 <Method a j.j()>
	//    1    3:astore_1        
		if(a1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
		{
			return;
	//    4    8:return          
		} else
		{
			com.irobot.home.CustomerRegistrationActivity_.a(((android.content.Context) (this))).a(a1.b().getId()).a();
	//    5    9:aload_0         
	//    6   10:invokestatic    #1041 <Method CustomerRegistrationActivity_$a com.irobot.home.CustomerRegistrationActivity_.a(android.content.Context)>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #141 <Method AssetId a.b()>
	//    9   17:invokevirtual   #722 <Method String AssetId.getId()>
	//   10   20:invokevirtual   #1046 <Method CustomerRegistrationActivity_$a com.irobot.home.CustomerRegistrationActivity_$a.a(String)>
	//   11   23:invokevirtual   #1047 <Method org.androidannotations.api.a.e com.irobot.home.CustomerRegistrationActivity_$a.a()>
	//   12   26:pop             
			return;
	//   13   27:return          
		}
	}

	public void showBehaviorLogs(View view)
	{
		view = ((View) (com.irobot.home.util.j.j()));
	//    0    0:invokestatic    #100 <Method a j.j()>
	//    1    3:astore_1        
		if(view != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          41
		{
			if(AssetCapabilityUtils.isNonCloudCapableMoppingRobot(((a) (view)).a()))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #130 <Method AssetInfo a.a()>
	//*   6   12:invokestatic    #824 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*   7   15:ifeq            23
			{
				O();
	//    8   18:aload_0         
	//    9   19:invokespecial   #1036 <Method void O()>
				return;
	//   10   22:return          
			}
			com.irobot.home.LogStreamActivity_.a(((android.content.Context) (this))).a(((a) (view)).b().getId()).a();
	//   11   23:aload_0         
	//   12   24:invokestatic    #1054 <Method LogStreamActivity_$a com.irobot.home.LogStreamActivity_.a(android.content.Context)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #141 <Method AssetId a.b()>
	//   15   31:invokevirtual   #722 <Method String AssetId.getId()>
	//   16   34:invokevirtual   #1059 <Method LogStreamActivity_$a com.irobot.home.LogStreamActivity_$a.a(String)>
	//   17   37:invokevirtual   #1060 <Method org.androidannotations.api.a.e com.irobot.home.LogStreamActivity_$a.a()>
	//   18   40:pop             
		}
	//   19   41:return          
	}

	public void showLogcat(View view)
	{
		com.irobot.home.ShowLogcatActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #1066 <Method ShowLogcatActivity_$a com.irobot.home.ShowLogcatActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #1069 <Method org.androidannotations.api.a.e com.irobot.home.ShowLogcatActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void t()
	{
		if(L())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #257 <Method boolean L()>
	//*   2    4:ifeq            44
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage("If there is no firmware package included in the app, you can update to the latest firmware available by Sitecore.").setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					com.irobot.home.OtaMqttActivity_.a(((android.content.Context) (a))).a();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field DeveloperActivity a>
				//    2    4:invokestatic    #27  <Method OtaMqttActivity_$a com.irobot.home.OtaMqttActivity_.a(android.content.Context)>
				//    3    7:invokevirtual   #32  <Method org.androidannotations.api.a.e com.irobot.home.OtaMqttActivity_$a.a()>
				//    4   10:pop             
					a.finish();
				//    5   11:aload_0         
				//    6   12:getfield        #17  <Field DeveloperActivity a>
				//    7   15:invokevirtual   #35  <Method void DeveloperActivity.finish()>
				//    8   18:return          
				}

				final DeveloperActivity a;

			
			{
				a = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeveloperActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    3    7:new             #102 <Class android.app.AlertDialog$Builder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    7   15:ldc2            #1071 <String "If there is no firmware package included in the app, you can update to the latest firmware available by Sitecore.">
	//    8   18:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    9   21:ldc1            #252 <Int 0x7f0f05bb>
	//   10   23:new             #32  <Class DeveloperActivity$8>
	//   11   26:dup             
	//   12   27:aload_0         
	//   13   28:invokespecial   #1072 <Method void DeveloperActivity$8(DeveloperActivity)>
	//   14   31:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   15   34:ldc1            #117 <Int 0x7f0f017d>
	//   16   36:aconst_null     
	//   17   37:invokevirtual   #121 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   18   40:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   19   43:pop             
	//   20   44:return          
	}

	void x()
	{
		a a1 = com.irobot.home.util.j.j();
	//    0    0:invokestatic    #100 <Method a j.j()>
	//    1    3:astore_1        
		if(a1 != null && !AssetCapabilityUtils.isNonCloudCapableMoppingRobot(a1.a()))
	//*   2    4:aload_1         
	//*   3    5:ifnull          44
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #130 <Method AssetInfo a.a()>
	//*   6   12:invokestatic    #824 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*   7   15:ifeq            21
	//*   8   18:goto            44
		{
			com.irobot.home.RobotCleaningPreferencesActivity_.a(((android.content.Context) (this))).a(a1.b().getId()).a(true).a();
	//    9   21:aload_0         
	//   10   22:invokestatic    #1077 <Method RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_.a(android.content.Context)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #141 <Method AssetId a.b()>
	//   13   29:invokevirtual   #722 <Method String AssetId.getId()>
	//   14   32:invokevirtual   #1082 <Method RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_$a.a(String)>
	//   15   35:iconst_1        
	//   16   36:invokevirtual   #1085 <Method RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_$a.a(boolean)>
	//   17   39:invokevirtual   #1086 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleaningPreferencesActivity_$a.a()>
	//   18   42:pop             
			return;
	//   19   43:return          
		} else
		{
			O();
	//   20   44:aload_0         
	//   21   45:invokespecial   #1036 <Method void O()>
			return;
	//   22   48:return          
		}
	}

	void y()
	{
		I.a(((android.content.DialogInterface.OnClickListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #924 <Field AssetSoftwareUpdateUtils I>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #1089 <Method void AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener)>
	//    4    8:return          
	}

	void z()
	{
		HashSet hashset = AccountUtils.getInternalFeatureSwitchFeatureTypes();
	//    0    0:invokestatic    #1094 <Method HashSet AccountUtils.getInternalFeatureSwitchFeatureTypes()>
	//    1    3:astore_3        
		Object aobj[] = ((Object []) ((FeatureType[])hashset.toArray(((Object []) (new FeatureType[hashset.size()])))));
	//    2    4:aload_3         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #1097 <Method int HashSet.size()>
	//    5    9:anewarray       FeatureType[]
	//    6   12:invokevirtual   #1103 <Method Object[] HashSet.toArray(Object[])>
	//    7   15:checkcast       #1105 <Class FeatureType[]>
	//    8   18:astore          5
		CharSequence acharsequence[] = new CharSequence[hashset.size()];
	//    9   20:aload_3         
	//   10   21:invokevirtual   #1097 <Method int HashSet.size()>
	//   11   24:anewarray       CharSequence[]
	//   12   27:astore          4
		boolean flag = false;
	//   13   29:iconst_0        
	//   14   30:istore_2        
		for(int i1 = 0; i1 < hashset.size(); i1++)
	//*  15   31:iconst_0        
	//*  16   32:istore_1        
	//*  17   33:iload_1         
	//*  18   34:aload_3         
	//*  19   35:invokevirtual   #1097 <Method int HashSet.size()>
	//*  20   38:icmpge          59
			acharsequence[i1] = ((CharSequence) (GigyaConst.getKeyForFeatureType(aobj[i1])));
	//   21   41:aload           4
	//   22   43:iload_1         
	//   23   44:aload           5
	//   24   46:iload_1         
	//   25   47:aaload          
	//   26   48:invokestatic    #1113 <Method String GigyaConst.getKeyForFeatureType(FeatureType)>
	//   27   51:aastore         

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
	//*  32   56:goto            33
		aobj = ((Object []) (new boolean[acharsequence.length]));
	//   33   59:aload           4
	//   34   61:arraylength     
	//   35   62:newarray        boolean[]
	//   36   64:astore          5
		HashSet hashset1 = new HashSet();
	//   37   66:new             #751 <Class HashSet>
	//   38   69:dup             
	//   39   70:invokespecial   #1114 <Method void HashSet()>
	//   40   73:astore          6
		AccountService accountservice = Assembler.getInstance().getAccountService();
	//   41   75:invokestatic    #147 <Method Assembler Assembler.getInstance()>
	//   42   78:invokevirtual   #557 <Method AccountService Assembler.getAccountService()>
	//   43   81:astore          7
		Iterator iterator = hashset.iterator();
	//   44   83:aload_3         
	//   45   84:invokevirtual   #1115 <Method Iterator HashSet.iterator()>
	//   46   87:astore          8
		for(int j1 = ((int) (flag)); iterator.hasNext(); j1++)
	//*  47   89:iload_2         
	//*  48   90:istore_1        
	//*  49   91:aload           8
	//*  50   93:invokeinterface #356 <Method boolean Iterator.hasNext()>
	//*  51   98:ifeq            143
		{
			FeatureType featuretype = (FeatureType)iterator.next();
	//   52  101:aload           8
	//   53  103:invokeinterface #360 <Method Object Iterator.next()>
	//   54  108:checkcast       #1099 <Class FeatureType>
	//   55  111:astore          9
			if(accountservice.isFeatureEnabled(featuretype))
	//*  56  113:aload           7
	//*  57  115:aload           9
	//*  58  117:invokevirtual   #1119 <Method boolean AccountService.isFeatureEnabled(FeatureType)>
	//*  59  120:ifeq            136
			{
				aobj[j1] = true;
	//   60  123:aload           5
	//   61  125:iload_1         
	//   62  126:iconst_1        
	//   63  127:bastore         
				hashset1.add(((Object) (featuretype)));
	//   64  128:aload           6
	//   65  130:aload           9
	//   66  132:invokevirtual   #1120 <Method boolean HashSet.add(Object)>
	//   67  135:pop             
			}
		}

	//   68  136:iload_1         
	//   69  137:iconst_1        
	//   70  138:iadd            
	//   71  139:istore_1        
	//*  72  140:goto            91
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle("Enable / Disable Feature Switches").setMultiChoiceItems(acharsequence, ((boolean []) (aobj)), new android.content.DialogInterface.OnMultiChoiceClickListener(acharsequence, hashset, hashset1) {

			public void onClick(DialogInterface dialoginterface, int k1, boolean flag1)
			{
				dialoginterface = ((DialogInterface) (a[k1].toString()));
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field CharSequence[] a>
			//    2    4:iload_2         
			//    3    5:aaload          
			//    4    6:invokeinterface #39  <Method String CharSequence.toString()>
			//    5   11:astore_1        
				Iterator iterator1 = b.iterator();
			//    6   12:aload_0         
			//    7   13:getfield        #26  <Field HashSet b>
			//    8   16:invokevirtual   #45  <Method Iterator HashSet.iterator()>
			//    9   19:astore          4
				do
				{
					if(!iterator1.hasNext())
						break;
			//   10   21:aload           4
			//   11   23:invokeinterface #51  <Method boolean Iterator.hasNext()>
			//   12   28:ifeq            85
					FeatureType featuretype1 = (FeatureType)iterator1.next();
			//   13   31:aload           4
			//   14   33:invokeinterface #55  <Method Object Iterator.next()>
			//   15   38:checkcast       #57  <Class FeatureType>
			//   16   41:astore          5
					if(GigyaConst.getKeyForFeatureType(featuretype1).equals(((Object) (dialoginterface))))
			//*  17   43:aload           5
			//*  18   45:invokestatic    #63  <Method String GigyaConst.getKeyForFeatureType(FeatureType)>
			//*  19   48:aload_1         
			//*  20   49:invokevirtual   #69  <Method boolean String.equals(Object)>
			//*  21   52:ifeq            21
						if(flag1)
			//*  22   55:iload_3         
			//*  23   56:ifeq            72
							c.add(((Object) (featuretype1)));
			//   24   59:aload_0         
			//   25   60:getfield        #28  <Field HashSet c>
			//   26   63:aload           5
			//   27   65:invokevirtual   #72  <Method boolean HashSet.add(Object)>
			//   28   68:pop             
						else
			//*  29   69:goto            21
							c.remove(((Object) (featuretype1)));
			//   30   72:aload_0         
			//   31   73:getfield        #28  <Field HashSet c>
			//   32   76:aload           5
			//   33   78:invokevirtual   #75  <Method boolean HashSet.remove(Object)>
			//   34   81:pop             
				} while(true);
			//   35   82:goto            21
			//   36   85:return          
			}

			final CharSequence a[];
			final HashSet b;
			final HashSet c;
			final DeveloperActivity d;

			
			{
				d = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DeveloperActivity d>
				a = acharsequence;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field CharSequence[] a>
				b = hashset;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field HashSet b>
				c = hashset1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field HashSet c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
		}
).setPositiveButton("Enable", new android.content.DialogInterface.OnClickListener(hashset, accountservice, hashset1) {

			public void onClick(DialogInterface dialoginterface, int k1)
			{
				FeatureType featuretype1;
				for(dialoginterface = ((DialogInterface) (a.iterator())); ((Iterator) (dialoginterface)).hasNext(); b.updateFeatureStatus(featuretype1, c.contains(((Object) (featuretype1)))))
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field HashSet a>
			//*   2    4:invokevirtual   #39  <Method Iterator HashSet.iterator()>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:invokeinterface #45  <Method boolean Iterator.hasNext()>
			//*   6   14:ifeq            46
					featuretype1 = (FeatureType)((Iterator) (dialoginterface)).next();
			//    7   17:aload_1         
			//    8   18:invokeinterface #49  <Method Object Iterator.next()>
			//    9   23:checkcast       #51  <Class FeatureType>
			//   10   26:astore_3        

			//   11   27:aload_0         
			//   12   28:getfield        #26  <Field AccountService b>
			//   13   31:aload_3         
			//   14   32:aload_0         
			//   15   33:getfield        #28  <Field HashSet c>
			//   16   36:aload_3         
			//   17   37:invokevirtual   #55  <Method boolean HashSet.contains(Object)>
			//   18   40:invokevirtual   #61  <Method void AccountService.updateFeatureStatus(FeatureType, boolean)>
			//*  19   43:goto            8
			//   20   46:return          
			}

			final HashSet a;
			final AccountService b;
			final HashSet c;
			final DeveloperActivity d;

			
			{
				d = DeveloperActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DeveloperActivity d>
				a = hashset;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field HashSet a>
				b = accountservice;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field AccountService b>
				c = hashset1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field HashSet c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
		}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   73  143:new             #102 <Class android.app.AlertDialog$Builder>
	//   74  146:dup             
	//   75  147:aload_0         
	//   76  148:invokespecial   #105 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   77  151:ldc2            #1122 <String "Enable / Disable Feature Switches">
	//   78  154:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   79  157:aload           4
	//   80  159:aload           5
	//   81  161:new             #12  <Class DeveloperActivity$10>
	//   82  164:dup             
	//   83  165:aload_0         
	//   84  166:aload           4
	//   85  168:aload_3         
	//   86  169:aload           6
	//   87  171:invokespecial   #1125 <Method void DeveloperActivity$10(DeveloperActivity, CharSequence[], HashSet, HashSet)>
	//   88  174:invokevirtual   #1129 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMultiChoiceItems(CharSequence[], boolean[], android.content.DialogInterface$OnMultiChoiceClickListener)>
	//   89  177:ldc2            #1131 <String "Enable">
	//   90  180:new             #34  <Class DeveloperActivity$9>
	//   91  183:dup             
	//   92  184:aload_0         
	//   93  185:aload_3         
	//   94  186:aload           7
	//   95  188:aload           6
	//   96  190:invokespecial   #1134 <Method void DeveloperActivity$9(DeveloperActivity, HashSet, AccountService, HashSet)>
	//   97  193:invokevirtual   #400 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   98  196:ldc1            #117 <Int 0x7f0f017d>
	//   99  198:aconst_null     
	//  100  199:invokevirtual   #121 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//  101  202:invokevirtual   #125 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//  102  205:pop             
	//  103  206:return          
	}

	CustomButton A;
	CustomButton B;
	CustomButton C;
	CustomButton D;
	Spinner E;
	Spinner F;
	IRobotApplication G;
	k H;
	AssetSoftwareUpdateUtils I;
	boolean J;
	private TextView K;
	private int L;
	private AssetInfo M;
	private com.irobot.home.i.a N;
	private int O;
	private SettingsSubsystem P;
	SwitchCompat a;
	SwitchCompat b;
	SwitchCompat c;
	SwitchCompat d;
	SwitchCompat e;
	SwitchCompat f;
	SwitchCompat g;
	SwitchCompat h;
	SwitchCompat i;
	SwitchCompat j;
	SwitchCompat k;
	CustomTextView l;
	CustomTextView m;
	CustomTextView n;
	EditText o;
	CustomButton t;
	CustomButton u;
	CustomButton v;
	CustomButton w;
	CustomButton x;
	CustomButton y;
	CustomButton z;
}
