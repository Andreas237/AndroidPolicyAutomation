// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication;

import cn.com.fmsh.communication.core.TerminalCommunicationHandler;
import cn.com.fmsh.communication.core.TerminalCommunicationListImpl;

// Referenced classes of package cn.com.fmsh.communication:
//			TerminalCommunication, TerminalCommunicationList

public class CommunicationFactory
{

	private CommunicationFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static TerminalCommunication getTerminalCommunication()
	{
		if(terminalCommunication == null)
	//*   0    0:getstatic       #17  <Field TerminalCommunication terminalCommunication>
	//*   1    3:ifnonnull       16
			terminalCommunication = ((TerminalCommunication) (new TerminalCommunicationHandler()));
	//    2    6:new             #19  <Class TerminalCommunicationHandler>
	//    3    9:dup             
	//    4   10:invokespecial   #20  <Method void TerminalCommunicationHandler()>
	//    5   13:putstatic       #17  <Field TerminalCommunication terminalCommunication>
		return terminalCommunication;
	//    6   16:getstatic       #17  <Field TerminalCommunication terminalCommunication>
	//    7   19:areturn         
	}

	public static TerminalCommunicationList getTerminalCommunicationList()
	{
		if(terminalCommunicationList == null)
	//*   0    0:getstatic       #24  <Field TerminalCommunicationList terminalCommunicationList>
	//*   1    3:ifnonnull       16
			terminalCommunicationList = ((TerminalCommunicationList) (new TerminalCommunicationListImpl()));
	//    2    6:new             #26  <Class TerminalCommunicationListImpl>
	//    3    9:dup             
	//    4   10:invokespecial   #27  <Method void TerminalCommunicationListImpl()>
	//    5   13:putstatic       #24  <Field TerminalCommunicationList terminalCommunicationList>
		return terminalCommunicationList;
	//    6   16:getstatic       #24  <Field TerminalCommunicationList terminalCommunicationList>
	//    7   19:areturn         
	}

	private static TerminalCommunication terminalCommunication;
	private static TerminalCommunicationList terminalCommunicationList;
}
