// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;


public final class DeliveryMechanism extends Enum
{

	private DeliveryMechanism(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #44  <Field int id>
	//    7   11:return          
	}

	public static DeliveryMechanism determineFrom(String s)
	{
		if("io.crash.air".equals(((Object) (s))))
	//*   0    0:ldc1            #13  <String "io.crash.air">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #54  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            13
			return TEST_DISTRIBUTION;
	//    4    9:getstatic       #33  <Field DeliveryMechanism TEST_DISTRIBUTION>
	//    5   12:areturn         
		if(s != null)
	//*   6   13:aload_0         
	//*   7   14:ifnull          21
			return APP_STORE;
	//    8   17:getstatic       #36  <Field DeliveryMechanism APP_STORE>
	//    9   20:areturn         
		else
			return DEVELOPER;
	//   10   21:getstatic       #27  <Field DeliveryMechanism DEVELOPER>
	//   11   24:areturn         
	}

	public static DeliveryMechanism valueOf(String s)
	{
		return (DeliveryMechanism)Enum.valueOf(io/fabric/sdk/android/services/common/DeliveryMechanism, s);
	//    0    0:ldc1            #2   <Class DeliveryMechanism>
	//    1    2:aload_0         
	//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DeliveryMechanism>
	//    4    9:areturn         
	}

	public static DeliveryMechanism[] values()
	{
		return (DeliveryMechanism[])((DeliveryMechanism []) ($VALUES)).clone();
	//    0    0:getstatic       #38  <Field DeliveryMechanism[] $VALUES>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lio.fabric.sdk.android.services.common.DeliveryMechanism_3B_.clone()>
	//    2    6:checkcast       #61  <Class DeliveryMechanism[]>
	//    3    9:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int id>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return Integer.toString(id);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int id>
	//    2    4:invokestatic    #74  <Method String Integer.toString(int)>
	//    3    7:areturn         
	}

	private static final DeliveryMechanism $VALUES[];
	public static final DeliveryMechanism APP_STORE;
	public static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
	public static final DeliveryMechanism DEVELOPER;
	public static final DeliveryMechanism TEST_DISTRIBUTION;
	public static final DeliveryMechanism USER_SIDELOAD;
	private final int id;

	static 
	{
		DEVELOPER = new DeliveryMechanism("DEVELOPER", 0, 1);
	//    0    0:new             #2   <Class DeliveryMechanism>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "DEVELOPER">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #25  <Method void DeliveryMechanism(String, int, int)>
	//    6   11:putstatic       #27  <Field DeliveryMechanism DEVELOPER>
		USER_SIDELOAD = new DeliveryMechanism("USER_SIDELOAD", 1, 2);
	//    7   14:new             #2   <Class DeliveryMechanism>
	//    8   17:dup             
	//    9   18:ldc1            #28  <String "USER_SIDELOAD">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #25  <Method void DeliveryMechanism(String, int, int)>
	//   13   25:putstatic       #30  <Field DeliveryMechanism USER_SIDELOAD>
		TEST_DISTRIBUTION = new DeliveryMechanism("TEST_DISTRIBUTION", 2, 3);
	//   14   28:new             #2   <Class DeliveryMechanism>
	//   15   31:dup             
	//   16   32:ldc1            #31  <String "TEST_DISTRIBUTION">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #25  <Method void DeliveryMechanism(String, int, int)>
	//   20   39:putstatic       #33  <Field DeliveryMechanism TEST_DISTRIBUTION>
		APP_STORE = new DeliveryMechanism("APP_STORE", 3, 4);
	//   21   42:new             #2   <Class DeliveryMechanism>
	//   22   45:dup             
	//   23   46:ldc1            #34  <String "APP_STORE">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #25  <Method void DeliveryMechanism(String, int, int)>
	//   27   53:putstatic       #36  <Field DeliveryMechanism APP_STORE>
		$VALUES = (new DeliveryMechanism[] {
			DEVELOPER, USER_SIDELOAD, TEST_DISTRIBUTION, APP_STORE
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       DeliveryMechanism[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #27  <Field DeliveryMechanism DEVELOPER>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #30  <Field DeliveryMechanism USER_SIDELOAD>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #33  <Field DeliveryMechanism TEST_DISTRIBUTION>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #36  <Field DeliveryMechanism APP_STORE>
	//   45   83:aastore         
	//   46   84:putstatic       #38  <Field DeliveryMechanism[] $VALUES>
	//*  47   87:return          
	}
}
