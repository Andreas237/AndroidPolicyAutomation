// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			CollectionDeserializer

public static class CollectionDeserializer$CollectionReferringAccumulator
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
			((CollectionDeserializer.CollectionReferring)list.get(list.size() - 1)).next.add(obj);
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
		unresolvedforwardreference = ((UnresolvedForwardReference) (new CollectionDeserializer.CollectionReferring(this, unresolvedforwardreference, _elementType)));
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
		CollectionDeserializer.CollectionReferring collectionreferring;
		for(Object obj2 = ((Object) (_result)); iterator.hasNext(); obj2 = ((Object) (collectionreferring.next)))
	//*   4   11:aload_0         
	//*   5   12:getfield        #30  <Field Collection _result>
	//*   6   15:astore_3        
	//*   7   16:aload           4
	//*   8   18:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            84
		{
			collectionreferring = (CollectionDeserializer.CollectionReferring)iterator.next();
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

	public CollectionDeserializer$CollectionReferringAccumulator(Class class1, Collection collection)
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
