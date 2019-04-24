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
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			EnterRegionTypeActivity

public final class EnterRegionTypeActivity_ extends EnterRegionTypeActivity
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
		//    4    7:checkcast       #2   <Class EnterRegionTypeActivity_$a>
		//    5   10:areturn         
		}

		public a a(ArrayList arraylist)
		{
			return (a)super.a("regionNames", ((java.io.Serializable) (arraylist)));
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "regionNames">
		//    2    3:aload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class EnterRegionTypeActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #39  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #45  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #47  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #47  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #39  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #50  <Field Bundle a>
		//   20   42:invokevirtual   #55  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #59  <Field Context b>
		//*  24   52:instanceof      #61  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #59  <Field Context b>
		//   28   62:checkcast       #61  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #39  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #50  <Field Bundle a>
		//   34   74:invokestatic    #66  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #59  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #39  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #50  <Field Bundle a>
		//   42   92:invokevirtual   #72  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #74  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #59  <Field Context b>
		//   47  103:invokespecial   #76  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/EnterRegionTypeActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class EnterRegionTypeActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public EnterRegionTypeActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void EnterRegionTypeActivity()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void c()>
	//    6   12:putfield        #22  <Field c d>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #10  <Class EnterRegionTypeActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void EnterRegionTypeActivity_$a(Context)>
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
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #46  <String "assetId">
	//*   8   15:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #46  <String "assetId">
	//   13   25:invokevirtual   #56  <Method String Bundle.getString(String)>
	//   14   28:putfield        #59  <Field String a>
			if(bundle.containsKey("regionNames"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #61  <String "regionNames">
	//*  17   34:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getStringArrayList("regionNames");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #61  <String "regionNames">
	//   22   44:invokevirtual   #65  <Method ArrayList Bundle.getStringArrayList(String)>
	//   23   47:putfield        #69  <Field ArrayList b>
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
		c = (RecyclerView)a1.a(0x7f090329);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #77  <Int 0x7f090329>
	//    3    4:invokeinterface #79  <Method View a.a(int)>
	//    4    9:checkcast       #81  <Class RecyclerView>
	//    5   12:putfield        #85  <Field RecyclerView c>
		e();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #88  <Method void e()>
	//    8   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field c d>
	//    2    4:invokestatic    #92  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #94  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #96  <Method void EnterRegionTypeActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #92  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b003f);
	//   13   23:aload_0         
	//   14   24:ldc1            #97  <Int 0x7f0b003f>
	//   15   26:invokevirtual   #101 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #102 <Method void EnterRegionTypeActivity.setContentView(int)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #104 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void EnterRegionTypeActivity.setContentView(View)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #104 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #110 <Method void EnterRegionTypeActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #104 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #114 <Method void EnterRegionTypeActivity.setIntent(Intent)>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void f()>
	//    5    9:return          
	}

	private final c d = new c();
}
