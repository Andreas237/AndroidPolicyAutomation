// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, EngineResource

static class Engine$ResourceWeakReference extends WeakReference
{

	final Key key;

	public Engine$ResourceWeakReference(Key key1, EngineResource engineresource, ReferenceQueue referencequeue)
	{
		super(((Object) (engineresource)), referencequeue);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #15  <Method void WeakReference(Object, ReferenceQueue)>
		key = key1;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #17  <Field Key key>
	//    7   11:return          
	}
}
