// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.apply;

import com.itextpdf.tool.xml.exceptions.NoDataException;
import java.util.List;

public interface MarginMemory
{

	public abstract Float getLastMarginBottom()
		throws NoDataException;

	public abstract List getRootTags();

	public abstract void setLastMarginBottom(Float float1);
}
