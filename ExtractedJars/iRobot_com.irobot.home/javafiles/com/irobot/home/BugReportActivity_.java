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
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BugReportActivity

public final class BugReportActivity_ extends BugReportActivity
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
		//    4    7:checkcast       #2   <Class BugReportActivity_$a>
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
			return (a)super.a("imagePath", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "imagePath">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class BugReportActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/BugReportActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BugReportActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BugReportActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BugReportActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c l>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class BugReportActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void BugReportActivity_$a(Context)>
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
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #48  <String "assetId">
	//*   8   15:invokevirtual   #54  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				g = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #48  <String "assetId">
	//   13   25:invokevirtual   #58  <Method String Bundle.getString(String)>
	//   14   28:putfield        #61  <Field String g>
			if(bundle.containsKey("imagePath"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #63  <String "imagePath">
	//*  17   34:invokevirtual   #54  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				h = bundle.getString("imagePath");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #63  <String "imagePath">
	//   22   44:invokevirtual   #58  <Method String Bundle.getString(String)>
	//   23   47:putfield        #66  <Field String h>
		}
	//   24   50:return          
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
		a = (EditText)a1.a(0x7f090336);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #74  <Int 0x7f090336>
	//    3    4:invokeinterface #76  <Method View a.a(int)>
	//    4    9:checkcast       #78  <Class EditText>
	//    5   12:putfield        #81  <Field EditText a>
		b = (SwitchCompat)a1.a(0x7f0900a3);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #82  <Int 0x7f0900a3>
	//    9   19:invokeinterface #76  <Method View a.a(int)>
	//   10   24:checkcast       #84  <Class SwitchCompat>
	//   11   27:putfield        #88  <Field SwitchCompat b>
		c = (CustomTextView)a1.a(0x7f090337);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #89  <Int 0x7f090337>
	//   15   34:invokeinterface #76  <Method View a.a(int)>
	//   16   39:checkcast       #91  <Class CustomTextView>
	//   17   42:putfield        #95  <Field CustomTextView c>
		d = (Spinner)a1.a(0x7f0900a2);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #96  <Int 0x7f0900a2>
	//   21   49:invokeinterface #76  <Method View a.a(int)>
	//   22   54:checkcast       #98  <Class Spinner>
	//   23   57:putfield        #102 <Field Spinner d>
		e = (Spinner)a1.a(0x7f09009f);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #103 <Int 0x7f09009f>
	//   27   64:invokeinterface #76  <Method View a.a(int)>
	//   28   69:checkcast       #98  <Class Spinner>
	//   29   72:putfield        #106 <Field Spinner e>
		f = (Button)a1.a(0x7f09009c);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #107 <Int 0x7f09009c>
	//   33   79:invokeinterface #76  <Method View a.a(int)>
	//   34   84:checkcast       #109 <Class Button>
	//   35   87:putfield        #113 <Field Button f>
		if(f != null)
	//*  36   90:aload_0         
	//*  37   91:getfield        #113 <Field Button f>
	//*  38   94:ifnull          112
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BugReportActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BugReportActivity_.f()>
				//    3    7:return          
				}

				final BugReportActivity_ a;

			
			{
				a = BugReportActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BugReportActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   39   97:aload_0         
	//   40   98:getfield        #113 <Field Button f>
	//   41  101:new             #10  <Class BugReportActivity_$1>
	//   42  104:dup             
	//   43  105:aload_0         
	//   44  106:invokespecial   #116 <Method void BugReportActivity_$1(BugReportActivity_)>
	//   45  109:invokevirtual   #120 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   46  112:aload_0         
	//   47  113:invokevirtual   #122 <Method void e()>
	//   48  116:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c l>
	//    2    4:invokestatic    #126 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #128 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #130 <Method void BugReportActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #126 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0033);
	//   13   23:aload_0         
	//   14   24:ldc1            #131 <Int 0x7f0b0033>
	//   15   26:invokevirtual   #135 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #136 <Method void BugReportActivity.setContentView(int)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #138 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #141 <Method void BugReportActivity.setContentView(View)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c l>
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
	//    3    3:invokespecial   #144 <Method void BugReportActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #138 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void BugReportActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #36  <Method void g()>
	//    5    9:return          
	}

	private final c l = new c();
}
