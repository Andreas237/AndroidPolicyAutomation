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
	//    3    3:invokespecial   #20  <Method void NumberedThreadFactory(String, int)>
	//    4    6:return          
	}

	private NumberedThreadFactory(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzhr = new AtomicInteger();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void AtomicInteger()>
	//    6   12:putfield        #30  <Field AtomicInteger zzhr>
		zzhp = Executors.defaultThreadFactory();
	//    7   15:aload_0         
	//    8   16:invokestatic    #36  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    9   19:putfield        #38  <Field ThreadFactory zzhp>
		zzhq = (String)Preconditions.checkNotNull(((Object) (s)), "Name must not be null");
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:ldc1            #40  <String "Name must not be null">
	//   13   26:invokestatic    #46  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   14   29:checkcast       #48  <Class String>
	//   15   32:putfield        #50  <Field String zzhq>
		priority = 0;
	//   16   35:aload_0         
	//   17   36:iconst_0        
	//   18   37:putfield        #52  <Field int priority>
	//   19   40:return          
	}

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (zzhp.newThread(((Runnable) (new zza(runnable, 0))))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ThreadFactory zzhp>
	//    2    4:new             #56  <Class zza>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #59  <Method void zza(Runnable, int)>
	//    7   13:invokeinterface #61  <Method Thread ThreadFactory.newThread(Runnable)>
	//    8   18:astore_1        
		String s = zzhq;
	//    9   19:aload_0         
	//   10   20:getfield        #50  <Field String zzhq>
	//   11   23:astore_3        
		int i = zzhr.getAndIncrement();
	//   12   24:aload_0         
	//   13   25:getfield        #30  <Field AtomicInteger zzhr>
	//   14   28:invokevirtual   #65  <Method int AtomicInteger.getAndIncrement()>
	//   15   31:istore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 13);
	//   16   32:new             #67  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:aload_3         
	//   19   37:invokestatic    #71  <Method String String.valueOf(Object)>
	//   20   40:invokevirtual   #74  <Method int String.length()>
	//   21   43:bipush          13
	//   22   45:iadd            
	//   23   46:invokespecial   #77  <Method void StringBuilder(int)>
	//   24   49:astore          4
		stringbuilder.append(s);
	//   25   51:aload           4
	//   26   53:aload_3         
	//   27   54:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
		stringbuilder.append("[");
	//   29   58:aload           4
	//   30   60:ldc1            #83  <String "[">
	//   31   62:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		stringbuilder.append(i);
	//   33   66:aload           4
	//   34   68:iload_2         
	//   35   69:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   36   72:pop             
		stringbuilder.append("]");
	//   37   73:aload           4
	//   38   75:ldc1            #88  <String "]">
	//   39   77:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
		((Thread) (runnable)).setName(stringbuilder.toString());
	//   41   81:aload_1         
	//   42   82:aload           4
	//   43   84:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   44   87:invokevirtual   #97  <Method void Thread.setName(String)>
		return ((Thread) (runnable));
	//   45   90:aload_1         
	//   46   91:areturn         
	}

	private final int priority;
	private final ThreadFactory zzhp;
	private final String zzhq;
	private final AtomicInteger zzhr;
}
