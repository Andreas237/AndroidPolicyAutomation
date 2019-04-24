// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			au

public final class av extends au
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public au a()
		{
			av av1 = new av();
		//    0    0:new             #7   <Class av>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void av()>
		//    3    7:astore_1        
			av1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void av.setArguments(Bundle)>
			return ((au) (av1));
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


	public av()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void au()>
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

	public static a c()
	{
		return new a();
	//    0    0:new             #10  <Class av$a>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void av$a()>
	//    3    7:areturn         
	}

	public View a(int i)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field View c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return c.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field View c>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #39  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (ProgressBar)a1.a(0x7f090223);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #43  <Int 0x7f090223>
	//    3    4:invokeinterface #45  <Method View a.a(int)>
	//    4    9:checkcast       #47  <Class ProgressBar>
	//    5   12:putfield        #50  <Field ProgressBar a>
		a();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #52  <Method void a()>
	//    8   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c b>
	//    2    4:invokestatic    #56  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #58  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #60  <Method void au.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #56  <Method c c.a(c)>
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
	//    5    5:invokespecial   #64  <Method View au.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #34  <Field View c>
		if(c == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #34  <Field View c>
	//*   9   15:ifnonnull       30
			c = layoutinflater.inflate(0x7f0b00c3, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #65  <Int 0x7f0b00c3>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #71  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #34  <Field View c>
		return c;
	//   17   30:aload_0         
	//   18   31:getfield        #34  <Field View c>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void au.onDestroyView()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #34  <Field View c>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #50  <Field ProgressBar a>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #78  <Method void au.onViewCreated(View, Bundle)>
		b.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c b>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #80  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c b = new c();
	private View c;
}
