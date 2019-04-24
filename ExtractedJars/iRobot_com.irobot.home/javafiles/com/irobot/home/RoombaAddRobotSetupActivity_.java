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
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RoombaAddRobotSetupActivity, IRobotApplication_

public final class RoombaAddRobotSetupActivity_ extends RoombaAddRobotSetupActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("assetInfoJson", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "assetInfoJson">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RoombaAddRobotSetupActivity_$a>
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

		public a b(String s)
		{
			return (a)super.a("assetNetworkAddress", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "assetNetworkAddress">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RoombaAddRobotSetupActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/RoombaAddRobotSetupActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RoombaAddRobotSetupActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RoombaAddRobotSetupActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void RoombaAddRobotSetupActivity()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void c()>
	//    6   12:putfield        #34  <Field c o>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #22  <Class RoombaAddRobotSetupActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void RoombaAddRobotSetupActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method void c.a(b)>
		b = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #49  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #53  <Field IRobotApplication b>
		m();
	//    5   11:aload_0         
	//    6   12:invokespecial   #56  <Method void m()>
	//    7   15:return          
	}

	static void a(RoombaAddRobotSetupActivity_ roombaaddrobotsetupactivity_)
	{
		((RoombaAddRobotSetupActivity) (roombaaddrobotsetupactivity_)).RoombaAddRobotSetupActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void RoombaAddRobotSetupActivity.j()>
	//    2    4:return          
	}

	static void b(RoombaAddRobotSetupActivity_ roombaaddrobotsetupactivity_)
	{
		((RoombaAddRobotSetupActivity) (roombaaddrobotsetupactivity_)).RoombaAddRobotSetupActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void RoombaAddRobotSetupActivity.g()>
	//    2    4:return          
	}

	static void c(RoombaAddRobotSetupActivity_ roombaaddrobotsetupactivity_)
	{
		((RoombaAddRobotSetupActivity) (roombaaddrobotsetupactivity_)).com.irobot.home.RoombaAddRobotSetupActivity.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void com.irobot.home.RoombaAddRobotSetupActivity.e()>
	//    2    4:return          
	}

	static void d(RoombaAddRobotSetupActivity_ roombaaddrobotsetupactivity_)
	{
		((RoombaAddRobotSetupActivity) (roombaaddrobotsetupactivity_)).RoombaAddRobotSetupActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void RoombaAddRobotSetupActivity.f()>
	//    2    4:return          
	}

	private void m()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Intent getIntent()>
	//    2    4:invokevirtual   #81  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("assetInfoJson"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #83  <String "assetInfoJson">
	//*   8   15:invokevirtual   #89  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("assetInfoJson");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #83  <String "assetInfoJson">
	//   13   25:invokevirtual   #93  <Method String Bundle.getString(String)>
	//   14   28:putfield        #96  <Field String a>
			if(bundle.containsKey("assetNetworkAddress"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #98  <String "assetNetworkAddress">
	//*  17   34:invokevirtual   #89  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				g = bundle.getString("assetNetworkAddress");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #98  <String "assetNetworkAddress">
	//   22   44:invokevirtual   #93  <Method String Bundle.getString(String)>
	//   23   47:putfield        #100 <Field String g>
		}
	//   24   50:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #104 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (TextView)a1.a(0x7f090040);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #108 <Int 0x7f090040>
	//    3    4:invokeinterface #110 <Method View a.a(int)>
	//    4    9:checkcast       #112 <Class TextView>
	//    5   12:putfield        #115 <Field TextView c>
		d = (TextView)a1.a(0x7f0901b3);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #116 <Int 0x7f0901b3>
	//    9   19:invokeinterface #110 <Method View a.a(int)>
	//   10   24:checkcast       #112 <Class TextView>
	//   11   27:putfield        #118 <Field TextView d>
		h = (CustomVideoView)a1.a(0x7f09012c);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #119 <Int 0x7f09012c>
	//   15   34:invokeinterface #110 <Method View a.a(int)>
	//   16   39:checkcast       #121 <Class CustomVideoView>
	//   17   42:putfield        #125 <Field CustomVideoView h>
		i = (CustomButton)a1.a(0x7f09011d);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #126 <Int 0x7f09011d>
	//   21   49:invokeinterface #110 <Method View a.a(int)>
	//   22   54:checkcast       #128 <Class CustomButton>
	//   23   57:putfield        #132 <Field CustomButton i>
		j = (ImageButton)a1.a(0x7f090335);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #133 <Int 0x7f090335>
	//   27   64:invokeinterface #110 <Method View a.a(int)>
	//   28   69:checkcast       #135 <Class ImageButton>
	//   29   72:putfield        #138 <Field ImageButton j>
		k = (ProgressBar)a1.a(0x7f0903c0);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #139 <Int 0x7f0903c0>
	//   33   79:invokeinterface #110 <Method View a.a(int)>
	//   34   84:checkcast       #141 <Class ProgressBar>
	//   35   87:putfield        #145 <Field ProgressBar k>
		l = (ScrollView)a1.a(0x7f0903ae);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #146 <Int 0x7f0903ae>
	//   39   94:invokeinterface #110 <Method View a.a(int)>
	//   40   99:checkcast       #148 <Class ScrollView>
	//   41  102:putfield        #152 <Field ScrollView l>
		if(j != null)
	//*  42  105:aload_0         
	//*  43  106:getfield        #138 <Field ImageButton j>
	//*  44  109:ifnull          127
			j.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaAddRobotSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaAddRobotSetupActivity_.k()>
				//    3    7:return          
				}

				final RoombaAddRobotSetupActivity_ a;

			
			{
				a = RoombaAddRobotSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaAddRobotSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   45  112:aload_0         
	//   46  113:getfield        #138 <Field ImageButton j>
	//   47  116:new             #10  <Class RoombaAddRobotSetupActivity_$1>
	//   48  119:dup             
	//   49  120:aload_0         
	//   50  121:invokespecial   #154 <Method void RoombaAddRobotSetupActivity_$1(RoombaAddRobotSetupActivity_)>
	//   51  124:invokevirtual   #158 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		if(i != null)
	//*  52  127:aload_0         
	//*  53  128:getfield        #132 <Field CustomButton i>
	//*  54  131:ifnull          149
			i.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RoombaAddRobotSetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RoombaAddRobotSetupActivity_.l()>
				//    3    7:return          
				}

				final RoombaAddRobotSetupActivity_ a;

			
			{
				a = RoombaAddRobotSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RoombaAddRobotSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   55  134:aload_0         
	//   56  135:getfield        #132 <Field CustomButton i>
	//   57  138:new             #12  <Class RoombaAddRobotSetupActivity_$2>
	//   58  141:dup             
	//   59  142:aload_0         
	//   60  143:invokespecial   #159 <Method void RoombaAddRobotSetupActivity_$2(RoombaAddRobotSetupActivity_)>
	//   61  146:invokevirtual   #160 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		h();
	//   62  149:aload_0         
	//   63  150:invokevirtual   #162 <Method void h()>
	//   64  153:return          
	}

	protected void e()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("stopAddRobotProcess", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.RoombaAddRobotSetupActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RoombaAddRobotSetupActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.RoombaAddRobotSetupActivity_.c(RoombaAddRobotSetupActivity_)>
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

			final RoombaAddRobotSetupActivity_ a;

			
			{
				a = RoombaAddRobotSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RoombaAddRobotSetupActivity_ a>
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
	//    0    0:new             #18  <Class RoombaAddRobotSetupActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #164 <String "stopAddRobotProcess">
	//    4    7:lconst_0        
	//    5    8:ldc1            #166 <String "">
	//    6   10:invokespecial   #169 <Method void RoombaAddRobotSetupActivity_$5(RoombaAddRobotSetupActivity_, String, long, String)>
	//    7   13:invokestatic    #174 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("startAddRobotProcess", 0L, "") {

			public void a()
			{
				try
				{
					RoombaAddRobotSetupActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RoombaAddRobotSetupActivity_ a>
			//    2    4:invokestatic    #25  <Method void RoombaAddRobotSetupActivity_.d(RoombaAddRobotSetupActivity_)>
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

			final RoombaAddRobotSetupActivity_ a;

			
			{
				a = RoombaAddRobotSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RoombaAddRobotSetupActivity_ a>
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
	//    0    0:new             #20  <Class RoombaAddRobotSetupActivity_$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #176 <String "startAddRobotProcess">
	//    4    7:lconst_0        
	//    5    8:ldc1            #166 <String "">
	//    6   10:invokespecial   #177 <Method void RoombaAddRobotSetupActivity_$6(RoombaAddRobotSetupActivity_, String, long, String)>
	//    7   13:invokestatic    #174 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RoombaAddRobotSetupActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaAddRobotSetupActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RoombaAddRobotSetupActivity_.b(RoombaAddRobotSetupActivity_)>
			//    3    7:return          
			}

			final RoombaAddRobotSetupActivity_ a;

			
			{
				a = RoombaAddRobotSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaAddRobotSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #166 <String "">
	//    1    2:new             #16  <Class RoombaAddRobotSetupActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #178 <Method void RoombaAddRobotSetupActivity_$4(RoombaAddRobotSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #183 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void j()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RoombaAddRobotSetupActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaAddRobotSetupActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RoombaAddRobotSetupActivity_.a(RoombaAddRobotSetupActivity_)>
			//    3    7:return          
			}

			final RoombaAddRobotSetupActivity_ a;

			
			{
				a = RoombaAddRobotSetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaAddRobotSetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #166 <String "">
	//    1    2:new             #14  <Class RoombaAddRobotSetupActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #184 <Method void RoombaAddRobotSetupActivity_$3(RoombaAddRobotSetupActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #183 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(o);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field c o>
	//    2    4:invokestatic    #188 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #190 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #192 <Method void RoombaAddRobotSetupActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #188 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b003c);
	//   13   23:aload_0         
	//   14   24:ldc1            #193 <Int 0x7f0b003c>
	//   15   26:invokevirtual   #197 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #198 <Method void RoombaAddRobotSetupActivity.setContentView(int)>
		o.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c o>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #200 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #203 <Method void RoombaAddRobotSetupActivity.setContentView(View)>
		o.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c o>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #200 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #206 <Method void RoombaAddRobotSetupActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		o.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field c o>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #200 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #210 <Method void RoombaAddRobotSetupActivity.setIntent(Intent)>
		m();
	//    3    5:aload_0         
	//    4    6:invokespecial   #56  <Method void m()>
	//    5    9:return          
	}

	private final c o = new c();
}
