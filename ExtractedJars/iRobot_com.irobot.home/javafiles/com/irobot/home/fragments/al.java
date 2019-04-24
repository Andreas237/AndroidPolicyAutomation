// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ak

public final class al extends ak
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ak a()
		{
			al al1 = new al();
		//    0    0:new             #7   <Class al>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void al()>
		//    3    7:astore_1        
			al1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void al.setArguments(Bundle)>
			return ((ak) (al1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public al()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ak()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void c()>
	//    6   12:putfield        #26  <Field c c>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void c.a(b)>
	//    2    4:return          
	}

	static void a(al al1)
	{
		((ak) (al1)).ak.a_();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void ak.a_()>
	//    2    4:return          
	}

	public static a i()
	{
		return new a();
	//    0    0:new             #12  <Class al$a>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void al$a()>
	//    3    7:areturn         
	}

	public View a(int j)
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field View d>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return d.findViewById(j);
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field View d>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #46  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (GLSurfaceView)a1.a(0x7f090421);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <Int 0x7f090421>
	//    3    4:invokeinterface #52  <Method View a.a(int)>
	//    4    9:checkcast       #54  <Class GLSurfaceView>
	//    5   12:putfield        #57  <Field GLSurfaceView a>
		b = (FrameLayout)a1.a(0x7f090422);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #58  <Int 0x7f090422>
	//    9   19:invokeinterface #52  <Method View a.a(int)>
	//   10   24:checkcast       #60  <Class FrameLayout>
	//   11   27:putfield        #64  <Field FrameLayout b>
		e();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #67  <Method void e()>
	//   14   34:return          
	}

	public void a_()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.al.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field al a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.fragments.al.a(al)>
			//    3    7:return          
			}

			final al a;

			
			{
				a = al.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field al a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #69  <String "">
	//    1    2:new             #10  <Class al$1>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #71  <Method void al$1(al)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #76  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c c>
	//    2    4:invokestatic    #80  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #82  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #84  <Method void ak.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #80  <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		d = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #88  <Method View ak.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #41  <Field View d>
		if(d == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #41  <Field View d>
	//*   9   15:ifnonnull       30
			d = layoutinflater.inflate(0x7f0b00bc, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #89  <Int 0x7f0b00bc>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #95  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #41  <Field View d>
		return d;
	//   17   30:aload_0         
	//   18   31:getfield        #41  <Field View d>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void ak.onDestroyView()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #41  <Field View d>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #57  <Field GLSurfaceView a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #64  <Field FrameLayout b>
	//   11   19:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #102 <Method void ak.onViewCreated(View, Bundle)>
		c.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c c>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #104 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c c = new c();
	private View d;
}
