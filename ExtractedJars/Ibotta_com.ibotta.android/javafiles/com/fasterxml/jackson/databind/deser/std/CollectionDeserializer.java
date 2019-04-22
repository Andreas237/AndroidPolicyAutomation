// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
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

	public static class CollectionReferringAccumulator
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
				List list = _accumulator;
		//   10   24:aload_0         
		//   11   25:getfield        #26  <Field List _accumulator>
		//   12   28:astore_2        
				((CollectionReferring)list.get(list.size() - 1)).next.add(obj);
		//   13   29:aload_2         
		//   14   30:aload_2         
		//   15   31:invokeinterface #50  <Method int List.size()>
		//   16   36:iconst_1        
		//   17   37:isub            
		//   18   38:invokeinterface #54  <Method Object List.get(int)>
		//   19   43:checkcast       #56  <Class CollectionDeserializer$CollectionReferring>
		//   20   46:getfield        #59  <Field List CollectionDeserializer$CollectionReferring.next>
		//   21   49:aload_1         
		//   22   50:invokeinterface #60  <Method boolean List.add(Object)>
		//   23   55:pop             
				return;
		//   24   56:return          
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
			obj1 = ((Object) (new StringBuilder()));
		//   34   84:new             #93  <Class StringBuilder>
		//   35   87:dup             
		//   36   88:invokespecial   #94  <Method void StringBuilder()>
		//   37   91:astore_2        
			((StringBuilder) (obj1)).append("Trying to resolve a forward reference with id [");
		//   38   92:aload_2         
		//   39   93:ldc1            #96  <String "Trying to resolve a forward reference with id [">
		//   40   95:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   41   98:pop             
			((StringBuilder) (obj1)).append(obj);
		//   42   99:aload_2         
		//   43  100:aload_1         
		//   44  101:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
		//   45  104:pop             
			((StringBuilder) (obj1)).append("] that wasn't previously seen as unresolved.");
		//   46  105:aload_2         
		//   47  106:ldc1            #105 <String "] that wasn't previously seen as unresolved.">
		//   48  108:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   49  111:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
		//   50  112:new             #107 <Class IllegalArgumentException>
		//   51  115:dup             
		//   52  116:aload_2         
		//   53  117:invokevirtual   #111 <Method String StringBuilder.toString()>
		//   54  120:invokespecial   #114 <Method void IllegalArgumentException(String)>
		//   55  123:athrow          
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
		this(javatype, jsondeserializer, typedeserializer, valueinstantiator, ((JsonDeserializer) (null)), ((NullValueProvider) (null)), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:aconst_null     
	//    8    9:invokespecial   #31  <Method void CollectionDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, NullValueProvider, Boolean)>
	//    9   12:return          
	}

	protected CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer1, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(javatype, nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           6
	//    3    4:aload           7
	//    4    6:invokespecial   #37  <Method void ContainerDeserializerBase(JavaType, NullValueProvider, Boolean)>
		_valueDeserializer = jsondeserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field TypeDeserializer _valueTypeDeserializer>
		_valueInstantiator = valueinstantiator;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #43  <Field ValueInstantiator _valueInstantiator>
		_delegateDeserializer = jsondeserializer1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #45  <Field JsonDeserializer _delegateDeserializer>
	//   17   31:return          
	}

	protected Collection _deserializeWithObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		CollectionReferringAccumulator collectionreferringaccumulator;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #60  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            15
			return handleNonArray(jsonparser, deserializationcontext, collection);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #63  <Method Collection handleNonArray(JsonParser, DeserializationContext, Collection)>
	//    8   14:areturn         
		jsonparser.setCurrentValue(((Object) (collection)));
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #67  <Method void JsonParser.setCurrentValue(Object)>
		jsondeserializer = _valueDeserializer;
	//   12   20:aload_0         
	//   13   21:getfield        #39  <Field JsonDeserializer _valueDeserializer>
	//   14   24:astore          6
		typedeserializer = _valueTypeDeserializer;
	//   15   26:aload_0         
	//   16   27:getfield        #41  <Field TypeDeserializer _valueTypeDeserializer>
	//   17   30:astore          7
		collectionreferringaccumulator = new CollectionReferringAccumulator(_containerType.getContentType().getRawClass(), collection);
	//   18   32:new             #12  <Class CollectionDeserializer$CollectionReferringAccumulator>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #71  <Field JavaType _containerType>
	//   22   40:invokevirtual   #77  <Method JavaType JavaType.getContentType()>
	//   23   43:invokevirtual   #81  <Method Class JavaType.getRawClass()>
	//   24   46:aload_3         
	//   25   47:invokespecial   #84  <Method void CollectionDeserializer$CollectionReferringAccumulator(Class, Collection)>
	//   26   50:astore          8
