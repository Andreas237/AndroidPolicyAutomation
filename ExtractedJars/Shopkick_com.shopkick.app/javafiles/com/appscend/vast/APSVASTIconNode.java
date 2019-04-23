// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.ArrayList;

// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode

public class APSVASTIconNode extends APSVASTXMLNode
{

	public APSVASTIconNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public String clickThrough()
	{
		if(firstChildNamed("IconClicks") != null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #13  <String "IconClicks">
	//*   2    3:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   3    6:ifnull          46
		{
			ArrayList arraylist = firstChildNamed("IconClicks").urlsForChildrenNamed("IconClickThrough");
	//    4    9:aload_0         
	//    5   10:ldc1            #13  <String "IconClicks">
	//    6   12:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   15:ldc1            #19  <String "IconClickThrough">
	//    8   17:invokevirtual   #23  <Method ArrayList APSVASTXMLNode.urlsForChildrenNamed(String)>
	//    9   20:astore_1        
			if(arraylist != null && arraylist.size() > 0)
	//*  10   21:aload_1         
	//*  11   22:ifnull          46
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #29  <Method int ArrayList.size()>
	//*  14   29:ifle            46
				return (String)arraylist.get(arraylist.size() - 1);
	//   15   32:aload_1         
	//   16   33:aload_1         
	//   17   34:invokevirtual   #29  <Method int ArrayList.size()>
	//   18   37:iconst_1        
	//   19   38:isub            
	//   20   39:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   21   42:checkcast       #35  <Class String>
	//   22   45:areturn         
		}
		return null;
	//   23   46:aconst_null     
	//   24   47:areturn         
	}

	public ArrayList clickTrackingURLs()
	{
		if(firstChildNamed("IconClicks") != null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #13  <String "IconClicks">
	//*   2    3:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   3    6:ifnull          21
			return firstChildNamed("IconClicks").urlsForChildrenNamed("IconClickTracking");
	//    4    9:aload_0         
	//    5   10:ldc1            #13  <String "IconClicks">
	//    6   12:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   15:ldc1            #39  <String "IconClickTracking">
	//    8   17:invokevirtual   #23  <Method ArrayList APSVASTXMLNode.urlsForChildrenNamed(String)>
	//    9   20:areturn         
		else
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
	}

	public String staticResource()
	{
		ArrayList arraylist = urlsForChildrenNamed("StaticResource");
	//    0    0:aload_0         
	//    1    1:ldc1            #44  <String "StaticResource">
	//    2    3:invokevirtual   #45  <Method ArrayList urlsForChildrenNamed(String)>
	//    3    6:astore_1        
		if(arraylist != null && arraylist.size() > 0)
	//*   4    7:aload_1         
	//*   5    8:ifnull          27
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #29  <Method int ArrayList.size()>
	//*   8   15:ifle            27
			return (String)arraylist.get(0);
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   12   23:checkcast       #35  <Class String>
	//   13   26:areturn         
		else
			return null;
	//   14   27:aconst_null     
	//   15   28:areturn         
	}

	public ArrayList viewTrackingURLs()
	{
		return urlsForChildrenNamed("IconViewTracking");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "IconViewTracking">
	//    2    3:invokevirtual   #45  <Method ArrayList urlsForChildrenNamed(String)>
	//    3    6:areturn         
	}
}
