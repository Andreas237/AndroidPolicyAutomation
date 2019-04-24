// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//			JsonToken, JsonPointer, JsonParser, ObjectCodec

public interface TreeNode
{

	public abstract JsonToken asToken();

	public abstract TreeNode at(JsonPointer jsonpointer);

	public abstract TreeNode at(String s)
		throws IllegalArgumentException;

	public abstract Iterator fieldNames();

	public abstract TreeNode get(int i);

	public abstract TreeNode get(String s);

	public abstract boolean isArray();

	public abstract boolean isContainerNode();

	public abstract boolean isMissingNode();

	public abstract boolean isObject();

	public abstract boolean isValueNode();

	public abstract JsonParser.NumberType numberType();

	public abstract TreeNode path(int i);

	public abstract TreeNode path(String s);

	public abstract int size();

	public abstract JsonParser traverse();

	public abstract JsonParser traverse(ObjectCodec objectcodec);
}
