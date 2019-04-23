// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode

public class APSVASTMediaFileNode extends APSVASTXMLNode
{

	public APSVASTMediaFileNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public int bitrate()
	{
		String s = (String)attributes.get("bitrate");
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field HashMap attributes>
	//    2    4:ldc1            #16  <String "bitrate">
	//    3    6:invokevirtual   #22  <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #24  <Class String>
	//    5   12:astore_1        
		if(s != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          22
			return Integer.parseInt(s);
	//    8   17:aload_1         
	//    9   18:invokestatic    #30  <Method int Integer.parseInt(String)>
	//   10   21:ireturn         
		else
			return 0;
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public String delivery()
	{
		return (String)attributes.get("delivery");
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field HashMap attributes>
	//    2    4:ldc1            #33  <String "delivery">
	//    3    6:invokevirtual   #22  <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #24  <Class String>
	//    5   12:areturn         
	}

	public String type()
	{
		return (String)attributes.get("type");
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field HashMap attributes>
	//    2    4:ldc1            #35  <String "type">
	//    3    6:invokevirtual   #22  <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #24  <Class String>
	//    5   12:areturn         
	}

	public String url()
	{
		if(urlsForCurrentNode().size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #40  <Method ArrayList urlsForCurrentNode()>
	//*   2    4:invokevirtual   #45  <Method int ArrayList.size()>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return (String)urlsForCurrentNode().get(0);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #40  <Method ArrayList urlsForCurrentNode()>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   10   20:checkcast       #24  <Class String>
	//   11   23:areturn         
	}
}
