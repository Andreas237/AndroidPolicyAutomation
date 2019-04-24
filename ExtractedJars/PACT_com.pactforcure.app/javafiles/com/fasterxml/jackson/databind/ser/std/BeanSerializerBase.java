// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
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
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, EnumSerializer, StdDelegatingSerializer

public abstract class BeanSerializerBase extends StdSerializer
	implements ContextualSerializer, ResolvableSerializer, JsonFormatVisitable, SchemaAware
{

	protected BeanSerializerBase(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		super(javatype);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #52  <Method void StdSerializer(JavaType)>
		_props = abeanpropertywriter;
	//    5    8:aload_0         
	//    6    9:aload_3         
	//    7   10:putfield        #54  <Field BeanPropertyWriter[] _props>
		_filteredProps = abeanpropertywriter1;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #56  <Field BeanPropertyWriter[] _filteredProps>
		if(beanserializerbuilder == null)
	//*  11   19:aload_2         
	//*  12   20:ifnonnull       49
		{
			_typeId = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #58  <Field AnnotatedMember _typeId>
			_anyGetterWriter = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #60  <Field AnyGetterWriter _anyGetterWriter>
			_propertyFilterId = null;
	//   19   33:aload_0         
	//   20   34:aconst_null     
	//   21   35:putfield        #62  <Field Object _propertyFilterId>
			_objectIdWriter = null;
	//   22   38:aload_0         
	//   23   39:aconst_null     
	//   24   40:putfield        #64  <Field ObjectIdWriter _objectIdWriter>
			_serializationShape = null;
	//   25   43:aload_0         
	//   26   44:aconst_null     
	//   27   45:putfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
			return;
	//   28   48:return          
		}
		_typeId = beanserializerbuilder.getTypeId();
	//   29   49:aload_0         
	//   30   50:aload_2         
	//   31   51:invokevirtual   #72  <Method AnnotatedMember BeanSerializerBuilder.getTypeId()>
	//   32   54:putfield        #58  <Field AnnotatedMember _typeId>
		_anyGetterWriter = beanserializerbuilder.getAnyGetter();
	//   33   57:aload_0         
	//   34   58:aload_2         
	//   35   59:invokevirtual   #76  <Method AnyGetterWriter BeanSerializerBuilder.getAnyGetter()>
	//   36   62:putfield        #60  <Field AnyGetterWriter _anyGetterWriter>
		_propertyFilterId = beanserializerbuilder.getFilterId();
	//   37   65:aload_0         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #80  <Method Object BeanSerializerBuilder.getFilterId()>
	//   40   70:putfield        #62  <Field Object _propertyFilterId>
		_objectIdWriter = beanserializerbuilder.getObjectIdWriter();
	//   41   73:aload_0         
	//   42   74:aload_2         
	//   43   75:invokevirtual   #84  <Method ObjectIdWriter BeanSerializerBuilder.getObjectIdWriter()>
	//   44   78:putfield        #64  <Field ObjectIdWriter _objectIdWriter>
		javatype = ((JavaType) (beanserializerbuilder.getBeanDescription().findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//   45   81:aload_2         
	//   46   82:invokevirtual   #88  <Method BeanDescription BeanSerializerBuilder.getBeanDescription()>
	//   47   85:aconst_null     
	//   48   86:invokevirtual   #94  <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   49   89:astore_1        
		if(javatype == null)
	//*  50   90:aload_1         
	//*  51   91:ifnonnull       103
			javatype = ((JavaType) (obj));
	//   52   94:aload           5
	//   53   96:astore_1        
		else
	//*  54   97:aload_0         
	//*  55   98:aload_1         
	//*  56   99:putfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//*  57  102:return          
			javatype = ((JavaType) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (javatype)).getShape()));
	//   58  103:aload_1         
	//   59  104:invokevirtual   #100 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   60  107:astore_1        
		_serializationShape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (javatype));
	//*  61  108:goto            97
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase)
	{
		this(beanserializerbase, beanserializerbase._props, beanserializerbase._filteredProps);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #54  <Field BeanPropertyWriter[] _props>
	//    4    6:aload_1         
	//    5    7:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//    6   10:invokespecial   #104 <Method void BeanSerializerBase(BeanSerializerBase, BeanPropertyWriter[], BeanPropertyWriter[])>
	//    7   13:return          
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter)
	{
		this(beanserializerbase, objectidwriter, beanserializerbase._propertyFilterId);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getfield        #62  <Field Object _propertyFilterId>
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
		_props = beanserializerbase._props;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #54  <Field BeanPropertyWriter[] _props>
	//    7   13:putfield        #54  <Field BeanPropertyWriter[] _props>
		_filteredProps = beanserializerbase._filteredProps;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//   11   21:putfield        #56  <Field BeanPropertyWriter[] _filteredProps>
		_typeId = beanserializerbase._typeId;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #58  <Field AnnotatedMember _typeId>
	//   15   29:putfield        #58  <Field AnnotatedMember _typeId>
		_anyGetterWriter = beanserializerbase._anyGetterWriter;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//   19   37:putfield        #60  <Field AnyGetterWriter _anyGetterWriter>
		_objectIdWriter = objectidwriter;
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:putfield        #64  <Field ObjectIdWriter _objectIdWriter>
		_propertyFilterId = obj;
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:putfield        #62  <Field Object _propertyFilterId>
		_serializationShape = beanserializerbase._serializationShape;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   29   55:putfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   30   58:return          
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase, NameTransformer nametransformer)
	{
		this(beanserializerbase, rename(beanserializerbase._props, nametransformer), rename(beanserializerbase._filteredProps, nametransformer));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #54  <Field BeanPropertyWriter[] _props>
	//    4    6:aload_2         
	//    5    7:invokestatic    #120 <Method BeanPropertyWriter[] rename(BeanPropertyWriter[], NameTransformer)>
	//    6   10:aload_1         
	//    7   11:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//    8   14:aload_2         
	//    9   15:invokestatic    #120 <Method BeanPropertyWriter[] rename(BeanPropertyWriter[], NameTransformer)>
	//   10   18:invokespecial   #104 <Method void BeanSerializerBase(BeanSerializerBase, BeanPropertyWriter[], BeanPropertyWriter[])>
	//   11   21:return          
	}

	public BeanSerializerBase(BeanSerializerBase beanserializerbase, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
	{
		super(beanserializerbase._handledType);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #112 <Field Class _handledType>
	//    3    5:invokespecial   #115 <Method void StdSerializer(Class)>
		_props = abeanpropertywriter;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #54  <Field BeanPropertyWriter[] _props>
		_filteredProps = abeanpropertywriter1;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #56  <Field BeanPropertyWriter[] _filteredProps>
		_typeId = beanserializerbase._typeId;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #58  <Field AnnotatedMember _typeId>
	//   13   23:putfield        #58  <Field AnnotatedMember _typeId>
		_anyGetterWriter = beanserializerbase._anyGetterWriter;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//   17   31:putfield        #60  <Field AnyGetterWriter _anyGetterWriter>
		_objectIdWriter = beanserializerbase._objectIdWriter;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//   21   39:putfield        #64  <Field ObjectIdWriter _objectIdWriter>
		_propertyFilterId = beanserializerbase._propertyFilterId;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #62  <Field Object _propertyFilterId>
	//   25   47:putfield        #62  <Field Object _propertyFilterId>
		_serializationShape = beanserializerbase._serializationShape;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   29   55:putfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//   30   58:return          
	}

	protected BeanSerializerBase(BeanSerializerBase beanserializerbase, String as[])
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		super(beanserializerbase._handledType);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:getfield        #112 <Field Class _handledType>
	//    5    8:invokespecial   #115 <Method void StdSerializer(Class)>
		HashSet hashset = ArrayBuilders.arrayToSet(((Object []) (as)));
	//    6   11:aload_2         
	//    7   12:invokestatic    #127 <Method HashSet ArrayBuilders.arrayToSet(Object[])>
	//    8   15:astore          6
		BeanPropertyWriter abeanpropertywriter[] = beanserializerbase._props;
	//    9   17:aload_1         
	//   10   18:getfield        #54  <Field BeanPropertyWriter[] _props>
	//   11   21:astore          7
		BeanPropertyWriter abeanpropertywriter1[] = beanserializerbase._filteredProps;
	//   12   23:aload_1         
	//   13   24:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//   14   27:astore          8
		int j = abeanpropertywriter.length;
	//   15   29:aload           7
	//   16   31:arraylength     
	//   17   32:istore          4
		ArrayList arraylist = new ArrayList(j);
	//   18   34:new             #129 <Class ArrayList>
	//   19   37:dup             
	//   20   38:iload           4
	//   21   40:invokespecial   #132 <Method void ArrayList(int)>
	//   22   43:astore          9
		int i;
		if(abeanpropertywriter1 == null)
	//*  23   45:aload           8
	//*  24   47:ifnonnull       86
			as = null;
	//   25   50:aconst_null     
	//   26   51:astore_2        
		else
	//*  27   52:iconst_0        
	//*  28   53:istore_3        
	//*  29   54:iload_3         
	//*  30   55:iload           4
	//*  31   57:icmpge          124
	//*  32   60:aload           7
	//*  33   62:iload_3         
	//*  34   63:aaload          
	//*  35   64:astore          10
	//*  36   66:aload           6
	//*  37   68:aload           10
	//*  38   70:invokevirtual   #136 <Method String BeanPropertyWriter.getName()>
	//*  39   73:invokevirtual   #142 <Method boolean HashSet.contains(Object)>
	//*  40   76:ifeq            99
	//*  41   79:iload_3         
	//*  42   80:iconst_1        
	//*  43   81:iadd            
	//*  44   82:istore_3        
	//*  45   83:goto            54
			as = ((String []) (new ArrayList(j)));
	//   46   86:new             #129 <Class ArrayList>
	//   47   89:dup             
	//   48   90:iload           4
	//   49   92:invokespecial   #132 <Method void ArrayList(int)>
	//   50   95:astore_2        
		i = 0;
		while(i < j) 
		{
			BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
			if(!hashset.contains(((Object) (beanpropertywriter.getName()))))
	//*  51   96:goto            52
			{
				arraylist.add(((Object) (beanpropertywriter)));
	//   52   99:aload           9
	//   53  101:aload           10
	//   54  103:invokevirtual   #145 <Method boolean ArrayList.add(Object)>
	//   55  106:pop             
				if(abeanpropertywriter1 != null)
	//*  56  107:aload           8
	//*  57  109:ifnull          79
					((ArrayList) (as)).add(((Object) (abeanpropertywriter1[i])));
	//   58  112:aload_2         
	//   59  113:aload           8
	//   60  115:iload_3         
	//   61  116:aaload          
	//   62  117:invokevirtual   #145 <Method boolean ArrayList.add(Object)>
	//   63  120:pop             
			}
			i++;
		}
	//*  64  121:goto            79
		_props = (BeanPropertyWriter[])arraylist.toArray(((Object []) (new BeanPropertyWriter[arraylist.size()])));
	//   65  124:aload_0         
	//   66  125:aload           9
	//   67  127:aload           9
	//   68  129:invokevirtual   #149 <Method int ArrayList.size()>
	//   69  132:anewarray       BeanPropertyWriter[]
	//   70  135:invokevirtual   #153 <Method Object[] ArrayList.toArray(Object[])>
	//   71  138:checkcast       #154 <Class BeanPropertyWriter[]>
	//   72  141:putfield        #54  <Field BeanPropertyWriter[] _props>
		if(as == null)
	//*  73  144:aload_2         
	//*  74  145:ifnonnull       197
			as = ((String []) (obj));
	//   75  148:aload           5
	//   76  150:astore_2        
		else
	//*  77  151:aload_0         
	//*  78  152:aload_2         
	//*  79  153:putfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//*  80  156:aload_0         
	//*  81  157:aload_1         
	//*  82  158:getfield        #58  <Field AnnotatedMember _typeId>
	//*  83  161:putfield        #58  <Field AnnotatedMember _typeId>
	//*  84  164:aload_0         
	//*  85  165:aload_1         
	//*  86  166:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//*  87  169:putfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//*  88  172:aload_0         
	//*  89  173:aload_1         
	//*  90  174:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//*  91  177:putfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//*  92  180:aload_0         
	//*  93  181:aload_1         
	//*  94  182:getfield        #62  <Field Object _propertyFilterId>
	//*  95  185:putfield        #62  <Field Object _propertyFilterId>
	//*  96  188:aload_0         
	//*  97  189:aload_1         
	//*  98  190:getfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//*  99  193:putfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//* 100  196:return          
			as = ((String []) ((BeanPropertyWriter[])((ArrayList) (as)).toArray(((Object []) (new BeanPropertyWriter[((ArrayList) (as)).size()])))));
	//  101  197:aload_2         
	//  102  198:aload_2         
	//  103  199:invokevirtual   #149 <Method int ArrayList.size()>
	//  104  202:anewarray       BeanPropertyWriter[]
	//  105  205:invokevirtual   #153 <Method Object[] ArrayList.toArray(Object[])>
	//  106  208:checkcast       #154 <Class BeanPropertyWriter[]>
	//  107  211:astore_2        
		_filteredProps = ((BeanPropertyWriter []) (as));
		_typeId = beanserializerbase._typeId;
		_anyGetterWriter = beanserializerbase._anyGetterWriter;
		_objectIdWriter = beanserializerbase._objectIdWriter;
		_propertyFilterId = beanserializerbase._propertyFilterId;
		_serializationShape = beanserializerbase._serializationShape;
	//* 108  212:goto            151
	}

	private static final BeanPropertyWriter[] rename(BeanPropertyWriter abeanpropertywriter[], NameTransformer nametransformer)
	{
		if(abeanpropertywriter != null && abeanpropertywriter.length != 0 && nametransformer != null && nametransformer != NameTransformer.NOP) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          20
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:ifeq            20
	//    5    9:aload_1         
	//    6   10:ifnull          20
	//    7   13:aload_1         
	//    8   14:getstatic       #160 <Field NameTransformer NameTransformer.NOP>
	//    9   17:if_acmpne       26
_L1:
		BeanPropertyWriter abeanpropertywriter1[] = abeanpropertywriter;
	//   10   20:aload_0         
	//   11   21:astore          4
_L4:
		return abeanpropertywriter1;
	//   12   23:aload           4
	//   13   25:areturn         
_L2:
		int j = abeanpropertywriter.length;
	//   14   26:aload_0         
	//   15   27:arraylength     
	//   16   28:istore_3        
		BeanPropertyWriter abeanpropertywriter2[] = new BeanPropertyWriter[j];
	//   17   29:iload_3         
	//   18   30:anewarray       BeanPropertyWriter[]
	//   19   33:astore          5
		int i = 0;
	//   20   35:iconst_0        
	//   21   36:istore_2        
		do
		{
			abeanpropertywriter1 = abeanpropertywriter2;
	//   22   37:aload           5
	//   23   39:astore          4
			if(i >= j)
				continue;
	//   24   41:iload_2         
	//   25   42:iload_3         
	//   26   43:icmpge          23
			BeanPropertyWriter beanpropertywriter = abeanpropertywriter[i];
	//   27   46:aload_0         
	//   28   47:iload_2         
	//   29   48:aaload          
	//   30   49:astore          4
			if(beanpropertywriter != null)
	//*  31   51:aload           4
	//*  32   53:ifnull          66
				abeanpropertywriter2[i] = beanpropertywriter.rename(nametransformer);
	//   33   56:aload           5
	//   34   58:iload_2         
	//   35   59:aload           4
	//   36   61:aload_1         
	//   37   62:invokevirtual   #163 <Method BeanPropertyWriter BeanPropertyWriter.rename(NameTransformer)>
	//   38   65:aastore         
			i++;
	//   39   66:iload_2         
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:istore_2        
		} while(true);
	//   43   70:goto            37
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected final String _customTypeId(Object obj)
	{
		obj = _typeId.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field AnnotatedMember _typeId>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore_1        
		if(obj == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       16
			return "";
	//    7   13:ldc1            #173 <String "">
	//    8   15:areturn         
		if(obj instanceof String)
	//*   9   16:aload_1         
	//*  10   17:instanceof      #175 <Class String>
	//*  11   20:ifeq            28
			return (String)obj;
	//   12   23:aload_1         
	//   13   24:checkcast       #175 <Class String>
	//   14   27:areturn         
		else
			return obj.toString();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #180 <Method String Object.toString()>
	//   17   32:areturn         
	}

	protected void _serializeObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer, WritableObjectId writableobjectid)
		throws IOException
	{
		ObjectIdWriter objectidwriter = _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:astore          7
		String s;
		if(_typeId == null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #58  <Field AnnotatedMember _typeId>
	//*   5   10:ifnonnull       64
			s = null;
	//    6   13:aconst_null     
	//    7   14:astore          6
		else
	//*   8   16:aload           6
	//*   9   18:ifnonnull       74
	//*  10   21:aload           4
	//*  11   23:aload_1         
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #190 <Method void TypeSerializer.writeTypePrefixForObject(Object, JsonGenerator)>
	//*  14   28:aload           5
	//*  15   30:aload_2         
	//*  16   31:aload_3         
	//*  17   32:aload           7
	//*  18   34:invokevirtual   #196 <Method void WritableObjectId.writeAsField(JsonGenerator, SerializerProvider, ObjectIdWriter)>
	//*  19   37:aload_0         
	//*  20   38:getfield        #62  <Field Object _propertyFilterId>
	//*  21   41:ifnull          86
	//*  22   44:aload_0         
	//*  23   45:aload_1         
	//*  24   46:aload_2         
	//*  25   47:aload_3         
	//*  26   48:invokevirtual   #200 <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
	//*  27   51:aload           6
	//*  28   53:ifnonnull       96
	//*  29   56:aload           4
	//*  30   58:aload_1         
	//*  31   59:aload_2         
	//*  32   60:invokevirtual   #203 <Method void TypeSerializer.writeTypeSuffixForObject(Object, JsonGenerator)>
	//*  33   63:return          
			s = _customTypeId(obj);
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:invokevirtual   #205 <Method String _customTypeId(Object)>
	//   37   69:astore          6
		if(s == null)
			typeserializer.writeTypePrefixForObject(obj, jsongenerator);
		else
	//*  38   71:goto            16
			typeserializer.writeCustomTypePrefixForObject(obj, jsongenerator, s);
	//   39   74:aload           4
	//   40   76:aload_1         
	//   41   77:aload_2         
	//   42   78:aload           6
	//   43   80:invokevirtual   #209 <Method void TypeSerializer.writeCustomTypePrefixForObject(Object, JsonGenerator, String)>
		writableobjectid.writeAsField(jsongenerator, serializerprovider, objectidwriter);
		if(_propertyFilterId != null)
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
		else
	//*  44   83:goto            28
			serializeFields(obj, jsongenerator, serializerprovider);
	//   45   86:aload_0         
	//   46   87:aload_1         
	//   47   88:aload_2         
	//   48   89:aload_3         
	//   49   90:invokevirtual   #212 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
		if(s == null)
		{
			typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
			return;
		} else
	//*  50   93:goto            51
		{
			typeserializer.writeCustomTypeSuffixForObject(obj, jsongenerator, s);
	//   51   96:aload           4
	//   52   98:aload_1         
	//   53   99:aload_2         
	//   54  100:aload           6
	//   55  102:invokevirtual   #215 <Method void TypeSerializer.writeCustomTypeSuffixForObject(Object, JsonGenerator, String)>
			return;
	//   56  105:return          
		}
	}

	protected final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		ObjectIdWriter objectidwriter = _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:astore          5
		WritableObjectId writableobjectid = serializerprovider.findObjectId(obj, objectidwriter.generator);
	//    3    6:aload_3         
	//    4    7:aload_1         
	//    5    8:aload           5
	//    6   10:getfield        #224 <Field ObjectIdGenerator ObjectIdWriter.generator>
	//    7   13:invokevirtual   #230 <Method WritableObjectId SerializerProvider.findObjectId(Object, ObjectIdGenerator)>
	//    8   16:astore          6
		if(writableobjectid.writeAsId(jsongenerator, serializerprovider, objectidwriter))
	//*   9   18:aload           6
	//*  10   20:aload_2         
	//*  11   21:aload_3         
	//*  12   22:aload           5
	//*  13   24:invokevirtual   #234 <Method boolean WritableObjectId.writeAsId(JsonGenerator, SerializerProvider, ObjectIdWriter)>
	//*  14   27:ifeq            31
			return;
	//   15   30:return          
		Object obj1 = writableobjectid.generateId(obj);
	//   16   31:aload           6
	//   17   33:aload_1         
	//   18   34:invokevirtual   #237 <Method Object WritableObjectId.generateId(Object)>
	//   19   37:astore          7
		if(objectidwriter.alwaysAsId)
	//*  20   39:aload           5
	//*  21   41:getfield        #241 <Field boolean ObjectIdWriter.alwaysAsId>
	//*  22   44:ifeq            60
		{
			objectidwriter.serializer.serialize(obj1, jsongenerator, serializerprovider);
	//   23   47:aload           5
	//   24   49:getfield        #245 <Field JsonSerializer ObjectIdWriter.serializer>
	//   25   52:aload           7
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #250 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
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
	//   36   68:invokevirtual   #252 <Method void _serializeObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer, WritableObjectId)>
			return;
	//   37   71:return          
		}
	}

	protected final void _serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, boolean flag)
		throws IOException
	{
		ObjectIdWriter objectidwriter = _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:astore          5
		WritableObjectId writableobjectid = serializerprovider.findObjectId(obj, objectidwriter.generator);
	//    3    6:aload_3         
	//    4    7:aload_1         
	//    5    8:aload           5
	//    6   10:getfield        #224 <Field ObjectIdGenerator ObjectIdWriter.generator>
	//    7   13:invokevirtual   #230 <Method WritableObjectId SerializerProvider.findObjectId(Object, ObjectIdGenerator)>
	//    8   16:astore          6
		if(!writableobjectid.writeAsId(jsongenerator, serializerprovider, objectidwriter))
	//*   9   18:aload           6
	//*  10   20:aload_2         
	//*  11   21:aload_3         
	//*  12   22:aload           5
	//*  13   24:invokevirtual   #234 <Method boolean WritableObjectId.writeAsId(JsonGenerator, SerializerProvider, ObjectIdWriter)>
	//*  14   27:ifeq            31
	//*  15   30:return          
		{
			Object obj1 = writableobjectid.generateId(obj);
	//   16   31:aload           6
	//   17   33:aload_1         
	//   18   34:invokevirtual   #237 <Method Object WritableObjectId.generateId(Object)>
	//   19   37:astore          7
			if(objectidwriter.alwaysAsId)
	//*  20   39:aload           5
	//*  21   41:getfield        #241 <Field boolean ObjectIdWriter.alwaysAsId>
	//*  22   44:ifeq            60
			{
				objectidwriter.serializer.serialize(obj1, jsongenerator, serializerprovider);
	//   23   47:aload           5
	//   24   49:getfield        #245 <Field JsonSerializer ObjectIdWriter.serializer>
	//   25   52:aload           7
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #250 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   29   59:return          
			}
			if(flag)
	//*  30   60:iload           4
	//*  31   62:ifeq            69
				jsongenerator.writeStartObject();
	//   32   65:aload_2         
	//   33   66:invokevirtual   #258 <Method void JsonGenerator.writeStartObject()>
			writableobjectid.writeAsField(jsongenerator, serializerprovider, objectidwriter);
	//   34   69:aload           6
	//   35   71:aload_2         
	//   36   72:aload_3         
	//   37   73:aload           5
	//   38   75:invokevirtual   #196 <Method void WritableObjectId.writeAsField(JsonGenerator, SerializerProvider, ObjectIdWriter)>
			if(_propertyFilterId != null)
	//*  39   78:aload_0         
	//*  40   79:getfield        #62  <Field Object _propertyFilterId>
	//*  41   82:ifnull          102
				serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   42   85:aload_0         
	//   43   86:aload_1         
	//   44   87:aload_2         
	//   45   88:aload_3         
	//   46   89:invokevirtual   #200 <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
			else
	//*  47   92:iload           4
	//*  48   94:ifeq            30
	//*  49   97:aload_2         
	//*  50   98:invokevirtual   #261 <Method void JsonGenerator.writeEndObject()>
	//*  51  101:return          
				serializeFields(obj, jsongenerator, serializerprovider);
	//   52  102:aload_0         
	//   53  103:aload_1         
	//   54  104:aload_2         
	//   55  105:aload_3         
	//   56  106:invokevirtual   #212 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
			if(flag)
			{
				jsongenerator.writeEndObject();
				return;
			}
		}
	//*  57  109:goto            92
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		if(jsonformatvisitorwrapper != null) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:ifnonnull       8
_L1:
		return;
	//    4    7:return          
	//*   5    8:aload_1         
	//*   6    9:aload_2         
	//*   7   10:invokeinterface #271 <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor JsonFormatVisitorWrapper.expectObjectFormat(JavaType)>
	//*   8   15:astore_2        
_L2:
		SerializerProvider serializerprovider;
		if((javatype = ((JavaType) (jsonformatvisitorwrapper.expectObjectFormat(javatype)))) == null)
			continue; /* Loop/switch isn't completed */
	//    9   16:aload_2         
	//   10   17:ifnull          7
		serializerprovider = jsonformatvisitorwrapper.getProvider();
	//   11   20:aload_1         
	//   12   21:invokeinterface #275 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   13   26:astore          6
		if(_propertyFilterId == null)
			break; /* Loop/switch isn't completed */
	//   14   28:aload_0         
	//   15   29:getfield        #62  <Field Object _propertyFilterId>
	//   16   32:ifnull          88
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (findPropertyFilter(jsonformatvisitorwrapper.getProvider(), _propertyFilterId, ((Object) (null)))));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokeinterface #275 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   20   42:aload_0         
	//   21   43:getfield        #62  <Field Object _propertyFilterId>
	//   22   46:aconst_null     
	//   23   47:invokevirtual   #279 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   24   50:astore_1        
		int i = 0;
	//   25   51:iconst_0        
	//   26   52:istore_3        
		int k = _props.length;
	//   27   53:aload_0         
	//   28   54:getfield        #54  <Field BeanPropertyWriter[] _props>
	//   29   57:arraylength     
	//   30   58:istore          4
		while(i < k) 
	//*  31   60:iload_3         
	//*  32   61:iload           4
	//*  33   63:icmpge          7
		{
			((PropertyFilter) (jsonformatvisitorwrapper)).depositSchemaProperty(((com.fasterxml.jackson.databind.ser.PropertyWriter) (_props[i])), ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor) (javatype)), serializerprovider);
	//   34   66:aload_1         
	//   35   67:aload_0         
	//   36   68:getfield        #54  <Field BeanPropertyWriter[] _props>
	//   37   71:iload_3         
	//   38   72:aaload          
	//   39   73:aload_2         
	//   40   74:aload           6
	//   41   76:invokeinterface #285 <Method void PropertyFilter.depositSchemaProperty(com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor, SerializerProvider)>
			i++;
	//   42   81:iload_3         
	//   43   82:iconst_1        
	//   44   83:iadd            
	//   45   84:istore_3        
		}
		if(true) goto _L1; else goto _L3
	//   46   85:goto            60
