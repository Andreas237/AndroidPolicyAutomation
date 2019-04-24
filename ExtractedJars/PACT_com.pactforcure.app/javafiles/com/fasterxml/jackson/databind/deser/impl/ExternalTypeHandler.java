// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyBasedCreator, PropertyValueBuffer

public class ExternalTypeHandler
{
	public static class Builder
	{

		public void addExternal(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
		{
			Integer integer = Integer.valueOf(_properties.size());
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field ArrayList _properties>
		//    2    4:invokevirtual   #34  <Method int ArrayList.size()>
		//    3    7:invokestatic    #40  <Method Integer Integer.valueOf(int)>
		//    4   10:astore_3        
			_properties.add(((Object) (new ExtTypedProperty(settablebeanproperty, typedeserializer))));
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field ArrayList _properties>
		//    7   15:new             #42  <Class ExternalTypeHandler$ExtTypedProperty>
		//    8   18:dup             
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokespecial   #44  <Method void ExternalTypeHandler$ExtTypedProperty(SettableBeanProperty, TypeDeserializer)>
		//   12   24:invokevirtual   #48  <Method boolean ArrayList.add(Object)>
		//   13   27:pop             
			_nameToPropertyIndex.put(((Object) (settablebeanproperty.getName())), ((Object) (integer)));
		//   14   28:aload_0         
		//   15   29:getfield        #27  <Field HashMap _nameToPropertyIndex>
		//   16   32:aload_1         
		//   17   33:invokevirtual   #54  <Method String SettableBeanProperty.getName()>
		//   18   36:aload_3         
		//   19   37:invokevirtual   #58  <Method Object HashMap.put(Object, Object)>
		//   20   40:pop             
			_nameToPropertyIndex.put(((Object) (typedeserializer.getPropertyName())), ((Object) (integer)));
		//   21   41:aload_0         
		//   22   42:getfield        #27  <Field HashMap _nameToPropertyIndex>
		//   23   45:aload_2         
		//   24   46:invokevirtual   #63  <Method String TypeDeserializer.getPropertyName()>
		//   25   49:aload_3         
		//   26   50:invokevirtual   #58  <Method Object HashMap.put(Object, Object)>
		//   27   53:pop             
		//   28   54:return          
		}

		public ExternalTypeHandler build()
		{
			return new ExternalTypeHandler((ExtTypedProperty[])_properties.toArray(((Object []) (new ExtTypedProperty[_properties.size()]))), _nameToPropertyIndex, ((String []) (null)), ((TokenBuffer []) (null)));
		//    0    0:new             #6   <Class ExternalTypeHandler>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field ArrayList _properties>
		//    4    8:aload_0         
		//    5    9:getfield        #22  <Field ArrayList _properties>
		//    6   12:invokevirtual   #34  <Method int ArrayList.size()>
		//    7   15:anewarray       ExtTypedProperty[]
		//    8   18:invokevirtual   #69  <Method Object[] ArrayList.toArray(Object[])>
		//    9   21:checkcast       #71  <Class ExternalTypeHandler$ExtTypedProperty[]>
		//   10   24:aload_0         
		//   11   25:getfield        #27  <Field HashMap _nameToPropertyIndex>
		//   12   28:aconst_null     
		//   13   29:aconst_null     
		//   14   30:invokespecial   #74  <Method void ExternalTypeHandler(ExternalTypeHandler$ExtTypedProperty[], HashMap, String[], TokenBuffer[])>
		//   15   33:areturn         
		}

		private final HashMap _nameToPropertyIndex = new HashMap();
		private final ArrayList _properties = new ArrayList();

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void ArrayList()>
		//    6   12:putfield        #22  <Field ArrayList _properties>
		//    7   15:aload_0         
		//    8   16:new             #24  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #25  <Method void HashMap()>
		//   11   23:putfield        #27  <Field HashMap _nameToPropertyIndex>
		//   12   26:return          
		}
	}

	private static final class ExtTypedProperty
	{

		public String getDefaultTypeId()
		{
			Class class1 = _typeDeserializer.getDefaultImpl();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field TypeDeserializer _typeDeserializer>
		//    2    4:invokevirtual   #36  <Method Class TypeDeserializer.getDefaultImpl()>
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
		//    9   15:getfield        #22  <Field TypeDeserializer _typeDeserializer>
		//   10   18:invokevirtual   #40  <Method TypeIdResolver TypeDeserializer.getTypeIdResolver()>
		//   11   21:aconst_null     
		//   12   22:aload_1         
		//   13   23:invokeinterface #46  <Method String TypeIdResolver.idFromValueAndType(Object, Class)>
		//   14   28:areturn         
		}

