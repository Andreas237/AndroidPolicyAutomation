// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			Roomba900SetupActivity, IRobotApplication_

public final class Roomba900SetupActivity_ extends Roomba900SetupActivity
	implements a, b
{

	public Roomba900SetupActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Roomba900SetupActivity()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void c()>
	//    6   12:putfield        #27  <Field c g>
	//    7   15:return          
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

	static void a(Roomba900SetupActivity_ roomba900setupactivity_, int i)
	{
		((Roomba900SetupActivity) (roomba900setupactivity_)).Roomba900SetupActivity.f(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #49  <Method void Roomba900SetupActivity.f(int)>
	//    3    5:return          
	}

	static void a(Roomba900SetupActivity_ roomba900setupactivity_, ArrayList arraylist)
	{
		((Roomba900SetupActivity) (roomba900setupactivity_)).com.irobot.home.Roomba900SetupActivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void com.irobot.home.Roomba900SetupActivity.a(ArrayList)>
	//    3    5:return          
	}

	static void b(Roomba900SetupActivity_ roomba900setupactivity_, int i)
	{
		((Roomba900SetupActivity) (roomba900setupactivity_)).Roomba900SetupActivity.g(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #56  <Method void Roomba900SetupActivity.g(int)>
	//    3    5:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method Intent getIntent()>
	//    2    4:invokevirtual   #66  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("addingRobot"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #68  <String "addingRobot">
	//*   8   15:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			b = bundle.getBoolean("addingRobot");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #68  <String "addingRobot">
	//   13   25:invokevirtual   #77  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #80  <Field boolean b>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #84  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	protected void a(ArrayList arraylist)
	{
		org.androidannotations.api.b.a("", new Runnable(arraylist) {

			public void run()
			{
				com.irobot.home.Roomba900SetupActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Roomba900SetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field ArrayList a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.Roomba900SetupActivity_.a(Roomba900SetupActivity_, ArrayList)>
			//    5   11:return          
			}

			final ArrayList a;
			final Roomba900SetupActivity_ b;

			
			{
				b = Roomba900SetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Roomba900SetupActivity_ b>
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
	//    0    0:ldc1            #88  <String "">
	//    1    2:new             #12  <Class Roomba900SetupActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #90  <Method void Roomba900SetupActivity_$2(Roomba900SetupActivity_, ArrayList)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #95  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(a a1)
	{
		c = (ProgressBar)a1.a(0x7f09037e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #98  <Int 0x7f09037e>
	//    3    4:invokeinterface #100 <Method View a.a(int)>
	//    4    9:checkcast       #102 <Class ProgressBar>
	//    5   12:putfield        #106 <Field ProgressBar c>
		d = (CustomTextView)a1.a(0x7f09036e);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #107 <Int 0x7f09036e>
	//    9   19:invokeinterface #100 <Method View a.a(int)>
	//   10   24:checkcast       #109 <Class CustomTextView>
	//   11   27:putfield        #113 <Field CustomTextView d>
		e = (CustomTextView)a1.a(0x7f090149);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #114 <Int 0x7f090149>
	//   15   34:invokeinterface #100 <Method View a.a(int)>
	//   16   39:checkcast       #109 <Class CustomTextView>
	//   17   42:putfield        #117 <Field CustomTextView e>
		f = (ListView)a1.a(0x7f090220);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #118 <Int 0x7f090220>
	//   21   49:invokeinterface #100 <Method View a.a(int)>
	//   22   54:checkcast       #120 <Class ListView>
	//   23   57:putfield        #123 <Field ListView f>
		a1 = ((a) (a1.a(0x7f0902ac)));
	//   24   60:aload_1         
	//   25   61:ldc1            #124 <Int 0x7f0902ac>
	//   26   63:invokeinterface #100 <Method View a.a(int)>
	//   27   68:astore_1        
		if(a1 != null)
	//*  28   69:aload_1         
	//*  29   70:ifnull          85
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field Roomba900SetupActivity_ a>
				//    2    4:invokevirtual   #25  <Method void Roomba900SetupActivity_.e()>
				//    3    7:return          
				}

				final Roomba900SetupActivity_ a;

			
			{
				a = Roomba900SetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Roomba900SetupActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   30   73:aload_1         
	//   31   74:new             #10  <Class Roomba900SetupActivity_$1>
	//   32   77:dup             
	//   33   78:aload_0         
	//   34   79:invokespecial   #127 <Method void Roomba900SetupActivity_$1(Roomba900SetupActivity_)>
	//   35   82:invokevirtual   #133 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   36   85:return          
	}

	protected void f(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.Roomba900SetupActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Roomba900SetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.Roomba900SetupActivity_.a(Roomba900SetupActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final Roomba900SetupActivity_ b;

			
			{
				b = Roomba900SetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Roomba900SetupActivity_ b>
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
	//    0    0:ldc1            #88  <String "">
	//    1    2:new             #14  <Class Roomba900SetupActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #135 <Method void Roomba900SetupActivity_$3(Roomba900SetupActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #95  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void g(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.Roomba900SetupActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Roomba900SetupActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.Roomba900SetupActivity_.b(Roomba900SetupActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final Roomba900SetupActivity_ b;

			
			{
				b = Roomba900SetupActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Roomba900SetupActivity_ b>
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
	//    0    0:ldc1            #88  <String "">
	//    1    2:new             #16  <Class Roomba900SetupActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #136 <Method void Roomba900SetupActivity_$4(Roomba900SetupActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #95  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field c g>
	//    2    4:invokestatic    #140 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #142 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #144 <Method void Roomba900SetupActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #140 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b006a);
	//   13   23:aload_0         
	//   14   24:ldc1            #145 <Int 0x7f0b006a>
	//   15   26:invokevirtual   #148 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #149 <Method void Roomba900SetupActivity.setContentView(int)>
		g.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #151 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #154 <Method void Roomba900SetupActivity.setContentView(View)>
		g.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field c g>
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
	//    3    3:invokespecial   #157 <Method void Roomba900SetupActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #151 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #161 <Method void Roomba900SetupActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #44  <Method void g()>
	//    5    9:return          
	}

	private final c g = new c();
}
