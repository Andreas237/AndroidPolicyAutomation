// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home:
//			BugFixedActivity

public final class BugFixedActivity_ extends BugFixedActivity
	implements a, b
{

	public BugFixedActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BugFixedActivity()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void c()>
	//    6   12:putfield        #19  <Field c b>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #25  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #29  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(a a1)
	{
		a = (Button)a1.a(0x7f090321);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #33  <Int 0x7f090321>
	//    3    4:invokeinterface #35  <Method View a.a(int)>
	//    4    9:checkcast       #37  <Class Button>
	//    5   12:putfield        #40  <Field Button a>
		e();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #43  <Method void e()>
	//    8   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field c b>
	//    2    4:invokestatic    #47  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #49  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #51  <Method void BugFixedActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #47  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0032);
	//   13   23:aload_0         
	//   14   24:ldc1            #52  <Int 0x7f0b0032>
	//   15   26:invokevirtual   #56  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #57  <Method void BugFixedActivity.setContentView(int)>
		b.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field c b>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #59  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void BugFixedActivity.setContentView(View)>
		b.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field c b>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #59  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #65  <Method void BugFixedActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		b.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field c b>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #59  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c b = new c();
}
