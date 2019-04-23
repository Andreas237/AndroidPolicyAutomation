// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.*;

// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode

public class APSVASTCreativeTypeNode extends APSVASTXMLNode
{

	public APSVASTCreativeTypeNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public void mergeWith(APSVASTCreativeTypeNode apsvastcreativetypenode)
	{
		((APSVASTXMLNode)getOrCreateNodeWithName("TrackingEvents")).addChildrenWithName(apsvastcreativetypenode.trackingEvents(), "Tracking");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "TrackingEvents">
	//    2    3:invokevirtual   #17  <Method Object getOrCreateNodeWithName(String)>
	//    3    6:checkcast       #4   <Class APSVASTXMLNode>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #21  <Method ArrayList trackingEvents()>
	//    6   13:ldc1            #23  <String "Tracking">
	//    7   15:invokevirtual   #27  <Method void APSVASTXMLNode.addChildrenWithName(ArrayList, String)>
	//    8   18:return          
	}

	public ArrayList trackingEvents()
	{
		if(firstChildNamed("TrackingEvents") != null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #13  <String "TrackingEvents">
	//*   2    3:invokevirtual   #31  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   3    6:ifnull          21
			return firstChildNamed("TrackingEvents").childrenNamed("Tracking");
	//    4    9:aload_0         
	//    5   10:ldc1            #13  <String "TrackingEvents">
	//    6   12:invokevirtual   #31  <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   15:ldc1            #23  <String "Tracking">
	//    8   17:invokevirtual   #35  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//    9   20:areturn         
		else
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
	}

	public HashMap trackingURLsByType()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #41  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void HashMap()>
	//    3    7:astore_3        
		if(firstChildNamed("TrackingEvents") != null && firstChildNamed("TrackingEvents").childrenNamed("Tracking") != null)
	//*   4    8:aload_0         
	//*   5    9:ldc1            #13  <String "TrackingEvents">
	//*   6   11:invokevirtual   #31  <Method APSVASTXMLNode firstChildNamed(String)>
	//*   7   14:ifnull          181
	//*   8   17:aload_0         
	//*   9   18:ldc1            #13  <String "TrackingEvents">
	//*  10   20:invokevirtual   #31  <Method APSVASTXMLNode firstChildNamed(String)>
	//*  11   23:ldc1            #23  <String "Tracking">
	//*  12   25:invokevirtual   #35  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//*  13   28:ifnull          181
		{
			Iterator iterator = firstChildNamed("TrackingEvents").childrenNamed("Tracking").iterator();
	//   14   31:aload_0         
	//   15   32:ldc1            #13  <String "TrackingEvents">
	//   16   34:invokevirtual   #31  <Method APSVASTXMLNode firstChildNamed(String)>
	//   17   37:ldc1            #23  <String "Tracking">
	//   18   39:invokevirtual   #35  <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//   19   42:invokevirtual   #48  <Method Iterator ArrayList.iterator()>
	//   20   45:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//   21   47:aload           4
	//   22   49:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   23   54:ifeq            181
				APSVASTXMLNode apsvastxmlnode = (APSVASTXMLNode)iterator.next();
	//   24   57:aload           4
	//   25   59:invokeinterface #58  <Method Object Iterator.next()>
	//   26   64:checkcast       #4   <Class APSVASTXMLNode>
	//   27   67:astore          5
				Object obj = ((Object) ((String)apsvastxmlnode.attributes.get("event")));
	//   28   69:aload           5
	//   29   71:getfield        #62  <Field HashMap APSVASTXMLNode.attributes>
	//   30   74:ldc1            #64  <String "event">
	//   31   76:invokevirtual   #68  <Method Object HashMap.get(Object)>
	//   32   79:checkcast       #70  <Class String>
	//   33   82:astore_2        
				if(obj != null)
	//*  34   83:aload_2         
	//*  35   84:ifnull          47
				{
					String s = ((String) (obj));
	//   36   87:aload_2         
	//   37   88:astore_1        
					if(((String) (obj)).equals("progress"))
	//*  38   89:aload_2         
	//*  39   90:ldc1            #72  <String "progress">
	//*  40   92:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  41   95:ifeq            112
						s = (String)apsvastxmlnode.attributes.get("offset");
	//   42   98:aload           5
	//   43  100:getfield        #62  <Field HashMap APSVASTXMLNode.attributes>
	//   44  103:ldc1            #78  <String "offset">
	//   45  105:invokevirtual   #68  <Method Object HashMap.get(Object)>
	//   46  108:checkcast       #70  <Class String>
	//   47  111:astore_1        
					if(hashmap.get(((Object) (s))) == null)
	//*  48  112:aload_3         
	//*  49  113:aload_1         
	//*  50  114:invokevirtual   #68  <Method Object HashMap.get(Object)>
	//*  51  117:ifnonnull       131
						obj = ((Object) (new HashSet()));
	//   52  120:new             #80  <Class HashSet>
	//   53  123:dup             
	//   54  124:invokespecial   #81  <Method void HashSet()>
	//   55  127:astore_2        
					else
	//*  56  128:goto            147
						obj = ((Object) (new HashSet((Collection)hashmap.get(((Object) (s))))));
	//   57  131:new             #80  <Class HashSet>
	//   58  134:dup             
	//   59  135:aload_3         
	//   60  136:aload_1         
	//   61  137:invokevirtual   #68  <Method Object HashMap.get(Object)>
	//   62  140:checkcast       #83  <Class Collection>
	//   63  143:invokespecial   #86  <Method void HashSet(Collection)>
	//   64  146:astore_2        
					((HashSet) (obj)).addAll(((Collection) (apsvastxmlnode.urlsForCurrentNode())));
	//   65  147:aload_2         
	//   66  148:aload           5
	//   67  150:invokevirtual   #89  <Method ArrayList APSVASTXMLNode.urlsForCurrentNode()>
	//   68  153:invokevirtual   #93  <Method boolean HashSet.addAll(Collection)>
	//   69  156:pop             
					if(((HashSet) (obj)).size() > 0)
	//*  70  157:aload_2         
	//*  71  158:invokevirtual   #97  <Method int HashSet.size()>
	//*  72  161:ifle            47
						hashmap.put(((Object) (s)), ((Object) (new ArrayList(((Collection) (obj))))));
	//   73  164:aload_3         
	//   74  165:aload_1         
	//   75  166:new             #44  <Class ArrayList>
	//   76  169:dup             
	//   77  170:aload_2         
	//   78  171:invokespecial   #98  <Method void ArrayList(Collection)>
	//   79  174:invokevirtual   #102 <Method Object HashMap.put(Object, Object)>
	//   80  177:pop             
				}
			} while(true);
	//   81  178:goto            47
		}
		return hashmap;
	//   82  181:aload_3         
	//   83  182:areturn         
	}
}
