// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.irobot.core.CurrentConnectionStateEvent;
import com.irobot.core.ResolvedMissionStatusEvent;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaSpotCleanActivity

public final class BraavaSpotCleanActivity_ extends BraavaSpotCleanActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #29  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class BraavaSpotCleanActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #39  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #45  <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #25  <Field Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #25  <Field Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #39  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #48  <Field Bundle a>
		//   20   42:invokevirtual   #51  <Method void Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #55  <Field Context b>
		//*  24   52:instanceof      #57  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #55  <Field Context b>
		//   28   62:checkcast       #57  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #39  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #48  <Field Bundle a>
		//   34   74:invokestatic    #62  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #55  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #39  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #48  <Field Bundle a>
		//   42   92:invokevirtual   #68  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #70  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #55  <Field Context b>
		//   47  103:invokespecial   #73  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/BraavaSpotCleanActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class BraavaSpotCleanActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}
	}


	public BraavaSpotCleanActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BraavaSpotCleanActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c f>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #16  <Class BraavaSpotCleanActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void BraavaSpotCleanActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void g()>
	//    4    8:return          
	}

	static void a(BraavaSpotCleanActivity_ braavaspotcleanactivity_, CurrentConnectionStateEvent currentconnectionstateevent)
	{
		((BraavaSpotCleanActivity) (braavaspotcleanactivity_)).BraavaSpotCleanActivity.onCurrentConnectionStateEvent(currentconnectionstateevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void BraavaSpotCleanActivity.onCurrentConnectionStateEvent(CurrentConnectionStateEvent)>
	//    3    5:return          
	}

	static void a(BraavaSpotCleanActivity_ braavaspotcleanactivity_, ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		((BraavaSpotCleanActivity) (braavaspotcleanactivity_)).BraavaSpotCleanActivity.onResolvedMissionStatusEvent(resolvedmissionstatusevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void BraavaSpotCleanActivity.onResolvedMissionStatusEvent(ResolvedMissionStatusEvent)>
	//    3    5:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method Intent getIntent()>
	//    2    4:invokevirtual   #60  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #62  <String "robotBlid">
	//*   8   15:invokevirtual   #68  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #62  <String "robotBlid">
	//   13   25:invokevirtual   #72  <Method String Bundle.getString(String)>
	//   14   28:putfield        #75  <Field String a>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #79  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomVideoView)a1.a(0x7f0903f9);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #83  <Int 0x7f0903f9>
	//    3    4:invokeinterface #85  <Method View a.a(int)>
	//    4    9:checkcast       #87  <Class CustomVideoView>
	//    5   12:putfield        #91  <Field CustomVideoView b>
		c = (TextView)a1.a(0x7f0903f8);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #92  <Int 0x7f0903f8>
	//    9   19:invokeinterface #85  <Method View a.a(int)>
	//   10   24:checkcast       #94  <Class TextView>
	//   11   27:putfield        #98  <Field TextView c>
		d = (Button)a1.a(0x7f090064);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #99  <Int 0x7f090064>
	//   15   34:invokeinterface #85  <Method View a.a(int)>
	//   16   39:checkcast       #101 <Class Button>
	//   17   42:putfield        #105 <Field Button d>
		if(d != null)
	//*  18   45:aload_0         
	//*  19   46:getfield        #105 <Field Button d>
	//*  20   49:ifnull          67
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaSpotCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaSpotCleanActivity_.f()>
				//    3    7:return          
				}

				final BraavaSpotCleanActivity_ a;

			
			{
				a = BraavaSpotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaSpotCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   52:aload_0         
	//   22   53:getfield        #105 <Field Button d>
	//   23   56:new             #10  <Class BraavaSpotCleanActivity_$1>
	//   24   59:dup             
	//   25   60:aload_0         
	//   26   61:invokespecial   #108 <Method void BraavaSpotCleanActivity_$1(BraavaSpotCleanActivity_)>
	//   27   64:invokevirtual   #112 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   28   67:aload_0         
	//   29   68:invokevirtual   #115 <Method void e()>
	//   30   71:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c f>
	//    2    4:invokestatic    #119 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #121 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #123 <Method void BraavaSpotCleanActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #119 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0031);
	//   13   23:aload_0         
	//   14   24:ldc1            #124 <Int 0x7f0b0031>
	//   15   26:invokevirtual   #128 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void onCurrentConnectionStateEvent(CurrentConnectionStateEvent currentconnectionstateevent)
	{
		org.androidannotations.api.b.a("", new Runnable(currentconnectionstateevent) {

			public void run()
			{
				com.irobot.home.BraavaSpotCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaSpotCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field CurrentConnectionStateEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaSpotCleanActivity_.a(BraavaSpotCleanActivity_, CurrentConnectionStateEvent)>
			//    5   11:return          
			}

			final CurrentConnectionStateEvent a;
			final BraavaSpotCleanActivity_ b;

			
			{
				b = BraavaSpotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaSpotCleanActivity_ b>
				a = currentconnectionstateevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CurrentConnectionStateEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #131 <String "">
	//    1    2:new             #14  <Class BraavaSpotCleanActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #133 <Method void BraavaSpotCleanActivity_$3(BraavaSpotCleanActivity_, CurrentConnectionStateEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #138 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onResolvedMissionStatusEvent(ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		org.androidannotations.api.b.a("", new Runnable(resolvedmissionstatusevent) {

			public void run()
			{
				com.irobot.home.BraavaSpotCleanActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaSpotCleanActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field ResolvedMissionStatusEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaSpotCleanActivity_.a(BraavaSpotCleanActivity_, ResolvedMissionStatusEvent)>
			//    5   11:return          
			}

			final ResolvedMissionStatusEvent a;
			final BraavaSpotCleanActivity_ b;

			
			{
				b = BraavaSpotCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaSpotCleanActivity_ b>
				a = resolvedmissionstatusevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ResolvedMissionStatusEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #131 <String "">
	//    1    2:new             #12  <Class BraavaSpotCleanActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #141 <Method void BraavaSpotCleanActivity_$2(BraavaSpotCleanActivity_, ResolvedMissionStatusEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #138 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #142 <Method void BraavaSpotCleanActivity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #144 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #147 <Method void BraavaSpotCleanActivity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #144 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #150 <Method void BraavaSpotCleanActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #144 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #154 <Method void BraavaSpotCleanActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void g()>
	//    5    9:return          
	}

	private final c f = new c();
}
