// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ArrayNode, ValueNode, ObjectNode

public interface JsonNodeCreator
{

	public abstract ArrayNode arrayNode();

	public abstract ValueNode binaryNode(byte abyte0[]);

	public abstract ValueNode binaryNode(byte abyte0[], int i, int j);

	public abstract ValueNode booleanNode(boolean flag);

	public abstract ValueNode nullNode();

	public abstract ValueNode numberNode(byte byte0);

	public abstract ValueNode numberNode(double d);

	public abstract ValueNode numberNode(float f);

	public abstract ValueNode numberNode(int i);

	public abstract ValueNode numberNode(long l);

	public abstract ValueNode numberNode(Byte byte1);

	public abstract ValueNode numberNode(Double double1);

	public abstract ValueNode numberNode(Float float1);

	public abstract ValueNode numberNode(Integer integer);

	public abstract ValueNode numberNode(Long long1);

	public abstract ValueNode numberNode(Short short1);

	public abstract ValueNode numberNode(BigDecimal bigdecimal);

	public abstract ValueNode numberNode(BigInteger biginteger);

	public abstract ValueNode numberNode(short word0);

	public abstract ObjectNode objectNode();

	public abstract ValueNode pojoNode(Object obj);

	public abstract ValueNode rawValueNode(RawValue rawvalue);

	public abstract ValueNode textNode(String s);
}
