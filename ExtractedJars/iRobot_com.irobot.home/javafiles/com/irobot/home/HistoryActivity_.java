// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.CustomViewPager;
import com.irobot.home.view.EmptySupportedRecyclerView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			HistoryActivity

public final class HistoryActivity_ extends HistoryActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(Boolean boolean1)
		{
			return (a)super.a("isMapsSupported", ((java.io.Serializable) (boolean1)));
		//    0    0:aload_0         
		//    1    1:ldc1            #29  <String "isMapsSupported">
		//    2    3:aload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class HistoryActivity_$a>
		//    5   10:areturn         
		}

		public a a(String s)
		{
			return (a)super.a("assetId", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "assetId">
		//    2    3:aload_1         
		//    3    4:invokespecial   #38  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, String)>
		//    4    7:checkcast       #2   <Class HistoryActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field android.support.v4.app.Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #41  <Field android.support.v4.app.Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #45  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #51  <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
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
		//   16   34:getfield        #45  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #54  <Field Bundle a>
		//   20   42:invokevirtual   #57  <Method void Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #61  <Field Context b>
		//*  24   52:instanceof      #63  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #61  <Field Context b>
		//   28   62:checkcast       #63  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #45  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #54  <Field Bundle a>
		//   34   74:invokestatic    #68  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #61  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #45  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #54  <Field Bundle a>
		//   42   92:invokevirtual   #74  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #76  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #61  <Field Context b>
		//   47  103:invokespecial   #79  <Method void e(Context)>
		//   48  106:areturn         
		}

		private Fragment d;
		private android.support.v4.app.Fragment e;

		public a(Fragment fragment)
		{
			super(((Context) (fragment.getActivity())), com/irobot/home/HistoryActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
		//    3    5:ldc1            #7   <Class HistoryActivity_>
		//    4    7:invokespecial   #23  <Method void org.androidannotations.api.a.a(Context, Class)>
			d = fragment;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #25  <Field Fragment d>
		//    8   15:return          
		}
	}


	public HistoryActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void HistoryActivity()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void c()>
	//    6   12:putfield        #22  <Field c g>
	//    7   15:return          
	}

	public static a a(Fragment fragment)
	{
		return new a(fragment);
	//    0    0:new             #10  <Class HistoryActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void HistoryActivity_$a(Fragment)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
		g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void g()>
	//    4    8:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method Intent getIntent()>
	//    2    4:invokevirtual   #43  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          53
		{
			if(bundle.containsKey("assetId"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #45  <String "assetId">
	//*   8   15:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				e = bundle.getString("assetId");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #45  <String "assetId">
	//   13   25:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   14   28:putfield        #59  <Field String e>
			if(bundle.containsKey("isMapsSupported"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #61  <String "isMapsSupported">
	//*  17   34:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            53
				f = (Boolean)bundle.getSerializable("isMapsSupported");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #61  <String "isMapsSupported">
	//   22   44:invokevirtual   #65  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   23   47:checkcast       #67  <Class Boolean>
	//   24   50:putfield        #71  <Field Boolean f>
		}
	//   25   53:return          
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
		a = (CustomViewPager)a1.a(0x7f090489);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #79  <Int 0x7f090489>
	//    3    4:invokeinterface #81  <Method View a.a(int)>
	//    4    9:checkcast       #83  <Class CustomViewPager>
	//    5   12:putfield        #86  <Field CustomViewPager a>
		b = (EmptySupportedRecyclerView)a1.a(0x7f0901c5);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #87  <Int 0x7f0901c5>
	//    9   19:invokeinterface #81  <Method View a.a(int)>
	//   10   24:checkcast       #89  <Class EmptySupportedRecyclerView>
	//   11   27:putfield        #93  <Field EmptySupportedRecyclerView b>
		c = (TabLayout)a1.a(0x7f090423);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #94  <Int 0x7f090423>
	//   15   34:invokeinterface #81  <Method View a.a(int)>
	//   16   39:checkcast       #96  <Class TabLayout>
	//   17   42:putfield        #100 <Field TabLayout c>
		d = (CustomTextView)a1.a(0x7f090288);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #101 <Int 0x7f090288>
	//   21   49:invokeinterface #81  <Method View a.a(int)>
	//   22   54:checkcast       #103 <Class CustomTextView>
	//   23   57:putfield        #107 <Field CustomTextView d>
		e();
	//   24   60:aload_0         
	//   25   61:invokevirtual   #109 <Method void e()>
	//   26   64:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(g);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field c g>
	//    2    4:invokestatic    #113 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #115 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #117 <Method void HistoryActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #113 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0044);
	//   13   23:aload_0         
	//   14   24:ldc1            #118 <Int 0x7f0b0044>
	//   15   26:invokevirtual   #122 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #123 <Method void HistoryActivity.setContentView(int)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #125 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method void HistoryActivity.setContentView(View)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field c g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #125 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #131 <Method void HistoryActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		g.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field c g>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #125 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #135 <Method void HistoryActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #33  <Method void g()>
	//    5    9:return          
	}

	private final c g = new c();
}
