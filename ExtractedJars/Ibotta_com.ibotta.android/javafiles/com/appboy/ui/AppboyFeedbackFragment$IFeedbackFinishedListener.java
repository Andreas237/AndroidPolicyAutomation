// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;


// Referenced classes of package com.appboy.ui:
//			AppboyFeedbackFragment

public static interface AppboyFeedbackFragment$IFeedbackFinishedListener
{

	public abstract String beforeFeedbackSubmitted(String s);

	public abstract void onFeedbackFinished(AppboyFeedbackFragment.FeedbackResult feedbackresult);
}
