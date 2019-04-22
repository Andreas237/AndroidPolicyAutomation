// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyValueBuffer, PropertyBasedCreator, BeanPropertyMap

public class ExternalTypeHandler
{
	public static class Builder
	{

		private void _addPropertyIndex(String s, Integer integer)
		{
			Object obj = _nameToPropertyIndex.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Map _nameToPropertyIndex>
		//    2    4:aload_1         
		//    3    5:invokeinterface #41  <Method Object Map.get(Object)>
		//    4   10:astore_3        
			if(obj == null)
		//*   5   11:aload_3         
		//*   6   12:ifnonnull       28
			{
				_nameToPropertyIndex.put(((Object) (s)), ((Object) (integer)));
		//    7   15:aload_0         
		//    8   16:getfield        #30  <Field Map _nameToPropertyIndex>
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokeinterface #45  <Method Object Map.put(Object, Object)>
		//   12   26:pop             
				return;
		//   13   27:return          
			}
			if(obj instanceof List)
		//*  14   28:aload_3         
		//*  15   29:instanceof      #47  <Class List>
		//*  16   32:ifeq            47
			{
				((List)obj).add(((Object) (integer)));
		//   17   35:aload_3         
		//   18   36:checkcast       #47  <Class List>
		//   19   39:aload_2         
		//   20   40:invokeinterface #51  <Method boolean List.add(Object)>
		//   21   45:pop             
				return;
		//   22   46:return          
			} else
			{
				LinkedList linkedlist = new LinkedList();
		//   23   47:new             #53  <Class LinkedList>
		//   24   50:dup             
		//   25   51:invokespecial   #54  <Method void LinkedList()>
		//   26   54:astore          4
				((List) (linkedlist)).add(obj);
		//   27   56:aload           4
		//   28   58:aload_3         
		//   29   59:invokeinterface #51  <Method boolean List.add(Object)>
		//   30   64:pop             
				((List) (linkedlist)).add(((Object) (integer)));
		//   31   65:aload           4
		//   32   67:aload_2         
		//   33   68:invokeinterface #51  <Method boolean List.add(Object)>
		//   34   73:pop             
				_nameToPropertyIndex.put(((Object) (s)), ((Object) (linkedlist)));
		//   35   74:aload_0         
		//   36   75:getfield        #30  <Field Map _nameToPropertyIndex>
		//   37   78:aload_1         
		//   38   79:aload           4
		//   39   81:invokeinterface #45  <Method Object Map.put(Object, Object)>
		//   40   86:pop             
				return;
		//   41   87:return          
			}
		}

		public void addExternal(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
		{
			Integer integer = Integer.valueOf(_properties.size());
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field List _properties>
		//    2    4:invokeinterface #60  <Method int List.size()>
		//    3    9:invokestatic    #66  <Method Integer Integer.valueOf(int)>
		//    4   12:astore_3        
			_properties.add(((Object) (new ExtTypedProperty(settablebeanproperty, typedeserializer))));
		//    5   13:aload_0         
		//    6   14:getfield        #25  <Field List _properties>
		//    7   17:new             #68  <Class ExternalTypeHandler$ExtTypedProperty>
		//    8   20:dup             
		//    9   21:aload_1         
		//   10   22:aload_2         
		//   11   23:invokespecial   #70  <Method void ExternalTypeHandler$ExtTypedProperty(SettableBeanProperty, TypeDeserializer)>
		//   12   26:invokeinterface #51  <Method boolean List.add(Object)>
		//   13   31:pop             
			_addPropertyIndex(settablebeanproperty.getName(), integer);
		//   14   32:aload_0         
		//   15   33:aload_1         
		//   16   34:invokevirtual   #76  <Method String SettableBeanProperty.getName()>
		//   17   37:aload_3         
		//   18   38:invokespecial   #78  <Method void _addPropertyIndex(String, Integer)>
			_addPropertyIndex(typedeserializer.getPropertyName(), integer);
		//   19   41:aload_0         
		//   20   42:aload_2         
		//   21   43:invokevirtual   #83  <Method String TypeDeserializer.getPropertyName()>
		//   22   46:aload_3         
		//   23   47:invokespecial   #78  <Method void _addPropertyIndex(String, Integer)>
		//   24   50:return          
		}

		public ExternalTypeHandler build(BeanPropertyMap beanpropertymap)
		{
			int j = _properties.size();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field List _properties>
		//    2    4:invokeinterface #60  <Method int List.size()>
		//    3    9:istore_3        
			ExtTypedProperty aexttypedproperty[] = new ExtTypedProperty[j];
		//    4   10:iload_3         
		//    5   11:anewarray       ExtTypedProperty[]
		//    6   14:astore          4
			for(int i = 0; i < j; i++)
		//*   7   16:iconst_0        
		//*   8   17:istore_2        
		//*   9   18:iload_2         
		//*  10   19:iload_3         
		//*  11   20:icmpge          74
			{
				ExtTypedProperty exttypedproperty = (ExtTypedProperty)_properties.get(i);
		//   12   23:aload_0         
		//   13   24:getfield        #25  <Field List _properties>
		//   14   27:iload_2         
		//   15   28:invokeinterface #88  <Method Object List.get(int)>
		//   16   33:checkcast       #68  <Class ExternalTypeHandler$ExtTypedProperty>
		//   17   36:astore          5
				SettableBeanProperty settablebeanproperty = beanpropertymap.find(exttypedproperty.getTypePropertyName());
		//   18   38:aload_1         
		//   19   39:aload           5
		//   20   41:invokevirtual   #91  <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
		//   21   44:invokevirtual   #97  <Method SettableBeanProperty BeanPropertyMap.find(String)>
		//   22   47:astore          6
				if(settablebeanproperty != null)
		//*  23   49:aload           6
		//*  24   51:ifnull          61
					exttypedproperty.linkTypeProperty(settablebeanproperty);
		//   25   54:aload           5
		//   26   56:aload           6
		//   27   58:invokevirtual   #101 <Method void ExternalTypeHandler$ExtTypedProperty.linkTypeProperty(SettableBeanProperty)>
				aexttypedproperty[i] = exttypedproperty;
		//   28   61:aload           4
		//   29   63:iload_2         
		//   30   64:aload           5
		//   31   66:aastore         
			}

		//   32   67:iload_2         
		//   33   68:iconst_1        
		//   34   69:iadd            
		//   35   70:istore_2        
		//*  36   71:goto            18
			return new ExternalTypeHandler(_beanType, aexttypedproperty, _nameToPropertyIndex, ((String []) (null)), ((TokenBuffer []) (null)));
		//   37   74:new             #6   <Class ExternalTypeHandler>
		//   38   77:dup             
		//   39   78:aload_0         
		//   40   79:getfield        #32  <Field JavaType _beanType>
		//   41   82:aload           4
		//   42   84:aload_0         
		//   43   85:getfield        #30  <Field Map _nameToPropertyIndex>
		//   44   88:aconst_null     
		//   45   89:aconst_null     
		//   46   90:invokespecial   #104 <Method void ExternalTypeHandler(JavaType, ExternalTypeHandler$ExtTypedProperty[], Map, String[], TokenBuffer[])>
		//   47   93:areturn         
		}

		private final JavaType _beanType;
		private final Map _nameToPropertyIndex = new HashMap();
		private final List _properties = new ArrayList();

		protected Builder(JavaType javatype)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #22  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #23  <Method void ArrayList()>
		//    6   12:putfield        #25  <Field List _properties>
		//    7   15:aload_0         
		//    8   16:new             #27  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #28  <Method void HashMap()>
		//   11   23:putfield        #30  <Field Map _nameToPropertyIndex>
			_beanType = javatype;
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:putfield        #32  <Field JavaType _beanType>
		//   15   31:return          
		}
	}