_L3:
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (obj));
	//   47   88:aload           5
	//   48   90:astore_1        
		int j;
		int l;
		if(_filteredProps != null)
	//*  49   91:aload_0         
	//*  50   92:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//*  51   95:ifnull          106
			if(serializerprovider == null)
	//*  52   98:aload           6
	//*  53  100:ifnonnull       152
				jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (obj));
	//   54  103:aload           5
	//   55  105:astore_1        
			else
	//*  56  106:aload_1         
	//*  57  107:ifnull          161
	//*  58  110:aload_0         
	//*  59  111:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//*  60  114:astore_1        
	//*  61  115:iconst_0        
	//*  62  116:istore_3        
	//*  63  117:aload_1         
	//*  64  118:arraylength     
	//*  65  119:istore          4
	//*  66  121:iload_3         
	//*  67  122:iload           4
	//*  68  124:icmpge          7
	//*  69  127:aload_1         
	//*  70  128:iload_3         
	//*  71  129:aaload          
	//*  72  130:astore          5
	//*  73  132:aload           5
	//*  74  134:ifnull          145
	//*  75  137:aload           5
	//*  76  139:aload_2         
	//*  77  140:aload           6
	//*  78  142:invokevirtual   #288 <Method void BeanPropertyWriter.depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor, SerializerProvider)>
	//*  79  145:iload_3         
	//*  80  146:iconst_1        
	//*  81  147:iadd            
	//*  82  148:istore_3        
	//*  83  149:goto            121
				jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (serializerprovider.getActiveView()));
	//   84  152:aload           6
	//   85  154:invokevirtual   #292 <Method Class SerializerProvider.getActiveView()>
	//   86  157:astore_1        
		if(jsonformatvisitorwrapper != null)
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (_filteredProps));
		else
	//*  87  158:goto            106
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (_props));
	//   88  161:aload_0         
	//   89  162:getfield        #54  <Field BeanPropertyWriter[] _props>
	//   90  165:astore_1        
		j = 0;
		l = jsonformatvisitorwrapper.length;
		while(j < l) 
		{
			BeanPropertyWriter beanpropertywriter = ((BeanPropertyWriter) (jsonformatvisitorwrapper[j]));
			if(beanpropertywriter != null)
				beanpropertywriter.depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor) (javatype)), serializerprovider);
			j++;
		}
		if(true) goto _L1; else goto _L4
	//   91  166:goto            115
