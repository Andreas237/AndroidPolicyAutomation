// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message;

import cn.com.fmsh.communication.message.core.MessageHandler;

public class MessageHandleFactory
{

	private MessageHandleFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static MessageHandler getMessageHandler()
	{
		if(messageHandler == null)
	//*   0    0:getstatic       #15  <Field MessageHandler messageHandler>
	//*   1    3:ifnonnull       9
			messageHandlerInit();
	//    2    6:invokestatic    #18  <Method void messageHandlerInit()>
		return messageHandler;
	//    3    9:getstatic       #15  <Field MessageHandler messageHandler>
	//    4   12:areturn         
	}

	private static void messageHandlerInit()
	{
		cn/com/fmsh/communication/message/MessageHandleFactory;
	//    0    0:ldc1            #2   <Class MessageHandleFactory>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(messageHandler == null)
	//*   2    3:getstatic       #15  <Field MessageHandler messageHandler>
	//*   3    6:ifnonnull       19
			messageHandler = new MessageHandler();
	//    4    9:new             #20  <Class MessageHandler>
	//    5   12:dup             
	//    6   13:invokespecial   #21  <Method void MessageHandler()>
	//    7   16:putstatic       #15  <Field MessageHandler messageHandler>
		cn/com/fmsh/communication/message/MessageHandleFactory;
	//    8   19:ldc1            #2   <Class MessageHandleFactory>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		return;
	//   10   22:return          
		Exception exception;
		exception;
	//   11   23:astore_0        
	//*  12   24:ldc1            #2   <Class MessageHandleFactory>
		throw exception;
	//   13   26:monitorexit     
	//   14   27:aload_0         
	//   15   28:athrow          
	}

	private static MessageHandler messageHandler;
}
