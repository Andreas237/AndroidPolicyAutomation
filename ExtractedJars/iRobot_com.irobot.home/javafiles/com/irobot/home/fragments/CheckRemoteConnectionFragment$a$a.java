// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			CheckRemoteConnectionFragment

public static final class CheckRemoteConnectionFragment$a$a extends Enum
{

	public static CheckRemoteConnectionFragment$a$a valueOf(String s)
	{
		return (CheckRemoteConnectionFragment$a$a)Enum.valueOf(com/irobot/home/fragments/CheckRemoteConnectionFragment$a$a, s);
	//    0    0:ldc1            #2   <Class CheckRemoteConnectionFragment$a$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #45  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CheckRemoteConnectionFragment$a$a>
	//    4    9:areturn         
	}

	public static CheckRemoteConnectionFragment$a$a[] values()
	{
		return (CheckRemoteConnectionFragment$a$a[])((CheckRemoteConnectionFragment$a$a []) ($VALUES)).clone();
	//    0    0:getstatic       #37  <Field CheckRemoteConnectionFragment$a$a[] $VALUES>
	//    1    3:invokevirtual   #52  <Method Object _5B_Lcom.irobot.home.fragments.CheckRemoteConnectionFragment$a$a_3B_.clone()>
	//    2    6:checkcast       #48  <Class CheckRemoteConnectionFragment$a$a[]>
	//    3    9:areturn         
	}

	private static final CheckRemoteConnectionFragment$a$a $VALUES[];
	public static final CheckRemoteConnectionFragment$a$a BlockedMqttPort;
	public static final CheckRemoteConnectionFragment$a$a Failure;
	public static final CheckRemoteConnectionFragment$a$a NoInternetConnectivity;
	public static final CheckRemoteConnectionFragment$a$a Success;

	static 
	{
		Success = new CheckRemoteConnectionFragment$a$a("Success", 0);
	//    0    0:new             #2   <Class CheckRemoteConnectionFragment$a$a>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "Success">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
	//    5   10:putstatic       #26  <Field CheckRemoteConnectionFragment$a$a Success>
		Failure = new CheckRemoteConnectionFragment$a$a("Failure", 1);
	//    6   13:new             #2   <Class CheckRemoteConnectionFragment$a$a>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "Failure">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
	//   11   23:putstatic       #29  <Field CheckRemoteConnectionFragment$a$a Failure>
		NoInternetConnectivity = new CheckRemoteConnectionFragment$a$a("NoInternetConnectivity", 2);
	//   12   26:new             #2   <Class CheckRemoteConnectionFragment$a$a>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "NoInternetConnectivity">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
	//   17   36:putstatic       #32  <Field CheckRemoteConnectionFragment$a$a NoInternetConnectivity>
		BlockedMqttPort = new CheckRemoteConnectionFragment$a$a("BlockedMqttPort", 3);
	//   18   39:new             #2   <Class CheckRemoteConnectionFragment$a$a>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "BlockedMqttPort">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
	//   23   49:putstatic       #35  <Field CheckRemoteConnectionFragment$a$a BlockedMqttPort>
		$VALUES = (new CheckRemoteConnectionFragment$a$a[] {
			Success, Failure, NoInternetConnectivity, BlockedMqttPort
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       CheckRemoteConnectionFragment$a$a[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #26  <Field CheckRemoteConnectionFragment$a$a Success>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #29  <Field CheckRemoteConnectionFragment$a$a Failure>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #32  <Field CheckRemoteConnectionFragment$a$a NoInternetConnectivity>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #35  <Field CheckRemoteConnectionFragment$a$a BlockedMqttPort>
	//   41   79:aastore         
	//   42   80:putstatic       #37  <Field CheckRemoteConnectionFragment$a$a[] $VALUES>
	//*  43   83:return          
	}

	private CheckRemoteConnectionFragment$a$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #39  <Method void Enum(String, int)>
	//    4    6:return          
	}
}