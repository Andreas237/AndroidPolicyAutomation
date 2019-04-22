// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;


public interface DocumentProviderListener
{

	public abstract void onAttributeModified(Object obj, String s, String s1);

	public abstract void onAttributeRemoved(Object obj, String s);

	public abstract void onInspectRequested(Object obj);

	public abstract void onPossiblyChanged();
}
