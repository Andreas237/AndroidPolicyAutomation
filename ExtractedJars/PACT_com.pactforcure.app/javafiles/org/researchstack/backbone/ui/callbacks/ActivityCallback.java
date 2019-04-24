// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.ui.callbacks;


public interface ActivityCallback
{

	public abstract void onRequestPermission(String s);

	public abstract void startConsentTask();
}
