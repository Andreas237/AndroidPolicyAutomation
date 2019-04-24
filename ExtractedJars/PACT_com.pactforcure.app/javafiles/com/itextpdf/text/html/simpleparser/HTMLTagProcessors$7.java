// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocumentException;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$7
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
		if(!map.containsKey("size"))
	//*   2    4:aload_3         
	//*   3    5:ldc1            #31  <String "size">
	//*   4    7:invokeinterface #37  <Method boolean Map.containsKey(Object)>
	//*   5   12:ifne            38
			map.put("size", ((Object) (Integer.toString(7 - Integer.parseInt(s.substring(1))))));
	//    6   15:aload_3         
	//    7   16:ldc1            #31  <String "size">
	//    8   18:bipush          7
	//    9   20:aload_2         
	//   10   21:iconst_1        
	//   11   22:invokevirtual   #43  <Method String String.substring(int)>
	//   12   25:invokestatic    #49  <Method int Integer.parseInt(String)>
	//   13   28:isub            
	//   14   29:invokestatic    #52  <Method String Integer.toString(int)>
	//   15   32:invokeinterface #56  <Method Object Map.put(Object, Object)>
	//   16   37:pop             
		htmlworker.updateChain(s, map);
	//   17   38:aload_1         
	//   18   39:aload_2         
	//   19   40:aload_3         
	//   20   41:invokevirtual   #59  <Method void HTMLWorker.updateChain(String, Map)>
	//   21   44:return          
	}

	HTMLTagProcessors$7()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
