// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.*;

// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode, APSVASTWrapperNode, APSVASTCreativeNode, APSVASTNonLinearAdsNode, 
//			APSVASTNonLinearNode, APSVASTCompanionAdsNode, APSVASTCompanionNode, APSVASTLinearNode

public class APSVASTInLineNode extends APSVASTXMLNode
{

	public APSVASTInLineNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public void aggregateWithWrapper(APSVASTWrapperNode apsvastwrappernode)
	{
		addChildrenWithName(apsvastwrappernode.childrenNamed("Error"), "Error");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #18  <String "Error">
	//    3    4:invokevirtual   #24  <Method ArrayList APSVASTWrapperNode.childrenNamed(String)>
	//    4    7:ldc1            #18  <String "Error">
	//    5    9:invokevirtual   #28  <Method void addChildrenWithName(ArrayList, String)>
		addChildrenWithName(apsvastwrappernode.childrenNamed("Impression"), "Impression");
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:ldc1            #30  <String "Impression">
	//    9   16:invokevirtual   #24  <Method ArrayList APSVASTWrapperNode.childrenNamed(String)>
	//   10   19:ldc1            #30  <String "Impression">
	//   11   21:invokevirtual   #28  <Method void addChildrenWithName(ArrayList, String)>
		if(apsvastwrappernode.firstChildNamed("Extensions") != null)
	//*  12   24:aload_1         
	//*  13   25:ldc1            #32  <String "Extensions">
	//*  14   27:invokevirtual   #36  <Method APSVASTXMLNode APSVASTWrapperNode.firstChildNamed(String)>
	//*  15   30:ifnull          58
			((APSVASTXMLNode)getOrCreateNodeWithName("Extensions")).addChildrenWithName(apsvastwrappernode.firstChildNamed("Extensions").childrenNamed("Extension"), "Extension");
	//   16   33:aload_0         
	//   17   34:ldc1            #32  <String "Extensions">
	//   18   36:invokevirtual   #40  <Method Object getOrCreateNodeWithName(String)>
	//   19   39:checkcast       #4   <Class APSVASTXMLNode>
	//   20   42:aload_1         
	//   21   43:ldc1            #32  <String "Extensions">
	//   22   45:invokevirtual   #36  <Method APSVASTXMLNode APSVASTWrapperNode.firstChildNamed(String)>
	//   23   48:ldc1            #42  <String "Extension">
	//   24   50:invokevirtual   #43  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//   25   53:ldc1            #42  <String "Extension">
	//   26   55:invokevirtual   #44  <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
		Iterator iterator = apsvastwrappernode.creatives().iterator();
	//   27   58:aload_1         
	//   28   59:invokevirtual   #48  <Method ArrayList APSVASTWrapperNode.creatives()>
	//   29   62:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//   30   65:astore          7
		Object obj3 = null;
	//   31   67:aconst_null     
	//   32   68:astore          6
		APSVASTXMLNode apsvastxmlnode = null;
	//   33   70:aconst_null     
	//   34   71:astore          4
		apsvastwrappernode = ((APSVASTWrapperNode) (apsvastxmlnode));
	//   35   73:aload           4
	//   36   75:astore_1        
		Object obj = ((Object) (apsvastwrappernode));
	//   37   76:aload_1         
	//   38   77:astore_2        
		Object obj1 = obj;
	//   39   78:aload_2         
	//   40   79:astore_3        
		Object obj2 = ((Object) (apsvastwrappernode));
	//   41   80:aload_1         
	//   42   81:astore          5
		apsvastwrappernode = ((APSVASTWrapperNode) (obj3));
	//   43   83:aload           6
	//   44   85:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   45   86:aload           7
	//   46   88:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   47   93:ifeq            199
			obj3 = ((Object) ((APSVASTCreativeNode)iterator.next()));
	//   48   96:aload           7
	//   49   98:invokeinterface #64  <Method Object Iterator.next()>
	//   50  103:checkcast       #66  <Class APSVASTCreativeNode>
	//   51  106:astore          6
			if(((APSVASTCreativeNode) (obj3)).getLinear() != null)
	//*  52  108:aload           6
	//*  53  110:invokevirtual   #70  <Method APSVASTLinearNode APSVASTCreativeNode.getLinear()>
	//*  54  113:ifnull          125
				apsvastwrappernode = ((APSVASTWrapperNode) (((APSVASTCreativeNode) (obj3)).getLinear()));
	//   55  116:aload           6
	//   56  118:invokevirtual   #70  <Method APSVASTLinearNode APSVASTCreativeNode.getLinear()>
	//   57  121:astore_1        
			else
	//*  58  122:goto            86
			if(((APSVASTCreativeNode) (obj3)).getNonlinearAds() != null)
	//*  59  125:aload           6
	//*  60  127:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//*  61  130:ifnull          163
			{
				obj2 = ((Object) ((APSVASTNonLinearNode)((APSVASTCreativeNode) (obj3)).getNonlinearAds().firstChildNamed("NonLinear")));
	//   62  133:aload           6
	//   63  135:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//   64  138:ldc1            #76  <String "NonLinear">
	//   65  140:invokevirtual   #79  <Method APSVASTXMLNode APSVASTNonLinearAdsNode.firstChildNamed(String)>
	//   66  143:checkcast       #81  <Class APSVASTNonLinearNode>
	//   67  146:astore          5
				apsvastxmlnode = ((APSVASTCreativeNode) (obj3)).getNonlinearAds().firstChildNamed("TrackingEvents");
	//   68  148:aload           6
	//   69  150:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//   70  153:ldc1            #83  <String "TrackingEvents">
	//   71  155:invokevirtual   #79  <Method APSVASTXMLNode APSVASTNonLinearAdsNode.firstChildNamed(String)>
	//   72  158:astore          4
			} else
	//*  73  160:goto            86
			if(((APSVASTCreativeNode) (obj3)).getCompanionAds() != null)
	//*  74  163:aload           6
	//*  75  165:invokevirtual   #87  <Method APSVASTCompanionAdsNode APSVASTCreativeNode.getCompanionAds()>
	//*  76  168:ifnull          86
			{
				obj = ((Object) ((APSVASTCompanionNode)((APSVASTCreativeNode) (obj3)).getCompanionAds().firstChildNamed("Companion")));
	//   77  171:aload           6
	//   78  173:invokevirtual   #87  <Method APSVASTCompanionAdsNode APSVASTCreativeNode.getCompanionAds()>
	//   79  176:ldc1            #89  <String "Companion">
	//   80  178:invokevirtual   #92  <Method APSVASTXMLNode APSVASTCompanionAdsNode.firstChildNamed(String)>
	//   81  181:checkcast       #94  <Class APSVASTCompanionNode>
	//   82  184:astore_2        
				obj1 = ((Object) (((APSVASTCreativeNode) (obj3)).getCompanionAds().firstChildNamed("TrackingEvents")));
	//   83  185:aload           6
	//   84  187:invokevirtual   #87  <Method APSVASTCompanionAdsNode APSVASTCreativeNode.getCompanionAds()>
	//   85  190:ldc1            #83  <String "TrackingEvents">
	//   86  192:invokevirtual   #92  <Method APSVASTXMLNode APSVASTCompanionAdsNode.firstChildNamed(String)>
	//   87  195:astore_3        
			}
		} while(true);
	//   88  196:goto            86
		obj3 = ((Object) (creatives().iterator()));
	//   89  199:aload_0         
	//   90  200:invokevirtual   #95  <Method ArrayList creatives()>
	//   91  203:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//   92  206:astore          6
		do
		{
			if(!((Iterator) (obj3)).hasNext())
				break;
	//   93  208:aload           6
	//   94  210:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   95  215:ifeq            415
			Object obj4 = ((Object) ((APSVASTCreativeNode)((Iterator) (obj3)).next()));
	//   96  218:aload           6
	//   97  220:invokeinterface #64  <Method Object Iterator.next()>
	//   98  225:checkcast       #66  <Class APSVASTCreativeNode>
	//   99  228:astore          7
			if(apsvastwrappernode != null && ((APSVASTCreativeNode) (obj4)).getLinear() != null)
	//* 100  230:aload_1         
	//* 101  231:ifnull          251
	//* 102  234:aload           7
	//* 103  236:invokevirtual   #70  <Method APSVASTLinearNode APSVASTCreativeNode.getLinear()>
	//* 104  239:ifnull          251
				((APSVASTCreativeNode) (obj4)).getLinear().mergeWith(((APSVASTCreativeTypeNode) (apsvastwrappernode)));
	//  105  242:aload           7
	//  106  244:invokevirtual   #70  <Method APSVASTLinearNode APSVASTCreativeNode.getLinear()>
	//  107  247:aload_1         
	//  108  248:invokevirtual   #101 <Method void APSVASTLinearNode.mergeWith(APSVASTCreativeTypeNode)>
			if(((APSVASTCreativeNode) (obj4)).getNonlinearAds() != null)
	//* 109  251:aload           7
	//* 110  253:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//* 111  256:ifnull          335
			{
				if(apsvastxmlnode != null)
	//* 112  259:aload           4
	//* 113  261:ifnull          289
					((APSVASTXMLNode)((APSVASTCreativeNode) (obj4)).getNonlinearAds().getOrCreateNodeWithName("TrackingEvents")).addChildrenWithName(apsvastxmlnode.childrenNamed("Tracking"), "Tracking");
	//  114  264:aload           7
	//  115  266:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//  116  269:ldc1            #83  <String "TrackingEvents">
	//  117  271:invokevirtual   #102 <Method Object APSVASTNonLinearAdsNode.getOrCreateNodeWithName(String)>
	//  118  274:checkcast       #4   <Class APSVASTXMLNode>
	//  119  277:aload           4
	//  120  279:ldc1            #104 <String "Tracking">
	//  121  281:invokevirtual   #43  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//  122  284:ldc1            #104 <String "Tracking">
	//  123  286:invokevirtual   #44  <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
				if(obj2 != null)
	//* 124  289:aload           5
	//* 125  291:ifnull          335
				{
					for(Iterator iterator1 = ((APSVASTCreativeNode) (obj4)).getNonlinearAds().nonlinears().iterator(); iterator1.hasNext(); ((APSVASTNonLinearNode)iterator1.next()).mergeWith(((APSVASTCreativeTypeNode) (obj2))));
	//  126  294:aload           7
	//  127  296:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//  128  299:invokevirtual   #107 <Method ArrayList APSVASTNonLinearAdsNode.nonlinears()>
	//  129  302:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//  130  305:astore          8
	//  131  307:aload           8
	//  132  309:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//  133  314:ifeq            335
	//  134  317:aload           8
	//  135  319:invokeinterface #64  <Method Object Iterator.next()>
	//  136  324:checkcast       #81  <Class APSVASTNonLinearNode>
	//  137  327:aload           5
	//  138  329:invokevirtual   #108 <Method void APSVASTNonLinearNode.mergeWith(APSVASTCreativeTypeNode)>
				}
			}
	//* 139  332:goto            307
			if(((APSVASTCreativeNode) (obj4)).getCompanionAds() != null)
	//* 140  335:aload           7
	//* 141  337:invokevirtual   #87  <Method APSVASTCompanionAdsNode APSVASTCreativeNode.getCompanionAds()>
	//* 142  340:ifnull          208
			{
				if(obj1 != null)
	//* 143  343:aload_3         
	//* 144  344:ifnull          371
					((APSVASTXMLNode)((APSVASTCreativeNode) (obj4)).getCompanionAds().getOrCreateNodeWithName("TrackingEvents")).addChildrenWithName(((APSVASTXMLNode) (obj1)).childrenNamed("Tracking"), "Tracking");
	//  145  347:aload           7
	//  146  349:invokevirtual   #87  <Method APSVASTCompanionAdsNode APSVASTCreativeNode.getCompanionAds()>
	//  147  352:ldc1            #83  <String "TrackingEvents">
	//  148  354:invokevirtual   #109 <Method Object APSVASTCompanionAdsNode.getOrCreateNodeWithName(String)>
	//  149  357:checkcast       #4   <Class APSVASTXMLNode>
	//  150  360:aload_3         
	//  151  361:ldc1            #104 <String "Tracking">
	//  152  363:invokevirtual   #43  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//  153  366:ldc1            #104 <String "Tracking">
	//  154  368:invokevirtual   #44  <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
				if(obj != null)
	//* 155  371:aload_2         
	//* 156  372:ifnull          208
				{
					obj4 = ((Object) (((APSVASTCreativeNode) (obj4)).getCompanionAds().companions().iterator()));
	//  157  375:aload           7
	//  158  377:invokevirtual   #87  <Method APSVASTCompanionAdsNode APSVASTCreativeNode.getCompanionAds()>
	//  159  380:invokevirtual   #112 <Method ArrayList APSVASTCompanionAdsNode.companions()>
	//  160  383:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//  161  386:astore          7
					while(((Iterator) (obj4)).hasNext()) 
	//* 162  388:aload           7
	//* 163  390:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//* 164  395:ifeq            208
						((APSVASTCompanionNode)((Iterator) (obj4)).next()).mergeWith(((APSVASTCreativeTypeNode) (obj)));
	//  165  398:aload           7
	//  166  400:invokeinterface #64  <Method Object Iterator.next()>
	//  167  405:checkcast       #94  <Class APSVASTCompanionNode>
	//  168  408:aload_2         
	//  169  409:invokevirtual   #113 <Method void APSVASTCompanionNode.mergeWith(APSVASTCreativeTypeNode)>
				}
			}
		} while(true);
	//  170  412:goto            388
	//  171  415:return          
	}

	public APSVASTCreativeNode creativeAtIndex(int i)
	{
		ArrayList arraylist = creatives();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method ArrayList creatives()>
	//    2    4:astore_2        
		if(arraylist != null && arraylist.size() > i)
	//*   3    5:aload_2         
	//*   4    6:ifnull          26
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #119 <Method int ArrayList.size()>
	//*   7   13:iload_1         
	//*   8   14:icmple          26
			return (APSVASTCreativeNode)arraylist.get(i);
	//    9   17:aload_2         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #123 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #66  <Class APSVASTCreativeNode>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public ArrayList creatives()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #50  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void ArrayList()>
	//    3    7:astore_1        
		Object obj = ((Object) (childrenNamed("Video")));
	//    4    8:aload_0         
	//    5    9:ldc1            #126 <String "Video">
	//    6   11:invokevirtual   #127 <Method ArrayList childrenNamed(String)>
	//    7   14:astore_2        
		if(obj != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          460
		{
			obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   10   19:aload_2         
	//   11   20:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//   12   23:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   13   24:aload_2         
	//   14   25:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   15   30:ifeq            460
				APSVASTXMLNode apsvastxmlnode = (APSVASTXMLNode)((Iterator) (obj)).next();
	//   16   33:aload_2         
	//   17   34:invokeinterface #64  <Method Object Iterator.next()>
	//   18   39:checkcast       #4   <Class APSVASTXMLNode>
	//   19   42:astore_3        
				Object obj1 = ((Object) (new APSVASTLinearNode()));
	//   20   43:new             #97  <Class APSVASTLinearNode>
	//   21   46:dup             
	//   22   47:invokespecial   #128 <Method void APSVASTLinearNode()>
	//   23   50:astore          4
				((APSVASTLinearNode) (obj1)).initWithNode(apsvastxmlnode);
	//   24   52:aload           4
	//   25   54:aload_3         
	//   26   55:invokevirtual   #132 <Method void APSVASTLinearNode.initWithNode(APSVASTXMLNode)>
				Object obj2 = ((Object) (new APSVASTCreativeNode()));
	//   27   58:new             #66  <Class APSVASTCreativeNode>
	//   28   61:dup             
	//   29   62:invokespecial   #133 <Method void APSVASTCreativeNode()>
	//   30   65:astore          5
				((APSVASTLinearNode) (obj1)).addChildWithName(((Object) (firstChildNamed("TrackingEvents"))), "TrackingEvents");
	//   31   67:aload           4
	//   32   69:aload_0         
	//   33   70:ldc1            #83  <String "TrackingEvents">
	//   34   72:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//   35   75:ldc1            #83  <String "TrackingEvents">
	//   36   77:invokevirtual   #138 <Method void APSVASTLinearNode.addChildWithName(Object, String)>
				if(firstChildNamed("VideoClicks") != null)
	//*  37   80:aload_0         
	//*  38   81:ldc1            #140 <String "VideoClicks">
	//*  39   83:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//*  40   86:ifnull          115
					((APSVASTXMLNode)((APSVASTLinearNode) (obj1)).getOrCreateNodeWithName("VideoClicks")).addChildrenWithName(firstChildNamed("VideoClicks").childrenNamed("ClickTracking"), "ClickTracking");
	//   41   89:aload           4
	//   42   91:ldc1            #140 <String "VideoClicks">
	//   43   93:invokevirtual   #141 <Method Object APSVASTLinearNode.getOrCreateNodeWithName(String)>
	//   44   96:checkcast       #4   <Class APSVASTXMLNode>
	//   45   99:aload_0         
	//   46  100:ldc1            #140 <String "VideoClicks">
	//   47  102:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//   48  105:ldc1            #143 <String "ClickTracking">
	//   49  107:invokevirtual   #43  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//   50  110:ldc1            #143 <String "ClickTracking">
	//   51  112:invokevirtual   #44  <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
				((APSVASTCreativeNode) (obj2)).addChildWithName(obj1, "Linear");
	//   52  115:aload           5
	//   53  117:aload           4
	//   54  119:ldc1            #145 <String "Linear">
	//   55  121:invokevirtual   #146 <Method void APSVASTCreativeNode.addChildWithName(Object, String)>
				arraylist.add(obj2);
	//   56  124:aload_1         
	//   57  125:aload           5
	//   58  127:invokevirtual   #150 <Method boolean ArrayList.add(Object)>
	//   59  130:pop             
				obj2 = ((Object) (apsvastxmlnode.firstChildNamed("CompanionAds")));
	//   60  131:aload_3         
	//   61  132:ldc1            #152 <String "CompanionAds">
	//   62  134:invokevirtual   #153 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//   63  137:astore          5
				if(obj2 != null)
	//*  64  139:aload           5
	//*  65  141:ifnull          285
				{
					obj1 = ((Object) (new APSVASTCompanionAdsNode()));
	//   66  144:new             #91  <Class APSVASTCompanionAdsNode>
	//   67  147:dup             
	//   68  148:invokespecial   #154 <Method void APSVASTCompanionAdsNode()>
	//   69  151:astore          4
					((APSVASTCompanionAdsNode) (obj1)).initWithNode(((APSVASTXMLNode) (obj2)));
	//   70  153:aload           4
	//   71  155:aload           5
	//   72  157:invokevirtual   #155 <Method void APSVASTCompanionAdsNode.initWithNode(APSVASTXMLNode)>
					obj2 = ((Object) (new APSVASTCreativeNode()));
	//   73  160:new             #66  <Class APSVASTCreativeNode>
	//   74  163:dup             
	//   75  164:invokespecial   #133 <Method void APSVASTCreativeNode()>
	//   76  167:astore          5
					if(((APSVASTCompanionAdsNode) (obj1)).childrenNamed("Companion") != null)
	//*  77  169:aload           4
	//*  78  171:ldc1            #89  <String "Companion">
	//*  79  173:invokevirtual   #156 <Method ArrayList APSVASTCompanionAdsNode.childrenNamed(String)>
	//*  80  176:ifnull          269
					{
						APSVASTXMLNode apsvastxmlnode3;
						for(Iterator iterator2 = ((APSVASTCompanionAdsNode) (obj1)).childrenNamed("Companion").iterator(); iterator2.hasNext(); apsvastxmlnode3.addChildrenWithName(childrenNamed("AdParameters"), "AdParameters"))
	//*  81  179:aload           4
	//*  82  181:ldc1            #89  <String "Companion">
	//*  83  183:invokevirtual   #156 <Method ArrayList APSVASTCompanionAdsNode.childrenNamed(String)>
	//*  84  186:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//*  85  189:astore          6
	//*  86  191:aload           6
	//*  87  193:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  88  198:ifeq            269
						{
							apsvastxmlnode3 = (APSVASTXMLNode)iterator2.next();
	//   89  201:aload           6
	//   90  203:invokeinterface #64  <Method Object Iterator.next()>
	//   91  208:checkcast       #4   <Class APSVASTXMLNode>
	//   92  211:astore          7
							apsvastxmlnode3.addChildWithName(((Object) (firstChildNamed("TrackingEvents"))), "TrackingEvents");
	//   93  213:aload           7
	//   94  215:aload_0         
	//   95  216:ldc1            #83  <String "TrackingEvents">
	//   96  218:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//   97  221:ldc1            #83  <String "TrackingEvents">
	//   98  223:invokevirtual   #157 <Method void APSVASTXMLNode.addChildWithName(Object, String)>
							apsvastxmlnode3.addChildWithName(((Object) (((APSVASTCompanionAdsNode) (obj1)).firstChildNamed("CompanionClickThrough"))), "CompanionClickThrough");
	//   99  226:aload           7
	//  100  228:aload           4
	//  101  230:ldc1            #159 <String "CompanionClickThrough">
	//  102  232:invokevirtual   #92  <Method APSVASTXMLNode APSVASTCompanionAdsNode.firstChildNamed(String)>
	//  103  235:ldc1            #159 <String "CompanionClickThrough">
	//  104  237:invokevirtual   #157 <Method void APSVASTXMLNode.addChildWithName(Object, String)>
							apsvastxmlnode3.addChildWithName(((Object) (firstChildNamed("AltText"))), "AltText");
	//  105  240:aload           7
	//  106  242:aload_0         
	//  107  243:ldc1            #161 <String "AltText">
	//  108  245:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//  109  248:ldc1            #161 <String "AltText">
	//  110  250:invokevirtual   #157 <Method void APSVASTXMLNode.addChildWithName(Object, String)>
						}

	//  111  253:aload           7
	//  112  255:aload_0         
	//  113  256:ldc1            #163 <String "AdParameters">
	//  114  258:invokevirtual   #127 <Method ArrayList childrenNamed(String)>
	//  115  261:ldc1            #163 <String "AdParameters">
	//  116  263:invokevirtual   #44  <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
					}
	//* 117  266:goto            191
					((APSVASTCreativeNode) (obj2)).addChildWithName(obj1, "CompanionAds");
	//  118  269:aload           5
	//  119  271:aload           4
	//  120  273:ldc1            #152 <String "CompanionAds">
	//  121  275:invokevirtual   #146 <Method void APSVASTCreativeNode.addChildWithName(Object, String)>
					arraylist.add(obj2);
	//  122  278:aload_1         
	//  123  279:aload           5
	//  124  281:invokevirtual   #150 <Method boolean ArrayList.add(Object)>
	//  125  284:pop             
				}
				obj1 = ((Object) (apsvastxmlnode.firstChildNamed("NonLinearAds")));
	//  126  285:aload_3         
	//  127  286:ldc1            #165 <String "NonLinearAds">
	//  128  288:invokevirtual   #153 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//  129  291:astore          4
				if(obj1 != null)
	//* 130  293:aload           4
	//* 131  295:ifnull          24
				{
					APSVASTNonLinearAdsNode apsvastnonlinearadsnode = new APSVASTNonLinearAdsNode();
	//  132  298:new             #78  <Class APSVASTNonLinearAdsNode>
	//  133  301:dup             
	//  134  302:invokespecial   #166 <Method void APSVASTNonLinearAdsNode()>
	//  135  305:astore_3        
					apsvastnonlinearadsnode.initWithNode(((APSVASTXMLNode) (obj1)));
	//  136  306:aload_3         
	//  137  307:aload           4
	//  138  309:invokevirtual   #167 <Method void APSVASTNonLinearAdsNode.initWithNode(APSVASTXMLNode)>
					obj1 = ((Object) (new APSVASTCreativeNode()));
	//  139  312:new             #66  <Class APSVASTCreativeNode>
	//  140  315:dup             
	//  141  316:invokespecial   #133 <Method void APSVASTCreativeNode()>
	//  142  319:astore          4
					if(apsvastnonlinearadsnode.childrenNamed("NonLinear") != null)
	//* 143  321:aload_3         
	//* 144  322:ldc1            #76  <String "NonLinear">
	//* 145  324:invokevirtual   #168 <Method ArrayList APSVASTNonLinearAdsNode.childrenNamed(String)>
	//* 146  327:ifnull          442
					{
						Iterator iterator1 = apsvastnonlinearadsnode.childrenNamed("NonLinear").iterator();
	//  147  330:aload_3         
	//  148  331:ldc1            #76  <String "NonLinear">
	//  149  333:invokevirtual   #168 <Method ArrayList APSVASTNonLinearAdsNode.childrenNamed(String)>
	//  150  336:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//  151  339:astore          5
						do
						{
							if(!iterator1.hasNext())
								break;
	//  152  341:aload           5
	//  153  343:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//  154  348:ifeq            442
							APSVASTXMLNode apsvastxmlnode2 = (APSVASTXMLNode)iterator1.next();
	//  155  351:aload           5
	//  156  353:invokeinterface #64  <Method Object Iterator.next()>
	//  157  358:checkcast       #4   <Class APSVASTXMLNode>
	//  158  361:astore          6
							apsvastxmlnode2.addChildWithName(((Object) (firstChildNamed("TrackingEvents"))), "TrackingEvents");
	//  159  363:aload           6
	//  160  365:aload_0         
	//  161  366:ldc1            #83  <String "TrackingEvents">
	//  162  368:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//  163  371:ldc1            #83  <String "TrackingEvents">
	//  164  373:invokevirtual   #157 <Method void APSVASTXMLNode.addChildWithName(Object, String)>
							apsvastxmlnode2.addChildWithName(((Object) (apsvastnonlinearadsnode.firstChildNamed("NonLinearClickThrough"))), "NonLinearClickThrough");
	//  165  376:aload           6
	//  166  378:aload_3         
	//  167  379:ldc1            #170 <String "NonLinearClickThrough">
	//  168  381:invokevirtual   #79  <Method APSVASTXMLNode APSVASTNonLinearAdsNode.firstChildNamed(String)>
	//  169  384:ldc1            #170 <String "NonLinearClickThrough">
	//  170  386:invokevirtual   #157 <Method void APSVASTXMLNode.addChildWithName(Object, String)>
							apsvastxmlnode2.addChildrenWithName(childrenNamed("AdParameters"), "AdParameters");
	//  171  389:aload           6
	//  172  391:aload_0         
	//  173  392:ldc1            #163 <String "AdParameters">
	//  174  394:invokevirtual   #127 <Method ArrayList childrenNamed(String)>
	//  175  397:ldc1            #163 <String "AdParameters">
	//  176  399:invokevirtual   #44  <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
							String s = (String)firstChildNamed("AdParameters").attributes.get("apiFramework");
	//  177  402:aload_0         
	//  178  403:ldc1            #163 <String "AdParameters">
	//  179  405:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//  180  408:getfield        #174 <Field HashMap APSVASTXMLNode.attributes>
	//  181  411:ldc1            #176 <String "apiFramework">
	//  182  413:invokevirtual   #181 <Method Object HashMap.get(Object)>
	//  183  416:checkcast       #183 <Class String>
	//  184  419:astore          7
							if(s != null)
	//* 185  421:aload           7
	//* 186  423:ifnull          341
								apsvastxmlnode2.attributes.put("apiFramework", ((Object) (s)));
	//  187  426:aload           6
	//  188  428:getfield        #174 <Field HashMap APSVASTXMLNode.attributes>
	//  189  431:ldc1            #176 <String "apiFramework">
	//  190  433:aload           7
	//  191  435:invokevirtual   #187 <Method Object HashMap.put(Object, Object)>
	//  192  438:pop             
						} while(true);
	//  193  439:goto            341
					}
					((APSVASTCreativeNode) (obj1)).addChildWithName(((Object) (apsvastnonlinearadsnode)), "NonLinearAds");
	//  194  442:aload           4
	//  195  444:aload_3         
	//  196  445:ldc1            #165 <String "NonLinearAds">
	//  197  447:invokevirtual   #146 <Method void APSVASTCreativeNode.addChildWithName(Object, String)>
					arraylist.add(obj1);
	//  198  450:aload_1         
	//  199  451:aload           4
	//  200  453:invokevirtual   #150 <Method boolean ArrayList.add(Object)>
	//  201  456:pop             
				}
			} while(true);
	//  202  457:goto            24
		}
		if(firstChildNamed("Creatives") != null)
	//* 203  460:aload_0         
	//* 204  461:ldc1            #189 <String "Creatives">
	//* 205  463:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//* 206  466:ifnull          599
		{
			ArrayList arraylist1 = firstChildNamed("Creatives").childrenNamed("Creative");
	//  207  469:aload_0         
	//  208  470:ldc1            #189 <String "Creatives">
	//  209  472:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//  210  475:ldc1            #191 <String "Creative">
	//  211  477:invokevirtual   #43  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//  212  480:astore_2        
			if(arraylist1 != null)
	//* 213  481:aload_2         
	//* 214  482:ifnull          599
			{
				Iterator iterator = arraylist1.iterator();
	//  215  485:aload_2         
	//  216  486:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//  217  489:astore_3        
				do
				{
					if(!iterator.hasNext())
						break;
	//  218  490:aload_3         
	//  219  491:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//  220  496:ifeq            593
					Object obj3 = ((Object) ((APSVASTCreativeNode)iterator.next()));
	//  221  499:aload_3         
	//  222  500:invokeinterface #64  <Method Object Iterator.next()>
	//  223  505:checkcast       #66  <Class APSVASTCreativeNode>
	//  224  508:astore          5
					if(((APSVASTCreativeNode) (obj3)).getNonlinearAds() != null)
	//* 225  510:aload           5
	//* 226  512:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//* 227  515:ifnull          490
					{
						APSVASTXMLNode apsvastxmlnode1 = ((APSVASTCreativeNode) (obj3)).getNonlinearAds().firstChildNamed("TrackingEvents");
	//  228  518:aload           5
	//  229  520:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//  230  523:ldc1            #83  <String "TrackingEvents">
	//  231  525:invokevirtual   #79  <Method APSVASTXMLNode APSVASTNonLinearAdsNode.firstChildNamed(String)>
	//  232  528:astore          4
						if(apsvastxmlnode1 != null && ((APSVASTCreativeNode) (obj3)).getNonlinearAds().childrenNamed("NonLinear") != null)
	//* 233  530:aload           4
	//* 234  532:ifnull          490
	//* 235  535:aload           5
	//* 236  537:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//* 237  540:ldc1            #76  <String "NonLinear">
	//* 238  542:invokevirtual   #168 <Method ArrayList APSVASTNonLinearAdsNode.childrenNamed(String)>
	//* 239  545:ifnull          490
						{
							obj3 = ((Object) (((APSVASTCreativeNode) (obj3)).getNonlinearAds().childrenNamed("NonLinear").iterator()));
	//  240  548:aload           5
	//  241  550:invokevirtual   #74  <Method APSVASTNonLinearAdsNode APSVASTCreativeNode.getNonlinearAds()>
	//  242  553:ldc1            #76  <String "NonLinear">
	//  243  555:invokevirtual   #168 <Method ArrayList APSVASTNonLinearAdsNode.childrenNamed(String)>
	//  244  558:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//  245  561:astore          5
							while(((Iterator) (obj3)).hasNext()) 
	//* 246  563:aload           5
	//* 247  565:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//* 248  570:ifeq            490
								((APSVASTXMLNode)((Iterator) (obj3)).next()).addChildWithName(((Object) (apsvastxmlnode1)), "TrackingEvents");
	//  249  573:aload           5
	//  250  575:invokeinterface #64  <Method Object Iterator.next()>
	//  251  580:checkcast       #4   <Class APSVASTXMLNode>
	//  252  583:aload           4
	//  253  585:ldc1            #83  <String "TrackingEvents">
	//  254  587:invokevirtual   #157 <Method void APSVASTXMLNode.addChildWithName(Object, String)>
						}
					}
				} while(true);
	//  255  590:goto            563
				arraylist.addAll(((java.util.Collection) (arraylist1)));
	//  256  593:aload_1         
	//  257  594:aload_2         
	//  258  595:invokevirtual   #195 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  259  598:pop             
			}
		}
		return arraylist;
	//  260  599:aload_1         
	//  261  600:areturn         
	}

	public ArrayList errorURLsWithCode(int i)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #50  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void ArrayList()>
	//    3    7:astore_2        
		Object obj = ((Object) (urlsForChildrenNamed("Error")));
	//    4    8:aload_0         
	//    5    9:ldc1            #18  <String "Error">
	//    6   11:invokevirtual   #202 <Method ArrayList urlsForChildrenNamed(String)>
	//    7   14:astore_3        
		if(obj != null)
	//*   8   15:aload_3         
	//*   9   16:ifnull          59
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); arraylist.add(((Object) (((String)((Iterator) (obj)).next()).replace("[ERRORCODE]", ((CharSequence) (String.valueOf(i))))))));
	//   10   19:aload_3         
	//   11   20:invokevirtual   #54  <Method Iterator ArrayList.iterator()>
	//   12   23:astore_3        
	//   13   24:aload_3         
	//   14   25:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   15   30:ifeq            59
	//   16   33:aload_2         
	//   17   34:aload_3         
	//   18   35:invokeinterface #64  <Method Object Iterator.next()>
	//   19   40:checkcast       #183 <Class String>
	//   20   43:ldc1            #204 <String "[ERRORCODE]">
	//   21   45:iload_1         
	//   22   46:invokestatic    #208 <Method String String.valueOf(int)>
	//   23   49:invokevirtual   #212 <Method String String.replace(CharSequence, CharSequence)>
	//   24   52:invokevirtual   #150 <Method boolean ArrayList.add(Object)>
	//   25   55:pop             
	//*  26   56:goto            24
		return arraylist;
	//   27   59:aload_2         
	//   28   60:areturn         
	}

	public ArrayList extensions()
	{
		if(firstChildNamed("Extensions") != null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #32  <String "Extensions">
	//*   2    3:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//*   3    6:ifnull          21
			return firstChildNamed("Extensions").childrenNamed("Extension");
	//    4    9:aload_0         
	//    5   10:ldc1            #32  <String "Extensions">
	//    6   12:invokevirtual   #134 <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   15:ldc1            #42  <String "Extension">
	//    8   17:invokevirtual   #43  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//    9   20:areturn         
		else
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
	}

	public ArrayList impressionURLs()
	{
		return urlsForChildrenNamed("Impression");
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "Impression">
	//    2    3:invokevirtual   #202 <Method ArrayList urlsForChildrenNamed(String)>
	//    3    6:areturn         
	}

	public String adId;
	public int sourceIndex;
	public String sourceUrl;
}
