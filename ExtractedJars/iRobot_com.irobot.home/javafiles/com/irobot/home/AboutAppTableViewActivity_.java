// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			AboutAppTableViewActivity

public final class AboutAppTableViewActivity_ extends AboutAppTableViewActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotSku", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "robotSku">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class AboutAppTableViewActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #37  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #39  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, j, a);
		//   13   29:aload_0         
		//   14   30:getfield        #39  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #31  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #42  <Field Bundle a>
		//   20   42:invokevirtual   #47  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #51  <Field Context b>
		//*  24   52:instanceof      #53  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
		//   26   58:aload_0         
		//   27   59:getfield        #51  <Field Context b>
		//   28   62:checkcast       #53  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #31  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #42  <Field Bundle a>
		//   34   74:invokestatic    #58  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #51  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #31  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #42  <Field Bundle a>
		//   42   92:invokevirtual   #64  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #66  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #51  <Field Context b>
		//   47  103:invokespecial   #68  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/AboutAppTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class AboutAppTableViewActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public AboutAppTableViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AboutAppTableViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c h>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #18  <Class AboutAppTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void AboutAppTableViewActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void i()>
	//    4    8:return          
	}

	static void a(AboutAppTableViewActivity_ aboutapptableviewactivity_)
	{
		((AboutAppTableViewActivity) (aboutapptableviewactivity_)).AboutAppTableViewActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void AboutAppTableViewActivity.h()>
	//    2    4:return          
	}

	static void a(AboutAppTableViewActivity_ aboutapptableviewactivity_, Bitmap bitmap, String s, String s1)
	{
		((AboutAppTableViewActivity) (aboutapptableviewactivity_)).com.irobot.home.AboutAppTableViewActivity.a(bitmap, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #49  <Method void com.irobot.home.AboutAppTableViewActivity.a(Bitmap, String, String)>
	//    5    7:return          
	}

	static void b(AboutAppTableViewActivity_ aboutapptableviewactivity_)
	{
		((AboutAppTableViewActivity) (aboutapptableviewactivity_)).AboutAppTableViewActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void AboutAppTableViewActivity.g()>
	//    2    4:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Intent getIntent()>
	//    2    4:invokevirtual   #63  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotSku"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #65  <String "robotSku">
	//*   8   15:invokevirtual   #71  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			g = bundle.getString("robotSku");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #65  <String "robotSku">
	//   13   25:invokevirtual   #75  <Method String Bundle.getString(String)>
	//   14   28:putfield        #78  <Field String g>
	//   15   31:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(Bitmap bitmap, String s, String s1)
	{
		org.androidannotations.api.b.a("", new Runnable(bitmap, s, s1) {

			public void run()
			{
				com.irobot.home.AboutAppTableViewActivity_.a(d, a, b, c);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AboutAppTableViewActivity_ d>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field Bitmap a>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field String b>
			//    6   12:aload_0         
			//    7   13:getfield        #27  <Field String c>
			//    8   16:invokestatic    #34  <Method void com.irobot.home.AboutAppTableViewActivity_.a(AboutAppTableViewActivity_, Bitmap, String, String)>
			//    9   19:return          
			}

			final Bitmap a;
			final String b;
			final String c;
			final AboutAppTableViewActivity_ d;

			
			{
				d = AboutAppTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AboutAppTableViewActivity_ d>
				a = bitmap;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Bitmap a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String b>
				c = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field String c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
		}
, 0L);
	//    0    0:ldc1            #86  <String "">
	//    1    2:new             #12  <Class AboutAppTableViewActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:invokespecial   #88  <Method void AboutAppTableViewActivity_$2(AboutAppTableViewActivity_, Bitmap, String, String)>
	//    8   13:lconst_0        
	//    9   14:invokestatic    #93  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//   10   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (LinearLayout)a1.a(0x7f0901d4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #95  <Int 0x7f0901d4>
	//    3    4:invokeinterface #97  <Method View a.a(int)>
	//    4    9:checkcast       #99  <Class LinearLayout>
	//    5   12:putfield        #102 <Field LinearLayout a>
		b = (RelativeLayout)a1.a(0x7f090199);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #103 <Int 0x7f090199>
	//    9   19:invokeinterface #97  <Method View a.a(int)>
	//   10   24:checkcast       #105 <Class RelativeLayout>
	//   11   27:putfield        #108 <Field RelativeLayout b>
		c = (RelativeLayout)a1.a(0x7f090485);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #109 <Int 0x7f090485>
	//   15   34:invokeinterface #97  <Method View a.a(int)>
	//   16   39:checkcast       #105 <Class RelativeLayout>
	//   17   42:putfield        #112 <Field RelativeLayout c>
		d = (CustomTextView)a1.a(0x7f0901cc);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #113 <Int 0x7f0901cc>
	//   21   49:invokeinterface #97  <Method View a.a(int)>
	//   22   54:checkcast       #115 <Class CustomTextView>
	//   23   57:putfield        #119 <Field CustomTextView d>
		e = (RelativeLayout)a1.a(0x7f0903de);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #120 <Int 0x7f0903de>
	//   27   64:invokeinterface #97  <Method View a.a(int)>
	//   28   69:checkcast       #105 <Class RelativeLayout>
	//   29   72:putfield        #123 <Field RelativeLayout e>
		if(e != null)
	//*  30   75:aload_0         
	//*  31   76:getfield        #123 <Field RelativeLayout e>
	//*  32   79:ifnull          97
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AboutAppTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.AboutAppTableViewActivity_.e()>
				//    3    7:return          
				}

				final AboutAppTableViewActivity_ a;

			
			{
				a = AboutAppTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AboutAppTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   33   82:aload_0         
	//   34   83:getfield        #123 <Field RelativeLayout e>
	//   35   86:new             #10  <Class AboutAppTableViewActivity_$1>
	//   36   89:dup             
	//   37   90:aload_0         
	//   38   91:invokespecial   #125 <Method void AboutAppTableViewActivity_$1(AboutAppTableViewActivity_)>
	//   39   94:invokevirtual   #129 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		f();
	//   40   97:aload_0         
	//   41   98:invokevirtual   #132 <Method void f()>
	//   42  101:return          
	}

	public void g()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.AboutAppTableViewActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AboutAppTableViewActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.AboutAppTableViewActivity_.b(AboutAppTableViewActivity_)>
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

			final AboutAppTableViewActivity_ a;

			
			{
				a = AboutAppTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AboutAppTableViewActivity_ a>
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
	//    0    0:new             #16  <Class AboutAppTableViewActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #86  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #86  <String "">
	//    6   10:invokespecial   #135 <Method void AboutAppTableViewActivity_$4(AboutAppTableViewActivity_, String, long, String)>
	//    7   13:invokestatic    #140 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	void h()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.AboutAppTableViewActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AboutAppTableViewActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.AboutAppTableViewActivity_.a(AboutAppTableViewActivity_)>
			//    3    7:return          
			}

			final AboutAppTableViewActivity_ a;

			
			{
				a = AboutAppTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AboutAppTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #86  <String "">
	//    1    2:new             #14  <Class AboutAppTableViewActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #141 <Method void AboutAppTableViewActivity_$3(AboutAppTableViewActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #93  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c h>
	//    2    4:invokestatic    #145 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #147 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #149 <Method void AboutAppTableViewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #145 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0022);
	//   13   23:aload_0         
	//   14   24:ldc1            #150 <Int 0x7f0b0022>
	//   15   26:invokevirtual   #154 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #155 <Method void AboutAppTableViewActivity.setContentView(int)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #157 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void AboutAppTableViewActivity.setContentView(View)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #157 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #163 <Method void AboutAppTableViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #157 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #167 <Method void AboutAppTableViewActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #42  <Method void i()>
	//    5    9:return          
	}

	private final c h = new c();
}
