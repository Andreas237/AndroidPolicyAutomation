// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.util.concurrent:
//			zza

public class NumberedThreadFactory
	implements ThreadFactory
{

	public NumberedThreadFactory(String s)
	{
		this(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #19  <Method void NumberedThreadFactory(String, int)>
	//    4    6:return          
	}

	public NumberedThreadFactory(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzaaw = new AtomicInteger();
	//    2    4:aload_0         
	//    3    5:new             #25  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void AtomicInteger()>
	//    6   12:putfield        #28  <Field AtomicInteger zzaaw>
		zzaau = Executors.defaultThreadFactory();
	//    7   15:aload_0         
	//    8   16:invokestatic    #34  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    9   19:putfield        #36  <Field ThreadFactory zzaau>
		zzaav = (String)Preconditions.checkNotNull(((Object) (s)), "Name must not be null");
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:ldc1            #38  <String "Name must not be null">
	//   13   26:invokestatic    #44  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   14   29:checkcast       #46  <Class String>
	//   15   32:putfield        #48  <Field String zzaav>
		priority = i;
	//   16   35:aload_0         
	//   17   36:iload_2         
	//   18   37:putfield        #50  <Field int priority>
	//   19   40:return          
	}

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (zzaau.newThread(((Runnable) (new zza(runnable, priority))))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ThreadFactory zzaau>
	//    2    4:new             #54  <Class zza>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field int priority>
	//    7   13:invokespecial   #57  <Method void zza(Runnable, int)>
	//    8   16:invokeinterface #59  <Method Thread ThreadFactory.newThread(Runnable)>
	//    9   21:astore_1        
		String s = zzaav;
	//   10   22:aload_0         
	//   11   23:getfield        #48  <Field String zzaav>
	//   12   26:astore_3        
		int i = zzaaw.getAndIncrement();
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field AtomicInteger zzaaw>
	//   15   31:invokevirtual   #63  <Method int AtomicInteger.getAndIncrement()>
	//   16   34:istore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 13);
	//   17   35:new             #65  <Class StringBuilder>
	//   18   38:dup             
	//   19   39:aload_3         
	//   20   40:invokestatic    #69  <Method String String.valueOf(Object)>
	//   21   43:invokevirtual   #72  <Method int String.length()>
	//   22   46:bipush          13
	//   23   48:iadd            
	//   24   49:invokespecial   #75  <Method void StringBuilder(int)>
	//   25   52:astore          4
		stringbuilder.append(s);
	//   26   54:aload           4
	//   27   56:aload_3         
	//   28   57:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append("[");
	//   30   61:aload           4
	//   31   63:ldc1            #81  <String "[">
	//   32   65:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
		stringbuilder.append(i);
	//   34   69:aload           4
	//   35   71:iload_2         
	//   36   72:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   37   75:pop             
		stringbuilder.append("]");
	//   38   76:aload           4
	//   39   78:ldc1            #86  <String "]">
	//   40   80:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   41   83:pop             
		((Thread) (runnable)).setName(stringbuilder.toString());
	//   42   84:aload_1         
	//   43   85:aload           4
	//   44   87:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   45   90:invokevirtual   #95  <Method void Thread.setName(String)>
		return ((Thread) (runnable));
	//   46   93:aload_1         
	//   47   94:areturn         
	}

	private final int priority;
	private final ThreadFactory zzaau;
	private final String zzaav;
	private final AtomicInteger zzaaw;
}
