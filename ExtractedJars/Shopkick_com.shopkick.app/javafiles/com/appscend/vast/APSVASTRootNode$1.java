// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.Comparator;
import java.util.HashMap;

// Referenced classes of package com.appscend.vast:
//			APSVASTRootNode, APSVASTXMLNode

class APSVASTRootNode$1
	implements Comparator
{

	public int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((String)((APSVASTXMLNode)obj).attributes.get("sequence")));
	//    0    0:aload_1         
	//    1    1:checkcast       #26  <Class APSVASTXMLNode>
	//    2    4:getfield        #30  <Field HashMap APSVASTXMLNode.attributes>
	//    3    7:ldc1            #32  <String "sequence">
	//    4    9:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//    5   12:checkcast       #40  <Class String>
	//    6   15:astore_1        
		int i;
		if(obj != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          28
			i = Integer.parseInt(((String) (obj)));
	//    9   20:aload_1         
	//   10   21:invokestatic    #46  <Method int Integer.parseInt(String)>
	//   11   24:istore_3        
		else
	//*  12   25:goto            30
			i = 0;
	//   13   28:iconst_0        
	//   14   29:istore_3        
		obj = ((Object) ((String)((APSVASTXMLNode)obj1).attributes.get("sequence")));
	//   15   30:aload_2         
	//   16   31:checkcast       #26  <Class APSVASTXMLNode>
	//   17   34:getfield        #30  <Field HashMap APSVASTXMLNode.attributes>
	//   18   37:ldc1            #32  <String "sequence">
	//   19   39:invokevirtual   #38  <Method Object HashMap.get(Object)>
	//   20   42:checkcast       #40  <Class String>
	//   21   45:astore_1        
		int j;
		if(obj != null)
	//*  22   46:aload_1         
	//*  23   47:ifnull          59
			j = Integer.parseInt(((String) (obj)));
	//   24   50:aload_1         
	//   25   51:invokestatic    #46  <Method int Integer.parseInt(String)>
	//   26   54:istore          4
		else
	//*  27   56:goto            62
			j = 0;
	//   28   59:iconst_0        
	//   29   60:istore          4
		if(i < j)
	//*  30   62:iload_3         
	//*  31   63:iload           4
	//*  32   65:icmpge          70
			return -1;
	//   33   68:iconst_m1       
	//   34   69:ireturn         
		return i <= j ? 0 : 1;
	//   35   70:iload_3         
	//   36   71:iload           4
	//   37   73:icmple          78
	//   38   76:iconst_1        
	//   39   77:ireturn         
	//   40   78:iconst_0        
	//   41   79:ireturn         
	}

	final APSVASTRootNode this$0;

	APSVASTRootNode$1()
	{
		this$0 = APSVASTRootNode.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field APSVASTRootNode this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
