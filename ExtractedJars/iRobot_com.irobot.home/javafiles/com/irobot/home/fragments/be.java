// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.irobot.core.BooleanValueType;
import com.irobot.core.CurrentConnectionState;
import com.irobot.core.DataDeserializationErrorEvent;
import com.irobot.core.Error;
import com.irobot.core.EvacuationDockMode;
import com.irobot.core.FloorPlanListItemMode;
import com.irobot.core.MapsDataState;
import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;
import com.irobot.core.MapsUIServiceData;
import com.irobot.core.MapsUIServiceDataCallback;
import com.irobot.core.MapsViewState;
import com.irobot.core.MissionDataState;
import com.irobot.core.MissionStatusAction;
import com.irobot.core.MissionSubsystem;
import com.irobot.core.MissionUIServiceCommand;
import com.irobot.core.MissionUIServiceData;
import com.irobot.core.MissionUIServiceDataCallback;
import com.irobot.core.NetworkSessionType;
import com.irobot.core.NetworkState;
import com.irobot.core.NetworkType;
import com.irobot.core.OTAUIServiceData;
import com.irobot.core.OTAUIServiceDataCallback;
import com.irobot.core.OTAUIServiceDataState;
import com.irobot.core.PersistenceHandler;
import com.irobot.core.ResolvedMissionStatus;
import com.irobot.core.ScheduleTypeSupported;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.SettingsUIServiceDataCallback;
import com.irobot.core.SkuType;
import com.irobot.core.SkuUtils;
import com.irobot.core.SoftwareUpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.AboutRobotTableViewActivity_;
import com.irobot.home.AboutSmartMapsActivity_;
import com.irobot.home.ChooseRegionsToCleanActivity_;
import com.irobot.home.FloorPlanActivity_;
import com.irobot.home.GoToMapPrivacyActivity_;
import com.irobot.home.HistoryActivity_;
import com.irobot.home.MapGettingStartedActivity_;
import com.irobot.home.MoreTableViewActivity_;
import com.irobot.home.PartsDetailListActivity_;
import com.irobot.home.PersistentScheduleActivity_;
import com.irobot.home.RobotCleanActivity;
import com.irobot.home.RobotCleaningPreferencesActivity_;
import com.irobot.home.SanMarinoCareMaintenanceActivity_;
import com.irobot.home.ScheduleTableViewActivity_;
import com.irobot.home.WebViewActivity_;
import com.irobot.home.m.b;
import com.irobot.home.model.OtaUpgradeStatus;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotPreferences;
import com.irobot.home.model.rest.CommonQuestion;
import com.irobot.home.model.rest.CommonQuestionList;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.model.w;
import com.irobot.home.n.a;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.view.BatteryGaugeView;
import com.irobot.home.view.CircleButton;
import com.irobot.home.view.CircleRippleButton;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomSquaredImageButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.HideableView;
import com.irobot.home.view.PercentageRingView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.androidannotations.api.b.f;
import org.androidannotations.api.b.g;

// Referenced classes of package com.irobot.home.fragments:
//			i, bf

