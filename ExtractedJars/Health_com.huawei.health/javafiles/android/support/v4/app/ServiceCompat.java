// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Service;
import android.support.v4.os.BuildCompat;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.app:
//			ServiceCompatApi24

public final class ServiceCompat
{
	static class Api24ServiceCompatImpl
		implements ServiceCompatImpl
	{

		public void stopForeground(Service service, int i)
		{
			ServiceCompatApi24.stopForeground(service, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #20  <Method void ServiceCompatApi24.stopForeground(Service, int)>
		//    3    5:return          
		}

		Api24ServiceCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class BaseServiceCompatImpl
		implements ServiceCompatImpl
	{

		public void stopForeground(Service service, int i)
		{
			boolean flag;
			if((i & 1) != 0)
		//*   0    0:iload_2         
		//*   1    1:iconst_1        
		//*   2    2:iand            
		//*   3    3:ifeq            11
				flag = true;
		//    4    6:iconst_1        
		//    5    7:istore_3        
			else
		//*   6    8:goto            13
				flag = false;
		//    7   11:iconst_0        
		//    8   12:istore_3        
			service.stopForeground(flag);
		//    9   13:aload_1         
		//   10   14:iload_3         
		//   11   15:invokevirtual   #21  <Method void Service.stopForeground(boolean)>
		//   12   18:return          
		}

		BaseServiceCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface ServiceCompatImpl
	{

		public abstract void stopForeground(Service service, int i);
	}

	public static interface StopForegroundFlags
		extends Annotation
	{
	}


	private ServiceCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public static void stopForeground(Service service, int i)
	{
		IMPL.stopForeground(service, i);
	//    0    0:getstatic       #37  <Field ServiceCompat$ServiceCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #44  <Method void ServiceCompat$ServiceCompatImpl.stopForeground(Service, int)>
	//    4   10:return          
	}

	static final ServiceCompatImpl IMPL;
	public static final int START_STICKY = 1;
	public static final int STOP_FOREGROUND_DETACH = 2;
	public static final int STOP_FOREGROUND_REMOVE = 1;

	static 
	{
		if(BuildCompat.isAtLeastN())
	//*   0    0:invokestatic    #32  <Method boolean BuildCompat.isAtLeastN()>
	//*   1    3:ifeq            17
			IMPL = ((ServiceCompatImpl) (new Api24ServiceCompatImpl()));
	//    2    6:new             #6   <Class ServiceCompat$Api24ServiceCompatImpl>
	//    3    9:dup             
	//    4   10:invokespecial   #35  <Method void ServiceCompat$Api24ServiceCompatImpl()>
	//    5   13:putstatic       #37  <Field ServiceCompat$ServiceCompatImpl IMPL>
	//    6   16:return          
		else
			IMPL = ((ServiceCompatImpl) (new BaseServiceCompatImpl()));
	//    7   17:new             #9   <Class ServiceCompat$BaseServiceCompatImpl>
	//    8   20:dup             
	//    9   21:invokespecial   #38  <Method void ServiceCompat$BaseServiceCompatImpl()>
	//   10   24:putstatic       #37  <Field ServiceCompat$ServiceCompatImpl IMPL>
	//*  11   27:return          
	}
}
