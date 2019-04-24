// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$e extends DataSetObserver
{

	public void onChanged()
	{
		e.populateFromPagerAdapter();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field TabLayout e>
	//    2    4:invokevirtual   #20  <Method void TabLayout.populateFromPagerAdapter()>
	//    3    7:return          
	}

	public void onInvalidated()
	{
		e.populateFromPagerAdapter();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field TabLayout e>
	//    2    4:invokevirtual   #20  <Method void TabLayout.populateFromPagerAdapter()>
	//    3    7:return          
	}

	final TabLayout e;

	TabLayout$e(TabLayout tablayout)
	{
		e = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field TabLayout e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
