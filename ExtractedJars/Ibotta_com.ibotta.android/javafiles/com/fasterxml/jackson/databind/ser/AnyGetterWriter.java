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

	public void fixAccess(SerializationConfig serializationconfig)
	{
		_accessor.fixAccess(serializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotatedMember _accessor>
	//    2    4:aload_1         
	//    3    5:getstatic       #39  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    4    8:invokevirtual   #45  <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    5   11:invokevirtual   #50  <Method void AnnotatedMember.fixAccess(boolean)>
	//    6   14:return          
	}

	public void getAndFilter(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter)
		throws Exception
	{
		Object obj1 = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotatedMember _accessor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore          5
		if(obj1 == null)
	//*   5   10:aload           5
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(!(obj1 instanceof Map))
	//*   8   16:aload           5
	//*   9   18:instanceof      #60  <Class Map>
	//*  10   21:ifne            68
			serializerprovider.reportBadDefinition(_property.getType(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", new Object[] {
				_accessor.getName(), obj1.getClass().getName()
			}));
	//   11   24:aload_3         
	//   12   25:aload_0         
	//   13   26:getfield        #22  <Field BeanProperty _property>
	//   14   29:invokeinterface #66  <Method com.fasterxml.jackson.databind.JavaType BeanProperty.getType()>
	//   15   34:ldc1            #68  <String "Value returned by 'any-getter' (%s()) not java.util.Map but %s">
	//   16   36:iconst_2        
	//   17   37:anewarray       Object[]
	//   18   40:dup             
	//   19   41:iconst_0        
	//   20   42:aload_0         
	//   21   43:getfield        #20  <Field AnnotatedMember _accessor>
	//   22   46:invokevirtual   #72  <Method String AnnotatedMember.getName()>
	//   23   49:aastore         
	//   24   50:dup             
	//   25   51:iconst_1        
	//   26   52:aload           5
	//   27   54:invokevirtual   #76  <Method Class Object.getClass()>
	//   28   57:invokevirtual   #79  <Method String Class.getName()>
	//   29   60:aastore         
	//   30   61:invokestatic    #85  <Method String String.format(String, Object[])>
	//   31   64:invokevirtual   #91  <Method Object SerializerProvider.reportBadDefinition(com.fasterxml.jackson.databind.JavaType, String)>
	//   32   67:pop             
		MapSerializer mapserializer = _mapSerializer;
	//   33   68:aload_0         
	//   34   69:getfield        #28  <Field MapSerializer _mapSerializer>
	//   35   72:astore          6
		if(mapserializer != null)
	//*  36   74:aload           6
	//*  37   76:ifnull          96
		{
			mapserializer.serializeFilteredAnyProperties(serializerprovider, jsongenerator, obj, (Map)obj1, propertyfilter, ((Object) (null)));
	//   38   79:aload           6
	//   39   81:aload_3         
	//   40   82:aload_2         
	//   41   83:aload_1         
	//   42   84:aload           5
	//   43   86:checkcast       #60  <Class Map>
	//   44   89:aload           4
	//   45   91:aconst_null     
	//   46   92:invokevirtual   #95  <Method void MapSerializer.serializeFilteredAnyProperties(SerializerProvider, JsonGenerator, Object, Map, PropertyFilter, Object)>
			return;
	//   47   95:return          
		} else
		{
			_serializer.serialize(obj1, jsongenerator, serializerprovider);
	//   48   96:aload_0         
	//   49   97:getfield        #24  <Field JsonSerializer _serializer>
	//   50  100:aload           5
	//   51  102:aload_2         
	//   52  103:aload_3         
	//   53  104:invokevirtual   #101 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   54  107:return          
		}
	}

	public void getAndSerialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		obj = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotatedMember _accessor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore_1        
		if(obj == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       14
			return;
	//    7   13:return          
		if(!(obj instanceof Map))
	//*   8   14:aload_1         
	//*   9   15:instanceof      #60  <Class Map>
	//*  10   18:ifne            64
			serializerprovider.reportBadDefinition(_property.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[] {
				_accessor.getName(), obj.getClass().getName()
			}));
	//   11   21:aload_3         
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field BeanProperty _property>
	//   14   26:invokeinterface #66  <Method com.fasterxml.jackson.databind.JavaType BeanProperty.getType()>
	//   15   31:ldc1            #105 <String "Value returned by 'any-getter' %s() not java.util.Map but %s">
	//   16   33:iconst_2        
	//   17   34:anewarray       Object[]
	//   18   37:dup             
	//   19   38:iconst_0        
	//   20   39:aload_0         
	//   21   40:getfield        #20  <Field AnnotatedMember _accessor>
	//   22   43:invokevirtual   #72  <Method String AnnotatedMember.getName()>
	//   23   46:aastore         
	//   24   47:dup             
	//   25   48:iconst_1        
	//   26   49:aload_1         
	//   27   50:invokevirtual   #76  <Method Class Object.getClass()>
	//   28   53:invokevirtual   #79  <Method String Class.getName()>
	//   29   56:aastore         
	//   30   57:invokestatic    #85  <Method String String.format(String, Object[])>
	//   31   60:invokevirtual   #91  <Method Object SerializerProvider.reportBadDefinition(com.fasterxml.jackson.databind.JavaType, String)>
	//   32   63:pop             
		MapSerializer mapserializer = _mapSerializer;
	//   33   64:aload_0         
	//   34   65:getfield        #28  <Field MapSerializer _mapSerializer>
	//   35   68:astore          4
		if(mapserializer != null)
	//*  36   70:aload           4
	//*  37   72:ifnull          87
		{
			mapserializer.serializeFields((Map)obj, jsongenerator, serializerprovider);
	//   38   75:aload           4
	//   39   77:aload_1         
	//   40   78:checkcast       #60  <Class Map>
	//   41   81:aload_2         
	//   42   82:aload_3         
	//   43   83:invokevirtual   #109 <Method void MapSerializer.serializeFields(Map, JsonGenerator, SerializerProvider)>
			return;
	//   44   86:return          
		} else
		{
			_serializer.serialize(obj, jsongenerator, serializerprovider);
	//   45   87:aload_0         
	//   46   88:getfield        #24  <Field JsonSerializer _serializer>
	//   47   91:aload_1         
	//   48   92:aload_2         
	//   49   93:aload_3         
	//   50   94:invokevirtual   #101 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   51   97:return          
		}
	}

	public void resolve(SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _serializer;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field JsonSerializer _serializer>
	//    2    4:astore_2        
		if(jsonserializer instanceof ContextualSerializer)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #115 <Class ContextualSerializer>
	//*   5    9:ifeq            42
		{
			serializerprovider = ((SerializerProvider) (serializerprovider.handlePrimaryContextualization(jsonserializer, _property)));
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field BeanProperty _property>
	//   10   18:invokevirtual   #119 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   11   21:astore_1        
			_serializer = ((JsonSerializer) (serializerprovider));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #24  <Field JsonSerializer _serializer>
			if(serializerprovider instanceof MapSerializer)
	//*  15   27:aload_1         
	//*  16   28:instanceof      #26  <Class MapSerializer>
	//*  17   31:ifeq            42
				_mapSerializer = (MapSerializer)serializerprovider;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:checkcast       #26  <Class MapSerializer>
	//   21   39:putfield        #28  <Field MapSerializer _mapSerializer>
		}
	//   22   42:return          
	}

	protected final AnnotatedMember _accessor;
	protected MapSerializer _mapSerializer;
	protected final BeanProperty _property;
	protected JsonSerializer _serializer;
}
