// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, EnumSerializer, StdDelegatingSerializer

public abstract class BeanSerializerBase extends StdSerializer
	implements JsonFormatVisitable, SchemaAware, ContextualSerializer, ResolvableSerializer
{

	protected BeanSerializerBase(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void StdSerializer(JavaType)>
		_beanType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #56  <Field JavaType _beanType>
		_props = abeanpropertywriter;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #58  <Field BeanPropertyWriter[] _props>
		_filteredProps = abeanpropertywriter1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #60  <Field BeanPropertyWriter[] _filteredProps>
		javatype = null;
	//   12   21:aconst_null     
	//   13   22:astore_1        
		if(beanserializerbuilder == null)
	//*  14   23:aload_2         
	//*  15   24:ifnonnull       53
		{
			_typeId = null;
	//   16   27:aload_0         
	//   17   28:aconst_null     
	//   18   29:putfield        #62  <Field AnnotatedMember _typeId>
			_anyGetterWriter = null;
	//   19   32:aload_0         
	//   20   33:aconst_null     
	//   21   34:putfield        #64  <Field AnyGetterWriter _anyGetterWriter>
			_propertyFilterId = null;
	//   22   37:aload_0         
	//   23   38:aconst_null     
	//   24   39:putfield        #66  <Field Object _propertyFilterId>
			_objectIdWriter = null;
	//   25   42:aload_0         
	//   26   43:aconst_null     
	//   27   44:putfield        #68  <Field ObjectIdWriter _objectIdWriter>
			_serializationShape = null;
	//   28   47:aload_0         
	//   29   48:aconst_null     
	//   30   49:putfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
			return;
	//   31   52:return          
		}
		_typeId = beanserializerbuilder.getTypeId();
	//   32   53:aload_0         
	//   33   54:aload_2         
	//   34   55:invokevirtual   #76  <Method AnnotatedMember BeanSerializerBuilder.getTypeId()>
	//   35   58:putfield        #62  <Field AnnotatedMember _typeId>
		_anyGetterWriter = beanserializerbuilder.getAnyGetter();
	//   36   61:aload_0         
	//   37   62:aload_2         
	//   38   63:invokevirtual   #80  <Method AnyGetterWriter BeanSerializerBuilder.getAnyGetter()>
	//   39   66:putfield        #64  <Field AnyGetterWriter _anyGetterWriter>
		_propertyFilterId = beanserializerbuilder.getFilterId();
	//   40   69:aload_0         
	//   41   70:aload_2         
	//   42   71:invokevirtual   #84  <Method Object BeanSerializerBuilder.getFilterId()>
	//   43   74:putfield        #66  <Field Object _propertyFilterId>
		_objectIdWriter = beanserializerbuilder.getObjectIdWriter();
	//   44   77:aload_0         
	//   45   78:aload_2         
	//   46   79:invokevirtual   #88  <Method ObjectIdWriter BeanSerializerBuilder.getObjectIdWriter()>
	//   47   82:putfield        #68  <Field ObjectIdWriter _objectIdWriter>
		beanserializerbuilder = ((BeanSerializerBuilder) (beanserializerbuilder.getBeanDescription().findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//   48   85:aload_2         
	//   49   86:invokevirtual   #92  <Method BeanDescription BeanSerializerBuilder.getBeanDescription()>
	//   50   89:aconst_null     
	//   51   90:invokevirtual   #98  <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   52   93:astore_2        
		if(beanserializerbuilder != null)
	//*  53   94:aload_2         
	//*  54   95:ifnonnull       101
	//*  55   98:goto            106
			javatype = ((JavaType) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (beanserializerbuilder)).getShape()));
	//   56  101:aload_2         
	//   57  102:invokevirtual   #104 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   58  105:astore_1        
		_serializationShape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (javatype));
	//   59  106:aload_0         
	//   60  107:aload_1         
	//   61  108:putfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   62  111:return          
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter)
	{
		this(beanserializerbase, objectidwriter, beanserializerbase._propertyFilterId);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getfield        #66  <Field Object _propertyFilterId>
	//    5    7:invokespecial   #108 <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter, Object)>
	//    6   10:return          
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter, Object obj)
	{
		super(beanserializerbase._handledType);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #112 <Field Class _handledType>
	//    3    5:invokespecial   #115 <Method void StdSerializer(Class)>
		_beanType = beanserializerbase._beanType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #56  <Field JavaType _beanType>
	//    7   13:putfield        #56  <Field JavaType _beanType>
		_props = beanserializerbase._props;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #58  <Field BeanPropertyWriter[] _props>
	//   11   21:putfield        #58  <Field BeanPropertyWriter[] _props>
		_filteredProps = beanserializerbase._filteredProps;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//   15   29:putfield        #60  <Field BeanPropertyWriter[] _filteredProps>
		_typeId = beanserializerbase._typeId;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #62  <Field AnnotatedMember _typeId>
	//   19   37:putfield        #62  <Field AnnotatedMember _typeId>
		_anyGetterWriter = beanserializerbase._anyGetterWriter;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//   23   45:putfield        #64  <Field AnyGetterWriter _anyGetterWriter>
		_objectIdWriter = objectidwriter;
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:putfield        #68  <Field ObjectIdWriter _objectIdWriter>
		_propertyFilterId = obj;
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:putfield        #66  <Field Object _propertyFilterId>
		_serializationShape = beanserializerbase._serializationShape;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   33   63:putfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   34   66:return          
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase, NameTransformer nametransformer)
	{
		this(beanserializerbase, rename(beanserializerbase._props, nametransformer), rename(beanserializerbase._filteredProps, nametransformer));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #58  <Field BeanPropertyWriter[] _props>
	//    4    6:aload_2         
	//    5    7:invokestatic    #120 <Method BeanPropertyWriter[] rename(BeanPropertyWriter[], NameTransformer)>
	//    6   10:aload_1         
	//    7   11:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//    8   14:aload_2         
	//    9   15:invokestatic    #120 <Method BeanPropertyWriter[] rename(BeanPropertyWriter[], NameTransformer)>
	//   10   18:invokespecial   #123 <Method void BeanSerializerBase(BeanSerializerBase, BeanPropertyWriter[], BeanPropertyWriter[])>
	//   11   21:return          
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase, Set set)
	{
		super(beanserializerbase._handledType);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #112 <Field Class _handledType>
	//    3    5:invokespecial   #115 <Method void StdSerializer(Class)>
		_beanType = beanserializerbase._beanType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #56  <Field JavaType _beanType>
	//    7   13:putfield        #56  <Field JavaType _beanType>
		BeanPropertyWriter abeanpropertywriter[] = beanserializerbase._props;
	//    8   16:aload_1         
	//    9   17:getfield        #58  <Field BeanPropertyWriter[] _props>
	//   10   20:astore          7
		BeanPropertyWriter abeanpropertywriter1[] = beanserializerbase._filteredProps;
	//   11   22:aload_1         
	//   12   23:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//   13   26:astore          8
		int j = abeanpropertywriter.length;
	//   14   28:aload           7
	//   15   30:arraylength     
	//   16   31:istore          4
		ArrayList arraylist1 = new ArrayList(j);
	//   17   33:new             #126 <Class ArrayList>
	//   18   36:dup             
	//   19   37:iload           4
	//   20   39:invokespecial   #129 <Method void ArrayList(int)>
	//   21   42:astore          9
		Object obj = null;
	//   22   44:aconst_null     
	//   23   45:astore          6
		ArrayList arraylist;
		if(abeanpropertywriter1 == null)
	//*  24   47:aload           8
	//*  25   49:ifnonnull       58
			arraylist = null;
	//   26   52:aconst_null     
	//   27   53:astore          5
		else
	//*  28   55:goto            69
			arraylist = new ArrayList(j);
	//   29   58:new             #126 <Class ArrayList>
	//   30   61:dup             
	//   31   62:iload           4
	//   32   64:invokespecial   #129 <Method void ArrayList(int)>
	//   33   67:astore          5
		for(int i = 0; i < j; i++)
	//*  34   69:iconst_0        
	//*  35   70:istore_3        
	//*  36   71:iload_3         
	//*  37   72:iload           4
	//*  38   74:icmpge          134
		{
			BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
	//   39   77:aload           7
	//   40   79:iload_3         
	//   41   80:aaload          
	//   42   81:astore          10
			if(set != null && set.contains(((Object) (beanpropertywriter.getName()))))
	//*  43   83:aload_2         
	//*  44   84:ifnull          104
	//*  45   87:aload_2         
	//*  46   88:aload           10
	//*  47   90:invokevirtual   #133 <Method String BeanPropertyWriter.getName()>
	//*  48   93:invokeinterface #139 <Method boolean Set.contains(Object)>
	//*  49   98:ifeq            104
				continue;
	//   50  101:goto            127
			arraylist1.add(((Object) (beanpropertywriter)));
	//   51  104:aload           9
	//   52  106:aload           10
	//   53  108:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   54  111:pop             
			if(abeanpropertywriter1 != null)
	//*  55  112:aload           8
	//*  56  114:ifnull          127
				arraylist.add(((Object) (abeanpropertywriter1[i])));
	//   57  117:aload           5
	//   58  119:aload           8
	//   59  121:iload_3         
	//   60  122:aaload          
	//   61  123:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   62  126:pop             
		}

	//   63  127:iload_3         
	//   64  128:iconst_1        
	//   65  129:iadd            
	//   66  130:istore_3        
	//*  67  131:goto            71
		_props = (BeanPropertyWriter[])arraylist1.toArray(((Object []) (new BeanPropertyWriter[arraylist1.size()])));
	//   68  134:aload_0         
	//   69  135:aload           9
	//   70  137:aload           9
	//   71  139:invokevirtual   #146 <Method int ArrayList.size()>
	//   72  142:anewarray       BeanPropertyWriter[]
	//   73  145:invokevirtual   #150 <Method Object[] ArrayList.toArray(Object[])>
	//   74  148:checkcast       #151 <Class BeanPropertyWriter[]>
	//   75  151:putfield        #58  <Field BeanPropertyWriter[] _props>
		if(arraylist == null)
	//*  76  154:aload           5
	//*  77  156:ifnonnull       165
			set = ((Set) (obj));
	//   78  159:aload           6
	//   79  161:astore_2        
		else
	//*  80  162:goto            182
			set = ((Set) ((BeanPropertyWriter[])arraylist.toArray(((Object []) (new BeanPropertyWriter[arraylist.size()])))));
	//   81  165:aload           5
	//   82  167:aload           5
	//   83  169:invokevirtual   #146 <Method int ArrayList.size()>
	//   84  172:anewarray       BeanPropertyWriter[]
	//   85  175:invokevirtual   #150 <Method Object[] ArrayList.toArray(Object[])>
	//   86  178:checkcast       #151 <Class BeanPropertyWriter[]>
	//   87  181:astore_2        
		_filteredProps = ((BeanPropertyWriter []) (set));
	//   88  182:aload_0         
	//   89  183:aload_2         
	//   90  184:putfield        #60  <Field BeanPropertyWriter[] _filteredProps>
		_typeId = beanserializerbase._typeId;
	//   91  187:aload_0         
	//   92  188:aload_1         
	//   93  189:getfield        #62  <Field AnnotatedMember _typeId>
	//   94  192:putfield        #62  <Field AnnotatedMember _typeId>
		_anyGetterWriter = beanserializerbase._anyGetterWriter;
	//   95  195:aload_0         
	//   96  196:aload_1         
	//   97  197:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//   98  200:putfield        #64  <Field AnyGetterWriter _anyGetterWriter>
		_objectIdWriter = beanserializerbase._objectIdWriter;
	//   99  203:aload_0         
	//  100  204:aload_1         
	//  101  205:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//  102  208:putfield        #68  <Field ObjectIdWriter _objectIdWriter>
		_propertyFilterId = beanserializerbase._propertyFilterId;
	//  103  211:aload_0         
	//  104  212:aload_1         
	//  105  213:getfield        #66  <Field Object _propertyFilterId>
	//  106  216:putfield        #66  <Field Object _propertyFilterId>
		_serializationShape = beanserializerbase._serializationShape;
	//  107  219:aload_0         
	//  108  220:aload_1         
	//  109  221:getfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//  110  224:putfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//  111  227:return          
	}

	public BeanSerializerBase(BeanSerializerBase beanserializerbase, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
	{
		super(beanserializerbase._handledType);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #112 <Field Class _handledType>
	//    3    5:invokespecial   #115 <Method void StdSerializer(Class)>
		_beanType = beanserializerbase._beanType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #56  <Field JavaType _beanType>
	//    7   13:putfield        #56  <Field JavaType _beanType>
		_props = abeanpropertywriter;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #58  <Field BeanPropertyWriter[] _props>
		_filteredProps = abeanpropertywriter1;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #60  <Field BeanPropertyWriter[] _filteredProps>
		_typeId = beanserializerbase._typeId;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #62  <Field AnnotatedMember _typeId>
	//   17   31:putfield        #62  <Field AnnotatedMember _typeId>
		_anyGetterWriter = beanserializerbase._anyGetterWriter;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//   21   39:putfield        #64  <Field AnyGetterWriter _anyGetterWriter>
		_objectIdWriter = beanserializerbase._objectIdWriter;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//   25   47:putfield        #68  <Field ObjectIdWriter _objectIdWriter>
		_propertyFilterId = beanserializerbase._propertyFilterId;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #66  <Field Object _propertyFilterId>
	//   29   55:putfield        #66  <Field Object _propertyFilterId>
		_serializationShape = beanserializerbase._serializationShape;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   33   63:putfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   34   66:return          
	}

	private static final BeanPropertyWriter[] rename(BeanPropertyWriter abeanpropertywriter[], NameTransformer nametransformer)
	{
		if(abeanpropertywriter != null && abeanpropertywriter.length != 0 && nametransformer != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          68
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifeq            68
	//*   5    9:aload_1         
	//*   6   10:ifnull          68
		{
			if(nametransformer == NameTransformer.NOP)
	//*   7   13:aload_1         
	//*   8   14:getstatic       #159 <Field NameTransformer NameTransformer.NOP>
	//*   9   17:if_acmpne       22
				return abeanpropertywriter;
	//   10   20:aload_0         
	//   11   21:areturn         
			int j = abeanpropertywriter.length;
	//   12   22:aload_0         
	//   13   23:arraylength     
	//   14   24:istore_3        
			BeanPropertyWriter abeanpropertywriter1[] = new BeanPropertyWriter[j];
	//   15   25:iload_3         
	//   16   26:anewarray       BeanPropertyWriter[]
	//   17   29:astore          4
			for(int i = 0; i < j; i++)
	//*  18   31:iconst_0        
	//*  19   32:istore_2        
	//*  20   33:iload_2         
	//*  21   34:iload_3         
	//*  22   35:icmpge          65
			{
				BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
	//   23   38:aload_0         
	//   24   39:iload_2         
	//   25   40:aaload          
	//   26   41:astore          5
				if(beanpropertywriter != null)
	//*  27   43:aload           5
	//*  28   45:ifnull          58
					abeanpropertywriter1[i] = beanpropertywriter.rename(nametransformer);
	//   29   48:aload           4
	//   30   50:iload_2         
	//   31   51:aload           5
	//   32   53:aload_1         
	//   33   54:invokevirtual   #162 <Method BeanPropertyWriter BeanPropertyWriter.rename(NameTransformer)>
	//   34   57:aastore         
			}

	//   35   58:iload_2         
	//   36   59:iconst_1        
	//   37   60:iadd            
	//   38   61:istore_2        
	//*  39   62:goto            33
			return abeanpropertywriter1;
	//   40   65:aload           4
	//   41   67:areturn         
		} else
		{
			return abeanpropertywriter;
	//   42   68:aload_0         
	//   43   69:areturn         
		}
	}

	protected void _serializeObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer, WritableObjectId writableobjectid)
		throws IOException
	{
		ObjectIdWriter objectidwriter = _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:astore          6
		WritableTypeId writabletypeid = _typeIdDef(typeserializer, obj, JsonToken.START_OBJECT);
	//    3    6:aload_0         
	//    4    7:aload           4
	//    5    9:aload_1         
	//    6   10:getstatic       #172 <Field JsonToken JsonToken.START_OBJECT>
	//    7   13:invokevirtual   #176 <Method WritableTypeId _typeIdDef(TypeSerializer, Object, JsonToken)>
	//    8   16:astore          7
		typeserializer.writeTypePrefix(jsongenerator, writabletypeid);
	//    9   18:aload           4
	//   10   20:aload_2         
	//   11   21:aload           7
	//   12   23:invokevirtual   #182 <Method WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, WritableTypeId)>
	//   13   26:pop             
		writableobjectid.writeAsField(jsongenerator, serializerprovider, objectidwriter);
	//   14   27:aload           5
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:aload           6
	//   18   33:invokevirtual   #188 <Method void WritableObjectId.writeAsField(JsonGenerator, SerializerProvider, ObjectIdWriter)>
		if(_propertyFilterId != null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #66  <Field Object _propertyFilterId>
	//*  21   40:ifnull          53
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:aload_2         
	//   25   46:aload_3         
	//   26   47:invokevirtual   #192 <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
		else
	//*  27   50:goto            60
			serializeFields(obj, jsongenerator, serializerprovider);
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:aload_2         
	//   31   56:aload_3         
	//   32   57:invokevirtual   #195 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   33   60:aload           4
	//   34   62:aload_2         
	//   35   63:aload           7
	//   36   65:invokevirtual   #198 <Method WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, WritableTypeId)>
	//   37   68:pop             
	//   38   69:return          
	}

	protected final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		ObjectIdWriter objectidwriter = _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:astore          5
		WritableObjectId writableobjectid = serializerprovider.findObjectId(obj, objectidwriter.generator);
	//    3    6:aload_3         
	//    4    7:aload_1         
	//    5    8:aload           5
	//    6   10:getfield        #207 <Field ObjectIdGenerator ObjectIdWriter.generator>
	//    7   13:invokevirtual   #213 <Method WritableObjectId SerializerProvider.findObjectId(Object, ObjectIdGenerator)>
	//    8   16:astore          6
		if(writableobjectid.writeAsId(jsongenerator, serializerprovider, objectidwriter))
	//*   9   18:aload           6
	//*  10   20:aload_2         
	//*  11   21:aload_3         
	//*  12   22:aload           5
	//*  13   24:invokevirtual   #217 <Method boolean WritableObjectId.writeAsId(JsonGenerator, SerializerProvider, ObjectIdWriter)>
	//*  14   27:ifeq            31
			return;
	//   15   30:return          
		Object obj1 = writableobjectid.generateId(obj);
	//   16   31:aload           6
	//   17   33:aload_1         
	//   18   34:invokevirtual   #221 <Method Object WritableObjectId.generateId(Object)>
	//   19   37:astore          7
		if(objectidwriter.alwaysAsId)
	//*  20   39:aload           5
	//*  21   41:getfield        #225 <Field boolean ObjectIdWriter.alwaysAsId>
	//*  22   44:ifeq            60
		{
			objectidwriter.serializer.serialize(obj1, jsongenerator, serializerprovider);
	//   23   47:aload           5
	//   24   49:getfield        #229 <Field JsonSerializer ObjectIdWriter.serializer>
	//   25   52:aload           7
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #234 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   29   59:return          
		} else
		{
			_serializeObjectId(obj, jsongenerator, serializerprovider, typeserializer, writableobjectid);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:aload_2         
	//   33   63:aload_3         
	//   34   64:aload           4
	//   35   66:aload           6
	//   36   68:invokevirtual   #236 <Method void _serializeObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer, WritableObjectId)>
			return;
	//   37   71:return          
		}
	}

	protected final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, boolean flag)
		throws IOException
	{
		ObjectIdWriter objectidwriter = _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:astore          5
		WritableObjectId writableobjectid = serializerprovider.findObjectId(obj, objectidwriter.generator);
	//    3    6:aload_3         
	//    4    7:aload_1         
	//    5    8:aload           5
	//    6   10:getfield        #207 <Field ObjectIdGenerator ObjectIdWriter.generator>
	//    7   13:invokevirtual   #213 <Method WritableObjectId SerializerProvider.findObjectId(Object, ObjectIdGenerator)>
	//    8   16:astore          6
		if(writableobjectid.writeAsId(jsongenerator, serializerprovider, objectidwriter))
	//*   9   18:aload           6
	//*  10   20:aload_2         
	//*  11   21:aload_3         
	//*  12   22:aload           5
	//*  13   24:invokevirtual   #217 <Method boolean WritableObjectId.writeAsId(JsonGenerator, SerializerProvider, ObjectIdWriter)>
	//*  14   27:ifeq            31
			return;
	//   15   30:return          
		Object obj1 = writableobjectid.generateId(obj);
	//   16   31:aload           6
	//   17   33:aload_1         
	//   18   34:invokevirtual   #221 <Method Object WritableObjectId.generateId(Object)>
	//   19   37:astore          7
		if(objectidwriter.alwaysAsId)
	//*  20   39:aload           5
	//*  21   41:getfield        #225 <Field boolean ObjectIdWriter.alwaysAsId>
	//*  22   44:ifeq            60
		{
			objectidwriter.serializer.serialize(obj1, jsongenerator, serializerprovider);
	//   23   47:aload           5
	//   24   49:getfield        #229 <Field JsonSerializer ObjectIdWriter.serializer>
	//   25   52:aload           7
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #234 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   29   59:return          
		}
		if(flag)
	//*  30   60:iload           4
	//*  31   62:ifeq            70
			jsongenerator.writeStartObject(obj);
	//   32   65:aload_2         
	//   33   66:aload_1         
	//   34   67:invokevirtual   #243 <Method void JsonGenerator.writeStartObject(Object)>
		writableobjectid.writeAsField(jsongenerator, serializerprovider, objectidwriter);
	//   35   70:aload           6
	//   36   72:aload_2         
	//   37   73:aload_3         
	//   38   74:aload           5
	//   39   76:invokevirtual   #188 <Method void WritableObjectId.writeAsField(JsonGenerator, SerializerProvider, ObjectIdWriter)>
		if(_propertyFilterId != null)
	//*  40   79:aload_0         
	//*  41   80:getfield        #66  <Field Object _propertyFilterId>
	//*  42   83:ifnull          96
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   43   86:aload_0         
	//   44   87:aload_1         
	//   45   88:aload_2         
	//   46   89:aload_3         
	//   47   90:invokevirtual   #192 <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
		else
	//*  48   93:goto            103
			serializeFields(obj, jsongenerator, serializerprovider);
	//   49   96:aload_0         
	//   50   97:aload_1         
	//   51   98:aload_2         
	//   52   99:aload_3         
	//   53  100:invokevirtual   #195 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
		if(flag)
	//*  54  103:iload           4
	//*  55  105:ifeq            112
			jsongenerator.writeEndObject();
	//   56  108:aload_2         
	//   57  109:invokevirtual   #246 <Method void JsonGenerator.writeEndObject()>
	//   58  112:return          
	}

	protected final WritableTypeId _typeIdDef(TypeSerializer typeserializer, Object obj, JsonToken jsontoken)
	{
		Object obj1 = ((Object) (_typeId));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field AnnotatedMember _typeId>
	//    2    4:astore          4
		if(obj1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       18
			return typeserializer.typeId(obj, jsontoken);
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #250 <Method WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    9   17:areturn         
		Object obj2 = ((AnnotatedMember) (obj1)).getValue(obj);
	//   10   18:aload           4
	//   11   20:aload_2         
	//   12   21:invokevirtual   #255 <Method Object AnnotatedMember.getValue(Object)>
	//   13   24:astore          5
		obj1 = obj2;
	//   14   26:aload           5
	//   15   28:astore          4
		if(obj2 == null)
	//*  16   30:aload           5
	//*  17   32:ifnonnull       40
			obj1 = "";
	//   18   35:ldc2            #257 <String "">
	//   19   38:astore          4
		return typeserializer.typeId(obj, jsontoken, obj1);
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:aload           4
	//   24   45:invokevirtual   #260 <Method WritableTypeId TypeSerializer.typeId(Object, JsonToken, Object)>
	//   25   48:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonobjectformatvisitor = jsonformatvisitorwrapper.expectObjectFormat(javatype);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokeinterface #270 <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor JsonFormatVisitorWrapper.expectObjectFormat(JavaType)>
	//    6   12:astore          6
		if(jsonobjectformatvisitor == null)
	//*   7   14:aload           6
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		SerializerProvider serializerprovider = jsonformatvisitorwrapper.getProvider();
	//   10   20:aload_1         
	//   11   21:invokeinterface #274 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   12   26:astore          7
		Object obj = _propertyFilterId;
	//   13   28:aload_0         
	//   14   29:getfield        #66  <Field Object _propertyFilterId>
	//   15   32:astore          8
		int k = 0;
	//   16   34:iconst_0        
	//   17   35:istore          4
		int i = 0;
	//   18   37:iconst_0        
	//   19   38:istore_3        
		javatype = null;
	//   20   39:aconst_null     
	//   21   40:astore_2        
		if(obj != null)
	//*  22   41:aload           8
	//*  23   43:ifnull          98
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (findPropertyFilter(jsonformatvisitorwrapper.getProvider(), _propertyFilterId, ((Object) (null)))));
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokeinterface #274 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   27   53:aload_0         
	//   28   54:getfield        #66  <Field Object _propertyFilterId>
	//   29   57:aconst_null     
	//   30   58:invokevirtual   #278 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   31   61:astore_1        
			for(k = _props.length; i < k; i++)
	//*  32   62:aload_0         
	//*  33   63:getfield        #58  <Field BeanPropertyWriter[] _props>
	//*  34   66:arraylength     
	//*  35   67:istore          4
	//*  36   69:iload_3         
	//*  37   70:iload           4
	//*  38   72:icmpge          176
				((PropertyFilter) (jsonformatvisitorwrapper)).depositSchemaProperty(((com.fasterxml.jackson.databind.ser.PropertyWriter) (_props[i])), jsonobjectformatvisitor, serializerprovider);
	//   39   75:aload_1         
	//   40   76:aload_0         
	//   41   77:getfield        #58  <Field BeanPropertyWriter[] _props>
	//   42   80:iload_3         
	//   43   81:aaload          
	//   44   82:aload           6
	//   45   84:aload           7
	//   46   86:invokeinterface #284 <Method void PropertyFilter.depositSchemaProperty(com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor, SerializerProvider)>

	//   47   91:iload_3         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore_3        
		} else
	//*  51   95:goto            69
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (javatype));
	//   52   98:aload_2         
	//   53   99:astore_1        
			if(_filteredProps != null)
	//*  54  100:aload_0         
	//*  55  101:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//*  56  104:ifnull          123
				if(serializerprovider == null)
	//*  57  107:aload           7
	//*  58  109:ifnonnull       117
					jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (javatype));
	//   59  112:aload_2         
	//   60  113:astore_1        
				else
	//*  61  114:goto            123
					jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (serializerprovider.getActiveView()));
	//   62  117:aload           7
	//   63  119:invokevirtual   #288 <Method Class SerializerProvider.getActiveView()>
	//   64  122:astore_1        
			if(jsonformatvisitorwrapper != null)
	//*  65  123:aload_1         
	//*  66  124:ifnull          135
				jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (_filteredProps));
	//   67  127:aload_0         
	//   68  128:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//   69  131:astore_1        
			else
	//*  70  132:goto            140
				jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (_props));
	//   71  135:aload_0         
	//   72  136:getfield        #58  <Field BeanPropertyWriter[] _props>
	//   73  139:astore_1        
			int l = jsonformatvisitorwrapper.length;
	//   74  140:aload_1         
	//   75  141:arraylength     
	//   76  142:istore          5
			for(int j = k; j < l; j++)
	//*  77  144:iload           4
	//*  78  146:istore_3        
	//*  79  147:iload_3         
	//*  80  148:iload           5
	//*  81  150:icmpge          176
			{
				javatype = ((JavaType) (jsonformatvisitorwrapper[j]));
	//   82  153:aload_1         
	//   83  154:iload_3         
	//   84  155:aaload          
	//   85  156:astore_2        
				if(javatype != null)
	//*  86  157:aload_2         
	//*  87  158:ifnull          169
					((BeanPropertyWriter) (javatype)).depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//   88  161:aload_2         
	//   89  162:aload           6
	//   90  164:aload           7
	//   91  166:invokevirtual   #291 <Method void BeanPropertyWriter.depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor, SerializerProvider)>
			}

	//   92  169:iload_3         
	//   93  170:iconst_1        
	//   94  171:iadd            
	//   95  172:istore_3        
		}
	//*  96  173:goto            147
	//   97  176:return          
	}

	protected abstract BeanSerializerBase asArraySerializer();

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
label0:
		{
			obj3 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #299 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:astore          9
			Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          5
			if(beanproperty != null && obj3 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          32
	//*   7   13:aload           9
	//*   8   15:ifnonnull       21
	//*   9   18:goto            32
				obj2 = ((Object) (beanproperty.getMember()));
	//   10   21:aload_2         
	//   11   22:invokeinterface #304 <Method AnnotatedMember BeanProperty.getMember()>
	//   12   27:astore          8
			else
	//*  13   29:goto            35
				obj2 = null;
	//   14   32:aconst_null     
	//   15   33:astore          8
			SerializationConfig serializationconfig = serializerprovider.getConfig();
	//   16   35:aload_1         
	//   17   36:invokevirtual   #308 <Method SerializationConfig SerializerProvider.getConfig()>
	//   18   39:astore          11
			obj4 = ((Object) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:invokevirtual   #311 <Method Class handledType()>
	//   24   48:invokevirtual   #315 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//   25   51:astore          10
			if(obj4 != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj4)).hasShape())
	//*  26   53:aload           10
	//*  27   55:ifnull          297
	//*  28   58:aload           10
	//*  29   60:invokevirtual   #319 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasShape()>
	//*  30   63:ifeq            297
			{
				com.fasterxml.jackson.annotation.JsonFormat.Shape shape = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj4)).getShape();
	//   31   66:aload           10
	//   32   68:invokevirtual   #104 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   33   71:astore          7
				obj1 = ((Object) (shape));
	//   34   73:aload           7
	//   35   75:astore          6
				if(shape != com.fasterxml.jackson.annotation.JsonFormat.Shape.ANY)
	//*  36   77:aload           7
	//*  37   79:getstatic       #324 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ANY>
	//*  38   82:if_acmpeq       300
				{
					obj1 = ((Object) (shape));
	//   39   85:aload           7
	//   40   87:astore          6
					static class _cls1
					{

						static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];

						static 
						{
							$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
						//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape[] com.fasterxml.jackson.annotation.JsonFormat$Shape.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
							try
							{
								$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
						//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
						//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
						//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.NUMBER>
						//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
						//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.NUMBER_INT>
						//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   20   43:astore_0        
							try
							{
								$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER.ordinal()] = 2;
							}
						//*  21   44:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   22   47:astore_0        
							try
							{
								$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
							}
						//*  23   48:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   24   51:astore_0        
						//*  25   52:return          
						}
					}

					if(shape != _serializationShape)
	//*  41   89:aload           7
	//*  42   91:aload_0         
	//*  43   92:getfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//*  44   95:if_acmpeq       300
						if(_handledType.isEnum())
	//*  45   98:aload_0         
	//*  46   99:getfield        #112 <Field Class _handledType>
	//*  47  102:invokevirtual   #329 <Method boolean Class.isEnum()>
	//*  48  105:ifeq            186
						{
							switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[shape.ordinal()])
	//*  49  108:getstatic       #333 <Field int[] BeanSerializerBase$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  50  111:aload           7
	//*  51  113:invokevirtual   #336 <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  52  116:iaload          
							{
	//*  53  117:tableswitch     1 3: default 144
	//	               1 151
	//	               2 151
	//	               3 151
							default:
								obj1 = ((Object) (shape));
	//   54  144:aload           7
	//   55  146:astore          6
								break;

	//*  56  148:goto            300
							case 1: // '\001'
							case 2: // '\002'
							case 3: // '\003'
								obj = ((Object) (serializationconfig.introspectClassAnnotations(_beanType)));
	//   57  151:aload           11
	//   58  153:aload_0         
	//   59  154:getfield        #56  <Field JavaType _beanType>
	//   60  157:invokevirtual   #342 <Method BeanDescription SerializationConfig.introspectClassAnnotations(JavaType)>
	//   61  160:astore          5
								return serializerprovider.handlePrimaryContextualization(((JsonSerializer) (EnumSerializer.construct(_beanType.getRawClass(), serializerprovider.getConfig(), ((BeanDescription) (obj)), ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj4))))), beanproperty);
	//   62  162:aload_1         
	//   63  163:aload_0         
	//   64  164:getfield        #56  <Field JavaType _beanType>
	//   65  167:invokevirtual   #347 <Method Class JavaType.getRawClass()>
	//   66  170:aload_1         
	//   67  171:invokevirtual   #308 <Method SerializationConfig SerializerProvider.getConfig()>
	//   68  174:aload           5
	//   69  176:aload           10
	//   70  178:invokestatic    #353 <Method EnumSerializer EnumSerializer.construct(Class, SerializationConfig, BeanDescription, com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   71  181:aload_2         
	//   72  182:invokevirtual   #357 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   73  185:areturn         
							}
						} else
						{
							obj1 = ((Object) (shape));
	//   74  186:aload           7
	//   75  188:astore          6
							if(shape == com.fasterxml.jackson.annotation.JsonFormat.Shape.NATURAL)
	//*  76  190:aload           7
	//*  77  192:getstatic       #360 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.NATURAL>
	//*  78  195:if_acmpne       300
								if(_beanType.isMapLikeType() && ((Class) (java/util/Map)).isAssignableFrom(_handledType))
	//*  79  198:aload_0         
	//*  80  199:getfield        #56  <Field JavaType _beanType>
	//*  81  202:invokevirtual   #363 <Method boolean JavaType.isMapLikeType()>
	//*  82  205:ifeq            228
	//*  83  208:ldc2            #365 <Class Map>
	//*  84  211:aload_0         
	//*  85  212:getfield        #112 <Field Class _handledType>
	//*  86  215:invokevirtual   #369 <Method boolean Class.isAssignableFrom(Class)>
	//*  87  218:ifeq            228
								{
									obj1 = ((Object) (shape));
	//   88  221:aload           7
	//   89  223:astore          6
								} else
	//*  90  225:goto            300
								{
									obj1 = ((Object) (shape));
	//   91  228:aload           7
	//   92  230:astore          6
									if(((Class) (java/util/Map$Entry)).isAssignableFrom(_handledType))
	//*  93  232:ldc2            #371 <Class java.util.Map$Entry>
	//*  94  235:aload_0         
	//*  95  236:getfield        #112 <Field Class _handledType>
	//*  96  239:invokevirtual   #369 <Method boolean Class.isAssignableFrom(Class)>
	//*  97  242:ifeq            300
									{
										obj1 = ((Object) (_beanType.findSuperType(java/util/Map$Entry)));
	//   98  245:aload_0         
	//   99  246:getfield        #56  <Field JavaType _beanType>
	//  100  249:ldc2            #371 <Class java.util.Map$Entry>
	//  101  252:invokevirtual   #375 <Method JavaType JavaType.findSuperType(Class)>
	//  102  255:astore          6
										obj = ((Object) (((JavaType) (obj1)).containedTypeOrUnknown(0)));
	//  103  257:aload           6
	//  104  259:iconst_0        
	//  105  260:invokevirtual   #379 <Method JavaType JavaType.containedTypeOrUnknown(int)>
	//  106  263:astore          5
										obj1 = ((Object) (((JavaType) (obj1)).containedTypeOrUnknown(1)));
	//  107  265:aload           6
	//  108  267:iconst_1        
	//  109  268:invokevirtual   #379 <Method JavaType JavaType.containedTypeOrUnknown(int)>
	//  110  271:astore          6
										return serializerprovider.handlePrimaryContextualization(((JsonSerializer) (new MapEntrySerializer(_beanType, ((JavaType) (obj)), ((JavaType) (obj1)), false, ((TypeSerializer) (null)), beanproperty))), beanproperty);
	//  111  273:aload_1         
	//  112  274:new             #381 <Class MapEntrySerializer>
	//  113  277:dup             
	//  114  278:aload_0         
	//  115  279:getfield        #56  <Field JavaType _beanType>
	//  116  282:aload           5
	//  117  284:aload           6
	//  118  286:iconst_0        
	//  119  287:aconst_null     
	//  120  288:aload_2         
	//  121  289:invokespecial   #384 <Method void MapEntrySerializer(JavaType, JavaType, JavaType, boolean, TypeSerializer, BeanProperty)>
	//  122  292:aload_2         
	//  123  293:invokevirtual   #357 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//  124  296:areturn         
									}
								}
						}
				}
			} else
			{
				obj1 = null;
	//  125  297:aconst_null     
	//  126  298:astore          6
			}
			obj4 = ((Object) (_objectIdWriter));
	//  127  300:aload_0         
	//  128  301:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//  129  304:astore          10
			if(obj2 != null)
	//* 130  306:aload           8
	//* 131  308:ifnull          744
			{
				obj = ((Object) (((AnnotationIntrospector) (obj3)).findPropertyIgnorals(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)))));
	//  132  311:aload           9
	//  133  313:aload           8
	//  134  315:invokevirtual   #390 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value AnnotationIntrospector.findPropertyIgnorals(com.fasterxml.jackson.databind.introspect.Annotated)>
	//  135  318:astore          5
				Set set;
				if(obj != null)
	//* 136  320:aload           5
	//* 137  322:ifnull          335
					set = ((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (obj)).findIgnoredForSerialization();
	//  138  325:aload           5
	//  139  327:invokevirtual   #396 <Method Set com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.findIgnoredForSerialization()>
	//  140  330:astore          7
				else
	//* 141  332:goto            338
					set = null;
	//  142  335:aconst_null     
	//  143  336:astore          7
				obj = ((Object) (((AnnotationIntrospector) (obj3)).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)))));
	//  144  338:aload           9
	//  145  340:aload           8
	//  146  342:invokevirtual   #400 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)>
	//  147  345:astore          5
				if(obj == null)
	//* 148  347:aload           5
	//* 149  349:ifnonnull       397
				{
					obj = obj4;
	//  150  352:aload           10
	//  151  354:astore          5
					if(obj4 != null)
	//* 152  356:aload           10
	//* 153  358:ifnull          667
					{
						ObjectIdInfo objectidinfo = ((AnnotationIntrospector) (obj3)).findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), ((ObjectIdInfo) (null)));
	//  154  361:aload           9
	//  155  363:aload           8
	//  156  365:aconst_null     
	//  157  366:invokevirtual   #404 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  158  369:astore          11
						obj = obj4;
	//  159  371:aload           10
	//  160  373:astore          5
						if(objectidinfo != null)
	//* 161  375:aload           11
	//* 162  377:ifnull          667
							obj = ((Object) (_objectIdWriter.withAlwaysAsId(objectidinfo.getAlwaysAsId())));
	//  163  380:aload_0         
	//  164  381:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//  165  384:aload           11
	//  166  386:invokevirtual   #409 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//  167  389:invokevirtual   #413 <Method ObjectIdWriter ObjectIdWriter.withAlwaysAsId(boolean)>
	//  168  392:astore          5
					}
				} else
	//* 169  394:goto            667
				{
					obj = ((Object) (((AnnotationIntrospector) (obj3)).findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), ((ObjectIdInfo) (obj)))));
	//  170  397:aload           9
	//  171  399:aload           8
	//  172  401:aload           5
	//  173  403:invokevirtual   #404 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  174  406:astore          5
					obj4 = ((Object) (((ObjectIdInfo) (obj)).getGeneratorType()));
	//  175  408:aload           5
	//  176  410:invokevirtual   #416 <Method Class ObjectIdInfo.getGeneratorType()>
	//  177  413:astore          10
					Object obj5 = ((Object) (serializerprovider.constructType(((Type) (obj4)))));
	//  178  415:aload_1         
	//  179  416:aload           10
	//  180  418:invokevirtual   #420 <Method JavaType SerializerProvider.constructType(Type)>
	//  181  421:astore          11
					obj5 = ((Object) (serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (obj5)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0]));
	//  182  423:aload_1         
	//  183  424:invokevirtual   #424 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//  184  427:aload           11
	//  185  429:ldc2            #426 <Class ObjectIdGenerator>
	//  186  432:invokevirtual   #432 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//  187  435:iconst_0        
	//  188  436:aaload          
	//  189  437:astore          11
					if(obj4 == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
	//* 190  439:aload           10
	//* 191  441:ldc2            #434 <Class com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator>
	//* 192  444:if_acmpne       638
					{
						obj5 = ((Object) (((ObjectIdInfo) (obj)).getPropertyName().getSimpleName()));
	//  193  447:aload           5
	//  194  449:invokevirtual   #438 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//  195  452:invokevirtual   #441 <Method String PropertyName.getSimpleName()>
	//  196  455:astore          11
						int j = _props.length;
	//  197  457:aload_0         
	//  198  458:getfield        #58  <Field BeanPropertyWriter[] _props>
	//  199  461:arraylength     
	//  200  462:istore          4
						int i = 0;
	//  201  464:iconst_0        
	//  202  465:istore_3        
						do
						{
							if(i == j)
	//* 203  466:iload_3         
	//* 204  467:iload           4
	//* 205  469:icmpne          506
								serializerprovider.reportBadDefinition(_beanType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", new Object[] {
									handledType().getName(), obj5
								}));
	//  206  472:aload_1         
	//  207  473:aload_0         
	//  208  474:getfield        #56  <Field JavaType _beanType>
	//  209  477:ldc2            #443 <String "Invalid Object Id definition for %s: cannot find property with name '%s'">
	//  210  480:iconst_2        
	//  211  481:anewarray       Object[]
	//  212  484:dup             
	//  213  485:iconst_0        
	//  214  486:aload_0         
	//  215  487:invokevirtual   #311 <Method Class handledType()>
	//  216  490:invokevirtual   #446 <Method String Class.getName()>
	//  217  493:aastore         
	//  218  494:dup             
	//  219  495:iconst_1        
	//  220  496:aload           11
	//  221  498:aastore         
	//  222  499:invokestatic    #452 <Method String String.format(String, Object[])>
	//  223  502:invokevirtual   #456 <Method Object SerializerProvider.reportBadDefinition(JavaType, String)>
	//  224  505:pop             
							obj4 = ((Object) (_props[i]));
	//  225  506:aload_0         
	//  226  507:getfield        #58  <Field BeanPropertyWriter[] _props>
	//  227  510:iload_3         
	//  228  511:aaload          
	//  229  512:astore          10
							if(((String) (obj5)).equals(((Object) (((BeanPropertyWriter) (obj4)).getName()))))
	//* 230  514:aload           11
	//* 231  516:aload           10
	//* 232  518:invokevirtual   #133 <Method String BeanPropertyWriter.getName()>
	//* 233  521:invokevirtual   #459 <Method boolean String.equals(Object)>
	//* 234  524:ifeq            631
							{
								if(i > 0)
	//* 235  527:iload_3         
	//* 236  528:ifle            590
								{
									obj5 = ((Object) (_props));
	//  237  531:aload_0         
	//  238  532:getfield        #58  <Field BeanPropertyWriter[] _props>
	//  239  535:astore          11
									System.arraycopy(obj5, 0, obj5, 1, i);
	//  240  537:aload           11
	//  241  539:iconst_0        
	//  242  540:aload           11
	//  243  542:iconst_1        
	//  244  543:iload_3         
	//  245  544:invokestatic    #465 <Method void System.arraycopy(Object, int, Object, int, int)>
									_props[0] = ((BeanPropertyWriter) (obj4));
	//  246  547:aload_0         
	//  247  548:getfield        #58  <Field BeanPropertyWriter[] _props>
	//  248  551:iconst_0        
	//  249  552:aload           10
	//  250  554:aastore         
									obj5 = ((Object) (_filteredProps));
	//  251  555:aload_0         
	//  252  556:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//  253  559:astore          11
									if(obj5 != null)
	//* 254  561:aload           11
	//* 255  563:ifnull          590
									{
										BeanPropertyWriter beanpropertywriter = ((BeanPropertyWriter) (obj5[i]));
	//  256  566:aload           11
	//  257  568:iload_3         
	//  258  569:aaload          
	//  259  570:astore          12
										System.arraycopy(obj5, 0, obj5, 1, i);
	//  260  572:aload           11
	//  261  574:iconst_0        
	//  262  575:aload           11
	//  263  577:iconst_1        
	//  264  578:iload_3         
	//  265  579:invokestatic    #465 <Method void System.arraycopy(Object, int, Object, int, int)>
										_filteredProps[0] = beanpropertywriter;
	//  266  582:aload_0         
	//  267  583:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//  268  586:iconst_0        
	//  269  587:aload           12
	//  270  589:aastore         
									}
								}
								obj5 = ((Object) (((BeanPropertyWriter) (obj4)).getType()));
	//  271  590:aload           10
	//  272  592:invokevirtual   #469 <Method JavaType BeanPropertyWriter.getType()>
	//  273  595:astore          11
								obj4 = ((Object) (new PropertyBasedObjectIdGenerator(((ObjectIdInfo) (obj)), ((BeanPropertyWriter) (obj4)))));
	//  274  597:new             #471 <Class PropertyBasedObjectIdGenerator>
	//  275  600:dup             
	//  276  601:aload           5
	//  277  603:aload           10
	//  278  605:invokespecial   #474 <Method void PropertyBasedObjectIdGenerator(ObjectIdInfo, BeanPropertyWriter)>
	//  279  608:astore          10
								obj = ((Object) (ObjectIdWriter.construct(((JavaType) (obj5)), (PropertyName)null, ((ObjectIdGenerator) (obj4)), ((ObjectIdInfo) (obj)).getAlwaysAsId())));
	//  280  610:aload           11
	//  281  612:aconst_null     
	//  282  613:checkcast       #37  <Class PropertyName>
	//  283  616:aload           10
	//  284  618:aload           5
	//  285  620:invokevirtual   #409 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//  286  623:invokestatic    #477 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//  287  626:astore          5
								break;
	//  288  628:goto            667
							}
							i++;
	//  289  631:iload_3         
	//  290  632:iconst_1        
	//  291  633:iadd            
	//  292  634:istore_3        
						} while(true);
	//  293  635:goto            466
					} else
					{
						obj4 = ((Object) (serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), ((ObjectIdInfo) (obj)))));
	//  294  638:aload_1         
	//  295  639:aload           8
	//  296  641:aload           5
	//  297  643:invokevirtual   #481 <Method ObjectIdGenerator SerializerProvider.objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  298  646:astore          10
						obj = ((Object) (ObjectIdWriter.construct(((JavaType) (obj5)), ((ObjectIdInfo) (obj)).getPropertyName(), ((ObjectIdGenerator) (obj4)), ((ObjectIdInfo) (obj)).getAlwaysAsId())));
	//  299  648:aload           11
	//  300  650:aload           5
	//  301  652:invokevirtual   #438 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//  302  655:aload           10
	//  303  657:aload           5
	//  304  659:invokevirtual   #409 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//  305  662:invokestatic    #477 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//  306  665:astore          5
					}
				}
				Object obj6 = null;
	//  307  667:aconst_null     
	//  308  668:astore          11
				Object obj7 = ((AnnotationIntrospector) (obj3)).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
	//  309  670:aload           9
	//  310  672:aload           8
	//  311  674:invokevirtual   #485 <Method Object AnnotationIntrospector.findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)>
	//  312  677:astore          12
				obj2 = ((Object) (obj6));
	//  313  679:aload           11
	//  314  681:astore          8
				obj4 = obj;
	//  315  683:aload           5
	//  316  685:astore          10
				obj3 = ((Object) (set));
	//  317  687:aload           7
	//  318  689:astore          9
				if(obj7 == null)
					break label0;
	//  319  691:aload           12
	//  320  693:ifnull          751
				Object obj8 = _propertyFilterId;
	//  321  696:aload_0         
	//  322  697:getfield        #66  <Field Object _propertyFilterId>
	//  323  700:astore          13
				if(obj8 != null)
	//* 324  702:aload           13
	//* 325  704:ifnull          729
				{
					obj2 = ((Object) (obj6));
	//  326  707:aload           11
	//  327  709:astore          8
					obj4 = obj;
	//  328  711:aload           5
	//  329  713:astore          10
					obj3 = ((Object) (set));
	//  330  715:aload           7
	//  331  717:astore          9
					if(obj7.equals(obj8))
						break label0;
	//  332  719:aload           12
	//  333  721:aload           13
	//  334  723:invokevirtual   #486 <Method boolean Object.equals(Object)>
	//  335  726:ifne            751
				}
				obj2 = obj7;
	//  336  729:aload           12
	//  337  731:astore          8
				obj4 = obj;
	//  338  733:aload           5
	//  339  735:astore          10
				obj3 = ((Object) (set));
	//  340  737:aload           7
	//  341  739:astore          9
			} else
	//* 342  741:goto            751
			{
				obj3 = null;
	//  343  744:aconst_null     
	//  344  745:astore          9
				obj2 = obj;
	//  345  747:aload           5
	//  346  749:astore          8
			}
		}
