// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.*;
import android.content.res.Resources;
import android.graphics.*;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.TypedValue;
import android.view.*;
import android.webkit.*;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.b.t;
import com.irobot.home.fragments.GoToMapPrivacyFragment_;
import com.irobot.home.fragments.ak;
import com.irobot.home.fragments.an;
import com.irobot.home.fragments.at;
import com.irobot.home.model.a;
import com.irobot.home.model.q;
import com.irobot.home.model.r;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.model.u;
import com.irobot.home.q.b;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTabLayout;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.WebViewLanguageCompat;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BasePushNotificationActivity, WebViewActivity_, WifiMapFeedbackActivity_, IRobotApplication, 
//			MapCustomizationActivity_

public class MissionDetailsActivity extends BasePushNotificationActivity
	implements c.a
{
	private class a extends MapsUIServiceDataCallback
	{

		public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
		{
			if(mapsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.e(com.irobot.home.MissionDetailsActivity.q(), "null service data");
		//    2    4:invokestatic    #25  <Method String com.irobot.home.MissionDetailsActivity.q()>
		//    3    7:ldc1            #27  <String "null service data">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			Object obj = ((Object) (mapsuiservicedata.getMapsDataStates()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList MapsUIServiceData.getMapsDataStates()>
		//    8   17:astore_2        
			String s1 = com.irobot.home.MissionDetailsActivity.q();
		//    9   18:invokestatic    #25  <Method String com.irobot.home.MissionDetailsActivity.q()>
		//   10   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   11   22:new             #41  <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #42  <Method void StringBuilder()>
		//   14   29:astore          4
			stringbuilder.append("Change list: ");
		//   15   31:aload           4
		//   16   33:ldc1            #44  <String "Change list: ">
		//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   19   39:aload           4
		//   20   41:aload_2         
		//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
		//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			com.irobot.home.util.o.b(s1, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #57  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   28   58:aload_2         
		//   29   59:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
		//   30   62:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   31   63:aload_2         
		//   32   64:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   33   69:ifeq            290
				MapsDataState mapsdatastate = (MapsDataState)((Iterator) (obj)).next();
		//   34   72:aload_2         
		//   35   73:invokeinterface #71  <Method Object Iterator.next()>
		//   36   78:checkcast       #73  <Class MapsDataState>
		//   37   81:astore_3        
				static class _cls4
				{

					static final int a[];
					static final int b[];
					static final int c[];
					static final int d[];
					static final int e[];
					static final int f[];

					static 
					{
						f = new int[RobotRankOverlap.values().length];
					//    0    0:invokestatic    #23  <Method RobotRankOverlap[] RobotRankOverlap.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #25  <Field int[] f>
						try
						{
							f[RobotRankOverlap.DeepClean.ordinal()] = 1;
					//    4    9:getstatic       #25  <Field int[] f>
					//    5   12:getstatic       #29  <Field RobotRankOverlap RobotRankOverlap.DeepClean>
					//    6   15:invokevirtual   #33  <Method int RobotRankOverlap.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #25  <Field int[] f>
					//*  10   23:getstatic       #36  <Field RobotRankOverlap RobotRankOverlap.ExtendedClean>
					//*  11   26:invokevirtual   #33  <Method int RobotRankOverlap.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #25  <Field int[] f>
					//*  15   34:getstatic       #39  <Field RobotRankOverlap RobotRankOverlap.DetailClean>
					//*  16   37:invokevirtual   #33  <Method int RobotRankOverlap.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:invokestatic    #44  <Method RobotMissionHistoryCompletionStatus[] RobotMissionHistoryCompletionStatus.values()>
					//*  20   45:arraylength     
					//*  21   46:newarray        int[]
					//*  22   48:putstatic       #46  <Field int[] e>
					//*  23   51:getstatic       #46  <Field int[] e>
					//*  24   54:getstatic       #50  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Completed>
					//*  25   57:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  26   60:iconst_1        
					//*  27   61:iastore         
					//*  28   62:getstatic       #46  <Field int[] e>
					//*  29   65:getstatic       #54  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Canceled>
					//*  30   68:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  31   71:iconst_2        
					//*  32   72:iastore         
					//*  33   73:getstatic       #46  <Field int[] e>
					//*  34   76:getstatic       #57  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.None>
					//*  35   79:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  36   82:iconst_3        
					//*  37   83:iastore         
					//*  38   84:getstatic       #46  <Field int[] e>
					//*  39   87:getstatic       #60  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Full>
					//*  40   90:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  41   93:iconst_4        
					//*  42   94:iastore         
					//*  43   95:getstatic       #46  <Field int[] e>
					//*  44   98:getstatic       #63  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Empty>
					//*  45  101:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  46  104:iconst_5        
					//*  47  105:iastore         
					//*  48  106:getstatic       #46  <Field int[] e>
					//*  49  109:getstatic       #66  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Stuck>
					//*  50  112:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  51  115:bipush          6
					//*  52  117:iastore         
					//*  53  118:getstatic       #46  <Field int[] e>
					//*  54  121:getstatic       #69  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.LowBattery>
					//*  55  124:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  56  127:bipush          7
					//*  57  129:iastore         
					//*  58  130:getstatic       #46  <Field int[] e>
					//*  59  133:getstatic       #72  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.ClockError>
					//*  60  136:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  61  139:bipush          8
					//*  62  141:iastore         
					//*  63  142:getstatic       #46  <Field int[] e>
					//*  64  145:getstatic       #75  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Busy>
					//*  65  148:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  66  151:bipush          9
					//*  67  153:iastore         
					//*  68  154:getstatic       #46  <Field int[] e>
					//*  69  157:getstatic       #78  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Incomplete>
					//*  70  160:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  71  163:bipush          10
					//*  72  165:iastore         
					//*  73  166:invokestatic    #83  <Method MissionDetailsViewState[] MissionDetailsViewState.values()>
					//*  74  169:arraylength     
					//*  75  170:newarray        int[]
					//*  76  172:putstatic       #85  <Field int[] d>
					//*  77  175:getstatic       #85  <Field int[] d>
					//*  78  178:getstatic       #89  <Field MissionDetailsViewState MissionDetailsViewState.Loading>
					//*  79  181:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
					//*  80  184:iconst_1        
					//*  81  185:iastore         
					//*  82  186:getstatic       #85  <Field int[] d>
					//*  83  189:getstatic       #93  <Field MissionDetailsViewState MissionDetailsViewState.MapsNotSupported>
					//*  84  192:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
					//*  85  195:iconst_2        
					//*  86  196:iastore         
					//*  87  197:getstatic       #85  <Field int[] d>
					//*  88  200:getstatic       #96  <Field MissionDetailsViewState MissionDetailsViewState.NoMapAvailable>
					//*  89  203:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
					//*  90  206:iconst_3        
					//*  91  207:iastore         
					//*  92  208:getstatic       #85  <Field int[] d>
					//*  93  211:getstatic       #99  <Field MissionDetailsViewState MissionDetailsViewState.MapsWithFwUpdate>
					//*  94  214:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
					//*  95  217:iconst_4        
					//*  96  218:iastore         
					//*  97  219:getstatic       #85  <Field int[] d>
					//*  98  222:getstatic       #102 <Field MissionDetailsViewState MissionDetailsViewState.PmapsNotAllowed>
					//*  99  225:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
					//* 100  228:iconst_5        
					//* 101  229:iastore         
					//* 102  230:getstatic       #85  <Field int[] d>
					//* 103  233:getstatic       #105 <Field MissionDetailsViewState MissionDetailsViewState.ShowMissionMaps>
					//* 104  236:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
					//* 105  239:bipush          6
					//* 106  241:iastore         
					//* 107  242:getstatic       #85  <Field int[] d>
					//* 108  245:getstatic       #108 <Field MissionDetailsViewState MissionDetailsViewState.FailedToLoadMission>
					//* 109  248:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
					//* 110  251:bipush          7
					//* 111  253:iastore         
					//* 112  254:invokestatic    #113 <Method SettingType[] SettingType.values()>
					//* 113  257:arraylength     
					//* 114  258:newarray        int[]
					//* 115  260:putstatic       #115 <Field int[] c>
					//* 116  263:getstatic       #115 <Field int[] c>
					//* 117  266:getstatic       #119 <Field SettingType SettingType.Name>
					//* 118  269:invokevirtual   #120 <Method int SettingType.ordinal()>
					//* 119  272:iconst_1        
					//* 120  273:iastore         
					//* 121  274:invokestatic    #125 <Method MapsDataState[] MapsDataState.values()>
					//* 122  277:arraylength     
					//* 123  278:newarray        int[]
					//* 124  280:putstatic       #127 <Field int[] b>
					//* 125  283:getstatic       #127 <Field int[] b>
					//* 126  286:getstatic       #131 <Field MapsDataState MapsDataState.MissionDetailsViewState>
					//* 127  289:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 128  292:iconst_1        
					//* 129  293:iastore         
					//* 130  294:getstatic       #127 <Field int[] b>
					//* 131  297:getstatic       #135 <Field MapsDataState MapsDataState.MapCustomizationInfo>
					//* 132  300:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 133  303:iconst_2        
					//* 134  304:iastore         
					//* 135  305:getstatic       #127 <Field int[] b>
					//* 136  308:getstatic       #138 <Field MapsDataState MapsDataState.ErrorMessage>
					//* 137  311:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 138  314:iconst_3        
					//* 139  315:iastore         
					//* 140  316:getstatic       #127 <Field int[] b>
					//* 141  319:getstatic       #141 <Field MapsDataState MapsDataState.RuntimeChart>
					//* 142  322:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 143  325:iconst_4        
					//* 144  326:iastore         
					//* 145  327:getstatic       #127 <Field int[] b>
					//* 146  330:getstatic       #144 <Field MapsDataState MapsDataState.MissionHistoryDetails>
					//* 147  333:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 148  336:iconst_5        
					//* 149  337:iastore         
					//* 150  338:getstatic       #127 <Field int[] b>
					//* 151  341:getstatic       #147 <Field MapsDataState MapsDataState.WifiBadRegions>
					//* 152  344:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 153  347:bipush          6
					//* 154  349:iastore         
					//* 155  350:getstatic       #127 <Field int[] b>
					//* 156  353:getstatic       #150 <Field MapsDataState MapsDataState.WifiColorLegend>
					//* 157  356:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 158  359:bipush          7
					//* 159  361:iastore         
					//* 160  362:getstatic       #127 <Field int[] b>
					//* 161  365:getstatic       #153 <Field MapsDataState MapsDataState.PlaybackProgress>
					//* 162  368:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 163  371:bipush          8
					//* 164  373:iastore         
					//* 165  374:getstatic       #127 <Field int[] b>
					//* 166  377:getstatic       #156 <Field MapsDataState MapsDataState.MissionMapZoomState>
					//* 167  380:invokevirtual   #132 <Method int MapsDataState.ordinal()>
					//* 168  383:bipush          9
					//* 169  385:iastore         
					//* 170  386:invokestatic    #161 <Method MissionMapType[] MissionMapType.values()>
					//* 171  389:arraylength     
					//* 172  390:newarray        int[]
					//* 173  392:putstatic       #163 <Field int[] a>
					//* 174  395:getstatic       #163 <Field int[] a>
					//* 175  398:getstatic       #167 <Field MissionMapType MissionMapType.CleanMission>
					//* 176  401:invokevirtual   #168 <Method int MissionMapType.ordinal()>
					//* 177  404:iconst_1        
					//* 178  405:iastore         
					//* 179  406:getstatic       #163 <Field int[] a>
					//* 180  409:getstatic       #171 <Field MissionMapType MissionMapType.WifiHeat>
					//* 181  412:invokevirtual   #168 <Method int MissionMapType.ordinal()>
					//* 182  415:iconst_2        
					//* 183  416:iastore         
					//* 184  417:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//  185  418:astore_0        
						try
						{
							f[RobotRankOverlap.ExtendedClean.ordinal()] = 2;
						}
					//* 186  419:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//  187  422:astore_0        
						try
						{
							f[RobotRankOverlap.DetailClean.ordinal()] = 3;
						}
					//* 188  423:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//  189  426:astore_0        
						e = new int[RobotMissionHistoryCompletionStatus.values().length];
						try
						{
							e[RobotMissionHistoryCompletionStatus.Completed.ordinal()] = 1;
						}
					//* 190  427:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//  191  430:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.Canceled.ordinal()] = 2;
						}
					//* 192  431:goto            62
						catch(NoSuchFieldError nosuchfielderror4) { }
					//  193  434:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.None.ordinal()] = 3;
						}
					//* 194  435:goto            73
						catch(NoSuchFieldError nosuchfielderror5) { }
					//  195  438:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.Full.ordinal()] = 4;
						}
					//* 196  439:goto            84
						catch(NoSuchFieldError nosuchfielderror6) { }
					//  197  442:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.Empty.ordinal()] = 5;
						}
					//* 198  443:goto            95
						catch(NoSuchFieldError nosuchfielderror7) { }
					//  199  446:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.Stuck.ordinal()] = 6;
						}
					//* 200  447:goto            106
						catch(NoSuchFieldError nosuchfielderror8) { }
					//  201  450:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.LowBattery.ordinal()] = 7;
						}
					//* 202  451:goto            118
						catch(NoSuchFieldError nosuchfielderror9) { }
					//  203  454:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.ClockError.ordinal()] = 8;
						}
					//* 204  455:goto            130
						catch(NoSuchFieldError nosuchfielderror10) { }
					//  205  458:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.Busy.ordinal()] = 9;
						}
					//* 206  459:goto            142
						catch(NoSuchFieldError nosuchfielderror11) { }
					//  207  462:astore_0        
						try
						{
							e[RobotMissionHistoryCompletionStatus.Incomplete.ordinal()] = 10;
						}
					//* 208  463:goto            154
						catch(NoSuchFieldError nosuchfielderror12) { }
					//  209  466:astore_0        
						d = new int[MissionDetailsViewState.values().length];
						try
						{
							d[MissionDetailsViewState.Loading.ordinal()] = 1;
						}
					//* 210  467:goto            166
						catch(NoSuchFieldError nosuchfielderror13) { }
					//  211  470:astore_0        
						try
						{
							d[MissionDetailsViewState.MapsNotSupported.ordinal()] = 2;
						}
					//* 212  471:goto            186
						catch(NoSuchFieldError nosuchfielderror14) { }
					//  213  474:astore_0        
						try
						{
							d[MissionDetailsViewState.NoMapAvailable.ordinal()] = 3;
						}
					//* 214  475:goto            197
						catch(NoSuchFieldError nosuchfielderror15) { }
					//  215  478:astore_0        
						try
						{
							d[MissionDetailsViewState.MapsWithFwUpdate.ordinal()] = 4;
						}
					//* 216  479:goto            208
						catch(NoSuchFieldError nosuchfielderror16) { }
					//  217  482:astore_0        
						try
						{
							d[MissionDetailsViewState.PmapsNotAllowed.ordinal()] = 5;
						}
					//* 218  483:goto            219
						catch(NoSuchFieldError nosuchfielderror17) { }
					//  219  486:astore_0        
						try
						{
							d[MissionDetailsViewState.ShowMissionMaps.ordinal()] = 6;
						}
					//* 220  487:goto            230
						catch(NoSuchFieldError nosuchfielderror18) { }
					//  221  490:astore_0        
						try
						{
							d[MissionDetailsViewState.FailedToLoadMission.ordinal()] = 7;
						}
					//* 222  491:goto            242
						catch(NoSuchFieldError nosuchfielderror19) { }
					//  223  494:astore_0        
						c = new int[SettingType.values().length];
						try
						{
							c[SettingType.Name.ordinal()] = 1;
						}
					//* 224  495:goto            254
						catch(NoSuchFieldError nosuchfielderror20) { }
					//  225  498:astore_0        
						b = new int[MapsDataState.values().length];
						try
						{
							b[MapsDataState.MissionDetailsViewState.ordinal()] = 1;
						}
					//* 226  499:goto            274
						catch(NoSuchFieldError nosuchfielderror21) { }
					//  227  502:astore_0        
						try
						{
							b[MapsDataState.MapCustomizationInfo.ordinal()] = 2;
						}
					//* 228  503:goto            294
						catch(NoSuchFieldError nosuchfielderror22) { }
					//  229  506:astore_0        
						try
						{
							b[MapsDataState.ErrorMessage.ordinal()] = 3;
						}
					//* 230  507:goto            305
						catch(NoSuchFieldError nosuchfielderror23) { }
					//  231  510:astore_0        
						try
						{
							b[MapsDataState.RuntimeChart.ordinal()] = 4;
						}
					//* 232  511:goto            316
						catch(NoSuchFieldError nosuchfielderror24) { }
					//  233  514:astore_0        
						try
						{
							b[MapsDataState.MissionHistoryDetails.ordinal()] = 5;
						}
					//* 234  515:goto            327
						catch(NoSuchFieldError nosuchfielderror25) { }
					//  235  518:astore_0        
						try
						{
							b[MapsDataState.WifiBadRegions.ordinal()] = 6;
						}
					//* 236  519:goto            338
						catch(NoSuchFieldError nosuchfielderror26) { }
					//  237  522:astore_0        
						try
						{
							b[MapsDataState.WifiColorLegend.ordinal()] = 7;
						}
					//* 238  523:goto            350
						catch(NoSuchFieldError nosuchfielderror27) { }
					//  239  526:astore_0        
						try
						{
							b[MapsDataState.PlaybackProgress.ordinal()] = 8;
						}
					//* 240  527:goto            362
						catch(NoSuchFieldError nosuchfielderror28) { }
					//  241  530:astore_0        
						try
						{
							b[MapsDataState.MissionMapZoomState.ordinal()] = 9;
						}
					//* 242  531:goto            374
						catch(NoSuchFieldError nosuchfielderror29) { }
					//  243  534:astore_0        
						a = new int[MissionMapType.values().length];
						try
						{
							a[MissionMapType.CleanMission.ordinal()] = 1;
						}
					//* 244  535:goto            386
						catch(NoSuchFieldError nosuchfielderror30) { }
					//  245  538:astore_0        
						try
						{
							a[MissionMapType.WifiHeat.ordinal()] = 2;
						}
					//* 246  539:goto            406
						catch(NoSuchFieldError nosuchfielderror31) { }
					//  247  542:astore_0        
					//* 248  543:return          
					}
				}

				switch(com.irobot.home._cls4.b[mapsdatastate.ordinal()])
		//*  38   82:getstatic       #78  <Field int[] com.irobot.home.MissionDetailsActivity$4.b>
		//*  39   85:aload_3         
		//*  40   86:invokevirtual   #82  <Method int MapsDataState.ordinal()>
		//*  41   89:iaload          
				{
		//*  42   90:tableswitch     1 9: default 140
		//		               1 276
		//		               2 241
		//		               3 227
		//		               4 213
		//		               5 199
		//		               6 185
		//		               7 171
		//		               8 157
		//		               9 143
		//*  43  140:goto            63
				case 9: // '\t'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getMissionMapZoomState());
		//   44  143:aload_0         
		//   45  144:getfield        #12  <Field MissionDetailsActivity a>
		//   46  147:aload_1         
		//   47  148:invokevirtual   #85  <Method boolean MapsUIServiceData.getMissionMapZoomState()>
		//   48  151:invokestatic    #88  <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, boolean)>
					break;

		//*  49  154:goto            63
				case 8: // '\b'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getPlaybackProgress());
		//   50  157:aload_0         
		//   51  158:getfield        #12  <Field MissionDetailsActivity a>
		//   52  161:aload_1         
		//   53  162:invokevirtual   #92  <Method float MapsUIServiceData.getPlaybackProgress()>
		//   54  165:invokestatic    #95  <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, float)>
					break;

		//*  55  168:goto            63
				case 7: // '\007'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getWifiColorLegend());
		//   56  171:aload_0         
		//   57  172:getfield        #12  <Field MissionDetailsActivity a>
		//   58  175:aload_1         
		//   59  176:invokevirtual   #98  <Method ArrayList MapsUIServiceData.getWifiColorLegend()>
		//   60  179:invokestatic    #101 <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, ArrayList)>
					break;

		//*  61  182:goto            63
				case 6: // '\006'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getWifiBadRegions());
		//   62  185:aload_0         
		//   63  186:getfield        #12  <Field MissionDetailsActivity a>
		//   64  189:aload_1         
		//   65  190:invokevirtual   #104 <Method int MapsUIServiceData.getWifiBadRegions()>
		//   66  193:invokestatic    #107 <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, int)>
					break;

		//*  67  196:goto            63
				case 5: // '\005'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getMissionHistoryDetails());
		//   68  199:aload_0         
		//   69  200:getfield        #12  <Field MissionDetailsActivity a>
		//   70  203:aload_1         
		//   71  204:invokevirtual   #111 <Method RobotMissionHistoryItem MapsUIServiceData.getMissionHistoryDetails()>
		//   72  207:invokestatic    #114 <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, RobotMissionHistoryItem)>
					break;

		//*  73  210:goto            63
				case 4: // '\004'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getMissionRuntimeChart());
		//   74  213:aload_0         
		//   75  214:getfield        #12  <Field MissionDetailsActivity a>
		//   76  217:aload_1         
		//   77  218:invokevirtual   #118 <Method MissionRuntimeEChartEvent MapsUIServiceData.getMissionRuntimeChart()>
		//   78  221:invokestatic    #121 <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, MissionRuntimeEChartEvent)>
					break;

		//*  79  224:goto            63
				case 3: // '\003'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getMissionErrorMessage());
		//   80  227:aload_0         
		//   81  228:getfield        #12  <Field MissionDetailsActivity a>
		//   82  231:aload_1         
		//   83  232:invokevirtual   #124 <Method String MapsUIServiceData.getMissionErrorMessage()>
		//   84  235:invokestatic    #127 <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, String)>
					break;

		//*  85  238:goto            63
				case 2: // '\002'
					if(mapsuiservicedata.getIsMapCustomizationEnabled())
		//*  86  241:aload_1         
		//*  87  242:invokevirtual   #130 <Method boolean MapsUIServiceData.getIsMapCustomizationEnabled()>
		//*  88  245:ifeq            266
						com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getPersistentMapName(), mapsuiservicedata.getPersistentMapId());
		//   89  248:aload_0         
		//   90  249:getfield        #12  <Field MissionDetailsActivity a>
		//   91  252:aload_1         
		//   92  253:invokevirtual   #133 <Method String MapsUIServiceData.getPersistentMapName()>
		//   93  256:aload_1         
		//   94  257:invokevirtual   #137 <Method PersistentMapIdentifier MapsUIServiceData.getPersistentMapId()>
		//   95  260:invokestatic    #140 <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, String, PersistentMapIdentifier)>
					else
		//*  96  263:goto            63
						com.irobot.home.MissionDetailsActivity.b(a);
		//   97  266:aload_0         
		//   98  267:getfield        #12  <Field MissionDetailsActivity a>
		//   99  270:invokestatic    #142 <Method void com.irobot.home.MissionDetailsActivity.b(MissionDetailsActivity)>
					break;

		//* 100  273:goto            63
				case 1: // '\001'
					com.irobot.home.MissionDetailsActivity.a(a, mapsuiservicedata.getMissionDetailsViewState());
		//  101  276:aload_0         
		//  102  277:getfield        #12  <Field MissionDetailsActivity a>
		//  103  280:aload_1         
		//  104  281:invokevirtual   #146 <Method MissionDetailsViewState MapsUIServiceData.getMissionDetailsViewState()>
		//  105  284:invokestatic    #149 <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, MissionDetailsViewState)>
					break;
				}
			} while(true);
		//* 106  287:goto            63
		//  107  290:return          
		}

		final MissionDetailsActivity a;

		private a()
		{
			a = MissionDetailsActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MissionDetailsActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void MapsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public MissionDetailsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void BasePushNotificationActivity()>
		d = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #137 <Field int d>
		P = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #139 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #140 <Method void ArrayList()>
	//    9   17:putfield        #142 <Field ArrayList P>
		ai = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #144 <Field int ai>
		aj = new ArrayList();
	//   13   25:aload_0         
	//   14   26:new             #139 <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #140 <Method void ArrayList()>
	//   17   33:putfield        #146 <Field ArrayList aj>
		am = new android.support.v4.view.ViewPager.e() {

			public void a(int i1)
			{
			//    0    0:return          
			}

			public void a(int i1, float f1, int j1)
			{
			//    0    0:return          
			}

			public void b(int i1)
			{
				MissionMapType missionmaptype = (MissionMapType)com.irobot.home.MissionDetailsActivity.a(a).getMissionMapTypes().get(i1);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field MissionDetailsActivity a>
			//    2    4:invokestatic    #24  <Method MapsUIService com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity)>
			//    3    7:invokevirtual   #30  <Method ArrayList MapsUIService.getMissionMapTypes()>
			//    4   10:iload_1         
			//    5   11:invokevirtual   #36  <Method Object ArrayList.get(int)>
			//    6   14:checkcast       #38  <Class MissionMapType>
			//    7   17:astore_2        
				Object obj = ((Object) (MapsUIServiceData.create()));
			//    8   18:invokestatic    #44  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    9   21:astore_3        
				((MapsUIServiceData) (obj)).setMissionMapType(missionmaptype);
			//   10   22:aload_3         
			//   11   23:aload_2         
			//   12   24:invokevirtual   #48  <Method void MapsUIServiceData.setMissionMapType(MissionMapType)>
				com.irobot.home.MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SetCurrentMapType, ((MapsUIServiceData) (obj)));
			//   13   27:aload_0         
			//   14   28:getfield        #14  <Field MissionDetailsActivity a>
			//   15   31:invokestatic    #24  <Method MapsUIService com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity)>
			//   16   34:getstatic       #54  <Field MapsUIServiceCommand MapsUIServiceCommand.SetCurrentMapType>
			//   17   37:aload_3         
			//   18   38:invokevirtual   #58  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				obj = ((Object) (a.N));
			//   19   41:aload_0         
			//   20   42:getfield        #14  <Field MissionDetailsActivity a>
			//   21   45:getfield        #62  <Field FloatingActionButton MissionDetailsActivity.N>
			//   22   48:astore_3        
				if(com.irobot.home.MissionDetailsActivity.a(a).isMapAtDefaultZoom(missionmaptype))
			//*  23   49:aload_0         
			//*  24   50:getfield        #14  <Field MissionDetailsActivity a>
			//*  25   53:invokestatic    #24  <Method MapsUIService com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity)>
			//*  26   56:aload_2         
			//*  27   57:invokevirtual   #66  <Method boolean MapsUIService.isMapAtDefaultZoom(MissionMapType)>
			//*  28   60:ifeq            68
					i1 = 4;
			//   29   63:iconst_4        
			//   30   64:istore_1        
				else
			//*  31   65:goto            70
					i1 = 0;
			//   32   68:iconst_0        
			//   33   69:istore_1        
				((FloatingActionButton) (obj)).setVisibility(i1);
			//   34   70:aload_3         
			//   35   71:iload_1         
			//   36   72:invokevirtual   #71  <Method void FloatingActionButton.setVisibility(int)>
				switch(com.irobot.home._cls4.a[missionmaptype.ordinal()])
			//*  37   75:getstatic       #76  <Field int[] com.irobot.home.MissionDetailsActivity$4.a>
			//*  38   78:aload_2         
			//*  39   79:invokevirtual   #80  <Method int MissionMapType.ordinal()>
			//*  40   82:iaload          
				{
			//*  41   83:tableswitch     1 2: default 104
			//			               1 129
			//			               2 105
				default:
					return;
			//   42  104:return          

				case 2: // '\002'
					a.f.setVisibility(8);
			//   43  105:aload_0         
			//   44  106:getfield        #14  <Field MissionDetailsActivity a>
			//   45  109:getfield        #84  <Field NestedScrollView MissionDetailsActivity.f>
			//   46  112:bipush          8
			//   47  114:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
					a.g.setVisibility(0);
			//   48  117:aload_0         
			//   49  118:getfield        #14  <Field MissionDetailsActivity a>
			//   50  121:getfield        #90  <Field NestedScrollView MissionDetailsActivity.g>
			//   51  124:iconst_0        
			//   52  125:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
					return;
			//   53  128:return          

				case 1: // '\001'
					a.f.setVisibility(0);
			//   54  129:aload_0         
			//   55  130:getfield        #14  <Field MissionDetailsActivity a>
			//   56  133:getfield        #84  <Field NestedScrollView MissionDetailsActivity.f>
			//   57  136:iconst_0        
			//   58  137:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
					a.g.setVisibility(8);
			//   59  140:aload_0         
			//   60  141:getfield        #14  <Field MissionDetailsActivity a>
			//   61  144:getfield        #90  <Field NestedScrollView MissionDetailsActivity.g>
			//   62  147:bipush          8
			//   63  149:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
					return;
			//   64  152:return          
				}
			}

			final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   18   36:aload_0         
	//   19   37:new             #8   <Class MissionDetailsActivity$1>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #149 <Method void MissionDetailsActivity$1(MissionDetailsActivity)>
	//   23   45:putfield        #151 <Field android.support.v4.view.ViewPager$e am>
		an = new a();
	//   24   48:aload_0         
	//   25   49:new             #32  <Class MissionDetailsActivity$a>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:invokespecial   #154 <Method void MissionDetailsActivity$a(MissionDetailsActivity, MissionDetailsActivity$1)>
	//   30   58:putfield        #156 <Field MissionDetailsActivity$a an>
		ao = ((SettingsUIServiceDataCallback) (new SettingsUIServiceDataCallback() {

			public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
			{
				if(settingsuiservicedata != null && !a.isFinishing())
			//*   0    0:aload_1         
			//*   1    1:ifnull          94
			//*   2    4:aload_0         
			//*   3    5:getfield        #12  <Field MissionDetailsActivity a>
			//*   4    8:invokevirtual   #22  <Method boolean MissionDetailsActivity.isFinishing()>
			//*   5   11:ifne            94
				{
					if(a.isDestroyed())
			//*   6   14:aload_0         
			//*   7   15:getfield        #12  <Field MissionDetailsActivity a>
			//*   8   18:invokevirtual   #25  <Method boolean MissionDetailsActivity.isDestroyed()>
			//*   9   21:ifeq            25
						return;
			//   10   24:return          
					Iterator iterator = ((Set) (settingsuiservicedata.getSettingsChangeList())).iterator();
			//   11   25:aload_1         
			//   12   26:invokevirtual   #31  <Method java.util.HashSet SettingsUIServiceData.getSettingsChangeList()>
			//   13   29:invokeinterface #37  <Method Iterator Set.iterator()>
			//   14   34:astore_2        
					do
					{
						if(!iterator.hasNext())
							break;
			//   15   35:aload_2         
			//   16   36:invokeinterface #42  <Method boolean Iterator.hasNext()>
			//   17   41:ifeq            94
						SettingType settingtype = (SettingType)iterator.next();
			//   18   44:aload_2         
			//   19   45:invokeinterface #46  <Method Object Iterator.next()>
			//   20   50:checkcast       #48  <Class SettingType>
			//   21   53:astore_3        
						if(_cls4.c[settingtype.ordinal()] == 1)
			//*  22   54:getstatic       #54  <Field int[] MissionDetailsActivity$4.c>
			//*  23   57:aload_3         
			//*  24   58:invokevirtual   #58  <Method int SettingType.ordinal()>
			//*  25   61:iaload          
			//*  26   62:iconst_1        
			//*  27   63:icmpeq          69
			//*  28   66:goto            35
						{
							com.irobot.home.MissionDetailsActivity.b(a, settingsuiservicedata.getStringSetting(SettingType.Name));
			//   29   69:aload_0         
			//   30   70:getfield        #12  <Field MissionDetailsActivity a>
			//   31   73:aload_1         
			//   32   74:getstatic       #62  <Field SettingType SettingType.Name>
			//   33   77:invokevirtual   #66  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
			//   34   80:invokestatic    #70  <Method String com.irobot.home.MissionDetailsActivity.b(MissionDetailsActivity, String)>
			//   35   83:pop             
							MissionDetailsActivity.c(a);
			//   36   84:aload_0         
			//   37   85:getfield        #12  <Field MissionDetailsActivity a>
			//   38   88:invokestatic    #72  <Method void MissionDetailsActivity.c(MissionDetailsActivity)>
						}
					} while(true);
			//   39   91:goto            35
				}
			//   40   94:return          
			}

			final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   31   61:aload_0         
	//   32   62:new             #22  <Class MissionDetailsActivity$5>
	//   33   65:dup             
	//   34   66:aload_0         
	//   35   67:invokespecial   #157 <Method void MissionDetailsActivity$5(MissionDetailsActivity)>
	//   36   70:putfield        #159 <Field SettingsUIServiceDataCallback ao>
	//   37   73:return          
	}

	private void A()
	{
		if(Z == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field RobotMissionHistoryItem Z>
	//*   2    4:ifnonnull       16
		{
			com.irobot.home.util.o.e(Q, "Can't configure an error message because 'mRobotMissionHistoryItem' is null");
	//    3    7:getstatic       #163 <Field String Q>
	//    4   10:ldc1            #165 <String "Can't configure an error message because 'mRobotMissionHistoryItem' is null">
	//    5   12:invokestatic    #170 <Method void o.e(String, String)>
			return;
	//    6   15:return          
		}
		boolean flag;
		if(d != -1)
	//*   7   16:aload_0         
	//*   8   17:getfield        #137 <Field int d>
	//*   9   20:iconst_m1       
	//*  10   21:icmpeq          29
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_2        
		else
	//*  13   26:goto            31
			flag = false;
	//   14   29:iconst_0        
	//   15   30:istore_2        
		boolean flag1;
		if(Z.getErrorCode() > 0)
	//*  16   31:aload_0         
	//*  17   32:getfield        #161 <Field RobotMissionHistoryItem Z>
	//*  18   35:invokevirtual   #176 <Method short RobotMissionHistoryItem.getErrorCode()>
	//*  19   38:ifle            46
			flag1 = true;
	//   20   41:iconst_1        
	//   21   42:istore_3        
		else
	//*  22   43:goto            48
			flag1 = false;
	//   23   46:iconst_0        
	//   24   47:istore_3        
		boolean flag2;
		if(Z.getDockErrorStateForMission() > 0)
	//*  25   48:aload_0         
	//*  26   49:getfield        #161 <Field RobotMissionHistoryItem Z>
	//*  27   52:invokevirtual   #180 <Method int RobotMissionHistoryItem.getDockErrorStateForMission()>
	//*  28   55:ifle            64
			flag2 = true;
	//   29   58:iconst_1        
	//   30   59:istore          4
		else
	//*  31   61:goto            67
			flag2 = false;
	//   32   64:iconst_0        
	//   33   65:istore          4
		int i1;
		if(flag)
	//*  34   67:iload_2         
	//*  35   68:ifeq            79
			i1 = d;
	//   36   71:aload_0         
	//   37   72:getfield        #137 <Field int d>
	//   38   75:istore_1        
		else
	//*  39   76:goto            102
		if(flag1)
	//*  40   79:iload_3         
	//*  41   80:ifeq            94
			i1 = ((int) (Z.getErrorCode()));
	//   42   83:aload_0         
	//   43   84:getfield        #161 <Field RobotMissionHistoryItem Z>
	//   44   87:invokevirtual   #176 <Method short RobotMissionHistoryItem.getErrorCode()>
	//   45   90:istore_1        
		else
	//*  46   91:goto            102
			i1 = Z.getDockErrorStateForMission();
	//   47   94:aload_0         
	//   48   95:getfield        #161 <Field RobotMissionHistoryItem Z>
	//   49   98:invokevirtual   #180 <Method int RobotMissionHistoryItem.getDockErrorStateForMission()>
	//   50  101:istore_1        
		T = com.irobot.home.model.r.get(i1);
	//   51  102:aload_0         
	//   52  103:iload_1         
	//   53  104:invokestatic    #186 <Method r r.get(int)>
	//   54  107:putfield        #188 <Field r T>
		if(T != null && T != r.NO_ERROR)
	//*  55  110:aload_0         
	//*  56  111:getfield        #188 <Field r T>
	//*  57  114:ifnull          352
	//*  58  117:aload_0         
	//*  59  118:getfield        #188 <Field r T>
	//*  60  121:getstatic       #191 <Field r r.NO_ERROR>
	//*  61  124:if_acmpne       130
	//*  62  127:goto            352
		{
			boolean flag3 = com.irobot.home.util.j.i(Y);
	//   63  130:aload_0         
	//   64  131:getfield        #193 <Field String Y>
	//   65  134:invokestatic    #198 <Method boolean j.i(String)>
	//   66  137:istore          5
			Object obj1 = null;
	//   67  139:aconst_null     
	//   68  140:astore          7
			Object obj;
			if(flag3 && (flag || flag1))
	//*  69  142:iload           5
	//*  70  144:ifeq            298
	//*  71  147:iload_2         
	//*  72  148:ifne            155
	//*  73  151:iload_3         
	//*  74  152:ifeq            298
			{
				obj = ((Object) (com.irobot.home.model.u.a(T, al.getSku())));
	//   75  155:aload_0         
	//   76  156:getfield        #188 <Field r T>
	//   77  159:aload_0         
	//   78  160:getfield        #200 <Field AssetInfo al>
	//   79  163:invokevirtual   #206 <Method String AssetInfo.getSku()>
	//   80  166:invokestatic    #211 <Method q u.a(r, String)>
	//   81  169:astore          6
				if(obj == null)
	//*  82  171:aload           6
	//*  83  173:ifnonnull       222
				{
					obj = ((Object) (Q));
	//   84  176:getstatic       #163 <Field String Q>
	//   85  179:astore          6
					obj1 = ((Object) (new StringBuilder()));
	//   86  181:new             #213 <Class StringBuilder>
	//   87  184:dup             
	//   88  185:invokespecial   #214 <Method void StringBuilder()>
	//   89  188:astore          7
					((StringBuilder) (obj1)).append("No RobotError defined for RobotErrorCode: ");
	//   90  190:aload           7
	//   91  192:ldc1            #216 <String "No RobotError defined for RobotErrorCode: ">
	//   92  194:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   93  197:pop             
					((StringBuilder) (obj1)).append(T.getErrorCode());
	//   94  198:aload           7
	//   95  200:aload_0         
	//   96  201:getfield        #188 <Field r T>
	//   97  204:invokevirtual   #222 <Method int r.getErrorCode()>
	//   98  207:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//   99  210:pop             
					com.irobot.home.util.o.e(((String) (obj)), ((StringBuilder) (obj1)).toString());
	//  100  211:aload           6
	//  101  213:aload           7
	//  102  215:invokevirtual   #228 <Method String StringBuilder.toString()>
	//  103  218:invokestatic    #170 <Method void o.e(String, String)>
					return;
	//  104  221:return          
				}
				i1 = ((q) (obj)).b();
	//  105  222:aload           6
	//  106  224:invokevirtual   #232 <Method int q.b()>
	//  107  227:istore_1        
				if(i1 == -1)
	//* 108  228:iload_1         
	//* 109  229:iconst_m1       
	//* 110  230:icmpne          277
				{
					obj1 = ((Object) (Q));
	//  111  233:getstatic       #163 <Field String Q>
	//  112  236:astore          7
					StringBuilder stringbuilder1 = new StringBuilder();
	//  113  238:new             #213 <Class StringBuilder>
	//  114  241:dup             
	//  115  242:invokespecial   #214 <Method void StringBuilder()>
	//  116  245:astore          8
					stringbuilder1.append("No string resource ID defined for RobotError: ");
	//  117  247:aload           8
	//  118  249:ldc1            #234 <String "No string resource ID defined for RobotError: ">
	//  119  251:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  120  254:pop             
					stringbuilder1.append(((q) (obj)).a());
	//  121  255:aload           8
	//  122  257:aload           6
	//  123  259:invokevirtual   #236 <Method String q.a()>
	//  124  262:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  125  265:pop             
					com.irobot.home.util.o.e(((String) (obj1)), stringbuilder1.toString());
	//  126  266:aload           7
	//  127  268:aload           8
	//  128  270:invokevirtual   #228 <Method String StringBuilder.toString()>
	//  129  273:invokestatic    #170 <Method void o.e(String, String)>
					return;
	//  130  276:return          
				}
				obj = ((Object) (getString(i1, new Object[] {
					Y
				})));
	//  131  277:aload_0         
	//  132  278:iload_1         
	//  133  279:iconst_1        
	//  134  280:anewarray       Object[]
	//  135  283:dup             
	//  136  284:iconst_0        
	//  137  285:aload_0         
	//  138  286:getfield        #193 <Field String Y>
	//  139  289:aastore         
	//  140  290:invokevirtual   #242 <Method String getString(int, Object[])>
	//  141  293:astore          6
			} else
	//* 142  295:goto            340
			{
				obj = obj1;
	//  143  298:aload           7
	//  144  300:astore          6
				if(flag2)
	//* 145  302:iload           4
	//* 146  304:ifeq            340
				{
					String s2 = Z.getDockReplacementErrorStringId();
	//  147  307:aload_0         
	//  148  308:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  149  311:invokevirtual   #245 <Method String RobotMissionHistoryItem.getDockReplacementErrorStringId()>
	//  150  314:astore          8
					obj = obj1;
	//  151  316:aload           7
	//  152  318:astore          6
					if(s2.length() > 0)
	//* 153  320:aload           8
	//* 154  322:invokevirtual   #250 <Method int String.length()>
	//* 155  325:ifle            340
						obj = ((Object) (com.irobot.home.util.j.a(getBaseContext(), s2, ((ArrayList) (null)))));
	//  156  328:aload_0         
	//  157  329:invokevirtual   #254 <Method Context getBaseContext()>
	//  158  332:aload           8
	//  159  334:aconst_null     
	//  160  335:invokestatic    #257 <Method String j.a(Context, String, ArrayList)>
	//  161  338:astore          6
				}
			}
			if(obj != null)
	//* 162  340:aload           6
	//* 163  342:ifnull          351
				a(((String) (obj)));
	//  164  345:aload_0         
	//  165  346:aload           6
	//  166  348:invokevirtual   #260 <Method void a(String)>
			return;
	//  167  351:return          
		} else
		{
			String s1 = Q;
	//  168  352:getstatic       #163 <Field String Q>
	//  169  355:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//  170  357:new             #213 <Class StringBuilder>
	//  171  360:dup             
	//  172  361:invokespecial   #214 <Method void StringBuilder()>
	//  173  364:astore          7
			stringbuilder.append("No RobotErrorCode defined for error/pause ID: ");
	//  174  366:aload           7
	//  175  368:ldc2            #262 <String "No RobotErrorCode defined for error/pause ID: ">
	//  176  371:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  177  374:pop             
			stringbuilder.append(i1);
	//  178  375:aload           7
	//  179  377:iload_1         
	//  180  378:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//  181  381:pop             
			com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//  182  382:aload           6
	//  183  384:aload           7
	//  184  386:invokevirtual   #228 <Method String StringBuilder.toString()>
	//  185  389:invokestatic    #170 <Method void o.e(String, String)>
			return;
	//  186  392:return          
		}
	}

	private int a(RobotPadCategory robotpadcategory)
	{
		if(!robotpadcategory.equals(((Object) (RobotPadCategory.ReusableDry))) && !robotpadcategory.equals(((Object) (RobotPadCategory.Dry))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #269 <Field RobotPadCategory RobotPadCategory.ReusableDry>
	//*   2    4:invokevirtual   #273 <Method boolean RobotPadCategory.equals(Object)>
	//*   3    7:ifne            54
	//*   4   10:aload_1         
	//*   5   11:getstatic       #276 <Field RobotPadCategory RobotPadCategory.Dry>
	//*   6   14:invokevirtual   #273 <Method boolean RobotPadCategory.equals(Object)>
	//*   7   17:ifeq            23
	//*   8   20:goto            54
			return !robotpadcategory.equals(((Object) (RobotPadCategory.Wet))) && !robotpadcategory.equals(((Object) (RobotPadCategory.ReusableWet))) ? 0x7f0f01b5 : 0x7f0f096c;
	//    9   23:aload_1         
	//   10   24:getstatic       #279 <Field RobotPadCategory RobotPadCategory.Wet>
	//   11   27:invokevirtual   #273 <Method boolean RobotPadCategory.equals(Object)>
	//   12   30:ifne            50
	//   13   33:aload_1         
	//   14   34:getstatic       #282 <Field RobotPadCategory RobotPadCategory.ReusableWet>
	//   15   37:invokevirtual   #273 <Method boolean RobotPadCategory.equals(Object)>
	//   16   40:ifeq            46
	//   17   43:goto            50
	//   18   46:ldc2            #283 <Int 0x7f0f01b5>
	//   19   49:ireturn         
	//   20   50:ldc2            #284 <Int 0x7f0f096c>
	//   21   53:ireturn         
		else
			return 0x7f0f0290;
	//   22   54:ldc2            #285 <Int 0x7f0f0290>
	//   23   57:ireturn         
	}

	private BottomSheetBehavior a(NestedScrollView nestedscrollview, ImageView imageview, android.support.design.widget.BottomSheetBehavior.a a1)
	{
		nestedscrollview = ((NestedScrollView) (BottomSheetBehavior.b(((View) (nestedscrollview)))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #291 <Method BottomSheetBehavior BottomSheetBehavior.b(View)>
	//    2    4:astore_1        
		((BottomSheetBehavior) (nestedscrollview)).a((int)TypedValue.applyDimension(1, 50F, getResources().getDisplayMetrics()));
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:ldc2            #292 <Float 50F>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #296 <Method Resources getResources()>
	//    8   14:invokevirtual   #302 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    9   17:invokestatic    #308 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   10   20:f2i             
	//   11   21:invokevirtual   #311 <Method void BottomSheetBehavior.a(int)>
		((BottomSheetBehavior) (nestedscrollview)).b(4);
	//   12   24:aload_1         
	//   13   25:iconst_4        
	//   14   26:invokevirtual   #313 <Method void BottomSheetBehavior.b(int)>
		((BottomSheetBehavior) (nestedscrollview)).a(a1);
	//   15   29:aload_1         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #316 <Method void BottomSheetBehavior.a(android.support.design.widget.BottomSheetBehavior$a)>
		return ((BottomSheetBehavior) (nestedscrollview));
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	static MapsUIService a(MissionDetailsActivity missiondetailsactivity)
	{
		return missiondetailsactivity.R;
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field MapsUIService R>
	//    2    4:areturn         
	}

	private RobotErrorHelpContent a(r r1, String s1)
	{
		r1 = ((r) (com.irobot.home.model.u.a(r1, s1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #211 <Method q u.a(r, String)>
	//    3    5:astore_1        
		if(r1 != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          19
			return c(((q) (r1)).a());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #236 <Method String q.a()>
	//    9   15:invokespecial   #323 <Method RobotErrorHelpContent c(String)>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	private void a(float f1)
	{
		int i1 = (int)(f1 * (float)K.getMax());
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #326 <Field AppCompatSeekBar K>
	//    3    5:invokevirtual   #331 <Method int AppCompatSeekBar.getMax()>
	//    4    8:i2f             
	//    5    9:fmul            
	//    6   10:f2i             
	//    7   11:istore_2        
		K.setProgress(i1);
	//    8   12:aload_0         
	//    9   13:getfield        #326 <Field AppCompatSeekBar K>
	//   10   16:iload_2         
	//   11   17:invokevirtual   #334 <Method void AppCompatSeekBar.setProgress(int)>
	//   12   20:return          
	}

	private void a(int i1)
	{
		ai = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #144 <Field int ai>
		j();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #336 <Method void j()>
	//    5    9:return          
	}

	private void a(BottomSheetBehavior bottomsheetbehavior)
	{
		if(bottomsheetbehavior.a() == 4)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #339 <Method int BottomSheetBehavior.a()>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          14
		{
			bottomsheetbehavior.b(3);
	//    4    8:aload_1         
	//    5    9:iconst_3        
	//    6   10:invokevirtual   #313 <Method void BottomSheetBehavior.b(int)>
			return;
	//    7   13:return          
		} else
		{
			bottomsheetbehavior.b(4);
	//    8   14:aload_1         
	//    9   15:iconst_4        
	//   10   16:invokevirtual   #313 <Method void BottomSheetBehavior.b(int)>
			return;
	//   11   19:return          
		}
	}

	private void a(MissionDetailsViewState missiondetailsviewstate)
	{
label0:
		{
label1:
			{
				Object obj = ((Object) (getSupportFragmentManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #344 <Method FragmentManager getSupportFragmentManager()>
	//    2    4:astore_3        
				Object obj1 = ((Object) (((FragmentManager) (obj)).beginTransaction()));
	//    3    5:aload_3         
	//    4    6:invokevirtual   #350 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    5    9:astore          4
				ak = true;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #352 <Field boolean ak>
				switch(_cls4.d[missiondetailsviewstate.ordinal()])
	//*   9   16:getstatic       #355 <Field int[] MissionDetailsActivity$4.d>
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #360 <Method int MissionDetailsViewState.ordinal()>
	//*  12   23:iaload          
				{
	//*  13   24:tableswitch     1 7: default 68
	//	               1 670
	//	               2 602
	//	               3 566
	//	               4 566
	//	               5 519
	//	               6 76
	//	               7 71
				default:
					break label0;
	//   14   68:goto            683

				case 1: // '\001'
					break label1;

				case 7: // '\007'
					com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//   15   71:aload_0         
	//   16   72:invokestatic    #363 <Method void j.a(android.app.Activity)>
					return;
	//   17   75:return          

				case 6: // '\006'
					if("prod".equalsIgnoreCase("beta"))
	//*  18   76:ldc2            #365 <String "prod">
	//*  19   79:ldc2            #367 <String "beta">
	//*  20   82:invokevirtual   #370 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   85:ifeq            96
						G.setVisibility(0);
	//   22   88:aload_0         
	//   23   89:getfield        #372 <Field CustomButton G>
	//   24   92:iconst_0        
	//   25   93:invokevirtual   #377 <Method void CustomButton.setVisibility(int)>
					e.setVisibility(8);
	//   26   96:aload_0         
	//   27   97:getfield        #379 <Field ProgressBar e>
	//   28  100:bipush          8
	//   29  102:invokevirtual   #382 <Method void ProgressBar.setVisibility(int)>
					ak = true;
	//   30  105:aload_0         
	//   31  106:iconst_1        
	//   32  107:putfield        #352 <Field boolean ak>
					if(P.size() > 0)
	//*  33  110:aload_0         
	//*  34  111:getfield        #142 <Field ArrayList P>
	//*  35  114:invokevirtual   #385 <Method int ArrayList.size()>
	//*  36  117:ifle            173
					{
						missiondetailsviewstate = ((MissionDetailsViewState) (P.iterator()));
	//   37  120:aload_0         
	//   38  121:getfield        #142 <Field ArrayList P>
	//   39  124:invokevirtual   #389 <Method Iterator ArrayList.iterator()>
	//   40  127:astore_1        
						boolean flag;
						for(flag = true; ((Iterator) (missiondetailsviewstate)).hasNext(); flag &= ((Fragment)((Iterator) (missiondetailsviewstate)).next()).isAdded());
	//   41  128:iconst_1        
	//   42  129:istore_2        
	//   43  130:aload_1         
	//   44  131:invokeinterface #395 <Method boolean Iterator.hasNext()>
	//   45  136:ifeq            157
	//   46  139:iload_2         
	//   47  140:aload_1         
	//   48  141:invokeinterface #399 <Method Object Iterator.next()>
	//   49  146:checkcast       #401 <Class Fragment>
	//   50  149:invokevirtual   #404 <Method boolean Fragment.isAdded()>
	//   51  152:iand            
	//   52  153:istore_2        
	//*  53  154:goto            130
						if(flag)
	//*  54  157:iload_2         
	//*  55  158:ifeq            166
						{
							o();
	//   56  161:aload_0         
	//   57  162:invokevirtual   #406 <Method void o()>
							return;
	//   58  165:return          
						}
						P.clear();
	//   59  166:aload_0         
	//   60  167:getfield        #142 <Field ArrayList P>
	//   61  170:invokevirtual   #409 <Method void ArrayList.clear()>
					}
					MissionMapType missionmaptype;
					for(missiondetailsviewstate = ((MissionDetailsViewState) (R.getMissionMapTypes().iterator())); ((Iterator) (missiondetailsviewstate)).hasNext(); P.add(((Object) (com.irobot.home.fragments.ak.a(R.getMissionMapRenderer(missionmaptype), true, true, ((c.a) (this)))))))
	//*  62  173:aload_0         
	//*  63  174:getfield        #319 <Field MapsUIService R>
	//*  64  177:invokevirtual   #415 <Method ArrayList MapsUIService.getMissionMapTypes()>
	//*  65  180:invokevirtual   #389 <Method Iterator ArrayList.iterator()>
	//*  66  183:astore_1        
	//*  67  184:aload_1         
	//*  68  185:invokeinterface #395 <Method boolean Iterator.hasNext()>
	//*  69  190:ifeq            230
						missionmaptype = (MissionMapType)((Iterator) (missiondetailsviewstate)).next();
	//   70  193:aload_1         
	//   71  194:invokeinterface #399 <Method Object Iterator.next()>
	//   72  199:checkcast       #417 <Class MissionMapType>
	//   73  202:astore          5

	//   74  204:aload_0         
	//   75  205:getfield        #142 <Field ArrayList P>
	//   76  208:aload_0         
	//   77  209:getfield        #319 <Field MapsUIService R>
	//   78  212:aload           5
	//   79  214:invokevirtual   #421 <Method com.irobot.core.RenderPresenter MapsUIService.getMissionMapRenderer(MissionMapType)>
	//   80  217:iconst_1        
	//   81  218:iconst_1        
	//   82  219:aload_0         
	//   83  220:invokestatic    #426 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   84  223:invokevirtual   #429 <Method boolean ArrayList.add(Object)>
	//   85  226:pop             
	//*  86  227:goto            184
					if(P.isEmpty())
	//*  87  230:aload_0         
	//*  88  231:getfield        #142 <Field ArrayList P>
	//*  89  234:invokevirtual   #432 <Method boolean ArrayList.isEmpty()>
	//*  90  237:ifeq            250
					{
						com.irobot.home.util.o.e(Q, "Map fragments are empty");
	//   91  240:getstatic       #163 <Field String Q>
	//   92  243:ldc2            #434 <String "Map fragments are empty">
	//   93  246:invokestatic    #170 <Method void o.e(String, String)>
						return;
	//   94  249:return          
					}
					missiondetailsviewstate = ((MissionDetailsViewState) (MapsUIServiceData.create()));
	//   95  250:invokestatic    #440 <Method MapsUIServiceData MapsUIServiceData.create()>
	//   96  253:astore_1        
					((MapsUIServiceData) (missiondetailsviewstate)).setMissionMapType((MissionMapType)R.getMissionMapTypes().get(0));
	//   97  254:aload_1         
	//   98  255:aload_0         
	//   99  256:getfield        #319 <Field MapsUIService R>
	//  100  259:invokevirtual   #415 <Method ArrayList MapsUIService.getMissionMapTypes()>
	//  101  262:iconst_0        
	//  102  263:invokevirtual   #443 <Method Object ArrayList.get(int)>
	//  103  266:checkcast       #417 <Class MissionMapType>
	//  104  269:invokevirtual   #447 <Method void MapsUIServiceData.setMissionMapType(MissionMapType)>
					R.sendCommand(MapsUIServiceCommand.SetCurrentMapType, ((MapsUIServiceData) (missiondetailsviewstate)));
	//  105  272:aload_0         
	//  106  273:getfield        #319 <Field MapsUIService R>
	//  107  276:getstatic       #453 <Field MapsUIServiceCommand MapsUIServiceCommand.SetCurrentMapType>
	//  108  279:aload_1         
	//  109  280:invokevirtual   #457 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
					if(P.size() == 1)
	//* 110  283:aload_0         
	//* 111  284:getfield        #142 <Field ArrayList P>
	//* 112  287:invokevirtual   #385 <Method int ArrayList.size()>
	//* 113  290:iconst_1        
	//* 114  291:icmpne          330
					{
						((FragmentTransaction) (obj1)).add(0x7f09026d, (Fragment)P.get(0));
	//  115  294:aload           4
	//  116  296:ldc2            #458 <Int 0x7f09026d>
	//  117  299:aload_0         
	//  118  300:getfield        #142 <Field ArrayList P>
	//  119  303:iconst_0        
	//  120  304:invokevirtual   #443 <Method Object ArrayList.get(int)>
	//  121  307:checkcast       #401 <Class Fragment>
	//  122  310:invokevirtual   #463 <Method FragmentTransaction FragmentTransaction.add(int, Fragment)>
	//  123  313:pop             
						((FragmentTransaction) (obj1)).commit();
	//  124  314:aload           4
	//  125  316:invokevirtual   #466 <Method int FragmentTransaction.commit()>
	//  126  319:pop             
						((FragmentManager) (obj)).executePendingTransactions();
	//  127  320:aload_3         
	//  128  321:invokevirtual   #469 <Method boolean FragmentManager.executePendingTransactions()>
	//  129  324:pop             
						o();
	//  130  325:aload_0         
	//  131  326:invokevirtual   #406 <Method void o()>
						return;
	//  132  329:return          
					}
					obj1 = ((Object) (LayoutInflater.from(((Context) (this))).inflate(0x7f0b015d, ((ViewGroup) (null)))));
	//  133  330:aload_0         
	//  134  331:invokestatic    #475 <Method LayoutInflater LayoutInflater.from(Context)>
	//  135  334:ldc2            #476 <Int 0x7f0b015d>
	//  136  337:aconst_null     
	//  137  338:invokevirtual   #480 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  138  341:astore          4
					ab = (ViewPager)((View) (obj1)).findViewById(0x7f090489);
	//  139  343:aload_0         
	//  140  344:aload           4
	//  141  346:ldc2            #481 <Int 0x7f090489>
	//  142  349:invokevirtual   #487 <Method View View.findViewById(int)>
	//  143  352:checkcast       #489 <Class ViewPager>
	//  144  355:putfield        #491 <Field ViewPager ab>
					missiondetailsviewstate = ((MissionDetailsViewState) ((CustomTabLayout)((View) (obj1)).findViewById(0x7f090423)));
	//  145  358:aload           4
	//  146  360:ldc2            #492 <Int 0x7f090423>
	//  147  363:invokevirtual   #487 <Method View View.findViewById(int)>
	//  148  366:checkcast       #494 <Class CustomTabLayout>
	//  149  369:astore_1        
					((ViewGroup)findViewById(0x7f09026d)).addView(((View) (obj1)), 0, new android.view.ViewGroup.LayoutParams(-1, -1));
	//  150  370:aload_0         
	//  151  371:ldc2            #458 <Int 0x7f09026d>
	//  152  374:invokevirtual   #495 <Method View findViewById(int)>
	//  153  377:checkcast       #497 <Class ViewGroup>
	//  154  380:aload           4
	//  155  382:iconst_0        
	//  156  383:new             #499 <Class android.view.ViewGroup$LayoutParams>
	//  157  386:dup             
	//  158  387:iconst_m1       
	//  159  388:iconst_m1       
	//  160  389:invokespecial   #502 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  161  392:invokevirtual   #506 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
					ac = new t(((FragmentManager) (obj)), ((List) (P)), ((Context) (this)));
	//  162  395:aload_0         
	//  163  396:new             #508 <Class t>
	//  164  399:dup             
	//  165  400:aload_3         
	//  166  401:aload_0         
	//  167  402:getfield        #142 <Field ArrayList P>
	//  168  405:aload_0         
	//  169  406:invokespecial   #511 <Method void t(FragmentManager, List, Context)>
	//  170  409:putfield        #513 <Field t ac>
					ab.setAdapter(((android.support.v4.view.p) (ac)));
	//  171  412:aload_0         
	//  172  413:getfield        #491 <Field ViewPager ab>
	//  173  416:aload_0         
	//  174  417:getfield        #513 <Field t ac>
	//  175  420:invokevirtual   #517 <Method void ViewPager.setAdapter(android.support.v4.view.p)>
					ab.a(am);
	//  176  423:aload_0         
	//  177  424:getfield        #491 <Field ViewPager ab>
	//  178  427:aload_0         
	//  179  428:getfield        #151 <Field android.support.v4.view.ViewPager$e am>
	//  180  431:invokevirtual   #520 <Method void ViewPager.a(android.support.v4.view.ViewPager$e)>
					ab.setCurrentItem(0);
	//  181  434:aload_0         
	//  182  435:getfield        #491 <Field ViewPager ab>
	//  183  438:iconst_0        
	//  184  439:invokevirtual   #523 <Method void ViewPager.setCurrentItem(int)>
					((CustomTabLayout) (missiondetailsviewstate)).setupWithViewPager(ab);
	//  185  442:aload_1         
	//  186  443:aload_0         
	//  187  444:getfield        #491 <Field ViewPager ab>
	//  188  447:invokevirtual   #527 <Method void CustomTabLayout.setupWithViewPager(ViewPager)>
					obj = ((Object) (Typeface.createFromAsset(((Context)this).getAssets(), "HarmoniaSansPro-Bold.otf")));
	//  189  450:aload_0         
	//  190  451:invokevirtual   #533 <Method android.content.res.AssetManager Context.getAssets()>
	//  191  454:ldc2            #535 <String "HarmoniaSansPro-Bold.otf">
	//  192  457:invokestatic    #541 <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//  193  460:astore_3        
					for(int i1 = 0; i1 < ((CustomTabLayout) (missiondetailsviewstate)).getTabCount(); i1++)
	//* 194  461:iconst_0        
	//* 195  462:istore_2        
	//* 196  463:iload_2         
	//* 197  464:aload_1         
	//* 198  465:invokevirtual   #544 <Method int CustomTabLayout.getTabCount()>
	//* 199  468:icmpge          511
					{
						obj1 = ((Object) ((TextView)LayoutInflater.from(((Context) (this))).inflate(0x7f0b008d, ((ViewGroup) (null)))));
	//  200  471:aload_0         
	//  201  472:invokestatic    #475 <Method LayoutInflater LayoutInflater.from(Context)>
	//  202  475:ldc2            #545 <Int 0x7f0b008d>
	//  203  478:aconst_null     
	//  204  479:invokevirtual   #480 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  205  482:checkcast       #547 <Class TextView>
	//  206  485:astore          4
						((TextView) (obj1)).setTypeface(((Typeface) (obj)));
	//  207  487:aload           4
	//  208  489:aload_3         
	//  209  490:invokevirtual   #551 <Method void TextView.setTypeface(Typeface)>
						((CustomTabLayout) (missiondetailsviewstate)).a(i1).a(((View) (obj1)));
	//  210  493:aload_1         
	//  211  494:iload_2         
	//  212  495:invokevirtual   #554 <Method android.support.design.widget.TabLayout$e CustomTabLayout.a(int)>
	//  213  498:aload           4
	//  214  500:invokevirtual   #559 <Method android.support.design.widget.TabLayout$e android.support.design.widget.TabLayout$e.a(View)>
	//  215  503:pop             
					}

	//  216  504:iload_2         
	//  217  505:iconst_1        
	//  218  506:iadd            
	//  219  507:istore_2        
	//* 220  508:goto            463
					((CustomTabLayout) (missiondetailsviewstate)).setVisibility(0);
	//  221  511:aload_1         
	//  222  512:iconst_0        
	//  223  513:invokevirtual   #560 <Method void CustomTabLayout.setVisibility(int)>
					break label0;
	//  224  516:goto            683

				case 5: // '\005'
					e.setVisibility(8);
	//  225  519:aload_0         
	//  226  520:getfield        #379 <Field ProgressBar e>
	//  227  523:bipush          8
	//  228  525:invokevirtual   #382 <Method void ProgressBar.setVisibility(int)>
					((FragmentTransaction) (obj1)).add(0x7f09026d, ((Fragment) (GoToMapPrivacyFragment_.b().a())));
	//  229  528:aload           4
	//  230  530:ldc2            #458 <Int 0x7f09026d>
	//  231  533:invokestatic    #565 <Method com.irobot.home.fragments.GoToMapPrivacyFragment_$a GoToMapPrivacyFragment_.b()>
	//  232  536:invokevirtual   #570 <Method com.irobot.home.fragments.ab com.irobot.home.fragments.GoToMapPrivacyFragment_$a.a()>
	//  233  539:invokevirtual   #463 <Method FragmentTransaction FragmentTransaction.add(int, Fragment)>
	//  234  542:pop             
					((FragmentTransaction) (obj1)).commit();
	//  235  543:aload           4
	//  236  545:invokevirtual   #466 <Method int FragmentTransaction.commit()>
	//  237  548:pop             
					((FragmentManager) (obj)).executePendingTransactions();
	//  238  549:aload_3         
	//  239  550:invokevirtual   #469 <Method boolean FragmentManager.executePendingTransactions()>
	//  240  553:pop             
					a(true);
	//  241  554:aload_0         
	//  242  555:iconst_1        
	//  243  556:invokespecial   #573 <Method void a(boolean)>
					o();
	//  244  559:aload_0         
	//  245  560:invokevirtual   #406 <Method void o()>
					break label0;
	//  246  563:goto            683

				case 3: // '\003'
				case 4: // '\004'
					e.setVisibility(8);
	//  247  566:aload_0         
	//  248  567:getfield        #379 <Field ProgressBar e>
	//  249  570:bipush          8
	//  250  572:invokevirtual   #382 <Method void ProgressBar.setVisibility(int)>
					missiondetailsviewstate = ((MissionDetailsViewState) (at.c().a(b).a(missiondetailsviewstate.equals(((Object) (MissionDetailsViewState.MapsWithFwUpdate)))).a()));
	//  251  575:invokestatic    #578 <Method com.irobot.home.fragments.at$a at.c()>
	//  252  578:aload_0         
	//  253  579:getfield        #580 <Field String b>
	//  254  582:invokevirtual   #585 <Method com.irobot.home.fragments.at$a com.irobot.home.fragments.at$a.a(String)>
	//  255  585:aload_1         
	//  256  586:getstatic       #589 <Field MissionDetailsViewState MissionDetailsViewState.MapsWithFwUpdate>
	//  257  589:invokevirtual   #590 <Method boolean MissionDetailsViewState.equals(Object)>
	//  258  592:invokevirtual   #593 <Method com.irobot.home.fragments.at$a com.irobot.home.fragments.at$a.a(boolean)>
	//  259  595:invokevirtual   #596 <Method com.irobot.home.fragments.as com.irobot.home.fragments.at$a.a()>
	//  260  598:astore_1        
					break;
	//  261  599:goto            646

				case 2: // '\002'
					com.irobot.home.util.o.b(Q, "static maps are not supported");
	//  262  602:getstatic       #163 <Field String Q>
	//  263  605:ldc2            #598 <String "static maps are not supported">
	//  264  608:invokestatic    #600 <Method void o.b(String, String)>
					ak = false;
	//  265  611:aload_0         
	//  266  612:iconst_0        
	//  267  613:putfield        #352 <Field boolean ak>
					e.setVisibility(8);
	//  268  616:aload_0         
	//  269  617:getfield        #379 <Field ProgressBar e>
	//  270  620:bipush          8
	//  271  622:invokevirtual   #382 <Method void ProgressBar.setVisibility(int)>
					missiondetailsviewstate = ((MissionDetailsViewState) (com.irobot.home.fragments.an.d().a(b).a(c).a()));
	//  272  625:invokestatic    #605 <Method com.irobot.home.fragments.an$a an.d()>
	//  273  628:aload_0         
	//  274  629:getfield        #580 <Field String b>
	//  275  632:invokevirtual   #610 <Method com.irobot.home.fragments.an$a com.irobot.home.fragments.an$a.a(String)>
	//  276  635:aload_0         
	//  277  636:getfield        #612 <Field int c>
	//  278  639:invokevirtual   #615 <Method com.irobot.home.fragments.an$a com.irobot.home.fragments.an$a.a(int)>
	//  279  642:invokevirtual   #618 <Method com.irobot.home.fragments.am com.irobot.home.fragments.an$a.a()>
	//  280  645:astore_1        
					break;
				}
				((FragmentTransaction) (obj1)).add(0x7f09026d, ((Fragment) (missiondetailsviewstate)));
	//  281  646:aload           4
	//  282  648:ldc2            #458 <Int 0x7f09026d>
	//  283  651:aload_1         
	//  284  652:invokevirtual   #463 <Method FragmentTransaction FragmentTransaction.add(int, Fragment)>
	//  285  655:pop             
				((FragmentTransaction) (obj1)).commit();
	//  286  656:aload           4
	//  287  658:invokevirtual   #466 <Method int FragmentTransaction.commit()>
	//  288  661:pop             
				((FragmentManager) (obj)).executePendingTransactions();
	//  289  662:aload_3         
	//  290  663:invokevirtual   #469 <Method boolean FragmentManager.executePendingTransactions()>
	//  291  666:pop             
				break label0;
	//  292  667:goto            683
			}
			e.setVisibility(0);
	//  293  670:aload_0         
	//  294  671:getfield        #379 <Field ProgressBar e>
	//  295  674:iconst_0        
	//  296  675:invokevirtual   #382 <Method void ProgressBar.setVisibility(int)>
			ak = false;
	//  297  678:aload_0         
	//  298  679:iconst_0        
	//  299  680:putfield        #352 <Field boolean ak>
		}
		o();
	//  300  683:aload_0         
	//  301  684:invokevirtual   #406 <Method void o()>
	//  302  687:return          
	}

	private void a(MissionRuntimeEChartEvent missionruntimeechartevent)
	{
		missionruntimeechartevent = ((MissionRuntimeEChartEvent) (missionruntimeechartevent.chartData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #624 <Method String MissionRuntimeEChartEvent.chartData()>
	//    2    4:astore_1        
		V = ((String) (missionruntimeechartevent));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #626 <Field String V>
		if(!com.irobot.home.util.j.i(((String) (missionruntimeechartevent))))
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #198 <Method boolean j.i(String)>
	//*   8   14:ifne            27
		{
			com.irobot.home.util.o.e(Q, "onMissionRuntimeEChartEvent: Chart data is invalid!");
	//    9   17:getstatic       #163 <Field String Q>
	//   10   20:ldc2            #628 <String "onMissionRuntimeEChartEvent: Chart data is invalid!">
	//   11   23:invokestatic    #170 <Method void o.e(String, String)>
			return;
	//   12   26:return          
		} else
		{
			F.getSettings().setJavaScriptEnabled(true);
	//   13   27:aload_0         
	//   14   28:getfield        #630 <Field WebViewLanguageCompat F>
	//   15   31:invokevirtual   #636 <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   16   34:iconst_1        
	//   17   35:invokevirtual   #641 <Method void WebSettings.setJavaScriptEnabled(boolean)>
			F.setOnTouchListener(new android.view.View.OnTouchListener() {

				public boolean onTouch(View view, MotionEvent motionevent)
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

				final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   18   38:aload_0         
	//   19   39:getfield        #630 <Field WebViewLanguageCompat F>
	//   20   42:new             #12  <Class MissionDetailsActivity$11>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:invokespecial   #642 <Method void MissionDetailsActivity$11(MissionDetailsActivity)>
	//   24   50:invokevirtual   #646 <Method void WebViewLanguageCompat.setOnTouchListener(android.view.View$OnTouchListener)>
			F.setWebViewClient(((WebViewClient) (new WebViewClient() {

				public void onPageFinished(WebView webview, String s1)
				{
					webview = ((WebView) (a.F));
				//    0    0:aload_0         
				//    1    1:getfield        #14  <Field MissionDetailsActivity a>
				//    2    4:getfield        #24  <Field WebViewLanguageCompat MissionDetailsActivity.F>
				//    3    7:astore_1        
					s1 = ((String) (new StringBuilder()));
				//    4    8:new             #26  <Class StringBuilder>
				//    5   11:dup             
				//    6   12:invokespecial   #27  <Method void StringBuilder()>
				//    7   15:astore_2        
					((StringBuilder) (s1)).append("javascript:loadChart(");
				//    8   16:aload_2         
				//    9   17:ldc1            #29  <String "javascript:loadChart(">
				//   10   19:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
				//   11   22:pop             
					((StringBuilder) (s1)).append(MissionDetailsActivity.d(a));
				//   12   23:aload_2         
				//   13   24:aload_0         
				//   14   25:getfield        #14  <Field MissionDetailsActivity a>
				//   15   28:invokestatic    #37  <Method String MissionDetailsActivity.d(MissionDetailsActivity)>
				//   16   31:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
				//   17   34:pop             
					((StringBuilder) (s1)).append(")");
				//   18   35:aload_2         
				//   19   36:ldc1            #39  <String ")">
				//   20   38:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
				//   21   41:pop             
					((WebViewLanguageCompat) (webview)).loadUrl(((StringBuilder) (s1)).toString());
				//   22   42:aload_1         
				//   23   43:aload_2         
				//   24   44:invokevirtual   #43  <Method String StringBuilder.toString()>
				//   25   47:invokevirtual   #49  <Method void WebViewLanguageCompat.loadUrl(String)>
				//   26   50:return          
				}

				final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void WebViewClient()>
			//    5    9:return          
			}
			}
)));
	//   25   53:aload_0         
	//   26   54:getfield        #630 <Field WebViewLanguageCompat F>
	//   27   57:new             #14  <Class MissionDetailsActivity$12>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:invokespecial   #647 <Method void MissionDetailsActivity$12(MissionDetailsActivity)>
	//   31   65:invokevirtual   #651 <Method void WebViewLanguageCompat.setWebViewClient(WebViewClient)>
			F.loadUrl("file:///android_asset/www/charts/chart_container.html");
	//   32   68:aload_0         
	//   33   69:getfield        #630 <Field WebViewLanguageCompat F>
	//   34   72:ldc2            #653 <String "file:///android_asset/www/charts/chart_container.html">
	//   35   75:invokevirtual   #656 <Method void WebViewLanguageCompat.loadUrl(String)>
			return;
	//   36   78:return          
		}
	}

	private void a(RobotMissionHistoryItem robotmissionhistoryitem)
	{
		int i1;
		int j1;
		boolean flag1;
		boolean flag2;
		int k1;
		boolean flag3;
		Object obj;
		Resources resources;
		if(robotmissionhistoryitem.getMissionId() != c)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #660 <Method int RobotMissionHistoryItem.getMissionId()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #612 <Field int c>
	//*   4    8:icmpeq          16
		{
			x();
	//    5   11:aload_0         
	//    6   12:invokespecial   #662 <Method void x()>
			return;
	//    7   15:return          
		}
		Z = robotmissionhistoryitem;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #161 <Field RobotMissionHistoryItem Z>
		resources = getResources();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #296 <Method Resources getResources()>
	//   13   25:astore          12
		obj = ((Object) (getBaseContext()));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #254 <Method Context getBaseContext()>
	//   16   31:astore          9
		java.util.Date date = RobotMissionHistoryItemUtil.makeStartDateForItem(robotmissionhistoryitem);
	//   17   33:aload_1         
	//   18   34:invokestatic    #668 <Method java.util.Date RobotMissionHistoryItemUtil.makeStartDateForItem(RobotMissionHistoryItem)>
	//   19   37:astore          10
		aa = com.irobot.home.util.j.a(((Context) (obj)), (new SimpleDateFormat("EEEE hh:mma MMMM d, yyyy")).format(date));
	//   20   39:aload_0         
	//   21   40:aload           9
	//   22   42:new             #670 <Class SimpleDateFormat>
	//   23   45:dup             
	//   24   46:ldc2            #672 <String "EEEE hh:mma MMMM d, yyyy">
	//   25   49:invokespecial   #674 <Method void SimpleDateFormat(String)>
	//   26   52:aload           10
	//   27   54:invokevirtual   #678 <Method String SimpleDateFormat.format(java.util.Date)>
	//   28   57:invokestatic    #681 <Method String j.a(Context, String)>
	//   29   60:putfield        #683 <Field String aa>
		if(com.irobot.home.util.j.i(aa))
	//*  30   63:aload_0         
	//*  31   64:getfield        #683 <Field String aa>
	//*  32   67:invokestatic    #198 <Method boolean j.i(String)>
	//*  33   70:ifeq            81
			e(aa);
	//   34   73:aload_0         
	//   35   74:aload_0         
	//   36   75:getfield        #683 <Field String aa>
	//   37   78:invokevirtual   #685 <Method void e(String)>
		flag3 = robotmissionhistoryitem.getDidEvacuateForMission();
	//   38   81:aload_1         
	//   39   82:invokevirtual   #688 <Method boolean RobotMissionHistoryItem.getDidEvacuateForMission()>
	//   40   85:istore          7
		i1 = robotmissionhistoryitem.getDockErrorStateForMission();
	//   41   87:aload_1         
	//   42   88:invokevirtual   #180 <Method int RobotMissionHistoryItem.getDockErrorStateForMission()>
	//   43   91:istore_2        
		robotmissionhistoryitem.getDockReplacementErrorStringId();
	//   44   92:aload_1         
	//   45   93:invokevirtual   #245 <Method String RobotMissionHistoryItem.getDockReplacementErrorStringId()>
	//   46   96:pop             
		boolean flag4 = AssetCapabilityUtils.isCloudCapable(al);
	//   47   97:aload_0         
	//   48   98:getfield        #200 <Field AssetInfo al>
	//   49  101:invokestatic    #694 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//   50  104:istore          8
		flag2 = true;
	//   51  106:iconst_1        
	//   52  107:istore          5
		if(flag4 && AssetCapabilityUtils.isMoppingRobot(al))
	//*  53  109:iload           8
	//*  54  111:ifeq            130
	//*  55  114:aload_0         
	//*  56  115:getfield        #200 <Field AssetInfo al>
	//*  57  118:invokestatic    #697 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  58  121:ifeq            130
			flag1 = true;
	//   59  124:iconst_1        
	//   60  125:istore          4
		else
	//*  61  127:goto            133
			flag1 = false;
	//   62  130:iconst_0        
	//   63  131:istore          4
		k1 = _cls4.e[Z.getCompletionStatus().ordinal()];
	//   64  133:getstatic       #699 <Field int[] MissionDetailsActivity$4.e>
	//   65  136:aload_0         
	//   66  137:getfield        #161 <Field RobotMissionHistoryItem Z>
	//   67  140:invokevirtual   #703 <Method RobotMissionHistoryCompletionStatus RobotMissionHistoryItem.getCompletionStatus()>
	//   68  143:invokevirtual   #706 <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//   69  146:iaload          
	//   70  147:istore          6
		j1 = 0x7f08015c;
	//   71  149:ldc2            #707 <Int 0x7f08015c>
	//   72  152:istore_3        
		k1;
	//   73  153:iload           6
		JVM INSTR tableswitch 1 10: default 208
	//	               1 353
	//	               2 296
	//	               3 285
	//	               4 264
	//	               5 264
	//	               6 264
	//	               7 264
	//	               8 264
	//	               9 264
	//	               10 264;
	//   74  155:tableswitch     1 10: default 208
	//	               1 353
	//	               2 296
	//	               3 285
	//	               4 264
	//	               5 264
	//	               6 264
	//	               7 264
	//	               8 264
	//	               9 264
	//	               10 264
		   goto _L1 _L2 _L3 _L4 _L5 _L5 _L5 _L5 _L5 _L5 _L5
_L1:
		obj = ((Object) (Q));
	//   75  208:getstatic       #163 <Field String Q>
	//   76  211:astore          9
		StringBuilder stringbuilder = new StringBuilder();
	//   77  213:new             #213 <Class StringBuilder>
	//   78  216:dup             
	//   79  217:invokespecial   #214 <Method void StringBuilder()>
	//   80  220:astore          10
		stringbuilder.append("Unsupported completion status: ");
	//   81  222:aload           10
	//   82  224:ldc2            #709 <String "Unsupported completion status: ">
	//   83  227:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   84  230:pop             
		stringbuilder.append(String.valueOf(((Object) (Z.getCompletionStatus()))));
	//   85  231:aload           10
	//   86  233:aload_0         
	//   87  234:getfield        #161 <Field RobotMissionHistoryItem Z>
	//   88  237:invokevirtual   #703 <Method RobotMissionHistoryCompletionStatus RobotMissionHistoryItem.getCompletionStatus()>
	//   89  240:invokestatic    #713 <Method String String.valueOf(Object)>
	//   90  243:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   91  246:pop             
		com.irobot.home.util.o.e(((String) (obj)), stringbuilder.toString());
	//   92  247:aload           9
	//   93  249:aload           10
	//   94  251:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   95  254:invokestatic    #170 <Method void o.e(String, String)>
		i1 = 0;
	//   96  257:iconst_0        
	//   97  258:istore_2        
		j1 = 0;
	//   98  259:iconst_0        
	//   99  260:istore_3        
		  goto _L6
	//* 100  261:goto            426
_L5:
		j.setText(((CharSequence) (com.irobot.home.util.j.a(((Context) (obj)), Z))));
	//  101  264:aload_0         
	//  102  265:getfield        #715 <Field CustomTextView j>
	//  103  268:aload           9
	//  104  270:aload_0         
	//  105  271:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  106  274:invokestatic    #718 <Method String j.a(Context, RobotMissionHistoryItem)>
	//  107  277:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
		i1 = 0;
	//  108  280:iconst_0        
	//  109  281:istore_2        
		break; /* Loop/switch isn't completed */
	//  110  282:goto            289
_L4:
		i1 = 0x7f0f03aa;
	//  111  285:ldc2            #725 <Int 0x7f0f03aa>
	//  112  288:istore_2        
_L11:
		j1 = 0x7f08015d;
	//  113  289:ldc2            #726 <Int 0x7f08015d>
	//  114  292:istore_3        
		break; /* Loop/switch isn't completed */
	//  115  293:goto            426
_L3:
		if(!Z.getCommandType().equalsIgnoreCase("train")) goto _L8; else goto _L7
	//  116  296:aload_0         
	//  117  297:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  118  300:invokevirtual   #729 <Method String RobotMissionHistoryItem.getCommandType()>
	//  119  303:ldc2            #731 <String "train">
	//  120  306:invokevirtual   #370 <Method boolean String.equalsIgnoreCase(String)>
	//  121  309:ifeq            323
_L7:
		i1 = 0x7f0f08ee;
	//  122  312:ldc2            #732 <Int 0x7f0f08ee>
	//  123  315:istore_2        
_L10:
		j1 = 0x7f080097;
	//  124  316:ldc2            #733 <Int 0x7f080097>
	//  125  319:istore_3        
		break; /* Loop/switch isn't completed */
	//  126  320:goto            426
_L8:
		if(flag3)
			break; /* Loop/switch isn't completed */
	//  127  323:iload           7
	//  128  325:ifne            335
		i1 = 0x7f0f01af;
	//  129  328:ldc2            #734 <Int 0x7f0f01af>
	//  130  331:istore_2        
		if(true) goto _L10; else goto _L9
	//  131  332:goto            316
_L9:
		if(i1 == 0)
	//* 132  335:iload_2         
	//* 133  336:ifne            346
		{
			i1 = 0x7f0f00ab;
	//  134  339:ldc2            #735 <Int 0x7f0f00ab>
	//  135  342:istore_2        
			break; /* Loop/switch isn't completed */
	//  136  343:goto            426
		}
		i1 = 0x7f0f00ac;
	//  137  346:ldc2            #736 <Int 0x7f0f00ac>
	//  138  349:istore_2        
		continue; /* Loop/switch isn't completed */
	//  139  350:goto            289
_L2:
		if(Z.getCommandType().equalsIgnoreCase("train"))
	//* 140  353:aload_0         
	//* 141  354:getfield        #161 <Field RobotMissionHistoryItem Z>
	//* 142  357:invokevirtual   #729 <Method String RobotMissionHistoryItem.getCommandType()>
	//* 143  360:ldc2            #731 <String "train">
	//* 144  363:invokevirtual   #370 <Method boolean String.equalsIgnoreCase(String)>
	//* 145  366:ifeq            376
		{
			i1 = 0x7f0f08ef;
	//  146  369:ldc2            #737 <Int 0x7f0f08ef>
	//  147  372:istore_2        
			break; /* Loop/switch isn't completed */
	//  148  373:goto            426
		}
		if(flag1)
	//* 149  376:iload           4
	//* 150  378:ifeq            396
		{
			i1 = a(Z.getPadCategoryUsed());
	//  151  381:aload_0         
	//  152  382:aload_0         
	//  153  383:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  154  386:invokevirtual   #741 <Method RobotPadCategory RobotMissionHistoryItem.getPadCategoryUsed()>
	//  155  389:invokespecial   #743 <Method int a(RobotPadCategory)>
	//  156  392:istore_2        
			break; /* Loop/switch isn't completed */
	//  157  393:goto            426
		}
		if(!flag3)
	//* 158  396:iload           7
	//* 159  398:ifne            408
		{
			i1 = 0x7f0f01b5;
	//  160  401:ldc2            #283 <Int 0x7f0f01b5>
	//  161  404:istore_2        
			break; /* Loop/switch isn't completed */
	//  162  405:goto            426
		}
		if(i1 == 0)
	//* 163  408:iload_2         
	//* 164  409:ifne            419
		{
			i1 = 0x7f0f00ad;
	//  165  412:ldc2            #744 <Int 0x7f0f00ad>
	//  166  415:istore_2        
			break; /* Loop/switch isn't completed */
	//  167  416:goto            426
		}
		i1 = 0x7f0f00b5;
	//  168  419:ldc2            #745 <Int 0x7f0f00b5>
	//  169  422:istore_2        
		if(true) goto _L11; else goto _L6
	//  170  423:goto            289
_L6:
label0:
		{
			if(j1 != 0)
	//* 171  426:iload_3         
	//* 172  427:ifeq            443
				i.setImageDrawable(resources.getDrawable(j1));
	//  173  430:aload_0         
	//  174  431:getfield        #747 <Field ImageView i>
	//  175  434:aload           12
	//  176  436:iload_3         
	//  177  437:invokevirtual   #751 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//  178  440:invokevirtual   #757 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			if(i1 != 0)
	//* 179  443:iload_2         
	//* 180  444:ifeq            455
				j.setText(i1);
	//  181  447:aload_0         
	//  182  448:getfield        #715 <Field CustomTextView j>
	//  183  451:iload_2         
	//  184  452:invokevirtual   #759 <Method void CustomTextView.setText(int)>
			i1 = Z.getSquareFeetCovered();
	//  185  455:aload_0         
	//  186  456:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  187  459:invokevirtual   #762 <Method int RobotMissionHistoryItem.getSquareFeetCovered()>
	//  188  462:istore_2        
			Object obj1;
			Object obj2;
			Object aobj[];
			if(i.f)
	//* 189  463:getstatic       #766 <Field boolean i.f>
	//* 190  466:ifeq            585
			{
				i1 = (int)((float)i1 * 0.0929F);
	//  191  469:iload_2         
	//  192  470:i2f             
	//  193  471:ldc2            #767 <Float 0.0929F>
	//  194  474:fmul            
	//  195  475:f2i             
	//  196  476:istore_2        
				o.setText(((CharSequence) (Integer.toString(i1))));
	//  197  477:aload_0         
	//  198  478:getfield        #769 <Field TextView o>
	//  199  481:iload_2         
	//  200  482:invokestatic    #774 <Method String Integer.toString(int)>
	//  201  485:invokevirtual   #775 <Method void TextView.setText(CharSequence)>
				obj1 = ((Object) (o));
	//  202  488:aload_0         
	//  203  489:getfield        #769 <Field TextView o>
	//  204  492:astore          9
				obj2 = ((Object) (new StringBuilder()));
	//  205  494:new             #213 <Class StringBuilder>
	//  206  497:dup             
	//  207  498:invokespecial   #214 <Method void StringBuilder()>
	//  208  501:astore          10
				((StringBuilder) (obj2)).append(Integer.toString(i1));
	//  209  503:aload           10
	//  210  505:iload_2         
	//  211  506:invokestatic    #774 <Method String Integer.toString(int)>
	//  212  509:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  213  512:pop             
				((StringBuilder) (obj2)).append(getString(0x7f0f0864));
	//  214  513:aload           10
	//  215  515:aload_0         
	//  216  516:ldc2            #776 <Int 0x7f0f0864>
	//  217  519:invokevirtual   #778 <Method String getString(int)>
	//  218  522:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  219  525:pop             
				((TextView) (obj1)).setContentDescription(((CharSequence) (((StringBuilder) (obj2)).toString())));
	//  220  526:aload           9
	//  221  528:aload           10
	//  222  530:invokevirtual   #228 <Method String StringBuilder.toString()>
	//  223  533:invokevirtual   #781 <Method void TextView.setContentDescription(CharSequence)>
				obj1 = ((Object) (x));
	//  224  536:aload_0         
	//  225  537:getfield        #783 <Field CustomTextView x>
	//  226  540:astore          9
				obj2 = ((Object) (resources.getString(0x7f0f009e)));
	//  227  542:aload           12
	//  228  544:ldc2            #784 <Int 0x7f0f009e>
	//  229  547:invokevirtual   #785 <Method String Resources.getString(int)>
	//  230  550:astore          10
				aobj = new Object[1];
	//  231  552:iconst_1        
	//  232  553:anewarray       Object[]
	//  233  556:astore          11
				aobj[0] = ((Object) (resources.getString(0x7f0f0864)));
	//  234  558:aload           11
	//  235  560:iconst_0        
	//  236  561:aload           12
	//  237  563:ldc2            #776 <Int 0x7f0f0864>
	//  238  566:invokevirtual   #785 <Method String Resources.getString(int)>
	//  239  569:aastore         
			} else
	//* 240  570:aload           9
	//* 241  572:aload           10
	//* 242  574:aload           11
	//* 243  576:invokestatic    #788 <Method String String.format(String, Object[])>
	//* 244  579:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
	//* 245  582:goto            681
			{
				o.setText(((CharSequence) (Integer.toString(i1))));
	//  246  585:aload_0         
	//  247  586:getfield        #769 <Field TextView o>
	//  248  589:iload_2         
	//  249  590:invokestatic    #774 <Method String Integer.toString(int)>
	//  250  593:invokevirtual   #775 <Method void TextView.setText(CharSequence)>
				obj1 = ((Object) (o));
	//  251  596:aload_0         
	//  252  597:getfield        #769 <Field TextView o>
	//  253  600:astore          9
				obj2 = ((Object) (new StringBuilder()));
	//  254  602:new             #213 <Class StringBuilder>
	//  255  605:dup             
	//  256  606:invokespecial   #214 <Method void StringBuilder()>
	//  257  609:astore          10
				((StringBuilder) (obj2)).append(Integer.toString(i1));
	//  258  611:aload           10
	//  259  613:iload_2         
	//  260  614:invokestatic    #774 <Method String Integer.toString(int)>
	//  261  617:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  262  620:pop             
				((StringBuilder) (obj2)).append(getString(0x7f0f0863));
	//  263  621:aload           10
	//  264  623:aload_0         
	//  265  624:ldc2            #789 <Int 0x7f0f0863>
	//  266  627:invokevirtual   #778 <Method String getString(int)>
	//  267  630:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  268  633:pop             
				((TextView) (obj1)).setContentDescription(((CharSequence) (((StringBuilder) (obj2)).toString())));
	//  269  634:aload           9
	//  270  636:aload           10
	//  271  638:invokevirtual   #228 <Method String StringBuilder.toString()>
	//  272  641:invokevirtual   #781 <Method void TextView.setContentDescription(CharSequence)>
				obj1 = ((Object) (x));
	//  273  644:aload_0         
	//  274  645:getfield        #783 <Field CustomTextView x>
	//  275  648:astore          9
				obj2 = ((Object) (resources.getString(0x7f0f009e)));
	//  276  650:aload           12
	//  277  652:ldc2            #784 <Int 0x7f0f009e>
	//  278  655:invokevirtual   #785 <Method String Resources.getString(int)>
	//  279  658:astore          10
				aobj = new Object[1];
	//  280  660:iconst_1        
	//  281  661:anewarray       Object[]
	//  282  664:astore          11
				aobj[0] = ((Object) (resources.getString(0x7f0f0863)));
	//  283  666:aload           11
	//  284  668:iconst_0        
	//  285  669:aload           12
	//  286  671:ldc2            #789 <Int 0x7f0f0863>
	//  287  674:invokevirtual   #785 <Method String Resources.getString(int)>
	//  288  677:aastore         
			}
			((CustomTextView) (obj1)).setText(((CharSequence) (String.format(((String) (obj2)), aobj))));
	//* 289  678:goto            570
			if(flag1)
	//* 290  681:iload           4
	//* 291  683:ifeq            847
			{
				short word0 = Z.getNumberOfTanksUsed();
	//  292  686:aload_0         
	//  293  687:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  294  690:invokevirtual   #792 <Method short RobotMissionHistoryItem.getNumberOfTanksUsed()>
	//  295  693:istore_3        
				boolean flag = flag2;
	//  296  694:iload           5
	//  297  696:istore_2        
				if(robotmissionhistoryitem.getPadCategoryUsed() != RobotPadCategory.Dry)
	//* 298  697:aload_1         
	//* 299  698:invokevirtual   #741 <Method RobotPadCategory RobotMissionHistoryItem.getPadCategoryUsed()>
	//* 300  701:getstatic       #276 <Field RobotPadCategory RobotPadCategory.Dry>
	//* 301  704:if_acmpeq       762
				{
					flag = flag2;
	//  302  707:iload           5
	//  303  709:istore_2        
					if(robotmissionhistoryitem.getPadCategoryUsed() != RobotPadCategory.ReusableDry)
	//* 304  710:aload_1         
	//* 305  711:invokevirtual   #741 <Method RobotPadCategory RobotMissionHistoryItem.getPadCategoryUsed()>
	//* 306  714:getstatic       #269 <Field RobotPadCategory RobotPadCategory.ReusableDry>
	//* 307  717:if_acmpeq       762
					{
						flag = flag2;
	//  308  720:iload           5
	//  309  722:istore_2        
						if(robotmissionhistoryitem.getPadCategoryUsed() != RobotPadCategory.Invalid)
	//* 310  723:aload_1         
	//* 311  724:invokevirtual   #741 <Method RobotPadCategory RobotMissionHistoryItem.getPadCategoryUsed()>
	//* 312  727:getstatic       #795 <Field RobotPadCategory RobotPadCategory.Invalid>
	//* 313  730:if_acmpeq       762
						{
							flag = flag2;
	//  314  733:iload           5
	//  315  735:istore_2        
							if(!robotmissionhistoryitem.getCommandType().equals("train"))
	//* 316  736:aload_1         
	//* 317  737:invokevirtual   #729 <Method String RobotMissionHistoryItem.getCommandType()>
	//* 318  740:ldc2            #731 <String "train">
	//* 319  743:invokevirtual   #796 <Method boolean String.equals(Object)>
	//* 320  746:ifne            762
								if(word0 == -1)
	//* 321  749:iload_3         
	//* 322  750:iconst_m1       
	//* 323  751:icmpne          760
									flag = flag2;
	//  324  754:iload           5
	//  325  756:istore_2        
								else
	//* 326  757:goto            762
									flag = false;
	//  327  760:iconst_0        
	//  328  761:istore_2        
						}
					}
				}
				if(flag)
	//* 329  762:iload_2         
	//* 330  763:ifeq            778
				{
					n.setVisibility(8);
	//  331  766:aload_0         
	//  332  767:getfield        #798 <Field LinearLayout n>
	//  333  770:bipush          8
	//  334  772:invokevirtual   #801 <Method void LinearLayout.setVisibility(int)>
					break label0;
	//  335  775:goto            901
				}
				y.setText(0x7f0f08b0);
	//  336  778:aload_0         
	//  337  779:getfield        #803 <Field CustomTextView y>
	//  338  782:ldc2            #804 <Int 0x7f0f08b0>
	//  339  785:invokevirtual   #759 <Method void CustomTextView.setText(int)>
				t.setText(((CharSequence) (String.valueOf(((int) (word0))))));
	//  340  788:aload_0         
	//  341  789:getfield        #806 <Field TextView t>
	//  342  792:iload_3         
	//  343  793:invokestatic    #808 <Method String String.valueOf(int)>
	//  344  796:invokevirtual   #775 <Method void TextView.setText(CharSequence)>
				obj2 = ((Object) (t));
	//  345  799:aload_0         
	//  346  800:getfield        #806 <Field TextView t>
	//  347  803:astore          10
				obj1 = ((Object) (new StringBuilder()));
	//  348  805:new             #213 <Class StringBuilder>
	//  349  808:dup             
	//  350  809:invokespecial   #214 <Method void StringBuilder()>
	//  351  812:astore          9
				((StringBuilder) (obj1)).append(String.valueOf(((int) (word0))));
	//  352  814:aload           9
	//  353  816:iload_3         
	//  354  817:invokestatic    #808 <Method String String.valueOf(int)>
	//  355  820:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  356  823:pop             
				((StringBuilder) (obj1)).append(getString(0x7f0f08b0));
	//  357  824:aload           9
	//  358  826:aload_0         
	//  359  827:ldc2            #804 <Int 0x7f0f08b0>
	//  360  830:invokevirtual   #778 <Method String getString(int)>
	//  361  833:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  362  836:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  363  837:aload           9
	//  364  839:invokevirtual   #228 <Method String StringBuilder.toString()>
	//  365  842:astore          9
			} else
	//* 366  844:goto            894
			{
				flag = ((boolean) (Z.getNumberOfDirtDetects()));
	//  367  847:aload_0         
	//  368  848:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  369  851:invokevirtual   #811 <Method short RobotMissionHistoryItem.getNumberOfDirtDetects()>
	//  370  854:istore_2        
				t.setText(((CharSequence) (Integer.toString(((int) (flag))))));
	//  371  855:aload_0         
	//  372  856:getfield        #806 <Field TextView t>
	//  373  859:iload_2         
	//  374  860:invokestatic    #774 <Method String Integer.toString(int)>
	//  375  863:invokevirtual   #775 <Method void TextView.setText(CharSequence)>
				obj2 = ((Object) (t));
	//  376  866:aload_0         
	//  377  867:getfield        #806 <Field TextView t>
	//  378  870:astore          10
				obj1 = ((Object) (resources.getQuantityString(0x7f0d0009, ((int) (flag)), new Object[] {
					Integer.valueOf(((int) (flag)))
				})));
	//  379  872:aload           12
	//  380  874:ldc2            #812 <Int 0x7f0d0009>
	//  381  877:iload_2         
	//  382  878:iconst_1        
	//  383  879:anewarray       Object[]
	//  384  882:dup             
	//  385  883:iconst_0        
	//  386  884:iload_2         
	//  387  885:invokestatic    #815 <Method Integer Integer.valueOf(int)>
	//  388  888:aastore         
	//  389  889:invokevirtual   #819 <Method String Resources.getQuantityString(int, int, Object[])>
	//  390  892:astore          9
			}
			((TextView) (obj2)).setContentDescription(((CharSequence) (obj1)));
	//  391  894:aload           10
	//  392  896:aload           9
	//  393  898:invokevirtual   #781 <Method void TextView.setContentDescription(CharSequence)>
		}
		f(Z.getMinutesRunning() + Z.getMinutesCharging() + Z.getMinutesPaused());
	//  394  901:aload_0         
	//  395  902:aload_0         
	//  396  903:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  397  906:invokevirtual   #822 <Method int RobotMissionHistoryItem.getMinutesRunning()>
	//  398  909:aload_0         
	//  399  910:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  400  913:invokevirtual   #825 <Method int RobotMissionHistoryItem.getMinutesCharging()>
	//  401  916:iadd            
	//  402  917:aload_0         
	//  403  918:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  404  921:invokevirtual   #828 <Method int RobotMissionHistoryItem.getMinutesPaused()>
	//  405  924:iadd            
	//  406  925:invokespecial   #830 <Method void f(int)>
		if(robotmissionhistoryitem.getCommandType().equals("train"))
	//* 407  928:aload_1         
	//* 408  929:invokevirtual   #729 <Method String RobotMissionHistoryItem.getCommandType()>
	//* 409  932:ldc2            #731 <String "train">
	//* 410  935:invokevirtual   #796 <Method boolean String.equals(Object)>
	//* 411  938:ifeq            955
			w.setText(((CharSequence) (getString(0x7f0f08f3))));
	//  412  941:aload_0         
	//  413  942:getfield        #832 <Field CustomTextView w>
	//  414  945:aload_0         
	//  415  946:ldc2            #833 <Int 0x7f0f08f3>
	//  416  949:invokevirtual   #778 <Method String getString(int)>
	//  417  952:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
		flag = ((boolean) (Z.getMinutesRunning()));
	//  418  955:aload_0         
	//  419  956:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  420  959:invokevirtual   #822 <Method int RobotMissionHistoryItem.getMinutesRunning()>
	//  421  962:istore_2        
		B.setText(((CharSequence) (com.irobot.home.util.j.a(((int) (flag)), resources))));
	//  422  963:aload_0         
	//  423  964:getfield        #835 <Field CustomTextView B>
	//  424  967:iload_2         
	//  425  968:aload           12
	//  426  970:invokestatic    #838 <Method String j.a(int, Resources)>
	//  427  973:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
		flag = ((boolean) (Z.getMinutesCharging()));
	//  428  976:aload_0         
	//  429  977:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  430  980:invokevirtual   #825 <Method int RobotMissionHistoryItem.getMinutesCharging()>
	//  431  983:istore_2        
		C.setText(((CharSequence) (com.irobot.home.util.j.a(((int) (flag)), resources))));
	//  432  984:aload_0         
	//  433  985:getfield        #840 <Field CustomTextView C>
	//  434  988:iload_2         
	//  435  989:aload           12
	//  436  991:invokestatic    #838 <Method String j.a(int, Resources)>
	//  437  994:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
		flag = ((boolean) (Z.getMinutesPaused()));
	//  438  997:aload_0         
	//  439  998:getfield        #161 <Field RobotMissionHistoryItem Z>
	//  440 1001:invokevirtual   #828 <Method int RobotMissionHistoryItem.getMinutesPaused()>
	//  441 1004:istore_2        
		D.setText(((CharSequence) (com.irobot.home.util.j.a(((int) (flag)), resources))));
	//  442 1005:aload_0         
	//  443 1006:getfield        #842 <Field CustomTextView D>
	//  444 1009:iload_2         
	//  445 1010:aload           12
	//  446 1012:invokestatic    #838 <Method String j.a(int, Resources)>
	//  447 1015:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
		A();
	//  448 1018:aload_0         
	//  449 1019:invokespecial   #844 <Method void A()>
		return;
	//  450 1022:return          
	}

	private void a(SatisfactionRating satisfactionrating)
	{
		G.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #372 <Field CustomButton G>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #377 <Method void CustomButton.setVisibility(int)>
	//    4    9:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, float f1)
	{
		missiondetailsactivity.a(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #848 <Method void a(float)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, int i1)
	{
		missiondetailsactivity.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #850 <Method void a(int)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, MissionDetailsViewState missiondetailsviewstate)
	{
		missiondetailsactivity.a(missiondetailsviewstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #853 <Method void a(MissionDetailsViewState)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, MissionRuntimeEChartEvent missionruntimeechartevent)
	{
		missiondetailsactivity.a(missionruntimeechartevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #856 <Method void a(MissionRuntimeEChartEvent)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, RobotMissionHistoryItem robotmissionhistoryitem)
	{
		missiondetailsactivity.a(robotmissionhistoryitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #859 <Method void a(RobotMissionHistoryItem)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, SatisfactionRating satisfactionrating)
	{
		missiondetailsactivity.a(satisfactionrating);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #862 <Method void a(SatisfactionRating)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, String s1)
	{
		missiondetailsactivity.d(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #865 <Method void d(String)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, String s1, PersistentMapIdentifier persistentmapidentifier)
	{
		missiondetailsactivity.a(s1, persistentmapidentifier);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #869 <Method void a(String, PersistentMapIdentifier)>
	//    4    6:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, ArrayList arraylist)
	{
		missiondetailsactivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #873 <Method void a(ArrayList)>
	//    3    5:return          
	}

	static void a(MissionDetailsActivity missiondetailsactivity, boolean flag)
	{
		missiondetailsactivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #573 <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(String s1, PersistentMapIdentifier persistentmapidentifier)
	{
		L.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #876 <Field LinearLayout L>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #801 <Method void LinearLayout.setVisibility(int)>
		M.setText(((CharSequence) (s1)));
	//    4    8:aload_0         
	//    5    9:getfield        #878 <Field CustomTextView M>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
		L.setOnClickListener(new android.view.View.OnClickListener(persistentmapidentifier) {

			public void onClick(View view)
			{
				b.a.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field MissionDetailsActivity b>
			//    2    4:getfield        #29  <Field IRobotApplication com.irobot.home.MissionDetailsActivity.a>
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field PersistentMapIdentifier a>
			//    5   11:invokevirtual   #34  <Method void com.irobot.home.IRobotApplication.a(PersistentMapIdentifier)>
				com.irobot.home.MapCustomizationActivity_.a(((Context) (b))).a();
			//    6   14:aload_0         
			//    7   15:getfield        #18  <Field MissionDetailsActivity b>
			//    8   18:invokestatic    #39  <Method MapCustomizationActivity_$a com.irobot.home.MapCustomizationActivity_.a(Context)>
			//    9   21:invokevirtual   #44  <Method org.androidannotations.api.a.e com.irobot.home.MapCustomizationActivity_$a.a()>
			//   10   24:pop             
			//   11   25:return          
			}

			final PersistentMapIdentifier a;
			final MissionDetailsActivity b;

			
			{
				b = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MissionDetailsActivity b>
				a = persistentmapidentifier;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field PersistentMapIdentifier a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    8   16:aload_0         
	//    9   17:getfield        #876 <Field LinearLayout L>
	//   10   20:new             #10  <Class MissionDetailsActivity$10>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokespecial   #881 <Method void MissionDetailsActivity$10(MissionDetailsActivity, PersistentMapIdentifier)>
	//   15   29:invokevirtual   #885 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
	//   16   32:return          
	}

	private void a(ArrayList arraylist)
	{
		aj = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #146 <Field ArrayList aj>
	//    3    5:return          
	}

	private void a(boolean flag)
	{
		FloatingActionButton floatingactionbutton = N;
	//    0    0:aload_0         
	//    1    1:getfield        #889 <Field FloatingActionButton N>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 4;
	//    5    9:iconst_4        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			byte0 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		floatingactionbutton.setVisibility(((int) (byte0)));
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #892 <Method void FloatingActionButton.setVisibility(int)>
	//   13   21:return          
	}

	static int b(MissionDetailsActivity missiondetailsactivity, int i1)
	{
		missiondetailsactivity.ah = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #895 <Field int ah>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String b(MissionDetailsActivity missiondetailsactivity, String s1)
	{
		missiondetailsactivity.Y = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #193 <Field String Y>
		return s1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void b(MissionDetailsActivity missiondetailsactivity)
	{
		missiondetailsactivity.y();
	//    0    0:aload_0         
	//    1    1:invokespecial   #898 <Method void y()>
	//    2    4:return          
	}

	private void b(String s1)
	{
		if(com.irobot.home.util.j.i(s1))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #198 <Method boolean j.i(String)>
	//*   2    4:ifeq            28
			com.irobot.home.WebViewActivity_.a(((Context) (this))).a(s1).a(Integer.valueOf(0x7f0f05d8)).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #903 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(Context)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #908 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    7   15:ldc2            #909 <Int 0x7f0f05d8>
	//    8   18:invokestatic    #815 <Method Integer Integer.valueOf(int)>
	//    9   21:invokevirtual   #912 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   10   24:invokevirtual   #915 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   11   27:pop             
	//   12   28:return          
	}

	private RobotErrorHelpContent c(String s1)
	{
label0:
		{
			if(!com.irobot.home.util.j.i(s1) || U == null || U.otherContent == null)
				break label0;
	//    0    0:aload_1         
	//    1    1:invokestatic    #198 <Method boolean j.i(String)>
	//    2    4:ifeq            69
	//    3    7:aload_0         
	//    4    8:getfield        #917 <Field RobotErrorHelpContentList U>
	//    5   11:ifnull          69
	//    6   14:aload_0         
	//    7   15:getfield        #917 <Field RobotErrorHelpContentList U>
	//    8   18:getfield        #923 <Field List RobotErrorHelpContentList.otherContent>
	//    9   21:ifnull          69
			Iterator iterator = U.otherContent.iterator();
	//   10   24:aload_0         
	//   11   25:getfield        #917 <Field RobotErrorHelpContentList U>
	//   12   28:getfield        #923 <Field List RobotErrorHelpContentList.otherContent>
	//   13   31:invokeinterface #926 <Method Iterator List.iterator()>
	//   14   36:astore_2        
			RobotErrorHelpContent roboterrorhelpcontent;
			do
			{
				if(!iterator.hasNext())
					break label0;
	//   15   37:aload_2         
	//   16   38:invokeinterface #395 <Method boolean Iterator.hasNext()>
	//   17   43:ifeq            69
				roboterrorhelpcontent = (RobotErrorHelpContent)iterator.next();
	//   18   46:aload_2         
	//   19   47:invokeinterface #399 <Method Object Iterator.next()>
	//   20   52:checkcast       #928 <Class RobotErrorHelpContent>
	//   21   55:astore_3        
			} while(!s1.equalsIgnoreCase(roboterrorhelpcontent.id));
	//   22   56:aload_1         
	//   23   57:aload_3         
	//   24   58:getfield        #931 <Field String RobotErrorHelpContent.id>
	//   25   61:invokevirtual   #370 <Method boolean String.equalsIgnoreCase(String)>
	//   26   64:ifeq            37
			return roboterrorhelpcontent;
	//   27   67:aload_3         
	//   28   68:areturn         
		}
		return null;
	//   29   69:aconst_null     
	//   30   70:areturn         
	}

	static void c(MissionDetailsActivity missiondetailsactivity)
	{
		missiondetailsactivity.A();
	//    0    0:aload_0         
	//    1    1:invokespecial   #844 <Method void A()>
	//    2    4:return          
	}

	static String d(MissionDetailsActivity missiondetailsactivity)
	{
		return missiondetailsactivity.V;
	//    0    0:aload_0         
	//    1    1:getfield        #626 <Field String V>
	//    2    4:areturn         
	}

	private void d(String s1)
	{
	//    0    0:return          
	}

	static AssetInfo e(MissionDetailsActivity missiondetailsactivity)
	{
		return missiondetailsactivity.al;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field AssetInfo al>
	//    2    4:areturn         
	}

	static int f(MissionDetailsActivity missiondetailsactivity)
	{
		return missiondetailsactivity.ah;
	//    0    0:aload_0         
	//    1    1:getfield        #895 <Field int ah>
	//    2    4:ireturn         
	}

	private void f(int i1)
	{
		int j1 = i1 / 60;
	//    0    0:iload_1         
	//    1    1:bipush          60
	//    2    3:idiv            
	//    3    4:istore_2        
		TextView textview;
		Object obj;
		if(i1 < 60)
	//*   4    5:iload_1         
	//*   5    6:bipush          60
	//*   6    8:icmpge          58
		{
			u.setText(((CharSequence) (Integer.toString(i1))));
	//    7   11:aload_0         
	//    8   12:getfield        #936 <Field TextView u>
	//    9   15:iload_1         
	//   10   16:invokestatic    #774 <Method String Integer.toString(int)>
	//   11   19:invokevirtual   #775 <Method void TextView.setText(CharSequence)>
			textview = u;
	//   12   22:aload_0         
	//   13   23:getfield        #936 <Field TextView u>
	//   14   26:astore_3        
			obj = ((Object) (getResources().getQuantityString(0x7f0d002a, i1, new Object[] {
				Integer.valueOf(i1)
			})));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #296 <Method Resources getResources()>
	//   17   31:ldc2            #937 <Int 0x7f0d002a>
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:anewarray       Object[]
	//   21   39:dup             
	//   22   40:iconst_0        
	//   23   41:iload_1         
	//   24   42:invokestatic    #815 <Method Integer Integer.valueOf(int)>
	//   25   45:aastore         
	//   26   46:invokevirtual   #819 <Method String Resources.getQuantityString(int, int, Object[])>
	//   27   49:astore          4
		} else
	//*  28   51:aload_3         
	//*  29   52:aload           4
	//*  30   54:invokevirtual   #781 <Method void TextView.setContentDescription(CharSequence)>
	//*  31   57:return          
		{
			textview = u;
	//   32   58:aload_0         
	//   33   59:getfield        #936 <Field TextView u>
	//   34   62:astore_3        
			obj = ((Object) (new StringBuilder()));
	//   35   63:new             #213 <Class StringBuilder>
	//   36   66:dup             
	//   37   67:invokespecial   #214 <Method void StringBuilder()>
	//   38   70:astore          4
			((StringBuilder) (obj)).append(j1);
	//   39   72:aload           4
	//   40   74:iload_2         
	//   41   75:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//   42   78:pop             
			((StringBuilder) (obj)).append(":");
	//   43   79:aload           4
	//   44   81:ldc2            #939 <String ":">
	//   45   84:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   46   87:pop             
			((StringBuilder) (obj)).append(String.format("%02d", new Object[] {
				Integer.valueOf(i1 % 60)
			}));
	//   47   88:aload           4
	//   48   90:ldc2            #941 <String "%02d">
	//   49   93:iconst_1        
	//   50   94:anewarray       Object[]
	//   51   97:dup             
	//   52   98:iconst_0        
	//   53   99:iload_1         
	//   54  100:bipush          60
	//   55  102:irem            
	//   56  103:invokestatic    #815 <Method Integer Integer.valueOf(int)>
	//   57  106:aastore         
	//   58  107:invokestatic    #788 <Method String String.format(String, Object[])>
	//   59  110:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   60  113:pop             
			textview.setText(((CharSequence) (((StringBuilder) (obj)).toString())));
	//   61  114:aload_3         
	//   62  115:aload           4
	//   63  117:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   64  120:invokevirtual   #775 <Method void TextView.setText(CharSequence)>
			textview = u;
	//   65  123:aload_0         
	//   66  124:getfield        #936 <Field TextView u>
	//   67  127:astore_3        
			obj = ((Object) (new StringBuilder()));
	//   68  128:new             #213 <Class StringBuilder>
	//   69  131:dup             
	//   70  132:invokespecial   #214 <Method void StringBuilder()>
	//   71  135:astore          4
			((StringBuilder) (obj)).append(getResources().getQuantityString(0x7f0d0029, i1, new Object[] {
				Integer.valueOf(i1)
			}));
	//   72  137:aload           4
	//   73  139:aload_0         
	//   74  140:invokevirtual   #296 <Method Resources getResources()>
	//   75  143:ldc2            #942 <Int 0x7f0d0029>
	//   76  146:iload_1         
	//   77  147:iconst_1        
	//   78  148:anewarray       Object[]
	//   79  151:dup             
	//   80  152:iconst_0        
	//   81  153:iload_1         
	//   82  154:invokestatic    #815 <Method Integer Integer.valueOf(int)>
	//   83  157:aastore         
	//   84  158:invokevirtual   #819 <Method String Resources.getQuantityString(int, int, Object[])>
	//   85  161:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   86  164:pop             
			((StringBuilder) (obj)).append(getResources().getQuantityString(0x7f0d002a, i1, new Object[] {
				Integer.valueOf(i1)
			}));
	//   87  165:aload           4
	//   88  167:aload_0         
	//   89  168:invokevirtual   #296 <Method Resources getResources()>
	//   90  171:ldc2            #937 <Int 0x7f0d002a>
	//   91  174:iload_1         
	//   92  175:iconst_1        
	//   93  176:anewarray       Object[]
	//   94  179:dup             
	//   95  180:iconst_0        
	//   96  181:iload_1         
	//   97  182:invokestatic    #815 <Method Integer Integer.valueOf(int)>
	//   98  185:aastore         
	//   99  186:invokevirtual   #819 <Method String Resources.getQuantityString(int, int, Object[])>
	//  100  189:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  101  192:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  102  193:aload           4
	//  103  195:invokevirtual   #228 <Method String StringBuilder.toString()>
	//  104  198:astore          4
		}
		textview.setContentDescription(((CharSequence) (obj)));
	//* 105  200:goto            51
	}

	static String q()
	{
		return Q;
	//    0    0:getstatic       #163 <Field String Q>
	//    1    3:areturn         
	}

	private void r()
	{
		W = a(f, l, ((android.support.design.widget.BottomSheetBehavior.a) (new android.support.design.widget.BottomSheetBehavior.a() {

			public void a(View view, float f1)
			{
			//    0    0:return          
			}

			public void a(View view, int i1)
			{
				if(i1 == 3)
			//*   0    0:iload_2         
			//*   1    1:iconst_3        
			//*   2    2:icmpne          94
				{
					a.l.setRotation(180F);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field MissionDetailsActivity a>
			//    5    9:getfield        #24  <Field ImageView MissionDetailsActivity.l>
			//    6   12:ldc1            #25  <Float 180F>
			//    7   14:invokevirtual   #31  <Method void ImageView.setRotation(float)>
					if(MissionDetailsActivity.d(a) != null)
			//*   8   17:aload_0         
			//*   9   18:getfield        #15  <Field MissionDetailsActivity a>
			//*  10   21:invokestatic    #35  <Method String MissionDetailsActivity.d(MissionDetailsActivity)>
			//*  11   24:ifnull          77
					{
						view = ((View) (a.F));
			//   12   27:aload_0         
			//   13   28:getfield        #15  <Field MissionDetailsActivity a>
			//   14   31:getfield        #39  <Field WebViewLanguageCompat MissionDetailsActivity.F>
			//   15   34:astore_1        
						StringBuilder stringbuilder = new StringBuilder();
			//   16   35:new             #41  <Class StringBuilder>
			//   17   38:dup             
			//   18   39:invokespecial   #42  <Method void StringBuilder()>
			//   19   42:astore_3        
						stringbuilder.append("javascript:loadChart(");
			//   20   43:aload_3         
			//   21   44:ldc1            #44  <String "javascript:loadChart(">
			//   22   46:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   23   49:pop             
						stringbuilder.append(MissionDetailsActivity.d(a));
			//   24   50:aload_3         
			//   25   51:aload_0         
			//   26   52:getfield        #15  <Field MissionDetailsActivity a>
			//   27   55:invokestatic    #35  <Method String MissionDetailsActivity.d(MissionDetailsActivity)>
			//   28   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   29   61:pop             
						stringbuilder.append(")");
			//   30   62:aload_3         
			//   31   63:ldc1            #50  <String ")">
			//   32   65:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   33   68:pop             
						((WebViewLanguageCompat) (view)).loadUrl(stringbuilder.toString());
			//   34   69:aload_1         
			//   35   70:aload_3         
			//   36   71:invokevirtual   #54  <Method String StringBuilder.toString()>
			//   37   74:invokevirtual   #60  <Method void WebViewLanguageCompat.loadUrl(String)>
					}
					AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.MissionHistoryDetailBottomSheet, MissionDetailsActivity.e(a));
			//   38   77:invokestatic    #66  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   39   80:getstatic       #72  <Field ViewId ViewId.MissionHistoryDetailBottomSheet>
			//   40   83:aload_0         
			//   41   84:getfield        #15  <Field MissionDetailsActivity a>
			//   42   87:invokestatic    #76  <Method AssetInfo MissionDetailsActivity.e(MissionDetailsActivity)>
			//   43   90:invokevirtual   #80  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
					return;
			//   44   93:return          
				} else
				{
					a.l.setRotation(0.0F);
			//   45   94:aload_0         
			//   46   95:getfield        #15  <Field MissionDetailsActivity a>
			//   47   98:getfield        #24  <Field ImageView MissionDetailsActivity.l>
			//   48  101:fconst_0        
			//   49  102:invokevirtual   #31  <Method void ImageView.setRotation(float)>
					return;
			//   50  105:return          
				}
			}

			final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.support.design.widget.BottomSheetBehavior$a()>
			//    5    9:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #946 <Field NestedScrollView f>
	//    4    6:aload_0         
	//    5    7:getfield        #948 <Field ImageView l>
	//    6   10:new             #26  <Class MissionDetailsActivity$7>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #949 <Method void MissionDetailsActivity$7(MissionDetailsActivity)>
	//   10   18:invokespecial   #951 <Method BottomSheetBehavior a(NestedScrollView, ImageView, android.support.design.widget.BottomSheetBehavior$a)>
	//   11   21:putfield        #953 <Field BottomSheetBehavior W>
	//   12   24:return          
	}

	private void s()
	{
		X = a(g, m, ((android.support.design.widget.BottomSheetBehavior.a) (new android.support.design.widget.BottomSheetBehavior.a() {

			public void a(View view, float f1)
			{
			//    0    0:return          
			}

			public void a(View view, int i1)
			{
				if(i1 == 3)
			//*   0    0:iload_2         
			//*   1    1:iconst_3        
			//*   2    2:icmpne          42
				{
					a.l.setRotation(180F);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field MissionDetailsActivity a>
			//    5    9:getfield        #24  <Field ImageView MissionDetailsActivity.l>
			//    6   12:ldc1            #25  <Float 180F>
			//    7   14:invokevirtual   #31  <Method void ImageView.setRotation(float)>
					view = ((View) (com.irobot.home.util.j.a(a.b).a()));
			//    8   17:aload_0         
			//    9   18:getfield        #15  <Field MissionDetailsActivity a>
			//   10   21:getfield        #35  <Field String com.irobot.home.MissionDetailsActivity.b>
			//   11   24:invokestatic    #40  <Method a j.a(String)>
			//   12   27:invokevirtual   #45  <Method AssetInfo a.a()>
			//   13   30:astore_1        
					AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.MissionHistoryDetailBottomSheet, ((AssetInfo) (view)));
			//   14   31:invokestatic    #51  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   15   34:getstatic       #57  <Field ViewId ViewId.MissionHistoryDetailBottomSheet>
			//   16   37:aload_1         
			//   17   38:invokevirtual   #61  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
					return;
			//   18   41:return          
				} else
				{
					a.l.setRotation(0.0F);
			//   19   42:aload_0         
			//   20   43:getfield        #15  <Field MissionDetailsActivity a>
			//   21   46:getfield        #24  <Field ImageView MissionDetailsActivity.l>
			//   22   49:fconst_0        
			//   23   50:invokevirtual   #31  <Method void ImageView.setRotation(float)>
					return;
			//   24   53:return          
				}
			}

			final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.support.design.widget.BottomSheetBehavior$a()>
			//    5    9:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #956 <Field NestedScrollView g>
	//    4    6:aload_0         
	//    5    7:getfield        #958 <Field ImageView m>
	//    6   10:new             #28  <Class MissionDetailsActivity$8>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #959 <Method void MissionDetailsActivity$8(MissionDetailsActivity)>
	//   10   18:invokespecial   #951 <Method BottomSheetBehavior a(NestedScrollView, ImageView, android.support.design.widget.BottomSheetBehavior$a)>
	//   11   21:putfield        #961 <Field BottomSheetBehavior X>
		j();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #336 <Method void j()>
	//   14   28:return          
	}

	private void t()
	{
		if(af == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #963 <Field AlertDialog af>
	//*   2    4:ifnonnull       35
			af = (new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f0925).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).create();
	//    3    7:aload_0         
	//    4    8:new             #965 <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #968 <Method void android.app.AlertDialog$Builder(Context)>
	//    8   16:ldc2            #969 <Int 0x7f0f0925>
	//    9   19:invokevirtual   #973 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   10   22:ldc2            #974 <Int 0x7f0f05bb>
	//   11   25:aconst_null     
	//   12   26:invokevirtual   #978 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   29:invokevirtual   #981 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   14   32:putfield        #963 <Field AlertDialog af>
		af.show();
	//   15   35:aload_0         
	//   16   36:getfield        #963 <Field AlertDialog af>
	//   17   39:invokevirtual   #986 <Method void AlertDialog.show()>
	//   18   42:return          
	}

	private void x()
	{
		if(ae == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #988 <Field AlertDialog ae>
	//*   2    4:ifnonnull       42
			ae = (new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f0495).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					com.irobot.home.util.j.a(((android.app.Activity) (a)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MissionDetailsActivity a>
				//    2    4:invokestatic    #27  <Method void j.a(android.app.Activity)>
				//    3    7:return          
				}

				final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).create();
	//    3    7:aload_0         
	//    4    8:new             #965 <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #968 <Method void android.app.AlertDialog$Builder(Context)>
	//    8   16:ldc2            #989 <Int 0x7f0f0495>
	//    9   19:invokevirtual   #973 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   10   22:ldc2            #974 <Int 0x7f0f05bb>
	//   11   25:new             #30  <Class MissionDetailsActivity$9>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #990 <Method void MissionDetailsActivity$9(MissionDetailsActivity)>
	//   15   33:invokevirtual   #978 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   36:invokevirtual   #981 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   17   39:putfield        #988 <Field AlertDialog ae>
		ae.show();
	//   18   42:aload_0         
	//   19   43:getfield        #988 <Field AlertDialog ae>
	//   20   46:invokevirtual   #986 <Method void AlertDialog.show()>
	//   21   49:return          
	}

	private void y()
	{
		L.setVisibility(4);
	//    0    0:aload_0         
	//    1    1:getfield        #876 <Field LinearLayout L>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #801 <Method void LinearLayout.setVisibility(int)>
	//    4    8:return          
	}

	private void z()
	{
		View view = getLayoutInflater().inflate(0x7f0b00a0, ((ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #994 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc2            #995 <Int 0x7f0b00a0>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #480 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    5   11:astore_1        
		ad = (new android.app.AlertDialog.Builder(((Context) (this)))).setView(view).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				SatisfactionRating satisfactionrating;
				switch(MissionDetailsActivity.f(a))
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field MissionDetailsActivity a>
			//*   2    4:invokestatic    #26  <Method int MissionDetailsActivity.f(MissionDetailsActivity)>
				{
			//*   3    7:tableswitch     2131297045 2131297049: default 40
			//			               2131297045 89
			//			               2131297046 77
			//			               2131297047 65
			//			               2131297048 53
			//			               2131297049 41
				default:
					return;
			//    4   40:return          

				case 2131297049: 
					dialoginterface = ((DialogInterface) (a));
			//    5   41:aload_0         
			//    6   42:getfield        #17  <Field MissionDetailsActivity a>
			//    7   45:astore_1        
					satisfactionrating = SatisfactionRating.VerySatisfied;
			//    8   46:getstatic       #32  <Field SatisfactionRating SatisfactionRating.VerySatisfied>
			//    9   49:astore_3        
					break;

			//*  10   50:goto            98
				case 2131297048: 
					dialoginterface = ((DialogInterface) (a));
			//   11   53:aload_0         
			//   12   54:getfield        #17  <Field MissionDetailsActivity a>
			//   13   57:astore_1        
					satisfactionrating = SatisfactionRating.VeryDissatisfied;
			//   14   58:getstatic       #35  <Field SatisfactionRating SatisfactionRating.VeryDissatisfied>
			//   15   61:astore_3        
					break;

			//*  16   62:goto            98
				case 2131297047: 
					dialoginterface = ((DialogInterface) (a));
			//   17   65:aload_0         
			//   18   66:getfield        #17  <Field MissionDetailsActivity a>
			//   19   69:astore_1        
					satisfactionrating = SatisfactionRating.Satisfied;
			//   20   70:getstatic       #38  <Field SatisfactionRating SatisfactionRating.Satisfied>
			//   21   73:astore_3        
					break;

			//*  22   74:goto            98
				case 2131297046: 
					dialoginterface = ((DialogInterface) (a));
			//   23   77:aload_0         
			//   24   78:getfield        #17  <Field MissionDetailsActivity a>
			//   25   81:astore_1        
					satisfactionrating = SatisfactionRating.Neutral;
			//   26   82:getstatic       #41  <Field SatisfactionRating SatisfactionRating.Neutral>
			//   27   85:astore_3        
					break;

			//*  28   86:goto            98
				case 2131297045: 
					dialoginterface = ((DialogInterface) (a));
			//   29   89:aload_0         
			//   30   90:getfield        #17  <Field MissionDetailsActivity a>
			//   31   93:astore_1        
					satisfactionrating = SatisfactionRating.Dissatisfied;
			//   32   94:getstatic       #44  <Field SatisfactionRating SatisfactionRating.Dissatisfied>
			//   33   97:astore_3        
					break;
				}
				com.irobot.home.MissionDetailsActivity.a(((MissionDetailsActivity) (dialoginterface)), satisfactionrating);
			//   34   98:aload_1         
			//   35   99:aload_3         
			//   36  100:invokestatic    #47  <Method void com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity, SatisfactionRating)>
			//   37  103:return          
			}

			final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).create();
	//    6   12:aload_0         
	//    7   13:new             #965 <Class android.app.AlertDialog$Builder>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #968 <Method void android.app.AlertDialog$Builder(Context)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #999 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//   13   25:ldc2            #974 <Int 0x7f0f05bb>
	//   14   28:new             #16  <Class MissionDetailsActivity$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #1000 <Method void MissionDetailsActivity$2(MissionDetailsActivity)>
	//   18   36:invokevirtual   #978 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   19   39:invokevirtual   #981 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   20   42:putfield        #1002 <Field AlertDialog ad>
		ag = (RadioGroup)view.findViewById(0x7f09031a);
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:ldc2            #1003 <Int 0x7f09031a>
	//   24   50:invokevirtual   #487 <Method View View.findViewById(int)>
	//   25   53:checkcast       #1005 <Class RadioGroup>
	//   26   56:putfield        #1007 <Field RadioGroup ag>
		ag.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

			public void onCheckedChanged(RadioGroup radiogroup, int i1)
			{
				com.irobot.home.MissionDetailsActivity.b(a, i1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MissionDetailsActivity a>
			//    2    4:iload_2         
			//    3    5:invokestatic    #26  <Method int com.irobot.home.MissionDetailsActivity.b(MissionDetailsActivity, int)>
			//    4    8:pop             
			//    5    9:return          
			}

			final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   27   59:aload_0         
	//   28   60:getfield        #1007 <Field RadioGroup ag>
	//   29   63:new             #18  <Class MissionDetailsActivity$3>
	//   30   66:dup             
	//   31   67:aload_0         
	//   32   68:invokespecial   #1008 <Method void MissionDetailsActivity$3(MissionDetailsActivity)>
	//   33   71:invokevirtual   #1012 <Method void RadioGroup.setOnCheckedChangeListener(android.widget.RadioGroup$OnCheckedChangeListener)>
	//   34   74:return          
	}

	public void a(Bitmap bitmap)
	{
	//    0    0:return          
	}

	protected void a(String s1)
	{
		v.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #1015 <Field CustomTextView v>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #1016 <Method void CustomTextView.setVisibility(int)>
		v.setPaintFlags(8);
	//    4    8:aload_0         
	//    5    9:getfield        #1015 <Field CustomTextView v>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #1019 <Method void CustomTextView.setPaintFlags(int)>
		v.setText(((CharSequence) (s1)));
	//    8   17:aload_0         
	//    9   18:getfield        #1015 <Field CustomTextView v>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
		f.requestLayout();
	//   12   25:aload_0         
	//   13   26:getfield        #946 <Field NestedScrollView f>
	//   14   29:invokevirtual   #1024 <Method void NestedScrollView.requestLayout()>
		f.invalidate();
	//   15   32:aload_0         
	//   16   33:getfield        #946 <Field NestedScrollView f>
	//   17   36:invokevirtual   #1027 <Method void NestedScrollView.invalidate()>
		h.requestLayout();
	//   18   39:aload_0         
	//   19   40:getfield        #1029 <Field LinearLayout h>
	//   20   43:invokevirtual   #1030 <Method void LinearLayout.requestLayout()>
		h.invalidate();
	//   21   46:aload_0         
	//   22   47:getfield        #1029 <Field LinearLayout h>
	//   23   50:invokevirtual   #1031 <Method void LinearLayout.invalidate()>
	//   24   53:return          
	}

	public void a_()
	{
		e.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #379 <Field ProgressBar e>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #382 <Method void ProgressBar.setVisibility(int)>
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    4    9:invokestatic    #440 <Method MapsUIServiceData MapsUIServiceData.create()>
	//    5   12:astore_1        
		if("release".equalsIgnoreCase("dev") && R != null)
	//*   6   13:ldc2            #1034 <String "release">
	//*   7   16:ldc2            #1036 <String "dev">
	//*   8   19:invokevirtual   #370 <Method boolean String.equalsIgnoreCase(String)>
	//*   9   22:ifeq            56
	//*  10   25:aload_0         
	//*  11   26:getfield        #319 <Field MapsUIService R>
	//*  12   29:ifnull          56
			mapsuiservicedata.setDirtDetectsHiddenState(getSharedPreferences("DEVEL", 0).getBoolean("show_dirt_detect", true));
	//   13   32:aload_1         
	//   14   33:aload_0         
	//   15   34:ldc2            #1038 <String "DEVEL">
	//   16   37:iconst_0        
	//   17   38:invokevirtual   #1042 <Method SharedPreferences getSharedPreferences(String, int)>
	//   18   41:ldc2            #1044 <String "show_dirt_detect">
	//   19   44:iconst_1        
	//   20   45:invokeinterface #1050 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   21   50:invokevirtual   #1053 <Method void MapsUIServiceData.setDirtDetectsHiddenState(boolean)>
		else
	//*  22   53:goto            61
			mapsuiservicedata.setDirtDetectsHiddenState(true);
	//   23   56:aload_1         
	//   24   57:iconst_1        
	//   25   58:invokevirtual   #1053 <Method void MapsUIServiceData.setDirtDetectsHiddenState(boolean)>
		R.sendCommand(MapsUIServiceCommand.SetDirtDetectsHidden, mapsuiservicedata);
	//   26   61:aload_0         
	//   27   62:getfield        #319 <Field MapsUIService R>
	//   28   65:getstatic       #1056 <Field MapsUIServiceCommand MapsUIServiceCommand.SetDirtDetectsHidden>
	//   29   68:aload_1         
	//   30   69:invokevirtual   #457 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   31   72:return          
	}

	public void b_()
	{
	//    0    0:return          
	}

	public void c()
	{
	//    0    0:return          
	}

	void e()
	{
		if(v())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1059 <Method boolean v()>
	//*   2    4:ifeq            29
		{
			if(!com.irobot.home.util.j.a())
	//*   3    7:invokestatic    #1061 <Method boolean j.a()>
	//*   4   10:ifne            18
			{
				com.irobot.home.util.j.b(((android.app.Activity) (this)));
	//    5   13:aload_0         
	//    6   14:invokestatic    #1063 <Method void j.b(android.app.Activity)>
				return;
	//    7   17:return          
			}
			r.c(b);
	//    8   18:aload_0         
	//    9   19:getfield        #1066 <Field b r>
	//   10   22:aload_0         
	//   11   23:getfield        #580 <Field String b>
	//   12   26:invokevirtual   #1070 <Method void b.c(String)>
		}
		al = com.irobot.home.util.j.a(b).a();
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #580 <Field String b>
	//   16   34:invokestatic    #1073 <Method a j.a(String)>
	//   17   37:invokevirtual   #1078 <Method AssetInfo a.a()>
	//   18   40:putfield        #200 <Field AssetInfo al>
		Assembler assembler = Assembler.getInstance();
	//   19   43:invokestatic    #1084 <Method Assembler Assembler.getInstance()>
	//   20   46:astore_1        
		R = assembler.getMapsUIService(al.getAssetId());
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:aload_0         
	//   24   50:getfield        #200 <Field AssetInfo al>
	//   25   53:invokevirtual   #1088 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   26   56:invokevirtual   #1092 <Method MapsUIService Assembler.getMapsUIService(com.irobot.core.AssetId)>
	//   27   59:putfield        #319 <Field MapsUIService R>
		S = assembler.getSettingsSubsystem(al.getAssetId());
	//   28   62:aload_0         
	//   29   63:aload_1         
	//   30   64:aload_0         
	//   31   65:getfield        #200 <Field AssetInfo al>
	//   32   68:invokevirtual   #1088 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   33   71:invokevirtual   #1096 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   34   74:putfield        #1098 <Field SettingsSubsystem S>
		r();
	//   35   77:aload_0         
	//   36   78:invokespecial   #1100 <Method void r()>
		s();
	//   37   81:aload_0         
	//   38   82:invokespecial   #1102 <Method void s()>
		p();
	//   39   85:aload_0         
	//   40   86:invokevirtual   #1105 <Method void p()>
		z();
	//   41   89:aload_0         
	//   42   90:invokespecial   #1107 <Method void z()>
		K.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

			private float a(SeekBar seekbar)
			{
				return (float)seekbar.getProgress() / (float)seekbar.getMax();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #27  <Method int SeekBar.getProgress()>
			//    2    4:i2f             
			//    3    5:aload_1         
			//    4    6:invokevirtual   #30  <Method int SeekBar.getMax()>
			//    5    9:i2f             
			//    6   10:fdiv            
			//    7   11:freturn         
			}

			public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
			{
				if(flag)
			//*   0    0:iload_3         
			//*   1    1:ifeq            34
				{
					MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
			//    2    4:invokestatic    #38  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    3    7:astore          4
					mapsuiservicedata.setPlaybackProgress(a(seekbar));
			//    4    9:aload           4
			//    5   11:aload_0         
			//    6   12:aload_1         
			//    7   13:invokespecial   #40  <Method float a(SeekBar)>
			//    8   16:invokevirtual   #44  <Method void MapsUIServiceData.setPlaybackProgress(float)>
					com.irobot.home.MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SeekPlayback, mapsuiservicedata);
			//    9   19:aload_0         
			//   10   20:getfield        #17  <Field MissionDetailsActivity a>
			//   11   23:invokestatic    #47  <Method MapsUIService com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity)>
			//   12   26:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.SeekPlayback>
			//   13   29:aload           4
			//   14   31:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				}
			//   15   34:return          
			}

			public void onStartTrackingTouch(SeekBar seekbar)
			{
				com.irobot.home.MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.PausePlayback, ((MapsUIServiceData) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MissionDetailsActivity a>
			//    2    4:invokestatic    #47  <Method MapsUIService com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity)>
			//    3    7:getstatic       #64  <Field MapsUIServiceCommand MapsUIServiceCommand.PausePlayback>
			//    4   10:aconst_null     
			//    5   11:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
			//    6   14:invokestatic    #38  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    7   17:astore_2        
				mapsuiservicedata.setPlaybackProgress(a(seekbar));
			//    8   18:aload_2         
			//    9   19:aload_0         
			//   10   20:aload_1         
			//   11   21:invokespecial   #40  <Method float a(SeekBar)>
			//   12   24:invokevirtual   #44  <Method void MapsUIServiceData.setPlaybackProgress(float)>
				com.irobot.home.MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SeekPlayback, mapsuiservicedata);
			//   13   27:aload_0         
			//   14   28:getfield        #17  <Field MissionDetailsActivity a>
			//   15   31:invokestatic    #47  <Method MapsUIService com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity)>
			//   16   34:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.SeekPlayback>
			//   17   37:aload_2         
			//   18   38:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			//   19   41:return          
			}

			public void onStopTrackingTouch(SeekBar seekbar)
			{
				MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
			//    0    0:invokestatic    #38  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    1    3:astore_2        
				mapsuiservicedata.setPlaybackProgress(a(seekbar));
			//    2    4:aload_2         
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:invokespecial   #40  <Method float a(SeekBar)>
			//    6   10:invokevirtual   #44  <Method void MapsUIServiceData.setPlaybackProgress(float)>
				com.irobot.home.MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SeekPlayback, mapsuiservicedata);
			//    7   13:aload_0         
			//    8   14:getfield        #17  <Field MissionDetailsActivity a>
			//    9   17:invokestatic    #47  <Method MapsUIService com.irobot.home.MissionDetailsActivity.a(MissionDetailsActivity)>
			//   10   20:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.SeekPlayback>
			//   11   23:aload_2         
			//   12   24:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			//   13   27:return          
			}

			final MissionDetailsActivity a;

			
			{
				a = MissionDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   43   93:aload_0         
	//   44   94:getfield        #326 <Field AppCompatSeekBar K>
	//   45   97:new             #24  <Class MissionDetailsActivity$6>
	//   46  100:dup             
	//   47  101:aload_0         
	//   48  102:invokespecial   #1108 <Method void MissionDetailsActivity$6(MissionDetailsActivity)>
	//   49  105:invokevirtual   #1112 <Method void AppCompatSeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
	//   50  108:return          
	}

	protected void f()
	{
		ag.clearCheck();
	//    0    0:aload_0         
	//    1    1:getfield        #1007 <Field RadioGroup ag>
	//    2    4:invokevirtual   #1115 <Method void RadioGroup.clearCheck()>
		ad.show();
	//    3    7:aload_0         
	//    4    8:getfield        #1002 <Field AlertDialog ad>
	//    5   11:invokevirtual   #986 <Method void AlertDialog.show()>
	//    6   14:return          
	}

	protected void g()
	{
		K.setMax(0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field AppCompatSeekBar K>
	//    2    4:ldc2            #1116 <Int 0x7fffffff>
	//    3    7:invokevirtual   #1119 <Method void AppCompatSeekBar.setMax(int)>
		R.sendCommand(MapsUIServiceCommand.StartPlayback, ((MapsUIServiceData) (null)));
	//    4   10:aload_0         
	//    5   11:getfield        #319 <Field MapsUIService R>
	//    6   14:getstatic       #1122 <Field MapsUIServiceCommand MapsUIServiceCommand.StartPlayback>
	//    7   17:aconst_null     
	//    8   18:invokevirtual   #457 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		I.setVisibility(8);
	//    9   21:aload_0         
	//   10   22:getfield        #1124 <Field ImageButton I>
	//   11   25:bipush          8
	//   12   27:invokevirtual   #1127 <Method void ImageButton.setVisibility(int)>
		J.setVisibility(0);
	//   13   30:aload_0         
	//   14   31:getfield        #1129 <Field ImageButton J>
	//   15   34:iconst_0        
	//   16   35:invokevirtual   #1127 <Method void ImageButton.setVisibility(int)>
	//   17   38:return          
	}

	protected void h()
	{
		R.sendCommand(MapsUIServiceCommand.PausePlayback, ((MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field MapsUIService R>
	//    2    4:getstatic       #1132 <Field MapsUIServiceCommand MapsUIServiceCommand.PausePlayback>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #457 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		I.setVisibility(0);
	//    5   11:aload_0         
	//    6   12:getfield        #1124 <Field ImageButton I>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #1127 <Method void ImageButton.setVisibility(int)>
		J.setVisibility(8);
	//    9   19:aload_0         
	//   10   20:getfield        #1129 <Field ImageButton J>
	//   11   23:bipush          8
	//   12   25:invokevirtual   #1127 <Method void ImageButton.setVisibility(int)>
	//   13   28:return          
	}

	protected void i()
	{
		R.sendCommand(MapsUIServiceCommand.ResetMap, ((MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field MapsUIService R>
	//    2    4:getstatic       #1135 <Field MapsUIServiceCommand MapsUIServiceCommand.ResetMap>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #457 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//    5   11:return          
	}

	protected void j()
	{
		A.setText(((CharSequence) (getResources().getQuantityString(0x7f0d0022, ai, new Object[] {
			Integer.valueOf(ai)
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #1137 <Field CustomTextView A>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #296 <Method Resources getResources()>
	//    4    8:ldc2            #1138 <Int 0x7f0d0022>
	//    5   11:aload_0         
	//    6   12:getfield        #144 <Field int ai>
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:getfield        #144 <Field int ai>
	//   13   25:invokestatic    #815 <Method Integer Integer.valueOf(int)>
	//   14   28:aastore         
	//   15   29:invokevirtual   #819 <Method String Resources.getQuantityString(int, int, Object[])>
	//   16   32:invokevirtual   #724 <Method void CustomTextView.setText(CharSequence)>
	//   17   35:return          
	}

	void k()
	{
		a(W);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #953 <Field BottomSheetBehavior W>
	//    3    5:invokespecial   #1140 <Method void a(BottomSheetBehavior)>
	//    4    8:return          
	}

	void l()
	{
		a(X);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #961 <Field BottomSheetBehavior X>
	//    3    5:invokespecial   #1140 <Method void a(BottomSheetBehavior)>
	//    4    8:return          
	}

	protected void m()
	{
		AnalyticsSubsystem.getInstance().trackHistoryProvideFeedbackButtonPressed(com.irobot.home.util.j.a(b).a());
	//    0    0:invokestatic    #1145 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #580 <Field String b>
	//    3    7:invokestatic    #1073 <Method a j.a(String)>
	//    4   10:invokevirtual   #1078 <Method AssetInfo a.a()>
	//    5   13:invokevirtual   #1149 <Method void AnalyticsSubsystem.trackHistoryProvideFeedbackButtonPressed(AssetInfo)>
		com.irobot.home.WifiMapFeedbackActivity_.a(((Context) (this))).a();
	//    6   16:aload_0         
	//    7   17:invokestatic    #1154 <Method WifiMapFeedbackActivity_$a com.irobot.home.WifiMapFeedbackActivity_.a(Context)>
	//    8   20:invokevirtual   #1157 <Method org.androidannotations.api.a.e com.irobot.home.WifiMapFeedbackActivity_$a.a()>
	//    9   23:pop             
	//   10   24:return          
	}

	void n()
	{
		AnalyticsSubsystem.getInstance().trackHistoryDetailErrorIndicatorPressed(al);
	//    0    0:invokestatic    #1145 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #200 <Field AssetInfo al>
	//    3    7:invokevirtual   #1160 <Method void AnalyticsSubsystem.trackHistoryDetailErrorIndicatorPressed(AssetInfo)>
		if(U == null || U.otherContent == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #917 <Field RobotErrorHelpContentList U>
	//*   6   14:ifnull          27
	//*   7   17:aload_0         
	//*   8   18:getfield        #917 <Field RobotErrorHelpContentList U>
	//*   9   21:getfield        #923 <Field List RobotErrorHelpContentList.otherContent>
	//*  10   24:ifnonnull       31
			t();
	//   11   27:aload_0         
	//   12   28:invokespecial   #1162 <Method void t()>
		RobotErrorHelpContent roboterrorhelpcontent = a(T, al.getSku());
	//   13   31:aload_0         
	//   14   32:aload_0         
	//   15   33:getfield        #188 <Field r T>
	//   16   36:aload_0         
	//   17   37:getfield        #200 <Field AssetInfo al>
	//   18   40:invokevirtual   #206 <Method String AssetInfo.getSku()>
	//   19   43:invokespecial   #1164 <Method RobotErrorHelpContent a(r, String)>
	//   20   46:astore_1        
		if(roboterrorhelpcontent != null)
	//*  21   47:aload_1         
	//*  22   48:ifnull          60
		{
			b(roboterrorhelpcontent.content);
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:getfield        #1167 <Field String RobotErrorHelpContent.content>
	//   26   56:invokespecial   #1169 <Method void b(String)>
			return;
	//   27   59:return          
		} else
		{
			t();
	//   28   60:aload_0         
	//   29   61:invokespecial   #1162 <Method void t()>
			return;
	//   30   64:return          
		}
	}

	protected void o()
	{
		if(ak)
	//*   0    0:aload_0         
	//*   1    1:getfield        #352 <Field boolean ak>
	//*   2    4:ifeq            77
		{
			if(ab != null && ab.getCurrentItem() != 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #491 <Field ViewPager ab>
	//*   5   11:ifnull          66
	//*   6   14:aload_0         
	//*   7   15:getfield        #491 <Field ViewPager ab>
	//*   8   18:invokevirtual   #1172 <Method int ViewPager.getCurrentItem()>
	//*   9   21:ifne            27
	//*  10   24:goto            66
				if(ab.getCurrentItem() == 1)
	//*  11   27:aload_0         
	//*  12   28:getfield        #491 <Field ViewPager ab>
	//*  13   31:invokevirtual   #1172 <Method int ViewPager.getCurrentItem()>
	//*  14   34:iconst_1        
	//*  15   35:icmpne          56
				{
					f.setVisibility(8);
	//   16   38:aload_0         
	//   17   39:getfield        #946 <Field NestedScrollView f>
	//   18   42:bipush          8
	//   19   44:invokevirtual   #1173 <Method void NestedScrollView.setVisibility(int)>
					g.setVisibility(0);
	//   20   47:aload_0         
	//   21   48:getfield        #956 <Field NestedScrollView g>
	//   22   51:iconst_0        
	//   23   52:invokevirtual   #1173 <Method void NestedScrollView.setVisibility(int)>
					return;
	//   24   55:return          
				} else
				{
					com.irobot.home.util.o.d(Q, "Could not update bottom sheet visibility to unknown type.");
	//   25   56:getstatic       #163 <Field String Q>
	//   26   59:ldc2            #1175 <String "Could not update bottom sheet visibility to unknown type.">
	//   27   62:invokestatic    #1177 <Method void o.d(String, String)>
					return;
	//   28   65:return          
				}
			f.setVisibility(0);
	//   29   66:aload_0         
	//   30   67:getfield        #946 <Field NestedScrollView f>
	//   31   70:iconst_0        
	//   32   71:invokevirtual   #1173 <Method void NestedScrollView.setVisibility(int)>
		} else
	//*  33   74:goto            86
		{
			f.setVisibility(8);
	//   34   77:aload_0         
	//   35   78:getfield        #946 <Field NestedScrollView f>
	//   36   81:bipush          8
	//   37   83:invokevirtual   #1173 <Method void NestedScrollView.setVisibility(int)>
		}
		g.setVisibility(8);
	//   38   86:aload_0         
	//   39   87:getfield        #956 <Field NestedScrollView g>
	//   40   90:bipush          8
	//   41   92:invokevirtual   #1173 <Method void NestedScrollView.setVisibility(int)>
	//   42   95:return          
	}

	public void onBackPressed()
	{
		if(R.getMissionMapTypes().size() >= 1 && Z != null && RobotMissionHistoryItemUtil.isMapAssociatedWithItem(Z))
	//*   0    0:aload_0         
	//*   1    1:getfield        #319 <Field MapsUIService R>
	//*   2    4:invokevirtual   #415 <Method ArrayList MapsUIService.getMissionMapTypes()>
	//*   3    7:invokevirtual   #385 <Method int ArrayList.size()>
	//*   4   10:iconst_1        
	//*   5   11:icmplt          54
	//*   6   14:aload_0         
	//*   7   15:getfield        #161 <Field RobotMissionHistoryItem Z>
	//*   8   18:ifnull          54
	//*   9   21:aload_0         
	//*  10   22:getfield        #161 <Field RobotMissionHistoryItem Z>
	//*  11   25:invokestatic    #1182 <Method boolean RobotMissionHistoryItemUtil.isMapAssociatedWithItem(RobotMissionHistoryItem)>
	//*  12   28:ifeq            54
		{
			Intent intent = new Intent();
	//   13   31:new             #1184 <Class Intent>
	//   14   34:dup             
	//   15   35:invokespecial   #1185 <Method void Intent()>
	//   16   38:astore_1        
			intent.putExtra("map_shown", true);
	//   17   39:aload_1         
	//   18   40:ldc2            #1187 <String "map_shown">
	//   19   43:iconst_1        
	//   20   44:invokevirtual   #1191 <Method Intent Intent.putExtra(String, boolean)>
	//   21   47:pop             
			setResult(-1, intent);
	//   22   48:aload_0         
	//   23   49:iconst_m1       
	//   24   50:aload_1         
	//   25   51:invokevirtual   #1195 <Method void setResult(int, Intent)>
		}
		super.onBackPressed();
	//   26   54:aload_0         
	//   27   55:invokespecial   #1197 <Method void BasePushNotificationActivity.onBackPressed()>
	//   28   58:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1200 <Method void BasePushNotificationActivity.onPause()>
		if(ae != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #988 <Field AlertDialog ae>
	//*   4    8:ifnull          18
			ae.dismiss();
	//    5   11:aload_0         
	//    6   12:getfield        #988 <Field AlertDialog ae>
	//    7   15:invokevirtual   #1203 <Method void AlertDialog.dismiss()>
		if(af != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #963 <Field AlertDialog af>
	//*  10   22:ifnull          32
			af.dismiss();
	//   11   25:aload_0         
	//   12   26:getfield        #963 <Field AlertDialog af>
	//   13   29:invokevirtual   #1203 <Method void AlertDialog.dismiss()>
		Fragment fragment;
		for(Iterator iterator = P.iterator(); iterator.hasNext(); getSupportFragmentManager().beginTransaction().remove(fragment).commit())
	//*  14   32:aload_0         
	//*  15   33:getfield        #142 <Field ArrayList P>
	//*  16   36:invokevirtual   #389 <Method Iterator ArrayList.iterator()>
	//*  17   39:astore_1        
	//*  18   40:aload_1         
	//*  19   41:invokeinterface #395 <Method boolean Iterator.hasNext()>
	//*  20   46:ifeq            77
			fragment = (Fragment)iterator.next();
	//   21   49:aload_1         
	//   22   50:invokeinterface #399 <Method Object Iterator.next()>
	//   23   55:checkcast       #401 <Class Fragment>
	//   24   58:astore_2        

	//   25   59:aload_0         
	//   26   60:invokevirtual   #344 <Method FragmentManager getSupportFragmentManager()>
	//   27   63:invokevirtual   #350 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   28   66:aload_2         
	//   29   67:invokevirtual   #1207 <Method FragmentTransaction FragmentTransaction.remove(Fragment)>
	//   30   70:invokevirtual   #466 <Method int FragmentTransaction.commit()>
	//   31   73:pop             
	//*  32   74:goto            40
	//   33   77:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1210 <Method void BasePushNotificationActivity.onStart()>
		Display display = getWindowManager().getDefaultDisplay();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1214 <Method WindowManager getWindowManager()>
	//    4    8:invokeinterface #1220 <Method Display WindowManager.getDefaultDisplay()>
	//    5   13:astore_3        
		Point point = new Point();
	//    6   14:new             #1222 <Class Point>
	//    7   17:dup             
	//    8   18:invokespecial   #1223 <Method void Point()>
	//    9   21:astore          4
		display.getSize(point);
	//   10   23:aload_3         
	//   11   24:aload           4
	//   12   26:invokevirtual   #1229 <Method void Display.getSize(Point)>
		int i1 = point.x;
	//   13   29:aload           4
	//   14   31:getfield        #1231 <Field int Point.x>
	//   15   34:istore_1        
		int j1 = point.y;
	//   16   35:aload           4
	//   17   37:getfield        #1233 <Field int Point.y>
	//   18   40:istore_2        
		R.setMissionDetailsInfo(c, i1, j1, v());
	//   19   41:aload_0         
	//   20   42:getfield        #319 <Field MapsUIService R>
	//   21   45:aload_0         
	//   22   46:getfield        #612 <Field int c>
	//   23   49:iload_1         
	//   24   50:iload_2         
	//   25   51:aload_0         
	//   26   52:invokevirtual   #1059 <Method boolean v()>
	//   27   55:invokevirtual   #1237 <Method void MapsUIService.setMissionDetailsInfo(int, int, int, boolean)>
		S.registerUISubscriber(ao);
	//   28   58:aload_0         
	//   29   59:getfield        #1098 <Field SettingsSubsystem S>
	//   30   62:aload_0         
	//   31   63:getfield        #159 <Field SettingsUIServiceDataCallback ao>
	//   32   66:invokevirtual   #1243 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//   33   69:pop             
		R.registerUISubscriber(((MapsUIServiceDataCallback) (an)));
	//   34   70:aload_0         
	//   35   71:getfield        #319 <Field MapsUIService R>
	//   36   74:aload_0         
	//   37   75:getfield        #156 <Field MissionDetailsActivity$a an>
	//   38   78:invokevirtual   #1246 <Method boolean MapsUIService.registerUISubscriber(MapsUIServiceDataCallback)>
	//   39   81:pop             
	//   40   82:return          
	}

	public void onStop()
	{
		S.unregisterSubscriber(ao);
	//    0    0:aload_0         
	//    1    1:getfield        #1098 <Field SettingsSubsystem S>
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field SettingsUIServiceDataCallback ao>
	//    4    8:invokevirtual   #1250 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    5   11:pop             
		R.unregisterSubscriber(((MapsUIServiceDataCallback) (an)));
	//    6   12:aload_0         
	//    7   13:getfield        #319 <Field MapsUIService R>
	//    8   16:aload_0         
	//    9   17:getfield        #156 <Field MissionDetailsActivity$a an>
	//   10   20:invokevirtual   #1252 <Method boolean MapsUIService.unregisterSubscriber(MapsUIServiceDataCallback)>
	//   11   23:pop             
		P.clear();
	//   12   24:aload_0         
	//   13   25:getfield        #142 <Field ArrayList P>
	//   14   28:invokevirtual   #409 <Method void ArrayList.clear()>
		if(ab != null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #491 <Field ViewPager ab>
	//*  17   35:ifnull          65
		{
			ViewGroup viewgroup = (ViewGroup)findViewById(0x7f09026d);
	//   18   38:aload_0         
	//   19   39:ldc2            #458 <Int 0x7f09026d>
	//   20   42:invokevirtual   #495 <Method View findViewById(int)>
	//   21   45:checkcast       #497 <Class ViewGroup>
	//   22   48:astore_1        
			ab.setAdapter(((android.support.v4.view.p) (null)));
	//   23   49:aload_0         
	//   24   50:getfield        #491 <Field ViewPager ab>
	//   25   53:aconst_null     
	//   26   54:invokevirtual   #517 <Method void ViewPager.setAdapter(android.support.v4.view.p)>
			if(viewgroup != null)
	//*  27   57:aload_1         
	//*  28   58:ifnull          65
				viewgroup.removeAllViews();
	//   29   61:aload_1         
	//   30   62:invokevirtual   #1255 <Method void ViewGroup.removeAllViews()>
		}
		super.onStop();
	//   31   65:aload_0         
	//   32   66:invokespecial   #1257 <Method void BasePushNotificationActivity.onStop()>
	//   33   69:return          
	}

	public void p()
	{
		try
		{
			U = O.getRobotErrorHelp(com.irobot.home.util.j.a(Locale.getDefault()), com.irobot.home.util.j.h(((Context) (this))), al.getSku());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #1261 <Field CustomerCareRestClient O>
	//    3    5:invokestatic    #1267 <Method Locale Locale.getDefault()>
	//    4    8:invokestatic    #1270 <Method String j.a(Locale)>
	//    5   11:aload_0         
	//    6   12:invokestatic    #1273 <Method String j.h(Context)>
	//    7   15:aload_0         
	//    8   16:getfield        #200 <Field AssetInfo al>
	//    9   19:invokevirtual   #206 <Method String AssetInfo.getSku()>
	//   10   22:invokeinterface #1279 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//   11   27:putfield        #917 <Field RobotErrorHelpContentList U>
			return;
	//   12   30:return          
		}
		catch(Exception exception)
	//*  13   31:astore_1        
		{
			String s1 = Q;
	//   14   32:getstatic       #163 <Field String Q>
	//   15   35:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   36:new             #213 <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #214 <Method void StringBuilder()>
	//   19   43:astore_3        
			stringbuilder.append("getErrorMessages: ");
	//   20   44:aload_3         
	//   21   45:ldc2            #1281 <String "getErrorMessages: ">
	//   22   48:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
			stringbuilder.append(exception.getMessage());
	//   24   52:aload_3         
	//   25   53:aload_1         
	//   26   54:invokevirtual   #1284 <Method String Exception.getMessage()>
	//   27   57:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   29   61:aload_2         
	//   30   62:aload_3         
	//   31   63:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #170 <Method void o.e(String, String)>
			return;
	//   33   69:return          
		}
	}

	private static final String Q = "MissionDetailsActivity";
	CustomTextView A;
	CustomTextView B;
	CustomTextView C;
	CustomTextView D;
	View E;
	WebViewLanguageCompat F;
	CustomButton G;
	LinearLayout H;
	ImageButton I;
	ImageButton J;
	AppCompatSeekBar K;
	protected LinearLayout L;
	protected CustomTextView M;
	protected FloatingActionButton N;
	CustomerCareRestClient O;
	ArrayList P;
	private MapsUIService R;
	private SettingsSubsystem S;
	private r T;
	private RobotErrorHelpContentList U;
	private String V;
	private BottomSheetBehavior W;
	private BottomSheetBehavior X;
	private String Y;
	private RobotMissionHistoryItem Z;
	IRobotApplication a;
	private String aa;
	private ViewPager ab;
	private t ac;
	private AlertDialog ad;
	private AlertDialog ae;
	private AlertDialog af;
	private RadioGroup ag;
	private int ah;
	private int ai;
	private ArrayList aj;
	private boolean ak;
	private AssetInfo al;
	private android.support.v4.view.ViewPager.e am;
	private a an;
	private SettingsUIServiceDataCallback ao;
	String b;
	int c;
	int d;
	ProgressBar e;
	protected NestedScrollView f;
	protected NestedScrollView g;
	protected LinearLayout h;
	protected ImageView i;
	protected CustomTextView j;
	protected CustomTextView k;
	protected ImageView l;
	protected ImageView m;
	protected LinearLayout n;
	TextView o;
	TextView t;
	TextView u;
	CustomTextView v;
	CustomTextView w;
	CustomTextView x;
	CustomTextView y;
	CustomTextView z;

	static 
	{
	//    0    0:return          
	}
}
