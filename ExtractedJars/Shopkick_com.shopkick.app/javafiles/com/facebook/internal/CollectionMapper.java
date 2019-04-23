// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.*;

// Referenced classes of package com.facebook.internal:
//			Mutable

public class CollectionMapper
{
	public static interface Collection
	{

		public abstract Object get(Object obj);

		public abstract Iterator keyIterator();

		public abstract void set(Object obj, Object obj1, OnErrorListener onerrorlistener);
	}

	public static interface OnErrorListener
	{

		public abstract void onError(FacebookException facebookexception);
	}

	public static interface OnMapValueCompleteListener
		extends OnErrorListener
	{

		public abstract void onComplete(Object obj);
	}

	public static interface OnMapperCompleteListener
		extends OnErrorListener
	{

		public abstract void onComplete();
	}

	public static interface ValueMapper
	{

		public abstract void mapValue(Object obj, OnMapValueCompleteListener onmapvaluecompletelistener);
	}


	private CollectionMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static void iterate(Collection collection, ValueMapper valuemapper, OnMapperCompleteListener onmappercompletelistener)
	{
		Object obj = ((Object) (new Mutable(((Object) (Boolean.valueOf(false))))));
	//    0    0:new             #32  <Class Mutable>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokestatic    #38  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokespecial   #41  <Method void Mutable(Object)>
	//    5   11:astore          4
		Mutable mutable = new Mutable(((Object) (Integer.valueOf(1))));
	//    6   13:new             #32  <Class Mutable>
	//    7   16:dup             
	//    8   17:iconst_1        
	//    9   18:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   10   21:invokespecial   #41  <Method void Mutable(Object)>
	//   11   24:astore_3        
		onmappercompletelistener = new OnMapperCompleteListener(((Mutable) (obj)), mutable, onmappercompletelistener) {

			public void onComplete()
			{
				if(((Boolean)didReturnError.value).booleanValue())
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field Mutable val$didReturnError>
			//*   2    4:getfield        #35  <Field Object Mutable.value>
			//*   3    7:checkcast       #37  <Class Boolean>
			//*   4   10:invokevirtual   #41  <Method boolean Boolean.booleanValue()>
			//*   5   13:ifeq            17
					return;
			//    6   16:return          
				Mutable mutable1 = pendingJobCount;
			//    7   17:aload_0         
			//    8   18:getfield        #22  <Field Mutable val$pendingJobCount>
			//    9   21:astore_1        
				Integer integer1 = Integer.valueOf(((Integer)mutable1.value).intValue() - 1);
			//   10   22:aload_1         
			//   11   23:getfield        #35  <Field Object Mutable.value>
			//   12   26:checkcast       #43  <Class Integer>
			//   13   29:invokevirtual   #47  <Method int Integer.intValue()>
			//   14   32:iconst_1        
			//   15   33:isub            
			//   16   34:invokestatic    #51  <Method Integer Integer.valueOf(int)>
			//   17   37:astore_2        
				mutable1.value = ((Object) (integer1));
			//   18   38:aload_1         
			//   19   39:aload_2         
			//   20   40:putfield        #35  <Field Object Mutable.value>
				if(integer1.intValue() == 0)
			//*  21   43:aload_2         
			//*  22   44:invokevirtual   #47  <Method int Integer.intValue()>
			//*  23   47:ifne            59
					onMapperCompleteListener.onComplete();
			//   24   50:aload_0         
			//   25   51:getfield        #24  <Field CollectionMapper$OnMapperCompleteListener val$onMapperCompleteListener>
			//   26   54:invokeinterface #53  <Method void CollectionMapper$OnMapperCompleteListener.onComplete()>
			//   27   59:return          
			}

			public void onError(FacebookException facebookexception)
			{
				if(((Boolean)didReturnError.value).booleanValue())
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field Mutable val$didReturnError>
			//*   2    4:getfield        #35  <Field Object Mutable.value>
			//*   3    7:checkcast       #37  <Class Boolean>
			//*   4   10:invokevirtual   #41  <Method boolean Boolean.booleanValue()>
			//*   5   13:ifeq            17
				{
					return;
			//    6   16:return          
				} else
				{
					didReturnError.value = ((Object) (Boolean.valueOf(true)));
			//    7   17:aload_0         
			//    8   18:getfield        #20  <Field Mutable val$didReturnError>
			//    9   21:iconst_1        
			//   10   22:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
			//   11   25:putfield        #35  <Field Object Mutable.value>
					onMapperCompleteListener.onError(facebookexception);
			//   12   28:aload_0         
			//   13   29:getfield        #24  <Field CollectionMapper$OnMapperCompleteListener val$onMapperCompleteListener>
			//   14   32:aload_1         
			//   15   33:invokeinterface #60  <Method void CollectionMapper$OnMapperCompleteListener.onError(FacebookException)>
					return;
			//   16   38:return          
				}
			}

			final Mutable val$didReturnError;
			final OnMapperCompleteListener val$onMapperCompleteListener;
			final Mutable val$pendingJobCount;

			
			{
				didReturnError = mutable;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Mutable val$didReturnError>
				pendingJobCount = mutable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Mutable val$pendingJobCount>
				onMapperCompleteListener = onmappercompletelistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field CollectionMapper$OnMapperCompleteListener val$onMapperCompleteListener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
;
	//   12   25:new             #6   <Class CollectionMapper$1>
	//   13   28:dup             
	//   14   29:aload           4
	//   15   31:aload_3         
	//   16   32:aload_2         
	//   17   33:invokespecial   #49  <Method void CollectionMapper$1(Mutable, Mutable, CollectionMapper$OnMapperCompleteListener)>
	//   18   36:astore_2        
		obj = ((Object) (collection.keyIterator()));
	//   19   37:aload_0         
	//   20   38:invokeinterface #53  <Method Iterator CollectionMapper$Collection.keyIterator()>
	//   21   43:astore          4
		Object obj1 = ((Object) (new LinkedList()));
	//   22   45:new             #55  <Class LinkedList>
	//   23   48:dup             
	//   24   49:invokespecial   #56  <Method void LinkedList()>
	//   25   52:astore          5
		for(; ((Iterator) (obj)).hasNext(); ((List) (obj1)).add(((Iterator) (obj)).next()));
	//   26   54:aload           4
	//   27   56:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   28   61:ifeq            82
	//   29   64:aload           5
	//   30   66:aload           4
	//   31   68:invokeinterface #66  <Method Object Iterator.next()>
	//   32   73:invokeinterface #72  <Method boolean List.add(Object)>
	//   33   78:pop             
	//*  34   79:goto            54
		Object obj2;
		for(Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); valuemapper.mapValue(obj1, ((OnMapValueCompleteListener) (obj2))))
	//*  35   82:aload           5
	//*  36   84:invokeinterface #75  <Method Iterator List.iterator()>
	//*  37   89:astore          4
	//*  38   91:aload           4
	//*  39   93:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//*  40   98:ifeq            174
		{
			obj2 = iterator.next();
	//   41  101:aload           4
	//   42  103:invokeinterface #66  <Method Object Iterator.next()>
	//   43  108:astore          6
			obj1 = collection.get(obj2);
	//   44  110:aload_0         
	//   45  111:aload           6
	//   46  113:invokeinterface #79  <Method Object CollectionMapper$Collection.get(Object)>
	//   47  118:astore          5
			obj2 = ((Object) (new OnMapValueCompleteListener(collection, obj2, onmappercompletelistener) {

				public void onComplete(Object obj3)
				{
					collection.set(key, obj3, ((OnErrorListener) (jobCompleteListener)));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field CollectionMapper$Collection val$collection>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field Object val$key>
				//    4    8:aload_1         
				//    5    9:aload_0         
				//    6   10:getfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
				//    7   13:invokeinterface #37  <Method void CollectionMapper$Collection.set(Object, Object, CollectionMapper$OnErrorListener)>
					jobCompleteListener.onComplete();
				//    8   18:aload_0         
				//    9   19:getfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
				//   10   22:invokeinterface #41  <Method void CollectionMapper$OnMapperCompleteListener.onComplete()>
				//   11   27:return          
				}

				public void onError(FacebookException facebookexception)
				{
					jobCompleteListener.onError(facebookexception);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
				//    2    4:aload_1         
				//    3    5:invokeinterface #45  <Method void CollectionMapper$OnMapperCompleteListener.onError(FacebookException)>
				//    4   10:return          
				}

				final Collection val$collection;
				final OnMapperCompleteListener val$jobCompleteListener;
				final Object val$key;

			
			{
				collection = collection1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CollectionMapper$Collection val$collection>
				key = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Object val$key>
				jobCompleteListener = onmappercompletelistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
));
	//   48  120:new             #8   <Class CollectionMapper$2>
	//   49  123:dup             
	//   50  124:aload_0         
	//   51  125:aload           6
	//   52  127:aload_2         
	//   53  128:invokespecial   #82  <Method void CollectionMapper$2(CollectionMapper$Collection, Object, CollectionMapper$OnMapperCompleteListener)>
	//   54  131:astore          6
			Integer integer = (Integer)mutable.value;
	//   55  133:aload_3         
	//   56  134:getfield        #86  <Field Object Mutable.value>
	//   57  137:checkcast       #43  <Class Integer>
	//   58  140:astore          7
			mutable.value = ((Object) (Integer.valueOf(((Integer)mutable.value).intValue() + 1)));
	//   59  142:aload_3         
	//   60  143:aload_3         
	//   61  144:getfield        #86  <Field Object Mutable.value>
	//   62  147:checkcast       #43  <Class Integer>
	//   63  150:invokevirtual   #90  <Method int Integer.intValue()>
	//   64  153:iconst_1        
	//   65  154:iadd            
	//   66  155:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   67  158:putfield        #86  <Field Object Mutable.value>
		}

	//   68  161:aload_1         
	//   69  162:aload           5
	//   70  164:aload           6
	//   71  166:invokeinterface #94  <Method void CollectionMapper$ValueMapper.mapValue(Object, CollectionMapper$OnMapValueCompleteListener)>
	//*  72  171:goto            91
		onmappercompletelistener.onComplete();
	//   73  174:aload_2         
	//   74  175:invokeinterface #97  <Method void CollectionMapper$OnMapperCompleteListener.onComplete()>
	//   75  180:return          
	}
}
