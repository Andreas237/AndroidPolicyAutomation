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
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RemoveButtonActivity, IRobotApplication_

public final class RemoveButtonActivity_ extends RemoveButtonActivity
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
		//    4    7:checkcast       #2   <Class RemoveButtonActivity_$a>
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
			return (a)super.a("robotName", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "robotName">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RemoveButtonActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/RemoveButtonActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RemoveButtonActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RemoveButtonActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void RemoveButtonActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c g>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class RemoveButtonActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void RemoveButtonActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #42  <Field IRobotApplication a>
		g();
	//    5   11:aload_0         
	//    6   12:invokespecial   #44  <Method void g()>
	//    7   15:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method Intent getIntent()>
	//    2    4:invokevirtual   #54  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #56  <String "robotBlid">
	//*   8   15:invokevirtual   #62  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				b = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #56  <String "robotBlid">
	//   13   25:invokevirtual   #66  <Method String Bundle.getString(String)>
	//   14   28:putfield        #70  <Field String b>
			if(bundle.containsKey("robotName"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #72  <String "robotName">
	//*  17   34:invokevirtual   #62  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				c = bundle.getString("robotName");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #72  <String "robotName">
	//   22   44:invokevirtual   #66  <Method String Bundle.getString(String)>
	//   23   47:putfield        #75  <Field String c>
		}
	//   24   50:return          
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
		d = (Button)a1.a(0x7f090330);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #83  <Int 0x7f090330>
	//    3    4:invokeinterface #85  <Method View a.a(int)>
	//    4    9:checkcast       #87  <Class Button>
	//    5   12:putfield        #91  <Field Button d>
		e = (TextView)a1.a(0x7f090334);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #92  <Int 0x7f090334>
	//    9   19:invokeinterface #85  <Method View a.a(int)>
	//   10   24:checkcast       #94  <Class TextView>
	//   11   27:putfield        #98  <Field TextView e>
		f = (ProgressBar)a1.a(0x7f090223);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #99  <Int 0x7f090223>
	//   15   34:invokeinterface #85  <Method View a.a(int)>
	//   16   39:checkcast       #101 <Class ProgressBar>
	//   17   42:putfield        #105 <Field ProgressBar f>
		if(d != null)
	//*  18   45:aload_0         
	//*  19   46:getfield        #91  <Field Button d>
	//*  20   49:ifnull          67
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RemoveButtonActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RemoveButtonActivity_.f()>
				//    3    7:return          
				}

				final RemoveButtonActivity_ a;

			
			{
				a = RemoveButtonActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RemoveButtonActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   52:aload_0         
	//   22   53:getfield        #91  <Field Button d>
	//   23   56:new             #10  <Class RemoveButtonActivity_$1>
	//   24   59:dup             
	//   25   60:aload_0         
	//   26   61:invokespecial   #108 <Method void RemoveButtonActivity_$1(RemoveButtonActivity_)>
	//   27   64:invokevirtual   #112 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   28   67:aload_0         
	//   29   68:invokevirtual   #114 <Method void e()>
	//   30   71:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c g>
	//    2    4:invokestatic    #118 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #120 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #122 <Method void RemoveButtonActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #118 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0064);
	//   13   23:aload_0         
	//   14   24:ldc1            #123 <Int 0x7f0b0064>
	//   15   26:invokevirtual   #127 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method void RemoveButtonActivity.setContentView(int)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #130 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method void RemoveButtonActivity.setContentView(View)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #130 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #136 <Method void RemoveButtonActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #130 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method void RemoveButtonActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #44  <Method void g()>
	//    5    9:return          
	}

	private final c g = new c();
}
