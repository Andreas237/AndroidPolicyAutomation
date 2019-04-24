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
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaMoreTableViewActivity

public final class BraavaMoreTableViewActivity_ extends BraavaMoreTableViewActivity
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
		//    4    7:checkcast       #2   <Class BraavaMoreTableViewActivity_$a>
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
			super(((Context) (fragment.getActivity())), com/irobot/home/BraavaMoreTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class BraavaMoreTableViewActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}
	}


	public BraavaMoreTableViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void BraavaMoreTableViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c e>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #14  <Class BraavaMoreTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void BraavaMoreTableViewActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
		h();
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void h()>
	//    4    8:return          
	}

	private void h()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method Intent getIntent()>
	//    2    4:invokevirtual   #48  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #50  <String "robotBlid">
	//*   8   15:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #50  <String "robotBlid">
	//   13   25:invokevirtual   #60  <Method String Bundle.getString(String)>
	//   14   28:putfield        #63  <Field String a>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #67  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomTextView)a1.a(0x7f0900b4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #71  <Int 0x7f0900b4>
	//    3    4:invokeinterface #73  <Method View a.a(int)>
	//    4    9:checkcast       #75  <Class CustomTextView>
	//    5   12:putfield        #79  <Field CustomTextView b>
		c = a1.a(0x7f0900b3);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #80  <Int 0x7f0900b3>
	//    9   19:invokeinterface #73  <Method View a.a(int)>
	//   10   24:putfield        #84  <Field View c>
		d = a1.a(0x7f0902fd);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #85  <Int 0x7f0902fd>
	//   14   31:invokeinterface #73  <Method View a.a(int)>
	//   15   36:putfield        #88  <Field View d>
		View view = a1.a(0x7f0901be);
	//   16   39:aload_1         
	//   17   40:ldc1            #89  <Int 0x7f0901be>
	//   18   42:invokeinterface #73  <Method View a.a(int)>
	//   19   47:astore_2        
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f0903c7)));
	//   20   48:aload_1         
	//   21   49:ldc1            #90  <Int 0x7f0903c7>
	//   22   51:invokeinterface #73  <Method View a.a(int)>
	//   23   56:astore_1        
		if(view != null)
	//*  24   57:aload_2         
	//*  25   58:ifnull          73
			view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view1)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaMoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaMoreTableViewActivity_.f()>
				//    3    7:return          
				}

				final BraavaMoreTableViewActivity_ a;

			
			{
				a = BraavaMoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaMoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   26   61:aload_2         
	//   27   62:new             #10  <Class BraavaMoreTableViewActivity_$1>
	//   28   65:dup             
	//   29   66:aload_0         
	//   30   67:invokespecial   #93  <Method void BraavaMoreTableViewActivity_$1(BraavaMoreTableViewActivity_)>
	//   31   70:invokevirtual   #99  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//*  32   73:aload_1         
	//*  33   74:ifnull          89
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view1)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaMoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaMoreTableViewActivity_.g()>
				//    3    7:return          
				}

				final BraavaMoreTableViewActivity_ a;

			
			{
				a = BraavaMoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaMoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   34   77:aload_1         
	//   35   78:new             #12  <Class BraavaMoreTableViewActivity_$2>
	//   36   81:dup             
	//   37   82:aload_0         
	//   38   83:invokespecial   #100 <Method void BraavaMoreTableViewActivity_$2(BraavaMoreTableViewActivity_)>
	//   39   86:invokevirtual   #99  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   40   89:aload_0         
	//   41   90:invokevirtual   #102 <Method void e()>
	//   42   93:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c e>
	//    2    4:invokestatic    #106 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #108 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #110 <Method void BraavaMoreTableViewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #106 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0054);
	//   13   23:aload_0         
	//   14   24:ldc1            #111 <Int 0x7f0b0054>
	//   15   26:invokevirtual   #115 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #116 <Method void BraavaMoreTableViewActivity.setContentView(int)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #118 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void BraavaMoreTableViewActivity.setContentView(View)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #118 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #124 <Method void BraavaMoreTableViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c e>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #118 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method void BraavaMoreTableViewActivity.setIntent(Intent)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #38  <Method void h()>
	//    5    9:return          
	}

	private final c e = new c();
}
