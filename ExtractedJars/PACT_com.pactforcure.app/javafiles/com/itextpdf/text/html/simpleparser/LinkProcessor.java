// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.Paragraph;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			ChainedProperties

public interface LinkProcessor
{

	public abstract boolean process(Paragraph paragraph, ChainedProperties chainedproperties);
}
