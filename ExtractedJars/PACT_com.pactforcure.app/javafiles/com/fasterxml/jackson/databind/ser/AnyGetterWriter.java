// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			ContextualSerializer, PropertyFilter

public class AnyGetterWriter
{

	public AnyGetterWriter(BeanProperty beanproperty, AnnotatedMember annotatedmember, JsonSerializer jsonserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		_accessor = annotatedmember;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #20  <Field AnnotatedMember _accessor>
		_property = beanproperty;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #22  <Field BeanProperty _property>
		_serializer = jsonserializer;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field JsonSerializer _serializer>
		if(jsonserializer instanceof MapSerializer)
	//*  11   19:aload_3         
	//*  12   20:instanceof      #26  <Class MapSerializer>
	//*  13   23:ifeq            34
			_mapSerializer = (MapSerializer)jsonserializer;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:checkcast       #26  <Class MapSerializer>
	//   17   31:putfield        #28  <Field MapSerializer _mapSerializer>
	//   18   34:return          
	}

	public void getAndFilter(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter)
		throws Exception
	{
		obj = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotatedMember _accessor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore_1        
		if(obj == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       14
			return;
	//    7   13:return          
		if(!(obj instanceof Map))
	//*   8   14:aload_1         
	//*   9   15:instanceof      #43  <Class Map>
	//*  10   18:ifne            66
			throw JsonMappingException.from(jsongenerator, (new StringBuilder()).append("Value returned by 'any-getter' (").append(_accessor.getName()).append("()) not java.util.Map but ").append(obj.getClass().getName()).toString());
	//   11   21:aload_2         
	//   12   22:new             #45  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #46  <Method void StringBuilder()>
	//   15   29:ldc1            #48  <String "Value returned by 'any-getter' (">
	//   16   31:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:aload_0         
	//   18   35:getfield        #20  <Field AnnotatedMember _accessor>
	//   19   38:invokevirtual   #56  <Method String AnnotatedMember.getName()>
	//   20   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:ldc1            #58  <String "()) not java.util.Map but ">
	//   22   46:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #62  <Method Class Object.getClass()>
	//   25   53:invokevirtual   #65  <Method String Class.getName()>
	//   26   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   28   62:invokestatic    #74  <Method JsonMappingException JsonMappingException.from(JsonGenerator, String)>
	//   29   65:athrow          
		if(_mapSerializer != null)
	//*  30   66:aload_0         
	//*  31   67:getfield        #28  <Field MapSerializer _mapSerializer>
	//*  32   70:ifnull          90
		{
			_mapSerializer.serializeFilteredFields((Map)obj, jsongenerator, serializerprovider, propertyfilter, ((Object) (null)));
	//   33   73:aload_0         
	//   34   74:getfield        #28  <Field MapSerializer _mapSerializer>
	//   35   77:aload_1         
	//   36   78:checkcast       #43  <Class Map>
	//   37   81:aload_2         
	//   38   82:aload_3         
	//   39   83:aload           4
	//   40   85:aconst_null     
	//   41   86:invokevirtual   #78  <Method void MapSerializer.serializeFilteredFields(Map, JsonGenerator, SerializerProvider, PropertyFilter, Object)>
			return;
	//   42   89:return          
		} else
		{
			_serializer.serialize(obj, jsongenerator, serializerprovider);
	//   43   90:aload_0         
	//   44   91:getfield        #24  <Field JsonSerializer _serializer>
	//   45   94:aload_1         
	//   46   95:aload_2         
	//   47   96:aload_3         
	//   48   97:invokevirtual   #84  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   49  100:return          
		}
	}

	public void getAndSerialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		obj = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotatedMember _accessor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore_1        
		if(obj == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       14
			return;
	//    7   13:return          
		if(!(obj instanceof Map))
	//*   8   14:aload_1         
	//*   9   15:instanceof      #43  <Class Map>
	//*  10   18:ifne            66
			throw JsonMappingException.from(jsongenerator, (new StringBuilder()).append("Value returned by 'any-getter' (").append(_accessor.getName()).append("()) not java.util.Map but ").append(obj.getClass().getName()).toString());
	//   11   21:aload_2         
	//   12   22:new             #45  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #46  <Method void StringBuilder()>
	//   15   29:ldc1            #48  <String "Value returned by 'any-getter' (">
	//   16   31:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:aload_0         
	//   18   35:getfield        #20  <Field AnnotatedMember _accessor>
	//   19   38:invokevirtual   #56  <Method String AnnotatedMember.getName()>
	//   20   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:ldc1            #58  <String "()) not java.util.Map but ">
	//   22   46:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #62  <Method Class Object.getClass()>
	//   25   53:invokevirtual   #65  <Method String Class.getName()>
	//   26   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   28   62:invokestatic    #74  <Method JsonMappingException JsonMappingException.from(JsonGenerator, String)>
	//   29   65:athrow          
		if(_mapSerializer != null)
	//*  30   66:aload_0         
	//*  31   67:getfield        #28  <Field MapSerializer _mapSerializer>
	//*  32   70:ifnull          87
		{
			_mapSerializer.serializeFields((Map)obj, jsongenerator, serializerprovider);
	//   33   73:aload_0         
	//   34   74:getfield        #28  <Field MapSerializer _mapSerializer>
	//   35   77:aload_1         
	//   36   78:checkcast       #43  <Class Map>
	//   37   81:aload_2         
	//   38   82:aload_3         
	//   39   83:invokevirtual   #90  <Method void MapSerializer.serializeFields(Map, JsonGenerator, SerializerProvider)>
			return;
	//   40   86:return          
		} else
		{
			_serializer.serialize(obj, jsongenerator, serializerprovider);
	//   41   87:aload_0         
	//   42   88:getfield        #24  <Field JsonSerializer _serializer>
	//   43   91:aload_1         
	//   44   92:aload_2         
	//   45   93:aload_3         
	//   46   94:invokevirtual   #84  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   47   97:return          
		}
	}

	public void resolve(SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(_serializer instanceof ContextualSerializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field JsonSerializer _serializer>
	//*   2    4:instanceof      #94  <Class ContextualSerializer>
	//*   3    7:ifeq            43
		{
			serializerprovider = ((SerializerProvider) (serializerprovider.handlePrimaryContextualization(_serializer, _property)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field JsonSerializer _serializer>
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field BeanProperty _property>
	//    9   19:invokevirtual   #100 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   10   22:astore_1        
			_serializer = ((JsonSerializer) (serializerprovider));
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #24  <Field JsonSerializer _serializer>
			if(serializerprovider instanceof MapSerializer)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #26  <Class MapSerializer>
	//*  16   32:ifeq            43
				_mapSerializer = (MapSerializer)serializerprovider;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:checkcast       #26  <Class MapSerializer>
	//   20   40:putfield        #28  <Field MapSerializer _mapSerializer>
		}
	//   21   43:return          
	}

	protected final AnnotatedMember _accessor;
	protected MapSerializer _mapSerializer;
	protected final BeanProperty _property;
	protected JsonSerializer _serializer;
}
