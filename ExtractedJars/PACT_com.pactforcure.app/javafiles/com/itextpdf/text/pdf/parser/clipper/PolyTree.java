// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			PolyNode

public class PolyTree extends PolyNode
{

	public PolyTree()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PolyNode()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field List allPolys>
	//    7   15:return          
	}

	public void Clear()
	{
		allPolys.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List allPolys>
	//    2    4:invokeinterface #23  <Method void List.clear()>
		childs.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #26  <Field List childs>
	//    5   13:invokeinterface #23  <Method void List.clear()>
	//    6   18:return          
	}

	public List getAllPolys()
	{
		return allPolys;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List allPolys>
	//    2    4:areturn         
	}

	public PolyNode getFirst()
	{
		if(!childs.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field List childs>
	//*   2    4:invokeinterface #36  <Method boolean List.isEmpty()>
	//*   3    9:ifne            26
			return (PolyNode)childs.get(0);
	//    4   12:aload_0         
	//    5   13:getfield        #26  <Field List childs>
	//    6   16:iconst_0        
	//    7   17:invokeinterface #40  <Method Object List.get(int)>
	//    8   22:checkcast       #4   <Class PolyNode>
	//    9   25:areturn         
		else
			return null;
	//   10   26:aconst_null     
	//   11   27:areturn         
	}

	public int getTotalSize()
	{
		int j = allPolys.size();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List allPolys>
	//    2    4:invokeinterface #45  <Method int List.size()>
	//    3    9:istore_2        
		int i = j;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(j > 0)
	//*   6   12:iload_2         
	//*   7   13:ifle            45
		{
			i = j;
	//    8   16:iload_2         
	//    9   17:istore_1        
			if(childs.get(0) != allPolys.get(0))
	//*  10   18:aload_0         
	//*  11   19:getfield        #26  <Field List childs>
	//*  12   22:iconst_0        
	//*  13   23:invokeinterface #40  <Method Object List.get(int)>
	//*  14   28:aload_0         
	//*  15   29:getfield        #16  <Field List allPolys>
	//*  16   32:iconst_0        
	//*  17   33:invokeinterface #40  <Method Object List.get(int)>
	//*  18   38:if_acmpeq       45
				i = j - 1;
	//   19   41:iload_2         
	//   20   42:iconst_1        
	//   21   43:isub            
	//   22   44:istore_1        
		}
		return i;
	//   23   45:iload_1         
	//   24   46:ireturn         
	}

	private final List allPolys = new ArrayList();
}
