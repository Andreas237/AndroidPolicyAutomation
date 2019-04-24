// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//			TreeCodec, Versioned, JsonProcessingException, TreeNode, 
//			JsonFactory, JsonParser, Version, JsonGenerator

public abstract class ObjectCodec extends TreeCodec
	implements Versioned
{

	protected ObjectCodec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void TreeCodec()>
	//    2    4:return          
	}

	public abstract TreeNode createArrayNode();

	public abstract TreeNode createObjectNode();

	public JsonFactory getFactory()
	{
		return getJsonFactory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method JsonFactory getJsonFactory()>
	//    2    4:areturn         
	}

	public JsonFactory getJsonFactory()
	{
		return getFactory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method JsonFactory getFactory()>
	//    2    4:areturn         
	}

	public abstract TreeNode readTree(JsonParser jsonparser)
		throws IOException;

	public abstract Object readValue(JsonParser jsonparser, ResolvedType resolvedtype)
		throws IOException;

	public abstract Object readValue(JsonParser jsonparser, TypeReference typereference)
		throws IOException;

	public abstract Object readValue(JsonParser jsonparser, Class class1)
		throws IOException;

	public abstract Iterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
		throws IOException;

	public abstract Iterator readValues(JsonParser jsonparser, TypeReference typereference)
		throws IOException;

	public abstract Iterator readValues(JsonParser jsonparser, Class class1)
		throws IOException;

	public abstract JsonParser treeAsTokens(TreeNode treenode);

	public abstract Object treeToValue(TreeNode treenode, Class class1)
		throws JsonProcessingException;

	public abstract Version version();

	public abstract void writeTree(JsonGenerator jsongenerator, TreeNode treenode)
		throws IOException;

	public abstract void writeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException;
}
