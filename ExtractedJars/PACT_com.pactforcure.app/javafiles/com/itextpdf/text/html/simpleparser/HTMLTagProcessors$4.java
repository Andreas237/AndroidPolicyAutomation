// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$4
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(htmlworker.isPendingLI())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingLI()>
	//*   4    8:ifeq            17
			htmlworker.endElement("li");
	//    5   11:aload_1         
	//    6   12:ldc1            #28  <String "li">
	//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
		htmlworker.setSkipText(false);
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
		htmlworker.updateChain(s);
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #38  <Method void HTMLWorker.updateChain(String)>
		htmlworker.processList();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #41  <Method void HTMLWorker.processList()>
	//   16   31:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(htmlworker.isPendingLI())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingLI()>
	//*   4    8:ifeq            17
			htmlworker.endElement("li");
	//    5   11:aload_1         
	//    6   12:ldc1            #28  <String "li">
	//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
		htmlworker.setSkipText(true);
	//    8   17:aload_1         
	//    9   18:iconst_1        
	//   10   19:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
		htmlworker.updateChain(s, map);
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:aload_3         
	//   14   25:invokevirtual   #47  <Method void HTMLWorker.updateChain(String, Map)>
		htmlworker.pushToStack(((com.itextpdf.text.Element) (htmlworker.createList(s))));
	//   15   28:aload_1         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:invokevirtual   #51  <Method com.itextpdf.text.List HTMLWorker.createList(String)>
	//   19   34:invokevirtual   #55  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
	//   20   37:return          
	}

	HTMLTagProcessors$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
