// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v14.preference:
//			PreferenceFragment

class PreferenceFragment$2
	implements Runnable
{

	public void run()
	{
		PreferenceFragment.access$200(PreferenceFragment.this).focusableViewAvailable(((android.view.View) (PreferenceFragment.access$200(PreferenceFragment.this))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field PreferenceFragment this$0>
	//    2    4:invokestatic    #23  <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field PreferenceFragment this$0>
	//    5   11:invokestatic    #23  <Method RecyclerView PreferenceFragment.access$200(PreferenceFragment)>
	//    6   14:invokevirtual   #29  <Method void RecyclerView.focusableViewAvailable(android.view.View)>
	//    7   17:return          
	}

	final PreferenceFragment this$0;

	PreferenceFragment$2()
	{
		this$0 = PreferenceFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field PreferenceFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