label1:
		{
			if(obj4 != null)
	//* 347  751:aload           10
	//* 348  753:ifnull          789
			{
				serializerprovider = ((SerializerProvider) (((ObjectIdWriter) (obj4)).withSerializer(serializerprovider.findValueSerializer(((ObjectIdWriter) (obj4)).idType, beanproperty))));
	//  349  756:aload           10
	//  350  758:aload_1         
	//  351  759:aload           10
	//  352  761:getfield        #489 <Field JavaType ObjectIdWriter.idType>
	//  353  764:aload_2         
	//  354  765:invokevirtual   #493 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//  355  768:invokevirtual   #497 <Method ObjectIdWriter ObjectIdWriter.withSerializer(JsonSerializer)>
	//  356  771:astore_1        
				if(serializerprovider != _objectIdWriter)
	//* 357  772:aload_1         
	//* 358  773:aload_0         
	//* 359  774:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//* 360  777:if_acmpeq       789
				{
					beanproperty = ((BeanProperty) (withObjectIdWriter(((ObjectIdWriter) (serializerprovider)))));
	//  361  780:aload_0         
	//  362  781:aload_1         
	//  363  782:invokevirtual   #501 <Method BeanSerializerBase withObjectIdWriter(ObjectIdWriter)>
	//  364  785:astore_2        
					break label1;
	//  365  786:goto            791
				}
			}
			beanproperty = ((BeanProperty) (this));
	//  366  789:aload_0         
	//  367  790:astore_2        
		}
		serializerprovider = ((SerializerProvider) (beanproperty));
	//  368  791:aload_2         
	//  369  792:astore_1        
		if(obj3 != null)
	//* 370  793:aload           9
	//* 371  795:ifnull          817
		{
			serializerprovider = ((SerializerProvider) (beanproperty));
	//  372  798:aload_2         
	//  373  799:astore_1        
			if(!((Set) (obj3)).isEmpty())
	//* 374  800:aload           9
	//* 375  802:invokeinterface #504 <Method boolean Set.isEmpty()>
	//* 376  807:ifne            817
				serializerprovider = ((SerializerProvider) (((BeanSerializerBase) (beanproperty)).withIgnorals(((Set) (obj3)))));
	//  377  810:aload_2         
	//  378  811:aload           9
	//  379  813:invokevirtual   #508 <Method BeanSerializerBase withIgnorals(Set)>
	//  380  816:astore_1        
		}
		beanproperty = ((BeanProperty) (serializerprovider));
	//  381  817:aload_1         
	//  382  818:astore_2        
		if(obj2 != null)
	//* 383  819:aload           8
	//* 384  821:ifnull          831
			beanproperty = ((BeanProperty) (((BeanSerializerBase) (serializerprovider)).withFilterId(obj2)));
	//  385  824:aload_1         
	//  386  825:aload           8
	//  387  827:invokevirtual   #512 <Method BeanSerializerBase withFilterId(Object)>
	//  388  830:astore_2        
		serializerprovider = ((SerializerProvider) (obj1));
	//  389  831:aload           6
	//  390  833:astore_1        
		if(obj1 == null)
	//* 391  834:aload           6
	//* 392  836:ifnonnull       844
			serializerprovider = ((SerializerProvider) (_serializationShape));
	//  393  839:aload_0         
	//  394  840:getfield        #70  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//  395  843:astore_1        
		if(serializerprovider == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
	//* 396  844:aload_1         
	//* 397  845:getstatic       #515 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
	//* 398  848:if_acmpne       856
			return ((JsonSerializer) (((BeanSerializerBase) (beanproperty)).asArraySerializer()));
	//  399  851:aload_2         
	//  400  852:invokevirtual   #517 <Method BeanSerializerBase asArraySerializer()>
	//  401  855:areturn         
		else
			return ((JsonSerializer) (beanproperty));
	//  402  856:aload_2         
	//  403  857:areturn         
	}

	protected JsonSerializer findConvertingSerializer(SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
		throws JsonMappingException
	{
		Object obj1 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #299 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:astore          4
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		if(obj1 != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          97
		{
			AnnotatedMember annotatedmember = beanpropertywriter.getMember();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #521 <Method AnnotatedMember BeanPropertyWriter.getMember()>
	//    9   17:astore          5
			if(annotatedmember != null)
	//*  10   19:aload           5
	//*  11   21:ifnull          97
			{
				obj1 = ((AnnotationIntrospector) (obj1)).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)));
	//   12   24:aload           4
	//   13   26:aload           5
	//   14   28:invokevirtual   #524 <Method Object AnnotationIntrospector.findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   15   31:astore          4
				if(obj1 != null)
	//*  16   33:aload           4
	//*  17   35:ifnull          97
				{
					obj1 = ((Object) (serializerprovider.converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beanpropertywriter.getMember())), obj1)));
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #521 <Method AnnotatedMember BeanPropertyWriter.getMember()>
	//   21   43:aload           4
	//   22   45:invokevirtual   #528 <Method Converter SerializerProvider.converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   23   48:astore          4
					JavaType javatype = ((Converter) (obj1)).getOutputType(serializerprovider.getTypeFactory());
	//   24   50:aload           4
	//   25   52:aload_1         
	//   26   53:invokevirtual   #424 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//   27   56:invokeinterface #534 <Method JavaType Converter.getOutputType(TypeFactory)>
	//   28   61:astore          5
					if(javatype.isJavaLangObject())
	//*  29   63:aload           5
	//*  30   65:invokevirtual   #537 <Method boolean JavaType.isJavaLangObject()>
	//*  31   68:ifeq            76
						serializerprovider = ((SerializerProvider) (obj));
	//   32   71:aload_3         
	//   33   72:astore_1        
					else
	//*  34   73:goto            84
						serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(javatype, ((BeanProperty) (beanpropertywriter)))));
	//   35   76:aload_1         
	//   36   77:aload           5
	//   37   79:aload_2         
	//   38   80:invokevirtual   #493 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   39   83:astore_1        
					return ((JsonSerializer) (new StdDelegatingSerializer(((Converter) (obj1)), javatype, ((JsonSerializer) (serializerprovider)))));
	//   40   84:new             #539 <Class StdDelegatingSerializer>
	//   41   87:dup             
	//   42   88:aload           4
	//   43   90:aload           5
	//   44   92:aload_1         
	//   45   93:invokespecial   #542 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//   46   96:areturn         
				}
			}
		}
		return null;
	//   47   97:aconst_null     
	//   48   98:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		ObjectNode objectnode = createSchemaNode("object", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #548 <String "object">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #552 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    8:astore          4
		type = ((Type) ((JsonSerializableSchema)_handledType.getAnnotation(com/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema)));
	//    5   10:aload_0         
	//    6   11:getfield        #112 <Field Class _handledType>
	//    7   14:ldc2            #554 <Class JsonSerializableSchema>
	//    8   17:invokevirtual   #558 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    9   20:checkcast       #554 <Class JsonSerializableSchema>
	//   10   23:astore_2        
		if(type != null)
	//*  11   24:aload_2         
	//*  12   25:ifnull          56
		{
			type = ((Type) (((JsonSerializableSchema) (type)).id()));
	//   13   28:aload_2         
	//   14   29:invokeinterface #561 <Method String JsonSerializableSchema.id()>
	//   15   34:astore_2        
			if(type != null && ((String) (type)).length() > 0)
	//*  16   35:aload_2         
	//*  17   36:ifnull          56
	//*  18   39:aload_2         
	//*  19   40:invokevirtual   #564 <Method int String.length()>
	//*  20   43:ifle            56
				objectnode.put("id", ((String) (type)));
	//   21   46:aload           4
	//   22   48:ldc2            #565 <String "id">
	//   23   51:aload_2         
	//   24   52:invokevirtual   #571 <Method ObjectNode ObjectNode.put(String, String)>
	//   25   55:pop             
		}
		ObjectNode objectnode1 = objectnode.objectNode();
	//   26   56:aload           4
	//   27   58:invokevirtual   #575 <Method ObjectNode ObjectNode.objectNode()>
	//   28   61:astore          5
		Object obj = _propertyFilterId;
	//   29   63:aload_0         
	//   30   64:getfield        #66  <Field Object _propertyFilterId>
	//   31   67:astore          6
		type = null;
	//   32   69:aconst_null     
	//   33   70:astore_2        
		if(obj != null)
	//*  34   71:aload           6
	//*  35   73:ifnull          85
			type = ((Type) (findPropertyFilter(serializerprovider, obj, ((Object) (null)))));
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:aload           6
	//   39   80:aconst_null     
	//   40   81:invokevirtual   #278 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   41   84:astore_2        
		int i = 0;
	//   42   85:iconst_0        
	//   43   86:istore_3        
		do
		{
			BeanPropertyWriter abeanpropertywriter[] = _props;
	//   44   87:aload_0         
	//   45   88:getfield        #58  <Field BeanPropertyWriter[] _props>
	//   46   91:astore          6
			if(i < abeanpropertywriter.length)
	//*  47   93:iload_3         
	//*  48   94:aload           6
	//*  49   96:arraylength     
	//*  50   97:icmpge          139
			{
				BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
	//   51  100:aload           6
	//   52  102:iload_3         
	//   53  103:aaload          
	//   54  104:astore          6
				if(type == null)
	//*  55  106:aload_2         
	//*  56  107:ifnonnull       121
					beanpropertywriter.depositSchemaProperty(objectnode1, serializerprovider);
	//   57  110:aload           6
	//   58  112:aload           5
	//   59  114:aload_1         
	//   60  115:invokevirtual   #578 <Method void BeanPropertyWriter.depositSchemaProperty(ObjectNode, SerializerProvider)>
				else
	//*  61  118:goto            132
					((PropertyFilter) (type)).depositSchemaProperty(((com.fasterxml.jackson.databind.ser.PropertyWriter) (beanpropertywriter)), objectnode1, serializerprovider);
	//   62  121:aload_2         
	//   63  122:aload           6
	//   64  124:aload           5
	//   65  126:aload_1         
	//   66  127:invokeinterface #581 <Method void PropertyFilter.depositSchemaProperty(com.fasterxml.jackson.databind.ser.PropertyWriter, ObjectNode, SerializerProvider)>
				i++;
	//   67  132:iload_3         
	//   68  133:iconst_1        
	//   69  134:iadd            
	//   70  135:istore_3        
			} else
	//*  71  136:goto            87
			{
				objectnode.set("properties", ((JsonNode) (objectnode1)));
	//   72  139:aload           4
	//   73  141:ldc2            #583 <String "properties">
	//   74  144:aload           5
	//   75  146:invokevirtual   #587 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   76  149:pop             
				return ((JsonNode) (objectnode));
	//   77  150:aload           4
	//   78  152:areturn         
			}
		} while(true);
	}

	public Iterator properties()
	{
		return Arrays.asList(((Object []) (_props))).iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field BeanPropertyWriter[] _props>
	//    2    4:invokestatic    #595 <Method List Arrays.asList(Object[])>
	//    3    7:invokeinterface #600 <Method Iterator List.iterator()>
	//    4   12:areturn         
	}

	public void resolve(SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		BeanPropertyWriter abeanpropertywriter[] = _filteredProps;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//    2    4:astore          5
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(abeanpropertywriter == null)
	//*   5    8:aload           5
	//*   6   10:ifnonnull       18
			i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		else
	//*   9   15:goto            22
			i = abeanpropertywriter.length;
	//   10   18:aload           5
	//   11   20:arraylength     
	//   12   21:istore_2        
		for(int k = _props.length; j < k; j++)
	//*  13   22:aload_0         
	//*  14   23:getfield        #58  <Field BeanPropertyWriter[] _props>
	//*  15   26:arraylength     
	//*  16   27:istore          4
	//*  17   29:iload_3         
	//*  18   30:iload           4
	//*  19   32:icmpge          299
		{
			Object obj;
			BeanPropertyWriter beanpropertywriter2;
label0:
			{
				beanpropertywriter2 = _props[j];
	//   20   35:aload_0         
	//   21   36:getfield        #58  <Field BeanPropertyWriter[] _props>
	//   22   39:iload_3         
	//   23   40:aaload          
	//   24   41:astore          7
				if(!beanpropertywriter2.willSuppressNulls() && !beanpropertywriter2.hasNullSerializer())
	//*  25   43:aload           7
	//*  26   45:invokevirtual   #606 <Method boolean BeanPropertyWriter.willSuppressNulls()>
	//*  27   48:ifne            104
	//*  28   51:aload           7
	//*  29   53:invokevirtual   #609 <Method boolean BeanPropertyWriter.hasNullSerializer()>
	//*  30   56:ifne            104
				{
					JsonSerializer jsonserializer = serializerprovider.findNullValueSerializer(((BeanProperty) (beanpropertywriter2)));
	//   31   59:aload_1         
	//   32   60:aload           7
	//   33   62:invokevirtual   #613 <Method JsonSerializer SerializerProvider.findNullValueSerializer(BeanProperty)>
	//   34   65:astore          5
					if(jsonserializer != null)
	//*  35   67:aload           5
	//*  36   69:ifnull          104
					{
						beanpropertywriter2.assignNullSerializer(jsonserializer);
	//   37   72:aload           7
	//   38   74:aload           5
	//   39   76:invokevirtual   #617 <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
						if(j < i)
	//*  40   79:iload_3         
	//*  41   80:iload_2         
	//*  42   81:icmpge          104
						{
							BeanPropertyWriter beanpropertywriter = _filteredProps[j];
	//   43   84:aload_0         
	//   44   85:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//   45   88:iload_3         
	//   46   89:aaload          
	//   47   90:astore          6
							if(beanpropertywriter != null)
	//*  48   92:aload           6
	//*  49   94:ifnull          104
								beanpropertywriter.assignNullSerializer(jsonserializer);
	//   50   97:aload           6
	//   51   99:aload           5
	//   52  101:invokevirtual   #617 <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
						}
					}
				}
				if(beanpropertywriter2.hasSerializer())
	//*  53  104:aload           7
	//*  54  106:invokevirtual   #620 <Method boolean BeanPropertyWriter.hasSerializer()>
	//*  55  109:ifeq            115
					continue;
	//   56  112:goto            292
				Object obj1 = ((Object) (findConvertingSerializer(serializerprovider, beanpropertywriter2)));
	//   57  115:aload_0         
	//   58  116:aload_1         
	//   59  117:aload           7
	//   60  119:invokevirtual   #622 <Method JsonSerializer findConvertingSerializer(SerializerProvider, BeanPropertyWriter)>
	//   61  122:astore          6
				obj = obj1;
	//   62  124:aload           6
	//   63  126:astore          5
				if(obj1 != null)
					break label0;
	//   64  128:aload           6
	//   65  130:ifnonnull       257
				obj1 = ((Object) (beanpropertywriter2.getSerializationType()));
	//   66  133:aload           7
	//   67  135:invokevirtual   #625 <Method JavaType BeanPropertyWriter.getSerializationType()>
	//   68  138:astore          6
				obj = obj1;
	//   69  140:aload           6
	//   70  142:astore          5
				if(obj1 == null)
	//*  71  144:aload           6
	//*  72  146:ifnonnull       194
				{
					obj1 = ((Object) (beanpropertywriter2.getType()));
	//   73  149:aload           7
	//   74  151:invokevirtual   #469 <Method JavaType BeanPropertyWriter.getType()>
	//   75  154:astore          6
					obj = obj1;
	//   76  156:aload           6
	//   77  158:astore          5
					if(!((JavaType) (obj1)).isFinal())
	//*  78  160:aload           6
	//*  79  162:invokevirtual   #628 <Method boolean JavaType.isFinal()>
	//*  80  165:ifne            194
					{
						if(((JavaType) (obj1)).isContainerType() || ((JavaType) (obj1)).containedTypeCount() > 0)
	//*  81  168:aload           6
	//*  82  170:invokevirtual   #631 <Method boolean JavaType.isContainerType()>
	//*  83  173:ifne            184
	//*  84  176:aload           6
	//*  85  178:invokevirtual   #634 <Method int JavaType.containedTypeCount()>
	//*  86  181:ifle            292
							beanpropertywriter2.setNonTrivialBaseType(((JavaType) (obj1)));
	//   87  184:aload           7
	//   88  186:aload           6
	//   89  188:invokevirtual   #637 <Method void BeanPropertyWriter.setNonTrivialBaseType(JavaType)>
						continue;
	//   90  191:goto            292
					}
				}
				obj1 = ((Object) (serializerprovider.findValueSerializer(((JavaType) (obj)), ((BeanProperty) (beanpropertywriter2)))));
	//   91  194:aload_1         
	//   92  195:aload           5
	//   93  197:aload           7
	//   94  199:invokevirtual   #493 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   95  202:astore          6
				if(((JavaType) (obj)).isContainerType())
	//*  96  204:aload           5
	//*  97  206:invokevirtual   #631 <Method boolean JavaType.isContainerType()>
	//*  98  209:ifeq            253
				{
					obj = ((Object) ((TypeSerializer)((JavaType) (obj)).getContentType().getTypeHandler()));
	//   99  212:aload           5
	//  100  214:invokevirtual   #640 <Method JavaType JavaType.getContentType()>
	//  101  217:invokevirtual   #643 <Method Object JavaType.getTypeHandler()>
	//  102  220:checkcast       #178 <Class TypeSerializer>
	//  103  223:astore          5
					if(obj != null && (obj1 instanceof ContainerSerializer))
	//* 104  225:aload           5
	//* 105  227:ifnull          253
	//* 106  230:aload           6
	//* 107  232:instanceof      #645 <Class ContainerSerializer>
	//* 108  235:ifeq            253
					{
						obj = ((Object) (((ContainerSerializer)obj1).withValueTypeSerializer(((TypeSerializer) (obj)))));
	//  109  238:aload           6
	//  110  240:checkcast       #645 <Class ContainerSerializer>
	//  111  243:aload           5
	//  112  245:invokevirtual   #649 <Method ContainerSerializer ContainerSerializer.withValueTypeSerializer(TypeSerializer)>
	//  113  248:astore          5
						break label0;
	//  114  250:goto            257
					}
				}
				obj = obj1;
	//  115  253:aload           6
	//  116  255:astore          5
			}
			if(j < i)
	//* 117  257:iload_3         
	//* 118  258:iload_2         
	//* 119  259:icmpge          285
			{
				BeanPropertyWriter beanpropertywriter1 = _filteredProps[j];
	//  120  262:aload_0         
	//  121  263:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//  122  266:iload_3         
	//  123  267:aaload          
	//  124  268:astore          6
				if(beanpropertywriter1 != null)
	//* 125  270:aload           6
	//* 126  272:ifnull          285
				{
					beanpropertywriter1.assignSerializer(((JsonSerializer) (obj)));
	//  127  275:aload           6
	//  128  277:aload           5
	//  129  279:invokevirtual   #652 <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
					continue;
	//  130  282:goto            292
				}
			}
			beanpropertywriter2.assignSerializer(((JsonSerializer) (obj)));
	//  131  285:aload           7
	//  132  287:aload           5
	//  133  289:invokevirtual   #652 <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
		}

	//  134  292:iload_3         
	//  135  293:iconst_1        
	//  136  294:iadd            
	//  137  295:istore_3        
	//* 138  296:goto            29
		AnyGetterWriter anygetterwriter = _anyGetterWriter;
	//  139  299:aload_0         
	//  140  300:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//  141  303:astore          5
		if(anygetterwriter != null)
	//* 142  305:aload           5
	//* 143  307:ifnull          316
			anygetterwriter.resolve(serializerprovider);
	//  144  310:aload           5
	//  145  312:aload_1         
	//  146  313:invokevirtual   #656 <Method void AnyGetterWriter.resolve(SerializerProvider)>
	//  147  316:return          
	}

	protected void serializeFields(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int j;
		int k;
		BeanPropertyWriter abeanpropertywriter[];
		if(_filteredProps != null && serializerprovider.getActiveView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          23
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #288 <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          23
			abeanpropertywriter = _filteredProps;
	//    6   14:aload_0         
	//    7   15:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//    8   18:astore          8
		else
	//*   9   20:goto            29
			abeanpropertywriter = _props;
	//   10   23:aload_0         
	//   11   24:getfield        #58  <Field BeanPropertyWriter[] _props>
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
		BeanPropertyWriter beanpropertywriter;
		if(i >= l)
			break MISSING_BLOCK_LABEL_81;
	//   22   43:iload           4
	//   23   45:iload           7
	//   24   47:icmpge          81
		beanpropertywriter = abeanpropertywriter[i];
	//   25   50:aload           8
	//   26   52:iload           4
	//   27   54:aaload          
	//   28   55:astore          9
		if(beanpropertywriter == null)
			break MISSING_BLOCK_LABEL_204;
	//   29   57:aload           9
	//   30   59:ifnull          204
		j = i;
	//   31   62:iload           4
	//   32   64:istore          5
		k = i;
	//   33   66:iload           4
	//   34   68:istore          6
		beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
	//   35   70:aload           9
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:aload_3         
	//   39   75:invokevirtual   #663 <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
		break MISSING_BLOCK_LABEL_204;
	//   40   78:goto            204
		j = i;
	//   41   81:iload           4
	//   42   83:istore          5
		k = i;
	//   43   85:iload           4
	//   44   87:istore          6
		if(_anyGetterWriter != null)
	//*  45   89:aload_0         
	//*  46   90:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//*  47   93:ifnull          203
		{
			j = i;
	//   48   96:iload           4
	//   49   98:istore          5
			k = i;
	//   50  100:iload           4
	//   51  102:istore          6
			try
			{
				_anyGetterWriter.getAndSerialize(obj, jsongenerator, serializerprovider);
	//   52  104:aload_0         
	//   53  105:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//   54  108:aload_1         
	//   55  109:aload_2         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #666 <Method void AnyGetterWriter.getAndSerialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   58  114:return          
			}
	//*  59  115:astore_3        
	//*  60  116:new             #264 <Class JsonMappingException>
	//*  61  119:dup             
	//*  62  120:aload_2         
	//*  63  121:ldc2            #668 <String "Infinite recursion (StackOverflowError)">
	//*  64  124:aload_3         
	//*  65  125:invokespecial   #671 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//*  66  128:astore_3        
	//*  67  129:iload           5
	//*  68  131:aload           8
	//*  69  133:arraylength     
	//*  70  134:icmpne          144
	//*  71  137:ldc2            #673 <String "[anySetter]">
	//*  72  140:astore_2        
	//*  73  141:goto            153
	//*  74  144:aload           8
	//*  75  146:iload           5
	//*  76  148:aaload          
	//*  77  149:invokevirtual   #133 <Method String BeanPropertyWriter.getName()>
	//*  78  152:astore_2        
	//*  79  153:aload_3         
	//*  80  154:new             #675 <Class com.fasterxml.jackson.databind.JsonMappingException$Reference>
	//*  81  157:dup             
	//*  82  158:aload_1         
	//*  83  159:aload_2         
	//*  84  160:invokespecial   #678 <Method void com.fasterxml.jackson.databind.JsonMappingException$Reference(Object, String)>
	//*  85  163:invokevirtual   #682 <Method void JsonMappingException.prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)>
	//*  86  166:aload_3         
	//*  87  167:athrow          
			catch(Exception exception)
	//*  88  168:astore          9
			{
				if(k == abeanpropertywriter.length)
	//*  89  170:iload           6
	//*  90  172:aload           8
	//*  91  174:arraylength     
	//*  92  175:icmpne          185
					jsongenerator = "[anySetter]";
	//   93  178:ldc2            #673 <String "[anySetter]">
	//   94  181:astore_2        
				else
	//*  95  182:goto            194
					jsongenerator = ((JsonGenerator) (abeanpropertywriter[k].getName()));
	//   96  185:aload           8
	//   97  187:iload           6
	//   98  189:aaload          
	//   99  190:invokevirtual   #133 <Method String BeanPropertyWriter.getName()>
	//  100  193:astore_2        
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), obj, ((String) (jsongenerator)));
	//  101  194:aload_0         
	//  102  195:aload_3         
	//  103  196:aload           9
	//  104  198:aload_1         
	//  105  199:aload_2         
	//  106  200:invokevirtual   #686 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
			// Misplaced declaration of an exception variable
			catch(SerializerProvider serializerprovider)
			{
				serializerprovider = ((SerializerProvider) (new JsonMappingException(((java.io.Closeable) (jsongenerator)), "Infinite recursion (StackOverflowError)", ((Throwable) (serializerprovider)))));
				if(j == abeanpropertywriter.length)
					jsongenerator = "[anySetter]";
				else
					jsongenerator = ((JsonGenerator) (abeanpropertywriter[j].getName()));
				((JsonMappingException) (serializerprovider)).prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, ((String) (jsongenerator))));
				throw serializerprovider;
			}
		}
		return;
	//  107  203:return          
		i++;
	//  108  204:iload           4
	//  109  206:iconst_1        
	//  110  207:iadd            
	//  111  208:istore          4
		if(true) goto _L2; else goto _L1
	//  112  210:goto            43
