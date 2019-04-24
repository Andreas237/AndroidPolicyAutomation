// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			bg

public final class bh extends bg
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public bg a()
		{
			bh bh1 = new bh();
		//    0    0:new             #7   <Class bh>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bh()>
		//    3    7:astore_1        
			bh1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bh.setArguments(Bundle)>
			return ((bg) (bh1));
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

		public a a(HashMap hashmap)
		{
			a.putSerializable("settingsMap", ((java.io.Serializable) (hashmap)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "settingsMap">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putSerializable(String, java.io.Serializable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(boolean flag)
		{
			a.putBoolean("isPresetSupported", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #43  <String "isPresetSupported">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #47  <Method void Bundle.putBoolean(String, boolean)>
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


	public bh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void bg()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void c()>
	//    6   12:putfield        #24  <Field c d>
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
	//    0    0:new             #10  <Class bh$a>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void bh$a()>
	//    3    7:areturn         
	}

	private void d()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          69
		{
			if(bundle.containsKey("assetId"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #40  <String "assetId">
	//*   7   12:invokevirtual   #46  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #40  <String "assetId">
	//   12   22:invokevirtual   #50  <Method String Bundle.getString(String)>
	//   13   25:putfield        #53  <Field String a>
			if(bundle.containsKey("isPresetSupported"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #55  <String "isPresetSupported">
	//*  16   31:invokevirtual   #46  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            47
				b = bundle.getBoolean("isPresetSupported");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #55  <String "isPresetSupported">
	//   21   41:invokevirtual   #58  <Method boolean Bundle.getBoolean(String)>
	//   22   44:putfield        #62  <Field boolean b>
			if(bundle.containsKey("settingsMap"))
	//*  23   47:aload_1         
	//*  24   48:ldc1            #64  <String "settingsMap">
	//*  25   50:invokevirtual   #46  <Method boolean Bundle.containsKey(String)>
	//*  26   53:ifeq            69
				c = (HashMap)bundle.getSerializable("settingsMap");
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:ldc1            #64  <String "settingsMap">
	//   30   60:invokevirtual   #68  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   31   63:checkcast       #70  <Class HashMap>
	//   32   66:putfield        #73  <Field HashMap c>
		}
	//   33   69:return          
	}

	public View a(int i)
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field View e>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return e.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field View e>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #81  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method void a()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c d>
	//    2    4:invokestatic    #90  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #92  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #94  <Method void bg.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #90  <Method c c.a(c)>
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
	//    5    5:invokespecial   #98  <Method View bg.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #76  <Field View e>
		if(e == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #76  <Field View e>
	//*   9   15:ifnonnull       30
			e = layoutinflater.inflate(0x7f0b00cb, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #99  <Int 0x7f0b00cb>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #105 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #76  <Field View e>
		return e;
	//   17   30:aload_0         
	//   18   31:getfield        #76  <Field View e>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void bg.onDestroyView()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #76  <Field View e>
	//    5    9:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #112 <Method void bg.onViewCreated(View, Bundle)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #114 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c d = new c();
	private View e;
}
