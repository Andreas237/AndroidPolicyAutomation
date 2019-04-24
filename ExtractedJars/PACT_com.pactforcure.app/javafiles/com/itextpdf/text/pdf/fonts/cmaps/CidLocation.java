// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.pdf.PRTokeniser;
import java.io.IOException;

public interface CidLocation
{

	public abstract PRTokeniser getLocation(String s)
		throws IOException;
}
