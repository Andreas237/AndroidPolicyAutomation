// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

public static final class AsyncTask$Status extends Enum
{

	public static AsyncTask$Status valueOf(String s)
	{
		return (AsyncTask$Status)Enum.valueOf(io/fabric/sdk/android/services/concurrency/AsyncTask$Status, s);
	//    0    0:ldc1            #2   <Class AsyncTask$Status>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AsyncTask$Status>
	//    4    9:areturn         
	}

	public static AsyncTask$Status[] values()
	{
		return (AsyncTask$Status[])((AsyncTask$Status []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field AsyncTask$Status[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lio.fabric.sdk.android.services.concurrency.AsyncTask$Status_3B_.clone()>
	//    2    6:checkcast       #42  <Class AsyncTask$Status[]>
	//    3    9:areturn         
	}

	private static final AsyncTask$Status $VALUES[];
	public static final AsyncTask$Status FINISHED;
	public static final AsyncTask$Status PENDING;
	public static final AsyncTask$Status RUNNING;

	static 
	{
		PENDING = new AsyncTask$Status("PENDING", 0);
	//    0    0:new             #2   <Class AsyncTask$Status>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "PENDING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void AsyncTask$Status(String, int)>
	//    5   10:putstatic       #23  <Field AsyncTask$Status PENDING>
		RUNNING = new AsyncTask$Status("RUNNING", 1);
	//    6   13:new             #2   <Class AsyncTask$Status>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "RUNNING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void AsyncTask$Status(String, int)>
	//   11   23:putstatic       #26  <Field AsyncTask$Status RUNNING>
		FINISHED = new AsyncTask$Status("FINISHED", 2);
	//   12   26:new             #2   <Class AsyncTask$Status>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "FINISHED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void AsyncTask$Status(String, int)>
	//   17   36:putstatic       #29  <Field AsyncTask$Status FINISHED>
		$VALUES = (new AsyncTask$Status[] {
			PENDING, RUNNING, FINISHED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       AsyncTask$Status[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field AsyncTask$Status PENDING>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field AsyncTask$Status RUNNING>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field AsyncTask$Status FINISHED>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field AsyncTask$Status[] $VALUES>
	//*  33   64:return          
	}

	private AsyncTask$Status(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
