// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package com.mixpanel.android.b:
//			o

class o$g$1
	implements Comparator
{

	public int a(View view, View view1)
	{
		if(view == view1)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		if(view == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return -1;
	//    7   11:iconst_m1       
	//    8   12:ireturn         
		if(view1 == null)
	//*   9   13:aload_2         
	//*  10   14:ifnonnull       19
			return 1;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		else
			return ((Object) (view1)).hashCode() - ((Object) (view)).hashCode();
	//   13   19:aload_2         
	//   14   20:invokevirtual   #29  <Method int Object.hashCode()>
	//   15   23:aload_1         
	//   16   24:invokevirtual   #29  <Method int Object.hashCode()>
	//   17   27:isub            
	//   18   28:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return a((View)obj, (View)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #33  <Class View>
	//    5    9:invokevirtual   #35  <Method int a(View, View)>
	//    6   12:ireturn         
	}

	final o.g a;

	o$g$1(o.g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field o$g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
