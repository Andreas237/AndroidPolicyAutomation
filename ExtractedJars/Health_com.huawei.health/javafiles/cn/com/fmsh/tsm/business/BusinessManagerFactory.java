// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business;

import cn.com.fmsh.tsm.business.core.BusinessManagerImpl;

// Referenced classes of package cn.com.fmsh.tsm.business:
//			BusinessManager

public class BusinessManagerFactory
{

	private BusinessManagerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private static void businessManagerInit()
	{
		cn/com/fmsh/tsm/business/BusinessManagerFactory;
	//    0    0:ldc1            #2   <Class BusinessManagerFactory>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(handler == null)
	//*   2    3:getstatic       #14  <Field BusinessManager handler>
	//*   3    6:ifnonnull       19
			handler = ((BusinessManager) (new BusinessManagerImpl()));
	//    4    9:new             #16  <Class BusinessManagerImpl>
	//    5   12:dup             
	//    6   13:invokespecial   #17  <Method void BusinessManagerImpl()>
	//    7   16:putstatic       #14  <Field BusinessManager handler>
		cn/com/fmsh/tsm/business/BusinessManagerFactory;
	//    8   19:ldc1            #2   <Class BusinessManagerFactory>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		return;
	//   10   22:return          
		Exception exception;
		exception;
	//   11   23:astore_0        
	//*  12   24:ldc1            #2   <Class BusinessManagerFactory>
		throw exception;
	//   13   26:monitorexit     
	//   14   27:aload_0         
	//   15   28:athrow          
	}

	public static BusinessManager getBusinessManager()
	{
		if(handler == null)
	//*   0    0:getstatic       #14  <Field BusinessManager handler>
	//*   1    3:ifnonnull       9
			businessManagerInit();
	//    2    6:invokestatic    #21  <Method void businessManagerInit()>
		return handler;
	//    3    9:getstatic       #14  <Field BusinessManager handler>
	//    4   12:areturn         
	}

	private static BusinessManager handler;
}