		public SettableBeanProperty getProperty()
		{
			return _property;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SettableBeanProperty _property>
		//    2    4:areturn         
		}

		public String getTypePropertyName()
		{
			return _typePropertyName;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String _typePropertyName>
		//    2    4:areturn         
		}

		public boolean hasDefaultType()
		{
			return _typeDeserializer.getDefaultImpl() != null;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field TypeDeserializer _typeDeserializer>
		//    2    4:invokevirtual   #36  <Method Class TypeDeserializer.getDefaultImpl()>
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
		//    2    2:getfield        #30  <Field String _typePropertyName>
		//    3    5:invokevirtual   #59  <Method boolean String.equals(Object)>
		//    4    8:ireturn         
		}

		private final SettableBeanProperty _property;
		private final TypeDeserializer _typeDeserializer;
		private final String _typePropertyName;

		public ExtTypedProperty(SettableBeanProperty settablebeanproperty, TypeDeserializer typedeserializer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			_property = settablebeanproperty;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field SettableBeanProperty _property>
			_typeDeserializer = typedeserializer;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field TypeDeserializer _typeDeserializer>
			_typePropertyName = typedeserializer.getPropertyName();
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #28  <Method String TypeDeserializer.getPropertyName()>
		//   11   19:putfield        #30  <Field String _typePropertyName>
		//   12   22:return          
		}
	}


	protected ExternalTypeHandler(ExternalTypeHandler externaltypehandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_properties = externaltypehandler._properties;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//    5    9:putfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
		_nameToPropertyIndex = externaltypehandler._nameToPropertyIndex;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #28  <Field HashMap _nameToPropertyIndex>
	//    9   17:putfield        #28  <Field HashMap _nameToPropertyIndex>
		int i = _properties.length;
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   12   24:arraylength     
	//   13   25:istore_2        
		_typeIds = new String[i];
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:anewarray       String[]
	//   17   31:putfield        #32  <Field String[] _typeIds>
		_tokens = new TokenBuffer[i];
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:anewarray       TokenBuffer[]
	//   21   39:putfield        #36  <Field TokenBuffer[] _tokens>
	//   22   42:return          
	}

