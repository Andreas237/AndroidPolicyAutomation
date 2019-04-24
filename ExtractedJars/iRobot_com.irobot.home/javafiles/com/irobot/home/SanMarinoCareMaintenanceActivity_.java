// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			SanMarinoCareMaintenanceActivity

public final class SanMarinoCareMaintenanceActivity_ extends SanMarinoCareMaintenanceActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #30  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #34  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #40  <Method void android.support.v4.app.Fragment.startActivityForResult(android.content.Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #25  <Field Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #25  <Field Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #34  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #43  <Field Bundle a>
		//   20   42:invokevirtual   #46  <Method void Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #50  <Field Context b>
		//*  24   52:instanceof      #52  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #50  <Field Context b>
		//   28   62:checkcast       #52  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #34  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #43  <Field Bundle a>
		//   34   74:invokestatic    #57  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #50  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #34  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #43  <Field Bundle a>
		//   42   92:invokevirtual   #63  <Method void Context.startActivity(android.content.Intent, Bundle)>
			return new e(b);
		//   43   95:new             #65  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #50  <Field Context b>
		//   47  103:invokespecial   #67  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/SanMarinoCareMaintenanceActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class SanMarinoCareMaintenanceActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}

		public a(Context context)
		{
			super(context, com/irobot/home/SanMarinoCareMaintenanceActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class SanMarinoCareMaintenanceActivity_>
		//    3    4:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public SanMarinoCareMaintenanceActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void SanMarinoCareMaintenanceActivity()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void c()>
	//    6   12:putfield        #21  <Field c a>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #10  <Class SanMarinoCareMaintenanceActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #26  <Method void SanMarinoCareMaintenanceActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #10  <Class SanMarinoCareMaintenanceActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #30  <Method void SanMarinoCareMaintenanceActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #38  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method void e()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field c a>
	//    2    4:invokestatic    #48  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #50  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #52  <Method void SanMarinoCareMaintenanceActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #48  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b006c);
	//   13   23:aload_0         
	//   14   24:ldc1            #53  <Int 0x7f0b006c>
	//   15   26:invokevirtual   #57  <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #58  <Method void SanMarinoCareMaintenanceActivity.setContentView(int)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field c a>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #60  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void SanMarinoCareMaintenanceActivity.setContentView(View)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field c a>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #60  <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #66  <Method void SanMarinoCareMaintenanceActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field c a>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #60  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c a = new c();
}
