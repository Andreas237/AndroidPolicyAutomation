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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			CreateAccountOrLoginActivity, IRobotApplication_

public final class CreateAccountOrLoginActivity_ extends CreateAccountOrLoginActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(boolean flag)
		{
			return (a)super.a("isExistingUser", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "isExistingUser">
		//    2    3:iload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class CreateAccountOrLoginActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
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
				d.startActivityForResult(c, i, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
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
			super(context, com/irobot/home/CreateAccountOrLoginActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class CreateAccountOrLoginActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public CreateAccountOrLoginActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void CreateAccountOrLoginActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c j>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #18  <Class CreateAccountOrLoginActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void CreateAccountOrLoginActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		a = new k(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #38  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #39  <Method void k(Context)>
	//    5    9:putfield        #42  <Field k a>
		c.a(((b) (this)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #45  <Method void c.a(b)>
		f = IRobotApplication_.r();
	//    8   16:aload_0         
	//    9   17:invokestatic    #51  <Method IRobotApplication IRobotApplication_.r()>
	//   10   20:putfield        #55  <Field IRobotApplication f>
		j();
	//   11   23:aload_0         
	//   12   24:invokespecial   #57  <Method void j()>
	//   13   27:return          
	}

	static void a(CreateAccountOrLoginActivity_ createaccountorloginactivity_)
	{
		((CreateAccountOrLoginActivity) (createaccountorloginactivity_)).CreateAccountOrLoginActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void CreateAccountOrLoginActivity.g()>
	//    2    4:return          
	}

	static void b(CreateAccountOrLoginActivity_ createaccountorloginactivity_)
	{
		((CreateAccountOrLoginActivity) (createaccountorloginactivity_)).CreateAccountOrLoginActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void CreateAccountOrLoginActivity.f()>
	//    2    4:return          
	}

	private void j()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method Intent getIntent()>
	//    2    4:invokevirtual   #74  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("isExistingUser"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #76  <String "isExistingUser">
	//*   8   15:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			g = bundle.getBoolean("isExistingUser");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #76  <String "isExistingUser">
	//   13   25:invokevirtual   #85  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #88  <Field boolean g>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #92  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomTextView)a1.a(0x7f090124);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #96  <Int 0x7f090124>
	//    3    4:invokeinterface #98  <Method View a.a(int)>
	//    4    9:checkcast       #100 <Class CustomTextView>
	//    5   12:putfield        #103 <Field CustomTextView b>
		c = (ScrollView)a1.a(0x7f0903ae);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #104 <Int 0x7f0903ae>
	//    9   19:invokeinterface #98  <Method View a.a(int)>
	//   10   24:checkcast       #106 <Class ScrollView>
	//   11   27:putfield        #110 <Field ScrollView c>
		d = (RelativeLayout)a1.a(0x7f0903ab);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #111 <Int 0x7f0903ab>
	//   15   34:invokeinterface #98  <Method View a.a(int)>
	//   16   39:checkcast       #113 <Class RelativeLayout>
	//   17   42:putfield        #117 <Field RelativeLayout d>
		e = (LinearLayout)a1.a(0x7f0900a5);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #118 <Int 0x7f0900a5>
	//   21   49:invokeinterface #98  <Method View a.a(int)>
	//   22   54:checkcast       #120 <Class LinearLayout>
	//   23   57:putfield        #124 <Field LinearLayout e>
		h = (CustomButton)a1.a(0x7f090229);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #125 <Int 0x7f090229>
	//   27   64:invokeinterface #98  <Method View a.a(int)>
	//   28   69:checkcast       #127 <Class CustomButton>
	//   29   72:putfield        #131 <Field CustomButton h>
		i = (CustomButton)a1.a(0x7f090123);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #132 <Int 0x7f090123>
	//   33   79:invokeinterface #98  <Method View a.a(int)>
	//   34   84:checkcast       #127 <Class CustomButton>
	//   35   87:putfield        #135 <Field CustomButton i>
		if(h != null)
	//*  36   90:aload_0         
	//*  37   91:getfield        #131 <Field CustomButton h>
	//*  38   94:ifnull          112
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CreateAccountOrLoginActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CreateAccountOrLoginActivity_.h()>
				//    3    7:return          
				}

				final CreateAccountOrLoginActivity_ a;

			
			{
				a = CreateAccountOrLoginActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CreateAccountOrLoginActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   39   97:aload_0         
	//   40   98:getfield        #131 <Field CustomButton h>
	//   41  101:new             #10  <Class CreateAccountOrLoginActivity_$1>
	//   42  104:dup             
	//   43  105:aload_0         
	//   44  106:invokespecial   #137 <Method void CreateAccountOrLoginActivity_$1(CreateAccountOrLoginActivity_)>
	//   45  109:invokevirtual   #141 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(i != null)
	//*  46  112:aload_0         
	//*  47  113:getfield        #135 <Field CustomButton i>
	//*  48  116:ifnull          134
			i.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CreateAccountOrLoginActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CreateAccountOrLoginActivity_.i()>
				//    3    7:return          
				}

				final CreateAccountOrLoginActivity_ a;

			
			{
				a = CreateAccountOrLoginActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CreateAccountOrLoginActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   49  119:aload_0         
	//   50  120:getfield        #135 <Field CustomButton i>
	//   51  123:new             #12  <Class CreateAccountOrLoginActivity_$2>
	//   52  126:dup             
	//   53  127:aload_0         
	//   54  128:invokespecial   #142 <Method void CreateAccountOrLoginActivity_$2(CreateAccountOrLoginActivity_)>
	//   55  131:invokevirtual   #141 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   56  134:aload_0         
	//   57  135:invokevirtual   #144 <Method void e()>
	//   58  138:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.CreateAccountOrLoginActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field CreateAccountOrLoginActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.CreateAccountOrLoginActivity_.b(CreateAccountOrLoginActivity_)>
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

			final CreateAccountOrLoginActivity_ a;

			
			{
				a = CreateAccountOrLoginActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CreateAccountOrLoginActivity_ a>
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
	//    0    0:new             #16  <Class CreateAccountOrLoginActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #146 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #146 <String "">
	//    6   10:invokespecial   #149 <Method void CreateAccountOrLoginActivity_$4(CreateAccountOrLoginActivity_, String, long, String)>
	//    7   13:invokestatic    #154 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.CreateAccountOrLoginActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CreateAccountOrLoginActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.CreateAccountOrLoginActivity_.a(CreateAccountOrLoginActivity_)>
			//    3    7:return          
			}

			final CreateAccountOrLoginActivity_ a;

			
			{
				a = CreateAccountOrLoginActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CreateAccountOrLoginActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #146 <String "">
	//    1    2:new             #14  <Class CreateAccountOrLoginActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #155 <Method void CreateAccountOrLoginActivity_$3(CreateAccountOrLoginActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #160 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(j);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c j>
	//    2    4:invokestatic    #164 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #166 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #168 <Method void CreateAccountOrLoginActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #164 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0038);
	//   13   23:aload_0         
	//   14   24:ldc1            #169 <Int 0x7f0b0038>
	//   15   26:invokevirtual   #173 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #174 <Method void CreateAccountOrLoginActivity.setContentView(int)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c j>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #176 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #179 <Method void CreateAccountOrLoginActivity.setContentView(View)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c j>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #176 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #182 <Method void CreateAccountOrLoginActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c j>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #176 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #186 <Method void CreateAccountOrLoginActivity.setIntent(Intent)>
		j();
	//    3    5:aload_0         
	//    4    6:invokespecial   #57  <Method void j()>
	//    5    9:return          
	}

	private final c j = new c();
}