_L2:
		JsonToken jsontoken;
		jsontoken = jsonparser.nextToken();
	//   27   52:aload_1         
	//   28   53:invokevirtual   #88  <Method JsonToken JsonParser.nextToken()>
	//   29   56:astore          5
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   30   58:aload           5
	//   31   60:getstatic       #94  <Field JsonToken JsonToken.END_ARRAY>
	//   32   63:if_acmpeq       210
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  33   66:aload           5
	//*  34   68:getstatic       #97  <Field JsonToken JsonToken.VALUE_NULL>
	//*  35   71:if_acmpne       99
		{
			if(_skipNullValues)
	//*  36   74:aload_0         
	//*  37   75:getfield        #101 <Field boolean _skipNullValues>
	//*  38   78:ifeq            84
				continue; /* Loop/switch isn't completed */
	//   39   81:goto            52
			Object obj;
			try
			{
				obj = _nullProvider.getNullValue(deserializationcontext);
	//   40   84:aload_0         
	//   41   85:getfield        #105 <Field NullValueProvider _nullProvider>
	//   42   88:aload_2         
	//   43   89:invokeinterface #111 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   44   94:astore          5
				break MISSING_BLOCK_LABEL_127;
	//   45   96:goto            127
			}
	//*  46   99:aload           7
	//*  47  101:ifnonnull       116
	//*  48  104:aload           6
	//*  49  106:aload_1         
	//*  50  107:aload_2         
	//*  51  108:invokevirtual   #117 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  52  111:astore          5
	//*  53  113:goto            127
	//*  54  116:aload           6
	//*  55  118:aload_1         
	//*  56  119:aload_2         
	//*  57  120:aload           7
	//*  58  122:invokevirtual   #121 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  59  125:astore          5
	//*  60  127:aload           8
	//*  61  129:aload           5
	//*  62  131:invokevirtual   #124 <Method void CollectionDeserializer$CollectionReferringAccumulator.add(Object)>
	//*  63  134:goto            52
	//*  64  137:astore_1        
	//*  65  138:aload_2         
	//*  66  139:ifnull          161
	//*  67  142:aload_2         
	//*  68  143:getstatic       #130 <Field DeserializationFeature DeserializationFeature.WRAP_EXCEPTIONS>
	//*  69  146:invokevirtual   #136 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  70  149:ifeq            155
	//*  71  152:goto            161
	//*  72  155:iconst_0        
	//*  73  156:istore          4
	//*  74  158:goto            164
	//*  75  161:iconst_1        
	//*  76  162:istore          4
	//*  77  164:iload           4
	//*  78  166:ifne            174
	//*  79  169:aload_1         
	//*  80  170:invokestatic    #142 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//*  81  173:pop             
	//*  82  174:aload_1         
	//*  83  175:aload_3         
	//*  84  176:aload_3         
	//*  85  177:invokeinterface #148 <Method int Collection.size()>
	//*  86  182:invokestatic    #154 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//*  87  185:athrow          
			catch(UnresolvedForwardReference unresolvedforwardreference)
	//*  88  186:astore          5
			{
				com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring referring = collectionreferringaccumulator.handleUnresolvedReference(unresolvedforwardreference);
	//   89  188:aload           8
	//   90  190:aload           5
	//   91  192:invokevirtual   #158 <Method com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring CollectionDeserializer$CollectionReferringAccumulator.handleUnresolvedReference(UnresolvedForwardReference)>
	//   92  195:astore          9
				unresolvedforwardreference.getRoid().appendReferring(referring);
	//   93  197:aload           5
	//   94  199:invokevirtual   #162 <Method ReadableObjectId UnresolvedForwardReference.getRoid()>
	//   95  202:aload           9
	//   96  204:invokevirtual   #168 <Method void ReadableObjectId.appendReferring(com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring)>
			}
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
			{
				boolean flag;
				if(deserializationcontext != null && !deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
					flag = false;
				else
					flag = true;
				if(!flag)
					ClassUtil.throwIfRTE(((Throwable) (jsonparser)));
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (collection)), collection.size());
			}
			continue; /* Loop/switch isn't completed */
	//   97  207:goto            52
		}
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_116;
		obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
		break MISSING_BLOCK_LABEL_127;
		obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		collectionreferringaccumulator.add(obj);
		continue; /* Loop/switch isn't completed */
		if(true) goto _L2; else goto _L1