	protected ExternalTypeHandler(ExtTypedProperty aexttypedproperty[], HashMap hashmap, String as[], TokenBuffer atokenbuffer[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_properties = aexttypedproperty;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
		_nameToPropertyIndex = hashmap;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field HashMap _nameToPropertyIndex>
		_typeIds = as;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field String[] _typeIds>
		_tokens = atokenbuffer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field TokenBuffer[] _tokens>
	//   14   25:return          
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
	//    5    7:invokevirtual   #48  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//    6   10:astore          5
		if(jsonparser1.nextToken() == JsonToken.VALUE_NULL)
	//*   7   12:aload           5
	//*   8   14:invokevirtual   #54  <Method JsonToken JsonParser.nextToken()>
	//*   9   17:getstatic       #60  <Field JsonToken JsonToken.VALUE_NULL>
	//*  10   20:if_acmpne       25
		{
			return ((Object) (null));
	//   11   23:aconst_null     
	//   12   24:areturn         
		} else
		{
			TokenBuffer tokenbuffer = new TokenBuffer(jsonparser, deserializationcontext);
	//   13   25:new             #34  <Class TokenBuffer>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokespecial   #63  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   18   34:astore          6
			tokenbuffer.writeStartArray();
	//   19   36:aload           6
	//   20   38:invokevirtual   #66  <Method void TokenBuffer.writeStartArray()>
			tokenbuffer.writeString(s);
	//   21   41:aload           6
	//   22   43:aload           4
	//   23   45:invokevirtual   #70  <Method void TokenBuffer.writeString(String)>
			tokenbuffer.copyCurrentStructure(jsonparser1);
	//   24   48:aload           6
	//   25   50:aload           5
	//   26   52:invokevirtual   #74  <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			tokenbuffer.writeEndArray();
	//   27   55:aload           6
	//   28   57:invokevirtual   #77  <Method void TokenBuffer.writeEndArray()>
			jsonparser = tokenbuffer.asParser(jsonparser);
	//   29   60:aload           6
	//   30   62:aload_1         
	//   31   63:invokevirtual   #48  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   32   66:astore_1        
			jsonparser.nextToken();
	//   33   67:aload_1         
	//   34   68:invokevirtual   #54  <Method JsonToken JsonParser.nextToken()>
	//   35   71:pop             
			return _properties[i].getProperty().deserialize(jsonparser, deserializationcontext);
	//   36   72:aload_0         
	//   37   73:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   38   76:iload_3         
	//   39   77:aaload          
	//   40   78:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   41   81:aload_1         
	//   42   82:aload_2         
	//   43   83:invokevirtual   #87  <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
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
	//    5    8:invokevirtual   #48  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//    6   11:astore          6
		if(jsonparser1.nextToken() == JsonToken.VALUE_NULL)
	//*   7   13:aload           6
	//*   8   15:invokevirtual   #54  <Method JsonToken JsonParser.nextToken()>
	//*   9   18:getstatic       #60  <Field JsonToken JsonToken.VALUE_NULL>
	//*  10   21:if_acmpne       40
		{
			_properties[i].getProperty().set(obj, ((Object) (null)));
	//   11   24:aload_0         
	//   12   25:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   13   28:iload           4
	//   14   30:aaload          
	//   15   31:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   16   34:aload_3         
	//   17   35:aconst_null     
	//   18   36:invokevirtual   #94  <Method void SettableBeanProperty.set(Object, Object)>
			return;
	//   19   39:return          
		} else
		{
			TokenBuffer tokenbuffer = new TokenBuffer(jsonparser, deserializationcontext);
	//   20   40:new             #34  <Class TokenBuffer>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:aload_2         
	//   24   46:invokespecial   #63  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   25   49:astore          7
			tokenbuffer.writeStartArray();
	//   26   51:aload           7
	//   27   53:invokevirtual   #66  <Method void TokenBuffer.writeStartArray()>
			tokenbuffer.writeString(s);
	//   28   56:aload           7
	//   29   58:aload           5
	//   30   60:invokevirtual   #70  <Method void TokenBuffer.writeString(String)>
			tokenbuffer.copyCurrentStructure(jsonparser1);
	//   31   63:aload           7
	//   32   65:aload           6
	//   33   67:invokevirtual   #74  <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			tokenbuffer.writeEndArray();
	//   34   70:aload           7
	//   35   72:invokevirtual   #77  <Method void TokenBuffer.writeEndArray()>
			jsonparser = tokenbuffer.asParser(jsonparser);
	//   36   75:aload           7
	//   37   77:aload_1         
	//   38   78:invokevirtual   #48  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   39   81:astore_1        
			jsonparser.nextToken();
	//   40   82:aload_1         
	//   41   83:invokevirtual   #54  <Method JsonToken JsonParser.nextToken()>
	//   42   86:pop             
			_properties[i].getProperty().deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   43   87:aload_0         
	//   44   88:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   45   91:iload           4
	//   46   93:aaload          
	//   47   94:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   48   97:aload_1         
	//   49   98:aload_2         
	//   50   99:aload_3         
	//   51  100:invokevirtual   #98  <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
			return;
	//   52  103:return          
		}
	}

	public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer, PropertyBasedCreator propertybasedcreator)
		throws IOException
	{
		int i;
		int l;
		Object aobj[];
		l = _properties.length;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//    2    4:arraylength     
	//    3    5:istore          6
		aobj = new Object[l];
	//    4    7:iload           6
	//    5    9:anewarray       Object[]
	//    6   12:astore          8
		i = 0;
	//    7   14:iconst_0        
	//    8   15:istore          5
_L5:
		String s;
		if(i >= l)
			break MISSING_BLOCK_LABEL_174;
	//    9   17:iload           5
	//   10   19:iload           6
	//   11   21:icmpge          174
		s = _typeIds[i];
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field String[] _typeIds>
	//   14   28:iload           5
	//   15   30:aaload          
	//   16   31:astore          7
		if(s != null) goto _L2; else goto _L1
	//   17   33:aload           7
	//   18   35:ifnonnull       124
_L1:
		if(_tokens[i] != null) goto _L4; else goto _L3
	//   19   38:aload_0         
	//   20   39:getfield        #36  <Field TokenBuffer[] _tokens>
	//   21   42:iload           5
	//   22   44:aaload          
	//   23   45:ifnonnull       57
_L3:
		i++;
	//   24   48:iload           5
	//   25   50:iconst_1        
	//   26   51:iadd            
	//   27   52:istore          5
		  goto _L5
	//*  28   54:goto            17
_L4:
		if(!_properties[i].hasDefaultType())
	//*  29   57:aload_0         
	//*  30   58:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//*  31   61:iload           5
	//*  32   63:aaload          
	//*  33   64:invokevirtual   #104 <Method boolean ExternalTypeHandler$ExtTypedProperty.hasDefaultType()>
	//*  34   67:ifne            94
			throw deserializationcontext.mappingException("Missing external type id property '%s'", new Object[] {
				_properties[i].getTypePropertyName()
			});
	//   35   70:aload_2         
	//   36   71:ldc1            #106 <String "Missing external type id property '%s'">
	//   37   73:iconst_1        
	//   38   74:anewarray       Object[]
	//   39   77:dup             
	//   40   78:iconst_0        
	//   41   79:aload_0         
	//   42   80:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   43   83:iload           5
	//   44   85:aaload          
	//   45   86:invokevirtual   #110 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//   46   89:aastore         
	//   47   90:invokevirtual   #116 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   48   93:athrow          
		s = _properties[i].getDefaultTypeId();
	//   49   94:aload_0         
	//   50   95:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   51   98:iload           5
	//   52  100:aaload          
	//   53  101:invokevirtual   #119 <Method String ExternalTypeHandler$ExtTypedProperty.getDefaultTypeId()>
	//   54  104:astore          7
_L7:
		aobj[i] = _deserialize(jsonparser, deserializationcontext, i, s);
	//   55  106:aload           8
	//   56  108:iload           5
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:aload_2         
	//   60  113:iload           5
	//   61  115:aload           7
	//   62  117:invokevirtual   #121 <Method Object _deserialize(JsonParser, DeserializationContext, int, String)>
	//   63  120:aastore         
		  goto _L3
	//*  64  121:goto            48
_L2:
		if(_tokens[i] != null) goto _L7; else goto _L6
	//   65  124:aload_0         
	//   66  125:getfield        #36  <Field TokenBuffer[] _tokens>
	//   67  128:iload           5
	//   68  130:aaload          
	//   69  131:ifnonnull       106
_L6:
		throw deserializationcontext.mappingException("Missing property '%s' for external type id '%s'", new Object[] {
			_properties[i].getProperty().getName(), _properties[i].getTypePropertyName()
		});
	//   70  134:aload_2         
	//   71  135:ldc1            #123 <String "Missing property '%s' for external type id '%s'">
	//   72  137:iconst_2        
	//   73  138:anewarray       Object[]
	//   74  141:dup             
	//   75  142:iconst_0        
	//   76  143:aload_0         
	//   77  144:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   78  147:iload           5
	//   79  149:aaload          
	//   80  150:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   81  153:invokevirtual   #126 <Method String SettableBeanProperty.getName()>
	//   82  156:aastore         
	//   83  157:dup             
	//   84  158:iconst_1        
	//   85  159:aload_0         
	//   86  160:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   87  163:iload           5
	//   88  165:aaload          
	//   89  166:invokevirtual   #110 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//   90  169:aastore         
	//   91  170:invokevirtual   #116 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   92  173:athrow          
		for(int j = 0; j < l; j++)
	//*  93  174:iconst_0        
	//*  94  175:istore          5
	//*  95  177:iload           5
	//*  96  179:iload           6
	//*  97  181:icmpge          227
		{
			jsonparser = ((JsonParser) (_properties[j].getProperty()));
	//   98  184:aload_0         
	//   99  185:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//  100  188:iload           5
	//  101  190:aaload          
	//  102  191:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//  103  194:astore_1        
			if(propertybasedcreator.findCreatorProperty(((SettableBeanProperty) (jsonparser)).getName()) != null)
	//* 104  195:aload           4
	//* 105  197:aload_1         
	//* 106  198:invokevirtual   #126 <Method String SettableBeanProperty.getName()>
	//* 107  201:invokevirtual   #132 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//* 108  204:ifnull          218
				propertyvaluebuffer.assignParameter(((SettableBeanProperty) (jsonparser)), aobj[j]);
	//  109  207:aload_3         
	//  110  208:aload_1         
	//  111  209:aload           8
	//  112  211:iload           5
	//  113  213:aaload          
	//  114  214:invokevirtual   #138 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//  115  217:pop             
		}

	//  116  218:iload           5
	//  117  220:iconst_1        
	//  118  221:iadd            
	//  119  222:istore          5
	//* 120  224:goto            177
		jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//  121  227:aload           4
	//  122  229:aload_2         
	//  123  230:aload_3         
	//  124  231:invokevirtual   #142 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  125  234:astore_1        
		for(int k = 0; k < l; k++)
	//* 126  235:iconst_0        
	//* 127  236:istore          5
	//* 128  238:iload           5
	//* 129  240:iload           6
	//* 130  242:icmpge          287
		{
			deserializationcontext = ((DeserializationContext) (_properties[k].getProperty()));
	//  131  245:aload_0         
	//  132  246:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//  133  249:iload           5
	//  134  251:aaload          
	//  135  252:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//  136  255:astore_2        
			if(propertybasedcreator.findCreatorProperty(((SettableBeanProperty) (deserializationcontext)).getName()) == null)
	//* 137  256:aload           4
	//* 138  258:aload_2         
	//* 139  259:invokevirtual   #126 <Method String SettableBeanProperty.getName()>
	//* 140  262:invokevirtual   #132 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//* 141  265:ifnonnull       278
				((SettableBeanProperty) (deserializationcontext)).set(((Object) (jsonparser)), aobj[k]);
	//  142  268:aload_2         
	//  143  269:aload_1         
	//  144  270:aload           8
	//  145  272:iload           5
	//  146  274:aaload          
	//  147  275:invokevirtual   #94  <Method void SettableBeanProperty.set(Object, Object)>
		}

	//  148  278:iload           5
	//  149  280:iconst_1        
	//  150  281:iadd            
	//  151  282:istore          5
	//* 152  284:goto            238
		return ((Object) (jsonparser));
	//  153  287:aload_1         
	//  154  288:areturn         
	}

	public Object complete(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		int i;
		int j;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		j = _properties.length;
	//    2    3:aload_0         
	//    3    4:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//    4    7:arraylength     
	//    5    8:istore          5
_L2:
		Object obj1;
		Object obj2;
		if(i >= j)
			break MISSING_BLOCK_LABEL_254;
	//    6   10:iload           4
	//    7   12:iload           5
	//    8   14:icmpge          254
		obj2 = ((Object) (_typeIds[i]));
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field String[] _typeIds>
	//   11   21:iload           4
	//   12   23:aaload          
	//   13   24:astore          7
		if(obj2 != null)
			break; /* Loop/switch isn't completed */
	//   14   26:aload           7
	//   15   28:ifnonnull       200
		TokenBuffer tokenbuffer = _tokens[i];
	//   16   31:aload_0         
	//   17   32:getfield        #36  <Field TokenBuffer[] _tokens>
	//   18   35:iload           4
	//   19   37:aaload          
	//   20   38:astore          8
		if(tokenbuffer != null)
	//*  21   40:aload           8
	//*  22   42:ifnonnull       54
	//*  23   45:iload           4
	//*  24   47:iconst_1        
	//*  25   48:iadd            
	//*  26   49:istore          4
	//*  27   51:goto            10
		{
label0:
			{
				JsonToken jsontoken = tokenbuffer.firstToken();
	//   28   54:aload           8
	//   29   56:invokevirtual   #146 <Method JsonToken TokenBuffer.firstToken()>
	//   30   59:astore          9
				obj1 = obj2;
	//   31   61:aload           7
	//   32   63:astore          6
				if(jsontoken == null)
					break MISSING_BLOCK_LABEL_186;
	//   33   65:aload           9
	//   34   67:ifnull          186
				obj1 = obj2;
	//   35   70:aload           7
	//   36   72:astore          6
				if(!jsontoken.isScalarValue())
					break MISSING_BLOCK_LABEL_186;
	//   37   74:aload           9
	//   38   76:invokevirtual   #149 <Method boolean JsonToken.isScalarValue()>
	//   39   79:ifeq            186
				obj2 = ((Object) (tokenbuffer.asParser(jsonparser)));
	//   40   82:aload           8
	//   41   84:aload_1         
	//   42   85:invokevirtual   #48  <Method JsonParser TokenBuffer.asParser(JsonParser)>
	//   43   88:astore          7
				((JsonParser) (obj2)).nextToken();
	//   44   90:aload           7
	//   45   92:invokevirtual   #54  <Method JsonToken JsonParser.nextToken()>
	//   46   95:pop             
				obj1 = ((Object) (_properties[i].getProperty()));
	//   47   96:aload_0         
	//   48   97:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   49  100:iload           4
	//   50  102:aaload          
	//   51  103:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//   52  106:astore          6
				obj2 = TypeDeserializer.deserializeIfNatural(((JsonParser) (obj2)), deserializationcontext, ((SettableBeanProperty) (obj1)).getType());
	//   53  108:aload           7
	//   54  110:aload_2         
	//   55  111:aload           6
	//   56  113:invokevirtual   #153 <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//   57  116:invokestatic    #159 <Method Object TypeDeserializer.deserializeIfNatural(JsonParser, DeserializationContext, com.fasterxml.jackson.databind.JavaType)>
	//   58  119:astore          7
				if(obj2 == null)
					break label0;
	//   59  121:aload           7
	//   60  123:ifnull          137
				((SettableBeanProperty) (obj1)).set(obj, obj2);
	//   61  126:aload           6
	//   62  128:aload_3         
	//   63  129:aload           7
	//   64  131:invokevirtual   #94  <Method void SettableBeanProperty.set(Object, Object)>
			}
		}
_L3:
		i++;
		if(true) goto _L2; else goto _L1
	//*  65  134:goto            45
		if(!_properties[i].hasDefaultType())
	//*  66  137:aload_0         
	//*  67  138:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//*  68  141:iload           4
	//*  69  143:aaload          
	//*  70  144:invokevirtual   #104 <Method boolean ExternalTypeHandler$ExtTypedProperty.hasDefaultType()>
	//*  71  147:ifne            174
			throw deserializationcontext.mappingException("Missing external type id property '%s'", new Object[] {
				_properties[i].getTypePropertyName()
			});
	//   72  150:aload_2         
	//   73  151:ldc1            #106 <String "Missing external type id property '%s'">
	//   74  153:iconst_1        
	//   75  154:anewarray       Object[]
	//   76  157:dup             
	//   77  158:iconst_0        
	//   78  159:aload_0         
	//   79  160:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   80  163:iload           4
	//   81  165:aaload          
	//   82  166:invokevirtual   #110 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//   83  169:aastore         
	//   84  170:invokevirtual   #116 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   85  173:athrow          
		obj1 = ((Object) (_properties[i].getDefaultTypeId()));
	//   86  174:aload_0         
	//   87  175:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//   88  178:iload           4
	//   89  180:aaload          
	//   90  181:invokevirtual   #119 <Method String ExternalTypeHandler$ExtTypedProperty.getDefaultTypeId()>
	//   91  184:astore          6
_L5:
		_deserializeAndSet(jsonparser, deserializationcontext, obj, i, ((String) (obj1)));
	//   92  186:aload_0         
	//   93  187:aload_1         
	//   94  188:aload_2         
	//   95  189:aload_3         
	//   96  190:iload           4
	//   97  192:aload           6
	//   98  194:invokevirtual   #161 <Method void _deserializeAndSet(JsonParser, DeserializationContext, Object, int, String)>
		  goto _L3
	//*  99  197:goto            45
_L1:
		obj1 = obj2;
	//  100  200:aload           7
	//  101  202:astore          6
		if(_tokens[i] != null) goto _L5; else goto _L4
	//  102  204:aload_0         
	//  103  205:getfield        #36  <Field TokenBuffer[] _tokens>
	//  104  208:iload           4
	//  105  210:aaload          
	//  106  211:ifnonnull       186
_L4:
		throw deserializationcontext.mappingException("Missing property '%s' for external type id '%s'", new Object[] {
			_properties[i].getProperty().getName(), _properties[i].getTypePropertyName()
		});
	//  107  214:aload_2         
	//  108  215:ldc1            #123 <String "Missing property '%s' for external type id '%s'">
	//  109  217:iconst_2        
	//  110  218:anewarray       Object[]
	//  111  221:dup             
	//  112  222:iconst_0        
	//  113  223:aload_0         
	//  114  224:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//  115  227:iload           4
	//  116  229:aaload          
	//  117  230:invokevirtual   #81  <Method SettableBeanProperty ExternalTypeHandler$ExtTypedProperty.getProperty()>
	//  118  233:invokevirtual   #126 <Method String SettableBeanProperty.getName()>
	//  119  236:aastore         
	//  120  237:dup             
	//  121  238:iconst_1        
	//  122  239:aload_0         
	//  123  240:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//  124  243:iload           4
	//  125  245:aaload          
	//  126  246:invokevirtual   #110 <Method String ExternalTypeHandler$ExtTypedProperty.getTypePropertyName()>
	//  127  249:aastore         
	//  128  250:invokevirtual   #116 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//  129  253:athrow          
		return obj;
	//  130  254:aload_3         
	//  131  255:areturn         
	}

	public boolean handlePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj)
		throws IOException
	{
		Integer integer = (Integer)_nameToPropertyIndex.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HashMap _nameToPropertyIndex>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #169 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #171 <Class Integer>
	//    5   11:astore          7
		if(integer == null)
	//*   6   13:aload           7
	//*   7   15:ifnonnull       20
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		int i = integer.intValue();
	//   10   20:aload           7
	//   11   22:invokevirtual   #175 <Method int Integer.intValue()>
	//   12   25:istore          6
		boolean flag;
		if(_properties[i].hasTypePropertyName(s))
	//*  13   27:aload_0         
	//*  14   28:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//*  15   31:iload           6
	//*  16   33:aaload          
	//*  17   34:aload_3         
	//*  18   35:invokevirtual   #179 <Method boolean ExternalTypeHandler$ExtTypedProperty.hasTypePropertyName(String)>
	//*  19   38:ifeq            123
		{
			_typeIds[i] = jsonparser.getText();
	//   20   41:aload_0         
	//   21   42:getfield        #32  <Field String[] _typeIds>
	//   22   45:iload           6
	//   23   47:aload_1         
	//   24   48:invokevirtual   #182 <Method String JsonParser.getText()>
	//   25   51:aastore         
			jsonparser.skipChildren();
	//   26   52:aload_1         
	//   27   53:invokevirtual   #186 <Method JsonParser JsonParser.skipChildren()>
	//   28   56:pop             
			if(obj != null && _tokens[i] != null)
	//*  29   57:aload           4
	//*  30   59:ifnull          117
	//*  31   62:aload_0         
	//*  32   63:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  33   66:iload           6
	//*  34   68:aaload          
	//*  35   69:ifnull          117
				flag = true;
	//   36   72:iconst_1        
	//   37   73:istore          5
			else
	//*  38   75:iload           5
	//*  39   77:ifeq            115
	//*  40   80:aload_0         
	//*  41   81:getfield        #32  <Field String[] _typeIds>
	//*  42   84:iload           6
	//*  43   86:aaload          
	//*  44   87:astore_3        
	//*  45   88:aload_0         
	//*  46   89:getfield        #32  <Field String[] _typeIds>
	//*  47   92:iload           6
	//*  48   94:aconst_null     
	//*  49   95:aastore         
	//*  50   96:aload_0         
	//*  51   97:aload_1         
	//*  52   98:aload_2         
	//*  53   99:aload           4
	//*  54  101:iload           6
	//*  55  103:aload_3         
	//*  56  104:invokevirtual   #161 <Method void _deserializeAndSet(JsonParser, DeserializationContext, Object, int, String)>
	//*  57  107:aload_0         
	//*  58  108:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  59  111:iload           6
	//*  60  113:aconst_null     
	//*  61  114:aastore         
	//*  62  115:iconst_1        
	//*  63  116:ireturn         
				flag = false;
	//   64  117:iconst_0        
	//   65  118:istore          5
		} else
	//*  66  120:goto            75
		{
			s = ((String) (new TokenBuffer(jsonparser, deserializationcontext)));
	//   67  123:new             #34  <Class TokenBuffer>
	//   68  126:dup             
	//   69  127:aload_1         
	//   70  128:aload_2         
	//   71  129:invokespecial   #63  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//   72  132:astore_3        
			((TokenBuffer) (s)).copyCurrentStructure(jsonparser);
	//   73  133:aload_3         
	//   74  134:aload_1         
	//   75  135:invokevirtual   #74  <Method void TokenBuffer.copyCurrentStructure(JsonParser)>
			_tokens[i] = ((TokenBuffer) (s));
	//   76  138:aload_0         
	//   77  139:getfield        #36  <Field TokenBuffer[] _tokens>
	//   78  142:iload           6
	//   79  144:aload_3         
	//   80  145:aastore         
			if(obj != null && _typeIds[i] != null)
	//*  81  146:aload           4
	//*  82  148:ifnull          167
	//*  83  151:aload_0         
	//*  84  152:getfield        #32  <Field String[] _typeIds>
	//*  85  155:iload           6
	//*  86  157:aaload          
	//*  87  158:ifnull          167
				flag = true;
	//   88  161:iconst_1        
	//   89  162:istore          5
			else
	//*  90  164:goto            75
				flag = false;
	//   91  167:iconst_0        
	//   92  168:istore          5
		}
		if(flag)
		{
			s = _typeIds[i];
			_typeIds[i] = null;
			_deserializeAndSet(jsonparser, deserializationcontext, obj, i, s);
			_tokens[i] = null;
		}
		return true;
	//*  93  170:goto            164
	}

