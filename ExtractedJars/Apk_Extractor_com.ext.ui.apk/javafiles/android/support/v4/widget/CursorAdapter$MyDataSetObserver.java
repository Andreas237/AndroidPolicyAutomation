// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.widget:
//			CursorAdapter

private class CursorAdapter$MyDataSetObserver extends DataSetObserver
{

	public void onChanged()
	{
		mDataValid = true;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CursorAdapter this$0>
	//    2    4:iconst_1        
	//    3    5:putfield        #22  <Field boolean CursorAdapter.mDataValid>
		notifyDataSetChanged();
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field CursorAdapter this$0>
	//    6   12:invokevirtual   #25  <Method void CursorAdapter.notifyDataSetChanged()>
	//    7   15:return          
	}

	public void onInvalidated()
	{
		mDataValid = false;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CursorAdapter this$0>
	//    2    4:iconst_0        
	//    3    5:putfield        #22  <Field boolean CursorAdapter.mDataValid>
		notifyDataSetInvalidated();
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field CursorAdapter this$0>
	//    6   12:invokevirtual   #29  <Method void CursorAdapter.notifyDataSetInvalidated()>
	//    7   15:return          
	}

	final CursorAdapter this$0;

	CursorAdapter$MyDataSetObserver()
	{
		this$0 = CursorAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field CursorAdapter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
