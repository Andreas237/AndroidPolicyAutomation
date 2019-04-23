// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow

class ListPopupWindow$PopupDataSetObserver extends DataSetObserver
{

	public void onChanged()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #10  <Field ListPopupWindow this$0>
	//*   2    4:invokevirtual   #21  <Method boolean ListPopupWindow.isShowing()>
	//*   3    7:ifeq            17
			show();
	//    4   10:aload_0         
	//    5   11:getfield        #10  <Field ListPopupWindow this$0>
	//    6   14:invokevirtual   #24  <Method void ListPopupWindow.show()>
	//    7   17:return          
	}

	public void onInvalidated()
	{
		dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ListPopupWindow this$0>
	//    2    4:invokevirtual   #28  <Method void ListPopupWindow.dismiss()>
	//    3    7:return          
	}

	final ListPopupWindow this$0;

	ListPopupWindow$PopupDataSetObserver()
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ListPopupWindow this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
