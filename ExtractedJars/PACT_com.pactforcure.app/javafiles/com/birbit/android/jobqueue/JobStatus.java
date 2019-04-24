// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;


public final class JobStatus extends Enum
{

	private JobStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static JobStatus valueOf(String s)
	{
		return (JobStatus)Enum.valueOf(com/birbit/android/jobqueue/JobStatus, s);
	//    0    0:ldc1            #2   <Class JobStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JobStatus>
	//    4    9:areturn         
	}

	public static JobStatus[] values()
	{
		return (JobStatus[])((JobStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #32  <Field JobStatus[] $VALUES>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.birbit.android.jobqueue.JobStatus_3B_.clone()>
	//    2    6:checkcast       #43  <Class JobStatus[]>
	//    3    9:areturn         
	}

	private static final JobStatus $VALUES[];
	public static final JobStatus RUNNING;
	public static final JobStatus UNKNOWN;
	public static final JobStatus WAITING_NOT_READY;
	public static final JobStatus WAITING_READY;

	static 
	{
		WAITING_NOT_READY = new JobStatus("WAITING_NOT_READY", 0);
	//    0    0:new             #2   <Class JobStatus>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "WAITING_NOT_READY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void JobStatus(String, int)>
	//    5   10:putstatic       #21  <Field JobStatus WAITING_NOT_READY>
		WAITING_READY = new JobStatus("WAITING_READY", 1);
	//    6   13:new             #2   <Class JobStatus>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "WAITING_READY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void JobStatus(String, int)>
	//   11   23:putstatic       #24  <Field JobStatus WAITING_READY>
		RUNNING = new JobStatus("RUNNING", 2);
	//   12   26:new             #2   <Class JobStatus>
	//   13   29:dup             
	//   14   30:ldc1            #25  <String "RUNNING">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void JobStatus(String, int)>
	//   17   36:putstatic       #27  <Field JobStatus RUNNING>
		UNKNOWN = new JobStatus("UNKNOWN", 3);
	//   18   39:new             #2   <Class JobStatus>
	//   19   42:dup             
	//   20   43:ldc1            #28  <String "UNKNOWN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void JobStatus(String, int)>
	//   23   49:putstatic       #30  <Field JobStatus UNKNOWN>
		$VALUES = (new JobStatus[] {
			WAITING_NOT_READY, WAITING_READY, RUNNING, UNKNOWN
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       JobStatus[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field JobStatus WAITING_NOT_READY>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #24  <Field JobStatus WAITING_READY>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #27  <Field JobStatus RUNNING>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #30  <Field JobStatus UNKNOWN>
	//   41   79:aastore         
	//   42   80:putstatic       #32  <Field JobStatus[] $VALUES>
	//*  43   83:return          
	}
}
