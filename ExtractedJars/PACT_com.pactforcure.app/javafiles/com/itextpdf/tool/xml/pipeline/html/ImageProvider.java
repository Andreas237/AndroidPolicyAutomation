// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import com.itextpdf.text.Image;

public interface ImageProvider
{

	public abstract String getImageRootPath();

	public abstract void reset();

	public abstract Image retrieve(String s);

	public abstract void store(String s, Image image);
}
