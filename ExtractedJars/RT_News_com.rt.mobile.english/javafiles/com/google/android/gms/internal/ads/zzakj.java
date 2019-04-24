// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzakj
	implements ThreadFactory
{

	zzakj(String s)
	{
		zzcrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field String zzcrl>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #19  <Class AtomicInteger>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #22  <Method void AtomicInteger(int)>
	//   10   18:putfield        #24  <Field AtomicInteger zzcnz>
	//   11   21:return          
	}

	public final Thread newThread(Runnable runnable)
	{
		String s = zzcrl;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String zzcrl>
	//    2    4:astore_3        
		int i = zzcnz.getAndIncrement();
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field AtomicInteger zzcnz>
	//    5    9:invokevirtual   #31  <Method int AtomicInteger.getAndIncrement()>
	//    6   12:istore_2        
		StringBuilder stringbuilder = new StringBuilder(23 + String.valueOf(((Object) (s))).length());
	//    7   13:new             #33  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:bipush          23
	//   10   19:aload_3         
	//   11   20:invokestatic    #39  <Method String String.valueOf(Object)>
	//   12   23:invokevirtual   #42  <Method int String.length()>
	//   13   26:iadd            
	//   14   27:invokespecial   #43  <Method void StringBuilder(int)>
	//   15   30:astore          4
		stringbuilder.append("AdWorker(");
	//   16   32:aload           4
	//   17   34:ldc1            #45  <String "AdWorker(">
	//   18   36:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(s);
	//   20   40:aload           4
	//   21   42:aload_3         
	//   22   43:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(") #");
	//   24   47:aload           4
	//   25   49:ldc1            #51  <String ") #">
	//   26   51:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		stringbuilder.append(i);
	//   28   55:aload           4
	//   29   57:iload_2         
	//   30   58:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   31   61:pop             
		return new Thread(runnable, stringbuilder.toString());
	//   32   62:new             #56  <Class Thread>
	//   33   65:dup             
	//   34   66:aload_1         
	//   35   67:aload           4
	//   36   69:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   37   72:invokespecial   #63  <Method void Thread(Runnable, String)>
	//   38   75:areturn         
	}

	private final AtomicInteger zzcnz = new AtomicInteger(1);
	private final String zzcrl;
}
