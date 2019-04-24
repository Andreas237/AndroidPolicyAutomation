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
import android.widget.ImageView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			FloorPlanActivity, IRobotApplication_

public final class FloorPlanActivity_ extends FloorPlanActivity
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
		//    4    7:checkcast       #2   <Class FloorPlanActivity_$a>
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
			super(context, com/irobot/home/FloorPlanActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class FloorPlanActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public FloorPlanActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void FloorPlanActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c f>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class FloorPlanActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void FloorPlanActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #42  <Field IRobotApplication a>
		h();
	//    5   11:aload_0         
	//    6   12:invokespecial   #45  <Method void h()>
	//    7   15:return          
	}

	private void h()
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
				b = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #57  <String "assetId">
	//   13   25:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   14   28:putfield        #71  <Field String b>
			if(bundle.containsKey("pmapId"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #73  <String "pmapId">
	//*  17   34:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				c = bundle.getString("pmapId");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #73  <String "pmapId">
	//   22   44:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   23   47:putfield        #76  <Field String c>
			if(bundle.containsKey("pmapVersionId"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #78  <String "pmapVersionId">
	//*  26   53:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				d = bundle.getString("pmapVersionId");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #78  <String "pmapVersionId">
	//   31   63:invokevirtual   #67  <Method String Bundle.getString(String)>
	//   32   66:putfield        #81  <Field String d>
		}
	//   33   69:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #85  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		e = (ImageView)a1.a(0x7f09024f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #89  <Int 0x7f09024f>
	//    3    4:invokeinterface #91  <Method View a.a(int)>
	//    4    9:checkcast       #93  <Class ImageView>
	//    5   12:putfield        #97  <Field ImageView e>
		if(e != null)
	//*   6   15:aload_0         
	//*   7   16:getfield        #97  <Field ImageView e>
	//*   8   19:ifnull          37
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field FloorPlanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void FloorPlanActivity_.f()>
				//    3    7:return          
				}

				final FloorPlanActivity_ a;

			
			{
				a = FloorPlanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field FloorPlanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    9   22:aload_0         
	//   10   23:getfield        #97  <Field ImageView e>
	//   11   26:new             #10  <Class FloorPlanActivity_$1>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:invokespecial   #100 <Method void FloorPlanActivity_$1(FloorPlanActivity_)>
	//   15   34:invokevirtual   #104 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #106 <Method void e()>
	//   18   41:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c f>
	//    2    4:invokestatic    #110 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #112 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #114 <Method void FloorPlanActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #110 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0040);
	//   13   23:aload_0         
	//   14   24:ldc1            #115 <Int 0x7f0b0040>
	//   15   26:invokevirtual   #119 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #120 <Method void FloorPlanActivity.setContentView(int)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #122 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #125 <Method void FloorPlanActivity.setContentView(View)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c f>
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
	//    3    3:invokespecial   #128 <Method void FloorPlanActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #122 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #132 <Method void FloorPlanActivity.setIntent(Intent)>
		h();
	//    3    5:aload_0         
	//    4    6:invokespecial   #45  <Method void h()>
	//    5    9:return          
	}

	private final c f = new c();
}
