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
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			TroubleshootMapDetailActivity, IRobotApplication_

public final class TroubleshootMapDetailActivity_ extends TroubleshootMapDetailActivity
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
		//    6   12:getfield        #25  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(Intent, int)>
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
		//   16   34:getfield        #25  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
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
		//   30   66:getfield        #25  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		public a b(int j)
		{
			return (a)super.a("toolbarTitle", j);
		//    0    0:aload_0         
		//    1    1:ldc1            #65  <String "toolbarTitle">
		//    2    3:iload_1         
		//    3    4:invokespecial   #68  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class TroubleshootMapDetailActivity_$a>
		//    5   10:areturn         
		}

		public a c(int j)
		{
			return (a)super.a("helpType", j);
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "helpType">
		//    2    3:iload_1         
		//    3    4:invokespecial   #68  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class TroubleshootMapDetailActivity_$a>
		//    5   10:areturn         
		}

		public a d(int j)
		{
			return (a)super.a("descriptionResource", j);
		//    0    0:aload_0         
		//    1    1:ldc1            #72  <String "descriptionResource">
		//    2    3:iload_1         
		//    3    4:invokespecial   #68  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class TroubleshootMapDetailActivity_$a>
		//    5   10:areturn         
		}

		public a e(int j)
		{
			return (a)super.a("learningPercent", j);
		//    0    0:aload_0         
		//    1    1:ldc1            #74  <String "learningPercent">
		//    2    3:iload_1         
		//    3    4:invokespecial   #68  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class TroubleshootMapDetailActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/TroubleshootMapDetailActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class TroubleshootMapDetailActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public TroubleshootMapDetailActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void TroubleshootMapDetailActivity()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void c()>
	//    6   12:putfield        #22  <Field c n>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #10  <Class TroubleshootMapDetailActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void TroubleshootMapDetailActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		i = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #37  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #41  <Field IRobotApplication i>
		i();
	//    5   11:aload_0         
	//    6   12:invokespecial   #43  <Method void i()>
	//    7   15:return          
	}

	private void i()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Intent getIntent()>
	//    2    4:invokevirtual   #53  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          88
		{
			if(bundle.containsKey("toolbarTitle"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #55  <String "toolbarTitle">
	//*   8   15:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				j = bundle.getInt("toolbarTitle");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #55  <String "toolbarTitle">
	//   13   25:invokevirtual   #65  <Method int Bundle.getInt(String)>
	//   14   28:putfield        #69  <Field int j>
			if(bundle.containsKey("helpType"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #71  <String "helpType">
	//*  17   34:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				k = bundle.getInt("helpType");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #71  <String "helpType">
	//   22   44:invokevirtual   #65  <Method int Bundle.getInt(String)>
	//   23   47:putfield        #74  <Field int k>
			if(bundle.containsKey("descriptionResource"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #76  <String "descriptionResource">
	//*  26   53:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				l = bundle.getInt("descriptionResource");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #76  <String "descriptionResource">
	//   31   63:invokevirtual   #65  <Method int Bundle.getInt(String)>
	//   32   66:putfield        #79  <Field int l>
			if(bundle.containsKey("learningPercent"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #81  <String "learningPercent">
	//*  35   72:invokevirtual   #61  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				m = bundle.getInt("learningPercent");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #81  <String "learningPercent">
	//   40   82:invokevirtual   #65  <Method int Bundle.getInt(String)>
	//   41   85:putfield        #84  <Field int m>
		}
		e();
	//   42   88:aload_0         
	//   43   89:invokevirtual   #87  <Method void e()>
	//   44   92:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #91  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomVideoView)a1.a(0x7f090486);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #95  <Int 0x7f090486>
	//    3    4:invokeinterface #97  <Method View a.a(int)>
	//    4    9:checkcast       #99  <Class CustomVideoView>
	//    5   12:putfield        #102 <Field CustomVideoView a>
		b = (TextView)a1.a(0x7f09013f);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #103 <Int 0x7f09013f>
	//    9   19:invokeinterface #97  <Method View a.a(int)>
	//   10   24:checkcast       #105 <Class TextView>
	//   11   27:putfield        #109 <Field TextView b>
		f = (Button)a1.a(0x7f090402);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #110 <Int 0x7f090402>
	//   15   34:invokeinterface #97  <Method View a.a(int)>
	//   16   39:checkcast       #112 <Class Button>
	//   17   42:putfield        #116 <Field Button f>
		g = (Button)a1.a(0x7f090407);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #117 <Int 0x7f090407>
	//   21   49:invokeinterface #97  <Method View a.a(int)>
	//   22   54:checkcast       #112 <Class Button>
	//   23   57:putfield        #120 <Field Button g>
		h = (Button)a1.a(0x7f09013b);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #121 <Int 0x7f09013b>
	//   27   64:invokeinterface #97  <Method View a.a(int)>
	//   28   69:checkcast       #112 <Class Button>
	//   29   72:putfield        #124 <Field Button h>
		g();
	//   30   75:aload_0         
	//   31   76:invokevirtual   #126 <Method void g()>
	//   32   79:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(n);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field c n>
	//    2    4:invokestatic    #130 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #132 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #134 <Method void TroubleshootMapDetailActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #130 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0076);
	//   13   23:aload_0         
	//   14   24:ldc1            #135 <Int 0x7f0b0076>
	//   15   26:invokevirtual   #139 <Method void setContentView(int)>
	//   16   29:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #147 <Method int MenuItem.getItemId()>
	//*   2    6:ldc1            #148 <Int 0x102002c>
	//*   3    8:icmpne          17
		{
			f();
	//    4   11:aload_0         
	//    5   12:invokevirtual   #150 <Method void f()>
			return true;
	//    6   15:iconst_1        
	//    7   16:ireturn         
		} else
		{
			return super.onOptionsItemSelected(menuitem);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #152 <Method boolean TroubleshootMapDetailActivity.onOptionsItemSelected(MenuItem)>
	//   11   22:ireturn         
		}
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #153 <Method void TroubleshootMapDetailActivity.setContentView(int)>
		n.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c n>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #155 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void TroubleshootMapDetailActivity.setContentView(View)>
		n.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c n>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #155 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #161 <Method void TroubleshootMapDetailActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		n.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field c n>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #155 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #165 <Method void TroubleshootMapDetailActivity.setIntent(Intent)>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #43  <Method void i()>
	//    5    9:return          
	}

	private final c n = new c();
}
