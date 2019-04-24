// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.List;
import java.util.Map;

public interface CssFile
{

	public abstract boolean add(String s, Map map);

	public abstract List get(Tag tag);

	public abstract void isPersistent(boolean flag);

	public abstract boolean isPersistent();
}
