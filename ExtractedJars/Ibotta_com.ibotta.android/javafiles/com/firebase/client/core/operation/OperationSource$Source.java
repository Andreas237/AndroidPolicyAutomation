// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.operation;


// Referenced classes of package com.firebase.client.core.operation:
//			OperationSource

private static final class OperationSource$Source extends Enum
{

	public static OperationSource$Source valueOf(String s)
	{
		return (OperationSource$Source)Enum.valueOf(com/firebase/client/core/operation/OperationSource$Source, s);
	//    0    0:ldc1            #2   <Class OperationSource$Source>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OperationSource$Source>
	//    4    9:areturn         
	}

	public static OperationSource$Source[] values()
	{
		return (OperationSource$Source[])((OperationSource$Source []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field OperationSource$Source[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.core.operation.OperationSource$Source_3B_.clone()>
	//    2    6:checkcast       #38  <Class OperationSource$Source[]>
	//    3    9:areturn         
	}

	private static final OperationSource$Source $VALUES[];
	public static final OperationSource$Source Server;
	public static final OperationSource$Source User;

	static 
	{
		User = new OperationSource$Source("User", 0);
	//    0    0:new             #2   <Class OperationSource$Source>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "User">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void OperationSource$Source(String, int)>
	//    5   10:putstatic       #22  <Field OperationSource$Source User>
		Server = new OperationSource$Source("Server", 1);
	//    6   13:new             #2   <Class OperationSource$Source>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "Server">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void OperationSource$Source(String, int)>
	//   11   23:putstatic       #25  <Field OperationSource$Source Server>
		$VALUES = (new OperationSource$Source[] {
			User, Server
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       OperationSource$Source[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field OperationSource$Source User>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field OperationSource$Source Server>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field OperationSource$Source[] $VALUES>
	//*  23   45:return          
	}

	private OperationSource$Source(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
