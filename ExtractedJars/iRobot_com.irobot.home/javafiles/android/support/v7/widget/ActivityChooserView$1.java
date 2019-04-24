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
	//    1    1:invokespecial   #19  <Method void DataSetObserver.onChanged()>
		a.a.notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field ActivityChooserView a>
	//    4    8:getfield        #22  <Field ActivityChooserView$a ActivityChooserView.a>
	//    5   11:invokevirtual   #27  <Method void ActivityChooserView$a.notifyDataSetChanged()>
	//    6   14:return          
	}

	public void onInvalidated()
	{
		super.onInvalidated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void DataSetObserver.onInvalidated()>
		a.a.notifyDataSetInvalidated();
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field ActivityChooserView a>
	//    4    8:getfield        #22  <Field ActivityChooserView$a ActivityChooserView.a>
	//    5   11:invokevirtual   #33  <Method void ActivityChooserView$a.notifyDataSetInvalidated()>
	//    6   14:return          
	}

	final ActivityChooserView a;

	ActivityChooserView$1(ActivityChooserView activitychooserview)
	{
		a = activitychooserview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ActivityChooserView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
