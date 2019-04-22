// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

public abstract class TypeSerializer
{

	public TypeSerializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public abstract TypeSerializer forProperty(BeanProperty beanproperty);

	public abstract String getPropertyName();

	public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();

	public WritableTypeId typeId(Object obj, JsonToken jsontoken)
	{
		obj = ((Object) (new WritableTypeId(obj, jsontoken)));
	//    0    0:new             #21  <Class WritableTypeId>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #24  <Method void WritableTypeId(Object, JsonToken)>
	//    5    9:astore_1        
		static class _cls1
		{

			static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[com.fasterxml.jackson.annotation.JsonTypeInfo.As.values().length];
			//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As[] com.fasterxml.jackson.annotation.JsonTypeInfo$As.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXISTING_PROPERTY>
			//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
			//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
			//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
			//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
			//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
			//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonTypeInfo.As[getTypeInclusion().ordinal()])
	//*   6   10:getstatic       #28  <Field int[] TypeSerializer$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #30  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As getTypeInclusion()>
	//*   9   17:invokevirtual   #36  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  10   20:iaload          
		{
	//*  11   21:tableswitch     1 5: default 56
	//	               1 113
	//	               2 96
	//	               3 79
	//	               4 70
	//	               5 61
		default:
			VersionUtil.throwInternal();
	//   12   56:invokestatic    #41  <Method void VersionUtil.throwInternal()>
			return ((WritableTypeId) (obj));
	//   13   59:aload_1         
	//   14   60:areturn         

		case 5: // '\005'
			obj.include = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_OBJECT;
	//   15   61:aload_1         
	//   16   62:getstatic       #47  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.WRAPPER_OBJECT>
	//   17   65:putfield        #50  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
			return ((WritableTypeId) (obj));
	//   18   68:aload_1         
	//   19   69:areturn         

		case 4: // '\004'
			obj.include = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_ARRAY;
	//   20   70:aload_1         
	//   21   71:getstatic       #53  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.WRAPPER_ARRAY>
	//   22   74:putfield        #50  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
			return ((WritableTypeId) (obj));
	//   23   77:aload_1         
	//   24   78:areturn         

		case 3: // '\003'
			obj.include = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.METADATA_PROPERTY;
	//   25   79:aload_1         
	//   26   80:getstatic       #56  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.METADATA_PROPERTY>
	//   27   83:putfield        #50  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
			obj.asProperty = getPropertyName();
	//   28   86:aload_1         
	//   29   87:aload_0         
	//   30   88:invokevirtual   #58  <Method String getPropertyName()>
	//   31   91:putfield        #62  <Field String WritableTypeId.asProperty>
			return ((WritableTypeId) (obj));
	//   32   94:aload_1         
	//   33   95:areturn         

		case 2: // '\002'
			obj.include = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PARENT_PROPERTY;
	//   34   96:aload_1         
	//   35   97:getstatic       #65  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.PARENT_PROPERTY>
	//   36  100:putfield        #50  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
			obj.asProperty = getPropertyName();
	//   37  103:aload_1         
	//   38  104:aload_0         
	//   39  105:invokevirtual   #58  <Method String getPropertyName()>
	//   40  108:putfield        #62  <Field String WritableTypeId.asProperty>
			return ((WritableTypeId) (obj));
	//   41  111:aload_1         
	//   42  112:areturn         

		case 1: // '\001'
			obj.include = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
	//   43  113:aload_1         
	//   44  114:getstatic       #68  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion com.fasterxml.jackson.core.type.WritableTypeId$Inclusion.PAYLOAD_PROPERTY>
	//   45  117:putfield        #50  <Field com.fasterxml.jackson.core.type.WritableTypeId$Inclusion WritableTypeId.include>
			obj.asProperty = getPropertyName();
	//   46  120:aload_1         
	//   47  121:aload_0         
	//   48  122:invokevirtual   #58  <Method String getPropertyName()>
	//   49  125:putfield        #62  <Field String WritableTypeId.asProperty>
			return ((WritableTypeId) (obj));
	//   50  128:aload_1         
	//   51  129:areturn         
		}
	}

	public WritableTypeId typeId(Object obj, JsonToken jsontoken, Object obj1)
	{
		obj = ((Object) (typeId(obj, jsontoken)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #71  <Method WritableTypeId typeId(Object, JsonToken)>
	//    4    6:astore_1        
		obj.id = obj1;
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:putfield        #75  <Field Object WritableTypeId.id>
		return ((WritableTypeId) (obj));
	//    8   12:aload_1         
	//    9   13:areturn         
	}

	public WritableTypeId typeId(Object obj, Class class1, JsonToken jsontoken)
	{
		obj = ((Object) (typeId(obj, jsontoken)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #71  <Method WritableTypeId typeId(Object, JsonToken)>
	//    4    6:astore_1        
		obj.forValueType = class1;
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:putfield        #80  <Field Class WritableTypeId.forValueType>
		return ((WritableTypeId) (obj));
	//    8   12:aload_1         
	//    9   13:areturn         
	}

	public abstract WritableTypeId writeTypePrefix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
		throws IOException;

	public abstract WritableTypeId writeTypeSuffix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
		throws IOException;
}
