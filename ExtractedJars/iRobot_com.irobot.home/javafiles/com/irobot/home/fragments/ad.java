// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ac

public final class ad extends ac
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ac a()
		{
			ad ad1 = new ad();
		//    0    0:new             #7   <Class ad>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ad()>
		//    3    7:astore_1        
			ad1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void ad.setArguments(Bundle)>
			return ((ac) (ad1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(String s)
		{
			a.putString("assetId", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "assetId">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public ad()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ac()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void c()>
	//    6   12:putfield        #32  <Field c d>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		h();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void h()>
	//    4    8:return          
	}

	static void a(ad ad1)
	{
		((ac) (ad1)).com.irobot.home.fragments.ac.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void com.irobot.home.fragments.ac.b()>
	//    2    4:return          
	}

	static void a(ad ad1, ArrayList arraylist)
	{
		((ac) (ad1)).com.irobot.home.fragments.ac.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void com.irobot.home.fragments.ac.a(ArrayList)>
	//    3    5:return          
	}

	static void b(ad ad1)
	{
		((ac) (ad1)).com.irobot.home.fragments.ac.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void com.irobot.home.fragments.ac.c()>
	//    2    4:return          
	}

	static void c(ad ad1)
	{
		((ac) (ad1)).ac.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void ac.e()>
	//    2    4:return          
	}

	public static a g()
	{
		return new a();
	//    0    0:new             #18  <Class ad$a>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void ad$a()>
	//    3    7:areturn         
	}

	private void h()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null && bundle.containsKey("assetId"))
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
	//*   5    9:aload_1         
	//*   6   10:ldc1            #62  <String "assetId">
	//*   7   12:invokevirtual   #68  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
			a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #62  <String "assetId">
	//   12   22:invokevirtual   #72  <Method String Bundle.getString(String)>
	//   13   25:putfield        #75  <Field String a>
	//   14   28:return          
	}

	public View a(int i)
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field View e>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return e.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #78  <Field View e>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #83  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(ArrayList arraylist)
	{
		org.androidannotations.api.b.a("", new Runnable(arraylist) {

			public void run()
			{
				com.irobot.home.fragments.ad.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ad b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field ArrayList a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.fragments.ad.a(ad, ArrayList)>
			//    5   11:return          
			}

			final ArrayList a;
			final ad b;

			
			{
				b = ad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ad b>
				a = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ArrayList a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #87  <String "">
	//    1    2:new             #12  <Class ad$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #89  <Method void ad$2(ad, ArrayList)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #94  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (RecyclerView)a1.a(0x7f09029a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #97  <Int 0x7f09029a>
	//    3    4:invokeinterface #99  <Method View a.a(int)>
	//    4    9:checkcast       #101 <Class RecyclerView>
	//    5   12:putfield        #104 <Field RecyclerView b>
		c = (RelativeLayout)a1.a(0x7f090296);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #105 <Int 0x7f090296>
	//    9   19:invokeinterface #99  <Method View a.a(int)>
	//   10   24:checkcast       #107 <Class RelativeLayout>
	//   11   27:putfield        #110 <Field RelativeLayout c>
		a();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #112 <Method void a()>
	//   14   34:return          
	}

	public void b()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.ad.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ad a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.ad.a(ad)>
			//    3    7:return          
			}

			final ad a;

			
			{
				a = ad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ad a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #87  <String "">
	//    1    2:new             #10  <Class ad$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #114 <Method void ad$1(ad)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #94  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void c()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.ad.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ad a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.fragments.ad.b(ad)>
			//    3    7:return          
			}

			final ad a;

			
			{
				a = ad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ad a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #87  <String "">
	//    1    2:new             #14  <Class ad$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #115 <Method void ad$3(ad)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #94  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void e()
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "") {

			public void a()
			{
				try
				{
					com.irobot.home.fragments.ad.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ad a>
			//    2    4:invokestatic    #25  <Method void com.irobot.home.fragments.ad.c(ad)>
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

			final ad a;

			
			{
				a = ad.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ad a>
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
	//    0    0:new             #16  <Class ad$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #87  <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #87  <String "">
	//    6   10:invokespecial   #118 <Method void ad$4(ad, String, long, String)>
	//    7   13:invokestatic    #123 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    8   16:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field c d>
	//    2    4:invokestatic    #127 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #129 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #131 <Method void ac.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #127 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		e = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #135 <Method View ac.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #78  <Field View e>
		if(e == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #78  <Field View e>
	//*   9   15:ifnonnull       30
			e = layoutinflater.inflate(0x7f0b00b7, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #136 <Int 0x7f0b00b7>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #142 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #78  <Field View e>
		return e;
	//   17   30:aload_0         
	//   18   31:getfield        #78  <Field View e>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void ac.onDestroyView()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #78  <Field View e>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #104 <Field RecyclerView b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #110 <Field RelativeLayout c>
	//   11   19:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #149 <Method void ac.onViewCreated(View, Bundle)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #151 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c d = new c();
	private View e;
}
