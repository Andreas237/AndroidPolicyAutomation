// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.ArrayList;

// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode

public class APSVASTCompanionAdsNode extends APSVASTXMLNode
{

	public APSVASTCompanionAdsNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	ArrayList companions()
	{
		return childrenNamed("Companion");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "Companion">
	//    2    3:invokevirtual   #17  <Method ArrayList childrenNamed(String)>
	//    3    6:areturn         
	}
}
