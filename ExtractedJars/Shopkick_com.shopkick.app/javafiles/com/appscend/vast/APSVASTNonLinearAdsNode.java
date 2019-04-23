// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.*;

// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode, APSVASTNonLinearNode

public class APSVASTNonLinearAdsNode extends APSVASTXMLNode
{

	public APSVASTNonLinearAdsNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public HashMap nonLinearsByType()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #13  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:astore_3        
		if(childrenNamed("NonLinear") != null)
	//*   4    8:aload_0         
	//*   5    9:ldc1            #16  <String "NonLinear">
	//*   6   11:invokevirtual   #20  <Method ArrayList childrenNamed(String)>
	//*   7   14:ifnull          250
		{
			Iterator iterator = childrenNamed("NonLinear").iterator();
	//    8   17:aload_0         
	//    9   18:ldc1            #16  <String "NonLinear">
	//   10   20:invokevirtual   #20  <Method ArrayList childrenNamed(String)>
	//   11   23:invokevirtual   #26  <Method Iterator ArrayList.iterator()>
	//   12   26:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//   13   28:aload           4
	//   14   30:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            250
				APSVASTNonLinearNode apsvastnonlinearnode = (APSVASTNonLinearNode)iterator.next();
	//   16   38:aload           4
	//   17   40:invokeinterface #36  <Method Object Iterator.next()>
	//   18   45:checkcast       #38  <Class APSVASTNonLinearNode>
	//   19   48:astore          5
				if(apsvastnonlinearnode.htmlResource() != null)
	//*  20   50:aload           5
	//*  21   52:invokevirtual   #42  <Method String APSVASTNonLinearNode.htmlResource()>
	//*  22   55:ifnull          100
				{
					ArrayList arraylist4 = (ArrayList)hashmap.get("html");
	//   23   58:aload_3         
	//   24   59:ldc1            #44  <String "html">
	//   25   61:invokevirtual   #48  <Method Object HashMap.get(Object)>
	//   26   64:checkcast       #22  <Class ArrayList>
	//   27   67:astore_2        
					ArrayList arraylist = arraylist4;
	//   28   68:aload_2         
	//   29   69:astore_1        
					if(arraylist4 == null)
	//*  30   70:aload_2         
	//*  31   71:ifnonnull       82
						arraylist = new ArrayList();
	//   32   74:new             #22  <Class ArrayList>
	//   33   77:dup             
	//   34   78:invokespecial   #49  <Method void ArrayList()>
	//   35   81:astore_1        
					arraylist.add(((Object) (apsvastnonlinearnode)));
	//   36   82:aload_1         
	//   37   83:aload           5
	//   38   85:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
	//   39   88:pop             
					hashmap.put("html", ((Object) (arraylist)));
	//   40   89:aload_3         
	//   41   90:ldc1            #44  <String "html">
	//   42   92:aload_1         
	//   43   93:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   44   96:pop             
				} else
	//*  45   97:goto            28
				if(apsvastnonlinearnode.iframeResource() != null)
	//*  46  100:aload           5
	//*  47  102:invokevirtual   #60  <Method String APSVASTNonLinearNode.iframeResource()>
	//*  48  105:ifnull          150
				{
					ArrayList arraylist5 = (ArrayList)hashmap.get("iframe");
	//   49  108:aload_3         
	//   50  109:ldc1            #62  <String "iframe">
	//   51  111:invokevirtual   #48  <Method Object HashMap.get(Object)>
	//   52  114:checkcast       #22  <Class ArrayList>
	//   53  117:astore_2        
					ArrayList arraylist1 = arraylist5;
	//   54  118:aload_2         
	//   55  119:astore_1        
					if(arraylist5 == null)
	//*  56  120:aload_2         
	//*  57  121:ifnonnull       132
						arraylist1 = new ArrayList();
	//   58  124:new             #22  <Class ArrayList>
	//   59  127:dup             
	//   60  128:invokespecial   #49  <Method void ArrayList()>
	//   61  131:astore_1        
					arraylist1.add(((Object) (apsvastnonlinearnode)));
	//   62  132:aload_1         
	//   63  133:aload           5
	//   64  135:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
	//   65  138:pop             
					hashmap.put("iframe", ((Object) (arraylist1)));
	//   66  139:aload_3         
	//   67  140:ldc1            #62  <String "iframe">
	//   68  142:aload_1         
	//   69  143:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   70  146:pop             
				} else
	//*  71  147:goto            28
				if(apsvastnonlinearnode.scriptResource() != null)
	//*  72  150:aload           5
	//*  73  152:invokevirtual   #65  <Method String APSVASTNonLinearNode.scriptResource()>
	//*  74  155:ifnull          200
				{
					ArrayList arraylist6 = (ArrayList)hashmap.get("script");
	//   75  158:aload_3         
	//   76  159:ldc1            #67  <String "script">
	//   77  161:invokevirtual   #48  <Method Object HashMap.get(Object)>
	//   78  164:checkcast       #22  <Class ArrayList>
	//   79  167:astore_2        
					ArrayList arraylist2 = arraylist6;
	//   80  168:aload_2         
	//   81  169:astore_1        
					if(arraylist6 == null)
	//*  82  170:aload_2         
	//*  83  171:ifnonnull       182
						arraylist2 = new ArrayList();
	//   84  174:new             #22  <Class ArrayList>
	//   85  177:dup             
	//   86  178:invokespecial   #49  <Method void ArrayList()>
	//   87  181:astore_1        
					arraylist2.add(((Object) (apsvastnonlinearnode)));
	//   88  182:aload_1         
	//   89  183:aload           5
	//   90  185:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
	//   91  188:pop             
					hashmap.put("script", ((Object) (arraylist2)));
	//   92  189:aload_3         
	//   93  190:ldc1            #67  <String "script">
	//   94  192:aload_1         
	//   95  193:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   96  196:pop             
				} else
	//*  97  197:goto            28
				if(apsvastnonlinearnode.imageResource() != null)
	//*  98  200:aload           5
	//*  99  202:invokevirtual   #70  <Method String APSVASTNonLinearNode.imageResource()>
	//* 100  205:ifnull          28
				{
					ArrayList arraylist7 = (ArrayList)hashmap.get("image");
	//  101  208:aload_3         
	//  102  209:ldc1            #72  <String "image">
	//  103  211:invokevirtual   #48  <Method Object HashMap.get(Object)>
	//  104  214:checkcast       #22  <Class ArrayList>
	//  105  217:astore_2        
					ArrayList arraylist3 = arraylist7;
	//  106  218:aload_2         
	//  107  219:astore_1        
					if(arraylist7 == null)
	//* 108  220:aload_2         
	//* 109  221:ifnonnull       232
						arraylist3 = new ArrayList();
	//  110  224:new             #22  <Class ArrayList>
	//  111  227:dup             
	//  112  228:invokespecial   #49  <Method void ArrayList()>
	//  113  231:astore_1        
					arraylist3.add(((Object) (apsvastnonlinearnode)));
	//  114  232:aload_1         
	//  115  233:aload           5
	//  116  235:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
	//  117  238:pop             
					hashmap.put("image", ((Object) (arraylist3)));
	//  118  239:aload_3         
	//  119  240:ldc1            #72  <String "image">
	//  120  242:aload_1         
	//  121  243:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//  122  246:pop             
				}
			} while(true);
	//  123  247:goto            28
		}
		return hashmap;
	//  124  250:aload_3         
	//  125  251:areturn         
	}

	public ArrayList nonlinears()
	{
		return childrenNamed("NonLinear");
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <String "NonLinear">
	//    2    3:invokevirtual   #20  <Method ArrayList childrenNamed(String)>
	//    3    6:areturn         
	}
}
