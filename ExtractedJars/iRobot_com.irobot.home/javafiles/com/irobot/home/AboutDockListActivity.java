// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.DockEvacuationLifetimeData;
import com.irobot.core.HistoryDataState;
import com.irobot.core.HistoryUIService;
import com.irobot.core.HistoryUIServiceData;
import com.irobot.core.HistoryUIServiceDataCallback;
import com.irobot.core.RegistrationService;
import com.irobot.core.ViewId;
import com.irobot.home.b.a;
import com.irobot.home.model.k;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.androidannotations.a.a.a.b;

// Referenced classes of package com.irobot.home:
//			BaseToolbarFragmentActivity

public class AboutDockListActivity extends BaseToolbarFragmentActivity
{

	public AboutDockListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BaseToolbarFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class AboutDockListActivity>
	//    4    7:invokevirtual   #35  <Method String Class.getSimpleName()>
	//    5   10:putfield        #37  <Field String f>
	//    6   13:aload_0         
	//    7   14:ldc2w           #38  <Long 1000L>
	//    8   17:putfield        #41  <Field long g>
		k = ((HistoryUIServiceDataCallback) (new HistoryUIServiceDataCallback() {

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
			//    6   14:ifeq            67
					HistoryDataState historydatastate = (HistoryDataState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class HistoryDataState>
			//   10   26:astore_3        
					o.a(com.irobot.home.AboutDockListActivity.a(a), historydatastate.name());
			//   11   27:aload_0         
			//   12   28:getfield        #12  <Field AboutDockListActivity a>
			//   13   31:invokestatic    #45  <Method String com.irobot.home.AboutDockListActivity.a(AboutDockListActivity)>
			//   14   34:aload_3         
			//   15   35:invokevirtual   #49  <Method String HistoryDataState.name()>
			//   16   38:invokestatic    #54  <Method void o.a(String, String)>
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
								a[HistoryDataState.DockEvacuation.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field HistoryDataState HistoryDataState.DockEvacuation>
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
			//*  17   41:getstatic       #59  <Field int[] com.irobot.home.AboutDockListActivity$3.a>
			//*  18   44:aload_3         
			//*  19   45:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
			//*  20   48:iaload          
			//*  21   49:iconst_1        
			//*  22   50:icmpeq          56
			//*  23   53:goto            8
						a.a(historyuiservicedata);
			//   24   56:aload_0         
			//   25   57:getfield        #12  <Field AboutDockListActivity a>
			//   26   60:aload_1         
			//   27   61:invokevirtual   #65  <Method void com.irobot.home.AboutDockListActivity.a(HistoryUIServiceData)>
				} while(true);
			//   28   64:goto            8
			//   29   67:return          
			}

			final AboutDockListActivity a;

			
			{
				a = AboutDockListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field AboutDockListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    9   20:aload_0         
	//   10   21:new             #6   <Class AboutDockListActivity$1>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #44  <Method void AboutDockListActivity$1(AboutDockListActivity)>
	//   14   29:putfield        #46  <Field HistoryUIServiceDataCallback k>
	//   15   32:return          
	}

	static String a(AboutDockListActivity aboutdocklistactivity)
	{
		return aboutdocklistactivity.f;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String f>
	//    2    4:areturn         
	}

	private void g()
	{
		i = new a(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #50  <Class a>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #53  <Method void a(android.content.Context)>
	//    5    9:putfield        #55  <Field a i>
		b.setAdapter(((android.support.v7.widget.RecyclerView.a) (i)));
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field RecyclerView b>
	//    8   16:aload_0         
	//    9   17:getfield        #55  <Field a i>
	//   10   20:invokevirtual   #63  <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		b.setLayoutManager(((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((android.content.Context) (this))))));
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field RecyclerView b>
	//   13   27:new             #65  <Class LinearLayoutManager>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #66  <Method void LinearLayoutManager(android.content.Context)>
	//   17   35:invokevirtual   #70  <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		b.setHasFixedSize(true);
	//   18   38:aload_0         
	//   19   39:getfield        #57  <Field RecyclerView b>
	//   20   42:iconst_1        
	//   21   43:invokevirtual   #74  <Method void RecyclerView.setHasFixedSize(boolean)>
	//   22   46:return          
	}

	void a(HistoryUIServiceData historyuiservicedata)
	{
		if(!historyuiservicedata.getDockEvacuationLifeTimeData().isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #81  <Method ArrayList HistoryUIServiceData.getDockEvacuationLifeTimeData()>
	//*   2    4:invokevirtual   #87  <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            101
		{
			i.b();
	//    4   10:aload_0         
	//    5   11:getfield        #55  <Field a i>
	//    6   14:invokevirtual   #89  <Method void a.b()>
			DockEvacuationLifetimeData dockevacuationlifetimedata;
			for(historyuiservicedata = ((HistoryUIServiceData) (historyuiservicedata.getDockEvacuationLifeTimeData().iterator())); ((Iterator) (historyuiservicedata)).hasNext(); a(dockevacuationlifetimedata.getDockId()))
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #81  <Method ArrayList HistoryUIServiceData.getDockEvacuationLifeTimeData()>
	//*   9   21:invokevirtual   #93  <Method Iterator ArrayList.iterator()>
	//*  10   24:astore_1        
	//*  11   25:aload_1         
	//*  12   26:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            94
			{
				dockevacuationlifetimedata = (DockEvacuationLifetimeData)((Iterator) (historyuiservicedata)).next();
	//   14   34:aload_1         
	//   15   35:invokeinterface #102 <Method Object Iterator.next()>
	//   16   40:checkcast       #104 <Class DockEvacuationLifetimeData>
	//   17   43:astore_2        
				i.a(new k(dockevacuationlifetimedata.getDockId(), dockevacuationlifetimedata.getDockVersion(), new Date((long)dockevacuationlifetimedata.getLastUpdateDate() * 1000L), ((String) (null))));
	//   18   44:aload_0         
	//   19   45:getfield        #55  <Field a i>
	//   20   48:new             #106 <Class k>
	//   21   51:dup             
	//   22   52:aload_2         
	//   23   53:invokevirtual   #109 <Method String DockEvacuationLifetimeData.getDockId()>
	//   24   56:aload_2         
	//   25   57:invokevirtual   #112 <Method String DockEvacuationLifetimeData.getDockVersion()>
	//   26   60:new             #114 <Class Date>
	//   27   63:dup             
	//   28   64:aload_2         
	//   29   65:invokevirtual   #118 <Method int DockEvacuationLifetimeData.getLastUpdateDate()>
	//   30   68:i2l             
	//   31   69:ldc2w           #38  <Long 1000L>
	//   32   72:lmul            
	//   33   73:invokespecial   #121 <Method void Date(long)>
	//   34   76:aconst_null     
	//   35   77:invokespecial   #124 <Method void k(String, String, Date, String)>
	//   36   80:invokevirtual   #127 <Method void a.a(k)>
			}

	//   37   83:aload_0         
	//   38   84:aload_2         
	//   39   85:invokevirtual   #109 <Method String DockEvacuationLifetimeData.getDockId()>
	//   40   88:invokevirtual   #130 <Method void a(String)>
	//*  41   91:goto            25
			i.e();
	//   42   94:aload_0         
	//   43   95:getfield        #55  <Field a i>
	//   44   98:invokevirtual   #133 <Method void a.e()>
		}
	//   45  101:return          
	}

	protected void a(String s)
	{
		String s1 = Assembler.getInstance().getRegistrationService().getProductSerialNumber(s);
	//    0    0:invokestatic    #139 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #143 <Method RegistrationService Assembler.getRegistrationService()>
	//    2    6:aload_1         
	//    3    7:invokevirtual   #149 <Method String RegistrationService.getProductSerialNumber(String)>
	//    4   10:astore_2        
		if(!isFinishing() && !isDestroyed())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #152 <Method boolean isFinishing()>
	//*   7   15:ifne            31
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #155 <Method boolean isDestroyed()>
	//*  10   22:ifne            31
			a(s, s1);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #158 <Method void a(String, String)>
	//   15   31:return          
	}

	protected void a(String s, String s1)
	{
		i.a(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field a i>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #159 <Method void a.a(String, String)>
	//    5    9:return          
	}

	protected void b(String s)
	{
		s = ((String) (j.getRobotErrorHelp(com.irobot.home.util.j.a(Locale.getDefault()), com.irobot.home.util.j.h(((android.content.Context) (this))), s)));
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field CustomerCareRestClient j>
	//    2    4:invokestatic    #167 <Method Locale Locale.getDefault()>
	//    3    7:invokestatic    #172 <Method String j.a(Locale)>
	//    4   10:aload_0         
	//    5   11:invokestatic    #175 <Method String j.h(android.content.Context)>
	//    6   14:aload_1         
	//    7   15:invokeinterface #181 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//    8   20:astore_1        
		if(s != null && ((RobotErrorHelpContentList) (s)).otherContent != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          88
	//*  11   25:aload_1         
	//*  12   26:getfield        #187 <Field List RobotErrorHelpContentList.otherContent>
	//*  13   29:ifnonnull       35
	//*  14   32:goto            88
		{
			s = ((String) (((RobotErrorHelpContentList) (s)).otherContent.iterator()));
	//   15   35:aload_1         
	//   16   36:getfield        #187 <Field List RobotErrorHelpContentList.otherContent>
	//   17   39:invokeinterface #190 <Method Iterator List.iterator()>
	//   18   44:astore_1        
			do
			{
				if(!((Iterator) (s)).hasNext())
					break;
	//   19   45:aload_1         
	//   20   46:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   21   51:ifeq            87
				RobotErrorHelpContent roboterrorhelpcontent = (RobotErrorHelpContent)((Iterator) (s)).next();
	//   22   54:aload_1         
	//   23   55:invokeinterface #102 <Method Object Iterator.next()>
	//   24   60:checkcast       #192 <Class RobotErrorHelpContent>
	//   25   63:astore_2        
				if(!"Serial_number".equalsIgnoreCase(roboterrorhelpcontent.id))
					continue;
	//   26   64:ldc1            #194 <String "Serial_number">
	//   27   66:aload_2         
	//   28   67:getfield        #197 <Field String RobotErrorHelpContent.id>
	//   29   70:invokevirtual   #203 <Method boolean String.equalsIgnoreCase(String)>
	//   30   73:ifeq            45
				i.a(roboterrorhelpcontent.content);
	//   31   76:aload_0         
	//   32   77:getfield        #55  <Field a i>
	//   33   80:aload_2         
	//   34   81:getfield        #206 <Field String RobotErrorHelpContent.content>
	//   35   84:invokevirtual   #207 <Method void a.a(String)>
				break;
			} while(true);
			return;
	//   36   87:return          
		} else
		{
			o.d(f, "Retrieved help content but was null.");
	//   37   88:aload_0         
	//   38   89:getfield        #37  <Field String f>
	//   39   92:ldc1            #209 <String "Retrieved help content but was null.">
	//   40   94:invokestatic    #214 <Method void o.d(String, String)>
			return;
	//   41   97:return          
		}
	}

	protected void e()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #216 <Method void g()>
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    2    4:aload_0         
	//    3    5:getfield        #218 <Field String a>
	//    4    8:invokestatic    #221 <Method com.irobot.home.model.a j.a(String)>
	//    5   11:invokevirtual   #226 <Method AssetInfo com.irobot.home.model.a.a()>
	//    6   14:astore_1        
		h = Assembler.getInstance().getHistoryUIService(assetinfo.getAssetId());
	//    7   15:aload_0         
	//    8   16:invokestatic    #139 <Method Assembler Assembler.getInstance()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #232 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   11   23:invokevirtual   #236 <Method HistoryUIService Assembler.getHistoryUIService(com.irobot.core.AssetId)>
	//   12   26:putfield        #238 <Field HistoryUIService h>
		j = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:invokestatic    #241 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   16   34:putfield        #161 <Field CustomerCareRestClient j>
		j.setRestErrorHandler(new b() {

			public void onRestClientExceptionThrown(org.c.b.b b1)
			{
				String s = com.irobot.home.AboutDockListActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AboutDockListActivity a>
			//    2    4:invokestatic    #25  <Method String com.irobot.home.AboutDockListActivity.a(AboutDockListActivity)>
			//    3    7:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
			//    4    8:new             #27  <Class StringBuilder>
			//    5   11:dup             
			//    6   12:invokespecial   #28  <Method void StringBuilder()>
			//    7   15:astore_3        
				stringbuilder.append("Customer care rest client exception: ");
			//    8   16:aload_3         
			//    9   17:ldc1            #30  <String "Customer care rest client exception: ">
			//   10   19:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
			//   11   22:pop             
				stringbuilder.append(b1.getLocalizedMessage());
			//   12   23:aload_3         
			//   13   24:aload_1         
			//   14   25:invokevirtual   #40  <Method String org.c.b.b.getLocalizedMessage()>
			//   15   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
			//   16   31:pop             
				o.e(s, stringbuilder.toString());
			//   17   32:aload_2         
			//   18   33:aload_3         
			//   19   34:invokevirtual   #43  <Method String StringBuilder.toString()>
			//   20   37:invokestatic    #48  <Method void o.e(String, String)>
			//   21   40:return          
			}

			final AboutDockListActivity a;

			
			{
				a = AboutDockListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AboutDockListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   17   37:aload_0         
	//   18   38:getfield        #161 <Field CustomerCareRestClient j>
	//   19   41:new             #8   <Class AboutDockListActivity$2>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:invokespecial   #242 <Method void AboutDockListActivity$2(AboutDockListActivity)>
	//   23   49:invokeinterface #246 <Method void CustomerCareRestClient.setRestErrorHandler(b)>
		b(assetinfo.getSku());
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:invokevirtual   #249 <Method String AssetInfo.getSku()>
	//   27   59:invokevirtual   #251 <Method void b(String)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.EvacDockAboutDock, assetinfo);
	//   28   62:invokestatic    #256 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   29   65:getstatic       #262 <Field ViewId ViewId.EvacDockAboutDock>
	//   30   68:aload_1         
	//   31   69:invokevirtual   #266 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   32   72:return          
	}

	protected void f()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method void finish()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #273 <Method void BaseToolbarFragmentActivity.onCreate(Bundle)>
		a(0x7f0f0025, ((ArrayList) (null)), 0x7f10020f, 0x7f06005a);
	//    3    5:aload_0         
	//    4    6:ldc2            #274 <Int 0x7f0f0025>
	//    5    9:aconst_null     
	//    6   10:ldc2            #275 <Int 0x7f10020f>
	//    7   13:ldc2            #276 <Int 0x7f06005a>
	//    8   16:invokevirtual   #279 <Method void a(int, ArrayList, int, int)>
		b(0x7f0f08c3, ((ArrayList) (null)));
	//    9   19:aload_0         
	//   10   20:ldc2            #280 <Int 0x7f0f08c3>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #283 <Method void b(int, ArrayList)>
		a(true, 0);
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #286 <Method void a(boolean, int)>
		a(true);
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #288 <Method void a(boolean)>
	//   20   38:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #291 <Method void BaseToolbarFragmentActivity.onStart()>
		h.registerUISubscriber(k);
	//    2    4:aload_0         
	//    3    5:getfield        #238 <Field HistoryUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field HistoryUIServiceDataCallback k>
	//    6   12:invokevirtual   #297 <Method boolean HistoryUIService.registerUISubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #300 <Method void BaseToolbarFragmentActivity.onStop()>
		h.unregisterSubscriber(k);
	//    2    4:aload_0         
	//    3    5:getfield        #238 <Field HistoryUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field HistoryUIServiceDataCallback k>
	//    6   12:invokevirtual   #303 <Method boolean HistoryUIService.unregisterSubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected String a;
	protected RecyclerView b;
	private final String f = ((Class) (com/irobot/home/AboutDockListActivity)).getSimpleName();
	private final long g = 1000L;
	private HistoryUIService h;
	private a i;
	private CustomerCareRestClient j;
	private HistoryUIServiceDataCallback k;
}
