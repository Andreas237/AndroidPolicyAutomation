// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			NotificationSettingsActivity

public final class NotificationSettingsActivity_ extends NotificationSettingsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
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
				d.startActivityForResult(c, i, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
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
			super(context, com/irobot/home/NotificationSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class NotificationSettingsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public NotificationSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void NotificationSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c g>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #18  <Class NotificationSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void NotificationSettingsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(NotificationSettingsActivity_ notificationsettingsactivity_, int i)
	{
		((NotificationSettingsActivity) (notificationsettingsactivity_)).NotificationSettingsActivity.f(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #44  <Method void NotificationSettingsActivity.f(int)>
	//    3    5:return          
	}

	static void a(NotificationSettingsActivity_ notificationsettingsactivity_, CompoundButton compoundbutton, boolean flag)
	{
		((NotificationSettingsActivity) (notificationsettingsactivity_)).NotificationSettingsActivity.onCheckedChanged(compoundbutton, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void NotificationSettingsActivity.onCheckedChanged(CompoundButton, boolean)>
	//    4    6:return          
	}

	static void a(NotificationSettingsActivity_ notificationsettingsactivity_, ArrayList arraylist)
	{
		((NotificationSettingsActivity) (notificationsettingsactivity_)).com.irobot.home.NotificationSettingsActivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void com.irobot.home.NotificationSettingsActivity.a(ArrayList)>
	//    3    5:return          
	}

	static void a(NotificationSettingsActivity_ notificationsettingsactivity_, boolean flag)
	{
		((NotificationSettingsActivity) (notificationsettingsactivity_)).com.irobot.home.NotificationSettingsActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #57  <Method void com.irobot.home.NotificationSettingsActivity.a(boolean)>
	//    3    5:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #61  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(ArrayList arraylist)
	{
		org.androidannotations.api.b.a("", new Runnable(arraylist) {

			public void run()
			{
				com.irobot.home.NotificationSettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field NotificationSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field ArrayList a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.NotificationSettingsActivity_.a(NotificationSettingsActivity_, ArrayList)>
			//    5   11:return          
			}

			final ArrayList a;
			final NotificationSettingsActivity_ b;

			
			{
				b = NotificationSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field NotificationSettingsActivity_ b>
				a = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ArrayList a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #65  <String "">
	//    1    2:new             #10  <Class NotificationSettingsActivity_$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #67  <Method void NotificationSettingsActivity_$1(NotificationSettingsActivity_, ArrayList)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #72  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (RelativeLayout)a1.a(0x7f0900f7);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #75  <Int 0x7f0900f7>
	//    3    4:invokeinterface #77  <Method View a.a(int)>
	//    4    9:checkcast       #79  <Class RelativeLayout>
	//    5   12:putfield        #82  <Field RelativeLayout a>
		b = (RelativeLayout)a1.a(0x7f0900e5);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #83  <Int 0x7f0900e5>
	//    9   19:invokeinterface #77  <Method View a.a(int)>
	//   10   24:checkcast       #79  <Class RelativeLayout>
	//   11   27:putfield        #86  <Field RelativeLayout b>
		c = (RelativeLayout)a1.a(0x7f090084);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #87  <Int 0x7f090084>
	//   15   34:invokeinterface #77  <Method View a.a(int)>
	//   16   39:checkcast       #79  <Class RelativeLayout>
	//   17   42:putfield        #90  <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f0902b1);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #91  <Int 0x7f0902b1>
	//   21   49:invokeinterface #77  <Method View a.a(int)>
	//   22   54:checkcast       #79  <Class RelativeLayout>
	//   23   57:putfield        #94  <Field RelativeLayout d>
		e = (RelativeLayout)a1.a(0x7f090249);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #95  <Int 0x7f090249>
	//   27   64:invokeinterface #77  <Method View a.a(int)>
	//   28   69:checkcast       #79  <Class RelativeLayout>
	//   29   72:putfield        #98  <Field RelativeLayout e>
		f = (ProgressBar)a1.a(0x7f090223);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #99  <Int 0x7f090223>
	//   33   79:invokeinterface #77  <Method View a.a(int)>
	//   34   84:checkcast       #101 <Class ProgressBar>
	//   35   87:putfield        #104 <Field ProgressBar f>
		e();
	//   36   90:aload_0         
	//   37   91:invokevirtual   #106 <Method void e()>
	//   38   94:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.NotificationSettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field NotificationSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.NotificationSettingsActivity_.a(NotificationSettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final NotificationSettingsActivity_ b;

			
			{
				b = NotificationSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field NotificationSettingsActivity_ b>
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
	//    0    0:ldc1            #65  <String "">
	//    1    2:new             #12  <Class NotificationSettingsActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #108 <Method void NotificationSettingsActivity_$2(NotificationSettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #72  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void f(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.NotificationSettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field NotificationSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.NotificationSettingsActivity_.a(NotificationSettingsActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final NotificationSettingsActivity_ b;

			
			{
				b = NotificationSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field NotificationSettingsActivity_ b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #65  <String "">
	//    1    2:new             #14  <Class NotificationSettingsActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #110 <Method void NotificationSettingsActivity_$3(NotificationSettingsActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #72  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", compoundbutton, flag) {

			public void a()
			{
				try
				{
					com.irobot.home.NotificationSettingsActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field NotificationSettingsActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field CompoundButton a>
			//    4    8:aload_0         
			//    5    9:getfield        #23  <Field boolean b>
			//    6   12:invokestatic    #33  <Method void com.irobot.home.NotificationSettingsActivity_.a(NotificationSettingsActivity_, CompoundButton, boolean)>
					return;
			//    7   15:return          
				}
				catch(Throwable throwable)
			//*   8   16:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    9   17:invokestatic    #39  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//   10   20:invokestatic    #43  <Method Thread Thread.currentThread()>
			//   11   23:aload_1         
			//   12   24:invokeinterface #49  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   13   29:return          
			}

			final CompoundButton a;
			final boolean b;
			final NotificationSettingsActivity_ c;

			
			{
				c = NotificationSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field NotificationSettingsActivity_ c>
				a = compoundbutton;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #21  <Field CompoundButton a>
				b = flag;
			//    6   11:aload_0         
			//    7   12:iload           7
			//    8   14:putfield        #23  <Field boolean b>
				super(s, l, s1);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:lload_3         
			//   12   20:aload           5
			//   13   22:invokespecial   #26  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   14   25:return          
			}
		}
)));
	//    0    0:new             #16  <Class NotificationSettingsActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #65  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #65  <String "">
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokespecial   #113 <Method void NotificationSettingsActivity_$4(NotificationSettingsActivity_, String, long, String, CompoundButton, boolean)>
	//    9   15:invokestatic    #118 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//   10   18:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c g>
	//    2    4:invokestatic    #122 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #124 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #126 <Method void NotificationSettingsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #122 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0058);
	//   13   23:aload_0         
	//   14   24:ldc1            #127 <Int 0x7f0b0058>
	//   15   26:invokevirtual   #130 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #131 <Method void NotificationSettingsActivity.setContentView(int)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #133 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void NotificationSettingsActivity.setContentView(View)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c g>
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
	//    3    3:invokespecial   #139 <Method void NotificationSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #133 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c g = new c();
}
