// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$3
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
	{
	//    0    0:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
	{
		htmlworker.newLine();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.newLine()>
	//    2    4:return          
	}

	HTMLTagProcessors$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
