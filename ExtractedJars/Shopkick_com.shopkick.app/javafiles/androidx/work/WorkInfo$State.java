// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			WorkInfo

public static final class WorkInfo$State extends Enum
{

	public static WorkInfo$State valueOf(String s)
	{
		return (WorkInfo$State)Enum.valueOf(androidx/work/WorkInfo$State, s);
	//    0    0:ldc1            #2   <Class WorkInfo$State>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class WorkInfo$State>
	//    4    9:areturn         
	}

	public static WorkInfo$State[] values()
	{
		return (WorkInfo$State[])((WorkInfo$State []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field WorkInfo$State[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Landroidx.work.WorkInfo$State_3B_.clone()>
	//    2    6:checkcast       #54  <Class WorkInfo$State[]>
	//    3    9:areturn         
	}

	public boolean isFinished()
	{
		return this == SUCCEEDED || this == FAILED || this == CANCELLED;
	//    0    0:aload_0         
	//    1    1:getstatic       #32  <Field WorkInfo$State SUCCEEDED>
	//    2    4:if_acmpeq       26
	//    3    7:aload_0         
	//    4    8:getstatic       #35  <Field WorkInfo$State FAILED>
	//    5   11:if_acmpeq       26
	//    6   14:aload_0         
	//    7   15:getstatic       #41  <Field WorkInfo$State CANCELLED>
	//    8   18:if_acmpne       24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	private static final WorkInfo$State $VALUES[];
	public static final WorkInfo$State BLOCKED;
	public static final WorkInfo$State CANCELLED;
	public static final WorkInfo$State ENQUEUED;
	public static final WorkInfo$State FAILED;
	public static final WorkInfo$State RUNNING;
	public static final WorkInfo$State SUCCEEDED;

	static 
	{
		ENQUEUED = new WorkInfo$State("ENQUEUED", 0);
	//    0    0:new             #2   <Class WorkInfo$State>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "ENQUEUED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void WorkInfo$State(String, int)>
	//    5   10:putstatic       #26  <Field WorkInfo$State ENQUEUED>
		RUNNING = new WorkInfo$State("RUNNING", 1);
	//    6   13:new             #2   <Class WorkInfo$State>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "RUNNING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void WorkInfo$State(String, int)>
	//   11   23:putstatic       #29  <Field WorkInfo$State RUNNING>
		SUCCEEDED = new WorkInfo$State("SUCCEEDED", 2);
	//   12   26:new             #2   <Class WorkInfo$State>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "SUCCEEDED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void WorkInfo$State(String, int)>
	//   17   36:putstatic       #32  <Field WorkInfo$State SUCCEEDED>
		FAILED = new WorkInfo$State("FAILED", 3);
	//   18   39:new             #2   <Class WorkInfo$State>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "FAILED">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void WorkInfo$State(String, int)>
	//   23   49:putstatic       #35  <Field WorkInfo$State FAILED>
		BLOCKED = new WorkInfo$State("BLOCKED", 4);
	//   24   52:new             #2   <Class WorkInfo$State>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "BLOCKED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void WorkInfo$State(String, int)>
	//   29   62:putstatic       #38  <Field WorkInfo$State BLOCKED>
		CANCELLED = new WorkInfo$State("CANCELLED", 5);
	//   30   65:new             #2   <Class WorkInfo$State>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "CANCELLED">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void WorkInfo$State(String, int)>
	//   35   75:putstatic       #41  <Field WorkInfo$State CANCELLED>
		$VALUES = (new WorkInfo$State[] {
			ENQUEUED, RUNNING, SUCCEEDED, FAILED, BLOCKED, CANCELLED
		});
	//   36   78:bipush          6
	//   37   80:anewarray       WorkInfo$State[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field WorkInfo$State ENQUEUED>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field WorkInfo$State RUNNING>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field WorkInfo$State SUCCEEDED>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field WorkInfo$State FAILED>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field WorkInfo$State BLOCKED>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field WorkInfo$State CANCELLED>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field WorkInfo$State[] $VALUES>
	//*  63  122:return          
	}

	private WorkInfo$State(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
