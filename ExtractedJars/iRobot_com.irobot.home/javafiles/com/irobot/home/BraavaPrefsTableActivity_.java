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
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaPrefsTableActivity

public final class BraavaPrefsTableActivity_ extends BraavaPrefsTableActivity
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
		//    4    7:checkcast       #2   <Class BraavaPrefsTableActivity_$a>
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
			super(context, com/irobot/home/BraavaPrefsTableActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BraavaPrefsTableActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BraavaPrefsTableActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void BraavaPrefsTableActivity()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void c()>
	//    6   12:putfield        #36  <Field c l>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #24  <Class BraavaPrefsTableActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void BraavaPrefsTableActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #45  <Method void c.a(b)>
		k();
	//    2    4:aload_0         
	//    3    5:invokespecial   #48  <Method void k()>
	//    4    8:return          
	}

	static void a(BraavaPrefsTableActivity_ braavaprefstableactivity_, boolean flag)
	{
		((BraavaPrefsTableActivity) (braavaprefstableactivity_)).com.irobot.home.BraavaPrefsTableActivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #52  <Method void com.irobot.home.BraavaPrefsTableActivity.a(boolean)>
	//    3    5:return          
	}

	static void b(BraavaPrefsTableActivity_ braavaprefstableactivity_, boolean flag)
	{
		((BraavaPrefsTableActivity) (braavaprefstableactivity_)).com.irobot.home.BraavaPrefsTableActivity.b(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #55  <Method void com.irobot.home.BraavaPrefsTableActivity.b(boolean)>
	//    3    5:return          
	}

	private void k()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method Intent getIntent()>
	//    2    4:invokevirtual   #65  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("robotBlid"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #67  <String "robotBlid">
	//*   8   15:invokevirtual   #73  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			a = bundle.getString("robotBlid");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #67  <String "robotBlid">
	//   13   25:invokevirtual   #77  <Method String Bundle.getString(String)>
	//   14   28:putfield        #80  <Field String a>
	//   15   31:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #84  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomTextView)a1.a(0x7f09035f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #88  <Int 0x7f09035f>
	//    3    4:invokeinterface #90  <Method View a.a(int)>
	//    4    9:checkcast       #92  <Class CustomTextView>
	//    5   12:putfield        #95  <Field CustomTextView b>
		c = (CustomTextView)a1.a(0x7f090362);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #96  <Int 0x7f090362>
	//    9   19:invokeinterface #90  <Method View a.a(int)>
	//   10   24:checkcast       #92  <Class CustomTextView>
	//   11   27:putfield        #99  <Field CustomTextView c>
		d = (EditText)a1.a(0x7f090361);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #100 <Int 0x7f090361>
	//   15   34:invokeinterface #90  <Method View a.a(int)>
	//   16   39:checkcast       #102 <Class EditText>
	//   17   42:putfield        #106 <Field EditText d>
		e = a1.a(0x7f090360);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #107 <Int 0x7f090360>
	//   21   49:invokeinterface #90  <Method View a.a(int)>
	//   22   54:putfield        #111 <Field View e>
		f = a1.a(0x7f0902e3);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #112 <Int 0x7f0902e3>
	//   26   61:invokeinterface #90  <Method View a.a(int)>
	//   27   66:putfield        #115 <Field View f>
		g = a1.a(0x7f0902e2);
	//   28   69:aload_0         
	//   29   70:aload_1         
	//   30   71:ldc1            #116 <Int 0x7f0902e2>
	//   31   73:invokeinterface #90  <Method View a.a(int)>
	//   32   78:putfield        #119 <Field View g>
		h = a1.a(0x7f090331);
	//   33   81:aload_0         
	//   34   82:aload_1         
	//   35   83:ldc1            #120 <Int 0x7f090331>
	//   36   85:invokeinterface #90  <Method View a.a(int)>
	//   37   90:putfield        #123 <Field View h>
		i = a1.a(0x7f09033b);
	//   38   93:aload_0         
	//   39   94:aload_1         
	//   40   95:ldc1            #124 <Int 0x7f09033b>
	//   41   97:invokeinterface #90  <Method View a.a(int)>
	//   42  102:putfield        #127 <Field View i>
		j = a1.a(0x7f09000f);
	//   43  105:aload_0         
	//   44  106:aload_1         
	//   45  107:ldc1            #128 <Int 0x7f09000f>
	//   46  109:invokeinterface #90  <Method View a.a(int)>
	//   47  114:putfield        #131 <Field View j>
		k = (RelativeLayout)a1.a(0x7f09025f);
	//   48  117:aload_0         
	//   49  118:aload_1         
	//   50  119:ldc1            #132 <Int 0x7f09025f>
	//   51  121:invokeinterface #90  <Method View a.a(int)>
	//   52  126:checkcast       #134 <Class RelativeLayout>
	//   53  129:putfield        #137 <Field RelativeLayout k>
		if(e != null)
	//*  54  132:aload_0         
	//*  55  133:getfield        #111 <Field View e>
	//*  56  136:ifnull          154
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaPrefsTableActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaPrefsTableActivity_.f()>
				//    3    7:return          
				}

				final BraavaPrefsTableActivity_ a;

			
			{
				a = BraavaPrefsTableActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaPrefsTableActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   57  139:aload_0         
	//   58  140:getfield        #111 <Field View e>
	//   59  143:new             #10  <Class BraavaPrefsTableActivity_$1>
	//   60  146:dup             
	//   61  147:aload_0         
	//   62  148:invokespecial   #140 <Method void BraavaPrefsTableActivity_$1(BraavaPrefsTableActivity_)>
	//   63  151:invokevirtual   #146 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(j != null)
	//*  64  154:aload_0         
	//*  65  155:getfield        #131 <Field View j>
	//*  66  158:ifnull          176
			j.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaPrefsTableActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaPrefsTableActivity_.g()>
				//    3    7:return          
				}

				final BraavaPrefsTableActivity_ a;

			
			{
				a = BraavaPrefsTableActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaPrefsTableActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   67  161:aload_0         
	//   68  162:getfield        #131 <Field View j>
	//   69  165:new             #12  <Class BraavaPrefsTableActivity_$2>
	//   70  168:dup             
	//   71  169:aload_0         
	//   72  170:invokespecial   #147 <Method void BraavaPrefsTableActivity_$2(BraavaPrefsTableActivity_)>
	//   73  173:invokevirtual   #146 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(g != null)
	//*  74  176:aload_0         
	//*  75  177:getfield        #119 <Field View g>
	//*  76  180:ifnull          198
			g.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaPrefsTableActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaPrefsTableActivity_.h()>
				//    3    7:return          
				}

				final BraavaPrefsTableActivity_ a;

			
			{
				a = BraavaPrefsTableActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaPrefsTableActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   77  183:aload_0         
	//   78  184:getfield        #119 <Field View g>
	//   79  187:new             #14  <Class BraavaPrefsTableActivity_$3>
	//   80  190:dup             
	//   81  191:aload_0         
	//   82  192:invokespecial   #148 <Method void BraavaPrefsTableActivity_$3(BraavaPrefsTableActivity_)>
	//   83  195:invokevirtual   #146 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(h != null)
	//*  84  198:aload_0         
	//*  85  199:getfield        #123 <Field View h>
	//*  86  202:ifnull          220
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaPrefsTableActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaPrefsTableActivity_.i()>
				//    3    7:return          
				}

				final BraavaPrefsTableActivity_ a;

			
			{
				a = BraavaPrefsTableActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaPrefsTableActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   87  205:aload_0         
	//   88  206:getfield        #123 <Field View h>
	//   89  209:new             #16  <Class BraavaPrefsTableActivity_$4>
	//   90  212:dup             
	//   91  213:aload_0         
	//   92  214:invokespecial   #149 <Method void BraavaPrefsTableActivity_$4(BraavaPrefsTableActivity_)>
	//   93  217:invokevirtual   #146 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(i != null)
	//*  94  220:aload_0         
	//*  95  221:getfield        #127 <Field View i>
	//*  96  224:ifnull          242
			i.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.j();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaPrefsTableActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaPrefsTableActivity_.j()>
				//    3    7:return          
				}

				final BraavaPrefsTableActivity_ a;

			
			{
				a = BraavaPrefsTableActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaPrefsTableActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   97  227:aload_0         
	//   98  228:getfield        #127 <Field View i>
	//   99  231:new             #18  <Class BraavaPrefsTableActivity_$5>
	//  100  234:dup             
	//  101  235:aload_0         
	//  102  236:invokespecial   #150 <Method void BraavaPrefsTableActivity_$5(BraavaPrefsTableActivity_)>
	//  103  239:invokevirtual   #146 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//  104  242:aload_0         
	//  105  243:invokevirtual   #152 <Method void e()>
	//  106  246:return          
	}

	protected void a(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.BraavaPrefsTableActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BraavaPrefsTableActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.BraavaPrefsTableActivity_.a(BraavaPrefsTableActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final BraavaPrefsTableActivity_ b;

			
			{
				b = BraavaPrefsTableActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BraavaPrefsTableActivity_ b>
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
	//    0    0:ldc1            #154 <String "">
	//    1    2:new             #20  <Class BraavaPrefsTableActivity_$6>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #156 <Method void BraavaPrefsTableActivity_$6(BraavaPrefsTableActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #161 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void b(boolean flag)
	{
		org.androidannotations.api.b.a("", new Runnable(flag) {

			public void run()
			{
				com.irobot.home.BraavaPrefsTableActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BraavaPrefsTableActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field boolean a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.BraavaPrefsTableActivity_.b(BraavaPrefsTableActivity_, boolean)>
			//    5   11:return          
			}

			final boolean a;
			final BraavaPrefsTableActivity_ b;

			
			{
				b = BraavaPrefsTableActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BraavaPrefsTableActivity_ b>
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
	//    0    0:ldc1            #154 <String "">
	//    1    2:new             #22  <Class BraavaPrefsTableActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokespecial   #162 <Method void BraavaPrefsTableActivity_$7(BraavaPrefsTableActivity_, boolean)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #161 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field c l>
	//    2    4:invokestatic    #166 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #168 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #170 <Method void BraavaPrefsTableActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #166 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b002d);
	//   13   23:aload_0         
	//   14   24:ldc1            #171 <Int 0x7f0b002d>
	//   15   26:invokevirtual   #175 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #176 <Method void BraavaPrefsTableActivity.setContentView(int)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #178 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method void BraavaPrefsTableActivity.setContentView(View)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #178 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #184 <Method void BraavaPrefsTableActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #178 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #188 <Method void BraavaPrefsTableActivity.setIntent(Intent)>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #48  <Method void k()>
	//    5    9:return          
	}

	private final c l = new c();
}
