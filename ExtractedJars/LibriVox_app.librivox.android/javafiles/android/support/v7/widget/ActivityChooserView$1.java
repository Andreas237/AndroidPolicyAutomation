// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView

class ActivityChooserView$1 extends DataSetObserver
{

	public void onChanged()
	{
		super.onChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void DataSetObserver.onChanged()>
		mAdapter.notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field ActivityChooserView this$0>
	//    4    8:getfield        #23  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//    5   11:invokevirtual   #28  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetChanged()>
	//    6   14:return          
	}

	public void onInvalidated()
	{
		super.onInvalidated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void DataSetObserver.onInvalidated()>
		mAdapter.notifyDataSetInvalidated();
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field ActivityChooserView this$0>
	//    4    8:getfield        #23  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//    5   11:invokevirtual   #34  <Method void ActivityChooserView$ActivityChooserViewAdapter.notifyDataSetInvalidated()>
	//    6   14:return          
	}

	final ActivityChooserView this$0;

	ActivityChooserView$1()
	{
		this$0 = ActivityChooserView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ActivityChooserView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
