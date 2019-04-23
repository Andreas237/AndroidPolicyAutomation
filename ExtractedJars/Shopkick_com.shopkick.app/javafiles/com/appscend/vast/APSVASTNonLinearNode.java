// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.*;

// Referenced classes of package com.appscend.vast:
//			APSVASTCreativeTypeNode, APSVASTXMLNode

public class APSVASTNonLinearNode extends APSVASTCreativeTypeNode
{

	public APSVASTNonLinearNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void APSVASTCreativeTypeNode()>
	//    2    4:return          
	}

	public String clickThrough()
	{
		ArrayList arraylist = urlsForChildrenNamed("NonLinearClickThrough");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "NonLinearClickThrough">
	//    2    3:invokevirtual   #17  <Method ArrayList urlsForChildrenNamed(String)>
	//    3    6:astore_1        
		if(arraylist != null && arraylist.size() > 0)
	//*   4    7:aload_1         
	//*   5    8:ifnull          32
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #23  <Method int ArrayList.size()>
	//*   8   15:ifle            32
			return (String)arraylist.get(arraylist.size() - 1);
	//    9   18:aload_1         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #23  <Method int ArrayList.size()>
	//   12   23:iconst_1        
	//   13   24:isub            
	//   14   25:invokevirtual   #27  <Method Object ArrayList.get(int)>
	//   15   28:checkcast       #29  <Class String>
	//   16   31:areturn         
		else
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
	}

	public ArrayList clickTrackingURLs()
	{
		return urlsForChildrenNamed("NonLinearClickTracking");
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "NonLinearClickTracking">
	//    2    3:invokevirtual   #17  <Method ArrayList urlsForChildrenNamed(String)>
	//    3    6:areturn         
	}

	public String htmlResource()
	{
		APSVASTXMLNode apsvastxmlnode1 = firstChildNamed("HTMLResource");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "HTMLResource">
	//    2    3:invokevirtual   #42  <Method APSVASTXMLNode firstChildNamed(String)>
	//    3    6:astore_2        
		APSVASTXMLNode apsvastxmlnode = apsvastxmlnode1;
	//    4    7:aload_2         
	//    5    8:astore_1        
		if(apsvastxmlnode1 == null)
	//*   6    9:aload_2         
	//*   7   10:ifnonnull       20
			apsvastxmlnode = firstChildNamed("Code");
	//    8   13:aload_0         
	//    9   14:ldc1            #43  <String "Code">
	//   10   16:invokevirtual   #42  <Method APSVASTXMLNode firstChildNamed(String)>
	//   11   19:astore_1        
		if(apsvastxmlnode != null)
	//*  12   20:aload_1         
	//*  13   21:ifnull          29
			return apsvastxmlnode.value;
	//   14   24:aload_1         
	//   15   25:getfield        #49  <Field String APSVASTXMLNode.value>
	//   16   28:areturn         
		else
			return null;
	//   17   29:aconst_null     
	//   18   30:areturn         
	}

	public String iframeResource()
	{
		ArrayList arraylist1 = urlsForChildrenNamed("IFrameResource");
	//    0    0:aload_0         
	//    1    1:ldc1            #52  <String "IFrameResource">
	//    2    3:invokevirtual   #17  <Method ArrayList urlsForChildrenNamed(String)>
	//    3    6:astore_2        
		ArrayList arraylist = arraylist1;
	//    4    7:aload_2         
	//    5    8:astore_1        
		if(arraylist1 == null)
	//*   6    9:aload_2         
	//*   7   10:ifnonnull       54
		{
			arraylist = arraylist1;
	//    8   13:aload_2         
	//    9   14:astore_1        
			if(attributes.get("resourceType") != null)
	//*  10   15:aload_0         
	//*  11   16:getfield        #56  <Field HashMap attributes>
	//*  12   19:ldc1            #58  <String "resourceType">
	//*  13   21:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  14   24:ifnull          54
			{
				arraylist = arraylist1;
	//   15   27:aload_2         
	//   16   28:astore_1        
				if(((String)attributes.get("resourceType")).equals("iframe"))
	//*  17   29:aload_0         
	//*  18   30:getfield        #56  <Field HashMap attributes>
	//*  19   33:ldc1            #58  <String "resourceType">
	//*  20   35:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  21   38:checkcast       #29  <Class String>
	//*  22   41:ldc1            #65  <String "iframe">
	//*  23   43:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  24   46:ifeq            54
					arraylist = urlsForCurrentNode();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #72  <Method ArrayList urlsForCurrentNode()>
	//   27   53:astore_1        
			}
		}
		if(arraylist != null && arraylist.size() > 0)
	//*  28   54:aload_1         
	//*  29   55:ifnull          74
	//*  30   58:aload_1         
	//*  31   59:invokevirtual   #23  <Method int ArrayList.size()>
	//*  32   62:ifle            74
			return (String)arraylist.get(0);
	//   33   65:aload_1         
	//   34   66:iconst_0        
	//   35   67:invokevirtual   #27  <Method Object ArrayList.get(int)>
	//   36   70:checkcast       #29  <Class String>
	//   37   73:areturn         
		else
			return null;
	//   38   74:aconst_null     
	//   39   75:areturn         
	}

	public String imageResource()
	{
		ArrayList arraylist = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			"image/jpeg", "image/png", "image/jpg", "image/gif"
		}))))));
	//    0    0:new             #19  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #75  <String "image/jpeg">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #77  <String "image/png">
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #79  <String "image/jpg">
	//   15   22:aastore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:ldc1            #81  <String "image/gif">
	//   19   27:aastore         
	//   20   28:invokestatic    #87  <Method java.util.List Arrays.asList(Object[])>
	//   21   31:invokespecial   #90  <Method void ArrayList(java.util.Collection)>
	//   22   34:astore_1        
		APSVASTXMLNode apsvastxmlnode = firstChildNamed("StaticResource");
	//   23   35:aload_0         
	//   24   36:ldc1            #92  <String "StaticResource">
	//   25   38:invokevirtual   #42  <Method APSVASTXMLNode firstChildNamed(String)>
	//   26   41:astore_2        
		if(apsvastxmlnode != null && arraylist.contains(apsvastxmlnode.attributes.get("creativeType")))
	//*  27   42:aload_2         
	//*  28   43:ifnull          70
	//*  29   46:aload_1         
	//*  30   47:aload_2         
	//*  31   48:getfield        #93  <Field HashMap APSVASTXMLNode.attributes>
	//*  32   51:ldc1            #95  <String "creativeType">
	//*  33   53:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  34   56:invokevirtual   #98  <Method boolean ArrayList.contains(Object)>
	//*  35   59:ifeq            70
			arraylist = apsvastxmlnode.urlsForCurrentNode();
	//   36   62:aload_2         
	//   37   63:invokevirtual   #99  <Method ArrayList APSVASTXMLNode.urlsForCurrentNode()>
	//   38   66:astore_1        
		else
	//*  39   67:goto            140
		if(attributes.get("resourceType") != null && ((String)attributes.get("resourceType")).equals("static") && attributes.get("creativeType") != null && arraylist.contains(attributes.get("creativeType")))
	//*  40   70:aload_0         
	//*  41   71:getfield        #56  <Field HashMap attributes>
	//*  42   74:ldc1            #58  <String "resourceType">
	//*  43   76:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  44   79:ifnull          138
	//*  45   82:aload_0         
	//*  46   83:getfield        #56  <Field HashMap attributes>
	//*  47   86:ldc1            #58  <String "resourceType">
	//*  48   88:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  49   91:checkcast       #29  <Class String>
	//*  50   94:ldc1            #101 <String "static">
	//*  51   96:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  52   99:ifeq            138
	//*  53  102:aload_0         
	//*  54  103:getfield        #56  <Field HashMap attributes>
	//*  55  106:ldc1            #95  <String "creativeType">
	//*  56  108:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  57  111:ifnull          138
	//*  58  114:aload_1         
	//*  59  115:aload_0         
	//*  60  116:getfield        #56  <Field HashMap attributes>
	//*  61  119:ldc1            #95  <String "creativeType">
	//*  62  121:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  63  124:invokevirtual   #98  <Method boolean ArrayList.contains(Object)>
	//*  64  127:ifeq            138
			arraylist = urlsForCurrentNode();
	//   65  130:aload_0         
	//   66  131:invokevirtual   #72  <Method ArrayList urlsForCurrentNode()>
	//   67  134:astore_1        
		else
	//*  68  135:goto            140
			arraylist = null;
	//   69  138:aconst_null     
	//   70  139:astore_1        
		if(arraylist != null && arraylist.size() > 0)
	//*  71  140:aload_1         
	//*  72  141:ifnull          160
	//*  73  144:aload_1         
	//*  74  145:invokevirtual   #23  <Method int ArrayList.size()>
	//*  75  148:ifle            160
			return (String)arraylist.get(0);
	//   76  151:aload_1         
	//   77  152:iconst_0        
	//   78  153:invokevirtual   #27  <Method Object ArrayList.get(int)>
	//   79  156:checkcast       #29  <Class String>
	//   80  159:areturn         
		else
			return null;
	//   81  160:aconst_null     
	//   82  161:areturn         
	}

	public String scriptResource()
	{
		ArrayList arraylist = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			"application/x-javascript", "application/javascript"
		}))))));
	//    0    0:new             #19  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #104 <String "application/x-javascript">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #106 <String "application/javascript">
	//   11   17:aastore         
	//   12   18:invokestatic    #87  <Method java.util.List Arrays.asList(Object[])>
	//   13   21:invokespecial   #90  <Method void ArrayList(java.util.Collection)>
	//   14   24:astore_1        
		APSVASTXMLNode apsvastxmlnode = firstChildNamed("StaticResource");
	//   15   25:aload_0         
	//   16   26:ldc1            #92  <String "StaticResource">
	//   17   28:invokevirtual   #42  <Method APSVASTXMLNode firstChildNamed(String)>
	//   18   31:astore_2        
		if(apsvastxmlnode != null && apsvastxmlnode.attributes.get("creativeType") != null && arraylist.contains(apsvastxmlnode.attributes.get("creativeType")))
	//*  19   32:aload_2         
	//*  20   33:ifnull          72
	//*  21   36:aload_2         
	//*  22   37:getfield        #93  <Field HashMap APSVASTXMLNode.attributes>
	//*  23   40:ldc1            #95  <String "creativeType">
	//*  24   42:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  25   45:ifnull          72
	//*  26   48:aload_1         
	//*  27   49:aload_2         
	//*  28   50:getfield        #93  <Field HashMap APSVASTXMLNode.attributes>
	//*  29   53:ldc1            #95  <String "creativeType">
	//*  30   55:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  31   58:invokevirtual   #98  <Method boolean ArrayList.contains(Object)>
	//*  32   61:ifeq            72
			arraylist = apsvastxmlnode.urlsForCurrentNode();
	//   33   64:aload_2         
	//   34   65:invokevirtual   #99  <Method ArrayList APSVASTXMLNode.urlsForCurrentNode()>
	//   35   68:astore_1        
		else
	//*  36   69:goto            114
		if(attributes.get("resourceType") != null && ((String)attributes.get("resourceType")).equals("script"))
	//*  37   72:aload_0         
	//*  38   73:getfield        #56  <Field HashMap attributes>
	//*  39   76:ldc1            #58  <String "resourceType">
	//*  40   78:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  41   81:ifnull          112
	//*  42   84:aload_0         
	//*  43   85:getfield        #56  <Field HashMap attributes>
	//*  44   88:ldc1            #58  <String "resourceType">
	//*  45   90:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//*  46   93:checkcast       #29  <Class String>
	//*  47   96:ldc1            #108 <String "script">
	//*  48   98:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  49  101:ifeq            112
			arraylist = urlsForCurrentNode();
	//   50  104:aload_0         
	//   51  105:invokevirtual   #72  <Method ArrayList urlsForCurrentNode()>
	//   52  108:astore_1        
		else
	//*  53  109:goto            114
			arraylist = null;
	//   54  112:aconst_null     
	//   55  113:astore_1        
		if(arraylist != null && arraylist.size() > 0)
	//*  56  114:aload_1         
	//*  57  115:ifnull          134
	//*  58  118:aload_1         
	//*  59  119:invokevirtual   #23  <Method int ArrayList.size()>
	//*  60  122:ifle            134
			return (String)arraylist.get(0);
	//   61  125:aload_1         
	//   62  126:iconst_0        
	//   63  127:invokevirtual   #27  <Method Object ArrayList.get(int)>
	//   64  130:checkcast       #29  <Class String>
	//   65  133:areturn         
		else
			return null;
	//   66  134:aconst_null     
	//   67  135:areturn         
	}
}