_L4:
	}

	protected abstract BeanSerializerBase asArraySerializer();

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj;
		Object obj1;
		Object obj2;
		String as[];
		AnnotationIntrospector annotationintrospector;
		annotationintrospector = serializerprovider.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #300 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:astore          14
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
			//*  20   43:astore_0        
			//*  21   44:return          
			//*  22   45:astore_0        
			//*  23   46:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   49:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  25   50:goto            20
			}
		}

		com.fasterxml.jackson.annotation.JsonFormat.Shape shape;
		Object obj5;
		ObjectIdWriter objectidwriter;
		Object obj6;
		String as1[];
		if(beanproperty == null || annotationintrospector == null)
	//*   3    6:aload_2         
	//*   4    7:ifnull          15
	//*   5   10:aload           14
	//*   6   12:ifnonnull       410
			obj1 = null;
	//    7   15:aconst_null     
	//    8   16:astore          7
		else
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #304 <Method SerializationConfig SerializerProvider.getConfig()>
	//*  11   22:astore          9
	//*  12   24:aconst_null     
	//*  13   25:astore          5
	//*  14   27:aload           5
	//*  15   29:astore          6
	//*  16   31:aload           7
	//*  17   33:ifnull          128
	//*  18   36:aload           14
	//*  19   38:aload           7
	//*  20   40:invokevirtual   #310 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  21   43:astore          8
	//*  22   45:aload           5
	//*  23   47:astore          6
	//*  24   49:aload           8
	//*  25   51:ifnull          128
	//*  26   54:aload           8
	//*  27   56:invokevirtual   #100 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  28   59:astore          5
	//*  29   61:aload           5
	//*  30   63:astore          6
	//*  31   65:aload           5
	//*  32   67:aload_0         
	//*  33   68:getfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//*  34   71:if_acmpeq       128
	//*  35   74:aload           5
	//*  36   76:astore          6
	//*  37   78:aload_0         
	//*  38   79:getfield        #112 <Field Class _handledType>
	//*  39   82:invokevirtual   #316 <Method boolean Class.isEnum()>
	//*  40   85:ifeq            128
	//*  41   88:getstatic       #320 <Field int[] BeanSerializerBase$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  42   91:aload           5
	//*  43   93:invokevirtual   #325 <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  44   96:iaload          
	//*  45   97:tableswitch     1 3: default 124
	//	               1 421
	//	               2 421
	//	               3 421
	//*  46  124:aload           5
	//*  47  126:astore          6
	//*  48  128:aload_0         
	//*  49  129:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//*  50  132:astore          11
	//*  51  134:aconst_null     
	//*  52  135:astore          9
	//*  53  137:aconst_null     
	//*  54  138:astore          12
	//*  55  140:aload           12
	//*  56  142:astore          8
	//*  57  144:aload           11
	//*  58  146:astore          10
	//*  59  148:aload           7
	//*  60  150:ifnull          291
	//*  61  153:aload           14
	//*  62  155:aload           7
	//*  63  157:iconst_1        
	//*  64  158:invokevirtual   #329 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated, boolean)>
	//*  65  161:astore          13
	//*  66  163:aload           14
	//*  67  165:aload           7
	//*  68  167:invokevirtual   #333 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  69  170:astore          5
	//*  70  172:aload           5
	//*  71  174:ifnonnull       453
	//*  72  177:aload           11
	//*  73  179:astore          5
	//*  74  181:aload           11
	//*  75  183:ifnull          222
	//*  76  186:aload           14
	//*  77  188:aload           7
	//*  78  190:new             #335 <Class ObjectIdInfo>
	//*  79  193:dup             
	//*  80  194:getstatic       #43  <Field PropertyName NAME_FOR_OBJECT_REF>
	//*  81  197:aconst_null     
	//*  82  198:aconst_null     
	//*  83  199:aconst_null     
	//*  84  200:invokespecial   #338 <Method void ObjectIdInfo(PropertyName, Class, Class, Class)>
	//*  85  203:invokevirtual   #342 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//*  86  206:astore          5
	//*  87  208:aload_0         
	//*  88  209:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//*  89  212:aload           5
	//*  90  214:invokevirtual   #345 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//*  91  217:invokevirtual   #349 <Method ObjectIdWriter ObjectIdWriter.withAlwaysAsId(boolean)>
	//*  92  220:astore          5
	//*  93  222:aload           14
	//*  94  224:aload           7
	//*  95  226:invokevirtual   #353 <Method Object AnnotationIntrospector.findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  96  229:astore          7
	//*  97  231:aload           13
	//*  98  233:astore          9
	//*  99  235:aload           12
	//* 100  237:astore          8
	//* 101  239:aload           5
	//* 102  241:astore          10
	//* 103  243:aload           7
	//* 104  245:ifnull          291
	//* 105  248:aload_0         
	//* 106  249:getfield        #62  <Field Object _propertyFilterId>
	//* 107  252:ifnull          279
	//* 108  255:aload           13
	//* 109  257:astore          9
	//* 110  259:aload           12
	//* 111  261:astore          8
	//* 112  263:aload           5
	//* 113  265:astore          10
	//* 114  267:aload           7
	//* 115  269:aload_0         
	//* 116  270:getfield        #62  <Field Object _propertyFilterId>
	//* 117  273:invokevirtual   #356 <Method boolean Object.equals(Object)>
	//* 118  276:ifne            291
	//* 119  279:aload           7
	//* 120  281:astore          8
	//* 121  283:aload           5
	//* 122  285:astore          10
	//* 123  287:aload           13
	//* 124  289:astore          9
	//* 125  291:aload_0         
	//* 126  292:astore          7
	//* 127  294:aload           7
	//* 128  296:astore          5
	//* 129  298:aload           10
	//* 130  300:ifnull          339
	//* 131  303:aload           10
	//* 132  305:aload_1         
	//* 133  306:aload           10
	//* 134  308:getfield        #360 <Field JavaType ObjectIdWriter.idType>
	//* 135  311:aload_2         
	//* 136  312:invokevirtual   #364 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//* 137  315:invokevirtual   #368 <Method ObjectIdWriter ObjectIdWriter.withSerializer(JsonSerializer)>
	//* 138  318:astore_1        
	//* 139  319:aload           7
	//* 140  321:astore          5
	//* 141  323:aload_1         
	//* 142  324:aload_0         
	//* 143  325:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//* 144  328:if_acmpeq       339
	//* 145  331:aload           7
	//* 146  333:aload_1         
	//* 147  334:invokevirtual   #372 <Method BeanSerializerBase withObjectIdWriter(ObjectIdWriter)>
	//* 148  337:astore          5
	//* 149  339:aload           5
	//* 150  341:astore_2        
	//* 151  342:aload           9
	//* 152  344:ifnull          364
	//* 153  347:aload           5
	//* 154  349:astore_2        
	//* 155  350:aload           9
	//* 156  352:arraylength     
	//* 157  353:ifeq            364
	//* 158  356:aload           5
	//* 159  358:aload           9
	//* 160  360:invokevirtual   #376 <Method BeanSerializerBase withIgnorals(String[])>
	//* 161  363:astore_2        
	//* 162  364:aload_2         
	//* 163  365:astore_1        
	//* 164  366:aload           8
	//* 165  368:ifnull          378
	//* 166  371:aload_2         
	//* 167  372:aload           8
	//* 168  374:invokevirtual   #380 <Method BeanSerializerBase withFilterId(Object)>
	//* 169  377:astore_1        
	//* 170  378:aload           6
	//* 171  380:astore_2        
	//* 172  381:aload           6
	//* 173  383:ifnonnull       391
	//* 174  386:aload_0         
	//* 175  387:getfield        #66  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape _serializationShape>
	//* 176  390:astore_2        
	//* 177  391:aload_1         
	//* 178  392:astore          5
	//* 179  394:aload_2         
	//* 180  395:getstatic       #383 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
	//* 181  398:if_acmpne       407
	//* 182  401:aload_1         
	//* 183  402:invokevirtual   #385 <Method BeanSerializerBase asArraySerializer()>
	//* 184  405:astore          5
	//* 185  407:aload           5
	//* 186  409:areturn         
			obj1 = ((Object) (beanproperty.getMember()));
	//  187  410:aload_2         
	//  188  411:invokeinterface #390 <Method AnnotatedMember BeanProperty.getMember()>
	//  189  416:astore          7
		as = ((String []) (serializerprovider.getConfig()));
		obj = null;
		shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
		if(obj1 == null) goto _L2; else goto _L1
