// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.ArrayList;

// Referenced classes of package com.appscend.vast:
//			APSVASTInLineNode, APSVASTCreativeNode, APSVASTLinearNode, APSVASTNonLinearAdsNode, 
//			APSVASTNonLinearNode, APSVASTCompanionAdsNode, APSVASTCompanionNode

public class APSVASTWrapperNode extends APSVASTInLineNode
{

	public APSVASTWrapperNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTInLineNode()>
	//    2    4:return          
	}

	public ArrayList creatives()
	{
		ArrayList arraylist = super.creatives();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method ArrayList APSVASTInLineNode.creatives()>
	//    2    4:astore_1        
		APSVASTXMLNode apsvastxmlnode1 = firstChildNamed("VideoClicks");
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "VideoClicks">
	//    5    8:invokevirtual   #19  <Method APSVASTXMLNode firstChildNamed(String)>
	//    6   11:astore_3        
		APSVASTXMLNode apsvastxmlnode = firstChildNamed("TrackingEvents");
	//    7   12:aload_0         
	//    8   13:ldc1            #21  <String "TrackingEvents">
	//    9   15:invokevirtual   #19  <Method APSVASTXMLNode firstChildNamed(String)>
	//   10   18:astore_2        
		if(apsvastxmlnode1 != null || apsvastxmlnode != null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       27
	//*  13   23:aload_2         
	//*  14   24:ifnull          195
		{
			APSVASTCreativeNode apsvastcreativenode1 = new APSVASTCreativeNode();
	//   15   27:new             #23  <Class APSVASTCreativeNode>
	//   16   30:dup             
	//   17   31:invokespecial   #24  <Method void APSVASTCreativeNode()>
	//   18   34:astore          4
			APSVASTLinearNode apsvastlinearnode = new APSVASTLinearNode();
	//   19   36:new             #26  <Class APSVASTLinearNode>
	//   20   39:dup             
	//   21   40:invokespecial   #27  <Method void APSVASTLinearNode()>
	//   22   43:astore          5
			apsvastlinearnode.addChildWithName(((Object) (apsvastxmlnode)), "TrackingEvents");
	//   23   45:aload           5
	//   24   47:aload_2         
	//   25   48:ldc1            #21  <String "TrackingEvents">
	//   26   50:invokevirtual   #31  <Method void APSVASTLinearNode.addChildWithName(Object, String)>
			apsvastlinearnode.addChildWithName(((Object) (apsvastxmlnode1)), "VideoClicks");
	//   27   53:aload           5
	//   28   55:aload_3         
	//   29   56:ldc1            #15  <String "VideoClicks">
	//   30   58:invokevirtual   #31  <Method void APSVASTLinearNode.addChildWithName(Object, String)>
			apsvastcreativenode1.addChildWithName(((Object) (apsvastlinearnode)), "Linear");
	//   31   61:aload           4
	//   32   63:aload           5
	//   33   65:ldc1            #33  <String "Linear">
	//   34   67:invokevirtual   #34  <Method void APSVASTCreativeNode.addChildWithName(Object, String)>
			arraylist.add(((Object) (apsvastcreativenode1)));
	//   35   70:aload_1         
	//   36   71:aload           4
	//   37   73:invokevirtual   #40  <Method boolean ArrayList.add(Object)>
	//   38   76:pop             
			if(apsvastxmlnode != null)
	//*  39   77:aload_2         
	//*  40   78:ifnull          195
			{
				APSVASTCreativeNode apsvastcreativenode = new APSVASTCreativeNode();
	//   41   81:new             #23  <Class APSVASTCreativeNode>
	//   42   84:dup             
	//   43   85:invokespecial   #24  <Method void APSVASTCreativeNode()>
	//   44   88:astore_3        
				Object obj = ((Object) (new APSVASTNonLinearAdsNode()));
	//   45   89:new             #42  <Class APSVASTNonLinearAdsNode>
	//   46   92:dup             
	//   47   93:invokespecial   #43  <Method void APSVASTNonLinearAdsNode()>
	//   48   96:astore          4
				Object obj1 = ((Object) (new APSVASTNonLinearNode()));
	//   49   98:new             #45  <Class APSVASTNonLinearNode>
	//   50  101:dup             
	//   51  102:invokespecial   #46  <Method void APSVASTNonLinearNode()>
	//   52  105:astore          5
				((APSVASTNonLinearNode) (obj1)).addChildWithName(((Object) (apsvastxmlnode)), "TrackingEvents");
	//   53  107:aload           5
	//   54  109:aload_2         
	//   55  110:ldc1            #21  <String "TrackingEvents">
	//   56  112:invokevirtual   #47  <Method void APSVASTNonLinearNode.addChildWithName(Object, String)>
				((APSVASTNonLinearAdsNode) (obj)).addChildWithName(obj1, "NonLinear");
	//   57  115:aload           4
	//   58  117:aload           5
	//   59  119:ldc1            #49  <String "NonLinear">
	//   60  121:invokevirtual   #50  <Method void APSVASTNonLinearAdsNode.addChildWithName(Object, String)>
				apsvastcreativenode.addChildWithName(obj, "NonLinearAds");
	//   61  124:aload_3         
	//   62  125:aload           4
	//   63  127:ldc1            #52  <String "NonLinearAds">
	//   64  129:invokevirtual   #34  <Method void APSVASTCreativeNode.addChildWithName(Object, String)>
				arraylist.add(((Object) (apsvastcreativenode)));
	//   65  132:aload_1         
	//   66  133:aload_3         
	//   67  134:invokevirtual   #40  <Method boolean ArrayList.add(Object)>
	//   68  137:pop             
				apsvastcreativenode = new APSVASTCreativeNode();
	//   69  138:new             #23  <Class APSVASTCreativeNode>
	//   70  141:dup             
	//   71  142:invokespecial   #24  <Method void APSVASTCreativeNode()>
	//   72  145:astore_3        
				obj = ((Object) (new APSVASTCompanionAdsNode()));
	//   73  146:new             #54  <Class APSVASTCompanionAdsNode>
	//   74  149:dup             
	//   75  150:invokespecial   #55  <Method void APSVASTCompanionAdsNode()>
	//   76  153:astore          4
				obj1 = ((Object) (new APSVASTCompanionNode()));
	//   77  155:new             #57  <Class APSVASTCompanionNode>
	//   78  158:dup             
	//   79  159:invokespecial   #58  <Method void APSVASTCompanionNode()>
	//   80  162:astore          5
				((APSVASTCompanionNode) (obj1)).addChildWithName(((Object) (apsvastxmlnode)), "TrackingEvents");
	//   81  164:aload           5
	//   82  166:aload_2         
	//   83  167:ldc1            #21  <String "TrackingEvents">
	//   84  169:invokevirtual   #59  <Method void APSVASTCompanionNode.addChildWithName(Object, String)>
				((APSVASTCompanionAdsNode) (obj)).addChildWithName(obj1, "Companion");
	//   85  172:aload           4
	//   86  174:aload           5
	//   87  176:ldc1            #61  <String "Companion">
	//   88  178:invokevirtual   #62  <Method void APSVASTCompanionAdsNode.addChildWithName(Object, String)>
				apsvastcreativenode.addChildWithName(obj, "CompanionAds");
	//   89  181:aload_3         
	//   90  182:aload           4
	//   91  184:ldc1            #64  <String "CompanionAds">
	//   92  186:invokevirtual   #34  <Method void APSVASTCreativeNode.addChildWithName(Object, String)>
				arraylist.add(((Object) (apsvastcreativenode)));
	//   93  189:aload_1         
	//   94  190:aload_3         
	//   95  191:invokevirtual   #40  <Method boolean ArrayList.add(Object)>
	//   96  194:pop             
			}
		}
		return arraylist;
	//   97  195:aload_1         
	//   98  196:areturn         
	}

	public String nextURL()
	{
		ArrayList arraylist1 = urlsForChildrenNamed("VASTAdTagURL");
	//    0    0:aload_0         
	//    1    1:ldc1            #70  <String "VASTAdTagURL">
	//    2    3:invokevirtual   #74  <Method ArrayList urlsForChildrenNamed(String)>
	//    3    6:astore_2        
		ArrayList arraylist = arraylist1;
	//    4    7:aload_2         
	//    5    8:astore_1        
		if(arraylist1 == null)
	//*   6    9:aload_2         
	//*   7   10:ifnonnull       20
			arraylist = urlsForChildrenNamed("VASTAdTagURI");
	//    8   13:aload_0         
	//    9   14:ldc1            #76  <String "VASTAdTagURI">
	//   10   16:invokevirtual   #74  <Method ArrayList urlsForChildrenNamed(String)>
	//   11   19:astore_1        
		if(arraylist != null && arraylist.size() > 0)
	//*  12   20:aload_1         
	//*  13   21:ifnull          48
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #80  <Method int ArrayList.size()>
	//*  16   28:ifle            48
			return ((String)arraylist.get(arraylist.size() - 1)).toString();
	//   17   31:aload_1         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #80  <Method int ArrayList.size()>
	//   20   36:iconst_1        
	//   21   37:isub            
	//   22   38:invokevirtual   #84  <Method Object ArrayList.get(int)>
	//   23   41:checkcast       #86  <Class String>
	//   24   44:invokevirtual   #89  <Method String String.toString()>
	//   25   47:areturn         
		else
			return null;
	//   26   48:aconst_null     
	//   27   49:areturn         
	}
}