_L1:
	}

	protected void serializeFieldsFiltered(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		int i;
		int j;
		int k;
		BeanPropertyWriter abeanpropertywriter[];
		PropertyFilter propertyfilter;
		if(_filteredProps != null && serializerprovider.getActiveView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          23
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #288 <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          23
			abeanpropertywriter = _filteredProps;
	//    6   14:aload_0         
	//    7   15:getfield        #60  <Field BeanPropertyWriter[] _filteredProps>
	//    8   18:astore          8
		else
	//*   9   20:goto            29
			abeanpropertywriter = _props;
	//   10   23:aload_0         
	//   11   24:getfield        #58  <Field BeanPropertyWriter[] _props>
	//   12   27:astore          8
		propertyfilter = findPropertyFilter(serializerprovider, _propertyFilterId, obj);
	//   13   29:aload_0         
	//   14   30:aload_3         
	//   15   31:aload_0         
	//   16   32:getfield        #66  <Field Object _propertyFilterId>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #278 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   19   39:astore          9
		if(propertyfilter == null)
	//*  20   41:aload           9
	//*  21   43:ifnonnull       54
		{
			serializeFields(obj, jsongenerator, serializerprovider);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:aload_3         
	//   26   50:invokevirtual   #195 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
			return;
	//   27   53:return          
		}
		j = 0;
	//   28   54:iconst_0        
	//   29   55:istore          5
		k = 0;
	//   30   57:iconst_0        
	//   31   58:istore          6
		i = 0;
	//   32   60:iconst_0        
	//   33   61:istore          4
		int l = abeanpropertywriter.length;
	//   34   63:aload           8
	//   35   65:arraylength     
	//   36   66:istore          7
_L2:
		BeanPropertyWriter beanpropertywriter;
		if(i >= l)
			break MISSING_BLOCK_LABEL_110;
	//   37   68:iload           4
	//   38   70:iload           7
	//   39   72:icmpge          110
		beanpropertywriter = abeanpropertywriter[i];
	//   40   75:aload           8
	//   41   77:iload           4
	//   42   79:aaload          
	//   43   80:astore          10
		if(beanpropertywriter == null)
			break MISSING_BLOCK_LABEL_235;
	//   44   82:aload           10
	//   45   84:ifnull          235
		j = i;
	//   46   87:iload           4
	//   47   89:istore          5
		k = i;
	//   48   91:iload           4
	//   49   93:istore          6
		propertyfilter.serializeAsField(obj, jsongenerator, serializerprovider, ((com.fasterxml.jackson.databind.ser.PropertyWriter) (beanpropertywriter)));
	//   50   95:aload           9
	//   51   97:aload_1         
	//   52   98:aload_2         
	//   53   99:aload_3         
	//   54  100:aload           10
	//   55  102:invokeinterface #691 <Method void PropertyFilter.serializeAsField(Object, JsonGenerator, SerializerProvider, com.fasterxml.jackson.databind.ser.PropertyWriter)>
		break MISSING_BLOCK_LABEL_235;
	//   56  107:goto            235
		j = i;
	//   57  110:iload           4
	//   58  112:istore          5
		k = i;
	//   59  114:iload           4
	//   60  116:istore          6
		if(_anyGetterWriter != null)
	//*  61  118:aload_0         
	//*  62  119:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//*  63  122:ifnull          234
		{
			j = i;
	//   64  125:iload           4
	//   65  127:istore          5
			k = i;
	//   66  129:iload           4
	//   67  131:istore          6
			try
			{
				_anyGetterWriter.getAndFilter(obj, jsongenerator, serializerprovider, propertyfilter);
	//   68  133:aload_0         
	//   69  134:getfield        #64  <Field AnyGetterWriter _anyGetterWriter>
	//   70  137:aload_1         
	//   71  138:aload_2         
	//   72  139:aload_3         
	//   73  140:aload           9
	//   74  142:invokevirtual   #695 <Method void AnyGetterWriter.getAndFilter(Object, JsonGenerator, SerializerProvider, PropertyFilter)>
				return;
	//   75  145:return          
			}
	//*  76  146:astore_3        
	//*  77  147:new             #264 <Class JsonMappingException>
	//*  78  150:dup             
	//*  79  151:aload_2         
	//*  80  152:ldc2            #668 <String "Infinite recursion (StackOverflowError)">
	//*  81  155:aload_3         
	//*  82  156:invokespecial   #671 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//*  83  159:astore_3        
	//*  84  160:iload           5
	//*  85  162:aload           8
	//*  86  164:arraylength     
	//*  87  165:icmpne          175
	//*  88  168:ldc2            #673 <String "[anySetter]">
	//*  89  171:astore_2        
	//*  90  172:goto            184
	//*  91  175:aload           8
	//*  92  177:iload           5
	//*  93  179:aaload          
	//*  94  180:invokevirtual   #133 <Method String BeanPropertyWriter.getName()>
	//*  95  183:astore_2        
	//*  96  184:aload_3         
	//*  97  185:new             #675 <Class com.fasterxml.jackson.databind.JsonMappingException$Reference>
	//*  98  188:dup             
	//*  99  189:aload_1         
	//* 100  190:aload_2         
	//* 101  191:invokespecial   #678 <Method void com.fasterxml.jackson.databind.JsonMappingException$Reference(Object, String)>
	//* 102  194:invokevirtual   #682 <Method void JsonMappingException.prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)>
	//* 103  197:aload_3         
	//* 104  198:athrow          
			catch(Exception exception)
	//* 105  199:astore          9
			{
				if(k == abeanpropertywriter.length)
	//* 106  201:iload           6
	//* 107  203:aload           8
	//* 108  205:arraylength     
	//* 109  206:icmpne          216
					jsongenerator = "[anySetter]";
	//  110  209:ldc2            #673 <String "[anySetter]">
	//  111  212:astore_2        
				else
	//* 112  213:goto            225
					jsongenerator = ((JsonGenerator) (abeanpropertywriter[k].getName()));
	//  113  216:aload           8
	//  114  218:iload           6
	//  115  220:aaload          
	//  116  221:invokevirtual   #133 <Method String BeanPropertyWriter.getName()>
	//  117  224:astore_2        
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), obj, ((String) (jsongenerator)));
	//  118  225:aload_0         
	//  119  226:aload_3         
	//  120  227:aload           9
	//  121  229:aload_1         
	//  122  230:aload_2         
	//  123  231:invokevirtual   #686 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
			// Misplaced declaration of an exception variable
			catch(SerializerProvider serializerprovider)
			{
				serializerprovider = ((SerializerProvider) (new JsonMappingException(((java.io.Closeable) (jsongenerator)), "Infinite recursion (StackOverflowError)", ((Throwable) (serializerprovider)))));
				if(j == abeanpropertywriter.length)
					jsongenerator = "[anySetter]";
				else
					jsongenerator = ((JsonGenerator) (abeanpropertywriter[j].getName()));
				((JsonMappingException) (serializerprovider)).prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, ((String) (jsongenerator))));
				throw serializerprovider;
			}
		}
		return;
	//  124  234:return          
		i++;
	//  125  235:iload           4
	//  126  237:iconst_1        
	//  127  238:iadd            
	//  128  239:istore          4
		if(true) goto _L2; else goto _L1
	//  129  241:goto            68
