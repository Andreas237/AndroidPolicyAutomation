// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.opengl.GLSurfaceView;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.MapCustomizationErrors;
import com.irobot.core.MapCustomizationViewState;
import com.irobot.core.MapMenuOptions;
import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;
import com.irobot.core.MapsUIServiceData;
import com.irobot.core.MapsUIServiceDataCallback;
import com.irobot.core.MapsViewState;
import com.irobot.core.PlatformViewDimension;
import com.irobot.core.PlatformViewType;
import com.irobot.core.RegionType;
import com.irobot.core.RegionTypeTableItem;
import com.irobot.core.ScheduleDataState;
import com.irobot.core.ScheduleUIService;
import com.irobot.core.ScheduleUIServiceCommand;
import com.irobot.core.ScheduleUIServiceData;
import com.irobot.core.ScheduleUIServiceDataCallback;
import com.irobot.core.TitleSpecifier;
import com.irobot.core.ViewId;
import com.irobot.home.b.af;
import com.irobot.home.fragments.ak;
import com.irobot.home.fragments.au;
import com.irobot.home.util.f;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.PercentageRingView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.irobot.home:
//			PersistentMapActivity, TrainRobotActivity_, TroubleshootPersistentMapActivity_, NameFloorPlanActivity_, 
//			MapCustomizationCompleteActivity_, e, DuplicateRegionNameActivity_, PersistentMapFeedbackActivity_, 
//			EnterRegionTypeActivity_, IRobotApplication, OneMoreTrainingRunActivity_

