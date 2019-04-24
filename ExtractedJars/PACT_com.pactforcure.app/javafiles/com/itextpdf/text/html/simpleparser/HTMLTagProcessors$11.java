// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker, TableWrapper

static final class HTMLTagProcessors$11
	implements HTMLTagProcessor
{

	public void endElement(HTMLWorker htmlworker, String s)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(htmlworker.isPendingTR())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #26  <Method boolean HTMLWorker.isPendingTR()>
	//*   4    8:ifeq            17
			htmlworker.endElement("tr");
	//    5   11:aload_1         
	//    6   12:ldc1            #28  <String "tr">
	//    7   14:invokevirtual   #31  <Method void HTMLWorker.endElement(String)>
		htmlworker.updateChain(s);
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #34  <Method void HTMLWorker.updateChain(String)>
		htmlworker.processTable();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #37  <Method void HTMLWorker.processTable()>
		htmlworker.popTableState();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #40  <Method void HTMLWorker.popTableState()>
		htmlworker.setSkipText(false);
	//   15   30:aload_1         
	//   16   31:iconst_0        
	//   17   32:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
	//   18   35:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		htmlworker.pushToStack(((com.itextpdf.text.Element) (new TableWrapper(map))));
	//    2    4:aload_1         
	//    3    5:new             #49  <Class TableWrapper>
	//    4    8:dup             
	//    5    9:aload_3         
	//    6   10:invokespecial   #52  <Method void TableWrapper(Map)>
	//    7   13:invokevirtual   #56  <Method void HTMLWorker.pushToStack(com.itextpdf.text.Element)>
		htmlworker.pushTableState();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #59  <Method void HTMLWorker.pushTableState()>
		htmlworker.setPendingTD(false);
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #62  <Method void HTMLWorker.setPendingTD(boolean)>
		htmlworker.setPendingTR(false);
	//   13   25:aload_1         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #65  <Method void HTMLWorker.setPendingTR(boolean)>
		htmlworker.setSkipText(true);
	//   16   30:aload_1         
	//   17   31:iconst_1        
	//   18   32:invokevirtual   #44  <Method void HTMLWorker.setSkipText(boolean)>
		map.remove("align");
	//   19   35:aload_3         
	//   20   36:ldc1            #67  <String "align">
	//   21   38:invokeinterface #73  <Method Object Map.remove(Object)>
	//   22   43:pop             
		map.put("colspan", "1");
	//   23   44:aload_3         
	//   24   45:ldc1            #75  <String "colspan">
	//   25   47:ldc1            #77  <String "1">
	//   26   49:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   27   54:pop             
		map.put("rowspan", "1");
	//   28   55:aload_3         
	//   29   56:ldc1            #83  <String "rowspan">
	//   30   58:ldc1            #77  <String "1">
	//   31   60:invokeinterface #81  <Method Object Map.put(Object, Object)>
	//   32   65:pop             
		htmlworker.updateChain(s, map);
	//   33   66:aload_1         
	//   34   67:aload_2         
	//   35   68:aload_3         
	//   36   69:invokevirtual   #86  <Method void HTMLWorker.updateChain(String, Map)>
	//   37   72:return          
	}

	HTMLTagProcessors$11()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
