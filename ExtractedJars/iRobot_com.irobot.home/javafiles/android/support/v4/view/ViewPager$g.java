// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//			ViewPager

private class ViewPager$g extends DataSetObserver
{

	public void onChanged()
	{
		a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ViewPager a>
	//    2    4:invokevirtual   #21  <Method void ViewPager.b()>
	//    3    7:return          
	}

	public void onInvalidated()
	{
		a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ViewPager a>
	//    2    4:invokevirtual   #21  <Method void ViewPager.b()>
	//    3    7:return          
	}

	final ViewPager a;

	ViewPager$g(ViewPager viewpager)
	{
		a = viewpager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ViewPager a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
