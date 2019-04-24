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
import android.widget.LinearLayout;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomButton;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaHelpTableViewActivity

public final class BraavaHelpTableViewActivity_ extends BraavaHelpTableViewActivity
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
		//    4    7:checkcast       #2   <Class BraavaHelpTableViewActivity_$a>
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
			super(context, com/irobot/home/BraavaHelpTableViewActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BraavaHelpTableViewActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BraavaHelpTableViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void BraavaHelpTableViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void c()>
	//    6   12:putfield        #48  <Field c v>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #36  <Class BraavaHelpTableViewActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void BraavaHelpTableViewActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		t = new k(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #56  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #57  <Method void k(Context)>
	//    5    9:putfield        #61  <Field k t>
		t = new k(((Context) (this)));
	//    6   12:aload_0         
	//    7   13:new             #56  <Class k>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #57  <Method void k(Context)>
	//   11   21:putfield        #61  <Field k t>
		c.a(((b) (this)));
	//   12   24:aload_0         
	//   13   25:invokestatic    #64  <Method void c.a(b)>
		q();
	//   14   28:aload_0         
	//   15   29:invokespecial   #67  <Method void q()>
	//   16   32:return          
	}

	static void a(BraavaHelpTableViewActivity_ braavahelptableviewactivity_)
	{
		((BraavaHelpTableViewActivity) (braavahelptableviewactivity_)).BraavaHelpTableViewActivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void BraavaHelpTableViewActivity.p()>
	//    2    4:return          
	}

	static void a(BraavaHelpTableViewActivity_ braavahelptableviewactivity_, int i)
	{
		((BraavaHelpTableViewActivity) (braavahelptableviewactivity_)).BraavaHelpTableViewActivity.f(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #76  <Method void BraavaHelpTableViewActivity.f(int)>
	//    3    5:return          
	}

	static void b(BraavaHelpTableViewActivity_ braavahelptableviewactivity_)
	{
		((BraavaHelpTableViewActivity) (braavahelptableviewactivity_)).BraavaHelpTableViewActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void BraavaHelpTableViewActivity.f()>
	//    2    4:return          
	}

	static void b(BraavaHelpTableViewActivity_ braavahelptableviewactivity_, int i)
	{
		((BraavaHelpTableViewActivity) (braavahelptableviewactivity_)).BraavaHelpTableViewActivity.h(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #82  <Method void BraavaHelpTableViewActivity.h(int)>
	//    3    5:return          
	}

	private void q()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method Intent getIntent()>
	//    2    4:invokevirtual   #92  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #94  <String "robotBlid">
	//*   8   15:invokevirtual   #100 <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			l = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #94  <String "robotBlid">
	//   13   25:invokevirtual   #104 <Method String Bundle.getString(String)>
	//   14   28:putfield        #108 <Field String l>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #112 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomButton)a1.a(0x7f09009e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #116 <Int 0x7f09009e>
	//    3    4:invokeinterface #118 <Method View a.a(int)>
	//    4    9:checkcast       #120 <Class CustomButton>
	//    5   12:putfield        #123 <Field CustomButton b>
		c = (CustomButton)a1.a(0x7f090097);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #124 <Int 0x7f090097>
	//    9   19:invokeinterface #118 <Method View a.a(int)>
	//   10   24:checkcast       #120 <Class CustomButton>
	//   11   27:putfield        #127 <Field CustomButton c>
		d = (CustomButton)a1.a(0x7f090096);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #128 <Int 0x7f090096>
	//   15   34:invokeinterface #118 <Method View a.a(int)>
	//   16   39:checkcast       #120 <Class CustomButton>
	//   17   42:putfield        #131 <Field CustomButton d>
		e = (CustomButton)a1.a(0x7f09009d);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #132 <Int 0x7f09009d>
	//   21   49:invokeinterface #118 <Method View a.a(int)>
	//   22   54:checkcast       #120 <Class CustomButton>
	//   23   57:putfield        #135 <Field CustomButton e>
		f = (CustomButton)a1.a(0x7f090098);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #136 <Int 0x7f090098>
	//   27   64:invokeinterface #118 <Method View a.a(int)>
	//   28   69:checkcast       #120 <Class CustomButton>
	//   29   72:putfield        #138 <Field CustomButton f>
		g = (CustomButton)a1.a(0x7f090099);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #139 <Int 0x7f090099>
	//   33   79:invokeinterface #118 <Method View a.a(int)>
	//   34   84:checkcast       #120 <Class CustomButton>
	//   35   87:putfield        #142 <Field CustomButton g>
		h = a1.a(0x7f090497);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #143 <Int 0x7f090497>
	//   39   94:invokeinterface #118 <Method View a.a(int)>
	//   40   99:putfield        #146 <Field View h>
		i = a1.a(0x7f0902ad);
	//   41  102:aload_0         
	//   42  103:aload_1         
	//   43  104:ldc1            #147 <Int 0x7f0902ad>
	//   44  106:invokeinterface #118 <Method View a.a(int)>
	//   45  111:putfield        #150 <Field View i>
		j = a1.a(0x7f090231);
	//   46  114:aload_0         
	//   47  115:aload_1         
	//   48  116:ldc1            #151 <Int 0x7f090231>
	//   49  118:invokeinterface #118 <Method View a.a(int)>
	//   50  123:putfield        #154 <Field View j>
		k = a1.a(0x7f090490);
	//   51  126:aload_0         
	//   52  127:aload_1         
	//   53  128:ldc1            #155 <Int 0x7f090490>
	//   54  130:invokeinterface #118 <Method View a.a(int)>
	//   55  135:putfield        #158 <Field View k>
		u = (LinearLayout)a1.a(0x7f090050);
	//   56  138:aload_0         
	//   57  139:aload_1         
	//   58  140:ldc1            #159 <Int 0x7f090050>
	//   59  142:invokeinterface #118 <Method View a.a(int)>
	//   60  147:checkcast       #161 <Class LinearLayout>
	//   61  150:putfield        #165 <Field LinearLayout u>
		View view = a1.a(0x7f090093);
	//   62  153:aload_1         
	//   63  154:ldc1            #166 <Int 0x7f090093>
	//   64  156:invokeinterface #118 <Method View a.a(int)>
	//   65  161:astore_2        
		View view1 = a1.a(0x7f090094);
	//   66  162:aload_1         
	//   67  163:ldc1            #167 <Int 0x7f090094>
	//   68  165:invokeinterface #118 <Method View a.a(int)>
	//   69  170:astore_3        
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f09009a)));
	//   70  171:aload_1         
	//   71  172:ldc1            #168 <Int 0x7f09009a>
	//   72  174:invokeinterface #118 <Method View a.a(int)>
	//   73  179:astore_1        
		if(view != null)
	//*  74  180:aload_2         
	//*  75  181:ifnull          196
			view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.g()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   76  184:aload_2         
	//   77  185:new             #10  <Class BraavaHelpTableViewActivity_$1>
	//   78  188:dup             
	//   79  189:aload_0         
	//   80  190:invokespecial   #170 <Method void BraavaHelpTableViewActivity_$1(BraavaHelpTableViewActivity_)>
	//   81  193:invokevirtual   #176 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(b != null)
	//*  82  196:aload_0         
	//*  83  197:getfield        #123 <Field CustomButton b>
	//*  84  200:ifnull          218
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.h()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   85  203:aload_0         
	//   86  204:getfield        #123 <Field CustomButton b>
	//   87  207:new             #28  <Class BraavaHelpTableViewActivity_$6>
	//   88  210:dup             
	//   89  211:aload_0         
	//   90  212:invokespecial   #177 <Method void BraavaHelpTableViewActivity_$6(BraavaHelpTableViewActivity_)>
	//   91  215:invokevirtual   #178 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(c != null)
	//*  92  218:aload_0         
	//*  93  219:getfield        #127 <Field CustomButton c>
	//*  94  222:ifnull          240
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.i()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   95  225:aload_0         
	//   96  226:getfield        #127 <Field CustomButton c>
	//   97  229:new             #30  <Class BraavaHelpTableViewActivity_$7>
	//   98  232:dup             
	//   99  233:aload_0         
	//  100  234:invokespecial   #179 <Method void BraavaHelpTableViewActivity_$7(BraavaHelpTableViewActivity_)>
	//  101  237:invokevirtual   #178 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//* 102  240:aload_0         
	//* 103  241:getfield        #131 <Field CustomButton d>
	//* 104  244:ifnull          262
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.j()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  105  247:aload_0         
	//  106  248:getfield        #131 <Field CustomButton d>
	//  107  251:new             #32  <Class BraavaHelpTableViewActivity_$8>
	//  108  254:dup             
	//  109  255:aload_0         
	//  110  256:invokespecial   #180 <Method void BraavaHelpTableViewActivity_$8(BraavaHelpTableViewActivity_)>
	//  111  259:invokevirtual   #178 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(view1 != null)
	//* 112  262:aload_3         
	//* 113  263:ifnull          278
			view1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.BraavaHelpTableViewActivity_.k()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  114  266:aload_3         
	//  115  267:new             #34  <Class BraavaHelpTableViewActivity_$9>
	//  116  270:dup             
	//  117  271:aload_0         
	//  118  272:invokespecial   #181 <Method void BraavaHelpTableViewActivity_$9(BraavaHelpTableViewActivity_)>
	//  119  275:invokevirtual   #176 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//* 120  278:aload_0         
	//* 121  279:getfield        #135 <Field CustomButton e>
	//* 122  282:ifnull          300
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.l()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  123  285:aload_0         
	//  124  286:getfield        #135 <Field CustomButton e>
	//  125  289:new             #12  <Class BraavaHelpTableViewActivity_$10>
	//  126  292:dup             
	//  127  293:aload_0         
	//  128  294:invokespecial   #182 <Method void BraavaHelpTableViewActivity_$10(BraavaHelpTableViewActivity_)>
	//  129  297:invokevirtual   #178 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//* 130  300:aload_0         
	//* 131  301:getfield        #138 <Field CustomButton f>
	//* 132  304:ifnull          322
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.m();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.m()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  133  307:aload_0         
	//  134  308:getfield        #138 <Field CustomButton f>
	//  135  311:new             #14  <Class BraavaHelpTableViewActivity_$11>
	//  136  314:dup             
	//  137  315:aload_0         
	//  138  316:invokespecial   #183 <Method void BraavaHelpTableViewActivity_$11(BraavaHelpTableViewActivity_)>
	//  139  319:invokevirtual   #178 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(g != null)
	//* 140  322:aload_0         
	//* 141  323:getfield        #142 <Field CustomButton g>
	//* 142  326:ifnull          344
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.n()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  143  329:aload_0         
	//  144  330:getfield        #142 <Field CustomButton g>
	//  145  333:new             #16  <Class BraavaHelpTableViewActivity_$12>
	//  146  336:dup             
	//  147  337:aload_0         
	//  148  338:invokespecial   #184 <Method void BraavaHelpTableViewActivity_$12(BraavaHelpTableViewActivity_)>
	//  149  341:invokevirtual   #178 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//* 150  344:aload_1         
	//* 151  345:ifnull          360
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view2)
				{
					a.o();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaHelpTableViewActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaHelpTableViewActivity_.o()>
				//    3    7:return          
				}

				final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  152  348:aload_1         
	//  153  349:new             #18  <Class BraavaHelpTableViewActivity_$13>
	//  154  352:dup             
	//  155  353:aload_0         
	//  156  354:invokespecial   #185 <Method void BraavaHelpTableViewActivity_$13(BraavaHelpTableViewActivity_)>
	//  157  357:invokevirtual   #176 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  158  360:aload_0         
	//  159  361:invokevirtual   #187 <Method void e()>
	//  160  364:return          
	}

	public void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.BraavaHelpTableViewActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BraavaHelpTableViewActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.BraavaHelpTableViewActivity_.b(BraavaHelpTableViewActivity_)>
					return;
			//    3    7:return          
				}
				catch(Throwable throwable)
			//*   4    8:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//    9   21:return          
			}

			final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BraavaHelpTableViewActivity_ a>
				super(s, l, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #26  <Class BraavaHelpTableViewActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #189 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #189 <String "">
	//    6   10:invokespecial   #192 <Method void BraavaHelpTableViewActivity_$5(BraavaHelpTableViewActivity_, String, long, String)>
	//    7   13:invokestatic    #197 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void f(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.BraavaHelpTableViewActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaHelpTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaHelpTableViewActivity_.a(BraavaHelpTableViewActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final BraavaHelpTableViewActivity_ b;

			
			{
				b = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaHelpTableViewActivity_ b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #20  <Class BraavaHelpTableViewActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #199 <Method void BraavaHelpTableViewActivity_$2(BraavaHelpTableViewActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #204 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void h(int i)
	{
		org.androidannotations.api.b.a("", new Runnable(i) {

			public void run()
			{
				com.irobot.home.BraavaHelpTableViewActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaHelpTableViewActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaHelpTableViewActivity_.b(BraavaHelpTableViewActivity_, int)>
			//    5   11:return          
			}

			final int a;
			final BraavaHelpTableViewActivity_ b;

			
			{
				b = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaHelpTableViewActivity_ b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #22  <Class BraavaHelpTableViewActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #205 <Method void BraavaHelpTableViewActivity_$3(BraavaHelpTableViewActivity_, int)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #204 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(v);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field c v>
	//    2    4:invokestatic    #209 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #211 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #213 <Method void BraavaHelpTableViewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #209 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0043);
	//   13   23:aload_0         
	//   14   24:ldc1            #214 <Int 0x7f0b0043>
	//   15   26:invokevirtual   #217 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void p()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.BraavaHelpTableViewActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BraavaHelpTableViewActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.BraavaHelpTableViewActivity_.a(BraavaHelpTableViewActivity_)>
			//    3    7:return          
			}

			final BraavaHelpTableViewActivity_ a;

			
			{
				a = BraavaHelpTableViewActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaHelpTableViewActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #189 <String "">
	//    1    2:new             #24  <Class BraavaHelpTableViewActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #218 <Method void BraavaHelpTableViewActivity_$4(BraavaHelpTableViewActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #204 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #219 <Method void BraavaHelpTableViewActivity.setContentView(int)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c v>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #221 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #224 <Method void BraavaHelpTableViewActivity.setContentView(View)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c v>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #221 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #227 <Method void BraavaHelpTableViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field c v>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #221 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #231 <Method void BraavaHelpTableViewActivity.setIntent(Intent)>
		q();
	//    3    5:aload_0         
	//    4    6:invokespecial   #67  <Method void q()>
	//    5    9:return          
	}

	private final c v = new c();
}
