// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.view.s;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.x;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ApplicationUIService;
import com.irobot.core.ApplicationUIServiceCommand;
import com.irobot.core.Assembler;
import com.irobot.core.HistoryDataState;
import com.irobot.core.HistoryUIService;
import com.irobot.core.HistoryUIServiceCommand;
import com.irobot.core.HistoryUIServiceData;
import com.irobot.core.HistoryUIServiceDataCallback;
import com.irobot.home.b.o;
import com.irobot.home.b.r;
import com.irobot.home.core.a.b;
import com.irobot.home.fragments.ap;
import com.irobot.home.fragments.ar;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.History;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.CustomViewPager;
import com.irobot.home.view.EmptySupportedRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, MissionDetailsActivity_

public class HistoryActivity extends BaseFragmentActivity
	implements com.irobot.home.b.r.a
{

	public HistoryActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void BaseFragmentActivity()>
		l = ((HistoryUIServiceDataCallback) (new HistoryUIServiceDataCallback() {

			public void onHistoryUIServiceDataChanged(HistoryUIServiceData historyuiservicedata)
			{
				if(historyuiservicedata == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       13
				{
					com.irobot.home.util.o.b(HistoryActivity.f(), "null service data");
			//    2    4:invokestatic    #22  <Method String HistoryActivity.f()>
			//    3    7:ldc1            #24  <String "null service data">
			//    4    9:invokestatic    #30  <Method void com.irobot.home.util.o.b(String, String)>
					return;
			//    5   12:return          
				}
				Iterator iterator = historyuiservicedata.getDataStates().iterator();
			//    6   13:aload_1         
			//    7   14:invokevirtual   #36  <Method ArrayList HistoryUIServiceData.getDataStates()>
			//    8   17:invokevirtual   #42  <Method Iterator ArrayList.iterator()>
			//    9   20:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//   10   21:aload_2         
			//   11   22:invokeinterface #48  <Method boolean Iterator.hasNext()>
			//   12   27:ifeq            79
					HistoryDataState historydatastate = (HistoryDataState)iterator.next();
			//   13   30:aload_2         
			//   14   31:invokeinterface #52  <Method Object Iterator.next()>
			//   15   36:checkcast       #54  <Class HistoryDataState>
			//   16   39:astore_3        
					com.irobot.home.util.o.a(HistoryActivity.f(), historydatastate.name());
			//   17   40:invokestatic    #22  <Method String HistoryActivity.f()>
			//   18   43:aload_3         
			//   19   44:invokevirtual   #57  <Method String HistoryDataState.name()>
			//   20   47:invokestatic    #59  <Method void com.irobot.home.util.o.a(String, String)>
					static class _cls3
					{

						static final int a[];

						static 
						{
							a = new int[HistoryDataState.values().length];
						//    0    0:invokestatic    #18  <Method HistoryDataState[] HistoryDataState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] a>
							try
							{
								a[HistoryDataState.MissionHistory.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field HistoryDataState HistoryDataState.MissionHistory>
						//    6   15:invokevirtual   #28  <Method int HistoryDataState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
						//    9   20:return          
							}
							catch(NoSuchFieldError nosuchfielderror) { }
						//   10   21:astore_0        
						//*  11   22:return          
						}
					}

					if(com.irobot.home._cls3.a[historydatastate.ordinal()] == 1)
			//*  21   50:getstatic       #64  <Field int[] com.irobot.home.HistoryActivity$3.a>
			//*  22   53:aload_3         
			//*  23   54:invokevirtual   #68  <Method int HistoryDataState.ordinal()>
			//*  24   57:iaload          
			//*  25   58:iconst_1        
			//*  26   59:icmpeq          65
			//*  27   62:goto            21
						com.irobot.home.HistoryActivity.a(a, historyuiservicedata.getRobotMissionHistoryList());
			//   28   65:aload_0         
			//   29   66:getfield        #12  <Field HistoryActivity a>
			//   30   69:aload_1         
			//   31   70:invokevirtual   #71  <Method ArrayList HistoryUIServiceData.getRobotMissionHistoryList()>
			//   32   73:invokestatic    #74  <Method void com.irobot.home.HistoryActivity.a(HistoryActivity, ArrayList)>
				} while(true);
			//   33   76:goto            21
			//   34   79:return          
			}

			final HistoryActivity a;

			
			{
				a = HistoryActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field HistoryActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #8   <Class HistoryActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #59  <Method void HistoryActivity$1(HistoryActivity)>
	//    7   13:putfield        #61  <Field HistoryUIServiceDataCallback l>
	//    8   16:return          
	}

	static void a(HistoryActivity historyactivity, ArrayList arraylist)
	{
		historyactivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void a(ArrayList)>
	//    3    5:return          
	}

	private void a(ArrayList arraylist)
	{
		h.a(arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field r h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #70  <Method void r.a(ArrayList)>
	//    4    8:return          
	}

	static String f()
	{
		return g;
	//    0    0:getstatic       #52  <Field String g>
	//    1    3:areturn         
	}

	private List g()
	{
		j = ((List) (new ArrayList()));
	//    0    0:aload_0         
	//    1    1:new             #75  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #76  <Method void ArrayList()>
	//    4    8:putfield        #78  <Field List j>
		com.irobot.home.fragments.aq aq = ar.c().a(Boolean.valueOf(f.booleanValue() ^ true)).a();
	//    5   11:invokestatic    #83  <Method com.irobot.home.fragments.ar$a ar.c()>
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field Boolean f>
	//    8   18:invokevirtual   #91  <Method boolean Boolean.booleanValue()>
	//    9   21:iconst_1        
	//   10   22:ixor            
	//   11   23:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   12   26:invokevirtual   #100 <Method com.irobot.home.fragments.ar$a com.irobot.home.fragments.ar$a.a(Boolean)>
	//   13   29:invokevirtual   #103 <Method com.irobot.home.fragments.aq com.irobot.home.fragments.ar$a.a()>
	//   14   32:astore_1        
		if(f.booleanValue())
	//*  15   33:aload_0         
	//*  16   34:getfield        #85  <Field Boolean f>
	//*  17   37:invokevirtual   #91  <Method boolean Boolean.booleanValue()>
	//*  18   40:ifeq            61
		{
			com.irobot.home.fragments.ao ao = ap.c().a();
	//   19   43:invokestatic    #108 <Method com.irobot.home.fragments.ap$a ap.c()>
	//   20   46:invokevirtual   #113 <Method com.irobot.home.fragments.ao com.irobot.home.fragments.ap$a.a()>
	//   21   49:astore_2        
			j.add(((Object) (ao)));
	//   22   50:aload_0         
	//   23   51:getfield        #78  <Field List j>
	//   24   54:aload_2         
	//   25   55:invokeinterface #119 <Method boolean List.add(Object)>
	//   26   60:pop             
		}
		j.add(((Object) (aq)));
	//   27   61:aload_0         
	//   28   62:getfield        #78  <Field List j>
	//   29   65:aload_1         
	//   30   66:invokeinterface #119 <Method boolean List.add(Object)>
	//   31   71:pop             
		return j;
	//   32   72:aload_0         
	//   33   73:getfield        #78  <Field List j>
	//   34   76:areturn         
	}

	public void e()
	{
		com.irobot.core.AssetInfo assetinfo = com.irobot.home.util.j.a(e).a();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field String e>
	//    2    4:invokestatic    #125 <Method a j.a(String)>
	//    3    7:invokevirtual   #130 <Method com.irobot.core.AssetInfo a.a()>
	//    4   10:astore_2        
		b(0x7f0f0359);
	//    5   11:aload_0         
	//    6   12:ldc1            #131 <Int 0x7f0f0359>
	//    7   14:invokevirtual   #134 <Method void b(int)>
		j = g();
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:invokespecial   #136 <Method List g()>
	//   11   22:putfield        #78  <Field List j>
		i = new o(getSupportFragmentManager(), j, ((android.content.Context) (this)));
	//   12   25:aload_0         
	//   13   26:new             #138 <Class o>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:invokevirtual   #142 <Method android.support.v4.app.FragmentManager getSupportFragmentManager()>
	//   17   34:aload_0         
	//   18   35:getfield        #78  <Field List j>
	//   19   38:aload_0         
	//   20   39:invokespecial   #145 <Method void o(android.support.v4.app.FragmentManager, List, android.content.Context)>
	//   21   42:putfield        #147 <Field o i>
		a.setAdapter(((android.support.v4.view.p) (i)));
	//   22   45:aload_0         
	//   23   46:getfield        #149 <Field CustomViewPager a>
	//   24   49:aload_0         
	//   25   50:getfield        #147 <Field o i>
	//   26   53:invokevirtual   #155 <Method void CustomViewPager.setAdapter(android.support.v4.view.p)>
		a.setWrapToSizeToChildren(true);
	//   27   56:aload_0         
	//   28   57:getfield        #149 <Field CustomViewPager a>
	//   29   60:iconst_1        
	//   30   61:invokevirtual   #159 <Method void CustomViewPager.setWrapToSizeToChildren(boolean)>
		if(f.booleanValue())
	//*  31   64:aload_0         
	//*  32   65:getfield        #85  <Field Boolean f>
	//*  33   68:invokevirtual   #91  <Method boolean Boolean.booleanValue()>
	//*  34   71:ifeq            169
		{
			c.setupWithViewPager(((ViewPager) (a)));
	//   35   74:aload_0         
	//   36   75:getfield        #161 <Field TabLayout c>
	//   37   78:aload_0         
	//   38   79:getfield        #149 <Field CustomViewPager a>
	//   39   82:invokevirtual   #167 <Method void TabLayout.setupWithViewPager(ViewPager)>
			c.setOnTabSelectedListener(((android.support.design.widget.TabLayout.b) (new android.support.design.widget.TabLayout.h(((ViewPager) (a))) {

				public void a(android.support.design.widget.TabLayout.e e1)
				{
					super.a(e1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokespecial   #22  <Method void android.support.design.widget.TabLayout$h.a(android.support.design.widget.TabLayout$e)>
					AnalyticsSubsystem.getInstance().trackHistorySummaryTabChanged();
				//    3    5:invokestatic    #28  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
				//    4    8:invokevirtual   #31  <Method void AnalyticsSubsystem.trackHistorySummaryTabChanged()>
					a.a.d(e1.c());
				//    5   11:aload_0         
				//    6   12:getfield        #15  <Field HistoryActivity a>
				//    7   15:getfield        #34  <Field CustomViewPager com.irobot.home.HistoryActivity.a>
				//    8   18:aload_1         
				//    9   19:invokevirtual   #40  <Method int android.support.design.widget.TabLayout$e.c()>
				//   10   22:invokevirtual   #46  <Method void CustomViewPager.d(int)>
				//   11   25:return          
				}

				public void b(android.support.design.widget.TabLayout.e e1)
				{
					super.b(e1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokespecial   #49  <Method void android.support.design.widget.TabLayout$h.b(android.support.design.widget.TabLayout$e)>
				//    3    5:return          
				}

				public void c(android.support.design.widget.TabLayout.e e1)
				{
					super.c(e1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokespecial   #51  <Method void android.support.design.widget.TabLayout$h.c(android.support.design.widget.TabLayout$e)>
				//    3    5:return          
				}

				final HistoryActivity a;

			
			{
				a = HistoryActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field HistoryActivity a>
				super(viewpager);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void android.support.design.widget.TabLayout$h(ViewPager)>
			//    6   10:return          
			}
			}
)));
	//   40   85:aload_0         
	//   41   86:getfield        #161 <Field TabLayout c>
	//   42   89:new             #10  <Class HistoryActivity$2>
	//   43   92:dup             
	//   44   93:aload_0         
	//   45   94:aload_0         
	//   46   95:getfield        #149 <Field CustomViewPager a>
	//   47   98:invokespecial   #170 <Method void HistoryActivity$2(HistoryActivity, ViewPager)>
	//   48  101:invokevirtual   #174 <Method void TabLayout.setOnTabSelectedListener(android.support.design.widget.TabLayout$b)>
			Typeface typeface = Typeface.createFromAsset(getAssets(), "HarmoniaSansPro-Bold.otf");
	//   49  104:aload_0         
	//   50  105:invokevirtual   #178 <Method android.content.res.AssetManager getAssets()>
	//   51  108:ldc1            #180 <String "HarmoniaSansPro-Bold.otf">
	//   52  110:invokestatic    #186 <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//   53  113:astore_3        
			for(int i1 = 0; i1 < c.getTabCount(); i1++)
	//*  54  114:iconst_0        
	//*  55  115:istore_1        
	//*  56  116:iload_1         
	//*  57  117:aload_0         
	//*  58  118:getfield        #161 <Field TabLayout c>
	//*  59  121:invokevirtual   #190 <Method int TabLayout.getTabCount()>
	//*  60  124:icmpge          178
			{
				TextView textview = (TextView)LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b008d, ((android.view.ViewGroup) (null)));
	//   61  127:aload_0         
	//   62  128:invokestatic    #196 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//   63  131:ldc1            #197 <Int 0x7f0b008d>
	//   64  133:aconst_null     
	//   65  134:invokevirtual   #201 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   66  137:checkcast       #203 <Class TextView>
	//   67  140:astore          4
				textview.setTypeface(typeface);
	//   68  142:aload           4
	//   69  144:aload_3         
	//   70  145:invokevirtual   #207 <Method void TextView.setTypeface(Typeface)>
				c.a(i1).a(((android.view.View) (textview)));
	//   71  148:aload_0         
	//   72  149:getfield        #161 <Field TabLayout c>
	//   73  152:iload_1         
	//   74  153:invokevirtual   #210 <Method android.support.design.widget.TabLayout$e TabLayout.a(int)>
	//   75  156:aload           4
	//   76  158:invokevirtual   #215 <Method android.support.design.widget.TabLayout$e android.support.design.widget.TabLayout$e.a(android.view.View)>
	//   77  161:pop             
			}

	//   78  162:iload_1         
	//   79  163:iconst_1        
	//   80  164:iadd            
	//   81  165:istore_1        
		} else
	//*  82  166:goto            116
		{
			c.setVisibility(8);
	//   83  169:aload_0         
	//   84  170:getfield        #161 <Field TabLayout c>
	//   85  173:bipush          8
	//   86  175:invokevirtual   #218 <Method void TabLayout.setVisibility(int)>
		}
		h = new r(((android.content.Context) (this)), ((com.irobot.home.b.r.a) (this)));
	//   87  178:aload_0         
	//   88  179:new             #69  <Class r>
	//   89  182:dup             
	//   90  183:aload_0         
	//   91  184:aload_0         
	//   92  185:invokespecial   #221 <Method void r(android.content.Context, com.irobot.home.b.r$a)>
	//   93  188:putfield        #67  <Field r h>
		b.m(((android.view.View) (d)));
	//   94  191:aload_0         
	//   95  192:getfield        #223 <Field EmptySupportedRecyclerView b>
	//   96  195:aload_0         
	//   97  196:getfield        #225 <Field CustomTextView d>
	//   98  199:invokevirtual   #231 <Method void EmptySupportedRecyclerView.m(android.view.View)>
		b.setAdapter(((android.support.v7.widget.RecyclerView.a) (h)));
	//   99  202:aload_0         
	//  100  203:getfield        #223 <Field EmptySupportedRecyclerView b>
	//  101  206:aload_0         
	//  102  207:getfield        #67  <Field r h>
	//  103  210:invokevirtual   #234 <Method void EmptySupportedRecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		Object obj = ((Object) (new LinearLayoutManager(((android.content.Context) (this)))));
	//  104  213:new             #236 <Class LinearLayoutManager>
	//  105  216:dup             
	//  106  217:aload_0         
	//  107  218:invokespecial   #239 <Method void LinearLayoutManager(android.content.Context)>
	//  108  221:astore_3        
		b.setLayoutManager(((android.support.v7.widget.RecyclerView.h) (obj)));
	//  109  222:aload_0         
	//  110  223:getfield        #223 <Field EmptySupportedRecyclerView b>
	//  111  226:aload_3         
	//  112  227:invokevirtual   #243 <Method void EmptySupportedRecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		b.a(((android.support.v7.widget.RecyclerView.g) (new x(((android.content.Context) (this)), ((LinearLayoutManager) (obj)).f()))));
	//  113  230:aload_0         
	//  114  231:getfield        #223 <Field EmptySupportedRecyclerView b>
	//  115  234:new             #245 <Class x>
	//  116  237:dup             
	//  117  238:aload_0         
	//  118  239:aload_3         
	//  119  240:invokevirtual   #247 <Method int LinearLayoutManager.f()>
	//  120  243:invokespecial   #250 <Method void x(android.content.Context, int)>
	//  121  246:invokevirtual   #253 <Method void EmptySupportedRecyclerView.a(android.support.v7.widget.RecyclerView$g)>
		s.c(((android.view.View) (b)), false);
	//  122  249:aload_0         
	//  123  250:getfield        #223 <Field EmptySupportedRecyclerView b>
	//  124  253:iconst_0        
	//  125  254:invokestatic    #258 <Method void s.c(android.view.View, boolean)>
		obj = ((Object) (com.irobot.home.util.j.a(e).b()));
	//  126  257:aload_0         
	//  127  258:getfield        #122 <Field String e>
	//  128  261:invokestatic    #125 <Method a j.a(String)>
	//  129  264:invokevirtual   #261 <Method com.irobot.core.AssetId a.b()>
	//  130  267:astore_3        
		k = Assembler.getInstance().getHistoryUIService(((com.irobot.core.AssetId) (obj)));
	//  131  268:aload_0         
	//  132  269:invokestatic    #267 <Method Assembler Assembler.getInstance()>
	//  133  272:aload_3         
	//  134  273:invokevirtual   #271 <Method HistoryUIService Assembler.getHistoryUIService(com.irobot.core.AssetId)>
	//  135  276:putfield        #273 <Field HistoryUIService k>
		obj = ((Object) (com.irobot.home.util.j.o(e)));
	//  136  279:aload_0         
	//  137  280:getfield        #122 <Field String e>
	//  138  283:invokestatic    #277 <Method Robot j.o(String)>
	//  139  286:astore_3        
		int j1 = ((Robot) (obj)).m().getNumberOfCleaningJobs();
	//  140  287:aload_3         
	//  141  288:invokevirtual   #282 <Method History Robot.m()>
	//  142  291:invokevirtual   #287 <Method int History.getNumberOfCleaningJobs()>
	//  143  294:istore_1        
		AnalyticsSubsystem.getInstance().trackHistorySummaryView(assetinfo, j1);
	//  144  295:invokestatic    #292 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  145  298:aload_2         
	//  146  299:iload_1         
	//  147  300:invokevirtual   #296 <Method void AnalyticsSubsystem.trackHistorySummaryView(com.irobot.core.AssetInfo, int)>
		d.setText(((CharSequence) (getString(0x7f0f04de, new Object[] {
			((Robot) (obj)).i()
		}))));
	//  148  303:aload_0         
	//  149  304:getfield        #225 <Field CustomTextView d>
	//  150  307:aload_0         
	//  151  308:ldc2            #297 <Int 0x7f0f04de>
	//  152  311:iconst_1        
	//  153  312:anewarray       Object[]
	//  154  315:dup             
	//  155  316:iconst_0        
	//  156  317:aload_3         
	//  157  318:invokevirtual   #301 <Method String Robot.i()>
	//  158  321:aastore         
	//  159  322:invokevirtual   #305 <Method String getString(int, Object[])>
	//  160  325:invokevirtual   #311 <Method void CustomTextView.setText(CharSequence)>
	//  161  328:return          
	}

	public void f(int i1)
	{
		String s1 = g;
	//    0    0:getstatic       #52  <Field String g>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #313 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #314 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Attempt to display mission with id: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #316 <String "Attempt to display mission with id: ">
	//    8   16:invokevirtual   #320 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(i1);
	//   10   20:aload_3         
	//   11   21:iload_1         
	//   12   22:invokevirtual   #323 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #326 <Method String StringBuilder.toString()>
	//   17   31:invokestatic    #331 <Method void com.irobot.home.util.o.b(String, String)>
		com.irobot.home.MissionDetailsActivity_.a(((android.content.Context) (this))).a(e).b(i1).a(0);
	//   18   34:aload_0         
	//   19   35:invokestatic    #336 <Method MissionDetailsActivity_$a com.irobot.home.MissionDetailsActivity_.a(android.content.Context)>
	//   20   38:aload_0         
	//   21   39:getfield        #122 <Field String e>
	//   22   42:invokevirtual   #341 <Method MissionDetailsActivity_$a com.irobot.home.MissionDetailsActivity_$a.a(String)>
	//   23   45:iload_1         
	//   24   46:invokevirtual   #344 <Method MissionDetailsActivity_$a com.irobot.home.MissionDetailsActivity_$a.b(int)>
	//   25   49:iconst_0        
	//   26   50:invokevirtual   #347 <Method org.androidannotations.api.a.e com.irobot.home.MissionDetailsActivity_$a.a(int)>
	//   27   53:pop             
	//   28   54:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		super.onActivityResult(i1, j1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #351 <Method void BaseFragmentActivity.onActivityResult(int, int, Intent)>
		if(i1 == 0 && intent != null && intent.getBooleanExtra("map_shown", false))
	//*   5    7:iload_1         
	//*   6    8:ifne            46
	//*   7   11:aload_3         
	//*   8   12:ifnull          46
	//*   9   15:aload_3         
	//*  10   16:ldc2            #353 <String "map_shown">
	//*  11   19:iconst_0        
	//*  12   20:invokevirtual   #359 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  13   23:ifeq            46
		{
			com.irobot.home.core.a.b.a().a(((android.content.Context) (this)));
	//   14   26:invokestatic    #364 <Method b b.a()>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #366 <Method void b.a(android.content.Context)>
			Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.BeginAppRatingFlow, ((com.irobot.core.ApplicationUIServiceData) (null)));
	//   17   33:invokestatic    #267 <Method Assembler Assembler.getInstance()>
	//   18   36:invokevirtual   #370 <Method ApplicationUIService Assembler.getApplicationUIService()>
	//   19   39:getstatic       #376 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.BeginAppRatingFlow>
	//   20   42:aconst_null     
	//   21   43:invokevirtual   #382 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, com.irobot.core.ApplicationUIServiceData)>
		}
	//   22   46:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #385 <Method void BaseFragmentActivity.onStart()>
		k.registerUISubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #273 <Field HistoryUIService k>
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field HistoryUIServiceDataCallback l>
	//    6   12:invokevirtual   #391 <Method boolean HistoryUIService.registerUISubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
		k.sendCommand(HistoryUIServiceCommand.HistoryDataRequired, ((HistoryUIServiceData) (null)));
	//    8   16:aload_0         
	//    9   17:getfield        #273 <Field HistoryUIService k>
	//   10   20:getstatic       #397 <Field HistoryUIServiceCommand HistoryUIServiceCommand.HistoryDataRequired>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #400 <Method void HistoryUIService.sendCommand(HistoryUIServiceCommand, HistoryUIServiceData)>
	//   13   27:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #403 <Method void BaseFragmentActivity.onStop()>
		k.unregisterSubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #273 <Field HistoryUIService k>
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field HistoryUIServiceDataCallback l>
	//    6   12:invokevirtual   #406 <Method boolean HistoryUIService.unregisterSubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String g = com.irobot.home.util.j.r(((Class) (com/irobot/home/HistoryActivity)).getSimpleName());
	CustomViewPager a;
	EmptySupportedRecyclerView b;
	TabLayout c;
	CustomTextView d;
	String e;
	Boolean f;
	private r h;
	private o i;
	private List j;
	private HistoryUIService k;
	private HistoryUIServiceDataCallback l;

	static 
	{
	//    0    0:ldc1            #2   <Class HistoryActivity>
	//    1    2:invokevirtual   #44  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #50  <Method String j.r(String)>
	//    3    8:putstatic       #52  <Field String g>
	//*   4   11:return          
	}
}
