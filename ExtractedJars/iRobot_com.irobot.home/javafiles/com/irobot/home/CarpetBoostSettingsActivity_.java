// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.RelativeLayout;
import com.irobot.core.CarpetBoostMode;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			CarpetBoostSettingsActivity

public final class CarpetBoostSettingsActivity_ extends CarpetBoostSettingsActivity
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
		//    4    7:checkcast       #2   <Class CarpetBoostSettingsActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #37  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #41  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #43  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #43  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #37  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #46  <Field Bundle a>
		//   20   42:invokevirtual   #51  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
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
		//   30   66:getfield        #37  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #46  <Field Bundle a>
		//   34   74:invokestatic    #62  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #55  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #37  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #46  <Field Bundle a>
		//   42   92:invokevirtual   #68  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #70  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #55  <Field Context b>
		//   47  103:invokespecial   #73  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/CarpetBoostSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class CarpetBoostSettingsActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			e = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment e>
		//    8   15:return          
		}
	}


	public CarpetBoostSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void CarpetBoostSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c h>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #18  <Class CarpetBoostSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void CarpetBoostSettingsActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void c.a(b)>
		k();
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void k()>
	//    4    8:return          
	}

	static void a(CarpetBoostSettingsActivity_ carpetboostsettingsactivity_, ArrayList arraylist, CarpetBoostMode carpetboostmode)
	{
		((CarpetBoostSettingsActivity) (carpetboostsettingsactivity_)).com.irobot.home.CarpetBoostSettingsActivity.a(arraylist, carpetboostmode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void com.irobot.home.CarpetBoostSettingsActivity.a(ArrayList, CarpetBoostMode)>
	//    4    6:return          
	}

	private void k()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method Intent getIntent()>
	//    2    4:invokevirtual   #56  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #58  <String "robotBlid">
	//*   8   15:invokevirtual   #64  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #58  <String "robotBlid">
	//   13   25:invokevirtual   #68  <Method String Bundle.getString(String)>
	//   14   28:putfield        #71  <Field String a>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #75  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(ArrayList arraylist, CarpetBoostMode carpetboostmode)
	{
		org.androidannotations.api.b.a("", new Runnable(arraylist, carpetboostmode) {

			public void run()
			{
				com.irobot.home.CarpetBoostSettingsActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field CarpetBoostSettingsActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field ArrayList a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field CarpetBoostMode b>
			//    6   12:invokestatic    #31  <Method void com.irobot.home.CarpetBoostSettingsActivity_.a(CarpetBoostSettingsActivity_, ArrayList, CarpetBoostMode)>
			//    7   15:return          
			}

			final ArrayList a;
			final CarpetBoostMode b;
			final CarpetBoostSettingsActivity_ c;

			
			{
				c = CarpetBoostSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CarpetBoostSettingsActivity_ c>
				a = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ArrayList a>
				b = carpetboostmode;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field CarpetBoostMode b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #79  <String "">
	//    1    2:new             #16  <Class CarpetBoostSettingsActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #81  <Method void CarpetBoostSettingsActivity_$4(CarpetBoostSettingsActivity_, ArrayList, CarpetBoostMode)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #86  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (RelativeLayout)a1.a(0x7f090059);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #89  <Int 0x7f090059>
	//    3    4:invokeinterface #91  <Method View a.a(int)>
	//    4    9:checkcast       #93  <Class RelativeLayout>
	//    5   12:putfield        #97  <Field RelativeLayout b>
		c = (RelativeLayout)a1.a(0x7f0902f3);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #98  <Int 0x7f0902f3>
	//    9   19:invokeinterface #91  <Method View a.a(int)>
	//   10   24:checkcast       #93  <Class RelativeLayout>
	//   11   27:putfield        #101 <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f090160);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #102 <Int 0x7f090160>
	//   15   34:invokeinterface #91  <Method View a.a(int)>
	//   16   39:checkcast       #93  <Class RelativeLayout>
	//   17   42:putfield        #105 <Field RelativeLayout d>
		if(b != null)
	//*  18   45:aload_0         
	//*  19   46:getfield        #97  <Field RelativeLayout b>
	//*  20   49:ifnull          67
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CarpetBoostSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CarpetBoostSettingsActivity_.f()>
				//    3    7:return          
				}

				final CarpetBoostSettingsActivity_ a;

			
			{
				a = CarpetBoostSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CarpetBoostSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   52:aload_0         
	//   22   53:getfield        #97  <Field RelativeLayout b>
	//   23   56:new             #10  <Class CarpetBoostSettingsActivity_$1>
	//   24   59:dup             
	//   25   60:aload_0         
	//   26   61:invokespecial   #108 <Method void CarpetBoostSettingsActivity_$1(CarpetBoostSettingsActivity_)>
	//   27   64:invokevirtual   #112 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(c != null)
	//*  28   67:aload_0         
	//*  29   68:getfield        #101 <Field RelativeLayout c>
	//*  30   71:ifnull          89
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CarpetBoostSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CarpetBoostSettingsActivity_.g()>
				//    3    7:return          
				}

				final CarpetBoostSettingsActivity_ a;

			
			{
				a = CarpetBoostSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CarpetBoostSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   31   74:aload_0         
	//   32   75:getfield        #101 <Field RelativeLayout c>
	//   33   78:new             #12  <Class CarpetBoostSettingsActivity_$2>
	//   34   81:dup             
	//   35   82:aload_0         
	//   36   83:invokespecial   #113 <Method void CarpetBoostSettingsActivity_$2(CarpetBoostSettingsActivity_)>
	//   37   86:invokevirtual   #112 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  38   89:aload_0         
	//*  39   90:getfield        #105 <Field RelativeLayout d>
	//*  40   93:ifnull          111
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CarpetBoostSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CarpetBoostSettingsActivity_.h()>
				//    3    7:return          
				}

				final CarpetBoostSettingsActivity_ a;

			
			{
				a = CarpetBoostSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CarpetBoostSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   41   96:aload_0         
	//   42   97:getfield        #105 <Field RelativeLayout d>
	//   43  100:new             #14  <Class CarpetBoostSettingsActivity_$3>
	//   44  103:dup             
	//   45  104:aload_0         
	//   46  105:invokespecial   #114 <Method void CarpetBoostSettingsActivity_$3(CarpetBoostSettingsActivity_)>
	//   47  108:invokevirtual   #112 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   48  111:aload_0         
	//   49  112:invokevirtual   #117 <Method void e()>
	//   50  115:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c h>
	//    2    4:invokestatic    #121 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #123 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #125 <Method void CarpetBoostSettingsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #121 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0034);
	//   13   23:aload_0         
	//   14   24:ldc1            #126 <Int 0x7f0b0034>
	//   15   26:invokevirtual   #130 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #131 <Method void CarpetBoostSettingsActivity.setContentView(int)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #133 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void CarpetBoostSettingsActivity.setContentView(View)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #133 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #139 <Method void CarpetBoostSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #133 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void CarpetBoostSettingsActivity.setIntent(Intent)>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #42  <Method void k()>
	//    5    9:return          
	}

	private final c h = new c();
}
