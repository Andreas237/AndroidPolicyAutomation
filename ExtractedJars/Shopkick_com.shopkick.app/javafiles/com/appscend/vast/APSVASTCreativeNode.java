// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;


// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode, APSVASTCompanionAdsNode, APSVASTLinearNode, APSVASTNonLinearAdsNode

public class APSVASTCreativeNode extends APSVASTXMLNode
{

	public APSVASTCreativeNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public APSVASTCompanionAdsNode getCompanionAds()
	{
		return (APSVASTCompanionAdsNode)getIfExistsNodeWithName("CompanionAds");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "CompanionAds">
	//    2    3:invokevirtual   #17  <Method Object getIfExistsNodeWithName(String)>
	//    3    6:checkcast       #19  <Class APSVASTCompanionAdsNode>
	//    4    9:areturn         
	}

	public APSVASTLinearNode getLinear()
	{
		return (APSVASTLinearNode)getIfExistsNodeWithName("Linear");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "Linear">
	//    2    3:invokevirtual   #17  <Method Object getIfExistsNodeWithName(String)>
	//    3    6:checkcast       #25  <Class APSVASTLinearNode>
	//    4    9:areturn         
	}

	public APSVASTNonLinearAdsNode getNonlinearAds()
	{
		return (APSVASTNonLinearAdsNode)getIfExistsNodeWithName("NonLinearAds");
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "NonLinearAds">
	//    2    3:invokevirtual   #17  <Method Object getIfExistsNodeWithName(String)>
	//    3    6:checkcast       #31  <Class APSVASTNonLinearAdsNode>
	//    4    9:areturn         
	}
}
