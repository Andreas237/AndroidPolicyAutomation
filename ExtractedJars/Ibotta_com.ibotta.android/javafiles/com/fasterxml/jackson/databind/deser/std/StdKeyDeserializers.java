// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

public class StdKeyDeserializers
	implements KeyDeserializers, Serializable
{

	public StdKeyDeserializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer)
	{
		return ((KeyDeserializer) (new StdKeyDeserializer.DelegatingKD(javatype.getRawClass(), jsondeserializer)));
	//    0    0:new             #21  <Class StdKeyDeserializer$DelegatingKD>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method Class JavaType.getRawClass()>
	//    4    8:aload_2         
	//    5    9:invokespecial   #30  <Method void StdKeyDeserializer$DelegatingKD(Class, JsonDeserializer)>
	//    6   12:areturn         
	}

	public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumresolver)
	{
		return ((KeyDeserializer) (new StdKeyDeserializer.EnumKD(enumresolver, ((AnnotatedMethod) (null)))));
	//    0    0:new             #36  <Class StdKeyDeserializer$EnumKD>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #39  <Method void StdKeyDeserializer$EnumKD(EnumResolver, AnnotatedMethod)>
	//    5    9:areturn         
	}

	public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
	{
		return ((KeyDeserializer) (new StdKeyDeserializer.EnumKD(enumresolver, annotatedmethod)));
	//    0    0:new             #36  <Class StdKeyDeserializer$EnumKD>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #39  <Method void StdKeyDeserializer$EnumKD(EnumResolver, AnnotatedMethod)>
	//    5    9:areturn         
	}

	public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
	{
		javatype = ((JavaType) (deserializationconfig.introspect(javatype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method BeanDescription DeserializationConfig.introspect(JavaType)>
	//    3    5:astore_1        
		java.lang.reflect.Constructor constructor = ((BeanDescription) (javatype)).findSingleArgConstructor(new Class[] {
			java/lang/String
		});
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:anewarray       Class[]
	//    7   11:dup             
	//    8   12:iconst_0        
	//    9   13:ldc1            #52  <Class String>
	//   10   15:aastore         
	//   11   16:invokevirtual   #58  <Method java.lang.reflect.Constructor BeanDescription.findSingleArgConstructor(Class[])>
	//   12   19:astore_2        
		if(constructor != null)
	//*  13   20:aload_2         
	//*  14   21:ifnull          51
		{
			if(deserializationconfig.canOverrideAccessModifiers())
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #62  <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//*  17   28:ifeq            42
				ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (constructor)), deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   18   31:aload_2         
	//   19   32:aload_0         
	//   20   33:getstatic       #68  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   21   36:invokevirtual   #72  <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   22   39:invokestatic    #78  <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
			return ((KeyDeserializer) (new StdKeyDeserializer.StringCtorKeyDeserializer(constructor)));
	//   23   42:new             #80  <Class StdKeyDeserializer$StringCtorKeyDeserializer>
	//   24   45:dup             
	//   25   46:aload_2         
	//   26   47:invokespecial   #83  <Method void StdKeyDeserializer$StringCtorKeyDeserializer(java.lang.reflect.Constructor)>
	//   27   50:areturn         
		}
		javatype = ((JavaType) (((BeanDescription) (javatype)).findFactoryMethod(new Class[] {
			java/lang/String
		})));
	//   28   51:aload_1         
	//   29   52:iconst_1        
	//   30   53:anewarray       Class[]
	//   31   56:dup             
	//   32   57:iconst_0        
	//   33   58:ldc1            #52  <Class String>
	//   34   60:aastore         
	//   35   61:invokevirtual   #87  <Method java.lang.reflect.Method BeanDescription.findFactoryMethod(Class[])>
	//   36   64:astore_1        
		if(javatype != null)
	//*  37   65:aload_1         
	//*  38   66:ifnull          96
		{
			if(deserializationconfig.canOverrideAccessModifiers())
	//*  39   69:aload_0         
	//*  40   70:invokevirtual   #62  <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//*  41   73:ifeq            87
				ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (javatype)), deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   42   76:aload_1         
	//   43   77:aload_0         
	//   44   78:getstatic       #68  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   45   81:invokevirtual   #72  <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   46   84:invokestatic    #78  <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
			return ((KeyDeserializer) (new StdKeyDeserializer.StringFactoryKeyDeserializer(((java.lang.reflect.Method) (javatype)))));
	//   47   87:new             #89  <Class StdKeyDeserializer$StringFactoryKeyDeserializer>
	//   48   90:dup             
	//   49   91:aload_1         
	//   50   92:invokespecial   #92  <Method void StdKeyDeserializer$StringFactoryKeyDeserializer(java.lang.reflect.Method)>
	//   51   95:areturn         
		} else
		{
			return null;
	//   52   96:aconst_null     
	//   53   97:areturn         
		}
	}

	public KeyDeserializer findKeyDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		deserializationconfig = ((DeserializationConfig) (javatype.getRawClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method Class JavaType.getRawClass()>
	//    2    4:astore_2        
		javatype = ((JavaType) (deserializationconfig));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(((Class) (deserializationconfig)).isPrimitive())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #99  <Method boolean Class.isPrimitive()>
	//*   7   11:ifeq            19
			javatype = ((JavaType) (ClassUtil.wrapperType(((Class) (deserializationconfig)))));
	//    8   14:aload_2         
	//    9   15:invokestatic    #103 <Method Class ClassUtil.wrapperType(Class)>
	//   10   18:astore_1        
		return ((KeyDeserializer) (StdKeyDeserializer.forType(((Class) (javatype)))));
	//   11   19:aload_1         
	//   12   20:invokestatic    #109 <Method StdKeyDeserializer StdKeyDeserializer.forType(Class)>
	//   13   23:areturn         
	}

	private static final long serialVersionUID = 1L;
}
