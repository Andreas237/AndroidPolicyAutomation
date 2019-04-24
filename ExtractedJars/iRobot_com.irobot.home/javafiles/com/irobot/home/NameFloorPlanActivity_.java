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
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			NameFloorPlanActivity

public final class NameFloorPlanActivity_ extends NameFloorPlanActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("doneButtonText", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "doneButtonText">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class NameFloorPlanActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("isRenamingMap", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #27  <String "isRenamingMap">
		//    2    3:iload_1         
		//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class NameFloorPlanActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #37  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #43  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #45  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #45  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #37  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #48  <Field Bundle a>
		//   20   42:invokevirtual   #53  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #57  <Field Context b>
		//*  24   52:instanceof      #59  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #57  <Field Context b>
		//   28   62:checkcast       #59  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #37  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #48  <Field Bundle a>
		//   34   74:invokestatic    #64  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #57  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #37  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #48  <Field Bundle a>
		//   42   92:invokevirtual   #70  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #72  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #57  <Field Context b>
		//   47  103:invokespecial   #74  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/NameFloorPlanActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class NameFloorPlanActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public NameFloorPlanActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void NameFloorPlanActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c d>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class NameFloorPlanActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void NameFloorPlanActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
		g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void g()>
	//    4    8:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method Intent getIntent()>
	//    2    4:invokevirtual   #46  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("doneButtonText"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #48  <String "doneButtonText">
	//*   8   15:invokevirtual   #54  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("doneButtonText");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #48  <String "doneButtonText">
	//   13   25:invokevirtual   #58  <Method String Bundle.getString(String)>
	//   14   28:putfield        #61  <Field String a>
			if(bundle.containsKey("isRenamingMap"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #63  <String "isRenamingMap">
	//*  17   34:invokevirtual   #54  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getBoolean("isRenamingMap");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #63  <String "isRenamingMap">
	//   22   44:invokevirtual   #66  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #70  <Field boolean b>
		}
	//   24   50:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #74  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (CustomTextView)a1.a(0x7f09015b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #78  <Int 0x7f09015b>
	//    3    4:invokeinterface #80  <Method View a.a(int)>
	//    4    9:checkcast       #82  <Class CustomTextView>
	//    5   12:putfield        #86  <Field CustomTextView c>
		if(c != null)
	//*   6   15:aload_0         
	//*   7   16:getfield        #86  <Field CustomTextView c>
	//*   8   19:ifnull          37
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field NameFloorPlanActivity_ a>
				//    2    4:invokevirtual   #25  <Method void NameFloorPlanActivity_.f()>
				//    3    7:return          
				}

				final NameFloorPlanActivity_ a;

			
			{
				a = NameFloorPlanActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NameFloorPlanActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    9   22:aload_0         
	//   10   23:getfield        #86  <Field CustomTextView c>
	//   11   26:new             #10  <Class NameFloorPlanActivity_$1>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:invokespecial   #89  <Method void NameFloorPlanActivity_$1(NameFloorPlanActivity_)>
	//   15   34:invokevirtual   #93  <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #96  <Method void e()>
	//   18   41:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c d>
	//    2    4:invokestatic    #100 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #102 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #104 <Method void NameFloorPlanActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #100 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0055);
	//   13   23:aload_0         
	//   14   24:ldc1            #105 <Int 0x7f0b0055>
	//   15   26:invokevirtual   #109 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #110 <Method void NameFloorPlanActivity.setContentView(int)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #112 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void NameFloorPlanActivity.setContentView(View)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c d>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #112 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #118 <Method void NameFloorPlanActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #112 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void NameFloorPlanActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #36  <Method void g()>
	//    5    9:return          
	}

	private final c d = new c();
}
