// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.properties;

import com.itextpdf.xmp.options.PropertyOptions;

public interface XMPProperty
{

	public abstract String getLanguage();

	public abstract PropertyOptions getOptions();

	public abstract String getValue();
}
