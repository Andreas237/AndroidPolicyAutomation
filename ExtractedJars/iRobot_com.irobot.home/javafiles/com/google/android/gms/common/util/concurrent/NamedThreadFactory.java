// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.gms.common.util.concurrent:
//			zza

public class NamedThreadFactory
	implements ThreadFactory
{

	public NamedThreadFactory(String s)
	{
		this(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #18  <Method void NamedThreadFactory(String, int)>
	//    4    6:return          
	}

	private NamedThreadFactory(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzhp = Executors.defaultThreadFactory();
	//    2    4:aload_0         
	//    3    5:invokestatic    #29  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    4    8:putfield        #31  <Field ThreadFactory zzhp>
		name = (String)Preconditions.checkNotNull(((Object) (s)), "Name must not be null");
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:ldc1            #33  <String "Name must not be null">
	//    8   15:invokestatic    #39  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   18:checkcast       #41  <Class String>
	//   10   21:putfield        #43  <Field String name>
		priority = 0;
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:putfield        #45  <Field int priority>
	//   14   29:return          
	}

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (zzhp.newThread(((Runnable) (new zza(runnable, 0))))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ThreadFactory zzhp>
	//    2    4:new             #49  <Class zza>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #52  <Method void zza(Runnable, int)>
	//    7   13:invokeinterface #54  <Method Thread ThreadFactory.newThread(Runnable)>
	//    8   18:astore_1        
		((Thread) (runnable)).setName(name);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #43  <Field String name>
	//   12   24:invokevirtual   #59  <Method void Thread.setName(String)>
		return ((Thread) (runnable));
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	private final String name;
	private final int priority;
	private final ThreadFactory zzhp;
}
