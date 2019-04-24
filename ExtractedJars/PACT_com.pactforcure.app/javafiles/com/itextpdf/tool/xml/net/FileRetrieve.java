// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.net;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.itextpdf.tool.xml.net:
//			ReadingProcessor

public interface FileRetrieve
{

	public abstract void processFromHref(String s, ReadingProcessor readingprocessor)
		throws IOException;

	public abstract void processFromStream(InputStream inputstream, ReadingProcessor readingprocessor)
		throws IOException;
}
