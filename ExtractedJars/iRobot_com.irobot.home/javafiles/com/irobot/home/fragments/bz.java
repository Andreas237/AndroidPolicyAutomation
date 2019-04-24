// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			by

public final class bz extends by
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public by a()
		{
			bz bz1 = new bz();
		//    0    0:new             #7   <Class bz>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bz()>
		//    3    7:astore_1        
			bz1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bz.setArguments(Bundle)>
			return ((by) (bz1));
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


	public bz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void by()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void c()>
	//    6   12:putfield        #23  <Field c a>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #28  <Method void c.a(b)>
	//    2    4:return          
	}

	public static a b()
	{
		return new a();
	//    0    0:new             #10  <Class bz$a>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void bz$a()>
	//    3    7:areturn         
	}

	public View a(int i)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field View b>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return b.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field View b>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #38  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void a()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field c a>
	//    2    4:invokestatic    #47  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #49  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #51  <Method void by.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #47  <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		b = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #55  <Method View by.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #33  <Field View b>
		if(b == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #33  <Field View b>
	//*   9   15:ifnonnull       30
			b = layoutinflater.inflate(0x7f0b00d9, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #56  <Int 0x7f0b00d9>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #62  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #33  <Field View b>
		return b;
	//   17   30:aload_0         
	//   18   31:getfield        #33  <Field View b>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void by.onDestroyView()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #33  <Field View b>
	//    5    9:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #69  <Method void by.onViewCreated(View, Bundle)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field c a>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #71  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c a = new c();
	private View b;
}
