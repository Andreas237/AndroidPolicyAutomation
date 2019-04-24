// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.console;

import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class CLog
{

	public CLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void writeToConsole(ChromePeerManager chromepeermanager, com.facebook.stetho.inspector.protocol.module.Console.MessageLevel messagelevel, com.facebook.stetho.inspector.protocol.module.Console.MessageSource messagesource, String s)
	{
		LogRedirector.d("CLog", s);
	//    0    0:ldc1            #8   <String "CLog">
	//    1    2:aload_3         
	//    2    3:invokestatic    #21  <Method void LogRedirector.d(String, String)>
		com.facebook.stetho.inspector.protocol.module.Console.ConsoleMessage consolemessage = new com.facebook.stetho.inspector.protocol.module.Console.ConsoleMessage();
	//    3    6:new             #23  <Class com.facebook.stetho.inspector.protocol.module.Console$ConsoleMessage>
	//    4    9:dup             
	//    5   10:invokespecial   #24  <Method void com.facebook.stetho.inspector.protocol.module.Console$ConsoleMessage()>
	//    6   13:astore          4
		consolemessage.source = messagesource;
	//    7   15:aload           4
	//    8   17:aload_2         
	//    9   18:putfield        #28  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$ConsoleMessage.source>
		consolemessage.level = messagelevel;
	//   10   21:aload           4
	//   11   23:aload_1         
	//   12   24:putfield        #32  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$ConsoleMessage.level>
		consolemessage.text = s;
	//   13   27:aload           4
	//   14   29:aload_3         
	//   15   30:putfield        #35  <Field String com.facebook.stetho.inspector.protocol.module.Console$ConsoleMessage.text>
		messagelevel = ((com.facebook.stetho.inspector.protocol.module.Console.MessageLevel) (new com.facebook.stetho.inspector.protocol.module.Console.MessageAddedRequest()));
	//   16   33:new             #37  <Class com.facebook.stetho.inspector.protocol.module.Console$MessageAddedRequest>
	//   17   36:dup             
	//   18   37:invokespecial   #38  <Method void com.facebook.stetho.inspector.protocol.module.Console$MessageAddedRequest()>
	//   19   40:astore_1        
		messagelevel.message = consolemessage;
	//   20   41:aload_1         
	//   21   42:aload           4
	//   22   44:putfield        #42  <Field com.facebook.stetho.inspector.protocol.module.Console$ConsoleMessage com.facebook.stetho.inspector.protocol.module.Console$MessageAddedRequest.message>
		chromepeermanager.sendNotificationToPeers("Console.messageAdded", ((Object) (messagelevel)));
	//   23   47:aload_0         
	//   24   48:ldc1            #44  <String "Console.messageAdded">
	//   25   50:aload_1         
	//   26   51:invokevirtual   #50  <Method void ChromePeerManager.sendNotificationToPeers(String, Object)>
	//   27   54:return          
	}

	private static final String TAG = "CLog";
}
