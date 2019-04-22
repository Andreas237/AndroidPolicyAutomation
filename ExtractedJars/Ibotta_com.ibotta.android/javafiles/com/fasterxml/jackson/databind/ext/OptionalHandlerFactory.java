// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//			Java7Support

public class OptionalHandlerFactory
	implements Serializable
{

	protected OptionalHandlerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	private boolean hasSuperClassStartingWith(Class class1, String s)
	{
		do
		{
			Class class2 = class1.getSuperclass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method Class Class.getSuperclass()>
	//    2    4:astore_3        
			if(class2 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          32
			{
				if(class2 == java/lang/Object)
	//*   5    9:aload_3         
	//*   6   10:ldc1            #4   <Class Object>
	//*   7   12:if_acmpne       17
					return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
				class1 = class2;
	//   10   17:aload_3         
	//   11   18:astore_1        
				if(class2.getName().startsWith(s))
	//*  12   19:aload_3         
	//*  13   20:invokevirtual   #56  <Method String Class.getName()>
	//*  14   23:aload_2         
	//*  15   24:invokevirtual   #62  <Method boolean String.startsWith(String)>
	//*  16   27:ifeq            0
					return true;
	//   17   30:iconst_1        
	//   18   31:ireturn         
			} else
			{
				return false;
	//   19   32:iconst_0        
	//   20   33:ireturn         
			}
		} while(true);
	}

	private Object instantiate(String s)
	{
		try
		{
			s = ((String) (ClassUtil.createInstance(Class.forName(s), false)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #74  <Method Class Class.forName(String)>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #80  <Method Object ClassUtil.createInstance(Class, boolean)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
	//*   7   11:aconst_null     
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return ((Object) (null));
		}
		return ((Object) (s));
	//*   9   13:astore_1        
	//*  10   14:goto            11
	}

	public JsonDeserializer findDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		Object obj = ((Object) (javatype.getRawClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method Class JavaType.getRawClass()>
	//    2    4:astore          4
		Object obj1 = ((Object) (_jdk7Helper));
	//    3    6:getstatic       #37  <Field Java7Support _jdk7Helper>
	//    4    9:astore          5
		if(obj1 != null)
	//*   5   11:aload           5
	//*   6   13:ifnull          33
		{
			obj1 = ((Object) (((Java7Support) (obj1)).getDeserializerForJavaNioFilePath(((Class) (obj)))));
	//    7   16:aload           5
	//    8   18:aload           4
	//    9   20:invokevirtual   #93  <Method JsonDeserializer Java7Support.getDeserializerForJavaNioFilePath(Class)>
	//   10   23:astore          5
			if(obj1 != null)
	//*  11   25:aload           5
	//*  12   27:ifnull          33
				return ((JsonDeserializer) (obj1));
	//   13   30:aload           5
	//   14   32:areturn         
		}
		obj1 = ((Object) (CLASS_DOM_NODE));
	//   15   33:getstatic       #26  <Field Class CLASS_DOM_NODE>
	//   16   36:astore          5
		if(obj1 != null && ((Class) (obj1)).isAssignableFrom(((Class) (obj))))
	//*  17   38:aload           5
	//*  18   40:ifnull          63
	//*  19   43:aload           5
	//*  20   45:aload           4
	//*  21   47:invokevirtual   #97  <Method boolean Class.isAssignableFrom(Class)>
	//*  22   50:ifeq            63
			return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
	//   23   53:aload_0         
	//   24   54:ldc1            #99  <String "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer">
	//   25   56:invokespecial   #101 <Method Object instantiate(String)>
	//   26   59:checkcast       #103 <Class JsonDeserializer>
	//   27   62:areturn         
		obj1 = ((Object) (CLASS_DOM_DOCUMENT));
	//   28   63:getstatic       #30  <Field Class CLASS_DOM_DOCUMENT>
	//   29   66:astore          5
		if(obj1 != null && ((Class) (obj1)).isAssignableFrom(((Class) (obj))))
	//*  30   68:aload           5
	//*  31   70:ifnull          93
	//*  32   73:aload           5
	//*  33   75:aload           4
	//*  34   77:invokevirtual   #97  <Method boolean Class.isAssignableFrom(Class)>
	//*  35   80:ifeq            93
			return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
	//   36   83:aload_0         
	//   37   84:ldc1            #105 <String "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer">
	//   38   86:invokespecial   #101 <Method Object instantiate(String)>
	//   39   89:checkcast       #103 <Class JsonDeserializer>
	//   40   92:areturn         
		if(!((Class) (obj)).getName().startsWith("javax.xml.") && !hasSuperClassStartingWith(((Class) (obj)), "javax.xml."))
	//*  41   93:aload           4
	//*  42   95:invokevirtual   #56  <Method String Class.getName()>
	//*  43   98:ldc1            #107 <String "javax.xml.">
	//*  44  100:invokevirtual   #62  <Method boolean String.startsWith(String)>
	//*  45  103:ifne            122
	//*  46  106:aload_0         
	//*  47  107:aload           4
	//*  48  109:ldc1            #107 <String "javax.xml.">
	//*  49  111:invokespecial   #109 <Method boolean hasSuperClassStartingWith(Class, String)>
	//*  50  114:ifeq            120
	//*  51  117:goto            122
			return null;
	//   52  120:aconst_null     
	//   53  121:areturn         
		obj = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
	//   54  122:aload_0         
	//   55  123:ldc1            #111 <String "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers">
	//   56  125:invokespecial   #101 <Method Object instantiate(String)>
	//   57  128:astore          4
		if(obj == null)
	//*  58  130:aload           4
	//*  59  132:ifnonnull       137
			return null;
	//   60  135:aconst_null     
	//   61  136:areturn         
		else
			return ((Deserializers)obj).findBeanDeserializer(javatype, deserializationconfig, beandescription);
	//   62  137:aload           4
	//   63  139:checkcast       #113 <Class Deserializers>
	//   64  142:aload_1         
	//   65  143:aload_2         
	//   66  144:aload_3         
	//   67  145:invokeinterface #116 <Method JsonDeserializer Deserializers.findBeanDeserializer(JavaType, DeserializationConfig, BeanDescription)>
	//   68  150:areturn         
	}

	public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
	{
		Object obj = ((Object) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #89  <Method Class JavaType.getRawClass()>
	//    2    4:astore          4
		Object obj1 = ((Object) (_jdk7Helper));
	//    3    6:getstatic       #37  <Field Java7Support _jdk7Helper>
	//    4    9:astore          5
		if(obj1 != null)
	//*   5   11:aload           5
	//*   6   13:ifnull          33
		{
			obj1 = ((Object) (((Java7Support) (obj1)).getSerializerForJavaNioFilePath(((Class) (obj)))));
	//    7   16:aload           5
	//    8   18:aload           4
	//    9   20:invokevirtual   #124 <Method JsonSerializer Java7Support.getSerializerForJavaNioFilePath(Class)>
	//   10   23:astore          5
			if(obj1 != null)
	//*  11   25:aload           5
	//*  12   27:ifnull          33
				return ((JsonSerializer) (obj1));
	//   13   30:aload           5
	//   14   32:areturn         
		}
		obj1 = ((Object) (CLASS_DOM_NODE));
	//   15   33:getstatic       #26  <Field Class CLASS_DOM_NODE>
	//   16   36:astore          5
		if(obj1 != null && ((Class) (obj1)).isAssignableFrom(((Class) (obj))))
	//*  17   38:aload           5
	//*  18   40:ifnull          63
	//*  19   43:aload           5
	//*  20   45:aload           4
	//*  21   47:invokevirtual   #97  <Method boolean Class.isAssignableFrom(Class)>
	//*  22   50:ifeq            63
			return (JsonSerializer)instantiate("com.fasterxml.jackson.databind.ext.DOMSerializer");
	//   23   53:aload_0         
	//   24   54:ldc1            #126 <String "com.fasterxml.jackson.databind.ext.DOMSerializer">
	//   25   56:invokespecial   #101 <Method Object instantiate(String)>
	//   26   59:checkcast       #128 <Class JsonSerializer>
	//   27   62:areturn         
		if(!((Class) (obj)).getName().startsWith("javax.xml.") && !hasSuperClassStartingWith(((Class) (obj)), "javax.xml."))
	//*  28   63:aload           4
	//*  29   65:invokevirtual   #56  <Method String Class.getName()>
	//*  30   68:ldc1            #107 <String "javax.xml.">
	//*  31   70:invokevirtual   #62  <Method boolean String.startsWith(String)>
	//*  32   73:ifne            92
	//*  33   76:aload_0         
	//*  34   77:aload           4
	//*  35   79:ldc1            #107 <String "javax.xml.">
	//*  36   81:invokespecial   #109 <Method boolean hasSuperClassStartingWith(Class, String)>
	//*  37   84:ifeq            90
	//*  38   87:goto            92
			return null;
	//   39   90:aconst_null     
	//   40   91:areturn         
		obj = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
	//   41   92:aload_0         
	//   42   93:ldc1            #130 <String "com.fasterxml.jackson.databind.ext.CoreXMLSerializers">
	//   43   95:invokespecial   #101 <Method Object instantiate(String)>
	//   44   98:astore          4
		if(obj == null)
	//*  45  100:aload           4
	//*  46  102:ifnonnull       107
			return null;
	//   47  105:aconst_null     
	//   48  106:areturn         
		else
			return ((Serializers)obj).findSerializer(serializationconfig, javatype, beandescription);
	//   49  107:aload           4
	//   50  109:checkcast       #132 <Class Serializers>
	//   51  112:aload_1         
	//   52  113:aload_2         
	//   53  114:aload_3         
	//   54  115:invokeinterface #134 <Method JsonSerializer Serializers.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//   55  120:areturn         
	}

	private static final Class CLASS_DOM_DOCUMENT;
	private static final Class CLASS_DOM_NODE;
	private static final Java7Support _jdk7Helper;
	public static final OptionalHandlerFactory instance;
	private static final long serialVersionUID = 1L;

	static 
	{
		Java7Support java7support;
		java7support = null;
	//    0    0:aconst_null     
	//    1    1:astore_0        
	//*   2    2:goto            5
		CLASS_DOM_NODE = org/w3c/dom/Node;
	//    3    5:ldc1            #24  <Class Node>
	//    4    7:putstatic       #26  <Field Class CLASS_DOM_NODE>
		CLASS_DOM_DOCUMENT = org/w3c/dom/Document;
	//    5   10:ldc1            #28  <Class Document>
	//    6   12:putstatic       #30  <Field Class CLASS_DOM_DOCUMENT>
		Java7Support java7support1 = Java7Support.instance();
	//    7   15:invokestatic    #35  <Method Java7Support Java7Support.instance()>
	//    8   18:astore_1        
		java7support = java7support1;
	//    9   19:aload_1         
	//   10   20:astore_0        
_L2:
		_jdk7Helper = java7support;
	//   11   21:aload_0         
	//   12   22:putstatic       #37  <Field Java7Support _jdk7Helper>
		instance = new OptionalHandlerFactory();
	//   13   25:new             #2   <Class OptionalHandlerFactory>
	//   14   28:dup             
	//   15   29:invokespecial   #40  <Method void OptionalHandlerFactory()>
	//   16   32:putstatic       #42  <Field OptionalHandlerFactory instance>
		return;
	//   17   35:return          
		Throwable throwable;
		throwable;
	//   18   36:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  19   37:goto            21
	}
}
