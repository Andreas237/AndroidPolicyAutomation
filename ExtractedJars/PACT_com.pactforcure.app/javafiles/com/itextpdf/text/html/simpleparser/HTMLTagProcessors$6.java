// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$6
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
	{
		htmlworker.updateChain(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #21  <Method void HTMLWorker.updateChain(String)>
	//    3    5:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
	{
		htmlworker.updateChain(s, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #26  <Method void HTMLWorker.updateChain(String, Map)>
	//    4    6:return          
	}

	HTMLTagProcessors$6()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
