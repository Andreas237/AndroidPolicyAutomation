// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;


// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode, APSVASTInLineNode, APSVASTWrapperNode

public class APSVASTAdNode extends APSVASTXMLNode
{

	public APSVASTAdNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public APSVASTInLineNode getInline()
	{
		return (APSVASTInLineNode)getIfExistsNodeWithName("InLine");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "InLine">
	//    2    3:invokevirtual   #17  <Method Object getIfExistsNodeWithName(String)>
	//    3    6:checkcast       #19  <Class APSVASTInLineNode>
	//    4    9:areturn         
	}

	public APSVASTWrapperNode getWrapper()
	{
		return (APSVASTWrapperNode)getIfExistsNodeWithName("Wrapper");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "Wrapper">
	//    2    3:invokevirtual   #17  <Method Object getIfExistsNodeWithName(String)>
	//    3    6:checkcast       #25  <Class APSVASTWrapperNode>
	//    4    9:areturn         
	}
}
