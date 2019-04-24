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
	//    3    3:invokespecial   #17  <Method void NamedThreadFactory(String, int)>
	//    4    6:return          
	}

	public NamedThreadFactory(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzaau = Executors.defaultThreadFactory();
	//    2    4:aload_0         
	//    3    5:invokestatic    #27  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    4    8:putfield        #29  <Field ThreadFactory zzaau>
		name = (String)Preconditions.checkNotNull(((Object) (s)), "Name must not be null");
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:ldc1            #31  <String "Name must not be null">
	//    8   15:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   18:checkcast       #39  <Class String>
	//   10   21:putfield        #41  <Field String name>
		priority = i;
	//   11   24:aload_0         
	//   12   25:iload_2         
	//   13   26:putfield        #43  <Field int priority>
	//   14   29:return          
	}

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (zzaau.newThread(((Runnable) (new zza(runnable, priority))))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ThreadFactory zzaau>
	//    2    4:new             #47  <Class zza>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field int priority>
	//    7   13:invokespecial   #50  <Method void zza(Runnable, int)>
	//    8   16:invokeinterface #52  <Method Thread ThreadFactory.newThread(Runnable)>
	//    9   21:astore_1        
		((Thread) (runnable)).setName(name);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #41  <Field String name>
	//   13   27:invokevirtual   #57  <Method void Thread.setName(String)>
		return ((Thread) (runnable));
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	private final String name;
	private final int priority;
	private final ThreadFactory zzaau;
}
