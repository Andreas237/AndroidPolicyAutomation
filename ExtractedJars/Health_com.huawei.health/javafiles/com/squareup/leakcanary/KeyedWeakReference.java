// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.leakcanary:
//			Preconditions

final class KeyedWeakReference extends WeakReference
{

	KeyedWeakReference(Object obj, String s, String s1, ReferenceQueue referencequeue)
	{
		super(Preconditions.checkNotNull(obj, "referent"), (ReferenceQueue)Preconditions.checkNotNull(((Object) (referencequeue)), "referenceQueue"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #12  <String "referent">
	//    3    4:invokestatic    #18  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    7:aload           4
	//    5    9:ldc1            #20  <String "referenceQueue">
	//    6   11:invokestatic    #18  <Method Object Preconditions.checkNotNull(Object, String)>
	//    7   14:checkcast       #22  <Class ReferenceQueue>
	//    8   17:invokespecial   #25  <Method void WeakReference(Object, ReferenceQueue)>
		key = (String)Preconditions.checkNotNull(((Object) (s)), "key");
	//    9   20:aload_0         
	//   10   21:aload_2         
	//   11   22:ldc1            #26  <String "key">
	//   12   24:invokestatic    #18  <Method Object Preconditions.checkNotNull(Object, String)>
	//   13   27:checkcast       #28  <Class String>
	//   14   30:putfield        #30  <Field String key>
		name = (String)Preconditions.checkNotNull(((Object) (s1)), "name");
	//   15   33:aload_0         
	//   16   34:aload_3         
	//   17   35:ldc1            #31  <String "name">
	//   18   37:invokestatic    #18  <Method Object Preconditions.checkNotNull(Object, String)>
	//   19   40:checkcast       #28  <Class String>
	//   20   43:putfield        #33  <Field String name>
	//   21   46:return          
	}

	public final String key;
	public final String name;
}
