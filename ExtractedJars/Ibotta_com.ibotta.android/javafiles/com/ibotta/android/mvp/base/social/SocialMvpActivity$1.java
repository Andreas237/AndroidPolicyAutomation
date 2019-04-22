// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.social;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.ibotta.android.tracking.Tracker;

// Referenced classes of package com.ibotta.android.mvp.base.social:
//			SocialMvpActivity, SocialMvpPresenter

class SocialMvpActivity$1
	implements FacebookCallback
{

	public void onCancel()
	{
		((SocialMvpPresenter)SocialMvpActivity.access$100(SocialMvpActivity.this)).onFacebookFeedCancelled();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SocialMvpActivity this$0>
	//    2    4:invokestatic    #27  <Method com.ibotta.android.mvp.base.MvpPresenter SocialMvpActivity.access$100(SocialMvpActivity)>
	//    3    7:checkcast       #29  <Class SocialMvpPresenter>
	//    4   10:invokeinterface #32  <Method void SocialMvpPresenter.onFacebookFeedCancelled()>
	//    5   15:return          
	}

	public void onError(FacebookException facebookexception)
	{
		((SocialMvpPresenter)SocialMvpActivity.access$200(SocialMvpActivity.this)).onFacebookFeedFail(((Exception) (facebookexception)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SocialMvpActivity this$0>
	//    2    4:invokestatic    #37  <Method com.ibotta.android.mvp.base.MvpPresenter SocialMvpActivity.access$200(SocialMvpActivity)>
	//    3    7:checkcast       #29  <Class SocialMvpPresenter>
	//    4   10:aload_1         
	//    5   11:invokeinterface #41  <Method void SocialMvpPresenter.onFacebookFeedFail(Exception)>
	//    6   16:return          
	}

	public void onSuccess(com.facebook.share.Sharer.Result result)
	{
		tracker.event("invite", "facebook");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SocialMvpActivity this$0>
	//    2    4:getfield        #47  <Field Tracker SocialMvpActivity.tracker>
	//    3    7:ldc1            #49  <String "invite">
	//    4    9:ldc1            #51  <String "facebook">
	//    5   11:invokeinterface #57  <Method void Tracker.event(String, String)>
		((SocialMvpPresenter)SocialMvpActivity.access$000(SocialMvpActivity.this)).onFacebookFeedSuccess();
	//    6   16:aload_0         
	//    7   17:getfield        #18  <Field SocialMvpActivity this$0>
	//    8   20:invokestatic    #60  <Method com.ibotta.android.mvp.base.MvpPresenter SocialMvpActivity.access$000(SocialMvpActivity)>
	//    9   23:checkcast       #29  <Class SocialMvpPresenter>
	//   10   26:invokeinterface #63  <Method void SocialMvpPresenter.onFacebookFeedSuccess()>
	//   11   31:return          
	}

	public volatile void onSuccess(Object obj)
	{
		onSuccess((com.facebook.share.Sharer.Result)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #66  <Class com.facebook.share.Sharer$Result>
	//    3    5:invokevirtual   #68  <Method void onSuccess(com.facebook.share.Sharer$Result)>
	//    4    8:return          
	}

	final SocialMvpActivity this$0;

	SocialMvpActivity$1()
	{
		this$0 = SocialMvpActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SocialMvpActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
