// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

public static class GlideExecutor$UncaughtThrowableStrategy extends Enum
{

	public static GlideExecutor$UncaughtThrowableStrategy valueOf(String s)
	{
		return (GlideExecutor$UncaughtThrowableStrategy)Enum.valueOf(com/bumptech/glide/load/engine/executor/GlideExecutor$UncaughtThrowableStrategy, s);
	//    0    0:ldc1            #2   <Class GlideExecutor$UncaughtThrowableStrategy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GlideExecutor$UncaughtThrowableStrategy>
	//    4    9:areturn         
	}

	public static GlideExecutor$UncaughtThrowableStrategy[] values()
	{
		return (GlideExecutor$UncaughtThrowableStrategy[])((GlideExecutor$UncaughtThrowableStrategy []) ($VALUES)).clone();
	//    0    0:getstatic       #38  <Field GlideExecutor$UncaughtThrowableStrategy[] $VALUES>
	//    1    3:invokevirtual   #56  <Method Object _5B_Lcom.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy_3B_.clone()>
	//    2    6:checkcast       #52  <Class GlideExecutor$UncaughtThrowableStrategy[]>
	//    3    9:areturn         
	}

	protected void handle(Throwable throwable)
	{
	//    0    0:return          
	}

	private static final GlideExecutor$UncaughtThrowableStrategy $VALUES[];
	public static final GlideExecutor$UncaughtThrowableStrategy DEFAULT;
	public static final GlideExecutor$UncaughtThrowableStrategy IGNORE;
	public static final GlideExecutor$UncaughtThrowableStrategy LOG;
	public static final GlideExecutor$UncaughtThrowableStrategy THROW;

	static 
	{
		IGNORE = new GlideExecutor$UncaughtThrowableStrategy("IGNORE", 0);
	//    0    0:new             #2   <Class GlideExecutor$UncaughtThrowableStrategy>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "IGNORE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int)>
	//    5   10:putstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy IGNORE>
		LOG = ((GlideExecutor$UncaughtThrowableStrategy) (new GlideExecutor.UncaughtThrowableStrategy("LOG", 1) {

			protected void handle(Throwable throwable)
			{
				if(throwable != null && Log.isLoggable("GlideExecutor", 6))
			//*   0    0:aload_1         
			//*   1    1:ifnull          23
			//*   2    4:ldc1            #17  <String "GlideExecutor">
			//*   3    6:bipush          6
			//*   4    8:invokestatic    #23  <Method boolean Log.isLoggable(String, int)>
			//*   5   11:ifeq            23
					Log.e("GlideExecutor", "Request threw uncaught throwable", throwable);
			//    6   14:ldc1            #17  <String "GlideExecutor">
			//    7   16:ldc1            #25  <String "Request threw uncaught throwable">
			//    8   18:aload_1         
			//    9   19:invokestatic    #29  <Method int Log.e(String, String, Throwable)>
			//   10   22:pop             
			//   11   23:return          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int, GlideExecutor$1)>
			//    5    7:return          
			}
		}
));
	//    6   13:new             #10  <Class GlideExecutor$UncaughtThrowableStrategy$1>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "LOG">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #30  <Method void GlideExecutor$UncaughtThrowableStrategy$1(String, int)>
	//   11   23:putstatic       #32  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
		THROW = ((GlideExecutor$UncaughtThrowableStrategy) (new GlideExecutor.UncaughtThrowableStrategy("THROW", 2) {

			protected void handle(Throwable throwable)
			{
				handle(throwable);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #17  <Method void GlideExecutor$UncaughtThrowableStrategy.handle(Throwable)>
				if(throwable != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          20
					throw new RuntimeException("Request threw uncaught throwable", throwable);
			//    5    9:new             #19  <Class RuntimeException>
			//    6   12:dup             
			//    7   13:ldc1            #21  <String "Request threw uncaught throwable">
			//    8   15:aload_1         
			//    9   16:invokespecial   #24  <Method void RuntimeException(String, Throwable)>
			//   10   19:athrow          
				else
					return;
			//   11   20:return          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int, GlideExecutor$1)>
			//    5    7:return          
			}
		}
));
	//   12   26:new             #12  <Class GlideExecutor$UncaughtThrowableStrategy$2>
	//   13   29:dup             
	//   14   30:ldc1            #33  <String "THROW">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #34  <Method void GlideExecutor$UncaughtThrowableStrategy$2(String, int)>
	//   17   36:putstatic       #36  <Field GlideExecutor$UncaughtThrowableStrategy THROW>
		$VALUES = (new GlideExecutor$UncaughtThrowableStrategy[] {
			IGNORE, LOG, THROW
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       GlideExecutor$UncaughtThrowableStrategy[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy IGNORE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #32  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #36  <Field GlideExecutor$UncaughtThrowableStrategy THROW>
	//   31   60:aastore         
	//   32   61:putstatic       #38  <Field GlideExecutor$UncaughtThrowableStrategy[] $VALUES>
		DEFAULT = LOG;
	//   33   64:getstatic       #32  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
	//   34   67:putstatic       #40  <Field GlideExecutor$UncaughtThrowableStrategy DEFAULT>
	//*  35   70:return          
	}

	private GlideExecutor$UncaughtThrowableStrategy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	GlideExecutor$UncaughtThrowableStrategy(String s, int i, GlideExecutor._cls1 _pcls1)
	{
		this(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int)>
	//    4    6:return          
	}
}
