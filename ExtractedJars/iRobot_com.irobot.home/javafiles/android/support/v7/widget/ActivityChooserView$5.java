// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView

class ActivityChooserView$5 extends DataSetObserver
{

	public void onChanged()
	{
		super.onChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void DataSetObserver.onChanged()>
		a.d();
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field ActivityChooserView a>
	//    4    8:invokevirtual   #24  <Method void ActivityChooserView.d()>
	//    5   11:return          
	}

	final ActivityChooserView a;

	ActivityChooserView$5(ActivityChooserView activitychooserview)
	{
		a = activitychooserview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActivityChooserView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void DataSetObserver()>
	//    5    9:return          
	}
}
