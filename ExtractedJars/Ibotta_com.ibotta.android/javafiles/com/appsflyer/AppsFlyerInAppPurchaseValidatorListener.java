// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;


public interface AppsFlyerInAppPurchaseValidatorListener
{

	public abstract void onValidateInApp();

	public abstract void onValidateInAppFailure(String s);
}