// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.FragmentActivity;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.AssetNetworkUIServiceDataCallback;
import com.irobot.core.AssetNetworkUIServiceDataState;
import com.irobot.core.Error;
import com.irobot.core.EventType;
import com.irobot.core.HistoryDataState;
import com.irobot.core.HistoryUIService;
import com.irobot.core.HistoryUIServiceData;
import com.irobot.core.HistoryUIServiceDataCallback;
import com.irobot.core.MapsUIService;
import com.irobot.core.MissionMapEvent;
import com.irobot.core.MissionMapImage;
import com.irobot.core.MissionMapType;
import com.irobot.core.NetworkState;
import com.irobot.core.RobotMissionHistoryCompletionStatus;
import com.irobot.core.RobotMissionHistoryItem;
import com.irobot.core.RobotMissionHistoryItemUtil;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.SettingsUIServiceDataCallback;
import com.irobot.core.ViewId;
import com.irobot.home.BaseFragmentActivity;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.model.q;
import com.irobot.home.model.r;
import com.irobot.home.model.u;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.MapView;
import com.irobot.home.view.WebViewLanguageCompat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class MissionAndMapDetailsFragment extends com.irobot.home.fragments.j
	implements com.irobot.home.view.GestureImageView.d
{
	private class a extends SettingsUIServiceDataCallback
	{

		public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
		{
			if(settingsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.d(MissionAndMapDetailsFragment.h(), "Service data was null.");
		//    2    4:invokestatic    #25  <Method String MissionAndMapDetailsFragment.h()>
		//    3    7:ldc1            #27  <String "Service data was null.">
		//    4    9:invokestatic    #33  <Method void o.d(String, String)>
				return;
		//    5   12:return          
			}
			MissionAndMapDetailsFragment.b(a).unregisterSubscriber(((SettingsUIServiceDataCallback) (this)));
		//    6   13:aload_0         
		//    7   14:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//    8   17:invokestatic    #37  <Method SettingsSubsystem MissionAndMapDetailsFragment.b(MissionAndMapDetailsFragment)>
		//    9   20:aload_0         
		//   10   21:invokevirtual   #43  <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
		//   11   24:pop             
			Object obj = ((Object) (settingsuiservicedata.getAvailableSettings()));
		//   12   25:aload_1         
		//   13   26:invokevirtual   #49  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
		//   14   29:astore_2        
			com.irobot.home.fragments.MissionAndMapDetailsFragment.a(a, ((HashSet) (obj)).contains(((Object) (SettingType.StaticMaps))));
		//   15   30:aload_0         
		//   16   31:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   17   34:aload_2         
		//   18   35:getstatic       #55  <Field SettingType SettingType.StaticMaps>
		//   19   38:invokevirtual   #61  <Method boolean HashSet.contains(Object)>
		//   20   41:invokestatic    #64  <Method boolean com.irobot.home.fragments.MissionAndMapDetailsFragment.a(MissionAndMapDetailsFragment, boolean)>
		//   21   44:pop             
			if(!MissionAndMapDetailsFragment.c(a))
		//*  22   45:aload_0         
		//*  23   46:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//*  24   49:invokestatic    #68  <Method boolean MissionAndMapDetailsFragment.c(MissionAndMapDetailsFragment)>
		//*  25   52:ifne            62
				a.c();
		//   26   55:aload_0         
		//   27   56:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   28   59:invokevirtual   #70  <Method void MissionAndMapDetailsFragment.c()>
			MissionAndMapDetailsFragment.b(a, ((HashSet) (obj)).contains(((Object) (SettingType.WifiMaps))));
		//   29   62:aload_0         
		//   30   63:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   31   66:aload_2         
		//   32   67:getstatic       #73  <Field SettingType SettingType.WifiMaps>
		//   33   70:invokevirtual   #61  <Method boolean HashSet.contains(Object)>
		//   34   73:invokestatic    #75  <Method boolean MissionAndMapDetailsFragment.b(MissionAndMapDetailsFragment, boolean)>
		//   35   76:pop             
			if(MissionAndMapDetailsFragment.d(a))
		//*  36   77:aload_0         
		//*  37   78:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//*  38   81:invokestatic    #77  <Method boolean MissionAndMapDetailsFragment.d(MissionAndMapDetailsFragment)>
		//*  39   84:ifeq            96
				a.b(0x7f0f0978);
		//   40   87:aload_0         
		//   41   88:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   42   91:ldc1            #78  <Int 0x7f0f0978>
		//   43   93:invokevirtual   #81  <Method void MissionAndMapDetailsFragment.b(int)>
			obj = ((Object) (settingsuiservicedata.getSettingsChangeList().iterator()));
		//   44   96:aload_1         
		//   45   97:invokevirtual   #84  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
		//   46  100:invokevirtual   #88  <Method Iterator HashSet.iterator()>
		//   47  103:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   48  104:aload_2         
		//   49  105:invokeinterface #94  <Method boolean Iterator.hasNext()>
		//   50  110:ifeq            156
				SettingType settingtype = (SettingType)((Iterator) (obj)).next();
		//   51  113:aload_2         
		//   52  114:invokeinterface #98  <Method Object Iterator.next()>
		//   53  119:checkcast       #51  <Class SettingType>
		//   54  122:astore_3        
				static class _cls7
				{

					static final int a[];
					static final int b[];
					static final int c[];
					static final int d[];

					static 
					{
						d = new int[AssetNetworkUIServiceDataState.values().length];
					//    0    0:invokestatic    #21  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #23  <Field int[] d>
						try
						{
							d[AssetNetworkUIServiceDataState.RemoteConnectionState.ordinal()] = 1;
					//    4    9:getstatic       #23  <Field int[] d>
					//    5   12:getstatic       #27  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.RemoteConnectionState>
					//    6   15:invokevirtual   #31  <Method int AssetNetworkUIServiceDataState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:invokestatic    #36  <Method SettingType[] SettingType.values()>
					//*  10   23:arraylength     
					//*  11   24:newarray        int[]
					//*  12   26:putstatic       #38  <Field int[] c>
					//*  13   29:getstatic       #38  <Field int[] c>
					//*  14   32:getstatic       #42  <Field SettingType SettingType.Name>
					//*  15   35:invokevirtual   #43  <Method int SettingType.ordinal()>
					//*  16   38:iconst_1        
					//*  17   39:iastore         
					//*  18   40:invokestatic    #48  <Method RobotMissionHistoryCompletionStatus[] RobotMissionHistoryCompletionStatus.values()>
					//*  19   43:arraylength     
					//*  20   44:newarray        int[]
					//*  21   46:putstatic       #50  <Field int[] b>
					//*  22   49:getstatic       #50  <Field int[] b>
					//*  23   52:getstatic       #54  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Completed>
					//*  24   55:invokevirtual   #55  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  25   58:iconst_1        
					//*  26   59:iastore         
					//*  27   60:getstatic       #50  <Field int[] b>
					//*  28   63:getstatic       #58  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Canceled>
					//*  29   66:invokevirtual   #55  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
					//*  30   69:iconst_2        
					//*  31   70:iastore         
					//*  32   71:invokestatic    #63  <Method HistoryDataState[] HistoryDataState.values()>
					//*  33   74:arraylength     
					//*  34   75:newarray        int[]
					//*  35   77:putstatic       #65  <Field int[] a>
					//*  36   80:getstatic       #65  <Field int[] a>
					//*  37   83:getstatic       #69  <Field HistoryDataState HistoryDataState.MissionDetailedHistory>
					//*  38   86:invokevirtual   #70  <Method int HistoryDataState.ordinal()>
					//*  39   89:iconst_1        
					//*  40   90:iastore         
					//*  41   91:getstatic       #65  <Field int[] a>
					//*  42   94:getstatic       #73  <Field HistoryDataState HistoryDataState.MissionHistory>
					//*  43   97:invokevirtual   #70  <Method int HistoryDataState.ordinal()>
					//*  44  100:iconst_2        
					//*  45  101:iastore         
					//*  46  102:getstatic       #65  <Field int[] a>
					//*  47  105:getstatic       #76  <Field HistoryDataState HistoryDataState.MissionRuntimeChart>
					//*  48  108:invokevirtual   #70  <Method int HistoryDataState.ordinal()>
					//*  49  111:iconst_3        
					//*  50  112:iastore         
					//*  51  113:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   52  114:astore_0        
						c = new int[SettingType.values().length];
						try
						{
							c[SettingType.Name.ordinal()] = 1;
						}
					//*  53  115:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   54  118:astore_0        
						b = new int[RobotMissionHistoryCompletionStatus.values().length];
						try
						{
							b[RobotMissionHistoryCompletionStatus.Completed.ordinal()] = 1;
						}
					//*  55  119:goto            40
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   56  122:astore_0        
						try
						{
							b[RobotMissionHistoryCompletionStatus.Canceled.ordinal()] = 2;
						}
					//*  57  123:goto            60
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   58  126:astore_0        
						a = new int[HistoryDataState.values().length];
						try
						{
							a[HistoryDataState.MissionDetailedHistory.ordinal()] = 1;
						}
					//*  59  127:goto            71
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   60  130:astore_0        
						try
						{
							a[HistoryDataState.MissionHistory.ordinal()] = 2;
						}
					//*  61  131:goto            91
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   62  134:astore_0        
						try
						{
							a[HistoryDataState.MissionRuntimeChart.ordinal()] = 3;
						}
					//*  63  135:goto            102
						catch(NoSuchFieldError nosuchfielderror6) { }
					//   64  138:astore_0        
					//*  65  139:return          
					}
				}

				if(_cls7.c[settingtype.ordinal()] == 1)
		//*  55  123:getstatic       #103 <Field int[] MissionAndMapDetailsFragment$7.c>
		//*  56  126:aload_3         
		//*  57  127:invokevirtual   #107 <Method int SettingType.ordinal()>
		//*  58  130:iaload          
		//*  59  131:iconst_1        
		//*  60  132:icmpeq          138
		//*  61  135:goto            104
					com.irobot.home.fragments.MissionAndMapDetailsFragment.a(a, settingsuiservicedata.getStringSetting(SettingType.Name));
		//   62  138:aload_0         
		//   63  139:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   64  142:aload_1         
		//   65  143:getstatic       #110 <Field SettingType SettingType.Name>
		//   66  146:invokevirtual   #114 <Method String SettingsUIServiceData.getStringSetting(SettingType)>
		//   67  149:invokestatic    #117 <Method String com.irobot.home.fragments.MissionAndMapDetailsFragment.a(MissionAndMapDetailsFragment, String)>
		//   68  152:pop             
			} while(true);
		//   69  153:goto            104
			settingsuiservicedata = ((SettingsUIServiceData) (com.irobot.home.util.j.a(a.B).b()));
		//   70  156:aload_0         
		//   71  157:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   72  160:getfield        #121 <Field String MissionAndMapDetailsFragment.B>
		//   73  163:invokestatic    #126 <Method a j.a(String)>
		//   74  166:invokevirtual   #131 <Method AssetId a.b()>
		//   75  169:astore_1        
			Assembler.getInstance().getNetworkUIService(((AssetId) (settingsuiservicedata))).registerSubscriber(MissionAndMapDetailsFragment.e(a));
		//   76  170:invokestatic    #137 <Method Assembler Assembler.getInstance()>
		//   77  173:aload_1         
		//   78  174:invokevirtual   #141 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
		//   79  177:aload_0         
		//   80  178:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   81  181:invokestatic    #145 <Method AssetNetworkUIServiceDataCallback MissionAndMapDetailsFragment.e(MissionAndMapDetailsFragment)>
		//   82  184:invokevirtual   #151 <Method boolean AssetNetworkUIService.registerSubscriber(AssetNetworkUIServiceDataCallback)>
		//   83  187:pop             
		//   84  188:return          
		}

		final MissionAndMapDetailsFragment a;

		private a()
		{
			a = MissionAndMapDetailsFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MissionAndMapDetailsFragment a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public MissionAndMapDetailsFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method void com.irobot.home.fragments.j()>
		F = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #122 <Field boolean F>
		G = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #124 <Field boolean G>
		H = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #126 <Field int H>
		P = ((SettingsUIServiceDataCallback) (new a()));
	//   11   19:aload_0         
	//   12   20:new             #22  <Class MissionAndMapDetailsFragment$a>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:invokespecial   #129 <Method void MissionAndMapDetailsFragment$a(MissionAndMapDetailsFragment, MissionAndMapDetailsFragment$1)>
	//   17   29:putfield        #131 <Field SettingsUIServiceDataCallback P>
		S = ((List) (new ArrayList()));
	//   18   32:aload_0         
	//   19   33:new             #133 <Class ArrayList>
	//   20   36:dup             
	//   21   37:invokespecial   #134 <Method void ArrayList()>
	//   22   40:putfield        #136 <Field List S>
		T = ((List) (new ArrayList()));
	//   23   43:aload_0         
	//   24   44:new             #133 <Class ArrayList>
	//   25   47:dup             
	//   26   48:invokespecial   #134 <Method void ArrayList()>
	//   27   51:putfield        #138 <Field List T>
		W = 0;
	//   28   54:aload_0         
	//   29   55:iconst_0        
	//   30   56:putfield        #140 <Field int W>
		X = false;
	//   31   59:aload_0         
	//   32   60:iconst_0        
	//   33   61:putfield        #142 <Field boolean X>
		Y = false;
	//   34   64:aload_0         
	//   35   65:iconst_0        
	//   36   66:putfield        #144 <Field boolean Y>
		Z = false;
	//   37   69:aload_0         
	//   38   70:iconst_0        
	//   39   71:putfield        #146 <Field boolean Z>
		aa = false;
	//   40   74:aload_0         
	//   41   75:iconst_0        
	//   42   76:putfield        #148 <Field boolean aa>
		ab = false;
	//   43   79:aload_0         
	//   44   80:iconst_0        
	//   45   81:putfield        #150 <Field boolean ab>
		ac = false;
	//   46   84:aload_0         
	//   47   85:iconst_0        
	//   48   86:putfield        #152 <Field boolean ac>
		ad = false;
	//   49   89:aload_0         
	//   50   90:iconst_0        
	//   51   91:putfield        #154 <Field boolean ad>
		ae = ((HistoryUIServiceDataCallback) (new HistoryUIServiceDataCallback() {

			public void onHistoryUIServiceDataChanged(HistoryUIServiceData historyuiservicedata)
			{
				Iterator iterator = historyuiservicedata.getDataStates().iterator();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList HistoryUIServiceData.getDataStates()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//    4    8:aload_2         
			//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   14:ifeq            118
					HistoryDataState historydatastate = (HistoryDataState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class HistoryDataState>
			//   10   26:astore_3        
					com.irobot.home.util.o.a(MissionAndMapDetailsFragment.h(), historydatastate.name());
			//   11   27:invokestatic    #46  <Method String MissionAndMapDetailsFragment.h()>
			//   12   30:aload_3         
			//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
			//   14   34:invokestatic    #54  <Method void o.a(String, String)>
					switch(com.irobot.home.fragments._cls7.a[historydatastate.ordinal()])
			//*  15   37:getstatic       #59  <Field int[] com.irobot.home.fragments.MissionAndMapDetailsFragment$7.a>
			//*  16   40:aload_3         
			//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
			//*  18   44:iaload          
					{
			//*  19   45:tableswitch     1 3: default 72
			//			               1 97
			//			               2 86
			//			               3 75
			//*  20   72:goto            8
					case 3: // '\003'
						a.b(historyuiservicedata);
			//   21   75:aload_0         
			//   22   76:getfield        #12  <Field MissionAndMapDetailsFragment a>
			//   23   79:aload_1         
			//   24   80:invokevirtual   #66  <Method void MissionAndMapDetailsFragment.b(HistoryUIServiceData)>
						break;

			//*  25   83:goto            8
					case 2: // '\002'
						a.a(historyuiservicedata);
			//   26   86:aload_0         
			//   27   87:getfield        #12  <Field MissionAndMapDetailsFragment a>
			//   28   90:aload_1         
			//   29   91:invokevirtual   #68  <Method void com.irobot.home.fragments.MissionAndMapDetailsFragment.a(HistoryUIServiceData)>
						break;

			//*  30   94:goto            8
					case 1: // '\001'
						a.a(historyuiservicedata.getMissionHistoryDetails(a.C));
			//   31   97:aload_0         
			//   32   98:getfield        #12  <Field MissionAndMapDetailsFragment a>
			//   33  101:aload_1         
			//   34  102:aload_0         
			//   35  103:getfield        #12  <Field MissionAndMapDetailsFragment a>
			//   36  106:getfield        #72  <Field int MissionAndMapDetailsFragment.C>
			//   37  109:invokevirtual   #76  <Method RobotMissionHistoryItem HistoryUIServiceData.getMissionHistoryDetails(int)>
			//   38  112:invokevirtual   #79  <Method void com.irobot.home.fragments.MissionAndMapDetailsFragment.a(RobotMissionHistoryItem)>
						break;
					}
				} while(true);
			//*  39  115:goto            8
			//   40  118:return          
			}

			final MissionAndMapDetailsFragment a;

			
			{
				a = MissionAndMapDetailsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MissionAndMapDetailsFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   52   94:aload_0         
	//   53   95:new             #8   <Class MissionAndMapDetailsFragment$1>
	//   54   98:dup             
	//   55   99:aload_0         
	//   56  100:invokespecial   #157 <Method void MissionAndMapDetailsFragment$1(MissionAndMapDetailsFragment)>
	//   57  103:putfield        #159 <Field HistoryUIServiceDataCallback ae>
	//   58  106:aload_0         
	//   59  107:new             #18  <Class MissionAndMapDetailsFragment$6>
	//   60  110:dup             
	//   61  111:aload_0         
	//   62  112:invokespecial   #160 <Method void MissionAndMapDetailsFragment$6(MissionAndMapDetailsFragment)>
	//   63  115:putfield        #162 <Field AssetNetworkUIServiceDataCallback af>
	//   64  118:return          
	}

	private BottomSheetBehavior a(View view, ImageView imageview)
	{
		view = ((View) (BottomSheetBehavior.b(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #168 <Method BottomSheetBehavior BottomSheetBehavior.b(View)>
	//    2    4:astore_1        
		((BottomSheetBehavior) (view)).a((int)TypedValue.applyDimension(1, 50F, getResources().getDisplayMetrics()));
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:ldc1            #169 <Float 50F>
	//    6    9:aload_0         
	//    7   10:invokevirtual   #173 <Method Resources getResources()>
	//    8   13:invokevirtual   #179 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    9   16:invokestatic    #185 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   10   19:f2i             
	//   11   20:invokevirtual   #188 <Method void BottomSheetBehavior.a(int)>
		((BottomSheetBehavior) (view)).b(4);
	//   12   23:aload_1         
	//   13   24:iconst_4        
	//   14   25:invokevirtual   #190 <Method void BottomSheetBehavior.b(int)>
		((BottomSheetBehavior) (view)).a(((android.support.design.widget.BottomSheetBehavior.a) (new android.support.design.widget.BottomSheetBehavior.a(imageview) {

			public void a(View view1, float f1)
			{
			//    0    0:return          
			}

			public void a(View view1, int i1)
			{
				if(i1 == 3)
			//*   0    0:iload_2         
			//*   1    1:iconst_3        
			//*   2    2:icmpne          50
				{
					a.setRotation(180F);
			//    3    5:aload_0         
			//    4    6:getfield        #18  <Field ImageView a>
			//    5    9:ldc1            #25  <Float 180F>
			//    6   11:invokevirtual   #31  <Method void ImageView.setRotation(float)>
					if(b.E == MissionMapType.WifiHeat)
			//*   7   14:aload_0         
			//*   8   15:getfield        #16  <Field MissionAndMapDetailsFragment b>
			//*   9   18:getfield        #35  <Field MissionMapType MissionAndMapDetailsFragment.E>
			//*  10   21:getstatic       #40  <Field MissionMapType MissionMapType.WifiHeat>
			//*  11   24:if_acmpne       58
					{
						AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.WifiMapBottomSheet, com.irobot.home.util.j.a(b.B).a());
			//   12   27:invokestatic    #46  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   13   30:getstatic       #52  <Field ViewId ViewId.WifiMapBottomSheet>
			//   14   33:aload_0         
			//   15   34:getfield        #16  <Field MissionAndMapDetailsFragment b>
			//   16   37:getfield        #56  <Field String MissionAndMapDetailsFragment.B>
			//   17   40:invokestatic    #61  <Method a j.a(String)>
			//   18   43:invokevirtual   #66  <Method AssetInfo a.a()>
			//   19   46:invokevirtual   #70  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
						return;
			//   20   49:return          
					}
				} else
				{
					a.setRotation(0.0F);
			//   21   50:aload_0         
			//   22   51:getfield        #18  <Field ImageView a>
			//   23   54:fconst_0        
			//   24   55:invokevirtual   #31  <Method void ImageView.setRotation(float)>
				}
			//   25   58:return          
			}

			final ImageView a;
			final MissionAndMapDetailsFragment b;

			
			{
				b = MissionAndMapDetailsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MissionAndMapDetailsFragment b>
				a = imageview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field ImageView a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void android.support.design.widget.BottomSheetBehavior$a()>
			//    8   14:return          
			}
		}
)));
	//   15   28:aload_1         
	//   16   29:new             #10  <Class MissionAndMapDetailsFragment$2>
	//   17   32:dup             
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:invokespecial   #193 <Method void MissionAndMapDetailsFragment$2(MissionAndMapDetailsFragment, ImageView)>
	//   21   38:invokevirtual   #196 <Method void BottomSheetBehavior.a(android.support.design.widget.BottomSheetBehavior$a)>
		return ((BottomSheetBehavior) (view));
	//   22   41:aload_1         
	//   23   42:areturn         
	}

	static String a(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		return missionandmapdetailsfragment.M;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field String M>
	//    2    4:areturn         
	}

	static String a(MissionAndMapDetailsFragment missionandmapdetailsfragment, String s1)
	{
		missionandmapdetailsfragment.V = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #202 <Field String V>
		return s1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(BottomSheetBehavior bottomsheetbehavior)
	{
		if(bottomsheetbehavior.a() == 4)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #206 <Method int BottomSheetBehavior.a()>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          14
		{
			bottomsheetbehavior.b(3);
	//    4    8:aload_1         
	//    5    9:iconst_3        
	//    6   10:invokevirtual   #190 <Method void BottomSheetBehavior.b(int)>
			return;
	//    7   13:return          
		} else
		{
			bottomsheetbehavior.b(4);
	//    8   14:aload_1         
	//    9   15:iconst_4        
	//   10   16:invokevirtual   #190 <Method void BottomSheetBehavior.b(int)>
			return;
	//   11   19:return          
		}
	}

	private void a(NetworkState networkstate)
	{
		String s1 = I;
	//    0    0:getstatic       #116 <Field String I>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #209 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #210 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("** Remote Network State: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #212 <String "** Remote Network State: ">
	//    8   15:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (networkstate)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #219 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		com.irobot.home.util.o.a(s1, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #227 <Method void o.a(String, String)>
		if(d.getVisibility() == 0 && networkstate == NetworkState.Error)
	//*  18   33:aload_0         
	//*  19   34:getfield        #229 <Field ProgressBar d>
	//*  20   37:invokevirtual   #234 <Method int ProgressBar.getVisibility()>
	//*  21   40:ifne            55
	//*  22   43:aload_1         
	//*  23   44:getstatic       #240 <Field NetworkState NetworkState.Error>
	//*  24   47:if_acmpne       55
		{
			c();
	//   25   50:aload_0         
	//   26   51:invokevirtual   #242 <Method void c()>
			return;
	//   27   54:return          
		}
		if(c.getVisibility() == 0 && networkstate == NetworkState.Connecting && X)
	//*  28   55:aload_0         
	//*  29   56:getfield        #244 <Field RelativeLayout c>
	//*  30   59:invokevirtual   #247 <Method int RelativeLayout.getVisibility()>
	//*  31   62:ifne            83
	//*  32   65:aload_1         
	//*  33   66:getstatic       #250 <Field NetworkState NetworkState.Connecting>
	//*  34   69:if_acmpne       83
	//*  35   72:aload_0         
	//*  36   73:getfield        #142 <Field boolean X>
	//*  37   76:ifeq            83
			e();
	//   38   79:aload_0         
	//   39   80:invokevirtual   #252 <Method void e()>
	//   40   83:return          
	}

	static void a(MissionAndMapDetailsFragment missionandmapdetailsfragment, NetworkState networkstate)
	{
		missionandmapdetailsfragment.a(networkstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #255 <Method void a(NetworkState)>
	//    3    5:return          
	}

	static boolean a(MissionAndMapDetailsFragment missionandmapdetailsfragment, boolean flag)
	{
		missionandmapdetailsfragment.X = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field boolean X>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static SettingsSubsystem b(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		return missionandmapdetailsfragment.O;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field SettingsSubsystem O>
	//    2    4:areturn         
	}

	private void b(String s1)
	{
		int i1;
label0:
		{
			boolean flag;
			if(H != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field int H>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
				flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
			else
	//*   6   10:goto            15
				flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			boolean flag1;
			if(J != null && J.getErrorCode() > 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #262 <Field RobotMissionHistoryItem J>
	//*  11   19:ifnull          37
	//*  12   22:aload_0         
	//*  13   23:getfield        #262 <Field RobotMissionHistoryItem J>
	//*  14   26:invokevirtual   #268 <Method short RobotMissionHistoryItem.getErrorCode()>
	//*  15   29:ifle            37
				flag1 = true;
	//   16   32:iconst_1        
	//   17   33:istore_3        
			else
	//*  18   34:goto            39
				flag1 = false;
	//   19   37:iconst_0        
	//   20   38:istore_3        
			if(flag || flag1)
	//*  21   39:iload_2         
	//*  22   40:ifne            47
	//*  23   43:iload_3         
	//*  24   44:ifeq            277
			{
				if(flag)
	//*  25   47:iload_2         
	//*  26   48:ifeq            59
					i1 = H;
	//   27   51:aload_0         
	//   28   52:getfield        #126 <Field int H>
	//   29   55:istore_2        
				else
	//*  30   56:goto            67
					i1 = ((int) (J.getErrorCode()));
	//   31   59:aload_0         
	//   32   60:getfield        #262 <Field RobotMissionHistoryItem J>
	//   33   63:invokevirtual   #268 <Method short RobotMissionHistoryItem.getErrorCode()>
	//   34   66:istore_2        
				L = com.irobot.home.model.r.get(i1);
	//   35   67:aload_0         
	//   36   68:iload_2         
	//   37   69:invokestatic    #274 <Method r r.get(int)>
	//   38   72:putfield        #276 <Field r L>
				if(L == null || L == r.NO_ERROR)
	//*  39   75:aload_0         
	//*  40   76:getfield        #276 <Field r L>
	//*  41   79:ifnull          278
	//*  42   82:aload_0         
	//*  43   83:getfield        #276 <Field r L>
	//*  44   86:getstatic       #279 <Field r r.NO_ERROR>
	//*  45   89:if_acmpne       95
					break label0;
	//   46   92:goto            278
				s1 = ((String) (com.irobot.home.model.u.a(L, s1)));
	//   47   95:aload_0         
	//   48   96:getfield        #276 <Field r L>
	//   49   99:aload_1         
	//   50  100:invokestatic    #284 <Method q u.a(r, String)>
	//   51  103:astore_1        
				if(s1 == null)
	//*  52  104:aload_1         
	//*  53  105:ifnonnull       153
				{
					s1 = I;
	//   54  108:getstatic       #116 <Field String I>
	//   55  111:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
	//   56  112:new             #209 <Class StringBuilder>
	//   57  115:dup             
	//   58  116:invokespecial   #210 <Method void StringBuilder()>
	//   59  119:astore          4
					stringbuilder.append("No RobotError defined for RobotErrorCode: ");
	//   60  121:aload           4
	//   61  123:ldc2            #286 <String "No RobotError defined for RobotErrorCode: ">
	//   62  126:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   63  129:pop             
					stringbuilder.append(L.getErrorCode());
	//   64  130:aload           4
	//   65  132:aload_0         
	//   66  133:getfield        #276 <Field r L>
	//   67  136:invokevirtual   #288 <Method int r.getErrorCode()>
	//   68  139:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   69  142:pop             
					com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   70  143:aload_1         
	//   71  144:aload           4
	//   72  146:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   73  149:invokestatic    #293 <Method void o.e(String, String)>
					return;
	//   74  152:return          
				}
				i1 = ((q) (s1)).b();
	//   75  153:aload_1         
	//   76  154:invokevirtual   #297 <Method int q.b()>
	//   77  157:istore_2        
				if(i1 == -1)
	//*  78  158:iload_2         
	//*  79  159:iconst_m1       
	//*  80  160:icmpne          207
				{
					String s2 = I;
	//   81  163:getstatic       #116 <Field String I>
	//   82  166:astore          4
					StringBuilder stringbuilder2 = new StringBuilder();
	//   83  168:new             #209 <Class StringBuilder>
	//   84  171:dup             
	//   85  172:invokespecial   #210 <Method void StringBuilder()>
	//   86  175:astore          5
					stringbuilder2.append("No string resource ID defined for RobotError: ");
	//   87  177:aload           5
	//   88  179:ldc2            #299 <String "No string resource ID defined for RobotError: ">
	//   89  182:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   90  185:pop             
					stringbuilder2.append(((q) (s1)).a());
	//   91  186:aload           5
	//   92  188:aload_1         
	//   93  189:invokevirtual   #301 <Method String q.a()>
	//   94  192:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   95  195:pop             
					com.irobot.home.util.o.e(s2, stringbuilder2.toString());
	//   96  196:aload           4
	//   97  198:aload           5
	//   98  200:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   99  203:invokestatic    #293 <Method void o.e(String, String)>
					return;
	//  100  206:return          
				}
				s1 = getString(i1, new Object[] {
					V
				});
	//  101  207:aload_0         
	//  102  208:iload_2         
	//  103  209:iconst_1        
	//  104  210:anewarray       Object[]
	//  105  213:dup             
	//  106  214:iconst_0        
	//  107  215:aload_0         
	//  108  216:getfield        #202 <Field String V>
	//  109  219:aastore         
	//  110  220:invokevirtual   #307 <Method String getString(int, Object[])>
	//  111  223:astore_1        
				q.setVisibility(0);
	//  112  224:aload_0         
	//  113  225:getfield        #309 <Field CustomTextView q>
	//  114  228:iconst_0        
	//  115  229:invokevirtual   #314 <Method void CustomTextView.setVisibility(int)>
				q.setPaintFlags(8);
	//  116  232:aload_0         
	//  117  233:getfield        #309 <Field CustomTextView q>
	//  118  236:bipush          8
	//  119  238:invokevirtual   #317 <Method void CustomTextView.setPaintFlags(int)>
				q.setText(((CharSequence) (s1)));
	//  120  241:aload_0         
	//  121  242:getfield        #309 <Field CustomTextView q>
	//  122  245:aload_1         
	//  123  246:invokevirtual   #321 <Method void CustomTextView.setText(CharSequence)>
				i.requestLayout();
	//  124  249:aload_0         
	//  125  250:getfield        #323 <Field LinearLayout i>
	//  126  253:invokevirtual   #328 <Method void LinearLayout.requestLayout()>
				i.invalidate();
	//  127  256:aload_0         
	//  128  257:getfield        #323 <Field LinearLayout i>
	//  129  260:invokevirtual   #331 <Method void LinearLayout.invalidate()>
				e.requestLayout();
	//  130  263:aload_0         
	//  131  264:getfield        #333 <Field View e>
	//  132  267:invokevirtual   #336 <Method void View.requestLayout()>
				e.invalidate();
	//  133  270:aload_0         
	//  134  271:getfield        #333 <Field View e>
	//  135  274:invokevirtual   #337 <Method void View.invalidate()>
			}
			return;
	//  136  277:return          
		}
		s1 = I;
	//  137  278:getstatic       #116 <Field String I>
	//  138  281:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//  139  282:new             #209 <Class StringBuilder>
	//  140  285:dup             
	//  141  286:invokespecial   #210 <Method void StringBuilder()>
	//  142  289:astore          4
		stringbuilder1.append("No RobotErrorCode defined for error/pause ID: ");
	//  143  291:aload           4
	//  144  293:ldc2            #339 <String "No RobotErrorCode defined for error/pause ID: ">
	//  145  296:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//  146  299:pop             
		stringbuilder1.append(i1);
	//  147  300:aload           4
	//  148  302:iload_2         
	//  149  303:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//  150  306:pop             
		com.irobot.home.util.o.e(s1, stringbuilder1.toString());
	//  151  307:aload_1         
	//  152  308:aload           4
	//  153  310:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  154  313:invokestatic    #293 <Method void o.e(String, String)>
	//  155  316:return          
	}

	static boolean b(MissionAndMapDetailsFragment missionandmapdetailsfragment, boolean flag)
	{
		missionandmapdetailsfragment.Y = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #144 <Field boolean Y>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void c(int i1)
	{
		int j1 = i1 / 60;
	//    0    0:iload_1         
	//    1    1:bipush          60
	//    2    3:idiv            
	//    3    4:istore_2        
		if(i1 < 60)
	//*   4    5:iload_1         
	//*   5    6:bipush          60
	//*   6    8:icmpge          23
		{
			p.setText(((CharSequence) (Integer.toString(i1))));
	//    7   11:aload_0         
	//    8   12:getfield        #341 <Field TextView p>
	//    9   15:iload_1         
	//   10   16:invokestatic    #346 <Method String Integer.toString(int)>
	//   11   19:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
			return;
	//   12   22:return          
		} else
		{
			TextView textview = p;
	//   13   23:aload_0         
	//   14   24:getfield        #341 <Field TextView p>
	//   15   27:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   28:new             #209 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #210 <Method void StringBuilder()>
	//   19   35:astore          4
			stringbuilder.append(j1);
	//   20   37:aload           4
	//   21   39:iload_2         
	//   22   40:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   23   43:pop             
			stringbuilder.append(":");
	//   24   44:aload           4
	//   25   46:ldc2            #351 <String ":">
	//   26   49:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			stringbuilder.append(String.format("%02d", new Object[] {
				Integer.valueOf(i1 % 60)
			}));
	//   28   53:aload           4
	//   29   55:ldc2            #353 <String "%02d">
	//   30   58:iconst_1        
	//   31   59:anewarray       Object[]
	//   32   62:dup             
	//   33   63:iconst_0        
	//   34   64:iload_1         
	//   35   65:bipush          60
	//   36   67:irem            
	//   37   68:invokestatic    #357 <Method Integer Integer.valueOf(int)>
	//   38   71:aastore         
	//   39   72:invokestatic    #363 <Method String String.format(String, Object[])>
	//   40   75:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   41   78:pop             
			textview.setText(((CharSequence) (stringbuilder.toString())));
	//   42   79:aload_3         
	//   43   80:aload           4
	//   44   82:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   45   85:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
			return;
	//   46   88:return          
		}
	}

	static boolean c(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		return missionandmapdetailsfragment.X;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field boolean X>
	//    2    4:ireturn         
	}

	static boolean d(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		return missionandmapdetailsfragment.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #367 <Method boolean l()>
	//    2    4:ireturn         
	}

	static AssetNetworkUIServiceDataCallback e(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		return missionandmapdetailsfragment.af;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field AssetNetworkUIServiceDataCallback af>
	//    2    4:areturn         
	}

	static String h()
	{
		return I;
	//    0    0:getstatic       #116 <Field String I>
	//    1    3:areturn         
	}

	private void i()
	{
		Resources resources;
		Q = a(e, l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #333 <Field View e>
	//    4    6:aload_0         
	//    5    7:getfield        #371 <Field ImageView l>
	//    6   10:invokespecial   #373 <Method BottomSheetBehavior a(View, ImageView)>
	//    7   13:putfield        #375 <Field BottomSheetBehavior Q>
		resources = getResources();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #173 <Method Resources getResources()>
	//   10   20:astore          5
		_cls7.b[J.getCompletionStatus().ordinal()];
	//   11   22:getstatic       #378 <Field int[] MissionAndMapDetailsFragment$7.b>
	//   12   25:aload_0         
	//   13   26:getfield        #262 <Field RobotMissionHistoryItem J>
	//   14   29:invokevirtual   #382 <Method RobotMissionHistoryCompletionStatus RobotMissionHistoryItem.getCompletionStatus()>
	//   15   32:invokevirtual   #387 <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//   16   35:iaload          
		JVM INSTR tableswitch 1 2: default 60
	//	               1 127
	//	               2 100;
	//   17   36:tableswitch     1 2: default 60
	//	               1 127
	//	               2 100
		   goto _L1 _L2 _L3
_L1:
		CustomTextView customtextview;
		String s1;
		j.setImageDrawable(resources.getDrawable(0x7f08015d));
	//   18   60:aload_0         
	//   19   61:getfield        #389 <Field ImageView j>
	//   20   64:aload           5
	//   21   66:ldc2            #390 <Int 0x7f08015d>
	//   22   69:invokevirtual   #394 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   23   72:invokevirtual   #400 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		customtextview = k;
	//   24   75:aload_0         
	//   25   76:getfield        #402 <Field CustomTextView k>
	//   26   79:astore_2        
		s1 = com.irobot.home.util.j.a(((android.content.Context) (getActivity())), J);
	//   27   80:aload_0         
	//   28   81:invokevirtual   #406 <Method FragmentActivity getActivity()>
	//   29   84:aload_0         
	//   30   85:getfield        #262 <Field RobotMissionHistoryItem J>
	//   31   88:invokestatic    #409 <Method String j.a(android.content.Context, RobotMissionHistoryItem)>
	//   32   91:astore_3        
_L5:
		customtextview.setText(((CharSequence) (s1)));
	//   33   92:aload_2         
	//   34   93:aload_3         
	//   35   94:invokevirtual   #321 <Method void CustomTextView.setText(CharSequence)>
		break; /* Loop/switch isn't completed */
	//   36   97:goto            160
_L3:
		int i1;
		j.setImageDrawable(resources.getDrawable(0x7f080097));
	//   37  100:aload_0         
	//   38  101:getfield        #389 <Field ImageView j>
	//   39  104:aload           5
	//   40  106:ldc2            #410 <Int 0x7f080097>
	//   41  109:invokevirtual   #394 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   42  112:invokevirtual   #400 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		customtextview = k;
	//   43  115:aload_0         
	//   44  116:getfield        #402 <Field CustomTextView k>
	//   45  119:astore_2        
		i1 = 0x7f0f01af;
	//   46  120:ldc2            #411 <Int 0x7f0f01af>
	//   47  123:istore_1        
		break; /* Loop/switch isn't completed */
	//   48  124:goto            151
_L2:
		j.setImageDrawable(resources.getDrawable(0x7f08015c));
	//   49  127:aload_0         
	//   50  128:getfield        #389 <Field ImageView j>
	//   51  131:aload           5
	//   52  133:ldc2            #412 <Int 0x7f08015c>
	//   53  136:invokevirtual   #394 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   54  139:invokevirtual   #400 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		customtextview = k;
	//   55  142:aload_0         
	//   56  143:getfield        #402 <Field CustomTextView k>
	//   57  146:astore_2        
		i1 = 0x7f0f01b5;
	//   58  147:ldc2            #413 <Int 0x7f0f01b5>
	//   59  150:istore_1        
		s1 = getString(i1);
	//   60  151:aload_0         
	//   61  152:iload_1         
	//   62  153:invokevirtual   #415 <Method String getString(int)>
	//   63  156:astore_3        
		if(true) goto _L5; else goto _L4
	//   64  157:goto            92
_L4:
		int j1 = J.getSquareFeetCovered();
	//   65  160:aload_0         
	//   66  161:getfield        #262 <Field RobotMissionHistoryItem J>
	//   67  164:invokevirtual   #418 <Method int RobotMissionHistoryItem.getSquareFeetCovered()>
	//   68  167:istore_1        
		CustomTextView customtextview1;
		String s2;
		Object aobj[];
		if(i.f)
	//*  69  168:getstatic       #422 <Field boolean i.f>
	//*  70  171:ifeq            238
		{
			j1 = (int)((float)j1 * 0.0929F);
	//   71  174:iload_1         
	//   72  175:i2f             
	//   73  176:ldc2            #423 <Float 0.0929F>
	//   74  179:fmul            
	//   75  180:f2i             
	//   76  181:istore_1        
			n.setText(((CharSequence) (Integer.toString(j1))));
	//   77  182:aload_0         
	//   78  183:getfield        #425 <Field TextView n>
	//   79  186:iload_1         
	//   80  187:invokestatic    #346 <Method String Integer.toString(int)>
	//   81  190:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
			customtextview1 = r;
	//   82  193:aload_0         
	//   83  194:getfield        #427 <Field CustomTextView r>
	//   84  197:astore_2        
			s2 = resources.getString(0x7f0f009e);
	//   85  198:aload           5
	//   86  200:ldc2            #428 <Int 0x7f0f009e>
	//   87  203:invokevirtual   #429 <Method String Resources.getString(int)>
	//   88  206:astore_3        
			aobj = new Object[1];
	//   89  207:iconst_1        
	//   90  208:anewarray       Object[]
	//   91  211:astore          4
			aobj[0] = ((Object) (resources.getString(0x7f0f0864)));
	//   92  213:aload           4
	//   93  215:iconst_0        
	//   94  216:aload           5
	//   95  218:ldc2            #430 <Int 0x7f0f0864>
	//   96  221:invokevirtual   #429 <Method String Resources.getString(int)>
	//   97  224:aastore         
		} else
	//*  98  225:aload_2         
	//*  99  226:aload_3         
	//* 100  227:aload           4
	//* 101  229:invokestatic    #363 <Method String String.format(String, Object[])>
	//* 102  232:invokevirtual   #321 <Method void CustomTextView.setText(CharSequence)>
	//* 103  235:goto            284
		{
			n.setText(((CharSequence) (Integer.toString(j1))));
	//  104  238:aload_0         
	//  105  239:getfield        #425 <Field TextView n>
	//  106  242:iload_1         
	//  107  243:invokestatic    #346 <Method String Integer.toString(int)>
	//  108  246:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
			customtextview1 = r;
	//  109  249:aload_0         
	//  110  250:getfield        #427 <Field CustomTextView r>
	//  111  253:astore_2        
			s2 = resources.getString(0x7f0f009e);
	//  112  254:aload           5
	//  113  256:ldc2            #428 <Int 0x7f0f009e>
	//  114  259:invokevirtual   #429 <Method String Resources.getString(int)>
	//  115  262:astore_3        
			aobj = new Object[1];
	//  116  263:iconst_1        
	//  117  264:anewarray       Object[]
	//  118  267:astore          4
			aobj[0] = ((Object) (resources.getString(0x7f0f0863)));
	//  119  269:aload           4
	//  120  271:iconst_0        
	//  121  272:aload           5
	//  122  274:ldc2            #431 <Int 0x7f0f0863>
	//  123  277:invokevirtual   #429 <Method String Resources.getString(int)>
	//  124  280:aastore         
		}
		customtextview1.setText(((CharSequence) (String.format(s2, aobj))));
	//* 125  281:goto            225
		j1 = ((int) (J.getNumberOfDirtDetects()));
	//  126  284:aload_0         
	//  127  285:getfield        #262 <Field RobotMissionHistoryItem J>
	//  128  288:invokevirtual   #434 <Method short RobotMissionHistoryItem.getNumberOfDirtDetects()>
	//  129  291:istore_1        
		o.setText(((CharSequence) (Integer.toString(j1))));
	//  130  292:aload_0         
	//  131  293:getfield        #436 <Field TextView o>
	//  132  296:iload_1         
	//  133  297:invokestatic    #346 <Method String Integer.toString(int)>
	//  134  300:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
		c(J.getMinutesRunning() + J.getMinutesCharging() + J.getMinutesPaused());
	//  135  303:aload_0         
	//  136  304:aload_0         
	//  137  305:getfield        #262 <Field RobotMissionHistoryItem J>
	//  138  308:invokevirtual   #439 <Method int RobotMissionHistoryItem.getMinutesRunning()>
	//  139  311:aload_0         
	//  140  312:getfield        #262 <Field RobotMissionHistoryItem J>
	//  141  315:invokevirtual   #442 <Method int RobotMissionHistoryItem.getMinutesCharging()>
	//  142  318:iadd            
	//  143  319:aload_0         
	//  144  320:getfield        #262 <Field RobotMissionHistoryItem J>
	//  145  323:invokevirtual   #445 <Method int RobotMissionHistoryItem.getMinutesPaused()>
	//  146  326:iadd            
	//  147  327:invokespecial   #447 <Method void c(int)>
		j1 = J.getMinutesRunning();
	//  148  330:aload_0         
	//  149  331:getfield        #262 <Field RobotMissionHistoryItem J>
	//  150  334:invokevirtual   #439 <Method int RobotMissionHistoryItem.getMinutesRunning()>
	//  151  337:istore_1        
		s.setText(((CharSequence) (com.irobot.home.util.j.a(j1, resources))));
	//  152  338:aload_0         
	//  153  339:getfield        #449 <Field CustomTextView s>
	//  154  342:iload_1         
	//  155  343:aload           5
	//  156  345:invokestatic    #452 <Method String j.a(int, Resources)>
	//  157  348:invokevirtual   #321 <Method void CustomTextView.setText(CharSequence)>
		j1 = J.getMinutesCharging();
	//  158  351:aload_0         
	//  159  352:getfield        #262 <Field RobotMissionHistoryItem J>
	//  160  355:invokevirtual   #442 <Method int RobotMissionHistoryItem.getMinutesCharging()>
	//  161  358:istore_1        
		t.setText(((CharSequence) (com.irobot.home.util.j.a(j1, resources))));
	//  162  359:aload_0         
	//  163  360:getfield        #454 <Field CustomTextView t>
	//  164  363:iload_1         
	//  165  364:aload           5
	//  166  366:invokestatic    #452 <Method String j.a(int, Resources)>
	//  167  369:invokevirtual   #321 <Method void CustomTextView.setText(CharSequence)>
		j1 = J.getMinutesPaused();
	//  168  372:aload_0         
	//  169  373:getfield        #262 <Field RobotMissionHistoryItem J>
	//  170  376:invokevirtual   #445 <Method int RobotMissionHistoryItem.getMinutesPaused()>
	//  171  379:istore_1        
		u.setText(((CharSequence) (com.irobot.home.util.j.a(j1, resources))));
	//  172  380:aload_0         
	//  173  381:getfield        #456 <Field CustomTextView u>
	//  174  384:iload_1         
	//  175  385:aload           5
	//  176  387:invokestatic    #452 <Method String j.a(int, Resources)>
	//  177  390:invokevirtual   #321 <Method void CustomTextView.setText(CharSequence)>
		return;
	//  178  393:return          
	}

	private void j()
	{
		R = a(f, m);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #458 <Field View f>
	//    4    6:aload_0         
	//    5    7:getfield        #460 <Field ImageView m>
	//    6   10:invokespecial   #373 <Method BottomSheetBehavior a(View, ImageView)>
	//    7   13:putfield        #462 <Field BottomSheetBehavior R>
		a();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #464 <Method void a()>
	//   10   20:return          
	}

	private void k()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #242 <Method void c()>
		b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #466 <Method void b()>
	//    4    8:return          
	}

	private boolean l()
	{
		return E == MissionMapType.WifiHeat && !Y;
	//    0    0:aload_0         
	//    1    1:getfield        #468 <Field MissionMapType E>
	//    2    4:getstatic       #473 <Field MissionMapType MissionMapType.WifiHeat>
	//    3    7:if_acmpne       19
	//    4   10:aload_0         
	//    5   11:getfield        #144 <Field boolean Y>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private void m()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(B).a();
	//    0    0:aload_0         
	//    1    1:getfield        #475 <Field String B>
	//    2    4:invokestatic    #478 <Method a j.a(String)>
	//    3    7:invokevirtual   #483 <Method AssetInfo a.a()>
	//    4   10:astore          4
		RobotMissionHistoryCompletionStatus robotmissionhistorycompletionstatus = J.getCompletionStatus();
	//    5   12:aload_0         
	//    6   13:getfield        #262 <Field RobotMissionHistoryItem J>
	//    7   16:invokevirtual   #382 <Method RobotMissionHistoryCompletionStatus RobotMissionHistoryItem.getCompletionStatus()>
	//    8   19:astore          5
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd");
	//    9   21:new             #485 <Class SimpleDateFormat>
	//   10   24:dup             
	//   11   25:ldc2            #487 <String "yyyyMMdd">
	//   12   28:invokespecial   #489 <Method void SimpleDateFormat(String)>
	//   13   31:astore          6
		String s1 = simpledateformat.format(new Date());
	//   14   33:aload           6
	//   15   35:new             #491 <Class Date>
	//   16   38:dup             
	//   17   39:invokespecial   #492 <Method void Date()>
	//   18   42:invokevirtual   #495 <Method String SimpleDateFormat.format(Date)>
	//   19   45:astore          7
		boolean flag = simpledateformat.format(new Date((long)J.getTimestamp() * 1000L)).equals(((Object) (s1)));
	//   20   47:aload           6
	//   21   49:new             #491 <Class Date>
	//   22   52:dup             
	//   23   53:aload_0         
	//   24   54:getfield        #262 <Field RobotMissionHistoryItem J>
	//   25   57:invokevirtual   #498 <Method int RobotMissionHistoryItem.getTimestamp()>
	//   26   60:i2l             
	//   27   61:ldc2w           #499 <Long 1000L>
	//   28   64:lmul            
	//   29   65:invokespecial   #503 <Method void Date(long)>
	//   30   68:invokevirtual   #495 <Method String SimpleDateFormat.format(Date)>
	//   31   71:aload           7
	//   32   73:invokevirtual   #507 <Method boolean String.equals(Object)>
	//   33   76:istore_3        
		int i1 = J.getSquareFeetCovered();
	//   34   77:aload_0         
	//   35   78:getfield        #262 <Field RobotMissionHistoryItem J>
	//   36   81:invokevirtual   #418 <Method int RobotMissionHistoryItem.getSquareFeetCovered()>
	//   37   84:istore_1        
		short word0 = J.getNumberOfDirtDetects();
	//   38   85:aload_0         
	//   39   86:getfield        #262 <Field RobotMissionHistoryItem J>
	//   40   89:invokevirtual   #434 <Method short RobotMissionHistoryItem.getNumberOfDirtDetects()>
	//   41   92:istore_2        
		AnalyticsSubsystem.getInstance().trackHistoryDetailView(assetinfo, robotmissionhistorycompletionstatus, flag, i1, ((int) (word0)));
	//   42   93:invokestatic    #513 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   43   96:aload           4
	//   44   98:aload           5
	//   45  100:iload_3         
	//   46  101:iload_1         
	//   47  102:iload_2         
	//   48  103:invokevirtual   #517 <Method void AnalyticsSubsystem.trackHistoryDetailView(AssetInfo, RobotMissionHistoryCompletionStatus, boolean, int, int)>
	//   49  106:return          
	}

	protected void a()
	{
		z.setText(((CharSequence) (getResources().getQuantityString(0x7f0d0022, W, new Object[] {
			Integer.valueOf(W)
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #519 <Field CustomTextView z>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #173 <Method Resources getResources()>
	//    4    8:ldc2            #520 <Int 0x7f0d0022>
	//    5   11:aload_0         
	//    6   12:getfield        #140 <Field int W>
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:getfield        #140 <Field int W>
	//   13   25:invokestatic    #357 <Method Integer Integer.valueOf(int)>
	//   14   28:aastore         
	//   15   29:invokevirtual   #524 <Method String Resources.getQuantityString(int, int, Object[])>
	//   16   32:invokevirtual   #321 <Method void CustomTextView.setText(CharSequence)>
	//   17   35:return          
	}

	public void a(float f1)
	{
		ad = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #154 <Field boolean ad>
	//    3    5:return          
	}

	public void a(float f1, float f2)
	{
		ac = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #152 <Field boolean ac>
	//    3    5:return          
	}

	protected void a(int i1)
	{
		if(N == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #528 <Field HistoryUIService N>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(l())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #367 <Method boolean l()>
	//*   6   12:ifeq            23
		{
			b(0x7f0f0978);
	//    7   15:aload_0         
	//    8   16:ldc2            #529 <Int 0x7f0f0978>
	//    9   19:invokevirtual   #530 <Method void b(int)>
			return;
	//   10   22:return          
		}
		com.irobot.home.util.j.a(B).b();
	//   11   23:aload_0         
	//   12   24:getfield        #475 <Field String B>
	//   13   27:invokestatic    #478 <Method a j.a(String)>
	//   14   30:invokevirtual   #533 <Method AssetId a.b()>
	//   15   33:pop             
		if(U == null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #535 <Field com.irobot.home.i.a U>
	//*  18   38:ifnonnull       54
			U = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   19   41:aload_0         
	//   20   42:invokestatic    #540 <Method Assembler Assembler.getInstance()>
	//   21   45:invokevirtual   #544 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   22   48:checkcast       #546 <Class com.irobot.home.i.a>
	//   23   51:putfield        #535 <Field com.irobot.home.i.a U>
		U.a(((Object) (this)), EventType.MissionMapEvent);
	//   24   54:aload_0         
	//   25   55:getfield        #535 <Field com.irobot.home.i.a U>
	//   26   58:aload_0         
	//   27   59:getstatic       #552 <Field EventType EventType.MissionMapEvent>
	//   28   62:invokevirtual   #555 <Method void com.irobot.home.i.a.a(Object, EventType)>
	//   29   65:return          
	}

	public void a(HistoryUIServiceData historyuiservicedata)
	{
label0:
		{
			U.b(((Object) (this)), EventType.RobotMissionHistoryEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #535 <Field com.irobot.home.i.a U>
	//    2    4:aload_0         
	//    3    5:getstatic       #559 <Field EventType EventType.RobotMissionHistoryEvent>
	//    4    8:invokevirtual   #561 <Method void com.irobot.home.i.a.b(Object, EventType)>
			for(Iterator iterator = historyuiservicedata.getRobotMissionHistoryList().iterator(); iterator.hasNext();)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #567 <Method ArrayList HistoryUIServiceData.getRobotMissionHistoryList()>
	//*   7   15:invokevirtual   #571 <Method Iterator ArrayList.iterator()>
	//*   8   18:astore          4
	//*   9   20:aload           4
	//*  10   22:invokeinterface #576 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            55
			{
				historyuiservicedata = ((HistoryUIServiceData) ((RobotMissionHistoryItem)iterator.next()));
	//   12   30:aload           4
	//   13   32:invokeinterface #580 <Method Object Iterator.next()>
	//   14   37:checkcast       #264 <Class RobotMissionHistoryItem>
	//   15   40:astore_1        
				if(((RobotMissionHistoryItem) (historyuiservicedata)).getMissionId() == C)
	//*  16   41:aload_1         
	//*  17   42:invokevirtual   #583 <Method int RobotMissionHistoryItem.getMissionId()>
	//*  18   45:aload_0         
	//*  19   46:getfield        #585 <Field int C>
	//*  20   49:icmpne          20
					break label0;
	//   21   52:goto            57
			}

			historyuiservicedata = null;
	//   22   55:aconst_null     
	//   23   56:astore_1        
		}
		Object obj = ((Object) (I));
	//   24   57:getstatic       #116 <Field String I>
	//   25   60:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   26   62:new             #209 <Class StringBuilder>
	//   27   65:dup             
	//   28   66:invokespecial   #210 <Method void StringBuilder()>
	//   29   69:astore          5
		stringbuilder.append("MissionAndMapIdEvent received for asset ID: ");
	//   30   71:aload           5
	//   31   73:ldc2            #587 <String "MissionAndMapIdEvent received for asset ID: ">
	//   32   76:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   33   79:pop             
		stringbuilder.append(B);
	//   34   80:aload           5
	//   35   82:aload_0         
	//   36   83:getfield        #475 <Field String B>
	//   37   86:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   38   89:pop             
		com.irobot.home.util.o.b(((String) (obj)), stringbuilder.toString());
	//   39   90:aload           4
	//   40   92:aload           5
	//   41   94:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   42   97:invokestatic    #589 <Method void o.b(String, String)>
		obj = ((Object) (I));
	//   43  100:getstatic       #116 <Field String I>
	//   44  103:astore          4
		stringbuilder = new StringBuilder();
	//   45  105:new             #209 <Class StringBuilder>
	//   46  108:dup             
	//   47  109:invokespecial   #210 <Method void StringBuilder()>
	//   48  112:astore          5
		stringbuilder.append("** Mission/Map IDs: ");
	//   49  114:aload           5
	//   50  116:ldc2            #591 <String "** Mission/Map IDs: ">
	//   51  119:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   52  122:pop             
		stringbuilder.append(C);
	//   53  123:aload           5
	//   54  125:aload_0         
	//   55  126:getfield        #585 <Field int C>
	//   56  129:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   57  132:pop             
		stringbuilder.append("/");
	//   58  133:aload           5
	//   59  135:ldc2            #593 <String "/">
	//   60  138:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   61  141:pop             
		stringbuilder.append(((RobotMissionHistoryItem) (historyuiservicedata)).getStaticMapId());
	//   62  142:aload           5
	//   63  144:aload_1         
	//   64  145:invokevirtual   #596 <Method String RobotMissionHistoryItem.getStaticMapId()>
	//   65  148:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   66  151:pop             
		com.irobot.home.util.o.a(((String) (obj)), stringbuilder.toString());
	//   67  152:aload           4
	//   68  154:aload           5
	//   69  156:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   70  159:invokestatic    #227 <Method void o.a(String, String)>
		if(K != null && K.length() > 0 && K.equalsIgnoreCase(((RobotMissionHistoryItem) (historyuiservicedata)).getStaticMapId()))
	//*  71  162:aload_0         
	//*  72  163:getfield        #598 <Field String K>
	//*  73  166:ifnull          194
	//*  74  169:aload_0         
	//*  75  170:getfield        #598 <Field String K>
	//*  76  173:invokevirtual   #601 <Method int String.length()>
	//*  77  176:ifle            194
	//*  78  179:aload_0         
	//*  79  180:getfield        #598 <Field String K>
	//*  80  183:aload_1         
	//*  81  184:invokevirtual   #596 <Method String RobotMissionHistoryItem.getStaticMapId()>
	//*  82  187:invokevirtual   #605 <Method boolean String.equalsIgnoreCase(String)>
	//*  83  190:ifeq            194
			return;
	//   84  193:return          
		K = ((RobotMissionHistoryItem) (historyuiservicedata)).getStaticMapId();
	//   85  194:aload_0         
	//   86  195:aload_1         
	//   87  196:invokevirtual   #596 <Method String RobotMissionHistoryItem.getStaticMapId()>
	//   88  199:putfield        #598 <Field String K>
		obj = ((Object) (com.irobot.home.util.j.a(B).b()));
	//   89  202:aload_0         
	//   90  203:getfield        #475 <Field String B>
	//   91  206:invokestatic    #478 <Method a j.a(String)>
	//   92  209:invokevirtual   #533 <Method AssetId a.b()>
	//   93  212:astore          4
		if(K.length() > 0)
	//*  94  214:aload_0         
	//*  95  215:getfield        #598 <Field String K>
	//*  96  218:invokevirtual   #601 <Method int String.length()>
	//*  97  221:ifle            296
		{
			historyuiservicedata = ((HistoryUIServiceData) (Assembler.getInstance().getMapsUIService(((AssetId) (obj)))));
	//   98  224:invokestatic    #540 <Method Assembler Assembler.getInstance()>
	//   99  227:aload           4
	//  100  229:invokevirtual   #609 <Method MapsUIService Assembler.getMapsUIService(AssetId)>
	//  101  232:astore_1        
			if(historyuiservicedata != null)
	//* 102  233:aload_1         
	//* 103  234:ifnull          339
			{
				Display display = getActivity().getWindowManager().getDefaultDisplay();
	//  104  237:aload_0         
	//  105  238:invokevirtual   #406 <Method FragmentActivity getActivity()>
	//  106  241:invokevirtual   #615 <Method WindowManager FragmentActivity.getWindowManager()>
	//  107  244:invokeinterface #621 <Method Display WindowManager.getDefaultDisplay()>
	//  108  249:astore          4
				Point point = new Point();
	//  109  251:new             #623 <Class Point>
	//  110  254:dup             
	//  111  255:invokespecial   #624 <Method void Point()>
	//  112  258:astore          5
				display.getSize(point);
	//  113  260:aload           4
	//  114  262:aload           5
	//  115  264:invokevirtual   #630 <Method void Display.getSize(Point)>
				int i1 = point.x;
	//  116  267:aload           5
	//  117  269:getfield        #632 <Field int Point.x>
	//  118  272:istore_2        
				int j1 = point.y;
	//  119  273:aload           5
	//  120  275:getfield        #634 <Field int Point.y>
	//  121  278:istore_3        
				((MapsUIService) (historyuiservicedata)).queryStaticMap(K, E, i1, j1);
	//  122  279:aload_1         
	//  123  280:aload_0         
	//  124  281:getfield        #598 <Field String K>
	//  125  284:aload_0         
	//  126  285:getfield        #468 <Field MissionMapType E>
	//  127  288:iload_2         
	//  128  289:i2f             
	//  129  290:iload_3         
	//  130  291:i2f             
	//  131  292:invokevirtual   #640 <Method void MapsUIService.queryStaticMap(String, MissionMapType, float, float)>
				return;
	//  132  295:return          
			}
		} else
		if(com.irobot.home.util.j.i(((RobotMissionHistoryItem) (historyuiservicedata)).getStaticMapRequestedId()))
	//* 133  296:aload_1         
	//* 134  297:invokevirtual   #643 <Method String RobotMissionHistoryItem.getStaticMapRequestedId()>
	//* 135  300:invokestatic    #645 <Method boolean j.i(String)>
	//* 136  303:ifeq            339
		{
			if(System.currentTimeMillis() / 1000L - (long)D < 300L)
	//* 137  306:invokestatic    #651 <Method long System.currentTimeMillis()>
	//* 138  309:ldc2w           #499 <Long 1000L>
	//* 139  312:ldiv            
	//* 140  313:aload_0         
	//* 141  314:getfield        #653 <Field int D>
	//* 142  317:i2l             
	//* 143  318:lsub            
	//* 144  319:ldc2w           #654 <Long 300L>
	//* 145  322:lcmp            
	//* 146  323:ifge            335
			{
				d();
	//  147  326:aload_0         
	//  148  327:invokevirtual   #657 <Method void d()>
				b();
	//  149  330:aload_0         
	//  150  331:invokevirtual   #466 <Method void b()>
				return;
	//  151  334:return          
			}
			k();
	//  152  335:aload_0         
	//  153  336:invokespecial   #659 <Method void k()>
		}
	//  154  339:return          
	}

	protected void a(RobotMissionHistoryItem robotmissionhistoryitem)
	{
		J = robotmissionhistoryitem;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #262 <Field RobotMissionHistoryItem J>
		Object obj = ((Object) (RobotMissionHistoryItemUtil.makeStartDateForItem(robotmissionhistoryitem)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #666 <Method Date RobotMissionHistoryItemUtil.makeStartDateForItem(RobotMissionHistoryItem)>
	//    5    9:astore_2        
		obj = ((Object) (com.irobot.home.util.j.a(((android.content.Context) (getActivity())), (new SimpleDateFormat("EEEE hh:mma MMMM d, yyyy")).format(((Date) (obj))))));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #406 <Method FragmentActivity getActivity()>
	//    8   14:new             #485 <Class SimpleDateFormat>
	//    9   17:dup             
	//   10   18:ldc2            #668 <String "EEEE hh:mma MMMM d, yyyy">
	//   11   21:invokespecial   #489 <Method void SimpleDateFormat(String)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #495 <Method String SimpleDateFormat.format(Date)>
	//   14   28:invokestatic    #671 <Method String j.a(android.content.Context, String)>
	//   15   31:astore_2        
		Robot robot = com.irobot.home.util.j.c(com.irobot.home.util.j.a(B).b());
	//   16   32:aload_0         
	//   17   33:getfield        #475 <Field String B>
	//   18   36:invokestatic    #478 <Method a j.a(String)>
	//   19   39:invokevirtual   #533 <Method AssetId a.b()>
	//   20   42:invokestatic    #674 <Method Robot j.c(AssetId)>
	//   21   45:astore_3        
		if(robot != null)
	//*  22   46:aload_3         
	//*  23   47:ifnull          58
			V = robot.i();
	//   24   50:aload_0         
	//   25   51:aload_3         
	//   26   52:invokevirtual   #678 <Method String Robot.i()>
	//   27   55:putfield        #202 <Field String V>
		if(getActivity() instanceof BaseFragmentActivity)
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #406 <Method FragmentActivity getActivity()>
	//*  30   62:instanceof      #680 <Class BaseFragmentActivity>
	//*  31   65:ifeq            79
			((BaseFragmentActivity)getActivity()).e(((String) (obj)));
	//   32   68:aload_0         
	//   33   69:invokevirtual   #406 <Method FragmentActivity getActivity()>
	//   34   72:checkcast       #680 <Class BaseFragmentActivity>
	//   35   75:aload_2         
	//   36   76:invokevirtual   #682 <Method void BaseFragmentActivity.e(String)>
		a(robotmissionhistoryitem.getMissionId());
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:invokevirtual   #583 <Method int RobotMissionHistoryItem.getMissionId()>
	//   40   84:invokevirtual   #683 <Method void a(int)>
		f();
	//   41   87:aload_0         
	//   42   88:invokevirtual   #685 <Method void f()>
		if(E == MissionMapType.CleanMission)
	//*  43   91:aload_0         
	//*  44   92:getfield        #468 <Field MissionMapType E>
	//*  45   95:getstatic       #688 <Field MissionMapType MissionMapType.CleanMission>
	//*  46   98:if_acmpne       123
		{
			i();
	//   47  101:aload_0         
	//   48  102:invokespecial   #690 <Method void i()>
			if(!F)
	//*  49  105:aload_0         
	//*  50  106:getfield        #122 <Field boolean F>
	//*  51  109:ifne            127
				e.setVisibility(0);
	//   52  112:aload_0         
	//   53  113:getfield        #333 <Field View e>
	//   54  116:iconst_0        
	//   55  117:invokevirtual   #691 <Method void View.setVisibility(int)>
		} else
	//*  56  120:goto            127
		{
			j();
	//   57  123:aload_0         
	//   58  124:invokespecial   #693 <Method void j()>
		}
		b(robot.v());
	//   59  127:aload_0         
	//   60  128:aload_3         
	//   61  129:invokevirtual   #695 <Method String Robot.v()>
	//   62  132:invokespecial   #697 <Method void b(String)>
		m();
	//   63  135:aload_0         
	//   64  136:invokespecial   #699 <Method void m()>
	//   65  139:return          
	}

	public void a(String s1)
	{
		s1 = ((String) (Base64.decode(s1, 0)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #705 <Method byte[] Base64.decode(String, int)>
	//    3    5:astore_1        
		s1 = ((String) (BitmapFactory.decodeByteArray(((byte []) (s1)), 0, s1.length)));
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:aload_1         
	//    7    9:arraylength     
	//    8   10:invokestatic    #711 <Method android.graphics.Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//    9   13:astore_1        
		ArrayList arraylist = new ArrayList();
	//   10   14:new             #133 <Class ArrayList>
	//   11   17:dup             
	//   12   18:invokespecial   #134 <Method void ArrayList()>
	//   13   21:astore_2        
		((List) (arraylist)).add(((Object) (s1)));
	//   14   22:aload_2         
	//   15   23:aload_1         
	//   16   24:invokeinterface #716 <Method boolean List.add(Object)>
	//   17   29:pop             
		a(((List) (arraylist)));
	//   18   30:aload_0         
	//   19   31:aload_2         
	//   20   32:invokevirtual   #719 <Method void a(List)>
	//   21   35:return          
	}

	public void a(List list)
	{
		S.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field List S>
	//    2    4:invokeinterface #722 <Method void List.clear()>
		S.addAll(((java.util.Collection) (list)));
	//    3    9:aload_0         
	//    4   10:getfield        #136 <Field List S>
	//    5   13:aload_1         
	//    6   14:invokeinterface #726 <Method boolean List.addAll(java.util.Collection)>
	//    7   19:pop             
		T.clear();
	//    8   20:aload_0         
	//    9   21:getfield        #138 <Field List T>
	//   10   24:invokeinterface #722 <Method void List.clear()>
		T.addAll(((java.util.Collection) (S)));
	//   11   29:aload_0         
	//   12   30:getfield        #138 <Field List T>
	//   13   33:aload_0         
	//   14   34:getfield        #136 <Field List S>
	//   15   37:invokeinterface #726 <Method boolean List.addAll(java.util.Collection)>
	//   16   42:pop             
		a.a(T);
	//   17   43:aload_0         
	//   18   44:getfield        #728 <Field MapView a>
	//   19   47:aload_0         
	//   20   48:getfield        #138 <Field List T>
	//   21   51:invokevirtual   #731 <Method void MapView.a(List)>
		a.setOnViewManipulatedListener(((com.irobot.home.view.GestureImageView.d) (this)));
	//   22   54:aload_0         
	//   23   55:getfield        #728 <Field MapView a>
	//   24   58:aload_0         
	//   25   59:invokevirtual   #735 <Method void MapView.setOnViewManipulatedListener(com.irobot.home.view.GestureImageView$d)>
		g();
	//   26   62:aload_0         
	//   27   63:invokevirtual   #738 <Method void g()>
	//   28   66:return          
	}

	protected void a(JSONArray jsonarray)
	{
		GradientDrawable gradientdrawable;
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method Resources getResources()>
	//    2    4:astore          4
		gradientdrawable = new GradientDrawable();
	//    3    6:new             #745 <Class GradientDrawable>
	//    4    9:dup             
	//    5   10:invokespecial   #746 <Method void GradientDrawable()>
	//    6   13:astore_3        
		gradientdrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
	//    7   14:aload_3         
	//    8   15:getstatic       #752 <Field android.graphics.drawable.GradientDrawable$Orientation android.graphics.drawable.GradientDrawable$Orientation.LEFT_RIGHT>
	//    9   18:invokevirtual   #756 <Method void GradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable$Orientation)>
		gradientdrawable.setStroke((int)TypedValue.applyDimension(1, 1.0F, resources.getDisplayMetrics()), getResources().getColor(0x7f060076));
	//   10   21:aload_3         
	//   11   22:iconst_1        
	//   12   23:fconst_1        
	//   13   24:aload           4
	//   14   26:invokevirtual   #179 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   15   29:invokestatic    #185 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   16   32:f2i             
	//   17   33:aload_0         
	//   18   34:invokevirtual   #173 <Method Resources getResources()>
	//   19   37:ldc2            #757 <Int 0x7f060076>
	//   20   40:invokevirtual   #761 <Method int Resources.getColor(int)>
	//   21   43:invokevirtual   #765 <Method void GradientDrawable.setStroke(int, int)>
		int ai[] = new int[jsonarray.length()];
	//   22   46:aload_1         
	//   23   47:invokevirtual   #768 <Method int JSONArray.length()>
	//   24   50:newarray        int[]
	//   25   52:astore          4
		int i1 = 0;
	//   26   54:iconst_0        
	//   27   55:istore_2        
_L2:
		if(i1 >= jsonarray.length())
			break; /* Loop/switch isn't completed */
	//   28   56:iload_2         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #768 <Method int JSONArray.length()>
	//   31   61:icmpge          103
		JSONArray jsonarray1 = jsonarray.getJSONArray(i1);
	//   32   64:aload_1         
	//   33   65:iload_2         
	//   34   66:invokevirtual   #772 <Method JSONArray JSONArray.getJSONArray(int)>
	//   35   69:astore          5
		ai[i1] = Color.rgb(jsonarray1.getInt(0), jsonarray1.getInt(1), jsonarray1.getInt(2));
	//   36   71:aload           4
	//   37   73:iload_2         
	//   38   74:aload           5
	//   39   76:iconst_0        
	//   40   77:invokevirtual   #775 <Method int JSONArray.getInt(int)>
	//   41   80:aload           5
	//   42   82:iconst_1        
	//   43   83:invokevirtual   #775 <Method int JSONArray.getInt(int)>
	//   44   86:aload           5
	//   45   88:iconst_2        
	//   46   89:invokevirtual   #775 <Method int JSONArray.getInt(int)>
	//   47   92:invokestatic    #781 <Method int Color.rgb(int, int, int)>
	//   48   95:iastore         
		i1++;
	//   49   96:iload_2         
	//   50   97:iconst_1        
	//   51   98:iadd            
	//   52   99:istore_2        
		if(true) goto _L2; else goto _L1
	//   53  100:goto            56
_L1:
		try
		{
			gradientdrawable.setColors(ai);
	//   54  103:aload_3         
	//   55  104:aload           4
	//   56  106:invokevirtual   #785 <Method void GradientDrawable.setColors(int[])>
			A.setBackgroundDrawable(((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   57  109:aload_0         
	//   58  110:getfield        #787 <Field View A>
	//   59  113:aload_3         
	//   60  114:invokevirtual   #790 <Method void View.setBackgroundDrawable(android.graphics.drawable.Drawable)>
			return;
	//   61  117:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONArray jsonarray)
	//*  62  118:astore_1        
		{
			((JSONException) (jsonarray)).printStackTrace();
	//   63  119:aload_1         
	//   64  120:invokevirtual   #793 <Method void JSONException.printStackTrace()>
		}
		return;
	//   65  123:return          
	}

	void b()
	{
		a(Q);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #375 <Field BottomSheetBehavior Q>
	//    3    5:invokespecial   #795 <Method void a(BottomSheetBehavior)>
	//    4    8:return          
	}

	public void b(float f1)
	{
		if(f1 > 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:ifle            12
		{
			aa = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #148 <Field boolean aa>
			return;
	//    7   11:return          
		}
		if(f1 < 1.0F)
	//*   8   12:fload_1         
	//*   9   13:fconst_1        
	//*  10   14:fcmpg           
	//*  11   15:ifge            23
			ab = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #150 <Field boolean ab>
	//   15   23:return          
	}

	protected void b(int i1)
	{
		d.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field ProgressBar d>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #796 <Method void ProgressBar.setVisibility(int)>
		b.setVisibility(8);
	//    4    9:aload_0         
	//    5   10:getfield        #798 <Field RelativeLayout b>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
		c.setVisibility(0);
	//    8   18:aload_0         
	//    9   19:getfield        #244 <Field RelativeLayout c>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
		if(G)
	//*  12   26:aload_0         
	//*  13   27:getfield        #124 <Field boolean G>
	//*  14   30:ifeq            61
		{
			y.setVisibility(0);
	//   15   33:aload_0         
	//   16   34:getfield        #801 <Field LinearLayout y>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #802 <Method void LinearLayout.setVisibility(int)>
			w.setImageResource(0x7f080151);
	//   19   41:aload_0         
	//   20   42:getfield        #804 <Field ImageView w>
	//   21   45:ldc2            #805 <Int 0x7f080151>
	//   22   48:invokevirtual   #808 <Method void ImageView.setImageResource(int)>
			x.setVisibility(8);
	//   23   51:aload_0         
	//   24   52:getfield        #810 <Field TextView x>
	//   25   55:bipush          8
	//   26   57:invokevirtual   #811 <Method void TextView.setVisibility(int)>
			return;
	//   27   60:return          
		} else
		{
			y.setVisibility(8);
	//   28   61:aload_0         
	//   29   62:getfield        #801 <Field LinearLayout y>
	//   30   65:bipush          8
	//   31   67:invokevirtual   #802 <Method void LinearLayout.setVisibility(int)>
			w.setImageResource(0x7f08015b);
	//   32   70:aload_0         
	//   33   71:getfield        #804 <Field ImageView w>
	//   34   74:ldc2            #812 <Int 0x7f08015b>
	//   35   77:invokevirtual   #808 <Method void ImageView.setImageResource(int)>
			x.setVisibility(0);
	//   36   80:aload_0         
	//   37   81:getfield        #810 <Field TextView x>
	//   38   84:iconst_0        
	//   39   85:invokevirtual   #811 <Method void TextView.setVisibility(int)>
			x.setText(i1);
	//   40   88:aload_0         
	//   41   89:getfield        #810 <Field TextView x>
	//   42   92:iload_1         
	//   43   93:invokevirtual   #814 <Method void TextView.setText(int)>
			return;
	//   44   96:return          
		}
	}

	public void b(HistoryUIServiceData historyuiservicedata)
	{
		if(!com.irobot.home.util.j.i(historyuiservicedata.getMissionRuntimeChartData()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #817 <Method String HistoryUIServiceData.getMissionRuntimeChartData()>
	//*   2    4:invokestatic    #645 <Method boolean j.i(String)>
	//*   3    7:ifne            20
		{
			com.irobot.home.util.o.e(I, "onMissionRuntimeEChartEvent: Chart data is invalid!");
	//    4   10:getstatic       #116 <Field String I>
	//    5   13:ldc2            #819 <String "onMissionRuntimeEChartEvent: Chart data is invalid!">
	//    6   16:invokestatic    #293 <Method void o.e(String, String)>
			return;
	//    7   19:return          
		} else
		{
			M = historyuiservicedata.getMissionRuntimeChartData();
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #817 <Method String HistoryUIServiceData.getMissionRuntimeChartData()>
	//   11   25:putfield        #199 <Field String M>
			v.getSettings().setJavaScriptEnabled(true);
	//   12   28:aload_0         
	//   13   29:getfield        #821 <Field WebViewLanguageCompat v>
	//   14   32:invokevirtual   #827 <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   15   35:iconst_1        
	//   16   36:invokevirtual   #833 <Method void WebSettings.setJavaScriptEnabled(boolean)>
			v.setOnTouchListener(new android.view.View.OnTouchListener() {

				public boolean onTouch(View view, MotionEvent motionevent)
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

				final MissionAndMapDetailsFragment a;

			
			{
				a = MissionAndMapDetailsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionAndMapDetailsFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   17   39:aload_0         
	//   18   40:getfield        #821 <Field WebViewLanguageCompat v>
	//   19   43:new             #14  <Class MissionAndMapDetailsFragment$4>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:invokespecial   #834 <Method void MissionAndMapDetailsFragment$4(MissionAndMapDetailsFragment)>
	//   23   51:invokevirtual   #838 <Method void WebViewLanguageCompat.setOnTouchListener(android.view.View$OnTouchListener)>
			v.setWebViewClient(((WebViewClient) (new WebViewClient() {

				public void onPageFinished(WebView webview, String s1)
				{
					webview = ((WebView) (a.v));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field MissionAndMapDetailsFragment a>
				//    2    4:getfield        #25  <Field WebViewLanguageCompat MissionAndMapDetailsFragment.v>
				//    3    7:astore_1        
					s1 = ((String) (new StringBuilder()));
				//    4    8:new             #27  <Class StringBuilder>
				//    5   11:dup             
				//    6   12:invokespecial   #28  <Method void StringBuilder()>
				//    7   15:astore_2        
					((StringBuilder) (s1)).append("javascript:loadChart(");
				//    8   16:aload_2         
				//    9   17:ldc1            #30  <String "javascript:loadChart(">
				//   10   19:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
				//   11   22:pop             
					((StringBuilder) (s1)).append(com.irobot.home.fragments.MissionAndMapDetailsFragment.a(a));
				//   12   23:aload_2         
				//   13   24:aload_0         
				//   14   25:getfield        #15  <Field MissionAndMapDetailsFragment a>
				//   15   28:invokestatic    #37  <Method String com.irobot.home.fragments.MissionAndMapDetailsFragment.a(MissionAndMapDetailsFragment)>
				//   16   31:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
				//   17   34:pop             
					((StringBuilder) (s1)).append(")");
				//   18   35:aload_2         
				//   19   36:ldc1            #39  <String ")">
				//   20   38:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
				//   21   41:pop             
					((WebViewLanguageCompat) (webview)).loadUrl(((StringBuilder) (s1)).toString());
				//   22   42:aload_1         
				//   23   43:aload_2         
				//   24   44:invokevirtual   #43  <Method String StringBuilder.toString()>
				//   25   47:invokevirtual   #49  <Method void WebViewLanguageCompat.loadUrl(String)>
				//   26   50:return          
				}

				final MissionAndMapDetailsFragment a;

			
			{
				a = MissionAndMapDetailsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MissionAndMapDetailsFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebViewClient()>
			//    5    9:return          
			}
			}
)));
	//   24   54:aload_0         
	//   25   55:getfield        #821 <Field WebViewLanguageCompat v>
	//   26   58:new             #16  <Class MissionAndMapDetailsFragment$5>
	//   27   61:dup             
	//   28   62:aload_0         
	//   29   63:invokespecial   #839 <Method void MissionAndMapDetailsFragment$5(MissionAndMapDetailsFragment)>
	//   30   66:invokevirtual   #843 <Method void WebViewLanguageCompat.setWebViewClient(WebViewClient)>
			v.loadUrl("file:///android_asset/www/charts/chart_container.html");
	//   31   69:aload_0         
	//   32   70:getfield        #821 <Field WebViewLanguageCompat v>
	//   33   73:ldc2            #845 <String "file:///android_asset/www/charts/chart_container.html">
	//   34   76:invokevirtual   #848 <Method void WebViewLanguageCompat.loadUrl(String)>
			return;
	//   35   79:return          
		}
	}

	protected void c()
	{
		b(0x7f0f0485);
	//    0    0:aload_0         
	//    1    1:ldc2            #849 <Int 0x7f0f0485>
	//    2    4:invokevirtual   #530 <Method void b(int)>
	//    3    7:return          
	}

	protected void d()
	{
		d.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field ProgressBar d>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #796 <Method void ProgressBar.setVisibility(int)>
		b.setVisibility(8);
	//    4    9:aload_0         
	//    5   10:getfield        #798 <Field RelativeLayout b>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
		c.setVisibility(0);
	//    8   18:aload_0         
	//    9   19:getfield        #244 <Field RelativeLayout c>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
		y.setVisibility(8);
	//   12   26:aload_0         
	//   13   27:getfield        #801 <Field LinearLayout y>
	//   14   30:bipush          8
	//   15   32:invokevirtual   #802 <Method void LinearLayout.setVisibility(int)>
		w.setImageResource(0x7f08019f);
	//   16   35:aload_0         
	//   17   36:getfield        #804 <Field ImageView w>
	//   18   39:ldc2            #850 <Int 0x7f08019f>
	//   19   42:invokevirtual   #808 <Method void ImageView.setImageResource(int)>
		x.setText(0x7f0f0494);
	//   20   45:aload_0         
	//   21   46:getfield        #810 <Field TextView x>
	//   22   49:ldc2            #851 <Int 0x7f0f0494>
	//   23   52:invokevirtual   #814 <Method void TextView.setText(int)>
	//   24   55:return          
	}

	protected void e()
	{
		d.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field ProgressBar d>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #796 <Method void ProgressBar.setVisibility(int)>
		b.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #798 <Field RelativeLayout b>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
		c.setVisibility(8);
	//    8   17:aload_0         
	//    9   18:getfield        #244 <Field RelativeLayout c>
	//   10   21:bipush          8
	//   11   23:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
		y.setVisibility(8);
	//   12   26:aload_0         
	//   13   27:getfield        #801 <Field LinearLayout y>
	//   14   30:bipush          8
	//   15   32:invokevirtual   #802 <Method void LinearLayout.setVisibility(int)>
	//   16   35:return          
	}

	protected void f()
	{
		if(c.getVisibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field RelativeLayout c>
	//*   2    4:invokevirtual   #247 <Method int RelativeLayout.getVisibility()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			b.setVisibility(8);
	//    5   11:aload_0         
	//    6   12:getfield        #798 <Field RelativeLayout b>
	//    7   15:bipush          8
	//    8   17:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
			d.setVisibility(0);
	//    9   20:aload_0         
	//   10   21:getfield        #229 <Field ProgressBar d>
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #796 <Method void ProgressBar.setVisibility(int)>
			return;
	//   13   28:return          
		}
	}

	protected void g()
	{
		d.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field ProgressBar d>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #796 <Method void ProgressBar.setVisibility(int)>
		b.setVisibility(0);
	//    4    9:aload_0         
	//    5   10:getfield        #798 <Field RelativeLayout b>
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #799 <Method void RelativeLayout.setVisibility(int)>
	//    8   17:return          
	}

	public void onMissionMapEvent(MissionMapEvent missionmapevent)
	{
		String s1 = I;
	//    0    0:getstatic       #116 <Field String I>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #209 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #210 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("MissionMapEvent received for asset ID: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #856 <String "MissionMapEvent received for asset ID: ">
	//    8   16:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(missionmapevent.assetId().getId());
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #861 <Method AssetId MissionMapEvent.assetId()>
	//   13   25:invokevirtual   #866 <Method String AssetId.getId()>
	//   14   28:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   19   37:invokestatic    #589 <Method void o.b(String, String)>
		s1 = I;
	//   20   40:getstatic       #116 <Field String I>
	//   21   43:astore_2        
		stringbuilder = new StringBuilder();
	//   22   44:new             #209 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #210 <Method void StringBuilder()>
	//   25   51:astore_3        
		stringbuilder.append("** Map ID: ");
	//   26   52:aload_3         
	//   27   53:ldc2            #868 <String "** Map ID: ">
	//   28   56:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		stringbuilder.append(missionmapevent.mapId());
	//   30   60:aload_3         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #871 <Method String MissionMapEvent.mapId()>
	//   33   65:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		com.irobot.home.util.o.a(s1, stringbuilder.toString());
	//   35   69:aload_2         
	//   36   70:aload_3         
	//   37   71:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   38   74:invokestatic    #227 <Method void o.a(String, String)>
		s1 = I;
	//   39   77:getstatic       #116 <Field String I>
	//   40   80:astore_2        
		stringbuilder = new StringBuilder();
	//   41   81:new             #209 <Class StringBuilder>
	//   42   84:dup             
	//   43   85:invokespecial   #210 <Method void StringBuilder()>
	//   44   88:astore_3        
		stringbuilder.append("** Map Type: ");
	//   45   89:aload_3         
	//   46   90:ldc2            #873 <String "** Map Type: ">
	//   47   93:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   48   96:pop             
		stringbuilder.append(((Object) (missionmapevent.mapType())));
	//   49   97:aload_3         
	//   50   98:aload_1         
	//   51   99:invokevirtual   #877 <Method MissionMapType MissionMapEvent.mapType()>
	//   52  102:invokevirtual   #219 <Method StringBuilder StringBuilder.append(Object)>
	//   53  105:pop             
		com.irobot.home.util.o.a(s1, stringbuilder.toString());
	//   54  106:aload_2         
	//   55  107:aload_3         
	//   56  108:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   57  111:invokestatic    #227 <Method void o.a(String, String)>
		s1 = I;
	//   58  114:getstatic       #116 <Field String I>
	//   59  117:astore_2        
		stringbuilder = new StringBuilder();
	//   60  118:new             #209 <Class StringBuilder>
	//   61  121:dup             
	//   62  122:invokespecial   #210 <Method void StringBuilder()>
	//   63  125:astore_3        
		stringbuilder.append("** Map Unavailable Error: ");
	//   64  126:aload_3         
	//   65  127:ldc2            #879 <String "** Map Unavailable Error: ">
	//   66  130:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   67  133:pop             
		stringbuilder.append(((Object) (missionmapevent.mapUnavailableError())));
	//   68  134:aload_3         
	//   69  135:aload_1         
	//   70  136:invokevirtual   #883 <Method Error MissionMapEvent.mapUnavailableError()>
	//   71  139:invokevirtual   #219 <Method StringBuilder StringBuilder.append(Object)>
	//   72  142:pop             
		com.irobot.home.util.o.a(s1, stringbuilder.toString());
	//   73  143:aload_2         
	//   74  144:aload_3         
	//   75  145:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   76  148:invokestatic    #227 <Method void o.a(String, String)>
		s1 = I;
	//   77  151:getstatic       #116 <Field String I>
	//   78  154:astore_2        
		stringbuilder = new StringBuilder();
	//   79  155:new             #209 <Class StringBuilder>
	//   80  158:dup             
	//   81  159:invokespecial   #210 <Method void StringBuilder()>
	//   82  162:astore_3        
		stringbuilder.append("** Map Metadata: ");
	//   83  163:aload_3         
	//   84  164:ldc2            #885 <String "** Map Metadata: ">
	//   85  167:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   86  170:pop             
		stringbuilder.append(missionmapevent.mapMetadata());
	//   87  171:aload_3         
	//   88  172:aload_1         
	//   89  173:invokevirtual   #888 <Method String MissionMapEvent.mapMetadata()>
	//   90  176:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   91  179:pop             
		com.irobot.home.util.o.a(s1, stringbuilder.toString());
	//   92  180:aload_2         
	//   93  181:aload_3         
	//   94  182:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   95  185:invokestatic    #227 <Method void o.a(String, String)>
		if(missionmapevent.mapType() == E)
	//*  96  188:aload_1         
	//*  97  189:invokevirtual   #877 <Method MissionMapType MissionMapEvent.mapType()>
	//*  98  192:aload_0         
	//*  99  193:getfield        #468 <Field MissionMapType E>
	//* 100  196:if_acmpne       443
		{
			U.b(((Object) (this)), EventType.MissionMapEvent);
	//  101  199:aload_0         
	//  102  200:getfield        #535 <Field com.irobot.home.i.a U>
	//  103  203:aload_0         
	//  104  204:getstatic       #552 <Field EventType EventType.MissionMapEvent>
	//  105  207:invokevirtual   #561 <Method void com.irobot.home.i.a.b(Object, EventType)>
			if(!K.equals(((Object) (missionmapevent.mapId()))))
	//* 106  210:aload_0         
	//* 107  211:getfield        #598 <Field String K>
	//* 108  214:aload_1         
	//* 109  215:invokevirtual   #871 <Method String MissionMapEvent.mapId()>
	//* 110  218:invokevirtual   #507 <Method boolean String.equals(Object)>
	//* 111  221:ifne            225
				return;
	//  112  224:return          
			if(missionmapevent.mapUnavailableError() == null && !missionmapevent.staticMissionMapImage().getImageData().isEmpty())
	//* 113  225:aload_1         
	//* 114  226:invokevirtual   #883 <Method Error MissionMapEvent.mapUnavailableError()>
	//* 115  229:ifnonnull       382
	//* 116  232:aload_1         
	//* 117  233:invokevirtual   #892 <Method MissionMapImage MissionMapEvent.staticMissionMapImage()>
	//* 118  236:invokevirtual   #897 <Method String MissionMapImage.getImageData()>
	//* 119  239:invokevirtual   #900 <Method boolean String.isEmpty()>
	//* 120  242:ifeq            248
	//* 121  245:goto            382
			{
				a(missionmapevent.staticMissionMapImage().getImageData());
	//  122  248:aload_0         
	//  123  249:aload_1         
	//  124  250:invokevirtual   #892 <Method MissionMapImage MissionMapEvent.staticMissionMapImage()>
	//  125  253:invokevirtual   #897 <Method String MissionMapImage.getImageData()>
	//  126  256:invokevirtual   #902 <Method void a(String)>
				if(E == MissionMapType.WifiHeat)
	//* 127  259:aload_0         
	//* 128  260:getfield        #468 <Field MissionMapType E>
	//* 129  263:getstatic       #473 <Field MissionMapType MissionMapType.WifiHeat>
	//* 130  266:if_acmpne       376
				{
					if(!F)
	//* 131  269:aload_0         
	//* 132  270:getfield        #122 <Field boolean F>
	//* 133  273:ifne            292
						f.post(new Runnable() {

							public void run()
							{
								a.f.setVisibility(0);
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field MissionAndMapDetailsFragment a>
							//    2    4:getfield        #26  <Field View MissionAndMapDetailsFragment.f>
							//    3    7:iconst_0        
							//    4    8:invokevirtual   #32  <Method void View.setVisibility(int)>
							//    5   11:return          
							}

							final MissionAndMapDetailsFragment a;

			
			{
				a = MissionAndMapDetailsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MissionAndMapDetailsFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
						}
);
	//  134  276:aload_0         
	//  135  277:getfield        #458 <Field View f>
	//  136  280:new             #12  <Class MissionAndMapDetailsFragment$3>
	//  137  283:dup             
	//  138  284:aload_0         
	//  139  285:invokespecial   #903 <Method void MissionAndMapDetailsFragment$3(MissionAndMapDetailsFragment)>
	//  140  288:invokevirtual   #907 <Method boolean View.post(Runnable)>
	//  141  291:pop             
					try
					{
						missionmapevent = ((MissionMapEvent) (new JSONObject(missionmapevent.mapMetadata())));
	//  142  292:new             #909 <Class JSONObject>
	//  143  295:dup             
	//  144  296:aload_1         
	//  145  297:invokevirtual   #888 <Method String MissionMapEvent.mapMetadata()>
	//  146  300:invokespecial   #910 <Method void JSONObject(String)>
	//  147  303:astore_1        
						if(((JSONObject) (missionmapevent)).has("wifiBadRegions"))
	//* 148  304:aload_1         
	//* 149  305:ldc2            #912 <String "wifiBadRegions">
	//* 150  308:invokevirtual   #915 <Method boolean JSONObject.has(String)>
	//* 151  311:ifeq            329
						{
							W = ((JSONObject) (missionmapevent)).getInt("wifiBadRegions");
	//  152  314:aload_0         
	//  153  315:aload_1         
	//  154  316:ldc2            #912 <String "wifiBadRegions">
	//  155  319:invokevirtual   #918 <Method int JSONObject.getInt(String)>
	//  156  322:putfield        #140 <Field int W>
							a();
	//  157  325:aload_0         
	//  158  326:invokevirtual   #464 <Method void a()>
						}
						if(((JSONObject) (missionmapevent)).has("wifiLegendMetadata"))
	//* 159  329:aload_1         
	//* 160  330:ldc2            #920 <String "wifiLegendMetadata">
	//* 161  333:invokevirtual   #915 <Method boolean JSONObject.has(String)>
	//* 162  336:ifeq            376
						{
							missionmapevent = ((MissionMapEvent) (((JSONObject) (missionmapevent)).getJSONObject("wifiLegendMetadata")));
	//  163  339:aload_1         
	//  164  340:ldc2            #920 <String "wifiLegendMetadata">
	//  165  343:invokevirtual   #924 <Method JSONObject JSONObject.getJSONObject(String)>
	//  166  346:astore_1        
							if(((JSONObject) (missionmapevent)).has("wifiColorMap"))
	//* 167  347:aload_1         
	//* 168  348:ldc2            #926 <String "wifiColorMap">
	//* 169  351:invokevirtual   #915 <Method boolean JSONObject.has(String)>
	//* 170  354:ifeq            376
								a(((JSONObject) (missionmapevent)).getJSONArray("wifiColorMap"));
	//  171  357:aload_0         
	//  172  358:aload_1         
	//  173  359:ldc2            #926 <String "wifiColorMap">
	//  174  362:invokevirtual   #929 <Method JSONArray JSONObject.getJSONArray(String)>
	//  175  365:invokevirtual   #931 <Method void a(JSONArray)>
						}
					}
	//* 176  368:goto            376
					// Misplaced declaration of an exception variable
					catch(MissionMapEvent missionmapevent)
	//* 177  371:astore_1        
					{
						((JSONException) (missionmapevent)).printStackTrace();
	//  178  372:aload_1         
	//  179  373:invokevirtual   #793 <Method void JSONException.printStackTrace()>
					}
				}
				Z = true;
	//  180  376:aload_0         
	//  181  377:iconst_1        
	//  182  378:putfield        #146 <Field boolean Z>
				return;
	//  183  381:return          
			}
			c();
	//  184  382:aload_0         
	//  185  383:invokevirtual   #242 <Method void c()>
			String s2 = I;
	//  186  386:getstatic       #116 <Field String I>
	//  187  389:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//  188  390:new             #209 <Class StringBuilder>
	//  189  393:dup             
	//  190  394:invokespecial   #210 <Method void StringBuilder()>
	//  191  397:astore_3        
			stringbuilder1.append("There was an error obtaining a map for asset ");
	//  192  398:aload_3         
	//  193  399:ldc2            #933 <String "There was an error obtaining a map for asset ">
	//  194  402:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//  195  405:pop             
			stringbuilder1.append(B);
	//  196  406:aload_3         
	//  197  407:aload_0         
	//  198  408:getfield        #475 <Field String B>
	//  199  411:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//  200  414:pop             
			stringbuilder1.append(". \n Error: ");
	//  201  415:aload_3         
	//  202  416:ldc2            #935 <String ". \n Error: ">
	//  203  419:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//  204  422:pop             
			stringbuilder1.append(missionmapevent.mapUnavailableError().message());
	//  205  423:aload_3         
	//  206  424:aload_1         
	//  207  425:invokevirtual   #883 <Method Error MissionMapEvent.mapUnavailableError()>
	//  208  428:invokevirtual   #940 <Method String Error.message()>
	//  209  431:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//  210  434:pop             
			com.irobot.home.util.o.e(s2, stringbuilder1.toString());
	//  211  435:aload_2         
	//  212  436:aload_3         
	//  213  437:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  214  440:invokestatic    #293 <Method void o.e(String, String)>
		}
	//  215  443:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #944 <Method void j.onPause()>
		if(U != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #535 <Field com.irobot.home.i.a U>
	//*   4    8:ifnull          19
			U.a(((Object) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #535 <Field com.irobot.home.i.a U>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #947 <Method void com.irobot.home.i.a.a(Object)>
		X = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #142 <Field boolean X>
		AssetInfo assetinfo = com.irobot.home.util.j.a(B).a();
	//   12   24:aload_0         
	//   13   25:getfield        #475 <Field String B>
	//   14   28:invokestatic    #478 <Method a j.a(String)>
	//   15   31:invokevirtual   #483 <Method AssetInfo a.a()>
	//   16   34:astore_1        
		AnalyticsSubsystem.getInstance().trackCleanMapInteractionFinished(assetinfo, Z, aa, ab, ac, ad);
	//   17   35:invokestatic    #513 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #146 <Field boolean Z>
	//   21   43:aload_0         
	//   22   44:getfield        #148 <Field boolean aa>
	//   23   47:aload_0         
	//   24   48:getfield        #150 <Field boolean ab>
	//   25   51:aload_0         
	//   26   52:getfield        #152 <Field boolean ac>
	//   27   55:aload_0         
	//   28   56:getfield        #154 <Field boolean ad>
	//   29   59:invokevirtual   #951 <Method void AnalyticsSubsystem.trackCleanMapInteractionFinished(AssetInfo, boolean, boolean, boolean, boolean, boolean)>
	//   30   62:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #954 <Method void j.onResume()>
		if(U == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #535 <Field com.irobot.home.i.a U>
	//*   4    8:ifnonnull       24
			U = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//    5   11:aload_0         
	//    6   12:invokestatic    #540 <Method Assembler Assembler.getInstance()>
	//    7   15:invokevirtual   #544 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    8   18:checkcast       #546 <Class com.irobot.home.i.a>
	//    9   21:putfield        #535 <Field com.irobot.home.i.a U>
		AnalyticsSubsystem.getInstance().trackCleanMapInteractionStarted();
	//   10   24:invokestatic    #513 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   11   27:invokevirtual   #957 <Method void AnalyticsSubsystem.trackCleanMapInteractionStarted()>
	//   12   30:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #960 <Method void j.onStart()>
		O.registerUISubscriber(P);
	//    2    4:aload_0         
	//    3    5:getfield        #259 <Field SettingsSubsystem O>
	//    4    8:aload_0         
	//    5    9:getfield        #131 <Field SettingsUIServiceDataCallback P>
	//    6   12:invokevirtual   #966 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
		N.registerUISubscriber(ae);
	//    8   16:aload_0         
	//    9   17:getfield        #528 <Field HistoryUIService N>
	//   10   20:aload_0         
	//   11   21:getfield        #159 <Field HistoryUIServiceDataCallback ae>
	//   12   24:invokevirtual   #971 <Method boolean HistoryUIService.registerUISubscriber(HistoryUIServiceDataCallback)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void onStop()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(B).a();
	//    0    0:aload_0         
	//    1    1:getfield        #475 <Field String B>
	//    2    4:invokestatic    #478 <Method a j.a(String)>
	//    3    7:invokevirtual   #483 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		Assembler.getInstance().getNetworkUIService(assetinfo.getAssetId()).unregisterSubscriber(af);
	//    5   11:invokestatic    #540 <Method Assembler Assembler.getInstance()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #977 <Method AssetId AssetInfo.getAssetId()>
	//    8   18:invokevirtual   #981 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//    9   21:aload_0         
	//   10   22:getfield        #162 <Field AssetNetworkUIServiceDataCallback af>
	//   11   25:invokevirtual   #987 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//   12   28:pop             
		N.unregisterSubscriber(ae);
	//   13   29:aload_0         
	//   14   30:getfield        #528 <Field HistoryUIService N>
	//   15   33:aload_0         
	//   16   34:getfield        #159 <Field HistoryUIServiceDataCallback ae>
	//   17   37:invokevirtual   #989 <Method boolean HistoryUIService.unregisterSubscriber(HistoryUIServiceDataCallback)>
	//   18   40:pop             
		O.unregisterSubscriber(P);
	//   19   41:aload_0         
	//   20   42:getfield        #259 <Field SettingsSubsystem O>
	//   21   45:aload_0         
	//   22   46:getfield        #131 <Field SettingsUIServiceDataCallback P>
	//   23   49:invokevirtual   #991 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//   24   52:pop             
	//   25   53:return          
	}

	private static final String I = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/MissionAndMapDetailsFragment)).getSimpleName());
	View A;
	protected String B;
	protected int C;
	protected int D;
	protected MissionMapType E;
	protected boolean F;
	protected boolean G;
	protected int H;
	private RobotMissionHistoryItem J;
	private String K;
	private r L;
	private String M;
	private HistoryUIService N;
	private SettingsSubsystem O;
	private SettingsUIServiceDataCallback P;
	private BottomSheetBehavior Q;
	private BottomSheetBehavior R;
	private List S;
	private List T;
	private com.irobot.home.i.a U;
	private String V;
	private int W;
	private boolean X;
	private boolean Y;
	private boolean Z;
	protected MapView a;
	private boolean aa;
	private boolean ab;
	private boolean ac;
	private boolean ad;
	private HistoryUIServiceDataCallback ae;
	private final AssetNetworkUIServiceDataCallback af = new AssetNetworkUIServiceDataCallback() {

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
			do
			{
				if(!iterator.hasNext())
					break;
		//    7   13:aload_2         
		//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//    9   19:ifeq            61
				AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Object Iterator.next()>
		//   12   28:checkcast       #42  <Class AssetNetworkUIServiceDataState>
		//   13   31:astore_3        
				if(_cls7.d[assetnetworkuiservicedatastate.ordinal()] == 1)
		//*  14   32:getstatic       #48  <Field int[] MissionAndMapDetailsFragment$7.d>
		//*  15   35:aload_3         
		//*  16   36:invokevirtual   #52  <Method int AssetNetworkUIServiceDataState.ordinal()>
		//*  17   39:iaload          
		//*  18   40:iconst_1        
		//*  19   41:icmpeq          47
		//*  20   44:goto            13
					com.irobot.home.fragments.MissionAndMapDetailsFragment.a(a, assetnetworkuiservicedata.getConnectionStateForRemote());
		//   21   47:aload_0         
		//   22   48:getfield        #12  <Field MissionAndMapDetailsFragment a>
		//   23   51:aload_1         
		//   24   52:invokevirtual   #56  <Method NetworkState AssetNetworkUIServiceData.getConnectionStateForRemote()>
		//   25   55:invokestatic    #59  <Method void com.irobot.home.fragments.MissionAndMapDetailsFragment.a(MissionAndMapDetailsFragment, NetworkState)>
			} while(true);
		//   26   58:goto            13
		//   27   61:return          
		}

		final MissionAndMapDetailsFragment a;

			
			{
				a = MissionAndMapDetailsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MissionAndMapDetailsFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;
	protected RelativeLayout b;
	protected RelativeLayout c;
	protected ProgressBar d;
	protected View e;
	protected View f;
	protected LinearLayout i;
	protected ImageView j;
	protected CustomTextView k;
	protected ImageView l;
	protected ImageView m;
	TextView n;
	TextView o;
	TextView p;
	CustomTextView q;
	CustomTextView r;
	CustomTextView s;
	CustomTextView t;
	CustomTextView u;
	WebViewLanguageCompat v;
	ImageView w;
	TextView x;
	LinearLayout y;
	CustomTextView z;

	static 
	{
	//    0    0:ldc1            #2   <Class MissionAndMapDetailsFragment>
	//    1    2:invokevirtual   #109 <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #114 <Method String j.r(String)>
	//    3    8:putstatic       #116 <Field String I>
	//*   4   11:return          
	}
}
