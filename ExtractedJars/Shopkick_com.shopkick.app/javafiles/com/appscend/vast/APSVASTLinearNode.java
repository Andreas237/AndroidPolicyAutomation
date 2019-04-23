// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.*;

// Referenced classes of package com.appscend.vast:
//			APSVASTCreativeTypeNode, APSVASTXMLNode, APSVASTIconNode

public class APSVASTLinearNode extends APSVASTCreativeTypeNode
{

	public APSVASTLinearNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTCreativeTypeNode()>
	//    2    4:return          
	}

	public String clickThrough()
	{
		if(firstChildNamed("VideoClicks") != null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #13  <String "VideoClicks">
	//*   2    3:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   3    6:ifnull          46
		{
			ArrayList arraylist = firstChildNamed("VideoClicks").urlsForChildrenNamed("ClickThrough");
	//    4    9:aload_0         
	//    5   10:ldc1            #13  <String "VideoClicks">
	//    6   12:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   15:ldc1            #19  <String "ClickThrough">
	//    8   17:invokevirtual   #25  <Method ArrayList APSVASTXMLNode.urlsForChildrenNamed(String)>
	//    9   20:astore_1        
			if(arraylist != null && arraylist.size() > 0)
	//*  10   21:aload_1         
	//*  11   22:ifnull          46
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #31  <Method int ArrayList.size()>
	//*  14   29:ifle            46
				return (String)arraylist.get(arraylist.size() - 1);
	//   15   32:aload_1         
	//   16   33:aload_1         
	//   17   34:invokevirtual   #31  <Method int ArrayList.size()>
	//   18   37:iconst_1        
	//   19   38:isub            
	//   20   39:invokevirtual   #35  <Method Object ArrayList.get(int)>
	//   21   42:checkcast       #37  <Class String>
	//   22   45:areturn         
		}
		return null;
	//   23   46:aconst_null     
	//   24   47:areturn         
	}

	public ArrayList clickTrackingURLs()
	{
		if(firstChildNamed("VideoClicks") != null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #13  <String "VideoClicks">
	//*   2    3:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   3    6:ifnull          21
			return firstChildNamed("VideoClicks").urlsForChildrenNamed("ClickTracking");
	//    4    9:aload_0         
	//    5   10:ldc1            #13  <String "VideoClicks">
	//    6   12:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   15:ldc1            #41  <String "ClickTracking">
	//    8   17:invokevirtual   #25  <Method ArrayList APSVASTXMLNode.urlsForChildrenNamed(String)>
	//    9   20:areturn         
		else
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
	}

	public HashMap icons()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #47  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void HashMap()>
	//    3    7:astore_3        
		if(firstChildNamed("Icons") != null)
	//*   4    8:aload_0         
	//*   5    9:ldc1            #50  <String "Icons">
	//*   6   11:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   7   14:ifnull          113
		{
			ArrayList arraylist;
			APSVASTIconNode apsvasticonnode;
			for(Iterator iterator = firstChildNamed("Icons").childrenNamed("Icon").iterator(); iterator.hasNext(); hashmap.put(apsvasticonnode.attributes.get("program"), ((Object) (arraylist))))
	//*   8   17:aload_0         
	//*   9   18:ldc1            #50  <String "Icons">
	//*  10   20:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//*  11   23:ldc1            #52  <String "Icon">
	//*  12   25:invokevirtual   #55  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//*  13   28:invokevirtual   #59  <Method Iterator ArrayList.iterator()>
	//*  14   31:astore          4
	//*  15   33:aload           4
	//*  16   35:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*  17   40:ifeq            113
			{
				apsvasticonnode = (APSVASTIconNode)iterator.next();
	//   18   43:aload           4
	//   19   45:invokeinterface #69  <Method Object Iterator.next()>
	//   20   50:checkcast       #71  <Class APSVASTIconNode>
	//   21   53:astore          5
				ArrayList arraylist1 = (ArrayList)hashmap.get(apsvasticonnode.attributes.get("program"));
	//   22   55:aload_3         
	//   23   56:aload           5
	//   24   58:getfield        #75  <Field HashMap APSVASTIconNode.attributes>
	//   25   61:ldc1            #77  <String "program">
	//   26   63:invokevirtual   #80  <Method Object HashMap.get(Object)>
	//   27   66:invokevirtual   #80  <Method Object HashMap.get(Object)>
	//   28   69:checkcast       #27  <Class ArrayList>
	//   29   72:astore_2        
				arraylist = arraylist1;
	//   30   73:aload_2         
	//   31   74:astore_1        
				if(arraylist1 == null)
	//*  32   75:aload_2         
	//*  33   76:ifnonnull       87
					arraylist = new ArrayList();
	//   34   79:new             #27  <Class ArrayList>
	//   35   82:dup             
	//   36   83:invokespecial   #81  <Method void ArrayList()>
	//   37   86:astore_1        
				arraylist.add(((Object) (apsvasticonnode)));
	//   38   87:aload_1         
	//   39   88:aload           5
	//   40   90:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   41   93:pop             
			}

	//   42   94:aload_3         
	//   43   95:aload           5
	//   44   97:getfield        #75  <Field HashMap APSVASTIconNode.attributes>
	//   45  100:ldc1            #77  <String "program">
	//   46  102:invokevirtual   #80  <Method Object HashMap.get(Object)>
	//   47  105:aload_1         
	//   48  106:invokevirtual   #89  <Method Object HashMap.put(Object, Object)>
	//   49  109:pop             
		}
	//*  50  110:goto            33
		return hashmap;
	//   51  113:aload_3         
	//   52  114:areturn         
	}

	public ArrayList mediaFiles()
	{
		if(firstChildNamed("MediaFiles") != null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #93  <String "MediaFiles">
	//*   2    3:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   3    6:ifnull          21
			return firstChildNamed("MediaFiles").childrenNamed("MediaFile");
	//    4    9:aload_0         
	//    5   10:ldc1            #93  <String "MediaFiles">
	//    6   12:invokevirtual   #17  <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   15:ldc1            #95  <String "MediaFile">
	//    8   17:invokevirtual   #55  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//    9   20:areturn         
		else
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
	}

	public void mergeWith(APSVASTCreativeTypeNode apsvastcreativetypenode)
	{
		super.mergeWith(apsvastcreativetypenode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void APSVASTCreativeTypeNode.mergeWith(APSVASTCreativeTypeNode)>
		APSVASTXMLNode apsvastxmlnode = (APSVASTXMLNode)getOrCreateNodeWithName("VideoClicks");
	//    3    5:aload_0         
	//    4    6:ldc1            #13  <String "VideoClicks">
	//    5    8:invokevirtual   #104 <Method Object getOrCreateNodeWithName(String)>
	//    6   11:checkcast       #21  <Class APSVASTXMLNode>
	//    7   14:astore_2        
		if(apsvastcreativetypenode.firstChildNamed("VideoClicks") != null)
	//*   8   15:aload_1         
	//*   9   16:ldc1            #13  <String "VideoClicks">
	//*  10   18:invokevirtual   #105 <Method APSVASTXMLNode APSVASTCreativeTypeNode.firstChildNamed(String)>
	//*  11   21:ifnull          41
			apsvastxmlnode.addChildrenWithName(apsvastcreativetypenode.firstChildNamed("VideoClicks").childrenNamed("ClickTracking"), "ClickTracking");
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:ldc1            #13  <String "VideoClicks">
	//   15   28:invokevirtual   #105 <Method APSVASTXMLNode APSVASTCreativeTypeNode.firstChildNamed(String)>
	//   16   31:ldc1            #41  <String "ClickTracking">
	//   17   33:invokevirtual   #55  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//   18   36:ldc1            #41  <String "ClickTracking">
	//   19   38:invokevirtual   #109 <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
		apsvastxmlnode = (APSVASTXMLNode)getOrCreateNodeWithName("Icons");
	//   20   41:aload_0         
	//   21   42:ldc1            #50  <String "Icons">
	//   22   44:invokevirtual   #104 <Method Object getOrCreateNodeWithName(String)>
	//   23   47:checkcast       #21  <Class APSVASTXMLNode>
	//   24   50:astore_2        
		if(apsvastcreativetypenode.firstChildNamed("Icons") != null)
	//*  25   51:aload_1         
	//*  26   52:ldc1            #50  <String "Icons">
	//*  27   54:invokevirtual   #105 <Method APSVASTXMLNode APSVASTCreativeTypeNode.firstChildNamed(String)>
	//*  28   57:ifnull          77
			apsvastxmlnode.addChildrenWithName(apsvastcreativetypenode.firstChildNamed("Icons").childrenNamed("Icon"), "Icon");
	//   29   60:aload_2         
	//   30   61:aload_1         
	//   31   62:ldc1            #50  <String "Icons">
	//   32   64:invokevirtual   #105 <Method APSVASTXMLNode APSVASTCreativeTypeNode.firstChildNamed(String)>
	//   33   67:ldc1            #52  <String "Icon">
	//   34   69:invokevirtual   #55  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//   35   72:ldc1            #52  <String "Icon">
	//   36   74:invokevirtual   #109 <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
	//   37   77:return          
	}
}
