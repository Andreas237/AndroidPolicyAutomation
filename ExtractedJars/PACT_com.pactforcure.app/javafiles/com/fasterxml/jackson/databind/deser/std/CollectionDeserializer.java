// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ContainerDeserializerBase

public class CollectionDeserializer extends ContainerDeserializerBase
	implements ContextualDeserializer
{
	private static final class CollectionReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
	{

		public void handleResolvedForwardReference(Object obj, Object obj1)
			throws IOException
		{
			_parent.resolveForwardReference(obj, obj1);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CollectionDeserializer$CollectionReferringAccumulator _parent>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #38  <Method void CollectionDeserializer$CollectionReferringAccumulator.resolveForwardReference(Object, Object)>
		//    5    9:return          
		}

		private final CollectionReferringAccumulator _parent;
		public final List next = new ArrayList();

		CollectionReferring(CollectionReferringAccumulator collectionreferringaccumulator, UnresolvedForwardReference unresolvedforwardreference, Class class1)
		{
			super(unresolvedforwardreference, class1);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokespecial   #17  <Method void com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring(UnresolvedForwardReference, Class)>
		//    4    6:aload_0         
		//    5    7:new             #19  <Class ArrayList>
		//    6   10:dup             
		//    7   11:invokespecial   #22  <Method void ArrayList()>
		//    8   14:putfield        #24  <Field List next>
			_parent = collectionreferringaccumulator;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:putfield        #26  <Field CollectionDeserializer$CollectionReferringAccumulator _parent>
		//   12   22:return          
		}
	}

	public static final class CollectionReferringAccumulator
	{

		public void add(Object obj)
		{
			if(_accumulator.isEmpty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List _accumulator>
		//*   2    4:invokeinterface #41  <Method boolean List.isEmpty()>
		//*   3    9:ifeq            24
			{
				_result.add(obj);
		//    4   12:aload_0         
		//    5   13:getfield        #30  <Field Collection _result>
		//    6   16:aload_1         
		//    7   17:invokeinterface #46  <Method boolean Collection.add(Object)>
		//    8   22:pop             
				return;
		//    9   23:return          
			} else
			{
				((CollectionReferring)_accumulator.get(_accumulator.size() - 1)).next.add(obj);
		//   10   24:aload_0         
		//   11   25:getfield        #26  <Field List _accumulator>
		//   12   28:aload_0         
		//   13   29:getfield        #26  <Field List _accumulator>
		//   14   32:invokeinterface #50  <Method int List.size()>
		//   15   37:iconst_1        
		//   16   38:isub            
		//   17   39:invokeinterface #54  <Method Object List.get(int)>
		//   18   44:checkcast       #56  <Class CollectionDeserializer$CollectionReferring>
		//   19   47:getfield        #59  <Field List CollectionDeserializer$CollectionReferring.next>
		//   20   50:aload_1         
		//   21   51:invokeinterface #60  <Method boolean List.add(Object)>
		//   22   56:pop             
				return;
		//   23   57:return          
			}
		}

		public com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedforwardreference)
		{
			unresolvedforwardreference = ((UnresolvedForwardReference) (new CollectionReferring(this, unresolvedforwardreference, _elementType)));
		//    0    0:new             #56  <Class CollectionDeserializer$CollectionReferring>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_0         
		//    5    7:getfield        #28  <Field Class _elementType>
		//    6   10:invokespecial   #65  <Method void CollectionDeserializer$CollectionReferring(CollectionDeserializer$CollectionReferringAccumulator, UnresolvedForwardReference, Class)>
		//    7   13:astore_1        
			_accumulator.add(((Object) (unresolvedforwardreference)));
		//    8   14:aload_0         
		//    9   15:getfield        #26  <Field List _accumulator>
		//   10   18:aload_1         
		//   11   19:invokeinterface #60  <Method boolean List.add(Object)>
		//   12   24:pop             
			return ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (unresolvedforwardreference));
		//   13   25:aload_1         
		//   14   26:areturn         
		}

		public void resolveForwardReference(Object obj, Object obj1)
			throws IOException
		{
			Iterator iterator = _accumulator.iterator();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List _accumulator>
		//    2    4:invokeinterface #73  <Method Iterator List.iterator()>
		//    3    9:astore          4
			CollectionReferring collectionreferring;
			for(Object obj2 = ((Object) (_result)); iterator.hasNext(); obj2 = ((Object) (collectionreferring.next)))
		//*   4   11:aload_0         
		//*   5   12:getfield        #30  <Field Collection _result>
		//*   6   15:astore_3        
		//*   7   16:aload           4
		//*   8   18:invokeinterface #78  <Method boolean Iterator.hasNext()>
		//*   9   23:ifeq            84
			{
				collectionreferring = (CollectionReferring)iterator.next();
		//   10   26:aload           4
		//   11   28:invokeinterface #81  <Method Object Iterator.next()>
		//   12   33:checkcast       #56  <Class CollectionDeserializer$CollectionReferring>
		//   13   36:astore          5
				if(collectionreferring.hasId(obj))
		//*  14   38:aload           5
		//*  15   40:aload_1         
		//*  16   41:invokevirtual   #84  <Method boolean CollectionDeserializer$CollectionReferring.hasId(Object)>
		//*  17   44:ifeq            75
				{
					iterator.remove();
		//   18   47:aload           4
		//   19   49:invokeinterface #87  <Method void Iterator.remove()>
					((Collection) (obj2)).add(obj1);
		//   20   54:aload_3         
		//   21   55:aload_2         
		//   22   56:invokeinterface #46  <Method boolean Collection.add(Object)>
		//   23   61:pop             
					((Collection) (obj2)).addAll(((Collection) (collectionreferring.next)));
		//   24   62:aload_3         
		//   25   63:aload           5
		//   26   65:getfield        #59  <Field List CollectionDeserializer$CollectionReferring.next>
		//   27   68:invokeinterface #91  <Method boolean Collection.addAll(Collection)>
		//   28   73:pop             
					return;
		//   29   74:return          
				}
			}

		//   30   75:aload           5
		//   31   77:getfield        #59  <Field List CollectionDeserializer$CollectionReferring.next>
		//   32   80:astore_3        
		//*  33   81:goto            16
			throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
		//   34   84:new             #93  <Class IllegalArgumentException>
		//   35   87:dup             
		//   36   88:new             #95  <Class StringBuilder>
		//   37   91:dup             
		//   38   92:invokespecial   #96  <Method void StringBuilder()>
		//   39   95:ldc1            #98  <String "Trying to resolve a forward reference with id [">
		//   40   97:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
		//   41  100:aload_1         
		//   42  101:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
		//   43  104:ldc1            #107 <String "] that wasn't previously seen as unresolved.">
		//   44  106:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
		//   45  109:invokevirtual   #111 <Method String StringBuilder.toString()>
		//   46  112:invokespecial   #114 <Method void IllegalArgumentException(String)>
		//   47  115:athrow          
		}

		private List _accumulator;
		private final Class _elementType;
		private final Collection _result;

		public CollectionReferringAccumulator(Class class1, Collection collection)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			_accumulator = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #23  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #24  <Method void ArrayList()>
		//    6   12:putfield        #26  <Field List _accumulator>
			_elementType = class1;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #28  <Field Class _elementType>
			_result = collection;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #30  <Field Collection _result>
		//   13   25:return          
		}
	}


	public CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator)
	{
		this(javatype, jsondeserializer, typedeserializer, valueinstantiator, ((JsonDeserializer) (null)), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokespecial   #35  <Method void CollectionDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, Boolean)>
	//    8   11:return          
	}

	protected CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer1, Boolean boolean1)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void ContainerDeserializerBase(JavaType)>
		_collectionType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #43  <Field JavaType _collectionType>
		_valueDeserializer = jsondeserializer;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #45  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
		_valueInstantiator = valueinstantiator;
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:putfield        #49  <Field ValueInstantiator _valueInstantiator>
		_delegateDeserializer = jsondeserializer1;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #51  <Field JsonDeserializer _delegateDeserializer>
		_unwrapSingle = boolean1;
	//   18   32:aload_0         
	//   19   33:aload           6
	//   20   35:putfield        #53  <Field Boolean _unwrapSingle>
	//   21   38:return          
	}

	protected CollectionDeserializer(CollectionDeserializer collectiondeserializer)
	{
		super(collectiondeserializer._collectionType);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #43  <Field JavaType _collectionType>
	//    3    5:invokespecial   #41  <Method void ContainerDeserializerBase(JavaType)>
		_collectionType = collectiondeserializer._collectionType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #43  <Field JavaType _collectionType>
	//    7   13:putfield        #43  <Field JavaType _collectionType>
		_valueDeserializer = collectiondeserializer._valueDeserializer;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #45  <Field JsonDeserializer _valueDeserializer>
	//   11   21:putfield        #45  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = collectiondeserializer._valueTypeDeserializer;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
	//   15   29:putfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
		_valueInstantiator = collectiondeserializer._valueInstantiator;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//   19   37:putfield        #49  <Field ValueInstantiator _valueInstantiator>
		_delegateDeserializer = collectiondeserializer._delegateDeserializer;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #51  <Field JsonDeserializer _delegateDeserializer>
	//   23   45:putfield        #51  <Field JsonDeserializer _delegateDeserializer>
		_unwrapSingle = collectiondeserializer._unwrapSingle;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #53  <Field Boolean _unwrapSingle>
	//   27   53:putfield        #53  <Field Boolean _unwrapSingle>
	//   28   56:return          
	}

	public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return ((JsonDeserializer) (createContextual(deserializationcontext, beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #62  <Method CollectionDeserializer createContextual(DeserializationContext, BeanProperty)>
	//    4    6:areturn         
	}

	public CollectionDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Object obj = obj1;
	//    2    3:aload           4
	//    3    5:astore_3        
		if(_valueInstantiator != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//*   6   10:ifnull          103
		{
			obj = obj1;
	//    7   13:aload           4
	//    8   15:astore_3        
			if(_valueInstantiator.canCreateUsingDelegate())
	//*   9   16:aload_0         
	//*  10   17:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//*  11   20:invokevirtual   #69  <Method boolean ValueInstantiator.canCreateUsingDelegate()>
	//*  12   23:ifeq            103
			{
				obj = ((Object) (_valueInstantiator.getDelegateType(deserializationcontext.getConfig())));
	//   13   26:aload_0         
	//   14   27:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #75  <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   17   34:invokevirtual   #79  <Method JavaType ValueInstantiator.getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   18   37:astore_3        
				if(obj == null)
	//*  19   38:aload_3         
	//*  20   39:ifnonnull       95
					throw new IllegalArgumentException((new StringBuilder()).append("Invalid delegate-creator definition for ").append(((Object) (_collectionType))).append(": value instantiator (").append(((Object) (_valueInstantiator)).getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
	//   21   42:new             #81  <Class IllegalArgumentException>
	//   22   45:dup             
	//   23   46:new             #83  <Class StringBuilder>
	//   24   49:dup             
	//   25   50:invokespecial   #86  <Method void StringBuilder()>
	//   26   53:ldc1            #88  <String "Invalid delegate-creator definition for ">
	//   27   55:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:aload_0         
	//   29   59:getfield        #43  <Field JavaType _collectionType>
	//   30   62:invokevirtual   #95  <Method StringBuilder StringBuilder.append(Object)>
	//   31   65:ldc1            #97  <String ": value instantiator (">
	//   32   67:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   33   70:aload_0         
	//   34   71:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//   35   74:invokevirtual   #103 <Method Class Object.getClass()>
	//   36   77:invokevirtual   #109 <Method String Class.getName()>
	//   37   80:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:ldc1            #111 <String ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'">
	//   39   85:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   40   88:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   41   91:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   42   94:athrow          
				obj = ((Object) (findDeserializer(deserializationcontext, ((JavaType) (obj)), beanproperty)));
	//   43   95:aload_0         
	//   44   96:aload_1         
	//   45   97:aload_3         
	//   46   98:aload_2         
	//   47   99:invokevirtual   #121 <Method JsonDeserializer findDeserializer(DeserializationContext, JavaType, BeanProperty)>
	//   48  102:astore_3        
			}
		}
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, java/util/Collection, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//   49  103:aload_0         
	//   50  104:aload_1         
	//   51  105:aload_2         
	//   52  106:ldc1            #123 <Class Collection>
	//   53  108:getstatic       #129 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   54  111:invokevirtual   #133 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   55  114:astore          6
		obj1 = ((Object) (findConvertingContentDeserializer(deserializationcontext, beanproperty, _valueDeserializer)));
	//   56  116:aload_0         
	//   57  117:aload_1         
	//   58  118:aload_2         
	//   59  119:aload_0         
	//   60  120:getfield        #45  <Field JsonDeserializer _valueDeserializer>
	//   61  123:invokevirtual   #137 <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   62  126:astore          4
		Object obj2 = ((Object) (_collectionType.getContentType()));
	//   63  128:aload_0         
	//   64  129:getfield        #43  <Field JavaType _collectionType>
	//   65  132:invokevirtual   #143 <Method JavaType JavaType.getContentType()>
	//   66  135:astore          5
		if(obj1 == null)
	//*  67  137:aload           4
	//*  68  139:ifnonnull       184
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj2)), beanproperty)));
	//   69  142:aload_1         
	//   70  143:aload           5
	//   71  145:aload_2         
	//   72  146:invokevirtual   #147 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   73  149:astore_1        
		else
	//*  74  150:aload_0         
	//*  75  151:getfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
	//*  76  154:astore          5
	//*  77  156:aload           5
	//*  78  158:astore          4
	//*  79  160:aload           5
	//*  80  162:ifnull          173
	//*  81  165:aload           5
	//*  82  167:aload_2         
	//*  83  168:invokevirtual   #153 <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//*  84  171:astore          4
	//*  85  173:aload_0         
	//*  86  174:aload_3         
	//*  87  175:aload_1         
	//*  88  176:aload           4
	//*  89  178:aload           6
	//*  90  180:invokevirtual   #157 <Method CollectionDeserializer withResolved(JsonDeserializer, JsonDeserializer, TypeDeserializer, Boolean)>
	//*  91  183:areturn         
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj1)), beanproperty, ((JavaType) (obj2)))));
	//   92  184:aload_1         
	//   93  185:aload           4
	//   94  187:aload_2         
	//   95  188:aload           5
	//   96  190:invokevirtual   #161 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   97  193:astore_1        
		obj2 = ((Object) (_valueTypeDeserializer));
		obj1 = obj2;
		if(obj2 != null)
			obj1 = ((Object) (((TypeDeserializer) (obj2)).forProperty(beanproperty)));
		return withResolved(((JsonDeserializer) (obj)), ((JsonDeserializer) (deserializationcontext)), ((TypeDeserializer) (obj1)), boolean1);
	//*  98  194:goto            150
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #170 <Method Collection deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (Collection)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #123 <Class Collection>
	//    5    7:invokevirtual   #174 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//    6   10:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_delegateDeserializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field JsonDeserializer _delegateDeserializer>
	//*   2    4:ifnull          28
			return (Collection)_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field JsonDeserializer _delegateDeserializer>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #178 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   11   21:invokevirtual   #182 <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   12   24:checkcast       #123 <Class Collection>
	//   13   27:areturn         
		if(jsonparser.hasToken(JsonToken.VALUE_STRING))
	//*  14   28:aload_1         
	//*  15   29:getstatic       #188 <Field JsonToken JsonToken.VALUE_STRING>
	//*  16   32:invokevirtual   #194 <Method boolean JsonParser.hasToken(JsonToken)>
	//*  17   35:ifeq            63
		{
			String s = jsonparser.getText();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #197 <Method String JsonParser.getText()>
	//   20   42:astore_3        
			if(s.length() == 0)
	//*  21   43:aload_3         
	//*  22   44:invokevirtual   #203 <Method int String.length()>
	//*  23   47:ifne            63
				return (Collection)_valueInstantiator.createFromString(deserializationcontext, s);
	//   24   50:aload_0         
	//   25   51:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #207 <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//   29   59:checkcast       #123 <Class Collection>
	//   30   62:areturn         
		}
		return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault(deserializationcontext));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:aload_0         
	//   35   67:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//   36   70:aload_2         
	//   37   71:invokevirtual   #211 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   38   74:checkcast       #123 <Class Collection>
	//   39   77:invokevirtual   #174 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//   40   80:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		if(jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #219 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//    2    4:ifne            19
