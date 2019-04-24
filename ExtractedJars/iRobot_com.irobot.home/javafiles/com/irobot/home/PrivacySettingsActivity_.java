// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			PrivacySettingsActivity

public final class PrivacySettingsActivity_ extends PrivacySettingsActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i1)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i1);
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
				d.startActivityForResult(c, i1, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, i1, a);
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
			super(context, com/irobot/home/PrivacySettingsActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class PrivacySettingsActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public PrivacySettingsActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void PrivacySettingsActivity()>
	//    2    4:aload_0         
	//    3    5:new             #51  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void c()>
	//    6   12:putfield        #54  <Field c v>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #42  <Class PrivacySettingsActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #59  <Method void PrivacySettingsActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(PrivacySettingsActivity_ privacysettingsactivity_)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).PrivacySettingsActivity.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void PrivacySettingsActivity.k()>
	//    2    4:return          
	}

	static void a(PrivacySettingsActivity_ privacysettingsactivity_, String s, boolean flag, int i1)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).com.irobot.home.PrivacySettingsActivity.a(s, flag, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #71  <Method void com.irobot.home.PrivacySettingsActivity.a(String, boolean, int)>
	//    5    7:return          
	}

	static void a(PrivacySettingsActivity_ privacysettingsactivity_, boolean flag)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).com.irobot.home.PrivacySettingsActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #75  <Method void com.irobot.home.PrivacySettingsActivity.a(boolean)>
	//    3    5:return          
	}

	static void b(PrivacySettingsActivity_ privacysettingsactivity_)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).PrivacySettingsActivity.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void PrivacySettingsActivity.l()>
	//    2    4:return          
	}

	static void b(PrivacySettingsActivity_ privacysettingsactivity_, boolean flag)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).com.irobot.home.PrivacySettingsActivity.b(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #81  <Method void com.irobot.home.PrivacySettingsActivity.b(boolean)>
	//    3    5:return          
	}

	static void c(PrivacySettingsActivity_ privacysettingsactivity_)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).PrivacySettingsActivity.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void PrivacySettingsActivity.f()>
	//    2    4:return          
	}

	static void c(PrivacySettingsActivity_ privacysettingsactivity_, boolean flag)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).com.irobot.home.PrivacySettingsActivity.c(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #87  <Method void com.irobot.home.PrivacySettingsActivity.c(boolean)>
	//    3    5:return          
	}

	static void d(PrivacySettingsActivity_ privacysettingsactivity_)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).PrivacySettingsActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void PrivacySettingsActivity.g()>
	//    2    4:return          
	}

	static void e(PrivacySettingsActivity_ privacysettingsactivity_)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).PrivacySettingsActivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void PrivacySettingsActivity.h()>
	//    2    4:return          
	}

	static void f(PrivacySettingsActivity_ privacysettingsactivity_)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).PrivacySettingsActivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void PrivacySettingsActivity.i()>
	//    2    4:return          
	}

	static void g(PrivacySettingsActivity_ privacysettingsactivity_)
	{
		((PrivacySettingsActivity) (privacysettingsactivity_)).PrivacySettingsActivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void PrivacySettingsActivity.j()>
	//    2    4:return          
	}

	public View a(int i1)
	{
		return findViewById(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #105 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	void a(String s, boolean flag, int i1)
	{
		org.androidannotations.api.b.a("", new Runnable(s, flag, i1) {

			public void run()
			{
				com.irobot.home.PrivacySettingsActivity_.a(d, a, b, c);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field PrivacySettingsActivity_ d>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field String a>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field boolean b>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field int c>
			//    8   16:invokestatic    #35  <Method void com.irobot.home.PrivacySettingsActivity_.a(PrivacySettingsActivity_, String, boolean, int)>
			//    9   19:return          
			}

			final String a;
			final boolean b;
			final int c;
			final PrivacySettingsActivity_ d;

			
			{
				d = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field PrivacySettingsActivity_ d>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String a>
				b = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field boolean b>
				c = i1;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field int c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
, 0L);
	//    0    0:ldc1            #109 <String "">
	//    1    2:new             #18  <Class PrivacySettingsActivity_$13>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokespecial   #111 <Method void PrivacySettingsActivity_$13(PrivacySettingsActivity_, String, boolean, int)>
	//    8   13:lconst_0        
	//    9   14:invokestatic    #116 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//   10   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (LinearLayout)a1.a(0x7f0900db);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #118 <Int 0x7f0900db>
	//    3    4:invokeinterface #120 <Method View a.a(int)>
	//    4    9:checkcast       #122 <Class LinearLayout>
	//    5   12:putfield        #125 <Field LinearLayout a>
		b = (RelativeLayout)a1.a(0x7f0903e6);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #126 <Int 0x7f0903e6>
	//    9   19:invokeinterface #120 <Method View a.a(int)>
	//   10   24:checkcast       #128 <Class RelativeLayout>
	//   11   27:putfield        #131 <Field RelativeLayout b>
		c = (RelativeLayout)a1.a(0x7f09035d);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #132 <Int 0x7f09035d>
	//   15   34:invokeinterface #120 <Method View a.a(int)>
	//   16   39:checkcast       #128 <Class RelativeLayout>
	//   17   42:putfield        #134 <Field RelativeLayout c>
		d = (RelativeLayout)a1.a(0x7f090430);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #135 <Int 0x7f090430>
	//   21   49:invokeinterface #120 <Method View a.a(int)>
	//   22   54:checkcast       #128 <Class RelativeLayout>
	//   23   57:putfield        #137 <Field RelativeLayout d>
		e = (RelativeLayout)a1.a(0x7f09017c);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #138 <Int 0x7f09017c>
	//   27   64:invokeinterface #120 <Method View a.a(int)>
	//   28   69:checkcast       #128 <Class RelativeLayout>
	//   29   72:putfield        #140 <Field RelativeLayout e>
		f = (RelativeLayout)a1.a(0x7f090305);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #141 <Int 0x7f090305>
	//   33   79:invokeinterface #120 <Method View a.a(int)>
	//   34   84:checkcast       #128 <Class RelativeLayout>
	//   35   87:putfield        #143 <Field RelativeLayout f>
		g = (RelativeLayout)a1.a(0x7f09012f);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #144 <Int 0x7f09012f>
	//   39   94:invokeinterface #120 <Method View a.a(int)>
	//   40   99:checkcast       #128 <Class RelativeLayout>
	//   41  102:putfield        #146 <Field RelativeLayout g>
		h = (SwitchCompat)a1.a(0x7f0900dd);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #147 <Int 0x7f0900dd>
	//   45  109:invokeinterface #120 <Method View a.a(int)>
	//   46  114:checkcast       #149 <Class SwitchCompat>
	//   47  117:putfield        #152 <Field SwitchCompat h>
		i = (CustomTextView)a1.a(0x7f0900dc);
	//   48  120:aload_0         
	//   49  121:aload_1         
	//   50  122:ldc1            #153 <Int 0x7f0900dc>
	//   51  124:invokeinterface #120 <Method View a.a(int)>
	//   52  129:checkcast       #155 <Class CustomTextView>
	//   53  132:putfield        #158 <Field CustomTextView i>
		j = (ProgressBar)a1.a(0x7f090223);
	//   54  135:aload_0         
	//   55  136:aload_1         
	//   56  137:ldc1            #159 <Int 0x7f090223>
	//   57  139:invokeinterface #120 <Method View a.a(int)>
	//   58  144:checkcast       #161 <Class ProgressBar>
	//   59  147:putfield        #164 <Field ProgressBar j>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090208)));
	//   60  150:aload_1         
	//   61  151:ldc1            #165 <Int 0x7f090208>
	//   62  153:invokeinterface #120 <Method View a.a(int)>
	//   63  158:astore_1        
		if(a1 != null)
	//*  64  159:aload_1         
	//*  65  160:ifnull          175
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PrivacySettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PrivacySettingsActivity_.f()>
				//    3    7:return          
				}

				final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PrivacySettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   66  163:aload_1         
	//   67  164:new             #10  <Class PrivacySettingsActivity_$1>
	//   68  167:dup             
	//   69  168:aload_0         
	//   70  169:invokespecial   #167 <Method void PrivacySettingsActivity_$1(PrivacySettingsActivity_)>
	//   71  172:invokevirtual   #173 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(g != null)
	//*  72  175:aload_0         
	//*  73  176:getfield        #146 <Field RelativeLayout g>
	//*  74  179:ifnull          197
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PrivacySettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PrivacySettingsActivity_.g()>
				//    3    7:return          
				}

				final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PrivacySettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   75  182:aload_0         
	//   76  183:getfield        #146 <Field RelativeLayout g>
	//   77  186:new             #40  <Class PrivacySettingsActivity_$9>
	//   78  189:dup             
	//   79  190:aload_0         
	//   80  191:invokespecial   #174 <Method void PrivacySettingsActivity_$9(PrivacySettingsActivity_)>
	//   81  194:invokevirtual   #175 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(d != null)
	//*  82  197:aload_0         
	//*  83  198:getfield        #137 <Field RelativeLayout d>
	//*  84  201:ifnull          219
			d.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PrivacySettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PrivacySettingsActivity_.h()>
				//    3    7:return          
				}

				final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PrivacySettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   85  204:aload_0         
	//   86  205:getfield        #137 <Field RelativeLayout d>
	//   87  208:new             #12  <Class PrivacySettingsActivity_$10>
	//   88  211:dup             
	//   89  212:aload_0         
	//   90  213:invokespecial   #176 <Method void PrivacySettingsActivity_$10(PrivacySettingsActivity_)>
	//   91  216:invokevirtual   #175 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  92  219:aload_0         
	//*  93  220:getfield        #140 <Field RelativeLayout e>
	//*  94  223:ifnull          241
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PrivacySettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PrivacySettingsActivity_.i()>
				//    3    7:return          
				}

				final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PrivacySettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   95  226:aload_0         
	//   96  227:getfield        #140 <Field RelativeLayout e>
	//   97  230:new             #14  <Class PrivacySettingsActivity_$11>
	//   98  233:dup             
	//   99  234:aload_0         
	//  100  235:invokespecial   #177 <Method void PrivacySettingsActivity_$11(PrivacySettingsActivity_)>
	//  101  238:invokevirtual   #175 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//* 102  241:aload_0         
	//* 103  242:getfield        #143 <Field RelativeLayout f>
	//* 104  245:ifnull          263
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PrivacySettingsActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PrivacySettingsActivity_.j()>
				//    3    7:return          
				}

				final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PrivacySettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  105  248:aload_0         
	//  106  249:getfield        #143 <Field RelativeLayout f>
	//  107  252:new             #16  <Class PrivacySettingsActivity_$12>
	//  108  255:dup             
	//  109  256:aload_0         
	//  110  257:invokespecial   #178 <Method void PrivacySettingsActivity_$12(PrivacySettingsActivity_)>
	//  111  260:invokevirtual   #175 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  112  263:aload_0         
	//  113  264:invokevirtual   #180 <Method void e()>
	//  114  267:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.PrivacySettingsActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field PrivacySettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.PrivacySettingsActivity_.a(PrivacySettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final PrivacySettingsActivity_ b;

			
			{
				b = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PrivacySettingsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #109 <String "">
	//    1    2:new             #20  <Class PrivacySettingsActivity_$14>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #182 <Method void PrivacySettingsActivity_$14(PrivacySettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #116 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void b(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.PrivacySettingsActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field PrivacySettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.PrivacySettingsActivity_.b(PrivacySettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final PrivacySettingsActivity_ b;

			
			{
				b = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PrivacySettingsActivity_ b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #109 <String "">
	//    1    2:new             #22  <Class PrivacySettingsActivity_$15>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #183 <Method void PrivacySettingsActivity_$15(PrivacySettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #116 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void c(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.PrivacySettingsActivity_.c(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PrivacySettingsActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field boolean a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.PrivacySettingsActivity_.c(PrivacySettingsActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final PrivacySettingsActivity_ b;

			
			{
				b = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PrivacySettingsActivity_ b>
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
	//    0    0:ldc1            #109 <String "">
	//    1    2:new             #24  <Class PrivacySettingsActivity_$16>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #184 <Method void PrivacySettingsActivity_$16(PrivacySettingsActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #116 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void f()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.PrivacySettingsActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field PrivacySettingsActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.PrivacySettingsActivity_.c(PrivacySettingsActivity_)>
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

			final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field PrivacySettingsActivity_ a>
				super(s, l1, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #30  <Class PrivacySettingsActivity_$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #109 <String "">
	//    6   10:invokespecial   #187 <Method void PrivacySettingsActivity_$4(PrivacySettingsActivity_, String, long, String)>
	//    7   13:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void g()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					PrivacySettingsActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field PrivacySettingsActivity_ a>
			//    2    4:invokestatic    #25  <Method void PrivacySettingsActivity_.d(PrivacySettingsActivity_)>
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

			final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field PrivacySettingsActivity_ a>
				super(s, l1, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #32  <Class PrivacySettingsActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #109 <String "">
	//    6   10:invokespecial   #193 <Method void PrivacySettingsActivity_$5(PrivacySettingsActivity_, String, long, String)>
	//    7   13:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void h()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.PrivacySettingsActivity_.e(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field PrivacySettingsActivity_ a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.PrivacySettingsActivity_.e(PrivacySettingsActivity_)>
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

			final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field PrivacySettingsActivity_ a>
				super(s, l1, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #34  <Class PrivacySettingsActivity_$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #109 <String "">
	//    6   10:invokespecial   #194 <Method void PrivacySettingsActivity_$6(PrivacySettingsActivity_, String, long, String)>
	//    7   13:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void i()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					PrivacySettingsActivity_.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field PrivacySettingsActivity_ a>
			//    2    4:invokestatic    #25  <Method void PrivacySettingsActivity_.f(PrivacySettingsActivity_)>
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

			final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field PrivacySettingsActivity_ a>
				super(s, l1, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #36  <Class PrivacySettingsActivity_$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #109 <String "">
	//    6   10:invokespecial   #195 <Method void PrivacySettingsActivity_$7(PrivacySettingsActivity_, String, long, String)>
	//    7   13:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void j()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					PrivacySettingsActivity_.g(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field PrivacySettingsActivity_ a>
			//    2    4:invokestatic    #25  <Method void PrivacySettingsActivity_.g(PrivacySettingsActivity_)>
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

			final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field PrivacySettingsActivity_ a>
				super(s, l1, s1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:lload_3         
			//    6    8:aload           5
			//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
			//    8   13:return          
			}
		}
)));
	//    0    0:new             #38  <Class PrivacySettingsActivity_$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #109 <String "">
	//    6   10:invokespecial   #196 <Method void PrivacySettingsActivity_$8(PrivacySettingsActivity_, String, long, String)>
	//    7   13:invokestatic    #192 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	protected void k()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PrivacySettingsActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PrivacySettingsActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.PrivacySettingsActivity_.a(PrivacySettingsActivity_)>
			//    3    7:return          
			}

			final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PrivacySettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #109 <String "">
	//    1    2:new             #26  <Class PrivacySettingsActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #197 <Method void PrivacySettingsActivity_$2(PrivacySettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #116 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void l()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PrivacySettingsActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PrivacySettingsActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.PrivacySettingsActivity_.b(PrivacySettingsActivity_)>
			//    3    7:return          
			}

			final PrivacySettingsActivity_ a;

			
			{
				a = PrivacySettingsActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PrivacySettingsActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #109 <String "">
	//    1    2:new             #28  <Class PrivacySettingsActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #198 <Method void PrivacySettingsActivity_$3(PrivacySettingsActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #116 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(v);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field c v>
	//    2    4:invokestatic    #202 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #204 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #206 <Method void PrivacySettingsActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #202 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0062);
	//   13   23:aload_0         
	//   14   24:ldc1            #207 <Int 0x7f0b0062>
	//   15   26:invokevirtual   #211 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i1)
	{
		super.setContentView(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #212 <Method void PrivacySettingsActivity.setContentView(int)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field c v>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #214 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #217 <Method void PrivacySettingsActivity.setContentView(View)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field c v>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #214 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #220 <Method void PrivacySettingsActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		v.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #54  <Field c v>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #214 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c v = new c();
}
