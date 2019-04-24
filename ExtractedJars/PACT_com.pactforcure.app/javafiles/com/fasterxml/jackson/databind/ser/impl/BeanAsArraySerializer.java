// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

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

	protected BeanAsArraySerializer(BeanSerializerBase beanserializerbase, String as[])
	{
		super(beanserializerbase, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BeanSerializerBase(BeanSerializerBase, String[])>
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
	//*   1    1:getfield        #32  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          27
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #38  <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          27
			serializerprovider = ((SerializerProvider) (_filteredProps));
	//    6   14:aload_0         
	//    7   15:getfield        #32  <Field BeanPropertyWriter[] _filteredProps>
	//    8   18:astore_1        
		else
	//*   9   19:aload_1         
	//*  10   20:arraylength     
	//*  11   21:iconst_1        
	//*  12   22:icmpne          35
	//*  13   25:iconst_1        
	//*  14   26:ireturn         
			serializerprovider = ((SerializerProvider) (_props));
	//   15   27:aload_0         
	//   16   28:getfield        #41  <Field BeanPropertyWriter[] _props>
	//   17   31:astore_1        
		return serializerprovider.length == 1;
	//   18   32:goto            19
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
	//*   1    1:getstatic       #55  <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*   2    4:invokevirtual   #59  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            26
	//*   4   10:aload_0         
	//*   5   11:aload_3         
	//*   6   12:invokespecial   #61  <Method boolean hasSingleElement(SerializerProvider)>
	//*   7   15:ifeq            26
		{
			serializeAsArray(obj, jsongenerator, serializerprovider);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #64  <Method void serializeAsArray(Object, JsonGenerator, SerializerProvider)>
			return;
	//   13   25:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #70  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.setCurrentValue(obj);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #74  <Method void JsonGenerator.setCurrentValue(Object)>
			serializeAsArray(obj, jsongenerator, serializerprovider);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #64  <Method void serializeAsArray(Object, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   24   42:aload_2         
	//   25   43:invokevirtual   #77  <Method void JsonGenerator.writeEndArray()>
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
		BeanPropertyWriter beanpropertywriter;
		int l;
		if(_filteredProps != null && serializerprovider.getActiveView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          74
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #38  <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          74
			abeanpropertywriter = _filteredProps;
	//    6   14:aload_0         
	//    7   15:getfield        #32  <Field BeanPropertyWriter[] _filteredProps>
	//    8   18:astore          8
		else
	//*   9   20:iconst_0        
	//*  10   21:istore          5
	//*  11   23:iconst_0        
	//*  12   24:istore          6
	//*  13   26:iconst_0        
	//*  14   27:istore          4
	//*  15   29:aload           8
	//*  16   31:arraylength     
	//*  17   32:istore          7
	//*  18   34:iload           4
	//*  19   36:iload           7
	//*  20   38:icmpge          124
	//*  21   41:aload           8
	//*  22   43:iload           4
	//*  23   45:aaload          
	//*  24   46:astore          9
	//*  25   48:aload           9
	//*  26   50:ifnonnull       83
	//*  27   53:iload           4
	//*  28   55:istore          5
	//*  29   57:iload           4
	//*  30   59:istore          6
	//*  31   61:aload_2         
	//*  32   62:invokevirtual   #85  <Method void JsonGenerator.writeNull()>
	//*  33   65:iload           4
	//*  34   67:iconst_1        
	//*  35   68:iadd            
	//*  36   69:istore          4
	//*  37   71:goto            34
			abeanpropertywriter = _props;
	//   38   74:aload_0         
	//   39   75:getfield        #41  <Field BeanPropertyWriter[] _props>
	//   40   78:astore          8
		j = 0;
		k = 0;
		i = 0;
		l = abeanpropertywriter.length;
_L2:
		if(i >= l)
			break MISSING_BLOCK_LABEL_124;
		beanpropertywriter = abeanpropertywriter[i];
		if(beanpropertywriter != null)
			break; /* Loop/switch isn't completed */
		j = i;
		k = i;
		jsongenerator.writeNull();
_L3:
		i++;
		if(true) goto _L2; else goto _L1
	//*  41   80:goto            20
_L1:
		j = i;
	//   42   83:iload           4
	//   43   85:istore          5
		k = i;
	//   44   87:iload           4
	//   45   89:istore          6
		beanpropertywriter.serializeAsElement(obj, jsongenerator, serializerprovider);
	//   46   91:aload           9
	//   47   93:aload_1         
	//   48   94:aload_2         
	//   49   95:aload_3         
	//   50   96:invokevirtual   #90  <Method void BeanPropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
		  goto _L3
	//*  51   99:goto            65
		Exception exception;
		exception;
	//   52  102:astore          9
		if(j == abeanpropertywriter.length)
	//*  53  104:iload           5
	//*  54  106:aload           8
	//*  55  108:arraylength     
	//*  56  109:icmpne          125
			jsongenerator = "[anySetter]";
	//   57  112:ldc1            #92  <String "[anySetter]">
	//   58  114:astore_2        
		else
	//*  59  115:aload_0         
	//*  60  116:aload_3         
	//*  61  117:aload           9
	//*  62  119:aload_1         
	//*  63  120:aload_2         
	//*  64  121:invokevirtual   #96  <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//*  65  124:return          
			jsongenerator = ((JsonGenerator) (abeanpropertywriter[j].getName()));
	//   66  125:aload           8
	//   67  127:iload           5
	//   68  129:aaload          
	//   69  130:invokevirtual   #100 <Method String BeanPropertyWriter.getName()>
	//   70  133:astore_2        
		wrapAndThrow(serializerprovider, ((Throwable) (exception)), obj, ((String) (jsongenerator)));
		return;
	//*  71  134:goto            115
		serializerprovider;
	//   72  137:astore_3        
		serializerprovider = ((SerializerProvider) (JsonMappingException.from(jsongenerator, "Infinite recursion (StackOverflowError)", ((Throwable) (serializerprovider)))));
	//   73  138:aload_2         
	//   74  139:ldc1            #102 <String "Infinite recursion (StackOverflowError)">
	//   75  141:aload_3         
	//   76  142:invokestatic    #108 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String, Throwable)>
	//   77  145:astore_3        
		if(k == abeanpropertywriter.length)
	//*  78  146:iload           6
	//*  79  148:aload           8
	//*  80  150:arraylength     
	//*  81  151:icmpne          172
			jsongenerator = "[anySetter]";
	//   82  154:ldc1            #92  <String "[anySetter]">
	//   83  156:astore_2        
		else
	//*  84  157:aload_3         
	//*  85  158:new             #110 <Class com.fasterxml.jackson.databind.JsonMappingException$Reference>
	//*  86  161:dup             
	//*  87  162:aload_1         
	//*  88  163:aload_2         
	//*  89  164:invokespecial   #113 <Method void com.fasterxml.jackson.databind.JsonMappingException$Reference(Object, String)>
	//*  90  167:invokevirtual   #117 <Method void JsonMappingException.prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)>
	//*  91  170:aload_3         
	//*  92  171:athrow          
			jsongenerator = ((JsonGenerator) (abeanpropertywriter[k].getName()));
	//   93  172:aload           8
	//   94  174:iload           6
	//   95  176:aaload          
	//   96  177:invokevirtual   #100 <Method String BeanPropertyWriter.getName()>
	//   97  180:astore_2        
		((JsonMappingException) (serializerprovider)).prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, ((String) (jsongenerator))));
		throw serializerprovider;
	//*  98  181:goto            157
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(_objectIdWriter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field ObjectIdWriter _objectIdWriter>
	//*   2    4:ifnull          17
		{
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, typeserializer);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokevirtual   #126 <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//    9   16:return          
		}
		String s;
		if(_typeId == null)
	//*  10   17:aload_0         
	//*  11   18:getfield        #130 <Field com.fasterxml.jackson.databind.introspect.AnnotatedMember _typeId>
	//*  12   21:ifnonnull       59
			s = null;
	//   13   24:aconst_null     
	//   14   25:astore          5
		else
	//*  15   27:aload           5
	//*  16   29:ifnonnull       69
	//*  17   32:aload           4
	//*  18   34:aload_1         
	//*  19   35:aload_2         
	//*  20   36:invokevirtual   #136 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
	//*  21   39:aload_0         
	//*  22   40:aload_1         
	//*  23   41:aload_2         
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #64  <Method void serializeAsArray(Object, JsonGenerator, SerializerProvider)>
	//*  26   46:aload           5
	//*  27   48:ifnonnull       81
	//*  28   51:aload           4
	//*  29   53:aload_1         
	//*  30   54:aload_2         
	//*  31   55:invokevirtual   #139 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
	//*  32   58:return          
			s = _customTypeId(obj);
	//   33   59:aload_0         
	//   34   60:aload_1         
	//   35   61:invokevirtual   #143 <Method String _customTypeId(Object)>
	//   36   64:astore          5
		if(s == null)
			typeserializer.writeTypePrefixForArray(obj, jsongenerator);
		else
	//*  37   66:goto            27
			typeserializer.writeCustomTypePrefixForArray(obj, jsongenerator, s);
	//   38   69:aload           4
	//   39   71:aload_1         
	//   40   72:aload_2         
	//   41   73:aload           5
	//   42   75:invokevirtual   #147 <Method void TypeSerializer.writeCustomTypePrefixForArray(Object, JsonGenerator, String)>
		serializeAsArray(obj, jsongenerator, serializerprovider);
		if(s == null)
		{
			typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
			return;
		} else
	//*  43   78:goto            39
		{
			typeserializer.writeCustomTypeSuffixForArray(obj, jsongenerator, s);
	//   44   81:aload           4
	//   45   83:aload_1         
	//   46   84:aload_2         
	//   47   85:aload           5
	//   48   87:invokevirtual   #150 <Method void TypeSerializer.writeCustomTypeSuffixForArray(Object, JsonGenerator, String)>
			return;
	//   49   90:return          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("BeanAsArraySerializer for ").append(handledType().getName()).toString();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void StringBuilder()>
	//    3    7:ldc1            #157 <String "BeanAsArraySerializer for ">
	//    4    9:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #164 <Method Class handledType()>
	//    7   16:invokevirtual   #167 <Method String Class.getName()>
	//    8   19:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #169 <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		return _defaultSerializer.unwrappingSerializer(nametransformer);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BeanSerializerBase _defaultSerializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #173 <Method JsonSerializer BeanSerializerBase.unwrappingSerializer(NameTransformer)>
	//    4    8:areturn         
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #180 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public BeanSerializerBase withFilterId(Object obj)
	{
		return ((BeanSerializerBase) (new BeanAsArraySerializer(((BeanSerializerBase) (this)), _objectIdWriter, obj)));
	//    0    0:new             #2   <Class BeanAsArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #123 <Field ObjectIdWriter _objectIdWriter>
	//    5    9:aload_1         
	//    6   10:invokespecial   #181 <Method void BeanAsArraySerializer(BeanSerializerBase, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	protected BeanAsArraySerializer withIgnorals(String as[])
	{
		return new BeanAsArraySerializer(((BeanSerializerBase) (this)), as);
	//    0    0:new             #2   <Class BeanAsArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #184 <Method void BeanAsArraySerializer(BeanSerializerBase, String[])>
	//    5    9:areturn         
	}

	protected volatile BeanSerializerBase withIgnorals(String as[])
	{
		return ((BeanSerializerBase) (withIgnorals(as)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #187 <Method BeanAsArraySerializer withIgnorals(String[])>
	//    3    5:areturn         
	}

	public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
	{
		return _defaultSerializer.withObjectIdWriter(objectidwriter);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BeanSerializerBase _defaultSerializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method BeanSerializerBase BeanSerializerBase.withObjectIdWriter(ObjectIdWriter)>
	//    4    8:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final BeanSerializerBase _defaultSerializer;
}
