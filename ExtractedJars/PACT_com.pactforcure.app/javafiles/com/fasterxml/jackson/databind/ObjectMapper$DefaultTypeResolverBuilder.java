// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import java.io.Serializable;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper, JavaType, DeserializationConfig, SerializationConfig

public static class ObjectMapper$DefaultTypeResolverBuilder extends StdTypeResolverBuilder
	implements Serializable
{

	public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, Collection collection)
	{
		if(useForType(javatype))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #29  <Method boolean useForType(JavaType)>
	//*   3    5:ifeq            16
			return super.buildTypeDeserializer(deserializationconfig, javatype, collection);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #31  <Method TypeDeserializer StdTypeResolverBuilder.buildTypeDeserializer(DeserializationConfig, JavaType, Collection)>
	//    9   15:areturn         
		else
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
	}

	public TypeSerializer buildTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, Collection collection)
	{
		if(useForType(javatype))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #29  <Method boolean useForType(JavaType)>
	//*   3    5:ifeq            16
			return super.buildTypeSerializer(serializationconfig, javatype, collection);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #37  <Method TypeSerializer StdTypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, Collection)>
	//    9   15:areturn         
		else
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
	}

	public boolean useForType(JavaType javatype)
	{
		boolean flag;
		boolean flag1;
		JavaType javatype1;
		JavaType javatype2;
		JavaType javatype3;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		flag1 = false;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		javatype1 = javatype;
	//    4    4:aload_1         
	//    5    5:astore          4
		javatype2 = javatype;
	//    6    7:aload_1         
	//    7    8:astore          5
		javatype3 = javatype;
	//    8   10:aload_1         
	//    9   11:astore          6
		ObjectMapper._cls2.$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[_appliesFor.ordinal()];
	//   10   13:getstatic       #44  <Field int[] ObjectMapper$2.$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
	//   11   16:aload_0         
	//   12   17:getfield        #22  <Field ObjectMapper$DefaultTyping _appliesFor>
	//   13   20:invokevirtual   #50  <Method int ObjectMapper$DefaultTyping.ordinal()>
	//   14   23:iaload          
		JVM INSTR tableswitch 1 3: default 52
	//	               1 59
	//	               2 81
	//	               3 116;
	//   15   24:tableswitch     1 3: default 52
	//	               1 59
	//	               2 81
	//	               3 116
		   goto _L1 _L2 _L3 _L4
_L1:
		flag = javatype.isJavaLangObject();
	//   16   52:aload_1         
	//   17   53:invokevirtual   #56  <Method boolean JavaType.isJavaLangObject()>
	//   18   56:istore_2        
_L7:
		return flag;
	//   19   57:iload_2         
	//   20   58:ireturn         
_L2:
		javatype2 = javatype1;
	//   21   59:aload           4
	//   22   61:astore          5
		if(!javatype1.isArrayType()) goto _L3; else goto _L5
	//   23   63:aload           4
	//   24   65:invokevirtual   #59  <Method boolean JavaType.isArrayType()>
	//   25   68:ifeq            81
_L5:
		javatype1 = javatype1.getContentType();
	//   26   71:aload           4
	//   27   73:invokevirtual   #63  <Method JavaType JavaType.getContentType()>
	//   28   76:astore          4
		  goto _L2
	//*  29   78:goto            59
_L3:
		if(javatype2.isJavaLangObject())
			break; /* Loop/switch isn't completed */
	//   30   81:aload           5
	//   31   83:invokevirtual   #56  <Method boolean JavaType.isJavaLangObject()>
	//   32   86:ifne            114
		flag = flag1;
	//   33   89:iload_3         
	//   34   90:istore_2        
		if(javatype2.isConcrete()) goto _L7; else goto _L6
	//   35   91:aload           5
	//   36   93:invokevirtual   #66  <Method boolean JavaType.isConcrete()>
	//   37   96:ifne            57
_L6:
		flag = flag1;
	//   38   99:iload_3         
	//   39  100:istore_2        
		if(((Class) (com/fasterxml/jackson/core/TreeNode)).isAssignableFrom(javatype2.getRawClass())) goto _L7; else goto _L8
	//   40  101:ldc1            #68  <Class TreeNode>
	//   41  103:aload           5
	//   42  105:invokevirtual   #72  <Method Class JavaType.getRawClass()>
	//   43  108:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
	//   44  111:ifne            57
_L8:
		return true;
	//   45  114:iconst_1        
	//   46  115:ireturn         
_L4:
		for(; javatype3.isArrayType(); javatype3 = javatype3.getContentType());
	//   47  116:aload           6
	//   48  118:invokevirtual   #59  <Method boolean JavaType.isArrayType()>
	//   49  121:ifeq            134
	//   50  124:aload           6
	//   51  126:invokevirtual   #63  <Method JavaType JavaType.getContentType()>
	//   52  129:astore          6
	//*  53  131:goto            116
		if(javatype3.isFinal() || ((Class) (com/fasterxml/jackson/core/TreeNode)).isAssignableFrom(javatype3.getRawClass()))
	//*  54  134:aload           6
	//*  55  136:invokevirtual   #81  <Method boolean JavaType.isFinal()>
	//*  56  139:ifne            157
	//*  57  142:ldc1            #68  <Class TreeNode>
	//*  58  144:aload           6
	//*  59  146:invokevirtual   #72  <Method Class JavaType.getRawClass()>
	//*  60  149:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
	//*  61  152:ifne            157
	//*  62  155:iload_2         
	//*  63  156:ireturn         
			flag = false;
	//   64  157:iconst_0        
	//   65  158:istore_2        
		return flag;
	//*  66  159:goto            155
	}

	private static final long serialVersionUID = 1L;
	protected final ObjectMapper.DefaultTyping _appliesFor;

	public ObjectMapper$DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping defaulttyping)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void StdTypeResolverBuilder()>
		_appliesFor = defaulttyping;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field ObjectMapper$DefaultTyping _appliesFor>
	//    5    9:return          
	}
}
