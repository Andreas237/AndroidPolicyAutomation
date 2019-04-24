// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.*;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			AsArrayTypeDeserializer, AsPropertyTypeDeserializer, AsWrapperTypeDeserializer, AsExternalTypeDeserializer, 
//			AsArrayTypeSerializer, AsPropertyTypeSerializer, AsWrapperTypeSerializer, AsExternalTypeSerializer, 
//			AsExistingPropertyTypeSerializer, ClassNameIdResolver, MinimalClassNameIdResolver, TypeNameIdResolver

public class StdTypeResolverBuilder
	implements TypeResolverBuilder
{

	public StdTypeResolverBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		_typeIdVisible = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean _typeIdVisible>
	//    5    9:return          
	}

	public static StdTypeResolverBuilder noTypeInfoBuilder()
	{
		return (new StdTypeResolverBuilder()).init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE, ((TypeIdResolver) (null)));
	//    0    0:new             #2   <Class StdTypeResolverBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StdTypeResolverBuilder()>
	//    3    7:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NONE>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #41  <Method StdTypeResolverBuilder init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, TypeIdResolver)>
	//    6   14:areturn         
	}

	public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, Collection collection)
	{
		if(_idType == com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//*   2    4:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NONE>
	//*   3    7:if_acmpne       12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		deserializationconfig = ((DeserializationConfig) (idResolver(((MapperConfig) (deserializationconfig)), javatype, collection, false, true)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_0        
	//   11   17:iconst_1        
	//   12   18:invokevirtual   #49  <Method TypeIdResolver idResolver(MapperConfig, JavaType, Collection, boolean, boolean)>
	//   13   21:astore_1        
		static class _cls1
		{

			static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[];
			static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id = new int[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.values().length];
			//    0    0:invokestatic    #19  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$Id[] com.fasterxml.jackson.annotation.JsonTypeInfo$Id.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
			//    5   12:getstatic       #25  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CLASS>
			//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
			//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.MINIMAL_CLASS>
			//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
			//*  15   34:getstatic       #35  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NAME>
			//*  16   37:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
			//*  20   45:getstatic       #38  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NONE>
			//*  21   48:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
			//*  25   56:getstatic       #41  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CUSTOM>
			//*  26   59:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:invokestatic    #46  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As[] com.fasterxml.jackson.annotation.JsonTypeInfo$As.values()>
			//*  30   67:arraylength     
			//*  31   68:newarray        int[]
			//*  32   70:putstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  33   73:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  34   76:getstatic       #52  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
			//*  35   79:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  36   82:iconst_1        
			//*  37   83:iastore         
			//*  38   84:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  39   87:getstatic       #56  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
			//*  40   90:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  41   93:iconst_2        
			//*  42   94:iastore         
			//*  43   95:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  44   98:getstatic       #59  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
			//*  45  101:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  46  104:iconst_3        
			//*  47  105:iastore         
			//*  48  106:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  49  109:getstatic       #62  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
			//*  50  112:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  51  115:iconst_4        
			//*  52  116:iastore         
			//*  53  117:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  54  120:getstatic       #65  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXISTING_PROPERTY>
			//*  55  123:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  56  126:iconst_5        
			//*  57  127:iastore         
			//*  58  128:return          
			//*  59  129:astore_0        
			//*  60  130:return          
			//*  61  131:astore_0        
			//*  62  132:goto            117
			//*  63  135:astore_0        
			//*  64  136:goto            106
			//*  65  139:astore_0        
			//*  66  140:goto            95
			//*  67  143:astore_0        
			//*  68  144:goto            84
			//*  69  147:astore_0        
			//*  70  148:goto            64
			//*  71  151:astore_0        
			//*  72  152:goto            53
			//*  73  155:astore_0        
			//*  74  156:goto            42
			//*  75  159:astore_0        
			//*  76  160:goto            31
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   77  163:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror8) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror7) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CUSTOM.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[com.fasterxml.jackson.annotation.JsonTypeInfo.As.values().length];
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  78  164:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonTypeInfo.As[_includeAs.ordinal()])
	//*  14   22:getstatic       #53  <Field int[] StdTypeResolverBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  15   25:aload_0         
	//*  16   26:getfield        #55  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//*  17   29:invokevirtual   #61  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  18   32:iaload          
		{
	//*  19   33:tableswitch     1 5: default 68
	//	               1 98
	//	               2 120
	//	               3 146
	//	               4 168
	//	               5 120
		default:
			throw new IllegalStateException((new StringBuilder()).append("Do not know how to construct standard type serializer for inclusion type: ").append(((Object) (_includeAs))).toString());
	//   20   68:new             #63  <Class IllegalStateException>
	//   21   71:dup             
	//   22   72:new             #65  <Class StringBuilder>
	//   23   75:dup             
	//   24   76:invokespecial   #66  <Method void StringBuilder()>
	//   25   79:ldc1            #68  <String "Do not know how to construct standard type serializer for inclusion type: ">
	//   26   81:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   27   84:aload_0         
	//   28   85:getfield        #55  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//   29   88:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   30   91:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   31   94:invokespecial   #82  <Method void IllegalStateException(String)>
	//   32   97:athrow          

		case 1: // '\001'
			return ((TypeDeserializer) (new AsArrayTypeDeserializer(javatype, ((TypeIdResolver) (deserializationconfig)), _typeProperty, _typeIdVisible, _defaultImpl)));
	//   33   98:new             #84  <Class AsArrayTypeDeserializer>
	//   34  101:dup             
	//   35  102:aload_2         
	//   36  103:aload_1         
	//   37  104:aload_0         
	//   38  105:getfield        #86  <Field String _typeProperty>
	//   39  108:aload_0         
	//   40  109:getfield        #28  <Field boolean _typeIdVisible>
	//   41  112:aload_0         
	//   42  113:getfield        #88  <Field Class _defaultImpl>
	//   43  116:invokespecial   #91  <Method void AsArrayTypeDeserializer(JavaType, TypeIdResolver, String, boolean, Class)>
	//   44  119:areturn         

		case 2: // '\002'
		case 5: // '\005'
			return ((TypeDeserializer) (new AsPropertyTypeDeserializer(javatype, ((TypeIdResolver) (deserializationconfig)), _typeProperty, _typeIdVisible, _defaultImpl, _includeAs)));
	//   45  120:new             #93  <Class AsPropertyTypeDeserializer>
	//   46  123:dup             
	//   47  124:aload_2         
	//   48  125:aload_1         
	//   49  126:aload_0         
	//   50  127:getfield        #86  <Field String _typeProperty>
	//   51  130:aload_0         
	//   52  131:getfield        #28  <Field boolean _typeIdVisible>
	//   53  134:aload_0         
	//   54  135:getfield        #88  <Field Class _defaultImpl>
	//   55  138:aload_0         
	//   56  139:getfield        #55  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//   57  142:invokespecial   #96  <Method void AsPropertyTypeDeserializer(JavaType, TypeIdResolver, String, boolean, Class, com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//   58  145:areturn         

		case 3: // '\003'
			return ((TypeDeserializer) (new AsWrapperTypeDeserializer(javatype, ((TypeIdResolver) (deserializationconfig)), _typeProperty, _typeIdVisible, _defaultImpl)));
	//   59  146:new             #98  <Class AsWrapperTypeDeserializer>
	//   60  149:dup             
	//   61  150:aload_2         
	//   62  151:aload_1         
	//   63  152:aload_0         
	//   64  153:getfield        #86  <Field String _typeProperty>
	//   65  156:aload_0         
	//   66  157:getfield        #28  <Field boolean _typeIdVisible>
	//   67  160:aload_0         
	//   68  161:getfield        #88  <Field Class _defaultImpl>
	//   69  164:invokespecial   #99  <Method void AsWrapperTypeDeserializer(JavaType, TypeIdResolver, String, boolean, Class)>
	//   70  167:areturn         

		case 4: // '\004'
			return ((TypeDeserializer) (new AsExternalTypeDeserializer(javatype, ((TypeIdResolver) (deserializationconfig)), _typeProperty, _typeIdVisible, _defaultImpl)));
	//   71  168:new             #101 <Class AsExternalTypeDeserializer>
	//   72  171:dup             
	//   73  172:aload_2         
	//   74  173:aload_1         
	//   75  174:aload_0         
	//   76  175:getfield        #86  <Field String _typeProperty>
	//   77  178:aload_0         
	//   78  179:getfield        #28  <Field boolean _typeIdVisible>
	//   79  182:aload_0         
	//   80  183:getfield        #88  <Field Class _defaultImpl>
	//   81  186:invokespecial   #102 <Method void AsExternalTypeDeserializer(JavaType, TypeIdResolver, String, boolean, Class)>
	//   82  189:areturn         
		}
	}

	public TypeSerializer buildTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, Collection collection)
	{
		if(_idType == com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//*   2    4:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NONE>
	//*   3    7:if_acmpne       12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		serializationconfig = ((SerializationConfig) (idResolver(((MapperConfig) (serializationconfig)), javatype, collection, true, false)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_1        
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #49  <Method TypeIdResolver idResolver(MapperConfig, JavaType, Collection, boolean, boolean)>
	//   13   21:astore_1        
		switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonTypeInfo.As[_includeAs.ordinal()])
	//*  14   22:getstatic       #53  <Field int[] StdTypeResolverBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  15   25:aload_0         
	//*  16   26:getfield        #55  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//*  17   29:invokevirtual   #61  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  18   32:iaload          
		{
	//*  19   33:tableswitch     1 5: default 68
	//	               1 98
	//	               2 108
	//	               3 122
	//	               4 132
	//	               5 146
		default:
			throw new IllegalStateException((new StringBuilder()).append("Do not know how to construct standard type serializer for inclusion type: ").append(((Object) (_includeAs))).toString());
	//   20   68:new             #63  <Class IllegalStateException>
	//   21   71:dup             
	//   22   72:new             #65  <Class StringBuilder>
	//   23   75:dup             
	//   24   76:invokespecial   #66  <Method void StringBuilder()>
	//   25   79:ldc1            #68  <String "Do not know how to construct standard type serializer for inclusion type: ">
	//   26   81:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   27   84:aload_0         
	//   28   85:getfield        #55  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//   29   88:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   30   91:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   31   94:invokespecial   #82  <Method void IllegalStateException(String)>
	//   32   97:athrow          

		case 1: // '\001'
			return ((TypeSerializer) (new AsArrayTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//   33   98:new             #108 <Class AsArrayTypeSerializer>
	//   34  101:dup             
	//   35  102:aload_1         
	//   36  103:aconst_null     
	//   37  104:invokespecial   #111 <Method void AsArrayTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty)>
	//   38  107:areturn         

		case 2: // '\002'
			return ((TypeSerializer) (new AsPropertyTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)), _typeProperty)));
	//   39  108:new             #113 <Class AsPropertyTypeSerializer>
	//   40  111:dup             
	//   41  112:aload_1         
	//   42  113:aconst_null     
	//   43  114:aload_0         
	//   44  115:getfield        #86  <Field String _typeProperty>
	//   45  118:invokespecial   #116 <Method void AsPropertyTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty, String)>
	//   46  121:areturn         

		case 3: // '\003'
			return ((TypeSerializer) (new AsWrapperTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//   47  122:new             #118 <Class AsWrapperTypeSerializer>
	//   48  125:dup             
	//   49  126:aload_1         
	//   50  127:aconst_null     
	//   51  128:invokespecial   #119 <Method void AsWrapperTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty)>
	//   52  131:areturn         

		case 4: // '\004'
			return ((TypeSerializer) (new AsExternalTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)), _typeProperty)));
	//   53  132:new             #121 <Class AsExternalTypeSerializer>
	//   54  135:dup             
	//   55  136:aload_1         
	//   56  137:aconst_null     
	//   57  138:aload_0         
	//   58  139:getfield        #86  <Field String _typeProperty>
	//   59  142:invokespecial   #122 <Method void AsExternalTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty, String)>
	//   60  145:areturn         

		case 5: // '\005'
			return ((TypeSerializer) (new AsExistingPropertyTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)), _typeProperty)));
	//   61  146:new             #124 <Class AsExistingPropertyTypeSerializer>
	//   62  149:dup             
	//   63  150:aload_1         
	//   64  151:aconst_null     
	//   65  152:aload_0         
	//   66  153:getfield        #86  <Field String _typeProperty>
	//   67  156:invokespecial   #125 <Method void AsExistingPropertyTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty, String)>
	//   68  159:areturn         
		}
	}

	public volatile TypeResolverBuilder defaultImpl(Class class1)
	{
		return ((TypeResolverBuilder) (defaultImpl(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #131 <Method StdTypeResolverBuilder defaultImpl(Class)>
	//    3    5:areturn         
	}

	public StdTypeResolverBuilder defaultImpl(Class class1)
	{
		_defaultImpl = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field Class _defaultImpl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Class getDefaultImpl()
	{
		return _defaultImpl;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Class _defaultImpl>
	//    2    4:areturn         
	}

	public String getTypeProperty()
	{
		return _typeProperty;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String _typeProperty>
	//    2    4:areturn         
	}

	protected TypeIdResolver idResolver(MapperConfig mapperconfig, JavaType javatype, Collection collection, boolean flag, boolean flag1)
	{
		if(_customIdResolver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field TypeIdResolver _customIdResolver>
	//*   2    4:ifnull          12
			return _customIdResolver;
	//    3    7:aload_0         
	//    4    8:getfield        #138 <Field TypeIdResolver _customIdResolver>
	//    5   11:areturn         
		if(_idType == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//*   8   16:ifnonnull       29
			throw new IllegalStateException("Can not build, 'init()' not yet called");
	//    9   19:new             #63  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:ldc1            #140 <String "Can not build, 'init()' not yet called">
	//   12   25:invokespecial   #82  <Method void IllegalStateException(String)>
	//   13   28:athrow          
		switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonTypeInfo.Id[_idType.ordinal()])
	//*  14   29:getstatic       #143 <Field int[] StdTypeResolverBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
	//*  15   32:aload_0         
	//*  16   33:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//*  17   36:invokevirtual   #144 <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
	//*  18   39:iaload          
		{
	//*  19   40:tableswitch     1 4: default 72
	//	               1 102
	//	               2 115
	//	               3 128
	//	               4 139
		default:
			throw new IllegalStateException((new StringBuilder()).append("Do not know how to construct standard type id resolver for idType: ").append(((Object) (_idType))).toString());
	//   20   72:new             #63  <Class IllegalStateException>
	//   21   75:dup             
	//   22   76:new             #65  <Class StringBuilder>
	//   23   79:dup             
	//   24   80:invokespecial   #66  <Method void StringBuilder()>
	//   25   83:ldc1            #146 <String "Do not know how to construct standard type id resolver for idType: ">
	//   26   85:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   27   88:aload_0         
	//   28   89:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//   29   92:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   30   95:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   31   98:invokespecial   #82  <Method void IllegalStateException(String)>
	//   32  101:athrow          

		case 1: // '\001'
			return ((TypeIdResolver) (new ClassNameIdResolver(javatype, mapperconfig.getTypeFactory())));
	//   33  102:new             #148 <Class ClassNameIdResolver>
	//   34  105:dup             
	//   35  106:aload_2         
	//   36  107:aload_1         
	//   37  108:invokevirtual   #154 <Method com.fasterxml.jackson.databind.type.TypeFactory MapperConfig.getTypeFactory()>
	//   38  111:invokespecial   #157 <Method void ClassNameIdResolver(JavaType, com.fasterxml.jackson.databind.type.TypeFactory)>
	//   39  114:areturn         

		case 2: // '\002'
			return ((TypeIdResolver) (new MinimalClassNameIdResolver(javatype, mapperconfig.getTypeFactory())));
	//   40  115:new             #159 <Class MinimalClassNameIdResolver>
	//   41  118:dup             
	//   42  119:aload_2         
	//   43  120:aload_1         
	//   44  121:invokevirtual   #154 <Method com.fasterxml.jackson.databind.type.TypeFactory MapperConfig.getTypeFactory()>
	//   45  124:invokespecial   #160 <Method void MinimalClassNameIdResolver(JavaType, com.fasterxml.jackson.databind.type.TypeFactory)>
	//   46  127:areturn         

		case 3: // '\003'
			return ((TypeIdResolver) (TypeNameIdResolver.construct(mapperconfig, javatype, collection, flag, flag1)));
	//   47  128:aload_1         
	//   48  129:aload_2         
	//   49  130:aload_3         
	//   50  131:iload           4
	//   51  133:iload           5
	//   52  135:invokestatic    #166 <Method TypeNameIdResolver TypeNameIdResolver.construct(MapperConfig, JavaType, Collection, boolean, boolean)>
	//   53  138:areturn         

		case 4: // '\004'
			return null;
	//   54  139:aconst_null     
	//   55  140:areturn         
		}
	}

	public volatile TypeResolverBuilder inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
	{
		return ((TypeResolverBuilder) (inclusion(as)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #172 <Method StdTypeResolverBuilder inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//    3    5:areturn         
	}

	public StdTypeResolverBuilder inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
	{
		if(as == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("includeAs can not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #176 <String "includeAs can not be null">
	//    5   10:invokespecial   #177 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			_includeAs = as;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #55  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
			return this;
	//   10   19:aload_0         
	//   11   20:areturn         
		}
	}

	public volatile TypeResolverBuilder init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id id, TypeIdResolver typeidresolver)
	{
		return ((TypeResolverBuilder) (init(id, typeidresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #41  <Method StdTypeResolverBuilder init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, TypeIdResolver)>
	//    4    6:areturn         
	}

	public StdTypeResolverBuilder init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id id, TypeIdResolver typeidresolver)
	{
		if(id == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("idType can not be null");
	//    2    4:new             #174 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #180 <String "idType can not be null">
	//    5   10:invokespecial   #177 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			_idType = id;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
			_customIdResolver = typeidresolver;
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:putfield        #138 <Field TypeIdResolver _customIdResolver>
			_typeProperty = id.getDefaultPropertyName();
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #183 <Method String com.fasterxml.jackson.annotation.JsonTypeInfo$Id.getDefaultPropertyName()>
	//   16   29:putfield        #86  <Field String _typeProperty>
			return this;
	//   17   32:aload_0         
	//   18   33:areturn         
		}
	}

	public boolean isTypeIdVisible()
	{
		return _typeIdVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean _typeIdVisible>
	//    2    4:ireturn         
	}

	public volatile TypeResolverBuilder typeIdVisibility(boolean flag)
	{
		return ((TypeResolverBuilder) (typeIdVisibility(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #190 <Method StdTypeResolverBuilder typeIdVisibility(boolean)>
	//    3    5:areturn         
	}

	public StdTypeResolverBuilder typeIdVisibility(boolean flag)
	{
		_typeIdVisible = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field boolean _typeIdVisible>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile TypeResolverBuilder typeProperty(String s)
	{
		return ((TypeResolverBuilder) (typeProperty(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #195 <Method StdTypeResolverBuilder typeProperty(String)>
	//    3    5:areturn         
	}

	public StdTypeResolverBuilder typeProperty(String s)
	{
		String s1;
label0:
		{
			if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			{
				s1 = s;
	//    2    4:aload_1         
	//    3    5:astore_2        
				if(s.length() != 0)
					break label0;
	//    4    6:aload_1         
	//    5    7:invokevirtual   #200 <Method int String.length()>
	//    6   10:ifne            21
			}
			s1 = _idType.getDefaultPropertyName();
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//    9   17:invokevirtual   #183 <Method String com.fasterxml.jackson.annotation.JsonTypeInfo$Id.getDefaultPropertyName()>
	//   10   20:astore_2        
		}
		_typeProperty = s1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #86  <Field String _typeProperty>
		return this;
	//   14   26:aload_0         
	//   15   27:areturn         
	}

	protected TypeIdResolver _customIdResolver;
	protected Class _defaultImpl;
	protected com.fasterxml.jackson.annotation.JsonTypeInfo.Id _idType;
	protected com.fasterxml.jackson.annotation.JsonTypeInfo.As _includeAs;
	protected boolean _typeIdVisible;
	protected String _typeProperty;
}
