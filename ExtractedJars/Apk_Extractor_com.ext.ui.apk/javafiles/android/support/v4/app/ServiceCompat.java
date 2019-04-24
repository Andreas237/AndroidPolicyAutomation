// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Service;
import java.lang.annotation.Annotation;

public final class ServiceCompat
{
	public static interface StopForegroundFlags
		extends Annotation
	{
	}


	private ServiceCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static void stopForeground(Service service, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          14
		{
			service.stopForeground(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #30  <Method void Service.stopForeground(int)>
			return;
	//    6   13:return          
		}
		boolean flag;
		if((i & 1) != 0)
	//*   7   14:iload_1         
	//*   8   15:iconst_1        
	//*   9   16:iand            
	//*  10   17:ifeq            28
			flag = true;
	//   11   20:iconst_1        
	//   12   21:istore_2        
		else
	//*  13   22:aload_0         
	//*  14   23:iload_2         
	//*  15   24:invokevirtual   #33  <Method void Service.stopForeground(boolean)>
	//*  16   27:return          
			flag = false;
	//   17   28:iconst_0        
	//   18   29:istore_2        
		service.stopForeground(flag);
	//*  19   30:goto            22
	}

	public static final int START_STICKY = 1;
	public static final int STOP_FOREGROUND_DETACH = 2;
	public static final int STOP_FOREGROUND_REMOVE = 1;
}
