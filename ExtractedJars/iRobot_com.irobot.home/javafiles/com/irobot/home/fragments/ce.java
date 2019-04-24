// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			SoftwareUpdateCheckFragment

public final class ce extends SoftwareUpdateCheckFragment
	implements org.androidannotations.api.c.a
{
	public static class a extends org.androidannotations.api.a.c
	{

		public SoftwareUpdateCheckFragment a()
		{
			ce ce1 = new ce();
		//    0    0:new             #7   <Class ce>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ce()>
		//    3    7:astore_1        
			ce1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void ce.setArguments(Bundle)>
			return ((SoftwareUpdateCheckFragment) (ce1));
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


	public ce()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void SoftwareUpdateCheckFragment()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void c()>
	//    6   12:putfield        #22  <Field c b>
	//    7   15:return          
	}

	public static a a()
	{
		return new a();
	//    0    0:new             #8   <Class ce$a>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ce$a()>
	//    3    7:areturn         
	}

	private void a(Bundle bundle)
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void b()>
	//    2    4:return          
	}

	private void b()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null && bundle.containsKey("assetId"))
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
	//*   5    9:aload_1         
	//*   6   10:ldc1            #34  <String "assetId">
	//*   7   12:invokevirtual   #40  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
			a = bundle.getString("assetId");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #34  <String "assetId">
	//   12   22:invokevirtual   #44  <Method String Bundle.getString(String)>
	//   13   25:putfield        #47  <Field String a>
	//   14   28:return          
	}

	public View a(int i)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field View c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return c.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field View c>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #55  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field c b>
	//    2    4:invokestatic    #61  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #63  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #65  <Method void SoftwareUpdateCheckFragment.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #61  <Method c c.a(c)>
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
	//    5    5:invokespecial   #69  <Method View SoftwareUpdateCheckFragment.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #50  <Field View c>
		if(c == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #50  <Field View c>
	//*   9   15:ifnonnull       30
			c = layoutinflater.inflate(0x7f0b00dd, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #70  <Int 0x7f0b00dd>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #76  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #50  <Field View c>
		return c;
	//   17   30:aload_0         
	//   18   31:getfield        #50  <Field View c>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void SoftwareUpdateCheckFragment.onDestroyView()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #50  <Field View c>
	//    5    9:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #83  <Method void SoftwareUpdateCheckFragment.onViewCreated(View, Bundle)>
		b.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field c b>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #86  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c b = new c();
	private View c;
}
