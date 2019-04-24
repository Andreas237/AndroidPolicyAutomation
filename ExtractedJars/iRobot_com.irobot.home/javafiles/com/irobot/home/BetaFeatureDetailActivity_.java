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
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.irobot.core.FeatureType;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BetaFeatureDetailActivity

public final class BetaFeatureDetailActivity_ extends BetaFeatureDetailActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(FeatureType featuretype)
		{
			return (a)super.a("featureType", ((java.io.Serializable) (featuretype)));
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "featureType">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class BetaFeatureDetailActivity_$a>
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

		public a b(int i)
		{
			return (a)super.a("titleResource", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #71  <String "titleResource">
		//    2    3:iload_1         
		//    3    4:invokespecial   #74  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class BetaFeatureDetailActivity_$a>
		//    5   10:areturn         
		}

		public a c(int i)
		{
			return (a)super.a("explanationResource", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #76  <String "explanationResource">
		//    2    3:iload_1         
		//    3    4:invokespecial   #74  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class BetaFeatureDetailActivity_$a>
		//    5   10:areturn         
		}

		public a d(int i)
		{
			return (a)super.a("instructionsResource", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #78  <String "instructionsResource">
		//    2    3:iload_1         
		//    3    4:invokespecial   #74  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class BetaFeatureDetailActivity_$a>
		//    5   10:areturn         
		}

		public a e(int i)
		{
			return (a)super.a("footerResource", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #80  <String "footerResource">
		//    2    3:iload_1         
		//    3    4:invokespecial   #74  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class BetaFeatureDetailActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/BetaFeatureDetailActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BetaFeatureDetailActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BetaFeatureDetailActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void BetaFeatureDetailActivity()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void c()>
	//    6   12:putfield        #22  <Field c l>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #10  <Class BetaFeatureDetailActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void BetaFeatureDetailActivity_$a(Context)>
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
	//*   5    9:ifnull          110
		{
			if(bundle.containsKey("titleResource"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #46  <String "titleResource">
	//*   8   15:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getInt("titleResource");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #46  <String "titleResource">
	//   13   25:invokevirtual   #56  <Method int Bundle.getInt(String)>
	//   14   28:putfield        #59  <Field int a>
			if(bundle.containsKey("explanationResource"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #61  <String "explanationResource">
	//*  17   34:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getInt("explanationResource");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #61  <String "explanationResource">
	//   22   44:invokevirtual   #56  <Method int Bundle.getInt(String)>
	//   23   47:putfield        #64  <Field int b>
			if(bundle.containsKey("instructionsResource"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #66  <String "instructionsResource">
	//*  26   53:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				c = bundle.getInt("instructionsResource");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #66  <String "instructionsResource">
	//   31   63:invokevirtual   #56  <Method int Bundle.getInt(String)>
	//   32   66:putfield        #69  <Field int c>
			if(bundle.containsKey("footerResource"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #71  <String "footerResource">
	//*  35   72:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				d = bundle.getInt("footerResource");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #71  <String "footerResource">
	//   40   82:invokevirtual   #56  <Method int Bundle.getInt(String)>
	//   41   85:putfield        #74  <Field int d>
			if(bundle.containsKey("featureType"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #76  <String "featureType">
	//*  44   91:invokevirtual   #52  <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            110
				k = (FeatureType)bundle.getSerializable("featureType");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #76  <String "featureType">
	//   49  101:invokevirtual   #80  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   50  104:checkcast       #82  <Class FeatureType>
	//   51  107:putfield        #86  <Field FeatureType k>
		}
	//   52  110:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #90  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		e = (CustomTextView)a1.a(0x7f09006a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #94  <Int 0x7f09006a>
	//    3    4:invokeinterface #96  <Method View a.a(int)>
	//    4    9:checkcast       #98  <Class CustomTextView>
	//    5   12:putfield        #102 <Field CustomTextView e>
		f = (CustomTextView)a1.a(0x7f09006d);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #103 <Int 0x7f09006d>
	//    9   19:invokeinterface #96  <Method View a.a(int)>
	//   10   24:checkcast       #98  <Class CustomTextView>
	//   11   27:putfield        #105 <Field CustomTextView f>
		g = a1.a(0x7f09006c);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #106 <Int 0x7f09006c>
	//   15   34:invokeinterface #96  <Method View a.a(int)>
	//   16   39:putfield        #110 <Field View g>
		h = (CustomTextView)a1.a(0x7f09006b);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #111 <Int 0x7f09006b>
	//   20   46:invokeinterface #96  <Method View a.a(int)>
	//   21   51:checkcast       #98  <Class CustomTextView>
	//   22   54:putfield        #114 <Field CustomTextView h>
		i = (Toolbar)a1.a(0x7f09044f);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #115 <Int 0x7f09044f>
	//   26   61:invokeinterface #96  <Method View a.a(int)>
	//   27   66:checkcast       #117 <Class Toolbar>
	//   28   69:putfield        #121 <Field Toolbar i>
		j = a1.a(0x7f0901b5);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:ldc1            #122 <Int 0x7f0901b5>
	//   32   76:invokeinterface #96  <Method View a.a(int)>
	//   33   81:putfield        #125 <Field View j>
		e();
	//   34   84:aload_0         
	//   35   85:invokevirtual   #127 <Method void e()>
	//   36   88:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field c l>
	//    2    4:invokestatic    #131 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #133 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #135 <Method void BetaFeatureDetailActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #131 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0026);
	//   13   23:aload_0         
	//   14   24:ldc1            #136 <Int 0x7f0b0026>
	//   15   26:invokevirtual   #140 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #141 <Method void BetaFeatureDetailActivity.setContentView(int)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #143 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #146 <Method void BetaFeatureDetailActivity.setContentView(View)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #143 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #149 <Method void BetaFeatureDetailActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #143 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void BetaFeatureDetailActivity.setIntent(Intent)>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void f()>
	//    5    9:return          
	}

	private final c l = new c();
}
