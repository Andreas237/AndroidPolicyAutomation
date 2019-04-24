// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//			ViewPager

static final class ViewPager$1
	implements Comparator
{

	public int a(ViewPager$b viewpager$b, ViewPager$b viewpager$b1)
	{
		return viewpager$b.b - viewpager$b1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field int ViewPager$b.b>
	//    2    4:aload_2         
	//    3    5:getfield        #22  <Field int ViewPager$b.b>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return a((ViewPager$b)obj, (ViewPager$b)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class ViewPager$b>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class ViewPager$b>
	//    5    9:invokevirtual   #26  <Method int a(ViewPager$b, ViewPager$b)>
	//    6   12:ireturn         
	}

	ViewPager$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
