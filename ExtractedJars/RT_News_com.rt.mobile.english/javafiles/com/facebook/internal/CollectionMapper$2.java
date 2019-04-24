// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//			CollectionMapper

static final class CollectionMapper$2
	implements MapValueCompleteListener
{

	public void onComplete(Object obj)
	{
		val$collection.set(val$key, obj, ((ErrorListener) (val$jobCompleteListener)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CollectionMapper$Collection val$collection>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Object val$key>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
	//    7   13:invokeinterface #37  <Method void CollectionMapper$Collection.set(Object, Object, CollectionMapper$OnErrorListener)>
		val$jobCompleteListener.onComplete();
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
	//   10   22:invokeinterface #41  <Method void CollectionMapper$OnMapperCompleteListener.onComplete()>
	//   11   27:return          
	}

	public void onError(FacebookException facebookexception)
	{
		val$jobCompleteListener.onError(facebookexception);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #45  <Method void CollectionMapper$OnMapperCompleteListener.onError(FacebookException)>
	//    4   10:return          
	}

	final llection val$collection;
	final MapperCompleteListener val$jobCompleteListener;
	final Object val$key;

	CollectionMapper$2(llection llection, Object obj, MapperCompleteListener mappercompletelistener)
	{
		val$collection = llection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CollectionMapper$Collection val$collection>
		val$key = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Object val$key>
		val$jobCompleteListener = mappercompletelistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field CollectionMapper$OnMapperCompleteListener val$jobCompleteListener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
