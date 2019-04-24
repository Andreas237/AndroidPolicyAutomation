// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Path

public class PolyNode
{
	static final class NodeType extends Enum
	{

		public static NodeType valueOf(String s)
		{
			return (NodeType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/PolyNode$NodeType, s);
		//    0    0:ldc1            #2   <Class PolyNode$NodeType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PolyNode$NodeType>
		//    4    9:areturn         
		}

		public static NodeType[] values()
		{
			return (NodeType[])((NodeType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field PolyNode$NodeType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.PolyNode$NodeType_3B_.clone()>
		//    2    6:checkcast       #42  <Class PolyNode$NodeType[]>
		//    3    9:areturn         
		}

		private static final NodeType $VALUES[];
		public static final NodeType ANY;
		public static final NodeType CLOSED;
		public static final NodeType OPEN;

		static 
		{
			ANY = new NodeType("ANY", 0);
		//    0    0:new             #2   <Class PolyNode$NodeType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "ANY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void PolyNode$NodeType(String, int)>
		//    5   10:putstatic       #23  <Field PolyNode$NodeType ANY>
			OPEN = new NodeType("OPEN", 1);
		//    6   13:new             #2   <Class PolyNode$NodeType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "OPEN">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void PolyNode$NodeType(String, int)>
		//   11   23:putstatic       #26  <Field PolyNode$NodeType OPEN>
			CLOSED = new NodeType("CLOSED", 2);
		//   12   26:new             #2   <Class PolyNode$NodeType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "CLOSED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void PolyNode$NodeType(String, int)>
		//   17   36:putstatic       #29  <Field PolyNode$NodeType CLOSED>
			$VALUES = (new NodeType[] {
				ANY, OPEN, CLOSED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       NodeType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field PolyNode$NodeType ANY>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field PolyNode$NodeType OPEN>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field PolyNode$NodeType CLOSED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field PolyNode$NodeType[] $VALUES>
		//*  33   64:return          
		}

		private NodeType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public PolyNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void Path()>
	//    6   12:putfield        #31  <Field Path polygon>
	//    7   15:aload_0         
	//    8   16:new             #33  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void ArrayList()>
	//   11   23:putfield        #36  <Field List childs>
	//   12   26:return          
	}

	private PolyNode getNextSiblingUp()
	{
		if(parent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field PolyNode parent>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(index == parent.childs.size() - 1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #43  <Field int index>
	//*   7   13:aload_0         
	//*   8   14:getfield        #41  <Field PolyNode parent>
	//*   9   17:getfield        #36  <Field List childs>
	//*  10   20:invokeinterface #49  <Method int List.size()>
	//*  11   25:iconst_1        
	//*  12   26:isub            
	//*  13   27:icmpne          38
			return parent.getNextSiblingUp();
	//   14   30:aload_0         
	//   15   31:getfield        #41  <Field PolyNode parent>
	//   16   34:invokespecial   #51  <Method PolyNode getNextSiblingUp()>
	//   17   37:areturn         
		else
			return (PolyNode)parent.childs.get(index + 1);
	//   18   38:aload_0         
	//   19   39:getfield        #41  <Field PolyNode parent>
	//   20   42:getfield        #36  <Field List childs>
	//   21   45:aload_0         
	//   22   46:getfield        #43  <Field int index>
	//   23   49:iconst_1        
	//   24   50:iadd            
	//   25   51:invokeinterface #55  <Method Object List.get(int)>
	//   26   56:checkcast       #2   <Class PolyNode>
	//   27   59:areturn         
	}

	private boolean isHoleNode()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		PolyNode polynode = parent;
	//    2    2:aload_0         
	//    3    3:getfield        #41  <Field PolyNode parent>
	//    4    6:astore_2        
		while(polynode != null) 
	//*   5    7:aload_2         
	//*   6    8:ifnull          30
		{
			if(!flag)
	//*   7   11:iload_1         
	//*   8   12:ifne            25
				flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_1        
			else
	//*  11   17:aload_2         
	//*  12   18:getfield        #41  <Field PolyNode parent>
	//*  13   21:astore_2        
	//*  14   22:goto            7
				flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_1        
			polynode = polynode.parent;
		}
	//*  17   27:goto            17
		return flag;
	//   18   30:iload_1         
	//   19   31:ireturn         
	}

	public void addChild(PolyNode polynode)
	{
		int i = childs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List childs>
	//    2    4:invokeinterface #49  <Method int List.size()>
	//    3    9:istore_2        
		childs.add(((Object) (polynode)));
	//    4   10:aload_0         
	//    5   11:getfield        #36  <Field List childs>
	//    6   14:aload_1         
	//    7   15:invokeinterface #63  <Method boolean List.add(Object)>
	//    8   20:pop             
		polynode.parent = this;
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:putfield        #41  <Field PolyNode parent>
		polynode.index = i;
	//   12   26:aload_1         
	//   13   27:iload_2         
	//   14   28:putfield        #43  <Field int index>
	//   15   31:return          
	}

	public int getChildCount()
	{
		return childs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List childs>
	//    2    4:invokeinterface #49  <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getChilds()
	{
		return Collections.unmodifiableList(childs);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List childs>
	//    2    4:invokestatic    #72  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public List getContour()
	{
		return ((List) (polygon));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Path polygon>
	//    2    4:areturn         
	}

	public Clipper.EndType getEndType()
	{
		return endType;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Clipper$EndType endType>
	//    2    4:areturn         
	}

	public Clipper.JoinType getJoinType()
	{
		return joinType;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Clipper$JoinType joinType>
	//    2    4:areturn         
	}

	public PolyNode getNext()
	{
		if(!childs.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field List childs>
	//*   2    4:invokeinterface #88  <Method boolean List.isEmpty()>
	//*   3    9:ifne            26
			return (PolyNode)childs.get(0);
	//    4   12:aload_0         
	//    5   13:getfield        #36  <Field List childs>
	//    6   16:iconst_0        
	//    7   17:invokeinterface #55  <Method Object List.get(int)>
	//    8   22:checkcast       #2   <Class PolyNode>
	//    9   25:areturn         
		else
			return getNextSiblingUp();
	//   10   26:aload_0         
	//   11   27:invokespecial   #51  <Method PolyNode getNextSiblingUp()>
	//   12   30:areturn         
	}

	public PolyNode getParent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field PolyNode parent>
	//    2    4:areturn         
	}

	public Path getPolygon()
	{
		return polygon;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Path polygon>
	//    2    4:areturn         
	}

	public boolean isHole()
	{
		return isHoleNode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method boolean isHoleNode()>
	//    2    4:ireturn         
	}

	public boolean isOpen()
	{
		return isOpen;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean isOpen>
	//    2    4:ireturn         
	}

	public void setEndType(Clipper.EndType endtype)
	{
		endType = endtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field Clipper$EndType endType>
	//    3    5:return          
	}

	public void setJoinType(Clipper.JoinType jointype)
	{
		joinType = jointype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Clipper$JoinType joinType>
	//    3    5:return          
	}

	public void setOpen(boolean flag)
	{
		isOpen = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field boolean isOpen>
	//    3    5:return          
	}

	public void setParent(PolyNode polynode)
	{
		parent = polynode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field PolyNode parent>
	//    3    5:return          
	}

	protected final List childs = new ArrayList();
	private Clipper.EndType endType;
	private int index;
	private boolean isOpen;
	private Clipper.JoinType joinType;
	private PolyNode parent;
	private final Path polygon = new Path();
}
