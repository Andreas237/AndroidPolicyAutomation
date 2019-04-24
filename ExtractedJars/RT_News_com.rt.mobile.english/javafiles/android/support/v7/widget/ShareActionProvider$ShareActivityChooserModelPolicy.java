// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Intent;

// Referenced classes of package android.support.v7.widget:
//			ShareActionProvider, ActivityChooserModel

private class ShareActionProvider$ShareActivityChooserModelPolicy
	implements ActivityChooserModel.OnChooseActivityListener
{

	public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
	{
		if(mOnShareTargetSelectedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ShareActionProvider this$0>
	//*   2    4:getfield        #25  <Field ShareActionProvider$OnShareTargetSelectedListener ShareActionProvider.mOnShareTargetSelectedListener>
	//*   3    7:ifnull          28
			mOnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider.this, intent);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ShareActionProvider this$0>
	//    6   14:getfield        #25  <Field ShareActionProvider$OnShareTargetSelectedListener ShareActionProvider.mOnShareTargetSelectedListener>
	//    7   17:aload_0         
	//    8   18:getfield        #15  <Field ShareActionProvider this$0>
	//    9   21:aload_2         
	//   10   22:invokeinterface #31  <Method boolean ShareActionProvider$OnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider, Intent)>
	//   11   27:pop             
		return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	final ShareActionProvider this$0;

	ShareActionProvider$ShareActivityChooserModelPolicy()
	{
		this$0 = ShareActionProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ShareActionProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
