// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

// Referenced classes of package com.amazonaws.regions:
//			Region

public class RegionMetadataParser
{

	public RegionMetadataParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	private static Region a(Element element, boolean flag)
	{
		Region region = new Region(a("Name", element), a("Domain", element));
	//    0    0:new             #15  <Class Region>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Name">
	//    3    6:aload_0         
	//    4    7:invokestatic    #20  <Method String a(String, Element)>
	//    5   10:ldc1            #22  <String "Domain">
	//    6   12:aload_0         
	//    7   13:invokestatic    #20  <Method String a(String, Element)>
	//    8   16:invokespecial   #25  <Method void Region(String, String)>
	//    9   19:astore_3        
		element = ((Element) (element.getElementsByTagName("Endpoint")));
	//   10   20:aload_0         
	//   11   21:ldc1            #27  <String "Endpoint">
	//   12   23:invokeinterface #33  <Method NodeList Element.getElementsByTagName(String)>
	//   13   28:astore_0        
		for(int i = 0; i < ((NodeList) (element)).getLength(); i++)
	//*  14   29:iconst_0        
	//*  15   30:istore_2        
	//*  16   31:iload_2         
	//*  17   32:aload_0         
	//*  18   33:invokeinterface #39  <Method int NodeList.getLength()>
	//*  19   38:icmpge          63
			a(region, (Element)((NodeList) (element)).item(i), flag);
	//   20   41:aload_3         
	//   21   42:aload_0         
	//   22   43:iload_2         
	//   23   44:invokeinterface #43  <Method Node NodeList.item(int)>
	//   24   49:checkcast       #29  <Class Element>
	//   25   52:iload_1         
	//   26   53:invokestatic    #46  <Method void a(Region, Element, boolean)>

	//   27   56:iload_2         
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:istore_2        
	//*  31   60:goto            31
		return region;
	//   32   63:aload_3         
	//   33   64:areturn         
	}

	private static String a(String s, Element element)
	{
		s = ((String) (element.getElementsByTagName(s).item(0)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #33  <Method NodeList Element.getElementsByTagName(String)>
	//    3    7:iconst_0        
	//    4    8:invokeinterface #43  <Method Node NodeList.item(int)>
	//    5   13:astore_0        
		if(s == null)
	//*   6   14:aload_0         
	//*   7   15:ifnonnull       20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return ((Node) (s)).getChildNodes().item(0).getNodeValue();
	//   10   20:aload_0         
	//   11   21:invokeinterface #52  <Method NodeList Node.getChildNodes()>
	//   12   26:iconst_0        
	//   13   27:invokeinterface #43  <Method Node NodeList.item(int)>
	//   14   32:invokeinterface #56  <Method String Node.getNodeValue()>
	//   15   37:areturn         
	}

	private static List a(InputStream inputstream, boolean flag)
	{
		Object obj = ((Object) (DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputstream)));
	//    0    0:invokestatic    #67  <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:invokevirtual   #71  <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #77  <Method Document DocumentBuilder.parse(InputStream)>
	//    4   10:astore_3        
		Object obj1;
		StringBuilder stringbuilder;
		try
		{
			inputstream.close();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #82  <Method void InputStream.close()>
		}
	//*   7   15:aload_3         
	//*   8   16:ldc1            #84  <String "Region">
	//*   9   18:invokeinterface #87  <Method NodeList Document.getElementsByTagName(String)>
	//*  10   23:astore_0        
	//*  11   24:new             #89  <Class ArrayList>
	//*  12   27:dup             
	//*  13   28:invokespecial   #90  <Method void ArrayList()>
	//*  14   31:astore_3        
	//*  15   32:iconst_0        
	//*  16   33:istore_2        
	//*  17   34:iload_2         
	//*  18   35:aload_0         
	//*  19   36:invokeinterface #39  <Method int NodeList.getLength()>
	//*  20   41:icmpge          87
	//*  21   44:aload_0         
	//*  22   45:iload_2         
	//*  23   46:invokeinterface #43  <Method Node NodeList.item(int)>
	//*  24   51:astore          4
	//*  25   53:aload           4
	//*  26   55:invokeinterface #94  <Method short Node.getNodeType()>
	//*  27   60:iconst_1        
	//*  28   61:icmpne          80
	//*  29   64:aload_3         
	//*  30   65:aload           4
	//*  31   67:checkcast       #29  <Class Element>
	//*  32   70:iload_1         
	//*  33   71:invokestatic    #96  <Method Region a(Element, boolean)>
	//*  34   74:invokeinterface #102 <Method boolean List.add(Object)>
	//*  35   79:pop             
	//*  36   80:iload_2         
	//*  37   81:iconst_1        
	//*  38   82:iadd            
	//*  39   83:istore_2        
	//*  40   84:goto            34
	//*  41   87:aload_3         
	//*  42   88:areturn         
	//*  43   89:astore_3        
	//*  44   90:goto            138
	//*  45   93:astore_3        
	//*  46   94:new             #104 <Class StringBuilder>
	//*  47   97:dup             
	//*  48   98:invokespecial   #105 <Method void StringBuilder()>
	//*  49  101:astore          4
	//*  50  103:aload           4
	//*  51  105:ldc1            #107 <String "Unable to parse region metadata file: ">
	//*  52  107:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//*  53  110:pop             
	//*  54  111:aload           4
	//*  55  113:aload_3         
	//*  56  114:invokevirtual   #114 <Method String Exception.getMessage()>
	//*  57  117:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//*  58  120:pop             
	//*  59  121:new             #59  <Class IOException>
	//*  60  124:dup             
	//*  61  125:aload           4
	//*  62  127:invokevirtual   #117 <Method String StringBuilder.toString()>
	//*  63  130:aload_3         
	//*  64  131:invokespecial   #120 <Method void IOException(String, Throwable)>
	//*  65  134:athrow          
	//*  66  135:astore_3        
	//*  67  136:aload_3         
	//*  68  137:athrow          
	//*  69  138:aload_0         
	//*  70  139:invokevirtual   #82  <Method void InputStream.close()>
	//*  71  142:aload_3         
	//*  72  143:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream) { }
	//   73  144:astore_0        
		inputstream = ((InputStream) (((Document) (obj)).getElementsByTagName("Region")));
		obj = ((Object) (new ArrayList()));
		for(int i = 0; i < ((NodeList) (inputstream)).getLength(); i++)
		{
			Node node = ((NodeList) (inputstream)).item(i);
			if(node.getNodeType() == 1)
				((List) (obj)).add(((Object) (a((Element)node, flag))));
		}

		return ((List) (obj));
		obj1;
		break MISSING_BLOCK_LABEL_138;
		obj1;
		stringbuilder = new StringBuilder();
		stringbuilder.append("Unable to parse region metadata file: ");
		stringbuilder.append(((Exception) (obj1)).getMessage());
		throw new IOException(stringbuilder.toString(), ((Throwable) (obj1)));
		obj1;
		throw obj1;
		try
		{
			inputstream.close();
		}
	//*  74  145:goto            15
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream) { }
	//   75  148:astore_0        
		throw obj1;
	//*  76  149:goto            142
	}

