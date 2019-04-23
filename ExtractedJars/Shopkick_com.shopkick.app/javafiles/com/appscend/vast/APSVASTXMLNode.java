// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jdom2.Attribute;
import org.jdom2.Element;

public class APSVASTXMLNode
{

	public APSVASTXMLNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		_children = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field HashMap _children>
		attributes = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #17  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void HashMap()>
	//   11   23:putfield        #22  <Field HashMap attributes>
	//   12   26:return          
	}

	public static int durationFromString(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		if(Pattern.compile("[0-9][0-9]:[0-9][0-9]:[0-9][0-9]").matcher(((CharSequence) (s))).matches())
	//*   4    6:ldc1            #27  <String "[0-9][0-9]:[0-9][0-9]:[0-9][0-9]">
	//*   5    8:invokestatic    #33  <Method Pattern Pattern.compile(String)>
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #37  <Method Matcher Pattern.matcher(CharSequence)>
	//*   8   15:invokevirtual   #43  <Method boolean Matcher.matches()>
	//*   9   18:ifeq            56
		{
			s = ((String) (s.split(":")));
	//   10   21:aload_0         
	//   11   22:ldc1            #45  <String ":">
	//   12   24:invokevirtual   #51  <Method String[] String.split(String)>
	//   13   27:astore_0        
			return Integer.parseInt(((String) (s[0]))) * 3600 + Integer.parseInt(((String) (s[1]))) * 60 + Integer.parseInt(((String) (s[2])));
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:aaload          
	//   17   31:invokestatic    #56  <Method int Integer.parseInt(String)>
	//   18   34:sipush          3600
	//   19   37:imul            
	//   20   38:aload_0         
	//   21   39:iconst_1        
	//   22   40:aaload          
	//   23   41:invokestatic    #56  <Method int Integer.parseInt(String)>
	//   24   44:bipush          60
	//   25   46:imul            
	//   26   47:iadd            
	//   27   48:aload_0         
	//   28   49:iconst_2        
	//   29   50:aaload          
	//   30   51:invokestatic    #56  <Method int Integer.parseInt(String)>
	//   31   54:iadd            
	//   32   55:ireturn         
		}
		if(Pattern.compile("[0-9]:[0-9][0-9]:[0-9][0-9]").matcher(((CharSequence) (s))).matches())
	//*  33   56:ldc1            #58  <String "[0-9]:[0-9][0-9]:[0-9][0-9]">
	//*  34   58:invokestatic    #33  <Method Pattern Pattern.compile(String)>
	//*  35   61:aload_0         
	//*  36   62:invokevirtual   #37  <Method Matcher Pattern.matcher(CharSequence)>
	//*  37   65:invokevirtual   #43  <Method boolean Matcher.matches()>
	//*  38   68:ifeq            106
		{
			s = ((String) (s.split(":")));
	//   39   71:aload_0         
	//   40   72:ldc1            #45  <String ":">
	//   41   74:invokevirtual   #51  <Method String[] String.split(String)>
	//   42   77:astore_0        
			return Integer.parseInt(((String) (s[0]))) * 3600 + Integer.parseInt(((String) (s[1]))) * 60 + Integer.parseInt(((String) (s[2])));
	//   43   78:aload_0         
	//   44   79:iconst_0        
	//   45   80:aaload          
	//   46   81:invokestatic    #56  <Method int Integer.parseInt(String)>
	//   47   84:sipush          3600
	//   48   87:imul            
	//   49   88:aload_0         
	//   50   89:iconst_1        
	//   51   90:aaload          
	//   52   91:invokestatic    #56  <Method int Integer.parseInt(String)>
	//   53   94:bipush          60
	//   54   96:imul            
	//   55   97:iadd            
	//   56   98:aload_0         
	//   57   99:iconst_2        
	//   58  100:aaload          
	//   59  101:invokestatic    #56  <Method int Integer.parseInt(String)>
	//   60  104:iadd            
	//   61  105:ireturn         
		} else
		{
			return -1;
	//   62  106:iconst_m1       
	//   63  107:ireturn         
		}
	}

	public ArrayList _childrenNamed(String s)
	{
		ArrayList arraylist1 = (ArrayList)_children.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap _children>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #66  <Class ArrayList>
	//    5   11:astore_3        
		ArrayList arraylist = arraylist1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(arraylist1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       36
		{
			arraylist = new ArrayList();
	//   10   18:new             #66  <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #67  <Method void ArrayList()>
	//   13   25:astore_2        
			_children.put(((Object) (s)), ((Object) (arraylist)));
	//   14   26:aload_0         
	//   15   27:getfield        #20  <Field HashMap _children>
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #71  <Method Object HashMap.put(Object, Object)>
	//   19   35:pop             
		}
		return arraylist;
	//   20   36:aload_2         
	//   21   37:areturn         
	}

	public void addChildWithName(Object obj, String s)
	{
		if(obj != null && s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_2         
	//*   3    5:ifnull          18
			_childrenNamed(s).add(obj);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #77  <Method ArrayList _childrenNamed(String)>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void addChildrenWithName(ArrayList arraylist, String s)
	{
		if(arraylist != null && s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_2         
	//*   3    5:ifnull          18
			_childrenNamed(s).addAll(((java.util.Collection) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #77  <Method ArrayList _childrenNamed(String)>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #87  <Method boolean ArrayList.addAll(java.util.Collection)>
	//    9   17:pop             
	//   10   18:return          
	}

	public ArrayList childrenNamed(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			return _childrenNamed(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #77  <Method ArrayList _childrenNamed(String)>
	//    5    9:areturn         
		else
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
	}

	public ArrayList childrenNames()
	{
		return new ArrayList(((java.util.Collection) (_children.keySet())));
	//    0    0:new             #66  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field HashMap _children>
	//    4    8:invokevirtual   #95  <Method java.util.Set HashMap.keySet()>
	//    5   11:invokespecial   #98  <Method void ArrayList(java.util.Collection)>
	//    6   14:areturn         
	}

	public int duration()
	{
		return durationFromString(value);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String value>
	//    2    4:invokestatic    #105 <Method int durationFromString(String)>
	//    3    7:ireturn         
	}

	public int durationFromAttributeNamed(String s)
	{
		return durationFromString((String)attributes.get(((Object) (s))));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field HashMap attributes>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #47  <Class String>
	//    5   11:invokestatic    #105 <Method int durationFromString(String)>
	//    6   14:ireturn         
	}

	public APSVASTXMLNode firstChildNamed(String s)
	{
		s = ((String) (childrenNamed(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method ArrayList childrenNamed(String)>
	//    3    5:astore_1        
		if(s != null && ((ArrayList) (s)).size() > 0)
	//*   4    6:aload_1         
	//*   5    7:ifnull          26
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #113 <Method int ArrayList.size()>
	//*   8   14:ifle            26
			return (APSVASTXMLNode)((ArrayList) (s)).get(0);
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #116 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #2   <Class APSVASTXMLNode>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public Object getIfExistsNodeWithName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		APSVASTXMLNode apsvastxmlnode = firstChildNamed(s);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #122 <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   11:astore_2        
		if(apsvastxmlnode != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          87
		{
			Object obj;
			try
			{
				obj = ((Object) (new StringBuilder()));
	//   10   16:new             #124 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #125 <Method void StringBuilder()>
	//   13   23:astore_3        
				((StringBuilder) (obj)).append("com.appscend.vast.APSVAST");
	//   14   24:aload_3         
	//   15   25:ldc1            #127 <String "com.appscend.vast.APSVAST">
	//   16   27:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
				((StringBuilder) (obj)).append(s);
	//   18   31:aload_3         
	//   19   32:aload_1         
	//   20   33:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   21   36:pop             
				((StringBuilder) (obj)).append("Node");
	//   22   37:aload_3         
	//   23   38:ldc1            #133 <String "Node">
	//   24   40:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   25   43:pop             
				s = ((String) (Class.forName(((StringBuilder) (obj)).toString())));
	//   26   44:aload_3         
	//   27   45:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   28   48:invokestatic    #143 <Method Class Class.forName(String)>
	//   29   51:astore_1        
				obj = ((Class) (s)).newInstance();
	//   30   52:aload_1         
	//   31   53:invokevirtual   #147 <Method Object Class.newInstance()>
	//   32   56:astore_3        
				((Class) (s)).getMethod("initWithNode", new Class[] {
					com/appscend/vast/APSVASTXMLNode
				}).invoke(obj, new Object[] {
					apsvastxmlnode
				});
	//   33   57:aload_1         
	//   34   58:ldc1            #149 <String "initWithNode">
	//   35   60:iconst_1        
	//   36   61:anewarray       Class[]
	//   37   64:dup             
	//   38   65:iconst_0        
	//   39   66:ldc1            #2   <Class APSVASTXMLNode>
	//   40   68:aastore         
	//   41   69:invokevirtual   #153 <Method Method Class.getMethod(String, Class[])>
	//   42   72:aload_3         
	//   43   73:iconst_1        
	//   44   74:anewarray       Object[]
	//   45   77:dup             
	//   46   78:iconst_0        
	//   47   79:aload_2         
	//   48   80:aastore         
	//   49   81:invokevirtual   #159 <Method Object Method.invoke(Object, Object[])>
	//   50   84:pop             
			}
	//*  51   85:aload_3         
	//*  52   86:areturn         
	//*  53   87:aconst_null     
	//*  54   88:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  55   89:astore_1        
			{
				return ((Object) (apsvastxmlnode));
	//   56   90:aload_2         
	//   57   91:areturn         
			}
			return obj;
		} else
		{
			return ((Object) (null));
		}
	}

	public Object getOrCreateNodeWithName(String s)
	{
		Exception exception;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		APSVASTXMLNode apsvastxmlnode = firstChildNamed(s);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #122 <Method APSVASTXMLNode firstChildNamed(String)>
	//    7   11:astore_3        
		Object obj = ((Object) (apsvastxmlnode));
	//    8   12:aload_3         
	//    9   13:astore_2        
		if(apsvastxmlnode == null)
	//*  10   14:aload_3         
	//*  11   15:ifnonnull       74
		{
			try
			{
				obj = ((Object) (new StringBuilder()));
	//   12   18:new             #124 <Class StringBuilder>
	//   13   21:dup             
	//   14   22:invokespecial   #125 <Method void StringBuilder()>
	//   15   25:astore_2        
				((StringBuilder) (obj)).append("com.appscend.vast.APSVAST");
	//   16   26:aload_2         
	//   17   27:ldc1            #127 <String "com.appscend.vast.APSVAST">
	//   18   29:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   19   32:pop             
				((StringBuilder) (obj)).append(s);
	//   20   33:aload_2         
	//   21   34:aload_1         
	//   22   35:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   23   38:pop             
				((StringBuilder) (obj)).append("Node");
	//   24   39:aload_2         
	//   25   40:ldc1            #133 <String "Node">
	//   26   42:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   27   45:pop             
				obj = Class.forName(((StringBuilder) (obj)).toString()).newInstance();
	//   28   46:aload_2         
	//   29   47:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   30   50:invokestatic    #143 <Method Class Class.forName(String)>
	//   31   53:invokevirtual   #147 <Method Object Class.newInstance()>
	//   32   56:astore_2        
			}
	//*  33   57:goto            68
	//*  34   60:new             #2   <Class APSVASTXMLNode>
	//*  35   63:dup             
	//*  36   64:invokespecial   #161 <Method void APSVASTXMLNode()>
	//*  37   67:astore_2        
	//*  38   68:aload_0         
	//*  39   69:aload_2         
	//*  40   70:aload_1         
	//*  41   71:invokevirtual   #163 <Method void addChildWithName(Object, String)>
	//*  42   74:aload_2         
	//*  43   75:areturn         
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				obj = ((Object) (new APSVASTXMLNode()));
			}
			addChildWithName(obj, s);
		}
		return obj;
	//*  44   76:astore_2        
	//*  45   77:goto            60
	}

	public void initWithNode(APSVASTXMLNode apsvastxmlnode)
	{
		if(apsvastxmlnode == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		value = apsvastxmlnode.value;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #103 <Field String value>
	//    6   10:putfield        #103 <Field String value>
		attributes = apsvastxmlnode.attributes;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #22  <Field HashMap attributes>
	//   10   18:putfield        #22  <Field HashMap attributes>
		String s;
		for(Iterator iterator = apsvastxmlnode.childrenNames().iterator(); iterator.hasNext(); _children.put(((Object) (s)), ((Object) (apsvastxmlnode.childrenNamed(s)))))
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #166 <Method ArrayList childrenNames()>
	//*  13   25:invokevirtual   #170 <Method Iterator ArrayList.iterator()>
	//*  14   28:astore_2        
	//*  15   29:aload_2         
	//*  16   30:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//*  17   35:ifeq            65
			s = (String)iterator.next();
	//   18   38:aload_2         
	//   19   39:invokeinterface #178 <Method Object Iterator.next()>
	//   20   44:checkcast       #47  <Class String>
	//   21   47:astore_3        

	//   22   48:aload_0         
	//   23   49:getfield        #20  <Field HashMap _children>
	//   24   52:aload_3         
	//   25   53:aload_1         
	//   26   54:aload_3         
	//   27   55:invokevirtual   #110 <Method ArrayList childrenNamed(String)>
	//   28   58:invokevirtual   #71  <Method Object HashMap.put(Object, Object)>
	//   29   61:pop             
	//*  30   62:goto            29
	//   31   65:return          
	}

	public void initWithTBXMLElement(Element element)
	{
		if(element == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		value = element.getValue();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #185 <Method String Element.getValue()>
	//    6   10:putfield        #103 <Field String value>
		Attribute attribute;
		for(Iterator iterator = element.getAttributes().iterator(); iterator.hasNext(); attributes.put(((Object) (attribute.getName())), ((Object) (attribute.getValue()))))
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #189 <Method List Element.getAttributes()>
	//*   9   17:invokeinterface #192 <Method Iterator List.iterator()>
	//*  10   22:astore_2        
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            61
			attribute = (Attribute)iterator.next();
	//   14   32:aload_2         
	//   15   33:invokeinterface #178 <Method Object Iterator.next()>
	//   16   38:checkcast       #194 <Class Attribute>
	//   17   41:astore_3        

	//   18   42:aload_0         
	//   19   43:getfield        #22  <Field HashMap attributes>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #197 <Method String Attribute.getName()>
	//   22   50:aload_3         
	//   23   51:invokevirtual   #198 <Method String Attribute.getValue()>
	//   24   54:invokevirtual   #71  <Method Object HashMap.put(Object, Object)>
	//   25   57:pop             
	//*  26   58:goto            23
		Element element1;
		for(Iterator iterator1 = element.getChildren().iterator(); iterator1.hasNext(); addChildWithName(((Object) (element)), element1.getName()))
	//*  27   61:aload_1         
	//*  28   62:invokevirtual   #201 <Method List Element.getChildren()>
	//*  29   65:invokeinterface #192 <Method Iterator List.iterator()>
	//*  30   70:astore_2        
	//*  31   71:aload_2         
	//*  32   72:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//*  33   77:ifeq            163
		{
			element1 = (Element)iterator1.next();
	//   34   80:aload_2         
	//   35   81:invokeinterface #178 <Method Object Iterator.next()>
	//   36   86:checkcast       #182 <Class Element>
	//   37   89:astore_3        
			try
			{
				element = ((Element) (new StringBuilder()));
	//   38   90:new             #124 <Class StringBuilder>
	//   39   93:dup             
	//   40   94:invokespecial   #125 <Method void StringBuilder()>
	//   41   97:astore_1        
				((StringBuilder) (element)).append("com.appscend.vast.APSVAST");
	//   42   98:aload_1         
	//   43   99:ldc1            #127 <String "com.appscend.vast.APSVAST">
	//   44  101:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   45  104:pop             
				((StringBuilder) (element)).append(element1.getName());
	//   46  105:aload_1         
	//   47  106:aload_3         
	//   48  107:invokevirtual   #202 <Method String Element.getName()>
	//   49  110:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   50  113:pop             
				((StringBuilder) (element)).append("Node");
	//   51  114:aload_1         
	//   52  115:ldc1            #133 <String "Node">
	//   53  117:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   54  120:pop             
				element = ((Element) ((APSVASTXMLNode)Class.forName(((StringBuilder) (element)).toString()).newInstance()));
	//   55  121:aload_1         
	//   56  122:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   57  125:invokestatic    #143 <Method Class Class.forName(String)>
	//   58  128:invokevirtual   #147 <Method Object Class.newInstance()>
	//   59  131:checkcast       #2   <Class APSVASTXMLNode>
	//   60  134:astore_1        
			}
	//*  61  135:goto            146
	//*  62  138:new             #2   <Class APSVASTXMLNode>
	//*  63  141:dup             
	//*  64  142:invokespecial   #161 <Method void APSVASTXMLNode()>
	//*  65  145:astore_1        
	//*  66  146:aload_1         
	//*  67  147:aload_3         
	//*  68  148:invokevirtual   #204 <Method void initWithTBXMLElement(Element)>
	//*  69  151:aload_0         
	//*  70  152:aload_1         
	//*  71  153:aload_3         
	//*  72  154:invokevirtual   #202 <Method String Element.getName()>
	//*  73  157:invokevirtual   #163 <Method void addChildWithName(Object, String)>
	//*  74  160:goto            71
	//*  75  163:return          
			// Misplaced declaration of an exception variable
			catch(Element element)
			{
				element = ((Element) (new APSVASTXMLNode()));
			}
			((APSVASTXMLNode) (element)).initWithTBXMLElement(element1);
		}

	//*  76  164:astore_1        
	//*  77  165:goto            138
	}

	public void logWithLevel(int i)
	{
		String s = "";
	//    0    0:ldc1            #208 <String "">
	//    1    2:astore_3        
		for(int j = 0; j < i; j++)
	//*   2    3:iconst_0        
	//*   3    4:istore_2        
	//*   4    5:iload_2         
	//*   5    6:iload_1         
	//*   6    7:icmpge          47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   10:new             #124 <Class StringBuilder>
	//    8   13:dup             
	//    9   14:invokespecial   #125 <Method void StringBuilder()>
	//   10   17:astore          4
			stringbuilder.append(s);
	//   11   19:aload           4
	//   12   21:aload_3         
	//   13   22:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append("-");
	//   15   26:aload           4
	//   16   28:ldc1            #210 <String "-">
	//   17   30:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			s = stringbuilder.toString();
	//   19   34:aload           4
	//   20   36:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   21   39:astore_3        
		}

	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_2        
	//*  26   44:goto            5
		Object obj = ((Object) (new StringBuilder()));
	//   27   47:new             #124 <Class StringBuilder>
	//   28   50:dup             
	//   29   51:invokespecial   #125 <Method void StringBuilder()>
	//   30   54:astore          4
		((StringBuilder) (obj)).append(s);
	//   31   56:aload           4
	//   32   58:aload_3         
	//   33   59:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		((StringBuilder) (obj)).append("Attributes: ");
	//   35   63:aload           4
	//   36   65:ldc1            #212 <String "Attributes: ">
	//   37   67:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   38   70:pop             
		((StringBuilder) (obj)).append(((Object) (attributes.entrySet())));
	//   39   71:aload           4
	//   40   73:aload_0         
	//   41   74:getfield        #22  <Field HashMap attributes>
	//   42   77:invokevirtual   #215 <Method java.util.Set HashMap.entrySet()>
	//   43   80:invokevirtual   #218 <Method StringBuilder StringBuilder.append(Object)>
	//   44   83:pop             
		Log.d("VAST", ((StringBuilder) (obj)).toString());
	//   45   84:ldc1            #220 <String "VAST">
	//   46   86:aload           4
	//   47   88:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   48   91:invokestatic    #226 <Method int Log.d(String, String)>
	//   49   94:pop             
		obj = ((Object) (new StringBuilder()));
	//   50   95:new             #124 <Class StringBuilder>
	//   51   98:dup             
	//   52   99:invokespecial   #125 <Method void StringBuilder()>
	//   53  102:astore          4
		((StringBuilder) (obj)).append(s);
	//   54  104:aload           4
	//   55  106:aload_3         
	//   56  107:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   57  110:pop             
		((StringBuilder) (obj)).append("Value: ");
	//   58  111:aload           4
	//   59  113:ldc1            #228 <String "Value: ">
	//   60  115:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   61  118:pop             
		((StringBuilder) (obj)).append(value);
	//   62  119:aload           4
	//   63  121:aload_0         
	//   64  122:getfield        #103 <Field String value>
	//   65  125:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   66  128:pop             
		Log.d("VAST", ((StringBuilder) (obj)).toString());
	//   67  129:ldc1            #220 <String "VAST">
	//   68  131:aload           4
	//   69  133:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   70  136:invokestatic    #226 <Method int Log.d(String, String)>
	//   71  139:pop             
		obj = ((Object) (new StringBuilder()));
	//   72  140:new             #124 <Class StringBuilder>
	//   73  143:dup             
	//   74  144:invokespecial   #125 <Method void StringBuilder()>
	//   75  147:astore          4
		((StringBuilder) (obj)).append(s);
	//   76  149:aload           4
	//   77  151:aload_3         
	//   78  152:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   79  155:pop             
		((StringBuilder) (obj)).append("Children");
	//   80  156:aload           4
	//   81  158:ldc1            #230 <String "Children">
	//   82  160:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   83  163:pop             
		Log.d("VAST", ((StringBuilder) (obj)).toString());
	//   84  164:ldc1            #220 <String "VAST">
	//   85  166:aload           4
	//   86  168:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   87  171:invokestatic    #226 <Method int Log.d(String, String)>
	//   88  174:pop             
		for(obj = ((Object) (childrenNames().iterator())); ((Iterator) (obj)).hasNext();)
	//*  89  175:aload_0         
	//*  90  176:invokevirtual   #166 <Method ArrayList childrenNames()>
	//*  91  179:invokevirtual   #170 <Method Iterator ArrayList.iterator()>
	//*  92  182:astore          4
	//*  93  184:aload           4
	//*  94  186:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//*  95  191:ifeq            339
		{
			Object obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//   96  194:aload           4
	//   97  196:invokeinterface #178 <Method Object Iterator.next()>
	//   98  201:checkcast       #47  <Class String>
	//   99  204:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//  100  206:new             #124 <Class StringBuilder>
	//  101  209:dup             
	//  102  210:invokespecial   #125 <Method void StringBuilder()>
	//  103  213:astore          6
			stringbuilder1.append(s);
	//  104  215:aload           6
	//  105  217:aload_3         
	//  106  218:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  107  221:pop             
			stringbuilder1.append("Childname: ");
	//  108  222:aload           6
	//  109  224:ldc1            #232 <String "Childname: ">
	//  110  226:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  111  229:pop             
			stringbuilder1.append(((String) (obj1)));
	//  112  230:aload           6
	//  113  232:aload           5
	//  114  234:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  115  237:pop             
			Log.d("VAST", stringbuilder1.toString());
	//  116  238:ldc1            #220 <String "VAST">
	//  117  240:aload           6
	//  118  242:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  119  245:invokestatic    #226 <Method int Log.d(String, String)>
	//  120  248:pop             
			obj1 = ((Object) (childrenNamed(((String) (obj1)))));
	//  121  249:aload_0         
	//  122  250:aload           5
	//  123  252:invokevirtual   #110 <Method ArrayList childrenNamed(String)>
	//  124  255:astore          5
			stringbuilder1 = new StringBuilder();
	//  125  257:new             #124 <Class StringBuilder>
	//  126  260:dup             
	//  127  261:invokespecial   #125 <Method void StringBuilder()>
	//  128  264:astore          6
			stringbuilder1.append(s);
	//  129  266:aload           6
	//  130  268:aload_3         
	//  131  269:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  132  272:pop             
			stringbuilder1.append("Childarray: ");
	//  133  273:aload           6
	//  134  275:ldc1            #234 <String "Childarray: ">
	//  135  277:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  136  280:pop             
			stringbuilder1.append(((ArrayList) (obj1)).toString());
	//  137  281:aload           6
	//  138  283:aload           5
	//  139  285:invokevirtual   #235 <Method String ArrayList.toString()>
	//  140  288:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  141  291:pop             
			Log.d("VAST", stringbuilder1.toString());
	//  142  292:ldc1            #220 <String "VAST">
	//  143  294:aload           6
	//  144  296:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  145  299:invokestatic    #226 <Method int Log.d(String, String)>
	//  146  302:pop             
			obj1 = ((Object) (((ArrayList) (obj1)).iterator()));
	//  147  303:aload           5
	//  148  305:invokevirtual   #170 <Method Iterator ArrayList.iterator()>
	//  149  308:astore          5
			while(((Iterator) (obj1)).hasNext()) 
	//* 150  310:aload           5
	//* 151  312:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//* 152  317:ifeq            184
				((APSVASTXMLNode)((Iterator) (obj1)).next()).logWithLevel(i + 1);
	//  153  320:aload           5
	//  154  322:invokeinterface #178 <Method Object Iterator.next()>
	//  155  327:checkcast       #2   <Class APSVASTXMLNode>
	//  156  330:iload_1         
	//  157  331:iconst_1        
	//  158  332:iadd            
	//  159  333:invokevirtual   #237 <Method void logWithLevel(int)>
		}

	//* 160  336:goto            310
		obj = ((Object) (new StringBuilder()));
	//  161  339:new             #124 <Class StringBuilder>
	//  162  342:dup             
	//  163  343:invokespecial   #125 <Method void StringBuilder()>
	//  164  346:astore          4
		((StringBuilder) (obj)).append(s);
	//  165  348:aload           4
	//  166  350:aload_3         
	//  167  351:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  168  354:pop             
		((StringBuilder) (obj)).append("--------------------------------------");
	//  169  355:aload           4
	//  170  357:ldc1            #239 <String "--------------------------------------">
	//  171  359:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  172  362:pop             
		Log.d("VAST", ((StringBuilder) (obj)).toString());
	//  173  363:ldc1            #220 <String "VAST">
	//  174  365:aload           4
	//  175  367:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  176  370:invokestatic    #226 <Method int Log.d(String, String)>
	//  177  373:pop             
	//  178  374:return          
	}

	public ArrayList urlsForChildrenNamed(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj = ((Object) (childrenNamed(s)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #110 <Method ArrayList childrenNamed(String)>
	//    7   11:astore_2        
		if(obj != null && ((ArrayList) (obj)).size() > 0)
	//*   8   12:aload_2         
	//*   9   13:ifnull          67
	//*  10   16:aload_2         
	//*  11   17:invokevirtual   #113 <Method int ArrayList.size()>
	//*  12   20:ifle            67
		{
			s = ((String) (new ArrayList()));
	//   13   23:new             #66  <Class ArrayList>
	//   14   26:dup             
	//   15   27:invokespecial   #67  <Method void ArrayList()>
	//   16   30:astore_1        
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((ArrayList) (s)).addAll(((java.util.Collection) (((APSVASTXMLNode)((Iterator) (obj)).next()).urlsForCurrentNode()))));
	//   17   31:aload_2         
	//   18   32:invokevirtual   #170 <Method Iterator ArrayList.iterator()>
	//   19   35:astore_2        
	//   20   36:aload_2         
	//   21   37:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//   22   42:ifeq            65
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokeinterface #178 <Method Object Iterator.next()>
	//   26   52:checkcast       #2   <Class APSVASTXMLNode>
	//   27   55:invokevirtual   #243 <Method ArrayList urlsForCurrentNode()>
	//   28   58:invokevirtual   #87  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   29   61:pop             
	//*  30   62:goto            36
			return ((ArrayList) (s));
	//   31   65:aload_1         
	//   32   66:areturn         
		} else
		{
			return null;
	//   33   67:aconst_null     
	//   34   68:areturn         
		}
	}

	public ArrayList urlsForCurrentNode()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #66  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void ArrayList()>
	//    3    7:astore_1        
		String s = value;
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field String value>
	//    6   12:astore_2        
		if(s != null && s.trim().length() > 0)
	//*   7   13:aload_2         
	//*   8   14:ifnull          36
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #247 <Method String String.trim()>
	//*  11   21:invokevirtual   #250 <Method int String.length()>
	//*  12   24:ifle            36
			arraylist.add(((Object) (value)));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field String value>
	//   16   32:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   17   35:pop             
		if(childrenNamed("URL") != null)
	//*  18   36:aload_0         
	//*  19   37:ldc1            #252 <String "URL">
	//*  20   39:invokevirtual   #110 <Method ArrayList childrenNamed(String)>
	//*  21   42:ifnull          90
		{
			Iterator iterator = childrenNamed("URL").iterator();
	//   22   45:aload_0         
	//   23   46:ldc1            #252 <String "URL">
	//   24   48:invokevirtual   #110 <Method ArrayList childrenNamed(String)>
	//   25   51:invokevirtual   #170 <Method Iterator ArrayList.iterator()>
	//   26   54:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   27   55:aload_2         
	//   28   56:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//   29   61:ifeq            90
				String s1 = ((APSVASTXMLNode)iterator.next()).value;
	//   30   64:aload_2         
	//   31   65:invokeinterface #178 <Method Object Iterator.next()>
	//   32   70:checkcast       #2   <Class APSVASTXMLNode>
	//   33   73:getfield        #103 <Field String value>
	//   34   76:astore_3        
				if(s1 != null)
	//*  35   77:aload_3         
	//*  36   78:ifnull          55
					arraylist.add(((Object) (s1)));
	//   37   81:aload_1         
	//   38   82:aload_3         
	//   39   83:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   40   86:pop             
			} while(true);
	//   41   87:goto            55
		}
		return arraylist;
	//   42   90:aload_1         
	//   43   91:areturn         
	}

	private HashMap _children;
	public HashMap attributes;
	public String value;
}
