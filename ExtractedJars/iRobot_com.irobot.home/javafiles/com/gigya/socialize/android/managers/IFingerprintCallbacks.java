// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import com.gigya.socialize.android.ICallback;

public interface IFingerprintCallbacks
	extends ICallback
{

	public abstract void onCancel();

	public abstract void onError(Exception exception);

	public abstract void onNotSupported(GigyaFingerprintManager.FingerprintError fingerprinterror);

	public abstract void onSuccess();
}
