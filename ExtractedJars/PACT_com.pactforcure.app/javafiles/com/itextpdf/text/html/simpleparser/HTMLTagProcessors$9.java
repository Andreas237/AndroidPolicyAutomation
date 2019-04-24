// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$9
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
		htmlworker.setInsidePRE(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #30  <Method void HTMLWorker.setInsidePRE(boolean)>
	//    8   14:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
		throws DocumentException
	{
		htmlworker.carriageReturn();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void HTMLWorker.carriageReturn()>
		if(!map.containsKey("face"))
	//*   2    4:aload_3         
	//*   3    5:ldc1            #35  <String "face">
	//*   4    7:invokeinterface #41  <Method boolean Map.containsKey(Object)>
	//*   5   12:ifne            26
			map.put("face", "Courier");
	//    6   15:aload_3         
	//    7   16:ldc1            #35  <String "face">
	//    8   18:ldc1            #43  <String "Courier">
	//    9   20:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   10   25:pop             
		htmlworker.updateChain(s, map);
	//   11   26:aload_1         
	//   12   27:aload_2         
	//   13   28:aload_3         
	//   14   29:invokevirtual   #50  <Method void HTMLWorker.updateChain(String, Map)>
		htmlworker.setInsidePRE(true);
	//   15   32:aload_1         
	//   16   33:iconst_1        
	//   17   34:invokevirtual   #30  <Method void HTMLWorker.setInsidePRE(boolean)>
	//   18   37:return          
	}

	HTMLTagProcessors$9()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
