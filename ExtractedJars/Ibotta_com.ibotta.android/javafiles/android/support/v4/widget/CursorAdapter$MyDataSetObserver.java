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
		CursorAdapter cursoradapter = CursorAdapter.this;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CursorAdapter this$0>
	//    2    4:astore_1        
		cursoradapter.mDataValid = true;
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:putfield        #22  <Field boolean CursorAdapter.mDataValid>
		cursoradapter.notifyDataSetChanged();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #25  <Method void CursorAdapter.notifyDataSetChanged()>
	//    8   14:return          
	}

	public void onInvalidated()
	{
		CursorAdapter cursoradapter = CursorAdapter.this;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CursorAdapter this$0>
	//    2    4:astore_1        
		cursoradapter.mDataValid = false;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:putfield        #22  <Field boolean CursorAdapter.mDataValid>
		cursoradapter.notifyDataSetInvalidated();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #29  <Method void CursorAdapter.notifyDataSetInvalidated()>
	//    8   14:return          
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
