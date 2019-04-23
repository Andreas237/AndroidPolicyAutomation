// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.bumptech.glide.load.engine:
//			ActiveResources, EngineResource, Resource

static final class ActiveResources$ResourceWeakReference extends WeakReference
{

	void reset()
	{
		resource = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #46  <Field Resource resource>
		clear();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #57  <Method void clear()>
	//    5    9:return          
	}

	final boolean isCacheable;
	final Key key;
	Resource resource;

	ActiveResources$ResourceWeakReference(Key key1, EngineResource engineresource, ReferenceQueue referencequeue, boolean flag)
	{
		super(((Object) (engineresource)), referencequeue);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #23  <Method void WeakReference(Object, ReferenceQueue)>
		key = (Key)Preconditions.checkNotNull(((Object) (key1)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object)>
	//    7   11:checkcast       #31  <Class Key>
	//    8   14:putfield        #33  <Field Key key>
		if(engineresource.isCacheable() && flag)
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #38  <Method boolean EngineResource.isCacheable()>
	//*  11   21:ifeq            43
	//*  12   24:iload           4
	//*  13   26:ifeq            43
			key1 = ((Key) ((Resource)Preconditions.checkNotNull(((Object) (engineresource.getResource())))));
	//   14   29:aload_2         
	//   15   30:invokevirtual   #42  <Method Resource EngineResource.getResource()>
	//   16   33:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object)>
	//   17   36:checkcast       #44  <Class Resource>
	//   18   39:astore_1        
		else
	//*  19   40:goto            45
			key1 = null;
	//   20   43:aconst_null     
	//   21   44:astore_1        
		resource = ((Resource) (key1));
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:putfield        #46  <Field Resource resource>
		isCacheable = engineresource.isCacheable();
	//   25   50:aload_0         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #38  <Method boolean EngineResource.isCacheable()>
	//   28   55:putfield        #48  <Field boolean isCacheable>
	//   29   58:return          
	}
}
