// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.css;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.itextpdf.tool.xml.net.FileRetrieve;

public interface CSSResolver
{

	public abstract void addCss(CssFile cssfile);

	public abstract void addCss(String s, String s1, boolean flag)
		throws CssResolverException;

	public abstract void addCss(String s, boolean flag)
		throws CssResolverException;

	public abstract void addCssFile(String s, boolean flag)
		throws CssResolverException;

	public abstract CSSResolver clear()
		throws CssResolverException;

	public abstract void resolveStyles(Tag tag);

	public abstract void setFileRetrieve(FileRetrieve fileretrieve);
}
