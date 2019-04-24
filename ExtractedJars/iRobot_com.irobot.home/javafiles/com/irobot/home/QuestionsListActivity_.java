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
import android.widget.ListView;
import android.widget.ScrollView;
import com.irobot.home.model.rest.CommonQuestionList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			QuestionsListActivity

public final class QuestionsListActivity_ extends QuestionsListActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class QuestionsListActivity_$a>
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
			super(context, com/irobot/home/QuestionsListActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class QuestionsListActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public QuestionsListActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void QuestionsListActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c f>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #18  <Class QuestionsListActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void QuestionsListActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void c.a(b)>
		h();
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void h()>
	//    4    8:return          
	}

	static void a(QuestionsListActivity_ questionslistactivity_)
	{
		((QuestionsListActivity) (questionslistactivity_)).QuestionsListActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void QuestionsListActivity.f()>
	//    2    4:return          
	}

	static void a(QuestionsListActivity_ questionslistactivity_, int i)
	{
		((QuestionsListActivity) (questionslistactivity_)).QuestionsListActivity.f(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #49  <Method void QuestionsListActivity.f(int)>
	//    3    5:return          
	}

	static void a(QuestionsListActivity_ questionslistactivity_, CommonQuestionList commonquestionlist)
	{
		((QuestionsListActivity) (questionslistactivity_)).com.irobot.home.QuestionsListActivity.a(commonquestionlist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void com.irobot.home.QuestionsListActivity.a(CommonQuestionList)>
	//    3    5:return          
	}

	private void h()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Intent getIntent()>
	//    2    4:invokevirtual   #63  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #65  <String "robotBlid">
	//*   8   15:invokevirtual   #71  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			d = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #65  <String "robotBlid">
	//   13   25:invokevirtual   #75  <Method String Bundle.getString(String)>
	//   14   28:putfield        #79  <Field String d>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #83  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(CommonQuestionList commonquestionlist)
	{
		org.androidannotations.api.b.a("", new Runnable(commonquestionlist) {

			public void run()
			{
				com.irobot.home.QuestionsListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field QuestionsListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field CommonQuestionList a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.QuestionsListActivity_.a(QuestionsListActivity_, CommonQuestionList)>
			//    5   11:return          
			}

			final CommonQuestionList a;
			final QuestionsListActivity_ b;

			
			{
				b = QuestionsListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field QuestionsListActivity_ b>
				a = commonquestionlist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field CommonQuestionList a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #87  <String "">
	//    1    2:new             #12  <Class QuestionsListActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #89  <Method void QuestionsListActivity_$2(QuestionsListActivity_, CommonQuestionList)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #94  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (ListView)a1.a(0x7f09030e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #96  <Int 0x7f09030e>
	//    3    4:invokeinterface #98  <Method View a.a(int)>
	//    4    9:checkcast       #100 <Class ListView>
	//    5   12:putfield        #103 <Field ListView a>
		b = (ScrollView)a1.a(0x7f0903aa);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #104 <Int 0x7f0903aa>
	//    9   19:invokeinterface #98  <Method View a.a(int)>
	//   10   24:checkcast       #106 <Class ScrollView>
	//   11   27:putfield        #110 <Field ScrollView b>
		c = a1.a(0x7f090042);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #111 <Int 0x7f090042>
	//   15   34:invokeinterface #98  <Method View a.a(int)>
	//   16   39:putfield        #115 <Field View c>
		if(c != null)
	//*  17   42:aload_0         
	//*  18   43:getfield        #115 <Field View c>
	//*  19   46:ifnull          64
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field QuestionsListActivity_ a>
				//    2    4:invokevirtual   #25  <Method void QuestionsListActivity_.g()>
				//    3    7:return          
				}

				final QuestionsListActivity_ a;

			
			{
				a = QuestionsListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field QuestionsListActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   20   49:aload_0         
	//   21   50:getfield        #115 <Field View c>
	//   22   53:new             #10  <Class QuestionsListActivity_$1>
	//   23   56:dup             
	//   24   57:aload_0         
	//   25   58:invokespecial   #117 <Method void QuestionsListActivity_$1(QuestionsListActivity_)>
	//   26   61:invokevirtual   #123 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   27   64:aload_0         
	//   28   65:invokevirtual   #126 <Method void e()>
	//   29   68:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.QuestionsListActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field QuestionsListActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.QuestionsListActivity_.a(QuestionsListActivity_)>
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

			final QuestionsListActivity_ a;

			
			{
				a = QuestionsListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field QuestionsListActivity_ a>
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
	//    0    0:new             #16  <Class QuestionsListActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #87  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #87  <String "">
	//    6   10:invokespecial   #129 <Method void QuestionsListActivity_$4(QuestionsListActivity_, String, long, String)>
	//    7   13:invokestatic    #134 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void f(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.QuestionsListActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field QuestionsListActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.QuestionsListActivity_.a(QuestionsListActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final QuestionsListActivity_ b;

			
			{
				b = QuestionsListActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field QuestionsListActivity_ b>
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
	//    0    0:ldc1            #87  <String "">
	//    1    2:new             #14  <Class QuestionsListActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #136 <Method void QuestionsListActivity_$3(QuestionsListActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #94  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c f>
	//    2    4:invokestatic    #140 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #142 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #144 <Method void QuestionsListActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #140 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0063);
	//   13   23:aload_0         
	//   14   24:ldc1            #145 <Int 0x7f0b0063>
	//   15   26:invokevirtual   #148 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #149 <Method void QuestionsListActivity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #151 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #154 <Method void QuestionsListActivity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #151 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #157 <Method void QuestionsListActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #151 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #161 <Method void QuestionsListActivity.setIntent(Intent)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #42  <Method void h()>
	//    5    9:return          
	}

	private final c f = new c();
}
