// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;

public interface CssInheritanceRules
{

	public abstract boolean inheritCssSelector(Tag tag, String s);

	public abstract boolean inheritCssTag(String s);
}
