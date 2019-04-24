// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import java.io.IOException;
import java.io.OutputStream;

public interface FileMaker
{

	public abstract OutputStream getStream()
		throws IOException;
}
