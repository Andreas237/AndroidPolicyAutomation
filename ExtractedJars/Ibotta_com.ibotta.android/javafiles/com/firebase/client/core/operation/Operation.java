// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.operation;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.ChildKey;

// Referenced classes of package com.firebase.client.core.operation:
//			OperationSource

public abstract class Operation
{
	public static final class OperationType extends Enum
	{

		public static OperationType valueOf(String s)
		{
			return (OperationType)Enum.valueOf(com/firebase/client/core/operation/Operation$OperationType, s);
		//    0    0:ldc1            #2   <Class Operation$OperationType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Operation$OperationType>
		//    4    9:areturn         
		}

		public static OperationType[] values()
		{
			return (OperationType[])((OperationType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field Operation$OperationType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.firebase.client.core.operation.Operation$OperationType_3B_.clone()>
		//    2    6:checkcast       #46  <Class Operation$OperationType[]>
		//    3    9:areturn         
		}

		private static final OperationType $VALUES[];
		public static final OperationType AckUserWrite;
		public static final OperationType ListenComplete;
		public static final OperationType Merge;
		public static final OperationType Overwrite;

		static 
		{
			Overwrite = new OperationType("Overwrite", 0);
		//    0    0:new             #2   <Class Operation$OperationType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "Overwrite">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void Operation$OperationType(String, int)>
		//    5   10:putstatic       #24  <Field Operation$OperationType Overwrite>
			Merge = new OperationType("Merge", 1);
		//    6   13:new             #2   <Class Operation$OperationType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "Merge">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void Operation$OperationType(String, int)>
		//   11   23:putstatic       #27  <Field Operation$OperationType Merge>
			AckUserWrite = new OperationType("AckUserWrite", 2);
		//   12   26:new             #2   <Class Operation$OperationType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "AckUserWrite">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void Operation$OperationType(String, int)>
		//   17   36:putstatic       #30  <Field Operation$OperationType AckUserWrite>
			ListenComplete = new OperationType("ListenComplete", 3);
		//   18   39:new             #2   <Class Operation$OperationType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "ListenComplete">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void Operation$OperationType(String, int)>
		//   23   49:putstatic       #33  <Field Operation$OperationType ListenComplete>
			$VALUES = (new OperationType[] {
				Overwrite, Merge, AckUserWrite, ListenComplete
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       OperationType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field Operation$OperationType Overwrite>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field Operation$OperationType Merge>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field Operation$OperationType AckUserWrite>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field Operation$OperationType ListenComplete>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field Operation$OperationType[] $VALUES>
		//*  43   83:return          
		}

		private OperationType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	protected Operation(OperationType operationtype, OperationSource operationsource, Path path1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		type = operationtype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Operation$OperationType type>
		source = operationsource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field OperationSource source>
		path = path1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Path path>
	//   11   19:return          
	}

	public Path getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Path path>
	//    2    4:areturn         
	}

	public OperationSource getSource()
	{
		return source;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field OperationSource source>
	//    2    4:areturn         
	}

	public OperationType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Operation$OperationType type>
	//    2    4:areturn         
	}

	public abstract Operation operationForChild(ChildKey childkey);

	protected final Path path;
	protected final OperationSource source;
	protected final OperationType type;
}