public class be extends i
	implements com.irobot.home.n.a
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
			StringBuilder stringbuilder = new StringBuilder();
		//    6   10:new             #29  <Class StringBuilder>
		//    7   13:dup             
		//    8   14:invokespecial   #30  <Method void StringBuilder()>
		//    9   17:astore          4
			stringbuilder.append("Change list: ");
		//   10   19:aload           4
		//   11   21:ldc1            #32  <String "Change list: ">
		//   12   23:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   14   27:aload           4
		//   15   29:aload_3         
		//   16   30:invokevirtual   #42  <Method String ArrayList.toString()>
		//   17   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
			com.irobot.home.util.o.b("RobotCleanFragment", stringbuilder.toString());
		//   19   37:ldc1            #44  <String "RobotCleanFragment">
		//   20   39:aload           4
		//   21   41:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   22   44:invokestatic    #51  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   23   47:aload_3         
		//   24   48:invokevirtual   #55  <Method Iterator ArrayList.iterator()>
		//   25   51:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   26   52:aload_3         
		//   27   53:invokeinterface #61  <Method boolean Iterator.hasNext()>
		//   28   58:ifeq            139
				OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
		//   29   61:aload_3         
		//   30   62:invokeinterface #65  <Method Object Iterator.next()>
		//   31   67:checkcast       #67  <Class OTAUIServiceDataState>
		//   32   70:astore          4
				static class _cls5
				{

					static final int a[];
					static final int b[];
					static final int c[];
					static final int d[];
					static final int e[];
					static final int f[];
					static final int g[];
					static final int h[];
					static final int i[];
					static final int j[];
					static final int k[];

					static 
					{
						k = new int[SettingType.values().length];
					//    0    0:invokestatic    #28  <Method SettingType[] SettingType.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #30  <Field int[] k>
						try
						{
							k[SettingType.Schedule.ordinal()] = 1;
					//    4    9:getstatic       #30  <Field int[] k>
					//    5   12:getstatic       #34  <Field SettingType SettingType.Schedule>
					//    6   15:invokevirtual   #38  <Method int SettingType.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #30  <Field int[] k>
					//*  10   23:getstatic       #41  <Field SettingType SettingType.MapUploadAllowed>
					//*  11   26:invokevirtual   #38  <Method int SettingType.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #30  <Field int[] k>
					//*  15   34:getstatic       #44  <Field SettingType SettingType.PMapLearningAllowed>
					//*  16   37:invokevirtual   #38  <Method int SettingType.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:invokestatic    #49  <Method MapsDataState[] MapsDataState.values()>
					//*  20   45:arraylength     
					//*  21   46:newarray        int[]
					//*  22   48:putstatic       #51  <Field int[] j>
					//*  23   51:getstatic       #51  <Field int[] j>
					//*  24   54:getstatic       #55  <Field MapsDataState MapsDataState.MapReadyForSetUp>
					//*  25   57:invokevirtual   #56  <Method int MapsDataState.ordinal()>
					//*  26   60:iconst_1        
					//*  27   61:iastore         
					//*  28   62:invokestatic    #61  <Method MapsViewState[] MapsViewState.values()>
					//*  29   65:arraylength     
					//*  30   66:newarray        int[]
					//*  31   68:putstatic       #63  <Field int[] i>
					//*  32   71:getstatic       #63  <Field int[] i>
					//*  33   74:getstatic       #67  <Field MapsViewState MapsViewState.FloorPlanListItem>
					//*  34   77:invokevirtual   #68  <Method int MapsViewState.ordinal()>
					//*  35   80:iconst_1        
					//*  36   81:iastore         
					//*  37   82:getstatic       #63  <Field int[] i>
					//*  38   85:getstatic       #71  <Field MapsViewState MapsViewState.FloorPlanBooleanValue>
					//*  39   88:invokevirtual   #68  <Method int MapsViewState.ordinal()>
					//*  40   91:iconst_2        
					//*  41   92:iastore         
					//*  42   93:getstatic       #63  <Field int[] i>
					//*  43   96:getstatic       #74  <Field MapsViewState MapsViewState.FloorPlanItemNotFound>
					//*  44   99:invokevirtual   #68  <Method int MapsViewState.ordinal()>
					//*  45  102:iconst_3        
					//*  46  103:iastore         
					//*  47  104:invokestatic    #79  <Method EvacuationDockMode[] EvacuationDockMode.values()>
					//*  48  107:arraylength     
					//*  49  108:newarray        int[]
					//*  50  110:putstatic       #81  <Field int[] h>
					//*  51  113:getstatic       #81  <Field int[] h>
					//*  52  116:getstatic       #85  <Field EvacuationDockMode EvacuationDockMode.Invalid>
					//*  53  119:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  54  122:iconst_1        
					//*  55  123:iastore         
					//*  56  124:getstatic       #81  <Field int[] h>
					//*  57  127:getstatic       #89  <Field EvacuationDockMode EvacuationDockMode.Ready>
					//*  58  130:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  59  133:iconst_2        
					//*  60  134:iastore         
					//*  61  135:getstatic       #81  <Field int[] h>
					//*  62  138:getstatic       #92  <Field EvacuationDockMode EvacuationDockMode.EvacuationStarting>
					//*  63  141:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  64  144:iconst_3        
					//*  65  145:iastore         
					//*  66  146:getstatic       #81  <Field int[] h>
					//*  67  149:getstatic       #95  <Field EvacuationDockMode EvacuationDockMode.EvacuationInProgress>
					//*  68  152:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  69  155:iconst_4        
					//*  70  156:iastore         
					//*  71  157:getstatic       #81  <Field int[] h>
					//*  72  160:getstatic       #98  <Field EvacuationDockMode EvacuationDockMode.Error>
					//*  73  163:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  74  166:iconst_5        
					//*  75  167:iastore         
					//*  76  168:getstatic       #81  <Field int[] h>
					//*  77  171:getstatic       #101 <Field EvacuationDockMode EvacuationDockMode.BagFull>
					//*  78  174:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  79  177:bipush          6
					//*  80  179:iastore         
					//*  81  180:getstatic       #81  <Field int[] h>
					//*  82  183:getstatic       #104 <Field EvacuationDockMode EvacuationDockMode.Clogged>
					//*  83  186:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  84  189:bipush          7
					//*  85  191:iastore         
					//*  86  192:getstatic       #81  <Field int[] h>
					//*  87  195:getstatic       #107 <Field EvacuationDockMode EvacuationDockMode.BinMissing>
					//*  88  198:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
					//*  89  201:bipush          8
					//*  90  203:iastore         
					//*  91  204:invokestatic    #112 <Method ResolvedMissionStatus[] ResolvedMissionStatus.values()>
					//*  92  207:arraylength     
					//*  93  208:newarray        int[]
					//*  94  210:putstatic       #114 <Field int[] g>
					//*  95  213:getstatic       #114 <Field int[] g>
					//*  96  216:getstatic       #118 <Field ResolvedMissionStatus ResolvedMissionStatus.ReadyChooseCleanType>
					//*  97  219:invokevirtual   #119 <Method int ResolvedMissionStatus.ordinal()>
					//*  98  222:iconst_1        
					//*  99  223:iastore         
					//* 100  224:invokestatic    #124 <Method CurrentConnectionState[] CurrentConnectionState.values()>
					//* 101  227:arraylength     
					//* 102  228:newarray        int[]
					//* 103  230:putstatic       #126 <Field int[] f>
					//* 104  233:getstatic       #126 <Field int[] f>
					//* 105  236:getstatic       #130 <Field CurrentConnectionState CurrentConnectionState.Disconnected>
					//* 106  239:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
					//* 107  242:iconst_1        
					//* 108  243:iastore         
					//* 109  244:getstatic       #126 <Field int[] f>
					//* 110  247:getstatic       #133 <Field CurrentConnectionState CurrentConnectionState.Error>
					//* 111  250:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
					//* 112  253:iconst_2        
					//* 113  254:iastore         
					//* 114  255:getstatic       #126 <Field int[] f>
					//* 115  258:getstatic       #136 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
					//* 116  261:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
					//* 117  264:iconst_3        
					//* 118  265:iastore         
					//* 119  266:getstatic       #126 <Field int[] f>
					//* 120  269:getstatic       #139 <Field CurrentConnectionState CurrentConnectionState.RemoteMissing>
					//* 121  272:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
					//* 122  275:iconst_4        
					//* 123  276:iastore         
					//* 124  277:invokestatic    #144 <Method NetworkState[] NetworkState.values()>
					//* 125  280:arraylength     
					//* 126  281:newarray        int[]
					//* 127  283:putstatic       #146 <Field int[] e>
					//* 128  286:getstatic       #146 <Field int[] e>
					//* 129  289:getstatic       #150 <Field NetworkState NetworkState.Connecting>
					//* 130  292:invokevirtual   #151 <Method int NetworkState.ordinal()>
					//* 131  295:iconst_1        
					//* 132  296:iastore         
					//* 133  297:getstatic       #146 <Field int[] e>
					//* 134  300:getstatic       #154 <Field NetworkState NetworkState.Connected>
					//* 135  303:invokevirtual   #151 <Method int NetworkState.ordinal()>
					//* 136  306:iconst_2        
					//* 137  307:iastore         
					//* 138  308:getstatic       #146 <Field int[] e>
					//* 139  311:getstatic       #156 <Field NetworkState NetworkState.Disconnected>
					//* 140  314:invokevirtual   #151 <Method int NetworkState.ordinal()>
					//* 141  317:iconst_3        
					//* 142  318:iastore         
					//* 143  319:getstatic       #146 <Field int[] e>
					//* 144  322:getstatic       #158 <Field NetworkState NetworkState.Invalid>
					//* 145  325:invokevirtual   #151 <Method int NetworkState.ordinal()>
					//* 146  328:iconst_4        
					//* 147  329:iastore         
					//* 148  330:getstatic       #146 <Field int[] e>
					//* 149  333:getstatic       #160 <Field NetworkState NetworkState.Error>
					//* 150  336:invokevirtual   #151 <Method int NetworkState.ordinal()>
					//* 151  339:iconst_5        
					//* 152  340:iastore         
					//* 153  341:invokestatic    #165 <Method NetworkSessionType[] NetworkSessionType.values()>
					//* 154  344:arraylength     
					//* 155  345:newarray        int[]
					//* 156  347:putstatic       #167 <Field int[] d>
					//* 157  350:getstatic       #167 <Field int[] d>
					//* 158  353:getstatic       #171 <Field NetworkSessionType NetworkSessionType.LocalSecureSocket>
					//* 159  356:invokevirtual   #172 <Method int NetworkSessionType.ordinal()>
					//* 160  359:iconst_1        
					//* 161  360:iastore         
					//* 162  361:getstatic       #167 <Field int[] d>
					//* 163  364:getstatic       #175 <Field NetworkSessionType NetworkSessionType.AwsIoTService>
					//* 164  367:invokevirtual   #172 <Method int NetworkSessionType.ordinal()>
					//* 165  370:iconst_2        
					//* 166  371:iastore         
					//* 167  372:getstatic       #167 <Field int[] d>
					//* 168  375:getstatic       #178 <Field NetworkSessionType NetworkSessionType.AwsApiGateway>
					//* 169  378:invokevirtual   #172 <Method int NetworkSessionType.ordinal()>
					//* 170  381:iconst_3        
					//* 171  382:iastore         
					//* 172  383:invokestatic    #183 <Method ScheduleTypeSupported[] ScheduleTypeSupported.values()>
					//* 173  386:arraylength     
					//* 174  387:newarray        int[]
					//* 175  389:putstatic       #185 <Field int[] c>
					//* 176  392:getstatic       #185 <Field int[] c>
					//* 177  395:getstatic       #189 <Field ScheduleTypeSupported ScheduleTypeSupported.OnceDaily>
					//* 178  398:invokevirtual   #190 <Method int ScheduleTypeSupported.ordinal()>
					//* 179  401:iconst_1        
					//* 180  402:iastore         
					//* 181  403:getstatic       #185 <Field int[] c>
					//* 182  406:getstatic       #193 <Field ScheduleTypeSupported ScheduleTypeSupported.Multiple>
					//* 183  409:invokevirtual   #190 <Method int ScheduleTypeSupported.ordinal()>
					//* 184  412:iconst_2        
					//* 185  413:iastore         
					//* 186  414:invokestatic    #198 <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
					//* 187  417:arraylength     
					//* 188  418:newarray        int[]
					//* 189  420:putstatic       #200 <Field int[] b>
					//* 190  423:getstatic       #200 <Field int[] b>
					//* 191  426:getstatic       #204 <Field OTAUIServiceDataState OTAUIServiceDataState.ExpeditedOTAStatus>
					//* 192  429:invokevirtual   #205 <Method int OTAUIServiceDataState.ordinal()>
					//* 193  432:iconst_1        
					//* 194  433:iastore         
					//* 195  434:getstatic       #200 <Field int[] b>
					//* 196  437:getstatic       #208 <Field OTAUIServiceDataState OTAUIServiceDataState.SoftwareUpdateStatus>
					//* 197  440:invokevirtual   #205 <Method int OTAUIServiceDataState.ordinal()>
					//* 198  443:iconst_2        
					//* 199  444:iastore         
					//* 200  445:invokestatic    #213 <Method MissionDataState[] MissionDataState.values()>
					//* 201  448:arraylength     
					//* 202  449:newarray        int[]
					//* 203  451:putstatic       #215 <Field int[] a>
					//* 204  454:getstatic       #215 <Field int[] a>
					//* 205  457:getstatic       #219 <Field MissionDataState MissionDataState.EvacDockMode>
					//* 206  460:invokevirtual   #220 <Method int MissionDataState.ordinal()>
					//* 207  463:iconst_1        
					//* 208  464:iastore         
					//* 209  465:getstatic       #215 <Field int[] a>
					//* 210  468:getstatic       #223 <Field MissionDataState MissionDataState.EvacDockTour>
					//* 211  471:invokevirtual   #220 <Method int MissionDataState.ordinal()>
					//* 212  474:iconst_2        
					//* 213  475:iastore         
					//* 214  476:getstatic       #215 <Field int[] a>
					//* 215  479:getstatic       #226 <Field MissionDataState MissionDataState.EvacHelpContentId>
					//* 216  482:invokevirtual   #220 <Method int MissionDataState.ordinal()>
					//* 217  485:iconst_3        
					//* 218  486:iastore         
					//* 219  487:getstatic       #215 <Field int[] a>
					//* 220  490:getstatic       #229 <Field MissionDataState MissionDataState.EvacStatusMessage>
					//* 221  493:invokevirtual   #220 <Method int MissionDataState.ordinal()>
					//* 222  496:iconst_4        
					//* 223  497:iastore         
					//* 224  498:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//  225  499:astore_0        
						try
						{
							k[SettingType.MapUploadAllowed.ordinal()] = 2;
						}
					//* 226  500:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//  227  503:astore_0        
						try
						{
							k[SettingType.PMapLearningAllowed.ordinal()] = 3;
						}
					//* 228  504:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//  229  507:astore_0        
						j = new int[MapsDataState.values().length];
						try
						{
							j[MapsDataState.MapReadyForSetUp.ordinal()] = 1;
						}
					//* 230  508:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//  231  511:astore_0        
						i = new int[MapsViewState.values().length];
						try
						{
							i[MapsViewState.FloorPlanListItem.ordinal()] = 1;
						}
					//* 232  512:goto            62
						catch(NoSuchFieldError nosuchfielderror4) { }
					//  233  515:astore_0        
						try
						{
							i[MapsViewState.FloorPlanBooleanValue.ordinal()] = 2;
						}
					//* 234  516:goto            82
						catch(NoSuchFieldError nosuchfielderror5) { }
					//  235  519:astore_0        
						try
						{
							i[MapsViewState.FloorPlanItemNotFound.ordinal()] = 3;
						}
					//* 236  520:goto            93
						catch(NoSuchFieldError nosuchfielderror6) { }
					//  237  523:astore_0        
						h = new int[EvacuationDockMode.values().length];
						try
						{
							h[EvacuationDockMode.Invalid.ordinal()] = 1;
						}
					//* 238  524:goto            104
						catch(NoSuchFieldError nosuchfielderror7) { }
					//  239  527:astore_0        
						try
						{
							h[EvacuationDockMode.Ready.ordinal()] = 2;
						}
					//* 240  528:goto            124
						catch(NoSuchFieldError nosuchfielderror8) { }
					//  241  531:astore_0        
						try
						{
							h[EvacuationDockMode.EvacuationStarting.ordinal()] = 3;
						}
					//* 242  532:goto            135
						catch(NoSuchFieldError nosuchfielderror9) { }
					//  243  535:astore_0        
						try
						{
							h[EvacuationDockMode.EvacuationInProgress.ordinal()] = 4;
						}
					//* 244  536:goto            146
						catch(NoSuchFieldError nosuchfielderror10) { }
					//  245  539:astore_0        
						try
						{
							h[EvacuationDockMode.Error.ordinal()] = 5;
						}
					//* 246  540:goto            157
						catch(NoSuchFieldError nosuchfielderror11) { }
					//  247  543:astore_0        
						try
						{
							h[EvacuationDockMode.BagFull.ordinal()] = 6;
						}
					//* 248  544:goto            168
						catch(NoSuchFieldError nosuchfielderror12) { }
					//  249  547:astore_0        
						try
						{
							h[EvacuationDockMode.Clogged.ordinal()] = 7;
						}
					//* 250  548:goto            180
						catch(NoSuchFieldError nosuchfielderror13) { }
					//  251  551:astore_0        
						try
						{
							h[EvacuationDockMode.BinMissing.ordinal()] = 8;
						}
					//* 252  552:goto            192
						catch(NoSuchFieldError nosuchfielderror14) { }
					//  253  555:astore_0        
						g = new int[ResolvedMissionStatus.values().length];
						try
						{
							g[ResolvedMissionStatus.ReadyChooseCleanType.ordinal()] = 1;
						}
					//* 254  556:goto            204
						catch(NoSuchFieldError nosuchfielderror15) { }
					//  255  559:astore_0        
						f = new int[CurrentConnectionState.values().length];
						try
						{
							f[CurrentConnectionState.Disconnected.ordinal()] = 1;
						}
					//* 256  560:goto            224
						catch(NoSuchFieldError nosuchfielderror16) { }
					//  257  563:astore_0        
						try
						{
							f[CurrentConnectionState.Error.ordinal()] = 2;
						}
					//* 258  564:goto            244
						catch(NoSuchFieldError nosuchfielderror17) { }
					//  259  567:astore_0        
						try
						{
							f[CurrentConnectionState.ConnectedLocally.ordinal()] = 3;
						}
					//* 260  568:goto            255
						catch(NoSuchFieldError nosuchfielderror18) { }
					//  261  571:astore_0        
						try
						{
							f[CurrentConnectionState.RemoteMissing.ordinal()] = 4;
						}
					//* 262  572:goto            266
						catch(NoSuchFieldError nosuchfielderror19) { }
					//  263  575:astore_0        
						e = new int[NetworkState.values().length];
						try
						{
							e[NetworkState.Connecting.ordinal()] = 1;
						}
					//* 264  576:goto            277
						catch(NoSuchFieldError nosuchfielderror20) { }
					//  265  579:astore_0        
						try
						{
							e[NetworkState.Connected.ordinal()] = 2;
						}
					//* 266  580:goto            297
						catch(NoSuchFieldError nosuchfielderror21) { }
					//  267  583:astore_0        
						try
						{
							e[NetworkState.Disconnected.ordinal()] = 3;
						}
					//* 268  584:goto            308
						catch(NoSuchFieldError nosuchfielderror22) { }
					//  269  587:astore_0        
						try
						{
							e[NetworkState.Invalid.ordinal()] = 4;
						}
					//* 270  588:goto            319
						catch(NoSuchFieldError nosuchfielderror23) { }
					//  271  591:astore_0        
						try
						{
							e[NetworkState.Error.ordinal()] = 5;
						}
					//* 272  592:goto            330
						catch(NoSuchFieldError nosuchfielderror24) { }
					//  273  595:astore_0        
						d = new int[NetworkSessionType.values().length];
						try
						{
							d[NetworkSessionType.LocalSecureSocket.ordinal()] = 1;
						}
					//* 274  596:goto            341
						catch(NoSuchFieldError nosuchfielderror25) { }
					//  275  599:astore_0        
						try
						{
							d[NetworkSessionType.AwsIoTService.ordinal()] = 2;
						}
					//* 276  600:goto            361
						catch(NoSuchFieldError nosuchfielderror26) { }
					//  277  603:astore_0        
						try
						{
							d[NetworkSessionType.AwsApiGateway.ordinal()] = 3;
						}
					//* 278  604:goto            372
						catch(NoSuchFieldError nosuchfielderror27) { }
					//  279  607:astore_0        
						c = new int[ScheduleTypeSupported.values().length];
						try
						{
							c[ScheduleTypeSupported.OnceDaily.ordinal()] = 1;
						}
					//* 280  608:goto            383
						catch(NoSuchFieldError nosuchfielderror28) { }
					//  281  611:astore_0        
						try
						{
							c[ScheduleTypeSupported.Multiple.ordinal()] = 2;
						}
					//* 282  612:goto            403
						catch(NoSuchFieldError nosuchfielderror29) { }
					//  283  615:astore_0        
						b = new int[OTAUIServiceDataState.values().length];
						try
						{
							b[OTAUIServiceDataState.ExpeditedOTAStatus.ordinal()] = 1;
						}
					//* 284  616:goto            414
						catch(NoSuchFieldError nosuchfielderror30) { }
					//  285  619:astore_0        
						try
						{
							b[OTAUIServiceDataState.SoftwareUpdateStatus.ordinal()] = 2;
						}
					//* 286  620:goto            434
						catch(NoSuchFieldError nosuchfielderror31) { }
					//  287  623:astore_0        
						a = new int[MissionDataState.values().length];
						try
						{
							a[MissionDataState.EvacDockMode.ordinal()] = 1;
						}
					//* 288  624:goto            445
						catch(NoSuchFieldError nosuchfielderror32) { }
					//  289  627:astore_0        
						try
						{
							a[MissionDataState.EvacDockTour.ordinal()] = 2;
						}
					//* 290  628:goto            465
						catch(NoSuchFieldError nosuchfielderror33) { }
					//  291  631:astore_0        
						try
						{
							a[MissionDataState.EvacHelpContentId.ordinal()] = 3;
						}
					//* 292  632:goto            476
						catch(NoSuchFieldError nosuchfielderror34) { }
					//  293  635:astore_0        
						try
						{
							a[MissionDataState.EvacStatusMessage.ordinal()] = 4;
						}
					//* 294  636:goto            487
						catch(NoSuchFieldError nosuchfielderror35) { }
					//  295  639:astore_0        
					//* 296  640:return          
					}
				}

				switch(com.irobot.home.fragments._cls5.b[otauiservicedatastate.ordinal()])
		//*  33   72:getstatic       #72  <Field int[] com.irobot.home.fragments.be$5.b>
		//*  34   75:aload           4
		//*  35   77:invokevirtual   #76  <Method int OTAUIServiceDataState.ordinal()>
		//*  36   80:iaload          
				{
		//*  37   81:tableswitch     1 2: default 104
		//		               1 52
		//		               2 107
		//*  38  104:goto            52
				case 2: // '\002'
					be be1 = a;
		//   39  107:aload_0         
		//   40  108:getfield        #12  <Field be a>
		//   41  111:astore          4
					boolean flag;
					if(otauiservicedata.getSoftwareUpdateStatus() == SoftwareUpdateStatus.AvailableAndReady)
		//*  42  113:aload_1         
		//*  43  114:invokevirtual   #80  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
		//*  44  117:getstatic       #86  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
		//*  45  120:if_acmpne       128
						flag = true;
		//   46  123:iconst_1        
		//   47  124:istore_2        
					else
		//*  48  125:goto            130
						flag = false;
		//   49  128:iconst_0        
		//   50  129:istore_2        
					be1.f(flag);
		//   51  130:aload           4
		//   52  132:iload_2         
		//   53  133:invokevirtual   #90  <Method void com.irobot.home.fragments.be.f(boolean)>
					break;
				}
			} while(true);
		//*  54  136:goto            52
		//   55  139:return          
		}

		final be a;

		private a()
		{
			a = be.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field be a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
		//    5    9:return          
		}

	}

	private class b extends MapsUIServiceDataCallback
	{

		public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
		{
			if(mapsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				com.irobot.home.util.o.e("RobotCleanFragment", "maps service data is null");
		//    2    4:ldc1            #24  <String "RobotCleanFragment">
		//    3    6:ldc1            #26  <String "maps service data is null">
		//    4    8:invokestatic    #32  <Method void o.e(String, String)>
				return;
		//    5   11:return          
			}
			if(!a.isAdded())
		//*   6   12:aload_0         
		//*   7   13:getfield        #13  <Field be a>
		//*   8   16:invokevirtual   #36  <Method boolean be.isAdded()>
		//*   9   19:ifne            23
				return;
		//   10   22:return          
			Object obj = ((Object) (mapsuiservicedata.getMapsViewStates()));
		//   11   23:aload_1         
		//   12   24:invokevirtual   #42  <Method ArrayList MapsUIServiceData.getMapsViewStates()>
		//   13   27:astore_3        
			Object obj1 = ((Object) (new StringBuilder()));
		//   14   28:new             #44  <Class StringBuilder>
		//   15   31:dup             
		//   16   32:invokespecial   #45  <Method void StringBuilder()>
		//   17   35:astore          4
			((StringBuilder) (obj1)).append("View states: ");
		//   18   37:aload           4
		//   19   39:ldc1            #47  <String "View states: ">
		//   20   41:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   21   44:pop             
			((StringBuilder) (obj1)).append(((ArrayList) (obj)).toString());
		//   22   45:aload           4
		//   23   47:aload_3         
		//   24   48:invokevirtual   #57  <Method String ArrayList.toString()>
		//   25   51:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   26   54:pop             
			com.irobot.home.util.o.a("RobotCleanFragment", ((StringBuilder) (obj1)).toString());
		//   27   55:ldc1            #24  <String "RobotCleanFragment">
		//   28   57:aload           4
		//   29   59:invokevirtual   #58  <Method String StringBuilder.toString()>
		//   30   62:invokestatic    #60  <Method void o.a(String, String)>
			obj1 = ((Object) (((ArrayList) (obj)).iterator()));
		//   31   65:aload_3         
		//   32   66:invokevirtual   #64  <Method Iterator ArrayList.iterator()>
		//   33   69:astore          4
			do
			{
				if(!((Iterator) (obj1)).hasNext())
					break;
		//   34   71:aload           4
		//   35   73:invokeinterface #69  <Method boolean Iterator.hasNext()>
		//   36   78:ifeq            246
				obj = ((Object) ((MapsViewState)((Iterator) (obj1)).next()));
		//   37   81:aload           4
		//   38   83:invokeinterface #73  <Method Object Iterator.next()>
		//   39   88:checkcast       #75  <Class MapsViewState>
		//   40   91:astore_3        
				switch(_cls5.i[((MapsViewState) (obj)).ordinal()])
		//*  41   92:getstatic       #81  <Field int[] be$5.i>
		//*  42   95:aload_3         
		//*  43   96:invokevirtual   #85  <Method int MapsViewState.ordinal()>
		//*  44   99:iaload          
				{
				default:
					break;

		//*  45  100:tableswitch     1 3: default 128
		//		               1 216
		//		               2 141
		//		               3 131
		//*  46  128:goto            71
				case 3: // '\003'
					be.e(a);
		//   47  131:aload_0         
		//   48  132:getfield        #13  <Field be a>
		//   49  135:invokestatic    #87  <Method void be.e(be)>
					continue;
		//   50  138:goto            71

				case 2: // '\002'
					BooleanValueType booleanvaluetype = mapsuiservicedata.getFloorPlanBooleanValueType();
		//   51  141:aload_1         
		//   52  142:invokevirtual   #91  <Method BooleanValueType MapsUIServiceData.getFloorPlanBooleanValueType()>
		//   53  145:astore          5
					boolean flag = mapsuiservicedata.getFloorPlanBooleanValue();
		//   54  147:aload_1         
		//   55  148:invokevirtual   #94  <Method boolean MapsUIServiceData.getFloorPlanBooleanValue()>
		//   56  151:istore_2        
					if(booleanvaluetype == BooleanValueType.Loading)
		//*  57  152:aload           5
		//*  58  154:getstatic       #100 <Field BooleanValueType BooleanValueType.Loading>
		//*  59  157:if_acmpne       178
						obj = ((Object) (a.Z));
		//   60  160:aload_0         
		//   61  161:getfield        #13  <Field be a>
		//   62  164:getfield        #104 <Field HideableView be.Z>
		//   63  167:astore_3        
					else
		//*  64  168:aload_3         
		//*  65  169:iload_2         
		//*  66  170:aload           5
		//*  67  172:invokevirtual   #109 <Method void HideableView.a(boolean, BooleanValueType)>
		//*  68  175:goto            71
					if(booleanvaluetype == BooleanValueType.LearningPercentageRing)
		//*  69  178:aload           5
		//*  70  180:getstatic       #112 <Field BooleanValueType BooleanValueType.LearningPercentageRing>
		//*  71  183:if_acmpne       197
					{
						obj = ((Object) (a.W));
		//   72  186:aload_0         
		//   73  187:getfield        #13  <Field be a>
		//   74  190:getfield        #115 <Field HideableView be.W>
		//   75  193:astore_3        
					} else
		//*  76  194:goto            168
					{
						if(booleanvaluetype != BooleanValueType.ChooseRoomSelection)
							continue;
		//   77  197:aload           5
		//   78  199:getstatic       #118 <Field BooleanValueType BooleanValueType.ChooseRoomSelection>
		//   79  202:if_acmpne       71
						obj = ((Object) (a.X));
		//   80  205:aload_0         
		//   81  206:getfield        #13  <Field be a>
		//   82  209:getfield        #121 <Field HideableView be.X>
		//   83  212:astore_3        
					}
					((HideableView) (obj)).a(flag, booleanvaluetype);
					continue;

		//*  84  213:goto            168
				case 1: // '\001'
					com.irobot.home.fragments.be.a(a, mapsuiservicedata.getFloorPlanListItems(), mapsuiservicedata.getFloorPlanListItemIndex(), mapsuiservicedata.getHighestLearningPercentage(), mapsuiservicedata.getMapReadyForSetup(), mapsuiservicedata.getMapCompleted());
		//   85  216:aload_0         
		//   86  217:getfield        #13  <Field be a>
		//   87  220:aload_1         
		//   88  221:invokevirtual   #124 <Method ArrayList MapsUIServiceData.getFloorPlanListItems()>
		//   89  224:aload_1         
		//   90  225:invokevirtual   #127 <Method int MapsUIServiceData.getFloorPlanListItemIndex()>
		//   91  228:aload_1         
		//   92  229:invokevirtual   #130 <Method int MapsUIServiceData.getHighestLearningPercentage()>
		//   93  232:aload_1         
		//   94  233:invokevirtual   #133 <Method boolean MapsUIServiceData.getMapReadyForSetup()>
		//   95  236:aload_1         
		//   96  237:invokevirtual   #136 <Method boolean MapsUIServiceData.getMapCompleted()>
		//   97  240:invokestatic    #139 <Method void com.irobot.home.fragments.be.a(be, ArrayList, int, int, boolean, boolean)>
					break;
				}
			} while(true);
		//   98  243:goto            71
			obj = ((Object) (mapsuiservicedata.getMapsDataStates()));
		//   99  246:aload_1         
		//  100  247:invokevirtual   #142 <Method ArrayList MapsUIServiceData.getMapsDataStates()>
		//  101  250:astore_3        
			obj1 = ((Object) (new StringBuilder()));
		//  102  251:new             #44  <Class StringBuilder>
		//  103  254:dup             
		//  104  255:invokespecial   #45  <Method void StringBuilder()>
		//  105  258:astore          4
			((StringBuilder) (obj1)).append("Data states: ");
		//  106  260:aload           4
		//  107  262:ldc1            #144 <String "Data states: ">
		//  108  264:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//  109  267:pop             
			((StringBuilder) (obj1)).append(((ArrayList) (obj)).toString());
		//  110  268:aload           4
		//  111  270:aload_3         
		//  112  271:invokevirtual   #57  <Method String ArrayList.toString()>
		//  113  274:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//  114  277:pop             
			com.irobot.home.util.o.a("RobotCleanFragment", ((StringBuilder) (obj1)).toString());
		//  115  278:ldc1            #24  <String "RobotCleanFragment">
		//  116  280:aload           4
		//  117  282:invokevirtual   #58  <Method String StringBuilder.toString()>
		//  118  285:invokestatic    #60  <Method void o.a(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//  119  288:aload_3         
		//  120  289:invokevirtual   #64  <Method Iterator ArrayList.iterator()>
		//  121  292:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//  122  293:aload_3         
		//  123  294:invokeinterface #69  <Method boolean Iterator.hasNext()>
		//  124  299:ifeq            345
				MapsDataState mapsdatastate = (MapsDataState)((Iterator) (obj)).next();
		//  125  302:aload_3         
		//  126  303:invokeinterface #73  <Method Object Iterator.next()>
		//  127  308:checkcast       #146 <Class MapsDataState>
		//  128  311:astore          4
				if(com.irobot.home.fragments._cls5.j[mapsdatastate.ordinal()] == 1)
		//* 129  313:getstatic       #149 <Field int[] com.irobot.home.fragments.be$5.j>
		//* 130  316:aload           4
		//* 131  318:invokevirtual   #150 <Method int MapsDataState.ordinal()>
		//* 132  321:iaload          
		//* 133  322:iconst_1        
		//* 134  323:icmpeq          329
		//* 135  326:goto            293
				{
					boolean flag1 = mapsuiservicedata.getMapReadyForSetup();
		//  136  329:aload_1         
		//  137  330:invokevirtual   #133 <Method boolean MapsUIServiceData.getMapReadyForSetup()>
		//  138  333:istore_2        
					a.g(flag1);
		//  139  334:aload_0         
		//  140  335:getfield        #13  <Field be a>
		//  141  338:iload_2         
		//  142  339:invokevirtual   #154 <Method void com.irobot.home.fragments.be.g(boolean)>
				}
			} while(true);
		//  143  342:goto            293
		//  144  345:return          
		}

		final be a;

		private b()
		{
			a = be.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field be a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void MapsUIServiceDataCallback()>
		//    5    9:return          
		}

	}

	private class c extends MissionUIServiceDataCallback
	{

		public void onMissionUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
		{
			if(missionuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				com.irobot.home.util.o.e("RobotCleanFragment", "null service data");
		//    2    4:ldc1            #24  <String "RobotCleanFragment">
		//    3    6:ldc1            #26  <String "null service data">
		//    4    8:invokestatic    #32  <Method void o.e(String, String)>
				return;
		//    5   11:return          
			}
			if(!a.isAdded())
		//*   6   12:aload_0         
		//*   7   13:getfield        #13  <Field be a>
		//*   8   16:invokevirtual   #36  <Method boolean be.isAdded()>
		//*   9   19:ifne            23
				return;
		//   10   22:return          
			Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
		//   11   23:aload_1         
		//   12   24:invokevirtual   #42  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
		//   13   27:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
		//   14   28:new             #44  <Class StringBuilder>
		//   15   31:dup             
		//   16   32:invokespecial   #45  <Method void StringBuilder()>
		//   17   35:astore_3        
			stringbuilder.append("Change list: ");
		//   18   36:aload_3         
		//   19   37:ldc1            #47  <String "Change list: ">
		//   20   39:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   21   42:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   22   43:aload_3         
		//   23   44:aload_2         
		//   24   45:invokevirtual   #57  <Method String ArrayList.toString()>
		//   25   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   26   51:pop             
			com.irobot.home.util.o.b("RobotCleanFragment", stringbuilder.toString());
		//   27   52:ldc1            #24  <String "RobotCleanFragment">
		//   28   54:aload_3         
		//   29   55:invokevirtual   #58  <Method String StringBuilder.toString()>
		//   30   58:invokestatic    #61  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   31   61:aload_2         
		//   32   62:invokevirtual   #65  <Method Iterator ArrayList.iterator()>
		//   33   65:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   34   66:aload_2         
		//   35   67:invokeinterface #70  <Method boolean Iterator.hasNext()>
		//   36   72:ifeq            190
				MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
		//   37   75:aload_2         
		//   38   76:invokeinterface #74  <Method Object Iterator.next()>
		//   39   81:checkcast       #76  <Class MissionDataState>
		//   40   84:astore_3        
				switch(com.irobot.home.fragments._cls5.a[missiondatastate.ordinal()])
		//*  41   85:getstatic       #81  <Field int[] com.irobot.home.fragments.be$5.a>
		//*  42   88:aload_3         
		//*  43   89:invokevirtual   #85  <Method int MissionDataState.ordinal()>
		//*  44   92:iaload          
				{
		//*  45   93:tableswitch     1 4: default 124
		//		               1 176
		//		               2 159
		//		               3 145
		//		               4 127
		//*  46  124:goto            66
				case 4: // '\004'
					com.irobot.home.fragments.be.a(a, missionuiservicedata.getEvacStatusMessage(), missionuiservicedata.getEvacStatusMessageArgs());
		//   47  127:aload_0         
		//   48  128:getfield        #13  <Field be a>
		//   49  131:aload_1         
		//   50  132:invokevirtual   #88  <Method String MissionUIServiceData.getEvacStatusMessage()>
		//   51  135:aload_1         
		//   52  136:invokevirtual   #91  <Method ArrayList MissionUIServiceData.getEvacStatusMessageArgs()>
		//   53  139:invokestatic    #94  <Method void com.irobot.home.fragments.be.a(be, String, ArrayList)>
					break;

		//*  54  142:goto            66
				case 3: // '\003'
					com.irobot.home.fragments.be.a(a, missionuiservicedata.getEvacHelpContentId());
		//   55  145:aload_0         
		//   56  146:getfield        #13  <Field be a>
		//   57  149:aload_1         
		//   58  150:invokevirtual   #97  <Method String MissionUIServiceData.getEvacHelpContentId()>
		//   59  153:invokestatic    #100 <Method void com.irobot.home.fragments.be.a(be, String)>
					break;

		//*  60  156:goto            66
				case 2: // '\002'
					if(missionuiservicedata.getShowEvacDockTour())
		//*  61  159:aload_1         
		//*  62  160:invokevirtual   #103 <Method boolean MissionUIServiceData.getShowEvacDockTour()>
		//*  63  163:ifeq            66
						com.irobot.home.fragments.be.a(a);
		//   64  166:aload_0         
		//   65  167:getfield        #13  <Field be a>
		//   66  170:invokestatic    #105 <Method void com.irobot.home.fragments.be.a(be)>
					break;

		//*  67  173:goto            66
				case 1: // '\001'
					com.irobot.home.fragments.be.a(a, missionuiservicedata.getEvacDockMode());
		//   68  176:aload_0         
		//   69  177:getfield        #13  <Field be a>
		//   70  180:aload_1         
		//   71  181:invokevirtual   #109 <Method EvacuationDockMode MissionUIServiceData.getEvacDockMode()>
		//   72  184:invokestatic    #112 <Method void com.irobot.home.fragments.be.a(be, EvacuationDockMode)>
					break;
				}
			} while(true);
		//   73  187:goto            66
		//   74  190:return          
		}

		final be a;

		private c()
		{
			a = be.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field be a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void MissionUIServiceDataCallback()>
		//    5    9:return          
		}

	}

	public static interface d
	{

		public abstract void a();
	}

	private class e extends SettingsUIServiceDataCallback
	{

		public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
		{
			if(settingsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				com.irobot.home.util.o.d("RobotCleanFragment", "Received null data.");
		//    2    4:ldc1            #24  <String "RobotCleanFragment">
		//    3    6:ldc1            #26  <String "Received null data.">
		//    4    8:invokestatic    #32  <Method void o.d(String, String)>
				return;
		//    5   11:return          
			}
			Object obj = ((Object) (settingsuiservicedata.getSettingsChangeList().iterator()));
		//    6   12:aload_1         
		//    7   13:invokevirtual   #38  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
		//    8   16:invokevirtual   #44  <Method Iterator HashSet.iterator()>
		//    9   19:astore          4
			do
			{
				if(((Iterator) (obj)).hasNext())
		//*  10   21:aload           4
		//*  11   23:invokeinterface #50  <Method boolean Iterator.hasNext()>
		//*  12   28:ifeq            143
				{
					SettingType settingtype = (SettingType)((Iterator) (obj)).next();
		//   13   31:aload           4
		//   14   33:invokeinterface #54  <Method Object Iterator.next()>
		//   15   38:checkcast       #56  <Class SettingType>
		//   16   41:astore          5
					switch(com.irobot.home.fragments._cls5.k[settingtype.ordinal()])
		//*  17   43:getstatic       #62  <Field int[] com.irobot.home.fragments.be$5.k>
		//*  18   46:aload           5
		//*  19   48:invokevirtual   #66  <Method int SettingType.ordinal()>
		//*  20   51:iaload          
					{
		//*  21   52:tableswitch     1 3: default 80
		//		               1 119
		//		               2 101
		//		               3 83
		//*  22   80:goto            21
					case 3: // '\003'
						be.d(a, settingsuiservicedata.getBooleanSetting(SettingType.PMapLearningAllowed));
		//   23   83:aload_0         
		//   24   84:getfield        #13  <Field be a>
		//   25   87:aload_1         
		//   26   88:getstatic       #70  <Field SettingType SettingType.PMapLearningAllowed>
		//   27   91:invokevirtual   #74  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
		//   28   94:invokestatic    #77  <Method boolean be.d(be, boolean)>
		//   29   97:pop             
						break;

		//*  30   98:goto            21
					case 2: // '\002'
						be.c(a, settingsuiservicedata.getBooleanSetting(SettingType.MapUploadAllowed));
		//   31  101:aload_0         
		//   32  102:getfield        #13  <Field be a>
		//   33  105:aload_1         
		//   34  106:getstatic       #80  <Field SettingType SettingType.MapUploadAllowed>
		//   35  109:invokevirtual   #74  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
		//   36  112:invokestatic    #83  <Method boolean be.c(be, boolean)>
		//   37  115:pop             
						break;

		//*  38  116:goto            21
					case 1: // '\001'
						int i1 = settingsuiservicedata.getIntegerSetting(SettingType.Schedule);
		//   39  119:aload_1         
		//   40  120:getstatic       #86  <Field SettingType SettingType.Schedule>
		//   41  123:invokevirtual   #90  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
		//   42  126:istore_2        
						com.irobot.home.fragments.be.a(a, ScheduleTypeSupported.values()[i1]);
		//   43  127:aload_0         
		//   44  128:getfield        #13  <Field be a>
		//   45  131:invokestatic    #96  <Method ScheduleTypeSupported[] ScheduleTypeSupported.values()>
		//   46  134:iload_2         
		//   47  135:aaload          
		//   48  136:invokestatic    #99  <Method ScheduleTypeSupported com.irobot.home.fragments.be.a(be, ScheduleTypeSupported)>
		//   49  139:pop             
						break;
					}
					continue;
		//   50  140:goto            21
				}
				settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
		//   51  143:aload_1         
		//   52  144:invokevirtual   #102 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
		//   53  147:astore_1        
				obj = ((Object) (a));
		//   54  148:aload_0         
		//   55  149:getfield        #13  <Field be a>
		//   56  152:astore          4
				boolean flag;
				if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPreferenceAvailable))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotPadWetness))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotRankOverlap))))
		//*  57  154:aload_1         
		//*  58  155:getstatic       #105 <Field SettingType SettingType.CleaningPreferenceAvailable>
		//*  59  158:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//*  60  161:ifne            202
		//*  61  164:aload_1         
		//*  62  165:getstatic       #112 <Field SettingType SettingType.CleaningPresets>
		//*  63  168:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//*  64  171:ifne            202
		//*  65  174:aload_1         
		//*  66  175:getstatic       #115 <Field SettingType SettingType.RobotPadWetness>
		//*  67  178:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//*  68  181:ifne            202
		//*  69  184:aload_1         
		//*  70  185:getstatic       #118 <Field SettingType SettingType.RobotRankOverlap>
		//*  71  188:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//*  72  191:ifeq            197
		//*  73  194:goto            202
					flag = false;
		//   74  197:iconst_0        
		//   75  198:istore_3        
				else
		//*  76  199:goto            204
					flag = true;
		//   77  202:iconst_1        
		//   78  203:istore_3        
				be.e(((be) (obj)), flag);
		//   79  204:aload           4
		//   80  206:iload_3         
		//   81  207:invokestatic    #120 <Method boolean be.e(be, boolean)>
		//   82  210:pop             
				com.irobot.home.fragments.be.f(a);
		//   83  211:aload_0         
		//   84  212:getfield        #13  <Field be a>
		//   85  215:invokestatic    #123 <Method void com.irobot.home.fragments.be.f(be)>
				flag = a.getActivity().getSharedPreferences("DEVEL", 0).getBoolean("use_demo_map", false);
		//   86  218:aload_0         
		//   87  219:getfield        #13  <Field be a>
		//   88  222:invokevirtual   #127 <Method Activity be.getActivity()>
		//   89  225:ldc1            #129 <String "DEVEL">
		//   90  227:iconst_0        
		//   91  228:invokevirtual   #135 <Method SharedPreferences Activity.getSharedPreferences(String, int)>
		//   92  231:ldc1            #137 <String "use_demo_map">
		//   93  233:iconst_0        
		//   94  234:invokeinterface #143 <Method boolean SharedPreferences.getBoolean(String, boolean)>
		//   95  239:istore_3        
				if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.PersistentMaps))) && (!flag || !"release".equalsIgnoreCase("dev") && !"release".equalsIgnoreCase("debug")))
		//*  96  240:aload_1         
		//*  97  241:getstatic       #146 <Field SettingType SettingType.PersistentMaps>
		//*  98  244:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//*  99  247:ifne            287
		//* 100  250:iload_3         
		//* 101  251:ifeq            277
		//* 102  254:ldc1            #148 <String "release">
		//* 103  256:ldc1            #150 <String "dev">
		//* 104  258:invokevirtual   #156 <Method boolean String.equalsIgnoreCase(String)>
		//* 105  261:ifne            287
		//* 106  264:ldc1            #148 <String "release">
		//* 107  266:ldc1            #158 <String "debug">
		//* 108  268:invokevirtual   #156 <Method boolean String.equalsIgnoreCase(String)>
		//* 109  271:ifeq            277
		//* 110  274:goto            287
					be.h(a);
		//  111  277:aload_0         
		//  112  278:getfield        #13  <Field be a>
		//  113  281:invokestatic    #161 <Method void be.h(be)>
				else
		//* 114  284:goto            294
					com.irobot.home.fragments.be.g(a);
		//  115  287:aload_0         
		//  116  288:getfield        #13  <Field be a>
		//  117  291:invokestatic    #164 <Method void com.irobot.home.fragments.be.g(be)>
				com.irobot.home.fragments.be.f(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.StaticMaps))));
		//  118  294:aload_0         
		//  119  295:getfield        #13  <Field be a>
		//  120  298:aload_1         
		//  121  299:getstatic       #167 <Field SettingType SettingType.StaticMaps>
		//  122  302:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//  123  305:invokestatic    #169 <Method boolean com.irobot.home.fragments.be.f(be, boolean)>
		//  124  308:pop             
				com.irobot.home.fragments.be.g(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))));
		//  125  309:aload_0         
		//  126  310:getfield        #13  <Field be a>
		//  127  313:aload_1         
		//  128  314:getstatic       #112 <Field SettingType SettingType.CleaningPresets>
		//  129  317:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//  130  320:invokestatic    #171 <Method boolean com.irobot.home.fragments.be.g(be, boolean)>
		//  131  323:pop             
				be.i(a).b(((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.PauseOnBinFull))) ^ true);
		//  132  324:aload_0         
		//  133  325:getfield        #13  <Field be a>
		//  134  328:invokestatic    #175 <Method com.irobot.home.util.b be.i(be)>
		//  135  331:aload_1         
		//  136  332:getstatic       #178 <Field SettingType SettingType.PauseOnBinFull>
		//  137  335:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
		//  138  338:iconst_1        
		//  139  339:ixor            
		//  140  340:invokevirtual   #184 <Method void com.irobot.home.util.b.b(boolean)>
				break;
			} while(true);
		//  141  343:return          
		}

		final be a;

		private e()
		{
			a = be.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field be a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public be()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method void i()>
		aL = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #194 <Field String aL>
		D = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #196 <Field CommonQuestionList D>
		E = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #198 <Field RobotErrorHelpContentList E>
		aN = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #200 <Field boolean aN>
		aO = new Handler(Looper.getMainLooper());
	//   14   24:aload_0         
	//   15   25:new             #202 <Class Handler>
	//   16   28:dup             
	//   17   29:invokestatic    #208 <Method Looper Looper.getMainLooper()>
	//   18   32:invokespecial   #211 <Method void Handler(Looper)>
	//   19   35:putfield        #213 <Field Handler aO>
		aU = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #215 <Field boolean aU>
		aV = false;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #217 <Field boolean aV>
		aW = true;
	//   26   48:aload_0         
	//   27   49:iconst_1        
	//   28   50:putfield        #219 <Field boolean aW>
		aX = false;
	//   29   53:aload_0         
	//   30   54:iconst_0        
	//   31   55:putfield        #221 <Field boolean aX>
		aY = false;
	//   32   58:aload_0         
	//   33   59:iconst_0        
	//   34   60:putfield        #223 <Field boolean aY>
		aZ = true;
	//   35   63:aload_0         
	//   36   64:iconst_1        
	//   37   65:putfield        #225 <Field boolean aZ>
		ba = true;
	//   38   68:aload_0         
	//   39   69:iconst_1        
	//   40   70:putfield        #227 <Field boolean ba>
		bc = false;
	//   41   73:aload_0         
	//   42   74:iconst_0        
	//   43   75:putfield        #229 <Field boolean bc>
		aJ = ((SettingsUIServiceDataCallback) (new e()));
	//   44   78:aload_0         
	//   45   79:new             #46  <Class be$e>
	//   46   82:dup             
	//   47   83:aload_0         
	//   48   84:aconst_null     
	//   49   85:invokespecial   #232 <Method void be$e(be, be$1)>
	//   50   88:putfield        #234 <Field SettingsUIServiceDataCallback aJ>
		bd = new com.irobot.home.m.b();
	//   51   91:aload_0         
	//   52   92:new             #236 <Class b>
	//   53   95:dup             
	//   54   96:invokespecial   #237 <Method void b()>
	//   55   99:putfield        #239 <Field b bd>
		be = null;
	//   56  102:aload_0         
	//   57  103:aconst_null     
	//   58  104:putfield        #241 <Field MissionSubsystem be>
		bf = null;
	//   59  107:aload_0         
	//   60  108:aconst_null     
	//   61  109:putfield        #243 <Field MapsUIService bf>
		bg = new c();
	//   62  112:aload_0         
	//   63  113:new             #40  <Class be$c>
	//   64  116:dup             
	//   65  117:aload_0         
	//   66  118:aconst_null     
	//   67  119:invokespecial   #244 <Method void be$c(be, be$1)>
	//   68  122:putfield        #246 <Field be$c bg>
		bh = new b();
	//   69  125:aload_0         
	//   70  126:new             #37  <Class be$b>
	//   71  129:dup             
	//   72  130:aload_0         
	//   73  131:aconst_null     
	//   74  132:invokespecial   #247 <Method void be$b(be, be$1)>
	//   75  135:putfield        #249 <Field be$b bh>
		bj = new a();
	//   76  138:aload_0         
	//   77  139:new             #34  <Class be$a>
	//   78  142:dup             
	//   79  143:aload_0         
	//   80  144:aconst_null     
	//   81  145:invokespecial   #250 <Method void be$a(be, be$1)>
	//   82  148:putfield        #252 <Field be$a bj>
	//   83  151:return          
	}

	private void N()
	{
		aO.post(new Runnable() {

			public void run()
			{
				if(com.irobot.home.util.j.a(((android.app.Fragment) (a))))
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field be a>
			//*   2    4:invokestatic    #26  <Method boolean j.a(android.app.Fragment)>
			//*   3    7:ifeq            27
					com.irobot.home.fragments.be.b(a).a(a.getActivity());
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field be a>
			//    6   14:invokestatic    #30  <Method b com.irobot.home.fragments.be.b(be)>
			//    7   17:aload_0         
			//    8   18:getfield        #17  <Field be a>
			//    9   21:invokevirtual   #34  <Method Activity be.getActivity()>
			//   10   24:invokevirtual   #39  <Method void b.a(Activity)>
			//   11   27:return          
			}

			final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field Handler aO>
	//    2    4:new             #8   <Class be$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #256 <Method void be$1(be)>
	//    6   12:invokevirtual   #260 <Method boolean Handler.post(Runnable)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void O()
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		boolean flag;
		if(P.getLayoutDirection() == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #266 <Field LinearLayout P>
	//*   6   12:invokevirtual   #272 <Method int LinearLayout.getLayoutDirection()>
	//*   7   15:ifne            23
			flag = true;
	//    8   18:iconst_1        
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			flag = false;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		ViewTreeObserver viewtreeobserver = P.getViewTreeObserver();
	//   13   25:aload_0         
	//   14   26:getfield        #266 <Field LinearLayout P>
	//   15   29:invokevirtual   #276 <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//   16   32:astore_2        
		if(viewtreeobserver.isAlive())
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #281 <Method boolean ViewTreeObserver.isAlive()>
	//*  19   37:ifeq            53
			viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(flag) {

				public void onGlobalLayout()
				{
					b.P.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field be b>
				//    2    4:getfield        #29  <Field LinearLayout be.P>
				//    3    7:invokevirtual   #35  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
				//    4   10:aload_0         
				//    5   11:invokevirtual   #41  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					int i1 = b.P.getWidth();
				//    6   14:aload_0         
				//    7   15:getfield        #19  <Field be b>
				//    8   18:getfield        #29  <Field LinearLayout be.P>
				//    9   21:invokevirtual   #45  <Method int LinearLayout.getWidth()>
				//   10   24:istore_1        
					int j1 = b.P.getHeight();
				//   11   25:aload_0         
				//   12   26:getfield        #19  <Field be b>
				//   13   29:getfield        #29  <Field LinearLayout be.P>
				//   14   32:invokevirtual   #48  <Method int LinearLayout.getHeight()>
				//   15   35:istore_2        
					if(!a)
				//*  16   36:aload_0         
				//*  17   37:getfield        #21  <Field boolean a>
				//*  18   40:ifeq            46
				//*  19   43:goto            49
						i1 = -i1;
				//   20   46:iload_1         
				//   21   47:ineg            
				//   22   48:istore_1        
					b.ar = ObjectAnimator.ofFloat(((Object) (b.P)), "translationX", new float[] {
						(float)i1 * 0.75F
					});
				//   23   49:aload_0         
				//   24   50:getfield        #19  <Field be b>
				//   25   53:aload_0         
				//   26   54:getfield        #19  <Field be b>
				//   27   57:getfield        #29  <Field LinearLayout be.P>
				//   28   60:ldc1            #50  <String "translationX">
				//   29   62:iconst_1        
				//   30   63:newarray        float[]
				//   31   65:dup             
				//   32   66:iconst_0        
				//   33   67:iload_1         
				//   34   68:i2f             
				//   35   69:ldc1            #51  <Float 0.75F>
				//   36   71:fmul            
				//   37   72:fastore         
				//   38   73:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   39   76:putfield        #61  <Field ObjectAnimator be.ar>
					b.ar.setDuration(b.getResources().getInteger(0x7f0a0005));
				//   40   79:aload_0         
				//   41   80:getfield        #19  <Field be b>
				//   42   83:getfield        #61  <Field ObjectAnimator be.ar>
				//   43   86:aload_0         
				//   44   87:getfield        #19  <Field be b>
				//   45   90:invokevirtual   #65  <Method Resources be.getResources()>
				//   46   93:ldc1            #66  <Int 0x7f0a0005>
				//   47   95:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//   48   98:i2l             
				//   49   99:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//   50  102:pop             
					b.as = ObjectAnimator.ofFloat(((Object) (b.P)), "translationY", new float[] {
						(float)(-j1) * 0.75F
					});
				//   51  103:aload_0         
				//   52  104:getfield        #19  <Field be b>
				//   53  107:aload_0         
				//   54  108:getfield        #19  <Field be b>
				//   55  111:getfield        #29  <Field LinearLayout be.P>
				//   56  114:ldc1            #78  <String "translationY">
				//   57  116:iconst_1        
				//   58  117:newarray        float[]
				//   59  119:dup             
				//   60  120:iconst_0        
				//   61  121:iload_2         
				//   62  122:ineg            
				//   63  123:i2f             
				//   64  124:ldc1            #51  <Float 0.75F>
				//   65  126:fmul            
				//   66  127:fastore         
				//   67  128:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   68  131:putfield        #81  <Field ObjectAnimator be.as>
					b.as.setDuration(b.getResources().getInteger(0x7f0a0005));
				//   69  134:aload_0         
				//   70  135:getfield        #19  <Field be b>
				//   71  138:getfield        #81  <Field ObjectAnimator be.as>
				//   72  141:aload_0         
				//   73  142:getfield        #19  <Field be b>
				//   74  145:invokevirtual   #65  <Method Resources be.getResources()>
				//   75  148:ldc1            #66  <Int 0x7f0a0005>
				//   76  150:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//   77  153:i2l             
				//   78  154:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//   79  157:pop             
					b.at = ObjectAnimator.ofFloat(((Object) (b.Q)), "alpha", new float[] {
						1.0F
					});
				//   80  158:aload_0         
				//   81  159:getfield        #19  <Field be b>
				//   82  162:aload_0         
				//   83  163:getfield        #19  <Field be b>
				//   84  166:getfield        #85  <Field CircleButton be.Q>
				//   85  169:ldc1            #87  <String "alpha">
				//   86  171:iconst_1        
				//   87  172:newarray        float[]
				//   88  174:dup             
				//   89  175:iconst_0        
				//   90  176:fconst_1        
				//   91  177:fastore         
				//   92  178:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   93  181:putfield        #90  <Field ObjectAnimator be.at>
					b.at.setDuration(b.getResources().getInteger(0x7f0a0005));
				//   94  184:aload_0         
				//   95  185:getfield        #19  <Field be b>
				//   96  188:getfield        #90  <Field ObjectAnimator be.at>
				//   97  191:aload_0         
				//   98  192:getfield        #19  <Field be b>
				//   99  195:invokevirtual   #65  <Method Resources be.getResources()>
				//  100  198:ldc1            #66  <Int 0x7f0a0005>
				//  101  200:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//  102  203:i2l             
				//  103  204:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//  104  207:pop             
					b.au = ObjectAnimator.ofFloat(((Object) (b.R)), "alpha", new float[] {
						1.0F
					});
				//  105  208:aload_0         
				//  106  209:getfield        #19  <Field be b>
				//  107  212:aload_0         
				//  108  213:getfield        #19  <Field be b>
				//  109  216:getfield        #94  <Field CustomTextView be.R>
				//  110  219:ldc1            #87  <String "alpha">
				//  111  221:iconst_1        
				//  112  222:newarray        float[]
				//  113  224:dup             
				//  114  225:iconst_0        
				//  115  226:fconst_1        
				//  116  227:fastore         
				//  117  228:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//  118  231:putfield        #97  <Field ObjectAnimator be.au>
					b.au.setDuration(b.getResources().getInteger(0x7f0a0005));
				//  119  234:aload_0         
				//  120  235:getfield        #19  <Field be b>
				//  121  238:getfield        #97  <Field ObjectAnimator be.au>
				//  122  241:aload_0         
				//  123  242:getfield        #19  <Field be b>
				//  124  245:invokevirtual   #65  <Method Resources be.getResources()>
				//  125  248:ldc1            #66  <Int 0x7f0a0005>
				//  126  250:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//  127  253:i2l             
				//  128  254:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//  129  257:pop             
					b.aj = new AnimatorSet();
				//  130  258:aload_0         
				//  131  259:getfield        #19  <Field be b>
				//  132  262:new             #99  <Class AnimatorSet>
				//  133  265:dup             
				//  134  266:invokespecial   #100 <Method void AnimatorSet()>
				//  135  269:putfield        #104 <Field AnimatorSet be.aj>
					b.aj.play(((Animator) (b.ar))).with(((Animator) (b.as))).with(((Animator) (b.at)));
				//  136  272:aload_0         
				//  137  273:getfield        #19  <Field be b>
				//  138  276:getfield        #104 <Field AnimatorSet be.aj>
				//  139  279:aload_0         
				//  140  280:getfield        #19  <Field be b>
				//  141  283:getfield        #61  <Field ObjectAnimator be.ar>
				//  142  286:invokevirtual   #108 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
				//  143  289:aload_0         
				//  144  290:getfield        #19  <Field be b>
				//  145  293:getfield        #81  <Field ObjectAnimator be.as>
				//  146  296:invokevirtual   #113 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
				//  147  299:aload_0         
				//  148  300:getfield        #19  <Field be b>
				//  149  303:getfield        #90  <Field ObjectAnimator be.at>
				//  150  306:invokevirtual   #113 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
				//  151  309:pop             
					b.ai = new AnimatorSet();
				//  152  310:aload_0         
				//  153  311:getfield        #19  <Field be b>
				//  154  314:new             #99  <Class AnimatorSet>
				//  155  317:dup             
				//  156  318:invokespecial   #100 <Method void AnimatorSet()>
				//  157  321:putfield        #116 <Field AnimatorSet be.ai>
					b.ai.play(((Animator) (b.au)));
				//  158  324:aload_0         
				//  159  325:getfield        #19  <Field be b>
				//  160  328:getfield        #116 <Field AnimatorSet be.ai>
				//  161  331:aload_0         
				//  162  332:getfield        #19  <Field be b>
				//  163  335:getfield        #97  <Field ObjectAnimator be.au>
				//  164  338:invokevirtual   #108 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
				//  165  341:pop             
				//  166  342:return          
				}

				final boolean a;
				final be b;

			
			{
				b = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field be b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   20   40:aload_2         
	//   21   41:new             #26  <Class be$6>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:iload_1         
	//   25   47:invokespecial   #284 <Method void be$6(be, boolean)>
	//   26   50:invokevirtual   #288 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		viewtreeobserver = M.getViewTreeObserver();
	//   27   53:aload_0         
	//   28   54:getfield        #290 <Field LinearLayout M>
	//   29   57:invokevirtual   #276 <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//   30   60:astore_2        
		if(viewtreeobserver.isAlive())
	//*  31   61:aload_2         
	//*  32   62:invokevirtual   #281 <Method boolean ViewTreeObserver.isAlive()>
	//*  33   65:ifeq            81
			viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(flag) {

				public void onGlobalLayout()
				{
					int i1 = b.M.getWidth();
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field be b>
				//    2    4:getfield        #29  <Field LinearLayout be.M>
				//    3    7:invokevirtual   #35  <Method int LinearLayout.getWidth()>
				//    4   10:istore_1        
					int j1 = b.M.getHeight();
				//    5   11:aload_0         
				//    6   12:getfield        #19  <Field be b>
				//    7   15:getfield        #29  <Field LinearLayout be.M>
				//    8   18:invokevirtual   #38  <Method int LinearLayout.getHeight()>
				//    9   21:istore_2        
					b.M.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//   10   22:aload_0         
				//   11   23:getfield        #19  <Field be b>
				//   12   26:getfield        #29  <Field LinearLayout be.M>
				//   13   29:invokevirtual   #42  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
				//   14   32:aload_0         
				//   15   33:invokevirtual   #48  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					if(!a)
				//*  16   36:aload_0         
				//*  17   37:getfield        #21  <Field boolean a>
				//*  18   40:ifeq            46
				//*  19   43:goto            49
						i1 = -i1;
				//   20   46:iload_1         
				//   21   47:ineg            
				//   22   48:istore_1        
					b.av = ObjectAnimator.ofFloat(((Object) (b.M)), "translationX", new float[] {
						(float)(-i1) * 0.75F
					});
				//   23   49:aload_0         
				//   24   50:getfield        #19  <Field be b>
				//   25   53:aload_0         
				//   26   54:getfield        #19  <Field be b>
				//   27   57:getfield        #29  <Field LinearLayout be.M>
				//   28   60:ldc1            #50  <String "translationX">
				//   29   62:iconst_1        
				//   30   63:newarray        float[]
				//   31   65:dup             
				//   32   66:iconst_0        
				//   33   67:iload_1         
				//   34   68:ineg            
				//   35   69:i2f             
				//   36   70:ldc1            #51  <Float 0.75F>
				//   37   72:fmul            
				//   38   73:fastore         
				//   39   74:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   40   77:putfield        #61  <Field ObjectAnimator be.av>
					b.av.setDuration(b.getResources().getInteger(0x7f0a0005));
				//   41   80:aload_0         
				//   42   81:getfield        #19  <Field be b>
				//   43   84:getfield        #61  <Field ObjectAnimator be.av>
				//   44   87:aload_0         
				//   45   88:getfield        #19  <Field be b>
				//   46   91:invokevirtual   #65  <Method Resources be.getResources()>
				//   47   94:ldc1            #66  <Int 0x7f0a0005>
				//   48   96:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//   49   99:i2l             
				//   50  100:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//   51  103:pop             
					b.aw = ObjectAnimator.ofFloat(((Object) (b.M)), "translationY", new float[] {
						(float)(-j1) * 0.75F
					});
				//   52  104:aload_0         
				//   53  105:getfield        #19  <Field be b>
				//   54  108:aload_0         
				//   55  109:getfield        #19  <Field be b>
				//   56  112:getfield        #29  <Field LinearLayout be.M>
				//   57  115:ldc1            #78  <String "translationY">
				//   58  117:iconst_1        
				//   59  118:newarray        float[]
				//   60  120:dup             
				//   61  121:iconst_0        
				//   62  122:iload_2         
				//   63  123:ineg            
				//   64  124:i2f             
				//   65  125:ldc1            #51  <Float 0.75F>
				//   66  127:fmul            
				//   67  128:fastore         
				//   68  129:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   69  132:putfield        #81  <Field ObjectAnimator be.aw>
					b.aw.setDuration(b.getResources().getInteger(0x7f0a0005));
				//   70  135:aload_0         
				//   71  136:getfield        #19  <Field be b>
				//   72  139:getfield        #81  <Field ObjectAnimator be.aw>
				//   73  142:aload_0         
				//   74  143:getfield        #19  <Field be b>
				//   75  146:invokevirtual   #65  <Method Resources be.getResources()>
				//   76  149:ldc1            #66  <Int 0x7f0a0005>
				//   77  151:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//   78  154:i2l             
				//   79  155:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//   80  158:pop             
					b.ax = ObjectAnimator.ofFloat(((Object) (b.O)), "alpha", new float[] {
						1.0F
					});
				//   81  159:aload_0         
				//   82  160:getfield        #19  <Field be b>
				//   83  163:aload_0         
				//   84  164:getfield        #19  <Field be b>
				//   85  167:getfield        #84  <Field CircleButton be.O>
				//   86  170:ldc1            #86  <String "alpha">
				//   87  172:iconst_1        
				//   88  173:newarray        float[]
				//   89  175:dup             
				//   90  176:iconst_0        
				//   91  177:fconst_1        
				//   92  178:fastore         
				//   93  179:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   94  182:putfield        #89  <Field ObjectAnimator be.ax>
					b.ax.setDuration(b.getResources().getInteger(0x7f0a0005));
				//   95  185:aload_0         
				//   96  186:getfield        #19  <Field be b>
				//   97  189:getfield        #89  <Field ObjectAnimator be.ax>
				//   98  192:aload_0         
				//   99  193:getfield        #19  <Field be b>
				//  100  196:invokevirtual   #65  <Method Resources be.getResources()>
				//  101  199:ldc1            #66  <Int 0x7f0a0005>
				//  102  201:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//  103  204:i2l             
				//  104  205:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//  105  208:pop             
					b.ay = ObjectAnimator.ofFloat(((Object) (b.N)), "alpha", new float[] {
						1.0F
					});
				//  106  209:aload_0         
				//  107  210:getfield        #19  <Field be b>
				//  108  213:aload_0         
				//  109  214:getfield        #19  <Field be b>
				//  110  217:getfield        #93  <Field CustomTextView be.N>
				//  111  220:ldc1            #86  <String "alpha">
				//  112  222:iconst_1        
				//  113  223:newarray        float[]
				//  114  225:dup             
				//  115  226:iconst_0        
				//  116  227:fconst_1        
				//  117  228:fastore         
				//  118  229:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//  119  232:putfield        #96  <Field ObjectAnimator be.ay>
					b.ay.setDuration(b.getResources().getInteger(0x7f0a0005));
				//  120  235:aload_0         
				//  121  236:getfield        #19  <Field be b>
				//  122  239:getfield        #96  <Field ObjectAnimator be.ay>
				//  123  242:aload_0         
				//  124  243:getfield        #19  <Field be b>
				//  125  246:invokevirtual   #65  <Method Resources be.getResources()>
				//  126  249:ldc1            #66  <Int 0x7f0a0005>
				//  127  251:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//  128  254:i2l             
				//  129  255:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//  130  258:pop             
					b.az = ObjectAnimator.ofFloat(((Object) (b.T)), "alpha", new float[] {
						1.0F
					});
				//  131  259:aload_0         
				//  132  260:getfield        #19  <Field be b>
				//  133  263:aload_0         
				//  134  264:getfield        #19  <Field be b>
				//  135  267:getfield        #100 <Field PercentageRingView be.T>
				//  136  270:ldc1            #86  <String "alpha">
				//  137  272:iconst_1        
				//  138  273:newarray        float[]
				//  139  275:dup             
				//  140  276:iconst_0        
				//  141  277:fconst_1        
				//  142  278:fastore         
				//  143  279:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//  144  282:putfield        #103 <Field ObjectAnimator be.az>
					b.az.setDuration(b.getResources().getInteger(0x7f0a0005));
				//  145  285:aload_0         
				//  146  286:getfield        #19  <Field be b>
				//  147  289:getfield        #103 <Field ObjectAnimator be.az>
				//  148  292:aload_0         
				//  149  293:getfield        #19  <Field be b>
				//  150  296:invokevirtual   #65  <Method Resources be.getResources()>
				//  151  299:ldc1            #66  <Int 0x7f0a0005>
				//  152  301:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//  153  304:i2l             
				//  154  305:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//  155  308:pop             
					b.aB = ObjectAnimator.ofFloat(((Object) (b.V)), "alpha", new float[] {
						1.0F
					});
				//  156  309:aload_0         
				//  157  310:getfield        #19  <Field be b>
				//  158  313:aload_0         
				//  159  314:getfield        #19  <Field be b>
				//  160  317:getfield        #106 <Field LinearLayout be.V>
				//  161  320:ldc1            #86  <String "alpha">
				//  162  322:iconst_1        
				//  163  323:newarray        float[]
				//  164  325:dup             
				//  165  326:iconst_0        
				//  166  327:fconst_1        
				//  167  328:fastore         
				//  168  329:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//  169  332:putfield        #109 <Field ObjectAnimator be.aB>
					b.aB.setDuration(b.getResources().getInteger(0x7f0a0005));
				//  170  335:aload_0         
				//  171  336:getfield        #19  <Field be b>
				//  172  339:getfield        #109 <Field ObjectAnimator be.aB>
				//  173  342:aload_0         
				//  174  343:getfield        #19  <Field be b>
				//  175  346:invokevirtual   #65  <Method Resources be.getResources()>
				//  176  349:ldc1            #66  <Int 0x7f0a0005>
				//  177  351:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//  178  354:i2l             
				//  179  355:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//  180  358:pop             
					b.aA = ObjectAnimator.ofFloat(((Object) (b.Y)), "alpha", new float[] {
						1.0F
					});
				//  181  359:aload_0         
				//  182  360:getfield        #19  <Field be b>
				//  183  363:aload_0         
				//  184  364:getfield        #19  <Field be b>
				//  185  367:getfield        #113 <Field RelativeLayout be.Y>
				//  186  370:ldc1            #86  <String "alpha">
				//  187  372:iconst_1        
				//  188  373:newarray        float[]
				//  189  375:dup             
				//  190  376:iconst_0        
				//  191  377:fconst_1        
				//  192  378:fastore         
				//  193  379:invokestatic    #57  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//  194  382:putfield        #116 <Field ObjectAnimator be.aA>
					b.aA.setDuration(b.getResources().getInteger(0x7f0a0005));
				//  195  385:aload_0         
				//  196  386:getfield        #19  <Field be b>
				//  197  389:getfield        #116 <Field ObjectAnimator be.aA>
				//  198  392:aload_0         
				//  199  393:getfield        #19  <Field be b>
				//  200  396:invokevirtual   #65  <Method Resources be.getResources()>
				//  201  399:ldc1            #66  <Int 0x7f0a0005>
				//  202  401:invokevirtual   #72  <Method int Resources.getInteger(int)>
				//  203  404:i2l             
				//  204  405:invokevirtual   #76  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//  205  408:pop             
					b.ag = new AnimatorSet();
				//  206  409:aload_0         
				//  207  410:getfield        #19  <Field be b>
				//  208  413:new             #118 <Class AnimatorSet>
				//  209  416:dup             
				//  210  417:invokespecial   #119 <Method void AnimatorSet()>
				//  211  420:putfield        #123 <Field AnimatorSet be.ag>
					b.ag.play(((Animator) (b.av))).with(((Animator) (b.aw))).with(((Animator) (b.ax))).with(((Animator) (b.az))).with(((Animator) (b.aB))).with(((Animator) (b.aA)));
				//  212  423:aload_0         
				//  213  424:getfield        #19  <Field be b>
				//  214  427:getfield        #123 <Field AnimatorSet be.ag>
				//  215  430:aload_0         
				//  216  431:getfield        #19  <Field be b>
				//  217  434:getfield        #61  <Field ObjectAnimator be.av>
				//  218  437:invokevirtual   #127 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
				//  219  440:aload_0         
				//  220  441:getfield        #19  <Field be b>
				//  221  444:getfield        #81  <Field ObjectAnimator be.aw>
				//  222  447:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
				//  223  450:aload_0         
				//  224  451:getfield        #19  <Field be b>
				//  225  454:getfield        #89  <Field ObjectAnimator be.ax>
				//  226  457:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
				//  227  460:aload_0         
				//  228  461:getfield        #19  <Field be b>
				//  229  464:getfield        #103 <Field ObjectAnimator be.az>
				//  230  467:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
				//  231  470:aload_0         
				//  232  471:getfield        #19  <Field be b>
				//  233  474:getfield        #109 <Field ObjectAnimator be.aB>
				//  234  477:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
				//  235  480:aload_0         
				//  236  481:getfield        #19  <Field be b>
				//  237  484:getfield        #116 <Field ObjectAnimator be.aA>
				//  238  487:invokevirtual   #132 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
				//  239  490:pop             
					b.ah = new AnimatorSet();
				//  240  491:aload_0         
				//  241  492:getfield        #19  <Field be b>
				//  242  495:new             #118 <Class AnimatorSet>
				//  243  498:dup             
				//  244  499:invokespecial   #119 <Method void AnimatorSet()>
				//  245  502:putfield        #135 <Field AnimatorSet be.ah>
					b.ah.play(((Animator) (b.ay)));
				//  246  505:aload_0         
				//  247  506:getfield        #19  <Field be b>
				//  248  509:getfield        #135 <Field AnimatorSet be.ah>
				//  249  512:aload_0         
				//  250  513:getfield        #19  <Field be b>
				//  251  516:getfield        #96  <Field ObjectAnimator be.ay>
				//  252  519:invokevirtual   #127 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
				//  253  522:pop             
				//  254  523:return          
				}

				final boolean a;
				final be b;

			
			{
				b = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field be b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   34   68:aload_2         
	//   35   69:new             #28  <Class be$7>
	//   36   72:dup             
	//   37   73:aload_0         
	//   38   74:iload_1         
	//   39   75:invokespecial   #291 <Method void be$7(be, boolean)>
	//   40   78:invokevirtual   #288 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		viewtreeobserver = i.getViewTreeObserver();
	//   41   81:aload_0         
	//   42   82:getfield        #293 <Field LinearLayout i>
	//   43   85:invokevirtual   #276 <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//   44   88:astore_2        
		if(viewtreeobserver.isAlive())
	//*  45   89:aload_2         
	//*  46   90:invokevirtual   #281 <Method boolean ViewTreeObserver.isAlive()>
	//*  47   93:ifeq            108
			viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					a.i.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field be a>
				//    2    4:getfield        #25  <Field LinearLayout be.i>
				//    3    7:invokevirtual   #31  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
				//    4   10:aload_0         
				//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					int i1 = a.i.getHeight();
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field be a>
				//    8   18:getfield        #25  <Field LinearLayout be.i>
				//    9   21:invokevirtual   #41  <Method int LinearLayout.getHeight()>
				//   10   24:istore_1        
					a.aq = ObjectAnimator.ofFloat(((Object) (a.i)), "translationY", new float[] {
						(float)(i1 * 2)
					});
				//   11   25:aload_0         
				//   12   26:getfield        #17  <Field be a>
				//   13   29:aload_0         
				//   14   30:getfield        #17  <Field be a>
				//   15   33:getfield        #25  <Field LinearLayout be.i>
				//   16   36:ldc1            #43  <String "translationY">
				//   17   38:iconst_1        
				//   18   39:newarray        float[]
				//   19   41:dup             
				//   20   42:iconst_0        
				//   21   43:iload_1         
				//   22   44:iconst_2        
				//   23   45:imul            
				//   24   46:i2f             
				//   25   47:fastore         
				//   26   48:invokestatic    #49  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
				//   27   51:putfield        #53  <Field ObjectAnimator be.aq>
					a.aq.setDuration(a.getResources().getInteger(0x7f0a0005));
				//   28   54:aload_0         
				//   29   55:getfield        #17  <Field be a>
				//   30   58:getfield        #53  <Field ObjectAnimator be.aq>
				//   31   61:aload_0         
				//   32   62:getfield        #17  <Field be a>
				//   33   65:invokevirtual   #57  <Method Resources be.getResources()>
				//   34   68:ldc1            #58  <Int 0x7f0a0005>
				//   35   70:invokevirtual   #64  <Method int Resources.getInteger(int)>
				//   36   73:i2l             
				//   37   74:invokevirtual   #68  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
				//   38   77:pop             
					a.am = new AnimatorSet();
				//   39   78:aload_0         
				//   40   79:getfield        #17  <Field be a>
				//   41   82:new             #70  <Class AnimatorSet>
				//   42   85:dup             
				//   43   86:invokespecial   #71  <Method void AnimatorSet()>
				//   44   89:putfield        #75  <Field AnimatorSet be.am>
					a.am.play(((Animator) (a.aq)));
				//   45   92:aload_0         
				//   46   93:getfield        #17  <Field be a>
				//   47   96:getfield        #75  <Field AnimatorSet be.am>
				//   48   99:aload_0         
				//   49  100:getfield        #17  <Field be a>
				//   50  103:getfield        #53  <Field ObjectAnimator be.aq>
				//   51  106:invokevirtual   #79  <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
				//   52  109:pop             
				//   53  110:return          
				}

				final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   48   96:aload_2         
	//   49   97:new             #30  <Class be$8>
	//   50  100:dup             
	//   51  101:aload_0         
	//   52  102:invokespecial   #294 <Method void be$8(be)>
	//   53  105:invokevirtual   #288 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		viewtreeobserver = l.getViewTreeObserver();
	//   54  108:aload_0         
	//   55  109:getfield        #296 <Field CustomSquaredImageButton l>
	//   56  112:invokevirtual   #299 <Method ViewTreeObserver CustomSquaredImageButton.getViewTreeObserver()>
	//   57  115:astore_2        
		if(viewtreeobserver.isAlive())
	//*  58  116:aload_2         
	//*  59  117:invokevirtual   #281 <Method boolean ViewTreeObserver.isAlive()>
	//*  60  120:ifeq            135
			viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					a.l.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field be a>
				//    2    4:getfield        #25  <Field CustomSquaredImageButton be.l>
				//    3    7:invokevirtual   #31  <Method ViewTreeObserver CustomSquaredImageButton.getViewTreeObserver()>
				//    4   10:aload_0         
				//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					a.y.setPivotX((float)a.l.getWidth() * 0.8F);
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field be a>
				//    8   18:getfield        #41  <Field RelativeLayout be.y>
				//    9   21:aload_0         
				//   10   22:getfield        #17  <Field be a>
				//   11   25:getfield        #25  <Field CustomSquaredImageButton be.l>
				//   12   28:invokevirtual   #45  <Method int CustomSquaredImageButton.getWidth()>
				//   13   31:i2f             
				//   14   32:ldc1            #46  <Float 0.8F>
				//   15   34:fmul            
				//   16   35:invokevirtual   #52  <Method void RelativeLayout.setPivotX(float)>
					a.y.setPivotY((float)a.l.getHeight() * 0.1F);
				//   17   38:aload_0         
				//   18   39:getfield        #17  <Field be a>
				//   19   42:getfield        #41  <Field RelativeLayout be.y>
				//   20   45:aload_0         
				//   21   46:getfield        #17  <Field be a>
				//   22   49:getfield        #25  <Field CustomSquaredImageButton be.l>
				//   23   52:invokevirtual   #55  <Method int CustomSquaredImageButton.getHeight()>
				//   24   55:i2f             
				//   25   56:ldc1            #56  <Float 0.1F>
				//   26   58:fmul            
				//   27   59:invokevirtual   #59  <Method void RelativeLayout.setPivotY(float)>
				//   28   62:return          
				}

				final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   61  123:aload_2         
	//   62  124:new             #32  <Class be$9>
	//   63  127:dup             
	//   64  128:aload_0         
	//   65  129:invokespecial   #300 <Method void be$9(be)>
	//   66  132:invokevirtual   #288 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		an = ObjectAnimator.ofFloat(((Object) (y)), "scaleX", new float[] {
			1.0F, 0.25F
		});
	//   67  135:aload_0         
	//   68  136:aload_0         
	//   69  137:getfield        #302 <Field RelativeLayout y>
	//   70  140:ldc2            #304 <String "scaleX">
	//   71  143:iconst_2        
	//   72  144:newarray        float[]
	//   73  146:dup             
	//   74  147:iconst_0        
	//   75  148:fconst_1        
	//   76  149:fastore         
	//   77  150:dup             
	//   78  151:iconst_1        
	//   79  152:ldc2            #305 <Float 0.25F>
	//   80  155:fastore         
	//   81  156:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   82  159:putfield        #313 <Field ObjectAnimator an>
		an.setDuration(getResources().getInteger(0x7f0a0005));
	//   83  162:aload_0         
	//   84  163:getfield        #313 <Field ObjectAnimator an>
	//   85  166:aload_0         
	//   86  167:invokevirtual   #317 <Method Resources getResources()>
	//   87  170:ldc2            #318 <Int 0x7f0a0005>
	//   88  173:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//   89  176:i2l             
	//   90  177:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   91  180:pop             
		ao = ObjectAnimator.ofFloat(((Object) (y)), "scaleY", new float[] {
			1.0F, 0.25F
		});
	//   92  181:aload_0         
	//   93  182:aload_0         
	//   94  183:getfield        #302 <Field RelativeLayout y>
	//   95  186:ldc2            #330 <String "scaleY">
	//   96  189:iconst_2        
	//   97  190:newarray        float[]
	//   98  192:dup             
	//   99  193:iconst_0        
	//  100  194:fconst_1        
	//  101  195:fastore         
	//  102  196:dup             
	//  103  197:iconst_1        
	//  104  198:ldc2            #305 <Float 0.25F>
	//  105  201:fastore         
	//  106  202:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  107  205:putfield        #332 <Field ObjectAnimator ao>
		ao.setDuration(getResources().getInteger(0x7f0a0005));
	//  108  208:aload_0         
	//  109  209:getfield        #332 <Field ObjectAnimator ao>
	//  110  212:aload_0         
	//  111  213:invokevirtual   #317 <Method Resources getResources()>
	//  112  216:ldc2            #318 <Int 0x7f0a0005>
	//  113  219:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  114  222:i2l             
	//  115  223:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  116  226:pop             
		ap = ObjectAnimator.ofFloat(((Object) (y)), "alpha", new float[] {
			1.0F, 0.0F
		});
	//  117  227:aload_0         
	//  118  228:aload_0         
	//  119  229:getfield        #302 <Field RelativeLayout y>
	//  120  232:ldc2            #334 <String "alpha">
	//  121  235:iconst_2        
	//  122  236:newarray        float[]
	//  123  238:dup             
	//  124  239:iconst_0        
	//  125  240:fconst_1        
	//  126  241:fastore         
	//  127  242:dup             
	//  128  243:iconst_1        
	//  129  244:fconst_0        
	//  130  245:fastore         
	//  131  246:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  132  249:putfield        #336 <Field ObjectAnimator ap>
		ap.setDuration(getResources().getInteger(0x7f0a0005));
	//  133  252:aload_0         
	//  134  253:getfield        #336 <Field ObjectAnimator ap>
	//  135  256:aload_0         
	//  136  257:invokevirtual   #317 <Method Resources getResources()>
	//  137  260:ldc2            #318 <Int 0x7f0a0005>
	//  138  263:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  139  266:i2l             
	//  140  267:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  141  270:pop             
		af = new AnimatorSet();
	//  142  271:aload_0         
	//  143  272:new             #338 <Class AnimatorSet>
	//  144  275:dup             
	//  145  276:invokespecial   #339 <Method void AnimatorSet()>
	//  146  279:putfield        #341 <Field AnimatorSet af>
		af.play(((Animator) (an))).with(((Animator) (ao))).with(((Animator) (ap)));
	//  147  282:aload_0         
	//  148  283:getfield        #341 <Field AnimatorSet af>
	//  149  286:aload_0         
	//  150  287:getfield        #313 <Field ObjectAnimator an>
	//  151  290:invokevirtual   #345 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//  152  293:aload_0         
	//  153  294:getfield        #332 <Field ObjectAnimator ao>
	//  154  297:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  155  300:aload_0         
	//  156  301:getfield        #336 <Field ObjectAnimator ap>
	//  157  304:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  158  307:pop             
		aC = ObjectAnimator.ofFloat(((Object) (S)), "alpha", new float[] {
			0.0F, 1.0F
		});
	//  159  308:aload_0         
	//  160  309:aload_0         
	//  161  310:getfield        #352 <Field CircleButton S>
	//  162  313:ldc2            #334 <String "alpha">
	//  163  316:iconst_2        
	//  164  317:newarray        float[]
	//  165  319:dup             
	//  166  320:iconst_0        
	//  167  321:fconst_0        
	//  168  322:fastore         
	//  169  323:dup             
	//  170  324:iconst_1        
	//  171  325:fconst_1        
	//  172  326:fastore         
	//  173  327:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  174  330:putfield        #354 <Field ObjectAnimator aC>
		aC.setDuration(getResources().getInteger(0x7f0a0005));
	//  175  333:aload_0         
	//  176  334:getfield        #354 <Field ObjectAnimator aC>
	//  177  337:aload_0         
	//  178  338:invokevirtual   #317 <Method Resources getResources()>
	//  179  341:ldc2            #318 <Int 0x7f0a0005>
	//  180  344:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  181  347:i2l             
	//  182  348:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  183  351:pop             
		aD = ObjectAnimator.ofFloat(((Object) (S)), "translationY", new float[] {
			-100F, 0.0F
		});
	//  184  352:aload_0         
	//  185  353:aload_0         
	//  186  354:getfield        #352 <Field CircleButton S>
	//  187  357:ldc2            #356 <String "translationY">
	//  188  360:iconst_2        
	//  189  361:newarray        float[]
	//  190  363:dup             
	//  191  364:iconst_0        
	//  192  365:ldc2            #357 <Float -100F>
	//  193  368:fastore         
	//  194  369:dup             
	//  195  370:iconst_1        
	//  196  371:fconst_0        
	//  197  372:fastore         
	//  198  373:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  199  376:putfield        #359 <Field ObjectAnimator aD>
		aD.setDuration(getResources().getInteger(0x7f0a0005));
	//  200  379:aload_0         
	//  201  380:getfield        #359 <Field ObjectAnimator aD>
	//  202  383:aload_0         
	//  203  384:invokevirtual   #317 <Method Resources getResources()>
	//  204  387:ldc2            #318 <Int 0x7f0a0005>
	//  205  390:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  206  393:i2l             
	//  207  394:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  208  397:pop             
		ak = new AnimatorSet();
	//  209  398:aload_0         
	//  210  399:new             #338 <Class AnimatorSet>
	//  211  402:dup             
	//  212  403:invokespecial   #339 <Method void AnimatorSet()>
	//  213  406:putfield        #361 <Field AnimatorSet ak>
		ak.play(((Animator) (aC))).with(((Animator) (aD)));
	//  214  409:aload_0         
	//  215  410:getfield        #361 <Field AnimatorSet ak>
	//  216  413:aload_0         
	//  217  414:getfield        #354 <Field ObjectAnimator aC>
	//  218  417:invokevirtual   #345 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//  219  420:aload_0         
	//  220  421:getfield        #359 <Field ObjectAnimator aD>
	//  221  424:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  222  427:pop             
		aE = ObjectAnimator.ofFloat(((Object) (j)), "alpha", new float[] {
			1.0F, 0.0F
		});
	//  223  428:aload_0         
	//  224  429:aload_0         
	//  225  430:getfield        #363 <Field TextView j>
	//  226  433:ldc2            #334 <String "alpha">
	//  227  436:iconst_2        
	//  228  437:newarray        float[]
	//  229  439:dup             
	//  230  440:iconst_0        
	//  231  441:fconst_1        
	//  232  442:fastore         
	//  233  443:dup             
	//  234  444:iconst_1        
	//  235  445:fconst_0        
	//  236  446:fastore         
	//  237  447:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  238  450:putfield        #365 <Field ObjectAnimator aE>
		aE.setDuration(getResources().getInteger(0x7f0a0005));
	//  239  453:aload_0         
	//  240  454:getfield        #365 <Field ObjectAnimator aE>
	//  241  457:aload_0         
	//  242  458:invokevirtual   #317 <Method Resources getResources()>
	//  243  461:ldc2            #318 <Int 0x7f0a0005>
	//  244  464:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  245  467:i2l             
	//  246  468:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  247  471:pop             
		aF = ObjectAnimator.ofFloat(((Object) (h)), "alpha", new float[] {
			1.0F, 0.0F
		});
	//  248  472:aload_0         
	//  249  473:aload_0         
	//  250  474:getfield        #367 <Field LinearLayout h>
	//  251  477:ldc2            #334 <String "alpha">
	//  252  480:iconst_2        
	//  253  481:newarray        float[]
	//  254  483:dup             
	//  255  484:iconst_0        
	//  256  485:fconst_1        
	//  257  486:fastore         
	//  258  487:dup             
	//  259  488:iconst_1        
	//  260  489:fconst_0        
	//  261  490:fastore         
	//  262  491:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  263  494:putfield        #369 <Field ObjectAnimator aF>
		aF.setDuration(getResources().getInteger(0x7f0a0005));
	//  264  497:aload_0         
	//  265  498:getfield        #369 <Field ObjectAnimator aF>
	//  266  501:aload_0         
	//  267  502:invokevirtual   #317 <Method Resources getResources()>
	//  268  505:ldc2            #318 <Int 0x7f0a0005>
	//  269  508:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  270  511:i2l             
	//  271  512:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  272  515:pop             
		aG = ObjectAnimator.ofFloat(((Object) (k)), "alpha", new float[] {
			1.0F, 0.0F
		});
	//  273  516:aload_0         
	//  274  517:aload_0         
	//  275  518:getfield        #371 <Field TextView k>
	//  276  521:ldc2            #334 <String "alpha">
	//  277  524:iconst_2        
	//  278  525:newarray        float[]
	//  279  527:dup             
	//  280  528:iconst_0        
	//  281  529:fconst_1        
	//  282  530:fastore         
	//  283  531:dup             
	//  284  532:iconst_1        
	//  285  533:fconst_0        
	//  286  534:fastore         
	//  287  535:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  288  538:putfield        #373 <Field ObjectAnimator aG>
		aG.setDuration(getResources().getInteger(0x7f0a0005));
	//  289  541:aload_0         
	//  290  542:getfield        #373 <Field ObjectAnimator aG>
	//  291  545:aload_0         
	//  292  546:invokevirtual   #317 <Method Resources getResources()>
	//  293  549:ldc2            #318 <Int 0x7f0a0005>
	//  294  552:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  295  555:i2l             
	//  296  556:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  297  559:pop             
		aH = ObjectAnimator.ofFloat(((Object) (z)), "alpha", new float[] {
			1.0F, 0.0F
		});
	//  298  560:aload_0         
	//  299  561:aload_0         
	//  300  562:getfield        #375 <Field CustomButton z>
	//  301  565:ldc2            #334 <String "alpha">
	//  302  568:iconst_2        
	//  303  569:newarray        float[]
	//  304  571:dup             
	//  305  572:iconst_0        
	//  306  573:fconst_1        
	//  307  574:fastore         
	//  308  575:dup             
	//  309  576:iconst_1        
	//  310  577:fconst_0        
	//  311  578:fastore         
	//  312  579:invokestatic    #311 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  313  582:putfield        #377 <Field ObjectAnimator aH>
		aH.setDuration(getResources().getInteger(0x7f0a0005));
	//  314  585:aload_0         
	//  315  586:getfield        #377 <Field ObjectAnimator aH>
	//  316  589:aload_0         
	//  317  590:invokevirtual   #317 <Method Resources getResources()>
	//  318  593:ldc2            #318 <Int 0x7f0a0005>
	//  319  596:invokevirtual   #324 <Method int Resources.getInteger(int)>
	//  320  599:i2l             
	//  321  600:invokevirtual   #328 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  322  603:pop             
		al = new AnimatorSet();
	//  323  604:aload_0         
	//  324  605:new             #338 <Class AnimatorSet>
	//  325  608:dup             
	//  326  609:invokespecial   #339 <Method void AnimatorSet()>
	//  327  612:putfield        #379 <Field AnimatorSet al>
		al.play(((Animator) (aE))).with(((Animator) (aF))).with(((Animator) (aG))).with(((Animator) (aH)));
	//  328  615:aload_0         
	//  329  616:getfield        #379 <Field AnimatorSet al>
	//  330  619:aload_0         
	//  331  620:getfield        #365 <Field ObjectAnimator aE>
	//  332  623:invokevirtual   #345 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//  333  626:aload_0         
	//  334  627:getfield        #369 <Field ObjectAnimator aF>
	//  335  630:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  336  633:aload_0         
	//  337  634:getfield        #373 <Field ObjectAnimator aG>
	//  338  637:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  339  640:aload_0         
	//  340  641:getfield        #377 <Field ObjectAnimator aH>
	//  341  644:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  342  647:pop             
	//  343  648:return          
	}

	private void P()
	{
		byte byte0;
		LinearLayout linearlayout;
label0:
		{
			int i1 = o.getVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field TextView o>
	//    2    4:invokevirtual   #386 <Method int TextView.getVisibility()>
	//    3    7:istore_1        
			boolean flag3 = true;
	//    4    8:iconst_1        
	//    5    9:istore          4
			boolean flag4 = false;
	//    6   11:iconst_0        
	//    7   12:istore          6
			boolean flag;
			if(i1 == 0)
	//*   8   14:iload_1         
	//*   9   15:ifne            23
				flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_1        
			else
	//*  12   20:goto            25
				flag = false;
	//   13   23:iconst_0        
	//   14   24:istore_1        
			boolean flag1;
			if(p.getVisibility() == 0)
	//*  15   25:aload_0         
	//*  16   26:getfield        #388 <Field TextView p>
	//*  17   29:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*  18   32:ifne            40
				flag1 = true;
	//   19   35:iconst_1        
	//   20   36:istore_2        
			else
	//*  21   37:goto            42
				flag1 = false;
	//   22   40:iconst_0        
	//   23   41:istore_2        
			boolean flag2;
			if(q.getVisibility() == 0)
	//*  24   42:aload_0         
	//*  25   43:getfield        #390 <Field ImageView q>
	//*  26   46:invokevirtual   #393 <Method int ImageView.getVisibility()>
	//*  27   49:ifne            57
				flag2 = true;
	//   28   52:iconst_1        
	//   29   53:istore_3        
			else
	//*  30   54:goto            59
				flag2 = false;
	//   31   57:iconst_0        
	//   32   58:istore_3        
			if(r.getVisibility() != 0)
	//*  33   59:aload_0         
	//*  34   60:getfield        #395 <Field ImageView r>
	//*  35   63:invokevirtual   #393 <Method int ImageView.getVisibility()>
	//*  36   66:ifne            72
	//*  37   69:goto            75
				flag3 = false;
	//   38   72:iconst_0        
	//   39   73:istore          4
			linearlayout = h;
	//   40   75:aload_0         
	//   41   76:getfield        #367 <Field LinearLayout h>
	//   42   79:astore          7
			if(!ba)
	//*  43   81:aload_0         
	//*  44   82:getfield        #227 <Field boolean ba>
	//*  45   85:ifne            124
			{
				byte0 = ((byte) (flag4));
	//   46   88:iload           6
	//   47   90:istore          5
				if(flag)
					break label0;
	//   48   92:iload_1         
	//   49   93:ifne            127
				byte0 = ((byte) (flag4));
	//   50   96:iload           6
	//   51   98:istore          5
				if(flag1)
					break label0;
	//   52  100:iload_2         
	//   53  101:ifne            127
				byte0 = ((byte) (flag4));
	//   54  104:iload           6
	//   55  106:istore          5
				if(flag2)
					break label0;
	//   56  108:iload_3         
	//   57  109:ifne            127
				if(flag3)
	//*  58  112:iload           4
	//*  59  114:ifeq            124
				{
					byte0 = ((byte) (flag4));
	//   60  117:iload           6
	//   61  119:istore          5
					break label0;
	//   62  121:goto            127
				}
			}
			byte0 = 4;
	//   63  124:iconst_4        
	//   64  125:istore          5
		}
		linearlayout.setVisibility(((int) (byte0)));
	//   65  127:aload           7
	//   66  129:iload           5
	//   67  131:invokevirtual   #399 <Method void LinearLayout.setVisibility(int)>
	//   68  134:return          
	}

	private boolean Q()
	{
		AssetNetworkUIService assetnetworkuiservice = Assembler.getInstance().getNetworkUIService(com.irobot.home.util.j.k());
	//    0    0:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//    1    3:invokestatic    #410 <Method AssetId j.k()>
	//    2    6:invokevirtual   #414 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//    3    9:astore_1        
		if(assetnetworkuiservice == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		if(assetnetworkuiservice.getServiceData().getConnectionStateForRemote() == NetworkState.Connected)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #420 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  10   20:invokevirtual   #426 <Method NetworkState AssetNetworkUIServiceData.getConnectionStateForRemote()>
	//*  11   23:getstatic       #432 <Field NetworkState NetworkState.Connected>
	//*  12   26:if_acmpne       31
		{
			return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		} else
		{
			R();
	//   15   31:aload_0         
	//   16   32:invokespecial   #434 <Method void R()>
			return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
		}
	}

	private void R()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (getActivity())))).setMessage(0x7f0f02e9).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).setNeutralButton(0x7f0f0356, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (a.c(CurrentConnectionState.Error)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field be a>
			//    2    4:getstatic       #28  <Field CurrentConnectionState CurrentConnectionState.Error>
			//    3    7:invokevirtual   #32  <Method String be.c(CurrentConnectionState)>
			//    4   10:astore_1        
				if(com.irobot.home.util.j.i(((String) (dialoginterface))))
			//*   5   11:aload_1         
			//*   6   12:invokestatic    #38  <Method boolean j.i(String)>
			//*   7   15:ifeq            45
				{
					WebViewActivity_.a(((android.content.Context) (a.getActivity()))).a(((String) (dialoginterface))).a(Integer.valueOf(0x7f0f05d8)).a();
			//    8   18:aload_0         
			//    9   19:getfield        #17  <Field be a>
			//   10   22:invokevirtual   #42  <Method Activity be.getActivity()>
			//   11   25:invokestatic    #47  <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
			//   12   28:aload_1         
			//   13   29:invokevirtual   #52  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
			//   14   32:ldc1            #53  <Int 0x7f0f05d8>
			//   15   34:invokestatic    #59  <Method Integer Integer.valueOf(int)>
			//   16   37:invokevirtual   #62  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
			//   17   40:invokevirtual   #65  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
			//   18   43:pop             
					return;
			//   19   44:return          
				} else
				{
					a.u();
			//   20   45:aload_0         
			//   21   46:getfield        #17  <Field be a>
			//   22   49:invokevirtual   #68  <Method void be.u()>
					return;
			//   23   52:return          
				}
			}

			final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    0    0:new             #436 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #440 <Method Activity getActivity()>
	//    4    8:invokespecial   #443 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    5   11:ldc2            #444 <Int 0x7f0f02e9>
	//    6   14:invokevirtual   #448 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    7   17:ldc2            #449 <Int 0x7f0f05bb>
	//    8   20:aconst_null     
	//    9   21:invokevirtual   #453 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   10   24:ldc2            #454 <Int 0x7f0f0356>
	//   11   27:new             #14  <Class be$12>
	//   12   30:dup             
	//   13   31:aload_0         
	//   14   32:invokespecial   #455 <Method void be$12(be)>
	//   15   35:invokevirtual   #458 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   38:invokevirtual   #462 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   17   41:pop             
	//   18   42:return          
	}

	private void S()
	{
		if(isAdded() && v.getVisibility() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifeq            29
	//*   3    7:aload_0         
	//*   4    8:getfield        #464 <Field TextView v>
	//*   5   11:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*   6   14:ifeq            29
		{
			v.setVisibility(0);
	//    7   17:aload_0         
	//    8   18:getfield        #464 <Field TextView v>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			X();
	//   11   25:aload_0         
	//   12   26:invokespecial   #467 <Method void X()>
		}
	//   13   29:return          
	}

	private void T()
	{
		if(isAdded() && v.getVisibility() != 8)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #464 <Field TextView v>
	//*   5   11:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*   6   14:bipush          8
	//*   7   16:icmpeq          32
		{
			v.setVisibility(8);
	//    8   19:aload_0         
	//    9   20:getfield        #464 <Field TextView v>
	//   10   23:bipush          8
	//   11   25:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			X();
	//   12   28:aload_0         
	//   13   29:invokespecial   #467 <Method void X()>
		}
	//   14   32:return          
	}

	private void U()
	{
		if(com.irobot.home.util.a.a())
	//*   0    0:invokestatic    #471 <Method boolean com.irobot.home.util.a.a()>
	//*   1    3:ifeq            16
		{
			j(true);
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:invokespecial   #474 <Method void j(boolean)>
			T();
	//    5   11:aload_0         
	//    6   12:invokespecial   #476 <Method void T()>
			return;
	//    7   15:return          
		}
		j(false);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokespecial   #474 <Method void j(boolean)>
		if(aT)
	//*  11   21:aload_0         
	//*  12   22:getfield        #478 <Field boolean aT>
	//*  13   25:ifeq            32
			S();
	//   14   28:aload_0         
	//   15   29:invokespecial   #480 <Method void S()>
	//   16   32:return          
	}

	private void V()
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		aR = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #482 <Field boolean aR>
		if(isAdded() && w.getVisibility() != 0)
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #264 <Method boolean isAdded()>
	//*   9   17:ifeq            42
	//*  10   20:aload_0         
	//*  11   21:getfield        #484 <Field TextView w>
	//*  12   24:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*  13   27:ifeq            42
		{
			w.setVisibility(0);
	//   14   30:aload_0         
	//   15   31:getfield        #484 <Field TextView w>
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			X();
	//   18   38:aload_0         
	//   19   39:invokespecial   #467 <Method void X()>
		}
		HashSet hashset = new HashSet() {

			final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void HashSet()>
				add(((Object) (FloorPlanListItemMode.All)));
			//    5    9:aload_0         
			//    6   10:getstatic       #24  <Field FloorPlanListItemMode FloorPlanListItemMode.All>
			//    7   13:invokevirtual   #28  <Method boolean add(Object)>
			//    8   16:pop             
			//    9   17:return          
			}
		}
