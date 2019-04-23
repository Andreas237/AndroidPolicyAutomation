// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			SingleRequest

private static final class SingleRequest$Status extends Enum
{

	public static SingleRequest$Status valueOf(String s)
	{
		return (SingleRequest$Status)Enum.valueOf(com/bumptech/glide/request/SingleRequest$Status, s);
	//    0    0:ldc1            #2   <Class SingleRequest$Status>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SingleRequest$Status>
	//    4    9:areturn         
	}

	public static SingleRequest$Status[] values()
	{
		return (SingleRequest$Status[])((SingleRequest$Status []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field SingleRequest$Status[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.bumptech.glide.request.SingleRequest$Status_3B_.clone()>
	//    2    6:checkcast       #54  <Class SingleRequest$Status[]>
	//    3    9:areturn         
	}

	private static final SingleRequest$Status $VALUES[];
	public static final SingleRequest$Status CLEARED;
	public static final SingleRequest$Status COMPLETE;
	public static final SingleRequest$Status FAILED;
	public static final SingleRequest$Status PENDING;
	public static final SingleRequest$Status RUNNING;
	public static final SingleRequest$Status WAITING_FOR_SIZE;

	static 
	{
		PENDING = new SingleRequest$Status("PENDING", 0);
	//    0    0:new             #2   <Class SingleRequest$Status>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "PENDING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
	//    5   10:putstatic       #26  <Field SingleRequest$Status PENDING>
		RUNNING = new SingleRequest$Status("RUNNING", 1);
	//    6   13:new             #2   <Class SingleRequest$Status>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "RUNNING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
	//   11   23:putstatic       #29  <Field SingleRequest$Status RUNNING>
		WAITING_FOR_SIZE = new SingleRequest$Status("WAITING_FOR_SIZE", 2);
	//   12   26:new             #2   <Class SingleRequest$Status>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "WAITING_FOR_SIZE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
	//   17   36:putstatic       #32  <Field SingleRequest$Status WAITING_FOR_SIZE>
		COMPLETE = new SingleRequest$Status("COMPLETE", 3);
	//   18   39:new             #2   <Class SingleRequest$Status>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "COMPLETE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
	//   23   49:putstatic       #35  <Field SingleRequest$Status COMPLETE>
		FAILED = new SingleRequest$Status("FAILED", 4);
	//   24   52:new             #2   <Class SingleRequest$Status>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "FAILED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
	//   29   62:putstatic       #38  <Field SingleRequest$Status FAILED>
		CLEARED = new SingleRequest$Status("CLEARED", 5);
	//   30   65:new             #2   <Class SingleRequest$Status>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "CLEARED">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
	//   35   75:putstatic       #41  <Field SingleRequest$Status CLEARED>
		$VALUES = (new SingleRequest$Status[] {
			PENDING, RUNNING, WAITING_FOR_SIZE, COMPLETE, FAILED, CLEARED
		});
	//   36   78:bipush          6
	//   37   80:anewarray       SingleRequest$Status[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field SingleRequest$Status PENDING>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field SingleRequest$Status RUNNING>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field SingleRequest$Status WAITING_FOR_SIZE>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field SingleRequest$Status COMPLETE>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field SingleRequest$Status FAILED>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field SingleRequest$Status CLEARED>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field SingleRequest$Status[] $VALUES>
	//*  63  122:return          
	}

	private SingleRequest$Status(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
