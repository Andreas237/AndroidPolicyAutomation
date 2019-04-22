// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public class BooleanNode extends ValueNode
{

	protected BooleanNode(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void ValueNode()>
		_value = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field boolean _value>
	//    5    9:return          
	}

	public static BooleanNode getFalse()
	{
		return FALSE;
	//    0    0:getstatic       #19  <Field BooleanNode FALSE>
	//    1    3:areturn         
	}

	public static BooleanNode getTrue()
	{
		return TRUE;
	//    0    0:getstatic       #17  <Field BooleanNode TRUE>
	//    1    3:areturn         
	}

	public boolean asBoolean(boolean flag)
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean _value>
	//    2    4:ireturn         
	}

	public String asText()
	{
		if(_value)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean _value>
	//*   2    4:ifeq            10
			return "true";
	//    3    7:ldc1            #33  <String "true">
	//    4    9:areturn         
		else
			return "false";
	//    5   10:ldc1            #35  <String "false">
	//    6   12:areturn         
	}

	public JsonToken asToken()
	{
		if(_value)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean _value>
	//*   2    4:ifeq            11
			return JsonToken.VALUE_TRUE;
	//    3    7:getstatic       #43  <Field JsonToken JsonToken.VALUE_TRUE>
	//    4   10:areturn         
		else
			return JsonToken.VALUE_FALSE;
	//    5   11:getstatic       #46  <Field JsonToken JsonToken.VALUE_FALSE>
	//    6   14:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(!(obj instanceof BooleanNode))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class BooleanNode>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		return _value == ((BooleanNode)obj)._value;
	//   14   22:aload_0         
	//   15   23:getfield        #24  <Field boolean _value>
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class BooleanNode>
	//   18   30:getfield        #24  <Field boolean _value>
	//   19   33:icmpne          38
	//   20   36:iconst_1        
	//   21   37:ireturn         
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.BOOLEAN;
	//    0    0:getstatic       #56  <Field JsonNodeType JsonNodeType.BOOLEAN>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return !_value ? 1 : 3;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean _value>
	//    2    4:ifeq            9
	//    3    7:iconst_3        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeBoolean(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field boolean _value>
	//    3    5:invokevirtual   #67  <Method void JsonGenerator.writeBoolean(boolean)>
	//    4    8:return          
	}

	public static final BooleanNode FALSE = new BooleanNode(false);
	public static final BooleanNode TRUE = new BooleanNode(true);
	private final boolean _value;

	static 
	{
	//    0    0:new             #2   <Class BooleanNode>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #15  <Method void BooleanNode(boolean)>
	//    4    8:putstatic       #17  <Field BooleanNode TRUE>
	//    5   11:new             #2   <Class BooleanNode>
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:invokespecial   #15  <Method void BooleanNode(boolean)>
	//    9   19:putstatic       #19  <Field BooleanNode FALSE>
	//*  10   22:return          
	}
}
