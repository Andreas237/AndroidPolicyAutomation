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
import android.widget.RelativeLayout;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			DetailedWifiSettingsActivity

public final class DetailedWifiSettingsActivity_ extends DetailedWifiSettingsActivity
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
		//    4    7:checkcast       #2   <Class DetailedWifiSettingsActivity_$a>
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
		//    4    7:checkcast       #2   <Class DetailedWifiSettingsActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/DetailedWifiSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class DetailedWifiSettingsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public DetailedWifiSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void DetailedWifiSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void c()>
	//    6   12:putfield        #22  <Field c m>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #10  <Class DetailedWifiSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void DetailedWifiSettingsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void f()>
	//    4    8:return          
	}

	private void f()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Intent getIntent()>
	//    2    4:invokevirtual   #44  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("robotBlid"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #46  <String "robotBlid">
	//*   8   15:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				k = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #46  <String "robotBlid">
	//   13   25:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   14   28:putfield        #60  <Field String k>
			if(bundle.containsKey("robotName"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #62  <String "robotName">
	//*  17   34:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				l = bundle.getString("robotName");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #62  <String "robotName">
	//   22   44:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   23   47:putfield        #65  <Field String l>
		}
	//   24   50:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #69  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (RelativeLayout)a1.a(0x7f0903df);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #73  <Int 0x7f0903df>
	//    3    4:invokeinterface #75  <Method View a.a(int)>
	//    4    9:checkcast       #77  <Class RelativeLayout>
	//    5   12:putfield        #80  <Field RelativeLayout a>
		b = (RelativeLayout)a1.a(0x7f090117);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #81  <Int 0x7f090117>
	//    9   19:invokeinterface #75  <Method View a.a(int)>
	//   10   24:checkcast       #77  <Class RelativeLayout>
	//   11   27:putfield        #84  <Field RelativeLayout b>
		c = (RelativeLayout)a1.a(0x7f0903be);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #85  <Int 0x7f0903be>
	//   15   34:invokeinterface #75  <Method View a.a(int)>
	//   16   39:checkcast       #77  <Class RelativeLayout>
	//   17   42:putfield        #88  <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f0901ea);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #89  <Int 0x7f0901ea>
	//   21   49:invokeinterface #75  <Method View a.a(int)>
	//   22   54:checkcast       #77  <Class RelativeLayout>
	//   23   57:putfield        #92  <Field RelativeLayout d>
		e = (RelativeLayout)a1.a(0x7f09041e);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #93  <Int 0x7f09041e>
	//   27   64:invokeinterface #75  <Method View a.a(int)>
	//   28   69:checkcast       #77  <Class RelativeLayout>
	//   29   72:putfield        #96  <Field RelativeLayout e>
		f = (RelativeLayout)a1.a(0x7f09014d);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #97  <Int 0x7f09014d>
	//   33   79:invokeinterface #75  <Method View a.a(int)>
	//   34   84:checkcast       #77  <Class RelativeLayout>
	//   35   87:putfield        #99  <Field RelativeLayout f>
		g = (RelativeLayout)a1.a(0x7f090375);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #100 <Int 0x7f090375>
	//   39   94:invokeinterface #75  <Method View a.a(int)>
	//   40   99:checkcast       #77  <Class RelativeLayout>
	//   41  102:putfield        #103 <Field RelativeLayout g>
		h = (RelativeLayout)a1.a(0x7f090159);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #104 <Int 0x7f090159>
	//   45  109:invokeinterface #75  <Method View a.a(int)>
	//   46  114:checkcast       #77  <Class RelativeLayout>
	//   47  117:putfield        #107 <Field RelativeLayout h>
		i = (RelativeLayout)a1.a(0x7f09022d);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #108 <Int 0x7f09022d>
	//   51  124:invokeinterface #75  <Method View a.a(int)>
	//   52  129:checkcast       #77  <Class RelativeLayout>
	//   53  132:putfield        #111 <Field RelativeLayout i>
		j = (RelativeLayout)a1.a(0x7f090092);
	//   54  135:aload_0         
	//   55  136:aload_1         
	//   56  137:ldc1            #112 <Int 0x7f090092>
	//   57  139:invokeinterface #75  <Method View a.a(int)>
	//   58  144:checkcast       #77  <Class RelativeLayout>
	//   59  147:putfield        #115 <Field RelativeLayout j>
		e();
	//   60  150:aload_0         
	//   61  151:invokevirtual   #117 <Method void e()>
	//   62  154:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(m);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field c m>
	//    2    4:invokestatic    #121 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #123 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #125 <Method void DetailedWifiSettingsActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #121 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b003b);
	//   13   23:aload_0         
	//   14   24:ldc1            #126 <Int 0x7f0b003b>
	//   15   26:invokevirtual   #130 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #131 <Method void DetailedWifiSettingsActivity.setContentView(int)>
		m.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c m>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #133 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void DetailedWifiSettingsActivity.setContentView(View)>
		m.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c m>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #133 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #139 <Method void DetailedWifiSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		m.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field c m>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #133 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void DetailedWifiSettingsActivity.setIntent(Intent)>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void f()>
	//    5    9:return          
	}

	private final c m = new c();
}
