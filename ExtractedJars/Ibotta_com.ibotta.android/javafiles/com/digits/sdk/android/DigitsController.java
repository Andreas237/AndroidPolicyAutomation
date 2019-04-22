// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.os.ResultReceiver;
import android.text.TextWatcher;

// Referenced classes of package com.digits.sdk.android:
//			ErrorCodes, DigitsException

interface DigitsController
{

	public abstract void clearError();

	public abstract void executeRequest(Context context);

	public abstract int getErrorCount();

	public abstract ErrorCodes getErrors();

	public abstract TextWatcher getTextWatcher();

	public abstract void handleError(Context context, DigitsException digitsexception);

	public abstract void onResume();

	public abstract void showTOS(Context context);

	public abstract void startFallback(Context context, ResultReceiver resultreceiver, DigitsException digitsexception);

	public abstract boolean validateInput(CharSequence charsequence);
}
