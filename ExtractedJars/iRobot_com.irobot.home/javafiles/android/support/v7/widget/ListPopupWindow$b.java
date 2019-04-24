// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow

private class ListPopupWindow$b extends DataSetObserver
{

	public void onChanged()
	{
		if(a.f())
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ListPopupWindow a>
	//*   2    4:invokevirtual   #22  <Method boolean ListPopupWindow.f()>
	//*   3    7:ifeq            17
			a.d();
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ListPopupWindow a>
	//    6   14:invokevirtual   #25  <Method void ListPopupWindow.d()>
	//    7   17:return          
	}

	public void onInvalidated()
	{
		a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ListPopupWindow a>
	//    2    4:invokevirtual   #29  <Method void ListPopupWindow.e()>
	//    3    7:return          
	}

	final ListPopupWindow a;

	ListPopupWindow$b(ListPopupWindow listpopupwindow)
	{
		a = listpopupwindow;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ListPopupWindow a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
