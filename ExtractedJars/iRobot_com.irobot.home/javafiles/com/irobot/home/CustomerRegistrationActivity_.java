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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			CustomerRegistrationActivity, IRobotApplication_

public final class CustomerRegistrationActivity_ extends CustomerRegistrationActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class CustomerRegistrationActivity_$a>
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
			super(context, com/irobot/home/CustomerRegistrationActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class CustomerRegistrationActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public CustomerRegistrationActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void CustomerRegistrationActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c l>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #16  <Class CustomerRegistrationActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void CustomerRegistrationActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		j = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #43  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #47  <Field IRobotApplication j>
		p();
	//    5   11:aload_0         
	//    6   12:invokespecial   #50  <Method void p()>
	//    7   15:return          
	}

	static void a(CustomerRegistrationActivity_ customerregistrationactivity_)
	{
		((CustomerRegistrationActivity) (customerregistrationactivity_)).CustomerRegistrationActivity.f_();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void CustomerRegistrationActivity.f_()>
	//    2    4:return          
	}

	private void p()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method Intent getIntent()>
	//    2    4:invokevirtual   #64  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("assetId"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #66  <String "assetId">
	//*   8   15:invokevirtual   #72  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			b = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #66  <String "assetId">
	//   13   25:invokevirtual   #76  <Method String Bundle.getString(String)>
	//   14   28:putfield        #80  <Field String b>
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

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (CustomVideoView)a1.a(0x7f09012c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #88  <Int 0x7f09012c>
	//    3    4:invokeinterface #90  <Method View a.a(int)>
	//    4    9:checkcast       #92  <Class CustomVideoView>
	//    5   12:putfield        #96  <Field CustomVideoView c>
		d = (ImageButton)a1.a(0x7f090335);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #97  <Int 0x7f090335>
	//    9   19:invokeinterface #90  <Method View a.a(int)>
	//   10   24:checkcast       #99  <Class ImageButton>
	//   11   27:putfield        #103 <Field ImageButton d>
		e = (LinearLayout)a1.a(0x7f090488);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #104 <Int 0x7f090488>
	//   15   34:invokeinterface #90  <Method View a.a(int)>
	//   16   39:checkcast       #106 <Class LinearLayout>
	//   17   42:putfield        #110 <Field LinearLayout e>
		f = (LinearLayout)a1.a(0x7f090357);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #111 <Int 0x7f090357>
	//   21   49:invokeinterface #90  <Method View a.a(int)>
	//   22   54:checkcast       #106 <Class LinearLayout>
	//   23   57:putfield        #114 <Field LinearLayout f>
		g = (EditText)a1.a(0x7f090361);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #115 <Int 0x7f090361>
	//   27   64:invokeinterface #90  <Method View a.a(int)>
	//   28   69:checkcast       #117 <Class EditText>
	//   29   72:putfield        #121 <Field EditText g>
		h = (Button)a1.a(0x7f090095);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #122 <Int 0x7f090095>
	//   33   79:invokeinterface #90  <Method View a.a(int)>
	//   34   84:checkcast       #124 <Class Button>
	//   35   87:putfield        #128 <Field Button h>
		i = (ProgressBar)a1.a(0x7f090223);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #129 <Int 0x7f090223>
	//   39   94:invokeinterface #90  <Method View a.a(int)>
	//   40   99:checkcast       #131 <Class ProgressBar>
	//   41  102:putfield        #135 <Field ProgressBar i>
		k = (ProgressBar)a1.a(0x7f0903c0);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #136 <Int 0x7f0903c0>
	//   45  109:invokeinterface #90  <Method View a.a(int)>
	//   46  114:checkcast       #131 <Class ProgressBar>
	//   47  117:putfield        #139 <Field ProgressBar k>
		if(h != null)
	//*  48  120:aload_0         
	//*  49  121:getfield        #128 <Field Button h>
	//*  50  124:ifnull          142
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CustomerRegistrationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CustomerRegistrationActivity_.k()>
				//    3    7:return          
				}

				final CustomerRegistrationActivity_ a;

			
			{
				a = CustomerRegistrationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CustomerRegistrationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   51  127:aload_0         
	//   52  128:getfield        #128 <Field Button h>
	//   53  131:new             #10  <Class CustomerRegistrationActivity_$1>
	//   54  134:dup             
	//   55  135:aload_0         
	//   56  136:invokespecial   #141 <Method void CustomerRegistrationActivity_$1(CustomerRegistrationActivity_)>
	//   57  139:invokevirtual   #145 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  58  142:aload_0         
	//*  59  143:getfield        #103 <Field ImageButton d>
	//*  60  146:ifnull          164
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CustomerRegistrationActivity_ a>
				//    2    4:invokevirtual   #25  <Method void CustomerRegistrationActivity_.l()>
				//    3    7:return          
				}

				final CustomerRegistrationActivity_ a;

			
			{
				a = CustomerRegistrationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CustomerRegistrationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   61  149:aload_0         
	//   62  150:getfield        #103 <Field ImageButton d>
	//   63  153:new             #12  <Class CustomerRegistrationActivity_$2>
	//   64  156:dup             
	//   65  157:aload_0         
	//   66  158:invokespecial   #146 <Method void CustomerRegistrationActivity_$2(CustomerRegistrationActivity_)>
	//   67  161:invokevirtual   #147 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   68  164:aload_0         
	//   69  165:invokevirtual   #149 <Method void e()>
	//   70  168:return          
	}

	public void f_()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.CustomerRegistrationActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CustomerRegistrationActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.CustomerRegistrationActivity_.a(CustomerRegistrationActivity_)>
			//    3    7:return          
			}

			final CustomerRegistrationActivity_ a;

			
			{
				a = CustomerRegistrationActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CustomerRegistrationActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #151 <String "">
	//    1    2:new             #14  <Class CustomerRegistrationActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #152 <Method void CustomerRegistrationActivity_$3(CustomerRegistrationActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #157 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c l>
	//    2    4:invokestatic    #161 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #163 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #165 <Method void CustomerRegistrationActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #161 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b006f);
	//   13   23:aload_0         
	//   14   24:ldc1            #166 <Int 0x7f0b006f>
	//   15   26:invokevirtual   #170 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #171 <Method void CustomerRegistrationActivity.setContentView(int)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #173 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void CustomerRegistrationActivity.setContentView(View)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #173 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #179 <Method void CustomerRegistrationActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #173 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void CustomerRegistrationActivity.setIntent(Intent)>
		p();
	//    3    5:aload_0         
	//    4    6:invokespecial   #50  <Method void p()>
	//    5    9:return          
	}

	private final c l = new c();
}
