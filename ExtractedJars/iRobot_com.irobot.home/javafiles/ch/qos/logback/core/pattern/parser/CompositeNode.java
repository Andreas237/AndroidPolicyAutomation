// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;


// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			SimpleKeywordNode, Node

public class CompositeNode extends SimpleKeywordNode
{

	CompositeNode(String s)
	{
		super(2, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:invokespecial   #11  <Method void SimpleKeywordNode(int, Object)>
	//    4    6:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method boolean SimpleKeywordNode.equals(Object)>
	//    3    5:istore_3        
		boolean flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		if(!flag1)
	//*   6    8:iload_3         
	//*   7    9:ifne            14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		if(!(obj instanceof CompositeNode))
	//*  10   14:aload_1         
	//*  11   15:instanceof      #2   <Class CompositeNode>
	//*  12   18:ifne            23
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
		obj = ((Object) ((CompositeNode)obj));
	//   15   23:aload_1         
	//   16   24:checkcast       #2   <Class CompositeNode>
	//   17   27:astore_1        
		if(childNode != null)
	//*  18   28:aload_0         
	//*  19   29:getfield        #18  <Field Node childNode>
	//*  20   32:ifnull          47
			return childNode.equals(((Object) (((CompositeNode) (obj)).childNode)));
	//   21   35:aload_0         
	//   22   36:getfield        #18  <Field Node childNode>
	//   23   39:aload_1         
	//   24   40:getfield        #18  <Field Node childNode>
	//   25   43:invokevirtual   #21  <Method boolean Node.equals(Object)>
	//   26   46:ireturn         
		if(((CompositeNode) (obj)).childNode == null)
	//*  27   47:aload_1         
	//*  28   48:getfield        #18  <Field Node childNode>
	//*  29   51:ifnonnull       56
			flag = true;
	//   30   54:iconst_1        
	//   31   55:istore_2        
		return flag;
	//   32   56:iload_2         
	//   33   57:ireturn         
	}

	public Node getChildNode()
	{
		return childNode;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Node childNode>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method int SimpleKeywordNode.hashCode()>
	//    2    4:ireturn         
	}

	public void setChildNode(Node node)
	{
		childNode = node;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Node childNode>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #33  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuffer()>
	//    3    7:astore_2        
		Object obj;
		if(childNode != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #18  <Field Node childNode>
	//*   6   12:ifnull          60
		{
			obj = ((Object) (new StringBuilder()));
	//    7   15:new             #38  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #39  <Method void StringBuilder()>
	//   10   22:astore_1        
			((StringBuilder) (obj)).append("CompositeNode(");
	//   11   23:aload_1         
	//   12   24:ldc1            #41  <String "CompositeNode(">
	//   13   26:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			((StringBuilder) (obj)).append(((Object) (childNode)));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #18  <Field Node childNode>
	//   18   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   19   38:pop             
			((StringBuilder) (obj)).append(")");
	//   20   39:aload_1         
	//   21   40:ldc1            #50  <String ")">
	//   22   42:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   46:aload_1         
	//   25   47:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   26   50:astore_1        
		} else
	//*  27   51:aload_2         
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #55  <Method StringBuffer StringBuffer.append(String)>
	//*  30   56:pop             
	//*  31   57:goto            66
		{
			obj = "CompositeNode(no child)";
	//   32   60:ldc1            #57  <String "CompositeNode(no child)">
	//   33   62:astore_1        
		}
		stringbuffer.append(((String) (obj)));
	//*  34   63:goto            51
		stringbuffer.append(printNext());
	//   35   66:aload_2         
	//   36   67:aload_0         
	//   37   68:invokevirtual   #60  <Method String printNext()>
	//   38   71:invokevirtual   #55  <Method StringBuffer StringBuffer.append(String)>
	//   39   74:pop             
		return stringbuffer.toString();
	//   40   75:aload_2         
	//   41   76:invokevirtual   #61  <Method String StringBuffer.toString()>
	//   42   79:areturn         
	}

	Node childNode;
}
