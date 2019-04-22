// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			Request

public interface RequestCoordinator
{

	public abstract boolean canNotifyCleared(Request request);

	public abstract boolean canNotifyStatusChanged(Request request);

	public abstract boolean canSetImage(Request request);

	public abstract boolean isAnyResourceSet();

	public abstract void onRequestFailed(Request request);

	public abstract void onRequestSuccess(Request request);
}
