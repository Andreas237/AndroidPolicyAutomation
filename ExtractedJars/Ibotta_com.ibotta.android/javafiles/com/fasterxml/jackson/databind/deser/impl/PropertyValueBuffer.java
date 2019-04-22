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
	//*  13   25:ifeq            60
			_context.reportInputMismatch(((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty)), "Missing required creator property '%s' (index %d)", new Object[] {
				settablebeanproperty.getName(), Integer.valueOf(settablebeanproperty.getCreatorIndex())
			});
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field DeserializationContext _context>
	//   16   32:aload_1         
	//   17   33:ldc1            #64  <String "Missing required creator property '%s' (index %d)">
	//   18   35:iconst_2        
	//   19   36:anewarray       Object[]
	//   20   39:dup             
	//   21   40:iconst_0        
	//   22   41:aload_1         
	//   23   42:invokevirtual   #68  <Method String SettableBeanProperty.getName()>
	//   24   45:aastore         
	//   25   46:dup             
	//   26   47:iconst_1        
	//   27   48:aload_1         
	//   28   49:invokevirtual   #72  <Method int SettableBeanProperty.getCreatorIndex()>
	//   29   52:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   30   55:aastore         
	//   31   56:invokevirtual   #82  <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty, String, Object[])>
	//   32   59:pop             
		if(_context.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES))
	//*  33   60:aload_0         
	//*  34   61:getfield        #30  <Field DeserializationContext _context>
	//*  35   64:getstatic       #88  <Field DeserializationFeature DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES>
	//*  36   67:invokevirtual   #92  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  37   70:ifeq            105
			_context.reportInputMismatch(((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty)), "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", new Object[] {
				settablebeanproperty.getName(), Integer.valueOf(settablebeanproperty.getCreatorIndex())
			});
	//   38   73:aload_0         
	//   39   74:getfield        #30  <Field DeserializationContext _context>
	//   40   77:aload_1         
	//   41   78:ldc1            #94  <String "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled">
	//   42   80:iconst_2        
	//   43   81:anewarray       Object[]
	//   44   84:dup             
	//   45   85:iconst_0        
	//   46   86:aload_1         
	//   47   87:invokevirtual   #68  <Method String SettableBeanProperty.getName()>
	//   48   90:aastore         
	//   49   91:dup             
	//   50   92:iconst_1        
	//   51   93:aload_1         
	//   52   94:invokevirtual   #72  <Method int SettableBeanProperty.getCreatorIndex()>
	//   53   97:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   54  100:aastore         
	//   55  101:invokevirtual   #82  <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty, String, Object[])>
	//   56  104:pop             
		return settablebeanproperty.getValueDeserializer().getNullValue(_context);
	//   57  105:aload_1         
	//   58  106:invokevirtual   #98  <Method JsonDeserializer SettableBeanProperty.getValueDeserializer()>
	//   59  109:aload_0         
	//   60  110:getfield        #30  <Field DeserializationContext _context>
	//   61  113:invokevirtual   #104 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   62  116:areturn         
	}

	public boolean assignParameter(SettableBeanProperty settablebeanproperty, Object obj)
	{
		int k = settablebeanproperty.getCreatorIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method int SettableBeanProperty.getCreatorIndex()>
	//    2    4:istore          4
		_creatorParameters[k] = obj;
	//    3    6:aload_0         
	//    4    7:getfield        #36  <Field Object[] _creatorParameters>
	//    5   10:iload           4
	//    6   12:aload_2         
	//    7   13:aastore         
		settablebeanproperty = ((SettableBeanProperty) (_paramsSeenBig));
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field BitSet _paramsSeenBig>
	//   10   18:astore_1        
		boolean flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          5
		if(settablebeanproperty == null)
	//*  13   22:aload_1         
	//*  14   23:ifnonnull       87
		{
			int i = _paramsSeen;
	//   15   26:aload_0         
	//   16   27:getfield        #109 <Field int _paramsSeen>
	//   17   30:istore_3        
			k = 1 << k | i;
	//   18   31:iconst_1        
	//   19   32:iload           4
	//   20   34:ishl            
	//   21   35:iload_3         
	//   22   36:ior             
	//   23   37:istore          4
			if(i != k)
	//*  24   39:iload_3         
	//*  25   40:iload           4
	//*  26   42:icmpeq          115
			{
				_paramsSeen = k;
	//   27   45:aload_0         
	//   28   46:iload           4
	//   29   48:putfield        #109 <Field int _paramsSeen>
				int j = _paramsNeeded - 1;
	//   30   51:aload_0         
	//   31   52:getfield        #32  <Field int _paramsNeeded>
	//   32   55:iconst_1        
	//   33   56:isub            
	//   34   57:istore_3        
				_paramsNeeded = j;
	//   35   58:aload_0         
	//   36   59:iload_3         
	//   37   60:putfield        #32  <Field int _paramsNeeded>
				if(j <= 0)
	//*  38   63:iload_3         
	//*  39   64:ifgt            115
				{
					if(_objectIdReader == null || _idValue != null)
	//*  40   67:aload_0         
	//*  41   68:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//*  42   71:ifnull          81
	//*  43   74:aload_0         
	//*  44   75:getfield        #111 <Field Object _idValue>
	//*  45   78:ifnull          84
						flag = true;
	//   46   81:iconst_1        
	//   47   82:istore          5
					return flag;
	//   48   84:iload           5
	//   49   86:ireturn         
				}
			}
		} else
		if(!((BitSet) (settablebeanproperty)).get(k))
	//*  50   87:aload_1         
	//*  51   88:iload           4
	//*  52   90:invokevirtual   #115 <Method boolean BitSet.get(int)>
	//*  53   93:ifne            115
		{
			_paramsSeenBig.set(k);
	//   54   96:aload_0         
	//   55   97:getfield        #38  <Field BitSet _paramsSeenBig>
	//   56  100:iload           4
	//   57  102:invokevirtual   #119 <Method void BitSet.set(int)>
			_paramsNeeded = _paramsNeeded - 1;
	//   58  105:aload_0         
	//   59  106:aload_0         
	//   60  107:getfield        #32  <Field int _paramsNeeded>
	//   61  110:iconst_1        
	//   62  111:isub            
	//   63  112:putfield        #32  <Field int _paramsNeeded>
		}
		return false;
	//   64  115:iconst_0        
	//   65  116:ireturn         
	}

	public void bufferAnyProperty(SettableAnyProperty settableanyproperty, String s, Object obj)
	{
		_buffered = ((PropertyValue) (new PropertyValue.Any(_buffered, obj, settableanyproperty, s)));
	//    0    0:aload_0         
	//    1    1:new             #123 <Class PropertyValue$Any>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field PropertyValue _buffered>
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #128 <Method void PropertyValue$Any(PropertyValue, Object, SettableAnyProperty, String)>
	//    9   15:putfield        #125 <Field PropertyValue _buffered>
	//   10   18:return          
	}

	public void bufferMapProperty(Object obj, Object obj1)
	{
		_buffered = ((PropertyValue) (new PropertyValue.Map(_buffered, obj1, obj)));
	//    0    0:aload_0         
	//    1    1:new             #132 <Class PropertyValue$Map>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field PropertyValue _buffered>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #135 <Method void PropertyValue$Map(PropertyValue, Object, Object)>
	//    8   14:putfield        #125 <Field PropertyValue _buffered>
	//    9   17:return          
	}

	public void bufferProperty(SettableBeanProperty settablebeanproperty, Object obj)
	{
		_buffered = ((PropertyValue) (new PropertyValue.Regular(_buffered, obj, settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:new             #139 <Class PropertyValue$Regular>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field PropertyValue _buffered>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #142 <Method void PropertyValue$Regular(PropertyValue, Object, SettableBeanProperty)>
	//    8   14:putfield        #125 <Field PropertyValue _buffered>
	//    9   17:return          
	}

	protected PropertyValue buffered()
	{
		return _buffered;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field PropertyValue _buffered>
	//    2    4:areturn         
	}

	public Object[] getParameters(SettableBeanProperty asettablebeanproperty[])
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
	//    7   15:getfield        #109 <Field int _paramsSeen>
	//    8   18:istore_2        
				int j1 = _creatorParameters.length;
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field Object[] _creatorParameters>
	//   11   23:arraylength     
	//   12   24:istore          4
				for(int l = 0; l < j1;)
	//*  13   26:iconst_0        
	//*  14   27:istore_3        
	//*  15   28:iload_3         
	//*  16   29:iload           4
	//*  17   31:icmpge          106
				{
					if((i & 1) == 0)
	//*  18   34:iload_2         
	//*  19   35:iconst_1        
	//*  20   36:iand            
	//*  21   37:ifne            53
						_creatorParameters[l] = _findMissing(asettablebeanproperty[l]);
	//   22   40:aload_0         
	//   23   41:getfield        #36  <Field Object[] _creatorParameters>
	//   24   44:iload_3         
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:aaload          
	//   29   49:invokevirtual   #148 <Method Object _findMissing(SettableBeanProperty)>
	//   30   52:aastore         
					l++;
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
				int i1 = _creatorParameters.length;
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
	//   49   77:invokevirtual   #152 <Method int BitSet.nextClearBit(int)>
	//   50   80:istore_2        
					if(j >= i1)
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
	//   61   95:invokevirtual   #148 <Method Object _findMissing(SettableBeanProperty)>
	//   62   98:aastore         
					j++;
	//   63   99:iload_2         
	//   64  100:iconst_1        
	//   65  101:iadd            
	//   66  102:istore_2        
				} while(true);
	//   67  103:goto            72
			}
		if(_context.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES))
	//*  68  106:aload_0         
	//*  69  107:getfield        #30  <Field DeserializationContext _context>
	//*  70  110:getstatic       #155 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES>
	//*  71  113:invokevirtual   #92  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  72  116:ifeq            187
		{
			for(int k = 0; k < asettablebeanproperty.length; k++)
	//*  73  119:iconst_0        
	//*  74  120:istore_2        
	//*  75  121:iload_2         
	//*  76  122:aload_1         
	//*  77  123:arraylength     
	//*  78  124:icmpge          187
				if(_creatorParameters[k] == null)
	//*  79  127:aload_0         
	//*  80  128:getfield        #36  <Field Object[] _creatorParameters>
	//*  81  131:iload_2         
	//*  82  132:aaload          
	//*  83  133:ifnonnull       180
				{
					SettableBeanProperty settablebeanproperty = asettablebeanproperty[k];
	//   84  136:aload_1         
	//   85  137:iload_2         
	//   86  138:aaload          
	//   87  139:astore          5
					_context.reportInputMismatch(settablebeanproperty.getType(), "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS` enabled", new Object[] {
						settablebeanproperty.getName(), Integer.valueOf(asettablebeanproperty[k].getCreatorIndex())
					});
	//   88  141:aload_0         
	//   89  142:getfield        #30  <Field DeserializationContext _context>
	//   90  145:aload           5
	//   91  147:invokevirtual   #159 <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//   92  150:ldc1            #161 <String "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS` enabled">
	//   93  152:iconst_2        
	//   94  153:anewarray       Object[]
	//   95  156:dup             
	//   96  157:iconst_0        
	//   97  158:aload           5
	//   98  160:invokevirtual   #68  <Method String SettableBeanProperty.getName()>
	//   99  163:aastore         
	//  100  164:dup             
	//  101  165:iconst_1        
	//  102  166:aload_1         
	//  103  167:iload_2         
	//  104  168:aaload          
	//  105  169:invokevirtual   #72  <Method int SettableBeanProperty.getCreatorIndex()>
	//  106  172:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//  107  175:aastore         
	//  108  176:invokevirtual   #164 <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.JavaType, String, Object[])>
	//  109  179:pop             
				}

	//  110  180:iload_2         
	//  111  181:iconst_1        
	//  112  182:iadd            
	//  113  183:istore_2        
		}
	//* 114  184:goto            121
		return _creatorParameters;
	//  115  187:aload_0         
	//  116  188:getfield        #36  <Field Object[] _creatorParameters>
	//  117  191:areturn         
	}

	public Object handleIdValue(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		ObjectIdReader objectidreader = _objectIdReader;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//    2    4:astore_3        
		if(objectidreader != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          70
		{
			Object obj1 = _idValue;
	//    5    9:aload_0         
	//    6   10:getfield        #111 <Field Object _idValue>
	//    7   13:astore          4
			if(obj1 != null)
	//*   8   15:aload           4
	//*   9   17:ifnull          63
			{
				deserializationcontext.findObjectId(obj1, objectidreader.generator, _objectIdReader.resolver).bindItem(obj);
	//   10   20:aload_1         
	//   11   21:aload           4
	//   12   23:aload_3         
	//   13   24:getfield        #174 <Field com.fasterxml.jackson.annotation.ObjectIdGenerator ObjectIdReader.generator>
	//   14   27:aload_0         
	//   15   28:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//   16   31:getfield        #178 <Field com.fasterxml.jackson.annotation.ObjectIdResolver ObjectIdReader.resolver>
	//   17   34:invokevirtual   #182 <Method ReadableObjectId DeserializationContext.findObjectId(Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)>
	//   18   37:aload_2         
	//   19   38:invokevirtual   #188 <Method void ReadableObjectId.bindItem(Object)>
				deserializationcontext = ((DeserializationContext) (_objectIdReader.idProperty));
	//   20   41:aload_0         
	//   21   42:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//   22   45:getfield        #192 <Field SettableBeanProperty ObjectIdReader.idProperty>
	//   23   48:astore_1        
				if(deserializationcontext != null)
	//*  24   49:aload_1         
	//*  25   50:ifnull          70
					return ((SettableBeanProperty) (deserializationcontext)).setAndReturn(obj, _idValue);
	//   26   53:aload_1         
	//   27   54:aload_2         
	//   28   55:aload_0         
	//   29   56:getfield        #111 <Field Object _idValue>
	//   30   59:invokevirtual   #196 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   31   62:areturn         
			} else
			{
				deserializationcontext.reportUnresolvedObjectId(objectidreader, obj);
	//   32   63:aload_1         
	//   33   64:aload_3         
	//   34   65:aload_2         
	//   35   66:invokevirtual   #200 <Method Object DeserializationContext.reportUnresolvedObjectId(ObjectIdReader, Object)>
	//   36   69:pop             
			}
		}
		return obj;
	//   37   70:aload_2         
	//   38   71:areturn         
	}

	public boolean readIdProperty(String s)
		throws IOException
	{
		ObjectIdReader objectidreader = _objectIdReader;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//    2    4:astore_2        
		if(objectidreader != null && s.equals(((Object) (objectidreader.propertyName.getSimpleName()))))
	//*   3    5:aload_2         
	//*   4    6:ifnull          44
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:getfield        #206 <Field PropertyName ObjectIdReader.propertyName>
	//*   8   14:invokevirtual   #211 <Method String PropertyName.getSimpleName()>
	//*   9   17:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  10   20:ifeq            44
		{
			_idValue = _objectIdReader.readObjectReference(_parser, _context);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #34  <Field ObjectIdReader _objectIdReader>
	//   14   28:aload_0         
	//   15   29:getfield        #28  <Field JsonParser _parser>
	//   16   32:aload_0         
	//   17   33:getfield        #30  <Field DeserializationContext _context>
	//   18   36:invokevirtual   #221 <Method Object ObjectIdReader.readObjectReference(JsonParser, DeserializationContext)>
	//   19   39:putfield        #111 <Field Object _idValue>
			return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
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
