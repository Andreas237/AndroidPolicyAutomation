// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.os.ResultReceiver;

interface FailureController
{

	public abstract void sendFailure(ResultReceiver resultreceiver, Exception exception);

	public abstract void tryAnotherNumber(Activity activity, ResultReceiver resultreceiver);
}
