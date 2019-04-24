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
import android.widget.TextView;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			WifiSettingsActivity

public final class WifiSettingsActivity_ extends WifiSettingsActivity
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
		//    4    7:checkcast       #2   <Class WifiSettingsActivity_$a>
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
		//    4    7:checkcast       #2   <Class WifiSettingsActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/WifiSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class WifiSettingsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public WifiSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void WifiSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c f>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #14  <Class WifiSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void WifiSettingsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
		h();
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void h()>
	//    4    8:return          
	}

	private void h()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method Intent getIntent()>
	//    2    4:invokevirtual   #48  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #50  <String "robotBlid">
	//*   8   15:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				d = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #50  <String "robotBlid">
	//   13   25:invokevirtual   #60  <Method String Bundle.getString(String)>
	//   14   28:putfield        #64  <Field String d>
			if(bundle.containsKey("robotName"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #66  <String "robotName">
	//*  17   34:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				e = bundle.getString("robotName");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #66  <String "robotName">
	//   22   44:invokevirtual   #60  <Method String Bundle.getString(String)>
	//   23   47:putfield        #69  <Field String e>
		}
	//   24   50:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #73  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomTextView)a1.a(0x7f09036c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #77  <Int 0x7f09036c>
	//    3    4:invokeinterface #79  <Method View a.a(int)>
	//    4    9:checkcast       #81  <Class CustomTextView>
	//    5   12:putfield        #84  <Field CustomTextView a>
		b = (TextView)a1.a(0x7f09027f);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #85  <Int 0x7f09027f>
	//    9   19:invokeinterface #79  <Method View a.a(int)>
	//   10   24:checkcast       #87  <Class TextView>
	//   11   27:putfield        #91  <Field TextView b>
		c = (CustomTextView)a1.a(0x7f0904a6);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #92  <Int 0x7f0904a6>
	//   15   34:invokeinterface #79  <Method View a.a(int)>
	//   16   39:checkcast       #81  <Class CustomTextView>
	//   17   42:putfield        #95  <Field CustomTextView c>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f0900be)));
	//   18   45:aload_1         
	//   19   46:ldc1            #96  <Int 0x7f0900be>
	//   20   48:invokeinterface #79  <Method View a.a(int)>
	//   21   53:astore_1        
		if(a != null)
	//*  22   54:aload_0         
	//*  23   55:getfield        #84  <Field CustomTextView a>
	//*  24   58:ifnull          76
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field WifiSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void WifiSettingsActivity_.f()>
				//    3    7:return          
				}

				final WifiSettingsActivity_ a;

			
			{
				a = WifiSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WifiSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   25   61:aload_0         
	//   26   62:getfield        #84  <Field CustomTextView a>
	//   27   65:new             #10  <Class WifiSettingsActivity_$1>
	//   28   68:dup             
	//   29   69:aload_0         
	//   30   70:invokespecial   #99  <Method void WifiSettingsActivity_$1(WifiSettingsActivity_)>
	//   31   73:invokevirtual   #103 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//*  32   76:aload_1         
	//*  33   77:ifnull          92
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field WifiSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void WifiSettingsActivity_.g()>
				//    3    7:return          
				}

				final WifiSettingsActivity_ a;

			
			{
				a = WifiSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WifiSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   34   80:aload_1         
	//   35   81:new             #12  <Class WifiSettingsActivity_$2>
	//   36   84:dup             
	//   37   85:aload_0         
	//   38   86:invokespecial   #104 <Method void WifiSettingsActivity_$2(WifiSettingsActivity_)>
	//   39   89:invokevirtual   #107 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   40   92:aload_0         
	//   41   93:invokevirtual   #109 <Method void e()>
	//   42   96:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c f>
	//    2    4:invokestatic    #113 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #115 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #117 <Method void WifiSettingsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #113 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b007f);
	//   13   23:aload_0         
	//   14   24:ldc1            #118 <Int 0x7f0b007f>
	//   15   26:invokevirtual   #122 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #123 <Method void WifiSettingsActivity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #125 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method void WifiSettingsActivity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #125 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #131 <Method void WifiSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #125 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #135 <Method void WifiSettingsActivity.setIntent(Intent)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #38  <Method void h()>
	//    5    9:return          
	}

	private final c f = new c();
}
