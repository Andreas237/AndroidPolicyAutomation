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
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			RobotSettingsActivity, IRobotApplication_

public final class RobotSettingsActivity_ extends RobotSettingsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s1)
		{
			return (a)super.a("robotBlid", s1);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "robotBlid">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class RobotSettingsActivity_$a>
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
			super(context, com/irobot/home/RobotSettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class RobotSettingsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public RobotSettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void RobotSettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #67  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #68  <Method void c()>
	//    6   12:putfield        #70  <Field c D>
	//    7   15:return          
	}

	private void A()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Intent getIntent()>
	//    2    4:invokevirtual   #82  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #84  <String "robotBlid">
	//*   8   15:invokevirtual   #90  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			b = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #84  <String "robotBlid">
	//   13   25:invokevirtual   #94  <Method String Bundle.getString(String)>
	//   14   28:putfield        #98  <Field String b>
	//   15   31:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #58  <Class RobotSettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #102 <Method void RobotSettingsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #106 <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #112 <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #115 <Field IRobotApplication a>
		A();
	//    5   11:aload_0         
	//    6   12:invokespecial   #117 <Method void A()>
	//    7   15:return          
	}

	static void a(RobotSettingsActivity_ robotsettingsactivity_)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void RobotSettingsActivity.q()>
	//    2    4:return          
	}

	static void a(RobotSettingsActivity_ robotsettingsactivity_, String s1)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).com.irobot.home.RobotSettingsActivity.b(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #125 <Method void com.irobot.home.RobotSettingsActivity.b(String)>
	//    3    5:return          
	}

	static void a(RobotSettingsActivity_ robotsettingsactivity_, boolean flag)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.d(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #130 <Method void RobotSettingsActivity.d(boolean)>
	//    3    5:return          
	}

	static void b(RobotSettingsActivity_ robotsettingsactivity_)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.d_();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void RobotSettingsActivity.d_()>
	//    2    4:return          
	}

	static void b(RobotSettingsActivity_ robotsettingsactivity_, String s1)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).com.irobot.home.RobotSettingsActivity.c(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void com.irobot.home.RobotSettingsActivity.c(String)>
	//    3    5:return          
	}

	static void b(RobotSettingsActivity_ robotsettingsactivity_, boolean flag)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).com.irobot.home.RobotSettingsActivity.e(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #139 <Method void com.irobot.home.RobotSettingsActivity.e(boolean)>
	//    3    5:return          
	}

	static void c(RobotSettingsActivity_ robotsettingsactivity_)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void RobotSettingsActivity.r()>
	//    2    4:return          
	}

	static void c(RobotSettingsActivity_ robotsettingsactivity_, String s1)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).com.irobot.home.RobotSettingsActivity.a(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void com.irobot.home.RobotSettingsActivity.a(String)>
	//    3    5:return          
	}

	static void c(RobotSettingsActivity_ robotsettingsactivity_, boolean flag)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.f(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #146 <Method void RobotSettingsActivity.f(boolean)>
	//    3    5:return          
	}

	static void d(RobotSettingsActivity_ robotsettingsactivity_)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #149 <Method void RobotSettingsActivity.s()>
	//    2    4:return          
	}

	static void d(RobotSettingsActivity_ robotsettingsactivity_, boolean flag)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).com.irobot.home.RobotSettingsActivity.c(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #151 <Method void com.irobot.home.RobotSettingsActivity.c(boolean)>
	//    3    5:return          
	}

	static void e(RobotSettingsActivity_ robotsettingsactivity_)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.t();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void RobotSettingsActivity.t()>
	//    2    4:return          
	}

	static void f(RobotSettingsActivity_ robotsettingsactivity_)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void RobotSettingsActivity.x()>
	//    2    4:return          
	}

	static void g(RobotSettingsActivity_ robotsettingsactivity_)
	{
		((RobotSettingsActivity) (robotsettingsactivity_)).RobotSettingsActivity.y();
	//    0    0:aload_0         
	//    1    1:invokespecial   #161 <Method void RobotSettingsActivity.y()>
	//    2    4:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #165 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(String s1)
	{
		org.androidannotations.api.b.a("", new Runnable(s1) {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RobotSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotSettingsActivity_.c(RobotSettingsActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final RobotSettingsActivity_ b;

			
			{
				b = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RobotSettingsActivity_ b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #52  <Class RobotSettingsActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #171 <Method void RobotSettingsActivity_$7(RobotSettingsActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		c = (CustomTextView)a1.a(0x7f09035f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #178 <Int 0x7f09035f>
	//    3    4:invokeinterface #180 <Method View a.a(int)>
	//    4    9:checkcast       #182 <Class CustomTextView>
	//    5   12:putfield        #185 <Field CustomTextView c>
		d = (CustomTextView)a1.a(0x7f09035a);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #186 <Int 0x7f09035a>
	//    9   19:invokeinterface #180 <Method View a.a(int)>
	//   10   24:checkcast       #182 <Class CustomTextView>
	//   11   27:putfield        #188 <Field CustomTextView d>
		e = (RelativeLayout)a1.a(0x7f0900da);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #189 <Int 0x7f0900da>
	//   15   34:invokeinterface #180 <Method View a.a(int)>
	//   16   39:checkcast       #191 <Class RelativeLayout>
	//   17   42:putfield        #194 <Field RelativeLayout e>
		f = (EditText)a1.a(0x7f090361);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #195 <Int 0x7f090361>
	//   21   49:invokeinterface #180 <Method View a.a(int)>
	//   22   54:checkcast       #197 <Class EditText>
	//   23   57:putfield        #200 <Field EditText f>
		g = a1.a(0x7f0903ff);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #201 <Int 0x7f0903ff>
	//   27   64:invokeinterface #180 <Method View a.a(int)>
	//   28   69:putfield        #204 <Field View g>
		h = a1.a(0x7f090008);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:ldc1            #205 <Int 0x7f090008>
	//   32   76:invokeinterface #180 <Method View a.a(int)>
	//   33   81:putfield        #208 <Field View h>
		i = a1.a(0x7f090242);
	//   34   84:aload_0         
	//   35   85:aload_1         
	//   36   86:ldc1            #209 <Int 0x7f090242>
	//   37   88:invokeinterface #180 <Method View a.a(int)>
	//   38   93:putfield        #212 <Field View i>
		j = a1.a(0x7f090360);
	//   39   96:aload_0         
	//   40   97:aload_1         
	//   41   98:ldc1            #213 <Int 0x7f090360>
	//   42  100:invokeinterface #180 <Method View a.a(int)>
	//   43  105:putfield        #216 <Field View j>
		k = a1.a(0x7f090201);
	//   44  108:aload_0         
	//   45  109:aload_1         
	//   46  110:ldc1            #217 <Int 0x7f090201>
	//   47  112:invokeinterface #180 <Method View a.a(int)>
	//   48  117:putfield        #220 <Field View k>
		l = a1.a(0x7f09033b);
	//   49  120:aload_0         
	//   50  121:aload_1         
	//   51  122:ldc1            #221 <Int 0x7f09033b>
	//   52  124:invokeinterface #180 <Method View a.a(int)>
	//   53  129:putfield        #224 <Field View l>
		m = a1.a(0x7f090331);
	//   54  132:aload_0         
	//   55  133:aload_1         
	//   56  134:ldc1            #225 <Int 0x7f090331>
	//   57  136:invokeinterface #180 <Method View a.a(int)>
	//   58  141:putfield        #228 <Field View m>
		n = a1.a(0x7f0903fe);
	//   59  144:aload_0         
	//   60  145:aload_1         
	//   61  146:ldc1            #229 <Int 0x7f0903fe>
	//   62  148:invokeinterface #180 <Method View a.a(int)>
	//   63  153:putfield        #232 <Field View n>
		o = (RelativeLayout)a1.a(0x7f09000f);
	//   64  156:aload_0         
	//   65  157:aload_1         
	//   66  158:ldc1            #233 <Int 0x7f09000f>
	//   67  160:invokeinterface #180 <Method View a.a(int)>
	//   68  165:checkcast       #191 <Class RelativeLayout>
	//   69  168:putfield        #236 <Field RelativeLayout o>
		t = (RelativeLayout)a1.a(0x7f090007);
	//   70  171:aload_0         
	//   71  172:aload_1         
	//   72  173:ldc1            #237 <Int 0x7f090007>
	//   73  175:invokeinterface #180 <Method View a.a(int)>
	//   74  180:checkcast       #191 <Class RelativeLayout>
	//   75  183:putfield        #239 <Field RelativeLayout t>
		u = (CustomTextView)a1.a(0x7f090010);
	//   76  186:aload_0         
	//   77  187:aload_1         
	//   78  188:ldc1            #240 <Int 0x7f090010>
	//   79  190:invokeinterface #180 <Method View a.a(int)>
	//   80  195:checkcast       #182 <Class CustomTextView>
	//   81  198:putfield        #243 <Field CustomTextView u>
		v = (CustomTextView)a1.a(0x7f09035b);
	//   82  201:aload_0         
	//   83  202:aload_1         
	//   84  203:ldc1            #244 <Int 0x7f09035b>
	//   85  205:invokeinterface #180 <Method View a.a(int)>
	//   86  210:checkcast       #182 <Class CustomTextView>
	//   87  213:putfield        #247 <Field CustomTextView v>
		w = (ProgressBar)a1.a(0x7f090359);
	//   88  216:aload_0         
	//   89  217:aload_1         
	//   90  218:ldc1            #248 <Int 0x7f090359>
	//   91  220:invokeinterface #180 <Method View a.a(int)>
	//   92  225:checkcast       #250 <Class ProgressBar>
	//   93  228:putfield        #254 <Field ProgressBar w>
		x = (RelativeLayout)a1.a(0x7f09025f);
	//   94  231:aload_0         
	//   95  232:aload_1         
	//   96  233:ldc1            #255 <Int 0x7f09025f>
	//   97  235:invokeinterface #180 <Method View a.a(int)>
	//   98  240:checkcast       #191 <Class RelativeLayout>
	//   99  243:putfield        #257 <Field RelativeLayout x>
		y = (RelativeLayout)a1.a(0x7f090083);
	//  100  246:aload_0         
	//  101  247:aload_1         
	//  102  248:ldc2            #258 <Int 0x7f090083>
	//  103  251:invokeinterface #180 <Method View a.a(int)>
	//  104  256:checkcast       #191 <Class RelativeLayout>
	//  105  259:putfield        #260 <Field RelativeLayout y>
		z = (CustomButton)a1.a(0x7f090241);
	//  106  262:aload_0         
	//  107  263:aload_1         
	//  108  264:ldc2            #261 <Int 0x7f090241>
	//  109  267:invokeinterface #180 <Method View a.a(int)>
	//  110  272:checkcast       #263 <Class CustomButton>
	//  111  275:putfield        #267 <Field CustomButton z>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f09049c)));
	//  112  278:aload_1         
	//  113  279:ldc2            #268 <Int 0x7f09049c>
	//  114  282:invokeinterface #180 <Method View a.a(int)>
	//  115  287:astore_1        
		if(n != null)
	//* 116  288:aload_0         
	//* 117  289:getfield        #232 <Field View n>
	//* 118  292:ifnull          310
			n.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.f()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  119  295:aload_0         
	//  120  296:getfield        #232 <Field View n>
	//  121  299:new             #10  <Class RobotSettingsActivity_$1>
	//  122  302:dup             
	//  123  303:aload_0         
	//  124  304:invokespecial   #270 <Method void RobotSettingsActivity_$1(RobotSettingsActivity_)>
	//  125  307:invokevirtual   #276 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(z != null)
	//* 126  310:aload_0         
	//* 127  311:getfield        #267 <Field CustomButton z>
	//* 128  314:ifnull          332
			z.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.g()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  129  317:aload_0         
	//  130  318:getfield        #267 <Field CustomButton z>
	//  131  321:new             #16  <Class RobotSettingsActivity_$12>
	//  132  324:dup             
	//  133  325:aload_0         
	//  134  326:invokespecial   #277 <Method void RobotSettingsActivity_$12(RobotSettingsActivity_)>
	//  135  329:invokevirtual   #278 <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(j != null)
	//* 136  332:aload_0         
	//* 137  333:getfield        #216 <Field View j>
	//* 138  336:ifnull          354
			j.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.i()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  139  339:aload_0         
	//  140  340:getfield        #216 <Field View j>
	//  141  343:new             #28  <Class RobotSettingsActivity_$18>
	//  142  346:dup             
	//  143  347:aload_0         
	//  144  348:invokespecial   #279 <Method void RobotSettingsActivity_$18(RobotSettingsActivity_)>
	//  145  351:invokevirtual   #276 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(o != null)
	//* 146  354:aload_0         
	//* 147  355:getfield        #236 <Field RelativeLayout o>
	//* 148  358:ifnull          376
			o.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.j()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  149  361:aload_0         
	//  150  362:getfield        #236 <Field RelativeLayout o>
	//  151  365:new             #30  <Class RobotSettingsActivity_$19>
	//  152  368:dup             
	//  153  369:aload_0         
	//  154  370:invokespecial   #280 <Method void RobotSettingsActivity_$19(RobotSettingsActivity_)>
	//  155  373:invokevirtual   #281 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(t != null)
	//* 156  376:aload_0         
	//* 157  377:getfield        #239 <Field RelativeLayout t>
	//* 158  380:ifnull          398
			t.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.k();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.k()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  159  383:aload_0         
	//  160  384:getfield        #239 <Field RelativeLayout t>
	//  161  387:new             #34  <Class RobotSettingsActivity_$20>
	//  162  390:dup             
	//  163  391:aload_0         
	//  164  392:invokespecial   #282 <Method void RobotSettingsActivity_$20(RobotSettingsActivity_)>
	//  165  395:invokevirtual   #281 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(k != null)
	//* 166  398:aload_0         
	//* 167  399:getfield        #220 <Field View k>
	//* 168  402:ifnull          420
			k.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.l();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.l()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  169  405:aload_0         
	//  170  406:getfield        #220 <Field View k>
	//  171  409:new             #36  <Class RobotSettingsActivity_$21>
	//  172  412:dup             
	//  173  413:aload_0         
	//  174  414:invokespecial   #283 <Method void RobotSettingsActivity_$21(RobotSettingsActivity_)>
	//  175  417:invokevirtual   #276 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(y != null)
	//* 176  420:aload_0         
	//* 177  421:getfield        #260 <Field RelativeLayout y>
	//* 178  424:ifnull          442
			y.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.m();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.m()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  179  427:aload_0         
	//  180  428:getfield        #260 <Field RelativeLayout y>
	//  181  431:new             #38  <Class RobotSettingsActivity_$22>
	//  182  434:dup             
	//  183  435:aload_0         
	//  184  436:invokespecial   #284 <Method void RobotSettingsActivity_$22(RobotSettingsActivity_)>
	//  185  439:invokevirtual   #281 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//* 186  442:aload_1         
	//* 187  443:ifnull          458
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.n();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.n()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  188  446:aload_1         
	//  189  447:new             #40  <Class RobotSettingsActivity_$23>
	//  190  450:dup             
	//  191  451:aload_0         
	//  192  452:invokespecial   #285 <Method void RobotSettingsActivity_$23(RobotSettingsActivity_)>
	//  193  455:invokevirtual   #276 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(l != null)
	//* 194  458:aload_0         
	//* 195  459:getfield        #224 <Field View l>
	//* 196  462:ifnull          480
			l.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.o();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.o()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  197  465:aload_0         
	//  198  466:getfield        #224 <Field View l>
	//  199  469:new             #42  <Class RobotSettingsActivity_$24>
	//  200  472:dup             
	//  201  473:aload_0         
	//  202  474:invokespecial   #286 <Method void RobotSettingsActivity_$24(RobotSettingsActivity_)>
	//  203  477:invokevirtual   #276 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(m != null)
	//* 204  480:aload_0         
	//* 205  481:getfield        #228 <Field View m>
	//* 206  484:ifnull          502
			m.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.p();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field RobotSettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void RobotSettingsActivity_.p()>
				//    3    7:return          
				}

				final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  207  487:aload_0         
	//  208  488:getfield        #228 <Field View m>
	//  209  491:new             #32  <Class RobotSettingsActivity_$2>
	//  210  494:dup             
	//  211  495:aload_0         
	//  212  496:invokespecial   #287 <Method void RobotSettingsActivity_$2(RobotSettingsActivity_)>
	//  213  499:invokevirtual   #276 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  214  502:aload_0         
	//  215  503:invokevirtual   #289 <Method void e()>
	//  216  506:return          
	}

	public void b(String s1)
	{
		org.androidannotations.api.b.a("", new Runnable(s1) {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RobotSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.RobotSettingsActivity_.a(RobotSettingsActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final RobotSettingsActivity_ b;

			
			{
				b = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RobotSettingsActivity_ b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #44  <Class RobotSettingsActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #290 <Method void RobotSettingsActivity_$3(RobotSettingsActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	void c(String s1)
	{
		org.androidannotations.api.b.a("", new Runnable(s1) {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotSettingsActivity_.b(RobotSettingsActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final RobotSettingsActivity_ b;

			
			{
				b = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotSettingsActivity_ b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #46  <Class RobotSettingsActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #291 <Method void RobotSettingsActivity_$4(RobotSettingsActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	void c(boolean flag)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", flag) {

			public void a()
			{
				try
				{
					RobotSettingsActivity_.d(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field boolean a>
			//    4    8:invokestatic    #30  <Method void RobotSettingsActivity_.d(RobotSettingsActivity_, boolean)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #36  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #40  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #46  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final boolean a;
			final RobotSettingsActivity_ b;

			
			{
				b = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload           6
			//    5    8:putfield        #19  <Field boolean a>
				super(s1, l, s2);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #22  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #26  <Class RobotSettingsActivity_$17>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #169 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #169 <String "">
	//    6   10:iload_1         
	//    7   11:invokespecial   #294 <Method void RobotSettingsActivity_$17(RobotSettingsActivity_, String, long, String, boolean)>
	//    8   14:invokestatic    #299 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void d(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field boolean a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotSettingsActivity_.a(RobotSettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final RobotSettingsActivity_ b;

			
			{
				b = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotSettingsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #48  <Class RobotSettingsActivity_$5>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #301 <Method void RobotSettingsActivity_$5(RobotSettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void d_()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotSettingsActivity_.b(RobotSettingsActivity_)>
			//    3    7:return          
			}

			final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #54  <Class RobotSettingsActivity_$8>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #302 <Method void RobotSettingsActivity_$8(RobotSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void e(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field boolean a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.RobotSettingsActivity_.b(RobotSettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final RobotSettingsActivity_ b;

			
			{
				b = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotSettingsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #56  <Class RobotSettingsActivity_$9>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #303 <Method void RobotSettingsActivity_$9(RobotSettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void f(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RobotSettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field boolean a>
			//    4    8:invokestatic    #29  <Method void com.irobot.home.RobotSettingsActivity_.c(RobotSettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final RobotSettingsActivity_ b;

			
			{
				b = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RobotSettingsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #14  <Class RobotSettingsActivity_$11>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #304 <Method void RobotSettingsActivity_$11(RobotSettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(D);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field c D>
	//    2    4:invokestatic    #308 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #310 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #312 <Method void RobotSettingsActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #308 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0061);
	//   13   23:aload_0         
	//   14   24:ldc2            #313 <Int 0x7f0b0061>
	//   15   27:invokevirtual   #317 <Method void setContentView(int)>
	//   16   30:return          
	}

	public void q()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RobotSettingsActivity_.a(RobotSettingsActivity_)>
			//    3    7:return          
			}

			final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #50  <Class RobotSettingsActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #318 <Method void RobotSettingsActivity_$6(RobotSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void r()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotSettingsActivity_.c(RobotSettingsActivity_)>
			//    3    7:return          
			}

			final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #12  <Class RobotSettingsActivity_$10>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #319 <Method void RobotSettingsActivity_$10(RobotSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void s()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSettingsActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSettingsActivity_.d(RobotSettingsActivity_)>
			//    3    7:return          
			}

			final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #18  <Class RobotSettingsActivity_$13>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #320 <Method void RobotSettingsActivity_$13(RobotSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #321 <Method void RobotSettingsActivity.setContentView(int)>
		D.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field c D>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #323 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #326 <Method void RobotSettingsActivity.setContentView(View)>
		D.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field c D>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #323 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #329 <Method void RobotSettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		D.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #70  <Field c D>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #323 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #333 <Method void RobotSettingsActivity.setIntent(Intent)>
		A();
	//    3    5:aload_0         
	//    4    6:invokespecial   #117 <Method void A()>
	//    5    9:return          
	}

	public void t()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.RobotSettingsActivity_.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.RobotSettingsActivity_.e(RobotSettingsActivity_)>
			//    3    7:return          
			}

			final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #20  <Class RobotSettingsActivity_$14>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #334 <Method void RobotSettingsActivity_$14(RobotSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void x()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSettingsActivity_.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSettingsActivity_.f(RobotSettingsActivity_)>
			//    3    7:return          
			}

			final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #22  <Class RobotSettingsActivity_$15>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #335 <Method void RobotSettingsActivity_$15(RobotSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void y()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				RobotSettingsActivity_.g(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RobotSettingsActivity_ a>
			//    2    4:invokestatic    #24  <Method void RobotSettingsActivity_.g(RobotSettingsActivity_)>
			//    3    7:return          
			}

			final RobotSettingsActivity_ a;

			
			{
				a = RobotSettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RobotSettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #169 <String "">
	//    1    2:new             #24  <Class RobotSettingsActivity_$16>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #336 <Method void RobotSettingsActivity_$16(RobotSettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #176 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	private final c D = new c();
}
