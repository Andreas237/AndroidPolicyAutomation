// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzac;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//			zzacv

public class zzacu
	implements ThreadFactory
{

	public zzacu(String s)
	{
		this(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #19  <Method void zzacu(String, int)>
	//    4    6:return          
	}

	public zzacu(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzaHi = new AtomicInteger();
	//    2    4:aload_0         
	//    3    5:new             #25  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void AtomicInteger()>
	//    6   12:putfield        #28  <Field AtomicInteger zzaHi>
		zzaHj = Executors.defaultThreadFactory();
	//    7   15:aload_0         
	//    8   16:invokestatic    #34  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    9   19:putfield        #36  <Field ThreadFactory zzaHj>
		zzaHh = (String)zzac.zzb(((Object) (s)), "Name must not be null");
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:ldc1            #38  <String "Name must not be null">
	//   13   26:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//   14   29:checkcast       #46  <Class String>
	//   15   32:putfield        #48  <Field String zzaHh>
		mPriority = i;
	//   16   35:aload_0         
	//   17   36:iload_2         
	//   18   37:putfield        #50  <Field int mPriority>
	//   19   40:return          
	}

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (zzaHj.newThread(((Runnable) (new zzacv(runnable, mPriority))))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ThreadFactory zzaHj>
	//    2    4:new             #54  <Class zzacv>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field int mPriority>
	//    7   13:invokespecial   #57  <Method void zzacv(Runnable, int)>
	//    8   16:invokeinterface #59  <Method Thread ThreadFactory.newThread(Runnable)>
	//    9   21:astore_1        
		String s = zzaHh;
	//   10   22:aload_0         
	//   11   23:getfield        #48  <Field String zzaHh>
	//   12   26:astore_3        
		int i = zzaHi.getAndIncrement();
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field AtomicInteger zzaHi>
	//   15   31:invokevirtual   #63  <Method int AtomicInteger.getAndIncrement()>
	//   16   34:istore_2        
		((Thread) (runnable)).setName((new StringBuilder(String.valueOf(((Object) (s))).length() + 13)).append(s).append("[").append(i).append("]").toString());
	//   17   35:aload_1         
	//   18   36:new             #65  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:aload_3         
	//   21   41:invokestatic    #69  <Method String String.valueOf(Object)>
	//   22   44:invokevirtual   #72  <Method int String.length()>
	//   23   47:bipush          13
	//   24   49:iadd            
	//   25   50:invokespecial   #75  <Method void StringBuilder(int)>
	//   26   53:aload_3         
	//   27   54:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:ldc1            #81  <String "[">
	//   29   59:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:iload_2         
	//   31   63:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   32   66:ldc1            #86  <String "]">
	//   33   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   34   71:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   35   74:invokevirtual   #95  <Method void Thread.setName(String)>
		return ((Thread) (runnable));
	//   36   77:aload_1         
	//   37   78:areturn         
	}

	private final int mPriority;
	private final String zzaHh;
	private final AtomicInteger zzaHi;
	private final ThreadFactory zzaHj;
}
