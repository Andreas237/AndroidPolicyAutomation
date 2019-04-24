// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.widget.ListView;

// Referenced classes of package android.support.v4.app:
//			ListFragment

class ListFragment$1
	implements Runnable
{

	public void run()
	{
		mList.focusableViewAvailable(((android.view.View) (mList)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ListFragment this$0>
	//    2    4:getfield        #23  <Field ListView ListFragment.mList>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ListFragment this$0>
	//    5   11:getfield        #23  <Field ListView ListFragment.mList>
	//    6   14:invokevirtual   #29  <Method void ListView.focusableViewAvailable(android.view.View)>
	//    7   17:return          
	}

	final ListFragment this$0;

	ListFragment$1()
	{
		this$0 = ListFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ListFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
