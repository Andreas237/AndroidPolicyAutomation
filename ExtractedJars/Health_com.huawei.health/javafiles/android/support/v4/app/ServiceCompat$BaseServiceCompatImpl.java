// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Service;

// Referenced classes of package android.support.v4.app:
//			ServiceCompat

static class ServiceCompat$BaseServiceCompatImpl
	implements ServiceCompat.ServiceCompatImpl
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

	ServiceCompat$BaseServiceCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
