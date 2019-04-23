// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bav, azy, agh, awp, 
//			bsm, bsq

public class azx
{

	public azx(bav bav1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		c = bav1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field bav c>
		((Executor) (bav1.c())).execute(((Runnable) (new azy(this))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #37  <Method java.util.concurrent.ExecutorService bav.c()>
	//    7   13:new             #39  <Class azy>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #42  <Method void azy(azx)>
	//   11   21:invokeinterface #48  <Method void Executor.execute(Runnable)>
	//   12   26:return          
	}

	public static int a()
	{
		RuntimeException runtimeexception;
		int i;
		try
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #57  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
				return ThreadLocalRandom.current().nextInt();
	//    3    8:invokestatic    #63  <Method ThreadLocalRandom ThreadLocalRandom.current()>
	//    4   11:invokevirtual   #66  <Method int ThreadLocalRandom.nextInt()>
	//    5   14:ireturn         
			i = c().nextInt();
	//    6   15:invokestatic    #69  <Method Random c()>
	//    7   18:invokevirtual   #72  <Method int Random.nextInt()>
	//    8   21:istore_0        
		}
	//*   9   22:iload_0         
	//*  10   23:ireturn         
	//*  11   24:invokestatic    #69  <Method Random c()>
	//*  12   27:invokevirtual   #72  <Method int Random.nextInt()>
	//*  13   30:ireturn         
		// Misplaced declaration of an exception variable
		catch(RuntimeException runtimeexception)
		{
			return c().nextInt();
		}
		return i;
	//*  14   31:astore_1        
	//*  15   32:goto            24
	}

	static bav a(azx azx1)
	{
		return azx1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field bav c>
	//    2    4:areturn         
	}

	static ConditionVariable b()
	{
		return d;
	//    0    0:getstatic       #23  <Field ConditionVariable d>
	//    1    3:areturn         
	}

	private static Random c()
	{
		if(e != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #27  <Field Random e>
	//    1    3:ifnonnull       37
		com/google/android/gms/internal/ads/azx;
	//    2    6:ldc1            #2   <Class azx>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(e == null)
	//*   4    9:getstatic       #27  <Field Random e>
	//*   5   12:ifnonnull       25
			e = new Random();
	//    6   15:new             #71  <Class Random>
	//    7   18:dup             
	//    8   19:invokespecial   #75  <Method void Random()>
	//    9   22:putstatic       #27  <Field Random e>
		com/google/android/gms/internal/ads/azx;
	//   10   25:ldc1            #2   <Class azx>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/google/android/gms/internal/ads/azx;
	//   14   32:ldc1            #2   <Class azx>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return e;
	//   18   37:getstatic       #27  <Field Random e>
	//   19   40:areturn         
	}

	public final void a(int i, int j, long l)
	{
		try
		{
			d.block();
	//    0    0:getstatic       #23  <Field ConditionVariable d>
	//    1    3:invokevirtual   #81  <Method void ConditionVariable.block()>
			if(b.booleanValue() && a != null)
	//*   2    6:aload_0         
	//*   3    7:getfield        #83  <Field Boolean b>
	//*   4   10:invokevirtual   #89  <Method boolean Boolean.booleanValue()>
	//*   5   13:ifeq            87
	//*   6   16:getstatic       #25  <Field bsm a>
	//*   7   19:ifnull          87
			{
				Object obj = ((Object) (new agh()));
	//    8   22:new             #91  <Class agh>
	//    9   25:dup             
	//   10   26:invokespecial   #92  <Method void agh()>
	//   11   29:astore          5
				obj.a = c.a.getPackageName();
	//   12   31:aload           5
	//   13   33:aload_0         
	//   14   34:getfield        #32  <Field bav c>
	//   15   37:getfield        #95  <Field Context bav.a>
	//   16   40:invokevirtual   #101 <Method String Context.getPackageName()>
	//   17   43:putfield        #104 <Field String agh.a>
				obj.b = Long.valueOf(l);
	//   18   46:aload           5
	//   19   48:lload_3         
	//   20   49:invokestatic    #110 <Method Long Long.valueOf(long)>
	//   21   52:putfield        #113 <Field Long agh.b>
				obj = ((Object) (a.a(awp.a(((awp) (obj))))));
	//   22   55:getstatic       #25  <Field bsm a>
	//   23   58:aload           5
	//   24   60:invokestatic    #118 <Method byte[] awp.a(awp)>
	//   25   63:invokevirtual   #123 <Method bsq bsm.a(byte[])>
	//   26   66:astore          5
				((bsq) (obj)).a(j);
	//   27   68:aload           5
	//   28   70:iload_2         
	//   29   71:invokevirtual   #128 <Method bsq bsq.a(int)>
	//   30   74:pop             
				((bsq) (obj)).b(i);
	//   31   75:aload           5
	//   32   77:iload_1         
	//   33   78:invokevirtual   #130 <Method bsq bsq.b(int)>
	//   34   81:pop             
				((bsq) (obj)).a();
	//   35   82:aload           5
	//   36   84:invokevirtual   #132 <Method void bsq.a()>
			}
			return;
	//   37   87:return          
		}
		catch(Exception exception)
	//*  38   88:astore          5
		{
			return;
	//   39   90:return          
		}
	}

	protected static volatile bsm a = null;
	private static final ConditionVariable d = new ConditionVariable();
	private static volatile Random e = null;
	protected volatile Boolean b;
	private bav c;

	static 
	{
	//    0    0:new             #18  <Class ConditionVariable>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ConditionVariable()>
	//    3    7:putstatic       #23  <Field ConditionVariable d>
	//    4   10:aconst_null     
	//    5   11:putstatic       #25  <Field bsm a>
	//    6   14:aconst_null     
	//    7   15:putstatic       #27  <Field Random e>
	//*   8   18:return          
	}
}
