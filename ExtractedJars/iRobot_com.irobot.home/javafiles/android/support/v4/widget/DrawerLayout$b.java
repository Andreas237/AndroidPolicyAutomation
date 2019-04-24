// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

static final class DrawerLayout$b extends a
{

	public void a(View view, b b1)
	{
		super.a(view, b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void a.a(View, b)>
		if(!DrawerLayout.l(view))
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #20  <Method boolean DrawerLayout.l(View)>
	//*   6   10:ifne            18
			b1.c(((View) (null)));
	//    7   13:aload_2         
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #26  <Method void b.c(View)>
	//   10   18:return          
	}

	DrawerLayout$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void a()>
	//    2    4:return          
	}
}
