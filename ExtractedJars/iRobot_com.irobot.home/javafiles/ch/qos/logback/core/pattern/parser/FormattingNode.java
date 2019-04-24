// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.FormatInfo;

// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			Node

public class FormattingNode extends Node
{

	FormattingNode(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #10  <Method void Node(int)>
	//    3    5:return          
	}

	FormattingNode(int i, Object obj)
	{
		super(i, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void Node(int, Object)>
	//    4    6:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method boolean Node.equals(Object)>
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
		if(!(obj instanceof FormattingNode))
	//*  10   14:aload_1         
	//*  11   15:instanceof      #2   <Class FormattingNode>
	//*  12   18:ifne            23
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
		obj = ((Object) ((FormattingNode)obj));
	//   15   23:aload_1         
	//   16   24:checkcast       #2   <Class FormattingNode>
	//   17   27:astore_1        
		if(formatInfo != null)
	//*  18   28:aload_0         
	//*  19   29:getfield        #20  <Field FormatInfo formatInfo>
	//*  20   32:ifnull          47
			return formatInfo.equals(((Object) (((FormattingNode) (obj)).formatInfo)));
	//   21   35:aload_0         
	//   22   36:getfield        #20  <Field FormatInfo formatInfo>
	//   23   39:aload_1         
	//   24   40:getfield        #20  <Field FormatInfo formatInfo>
	//   25   43:invokevirtual   #23  <Method boolean FormatInfo.equals(Object)>
	//   26   46:ireturn         
		if(((FormattingNode) (obj)).formatInfo == null)
	//*  27   47:aload_1         
	//*  28   48:getfield        #20  <Field FormatInfo formatInfo>
	//*  29   51:ifnonnull       56
			flag = true;
	//   30   54:iconst_1        
	//   31   55:istore_2        
		return flag;
	//   32   56:iload_2         
	//   33   57:ireturn         
	}

	public FormatInfo getFormatInfo()
	{
		return formatInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FormatInfo formatInfo>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j = super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method int Node.hashCode()>
	//    2    4:istore_2        
		int i;
		if(formatInfo != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #20  <Field FormatInfo formatInfo>
	//*   5    9:ifnull          23
			i = formatInfo.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field FormatInfo formatInfo>
	//    8   16:invokevirtual   #30  <Method int FormatInfo.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		return j * 31 + i;
	//   13   25:iload_2         
	//   14   26:bipush          31
	//   15   28:imul            
	//   16   29:iload_1         
	//   17   30:iadd            
	//   18   31:ireturn         
	}

	public void setFormatInfo(FormatInfo formatinfo)
	{
		formatInfo = formatinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field FormatInfo formatInfo>
	//    3    5:return          
	}

	FormatInfo formatInfo;
}
