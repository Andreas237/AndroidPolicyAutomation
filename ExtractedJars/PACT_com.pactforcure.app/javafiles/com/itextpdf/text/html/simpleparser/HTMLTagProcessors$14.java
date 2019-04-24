// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$14
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
	{
	//    0    0:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException, IOException
	{
		htmlworker.updateChain(s, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #27  <Method void HTMLWorker.updateChain(String, Map)>
		htmlworker.processImage(htmlworker.createImage(map), map);
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #31  <Method com.itextpdf.text.Image HTMLWorker.createImage(Map)>
	//    8   12:aload_3         
	//    9   13:invokevirtual   #35  <Method void HTMLWorker.processImage(com.itextpdf.text.Image, Map)>
		htmlworker.updateChain(s);
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #38  <Method void HTMLWorker.updateChain(String)>
	//   13   21:return          
	}

	HTMLTagProcessors$14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
