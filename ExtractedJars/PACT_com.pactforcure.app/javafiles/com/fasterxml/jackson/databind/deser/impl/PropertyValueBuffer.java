// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.BitSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ObjectIdReader, ReadableObjectId, PropertyValue

public class PropertyValueBuffer
{

	public PropertyValueBuffer(JsonParser jsonparser, DeserializationContext deserializationcontext, int i, ObjectIdReader objectidreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		_parser = jsonparser;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field JsonParser _parser>
		_context = deserializationcontext;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field DeserializationContext _context>
		_paramsNeeded = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field int _paramsNeeded>
		_objectIdReader = objectidreader;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field ObjectIdReader _objectIdReader>
		_creatorParameters = new Object[i];
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:anewarray       Object[]
	//   17   30:putfield        #36  <Field Object[] _creatorParameters>
		if(i < 32)
	//*  18   33:iload_3         
	//*  19   34:bipush          32
	//*  20   36:icmpge          45
		{
			_paramsSeenBig = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #38  <Field BitSet _paramsSeenBig>
			return;
	//   24   44:return          
		} else
		{
			_paramsSeenBig = new BitSet();
	//   25   45:aload_0         
	//   26   46:new             #40  <Class BitSet>
	//   27   49:dup             
	//   28   50:invokespecial   #41  <Method void BitSet()>
	//   29   53:putfield        #38  <Field BitSet _paramsSeenBig>
			return;
	//   30   56:return          
		}
	}

