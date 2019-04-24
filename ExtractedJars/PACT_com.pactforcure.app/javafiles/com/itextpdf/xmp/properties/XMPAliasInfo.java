// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.properties;

import com.itextpdf.xmp.options.AliasOptions;

public interface XMPAliasInfo
{

	public abstract AliasOptions getAliasForm();

	public abstract String getNamespace();

	public abstract String getPrefix();

	public abstract String getPropName();
}
