// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;

interface AndroidDescriptorHost
	extends com.facebook.stetho.inspector.elements.Descriptor.Host
{

	public abstract View getHighlightingView(Object obj);
}
