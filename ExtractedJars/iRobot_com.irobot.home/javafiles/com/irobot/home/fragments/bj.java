// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home.fragments:
//			bi

public final class bj extends bi
	implements a, b
{

	public bj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void bi()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void c()>
	//    6   12:putfield        #21  <Field c b>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method void c.a(b)>
	//    2    4:return          
	}

	public View a(int i)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field View c>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return c.findViewById(i);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field View c>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #35  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(a a1)
	{
		a = (TextView)a1.a(0x7f0901b7);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #39  <Int 0x7f0901b7>
	//    3    4:invokeinterface #41  <Method View a.a(int)>
	//    4    9:checkcast       #43  <Class TextView>
	//    5   12:putfield        #46  <Field TextView a>
		a();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #48  <Method void a()>
	//    8   19:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field c b>
	//    2    4:invokestatic    #52  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #54  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #56  <Method void bi.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #52  <Method c c.a(c)>
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
	//    5    5:invokespecial   #60  <Method View bi.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #30  <Field View c>
		if(c == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #30  <Field View c>
	//*   9   15:ifnonnull       30
			c = layoutinflater.inflate(0x7f0b00cc, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #61  <Int 0x7f0b00cc>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #67  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #30  <Field View c>
		return c;
	//   17   30:aload_0         
	//   18   31:getfield        #30  <Field View c>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void bi.onDestroyView()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #30  <Field View c>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #46  <Field TextView a>
	//    8   14:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #74  <Method void bi.onViewCreated(View, Bundle)>
		b.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field c b>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #76  <Method void c.a(a)>
	//    8   14:return          
	}

	private final c b = new c();
	private View c;
}
