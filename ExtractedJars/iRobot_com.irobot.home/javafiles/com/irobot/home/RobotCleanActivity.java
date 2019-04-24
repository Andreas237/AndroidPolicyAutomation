// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.c;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.irobot.core.AccountService;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetCommandTimeoutEvent;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.AssetNetworkUIServiceDataCallback;
import com.irobot.core.AssetNetworkUIServiceDataState;
import com.irobot.core.AssetNetworkUIServiceViewState;
import com.irobot.core.CurrentConnectionState;
import com.irobot.core.CurrentConnectionStateEvent;
import com.irobot.core.DataDeserializationErrorEvent;
import com.irobot.core.DuplicateAssetStatusChangedEvent;
import com.irobot.core.EventType;
import com.irobot.core.MissionDataState;
import com.irobot.core.MissionStatusAction;
import com.irobot.core.MissionSubsystem;
import com.irobot.core.MissionUIServiceCommand;
import com.irobot.core.MissionUIServiceData;
import com.irobot.core.MissionUIServiceDataCallback;
import com.irobot.core.NetworkDiagnosticEvent;
import com.irobot.core.NetworkDiagnosticRoutines;
import com.irobot.core.NetworkDiagnosticState;
import com.irobot.core.NetworkDiagnostics;
import com.irobot.core.NetworkManager;
import com.irobot.core.NetworkState;
import com.irobot.core.NetworkType;
import com.irobot.core.OnDemandOTAEntryType;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.core.OnDemandOTAStatus;
import com.irobot.core.PMIAssetEvent;
import com.irobot.core.PMIAssetEventHandler;
import com.irobot.core.PersistenceHandler;
import com.irobot.core.PushNotificationService;
import com.irobot.core.RobotBatteryLevelEvent;
import com.irobot.core.ServiceDiscovery;
import com.irobot.core.ServiceDiscoveryData;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.UpdateUIService;
import com.irobot.core.ViewId;
import com.irobot.home.fragments.ac;
import com.irobot.home.fragments.ad;
import com.irobot.home.fragments.ag;
import com.irobot.home.fragments.ah;
import com.irobot.home.fragments.bc;
import com.irobot.home.fragments.bd;
import com.irobot.home.fragments.be;
import com.irobot.home.fragments.bi;
import com.irobot.home.fragments.bj;
import com.irobot.home.fragments.bk;
import com.irobot.home.fragments.bl;
import com.irobot.home.h.i;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity, SelectRobotTypeActivity_, IRobotApplication, BraavaCleanActivity_, 
//			i, OnDemandOtaActivity_, BugFixedActivity_, DeveloperActivity_, 
//			VideoHelpActivity_, WebViewActivity_

