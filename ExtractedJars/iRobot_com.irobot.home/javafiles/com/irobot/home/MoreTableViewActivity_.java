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
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomButton;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			MoreTableViewActivity

public final class MoreTableViewActivity_ extends MoreTableViewActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("robotBlid", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #29  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class MoreTableViewActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #39  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #45  <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
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
		//   16   34:getfield        #39  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #48  <Field Bundle a>
		//   20   42:invokevirtual   #51  <Method void Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #55  <Field Context b>
		//*  24   52:instanceof      #57  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #55  <Field Context b>
		//   28   62:checkcast       #57  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #39  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #48  <Field Bundle a>
		//   34   74:invokestatic    #62  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #55  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #39  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #48  <Field Bundle a>
		//   42   92:invokevirtual   #68  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #70  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #55  <Field Context b>
		//   47  103:invokespecial   #73  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/MoreTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class MoreTableViewActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}
	}


	public MoreTableViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void MoreTableViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void c()>
	//    6   12:putfield        #34  <Field c j>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #22  <Class MoreTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void MoreTableViewActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method void c.a(b)>
		m();
	//    2    4:aload_0         
	//    3    5:invokespecial   #46  <Method void m()>
	//    4    8:return          
	}

	private void m()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method Intent getIntent()>
	//    2    4:invokevirtual   #56  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #58  <String "robotBlid">
	//*   8   15:invokevirtual   #64  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #58  <String "robotBlid">
	//   13   25:invokevirtual   #68  <Method String Bundle.getString(String)>
	//   14   28:putfield        #71  <Field String a>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #75  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomButton)a1.a(0x7f090226);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #79  <Int 0x7f090226>
	//    3    4:invokeinterface #81  <Method View a.a(int)>
	//    4    9:checkcast       #83  <Class CustomButton>
	//    5   12:putfield        #87  <Field CustomButton b>
		c = a1.a(0x7f0900b4);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #88  <Int 0x7f0900b4>
	//    9   19:invokeinterface #81  <Method View a.a(int)>
	//   10   24:putfield        #92  <Field View c>
		d = a1.a(0x7f0902fd);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #93  <Int 0x7f0902fd>
	//   14   31:invokeinterface #81  <Method View a.a(int)>
	//   15   36:putfield        #96  <Field View d>
		e = (CustomButton)a1.a(0x7f090302);
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:ldc1            #97  <Int 0x7f090302>
	//   19   43:invokeinterface #81  <Method View a.a(int)>
	//   20   48:checkcast       #83  <Class CustomButton>
	//   21   51:putfield        #100 <Field CustomButton e>
		f = (RelativeLayout)a1.a(0x7f0903c7);
	//   22   54:aload_0         
	//   23   55:aload_1         
	//   24   56:ldc1            #101 <Int 0x7f0903c7>
	//   25   58:invokeinterface #81  <Method View a.a(int)>
	//   26   63:checkcast       #103 <Class RelativeLayout>
	//   27   66:putfield        #107 <Field RelativeLayout f>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f0901be)));
	//   28   69:aload_1         
	//   29   70:ldc1            #108 <Int 0x7f0901be>
	//   30   72:invokeinterface #81  <Method View a.a(int)>
	//   31   77:astore_1        
		if(c != null)
	//*  32   78:aload_0         
	//*  33   79:getfield        #92  <Field View c>
	//*  34   82:ifnull          100
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoreTableViewActivity_.f()>
				//    3    7:return          
				}

				final MoreTableViewActivity_ a;

			
			{
				a = MoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   35   85:aload_0         
	//   36   86:getfield        #92  <Field View c>
	//   37   89:new             #10  <Class MoreTableViewActivity_$1>
	//   38   92:dup             
	//   39   93:aload_0         
	//   40   94:invokespecial   #111 <Method void MoreTableViewActivity_$1(MoreTableViewActivity_)>
	//   41   97:invokevirtual   #117 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  42  100:aload_0         
	//*  43  101:getfield        #96  <Field View d>
	//*  44  104:ifnull          122
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoreTableViewActivity_.g()>
				//    3    7:return          
				}

				final MoreTableViewActivity_ a;

			
			{
				a = MoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   45  107:aload_0         
	//   46  108:getfield        #96  <Field View d>
	//   47  111:new             #12  <Class MoreTableViewActivity_$2>
	//   48  114:dup             
	//   49  115:aload_0         
	//   50  116:invokespecial   #118 <Method void MoreTableViewActivity_$2(MoreTableViewActivity_)>
	//   51  119:invokevirtual   #117 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//*  52  122:aload_1         
	//*  53  123:ifnull          138
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoreTableViewActivity_.h()>
				//    3    7:return          
				}

				final MoreTableViewActivity_ a;

			
			{
				a = MoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   54  126:aload_1         
	//   55  127:new             #14  <Class MoreTableViewActivity_$3>
	//   56  130:dup             
	//   57  131:aload_0         
	//   58  132:invokespecial   #119 <Method void MoreTableViewActivity_$3(MoreTableViewActivity_)>
	//   59  135:invokevirtual   #117 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//*  60  138:aload_0         
	//*  61  139:getfield        #107 <Field RelativeLayout f>
	//*  62  142:ifnull          160
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoreTableViewActivity_.i()>
				//    3    7:return          
				}

				final MoreTableViewActivity_ a;

			
			{
				a = MoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   63  145:aload_0         
	//   64  146:getfield        #107 <Field RelativeLayout f>
	//   65  149:new             #16  <Class MoreTableViewActivity_$4>
	//   66  152:dup             
	//   67  153:aload_0         
	//   68  154:invokespecial   #120 <Method void MoreTableViewActivity_$4(MoreTableViewActivity_)>
	//   69  157:invokevirtual   #121 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(b != null)
	//*  70  160:aload_0         
	//*  71  161:getfield        #87  <Field CustomButton b>
	//*  72  164:ifnull          182
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoreTableViewActivity_.j()>
				//    3    7:return          
				}

				final MoreTableViewActivity_ a;

			
			{
				a = MoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   73  167:aload_0         
	//   74  168:getfield        #87  <Field CustomButton b>
	//   75  171:new             #18  <Class MoreTableViewActivity_$5>
	//   76  174:dup             
	//   77  175:aload_0         
	//   78  176:invokespecial   #122 <Method void MoreTableViewActivity_$5(MoreTableViewActivity_)>
	//   79  179:invokevirtual   #123 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  80  182:aload_0         
	//*  81  183:getfield        #100 <Field CustomButton e>
	//*  82  186:ifnull          204
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field MoreTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void MoreTableViewActivity_.k()>
				//    3    7:return          
				}

				final MoreTableViewActivity_ a;

			
			{
				a = MoreTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MoreTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   83  189:aload_0         
	//   84  190:getfield        #100 <Field CustomButton e>
	//   85  193:new             #20  <Class MoreTableViewActivity_$6>
	//   86  196:dup             
	//   87  197:aload_0         
	//   88  198:invokespecial   #124 <Method void MoreTableViewActivity_$6(MoreTableViewActivity_)>
	//   89  201:invokevirtual   #123 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   90  204:aload_0         
	//   91  205:invokevirtual   #126 <Method void e()>
	//   92  208:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(j);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field c j>
	//    2    4:invokestatic    #130 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #132 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #134 <Method void MoreTableViewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #130 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0054);
	//   13   23:aload_0         
	//   14   24:ldc1            #135 <Int 0x7f0b0054>
	//   15   26:invokevirtual   #139 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #140 <Method void MoreTableViewActivity.setContentView(int)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c j>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #142 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #145 <Method void MoreTableViewActivity.setContentView(View)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field c j>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #142 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #148 <Method void MoreTableViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		j.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field c j>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #142 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #152 <Method void MoreTableViewActivity.setIntent(Intent)>
		m();
	//    3    5:aload_0         
	//    4    6:invokespecial   #46  <Method void m()>
	//    5    9:return          
	}

	private final c j = new c();
}
