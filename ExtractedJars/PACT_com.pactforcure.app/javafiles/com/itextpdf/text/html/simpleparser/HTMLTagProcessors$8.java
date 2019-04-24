// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$8
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		htmlworker.setPendingLI(false);
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #26  <Method void HTMLWorker.setPendingLI(boolean)>
		htmlworker.setSkipText(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #29  <Method void HTMLWorker.setSkipText(boolean)>
		htmlworker.updateChain(s);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #33  <Method void HTMLWorker.updateChain(String)>
		htmlworker.processListItem();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #36  <Method void HTMLWorker.processListItem()>
	//   13   23:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(htmlworker.isPendingLI())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #43  <Method boolean HTMLWorker.isPendingLI()>
	//*   4    8:ifeq            16
			htmlworker.endElement(s);
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #45  <Method void HTMLWorker.endElement(String)>
		htmlworker.setSkipText(false);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #29  <Method void HTMLWorker.setSkipText(boolean)>
		htmlworker.setPendingLI(true);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #26  <Method void HTMLWorker.setPendingLI(boolean)>
		htmlworker.updateChain(s, map);
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:invokevirtual   #48  <Method void HTMLWorker.updateChain(String, Map)>
		htmlworker.pushToStack(((com.itextpdf.text.Element) (htmlworker.createListItem())));
	//   18   32:aload_1         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #52  <Method com.itextpdf.text.ListItem HTMLWorker.createListItem()>
	//   21   37:invokevirtual   #56  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
	//   22   40:return          
	}

	HTMLTagProcessors$8()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