public class RobotCleanActivity extends BaseCleanActivity
	implements com.irobot.home.fragments.ag.a, com.irobot.home.fragments.bc.a, com.irobot.home.fragments.bi.a, com.irobot.home.h.i.a
{
	private class CleanActivityAssetGenericEventHandler extends PMIAssetEventHandler
	{

		void a()
		{
		//    0    0:return          
		}

		void b()
		{
		//    0    0:return          
		}

		public void onPMIAssetEvent(PMIAssetEvent pmiassetevent)
		{
			if(pmiassetevent.id().equals("batPct") && pmiassetevent.assetId().equals(((Object) (j.k().getId()))))
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #30  <Method String PMIAssetEvent.id()>
		//*   2    4:ldc1            #32  <String "batPct">
		//*   3    6:invokevirtual   #38  <Method boolean String.equals(Object)>
		//*   4    9:ifeq            50
		//*   5   12:aload_1         
		//*   6   13:invokevirtual   #41  <Method String PMIAssetEvent.assetId()>
		//*   7   16:invokestatic    #47  <Method AssetId j.k()>
		//*   8   19:invokevirtual   #52  <Method String AssetId.getId()>
		//*   9   22:invokevirtual   #38  <Method boolean String.equals(Object)>
		//*  10   25:ifeq            50
			{
				com.irobot.home.RobotCleanActivity.a(a, ((int) (pmiassetevent.int16Value("batPct", (short)0))));
		//   11   28:aload_0         
		//   12   29:getfield        #13  <Field RobotCleanActivity a>
		//   13   32:aload_1         
		//   14   33:ldc1            #32  <String "batPct">
		//   15   35:iconst_0        
		//   16   36:invokevirtual   #56  <Method short PMIAssetEvent.int16Value(String, short)>
		//   17   39:invokestatic    #59  <Method int com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, int)>
		//   18   42:pop             
				com.irobot.home.RobotCleanActivity.b(a);
		//   19   43:aload_0         
		//   20   44:getfield        #13  <Field RobotCleanActivity a>
		//   21   47:invokestatic    #61  <Method void com.irobot.home.RobotCleanActivity.b(RobotCleanActivity)>
			}
		//   22   50:return          
		}

		final RobotCleanActivity a;

		private CleanActivityAssetGenericEventHandler()
		{
			a = RobotCleanActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field RobotCleanActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void PMIAssetEventHandler()>
		//    5    9:return          
		}

	}

	public class NewToAppReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			o.c("ModelChanges", intent.getAction());
		//    0    0:ldc1            #21  <String "ModelChanges">
		//    1    2:aload_2         
		//    2    3:invokevirtual   #27  <Method String Intent.getAction()>
		//    3    6:invokestatic    #33  <Method void o.c(String, String)>
			if("com.irobot.home.MODEL_CHANGED".equals(((Object) (intent.getAction()))))
		//*   4    9:ldc1            #35  <String "com.irobot.home.MODEL_CHANGED">
		//*   5   11:aload_2         
		//*   6   12:invokevirtual   #27  <Method String Intent.getAction()>
		//*   7   15:invokevirtual   #41  <Method boolean String.equals(Object)>
		//*   8   18:ifeq            28
				a.K();
		//    9   21:aload_0         
		//   10   22:getfield        #13  <Field RobotCleanActivity a>
		//   11   25:invokevirtual   #44  <Method void RobotCleanActivity.K()>
		//   12   28:return          
		}

		final RobotCleanActivity a;

		public NewToAppReceiver()
		{
			a = RobotCleanActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field RobotCleanActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}

	protected class a extends MissionUIServiceDataCallback
		implements com.irobot.home.fragments.i.a
	{

		public void a()
		{
			com.irobot.home.RobotCleanActivity.a(a, MissionStatusAction.Custom);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field RobotCleanActivity a>
		//    2    4:getstatic       #24  <Field MissionStatusAction MissionStatusAction.Custom>
		//    3    7:invokestatic    #27  <Method void com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, MissionStatusAction)>
		//    4   10:return          
		}

		public void a(MissionStatusAction missionstatusaction)
		{
			com.irobot.home.RobotCleanActivity.a(a, missionstatusaction);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field RobotCleanActivity a>
		//    2    4:aload_1         
		//    3    5:invokestatic    #27  <Method void com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, MissionStatusAction)>
		//    4    8:return          
		}

		public void onMissionUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
		{
			if(missionuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.e(RobotCleanActivity.N(), "null service data");
		//    2    4:invokestatic    #34  <Method String RobotCleanActivity.N()>
		//    3    7:ldc1            #36  <String "null service data">
		//    4    9:invokestatic    #42  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			if(!a.isFinishing())
		//*   6   13:aload_0         
		//*   7   14:getfield        #14  <Field RobotCleanActivity a>
		//*   8   17:invokevirtual   #46  <Method boolean RobotCleanActivity.isFinishing()>
		//*   9   20:ifne            551
			{
				if(a.isDestroyed())
		//*  10   23:aload_0         
		//*  11   24:getfield        #14  <Field RobotCleanActivity a>
		//*  12   27:invokevirtual   #49  <Method boolean RobotCleanActivity.isDestroyed()>
		//*  13   30:ifeq            34
					return;
		//   14   33:return          
				Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
		//   15   34:aload_1         
		//   16   35:invokevirtual   #55  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
		//   17   38:astore          5
				String s = RobotCleanActivity.N();
		//   18   40:invokestatic    #34  <Method String RobotCleanActivity.N()>
		//   19   43:astore          6
				StringBuilder stringbuilder = new StringBuilder();
		//   20   45:new             #57  <Class StringBuilder>
		//   21   48:dup             
		//   22   49:invokespecial   #58  <Method void StringBuilder()>
		//   23   52:astore          7
				stringbuilder.append("Change list: ");
		//   24   54:aload           7
		//   25   56:ldc1            #60  <String "Change list: ">
		//   26   58:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   27   61:pop             
				stringbuilder.append(((ArrayList) (obj)).toString());
		//   28   62:aload           7
		//   29   64:aload           5
		//   30   66:invokevirtual   #69  <Method String ArrayList.toString()>
		//   31   69:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   32   72:pop             
				o.b(s, stringbuilder.toString());
		//   33   73:aload           6
		//   34   75:aload           7
		//   35   77:invokevirtual   #70  <Method String StringBuilder.toString()>
		//   36   80:invokestatic    #73  <Method void o.b(String, String)>
				obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   37   83:aload           5
		//   38   85:invokevirtual   #77  <Method Iterator ArrayList.iterator()>
		//   39   88:astore          5
				boolean flag = false;
		//   40   90:iconst_0        
		//   41   91:istore_2        
				boolean flag1 = false;
		//   42   92:iconst_0        
		//   43   93:istore_3        
				do
				{
					if(((Iterator) (obj)).hasNext())
		//*  44   94:aload           5
		//*  45   96:invokeinterface #82  <Method boolean Iterator.hasNext()>
		//*  46  101:ifeq            539
					{
						MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
		//   47  104:aload           5
		//   48  106:invokeinterface #86  <Method Object Iterator.next()>
		//   49  111:checkcast       #88  <Class MissionDataState>
		//   50  114:astore          6
						static class _cls4
						{

							static final int a[];
							static final int b[];
							static final int c[];
							static final int d[];
							static final int e[];

							static 
							{
								e = new int[AssetNetworkUIServiceViewState.values().length];
							//    0    0:invokestatic    #22  <Method AssetNetworkUIServiceViewState[] AssetNetworkUIServiceViewState.values()>
							//    1    3:arraylength     
							//    2    4:newarray        int[]
							//    3    6:putstatic       #24  <Field int[] e>
								try
								{
									e[AssetNetworkUIServiceViewState.CurrentConnectionState.ordinal()] = 1;
							//    4    9:getstatic       #24  <Field int[] e>
							//    5   12:getstatic       #28  <Field AssetNetworkUIServiceViewState AssetNetworkUIServiceViewState.CurrentConnectionState>
							//    6   15:invokevirtual   #32  <Method int AssetNetworkUIServiceViewState.ordinal()>
							//    7   18:iconst_1        
							//    8   19:iastore         
								}
							//*   9   20:invokestatic    #37  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
							//*  10   23:arraylength     
							//*  11   24:newarray        int[]
							//*  12   26:putstatic       #39  <Field int[] d>
							//*  13   29:getstatic       #39  <Field int[] d>
							//*  14   32:getstatic       #43  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.LocalConnectionState>
							//*  15   35:invokevirtual   #44  <Method int AssetNetworkUIServiceDataState.ordinal()>
							//*  16   38:iconst_1        
							//*  17   39:iastore         
							//*  18   40:getstatic       #39  <Field int[] d>
							//*  19   43:getstatic       #47  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.RemoteConnectionState>
							//*  20   46:invokevirtual   #44  <Method int AssetNetworkUIServiceDataState.ordinal()>
							//*  21   49:iconst_2        
							//*  22   50:iastore         
							//*  23   51:invokestatic    #52  <Method OnDemandOTAStatus[] OnDemandOTAStatus.values()>
							//*  24   54:arraylength     
							//*  25   55:newarray        int[]
							//*  26   57:putstatic       #54  <Field int[] c>
							//*  27   60:getstatic       #54  <Field int[] c>
							//*  28   63:getstatic       #58  <Field OnDemandOTAStatus OnDemandOTAStatus.ProcessError>
							//*  29   66:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
							//*  30   69:iconst_1        
							//*  31   70:iastore         
							//*  32   71:getstatic       #54  <Field int[] c>
							//*  33   74:getstatic       #62  <Field OnDemandOTAStatus OnDemandOTAStatus.InProgress>
							//*  34   77:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
							//*  35   80:iconst_2        
							//*  36   81:iastore         
							//*  37   82:getstatic       #54  <Field int[] c>
							//*  38   85:getstatic       #65  <Field OnDemandOTAStatus OnDemandOTAStatus.Success>
							//*  39   88:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
							//*  40   91:iconst_3        
							//*  41   92:iastore         
							//*  42   93:getstatic       #54  <Field int[] c>
							//*  43   96:getstatic       #68  <Field OnDemandOTAStatus OnDemandOTAStatus.NotUserInitiated>
							//*  44   99:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
							//*  45  102:iconst_4        
							//*  46  103:iastore         
							//*  47  104:getstatic       #54  <Field int[] c>
							//*  48  107:getstatic       #71  <Field OnDemandOTAStatus OnDemandOTAStatus.VersionCheckFailure>
							//*  49  110:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
							//*  50  113:iconst_5        
							//*  51  114:iastore         
							//*  52  115:getstatic       #54  <Field int[] c>
							//*  53  118:getstatic       #74  <Field OnDemandOTAStatus OnDemandOTAStatus.DeploymentStatusCheckTimedOut>
							//*  54  121:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
							//*  55  124:bipush          6
							//*  56  126:iastore         
							//*  57  127:invokestatic    #79  <Method NetworkDiagnosticRoutines[] NetworkDiagnosticRoutines.values()>
							//*  58  130:arraylength     
							//*  59  131:newarray        int[]
							//*  60  133:putstatic       #81  <Field int[] b>
							//*  61  136:getstatic       #81  <Field int[] b>
							//*  62  139:getstatic       #85  <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.InternetConnectivity>
							//*  63  142:invokevirtual   #86  <Method int NetworkDiagnosticRoutines.ordinal()>
							//*  64  145:iconst_1        
							//*  65  146:iastore         
							//*  66  147:getstatic       #81  <Field int[] b>
							//*  67  150:getstatic       #89  <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.MQTTPort>
							//*  68  153:invokevirtual   #86  <Method int NetworkDiagnosticRoutines.ordinal()>
							//*  69  156:iconst_2        
							//*  70  157:iastore         
							//*  71  158:invokestatic    #94  <Method MissionDataState[] MissionDataState.values()>
							//*  72  161:arraylength     
							//*  73  162:newarray        int[]
							//*  74  164:putstatic       #96  <Field int[] a>
							//*  75  167:getstatic       #96  <Field int[] a>
							//*  76  170:getstatic       #100 <Field MissionDataState MissionDataState.MissionStatus>
							//*  77  173:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//*  78  176:iconst_1        
							//*  79  177:iastore         
							//*  80  178:getstatic       #96  <Field int[] a>
							//*  81  181:getstatic       #104 <Field MissionDataState MissionDataState.BatteryLevel>
							//*  82  184:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//*  83  187:iconst_2        
							//*  84  188:iastore         
							//*  85  189:getstatic       #96  <Field int[] a>
							//*  86  192:getstatic       #107 <Field MissionDataState MissionDataState.Charging>
							//*  87  195:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//*  88  198:iconst_3        
							//*  89  199:iastore         
							//*  90  200:getstatic       #96  <Field int[] a>
							//*  91  203:getstatic       #110 <Field MissionDataState MissionDataState.Binfull>
							//*  92  206:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//*  93  209:iconst_4        
							//*  94  210:iastore         
							//*  95  211:getstatic       #96  <Field int[] a>
							//*  96  214:getstatic       #113 <Field MissionDataState MissionDataState.TankLow>
							//*  97  217:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//*  98  220:iconst_5        
							//*  99  221:iastore         
							//* 100  222:getstatic       #96  <Field int[] a>
							//* 101  225:getstatic       #116 <Field MissionDataState MissionDataState.PauseExpireTime>
							//* 102  228:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//* 103  231:bipush          6
							//* 104  233:iastore         
							//* 105  234:getstatic       #96  <Field int[] a>
							//* 106  237:getstatic       #119 <Field MissionDataState MissionDataState.PauseResumeTime>
							//* 107  240:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//* 108  243:bipush          7
							//* 109  245:iastore         
							//* 110  246:getstatic       #96  <Field int[] a>
							//* 111  249:getstatic       #122 <Field MissionDataState MissionDataState.StatusMessage>
							//* 112  252:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//* 113  255:bipush          8
							//* 114  257:iastore         
							//* 115  258:getstatic       #96  <Field int[] a>
							//* 116  261:getstatic       #125 <Field MissionDataState MissionDataState.HelpContentId>
							//* 117  264:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//* 118  267:bipush          9
							//* 119  269:iastore         
							//* 120  270:getstatic       #96  <Field int[] a>
							//* 121  273:getstatic       #128 <Field MissionDataState MissionDataState.HelpContentUrl>
							//* 122  276:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//* 123  279:bipush          10
							//* 124  281:iastore         
							//* 125  282:getstatic       #96  <Field int[] a>
							//* 126  285:getstatic       #131 <Field MissionDataState MissionDataState.Training>
							//* 127  288:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//* 128  291:bipush          11
							//* 129  293:iastore         
							//* 130  294:getstatic       #96  <Field int[] a>
							//* 131  297:getstatic       #134 <Field MissionDataState MissionDataState.Invalid>
							//* 132  300:invokevirtual   #101 <Method int MissionDataState.ordinal()>
							//* 133  303:bipush          12
							//* 134  305:iastore         
							//* 135  306:return          
								catch(NoSuchFieldError nosuchfielderror) { }
							//  136  307:astore_0        
								d = new int[AssetNetworkUIServiceDataState.values().length];
								try
								{
									d[AssetNetworkUIServiceDataState.LocalConnectionState.ordinal()] = 1;
								}
							//* 137  308:goto            20
								catch(NoSuchFieldError nosuchfielderror1) { }
							//  138  311:astore_0        
								try
								{
									d[AssetNetworkUIServiceDataState.RemoteConnectionState.ordinal()] = 2;
								}
							//* 139  312:goto            40
								catch(NoSuchFieldError nosuchfielderror2) { }
							//  140  315:astore_0        
								c = new int[OnDemandOTAStatus.values().length];
								try
								{
									c[OnDemandOTAStatus.ProcessError.ordinal()] = 1;
								}
							//* 141  316:goto            51
								catch(NoSuchFieldError nosuchfielderror3) { }
							//  142  319:astore_0        
								try
								{
									c[OnDemandOTAStatus.InProgress.ordinal()] = 2;
								}
							//* 143  320:goto            71
								catch(NoSuchFieldError nosuchfielderror4) { }
							//  144  323:astore_0        
								try
								{
									c[OnDemandOTAStatus.Success.ordinal()] = 3;
								}
							//* 145  324:goto            82
								catch(NoSuchFieldError nosuchfielderror5) { }
							//  146  327:astore_0        
								try
								{
									c[OnDemandOTAStatus.NotUserInitiated.ordinal()] = 4;
								}
							//* 147  328:goto            93
								catch(NoSuchFieldError nosuchfielderror6) { }
							//  148  331:astore_0        
								try
								{
									c[OnDemandOTAStatus.VersionCheckFailure.ordinal()] = 5;
								}
							//* 149  332:goto            104
								catch(NoSuchFieldError nosuchfielderror7) { }
							//  150  335:astore_0        
								try
								{
									c[OnDemandOTAStatus.DeploymentStatusCheckTimedOut.ordinal()] = 6;
								}
							//* 151  336:goto            115
								catch(NoSuchFieldError nosuchfielderror8) { }
							//  152  339:astore_0        
								b = new int[NetworkDiagnosticRoutines.values().length];
								try
								{
									b[NetworkDiagnosticRoutines.InternetConnectivity.ordinal()] = 1;
								}
							//* 153  340:goto            127
								catch(NoSuchFieldError nosuchfielderror9) { }
							//  154  343:astore_0        
								try
								{
									b[NetworkDiagnosticRoutines.MQTTPort.ordinal()] = 2;
								}
							//* 155  344:goto            147
								catch(NoSuchFieldError nosuchfielderror10) { }
							//  156  347:astore_0        
								a = new int[MissionDataState.values().length];
								try
								{
									a[MissionDataState.MissionStatus.ordinal()] = 1;
								}
							//* 157  348:goto            158
								catch(NoSuchFieldError nosuchfielderror11) { }
							//  158  351:astore_0        
								try
								{
									a[MissionDataState.BatteryLevel.ordinal()] = 2;
								}
							//* 159  352:goto            178
								catch(NoSuchFieldError nosuchfielderror12) { }
							//  160  355:astore_0        
								try
								{
									a[MissionDataState.Charging.ordinal()] = 3;
								}
							//* 161  356:goto            189
								catch(NoSuchFieldError nosuchfielderror13) { }
							//  162  359:astore_0        
								try
								{
									a[MissionDataState.Binfull.ordinal()] = 4;
								}
							//* 163  360:goto            200
								catch(NoSuchFieldError nosuchfielderror14) { }
							//  164  363:astore_0        
								try
								{
									a[MissionDataState.TankLow.ordinal()] = 5;
								}
							//* 165  364:goto            211
								catch(NoSuchFieldError nosuchfielderror15) { }
							//  166  367:astore_0        
								try
								{
									a[MissionDataState.PauseExpireTime.ordinal()] = 6;
								}
							//* 167  368:goto            222
								catch(NoSuchFieldError nosuchfielderror16) { }
							//  168  371:astore_0        
								try
								{
									a[MissionDataState.PauseResumeTime.ordinal()] = 7;
								}
							//* 169  372:goto            234
								catch(NoSuchFieldError nosuchfielderror17) { }
							//  170  375:astore_0        
								try
								{
									a[MissionDataState.StatusMessage.ordinal()] = 8;
								}
							//* 171  376:goto            246
								catch(NoSuchFieldError nosuchfielderror18) { }
							//  172  379:astore_0        
								try
								{
									a[MissionDataState.HelpContentId.ordinal()] = 9;
								}
							//* 173  380:goto            258
								catch(NoSuchFieldError nosuchfielderror19) { }
							//  174  383:astore_0        
								try
								{
									a[MissionDataState.HelpContentUrl.ordinal()] = 10;
								}
							//* 175  384:goto            270
								catch(NoSuchFieldError nosuchfielderror20) { }
							//  176  387:astore_0        
								try
								{
									a[MissionDataState.Training.ordinal()] = 11;
								}
							//* 177  388:goto            282
								catch(NoSuchFieldError nosuchfielderror21) { }
							//  178  391:astore_0        
								try
								{
									a[MissionDataState.Invalid.ordinal()] = 12;
								}
							//* 179  392:goto            294
								catch(NoSuchFieldError nosuchfielderror22) { }
							//  180  395:astore_0        
							//* 181  396:return          
							}
						}

						switch(com.irobot.home._cls4.a[missiondatastate.ordinal()])
		//*  51  116:getstatic       #93  <Field int[] com.irobot.home.RobotCleanActivity$4.a>
		//*  52  119:aload           6
		//*  53  121:invokevirtual   #97  <Method int MissionDataState.ordinal()>
		//*  54  124:iaload          
						{
		//*  55  125:tableswitch     1 11: default 184
		//		               1 485
		//		               2 463
		//		               3 424
		//		               4 391
		//		               5 358
		//		               6 341
		//		               7 324
		//		               8 225
		//		               9 208
		//		               10 94
		//		               11 187
		//*  56  184:goto            94
						case 11: // '\013'
							boolean flag2 = missionuiservicedata.getIsTraining();
		//   57  187:aload_1         
		//   58  188:invokevirtual   #100 <Method boolean MissionUIServiceData.getIsTraining()>
		//   59  191:istore          4
							com.irobot.home.RobotCleanActivity.c(a).b(flag2);
		//   60  193:aload_0         
		//   61  194:getfield        #14  <Field RobotCleanActivity a>
		//   62  197:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//   63  200:iload           4
		//   64  202:invokevirtual   #109 <Method void bk.b(boolean)>
							break;

		//*  65  205:goto            94
						case 9: // '\t'
							RobotCleanActivity.d(a).d(missionuiservicedata.getHelpContentId());
		//   66  208:aload_0         
		//   67  209:getfield        #14  <Field RobotCleanActivity a>
		//   68  212:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
		//   69  215:aload_1         
		//   70  216:invokevirtual   #116 <Method String MissionUIServiceData.getHelpContentId()>
		//   71  219:invokevirtual   #121 <Method void be.d(String)>
							break;

		//*  72  222:goto            94
						case 8: // '\b'
							String s1 = missionuiservicedata.getStatusMessage();
		//   73  225:aload_1         
		//   74  226:invokevirtual   #124 <Method String MissionUIServiceData.getStatusMessage()>
		//   75  229:astore          6
							Object obj1 = ((Object) (missionuiservicedata.getStatusMessageArgs()));
		//   76  231:aload_1         
		//   77  232:invokevirtual   #127 <Method ArrayList MissionUIServiceData.getStatusMessageArgs()>
		//   78  235:astore          7
							s1 = j.a(((Context) (a)), s1, ((ArrayList) (obj1)));
		//   79  237:aload_0         
		//   80  238:getfield        #14  <Field RobotCleanActivity a>
		//   81  241:aload           6
		//   82  243:aload           7
		//   83  245:invokestatic    #132 <Method String j.a(Context, String, ArrayList)>
		//   84  248:astore          6
							obj1 = ((Object) (RobotCleanActivity.N()));
		//   85  250:invokestatic    #34  <Method String RobotCleanActivity.N()>
		//   86  253:astore          7
							StringBuilder stringbuilder1 = new StringBuilder();
		//   87  255:new             #57  <Class StringBuilder>
		//   88  258:dup             
		//   89  259:invokespecial   #58  <Method void StringBuilder()>
		//   90  262:astore          8
							stringbuilder1.append("Resolved status text: ");
		//   91  264:aload           8
		//   92  266:ldc1            #134 <String "Resolved status text: ">
		//   93  268:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   94  271:pop             
							stringbuilder1.append(s1);
		//   95  272:aload           8
		//   96  274:aload           6
		//   97  276:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   98  279:pop             
							o.b(((String) (obj1)), stringbuilder1.toString());
		//   99  280:aload           7
		//  100  282:aload           8
		//  101  284:invokevirtual   #70  <Method String StringBuilder.toString()>
		//  102  287:invokestatic    #73  <Method void o.b(String, String)>
							if(!missionuiservicedata.getIsStatusConnectionRelated())
		//* 103  290:aload_1         
		//* 104  291:invokevirtual   #137 <Method boolean MissionUIServiceData.getIsStatusConnectionRelated()>
		//* 105  294:ifne            309
								com.irobot.home.RobotCleanActivity.c(a).b(s1);
		//  106  297:aload_0         
		//  107  298:getfield        #14  <Field RobotCleanActivity a>
		//  108  301:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  109  304:aload           6
		//  110  306:invokevirtual   #139 <Method void bk.b(String)>
							RobotCleanActivity.d(a).c(s1);
		//  111  309:aload_0         
		//  112  310:getfield        #14  <Field RobotCleanActivity a>
		//  113  313:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
		//  114  316:aload           6
		//  115  318:invokevirtual   #141 <Method void be.c(String)>
							break;

		//* 116  321:goto            94
						case 7: // '\007'
							com.irobot.home.RobotCleanActivity.c(a).c(((int) (missionuiservicedata.getPauseResumeTime())));
		//  117  324:aload_0         
		//  118  325:getfield        #14  <Field RobotCleanActivity a>
		//  119  328:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  120  331:aload_1         
		//  121  332:invokevirtual   #145 <Method short MissionUIServiceData.getPauseResumeTime()>
		//  122  335:invokevirtual   #148 <Method void bk.c(int)>
							break;

		//* 123  338:goto            94
						case 6: // '\006'
							com.irobot.home.RobotCleanActivity.c(a).b(((int) (missionuiservicedata.getPauseExpireTime())));
		//  124  341:aload_0         
		//  125  342:getfield        #14  <Field RobotCleanActivity a>
		//  126  345:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  127  348:aload_1         
		//  128  349:invokevirtual   #151 <Method short MissionUIServiceData.getPauseExpireTime()>
		//  129  352:invokevirtual   #153 <Method void bk.b(int)>
							break;

		//* 130  355:goto            94
						case 5: // '\005'
							boolean flag3 = missionuiservicedata.getIsTankLow();
		//  131  358:aload_1         
		//  132  359:invokevirtual   #156 <Method boolean MissionUIServiceData.getIsTankLow()>
		//  133  362:istore          4
							com.irobot.home.RobotCleanActivity.c(a).c(flag3);
		//  134  364:aload_0         
		//  135  365:getfield        #14  <Field RobotCleanActivity a>
		//  136  368:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  137  371:iload           4
		//  138  373:invokevirtual   #158 <Method void bk.c(boolean)>
							RobotCleanActivity.d(a).c(flag3);
		//  139  376:aload_0         
		//  140  377:getfield        #14  <Field RobotCleanActivity a>
		//  141  380:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
		//  142  383:iload           4
		//  143  385:invokevirtual   #159 <Method void be.c(boolean)>
							break;

		//* 144  388:goto            94
						case 4: // '\004'
							boolean flag4 = missionuiservicedata.getIsBinfull();
		//  145  391:aload_1         
		//  146  392:invokevirtual   #162 <Method boolean MissionUIServiceData.getIsBinfull()>
		//  147  395:istore          4
							com.irobot.home.RobotCleanActivity.c(a).a(flag4);
		//  148  397:aload_0         
		//  149  398:getfield        #14  <Field RobotCleanActivity a>
		//  150  401:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  151  404:iload           4
		//  152  406:invokevirtual   #164 <Method void bk.a(boolean)>
							RobotCleanActivity.d(a).a(flag4);
		//  153  409:aload_0         
		//  154  410:getfield        #14  <Field RobotCleanActivity a>
		//  155  413:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
		//  156  416:iload           4
		//  157  418:invokevirtual   #165 <Method void be.a(boolean)>
							break;

		//* 158  421:goto            94
						case 3: // '\003'
							com.irobot.home.RobotCleanActivity.a(a, missionuiservicedata.getIsCharging());
		//  159  424:aload_0         
		//  160  425:getfield        #14  <Field RobotCleanActivity a>
		//  161  428:aload_1         
		//  162  429:invokevirtual   #168 <Method boolean MissionUIServiceData.getIsCharging()>
		//  163  432:invokestatic    #171 <Method boolean com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, boolean)>
		//  164  435:pop             
							com.irobot.home.RobotCleanActivity.b(a);
		//  165  436:aload_0         
		//  166  437:getfield        #14  <Field RobotCleanActivity a>
		//  167  440:invokestatic    #173 <Method void com.irobot.home.RobotCleanActivity.b(RobotCleanActivity)>
							com.irobot.home.RobotCleanActivity.c(a).f(RobotCleanActivity.e(a));
		//  168  443:aload_0         
		//  169  444:getfield        #14  <Field RobotCleanActivity a>
		//  170  447:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  171  450:aload_0         
		//  172  451:getfield        #14  <Field RobotCleanActivity a>
		//  173  454:invokestatic    #176 <Method boolean RobotCleanActivity.e(RobotCleanActivity)>
		//  174  457:invokevirtual   #179 <Method void bk.f(boolean)>
							break;

		//* 175  460:goto            94
						case 2: // '\002'
							com.irobot.home.RobotCleanActivity.a(a, ((int) (missionuiservicedata.getBatteryLevelPercentage())));
		//  176  463:aload_0         
		//  177  464:getfield        #14  <Field RobotCleanActivity a>
		//  178  467:aload_1         
		//  179  468:invokevirtual   #182 <Method short MissionUIServiceData.getBatteryLevelPercentage()>
		//  180  471:invokestatic    #185 <Method int com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, int)>
		//  181  474:pop             
							com.irobot.home.RobotCleanActivity.b(a);
		//  182  475:aload_0         
		//  183  476:getfield        #14  <Field RobotCleanActivity a>
		//  184  479:invokestatic    #173 <Method void com.irobot.home.RobotCleanActivity.b(RobotCleanActivity)>
							break;

		//* 185  482:goto            94
						case 1: // '\001'
							com.irobot.core.ResolvedMissionStatus resolvedmissionstatus = missionuiservicedata.getResolvedMissionStatus();
		//  186  485:aload_1         
		//  187  486:invokevirtual   #189 <Method com.irobot.core.ResolvedMissionStatus MissionUIServiceData.getResolvedMissionStatus()>
		//  188  489:astore          6
							com.irobot.home.RobotCleanActivity.c(a).a(resolvedmissionstatus);
		//  189  491:aload_0         
		//  190  492:getfield        #14  <Field RobotCleanActivity a>
		//  191  495:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  192  498:aload           6
		//  193  500:invokevirtual   #192 <Method void bk.a(com.irobot.core.ResolvedMissionStatus)>
							RobotCleanActivity.d(a).a(resolvedmissionstatus);
		//  194  503:aload_0         
		//  195  504:getfield        #14  <Field RobotCleanActivity a>
		//  196  507:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
		//  197  510:aload           6
		//  198  512:invokevirtual   #193 <Method void be.a(com.irobot.core.ResolvedMissionStatus)>
							com.irobot.home.RobotCleanActivity.c(a).e(missionuiservicedata.isPaused());
		//  199  515:aload_0         
		//  200  516:getfield        #14  <Field RobotCleanActivity a>
		//  201  519:invokestatic    #104 <Method bk com.irobot.home.RobotCleanActivity.c(RobotCleanActivity)>
		//  202  522:aload_1         
		//  203  523:invokevirtual   #196 <Method boolean MissionUIServiceData.isPaused()>
		//  204  526:invokevirtual   #198 <Method void bk.e(boolean)>
							flag1 = missionuiservicedata.isPaused();
		//  205  529:aload_1         
		//  206  530:invokevirtual   #196 <Method boolean MissionUIServiceData.isPaused()>
		//  207  533:istore_3        
							flag = true;
		//  208  534:iconst_1        
		//  209  535:istore_2        
							break;
						}
						continue;
		//  210  536:goto            94
					}
					if(flag)
		//* 211  539:iload_2         
		//* 212  540:ifeq            551
						com.irobot.home.RobotCleanActivity.b(a, flag1);
		//  213  543:aload_0         
		//  214  544:getfield        #14  <Field RobotCleanActivity a>
		//  215  547:iload_3         
		//  216  548:invokestatic    #201 <Method void com.irobot.home.RobotCleanActivity.b(RobotCleanActivity, boolean)>
					break;
				} while(true);
			}
		//  217  551:return          
		}

		final RobotCleanActivity a;

		protected a()
		{
			a = RobotCleanActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field RobotCleanActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void MissionUIServiceDataCallback()>
		//    5    9:return          
		}
	}

	private class b
		implements com.irobot.home.fragments.be.d
	{

		public void a()
		{
			com.irobot.home.RobotCleanActivity.a(a);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field RobotCleanActivity a>
		//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotCleanActivity.a(RobotCleanActivity)>
		//    3    7:return          
		}

		final RobotCleanActivity a;

		private b()
		{
			a = RobotCleanActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field RobotCleanActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public RobotCleanActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void BaseCleanActivity()>
		B = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #123 <Field bc B>
		C = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #125 <Field String C>
		D = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #127 <Field boolean D>
		H = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #129 <Field boolean H>
		I = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #131 <Field boolean I>
		J = NetworkDiagnosticRoutines.None;
	//   17   29:aload_0         
	//   18   30:getstatic       #136 <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.None>
	//   19   33:putfield        #138 <Field NetworkDiagnosticRoutines J>
		K = NetworkDiagnosticState.None;
	//   20   36:aload_0         
	//   21   37:getstatic       #142 <Field NetworkDiagnosticState NetworkDiagnosticState.None>
	//   22   40:putfield        #144 <Field NetworkDiagnosticState K>
	//   23   43:aload_0         
	//   24   44:new             #47  <Class RobotCleanActivity$b>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:aconst_null     
	//   28   50:invokespecial   #147 <Method void RobotCleanActivity$b(RobotCleanActivity, RobotCleanActivity$1)>
	//   29   53:putfield        #149 <Field RobotCleanActivity$b L>
		u = new CleanActivityAssetGenericEventHandler();
	//   30   56:aload_0         
	//   31   57:new             #38  <Class RobotCleanActivity$CleanActivityAssetGenericEventHandler>
	//   32   60:dup             
	//   33   61:aload_0         
	//   34   62:aconst_null     
	//   35   63:invokespecial   #150 <Method void RobotCleanActivity$CleanActivityAssetGenericEventHandler(RobotCleanActivity, RobotCleanActivity$1)>
	//   36   66:putfield        #152 <Field RobotCleanActivity$CleanActivityAssetGenericEventHandler u>
		M = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				if(intent.getAction().equalsIgnoreCase("com.irobot.homeintent.action.CLOUD_ENV_WARNING"))
			//*   0    0:aload_2         
			//*   1    1:invokevirtual   #24  <Method String Intent.getAction()>
			//*   2    4:ldc1            #26  <String "com.irobot.homeintent.action.CLOUD_ENV_WARNING">
			//*   3    6:invokevirtual   #32  <Method boolean String.equalsIgnoreCase(String)>
			//*   4    9:ifeq            35
				{
					context = ((Context) (intent.getStringExtra("com.irobot.homeintent.extra.APP_CLOUD_ENV")));
			//    5   12:aload_2         
			//    6   13:ldc1            #34  <String "com.irobot.homeintent.extra.APP_CLOUD_ENV">
			//    7   15:invokevirtual   #38  <Method String Intent.getStringExtra(String)>
			//    8   18:astore_1        
					intent = ((Intent) (intent.getStringExtra("com.irobot.homeintent.extra.ASSET_CLOUD_ENV")));
			//    9   19:aload_2         
			//   10   20:ldc1            #40  <String "com.irobot.homeintent.extra.ASSET_CLOUD_ENV">
			//   11   22:invokevirtual   #38  <Method String Intent.getStringExtra(String)>
			//   12   25:astore_2        
					a.a(((String) (context)), ((String) (intent)));
			//   13   26:aload_0         
			//   14   27:getfield        #12  <Field RobotCleanActivity a>
			//   15   30:aload_1         
			//   16   31:aload_2         
			//   17   32:invokevirtual   #43  <Method void com.irobot.home.RobotCleanActivity.a(String, String)>
				}
			//   18   35:return          
			}

			final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   37   69:aload_0         
	//   38   70:new             #14  <Class RobotCleanActivity$1>
	//   39   73:dup             
	//   40   74:aload_0         
	//   41   75:invokespecial   #155 <Method void RobotCleanActivity$1(RobotCleanActivity)>
	//   42   78:putfield        #157 <Field BroadcastReceiver M>
		N = null;
	//   43   81:aload_0         
	//   44   82:aconst_null     
	//   45   83:putfield        #159 <Field AlertDialog N>
		O = null;
	//   46   86:aload_0         
	//   47   87:aconst_null     
	//   48   88:putfield        #161 <Field MissionSubsystem O>
		P = null;
	//   49   91:aload_0         
	//   50   92:aconst_null     
	//   51   93:putfield        #163 <Field AssetNetworkUIService P>
		Q = new a();
	//   52   96:aload_0         
	//   53   97:new             #44  <Class RobotCleanActivity$a>
	//   54  100:dup             
	//   55  101:aload_0         
	//   56  102:invokespecial   #164 <Method void RobotCleanActivity$a(RobotCleanActivity)>
	//   57  105:putfield        #166 <Field RobotCleanActivity$a Q>
		V = new com.irobot.home.m.b.a() {

			public void a(boolean flag)
			{
			//    0    0:return          
			}

			public void b(boolean flag)
			{
				boolean flag1 = Assembler.getInstance().getPersistenceHandler().readBool("productTourEvacBagMissingSeen", false);
			//    0    0:invokestatic    #26  <Method Assembler Assembler.getInstance()>
			//    1    3:invokevirtual   #30  <Method PersistenceHandler Assembler.getPersistenceHandler()>
			//    2    6:ldc1            #32  <String "productTourEvacBagMissingSeen">
			//    3    8:iconst_0        
			//    4    9:invokevirtual   #38  <Method boolean PersistenceHandler.readBool(String, boolean)>
			//    5   12:istore_2        
				if("Error 350".equals(((Object) (RobotCleanActivity.d(a).M()))) && flag && !flag1)
			//*   6   13:ldc1            #40  <String "Error 350">
			//*   7   15:aload_0         
			//*   8   16:getfield        #14  <Field RobotCleanActivity a>
			//*   9   19:invokestatic    #44  <Method be RobotCleanActivity.d(RobotCleanActivity)>
			//*  10   22:invokevirtual   #50  <Method String be.M()>
			//*  11   25:invokevirtual   #56  <Method boolean String.equals(Object)>
			//*  12   28:ifeq            100
			//*  13   31:iload_1         
			//*  14   32:ifeq            100
			//*  15   35:iload_2         
			//*  16   36:ifne            100
				{
					com.irobot.home.VideoHelpActivity_.a(((Context) (a))).b(0x7f0f00aa).c(0x7f0e0214).a(false).a(j.b(0x7f030000, a.getResources())).c(true).a();
			//   17   39:aload_0         
			//   18   40:getfield        #14  <Field RobotCleanActivity a>
			//   19   43:invokestatic    #61  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_.a(Context)>
			//   20   46:ldc1            #62  <Int 0x7f0f00aa>
			//   21   48:invokevirtual   #67  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.b(int)>
			//   22   51:ldc1            #68  <Int 0x7f0e0214>
			//   23   53:invokevirtual   #71  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.c(int)>
			//   24   56:iconst_0        
			//   25   57:invokevirtual   #74  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.a(boolean)>
			//   26   60:ldc1            #75  <Int 0x7f030000>
			//   27   62:aload_0         
			//   28   63:getfield        #14  <Field RobotCleanActivity a>
			//   29   66:invokevirtual   #79  <Method Resources RobotCleanActivity.getResources()>
			//   30   69:invokestatic    #84  <Method ArrayList j.b(int, Resources)>
			//   31   72:invokevirtual   #87  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.a(ArrayList)>
			//   32   75:iconst_1        
			//   33   76:invokevirtual   #89  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.c(boolean)>
			//   34   79:invokevirtual   #92  <Method org.androidannotations.api.a.e com.irobot.home.VideoHelpActivity_$a.a()>
			//   35   82:pop             
					AssetInfo assetinfo = j.j().a();
			//   36   83:invokestatic    #96  <Method a j.j()>
			//   37   86:invokevirtual   #101 <Method AssetInfo a.a()>
			//   38   89:astore_3        
					AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.EvacDockBagMissingHelpContent, assetinfo);
			//   39   90:invokestatic    #106 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   40   93:getstatic       #112 <Field ViewId ViewId.EvacDockBagMissingHelpContent>
			//   41   96:aload_3         
			//   42   97:invokevirtual   #116 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
				}
			//   43  100:return          
			}

			final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   58  108:aload_0         
	//   59  109:new             #28  <Class RobotCleanActivity$5>
	//   60  112:dup             
	//   61  113:aload_0         
	//   62  114:invokespecial   #167 <Method void RobotCleanActivity$5(RobotCleanActivity)>
	//   63  117:putfield        #169 <Field com.irobot.home.m.b$a V>
	//   64  120:aload_0         
	//   65  121:new             #171 <Class Handler>
	//   66  124:dup             
	//   67  125:invokespecial   #172 <Method void Handler()>
	//   68  128:putfield        #174 <Field Handler W>
	//   69  131:aload_0         
	//   70  132:new             #30  <Class RobotCleanActivity$6>
	//   71  135:dup             
	//   72  136:aload_0         
	//   73  137:invokespecial   #175 <Method void RobotCleanActivity$6(RobotCleanActivity)>
	//   74  140:putfield        #177 <Field Runnable X>
	//   75  143:aload_0         
	//   76  144:new             #24  <Class RobotCleanActivity$3>
	//   77  147:dup             
	//   78  148:aload_0         
	//   79  149:invokespecial   #178 <Method void RobotCleanActivity$3(RobotCleanActivity)>
	//   80  152:putfield        #180 <Field AssetNetworkUIServiceDataCallback v>
	//   81  155:return          
	}

	static String N()
	{
		return w;
	//    0    0:getstatic       #117 <Field String w>
	//    1    3:areturn         
	}

	private void O()
	{
		W.postDelayed(X, 500L);
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field Handler W>
	//    2    4:aload_0         
	//    3    5:getfield        #177 <Field Runnable X>
	//    4    8:ldc2w           #181 <Long 500L>
	//    5   11:invokevirtual   #186 <Method boolean Handler.postDelayed(Runnable, long)>
	//    6   14:pop             
	//    7   15:return          
	}

	private void P()
	{
		FragmentManager fragmentmanager = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//    2    4:astore_1        
		FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #196 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    5    9:astore_2        
		h = ((ag) (new ah()));
	//    6   10:aload_0         
	//    7   11:new             #198 <Class ah>
	//    8   14:dup             
	//    9   15:invokespecial   #199 <Method void ah()>
	//   10   18:putfield        #203 <Field ag h>
		fragmenttransaction.add(0x7f090251, ((android.app.Fragment) (h)));
	//   11   21:aload_2         
	//   12   22:ldc1            #204 <Int 0x7f090251>
	//   13   24:aload_0         
	//   14   25:getfield        #203 <Field ag h>
	//   15   28:invokevirtual   #210 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   16   31:pop             
		h.a(((com.irobot.home.fragments.ag.a) (this)));
	//   17   32:aload_0         
	//   18   33:getfield        #203 <Field ag h>
	//   19   36:aload_0         
	//   20   37:invokevirtual   #215 <Method void ag.a(com.irobot.home.fragments.ag$a)>
		i = ad.g().a(j.j().b().getId()).a();
	//   21   40:aload_0         
	//   22   41:invokestatic    #221 <Method com.irobot.home.fragments.ad$a ad.g()>
	//   23   44:invokestatic    #225 <Method a j.j()>
	//   24   47:invokevirtual   #230 <Method AssetId a.b()>
	//   25   50:invokevirtual   #235 <Method String AssetId.getId()>
	//   26   53:invokevirtual   #240 <Method com.irobot.home.fragments.ad$a com.irobot.home.fragments.ad$a.a(String)>
	//   27   56:invokevirtual   #243 <Method ac com.irobot.home.fragments.ad$a.a()>
	//   28   59:putfield        #247 <Field ac i>
		fragmenttransaction.add(0x7f0901c6, ((android.app.Fragment) (i)));
	//   29   62:aload_2         
	//   30   63:ldc1            #248 <Int 0x7f0901c6>
	//   31   65:aload_0         
	//   32   66:getfield        #247 <Field ac i>
	//   33   69:invokevirtual   #210 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   34   72:pop             
		x = be.a(((com.irobot.home.fragments.be.d) (L)), ((com.irobot.home.fragments.i.a) (Q)));
	//   35   73:aload_0         
	//   36   74:aload_0         
	//   37   75:getfield        #149 <Field RobotCleanActivity$b L>
	//   38   78:aload_0         
	//   39   79:getfield        #166 <Field RobotCleanActivity$a Q>
	//   40   82:invokestatic    #253 <Method be be.a(com.irobot.home.fragments.be$d, com.irobot.home.fragments.i$a)>
	//   41   85:putfield        #255 <Field be x>
		fragmenttransaction.add(0x7f0900e4, ((android.app.Fragment) (x)));
	//   42   88:aload_2         
	//   43   89:ldc2            #256 <Int 0x7f0900e4>
	//   44   92:aload_0         
	//   45   93:getfield        #255 <Field be x>
	//   46   96:invokevirtual   #210 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   47   99:pop             
		z = ((bk) (new bl()));
	//   48  100:aload_0         
	//   49  101:new             #258 <Class bl>
	//   50  104:dup             
	//   51  105:invokespecial   #259 <Method void bl()>
	//   52  108:putfield        #261 <Field bk z>
		z.a(((com.irobot.home.fragments.i.a) (Q)));
	//   53  111:aload_0         
	//   54  112:getfield        #261 <Field bk z>
	//   55  115:aload_0         
	//   56  116:getfield        #166 <Field RobotCleanActivity$a Q>
	//   57  119:invokevirtual   #266 <Method void bk.a(com.irobot.home.fragments.i$a)>
		fragmenttransaction.add(0x7f0902f2, ((android.app.Fragment) (z)));
	//   58  122:aload_2         
	//   59  123:ldc2            #267 <Int 0x7f0902f2>
	//   60  126:aload_0         
	//   61  127:getfield        #261 <Field bk z>
	//   62  130:invokevirtual   #210 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   63  133:pop             
		fragmenttransaction.hide(((android.app.Fragment) (z)));
	//   64  134:aload_2         
	//   65  135:aload_0         
	//   66  136:getfield        #261 <Field bk z>
	//   67  139:invokevirtual   #271 <Method FragmentTransaction FragmentTransaction.hide(android.app.Fragment)>
	//   68  142:pop             
		A = ((bi) (new bj()));
	//   69  143:aload_0         
	//   70  144:new             #273 <Class bj>
	//   71  147:dup             
	//   72  148:invokespecial   #274 <Method void bj()>
	//   73  151:putfield        #276 <Field bi A>
		fragmenttransaction.add(0x7f090116, ((android.app.Fragment) (A)));
	//   74  154:aload_2         
	//   75  155:ldc2            #277 <Int 0x7f090116>
	//   76  158:aload_0         
	//   77  159:getfield        #276 <Field bi A>
	//   78  162:invokevirtual   #210 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   79  165:pop             
		fragmenttransaction.hide(((android.app.Fragment) (A)));
	//   80  166:aload_2         
	//   81  167:aload_0         
	//   82  168:getfield        #276 <Field bi A>
	//   83  171:invokevirtual   #271 <Method FragmentTransaction FragmentTransaction.hide(android.app.Fragment)>
	//   84  174:pop             
		fragmenttransaction.commit();
	//   85  175:aload_2         
	//   86  176:invokevirtual   #281 <Method int FragmentTransaction.commit()>
	//   87  179:pop             
		fragmentmanager.executePendingTransactions();
	//   88  180:aload_1         
	//   89  181:invokevirtual   #285 <Method boolean FragmentManager.executePendingTransactions()>
	//   90  184:pop             
	//   91  185:return          
	}

	private void Q()
	{
		boolean flag;
		android.app.AlertDialog.Builder builder;
		CurrentConnectionState currentconnectionstate;
		Robot robot;
		flag = j.a();
	//    0    0:invokestatic    #290 <Method boolean j.a()>
	//    1    3:istore_2        
		if(flag && K.equals(((Object) (NetworkDiagnosticState.Failure))))
	//*   2    4:iload_2         
	//*   3    5:ifeq            26
	//*   4    8:aload_0         
	//*   5    9:getfield        #144 <Field NetworkDiagnosticState K>
	//*   6   12:getstatic       #293 <Field NetworkDiagnosticState NetworkDiagnosticState.Failure>
	//*   7   15:invokevirtual   #297 <Method boolean NetworkDiagnosticState.equals(Object)>
	//*   8   18:ifeq            26
		{
			U();
	//    9   21:aload_0         
	//   10   22:invokespecial   #299 <Method void U()>
			return;
	//   11   25:return          
		}
		robot = j.c(j.k());
	//   12   26:invokestatic    #302 <Method AssetId j.k()>
	//   13   29:invokestatic    #306 <Method Robot j.c(AssetId)>
	//   14   32:astore          6
		if(robot == null)
	//*  15   34:aload           6
	//*  16   36:ifnonnull       40
			return;
	//   17   39:return          
		AssetNetworkUIService assetnetworkuiservice = Assembler.getInstance().getNetworkUIService(j.k());
	//   18   40:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   19   43:invokestatic    #302 <Method AssetId j.k()>
	//   20   46:invokevirtual   #316 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   21   49:astore_3        
		if(assetnetworkuiservice == null)
	//*  22   50:aload_3         
	//*  23   51:ifnonnull       55
			return;
	//   24   54:return          
		builder = new android.app.AlertDialog.Builder(((Context) (this)));
	//   25   55:new             #318 <Class android.app.AlertDialog$Builder>
	//   26   58:dup             
	//   27   59:aload_0         
	//   28   60:invokespecial   #321 <Method void android.app.AlertDialog$Builder(Context)>
	//   29   63:astore          4
		currentconnectionstate = assetnetworkuiservice.getServiceData().getCurrentConnectionState();
	//   30   65:aload_3         
	//   31   66:invokevirtual   #327 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   32   69:invokevirtual   #333 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//   33   72:astore          5
		if(flag) goto _L2; else goto _L1
	//   34   74:iload_2         
	//   35   75:ifne            89
_L1:
		Object obj = ((Object) (getString(0x7f0f0267)));
	//   36   78:aload_0         
	//   37   79:ldc2            #334 <Int 0x7f0f0267>
	//   38   82:invokevirtual   #338 <Method String getString(int)>
	//   39   85:astore_3        
		  goto _L3
	//*  40   86:goto            180
_L2:
		if(!currentconnectionstate.equals(((Object) (CurrentConnectionState.Error)))) goto _L5; else goto _L4
	//   41   89:aload           5
	//   42   91:getstatic       #344 <Field CurrentConnectionState CurrentConnectionState.Error>
	//   43   94:invokevirtual   #345 <Method boolean CurrentConnectionState.equals(Object)>
	//   44   97:ifeq            127
_L4:
		int k;
		k = 0x7f0f0779;
	//   45  100:ldc2            #346 <Int 0x7f0f0779>
	//   46  103:istore_1        
		obj = ((Object) (new Object[1]));
	//   47  104:iconst_1        
	//   48  105:anewarray       Object[]
	//   49  108:astore_3        
		obj[0] = ((/*<invalid signature>*/java.lang.Object) (robot.i()));
	//   50  109:aload_3         
	//   51  110:iconst_0        
	//   52  111:aload           6
	//   53  113:invokevirtual   #352 <Method String Robot.i()>
	//   54  116:aastore         
_L6:
		obj = ((Object) (getString(k, ((Object []) (obj)))));
	//   55  117:aload_0         
	//   56  118:iload_1         
	//   57  119:aload_3         
	//   58  120:invokevirtual   #355 <Method String getString(int, Object[])>
	//   59  123:astore_3        
		break; /* Loop/switch isn't completed */
	//   60  124:goto            180
_L5:
		while(currentconnectionstate.equals(((Object) (CurrentConnectionState.ConnectedLocally))) || !currentconnectionstate.equals(((Object) (CurrentConnectionState.RemoteMissing)))) 
	//*  61  127:aload           5
	//*  62  129:getstatic       #358 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*  63  132:invokevirtual   #345 <Method boolean CurrentConnectionState.equals(Object)>
	//*  64  135:ifeq            149
		{
			obj = ((Object) (getString(0x7f0f0190)));
	//   65  138:aload_0         
	//   66  139:ldc2            #359 <Int 0x7f0f0190>
	//   67  142:invokevirtual   #338 <Method String getString(int)>
	//   68  145:astore_3        
			break; /* Loop/switch isn't completed */
	//   69  146:goto            180
		}
	//   70  149:aload           5
	//   71  151:getstatic       #362 <Field CurrentConnectionState CurrentConnectionState.RemoteMissing>
	//   72  154:invokevirtual   #345 <Method boolean CurrentConnectionState.equals(Object)>
	//   73  157:ifeq            138
		k = 0x7f0f0443;
	//   74  160:ldc2            #363 <Int 0x7f0f0443>
	//   75  163:istore_1        
		obj = ((Object) (new Object[1]));
	//   76  164:iconst_1        
	//   77  165:anewarray       Object[]
	//   78  168:astore_3        
		obj[0] = ((/*<invalid signature>*/java.lang.Object) (robot.i()));
	//   79  169:aload_3         
	//   80  170:iconst_0        
	//   81  171:aload           6
	//   82  173:invokevirtual   #352 <Method String Robot.i()>
	//   83  176:aastore         
		if(true) goto _L6; else goto _L3
	//   84  177:goto            117
_L3:
		builder.setMessage(((CharSequence) (obj)));
	//   85  180:aload           4
	//   86  182:aload_3         
	//   87  183:invokevirtual   #367 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   88  186:pop             
		builder.setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null)));
	//   89  187:aload           4
	//   90  189:ldc2            #368 <Int 0x7f0f05bb>
	//   91  192:aconst_null     
	//   92  193:invokevirtual   #372 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   93  196:pop             
		obj = ((Object) (x.c(currentconnectionstate)));
	//   94  197:aload_0         
	//   95  198:getfield        #255 <Field be x>
	//   96  201:aload           5
	//   97  203:invokevirtual   #375 <Method String be.c(CurrentConnectionState)>
	//   98  206:astore_3        
		if(j.i(((String) (obj))))
	//*  99  207:aload_3         
	//* 100  208:invokestatic    #378 <Method boolean j.i(String)>
	//* 101  211:ifeq            232
			builder.setNeutralButton(0x7f0f0356, new android.content.DialogInterface.OnClickListener(((String) (obj))) {

				public void onClick(DialogInterface dialoginterface, int l)
				{
					if(j.i(a))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field String a>
				//*   2    4:invokestatic    #32  <Method boolean j.i(String)>
				//*   3    7:ifeq            37
					{
						com.irobot.home.WebViewActivity_.a(((Context) (b))).a(a).a(Integer.valueOf(0x7f0f05d8)).a();
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field RobotCleanActivity b>
				//    6   14:invokestatic    #37  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(Context)>
				//    7   17:aload_0         
				//    8   18:getfield        #21  <Field String a>
				//    9   21:invokevirtual   #42  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
				//   10   24:ldc1            #43  <Int 0x7f0f05d8>
				//   11   26:invokestatic    #49  <Method Integer Integer.valueOf(int)>
				//   12   29:invokevirtual   #52  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
				//   13   32:invokevirtual   #55  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
				//   14   35:pop             
						return;
				//   15   36:return          
					} else
					{
						(new android.app.AlertDialog.Builder(((Context) (b)))).setMessage(0x7f0f0925).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
				//   16   37:new             #57  <Class android.app.AlertDialog$Builder>
				//   17   40:dup             
				//   18   41:aload_0         
				//   19   42:getfield        #19  <Field RobotCleanActivity b>
				//   20   45:invokespecial   #60  <Method void android.app.AlertDialog$Builder(Context)>
				//   21   48:ldc1            #61  <Int 0x7f0f0925>
				//   22   50:invokevirtual   #65  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
				//   23   53:ldc1            #66  <Int 0x7f0f05bb>
				//   24   55:aconst_null     
				//   25   56:invokevirtual   #70  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
				//   26   59:invokevirtual   #74  <Method AlertDialog android.app.AlertDialog$Builder.show()>
				//   27   62:pop             
						return;
				//   28   63:return          
					}
				}

				final String a;
				final RobotCleanActivity b;

			
			{
				b = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotCleanActivity b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  102  214:aload           4
	//  103  216:ldc2            #379 <Int 0x7f0f0356>
	//  104  219:new             #36  <Class RobotCleanActivity$9>
	//  105  222:dup             
	//  106  223:aload_0         
	//  107  224:aload_3         
	//  108  225:invokespecial   #382 <Method void RobotCleanActivity$9(RobotCleanActivity, String)>
	//  109  228:invokevirtual   #385 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(int, android.content.DialogInterface$OnClickListener)>
	//  110  231:pop             
		obj = ((Object) (builder.create()));
	//  111  232:aload           4
	//  112  234:invokevirtual   #389 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//  113  237:astore_3        
		((AlertDialog) (obj)).requestWindowFeature(1);
	//  114  238:aload_3         
	//  115  239:iconst_1        
	//  116  240:invokevirtual   #395 <Method boolean AlertDialog.requestWindowFeature(int)>
	//  117  243:pop             
		((AlertDialog) (obj)).show();
	//  118  244:aload_3         
	//  119  245:invokevirtual   #398 <Method void AlertDialog.show()>
		obj = ((Object) (j.j().a()));
	//  120  248:invokestatic    #225 <Method a j.j()>
	//  121  251:invokevirtual   #401 <Method AssetInfo a.a()>
	//  122  254:astore_3        
		AnalyticsSubsystem.getInstance().trackCloudButtonPressed(((AssetInfo) (obj)));
	//  123  255:invokestatic    #406 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  124  258:aload_3         
	//  125  259:invokevirtual   #410 <Method void AnalyticsSubsystem.trackCloudButtonPressed(AssetInfo)>
		return;
	//  126  262:return          
	}

	private void R()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #413 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #414 <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append(getResources().getString(0x7f0f0032));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #418 <Method Resources getResources()>
	//    7   13:ldc2            #419 <Int 0x7f0f0032>
	//    8   16:invokevirtual   #422 <Method String Resources.getString(int)>
	//    9   19:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		((StringBuilder) (obj)).append(getResources().getString(0x7f0f0037, new Object[] {
			Integer.valueOf(R)
		}));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #418 <Method Resources getResources()>
	//   14   28:ldc2            #427 <Int 0x7f0f0037>
	//   15   31:iconst_1        
	//   16   32:anewarray       Object[]
	//   17   35:dup             
	//   18   36:iconst_0        
	//   19   37:aload_0         
	//   20   38:getfield        #429 <Field int R>
	//   21   41:invokestatic    #435 <Method Integer Integer.valueOf(int)>
	//   22   44:aastore         
	//   23   45:invokevirtual   #436 <Method String Resources.getString(int, Object[])>
	//   24   48:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		((StringBuilder) (obj)).append(".");
	//   26   52:aload_2         
	//   27   53:ldc2            #438 <String ".">
	//   28   56:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		String s = ((StringBuilder) (obj)).toString();
	//   30   60:aload_2         
	//   31   61:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   32   64:astore_3        
		obj = ((Object) (new StringBuilder()));
	//   33   65:new             #413 <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #414 <Method void StringBuilder()>
	//   36   72:astore_2        
		((StringBuilder) (obj)).append(s);
	//   37   73:aload_2         
	//   38   74:aload_3         
	//   39   75:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   40   78:pop             
		int k;
		if(S)
	//*  41   79:aload_0         
	//*  42   80:getfield        #443 <Field boolean S>
	//*  43   83:ifeq            99
			k = 0x7f0f0034;
	//   44   86:ldc2            #444 <Int 0x7f0f0034>
	//   45   89:istore_1        
		else
	//*  46   90:aload_0         
	//*  47   91:iload_1         
	//*  48   92:invokevirtual   #338 <Method String getString(int)>
	//*  49   95:astore_3        
	//*  50   96:goto            106
			k = 0x7f0f0033;
	//   51   99:ldc2            #445 <Int 0x7f0f0033>
	//   52  102:istore_1        
		s = getString(k);
	//*  53  103:goto            90
		((StringBuilder) (obj)).append(s);
	//   54  106:aload_2         
	//   55  107:aload_3         
	//   56  108:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   58  112:aload_2         
	//   59  113:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   60  116:astore_2        
		z.a(R, S, ((String) (obj)));
	//   61  117:aload_0         
	//   62  118:getfield        #261 <Field bk z>
	//   63  121:aload_0         
	//   64  122:getfield        #429 <Field int R>
	//   65  125:aload_0         
	//   66  126:getfield        #443 <Field boolean S>
	//   67  129:aload_2         
	//   68  130:invokevirtual   #448 <Method void bk.a(int, boolean, String)>
		x.a(R, S, ((String) (obj)));
	//   69  133:aload_0         
	//   70  134:getfield        #255 <Field be x>
	//   71  137:aload_0         
	//   72  138:getfield        #429 <Field int R>
	//   73  141:aload_0         
	//   74  142:getfield        #443 <Field boolean S>
	//   75  145:aload_2         
	//   76  146:invokevirtual   #449 <Method void be.a(int, boolean, String)>
	//   77  149:return          
	}

	private void S()
	{
		if(!D)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field boolean D>
	//*   2    4:ifne            33
		{
			D = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #127 <Field boolean D>
			finish();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #452 <Method void finish()>
			((SelectRobotTypeActivity_.a)com.irobot.home.SelectRobotTypeActivity_.a(((Context) (this))).g(0x4000000)).a();
	//    8   16:aload_0         
	//    9   17:invokestatic    #457 <Method SelectRobotTypeActivity_$a com.irobot.home.SelectRobotTypeActivity_.a(Context)>
	//   10   20:ldc2            #458 <Int 0x4000000>
	//   11   23:invokevirtual   #463 <Method org.androidannotations.api.a.d SelectRobotTypeActivity_$a.g(int)>
	//   12   26:checkcast       #460 <Class SelectRobotTypeActivity_$a>
	//   13   29:invokevirtual   #466 <Method org.androidannotations.api.a.e com.irobot.home.SelectRobotTypeActivity_$a.a()>
	//   14   32:pop             
		}
	//   15   33:return          
	}

	private void T()
	{
		AssetInfo assetinfo = j.j().a();
	//    0    0:invokestatic    #225 <Method a j.j()>
	//    1    3:invokevirtual   #401 <Method AssetInfo a.a()>
	//    2    6:astore_1        
		if(O != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #161 <Field MissionSubsystem O>
	//*   5   11:ifnull          26
			O.unregisterSubscriber(((MissionUIServiceDataCallback) (Q)));
	//    6   14:aload_0         
	//    7   15:getfield        #161 <Field MissionSubsystem O>
	//    8   18:aload_0         
	//    9   19:getfield        #166 <Field RobotCleanActivity$a Q>
	//   10   22:invokevirtual   #472 <Method boolean MissionSubsystem.unregisterSubscriber(MissionUIServiceDataCallback)>
	//   11   25:pop             
		O = Assembler.getInstance().getMissionSubsystem(assetinfo.getAssetId());
	//   12   26:aload_0         
	//   13   27:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #477 <Method AssetId AssetInfo.getAssetId()>
	//   16   34:invokevirtual   #481 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   17   37:putfield        #161 <Field MissionSubsystem O>
		O.registerUISubscriber(((MissionUIServiceDataCallback) (Q)));
	//   18   40:aload_0         
	//   19   41:getfield        #161 <Field MissionSubsystem O>
	//   20   44:aload_0         
	//   21   45:getfield        #166 <Field RobotCleanActivity$a Q>
	//   22   48:invokevirtual   #484 <Method boolean MissionSubsystem.registerUISubscriber(MissionUIServiceDataCallback)>
	//   23   51:pop             
		if(P != null)
	//*  24   52:aload_0         
	//*  25   53:getfield        #163 <Field AssetNetworkUIService P>
	//*  26   56:ifnull          71
			P.unregisterSubscriber(v);
	//   27   59:aload_0         
	//   28   60:getfield        #163 <Field AssetNetworkUIService P>
	//   29   63:aload_0         
	//   30   64:getfield        #180 <Field AssetNetworkUIServiceDataCallback v>
	//   31   67:invokevirtual   #487 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//   32   70:pop             
		P = Assembler.getInstance().getNetworkUIService(assetinfo.getAssetId());
	//   33   71:aload_0         
	//   34   72:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   35   75:aload_1         
	//   36   76:invokevirtual   #477 <Method AssetId AssetInfo.getAssetId()>
	//   37   79:invokevirtual   #316 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   38   82:putfield        #163 <Field AssetNetworkUIService P>
		P.registerUISubscriber(v);
	//   39   85:aload_0         
	//   40   86:getfield        #163 <Field AssetNetworkUIService P>
	//   41   89:aload_0         
	//   42   90:getfield        #180 <Field AssetNetworkUIServiceDataCallback v>
	//   43   93:invokevirtual   #489 <Method boolean AssetNetworkUIService.registerUISubscriber(AssetNetworkUIServiceDataCallback)>
	//   44   96:pop             
		x = be.a(((com.irobot.home.fragments.be.d) (L)), ((com.irobot.home.fragments.i.a) (Q)));
	//   45   97:aload_0         
	//   46   98:aload_0         
	//   47   99:getfield        #149 <Field RobotCleanActivity$b L>
	//   48  102:aload_0         
	//   49  103:getfield        #166 <Field RobotCleanActivity$a Q>
	//   50  106:invokestatic    #253 <Method be be.a(com.irobot.home.fragments.be$d, com.irobot.home.fragments.i$a)>
	//   51  109:putfield        #255 <Field be x>
		FragmentManager fragmentmanager = getFragmentManager();
	//   52  112:aload_0         
	//   53  113:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//   54  116:astore_2        
		fragmentmanager.beginTransaction().replace(0x7f0900e4, ((android.app.Fragment) (x))).commit();
	//   55  117:aload_2         
	//   56  118:invokevirtual   #196 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   57  121:ldc2            #256 <Int 0x7f0900e4>
	//   58  124:aload_0         
	//   59  125:getfield        #255 <Field be x>
	//   60  128:invokevirtual   #492 <Method FragmentTransaction FragmentTransaction.replace(int, android.app.Fragment)>
	//   61  131:invokevirtual   #281 <Method int FragmentTransaction.commit()>
	//   62  134:pop             
		fragmentmanager.executePendingTransactions();
	//   63  135:aload_2         
	//   64  136:invokevirtual   #285 <Method boolean FragmentManager.executePendingTransactions()>
	//   65  139:pop             
		U = Assembler.getInstance().getSettingsSubsystem(assetinfo.getAssetId()).getServiceData().getAvailableSettings().contains(((Object) (SettingType.PushRegistrationToken)));
	//   66  140:aload_0         
	//   67  141:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   68  144:aload_1         
	//   69  145:invokevirtual   #477 <Method AssetId AssetInfo.getAssetId()>
	//   70  148:invokevirtual   #496 <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//   71  151:invokevirtual   #501 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   72  154:invokevirtual   #507 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//   73  157:getstatic       #513 <Field SettingType SettingType.PushRegistrationToken>
	//   74  160:invokevirtual   #518 <Method boolean HashSet.contains(Object)>
	//   75  163:putfield        #520 <Field boolean U>
		i();
	//   76  166:aload_0         
	//   77  167:invokevirtual   #522 <Method void i()>
	//   78  170:return          
	}

	private void U()
	{
		runOnUiThread(new Runnable() {

			public void run()
			{
				int k = com.irobot.home._cls4.b[RobotCleanActivity.g(a).ordinal()];
			//    0    0:getstatic       #27  <Field int[] com.irobot.home.RobotCleanActivity$4.b>
			//    1    3:aload_0         
			//    2    4:getfield        #17  <Field RobotCleanActivity a>
			//    3    7:invokestatic    #31  <Method NetworkDiagnosticRoutines RobotCleanActivity.g(RobotCleanActivity)>
			//    4   10:invokevirtual   #37  <Method int NetworkDiagnosticRoutines.ordinal()>
			//    5   13:iaload          
			//    6   14:istore_1        
				boolean flag = false;
			//    7   15:iconst_0        
			//    8   16:istore_2        
				Object obj;
				switch(k)
			//*   9   17:iload_1         
				{
			//*  10   18:tableswitch     1 2: default 40
			//			               1 61
			//			               2 46
				default:
					obj = "";
			//   11   40:ldc1            #39  <String "">
			//   12   42:astore_3        
					break;

			//*  13   43:goto            71
				case 2: // '\002'
					obj = ((Object) (a.getString(0x7f0f0307)));
			//   14   46:aload_0         
			//   15   47:getfield        #17  <Field RobotCleanActivity a>
			//   16   50:ldc1            #40  <Int 0x7f0f0307>
			//   17   52:invokevirtual   #44  <Method String RobotCleanActivity.getString(int)>
			//   18   55:astore_3        
					flag = true;
			//   19   56:iconst_1        
			//   20   57:istore_2        
					break;

			//*  21   58:goto            71
				case 1: // '\001'
					obj = ((Object) (a.getString(0x7f0f07b6)));
			//   22   61:aload_0         
			//   23   62:getfield        #17  <Field RobotCleanActivity a>
			//   24   65:ldc1            #45  <Int 0x7f0f07b6>
			//   25   67:invokevirtual   #44  <Method String RobotCleanActivity.getString(int)>
			//   26   70:astore_3        
					break;
				}
				Object obj1 = ((Object) (a.getString(0x7f0f073f)));
			//   27   71:aload_0         
			//   28   72:getfield        #17  <Field RobotCleanActivity a>
			//   29   75:ldc1            #46  <Int 0x7f0f073f>
			//   30   77:invokevirtual   #44  <Method String RobotCleanActivity.getString(int)>
			//   31   80:astore          4
				RobotCleanActivity robotcleanactivity = a;
			//   32   82:aload_0         
			//   33   83:getfield        #17  <Field RobotCleanActivity a>
			//   34   86:astore          5
				new bd();
			//   35   88:new             #48  <Class bd>
			//   36   91:dup             
			//   37   92:invokespecial   #49  <Method void bd()>
			//   38   95:pop             
				com.irobot.home.RobotCleanActivity.a(robotcleanactivity, bd.e().a(((String) (obj))).b(((String) (obj1))).a(flag).a());
			//   39   96:aload           5
			//   40   98:invokestatic    #53  <Method com.irobot.home.fragments.bd$a bd.e()>
			//   41  101:aload_3         
			//   42  102:invokevirtual   #58  <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.a(String)>
			//   43  105:aload           4
			//   44  107:invokevirtual   #60  <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.b(String)>
			//   45  110:iload_2         
			//   46  111:invokevirtual   #63  <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.a(boolean)>
			//   47  114:invokevirtual   #66  <Method bc com.irobot.home.fragments.bd$a.a()>
			//   48  117:invokestatic    #69  <Method bc com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, bc)>
			//   49  120:pop             
				obj = ((Object) (a.getFragmentManager()));
			//   50  121:aload_0         
			//   51  122:getfield        #17  <Field RobotCleanActivity a>
			//   52  125:invokevirtual   #73  <Method FragmentManager RobotCleanActivity.getFragmentManager()>
			//   53  128:astore_3        
				obj1 = ((Object) (((FragmentManager) (obj)).beginTransaction()));
			//   54  129:aload_3         
			//   55  130:invokevirtual   #79  <Method FragmentTransaction FragmentManager.beginTransaction()>
			//   56  133:astore          4
				((FragmentTransaction) (obj1)).add(0x7f090116, ((android.app.Fragment) (RobotCleanActivity.h(a))));
			//   57  135:aload           4
			//   58  137:ldc1            #80  <Int 0x7f090116>
			//   59  139:aload_0         
			//   60  140:getfield        #17  <Field RobotCleanActivity a>
			//   61  143:invokestatic    #84  <Method bc RobotCleanActivity.h(RobotCleanActivity)>
			//   62  146:invokevirtual   #90  <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
			//   63  149:pop             
				((FragmentTransaction) (obj1)).commit();
			//   64  150:aload           4
			//   65  152:invokevirtual   #93  <Method int FragmentTransaction.commit()>
			//   66  155:pop             
				((FragmentManager) (obj)).executePendingTransactions();
			//   67  156:aload_3         
			//   68  157:invokevirtual   #97  <Method boolean FragmentManager.executePendingTransactions()>
			//   69  160:pop             
				a.g.setVisibility(8);
			//   70  161:aload_0         
			//   71  162:getfield        #17  <Field RobotCleanActivity a>
			//   72  165:getfield        #100 <Field LinearLayout RobotCleanActivity.g>
			//   73  168:bipush          8
			//   74  170:invokevirtual   #106 <Method void LinearLayout.setVisibility(int)>
			//   75  173:return          
			}

			final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #22  <Class RobotCleanActivity$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #523 <Method void RobotCleanActivity$2(RobotCleanActivity)>
	//    5    9:invokevirtual   #527 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	static int a(RobotCleanActivity robotcleanactivity, int k)
	{
		robotcleanactivity.R = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #429 <Field int R>
		return k;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static AlertDialog a(RobotCleanActivity robotcleanactivity, AlertDialog alertdialog)
	{
		robotcleanactivity.N = alertdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #159 <Field AlertDialog N>
		return alertdialog;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static bc a(RobotCleanActivity robotcleanactivity, bc bc1)
	{
		robotcleanactivity.B = bc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field bc B>
		return bc1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(CurrentConnectionState currentconnectionstate)
	{
		x.a(currentconnectionstate);
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field be x>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #533 <Method void be.a(CurrentConnectionState)>
		z.a(currentconnectionstate);
	//    4    8:aload_0         
	//    5    9:getfield        #261 <Field bk z>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #534 <Method void bk.a(CurrentConnectionState)>
		m();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #537 <Method void m()>
	//   10   20:return          
	}

	private void a(CurrentConnectionStateEvent currentconnectionstateevent)
	{
		currentconnectionstateevent = ((CurrentConnectionStateEvent) (currentconnectionstateevent.currentConnection()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #543 <Method CurrentConnectionState CurrentConnectionStateEvent.currentConnection()>
	//    2    4:astore_1        
		x.b(((CurrentConnectionState) (currentconnectionstateevent)));
	//    3    5:aload_0         
	//    4    6:getfield        #255 <Field be x>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #545 <Method void be.b(CurrentConnectionState)>
		if(((CurrentConnectionState) (currentconnectionstateevent)).equals(((Object) (CurrentConnectionState.Connecting))))
	//*   7   13:aload_1         
	//*   8   14:getstatic       #548 <Field CurrentConnectionState CurrentConnectionState.Connecting>
	//*   9   17:invokevirtual   #345 <Method boolean CurrentConnectionState.equals(Object)>
	//*  10   20:ifeq            27
			G();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #550 <Method void G()>
		if(((CurrentConnectionState) (currentconnectionstateevent)).equals(((Object) (CurrentConnectionState.Disconnected))) && G != null)
	//*  13   27:aload_1         
	//*  14   28:getstatic       #553 <Field CurrentConnectionState CurrentConnectionState.Disconnected>
	//*  15   31:invokevirtual   #345 <Method boolean CurrentConnectionState.equals(Object)>
	//*  16   34:ifeq            53
	//*  17   37:aload_0         
	//*  18   38:getfield        #555 <Field a G>
	//*  19   41:ifnull          53
		{
			a(G);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #555 <Field a G>
	//   23   49:invokespecial   #558 <Method void a(a)>
			return;
	//   24   52:return          
		}
		if(((CurrentConnectionState) (currentconnectionstateevent)).equals(((Object) (CurrentConnectionState.ConnectedRemotely))))
	//*  25   53:aload_1         
	//*  26   54:getstatic       #561 <Field CurrentConnectionState CurrentConnectionState.ConnectedRemotely>
	//*  27   57:invokevirtual   #345 <Method boolean CurrentConnectionState.equals(Object)>
	//*  28   60:ifeq            79
		{
			z.d(true);
	//   29   63:aload_0         
	//   30   64:getfield        #261 <Field bk z>
	//   31   67:iconst_1        
	//   32   68:invokevirtual   #565 <Method void bk.d(boolean)>
			a(false);
	//   33   71:aload_0         
	//   34   72:iconst_0        
	//   35   73:invokespecial   #567 <Method void a(boolean)>
		} else
	//*  36   76:goto            106
		if(((CurrentConnectionState) (currentconnectionstateevent)).equals(((Object) (CurrentConnectionState.RemoteMissing))))
	//*  37   79:aload_1         
	//*  38   80:getstatic       #362 <Field CurrentConnectionState CurrentConnectionState.RemoteMissing>
	//*  39   83:invokevirtual   #345 <Method boolean CurrentConnectionState.equals(Object)>
	//*  40   86:ifeq            106
		{
			z.d(false);
	//   41   89:aload_0         
	//   42   90:getfield        #261 <Field bk z>
	//   43   93:iconst_0        
	//   44   94:invokevirtual   #565 <Method void bk.d(boolean)>
			a(true);
	//   45   97:aload_0         
	//   46   98:iconst_1        
	//   47   99:invokespecial   #567 <Method void a(boolean)>
			D();
	//   48  102:aload_0         
	//   49  103:invokevirtual   #569 <Method void D()>
		}
		a(((CurrentConnectionState) (currentconnectionstateevent)));
	//   50  106:aload_0         
	//   51  107:aload_1         
	//   52  108:invokespecial   #570 <Method void a(CurrentConnectionState)>
	//   53  111:return          
	}

	private void a(MissionStatusAction missionstatusaction)
	{
		MissionUIServiceData missionuiservicedata = MissionUIServiceData.create();
	//    0    0:invokestatic    #576 <Method MissionUIServiceData MissionUIServiceData.create()>
	//    1    3:astore_2        
		missionuiservicedata.setMissionStatusAction(missionstatusaction);
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #579 <Method void MissionUIServiceData.setMissionStatusAction(MissionStatusAction)>
		O.sendServiceCommand(MissionUIServiceCommand.MissionAction, missionuiservicedata);
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field MissionSubsystem O>
	//    7   13:getstatic       #585 <Field MissionUIServiceCommand MissionUIServiceCommand.MissionAction>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #589 <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, MissionUIServiceData)>
	//   10   20:return          
	}

	private void a(NetworkState networkstate, NetworkState networkstate1)
	{
		String s = w;
	//    0    0:getstatic       #117 <Field String w>
	//    1    3:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #413 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #414 <Method void StringBuilder()>
	//    5   12:astore          6
		stringbuilder.append("** Remote Network State: ");
	//    6   14:aload           6
	//    7   16:ldc2            #592 <String "** Remote Network State: ">
	//    8   19:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:pop             
		stringbuilder.append(((Object) (networkstate1)));
	//   10   23:aload           6
	//   11   25:aload_2         
	//   12   26:invokevirtual   #595 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:pop             
		o.a(s, stringbuilder.toString());
	//   14   30:aload           5
	//   15   32:aload           6
	//   16   34:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   17   37:invokestatic    #600 <Method void o.a(String, String)>
		s = w;
	//   18   40:getstatic       #117 <Field String w>
	//   19   43:astore          5
		stringbuilder = new StringBuilder();
	//   20   45:new             #413 <Class StringBuilder>
	//   21   48:dup             
	//   22   49:invokespecial   #414 <Method void StringBuilder()>
	//   23   52:astore          6
		stringbuilder.append("** Local Network State: ");
	//   24   54:aload           6
	//   25   56:ldc2            #602 <String "** Local Network State: ">
	//   26   59:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   27   62:pop             
		stringbuilder.append(((Object) (networkstate)));
	//   28   63:aload           6
	//   29   65:aload_1         
	//   30   66:invokevirtual   #595 <Method StringBuilder StringBuilder.append(Object)>
	//   31   69:pop             
		o.a(s, stringbuilder.toString());
	//   32   70:aload           5
	//   33   72:aload           6
	//   34   74:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   35   77:invokestatic    #600 <Method void o.a(String, String)>
		x.a(NetworkType.Local, networkstate);
	//   36   80:aload_0         
	//   37   81:getfield        #255 <Field be x>
	//   38   84:getstatic       #608 <Field NetworkType NetworkType.Local>
	//   39   87:aload_1         
	//   40   88:invokevirtual   #611 <Method void be.a(NetworkType, NetworkState)>
		x.a(NetworkType.Remote, networkstate1);
	//   41   91:aload_0         
	//   42   92:getfield        #255 <Field be x>
	//   43   95:getstatic       #614 <Field NetworkType NetworkType.Remote>
	//   44   98:aload_2         
	//   45   99:invokevirtual   #611 <Method void be.a(NetworkType, NetworkState)>
		networkstate = ((NetworkState) (Assembler.getInstance().getNetworkUIService(j.k())));
	//   46  102:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   47  105:invokestatic    #302 <Method AssetId j.k()>
	//   48  108:invokevirtual   #316 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   49  111:astore_1        
		x.b(((AssetNetworkUIService) (networkstate)).getServiceData().getCurrentConnectionState());
	//   50  112:aload_0         
	//   51  113:getfield        #255 <Field be x>
	//   52  116:aload_1         
	//   53  117:invokevirtual   #327 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   54  120:invokevirtual   #333 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//   55  123:invokevirtual   #545 <Method void be.b(CurrentConnectionState)>
		if(networkstate1 == NetworkState.Connected)
	//*  56  126:aload_2         
	//*  57  127:getstatic       #620 <Field NetworkState NetworkState.Connected>
	//*  58  130:if_acmpne       140
			C();
	//   59  133:aload_0         
	//   60  134:invokevirtual   #622 <Method void C()>
		else
	//*  61  137:goto            151
		if(networkstate1 == NetworkState.Error)
	//*  62  140:aload_2         
	//*  63  141:getstatic       #624 <Field NetworkState NetworkState.Error>
	//*  64  144:if_acmpne       151
			D();
	//   65  147:aload_0         
	//   66  148:invokevirtual   #569 <Method void D()>
		networkstate = NetworkState.Connected;
	//   67  151:getstatic       #620 <Field NetworkState NetworkState.Connected>
	//   68  154:astore_1        
		boolean flag1 = true;
	//   69  155:iconst_1        
	//   70  156:istore          4
		boolean flag;
		if(networkstate1 != networkstate && networkstate1 != NetworkState.Connecting)
	//*  71  158:aload_2         
	//*  72  159:aload_1         
	//*  73  160:if_acmpeq       178
	//*  74  163:aload_2         
	//*  75  164:getstatic       #626 <Field NetworkState NetworkState.Connecting>
	//*  76  167:if_acmpne       173
	//*  77  170:goto            178
			flag = false;
	//   78  173:iconst_0        
	//   79  174:istore_3        
		else
	//*  80  175:goto            180
			flag = true;
	//   81  178:iconst_1        
	//   82  179:istore_3        
		if(flag)
	//*  83  180:iload_3         
	//*  84  181:ifeq            198
		{
			J = NetworkDiagnosticRoutines.None;
	//   85  184:aload_0         
	//   86  185:getstatic       #136 <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.None>
	//   87  188:putfield        #138 <Field NetworkDiagnosticRoutines J>
			K = NetworkDiagnosticState.None;
	//   88  191:aload_0         
	//   89  192:getstatic       #142 <Field NetworkDiagnosticState NetworkDiagnosticState.None>
	//   90  195:putfield        #144 <Field NetworkDiagnosticState K>
		}
		if(networkstate1 != NetworkState.Connecting)
	//*  91  198:aload_2         
	//*  92  199:getstatic       #626 <Field NetworkState NetworkState.Connecting>
	//*  93  202:if_acmpeq       209
			I();
	//   94  205:aload_0         
	//   95  206:invokevirtual   #628 <Method void I()>
		if(networkstate1 == NetworkState.Connected && l)
	//*  96  209:aload_2         
	//*  97  210:getstatic       #620 <Field NetworkState NetworkState.Connected>
	//*  98  213:if_acmpne       235
	//*  99  216:aload_0         
	//* 100  217:getfield        #631 <Field boolean l>
	//* 101  220:ifeq            235
		{
			s();
	//  102  223:aload_0         
	//  103  224:invokevirtual   #634 <Method void s()>
			l = false;
	//  104  227:aload_0         
	//  105  228:iconst_0        
	//  106  229:putfield        #631 <Field boolean l>
		} else
	//* 107  232:goto            254
		if(networkstate1 == NetworkState.Disconnected && !l)
	//* 108  235:aload_2         
	//* 109  236:getstatic       #636 <Field NetworkState NetworkState.Disconnected>
	//* 110  239:if_acmpne       254
	//* 111  242:aload_0         
	//* 112  243:getfield        #631 <Field boolean l>
	//* 113  246:ifne            254
			l = true;
	//  114  249:aload_0         
	//  115  250:iconst_1        
	//  116  251:putfield        #631 <Field boolean l>
		if(K == NetworkDiagnosticState.InProgress || flag)
	//* 117  254:aload_0         
	//* 118  255:getfield        #144 <Field NetworkDiagnosticState K>
	//* 119  258:getstatic       #639 <Field NetworkDiagnosticState NetworkDiagnosticState.InProgress>
	//* 120  261:if_acmpeq       271
	//* 121  264:iload_3         
	//* 122  265:ifne            271
	//* 123  268:goto            274
			flag1 = false;
	//  124  271:iconst_0        
	//  125  272:istore          4
		a(flag1);
	//  126  274:aload_0         
	//  127  275:iload           4
	//  128  277:invokespecial   #567 <Method void a(boolean)>
	//  129  280:return          
	}

	static void a(RobotCleanActivity robotcleanactivity)
	{
		robotcleanactivity.Q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #641 <Method void Q()>
	//    2    4:return          
	}

	static void a(RobotCleanActivity robotcleanactivity, CurrentConnectionStateEvent currentconnectionstateevent)
	{
		robotcleanactivity.a(currentconnectionstateevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #644 <Method void a(CurrentConnectionStateEvent)>
	//    3    5:return          
	}

	static void a(RobotCleanActivity robotcleanactivity, MissionStatusAction missionstatusaction)
	{
		robotcleanactivity.a(missionstatusaction);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #647 <Method void a(MissionStatusAction)>
	//    3    5:return          
	}

	static void a(RobotCleanActivity robotcleanactivity, NetworkState networkstate, NetworkState networkstate1)
	{
		robotcleanactivity.a(networkstate, networkstate1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #650 <Method void a(NetworkState, NetworkState)>
	//    4    6:return          
	}

	private void a(com.irobot.home.model.a a1)
	{
		if(a1 != null && AssetCapabilityUtils.isNonCloudCapableMoppingRobot(a1.a()))
	//*   0    0:aload_1         
	//*   1    1:ifnull          51
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #401 <Method AssetInfo a.a()>
	//*   4    8:invokestatic    #656 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*   5   11:ifeq            51
		{
			a.h().a(a1.b().getId());
	//    6   14:aload_0         
	//    7   15:getfield        #659 <Field IRobotApplication a>
	//    8   18:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #230 <Method AssetId a.b()>
	//   11   25:invokevirtual   #235 <Method String AssetId.getId()>
	//   12   28:invokevirtual   #669 <Method void IRobotModel.a(String)>
			a.a(a1);
	//   13   31:aload_0         
	//   14   32:getfield        #659 <Field IRobotApplication a>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #670 <Method void com.irobot.home.IRobotApplication.a(a)>
			com.irobot.home.BraavaCleanActivity_.a(((Context) (this))).a();
	//   17   39:aload_0         
	//   18   40:invokestatic    #675 <Method BraavaCleanActivity_$a com.irobot.home.BraavaCleanActivity_.a(Context)>
	//   19   43:invokevirtual   #678 <Method org.androidannotations.api.a.e com.irobot.home.BraavaCleanActivity_$a.a()>
	//   20   46:pop             
			finish();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #452 <Method void finish()>
		}
	//   23   51:return          
	}

	private void a(boolean flag)
	{
		x.e(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field be x>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #681 <Method void be.e(boolean)>
		m();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #537 <Method void m()>
		L();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #683 <Method void L()>
	//    8   16:return          
	}

	static boolean a(RobotCleanActivity robotcleanactivity, boolean flag)
	{
		robotcleanactivity.S = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #443 <Field boolean S>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void b(RobotCleanActivity robotcleanactivity)
	{
		robotcleanactivity.R();
	//    0    0:aload_0         
	//    1    1:invokespecial   #686 <Method void R()>
	//    2    4:return          
	}

	static void b(RobotCleanActivity robotcleanactivity, boolean flag)
	{
		robotcleanactivity.b(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #689 <Method void b(boolean)>
	//    3    5:return          
	}

	private void b(boolean flag)
	{
		FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//    2    4:invokevirtual   #196 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    3    7:astore_2        
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            48
		{
			x.F();
	//    6   12:aload_0         
	//    7   13:getfield        #255 <Field be x>
	//    8   16:invokevirtual   #691 <Method void be.F()>
			if(z.isHidden())
	//*   9   19:aload_0         
	//*  10   20:getfield        #261 <Field bk z>
	//*  11   23:invokevirtual   #694 <Method boolean bk.isHidden()>
	//*  12   26:ifeq            81
			{
				fragmenttransaction.show(((android.app.Fragment) (z)));
	//   13   29:aload_2         
	//   14   30:aload_0         
	//   15   31:getfield        #261 <Field bk z>
	//   16   34:invokevirtual   #696 <Method FragmentTransaction FragmentTransaction.show(android.app.Fragment)>
	//   17   37:pop             
				z.e();
	//   18   38:aload_0         
	//   19   39:getfield        #261 <Field bk z>
	//   20   42:invokevirtual   #698 <Method void bk.e()>
			}
		} else
	//*  21   45:goto            81
		{
			x.E();
	//   22   48:aload_0         
	//   23   49:getfield        #255 <Field be x>
	//   24   52:invokevirtual   #700 <Method void be.E()>
			if(!z.isHidden())
	//*  25   55:aload_0         
	//*  26   56:getfield        #261 <Field bk z>
	//*  27   59:invokevirtual   #694 <Method boolean bk.isHidden()>
	//*  28   62:ifne            81
			{
				fragmenttransaction.hide(((android.app.Fragment) (z)));
	//   29   65:aload_2         
	//   30   66:aload_0         
	//   31   67:getfield        #261 <Field bk z>
	//   32   70:invokevirtual   #271 <Method FragmentTransaction FragmentTransaction.hide(android.app.Fragment)>
	//   33   73:pop             
				z.f();
	//   34   74:aload_0         
	//   35   75:getfield        #261 <Field bk z>
	//   36   78:invokevirtual   #703 <Method void bk.f()>
			}
		}
		fragmenttransaction.commitAllowingStateLoss();
	//   37   81:aload_2         
	//   38   82:invokevirtual   #706 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   39   85:pop             
	//   40   86:return          
	}

	static bk c(RobotCleanActivity robotcleanactivity)
	{
		return robotcleanactivity.z;
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field bk z>
	//    2    4:areturn         
	}

	private void c(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #710 <Method boolean isFinishing()>
	//*   2    4:ifne            33
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #713 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			H = flag;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #129 <Field boolean H>
			runOnUiThread(new Runnable(flag) {

				public void run()
				{
					if(RobotCleanActivity.f(b) != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field RobotCleanActivity b>
				//*   2    4:invokestatic    #30  <Method bi RobotCleanActivity.f(RobotCleanActivity)>
				//*   3    7:ifnull          97
					{
						FragmentManager fragmentmanager = b.getFragmentManager();
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field RobotCleanActivity b>
				//    6   14:invokevirtual   #34  <Method FragmentManager RobotCleanActivity.getFragmentManager()>
				//    7   17:astore_1        
						FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
				//    8   18:aload_1         
				//    9   19:invokevirtual   #40  <Method FragmentTransaction FragmentManager.beginTransaction()>
				//   10   22:astore_2        
						if(a)
				//*  11   23:aload_0         
				//*  12   24:getfield        #21  <Field boolean a>
				//*  13   27:ifeq            56
						{
							b.g.setVisibility(4);
				//   14   30:aload_0         
				//   15   31:getfield        #19  <Field RobotCleanActivity b>
				//   16   34:getfield        #44  <Field LinearLayout RobotCleanActivity.g>
				//   17   37:iconst_4        
				//   18   38:invokevirtual   #50  <Method void LinearLayout.setVisibility(int)>
							fragmenttransaction.show(((android.app.Fragment) (RobotCleanActivity.f(b))));
				//   19   41:aload_2         
				//   20   42:aload_0         
				//   21   43:getfield        #19  <Field RobotCleanActivity b>
				//   22   46:invokestatic    #30  <Method bi RobotCleanActivity.f(RobotCleanActivity)>
				//   23   49:invokevirtual   #56  <Method FragmentTransaction FragmentTransaction.show(android.app.Fragment)>
				//   24   52:pop             
						} else
				//*  25   53:goto            87
						{
							b.g.setVisibility(0);
				//   26   56:aload_0         
				//   27   57:getfield        #19  <Field RobotCleanActivity b>
				//   28   60:getfield        #44  <Field LinearLayout RobotCleanActivity.g>
				//   29   63:iconst_0        
				//   30   64:invokevirtual   #50  <Method void LinearLayout.setVisibility(int)>
							fragmenttransaction.setCustomAnimations(0, 0x7f020003);
				//   31   67:aload_2         
				//   32   68:iconst_0        
				//   33   69:ldc1            #57  <Int 0x7f020003>
				//   34   71:invokevirtual   #61  <Method FragmentTransaction FragmentTransaction.setCustomAnimations(int, int)>
				//   35   74:pop             
							fragmenttransaction.hide(((android.app.Fragment) (RobotCleanActivity.f(b))));
				//   36   75:aload_2         
				//   37   76:aload_0         
				//   38   77:getfield        #19  <Field RobotCleanActivity b>
				//   39   80:invokestatic    #30  <Method bi RobotCleanActivity.f(RobotCleanActivity)>
				//   40   83:invokevirtual   #64  <Method FragmentTransaction FragmentTransaction.hide(android.app.Fragment)>
				//   41   86:pop             
						}
						fragmenttransaction.commit();
				//   42   87:aload_2         
				//   43   88:invokevirtual   #68  <Method int FragmentTransaction.commit()>
				//   44   91:pop             
						fragmentmanager.executePendingTransactions();
				//   45   92:aload_1         
				//   46   93:invokevirtual   #72  <Method boolean FragmentManager.executePendingTransactions()>
				//   47   96:pop             
					}
				//   48   97:return          
				}

				final boolean a;
				final RobotCleanActivity b;

			
			{
				b = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotCleanActivity b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   10   20:aload_0         
	//   11   21:new             #20  <Class RobotCleanActivity$12>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:invokespecial   #715 <Method void RobotCleanActivity$12(RobotCleanActivity, boolean)>
	//   16   30:invokevirtual   #527 <Method void runOnUiThread(Runnable)>
		}
	//   17   33:return          
	}

	static boolean c(RobotCleanActivity robotcleanactivity, boolean flag)
	{
		robotcleanactivity.T = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #717 <Field boolean T>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static be d(RobotCleanActivity robotcleanactivity)
	{
		return robotcleanactivity.x;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field be x>
	//    2    4:areturn         
	}

	private void d(String s)
	{
		IRobotModel irobotmodel = a.h();
	//    0    0:aload_0         
	//    1    1:getfield        #659 <Field IRobotApplication a>
	//    2    4:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//    3    7:astore_2        
		com.irobot.home.model.a a1 = irobotmodel.d(s);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #721 <Method a IRobotModel.d(String)>
	//    7   13:astore_3        
		String s1 = C;
	//    8   14:aload_0         
	//    9   15:getfield        #125 <Field String C>
	//   10   18:astore          4
		C = s;
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:putfield        #125 <Field String C>
		irobotmodel.a(s);
	//   14   25:aload_2         
	//   15   26:aload_1         
	//   16   27:invokevirtual   #669 <Method void IRobotModel.a(String)>
		a.a(a1);
	//   17   30:aload_0         
	//   18   31:getfield        #659 <Field IRobotApplication a>
	//   19   34:aload_3         
	//   20   35:invokevirtual   #670 <Method void com.irobot.home.IRobotApplication.a(a)>
		a(s);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #722 <Method void a(String)>
		b(false);
	//   24   43:aload_0         
	//   25   44:iconst_0        
	//   26   45:invokespecial   #689 <Method void b(boolean)>
		if(!a.e(s).a())
	//*  27   48:aload_0         
	//*  28   49:getfield        #659 <Field IRobotApplication a>
	//*  29   52:aload_1         
	//*  30   53:invokevirtual   #725 <Method com.irobot.home.i IRobotApplication.e(String)>
	//*  31   56:invokevirtual   #728 <Method boolean com.irobot.home.i.a()>
	//*  32   59:ifne            73
			r.c(s);
	//   33   62:aload_0         
	//   34   63:getfield        #731 <Field b r>
	//   35   66:aload_1         
	//   36   67:invokevirtual   #735 <Method void b.c(String)>
		else
	//*  37   70:goto            82
			r.d(s1);
	//   38   73:aload_0         
	//   39   74:getfield        #731 <Field b r>
	//   40   77:aload           4
	//   41   79:invokevirtual   #737 <Method void b.d(String)>
		T();
	//   42   82:aload_0         
	//   43   83:invokespecial   #739 <Method void T()>
	//   44   86:return          
	}

	static boolean e(RobotCleanActivity robotcleanactivity)
	{
		return robotcleanactivity.S;
	//    0    0:aload_0         
	//    1    1:getfield        #443 <Field boolean S>
	//    2    4:ireturn         
	}

	static bi f(RobotCleanActivity robotcleanactivity)
	{
		return robotcleanactivity.A;
	//    0    0:aload_0         
	//    1    1:getfield        #276 <Field bi A>
	//    2    4:areturn         
	}

	private void f(String s)
	{
		if(j.c(j.k()).h())
	//*   0    0:invokestatic    #302 <Method AssetId j.k()>
	//*   1    3:invokestatic    #306 <Method Robot j.c(AssetId)>
	//*   2    6:invokevirtual   #743 <Method boolean Robot.h()>
	//*   3    9:ifeq            19
			z.f();
	//    4   12:aload_0         
	//    5   13:getfield        #261 <Field bk z>
	//    6   16:invokevirtual   #703 <Method void bk.f()>
		r.d(C);
	//    7   19:aload_0         
	//    8   20:getfield        #731 <Field b r>
	//    9   23:aload_0         
	//   10   24:getfield        #125 <Field String C>
	//   11   27:invokevirtual   #737 <Method void b.d(String)>
		G = a.h().d(s);
	//   12   30:aload_0         
	//   13   31:aload_0         
	//   14   32:getfield        #659 <Field IRobotApplication a>
	//   15   35:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #721 <Method a IRobotModel.d(String)>
	//   18   42:putfield        #555 <Field a G>
	//   19   45:return          
	}

	static NetworkDiagnosticRoutines g(RobotCleanActivity robotcleanactivity)
	{
		return robotcleanactivity.J;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field NetworkDiagnosticRoutines J>
	//    2    4:areturn         
	}

	static bc h(RobotCleanActivity robotcleanactivity)
	{
		return robotcleanactivity.B;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field bc B>
	//    2    4:areturn         
	}

	public void A()
	{
		F = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #747 <Field boolean F>
	//    3    5:return          
	}

	void B()
	{
		Object obj = ((Object) (j.j()));
	//    0    0:invokestatic    #225 <Method a j.j()>
	//    1    3:astore_1        
		if(obj == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       22
		{
			o.e(w, "Null robot encountered in background task");
	//    4    8:getstatic       #117 <Field String w>
	//    5   11:ldc2            #749 <String "Null robot encountered in background task">
	//    6   14:invokestatic    #751 <Method void o.e(String, String)>
			O();
	//    7   17:aload_0         
	//    8   18:invokespecial   #753 <Method void O()>
			return;
	//    9   21:return          
		}
		if(!AssetCapabilityUtils.isCloudCapable(((com.irobot.home.model.a) (obj)).a()))
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #401 <Method AssetInfo a.a()>
	//*  12   26:invokestatic    #756 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  13   29:ifne            33
			return;
	//   14   32:return          
		obj = ((Object) (a.h()));
	//   15   33:aload_0         
	//   16   34:getfield        #659 <Field IRobotApplication a>
	//   17   37:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//   18   40:astore_1        
		h.a(((IRobotModel) (obj)));
	//   19   41:aload_0         
	//   20   42:getfield        #203 <Field ag h>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #759 <Method void ag.a(IRobotModel)>
		if(((IRobotModel) (obj)).b() == 0)
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #761 <Method int IRobotModel.b()>
	//*  25   53:ifne            81
		{
			h.a();
	//   26   56:aload_0         
	//   27   57:getfield        #203 <Field ag h>
	//   28   60:invokevirtual   #763 <Method void ag.a()>
			if(a.h().b() == 0)
	//*  29   63:aload_0         
	//*  30   64:getfield        #659 <Field IRobotApplication a>
	//*  31   67:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//*  32   70:invokevirtual   #761 <Method int IRobotModel.b()>
	//*  33   73:ifne            81
			{
				S();
	//   34   76:aload_0         
	//   35   77:invokespecial   #765 <Method void S()>
				return;
	//   36   80:return          
			}
		}
		if(!F)
	//*  37   81:aload_0         
	//*  38   82:getfield        #747 <Field boolean F>
	//*  39   85:ifne            95
			x.C();
	//   40   88:aload_0         
	//   41   89:getfield        #255 <Field be x>
	//   42   92:invokevirtual   #766 <Method void be.C()>
		O();
	//   43   95:aload_0         
	//   44   96:invokespecial   #753 <Method void O()>
	//   45   99:return          
	}

	protected void C()
	{
		if(U)
	//*   0    0:aload_0         
	//*   1    1:getfield        #520 <Field boolean U>
	//*   2    4:ifeq            21
		{
			Assembler.getInstance().getPushNotificationService().registerForPushNotifications();
	//    3    7:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//    4   10:invokevirtual   #770 <Method PushNotificationService Assembler.getPushNotificationService()>
	//    5   13:invokevirtual   #775 <Method void PushNotificationService.registerForPushNotifications()>
			U = false;
	//    6   16:aload_0         
	//    7   17:iconst_0        
	//    8   18:putfield        #520 <Field boolean U>
		}
	//    9   21:return          
	}

	protected void D()
	{
		NetworkManager.defaultManager().networkDiagnostics().checkInternetConnectivity();
	//    0    0:invokestatic    #781 <Method NetworkManager NetworkManager.defaultManager()>
	//    1    3:invokevirtual   #785 <Method NetworkDiagnostics NetworkManager.networkDiagnostics()>
	//    2    6:invokevirtual   #790 <Method int NetworkDiagnostics.checkInternetConnectivity()>
	//    3    9:pop             
	//    4   10:return          
	}

	public void E()
	{
		FragmentManager fragmentmanager = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//    2    4:astore_1        
		FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #196 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    5    9:astore_2        
		fragmenttransaction.hide(((android.app.Fragment) (B)));
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #123 <Field bc B>
	//    9   15:invokevirtual   #271 <Method FragmentTransaction FragmentTransaction.hide(android.app.Fragment)>
	//   10   18:pop             
		fragmenttransaction.commit();
	//   11   19:aload_2         
	//   12   20:invokevirtual   #281 <Method int FragmentTransaction.commit()>
	//   13   23:pop             
		fragmentmanager.executePendingTransactions();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #285 <Method boolean FragmentManager.executePendingTransactions()>
	//   16   28:pop             
		g.setVisibility(0);
	//   17   29:aload_0         
	//   18   30:getfield        #793 <Field LinearLayout g>
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #799 <Method void LinearLayout.setVisibility(int)>
	//   21   37:return          
	}

	protected void F()
	{
		NetworkDiagnostics networkdiagnostics = NetworkManager.defaultManager().networkDiagnostics();
	//    0    0:invokestatic    #781 <Method NetworkManager NetworkManager.defaultManager()>
	//    1    3:invokevirtual   #785 <Method NetworkDiagnostics NetworkManager.networkDiagnostics()>
	//    2    6:astore_1        
		String s = ServiceDiscovery.getInstance().getServiceDiscoveryData(j.k()).getIotServiceUrl();
	//    3    7:invokestatic    #804 <Method ServiceDiscovery ServiceDiscovery.getInstance()>
	//    4   10:invokestatic    #302 <Method AssetId j.k()>
	//    5   13:invokevirtual   #808 <Method ServiceDiscoveryData ServiceDiscovery.getServiceDiscoveryData(AssetId)>
	//    6   16:invokevirtual   #813 <Method String ServiceDiscoveryData.getIotServiceUrl()>
	//    7   19:astore_2        
		if(j.i(s))
	//*   8   20:aload_2         
	//*   9   21:invokestatic    #378 <Method boolean j.i(String)>
	//*  10   24:ifeq            32
			networkdiagnostics.setUrlForMqttPortCheck(s);
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokevirtual   #816 <Method void NetworkDiagnostics.setUrlForMqttPortCheck(String)>
		networkdiagnostics.checkMqttPort();
	//   14   32:aload_1         
	//   15   33:invokevirtual   #819 <Method int NetworkDiagnostics.checkMqttPort()>
	//   16   36:pop             
	//   17   37:return          
	}

	protected void G()
	{
		if(x.isAdded() && z.isAdded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field be x>
	//*   2    4:invokevirtual   #822 <Method boolean be.isAdded()>
	//*   3    7:ifeq            27
	//*   4   10:aload_0         
	//*   5   11:getfield        #261 <Field bk z>
	//*   6   14:invokevirtual   #823 <Method boolean bk.isAdded()>
	//*   7   17:ifeq            27
			x.D();
	//    8   20:aload_0         
	//    9   21:getfield        #255 <Field be x>
	//   10   24:invokevirtual   #824 <Method void be.D()>
		H();
	//   11   27:aload_0         
	//   12   28:invokevirtual   #826 <Method void H()>
		J();
	//   13   31:aload_0         
	//   14   32:invokevirtual   #828 <Method void J()>
	//   15   35:return          
	}

	public void H()
	{
		x.I();
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field be x>
	//    2    4:invokevirtual   #829 <Method void be.I()>
		m();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #537 <Method void m()>
	//    5   11:return          
	}

	public void I()
	{
		x.x();
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field be x>
	//    2    4:invokevirtual   #831 <Method void be.x()>
		m();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #537 <Method void m()>
		L();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #683 <Method void L()>
	//    7   15:return          
	}

	public void J()
	{
		x.w();
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field be x>
	//    2    4:invokevirtual   #833 <Method void be.w()>
		m();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #537 <Method void m()>
		L();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #683 <Method void L()>
	//    7   15:return          
	}

	protected void K()
	{
		h.a();
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field ag h>
	//    2    4:invokevirtual   #763 <Method void ag.a()>
		if(a.h().b() == 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #659 <Field IRobotApplication a>
	//*   5   11:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//*   6   14:invokevirtual   #761 <Method int IRobotModel.b()>
	//*   7   17:ifne            24
			S();
	//    8   20:aload_0         
	//    9   21:invokespecial   #765 <Method void S()>
	//   10   24:return          
	}

	protected void L()
	{
		Object obj = ((Object) (j.j()));
	//    0    0:invokestatic    #225 <Method a j.j()>
	//    1    3:astore_2        
		int k;
		if(obj != null && ((com.irobot.home.model.a) (obj)).a().isVirtual())
	//*   2    4:aload_2         
	//*   3    5:ifnull          37
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #401 <Method AssetInfo a.a()>
	//*   6   12:invokevirtual   #836 <Method boolean AssetInfo.isVirtual()>
	//*   7   15:ifeq            37
		{
			obj = ((Object) (q));
	//    8   18:aload_0         
	//    9   19:getfield        #840 <Field TextView q>
	//   10   22:astore_2        
			k = getResources().getColor(0x7f060079);
	//   11   23:aload_0         
	//   12   24:invokevirtual   #418 <Method Resources getResources()>
	//   13   27:ldc2            #841 <Int 0x7f060079>
	//   14   30:invokevirtual   #845 <Method int Resources.getColor(int)>
	//   15   33:istore_1        
		} else
	//*  16   34:goto            46
		{
			obj = ((Object) (q));
	//   17   37:aload_0         
	//   18   38:getfield        #840 <Field TextView q>
	//   19   41:astore_2        
			k = 0xff000000;
	//   20   42:ldc2            #846 <Int 0xff000000>
	//   21   45:istore_1        
		}
		((TextView) (obj)).setTextColor(k);
	//   22   46:aload_2         
	//   23   47:iload_1         
	//   24   48:invokevirtual   #851 <Method void TextView.setTextColor(int)>
	//   25   51:return          
	}

	public com.irobot.home.m.b.a M()
	{
		return V;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field com.irobot.home.m.b$a V>
	//    2    4:areturn         
	}

	public void a(OnDemandOTAStatus ondemandotastatus)
	{
		AssetId assetid = j.k();
	//    0    0:invokestatic    #302 <Method AssetId j.k()>
	//    1    3:astore_2        
		OnDemandOTAPathType ondemandotapathtype = Assembler.getInstance().getUpdateUIService(assetid).getOnDemandOTAFlagState();
	//    2    4:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #857 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//    5   11:invokevirtual   #863 <Method OnDemandOTAPathType UpdateUIService.getOnDemandOTAFlagState()>
	//    6   14:astore_3        
		if(ondemandotapathtype == OnDemandOTAPathType.None)
	//*   7   15:aload_3         
	//*   8   16:getstatic       #868 <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//*   9   19:if_acmpne       28
		{
			c(false);
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:invokespecial   #870 <Method void c(boolean)>
			return;
	//   13   27:return          
		}
		switch(com.irobot.home._cls4.c[ondemandotastatus.ordinal()])
	//*  14   28:getstatic       #873 <Field int[] com.irobot.home.RobotCleanActivity$4.c>
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #878 <Method int OnDemandOTAStatus.ordinal()>
	//*  17   35:iaload          
		{
	//*  18   36:tableswitch     1 3: default 64
	//	               1 70
	//	               2 70
	//	               3 70
		default:
			c(false);
	//   19   64:aload_0         
	//   20   65:iconst_0        
	//   21   66:invokespecial   #870 <Method void c(boolean)>
			return;
	//   22   69:return          

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			com.irobot.home.OnDemandOtaActivity_.a(((Context) (this))).a(assetid.getId()).a(OnDemandOTAEntryType.ViewOnDemandOTA).a(ondemandotapathtype).a(ondemandotastatus).a();
	//   23   70:aload_0         
	//   24   71:invokestatic    #883 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_.a(Context)>
	//   25   74:aload_2         
	//   26   75:invokevirtual   #235 <Method String AssetId.getId()>
	//   27   78:invokevirtual   #888 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(String)>
	//   28   81:getstatic       #894 <Field OnDemandOTAEntryType OnDemandOTAEntryType.ViewOnDemandOTA>
	//   29   84:invokevirtual   #897 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAEntryType)>
	//   30   87:aload_3         
	//   31   88:invokevirtual   #900 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAPathType)>
	//   32   91:aload_1         
	//   33   92:invokevirtual   #903 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAStatus)>
	//   34   95:invokevirtual   #904 <Method org.androidannotations.api.a.e com.irobot.home.OnDemandOtaActivity_$a.a()>
	//   35   98:pop             
			break;
		}
	//   36   99:return          
	}

	protected void a(String s, String s1)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #710 <Method boolean isFinishing()>
	//*   2    4:ifne            114
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #713 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			Robot robot = j.c(j.k());
	//    7   15:invokestatic    #302 <Method AssetId j.k()>
	//    8   18:invokestatic    #306 <Method Robot j.c(AssetId)>
	//    9   21:astore_3        
			if(robot == null)
	//*  10   22:aload_3         
	//*  11   23:ifnonnull       27
				return;
	//   12   26:return          
			N = (new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(((CharSequence) (getString(0x7f0f076a, new Object[] {
				robot.i(), s, s1
			})))).setPositiveButton(0x7f0f0346, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					com.irobot.home.DeveloperActivity_.a(((Context) (a))).a();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotCleanActivity a>
				//    2    4:invokestatic    #27  <Method DeveloperActivity_$a com.irobot.home.DeveloperActivity_.a(Context)>
				//    3    7:invokevirtual   #32  <Method org.androidannotations.api.a.e com.irobot.home.DeveloperActivity_$a.a()>
				//    4   10:pop             
				//    5   11:return          
				}

				final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setNegativeButton(0x7f0f0275, ((android.content.DialogInterface.OnClickListener) (null))).setCancelable(false).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

				public void onDismiss(DialogInterface dialoginterface)
				{
					com.irobot.home.RobotCleanActivity.a(a, ((AlertDialog) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotCleanActivity a>
				//    2    4:aconst_null     
				//    3    5:invokestatic    #25  <Method AlertDialog com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, AlertDialog)>
				//    4    8:pop             
				//    5    9:return          
				}

				final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).create();
	//   13   27:aload_0         
	//   14   28:new             #318 <Class android.app.AlertDialog$Builder>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #321 <Method void android.app.AlertDialog$Builder(Context)>
	//   18   36:aload_0         
	//   19   37:ldc2            #905 <Int 0x7f0f076a>
	//   20   40:iconst_3        
	//   21   41:anewarray       Object[]
	//   22   44:dup             
	//   23   45:iconst_0        
	//   24   46:aload_3         
	//   25   47:invokevirtual   #352 <Method String Robot.i()>
	//   26   50:aastore         
	//   27   51:dup             
	//   28   52:iconst_1        
	//   29   53:aload_1         
	//   30   54:aastore         
	//   31   55:dup             
	//   32   56:iconst_2        
	//   33   57:aload_2         
	//   34   58:aastore         
	//   35   59:invokevirtual   #355 <Method String getString(int, Object[])>
	//   36   62:invokevirtual   #367 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   37   65:ldc2            #906 <Int 0x7f0f0346>
	//   38   68:new             #18  <Class RobotCleanActivity$11>
	//   39   71:dup             
	//   40   72:aload_0         
	//   41   73:invokespecial   #907 <Method void RobotCleanActivity$11(RobotCleanActivity)>
	//   42   76:invokevirtual   #372 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   43   79:ldc2            #908 <Int 0x7f0f0275>
	//   44   82:aconst_null     
	//   45   83:invokevirtual   #911 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   46   86:iconst_0        
	//   47   87:invokevirtual   #915 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   48   90:new             #16  <Class RobotCleanActivity$10>
	//   49   93:dup             
	//   50   94:aload_0         
	//   51   95:invokespecial   #916 <Method void RobotCleanActivity$10(RobotCleanActivity)>
	//   52   98:invokevirtual   #920 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   53  101:invokevirtual   #389 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   54  104:putfield        #159 <Field AlertDialog N>
			N.show();
	//   55  107:aload_0         
	//   56  108:getfield        #159 <Field AlertDialog N>
	//   57  111:invokevirtual   #398 <Method void AlertDialog.show()>
		}
	//   58  114:return          
	}

	protected void b(String s)
	{
		super.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #922 <Method void com.irobot.home.BaseCleanActivity.b(String)>
		x.a(s);
	//    3    5:aload_0         
	//    4    6:getfield        #255 <Field be x>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #923 <Method void be.a(String)>
		z.a(s);
	//    7   13:aload_0         
	//    8   14:getfield        #261 <Field bk z>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #924 <Method void bk.a(String)>
	//   11   21:return          
	}

	public void c(String s)
	{
		if(x != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field be x>
	//*   2    4:ifnull          14
			x.z();
	//    3    7:aload_0         
	//    4    8:getfield        #255 <Field be x>
	//    5   11:invokevirtual   #926 <Method void be.z()>
		if(C == null || !C.equals(((Object) (s))))
	//*   6   14:aload_0         
	//*   7   15:getfield        #125 <Field String C>
	//*   8   18:ifnull          32
	//*   9   21:aload_0         
	//*  10   22:getfield        #125 <Field String C>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #929 <Method boolean String.equals(Object)>
	//*  13   29:ifne            74
		{
			AssetInfo assetinfo = a.h().d(s).a();
	//   14   32:aload_0         
	//   15   33:getfield        #659 <Field IRobotApplication a>
	//   16   36:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #721 <Method a IRobotModel.d(String)>
	//   19   43:invokevirtual   #401 <Method AssetInfo a.a()>
	//   20   46:astore_2        
			if(AssetCapabilityUtils.isCloudCapable(assetinfo))
	//*  21   47:aload_2         
	//*  22   48:invokestatic    #756 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  23   51:ifeq            62
				d(s);
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:invokespecial   #930 <Method void d(String)>
			else
	//*  27   59:goto            74
			if(AssetCapabilityUtils.isNonCloudCapableMoppingRobot(assetinfo))
	//*  28   62:aload_2         
	//*  29   63:invokestatic    #656 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*  30   66:ifeq            74
				f(s);
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:invokespecial   #932 <Method void f(String)>
		}
		o();
	//   34   74:aload_0         
	//   35   75:invokevirtual   #935 <Method boolean o()>
	//   36   78:pop             
	//   37   79:return          
	}

	public void e()
	{
		super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #936 <Method void BaseCleanActivity.e()>
		AssetId assetid = j.j().a().getAssetId();
	//    2    4:invokestatic    #225 <Method a j.j()>
	//    3    7:invokevirtual   #401 <Method AssetInfo a.a()>
	//    4   10:invokevirtual   #477 <Method AssetId AssetInfo.getAssetId()>
	//    5   13:astore_2        
		P = Assembler.getInstance().getNetworkUIService(assetid);
	//    6   14:aload_0         
	//    7   15:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #316 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   10   22:putfield        #163 <Field AssetNetworkUIService P>
		O = Assembler.getInstance().getMissionSubsystem(assetid);
	//   11   25:aload_0         
	//   12   26:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #481 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   15   33:putfield        #161 <Field MissionSubsystem O>
		C = assetid.getId();
	//   16   36:aload_0         
	//   17   37:aload_2         
	//   18   38:invokevirtual   #235 <Method String AssetId.getId()>
	//   19   41:putfield        #125 <Field String C>
		c.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   20   44:aload_0         
	//   21   45:getfield        #939 <Field View c>
	//   22   48:new             #34  <Class RobotCleanActivity$8>
	//   23   51:dup             
	//   24   52:aload_0         
	//   25   53:invokespecial   #940 <Method void RobotCleanActivity$8(RobotCleanActivity)>
	//   26   56:invokevirtual   #946 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		CurrentConnectionState currentconnectionstate = CurrentConnectionState.Disconnected;
	//   27   59:getstatic       #553 <Field CurrentConnectionState CurrentConnectionState.Disconnected>
	//   28   62:astore_1        
		if(P != null)
	//*  29   63:aload_0         
	//*  30   64:getfield        #163 <Field AssetNetworkUIService P>
	//*  31   67:ifnull          81
			currentconnectionstate = P.getServiceData().getCurrentConnectionState();
	//   32   70:aload_0         
	//   33   71:getfield        #163 <Field AssetNetworkUIService P>
	//   34   74:invokevirtual   #327 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   35   77:invokevirtual   #333 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//   36   80:astore_1        
		a(currentconnectionstate);
	//   37   81:aload_0         
	//   38   82:aload_1         
	//   39   83:invokespecial   #570 <Method void a(CurrentConnectionState)>
		U = Assembler.getInstance().getSettingsSubsystem(assetid).getServiceData().getAvailableSettings().contains(((Object) (SettingType.PushRegistrationToken)));
	//   40   86:aload_0         
	//   41   87:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   42   90:aload_2         
	//   43   91:invokevirtual   #496 <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//   44   94:invokevirtual   #501 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   45   97:invokevirtual   #507 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//   46  100:getstatic       #513 <Field SettingType SettingType.PushRegistrationToken>
	//   47  103:invokevirtual   #518 <Method boolean HashSet.contains(Object)>
	//   48  106:putfield        #520 <Field boolean U>
	//   49  109:return          
	}

	public void f(int k)
	{
		q.setTextColor(k);
	//    0    0:aload_0         
	//    1    1:getfield        #840 <Field TextView q>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #851 <Method void TextView.setTextColor(int)>
	//    4    8:return          
	}

	protected void onActivityResult(int k, int l, Intent intent)
	{
		if(k == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          14
		{
			o();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #935 <Method boolean o()>
	//    5    9:pop             
			K();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #950 <Method void K()>
		}
		super.onActivityResult(k, l, intent);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:aload_3         
	//   12   18:invokespecial   #952 <Method void BaseCleanActivity.onActivityResult(int, int, Intent)>
	//   13   21:return          
	}

	public void onAssetCommandTimeoutEvent(AssetCommandTimeoutEvent assetcommandtimeoutevent)
	{
		String s = w;
	//    0    0:getstatic       #117 <Field String w>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #413 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #414 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("AssetCommandTimeoutEvent received for asset ID: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #957 <String "AssetCommandTimeoutEvent received for asset ID: ">
	//    8   16:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(assetcommandtimeoutevent.assetId().getId());
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #962 <Method AssetId AssetCommandTimeoutEvent.assetId()>
	//   13   25:invokevirtual   #235 <Method String AssetId.getId()>
	//   14   28:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		o.b(s, stringbuilder.toString());
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   19   37:invokestatic    #964 <Method void o.b(String, String)>
		s = w;
	//   20   40:getstatic       #117 <Field String w>
	//   21   43:astore_2        
		stringbuilder = new StringBuilder();
	//   22   44:new             #413 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #414 <Method void StringBuilder()>
	//   25   51:astore_3        
		stringbuilder.append("** Command Type: ");
	//   26   52:aload_3         
	//   27   53:ldc2            #966 <String "** Command Type: ">
	//   28   56:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		stringbuilder.append(((Object) (assetcommandtimeoutevent.commandType())));
	//   30   60:aload_3         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #970 <Method com.irobot.core.CommandType AssetCommandTimeoutEvent.commandType()>
	//   33   65:invokevirtual   #595 <Method StringBuilder StringBuilder.append(Object)>
	//   34   68:pop             
		o.a(s, stringbuilder.toString());
	//   35   69:aload_2         
	//   36   70:aload_3         
	//   37   71:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   38   74:invokestatic    #600 <Method void o.a(String, String)>
		x.A();
	//   39   77:aload_0         
	//   40   78:getfield        #255 <Field be x>
	//   41   81:invokevirtual   #972 <Method void be.A()>
		z.b();
	//   42   84:aload_0         
	//   43   85:getfield        #261 <Field bk z>
	//   44   88:invokevirtual   #974 <Method void bk.b()>
		if(!T)
	//*  45   91:aload_0         
	//*  46   92:getfield        #717 <Field boolean T>
	//*  47   95:ifne            125
		{
			T = true;
	//   48   98:aload_0         
	//   49   99:iconst_1        
	//   50  100:putfield        #717 <Field boolean T>
			(new Handler()).postDelayed(new Runnable() {

				public void run()
				{
					com.irobot.home.RobotCleanActivity.a(a, MissionStatusAction.TimedOut);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field RobotCleanActivity a>
				//    2    4:getstatic       #28  <Field MissionStatusAction MissionStatusAction.TimedOut>
				//    3    7:invokestatic    #31  <Method void com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, MissionStatusAction)>
					RobotCleanActivity.d(a).B();
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field RobotCleanActivity a>
				//    6   14:invokestatic    #35  <Method be RobotCleanActivity.d(RobotCleanActivity)>
				//    7   17:invokevirtual   #40  <Method void be.B()>
					com.irobot.home.RobotCleanActivity.c(a, false);
				//    8   20:aload_0         
				//    9   21:getfield        #17  <Field RobotCleanActivity a>
				//   10   24:iconst_0        
				//   11   25:invokestatic    #44  <Method boolean com.irobot.home.RobotCleanActivity.c(RobotCleanActivity, boolean)>
				//   12   28:pop             
				//   13   29:return          
				}

				final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, 3000L);
	//   51  103:new             #171 <Class Handler>
	//   52  106:dup             
	//   53  107:invokespecial   #172 <Method void Handler()>
	//   54  110:new             #32  <Class RobotCleanActivity$7>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:invokespecial   #975 <Method void RobotCleanActivity$7(RobotCleanActivity)>
	//   58  118:ldc2w           #976 <Long 3000L>
	//   59  121:invokevirtual   #186 <Method boolean Handler.postDelayed(Runnable, long)>
	//   60  124:pop             
		}
	//   61  125:return          
	}

	public void onBackPressed()
	{
		if(x != null && x.isVisible() && (x instanceof com.irobot.home.n.a) && x.t())
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field be x>
	//*   2    4:ifnull          45
	//*   3    7:aload_0         
	//*   4    8:getfield        #255 <Field be x>
	//*   5   11:invokevirtual   #981 <Method boolean be.isVisible()>
	//*   6   14:ifeq            45
	//*   7   17:aload_0         
	//*   8   18:getfield        #255 <Field be x>
	//*   9   21:instanceof      #983 <Class com.irobot.home.n.a>
	//*  10   24:ifeq            45
	//*  11   27:aload_0         
	//*  12   28:getfield        #255 <Field be x>
	//*  13   31:invokevirtual   #985 <Method boolean be.t()>
	//*  14   34:ifeq            45
		{
			x.s();
	//   15   37:aload_0         
	//   16   38:getfield        #255 <Field be x>
	//   17   41:invokevirtual   #986 <Method void be.s()>
			return;
	//   18   44:return          
		} else
		{
			super.onBackPressed();
	//   19   45:aload_0         
	//   20   46:invokespecial   #988 <Method void BaseCleanActivity.onBackPressed()>
			return;
	//   21   49:return          
		}
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #992 <Method void BaseCleanActivity.onCreate(Bundle)>
		if(j.j() != null)
	//*   3    5:invokestatic    #225 <Method a j.j()>
	//*   4    8:ifnull          24
			t = j.j().a().isVirtual();
	//    5   11:aload_0         
	//    6   12:invokestatic    #225 <Method a j.j()>
	//    7   15:invokevirtual   #401 <Method AssetInfo a.a()>
	//    8   18:invokevirtual   #836 <Method boolean AssetInfo.isVirtual()>
	//    9   21:putfield        #994 <Field boolean t>
		if(bundle == null)
	//*  10   24:aload_1         
	//*  11   25:ifnonnull       35
		{
			P();
	//   12   28:aload_0         
	//   13   29:invokespecial   #996 <Method void P()>
		} else
	//*  14   32:goto            168
		{
			h = (ag)getFragmentManager().findFragmentById(0x7f090251);
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//   18   40:ldc1            #204 <Int 0x7f090251>
	//   19   42:invokevirtual   #1000 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   20   45:checkcast       #212 <Class ag>
	//   21   48:putfield        #203 <Field ag h>
			h.a(a.h());
	//   22   51:aload_0         
	//   23   52:getfield        #203 <Field ag h>
	//   24   55:aload_0         
	//   25   56:getfield        #659 <Field IRobotApplication a>
	//   26   59:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//   27   62:invokevirtual   #759 <Method void ag.a(IRobotModel)>
			h.a(t);
	//   28   65:aload_0         
	//   29   66:getfield        #203 <Field ag h>
	//   30   69:aload_0         
	//   31   70:getfield        #994 <Field boolean t>
	//   32   73:invokevirtual   #1001 <Method void ag.a(boolean)>
			h.a(((com.irobot.home.fragments.ag.a) (this)));
	//   33   76:aload_0         
	//   34   77:getfield        #203 <Field ag h>
	//   35   80:aload_0         
	//   36   81:invokevirtual   #215 <Method void ag.a(com.irobot.home.fragments.ag$a)>
			x = (be)getFragmentManager().findFragmentById(0x7f0900e4);
	//   37   84:aload_0         
	//   38   85:aload_0         
	//   39   86:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//   40   89:ldc2            #256 <Int 0x7f0900e4>
	//   41   92:invokevirtual   #1000 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   42   95:checkcast       #250 <Class be>
	//   43   98:putfield        #255 <Field be x>
			z = (bk)getFragmentManager().findFragmentById(0x7f0902f2);
	//   44  101:aload_0         
	//   45  102:aload_0         
	//   46  103:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//   47  106:ldc2            #267 <Int 0x7f0902f2>
	//   48  109:invokevirtual   #1000 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   49  112:checkcast       #263 <Class bk>
	//   50  115:putfield        #261 <Field bk z>
			A = (bi)getFragmentManager().findFragmentById(0x7f090116);
	//   51  118:aload_0         
	//   52  119:aload_0         
	//   53  120:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//   54  123:ldc2            #277 <Int 0x7f090116>
	//   55  126:invokevirtual   #1000 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   56  129:checkcast       #1003 <Class bi>
	//   57  132:putfield        #276 <Field bi A>
			B = (bc)getFragmentManager().findFragmentById(0x7f09032f);
	//   58  135:aload_0         
	//   59  136:aload_0         
	//   60  137:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//   61  140:ldc2            #1004 <Int 0x7f09032f>
	//   62  143:invokevirtual   #1000 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   63  146:checkcast       #1006 <Class bc>
	//   64  149:putfield        #123 <Field bc B>
			i = (ac)getFragmentManager().findFragmentById(0x7f0901c6);
	//   65  152:aload_0         
	//   66  153:aload_0         
	//   67  154:invokevirtual   #190 <Method FragmentManager getFragmentManager()>
	//   68  157:ldc1            #248 <Int 0x7f0901c6>
	//   69  159:invokevirtual   #1000 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   70  162:checkcast       #1008 <Class ac>
	//   71  165:putfield        #247 <Field ac i>
		}
		x.a(((com.irobot.home.fragments.be.d) (L)));
	//   72  168:aload_0         
	//   73  169:getfield        #255 <Field be x>
	//   74  172:aload_0         
	//   75  173:getfield        #149 <Field RobotCleanActivity$b L>
	//   76  176:invokevirtual   #1011 <Method void be.a(com.irobot.home.fragments.be$d)>
		x.a(((com.irobot.home.fragments.i.a) (Q)));
	//   77  179:aload_0         
	//   78  180:getfield        #255 <Field be x>
	//   79  183:aload_0         
	//   80  184:getfield        #166 <Field RobotCleanActivity$a Q>
	//   81  187:invokevirtual   #1012 <Method void be.a(com.irobot.home.fragments.i$a)>
		z.a(((com.irobot.home.fragments.i.a) (Q)));
	//   82  190:aload_0         
	//   83  191:getfield        #261 <Field bk z>
	//   84  194:aload_0         
	//   85  195:getfield        #166 <Field RobotCleanActivity$a Q>
	//   86  198:invokevirtual   #266 <Method void bk.a(com.irobot.home.fragments.i$a)>
		if(getIntent().getBooleanExtra("RobotScanIntent", false))
	//*  87  201:aload_0         
	//*  88  202:invokevirtual   #1016 <Method Intent getIntent()>
	//*  89  205:ldc2            #1018 <String "RobotScanIntent">
	//*  90  208:iconst_0        
	//*  91  209:invokevirtual   #1024 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  92  212:ifeq            219
			x();
	//   93  215:aload_0         
	//   94  216:invokevirtual   #1025 <Method void x()>
	//   95  219:return          
	}

	public void onDataDeserializationErrorEvent(DataDeserializationErrorEvent datadeserializationerrorevent)
	{
		if(x != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field be x>
	//*   2    4:ifnull          15
			x.a(datadeserializationerrorevent);
	//    3    7:aload_0         
	//    4    8:getfield        #255 <Field be x>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1029 <Method void be.a(DataDeserializationErrorEvent)>
	//    7   15:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1032 <Method void BaseCleanActivity.onDestroy()>
	//    2    4:return          
	}

	public void onDuplicateAssetStatusChangedEvent(DuplicateAssetStatusChangedEvent duplicateassetstatuschangedevent)
	{
		boolean flag1 = duplicateassetstatuschangedevent.nonUniqueAssetHealed();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1039 <Method boolean DuplicateAssetStatusChangedEvent.nonUniqueAssetHealed()>
	//    2    4:istore_3        
		boolean flag = duplicateassetstatuschangedevent.isUniqueBlid();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1042 <Method boolean DuplicateAssetStatusChangedEvent.isUniqueBlid()>
	//    5    9:istore_2        
		duplicateassetstatuschangedevent = ((DuplicateAssetStatusChangedEvent) (x));
	//    6   10:aload_0         
	//    7   11:getfield        #255 <Field be x>
	//    8   14:astore_1        
		if(flag ^ true && !flag1)
	//*   9   15:iload_2         
	//*  10   16:iconst_1        
	//*  11   17:ixor            
	//*  12   18:ifeq            30
	//*  13   21:iload_3         
	//*  14   22:ifne            30
			flag = true;
	//   15   25:iconst_1        
	//   16   26:istore_2        
		else
	//*  17   27:goto            32
			flag = false;
	//   18   30:iconst_0        
	//   19   31:istore_2        
		((be) (duplicateassetstatuschangedevent)).h(flag);
	//   20   32:aload_1         
	//   21   33:iload_2         
	//   22   34:invokevirtual   #1044 <Method void be.h(boolean)>
		if(!flag1)
	//*  23   37:iload_3         
	//*  24   38:ifne            42
		{
			return;
	//   25   41:return          
		} else
		{
			((com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus()).b(((Object) (this)), EventType.DuplicateAssetStatusChangedEvent);
	//   26   42:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   27   45:invokevirtual   #1048 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   28   48:checkcast       #1050 <Class com.irobot.home.i.a>
	//   29   51:aload_0         
	//   30   52:getstatic       #1056 <Field EventType EventType.DuplicateAssetStatusChangedEvent>
	//   31   55:invokevirtual   #1059 <Method void com.irobot.home.i.a.b(Object, EventType)>
			o.c(w, String.format("DuplicateAssetStatusChangedEvent: %s assetHealed!", new Object[] {
				C
			}));
	//   32   58:getstatic       #117 <Field String w>
	//   33   61:ldc2            #1061 <String "DuplicateAssetStatusChangedEvent: %s assetHealed!">
	//   34   64:iconst_1        
	//   35   65:anewarray       Object[]
	//   36   68:dup             
	//   37   69:iconst_0        
	//   38   70:aload_0         
	//   39   71:getfield        #125 <Field String C>
	//   40   74:aastore         
	//   41   75:invokestatic    #1065 <Method String String.format(String, Object[])>
	//   42   78:invokestatic    #1067 <Method void o.c(String, String)>
			j.b(C);
	//   43   81:aload_0         
	//   44   82:getfield        #125 <Field String C>
	//   45   85:invokestatic    #1068 <Method void j.b(String)>
			j.a(((android.app.Activity) (this)), new Intent(((Context) (this)), com/irobot/home/BugFixedActivity_));
	//   46   88:aload_0         
	//   47   89:new             #1020 <Class Intent>
	//   48   92:dup             
	//   49   93:aload_0         
	//   50   94:ldc2            #1070 <Class BugFixedActivity_>
	//   51   97:invokespecial   #1073 <Method void Intent(Context, Class)>
	//   52  100:invokestatic    #1076 <Method void j.a(android.app.Activity, Intent)>
			return;
	//   53  103:return          
		}
	}

	public void onNetworkDiagnosticEvent(NetworkDiagnosticEvent networkdiagnosticevent)
	{
		String s = w;
	//    0    0:getstatic       #117 <Field String w>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #413 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #414 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("NetworkDiagnosticEvent received: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #1080 <String "NetworkDiagnosticEvent received: ">
	//    8   16:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(((Object) (networkdiagnosticevent.routine())));
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #1086 <Method NetworkDiagnosticRoutines NetworkDiagnosticEvent.routine()>
	//   13   25:invokevirtual   #595 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
		stringbuilder.append("/");
	//   15   29:aload_3         
	//   16   30:ldc2            #1088 <String "/">
	//   17   33:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(((Object) (networkdiagnosticevent.state())));
	//   19   37:aload_3         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #1092 <Method NetworkDiagnosticState NetworkDiagnosticEvent.state()>
	//   22   42:invokevirtual   #595 <Method StringBuilder StringBuilder.append(Object)>
	//   23   45:pop             
		stringbuilder.append("/");
	//   24   46:aload_3         
	//   25   47:ldc2            #1088 <String "/">
	//   26   50:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
		stringbuilder.append(networkdiagnosticevent.progress());
	//   28   54:aload_3         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #1095 <Method String NetworkDiagnosticEvent.progress()>
	//   31   59:invokevirtual   #426 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
		o.b(s, stringbuilder.toString());
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:invokevirtual   #441 <Method String StringBuilder.toString()>
	//   36   68:invokestatic    #964 <Method void o.b(String, String)>
		J = networkdiagnosticevent.routine();
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokevirtual   #1086 <Method NetworkDiagnosticRoutines NetworkDiagnosticEvent.routine()>
	//   40   76:putfield        #138 <Field NetworkDiagnosticRoutines J>
		K = networkdiagnosticevent.state();
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:invokevirtual   #1092 <Method NetworkDiagnosticState NetworkDiagnosticEvent.state()>
	//   44   84:putfield        #144 <Field NetworkDiagnosticState K>
		if(J == NetworkDiagnosticRoutines.InternetConnectivity && K == NetworkDiagnosticState.Success)
	//*  45   87:aload_0         
	//*  46   88:getfield        #138 <Field NetworkDiagnosticRoutines J>
	//*  47   91:getstatic       #1098 <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.InternetConnectivity>
	//*  48   94:if_acmpne       111
	//*  49   97:aload_0         
	//*  50   98:getfield        #144 <Field NetworkDiagnosticState K>
	//*  51  101:getstatic       #1101 <Field NetworkDiagnosticState NetworkDiagnosticState.Success>
	//*  52  104:if_acmpne       111
			F();
	//   53  107:aload_0         
	//   54  108:invokevirtual   #1102 <Method void F()>
	//   55  111:return          
	}

	public void onPause()
	{
		android.support.v4.content.c.a(((Context) (this))).a(((BroadcastReceiver) (y)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1108 <Method c c.a(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #1110 <Field RobotCleanActivity$NewToAppReceiver y>
	//    4    8:invokevirtual   #1113 <Method void c.a(BroadcastReceiver)>
		W.removeCallbacks(X);
	//    5   11:aload_0         
	//    6   12:getfield        #174 <Field Handler W>
	//    7   15:aload_0         
	//    8   16:getfield        #177 <Field Runnable X>
	//    9   19:invokevirtual   #1116 <Method void Handler.removeCallbacks(Runnable)>
		com.irobot.home.i.a a1 = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   10   22:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   11   25:invokevirtual   #1048 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   12   28:checkcast       #1050 <Class com.irobot.home.i.a>
	//   13   31:astore_1        
		a1.b(((Object) (this)), EventType.AssetCommandTimeoutEvent);
	//   14   32:aload_1         
	//   15   33:aload_0         
	//   16   34:getstatic       #1119 <Field EventType EventType.AssetCommandTimeoutEvent>
	//   17   37:invokevirtual   #1059 <Method void com.irobot.home.i.a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.RobotBatteryLevelEvent);
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getstatic       #1122 <Field EventType EventType.RobotBatteryLevelEvent>
	//   21   45:invokevirtual   #1059 <Method void com.irobot.home.i.a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.DataDeserializationErrorEvent);
	//   22   48:aload_1         
	//   23   49:aload_0         
	//   24   50:getstatic       #1125 <Field EventType EventType.DataDeserializationErrorEvent>
	//   25   53:invokevirtual   #1059 <Method void com.irobot.home.i.a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.NetworkDiagnosticEvent);
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:getstatic       #1128 <Field EventType EventType.NetworkDiagnosticEvent>
	//   29   61:invokevirtual   #1059 <Method void com.irobot.home.i.a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.DuplicateAssetStatusChangedEvent);
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:getstatic       #1056 <Field EventType EventType.DuplicateAssetStatusChangedEvent>
	//   33   69:invokevirtual   #1059 <Method void com.irobot.home.i.a.b(Object, EventType)>
		u.b();
	//   34   72:aload_0         
	//   35   73:getfield        #152 <Field RobotCleanActivity$CleanActivityAssetGenericEventHandler u>
	//   36   76:invokevirtual   #1129 <Method void com.irobot.home.RobotCleanActivity$CleanActivityAssetGenericEventHandler.b()>
		super.onPause();
	//   37   79:aload_0         
	//   38   80:invokespecial   #1131 <Method void BaseCleanActivity.onPause()>
	//   39   83:return          
	}

	protected void onResume()
	{
label0:
		{
			boolean flag;
			boolean flag2;
			Object obj;
label1:
			{
				super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1134 <Method void BaseCleanActivity.onResume()>
				y = new NewToAppReceiver();
	//    2    4:aload_0         
	//    3    5:new             #41  <Class RobotCleanActivity$NewToAppReceiver>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #1135 <Method void RobotCleanActivity$NewToAppReceiver(RobotCleanActivity)>
	//    7   13:putfield        #1110 <Field RobotCleanActivity$NewToAppReceiver y>
				android.support.v4.content.c.a(((Context) (this))).a(((BroadcastReceiver) (y)), new IntentFilter("com.irobot.home.MODEL_CHANGED"));
	//    8   16:aload_0         
	//    9   17:invokestatic    #1108 <Method c c.a(Context)>
	//   10   20:aload_0         
	//   11   21:getfield        #1110 <Field RobotCleanActivity$NewToAppReceiver y>
	//   12   24:new             #1137 <Class IntentFilter>
	//   13   27:dup             
	//   14   28:ldc2            #1139 <String "com.irobot.home.MODEL_CHANGED">
	//   15   31:invokespecial   #1141 <Method void IntentFilter(String)>
	//   16   34:invokevirtual   #1144 <Method void c.a(BroadcastReceiver, IntentFilter)>
				if(a.h().b() == 0)
	//*  17   37:aload_0         
	//*  18   38:getfield        #659 <Field IRobotApplication a>
	//*  19   41:invokevirtual   #664 <Method IRobotModel IRobotApplication.h()>
	//*  20   44:invokevirtual   #761 <Method int IRobotModel.b()>
	//*  21   47:ifne            55
				{
					S();
	//   22   50:aload_0         
	//   23   51:invokespecial   #765 <Method void S()>
					return;
	//   24   54:return          
				}
				h.a(t);
	//   25   55:aload_0         
	//   26   56:getfield        #203 <Field ag h>
	//   27   59:aload_0         
	//   28   60:getfield        #994 <Field boolean t>
	//   29   63:invokevirtual   #1001 <Method void ag.a(boolean)>
				if(!Assembler.getInstance().getAccountService().isLoggedIn())
	//*  30   66:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//*  31   69:invokevirtual   #1148 <Method AccountService Assembler.getAccountService()>
	//*  32   72:invokevirtual   #1153 <Method boolean AccountService.isLoggedIn()>
	//*  33   75:ifne            79
					return;
	//   34   78:return          
				obj = ((Object) (j.j().a()));
	//   35   79:invokestatic    #225 <Method a j.j()>
	//   36   82:invokevirtual   #401 <Method AssetInfo a.a()>
	//   37   85:astore          4
				String s = ((AssetInfo) (obj)).getAssetId().getId();
	//   38   87:aload           4
	//   39   89:invokevirtual   #477 <Method AssetId AssetInfo.getAssetId()>
	//   40   92:invokevirtual   #235 <Method String AssetId.getId()>
	//   41   95:astore          5
				if(s != null)
	//*  42   97:aload           5
	//*  43   99:ifnull          144
				{
					if(!r.a(s) && !a.e(s).a())
	//*  44  102:aload_0         
	//*  45  103:getfield        #731 <Field b r>
	//*  46  106:aload           5
	//*  47  108:invokevirtual   #1155 <Method boolean b.a(String)>
	//*  48  111:ifne            138
	//*  49  114:aload_0         
	//*  50  115:getfield        #659 <Field IRobotApplication a>
	//*  51  118:aload           5
	//*  52  120:invokevirtual   #725 <Method com.irobot.home.i IRobotApplication.e(String)>
	//*  53  123:invokevirtual   #728 <Method boolean com.irobot.home.i.a()>
	//*  54  126:ifne            138
						r.c(s);
	//   55  129:aload_0         
	//   56  130:getfield        #731 <Field b r>
	//   57  133:aload           5
	//   58  135:invokevirtual   #735 <Method void b.c(String)>
					a(s);
	//   59  138:aload_0         
	//   60  139:aload           5
	//   61  141:invokevirtual   #722 <Method void a(String)>
				}
				if(!AssetCapabilityUtils.isAwsEnabledAsset(((AssetInfo) (obj))))
	//*  62  144:aload           4
	//*  63  146:invokestatic    #1158 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*  64  149:ifne            164
					W.post(X);
	//   65  152:aload_0         
	//   66  153:getfield        #174 <Field Handler W>
	//   67  156:aload_0         
	//   68  157:getfield        #177 <Field Runnable X>
	//   69  160:invokevirtual   #1162 <Method boolean Handler.post(Runnable)>
	//   70  163:pop             
				com.irobot.home.i.a a1 = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   71  164:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   72  167:invokevirtual   #1048 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   73  170:checkcast       #1050 <Class com.irobot.home.i.a>
	//   74  173:astore          6
				a1.a(((Object) (this)), EventType.AssetCommandTimeoutEvent);
	//   75  175:aload           6
	//   76  177:aload_0         
	//   77  178:getstatic       #1119 <Field EventType EventType.AssetCommandTimeoutEvent>
	//   78  181:invokevirtual   #1164 <Method void com.irobot.home.i.a.a(Object, EventType)>
				a1.a(((Object) (this)), EventType.RobotBatteryLevelEvent);
	//   79  184:aload           6
	//   80  186:aload_0         
	//   81  187:getstatic       #1122 <Field EventType EventType.RobotBatteryLevelEvent>
	//   82  190:invokevirtual   #1164 <Method void com.irobot.home.i.a.a(Object, EventType)>
				a1.a(((Object) (this)), EventType.DataDeserializationErrorEvent);
	//   83  193:aload           6
	//   84  195:aload_0         
	//   85  196:getstatic       #1125 <Field EventType EventType.DataDeserializationErrorEvent>
	//   86  199:invokevirtual   #1164 <Method void com.irobot.home.i.a.a(Object, EventType)>
				a1.a(((Object) (this)), EventType.NetworkDiagnosticEvent);
	//   87  202:aload           6
	//   88  204:aload_0         
	//   89  205:getstatic       #1128 <Field EventType EventType.NetworkDiagnosticEvent>
	//   90  208:invokevirtual   #1164 <Method void com.irobot.home.i.a.a(Object, EventType)>
				a1.a(((Object) (this)), EventType.DuplicateAssetStatusChangedEvent);
	//   91  211:aload           6
	//   92  213:aload_0         
	//   93  214:getstatic       #1056 <Field EventType EventType.DuplicateAssetStatusChangedEvent>
	//   94  217:invokevirtual   #1164 <Method void com.irobot.home.i.a.a(Object, EventType)>
				u.a();
	//   95  220:aload_0         
	//   96  221:getfield        #152 <Field RobotCleanActivity$CleanActivityAssetGenericEventHandler u>
	//   97  224:invokevirtual   #1165 <Method void com.irobot.home.RobotCleanActivity$CleanActivityAssetGenericEventHandler.a()>
				if(!H)
	//*  98  227:aload_0         
	//*  99  228:getfield        #129 <Field boolean H>
	//* 100  231:ifne            250
					x.b(j.j().a().getSku());
	//  101  234:aload_0         
	//  102  235:getfield        #255 <Field be x>
	//  103  238:invokestatic    #225 <Method a j.j()>
	//  104  241:invokevirtual   #401 <Method AssetInfo a.a()>
	//  105  244:invokevirtual   #1168 <Method String AssetInfo.getSku()>
	//  106  247:invokevirtual   #1169 <Method void be.b(String)>
				ServiceDiscovery.getInstance().queryDuplicateAssetStatus(AssetId.assetIdForString(s));
	//  107  250:invokestatic    #804 <Method ServiceDiscovery ServiceDiscovery.getInstance()>
	//  108  253:aload           5
	//  109  255:invokestatic    #1173 <Method AssetId AssetId.assetIdForString(String)>
	//  110  258:invokevirtual   #1177 <Method void ServiceDiscovery.queryDuplicateAssetStatus(AssetId)>
				if(I)
					break label0;
	//  111  261:aload_0         
	//  112  262:getfield        #131 <Field boolean I>
	//  113  265:ifne            374
				flag2 = true;
	//  114  268:iconst_1        
	//  115  269:istore_3        
				I = true;
	//  116  270:aload_0         
	//  117  271:iconst_1        
	//  118  272:putfield        #131 <Field boolean I>
				if(v())
	//* 119  275:aload_0         
	//* 120  276:invokevirtual   #1179 <Method boolean v()>
	//* 121  279:ifeq            315
				{
					String s1 = getIntent().getStringExtra("notificationType");
	//  122  282:aload_0         
	//  123  283:invokevirtual   #1016 <Method Intent getIntent()>
	//  124  286:ldc2            #1181 <String "notificationType">
	//  125  289:invokevirtual   #1184 <Method String Intent.getStringExtra(String)>
	//  126  292:astore          5
					if(s1 != null && s1.equals("uota"))
	//* 127  294:aload           5
	//* 128  296:ifnull          315
	//* 129  299:aload           5
	//* 130  301:ldc2            #1186 <String "uota">
	//* 131  304:invokevirtual   #929 <Method boolean String.equals(Object)>
	//* 132  307:ifeq            315
					{
						flag = true;
	//  133  310:iconst_1        
	//  134  311:istore_1        
						break label1;
	//  135  312:goto            317
					}
				}
				flag = false;
	//  136  315:iconst_0        
	//  137  316:istore_1        
			}
			obj = ((Object) (Assembler.getInstance().getUpdateUIService(((AssetInfo) (obj)).getAssetId())));
	//  138  317:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//  139  320:aload           4
	//  140  322:invokevirtual   #477 <Method AssetId AssetInfo.getAssetId()>
	//  141  325:invokevirtual   #857 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//  142  328:astore          4
			if(obj != null)
	//* 143  330:aload           4
	//* 144  332:ifnull          365
			{
				boolean flag1 = flag2;
	//  145  335:iload_3         
	//  146  336:istore_2        
				if(((UpdateUIService) (obj)).getOnDemandOTAFlagState() == OnDemandOTAPathType.None)
	//* 147  337:aload           4
	//* 148  339:invokevirtual   #863 <Method OnDemandOTAPathType UpdateUIService.getOnDemandOTAFlagState()>
	//* 149  342:getstatic       #868 <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//* 150  345:if_acmpne       359
					if(flag)
	//* 151  348:iload_1         
	//* 152  349:ifeq            357
						flag1 = flag2;
	//  153  352:iload_3         
	//  154  353:istore_2        
					else
	//* 155  354:goto            359
						flag1 = false;
	//  156  357:iconst_0        
	//  157  358:istore_2        
				c(flag1);
	//  158  359:aload_0         
	//  159  360:iload_2         
	//  160  361:invokespecial   #870 <Method void c(boolean)>
				return;
	//  161  364:return          
			}
			o.e(w, "init: UpdateSubsystem is null");
	//  162  365:getstatic       #117 <Field String w>
	//  163  368:ldc2            #1188 <String "init: UpdateSubsystem is null">
	//  164  371:invokestatic    #751 <Method void o.e(String, String)>
		}
	//  165  374:return          
	}

	public void onRobotBatteryLevelEvent(RobotBatteryLevelEvent robotbatterylevelevent)
	{
		if(robotbatterylevelevent.assetId().equals(j.k()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1193 <Method AssetId RobotBatteryLevelEvent.assetId()>
	//*   2    4:invokestatic    #302 <Method AssetId j.k()>
	//*   3    7:invokevirtual   #1196 <Method boolean AssetId.equals(AssetId)>
	//*   4   10:ifeq            25
		{
			R = ((int) (robotbatterylevelevent.currentBatteryLevel()));
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokevirtual   #1200 <Method short RobotBatteryLevelEvent.currentBatteryLevel()>
	//    8   18:putfield        #429 <Field int R>
			R();
	//    9   21:aload_0         
	//   10   22:invokespecial   #686 <Method void R()>
		}
	//   11   25:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1203 <Method void BaseCleanActivity.onStart()>
		AssetId assetid = j.k();
	//    2    4:invokestatic    #302 <Method AssetId j.k()>
	//    3    7:astore_1        
		P = Assembler.getInstance().getNetworkUIService(assetid);
	//    4    8:aload_0         
	//    5    9:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #316 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//    8   16:putfield        #163 <Field AssetNetworkUIService P>
		if(P != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #163 <Field AssetNetworkUIService P>
	//*  11   23:ifnull          38
			P.registerUISubscriber(v);
	//   12   26:aload_0         
	//   13   27:getfield        #163 <Field AssetNetworkUIService P>
	//   14   30:aload_0         
	//   15   31:getfield        #180 <Field AssetNetworkUIServiceDataCallback v>
	//   16   34:invokevirtual   #489 <Method boolean AssetNetworkUIService.registerUISubscriber(AssetNetworkUIServiceDataCallback)>
	//   17   37:pop             
		O = Assembler.getInstance().getMissionSubsystem(assetid);
	//   18   38:aload_0         
	//   19   39:invokestatic    #312 <Method Assembler Assembler.getInstance()>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #481 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   22   46:putfield        #161 <Field MissionSubsystem O>
		if(O != null)
	//*  23   49:aload_0         
	//*  24   50:getfield        #161 <Field MissionSubsystem O>
	//*  25   53:ifnull          68
			O.registerUISubscriber(((MissionUIServiceDataCallback) (Q)));
	//   26   56:aload_0         
	//   27   57:getfield        #161 <Field MissionSubsystem O>
	//   28   60:aload_0         
	//   29   61:getfield        #166 <Field RobotCleanActivity$a Q>
	//   30   64:invokevirtual   #484 <Method boolean MissionSubsystem.registerUISubscriber(MissionUIServiceDataCallback)>
	//   31   67:pop             
	//   32   68:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1206 <Method void BaseCleanActivity.onStop()>
		if(O != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #161 <Field MissionSubsystem O>
	//*   4    8:ifnull          23
			O.unregisterSubscriber(((MissionUIServiceDataCallback) (Q)));
	//    5   11:aload_0         
	//    6   12:getfield        #161 <Field MissionSubsystem O>
	//    7   15:aload_0         
	//    8   16:getfield        #166 <Field RobotCleanActivity$a Q>
	//    9   19:invokevirtual   #472 <Method boolean MissionSubsystem.unregisterSubscriber(MissionUIServiceDataCallback)>
	//   10   22:pop             
		if(P != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #163 <Field AssetNetworkUIService P>
	//*  13   27:ifnull          42
			P.unregisterSubscriber(v);
	//   14   30:aload_0         
	//   15   31:getfield        #163 <Field AssetNetworkUIService P>
	//   16   34:aload_0         
	//   17   35:getfield        #180 <Field AssetNetworkUIServiceDataCallback v>
	//   18   38:invokevirtual   #487 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//   19   41:pop             
	//   20   42:return          
	}

	public void x()
	{
		InterruptedException interruptedexception;
		AssetId assetid = j.k();
	//    0    0:invokestatic    #302 <Method AssetId j.k()>
	//    1    3:astore_1        
		if(assetid != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          66
		{
			F = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #747 <Field boolean F>
			G();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #550 <Method void G()>
			j.a(assetid.getId(), false);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #235 <Method String AssetId.getId()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #1211 <Method void j.a(String, boolean)>
			try
			{
				Thread.sleep(5000L);
	//   13   25:ldc2w           #1212 <Long 5000L>
	//   14   28:invokestatic    #1219 <Method void Thread.sleep(long)>
			}
	//*  15   31:goto            43
	//*  16   34:getstatic       #117 <Field String w>
	//*  17   37:ldc2            #1221 <String "Delay before robot scan interrupted.">
	//*  18   40:invokestatic    #751 <Method void o.e(String, String)>
	//*  19   43:aload_0         
	//*  20   44:new             #1223 <Class i>
	//*  21   47:dup             
	//*  22   48:aload_0         
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #235 <Method String AssetId.getId()>
	//*  25   53:invokespecial   #1226 <Method void i(com.irobot.home.h.i$a, String)>
	//*  26   56:putfield        #1228 <Field i E>
	//*  27   59:aload_0         
	//*  28   60:getfield        #1228 <Field i E>
	//*  29   63:invokevirtual   #1229 <Method void i.a()>
	//*  30   66:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				o.e(w, "Delay before robot scan interrupted.");
			}
			E = new i(((com.irobot.home.h.i.a) (this)), assetid.getId());
			E.a();
		}
	//*  31   67:astore_2        
	//*  32   68:goto            34
	}

	public void y()
	{
		r.d(C);
	//    0    0:aload_0         
	//    1    1:getfield        #731 <Field b r>
	//    2    4:aload_0         
	//    3    5:getfield        #125 <Field String C>
	//    4    8:invokevirtual   #737 <Method void b.d(String)>
	//    5   11:return          
	}

	public void z()
	{
		F = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #747 <Field boolean F>
	//    3    5:return          
	}

	private static final String w = j.r(((Class) (com/irobot/home/RobotCleanActivity)).getSimpleName());
	private bi A;
	private bc B;
	private String C;
	private boolean D;
	private i E;
	private boolean F;
	private com.irobot.home.model.a G;
	private boolean H;
	private boolean I;
	private NetworkDiagnosticRoutines J;
	private NetworkDiagnosticState K;
	private final b L = new b();
	private BroadcastReceiver M;
	private AlertDialog N;
	private MissionSubsystem O;
	private AssetNetworkUIService P;
	private a Q;
	private volatile int R;
	private volatile boolean S;
	private volatile boolean T;
	private boolean U;
	private com.irobot.home.m.b.a V;
	private final Handler W = new Handler();
	private final Runnable X = new Runnable() {

		public void run()
		{
			a.B();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field RobotCleanActivity a>
		//    2    4:invokevirtual   #22  <Method void RobotCleanActivity.B()>
		//    3    7:return          
		}

		final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	boolean t;
	CleanActivityAssetGenericEventHandler u;
	final AssetNetworkUIServiceDataCallback v = new AssetNetworkUIServiceDataCallback() {

		public void onAssetNetworkUIServiceDataChanged(AssetNetworkUIServiceData assetnetworkuiservicedata)
		{
			if(assetnetworkuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			Iterator iterator = assetnetworkuiservicedata.getDataStateChangelist().iterator();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #24  <Method ArrayList AssetNetworkUIServiceData.getDataStateChangelist()>
		//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
		//    6   12:astore_2        
label0:
			do
			{
				if(iterator.hasNext())
		//*   7   13:aload_2         
		//*   8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//*   9   19:ifeq            85
				{
					AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Object Iterator.next()>
		//   12   28:checkcast       #42  <Class AssetNetworkUIServiceDataState>
		//   13   31:astore_3        
					switch(_cls4.d[assetnetworkuiservicedatastate.ordinal()])
		//*  14   32:getstatic       #48  <Field int[] RobotCleanActivity$4.d>
		//*  15   35:aload_3         
		//*  16   36:invokevirtual   #52  <Method int AssetNetworkUIServiceDataState.ordinal()>
		//*  17   39:iaload          
					{
		//*  18   40:tableswitch     1 2: default 64
		//		               1 67
		//		               2 67
		//*  19   64:goto            13
					case 1: // '\001'
					case 2: // '\002'
						com.irobot.home.RobotCleanActivity.a(a, assetnetworkuiservicedata.getConnectionStateForLocal(), assetnetworkuiservicedata.getConnectionStateForRemote());
		//   20   67:aload_0         
		//   21   68:getfield        #12  <Field RobotCleanActivity a>
		//   22   71:aload_1         
		//   23   72:invokevirtual   #56  <Method NetworkState AssetNetworkUIServiceData.getConnectionStateForLocal()>
		//   24   75:aload_1         
		//   25   76:invokevirtual   #59  <Method NetworkState AssetNetworkUIServiceData.getConnectionStateForRemote()>
		//   26   79:invokestatic    #62  <Method void com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, NetworkState, NetworkState)>
						break;
					}
					continue;
		//   27   82:goto            13
				}
				iterator = assetnetworkuiservicedata.getViewStateChangelist().iterator();
		//   28   85:aload_1         
		//   29   86:invokevirtual   #65  <Method ArrayList AssetNetworkUIServiceData.getViewStateChangelist()>
		//   30   89:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
		//   31   92:astore_2        
				do
				{
					AssetNetworkUIServiceViewState assetnetworkuiserviceviewstate;
					do
					{
						if(!iterator.hasNext())
							break label0;
		//   32   93:aload_2         
		//   33   94:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//   34   99:ifeq            141
						assetnetworkuiserviceviewstate = (AssetNetworkUIServiceViewState)iterator.next();
		//   35  102:aload_2         
		//   36  103:invokeinterface #40  <Method Object Iterator.next()>
		//   37  108:checkcast       #67  <Class AssetNetworkUIServiceViewState>
		//   38  111:astore_3        
					} while(_cls4.e[assetnetworkuiserviceviewstate.ordinal()] != 1);
		//   39  112:getstatic       #70  <Field int[] RobotCleanActivity$4.e>
		//   40  115:aload_3         
		//   41  116:invokevirtual   #71  <Method int AssetNetworkUIServiceViewState.ordinal()>
		//   42  119:iaload          
		//   43  120:iconst_1        
		//   44  121:icmpeq          127
		//*  45  124:goto            93
					com.irobot.home.RobotCleanActivity.a(a, assetnetworkuiservicedata.getCurrentConnectionEvent());
		//   46  127:aload_0         
		//   47  128:getfield        #12  <Field RobotCleanActivity a>
		//   48  131:aload_1         
		//   49  132:invokevirtual   #75  <Method CurrentConnectionStateEvent AssetNetworkUIServiceData.getCurrentConnectionEvent()>
		//   50  135:invokestatic    #78  <Method void com.irobot.home.RobotCleanActivity.a(RobotCleanActivity, CurrentConnectionStateEvent)>
				} while(true);
		//   51  138:goto            93
			} while(true);
		//   52  141:return          
		}

		final RobotCleanActivity a;

			
			{
				a = RobotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field RobotCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;
	private be x;
	private NewToAppReceiver y;
	private bk z;

	static 
	{
	//    0    0:ldc1            #2   <Class RobotCleanActivity>
	//    1    2:invokevirtual   #109 <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #115 <Method String j.r(String)>
	//    3    8:putstatic       #117 <Field String w>
	//*   4   11:return          
	}
}
