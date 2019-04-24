// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;


// Referenced classes of package cn.com.fmsh.communication.core:
//			MessageHead

public static final class MessageHead$SecurityLevel extends Enum
{

	public static MessageHead$SecurityLevel valueOf(String s)
	{
		return (MessageHead$SecurityLevel)Enum.valueOf(cn/com/fmsh/communication/core/MessageHead$SecurityLevel, s);
	//    0    0:ldc1            #2   <Class MessageHead$SecurityLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MessageHead$SecurityLevel>
	//    4    9:areturn         
	}

	public static MessageHead$SecurityLevel[] values()
	{
		MessageHead$SecurityLevel amessagehead$securitylevel[] = ENUM$VALUES;
	//    0    0:getstatic       #29  <Field MessageHead$SecurityLevel[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = amessagehead$securitylevel.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		MessageHead$SecurityLevel amessagehead$securitylevel1[] = new MessageHead$SecurityLevel[i];
	//    5    7:iload_0         
	//    6    8:anewarray       MessageHead$SecurityLevel[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (amessagehead$securitylevel)), 0, ((Object) (amessagehead$securitylevel1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #48  <Method void System.arraycopy(Object, int, Object, int, int)>
		return amessagehead$securitylevel1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int value>
	//    2    4:ireturn         
	}

	public static final MessageHead$SecurityLevel CIPHER;
	private static final MessageHead$SecurityLevel ENUM$VALUES[];
	public static final MessageHead$SecurityLevel PLAIN;
	private int value;

	static 
	{
		PLAIN = new MessageHead$SecurityLevel("PLAIN", 0, 0);
	//    0    0:new             #2   <Class MessageHead$SecurityLevel>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "PLAIN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #22  <Method void MessageHead$SecurityLevel(String, int, int)>
	//    6   11:putstatic       #24  <Field MessageHead$SecurityLevel PLAIN>
		CIPHER = new MessageHead$SecurityLevel("CIPHER", 1, 1);
	//    7   14:new             #2   <Class MessageHead$SecurityLevel>
	//    8   17:dup             
	//    9   18:ldc1            #25  <String "CIPHER">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #22  <Method void MessageHead$SecurityLevel(String, int, int)>
	//   13   25:putstatic       #27  <Field MessageHead$SecurityLevel CIPHER>
		ENUM$VALUES = (new MessageHead$SecurityLevel[] {
			PLAIN, CIPHER
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       MessageHead$SecurityLevel[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #24  <Field MessageHead$SecurityLevel PLAIN>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #27  <Field MessageHead$SecurityLevel CIPHER>
	//   23   43:aastore         
	//   24   44:putstatic       #29  <Field MessageHead$SecurityLevel[] ENUM$VALUES>
	//*  25   47:return          
	}

	private MessageHead$SecurityLevel(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #35  <Field int value>
	//    7   11:return          
	}
}
