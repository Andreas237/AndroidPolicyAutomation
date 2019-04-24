// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.parser;

import java.util.List;

// Referenced classes of package ch.qos.logback.core.pattern.parser:
//			FormattingNode

public class SimpleKeywordNode extends FormattingNode
{

	protected SimpleKeywordNode(int i, Object obj)
	{
		super(i, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void FormattingNode(int, Object)>
	//    4    6:return          
	}

	SimpleKeywordNode(Object obj)
	{
		super(1, obj);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #11  <Method void FormattingNode(int, Object)>
	//    4    6:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method boolean FormattingNode.equals(Object)>
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
		if(!(obj instanceof SimpleKeywordNode))
	//*  10   14:aload_1         
	//*  11   15:instanceof      #2   <Class SimpleKeywordNode>
	//*  12   18:ifne            23
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
		obj = ((Object) ((SimpleKeywordNode)obj));
	//   15   23:aload_1         
	//   16   24:checkcast       #2   <Class SimpleKeywordNode>
	//   17   27:astore_1        
		if(optionList != null)
	//*  18   28:aload_0         
	//*  19   29:getfield        #19  <Field List optionList>
	//*  20   32:ifnull          49
			return optionList.equals(((Object) (((SimpleKeywordNode) (obj)).optionList)));
	//   21   35:aload_0         
	//   22   36:getfield        #19  <Field List optionList>
	//   23   39:aload_1         
	//   24   40:getfield        #19  <Field List optionList>
	//   25   43:invokeinterface #22  <Method boolean List.equals(Object)>
	//   26   48:ireturn         
		if(((SimpleKeywordNode) (obj)).optionList == null)
	//*  27   49:aload_1         
	//*  28   50:getfield        #19  <Field List optionList>
	//*  29   53:ifnonnull       58
			flag = true;
	//   30   56:iconst_1        
	//   31   57:istore_2        
		return flag;
	//   32   58:iload_2         
	//   33   59:ireturn         
	}

	public List getOptions()
	{
		return optionList;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List optionList>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method int FormattingNode.hashCode()>
	//    2    4:ireturn         
	}

	public void setOptions(List list)
	{
		optionList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field List optionList>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #37  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuffer()>
	//    3    7:astore_3        
		StringBuilder stringbuilder;
		Object obj;
		if(optionList == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #19  <Field List optionList>
	//*   6   12:ifnonnull       76
		{
			stringbuilder = new StringBuilder();
	//    7   15:new             #42  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #43  <Method void StringBuilder()>
	//   10   22:astore_1        
			stringbuilder.append("KeyWord(");
	//   11   23:aload_1         
	//   12   24:ldc1            #45  <String "KeyWord(">
	//   13   26:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(value);
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #53  <Field Object value>
	//   18   35:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   19   38:pop             
			stringbuilder.append(",");
	//   20   39:aload_1         
	//   21   40:ldc1            #58  <String ",">
	//   22   42:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			obj = ((Object) (formatInfo));
	//   24   46:aload_0         
	//   25   47:getfield        #62  <Field ch.qos.logback.core.pattern.FormatInfo formatInfo>
	//   26   50:astore_2        
		} else
	//*  27   51:aload_1         
	//*  28   52:aload_2         
	//*  29   53:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//*  30   56:pop             
	//*  31   57:aload_1         
	//*  32   58:ldc1            #64  <String ")">
	//*  33   60:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//*  34   63:pop             
	//*  35   64:aload_3         
	//*  36   65:aload_1         
	//*  37   66:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  38   69:invokevirtual   #69  <Method StringBuffer StringBuffer.append(String)>
	//*  39   72:pop             
	//*  40   73:goto            131
		{
			stringbuilder = new StringBuilder();
	//   41   76:new             #42  <Class StringBuilder>
	//   42   79:dup             
	//   43   80:invokespecial   #43  <Method void StringBuilder()>
	//   44   83:astore_1        
			stringbuilder.append("KeyWord(");
	//   45   84:aload_1         
	//   46   85:ldc1            #45  <String "KeyWord(">
	//   47   87:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   48   90:pop             
			stringbuilder.append(value);
	//   49   91:aload_1         
	//   50   92:aload_0         
	//   51   93:getfield        #53  <Field Object value>
	//   52   96:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   53   99:pop             
			stringbuilder.append(", ");
	//   54  100:aload_1         
	//   55  101:ldc1            #71  <String ", ">
	//   56  103:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   57  106:pop             
			stringbuilder.append(((Object) (formatInfo)));
	//   58  107:aload_1         
	//   59  108:aload_0         
	//   60  109:getfield        #62  <Field ch.qos.logback.core.pattern.FormatInfo formatInfo>
	//   61  112:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   62  115:pop             
			stringbuilder.append(",");
	//   63  116:aload_1         
	//   64  117:ldc1            #58  <String ",">
	//   65  119:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   66  122:pop             
			obj = ((Object) (optionList));
	//   67  123:aload_0         
	//   68  124:getfield        #19  <Field List optionList>
	//   69  127:astore_2        
		}
		stringbuilder.append(obj);
		stringbuilder.append(")");
		stringbuffer.append(stringbuilder.toString());
	//*  70  128:goto            51
		stringbuffer.append(printNext());
	//   71  131:aload_3         
	//   72  132:aload_0         
	//   73  133:invokevirtual   #74  <Method String printNext()>
	//   74  136:invokevirtual   #69  <Method StringBuffer StringBuffer.append(String)>
	//   75  139:pop             
		return stringbuffer.toString();
	//   76  140:aload_3         
	//   77  141:invokevirtual   #75  <Method String StringBuffer.toString()>
	//   78  144:areturn         
	}

	List optionList;
}
