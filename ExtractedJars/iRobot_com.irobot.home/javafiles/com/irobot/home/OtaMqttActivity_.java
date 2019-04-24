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
import android.widget.ProgressBar;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			OtaMqttActivity

public final class OtaMqttActivity_ extends OtaMqttActivity
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
			super(context, com/irobot/home/OtaMqttActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class OtaMqttActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public OtaMqttActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void OtaMqttActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c e>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #18  <Class OtaMqttActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void OtaMqttActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(OtaMqttActivity_ otamqttactivity_)
	{
		((OtaMqttActivity) (otamqttactivity_)).OtaMqttActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void OtaMqttActivity.g()>
	//    2    4:return          
	}

	static void a(OtaMqttActivity_ otamqttactivity_, int i)
	{
		((OtaMqttActivity) (otamqttactivity_)).OtaMqttActivity.f(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #48  <Method void OtaMqttActivity.f(int)>
	//    3    5:return          
	}

	static void a(OtaMqttActivity_ otamqttactivity_, boolean flag)
	{
		((OtaMqttActivity) (otamqttactivity_)).com.irobot.home.OtaMqttActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #52  <Method void com.irobot.home.OtaMqttActivity.a(boolean)>
	//    3    5:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #56  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomTextView)a1.a(0x7f0902b0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #60  <Int 0x7f0902b0>
	//    3    4:invokeinterface #62  <Method View a.a(int)>
	//    4    9:checkcast       #64  <Class CustomTextView>
	//    5   12:putfield        #67  <Field CustomTextView a>
		b = (CustomButton)a1.a(0x7f090404);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #68  <Int 0x7f090404>
	//    9   19:invokeinterface #62  <Method View a.a(int)>
	//   10   24:checkcast       #70  <Class CustomButton>
	//   11   27:putfield        #74  <Field CustomButton b>
		c = (ProgressBar)a1.a(0x7f0903c0);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #75  <Int 0x7f0903c0>
	//   15   34:invokeinterface #62  <Method View a.a(int)>
	//   16   39:checkcast       #77  <Class ProgressBar>
	//   17   42:putfield        #81  <Field ProgressBar c>
		d = (ProgressBar)a1.a(0x7f090223);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #82  <Int 0x7f090223>
	//   21   49:invokeinterface #62  <Method View a.a(int)>
	//   22   54:checkcast       #77  <Class ProgressBar>
	//   23   57:putfield        #85  <Field ProgressBar d>
		if(b != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #74  <Field CustomButton b>
	//*  26   64:ifnull          82
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field OtaMqttActivity_ a>
				//    2    4:invokevirtual   #25  <Method void OtaMqttActivity_.f()>
				//    3    7:return          
				}

				final OtaMqttActivity_ a;

			
			{
				a = OtaMqttActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OtaMqttActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   27   67:aload_0         
	//   28   68:getfield        #74  <Field CustomButton b>
	//   29   71:new             #10  <Class OtaMqttActivity_$1>
	//   30   74:dup             
	//   31   75:aload_0         
	//   32   76:invokespecial   #87  <Method void OtaMqttActivity_$1(OtaMqttActivity_)>
	//   33   79:invokevirtual   #91  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   34   82:aload_0         
	//   35   83:invokevirtual   #93  <Method void e()>
	//   36   86:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.OtaMqttActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field OtaMqttActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.OtaMqttActivity_.a(OtaMqttActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final OtaMqttActivity_ b;

			
			{
				b = OtaMqttActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field OtaMqttActivity_ b>
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
	//    0    0:ldc1            #95  <String "">
	//    1    2:new             #12  <Class OtaMqttActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #97  <Method void OtaMqttActivity_$2(OtaMqttActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #102 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void f(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.OtaMqttActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field OtaMqttActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.OtaMqttActivity_.a(OtaMqttActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final OtaMqttActivity_ b;

			
			{
				b = OtaMqttActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field OtaMqttActivity_ b>
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
	//    0    0:ldc1            #95  <String "">
	//    1    2:new             #14  <Class OtaMqttActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #104 <Method void OtaMqttActivity_$3(OtaMqttActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #102 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.OtaMqttActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field OtaMqttActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.OtaMqttActivity_.a(OtaMqttActivity_)>
			//    3    7:return          
			}

			final OtaMqttActivity_ a;

			
			{
				a = OtaMqttActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field OtaMqttActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #95  <String "">
	//    1    2:new             #16  <Class OtaMqttActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #105 <Method void OtaMqttActivity_$4(OtaMqttActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #102 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c e>
	//    2    4:invokestatic    #109 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #111 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #113 <Method void OtaMqttActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #109 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b005b);
	//   13   23:aload_0         
	//   14   24:ldc1            #114 <Int 0x7f0b005b>
	//   15   26:invokevirtual   #117 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #118 <Method void OtaMqttActivity.setContentView(int)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #120 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void OtaMqttActivity.setContentView(View)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #120 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #126 <Method void OtaMqttActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c e>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #120 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c e = new c();
}
