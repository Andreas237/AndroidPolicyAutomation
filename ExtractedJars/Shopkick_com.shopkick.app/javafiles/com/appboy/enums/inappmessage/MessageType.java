// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums.inappmessage;


public final class MessageType extends Enum
{

	private MessageType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MessageType valueOf(String s)
	{
		return (MessageType)Enum.valueOf(com/appboy/enums/inappmessage/MessageType, s);
	//    0    0:ldc1            #2   <Class MessageType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MessageType>
	//    4    9:areturn         
	}

	public static MessageType[] values()
	{
		return (MessageType[])((MessageType []) (a)).clone();
	//    0    0:getstatic       #32  <Field MessageType[] a>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.appboy.enums.inappmessage.MessageType_3B_.clone()>
	//    2    6:checkcast       #43  <Class MessageType[]>
	//    3    9:areturn         
	}

	public static final MessageType FULL;
	public static final MessageType HTML_FULL;
	public static final MessageType MODAL;
	public static final MessageType SLIDEUP;
	private static final MessageType a[];

	static 
	{
		SLIDEUP = new MessageType("SLIDEUP", 0);
	//    0    0:new             #2   <Class MessageType>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "SLIDEUP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void MessageType(String, int)>
	//    5   10:putstatic       #21  <Field MessageType SLIDEUP>
		MODAL = new MessageType("MODAL", 1);
	//    6   13:new             #2   <Class MessageType>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "MODAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void MessageType(String, int)>
	//   11   23:putstatic       #24  <Field MessageType MODAL>
		FULL = new MessageType("FULL", 2);
	//   12   26:new             #2   <Class MessageType>
	//   13   29:dup             
	//   14   30:ldc1            #25  <String "FULL">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void MessageType(String, int)>
	//   17   36:putstatic       #27  <Field MessageType FULL>
		HTML_FULL = new MessageType("HTML_FULL", 3);
	//   18   39:new             #2   <Class MessageType>
	//   19   42:dup             
	//   20   43:ldc1            #28  <String "HTML_FULL">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void MessageType(String, int)>
	//   23   49:putstatic       #30  <Field MessageType HTML_FULL>
		a = (new MessageType[] {
			SLIDEUP, MODAL, FULL, HTML_FULL
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       MessageType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field MessageType SLIDEUP>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #24  <Field MessageType MODAL>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #27  <Field MessageType FULL>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #30  <Field MessageType HTML_FULL>
	//   41   79:aastore         
	//   42   80:putstatic       #32  <Field MessageType[] a>
	//*  43   83:return          
	}
}