_L1:
		obj2 = ((Object) (annotationintrospector.findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)))));
		shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
		if(obj2 == null) goto _L2; else goto _L3
_L3:
		obj = ((Object) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj2)).getShape()));
		shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
		if(obj == _serializationShape) goto _L2; else goto _L4
_L4:
		shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
		if(!_handledType.isEnum()) goto _L2; else goto _L5
_L5:
		_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj)).ordinal()];
		JVM INSTR tableswitch 1 3: default 124
	//	               1 421
	//	               2 421
	//	               3 421;
		   goto _L6 _L7 _L7 _L7
_L6:
		shape = ((com.fasterxml.jackson.annotation.JsonFormat.Shape) (obj));
_L2:
		objectidwriter = _objectIdWriter;
		as = null;
		obj6 = null;
		obj2 = ((Object) (obj6));
		obj5 = ((Object) (objectidwriter));
		if(obj1 == null) goto _L9; else goto _L8
_L8:
		as1 = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), true);
		obj = ((Object) (annotationintrospector.findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)))));
		if(obj != null) goto _L11; else goto _L10
_L10:
		obj = ((Object) (objectidwriter));
		if(objectidwriter != null)
		{
			obj = ((Object) (annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), new ObjectIdInfo(NAME_FOR_OBJECT_REF, ((Class) (null)), ((Class) (null)), ((Class) (null))))));
			obj = ((Object) (_objectIdWriter.withAlwaysAsId(((ObjectIdInfo) (obj)).getAlwaysAsId())));
		}
_L16:
		obj1 = annotationintrospector.findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
		as = as1;
		obj2 = ((Object) (obj6));
		obj5 = obj;
		if(obj1 == null) goto _L9; else goto _L12
_L12:
		if(_propertyFilterId == null) goto _L14; else goto _L13
_L13:
		as = as1;
		obj2 = ((Object) (obj6));
		obj5 = obj;
		if(obj1.equals(_propertyFilterId)) goto _L9; else goto _L14
_L14:
		obj2 = obj1;
		obj5 = obj;
		as = as1;
_L9:
		obj1 = ((Object) (this));
		obj = obj1;
		if(obj5 != null)
		{
			serializerprovider = ((SerializerProvider) (((ObjectIdWriter) (obj5)).withSerializer(serializerprovider.findValueSerializer(((ObjectIdWriter) (obj5)).idType, beanproperty))));
			obj = obj1;
			if(serializerprovider != _objectIdWriter)
				obj = ((Object) (((BeanSerializerBase) (obj1)).withObjectIdWriter(((ObjectIdWriter) (serializerprovider)))));
		}
		beanproperty = ((BeanProperty) (obj));
		if(as != null)
		{
			beanproperty = ((BeanProperty) (obj));
			if(as.length != 0)
				beanproperty = ((BeanProperty) (((BeanSerializerBase) (obj)).withIgnorals(as)));
		}
		serializerprovider = ((SerializerProvider) (beanproperty));
		if(obj2 != null)
			serializerprovider = ((SerializerProvider) (((BeanSerializerBase) (beanproperty)).withFilterId(obj2)));
		beanproperty = ((BeanProperty) (shape));
		if(shape == null)
			beanproperty = ((BeanProperty) (_serializationShape));
		obj = ((Object) (serializerprovider));
		if(beanproperty == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
			obj = ((Object) (((BeanSerializerBase) (serializerprovider)).asArraySerializer()));
		return ((JsonSerializer) (obj));
	//* 190  418:goto            18
_L7:
		obj = ((Object) (((SerializationConfig) (as)).introspectClassAnnotations(_handledType)));
	//  191  421:aload           9
	//  192  423:aload_0         
	//  193  424:getfield        #112 <Field Class _handledType>
	//  194  427:invokevirtual   #396 <Method BeanDescription SerializationConfig.introspectClassAnnotations(Class)>
	//  195  430:astore          5
		return serializerprovider.handlePrimaryContextualization(((JsonSerializer) (EnumSerializer.construct(_handledType, serializerprovider.getConfig(), ((BeanDescription) (obj)), ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj2))))), beanproperty);
	//  196  432:aload_1         
	//  197  433:aload_0         
	//  198  434:getfield        #112 <Field Class _handledType>
	//  199  437:aload_1         
	//  200  438:invokevirtual   #304 <Method SerializationConfig SerializerProvider.getConfig()>
	//  201  441:aload           5
	//  202  443:aload           8
	//  203  445:invokestatic    #402 <Method EnumSerializer EnumSerializer.construct(Class, SerializationConfig, BeanDescription, com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//  204  448:aload_2         
	//  205  449:invokevirtual   #406 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//  206  452:areturn         
