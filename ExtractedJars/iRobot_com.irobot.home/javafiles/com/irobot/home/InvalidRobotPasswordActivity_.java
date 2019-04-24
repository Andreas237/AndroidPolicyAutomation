// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home:
//			InvalidRobotPasswordActivity

public final class InvalidRobotPasswordActivity_ extends InvalidRobotPasswordActivity
	implements a, b
{

	public InvalidRobotPasswordActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void InvalidRobotPasswordActivity()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void c()>
	//    6   12:putfield        #23  <Field c d>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(a a1)
	{
		a = (Button)a1.a(0x7f090333);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #37  <Int 0x7f090333>
	//    3    4:invokeinterface #39  <Method View a.a(int)>
	//    4    9:checkcast       #41  <Class Button>
	//    5   12:putfield        #44  <Field Button a>
		b = (Button)a1.a(0x7f090320);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #45  <Int 0x7f090320>
	//    9   19:invokeinterface #39  <Method View a.a(int)>
	//   10   24:checkcast       #41  <Class Button>
	//   11   27:putfield        #48  <Field Button b>
		c = (TextView)a1.a(0x7f090177);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #49  <Int 0x7f090177>
	//   15   34:invokeinterface #39  <Method View a.a(int)>
	//   16   39:checkcast       #51  <Class TextView>
	//   17   42:putfield        #55  <Field TextView c>
		if(a != null)
	//*  18   45:aload_0         
	//*  19   46:getfield        #44  <Field Button a>
	//*  20   49:ifnull          67
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field InvalidRobotPasswordActivity_ a>
				//    2    4:invokevirtual   #25  <Method void InvalidRobotPasswordActivity_.f()>
				//    3    7:return          
				}

				final InvalidRobotPasswordActivity_ a;

			
			{
				a = InvalidRobotPasswordActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field InvalidRobotPasswordActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   52:aload_0         
	//   22   53:getfield        #44  <Field Button a>
	//   23   56:new             #10  <Class InvalidRobotPasswordActivity_$1>
	//   24   59:dup             
	//   25   60:aload_0         
	//   26   61:invokespecial   #58  <Method void InvalidRobotPasswordActivity_$1(InvalidRobotPasswordActivity_)>
	//   27   64:invokevirtual   #62  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(b != null)
	//*  28   67:aload_0         
	//*  29   68:getfield        #48  <Field Button b>
	//*  30   71:ifnull          89
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field InvalidRobotPasswordActivity_ a>
				//    2    4:invokevirtual   #25  <Method void InvalidRobotPasswordActivity_.g()>
				//    3    7:return          
				}

				final InvalidRobotPasswordActivity_ a;

			
			{
				a = InvalidRobotPasswordActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field InvalidRobotPasswordActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   31   74:aload_0         
	//   32   75:getfield        #48  <Field Button b>
	//   33   78:new             #12  <Class InvalidRobotPasswordActivity_$2>
	//   34   81:dup             
	//   35   82:aload_0         
	//   36   83:invokespecial   #63  <Method void InvalidRobotPasswordActivity_$2(InvalidRobotPasswordActivity_)>
	//   37   86:invokevirtual   #62  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   38   89:aload_0         
	//   39   90:invokevirtual   #66  <Method void e()>
	//   40   93:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field c d>
	//    2    4:invokestatic    #70  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #72  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #74  <Method void InvalidRobotPasswordActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #70  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0047);
	//   13   23:aload_0         
	//   14   24:ldc1            #75  <Int 0x7f0b0047>
	//   15   26:invokevirtual   #79  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #80  <Method void InvalidRobotPasswordActivity.setContentView(int)>
		d.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #82  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void InvalidRobotPasswordActivity.setContentView(View)>
		d.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #82  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #88  <Method void InvalidRobotPasswordActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		d.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #82  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c d = new c();
}
