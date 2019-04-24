// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.NetworkDiagnosticEvent;
import com.irobot.core.OnDemandOTAAvailabilityEvent;
import com.irobot.core.TimeoutEvent;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			CheckRemoteConnectionFragment

public final class CheckRemoteConnectionFragment_ extends CheckRemoteConnectionFragment
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public CheckRemoteConnectionFragment a()
		{
			CheckRemoteConnectionFragment_ checkremoteconnectionfragment_ = new CheckRemoteConnectionFragment_();
		//    0    0:new             #7   <Class CheckRemoteConnectionFragment_>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void CheckRemoteConnectionFragment_()>
		//    3    7:astore_1        
			checkremoteconnectionfragment_.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void CheckRemoteConnectionFragment_.setArguments(Bundle)>
			return ((CheckRemoteConnectionFragment) (checkremoteconnectionfragment_));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(int i)
		{
			a.putInt("animationResId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "animationResId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s)
		{
			a.putString("assetId", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "assetId">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public CheckRemoteConnectionFragment_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void CheckRemoteConnectionFragment()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void c()>
	//    6   12:putfield        #36  <Field c f>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method void c.a(b)>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #44  <Method void e()>
	//    4    8:return          
	}

	static void a(CheckRemoteConnectionFragment_ checkremoteconnectionfragment_)
	{
		((CheckRemoteConnectionFragment) (checkremoteconnectionfragment_)).com.irobot.home.fragments.CheckRemoteConnectionFragment.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment.b()>
	//    2    4:return          
	}

	static void a(CheckRemoteConnectionFragment_ checkremoteconnectionfragment_, AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		((CheckRemoteConnectionFragment) (checkremoteconnectionfragment_)).CheckRemoteConnectionFragment.onAssetUpdateAvailabilityEvent(assetupdateavailabilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void CheckRemoteConnectionFragment.onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent)>
	//    3    5:return          
	}

	static void a(CheckRemoteConnectionFragment_ checkremoteconnectionfragment_, NetworkDiagnosticEvent networkdiagnosticevent)
	{
		((CheckRemoteConnectionFragment) (checkremoteconnectionfragment_)).CheckRemoteConnectionFragment.onNetworkDiagnosticEvent(networkdiagnosticevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void CheckRemoteConnectionFragment.onNetworkDiagnosticEvent(NetworkDiagnosticEvent)>
	//    3    5:return          
	}

	static void a(CheckRemoteConnectionFragment_ checkremoteconnectionfragment_, OnDemandOTAAvailabilityEvent ondemandotaavailabilityevent)
	{
		((CheckRemoteConnectionFragment) (checkremoteconnectionfragment_)).CheckRemoteConnectionFragment.onOnDemandOTAAvailabilityEvent(ondemandotaavailabilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void CheckRemoteConnectionFragment.onOnDemandOTAAvailabilityEvent(OnDemandOTAAvailabilityEvent)>
	//    3    5:return          
	}

	static void a(CheckRemoteConnectionFragment_ checkremoteconnectionfragment_, TimeoutEvent timeoutevent)
	{
		((CheckRemoteConnectionFragment) (checkremoteconnectionfragment_)).CheckRemoteConnectionFragment.onTimeoutEvent(timeoutevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void CheckRemoteConnectionFragment.onTimeoutEvent(TimeoutEvent)>
	//    3    5:return          
	}

	static void b(CheckRemoteConnectionFragment_ checkremoteconnectionfragment_)
	{
		((CheckRemoteConnectionFragment) (checkremoteconnectionfragment_)).com.irobot.home.fragments.CheckRemoteConnectionFragment.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment.c()>
	//    2    4:return          
	}

	public static a d()
	{
		return new a();
	//    0    0:new             #22  <Class CheckRemoteConnectionFragment_$a>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void CheckRemoteConnectionFragment_$a()>
	//    3    7:areturn         
	}

	private void e()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          47
		{
			if(bundle.containsKey("assetId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #80  <String "assetId">
	//*   7   12:invokevirtual   #86  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				d = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #80  <String "assetId">
	//   12   22:invokevirtual   #90  <Method String Bundle.getString(String)>
	//   13   25:putfield        #93  <Field String d>
			if(bundle.containsKey("animationResId"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #95  <String "animationResId">
	//*  16   31:invokevirtual   #86  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				e = bundle.getInt("animationResId");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #95  <String "animationResId">
	//   21   41:invokevirtual   #99  <Method int Bundle.getInt(String)>
	//   22   44:putfield        #102 <Field int e>
		}
	//   23   47:return          
	}

	public View a(int i)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field View g>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return g.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #105 <Field View g>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #110 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (TextView)a1.a(0x7f09041b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #114 <Int 0x7f09041b>
	//    3    4:invokeinterface #116 <Method View a.a(int)>
	//    4    9:checkcast       #118 <Class TextView>
	//    5   12:putfield        #121 <Field TextView a>
		b = (TextView)a1.a(0x7f09032d);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #122 <Int 0x7f09032d>
	//    9   19:invokeinterface #116 <Method View a.a(int)>
	//   10   24:checkcast       #118 <Class TextView>
	//   11   27:putfield        #124 <Field TextView b>
		c = (FrameLayout)a1.a(0x7f0903d0);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #125 <Int 0x7f0903d0>
	//   15   34:invokeinterface #116 <Method View a.a(int)>
	//   16   39:checkcast       #127 <Class FrameLayout>
	//   17   42:putfield        #130 <Field FrameLayout c>
		a();
	//   18   45:aload_0         
	//   19   46:invokevirtual   #132 <Method void a()>
	//   20   49:return          
	}

	protected void b()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CheckRemoteConnectionFragment_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(CheckRemoteConnectionFragment_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #30  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #34  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #40  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final CheckRemoteConnectionFragment_ a;

			
			{
				a = CheckRemoteConnectionFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CheckRemoteConnectionFragment_ a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #18  <Class CheckRemoteConnectionFragment_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #134 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #134 <String "">
	//    6   10:invokespecial   #137 <Method void CheckRemoteConnectionFragment_$5(CheckRemoteConnectionFragment_, String, long, String)>
	//    7   13:invokestatic    #142 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void c()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.CheckRemoteConnectionFragment_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CheckRemoteConnectionFragment_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment_.b(CheckRemoteConnectionFragment_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final CheckRemoteConnectionFragment_ a;

			
			{
				a = CheckRemoteConnectionFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CheckRemoteConnectionFragment_ a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #20  <Class CheckRemoteConnectionFragment_$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #134 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #134 <String "">
	//    6   10:invokespecial   #143 <Method void CheckRemoteConnectionFragment_$6(CheckRemoteConnectionFragment_, String, long, String)>
	//    7   13:invokestatic    #142 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		org.androidannotations.api.b.a("", new Runnable(assetupdateavailabilityevent) {

			public void run()
			{
				com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CheckRemoteConnectionFragment_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AssetUpdateAvailabilityEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(CheckRemoteConnectionFragment_, AssetUpdateAvailabilityEvent)>
			//    5   11:return          
			}

			final AssetUpdateAvailabilityEvent a;
			final CheckRemoteConnectionFragment_ b;

			
			{
				b = CheckRemoteConnectionFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CheckRemoteConnectionFragment_ b>
				a = assetupdateavailabilityevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetUpdateAvailabilityEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #134 <String "">
	//    1    2:new             #14  <Class CheckRemoteConnectionFragment_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #146 <Method void CheckRemoteConnectionFragment_$3(CheckRemoteConnectionFragment_, AssetUpdateAvailabilityEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #151 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field c f>
	//    2    4:invokestatic    #156 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #158 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #160 <Method void CheckRemoteConnectionFragment.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #156 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		g = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #164 <Method View CheckRemoteConnectionFragment.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #105 <Field View g>
		if(g == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #105 <Field View g>
	//*   9   15:ifnonnull       30
			g = layoutinflater.inflate(0x7f0b00ad, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #165 <Int 0x7f0b00ad>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #171 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #105 <Field View g>
		return g;
	//   17   30:aload_0         
	//   18   31:getfield        #105 <Field View g>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #174 <Method void CheckRemoteConnectionFragment.onDestroyView()>
		g = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #105 <Field View g>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #121 <Field TextView a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #124 <Field TextView b>
		c = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #130 <Field FrameLayout c>
	//   14   24:return          
	}

	public void onNetworkDiagnosticEvent(NetworkDiagnosticEvent networkdiagnosticevent)
	{
		org.androidannotations.api.b.a("", new Runnable(networkdiagnosticevent) {

			public void run()
			{
				com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CheckRemoteConnectionFragment_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field NetworkDiagnosticEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(CheckRemoteConnectionFragment_, NetworkDiagnosticEvent)>
			//    5   11:return          
			}

			final NetworkDiagnosticEvent a;
			final CheckRemoteConnectionFragment_ b;

			
			{
				b = CheckRemoteConnectionFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CheckRemoteConnectionFragment_ b>
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
, 0L);
	//    0    0:ldc1            #134 <String "">
	//    1    2:new             #16  <Class CheckRemoteConnectionFragment_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #176 <Method void CheckRemoteConnectionFragment_$4(CheckRemoteConnectionFragment_, NetworkDiagnosticEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #151 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onOnDemandOTAAvailabilityEvent(OnDemandOTAAvailabilityEvent ondemandotaavailabilityevent)
	{
		org.androidannotations.api.b.a("", new Runnable(ondemandotaavailabilityevent) {

			public void run()
			{
				com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CheckRemoteConnectionFragment_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field OnDemandOTAAvailabilityEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(CheckRemoteConnectionFragment_, OnDemandOTAAvailabilityEvent)>
			//    5   11:return          
			}

			final OnDemandOTAAvailabilityEvent a;
			final CheckRemoteConnectionFragment_ b;

			
			{
				b = CheckRemoteConnectionFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CheckRemoteConnectionFragment_ b>
				a = ondemandotaavailabilityevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field OnDemandOTAAvailabilityEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #134 <String "">
	//    1    2:new             #12  <Class CheckRemoteConnectionFragment_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #178 <Method void CheckRemoteConnectionFragment_$2(CheckRemoteConnectionFragment_, OnDemandOTAAvailabilityEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #151 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onTimeoutEvent(TimeoutEvent timeoutevent)
	{
		org.androidannotations.api.b.a("", new Runnable(timeoutevent) {

			public void run()
			{
				com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CheckRemoteConnectionFragment_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field TimeoutEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment_.a(CheckRemoteConnectionFragment_, TimeoutEvent)>
			//    5   11:return          
			}

			final TimeoutEvent a;
			final CheckRemoteConnectionFragment_ b;

			
			{
				b = CheckRemoteConnectionFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CheckRemoteConnectionFragment_ b>
				a = timeoutevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TimeoutEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #134 <String "">
	//    1    2:new             #10  <Class CheckRemoteConnectionFragment_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #180 <Method void CheckRemoteConnectionFragment_$1(CheckRemoteConnectionFragment_, TimeoutEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #151 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #184 <Method void CheckRemoteConnectionFragment.onViewCreated(View, Bundle)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #186 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c f = new c();
	private View g;
}
