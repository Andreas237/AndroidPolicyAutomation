// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.tool.xml.exceptions.NoTagProcessorException;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			TagProcessor

public interface TagProcessorFactory
{

	public transient abstract void addProcessor(TagProcessor tagprocessor, String as[]);

	public abstract TagProcessor getProcessor(String s, String s1)
		throws NoTagProcessorException;

	public abstract void removeProcessor(String s);
}
