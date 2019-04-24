// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.PrintStream;
import java.io.Serializable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class OptionalHandlerFactory
	implements Serializable
{

	protected OptionalHandlerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:return          
	}

	private boolean hasSuperClassStartingWith(Class class1, String s)
	{
		class1 = class1.getSuperclass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #88  <Method Class Class.getSuperclass()>
	//    2    4:astore_1        
		do
		{
			if(class1 == null || class1 == java/lang/Object)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
	//*   5    9:aload_1         
	//*   6   10:ldc1            #4   <Class Object>
	//*   7   12:if_acmpne       17
				return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
			if(class1.getName().startsWith(s))
	//*  10   17:aload_1         
	//*  11   18:invokevirtual   #92  <Method String Class.getName()>
	//*  12   21:aload_2         
	//*  13   22:invokevirtual   #98  <Method boolean String.startsWith(String)>
	//*  14   25:ifeq            30
				return true;
	//   15   28:iconst_1        
	//   16   29:ireturn         
			class1 = class1.getSuperclass();
	//   17   30:aload_1         
	//   18   31:invokevirtual   #88  <Method Class Class.getSuperclass()>
	//   19   34:astore_1        
		} while(true);
	//   20   35:goto            5
	}

	private Object instantiate(String s)
	{
		s = ((String) (Class.forName(s).newInstance()));
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method Class Class.forName(String)>
	//    2    4:invokevirtual   #108 <Method Object Class.newInstance()>
	//    3    7:astore_1        
		return ((Object) (s));
	//    4    8:aload_1         
	//    5    9:areturn         
		s;
	//    6   10:astore_1        
_L2:
		return ((Object) (null));
	//    7   11:aconst_null     
	//    8   12:areturn         
		s;
	//    9   13:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  10   14:goto            11
	}

	public JsonDeserializer findDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		Object obj;
		Class class1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		class1 = javatype.getRawClass();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #117 <Method Class JavaType.getRawClass()>
	//    4    7:astore          6
		if(CLASS_JAVA7_PATH == null || !CLASS_JAVA7_PATH.isAssignableFrom(class1)) goto _L2; else goto _L1
	//    5    9:getstatic       #61  <Field Class CLASS_JAVA7_PATH>
	//    6   12:ifnull          40
	//    7   15:getstatic       #61  <Field Class CLASS_JAVA7_PATH>
	//    8   18:aload           6
	//    9   20:invokevirtual   #121 <Method boolean Class.isAssignableFrom(Class)>
	//   10   23:ifeq            40
