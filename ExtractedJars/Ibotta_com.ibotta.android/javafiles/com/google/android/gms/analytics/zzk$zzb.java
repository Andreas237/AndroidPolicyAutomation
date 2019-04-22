// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.analytics:
//			zzk, zzl

static final class zzk$zzb
	implements ThreadFactory
{

	public final Thread newThread(Runnable runnable)
	{
		int i = zzsk.incrementAndGet();
	//    0    0:getstatic       #20  <Field AtomicInteger zzsk>
	//    1    3:invokevirtual   #30  <Method int AtomicInteger.incrementAndGet()>
	//    2    6:istore_2        
		StringBuilder stringbuilder = new StringBuilder(23);
	//    3    7:new             #32  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:bipush          23
	//    6   13:invokespecial   #35  <Method void StringBuilder(int)>
	//    7   16:astore_3        
		stringbuilder.append("measurement-");
	//    8   17:aload_3         
	//    9   18:ldc1            #37  <String "measurement-">
	//   10   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(i);
	//   12   24:aload_3         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   15   29:pop             
		return ((Thread) (new zzk$zzc(runnable, stringbuilder.toString())));
	//   16   30:new             #46  <Class zzk$zzc>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #53  <Method void zzk$zzc(Runnable, String)>
	//   22   42:areturn         
	}

	private static final AtomicInteger zzsk = new AtomicInteger();

	static 
	{
	//    0    0:new             #15  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void AtomicInteger()>
	//    3    7:putstatic       #20  <Field AtomicInteger zzsk>
	//*   4   10:return          
	}

	private zzk$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	zzk$zzb(zzl zzl)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zzk$zzb()>
	//    2    4:return          
	}
}
