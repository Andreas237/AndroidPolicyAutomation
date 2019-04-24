// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.view.View;
import java.util.List;

// Referenced classes of package com.mixpanel.android.b:
//			o

public static class o$k extends o$d
{

	public void a()
	{
	//    0    0:return          
	}

	public void a(View view)
	{
		if(view != null && !a)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_0         
	//*   3    5:getfield        #16  <Field boolean a>
	//*   4    8:ifne            16
			c(view);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #24  <Method void c(View)>
		boolean flag;
		if(view != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		a = flag;
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:putfield        #16  <Field boolean a>
	//   18   32:return          
	}

	public volatile void b(View view)
	{
		super.b(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void o$d.b(View)>
	//    3    5:return          
	}

	private boolean a;

	public o$k(List list, String s, o$h o$h)
	{
		super(list, s, o$h, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #14  <Method void o$d(List, String, o$h, boolean)>
		a = false;
	//    6    8:aload_0         
	//    7    9:iconst_0        
	//    8   10:putfield        #16  <Field boolean a>
	//    9   13:return          
	}
}
