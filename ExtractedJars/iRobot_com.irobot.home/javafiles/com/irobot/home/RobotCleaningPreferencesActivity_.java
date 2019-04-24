// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import com.irobot.home.util.k;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RobotCleaningPreferencesActivity

public final class RobotCleaningPreferencesActivity_ extends RobotCleaningPreferencesActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #33  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RobotCleaningPreferencesActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("isPresetSupported", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #36  <String "isPresetSupported">
		//    2    3:iload_1         
		//    3    4:invokespecial   #39  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class RobotCleaningPreferencesActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #42  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #42  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #46  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #52  <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
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
		//   16   34:getfield        #46  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #55  <Field Bundle a>
		//   20   42:invokevirtual   #58  <Method void Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #62  <Field Context b>
		//*  24   52:instanceof      #64  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #62  <Field Context b>
		//   28   62:checkcast       #64  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #46  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #55  <Field Bundle a>
		//   34   74:invokestatic    #69  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #62  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #46  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #55  <Field Bundle a>
		//   42   92:invokevirtual   #75  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #77  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #62  <Field Context b>
		//   47  103:invokespecial   #79  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/RobotCleaningPreferencesActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class RobotCleaningPreferencesActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}

		public a(Context context)
		{
			super(context, com/irobot/home/RobotCleaningPreferencesActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RobotCleaningPreferencesActivity_>
		//    3    4:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RobotCleaningPreferencesActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void RobotCleaningPreferencesActivity()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void c()>
	//    6   12:putfield        #22  <Field c e>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #10  <Class RobotCleaningPreferencesActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void RobotCleaningPreferencesActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #10  <Class RobotCleaningPreferencesActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void RobotCleaningPreferencesActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		d = new k(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #34  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #35  <Method void k(Context)>
	//    5    9:putfield        #39  <Field k d>
		g();
	//    6   12:aload_0         
	//    7   13:invokespecial   #42  <Method void g()>
		c.a(((b) (this)));
	//    8   16:aload_0         
	//    9   17:invokestatic    #45  <Method void c.a(b)>
	//   10   20:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method Intent getIntent()>
	//    2    4:invokevirtual   #55  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          69
		{
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #57  <String "assetId">
	//*   8   15:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #57  <String "assetId">
	//   13   25:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   14   28:putfield        #70  <Field String a>
			if(bundle.containsKey("isPresetSupported"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #72  <String "isPresetSupported">
	//*  17   34:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getBoolean("isPresetSupported");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #72  <String "isPresetSupported">
	//   22   44:invokevirtual   #75  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #79  <Field boolean b>
			if(bundle.containsKey("shouldSuppressOverlay"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #81  <String "shouldSuppressOverlay">
	//*  26   53:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				c = bundle.getBoolean("shouldSuppressOverlay");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #81  <String "shouldSuppressOverlay">
	//   31   63:invokevirtual   #75  <Method boolean Bundle.getBoolean(String)>
	//   32   66:putfield        #84  <Field boolean c>
		}
	//   33   69:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #88  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method void e()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field c e>
	//    2    4:invokestatic    #97  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #99  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #101 <Method void RobotCleaningPreferencesActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #97  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0068);
	//   13   23:aload_0         
	//   14   24:ldc1            #102 <Int 0x7f0b0068>
	//   15   26:invokevirtual   #106 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #107 <Method void RobotCleaningPreferencesActivity.setContentView(int)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #109 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #112 <Method void RobotCleaningPreferencesActivity.setContentView(View)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #109 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #115 <Method void RobotCleaningPreferencesActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field c e>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #109 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #119 <Method void RobotCleaningPreferencesActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #42  <Method void g()>
	//    5    9:return          
	}

	private final c e = new c();
}
