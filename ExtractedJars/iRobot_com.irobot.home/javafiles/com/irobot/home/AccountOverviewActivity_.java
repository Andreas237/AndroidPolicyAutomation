// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			AccountOverviewActivity

public final class AccountOverviewActivity_ extends AccountOverviewActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
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
				d.startActivityForResult(c, j, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
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
			super(context, com/irobot/home/AccountOverviewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class AccountOverviewActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public AccountOverviewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AccountOverviewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void c()>
	//    6   12:putfield        #30  <Field c i>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #18  <Class AccountOverviewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void AccountOverviewActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #43  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (RelativeLayout)a1.a(0x7f09001a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #47  <Int 0x7f09001a>
	//    3    4:invokeinterface #49  <Method View a.a(int)>
	//    4    9:checkcast       #51  <Class RelativeLayout>
	//    5   12:putfield        #54  <Field RelativeLayout a>
		b = (RelativeLayout)a1.a(0x7f09001b);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #55  <Int 0x7f09001b>
	//    9   19:invokeinterface #49  <Method View a.a(int)>
	//   10   24:checkcast       #51  <Class RelativeLayout>
	//   11   27:putfield        #58  <Field RelativeLayout b>
		c = (CustomButton)a1.a(0x7f090229);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #59  <Int 0x7f090229>
	//   15   34:invokeinterface #49  <Method View a.a(int)>
	//   16   39:checkcast       #61  <Class CustomButton>
	//   17   42:putfield        #65  <Field CustomButton c>
		d = (CustomButton)a1.a(0x7f0902a3);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #66  <Int 0x7f0902a3>
	//   21   49:invokeinterface #49  <Method View a.a(int)>
	//   22   54:checkcast       #61  <Class CustomButton>
	//   23   57:putfield        #69  <Field CustomButton d>
		e = (CustomTextView)a1.a(0x7f09018f);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #70  <Int 0x7f09018f>
	//   27   64:invokeinterface #49  <Method View a.a(int)>
	//   28   69:checkcast       #72  <Class CustomTextView>
	//   29   72:putfield        #76  <Field CustomTextView e>
		f = (CustomTextView)a1.a(0x7f090484);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #77  <Int 0x7f090484>
	//   33   79:invokeinterface #49  <Method View a.a(int)>
	//   34   84:checkcast       #72  <Class CustomTextView>
	//   35   87:putfield        #80  <Field CustomTextView f>
		g = (CustomTextView)a1.a(0x7f090483);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #81  <Int 0x7f090483>
	//   39   94:invokeinterface #49  <Method View a.a(int)>
	//   40   99:checkcast       #72  <Class CustomTextView>
	//   41  102:putfield        #84  <Field CustomTextView g>
		h = a1.a(0x7f0902a4);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #85  <Int 0x7f0902a4>
	//   45  109:invokeinterface #49  <Method View a.a(int)>
	//   46  114:putfield        #89  <Field View h>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090303)));
	//   47  117:aload_1         
	//   48  118:ldc1            #90  <Int 0x7f090303>
	//   49  120:invokeinterface #49  <Method View a.a(int)>
	//   50  125:astore_1        
		if(a != null)
	//*  51  126:aload_0         
	//*  52  127:getfield        #54  <Field RelativeLayout a>
	//*  53  130:ifnull          148
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AccountOverviewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AccountOverviewActivity_.f()>
				//    3    7:return          
				}

				final AccountOverviewActivity_ a;

			
			{
				a = AccountOverviewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AccountOverviewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   54  133:aload_0         
	//   55  134:getfield        #54  <Field RelativeLayout a>
	//   56  137:new             #10  <Class AccountOverviewActivity_$1>
	//   57  140:dup             
	//   58  141:aload_0         
	//   59  142:invokespecial   #93  <Method void AccountOverviewActivity_$1(AccountOverviewActivity_)>
	//   60  145:invokevirtual   #97  <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(c != null)
	//*  61  148:aload_0         
	//*  62  149:getfield        #65  <Field CustomButton c>
	//*  63  152:ifnull          170
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AccountOverviewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AccountOverviewActivity_.g()>
				//    3    7:return          
				}

				final AccountOverviewActivity_ a;

			
			{
				a = AccountOverviewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AccountOverviewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   64  155:aload_0         
	//   65  156:getfield        #65  <Field CustomButton c>
	//   66  159:new             #12  <Class AccountOverviewActivity_$2>
	//   67  162:dup             
	//   68  163:aload_0         
	//   69  164:invokespecial   #98  <Method void AccountOverviewActivity_$2(AccountOverviewActivity_)>
	//   70  167:invokevirtual   #99  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//*  71  170:aload_1         
	//*  72  171:ifnull          186
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AccountOverviewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AccountOverviewActivity_.h()>
				//    3    7:return          
				}

				final AccountOverviewActivity_ a;

			
			{
				a = AccountOverviewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AccountOverviewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   73  174:aload_1         
	//   74  175:new             #14  <Class AccountOverviewActivity_$3>
	//   75  178:dup             
	//   76  179:aload_0         
	//   77  180:invokespecial   #100 <Method void AccountOverviewActivity_$3(AccountOverviewActivity_)>
	//   78  183:invokevirtual   #103 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  79  186:aload_0         
	//*  80  187:getfield        #69  <Field CustomButton d>
	//*  81  190:ifnull          208
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AccountOverviewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AccountOverviewActivity_.i()>
				//    3    7:return          
				}

				final AccountOverviewActivity_ a;

			
			{
				a = AccountOverviewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AccountOverviewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   82  193:aload_0         
	//   83  194:getfield        #69  <Field CustomButton d>
	//   84  197:new             #16  <Class AccountOverviewActivity_$4>
	//   85  200:dup             
	//   86  201:aload_0         
	//   87  202:invokespecial   #104 <Method void AccountOverviewActivity_$4(AccountOverviewActivity_)>
	//   88  205:invokevirtual   #99  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   89  208:aload_0         
	//   90  209:invokevirtual   #106 <Method void e()>
	//   91  212:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field c i>
	//    2    4:invokestatic    #110 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #112 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #114 <Method void AccountOverviewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #110 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0023);
	//   13   23:aload_0         
	//   14   24:ldc1            #115 <Int 0x7f0b0023>
	//   15   26:invokevirtual   #119 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #120 <Method void AccountOverviewActivity.setContentView(int)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #122 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #125 <Method void AccountOverviewActivity.setContentView(View)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field c i>
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
	//    3    3:invokespecial   #128 <Method void AccountOverviewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #122 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c i = new c();
}
