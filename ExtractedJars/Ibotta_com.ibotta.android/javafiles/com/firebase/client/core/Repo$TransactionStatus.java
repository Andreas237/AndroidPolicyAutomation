// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			Repo

private static final class Repo$TransactionStatus extends Enum
{

	public static Repo$TransactionStatus valueOf(String s)
	{
		return (Repo$TransactionStatus)Enum.valueOf(com/firebase/client/core/Repo$TransactionStatus, s);
	//    0    0:ldc1            #2   <Class Repo$TransactionStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Repo$TransactionStatus>
	//    4    9:areturn         
	}

	public static Repo$TransactionStatus[] values()
	{
		return (Repo$TransactionStatus[])((Repo$TransactionStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field Repo$TransactionStatus[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.firebase.client.core.Repo$TransactionStatus_3B_.clone()>
	//    2    6:checkcast       #54  <Class Repo$TransactionStatus[]>
	//    3    9:areturn         
	}

	private static final Repo$TransactionStatus $VALUES[];
	public static final Repo$TransactionStatus COMPLETED;
	public static final Repo$TransactionStatus INITIALIZING;
	public static final Repo$TransactionStatus NEEDS_ABORT;
	public static final Repo$TransactionStatus RUN;
	public static final Repo$TransactionStatus SENT;
	public static final Repo$TransactionStatus SENT_NEEDS_ABORT;

	static 
	{
		INITIALIZING = new Repo$TransactionStatus("INITIALIZING", 0);
	//    0    0:new             #2   <Class Repo$TransactionStatus>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "INITIALIZING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
	//    5   10:putstatic       #26  <Field Repo$TransactionStatus INITIALIZING>
		RUN = new Repo$TransactionStatus("RUN", 1);
	//    6   13:new             #2   <Class Repo$TransactionStatus>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "RUN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
	//   11   23:putstatic       #29  <Field Repo$TransactionStatus RUN>
		SENT = new Repo$TransactionStatus("SENT", 2);
	//   12   26:new             #2   <Class Repo$TransactionStatus>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "SENT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
	//   17   36:putstatic       #32  <Field Repo$TransactionStatus SENT>
		COMPLETED = new Repo$TransactionStatus("COMPLETED", 3);
	//   18   39:new             #2   <Class Repo$TransactionStatus>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "COMPLETED">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
	//   23   49:putstatic       #35  <Field Repo$TransactionStatus COMPLETED>
		SENT_NEEDS_ABORT = new Repo$TransactionStatus("SENT_NEEDS_ABORT", 4);
	//   24   52:new             #2   <Class Repo$TransactionStatus>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "SENT_NEEDS_ABORT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
	//   29   62:putstatic       #38  <Field Repo$TransactionStatus SENT_NEEDS_ABORT>
		NEEDS_ABORT = new Repo$TransactionStatus("NEEDS_ABORT", 5);
	//   30   65:new             #2   <Class Repo$TransactionStatus>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "NEEDS_ABORT">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
	//   35   75:putstatic       #41  <Field Repo$TransactionStatus NEEDS_ABORT>
		$VALUES = (new Repo$TransactionStatus[] {
			INITIALIZING, RUN, SENT, COMPLETED, SENT_NEEDS_ABORT, NEEDS_ABORT
		});
	//   36   78:bipush          6
	//   37   80:anewarray       Repo$TransactionStatus[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field Repo$TransactionStatus INITIALIZING>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field Repo$TransactionStatus RUN>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field Repo$TransactionStatus SENT>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field Repo$TransactionStatus COMPLETED>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field Repo$TransactionStatus SENT_NEEDS_ABORT>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field Repo$TransactionStatus NEEDS_ABORT>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field Repo$TransactionStatus[] $VALUES>
	//*  63  122:return          
	}

	private Repo$TransactionStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
