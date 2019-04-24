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
import android.widget.ProgressBar;
import com.irobot.home.view.CustomButton;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			ChooseRegionsToCleanActivity

public final class ChooseRegionsToCleanActivity_ extends ChooseRegionsToCleanActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(boolean flag)
		{
			return (a)super.a("startedFromMapCompleteScreen", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "startedFromMapCompleteScreen">
		//    2    3:iload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class ChooseRegionsToCleanActivity_$a>
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
			super(context, com/irobot/home/ChooseRegionsToCleanActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class ChooseRegionsToCleanActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public ChooseRegionsToCleanActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ChooseRegionsToCleanActivity()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c d>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #14  <Class ChooseRegionsToCleanActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void ChooseRegionsToCleanActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method void c.a(b)>
		j();
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void j()>
	//    4    8:return          
	}

	static void a(ChooseRegionsToCleanActivity_ chooseregionstocleanactivity_)
	{
		((ChooseRegionsToCleanActivity) (chooseregionstocleanactivity_)).ChooseRegionsToCleanActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void ChooseRegionsToCleanActivity.f()>
	//    2    4:return          
	}

	private void j()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method Intent getIntent()>
	//    2    4:invokevirtual   #52  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("startedFromMapCompleteScreen"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #54  <String "startedFromMapCompleteScreen">
	//*   8   15:invokevirtual   #60  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getBoolean("startedFromMapCompleteScreen");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #54  <String "startedFromMapCompleteScreen">
	//   13   25:invokevirtual   #63  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #66  <Field boolean a>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomButton)a1.a(0x7f0900e0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #74  <Int 0x7f0900e0>
	//    3    4:invokeinterface #76  <Method View a.a(int)>
	//    4    9:checkcast       #78  <Class CustomButton>
	//    5   12:putfield        #82  <Field CustomButton b>
		c = (ProgressBar)a1.a(0x7f090223);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #83  <Int 0x7f090223>
	//    9   19:invokeinterface #76  <Method View a.a(int)>
	//   10   24:checkcast       #85  <Class ProgressBar>
	//   11   27:putfield        #89  <Field ProgressBar c>
		if(b != null)
	//*  12   30:aload_0         
	//*  13   31:getfield        #82  <Field CustomButton b>
	//*  14   34:ifnull          52
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ChooseRegionsToCleanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void ChooseRegionsToCleanActivity_.g()>
				//    3    7:return          
				}

				final ChooseRegionsToCleanActivity_ a;

			
			{
				a = ChooseRegionsToCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ChooseRegionsToCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   15   37:aload_0         
	//   16   38:getfield        #82  <Field CustomButton b>
	//   17   41:new             #10  <Class ChooseRegionsToCleanActivity_$1>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:invokespecial   #91  <Method void ChooseRegionsToCleanActivity_$1(ChooseRegionsToCleanActivity_)>
	//   21   49:invokevirtual   #95  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   22   52:aload_0         
	//   23   53:invokevirtual   #98  <Method void e()>
	//   24   56:return          
	}

	protected void f()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.ChooseRegionsToCleanActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ChooseRegionsToCleanActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.ChooseRegionsToCleanActivity_.a(ChooseRegionsToCleanActivity_)>
			//    3    7:return          
			}

			final ChooseRegionsToCleanActivity_ a;

			
			{
				a = ChooseRegionsToCleanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ChooseRegionsToCleanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #100 <String "">
	//    1    2:new             #12  <Class ChooseRegionsToCleanActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #101 <Method void ChooseRegionsToCleanActivity_$2(ChooseRegionsToCleanActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #106 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c d>
	//    2    4:invokestatic    #110 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #112 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #114 <Method void ChooseRegionsToCleanActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #110 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0087);
	//   13   23:aload_0         
	//   14   24:ldc1            #115 <Int 0x7f0b0087>
	//   15   26:invokevirtual   #119 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #120 <Method void ChooseRegionsToCleanActivity.setContentView(int)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #122 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #125 <Method void ChooseRegionsToCleanActivity.setContentView(View)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #122 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #128 <Method void ChooseRegionsToCleanActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #122 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #132 <Method void ChooseRegionsToCleanActivity.setIntent(Intent)>
		j();
	//    3    5:aload_0         
	//    4    6:invokespecial   #38  <Method void j()>
	//    5    9:return          
	}

	private final c d = new c();
}
