// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import com.irobot.core.AccountLoggedOutEvent;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			AccountSettingsActivity

public final class AccountSettingsActivity_ extends AccountSettingsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int k)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, k);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #33  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, k, a);
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #25  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #45  <Field Context b>
		//*  24   52:instanceof      #47  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, k, a);
		//   26   58:aload_0         
		//   27   59:getfield        #45  <Field Context b>
		//   28   62:checkcast       #47  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #25  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/AccountSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class AccountSettingsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public AccountSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AccountSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void c()>
	//    6   12:putfield        #38  <Field c j>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #26  <Class AccountSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void AccountSettingsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(AccountSettingsActivity_ accountsettingsactivity_)
	{
		((AccountSettingsActivity) (accountsettingsactivity_)).AccountSettingsActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void AccountSettingsActivity.j()>
	//    2    4:return          
	}

	static void a(AccountSettingsActivity_ accountsettingsactivity_, int k, int l)
	{
		((AccountSettingsActivity) (accountsettingsactivity_)).com.irobot.home.AccountSettingsActivity.a(k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void com.irobot.home.AccountSettingsActivity.a(int, int)>
	//    4    6:return          
	}

	static void a(AccountSettingsActivity_ accountsettingsactivity_, AccountLoggedOutEvent accountloggedoutevent)
	{
		((AccountSettingsActivity) (accountsettingsactivity_)).AccountSettingsActivity.onAccountLoggedOutEvent(accountloggedoutevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void AccountSettingsActivity.onAccountLoggedOutEvent(AccountLoggedOutEvent)>
	//    3    5:return          
	}

	static void a(AccountSettingsActivity_ accountsettingsactivity_, boolean flag)
	{
		((AccountSettingsActivity) (accountsettingsactivity_)).com.irobot.home.AccountSettingsActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method void com.irobot.home.AccountSettingsActivity.a(boolean)>
	//    3    5:return          
	}

	static void b(AccountSettingsActivity_ accountsettingsactivity_)
	{
		((AccountSettingsActivity) (accountsettingsactivity_)).AccountSettingsActivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void AccountSettingsActivity.i()>
	//    2    4:return          
	}

	public View a(int k)
	{
		return findViewById(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #71  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(int k, int l)
	{
		org.androidannotations.api.b.a("", new Runnable(k, l) {

			public void run()
			{
				com.irobot.home.AccountSettingsActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AccountSettingsActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:aload_0         
			//    5    9:getfield        #23  <Field int b>
			//    6   12:invokestatic    #30  <Method void com.irobot.home.AccountSettingsActivity_.a(AccountSettingsActivity_, int, int)>
			//    7   15:return          
			}

			final int a;
			final int b;
			final AccountSettingsActivity_ c;

			
			{
				c = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AccountSettingsActivity_ c>
				a = k;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				b = l;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #23  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #75  <String "">
	//    1    2:new             #18  <Class AccountSettingsActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:invokespecial   #77  <Method void AccountSettingsActivity_$5(AccountSettingsActivity_, int, int)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #82  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomTextView)a1.a(0x7f09018f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #84  <Int 0x7f09018f>
	//    3    4:invokeinterface #86  <Method View a.a(int)>
	//    4    9:checkcast       #88  <Class CustomTextView>
	//    5   12:putfield        #91  <Field CustomTextView a>
		b = (CustomTextView)a1.a(0x7f090484);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #92  <Int 0x7f090484>
	//    9   19:invokeinterface #86  <Method View a.a(int)>
	//   10   24:checkcast       #88  <Class CustomTextView>
	//   11   27:putfield        #94  <Field CustomTextView b>
		c = (CustomTextView)a1.a(0x7f090483);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #95  <Int 0x7f090483>
	//   15   34:invokeinterface #86  <Method View a.a(int)>
	//   16   39:checkcast       #88  <Class CustomTextView>
	//   17   42:putfield        #98  <Field CustomTextView c>
		d = (Toolbar)a1.a(0x7f09044f);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #99  <Int 0x7f09044f>
	//   21   49:invokeinterface #86  <Method View a.a(int)>
	//   22   54:checkcast       #101 <Class Toolbar>
	//   23   57:putfield        #105 <Field Toolbar d>
		e = a1.a(0x7f0901b5);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #106 <Int 0x7f0901b5>
	//   27   64:invokeinterface #86  <Method View a.a(int)>
	//   28   69:putfield        #110 <Field View e>
		f = (Button)a1.a(0x7f090479);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:ldc1            #111 <Int 0x7f090479>
	//   32   76:invokeinterface #86  <Method View a.a(int)>
	//   33   81:checkcast       #113 <Class Button>
	//   34   84:putfield        #117 <Field Button f>
		g = (Button)a1.a(0x7f090478);
	//   35   87:aload_0         
	//   36   88:aload_1         
	//   37   89:ldc1            #118 <Int 0x7f090478>
	//   38   91:invokeinterface #86  <Method View a.a(int)>
	//   39   96:checkcast       #113 <Class Button>
	//   40   99:putfield        #121 <Field Button g>
		h = (Button)a1.a(0x7f09022a);
	//   41  102:aload_0         
	//   42  103:aload_1         
	//   43  104:ldc1            #122 <Int 0x7f09022a>
	//   44  106:invokeinterface #86  <Method View a.a(int)>
	//   45  111:checkcast       #113 <Class Button>
	//   46  114:putfield        #125 <Field Button h>
		i = (ProgressBar)a1.a(0x7f090223);
	//   47  117:aload_0         
	//   48  118:aload_1         
	//   49  119:ldc1            #126 <Int 0x7f090223>
	//   50  121:invokeinterface #86  <Method View a.a(int)>
	//   51  126:checkcast       #128 <Class ProgressBar>
	//   52  129:putfield        #131 <Field ProgressBar i>
		if(h != null)
	//*  53  132:aload_0         
	//*  54  133:getfield        #125 <Field Button h>
	//*  55  136:ifnull          154
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AccountSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AccountSettingsActivity_.f()>
				//    3    7:return          
				}

				final AccountSettingsActivity_ a;

			
			{
				a = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AccountSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   56  139:aload_0         
	//   57  140:getfield        #125 <Field Button h>
	//   58  143:new             #10  <Class AccountSettingsActivity_$1>
	//   59  146:dup             
	//   60  147:aload_0         
	//   61  148:invokespecial   #133 <Method void AccountSettingsActivity_$1(AccountSettingsActivity_)>
	//   62  151:invokevirtual   #137 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//*  63  154:aload_0         
	//*  64  155:getfield        #117 <Field Button f>
	//*  65  158:ifnull          176
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AccountSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AccountSettingsActivity_.g()>
				//    3    7:return          
				}

				final AccountSettingsActivity_ a;

			
			{
				a = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AccountSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   66  161:aload_0         
	//   67  162:getfield        #117 <Field Button f>
	//   68  165:new             #12  <Class AccountSettingsActivity_$2>
	//   69  168:dup             
	//   70  169:aload_0         
	//   71  170:invokespecial   #138 <Method void AccountSettingsActivity_$2(AccountSettingsActivity_)>
	//   72  173:invokevirtual   #137 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(g != null)
	//*  73  176:aload_0         
	//*  74  177:getfield        #121 <Field Button g>
	//*  75  180:ifnull          198
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AccountSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AccountSettingsActivity_.h()>
				//    3    7:return          
				}

				final AccountSettingsActivity_ a;

			
			{
				a = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AccountSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   76  183:aload_0         
	//   77  184:getfield        #121 <Field Button g>
	//   78  187:new             #14  <Class AccountSettingsActivity_$3>
	//   79  190:dup             
	//   80  191:aload_0         
	//   81  192:invokespecial   #139 <Method void AccountSettingsActivity_$3(AccountSettingsActivity_)>
	//   82  195:invokevirtual   #137 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   83  198:aload_0         
	//   84  199:invokevirtual   #141 <Method void e()>
	//   85  202:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.AccountSettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AccountSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.AccountSettingsActivity_.a(AccountSettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final AccountSettingsActivity_ b;

			
			{
				b = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AccountSettingsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #75  <String "">
	//    1    2:new             #22  <Class AccountSettingsActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #143 <Method void AccountSettingsActivity_$7(AccountSettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #82  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void i()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.AccountSettingsActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccountSettingsActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.AccountSettingsActivity_.b(AccountSettingsActivity_)>
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

			final AccountSettingsActivity_ a;

			
			{
				a = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AccountSettingsActivity_ a>
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
	//    0    0:new             #24  <Class AccountSettingsActivity_$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #75  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #75  <String "">
	//    6   10:invokespecial   #146 <Method void AccountSettingsActivity_$8(AccountSettingsActivity_, String, long, String)>
	//    7   13:invokestatic    #151 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void j()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.AccountSettingsActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AccountSettingsActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.AccountSettingsActivity_.a(AccountSettingsActivity_)>
			//    3    7:return          
			}

			final AccountSettingsActivity_ a;

			
			{
				a = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccountSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #75  <String "">
	//    1    2:new             #20  <Class AccountSettingsActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #152 <Method void AccountSettingsActivity_$6(AccountSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #82  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onAccountLoggedOutEvent(AccountLoggedOutEvent accountloggedoutevent)
	{
		org.androidannotations.api.b.a("", new Runnable(accountloggedoutevent) {

			public void run()
			{
				com.irobot.home.AccountSettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AccountSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AccountLoggedOutEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.AccountSettingsActivity_.a(AccountSettingsActivity_, AccountLoggedOutEvent)>
			//    5   11:return          
			}

			final AccountLoggedOutEvent a;
			final AccountSettingsActivity_ b;

			
			{
				b = AccountSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AccountSettingsActivity_ b>
				a = accountloggedoutevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AccountLoggedOutEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #75  <String "">
	//    1    2:new             #16  <Class AccountSettingsActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #155 <Method void AccountSettingsActivity_$4(AccountSettingsActivity_, AccountLoggedOutEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #82  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(j);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field c j>
	//    2    4:invokestatic    #160 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #162 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #164 <Method void AccountSettingsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #160 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0024);
	//   13   23:aload_0         
	//   14   24:ldc1            #165 <Int 0x7f0b0024>
	//   15   26:invokevirtual   #169 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int k)
	{
		super.setContentView(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #170 <Method void AccountSettingsActivity.setContentView(int)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field c j>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #172 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #175 <Method void AccountSettingsActivity.setContentView(View)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field c j>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #172 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #178 <Method void AccountSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field c j>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #172 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c j = new c();
}
