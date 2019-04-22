// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			AsExternalTypeDeserializer, AsWrapperTypeDeserializer, AsPropertyTypeDeserializer, AsArrayTypeDeserializer, 
//			AsExistingPropertyTypeSerializer, AsExternalTypeSerializer, AsWrapperTypeSerializer, AsPropertyTypeSerializer, 
//			AsArrayTypeSerializer, TypeNameIdResolver, MinimalClassNameIdResolver, ClassNameIdResolver

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
		if(javatype.isPrimitive())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #51  <Method boolean JavaType.isPrimitive()>
	//*   8   16:ifeq            21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		collection = ((Collection) (idResolver(((MapperConfig) (deserializationconfig)), javatype, collection, false, true)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:iconst_0        
	//   16   26:iconst_1        
	//   17   27:invokevirtual   #55  <Method TypeIdResolver idResolver(MapperConfig, JavaType, Collection, boolean, boolean)>
	//   18   30:astore_3        
		Class class1 = _defaultImpl;
	//   19   31:aload_0         
	//   20   32:getfield        #57  <Field Class _defaultImpl>
	//   21   35:astore          4
		if(class1 == null)
	//*  22   37:aload           4
	//*  23   39:ifnonnull       47
			deserializationconfig = null;
	//   24   42:aconst_null     
	//   25   43:astore_1        
		else
	//*  26   44:goto            92
		if(class1 != java/lang/Void && class1 != com/fasterxml/jackson/databind/annotation/NoClass)
	//*  27   47:aload           4
	//*  28   49:ldc1            #59  <Class Void>
	//*  29   51:if_acmpeq       80
	//*  30   54:aload           4
	//*  31   56:ldc1            #61  <Class NoClass>
	//*  32   58:if_acmpne       64
	//*  33   61:goto            80
			deserializationconfig = ((DeserializationConfig) (deserializationconfig.getTypeFactory().constructSpecializedType(javatype, _defaultImpl)));
	//   34   64:aload_1         
	//   35   65:invokevirtual   #67  <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//   36   68:aload_2         
	//   37   69:aload_0         
	//   38   70:getfield        #57  <Field Class _defaultImpl>
	//   39   73:invokevirtual   #73  <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   40   76:astore_1        
		else
	//*  41   77:goto            92
			deserializationconfig = ((DeserializationConfig) (deserializationconfig.getTypeFactory().constructType(((java.lang.reflect.Type) (_defaultImpl)))));
	//   42   80:aload_1         
	//   43   81:invokevirtual   #67  <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//   44   84:aload_0         
	//   45   85:getfield        #57  <Field Class _defaultImpl>
	//   46   88:invokevirtual   #77  <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//   47   91:astore_1        
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
				catch(NoSuchFieldError nosuchfielderror) { }
			//   59  129:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 2;
				}
			//*  60  130:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   61  133:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME.ordinal()] = 3;
				}
			//*  62  134:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   63  137:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE.ordinal()] = 4;
				}
			//*  64  138:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   65  141:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CUSTOM.ordinal()] = 5;
				}
			//*  66  142:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   67  145:astore_0        
				$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[com.fasterxml.jackson.annotation.JsonTypeInfo.As.values().length];
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
				}
			//*  68  146:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   69  149:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
				}
			//*  70  150:goto            84
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   71  153:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
				}
			//*  72  154:goto            95
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   73  157:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
				}
			//*  74  158:goto            106
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   75  161:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
				}
			//*  76  162:goto            117
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   77  165:astore_0        
			//*  78  166:return          
			}
		}

		switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonTypeInfo.As[_includeAs.ordinal()])
	//*  48   92:getstatic       #81  <Field int[] StdTypeResolverBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  49   95:aload_0         
	//*  50   96:getfield        #83  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//*  51   99:invokevirtual   #89  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  52  102:iaload          
		{
	//*  53  103:tableswitch     1 5: default 136
	//	               1 233
	//	               2 210
	//	               3 191
	//	               4 172
	//	               5 210
		default:
			deserializationconfig = ((DeserializationConfig) (new StringBuilder()));
	//   54  136:new             #91  <Class StringBuilder>
	//   55  139:dup             
	//   56  140:invokespecial   #92  <Method void StringBuilder()>
	//   57  143:astore_1        
			((StringBuilder) (deserializationconfig)).append("Do not know how to construct standard type serializer for inclusion type: ");
	//   58  144:aload_1         
	//   59  145:ldc1            #94  <String "Do not know how to construct standard type serializer for inclusion type: ">
	//   60  147:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   61  150:pop             
			((StringBuilder) (deserializationconfig)).append(((Object) (_includeAs)));
	//   62  151:aload_1         
	//   63  152:aload_0         
	//   64  153:getfield        #83  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//   65  156:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   66  159:pop             
			throw new IllegalStateException(((StringBuilder) (deserializationconfig)).toString());
	//   67  160:new             #103 <Class IllegalStateException>
	//   68  163:dup             
	//   69  164:aload_1         
	//   70  165:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   71  168:invokespecial   #110 <Method void IllegalStateException(String)>
	//   72  171:athrow          

		case 4: // '\004'
			return ((TypeDeserializer) (new AsExternalTypeDeserializer(javatype, ((TypeIdResolver) (collection)), _typeProperty, _typeIdVisible, ((JavaType) (deserializationconfig)))));
	//   73  172:new             #112 <Class AsExternalTypeDeserializer>
	//   74  175:dup             
	//   75  176:aload_2         
	//   76  177:aload_3         
	//   77  178:aload_0         
	//   78  179:getfield        #114 <Field String _typeProperty>
	//   79  182:aload_0         
	//   80  183:getfield        #28  <Field boolean _typeIdVisible>
	//   81  186:aload_1         
	//   82  187:invokespecial   #117 <Method void AsExternalTypeDeserializer(JavaType, TypeIdResolver, String, boolean, JavaType)>
	//   83  190:areturn         

		case 3: // '\003'
			return ((TypeDeserializer) (new AsWrapperTypeDeserializer(javatype, ((TypeIdResolver) (collection)), _typeProperty, _typeIdVisible, ((JavaType) (deserializationconfig)))));
	//   84  191:new             #119 <Class AsWrapperTypeDeserializer>
	//   85  194:dup             
	//   86  195:aload_2         
	//   87  196:aload_3         
	//   88  197:aload_0         
	//   89  198:getfield        #114 <Field String _typeProperty>
	//   90  201:aload_0         
	//   91  202:getfield        #28  <Field boolean _typeIdVisible>
	//   92  205:aload_1         
	//   93  206:invokespecial   #120 <Method void AsWrapperTypeDeserializer(JavaType, TypeIdResolver, String, boolean, JavaType)>
	//   94  209:areturn         

		case 2: // '\002'
		case 5: // '\005'
			return ((TypeDeserializer) (new AsPropertyTypeDeserializer(javatype, ((TypeIdResolver) (collection)), _typeProperty, _typeIdVisible, ((JavaType) (deserializationconfig)), _includeAs)));
	//   95  210:new             #122 <Class AsPropertyTypeDeserializer>
	//   96  213:dup             
	//   97  214:aload_2         
	//   98  215:aload_3         
	//   99  216:aload_0         
	//  100  217:getfield        #114 <Field String _typeProperty>
	//  101  220:aload_0         
	//  102  221:getfield        #28  <Field boolean _typeIdVisible>
	//  103  224:aload_1         
	//  104  225:aload_0         
	//  105  226:getfield        #83  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//  106  229:invokespecial   #125 <Method void AsPropertyTypeDeserializer(JavaType, TypeIdResolver, String, boolean, JavaType, com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//  107  232:areturn         

		case 1: // '\001'
			return ((TypeDeserializer) (new AsArrayTypeDeserializer(javatype, ((TypeIdResolver) (collection)), _typeProperty, _typeIdVisible, ((JavaType) (deserializationconfig)))));
	//  108  233:new             #127 <Class AsArrayTypeDeserializer>
	//  109  236:dup             
	//  110  237:aload_2         
	//  111  238:aload_3         
	//  112  239:aload_0         
	//  113  240:getfield        #114 <Field String _typeProperty>
	//  114  243:aload_0         
	//  115  244:getfield        #28  <Field boolean _typeIdVisible>
	//  116  247:aload_1         
	//  117  248:invokespecial   #128 <Method void AsArrayTypeDeserializer(JavaType, TypeIdResolver, String, boolean, JavaType)>
	//  118  251:areturn         
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
		if(javatype.isPrimitive())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #51  <Method boolean JavaType.isPrimitive()>
	//*   8   16:ifeq            21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		serializationconfig = ((SerializationConfig) (idResolver(((MapperConfig) (serializationconfig)), javatype, collection, true, false)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:iconst_1        
	//   16   26:iconst_0        
	//   17   27:invokevirtual   #55  <Method TypeIdResolver idResolver(MapperConfig, JavaType, Collection, boolean, boolean)>
	//   18   30:astore_1        
		switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonTypeInfo.As[_includeAs.ordinal()])
	//*  19   31:getstatic       #81  <Field int[] StdTypeResolverBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  20   34:aload_0         
	//*  21   35:getfield        #83  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//*  22   38:invokevirtual   #89  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  23   41:iaload          
		{
	//*  24   42:tableswitch     1 5: default 76
	//	               1 164
	//	               2 150
	//	               3 140
	//	               4 126
	//	               5 112
		default:
			serializationconfig = ((SerializationConfig) (new StringBuilder()));
	//   25   76:new             #91  <Class StringBuilder>
	//   26   79:dup             
	//   27   80:invokespecial   #92  <Method void StringBuilder()>
	//   28   83:astore_1        
			((StringBuilder) (serializationconfig)).append("Do not know how to construct standard type serializer for inclusion type: ");
	//   29   84:aload_1         
	//   30   85:ldc1            #94  <String "Do not know how to construct standard type serializer for inclusion type: ">
	//   31   87:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   32   90:pop             
			((StringBuilder) (serializationconfig)).append(((Object) (_includeAs)));
	//   33   91:aload_1         
	//   34   92:aload_0         
	//   35   93:getfield        #83  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
	//   36   96:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   37   99:pop             
			throw new IllegalStateException(((StringBuilder) (serializationconfig)).toString());
	//   38  100:new             #103 <Class IllegalStateException>
	//   39  103:dup             
	//   40  104:aload_1         
	//   41  105:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   42  108:invokespecial   #110 <Method void IllegalStateException(String)>
	//   43  111:athrow          

		case 5: // '\005'
			return ((TypeSerializer) (new AsExistingPropertyTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)), _typeProperty)));
	//   44  112:new             #134 <Class AsExistingPropertyTypeSerializer>
	//   45  115:dup             
	//   46  116:aload_1         
	//   47  117:aconst_null     
	//   48  118:aload_0         
	//   49  119:getfield        #114 <Field String _typeProperty>
	//   50  122:invokespecial   #137 <Method void AsExistingPropertyTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty, String)>
	//   51  125:areturn         

		case 4: // '\004'
			return ((TypeSerializer) (new AsExternalTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)), _typeProperty)));
	//   52  126:new             #139 <Class AsExternalTypeSerializer>
	//   53  129:dup             
	//   54  130:aload_1         
	//   55  131:aconst_null     
	//   56  132:aload_0         
	//   57  133:getfield        #114 <Field String _typeProperty>
	//   58  136:invokespecial   #140 <Method void AsExternalTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty, String)>
	//   59  139:areturn         

		case 3: // '\003'
			return ((TypeSerializer) (new AsWrapperTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//   60  140:new             #142 <Class AsWrapperTypeSerializer>
	//   61  143:dup             
	//   62  144:aload_1         
	//   63  145:aconst_null     
	//   64  146:invokespecial   #145 <Method void AsWrapperTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty)>
	//   65  149:areturn         

		case 2: // '\002'
			return ((TypeSerializer) (new AsPropertyTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)), _typeProperty)));
	//   66  150:new             #147 <Class AsPropertyTypeSerializer>
	//   67  153:dup             
	//   68  154:aload_1         
	//   69  155:aconst_null     
	//   70  156:aload_0         
	//   71  157:getfield        #114 <Field String _typeProperty>
	//   72  160:invokespecial   #148 <Method void AsPropertyTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty, String)>
	//   73  163:areturn         

		case 1: // '\001'
			return ((TypeSerializer) (new AsArrayTypeSerializer(((TypeIdResolver) (serializationconfig)), ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//   74  164:new             #150 <Class AsArrayTypeSerializer>
	//   75  167:dup             
	//   76  168:aload_1         
	//   77  169:aconst_null     
	//   78  170:invokespecial   #151 <Method void AsArrayTypeSerializer(TypeIdResolver, com.fasterxml.jackson.databind.BeanProperty)>
	//   79  173:areturn         
		}
	}

	public volatile TypeResolverBuilder defaultImpl(Class class1)
	{
		return ((TypeResolverBuilder) (defaultImpl(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #157 <Method StdTypeResolverBuilder defaultImpl(Class)>
	//    3    5:areturn         
	}

	public StdTypeResolverBuilder defaultImpl(Class class1)
	{
		_defaultImpl = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Class _defaultImpl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Class getDefaultImpl()
	{
		return _defaultImpl;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Class _defaultImpl>
	//    2    4:areturn         
	}

	protected TypeIdResolver idResolver(MapperConfig mapperconfig, JavaType javatype, Collection collection, boolean flag, boolean flag1)
	{
		TypeIdResolver typeidresolver = _customIdResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field TypeIdResolver _customIdResolver>
	//    2    4:astore          6
		if(typeidresolver != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          14
			return typeidresolver;
	//    5   11:aload           6
	//    6   13:areturn         
		if(_idType != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//*   9   18:ifnull          139
			switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonTypeInfo.Id[_idType.ordinal()])
	//*  10   21:getstatic       #166 <Field int[] StdTypeResolverBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
	//*  11   24:aload_0         
	//*  12   25:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//*  13   28:invokevirtual   #167 <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
	//*  14   31:iaload          
			{
	//*  15   32:tableswitch     1 4: default 64
	//	               1 126
	//	               2 113
	//	               3 102
	//	               4 100
			default:
				mapperconfig = ((MapperConfig) (new StringBuilder()));
	//   16   64:new             #91  <Class StringBuilder>
	//   17   67:dup             
	//   18   68:invokespecial   #92  <Method void StringBuilder()>
	//   19   71:astore_1        
				((StringBuilder) (mapperconfig)).append("Do not know how to construct standard type id resolver for idType: ");
	//   20   72:aload_1         
	//   21   73:ldc1            #169 <String "Do not know how to construct standard type id resolver for idType: ">
	//   22   75:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   23   78:pop             
				((StringBuilder) (mapperconfig)).append(((Object) (_idType)));
	//   24   79:aload_1         
	//   25   80:aload_0         
	//   26   81:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//   27   84:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   28   87:pop             
				throw new IllegalStateException(((StringBuilder) (mapperconfig)).toString());
	//   29   88:new             #103 <Class IllegalStateException>
	//   30   91:dup             
	//   31   92:aload_1         
	//   32   93:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   33   96:invokespecial   #110 <Method void IllegalStateException(String)>
	//   34   99:athrow          

			case 4: // '\004'
				return null;
	//   35  100:aconst_null     
	//   36  101:areturn         

			case 3: // '\003'
				return ((TypeIdResolver) (TypeNameIdResolver.construct(mapperconfig, javatype, collection, flag, flag1)));
	//   37  102:aload_1         
	//   38  103:aload_2         
	//   39  104:aload_3         
	//   40  105:iload           4
	//   41  107:iload           5
	//   42  109:invokestatic    #175 <Method TypeNameIdResolver TypeNameIdResolver.construct(MapperConfig, JavaType, Collection, boolean, boolean)>
	//   43  112:areturn         

			case 2: // '\002'
				return ((TypeIdResolver) (new MinimalClassNameIdResolver(javatype, mapperconfig.getTypeFactory())));
	//   44  113:new             #177 <Class MinimalClassNameIdResolver>
	//   45  116:dup             
	//   46  117:aload_2         
	//   47  118:aload_1         
	//   48  119:invokevirtual   #180 <Method TypeFactory MapperConfig.getTypeFactory()>
	//   49  122:invokespecial   #183 <Method void MinimalClassNameIdResolver(JavaType, TypeFactory)>
	//   50  125:areturn         

			case 1: // '\001'
				return ((TypeIdResolver) (new ClassNameIdResolver(javatype, mapperconfig.getTypeFactory())));
	//   51  126:new             #185 <Class ClassNameIdResolver>
	//   52  129:dup             
	//   53  130:aload_2         
	//   54  131:aload_1         
	//   55  132:invokevirtual   #180 <Method TypeFactory MapperConfig.getTypeFactory()>
	//   56  135:invokespecial   #186 <Method void ClassNameIdResolver(JavaType, TypeFactory)>
	//   57  138:areturn         
			}
		else
			throw new IllegalStateException("Cannot build, 'init()' not yet called");
	//   58  139:new             #103 <Class IllegalStateException>
	//   59  142:dup             
	//   60  143:ldc1            #188 <String "Cannot build, 'init()' not yet called">
	//   61  145:invokespecial   #110 <Method void IllegalStateException(String)>
	//   62  148:athrow          
	}

	public volatile TypeResolverBuilder inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
	{
		return ((TypeResolverBuilder) (inclusion(as)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method StdTypeResolverBuilder inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//    3    5:areturn         
	}

	public StdTypeResolverBuilder inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
	{
		if(as != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
		{
			_includeAs = as;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #83  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As _includeAs>
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		} else
		{
			throw new IllegalArgumentException("includeAs cannot be null");
	//    7   11:new             #196 <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc1            #198 <String "includeAs cannot be null">
	//   10   17:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//   11   20:athrow          
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
		if(id != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
		{
			_idType = id;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
			_customIdResolver = typeidresolver;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #163 <Field TypeIdResolver _customIdResolver>
			_typeProperty = id.getDefaultPropertyName();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #203 <Method String com.fasterxml.jackson.annotation.JsonTypeInfo$Id.getDefaultPropertyName()>
	//   11   19:putfield        #114 <Field String _typeProperty>
			return this;
	//   12   22:aload_0         
	//   13   23:areturn         
		} else
		{
			throw new IllegalArgumentException("idType cannot be null");
	//   14   24:new             #196 <Class IllegalArgumentException>
	//   15   27:dup             
	//   16   28:ldc1            #205 <String "idType cannot be null">
	//   17   30:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//   18   33:athrow          
		}
	}

	public volatile TypeResolverBuilder typeIdVisibility(boolean flag)
	{
		return ((TypeResolverBuilder) (typeIdVisibility(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #210 <Method StdTypeResolverBuilder typeIdVisibility(boolean)>
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
	//    2    2:invokevirtual   #215 <Method StdTypeResolverBuilder typeProperty(String)>
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
	//    5    7:invokevirtual   #220 <Method int String.length()>
	//    6   10:ifne            21
			}
			s1 = _idType.getDefaultPropertyName();
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id _idType>
	//    9   17:invokevirtual   #203 <Method String com.fasterxml.jackson.annotation.JsonTypeInfo$Id.getDefaultPropertyName()>
	//   10   20:astore_2        
		}
		_typeProperty = s1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #114 <Field String _typeProperty>
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
