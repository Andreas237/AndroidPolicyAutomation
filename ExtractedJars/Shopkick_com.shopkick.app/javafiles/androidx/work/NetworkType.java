// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


public final class NetworkType extends Enum
{

	private NetworkType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static NetworkType valueOf(String s)
	{
		return (NetworkType)Enum.valueOf(androidx/work/NetworkType, s);
	//    0    0:ldc1            #2   <Class NetworkType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class NetworkType>
	//    4    9:areturn         
	}

	public static NetworkType[] values()
	{
		return (NetworkType[])((NetworkType []) ($VALUES)).clone();
	//    0    0:getstatic       #36  <Field NetworkType[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Landroidx.work.NetworkType_3B_.clone()>
	//    2    6:checkcast       #47  <Class NetworkType[]>
	//    3    9:areturn         
	}

	private static final NetworkType $VALUES[];
	public static final NetworkType CONNECTED;
	public static final NetworkType METERED;
	public static final NetworkType NOT_REQUIRED;
	public static final NetworkType NOT_ROAMING;
	public static final NetworkType UNMETERED;

	static 
	{
		NOT_REQUIRED = new NetworkType("NOT_REQUIRED", 0);
	//    0    0:new             #2   <Class NetworkType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "NOT_REQUIRED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void NetworkType(String, int)>
	//    5   10:putstatic       #22  <Field NetworkType NOT_REQUIRED>
		CONNECTED = new NetworkType("CONNECTED", 1);
	//    6   13:new             #2   <Class NetworkType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "CONNECTED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void NetworkType(String, int)>
	//   11   23:putstatic       #25  <Field NetworkType CONNECTED>
		UNMETERED = new NetworkType("UNMETERED", 2);
	//   12   26:new             #2   <Class NetworkType>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "UNMETERED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void NetworkType(String, int)>
	//   17   36:putstatic       #28  <Field NetworkType UNMETERED>
		NOT_ROAMING = new NetworkType("NOT_ROAMING", 3);
	//   18   39:new             #2   <Class NetworkType>
	//   19   42:dup             
	//   20   43:ldc1            #29  <String "NOT_ROAMING">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #20  <Method void NetworkType(String, int)>
	//   23   49:putstatic       #31  <Field NetworkType NOT_ROAMING>
		METERED = new NetworkType("METERED", 4);
	//   24   52:new             #2   <Class NetworkType>
	//   25   55:dup             
	//   26   56:ldc1            #32  <String "METERED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #20  <Method void NetworkType(String, int)>
	//   29   62:putstatic       #34  <Field NetworkType METERED>
		$VALUES = (new NetworkType[] {
			NOT_REQUIRED, CONNECTED, UNMETERED, NOT_ROAMING, METERED
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       NetworkType[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #22  <Field NetworkType NOT_REQUIRED>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #25  <Field NetworkType CONNECTED>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #28  <Field NetworkType UNMETERED>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #31  <Field NetworkType NOT_ROAMING>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #34  <Field NetworkType METERED>
	//   51   98:aastore         
	//   52   99:putstatic       #36  <Field NetworkType[] $VALUES>
	//*  53  102:return          
	}
}
