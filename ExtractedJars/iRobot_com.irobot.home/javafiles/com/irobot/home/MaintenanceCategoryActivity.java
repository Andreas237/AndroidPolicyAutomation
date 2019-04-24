// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.MaintenanceUIService;
import com.irobot.core.MaintenanceUIServiceCommand;
import com.irobot.core.MaintenanceUIServiceData;
import com.irobot.core.MaintenanceUIServiceDataCallback;
import com.irobot.core.MaintenanceViewState;
import com.irobot.core.RobotCareType;
import com.irobot.core.ViewId;
import com.irobot.home.b.y;
import com.irobot.home.model.a;
import com.irobot.home.model.o;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, WebViewActivity_, ContactTableViewActivity_

public class MaintenanceCategoryActivity extends BaseFragmentActivity
{
	private final class a extends MaintenanceUIServiceDataCallback
	{

		public void onMaintenanceUIServiceDataChanged(MaintenanceUIServiceData maintenanceuiservicedata)
		{
			if(maintenanceuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				com.irobot.home.util.o.e("MaintCatDetailActiv", "MaintenanceUIServiceData was null.");
		//    2    4:ldc1            #23  <String "MaintCatDetailActiv">
		//    3    6:ldc1            #25  <String "MaintenanceUIServiceData was null.">
		//    4    8:invokestatic    #31  <Method void com.irobot.home.util.o.e(String, String)>
				return;
		//    5   11:return          
			}
			Object obj = ((Object) (maintenanceuiservicedata.getViewStateChangelist()));
		//    6   12:aload_1         
		//    7   13:invokevirtual   #37  <Method ArrayList MaintenanceUIServiceData.getViewStateChangelist()>
		//    8   16:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
		//    9   17:new             #39  <Class StringBuilder>
		//   10   20:dup             
		//   11   21:invokespecial   #40  <Method void StringBuilder()>
		//   12   24:astore_3        
			stringbuilder.append("View states: ");
		//   13   25:aload_3         
		//   14   26:ldc1            #42  <String "View states: ">
		//   15   28:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   16   31:pop             
			stringbuilder.append(obj);
		//   17   32:aload_3         
		//   18   33:aload_2         
		//   19   34:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   20   37:pop             
			com.irobot.home.util.o.a("MaintCatDetailActiv", stringbuilder.toString());
		//   21   38:ldc1            #23  <String "MaintCatDetailActiv">
		//   22   40:aload_3         
		//   23   41:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   24   44:invokestatic    #55  <Method void com.irobot.home.util.o.a(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   25   47:aload_2         
		//   26   48:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
		//   27   51:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   28   52:aload_2         
		//   29   53:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   30   58:ifeq            227
				MaintenanceViewState maintenanceviewstate = (MaintenanceViewState)((Iterator) (obj)).next();
		//   31   61:aload_2         
		//   32   62:invokeinterface #71  <Method Object Iterator.next()>
		//   33   67:checkcast       #73  <Class MaintenanceViewState>
		//   34   70:astore_3        
				static class _cls3
				{

					static final int a[];
					static final int b[];

					static 
					{
						b = new int[MaintenanceViewState.values().length];
					//    0    0:invokestatic    #19  <Method MaintenanceViewState[] MaintenanceViewState.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] b>
						try
						{
							b[MaintenanceViewState.UpdatePartsList.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field MaintenanceViewState MaintenanceViewState.UpdatePartsList>
					//    6   15:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #21  <Field int[] b>
					//*  10   23:getstatic       #32  <Field MaintenanceViewState MaintenanceViewState.EnableCategoryStatusReset>
					//*  11   26:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #21  <Field int[] b>
					//*  15   34:getstatic       #35  <Field MaintenanceViewState MaintenanceViewState.ShowResetInProgress>
					//*  16   37:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #21  <Field int[] b>
					//*  20   45:getstatic       #38  <Field MaintenanceViewState MaintenanceViewState.ShowResetCategorySuccess>
					//*  21   48:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:getstatic       #21  <Field int[] b>
					//*  25   56:getstatic       #41  <Field MaintenanceViewState MaintenanceViewState.ShowResetCategoryFailed>
					//*  26   59:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
					//*  27   62:iconst_5        
					//*  28   63:iastore         
					//*  29   64:invokestatic    #46  <Method RobotCareType[] RobotCareType.values()>
					//*  30   67:arraylength     
					//*  31   68:newarray        int[]
					//*  32   70:putstatic       #48  <Field int[] a>
					//*  33   73:getstatic       #48  <Field int[] a>
					//*  34   76:getstatic       #52  <Field RobotCareType RobotCareType.Bin>
					//*  35   79:invokevirtual   #53  <Method int RobotCareType.ordinal()>
					//*  36   82:iconst_1        
					//*  37   83:iastore         
					//*  38   84:getstatic       #48  <Field int[] a>
					//*  39   87:getstatic       #56  <Field RobotCareType RobotCareType.Core>
					//*  40   90:invokevirtual   #53  <Method int RobotCareType.ordinal()>
					//*  41   93:iconst_2        
					//*  42   94:iastore         
					//*  43   95:getstatic       #48  <Field int[] a>
					//*  44   98:getstatic       #59  <Field RobotCareType RobotCareType.Debris>
					//*  45  101:invokevirtual   #53  <Method int RobotCareType.ordinal()>
					//*  46  104:iconst_3        
					//*  47  105:iastore         
					//*  48  106:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   49  107:astore_0        
						try
						{
							b[MaintenanceViewState.EnableCategoryStatusReset.ordinal()] = 2;
						}
					//*  50  108:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   51  111:astore_0        
						try
						{
							b[MaintenanceViewState.ShowResetInProgress.ordinal()] = 3;
						}
					//*  52  112:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   53  115:astore_0        
						try
						{
							b[MaintenanceViewState.ShowResetCategorySuccess.ordinal()] = 4;
						}
					//*  54  116:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   55  119:astore_0        
						try
						{
							b[MaintenanceViewState.ShowResetCategoryFailed.ordinal()] = 5;
						}
					//*  56  120:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   57  123:astore_0        
						a = new int[RobotCareType.values().length];
						try
						{
							a[RobotCareType.Bin.ordinal()] = 1;
						}
					//*  58  124:goto            64
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   59  127:astore_0        
						try
						{
							a[RobotCareType.Core.ordinal()] = 2;
						}
					//*  60  128:goto            84
						catch(NoSuchFieldError nosuchfielderror6) { }
					//   61  131:astore_0        
						try
						{
							a[RobotCareType.Debris.ordinal()] = 3;
						}
					//*  62  132:goto            95
						catch(NoSuchFieldError nosuchfielderror7) { }
					//   63  135:astore_0        
					//*  64  136:return          
					}
				}

				switch(_cls3.b[maintenanceviewstate.ordinal()])
		//*  35   71:getstatic       #79  <Field int[] MaintenanceCategoryActivity$3.b>
		//*  36   74:aload_3         
		//*  37   75:invokevirtual   #83  <Method int MaintenanceViewState.ordinal()>
		//*  38   78:iaload          
				{
		//*  39   79:tableswitch     1 5: default 112
		//		               1 198
		//		               2 179
		//		               3 169
		//		               4 159
		//		               5 149
				default:
					StringBuilder stringbuilder1 = new StringBuilder();
		//   40  112:new             #39  <Class StringBuilder>
		//   41  115:dup             
		//   42  116:invokespecial   #40  <Method void StringBuilder()>
		//   43  119:astore          4
					stringbuilder1.append("Failed to process view state: ");
		//   44  121:aload           4
		//   45  123:ldc1            #85  <String "Failed to process view state: ">
		//   46  125:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   47  128:pop             
					stringbuilder1.append(((Object) (maintenanceviewstate)));
		//   48  129:aload           4
		//   49  131:aload_3         
		//   50  132:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   51  135:pop             
					com.irobot.home.util.o.a("MaintCatDetailActiv", stringbuilder1.toString());
		//   52  136:ldc1            #23  <String "MaintCatDetailActiv">
		//   53  138:aload           4
		//   54  140:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   55  143:invokestatic    #55  <Method void com.irobot.home.util.o.a(String, String)>
					break;

		//*  56  146:goto            52
				case 5: // '\005'
					a.j();
		//   57  149:aload_0         
		//   58  150:getfield        #12  <Field MaintenanceCategoryActivity a>
		//   59  153:invokevirtual   #88  <Method void com.irobot.home.MaintenanceCategoryActivity.j()>
					break;

		//*  60  156:goto            52
				case 4: // '\004'
					a.h();
		//   61  159:aload_0         
		//   62  160:getfield        #12  <Field MaintenanceCategoryActivity a>
		//   63  163:invokevirtual   #91  <Method void MaintenanceCategoryActivity.h()>
					break;

		//*  64  166:goto            52
				case 3: // '\003'
					a.k();
		//   65  169:aload_0         
		//   66  170:getfield        #12  <Field MaintenanceCategoryActivity a>
		//   67  173:invokevirtual   #94  <Method void MaintenanceCategoryActivity.k()>
					break;

		//*  68  176:goto            52
				case 2: // '\002'
					com.irobot.home.MaintenanceCategoryActivity.a(a, true);
		//   69  179:aload_0         
		//   70  180:getfield        #12  <Field MaintenanceCategoryActivity a>
		//   71  183:iconst_1        
		//   72  184:invokestatic    #97  <Method boolean com.irobot.home.MaintenanceCategoryActivity.a(MaintenanceCategoryActivity, boolean)>
		//   73  187:pop             
					a.i();
		//   74  188:aload_0         
		//   75  189:getfield        #12  <Field MaintenanceCategoryActivity a>
		//   76  192:invokevirtual   #100 <Method void MaintenanceCategoryActivity.i()>
					break;

		//*  77  195:goto            52
				case 1: // '\001'
					com.irobot.home.MaintenanceCategoryActivity.a(a, maintenanceuiservicedata.getCategoryHelpGuideAddress());
		//   78  198:aload_0         
		//   79  199:getfield        #12  <Field MaintenanceCategoryActivity a>
		//   80  202:aload_1         
		//   81  203:invokevirtual   #103 <Method String MaintenanceUIServiceData.getCategoryHelpGuideAddress()>
		//   82  206:invokestatic    #106 <Method String com.irobot.home.MaintenanceCategoryActivity.a(MaintenanceCategoryActivity, String)>
		//   83  209:pop             
					a.f.a(maintenanceuiservicedata.getMaintenancePartsForFocusedCategory());
		//   84  210:aload_0         
		//   85  211:getfield        #12  <Field MaintenanceCategoryActivity a>
		//   86  214:getfield        #110 <Field y MaintenanceCategoryActivity.f>
		//   87  217:aload_1         
		//   88  218:invokevirtual   #113 <Method ArrayList MaintenanceUIServiceData.getMaintenancePartsForFocusedCategory()>
		//   89  221:invokevirtual   #118 <Method void y.a(ArrayList)>
					break;
				}
			} while(true);
		//*  90  224:goto            52
		//   91  227:return          
		}

		final MaintenanceCategoryActivity a;

		private a()
		{
			a = MaintenanceCategoryActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MaintenanceCategoryActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void MaintenanceUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public MaintenanceCategoryActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void BaseFragmentActivity()>
		l = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #45  <Field boolean l>
		m = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #47  <Field boolean m>
		n = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #49  <Field boolean n>
		t = ((MaintenanceUIServiceDataCallback) (new a()));
	//   11   19:aload_0         
	//   12   20:new             #12  <Class MaintenanceCategoryActivity$a>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:invokespecial   #52  <Method void MaintenanceCategoryActivity$a(MaintenanceCategoryActivity, MaintenanceCategoryActivity$1)>
	//   17   29:putfield        #54  <Field MaintenanceUIServiceDataCallback t>
	//   18   32:return          
	}

	static String a(MaintenanceCategoryActivity maintenancecategoryactivity, String s)
	{
		maintenancecategoryactivity.k = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String k>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(MaintenanceCategoryActivity maintenancecategoryactivity)
	{
		maintenancecategoryactivity.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void l()>
	//    2    4:return          
	}

	static boolean a(MaintenanceCategoryActivity maintenancecategoryactivity, boolean flag)
	{
		maintenancecategoryactivity.l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean l>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void b(MaintenanceCategoryActivity maintenancecategoryactivity)
	{
		maintenancecategoryactivity.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void m()>
	//    2    4:return          
	}

	private void l()
	{
		if(com.irobot.home.util.j.i(k))
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field String k>
	//*   2    4:invokestatic    #69  <Method boolean j.i(String)>
	//*   3    7:ifeq            63
		{
			com.irobot.home.WebViewActivity_.a(((android.content.Context) (this))).a(k).a(Integer.valueOf(0x7f0f08a2)).a();
	//    4   10:aload_0         
	//    5   11:invokestatic    #74  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(android.content.Context)>
	//    6   14:aload_0         
	//    7   15:getfield        #58  <Field String k>
	//    8   18:invokevirtual   #79  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    9   21:ldc1            #80  <Int 0x7f0f08a2>
	//   10   23:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   11   26:invokevirtual   #89  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   12   29:invokevirtual   #92  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   13   32:pop             
			if(g != null)
	//*  14   33:aload_0         
	//*  15   34:getfield        #94  <Field o g>
	//*  16   37:ifnull          63
			{
				RobotCareType robotcaretype = g.c();
	//   17   40:aload_0         
	//   18   41:getfield        #94  <Field o g>
	//   19   44:invokevirtual   #99  <Method RobotCareType o.c()>
	//   20   47:astore_1        
				if(robotcaretype != null)
	//*  21   48:aload_1         
	//*  22   49:ifnull          63
					AnalyticsSubsystem.getInstance().trackCareStepByStepGuideViewed(j, robotcaretype);
	//   23   52:invokestatic    #105 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   24   55:aload_0         
	//   25   56:getfield        #107 <Field AssetInfo j>
	//   26   59:aload_1         
	//   27   60:invokevirtual   #111 <Method void AnalyticsSubsystem.trackCareStepByStepGuideViewed(AssetInfo, RobotCareType)>
			}
		}
	//   28   63:return          
	}

	private void m()
	{
		o.sendCommand(MaintenanceUIServiceCommand.ResetPart, ((MaintenanceUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field MaintenanceUIService o>
	//    2    4:getstatic       #119 <Field MaintenanceUIServiceCommand MaintenanceUIServiceCommand.ResetPart>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #125 <Method void MaintenanceUIService.sendCommand(MaintenanceUIServiceCommand, MaintenanceUIServiceData)>
		if(g != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #94  <Field o g>
	//*   7   15:ifnull          37
		{
			RobotCareType robotcaretype = g.c();
	//    8   18:aload_0         
	//    9   19:getfield        #94  <Field o g>
	//   10   22:invokevirtual   #99  <Method RobotCareType o.c()>
	//   11   25:astore_1        
			AnalyticsSubsystem.getInstance().trackCareResetStatusButtonPressed(j, robotcaretype);
	//   12   26:invokestatic    #105 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   13   29:aload_0         
	//   14   30:getfield        #107 <Field AssetInfo j>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #128 <Method void AnalyticsSubsystem.trackCareResetStatusButtonPressed(AssetInfo, RobotCareType)>
		}
	//   17   37:return          
	}

	void e()
	{
label0:
		{
			o = Assembler.getInstance().getMaintenanceUIService(a);
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method Assembler Assembler.getInstance()>
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field String a>
	//    4    8:invokevirtual   #139 <Method MaintenanceUIService Assembler.getMaintenanceUIService(String)>
	//    5   11:putfield        #113 <Field MaintenanceUIService o>
			j = com.irobot.home.util.j.a(a).a();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #135 <Field String a>
	//    9   19:invokestatic    #142 <Method a j.a(String)>
	//   10   22:invokevirtual   #147 <Method AssetInfo a.a()>
	//   11   25:putfield        #107 <Field AssetInfo j>
			g = com.irobot.home.model.o.a(b.toLowerCase(), j.getSku());
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #149 <Field String b>
	//   15   33:invokevirtual   #155 <Method String String.toLowerCase()>
	//   16   36:aload_0         
	//   17   37:getfield        #107 <Field AssetInfo j>
	//   18   40:invokevirtual   #160 <Method String AssetInfo.getSku()>
	//   19   43:invokestatic    #163 <Method o o.a(String, String)>
	//   20   46:putfield        #94  <Field o g>
			if(g == null)
				break label0;
	//   21   49:aload_0         
	//   22   50:getfield        #94  <Field o g>
	//   23   53:ifnull          174
			int i1 = g.a();
	//   24   56:aload_0         
	//   25   57:getfield        #94  <Field o g>
	//   26   60:invokevirtual   #166 <Method int o.a()>
	//   27   63:istore_1        
			if(i1 == 0)
	//*  28   64:iload_1         
	//*  29   65:ifeq            76
	//*  30   68:aload_0         
	//*  31   69:iload_1         
	//*  32   70:invokevirtual   #169 <Method void b(int)>
	//*  33   73:goto            82
				i1 = 0x7f0f0184;
	//   34   76:ldc1            #170 <Int 0x7f0f0184>
	//   35   78:istore_1        
			b(i1);
	//*  36   79:goto            68
			if(g.c() == null)
				break label0;
	//   37   82:aload_0         
	//   38   83:getfield        #94  <Field o g>
	//   39   86:invokevirtual   #99  <Method RobotCareType o.c()>
	//   40   89:ifnull          174
			AnalyticsSubsystem analyticssubsystem;
			ViewId viewid;
			switch(com.irobot.home._cls3.a[g.c().ordinal()])
	//*  41   92:getstatic       #173 <Field int[] com.irobot.home.MaintenanceCategoryActivity$3.a>
	//*  42   95:aload_0         
	//*  43   96:getfield        #94  <Field o g>
	//*  44   99:invokevirtual   #99  <Method RobotCareType o.c()>
	//*  45  102:invokevirtual   #178 <Method int RobotCareType.ordinal()>
	//*  46  105:iaload          
			{
	//*  47  106:tableswitch     1 3: default 132
	//	               1 157
	//	               2 146
	//	               3 135
			default:
				break label0;
	//   48  132:goto            174

			case 3: // '\003'
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   49  135:invokestatic    #105 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   50  138:astore_2        
				viewid = ViewId.DebrisExtractor;
	//   51  139:getstatic       #184 <Field ViewId ViewId.DebrisExtractor>
	//   52  142:astore_3        
				break;
	//   53  143:goto            165

			case 2: // '\002'
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   54  146:invokestatic    #105 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   55  149:astore_2        
				viewid = ViewId.CareCoreRobot;
	//   56  150:getstatic       #187 <Field ViewId ViewId.CareCoreRobot>
	//   57  153:astore_3        
				break;
	//   58  154:goto            165

			case 1: // '\001'
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   59  157:invokestatic    #105 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   60  160:astore_2        
				viewid = ViewId.CareBin;
	//   61  161:getstatic       #190 <Field ViewId ViewId.CareBin>
	//   62  164:astore_3        
				break;
			}
			analyticssubsystem.trackViewForAsset(viewid, j);
	//   63  165:aload_2         
	//   64  166:aload_3         
	//   65  167:aload_0         
	//   66  168:getfield        #107 <Field AssetInfo j>
	//   67  171:invokevirtual   #194 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		}
		((CustomTextView)c.findViewById(0x7f09019d)).setText(0x7f0f0074);
	//   68  174:aload_0         
	//   69  175:getfield        #196 <Field View c>
	//   70  178:ldc1            #197 <Int 0x7f09019d>
	//   71  180:invokevirtual   #203 <Method View View.findViewById(int)>
	//   72  183:checkcast       #205 <Class CustomTextView>
	//   73  186:ldc1            #206 <Int 0x7f0f0074>
	//   74  188:invokevirtual   #209 <Method void CustomTextView.setText(int)>
		g();
	//   75  191:aload_0         
	//   76  192:invokevirtual   #211 <Method void g()>
	//   77  195:return          
	}

	public void f()
	{
		com.irobot.home.ContactTableViewActivity_.a(((android.content.Context) (this))).a(a).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #216 <Method ContactTableViewActivity_$a com.irobot.home.ContactTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field String a>
	//    4    8:invokevirtual   #221 <Method ContactTableViewActivity_$a com.irobot.home.ContactTableViewActivity_$a.a(String)>
	//    5   11:invokevirtual   #222 <Method org.androidannotations.api.a.e com.irobot.home.ContactTableViewActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	void g()
	{
		View view = LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b0110, ((android.view.ViewGroup) (d)), false);
	//    0    0:aload_0         
	//    1    1:invokestatic    #228 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    2    4:ldc1            #229 <Int 0x7f0b0110>
	//    3    6:aload_0         
	//    4    7:getfield        #231 <Field ListView d>
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #235 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   14:astore_1        
		h = (Button)view.findViewById(0x7f090417);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc1            #236 <Int 0x7f090417>
	//   11   19:invokevirtual   #203 <Method View View.findViewById(int)>
	//   12   22:checkcast       #238 <Class Button>
	//   13   25:putfield        #240 <Field Button h>
		h.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view1)
			{
				com.irobot.home.MaintenanceCategoryActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MaintenanceCategoryActivity a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.MaintenanceCategoryActivity.a(MaintenanceCategoryActivity)>
			//    3    7:return          
			}

			final MaintenanceCategoryActivity a;

			
			{
				a = MaintenanceCategoryActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaintenanceCategoryActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   14   28:aload_0         
	//   15   29:getfield        #240 <Field Button h>
	//   16   32:new             #6   <Class MaintenanceCategoryActivity$1>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #242 <Method void MaintenanceCategoryActivity$1(MaintenanceCategoryActivity)>
	//   20   40:invokevirtual   #246 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		i = (Button)view.findViewById(0x7f09033d);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:ldc1            #247 <Int 0x7f09033d>
	//   24   47:invokevirtual   #203 <Method View View.findViewById(int)>
	//   25   50:checkcast       #238 <Class Button>
	//   26   53:putfield        #249 <Field Button i>
		i.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view1)
			{
				MaintenanceCategoryActivity.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MaintenanceCategoryActivity a>
			//    2    4:invokestatic    #25  <Method void MaintenanceCategoryActivity.b(MaintenanceCategoryActivity)>
			//    3    7:return          
			}

			final MaintenanceCategoryActivity a;

			
			{
				a = MaintenanceCategoryActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaintenanceCategoryActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   27   56:aload_0         
	//   28   57:getfield        #249 <Field Button i>
	//   29   60:new             #8   <Class MaintenanceCategoryActivity$2>
	//   30   63:dup             
	//   31   64:aload_0         
	//   32   65:invokespecial   #250 <Method void MaintenanceCategoryActivity$2(MaintenanceCategoryActivity)>
	//   33   68:invokevirtual   #246 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		ImageView imageview = (ImageView)view.findViewById(0x7f090373);
	//   34   71:aload_1         
	//   35   72:ldc1            #251 <Int 0x7f090373>
	//   36   74:invokevirtual   #203 <Method View View.findViewById(int)>
	//   37   77:checkcast       #253 <Class ImageView>
	//   38   80:astore_2        
		if(g != null && g.b() != 0)
	//*  39   81:aload_0         
	//*  40   82:getfield        #94  <Field o g>
	//*  41   85:ifnull          116
	//*  42   88:aload_0         
	//*  43   89:getfield        #94  <Field o g>
	//*  44   92:invokevirtual   #255 <Method int o.b()>
	//*  45   95:ifeq            116
			imageview.setImageDrawable(getResources().getDrawable(g.b()));
	//   46   98:aload_2         
	//   47   99:aload_0         
	//   48  100:invokevirtual   #259 <Method Resources getResources()>
	//   49  103:aload_0         
	//   50  104:getfield        #94  <Field o g>
	//   51  107:invokevirtual   #255 <Method int o.b()>
	//   52  110:invokevirtual   #265 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   53  113:invokevirtual   #269 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		f = new y(((android.app.Activity) (this)), 0x7f0b0131);
	//   54  116:aload_0         
	//   55  117:new             #271 <Class y>
	//   56  120:dup             
	//   57  121:aload_0         
	//   58  122:ldc2            #272 <Int 0x7f0b0131>
	//   59  125:invokespecial   #275 <Method void y(android.app.Activity, int)>
	//   60  128:putfield        #277 <Field y f>
		d.setAdapter(((android.widget.ListAdapter) (f)));
	//   61  131:aload_0         
	//   62  132:getfield        #231 <Field ListView d>
	//   63  135:aload_0         
	//   64  136:getfield        #277 <Field y f>
	//   65  139:invokevirtual   #283 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		d.setSelector(0x7f060055);
	//   66  142:aload_0         
	//   67  143:getfield        #231 <Field ListView d>
	//   68  146:ldc2            #284 <Int 0x7f060055>
	//   69  149:invokevirtual   #287 <Method void ListView.setSelector(int)>
		d.addHeaderView(view, ((Object) (null)), false);
	//   70  152:aload_0         
	//   71  153:getfield        #231 <Field ListView d>
	//   72  156:aload_1         
	//   73  157:aconst_null     
	//   74  158:iconst_0        
	//   75  159:invokevirtual   #291 <Method void ListView.addHeaderView(View, Object, boolean)>
	//   76  162:return          
	}

	protected void h()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method void finish()>
	//    2    4:return          
	}

	protected void i()
	{
		i.setEnabled(l);
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field Button i>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field boolean l>
	//    4    8:invokevirtual   #298 <Method void Button.setEnabled(boolean)>
	//    5   11:return          
	}

	protected void j()
	{
		e.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field ProgressBar e>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #305 <Method void ProgressBar.setVisibility(int)>
		i.setEnabled(l);
	//    4    9:aload_0         
	//    5   10:getfield        #249 <Field Button i>
	//    6   13:aload_0         
	//    7   14:getfield        #45  <Field boolean l>
	//    8   17:invokevirtual   #298 <Method void Button.setEnabled(boolean)>
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f092f).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    9   20:new             #307 <Class android.app.AlertDialog$Builder>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokespecial   #310 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   13   28:ldc2            #311 <Int 0x7f0f092f>
	//   14   31:invokevirtual   #315 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   15   34:ldc2            #316 <Int 0x7f0f05bb>
	//   16   37:aconst_null     
	//   17   38:invokevirtual   #320 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   18   41:invokevirtual   #324 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   19   44:pop             
	//   20   45:return          
	}

	protected void k()
	{
		e.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field ProgressBar e>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method void ProgressBar.setVisibility(int)>
		i.setEnabled(false);
	//    4    8:aload_0         
	//    5    9:getfield        #249 <Field Button i>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #298 <Method void Button.setEnabled(boolean)>
	//    8   16:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #327 <Method void BaseFragmentActivity.onPause()>
		o.sendCommand(MaintenanceUIServiceCommand.StopFocusOnCategory, ((MaintenanceUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field MaintenanceUIService o>
	//    4    8:getstatic       #330 <Field MaintenanceUIServiceCommand MaintenanceUIServiceCommand.StopFocusOnCategory>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #125 <Method void MaintenanceUIService.sendCommand(MaintenanceUIServiceCommand, MaintenanceUIServiceData)>
	//    7   15:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #333 <Method void BaseFragmentActivity.onResume()>
		MaintenanceUIServiceData maintenanceuiservicedata = MaintenanceUIServiceData.create();
	//    2    4:invokestatic    #339 <Method MaintenanceUIServiceData MaintenanceUIServiceData.create()>
	//    3    7:astore_1        
		maintenanceuiservicedata.setCategoryIdForFocus(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #149 <Field String b>
	//    7   13:invokevirtual   #343 <Method void MaintenanceUIServiceData.setCategoryIdForFocus(String)>
		o.sendCommand(MaintenanceUIServiceCommand.StartFocusOnCategory, maintenanceuiservicedata);
	//    8   16:aload_0         
	//    9   17:getfield        #113 <Field MaintenanceUIService o>
	//   10   20:getstatic       #346 <Field MaintenanceUIServiceCommand MaintenanceUIServiceCommand.StartFocusOnCategory>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #125 <Method void MaintenanceUIService.sendCommand(MaintenanceUIServiceCommand, MaintenanceUIServiceData)>
	//   13   27:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #349 <Method void BaseFragmentActivity.onStart()>
		o.registerUISubscriber(t);
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field MaintenanceUIService o>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field MaintenanceUIServiceDataCallback t>
	//    6   12:invokevirtual   #353 <Method boolean MaintenanceUIService.registerUISubscriber(MaintenanceUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #356 <Method void BaseFragmentActivity.onStop()>
		o.unregisterSubscriber(t);
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field MaintenanceUIService o>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field MaintenanceUIServiceDataCallback t>
	//    6   12:invokevirtual   #359 <Method boolean MaintenanceUIService.unregisterSubscriber(MaintenanceUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	String a;
	String b;
	View c;
	ListView d;
	ProgressBar e;
	y f;
	o g;
	private Button h;
	private Button i;
	private AssetInfo j;
	private String k;
	private boolean l;
	private boolean m;
	private boolean n;
	private MaintenanceUIService o;
	private MaintenanceUIServiceDataCallback t;
}
