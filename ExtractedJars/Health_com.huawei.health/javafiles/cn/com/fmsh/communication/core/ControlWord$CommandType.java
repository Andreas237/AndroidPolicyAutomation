// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;


// Referenced classes of package cn.com.fmsh.communication.core:
//			ControlWord

public static final class ControlWord$CommandType extends Enum
{

	public static ControlWord$CommandType valueOf(String s)
	{
		return (ControlWord$CommandType)Enum.valueOf(cn/com/fmsh/communication/core/ControlWord$CommandType, s);
	//    0    0:ldc1            #2   <Class ControlWord$CommandType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ControlWord$CommandType>
	//    4    9:areturn         
	}

	public static ControlWord$CommandType[] values()
	{
		ControlWord$CommandType acontrolword$commandtype[] = ENUM$VALUES;
	//    0    0:getstatic       #37  <Field ControlWord$CommandType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = acontrolword$commandtype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		ControlWord$CommandType acontrolword$commandtype1[] = new ControlWord$CommandType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       ControlWord$CommandType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (acontrolword$commandtype)), 0, ((Object) (acontrolword$commandtype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		return acontrolword$commandtype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public static final ControlWord$CommandType BUSINESS_ERROR;
	public static final ControlWord$CommandType CLOSESESSION;
	private static final ControlWord$CommandType ENUM$VALUES[];
	public static final ControlWord$CommandType HEARTBEAT;
	public static final ControlWord$CommandType OPENSESSION;
	private int value;

	static 
	{
		HEARTBEAT = new ControlWord$CommandType("HEARTBEAT", 0, 0);
	//    0    0:new             #2   <Class ControlWord$CommandType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "HEARTBEAT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
	//    6   11:putstatic       #26  <Field ControlWord$CommandType HEARTBEAT>
		OPENSESSION = new ControlWord$CommandType("OPENSESSION", 1, 1);
	//    7   14:new             #2   <Class ControlWord$CommandType>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "OPENSESSION">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
	//   13   25:putstatic       #29  <Field ControlWord$CommandType OPENSESSION>
		CLOSESESSION = new ControlWord$CommandType("CLOSESESSION", 2, 2);
	//   14   28:new             #2   <Class ControlWord$CommandType>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "CLOSESESSION">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
	//   20   39:putstatic       #32  <Field ControlWord$CommandType CLOSESESSION>
		BUSINESS_ERROR = new ControlWord$CommandType("BUSINESS_ERROR", 3, 3);
	//   21   42:new             #2   <Class ControlWord$CommandType>
	//   22   45:dup             
	//   23   46:ldc1            #33  <String "BUSINESS_ERROR">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #24  <Method void ControlWord$CommandType(String, int, int)>
	//   27   53:putstatic       #35  <Field ControlWord$CommandType BUSINESS_ERROR>
		ENUM$VALUES = (new ControlWord$CommandType[] {
			HEARTBEAT, OPENSESSION, CLOSESESSION, BUSINESS_ERROR
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       ControlWord$CommandType[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #26  <Field ControlWord$CommandType HEARTBEAT>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #29  <Field ControlWord$CommandType OPENSESSION>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #32  <Field ControlWord$CommandType CLOSESESSION>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #35  <Field ControlWord$CommandType BUSINESS_ERROR>
	//   45   83:aastore         
	//   46   84:putstatic       #37  <Field ControlWord$CommandType[] ENUM$VALUES>
	//*  47   87:return          
	}

	private ControlWord$CommandType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #43  <Field int value>
	//    7   11:return          
	}
}
