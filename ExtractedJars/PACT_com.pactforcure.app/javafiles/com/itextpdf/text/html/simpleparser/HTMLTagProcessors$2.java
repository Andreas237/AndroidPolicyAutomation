// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$2
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
	{
		htmlworker.processLink();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method void HTMLWorker.processLink()>
		htmlworker.updateChain(s);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #24  <Method void HTMLWorker.updateChain(String)>
	//    5    9:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
	{
		htmlworker.updateChain(s, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #29  <Method void HTMLWorker.updateChain(String, Map)>
		htmlworker.flushContent();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #32  <Method void HTMLWorker.flushContent()>
	//    6   10:return          
	}

	HTMLTagProcessors$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