_L1:
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(_objectIdWriter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//*   2    4:ifnull          22
		{
			jsongenerator.setCurrentValue(obj);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #699 <Method void JsonGenerator.setCurrentValue(Object)>
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, typeserializer);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:aload           4
	//   11   18:invokevirtual   #701 <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   12   21:return          
		}
		jsongenerator.setCurrentValue(obj);
	//   13   22:aload_2         
	//   14   23:aload_1         
	//   15   24:invokevirtual   #699 <Method void JsonGenerator.setCurrentValue(Object)>
		WritableTypeId writabletypeid = _typeIdDef(typeserializer, obj, JsonToken.START_OBJECT);
	//   16   27:aload_0         
	//   17   28:aload           4
	//   18   30:aload_1         
	//   19   31:getstatic       #172 <Field JsonToken JsonToken.START_OBJECT>
	//   20   34:invokevirtual   #176 <Method WritableTypeId _typeIdDef(TypeSerializer, Object, JsonToken)>
	//   21   37:astore          5
		typeserializer.writeTypePrefix(jsongenerator, writabletypeid);
	//   22   39:aload           4
	//   23   41:aload_2         
	//   24   42:aload           5
	//   25   44:invokevirtual   #182 <Method WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, WritableTypeId)>
	//   26   47:pop             
		if(_propertyFilterId != null)
	//*  27   48:aload_0         
	//*  28   49:getfield        #66  <Field Object _propertyFilterId>
	//*  29   52:ifnull          65
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   30   55:aload_0         
	//   31   56:aload_1         
	//   32   57:aload_2         
	//   33   58:aload_3         
	//   34   59:invokevirtual   #192 <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
		else
	//*  35   62:goto            72
			serializeFields(obj, jsongenerator, serializerprovider);
	//   36   65:aload_0         
	//   37   66:aload_1         
	//   38   67:aload_2         
	//   39   68:aload_3         
	//   40   69:invokevirtual   #195 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   41   72:aload           4
	//   42   74:aload_2         
	//   43   75:aload           5
	//   44   77:invokevirtual   #198 <Method WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, WritableTypeId)>
	//   45   80:pop             
	//   46   81:return          
	}

	public boolean usesObjectId()
	{
		return _objectIdWriter != null;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #512 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public abstract BeanSerializerBase withFilterId(Object obj);

	protected abstract BeanSerializerBase withIgnorals(Set set);

	public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter);

	protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
	protected static final BeanPropertyWriter NO_PROPS[] = new BeanPropertyWriter[0];
	protected final AnyGetterWriter _anyGetterWriter;
	protected final JavaType _beanType;
	protected final BeanPropertyWriter _filteredProps[];
	protected final ObjectIdWriter _objectIdWriter;
	protected final Object _propertyFilterId;
	protected final BeanPropertyWriter _props[];
	protected final com.fasterxml.jackson.annotation.JsonFormat.Shape _serializationShape;
	protected final AnnotatedMember _typeId;

	static 
	{
	//    0    0:new             #37  <Class PropertyName>
	//    1    3:dup             
	//    2    4:ldc1            #39  <String "#object-ref">
	//    3    6:invokespecial   #43  <Method void PropertyName(String)>
	//    4    9:putstatic       #45  <Field PropertyName NAME_FOR_OBJECT_REF>
	//    5   12:iconst_0        
	//    6   13:anewarray       BeanPropertyWriter[]
	//    7   16:putstatic       #49  <Field BeanPropertyWriter[] NO_PROPS>
	//*   8   19:return          
	}
}
