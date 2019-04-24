// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home:
//			WiFiInfoActivity

public final class WiFiInfoActivity_ extends WiFiInfoActivity
	implements a, b
{

	public WiFiInfoActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void WiFiInfoActivity()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void c()>
	//    6   12:putfield        #21  <Field c d>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #31  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(a a1)
	{
		a = (TextView)a1.a(0x7f0904a0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #35  <Int 0x7f0904a0>
	//    3    4:invokeinterface #37  <Method View a.a(int)>
	//    4    9:checkcast       #39  <Class TextView>
	//    5   12:putfield        #42  <Field TextView a>
		b = (TextView)a1.a(0x7f090112);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #43  <Int 0x7f090112>
	//    9   19:invokeinterface #37  <Method View a.a(int)>
	//   10   24:checkcast       #39  <Class TextView>
	//   11   27:putfield        #46  <Field TextView b>
		c = (CustomTextView)a1.a(0x7f09027e);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #47  <Int 0x7f09027e>
	//   15   34:invokeinterface #37  <Method View a.a(int)>
	//   16   39:checkcast       #49  <Class CustomTextView>
	//   17   42:putfield        #53  <Field CustomTextView c>
		a1 = ((a) (a1.a(0x7f0901aa)));
	//   18   45:aload_1         
	//   19   46:ldc1            #54  <Int 0x7f0901aa>
	//   20   48:invokeinterface #37  <Method View a.a(int)>
	//   21   53:astore_1        
		if(a1 != null)
	//*  22   54:aload_1         
	//*  23   55:ifnull          70
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field WiFiInfoActivity_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.WiFiInfoActivity_.b()>
				//    3    7:return          
				}

				final WiFiInfoActivity_ a;

			
			{
				a = WiFiInfoActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WiFiInfoActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   58:aload_1         
	//   25   59:new             #10  <Class WiFiInfoActivity_$1>
	//   26   62:dup             
	//   27   63:aload_0         
	//   28   64:invokespecial   #57  <Method void WiFiInfoActivity_$1(WiFiInfoActivity_)>
	//   29   67:invokevirtual   #63  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   30   70:aload_0         
	//   31   71:invokevirtual   #65  <Method void a()>
	//   32   74:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field c d>
	//    2    4:invokestatic    #69  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #71  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #73  <Method void WiFiInfoActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #69  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b007d);
	//   13   23:aload_0         
	//   14   24:ldc1            #74  <Int 0x7f0b007d>
	//   15   26:invokevirtual   #78  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #79  <Method void WiFiInfoActivity.setContentView(int)>
		d.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #81  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void WiFiInfoActivity.setContentView(View)>
		d.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #81  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #87  <Method void WiFiInfoActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		d.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #81  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c d = new c();
}
