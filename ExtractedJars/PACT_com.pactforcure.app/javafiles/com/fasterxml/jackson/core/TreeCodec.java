// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//			JsonProcessingException, TreeNode, JsonParser, JsonGenerator

public abstract class TreeCodec
{

	public TreeCodec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract TreeNode createArrayNode();

	public abstract TreeNode createObjectNode();

	public abstract TreeNode readTree(JsonParser jsonparser)
		throws IOException, JsonProcessingException;

	public abstract JsonParser treeAsTokens(TreeNode treenode);

	public abstract void writeTree(JsonGenerator jsongenerator, TreeNode treenode)
		throws IOException, JsonProcessingException;
}