	public boolean handleTypePropertyValue(JsonParser jsonparser, DeserializationContext deserializationcontext, String s, Object obj)
		throws IOException
	{
		Integer integer = (Integer)_nameToPropertyIndex.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HashMap _nameToPropertyIndex>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #169 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #171 <Class Integer>
	//    5   11:astore          7
		int i;
		if(integer != null)
	//*   6   13:aload           7
	//*   7   15:ifnonnull       20
	//*   8   18:iconst_0        
	//*   9   19:ireturn         
	//*  10   20:aload           7
	//*  11   22:invokevirtual   #175 <Method int Integer.intValue()>
	//*  12   25:istore          6
			if(_properties[i = integer.intValue()].hasTypePropertyName(s))
	//*  13   27:aload_0         
	//*  14   28:getfield        #26  <Field ExternalTypeHandler$ExtTypedProperty[] _properties>
	//*  15   31:iload           6
	//*  16   33:aaload          
	//*  17   34:aload_3         
	//*  18   35:invokevirtual   #179 <Method boolean ExternalTypeHandler$ExtTypedProperty.hasTypePropertyName(String)>
	//*  19   38:ifeq            18
			{
				s = jsonparser.getText();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #182 <Method String JsonParser.getText()>
	//   22   45:astore_3        
				boolean flag;
				if(obj != null && _tokens[i] != null)
	//*  23   46:aload           4
	//*  24   48:ifnull          90
	//*  25   51:aload_0         
	//*  26   52:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  27   55:iload           6
	//*  28   57:aaload          
	//*  29   58:ifnull          90
					flag = true;
	//   30   61:iconst_1        
	//   31   62:istore          5
				else
	//*  32   64:iload           5
	//*  33   66:ifeq            96
	//*  34   69:aload_0         
	//*  35   70:aload_1         
	//*  36   71:aload_2         
	//*  37   72:aload           4
	//*  38   74:iload           6
	//*  39   76:aload_3         
	//*  40   77:invokevirtual   #161 <Method void _deserializeAndSet(JsonParser, DeserializationContext, Object, int, String)>
	//*  41   80:aload_0         
	//*  42   81:getfield        #36  <Field TokenBuffer[] _tokens>
	//*  43   84:iload           6
	//*  44   86:aconst_null     
	//*  45   87:aastore         
	//*  46   88:iconst_1        
	//*  47   89:ireturn         
					flag = false;
	//   48   90:iconst_0        
	//   49   91:istore          5
				if(flag)
				{
					_deserializeAndSet(jsonparser, deserializationcontext, obj, i, s);
					_tokens[i] = null;
				} else
	//*  50   93:goto            64
				{
					_typeIds[i] = s;
	//   51   96:aload_0         
	//   52   97:getfield        #32  <Field String[] _typeIds>
	//   53  100:iload           6
	//   54  102:aload_3         
	//   55  103:aastore         
				}
				return true;
			}
		return false;
	//*  56  104:goto            88
	}

	public ExternalTypeHandler start()
	{
		return new ExternalTypeHandler(this);
	//    0    0:new             #2   <Class ExternalTypeHandler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #191 <Method void ExternalTypeHandler(ExternalTypeHandler)>
	//    4    8:areturn         
	}

	private final HashMap _nameToPropertyIndex;
	private final ExtTypedProperty _properties[];
	private final TokenBuffer _tokens[];
	private final String _typeIds[];
}
