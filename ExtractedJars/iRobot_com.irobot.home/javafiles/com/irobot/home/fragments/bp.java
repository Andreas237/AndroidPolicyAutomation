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
//			bo

public final class bp extends bo
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bo a()
		{
			bp bp1 = new bp();
		//    0    0:new             #7   <Class bp>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bp()>
		//    3    7:astore_1        
			bp1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bp.setArguments(Bundle)>
			return ((bo) (bp1));
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


	public bp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void bo()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c e>
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
	//    0    0:new             #10  <Class bp$a>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void bp$a()>
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
				c = bundle.getString("robotName");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #41  <String "robotName">
	//   12   22:invokevirtual   #51  <Method String Bundle.getString(String)>
	//   13   25:putfield        #54  <Field String c>
			if(bundle.containsKey("headerTitleResourceId"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #56  <String "headerTitleResourceId">
	//*  16   31:invokevirtual   #47  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				d = bundle.getInt("headerTitleResourceId");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #56  <String "headerTitleResourceId">
	//   21   41:invokevirtual   #60  <Method int Bundle.getInt(String)>
	//   22   44:putfield        #64  <Field int d>
		}
	//   23   47:return          
	}

	public View a(int i)
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field View f>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return f.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #67  <Field View f>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #72  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (TextView)a1.a(0x7f09030b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #76  <Int 0x7f09030b>
	//    3    4:invokeinterface #78  <Method View a.a(int)>
	//    4    9:checkcast       #80  <Class TextView>
	//    5   12:putfield        #83  <Field TextView a>
		b = (TextView)a1.a(0x7f0903ef);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #84  <Int 0x7f0903ef>
	//    9   19:invokeinterface #78  <Method View a.a(int)>
	//   10   24:checkcast       #80  <Class TextView>
	//   11   27:putfield        #86  <Field TextView b>
		a();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #88  <Method void a()>
	//   14   34:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c e>
	//    2    4:invokestatic    #92  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #94  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #96  <Method void bo.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #92  <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		f = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #100 <Method View bo.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #67  <Field View f>
		if(f == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #67  <Field View f>
	//*   9   15:ifnonnull       30
			f = layoutinflater.inflate(0x7f0b00d3, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #101 <Int 0x7f0b00d3>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #107 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #67  <Field View f>
		return f;
	//   17   30:aload_0         
	//   18   31:getfield        #67  <Field View f>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method void bo.onDestroyView()>
		f = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #67  <Field View f>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #83  <Field TextView a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #86  <Field TextView b>
	//   11   19:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #114 <Method void bo.onViewCreated(View, Bundle)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c e>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #116 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c e = new c();
	private View f;
}