	private static final class ExtTypedProperty
	{

		public String getDefaultTypeId()
		{
			Class class1 = _typeDeserializer.getDefaultImpl();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field TypeDeserializer _typeDeserializer>
		//    2    4:invokevirtual   #37  <Method Class TypeDeserializer.getDefaultImpl()>
		//    3    7:astore_1        
			if(class1 == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       14
				return null;
		//    6   12:aconst_null     
		//    7   13:areturn         
			else
				return _typeDeserializer.getTypeIdResolver().idFromValueAndType(((Object) (null)), class1);
		//    8   14:aload_0         
		//    9   15:getfield        #23  <Field TypeDeserializer _typeDeserializer>
		//   10   18:invokevirtual   #41  <Method TypeIdResolver TypeDeserializer.getTypeIdResolver()>
		//   11   21:aconst_null     
		//   12   22:aload_1         
		//   13   23:invokeinterface #47  <Method String TypeIdResolver.idFromValueAndType(Object, Class)>
		//   14   28:areturn         
		}

		public SettableBeanProperty getProperty()
		{
			return _property;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field SettableBeanProperty _property>
		//    2    4:areturn         
		}

		public SettableBeanProperty getTypeProperty()
		{
			return _typeProperty;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field SettableBeanProperty _typeProperty>
		//    2    4:areturn         
		}

		public String getTypePropertyName()
		{
			return _typePropertyName;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field String _typePropertyName>
		//    2    4:areturn         
		}

		public boolean hasDefaultType()
		{
			return _typeDeserializer.getDefaultImpl() != null;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field TypeDeserializer _typeDeserializer>
		//    2    4:invokevirtual   #37  <Method Class TypeDeserializer.getDefaultImpl()>
		//    3    7:ifnull          12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public boolean hasTypePropertyName(String s)
		{
			return s.equals(((Object) (_typePropertyName)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #31  <Field String _typePropertyName>
		//    3    5:invokevirtual   #63  <Method boolean String.equals(Object)>
		//    4    8:ireturn         
		}

		public void linkTypeProperty(SettableBeanProperty settablebeanproperty)
		{
			_typeProperty = settablebeanproperty;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field SettableBeanProperty _typeProperty>
		//    3    5:return          
		}

		private final SettableBeanProperty _property;
		private final TypeDeserializer _typeDeserializer;
		private SettableBeanProperty _typeProperty;
		private final String _typePropertyName;

		public ExtTypedProperty(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			_property = settablebeanproperty;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field SettableBeanProperty _property>
			_typeDeserializer = typedeserializer;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field TypeDeserializer _typeDeserializer>
			_typePropertyName = typedeserializer.getPropertyName();
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #29  <Method String TypeDeserializer.getPropertyName()>
		//   11   19:putfield        #31  <Field String _typePropertyName>
		//   12   22:return          
		}
	}


	protected ExternalTypeHandler(JavaType javatype, ExtTypedProperty aexttypedproperty[], Map map, String as[], TokenBuffer atokenbuffer[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		_beanType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field JavaType _beanType>
		_properties = aexttypedproperty;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
		_nameToPropertyIndex = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field Map _nameToPropertyIndex>
		_typeIds = as;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field String[] _typeIds>
		_tokens = atokenbuffer;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #36  <Field TokenBuffer[] _tokens>
	//   17   31:return          
	}

	protected ExternalTypeHandler(ExternalTypeHandler externaltypehandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		_beanType = externaltypehandler._beanType;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #28  <Field JavaType _beanType>
	//    5    9:putfield        #28  <Field JavaType _beanType>
		_properties = externaltypehandler._properties;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//    9   17:putfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
		_nameToPropertyIndex = externaltypehandler._nameToPropertyIndex;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #32  <Field Map _nameToPropertyIndex>
	//   13   25:putfield        #32  <Field Map _nameToPropertyIndex>
		int i = _properties.length;
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   16   32:arraylength     
	//   17   33:istore_2        
		_typeIds = new String[i];
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:anewarray       String[]
	//   21   39:putfield        #34  <Field String[] _typeIds>
		_tokens = new TokenBuffer[i];
	//   22   42:aload_0         
	//   23   43:iload_2         
	//   24   44:anewarray       TokenBuffer[]
	//   25   47:putfield        #36  <Field TokenBuffer[] _tokens>
	//   26   50:return          
	}

	private final boolean _handleTypePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj, String s1, int i)
		throws IOException
	{
		boolean flag2 = _properties[i].hasTypePropertyName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//    2    4:iload           6
	//    3    6:aaload          
	//    4    7:aload_3         
	//    5    8:invokevirtual   #52  <Method boolean ExternalTypeHandler$ExtTypedProperty.hasTypePropertyName(String)>
	//    6   11:istore          9
		boolean flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore          8
		if(!flag2)
	//*   9   16:iload           9
	//*  10   18:ifne            23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		boolean flag = flag1;
	//   13   23:iload           8
	//   14   25:istore          7
		if(obj != null)
	//*  15   27:aload           4
	//*  16   29:ifnull          49
		{
			flag = flag1;
	//   17   32:iload           8
	//   18   34:istore          7
			if(_tokens[i] != null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  21   40:iload           6
	//*  22   42:aaload          
	//*  23   43:ifnull          49
				flag = true;
	//   24   46:iconst_1        
	//   25   47:istore          7
		}
		if(flag)
	//*  26   49:iload           7
	//*  27   51:ifeq            76
		{
			_deserializeAndSet(jsonparser, deserializationcontext, obj, i, s1);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:aload           4
	//   32   59:iload           6
	//   33   61:aload           5
	//   34   63:invokevirtual   #56  <Method void _deserializeAndSet(JsonParser, DeserializationContext, Object, int, String)>
			_tokens[i] = null;
	//   35   66:aload_0         
	//   36   67:getfield        #36  <Field TokenBuffer[] _tokens>
	//   37   70:iload           6
	//   38   72:aconst_null     
	//   39   73:aastore         
			return true;
	//   40   74:iconst_1        
	//   41   75:ireturn         
		} else
		{
			_typeIds[i] = s1;
	//   42   76:aload_0         
	//   43   77:getfield        #34  <Field String[] _typeIds>
	//   44   80:iload           6
	//   45   82:aload           5
	//   46   84:aastore         
			return true;
	//   47   85:iconst_1        
	//   48   86:ireturn         
		}
	}

	public static Builder builder(JavaType javatype)
	{
		return new Builder(javatype);
	//    0    0:new             #6   <Class ExternalTypeHandler$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void ExternalTypeHandler$Builder(JavaType)>
	//    4    8:areturn         
	}

	protected final Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, int i, String s)
		throws IOException
	{
		JsonParser jsonparser1 = _tokens[i].asParser(jsonparser);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TokenBuffer[] _tokens>
	//    2    4:iload_3         
	//    3    5:aaload          
	//    4    6:aload_1         
	//    5    7:invokevirtual   #68  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//    6   10:astore          5
		if(jsonparser1.nextToken() == JsonToken.VALUE_NULL)
	//*   7   12:aload           5
	//*   8   14:invokevirtual   #74  <Method JsonToken JsonParser.nextToken()>
	//*   9   17:getstatic       #80  <Field JsonToken JsonToken.VALUE_NULL>
	//*  10   20:if_acmpne       25
		{
			return ((Object) (null));
	//   11   23:aconst_null     
	//   12   24:areturn         
		} else
		{
			TokenBuffer tokenbuffer = new TokenBuffer(jsonparser, deserializationcontext);
	//   13   25:new             #44  <Class TokenBuffer>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokespecial   #83  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   18   34:astore          6
			tokenbuffer.writeStartArray();
	//   19   36:aload           6
	//   20   38:invokevirtual   #86  <Method void TokenBuffer.writeStartArray()>
			tokenbuffer.writeString(s);
	//   21   41:aload           6
	//   22   43:aload           4
	//   23   45:invokevirtual   #90  <Method void TokenBuffer.writeString(String)>
			tokenbuffer.copyCurrentStructure(jsonparser1);
	//   24   48:aload           6
	//   25   50:aload           5
	//   26   52:invokevirtual   #94  <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			tokenbuffer.writeEndArray();
	//   27   55:aload           6
	//   28   57:invokevirtual   #97  <Method void TokenBuffer.writeEndArray()>
			jsonparser = tokenbuffer.asParser(jsonparser);
	//   29   60:aload           6
	//   30   62:aload_1         
	//   31   63:invokevirtual   #68  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   32   66:astore_1        
			jsonparser.nextToken();
	//   33   67:aload_1         
	//   34   68:invokevirtual   #74  <Method JsonToken JsonParser.nextToken()>
	//   35   71:pop             
			return _properties[i].getProperty().deserialize(jsonparser, deserializationcontext);
	//   36   72:aload_0         
	//   37   73:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   38   76:iload_3         
	//   39   77:aaload          
	//   40   78:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   41   81:aload_1         
	//   42   82:aload_2         
	//   43   83:invokevirtual   #107 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//   44   86:areturn         
		}
	}

	protected final void _deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, int i, String s)
		throws IOException
	{
		JsonParser jsonparser1 = _tokens[i].asParser(jsonparser);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TokenBuffer[] _tokens>
	//    2    4:iload           4
	//    3    6:aaload          
	//    4    7:aload_1         
	//    5    8:invokevirtual   #68  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//    6   11:astore          6
		if(jsonparser1.nextToken() == JsonToken.VALUE_NULL)
	//*   7   13:aload           6
	//*   8   15:invokevirtual   #74  <Method JsonToken JsonParser.nextToken()>
	//*   9   18:getstatic       #80  <Field JsonToken JsonToken.VALUE_NULL>
	//*  10   21:if_acmpne       40
		{
			_properties[i].getProperty().set(obj, ((Object) (null)));
	//   11   24:aload_0         
	//   12   25:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   13   28:iload           4
	//   14   30:aaload          
	//   15   31:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   16   34:aload_3         
	//   17   35:aconst_null     
	//   18   36:invokevirtual   #111 <Method void SettableBeanProperty.set(Object, Object)>
			return;
	//   19   39:return          
		} else
		{
			TokenBuffer tokenbuffer = new TokenBuffer(jsonparser, deserializationcontext);
	//   20   40:new             #44  <Class TokenBuffer>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:aload_2         
	//   24   46:invokespecial   #83  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   25   49:astore          7
			tokenbuffer.writeStartArray();
	//   26   51:aload           7
	//   27   53:invokevirtual   #86  <Method void TokenBuffer.writeStartArray()>
			tokenbuffer.writeString(s);
	//   28   56:aload           7
	//   29   58:aload           5
	//   30   60:invokevirtual   #90  <Method void TokenBuffer.writeString(String)>
			tokenbuffer.copyCurrentStructure(jsonparser1);
	//   31   63:aload           7
	//   32   65:aload           6
	//   33   67:invokevirtual   #94  <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			tokenbuffer.writeEndArray();
	//   34   70:aload           7
	//   35   72:invokevirtual   #97  <Method void TokenBuffer.writeEndArray()>
			jsonparser = tokenbuffer.asParser(jsonparser);
	//   36   75:aload           7
	//   37   77:aload_1         
	//   38   78:invokevirtual   #68  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   39   81:astore_1        
			jsonparser.nextToken();
	//   40   82:aload_1         
	//   41   83:invokevirtual   #74  <Method JsonToken JsonParser.nextToken()>
	//   42   86:pop             
			_properties[i].getProperty().deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   43   87:aload_0         
	//   44   88:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   45   91:iload           4
	//   46   93:aaload          
	//   47   94:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   48   97:aload_1         
	//   49   98:aload_2         
	//   50   99:aload_3         
	//   51  100:invokevirtual   #115 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
			return;
	//   52  103:return          
		}
	}

	public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer, PropertyBasedCreator propertybasedcreator)
		throws IOException
	{
		int k = _properties.length;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//    2    4:arraylength     
	//    3    5:istore          7
		Object aobj[] = new Object[k];
	//    4    7:iload           7
	//    5    9:anewarray       Object[]
	//    6   12:astore          10
		boolean flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          6
		for(int i = 0; i < k; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore          5
	//*  11   20:iload           5
	//*  12   22:iload           7
	//*  13   24:icmpge          252
		{
			Object obj1 = ((Object) (_typeIds[i]));
	//   14   27:aload_0         
	//   15   28:getfield        #34  <Field String[] _typeIds>
	//   16   31:iload           5
	//   17   33:aaload          
	//   18   34:astore          9
			ExtTypedProperty exttypedproperty = _properties[i];
	//   19   36:aload_0         
	//   20   37:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   21   40:iload           5
	//   22   42:aaload          
	//   23   43:astore          11
			Object obj;
			if(obj1 == null)
	//*  24   45:aload           9
	//*  25   47:ifnonnull       111
			{
				if(_tokens[i] == null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  28   54:iload           5
	//*  29   56:aaload          
	//*  30   57:ifnonnull       63
					continue;
	//   31   60:goto            243
				if(!exttypedproperty.hasDefaultType())
	//*  32   63:aload           11
	//*  33   65:invokevirtual   #121 <Method boolean ExternalTypeHandler$ExtTypedProperty.hasDefaultType()>
	//*  34   68:ifne            101
				{
					deserializationcontext.reportInputMismatch(_beanType, "Missing external type id property '%s'", new Object[] {
						exttypedproperty.getTypePropertyName()
					});
	//   35   71:aload_2         
	//   36   72:aload_0         
	//   37   73:getfield        #28  <Field JavaType _beanType>
	//   38   76:ldc1            #123 <String "Missing external type id property '%s'">
	//   39   78:iconst_1        
	//   40   79:anewarray       Object[]
	//   41   82:dup             
	//   42   83:iconst_0        
	//   43   84:aload           11
	//   44   86:invokevirtual   #127 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//   45   89:aastore         
	//   46   90:invokevirtual   #133 <Method Object DeserializationContext.reportInputMismatch(JavaType, String, Object[])>
	//   47   93:pop             
					obj = obj1;
	//   48   94:aload           9
	//   49   96:astore          8
				} else
	//*  50   98:goto            172
				{
					obj = ((Object) (exttypedproperty.getDefaultTypeId()));
	//   51  101:aload           11
	//   52  103:invokevirtual   #136 <Method String ExternalTypeHandler$ExtTypedProperty.getDefaultTypeId()>
	//   53  106:astore          8
				}
			} else
	//*  54  108:goto            172
			{
				obj = obj1;
	//   55  111:aload           9
	//   56  113:astore          8
				if(_tokens[i] == null)
	//*  57  115:aload_0         
	//*  58  116:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  59  119:iload           5
	//*  60  121:aaload          
	//*  61  122:ifnonnull       172
				{
					obj = ((Object) (exttypedproperty.getProperty()));
	//   62  125:aload           11
	//   63  127:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   64  130:astore          8
					deserializationcontext.reportInputMismatch(_beanType, "Missing property '%s' for external type id '%s'", new Object[] {
						((SettableBeanProperty) (obj)).getName(), _properties[i].getTypePropertyName()
					});
	//   65  132:aload_2         
	//   66  133:aload_0         
	//   67  134:getfield        #28  <Field JavaType _beanType>
	//   68  137:ldc1            #138 <String "Missing property '%s' for external type id '%s'">
	//   69  139:iconst_2        
	//   70  140:anewarray       Object[]
	//   71  143:dup             
	//   72  144:iconst_0        
	//   73  145:aload           8
	//   74  147:invokevirtual   #141 <Method String SettableBeanProperty.getName()>
	//   75  150:aastore         
	//   76  151:dup             
	//   77  152:iconst_1        
	//   78  153:aload_0         
	//   79  154:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   80  157:iload           5
	//   81  159:aaload          
	//   82  160:invokevirtual   #127 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//   83  163:aastore         
	//   84  164:invokevirtual   #133 <Method Object DeserializationContext.reportInputMismatch(JavaType, String, Object[])>
	//   85  167:pop             
					obj = obj1;
	//   86  168:aload           9
	//   87  170:astore          8
				}
			}
			aobj[i] = _deserialize(jsonparser, deserializationcontext, i, ((String) (obj)));
	//   88  172:aload           10
	//   89  174:iload           5
	//   90  176:aload_0         
	//   91  177:aload_1         
	//   92  178:aload_2         
	//   93  179:iload           5
	//   94  181:aload           8
	//   95  183:invokevirtual   #143 <Method Object _deserialize(JsonParser, DeserializationContext, int, String)>
	//   96  186:aastore         
			obj1 = ((Object) (exttypedproperty.getProperty()));
	//   97  187:aload           11
	//   98  189:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   99  192:astore          9
			if(((SettableBeanProperty) (obj1)).getCreatorIndex() < 0)
				continue;
	//  100  194:aload           9
	//  101  196:invokevirtual   #147 <Method int SettableBeanProperty.getCreatorIndex()>
	//  102  199:iflt            243
			propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj1)), aobj[i]);
	//  103  202:aload_3         
	//  104  203:aload           9
	//  105  205:aload           10
	//  106  207:iload           5
	//  107  209:aaload          
	//  108  210:invokevirtual   #153 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//  109  213:pop             
			obj1 = ((Object) (exttypedproperty.getTypeProperty()));
	//  110  214:aload           11
	//  111  216:invokevirtual   #156 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getTypeProperty()>
	//  112  219:astore          9
			if(obj1 != null && ((SettableBeanProperty) (obj1)).getCreatorIndex() >= 0)
	//* 113  221:aload           9
	//* 114  223:ifnull          243
	//* 115  226:aload           9
	//* 116  228:invokevirtual   #147 <Method int SettableBeanProperty.getCreatorIndex()>
	//* 117  231:iflt            243
				propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj1)), obj);
	//  118  234:aload_3         
	//  119  235:aload           9
	//  120  237:aload           8
	//  121  239:invokevirtual   #153 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//  122  242:pop             
		}

	//  123  243:iload           5
	//  124  245:iconst_1        
	//  125  246:iadd            
	//  126  247:istore          5
	//* 127  249:goto            20
		jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//  128  252:aload           4
	//  129  254:aload_2         
	//  130  255:aload_3         
	//  131  256:invokevirtual   #162 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  132  259:astore_1        
		for(int j = ((int) (flag)); j < k; j++)
	//* 133  260:iload           6
	//* 134  262:istore          5
	//* 135  264:iload           5
	//* 136  266:iload           7
	//* 137  268:icmpge          308
		{
			deserializationcontext = ((DeserializationContext) (_properties[j].getProperty()));
	//  138  271:aload_0         
	//  139  272:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//  140  275:iload           5
	//  141  277:aaload          
	//  142  278:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//  143  281:astore_2        
			if(((SettableBeanProperty) (deserializationcontext)).getCreatorIndex() < 0)
	//* 144  282:aload_2         
	//* 145  283:invokevirtual   #147 <Method int SettableBeanProperty.getCreatorIndex()>
	//* 146  286:ifge            299
				((SettableBeanProperty) (deserializationcontext)).set(((Object) (jsonparser)), aobj[j]);
	//  147  289:aload_2         
	//  148  290:aload_1         
	//  149  291:aload           10
	//  150  293:iload           5
	//  151  295:aaload          
	//  152  296:invokevirtual   #111 <Method void SettableBeanProperty.set(Object, Object)>
		}

	//  153  299:iload           5
	//  154  301:iconst_1        
	//  155  302:iadd            
	//  156  303:istore          5
	//* 157  305:goto            264
		return ((Object) (jsonparser));
	//  158  308:aload_1         
	//  159  309:areturn         
	}

	public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		int j = _properties.length;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//    2    4:arraylength     
	//    3    5:istore          5
		for(int i = 0; i < j; i++)
	//*   4    7:iconst_0        
	//*   5    8:istore          4
	//*   6   10:iload           4
	//*   7   12:iload           5
	//*   8   14:icmpge          280
		{
			String s = _typeIds[i];
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field String[] _typeIds>
	//   11   21:iload           4
	//   12   23:aaload          
	//   13   24:astore          7
			Object obj1;
			if(s == null)
	//*  14   26:aload           7
	//*  15   28:ifnonnull       181
			{
				Object obj2 = ((Object) (_tokens[i]));
	//   16   31:aload_0         
	//   17   32:getfield        #36  <Field TokenBuffer[] _tokens>
	//   18   35:iload           4
	//   19   37:aaload          
	//   20   38:astore          8
				if(obj2 == null)
	//*  21   40:aload           8
	//*  22   42:ifnonnull       48
					continue;
	//   23   45:goto            271
				obj1 = ((Object) (s));
	//   24   48:aload           7
	//   25   50:astore          6
				if(((TokenBuffer) (obj2)).firstToken().isScalarValue())
	//*  26   52:aload           8
	//*  27   54:invokevirtual   #166 <Method JsonToken TokenBuffer.firstToken()>
	//*  28   57:invokevirtual   #169 <Method boolean JsonToken.isScalarValue()>
	//*  29   60:ifeq            260
				{
					obj2 = ((Object) (((TokenBuffer) (obj2)).asParser(jsonparser)));
	//   30   63:aload           8
	//   31   65:aload_1         
	//   32   66:invokevirtual   #68  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   33   69:astore          8
					((JsonParser) (obj2)).nextToken();
	//   34   71:aload           8
	//   35   73:invokevirtual   #74  <Method JsonToken JsonParser.nextToken()>
	//   36   76:pop             
					obj1 = ((Object) (_properties[i].getProperty()));
	//   37   77:aload_0         
	//   38   78:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   39   81:iload           4
	//   40   83:aaload          
	//   41   84:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   42   87:astore          6
					obj2 = TypeDeserializer.deserializeIfNatural(((JsonParser) (obj2)), deserializationcontext, ((SettableBeanProperty) (obj1)).getType());
	//   43   89:aload           8
	//   44   91:aload_2         
	//   45   92:aload           6
	//   46   94:invokevirtual   #173 <Method JavaType SettableBeanProperty.getType()>
	//   47   97:invokestatic    #179 <Method Object TypeDeserializer.deserializeIfNatural(JsonParser, DeserializationContext, JavaType)>
	//   48  100:astore          8
					if(obj2 != null)
	//*  49  102:aload           8
	//*  50  104:ifnull          118
					{
						((SettableBeanProperty) (obj1)).set(obj, obj2);
	//   51  107:aload           6
	//   52  109:aload_3         
	//   53  110:aload           8
	//   54  112:invokevirtual   #111 <Method void SettableBeanProperty.set(Object, Object)>
						continue;
	//   55  115:goto            271
					}
					if(!_properties[i].hasDefaultType())
	//*  56  118:aload_0         
	//*  57  119:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//*  58  122:iload           4
	//*  59  124:aaload          
	//*  60  125:invokevirtual   #121 <Method boolean ExternalTypeHandler$ExtTypedProperty.hasDefaultType()>
	//*  61  128:ifne            166
					{
						deserializationcontext.reportInputMismatch(obj.getClass(), "Missing external type id property '%s'", new Object[] {
							_properties[i].getTypePropertyName()
						});
	//   62  131:aload_2         
	//   63  132:aload_3         
	//   64  133:invokevirtual   #183 <Method Class Object.getClass()>
	//   65  136:ldc1            #123 <String "Missing external type id property '%s'">
	//   66  138:iconst_1        
	//   67  139:anewarray       Object[]
	//   68  142:dup             
	//   69  143:iconst_0        
	//   70  144:aload_0         
	//   71  145:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   72  148:iload           4
	//   73  150:aaload          
	//   74  151:invokevirtual   #127 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//   75  154:aastore         
	//   76  155:invokevirtual   #186 <Method Object DeserializationContext.reportInputMismatch(Class, String, Object[])>
	//   77  158:pop             
						obj1 = ((Object) (s));
	//   78  159:aload           7
	//   79  161:astore          6
					} else
	//*  80  163:goto            260
					{
						obj1 = ((Object) (_properties[i].getDefaultTypeId()));
	//   81  166:aload_0         
	//   82  167:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   83  170:iload           4
	//   84  172:aaload          
	//   85  173:invokevirtual   #136 <Method String ExternalTypeHandler$ExtTypedProperty.getDefaultTypeId()>
	//   86  176:astore          6
					}
				}
			} else
	//*  87  178:goto            260
			{
				obj1 = ((Object) (s));
	//   88  181:aload           7
	//   89  183:astore          6
				if(_tokens[i] == null)
	//*  90  185:aload_0         
	//*  91  186:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  92  189:iload           4
	//*  93  191:aaload          
	//*  94  192:ifnonnull       260
				{
					jsonparser = ((JsonParser) (_properties[i].getProperty()));
	//   95  195:aload_0         
	//   96  196:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   97  199:iload           4
	//   98  201:aaload          
	//   99  202:invokevirtual   #101 <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//  100  205:astore_1        
					if(((SettableBeanProperty) (jsonparser)).isRequired() || deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY))
	//* 101  206:aload_1         
	//* 102  207:invokevirtual   #189 <Method boolean SettableBeanProperty.isRequired()>
	//* 103  210:ifne            223
	//* 104  213:aload_2         
	//* 105  214:getstatic       #195 <Field DeserializationFeature DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY>
	//* 106  217:invokevirtual   #199 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 107  220:ifeq            258
						deserializationcontext.reportInputMismatch(obj.getClass(), "Missing property '%s' for external type id '%s'", new Object[] {
							((SettableBeanProperty) (jsonparser)).getName(), _properties[i].getTypePropertyName()
						});
	//  108  223:aload_2         
	//  109  224:aload_3         
	//  110  225:invokevirtual   #183 <Method Class Object.getClass()>
	//  111  228:ldc1            #138 <String "Missing property '%s' for external type id '%s'">
	//  112  230:iconst_2        
	//  113  231:anewarray       Object[]
	//  114  234:dup             
	//  115  235:iconst_0        
	//  116  236:aload_1         
	//  117  237:invokevirtual   #141 <Method String SettableBeanProperty.getName()>
	//  118  240:aastore         
	//  119  241:dup             
	//  120  242:iconst_1        
	//  121  243:aload_0         
	//  122  244:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//  123  247:iload           4
	//  124  249:aaload          
	//  125  250:invokevirtual   #127 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//  126  253:aastore         
	//  127  254:invokevirtual   #186 <Method Object DeserializationContext.reportInputMismatch(Class, String, Object[])>
	//  128  257:pop             
					return obj;
	//  129  258:aload_3         
	//  130  259:areturn         
				}
			}
			_deserializeAndSet(jsonparser, deserializationcontext, obj, i, ((String) (obj1)));
	//  131  260:aload_0         
	//  132  261:aload_1         
	//  133  262:aload_2         
	//  134  263:aload_3         
	//  135  264:iload           4
	//  136  266:aload           6
	//  137  268:invokevirtual   #56  <Method void _deserializeAndSet(JsonParser, DeserializationContext, Object, int, String)>
		}

	//  138  271:iload           4
	//  139  273:iconst_1        
	//  140  274:iadd            
	//  141  275:istore          4
	//* 142  277:goto            10
		return obj;
	//  143  280:aload_3         
	//  144  281:areturn         
	}

	public boolean handlePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj)
		throws IOException
	{
		Object obj1 = _nameToPropertyIndex.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map _nameToPropertyIndex>
	//    2    4:aload_3         
	//    3    5:invokeinterface #207 <Method Object Map.get(Object)>
	//    4   10:astore          8
		boolean flag1 = false;
	//    5   12:iconst_0        
	//    6   13:istore          6
		if(obj1 == null)
	//*   7   15:aload           8
	//*   8   17:ifnonnull       22
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		if(obj1 instanceof List)
	//*  11   22:aload           8
	//*  12   24:instanceof      #209 <Class List>
	//*  13   27:ifeq            184
		{
			obj = ((Object) (((List)obj1).iterator()));
	//   14   30:aload           8
	//   15   32:checkcast       #209 <Class List>
	//   16   35:invokeinterface #213 <Method Iterator List.iterator()>
	//   17   40:astore          4
			obj1 = ((Object) ((Integer)((Iterator) (obj)).next()));
	//   18   42:aload           4
	//   19   44:invokeinterface #219 <Method Object Iterator.next()>
	//   20   49:checkcast       #221 <Class Integer>
	//   21   52:astore          8
			if(_properties[((Integer) (obj1)).intValue()].hasTypePropertyName(s))
	//*  22   54:aload_0         
	//*  23   55:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//*  24   58:aload           8
	//*  25   60:invokevirtual   #224 <Method int Integer.intValue()>
	//*  26   63:aaload          
	//*  27   64:aload_3         
	//*  28   65:invokevirtual   #52  <Method boolean ExternalTypeHandler$ExtTypedProperty.hasTypePropertyName(String)>
	//*  29   68:ifeq            124
			{
				deserializationcontext = ((DeserializationContext) (jsonparser.getText()));
	//   30   71:aload_1         
	//   31   72:invokevirtual   #227 <Method String JsonParser.getText()>
	//   32   75:astore_2        
				jsonparser.skipChildren();
	//   33   76:aload_1         
	//   34   77:invokevirtual   #231 <Method JsonParser JsonParser.skipChildren()>
	//   35   80:pop             
				for(_typeIds[((Integer) (obj1)).intValue()] = ((String) (deserializationcontext)); ((Iterator) (obj)).hasNext(); _typeIds[((Integer)((Iterator) (obj)).next()).intValue()] = ((String) (deserializationcontext)));
	//   36   81:aload_0         
	//   37   82:getfield        #34  <Field String[] _typeIds>
	//   38   85:aload           8
	//   39   87:invokevirtual   #224 <Method int Integer.intValue()>
	//   40   90:aload_2         
	//   41   91:aastore         
	//   42   92:aload           4
	//   43   94:invokeinterface #234 <Method boolean Iterator.hasNext()>
	//   44   99:ifeq            182
	//   45  102:aload_0         
	//   46  103:getfield        #34  <Field String[] _typeIds>
	//   47  106:aload           4
	//   48  108:invokeinterface #219 <Method Object Iterator.next()>
	//   49  113:checkcast       #221 <Class Integer>
	//   50  116:invokevirtual   #224 <Method int Integer.intValue()>
	//   51  119:aload_2         
	//   52  120:aastore         
			} else
	//*  53  121:goto            92
			{
				deserializationcontext = ((DeserializationContext) (new TokenBuffer(jsonparser, deserializationcontext)));
	//   54  124:new             #44  <Class TokenBuffer>
	//   55  127:dup             
	//   56  128:aload_1         
	//   57  129:aload_2         
	//   58  130:invokespecial   #83  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   59  133:astore_2        
				((TokenBuffer) (deserializationcontext)).copyCurrentStructure(jsonparser);
	//   60  134:aload_2         
	//   61  135:aload_1         
	//   62  136:invokevirtual   #94  <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
				for(_tokens[((Integer) (obj1)).intValue()] = ((TokenBuffer) (deserializationcontext)); ((Iterator) (obj)).hasNext(); _tokens[((Integer)((Iterator) (obj)).next()).intValue()] = ((TokenBuffer) (deserializationcontext)));
	//   63  139:aload_0         
	//   64  140:getfield        #36  <Field TokenBuffer[] _tokens>
	//   65  143:aload           8
	//   66  145:invokevirtual   #224 <Method int Integer.intValue()>
	//   67  148:aload_2         
	//   68  149:aastore         
	//   69  150:aload           4
	//   70  152:invokeinterface #234 <Method boolean Iterator.hasNext()>
	//   71  157:ifeq            182
	//   72  160:aload_0         
	//   73  161:getfield        #36  <Field TokenBuffer[] _tokens>
	//   74  164:aload           4
	//   75  166:invokeinterface #219 <Method Object Iterator.next()>
	//   76  171:checkcast       #221 <Class Integer>
	//   77  174:invokevirtual   #224 <Method int Integer.intValue()>
	//   78  177:aload_2         
	//   79  178:aastore         
			}
	//*  80  179:goto            150
			return true;
	//   81  182:iconst_1        
	//   82  183:ireturn         
		}
		int i = ((Integer)obj1).intValue();
	//   83  184:aload           8
	//   84  186:checkcast       #221 <Class Integer>
	//   85  189:invokevirtual   #224 <Method int Integer.intValue()>
	//   86  192:istore          7
		boolean flag;
		if(_properties[i].hasTypePropertyName(s))
	//*  87  194:aload_0         
	//*  88  195:getfield        #30  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//*  89  198:iload           7
	//*  90  200:aaload          
	//*  91  201:aload_3         
	//*  92  202:invokevirtual   #52  <Method boolean ExternalTypeHandler$ExtTypedProperty.hasTypePropertyName(String)>
	//*  93  205:ifeq            253
		{
			_typeIds[i] = jsonparser.getText();
	//   94  208:aload_0         
	//   95  209:getfield        #34  <Field String[] _typeIds>
	//   96  212:iload           7
	//   97  214:aload_1         
	//   98  215:invokevirtual   #227 <Method String JsonParser.getText()>
	//   99  218:aastore         
			jsonparser.skipChildren();
	//  100  219:aload_1         
	//  101  220:invokevirtual   #231 <Method JsonParser JsonParser.skipChildren()>
	//  102  223:pop             
			flag = flag1;
	//  103  224:iload           6
	//  104  226:istore          5
			if(obj != null)
	//* 105  228:aload           4
	//* 106  230:ifnull          302
			{
				flag = flag1;
	//  107  233:iload           6
	//  108  235:istore          5
				if(_tokens[i] != null)
	//* 109  237:aload_0         
	//* 110  238:getfield        #36  <Field TokenBuffer[] _tokens>
	//* 111  241:iload           7
	//* 112  243:aaload          
	//* 113  244:ifnull          302
					flag = true;
	//  114  247:iconst_1        
	//  115  248:istore          5
			}
		} else
	//* 116  250:goto            302
		{
			s = ((String) (new TokenBuffer(jsonparser, deserializationcontext)));
	//  117  253:new             #44  <Class TokenBuffer>
	//  118  256:dup             
	//  119  257:aload_1         
	//  120  258:aload_2         
	//  121  259:invokespecial   #83  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//  122  262:astore_3        
			((TokenBuffer) (s)).copyCurrentStructure(jsonparser);
	//  123  263:aload_3         
	//  124  264:aload_1         
	//  125  265:invokevirtual   #94  <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			_tokens[i] = ((TokenBuffer) (s));
	//  126  268:aload_0         
	//  127  269:getfield        #36  <Field TokenBuffer[] _tokens>
	//  128  272:iload           7
	//  129  274:aload_3         
	//  130  275:aastore         
			flag = flag1;
	//  131  276:iload           6
	//  132  278:istore          5
			if(obj != null)
	//* 133  280:aload           4
	//* 134  282:ifnull          302
			{
				flag = flag1;
	//  135  285:iload           6
	//  136  287:istore          5
				if(_typeIds[i] != null)
	//* 137  289:aload_0         
	//* 138  290:getfield        #34  <Field String[] _typeIds>
	//* 139  293:iload           7
	//* 140  295:aaload          
	//* 141  296:ifnull          302
					flag = true;
	//  142  299:iconst_1        
	//  143  300:istore          5
			}
		}
		if(flag)
	//* 144  302:iload           5
	//* 145  304:ifeq            343
		{
			s = ((String) (_typeIds));
	//  146  307:aload_0         
	//  147  308:getfield        #34  <Field String[] _typeIds>
	//  148  311:astore_3        
			String s1 = ((String) (s[i]));
	//  149  312:aload_3         
	//  150  313:iload           7
	//  151  315:aaload          
	//  152  316:astore          8
			s[i] = null;
	//  153  318:aload_3         
	//  154  319:iload           7
	//  155  321:aconst_null     
	//  156  322:aastore         
			_deserializeAndSet(jsonparser, deserializationcontext, obj, i, s1);
	//  157  323:aload_0         
	//  158  324:aload_1         
	//  159  325:aload_2         
	//  160  326:aload           4
	//  161  328:iload           7
	//  162  330:aload           8
	//  163  332:invokevirtual   #56  <Method void _deserializeAndSet(JsonParser, DeserializationContext, Object, int, String)>
			_tokens[i] = null;
	//  164  335:aload_0         
	//  165  336:getfield        #36  <Field TokenBuffer[] _tokens>
	//  166  339:iload           7
	//  167  341:aconst_null     
	//  168  342:aastore         
		}
		return true;
	//  169  343:iconst_1        
	//  170  344:ireturn         
	}

	public boolean handleTypePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj)
		throws IOException
	{
		Object obj1 = _nameToPropertyIndex.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map _nameToPropertyIndex>
	//    2    4:aload_3         
	//    3    5:invokeinterface #207 <Method Object Map.get(Object)>
	//    4   10:astore          7
		boolean flag = false;
	//    5   12:iconst_0        
	//    6   13:istore          5
		if(obj1 == null)
	//*   7   15:aload           7
	//*   8   17:ifnonnull       22
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		String s1 = jsonparser.getText();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #227 <Method String JsonParser.getText()>
	//   13   26:astore          6
		if(obj1 instanceof List)
	//*  14   28:aload           7
	//*  15   30:instanceof      #209 <Class List>
	//*  16   33:ifeq            94
		{
			obj1 = ((Object) (((List)obj1).iterator()));
	//   17   36:aload           7
	//   18   38:checkcast       #209 <Class List>
	//   19   41:invokeinterface #213 <Method Iterator List.iterator()>
	//   20   46:astore          7
			do
			{
				if(!((Iterator) (obj1)).hasNext())
					break;
	//   21   48:aload           7
	//   22   50:invokeinterface #234 <Method boolean Iterator.hasNext()>
	//   23   55:ifeq            91
				if(_handleTypePropertyValue(jsonparser, deserializationcontext, s, obj, s1, ((Integer)((Iterator) (obj1)).next()).intValue()))
	//*  24   58:aload_0         
	//*  25   59:aload_1         
	//*  26   60:aload_2         
	//*  27   61:aload_3         
	//*  28   62:aload           4
	//*  29   64:aload           6
	//*  30   66:aload           7
	//*  31   68:invokeinterface #219 <Method Object Iterator.next()>
	//*  32   73:checkcast       #221 <Class Integer>
	//*  33   76:invokevirtual   #224 <Method int Integer.intValue()>
	//*  34   79:invokespecial   #237 <Method boolean _handleTypePropertyValue(JsonParser, DeserializationContext, String, Object, String, int)>
	//*  35   82:ifeq            48
					flag = true;
	//   36   85:iconst_1        
	//   37   86:istore          5
			} while(true);
	//   38   88:goto            48
			return flag;
	//   39   91:iload           5
	//   40   93:ireturn         
		} else
		{
			return _handleTypePropertyValue(jsonparser, deserializationcontext, s, obj, s1, ((Integer)obj1).intValue());
	//   41   94:aload_0         
	//   42   95:aload_1         
	//   43   96:aload_2         
	//   44   97:aload_3         
	//   45   98:aload           4
	//   46  100:aload           6
	//   47  102:aload           7
	//   48  104:checkcast       #221 <Class Integer>
	//   49  107:invokevirtual   #224 <Method int Integer.intValue()>
	//   50  110:invokespecial   #237 <Method boolean _handleTypePropertyValue(JsonParser, DeserializationContext, String, Object, String, int)>
	//   51  113:ireturn         
		}
	}

	public ExternalTypeHandler start()
	{
		return new ExternalTypeHandler(this);
	//    0    0:new             #2   <Class ExternalTypeHandler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #241 <Method void ExternalTypeHandler(ExternalTypeHandler)>
	//    4    8:areturn         
	}

	private final JavaType _beanType;
	private final Map _nameToPropertyIndex;
	private final ExtTypedProperty _properties[];
	private final TokenBuffer _tokens[];
	private final String _typeIds[];
}
