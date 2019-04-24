// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BetaFeaturesActivity

public final class BetaFeaturesActivity_ extends BetaFeaturesActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #33  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #25  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #45  <Field Context b>
		//*  24   52:instanceof      #47  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #45  <Field Context b>
		//   28   62:checkcast       #47  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #25  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/BetaFeaturesActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BetaFeaturesActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BetaFeaturesActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BetaFeaturesActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c h>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class BetaFeaturesActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void BetaFeaturesActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #37  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = a1.a(0x7f090077);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #41  <Int 0x7f090077>
	//    3    4:invokeinterface #43  <Method View a.a(int)>
	//    4    9:putfield        #47  <Field View b>
		c = (ProgressBar)a1.a(0x7f090223);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #48  <Int 0x7f090223>
	//    8   16:invokeinterface #43  <Method View a.a(int)>
	//    9   21:checkcast       #50  <Class ProgressBar>
	//   10   24:putfield        #54  <Field ProgressBar c>
		d = (CustomTextView)a1.a(0x7f090078);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #55  <Int 0x7f090078>
	//   14   31:invokeinterface #43  <Method View a.a(int)>
	//   15   36:checkcast       #57  <Class CustomTextView>
	//   16   39:putfield        #61  <Field CustomTextView d>
		e = (RecyclerView)a1.a(0x7f09006f);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #62  <Int 0x7f09006f>
	//   20   46:invokeinterface #43  <Method View a.a(int)>
	//   21   51:checkcast       #64  <Class RecyclerView>
	//   22   54:putfield        #68  <Field RecyclerView e>
		f = (Toolbar)a1.a(0x7f09044f);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #69  <Int 0x7f09044f>
	//   26   61:invokeinterface #43  <Method View a.a(int)>
	//   27   66:checkcast       #71  <Class Toolbar>
	//   28   69:putfield        #75  <Field Toolbar f>
		g = a1.a(0x7f0901b5);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:ldc1            #76  <Int 0x7f0901b5>
	//   32   76:invokeinterface #43  <Method View a.a(int)>
	//   33   81:putfield        #79  <Field View g>
		if(d != null)
	//*  34   84:aload_0         
	//*  35   85:getfield        #61  <Field CustomTextView d>
	//*  36   88:ifnull          106
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BetaFeaturesActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BetaFeaturesActivity_.f()>
				//    3    7:return          
				}

				final BetaFeaturesActivity_ a;

			
			{
				a = BetaFeaturesActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BetaFeaturesActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   37   91:aload_0         
	//   38   92:getfield        #61  <Field CustomTextView d>
	//   39   95:new             #10  <Class BetaFeaturesActivity_$1>
	//   40   98:dup             
	//   41   99:aload_0         
	//   42  100:invokespecial   #82  <Method void BetaFeaturesActivity_$1(BetaFeaturesActivity_)>
	//   43  103:invokevirtual   #86  <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   44  106:aload_0         
	//   45  107:invokevirtual   #88  <Method void e()>
	//   46  110:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(h);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c h>
	//    2    4:invokestatic    #92  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #94  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #96  <Method void BetaFeaturesActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #92  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0027);
	//   13   23:aload_0         
	//   14   24:ldc1            #97  <Int 0x7f0b0027>
	//   15   26:invokevirtual   #101 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #102 <Method void BetaFeaturesActivity.setContentView(int)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c h>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #104 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void BetaFeaturesActivity.setContentView(View)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c h>
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
	//    3    3:invokespecial   #110 <Method void BetaFeaturesActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		h.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c h>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #104 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c h = new c();
}
