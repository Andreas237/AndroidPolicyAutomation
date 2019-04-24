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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			MapCustomizationCompleteActivity

public final class MapCustomizationCompleteActivity_ extends MapCustomizationCompleteActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("floorPlanName", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "floorPlanName">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class MapCustomizationCompleteActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
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
				d.startActivityForResult(c, j, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
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
			super(context, com/irobot/home/MapCustomizationCompleteActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class MapCustomizationCompleteActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public MapCustomizationCompleteActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void MapCustomizationCompleteActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c k>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #16  <Class MapCustomizationCompleteActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void MapCustomizationCompleteActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void i()>
	//    4    8:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method Intent getIntent()>
	//    2    4:invokevirtual   #50  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("floorPlanName"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #52  <String "floorPlanName">
	//*   8   15:invokevirtual   #58  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			j = bundle.getString("floorPlanName");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #52  <String "floorPlanName">
	//   13   25:invokevirtual   #62  <Method String Bundle.getString(String)>
	//   14   28:putfield        #66  <Field String j>
	//   15   31:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (FrameLayout)a1.a(0x7f0903ca);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #74  <Int 0x7f0903ca>
	//    3    4:invokeinterface #76  <Method View a.a(int)>
	//    4    9:checkcast       #78  <Class FrameLayout>
	//    5   12:putfield        #81  <Field FrameLayout a>
		b = (CustomTextView)a1.a(0x7f0901b2);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #82  <Int 0x7f0901b2>
	//    9   19:invokeinterface #76  <Method View a.a(int)>
	//   10   24:checkcast       #84  <Class CustomTextView>
	//   11   27:putfield        #88  <Field CustomTextView b>
		c = (CustomButton)a1.a(0x7f0900e2);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #89  <Int 0x7f0900e2>
	//   15   34:invokeinterface #76  <Method View a.a(int)>
	//   16   39:checkcast       #91  <Class CustomButton>
	//   17   42:putfield        #95  <Field CustomButton c>
		d = (CustomButton)a1.a(0x7f090399);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #96  <Int 0x7f090399>
	//   21   49:invokeinterface #76  <Method View a.a(int)>
	//   22   54:checkcast       #91  <Class CustomButton>
	//   23   57:putfield        #99  <Field CustomButton d>
		e = (CustomTextView)a1.a(0x7f09024c);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #100 <Int 0x7f09024c>
	//   27   64:invokeinterface #76  <Method View a.a(int)>
	//   28   69:checkcast       #84  <Class CustomTextView>
	//   29   72:putfield        #103 <Field CustomTextView e>
		f = (LinearLayout)a1.a(0x7f09011a);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #104 <Int 0x7f09011a>
	//   33   79:invokeinterface #76  <Method View a.a(int)>
	//   34   84:checkcast       #106 <Class LinearLayout>
	//   35   87:putfield        #110 <Field LinearLayout f>
		if(c != null)
	//*  36   90:aload_0         
	//*  37   91:getfield        #95  <Field CustomButton c>
	//*  38   94:ifnull          112
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationCompleteActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationCompleteActivity_.f()>
				//    3    7:return          
				}

				final MapCustomizationCompleteActivity_ a;

			
			{
				a = MapCustomizationCompleteActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationCompleteActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   39   97:aload_0         
	//   40   98:getfield        #95  <Field CustomButton c>
	//   41  101:new             #10  <Class MapCustomizationCompleteActivity_$1>
	//   42  104:dup             
	//   43  105:aload_0         
	//   44  106:invokespecial   #113 <Method void MapCustomizationCompleteActivity_$1(MapCustomizationCompleteActivity_)>
	//   45  109:invokevirtual   #117 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  46  112:aload_0         
	//*  47  113:getfield        #99  <Field CustomButton d>
	//*  48  116:ifnull          134
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationCompleteActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationCompleteActivity_.g()>
				//    3    7:return          
				}

				final MapCustomizationCompleteActivity_ a;

			
			{
				a = MapCustomizationCompleteActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationCompleteActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   49  119:aload_0         
	//   50  120:getfield        #99  <Field CustomButton d>
	//   51  123:new             #12  <Class MapCustomizationCompleteActivity_$2>
	//   52  126:dup             
	//   53  127:aload_0         
	//   54  128:invokespecial   #118 <Method void MapCustomizationCompleteActivity_$2(MapCustomizationCompleteActivity_)>
	//   55  131:invokevirtual   #117 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  56  134:aload_0         
	//*  57  135:getfield        #103 <Field CustomTextView e>
	//*  58  138:ifnull          156
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MapCustomizationCompleteActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MapCustomizationCompleteActivity_.h()>
				//    3    7:return          
				}

				final MapCustomizationCompleteActivity_ a;

			
			{
				a = MapCustomizationCompleteActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MapCustomizationCompleteActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   59  141:aload_0         
	//   60  142:getfield        #103 <Field CustomTextView e>
	//   61  145:new             #14  <Class MapCustomizationCompleteActivity_$3>
	//   62  148:dup             
	//   63  149:aload_0         
	//   64  150:invokespecial   #119 <Method void MapCustomizationCompleteActivity_$3(MapCustomizationCompleteActivity_)>
	//   65  153:invokevirtual   #120 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   66  156:aload_0         
	//   67  157:invokevirtual   #122 <Method void e()>
	//   68  160:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(k);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c k>
	//    2    4:invokestatic    #126 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #128 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #130 <Method void MapCustomizationCompleteActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #126 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b004e);
	//   13   23:aload_0         
	//   14   24:ldc1            #131 <Int 0x7f0b004e>
	//   15   26:invokevirtual   #135 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #136 <Method void MapCustomizationCompleteActivity.setContentView(int)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #138 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #141 <Method void MapCustomizationCompleteActivity.setContentView(View)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #138 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #144 <Method void MapCustomizationCompleteActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c k>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #138 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void MapCustomizationCompleteActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void i()>
	//    5    9:return          
	}

	private final c k = new c();
}
