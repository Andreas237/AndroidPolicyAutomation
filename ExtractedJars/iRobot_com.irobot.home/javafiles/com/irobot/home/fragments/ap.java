// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.irobot.home.view.WebViewLanguageCompat;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ao

public final class ap extends ao
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ao a()
		{
			ap ap1 = new ap();
		//    0    0:new             #7   <Class ap>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void ap()>
		//    3    7:astore_1        
			ap1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void ap.setArguments(Bundle)>
			return ((ao) (ap1));
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


	public ap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ao()>
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
	//    2    4:return          
	}

	public static a c()
	{
		return new a();
	//    0    0:new             #10  <Class ap$a>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void ap$a()>
	//    3    7:areturn         
	}

	public View a(int i)
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field View e>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return e.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field View e>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #40  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (WebViewLanguageCompat)a1.a(0x7f090492);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #44  <Int 0x7f090492>
	//    3    4:invokeinterface #46  <Method View a.a(int)>
	//    4    9:checkcast       #48  <Class WebViewLanguageCompat>
	//    5   12:putfield        #51  <Field WebViewLanguageCompat a>
		b = (TextView)a1.a(0x7f090459);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #52  <Int 0x7f090459>
	//    9   19:invokeinterface #46  <Method View a.a(int)>
	//   10   24:checkcast       #54  <Class TextView>
	//   11   27:putfield        #58  <Field TextView b>
		c = (TextView)a1.a(0x7f090458);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #59  <Int 0x7f090458>
	//   15   34:invokeinterface #46  <Method View a.a(int)>
	//   16   39:checkcast       #54  <Class TextView>
	//   17   42:putfield        #61  <Field TextView c>
		a();
	//   18   45:aload_0         
	//   19   46:invokevirtual   #63  <Method void a()>
	//   20   49:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field c d>
	//    2    4:invokestatic    #67  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #69  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #71  <Method void ao.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #67  <Method c c.a(c)>
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
	//    5    5:invokespecial   #75  <Method View ao.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #35  <Field View e>
		if(e == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #35  <Field View e>
	//*   9   15:ifnonnull       30
			e = layoutinflater.inflate(0x7f0b00bf, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #76  <Int 0x7f0b00bf>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #82  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #35  <Field View e>
		return e;
	//   17   30:aload_0         
	//   18   31:getfield        #35  <Field View e>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void ao.onDestroyView()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field View e>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #51  <Field WebViewLanguageCompat a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #58  <Field TextView b>
		c = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #61  <Field TextView c>
	//   14   24:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #89  <Method void ao.onViewCreated(View, Bundle)>
		d.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field c d>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #91  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c d = new c();
	private View e;
}
