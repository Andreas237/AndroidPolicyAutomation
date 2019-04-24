// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$12
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(htmlworker.isPendingTD())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingTD()>
	//*   4    8:ifeq            17
			htmlworker.endElement("td");
	//    5   11:aload_1         
	//    6   12:ldc1            #28  <String "td">
	//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
		htmlworker.setPendingTR(false);
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #35  <Method void HTMLWorker.setPendingTR(boolean)>
		htmlworker.updateChain(s);
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #38  <Method void HTMLWorker.updateChain(String)>
		htmlworker.processRow();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #41  <Method void HTMLWorker.processRow()>
		htmlworker.setSkipText(true);
	//   16   31:aload_1         
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
	//   19   36:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(htmlworker.isPendingTR())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #50  <Method boolean HTMLWorker.isPendingTR()>
	//*   4    8:ifeq            16
			htmlworker.endElement(s);
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
		htmlworker.setSkipText(true);
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
		htmlworker.setPendingTR(true);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #35  <Method void HTMLWorker.setPendingTR(boolean)>
		htmlworker.updateChain(s, map);
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:invokevirtual   #53  <Method void HTMLWorker.updateChain(String, Map)>
	//   18   32:return          
	}

	HTMLTagProcessors$12()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
