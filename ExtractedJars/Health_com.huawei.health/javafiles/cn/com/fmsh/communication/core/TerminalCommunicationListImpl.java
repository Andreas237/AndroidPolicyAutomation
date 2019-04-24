// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;

import cn.com.fmsh.communication.TerminalCommunication;
import cn.com.fmsh.communication.TerminalCommunicationList;
import cn.com.fmsh.communication.exception.SocketException;
import java.util.*;

// Referenced classes of package cn.com.fmsh.communication.core:
//			TerminalCommunicationHandler

public class TerminalCommunicationListImpl
	implements TerminalCommunicationList
{

	public TerminalCommunicationListImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		list = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:putfield        #18  <Field Map list>
	//    7   15:return          
	}

	public void disConnect()
		throws SocketException
	{
		String as[] = (String[])list.keySet().toArray(((Object []) (new String[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map list>
	//    2    4:invokeinterface #28  <Method Set Map.keySet()>
	//    3    9:iconst_0        
	//    4   10:anewarray       String[]
	//    5   13:invokeinterface #36  <Method Object[] Set.toArray(Object[])>
	//    6   18:checkcast       #38  <Class String[]>
	//    7   21:astore_3        
		int j = as.length;
	//    8   22:aload_3         
	//    9   23:arraylength     
	//   10   24:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   25:iconst_0        
	//*  12   26:istore_1        
	//*  13   27:goto            78
		{
			Object obj = ((Object) (as[i]));
	//   14   30:aload_3         
	//   15   31:iload_1         
	//   16   32:aaload          
	//   17   33:astore          4
			obj = ((Object) ((TerminalCommunication)list.get(obj)));
	//   18   35:aload_0         
	//   19   36:getfield        #18  <Field Map list>
	//   20   39:aload           4
	//   21   41:invokeinterface #42  <Method Object Map.get(Object)>
	//   22   46:checkcast       #44  <Class TerminalCommunication>
	//   23   49:astore          4
			if(obj != null && ((TerminalCommunication) (obj)).isConnect())
	//*  24   51:aload           4
	//*  25   53:ifnull          74
	//*  26   56:aload           4
	//*  27   58:invokeinterface #48  <Method boolean TerminalCommunication.isConnect()>
	//*  28   63:ifeq            74
				((TerminalCommunication) (obj)).disconnect();
	//   29   66:aload           4
	//   30   68:invokeinterface #51  <Method boolean TerminalCommunication.disconnect()>
	//   31   73:pop             
		}

	//   32   74:iload_1         
	//   33   75:iconst_1        
	//   34   76:iadd            
	//   35   77:istore_1        
	//   36   78:iload_1         
	//   37   79:iload_2         
	//   38   80:icmplt          30
	//   39   83:return          
	}

	public void disConnect(String s)
		throws SocketException
	{
		s = ((String) ((TerminalCommunication)list.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map list>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method Object Map.get(Object)>
	//    4   10:checkcast       #44  <Class TerminalCommunication>
	//    5   13:astore_1        
		if(s != null && ((TerminalCommunication) (s)).isConnect())
	//*   6   14:aload_1         
	//*   7   15:ifnull          34
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #48  <Method boolean TerminalCommunication.isConnect()>
	//*  10   24:ifeq            34
			((TerminalCommunication) (s)).disconnect();
	//   11   27:aload_1         
	//   12   28:invokeinterface #51  <Method boolean TerminalCommunication.disconnect()>
	//   13   33:pop             
	//   14   34:return          
	}

	public String[] getNames()
	{
		return (String[])list.keySet().toArray(((Object []) (new String[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map list>
	//    2    4:invokeinterface #28  <Method Set Map.keySet()>
	//    3    9:iconst_0        
	//    4   10:anewarray       String[]
	//    5   13:invokeinterface #36  <Method Object[] Set.toArray(Object[])>
	//    6   18:checkcast       #38  <Class String[]>
	//    7   21:areturn         
	}

	public TerminalCommunication getTerminalCommunication(String s)
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #61  <Method int String.length()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		TerminalCommunication terminalcommunication = (TerminalCommunication)list.get(((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field Map list>
	//    9   17:aload_1         
	//   10   18:invokeinterface #42  <Method Object Map.get(Object)>
	//   11   23:checkcast       #44  <Class TerminalCommunication>
	//   12   26:astore_3        
		Object obj = ((Object) (terminalcommunication));
	//   13   27:aload_3         
	//   14   28:astore_2        
		if(terminalcommunication == null)
	//*  15   29:aload_3         
	//*  16   30:ifnonnull       53
		{
			obj = ((Object) (new TerminalCommunicationHandler()));
	//   17   33:new             #63  <Class TerminalCommunicationHandler>
	//   18   36:dup             
	//   19   37:invokespecial   #64  <Method void TerminalCommunicationHandler()>
	//   20   40:astore_2        
			list.put(((Object) (s)), obj);
	//   21   41:aload_0         
	//   22   42:getfield        #18  <Field Map list>
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokeinterface #68  <Method Object Map.put(Object, Object)>
	//   26   52:pop             
		}
		return ((TerminalCommunication) (obj));
	//   27   53:aload_2         
	//   28   54:areturn         
	}

	public void removeTerminalCommunication(String s)
	{
		list.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map list>
	//    2    4:aload_1         
	//    3    5:invokeinterface #72  <Method Object Map.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private volatile Map list;
}
