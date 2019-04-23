// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;


// Referenced classes of package com.appscend.mraid:
//			MadvertiseView

public static interface MadvertiseView$MadvertiseViewCallbackListener
{

	public abstract void onAdClicked();

	public abstract void onApplicationPause();

	public abstract void onApplicationResume();

	public abstract void onError(Exception exception);

	public abstract void onIllegalHttpStatusCode(int i, String s);

	public abstract void onLoaded(boolean flag, MadvertiseView madvertiseview);
}
