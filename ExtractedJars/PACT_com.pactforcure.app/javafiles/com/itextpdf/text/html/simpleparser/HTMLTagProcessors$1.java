// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			HTMLTagProcessor, HTMLTagProcessors, HTMLWorker

static final class HTMLTagProcessors$1
	implements HTMLTagProcessor
{

	private String mapTag(String s)
	{
		String s1;
		if("em".equalsIgnoreCase(s))
	//*   0    0:ldc1            #17  <String "em">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #23  <Method boolean String.equalsIgnoreCase(String)>
	//*   3    6:ifeq            14
		{
			s1 = "i";
	//    4    9:ldc1            #25  <String "i">
	//    5   11:astore_2        
		} else
	//*   6   12:aload_2         
	//*   7   13:areturn         
		{
			if("strong".equalsIgnoreCase(s))
	//*   8   14:ldc1            #27  <String "strong">
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #23  <Method boolean String.equalsIgnoreCase(String)>
	//*  11   20:ifeq            26
				return "b";
	//   12   23:ldc1            #29  <String "b">
	//   13   25:areturn         
			s1 = s;
	//   14   26:aload_1         
	//   15   27:astore_2        
			if("strike".equalsIgnoreCase(s))
	//*  16   28:ldc1            #31  <String "strike">
	//*  17   30:aload_1         
	//*  18   31:invokevirtual   #23  <Method boolean String.equalsIgnoreCase(String)>
	//*  19   34:ifeq            12
				return "s";
	//   20   37:ldc1            #33  <String "s">
	//   21   39:areturn         
		}
		return s1;
	}

	public void endElement(HTMLWorker htmlworker, String s)
	{
		htmlworker.updateChain(mapTag(s));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokespecial   #37  <Method String mapTag(String)>
	//    4    6:invokevirtual   #43  <Method void HTMLWorker.updateChain(String)>
	//    5    9:return          
	}

	public void startElement(HTMLWorker htmlworker, String s, Map map)
	{
		s = mapTag(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #37  <Method String mapTag(String)>
	//    3    5:astore_2        
		map.put(((Object) (s)), ((Object) (null)));
	//    4    6:aload_3         
	//    5    7:aload_2         
	//    6    8:aconst_null     
	//    7    9:invokeinterface #51  <Method Object Map.put(Object, Object)>
	//    8   14:pop             
		htmlworker.updateChain(s, map);
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #54  <Method void HTMLWorker.updateChain(String, Map)>
	//   13   21:return          
	}

	HTMLTagProcessors$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