_L1:
		Object obj = ((Object) (handleNonArray(jsonparser, deserializationcontext, collection)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #222 <Method Collection handleNonArray(JsonParser, DeserializationContext, Collection)>
	//    8   14:astore          5
_L4:
		return ((Collection) (obj));
	//    9   16:aload           5
	//   10   18:areturn         
_L2:
		CollectionReferringAccumulator collectionreferringaccumulator;
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		jsonparser.setCurrentValue(((Object) (collection)));
	//   11   19:aload_1         
	//   12   20:aload_3         
	//   13   21:invokevirtual   #226 <Method void JsonParser.setCurrentValue(Object)>
		jsondeserializer = _valueDeserializer;
	//   14   24:aload_0         
	//   15   25:getfield        #45  <Field JsonDeserializer _valueDeserializer>
	//   16   28:astore          7
		typedeserializer = _valueTypeDeserializer;
	//   17   30:aload_0         
	//   18   31:getfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
	//   19   34:astore          8
		JsonToken jsontoken;
		if(jsondeserializer.getObjectIdReader() == null)
	//*  20   36:aload           7
	//*  21   38:invokevirtual   #230 <Method com.fasterxml.jackson.databind.deser.impl.ObjectIdReader JsonDeserializer.getObjectIdReader()>
	//*  22   41:ifnonnull       111
			collectionreferringaccumulator = null;
	//   23   44:aconst_null     
	//   24   45:astore          6
		else
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #234 <Method JsonToken JsonParser.nextToken()>
	//*  27   51:astore          9
	//*  28   53:aload_3         
	//*  29   54:astore          5
	//*  30   56:aload           9
	//*  31   58:getstatic       #237 <Field JsonToken JsonToken.END_ARRAY>
	//*  32   61:if_acmpeq       16
	//*  33   64:aload           9
	//*  34   66:getstatic       #240 <Field JsonToken JsonToken.VALUE_NULL>
	//*  35   69:if_acmpne       134
	//*  36   72:aload           7
	//*  37   74:aload_2         
	//*  38   75:invokevirtual   #243 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//*  39   78:astore          5
	//*  40   80:aload           6
	//*  41   82:ifnull          165
	//*  42   85:aload           6
	//*  43   87:aload           5
	//*  44   89:invokevirtual   #246 <Method void CollectionDeserializer$CollectionReferringAccumulator.add(Object)>
	//*  45   92:goto            47
	//*  46   95:astore          5
	//*  47   97:aload           6
	//*  48   99:ifnonnull       212
	//*  49  102:aload_1         
	//*  50  103:ldc1            #248 <String "Unresolved forward reference but no identity info">
	//*  51  105:aload           5
	//*  52  107:invokestatic    #252 <Method JsonMappingException JsonMappingException.from(JsonParser, String, Throwable)>
	//*  53  110:athrow          
			collectionreferringaccumulator = new CollectionReferringAccumulator(_collectionType.getContentType().getRawClass(), collection);
	//   54  111:new             #12  <Class CollectionDeserializer$CollectionReferringAccumulator>
	//   55  114:dup             
	//   56  115:aload_0         
	//   57  116:getfield        #43  <Field JavaType _collectionType>
	//   58  119:invokevirtual   #143 <Method JavaType JavaType.getContentType()>
	//   59  122:invokevirtual   #255 <Method Class JavaType.getRawClass()>
	//   60  125:aload_3         
	//   61  126:invokespecial   #258 <Method void CollectionDeserializer$CollectionReferringAccumulator(Class, Collection)>
	//   62  129:astore          6
_L8:
		jsontoken = jsonparser.nextToken();
		obj = ((Object) (collection));
		if(jsontoken == JsonToken.END_ARRAY) goto _L4; else goto _L3
_L3:
		if(jsontoken != JsonToken.VALUE_NULL) goto _L6; else goto _L5
_L5:
		obj = jsondeserializer.getNullValue(deserializationcontext);
_L7:
		if(collectionreferringaccumulator == null)
			break MISSING_BLOCK_LABEL_165;
		try
		{
			collectionreferringaccumulator.add(obj);
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			if(collectionreferringaccumulator == null)
				throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info", ((Throwable) (obj)));
			break MISSING_BLOCK_LABEL_212;
		}
	//*  63  131:goto            47
	//*  64  134:aload           8
	//*  65  136:ifnonnull       151
	//*  66  139:aload           7
	//*  67  141:aload_1         
	//*  68  142:aload_2         
	//*  69  143:invokevirtual   #178 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  70  146:astore          5
	//*  71  148:goto            80
	//*  72  151:aload           7
	//*  73  153:aload_1         
	//*  74  154:aload_2         
	//*  75  155:aload           8
	//*  76  157:invokevirtual   #262 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  77  160:astore          5
	//*  78  162:goto            80
	//*  79  165:aload_3         
	//*  80  166:aload           5
	//*  81  168:invokeinterface #265 <Method boolean Collection.add(Object)>
	//*  82  173:pop             
	//*  83  174:goto            47
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  84  177:astore_1        
		{
			boolean flag;
			com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring referring;
			if(deserializationcontext == null || deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
	//*  85  178:aload_2         
	//*  86  179:ifnull          192
	//*  87  182:aload_2         
	//*  88  183:getstatic       #271 <Field DeserializationFeature DeserializationFeature.WRAP_EXCEPTIONS>
	//*  89  186:invokevirtual   #275 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  90  189:ifeq            234
				flag = true;
	//   91  192:iconst_1        
	//   92  193:istore          4
			else
	//*  93  195:iload           4
	//*  94  197:ifne            240
	//*  95  200:aload_1         
	//*  96  201:instanceof      #277 <Class RuntimeException>
	//*  97  204:ifeq            240
	//*  98  207:aload_1         
	//*  99  208:checkcast       #277 <Class RuntimeException>
	//* 100  211:athrow          
	//* 101  212:aload           6
	//* 102  214:aload           5
	//* 103  216:invokevirtual   #281 <Method com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring CollectionDeserializer$CollectionReferringAccumulator.handleUnresolvedReference(UnresolvedForwardReference)>
	//* 104  219:astore          9
	//* 105  221:aload           5
	//* 106  223:invokevirtual   #285 <Method ReadableObjectId UnresolvedForwardReference.getRoid()>
	//* 107  226:aload           9
	//* 108  228:invokevirtual   #291 <Method void ReadableObjectId.appendReferring(com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring)>
	//* 109  231:goto            47
				flag = false;
	//  110  234:iconst_0        
	//  111  235:istore          4
			if(!flag && (jsonparser instanceof RuntimeException))
				throw (RuntimeException)jsonparser;
			break MISSING_BLOCK_LABEL_240;
	//  112  237:goto            195
		}
		break MISSING_BLOCK_LABEL_47;
_L6:
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_151;
		obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
		  goto _L7
		obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		  goto _L7
		collection.add(obj);
		  goto _L8
		referring = collectionreferringaccumulator.handleUnresolvedReference(((UnresolvedForwardReference) (obj)));
		((UnresolvedForwardReference) (obj)).getRoid().appendReferring(referring);
		  goto _L8
		throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (collection)), collection.size());
	//  113  240:aload_1         
	//  114  241:aload_3         
	//  115  242:aload_3         
	//  116  243:invokeinterface #294 <Method int Collection.size()>
	//  117  248:invokestatic    #298 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  118  251:athrow          
		  goto _L8
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #302 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _collectionType.getContentType();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field JavaType _collectionType>
	//    2    4:invokevirtual   #143 <Method JavaType JavaType.getContentType()>
	//    3    7:areturn         
	}

	protected final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		JsonToken jsontoken;
		boolean flag;
		if(_unwrapSingle == Boolean.TRUE || _unwrapSingle == null && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Boolean _unwrapSingle>
	//*   2    4:getstatic       #310 <Field Boolean Boolean.TRUE>
	//*   3    7:if_acmpeq       27
	//*   4   10:aload_0         
	//*   5   11:getfield        #53  <Field Boolean _unwrapSingle>
	//*   6   14:ifnonnull       47
	//*   7   17:aload_2         
	//*   8   18:getstatic       #312 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*   9   21:invokevirtual   #275 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  10   24:ifeq            47
			flag = true;
	//   11   27:iconst_1        
	//   12   28:istore          4
		else
	//*  13   30:iload           4
	//*  14   32:ifne            53
	//*  15   35:aload_2         
	//*  16   36:aload_0         
	//*  17   37:getfield        #43  <Field JavaType _collectionType>
	//*  18   40:invokevirtual   #255 <Method Class JavaType.getRawClass()>
	//*  19   43:invokevirtual   #316 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//*  20   46:athrow          
			flag = false;
	//   21   47:iconst_0        
	//   22   48:istore          4
		if(!flag)
			throw deserializationcontext.mappingException(_collectionType.getRawClass());
	//*  23   50:goto            30
		jsondeserializer = _valueDeserializer;
	//   24   53:aload_0         
	//   25   54:getfield        #45  <Field JsonDeserializer _valueDeserializer>
	//   26   57:astore          5
		typedeserializer = _valueTypeDeserializer;
	//   27   59:aload_0         
	//   28   60:getfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
	//   29   63:astore          6
		jsontoken = jsonparser.getCurrentToken();
	//   30   65:aload_1         
	//   31   66:invokevirtual   #319 <Method JsonToken JsonParser.getCurrentToken()>
	//   32   69:astore          7
		if(jsontoken != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//   33   71:aload           7
	//   34   73:getstatic       #240 <Field JsonToken JsonToken.VALUE_NULL>
	//   35   76:if_acmpne       96
_L1:
		jsonparser = ((JsonParser) (jsondeserializer.getNullValue(deserializationcontext)));
	//   36   79:aload           5
	//   37   81:aload_2         
	//   38   82:invokevirtual   #243 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   39   85:astore_1        
_L3:
		collection.add(((Object) (jsonparser)));
	//   40   86:aload_3         
	//   41   87:aload_1         
	//   42   88:invokeinterface #265 <Method boolean Collection.add(Object)>
	//   43   93:pop             
		return collection;
	//   44   94:aload_3         
	//   45   95:areturn         
_L2:
label0:
		{
			if(typedeserializer != null)
				break label0;
	//   46   96:aload           6
	//   47   98:ifnonnull       112
			try
			{
				jsonparser = ((JsonParser) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   48  101:aload           5
	//   49  103:aload_1         
	//   50  104:aload_2         
	//   51  105:invokevirtual   #178 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   52  108:astore_1        
			}
	//*  53  109:goto            86
	//*  54  112:aload           5
	//*  55  114:aload_1         
	//*  56  115:aload_2         
	//*  57  116:aload           6
	//*  58  118:invokevirtual   #262 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  59  121:astore_1        
	//*  60  122:goto            86
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  61  125:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), java/lang/Object, collection.size());
	//   62  126:aload_1         
	//   63  127:ldc1            #99  <Class Object>
	//   64  129:aload_3         
	//   65  130:invokeinterface #294 <Method int Collection.size()>
	//   66  135:invokestatic    #298 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   67  138:athrow          
			}
		}
		  goto _L3
		jsonparser = ((JsonParser) (jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
		  goto _L3
	}

	public boolean isCachable()
	{
		return _valueDeserializer == null && _valueTypeDeserializer == null && _delegateDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
	//    5   11:ifnonnull       23
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field JsonDeserializer _delegateDeserializer>
	//    8   18:ifnonnull       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	protected CollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer)
	{
		return withResolved(jsondeserializer, jsondeserializer1, typedeserializer, _unwrapSingle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #53  <Field Boolean _unwrapSingle>
	//    6    8:invokevirtual   #157 <Method CollectionDeserializer withResolved(JsonDeserializer, JsonDeserializer, TypeDeserializer, Boolean)>
	//    7   11:areturn         
	}

	protected CollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer, Boolean boolean1)
	{
		if(jsondeserializer == _delegateDeserializer && jsondeserializer1 == _valueDeserializer && typedeserializer == _valueTypeDeserializer && _unwrapSingle == boolean1)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #51  <Field JsonDeserializer _delegateDeserializer>
	//*   3    5:if_acmpne       35
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #45  <Field JsonDeserializer _valueDeserializer>
	//*   7   13:if_acmpne       35
	//*   8   16:aload_3         
	//*   9   17:aload_0         
	//*  10   18:getfield        #47  <Field TypeDeserializer _valueTypeDeserializer>
	//*  11   21:if_acmpne       35
	//*  12   24:aload_0         
	//*  13   25:getfield        #53  <Field Boolean _unwrapSingle>
	//*  14   28:aload           4
	//*  15   30:if_acmpne       35
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		else
			return new CollectionDeserializer(_collectionType, jsondeserializer1, typedeserializer, _valueInstantiator, jsondeserializer, boolean1);
	//   18   35:new             #2   <Class CollectionDeserializer>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:getfield        #43  <Field JavaType _collectionType>
	//   22   43:aload_2         
	//   23   44:aload_3         
	//   24   45:aload_0         
	//   25   46:getfield        #49  <Field ValueInstantiator _valueInstantiator>
	//   26   49:aload_1         
	//   27   50:aload           4
	//   28   52:invokespecial   #35  <Method void CollectionDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, Boolean)>
	//   29   55:areturn         
	}

	private static final long serialVersionUID = -1L;
	protected final JavaType _collectionType;
	protected final JsonDeserializer _delegateDeserializer;
	protected final Boolean _unwrapSingle;
	protected final JsonDeserializer _valueDeserializer;
	protected final ValueInstantiator _valueInstantiator;
	protected final TypeDeserializer _valueTypeDeserializer;
}
