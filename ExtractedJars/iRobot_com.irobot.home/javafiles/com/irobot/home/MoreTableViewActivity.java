// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import com.irobot.core.ABTestHandler;
import com.irobot.core.ABTestIdentifier;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ApplicationUIService;
import com.irobot.core.ApplicationUIServiceData;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.CommandType;
import com.irobot.core.MissionSubsystem;
import com.irobot.core.OTAUIServiceData;
import com.irobot.core.OTAUIServiceDataCallback;
import com.irobot.core.OTAUIServiceDataState;
import com.irobot.core.PlatformManager;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.SettingsUIServiceDataCallback;
import com.irobot.core.SoftwareUpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.core.ViewId;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, SanMarinoCareMaintenanceActivity_, PartsDetailListActivity_, RobotCleaningPreferencesActivity_, 
//			RoombaHelpTableViewActivity_, RobotSettingsActivity_

public class MoreTableViewActivity extends BaseFragmentActivity
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
			Iterator iterator = otauiservicedata.getDataStates().iterator();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #27  <Method ArrayList OTAUIServiceData.getDataStates()>
		//    5    9:invokevirtual   #33  <Method Iterator ArrayList.iterator()>
		//    6   12:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
		//    7   13:aload_3         
		//    8   14:invokeinterface #39  <Method boolean Iterator.hasNext()>
		//    9   19:ifeq            99
				OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)iterator.next();
		//   10   22:aload_3         
		//   11   23:invokeinterface #43  <Method Object Iterator.next()>
		//   12   28:checkcast       #45  <Class OTAUIServiceDataState>
		//   13   31:astore          4
				static class _cls1
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

				switch(com.irobot.home._cls1.a[otauiservicedatastate.ordinal()])
		//*  14   33:getstatic       #50  <Field int[] com.irobot.home.MoreTableViewActivity$1.a>
		//*  15   36:aload           4
		//*  16   38:invokevirtual   #54  <Method int OTAUIServiceDataState.ordinal()>
		//*  17   41:iaload          
				{
		//*  18   42:tableswitch     1 2: default 64
		//		               1 13
		//		               2 67
		//*  19   64:goto            13
				case 2: // '\002'
					MoreTableViewActivity moretableviewactivity = a;
		//   20   67:aload_0         
		//   21   68:getfield        #12  <Field MoreTableViewActivity a>
		//   22   71:astore          4
					boolean flag;
					if(otauiservicedata.getSoftwareUpdateStatus() == SoftwareUpdateStatus.AvailableAndReady)
		//*  23   73:aload_1         
		//*  24   74:invokevirtual   #58  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
		//*  25   77:getstatic       #64  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
		//*  26   80:if_acmpne       88
						flag = true;
		//   27   83:iconst_1        
		//   28   84:istore_2        
					else
		//*  29   85:goto            90
						flag = false;
		//   30   88:iconst_0        
		//   31   89:istore_2        
					moretableviewactivity.a(flag);
		//   32   90:aload           4
		//   33   92:iload_2         
		//   34   93:invokevirtual   #67  <Method void com.irobot.home.MoreTableViewActivity.a(boolean)>
					break;
				}
			} while(true);
		//*  35   96:goto            13
		//   36   99:return          
		}

		final MoreTableViewActivity a;

		private a()
		{
			a = MoreTableViewActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MoreTableViewActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
		//    5    9:return          
		}

	}

	private class b extends SettingsUIServiceDataCallback
	{

		public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
		{
			if(settingsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.d(MoreTableViewActivity.l(), "Received null data.");
		//    2    4:invokestatic    #26  <Method String MoreTableViewActivity.l()>
		//    3    7:ldc1            #28  <String "Received null data.">
		//    4    9:invokestatic    #34  <Method void o.d(String, String)>
				return;
		//    5   12:return          
			}
			settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #40  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
		//    8   17:astore_1        
			MoreTableViewActivity moretableviewactivity = a;
		//    9   18:aload_0         
		//   10   19:getfield        #13  <Field MoreTableViewActivity a>
		//   11   22:astore_3        
			boolean flag;
			if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPreferenceAvailable))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotPadWetness))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotRankOverlap))))
		//*  12   23:aload_1         
		//*  13   24:getstatic       #46  <Field SettingType SettingType.CleaningPreferenceAvailable>
		//*  14   27:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
		//*  15   30:ifne            71
		//*  16   33:aload_1         
		//*  17   34:getstatic       #55  <Field SettingType SettingType.CleaningPresets>
		//*  18   37:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
		//*  19   40:ifne            71
		//*  20   43:aload_1         
		//*  21   44:getstatic       #58  <Field SettingType SettingType.RobotPadWetness>
		//*  22   47:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
		//*  23   50:ifne            71
		//*  24   53:aload_1         
		//*  25   54:getstatic       #61  <Field SettingType SettingType.RobotRankOverlap>
		//*  26   57:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
		//*  27   60:ifeq            66
		//*  28   63:goto            71
				flag = false;
		//   29   66:iconst_0        
		//   30   67:istore_2        
			else
		//*  31   68:goto            73
				flag = true;
		//   32   71:iconst_1        
		//   33   72:istore_2        
			com.irobot.home.MoreTableViewActivity.a(moretableviewactivity, flag);
		//   34   73:aload_3         
		//   35   74:iload_2         
		//   36   75:invokestatic    #64  <Method boolean com.irobot.home.MoreTableViewActivity.a(MoreTableViewActivity, boolean)>
		//   37   78:pop             
			com.irobot.home.MoreTableViewActivity.a(a);
		//   38   79:aload_0         
		//   39   80:getfield        #13  <Field MoreTableViewActivity a>
		//   40   83:invokestatic    #66  <Method void com.irobot.home.MoreTableViewActivity.a(MoreTableViewActivity)>
			MoreTableViewActivity.b(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))));
		//   41   86:aload_0         
		//   42   87:getfield        #13  <Field MoreTableViewActivity a>
		//   43   90:aload_1         
		//   44   91:getstatic       #55  <Field SettingType SettingType.CleaningPresets>
		//   45   94:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
		//   46   97:invokestatic    #68  <Method boolean MoreTableViewActivity.b(MoreTableViewActivity, boolean)>
		//   47  100:pop             
		//   48  101:return          
		}

		final MoreTableViewActivity a;

		private b()
		{
			a = MoreTableViewActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field MoreTableViewActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public MoreTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void BaseFragmentActivity()>
		i = ((SettingsUIServiceDataCallback) (new b(((_cls1) (null)))));
	//    2    4:aload_0         
	//    3    5:new             #11  <Class MoreTableViewActivity$b>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #44  <Method void MoreTableViewActivity$b(MoreTableViewActivity, MoreTableViewActivity$1)>
	//    8   14:putfield        #46  <Field SettingsUIServiceDataCallback i>
		n = new a(((_cls1) (null)));
	//    9   17:aload_0         
	//   10   18:new             #8   <Class MoreTableViewActivity$a>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:invokespecial   #47  <Method void MoreTableViewActivity$a(MoreTableViewActivity, MoreTableViewActivity$1)>
	//   15   27:putfield        #49  <Field MoreTableViewActivity$a n>
	//   16   30:return          
	}

	static void a(MoreTableViewActivity moretableviewactivity)
	{
		moretableviewactivity.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void n()>
	//    2    4:return          
	}

	private void a(Robot robot)
	{
		k = robot.i();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method String Robot.i()>
	//    3    5:putfield        #60  <Field String k>
		b.setText(((CharSequence) (getString(0x7f0f0447, new Object[] {
			k
		}))));
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field CustomButton b>
	//    6   12:aload_0         
	//    7   13:ldc1            #63  <Int 0x7f0f0447>
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:aload_0         
	//   13   22:getfield        #60  <Field String k>
	//   14   25:aastore         
	//   15   26:invokevirtual   #69  <Method String getString(int, Object[])>
	//   16   29:invokevirtual   #75  <Method void CustomButton.setText(CharSequence)>
		e.setText(((CharSequence) (getString(0x7f0f0447, new Object[] {
			k
		}))));
	//   17   32:aload_0         
	//   18   33:getfield        #77  <Field CustomButton e>
	//   19   36:aload_0         
	//   20   37:ldc1            #63  <Int 0x7f0f0447>
	//   21   39:iconst_1        
	//   22   40:anewarray       Object[]
	//   23   43:dup             
	//   24   44:iconst_0        
	//   25   45:aload_0         
	//   26   46:getfield        #60  <Field String k>
	//   27   49:aastore         
	//   28   50:invokevirtual   #69  <Method String getString(int, Object[])>
	//   29   53:invokevirtual   #75  <Method void CustomButton.setText(CharSequence)>
	//   30   56:return          
	}

	static boolean a(MoreTableViewActivity moretableviewactivity, boolean flag)
	{
		moretableviewactivity.m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean m>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean b(MoreTableViewActivity moretableviewactivity, boolean flag)
	{
		moretableviewactivity.l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field boolean l>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String l()
	{
		return j;
	//    0    0:getstatic       #84  <Field String j>
	//    1    3:areturn         
	}

	private void m()
	{
		Object obj;
		android.app.AlertDialog.Builder builder;
		obj = ((Object) (com.irobot.home.util.j.o(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String a>
	//    2    4:invokestatic    #92  <Method Robot j.o(String)>
	//    3    7:astore_1        
		builder = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null)));
	//    4    8:new             #94  <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #97  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    8   16:ldc1            #98  <Int 0x7f0f05bb>
	//    9   18:aconst_null     
	//   10   19:invokevirtual   #102 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   22:astore_3        
		if(Assembler.getInstance().getNetworkUIService(((Robot) (obj)).s()).getServiceData().isConnectedLocally()) goto _L2; else goto _L1
	//   12   23:invokestatic    #108 <Method Assembler Assembler.getInstance()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #112 <Method AssetId Robot.s()>
	//   15   30:invokevirtual   #116 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   16   33:invokevirtual   #122 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   17   36:invokevirtual   #128 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//   18   39:ifne            99
_L1:
		Object aobj[];
		builder.setTitle(((CharSequence) (getString(0x7f0f0535, new Object[] {
			k
		}))));
	//   19   42:aload_3         
	//   20   43:aload_0         
	//   21   44:ldc1            #129 <Int 0x7f0f0535>
	//   22   46:iconst_1        
	//   23   47:anewarray       Object[]
	//   24   50:dup             
	//   25   51:iconst_0        
	//   26   52:aload_0         
	//   27   53:getfield        #60  <Field String k>
	//   28   56:aastore         
	//   29   57:invokevirtual   #69  <Method String getString(int, Object[])>
	//   30   60:invokevirtual   #133 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   31   63:pop             
		obj = ((Object) (getString(0x7f0f0446)));
	//   32   64:aload_0         
	//   33   65:ldc1            #134 <Int 0x7f0f0446>
	//   34   67:invokevirtual   #137 <Method String getString(int)>
	//   35   70:astore_1        
		aobj = new Object[1];
	//   36   71:iconst_1        
	//   37   72:anewarray       Object[]
	//   38   75:astore_2        
		aobj[0] = ((Object) (k));
	//   39   76:aload_2         
	//   40   77:iconst_0        
	//   41   78:aload_0         
	//   42   79:getfield        #60  <Field String k>
	//   43   82:aastore         
_L4:
		builder.setMessage(((CharSequence) (String.format(((String) (obj)), aobj)))).show();
	//   44   83:aload_3         
	//   45   84:aload_1         
	//   46   85:aload_2         
	//   47   86:invokestatic    #143 <Method String String.format(String, Object[])>
	//   48   89:invokevirtual   #146 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   49   92:invokevirtual   #150 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   50   95:pop             
		break MISSING_BLOCK_LABEL_180;
	//   51   96:goto            180
_L2:
		if(((Robot) (obj)).f())
	//*  52   99:aload_1         
	//*  53  100:invokevirtual   #152 <Method boolean Robot.f()>
	//*  54  103:ifeq            128
		{
			obj = ((Object) (getString(0x7f0f0445)));
	//   55  106:aload_0         
	//   56  107:ldc1            #153 <Int 0x7f0f0445>
	//   57  109:invokevirtual   #137 <Method String getString(int)>
	//   58  112:astore_1        
			aobj = new Object[1];
	//   59  113:iconst_1        
	//   60  114:anewarray       Object[]
	//   61  117:astore_2        
			aobj[0] = ((Object) (k));
	//   62  118:aload_2         
	//   63  119:iconst_0        
	//   64  120:aload_0         
	//   65  121:getfield        #60  <Field String k>
	//   66  124:aastore         
			continue; /* Loop/switch isn't completed */
	//   67  125:goto            83
		}
		if(!((Robot) (obj)).g() || ((Robot) (obj)).u())
			break; /* Loop/switch isn't completed */
	//   68  128:aload_1         
	//   69  129:invokevirtual   #155 <Method boolean Robot.g()>
	//   70  132:ifeq            164
	//   71  135:aload_1         
	//   72  136:invokevirtual   #158 <Method boolean Robot.u()>
	//   73  139:ifne            164
		obj = ((Object) (getString(0x7f0f0442)));
	//   74  142:aload_0         
	//   75  143:ldc1            #159 <Int 0x7f0f0442>
	//   76  145:invokevirtual   #137 <Method String getString(int)>
	//   77  148:astore_1        
		aobj = new Object[1];
	//   78  149:iconst_1        
	//   79  150:anewarray       Object[]
	//   80  153:astore_2        
		aobj[0] = ((Object) (k));
	//   81  154:aload_2         
	//   82  155:iconst_0        
	//   83  156:aload_0         
	//   84  157:getfield        #60  <Field String k>
	//   85  160:aastore         
		if(true) goto _L4; else goto _L3
	//   86  161:goto            83
_L3:
		Assembler.getInstance().getMissionSubsystem(((Robot) (obj)).s()).sendCommand(CommandType.FIND);
	//   87  164:invokestatic    #108 <Method Assembler Assembler.getInstance()>
	//   88  167:aload_1         
	//   89  168:invokevirtual   #112 <Method AssetId Robot.s()>
	//   90  171:invokevirtual   #163 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   91  174:getstatic       #169 <Field CommandType CommandType.FIND>
	//   92  177:invokevirtual   #175 <Method void MissionSubsystem.sendCommand(CommandType)>
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//   93  180:aload_0         
	//   94  181:getfield        #86  <Field String a>
	//   95  184:invokestatic    #178 <Method a j.a(String)>
	//   96  187:invokevirtual   #183 <Method AssetInfo a.a()>
	//   97  190:astore_1        
		AnalyticsSubsystem.getInstance().trackLocateRoombaButtonPressed(assetinfo);
	//   98  191:invokestatic    #188 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   99  194:aload_1         
	//  100  195:invokevirtual   #192 <Method void AnalyticsSubsystem.trackLocateRoombaButtonPressed(AssetInfo)>
		return;
	//  101  198:return          
	}

	private void n()
	{
		boolean flag1 = com.irobot.home.util.a.a();
	//    0    0:invokestatic    #196 <Method boolean com.irobot.home.util.a.a()>
	//    1    3:istore_3        
		View view = c;
	//    2    4:aload_0         
	//    3    5:getfield        #198 <Field View c>
	//    4    8:astore          4
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		byte byte0;
		if(flag1)
	//*   7   12:iload_3         
	//*   8   13:ifeq            22
			byte0 = 8;
	//    9   16:bipush          8
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			byte0 = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		view.setVisibility(((int) (byte0)));
	//   14   24:aload           4
	//   15   26:iload_1         
	//   16   27:invokevirtual   #204 <Method void View.setVisibility(int)>
		view = d;
	//   17   30:aload_0         
	//   18   31:getfield        #206 <Field View d>
	//   19   34:astore          4
		if(m && flag1)
	//*  20   36:aload_0         
	//*  21   37:getfield        #80  <Field boolean m>
	//*  22   40:ifeq            52
	//*  23   43:iload_3         
	//*  24   44:ifeq            52
			byte0 = ((byte) (flag));
	//   25   47:iload_2         
	//   26   48:istore_1        
		else
	//*  27   49:goto            55
			byte0 = 8;
	//   28   52:bipush          8
	//   29   54:istore_1        
		view.setVisibility(((int) (byte0)));
	//   30   55:aload           4
	//   31   57:iload_1         
	//   32   58:invokevirtual   #204 <Method void View.setVisibility(int)>
	//   33   61:return          
	}

	protected void a(boolean flag)
	{
		View view = f.findViewById(0x7f090470);
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field RelativeLayout f>
	//    2    4:ldc1            #210 <Int 0x7f090470>
	//    3    6:invokevirtual   #216 <Method View RelativeLayout.findViewById(int)>
	//    4    9:astore          4
		byte byte1 = 8;
	//    5   11:bipush          8
	//    6   13:istore_3        
		byte byte0;
		if(flag)
	//*   7   14:iload_1         
	//*   8   15:ifeq            23
			byte0 = 0;
	//    9   18:iconst_0        
	//   10   19:istore_2        
		else
	//*  11   20:goto            26
			byte0 = 8;
	//   12   23:bipush          8
	//   13   25:istore_2        
		view.setVisibility(((int) (byte0)));
	//   14   26:aload           4
	//   15   28:iload_2         
	//   16   29:invokevirtual   #204 <Method void View.setVisibility(int)>
		view = f.findViewById(0x7f090054);
	//   17   32:aload_0         
	//   18   33:getfield        #209 <Field RelativeLayout f>
	//   19   36:ldc1            #217 <Int 0x7f090054>
	//   20   38:invokevirtual   #216 <Method View RelativeLayout.findViewById(int)>
	//   21   41:astore          4
		if(flag)
	//*  22   43:iload_1         
	//*  23   44:ifeq            52
			byte0 = byte1;
	//   24   47:iload_3         
	//   25   48:istore_2        
		else
	//*  26   49:goto            54
			byte0 = 0;
	//   27   52:iconst_0        
	//   28   53:istore_2        
		view.setVisibility(((int) (byte0)));
	//   29   54:aload           4
	//   30   56:iload_2         
	//   31   57:invokevirtual   #204 <Method void View.setVisibility(int)>
	//   32   60:return          
	}

	void e()
	{
		b(0x7f0f08cb);
	//    0    0:aload_0         
	//    1    1:ldc1            #218 <Int 0x7f0f08cb>
	//    2    3:invokevirtual   #220 <Method void b(int)>
		a(com.irobot.home.util.j.o(a));
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #86  <Field String a>
	//    6   11:invokestatic    #92  <Method Robot j.o(String)>
	//    7   14:invokespecial   #222 <Method void a(Robot)>
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    8   17:aload_0         
	//    9   18:getfield        #86  <Field String a>
	//   10   21:invokestatic    #178 <Method a j.a(String)>
	//   11   24:invokevirtual   #183 <Method AssetInfo a.a()>
	//   12   27:astore_1        
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.More, assetinfo);
	//   13   28:invokestatic    #188 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   14   31:getstatic       #228 <Field ViewId ViewId.More>
	//   15   34:aload_1         
	//   16   35:invokevirtual   #232 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		f.findViewById(0x7f090470).setVisibility(8);
	//   17   38:aload_0         
	//   18   39:getfield        #209 <Field RelativeLayout f>
	//   19   42:ldc1            #210 <Int 0x7f090470>
	//   20   44:invokevirtual   #216 <Method View RelativeLayout.findViewById(int)>
	//   21   47:bipush          8
	//   22   49:invokevirtual   #204 <Method void View.setVisibility(int)>
		if(Assembler.getInstance().getApplicationUIService().getServiceData().getPlatformManager().getABTestHandler().doesUserSatisfyABTest(ABTestIdentifier.LocateRoombaButtonPrimaryStyle))
	//*  23   52:invokestatic    #108 <Method Assembler Assembler.getInstance()>
	//*  24   55:invokevirtual   #236 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//*  25   58:invokevirtual   #241 <Method ApplicationUIServiceData ApplicationUIService.getServiceData()>
	//*  26   61:invokevirtual   #247 <Method PlatformManager ApplicationUIServiceData.getPlatformManager()>
	//*  27   64:invokevirtual   #253 <Method ABTestHandler PlatformManager.getABTestHandler()>
	//*  28   67:getstatic       #259 <Field ABTestIdentifier ABTestIdentifier.LocateRoombaButtonPrimaryStyle>
	//*  29   70:invokevirtual   #265 <Method boolean ABTestHandler.doesUserSatisfyABTest(ABTestIdentifier)>
	//*  30   73:ifeq            96
		{
			b.setVisibility(8);
	//   31   76:aload_0         
	//   32   77:getfield        #62  <Field CustomButton b>
	//   33   80:bipush          8
	//   34   82:invokevirtual   #266 <Method void CustomButton.setVisibility(int)>
			e.setVisibility(0);
	//   35   85:aload_0         
	//   36   86:getfield        #77  <Field CustomButton e>
	//   37   89:iconst_0        
	//   38   90:invokevirtual   #266 <Method void CustomButton.setVisibility(int)>
		} else
	//*  39   93:goto            113
		{
			b.setVisibility(0);
	//   40   96:aload_0         
	//   41   97:getfield        #62  <Field CustomButton b>
	//   42  100:iconst_0        
	//   43  101:invokevirtual   #266 <Method void CustomButton.setVisibility(int)>
			e.setVisibility(8);
	//   44  104:aload_0         
	//   45  105:getfield        #77  <Field CustomButton e>
	//   46  108:bipush          8
	//   47  110:invokevirtual   #266 <Method void CustomButton.setVisibility(int)>
		}
		g = Assembler.getInstance().getUpdateUIService(assetinfo.getAssetId());
	//   48  113:aload_0         
	//   49  114:invokestatic    #108 <Method Assembler Assembler.getInstance()>
	//   50  117:aload_1         
	//   51  118:invokevirtual   #271 <Method AssetId AssetInfo.getAssetId()>
	//   52  121:invokevirtual   #275 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   53  124:putfield        #277 <Field UpdateUIService g>
		h = Assembler.getInstance().getSettingsUIService(assetinfo.convertToPMI());
	//   54  127:aload_0         
	//   55  128:invokestatic    #108 <Method Assembler Assembler.getInstance()>
	//   56  131:aload_1         
	//   57  132:invokevirtual   #281 <Method com.irobot.core.PMIAssetInfo AssetInfo.convertToPMI()>
	//   58  135:invokevirtual   #285 <Method SettingsSubsystem Assembler.getSettingsUIService(com.irobot.core.PMIAssetInfo)>
	//   59  138:putfield        #287 <Field SettingsSubsystem h>
	//   60  141:return          
	}

	public void f()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String a>
	//    2    4:invokestatic    #178 <Method a j.a(String)>
	//    3    7:invokevirtual   #183 <Method AssetInfo a.a()>
	//    4   10:astore_2        
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(assetinfo) && AssetCapabilityUtils.isMoppingRobot(assetinfo))
	//*   5   11:aload_2         
	//*   6   12:invokestatic    #293 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   7   15:ifeq            30
	//*   8   18:aload_2         
	//*   9   19:invokestatic    #296 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  10   22:ifeq            30
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		else
	//*  13   27:goto            32
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            45
		{
			com.irobot.home.SanMarinoCareMaintenanceActivity_.a(((android.content.Context) (this))).a();
	//   18   36:aload_0         
	//   19   37:invokestatic    #301 <Method SanMarinoCareMaintenanceActivity_$a com.irobot.home.SanMarinoCareMaintenanceActivity_.a(android.content.Context)>
	//   20   40:invokevirtual   #306 <Method org.androidannotations.api.a.e com.irobot.home.SanMarinoCareMaintenanceActivity_$a.a()>
	//   21   43:pop             
			return;
	//   22   44:return          
		} else
		{
			com.irobot.home.PartsDetailListActivity_.a(((android.content.Context) (this))).a(a).a();
	//   23   45:aload_0         
	//   24   46:invokestatic    #311 <Method PartsDetailListActivity_$a com.irobot.home.PartsDetailListActivity_.a(android.content.Context)>
	//   25   49:aload_0         
	//   26   50:getfield        #86  <Field String a>
	//   27   53:invokevirtual   #316 <Method PartsDetailListActivity_$a com.irobot.home.PartsDetailListActivity_$a.a(String)>
	//   28   56:invokevirtual   #317 <Method org.androidannotations.api.a.e com.irobot.home.PartsDetailListActivity_$a.a()>
	//   29   59:pop             
			return;
	//   30   60:return          
		}
	}

	void g()
	{
		com.irobot.home.RobotCleaningPreferencesActivity_.a(((android.content.Context) (this))).a(com.irobot.home.util.j.a(a).b().getId()).a(l).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #322 <Method RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field String a>
	//    4    8:invokestatic    #178 <Method a j.a(String)>
	//    5   11:invokevirtual   #324 <Method AssetId a.b()>
	//    6   14:invokevirtual   #329 <Method String AssetId.getId()>
	//    7   17:invokevirtual   #334 <Method RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_$a.a(String)>
	//    8   20:aload_0         
	//    9   21:getfield        #82  <Field boolean l>
	//   10   24:invokevirtual   #337 <Method RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_$a.a(boolean)>
	//   11   27:invokevirtual   #338 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleaningPreferencesActivity_$a.a()>
	//   12   30:pop             
	//   13   31:return          
	}

	public void h()
	{
		com.irobot.home.RoombaHelpTableViewActivity_.a(((android.content.Context) (this))).a(a).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #343 <Method RoombaHelpTableViewActivity_$a com.irobot.home.RoombaHelpTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field String a>
	//    4    8:invokevirtual   #348 <Method RoombaHelpTableViewActivity_$a com.irobot.home.RoombaHelpTableViewActivity_$a.a(String)>
	//    5   11:invokevirtual   #349 <Method org.androidannotations.api.a.e com.irobot.home.RoombaHelpTableViewActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	public void i()
	{
		com.irobot.home.RobotSettingsActivity_.a(((android.content.Context) (this))).a(a).a(0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #354 <Method RobotSettingsActivity_$a com.irobot.home.RobotSettingsActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field String a>
	//    4    8:invokevirtual   #359 <Method RobotSettingsActivity_$a com.irobot.home.RobotSettingsActivity_$a.a(String)>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #362 <Method org.androidannotations.api.a.e com.irobot.home.RobotSettingsActivity_$a.a(int)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void j()
	{
		m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #367 <Method void m()>
	//    2    4:return          
	}

	public void k()
	{
		m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #367 <Method void m()>
	//    2    4:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            41
		{
			if(j1 == -1)
	//*   2    4:iload_2         
	//*   3    5:iconst_m1       
	//*   4    6:icmpne          14
			{
				finish();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #373 <Method void finish()>
				return;
	//    7   13:return          
			}
			intent = ((Intent) (com.irobot.home.util.j.o(a)));
	//    8   14:aload_0         
	//    9   15:getfield        #86  <Field String a>
	//   10   18:invokestatic    #92  <Method Robot j.o(String)>
	//   11   21:astore_3        
			if(!k.equals(((Object) (((Robot) (intent)).i()))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #60  <Field String k>
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #58  <Method String Robot.i()>
	//*  16   30:invokevirtual   #377 <Method boolean String.equals(Object)>
	//*  17   33:ifne            41
				a(((Robot) (intent)));
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:invokespecial   #222 <Method void a(Robot)>
		}
	//   21   41:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #380 <Method void BaseFragmentActivity.onResume()>
		n();
	//    2    4:aload_0         
	//    3    5:invokespecial   #52  <Method void n()>
	//    4    8:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #383 <Method void BaseFragmentActivity.onStart()>
		g.registerUISubscriber(((OTAUIServiceDataCallback) (n)));
	//    2    4:aload_0         
	//    3    5:getfield        #277 <Field UpdateUIService g>
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field MoreTableViewActivity$a n>
	//    6   12:invokevirtual   #389 <Method boolean UpdateUIService.registerUISubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
		h.registerUISubscriber(i);
	//    8   16:aload_0         
	//    9   17:getfield        #287 <Field SettingsSubsystem h>
	//   10   20:aload_0         
	//   11   21:getfield        #46  <Field SettingsUIServiceDataCallback i>
	//   12   24:invokevirtual   #394 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//   13   27:pop             
	//   14   28:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #397 <Method void BaseFragmentActivity.onStop()>
		h.unregisterSubscriber(i);
	//    2    4:aload_0         
	//    3    5:getfield        #287 <Field SettingsSubsystem h>
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field SettingsUIServiceDataCallback i>
	//    6   12:invokevirtual   #400 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
		g.unregisterSubscriber(((OTAUIServiceDataCallback) (n)));
	//    8   16:aload_0         
	//    9   17:getfield        #277 <Field UpdateUIService g>
	//   10   20:aload_0         
	//   11   21:getfield        #49  <Field MoreTableViewActivity$a n>
	//   12   24:invokevirtual   #402 <Method boolean UpdateUIService.unregisterSubscriber(OTAUIServiceDataCallback)>
	//   13   27:pop             
	//   14   28:return          
	}

	private static final String j = "MoreTableViewActivity";
	String a;
	CustomButton b;
	View c;
	View d;
	CustomButton e;
	RelativeLayout f;
	UpdateUIService g;
	SettingsSubsystem h;
	SettingsUIServiceDataCallback i;
	private String k;
	private boolean l;
	private boolean m;
	private a n;

	static 
	{
	//    0    0:return          
	}
}
