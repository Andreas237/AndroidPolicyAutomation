// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//			CollectionMapper, Mutable

static final class CollectionMapper$1
	implements MapperCompleteListener
{

	public void onComplete()
	{
		if(((Boolean)val$didReturnError.value).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Mutable val$didReturnError>
	//*   2    4:getfield        #35  <Field Object Mutable.value>
	//*   3    7:checkcast       #37  <Class Boolean>
	//*   4   10:invokevirtual   #41  <Method boolean Boolean.booleanValue()>
	//*   5   13:ifeq            17
			return;
	//    6   16:return          
		Mutable mutable = val$pendingJobCount;
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field Mutable val$pendingJobCount>
	//    9   21:astore_1        
		Integer integer = Integer.valueOf(((Integer)mutable.value).intValue() - 1);
	//   10   22:aload_1         
	//   11   23:getfield        #35  <Field Object Mutable.value>
	//   12   26:checkcast       #43  <Class Integer>
	//   13   29:invokevirtual   #47  <Method int Integer.intValue()>
	//   14   32:iconst_1        
	//   15   33:isub            
	//   16   34:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   17   37:astore_2        
		mutable.value = ((Object) (integer));
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:putfield        #35  <Field Object Mutable.value>
		if(integer.intValue() == 0)
	//*  21   43:aload_2         
	//*  22   44:invokevirtual   #47  <Method int Integer.intValue()>
	//*  23   47:ifne            59
			val$onMapperCompleteListener.onComplete();
	//   24   50:aload_0         
	//   25   51:getfield        #24  <Field CollectionMapper$OnMapperCompleteListener val$onMapperCompleteListener>
	//   26   54:invokeinterface #53  <Method void CollectionMapper$OnMapperCompleteListener.onComplete()>
	//   27   59:return          
	}

	public void onError(FacebookException facebookexception)
	{
		if(((Boolean)val$didReturnError.value).booleanValue())
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
			val$didReturnError.value = ((Object) (Boolean.valueOf(true)));
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field Mutable val$didReturnError>
	//    9   21:iconst_1        
	//   10   22:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   11   25:putfield        #35  <Field Object Mutable.value>
			val$onMapperCompleteListener.onError(facebookexception);
	//   12   28:aload_0         
	//   13   29:getfield        #24  <Field CollectionMapper$OnMapperCompleteListener val$onMapperCompleteListener>
	//   14   32:aload_1         
	//   15   33:invokeinterface #60  <Method void CollectionMapper$OnMapperCompleteListener.onError(FacebookException)>
			return;
	//   16   38:return          
		}
	}

	final Mutable val$didReturnError;
	final MapperCompleteListener val$onMapperCompleteListener;
	final Mutable val$pendingJobCount;

	CollectionMapper$1(Mutable mutable, Mutable mutable1, MapperCompleteListener mappercompletelistener)
	{
		val$didReturnError = mutable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Mutable val$didReturnError>
		val$pendingJobCount = mutable1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Mutable val$pendingJobCount>
		val$onMapperCompleteListener = mappercompletelistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field CollectionMapper$OnMapperCompleteListener val$onMapperCompleteListener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
