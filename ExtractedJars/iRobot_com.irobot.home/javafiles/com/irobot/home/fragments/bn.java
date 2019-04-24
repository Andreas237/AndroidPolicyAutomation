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
//			bm

public final class bn extends bm
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bm a()
		{
			bn bn1 = new bn();
		//    0    0:new             #7   <Class bn>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bn()>
		//    3    7:astore_1        
			bn1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bn.setArguments(Bundle)>
			return ((bm) (bn1));
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


	public bn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void bm()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c c>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void d()>
		org.androidannotations.api.c.c.a(((b) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method void c.a(b)>
	//    4    8:return          
	}

	public static a c()
	{
		return new a();
	//    0    0:new             #10  <Class bn$a>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void bn$a()>
	//    3    7:areturn         
	}

	private void d()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null && bundle.containsKey("assetID"))
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
	//*   5    9:aload_1         
	//*   6   10:ldc1            #39  <String "assetID">
	//*   7   12:invokevirtual   #45  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
			a = bundle.getString("assetID");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #39  <String "assetID">
	//   12   22:invokevirtual   #49  <Method String Bundle.getString(String)>
	//   13   25:putfield        #52  <Field String a>
	//   14   28:return          
	}

	public View a(int i)
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field View d>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return d.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field View d>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #60  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void b()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c c>
	//    2    4:invokestatic    #70  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #72  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #74  <Method void bm.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #70  <Method c c.a(c)>
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
	//    5    5:invokespecial   #78  <Method View bm.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #55  <Field View d>
		if(d == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #55  <Field View d>
	//*   9   15:ifnonnull       30
			d = layoutinflater.inflate(0x7f0b00cf, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #79  <Int 0x7f0b00cf>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #85  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #55  <Field View d>
		return d;
	//   17   30:aload_0         
	//   18   31:getfield        #55  <Field View d>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void bm.onDestroyView()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #55  <Field View d>
	//    5    9:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #92  <Method void bm.onViewCreated(View, Bundle)>
		c.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c c>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #94  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c c = new c();
	private View d;
}
