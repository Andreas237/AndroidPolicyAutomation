// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.craftar:
//			CLog, AppEventListener

class AppEventForwarder
{

	AppEventForwarder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	static void addAppEventListener(AppEventListener appeventlistener)
	{
		if(!eventListeners.contains(((Object) (appeventlistener))))
	//*   0    0:getstatic       #16  <Field ArrayList eventListeners>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #24  <Method boolean ArrayList.contains(Object)>
	//*   3    7:ifne            54
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #26  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #27  <Method void StringBuilder()>
	//    7   17:astore_1        
			stringbuilder.append("Adding ");
	//    8   18:aload_1         
	//    9   19:ldc1            #29  <String "Adding ">
	//   10   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(((Object) (appeventlistener)));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   15   30:pop             
			stringbuilder.append(" to the AppEventListeners");
	//   16   31:aload_1         
	//   17   32:ldc1            #38  <String " to the AppEventListeners">
	//   18   34:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			CLog.d(stringbuilder.toString());
	//   20   38:aload_1         
	//   21   39:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   22   42:invokestatic    #48  <Method void CLog.d(String)>
			eventListeners.add(((Object) (appeventlistener)));
	//   23   45:getstatic       #16  <Field ArrayList eventListeners>
	//   24   48:aload_0         
	//   25   49:invokevirtual   #51  <Method boolean ArrayList.add(Object)>
	//   26   52:pop             
			return;
	//   27   53:return          
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   28   54:new             #26  <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #27  <Method void StringBuilder()>
	//   31   61:astore_1        
			stringbuilder1.append(((Object) (appeventlistener)));
	//   32   62:aload_1         
	//   33   63:aload_0         
	//   34   64:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   35   67:pop             
			stringbuilder1.append(" was already in the list");
	//   36   68:aload_1         
	//   37   69:ldc1            #53  <String " was already in the list">
	//   38   71:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
			CLog.v(stringbuilder1.toString());
	//   40   75:aload_1         
	//   41   76:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   42   79:invokestatic    #56  <Method void CLog.v(String)>
			return;
	//   43   82:return          
		}
	}

	static void forwardFinish()
	{
		AppEventListener appeventlistener;
		for(Iterator iterator = ((ArrayList)eventListeners.clone()).iterator(); iterator.hasNext(); appeventlistener.onAppFinish())
	//*   0    0:getstatic       #16  <Field ArrayList eventListeners>
	//*   1    3:invokevirtual   #61  <Method Object ArrayList.clone()>
	//*   2    6:checkcast       #11  <Class ArrayList>
	//*   3    9:invokevirtual   #65  <Method Iterator ArrayList.iterator()>
	//*   4   12:astore_0        
	//*   5   13:aload_0         
	//*   6   14:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            69
		{
			appeventlistener = (AppEventListener)iterator.next();
	//    8   22:aload_0         
	//    9   23:invokeinterface #74  <Method Object Iterator.next()>
	//   10   28:checkcast       #76  <Class AppEventListener>
	//   11   31:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   32:new             #26  <Class StringBuilder>
	//   13   35:dup             
	//   14   36:invokespecial   #27  <Method void StringBuilder()>
	//   15   39:astore_2        
			stringbuilder.append("Forwarding onAppFinish to ");
	//   16   40:aload_2         
	//   17   41:ldc1            #78  <String "Forwarding onAppFinish to ">
	//   18   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:pop             
			stringbuilder.append(((Object) (appeventlistener)));
	//   20   47:aload_2         
	//   21   48:aload_1         
	//   22   49:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   23   52:pop             
			CLog.v(stringbuilder.toString());
	//   24   53:aload_2         
	//   25   54:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   26   57:invokestatic    #56  <Method void CLog.v(String)>
		}

	//   27   60:aload_1         
	//   28   61:invokeinterface #81  <Method void AppEventListener.onAppFinish()>
	//*  29   66:goto            13
	//   30   69:return          
	}

	static void forwardPause()
	{
		AppEventListener appeventlistener;
		for(Iterator iterator = ((ArrayList)eventListeners.clone()).iterator(); iterator.hasNext(); appeventlistener.onAppPause())
	//*   0    0:getstatic       #16  <Field ArrayList eventListeners>
	//*   1    3:invokevirtual   #61  <Method Object ArrayList.clone()>
	//*   2    6:checkcast       #11  <Class ArrayList>
	//*   3    9:invokevirtual   #65  <Method Iterator ArrayList.iterator()>
	//*   4   12:astore_0        
	//*   5   13:aload_0         
	//*   6   14:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            69
		{
			appeventlistener = (AppEventListener)iterator.next();
	//    8   22:aload_0         
	//    9   23:invokeinterface #74  <Method Object Iterator.next()>
	//   10   28:checkcast       #76  <Class AppEventListener>
	//   11   31:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   32:new             #26  <Class StringBuilder>
	//   13   35:dup             
	//   14   36:invokespecial   #27  <Method void StringBuilder()>
	//   15   39:astore_2        
			stringbuilder.append("Forwarding onAppPause to ");
	//   16   40:aload_2         
	//   17   41:ldc1            #84  <String "Forwarding onAppPause to ">
	//   18   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:pop             
			stringbuilder.append(((Object) (appeventlistener)));
	//   20   47:aload_2         
	//   21   48:aload_1         
	//   22   49:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   23   52:pop             
			CLog.v(stringbuilder.toString());
	//   24   53:aload_2         
	//   25   54:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   26   57:invokestatic    #56  <Method void CLog.v(String)>
		}

	//   27   60:aload_1         
	//   28   61:invokeinterface #87  <Method void AppEventListener.onAppPause()>
	//*  29   66:goto            13
	//   30   69:return          
	}

	static void forwardResume()
	{
		AppEventListener appeventlistener;
		for(Iterator iterator = ((ArrayList)eventListeners.clone()).iterator(); iterator.hasNext(); appeventlistener.onAppResume())
	//*   0    0:getstatic       #16  <Field ArrayList eventListeners>
	//*   1    3:invokevirtual   #61  <Method Object ArrayList.clone()>
	//*   2    6:checkcast       #11  <Class ArrayList>
	//*   3    9:invokevirtual   #65  <Method Iterator ArrayList.iterator()>
	//*   4   12:astore_0        
	//*   5   13:aload_0         
	//*   6   14:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            69
		{
			appeventlistener = (AppEventListener)iterator.next();
	//    8   22:aload_0         
	//    9   23:invokeinterface #74  <Method Object Iterator.next()>
	//   10   28:checkcast       #76  <Class AppEventListener>
	//   11   31:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   32:new             #26  <Class StringBuilder>
	//   13   35:dup             
	//   14   36:invokespecial   #27  <Method void StringBuilder()>
	//   15   39:astore_2        
			stringbuilder.append("Forwarding onAppResume to ");
	//   16   40:aload_2         
	//   17   41:ldc1            #90  <String "Forwarding onAppResume to ">
	//   18   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:pop             
			stringbuilder.append(((Object) (appeventlistener)));
	//   20   47:aload_2         
	//   21   48:aload_1         
	//   22   49:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   23   52:pop             
			CLog.v(stringbuilder.toString());
	//   24   53:aload_2         
	//   25   54:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   26   57:invokestatic    #56  <Method void CLog.v(String)>
		}

	//   27   60:aload_1         
	//   28   61:invokeinterface #93  <Method void AppEventListener.onAppResume()>
	//*  29   66:goto            13
	//   30   69:return          
	}

	static void removeAppEventListener(AppEventListener appeventlistener)
	{
		if(eventListeners.contains(((Object) (appeventlistener))))
	//*   0    0:getstatic       #16  <Field ArrayList eventListeners>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #24  <Method boolean ArrayList.contains(Object)>
	//*   3    7:ifeq            47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #26  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #27  <Method void StringBuilder()>
	//    7   17:astore_1        
			stringbuilder.append("Removing appEventListener ");
	//    8   18:aload_1         
	//    9   19:ldc1            #96  <String "Removing appEventListener ">
	//   10   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(((Object) (appeventlistener)));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   15   30:pop             
			CLog.v(stringbuilder.toString());
	//   16   31:aload_1         
	//   17   32:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   18   35:invokestatic    #56  <Method void CLog.v(String)>
			eventListeners.remove(((Object) (appeventlistener)));
	//   19   38:getstatic       #16  <Field ArrayList eventListeners>
	//   20   41:aload_0         
	//   21   42:invokevirtual   #99  <Method boolean ArrayList.remove(Object)>
	//   22   45:pop             
			return;
	//   23   46:return          
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   24   47:new             #26  <Class StringBuilder>
	//   25   50:dup             
	//   26   51:invokespecial   #27  <Method void StringBuilder()>
	//   27   54:astore_1        
			stringbuilder1.append(((Object) (appeventlistener)));
	//   28   55:aload_1         
	//   29   56:aload_0         
	//   30   57:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   31   60:pop             
			stringbuilder1.append(" was not in the list");
	//   32   61:aload_1         
	//   33   62:ldc1            #101 <String " was not in the list">
	//   34   64:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			CLog.v(stringbuilder1.toString());
	//   36   68:aload_1         
	//   37   69:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   38   72:invokestatic    #56  <Method void CLog.v(String)>
			return;
	//   39   75:return          
		}
	}

	static ArrayList eventListeners = new ArrayList();

	static 
	{
	//    0    0:new             #11  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:putstatic       #16  <Field ArrayList eventListeners>
	//*   4   10:return          
	}
}
