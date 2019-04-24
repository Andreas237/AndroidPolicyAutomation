// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLWorker

public interface HTMLTagProcessor
{

	public abstract void endElement(HTMLWorker htmlworker, String s)
		throws DocumentException;

	public abstract void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException, IOException;
}
