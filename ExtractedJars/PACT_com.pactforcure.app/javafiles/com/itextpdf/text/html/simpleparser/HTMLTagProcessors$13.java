// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$13
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		htmlworker.setPendingTD(false);
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #26  <Method void HTMLWorker.setPendingTD(boolean)>
		htmlworker.updateChain("td");
	//    5    9:aload_1         
	//    6   10:ldc1            #28  <String "td">
	//    7   12:invokevirtual   #32  <Method void HTMLWorker.updateChain(String)>
		htmlworker.setSkipText(true);
	//    8   15:aload_1         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
	//   11   20:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(htmlworker.isPendingTD())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #42  <Method boolean HTMLWorker.isPendingTD()>
	//*   4    8:ifeq            16
			htmlworker.endElement(s);
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #44  <Method void HTMLWorker.endElement(String)>
		htmlworker.setSkipText(false);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #35  <Method void HTMLWorker.setSkipText(boolean)>
		htmlworker.setPendingTD(true);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #26  <Method void HTMLWorker.setPendingTD(boolean)>
		htmlworker.updateChain("td", map);
	//   14   26:aload_1         
	//   15   27:ldc1            #28  <String "td">
	//   16   29:aload_3         
	//   17   30:invokevirtual   #47  <Method void HTMLWorker.updateChain(String, Map)>
		htmlworker.pushToStack(((com.itextpdf.text.Element) (htmlworker.createCell(s))));
	//   18   33:aload_1         
	//   19   34:aload_1         
	//   20   35:aload_2         
	//   21   36:invokevirtual   #51  <Method CellWrapper HTMLWorker.createCell(String)>
	//   22   39:invokevirtual   #55  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
	//   23   42:return          
	}

	HTMLTagProcessors$13()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
