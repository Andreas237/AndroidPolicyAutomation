// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.design.widget:
//			TabLayout

private class TabLayout$PagerAdapterObserver extends DataSetObserver
{

	public void onChanged()
	{
		populateFromPagerAdapter();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field TabLayout this$0>
	//    2    4:invokevirtual   #21  <Method void TabLayout.populateFromPagerAdapter()>
	//    3    7:return          
	}

	public void onInvalidated()
	{
		populateFromPagerAdapter();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field TabLayout this$0>
	//    2    4:invokevirtual   #21  <Method void TabLayout.populateFromPagerAdapter()>
	//    3    7:return          
	}

	final TabLayout this$0;

	TabLayout$PagerAdapterObserver()
	{
		this$0 = TabLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field TabLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