_L1:
		JsonDeserializer jsondeserializer = (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.PathDeserializer");
	//   11   26:aload_0         
	//   12   27:ldc1            #24  <String "com.fasterxml.jackson.databind.ext.PathDeserializer">
	//   13   29:invokespecial   #123 <Method Object instantiate(String)>
	//   14   32:checkcast       #125 <Class JsonDeserializer>
	//   15   35:astore          4
_L4:
		return jsondeserializer;
	//   16   37:aload           4
	//   17   39:areturn         
_L2:
		if(CLASS_DOM_NODE != null && CLASS_DOM_NODE.isAssignableFrom(class1))
	//*  18   40:getstatic       #47  <Field Class CLASS_DOM_NODE>
	//*  19   43:ifnull          67
	//*  20   46:getstatic       #47  <Field Class CLASS_DOM_NODE>
	//*  21   49:aload           6
	//*  22   51:invokevirtual   #121 <Method boolean Class.isAssignableFrom(Class)>
	//*  23   54:ifeq            67
			return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
	//   24   57:aload_0         
	//   25   58:ldc1            #21  <String "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer">
	//   26   60:invokespecial   #123 <Method Object instantiate(String)>
	//   27   63:checkcast       #125 <Class JsonDeserializer>
	//   28   66:areturn         
		if(CLASS_DOM_DOCUMENT != null && CLASS_DOM_DOCUMENT.isAssignableFrom(class1))
	//*  29   67:getstatic       #51  <Field Class CLASS_DOM_DOCUMENT>
	//*  30   70:ifnull          94
	//*  31   73:getstatic       #51  <Field Class CLASS_DOM_DOCUMENT>
	//*  32   76:aload           6
	//*  33   78:invokevirtual   #121 <Method boolean Class.isAssignableFrom(Class)>
	//*  34   81:ifeq            94
			return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
	//   35   84:aload_0         
	//   36   85:ldc1            #18  <String "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer">
	//   37   87:invokespecial   #123 <Method Object instantiate(String)>
	//   38   90:checkcast       #125 <Class JsonDeserializer>
	//   39   93:areturn         
		if(class1.getName().startsWith("javax.xml."))
			break; /* Loop/switch isn't completed */
	//   40   94:aload           6
	//   41   96:invokevirtual   #92  <Method String Class.getName()>
	//   42   99:ldc1            #27  <String "javax.xml.">
	//   43  101:invokevirtual   #98  <Method boolean String.startsWith(String)>
	//   44  104:ifne            122
		jsondeserializer = ((JsonDeserializer) (obj));
	//   45  107:aload           5
	//   46  109:astore          4
		if(!hasSuperClassStartingWith(class1, "javax.xml.")) goto _L4; else goto _L3
	//   47  111:aload_0         
	//   48  112:aload           6
	//   49  114:ldc1            #27  <String "javax.xml.">
	//   50  116:invokespecial   #127 <Method boolean hasSuperClassStartingWith(Class, String)>
	//   51  119:ifeq            37
_L3:
		Object obj1 = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
	//   52  122:aload_0         
	//   53  123:ldc1            #15  <String "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers">
	//   54  125:invokespecial   #123 <Method Object instantiate(String)>
	//   55  128:astore          6
		jsondeserializer = ((JsonDeserializer) (obj));
	//   56  130:aload           5
	//   57  132:astore          4
		if(obj1 != null)
	//*  58  134:aload           6
	//*  59  136:ifnull          37
			return ((Deserializers)obj1).findBeanDeserializer(javatype, deserializationconfig, beandescription);
	//   60  139:aload           6
	//   61  141:checkcast       #129 <Class Deserializers>
	//   62  144:aload_1         
	//   63  145:aload_2         
	//   64  146:aload_3         
	//   65  147:invokeinterface #132 <Method JsonDeserializer Deserializers.findBeanDeserializer(JavaType, DeserializationConfig, BeanDescription)>
	//   66  152:areturn         
		if(true) goto _L4; else goto _L5
_L5:
	}

	public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
	{
		Object obj;
		Class class1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		class1 = javatype.getRawClass();
	//    2    3:aload_2         
	//    3    4:invokevirtual   #117 <Method Class JavaType.getRawClass()>
	//    4    7:astore          6
		if(CLASS_JAVA7_PATH == null || !CLASS_JAVA7_PATH.isAssignableFrom(class1)) goto _L2; else goto _L1
	//    5    9:getstatic       #61  <Field Class CLASS_JAVA7_PATH>
	//    6   12:ifnull          34
	//    7   15:getstatic       #61  <Field Class CLASS_JAVA7_PATH>
	//    8   18:aload           6
	//    9   20:invokevirtual   #121 <Method boolean Class.isAssignableFrom(Class)>
	//   10   23:ifeq            34
_L1:
		ToStringSerializer tostringserializer = ToStringSerializer.instance;
	//   11   26:getstatic       #141 <Field ToStringSerializer ToStringSerializer.instance>
	//   12   29:astore          4
_L4:
		return ((JsonSerializer) (tostringserializer));
	//   13   31:aload           4
	//   14   33:areturn         
_L2:
		if(CLASS_DOM_NODE != null && CLASS_DOM_NODE.isAssignableFrom(class1))
	//*  15   34:getstatic       #47  <Field Class CLASS_DOM_NODE>
	//*  16   37:ifnull          61
	//*  17   40:getstatic       #47  <Field Class CLASS_DOM_NODE>
	//*  18   43:aload           6
	//*  19   45:invokevirtual   #121 <Method boolean Class.isAssignableFrom(Class)>
	//*  20   48:ifeq            61
			return (JsonSerializer)instantiate("com.fasterxml.jackson.databind.ext.DOMSerializer");
	//   21   51:aload_0         
	//   22   52:ldc1            #33  <String "com.fasterxml.jackson.databind.ext.DOMSerializer">
	//   23   54:invokespecial   #123 <Method Object instantiate(String)>
	//   24   57:checkcast       #143 <Class JsonSerializer>
	//   25   60:areturn         
		if(class1.getName().startsWith("javax.xml."))
			break; /* Loop/switch isn't completed */
	//   26   61:aload           6
	//   27   63:invokevirtual   #92  <Method String Class.getName()>
	//   28   66:ldc1            #27  <String "javax.xml.">
	//   29   68:invokevirtual   #98  <Method boolean String.startsWith(String)>
	//   30   71:ifne            89
		tostringserializer = ((ToStringSerializer) (obj));
	//   31   74:aload           5
	//   32   76:astore          4
		if(!hasSuperClassStartingWith(class1, "javax.xml.")) goto _L4; else goto _L3
	//   33   78:aload_0         
	//   34   79:aload           6
	//   35   81:ldc1            #27  <String "javax.xml.">
	//   36   83:invokespecial   #127 <Method boolean hasSuperClassStartingWith(Class, String)>
	//   37   86:ifeq            31
_L3:
		Object obj1 = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
	//   38   89:aload_0         
	//   39   90:ldc1            #30  <String "com.fasterxml.jackson.databind.ext.CoreXMLSerializers">
	//   40   92:invokespecial   #123 <Method Object instantiate(String)>
	//   41   95:astore          6
		tostringserializer = ((ToStringSerializer) (obj));
	//   42   97:aload           5
	//   43   99:astore          4
		if(obj1 != null)
	//*  44  101:aload           6
	//*  45  103:ifnull          31
			return ((Serializers)obj1).findSerializer(serializationconfig, javatype, beandescription);
	//   46  106:aload           6
	//   47  108:checkcast       #145 <Class Serializers>
	//   48  111:aload_1         
	//   49  112:aload_2         
	//   50  113:aload_3         
	//   51  114:invokeinterface #147 <Method JsonSerializer Serializers.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//   52  119:areturn         
		if(true) goto _L4; else goto _L5
_L5:
	}

	private static final Class CLASS_DOM_DOCUMENT;
	private static final Class CLASS_DOM_NODE;
	private static final Class CLASS_JAVA7_PATH;
	private static final String DESERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
	private static final String DESERIALIZER_FOR_DOM_DOCUMENT = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
	private static final String DESERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
	private static final String DESERIALIZER_FOR_PATH = "com.fasterxml.jackson.databind.ext.PathDeserializer";
	private static final String PACKAGE_PREFIX_JAVAX_XML = "javax.xml.";
	private static final String SERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
	private static final String SERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMSerializer";
	public static final OptionalHandlerFactory instance;
	private static final long serialVersionUID = 1L;

	static 
	{
		Class class1;
		CLASS_DOM_NODE = org/w3c/dom/Node;
	//    0    0:ldc1            #45  <Class Node>
	//    1    2:putstatic       #47  <Field Class CLASS_DOM_NODE>
		CLASS_DOM_DOCUMENT = org/w3c/dom/Document;
	//    2    5:ldc1            #49  <Class Document>
	//    3    7:putstatic       #51  <Field Class CLASS_DOM_DOCUMENT>
		class1 = null;
	//    4   10:aconst_null     
	//    5   11:astore_0        
		Class class2 = Class.forName("java.nio.file.Path");
	//    6   12:ldc1            #53  <String "java.nio.file.Path">
	//    7   14:invokestatic    #59  <Method Class Class.forName(String)>
	//    8   17:astore_1        
		class1 = class2;
	//    9   18:aload_1         
	//   10   19:astore_0        
_L2:
		CLASS_JAVA7_PATH = class1;
	//   11   20:aload_0         
	//   12   21:putstatic       #61  <Field Class CLASS_JAVA7_PATH>
		instance = new OptionalHandlerFactory();
	//   13   24:new             #2   <Class OptionalHandlerFactory>
	//   14   27:dup             
	//   15   28:invokespecial   #64  <Method void OptionalHandlerFactory()>
	//   16   31:putstatic       #66  <Field OptionalHandlerFactory instance>
		return;
	//   17   34:return          
		Exception exception;
		exception;
	//   18   35:astore_1        
		System.err.println("WARNING: could not load Java7 Path class");
	//   19   36:getstatic       #72  <Field PrintStream System.err>
	//   20   39:ldc1            #74  <String "WARNING: could not load Java7 Path class">
	//   21   41:invokevirtual   #80  <Method void PrintStream.println(String)>
		if(true) goto _L2; else goto _L1
	//   22   44:goto            20
_L1:
	}
}