_L11:
		obj = ((Object) (annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), ((ObjectIdInfo) (obj)))));
	//  207  453:aload           14
	//  208  455:aload           7
	//  209  457:aload           5
	//  210  459:invokevirtual   #342 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  211  462:astore          5
		Object obj3 = ((Object) (((ObjectIdInfo) (obj)).getGeneratorType()));
	//  212  464:aload           5
	//  213  466:invokevirtual   #409 <Method Class ObjectIdInfo.getGeneratorType()>
	//  214  469:astore          8
		Object obj4 = ((Object) (serializerprovider.constructType(((Type) (obj3)))));
	//  215  471:aload_1         
	//  216  472:aload           8
	//  217  474:invokevirtual   #413 <Method JavaType SerializerProvider.constructType(Type)>
	//  218  477:astore          9
		obj4 = ((Object) (serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (obj4)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0]));
	//  219  479:aload_1         
	//  220  480:invokevirtual   #417 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//  221  483:aload           9
	//  222  485:ldc2            #419 <Class ObjectIdGenerator>
	//  223  488:invokevirtual   #425 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//  224  491:iconst_0        
	//  225  492:aaload          
	//  226  493:astore          9
		if(obj3 == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
	//* 227  495:aload           8
	//* 228  497:ldc2            #427 <Class com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator>
	//* 229  500:if_acmpne       711
		{
			obj4 = ((Object) (((ObjectIdInfo) (obj)).getPropertyName().getSimpleName()));
	//  230  503:aload           5
	//  231  505:invokevirtual   #431 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//  232  508:invokevirtual   #434 <Method String PropertyName.getSimpleName()>
	//  233  511:astore          9
			int i = 0;
	//  234  513:iconst_0        
	//  235  514:istore_3        
			int j = _props.length;
	//  236  515:aload_0         
	//  237  516:getfield        #54  <Field BeanPropertyWriter[] _props>
	//  238  519:arraylength     
	//  239  520:istore          4
			do
			{
				if(i == j)
	//* 240  522:iload_3         
	//* 241  523:iload           4
	//* 242  525:icmpne          579
					throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(_handledType.getName()).append(": can not find property with name '").append(((String) (obj4))).append("'").toString());
	//  243  528:new             #436 <Class IllegalArgumentException>
	//  244  531:dup             
	//  245  532:new             #438 <Class StringBuilder>
	//  246  535:dup             
	//  247  536:invokespecial   #440 <Method void StringBuilder()>
	//  248  539:ldc2            #442 <String "Invalid Object Id definition for ">
	//  249  542:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  250  545:aload_0         
	//  251  546:getfield        #112 <Field Class _handledType>
	//  252  549:invokevirtual   #447 <Method String Class.getName()>
	//  253  552:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  254  555:ldc2            #449 <String ": can not find property with name '">
	//  255  558:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  256  561:aload           9
	//  257  563:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  258  566:ldc2            #451 <String "'">
	//  259  569:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  260  572:invokevirtual   #452 <Method String StringBuilder.toString()>
	//  261  575:invokespecial   #453 <Method void IllegalArgumentException(String)>
	//  262  578:athrow          
				obj3 = ((Object) (_props[i]));
	//  263  579:aload_0         
	//  264  580:getfield        #54  <Field BeanPropertyWriter[] _props>
	//  265  583:iload_3         
	//  266  584:aaload          
	//  267  585:astore          8
				if(((String) (obj4)).equals(((Object) (((BeanPropertyWriter) (obj3)).getName()))))
	//* 268  587:aload           9
	//* 269  589:aload           8
	//* 270  591:invokevirtual   #136 <Method String BeanPropertyWriter.getName()>
	//* 271  594:invokevirtual   #454 <Method boolean String.equals(Object)>
	//* 272  597:ifeq            704
				{
					if(i > 0)
	//* 273  600:iload_3         
	//* 274  601:ifle            663
					{
						System.arraycopy(((Object) (_props)), 0, ((Object) (_props)), 1, i);
	//  275  604:aload_0         
	//  276  605:getfield        #54  <Field BeanPropertyWriter[] _props>
	//  277  608:iconst_0        
	//  278  609:aload_0         
	//  279  610:getfield        #54  <Field BeanPropertyWriter[] _props>
	//  280  613:iconst_1        
	//  281  614:iload_3         
	//  282  615:invokestatic    #460 <Method void System.arraycopy(Object, int, Object, int, int)>
						_props[0] = ((BeanPropertyWriter) (obj3));
	//  283  618:aload_0         
	//  284  619:getfield        #54  <Field BeanPropertyWriter[] _props>
	//  285  622:iconst_0        
	//  286  623:aload           8
	//  287  625:aastore         
						if(_filteredProps != null)
	//* 288  626:aload_0         
	//* 289  627:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//* 290  630:ifnull          663
						{
							obj4 = ((Object) (_filteredProps[i]));
	//  291  633:aload_0         
	//  292  634:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//  293  637:iload_3         
	//  294  638:aaload          
	//  295  639:astore          9
							System.arraycopy(((Object) (_filteredProps)), 0, ((Object) (_filteredProps)), 1, i);
	//  296  641:aload_0         
	//  297  642:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//  298  645:iconst_0        
	//  299  646:aload_0         
	//  300  647:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//  301  650:iconst_1        
	//  302  651:iload_3         
	//  303  652:invokestatic    #460 <Method void System.arraycopy(Object, int, Object, int, int)>
							_filteredProps[0] = ((BeanPropertyWriter) (obj4));
	//  304  655:aload_0         
	//  305  656:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//  306  659:iconst_0        
	//  307  660:aload           9
	//  308  662:aastore         
						}
					}
					obj4 = ((Object) (((BeanPropertyWriter) (obj3)).getType()));
	//  309  663:aload           8
	//  310  665:invokevirtual   #464 <Method JavaType BeanPropertyWriter.getType()>
	//  311  668:astore          9
					obj3 = ((Object) (new PropertyBasedObjectIdGenerator(((ObjectIdInfo) (obj)), ((BeanPropertyWriter) (obj3)))));
	//  312  670:new             #466 <Class PropertyBasedObjectIdGenerator>
	//  313  673:dup             
	//  314  674:aload           5
	//  315  676:aload           8
	//  316  678:invokespecial   #469 <Method void PropertyBasedObjectIdGenerator(ObjectIdInfo, BeanPropertyWriter)>
	//  317  681:astore          8
					obj = ((Object) (ObjectIdWriter.construct(((JavaType) (obj4)), (PropertyName)null, ((ObjectIdGenerator) (obj3)), ((ObjectIdInfo) (obj)).getAlwaysAsId())));
	//  318  683:aload           9
	//  319  685:aconst_null     
	//  320  686:checkcast       #35  <Class PropertyName>
	//  321  689:aload           8
	//  322  691:aload           5
	//  323  693:invokevirtual   #345 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//  324  696:invokestatic    #472 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//  325  699:astore          5
					continue; /* Loop/switch isn't completed */
	//  326  701:goto            222
				}
				i++;
	//  327  704:iload_3         
	//  328  705:iconst_1        
	//  329  706:iadd            
	//  330  707:istore_3        
			} while(true);
	//  331  708:goto            522
		}
		obj3 = ((Object) (serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), ((ObjectIdInfo) (obj)))));
	//  332  711:aload_1         
	//  333  712:aload           7
	//  334  714:aload           5
	//  335  716:invokevirtual   #476 <Method ObjectIdGenerator SerializerProvider.objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  336  719:astore          8
		obj = ((Object) (ObjectIdWriter.construct(((JavaType) (obj4)), ((ObjectIdInfo) (obj)).getPropertyName(), ((ObjectIdGenerator) (obj3)), ((ObjectIdInfo) (obj)).getAlwaysAsId())));
	//  337  721:aload           9
	//  338  723:aload           5
	//  339  725:invokevirtual   #431 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//  340  728:aload           8
	//  341  730:aload           5
	//  342  732:invokevirtual   #345 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//  343  735:invokestatic    #472 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//  344  738:astore          5
		if(true) goto _L16; else goto _L15
	//  345  740:goto            222
