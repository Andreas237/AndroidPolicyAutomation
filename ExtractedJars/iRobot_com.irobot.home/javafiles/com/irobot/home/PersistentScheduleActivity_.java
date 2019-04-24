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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.EmptySupportedRecyclerView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			PersistentScheduleActivity

public final class PersistentScheduleActivity_ extends PersistentScheduleActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #33  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class PersistentScheduleActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("startedFromMapCompleteScreen", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #36  <String "startedFromMapCompleteScreen">
		//    2    3:iload_1         
		//    3    4:invokespecial   #39  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class PersistentScheduleActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #42  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #42  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #46  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #52  <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
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
		//   16   34:getfield        #46  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #55  <Field Bundle a>
		//   20   42:invokevirtual   #58  <Method void Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #62  <Field Context b>
		//*  24   52:instanceof      #64  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #62  <Field Context b>
		//   28   62:checkcast       #64  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #46  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #55  <Field Bundle a>
		//   34   74:invokestatic    #69  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #62  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #46  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #55  <Field Bundle a>
		//   42   92:invokevirtual   #75  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #77  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #62  <Field Context b>
		//   47  103:invokespecial   #79  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/PersistentScheduleActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class PersistentScheduleActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}

		public a(Context context)
		{
			super(context, com/irobot/home/PersistentScheduleActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class PersistentScheduleActivity_>
		//    3    4:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public PersistentScheduleActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PersistentScheduleActivity()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c k>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #12  <Class PersistentScheduleActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void PersistentScheduleActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class PersistentScheduleActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void PersistentScheduleActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		k();
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void k()>
	//    4    8:return          
	}

	private void k()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method Intent getIntent()>
	//    2    4:invokevirtual   #49  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #51  <String "assetId">
	//*   8   15:invokevirtual   #57  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				a = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #51  <String "assetId">
	//   13   25:invokevirtual   #61  <Method String Bundle.getString(String)>
	//   14   28:putfield        #64  <Field String a>
			if(bundle.containsKey("startedFromMapCompleteScreen"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #66  <String "startedFromMapCompleteScreen">
	//*  17   34:invokevirtual   #57  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				b = bundle.getBoolean("startedFromMapCompleteScreen");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #66  <String "startedFromMapCompleteScreen">
	//   22   44:invokevirtual   #69  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #73  <Field boolean b>
		}
		e();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #76  <Method void e()>
	//   26   54:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		f = (EmptySupportedRecyclerView)a1.a(0x7f090323);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #84  <Int 0x7f090323>
	//    3    4:invokeinterface #86  <Method View a.a(int)>
	//    4    9:checkcast       #88  <Class EmptySupportedRecyclerView>
	//    5   12:putfield        #92  <Field EmptySupportedRecyclerView f>
		g = (CustomTextView)a1.a(0x7f090395);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #93  <Int 0x7f090395>
	//    9   19:invokeinterface #86  <Method View a.a(int)>
	//   10   24:checkcast       #95  <Class CustomTextView>
	//   11   27:putfield        #99  <Field CustomTextView g>
		h = a1.a(0x7f090270);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #100 <Int 0x7f090270>
	//   15   34:invokeinterface #86  <Method View a.a(int)>
	//   16   39:putfield        #104 <Field View h>
		i = (TextView)a1.a(0x7f090271);
	//   17   42:aload_0         
	//   18   43:aload_1         
	//   19   44:ldc1            #105 <Int 0x7f090271>
	//   20   46:invokeinterface #86  <Method View a.a(int)>
	//   21   51:checkcast       #107 <Class TextView>
	//   22   54:putfield        #111 <Field TextView i>
		j = (TextView)a1.a(0x7f09026f);
	//   23   57:aload_0         
	//   24   58:aload_1         
	//   25   59:ldc1            #112 <Int 0x7f09026f>
	//   26   61:invokeinterface #86  <Method View a.a(int)>
	//   27   66:checkcast       #107 <Class TextView>
	//   28   69:putfield        #115 <Field TextView j>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090398)));
	//   29   72:aload_1         
	//   30   73:ldc1            #116 <Int 0x7f090398>
	//   31   75:invokeinterface #86  <Method View a.a(int)>
	//   32   80:astore_1        
		if(a1 != null)
	//*  33   81:aload_1         
	//*  34   82:ifnull          97
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PersistentScheduleActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PersistentScheduleActivity_.i()>
				//    3    7:return          
				}

				final PersistentScheduleActivity_ a;

			
			{
				a = PersistentScheduleActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PersistentScheduleActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   35   85:aload_1         
	//   36   86:new             #10  <Class PersistentScheduleActivity_$1>
	//   37   89:dup             
	//   38   90:aload_0         
	//   39   91:invokespecial   #119 <Method void PersistentScheduleActivity_$1(PersistentScheduleActivity_)>
	//   40   94:invokevirtual   #125 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		f();
	//   41   97:aload_0         
	//   42   98:invokevirtual   #127 <Method void f()>
	//   43  101:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(k);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c k>
	//    2    4:invokestatic    #131 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #133 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #135 <Method void PersistentScheduleActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #131 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b005e);
	//   13   23:aload_0         
	//   14   24:ldc1            #136 <Int 0x7f0b005e>
	//   15   26:invokevirtual   #140 <Method void setContentView(int)>
	//   16   29:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(0x7f0c0008, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method MenuInflater getMenuInflater()>
	//    2    4:ldc1            #147 <Int 0x7f0c0008>
	//    3    6:aload_1         
	//    4    7:invokevirtual   #153 <Method void MenuInflater.inflate(int, Menu)>
		return super.onCreateOptionsMenu(menu);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #155 <Method boolean PersistentScheduleActivity.onCreateOptionsMenu(Menu)>
	//    8   15:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		int i = menuitem.getItemId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #163 <Method int MenuItem.getItemId()>
	//    2    6:istore_2        
		if(i == 0x102002c)
	//*   3    7:iload_2         
	//*   4    8:ldc1            #164 <Int 0x102002c>
	//*   5   10:icmpne          19
		{
			g();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #166 <Method void g()>
			return true;
	//    8   17:iconst_1        
	//    9   18:ireturn         
		}
		if(i == 0x7f090125)
	//*  10   19:iload_2         
	//*  11   20:ldc1            #167 <Int 0x7f090125>
	//*  12   22:icmpne          31
		{
			h();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #169 <Method void h()>
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		} else
		{
			return super.onOptionsItemSelected(menuitem);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokespecial   #171 <Method boolean PersistentScheduleActivity.onOptionsItemSelected(MenuItem)>
	//   20   36:ireturn         
		}
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #172 <Method void PersistentScheduleActivity.setContentView(int)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #174 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #177 <Method void PersistentScheduleActivity.setContentView(View)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field c k>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #174 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #180 <Method void PersistentScheduleActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		k.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c k>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #174 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #184 <Method void PersistentScheduleActivity.setIntent(Intent)>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #39  <Method void k()>
	//    5    9:return          
	}

	private final c k = new c();
}
