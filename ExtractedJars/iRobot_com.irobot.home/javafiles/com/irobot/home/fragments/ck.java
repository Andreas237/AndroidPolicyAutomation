// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.irobot.home.view.CustomVideoView;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			cj

public final class ck extends cj
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public cj a()
		{
			ck ck1 = new ck();
		//    0    0:new             #7   <Class ck>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ck()>
		//    3    7:astore_1        
			ck1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void ck.setArguments(Bundle)>
			return ((cj) (ck1));
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


	public ck()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void cj()>
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
		d();
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void d()>
	//    4    8:return          
	}

	public static a c()
	{
		return new a();
	//    0    0:new             #12  <Class ck$a>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ck$a()>
	//    3    7:areturn         
	}

	private void d()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null && bundle.containsKey("assetId"))
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
	//*   5    9:aload_1         
	//*   6   10:ldc1            #41  <String "assetId">
	//*   7   12:invokevirtual   #47  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
			a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #41  <String "assetId">
	//   12   22:invokevirtual   #51  <Method String Bundle.getString(String)>
	//   13   25:putfield        #54  <Field String a>
	//   14   28:return          
	}

	public View a(int i)
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field View d>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return d.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field View d>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #62  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (CustomVideoView)a1.a(0x7f09012c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #66  <Int 0x7f09012c>
	//    3    4:invokeinterface #68  <Method View a.a(int)>
	//    4    9:checkcast       #70  <Class CustomVideoView>
	//    5   12:putfield        #74  <Field CustomVideoView b>
		a1 = ((org.androidannotations.api.c.a) (a1.a(0x7f09011d)));
	//    6   15:aload_1         
	//    7   16:ldc1            #75  <Int 0x7f09011d>
	//    8   18:invokeinterface #68  <Method View a.a(int)>
	//    9   23:astore_1        
		if(a1 != null)
	//*  10   24:aload_1         
	//*  11   25:ifnull          40
			((View) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ck a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.ck.b()>
				//    3    7:return          
				}

				final ck a;

			
			{
				a = ck.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ck a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   12   28:aload_1         
	//   13   29:new             #10  <Class ck$1>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #78  <Method void ck$1(ck)>
	//   17   37:invokevirtual   #82  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   18   40:aload_0         
	//   19   41:invokevirtual   #84  <Method void a()>
	//   20   44:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field c c>
	//    2    4:invokestatic    #88  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #90  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #92  <Method void cj.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #88  <Method c c.a(c)>
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
	//    5    5:invokespecial   #96  <Method View cj.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #57  <Field View d>
		if(d == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #57  <Field View d>
	//*   9   15:ifnonnull       30
			d = layoutinflater.inflate(0x7f0b00e0, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #97  <Int 0x7f0b00e0>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #103 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #57  <Field View d>
		return d;
	//   17   30:aload_0         
	//   18   31:getfield        #57  <Field View d>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void cj.onDestroyView()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #57  <Field View d>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #74  <Field CustomVideoView b>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #110 <Method void cj.onViewCreated(View, Bundle)>
		c.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field c c>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #112 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c c = new c();
	private View d;
}
