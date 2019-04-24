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
import android.widget.ImageButton;
import com.irobot.home.view.CustomViewPager;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			AboutSmartMapsActivity

public final class AboutSmartMapsActivity_ extends AboutSmartMapsActivity
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
			super(context, com/irobot/home/AboutSmartMapsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class AboutSmartMapsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public AboutSmartMapsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AboutSmartMapsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c c>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class AboutSmartMapsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void AboutSmartMapsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #37  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomViewPager)a1.a(0x7f090489);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #41  <Int 0x7f090489>
	//    3    4:invokeinterface #43  <Method View a.a(int)>
	//    4    9:checkcast       #45  <Class CustomViewPager>
	//    5   12:putfield        #48  <Field CustomViewPager a>
		b = (ImageButton)a1.a(0x7f0900ae);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #49  <Int 0x7f0900ae>
	//    9   19:invokeinterface #43  <Method View a.a(int)>
	//   10   24:checkcast       #51  <Class ImageButton>
	//   11   27:putfield        #55  <Field ImageButton b>
		if(b != null)
	//*  12   30:aload_0         
	//*  13   31:getfield        #55  <Field ImageButton b>
	//*  14   34:ifnull          52
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AboutSmartMapsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AboutSmartMapsActivity_.f()>
				//    3    7:return          
				}

				final AboutSmartMapsActivity_ a;

			
			{
				a = AboutSmartMapsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AboutSmartMapsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   15   37:aload_0         
	//   16   38:getfield        #55  <Field ImageButton b>
	//   17   41:new             #10  <Class AboutSmartMapsActivity_$1>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:invokespecial   #58  <Method void AboutSmartMapsActivity_$1(AboutSmartMapsActivity_)>
	//   21   49:invokevirtual   #62  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   22   52:aload_0         
	//   23   53:invokevirtual   #65  <Method void e()>
	//   24   56:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c c>
	//    2    4:invokestatic    #69  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #71  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #73  <Method void AboutSmartMapsActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #69  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0021);
	//   13   23:aload_0         
	//   14   24:ldc1            #74  <Int 0x7f0b0021>
	//   15   26:invokevirtual   #78  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #79  <Method void AboutSmartMapsActivity.setContentView(int)>
		c.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c c>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #81  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void AboutSmartMapsActivity.setContentView(View)>
		c.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c c>
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
	//    3    3:invokespecial   #87  <Method void AboutSmartMapsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		c.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c c>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #81  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c c = new c();
}
