// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.*;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.truenet.android:
//			TrueNetSDK, d

static final class TrueNetSDK$b
	implements ThreadFactory
{

	public final Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (new Thread(runnable)));
	//    0    0:new             #26  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #29  <Method void Thread(Runnable)>
	//    4    8:astore_1        
		((Thread) (runnable)).setUncaughtExceptionHandler((htExceptionHandler)new d((w)new w(TrueNetSDK.Companion) {

			public final au a()
			{
				return ((au) (ak.a(com/truenet/android/TrueNetSDK$a)));
			//    0    0:ldc1            #22  <Class TrueNetSDK$a>
			//    1    2:invokestatic    #27  <Method android.support.v7.at ak.a(Class)>
			//    2    5:areturn         
			}

			public volatile Object a(Object obj, Object obj1)
			{
				a((Thread)obj, (Throwable)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class Thread>
			//    3    5:aload_2         
			//    4    6:checkcast       #32  <Class Throwable>
			//    5    9:invokevirtual   #35  <Method void a(Thread, Throwable)>
				return ((Object) (br.a));
			//    6   12:getstatic       #40  <Field br br.a>
			//    7   15:areturn         
			}

			public final void a(Thread thread, Throwable throwable)
			{
				ae.b(((Object) (thread)), "p1");
			//    0    0:aload_1         
			//    1    1:ldc1            #43  <String "p1">
			//    2    3:invokestatic    #49  <Method void ae.b(Object, String)>
				ae.b(((Object) (throwable)), "p2");
			//    3    6:aload_2         
			//    4    7:ldc1            #51  <String "p2">
			//    5    9:invokestatic    #49  <Method void ae.b(Object, String)>
				TrueNetSDK.a.a((TrueNetSDK.a)receiver, thread, throwable);
			//    6   12:aload_0         
			//    7   13:getfield        #55  <Field Object receiver>
			//    8   16:checkcast       #22  <Class TrueNetSDK$a>
			//    9   19:aload_1         
			//   10   20:aload_2         
			//   11   21:invokestatic    #58  <Method void TrueNetSDK$a.a(TrueNetSDK$a, Thread, Throwable)>
			//   12   24:return          
			}

			public final String b()
			{
				return "uncaughtExceptionHandler";
			//    0    0:ldc1            #62  <String "uncaughtExceptionHandler">
			//    1    2:areturn         
			}

			public final String c()
			{
				return "uncaughtExceptionHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)V";
			//    0    0:ldc1            #65  <String "uncaughtExceptionHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)V">
			//    1    2:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:iconst_2        
			//    2    2:aload_1         
			//    3    3:invokespecial   #17  <Method void ad(int, Object)>
			//    4    6:return          
			}
		}
));
	//    5    9:aload_1         
	//    6   10:new             #31  <Class d>
	//    7   13:dup             
	//    8   14:new             #10  <Class TrueNetSDK$b$1>
	//    9   17:dup             
	//   10   18:getstatic       #35  <Field TrueNetSDK$a TrueNetSDK.Companion>
	//   11   21:invokespecial   #38  <Method void TrueNetSDK$b$1(TrueNetSDK$a)>
	//   12   24:checkcast       #40  <Class w>
	//   13   27:invokespecial   #43  <Method void d(w)>
	//   14   30:checkcast       #45  <Class Thread$UncaughtExceptionHandler>
	//   15   33:invokevirtual   #49  <Method void Thread.setUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
		return ((Thread) (runnable));
	//   16   36:aload_1         
	//   17   37:areturn         
	}

	public static final TrueNetSDK$b a = new TrueNetSDK$b();

	static 
	{
	//    0    0:new             #2   <Class TrueNetSDK$b>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void TrueNetSDK$b()>
	//    3    7:putstatic       #19  <Field TrueNetSDK$b a>
	//*   4   10:return          
	}

	TrueNetSDK$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