_L1:
		return collection;
	//   98  210:aload_3         
	//   99  211:areturn         
	}

	public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return ((JsonDeserializer) (createContextual(deserializationcontext, beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #175 <Method CollectionDeserializer createContextual(DeserializationContext, BeanProperty)>
	//    4    6:areturn         
	}

	public CollectionDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj;
label0:
		{
			obj = ((Object) (_valueInstantiator));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//    2    4:astore_3        
			if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          156
			{
				if(((ValueInstantiator) (obj)).canCreateUsingDelegate())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #180 <Method boolean ValueInstantiator.canCreateUsingDelegate()>
	//*   7   13:ifeq            81
				{
					obj = ((Object) (_valueInstantiator.getDelegateType(deserializationcontext.getConfig())));
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #184 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   12   24:invokevirtual   #188 <Method JavaType ValueInstantiator.getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   13   27:astore_3        
					if(obj == null)
	//*  14   28:aload_3         
	//*  15   29:ifnonnull       70
						deserializationcontext.reportBadDefinition(_containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[] {
							_containerType, ((Object) (_valueInstantiator)).getClass().getName()
						}));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #71  <Field JavaType _containerType>
	//   19   37:ldc1            #190 <String "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'">
	//   20   39:iconst_2        
	//   21   40:anewarray       Object[]
	//   22   43:dup             
	//   23   44:iconst_0        
	//   24   45:aload_0         
	//   25   46:getfield        #71  <Field JavaType _containerType>
	//   26   49:aastore         
	//   27   50:dup             
	//   28   51:iconst_1        
	//   29   52:aload_0         
	//   30   53:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//   31   56:invokevirtual   #195 <Method Class Object.getClass()>
	//   32   59:invokevirtual   #201 <Method String Class.getName()>
	//   33   62:aastore         
	//   34   63:invokestatic    #207 <Method String String.format(String, Object[])>
	//   35   66:invokevirtual   #211 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   36   69:pop             
					obj = ((Object) (findDeserializer(deserializationcontext, ((JavaType) (obj)), beanproperty)));
	//   37   70:aload_0         
	//   38   71:aload_1         
	//   39   72:aload_3         
	//   40   73:aload_2         
	//   41   74:invokevirtual   #215 <Method JsonDeserializer findDeserializer(DeserializationContext, JavaType, BeanProperty)>
	//   42   77:astore_3        
					break label0;
	//   43   78:goto            158
				}
				if(_valueInstantiator.canCreateUsingArrayDelegate())
	//*  44   81:aload_0         
	//*  45   82:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//*  46   85:invokevirtual   #218 <Method boolean ValueInstantiator.canCreateUsingArrayDelegate()>
	//*  47   88:ifeq            156
				{
					obj = ((Object) (_valueInstantiator.getArrayDelegateType(deserializationcontext.getConfig())));
	//   48   91:aload_0         
	//   49   92:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//   50   95:aload_1         
	//   51   96:invokevirtual   #184 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   52   99:invokevirtual   #221 <Method JavaType ValueInstantiator.getArrayDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   53  102:astore_3        
					if(obj == null)
	//*  54  103:aload_3         
	//*  55  104:ifnonnull       145
						deserializationcontext.reportBadDefinition(_containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[] {
							_containerType, ((Object) (_valueInstantiator)).getClass().getName()
						}));
	//   56  107:aload_1         
	//   57  108:aload_0         
	//   58  109:getfield        #71  <Field JavaType _containerType>
	//   59  112:ldc1            #223 <String "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'">
	//   60  114:iconst_2        
	//   61  115:anewarray       Object[]
	//   62  118:dup             
	//   63  119:iconst_0        
	//   64  120:aload_0         
	//   65  121:getfield        #71  <Field JavaType _containerType>
	//   66  124:aastore         
	//   67  125:dup             
	//   68  126:iconst_1        
	//   69  127:aload_0         
	//   70  128:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//   71  131:invokevirtual   #195 <Method Class Object.getClass()>
	//   72  134:invokevirtual   #201 <Method String Class.getName()>
	//   73  137:aastore         
	//   74  138:invokestatic    #207 <Method String String.format(String, Object[])>
	//   75  141:invokevirtual   #211 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   76  144:pop             
					obj = ((Object) (findDeserializer(deserializationcontext, ((JavaType) (obj)), beanproperty)));
	//   77  145:aload_0         
	//   78  146:aload_1         
	//   79  147:aload_3         
	//   80  148:aload_2         
	//   81  149:invokevirtual   #215 <Method JsonDeserializer findDeserializer(DeserializationContext, JavaType, BeanProperty)>
	//   82  152:astore_3        
					break label0;
	//   83  153:goto            158
				}
			}
			obj = null;
	//   84  156:aconst_null     
	//   85  157:astore_3        
		}
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, java/util/Collection, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//   86  158:aload_0         
	//   87  159:aload_1         
	//   88  160:aload_2         
	//   89  161:ldc1            #144 <Class Collection>
	//   90  163:getstatic       #229 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   91  166:invokevirtual   #233 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   92  169:astore          6
		JsonDeserializer jsondeserializer = findConvertingContentDeserializer(deserializationcontext, beanproperty, _valueDeserializer);
	//   93  171:aload_0         
	//   94  172:aload_1         
	//   95  173:aload_2         
	//   96  174:aload_0         
	//   97  175:getfield        #39  <Field JsonDeserializer _valueDeserializer>
	//   98  178:invokevirtual   #237 <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   99  181:astore          4
		Object obj1 = ((Object) (_containerType.getContentType()));
	//  100  183:aload_0         
	//  101  184:getfield        #71  <Field JavaType _containerType>
	//  102  187:invokevirtual   #77  <Method JavaType JavaType.getContentType()>
	//  103  190:astore          5
		if(jsondeserializer == null)
	//* 104  192:aload           4
	//* 105  194:ifnonnull       209
			jsondeserializer = deserializationcontext.findContextualValueDeserializer(((JavaType) (obj1)), beanproperty);
	//  106  197:aload_1         
	//  107  198:aload           5
	//  108  200:aload_2         
	//  109  201:invokevirtual   #241 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//  110  204:astore          4
		else
	//* 111  206:goto            220
			jsondeserializer = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, ((JavaType) (obj1)));
	//  112  209:aload_1         
	//  113  210:aload           4
	//  114  212:aload_2         
	//  115  213:aload           5
	//  116  215:invokevirtual   #245 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//  117  218:astore          4
		obj1 = ((Object) (_valueTypeDeserializer));
	//  118  220:aload_0         
	//  119  221:getfield        #41  <Field TypeDeserializer _valueTypeDeserializer>
	//  120  224:astore          5
		if(obj1 != null)
	//* 121  226:aload           5
	//* 122  228:ifnull          242
			obj1 = ((Object) (((TypeDeserializer) (obj1)).forProperty(beanproperty)));
	//  123  231:aload           5
	//  124  233:aload_2         
	//  125  234:invokevirtual   #251 <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//  126  237:astore          5
	//* 127  239:goto            242
		deserializationcontext = ((DeserializationContext) (findContentNullProvider(deserializationcontext, beanproperty, jsondeserializer)));
	//  128  242:aload_0         
	//  129  243:aload_1         
	//  130  244:aload_2         
	//  131  245:aload           4
	//  132  247:invokevirtual   #255 <Method NullValueProvider findContentNullProvider(DeserializationContext, BeanProperty, JsonDeserializer)>
	//  133  250:astore_1        
		if(boolean1 == _unwrapSingle && deserializationcontext == _nullProvider && obj == _delegateDeserializer && jsondeserializer == _valueDeserializer && obj1 == _valueTypeDeserializer)
	//* 134  251:aload           6
	//* 135  253:aload_0         
	//* 136  254:getfield        #259 <Field Boolean _unwrapSingle>
	//* 137  257:if_acmpne       299
	//* 138  260:aload_1         
	//* 139  261:aload_0         
	//* 140  262:getfield        #105 <Field NullValueProvider _nullProvider>
	//* 141  265:if_acmpne       299
	//* 142  268:aload_3         
	//* 143  269:aload_0         
	//* 144  270:getfield        #45  <Field JsonDeserializer _delegateDeserializer>
	//* 145  273:if_acmpne       299
	//* 146  276:aload           4
	//* 147  278:aload_0         
	//* 148  279:getfield        #39  <Field JsonDeserializer _valueDeserializer>
	//* 149  282:if_acmpne       299
	//* 150  285:aload           5
	//* 151  287:aload_0         
	//* 152  288:getfield        #41  <Field TypeDeserializer _valueTypeDeserializer>
	//* 153  291:if_acmpeq       297
	//* 154  294:goto            299
			return this;
	//  155  297:aload_0         
	//  156  298:areturn         
		else
			return withResolved(((JsonDeserializer) (obj)), jsondeserializer, ((TypeDeserializer) (obj1)), ((NullValueProvider) (deserializationcontext)), boolean1);
	//  157  299:aload_0         
	//  158  300:aload_3         
	//  159  301:aload           4
	//  160  303:aload           5
	//  161  305:aload_1         
	//  162  306:aload           6
	//  163  308:invokevirtual   #263 <Method CollectionDeserializer withResolved(JsonDeserializer, JsonDeserializer, TypeDeserializer, NullValueProvider, Boolean)>
	//  164  311:areturn         
	}

	protected Collection createDefaultInstance(DeserializationContext deserializationcontext)
		throws IOException
	{
		return (Collection)_valueInstantiator.createUsingDefault(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #268 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//    4    8:checkcast       #144 <Class Collection>
	//    5   11:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #274 <Method Collection deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (Collection)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #144 <Class Collection>
	//    5    7:invokevirtual   #277 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//    6   10:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonDeserializer jsondeserializer = _delegateDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:astore_3        
		if(jsondeserializer != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          27
			return (Collection)_valueInstantiator.createUsingDelegate(deserializationcontext, jsondeserializer.deserialize(jsonparser, deserializationcontext));
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #117 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   12   20:invokevirtual   #281 <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   13   23:checkcast       #144 <Class Collection>
	//   14   26:areturn         
		if(jsonparser.hasToken(JsonToken.VALUE_STRING))
	//*  15   27:aload_1         
	//*  16   28:getstatic       #284 <Field JsonToken JsonToken.VALUE_STRING>
	//*  17   31:invokevirtual   #288 <Method boolean JsonParser.hasToken(JsonToken)>
	//*  18   34:ifeq            62
		{
			String s = jsonparser.getText();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #291 <Method String JsonParser.getText()>
	//   21   41:astore_3        
			if(s.length() == 0)
	//*  22   42:aload_3         
	//*  23   43:invokevirtual   #294 <Method int String.length()>
	//*  24   46:ifne            62
				return (Collection)_valueInstantiator.createFromString(deserializationcontext, s);
	//   25   49:aload_0         
	//   26   50:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//   27   53:aload_2         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #298 <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//   30   58:checkcast       #144 <Class Collection>
	//   31   61:areturn         
		}
		return deserialize(jsonparser, deserializationcontext, createDefaultInstance(deserializationcontext));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #300 <Method Collection createDefaultInstance(DeserializationContext)>
	//   38   70:invokevirtual   #277 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//   39   73:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #60  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            15
			return handleNonArray(jsonparser, deserializationcontext, collection);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #63  <Method Collection handleNonArray(JsonParser, DeserializationContext, Collection)>
	//    8   14:areturn         
		jsonparser.setCurrentValue(((Object) (collection)));
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #67  <Method void JsonParser.setCurrentValue(Object)>
		jsondeserializer = _valueDeserializer;
	//   12   20:aload_0         
	//   13   21:getfield        #39  <Field JsonDeserializer _valueDeserializer>
	//   14   24:astore          6
		if(jsondeserializer.getObjectIdReader() != null)
	//*  15   26:aload           6
	//*  16   28:invokevirtual   #305 <Method com.fasterxml.jackson.databind.deser.impl.ObjectIdReader JsonDeserializer.getObjectIdReader()>
	//*  17   31:ifnull          42
			return _deserializeWithObjectId(jsonparser, deserializationcontext, collection);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #307 <Method Collection _deserializeWithObjectId(JsonParser, DeserializationContext, Collection)>
	//   23   41:areturn         
		typedeserializer = _valueTypeDeserializer;
	//   24   42:aload_0         
	//   25   43:getfield        #41  <Field TypeDeserializer _valueTypeDeserializer>
	//   26   46:astore          7
_L2:
		JsonToken jsontoken;
		jsontoken = jsonparser.nextToken();
	//   27   48:aload_1         
	//   28   49:invokevirtual   #88  <Method JsonToken JsonParser.nextToken()>
	//   29   52:astore          5
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   30   54:aload           5
	//   31   56:getstatic       #94  <Field JsonToken JsonToken.END_ARRAY>
	//   32   59:if_acmpeq       184
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  33   62:aload           5
	//*  34   64:getstatic       #97  <Field JsonToken JsonToken.VALUE_NULL>
	//*  35   67:if_acmpne       95
		{
			if(_skipNullValues)
	//*  36   70:aload_0         
	//*  37   71:getfield        #101 <Field boolean _skipNullValues>
	//*  38   74:ifeq            80
				continue; /* Loop/switch isn't completed */
	//   39   77:goto            48
			Object obj;
			try
			{
				obj = _nullProvider.getNullValue(deserializationcontext);
	//   40   80:aload_0         
	//   41   81:getfield        #105 <Field NullValueProvider _nullProvider>
	//   42   84:aload_2         
	//   43   85:invokeinterface #111 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   44   90:astore          5
			}
	//*  45   92:goto            123
	//*  46   95:aload           7
	//*  47   97:ifnonnull       112
	//*  48  100:aload           6
	//*  49  102:aload_1         
	//*  50  103:aload_2         
	//*  51  104:invokevirtual   #117 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  52  107:astore          5
	//*  53  109:goto            123
	//*  54  112:aload           6
	//*  55  114:aload_1         
	//*  56  115:aload_2         
	//*  57  116:aload           7
	//*  58  118:invokevirtual   #121 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  59  121:astore          5
	//*  60  123:aload_3         
	//*  61  124:aload           5
	//*  62  126:invokeinterface #310 <Method boolean Collection.add(Object)>
	//*  63  131:pop             
	//*  64  132:goto            48
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  65  135:astore_1        
			{
				boolean flag;
				if(deserializationcontext != null && !deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
	//*  66  136:aload_2         
	//*  67  137:ifnull          159
	//*  68  140:aload_2         
	//*  69  141:getstatic       #130 <Field DeserializationFeature DeserializationFeature.WRAP_EXCEPTIONS>
	//*  70  144:invokevirtual   #136 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  71  147:ifeq            153
	//*  72  150:goto            159
					flag = false;
	//   73  153:iconst_0        
	//   74  154:istore          4
				else
	//*  75  156:goto            162
					flag = true;
	//   76  159:iconst_1        
	//   77  160:istore          4
				if(!flag)
	//*  78  162:iload           4
	//*  79  164:ifne            172
					ClassUtil.throwIfRTE(((Throwable) (jsonparser)));
	//   80  167:aload_1         
	//   81  168:invokestatic    #142 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   82  171:pop             
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (collection)), collection.size());
	//   83  172:aload_1         
	//   84  173:aload_3         
	//   85  174:aload_3         
	//   86  175:invokeinterface #148 <Method int Collection.size()>
	//   87  180:invokestatic    #154 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   88  183:athrow          
			}
			break MISSING_BLOCK_LABEL_123;
		}
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_112;
		obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
		break MISSING_BLOCK_LABEL_123;
		obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		collection.add(obj);
		if(true) goto _L2; else goto _L1
_L1:
		return collection;
	//   89  184:aload_3         
	//   90  185:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #313 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	public ValueInstantiator getValueInstantiator()
	{
		return _valueInstantiator;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//    2    4:areturn         
	}

	protected final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		JsonToken jsontoken;
		boolean flag;
		if(_unwrapSingle != Boolean.TRUE && (_unwrapSingle != null || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #259 <Field Boolean _unwrapSingle>
	//*   2    4:getstatic       #323 <Field Boolean Boolean.TRUE>
	//*   3    7:if_acmpeq       36
	//*   4   10:aload_0         
	//*   5   11:getfield        #259 <Field Boolean _unwrapSingle>
	//*   6   14:ifnonnull       30
	//*   7   17:aload_2         
	//*   8   18:getstatic       #325 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*   9   21:invokevirtual   #136 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  10   24:ifeq            30
	//*  11   27:goto            36
			flag = false;
	//   12   30:iconst_0        
	//   13   31:istore          4
		else
	//*  14   33:goto            39
			flag = true;
	//   15   36:iconst_1        
	//   16   37:istore          4
		if(!flag)
	//*  17   39:iload           4
	//*  18   41:ifne            60
			return (Collection)deserializationcontext.handleUnexpectedToken(_containerType.getRawClass(), jsonparser);
	//   19   44:aload_2         
	//   20   45:aload_0         
	//   21   46:getfield        #71  <Field JavaType _containerType>
	//   22   49:invokevirtual   #81  <Method Class JavaType.getRawClass()>
	//   23   52:aload_1         
	//   24   53:invokevirtual   #329 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   25   56:checkcast       #144 <Class Collection>
	//   26   59:areturn         
		jsondeserializer = _valueDeserializer;
	//   27   60:aload_0         
	//   28   61:getfield        #39  <Field JsonDeserializer _valueDeserializer>
	//   29   64:astore          5
		typedeserializer = _valueTypeDeserializer;
	//   30   66:aload_0         
	//   31   67:getfield        #41  <Field TypeDeserializer _valueTypeDeserializer>
	//   32   70:astore          6
		jsontoken = jsonparser.getCurrentToken();
	//   33   72:aload_1         
	//   34   73:invokevirtual   #332 <Method JsonToken JsonParser.getCurrentToken()>
	//   35   76:astore          7
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  36   78:aload           7
	//*  37   80:getstatic       #97  <Field JsonToken JsonToken.VALUE_NULL>
	//*  38   83:if_acmpne       109
		{
			if(_skipNullValues)
	//*  39   86:aload_0         
	//*  40   87:getfield        #101 <Field boolean _skipNullValues>
	//*  41   90:ifeq            95
				return collection;
	//   42   93:aload_3         
	//   43   94:areturn         
			try
			{
				jsonparser = ((JsonParser) (_nullProvider.getNullValue(deserializationcontext)));
	//   44   95:aload_0         
	//   45   96:getfield        #105 <Field NullValueProvider _nullProvider>
	//   46   99:aload_2         
	//   47  100:invokeinterface #111 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   48  105:astore_1        
			}
	//*  49  106:goto            135
	//*  50  109:aload           6
	//*  51  111:ifnonnull       125
	//*  52  114:aload           5
	//*  53  116:aload_1         
	//*  54  117:aload_2         
	//*  55  118:invokevirtual   #117 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  56  121:astore_1        
	//*  57  122:goto            135
	//*  58  125:aload           5
	//*  59  127:aload_1         
	//*  60  128:aload_2         
	//*  61  129:aload           6
	//*  62  131:invokevirtual   #121 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  63  134:astore_1        
	//*  64  135:aload_3         
	//*  65  136:aload_1         
	//*  66  137:invokeinterface #310 <Method boolean Collection.add(Object)>
	//*  67  142:pop             
	//*  68  143:aload_3         
	//*  69  144:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  70  145:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), java/lang/Object, collection.size());
	//   71  146:aload_1         
	//   72  147:ldc1            #192 <Class Object>
	//   73  149:aload_3         
	//   74  150:invokeinterface #148 <Method int Collection.size()>
	//   75  155:invokestatic    #154 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   76  158:athrow          
			}
			break MISSING_BLOCK_LABEL_135;
		}
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_125;
		jsonparser = ((JsonParser) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
		break MISSING_BLOCK_LABEL_135;
		jsonparser = ((JsonParser) (jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
		collection.add(((Object) (jsonparser)));
		return collection;
	}

	public boolean isCachable()
	{
		return _valueDeserializer == null && _valueTypeDeserializer == null && _delegateDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field TypeDeserializer _valueTypeDeserializer>
	//    5   11:ifnonnull       23
	//    6   14:aload_0         
	//    7   15:getfield        #45  <Field JsonDeserializer _delegateDeserializer>
	//    8   18:ifnonnull       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	protected CollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return new CollectionDeserializer(_containerType, jsondeserializer1, typedeserializer, _valueInstantiator, jsondeserializer, nullvalueprovider, boolean1);
	//    0    0:new             #2   <Class CollectionDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #71  <Field JavaType _containerType>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//    8   14:aload_1         
	//    9   15:aload           4
	//   10   17:aload           5
	//   11   19:invokespecial   #31  <Method void CollectionDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, NullValueProvider, Boolean)>
	//   12   22:areturn         
	}

	private static final long serialVersionUID = -1L;
	protected final JsonDeserializer _delegateDeserializer;
	protected final JsonDeserializer _valueDeserializer;
	protected final ValueInstantiator _valueInstantiator;
	protected final TypeDeserializer _valueTypeDeserializer;
}
