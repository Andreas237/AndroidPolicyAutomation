// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			ObjectIdWriter

public class BeanAsArraySerializer extends BeanSerializerBase
{

	public BeanAsArraySerializer(BeanSerializerBase beanserializerbase)
	{
		super(beanserializerbase, (ObjectIdWriter)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #14  <Class ObjectIdWriter>
	//    4    6:invokespecial   #17  <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter)>
		_defaultSerializer = beanserializerbase;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field BeanSerializerBase _defaultSerializer>
	//    8   14:return          
	}

	protected BeanAsArraySerializer(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter, Object obj)
	{
		super(beanserializerbase, objectidwriter, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #23  <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter, Object)>
		_defaultSerializer = beanserializerbase;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #19  <Field BeanSerializerBase _defaultSerializer>
	//    8   12:return          
	}

	protected BeanAsArraySerializer(BeanSerializerBase beanserializerbase, Set set)
	{
		super(beanserializerbase, set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BeanSerializerBase(BeanSerializerBase, Set)>
		_defaultSerializer = beanserializerbase;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #19  <Field BeanSerializerBase _defaultSerializer>
	//    7   11:return          
	}

	private boolean hasSingleElement(SerializerProvider serializerprovider)
	{
		if(_filteredProps != null && serializerprovider.getActiveView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          22
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #40  <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          22
			serializerprovider = ((SerializerProvider) (_filteredProps));
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field BeanPropertyWriter[] _filteredProps>
	//    8   18:astore_1        
		else
	//*   9   19:goto            27
			serializerprovider = ((SerializerProvider) (_props));
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field BeanPropertyWriter[] _props>
	//   12   26:astore_1        
		return serializerprovider.length == 1;
	//   13   27:aload_1         
	//   14   28:arraylength     
	//   15   29:iconst_1        
	//   16   30:icmpne          35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	protected BeanSerializerBase asArraySerializer()
	{
		return ((BeanSerializerBase) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean isUnwrappingSerializer()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(serializerprovider))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #57  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*   2    4:invokevirtual   #61  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            26
	//*   4   10:aload_0         
	//*   5   11:aload_3         
	//*   6   12:invokespecial   #63  <Method boolean hasSingleElement(SerializerProvider)>
	//*   7   15:ifeq            26
		{
			serializeAsArray(obj, jsongenerator, serializerprovider);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #66  <Method void serializeAsArray(Object, JsonGenerator, SerializerProvider)>
			return;
	//   13   25:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #72  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.setCurrentValue(obj);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #76  <Method void JsonGenerator.setCurrentValue(Object)>
			serializeAsArray(obj, jsongenerator, serializerprovider);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #66  <Method void serializeAsArray(Object, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   24   42:aload_2         
	//   25   43:invokevirtual   #79  <Method void JsonGenerator.writeEndArray()>
			return;
	//   26   46:return          
		}
	}

	protected final void serializeAsArray(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int j;
		int k;
		BeanPropertyWriter abeanpropertywriter[];
		if(_filteredProps != null && serializerprovider.getActiveView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          23
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #40  <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          23
			abeanpropertywriter = _filteredProps;
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field BeanPropertyWriter[] _filteredProps>
	//    8   18:astore          8
		else
	//*   9   20:goto            29
			abeanpropertywriter = _props;
	//   10   23:aload_0         
	//   11   24:getfield        #43  <Field BeanPropertyWriter[] _props>
	//   12   27:astore          8
		j = 0;
	//   13   29:iconst_0        
	//   14   30:istore          5
		k = 0;
	//   15   32:iconst_0        
	//   16   33:istore          6
		i = 0;
	//   17   35:iconst_0        
	//   18   36:istore          4
		int l = abeanpropertywriter.length;
	//   19   38:aload           8
	//   20   40:arraylength     
	//   21   41:istore          7
_L2:
		if(i >= l)
			break; /* Loop/switch isn't completed */
	//   22   43:iload           4
	//   23   45:iload           7
	//   24   47:icmpge          183
		BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
	//   25   50:aload           8
	//   26   52:iload           4
	//   27   54:aaload          
	//   28   55:astore          9
		if(beanpropertywriter == null)
	//*  29   57:aload           9
	//*  30   59:ifnonnull       77
		{
			j = i;
	//   31   62:iload           4
	//   32   64:istore          5
			k = i;
	//   33   66:iload           4
	//   34   68:istore          6
			try
			{
				jsongenerator.writeNull();
	//   35   70:aload_2         
	//   36   71:invokevirtual   #87  <Method void JsonGenerator.writeNull()>
				break MISSING_BLOCK_LABEL_93;
	//   37   74:goto            93
			}
	//*  38   77:iload           4
	//*  39   79:istore          5
	//*  40   81:iload           4
	//*  41   83:istore          6
	//*  42   85:aload           9
	//*  43   87:aload_1         
	//*  44   88:aload_2         
	//*  45   89:aload_3         
	//*  46   90:invokevirtual   #92  <Method void BeanPropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
	//*  47   93:iload           4
	//*  48   95:iconst_1        
	//*  49   96:iadd            
	//*  50   97:istore          4
	//*  51   99:goto            43
	//*  52  102:astore_3        
	//*  53  103:aload_2         
	//*  54  104:ldc1            #94  <String "Infinite recursion (StackOverflowError)">
	//*  55  106:aload_3         
	//*  56  107:invokestatic    #100 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String, Throwable)>
	//*  57  110:astore_3        
	//*  58  111:iload           5
	//*  59  113:aload           8
	//*  60  115:arraylength     
	//*  61  116:icmpne          125
	//*  62  119:ldc1            #102 <String "[anySetter]">
	//*  63  121:astore_2        
	//*  64  122:goto            134
	//*  65  125:aload           8
	//*  66  127:iload           5
	//*  67  129:aaload          
	//*  68  130:invokevirtual   #106 <Method String BeanPropertyWriter.getName()>
	//*  69  133:astore_2        
	//*  70  134:aload_3         
	//*  71  135:new             #108 <Class com.fasterxml.jackson.databind.JsonMappingException$Reference>
	//*  72  138:dup             
	//*  73  139:aload_1         
	//*  74  140:aload_2         
	//*  75  141:invokespecial   #111 <Method void com.fasterxml.jackson.databind.JsonMappingException$Reference(Object, String)>
	//*  76  144:invokevirtual   #115 <Method void JsonMappingException.prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)>
	//*  77  147:aload_3         
	//*  78  148:athrow          
			catch(Exception exception)
	//*  79  149:astore          9
			{
				if(k == abeanpropertywriter.length)
	//*  80  151:iload           6
	//*  81  153:aload           8
	//*  82  155:arraylength     
	//*  83  156:icmpne          165
					jsongenerator = "[anySetter]";
	//   84  159:ldc1            #102 <String "[anySetter]">
	//   85  161:astore_2        
				else
	//*  86  162:goto            174
					jsongenerator = ((JsonGenerator) (abeanpropertywriter[k].getName()));
	//   87  165:aload           8
	//   88  167:iload           6
	//   89  169:aaload          
	//   90  170:invokevirtual   #106 <Method String BeanPropertyWriter.getName()>
	//   91  173:astore_2        
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), obj, ((String) (jsongenerator)));
	//   92  174:aload_0         
	//   93  175:aload_3         
	//   94  176:aload           9
	//   95  178:aload_1         
	//   96  179:aload_2         
	//   97  180:invokevirtual   #119 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
			// Misplaced declaration of an exception variable
			catch(SerializerProvider serializerprovider)
			{
				serializerprovider = ((SerializerProvider) (JsonMappingException.from(jsongenerator, "Infinite recursion (StackOverflowError)", ((Throwable) (serializerprovider)))));
				if(j == abeanpropertywriter.length)
					jsongenerator = "[anySetter]";
				else
					jsongenerator = ((JsonGenerator) (abeanpropertywriter[j].getName()));
				((JsonMappingException) (serializerprovider)).prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, ((String) (jsongenerator))));
				throw serializerprovider;
			}
			break; /* Loop/switch isn't completed */
		}
		j = i;
		k = i;
		beanpropertywriter.serializeAsElement(obj, jsongenerator, serializerprovider);
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//   98  183:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(_objectIdWriter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field ObjectIdWriter _objectIdWriter>
	//*   2    4:ifnull          17
		{
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, typeserializer);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokevirtual   #128 <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//    9   16:return          
		} else
		{
			jsongenerator.setCurrentValue(obj);
	//   10   17:aload_2         
	//   11   18:aload_1         
	//   12   19:invokevirtual   #76  <Method void JsonGenerator.setCurrentValue(Object)>
			com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = _typeIdDef(typeserializer, obj, JsonToken.START_ARRAY);
	//   13   22:aload_0         
	//   14   23:aload           4
	//   15   25:aload_1         
	//   16   26:getstatic       #134 <Field JsonToken JsonToken.START_ARRAY>
	//   17   29:invokevirtual   #138 <Method com.fasterxml.jackson.core.type.WritableTypeId _typeIdDef(TypeSerializer, Object, JsonToken)>
	//   18   32:astore          5
			typeserializer.writeTypePrefix(jsongenerator, writabletypeid);
	//   19   34:aload           4
	//   20   36:aload_2         
	//   21   37:aload           5
	//   22   39:invokevirtual   #144 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   23   42:pop             
			serializeAsArray(obj, jsongenerator, serializerprovider);
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:aload_2         
	//   27   46:aload_3         
	//   28   47:invokevirtual   #66  <Method void serializeAsArray(Object, JsonGenerator, SerializerProvider)>
			typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   29   50:aload           4
	//   30   52:aload_2         
	//   31   53:aload           5
	//   32   55:invokevirtual   #147 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   33   58:pop             
			return;
	//   34   59:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #150 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #152 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("BeanAsArraySerializer for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #154 <String "BeanAsArraySerializer for ">
	//    6   11:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(handledType().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #161 <Method Class handledType()>
	//   11   20:invokevirtual   #164 <Method String Class.getName()>
	//   12   23:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   16   31:areturn         
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		return _defaultSerializer.unwrappingSerializer(nametransformer);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BeanSerializerBase _defaultSerializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #170 <Method JsonSerializer BeanSerializerBase.unwrappingSerializer(NameTransformer)>
	//    4    8:areturn         
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public BeanSerializerBase withFilterId(Object obj)
	{
		return ((BeanSerializerBase) (new BeanAsArraySerializer(((BeanSerializerBase) (this)), _objectIdWriter, obj)));
	//    0    0:new             #2   <Class BeanAsArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field ObjectIdWriter _objectIdWriter>
	//    5    9:aload_1         
	//    6   10:invokespecial   #177 <Method void BeanAsArraySerializer(BeanSerializerBase, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	protected BeanAsArraySerializer withIgnorals(Set set)
	{
		return new BeanAsArraySerializer(((BeanSerializerBase) (this)), set);
	//    0    0:new             #2   <Class BeanAsArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #180 <Method void BeanAsArraySerializer(BeanSerializerBase, Set)>
	//    5    9:areturn         
	}

	protected volatile BeanSerializerBase withIgnorals(Set set)
	{
		return ((BeanSerializerBase) (withIgnorals(set)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #184 <Method BeanAsArraySerializer withIgnorals(Set)>
	//    3    5:areturn         
	}

	public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
	{
		return _defaultSerializer.withObjectIdWriter(objectidwriter);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BeanSerializerBase _defaultSerializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method BeanSerializerBase BeanSerializerBase.withObjectIdWriter(ObjectIdWriter)>
	//    4    8:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final BeanSerializerBase _defaultSerializer;
}