_L15:
	}

	protected JsonSerializer findConvertingSerializer(SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
		throws JsonMappingException
	{
		Object obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		Object obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		Object obj3 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #300 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    6   10:astore          6
		Object obj = ((Object) (obj2));
	//    7   12:aload           5
	//    8   14:astore_3        
		if(obj3 != null)
	//*   9   15:aload           6
	//*  10   17:ifnull          97
		{
			AnnotatedMember annotatedmember = beanpropertywriter.getMember();
	//   11   20:aload_2         
	//   12   21:invokevirtual   #481 <Method AnnotatedMember BeanPropertyWriter.getMember()>
	//   13   24:astore          7
			obj = ((Object) (obj2));
	//   14   26:aload           5
	//   15   28:astore_3        
			if(annotatedmember != null)
	//*  16   29:aload           7
	//*  17   31:ifnull          97
			{
				obj3 = ((AnnotationIntrospector) (obj3)).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)));
	//   18   34:aload           6
	//   19   36:aload           7
	//   20   38:invokevirtual   #484 <Method Object AnnotationIntrospector.findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   21   41:astore          6
				obj = ((Object) (obj2));
	//   22   43:aload           5
	//   23   45:astore_3        
				if(obj3 != null)
	//*  24   46:aload           6
	//*  25   48:ifnull          97
				{
					obj = ((Object) (serializerprovider.converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beanpropertywriter.getMember())), obj3)));
	//   26   51:aload_1         
	//   27   52:aload_2         
	//   28   53:invokevirtual   #481 <Method AnnotatedMember BeanPropertyWriter.getMember()>
	//   29   56:aload           6
	//   30   58:invokevirtual   #488 <Method Converter SerializerProvider.converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   31   61:astore_3        
					JavaType javatype = ((Converter) (obj)).getOutputType(serializerprovider.getTypeFactory());
	//   32   62:aload_3         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #417 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//   35   67:invokeinterface #494 <Method JavaType Converter.getOutputType(TypeFactory)>
	//   36   72:astore          5
					if(javatype.isJavaLangObject())
	//*  37   74:aload           5
	//*  38   76:invokevirtual   #499 <Method boolean JavaType.isJavaLangObject()>
	//*  39   79:ifeq            99
						serializerprovider = ((SerializerProvider) (obj1));
	//   40   82:aload           4
	//   41   84:astore_1        
					else
	//*  42   85:new             #501 <Class StdDelegatingSerializer>
	//*  43   88:dup             
	//*  44   89:aload_3         
	//*  45   90:aload           5
	//*  46   92:aload_1         
	//*  47   93:invokespecial   #504 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//*  48   96:astore_3        
	//*  49   97:aload_3         
	//*  50   98:areturn         
						serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(javatype, ((BeanProperty) (beanpropertywriter)))));
	//   51   99:aload_1         
	//   52  100:aload           5
	//   53  102:aload_2         
	//   54  103:invokevirtual   #364 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   55  106:astore_1        
					obj = ((Object) (new StdDelegatingSerializer(((Converter) (obj)), javatype, ((JsonSerializer) (serializerprovider)))));
				}
			}
		}
		return ((JsonSerializer) (obj));
	//*  56  107:goto            85
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		ObjectNode objectnode = createSchemaNode("object", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #510 <String "object">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #514 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    8:astore          4
		type = ((Type) ((JsonSerializableSchema)_handledType.getAnnotation(com/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema)));
	//    5   10:aload_0         
	//    6   11:getfield        #112 <Field Class _handledType>
	//    7   14:ldc2            #516 <Class JsonSerializableSchema>
	//    8   17:invokevirtual   #520 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    9   20:checkcast       #516 <Class JsonSerializableSchema>
	//   10   23:astore_2        
		if(type != null)
	//*  11   24:aload_2         
	//*  12   25:ifnull          56
		{
			type = ((Type) (((JsonSerializableSchema) (type)).id()));
	//   13   28:aload_2         
	//   14   29:invokeinterface #523 <Method String JsonSerializableSchema.id()>
	//   15   34:astore_2        
			if(type != null && ((String) (type)).length() > 0)
	//*  16   35:aload_2         
	//*  17   36:ifnull          56
	//*  18   39:aload_2         
	//*  19   40:invokevirtual   #526 <Method int String.length()>
	//*  20   43:ifle            56
				objectnode.put("id", ((String) (type)));
	//   21   46:aload           4
	//   22   48:ldc2            #527 <String "id">
	//   23   51:aload_2         
	//   24   52:invokevirtual   #533 <Method ObjectNode ObjectNode.put(String, String)>
	//   25   55:pop             
		}
		ObjectNode objectnode1 = objectnode.objectNode();
	//   26   56:aload           4
	//   27   58:invokevirtual   #537 <Method ObjectNode ObjectNode.objectNode()>
	//   28   61:astore          5
		int i;
		if(_propertyFilterId != null)
	//*  29   63:aload_0         
	//*  30   64:getfield        #62  <Field Object _propertyFilterId>
	//*  31   67:ifnull          119
			type = ((Type) (findPropertyFilter(serializerprovider, _propertyFilterId, ((Object) (null)))));
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #62  <Field Object _propertyFilterId>
	//   36   76:aconst_null     
	//   37   77:invokevirtual   #279 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   38   80:astore_2        
		else
	//*  39   81:iconst_0        
	//*  40   82:istore_3        
	//*  41   83:iload_3         
	//*  42   84:aload_0         
	//*  43   85:getfield        #54  <Field BeanPropertyWriter[] _props>
	//*  44   88:arraylength     
	//*  45   89:icmpge          138
	//*  46   92:aload_0         
	//*  47   93:getfield        #54  <Field BeanPropertyWriter[] _props>
	//*  48   96:iload_3         
	//*  49   97:aaload          
	//*  50   98:astore          6
	//*  51  100:aload_2         
	//*  52  101:ifnonnull       124
	//*  53  104:aload           6
	//*  54  106:aload           5
	//*  55  108:aload_1         
	//*  56  109:invokevirtual   #540 <Method void BeanPropertyWriter.depositSchemaProperty(ObjectNode, SerializerProvider)>
	//*  57  112:iload_3         
	//*  58  113:iconst_1        
	//*  59  114:iadd            
	//*  60  115:istore_3        
	//*  61  116:goto            83
			type = null;
	//   62  119:aconst_null     
	//   63  120:astore_2        
		i = 0;
		while(i < _props.length) 
		{
			BeanPropertyWriter beanpropertywriter = _props[i];
			if(type == null)
				beanpropertywriter.depositSchemaProperty(objectnode1, serializerprovider);
			else
	//*  64  121:goto            81
				((PropertyFilter) (type)).depositSchemaProperty(((com.fasterxml.jackson.databind.ser.PropertyWriter) (beanpropertywriter)), objectnode1, serializerprovider);
	//   65  124:aload_2         
	//   66  125:aload           6
	//   67  127:aload           5
	//   68  129:aload_1         
	//   69  130:invokeinterface #543 <Method void PropertyFilter.depositSchemaProperty(com.fasterxml.jackson.databind.ser.PropertyWriter, ObjectNode, SerializerProvider)>
			i++;
		}
	//*  70  135:goto            112
		objectnode.set("properties", ((JsonNode) (objectnode1)));
	//   71  138:aload           4
	//   72  140:ldc2            #545 <String "properties">
	//   73  143:aload           5
	//   74  145:invokevirtual   #549 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   75  148:pop             
		return ((JsonNode) (objectnode));
	//   76  149:aload           4
	//   77  151:areturn         
	}

	public Iterator properties()
	{
		return Arrays.asList(((Object []) (_props))).iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field BeanPropertyWriter[] _props>
	//    2    4:invokestatic    #557 <Method List Arrays.asList(Object[])>
	//    3    7:invokeinterface #562 <Method Iterator List.iterator()>
	//    4   12:areturn         
	}

	public void resolve(SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		int i;
		int j;
		BeanPropertyWriter beanpropertywriter2;
		int k;
		JsonSerializer jsonserializer;
		BeanPropertyWriter beanpropertywriter;
		if(_filteredProps == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnonnull       108
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		else
	//*   5    9:iconst_0        
	//*   6   10:istore_3        
	//*   7   11:aload_0         
	//*   8   12:getfield        #54  <Field BeanPropertyWriter[] _props>
	//*   9   15:arraylength     
	//*  10   16:istore          4
	//*  11   18:iload_3         
	//*  12   19:iload           4
	//*  13   21:icmpge          299
	//*  14   24:aload_0         
	//*  15   25:getfield        #54  <Field BeanPropertyWriter[] _props>
	//*  16   28:iload_3         
	//*  17   29:aaload          
	//*  18   30:astore          8
	//*  19   32:aload           8
	//*  20   34:invokevirtual   #568 <Method boolean BeanPropertyWriter.willSuppressNulls()>
	//*  21   37:ifne            93
	//*  22   40:aload           8
	//*  23   42:invokevirtual   #571 <Method boolean BeanPropertyWriter.hasNullSerializer()>
	//*  24   45:ifne            93
	//*  25   48:aload_1         
	//*  26   49:aload           8
	//*  27   51:invokevirtual   #575 <Method JsonSerializer SerializerProvider.findNullValueSerializer(BeanProperty)>
	//*  28   54:astore          5
	//*  29   56:aload           5
	//*  30   58:ifnull          93
	//*  31   61:aload           8
	//*  32   63:aload           5
	//*  33   65:invokevirtual   #579 <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
	//*  34   68:iload_3         
	//*  35   69:iload_2         
	//*  36   70:icmpge          93
	//*  37   73:aload_0         
	//*  38   74:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//*  39   77:iload_3         
	//*  40   78:aaload          
	//*  41   79:astore          6
	//*  42   81:aload           6
	//*  43   83:ifnull          93
	//*  44   86:aload           6
	//*  45   88:aload           5
	//*  46   90:invokevirtual   #579 <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
	//*  47   93:aload           8
	//*  48   95:invokevirtual   #582 <Method boolean BeanPropertyWriter.hasSerializer()>
	//*  49   98:ifeq            117
	//*  50  101:iload_3         
	//*  51  102:iconst_1        
	//*  52  103:iadd            
	//*  53  104:istore_3        
	//*  54  105:goto            18
			i = _filteredProps.length;
	//   55  108:aload_0         
	//   56  109:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//   57  112:arraylength     
	//   58  113:istore_2        
		j = 0;
		k = _props.length;
		if(j >= k)
			break MISSING_BLOCK_LABEL_299;
		beanpropertywriter2 = _props[j];
		if(!beanpropertywriter2.willSuppressNulls() && !beanpropertywriter2.hasNullSerializer())
		{
			jsonserializer = serializerprovider.findNullValueSerializer(((BeanProperty) (beanpropertywriter2)));
			if(jsonserializer != null)
			{
				beanpropertywriter2.assignNullSerializer(jsonserializer);
				if(j < i)
				{
					beanpropertywriter = _filteredProps[j];
					if(beanpropertywriter != null)
						beanpropertywriter.assignNullSerializer(jsonserializer);
				}
			}
		}
		if(!beanpropertywriter2.hasSerializer())
			break; /* Loop/switch isn't completed */
_L4:
		j++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_18;
	//*  59  114:goto            9
_L1:
		Object obj;
		Object obj1;
label0:
		{
			obj1 = ((Object) (findConvertingSerializer(serializerprovider, beanpropertywriter2)));
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:aload           8
	//   63  121:invokevirtual   #584 <Method JsonSerializer findConvertingSerializer(SerializerProvider, BeanPropertyWriter)>
	//   64  124:astore          6
			obj = obj1;
	//   65  126:aload           6
	//   66  128:astore          5
			if(obj1 != null)
				break MISSING_BLOCK_LABEL_264;
	//   67  130:aload           6
	//   68  132:ifnonnull       264
			obj = ((Object) (beanpropertywriter2.getSerializationType()));
	//   69  135:aload           8
	//   70  137:invokevirtual   #587 <Method JavaType BeanPropertyWriter.getSerializationType()>
	//   71  140:astore          5
			obj1 = obj;
	//   72  142:aload           5
	//   73  144:astore          6
			if(obj != null)
				break label0;
	//   74  146:aload           5
	//   75  148:ifnonnull       196
			obj = ((Object) (beanpropertywriter2.getType()));
	//   76  151:aload           8
	//   77  153:invokevirtual   #464 <Method JavaType BeanPropertyWriter.getType()>
	//   78  156:astore          5
			obj1 = obj;
	//   79  158:aload           5
	//   80  160:astore          6
			if(((JavaType) (obj)).isFinal())
				break label0;
	//   81  162:aload           5
	//   82  164:invokevirtual   #590 <Method boolean JavaType.isFinal()>
	//   83  167:ifne            196
			if(((JavaType) (obj)).isContainerType() || ((JavaType) (obj)).containedTypeCount() > 0)
	//*  84  170:aload           5
	//*  85  172:invokevirtual   #593 <Method boolean JavaType.isContainerType()>
	//*  86  175:ifne            186
	//*  87  178:aload           5
	//*  88  180:invokevirtual   #596 <Method int JavaType.containedTypeCount()>
	//*  89  183:ifle            101
				beanpropertywriter2.setNonTrivialBaseType(((JavaType) (obj)));
	//   90  186:aload           8
	//   91  188:aload           5
	//   92  190:invokevirtual   #599 <Method void BeanPropertyWriter.setNonTrivialBaseType(JavaType)>
		}
		continue; /* Loop/switch isn't completed */
	//   93  193:goto            101
		JsonSerializer jsonserializer1 = serializerprovider.findValueSerializer(((JavaType) (obj1)), ((BeanProperty) (beanpropertywriter2)));
	//   94  196:aload_1         
	//   95  197:aload           6
	//   96  199:aload           8
	//   97  201:invokevirtual   #364 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   98  204:astore          7
		obj = ((Object) (jsonserializer1));
	//   99  206:aload           7
	//  100  208:astore          5
		if(((JavaType) (obj1)).isContainerType())
	//* 101  210:aload           6
	//* 102  212:invokevirtual   #593 <Method boolean JavaType.isContainerType()>
	//* 103  215:ifeq            264
		{
			obj1 = ((Object) ((TypeSerializer)((JavaType) (obj1)).getContentType().getTypeHandler()));
	//  104  218:aload           6
	//  105  220:invokevirtual   #602 <Method JavaType JavaType.getContentType()>
	//  106  223:invokevirtual   #605 <Method Object JavaType.getTypeHandler()>
	//  107  226:checkcast       #186 <Class TypeSerializer>
	//  108  229:astore          6
			obj = ((Object) (jsonserializer1));
	//  109  231:aload           7
	//  110  233:astore          5
			if(obj1 != null)
	//* 111  235:aload           6
	//* 112  237:ifnull          264
			{
				obj = ((Object) (jsonserializer1));
	//  113  240:aload           7
	//  114  242:astore          5
				if(jsonserializer1 instanceof ContainerSerializer)
	//* 115  244:aload           7
	//* 116  246:instanceof      #607 <Class ContainerSerializer>
	//* 117  249:ifeq            264
					obj = ((Object) (((ContainerSerializer)jsonserializer1).withValueTypeSerializer(((TypeSerializer) (obj1)))));
	//  118  252:aload           7
	//  119  254:checkcast       #607 <Class ContainerSerializer>
	//  120  257:aload           6
	//  121  259:invokevirtual   #611 <Method ContainerSerializer ContainerSerializer.withValueTypeSerializer(TypeSerializer)>
	//  122  262:astore          5
			}
		}
		beanpropertywriter2.assignSerializer(((JsonSerializer) (obj)));
	//  123  264:aload           8
	//  124  266:aload           5
	//  125  268:invokevirtual   #614 <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
		if(j < i)
	//* 126  271:iload_3         
	//* 127  272:iload_2         
	//* 128  273:icmpge          101
		{
			BeanPropertyWriter beanpropertywriter1 = _filteredProps[j];
	//  129  276:aload_0         
	//  130  277:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//  131  280:iload_3         
	//  132  281:aaload          
	//  133  282:astore          6
			if(beanpropertywriter1 != null)
	//* 134  284:aload           6
	//* 135  286:ifnull          101
				beanpropertywriter1.assignSerializer(((JsonSerializer) (obj)));
	//  136  289:aload           6
	//  137  291:aload           5
	//  138  293:invokevirtual   #614 <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
		}
		if(true) goto _L4; else goto _L3
	//  139  296:goto            101
_L3:
		if(_anyGetterWriter != null)
	//* 140  299:aload_0         
	//* 141  300:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//* 142  303:ifnull          314
			_anyGetterWriter.resolve(serializerprovider);
	//  143  306:aload_0         
	//  144  307:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//  145  310:aload_1         
	//  146  311:invokevirtual   #618 <Method void AnyGetterWriter.resolve(SerializerProvider)>
		return;
	//  147  314:return          
	}

	public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	protected void serializeFields(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int j;
		int k;
		int l;
		BeanPropertyWriter abeanpropertywriter[];
		BeanPropertyWriter beanpropertywriter;
		if(_filteredProps != null && serializerprovider.getActiveView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          78
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #292 <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          78
			abeanpropertywriter = _filteredProps;
	//    6   14:aload_0         
	//    7   15:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
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
	//*  20   38:icmpge          87
	//*  21   41:aload           8
	//*  22   43:iload           4
	//*  23   45:aaload          
	//*  24   46:astore          9
	//*  25   48:aload           9
	//*  26   50:ifnull          69
	//*  27   53:iload           4
	//*  28   55:istore          5
	//*  29   57:iload           4
	//*  30   59:istore          6
	//*  31   61:aload           9
	//*  32   63:aload_1         
	//*  33   64:aload_2         
	//*  34   65:aload_3         
	//*  35   66:invokevirtual   #625 <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
	//*  36   69:iload           4
	//*  37   71:iconst_1        
	//*  38   72:iadd            
	//*  39   73:istore          4
	//*  40   75:goto            34
			abeanpropertywriter = _props;
	//   41   78:aload_0         
	//   42   79:getfield        #54  <Field BeanPropertyWriter[] _props>
	//   43   82:astore          8
		j = 0;
		k = 0;
		i = 0;
		try
		{
			l = abeanpropertywriter.length;
		}
	//*  44   84:goto            20
	//*  45   87:iload           4
	//*  46   89:istore          5
	//*  47   91:iload           4
	//*  48   93:istore          6
	//*  49   95:aload_0         
	//*  50   96:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//*  51   99:ifnull          120
	//*  52  102:iload           4
	//*  53  104:istore          5
	//*  54  106:iload           4
	//*  55  108:istore          6
	//*  56  110:aload_0         
	//*  57  111:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//*  58  114:aload_1         
	//*  59  115:aload_2         
	//*  60  116:aload_3         
	//*  61  117:invokevirtual   #628 <Method void AnyGetterWriter.getAndSerialize(Object, JsonGenerator, SerializerProvider)>
	//*  62  120:return          
		catch(Exception exception)
	//*  63  121:astore          9
		{
			if(j == abeanpropertywriter.length)
	//*  64  123:iload           5
	//*  65  125:aload           8
	//*  66  127:arraylength     
	//*  67  128:icmpne          145
				jsongenerator = "[anySetter]";
	//   68  131:ldc2            #630 <String "[anySetter]">
	//   69  134:astore_2        
			else
	//*  70  135:aload_0         
	//*  71  136:aload_3         
	//*  72  137:aload           9
	//*  73  139:aload_1         
	//*  74  140:aload_2         
	//*  75  141:invokevirtual   #634 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//*  76  144:return          
				jsongenerator = ((JsonGenerator) (abeanpropertywriter[j].getName()));
	//   77  145:aload           8
	//   78  147:iload           5
	//   79  149:aaload          
	//   80  150:invokevirtual   #136 <Method String BeanPropertyWriter.getName()>
	//   81  153:astore_2        
			wrapAndThrow(serializerprovider, ((Throwable) (exception)), obj, ((String) (jsongenerator)));
			return;
		}
	//*  82  154:goto            135
		// Misplaced declaration of an exception variable
		catch(SerializerProvider serializerprovider)
	//*  83  157:astore_3        
		{
			serializerprovider = ((SerializerProvider) (new JsonMappingException(((java.io.Closeable) (jsongenerator)), "Infinite recursion (StackOverflowError)", ((Throwable) (serializerprovider)))));
	//   84  158:new             #265 <Class JsonMappingException>
	//   85  161:dup             
	//   86  162:aload_2         
	//   87  163:ldc2            #636 <String "Infinite recursion (StackOverflowError)">
	//   88  166:aload_3         
	//   89  167:invokespecial   #639 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   90  170:astore_3        
			if(k == abeanpropertywriter.length)
	//*  91  171:iload           6
	//*  92  173:aload           8
	//*  93  175:arraylength     
	//*  94  176:icmpne          198
				jsongenerator = "[anySetter]";
	//   95  179:ldc2            #630 <String "[anySetter]">
	//   96  182:astore_2        
			else
	//*  97  183:aload_3         
	//*  98  184:new             #641 <Class com.fasterxml.jackson.databind.JsonMappingException$Reference>
	//*  99  187:dup             
	//* 100  188:aload_1         
	//* 101  189:aload_2         
	//* 102  190:invokespecial   #644 <Method void com.fasterxml.jackson.databind.JsonMappingException$Reference(Object, String)>
	//* 103  193:invokevirtual   #648 <Method void JsonMappingException.prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)>
	//* 104  196:aload_3         
	//* 105  197:athrow          
				jsongenerator = ((JsonGenerator) (abeanpropertywriter[k].getName()));
	//  106  198:aload           8
	//  107  200:iload           6
	//  108  202:aaload          
	//  109  203:invokevirtual   #136 <Method String BeanPropertyWriter.getName()>
	//  110  206:astore_2        
			((JsonMappingException) (serializerprovider)).prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, ((String) (jsongenerator))));
			throw serializerprovider;
		}
		if(i >= l) goto _L2; else goto _L1
_L1:
		beanpropertywriter = abeanpropertywriter[i];
		if(beanpropertywriter == null)
			continue; /* Loop/switch isn't completed */
		j = i;
		k = i;
		beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
		i++;
		break MISSING_BLOCK_LABEL_34;
_L2:
		j = i;
		k = i;
		if(_anyGetterWriter == null)
			break MISSING_BLOCK_LABEL_120;
		j = i;
		k = i;
		_anyGetterWriter.getAndSerialize(obj, jsongenerator, serializerprovider);
	//* 111  207:goto            183
	}

	protected void serializeFieldsFiltered(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		BeanPropertyWriter abeanpropertywriter[];
		PropertyFilter propertyfilter;
		if(_filteredProps != null && serializerprovider.getActiveView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//*   2    4:ifnull          45
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #292 <Method Class SerializerProvider.getActiveView()>
	//*   5   11:ifnull          45
			abeanpropertywriter = _filteredProps;
	//    6   14:aload_0         
	//    7   15:getfield        #56  <Field BeanPropertyWriter[] _filteredProps>
	//    8   18:astore          8
		else
	//*   9   20:aload_0         
	//*  10   21:aload_3         
	//*  11   22:aload_0         
	//*  12   23:getfield        #62  <Field Object _propertyFilterId>
	//*  13   26:aload_1         
	//*  14   27:invokevirtual   #279 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//*  15   30:astore          9
	//*  16   32:aload           9
	//*  17   34:ifnonnull       54
	//*  18   37:aload_0         
	//*  19   38:aload_1         
	//*  20   39:aload_2         
	//*  21   40:aload_3         
	//*  22   41:invokevirtual   #212 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
	//*  23   44:return          
			abeanpropertywriter = _props;
	//   24   45:aload_0         
	//   25   46:getfield        #54  <Field BeanPropertyWriter[] _props>
	//   26   49:astore          8
		propertyfilter = findPropertyFilter(serializerprovider, _propertyFilterId, obj);
		if(propertyfilter != null) goto _L2; else goto _L1
_L1:
		serializeFields(obj, jsongenerator, serializerprovider);
_L4:
		return;
	//*  27   51:goto            20
_L2:
		int i;
		int j;
		int k;
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
_L5:
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
	//   55  102:invokeinterface #653 <Method void PropertyFilter.serializeAsField(Object, JsonGenerator, SerializerProvider, com.fasterxml.jackson.databind.ser.PropertyWriter)>
		break MISSING_BLOCK_LABEL_235;
	//   56  107:goto            235
		j = i;
	//   57  110:iload           4
	//   58  112:istore          5
		k = i;
	//   59  114:iload           4
	//   60  116:istore          6
		if(_anyGetterWriter == null) goto _L4; else goto _L3
	//   61  118:aload_0         
	//   62  119:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//   63  122:ifnull          44
_L3:
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
	//   69  134:getfield        #60  <Field AnyGetterWriter _anyGetterWriter>
	//   70  137:aload_1         
	//   71  138:aload_2         
	//   72  139:aload_3         
	//   73  140:aload           9
	//   74  142:invokevirtual   #657 <Method void AnyGetterWriter.getAndFilter(Object, JsonGenerator, SerializerProvider, PropertyFilter)>
			return;
	//   75  145:return          
		}
		catch(Exception exception)
	//*  76  146:astore          9
		{
			if(j == abeanpropertywriter.length)
	//*  77  148:iload           5
	//*  78  150:aload           8
	//*  79  152:arraylength     
	//*  80  153:icmpne          170
				jsongenerator = "[anySetter]";
	//   81  156:ldc2            #630 <String "[anySetter]">
	//   82  159:astore_2        
			else
	//*  83  160:aload_0         
	//*  84  161:aload_3         
	//*  85  162:aload           9
	//*  86  164:aload_1         
	//*  87  165:aload_2         
	//*  88  166:invokevirtual   #634 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//*  89  169:return          
				jsongenerator = ((JsonGenerator) (abeanpropertywriter[j].getName()));
	//   90  170:aload           8
	//   91  172:iload           5
	//   92  174:aaload          
	//   93  175:invokevirtual   #136 <Method String BeanPropertyWriter.getName()>
	//   94  178:astore_2        
			wrapAndThrow(serializerprovider, ((Throwable) (exception)), obj, ((String) (jsongenerator)));
			return;
		}
	//*  95  179:goto            160
		// Misplaced declaration of an exception variable
		catch(SerializerProvider serializerprovider)
	//*  96  182:astore_3        
		{
			serializerprovider = ((SerializerProvider) (new JsonMappingException(((java.io.Closeable) (jsongenerator)), "Infinite recursion (StackOverflowError)", ((Throwable) (serializerprovider)))));
	//   97  183:new             #265 <Class JsonMappingException>
	//   98  186:dup             
	//   99  187:aload_2         
	//  100  188:ldc2            #636 <String "Infinite recursion (StackOverflowError)">
	//  101  191:aload_3         
	//  102  192:invokespecial   #639 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  103  195:astore_3        
		}
		if(k == abeanpropertywriter.length)
	//* 104  196:iload           6
	//* 105  198:aload           8
	//* 106  200:arraylength     
	//* 107  201:icmpne          223
			jsongenerator = "[anySetter]";
	//  108  204:ldc2            #630 <String "[anySetter]">
	//  109  207:astore_2        
		else
	//* 110  208:aload_3         
	//* 111  209:new             #641 <Class com.fasterxml.jackson.databind.JsonMappingException$Reference>
	//* 112  212:dup             
	//* 113  213:aload_1         
	//* 114  214:aload_2         
	//* 115  215:invokespecial   #644 <Method void com.fasterxml.jackson.databind.JsonMappingException$Reference(Object, String)>
	//* 116  218:invokevirtual   #648 <Method void JsonMappingException.prependPath(com.fasterxml.jackson.databind.JsonMappingException$Reference)>
	//* 117  221:aload_3         
	//* 118  222:athrow          
			jsongenerator = ((JsonGenerator) (abeanpropertywriter[k].getName()));
	//  119  223:aload           8
	//  120  225:iload           6
	//  121  227:aaload          
	//  122  228:invokevirtual   #136 <Method String BeanPropertyWriter.getName()>
	//  123  231:astore_2        
		((JsonMappingException) (serializerprovider)).prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, ((String) (jsongenerator))));
		throw serializerprovider;
	//* 124  232:goto            208
		i++;
	//  125  235:iload           4
	//  126  237:iconst_1        
	//  127  238:iadd            
	//  128  239:istore          4
		  goto _L5
	//* 129  241:goto            68
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(_objectIdWriter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
	//*   2    4:ifnull          22
		{
			jsongenerator.setCurrentValue(obj);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #662 <Method void JsonGenerator.setCurrentValue(Object)>
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, typeserializer);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:aload           4
	//   11   18:invokevirtual   #664 <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   12   21:return          
		}
		String s;
		if(_typeId == null)
	//*  13   22:aload_0         
	//*  14   23:getfield        #58  <Field AnnotatedMember _typeId>
	//*  15   26:ifnonnull       76
			s = null;
	//   16   29:aconst_null     
	//   17   30:astore          5
		else
	//*  18   32:aload           5
	//*  19   34:ifnonnull       86
	//*  20   37:aload           4
	//*  21   39:aload_1         
	//*  22   40:aload_2         
	//*  23   41:invokevirtual   #190 <Method void TypeSerializer.writeTypePrefixForObject(Object, JsonGenerator)>
	//*  24   44:aload_2         
	//*  25   45:aload_1         
	//*  26   46:invokevirtual   #662 <Method void JsonGenerator.setCurrentValue(Object)>
	//*  27   49:aload_0         
	//*  28   50:getfield        #62  <Field Object _propertyFilterId>
	//*  29   53:ifnull          98
	//*  30   56:aload_0         
	//*  31   57:aload_1         
	//*  32   58:aload_2         
	//*  33   59:aload_3         
	//*  34   60:invokevirtual   #200 <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
	//*  35   63:aload           5
	//*  36   65:ifnonnull       108
	//*  37   68:aload           4
	//*  38   70:aload_1         
	//*  39   71:aload_2         
	//*  40   72:invokevirtual   #203 <Method void TypeSerializer.writeTypeSuffixForObject(Object, JsonGenerator)>
	//*  41   75:return          
			s = _customTypeId(obj);
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:invokevirtual   #205 <Method String _customTypeId(Object)>
	//   45   81:astore          5
		if(s == null)
			typeserializer.writeTypePrefixForObject(obj, jsongenerator);
		else
	//*  46   83:goto            32
			typeserializer.writeCustomTypePrefixForObject(obj, jsongenerator, s);
	//   47   86:aload           4
	//   48   88:aload_1         
	//   49   89:aload_2         
	//   50   90:aload           5
	//   51   92:invokevirtual   #209 <Method void TypeSerializer.writeCustomTypePrefixForObject(Object, JsonGenerator, String)>
		jsongenerator.setCurrentValue(obj);
		if(_propertyFilterId != null)
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
		else
	//*  52   95:goto            44
			serializeFields(obj, jsongenerator, serializerprovider);
	//   53   98:aload_0         
	//   54   99:aload_1         
	//   55  100:aload_2         
	//   56  101:aload_3         
	//   57  102:invokevirtual   #212 <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
		if(s == null)
		{
			typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
			return;
		} else
	//*  58  105:goto            63
		{
			typeserializer.writeCustomTypeSuffixForObject(obj, jsongenerator, s);
	//   59  108:aload           4
	//   60  110:aload_1         
	//   61  111:aload_2         
	//   62  112:aload           5
	//   63  114:invokevirtual   #215 <Method void TypeSerializer.writeCustomTypeSuffixForObject(Object, JsonGenerator, String)>
			return;
	//   64  117:return          
		}
	}

	public boolean usesObjectId()
	{
		return _objectIdWriter != null;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectIdWriter _objectIdWriter>
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
	//    2    2:invokevirtual   #380 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public abstract BeanSerializerBase withFilterId(Object obj);

	protected abstract BeanSerializerBase withIgnorals(String as[]);

	public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter);

	protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
	protected static final BeanPropertyWriter NO_PROPS[] = new BeanPropertyWriter[0];
	protected final AnyGetterWriter _anyGetterWriter;
	protected final BeanPropertyWriter _filteredProps[];
	protected final ObjectIdWriter _objectIdWriter;
	protected final Object _propertyFilterId;
	protected final BeanPropertyWriter _props[];
	protected final com.fasterxml.jackson.annotation.JsonFormat.Shape _serializationShape;
	protected final AnnotatedMember _typeId;

	static 
	{
	//    0    0:new             #35  <Class PropertyName>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "#object-ref">
	//    3    6:invokespecial   #41  <Method void PropertyName(String)>
	//    4    9:putstatic       #43  <Field PropertyName NAME_FOR_OBJECT_REF>
	//    5   12:iconst_0        
	//    6   13:anewarray       BeanPropertyWriter[]
	//    7   16:putstatic       #47  <Field BeanPropertyWriter[] NO_PROPS>
	//*   8   19:return          
	}
}
