// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewPager;
import android.support.v4.view.p;

// Referenced classes of package android.support.design.widget:
//			TabLayout

private class TabLayout$a
	implements android.support.v4.view.ViewPager$d
{

	public void a(ViewPager viewpager, p p, p p1)
	{
		if(a.m == viewpager)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field TabLayout a>
	//*   2    4:getfield        #25  <Field ViewPager TabLayout.m>
	//*   3    7:aload_1         
	//*   4    8:if_acmpne       23
			a.a(p1, b);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field TabLayout a>
	//    7   15:aload_3         
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field boolean b>
	//   10   20:invokevirtual   #30  <Method void TabLayout.a(p, boolean)>
	//   11   23:return          
	}

	void a(boolean flag)
	{
		b = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean b>
	//    3    5:return          
	}

	final TabLayout a;
	private boolean b;

	TabLayout$a(TabLayout tablayout)
	{
		a = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field TabLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
