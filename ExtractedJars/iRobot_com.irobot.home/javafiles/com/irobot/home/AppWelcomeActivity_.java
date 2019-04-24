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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.irobot.home.util.k;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			AppWelcomeActivity, IRobotApplication_

public final class AppWelcomeActivity_ extends AppWelcomeActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(boolean flag)
		{
			return (a)super.a("existingUser", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "existingUser">
		//    2    3:iload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class AppWelcomeActivity_$a>
		//    5   10:areturn         
		}

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
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
				d.startActivityForResult(c, j, a);
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
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
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
			super(context, com/irobot/home/AppWelcomeActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class AppWelcomeActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public AppWelcomeActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AppWelcomeActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c l>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #16  <Class AppWelcomeActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void AppWelcomeActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c = new k(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #36  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #37  <Method void k(Context)>
	//    5    9:putfield        #41  <Field k c>
		c.a(((b) (this)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #44  <Method void c.a(b)>
		a = IRobotApplication_.r();
	//    8   16:aload_0         
	//    9   17:invokestatic    #50  <Method IRobotApplication IRobotApplication_.r()>
	//   10   20:putfield        #53  <Field IRobotApplication a>
		i();
	//   11   23:aload_0         
	//   12   24:invokespecial   #56  <Method void i()>
	//   13   27:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method Intent getIntent()>
	//    2    4:invokevirtual   #66  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null && bundle.containsKey("existingUser"))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:ldc1            #68  <String "existingUser">
	//*   8   15:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
			b = bundle.getBoolean("existingUser");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #68  <String "existingUser">
	//   13   25:invokevirtual   #77  <Method boolean Bundle.getBoolean(String)>
	//   14   28:putfield        #81  <Field boolean b>
	//   15   31:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #85  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		d = (CustomTextView)a1.a(0x7f090494);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #89  <Int 0x7f090494>
	//    3    4:invokeinterface #91  <Method View a.a(int)>
	//    4    9:checkcast       #93  <Class CustomTextView>
	//    5   12:putfield        #97  <Field CustomTextView d>
		e = (CustomTextView)a1.a(0x7f090495);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #98  <Int 0x7f090495>
	//    9   19:invokeinterface #91  <Method View a.a(int)>
	//   10   24:checkcast       #93  <Class CustomTextView>
	//   11   27:putfield        #101 <Field CustomTextView e>
		f = (CustomTextView)a1.a(0x7f090493);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #102 <Int 0x7f090493>
	//   15   34:invokeinterface #91  <Method View a.a(int)>
	//   16   39:checkcast       #93  <Class CustomTextView>
	//   17   42:putfield        #105 <Field CustomTextView f>
		g = (ScrollView)a1.a(0x7f0903ae);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #106 <Int 0x7f0903ae>
	//   21   49:invokeinterface #91  <Method View a.a(int)>
	//   22   54:checkcast       #108 <Class ScrollView>
	//   23   57:putfield        #112 <Field ScrollView g>
		h = (RelativeLayout)a1.a(0x7f090122);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #113 <Int 0x7f090122>
	//   27   64:invokeinterface #91  <Method View a.a(int)>
	//   28   69:checkcast       #115 <Class RelativeLayout>
	//   29   72:putfield        #119 <Field RelativeLayout h>
		i = (RelativeLayout)a1.a(0x7f090202);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #120 <Int 0x7f090202>
	//   33   79:invokeinterface #91  <Method View a.a(int)>
	//   34   84:checkcast       #115 <Class RelativeLayout>
	//   35   87:putfield        #122 <Field RelativeLayout i>
		j = (Button)a1.a(0x7f090283);
	//   36   90:aload_0         
	//   37   91:aload_1         
	//   38   92:ldc1            #123 <Int 0x7f090283>
	//   39   94:invokeinterface #91  <Method View a.a(int)>
	//   40   99:checkcast       #125 <Class Button>
	//   41  102:putfield        #129 <Field Button j>
		k = (LinearLayout)a1.a(0x7f0901af);
	//   42  105:aload_0         
	//   43  106:aload_1         
	//   44  107:ldc1            #130 <Int 0x7f0901af>
	//   45  109:invokeinterface #91  <Method View a.a(int)>
	//   46  114:checkcast       #132 <Class LinearLayout>
	//   47  117:putfield        #136 <Field LinearLayout k>
		if(h != null)
	//*  48  120:aload_0         
	//*  49  121:getfield        #119 <Field RelativeLayout h>
	//*  50  124:ifnull          142
			h.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AppWelcomeActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AppWelcomeActivity_.f()>
				//    3    7:return          
				}

				final AppWelcomeActivity_ a;

			
			{
				a = AppWelcomeActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppWelcomeActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   51  127:aload_0         
	//   52  128:getfield        #119 <Field RelativeLayout h>
	//   53  131:new             #10  <Class AppWelcomeActivity_$1>
	//   54  134:dup             
	//   55  135:aload_0         
	//   56  136:invokespecial   #139 <Method void AppWelcomeActivity_$1(AppWelcomeActivity_)>
	//   57  139:invokevirtual   #143 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(i != null)
	//*  58  142:aload_0         
	//*  59  143:getfield        #122 <Field RelativeLayout i>
	//*  60  146:ifnull          164
			i.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AppWelcomeActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AppWelcomeActivity_.g()>
				//    3    7:return          
				}

				final AppWelcomeActivity_ a;

			
			{
				a = AppWelcomeActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppWelcomeActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   61  149:aload_0         
	//   62  150:getfield        #122 <Field RelativeLayout i>
	//   63  153:new             #12  <Class AppWelcomeActivity_$2>
	//   64  156:dup             
	//   65  157:aload_0         
	//   66  158:invokespecial   #144 <Method void AppWelcomeActivity_$2(AppWelcomeActivity_)>
	//   67  161:invokevirtual   #143 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(j != null)
	//*  68  164:aload_0         
	//*  69  165:getfield        #129 <Field Button j>
	//*  70  168:ifnull          186
			j.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AppWelcomeActivity_ a>
				//    2    4:invokevirtual   #25  <Method void AppWelcomeActivity_.h()>
				//    3    7:return          
				}

				final AppWelcomeActivity_ a;

			
			{
				a = AppWelcomeActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppWelcomeActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   71  171:aload_0         
	//   72  172:getfield        #129 <Field Button j>
	//   73  175:new             #14  <Class AppWelcomeActivity_$3>
	//   74  178:dup             
	//   75  179:aload_0         
	//   76  180:invokespecial   #145 <Method void AppWelcomeActivity_$3(AppWelcomeActivity_)>
	//   77  183:invokevirtual   #146 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   78  186:aload_0         
	//   79  187:invokevirtual   #148 <Method void e()>
	//   80  190:return          
	}

	public void onActivityResult(int j, int i1, Intent intent)
	{
		super.onActivityResult(j, i1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #152 <Method void AppWelcomeActivity.onActivityResult(int, int, Intent)>
		if(j != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpeq          25
		{
			if(j != 3)
	//*   8   12:iload_1         
	//*   9   13:iconst_3        
	//*  10   14:icmpeq          18
			{
				return;
	//   11   17:return          
			} else
			{
				b(i1, intent);
	//   12   18:aload_0         
	//   13   19:iload_2         
	//   14   20:aload_3         
	//   15   21:invokevirtual   #155 <Method void b(int, Intent)>
				return;
	//   16   24:return          
			}
		} else
		{
			a(i1, intent);
	//   17   25:aload_0         
	//   18   26:iload_2         
	//   19   27:aload_3         
	//   20   28:invokevirtual   #157 <Method void a(int, Intent)>
			return;
	//   21   31:return          
		}
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c l>
	//    2    4:invokestatic    #161 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #163 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #165 <Method void AppWelcomeActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #161 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0025);
	//   13   23:aload_0         
	//   14   24:ldc1            #166 <Int 0x7f0b0025>
	//   15   26:invokevirtual   #170 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #171 <Method void AppWelcomeActivity.setContentView(int)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #173 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void AppWelcomeActivity.setContentView(View)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #173 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #179 <Method void AppWelcomeActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		l.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c l>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #173 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void AppWelcomeActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #56  <Method void i()>
	//    5    9:return          
	}

	private final c l = new c();
}