	protected Object _findMissing(SettableBeanProperty settablebeanproperty)
		throws JsonMappingException
	{
		if(settablebeanproperty.getInjectableValueId() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #52  <Method Object SettableBeanProperty.getInjectableValueId()>
	//*   2    4:ifnull          21
			return _context.findInjectableValue(settablebeanproperty.getInjectableValueId(), ((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty)), ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field DeserializationContext _context>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #52  <Method Object SettableBeanProperty.getInjectableValueId()>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #58  <Method Object DeserializationContext.findInjectableValue(Object, com.fasterxml.jackson.databind.BeanProperty, Object)>
	//   10   20:areturn         
		if(settablebeanproperty.isRequired())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #62  <Method boolean SettableBeanProperty.isRequired()>
	//*  13   25:ifeq            59
			throw _context.mappingException("Missing required creator property '%s' (index %d)", new Object[] {
				settablebeanproperty.getName(), Integer.valueOf(settablebeanproperty.getCreatorIndex())
			});
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field DeserializationContext _context>
	//   16   32:ldc1            #64  <String "Missing required creator property '%s' (index %d)">
	//   17   34:iconst_2        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_1         
	//   22   41:invokevirtual   #68  <Method String SettableBeanProperty.getName()>
	//   23   44:aastore         
	//   24   45:dup             
	//   25   46:iconst_1        
	//   26   47:aload_1         
	//   27   48:invokevirtual   #72  <Method int SettableBeanProperty.getCreatorIndex()>
	//   28   51:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   29   54:aastore         
	//   30   55:invokevirtual   #82  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   31   58:athrow          
		if(_context.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES))
	//*  32   59:aload_0         
	//*  33   60:getfield        #30  <Field DeserializationContext _context>
	//*  34   63:getstatic       #88  <Field DeserializationFeature DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES>
	//*  35   66:invokevirtual   #92  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  36   69:ifeq            103
			throw _context.mappingException("Missing creator property '%s' (index %d); DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES enabled", new Object[] {
				settablebeanproperty.getName(), Integer.valueOf(settablebeanproperty.getCreatorIndex())
			});
	//   37   72:aload_0         
	//   38   73:getfield        #30  <Field DeserializationContext _context>
	//   39   76:ldc1            #94  <String "Missing creator property '%s' (index %d); DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES enabled">
	//   40   78:iconst_2        
	//   41   79:anewarray       Object[]
	//   42   82:dup             
	//   43   83:iconst_0        
	//   44   84:aload_1         
	//   45   85:invokevirtual   #68  <Method String SettableBeanProperty.getName()>
	//   46   88:aastore         
	//   47   89:dup             
	//   48   90:iconst_1        
	//   49   91:aload_1         
	//   50   92:invokevirtual   #72  <Method int SettableBeanProperty.getCreatorIndex()>
	//   51   95:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   52   98:aastore         
	//   53   99:invokevirtual   #82  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   54  102:athrow          
		else
			return settablebeanproperty.getValueDeserializer().getNullValue(_context);
	//   55  103:aload_1         
	//   56  104:invokevirtual   #98  <Method JsonDeserializer SettableBeanProperty.getValueDeserializer()>
	//   57  107:aload_0         
	//   58  108:getfield        #30  <Field DeserializationContext _context>
	//   59  111:invokevirtual   #104 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   60  114:areturn         
	}

	public boolean assignParameter(int i, Object obj)
	{
		_creatorParameters[i] = obj;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object[] _creatorParameters>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aastore         
		return false;
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public boolean assignParameter(SettableBeanProperty settablebeanproperty, Object obj)
	{
		int i;
		i = settablebeanproperty.getCreatorIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method int SettableBeanProperty.getCreatorIndex()>
	//    2    4:istore_3        
		_creatorParameters[i] = obj;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field Object[] _creatorParameters>
	//    5    9:iload_3         
	//    6   10:aload_2         
	//    7   11:aastore         
		if(_paramsSeenBig != null) goto _L2; else goto _L1
	//    8   12:aload_0         
	//    9   13:getfield        #38  <Field BitSet _paramsSeenBig>
	//   10   16:ifnonnull       61
_L1:
		int j = _paramsSeen;
	//   11   19:aload_0         
	//   12   20:getfield        #112 <Field int _paramsSeen>
	//   13   23:istore          4
		i = j | 1 << i;
	//   14   25:iload           4
	//   15   27:iconst_1        
	//   16   28:iload_3         
	//   17   29:ishl            
	//   18   30:ior             
	//   19   31:istore_3        
		if(j == i)
			break MISSING_BLOCK_LABEL_99;
	//   20   32:iload           4
	//   21   34:iload_3         
	//   22   35:icmpeq          99
		_paramsSeen = i;
	//   23   38:aload_0         
	//   24   39:iload_3         
	//   25   40:putfield        #112 <Field int _paramsSeen>
		i = _paramsNeeded - 1;
	//   26   43:aload_0         
	//   27   44:getfield        #32  <Field int _paramsNeeded>
	//   28   47:iconst_1        
	//   29   48:isub            
	//   30   49:istore_3        
		_paramsNeeded = i;
	//   31   50:aload_0         
	//   32   51:iload_3         
	//   33   52:putfield        #32  <Field int _paramsNeeded>
		if(i > 0)
			break MISSING_BLOCK_LABEL_99;
	//   34   55:iload_3         
	//   35   56:ifgt            99
_L4:
		return true;
	//   36   59:iconst_1        
	//   37   60:ireturn         
_L2:
		int k;
		if(_paramsSeenBig.get(i))
			break MISSING_BLOCK_LABEL_99;
	//   38   61:aload_0         
	//   39   62:getfield        #38  <Field BitSet _paramsSeenBig>
	//   40   65:iload_3         
	//   41   66:invokevirtual   #116 <Method boolean BitSet.get(int)>
	//   42   69:ifne            99
		k = _paramsNeeded - 1;
	//   43   72:aload_0         
	//   44   73:getfield        #32  <Field int _paramsNeeded>
	//   45   76:iconst_1        
	//   46   77:isub            
	//   47   78:istore          4
		_paramsNeeded = k;
	//   48   80:aload_0         
	//   49   81:iload           4
	//   50   83:putfield        #32  <Field int _paramsNeeded>
		if(k <= 0) goto _L4; else goto _L3
	//   51   86:iload           4
	//   52   88:ifle            59
_L3:
		_paramsSeenBig.set(i);
	//   53   91:aload_0         
	//   54   92:getfield        #38  <Field BitSet _paramsSeenBig>
	//   55   95:iload_3         
	//   56   96:invokevirtual   #120 <Method void BitSet.set(int)>
		return false;
	//   57   99:iconst_0        
	//   58  100:ireturn         
	}

	public void bufferAnyProperty(SettableAnyProperty settableanyproperty, String s, Object obj)
	{
		_buffered = ((PropertyValue) (new PropertyValue.Any(_buffered, obj, settableanyproperty, s)));
	//    0    0:aload_0         
	//    1    1:new             #124 <Class PropertyValue$Any>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #126 <Field PropertyValue _buffered>
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #129 <Method void PropertyValue$Any(PropertyValue, Object, SettableAnyProperty, String)>
	//    9   15:putfield        #126 <Field PropertyValue _buffered>
	//   10   18:return          
	}

	public void bufferMapProperty(Object obj, Object obj1)
	{
		_buffered = ((PropertyValue) (new PropertyValue.Map(_buffered, obj1, obj)));
	//    0    0:aload_0         
	//    1    1:new             #133 <Class PropertyValue$Map>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #126 <Field PropertyValue _buffered>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #136 <Method void PropertyValue$Map(PropertyValue, Object, Object)>
	//    8   14:putfield        #126 <Field PropertyValue _buffered>
	//    9   17:return          
	}

	public void bufferProperty(SettableBeanProperty settablebeanproperty, Object obj)
	{
		_buffered = ((PropertyValue) (new PropertyValue.Regular(_buffered, obj, settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:new             #140 <Class PropertyValue$Regular>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #126 <Field PropertyValue _buffered>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #143 <Method void PropertyValue$Regular(PropertyValue, Object, SettableBeanProperty)>
	//    8   14:putfield        #126 <Field PropertyValue _buffered>
	//    9   17:return          
	}

	protected PropertyValue buffered()
	{
		return _buffered;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field PropertyValue _buffered>
	//    2    4:areturn         
	}

	protected Object[] getParameters(SettableBeanProperty asettablebeanproperty[])
		throws JsonMappingException
	{
		if(_paramsNeeded > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field int _paramsNeeded>
	//*   2    4:ifle            106
			if(_paramsSeenBig == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field BitSet _paramsSeenBig>
	//*   5   11:ifnonnull       64
			{
				int i = _paramsSeen;
	//    6   14:aload_0         
	//    7   15:getfield        #112 <Field int _paramsSeen>
	//    8   18:istore_2        
				int k = 0;
	//    9   19:iconst_0        
	//   10   20:istore_3        
				for(int i1 = _creatorParameters.length; k < i1;)
	//*  11   21:aload_0         
	//*  12   22:getfield        #36  <Field Object[] _creatorParameters>
	//*  13   25:arraylength     
	//*  14   26:istore          4
	//*  15   28:iload_3         
	//*  16   29:iload           4
	//*  17   31:icmpge          106
				{
					if((i & 1) == 0)
	//*  18   34:iload_2         
	//*  19   35:iconst_1        
	//*  20   36:iand            
	//*  21   37:ifne            53
						_creatorParameters[k] = _findMissing(asettablebeanproperty[k]);
	//   22   40:aload_0         
	//   23   41:getfield        #36  <Field Object[] _creatorParameters>
	//   24   44:iload_3         
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:aaload          
	//   29   49:invokevirtual   #149 <Method Object _findMissing(SettableBeanProperty)>
	//   30   52:aastore         
					k++;
	//   31   53:iload_3         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_3        
					i >>= 1;
	//   35   57:iload_2         
	//   36   58:iconst_1        
	//   37   59:ishr            
	//   38   60:istore_2        
				}

			} else
	//*  39   61:goto            28
			{
				int l = _creatorParameters.length;
	//   40   64:aload_0         
	//   41   65:getfield        #36  <Field Object[] _creatorParameters>
	//   42   68:arraylength     
	//   43   69:istore_3        
				int j = 0;
	//   44   70:iconst_0        
	//   45   71:istore_2        
				do
				{
					j = _paramsSeenBig.nextClearBit(j);
	//   46   72:aload_0         
	//   47   73:getfield        #38  <Field BitSet _paramsSeenBig>
	//   48   76:iload_2         
	//   49   77:invokevirtual   #153 <Method int BitSet.nextClearBit(int)>
	//   50   80:istore_2        
					if(j >= l)
						break;
	//   51   81:iload_2         
	//   52   82:iload_3         
	//   53   83:icmpge          106
					_creatorParameters[j] = _findMissing(asettablebeanproperty[j]);
	//   54   86:aload_0         
	//   55   87:getfield        #36  <Field Object[] _creatorParameters>
	//   56   90:iload_2         
	//   57   91:aload_0         
	//   58   92:aload_1         
	//   59   93:iload_2         
	//   60   94:aaload          
	//   61   95:invokevirtual   #149 <Method Object _findMissing(SettableBeanProperty)>
	//   62   98:aastore         
					j++;
	//   63   99:iload_2         
	//   64  100:iconst_1        
	//   65  101:iadd            
	//   66  102:istore_2        
				} while(true);
	//   67  103:goto            72
			}
		return _creatorParameters;
	//   68  106:aload_0         
	//   69  107:getfield        #36  <Field Object[] _creatorParameters>
	//   70  110:areturn         
	}

	public Object handleIdValue(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
label0:
		{
			Object obj1 = obj;
	//    0    0:aload_2         
	//    1    1:astore_3        
			if(_objectIdReader != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//*   4    6:ifnull          66
			{
				if(_idValue == null)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #159 <Field Object _idValue>
	//    7   13:ifnull          68
				deserializationcontext.findObjectId(_idValue, _objectIdReader.generator, _objectIdReader.resolver).bindItem(obj);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #159 <Field Object _idValue>
	//   11   21:aload_0         
	//   12   22:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//   13   25:getfield        #165 <Field com.fasterxml.jackson.annotation.ObjectIdGenerator ObjectIdReader.generator>
	//   14   28:aload_0         
	//   15   29:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//   16   32:getfield        #169 <Field com.fasterxml.jackson.annotation.ObjectIdResolver ObjectIdReader.resolver>
	//   17   35:invokevirtual   #173 <Method ReadableObjectId DeserializationContext.findObjectId(Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #179 <Method void ReadableObjectId.bindItem(Object)>
				deserializationcontext = ((DeserializationContext) (_objectIdReader.idProperty));
	//   20   42:aload_0         
	//   21   43:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//   22   46:getfield        #183 <Field SettableBeanProperty ObjectIdReader.idProperty>
	//   23   49:astore_1        
				obj1 = obj;
	//   24   50:aload_2         
	//   25   51:astore_3        
				if(deserializationcontext != null)
	//*  26   52:aload_1         
	//*  27   53:ifnull          66
					obj1 = ((SettableBeanProperty) (deserializationcontext)).setAndReturn(obj, _idValue);
	//   28   56:aload_1         
	//   29   57:aload_2         
	//   30   58:aload_0         
	//   31   59:getfield        #159 <Field Object _idValue>
	//   32   62:invokevirtual   #187 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   33   65:astore_3        
			}
			return obj1;
	//   34   66:aload_3         
	//   35   67:areturn         
		}
		throw deserializationcontext.mappingException("No _idValue when handleIdValue called, on instance of %s", new Object[] {
			obj.getClass().getName()
		});
	//   36   68:aload_1         
	//   37   69:ldc1            #189 <String "No _idValue when handleIdValue called, on instance of %s">
	//   38   71:iconst_1        
	//   39   72:anewarray       Object[]
	//   40   75:dup             
	//   41   76:iconst_0        
	//   42   77:aload_2         
	//   43   78:invokevirtual   #193 <Method Class Object.getClass()>
	//   44   81:invokevirtual   #196 <Method String Class.getName()>
	//   45   84:aastore         
	//   46   85:invokevirtual   #82  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   47   88:athrow          
	}

	public boolean isComplete()
	{
		return _paramsNeeded <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int _paramsNeeded>
	//    2    4:ifgt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean readIdProperty(String s)
		throws IOException
	{
		if(_objectIdReader != null && s.equals(((Object) (_objectIdReader.propertyName.getSimpleName()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//*   2    4:ifnull          45
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//*   6   12:getfield        #203 <Field PropertyName ObjectIdReader.propertyName>
	//*   7   15:invokevirtual   #208 <Method String PropertyName.getSimpleName()>
	//*   8   18:invokevirtual   #214 <Method boolean String.equals(Object)>
	//*   9   21:ifeq            45
		{
			_idValue = _objectIdReader.readObjectReference(_parser, _context);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//   13   29:aload_0         
	//   14   30:getfield        #28  <Field JsonParser _parser>
	//   15   33:aload_0         
	//   16   34:getfield        #30  <Field DeserializationContext _context>
	//   17   37:invokevirtual   #218 <Method Object ObjectIdReader.readObjectReference(JsonParser, DeserializationContext)>
	//   18   40:putfield        #159 <Field Object _idValue>
			return true;
	//   19   43:iconst_1        
	//   20   44:ireturn         
		} else
		{
			return false;
	//   21   45:iconst_0        
	//   22   46:ireturn         
		}
	}

	protected PropertyValue _buffered;
	protected final DeserializationContext _context;
	protected final Object _creatorParameters[];
	protected Object _idValue;
	protected final ObjectIdReader _objectIdReader;
	protected int _paramsNeeded;
	protected int _paramsSeen;
	protected final BitSet _paramsSeenBig;
	protected final JsonParser _parser;
}
