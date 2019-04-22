// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.console;

import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class ConsolePeerManager extends ChromePeerManager
{

	private ConsolePeerManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ChromePeerManager()>
	//    2    4:return          
	}

	public static ConsolePeerManager getInstanceOrNull()
	{
		com/facebook/stetho/inspector/console/ConsolePeerManager;
	//    0    0:ldc1            #2   <Class ConsolePeerManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ConsolePeerManager consolepeermanager = sInstance;
	//    2    3:getstatic       #16  <Field ConsolePeerManager sInstance>
	//    3    6:astore_0        
		com/facebook/stetho/inspector/console/ConsolePeerManager;
	//    4    7:ldc1            #2   <Class ConsolePeerManager>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return consolepeermanager;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class ConsolePeerManager>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static ConsolePeerManager getOrCreateInstance()
	{
		com/facebook/stetho/inspector/console/ConsolePeerManager;
	//    0    0:ldc1            #2   <Class ConsolePeerManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ConsolePeerManager consolepeermanager;
		if(sInstance == null)
	//*   2    3:getstatic       #16  <Field ConsolePeerManager sInstance>
	//*   3    6:ifnonnull       19
			sInstance = new ConsolePeerManager();
	//    4    9:new             #2   <Class ConsolePeerManager>
	//    5   12:dup             
	//    6   13:invokespecial   #19  <Method void ConsolePeerManager()>
	//    7   16:putstatic       #16  <Field ConsolePeerManager sInstance>
		consolepeermanager = sInstance;
	//    8   19:getstatic       #16  <Field ConsolePeerManager sInstance>
	//    9   22:astore_0        
		com/facebook/stetho/inspector/console/ConsolePeerManager;
	//   10   23:ldc1            #2   <Class ConsolePeerManager>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return consolepeermanager;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class ConsolePeerManager>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	private static ConsolePeerManager sInstance;
}