public class MapCustomizationActivity extends PersistentMapActivity
	implements com.irobot.home.b.af.a, c.a
{
	private class a extends MapsUIServiceDataCallback
	{

		public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
		{
			if(mapsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.e(MapCustomizationActivity.t(), "null service data");
		//    2    4:invokestatic    #25  <Method String MapCustomizationActivity.t()>
		//    3    7:ldc1            #27  <String "null service data">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			if(!a.isFinishing())
		//*   6   13:aload_0         
		//*   7   14:getfield        #12  <Field MapCustomizationActivity a>
		//*   8   17:invokevirtual   #37  <Method boolean MapCustomizationActivity.isFinishing()>
		//*   9   20:ifne            369
			{
				if(a.isDestroyed())
		//*  10   23:aload_0         
		//*  11   24:getfield        #12  <Field MapCustomizationActivity a>
		//*  12   27:invokevirtual   #40  <Method boolean MapCustomizationActivity.isDestroyed()>
		//*  13   30:ifeq            34
					return;
		//   14   33:return          
				Object obj = ((Object) (mapsuiservicedata.getMapsViewStates()));
		//   15   34:aload_1         
		//   16   35:invokevirtual   #46  <Method ArrayList MapsUIServiceData.getMapsViewStates()>
		//   17   38:astore_2        
				String s1 = MapCustomizationActivity.t();
		//   18   39:invokestatic    #25  <Method String MapCustomizationActivity.t()>
		//   19   42:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
		//   20   43:new             #48  <Class StringBuilder>
		//   21   46:dup             
		//   22   47:invokespecial   #49  <Method void StringBuilder()>
		//   23   50:astore          4
				stringbuilder.append("View states: ");
		//   24   52:aload           4
		//   25   54:ldc1            #51  <String "View states: ">
		//   26   56:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   27   59:pop             
				stringbuilder.append(((ArrayList) (obj)).toString());
		//   28   60:aload           4
		//   29   62:aload_2         
		//   30   63:invokevirtual   #60  <Method String ArrayList.toString()>
		//   31   66:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   32   69:pop             
				com.irobot.home.util.o.a(s1, stringbuilder.toString());
		//   33   70:aload_3         
		//   34   71:aload           4
		//   35   73:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   36   76:invokestatic    #63  <Method void o.a(String, String)>
				obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   37   79:aload_2         
		//   38   80:invokevirtual   #67  <Method Iterator ArrayList.iterator()>
		//   39   83:astore_2        
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
		//   40   84:aload_2         
		//   41   85:invokeinterface #72  <Method boolean Iterator.hasNext()>
		//   42   90:ifeq            369
					MapsViewState mapsviewstate = (MapsViewState)((Iterator) (obj)).next();
		//   43   93:aload_2         
		//   44   94:invokeinterface #76  <Method Object Iterator.next()>
		//   45   99:checkcast       #78  <Class MapsViewState>
		//   46  102:astore_3        
					static class _cls28
					{

						static final int a[];
						static final int b[];
						static final int c[];
						static final int d[];
						static final int e[];

						static 
						{
							e = new int[TitleSpecifier.values().length];
						//    0    0:invokestatic    #22  <Method TitleSpecifier[] TitleSpecifier.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #24  <Field int[] e>
							try
							{
								e[TitleSpecifier.Loading.ordinal()] = 1;
						//    4    9:getstatic       #24  <Field int[] e>
						//    5   12:getstatic       #28  <Field TitleSpecifier TitleSpecifier.Loading>
						//    6   15:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #24  <Field int[] e>
						//*  10   23:getstatic       #35  <Field TitleSpecifier TitleSpecifier.Naming>
						//*  11   26:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #24  <Field int[] e>
						//*  15   34:getstatic       #38  <Field TitleSpecifier TitleSpecifier.PlaceholderMapName>
						//*  16   37:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:getstatic       #24  <Field int[] e>
						//*  20   45:getstatic       #41  <Field TitleSpecifier TitleSpecifier.MapName>
						//*  21   48:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:getstatic       #24  <Field int[] e>
						//*  25   56:getstatic       #44  <Field TitleSpecifier TitleSpecifier.DoorEdit>
						//*  26   59:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//*  27   62:iconst_5        
						//*  28   63:iastore         
						//*  29   64:getstatic       #24  <Field int[] e>
						//*  30   67:getstatic       #47  <Field TitleSpecifier TitleSpecifier.Labeling>
						//*  31   70:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//*  32   73:bipush          6
						//*  33   75:iastore         
						//*  34   76:getstatic       #24  <Field int[] e>
						//*  35   79:getstatic       #50  <Field TitleSpecifier TitleSpecifier.ReLabeling>
						//*  36   82:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//*  37   85:bipush          7
						//*  38   87:iastore         
						//*  39   88:getstatic       #24  <Field int[] e>
						//*  40   91:getstatic       #53  <Field TitleSpecifier TitleSpecifier.NoMap>
						//*  41   94:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
						//*  42   97:bipush          8
						//*  43   99:iastore         
						//*  44  100:invokestatic    #58  <Method MapCustomizationViewState[] MapCustomizationViewState.values()>
						//*  45  103:arraylength     
						//*  46  104:newarray        int[]
						//*  47  106:putstatic       #60  <Field int[] d>
						//*  48  109:getstatic       #60  <Field int[] d>
						//*  49  112:getstatic       #63  <Field MapCustomizationViewState MapCustomizationViewState.Loading>
						//*  50  115:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  51  118:iconst_1        
						//*  52  119:iastore         
						//*  53  120:getstatic       #60  <Field int[] d>
						//*  54  123:getstatic       #67  <Field MapCustomizationViewState MapCustomizationViewState.Saving>
						//*  55  126:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  56  129:iconst_2        
						//*  57  130:iastore         
						//*  58  131:getstatic       #60  <Field int[] d>
						//*  59  134:getstatic       #70  <Field MapCustomizationViewState MapCustomizationViewState.StillLearningMapPreview>
						//*  60  137:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  61  140:iconst_3        
						//*  62  141:iastore         
						//*  63  142:getstatic       #60  <Field int[] d>
						//*  64  145:getstatic       #73  <Field MapCustomizationViewState MapCustomizationViewState.SetupMapPreview>
						//*  65  148:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  66  151:iconst_4        
						//*  67  152:iastore         
						//*  68  153:getstatic       #60  <Field int[] d>
						//*  69  156:getstatic       #76  <Field MapCustomizationViewState MapCustomizationViewState.PendingNameMap>
						//*  70  159:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  71  162:iconst_5        
						//*  72  163:iastore         
						//*  73  164:getstatic       #60  <Field int[] d>
						//*  74  167:getstatic       #79  <Field MapCustomizationViewState MapCustomizationViewState.FullyLabeledMapPreview>
						//*  75  170:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  76  173:bipush          6
						//*  77  175:iastore         
						//*  78  176:getstatic       #60  <Field int[] d>
						//*  79  179:getstatic       #82  <Field MapCustomizationViewState MapCustomizationViewState.LabelingRoomSelection>
						//*  80  182:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  81  185:bipush          7
						//*  82  187:iastore         
						//*  83  188:getstatic       #60  <Field int[] d>
						//*  84  191:getstatic       #84  <Field MapCustomizationViewState MapCustomizationViewState.Labeling>
						//*  85  194:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  86  197:bipush          8
						//*  87  199:iastore         
						//*  88  200:getstatic       #60  <Field int[] d>
						//*  89  203:getstatic       #87  <Field MapCustomizationViewState MapCustomizationViewState.LabelingHasPendingSave>
						//*  90  206:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  91  209:bipush          9
						//*  92  211:iastore         
						//*  93  212:getstatic       #60  <Field int[] d>
						//*  94  215:getstatic       #89  <Field MapCustomizationViewState MapCustomizationViewState.DoorEdit>
						//*  95  218:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//*  96  221:bipush          10
						//*  97  223:iastore         
						//*  98  224:getstatic       #60  <Field int[] d>
						//*  99  227:getstatic       #92  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneAdd>
						//* 100  230:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//* 101  233:bipush          11
						//* 102  235:iastore         
						//* 103  236:getstatic       #60  <Field int[] d>
						//* 104  239:getstatic       #95  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneEdit>
						//* 105  242:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//* 106  245:bipush          12
						//* 107  247:iastore         
						//* 108  248:getstatic       #60  <Field int[] d>
						//* 109  251:getstatic       #98  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneSelected>
						//* 110  254:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//* 111  257:bipush          13
						//* 112  259:iastore         
						//* 113  260:getstatic       #60  <Field int[] d>
						//* 114  263:getstatic       #101 <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingValidSave>
						//* 115  266:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//* 116  269:bipush          14
						//* 117  271:iastore         
						//* 118  272:getstatic       #60  <Field int[] d>
						//* 119  275:getstatic       #104 <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingInvalidSave>
						//* 120  278:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//* 121  281:bipush          15
						//* 122  283:iastore         
						//* 123  284:getstatic       #60  <Field int[] d>
						//* 124  287:getstatic       #107 <Field MapCustomizationViewState MapCustomizationViewState.SetupComplete>
						//* 125  290:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
						//* 126  293:bipush          16
						//* 127  295:iastore         
						//* 128  296:invokestatic    #112 <Method MapCustomizationErrors[] MapCustomizationErrors.values()>
						//* 129  299:arraylength     
						//* 130  300:newarray        int[]
						//* 131  302:putstatic       #114 <Field int[] c>
						//* 132  305:getstatic       #114 <Field int[] c>
						//* 133  308:getstatic       #118 <Field MapCustomizationErrors MapCustomizationErrors.KozOverDock>
						//* 134  311:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
						//* 135  314:iconst_1        
						//* 136  315:iastore         
						//* 137  316:getstatic       #114 <Field int[] c>
						//* 138  319:getstatic       #122 <Field MapCustomizationErrors MapCustomizationErrors.RoomTooSmall>
						//* 139  322:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
						//* 140  325:iconst_2        
						//* 141  326:iastore         
						//* 142  327:getstatic       #114 <Field int[] c>
						//* 143  330:getstatic       #125 <Field MapCustomizationErrors MapCustomizationErrors.SaveTimedOut>
						//* 144  333:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
						//* 145  336:iconst_3        
						//* 146  337:iastore         
						//* 147  338:getstatic       #114 <Field int[] c>
						//* 148  341:getstatic       #128 <Field MapCustomizationErrors MapCustomizationErrors.SaveFloorNameTimedOut>
						//* 149  344:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
						//* 150  347:iconst_4        
						//* 151  348:iastore         
						//* 152  349:getstatic       #114 <Field int[] c>
						//* 153  352:getstatic       #131 <Field MapCustomizationErrors MapCustomizationErrors.EmptyMap>
						//* 154  355:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
						//* 155  358:iconst_5        
						//* 156  359:iastore         
						//* 157  360:getstatic       #114 <Field int[] c>
						//* 158  363:getstatic       #134 <Field MapCustomizationErrors MapCustomizationErrors.SegmentationTransferFailed>
						//* 159  366:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
						//* 160  369:bipush          6
						//* 161  371:iastore         
						//* 162  372:invokestatic    #139 <Method ScheduleDataState[] ScheduleDataState.values()>
						//* 163  375:arraylength     
						//* 164  376:newarray        int[]
						//* 165  378:putstatic       #141 <Field int[] b>
						//* 166  381:getstatic       #141 <Field int[] b>
						//* 167  384:getstatic       #145 <Field ScheduleDataState ScheduleDataState.CheckIfSchedulesContainsMapId>
						//* 168  387:invokevirtual   #146 <Method int ScheduleDataState.ordinal()>
						//* 169  390:iconst_1        
						//* 170  391:iastore         
						//* 171  392:invokestatic    #151 <Method MapsViewState[] MapsViewState.values()>
						//* 172  395:arraylength     
						//* 173  396:newarray        int[]
						//* 174  398:putstatic       #153 <Field int[] a>
						//* 175  401:getstatic       #153 <Field int[] a>
						//* 176  404:getstatic       #157 <Field MapsViewState MapsViewState.RegionSelectedToLabel>
						//* 177  407:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 178  410:iconst_1        
						//* 179  411:iastore         
						//* 180  412:getstatic       #153 <Field int[] a>
						//* 181  415:getstatic       #161 <Field MapsViewState MapsViewState.NoRegionSelectedToLabel>
						//* 182  418:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 183  421:iconst_2        
						//* 184  422:iastore         
						//* 185  423:getstatic       #153 <Field int[] a>
						//* 186  426:getstatic       #164 <Field MapsViewState MapsViewState.CustomizationViewState>
						//* 187  429:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 188  432:iconst_3        
						//* 189  433:iastore         
						//* 190  434:getstatic       #153 <Field int[] a>
						//* 191  437:getstatic       #167 <Field MapsViewState MapsViewState.ShowCustomizationOptionMenu>
						//* 192  440:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 193  443:iconst_4        
						//* 194  444:iastore         
						//* 195  445:getstatic       #153 <Field int[] a>
						//* 196  448:getstatic       #170 <Field MapsViewState MapsViewState.ShowCustomizationErrorMessage>
						//* 197  451:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 198  454:iconst_5        
						//* 199  455:iastore         
						//* 200  456:getstatic       #153 <Field int[] a>
						//* 201  459:getstatic       #173 <Field MapsViewState MapsViewState.ShowCustomizedMapName>
						//* 202  462:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 203  465:bipush          6
						//* 204  467:iastore         
						//* 205  468:getstatic       #153 <Field int[] a>
						//* 206  471:getstatic       #176 <Field MapsViewState MapsViewState.ShowEnterMapNameDialog>
						//* 207  474:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 208  477:bipush          7
						//* 209  479:iastore         
						//* 210  480:getstatic       #153 <Field int[] a>
						//* 211  483:getstatic       #179 <Field MapsViewState MapsViewState.ShowUnlabeledRegionCount>
						//* 212  486:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 213  489:bipush          8
						//* 214  491:iastore         
						//* 215  492:getstatic       #153 <Field int[] a>
						//* 216  495:getstatic       #182 <Field MapsViewState MapsViewState.MapDirty>
						//* 217  498:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 218  501:bipush          9
						//* 219  503:iastore         
						//* 220  504:getstatic       #153 <Field int[] a>
						//* 221  507:getstatic       #185 <Field MapsViewState MapsViewState.RegionNameAlreadyInUse>
						//* 222  510:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 223  513:bipush          10
						//* 224  515:iastore         
						//* 225  516:getstatic       #153 <Field int[] a>
						//* 226  519:getstatic       #188 <Field MapsViewState MapsViewState.DebugInfo>
						//* 227  522:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 228  525:bipush          11
						//* 229  527:iastore         
						//* 230  528:getstatic       #153 <Field int[] a>
						//* 231  531:getstatic       #191 <Field MapsViewState MapsViewState.UpdateViewTitle>
						//* 232  534:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 233  537:bipush          12
						//* 234  539:iastore         
						//* 235  540:getstatic       #153 <Field int[] a>
						//* 236  543:getstatic       #194 <Field MapsViewState MapsViewState.MapZoomReset>
						//* 237  546:invokevirtual   #158 <Method int MapsViewState.ordinal()>
						//* 238  549:bipush          13
						//* 239  551:iastore         
						//* 240  552:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//  241  553:astore_0        
							try
							{
								e[TitleSpecifier.Naming.ordinal()] = 2;
							}
						//* 242  554:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//  243  557:astore_0        
							try
							{
								e[TitleSpecifier.PlaceholderMapName.ordinal()] = 3;
							}
						//* 244  558:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//  245  561:astore_0        
							try
							{
								e[TitleSpecifier.MapName.ordinal()] = 4;
							}
						//* 246  562:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//  247  565:astore_0        
							try
							{
								e[TitleSpecifier.DoorEdit.ordinal()] = 5;
							}
						//* 248  566:goto            53
							catch(NoSuchFieldError nosuchfielderror4) { }
						//  249  569:astore_0        
							try
							{
								e[TitleSpecifier.Labeling.ordinal()] = 6;
							}
						//* 250  570:goto            64
							catch(NoSuchFieldError nosuchfielderror5) { }
						//  251  573:astore_0        
							try
							{
								e[TitleSpecifier.ReLabeling.ordinal()] = 7;
							}
						//* 252  574:goto            76
							catch(NoSuchFieldError nosuchfielderror6) { }
						//  253  577:astore_0        
							try
							{
								e[TitleSpecifier.NoMap.ordinal()] = 8;
							}
						//* 254  578:goto            88
							catch(NoSuchFieldError nosuchfielderror7) { }
						//  255  581:astore_0        
							d = new int[MapCustomizationViewState.values().length];
							try
							{
								d[MapCustomizationViewState.Loading.ordinal()] = 1;
							}
						//* 256  582:goto            100
							catch(NoSuchFieldError nosuchfielderror8) { }
						//  257  585:astore_0        
							try
							{
								d[MapCustomizationViewState.Saving.ordinal()] = 2;
							}
						//* 258  586:goto            120
							catch(NoSuchFieldError nosuchfielderror9) { }
						//  259  589:astore_0        
							try
							{
								d[MapCustomizationViewState.StillLearningMapPreview.ordinal()] = 3;
							}
						//* 260  590:goto            131
							catch(NoSuchFieldError nosuchfielderror10) { }
						//  261  593:astore_0        
							try
							{
								d[MapCustomizationViewState.SetupMapPreview.ordinal()] = 4;
							}
						//* 262  594:goto            142
							catch(NoSuchFieldError nosuchfielderror11) { }
						//  263  597:astore_0        
							try
							{
								d[MapCustomizationViewState.PendingNameMap.ordinal()] = 5;
							}
						//* 264  598:goto            153
							catch(NoSuchFieldError nosuchfielderror12) { }
						//  265  601:astore_0        
							try
							{
								d[MapCustomizationViewState.FullyLabeledMapPreview.ordinal()] = 6;
							}
						//* 266  602:goto            164
							catch(NoSuchFieldError nosuchfielderror13) { }
						//  267  605:astore_0        
							try
							{
								d[MapCustomizationViewState.LabelingRoomSelection.ordinal()] = 7;
							}
						//* 268  606:goto            176
							catch(NoSuchFieldError nosuchfielderror14) { }
						//  269  609:astore_0        
							try
							{
								d[MapCustomizationViewState.Labeling.ordinal()] = 8;
							}
						//* 270  610:goto            188
							catch(NoSuchFieldError nosuchfielderror15) { }
						//  271  613:astore_0        
							try
							{
								d[MapCustomizationViewState.LabelingHasPendingSave.ordinal()] = 9;
							}
						//* 272  614:goto            200
							catch(NoSuchFieldError nosuchfielderror16) { }
						//  273  617:astore_0        
							try
							{
								d[MapCustomizationViewState.DoorEdit.ordinal()] = 10;
							}
						//* 274  618:goto            212
							catch(NoSuchFieldError nosuchfielderror17) { }
						//  275  621:astore_0        
							try
							{
								d[MapCustomizationViewState.KeepOutZoneAdd.ordinal()] = 11;
							}
						//* 276  622:goto            224
							catch(NoSuchFieldError nosuchfielderror18) { }
						//  277  625:astore_0        
							try
							{
								d[MapCustomizationViewState.KeepOutZoneEdit.ordinal()] = 12;
							}
						//* 278  626:goto            236
							catch(NoSuchFieldError nosuchfielderror19) { }
						//  279  629:astore_0        
							try
							{
								d[MapCustomizationViewState.KeepOutZoneSelected.ordinal()] = 13;
							}
						//* 280  630:goto            248
							catch(NoSuchFieldError nosuchfielderror20) { }
						//  281  633:astore_0        
							try
							{
								d[MapCustomizationViewState.DoorEditHasPendingValidSave.ordinal()] = 14;
							}
						//* 282  634:goto            260
							catch(NoSuchFieldError nosuchfielderror21) { }
						//  283  637:astore_0        
							try
							{
								d[MapCustomizationViewState.DoorEditHasPendingInvalidSave.ordinal()] = 15;
							}
						//* 284  638:goto            272
							catch(NoSuchFieldError nosuchfielderror22) { }
						//  285  641:astore_0        
							try
							{
								d[MapCustomizationViewState.SetupComplete.ordinal()] = 16;
							}
						//* 286  642:goto            284
							catch(NoSuchFieldError nosuchfielderror23) { }
						//  287  645:astore_0        
							c = new int[MapCustomizationErrors.values().length];
							try
							{
								c[MapCustomizationErrors.KozOverDock.ordinal()] = 1;
							}
						//* 288  646:goto            296
							catch(NoSuchFieldError nosuchfielderror24) { }
						//  289  649:astore_0        
							try
							{
								c[MapCustomizationErrors.RoomTooSmall.ordinal()] = 2;
							}
						//* 290  650:goto            316
							catch(NoSuchFieldError nosuchfielderror25) { }
						//  291  653:astore_0        
							try
							{
								c[MapCustomizationErrors.SaveTimedOut.ordinal()] = 3;
							}
						//* 292  654:goto            327
							catch(NoSuchFieldError nosuchfielderror26) { }
						//  293  657:astore_0        
							try
							{
								c[MapCustomizationErrors.SaveFloorNameTimedOut.ordinal()] = 4;
							}
						//* 294  658:goto            338
							catch(NoSuchFieldError nosuchfielderror27) { }
						//  295  661:astore_0        
							try
							{
								c[MapCustomizationErrors.EmptyMap.ordinal()] = 5;
							}
						//* 296  662:goto            349
							catch(NoSuchFieldError nosuchfielderror28) { }
						//  297  665:astore_0        
							try
							{
								c[MapCustomizationErrors.SegmentationTransferFailed.ordinal()] = 6;
							}
						//* 298  666:goto            360
							catch(NoSuchFieldError nosuchfielderror29) { }
						//  299  669:astore_0        
							b = new int[ScheduleDataState.values().length];
							try
							{
								b[ScheduleDataState.CheckIfSchedulesContainsMapId.ordinal()] = 1;
							}
						//* 300  670:goto            372
							catch(NoSuchFieldError nosuchfielderror30) { }
						//  301  673:astore_0        
							a = new int[MapsViewState.values().length];
							try
							{
								a[MapsViewState.RegionSelectedToLabel.ordinal()] = 1;
							}
						//* 302  674:goto            392
							catch(NoSuchFieldError nosuchfielderror31) { }
						//  303  677:astore_0        
							try
							{
								a[MapsViewState.NoRegionSelectedToLabel.ordinal()] = 2;
							}
						//* 304  678:goto            412
							catch(NoSuchFieldError nosuchfielderror32) { }
						//  305  681:astore_0        
							try
							{
								a[MapsViewState.CustomizationViewState.ordinal()] = 3;
							}
						//* 306  682:goto            423
							catch(NoSuchFieldError nosuchfielderror33) { }
						//  307  685:astore_0        
							try
							{
								a[MapsViewState.ShowCustomizationOptionMenu.ordinal()] = 4;
							}
						//* 308  686:goto            434
							catch(NoSuchFieldError nosuchfielderror34) { }
						//  309  689:astore_0        
							try
							{
								a[MapsViewState.ShowCustomizationErrorMessage.ordinal()] = 5;
							}
						//* 310  690:goto            445
							catch(NoSuchFieldError nosuchfielderror35) { }
						//  311  693:astore_0        
							try
							{
								a[MapsViewState.ShowCustomizedMapName.ordinal()] = 6;
							}
						//* 312  694:goto            456
							catch(NoSuchFieldError nosuchfielderror36) { }
						//  313  697:astore_0        
							try
							{
								a[MapsViewState.ShowEnterMapNameDialog.ordinal()] = 7;
							}
						//* 314  698:goto            468
							catch(NoSuchFieldError nosuchfielderror37) { }
						//  315  701:astore_0        
							try
							{
								a[MapsViewState.ShowUnlabeledRegionCount.ordinal()] = 8;
							}
						//* 316  702:goto            480
							catch(NoSuchFieldError nosuchfielderror38) { }
						//  317  705:astore_0        
							try
							{
								a[MapsViewState.MapDirty.ordinal()] = 9;
							}
						//* 318  706:goto            492
							catch(NoSuchFieldError nosuchfielderror39) { }
						//  319  709:astore_0        
							try
							{
								a[MapsViewState.RegionNameAlreadyInUse.ordinal()] = 10;
							}
						//* 320  710:goto            504
							catch(NoSuchFieldError nosuchfielderror40) { }
						//  321  713:astore_0        
							try
							{
								a[MapsViewState.DebugInfo.ordinal()] = 11;
							}
						//* 322  714:goto            516
							catch(NoSuchFieldError nosuchfielderror41) { }
						//  323  717:astore_0        
							try
							{
								a[MapsViewState.UpdateViewTitle.ordinal()] = 12;
							}
						//* 324  718:goto            528
							catch(NoSuchFieldError nosuchfielderror42) { }
						//  325  721:astore_0        
							try
							{
								a[MapsViewState.MapZoomReset.ordinal()] = 13;
							}
						//* 326  722:goto            540
							catch(NoSuchFieldError nosuchfielderror43) { }
						//  327  725:astore_0        
						//* 328  726:return          
						}
					}

					switch(com.irobot.home._cls28.a[mapsviewstate.ordinal()])
		//*  47  103:getstatic       #83  <Field int[] com.irobot.home.MapCustomizationActivity$28.a>
		//*  48  106:aload_3         
		//*  49  107:invokevirtual   #87  <Method int MapsViewState.ordinal()>
		//*  50  110:iaload          
					{
		//*  51  111:tableswitch     1 13: default 176
		//		               1 351
		//		               2 341
		//		               3 327
		//		               4 313
		//		               5 299
		//		               6 285
		//		               7 275
		//		               8 257
		//		               9 243
		//		               10 225
		//		               11 207
		//		               12 193
		//		               13 179
		//*  52  176:goto            84
					case 13: // '\r'
						MapCustomizationActivity.b(a, mapsuiservicedata.getMapZoomResetButtonState());
		//   53  179:aload_0         
		//   54  180:getfield        #12  <Field MapCustomizationActivity a>
		//   55  183:aload_1         
		//   56  184:invokevirtual   #90  <Method boolean MapsUIServiceData.getMapZoomResetButtonState()>
		//   57  187:invokestatic    #94  <Method void MapCustomizationActivity.b(MapCustomizationActivity, boolean)>
						break;

		//*  58  190:goto            84
					case 12: // '\f'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getViewTitle());
		//   59  193:aload_0         
		//   60  194:getfield        #12  <Field MapCustomizationActivity a>
		//   61  197:aload_1         
		//   62  198:invokevirtual   #98  <Method TitleSpecifier MapsUIServiceData.getViewTitle()>
		//   63  201:invokestatic    #101 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, TitleSpecifier)>
						break;

		//*  64  204:goto            84
					case 11: // '\013'
						MapCustomizationActivity.b(a, mapsuiservicedata.getDebugInfoMapId(), mapsuiservicedata.getDebugInfoVersion());
		//   65  207:aload_0         
		//   66  208:getfield        #12  <Field MapCustomizationActivity a>
		//   67  211:aload_1         
		//   68  212:invokevirtual   #104 <Method String MapsUIServiceData.getDebugInfoMapId()>
		//   69  215:aload_1         
		//   70  216:invokevirtual   #107 <Method String MapsUIServiceData.getDebugInfoVersion()>
		//   71  219:invokestatic    #110 <Method void MapCustomizationActivity.b(MapCustomizationActivity, String, String)>
						break;

		//*  72  222:goto            84
					case 10: // '\n'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getUsedRegionName(), mapsuiservicedata.getUsedRegionId());
		//   73  225:aload_0         
		//   74  226:getfield        #12  <Field MapCustomizationActivity a>
		//   75  229:aload_1         
		//   76  230:invokevirtual   #113 <Method String MapsUIServiceData.getUsedRegionName()>
		//   77  233:aload_1         
		//   78  234:invokevirtual   #116 <Method String MapsUIServiceData.getUsedRegionId()>
		//   79  237:invokestatic    #118 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, String, String)>
						break;

		//*  80  240:goto            84
					case 9: // '\t'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getIsMapDirty());
		//   81  243:aload_0         
		//   82  244:getfield        #12  <Field MapCustomizationActivity a>
		//   83  247:aload_1         
		//   84  248:invokevirtual   #121 <Method boolean MapsUIServiceData.getIsMapDirty()>
		//   85  251:invokestatic    #123 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, boolean)>
						break;

		//*  86  254:goto            84
					case 8: // '\b'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getUnlabeledRegionCount(), mapsuiservicedata.getTotalRegionCount());
		//   87  257:aload_0         
		//   88  258:getfield        #12  <Field MapCustomizationActivity a>
		//   89  261:aload_1         
		//   90  262:invokevirtual   #126 <Method int MapsUIServiceData.getUnlabeledRegionCount()>
		//   91  265:aload_1         
		//   92  266:invokevirtual   #129 <Method int MapsUIServiceData.getTotalRegionCount()>
		//   93  269:invokestatic    #132 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, int, int)>
						break;

		//*  94  272:goto            84
					case 7: // '\007'
						MapCustomizationActivity.b(a);
		//   95  275:aload_0         
		//   96  276:getfield        #12  <Field MapCustomizationActivity a>
		//   97  279:invokestatic    #134 <Method void MapCustomizationActivity.b(MapCustomizationActivity)>
						break;

		//*  98  282:goto            84
					case 6: // '\006'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getCustomizedMapName());
		//   99  285:aload_0         
		//  100  286:getfield        #12  <Field MapCustomizationActivity a>
		//  101  289:aload_1         
		//  102  290:invokevirtual   #137 <Method String MapsUIServiceData.getCustomizedMapName()>
		//  103  293:invokestatic    #140 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, String)>
						break;

		//* 104  296:goto            84
					case 5: // '\005'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getCustomizationErrorMessage());
		//  105  299:aload_0         
		//  106  300:getfield        #12  <Field MapCustomizationActivity a>
		//  107  303:aload_1         
		//  108  304:invokevirtual   #144 <Method MapCustomizationErrors MapsUIServiceData.getCustomizationErrorMessage()>
		//  109  307:invokestatic    #147 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, MapCustomizationErrors)>
						break;

		//* 110  310:goto            84
					case 4: // '\004'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getCustomizationOptionsMenu());
		//  111  313:aload_0         
		//  112  314:getfield        #12  <Field MapCustomizationActivity a>
		//  113  317:aload_1         
		//  114  318:invokevirtual   #150 <Method ArrayList MapsUIServiceData.getCustomizationOptionsMenu()>
		//  115  321:invokestatic    #153 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, ArrayList)>
						break;

		//* 116  324:goto            84
					case 3: // '\003'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getMapCustomizationViewState());
		//  117  327:aload_0         
		//  118  328:getfield        #12  <Field MapCustomizationActivity a>
		//  119  331:aload_1         
		//  120  332:invokevirtual   #157 <Method MapCustomizationViewState MapsUIServiceData.getMapCustomizationViewState()>
		//  121  335:invokestatic    #160 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, MapCustomizationViewState)>
						break;

		//* 122  338:goto            84
					case 2: // '\002'
						com.irobot.home.MapCustomizationActivity.a(a);
		//  123  341:aload_0         
		//  124  342:getfield        #12  <Field MapCustomizationActivity a>
		//  125  345:invokestatic    #162 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity)>
						break;

		//* 126  348:goto            84
					case 1: // '\001'
						com.irobot.home.MapCustomizationActivity.a(a, mapsuiservicedata.getSelectedRegionLabelName(), mapsuiservicedata.getSelectedRegionLabelCount());
		//  127  351:aload_0         
		//  128  352:getfield        #12  <Field MapCustomizationActivity a>
		//  129  355:aload_1         
		//  130  356:invokevirtual   #165 <Method String MapsUIServiceData.getSelectedRegionLabelName()>
		//  131  359:aload_1         
		//  132  360:invokevirtual   #168 <Method int MapsUIServiceData.getSelectedRegionLabelCount()>
		//  133  363:invokestatic    #171 <Method void com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, String, int)>
						break;
					}
				} while(true);
		//  134  366:goto            84
			}
		//  135  369:return          
		}

		final MapCustomizationActivity a;

		private a()
		{
			a = MapCustomizationActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MapCustomizationActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void MapsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public MapCustomizationActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #217 <Method void PersistentMapActivity()>
		e = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #219 <Field boolean e>
		Y = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #221 <Field boolean Y>
		ag = ((ScheduleUIServiceDataCallback) (new ScheduleUIServiceDataCallback() {

			public void onScheduleUIServiceDataChanged(ScheduleUIServiceData scheduleuiservicedata)
			{
				Iterator iterator = scheduleuiservicedata.getDataStates().iterator();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList ScheduleUIServiceData.getDataStates()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//    4    8:aload_2         
			//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   14:ifeq            66
					ScheduleDataState scheduledatastate = (ScheduleDataState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class ScheduleDataState>
			//   10   26:astore_3        
					com.irobot.home.util.o.a(MapCustomizationActivity.t(), scheduledatastate.name());
			//   11   27:invokestatic    #46  <Method String MapCustomizationActivity.t()>
			//   12   30:aload_3         
			//   13   31:invokevirtual   #49  <Method String ScheduleDataState.name()>
			//   14   34:invokestatic    #54  <Method void o.a(String, String)>
					if(_cls28.b[scheduledatastate.ordinal()] == 1)
			//*  15   37:getstatic       #60  <Field int[] MapCustomizationActivity$28.b>
			//*  16   40:aload_3         
			//*  17   41:invokevirtual   #64  <Method int ScheduleDataState.ordinal()>
			//*  18   44:iaload          
			//*  19   45:iconst_1        
			//*  20   46:icmpeq          52
			//*  21   49:goto            8
						MapCustomizationActivity.c(a, scheduleuiservicedata.getCheckIfSchedulesContainsMapId());
			//   22   52:aload_0         
			//   23   53:getfield        #12  <Field MapCustomizationActivity a>
			//   24   56:aload_1         
			//   25   57:invokevirtual   #67  <Method boolean ScheduleUIServiceData.getCheckIfSchedulesContainsMapId()>
			//   26   60:invokestatic    #71  <Method void MapCustomizationActivity.c(MapCustomizationActivity, boolean)>
				} while(true);
			//   27   63:goto            8
			//   28   66:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    8   14:aload_0         
	//    9   15:new             #10  <Class MapCustomizationActivity$1>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #224 <Method void MapCustomizationActivity$1(MapCustomizationActivity)>
	//   13   23:putfield        #226 <Field ScheduleUIServiceDataCallback ag>
	//   14   26:return          
	}

	private void A()
	{
		(new android.support.v7.app.a.a(((android.content.Context) (this)))).a(0x7f0f02ea).b(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).a(0x7f0f086c, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				((OneMoreTrainingRunActivity_.a)com.irobot.home.OneMoreTrainingRunActivity_.a(((android.content.Context) (a))).g(0x4000000)).a();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MapCustomizationActivity a>
			//    2    4:invokestatic    #27  <Method OneMoreTrainingRunActivity_$a com.irobot.home.OneMoreTrainingRunActivity_.a(android.content.Context)>
			//    3    7:ldc1            #28  <Int 0x4000000>
			//    4    9:invokevirtual   #34  <Method org.androidannotations.api.a.d OneMoreTrainingRunActivity_$a.g(int)>
			//    5   12:checkcast       #30  <Class OneMoreTrainingRunActivity_$a>
			//    6   15:invokevirtual   #37  <Method org.androidannotations.api.a.e com.irobot.home.OneMoreTrainingRunActivity_$a.a()>
			//    7   18:pop             
			//    8   19:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).c();
	//    0    0:new             #228 <Class android.support.v7.app.a$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//    4    8:ldc1            #232 <Int 0x7f0f02ea>
	//    5   10:invokevirtual   #235 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int)>
	//    6   13:ldc1            #236 <Int 0x7f0f017d>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #239 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int, android.content.DialogInterface$OnClickListener)>
	//    9   19:ldc1            #240 <Int 0x7f0f086c>
	//   10   21:new             #18  <Class MapCustomizationActivity$13>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #241 <Method void MapCustomizationActivity$13(MapCustomizationActivity)>
	//   14   29:invokevirtual   #243 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   15   32:invokevirtual   #246 <Method a android.support.v7.app.a$a.c()>
	//   16   35:pop             
	//   17   36:return          
	}

	private void B()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f025a).setMessage(0x7f0f0259).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.ArchiveMap, ((MapsUIServiceData) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MapCustomizationActivity a>
			//    2    4:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
			//    3    7:getstatic       #32  <Field MapsUIServiceCommand MapsUIServiceCommand.ArchiveMap>
			//    4   10:aconst_null     
			//    5   11:invokevirtual   #38  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				a.onBackPressed();
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field MapCustomizationActivity a>
			//    8   18:invokevirtual   #41  <Method void MapCustomizationActivity.onBackPressed()>
			//    9   21:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f04d3, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #248 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #249 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc1            #250 <Int 0x7f0f025a>
	//    5   10:invokevirtual   #254 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   13:ldc1            #255 <Int 0x7f0f0259>
	//    7   15:invokevirtual   #258 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   18:ldc2            #259 <Int 0x7f0f0986>
	//    9   21:new             #20  <Class MapCustomizationActivity$14>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #260 <Method void MapCustomizationActivity$14(MapCustomizationActivity)>
	//   13   29:invokevirtual   #264 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   14   32:ldc2            #265 <Int 0x7f0f04d3>
	//   15   35:aconst_null     
	//   16   36:invokevirtual   #268 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   17   39:invokevirtual   #272 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   18   42:pop             
	//   19   43:return          
	}

	private void C()
	{
		if(T != 0 && V != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field int T>
	//*   2    4:ifeq            100
	//*   3    7:aload_0         
	//*   4    8:getfield        #276 <Field int V>
	//*   5   11:ifeq            100
		{
			Object obj = ((Object) (new PlatformViewDimension(0.0D, 0.0D, U, T)));
	//    6   14:new             #278 <Class PlatformViewDimension>
	//    7   17:dup             
	//    8   18:dconst_0        
	//    9   19:dconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #280 <Field int U>
	//   12   24:i2d             
	//   13   25:aload_0         
	//   14   26:getfield        #274 <Field int T>
	//   15   29:i2d             
	//   16   30:invokespecial   #283 <Method void PlatformViewDimension(double, double, double, double)>
	//   17   33:astore_2        
			PlatformViewDimension platformviewdimension = new PlatformViewDimension(0.0D, 0.0D, W, V);
	//   18   34:new             #278 <Class PlatformViewDimension>
	//   19   37:dup             
	//   20   38:dconst_0        
	//   21   39:dconst_0        
	//   22   40:aload_0         
	//   23   41:getfield        #285 <Field int W>
	//   24   44:i2d             
	//   25   45:aload_0         
	//   26   46:getfield        #276 <Field int V>
	//   27   49:i2d             
	//   28   50:invokespecial   #283 <Method void PlatformViewDimension(double, double, double, double)>
	//   29   53:astore_3        
			HashMap hashmap = new HashMap();
	//   30   54:new             #167 <Class HashMap>
	//   31   57:dup             
	//   32   58:invokespecial   #170 <Method void HashMap()>
	//   33   61:astore_1        
			hashmap.put(((Object) (PlatformViewType.PersistentMapLabelContainer)), obj);
	//   34   62:aload_1         
	//   35   63:getstatic       #291 <Field PlatformViewType PlatformViewType.PersistentMapLabelContainer>
	//   36   66:aload_2         
	//   37   67:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   38   70:pop             
			hashmap.put(((Object) (PlatformViewType.PersistentMapMapViewContainer)), ((Object) (platformviewdimension)));
	//   39   71:aload_1         
	//   40   72:getstatic       #295 <Field PlatformViewType PlatformViewType.PersistentMapMapViewContainer>
	//   41   75:aload_3         
	//   42   76:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   43   79:pop             
			obj = ((Object) (MapsUIServiceData.create()));
	//   44   80:invokestatic    #301 <Method MapsUIServiceData MapsUIServiceData.create()>
	//   45   83:astore_2        
			((MapsUIServiceData) (obj)).setPlatformViewDimensions(hashmap);
	//   46   84:aload_2         
	//   47   85:aload_1         
	//   48   86:invokevirtual   #305 <Method void MapsUIServiceData.setPlatformViewDimensions(HashMap)>
			M.sendCommand(MapsUIServiceCommand.SetPlatformViewDimensions, ((MapsUIServiceData) (obj)));
	//   49   89:aload_0         
	//   50   90:getfield        #307 <Field MapsUIService M>
	//   51   93:getstatic       #313 <Field MapsUIServiceCommand MapsUIServiceCommand.SetPlatformViewDimensions>
	//   52   96:aload_2         
	//   53   97:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		}
	//   54  100:return          
	}

	private void D()
	{
		com.irobot.home.TrainRobotActivity_.a(((android.content.Context) (this))).a(true).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #324 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #329 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_$a.a(boolean)>
	//    4    8:invokevirtual   #332 <Method org.androidannotations.api.a.e com.irobot.home.TrainRobotActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	private void E()
	{
		com.irobot.home.TrainRobotActivity_.a(((android.content.Context) (this))).a(false).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #324 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_.a(android.content.Context)>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #329 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_$a.a(boolean)>
	//    4    8:invokevirtual   #332 <Method org.androidannotations.api.a.e com.irobot.home.TrainRobotActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	private void F()
	{
		com.irobot.home.TroubleshootPersistentMapActivity_.a(((android.content.Context) (this))).b(d).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #337 <Method TroubleshootPersistentMapActivity_$a com.irobot.home.TroubleshootPersistentMapActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #339 <Field int d>
	//    4    8:invokevirtual   #344 <Method TroubleshootPersistentMapActivity_$a TroubleshootPersistentMapActivity_$a.b(int)>
	//    5   11:invokevirtual   #345 <Method org.androidannotations.api.a.e com.irobot.home.TroubleshootPersistentMapActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	private void G()
	{
		if(X.a() == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #348 <Field BottomSheetBehavior X>
	//*   2    4:invokevirtual   #353 <Method int BottomSheetBehavior.a()>
	//*   3    7:iconst_3        
	//*   4    8:icmpne          27
		{
			X.a(true);
	//    5   11:aload_0         
	//    6   12:getfield        #348 <Field BottomSheetBehavior X>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #356 <Method void BottomSheetBehavior.a(boolean)>
			X.b(5);
	//    9   19:aload_0         
	//   10   20:getfield        #348 <Field BottomSheetBehavior X>
	//   11   23:iconst_5        
	//   12   24:invokevirtual   #359 <Method void BottomSheetBehavior.b(int)>
		}
		k.a(0);
	//   13   27:aload_0         
	//   14   28:getfield        #361 <Field RecyclerView k>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #365 <Method void RecyclerView.a(int)>
	//   17   35:return          
	}

	private void H()
	{
	//    0    0:return          
	}

	private void I()
	{
		Object obj = ((Object) (LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b00a1, ((android.view.ViewGroup) (null)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #371 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    2    4:ldc2            #372 <Int 0x7f0b00a1>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #376 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   11:astore_2        
		EditText edittext = (EditText)((View) (obj)).findViewById(0x7f090277);
	//    6   12:aload_2         
	//    7   13:ldc2            #377 <Int 0x7f090277>
	//    8   16:invokevirtual   #383 <Method View View.findViewById(int)>
	//    9   19:checkcast       #385 <Class EditText>
	//   10   22:astore_1        
		obj = ((Object) ((new android.support.v7.app.a.a(((android.content.Context) (this)))).b(((View) (obj))).a(false).a(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(edittext, ((View) (obj))) {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (MapsUIServiceData.create()));
			//    0    0:invokestatic    #36  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    1    3:astore_1        
				((MapsUIServiceData) (dialoginterface)).setNewMapName(((Object) (a.getText())).toString());
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #23  <Field EditText a>
			//    5    9:invokevirtual   #42  <Method Editable EditText.getText()>
			//    6   12:invokevirtual   #46  <Method String Object.toString()>
			//    7   15:invokevirtual   #50  <Method void MapsUIServiceData.setNewMapName(String)>
				MapCustomizationActivity.e(c).sendCommand(MapsUIServiceCommand.NewMapName, ((MapsUIServiceData) (dialoginterface)));
			//    8   18:aload_0         
			//    9   19:getfield        #21  <Field MapCustomizationActivity c>
			//   10   22:invokestatic    #54  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
			//   11   25:getstatic       #60  <Field MapsUIServiceCommand MapsUIServiceCommand.NewMapName>
			//   12   28:aload_1         
			//   13   29:invokevirtual   #66  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				dialoginterface = ((DialogInterface) ((InputMethodManager)c.getSystemService("input_method")));
			//   14   32:aload_0         
			//   15   33:getfield        #21  <Field MapCustomizationActivity c>
			//   16   36:ldc1            #68  <String "input_method">
			//   17   38:invokevirtual   #72  <Method Object MapCustomizationActivity.getSystemService(String)>
			//   18   41:checkcast       #74  <Class InputMethodManager>
			//   19   44:astore_1        
				if(dialoginterface != null)
			//*  20   45:aload_1         
			//*  21   46:ifnull          62
					((InputMethodManager) (dialoginterface)).hideSoftInputFromWindow(b.getWindowToken(), 2);
			//   22   49:aload_1         
			//   23   50:aload_0         
			//   24   51:getfield        #25  <Field View b>
			//   25   54:invokevirtual   #80  <Method android.os.IBinder View.getWindowToken()>
			//   26   57:iconst_2        
			//   27   58:invokevirtual   #84  <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
			//   28   61:pop             
			//   29   62:return          
			}

			final EditText a;
			final View b;
			final MapCustomizationActivity c;

			
			{
				c = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MapCustomizationActivity c>
				a = edittext;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field EditText a>
				b = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field View b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
).b()));
	//   11   23:new             #228 <Class android.support.v7.app.a$a>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #388 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(View)>
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #391 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(boolean)>
	//   19   39:ldc2            #392 <Int 0x7f0f05bb>
	//   20   42:new             #46  <Class MapCustomizationActivity$25>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokespecial   #395 <Method void MapCustomizationActivity$25(MapCustomizationActivity, EditText, View)>
	//   26   52:invokevirtual   #243 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   27   55:invokevirtual   #397 <Method a android.support.v7.app.a$a.b()>
	//   28   58:astore_2        
		((android.support.v7.app.a) (obj)).show();
	//   29   59:aload_2         
	//   30   60:invokevirtual   #401 <Method void a.show()>
		edittext.addTextChangedListener(new TextWatcher(((android.support.v7.app.a) (obj))) {

			public void afterTextChanged(Editable editable)
			{
				boolean flag;
				if(TextUtils.isEmpty(((CharSequence) (editable))))
			//*   0    0:aload_1         
			//*   1    1:invokestatic    #32  <Method boolean TextUtils.isEmpty(CharSequence)>
			//*   2    4:ifeq            24
				{
					editable = ((Editable) (a.a(-1)));
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field a a>
			//    5   11:iconst_m1       
			//    6   12:invokevirtual   #37  <Method Button a.a(int)>
			//    7   15:astore_1        
					flag = false;
			//    8   16:iconst_0        
			//    9   17:istore_2        
				} else
			//*  10   18:aload_1         
			//*  11   19:iload_2         
			//*  12   20:invokevirtual   #43  <Method void Button.setEnabled(boolean)>
			//*  13   23:return          
				{
					editable = ((Editable) (a.a(-1)));
			//   14   24:aload_0         
			//   15   25:getfield        #21  <Field a a>
			//   16   28:iconst_m1       
			//   17   29:invokevirtual   #37  <Method Button a.a(int)>
			//   18   32:astore_1        
					flag = true;
			//   19   33:iconst_1        
			//   20   34:istore_2        
				}
				((Button) (editable)).setEnabled(flag);
			//*  21   35:goto            18
			}

			public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
			{
			//    0    0:return          
			}

			final android.support.v7.app.a a;
			final MapCustomizationActivity b;

			
			{
				b = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MapCustomizationActivity b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   31   63:aload_1         
	//   32   64:new             #48  <Class MapCustomizationActivity$26>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:aload_2         
	//   36   70:invokespecial   #404 <Method void MapCustomizationActivity$26(MapCustomizationActivity, a)>
	//   37   73:invokevirtual   #408 <Method void EditText.addTextChangedListener(TextWatcher)>
	//   38   76:return          
	}

	private void J()
	{
		a(getString(0x7f0f042f));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc2            #409 <Int 0x7f0f042f>
	//    3    5:invokevirtual   #413 <Method String getString(int)>
	//    4    8:invokevirtual   #416 <Method void a(String)>
		t.setVisibility(4);
	//    5   11:aload_0         
	//    6   12:getfield        #418 <Field CustomTextView t>
	//    7   15:iconst_4        
	//    8   16:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
	//    9   19:return          
	}

	private void K()
	{
		a(getString(0x7f0f07be));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc2            #424 <Int 0x7f0f07be>
	//    3    5:invokevirtual   #413 <Method String getString(int)>
	//    4    8:invokevirtual   #416 <Method void a(String)>
		t.setVisibility(4);
	//    5   11:aload_0         
	//    6   12:getfield        #418 <Field CustomTextView t>
	//    7   15:iconst_4        
	//    8   16:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
	//    9   19:return          
	}

	private void L()
	{
		e(getString(0x7f0f032f));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc2            #425 <Int 0x7f0f032f>
	//    3    5:invokevirtual   #413 <Method String getString(int)>
	//    4    8:invokevirtual   #427 <Method void e(String)>
		Object obj = ((Object) (com.irobot.home.util.j.j().a().getName()));
	//    5   11:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//    6   14:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//    7   17:invokevirtual   #443 <Method String AssetInfo.getName()>
	//    8   20:astore_1        
		y.setVisibility(0);
	//    9   21:aload_0         
	//   10   22:getfield        #445 <Field PercentageRingView y>
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #448 <Method void PercentageRingView.setVisibility(int)>
		z.setVisibility(0);
	//   13   29:aload_0         
	//   14   30:getfield        #450 <Field CustomTextView z>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		l.setVisibility(0);
	//   17   37:aload_0         
	//   18   38:getfield        #452 <Field ImageView l>
	//   19   41:iconst_0        
	//   20   42:invokevirtual   #455 <Method void ImageView.setVisibility(int)>
		y.setRingFillPercentile(d);
	//   21   45:aload_0         
	//   22   46:getfield        #445 <Field PercentageRingView y>
	//   23   49:aload_0         
	//   24   50:getfield        #339 <Field int d>
	//   25   53:invokevirtual   #458 <Method void PercentageRingView.setRingFillPercentile(int)>
		y.setRingLabelText(getResources().getString(0x7f0f0335, new Object[] {
			Integer.valueOf(d)
		}));
	//   26   56:aload_0         
	//   27   57:getfield        #445 <Field PercentageRingView y>
	//   28   60:aload_0         
	//   29   61:invokevirtual   #462 <Method Resources getResources()>
	//   30   64:ldc2            #463 <Int 0x7f0f0335>
	//   31   67:iconst_1        
	//   32   68:anewarray       Object[]
	//   33   71:dup             
	//   34   72:iconst_0        
	//   35   73:aload_0         
	//   36   74:getfield        #339 <Field int d>
	//   37   77:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   38   80:aastore         
	//   39   81:invokevirtual   #470 <Method String Resources.getString(int, Object[])>
	//   40   84:invokevirtual   #473 <Method void PercentageRingView.setRingLabelText(String)>
		z.setText(((CharSequence) (getResources().getString(0x7f0f0428, new Object[] {
			obj
		}))));
	//   41   87:aload_0         
	//   42   88:getfield        #450 <Field CustomTextView z>
	//   43   91:aload_0         
	//   44   92:invokevirtual   #462 <Method Resources getResources()>
	//   45   95:ldc2            #474 <Int 0x7f0f0428>
	//   46   98:iconst_1        
	//   47   99:anewarray       Object[]
	//   48  102:dup             
	//   49  103:iconst_0        
	//   50  104:aload_1         
	//   51  105:aastore         
	//   52  106:invokevirtual   #470 <Method String Resources.getString(int, Object[])>
	//   53  109:invokevirtual   #478 <Method void CustomTextView.setText(CharSequence)>
		obj = ((Object) ((android.support.design.widget.CoordinatorLayout.c)F.getLayoutParams()));
	//   54  112:aload_0         
	//   55  113:getfield        #480 <Field FloatingActionButton F>
	//   56  116:invokevirtual   #486 <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//   57  119:checkcast       #488 <Class android.support.design.widget.CoordinatorLayout$c>
	//   58  122:astore_1        
		((android.support.design.widget.CoordinatorLayout.c) (obj)).a(0x7f090043);
	//   59  123:aload_1         
	//   60  124:ldc2            #489 <Int 0x7f090043>
	//   61  127:invokevirtual   #490 <Method void android.support.design.widget.CoordinatorLayout$c.a(int)>
		F.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   62  130:aload_0         
	//   63  131:getfield        #480 <Field FloatingActionButton F>
	//   64  134:aload_1         
	//   65  135:invokevirtual   #494 <Method void FloatingActionButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(!(G instanceof ak))
	//*  66  138:aload_0         
	//*  67  139:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  68  142:instanceof      #499 <Class ak>
	//*  69  145:ifne            168
			a(((android.support.v4.app.Fragment) (ak.a(M.getServiceData().getMapRenderer(), false, true, ((c.a) (this))))));
	//   70  148:aload_0         
	//   71  149:aload_0         
	//   72  150:getfield        #307 <Field MapsUIService M>
	//   73  153:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   74  156:invokevirtual   #506 <Method com.irobot.core.RenderPresenter MapsUIServiceData.getMapRenderer()>
	//   75  159:iconst_0        
	//   76  160:iconst_1        
	//   77  161:aload_0         
	//   78  162:invokestatic    #509 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   79  165:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsMapPreview, com.irobot.home.util.j.j().a());
	//   80  168:invokestatic    #518 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   81  171:getstatic       #524 <Field ViewId ViewId.PMapsMapPreview>
	//   82  174:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//   83  177:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//   84  180:invokevirtual   #528 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   85  183:return          
	}

	private void M()
	{
		e(getString(0x7f0f032f));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc2            #425 <Int 0x7f0f032f>
	//    3    5:invokevirtual   #413 <Method String getString(int)>
	//    4    8:invokevirtual   #427 <Method void e(String)>
		u.setVisibility(0);
	//    5   11:aload_0         
	//    6   12:getfield        #530 <Field CustomTextView u>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		x.setVisibility(0);
	//    9   19:aload_0         
	//   10   20:getfield        #532 <Field CustomTextView x>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		l.setVisibility(0);
	//   13   27:aload_0         
	//   14   28:getfield        #452 <Field ImageView l>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #455 <Method void ImageView.setVisibility(int)>
		w.setVisibility(0);
	//   17   35:aload_0         
	//   18   36:getfield        #534 <Field CustomTextView w>
	//   19   39:iconst_0        
	//   20   40:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		f.setVisibility(0);
	//   21   43:aload_0         
	//   22   44:getfield        #536 <Field CustomButton f>
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #539 <Method void CustomButton.setVisibility(int)>
		if(!(G instanceof ak))
	//*  25   51:aload_0         
	//*  26   52:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  27   55:instanceof      #499 <Class ak>
	//*  28   58:ifne            81
			a(((android.support.v4.app.Fragment) (ak.a(M.getServiceData().getMapRenderer(), false, true, ((c.a) (this))))));
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #307 <Field MapsUIService M>
	//   32   66:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   33   69:invokevirtual   #506 <Method com.irobot.core.RenderPresenter MapsUIServiceData.getMapRenderer()>
	//   34   72:iconst_0        
	//   35   73:iconst_1        
	//   36   74:aload_0         
	//   37   75:invokestatic    #509 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   38   78:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
		android.support.design.widget.CoordinatorLayout.c c1 = (android.support.design.widget.CoordinatorLayout.c)F.getLayoutParams();
	//   39   81:aload_0         
	//   40   82:getfield        #480 <Field FloatingActionButton F>
	//   41   85:invokevirtual   #486 <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//   42   88:checkcast       #488 <Class android.support.design.widget.CoordinatorLayout$c>
	//   43   91:astore_1        
		c1.a(0x7f090403);
	//   44   92:aload_1         
	//   45   93:ldc2            #540 <Int 0x7f090403>
	//   46   96:invokevirtual   #490 <Method void android.support.design.widget.CoordinatorLayout$c.a(int)>
		F.setLayoutParams(((android.view.ViewGroup.LayoutParams) (c1)));
	//   47   99:aload_0         
	//   48  100:getfield        #480 <Field FloatingActionButton F>
	//   49  103:aload_1         
	//   50  104:invokevirtual   #494 <Method void FloatingActionButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsMapReady, com.irobot.home.util.j.j().a());
	//   51  107:invokestatic    #518 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   52  110:getstatic       #543 <Field ViewId ViewId.PMapsMapReady>
	//   53  113:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//   54  116:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//   55  119:invokevirtual   #528 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   56  122:return          
	}

	private void N()
	{
		com.irobot.home.NameFloorPlanActivity_.a(((android.content.Context) (this))).a(getString(0x7f0f04cf)).a(false).a(4);
	//    0    0:aload_0         
	//    1    1:invokestatic    #548 <Method NameFloorPlanActivity_$a com.irobot.home.NameFloorPlanActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:ldc2            #549 <Int 0x7f0f04cf>
	//    4    8:invokevirtual   #413 <Method String getString(int)>
	//    5   11:invokevirtual   #554 <Method NameFloorPlanActivity_$a com.irobot.home.NameFloorPlanActivity_$a.a(String)>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #557 <Method NameFloorPlanActivity_$a com.irobot.home.NameFloorPlanActivity_$a.a(boolean)>
	//    8   18:iconst_4        
	//    9   19:invokevirtual   #560 <Method org.androidannotations.api.a.e com.irobot.home.NameFloorPlanActivity_$a.a(int)>
	//   10   22:pop             
	//   11   23:return          
	}

	private void O()
	{
		com.irobot.home.NameFloorPlanActivity_.a(((android.content.Context) (this))).a(getString(0x7f0f0281)).a(true).a(4);
	//    0    0:aload_0         
	//    1    1:invokestatic    #548 <Method NameFloorPlanActivity_$a com.irobot.home.NameFloorPlanActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:ldc2            #561 <Int 0x7f0f0281>
	//    4    8:invokevirtual   #413 <Method String getString(int)>
	//    5   11:invokevirtual   #554 <Method NameFloorPlanActivity_$a com.irobot.home.NameFloorPlanActivity_$a.a(String)>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #557 <Method NameFloorPlanActivity_$a com.irobot.home.NameFloorPlanActivity_$a.a(boolean)>
	//    8   18:iconst_4        
	//    9   19:invokevirtual   #560 <Method org.androidannotations.api.a.e com.irobot.home.NameFloorPlanActivity_$a.a(int)>
	//   10   22:pop             
	//   11   23:return          
	}

	private void P()
	{
		b(0x7f0f067a);
	//    0    0:aload_0         
	//    1    1:ldc2            #562 <Int 0x7f0f067a>
	//    2    4:invokevirtual   #563 <Method void b(int)>
		j.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #565 <Field CustomTextView j>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		j.setText(0x7f0f048a);
	//    7   15:aload_0         
	//    8   16:getfield        #565 <Field CustomTextView j>
	//    9   19:ldc2            #566 <Int 0x7f0f048a>
	//   10   22:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		n.setVisibility(0);
	//   11   25:aload_0         
	//   12   26:getfield        #570 <Field CustomTextView n>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		n.setText(0x7f0f04cf);
	//   15   33:aload_0         
	//   16   34:getfield        #570 <Field CustomTextView n>
	//   17   37:ldc2            #549 <Int 0x7f0f04cf>
	//   18   40:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		g.setText(0x7f0f0623);
	//   19   43:aload_0         
	//   20   44:getfield        #572 <Field CustomButton g>
	//   21   47:ldc2            #573 <Int 0x7f0f0623>
	//   22   50:invokevirtual   #574 <Method void CustomButton.setText(int)>
		g.setVisibility(0);
	//   23   53:aload_0         
	//   24   54:getfield        #572 <Field CustomButton g>
	//   25   57:iconst_0        
	//   26   58:invokevirtual   #539 <Method void CustomButton.setVisibility(int)>
		if(!(G instanceof ak))
	//*  27   61:aload_0         
	//*  28   62:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  29   65:instanceof      #499 <Class ak>
	//*  30   68:ifne            94
			a(((android.support.v4.app.Fragment) (ak.a(M.getServiceData().getMapRenderer(), false, true, ((c.a) (this))))));
	//   31   71:aload_0         
	//   32   72:aload_0         
	//   33   73:getfield        #307 <Field MapsUIService M>
	//   34   76:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   35   79:invokevirtual   #506 <Method com.irobot.core.RenderPresenter MapsUIServiceData.getMapRenderer()>
	//   36   82:iconst_0        
	//   37   83:iconst_1        
	//   38   84:aload_0         
	//   39   85:invokestatic    #509 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   40   88:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
		else
	//*  41   91:goto            104
			((ak)G).f();
	//   42   94:aload_0         
	//   43   95:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   44   98:checkcast       #499 <Class ak>
	//   45  101:invokevirtual   #576 <Method void ak.f()>
		G();
	//   46  104:aload_0         
	//   47  105:invokespecial   #578 <Method void G()>
		e(0);
	//   48  108:aload_0         
	//   49  109:iconst_0        
	//   50  110:invokevirtual   #580 <Method void e(int)>
	//   51  113:return          
	}

	private void Q()
	{
		b(0x7f0f065d);
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <Int 0x7f0f065d>
	//    2    4:invokevirtual   #563 <Method void b(int)>
		j.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #565 <Field CustomTextView j>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		j.setText(0x7f0f062f);
	//    7   15:aload_0         
	//    8   16:getfield        #565 <Field CustomTextView j>
	//    9   19:ldc2            #582 <Int 0x7f0f062f>
	//   10   22:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		n.setVisibility(4);
	//   11   25:aload_0         
	//   12   26:getfield        #570 <Field CustomTextView n>
	//   13   29:iconst_4        
	//   14   30:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		g.setVisibility(4);
	//   15   33:aload_0         
	//   16   34:getfield        #572 <Field CustomButton g>
	//   17   37:iconst_4        
	//   18   38:invokevirtual   #539 <Method void CustomButton.setVisibility(int)>
		if(!(G instanceof ak))
	//*  19   41:aload_0         
	//*  20   42:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  21   45:instanceof      #499 <Class ak>
	//*  22   48:ifne            74
			a(((android.support.v4.app.Fragment) (ak.a(M.getServiceData().getMapRenderer(), false, true, ((c.a) (this))))));
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:getfield        #307 <Field MapsUIService M>
	//   26   56:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   27   59:invokevirtual   #506 <Method com.irobot.core.RenderPresenter MapsUIServiceData.getMapRenderer()>
	//   28   62:iconst_0        
	//   29   63:iconst_1        
	//   30   64:aload_0         
	//   31   65:invokestatic    #509 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   32   68:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
		else
	//*  33   71:goto            84
			((ak)G).f();
	//   34   74:aload_0         
	//   35   75:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   36   78:checkcast       #499 <Class ak>
	//   37   81:invokevirtual   #576 <Method void ak.f()>
		G();
	//   38   84:aload_0         
	//   39   85:invokespecial   #578 <Method void G()>
	//   40   88:return          
	}

	private void R()
	{
		b(0x7f0f065d);
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <Int 0x7f0f065d>
	//    2    4:invokevirtual   #563 <Method void b(int)>
		j.setVisibility(4);
	//    3    7:aload_0         
	//    4    8:getfield        #565 <Field CustomTextView j>
	//    5   11:iconst_4        
	//    6   12:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		n.setVisibility(0);
	//    7   15:aload_0         
	//    8   16:getfield        #570 <Field CustomTextView n>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		n.setText(0x7f0f0281);
	//   11   23:aload_0         
	//   12   24:getfield        #570 <Field CustomTextView n>
	//   13   27:ldc2            #561 <Int 0x7f0f0281>
	//   14   30:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		g.setText(0x7f0f0624);
	//   15   33:aload_0         
	//   16   34:getfield        #572 <Field CustomButton g>
	//   17   37:ldc2            #583 <Int 0x7f0f0624>
	//   18   40:invokevirtual   #574 <Method void CustomButton.setText(int)>
		g.setVisibility(0);
	//   19   43:aload_0         
	//   20   44:getfield        #572 <Field CustomButton g>
	//   21   47:iconst_0        
	//   22   48:invokevirtual   #539 <Method void CustomButton.setVisibility(int)>
		if(!(G instanceof ak))
	//*  23   51:aload_0         
	//*  24   52:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  25   55:instanceof      #499 <Class ak>
	//*  26   58:ifne            84
			a(((android.support.v4.app.Fragment) (ak.a(M.getServiceData().getMapRenderer(), false, true, ((c.a) (this))))));
	//   27   61:aload_0         
	//   28   62:aload_0         
	//   29   63:getfield        #307 <Field MapsUIService M>
	//   30   66:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   31   69:invokevirtual   #506 <Method com.irobot.core.RenderPresenter MapsUIServiceData.getMapRenderer()>
	//   32   72:iconst_0        
	//   33   73:iconst_1        
	//   34   74:aload_0         
	//   35   75:invokestatic    #509 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   36   78:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
		else
	//*  37   81:goto            94
			((ak)G).f();
	//   38   84:aload_0         
	//   39   85:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   40   88:checkcast       #499 <Class ak>
	//   41   91:invokevirtual   #576 <Method void ak.f()>
		G();
	//   42   94:aload_0         
	//   43   95:invokespecial   #578 <Method void G()>
	//   44   98:return          
	}

	private void S()
	{
		b(0x7f0f065d);
	//    0    0:aload_0         
	//    1    1:ldc2            #581 <Int 0x7f0f065d>
	//    2    4:invokevirtual   #563 <Method void b(int)>
		j.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #565 <Field CustomTextView j>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		j.setText(0x7f0f0625);
	//    7   15:aload_0         
	//    8   16:getfield        #565 <Field CustomTextView j>
	//    9   19:ldc2            #584 <Int 0x7f0f0625>
	//   10   22:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		n.setVisibility(4);
	//   11   25:aload_0         
	//   12   26:getfield        #570 <Field CustomTextView n>
	//   13   29:iconst_4        
	//   14   30:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		g.setVisibility(4);
	//   15   33:aload_0         
	//   16   34:getfield        #572 <Field CustomButton g>
	//   17   37:iconst_4        
	//   18   38:invokevirtual   #539 <Method void CustomButton.setVisibility(int)>
		if(!(G instanceof ak))
	//*  19   41:aload_0         
	//*  20   42:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  21   45:instanceof      #499 <Class ak>
	//*  22   48:ifne            74
			a(((android.support.v4.app.Fragment) (ak.a(M.getServiceData().getMapRenderer(), false, true, ((c.a) (this))))));
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:getfield        #307 <Field MapsUIService M>
	//   26   56:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   27   59:invokevirtual   #506 <Method com.irobot.core.RenderPresenter MapsUIServiceData.getMapRenderer()>
	//   28   62:iconst_0        
	//   29   63:iconst_1        
	//   30   64:aload_0         
	//   31   65:invokestatic    #509 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   32   68:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
		else
	//*  33   71:goto            84
			((ak)G).f();
	//   34   74:aload_0         
	//   35   75:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   36   78:checkcast       #499 <Class ak>
	//   37   81:invokevirtual   #576 <Method void ak.f()>
		b(true);
	//   38   84:aload_0         
	//   39   85:iconst_1        
	//   40   86:invokespecial   #586 <Method void b(boolean)>
	//   41   89:return          
	}

	private void T()
	{
		j.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #565 <Field CustomTextView j>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		j.setText(0x7f0f0641);
	//    4    8:aload_0         
	//    5    9:getfield        #565 <Field CustomTextView j>
	//    6   12:ldc2            #587 <Int 0x7f0f0641>
	//    7   15:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		a(true);
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:invokespecial   #588 <Method void a(boolean)>
	//   11   23:return          
	}

	private void U()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #588 <Method void a(boolean)>
	//    3    5:return          
	}

	private void V()
	{
		l.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #452 <Field ImageView l>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #455 <Method void ImageView.setVisibility(int)>
		l.setEnabled(true);
	//    4    8:aload_0         
	//    5    9:getfield        #452 <Field ImageView l>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #591 <Method void ImageView.setEnabled(boolean)>
		if(!(G instanceof ak))
	//*   8   16:aload_0         
	//*   9   17:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  10   20:instanceof      #499 <Class ak>
	//*  11   23:ifne            47
		{
			a(((android.support.v4.app.Fragment) (ak.a(M.getServiceData().getMapRenderer(), false, true, ((c.a) (this))))));
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #307 <Field MapsUIService M>
	//   15   31:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   16   34:invokevirtual   #506 <Method com.irobot.core.RenderPresenter MapsUIServiceData.getMapRenderer()>
	//   17   37:iconst_0        
	//   18   38:iconst_1        
	//   19   39:aload_0         
	//   20   40:invokestatic    #509 <Method ak ak.a(com.irobot.core.RenderPresenter, boolean, boolean, c$a)>
	//   21   43:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
			return;
	//   22   46:return          
		} else
		{
			((ak)G).f();
	//   23   47:aload_0         
	//   24   48:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   25   51:checkcast       #499 <Class ak>
	//   26   54:invokevirtual   #576 <Method void ak.f()>
			return;
	//   27   57:return          
		}
	}

	private void W()
	{
		b(0x7f0f0421);
	//    0    0:aload_0         
	//    1    1:ldc2            #592 <Int 0x7f0f0421>
	//    2    4:invokevirtual   #563 <Method void b(int)>
		G();
	//    3    7:aload_0         
	//    4    8:invokespecial   #578 <Method void G()>
		j.setVisibility(0);
	//    5   11:aload_0         
	//    6   12:getfield        #565 <Field CustomTextView j>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		n.setVisibility(0);
	//    9   19:aload_0         
	//   10   20:getfield        #570 <Field CustomTextView n>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		n.setText(0x7f0f0281);
	//   13   27:aload_0         
	//   14   28:getfield        #570 <Field CustomTextView n>
	//   15   31:ldc2            #561 <Int 0x7f0f0281>
	//   16   34:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		n.setEnabled(false);
	//   17   37:aload_0         
	//   18   38:getfield        #570 <Field CustomTextView n>
	//   19   41:iconst_0        
	//   20   42:invokevirtual   #593 <Method void CustomTextView.setEnabled(boolean)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsCustomizeLabelRooms, com.irobot.home.util.j.j().a());
	//   21   45:invokestatic    #518 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   22   48:getstatic       #596 <Field ViewId ViewId.PMapsCustomizeLabelRooms>
	//   23   51:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//   24   54:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//   25   57:invokevirtual   #528 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   26   60:return          
	}

	private void X()
	{
		o.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #598 <Field CustomTextView o>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
	//    4    8:return          
	}

	private void Y()
	{
		int i1;
		if(ac)
	//*   0    0:aload_0         
	//*   1    1:getfield        #600 <Field boolean ac>
	//*   2    4:ifeq            19
			i1 = 0x7f0f0674;
	//    3    7:ldc2            #601 <Int 0x7f0f0674>
	//    4   10:istore_1        
		else
	//*   5   11:aload_0         
	//*   6   12:iload_1         
	//*   7   13:invokevirtual   #563 <Method void b(int)>
	//*   8   16:goto            26
			i1 = 0x7f0f0421;
	//    9   19:ldc2            #592 <Int 0x7f0f0421>
	//   10   22:istore_1        
		b(i1);
	//*  11   23:goto            11
		j.setVisibility(0);
	//   12   26:aload_0         
	//   13   27:getfield        #565 <Field CustomTextView j>
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		n.setVisibility(0);
	//   16   34:aload_0         
	//   17   35:getfield        #570 <Field CustomTextView n>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		n.setText(0x7f0f0281);
	//   20   42:aload_0         
	//   21   43:getfield        #570 <Field CustomTextView n>
	//   22   46:ldc2            #561 <Int 0x7f0f0281>
	//   23   49:invokevirtual   #568 <Method void CustomTextView.setText(int)>
		n.setEnabled(true);
	//   24   52:aload_0         
	//   25   53:getfield        #570 <Field CustomTextView n>
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #593 <Method void CustomTextView.setEnabled(boolean)>
		G();
	//   28   60:aload_0         
	//   29   61:invokespecial   #578 <Method void G()>
	//   30   64:return          
	}

	private void Z()
	{
		com.irobot.home.MapCustomizationCompleteActivity_.a(((android.content.Context) (this))).a(K).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #606 <Method MapCustomizationCompleteActivity_$a com.irobot.home.MapCustomizationCompleteActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #608 <Field String K>
	//    4    8:invokevirtual   #613 <Method MapCustomizationCompleteActivity_$a com.irobot.home.MapCustomizationCompleteActivity_$a.a(String)>
	//    5   11:invokevirtual   #614 <Method org.androidannotations.api.a.e com.irobot.home.MapCustomizationCompleteActivity_$a.a()>
	//    6   14:pop             
		finish();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #617 <Method void finish()>
	//    9   19:return          
	}

	static int a(MapCustomizationActivity mapcustomizationactivity, int i1)
	{
		mapcustomizationactivity.T = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #274 <Field int T>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void a(int i1, int j1)
	{
		com.irobot.home.util.o.b(I, "View delegate callback, setUnlabeledRegionCount");
	//    0    0:getstatic       #621 <Field String I>
	//    1    3:ldc2            #623 <String "View delegate callback, setUnlabeledRegionCount">
	//    2    6:invokestatic    #628 <Method void o.b(String, String)>
		j.setText(((CharSequence) (getString(0x7f0f07a7, new Object[] {
			Integer.valueOf(i1), Integer.valueOf(j1)
		}))));
	//    3    9:aload_0         
	//    4   10:getfield        #565 <Field CustomTextView j>
	//    5   13:aload_0         
	//    6   14:ldc2            #629 <Int 0x7f0f07a7>
	//    7   17:iconst_2        
	//    8   18:anewarray       Object[]
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:iload_1         
	//   12   24:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   13   27:aastore         
	//   14   28:dup             
	//   15   29:iconst_1        
	//   16   30:iload_2         
	//   17   31:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   18   34:aastore         
	//   19   35:invokevirtual   #630 <Method String getString(int, Object[])>
	//   20   38:invokevirtual   #478 <Method void CustomTextView.setText(CharSequence)>
	//   21   41:return          
	}

	private void a(MapCustomizationErrors mapcustomizationerrors)
	{
		_cls28.c[mapcustomizationerrors.ordinal()];
	//    0    0:getstatic       #634 <Field int[] MapCustomizationActivity$28.c>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #639 <Method int MapCustomizationErrors.ordinal()>
	//    3    7:iaload          
		JVM INSTR tableswitch 1 6: default 48
	//	               1 216
	//	               2 171
	//	               3 131
	//	               4 100
	//	               5 49
	//	               6 68;
	//    4    8:tableswitch     1 6: default 48
	//	               1 216
	//	               2 171
	//	               3 131
	//	               4 100
	//	               5 49
	//	               6 68
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		return;
	//    5   48:return          
_L6:
		com.irobot.home.util.j.a(((android.content.Context) (this)), getString(0x7f0f02c8), new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				a.runOnUiThread(new Runnable(this) {

					public void run()
					{
						MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
					//    0    0:invokestatic    #28  <Method MapsUIServiceData MapsUIServiceData.create()>
					//    1    3:astore_1        
						mapsuiservicedata.setErrorDismissed(MapCustomizationErrors.SaveTimedOut);
					//    2    4:aload_1         
					//    3    5:getstatic       #34  <Field MapCustomizationErrors MapCustomizationErrors.SaveTimedOut>
					//    4    8:invokevirtual   #38  <Method void MapsUIServiceData.setErrorDismissed(MapCustomizationErrors)>
						MapCustomizationActivity.e(a.a).sendCommand(MapsUIServiceCommand.ErrorDismissed, mapsuiservicedata);
					//    5   11:aload_0         
					//    6   12:getfield        #17  <Field MapCustomizationActivity$22 a>
					//    7   15:getfield        #41  <Field MapCustomizationActivity com.irobot.home.MapCustomizationActivity$22.a>
					//    8   18:invokestatic    #47  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
					//    9   21:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.ErrorDismissed>
					//   10   24:aload_1         
					//   11   25:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
						MapCustomizationActivity.i(a.a);
					//   12   28:aload_0         
					//   13   29:getfield        #17  <Field MapCustomizationActivity$22 a>
					//   14   32:getfield        #41  <Field MapCustomizationActivity com.irobot.home.MapCustomizationActivity$22.a>
					//   15   35:invokestatic    #63  <Method void MapCustomizationActivity.i(MapCustomizationActivity)>
					//   16   38:return          
					}

					final _cls22 a;

			
			{
				a = _pcls22;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity$22 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field MapCustomizationActivity a>
			//    2    4:new             #13  <Class MapCustomizationActivity$22$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #27  <Method void MapCustomizationActivity$22$1(MapCustomizationActivity$22)>
			//    6   12:invokevirtual   #31  <Method void MapCustomizationActivity.runOnUiThread(Runnable)>
			//    7   15:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    6   49:aload_0         
	//    7   50:aload_0         
	//    8   51:ldc2            #640 <Int 0x7f0f02c8>
	//    9   54:invokevirtual   #413 <Method String getString(int)>
	//   10   57:new             #38  <Class MapCustomizationActivity$22>
	//   11   60:dup             
	//   12   61:aload_0         
	//   13   62:invokespecial   #641 <Method void MapCustomizationActivity$22(MapCustomizationActivity)>
	//   14   65:invokestatic    #644 <Method void j.a(android.content.Context, String, android.content.DialogInterface$OnClickListener)>
_L7:
		Object obj;
		obj = ((Object) ((new android.support.v7.app.a.a(((android.content.Context) (this)))).b(0x7f0f0484)));
	//   15   68:new             #228 <Class android.support.v7.app.a$a>
	//   16   71:dup             
	//   17   72:aload_0         
	//   18   73:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   19   76:ldc2            #645 <Int 0x7f0f0484>
	//   20   79:invokevirtual   #647 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//   21   82:astore_2        
		android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener(mapcustomizationerrors) {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (MapsUIServiceData.create()));
			//    0    0:invokestatic    #32  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    1    3:astore_1        
				((MapsUIServiceData) (dialoginterface)).setErrorDismissed(a);
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #20  <Field MapCustomizationErrors a>
			//    5    9:invokevirtual   #35  <Method void MapsUIServiceData.setErrorDismissed(MapCustomizationErrors)>
				MapCustomizationActivity.e(b).sendCommand(MapsUIServiceCommand.ErrorDismissed, ((MapsUIServiceData) (dialoginterface)));
			//    6   12:aload_0         
			//    7   13:getfield        #18  <Field MapCustomizationActivity b>
			//    8   16:invokestatic    #39  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
			//    9   19:getstatic       #45  <Field MapsUIServiceCommand MapsUIServiceCommand.ErrorDismissed>
			//   10   22:aload_1         
			//   11   23:invokevirtual   #51  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			//   12   26:return          
			}

			final MapCustomizationErrors a;
			final MapCustomizationActivity b;

			
			{
				b = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MapCustomizationActivity b>
				a = mapcustomizationerrors;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field MapCustomizationErrors a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   22   83:new             #44  <Class MapCustomizationActivity$24>
	//   23   86:dup             
	//   24   87:aload_0         
	//   25   88:aload_1         
	//   26   89:invokespecial   #650 <Method void MapCustomizationActivity$24(MapCustomizationActivity, MapCustomizationErrors)>
	//   27   92:astore_3        
		mapcustomizationerrors = ((MapCustomizationErrors) (obj));
	//   28   93:aload_2         
	//   29   94:astore_1        
		obj = ((Object) (onclicklistener));
	//   30   95:aload_3         
	//   31   96:astore_2        
		  goto _L8
	//*  32   97:goto            204
_L5:
		r();
	//   33  100:aload_0         
	//   34  101:invokevirtual   #653 <Method void r()>
		obj = ((Object) ((new android.support.v7.app.a.a(((android.content.Context) (this)))).b(0x7f0f0202)));
	//   35  104:new             #228 <Class android.support.v7.app.a$a>
	//   36  107:dup             
	//   37  108:aload_0         
	//   38  109:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   39  112:ldc2            #654 <Int 0x7f0f0202>
	//   40  115:invokevirtual   #647 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//   41  118:astore_2        
		mapcustomizationerrors = ((MapCustomizationErrors) (new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
			//    0    0:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   42  119:new             #36  <Class MapCustomizationActivity$21>
	//   43  122:dup             
	//   44  123:aload_0         
	//   45  124:invokespecial   #655 <Method void MapCustomizationActivity$21(MapCustomizationActivity)>
	//   46  127:astore_1        
		  goto _L9
	//*  47  128:goto            155
_L4:
		obj = ((Object) ((new android.support.v7.app.a.a(((android.content.Context) (this)))).b(0x7f0f0202)));
	//   48  131:new             #228 <Class android.support.v7.app.a$a>
	//   49  134:dup             
	//   50  135:aload_0         
	//   51  136:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   52  139:ldc2            #654 <Int 0x7f0f0202>
	//   53  142:invokevirtual   #647 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//   54  145:astore_2        
		mapcustomizationerrors = ((MapCustomizationErrors) (new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				a.onBackPressed();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field MapCustomizationActivity a>
			//    2    4:invokevirtual   #25  <Method void MapCustomizationActivity.onBackPressed()>
			//    3    7:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   55  146:new             #34  <Class MapCustomizationActivity$20>
	//   56  149:dup             
	//   57  150:aload_0         
	//   58  151:invokespecial   #656 <Method void MapCustomizationActivity$20(MapCustomizationActivity)>
	//   59  154:astore_1        
_L9:
		S = ((android.support.v7.app.a.a) (obj)).a(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (mapcustomizationerrors))).c();
	//   60  155:aload_0         
	//   61  156:aload_2         
	//   62  157:ldc2            #392 <Int 0x7f0f05bb>
	//   63  160:aload_1         
	//   64  161:invokevirtual   #243 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   65  164:invokevirtual   #246 <Method a android.support.v7.app.a$a.c()>
	//   66  167:putfield        #658 <Field a S>
		return;
	//   67  170:return          
_L3:
		android.support.v7.app.a.a a1 = (new android.support.v7.app.a.a(((android.content.Context) (this)))).a(0x7f0f061e).b(0x7f0f07aa);
	//   68  171:new             #228 <Class android.support.v7.app.a$a>
	//   69  174:dup             
	//   70  175:aload_0         
	//   71  176:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   72  179:ldc2            #659 <Int 0x7f0f061e>
	//   73  182:invokevirtual   #235 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int)>
	//   74  185:ldc2            #660 <Int 0x7f0f07aa>
	//   75  188:invokevirtual   #647 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//   76  191:astore_3        
		obj = ((Object) (new android.content.DialogInterface.OnClickListener(mapcustomizationerrors) {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (MapsUIServiceData.create()));
			//    0    0:invokestatic    #32  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    1    3:astore_1        
				((MapsUIServiceData) (dialoginterface)).setErrorDismissed(a);
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #20  <Field MapCustomizationErrors a>
			//    5    9:invokevirtual   #35  <Method void MapsUIServiceData.setErrorDismissed(MapCustomizationErrors)>
				MapCustomizationActivity.e(b).sendCommand(MapsUIServiceCommand.ErrorDismissed, ((MapsUIServiceData) (dialoginterface)));
			//    6   12:aload_0         
			//    7   13:getfield        #18  <Field MapCustomizationActivity b>
			//    8   16:invokestatic    #39  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
			//    9   19:getstatic       #45  <Field MapsUIServiceCommand MapsUIServiceCommand.ErrorDismissed>
			//   10   22:aload_1         
			//   11   23:invokevirtual   #51  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			//   12   26:return          
			}

			final MapCustomizationErrors a;
			final MapCustomizationActivity b;

			
			{
				b = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MapCustomizationActivity b>
				a = mapcustomizationerrors;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field MapCustomizationErrors a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//   77  192:new             #30  <Class MapCustomizationActivity$19>
	//   78  195:dup             
	//   79  196:aload_0         
	//   80  197:aload_1         
	//   81  198:invokespecial   #661 <Method void MapCustomizationActivity$19(MapCustomizationActivity, MapCustomizationErrors)>
	//   82  201:astore_2        
		mapcustomizationerrors = ((MapCustomizationErrors) (a1));
	//   83  202:aload_3         
	//   84  203:astore_1        
_L8:
		mapcustomizationerrors = ((MapCustomizationErrors) (((android.support.v7.app.a.a) (mapcustomizationerrors)).a(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (obj)))));
	//   85  204:aload_1         
	//   86  205:ldc2            #392 <Int 0x7f0f05bb>
	//   87  208:aload_2         
	//   88  209:invokevirtual   #243 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   89  212:astore_1        
		  goto _L10
	//*  90  213:goto            292
_L2:
		AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//   91  216:aload_0         
	//   92  217:getfield        #663 <Field String b>
	//   93  220:invokestatic    #666 <Method com.irobot.home.model.a j.a(String)>
	//   94  223:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//   95  226:astore_2        
		mapcustomizationerrors = ((MapCustomizationErrors) ((new android.support.v7.app.a.a(((android.content.Context) (this)))).a(0x7f0f095e).b(((CharSequence) (getString(0x7f0f065c, new Object[] {
			assetinfo.getName()
		})))).a(0x7f0f064c, new android.content.DialogInterface.OnClickListener(mapcustomizationerrors) {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (MapsUIServiceData.create()));
			//    0    0:invokestatic    #32  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    1    3:astore_1        
				((MapsUIServiceData) (dialoginterface)).setErrorDismissed(a);
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #20  <Field MapCustomizationErrors a>
			//    5    9:invokevirtual   #35  <Method void MapsUIServiceData.setErrorDismissed(MapCustomizationErrors)>
				MapCustomizationActivity.e(b).sendCommand(MapsUIServiceCommand.ErrorDismissed, ((MapsUIServiceData) (dialoginterface)));
			//    6   12:aload_0         
			//    7   13:getfield        #18  <Field MapCustomizationActivity b>
			//    8   16:invokestatic    #39  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
			//    9   19:getstatic       #45  <Field MapsUIServiceCommand MapsUIServiceCommand.ErrorDismissed>
			//   10   22:aload_1         
			//   11   23:invokevirtual   #51  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			//   12   26:return          
			}

			final MapCustomizationErrors a;
			final MapCustomizationActivity b;

			
			{
				b = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MapCustomizationActivity b>
				a = mapcustomizationerrors;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field MapCustomizationErrors a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
).b(0x7f0f0668, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
			//    0    0:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//   96  227:new             #228 <Class android.support.v7.app.a$a>
	//   97  230:dup             
	//   98  231:aload_0         
	//   99  232:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//  100  235:ldc2            #667 <Int 0x7f0f095e>
	//  101  238:invokevirtual   #235 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int)>
	//  102  241:aload_0         
	//  103  242:ldc2            #668 <Int 0x7f0f065c>
	//  104  245:iconst_1        
	//  105  246:anewarray       Object[]
	//  106  249:dup             
	//  107  250:iconst_0        
	//  108  251:aload_2         
	//  109  252:invokevirtual   #443 <Method String AssetInfo.getName()>
	//  110  255:aastore         
	//  111  256:invokevirtual   #630 <Method String getString(int, Object[])>
	//  112  259:invokevirtual   #671 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence)>
	//  113  262:ldc2            #672 <Int 0x7f0f064c>
	//  114  265:new             #28  <Class MapCustomizationActivity$18>
	//  115  268:dup             
	//  116  269:aload_0         
	//  117  270:aload_1         
	//  118  271:invokespecial   #673 <Method void MapCustomizationActivity$18(MapCustomizationActivity, MapCustomizationErrors)>
	//  119  274:invokevirtual   #243 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//  120  277:ldc2            #674 <Int 0x7f0f0668>
	//  121  280:new             #26  <Class MapCustomizationActivity$17>
	//  122  283:dup             
	//  123  284:aload_0         
	//  124  285:invokespecial   #675 <Method void MapCustomizationActivity$17(MapCustomizationActivity)>
	//  125  288:invokevirtual   #239 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int, android.content.DialogInterface$OnClickListener)>
	//  126  291:astore_1        
_L10:
		((android.support.v7.app.a.a) (mapcustomizationerrors)).c();
	//  127  292:aload_1         
	//  128  293:invokevirtual   #246 <Method a android.support.v7.app.a$a.c()>
	//  129  296:pop             
		return;
	//  130  297:return          
	}

	private void a(MapCustomizationViewState mapcustomizationviewstate)
	{
		if(Z != mapcustomizationviewstate && (Z == MapCustomizationViewState.Loading || Z == MapCustomizationViewState.Saving))
	//*   0    0:aload_0         
	//*   1    1:getfield        #678 <Field MapCustomizationViewState Z>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       32
	//*   4    8:aload_0         
	//*   5    9:getfield        #678 <Field MapCustomizationViewState Z>
	//*   6   12:getstatic       #683 <Field MapCustomizationViewState MapCustomizationViewState.Loading>
	//*   7   15:if_acmpeq       28
	//*   8   18:aload_0         
	//*   9   19:getfield        #678 <Field MapCustomizationViewState Z>
	//*  10   22:getstatic       #686 <Field MapCustomizationViewState MapCustomizationViewState.Saving>
	//*  11   25:if_acmpne       32
			r();
	//   12   28:aload_0         
	//   13   29:invokevirtual   #653 <Method void r()>
		Z = mapcustomizationviewstate;
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #678 <Field MapCustomizationViewState Z>
		f();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #687 <Method void f()>
		android.support.design.widget.CoordinatorLayout.c c1 = (android.support.design.widget.CoordinatorLayout.c)F.getLayoutParams();
	//   19   41:aload_0         
	//   20   42:getfield        #480 <Field FloatingActionButton F>
	//   21   45:invokevirtual   #486 <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//   22   48:checkcast       #488 <Class android.support.design.widget.CoordinatorLayout$c>
	//   23   51:astore_2        
		c1.a(0x7f09008c);
	//   24   52:aload_2         
	//   25   53:ldc2            #688 <Int 0x7f09008c>
	//   26   56:invokevirtual   #490 <Method void android.support.design.widget.CoordinatorLayout$c.a(int)>
		F.setLayoutParams(((android.view.ViewGroup.LayoutParams) (c1)));
	//   27   59:aload_0         
	//   28   60:getfield        #480 <Field FloatingActionButton F>
	//   29   63:aload_2         
	//   30   64:invokevirtual   #494 <Method void FloatingActionButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		switch(_cls28.d[mapcustomizationviewstate.ordinal()])
	//*  31   67:getstatic       #690 <Field int[] MapCustomizationActivity$28.d>
	//*  32   70:aload_1         
	//*  33   71:invokevirtual   #691 <Method int MapCustomizationViewState.ordinal()>
	//*  34   74:iaload          
		{
	//*  35   75:tableswitch     1 16: default 152
	//	               1 395
	//	               2 379
	//	               3 363
	//	               4 347
	//	               5 331
	//	               6 315
	//	               7 299
	//	               8 283
	//	               9 267
	//	               10 251
	//	               11 235
	//	               12 219
	//	               13 203
	//	               14 187
	//	               15 171
	//	               16 155
	//*  36  152:goto            408
		case 16: // '\020'
			com.irobot.home.util.o.b(I, "state: SetupComplete");
	//   37  155:getstatic       #621 <Field String I>
	//   38  158:ldc2            #693 <String "state: SetupComplete">
	//   39  161:invokestatic    #628 <Method void o.b(String, String)>
			Z();
	//   40  164:aload_0         
	//   41  165:invokespecial   #695 <Method void Z()>
			break;

	//*  42  168:goto            408
		case 15: // '\017'
			com.irobot.home.util.o.b(I, "state: DoorEditHasPendingValidSave");
	//   43  171:getstatic       #621 <Field String I>
	//   44  174:ldc2            #697 <String "state: DoorEditHasPendingValidSave">
	//   45  177:invokestatic    #628 <Method void o.b(String, String)>
			U();
	//   46  180:aload_0         
	//   47  181:invokespecial   #699 <Method void U()>
			break;

	//*  48  184:goto            408
		case 14: // '\016'
			com.irobot.home.util.o.b(I, "state: DoorEditHasPendingValidSave");
	//   49  187:getstatic       #621 <Field String I>
	//   50  190:ldc2            #697 <String "state: DoorEditHasPendingValidSave">
	//   51  193:invokestatic    #628 <Method void o.b(String, String)>
			T();
	//   52  196:aload_0         
	//   53  197:invokespecial   #701 <Method void T()>
			break;

	//*  54  200:goto            408
		case 13: // '\r'
			com.irobot.home.util.o.b(I, "state: KeepOutZoneSelected");
	//   55  203:getstatic       #621 <Field String I>
	//   56  206:ldc2            #703 <String "state: KeepOutZoneSelected">
	//   57  209:invokestatic    #628 <Method void o.b(String, String)>
			S();
	//   58  212:aload_0         
	//   59  213:invokespecial   #705 <Method void S()>
			break;

	//*  60  216:goto            408
		case 12: // '\f'
			com.irobot.home.util.o.b(I, "state: KeepOutZoneEdit");
	//   61  219:getstatic       #621 <Field String I>
	//   62  222:ldc2            #707 <String "state: KeepOutZoneEdit">
	//   63  225:invokestatic    #628 <Method void o.b(String, String)>
			R();
	//   64  228:aload_0         
	//   65  229:invokespecial   #709 <Method void R()>
			break;

	//*  66  232:goto            408
		case 11: // '\013'
			com.irobot.home.util.o.b(I, "state: KeepOutZoneAdd");
	//   67  235:getstatic       #621 <Field String I>
	//   68  238:ldc2            #711 <String "state: KeepOutZoneAdd">
	//   69  241:invokestatic    #628 <Method void o.b(String, String)>
			Q();
	//   70  244:aload_0         
	//   71  245:invokespecial   #713 <Method void Q()>
			break;

	//*  72  248:goto            408
		case 10: // '\n'
			com.irobot.home.util.o.b(I, "state: DoorEdit");
	//   73  251:getstatic       #621 <Field String I>
	//   74  254:ldc2            #715 <String "state: DoorEdit">
	//   75  257:invokestatic    #628 <Method void o.b(String, String)>
			P();
	//   76  260:aload_0         
	//   77  261:invokespecial   #717 <Method void P()>
			break;

	//*  78  264:goto            408
		case 9: // '\t'
			com.irobot.home.util.o.b(I, "state: LabelingHasPendingSave");
	//   79  267:getstatic       #621 <Field String I>
	//   80  270:ldc2            #719 <String "state: LabelingHasPendingSave">
	//   81  273:invokestatic    #628 <Method void o.b(String, String)>
			Y();
	//   82  276:aload_0         
	//   83  277:invokespecial   #721 <Method void Y()>
			break;

	//*  84  280:goto            408
		case 8: // '\b'
			com.irobot.home.util.o.b(I, "state: Labeling");
	//   85  283:getstatic       #621 <Field String I>
	//   86  286:ldc2            #723 <String "state: Labeling">
	//   87  289:invokestatic    #628 <Method void o.b(String, String)>
			X();
	//   88  292:aload_0         
	//   89  293:invokespecial   #725 <Method void X()>
			break;

	//*  90  296:goto            408
		case 7: // '\007'
			com.irobot.home.util.o.b(I, "state: LabelingRoomSelection");
	//   91  299:getstatic       #621 <Field String I>
	//   92  302:ldc2            #727 <String "state: LabelingRoomSelection">
	//   93  305:invokestatic    #628 <Method void o.b(String, String)>
			W();
	//   94  308:aload_0         
	//   95  309:invokespecial   #729 <Method void W()>
			break;

	//*  96  312:goto            408
		case 6: // '\006'
			com.irobot.home.util.o.b(I, "state: FullyLabeledMapPreview");
	//   97  315:getstatic       #621 <Field String I>
	//   98  318:ldc2            #731 <String "state: FullyLabeledMapPreview">
	//   99  321:invokestatic    #628 <Method void o.b(String, String)>
			V();
	//  100  324:aload_0         
	//  101  325:invokespecial   #733 <Method void V()>
			break;

	//* 102  328:goto            408
		case 5: // '\005'
			com.irobot.home.util.o.b(I, "state: PendingNameMap");
	//  103  331:getstatic       #621 <Field String I>
	//  104  334:ldc2            #735 <String "state: PendingNameMap">
	//  105  337:invokestatic    #628 <Method void o.b(String, String)>
			N();
	//  106  340:aload_0         
	//  107  341:invokespecial   #737 <Method void N()>
			break;

	//* 108  344:goto            408
		case 4: // '\004'
			com.irobot.home.util.o.b(I, "state: SetupMapPreview");
	//  109  347:getstatic       #621 <Field String I>
	//  110  350:ldc2            #739 <String "state: SetupMapPreview">
	//  111  353:invokestatic    #628 <Method void o.b(String, String)>
			M();
	//  112  356:aload_0         
	//  113  357:invokespecial   #741 <Method void M()>
			break;

	//* 114  360:goto            408
		case 3: // '\003'
			com.irobot.home.util.o.b(I, "state: Still learning preview");
	//  115  363:getstatic       #621 <Field String I>
	//  116  366:ldc2            #743 <String "state: Still learning preview">
	//  117  369:invokestatic    #628 <Method void o.b(String, String)>
			L();
	//  118  372:aload_0         
	//  119  373:invokespecial   #745 <Method void L()>
			break;

	//* 120  376:goto            408
		case 2: // '\002'
			com.irobot.home.util.o.b(I, "state: saving");
	//  121  379:getstatic       #621 <Field String I>
	//  122  382:ldc2            #747 <String "state: saving">
	//  123  385:invokestatic    #628 <Method void o.b(String, String)>
			K();
	//  124  388:aload_0         
	//  125  389:invokespecial   #749 <Method void K()>
			break;

	//* 126  392:goto            408
		case 1: // '\001'
			com.irobot.home.util.o.b(I, "state: loading");
	//  127  395:getstatic       #621 <Field String I>
	//  128  398:ldc2            #751 <String "state: loading">
	//  129  401:invokestatic    #628 <Method void o.b(String, String)>
			J();
	//  130  404:aload_0         
	//  131  405:invokespecial   #753 <Method void J()>
			break;
		}
		c(G instanceof e);
	//  132  408:aload_0         
	//  133  409:aload_0         
	//  134  410:getfield        #497 <Field android.support.v4.app.Fragment G>
	//  135  413:instanceof      #755 <Class e>
	//  136  416:invokespecial   #757 <Method void c(boolean)>
	//  137  419:return          
	}

	private void a(RegionType regiontype, String s1)
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            30
			((ak)G).d().queueEvent(new Runnable(regiontype, s1) {

				public void run()
				{
					MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
				//    0    0:invokestatic    #35  <Method MapsUIServiceData MapsUIServiceData.create()>
				//    1    3:astore_1        
					mapsuiservicedata.setRegionTypeChange(a, b);
				//    2    4:aload_1         
				//    3    5:aload_0         
				//    4    6:getfield        #22  <Field RegionType a>
				//    5    9:aload_0         
				//    6   10:getfield        #24  <Field String b>
				//    7   13:invokevirtual   #38  <Method void MapsUIServiceData.setRegionTypeChange(RegionType, String)>
					MapCustomizationActivity.e(c).sendCommand(MapsUIServiceCommand.RegionTypeChange, mapsuiservicedata);
				//    8   16:aload_0         
				//    9   17:getfield        #20  <Field MapCustomizationActivity c>
				//   10   20:invokestatic    #42  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   11   23:getstatic       #48  <Field MapsUIServiceCommand MapsUIServiceCommand.RegionTypeChange>
				//   12   26:aload_1         
				//   13   27:invokevirtual   #54  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//   14   30:return          
				}

				final RegionType a;
				final String b;
				final MapCustomizationActivity c;

			
			{
				c = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MapCustomizationActivity c>
				a = regiontype;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field RegionType a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #78  <Class MapCustomizationActivity$9>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokespecial   #767 <Method void MapCustomizationActivity$9(MapCustomizationActivity, RegionType, String)>
	//   13   27:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   14   30:return          
	}

	private void a(TitleSpecifier titlespecifier)
	{
label0:
		{
			int i1;
			switch(_cls28.e[titlespecifier.ordinal()])
	//*   0    0:getstatic       #776 <Field int[] MapCustomizationActivity$28.e>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #779 <Method int TitleSpecifier.ordinal()>
	//*   3    7:iaload          
			{
	//*   4    8:tableswitch     1 8: default 56
	//	               1 56
	//	               2 106
	//	               3 99
	//	               4 91
	//	               5 84
	//	               6 77
	//	               7 70
	//	               8 63
			case 1: // '\001'
			default:
				titlespecifier = "";
	//    5   56:ldc2            #781 <String "">
	//    6   59:astore_1        
				break label0;
	//    7   60:goto            116

			case 8: // '\b'
				i1 = 0x7f0f04dd;
	//    8   63:ldc2            #782 <Int 0x7f0f04dd>
	//    9   66:istore_2        
				break;
	//   10   67:goto            110

			case 7: // '\007'
				i1 = 0x7f0f0674;
	//   11   70:ldc2            #601 <Int 0x7f0f0674>
	//   12   73:istore_2        
				break;
	//   13   74:goto            110

			case 6: // '\006'
				i1 = 0x7f0f0421;
	//   14   77:ldc2            #592 <Int 0x7f0f0421>
	//   15   80:istore_2        
				break;
	//   16   81:goto            110

			case 5: // '\005'
				i1 = 0x7f0f067a;
	//   17   84:ldc2            #562 <Int 0x7f0f067a>
	//   18   87:istore_2        
				break;
	//   19   88:goto            110

			case 4: // '\004'
				titlespecifier = ((TitleSpecifier) (K));
	//   20   91:aload_0         
	//   21   92:getfield        #608 <Field String K>
	//   22   95:astore_1        
				break label0;
	//   23   96:goto            116

			case 3: // '\003'
				i1 = 0x7f0f032f;
	//   24   99:ldc2            #425 <Int 0x7f0f032f>
	//   25  102:istore_2        
				break;
	//   26  103:goto            110

			case 2: // '\002'
				i1 = 0x7f0f04a4;
	//   27  106:ldc2            #783 <Int 0x7f0f04a4>
	//   28  109:istore_2        
				break;
			}
			titlespecifier = ((TitleSpecifier) (getString(i1)));
	//   29  110:aload_0         
	//   30  111:iload_2         
	//   31  112:invokevirtual   #413 <Method String getString(int)>
	//   32  115:astore_1        
		}
		e(((String) (titlespecifier)));
	//   33  116:aload_0         
	//   34  117:aload_1         
	//   35  118:invokevirtual   #427 <Method void e(String)>
	//   36  121:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity)
	{
		mapcustomizationactivity.H();
	//    0    0:aload_0         
	//    1    1:invokespecial   #785 <Method void H()>
	//    2    4:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, int i1, int j1)
	{
		mapcustomizationactivity.a(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #788 <Method void a(int, int)>
	//    4    6:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, MapCustomizationErrors mapcustomizationerrors)
	{
		mapcustomizationactivity.a(mapcustomizationerrors);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #790 <Method void a(MapCustomizationErrors)>
	//    3    5:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, MapCustomizationViewState mapcustomizationviewstate)
	{
		mapcustomizationactivity.a(mapcustomizationviewstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #793 <Method void a(MapCustomizationViewState)>
	//    3    5:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, TitleSpecifier titlespecifier)
	{
		mapcustomizationactivity.a(titlespecifier);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #796 <Method void a(TitleSpecifier)>
	//    3    5:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, String s1)
	{
		mapcustomizationactivity.c(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #799 <Method void c(String)>
	//    3    5:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, String s1, int i1)
	{
		mapcustomizationactivity.a(s1, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #803 <Method void a(String, int)>
	//    4    6:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, String s1, String s2)
	{
		mapcustomizationactivity.b(s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #805 <Method void b(String, String)>
	//    4    6:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, ArrayList arraylist)
	{
		mapcustomizationactivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #809 <Method void a(ArrayList)>
	//    3    5:return          
	}

	static void a(MapCustomizationActivity mapcustomizationactivity, boolean flag)
	{
		mapcustomizationactivity.d(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #812 <Method void d(boolean)>
	//    3    5:return          
	}

	private void a(String s1, int i1)
	{
		X.a(true);
	//    0    0:aload_0         
	//    1    1:getfield        #348 <Field BottomSheetBehavior X>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #356 <Method void BottomSheetBehavior.a(boolean)>
		h.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #814 <Field FrameLayout h>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #817 <Method void FrameLayout.setVisibility(int)>
		if(X.a() != 5 && !s1.isEmpty())
	//*   8   16:aload_0         
	//*   9   17:getfield        #348 <Field BottomSheetBehavior X>
	//*  10   20:invokevirtual   #353 <Method int BottomSheetBehavior.a()>
	//*  11   23:iconst_5        
	//*  12   24:icmpeq          47
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #822 <Method boolean String.isEmpty()>
	//*  15   31:ifeq            37
	//*  16   34:goto            47
		{
			s1 = ((String) (X));
	//   17   37:aload_0         
	//   18   38:getfield        #348 <Field BottomSheetBehavior X>
	//   19   41:astore_1        
			i1 = 4;
	//   20   42:iconst_4        
	//   21   43:istore_2        
		} else
	//*  22   44:goto            54
		{
			s1 = ((String) (X));
	//   23   47:aload_0         
	//   24   48:getfield        #348 <Field BottomSheetBehavior X>
	//   25   51:astore_1        
			i1 = 3;
	//   26   52:iconst_3        
	//   27   53:istore_2        
		}
		((BottomSheetBehavior) (s1)).b(i1);
	//   28   54:aload_1         
	//   29   55:iload_2         
	//   30   56:invokevirtual   #359 <Method void BottomSheetBehavior.b(int)>
	//   31   59:return          
	}

	private void a(String s1, String s2)
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            30
			((ak)G).d().queueEvent(new Runnable(s1, s2) {

				public void run()
				{
					MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
				//    0    0:invokestatic    #34  <Method MapsUIServiceData MapsUIServiceData.create()>
				//    1    3:astore_1        
					mapsuiservicedata.setRenameRegion(a, b);
				//    2    4:aload_1         
				//    3    5:aload_0         
				//    4    6:getfield        #21  <Field String a>
				//    5    9:aload_0         
				//    6   10:getfield        #23  <Field String b>
				//    7   13:invokevirtual   #37  <Method void MapsUIServiceData.setRenameRegion(String, String)>
					MapCustomizationActivity.e(c).sendCommand(MapsUIServiceCommand.RenameRegion, mapsuiservicedata);
				//    8   16:aload_0         
				//    9   17:getfield        #19  <Field MapCustomizationActivity c>
				//   10   20:invokestatic    #41  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   11   23:getstatic       #47  <Field MapsUIServiceCommand MapsUIServiceCommand.RenameRegion>
				//   12   26:aload_1         
				//   13   27:invokevirtual   #53  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//   14   30:return          
				}

				final String a;
				final String b;
				final MapCustomizationActivity c;

			
			{
				c = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MapCustomizationActivity c>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				b = s2;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #14  <Class MapCustomizationActivity$11>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokespecial   #824 <Method void MapCustomizationActivity$11(MapCustomizationActivity, String, String)>
	//   13   27:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   14   30:return          
	}

	private void a(ArrayList arraylist)
	{
		PopupMenu popupmenu = new PopupMenu(((android.content.Context) (this)), ((View) (l)));
	//    0    0:new             #826 <Class PopupMenu>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #452 <Field ImageView l>
	//    5    9:invokespecial   #829 <Method void PopupMenu(android.content.Context, View)>
	//    6   12:astore          4
		popupmenu.getMenuInflater().inflate(0x7f0c0006, popupmenu.getMenu());
	//    7   14:aload           4
	//    8   16:invokevirtual   #833 <Method MenuInflater PopupMenu.getMenuInflater()>
	//    9   19:ldc2            #834 <Int 0x7f0c0006>
	//   10   22:aload           4
	//   11   24:invokevirtual   #838 <Method Menu PopupMenu.getMenu()>
	//   12   27:invokevirtual   #843 <Method void MenuInflater.inflate(int, Menu)>
		for(int i1 = 0; i1 < popupmenu.getMenu().size(); i1++)
	//*  13   30:iconst_0        
	//*  14   31:istore_2        
	//*  15   32:iload_2         
	//*  16   33:aload           4
	//*  17   35:invokevirtual   #838 <Method Menu PopupMenu.getMenu()>
	//*  18   38:invokeinterface #848 <Method int Menu.size()>
	//*  19   43:icmpge          176
		{
			int j1 = popupmenu.getMenu().getItem(i1).getItemId();
	//   20   46:aload           4
	//   21   48:invokevirtual   #838 <Method Menu PopupMenu.getMenu()>
	//   22   51:iload_2         
	//   23   52:invokeinterface #852 <Method MenuItem Menu.getItem(int)>
	//   24   57:invokeinterface #857 <Method int MenuItem.getItemId()>
	//   25   62:istore_3        
			if(H.containsKey(((Object) (Integer.valueOf(j1)))))
	//*  26   63:getstatic       #172 <Field Map H>
	//*  27   66:iload_3         
	//*  28   67:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//*  29   70:invokeinterface #861 <Method boolean Map.containsKey(Object)>
	//*  30   75:ifeq            114
			{
				popupmenu.getMenu().getItem(i1).setVisible(arraylist.contains(H.get(((Object) (Integer.valueOf(j1))))));
	//   31   78:aload           4
	//   32   80:invokevirtual   #838 <Method Menu PopupMenu.getMenu()>
	//   33   83:iload_2         
	//   34   84:invokeinterface #852 <Method MenuItem Menu.getItem(int)>
	//   35   89:aload_1         
	//   36   90:getstatic       #172 <Field Map H>
	//   37   93:iload_3         
	//   38   94:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   39   97:invokeinterface #865 <Method Object Map.get(Object)>
	//   40  102:invokevirtual   #870 <Method boolean ArrayList.contains(Object)>
	//   41  105:invokeinterface #874 <Method MenuItem MenuItem.setVisible(boolean)>
	//   42  110:pop             
			} else
	//*  43  111:goto            169
			{
				String s1 = I;
	//   44  114:getstatic       #621 <Field String I>
	//   45  117:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   46  119:new             #876 <Class StringBuilder>
	//   47  122:dup             
	//   48  123:invokespecial   #877 <Method void StringBuilder()>
	//   49  126:astore          6
				stringbuilder.append("Unmapped menu option: ");
	//   50  128:aload           6
	//   51  130:ldc2            #879 <String "Unmapped menu option: ">
	//   52  133:invokevirtual   #883 <Method StringBuilder StringBuilder.append(String)>
	//   53  136:pop             
				stringbuilder.append(((Object) (popupmenu.getMenu().getItem(i1).getTitle())));
	//   54  137:aload           6
	//   55  139:aload           4
	//   56  141:invokevirtual   #838 <Method Menu PopupMenu.getMenu()>
	//   57  144:iload_2         
	//   58  145:invokeinterface #852 <Method MenuItem Menu.getItem(int)>
	//   59  150:invokeinterface #887 <Method CharSequence MenuItem.getTitle()>
	//   60  155:invokevirtual   #890 <Method StringBuilder StringBuilder.append(Object)>
	//   61  158:pop             
				com.irobot.home.util.o.d(s1, stringbuilder.toString());
	//   62  159:aload           5
	//   63  161:aload           6
	//   64  163:invokevirtual   #893 <Method String StringBuilder.toString()>
	//   65  166:invokestatic    #895 <Method void o.d(String, String)>
			}
		}

	//   66  169:iload_2         
	//   67  170:iconst_1        
	//   68  171:iadd            
	//   69  172:istore_2        
	//*  70  173:goto            32
		popupmenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

			public boolean onMenuItemClick(MenuItem menuitem)
			{
				if(MapCustomizationActivity.h(a) != MapCustomizationViewState.StillLearningMapPreview)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field MapCustomizationActivity a>
			//*   2    4:invokestatic    #26  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
			//*   3    7:getstatic       #32  <Field MapCustomizationViewState MapCustomizationViewState.StillLearningMapPreview>
			//*   4   10:if_acmpeq       35
					a.a(menuitem.getTitle(), menuitem.getItemId());
			//    5   13:aload_0         
			//    6   14:getfield        #16  <Field MapCustomizationActivity a>
			//    7   17:aload_1         
			//    8   18:invokeinterface #38  <Method CharSequence MenuItem.getTitle()>
			//    9   23:aload_1         
			//   10   24:invokeinterface #42  <Method int MenuItem.getItemId()>
			//   11   29:invokevirtual   #45  <Method void com.irobot.home.MapCustomizationActivity.a(CharSequence, int)>
				else
			//*  12   32:goto            48
					a.f(menuitem.getItemId());
			//   13   35:aload_0         
			//   14   36:getfield        #16  <Field MapCustomizationActivity a>
			//   15   39:aload_1         
			//   16   40:invokeinterface #42  <Method int MenuItem.getItemId()>
			//   17   45:invokevirtual   #49  <Method void com.irobot.home.MapCustomizationActivity.f(int)>
				return true;
			//   18   48:iconst_1        
			//   19   49:ireturn         
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   71  176:aload           4
	//   72  178:new             #24  <Class MapCustomizationActivity$16>
	//   73  181:dup             
	//   74  182:aload_0         
	//   75  183:invokespecial   #896 <Method void MapCustomizationActivity$16(MapCustomizationActivity)>
	//   76  186:invokevirtual   #900 <Method void PopupMenu.setOnMenuItemClickListener(android.widget.PopupMenu$OnMenuItemClickListener)>
		popupmenu.show();
	//   77  189:aload           4
	//   78  191:invokevirtual   #901 <Method void PopupMenu.show()>
	//   79  194:return          
	}

	private void a(boolean flag)
	{
		D.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #905 <Field ImageButton D>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #908 <Method void ImageButton.setVisibility(int)>
		A.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #910 <Field LinearLayout A>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #913 <Method void LinearLayout.setVisibility(int)>
		E.setEnabled(flag);
	//    8   16:aload_0         
	//    9   17:getfield        #915 <Field CustomButton E>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #916 <Method void CustomButton.setEnabled(boolean)>
		e(8);
	//   12   24:aload_0         
	//   13   25:bipush          8
	//   14   27:invokevirtual   #580 <Method void e(int)>
	//   15   30:return          
	}

	static int b(MapCustomizationActivity mapcustomizationactivity, int i1)
	{
		mapcustomizationactivity.U = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #280 <Field int U>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void b(MapCustomizationActivity mapcustomizationactivity)
	{
		mapcustomizationactivity.I();
	//    0    0:aload_0         
	//    1    1:invokespecial   #918 <Method void I()>
	//    2    4:return          
	}

	static void b(MapCustomizationActivity mapcustomizationactivity, String s1, String s2)
	{
		mapcustomizationactivity.c(s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #920 <Method void c(String, String)>
	//    4    6:return          
	}

	static void b(MapCustomizationActivity mapcustomizationactivity, boolean flag)
	{
		mapcustomizationactivity.e(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #922 <Method void e(boolean)>
	//    3    5:return          
	}

	private void b(String s1)
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            29
			((ak)G).d().queueEvent(new Runnable(s1) {

				public void run()
				{
					MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
				//    0    0:invokestatic    #31  <Method MapsUIServiceData MapsUIServiceData.create()>
				//    1    3:astore_1        
					mapsuiservicedata.setNewMapName(a);
				//    2    4:aload_1         
				//    3    5:aload_0         
				//    4    6:getfield        #20  <Field String a>
				//    5    9:invokevirtual   #34  <Method void MapsUIServiceData.setNewMapName(String)>
					MapCustomizationActivity.e(b).sendCommand(MapsUIServiceCommand.NewMapName, mapsuiservicedata);
				//    6   12:aload_0         
				//    7   13:getfield        #18  <Field MapCustomizationActivity b>
				//    8   16:invokestatic    #38  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    9   19:getstatic       #44  <Field MapsUIServiceCommand MapsUIServiceCommand.NewMapName>
				//   10   22:aload_1         
				//   11   23:invokevirtual   #50  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//   12   26:return          
				}

				final String a;
				final MapCustomizationActivity b;

			
			{
				b = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MapCustomizationActivity b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #12  <Class MapCustomizationActivity$10>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokespecial   #924 <Method void MapCustomizationActivity$10(MapCustomizationActivity, String)>
	//   12   26:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   13   29:return          
	}

	private void b(String s1, String s2)
	{
		M.sendCommand(MapsUIServiceCommand.GetListOfRegionNames, ((MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #307 <Field MapsUIService M>
	//    2    4:getstatic       #927 <Field MapsUIServiceCommand MapsUIServiceCommand.GetListOfRegionNames>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		com.irobot.home.DuplicateRegionNameActivity_.a(((android.content.Context) (this))).a(s1).a(M.getServiceData().getListOfRegionNames()).a(2);
	//    5   11:aload_0         
	//    6   12:invokestatic    #932 <Method DuplicateRegionNameActivity_$a com.irobot.home.DuplicateRegionNameActivity_.a(android.content.Context)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #937 <Method DuplicateRegionNameActivity_$a com.irobot.home.DuplicateRegionNameActivity_$a.a(String)>
	//    9   19:aload_0         
	//   10   20:getfield        #307 <Field MapsUIService M>
	//   11   23:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   12   26:invokevirtual   #941 <Method ArrayList MapsUIServiceData.getListOfRegionNames()>
	//   13   29:invokevirtual   #944 <Method DuplicateRegionNameActivity_$a com.irobot.home.DuplicateRegionNameActivity_$a.a(ArrayList)>
	//   14   32:iconst_2        
	//   15   33:invokevirtual   #945 <Method org.androidannotations.api.a.e com.irobot.home.DuplicateRegionNameActivity_$a.a(int)>
	//   16   36:pop             
	//   17   37:return          
	}

	private void b(boolean flag)
	{
		D.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #905 <Field ImageButton D>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #908 <Method void ImageButton.setVisibility(int)>
		A.setVisibility(0);
	//    4    9:aload_0         
	//    5   10:getfield        #910 <Field LinearLayout A>
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #913 <Method void LinearLayout.setVisibility(int)>
		E.setEnabled(flag);
	//    8   17:aload_0         
	//    9   18:getfield        #915 <Field CustomButton E>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #916 <Method void CustomButton.setEnabled(boolean)>
	//   12   25:return          
	}

	static BottomSheetBehavior c(MapCustomizationActivity mapcustomizationactivity)
	{
		return mapcustomizationactivity.X;
	//    0    0:aload_0         
	//    1    1:getfield        #348 <Field BottomSheetBehavior X>
	//    2    4:areturn         
	}

	static void c(MapCustomizationActivity mapcustomizationactivity, boolean flag)
	{
		mapcustomizationactivity.f(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #948 <Method void f(boolean)>
	//    3    5:return          
	}

	private void c(String s1)
	{
		K = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #608 <Field String K>
		e(K);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #608 <Field String K>
	//    6   10:invokevirtual   #427 <Method void e(String)>
	//    7   13:return          
	}

	private void c(String s1, String s2)
	{
		J = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #950 <Field String J>
		L = s2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #952 <Field String L>
		t.setVisibility(0);
	//    6   10:aload_0         
	//    7   11:getfield        #418 <Field CustomTextView t>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #423 <Method void CustomTextView.setVisibility(int)>
		t.setText(((CharSequence) (String.format("Id: %1$s \n Version %2$s", new Object[] {
			J, L
		}))));
	//   10   18:aload_0         
	//   11   19:getfield        #418 <Field CustomTextView t>
	//   12   22:ldc2            #954 <String "Id: %1$s \n Version %2$s">
	//   13   25:iconst_2        
	//   14   26:anewarray       Object[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:aload_0         
	//   18   32:getfield        #950 <Field String J>
	//   19   35:aastore         
	//   20   36:dup             
	//   21   37:iconst_1        
	//   22   38:aload_0         
	//   23   39:getfield        #952 <Field String L>
	//   24   42:aastore         
	//   25   43:invokestatic    #958 <Method String String.format(String, Object[])>
	//   26   46:invokevirtual   #478 <Method void CustomTextView.setText(CharSequence)>
	//   27   49:return          
	}

	private void c(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			byte0 = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			byte0 = 4;
	//    5    9:iconst_4        
	//    6   10:istore_2        
		m.setVisibility(((int) (byte0)));
	//    7   11:aload_0         
	//    8   12:getfield        #960 <Field ImageView m>
	//    9   15:iload_2         
	//   10   16:invokevirtual   #455 <Method void ImageView.setVisibility(int)>
	//   11   19:return          
	}

	static void d(MapCustomizationActivity mapcustomizationactivity)
	{
		mapcustomizationactivity.C();
	//    0    0:aload_0         
	//    1    1:invokespecial   #962 <Method void C()>
	//    2    4:return          
	}

	private void d(boolean flag)
	{
	//    0    0:return          
	}

	static boolean d(MapCustomizationActivity mapcustomizationactivity, boolean flag)
	{
		mapcustomizationactivity.ac = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #600 <Field boolean ac>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static MapsUIService e(MapCustomizationActivity mapcustomizationactivity)
	{
		return mapcustomizationactivity.M;
	//    0    0:aload_0         
	//    1    1:getfield        #307 <Field MapsUIService M>
	//    2    4:areturn         
	}

	private void e(boolean flag)
	{
		FloatingActionButton floatingactionbutton = F;
	//    0    0:aload_0         
	//    1    1:getfield        #480 <Field FloatingActionButton F>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            15
			byte0 = 8;
	//    5    9:bipush          8
	//    6   11:istore_2        
		else
	//*   7   12:goto            17
			byte0 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		floatingactionbutton.setVisibility(((int) (byte0)));
	//   10   17:aload_3         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #965 <Method void FloatingActionButton.setVisibility(int)>
	//   13   22:return          
	}

	static a f(MapCustomizationActivity mapcustomizationactivity)
	{
		return mapcustomizationactivity.af;
	//    0    0:aload_0         
	//    1    1:getfield        #968 <Field MapCustomizationActivity$a af>
	//    2    4:areturn         
	}

	private void f(boolean flag)
	{
		if(J != null && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #950 <Field String J>
	//*   2    4:ifnull          108
	//*   3    7:iload_1         
	//*   4    8:ifne            14
	//*   5   11:goto            108
		{
			Object obj;
			if(K != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #608 <Field String K>
	//*   8   18:ifnull          43
				obj = ((Object) (getString(0x7f0f0193, new Object[] {
					K
				})));
	//    9   21:aload_0         
	//   10   22:ldc2            #969 <Int 0x7f0f0193>
	//   11   25:iconst_1        
	//   12   26:anewarray       Object[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:getfield        #608 <Field String K>
	//   17   35:aastore         
	//   18   36:invokevirtual   #630 <Method String getString(int, Object[])>
	//   19   39:astore_2        
			else
	//*  20   40:goto            51
				obj = ((Object) (getString(0x7f0f0194)));
	//   21   43:aload_0         
	//   22   44:ldc2            #970 <Int 0x7f0f0194>
	//   23   47:invokevirtual   #413 <Method String getString(int)>
	//   24   50:astore_2        
			R = (new android.support.v7.app.a.a(((android.content.Context) (this)))).b(((CharSequence) (obj))).a(0x7f0f068c, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					a.f(com.irobot.home.MapCustomizationActivity.j(a));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:aload_0         
				//    3    5:getfield        #17  <Field MapCustomizationActivity a>
				//    4    8:invokestatic    #27  <Method int com.irobot.home.MapCustomizationActivity.j(MapCustomizationActivity)>
				//    5   11:invokevirtual   #30  <Method void com.irobot.home.MapCustomizationActivity.f(int)>
				//    6   14:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
).b(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).c();
	//   25   51:aload_0         
	//   26   52:new             #228 <Class android.support.v7.app.a$a>
	//   27   55:dup             
	//   28   56:aload_0         
	//   29   57:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   30   60:aload_2         
	//   31   61:invokevirtual   #671 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence)>
	//   32   64:ldc2            #971 <Int 0x7f0f068c>
	//   33   67:new             #50  <Class MapCustomizationActivity$27>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #972 <Method void MapCustomizationActivity$27(MapCustomizationActivity)>
	//   37   75:invokevirtual   #243 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   38   78:ldc1            #236 <Int 0x7f0f017d>
	//   39   80:aconst_null     
	//   40   81:invokevirtual   #239 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int, android.content.DialogInterface$OnClickListener)>
	//   41   84:invokevirtual   #246 <Method a android.support.v7.app.a$a.c()>
	//   42   87:putfield        #974 <Field a R>
			obj = ((Object) (com.irobot.home.util.j.j().a()));
	//   43   90:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//   44   93:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//   45   96:astore_2        
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.CleanScheduleTwoChangeLayoutPrompt, ((AssetInfo) (obj)));
	//   46   97:invokestatic    #518 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   47  100:getstatic       #977 <Field ViewId ViewId.CleanScheduleTwoChangeLayoutPrompt>
	//   48  103:aload_2         
	//   49  104:invokevirtual   #528 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
			return;
	//   50  107:return          
		} else
		{
			f(ae);
	//   51  108:aload_0         
	//   52  109:aload_0         
	//   53  110:getfield        #979 <Field int ae>
	//   54  113:invokevirtual   #981 <Method void f(int)>
			return;
	//   55  116:return          
		}
	}

	static void g(MapCustomizationActivity mapcustomizationactivity)
	{
		((PersistentMapActivity) (mapcustomizationactivity)).PersistentMapActivity.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #984 <Method void PersistentMapActivity.onBackPressed()>
	//    2    4:return          
	}

	static MapCustomizationViewState h(MapCustomizationActivity mapcustomizationactivity)
	{
		return mapcustomizationactivity.Z;
	//    0    0:aload_0         
	//    1    1:getfield        #678 <Field MapCustomizationViewState Z>
	//    2    4:areturn         
	}

	static void i(MapCustomizationActivity mapcustomizationactivity)
	{
		((PersistentMapActivity) (mapcustomizationactivity)).PersistentMapActivity.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #984 <Method void PersistentMapActivity.onBackPressed()>
	//    2    4:return          
	}

	static int j(MapCustomizationActivity mapcustomizationactivity)
	{
		return mapcustomizationactivity.ae;
	//    0    0:aload_0         
	//    1    1:getfield        #979 <Field int ae>
	//    2    4:ireturn         
	}

	static String t()
	{
		return I;
	//    0    0:getstatic       #621 <Field String I>
	//    1    3:areturn         
	}

	private void x()
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #462 <Method Resources getResources()>
	//    2    4:astore_1        
		ab = new HashMap();
	//    3    5:aload_0         
	//    4    6:new             #167 <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #170 <Method void HashMap()>
	//    7   13:putfield        #988 <Field HashMap ab>
		ab.put(((Object) (RegionType.Unknown)), "");
	//    8   16:aload_0         
	//    9   17:getfield        #988 <Field HashMap ab>
	//   10   20:getstatic       #994 <Field RegionType RegionType.Unknown>
	//   11   23:ldc2            #781 <String "">
	//   12   26:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   13   29:pop             
		ab.put(((Object) (RegionType.Basement)), ((Object) (resources.getString(0x7f0f0626))));
	//   14   30:aload_0         
	//   15   31:getfield        #988 <Field HashMap ab>
	//   16   34:getstatic       #997 <Field RegionType RegionType.Basement>
	//   17   37:aload_1         
	//   18   38:ldc2            #998 <Int 0x7f0f0626>
	//   19   41:invokevirtual   #999 <Method String Resources.getString(int)>
	//   20   44:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   21   47:pop             
		ab.put(((Object) (RegionType.Bathroom)), ((Object) (resources.getString(0x7f0f0627))));
	//   22   48:aload_0         
	//   23   49:getfield        #988 <Field HashMap ab>
	//   24   52:getstatic       #1002 <Field RegionType RegionType.Bathroom>
	//   25   55:aload_1         
	//   26   56:ldc2            #1003 <Int 0x7f0f0627>
	//   27   59:invokevirtual   #999 <Method String Resources.getString(int)>
	//   28   62:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   29   65:pop             
		ab.put(((Object) (RegionType.Bedroom)), ((Object) (resources.getString(0x7f0f0628))));
	//   30   66:aload_0         
	//   31   67:getfield        #988 <Field HashMap ab>
	//   32   70:getstatic       #1006 <Field RegionType RegionType.Bedroom>
	//   33   73:aload_1         
	//   34   74:ldc2            #1007 <Int 0x7f0f0628>
	//   35   77:invokevirtual   #999 <Method String Resources.getString(int)>
	//   36   80:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   37   83:pop             
		ab.put(((Object) (RegionType.BreakfastRoom)), ((Object) (resources.getString(0x7f0f0629))));
	//   38   84:aload_0         
	//   39   85:getfield        #988 <Field HashMap ab>
	//   40   88:getstatic       #1010 <Field RegionType RegionType.BreakfastRoom>
	//   41   91:aload_1         
	//   42   92:ldc2            #1011 <Int 0x7f0f0629>
	//   43   95:invokevirtual   #999 <Method String Resources.getString(int)>
	//   44   98:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   45  101:pop             
		ab.put(((Object) (RegionType.Closet)), ((Object) (resources.getString(0x7f0f062a))));
	//   46  102:aload_0         
	//   47  103:getfield        #988 <Field HashMap ab>
	//   48  106:getstatic       #1014 <Field RegionType RegionType.Closet>
	//   49  109:aload_1         
	//   50  110:ldc2            #1015 <Int 0x7f0f062a>
	//   51  113:invokevirtual   #999 <Method String Resources.getString(int)>
	//   52  116:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   53  119:pop             
		ab.put(((Object) (RegionType.Den)), ((Object) (resources.getString(0x7f0f063f))));
	//   54  120:aload_0         
	//   55  121:getfield        #988 <Field HashMap ab>
	//   56  124:getstatic       #1018 <Field RegionType RegionType.Den>
	//   57  127:aload_1         
	//   58  128:ldc2            #1019 <Int 0x7f0f063f>
	//   59  131:invokevirtual   #999 <Method String Resources.getString(int)>
	//   60  134:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   61  137:pop             
		ab.put(((Object) (RegionType.DiningRoom)), ((Object) (resources.getString(0x7f0f0640))));
	//   62  138:aload_0         
	//   63  139:getfield        #988 <Field HashMap ab>
	//   64  142:getstatic       #1022 <Field RegionType RegionType.DiningRoom>
	//   65  145:aload_1         
	//   66  146:ldc2            #1023 <Int 0x7f0f0640>
	//   67  149:invokevirtual   #999 <Method String Resources.getString(int)>
	//   68  152:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   69  155:pop             
		ab.put(((Object) (RegionType.Entryway)), ((Object) (resources.getString(0x7f0f0643))));
	//   70  156:aload_0         
	//   71  157:getfield        #988 <Field HashMap ab>
	//   72  160:getstatic       #1026 <Field RegionType RegionType.Entryway>
	//   73  163:aload_1         
	//   74  164:ldc2            #1027 <Int 0x7f0f0643>
	//   75  167:invokevirtual   #999 <Method String Resources.getString(int)>
	//   76  170:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   77  173:pop             
		ab.put(((Object) (RegionType.FamilyRoom)), ((Object) (resources.getString(0x7f0f0644))));
	//   78  174:aload_0         
	//   79  175:getfield        #988 <Field HashMap ab>
	//   80  178:getstatic       #1030 <Field RegionType RegionType.FamilyRoom>
	//   81  181:aload_1         
	//   82  182:ldc2            #1031 <Int 0x7f0f0644>
	//   83  185:invokevirtual   #999 <Method String Resources.getString(int)>
	//   84  188:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   85  191:pop             
		ab.put(((Object) (RegionType.Foyer)), ((Object) (resources.getString(0x7f0f0647))));
	//   86  192:aload_0         
	//   87  193:getfield        #988 <Field HashMap ab>
	//   88  196:getstatic       #1034 <Field RegionType RegionType.Foyer>
	//   89  199:aload_1         
	//   90  200:ldc2            #1035 <Int 0x7f0f0647>
	//   91  203:invokevirtual   #999 <Method String Resources.getString(int)>
	//   92  206:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//   93  209:pop             
		ab.put(((Object) (RegionType.Garage)), ((Object) (resources.getString(0x7f0f0648))));
	//   94  210:aload_0         
	//   95  211:getfield        #988 <Field HashMap ab>
	//   96  214:getstatic       #1038 <Field RegionType RegionType.Garage>
	//   97  217:aload_1         
	//   98  218:ldc2            #1039 <Int 0x7f0f0648>
	//   99  221:invokevirtual   #999 <Method String Resources.getString(int)>
	//  100  224:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  101  227:pop             
		ab.put(((Object) (RegionType.GuestBathroom)), ((Object) (resources.getString(0x7f0f0649))));
	//  102  228:aload_0         
	//  103  229:getfield        #988 <Field HashMap ab>
	//  104  232:getstatic       #1042 <Field RegionType RegionType.GuestBathroom>
	//  105  235:aload_1         
	//  106  236:ldc2            #1043 <Int 0x7f0f0649>
	//  107  239:invokevirtual   #999 <Method String Resources.getString(int)>
	//  108  242:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  109  245:pop             
		ab.put(((Object) (RegionType.GuestBedroom)), ((Object) (resources.getString(0x7f0f064a))));
	//  110  246:aload_0         
	//  111  247:getfield        #988 <Field HashMap ab>
	//  112  250:getstatic       #1046 <Field RegionType RegionType.GuestBedroom>
	//  113  253:aload_1         
	//  114  254:ldc2            #1047 <Int 0x7f0f064a>
	//  115  257:invokevirtual   #999 <Method String Resources.getString(int)>
	//  116  260:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  117  263:pop             
		ab.put(((Object) (RegionType.Hallway)), ((Object) (resources.getString(0x7f0f064b))));
	//  118  264:aload_0         
	//  119  265:getfield        #988 <Field HashMap ab>
	//  120  268:getstatic       #1050 <Field RegionType RegionType.Hallway>
	//  121  271:aload_1         
	//  122  272:ldc2            #1051 <Int 0x7f0f064b>
	//  123  275:invokevirtual   #999 <Method String Resources.getString(int)>
	//  124  278:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  125  281:pop             
		ab.put(((Object) (RegionType.Kitchen)), ((Object) (resources.getString(0x7f0f065b))));
	//  126  282:aload_0         
	//  127  283:getfield        #988 <Field HashMap ab>
	//  128  286:getstatic       #1054 <Field RegionType RegionType.Kitchen>
	//  129  289:aload_1         
	//  130  290:ldc2            #1055 <Int 0x7f0f065b>
	//  131  293:invokevirtual   #999 <Method String Resources.getString(int)>
	//  132  296:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  133  299:pop             
		ab.put(((Object) (RegionType.LaundryRoom)), ((Object) (resources.getString(0x7f0f0661))));
	//  134  300:aload_0         
	//  135  301:getfield        #988 <Field HashMap ab>
	//  136  304:getstatic       #1058 <Field RegionType RegionType.LaundryRoom>
	//  137  307:aload_1         
	//  138  308:ldc2            #1059 <Int 0x7f0f0661>
	//  139  311:invokevirtual   #999 <Method String Resources.getString(int)>
	//  140  314:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  141  317:pop             
		ab.put(((Object) (RegionType.LivingRoom)), ((Object) (resources.getString(0x7f0f0662))));
	//  142  318:aload_0         
	//  143  319:getfield        #988 <Field HashMap ab>
	//  144  322:getstatic       #1062 <Field RegionType RegionType.LivingRoom>
	//  145  325:aload_1         
	//  146  326:ldc2            #1063 <Int 0x7f0f0662>
	//  147  329:invokevirtual   #999 <Method String Resources.getString(int)>
	//  148  332:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  149  335:pop             
		ab.put(((Object) (RegionType.Lounge)), ((Object) (resources.getString(0x7f0f0663))));
	//  150  336:aload_0         
	//  151  337:getfield        #988 <Field HashMap ab>
	//  152  340:getstatic       #1066 <Field RegionType RegionType.Lounge>
	//  153  343:aload_1         
	//  154  344:ldc2            #1067 <Int 0x7f0f0663>
	//  155  347:invokevirtual   #999 <Method String Resources.getString(int)>
	//  156  350:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  157  353:pop             
		ab.put(((Object) (RegionType.MasterBathroom)), ((Object) (resources.getString(0x7f0f0665))));
	//  158  354:aload_0         
	//  159  355:getfield        #988 <Field HashMap ab>
	//  160  358:getstatic       #1070 <Field RegionType RegionType.MasterBathroom>
	//  161  361:aload_1         
	//  162  362:ldc2            #1071 <Int 0x7f0f0665>
	//  163  365:invokevirtual   #999 <Method String Resources.getString(int)>
	//  164  368:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  165  371:pop             
		ab.put(((Object) (RegionType.MasterBedroom)), ((Object) (resources.getString(0x7f0f0666))));
	//  166  372:aload_0         
	//  167  373:getfield        #988 <Field HashMap ab>
	//  168  376:getstatic       #1074 <Field RegionType RegionType.MasterBedroom>
	//  169  379:aload_1         
	//  170  380:ldc2            #1075 <Int 0x7f0f0666>
	//  171  383:invokevirtual   #999 <Method String Resources.getString(int)>
	//  172  386:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  173  389:pop             
		ab.put(((Object) (RegionType.MediaRoom)), ((Object) (resources.getString(0x7f0f0667))));
	//  174  390:aload_0         
	//  175  391:getfield        #988 <Field HashMap ab>
	//  176  394:getstatic       #1078 <Field RegionType RegionType.MediaRoom>
	//  177  397:aload_1         
	//  178  398:ldc2            #1079 <Int 0x7f0f0667>
	//  179  401:invokevirtual   #999 <Method String Resources.getString(int)>
	//  180  404:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  181  407:pop             
		ab.put(((Object) (RegionType.MudRoom)), ((Object) (resources.getString(0x7f0f0669))));
	//  182  408:aload_0         
	//  183  409:getfield        #988 <Field HashMap ab>
	//  184  412:getstatic       #1082 <Field RegionType RegionType.MudRoom>
	//  185  415:aload_1         
	//  186  416:ldc2            #1083 <Int 0x7f0f0669>
	//  187  419:invokevirtual   #999 <Method String Resources.getString(int)>
	//  188  422:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  189  425:pop             
		ab.put(((Object) (RegionType.Office)), ((Object) (resources.getString(0x7f0f066d))));
	//  190  426:aload_0         
	//  191  427:getfield        #988 <Field HashMap ab>
	//  192  430:getstatic       #1086 <Field RegionType RegionType.Office>
	//  193  433:aload_1         
	//  194  434:ldc2            #1087 <Int 0x7f0f066d>
	//  195  437:invokevirtual   #999 <Method String Resources.getString(int)>
	//  196  440:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  197  443:pop             
		ab.put(((Object) (RegionType.Pantry)), ((Object) (resources.getString(0x7f0f066f))));
	//  198  444:aload_0         
	//  199  445:getfield        #988 <Field HashMap ab>
	//  200  448:getstatic       #1090 <Field RegionType RegionType.Pantry>
	//  201  451:aload_1         
	//  202  452:ldc2            #1091 <Int 0x7f0f066f>
	//  203  455:invokevirtual   #999 <Method String Resources.getString(int)>
	//  204  458:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  205  461:pop             
		ab.put(((Object) (RegionType.Playroom)), ((Object) (resources.getString(0x7f0f0673))));
	//  206  462:aload_0         
	//  207  463:getfield        #988 <Field HashMap ab>
	//  208  466:getstatic       #1094 <Field RegionType RegionType.Playroom>
	//  209  469:aload_1         
	//  210  470:ldc2            #1095 <Int 0x7f0f0673>
	//  211  473:invokevirtual   #999 <Method String Resources.getString(int)>
	//  212  476:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  213  479:pop             
		ab.put(((Object) (RegionType.StorageRoom)), ((Object) (resources.getString(0x7f0f067e))));
	//  214  480:aload_0         
	//  215  481:getfield        #988 <Field HashMap ab>
	//  216  484:getstatic       #1098 <Field RegionType RegionType.StorageRoom>
	//  217  487:aload_1         
	//  218  488:ldc2            #1099 <Int 0x7f0f067e>
	//  219  491:invokevirtual   #999 <Method String Resources.getString(int)>
	//  220  494:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  221  497:pop             
		ab.put(((Object) (RegionType.Study)), ((Object) (resources.getString(0x7f0f067f))));
	//  222  498:aload_0         
	//  223  499:getfield        #988 <Field HashMap ab>
	//  224  502:getstatic       #1102 <Field RegionType RegionType.Study>
	//  225  505:aload_1         
	//  226  506:ldc2            #1103 <Int 0x7f0f067f>
	//  227  509:invokevirtual   #999 <Method String Resources.getString(int)>
	//  228  512:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  229  515:pop             
		ab.put(((Object) (RegionType.SunRoom)), ((Object) (resources.getString(0x7f0f0680))));
	//  230  516:aload_0         
	//  231  517:getfield        #988 <Field HashMap ab>
	//  232  520:getstatic       #1106 <Field RegionType RegionType.SunRoom>
	//  233  523:aload_1         
	//  234  524:ldc2            #1107 <Int 0x7f0f0680>
	//  235  527:invokevirtual   #999 <Method String Resources.getString(int)>
	//  236  530:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  237  533:pop             
		ab.put(((Object) (RegionType.Workshop)), ((Object) (resources.getString(0x7f0f068b))));
	//  238  534:aload_0         
	//  239  535:getfield        #988 <Field HashMap ab>
	//  240  538:getstatic       #1110 <Field RegionType RegionType.Workshop>
	//  241  541:aload_1         
	//  242  542:ldc2            #1111 <Int 0x7f0f068b>
	//  243  545:invokevirtual   #999 <Method String Resources.getString(int)>
	//  244  548:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  245  551:pop             
		ab.put(((Object) (RegionType.Custom)), ((Object) (resources.getString(0x7f0f063a))));
	//  246  552:aload_0         
	//  247  553:getfield        #988 <Field HashMap ab>
	//  248  556:getstatic       #1114 <Field RegionType RegionType.Custom>
	//  249  559:aload_1         
	//  250  560:ldc2            #1115 <Int 0x7f0f063a>
	//  251  563:invokevirtual   #999 <Method String Resources.getString(int)>
	//  252  566:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
	//  253  569:pop             
	//  254  570:return          
	}

	private void y()
	{
		X = BottomSheetBehavior.b(((View) (h)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #814 <Field FrameLayout h>
	//    3    5:invokestatic    #1118 <Method BottomSheetBehavior BottomSheetBehavior.b(View)>
	//    4    8:putfield        #348 <Field BottomSheetBehavior X>
		h.setVisibility(4);
	//    5   11:aload_0         
	//    6   12:getfield        #814 <Field FrameLayout h>
	//    7   15:iconst_4        
	//    8   16:invokevirtual   #817 <Method void FrameLayout.setVisibility(int)>
		X.b(3);
	//    9   19:aload_0         
	//   10   20:getfield        #348 <Field BottomSheetBehavior X>
	//   11   23:iconst_3        
	//   12   24:invokevirtual   #359 <Method void BottomSheetBehavior.b(int)>
		h.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				com.irobot.home.MapCustomizationActivity.a(a, a.h.getHeight());
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MapCustomizationActivity a>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field MapCustomizationActivity a>
			//    4    8:getfield        #25  <Field FrameLayout MapCustomizationActivity.h>
			//    5   11:invokevirtual   #31  <Method int FrameLayout.getHeight()>
			//    6   14:invokestatic    #34  <Method int com.irobot.home.MapCustomizationActivity.a(MapCustomizationActivity, int)>
			//    7   17:pop             
				MapCustomizationActivity.b(a, a.h.getWidth());
			//    8   18:aload_0         
			//    9   19:getfield        #17  <Field MapCustomizationActivity a>
			//   10   22:aload_0         
			//   11   23:getfield        #17  <Field MapCustomizationActivity a>
			//   12   26:getfield        #25  <Field FrameLayout MapCustomizationActivity.h>
			//   13   29:invokevirtual   #37  <Method int FrameLayout.getWidth()>
			//   14   32:invokestatic    #40  <Method int MapCustomizationActivity.b(MapCustomizationActivity, int)>
			//   15   35:pop             
				a.h.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
			//   16   36:aload_0         
			//   17   37:getfield        #17  <Field MapCustomizationActivity a>
			//   18   40:getfield        #25  <Field FrameLayout MapCustomizationActivity.h>
			//   19   43:invokevirtual   #44  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
			//   20   46:aload_0         
			//   21   47:invokevirtual   #50  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				MapCustomizationActivity.c(a).b(5);
			//   22   50:aload_0         
			//   23   51:getfield        #17  <Field MapCustomizationActivity a>
			//   24   54:invokestatic    #54  <Method BottomSheetBehavior MapCustomizationActivity.c(MapCustomizationActivity)>
			//   25   57:iconst_5        
			//   26   58:invokevirtual   #59  <Method void BottomSheetBehavior.b(int)>
				MapCustomizationActivity.d(a);
			//   27   61:aload_0         
			//   28   62:getfield        #17  <Field MapCustomizationActivity a>
			//   29   65:invokestatic    #62  <Method void MapCustomizationActivity.d(MapCustomizationActivity)>
			//   30   68:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   13   27:aload_0         
	//   14   28:getfield        #814 <Field FrameLayout h>
	//   15   31:invokevirtual   #1122 <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//   16   34:new             #54  <Class MapCustomizationActivity$29>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #1123 <Method void MapCustomizationActivity$29(MapCustomizationActivity)>
	//   20   42:invokevirtual   #1129 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		X.a(((android.support.design.widget.BottomSheetBehavior.a) (new android.support.design.widget.BottomSheetBehavior.a() {

			public void a(View view, float f1)
			{
			//    0    0:return          
			}

			public void a(View view, int i1)
			{
				if(i1 == 1)
			//*   0    0:iload_2         
			//*   1    1:iconst_1        
			//*   2    2:icmpne          17
				{
					MapCustomizationActivity.c(a).a(false);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field MapCustomizationActivity a>
			//    5    9:invokestatic    #24  <Method BottomSheetBehavior MapCustomizationActivity.c(MapCustomizationActivity)>
			//    6   12:iconst_0        
			//    7   13:invokevirtual   #29  <Method void BottomSheetBehavior.a(boolean)>
					return;
			//    8   16:return          
				} else
				{
					MapCustomizationActivity.c(a).a(true);
			//    9   17:aload_0         
			//   10   18:getfield        #15  <Field MapCustomizationActivity a>
			//   11   21:invokestatic    #24  <Method BottomSheetBehavior MapCustomizationActivity.c(MapCustomizationActivity)>
			//   12   24:iconst_1        
			//   13   25:invokevirtual   #29  <Method void BottomSheetBehavior.a(boolean)>
					return;
			//   14   28:return          
				}
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.support.design.widget.BottomSheetBehavior$a()>
			//    5    9:return          
			}
		}
)));
	//   21   45:aload_0         
	//   22   46:getfield        #348 <Field BottomSheetBehavior X>
	//   23   49:new             #58  <Class MapCustomizationActivity$30>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:invokespecial   #1130 <Method void MapCustomizationActivity$30(MapCustomizationActivity)>
	//   27   57:invokevirtual   #1133 <Method void BottomSheetBehavior.a(android.support.design.widget.BottomSheetBehavior$a)>
	//   28   60:return          
	}

	private boolean z()
	{
		return (G instanceof ak) && ((ak)G).d() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    2    4:instanceof      #499 <Class ak>
	//    3    7:ifeq            25
	//    4   10:aload_0         
	//    5   11:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    6   14:checkcast       #499 <Class ak>
	//    7   17:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    8   20:ifnull          25
	//    9   23:iconst_1        
	//   10   24:ireturn         
	//   11   25:iconst_0        
	//   12   26:ireturn         
	}

	public void a(Bitmap bitmap)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #876 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #877 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(J);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #950 <Field String J>
	//    7   13:invokevirtual   #883 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("_");
	//    9   17:aload_2         
	//   10   18:ldc2            #1136 <String "_">
	//   11   21:invokevirtual   #883 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(L);
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #952 <Field String L>
	//   16   30:invokevirtual   #883 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		bitmap = ((Bitmap) (com.irobot.home.util.f.a(stringbuilder.toString(), bitmap, ((android.content.Context) (this)))));
	//   18   34:aload_2         
	//   19   35:invokevirtual   #893 <Method String StringBuilder.toString()>
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:invokestatic    #1141 <Method String f.a(String, Bitmap, android.content.Context)>
	//   23   43:astore_1        
		com.irobot.home.PersistentMapFeedbackActivity_.a(((android.content.Context) (this))).b(((String) (bitmap))).a(b).c(J).d(L).a(1);
	//   24   44:aload_0         
	//   25   45:invokestatic    #1146 <Method PersistentMapFeedbackActivity_$a com.irobot.home.PersistentMapFeedbackActivity_.a(android.content.Context)>
	//   26   48:aload_1         
	//   27   49:invokevirtual   #1151 <Method PersistentMapFeedbackActivity_$a PersistentMapFeedbackActivity_$a.b(String)>
	//   28   52:aload_0         
	//   29   53:getfield        #663 <Field String b>
	//   30   56:invokevirtual   #1153 <Method PersistentMapFeedbackActivity_$a com.irobot.home.PersistentMapFeedbackActivity_$a.a(String)>
	//   31   59:aload_0         
	//   32   60:getfield        #950 <Field String J>
	//   33   63:invokevirtual   #1155 <Method PersistentMapFeedbackActivity_$a PersistentMapFeedbackActivity_$a.c(String)>
	//   34   66:aload_0         
	//   35   67:getfield        #952 <Field String L>
	//   36   70:invokevirtual   #1157 <Method PersistentMapFeedbackActivity_$a PersistentMapFeedbackActivity_$a.d(String)>
	//   37   73:iconst_1        
	//   38   74:invokevirtual   #1158 <Method org.androidannotations.api.a.e com.irobot.home.PersistentMapFeedbackActivity_$a.a(int)>
	//   39   77:pop             
	//   40   78:return          
	}

	public void a(RegionTypeTableItem regiontypetableitem, String s1)
	{
		aa = regiontypetableitem;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1161 <Field RegionTypeTableItem aa>
		if(regiontypetableitem.getRegionType() == RegionType.Custom)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #1167 <Method RegionType RegionTypeTableItem.getRegionType()>
	//*   5    9:getstatic       #1114 <Field RegionType RegionType.Custom>
	//*   6   12:if_acmpne       56
		{
			M.sendCommand(MapsUIServiceCommand.GetListOfRegionNames, ((MapsUIServiceData) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #307 <Field MapsUIService M>
	//    9   19:getstatic       #927 <Field MapsUIServiceCommand MapsUIServiceCommand.GetListOfRegionNames>
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			com.irobot.home.EnterRegionTypeActivity_.a(((android.content.Context) (this))).a(b).a(M.getServiceData().getListOfRegionNames()).a(3);
	//   12   26:aload_0         
	//   13   27:invokestatic    #1172 <Method EnterRegionTypeActivity_$a com.irobot.home.EnterRegionTypeActivity_.a(android.content.Context)>
	//   14   30:aload_0         
	//   15   31:getfield        #663 <Field String b>
	//   16   34:invokevirtual   #1177 <Method EnterRegionTypeActivity_$a com.irobot.home.EnterRegionTypeActivity_$a.a(String)>
	//   17   37:aload_0         
	//   18   38:getfield        #307 <Field MapsUIService M>
	//   19   41:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//   20   44:invokevirtual   #941 <Method ArrayList MapsUIServiceData.getListOfRegionNames()>
	//   21   47:invokevirtual   #1180 <Method EnterRegionTypeActivity_$a com.irobot.home.EnterRegionTypeActivity_$a.a(ArrayList)>
	//   22   50:iconst_3        
	//   23   51:invokevirtual   #1181 <Method org.androidannotations.api.a.e com.irobot.home.EnterRegionTypeActivity_$a.a(int)>
	//   24   54:pop             
			return;
	//   25   55:return          
		} else
		{
			a(regiontypetableitem.getRegionType(), s1);
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:invokevirtual   #1167 <Method RegionType RegionTypeTableItem.getRegionType()>
	//   29   61:aload_2         
	//   30   62:invokespecial   #1183 <Method void a(RegionType, String)>
			return;
	//   31   65:return          
		}
	}

	protected void a(CharSequence charsequence, int i1)
	{
		if(J == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #950 <Field String J>
	//*   2    4:ifnonnull       13
		{
			f(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #948 <Method void f(boolean)>
			return;
	//    6   12:return          
		} else
		{
			ae = i1;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:putfield        #979 <Field int ae>
			charsequence = ((CharSequence) (ScheduleUIServiceData.create()));
	//   10   18:invokestatic    #1189 <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//   11   21:astore_1        
			((ScheduleUIServiceData) (charsequence)).setMapId(J);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #950 <Field String J>
	//   15   27:invokevirtual   #1192 <Method void ScheduleUIServiceData.setMapId(String)>
			ad.sendCommand(ScheduleUIServiceCommand.CheckIfSchedulesContainsMapId, ((ScheduleUIServiceData) (charsequence)));
	//   16   30:aload_0         
	//   17   31:getfield        #1194 <Field ScheduleUIService ad>
	//   18   34:getstatic       #1200 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CheckIfSchedulesContainsMapId>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #1205 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
			return;
	//   21   41:return          
		}
	}

	protected void a(String s1)
	{
		N.show();
	//    0    0:aload_0         
	//    1    1:getfield        #1207 <Field a N>
	//    2    4:invokevirtual   #401 <Method void a.show()>
		((CustomTextView)N.findViewById(0x7f090431)).setText(((CharSequence) (s1)));
	//    3    7:aload_0         
	//    4    8:getfield        #1207 <Field a N>
	//    5   11:ldc2            #1208 <Int 0x7f090431>
	//    6   14:invokevirtual   #1209 <Method View a.findViewById(int)>
	//    7   17:checkcast       #420 <Class CustomTextView>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #478 <Method void CustomTextView.setText(CharSequence)>
	//   10   24:return          
	}

	public void a_()
	{
		if(G != null && (G instanceof ak))
	//*   0    0:aload_0         
	//*   1    1:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*   2    4:ifnull          49
	//*   3    7:aload_0         
	//*   4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*   5   11:instanceof      #499 <Class ak>
	//*   6   14:ifeq            49
		{
			V = ((ak)G).g();
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   10   22:checkcast       #499 <Class ak>
	//   11   25:invokevirtual   #1212 <Method int ak.g()>
	//   12   28:putfield        #276 <Field int V>
			W = ((ak)G).h();
	//   13   31:aload_0         
	//   14   32:aload_0         
	//   15   33:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   16   36:checkcast       #499 <Class ak>
	//   17   39:invokevirtual   #1214 <Method int ak.h()>
	//   18   42:putfield        #285 <Field int W>
			C();
	//   19   45:aload_0         
	//   20   46:invokespecial   #962 <Method void C()>
		}
	//   21   49:return          
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
		b(0x7f0f0461);
	//    0    0:aload_0         
	//    1    1:ldc2            #1216 <Int 0x7f0f0461>
	//    2    4:invokevirtual   #563 <Method void b(int)>
		Object obj = ((Object) (LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b009f, ((android.view.ViewGroup) (null)))));
	//    3    7:aload_0         
	//    4    8:invokestatic    #371 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    5   11:ldc2            #1217 <Int 0x7f0b009f>
	//    6   14:aconst_null     
	//    7   15:invokevirtual   #376 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    8   18:astore_1        
		N = (new android.support.v7.app.a.a(((android.content.Context) (this)))).b(((View) (obj))).b();
	//    9   19:aload_0         
	//   10   20:new             #228 <Class android.support.v7.app.a$a>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #388 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(View)>
	//   16   32:invokevirtual   #397 <Method a android.support.v7.app.a$a.b()>
	//   17   35:putfield        #1207 <Field a N>
		N.getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (new ColorDrawable(0))));
	//   18   38:aload_0         
	//   19   39:getfield        #1207 <Field a N>
	//   20   42:invokevirtual   #1221 <Method Window a.getWindow()>
	//   21   45:new             #1223 <Class ColorDrawable>
	//   22   48:dup             
	//   23   49:iconst_0        
	//   24   50:invokespecial   #1225 <Method void ColorDrawable(int)>
	//   25   53:invokevirtual   #1231 <Method void Window.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		N.setCanceledOnTouchOutside(false);
	//   26   56:aload_0         
	//   27   57:getfield        #1207 <Field a N>
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #1234 <Method void a.setCanceledOnTouchOutside(boolean)>
		Q = new ArrayList();
	//   30   64:aload_0         
	//   31   65:new             #867 <Class ArrayList>
	//   32   68:dup             
	//   33   69:invokespecial   #1235 <Method void ArrayList()>
	//   34   72:putfield        #1237 <Field ArrayList Q>
		Q.add(((Object) (g)));
	//   35   75:aload_0         
	//   36   76:getfield        #1237 <Field ArrayList Q>
	//   37   79:aload_0         
	//   38   80:getfield        #572 <Field CustomButton g>
	//   39   83:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   40   86:pop             
		Q.add(((Object) (j)));
	//   41   87:aload_0         
	//   42   88:getfield        #1237 <Field ArrayList Q>
	//   43   91:aload_0         
	//   44   92:getfield        #565 <Field CustomTextView j>
	//   45   95:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   46   98:pop             
		Q.add(((Object) (l)));
	//   47   99:aload_0         
	//   48  100:getfield        #1237 <Field ArrayList Q>
	//   49  103:aload_0         
	//   50  104:getfield        #452 <Field ImageView l>
	//   51  107:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   52  110:pop             
		Q.add(((Object) (m)));
	//   53  111:aload_0         
	//   54  112:getfield        #1237 <Field ArrayList Q>
	//   55  115:aload_0         
	//   56  116:getfield        #960 <Field ImageView m>
	//   57  119:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   58  122:pop             
		Q.add(((Object) (n)));
	//   59  123:aload_0         
	//   60  124:getfield        #1237 <Field ArrayList Q>
	//   61  127:aload_0         
	//   62  128:getfield        #570 <Field CustomTextView n>
	//   63  131:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   64  134:pop             
		Q.add(((Object) (o)));
	//   65  135:aload_0         
	//   66  136:getfield        #1237 <Field ArrayList Q>
	//   67  139:aload_0         
	//   68  140:getfield        #598 <Field CustomTextView o>
	//   69  143:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   70  146:pop             
		Q.add(((Object) (t)));
	//   71  147:aload_0         
	//   72  148:getfield        #1237 <Field ArrayList Q>
	//   73  151:aload_0         
	//   74  152:getfield        #418 <Field CustomTextView t>
	//   75  155:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   76  158:pop             
		Q.add(((Object) (u)));
	//   77  159:aload_0         
	//   78  160:getfield        #1237 <Field ArrayList Q>
	//   79  163:aload_0         
	//   80  164:getfield        #530 <Field CustomTextView u>
	//   81  167:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   82  170:pop             
		Q.add(((Object) (v)));
	//   83  171:aload_0         
	//   84  172:getfield        #1237 <Field ArrayList Q>
	//   85  175:aload_0         
	//   86  176:getfield        #1242 <Field CustomTextView v>
	//   87  179:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   88  182:pop             
		Q.add(((Object) (w)));
	//   89  183:aload_0         
	//   90  184:getfield        #1237 <Field ArrayList Q>
	//   91  187:aload_0         
	//   92  188:getfield        #534 <Field CustomTextView w>
	//   93  191:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//   94  194:pop             
		Q.add(((Object) (x)));
	//   95  195:aload_0         
	//   96  196:getfield        #1237 <Field ArrayList Q>
	//   97  199:aload_0         
	//   98  200:getfield        #532 <Field CustomTextView x>
	//   99  203:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//  100  206:pop             
		Q.add(((Object) (f)));
	//  101  207:aload_0         
	//  102  208:getfield        #1237 <Field ArrayList Q>
	//  103  211:aload_0         
	//  104  212:getfield        #536 <Field CustomButton f>
	//  105  215:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//  106  218:pop             
		Q.add(((Object) (y)));
	//  107  219:aload_0         
	//  108  220:getfield        #1237 <Field ArrayList Q>
	//  109  223:aload_0         
	//  110  224:getfield        #445 <Field PercentageRingView y>
	//  111  227:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//  112  230:pop             
		Q.add(((Object) (z)));
	//  113  231:aload_0         
	//  114  232:getfield        #1237 <Field ArrayList Q>
	//  115  235:aload_0         
	//  116  236:getfield        #450 <Field CustomTextView z>
	//  117  239:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//  118  242:pop             
		Q.add(((Object) (A)));
	//  119  243:aload_0         
	//  120  244:getfield        #1237 <Field ArrayList Q>
	//  121  247:aload_0         
	//  122  248:getfield        #910 <Field LinearLayout A>
	//  123  251:invokevirtual   #1240 <Method boolean ArrayList.add(Object)>
	//  124  254:pop             
		obj = ((Object) (com.irobot.home.util.j.a(b).a()));
	//  125  255:aload_0         
	//  126  256:getfield        #663 <Field String b>
	//  127  259:invokestatic    #666 <Method com.irobot.home.model.a j.a(String)>
	//  128  262:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//  129  265:astore_1        
		Assembler assembler = Assembler.getInstance();
	//  130  266:invokestatic    #1247 <Method Assembler Assembler.getInstance()>
	//  131  269:astore_2        
		M = assembler.getMapsUIService(((AssetInfo) (obj)).getAssetId());
	//  132  270:aload_0         
	//  133  271:aload_2         
	//  134  272:aload_1         
	//  135  273:invokevirtual   #1251 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//  136  276:invokevirtual   #1255 <Method MapsUIService Assembler.getMapsUIService(com.irobot.core.AssetId)>
	//  137  279:putfield        #307 <Field MapsUIService M>
		af = new a();
	//  138  282:aload_0         
	//  139  283:new             #80  <Class MapCustomizationActivity$a>
	//  140  286:dup             
	//  141  287:aload_0         
	//  142  288:aconst_null     
	//  143  289:invokespecial   #1258 <Method void MapCustomizationActivity$a(MapCustomizationActivity, MapCustomizationActivity$1)>
	//  144  292:putfield        #968 <Field MapCustomizationActivity$a af>
		M.registerUISubscriber(((MapsUIServiceDataCallback) (af)));
	//  145  295:aload_0         
	//  146  296:getfield        #307 <Field MapsUIService M>
	//  147  299:aload_0         
	//  148  300:getfield        #968 <Field MapCustomizationActivity$a af>
	//  149  303:invokevirtual   #1262 <Method boolean MapsUIService.registerUISubscriber(MapsUIServiceDataCallback)>
	//  150  306:pop             
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//  151  307:invokestatic    #301 <Method MapsUIServiceData MapsUIServiceData.create()>
	//  152  310:astore_3        
		mapsuiservicedata.setCustomizationMapId(a.f());
	//  153  311:aload_3         
	//  154  312:aload_0         
	//  155  313:getfield        #1264 <Field IRobotApplication a>
	//  156  316:invokevirtual   #1269 <Method com.irobot.core.PersistentMapIdentifier com.irobot.home.IRobotApplication.f()>
	//  157  319:invokevirtual   #1273 <Method void MapsUIServiceData.setCustomizationMapId(com.irobot.core.PersistentMapIdentifier)>
		M.sendCommand(MapsUIServiceCommand.SetPersistentMapId, mapsuiservicedata);
	//  158  322:aload_0         
	//  159  323:getfield        #307 <Field MapsUIService M>
	//  160  326:getstatic       #1276 <Field MapsUIServiceCommand MapsUIServiceCommand.SetPersistentMapId>
	//  161  329:aload_3         
	//  162  330:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		mapsuiservicedata.setRegionNamePlaceHolder(getString(0x7f0f0671));
	//  163  333:aload_3         
	//  164  334:aload_0         
	//  165  335:ldc2            #1277 <Int 0x7f0f0671>
	//  166  338:invokevirtual   #413 <Method String getString(int)>
	//  167  341:invokevirtual   #1280 <Method void MapsUIServiceData.setRegionNamePlaceHolder(String)>
		M.sendCommand(MapsUIServiceCommand.RegionNamePlaceHolder, mapsuiservicedata);
	//  168  344:aload_0         
	//  169  345:getfield        #307 <Field MapsUIService M>
	//  170  348:getstatic       #1283 <Field MapsUIServiceCommand MapsUIServiceCommand.RegionNamePlaceHolder>
	//  171  351:aload_3         
	//  172  352:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		mapsuiservicedata.setSelectedRegionNamePlaceHolder(getString(0x7f0f0672));
	//  173  355:aload_3         
	//  174  356:aload_0         
	//  175  357:ldc2            #1284 <Int 0x7f0f0672>
	//  176  360:invokevirtual   #413 <Method String getString(int)>
	//  177  363:invokevirtual   #1287 <Method void MapsUIServiceData.setSelectedRegionNamePlaceHolder(String)>
		M.sendCommand(MapsUIServiceCommand.SelectedRegionNamePlaceHolder, mapsuiservicedata);
	//  178  366:aload_0         
	//  179  367:getfield        #307 <Field MapsUIService M>
	//  180  370:getstatic       #1290 <Field MapsUIServiceCommand MapsUIServiceCommand.SelectedRegionNamePlaceHolder>
	//  181  373:aload_3         
	//  182  374:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		ad = assembler.getScheduleUIService(((AssetInfo) (obj)).getAssetId());
	//  183  377:aload_0         
	//  184  378:aload_2         
	//  185  379:aload_1         
	//  186  380:invokevirtual   #1251 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//  187  383:invokevirtual   #1294 <Method ScheduleUIService Assembler.getScheduleUIService(com.irobot.core.AssetId)>
	//  188  386:putfield        #1194 <Field ScheduleUIService ad>
		k.setHasFixedSize(true);
	//  189  389:aload_0         
	//  190  390:getfield        #361 <Field RecyclerView k>
	//  191  393:iconst_1        
	//  192  394:invokevirtual   #1297 <Method void RecyclerView.setHasFixedSize(boolean)>
		P = ((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((android.content.Context) (this)))));
	//  193  397:aload_0         
	//  194  398:new             #1299 <Class LinearLayoutManager>
	//  195  401:dup             
	//  196  402:aload_0         
	//  197  403:invokespecial   #1300 <Method void LinearLayoutManager(android.content.Context)>
	//  198  406:putfield        #1302 <Field android.support.v7.widget.RecyclerView$h P>
		k.setLayoutManager(P);
	//  199  409:aload_0         
	//  200  410:getfield        #361 <Field RecyclerView k>
	//  201  413:aload_0         
	//  202  414:getfield        #1302 <Field android.support.v7.widget.RecyclerView$h P>
	//  203  417:invokevirtual   #1306 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		x();
	//  204  420:aload_0         
	//  205  421:invokespecial   #1308 <Method void x()>
		M.sendCommand(MapsUIServiceCommand.GetRegionTypeTable, ((MapsUIServiceData) (null)));
	//  206  424:aload_0         
	//  207  425:getfield        #307 <Field MapsUIService M>
	//  208  428:getstatic       #1311 <Field MapsUIServiceCommand MapsUIServiceCommand.GetRegionTypeTable>
	//  209  431:aconst_null     
	//  210  432:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		O = new af(((android.content.Context) (this)), M.getServiceData().getRegionTypeTable(), ab, false);
	//  211  435:aload_0         
	//  212  436:new             #1313 <Class af>
	//  213  439:dup             
	//  214  440:aload_0         
	//  215  441:aload_0         
	//  216  442:getfield        #307 <Field MapsUIService M>
	//  217  445:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//  218  448:invokevirtual   #1316 <Method ArrayList MapsUIServiceData.getRegionTypeTable()>
	//  219  451:aload_0         
	//  220  452:getfield        #988 <Field HashMap ab>
	//  221  455:iconst_0        
	//  222  456:invokespecial   #1319 <Method void af(android.content.Context, ArrayList, HashMap, boolean)>
	//  223  459:putfield        #1321 <Field af O>
		k.setAdapter(((android.support.v7.widget.RecyclerView.a) (O)));
	//  224  462:aload_0         
	//  225  463:getfield        #361 <Field RecyclerView k>
	//  226  466:aload_0         
	//  227  467:getfield        #1321 <Field af O>
	//  228  470:invokevirtual   #1325 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		M.sendCommand(MapsUIServiceCommand.GetCustomRegionTypeItem, ((MapsUIServiceData) (null)));
	//  229  473:aload_0         
	//  230  474:getfield        #307 <Field MapsUIService M>
	//  231  477:getstatic       #1328 <Field MapsUIServiceCommand MapsUIServiceCommand.GetCustomRegionTypeItem>
	//  232  480:aconst_null     
	//  233  481:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		O.a(M.getServiceData().getCustomRegionTypeItem());
	//  234  484:aload_0         
	//  235  485:getfield        #1321 <Field af O>
	//  236  488:aload_0         
	//  237  489:getfield        #307 <Field MapsUIService M>
	//  238  492:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//  239  495:invokevirtual   #1332 <Method RegionTypeTableItem MapsUIServiceData.getCustomRegionTypeItem()>
	//  240  498:invokevirtual   #1335 <Method void af.a(RegionTypeTableItem)>
		O.a(((com.irobot.home.b.af.a) (this)));
	//  241  501:aload_0         
	//  242  502:getfield        #1321 <Field af O>
	//  243  505:aload_0         
	//  244  506:invokevirtual   #1338 <Method void af.a(com.irobot.home.b.af$a)>
		if(getFragmentManager().findFragmentById(0x7f090247) == null)
	//* 245  509:aload_0         
	//* 246  510:invokevirtual   #1342 <Method FragmentManager getFragmentManager()>
	//* 247  513:ldc2            #1343 <Int 0x7f090247>
	//* 248  516:invokevirtual   #1349 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//* 249  519:ifnonnull       529
			a(((android.support.v4.app.Fragment) (au.b())));
	//  250  522:aload_0         
	//  251  523:invokestatic    #1354 <Method au au.b()>
	//  252  526:invokevirtual   #512 <Method void a(android.support.v4.app.Fragment)>
		w.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				com.irobot.home.TroubleshootPersistentMapActivity_.a(((android.content.Context) (a))).b(a.d).a();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MapCustomizationActivity a>
			//    2    4:invokestatic    #27  <Method TroubleshootPersistentMapActivity_$a com.irobot.home.TroubleshootPersistentMapActivity_.a(android.content.Context)>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field MapCustomizationActivity a>
			//    5   11:getfield        #31  <Field int MapCustomizationActivity.d>
			//    6   14:invokevirtual   #37  <Method TroubleshootPersistentMapActivity_$a TroubleshootPersistentMapActivity_$a.b(int)>
			//    7   17:invokevirtual   #40  <Method org.androidannotations.api.a.e com.irobot.home.TroubleshootPersistentMapActivity_$a.a()>
			//    8   20:pop             
			//    9   21:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  253  529:aload_0         
	//  254  530:getfield        #534 <Field CustomTextView w>
	//  255  533:new             #16  <Class MapCustomizationActivity$12>
	//  256  536:dup             
	//  257  537:aload_0         
	//  258  538:invokespecial   #1355 <Method void MapCustomizationActivity$12(MapCustomizationActivity)>
	//  259  541:invokevirtual   #1359 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		x.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				com.irobot.home.TroubleshootPersistentMapActivity_.a(((android.content.Context) (a))).b(a.d).a();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MapCustomizationActivity a>
			//    2    4:invokestatic    #27  <Method TroubleshootPersistentMapActivity_$a com.irobot.home.TroubleshootPersistentMapActivity_.a(android.content.Context)>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field MapCustomizationActivity a>
			//    5   11:getfield        #31  <Field int MapCustomizationActivity.d>
			//    6   14:invokevirtual   #37  <Method TroubleshootPersistentMapActivity_$a TroubleshootPersistentMapActivity_$a.b(int)>
			//    7   17:invokevirtual   #40  <Method org.androidannotations.api.a.e com.irobot.home.TroubleshootPersistentMapActivity_$a.a()>
			//    8   20:pop             
			//    9   21:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  260  544:aload_0         
	//  261  545:getfield        #532 <Field CustomTextView x>
	//  262  548:new             #42  <Class MapCustomizationActivity$23>
	//  263  551:dup             
	//  264  552:aload_0         
	//  265  553:invokespecial   #1360 <Method void MapCustomizationActivity$23(MapCustomizationActivity)>
	//  266  556:invokevirtual   #1359 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		y();
	//  267  559:aload_0         
	//  268  560:invokespecial   #1362 <Method void y()>
	//  269  563:return          
	}

	void f()
	{
		for(Iterator iterator = Q.iterator(); iterator.hasNext(); ((View)iterator.next()).setVisibility(4));
	//    0    0:aload_0         
	//    1    1:getfield        #1237 <Field ArrayList Q>
	//    2    4:invokevirtual   #1366 <Method Iterator ArrayList.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #1371 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            33
	//    7   17:aload_1         
	//    8   18:invokeinterface #1375 <Method Object Iterator.next()>
	//    9   23:checkcast       #379 <Class View>
	//   10   26:iconst_4        
	//   11   27:invokevirtual   #1376 <Method void View.setVisibility(int)>
	//*  12   30:goto            8
	//   13   33:return          
	}

	protected void f(int i1)
	{
label0:
		{
label1:
			{
				ac = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #600 <Field boolean ac>
				MapsUIServiceCommand mapsuiservicecommand;
				MapsUIService mapsuiservice;
				switch(i1)
	//*   3    5:iload_1         
				{
	//*   4    6:tableswitch     2131296850 2131296858: default 56
	//	               2131296850 134
	//	               2131296851 129
	//	               2131296852 113
	//	               2131296853 56
	//	               2131296854 108
	//	               2131296855 103
	//	               2131296856 86
	//	               2131296857 56
	//	               2131296858 66
				case 2131296853: 
				case 2131296857: 
				default:
					com.irobot.home.util.o.b(I, "Unidentified menu option selected.");
	//    5   56:getstatic       #621 <Field String I>
	//    6   59:ldc2            #1378 <String "Unidentified menu option selected.">
	//    7   62:invokestatic    #628 <Method void o.b(String, String)>
					return;
	//    8   65:return          

				case 2131296850: 
					break label0;

				case 2131296851: 
					break label1;

				case 2131296858: 
					if(Z == MapCustomizationViewState.SetupMapPreview)
	//*   9   66:aload_0         
	//*  10   67:getfield        #678 <Field MapCustomizationViewState Z>
	//*  11   70:getstatic       #1381 <Field MapCustomizationViewState MapCustomizationViewState.SetupMapPreview>
	//*  12   73:if_acmpne       81
					{
						D();
	//   13   76:aload_0         
	//   14   77:invokespecial   #1383 <Method void D()>
						return;
	//   15   80:return          
					} else
					{
						E();
	//   16   81:aload_0         
	//   17   82:invokespecial   #1385 <Method void E()>
						return;
	//   18   85:return          
					}

				case 2131296856: 
					ac = true;
	//   19   86:aload_0         
	//   20   87:iconst_1        
	//   21   88:putfield        #600 <Field boolean ac>
					mapsuiservice = M;
	//   22   91:aload_0         
	//   23   92:getfield        #307 <Field MapsUIService M>
	//   24   95:astore_3        
					mapsuiservicecommand = MapsUIServiceCommand.RenameMap;
	//   25   96:getstatic       #1387 <Field MapsUIServiceCommand MapsUIServiceCommand.RenameMap>
	//   26   99:astore_2        
					break;
	//   27  100:goto            122

				case 2131296855: 
					O();
	//   28  103:aload_0         
	//   29  104:invokespecial   #1389 <Method void O()>
					return;
	//   30  107:return          

				case 2131296854: 
					F();
	//   31  108:aload_0         
	//   32  109:invokespecial   #1391 <Method void F()>
					return;
	//   33  112:return          

				case 2131296852: 
					mapsuiservice = M;
	//   34  113:aload_0         
	//   35  114:getfield        #307 <Field MapsUIService M>
	//   36  117:astore_3        
					mapsuiservicecommand = MapsUIServiceCommand.EditCustomization;
	//   37  118:getstatic       #1394 <Field MapsUIServiceCommand MapsUIServiceCommand.EditCustomization>
	//   38  121:astore_2        
					break;
				}
				mapsuiservice.sendCommand(mapsuiservicecommand, ((MapsUIServiceData) (null)));
	//   39  122:aload_3         
	//   40  123:aload_2         
	//   41  124:aconst_null     
	//   42  125:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				return;
	//   43  128:return          
			}
			s();
	//   44  129:aload_0         
	//   45  130:invokevirtual   #1397 <Method void s()>
			return;
	//   46  133:return          
		}
		B();
	//   47  134:aload_0         
	//   48  135:invokespecial   #1399 <Method void B()>
	//   49  138:return          
	}

	void g()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            28
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapsUIService mapsuiservice;
					MapsUIServiceCommand mapsuiservicecommand;
					if(MapCustomizationActivity.h(a) == MapCustomizationViewState.DoorEdit)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field MapCustomizationActivity a>
				//*   2    4:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//*   3    7:getstatic       #31  <Field MapCustomizationViewState MapCustomizationViewState.DoorEdit>
				//*   4   10:if_acmpne       32
					{
						mapsuiservice = MapCustomizationActivity.e(a);
				//    5   13:aload_0         
				//    6   14:getfield        #17  <Field MapCustomizationActivity a>
				//    7   17:invokestatic    #35  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    8   20:astore_1        
						mapsuiservicecommand = MapsUIServiceCommand.AddDoor;
				//    9   21:getstatic       #41  <Field MapsUIServiceCommand MapsUIServiceCommand.AddDoor>
				//   10   24:astore_2        
					} else
				//*  11   25:aload_1         
				//*  12   26:aload_2         
				//*  13   27:aconst_null     
				//*  14   28:invokevirtual   #47  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//*  15   31:return          
					if(MapCustomizationActivity.h(a) == MapCustomizationViewState.KeepOutZoneEdit)
				//*  16   32:aload_0         
				//*  17   33:getfield        #17  <Field MapCustomizationActivity a>
				//*  18   36:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//*  19   39:getstatic       #50  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneEdit>
				//*  20   42:if_acmpne       60
					{
						mapsuiservice = MapCustomizationActivity.e(a);
				//   21   45:aload_0         
				//   22   46:getfield        #17  <Field MapCustomizationActivity a>
				//   23   49:invokestatic    #35  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   24   52:astore_1        
						mapsuiservicecommand = MapsUIServiceCommand.AddKeepOutZone;
				//   25   53:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.AddKeepOutZone>
				//   26   56:astore_2        
					} else
				//*  27   57:goto            25
					if(MapCustomizationActivity.h(a) == MapCustomizationViewState.KeepOutZoneSelected)
				//*  28   60:aload_0         
				//*  29   61:getfield        #17  <Field MapCustomizationActivity a>
				//*  30   64:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//*  31   67:getstatic       #56  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneSelected>
				//*  32   70:if_acmpne       88
					{
						mapsuiservice = MapCustomizationActivity.e(a);
				//   33   73:aload_0         
				//   34   74:getfield        #17  <Field MapCustomizationActivity a>
				//   35   77:invokestatic    #35  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   36   80:astore_1        
						mapsuiservicecommand = MapsUIServiceCommand.RemoveKeepOutZone;
				//   37   81:getstatic       #59  <Field MapsUIServiceCommand MapsUIServiceCommand.RemoveKeepOutZone>
				//   38   84:astore_2        
					} else
				//*  39   85:goto            25
					{
						return;
				//   40   88:return          
					}
					mapsuiservice.sendCommand(mapsuiservicecommand, ((MapsUIServiceData) (null)));
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #62  <Class MapCustomizationActivity$32>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1400 <Method void MapCustomizationActivity$32(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   12   28:return          
	}

	void h()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            28
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.CancelCustomization, ((MapsUIServiceData) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:invokestatic    #25  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    3    7:getstatic       #31  <Field MapsUIServiceCommand MapsUIServiceCommand.CancelCustomization>
				//    4   10:aconst_null     
				//    5   11:invokevirtual   #37  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//    6   14:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #64  <Class MapCustomizationActivity$33>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1401 <Method void MapCustomizationActivity$33(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   12   28:return          
	}

	void i()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            28
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
label0:
					{
						MapsUIService mapsuiservice;
						MapsUIServiceCommand mapsuiservicecommand;
						if(MapCustomizationActivity.h(a) != MapCustomizationViewState.DoorEditHasPendingValidSave && MapCustomizationActivity.h(a) != MapCustomizationViewState.DoorEditHasPendingInvalidSave)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field MapCustomizationActivity a>
				//*   2    4:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//*   3    7:getstatic       #31  <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingValidSave>
				//*   4   10:if_acmpeq       57
				//*   5   13:aload_0         
				//*   6   14:getfield        #17  <Field MapCustomizationActivity a>
				//*   7   17:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//*   8   20:getstatic       #34  <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingInvalidSave>
				//*   9   23:if_acmpne       29
				//*  10   26:goto            57
						{
							if(MapCustomizationActivity.h(a) != MapCustomizationViewState.KeepOutZoneSelected)
								break label0;
				//   11   29:aload_0         
				//   12   30:getfield        #17  <Field MapCustomizationActivity a>
				//   13   33:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//   14   36:getstatic       #37  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneSelected>
				//   15   39:if_acmpne       75
							mapsuiservice = MapCustomizationActivity.e(a);
				//   16   42:aload_0         
				//   17   43:getfield        #17  <Field MapCustomizationActivity a>
				//   18   46:invokestatic    #41  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   19   49:astore_1        
							mapsuiservicecommand = MapsUIServiceCommand.RemoveKeepOutZone;
				//   20   50:getstatic       #47  <Field MapsUIServiceCommand MapsUIServiceCommand.RemoveKeepOutZone>
				//   21   53:astore_2        
						} else
				//*  22   54:goto            69
						{
							mapsuiservice = MapCustomizationActivity.e(a);
				//   23   57:aload_0         
				//   24   58:getfield        #17  <Field MapCustomizationActivity a>
				//   25   61:invokestatic    #41  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   26   64:astore_1        
							mapsuiservicecommand = MapsUIServiceCommand.RemoveDoor;
				//   27   65:getstatic       #50  <Field MapsUIServiceCommand MapsUIServiceCommand.RemoveDoor>
				//   28   68:astore_2        
						}
						mapsuiservice.sendCommand(mapsuiservicecommand, ((MapsUIServiceData) (null)));
				//   29   69:aload_1         
				//   30   70:aload_2         
				//   31   71:aconst_null     
				//   32   72:invokevirtual   #56  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
					}
				//   33   75:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #66  <Class MapCustomizationActivity$34>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1402 <Method void MapCustomizationActivity$34(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   12   28:return          
	}

	void j()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            28
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.RotateMap, ((MapsUIServiceData) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:invokestatic    #25  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    3    7:getstatic       #31  <Field MapsUIServiceCommand MapsUIServiceCommand.RotateMap>
				//    4   10:aconst_null     
				//    5   11:invokevirtual   #37  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//    6   14:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #32  <Class MapCustomizationActivity$2>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1403 <Method void MapCustomizationActivity$2(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   12   28:return          
	}

	void k()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            28
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapsUIService mapsuiservice;
					MapsUIServiceCommand mapsuiservicecommand;
					if(MapCustomizationActivity.h(a) == MapCustomizationViewState.DoorEditHasPendingValidSave)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field MapCustomizationActivity a>
				//*   2    4:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//*   3    7:getstatic       #31  <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingValidSave>
				//*   4   10:if_acmpne       32
					{
						mapsuiservice = MapCustomizationActivity.e(a);
				//    5   13:aload_0         
				//    6   14:getfield        #17  <Field MapCustomizationActivity a>
				//    7   17:invokestatic    #35  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    8   20:astore_1        
						mapsuiservicecommand = MapsUIServiceCommand.PlaceDoor;
				//    9   21:getstatic       #41  <Field MapsUIServiceCommand MapsUIServiceCommand.PlaceDoor>
				//   10   24:astore_2        
					} else
				//*  11   25:aload_1         
				//*  12   26:aload_2         
				//*  13   27:aconst_null     
				//*  14   28:invokevirtual   #47  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//*  15   31:return          
					if(MapCustomizationActivity.h(a) == MapCustomizationViewState.KeepOutZoneSelected)
				//*  16   32:aload_0         
				//*  17   33:getfield        #17  <Field MapCustomizationActivity a>
				//*  18   36:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
				//*  19   39:getstatic       #50  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneSelected>
				//*  20   42:if_acmpne       60
					{
						mapsuiservice = MapCustomizationActivity.e(a);
				//   21   45:aload_0         
				//   22   46:getfield        #17  <Field MapCustomizationActivity a>
				//   23   49:invokestatic    #35  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   24   52:astore_1        
						mapsuiservicecommand = MapsUIServiceCommand.PlaceKeepOutZone;
				//   25   53:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.PlaceKeepOutZone>
				//   26   56:astore_2        
					} else
				//*  27   57:goto            25
					{
						return;
				//   28   60:return          
					}
					mapsuiservice.sendCommand(mapsuiservicecommand, ((MapsUIServiceData) (null)));
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #56  <Class MapCustomizationActivity$3>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1404 <Method void MapCustomizationActivity$3(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   12   28:return          
	}

	void l()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            28
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.CustomizationOptions, ((MapsUIServiceData) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:invokestatic    #25  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    3    7:getstatic       #31  <Field MapsUIServiceCommand MapsUIServiceCommand.CustomizationOptions>
				//    4   10:aconst_null     
				//    5   11:invokevirtual   #37  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//    6   14:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #68  <Class MapCustomizationActivity$4>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1405 <Method void MapCustomizationActivity$4(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   12   28:return          
	}

	void m()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            28
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.CancelCustomization, ((MapsUIServiceData) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:invokestatic    #25  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    3    7:getstatic       #31  <Field MapsUIServiceCommand MapsUIServiceCommand.CancelCustomization>
				//    4   10:aconst_null     
				//    5   11:invokevirtual   #37  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//    6   14:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #70  <Class MapCustomizationActivity$5>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1406 <Method void MapCustomizationActivity$5(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   12   28:return          
	}

	void n()
	{
		if(z())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #761 <Method boolean z()>
	//*   2    4:ifeq            29
		{
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.CancelCustomization, ((MapsUIServiceData) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:invokestatic    #25  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    3    7:getstatic       #31  <Field MapsUIServiceCommand MapsUIServiceCommand.CancelCustomization>
				//    4   10:aconst_null     
				//    5   11:invokevirtual   #37  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//    6   14:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    5   11:checkcast       #499 <Class ak>
	//    6   14:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//    7   17:new             #72  <Class MapCustomizationActivity$6>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #1407 <Method void MapCustomizationActivity$6(MapCustomizationActivity)>
	//   11   25:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
			return;
	//   12   28:return          
		} else
		{
			finish();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #617 <Method void finish()>
			return;
	//   15   33:return          
		}
	}

	void o()
	{
		if(!com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #1409 <Method boolean j.a()>
	//*   1    3:ifne            11
		{
			com.irobot.home.util.j.c(((android.app.Activity) (this)));
	//    2    6:aload_0         
	//    3    7:invokestatic    #1412 <Method void j.c(android.app.Activity)>
			return;
	//    4   10:return          
		}
		if(z())
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #761 <Method boolean z()>
	//*   7   15:ifeq            39
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapCustomizationActivity.d(a, false);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #25  <Method boolean MapCustomizationActivity.d(MapCustomizationActivity, boolean)>
				//    4    8:pop             
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.DoneCustomization, ((MapsUIServiceData) (null)));
				//    5    9:aload_0         
				//    6   10:getfield        #17  <Field MapCustomizationActivity a>
				//    7   13:invokestatic    #29  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    8   16:getstatic       #35  <Field MapsUIServiceCommand MapsUIServiceCommand.DoneCustomization>
				//    9   19:aconst_null     
				//   10   20:invokevirtual   #41  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//   11   23:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    8   18:aload_0         
	//    9   19:getfield        #497 <Field android.support.v4.app.Fragment G>
	//   10   22:checkcast       #499 <Class ak>
	//   11   25:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//   12   28:new             #74  <Class MapCustomizationActivity$7>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #1413 <Method void MapCustomizationActivity$7(MapCustomizationActivity)>
	//   16   36:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
		G();
	//   17   39:aload_0         
	//   18   40:invokespecial   #578 <Method void G()>
	//   19   43:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 177
	//	               2 113
	//	               3 82
	//	               4 42
		default:
			com.irobot.home.util.o.e(I, "Invalid activity request code");
	//    2   32:getstatic       #621 <Field String I>
	//    3   35:ldc2            #1417 <String "Invalid activity request code">
	//    4   38:invokestatic    #1419 <Method void o.e(String, String)>
			return;
	//    5   41:return          

		case 4: // '\004'
			if(j1 == -1)
	//*   6   42:iload_2         
	//*   7   43:iconst_m1       
	//*   8   44:icmpne          59
			{
				b(intent.getStringExtra("validFloorPlanName"));
	//    9   47:aload_0         
	//   10   48:aload_3         
	//   11   49:ldc2            #1421 <String "validFloorPlanName">
	//   12   52:invokevirtual   #1427 <Method String Intent.getStringExtra(String)>
	//   13   55:invokespecial   #1429 <Method void b(String)>
				return;
	//   14   58:return          
			}
			if(j1 == 0 && !intent.getBooleanExtra("isRenamingMap", false))
	//*  15   59:iload_2         
	//*  16   60:ifne            186
	//*  17   63:aload_3         
	//*  18   64:ldc2            #1431 <String "isRenamingMap">
	//*  19   67:iconst_0        
	//*  20   68:invokevirtual   #1435 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  21   71:ifne            186
			{
				a(MapCustomizationViewState.SetupMapPreview);
	//   22   74:aload_0         
	//   23   75:getstatic       #1381 <Field MapCustomizationViewState MapCustomizationViewState.SetupMapPreview>
	//   24   78:invokespecial   #793 <Method void a(MapCustomizationViewState)>
				return;
	//   25   81:return          
			}
			break;

		case 3: // '\003'
			if(j1 == -1)
	//*  26   82:iload_2         
	//*  27   83:iconst_m1       
	//*  28   84:icmpne          186
			{
				String s1 = intent.getStringExtra("validRegionName");
	//   29   87:aload_3         
	//   30   88:ldc2            #1437 <String "validRegionName">
	//   31   91:invokevirtual   #1427 <Method String Intent.getStringExtra(String)>
	//   32   94:astore          5
				a((RegionType)intent.getSerializableExtra("customRegionType"), s1);
	//   33   96:aload_0         
	//   34   97:aload_3         
	//   35   98:ldc2            #1439 <String "customRegionType">
	//   36  101:invokevirtual   #1443 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   37  104:checkcast       #990 <Class RegionType>
	//   38  107:aload           5
	//   39  109:invokespecial   #1183 <Method void a(RegionType, String)>
				return;
	//   40  112:return          
			}
			break;

		case 2: // '\002'
			if(j1 != -1)
				break;
	//   41  113:iload_2         
	//   42  114:iconst_m1       
	//   43  115:icmpne          186
			boolean flag = intent.getBooleanExtra("shouldRenamePrevious", false);
	//   44  118:aload_3         
	//   45  119:ldc2            #1445 <String "shouldRenamePrevious">
	//   46  122:iconst_0        
	//   47  123:invokevirtual   #1435 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   48  126:istore          4
			String s2 = intent.getStringExtra("validRegionName");
	//   49  128:aload_3         
	//   50  129:ldc2            #1437 <String "validRegionName">
	//   51  132:invokevirtual   #1427 <Method String Intent.getStringExtra(String)>
	//   52  135:astore          5
			if(flag)
	//*  53  137:iload           4
	//*  54  139:ifeq            156
			{
				a(intent.getStringExtra("previousRegionName"), s2);
	//   55  142:aload_0         
	//   56  143:aload_3         
	//   57  144:ldc2            #1447 <String "previousRegionName">
	//   58  147:invokevirtual   #1427 <Method String Intent.getStringExtra(String)>
	//   59  150:aload           5
	//   60  152:invokespecial   #1449 <Method void a(String, String)>
				return;
	//   61  155:return          
			}
			if(aa != null)
	//*  62  156:aload_0         
	//*  63  157:getfield        #1161 <Field RegionTypeTableItem aa>
	//*  64  160:ifnull          186
			{
				a(aa.getRegionType(), s2);
	//   65  163:aload_0         
	//   66  164:aload_0         
	//   67  165:getfield        #1161 <Field RegionTypeTableItem aa>
	//   68  168:invokevirtual   #1167 <Method RegionType RegionTypeTableItem.getRegionType()>
	//   69  171:aload           5
	//   70  173:invokespecial   #1183 <Method void a(RegionType, String)>
				return;
	//   71  176:return          
			}
			break;

		case 1: // '\001'
			if(j1 == -1)
	//*  72  177:iload_2         
	//*  73  178:iconst_m1       
	//*  74  179:icmpne          186
				A();
	//   75  182:aload_0         
	//   76  183:invokespecial   #1451 <Method void A()>
			break;
		}
	//   77  186:return          
	}

	public void onBackPressed()
	{
		if(v() || e)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #1453 <Method boolean v()>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #219 <Field boolean e>
	//*   5   11:ifeq            18
			com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:invokestatic    #1455 <Method void j.a(android.app.Activity)>
		if(G instanceof e)
	//*   8   18:aload_0         
	//*   9   19:getfield        #497 <Field android.support.v4.app.Fragment G>
	//*  10   22:instanceof      #755 <Class e>
	//*  11   25:ifeq            40
			AnalyticsSubsystem.getInstance().trackPMapCustomizeNameMapCancelButtonPressed(com.irobot.home.util.j.j().a());
	//   12   28:invokestatic    #518 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   13   31:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//   14   34:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//   15   37:invokevirtual   #1459 <Method void AnalyticsSubsystem.trackPMapCustomizeNameMapCancelButtonPressed(AssetInfo)>
		if(Z != MapCustomizationViewState.LabelingRoomSelection && Z != MapCustomizationViewState.LabelingHasPendingSave)
	//*  16   40:aload_0         
	//*  17   41:getfield        #678 <Field MapCustomizationViewState Z>
	//*  18   44:getstatic       #1462 <Field MapCustomizationViewState MapCustomizationViewState.LabelingRoomSelection>
	//*  19   47:if_acmpeq       114
	//*  20   50:aload_0         
	//*  21   51:getfield        #678 <Field MapCustomizationViewState Z>
	//*  22   54:getstatic       #1465 <Field MapCustomizationViewState MapCustomizationViewState.LabelingHasPendingSave>
	//*  23   57:if_acmpne       63
	//*  24   60:goto            114
		{
			M.sendCommand(MapsUIServiceCommand.CancelCustomization, ((MapsUIServiceData) (null)));
	//   25   63:aload_0         
	//   26   64:getfield        #307 <Field MapsUIService M>
	//   27   67:getstatic       #1468 <Field MapsUIServiceCommand MapsUIServiceCommand.CancelCustomization>
	//   28   70:aconst_null     
	//   29   71:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			if(M.getServiceData().getIsCustomizationCancelled())
	//*  30   74:aload_0         
	//*  31   75:getfield        #307 <Field MapsUIService M>
	//*  32   78:invokevirtual   #502 <Method MapsUIServiceData MapsUIService.getServiceData()>
	//*  33   81:invokevirtual   #1471 <Method boolean MapsUIServiceData.getIsCustomizationCancelled()>
	//*  34   84:ifeq            159
			{
				setResult(0);
	//   35   87:aload_0         
	//   36   88:iconst_0        
	//   37   89:invokevirtual   #1474 <Method void setResult(int)>
				M.unregisterSubscriber(((MapsUIServiceDataCallback) (af)));
	//   38   92:aload_0         
	//   39   93:getfield        #307 <Field MapsUIService M>
	//   40   96:aload_0         
	//   41   97:getfield        #968 <Field MapCustomizationActivity$a af>
	//   42  100:invokevirtual   #1477 <Method boolean MapsUIService.unregisterSubscriber(MapsUIServiceDataCallback)>
	//   43  103:pop             
				af = null;
	//   44  104:aload_0         
	//   45  105:aconst_null     
	//   46  106:putfield        #968 <Field MapCustomizationActivity$a af>
				super.onBackPressed();
	//   47  109:aload_0         
	//   48  110:invokespecial   #984 <Method void PersistentMapActivity.onBackPressed()>
				return;
	//   49  113:return          
			}
		} else
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f017f).setMessage(0x7f0f017e).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.CancelCustomization, ((MapsUIServiceData) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    3    7:getstatic       #32  <Field MapsUIServiceCommand MapsUIServiceCommand.CancelCustomization>
				//    4   10:aconst_null     
				//    5   11:invokevirtual   #38  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
					if(MapCustomizationActivity.e(a).getServiceData().getIsCustomizationCancelled())
				//*   6   14:aload_0         
				//*   7   15:getfield        #17  <Field MapCustomizationActivity a>
				//*   8   18:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//*   9   21:invokevirtual   #42  <Method MapsUIServiceData MapsUIService.getServiceData()>
				//*  10   24:invokevirtual   #48  <Method boolean MapsUIServiceData.getIsCustomizationCancelled()>
				//*  11   27:ifeq            63
					{
						a.setResult(0);
				//   12   30:aload_0         
				//   13   31:getfield        #17  <Field MapCustomizationActivity a>
				//   14   34:iconst_0        
				//   15   35:invokevirtual   #52  <Method void MapCustomizationActivity.setResult(int)>
						MapCustomizationActivity.e(a).unregisterSubscriber(((MapsUIServiceDataCallback) (com.irobot.home.MapCustomizationActivity.f(a))));
				//   16   38:aload_0         
				//   17   39:getfield        #17  <Field MapCustomizationActivity a>
				//   18   42:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//   19   45:aload_0         
				//   20   46:getfield        #17  <Field MapCustomizationActivity a>
				//   21   49:invokestatic    #56  <Method MapCustomizationActivity$a com.irobot.home.MapCustomizationActivity.f(MapCustomizationActivity)>
				//   22   52:invokevirtual   #60  <Method boolean MapsUIService.unregisterSubscriber(MapsUIServiceDataCallback)>
				//   23   55:pop             
						MapCustomizationActivity.g(a);
				//   24   56:aload_0         
				//   25   57:getfield        #17  <Field MapCustomizationActivity a>
				//   26   60:invokestatic    #63  <Method void MapCustomizationActivity.g(MapCustomizationActivity)>
					}
				//   27   63:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setNegativeButton(0x7f0f04d3, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   50  114:new             #248 <Class android.app.AlertDialog$Builder>
	//   51  117:dup             
	//   52  118:aload_0         
	//   53  119:invokespecial   #249 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   54  122:ldc2            #1478 <Int 0x7f0f017f>
	//   55  125:invokevirtual   #254 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   56  128:ldc2            #1479 <Int 0x7f0f017e>
	//   57  131:invokevirtual   #258 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   58  134:ldc2            #259 <Int 0x7f0f0986>
	//   59  137:new             #60  <Class MapCustomizationActivity$31>
	//   60  140:dup             
	//   61  141:aload_0         
	//   62  142:invokespecial   #1480 <Method void MapCustomizationActivity$31(MapCustomizationActivity)>
	//   63  145:invokevirtual   #264 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   64  148:ldc2            #265 <Int 0x7f0f04d3>
	//   65  151:aconst_null     
	//   66  152:invokevirtual   #268 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   67  155:invokevirtual   #272 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   68  158:pop             
		}
	//   69  159:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1483 <Method void PersistentMapActivity.onDestroy()>
		if(af != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #968 <Field MapCustomizationActivity$a af>
	//*   4    8:ifnull          23
			M.unregisterSubscriber(((MapsUIServiceDataCallback) (af)));
	//    5   11:aload_0         
	//    6   12:getfield        #307 <Field MapsUIService M>
	//    7   15:aload_0         
	//    8   16:getfield        #968 <Field MapCustomizationActivity$a af>
	//    9   19:invokevirtual   #1477 <Method boolean MapsUIService.unregisterSubscriber(MapsUIServiceDataCallback)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1486 <Method void PersistentMapActivity.onPause()>
		if(R != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #974 <Field a R>
	//*   4    8:ifnull          18
			R.dismiss();
	//    5   11:aload_0         
	//    6   12:getfield        #974 <Field a R>
	//    7   15:invokevirtual   #1489 <Method void a.dismiss()>
		if(S != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #658 <Field a S>
	//*  10   22:ifnull          32
			S.dismiss();
	//   11   25:aload_0         
	//   12   26:getfield        #658 <Field a S>
	//   13   29:invokevirtual   #1489 <Method void a.dismiss()>
		ad.unregisterSubscriber(ag);
	//   14   32:aload_0         
	//   15   33:getfield        #1194 <Field ScheduleUIService ad>
	//   16   36:aload_0         
	//   17   37:getfield        #226 <Field ScheduleUIServiceDataCallback ag>
	//   18   40:invokevirtual   #1492 <Method boolean ScheduleUIService.unregisterSubscriber(ScheduleUIServiceDataCallback)>
	//   19   43:pop             
	//   20   44:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1495 <Method void PersistentMapActivity.onResume()>
		ad.registerUISubscriber(ag);
	//    2    4:aload_0         
	//    3    5:getfield        #1194 <Field ScheduleUIService ad>
	//    4    8:aload_0         
	//    5    9:getfield        #226 <Field ScheduleUIServiceDataCallback ag>
	//    6   12:invokevirtual   #1497 <Method boolean ScheduleUIService.registerUISubscriber(ScheduleUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	void p()
	{
		M.sendCommand(MapsUIServiceCommand.StartCustomization, ((MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #307 <Field MapsUIService M>
	//    2    4:getstatic       #1501 <Field MapsUIServiceCommand MapsUIServiceCommand.StartCustomization>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #319 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		AnalyticsSubsystem.getInstance().trackPMapSectionMapReadyCustomizeButtonPressed(com.irobot.home.util.j.j().a());
	//    5   11:invokestatic    #518 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   14:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//    7   17:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//    8   20:invokevirtual   #1504 <Method void AnalyticsSubsystem.trackPMapSectionMapReadyCustomizeButtonPressed(AssetInfo)>
	//    9   23:return          
	}

	void q()
	{
		if(F.getVisibility() == 0 && z())
	//*   0    0:aload_0         
	//*   1    1:getfield        #480 <Field FloatingActionButton F>
	//*   2    4:invokevirtual   #1508 <Method int FloatingActionButton.getVisibility()>
	//*   3    7:ifne            38
	//*   4   10:aload_0         
	//*   5   11:invokespecial   #761 <Method boolean z()>
	//*   6   14:ifeq            38
			((ak)G).d().queueEvent(new Runnable() {

				public void run()
				{
					MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.ResetCustomization, ((MapsUIServiceData) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field MapCustomizationActivity a>
				//    2    4:invokestatic    #25  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
				//    3    7:getstatic       #31  <Field MapsUIServiceCommand MapsUIServiceCommand.ResetCustomization>
				//    4   10:aconst_null     
				//    5   11:invokevirtual   #37  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				//    6   14:return          
				}

				final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    7   17:aload_0         
	//    8   18:getfield        #497 <Field android.support.v4.app.Fragment G>
	//    9   21:checkcast       #499 <Class ak>
	//   10   24:invokevirtual   #764 <Method GLSurfaceView ak.d()>
	//   11   27:new             #76  <Class MapCustomizationActivity$8>
	//   12   30:dup             
	//   13   31:aload_0         
	//   14   32:invokespecial   #1509 <Method void MapCustomizationActivity$8(MapCustomizationActivity)>
	//   15   35:invokevirtual   #773 <Method void GLSurfaceView.queueEvent(Runnable)>
	//   16   38:return          
	}

	protected void r()
	{
		if(N != null && N.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #1207 <Field a N>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #1207 <Field a N>
	//*   5   11:invokevirtual   #1512 <Method boolean a.isShowing()>
	//*   6   14:ifeq            24
			N.dismiss();
	//    7   17:aload_0         
	//    8   18:getfield        #1207 <Field a N>
	//    9   21:invokevirtual   #1489 <Method void a.dismiss()>
	//   10   24:return          
	}

	void s()
	{
		String s1 = com.irobot.home.util.j.j().a().getName();
	//    0    0:invokestatic    #432 <Method com.irobot.home.model.a j.j()>
	//    1    3:invokevirtual   #437 <Method AssetInfo com.irobot.home.model.a.a()>
	//    2    6:invokevirtual   #443 <Method String AssetInfo.getName()>
	//    3    9:astore_1        
		(new android.support.v7.app.a.a(((android.content.Context) (this)))).b(((CharSequence) (getString(0x7f0f063d, new Object[] {
			s1
		})))).a(((CharSequence) (getString(0x7f0f0461))), new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.StartCustomization, ((MapsUIServiceData) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MapCustomizationActivity a>
			//    2    4:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
			//    3    7:getstatic       #32  <Field MapsUIServiceCommand MapsUIServiceCommand.StartCustomization>
			//    4   10:aconst_null     
			//    5   11:invokevirtual   #38  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			//    6   14:return          
			}

			final MapCustomizationActivity a;

			
			{
				a = MapCustomizationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).b(((CharSequence) (getString(0x7f0f017d))), ((android.content.DialogInterface.OnClickListener) (null))).c();
	//    4   10:new             #228 <Class android.support.v7.app.a$a>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #231 <Method void android.support.v7.app.a$a(android.content.Context)>
	//    8   18:aload_0         
	//    9   19:ldc2            #1513 <Int 0x7f0f063d>
	//   10   22:iconst_1        
	//   11   23:anewarray       Object[]
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:aload_1         
	//   15   29:aastore         
	//   16   30:invokevirtual   #630 <Method String getString(int, Object[])>
	//   17   33:invokevirtual   #671 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence)>
	//   18   36:aload_0         
	//   19   37:ldc2            #1216 <Int 0x7f0f0461>
	//   20   40:invokevirtual   #413 <Method String getString(int)>
	//   21   43:new             #22  <Class MapCustomizationActivity$15>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:invokespecial   #1514 <Method void MapCustomizationActivity$15(MapCustomizationActivity)>
	//   25   51:invokevirtual   #1517 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   26   54:aload_0         
	//   27   55:ldc1            #236 <Int 0x7f0f017d>
	//   28   57:invokevirtual   #413 <Method String getString(int)>
	//   29   60:aconst_null     
	//   30   61:invokevirtual   #1519 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   31   64:invokevirtual   #246 <Method a android.support.v7.app.a$a.c()>
	//   32   67:pop             
	//   33   68:return          
	}

	private static Map H;
	private static final String I = "MapCustomizationActivity";
	protected LinearLayout A;
	protected CustomTextView B;
	protected ImageButton C;
	protected ImageButton D;
	protected CustomButton E;
	protected FloatingActionButton F;
	private String J;
	private String K;
	private String L;
	private MapsUIService M;
	private android.support.v7.app.a N;
	private af O;
	private android.support.v7.widget.RecyclerView.h P;
	private ArrayList Q;
	private android.support.v7.app.a R;
	private android.support.v7.app.a S;
	private int T;
	private int U;
	private int V;
	private int W;
	private BottomSheetBehavior X;
	private boolean Y;
	private MapCustomizationViewState Z;
	IRobotApplication a;
	private RegionTypeTableItem aa;
	private HashMap ab;
	private boolean ac;
	private ScheduleUIService ad;
	private int ae;
	private a af;
	private ScheduleUIServiceDataCallback ag;
	String b;
	int c;
	int d;
	boolean e;
	protected CustomButton f;
	protected CustomButton g;
	protected FrameLayout h;
	protected LinearLayout i;
	protected CustomTextView j;
	protected RecyclerView k;
	protected ImageView l;
	protected ImageView m;
	protected CustomTextView n;
	protected CustomTextView o;
	protected CustomTextView t;
	protected CustomTextView u;
	protected CustomTextView v;
	protected CustomTextView w;
	protected CustomTextView x;
	protected PercentageRingView y;
	protected CustomTextView z;

	static 
	{
		H = ((Map) (new HashMap()));
	//    0    0:new             #167 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #170 <Method void HashMap()>
	//    3    7:putstatic       #172 <Field Map H>
		H.put(((Object) (Integer.valueOf(0x7f090257))), ((Object) (MapMenuOptions.RenameMap)));
	//    4   10:getstatic       #172 <Field Map H>
	//    5   13:ldc1            #173 <Int 0x7f090257>
	//    6   15:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//    7   18:getstatic       #185 <Field MapMenuOptions MapMenuOptions.RenameMap>
	//    8   21:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//    9   26:pop             
		H.put(((Object) (Integer.valueOf(0x7f090258))), ((Object) (MapMenuOptions.RenameRooms)));
	//   10   27:getstatic       #172 <Field Map H>
	//   11   30:ldc1            #192 <Int 0x7f090258>
	//   12   32:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   13   35:getstatic       #195 <Field MapMenuOptions MapMenuOptions.RenameRooms>
	//   14   38:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//   15   43:pop             
		H.put(((Object) (Integer.valueOf(0x7f090254))), ((Object) (MapMenuOptions.EditMap)));
	//   16   44:getstatic       #172 <Field Map H>
	//   17   47:ldc1            #196 <Int 0x7f090254>
	//   18   49:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   19   52:getstatic       #199 <Field MapMenuOptions MapMenuOptions.EditMap>
	//   20   55:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//   21   60:pop             
		H.put(((Object) (Integer.valueOf(0x7f09025a))), ((Object) (MapMenuOptions.TrainingRun)));
	//   22   61:getstatic       #172 <Field Map H>
	//   23   64:ldc1            #200 <Int 0x7f09025a>
	//   24   66:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   25   69:getstatic       #203 <Field MapMenuOptions MapMenuOptions.TrainingRun>
	//   26   72:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//   27   77:pop             
		H.put(((Object) (Integer.valueOf(0x7f090253))), ((Object) (MapMenuOptions.CustomizeMap)));
	//   28   78:getstatic       #172 <Field Map H>
	//   29   81:ldc1            #204 <Int 0x7f090253>
	//   30   83:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   31   86:getstatic       #207 <Field MapMenuOptions MapMenuOptions.CustomizeMap>
	//   32   89:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//   33   94:pop             
		H.put(((Object) (Integer.valueOf(0x7f090256))), ((Object) (MapMenuOptions.NeedHelp)));
	//   34   95:getstatic       #172 <Field Map H>
	//   35   98:ldc1            #208 <Int 0x7f090256>
	//   36  100:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   37  103:getstatic       #211 <Field MapMenuOptions MapMenuOptions.NeedHelp>
	//   38  106:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//   39  111:pop             
		H.put(((Object) (Integer.valueOf(0x7f090252))), ((Object) (MapMenuOptions.ArchiveMap)));
	//   40  112:getstatic       #172 <Field Map H>
	//   41  115:ldc1            #212 <Int 0x7f090252>
	//   42  117:invokestatic    #179 <Method Integer Integer.valueOf(int)>
	//   43  120:getstatic       #215 <Field MapMenuOptions MapMenuOptions.ArchiveMap>
	//   44  123:invokeinterface #191 <Method Object Map.put(Object, Object)>
	//   45  128:pop             
	//*  46  129:return          
	}
}
