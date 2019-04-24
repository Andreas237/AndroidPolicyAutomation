// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			SingleRequest

static final class SingleRequest$Status extends Enum
{

	public static SingleRequest$Status valueOf(String s)
	{
		return (SingleRequest$Status)Enum.valueOf(com/bumptech/glide/request/SingleRequest$Status, s);
	//    0    0:ldc1            #2   <Class SingleRequest$Status>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SingleRequest$Status>
	//    4    9:areturn         
	}

	public static SingleRequest$Status[] values()
	{
		return (SingleRequest$Status[])((SingleRequest$Status []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field SingleRequest$Status[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.bumptech.glide.request.SingleRequest$Status_3B_.clone()>
	//    2    6:checkcast       #62  <Class SingleRequest$Status[]>
	//    3    9:areturn         
	}

	private static final SingleRequest$Status $VALUES[];
	public static final SingleRequest$Status CANCELLED;
	public static final SingleRequest$Status CLEARED;
	public static final SingleRequest$Status COMPLETE;
	public static final SingleRequest$Status FAILED;
	public static final SingleRequest$Status PAUSED;
	public static final SingleRequest$Status PENDING;
	public static final SingleRequest$Status RUNNING;
	public static final SingleRequest$Status WAITING_FOR_SIZE;

	static 
	{
		PENDING = new SingleRequest$Status("PENDING", 0);
	//    0    0:new             #2   <Class SingleRequest$Status>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "PENDING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//    5   10:putstatic       #28  <Field SingleRequest$Status PENDING>
		RUNNING = new SingleRequest$Status("RUNNING", 1);
	//    6   13:new             #2   <Class SingleRequest$Status>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "RUNNING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//   11   23:putstatic       #31  <Field SingleRequest$Status RUNNING>
		WAITING_FOR_SIZE = new SingleRequest$Status("WAITING_FOR_SIZE", 2);
	//   12   26:new             #2   <Class SingleRequest$Status>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "WAITING_FOR_SIZE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//   17   36:putstatic       #34  <Field SingleRequest$Status WAITING_FOR_SIZE>
		COMPLETE = new SingleRequest$Status("COMPLETE", 3);
	//   18   39:new             #2   <Class SingleRequest$Status>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "COMPLETE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//   23   49:putstatic       #37  <Field SingleRequest$Status COMPLETE>
		FAILED = new SingleRequest$Status("FAILED", 4);
	//   24   52:new             #2   <Class SingleRequest$Status>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "FAILED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//   29   62:putstatic       #40  <Field SingleRequest$Status FAILED>
		CANCELLED = new SingleRequest$Status("CANCELLED", 5);
	//   30   65:new             #2   <Class SingleRequest$Status>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "CANCELLED">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//   35   75:putstatic       #43  <Field SingleRequest$Status CANCELLED>
		CLEARED = new SingleRequest$Status("CLEARED", 6);
	//   36   78:new             #2   <Class SingleRequest$Status>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "CLEARED">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//   41   89:putstatic       #46  <Field SingleRequest$Status CLEARED>
		PAUSED = new SingleRequest$Status("PAUSED", 7);
	//   42   92:new             #2   <Class SingleRequest$Status>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "PAUSED">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
	//   47  103:putstatic       #49  <Field SingleRequest$Status PAUSED>
		$VALUES = (new SingleRequest$Status[] {
			PENDING, RUNNING, WAITING_FOR_SIZE, COMPLETE, FAILED, CANCELLED, CLEARED, PAUSED
		});
	//   48  106:bipush          8
	//   49  108:anewarray       SingleRequest$Status[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #28  <Field SingleRequest$Status PENDING>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #31  <Field SingleRequest$Status RUNNING>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #34  <Field SingleRequest$Status WAITING_FOR_SIZE>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #37  <Field SingleRequest$Status COMPLETE>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #40  <Field SingleRequest$Status FAILED>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #43  <Field SingleRequest$Status CANCELLED>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #46  <Field SingleRequest$Status CLEARED>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #49  <Field SingleRequest$Status PAUSED>
	//   81  160:aastore         
	//   82  161:putstatic       #51  <Field SingleRequest$Status[] $VALUES>
	//*  83  164:return          
	}

	private SingleRequest$Status(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
