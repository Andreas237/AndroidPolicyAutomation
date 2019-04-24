// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.design.widget:
//			TabLayout

private class TabLayout$c extends DataSetObserver
{

	public void onChanged()
	{
		a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field TabLayout a>
	//    2    4:invokevirtual   #20  <Method void TabLayout.c()>
	//    3    7:return          
	}

	public void onInvalidated()
	{
		a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field TabLayout a>
	//    2    4:invokevirtual   #20  <Method void TabLayout.c()>
	//    3    7:return          
	}

	final TabLayout a;

	TabLayout$c(TabLayout tablayout)
	{
		a = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field TabLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
