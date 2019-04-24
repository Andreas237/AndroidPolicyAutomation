// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.irobot.core.OnDemandOTAAvailabilityEvent;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.core.TimeoutEvent;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			SoftwareUpdateAvailableFragment

public final class SoftwareUpdateAvailableFragment_ extends SoftwareUpdateAvailableFragment
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public SoftwareUpdateAvailableFragment a()
		{
			SoftwareUpdateAvailableFragment_ softwareupdateavailablefragment_ = new SoftwareUpdateAvailableFragment_();
		//    0    0:new             #7   <Class SoftwareUpdateAvailableFragment_>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void SoftwareUpdateAvailableFragment_()>
		//    3    7:astore_1        
			softwareupdateavailablefragment_.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void SoftwareUpdateAvailableFragment_.setArguments(Bundle)>
			return ((SoftwareUpdateAvailableFragment) (softwareupdateavailablefragment_));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(OnDemandOTAPathType ondemandotapathtype)
		{
			a.putSerializable("pathType", ((java.io.Serializable) (ondemandotapathtype)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "pathType">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putSerializable(String, java.io.Serializable)>
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


	public SoftwareUpdateAvailableFragment_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void SoftwareUpdateAvailableFragment()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void c()>
	//    6   12:putfield        #32  <Field c i>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void e()>
	//    4    8:return          
	}

	static void a(SoftwareUpdateAvailableFragment_ softwareupdateavailablefragment_, OnDemandOTAAvailabilityEvent ondemandotaavailabilityevent)
	{
		((SoftwareUpdateAvailableFragment) (softwareupdateavailablefragment_)).SoftwareUpdateAvailableFragment.onOnDemandOTAAvailabilityEvent(ondemandotaavailabilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void SoftwareUpdateAvailableFragment.onOnDemandOTAAvailabilityEvent(OnDemandOTAAvailabilityEvent)>
	//    3    5:return          
	}

	static void a(SoftwareUpdateAvailableFragment_ softwareupdateavailablefragment_, TimeoutEvent timeoutevent)
	{
		((SoftwareUpdateAvailableFragment) (softwareupdateavailablefragment_)).SoftwareUpdateAvailableFragment.onTimeoutEvent(timeoutevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void SoftwareUpdateAvailableFragment.onTimeoutEvent(TimeoutEvent)>
	//    3    5:return          
	}

	public static a d()
	{
		return new a();
	//    0    0:new             #18  <Class SoftwareUpdateAvailableFragment_$a>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void SoftwareUpdateAvailableFragment_$a()>
	//    3    7:areturn         
	}

	private void e()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          50
		{
			if(bundle.containsKey("assetId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #59  <String "assetId">
	//*   7   12:invokevirtual   #65  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #59  <String "assetId">
	//   12   22:invokevirtual   #69  <Method String Bundle.getString(String)>
	//   13   25:putfield        #72  <Field String a>
			if(bundle.containsKey("pathType"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #74  <String "pathType">
	//*  16   31:invokevirtual   #65  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            50
				b = (OnDemandOTAPathType)bundle.getSerializable("pathType");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #74  <String "pathType">
	//   21   41:invokevirtual   #78  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   22   44:checkcast       #80  <Class OnDemandOTAPathType>
	//   23   47:putfield        #84  <Field OnDemandOTAPathType b>
		}
	//   24   50:return          
	}

	public View a(int k)
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field View j>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return j.findViewById(k);
	//    5    9:aload_0         
	//    6   10:getfield        #87  <Field View j>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #92  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (TextView)a1.a(0x7f090471);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #96  <Int 0x7f090471>
	//    3    4:invokeinterface #98  <Method View a.a(int)>
	//    4    9:checkcast       #100 <Class TextView>
	//    5   12:putfield        #104 <Field TextView c>
		d = (Button)a1.a(0x7f090408);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #105 <Int 0x7f090408>
	//    9   19:invokeinterface #98  <Method View a.a(int)>
	//   10   24:checkcast       #107 <Class Button>
	//   11   27:putfield        #110 <Field Button d>
		e = (TextView)a1.a(0x7f090477);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #111 <Int 0x7f090477>
	//   15   34:invokeinterface #98  <Method View a.a(int)>
	//   16   39:checkcast       #100 <Class TextView>
	//   17   42:putfield        #113 <Field TextView e>
		f = (ProgressBar)a1.a(0x7f090223);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #114 <Int 0x7f090223>
	//   21   49:invokeinterface #98  <Method View a.a(int)>
	//   22   54:checkcast       #116 <Class ProgressBar>
	//   23   57:putfield        #120 <Field ProgressBar f>
		if(d != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #110 <Field Button d>
	//*  26   64:ifnull          82
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field SoftwareUpdateAvailableFragment_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.SoftwareUpdateAvailableFragment_.b()>
				//    3    7:return          
				}

				final SoftwareUpdateAvailableFragment_ a;

			
			{
				a = SoftwareUpdateAvailableFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SoftwareUpdateAvailableFragment_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   27   67:aload_0         
	//   28   68:getfield        #110 <Field Button d>
	//   29   71:new             #10  <Class SoftwareUpdateAvailableFragment_$1>
	//   30   74:dup             
	//   31   75:aload_0         
	//   32   76:invokespecial   #123 <Method void SoftwareUpdateAvailableFragment_$1(SoftwareUpdateAvailableFragment_)>
	//   33   79:invokevirtual   #127 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  34   82:aload_0         
	//*  35   83:getfield        #113 <Field TextView e>
	//*  36   86:ifnull          104
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.c();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field SoftwareUpdateAvailableFragment_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.SoftwareUpdateAvailableFragment_.c()>
				//    3    7:return          
				}

				final SoftwareUpdateAvailableFragment_ a;

			
			{
				a = SoftwareUpdateAvailableFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SoftwareUpdateAvailableFragment_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   37   89:aload_0         
	//   38   90:getfield        #113 <Field TextView e>
	//   39   93:new             #12  <Class SoftwareUpdateAvailableFragment_$2>
	//   40   96:dup             
	//   41   97:aload_0         
	//   42   98:invokespecial   #128 <Method void SoftwareUpdateAvailableFragment_$2(SoftwareUpdateAvailableFragment_)>
	//   43  101:invokevirtual   #129 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   44  104:aload_0         
	//   45  105:invokevirtual   #131 <Method void a()>
	//   46  108:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field c i>
	//    2    4:invokestatic    #135 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #137 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #139 <Method void SoftwareUpdateAvailableFragment.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #135 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		j = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #143 <Method View SoftwareUpdateAvailableFragment.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #87  <Field View j>
		if(j == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #87  <Field View j>
	//*   9   15:ifnonnull       30
			j = layoutinflater.inflate(0x7f0b00dc, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #144 <Int 0x7f0b00dc>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #150 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #87  <Field View j>
		return j;
	//   17   30:aload_0         
	//   18   31:getfield        #87  <Field View j>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #153 <Method void SoftwareUpdateAvailableFragment.onDestroyView()>
		j = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #87  <Field View j>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #104 <Field TextView c>
		d = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #110 <Field Button d>
		e = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #113 <Field TextView e>
		f = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #120 <Field ProgressBar f>
	//   17   29:return          
	}

	public void onOnDemandOTAAvailabilityEvent(OnDemandOTAAvailabilityEvent ondemandotaavailabilityevent)
	{
		org.androidannotations.api.b.a("", new Runnable(ondemandotaavailabilityevent) {

			public void run()
			{
				com.irobot.home.fragments.SoftwareUpdateAvailableFragment_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field SoftwareUpdateAvailableFragment_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field OnDemandOTAAvailabilityEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.SoftwareUpdateAvailableFragment_.a(SoftwareUpdateAvailableFragment_, OnDemandOTAAvailabilityEvent)>
			//    5   11:return          
			}

			final OnDemandOTAAvailabilityEvent a;
			final SoftwareUpdateAvailableFragment_ b;

			
			{
				b = SoftwareUpdateAvailableFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SoftwareUpdateAvailableFragment_ b>
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
	//    0    0:ldc1            #156 <String "">
	//    1    2:new             #16  <Class SoftwareUpdateAvailableFragment_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #158 <Method void SoftwareUpdateAvailableFragment_$4(SoftwareUpdateAvailableFragment_, OnDemandOTAAvailabilityEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #163 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onTimeoutEvent(TimeoutEvent timeoutevent)
	{
		org.androidannotations.api.b.a("", new Runnable(timeoutevent) {

			public void run()
			{
				com.irobot.home.fragments.SoftwareUpdateAvailableFragment_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field SoftwareUpdateAvailableFragment_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field TimeoutEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.fragments.SoftwareUpdateAvailableFragment_.a(SoftwareUpdateAvailableFragment_, TimeoutEvent)>
			//    5   11:return          
			}

			final TimeoutEvent a;
			final SoftwareUpdateAvailableFragment_ b;

			
			{
				b = SoftwareUpdateAvailableFragment_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SoftwareUpdateAvailableFragment_ b>
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
	//    0    0:ldc1            #156 <String "">
	//    1    2:new             #14  <Class SoftwareUpdateAvailableFragment_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #166 <Method void SoftwareUpdateAvailableFragment_$3(SoftwareUpdateAvailableFragment_, TimeoutEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #163 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #170 <Method void SoftwareUpdateAvailableFragment.onViewCreated(View, Bundle)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #172 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c i = new c();
	private View j;
}
