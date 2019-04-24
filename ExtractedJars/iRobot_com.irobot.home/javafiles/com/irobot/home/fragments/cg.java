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
//			cf

public final class cg extends cf
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public cf a()
		{
			cg cg1 = new cg();
		//    0    0:new             #7   <Class cg>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void cg()>
		//    3    7:astore_1        
			cg1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void cg.setArguments(Bundle)>
			return ((cf) (cg1));
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


	public cg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void cf()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c b>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method void c.a(b)>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void e()>
	//    4    8:return          
	}

	public static a d()
	{
		return new a();
	//    0    0:new             #14  <Class cg$a>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void cg$a()>
	//    3    7:areturn         
	}

	private void e()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null && bundle.containsKey("assetId"))
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
	//*   5    9:aload_1         
	//*   6   10:ldc1            #45  <String "assetId">
	//*   7   12:invokevirtual   #51  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
			a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #45  <String "assetId">
	//   12   22:invokevirtual   #55  <Method String Bundle.getString(String)>
	//   13   25:putfield        #58  <Field String a>
	//   14   28:return          
	}

	public View a(int i)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field View c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return c.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field View c>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #66  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		View view = a1.a(0x7f090343);
	//    0    0:aload_1         
	//    1    1:ldc1            #70  <Int 0x7f090343>
	//    2    3:invokeinterface #72  <Method View a.a(int)>
	//    3    8:astore_2        
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f090477)));
	//    4    9:aload_1         
	//    5   10:ldc1            #73  <Int 0x7f090477>
	//    6   12:invokeinterface #72  <Method View a.a(int)>
	//    7   17:astore_1        
		if(view != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          34
			view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view1)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field cg a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.cg.b()>
				//    3    7:return          
				}

				final cg a;

			
			{
				a = cg.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field cg a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   10   22:aload_2         
	//   11   23:new             #10  <Class cg$1>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #76  <Method void cg$1(cg)>
	//   15   31:invokevirtual   #80  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(a1 != null)
	//*  16   34:aload_1         
	//*  17   35:ifnull          50
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view1)
				{
					a.c();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field cg a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.cg.c()>
				//    3    7:return          
				}

				final cg a;

			
			{
				a = cg.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field cg a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   18   38:aload_1         
	//   19   39:new             #12  <Class cg$2>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #81  <Method void cg$2(cg)>
	//   23   47:invokevirtual   #80  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #83  <Method void a()>
	//   26   54:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c b>
	//    2    4:invokestatic    #87  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #89  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #91  <Method void cf.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #87  <Method c c.a(c)>
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
	//    5    5:invokespecial   #95  <Method View cf.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #61  <Field View c>
		if(c == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #61  <Field View c>
	//*   9   15:ifnonnull       30
			c = layoutinflater.inflate(0x7f0b00de, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #96  <Int 0x7f0b00de>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #102 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #61  <Field View c>
		return c;
	//   17   30:aload_0         
	//   18   31:getfield        #61  <Field View c>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void cf.onDestroyView()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #61  <Field View c>
	//    5    9:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #109 <Method void cf.onViewCreated(View, Bundle)>
		b.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c b>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #111 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c b = new c();
	private View c;
}
