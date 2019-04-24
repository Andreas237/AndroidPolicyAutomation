// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.event;

import com.gigya.socialize.GSResponse;

public interface GSUIListener
{

	public abstract void onClose(boolean flag, Object obj);

	public abstract void onError(GSResponse gsresponse, Object obj);

	public abstract void onLoad(Object obj);
}
