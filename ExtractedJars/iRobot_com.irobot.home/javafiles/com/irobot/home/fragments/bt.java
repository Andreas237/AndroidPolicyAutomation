// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			bs

public final class bt extends bs
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bs a()
		{
			bt bt1 = new bt();
		//    0    0:new             #7   <Class bt>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bt()>
		//    3    7:astore_1        
			bt1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bt.setArguments(Bundle)>
			return ((bs) (bt1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(int i)
		{
			a.putInt("headerTitleResourceId", i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "headerTitleResourceId">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(String s)
		{
			a.putString("robotName", s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "robotName">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
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


	public bt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void bs()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c d>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method void c.a(b)>
		c();
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void c()>
	//    4    8:return          
	}

	public static a b()
	{
		return new a();
	//    0    0:new             #10  <Class bt$a>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void bt$a()>
	//    3    7:areturn         
	}

	private void c()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          47
		{
			if(bundle.containsKey("robotName"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #41  <String "robotName">
	//*   7   12:invokevirtual   #47  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				b = bundle.getString("robotName");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #41  <String "robotName">
	//   12   22:invokevirtual   #51  <Method String Bundle.getString(String)>
	//   13   25:putfield        #54  <Field String b>
			if(bundle.containsKey("headerTitleResourceId"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #56  <String "headerTitleResourceId">
	//*  16   31:invokevirtual   #47  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				c = bundle.getInt("headerTitleResourceId");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #56  <String "headerTitleResourceId">
	//   21   41:invokevirtual   #60  <Method int Bundle.getInt(String)>
	//   22   44:putfield        #63  <Field int c>
		}
	//   23   47:return          
	}

	public View a(int i)
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field View e>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return e.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field View e>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #71  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (TextView)a1.a(0x7f09030b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #75  <Int 0x7f09030b>
	//    3    4:invokeinterface #77  <Method View a.a(int)>
	//    4    9:checkcast       #79  <Class TextView>
	//    5   12:putfield        #82  <Field TextView a>
		a();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #84  <Method void a()>
	//    8   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c d>
	//    2    4:invokestatic    #88  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #90  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #92  <Method void bs.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #88  <Method c c.a(c)>
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
	//    5    5:invokespecial   #96  <Method View bs.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #66  <Field View e>
		if(e == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #66  <Field View e>
	//*   9   15:ifnonnull       30
			e = layoutinflater.inflate(0x7f0b00d6, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #97  <Int 0x7f0b00d6>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #103 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #66  <Field View e>
		return e;
	//   17   30:aload_0         
	//   18   31:getfield        #66  <Field View e>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void bs.onDestroyView()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #66  <Field View e>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #82  <Field TextView a>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #110 <Method void bs.onViewCreated(View, Bundle)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #112 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c d = new c();
	private View e;
}
