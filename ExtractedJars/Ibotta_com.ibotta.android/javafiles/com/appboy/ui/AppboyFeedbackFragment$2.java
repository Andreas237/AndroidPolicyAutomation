// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.view.View;

// Referenced classes of package com.appboy.ui:
//			AppboyFeedbackFragment

class AppboyFeedbackFragment$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		AppboyFeedbackFragment.access$200(AppboyFeedbackFragment.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//    2    4:invokestatic    #26  <Method void AppboyFeedbackFragment.access$200(AppboyFeedbackFragment)>
		if(AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this) != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//*   5   11:invokestatic    #30  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
	//*   6   14:ifnull          32
			AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this).onFeedbackFinished(edbackResult.CANCELLED);
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//    9   21:invokestatic    #30  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
	//   10   24:getstatic       #36  <Field AppboyFeedbackFragment$FeedbackResult AppboyFeedbackFragment$FeedbackResult.CANCELLED>
	//   11   27:invokeinterface #42  <Method void AppboyFeedbackFragment$IFeedbackFinishedListener.onFeedbackFinished(AppboyFeedbackFragment$FeedbackResult)>
		AppboyFeedbackFragment.access$400(AppboyFeedbackFragment.this);
	//   12   32:aload_0         
	//   13   33:getfield        #17  <Field AppboyFeedbackFragment this$0>
	//   14   36:invokestatic    #45  <Method void AppboyFeedbackFragment.access$400(AppboyFeedbackFragment)>
	//   15   39:return          
	}

	final AppboyFeedbackFragment this$0;

	AppboyFeedbackFragment$2()
	{
		this$0 = AppboyFeedbackFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyFeedbackFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
