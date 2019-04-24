// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.s;
import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

static class CoordinatorLayout$e
	implements Comparator
{

	public int a(View view, View view1)
	{
		float f = s.y(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method float s.y(View)>
	//    2    4:fstore_3        
		float f1 = s.y(view1);
	//    3    5:aload_2         
	//    4    6:invokestatic    #23  <Method float s.y(View)>
	//    5    9:fstore          4
		if(f > f1)
	//*   6   11:fload_3         
	//*   7   12:fload           4
	//*   8   14:fcmpl           
	//*   9   15:ifle            20
			return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
		return f >= f1 ? 0 : 1;
	//   12   20:fload_3         
	//   13   21:fload           4
	//   14   23:fcmpg           
	//   15   24:ifge            29
	//   16   27:iconst_1        
	//   17   28:ireturn         
	//   18   29:iconst_0        
	//   19   30:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return a((View)obj, (View)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #27  <Class View>
	//    5    9:invokevirtual   #29  <Method int a(View, View)>
	//    6   12:ireturn         
	}

	CoordinatorLayout$e()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
