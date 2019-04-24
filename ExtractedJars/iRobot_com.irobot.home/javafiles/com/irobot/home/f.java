// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			e

public final class f extends e
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public e a()
		{
			f f1 = new f();
		//    0    0:new             #7   <Class f>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void f()>
		//    3    7:astore_1        
			f1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void f.setArguments(Bundle)>
			return ((e) (f1));
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


	public f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void e()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c b>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method void c.a(b)>
	//    2    4:return          
	}

	public static a d()
	{
		return new a();
	//    0    0:new             #10  <Class f$a>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void f$a()>
	//    3    7:areturn         
	}

	public View a(int i)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field View c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return c.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field View c>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #40  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (RecyclerView)a1.a(0x7f090195);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #44  <Int 0x7f090195>
	//    3    4:invokeinterface #46  <Method View a.a(int)>
	//    4    9:checkcast       #48  <Class RecyclerView>
	//    5   12:putfield        #51  <Field RecyclerView a>
		b();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #53  <Method void b()>
	//    8   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c b>
	//    2    4:invokestatic    #57  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #59  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #61  <Method void e.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #57  <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		c = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #65  <Method View e.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #35  <Field View c>
		if(c == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #35  <Field View c>
	//*   9   15:ifnonnull       30
			c = layoutinflater.inflate(0x7f0b00c1, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #66  <Int 0x7f0b00c1>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #72  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #35  <Field View c>
		return c;
	//   17   30:aload_0         
	//   18   31:getfield        #35  <Field View c>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void e.onDestroyView()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field View c>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #51  <Field RecyclerView a>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #79  <Method void e.onViewCreated(View, Bundle)>
		b.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c b>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #81  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c b = new c();
	private View c;
}