;
	//   20   42:new             #16  <Class be$13>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:invokespecial   #485 <Method void be$13(be)>
	//   24   50:astore_1        
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//   25   51:invokestatic    #491 <Method MapsUIServiceData MapsUIServiceData.create()>
	//   26   54:astore_2        
		mapsuiservicedata.setFloorPlanListItemMode(((HashSet) (hashset)));
	//   27   55:aload_2         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #495 <Method void MapsUIServiceData.setFloorPlanListItemMode(HashSet)>
		bf.sendCommand(MapsUIServiceCommand.SetFloorListItemModes, mapsuiservicedata);
	//   30   60:aload_0         
	//   31   61:getfield        #243 <Field MapsUIService bf>
	//   32   64:getstatic       #501 <Field MapsUIServiceCommand MapsUIServiceCommand.SetFloorListItemModes>
	//   33   67:aload_2         
	//   34   68:invokevirtual   #507 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		if(aZ)
	//*  35   71:aload_0         
	//*  36   72:getfield        #225 <Field boolean aZ>
	//*  37   75:ifeq            87
		{
			O();
	//   38   78:aload_0         
	//   39   79:invokespecial   #509 <Method void O()>
			aZ = false;
	//   40   82:aload_0         
	//   41   83:iconst_0        
	//   42   84:putfield        #225 <Field boolean aZ>
		}
	//   43   87:return          
	}

	private void W()
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		aR = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #482 <Field boolean aR>
		if(isAdded() && w.getVisibility() != 8)
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #264 <Method boolean isAdded()>
	//*   9   17:ifeq            45
	//*  10   20:aload_0         
	//*  11   21:getfield        #484 <Field TextView w>
	//*  12   24:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*  13   27:bipush          8
	//*  14   29:icmpeq          45
		{
			w.setVisibility(8);
	//   15   32:aload_0         
	//   16   33:getfield        #484 <Field TextView w>
	//   17   36:bipush          8
	//   18   38:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			X();
	//   19   41:aload_0         
	//   20   42:invokespecial   #467 <Method void X()>
		}
		Q.setEnabled(false);
	//   21   45:aload_0         
	//   22   46:getfield        #511 <Field CircleButton Q>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
		O.setEnabled(false);
	//   25   53:aload_0         
	//   26   54:getfield        #518 <Field CircleButton O>
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
		S.setEnabled(false);
	//   29   61:aload_0         
	//   30   62:getfield        #352 <Field CircleButton S>
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
		T.setClickable(false);
	//   33   69:aload_0         
	//   34   70:getfield        #520 <Field PercentageRingView T>
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #525 <Method void PercentageRingView.setClickable(boolean)>
	//   37   77:return          
	}

	private void X()
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j1;
		int k1;
		for(j1 = 0; i1 < i.getChildCount(); j1 = k1)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #293 <Field LinearLayout i>
	//*   7    9:invokevirtual   #528 <Method int LinearLayout.getChildCount()>
	//*   8   12:icmpge          44
		{
			k1 = j1;
	//    9   15:iload_2         
	//   10   16:istore_3        
			if(i.getChildAt(i1).getVisibility() == 0)
	//*  11   17:aload_0         
	//*  12   18:getfield        #293 <Field LinearLayout i>
	//*  13   21:iload_1         
	//*  14   22:invokevirtual   #532 <Method View LinearLayout.getChildAt(int)>
	//*  15   25:invokevirtual   #535 <Method int View.getVisibility()>
	//*  16   28:ifne            35
				k1 = j1 + 1;
	//   17   31:iload_2         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_3        
			i1++;
	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
		}

	//   25   39:iload_3         
	//   26   40:istore_2        
	//*  27   41:goto            4
		i.setWeightSum(j1);
	//   28   44:aload_0         
	//   29   45:getfield        #293 <Field LinearLayout i>
	//   30   48:iload_2         
	//   31   49:i2f             
	//   32   50:invokevirtual   #539 <Method void LinearLayout.setWeightSum(float)>
	//   33   53:return          
	}

	private void Y()
	{
	//    0    0:return          
	}

	static ScheduleTypeSupported a(be be1, ScheduleTypeSupported scheduletypesupported)
	{
		be1.bb = scheduletypesupported;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #542 <Field ScheduleTypeSupported bb>
		return scheduletypesupported;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static be a(d d1, i.a a1)
	{
		bf bf1 = new bf();
	//    0    0:new             #545 <Class bf>
	//    1    3:dup             
	//    2    4:invokespecial   #546 <Method void bf()>
	//    3    7:astore_2        
		((be) (bf1)).a(d1);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #549 <Method void a(be$d)>
		((be) (bf1)).a(a1);
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #552 <Method void a(i$a)>
		return ((be) (bf1));
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	static void a(be be1)
	{
		be1.N();
	//    0    0:aload_0         
	//    1    1:invokespecial   #554 <Method void N()>
	//    2    4:return          
	}

	static void a(be be1, EvacuationDockMode evacuationdockmode)
	{
		be1.b(evacuationdockmode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #558 <Method void b(EvacuationDockMode)>
	//    3    5:return          
	}

	static void a(be be1, String s1)
	{
		be1.f(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #563 <Method void f(String)>
	//    3    5:return          
	}

	static void a(be be1, String s1, ArrayList arraylist)
	{
		be1.a(s1, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #567 <Method void a(String, ArrayList)>
	//    4    6:return          
	}

	static void a(be be1, ArrayList arraylist, int i1, int j1, boolean flag, boolean flag1)
	{
		be1.a(arraylist, i1, j1, flag, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #571 <Method void a(ArrayList, int, int, boolean, boolean)>
	//    7   11:return          
	}

	private void a(String s1, ArrayList arraylist)
	{
		if(com.irobot.home.util.j.a(((android.app.Fragment) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #574 <Method boolean j.a(android.app.Fragment)>
	//*   2    4:ifeq            20
			e(com.irobot.home.util.j.a(((android.content.Context) (getActivity())), s1, arraylist));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #440 <Method Activity getActivity()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokestatic    #577 <Method String j.a(android.content.Context, String, ArrayList)>
	//    9   17:invokevirtual   #579 <Method void e(String)>
	//   10   20:return          
	}

	private void a(ArrayList arraylist, int i1, int j1, boolean flag, boolean flag1)
	{
		H();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #583 <Method void H()>
		if(!com.irobot.home.util.j.a(((android.app.Fragment) (this))))
	//*   2    4:aload_0         
	//*   3    5:invokestatic    #574 <Method boolean j.a(android.app.Fragment)>
	//*   4    8:ifne            21
		{
			com.irobot.home.util.o.d("RobotCleanFragment", "Could not load floor list because fragment is not added.");
	//    5   11:ldc2            #585 <String "RobotCleanFragment">
	//    6   14:ldc2            #587 <String "Could not load floor list because fragment is not added.">
	//    7   17:invokestatic    #592 <Method void o.d(String, String)>
			return;
	//    8   20:return          
		}
		g(flag);
	//    9   21:aload_0         
	//   10   22:iload           4
	//   11   24:invokevirtual   #594 <Method void g(boolean)>
		arraylist = ((ArrayList) (getResources().getString(0x7f0f0335, new Object[] {
			Integer.valueOf(j1)
		})));
	//   12   27:aload_0         
	//   13   28:invokevirtual   #317 <Method Resources getResources()>
	//   14   31:ldc2            #595 <Int 0x7f0f0335>
	//   15   34:iconst_1        
	//   16   35:anewarray       Object[]
	//   17   38:dup             
	//   18   39:iconst_0        
	//   19   40:iload_3         
	//   20   41:invokestatic    #603 <Method Integer Integer.valueOf(int)>
	//   21   44:aastore         
	//   22   45:invokevirtual   #607 <Method String Resources.getString(int, Object[])>
	//   23   48:astore_1        
		T.setRingFillPercentile(j1);
	//   24   49:aload_0         
	//   25   50:getfield        #520 <Field PercentageRingView T>
	//   26   53:iload_3         
	//   27   54:invokevirtual   #610 <Method void PercentageRingView.setRingFillPercentile(int)>
		T.setRingLabelText("");
	//   28   57:aload_0         
	//   29   58:getfield        #520 <Field PercentageRingView T>
	//   30   61:ldc2            #612 <String "">
	//   31   64:invokevirtual   #615 <Method void PercentageRingView.setRingLabelText(String)>
		Object obj = ((Object) (T));
	//   32   67:aload_0         
	//   33   68:getfield        #520 <Field PercentageRingView T>
	//   34   71:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   35   73:new             #617 <Class StringBuilder>
	//   36   76:dup             
	//   37   77:invokespecial   #618 <Method void StringBuilder()>
	//   38   80:astore          7
		stringbuilder.append(getResources().getString(0x7f0f01b1));
	//   39   82:aload           7
	//   40   84:aload_0         
	//   41   85:invokevirtual   #317 <Method Resources getResources()>
	//   42   88:ldc2            #619 <Int 0x7f0f01b1>
	//   43   91:invokevirtual   #622 <Method String Resources.getString(int)>
	//   44   94:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   45   97:pop             
		stringbuilder.append(((String) (arraylist)));
	//   46   98:aload           7
	//   47  100:aload_1         
	//   48  101:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   49  104:pop             
		((PercentageRingView) (obj)).setContentDescription(((CharSequence) (stringbuilder.toString())));
	//   50  105:aload           6
	//   51  107:aload           7
	//   52  109:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   53  112:invokevirtual   #634 <Method void PercentageRingView.setContentDescription(CharSequence)>
		U.setText(((CharSequence) (arraylist)));
	//   54  115:aload_0         
	//   55  116:getfield        #636 <Field CustomTextView U>
	//   56  119:aload_1         
	//   57  120:invokevirtual   #641 <Method void CustomTextView.setText(CharSequence)>
		arraylist = ((ArrayList) (new StringBuilder()));
	//   58  123:new             #617 <Class StringBuilder>
	//   59  126:dup             
	//   60  127:invokespecial   #618 <Method void StringBuilder()>
	//   61  130:astore_1        
		((StringBuilder) (arraylist)).append("Has completed maps: ");
	//   62  131:aload_1         
	//   63  132:ldc2            #643 <String "Has completed maps: ">
	//   64  135:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   65  138:pop             
		((StringBuilder) (arraylist)).append(flag1);
	//   66  139:aload_1         
	//   67  140:iload           5
	//   68  142:invokevirtual   #646 <Method StringBuilder StringBuilder.append(boolean)>
	//   69  145:pop             
		com.irobot.home.util.o.b("RobotCleanFragment", ((StringBuilder) (arraylist)).toString());
	//   70  146:ldc2            #585 <String "RobotCleanFragment">
	//   71  149:aload_1         
	//   72  150:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   73  153:invokestatic    #648 <Method void o.b(String, String)>
		if(flag1)
	//*  74  156:iload           5
	//*  75  158:ifeq            215
		{
			if(O.getAlpha() == 1.0F)
	//*  76  161:aload_0         
	//*  77  162:getfield        #518 <Field CircleButton O>
	//*  78  165:invokevirtual   #652 <Method float CircleButton.getAlpha()>
	//*  79  168:fconst_1        
	//*  80  169:fcmpl           
	//*  81  170:ifne            189
			{
				T.setClickable(false);
	//   82  173:aload_0         
	//   83  174:getfield        #520 <Field PercentageRingView T>
	//   84  177:iconst_0        
	//   85  178:invokevirtual   #525 <Method void PercentageRingView.setClickable(boolean)>
				O.setEnabled(true);
	//   86  181:aload_0         
	//   87  182:getfield        #518 <Field CircleButton O>
	//   88  185:iconst_1        
	//   89  186:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
			}
			arraylist = ((ArrayList) (N));
	//   90  189:aload_0         
	//   91  190:getfield        #654 <Field CustomTextView N>
	//   92  193:astore_1        
			obj = ((Object) (getResources()));
	//   93  194:aload_0         
	//   94  195:invokevirtual   #317 <Method Resources getResources()>
	//   95  198:astore          6
			i1 = 0x7f060076;
	//   96  200:ldc2            #655 <Int 0x7f060076>
	//   97  203:istore_2        
		} else
	//*  98  204:aload_1         
	//*  99  205:aload           6
	//* 100  207:iload_2         
	//* 101  208:invokevirtual   #658 <Method int Resources.getColor(int)>
	//* 102  211:invokevirtual   #661 <Method void CustomTextView.setTextColor(int)>
	//* 103  214:return          
		{
			if(T.getAlpha() == 1.0F)
	//* 104  215:aload_0         
	//* 105  216:getfield        #520 <Field PercentageRingView T>
	//* 106  219:invokevirtual   #662 <Method float PercentageRingView.getAlpha()>
	//* 107  222:fconst_1        
	//* 108  223:fcmpl           
	//* 109  224:ifne            243
			{
				T.setClickable(true);
	//  110  227:aload_0         
	//  111  228:getfield        #520 <Field PercentageRingView T>
	//  112  231:iconst_1        
	//  113  232:invokevirtual   #525 <Method void PercentageRingView.setClickable(boolean)>
				O.setEnabled(false);
	//  114  235:aload_0         
	//  115  236:getfield        #518 <Field CircleButton O>
	//  116  239:iconst_0        
	//  117  240:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
			}
			arraylist = ((ArrayList) (N));
	//  118  243:aload_0         
	//  119  244:getfield        #654 <Field CustomTextView N>
	//  120  247:astore_1        
			obj = ((Object) (getResources()));
	//  121  248:aload_0         
	//  122  249:invokevirtual   #317 <Method Resources getResources()>
	//  123  252:astore          6
			i1 = 0x7f06006d;
	//  124  254:ldc2            #663 <Int 0x7f06006d>
	//  125  257:istore_2        
		}
		((CustomTextView) (arraylist)).setTextColor(((Resources) (obj)).getColor(i1));
	//* 126  258:goto            204
	}

	static boolean a(be be1, boolean flag)
	{
		be1.aN = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #200 <Field boolean aN>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static com.irobot.home.m.b b(be be1)
	{
		return be1.bd;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field b bd>
	//    2    4:areturn         
	}

	private void b(EvacuationDockMode evacuationdockmode)
	{
		if(com.irobot.home.util.j.a(((android.app.Fragment) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #574 <Method boolean j.a(android.app.Fragment)>
	//*   2    4:ifeq            16
		{
			a(evacuationdockmode);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #668 <Method void a(EvacuationDockMode)>
			K();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #670 <Method void K()>
		}
	//    8   16:return          
	}

	static boolean b(be be1, boolean flag)
	{
		be1.aW = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #219 <Field boolean aW>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean c(be be1)
	{
		return be1.aN;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field boolean aN>
	//    2    4:ireturn         
	}

	static boolean c(be be1, boolean flag)
	{
		be1.aX = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #221 <Field boolean aX>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static MissionSubsystem d(be be1)
	{
		return be1.be;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field MissionSubsystem be>
	//    2    4:areturn         
	}

	static boolean d(be be1, boolean flag)
	{
		be1.aY = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #223 <Field boolean aY>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void e(be be1)
	{
		be1.Y();
	//    0    0:aload_0         
	//    1    1:invokespecial   #674 <Method void Y()>
	//    2    4:return          
	}

	static boolean e(be be1, boolean flag)
	{
		be1.aT = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #478 <Field boolean aT>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void f(be be1)
	{
		be1.U();
	//    0    0:aload_0         
	//    1    1:invokespecial   #676 <Method void U()>
	//    2    4:return          
	}

	private void f(String s1)
	{
		aP = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #678 <Field String aP>
		L();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #680 <Method void L()>
	//    5    9:return          
	}

	static boolean f(be be1, boolean flag)
	{
		be1.aQ = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #682 <Field boolean aQ>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private String g(String s1)
	{
label0:
		{
			Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #617 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #618 <Method void StringBuilder()>
	//    3    7:astore_2        
			((StringBuilder) (obj)).append("attempting to obtain content for key: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #685 <String "attempting to obtain content for key: ">
	//    6   12:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
			((StringBuilder) (obj)).append(s1);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
			com.irobot.home.util.o.b("RobotCleanFragment", ((StringBuilder) (obj)).toString());
	//   12   22:ldc2            #585 <String "RobotCleanFragment">
	//   13   25:aload_2         
	//   14   26:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   15   29:invokestatic    #648 <Method void o.b(String, String)>
			if(!com.irobot.home.util.j.i(s1) || E == null || E.otherContent == null)
				break label0;
	//   16   32:aload_1         
	//   17   33:invokestatic    #688 <Method boolean j.i(String)>
	//   18   36:ifeq            104
	//   19   39:aload_0         
	//   20   40:getfield        #198 <Field RobotErrorHelpContentList E>
	//   21   43:ifnull          104
	//   22   46:aload_0         
	//   23   47:getfield        #198 <Field RobotErrorHelpContentList E>
	//   24   50:getfield        #694 <Field List RobotErrorHelpContentList.otherContent>
	//   25   53:ifnull          104
			obj = ((Object) (E.otherContent.iterator()));
	//   26   56:aload_0         
	//   27   57:getfield        #198 <Field RobotErrorHelpContentList E>
	//   28   60:getfield        #694 <Field List RobotErrorHelpContentList.otherContent>
	//   29   63:invokeinterface #700 <Method Iterator List.iterator()>
	//   30   68:astore_2        
			RobotErrorHelpContent roboterrorhelpcontent;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   31   69:aload_2         
	//   32   70:invokeinterface #705 <Method boolean Iterator.hasNext()>
	//   33   75:ifeq            104
				roboterrorhelpcontent = (RobotErrorHelpContent)((Iterator) (obj)).next();
	//   34   78:aload_2         
	//   35   79:invokeinterface #709 <Method Object Iterator.next()>
	//   36   84:checkcast       #711 <Class RobotErrorHelpContent>
	//   37   87:astore_3        
			} while(!s1.equalsIgnoreCase(roboterrorhelpcontent.id));
	//   38   88:aload_1         
	//   39   89:aload_3         
	//   40   90:getfield        #714 <Field String RobotErrorHelpContent.id>
	//   41   93:invokevirtual   #719 <Method boolean String.equalsIgnoreCase(String)>
	//   42   96:ifeq            69
			return roboterrorhelpcontent.content;
	//   43   99:aload_3         
	//   44  100:getfield        #722 <Field String RobotErrorHelpContent.content>
	//   45  103:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   46  104:new             #617 <Class StringBuilder>
	//   47  107:dup             
	//   48  108:invokespecial   #618 <Method void StringBuilder()>
	//   49  111:astore_2        
		stringbuilder.append("helpContent Url is not available for key: ");
	//   50  112:aload_2         
	//   51  113:ldc2            #724 <String "helpContent Url is not available for key: ">
	//   52  116:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   53  119:pop             
		stringbuilder.append(s1);
	//   54  120:aload_2         
	//   55  121:aload_1         
	//   56  122:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   57  125:pop             
		com.irobot.home.util.o.e("RobotCleanFragment", stringbuilder.toString());
	//   58  126:ldc2            #585 <String "RobotCleanFragment">
	//   59  129:aload_2         
	//   60  130:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   61  133:invokestatic    #726 <Method void o.e(String, String)>
		return null;
	//   62  136:aconst_null     
	//   63  137:areturn         
	}

	static void g(be be1)
	{
		be1.V();
	//    0    0:aload_0         
	//    1    1:invokespecial   #728 <Method void V()>
	//    2    4:return          
	}

	static boolean g(be be1, boolean flag)
	{
		be1.aS = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #730 <Field boolean aS>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void h(be be1)
	{
		be1.W();
	//    0    0:aload_0         
	//    1    1:invokespecial   #732 <Method void W()>
	//    2    4:return          
	}

	private boolean h(String s1)
	{
		if(com.irobot.home.util.j.i(s1))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #688 <Method boolean j.i(String)>
	//*   2    4:ifeq            30
		{
			WebViewActivity_.a(((android.app.Fragment) (this))).a(s1).a(Integer.valueOf(0x7f0f05d8)).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #737 <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.app.Fragment)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #742 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    7   15:ldc2            #743 <Int 0x7f0f05d8>
	//    8   18:invokestatic    #603 <Method Integer Integer.valueOf(int)>
	//    9   21:invokevirtual   #746 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   10   24:invokevirtual   #749 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   11   27:pop             
			return true;
	//   12   28:iconst_1        
	//   13   29:ireturn         
		} else
		{
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		}
	}

	static com.irobot.home.util.b i(be be1)
	{
		return be1.aM;
	//    0    0:aload_0         
	//    1    1:getfield        #752 <Field com.irobot.home.util.b aM>
	//    2    4:areturn         
	}

	private void i(String s1)
	{
		if(isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifeq            49
		{
			android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((android.content.Context) (getActivity())));
	//    3    7:new             #436 <Class android.app.AlertDialog$Builder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokevirtual   #440 <Method Activity getActivity()>
	//    7   15:invokespecial   #443 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    8   18:astore_2        
			builder.setMessage(((CharSequence) (s1)));
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #755 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   12   24:pop             
			builder.setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null)));
	//   13   25:aload_2         
	//   14   26:ldc2            #449 <Int 0x7f0f05bb>
	//   15   29:aconst_null     
	//   16   30:invokevirtual   #453 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   17   33:pop             
			s1 = ((String) (builder.create()));
	//   18   34:aload_2         
	//   19   35:invokevirtual   #757 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   20   38:astore_1        
			((AlertDialog) (s1)).requestWindowFeature(1);
	//   21   39:aload_1         
	//   22   40:iconst_1        
	//   23   41:invokevirtual   #763 <Method boolean AlertDialog.requestWindowFeature(int)>
	//   24   44:pop             
			((AlertDialog) (s1)).show();
	//   25   45:aload_1         
	//   26   46:invokevirtual   #765 <Method void AlertDialog.show()>
		}
	//   27   49:return          
	}

	private boolean i(boolean flag)
	{
		boolean flag1;
		boolean flag2;
		flag2 = com.irobot.home.util.j.j().a().isVirtual();
	//    0    0:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//    1    3:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//    2    6:invokevirtual   #779 <Method boolean AssetInfo.isVirtual()>
	//    3    9:istore          4
		flag1 = false;
	//    4   11:iconst_0        
	//    5   12:istore_3        
		if(flag2 || com.irobot.home.util.j.a()) goto _L2; else goto _L1
	//    6   13:iload           4
	//    7   15:ifne            43
	//    8   18:invokestatic    #780 <Method boolean j.a()>
	//    9   21:ifne            43
_L1:
		int i1 = 0x7f0f04db;
	//   10   24:ldc2            #781 <Int 0x7f0f04db>
	//   11   27:istore_2        
_L6:
		Object obj = ((Object) (getString(i1)));
	//   12   28:aload_0         
	//   13   29:iload_2         
	//   14   30:invokevirtual   #782 <Method String getString(int)>
	//   15   33:astore          5
_L4:
		i(((String) (obj)));
	//   16   35:aload_0         
	//   17   36:aload           5
	//   18   38:invokespecial   #784 <Method void i(String)>
		return false;
	//   19   41:iconst_0        
	//   20   42:ireturn         
_L2:
		obj = ((Object) (Assembler.getInstance().getNetworkUIService(com.irobot.home.util.j.k())));
	//   21   43:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//   22   46:invokestatic    #410 <Method AssetId j.k()>
	//   23   49:invokevirtual   #414 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   24   52:astore          5
		if(obj == null)
	//*  25   54:aload           5
	//*  26   56:ifnonnull       61
			return false;
	//   27   59:iconst_0        
	//   28   60:ireturn         
		obj = ((Object) (((AssetNetworkUIService) (obj)).getServiceData().getCurrentConnectionState()));
	//   29   61:aload           5
	//   30   63:invokevirtual   #420 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   31   66:invokevirtual   #788 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//   32   69:astore          5
		if(!((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.Error))) && !((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.Disconnected))) && !((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.Connecting))))
	//*  33   71:aload           5
	//*  34   73:getstatic       #794 <Field CurrentConnectionState CurrentConnectionState.Error>
	//*  35   76:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*  36   79:ifne            112
	//*  37   82:aload           5
	//*  38   84:getstatic       #801 <Field CurrentConnectionState CurrentConnectionState.Disconnected>
	//*  39   87:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*  40   90:ifne            112
	//*  41   93:aload           5
	//*  42   95:getstatic       #804 <Field CurrentConnectionState CurrentConnectionState.Connecting>
	//*  43   98:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*  44  101:ifeq            107
	//*  45  104:goto            112
			i1 = 0;
	//   46  107:iconst_0        
	//   47  108:istore_2        
		else
	//*  48  109:goto            114
			i1 = 1;
	//   49  112:iconst_1        
	//   50  113:istore_2        
		if(i1 != 0)
	//*  51  114:iload_2         
	//*  52  115:ifeq            125
		{
			i1 = 0x7f0f0745;
	//   53  118:ldc2            #805 <Int 0x7f0f0745>
	//   54  121:istore_2        
			continue; /* Loop/switch isn't completed */
	//   55  122:goto            28
		}
		if(!((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.RemoteMissing))))
			break; /* Loop/switch isn't completed */
	//   56  125:aload           5
	//   57  127:getstatic       #808 <Field CurrentConnectionState CurrentConnectionState.RemoteMissing>
	//   58  130:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//   59  133:ifeq            181
		if(flag)
	//*  60  136:iload_1         
	//*  61  137:ifeq            142
			return true;
	//   62  140:iconst_1        
	//   63  141:ireturn         
		obj = ((Object) (com.irobot.home.util.j.j()));
	//   64  142:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//   65  145:astore          5
		if(obj == null)
	//*  66  147:aload           5
	//*  67  149:ifnonnull       154
			return false;
	//   68  152:iconst_0        
	//   69  153:ireturn         
		obj = ((Object) (getString(0x7f0f0443, new Object[] {
			((com.irobot.home.model.a) (obj)).a().getName()
		})));
	//   70  154:aload_0         
	//   71  155:ldc2            #809 <Int 0x7f0f0443>
	//   72  158:iconst_1        
	//   73  159:anewarray       Object[]
	//   74  162:dup             
	//   75  163:iconst_0        
	//   76  164:aload           5
	//   77  166:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//   78  169:invokevirtual   #812 <Method String AssetInfo.getName()>
	//   79  172:aastore         
	//   80  173:invokevirtual   #813 <Method String getString(int, Object[])>
	//   81  176:astore          5
		if(true) goto _L4; else goto _L3
	//   82  178:goto            35
_L3:
label0:
		{
			if(!((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.ConnectedLocally))))
	//*  83  181:aload           5
	//*  84  183:getstatic       #816 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*  85  186:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*  86  189:ifne            205
			{
				flag = flag1;
	//   87  192:iload_3         
	//   88  193:istore_1        
				if(!((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.ConnectedRemotely))))
					break label0;
	//   89  194:aload           5
	//   90  196:getstatic       #819 <Field CurrentConnectionState CurrentConnectionState.ConnectedRemotely>
	//   91  199:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//   92  202:ifeq            207
			}
			flag = true;
	//   93  205:iconst_1        
	//   94  206:istore_1        
		}
		return flag;
	//   95  207:iload_1         
	//   96  208:ireturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	private void j(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			byte0 = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		else
	//*   4    6:goto            12
			byte0 = 8;
	//    5    9:bipush          8
	//    6   11:istore_2        
		if(isAdded() && x.getVisibility() != byte0)
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #264 <Method boolean isAdded()>
	//*   9   16:ifeq            42
	//*  10   19:aload_0         
	//*  11   20:getfield        #821 <Field TextView x>
	//*  12   23:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*  13   26:iload_2         
	//*  14   27:icmpeq          42
		{
			x.setVisibility(((int) (byte0)));
	//   15   30:aload_0         
	//   16   31:getfield        #821 <Field TextView x>
	//   17   34:iload_2         
	//   18   35:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			X();
	//   19   38:aload_0         
	//   20   39:invokespecial   #467 <Method void X()>
		}
	//   21   42:return          
	}

	private void k(boolean flag)
	{
		if(isAdded() && getActivity() != null && ad != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifeq            43
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #440 <Method Activity getActivity()>
	//*   5   11:ifnull          43
	//*   6   14:aload_0         
	//*   7   15:getfield        #823 <Field BatteryGaugeView ad>
	//*   8   18:ifnull          43
		{
			BatteryGaugeView batterygaugeview = ad;
	//    9   21:aload_0         
	//   10   22:getfield        #823 <Field BatteryGaugeView ad>
	//   11   25:astore_3        
			byte byte0;
			if(flag)
	//*  12   26:iload_1         
	//*  13   27:ifeq            35
				byte0 = 0;
	//   14   30:iconst_0        
	//   15   31:istore_2        
			else
	//*  16   32:goto            38
				byte0 = 8;
	//   17   35:bipush          8
	//   18   37:istore_2        
			batterygaugeview.setVisibility(((int) (byte0)));
	//   19   38:aload_3         
	//   20   39:iload_2         
	//   21   40:invokevirtual   #826 <Method void BatteryGaugeView.setVisibility(int)>
		}
	//   22   43:return          
	}

	public void A()
	{
		aM.a();
	//    0    0:aload_0         
	//    1    1:getfield        #752 <Field com.irobot.home.util.b aM>
	//    2    4:invokevirtual   #830 <Method void com.irobot.home.util.b.a()>
	//    3    7:return          
	}

	public void B()
	{
		be.sendServiceCommand(MissionUIServiceCommand.EvacDockQueryStatus, ((MissionUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field MissionSubsystem be>
	//    2    4:getstatic       #836 <Field MissionUIServiceCommand MissionUIServiceCommand.EvacDockQueryStatus>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #842 <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, MissionUIServiceData)>
	//    5   11:return          
	}

	public void C()
	{
		if(!com.irobot.home.util.j.a(((android.app.Fragment) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #574 <Method boolean j.a(android.app.Fragment)>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (com.irobot.home.util.j.j()));
	//    4    8:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//    5   11:astore          4
		if(obj != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          104
		{
			junit.b.a.a("Model asset must be cloud capable.", AssetCapabilityUtils.isCloudCapable(((com.irobot.home.model.a) (obj)).a()));
	//    8   18:ldc2            #844 <String "Model asset must be cloud capable.">
	//    9   21:aload           4
	//   10   23:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//   11   26:invokestatic    #850 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//   12   29:invokestatic    #855 <Method void junit.b.a.a(String, boolean)>
			obj = ((Object) (((w)obj).c()));
	//   13   32:aload           4
	//   14   34:checkcast       #857 <Class w>
	//   15   37:invokevirtual   #860 <Method Robot w.c()>
	//   16   40:astore          4
			boolean flag2 = ((Robot) (obj)).a().g();
	//   17   42:aload           4
	//   18   44:invokevirtual   #865 <Method RobotPreferences Robot.a()>
	//   19   47:invokevirtual   #869 <Method boolean RobotPreferences.g()>
	//   20   50:istore_3        
			boolean flag1 = false;
	//   21   51:iconst_0        
	//   22   52:istore_2        
			boolean flag;
			if(flag2 && ((Robot) (obj)).o().a() == 3)
	//*  23   53:iload_3         
	//*  24   54:ifeq            74
	//*  25   57:aload           4
	//*  26   59:invokevirtual   #872 <Method OtaUpgradeStatus Robot.o()>
	//*  27   62:invokevirtual   #876 <Method int OtaUpgradeStatus.a()>
	//*  28   65:iconst_3        
	//*  29   66:icmpne          74
				flag = true;
	//   30   69:iconst_1        
	//   31   70:istore_1        
			else
	//*  32   71:goto            76
				flag = false;
	//   33   74:iconst_0        
	//   34   75:istore_1        
			obj = ((Object) (p));
	//   35   76:aload_0         
	//   36   77:getfield        #388 <Field TextView p>
	//   37   80:astore          4
			byte byte0;
			if(flag)
	//*  38   82:iload_1         
	//*  39   83:ifeq            91
				byte0 = ((byte) (flag1));
	//   40   86:iload_2         
	//   41   87:istore_1        
			else
	//*  42   88:goto            94
				byte0 = 8;
	//   43   91:bipush          8
	//   44   93:istore_1        
			((TextView) (obj)).setVisibility(((int) (byte0)));
	//   45   94:aload           4
	//   46   96:iload_1         
	//   47   97:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			P();
	//   48  100:aload_0         
	//   49  101:invokespecial   #878 <Method void P()>
		}
	//   50  104:return          
	}

	public void D()
	{
		aM.b();
	//    0    0:aload_0         
	//    1    1:getfield        #752 <Field com.irobot.home.util.b aM>
	//    2    4:invokevirtual   #880 <Method void com.irobot.home.util.b.b()>
	//    3    7:return          
	}

	public void E()
	{
		if(ba)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field boolean ba>
	//*   2    4:ifeq            28
		{
			ba = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #227 <Field boolean ba>
			ad.setVisibility(0);
	//    6   12:aload_0         
	//    7   13:getfield        #823 <Field BatteryGaugeView ad>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #826 <Method void BatteryGaugeView.setVisibility(int)>
			h.setVisibility(0);
	//   10   20:aload_0         
	//   11   21:getfield        #367 <Field LinearLayout h>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #399 <Method void LinearLayout.setVisibility(int)>
		}
		if(isAdded() && getActivity() != null && k != null)
	//*  14   28:aload_0         
	//*  15   29:invokevirtual   #264 <Method boolean isAdded()>
	//*  16   32:ifeq            65
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #440 <Method Activity getActivity()>
	//*  19   39:ifnull          65
	//*  20   42:aload_0         
	//*  21   43:getfield        #371 <Field TextView k>
	//*  22   46:ifnull          65
			e(k.getText().toString());
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #371 <Field TextView k>
	//   26   54:invokevirtual   #884 <Method CharSequence TextView.getText()>
	//   27   57:invokeinterface #887 <Method String CharSequence.toString()>
	//   28   62:invokevirtual   #579 <Method void e(String)>
	//   29   65:return          
	}

	public void F()
	{
		if(!ba)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field boolean ba>
	//*   2    4:ifne            44
		{
			ba = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #227 <Field boolean ba>
			j.setVisibility(4);
	//    6   12:aload_0         
	//    7   13:getfield        #363 <Field TextView j>
	//    8   16:iconst_4        
	//    9   17:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			ad.setVisibility(4);
	//   10   20:aload_0         
	//   11   21:getfield        #823 <Field BatteryGaugeView ad>
	//   12   24:iconst_4        
	//   13   25:invokevirtual   #826 <Method void BatteryGaugeView.setVisibility(int)>
			k.setVisibility(4);
	//   14   28:aload_0         
	//   15   29:getfield        #371 <Field TextView k>
	//   16   32:iconst_4        
	//   17   33:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			h.setVisibility(4);
	//   18   36:aload_0         
	//   19   37:getfield        #367 <Field LinearLayout h>
	//   20   40:iconst_4        
	//   21   41:invokevirtual   #399 <Method void LinearLayout.setVisibility(int)>
		}
	//   22   44:return          
	}

	void G()
	{
		if(bi != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #889 <Field be$d bi>
	//*   2    4:ifnull          16
			bi.a();
	//    3    7:aload_0         
	//    4    8:getfield        #889 <Field be$d bi>
	//    5   11:invokeinterface #890 <Method void com.irobot.home.fragments.be$d.a()>
	//    6   16:return          
	}

	protected void H()
	{
		int i1;
		RobotCleanActivity robotcleanactivity;
		if(com.irobot.home.util.j.j().a().isVirtual())
	//*   0    0:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//*   1    3:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//*   2    6:invokevirtual   #779 <Method boolean AssetInfo.isVirtual()>
	//*   3    9:ifeq            37
		{
			robotcleanactivity = (RobotCleanActivity)getActivity();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #440 <Method Activity getActivity()>
	//    6   16:checkcast       #892 <Class RobotCleanActivity>
	//    7   19:astore_2        
			i1 = getResources().getColor(0x7f060079);
	//    8   20:aload_0         
	//    9   21:invokevirtual   #317 <Method Resources getResources()>
	//   10   24:ldc2            #893 <Int 0x7f060079>
	//   11   27:invokevirtual   #658 <Method int Resources.getColor(int)>
	//   12   30:istore_1        
		} else
	//*  13   31:aload_2         
	//*  14   32:iload_1         
	//*  15   33:invokevirtual   #895 <Method void RobotCleanActivity.f(int)>
	//*  16   36:return          
		{
			robotcleanactivity = (RobotCleanActivity)getActivity();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #440 <Method Activity getActivity()>
	//   19   41:checkcast       #892 <Class RobotCleanActivity>
	//   20   44:astore_2        
			i1 = 0xff000000;
	//   21   45:ldc2            #896 <Int 0xff000000>
	//   22   48:istore_1        
		}
		robotcleanactivity.f(i1);
	//*  23   49:goto            31
	}

	public void I()
	{
		j.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #363 <Field TextView j>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #465 <Method void TextView.setVisibility(int)>
		k.setVisibility(4);
	//    4    8:aload_0         
	//    5    9:getfield        #371 <Field TextView k>
	//    6   12:iconst_4        
	//    7   13:invokevirtual   #465 <Method void TextView.setVisibility(int)>
		aM.a(CurrentConnectionState.Connecting);
	//    8   16:aload_0         
	//    9   17:getfield        #752 <Field com.irobot.home.util.b aM>
	//   10   20:getstatic       #804 <Field CurrentConnectionState CurrentConnectionState.Connecting>
	//   11   23:invokevirtual   #899 <Method void com.irobot.home.util.b.a(CurrentConnectionState)>
	//   12   26:return          
	}

	protected void J()
	{
		com.irobot.home.util.o.b("RobotCleanFragment", "Sending Tianjin START Command");
	//    0    0:ldc2            #585 <String "RobotCleanFragment">
	//    1    3:ldc2            #901 <String "Sending Tianjin START Command">
	//    2    6:invokestatic    #648 <Method void o.b(String, String)>
		be.sendServiceCommand(MissionUIServiceCommand.EvacDockManualEvacuation, ((MissionUIServiceData) (null)));
	//    3    9:aload_0         
	//    4   10:getfield        #241 <Field MissionSubsystem be>
	//    5   13:getstatic       #904 <Field MissionUIServiceCommand MissionUIServiceCommand.EvacDockManualEvacuation>
	//    6   16:aconst_null     
	//    7   17:invokevirtual   #842 <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, MissionUIServiceData)>
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    8   20:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//    9   23:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//   10   26:astore_1        
		AnalyticsSubsystem.getInstance().trackEvacuationDockEmptyBinButtonPressed(assetinfo);
	//   11   27:invokestatic    #909 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   12   30:aload_1         
	//   13   31:invokevirtual   #913 <Method void AnalyticsSubsystem.trackEvacuationDockEmptyBinButtonPressed(AssetInfo)>
	//   14   34:return          
	}

	protected void K()
	{
		ImageView imageview = r;
	//    0    0:aload_0         
	//    1    1:getfield        #395 <Field ImageView r>
	//    2    4:astore_2        
		byte byte0;
		if(!c && !aU)
	//*   3    5:aload_0         
	//*   4    6:getfield        #915 <Field boolean c>
	//*   5    9:ifne            28
	//*   6   12:aload_0         
	//*   7   13:getfield        #215 <Field boolean aU>
	//*   8   16:ifeq            22
	//*   9   19:goto            28
			byte0 = 8;
	//   10   22:bipush          8
	//   11   24:istore_1        
		else
	//*  12   25:goto            30
			byte0 = 0;
	//   13   28:iconst_0        
	//   14   29:istore_1        
		imageview.setVisibility(((int) (byte0)));
	//   15   30:aload_2         
	//   16   31:iload_1         
	//   17   32:invokevirtual   #916 <Method void ImageView.setVisibility(int)>
		P();
	//   18   35:aload_0         
	//   19   36:invokespecial   #878 <Method void P()>
	//   20   39:return          
	}

	protected void L()
	{
		ImageView imageview = q;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field ImageView q>
	//    2    4:astore          4
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore_2        
		boolean flag2;
		if(imageview == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       18
			flag2 = true;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		else
	//*   9   15:goto            20
			flag2 = false;
	//   10   18:iconst_0        
	//   11   19:istore_3        
		if(aW && !flag2)
	//*  12   20:aload_0         
	//*  13   21:getfield        #219 <Field boolean aW>
	//*  14   24:ifeq            112
	//*  15   27:iload_3         
	//*  16   28:ifeq            34
	//*  17   31:goto            112
		{
			boolean flag = flag1;
	//   18   34:iload_2         
	//   19   35:istore_1        
			if(!com.irobot.home.util.j.i(aL))
	//*  20   36:aload_0         
	//*  21   37:getfield        #194 <Field String aL>
	//*  22   40:invokestatic    #688 <Method boolean j.i(String)>
	//*  23   43:ifne            63
				if(com.irobot.home.util.j.i(aP))
	//*  24   46:aload_0         
	//*  25   47:getfield        #678 <Field String aP>
	//*  26   50:invokestatic    #688 <Method boolean j.i(String)>
	//*  27   53:ifeq            61
					flag = flag1;
	//   28   56:iload_2         
	//   29   57:istore_1        
				else
	//*  30   58:goto            63
					flag = false;
	//   31   61:iconst_0        
	//   32   62:istore_1        
			if((aV || flag && !c) && com.irobot.home.util.j.a())
	//*  33   63:aload_0         
	//*  34   64:getfield        #217 <Field boolean aV>
	//*  35   67:ifne            81
	//*  36   70:iload_1         
	//*  37   71:ifeq            98
	//*  38   74:aload_0         
	//*  39   75:getfield        #915 <Field boolean c>
	//*  40   78:ifne            98
	//*  41   81:invokestatic    #780 <Method boolean j.a()>
	//*  42   84:ifeq            98
				q.setVisibility(0);
	//   43   87:aload_0         
	//   44   88:getfield        #390 <Field ImageView q>
	//   45   91:iconst_0        
	//   46   92:invokevirtual   #916 <Method void ImageView.setVisibility(int)>
			else
	//*  47   95:goto            107
				q.setVisibility(8);
	//   48   98:aload_0         
	//   49   99:getfield        #390 <Field ImageView q>
	//   50  102:bipush          8
	//   51  104:invokevirtual   #916 <Method void ImageView.setVisibility(int)>
			P();
	//   52  107:aload_0         
	//   53  108:invokespecial   #878 <Method void P()>
			return;
	//   54  111:return          
		} else
		{
			com.irobot.home.util.o.c("RobotCleanFragment", String.format("Failed to update alert icon. Should allow: %b, is null: %b", new Object[] {
				Boolean.valueOf(aW), Boolean.valueOf(flag2)
			}));
	//   55  112:ldc2            #585 <String "RobotCleanFragment">
	//   56  115:ldc2            #918 <String "Failed to update alert icon. Should allow: %b, is null: %b">
	//   57  118:iconst_2        
	//   58  119:anewarray       Object[]
	//   59  122:dup             
	//   60  123:iconst_0        
	//   61  124:aload_0         
	//   62  125:getfield        #219 <Field boolean aW>
	//   63  128:invokestatic    #923 <Method Boolean Boolean.valueOf(boolean)>
	//   64  131:aastore         
	//   65  132:dup             
	//   66  133:iconst_1        
	//   67  134:iload_3         
	//   68  135:invokestatic    #923 <Method Boolean Boolean.valueOf(boolean)>
	//   69  138:aastore         
	//   70  139:invokestatic    #927 <Method String String.format(String, Object[])>
	//   71  142:invokestatic    #929 <Method void o.c(String, String)>
			return;
	//   72  145:return          
		}
	}

	public String M()
	{
		return aP;
	//    0    0:aload_0         
	//    1    1:getfield        #678 <Field String aP>
	//    2    4:areturn         
	}

	void a()
	{
		if(ae != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field AnimatorSet ae>
	//*   2    4:ifnull          14
			ae.removeAllListeners();
	//    3    7:aload_0         
	//    4    8:getfield        #931 <Field AnimatorSet ae>
	//    5   11:invokevirtual   #934 <Method void AnimatorSet.removeAllListeners()>
		ae = new AnimatorSet();
	//    6   14:aload_0         
	//    7   15:new             #338 <Class AnimatorSet>
	//    8   18:dup             
	//    9   19:invokespecial   #339 <Method void AnimatorSet()>
	//   10   22:putfield        #931 <Field AnimatorSet ae>
		ae.play(((Animator) (af))).with(((Animator) (am))).with(((Animator) (ag))).with(((Animator) (aj))).with(((Animator) (ak))).with(((Animator) (al)));
	//   11   25:aload_0         
	//   12   26:getfield        #931 <Field AnimatorSet ae>
	//   13   29:aload_0         
	//   14   30:getfield        #341 <Field AnimatorSet af>
	//   15   33:invokevirtual   #345 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//   16   36:aload_0         
	//   17   37:getfield        #936 <Field AnimatorSet am>
	//   18   40:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//   19   43:aload_0         
	//   20   44:getfield        #938 <Field AnimatorSet ag>
	//   21   47:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//   22   50:aload_0         
	//   23   51:getfield        #940 <Field AnimatorSet aj>
	//   24   54:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//   25   57:aload_0         
	//   26   58:getfield        #361 <Field AnimatorSet ak>
	//   27   61:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//   28   64:aload_0         
	//   29   65:getfield        #379 <Field AnimatorSet al>
	//   30   68:invokevirtual   #350 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//   31   71:pop             
		ae.play(((Animator) (ah))).after(((Animator) (ag)));
	//   32   72:aload_0         
	//   33   73:getfield        #931 <Field AnimatorSet ae>
	//   34   76:aload_0         
	//   35   77:getfield        #942 <Field AnimatorSet ah>
	//   36   80:invokevirtual   #345 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//   37   83:aload_0         
	//   38   84:getfield        #938 <Field AnimatorSet ag>
	//   39   87:invokevirtual   #945 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.after(Animator)>
	//   40   90:pop             
		ae.play(((Animator) (ai))).after(((Animator) (aj)));
	//   41   91:aload_0         
	//   42   92:getfield        #931 <Field AnimatorSet ae>
	//   43   95:aload_0         
	//   44   96:getfield        #947 <Field AnimatorSet ai>
	//   45   99:invokevirtual   #345 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//   46  102:aload_0         
	//   47  103:getfield        #940 <Field AnimatorSet aj>
	//   48  106:invokevirtual   #945 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.after(Animator)>
	//   49  109:pop             
		ae.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				super.onAnimationEnd(animator);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #21  <Method void AnimatorListenerAdapter.onAnimationEnd(Animator)>
				a.Q.setEnabled(true);
			//    3    5:aload_0         
			//    4    6:getfield        #14  <Field be a>
			//    5    9:getfield        #25  <Field CircleButton be.Q>
			//    6   12:iconst_1        
			//    7   13:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
				a.S.setEnabled(true);
			//    8   16:aload_0         
			//    9   17:getfield        #14  <Field be a>
			//   10   20:getfield        #34  <Field CircleButton be.S>
			//   11   23:iconst_1        
			//   12   24:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
				a.l.setVisibility(4);
			//   13   27:aload_0         
			//   14   28:getfield        #14  <Field be a>
			//   15   31:getfield        #38  <Field CustomSquaredImageButton be.l>
			//   16   34:iconst_4        
			//   17   35:invokevirtual   #44  <Method void CustomSquaredImageButton.setVisibility(int)>
				com.irobot.home.fragments.be.a(a, be.c(a) ^ true);
			//   18   38:aload_0         
			//   19   39:getfield        #14  <Field be a>
			//   20   42:aload_0         
			//   21   43:getfield        #14  <Field be a>
			//   22   46:invokestatic    #48  <Method boolean be.c(be)>
			//   23   49:iconst_1        
			//   24   50:ixor            
			//   25   51:invokestatic    #51  <Method boolean com.irobot.home.fragments.be.a(be, boolean)>
			//   26   54:pop             
				if(a.W.getVisibility() == 0)
			//*  27   55:aload_0         
			//*  28   56:getfield        #14  <Field be a>
			//*  29   59:getfield        #55  <Field HideableView be.W>
			//*  30   62:invokevirtual   #61  <Method int HideableView.getVisibility()>
			//*  31   65:ifne            90
				{
					a.T.setClickable(true);
			//   32   68:aload_0         
			//   33   69:getfield        #14  <Field be a>
			//   34   72:getfield        #65  <Field PercentageRingView be.T>
			//   35   75:iconst_1        
			//   36   76:invokevirtual   #70  <Method void PercentageRingView.setClickable(boolean)>
					a.O.setEnabled(false);
			//   37   79:aload_0         
			//   38   80:getfield        #14  <Field be a>
			//   39   83:getfield        #73  <Field CircleButton be.O>
			//   40   86:iconst_0        
			//   41   87:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
				}
				if(a.X.getVisibility() == 0)
			//*  42   90:aload_0         
			//*  43   91:getfield        #14  <Field be a>
			//*  44   94:getfield        #76  <Field HideableView be.X>
			//*  45   97:invokevirtual   #61  <Method int HideableView.getVisibility()>
			//*  46  100:ifne            125
				{
					a.T.setClickable(false);
			//   47  103:aload_0         
			//   48  104:getfield        #14  <Field be a>
			//   49  107:getfield        #65  <Field PercentageRingView be.T>
			//   50  110:iconst_0        
			//   51  111:invokevirtual   #70  <Method void PercentageRingView.setClickable(boolean)>
					a.O.setEnabled(true);
			//   52  114:aload_0         
			//   53  115:getfield        #14  <Field be a>
			//   54  118:getfield        #73  <Field CircleButton be.O>
			//   55  121:iconst_1        
			//   56  122:invokevirtual   #31  <Method void CircleButton.setEnabled(boolean)>
				}
			//   57  125:return          
			}

			public void onAnimationStart(Animator animator)
			{
				super.onAnimationStart(animator);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #79  <Method void AnimatorListenerAdapter.onAnimationStart(Animator)>
				a.l.setEnabled(false);
			//    3    5:aload_0         
			//    4    6:getfield        #14  <Field be a>
			//    5    9:getfield        #38  <Field CustomSquaredImageButton be.l>
			//    6   12:iconst_0        
			//    7   13:invokevirtual   #80  <Method void CustomSquaredImageButton.setEnabled(boolean)>
				a.n.setEnabled(false);
			//    8   16:aload_0         
			//    9   17:getfield        #14  <Field be a>
			//   10   20:getfield        #84  <Field CircleRippleButton be.n>
			//   11   23:iconst_0        
			//   12   24:invokevirtual   #87  <Method void CircleRippleButton.setEnabled(boolean)>
				a.n.setClickable(false);
			//   13   27:aload_0         
			//   14   28:getfield        #14  <Field be a>
			//   15   31:getfield        #84  <Field CircleRippleButton be.n>
			//   16   34:iconst_0        
			//   17   35:invokevirtual   #88  <Method void CircleRippleButton.setClickable(boolean)>
				if(a.n.getAnimationProgress() > 0.0F)
			//*  18   38:aload_0         
			//*  19   39:getfield        #14  <Field be a>
			//*  20   42:getfield        #84  <Field CircleRippleButton be.n>
			//*  21   45:invokevirtual   #92  <Method float CircleRippleButton.getAnimationProgress()>
			//*  22   48:fconst_0        
			//*  23   49:fcmpl           
			//*  24   50:ifle            64
					a.n.setAnimationProgress(0.0F);
			//   25   53:aload_0         
			//   26   54:getfield        #14  <Field be a>
			//   27   57:getfield        #84  <Field CircleRippleButton be.n>
			//   28   60:fconst_0        
			//   29   61:invokevirtual   #96  <Method void CircleRippleButton.setAnimationProgress(float)>
				a.R.setVisibility(0);
			//   30   64:aload_0         
			//   31   65:getfield        #14  <Field be a>
			//   32   68:getfield        #100 <Field CustomTextView be.R>
			//   33   71:iconst_0        
			//   34   72:invokevirtual   #103 <Method void CustomTextView.setVisibility(int)>
				a.N.setVisibility(0);
			//   35   75:aload_0         
			//   36   76:getfield        #14  <Field be a>
			//   37   79:getfield        #106 <Field CustomTextView be.N>
			//   38   82:iconst_0        
			//   39   83:invokevirtual   #103 <Method void CustomTextView.setVisibility(int)>
				a.O.setVisibility(0);
			//   40   86:aload_0         
			//   41   87:getfield        #14  <Field be a>
			//   42   90:getfield        #73  <Field CircleButton be.O>
			//   43   93:iconst_0        
			//   44   94:invokevirtual   #107 <Method void CircleButton.setVisibility(int)>
				a.Q.setVisibility(0);
			//   45   97:aload_0         
			//   46   98:getfield        #14  <Field be a>
			//   47  101:getfield        #25  <Field CircleButton be.Q>
			//   48  104:iconst_0        
			//   49  105:invokevirtual   #107 <Method void CircleButton.setVisibility(int)>
				a.S.setVisibility(0);
			//   50  108:aload_0         
			//   51  109:getfield        #14  <Field be a>
			//   52  112:getfield        #34  <Field CircleButton be.S>
			//   53  115:iconst_0        
			//   54  116:invokevirtual   #107 <Method void CircleButton.setVisibility(int)>
				a.T.setVisibility(0);
			//   55  119:aload_0         
			//   56  120:getfield        #14  <Field be a>
			//   57  123:getfield        #65  <Field PercentageRingView be.T>
			//   58  126:iconst_0        
			//   59  127:invokevirtual   #108 <Method void PercentageRingView.setVisibility(int)>
				a.ad.setVisibility(4);
			//   60  130:aload_0         
			//   61  131:getfield        #14  <Field be a>
			//   62  134:getfield        #112 <Field BatteryGaugeView be.ad>
			//   63  137:iconst_4        
			//   64  138:invokevirtual   #115 <Method void BatteryGaugeView.setVisibility(int)>
			//   65  141:return          
			}

			final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//   50  110:aload_0         
	//   51  111:getfield        #931 <Field AnimatorSet ae>
	//   52  114:new             #10  <Class be$10>
	//   53  117:dup             
	//   54  118:aload_0         
	//   55  119:invokespecial   #948 <Method void be$10(be)>
	//   56  122:invokevirtual   #952 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		ae.setInterpolator(((android.animation.TimeInterpolator) (new AccelerateDecelerateInterpolator())));
	//   57  125:aload_0         
	//   58  126:getfield        #931 <Field AnimatorSet ae>
	//   59  129:new             #954 <Class AccelerateDecelerateInterpolator>
	//   60  132:dup             
	//   61  133:invokespecial   #955 <Method void AccelerateDecelerateInterpolator()>
	//   62  136:invokevirtual   #959 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
		ae.start();
	//   63  139:aload_0         
	//   64  140:getfield        #931 <Field AnimatorSet ae>
	//   65  143:invokevirtual   #962 <Method void AnimatorSet.start()>
	//   66  146:return          
	}

	public void a(int i1, boolean flag, String s1)
	{
		ad.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #823 <Field BatteryGaugeView ad>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #826 <Method void BatteryGaugeView.setVisibility(int)>
		ad.a(i1, flag);
	//    4    8:aload_0         
	//    5    9:getfield        #823 <Field BatteryGaugeView ad>
	//    6   12:iload_1         
	//    7   13:i2f             
	//    8   14:iload_2         
	//    9   15:invokevirtual   #966 <Method void BatteryGaugeView.a(float, boolean)>
		if(s1 != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          30
			ad.setContentDescription(((CharSequence) (s1)));
	//   12   22:aload_0         
	//   13   23:getfield        #823 <Field BatteryGaugeView ad>
	//   14   26:aload_3         
	//   15   27:invokevirtual   #967 <Method void BatteryGaugeView.setContentDescription(CharSequence)>
	//   16   30:return          
	}

	public void a(CurrentConnectionState currentconnectionstate)
	{
		boolean flag;
		if(currentconnectionstate != CurrentConnectionState.ConnectedLocally && currentconnectionstate != CurrentConnectionState.ConnectedRemotely)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #816 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*   2    4:if_acmpeq       22
	//*   3    7:aload_1         
	//*   4    8:getstatic       #819 <Field CurrentConnectionState CurrentConnectionState.ConnectedRemotely>
	//*   5   11:if_acmpne       17
	//*   6   14:goto            22
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_2        
		else
	//*   9   19:goto            24
			flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_2        
		k(flag);
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:invokespecial   #969 <Method void k(boolean)>
	//   15   29:return          
	}

	public void a(DataDeserializationErrorEvent datadeserializationerrorevent)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(datadeserializationerrorevent != null && !datadeserializationerrorevent.reason().isEmpty())
	//*   4    8:aload_1         
	//*   5    9:ifnull          422
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #975 <Method String DataDeserializationErrorEvent.reason()>
	//*   8   16:invokevirtual   #978 <Method boolean String.isEmpty()>
	//*   9   19:ifeq            25
	//*  10   22:goto            422
		{
			String s1 = "";
	//   11   25:ldc2            #612 <String "">
	//   12   28:astore_2        
			switch(_cls5.d[datadeserializationerrorevent.networkSessionType().ordinal()])
	//*  13   29:getstatic       #981 <Field int[] be$5.d>
	//*  14   32:aload_1         
	//*  15   33:invokevirtual   #985 <Method NetworkSessionType DataDeserializationErrorEvent.networkSessionType()>
	//*  16   36:invokevirtual   #990 <Method int NetworkSessionType.ordinal()>
	//*  17   39:iaload          
			{
	//*  18   40:tableswitch     1 3: default 68
	//	               1 85
	//	               2 78
	//	               3 71
	//*  19   68:goto            89
			case 3: // '\003'
				s1 = "from API GW";
	//   20   71:ldc2            #992 <String "from API GW">
	//   21   74:astore_2        
				break;

	//*  22   75:goto            89
			case 2: // '\002'
				s1 = "from shadow";
	//   23   78:ldc2            #994 <String "from shadow">
	//   24   81:astore_2        
				break;

	//*  25   82:goto            89
			case 1: // '\001'
				s1 = "over local";
	//   26   85:ldc2            #996 <String "over local">
	//   27   88:astore_2        
				break;
			}
			Object obj = "";
	//   28   89:ldc2            #612 <String "">
	//   29   92:astore_3        
			Object obj2 = ((Object) (datadeserializationerrorevent.reason()));
	//   30   93:aload_1         
	//   31   94:invokevirtual   #975 <Method String DataDeserializationErrorEvent.reason()>
	//   32   97:astore          6
			Object obj1 = obj;
	//   33   99:aload_3         
	//   34  100:astore          4
			String s2 = ((String) (obj2));
	//   35  102:aload           6
	//   36  104:astore          5
			if(datadeserializationerrorevent.deserializationError() != null)
	//*  37  106:aload_1         
	//*  38  107:invokevirtual   #1000 <Method Error DataDeserializationErrorEvent.deserializationError()>
	//*  39  110:ifnull          179
			{
				HashMap hashmap = datadeserializationerrorevent.deserializationError().info();
	//   40  113:aload_1         
	//   41  114:invokevirtual   #1000 <Method Error DataDeserializationErrorEvent.deserializationError()>
	//   42  117:invokevirtual   #1006 <Method HashMap Error.info()>
	//   43  120:astore          7
				if(hashmap.containsKey("Data_Identifier"))
	//*  44  122:aload           7
	//*  45  124:ldc2            #1008 <String "Data_Identifier">
	//*  46  127:invokevirtual   #1013 <Method boolean HashMap.containsKey(Object)>
	//*  47  130:ifeq            145
					obj = ((Object) ((String)hashmap.get("Data_Identifier")));
	//   48  133:aload           7
	//   49  135:ldc2            #1008 <String "Data_Identifier">
	//   50  138:invokevirtual   #1017 <Method Object HashMap.get(Object)>
	//   51  141:checkcast       #716 <Class String>
	//   52  144:astore_3        
				obj1 = obj;
	//   53  145:aload_3         
	//   54  146:astore          4
				s2 = ((String) (obj2));
	//   55  148:aload           6
	//   56  150:astore          5
				if(hashmap.containsKey("Data"))
	//*  57  152:aload           7
	//*  58  154:ldc2            #1019 <String "Data">
	//*  59  157:invokevirtual   #1013 <Method boolean HashMap.containsKey(Object)>
	//*  60  160:ifeq            179
				{
					s2 = (String)hashmap.get("Data");
	//   61  163:aload           7
	//   62  165:ldc2            #1019 <String "Data">
	//   63  168:invokevirtual   #1017 <Method Object HashMap.get(Object)>
	//   64  171:checkcast       #716 <Class String>
	//   65  174:astore          5
					obj1 = obj;
	//   66  176:aload_3         
	//   67  177:astore          4
				}
			}
			obj = ((Object) (String.format("Received bad data for <b>%s</b>, %s: %s", new Object[] {
				obj1, s1, s2
			})));
	//   68  179:ldc2            #1021 <String "Received bad data for <b>%s</b>, %s: %s">
	//   69  182:iconst_3        
	//   70  183:anewarray       Object[]
	//   71  186:dup             
	//   72  187:iconst_0        
	//   73  188:aload           4
	//   74  190:aastore         
	//   75  191:dup             
	//   76  192:iconst_1        
	//   77  193:aload_2         
	//   78  194:aastore         
	//   79  195:dup             
	//   80  196:iconst_2        
	//   81  197:aload           5
	//   82  199:aastore         
	//   83  200:invokestatic    #927 <Method String String.format(String, Object[])>
	//   84  203:astore_3        
			L.setVisibility(0);
	//   85  204:aload_0         
	//   86  205:getfield        #1023 <Field CustomTextView L>
	//   87  208:iconst_0        
	//   88  209:invokevirtual   #1024 <Method void CustomTextView.setVisibility(int)>
			L.setText(((CharSequence) (Html.fromHtml(((String) (obj))))));
	//   89  212:aload_0         
	//   90  213:getfield        #1023 <Field CustomTextView L>
	//   91  216:aload_3         
	//   92  217:invokestatic    #1030 <Method android.text.Spanned Html.fromHtml(String)>
	//   93  220:invokevirtual   #641 <Method void CustomTextView.setText(CharSequence)>
			obj = ((Object) (new StringBuilder()));
	//   94  223:new             #617 <Class StringBuilder>
	//   95  226:dup             
	//   96  227:invokespecial   #618 <Method void StringBuilder()>
	//   97  230:astore_3        
			((StringBuilder) (obj)).append("<b>Time: </b>");
	//   98  231:aload_3         
	//   99  232:ldc2            #1032 <String "<b>Time: </b>">
	//  100  235:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  101  238:pop             
			((StringBuilder) (obj)).append((new SimpleDateFormat("HH:mm:ss:SSS")).format(datadeserializationerrorevent.timestamp()));
	//  102  239:aload_3         
	//  103  240:new             #1034 <Class SimpleDateFormat>
	//  104  243:dup             
	//  105  244:ldc2            #1036 <String "HH:mm:ss:SSS">
	//  106  247:invokespecial   #1038 <Method void SimpleDateFormat(String)>
	//  107  250:aload_1         
	//  108  251:invokevirtual   #1042 <Method java.util.Date DataDeserializationErrorEvent.timestamp()>
	//  109  254:invokevirtual   #1045 <Method String SimpleDateFormat.format(java.util.Date)>
	//  110  257:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  111  260:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  112  261:aload_3         
	//  113  262:invokevirtual   #630 <Method String StringBuilder.toString()>
	//  114  265:astore_3        
			obj2 = ((Object) (new StringBuilder()));
	//  115  266:new             #617 <Class StringBuilder>
	//  116  269:dup             
	//  117  270:invokespecial   #618 <Method void StringBuilder()>
	//  118  273:astore          6
			((StringBuilder) (obj2)).append(((String) (obj)));
	//  119  275:aload           6
	//  120  277:aload_3         
	//  121  278:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  122  281:pop             
			((StringBuilder) (obj2)).append("<br/><b>Adapter: </b>");
	//  123  282:aload           6
	//  124  284:ldc2            #1047 <String "<br/><b>Adapter: </b>">
	//  125  287:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  126  290:pop             
			((StringBuilder) (obj2)).append(datadeserializationerrorevent.networkSessionType().name());
	//  127  291:aload           6
	//  128  293:aload_1         
	//  129  294:invokevirtual   #985 <Method NetworkSessionType DataDeserializationErrorEvent.networkSessionType()>
	//  130  297:invokevirtual   #1050 <Method String NetworkSessionType.name()>
	//  131  300:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  132  303:pop             
			((StringBuilder) (obj2)).append("\n<br/><b>Field name: </b>");
	//  133  304:aload           6
	//  134  306:ldc2            #1052 <String "\n<br/><b>Field name: </b>">
	//  135  309:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  136  312:pop             
			((StringBuilder) (obj2)).append(((String) (obj1)));
	//  137  313:aload           6
	//  138  315:aload           4
	//  139  317:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  140  320:pop             
			((StringBuilder) (obj2)).append("\n<br/><b>JSON data: </b>");
	//  141  321:aload           6
	//  142  323:ldc2            #1054 <String "\n<br/><b>JSON data: </b>">
	//  143  326:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  144  329:pop             
			((StringBuilder) (obj2)).append(s2);
	//  145  330:aload           6
	//  146  332:aload           5
	//  147  334:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  148  337:pop             
			datadeserializationerrorevent = ((DataDeserializationErrorEvent) (((StringBuilder) (obj2)).toString()));
	//  149  338:aload           6
	//  150  340:invokevirtual   #630 <Method String StringBuilder.toString()>
	//  151  343:astore_1        
			obj = ((Object) (new android.app.AlertDialog.Builder(((android.content.Context) (getActivity())))));
	//  152  344:new             #436 <Class android.app.AlertDialog$Builder>
	//  153  347:dup             
	//  154  348:aload_0         
	//  155  349:invokevirtual   #440 <Method Activity getActivity()>
	//  156  352:invokespecial   #443 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//  157  355:astore_3        
			obj1 = ((Object) (new StringBuilder()));
	//  158  356:new             #617 <Class StringBuilder>
	//  159  359:dup             
	//  160  360:invokespecial   #618 <Method void StringBuilder()>
	//  161  363:astore          4
			((StringBuilder) (obj1)).append("Bad Data received ");
	//  162  365:aload           4
	//  163  367:ldc2            #1056 <String "Bad Data received ">
	//  164  370:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  165  373:pop             
			((StringBuilder) (obj1)).append(s1);
	//  166  374:aload           4
	//  167  376:aload_2         
	//  168  377:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//  169  380:pop             
			datadeserializationerrorevent = ((DataDeserializationErrorEvent) (((android.app.AlertDialog.Builder) (obj)).setTitle(((CharSequence) (((StringBuilder) (obj1)).toString()))).setMessage(((CharSequence) (Html.fromHtml(((String) (datadeserializationerrorevent)))))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null)))));
	//  170  381:aload_3         
	//  171  382:aload           4
	//  172  384:invokevirtual   #630 <Method String StringBuilder.toString()>
	//  173  387:invokevirtual   #1059 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//  174  390:aload_1         
	//  175  391:invokestatic    #1030 <Method android.text.Spanned Html.fromHtml(String)>
	//  176  394:invokevirtual   #755 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//  177  397:ldc2            #449 <Int 0x7f0f05bb>
	//  178  400:aconst_null     
	//  179  401:invokevirtual   #453 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//  180  404:astore_1        
			L.setOnClickListener(new android.view.View.OnClickListener(((android.app.AlertDialog.Builder) (datadeserializationerrorevent))) {

				public void onClick(View view)
				{
					a.show();
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field android.app.AlertDialog$Builder a>
				//    2    4:invokevirtual   #32  <Method AlertDialog android.app.AlertDialog$Builder.show()>
				//    3    7:pop             
				//    4    8:return          
				}

				final android.app.AlertDialog.Builder a;
				final be b;

			
			{
				b = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field be b>
				a = builder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field android.app.AlertDialog$Builder a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  181  405:aload_0         
	//  182  406:getfield        #1023 <Field CustomTextView L>
	//  183  409:new             #18  <Class be$2>
	//  184  412:dup             
	//  185  413:aload_0         
	//  186  414:aload_1         
	//  187  415:invokespecial   #1062 <Method void be$2(be, android.app.AlertDialog$Builder)>
	//  188  418:invokevirtual   #1066 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//  189  421:return          
		} else
		{
			L.setVisibility(8);
	//  190  422:aload_0         
	//  191  423:getfield        #1023 <Field CustomTextView L>
	//  192  426:bipush          8
	//  193  428:invokevirtual   #1024 <Method void CustomTextView.setVisibility(int)>
			return;
	//  194  431:return          
		}
	}

	protected void a(EvacuationDockMode evacuationdockmode)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #617 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #618 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Showing newest EvacuationDockMode: ");
	//    4    8:aload_3         
	//    5    9:ldc2            #1068 <String "Showing newest EvacuationDockMode: ">
	//    6   12:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(evacuationdockmode.name());
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1071 <Method String EvacuationDockMode.name()>
	//   11   21:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		com.irobot.home.util.o.b("RobotCleanFragment", stringbuilder.toString());
	//   13   25:ldc2            #585 <String "RobotCleanFragment">
	//   14   28:aload_3         
	//   15   29:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   16   32:invokestatic    #648 <Method void o.b(String, String)>
		_cls5.h[evacuationdockmode.ordinal()];
	//   17   35:getstatic       #1073 <Field int[] be$5.h>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #1074 <Method int EvacuationDockMode.ordinal()>
	//   20   42:iaload          
		JVM INSTR tableswitch 1 8: default 88
	//	               1 325
	//	               2 285
	//	               3 235
	//	               4 235
	//	               5 240
	//	               6 194
	//	               7 159
	//	               8 124;
	//   21   43:tableswitch     1 8: default 88
	//	               1 325
	//	               2 285
	//	               3 235
	//	               4 235
	//	               5 240
	//	               6 194
	//	               7 159
	//	               8 124
		   goto _L1 _L2 _L3 _L4 _L4 _L5 _L6 _L7 _L8
_L1:
		StringBuilder stringbuilder1 = new StringBuilder();
	//   22   88:new             #617 <Class StringBuilder>
	//   23   91:dup             
	//   24   92:invokespecial   #618 <Method void StringBuilder()>
	//   25   95:astore_3        
		stringbuilder1.append("Unsure how to handle new dock mode: ");
	//   26   96:aload_3         
	//   27   97:ldc2            #1076 <String "Unsure how to handle new dock mode: ">
	//   28  100:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   29  103:pop             
		stringbuilder1.append(evacuationdockmode.name());
	//   30  104:aload_3         
	//   31  105:aload_1         
	//   32  106:invokevirtual   #1071 <Method String EvacuationDockMode.name()>
	//   33  109:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   34  112:pop             
		junit.b.a.a(stringbuilder1.toString(), false);
	//   35  113:aload_3         
	//   36  114:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   37  117:iconst_0        
	//   38  118:invokestatic    #855 <Method void junit.b.a.a(String, boolean)>
		break MISSING_BLOCK_LABEL_352;
	//   39  121:goto            352
_L8:
		int i1;
		z.setVisibility(0);
	//   40  124:aload_0         
	//   41  125:getfield        #375 <Field CustomButton z>
	//   42  128:iconst_0        
	//   43  129:invokevirtual   #1079 <Method void CustomButton.setVisibility(int)>
		z.setEnabled(false);
	//   44  132:aload_0         
	//   45  133:getfield        #375 <Field CustomButton z>
	//   46  136:iconst_0        
	//   47  137:invokevirtual   #1080 <Method void CustomButton.setEnabled(boolean)>
		evacuationdockmode = ((EvacuationDockMode) (z));
	//   48  140:aload_0         
	//   49  141:getfield        #375 <Field CustomButton z>
	//   50  144:astore_1        
		i1 = android.support.v4.content.a.getColor(((android.content.Context) (getActivity())), 0x7f06006d);
	//   51  145:aload_0         
	//   52  146:invokevirtual   #440 <Method Activity getActivity()>
	//   53  149:ldc2            #663 <Int 0x7f06006d>
	//   54  152:invokestatic    #1085 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//   55  155:istore_2        
		  goto _L9
	//*  56  156:goto            317
_L7:
		z.setVisibility(0);
	//   57  159:aload_0         
	//   58  160:getfield        #375 <Field CustomButton z>
	//   59  163:iconst_0        
	//   60  164:invokevirtual   #1079 <Method void CustomButton.setVisibility(int)>
		z.setEnabled(true);
	//   61  167:aload_0         
	//   62  168:getfield        #375 <Field CustomButton z>
	//   63  171:iconst_1        
	//   64  172:invokevirtual   #1080 <Method void CustomButton.setEnabled(boolean)>
		evacuationdockmode = ((EvacuationDockMode) (z));
	//   65  175:aload_0         
	//   66  176:getfield        #375 <Field CustomButton z>
	//   67  179:astore_1        
		i1 = android.support.v4.content.a.getColor(((android.content.Context) (getActivity())), 0x7f060076);
	//   68  180:aload_0         
	//   69  181:invokevirtual   #440 <Method Activity getActivity()>
	//   70  184:ldc2            #655 <Int 0x7f060076>
	//   71  187:invokestatic    #1085 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//   72  190:istore_2        
		  goto _L10
	//*  73  191:goto            272
_L6:
		z.setVisibility(0);
	//   74  194:aload_0         
	//   75  195:getfield        #375 <Field CustomButton z>
	//   76  198:iconst_0        
	//   77  199:invokevirtual   #1079 <Method void CustomButton.setVisibility(int)>
		z.setEnabled(false);
	//   78  202:aload_0         
	//   79  203:getfield        #375 <Field CustomButton z>
	//   80  206:iconst_0        
	//   81  207:invokevirtual   #1080 <Method void CustomButton.setEnabled(boolean)>
		z.setTextColor(android.support.v4.content.a.getColor(((android.content.Context) (getActivity())), 0x7f06006d));
	//   82  210:aload_0         
	//   83  211:getfield        #375 <Field CustomButton z>
	//   84  214:aload_0         
	//   85  215:invokevirtual   #440 <Method Activity getActivity()>
	//   86  218:ldc2            #663 <Int 0x7f06006d>
	//   87  221:invokestatic    #1085 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//   88  224:invokevirtual   #1086 <Method void CustomButton.setTextColor(int)>
		aU = true;
	//   89  227:aload_0         
	//   90  228:iconst_1        
	//   91  229:putfield        #215 <Field boolean aU>
		break MISSING_BLOCK_LABEL_352;
	//   92  232:goto            352
_L4:
		aP = null;
	//   93  235:aload_0         
	//   94  236:aconst_null     
	//   95  237:putfield        #678 <Field String aP>
_L5:
		z.setVisibility(0);
	//   96  240:aload_0         
	//   97  241:getfield        #375 <Field CustomButton z>
	//   98  244:iconst_0        
	//   99  245:invokevirtual   #1079 <Method void CustomButton.setVisibility(int)>
		z.setEnabled(false);
	//  100  248:aload_0         
	//  101  249:getfield        #375 <Field CustomButton z>
	//  102  252:iconst_0        
	//  103  253:invokevirtual   #1080 <Method void CustomButton.setEnabled(boolean)>
		evacuationdockmode = ((EvacuationDockMode) (z));
	//  104  256:aload_0         
	//  105  257:getfield        #375 <Field CustomButton z>
	//  106  260:astore_1        
		i1 = android.support.v4.content.a.getColor(((android.content.Context) (getActivity())), 0x7f06006d);
	//  107  261:aload_0         
	//  108  262:invokevirtual   #440 <Method Activity getActivity()>
	//  109  265:ldc2            #663 <Int 0x7f06006d>
	//  110  268:invokestatic    #1085 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//  111  271:istore_2        
_L10:
		((CustomButton) (evacuationdockmode)).setTextColor(i1);
	//  112  272:aload_1         
	//  113  273:iload_2         
	//  114  274:invokevirtual   #1086 <Method void CustomButton.setTextColor(int)>
		aU = false;
	//  115  277:aload_0         
	//  116  278:iconst_0        
	//  117  279:putfield        #215 <Field boolean aU>
		break MISSING_BLOCK_LABEL_352;
	//  118  282:goto            352
_L3:
		z.setVisibility(0);
	//  119  285:aload_0         
	//  120  286:getfield        #375 <Field CustomButton z>
	//  121  289:iconst_0        
	//  122  290:invokevirtual   #1079 <Method void CustomButton.setVisibility(int)>
		z.setEnabled(true);
	//  123  293:aload_0         
	//  124  294:getfield        #375 <Field CustomButton z>
	//  125  297:iconst_1        
	//  126  298:invokevirtual   #1080 <Method void CustomButton.setEnabled(boolean)>
		evacuationdockmode = ((EvacuationDockMode) (z));
	//  127  301:aload_0         
	//  128  302:getfield        #375 <Field CustomButton z>
	//  129  305:astore_1        
		i1 = android.support.v4.content.a.getColor(((android.content.Context) (getActivity())), 0x7f060076);
	//  130  306:aload_0         
	//  131  307:invokevirtual   #440 <Method Activity getActivity()>
	//  132  310:ldc2            #655 <Int 0x7f060076>
	//  133  313:invokestatic    #1085 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//  134  316:istore_2        
_L9:
		((CustomButton) (evacuationdockmode)).setTextColor(i1);
	//  135  317:aload_1         
	//  136  318:iload_2         
	//  137  319:invokevirtual   #1086 <Method void CustomButton.setTextColor(int)>
		  goto _L11
	//* 138  322:goto            342
_L2:
		z.setVisibility(8);
	//  139  325:aload_0         
	//  140  326:getfield        #375 <Field CustomButton z>
	//  141  329:bipush          8
	//  142  331:invokevirtual   #1079 <Method void CustomButton.setVisibility(int)>
		z.setEnabled(false);
	//  143  334:aload_0         
	//  144  335:getfield        #375 <Field CustomButton z>
	//  145  338:iconst_0        
	//  146  339:invokevirtual   #1080 <Method void CustomButton.setEnabled(boolean)>
_L11:
		aU = false;
	//  147  342:aload_0         
	//  148  343:iconst_0        
	//  149  344:putfield        #215 <Field boolean aU>
		aP = null;
	//  150  347:aload_0         
	//  151  348:aconst_null     
	//  152  349:putfield        #678 <Field String aP>
		L();
	//  153  352:aload_0         
	//  154  353:invokevirtual   #680 <Method void L()>
		K();
	//  155  356:aload_0         
	//  156  357:invokevirtual   #670 <Method void K()>
		return;
	//  157  360:return          
	}

	public void a(NetworkType networktype, NetworkState networkstate)
	{
		if(networkstate == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(isAdded())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #264 <Method boolean isAdded()>
	//*   5    9:ifeq            129
		{
			View view;
			if(networktype == NetworkType.Local)
	//*   6   12:aload_1         
	//*   7   13:getstatic       #1093 <Field NetworkType NetworkType.Local>
	//*   8   16:if_acmpne       28
				view = G;
	//    9   19:aload_0         
	//   10   20:getfield        #1095 <Field View G>
	//   11   23:astore          4
			else
	//*  12   25:goto            34
				view = H;
	//   13   28:aload_0         
	//   14   29:getfield        #1097 <Field View H>
	//   15   32:astore          4
			int i1;
			switch(_cls5.e[networkstate.ordinal()])
	//*  16   34:getstatic       #1099 <Field int[] be$5.e>
	//*  17   37:aload_2         
	//*  18   38:invokevirtual   #1100 <Method int NetworkState.ordinal()>
	//*  19   41:iaload          
			{
	//*  20   42:tableswitch     1 5: default 76
	//	               1 110
	//	               2 98
	//	               3 86
	//	               4 86
	//	               5 86
			default:
				com.irobot.home.util.o.e("RobotCleanFragment", "Unrecognized connection type");
	//   21   76:ldc2            #585 <String "RobotCleanFragment">
	//   22   79:ldc2            #1102 <String "Unrecognized connection type">
	//   23   82:invokestatic    #726 <Method void o.e(String, String)>
				return;
	//   24   85:return          

			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				networktype = ((NetworkType) (getResources()));
	//   25   86:aload_0         
	//   26   87:invokevirtual   #317 <Method Resources getResources()>
	//   27   90:astore_1        
				i1 = 0x7f060079;
	//   28   91:ldc2            #893 <Int 0x7f060079>
	//   29   94:istore_3        
				break;

	//*  30   95:goto            119
			case 2: // '\002'
				networktype = ((NetworkType) (getResources()));
	//   31   98:aload_0         
	//   32   99:invokevirtual   #317 <Method Resources getResources()>
	//   33  102:astore_1        
				i1 = 0x7f060078;
	//   34  103:ldc2            #1103 <Int 0x7f060078>
	//   35  106:istore_3        
				break;

	//*  36  107:goto            119
			case 1: // '\001'
				networktype = ((NetworkType) (getResources()));
	//   37  110:aload_0         
	//   38  111:invokevirtual   #317 <Method Resources getResources()>
	//   39  114:astore_1        
				i1 = 0x7f06006d;
	//   40  115:ldc2            #663 <Int 0x7f06006d>
	//   41  118:istore_3        
				break;
			}
			view.setBackgroundColor(((Resources) (networktype)).getColor(i1));
	//   42  119:aload           4
	//   43  121:aload_1         
	//   44  122:iload_3         
	//   45  123:invokevirtual   #658 <Method int Resources.getColor(int)>
	//   46  126:invokevirtual   #1106 <Method void View.setBackgroundColor(int)>
		}
	//   47  129:return          
	}

	public void a(ResolvedMissionStatus resolvedmissionstatus)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #617 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #618 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Resolved mission status: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1109 <String "Resolved mission status: ">
	//    6   12:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(resolvedmissionstatus.name());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1112 <Method String ResolvedMissionStatus.name()>
	//   11   21:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		com.irobot.home.util.o.b("RobotCleanFragment", stringbuilder.toString());
	//   13   25:ldc2            #585 <String "RobotCleanFragment">
	//   14   28:aload_2         
	//   15   29:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   16   32:invokestatic    #648 <Method void o.b(String, String)>
		if(com.irobot.home.fragments._cls5.g[resolvedmissionstatus.ordinal()] != 1)
	//*  17   35:getstatic       #1114 <Field int[] com.irobot.home.fragments.be$5.g>
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #1115 <Method int ResolvedMissionStatus.ordinal()>
	//*  20   42:iaload          
	//*  21   43:iconst_1        
	//*  22   44:icmpeq          61
		{
			if(aN)
	//*  23   47:aload_0         
	//*  24   48:getfield        #200 <Field boolean aN>
	//*  25   51:ifeq            65
				b();
	//   26   54:aload_0         
	//   27   55:invokevirtual   #1116 <Method void b()>
		} else
	//*  28   58:goto            65
		{
			a();
	//   29   61:aload_0         
	//   30   62:invokevirtual   #1117 <Method void a()>
		}
		aM.a(resolvedmissionstatus);
	//   31   65:aload_0         
	//   32   66:getfield        #752 <Field com.irobot.home.util.b aM>
	//   33   69:aload_1         
	//   34   70:invokevirtual   #1119 <Method void com.irobot.home.util.b.a(ResolvedMissionStatus)>
		L();
	//   35   73:aload_0         
	//   36   74:invokevirtual   #680 <Method void L()>
	//   37   77:return          
	}

	public void a(d d1)
	{
		bi = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #889 <Field be$d bi>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #915 <Field boolean c>
		aM.c(c);
	//    3    5:aload_0         
	//    4    6:getfield        #752 <Field com.irobot.home.util.b aM>
	//    5    9:aload_0         
	//    6   10:getfield        #915 <Field boolean c>
	//    7   13:invokevirtual   #1121 <Method void com.irobot.home.util.b.c(boolean)>
		K();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #670 <Method void K()>
	//   10   20:return          
	}

	void b()
	{
		if(ae == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #931 <Field AnimatorSet ae>
	//*   2    4:ifnonnull       17
		{
			com.irobot.home.util.o.e("RobotCleanFragment", "cleaning choice transition was null, this shouldn't happen");
	//    3    7:ldc2            #585 <String "RobotCleanFragment">
	//    4   10:ldc2            #1123 <String "cleaning choice transition was null, this shouldn't happen">
	//    5   13:invokestatic    #726 <Method void o.e(String, String)>
			return;
	//    6   16:return          
		}
		ae.removeAllListeners();
	//    7   17:aload_0         
	//    8   18:getfield        #931 <Field AnimatorSet ae>
	//    9   21:invokevirtual   #934 <Method void AnimatorSet.removeAllListeners()>
		if(ae.isRunning())
	//*  10   24:aload_0         
	//*  11   25:getfield        #931 <Field AnimatorSet ae>
	//*  12   28:invokevirtual   #1126 <Method boolean AnimatorSet.isRunning()>
	//*  13   31:ifeq            41
			ae.pause();
	//   14   34:aload_0         
	//   15   35:getfield        #931 <Field AnimatorSet ae>
	//   16   38:invokevirtual   #1129 <Method void AnimatorSet.pause()>
		ae.cancel();
	//   17   41:aload_0         
	//   18   42:getfield        #931 <Field AnimatorSet ae>
	//   19   45:invokevirtual   #1132 <Method void AnimatorSet.cancel()>
		ae = new AnimatorSet();
	//   20   48:aload_0         
	//   21   49:new             #338 <Class AnimatorSet>
	//   22   52:dup             
	//   23   53:invokespecial   #339 <Method void AnimatorSet()>
	//   24   56:putfield        #931 <Field AnimatorSet ae>
		ae.playTogether(new Animator[] {
			af, am, ag, aj, ak, ah, ai, al
		});
	//   25   59:aload_0         
	//   26   60:getfield        #931 <Field AnimatorSet ae>
	//   27   63:bipush          8
	//   28   65:anewarray       Animator[]
	//   29   68:dup             
	//   30   69:iconst_0        
	//   31   70:aload_0         
	//   32   71:getfield        #341 <Field AnimatorSet af>
	//   33   74:aastore         
	//   34   75:dup             
	//   35   76:iconst_1        
	//   36   77:aload_0         
	//   37   78:getfield        #936 <Field AnimatorSet am>
	//   38   81:aastore         
	//   39   82:dup             
	//   40   83:iconst_2        
	//   41   84:aload_0         
	//   42   85:getfield        #938 <Field AnimatorSet ag>
	//   43   88:aastore         
	//   44   89:dup             
	//   45   90:iconst_3        
	//   46   91:aload_0         
	//   47   92:getfield        #940 <Field AnimatorSet aj>
	//   48   95:aastore         
	//   49   96:dup             
	//   50   97:iconst_4        
	//   51   98:aload_0         
	//   52   99:getfield        #361 <Field AnimatorSet ak>
	//   53  102:aastore         
	//   54  103:dup             
	//   55  104:iconst_5        
	//   56  105:aload_0         
	//   57  106:getfield        #942 <Field AnimatorSet ah>
	//   58  109:aastore         
	//   59  110:dup             
	//   60  111:bipush          6
	//   61  113:aload_0         
	//   62  114:getfield        #947 <Field AnimatorSet ai>
	//   63  117:aastore         
	//   64  118:dup             
	//   65  119:bipush          7
	//   66  121:aload_0         
	//   67  122:getfield        #379 <Field AnimatorSet al>
	//   68  125:aastore         
	//   69  126:invokevirtual   #1138 <Method void AnimatorSet.playTogether(Animator[])>
		ae.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				super.onAnimationEnd(animator);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #22  <Method void AnimatorListenerAdapter.onAnimationEnd(Animator)>
				a.l.setEnabled(true);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field be a>
			//    5    9:getfield        #26  <Field CustomSquaredImageButton be.l>
			//    6   12:iconst_1        
			//    7   13:invokevirtual   #32  <Method void CustomSquaredImageButton.setEnabled(boolean)>
				a.n.setEnabled(true);
			//    8   16:aload_0         
			//    9   17:getfield        #15  <Field be a>
			//   10   20:getfield        #36  <Field CircleRippleButton be.n>
			//   11   23:iconst_1        
			//   12   24:invokevirtual   #39  <Method void CircleRippleButton.setEnabled(boolean)>
				a.n.setClickable(true);
			//   13   27:aload_0         
			//   14   28:getfield        #15  <Field be a>
			//   15   31:getfield        #36  <Field CircleRippleButton be.n>
			//   16   34:iconst_1        
			//   17   35:invokevirtual   #42  <Method void CircleRippleButton.setClickable(boolean)>
				a.O.setVisibility(4);
			//   18   38:aload_0         
			//   19   39:getfield        #15  <Field be a>
			//   20   42:getfield        #46  <Field CircleButton be.O>
			//   21   45:iconst_4        
			//   22   46:invokevirtual   #52  <Method void CircleButton.setVisibility(int)>
				a.Q.setVisibility(4);
			//   23   49:aload_0         
			//   24   50:getfield        #15  <Field be a>
			//   25   53:getfield        #55  <Field CircleButton be.Q>
			//   26   56:iconst_4        
			//   27   57:invokevirtual   #52  <Method void CircleButton.setVisibility(int)>
				a.S.setVisibility(4);
			//   28   60:aload_0         
			//   29   61:getfield        #15  <Field be a>
			//   30   64:getfield        #58  <Field CircleButton be.S>
			//   31   67:iconst_4        
			//   32   68:invokevirtual   #52  <Method void CircleButton.setVisibility(int)>
				a.T.setVisibility(4);
			//   33   71:aload_0         
			//   34   72:getfield        #15  <Field be a>
			//   35   75:getfield        #62  <Field PercentageRingView be.T>
			//   36   78:iconst_4        
			//   37   79:invokevirtual   #65  <Method void PercentageRingView.setVisibility(int)>
				com.irobot.home.fragments.be.a(a, true ^ be.c(a));
			//   38   82:aload_0         
			//   39   83:getfield        #15  <Field be a>
			//   40   86:iconst_1        
			//   41   87:aload_0         
			//   42   88:getfield        #15  <Field be a>
			//   43   91:invokestatic    #69  <Method boolean be.c(be)>
			//   44   94:ixor            
			//   45   95:invokestatic    #72  <Method boolean com.irobot.home.fragments.be.a(be, boolean)>
			//   46   98:pop             
				a.ad.setVisibility(0);
			//   47   99:aload_0         
			//   48  100:getfield        #15  <Field be a>
			//   49  103:getfield        #76  <Field BatteryGaugeView be.ad>
			//   50  106:iconst_0        
			//   51  107:invokevirtual   #79  <Method void BatteryGaugeView.setVisibility(int)>
			//   52  110:return          
			}

			public void onAnimationStart(Animator animator)
			{
				super.onAnimationStart(animator);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #82  <Method void AnimatorListenerAdapter.onAnimationStart(Animator)>
				a.l.setVisibility(0);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field be a>
			//    5    9:getfield        #26  <Field CustomSquaredImageButton be.l>
			//    6   12:iconst_0        
			//    7   13:invokevirtual   #83  <Method void CustomSquaredImageButton.setVisibility(int)>
				a.R.setVisibility(4);
			//    8   16:aload_0         
			//    9   17:getfield        #15  <Field be a>
			//   10   20:getfield        #87  <Field CustomTextView be.R>
			//   11   23:iconst_4        
			//   12   24:invokevirtual   #90  <Method void CustomTextView.setVisibility(int)>
				a.N.setVisibility(4);
			//   13   27:aload_0         
			//   14   28:getfield        #15  <Field be a>
			//   15   31:getfield        #93  <Field CustomTextView be.N>
			//   16   34:iconst_4        
			//   17   35:invokevirtual   #90  <Method void CustomTextView.setVisibility(int)>
				if(a.n.getAnimationProgress() > 0.0F)
			//*  18   38:aload_0         
			//*  19   39:getfield        #15  <Field be a>
			//*  20   42:getfield        #36  <Field CircleRippleButton be.n>
			//*  21   45:invokevirtual   #97  <Method float CircleRippleButton.getAnimationProgress()>
			//*  22   48:fconst_0        
			//*  23   49:fcmpl           
			//*  24   50:ifle            64
					a.n.setAnimationProgress(0.0F);
			//   25   53:aload_0         
			//   26   54:getfield        #15  <Field be a>
			//   27   57:getfield        #36  <Field CircleRippleButton be.n>
			//   28   60:fconst_0        
			//   29   61:invokevirtual   #101 <Method void CircleRippleButton.setAnimationProgress(float)>
				a.O.setEnabled(false);
			//   30   64:aload_0         
			//   31   65:getfield        #15  <Field be a>
			//   32   68:getfield        #46  <Field CircleButton be.O>
			//   33   71:iconst_0        
			//   34   72:invokevirtual   #102 <Method void CircleButton.setEnabled(boolean)>
				a.Q.setEnabled(false);
			//   35   75:aload_0         
			//   36   76:getfield        #15  <Field be a>
			//   37   79:getfield        #55  <Field CircleButton be.Q>
			//   38   82:iconst_0        
			//   39   83:invokevirtual   #102 <Method void CircleButton.setEnabled(boolean)>
				a.S.setEnabled(false);
			//   40   86:aload_0         
			//   41   87:getfield        #15  <Field be a>
			//   42   90:getfield        #58  <Field CircleButton be.S>
			//   43   93:iconst_0        
			//   44   94:invokevirtual   #102 <Method void CircleButton.setEnabled(boolean)>
				a.T.setClickable(false);
			//   45   97:aload_0         
			//   46   98:getfield        #15  <Field be a>
			//   47  101:getfield        #62  <Field PercentageRingView be.T>
			//   48  104:iconst_0        
			//   49  105:invokevirtual   #103 <Method void PercentageRingView.setClickable(boolean)>
			//   50  108:return          
			}

			final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//   70  129:aload_0         
	//   71  130:getfield        #931 <Field AnimatorSet ae>
	//   72  133:new             #12  <Class be$11>
	//   73  136:dup             
	//   74  137:aload_0         
	//   75  138:invokespecial   #1139 <Method void be$11(be)>
	//   76  141:invokevirtual   #952 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		ae.setInterpolator(((android.animation.TimeInterpolator) (new com.irobot.home.e.a())));
	//   77  144:aload_0         
	//   78  145:getfield        #931 <Field AnimatorSet ae>
	//   79  148:new             #1141 <Class com.irobot.home.e.a>
	//   80  151:dup             
	//   81  152:invokespecial   #1142 <Method void com.irobot.home.e.a()>
	//   82  155:invokevirtual   #959 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
		ae.start();
	//   83  158:aload_0         
	//   84  159:getfield        #931 <Field AnimatorSet ae>
	//   85  162:invokevirtual   #962 <Method void AnimatorSet.start()>
	//   86  165:return          
	}

	public void b(CurrentConnectionState currentconnectionstate)
	{
		boolean flag;
		if(!currentconnectionstate.equals(((Object) (CurrentConnectionState.Error))) && !currentconnectionstate.equals(((Object) (CurrentConnectionState.RemoteMissing))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #794 <Field CurrentConnectionState CurrentConnectionState.Error>
	//*   2    4:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*   3    7:ifne            28
	//*   4   10:aload_1         
	//*   5   11:getstatic       #808 <Field CurrentConnectionState CurrentConnectionState.RemoteMissing>
	//*   6   14:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*   7   17:ifeq            23
	//*   8   20:goto            28
			flag = false;
	//    9   23:iconst_0        
	//   10   24:istore_2        
		else
	//*  11   25:goto            30
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore_2        
		aV = flag;
	//   14   30:aload_0         
	//   15   31:iload_2         
	//   16   32:putfield        #217 <Field boolean aV>
		L();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #680 <Method void L()>
		if(com.irobot.home.util.j.j() != null)
	//*  19   39:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//*  20   42:ifnull          53
			aM.a(currentconnectionstate);
	//   21   45:aload_0         
	//   22   46:getfield        #752 <Field com.irobot.home.util.b aM>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #899 <Method void com.irobot.home.util.b.a(CurrentConnectionState)>
		if(com.irobot.home.fragments._cls5.f[currentconnectionstate.ordinal()] != 1)
	//*  25   53:getstatic       #1144 <Field int[] com.irobot.home.fragments.be$5.f>
	//*  26   56:aload_1         
	//*  27   57:invokevirtual   #1145 <Method int CurrentConnectionState.ordinal()>
	//*  28   60:iaload          
	//*  29   61:iconst_1        
	//*  30   62:icmpeq          70
		{
			E();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #1147 <Method void E()>
			return;
	//   33   69:return          
		} else
		{
			F();
	//   34   70:aload_0         
	//   35   71:invokevirtual   #1149 <Method void F()>
			return;
	//   36   74:return          
		}
	}

	public void b(String s1)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifne            17
		{
			com.irobot.home.util.o.b("RobotCleanFragment", "Cannot show overlay since not yet added, no reference to Activity.");
	//    3    7:ldc2            #585 <String "RobotCleanFragment">
	//    4   10:ldc2            #1151 <String "Cannot show overlay since not yet added, no reference to Activity.">
	//    5   13:invokestatic    #648 <Method void o.b(String, String)>
			return;
	//    6   16:return          
		}
		bd.a(((RobotCleanActivity)getActivity()).M());
	//    7   17:aload_0         
	//    8   18:getfield        #239 <Field b bd>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #440 <Method Activity getActivity()>
	//   11   25:checkcast       #892 <Class RobotCleanActivity>
	//   12   28:invokevirtual   #1154 <Method com.irobot.home.m.b$a RobotCleanActivity.M()>
	//   13   31:invokevirtual   #1157 <Method void b.a(com.irobot.home.m.b$a)>
		bd.a(new com.irobot.home.m.b.a() {

			public void a(boolean flag2)
			{
				com.irobot.home.fragments.be.b(a, flag2);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field be a>
			//    2    4:iload_1         
			//    3    5:invokestatic    #25  <Method boolean com.irobot.home.fragments.be.b(be, boolean)>
			//    4    8:pop             
			//    5    9:return          
			}

			public void b(boolean flag2)
			{
				be.d(a).sendServiceCommand(MissionUIServiceCommand.EvacDockTourSeen, ((MissionUIServiceData) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field be a>
			//    2    4:invokestatic    #29  <Method MissionSubsystem be.d(be)>
			//    3    7:getstatic       #35  <Field MissionUIServiceCommand MissionUIServiceCommand.EvacDockTourSeen>
			//    4   10:aconst_null     
			//    5   11:invokevirtual   #41  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, MissionUIServiceData)>
				be.d(a).sendServiceCommand(MissionUIServiceCommand.EvacDockQueryStatus, ((MissionUIServiceData) (null)));
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field be a>
			//    8   18:invokestatic    #29  <Method MissionSubsystem be.d(be)>
			//    9   21:getstatic       #44  <Field MissionUIServiceCommand MissionUIServiceCommand.EvacDockQueryStatus>
			//   10   24:aconst_null     
			//   11   25:invokevirtual   #41  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, MissionUIServiceData)>
			//   12   28:return          
			}

			final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   14   34:aload_0         
	//   15   35:getfield        #239 <Field b bd>
	//   16   38:new             #22  <Class be$4>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:invokespecial   #1158 <Method void be$4(be)>
	//   20   46:invokevirtual   #1157 <Method void b.a(com.irobot.home.m.b$a)>
		if(((Integer)g.c().a()).intValue() < 1)
	//*  21   49:aload_0         
	//*  22   50:getfield        #1160 <Field k g>
	//*  23   53:invokevirtual   #1165 <Method g k.c()>
	//*  24   56:invokevirtual   #1169 <Method Object g.a()>
	//*  25   59:checkcast       #599 <Class Integer>
	//*  26   62:invokevirtual   #1172 <Method int Integer.intValue()>
	//*  27   65:iconst_1        
	//*  28   66:icmpge          196
		{
			junit.b.a.a(getActivity() instanceof RobotCleanActivity);
	//   29   69:aload_0         
	//   30   70:invokevirtual   #440 <Method Activity getActivity()>
	//   31   73:instanceof      #892 <Class RobotCleanActivity>
	//   32   76:invokestatic    #1174 <Method void junit.b.a.a(boolean)>
			boolean flag = SkuUtils.isSkuOfType(SkuType.Hertz, s1);
	//   33   79:getstatic       #1180 <Field SkuType SkuType.Hertz>
	//   34   82:aload_1         
	//   35   83:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//   36   86:istore_2        
			boolean flag1 = false;
	//   37   87:iconst_0        
	//   38   88:istore_3        
			if(!flag && !SkuUtils.isSkuOfType(SkuType.Marconi, s1) && !SkuUtils.isSkuOfType(SkuType.Aero, s1) && !SkuUtils.isSkuOfType(SkuType.Ningbo, s1))
	//*  39   89:iload_2         
	//*  40   90:ifne            128
	//*  41   93:getstatic       #1189 <Field SkuType SkuType.Marconi>
	//*  42   96:aload_1         
	//*  43   97:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  44  100:ifne            128
	//*  45  103:getstatic       #1192 <Field SkuType SkuType.Aero>
	//*  46  106:aload_1         
	//*  47  107:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  48  110:ifne            128
	//*  49  113:getstatic       #1195 <Field SkuType SkuType.Ningbo>
	//*  50  116:aload_1         
	//*  51  117:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  52  120:ifne            128
				flag = true;
	//   53  123:iconst_1        
	//   54  124:istore_2        
			else
	//*  55  125:goto            130
				flag = false;
	//   56  128:iconst_0        
	//   57  129:istore_2        
			if(SkuUtils.isSkuOfType(SkuType.Lewis, s1) || SkuUtils.isSkuOfType(SkuType.Soho, s1) || SkuUtils.isSkuOfType(SkuType.SanMarino, s1))
	//*  58  130:getstatic       #1198 <Field SkuType SkuType.Lewis>
	//*  59  133:aload_1         
	//*  60  134:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  61  137:ifne            160
	//*  62  140:getstatic       #1201 <Field SkuType SkuType.Soho>
	//*  63  143:aload_1         
	//*  64  144:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  65  147:ifne            160
	//*  66  150:getstatic       #1204 <Field SkuType SkuType.SanMarino>
	//*  67  153:aload_1         
	//*  68  154:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  69  157:ifeq            162
				flag1 = true;
	//   70  160:iconst_1        
	//   71  161:istore_3        
			bd.a(getActivity(), flag, flag1);
	//   72  162:aload_0         
	//   73  163:getfield        #239 <Field b bd>
	//   74  166:aload_0         
	//   75  167:invokevirtual   #440 <Method Activity getActivity()>
	//   76  170:iload_2         
	//   77  171:iload_3         
	//   78  172:invokevirtual   #1207 <Method void b.a(Activity, boolean, boolean)>
			((com.irobot.home.util.k.a)g.a().c().a(1)).n();
	//   79  175:aload_0         
	//   80  176:getfield        #1160 <Field k g>
	//   81  179:invokevirtual   #1210 <Method com.irobot.home.util.k$a k.a()>
	//   82  182:invokevirtual   #1215 <Method f com.irobot.home.util.k$a.c()>
	//   83  185:iconst_1        
	//   84  186:invokevirtual   #1220 <Method org.androidannotations.api.b.e f.a(int)>
	//   85  189:checkcast       #1212 <Class com.irobot.home.util.k$a>
	//   86  192:invokevirtual   #1222 <Method void com.irobot.home.util.k$a.n()>
			return;
	//   87  195:return          
		} else
		{
			bd.a();
	//   88  196:aload_0         
	//   89  197:getfield        #239 <Field b bd>
	//   90  200:invokevirtual   #1223 <Method void b.a()>
			return;
	//   91  203:return          
		}
	}

	public String c(CurrentConnectionState currentconnectionstate)
	{
		com.irobot.home.fragments._cls5.f[currentconnectionstate.ordinal()];
	//    0    0:getstatic       #1144 <Field int[] com.irobot.home.fragments.be$5.f>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #1145 <Method int CurrentConnectionState.ordinal()>
	//    3    7:iaload          
		JVM INSTR tableswitch 2 4: default 36
	//	               2 48
	//	               3 48
	//	               4 38;
	//    4    8:tableswitch     2 4: default 36
	//	               2 48
	//	               3 48
	//	               4 38
		   goto _L1 _L2 _L2 _L3
_L1:
		return null;
	//    5   36:aconst_null     
	//    6   37:areturn         
_L3:
		currentconnectionstate = "Robot_missing";
	//    7   38:ldc2            #1226 <String "Robot_missing">
	//    8   41:astore_1        
_L5:
		return g(((String) (currentconnectionstate)));
	//    9   42:aload_0         
	//   10   43:aload_1         
	//   11   44:invokespecial   #1228 <Method String g(String)>
	//   12   47:areturn         
_L2:
		if(bc)
	//*  13   48:aload_0         
	//*  14   49:getfield        #229 <Field boolean bc>
	//*  15   52:ifeq            62
			currentconnectionstate = "dup_BLID_error";
	//   16   55:ldc2            #1230 <String "dup_BLID_error">
	//   17   58:astore_1        
		else
	//*  18   59:goto            42
			currentconnectionstate = "Cloud_down_no_globes";
	//   19   62:ldc2            #1232 <String "Cloud_down_no_globes">
	//   20   65:astore_1        
		if(true) goto _L5; else goto _L4
	//   21   66:goto            42
_L4:
	}

	public void c()
	{
		Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #1240 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
		if(locale == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			com.irobot.home.model.a a1;
			String s1;
			try
			{
				com.irobot.home.util.o.e("RobotCleanFragment", "Locale.getDefault() returned null");
	//    4    8:ldc2            #585 <String "RobotCleanFragment">
	//    5   11:ldc2            #1242 <String "Locale.getDefault() returned null">
	//    6   14:invokestatic    #726 <Method void o.e(String, String)>
				return;
	//    7   17:return          
			}
	//*   8   18:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//*   9   21:astore_2        
	//*  10   22:aload_2         
	//*  11   23:ifnonnull       36
	//*  12   26:ldc2            #585 <String "RobotCleanFragment">
	//*  13   29:ldc2            #1244 <String "Null robot encountered in background task ">
	//*  14   32:invokestatic    #726 <Method void o.e(String, String)>
	//*  15   35:return          
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #440 <Method Activity getActivity()>
	//*  18   40:invokevirtual   #1250 <Method android.content.Context Activity.getBaseContext()>
	//*  19   43:invokestatic    #1253 <Method String j.h(android.content.Context)>
	//*  20   46:astore_3        
	//*  21   47:aload_0         
	//*  22   48:aload_0         
	//*  23   49:getfield        #1255 <Field CustomerCareRestClient C>
	//*  24   52:aload_1         
	//*  25   53:invokestatic    #1258 <Method String j.a(Locale)>
	//*  26   56:aload_3         
	//*  27   57:aload_2         
	//*  28   58:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  29   61:invokevirtual   #1261 <Method String AssetInfo.getSku()>
	//*  30   64:invokeinterface #1267 <Method CommonQuestionList CustomerCareRestClient.getHelpCommonQuestionsList(String, String, String)>
	//*  31   69:putfield        #196 <Field CommonQuestionList D>
	//*  32   72:aload_0         
	//*  33   73:getfield        #196 <Field CommonQuestionList D>
	//*  34   76:ifnonnull       88
	//*  35   79:ldc2            #585 <String "RobotCleanFragment">
	//*  36   82:ldc2            #1269 <String "Website API returned null for the CommonQuestions url">
	//*  37   85:invokestatic    #726 <Method void o.e(String, String)>
	//*  38   88:aload_0         
	//*  39   89:aload_0         
	//*  40   90:getfield        #1255 <Field CustomerCareRestClient C>
	//*  41   93:aload_1         
	//*  42   94:invokestatic    #1258 <Method String j.a(Locale)>
	//*  43   97:aload_3         
	//*  44   98:aload_2         
	//*  45   99:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  46  102:invokevirtual   #1261 <Method String AssetInfo.getSku()>
	//*  47  105:invokeinterface #1273 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//*  48  110:putfield        #198 <Field RobotErrorHelpContentList E>
	//*  49  113:aload_0         
	//*  50  114:getfield        #198 <Field RobotErrorHelpContentList E>
	//*  51  117:ifnull          130
	//*  52  120:aload_0         
	//*  53  121:getfield        #198 <Field RobotErrorHelpContentList E>
	//*  54  124:getfield        #694 <Field List RobotErrorHelpContentList.otherContent>
	//*  55  127:ifnonnull       176
	//*  56  130:ldc2            #585 <String "RobotCleanFragment">
	//*  57  133:ldc2            #1275 <String "Website API returned null for the otherContent url">
	//*  58  136:invokestatic    #726 <Method void o.e(String, String)>
	//*  59  139:return          
			catch(Exception exception)
	//*  60  140:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   61  141:new             #617 <Class StringBuilder>
	//   62  144:dup             
	//   63  145:invokespecial   #618 <Method void StringBuilder()>
	//   64  148:astore_2        
				stringbuilder.append("Error in getQuestionsList: ");
	//   65  149:aload_2         
	//   66  150:ldc2            #1277 <String "Error in getQuestionsList: ">
	//   67  153:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   68  156:pop             
				stringbuilder.append(exception.getMessage());
	//   69  157:aload_2         
	//   70  158:aload_1         
	//   71  159:invokevirtual   #1280 <Method String Exception.getMessage()>
	//   72  162:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   73  165:pop             
				com.irobot.home.util.o.e("RobotCleanFragment", stringbuilder.toString());
	//   74  166:ldc2            #585 <String "RobotCleanFragment">
	//   75  169:aload_2         
	//   76  170:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   77  173:invokestatic    #726 <Method void o.e(String, String)>
			}
			break MISSING_BLOCK_LABEL_176;
		}
		a1 = com.irobot.home.util.j.j();
		if(a1 != null)
			break MISSING_BLOCK_LABEL_36;
		com.irobot.home.util.o.e("RobotCleanFragment", "Null robot encountered in background task ");
		return;
		s1 = com.irobot.home.util.j.h(getActivity().getBaseContext());
		D = C.getHelpCommonQuestionsList(com.irobot.home.util.j.a(locale), s1, a1.a().getSku());
		if(D == null)
			com.irobot.home.util.o.e("RobotCleanFragment", "Website API returned null for the CommonQuestions url");
		E = C.getRobotErrorHelp(com.irobot.home.util.j.a(locale), s1, a1.a().getSku());
		if(E == null || E.otherContent == null)
		{
			com.irobot.home.util.o.e("RobotCleanFragment", "Website API returned null for the otherContent url");
			return;
		}
	//   78  176:return          
	}

	public void c(String s1)
	{
		if(isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifeq            15
			aM.a(s1);
	//    3    7:aload_0         
	//    4    8:getfield        #752 <Field com.irobot.home.util.b aM>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1282 <Method void com.irobot.home.util.b.a(String)>
	//    7   15:return          
	}

	void d()
	{
		if(Q())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #1284 <Method boolean Q()>
	//*   2    4:ifeq            57
		{
			com.irobot.home.HistoryActivity_.a a1 = HistoryActivity_.a(((android.app.Fragment) (this))).a(com.irobot.home.util.j.k().getId());
	//    3    7:aload_0         
	//    4    8:invokestatic    #1289 <Method com.irobot.home.HistoryActivity_$a HistoryActivity_.a(android.app.Fragment)>
	//    5   11:invokestatic    #410 <Method AssetId j.k()>
	//    6   14:invokevirtual   #1294 <Method String AssetId.getId()>
	//    7   17:invokevirtual   #1299 <Method com.irobot.home.HistoryActivity_$a com.irobot.home.HistoryActivity_$a.a(String)>
	//    8   20:astore_2        
			boolean flag;
			if(!aR && !aQ)
	//*   9   21:aload_0         
	//*  10   22:getfield        #482 <Field boolean aR>
	//*  11   25:ifne            43
	//*  12   28:aload_0         
	//*  13   29:getfield        #682 <Field boolean aQ>
	//*  14   32:ifeq            38
	//*  15   35:goto            43
				flag = false;
	//   16   38:iconst_0        
	//   17   39:istore_1        
			else
	//*  18   40:goto            45
				flag = true;
	//   19   43:iconst_1        
	//   20   44:istore_1        
			a1.a(Boolean.valueOf(flag)).a();
	//   21   45:aload_2         
	//   22   46:iload_1         
	//   23   47:invokestatic    #923 <Method Boolean Boolean.valueOf(boolean)>
	//   24   50:invokevirtual   #1302 <Method com.irobot.home.HistoryActivity_$a com.irobot.home.HistoryActivity_$a.a(Boolean)>
	//   25   53:invokevirtual   #1303 <Method org.androidannotations.api.a.e com.irobot.home.HistoryActivity_$a.a()>
	//   26   56:pop             
		}
	//   27   57:return          
	}

	public void d(String s1)
	{
		aL = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #194 <Field String aL>
	//    3    5:return          
	}

	public void d(boolean flag)
	{
		BatteryGaugeView batterygaugeview = ad;
	//    0    0:aload_0         
	//    1    1:getfield        #823 <Field BatteryGaugeView ad>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			byte0 = 8;
	//    8   14:bipush          8
	//    9   16:istore_2        
		batterygaugeview.setVisibility(((int) (byte0)));
	//   10   17:aload_3         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #826 <Method void BatteryGaugeView.setVisibility(int)>
	//   13   22:return          
	}

	void e()
	{
		if(i(false))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #1305 <Method boolean i(boolean)>
	//*   3    5:ifeq            32
			RobotCleaningPreferencesActivity_.a(((android.app.Fragment) (this))).a(com.irobot.home.util.j.k().getId()).a(aS).a();
	//    4    8:aload_0         
	//    5    9:invokestatic    #1310 <Method com.irobot.home.RobotCleaningPreferencesActivity_$a RobotCleaningPreferencesActivity_.a(android.app.Fragment)>
	//    6   12:invokestatic    #410 <Method AssetId j.k()>
	//    7   15:invokevirtual   #1294 <Method String AssetId.getId()>
	//    8   18:invokevirtual   #1315 <Method com.irobot.home.RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_$a.a(String)>
	//    9   21:aload_0         
	//   10   22:getfield        #730 <Field boolean aS>
	//   11   25:invokevirtual   #1318 <Method com.irobot.home.RobotCleaningPreferencesActivity_$a com.irobot.home.RobotCleaningPreferencesActivity_$a.a(boolean)>
	//   12   28:invokevirtual   #1319 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleaningPreferencesActivity_$a.a()>
	//   13   31:pop             
	//   14   32:return          
	}

	protected void e(String s1)
	{
		TextView textview;
		if(com.irobot.home.util.j.i(s1))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #688 <Method boolean j.i(String)>
	//*   2    4:ifeq            28
		{
			j.setVisibility(4);
	//    3    7:aload_0         
	//    4    8:getfield        #363 <Field TextView j>
	//    5   11:iconst_4        
	//    6   12:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			textview = k;
	//    7   15:aload_0         
	//    8   16:getfield        #371 <Field TextView k>
	//    9   19:astore_2        
		} else
	//*  10   20:aload_2         
	//*  11   21:iconst_0        
	//*  12   22:invokevirtual   #465 <Method void TextView.setVisibility(int)>
	//*  13   25:goto            44
		{
			k.setVisibility(4);
	//   14   28:aload_0         
	//   15   29:getfield        #371 <Field TextView k>
	//   16   32:iconst_4        
	//   17   33:invokevirtual   #465 <Method void TextView.setVisibility(int)>
			textview = j;
	//   18   36:aload_0         
	//   19   37:getfield        #363 <Field TextView j>
	//   20   40:astore_2        
		}
		textview.setVisibility(0);
	//*  21   41:goto            20
		k.setText(((CharSequence) (s1)));
	//   22   44:aload_0         
	//   23   45:getfield        #371 <Field TextView k>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #1320 <Method void TextView.setText(CharSequence)>
	//   26   52:return          
	}

	public void e(boolean flag)
	{
		if(ac == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1322 <Field ImageView ac>
	//*   2    4:ifnonnull       17
		{
			com.irobot.home.util.o.e("RobotCleanFragment", "[HKC] Cloud offline icon is null and being called... NEED ATTENTION");
	//    3    7:ldc2            #585 <String "RobotCleanFragment">
	//    4   10:ldc2            #1324 <String "[HKC] Cloud offline icon is null and being called... NEED ATTENTION">
	//    5   13:invokestatic    #726 <Method void o.e(String, String)>
			return;
	//    6   16:return          
		}
		ImageView imageview = ac;
	//    7   17:aload_0         
	//    8   18:getfield        #1322 <Field ImageView ac>
	//    9   21:astore_3        
		byte byte0;
		if(flag)
	//*  10   22:iload_1         
	//*  11   23:ifeq            31
			byte0 = 0;
	//   12   26:iconst_0        
	//   13   27:istore_2        
		else
	//*  14   28:goto            34
			byte0 = 8;
	//   15   31:bipush          8
	//   16   33:istore_2        
		imageview.setVisibility(((int) (byte0)));
	//   17   34:aload_3         
	//   18   35:iload_2         
	//   19   36:invokevirtual   #916 <Method void ImageView.setVisibility(int)>
	//   20   39:return          
	}

	void f()
	{
		if(i(false))
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #1305 <Method boolean i(boolean)>
	//*   3    5:ifeq            144
		{
			Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #617 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #618 <Method void StringBuilder()>
	//    7   15:astore_1        
			((StringBuilder) (obj)).append("Supports schedule type: ");
	//    8   16:aload_1         
	//    9   17:ldc2            #1326 <String "Supports schedule type: ">
	//   10   20:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			((StringBuilder) (obj)).append(bb.name());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #542 <Field ScheduleTypeSupported bb>
	//   15   29:invokevirtual   #1329 <Method String ScheduleTypeSupported.name()>
	//   16   32:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			com.irobot.home.util.o.b("RobotCleanFragment", ((StringBuilder) (obj)).toString());
	//   18   36:ldc2            #585 <String "RobotCleanFragment">
	//   19   39:aload_1         
	//   20   40:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   21   43:invokestatic    #648 <Method void o.b(String, String)>
			obj = ((Object) (com.irobot.home.util.j.k().getId()));
	//   22   46:invokestatic    #410 <Method AssetId j.k()>
	//   23   49:invokevirtual   #1294 <Method String AssetId.getId()>
	//   24   52:astore_1        
			switch(_cls5.c[bb.ordinal()])
	//*  25   53:getstatic       #1331 <Field int[] be$5.c>
	//*  26   56:aload_0         
	//*  27   57:getfield        #542 <Field ScheduleTypeSupported bb>
	//*  28   60:invokevirtual   #1332 <Method int ScheduleTypeSupported.ordinal()>
	//*  29   63:iaload          
			{
	//*  30   64:tableswitch     1 2: default 88
	//	               1 132
	//	               2 119
			default:
				StringBuilder stringbuilder = new StringBuilder();
	//   31   88:new             #617 <Class StringBuilder>
	//   32   91:dup             
	//   33   92:invokespecial   #618 <Method void StringBuilder()>
	//   34   95:astore_2        
				stringbuilder.append("No known schedule types supported by asset: ");
	//   35   96:aload_2         
	//   36   97:ldc2            #1334 <String "No known schedule types supported by asset: ">
	//   37  100:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   38  103:pop             
				stringbuilder.append(((String) (obj)));
	//   39  104:aload_2         
	//   40  105:aload_1         
	//   41  106:invokevirtual   #626 <Method StringBuilder StringBuilder.append(String)>
	//   42  109:pop             
				junit.b.a.a(stringbuilder.toString(), false);
	//   43  110:aload_2         
	//   44  111:invokevirtual   #630 <Method String StringBuilder.toString()>
	//   45  114:iconst_0        
	//   46  115:invokestatic    #855 <Method void junit.b.a.a(String, boolean)>
				return;
	//   47  118:return          

			case 2: // '\002'
				PersistentScheduleActivity_.a(((android.app.Fragment) (this))).a(((String) (obj))).a();
	//   48  119:aload_0         
	//   49  120:invokestatic    #1339 <Method com.irobot.home.PersistentScheduleActivity_$a PersistentScheduleActivity_.a(android.app.Fragment)>
	//   50  123:aload_1         
	//   51  124:invokevirtual   #1344 <Method com.irobot.home.PersistentScheduleActivity_$a com.irobot.home.PersistentScheduleActivity_$a.a(String)>
	//   52  127:invokevirtual   #1345 <Method org.androidannotations.api.a.e com.irobot.home.PersistentScheduleActivity_$a.a()>
	//   53  130:pop             
				return;
	//   54  131:return          

			case 1: // '\001'
				ScheduleTableViewActivity_.a(((android.app.Fragment) (this))).a(((String) (obj))).a();
	//   55  132:aload_0         
	//   56  133:invokestatic    #1350 <Method com.irobot.home.ScheduleTableViewActivity_$a ScheduleTableViewActivity_.a(android.app.Fragment)>
	//   57  136:aload_1         
	//   58  137:invokevirtual   #1355 <Method com.irobot.home.ScheduleTableViewActivity_$a com.irobot.home.ScheduleTableViewActivity_$a.a(String)>
	//   59  140:invokevirtual   #1356 <Method org.androidannotations.api.a.e com.irobot.home.ScheduleTableViewActivity_$a.a()>
	//   60  143:pop             
				break;
			}
		}
	//   61  144:return          
	}

	protected void f(boolean flag)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #264 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int i1;
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            19
			i1 = 0x7f0801f7;
	//    6   12:ldc2            #1357 <Int 0x7f0801f7>
	//    7   15:istore_2        
		else
	//*   8   16:goto            23
			i1 = 0x7f0801f6;
	//    9   19:ldc2            #1358 <Int 0x7f0801f6>
	//   10   22:istore_2        
		t.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i1, 0, 0);
	//   11   23:aload_0         
	//   12   24:getfield        #1360 <Field TextView t>
	//   13   27:iconst_0        
	//   14   28:iload_2         
	//   15   29:iconst_0        
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #1364 <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
	//   18   34:return          
	}

	void g()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    0    0:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//    1    3:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//    2    6:astore_1        
		if(SkuUtils.isSkuOfType(SkuType.SanMarino, assetinfo.getSku()))
	//*   3    7:getstatic       #1204 <Field SkuType SkuType.SanMarino>
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #1261 <Method String AssetInfo.getSku()>
	//*   6   14:invokestatic    #1186 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*   7   17:ifeq            29
		{
			SanMarinoCareMaintenanceActivity_.a(((android.app.Fragment) (this))).a();
	//    8   20:aload_0         
	//    9   21:invokestatic    #1369 <Method com.irobot.home.SanMarinoCareMaintenanceActivity_$a SanMarinoCareMaintenanceActivity_.a(android.app.Fragment)>
	//   10   24:invokevirtual   #1372 <Method org.androidannotations.api.a.e com.irobot.home.SanMarinoCareMaintenanceActivity_$a.a()>
	//   11   27:pop             
			return;
	//   12   28:return          
		} else
		{
			PartsDetailListActivity_.a(((android.app.Fragment) (this))).a(assetinfo.getAssetId().getId()).a();
	//   13   29:aload_0         
	//   14   30:invokestatic    #1377 <Method com.irobot.home.PartsDetailListActivity_$a PartsDetailListActivity_.a(android.app.Fragment)>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #1380 <Method AssetId AssetInfo.getAssetId()>
	//   17   37:invokevirtual   #1294 <Method String AssetId.getId()>
	//   18   40:invokevirtual   #1385 <Method com.irobot.home.PartsDetailListActivity_$a com.irobot.home.PartsDetailListActivity_$a.a(String)>
	//   19   43:invokevirtual   #1386 <Method org.androidannotations.api.a.e com.irobot.home.PartsDetailListActivity_$a.a()>
	//   20   46:pop             
			return;
	//   21   47:return          
		}
	}

	protected void g(boolean flag)
	{
		int i1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			i1 = 0x7f0801f9;
	//    2    4:ldc2            #1387 <Int 0x7f0801f9>
	//    3    7:istore_2        
		else
	//*   4    8:goto            15
			i1 = 0x7f0801f5;
	//    5   11:ldc2            #1388 <Int 0x7f0801f5>
	//    6   14:istore_2        
		w.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i1, 0, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #484 <Field TextView w>
	//    9   19:iconst_0        
	//   10   20:iload_2         
	//   11   21:iconst_0        
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #1364 <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
	//   14   26:return          
	}

	void h()
	{
		AnalyticsSubsystem.getInstance().trackSmartMapsButtonPressed(com.irobot.home.util.j.j().a());
	//    0    0:invokestatic    #909 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//    2    6:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//    3    9:invokevirtual   #1391 <Method void AnalyticsSubsystem.trackSmartMapsButtonPressed(AssetInfo)>
		if(Q())
	//*   4   12:aload_0         
	//*   5   13:invokespecial   #1284 <Method boolean Q()>
	//*   6   16:ifeq            77
		{
			if(!aX)
	//*   7   19:aload_0         
	//*   8   20:getfield        #221 <Field boolean aX>
	//*   9   23:ifne            38
			{
				GoToMapPrivacyActivity_.a(((android.content.Context) (getActivity()))).a();
	//   10   26:aload_0         
	//   11   27:invokevirtual   #440 <Method Activity getActivity()>
	//   12   30:invokestatic    #1396 <Method com.irobot.home.GoToMapPrivacyActivity_$a GoToMapPrivacyActivity_.a(android.content.Context)>
	//   13   33:invokevirtual   #1399 <Method org.androidannotations.api.a.e com.irobot.home.GoToMapPrivacyActivity_$a.a()>
	//   14   36:pop             
				return;
	//   15   37:return          
			}
			if(aY)
	//*  16   38:aload_0         
	//*  17   39:getfield        #223 <Field boolean aY>
	//*  18   42:ifeq            66
			{
				FloorPlanActivity_.a(((android.content.Context) (getActivity()))).a(com.irobot.home.util.j.k().getId()).a();
	//   19   45:aload_0         
	//   20   46:invokevirtual   #440 <Method Activity getActivity()>
	//   21   49:invokestatic    #1404 <Method com.irobot.home.FloorPlanActivity_$a FloorPlanActivity_.a(android.content.Context)>
	//   22   52:invokestatic    #410 <Method AssetId j.k()>
	//   23   55:invokevirtual   #1294 <Method String AssetId.getId()>
	//   24   58:invokevirtual   #1409 <Method com.irobot.home.FloorPlanActivity_$a com.irobot.home.FloorPlanActivity_$a.a(String)>
	//   25   61:invokevirtual   #1410 <Method org.androidannotations.api.a.e com.irobot.home.FloorPlanActivity_$a.a()>
	//   26   64:pop             
				return;
	//   27   65:return          
			}
			AboutSmartMapsActivity_.a(((android.content.Context) (getActivity()))).a();
	//   28   66:aload_0         
	//   29   67:invokevirtual   #440 <Method Activity getActivity()>
	//   30   70:invokestatic    #1415 <Method com.irobot.home.AboutSmartMapsActivity_$a AboutSmartMapsActivity_.a(android.content.Context)>
	//   31   73:invokevirtual   #1418 <Method org.androidannotations.api.a.e com.irobot.home.AboutSmartMapsActivity_$a.a()>
	//   32   76:pop             
		}
	//   33   77:return          
	}

	public void h(boolean flag)
	{
		bc = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #229 <Field boolean bc>
	//    3    5:return          
	}

	void i()
	{
		if(!com.irobot.home.util.j.j().a().isVirtual() && !com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//*   1    3:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//*   2    6:invokevirtual   #779 <Method boolean AssetInfo.isVirtual()>
	//*   3    9:ifne            30
	//*   4   12:invokestatic    #780 <Method boolean j.a()>
	//*   5   15:ifne            30
		{
			i(getString(0x7f0f04db));
	//    6   18:aload_0         
	//    7   19:aload_0         
	//    8   20:ldc2            #781 <Int 0x7f0f04db>
	//    9   23:invokevirtual   #782 <Method String getString(int)>
	//   10   26:invokespecial   #784 <Method void i(String)>
			return;
	//   11   29:return          
		} else
		{
			MoreTableViewActivity_.a(((android.app.Fragment) (this))).a(com.irobot.home.util.j.k().getId()).a();
	//   12   30:aload_0         
	//   13   31:invokestatic    #1423 <Method com.irobot.home.MoreTableViewActivity_$a MoreTableViewActivity_.a(android.app.Fragment)>
	//   14   34:invokestatic    #410 <Method AssetId j.k()>
	//   15   37:invokevirtual   #1294 <Method String AssetId.getId()>
	//   16   40:invokevirtual   #1428 <Method com.irobot.home.MoreTableViewActivity_$a com.irobot.home.MoreTableViewActivity_$a.a(String)>
	//   17   43:invokevirtual   #1429 <Method org.androidannotations.api.a.e com.irobot.home.MoreTableViewActivity_$a.a()>
	//   18   46:pop             
			return;
	//   19   47:return          
		}
	}

	void j()
	{
		if(!l.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #296 <Field CustomSquaredImageButton l>
	//*   2    4:invokevirtual   #1432 <Method boolean CustomSquaredImageButton.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(com.irobot.home.util.j.j() != null)
	//*   5   11:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//*   6   14:ifnull          41
		{
			if(a != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #1435 <Field i$a a>
	//*   9   21:ifnull          48
			{
				a.a();
	//   10   24:aload_0         
	//   11   25:getfield        #1435 <Field i$a a>
	//   12   28:invokeinterface #1438 <Method void com.irobot.home.fragments.i$a.a()>
				n.bringToFront();
	//   13   33:aload_0         
	//   14   34:getfield        #1440 <Field CircleRippleButton n>
	//   15   37:invokevirtual   #1445 <Method void CircleRippleButton.bringToFront()>
				return;
	//   16   40:return          
			}
		} else
		{
			aM.b();
	//   17   41:aload_0         
	//   18   42:getfield        #752 <Field com.irobot.home.util.b aM>
	//   19   45:invokevirtual   #880 <Method void com.irobot.home.util.b.b()>
		}
	//   20   48:return          
	}

	void k()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1116 <Method void b()>
		if(Assembler.getInstance().getPersistenceHandler().readBoolFromGroup("MapGettingStartedTour", com.irobot.home.util.j.j().a().getAssetId().getId(), false))
	//*   2    4:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//*   3    7:invokevirtual   #1449 <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//*   4   10:ldc2            #1451 <String "MapGettingStartedTour">
	//*   5   13:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//*   6   16:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//*   7   19:invokevirtual   #1380 <Method AssetId AssetInfo.getAssetId()>
	//*   8   22:invokevirtual   #1294 <Method String AssetId.getId()>
	//*   9   25:iconst_0        
	//*  10   26:invokevirtual   #1457 <Method boolean PersistenceHandler.readBoolFromGroup(String, String, boolean)>
	//*  11   29:ifeq            54
		{
			a.a(MissionStatusAction.StartMission);
	//   12   32:aload_0         
	//   13   33:getfield        #1435 <Field i$a a>
	//   14   36:getstatic       #1463 <Field MissionStatusAction MissionStatusAction.StartMission>
	//   15   39:invokeinterface #1466 <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
			n.bringToFront();
	//   16   44:aload_0         
	//   17   45:getfield        #1440 <Field CircleRippleButton n>
	//   18   48:invokevirtual   #1445 <Method void CircleRippleButton.bringToFront()>
		} else
	//*  19   51:goto            65
		{
			MapGettingStartedActivity_.a(((android.content.Context) (getActivity()))).a();
	//   20   54:aload_0         
	//   21   55:invokevirtual   #440 <Method Activity getActivity()>
	//   22   58:invokestatic    #1471 <Method com.irobot.home.MapGettingStartedActivity_$a MapGettingStartedActivity_.a(android.content.Context)>
	//   23   61:invokevirtual   #1474 <Method org.androidannotations.api.a.e com.irobot.home.MapGettingStartedActivity_$a.a()>
	//   24   64:pop             
		}
		d(true);
	//   25   65:aload_0         
	//   26   66:iconst_1        
	//   27   67:invokevirtual   #1476 <Method void d(boolean)>
	//   28   70:return          
	}

	void l()
	{
		if(!aX)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field boolean aX>
	//*   2    4:ifne            19
		{
			GoToMapPrivacyActivity_.a(((android.content.Context) (getActivity()))).a();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #440 <Method Activity getActivity()>
	//    5   11:invokestatic    #1396 <Method com.irobot.home.GoToMapPrivacyActivity_$a GoToMapPrivacyActivity_.a(android.content.Context)>
	//    6   14:invokevirtual   #1399 <Method org.androidannotations.api.a.e com.irobot.home.GoToMapPrivacyActivity_$a.a()>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			b();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #1116 <Method void b()>
			AnalyticsSubsystem.getInstance().trackChooseRoomsButtonPressed(com.irobot.home.util.j.j().a());
	//   11   23:invokestatic    #909 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   12   26:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//   13   29:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//   14   32:invokevirtual   #1479 <Method void AnalyticsSubsystem.trackChooseRoomsButtonPressed(AssetInfo)>
			ChooseRegionsToCleanActivity_.a(((android.content.Context) (getActivity()))).a();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #440 <Method Activity getActivity()>
	//   17   39:invokestatic    #1484 <Method com.irobot.home.ChooseRegionsToCleanActivity_$a ChooseRegionsToCleanActivity_.a(android.content.Context)>
	//   18   42:invokevirtual   #1487 <Method org.androidannotations.api.a.e com.irobot.home.ChooseRegionsToCleanActivity_$a.a()>
	//   19   45:pop             
			d(true);
	//   20   46:aload_0         
	//   21   47:iconst_1        
	//   22   48:invokevirtual   #1476 <Method void d(boolean)>
			return;
	//   23   51:return          
		}
	}

	void m()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1116 <Method void b()>
		h();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1490 <Method void h()>
	//    4    8:return          
	}

	void n()
	{
		if(!S.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #352 <Field CircleButton S>
	//*   2    4:invokevirtual   #1491 <Method boolean CircleButton.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		b();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #1116 <Method void b()>
		if(a != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #1435 <Field i$a a>
	//*   9   19:ifnull          34
			a.a(MissionStatusAction.Cancel);
	//   10   22:aload_0         
	//   11   23:getfield        #1435 <Field i$a a>
	//   12   26:getstatic       #1494 <Field MissionStatusAction MissionStatusAction.Cancel>
	//   13   29:invokeinterface #1466 <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
		ad.setVisibility(0);
	//   14   34:aload_0         
	//   15   35:getfield        #823 <Field BatteryGaugeView ad>
	//   16   38:iconst_0        
	//   17   39:invokevirtual   #826 <Method void BatteryGaugeView.setVisibility(int)>
	//   18   42:return          
	}

	void o()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1496 <Method void j()>
	//    2    4:return          
	}

	public void onPause()
	{
		((RobotCleanActivity)getActivity()).f(0xff000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #440 <Method Activity getActivity()>
	//    2    4:checkcast       #892 <Class RobotCleanActivity>
	//    3    7:ldc2            #896 <Int 0xff000000>
	//    4   10:invokevirtual   #895 <Method void RobotCleanActivity.f(int)>
		z();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #1499 <Method void z()>
		super.onPause();
	//    7   17:aload_0         
	//    8   18:invokespecial   #1501 <Method void i.onPause()>
	//    9   21:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1504 <Method void i.onResume()>
		H();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #583 <Method void H()>
		aI.registerUISubscriber(aJ);
	//    4    8:aload_0         
	//    5    9:getfield        #1506 <Field SettingsSubsystem aI>
	//    6   12:aload_0         
	//    7   13:getfield        #234 <Field SettingsUIServiceDataCallback aJ>
	//    8   16:invokevirtual   #1512 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//    9   19:pop             
		aK.registerUISubscriber(((OTAUIServiceDataCallback) (bj)));
	//   10   20:aload_0         
	//   11   21:getfield        #1514 <Field UpdateUIService aK>
	//   12   24:aload_0         
	//   13   25:getfield        #252 <Field be$a bj>
	//   14   28:invokevirtual   #1519 <Method boolean UpdateUIService.registerUISubscriber(OTAUIServiceDataCallback)>
	//   15   31:pop             
		be.registerUISubscriber(((MissionUIServiceDataCallback) (bg)));
	//   16   32:aload_0         
	//   17   33:getfield        #241 <Field MissionSubsystem be>
	//   18   36:aload_0         
	//   19   37:getfield        #246 <Field be$c bg>
	//   20   40:invokevirtual   #1522 <Method boolean MissionSubsystem.registerUISubscriber(MissionUIServiceDataCallback)>
	//   21   43:pop             
		bf.registerUISubscriber(((MapsUIServiceDataCallback) (bh)));
	//   22   44:aload_0         
	//   23   45:getfield        #243 <Field MapsUIService bf>
	//   24   48:aload_0         
	//   25   49:getfield        #249 <Field be$b bh>
	//   26   52:invokevirtual   #1525 <Method boolean MapsUIService.registerUISubscriber(MapsUIServiceDataCallback)>
	//   27   55:pop             
		Object obj = ((Object) (com.irobot.home.util.j.j()));
	//   28   56:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//   29   59:astore_1        
		if(obj == null)
	//*  30   60:aload_1         
	//*  31   61:ifnonnull       65
			return;
	//   32   64:return          
		junit.b.a.a("Model asset must be cloud capable.", AssetCapabilityUtils.isCloudCapable(((com.irobot.home.model.a) (obj)).a()));
	//   33   65:ldc2            #844 <String "Model asset must be cloud capable.">
	//   34   68:aload_1         
	//   35   69:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//   36   72:invokestatic    #850 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//   37   75:invokestatic    #855 <Method void junit.b.a.a(String, boolean)>
		obj = ((Object) (((w)obj).c()));
	//   38   78:aload_1         
	//   39   79:checkcast       #857 <Class w>
	//   40   82:invokevirtual   #860 <Method Robot w.c()>
	//   41   85:astore_1        
		if(((Robot) (obj)).r() != null)
	//*  42   86:aload_1         
	//*  43   87:invokevirtual   #1527 <Method String Robot.r()>
	//*  44   90:ifnull          111
		{
			aM.b();
	//   45   93:aload_0         
	//   46   94:getfield        #752 <Field com.irobot.home.util.b aM>
	//   47   97:invokevirtual   #880 <Method void com.irobot.home.util.b.b()>
			aM.a(((Robot) (obj)).x());
	//   48  100:aload_0         
	//   49  101:getfield        #752 <Field com.irobot.home.util.b aM>
	//   50  104:aload_1         
	//   51  105:invokevirtual   #1529 <Method boolean Robot.x()>
	//   52  108:invokevirtual   #1530 <Method void com.irobot.home.util.b.a(boolean)>
		}
		U();
	//   53  111:aload_0         
	//   54  112:invokespecial   #676 <Method void U()>
	//   55  115:return          
	}

	void p()
	{
		if(aU)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field boolean aU>
	//*   2    4:ifeq            12
		{
			r();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #1532 <Method void r()>
			return;
	//    5   11:return          
		}
		if(c)
	//*   6   12:aload_0         
	//*   7   13:getfield        #915 <Field boolean c>
	//*   8   16:ifeq            31
			h(g("Message 2"));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:ldc2            #1534 <String "Message 2">
	//   12   24:invokespecial   #1228 <Method String g(String)>
	//   13   27:invokespecial   #1536 <Method boolean h(String)>
	//   14   30:pop             
	//   15   31:return          
	}

	void q()
	{
		AboutRobotTableViewActivity_.a(((android.app.Fragment) (this))).a(com.irobot.home.util.j.k().getId()).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #1541 <Method com.irobot.home.AboutRobotTableViewActivity_$a AboutRobotTableViewActivity_.a(android.app.Fragment)>
	//    2    4:invokestatic    #410 <Method AssetId j.k()>
	//    3    7:invokevirtual   #1294 <Method String AssetId.getId()>
	//    4   10:invokevirtual   #1546 <Method com.irobot.home.AboutRobotTableViewActivity_$a com.irobot.home.AboutRobotTableViewActivity_$a.a(String)>
	//    5   13:invokevirtual   #1547 <Method org.androidannotations.api.a.e com.irobot.home.AboutRobotTableViewActivity_$a.a()>
	//    6   16:pop             
	//    7   17:return          
	}

	void r()
	{
		Object obj = ((Object) (com.irobot.home.util.j.j()));
	//    0    0:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//    1    3:astore_2        
		AssetInfo assetinfo = ((com.irobot.home.model.a) (obj)).a();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//    4    8:astore_3        
		AnalyticsSubsystem.getInstance().trackCleanScreenErrorIndicatorPressed(assetinfo);
	//    5    9:invokestatic    #909 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   12:aload_3         
	//    7   13:invokevirtual   #1550 <Method void AnalyticsSubsystem.trackCleanScreenErrorIndicatorPressed(AssetInfo)>
		if(obj == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       30
		{
			com.irobot.home.util.o.f("RobotCleanFragment", "The current robot object is null !!");
	//   10   20:ldc2            #585 <String "RobotCleanFragment">
	//   11   23:ldc2            #1552 <String "The current robot object is null !!">
	//   12   26:invokestatic    #1554 <Method void o.f(String, String)>
			return;
	//   13   29:return          
		}
		if(E != null && E.otherContent != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #198 <Field RobotErrorHelpContentList E>
	//*  16   34:ifnull          229
	//*  17   37:aload_0         
	//*  18   38:getfield        #198 <Field RobotErrorHelpContentList E>
	//*  19   41:getfield        #694 <Field List RobotErrorHelpContentList.otherContent>
	//*  20   44:ifnonnull       50
	//*  21   47:goto            229
		{
			obj = ((Object) (Assembler.getInstance().getNetworkUIService(((com.irobot.home.model.a) (obj)).b()).getServiceData().getCurrentConnectionState()));
	//   22   50:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//   23   53:aload_2         
	//   24   54:invokevirtual   #1556 <Method AssetId com.irobot.home.model.a.b()>
	//   25   57:invokevirtual   #414 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   26   60:invokevirtual   #420 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   27   63:invokevirtual   #788 <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//   28   66:astore_2        
			if(!((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.Error))) && !((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.RemoteMissing))))
	//*  29   67:aload_2         
	//*  30   68:getstatic       #794 <Field CurrentConnectionState CurrentConnectionState.Error>
	//*  31   71:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*  32   74:ifne            177
	//*  33   77:aload_2         
	//*  34   78:getstatic       #808 <Field CurrentConnectionState CurrentConnectionState.RemoteMissing>
	//*  35   81:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*  36   84:ifeq            90
	//*  37   87:goto            177
			{
				boolean flag = com.irobot.home.util.j.i(aP);
	//   38   90:aload_0         
	//   39   91:getfield        #678 <Field String aP>
	//   40   94:invokestatic    #688 <Method boolean j.i(String)>
	//   41   97:istore_1        
				if(flag)
	//*  42   98:iload_1         
	//*  43   99:ifeq            110
					obj = ((Object) (aP));
	//   44  102:aload_0         
	//   45  103:getfield        #678 <Field String aP>
	//   46  106:astore_2        
				else
	//*  47  107:goto            115
					obj = ((Object) (aL));
	//   48  110:aload_0         
	//   49  111:getfield        #194 <Field String aL>
	//   50  114:astore_2        
				if(!h(g(((String) (obj)))))
	//*  51  115:aload_0         
	//*  52  116:aload_0         
	//*  53  117:aload_2         
	//*  54  118:invokespecial   #1228 <Method String g(String)>
	//*  55  121:invokespecial   #1536 <Method boolean h(String)>
	//*  56  124:ifne            161
				{
					com.irobot.home.util.o.d("RobotCleanFragment", String.format("Could not find appropriate help content for errors. dockError: %s, cached: %s", new Object[] {
						aP, aL
					}));
	//   57  127:ldc2            #585 <String "RobotCleanFragment">
	//   58  130:ldc2            #1558 <String "Could not find appropriate help content for errors. dockError: %s, cached: %s">
	//   59  133:iconst_2        
	//   60  134:anewarray       Object[]
	//   61  137:dup             
	//   62  138:iconst_0        
	//   63  139:aload_0         
	//   64  140:getfield        #678 <Field String aP>
	//   65  143:aastore         
	//   66  144:dup             
	//   67  145:iconst_1        
	//   68  146:aload_0         
	//   69  147:getfield        #194 <Field String aL>
	//   70  150:aastore         
	//   71  151:invokestatic    #927 <Method String String.format(String, Object[])>
	//   72  154:invokestatic    #592 <Method void o.d(String, String)>
					u();
	//   73  157:aload_0         
	//   74  158:invokevirtual   #1560 <Method void u()>
				}
				if(flag)
	//*  75  161:iload_1         
	//*  76  162:ifeq            176
					AnalyticsSubsystem.getInstance().trackEvacuationDockErrorHelpContentViewed(assetinfo, aP);
	//   77  165:invokestatic    #909 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   78  168:aload_3         
	//   79  169:aload_0         
	//   80  170:getfield        #678 <Field String aP>
	//   81  173:invokevirtual   #1564 <Method void AnalyticsSubsystem.trackEvacuationDockErrorHelpContentViewed(AssetInfo, String)>
				return;
	//   82  176:return          
			}
			if(((CurrentConnectionState) (obj)).equals(((Object) (CurrentConnectionState.Error))))
	//*  83  177:aload_2         
	//*  84  178:getstatic       #794 <Field CurrentConnectionState CurrentConnectionState.Error>
	//*  85  181:invokevirtual   #798 <Method boolean CurrentConnectionState.equals(Object)>
	//*  86  184:ifeq            208
			{
				if(bc)
	//*  87  187:aload_0         
	//*  88  188:getfield        #229 <Field boolean bc>
	//*  89  191:ifeq            201
					obj = "dup_BLID_error";
	//   90  194:ldc2            #1230 <String "dup_BLID_error">
	//   91  197:astore_2        
				else
	//*  92  198:goto            212
					obj = "Cloud_down_no_globes";
	//   93  201:ldc2            #1232 <String "Cloud_down_no_globes">
	//   94  204:astore_2        
			} else
	//*  95  205:goto            212
			{
				obj = "Robot_missing";
	//   96  208:ldc2            #1226 <String "Robot_missing">
	//   97  211:astore_2        
			}
			if(!h(g(((String) (obj)))))
	//*  98  212:aload_0         
	//*  99  213:aload_0         
	//* 100  214:aload_2         
	//* 101  215:invokespecial   #1228 <Method String g(String)>
	//* 102  218:invokespecial   #1536 <Method boolean h(String)>
	//* 103  221:ifne            228
				u();
	//  104  224:aload_0         
	//  105  225:invokevirtual   #1560 <Method void u()>
			return;
	//  106  228:return          
		} else
		{
			com.irobot.home.util.o.e("RobotCleanFragment", "The website url returned null for robot alert help url !");
	//  107  229:ldc2            #585 <String "RobotCleanFragment">
	//  108  232:ldc2            #1566 <String "The website url returned null for robot alert help url !">
	//  109  235:invokestatic    #726 <Method void o.e(String, String)>
			u();
	//  110  238:aload_0         
	//  111  239:invokevirtual   #1560 <Method void u()>
			return;
	//  112  242:return          
		}
	}

	public void s()
	{
		if(aN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field boolean aN>
	//*   2    4:ifeq            30
		{
			b();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #1116 <Method void b()>
			if(a != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #1435 <Field i$a a>
	//*   7   15:ifnull          30
				a.a(MissionStatusAction.Cancel);
	//    8   18:aload_0         
	//    9   19:getfield        #1435 <Field i$a a>
	//   10   22:getstatic       #1494 <Field MissionStatusAction MissionStatusAction.Cancel>
	//   11   25:invokeinterface #1466 <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
		}
	//   12   30:return          
	}

	public boolean t()
	{
		return aN;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field boolean aN>
	//    2    4:ireturn         
	}

	protected void u()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (getActivity())))).setMessage(0x7f0f0925).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #436 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #440 <Method Activity getActivity()>
	//    4    8:invokespecial   #443 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    5   11:ldc2            #1567 <Int 0x7f0f0925>
	//    6   14:invokevirtual   #448 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    7   17:ldc2            #449 <Int 0x7f0f05bb>
	//    8   20:aconst_null     
	//    9   21:invokevirtual   #453 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   10   24:invokevirtual   #462 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   11   27:pop             
	//   12   28:return          
	}

	void v()
	{
		if(D != null && D.commonQuestions != null && D.commonQuestions.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field CommonQuestionList D>
	//*   2    4:ifnull          71
	//*   3    7:aload_0         
	//*   4    8:getfield        #196 <Field CommonQuestionList D>
	//*   5   11:getfield        #1572 <Field List CommonQuestionList.commonQuestions>
	//*   6   14:ifnull          71
	//*   7   17:aload_0         
	//*   8   18:getfield        #196 <Field CommonQuestionList D>
	//*   9   21:getfield        #1572 <Field List CommonQuestionList.commonQuestions>
	//*  10   24:invokeinterface #1575 <Method int List.size()>
	//*  11   29:ifle            71
			WebViewActivity_.a(((android.app.Fragment) (this))).a(((CommonQuestion)D.commonQuestions.get(0)).content).a(Integer.valueOf(0x7f0f05d8)).a();
	//   12   32:aload_0         
	//   13   33:invokestatic    #737 <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.app.Fragment)>
	//   14   36:aload_0         
	//   15   37:getfield        #196 <Field CommonQuestionList D>
	//   16   40:getfield        #1572 <Field List CommonQuestionList.commonQuestions>
	//   17   43:iconst_0        
	//   18   44:invokeinterface #1578 <Method Object List.get(int)>
	//   19   49:checkcast       #1580 <Class CommonQuestion>
	//   20   52:getfield        #1581 <Field String CommonQuestion.content>
	//   21   55:invokevirtual   #742 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//   22   58:ldc2            #743 <Int 0x7f0f05d8>
	//   23   61:invokestatic    #603 <Method Integer Integer.valueOf(int)>
	//   24   64:invokevirtual   #746 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   25   67:invokevirtual   #749 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   26   70:pop             
	//   27   71:return          
	}

	public void w()
	{
		ab.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #1583 <Field ProgressBar ab>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #1586 <Method void ProgressBar.setVisibility(int)>
		ad.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #823 <Field BatteryGaugeView ad>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #826 <Method void BatteryGaugeView.setVisibility(int)>
	//    8   17:return          
	}

	public void x()
	{
		ab.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #1583 <Field ProgressBar ab>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #1586 <Method void ProgressBar.setVisibility(int)>
	//    4    9:return          
	}

	public void y()
	{
		aM = new com.irobot.home.util.b(((android.content.Context) (getActivity())), j, ((ImageView) (l)), ((ImageView) (n)), v, x, s, u, w, t);
	//    0    0:aload_0         
	//    1    1:new             #828 <Class com.irobot.home.util.b>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #440 <Method Activity getActivity()>
	//    5    9:aload_0         
	//    6   10:getfield        #363 <Field TextView j>
	//    7   13:aload_0         
	//    8   14:getfield        #296 <Field CustomSquaredImageButton l>
	//    9   17:aload_0         
	//   10   18:getfield        #1440 <Field CircleRippleButton n>
	//   11   21:aload_0         
	//   12   22:getfield        #464 <Field TextView v>
	//   13   25:aload_0         
	//   14   26:getfield        #821 <Field TextView x>
	//   15   29:aload_0         
	//   16   30:getfield        #1588 <Field TextView s>
	//   17   33:aload_0         
	//   18   34:getfield        #1590 <Field TextView u>
	//   19   37:aload_0         
	//   20   38:getfield        #484 <Field TextView w>
	//   21   41:aload_0         
	//   22   42:getfield        #1360 <Field TextView t>
	//   23   45:invokespecial   #1593 <Method void com.irobot.home.util.b(android.content.Context, TextView, ImageView, ImageView, TextView, TextView, TextView, TextView, TextView, TextView)>
	//   24   48:putfield        #752 <Field com.irobot.home.util.b aM>
		Object obj = ((Object) (com.irobot.home.util.j.j()));
	//   25   51:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//   26   54:astore_2        
		if(obj == null)
	//*  27   55:aload_2         
	//*  28   56:ifnonnull       69
		{
			com.irobot.home.util.o.e("RobotCleanFragment", "Null robot current robot found.");
	//   29   59:ldc2            #585 <String "RobotCleanFragment">
	//   30   62:ldc2            #1595 <String "Null robot current robot found.">
	//   31   65:invokestatic    #726 <Method void o.e(String, String)>
			return;
	//   32   68:return          
		}
		obj = ((Object) (((w)obj).c()));
	//   33   69:aload_2         
	//   34   70:checkcast       #857 <Class w>
	//   35   73:invokevirtual   #860 <Method Robot w.c()>
	//   36   76:astore_2        
		aM.a(((Robot) (obj)).x());
	//   37   77:aload_0         
	//   38   78:getfield        #752 <Field com.irobot.home.util.b aM>
	//   39   81:aload_2         
	//   40   82:invokevirtual   #1529 <Method boolean Robot.x()>
	//   41   85:invokevirtual   #1530 <Method void com.irobot.home.util.b.a(boolean)>
		C = com.irobot.home.util.j.i(((android.content.Context) (getActivity())));
	//   42   88:aload_0         
	//   43   89:aload_0         
	//   44   90:invokevirtual   #440 <Method Activity getActivity()>
	//   45   93:invokestatic    #1598 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   46   96:putfield        #1255 <Field CustomerCareRestClient C>
		c();
	//   47   99:aload_0         
	//   48  100:invokevirtual   #1600 <Method void c()>
		obj = ((Object) (com.irobot.home.util.j.a(((android.content.Context) (getActivity())))));
	//   49  103:aload_0         
	//   50  104:invokevirtual   #440 <Method Activity getActivity()>
	//   51  107:invokestatic    #1603 <Method android.graphics.Typeface j.a(android.content.Context)>
	//   52  110:astore_2        
		for(int i1 = 0; i1 < h.getChildCount(); i1++)
	//*  53  111:iconst_0        
	//*  54  112:istore_1        
	//*  55  113:iload_1         
	//*  56  114:aload_0         
	//*  57  115:getfield        #367 <Field LinearLayout h>
	//*  58  118:invokevirtual   #528 <Method int LinearLayout.getChildCount()>
	//*  59  121:icmpge          155
		{
			View view = h.getChildAt(i1);
	//   60  124:aload_0         
	//   61  125:getfield        #367 <Field LinearLayout h>
	//   62  128:iload_1         
	//   63  129:invokevirtual   #532 <Method View LinearLayout.getChildAt(int)>
	//   64  132:astore_3        
			if(view instanceof TextView)
	//*  65  133:aload_3         
	//*  66  134:instanceof      #383 <Class TextView>
	//*  67  137:ifeq            148
				((TextView)view).setTypeface(((android.graphics.Typeface) (obj)));
	//   68  140:aload_3         
	//   69  141:checkcast       #383 <Class TextView>
	//   70  144:aload_2         
	//   71  145:invokevirtual   #1607 <Method void TextView.setTypeface(android.graphics.Typeface)>
		}

	//   72  148:iload_1         
	//   73  149:iconst_1        
	//   74  150:iadd            
	//   75  151:istore_1        
	//*  76  152:goto            113
		T();
	//   77  155:aload_0         
	//   78  156:invokespecial   #476 <Method void T()>
		j(false);
	//   79  159:aload_0         
	//   80  160:iconst_0        
	//   81  161:invokespecial   #474 <Method void j(boolean)>
		obj = ((Object) (com.irobot.home.util.j.j().a()));
	//   82  164:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//   83  167:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//   84  170:astore_2        
		aI = Assembler.getInstance().getSettingsUIService(((AssetInfo) (obj)).convertToPMI());
	//   85  171:aload_0         
	//   86  172:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//   87  175:aload_2         
	//   88  176:invokevirtual   #1611 <Method com.irobot.core.PMIAssetInfo AssetInfo.convertToPMI()>
	//   89  179:invokevirtual   #1615 <Method SettingsSubsystem Assembler.getSettingsUIService(com.irobot.core.PMIAssetInfo)>
	//   90  182:putfield        #1506 <Field SettingsSubsystem aI>
		aK = Assembler.getInstance().getUpdateUIService(((AssetInfo) (obj)).getAssetId());
	//   91  185:aload_0         
	//   92  186:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//   93  189:aload_2         
	//   94  190:invokevirtual   #1380 <Method AssetId AssetInfo.getAssetId()>
	//   95  193:invokevirtual   #1619 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   96  196:putfield        #1514 <Field UpdateUIService aK>
		be = Assembler.getInstance().getMissionSubsystem(((AssetInfo) (obj)).getAssetId());
	//   97  199:aload_0         
	//   98  200:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//   99  203:aload_2         
	//  100  204:invokevirtual   #1380 <Method AssetId AssetInfo.getAssetId()>
	//  101  207:invokevirtual   #1623 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//  102  210:putfield        #241 <Field MissionSubsystem be>
		bf = Assembler.getInstance().getMapsUIService(((AssetInfo) (obj)).getAssetId());
	//  103  213:aload_0         
	//  104  214:invokestatic    #405 <Method Assembler Assembler.getInstance()>
	//  105  217:aload_2         
	//  106  218:invokevirtual   #1380 <Method AssetId AssetInfo.getAssetId()>
	//  107  221:invokevirtual   #1627 <Method MapsUIService Assembler.getMapsUIService(AssetId)>
	//  108  224:putfield        #243 <Field MapsUIService bf>
		if(!"release".contains("dev") && !"release".contains("debug"))
	//* 109  227:ldc2            #1629 <String "release">
	//* 110  230:ldc2            #1631 <String "dev">
	//* 111  233:invokevirtual   #1635 <Method boolean String.contains(CharSequence)>
	//* 112  236:ifne            266
	//* 113  239:ldc2            #1629 <String "release">
	//* 114  242:ldc2            #1637 <String "debug">
	//* 115  245:invokevirtual   #1635 <Method boolean String.contains(CharSequence)>
	//* 116  248:ifeq            254
	//* 117  251:goto            266
		{
			F.setVisibility(8);
	//  118  254:aload_0         
	//  119  255:getfield        #1639 <Field LinearLayout F>
	//  120  258:bipush          8
	//  121  260:invokevirtual   #399 <Method void LinearLayout.setVisibility(int)>
		} else
	//* 122  263:goto            314
		{
			F.setVisibility(0);
	//  123  266:aload_0         
	//  124  267:getfield        #1639 <Field LinearLayout F>
	//  125  270:iconst_0        
	//  126  271:invokevirtual   #399 <Method void LinearLayout.setVisibility(int)>
			I.setText(((CharSequence) (com.irobot.home.util.j.r())));
	//  127  274:aload_0         
	//  128  275:getfield        #1641 <Field CustomTextView I>
	//  129  278:invokestatic    #1642 <Method String j.r()>
	//  130  281:invokevirtual   #641 <Method void CustomTextView.setText(CharSequence)>
			J.setText(((CharSequence) (com.irobot.home.util.j.j().a().getSoftwareVersion())));
	//  131  284:aload_0         
	//  132  285:getfield        #1644 <Field CustomTextView J>
	//  133  288:invokestatic    #769 <Method com.irobot.home.model.a j.j()>
	//  134  291:invokevirtual   #774 <Method AssetInfo com.irobot.home.model.a.a()>
	//  135  294:invokevirtual   #1647 <Method String AssetInfo.getSoftwareVersion()>
	//  136  297:invokevirtual   #641 <Method void CustomTextView.setText(CharSequence)>
			K.setText(((CharSequence) (com.irobot.home.util.j.c(((android.content.Context) (getActivity()))))));
	//  137  300:aload_0         
	//  138  301:getfield        #1649 <Field CustomTextView K>
	//  139  304:aload_0         
	//  140  305:invokevirtual   #440 <Method Activity getActivity()>
	//  141  308:invokestatic    #1651 <Method String j.c(android.content.Context)>
	//  142  311:invokevirtual   #641 <Method void CustomTextView.setText(CharSequence)>
		}
		if(AssetCapabilityUtils.isMoppingRobot(((AssetInfo) (obj))))
	//* 143  314:aload_2         
	//* 144  315:invokestatic    #1654 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//* 145  318:ifeq            338
			n.setHighlightColor(getResources().getColor(0x7f060063));
	//  146  321:aload_0         
	//  147  322:getfield        #1440 <Field CircleRippleButton n>
	//  148  325:aload_0         
	//  149  326:invokevirtual   #317 <Method Resources getResources()>
	//  150  329:ldc2            #1655 <Int 0x7f060063>
	//  151  332:invokevirtual   #658 <Method int Resources.getColor(int)>
	//  152  335:invokevirtual   #1658 <Method void CircleRippleButton.setHighlightColor(int)>
		obj = ((Object) (Q.getViewTreeObserver()));
	//  153  338:aload_0         
	//  154  339:getfield        #511 <Field CircleButton Q>
	//  155  342:invokevirtual   #1659 <Method ViewTreeObserver CircleButton.getViewTreeObserver()>
	//  156  345:astore_2        
		if(((ViewTreeObserver) (obj)).isAlive())
	//* 157  346:aload_2         
	//* 158  347:invokevirtual   #281 <Method boolean ViewTreeObserver.isAlive()>
	//* 159  350:ifeq            365
			((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					a.Q.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field be a>
				//    2    4:getfield        #25  <Field CircleButton be.Q>
				//    3    7:invokevirtual   #31  <Method ViewTreeObserver CircleButton.getViewTreeObserver()>
				//    4   10:aload_0         
				//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)a.T.getLayoutParams();
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field be a>
				//    8   18:getfield        #41  <Field PercentageRingView be.T>
				//    9   21:invokevirtual   #47  <Method android.view.ViewGroup$LayoutParams PercentageRingView.getLayoutParams()>
				//   10   24:checkcast       #49  <Class android.widget.RelativeLayout$LayoutParams>
				//   11   27:astore_1        
					layoutparams.height = a.Q.getButtonRadius() * 2;
				//   12   28:aload_1         
				//   13   29:aload_0         
				//   14   30:getfield        #17  <Field be a>
				//   15   33:getfield        #25  <Field CircleButton be.Q>
				//   16   36:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
				//   17   39:iconst_2        
				//   18   40:imul            
				//   19   41:putfield        #57  <Field int android.widget.RelativeLayout$LayoutParams.height>
					layoutparams.width = a.Q.getButtonRadius() * 2;
				//   20   44:aload_1         
				//   21   45:aload_0         
				//   22   46:getfield        #17  <Field be a>
				//   23   49:getfield        #25  <Field CircleButton be.Q>
				//   24   52:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
				//   25   55:iconst_2        
				//   26   56:imul            
				//   27   57:putfield        #60  <Field int android.widget.RelativeLayout$LayoutParams.width>
					layoutparams.topMargin = a.Q.getPressedHighlightWidth();
				//   28   60:aload_1         
				//   29   61:aload_0         
				//   30   62:getfield        #17  <Field be a>
				//   31   65:getfield        #25  <Field CircleButton be.Q>
				//   32   68:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//   33   71:putfield        #66  <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
					layoutparams.bottomMargin = a.Q.getPressedHighlightWidth();
				//   34   74:aload_1         
				//   35   75:aload_0         
				//   36   76:getfield        #17  <Field be a>
				//   37   79:getfield        #25  <Field CircleButton be.Q>
				//   38   82:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//   39   85:putfield        #69  <Field int android.widget.RelativeLayout$LayoutParams.bottomMargin>
					layoutparams.setMarginStart(a.Q.getPressedHighlightWidth());
				//   40   88:aload_1         
				//   41   89:aload_0         
				//   42   90:getfield        #17  <Field be a>
				//   43   93:getfield        #25  <Field CircleButton be.Q>
				//   44   96:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//   45   99:invokevirtual   #73  <Method void android.widget.RelativeLayout$LayoutParams.setMarginStart(int)>
					layoutparams.setMarginEnd(a.Q.getPressedHighlightWidth());
				//   46  102:aload_1         
				//   47  103:aload_0         
				//   48  104:getfield        #17  <Field be a>
				//   49  107:getfield        #25  <Field CircleButton be.Q>
				//   50  110:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//   51  113:invokevirtual   #76  <Method void android.widget.RelativeLayout$LayoutParams.setMarginEnd(int)>
					a.T.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
				//   52  116:aload_0         
				//   53  117:getfield        #17  <Field be a>
				//   54  120:getfield        #41  <Field PercentageRingView be.T>
				//   55  123:aload_1         
				//   56  124:invokevirtual   #80  <Method void PercentageRingView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					layoutparams = (android.widget.RelativeLayout.LayoutParams)a.aa.getLayoutParams();
				//   57  127:aload_0         
				//   58  128:getfield        #17  <Field be a>
				//   59  131:getfield        #84  <Field ImageView be.aa>
				//   60  134:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
				//   61  137:checkcast       #49  <Class android.widget.RelativeLayout$LayoutParams>
				//   62  140:astore_1        
					layoutparams.height = a.Q.getButtonRadius() * 2;
				//   63  141:aload_1         
				//   64  142:aload_0         
				//   65  143:getfield        #17  <Field be a>
				//   66  146:getfield        #25  <Field CircleButton be.Q>
				//   67  149:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
				//   68  152:iconst_2        
				//   69  153:imul            
				//   70  154:putfield        #57  <Field int android.widget.RelativeLayout$LayoutParams.height>
					layoutparams.width = a.Q.getButtonRadius() * 2;
				//   71  157:aload_1         
				//   72  158:aload_0         
				//   73  159:getfield        #17  <Field be a>
				//   74  162:getfield        #25  <Field CircleButton be.Q>
				//   75  165:invokevirtual   #53  <Method int CircleButton.getButtonRadius()>
				//   76  168:iconst_2        
				//   77  169:imul            
				//   78  170:putfield        #60  <Field int android.widget.RelativeLayout$LayoutParams.width>
					layoutparams.topMargin = a.Q.getPressedHighlightWidth();
				//   79  173:aload_1         
				//   80  174:aload_0         
				//   81  175:getfield        #17  <Field be a>
				//   82  178:getfield        #25  <Field CircleButton be.Q>
				//   83  181:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//   84  184:putfield        #66  <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
					layoutparams.bottomMargin = a.Q.getPressedHighlightWidth();
				//   85  187:aload_1         
				//   86  188:aload_0         
				//   87  189:getfield        #17  <Field be a>
				//   88  192:getfield        #25  <Field CircleButton be.Q>
				//   89  195:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//   90  198:putfield        #69  <Field int android.widget.RelativeLayout$LayoutParams.bottomMargin>
					layoutparams.setMarginStart(a.Q.getPressedHighlightWidth());
				//   91  201:aload_1         
				//   92  202:aload_0         
				//   93  203:getfield        #17  <Field be a>
				//   94  206:getfield        #25  <Field CircleButton be.Q>
				//   95  209:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//   96  212:invokevirtual   #73  <Method void android.widget.RelativeLayout$LayoutParams.setMarginStart(int)>
					layoutparams.setMarginEnd(a.Q.getPressedHighlightWidth());
				//   97  215:aload_1         
				//   98  216:aload_0         
				//   99  217:getfield        #17  <Field be a>
				//  100  220:getfield        #25  <Field CircleButton be.Q>
				//  101  223:invokevirtual   #63  <Method int CircleButton.getPressedHighlightWidth()>
				//  102  226:invokevirtual   #76  <Method void android.widget.RelativeLayout$LayoutParams.setMarginEnd(int)>
					a.aa.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
				//  103  229:aload_0         
				//  104  230:getfield        #17  <Field be a>
				//  105  233:getfield        #84  <Field ImageView be.aa>
				//  106  236:aload_1         
				//  107  237:invokevirtual   #88  <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				//  108  240:return          
				}

				final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  160  353:aload_2         
	//  161  354:new             #20  <Class be$3>
	//  162  357:dup             
	//  163  358:aload_0         
	//  164  359:invokespecial   #1660 <Method void be$3(be)>
	//  165  362:invokevirtual   #288 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		Q.setEnabled(false);
	//  166  365:aload_0         
	//  167  366:getfield        #511 <Field CircleButton Q>
	//  168  369:iconst_0        
	//  169  370:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
		O.setEnabled(false);
	//  170  373:aload_0         
	//  171  374:getfield        #518 <Field CircleButton O>
	//  172  377:iconst_0        
	//  173  378:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
		S.setEnabled(false);
	//  174  381:aload_0         
	//  175  382:getfield        #352 <Field CircleButton S>
	//  176  385:iconst_0        
	//  177  386:invokevirtual   #516 <Method void CircleButton.setEnabled(boolean)>
		T.setClickable(false);
	//  178  389:aload_0         
	//  179  390:getfield        #520 <Field PercentageRingView T>
	//  180  393:iconst_0        
	//  181  394:invokevirtual   #525 <Method void PercentageRingView.setClickable(boolean)>
		T.setRingFillPercentile(0);
	//  182  397:aload_0         
	//  183  398:getfield        #520 <Field PercentageRingView T>
	//  184  401:iconst_0        
	//  185  402:invokevirtual   #610 <Method void PercentageRingView.setRingFillPercentile(int)>
		T.setRingLabelText("");
	//  186  405:aload_0         
	//  187  406:getfield        #520 <Field PercentageRingView T>
	//  188  409:ldc2            #612 <String "">
	//  189  412:invokevirtual   #615 <Method void PercentageRingView.setRingLabelText(String)>
		U.setText(((CharSequence) (getResources().getString(0x7f0f0335, new Object[] {
			Integer.valueOf(0)
		}))));
	//  190  415:aload_0         
	//  191  416:getfield        #636 <Field CustomTextView U>
	//  192  419:aload_0         
	//  193  420:invokevirtual   #317 <Method Resources getResources()>
	//  194  423:ldc2            #595 <Int 0x7f0f0335>
	//  195  426:iconst_1        
	//  196  427:anewarray       Object[]
	//  197  430:dup             
	//  198  431:iconst_0        
	//  199  432:iconst_0        
	//  200  433:invokestatic    #603 <Method Integer Integer.valueOf(int)>
	//  201  436:aastore         
	//  202  437:invokevirtual   #607 <Method String Resources.getString(int, Object[])>
	//  203  440:invokevirtual   #641 <Method void CustomTextView.setText(CharSequence)>
		N.setTextColor(getResources().getColor(0x7f06006d));
	//  204  443:aload_0         
	//  205  444:getfield        #654 <Field CustomTextView N>
	//  206  447:aload_0         
	//  207  448:invokevirtual   #317 <Method Resources getResources()>
	//  208  451:ldc2            #663 <Int 0x7f06006d>
	//  209  454:invokevirtual   #658 <Method int Resources.getColor(int)>
	//  210  457:invokevirtual   #661 <Method void CustomTextView.setTextColor(int)>
	//  211  460:return          
	}

	public void z()
	{
		aI.unregisterSubscriber(aJ);
	//    0    0:aload_0         
	//    1    1:getfield        #1506 <Field SettingsSubsystem aI>
	//    2    4:aload_0         
	//    3    5:getfield        #234 <Field SettingsUIServiceDataCallback aJ>
	//    4    8:invokevirtual   #1663 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    5   11:pop             
		aK.unregisterSubscriber(((OTAUIServiceDataCallback) (bj)));
	//    6   12:aload_0         
	//    7   13:getfield        #1514 <Field UpdateUIService aK>
	//    8   16:aload_0         
	//    9   17:getfield        #252 <Field be$a bj>
	//   10   20:invokevirtual   #1665 <Method boolean UpdateUIService.unregisterSubscriber(OTAUIServiceDataCallback)>
	//   11   23:pop             
		be.unregisterSubscriber(((MissionUIServiceDataCallback) (bg)));
	//   12   24:aload_0         
	//   13   25:getfield        #241 <Field MissionSubsystem be>
	//   14   28:aload_0         
	//   15   29:getfield        #246 <Field be$c bg>
	//   16   32:invokevirtual   #1667 <Method boolean MissionSubsystem.unregisterSubscriber(MissionUIServiceDataCallback)>
	//   17   35:pop             
		bf.unregisterSubscriber(((MapsUIServiceDataCallback) (bh)));
	//   18   36:aload_0         
	//   19   37:getfield        #243 <Field MapsUIService bf>
	//   20   40:aload_0         
	//   21   41:getfield        #249 <Field be$b bh>
	//   22   44:invokevirtual   #1669 <Method boolean MapsUIService.unregisterSubscriber(MapsUIServiceDataCallback)>
	//   23   47:pop             
	//   24   48:return          
	}

	RelativeLayout A;
	LinearLayout B;
	CustomerCareRestClient C;
	CommonQuestionList D;
	RobotErrorHelpContentList E;
	LinearLayout F;
	View G;
	View H;
	CustomTextView I;
	CustomTextView J;
	CustomTextView K;
	CustomTextView L;
	LinearLayout M;
	CustomTextView N;
	CircleButton O;
	LinearLayout P;
	CircleButton Q;
	CustomTextView R;
	CircleButton S;
	PercentageRingView T;
	CustomTextView U;
	LinearLayout V;
	HideableView W;
	HideableView X;
	RelativeLayout Y;
	HideableView Z;
	ObjectAnimator aA;
	ObjectAnimator aB;
	ObjectAnimator aC;
	ObjectAnimator aD;
	ObjectAnimator aE;
	ObjectAnimator aF;
	ObjectAnimator aG;
	ObjectAnimator aH;
	SettingsSubsystem aI;
	SettingsUIServiceDataCallback aJ;
	UpdateUIService aK;
	private volatile String aL;
	private com.irobot.home.util.b aM;
	private boolean aN;
	private Handler aO;
	private String aP;
	private boolean aQ;
	private boolean aR;
	private boolean aS;
	private boolean aT;
	private boolean aU;
	private boolean aV;
	private volatile boolean aW;
	private boolean aX;
	private boolean aY;
	private boolean aZ;
	ImageView aa;
	ProgressBar ab;
	ImageView ac;
	BatteryGaugeView ad;
	AnimatorSet ae;
	AnimatorSet af;
	AnimatorSet ag;
	AnimatorSet ah;
	AnimatorSet ai;
	AnimatorSet aj;
	AnimatorSet ak;
	AnimatorSet al;
	AnimatorSet am;
	ObjectAnimator an;
	ObjectAnimator ao;
	ObjectAnimator ap;
	ObjectAnimator aq;
	ObjectAnimator ar;
	ObjectAnimator as;
	ObjectAnimator at;
	ObjectAnimator au;
	ObjectAnimator av;
	ObjectAnimator aw;
	ObjectAnimator ax;
	ObjectAnimator ay;
	ObjectAnimator az;
	private boolean ba;
	private ScheduleTypeSupported bb;
	private boolean bc;
	private com.irobot.home.m.b bd;
	private MissionSubsystem be;
	private MapsUIService bf;
	private c bg;
	private b bh;
	private d bi;
	private a bj;
	k g;
	LinearLayout h;
	LinearLayout i;
	TextView j;
	TextView k;
	CustomSquaredImageButton l;
	CircleRippleButton n;
	TextView o;
	TextView p;
	ImageView q;
	ImageView r;
	TextView s;
	TextView t;
	TextView u;
	TextView v;
	TextView w;
	TextView x;
	RelativeLayout y;
	CustomButton z;
}
