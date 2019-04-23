// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

final class DirectExecutor extends Enum
	implements Executor
{

	private DirectExecutor(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static DirectExecutor valueOf(String s)
	{
		return (DirectExecutor)Enum.valueOf(androidx/work/impl/utils/futures/DirectExecutor, s);
	//    0    0:ldc1            #2   <Class DirectExecutor>
	//    1    2:aload_0         
	//    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DirectExecutor>
	//    4    9:areturn         
	}

	public static DirectExecutor[] values()
	{
		return (DirectExecutor[])((DirectExecutor []) ($VALUES)).clone();
	//    0    0:getstatic       #26  <Field DirectExecutor[] $VALUES>
	//    1    3:invokevirtual   #41  <Method Object _5B_Landroidx.work.impl.utils.futures.DirectExecutor_3B_.clone()>
	//    2    6:checkcast       #37  <Class DirectExecutor[]>
	//    3    9:areturn         
	}

	public void execute(Runnable runnable)
	{
		runnable.run();
	//    0    0:aload_1         
	//    1    1:invokeinterface #48  <Method void Runnable.run()>
	//    2    6:return          
	}

	public String toString()
	{
		return "DirectExecutor";
	//    0    0:ldc1            #52  <String "DirectExecutor">
	//    1    2:areturn         
	}

	private static final DirectExecutor $VALUES[];
	public static final DirectExecutor INSTANCE;

	static 
	{
		INSTANCE = new DirectExecutor("INSTANCE", 0);
	//    0    0:new             #2   <Class DirectExecutor>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "INSTANCE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void DirectExecutor(String, int)>
	//    5   10:putstatic       #24  <Field DirectExecutor INSTANCE>
		$VALUES = (new DirectExecutor[] {
			INSTANCE
		});
	//    6   13:iconst_1        
	//    7   14:anewarray       DirectExecutor[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:getstatic       #24  <Field DirectExecutor INSTANCE>
	//   11   22:aastore         
	//   12   23:putstatic       #26  <Field DirectExecutor[] $VALUES>
	//*  13   26:return          
	}
}
