// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$10
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		htmlworker.updateChain(s);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #26  <Method void HTMLWorker.updateChain(String)>
	//    5    9:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		htmlworker.updateChain(s, map);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #32  <Method void HTMLWorker.updateChain(String, Map)>
	//    6   10:return          
	}

	HTMLTagProcessors$10()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
