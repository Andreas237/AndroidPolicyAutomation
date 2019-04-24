// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;


// Referenced classes of package cn.com.fmsh.communication.core:
//			MessageHead

public static final class MessageHead$CheckType extends Enum
{

	public static MessageHead$CheckType valueOf(String s)
	{
		return (MessageHead$CheckType)Enum.valueOf(cn/com/fmsh/communication/core/MessageHead$CheckType, s);
	//    0    0:ldc1            #2   <Class MessageHead$CheckType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MessageHead$CheckType>
	//    4    9:areturn         
	}

	public static MessageHead$CheckType[] values()
	{
		MessageHead$CheckType amessagehead$checktype[] = ENUM$VALUES;
	//    0    0:getstatic       #33  <Field MessageHead$CheckType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = amessagehead$checktype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		MessageHead$CheckType amessagehead$checktype1[] = new MessageHead$CheckType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       MessageHead$CheckType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (amessagehead$checktype)), 0, ((Object) (amessagehead$checktype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
		return amessagehead$checktype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int value>
	//    2    4:ireturn         
	}

	public static final MessageHead$CheckType CRC16;
	private static final MessageHead$CheckType ENUM$VALUES[];
	public static final MessageHead$CheckType MAC;
	public static final MessageHead$CheckType NOCHECK;
	private int value;

	static 
	{
		NOCHECK = new MessageHead$CheckType("NOCHECK", 0, 0);
	//    0    0:new             #2   <Class MessageHead$CheckType>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "NOCHECK">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #23  <Method void MessageHead$CheckType(String, int, int)>
	//    6   11:putstatic       #25  <Field MessageHead$CheckType NOCHECK>
		MAC = new MessageHead$CheckType("MAC", 1, 1);
	//    7   14:new             #2   <Class MessageHead$CheckType>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "MAC">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #23  <Method void MessageHead$CheckType(String, int, int)>
	//   13   25:putstatic       #28  <Field MessageHead$CheckType MAC>
		CRC16 = new MessageHead$CheckType("CRC16", 2, 2);
	//   14   28:new             #2   <Class MessageHead$CheckType>
	//   15   31:dup             
	//   16   32:ldc1            #29  <String "CRC16">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #23  <Method void MessageHead$CheckType(String, int, int)>
	//   20   39:putstatic       #31  <Field MessageHead$CheckType CRC16>
		ENUM$VALUES = (new MessageHead$CheckType[] {
			NOCHECK, MAC, CRC16
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       MessageHead$CheckType[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #25  <Field MessageHead$CheckType NOCHECK>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #28  <Field MessageHead$CheckType MAC>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #31  <Field MessageHead$CheckType CRC16>
	//   34   63:aastore         
	//   35   64:putstatic       #33  <Field MessageHead$CheckType[] ENUM$VALUES>
	//*  36   67:return          
	}

	private MessageHead$CheckType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #39  <Field int value>
	//    7   11:return          
	}
}