	private static void a(Region region, Element element, boolean flag)
	{
		String s1 = a("ServiceName", element);
	//    0    0:ldc1            #124 <String "ServiceName">
	//    1    2:aload_1         
	//    2    3:invokestatic    #20  <Method String a(String, Element)>
	//    3    6:astore          4
		String s = a("Hostname", element);
	//    4    8:ldc1            #126 <String "Hostname">
	//    5   10:aload_1         
	//    6   11:invokestatic    #20  <Method String a(String, Element)>
	//    7   14:astore_3        
		String s2 = a("Http", element);
	//    8   15:ldc1            #128 <String "Http">
	//    9   17:aload_1         
	//   10   18:invokestatic    #20  <Method String a(String, Element)>
	//   11   21:astore          5
		element = ((Element) (a("Https", element)));
	//   12   23:ldc1            #130 <String "Https">
	//   13   25:aload_1         
	//   14   26:invokestatic    #20  <Method String a(String, Element)>
	//   15   29:astore_1        
		if(flag && !a(s))
	//*  16   30:iload_2         
	//*  17   31:ifeq            81
	//*  18   34:aload_3         
	//*  19   35:invokestatic    #133 <Method boolean a(String)>
	//*  20   38:ifne            81
		{
			region = ((Region) (new StringBuilder()));
	//   21   41:new             #104 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #105 <Method void StringBuilder()>
	//   24   48:astore_0        
			((StringBuilder) (region)).append("Invalid service endpoint (");
	//   25   49:aload_0         
	//   26   50:ldc1            #135 <String "Invalid service endpoint (">
	//   27   52:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
			((StringBuilder) (region)).append(s);
	//   29   56:aload_0         
	//   30   57:aload_3         
	//   31   58:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
			((StringBuilder) (region)).append(") is detected.");
	//   33   62:aload_0         
	//   34   63:ldc1            #137 <String ") is detected.">
	//   35   65:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			throw new IllegalStateException(((StringBuilder) (region)).toString());
	//   37   69:new             #139 <Class IllegalStateException>
	//   38   72:dup             
	//   39   73:aload_0         
	//   40   74:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   41   77:invokespecial   #142 <Method void IllegalStateException(String)>
	//   42   80:athrow          
		} else
		{
			region.b().put(((Object) (s1)), ((Object) (s)));
	//   43   81:aload_0         
	//   44   82:invokevirtual   #146 <Method Map Region.b()>
	//   45   85:aload           4
	//   46   87:aload_3         
	//   47   88:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   48   93:pop             
			region.c().put(((Object) (s1)), ((Object) (Boolean.valueOf("true".equals(((Object) (s2)))))));
	//   49   94:aload_0         
	//   50   95:invokevirtual   #155 <Method Map Region.c()>
	//   51   98:aload           4
	//   52  100:ldc1            #157 <String "true">
	//   53  102:aload           5
	//   54  104:invokevirtual   #162 <Method boolean String.equals(Object)>
	//   55  107:invokestatic    #168 <Method Boolean Boolean.valueOf(boolean)>
	//   56  110:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   57  115:pop             
			region.d().put(((Object) (s1)), ((Object) (Boolean.valueOf("true".equals(((Object) (element)))))));
	//   58  116:aload_0         
	//   59  117:invokevirtual   #171 <Method Map Region.d()>
	//   60  120:aload           4
	//   61  122:ldc1            #157 <String "true">
	//   62  124:aload_1         
	//   63  125:invokevirtual   #162 <Method boolean String.equals(Object)>
	//   64  128:invokestatic    #168 <Method Boolean Boolean.valueOf(boolean)>
	//   65  131:invokeinterface #152 <Method Object Map.put(Object, Object)>
	//   66  136:pop             
			return;
	//   67  137:return          
		}
	}

	private static boolean a(String s)
	{
		return s.endsWith(".amazonaws.com");
	//    0    0:aload_0         
	//    1    1:ldc1            #173 <String ".amazonaws.com">
	//    2    3:invokevirtual   #176 <Method boolean String.endsWith(String)>
	//    3    6:ireturn         
	}

	public List a(InputStream inputstream)
	{
		return a(inputstream, false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #179 <Method List a(InputStream, boolean)>
	//    3    5:areturn         
	}
}
