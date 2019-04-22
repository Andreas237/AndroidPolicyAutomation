// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;


// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public abstract class NumericNode extends ValueNode
{

	protected NumericNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ValueNode()>
	//    2    4:return          
	}

	public final JsonNodeType getNodeType()
	{
		return JsonNodeType.NUMBER;
	//    0    0:getstatic       #17  <Field JsonNodeType JsonNodeType.NUMBER>
	//    1    3:areturn         
	}

	public boolean isNaN()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
