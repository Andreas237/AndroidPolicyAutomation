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
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          14
		{
			service.stopForeground(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #31  <Method void Service.stopForeground(int)>
			return;
	//    6   13:return          
		}
		boolean flag = true;
	//    7   14:iconst_1        
	//    8   15:istore_2        
		if((i & 1) == 0)
	//*   9   16:iload_1         
	//*  10   17:iconst_1        
	//*  11   18:iand            
	//*  12   19:ifeq            25
	//*  13   22:goto            27
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore_2        
		service.stopForeground(flag);
	//   16   27:aload_0         
	//   17   28:iload_2         
	//   18   29:invokevirtual   #34  <Method void Service.stopForeground(boolean)>
	//   19   32:return          
	}

	public static final int START_STICKY = 1;
	public static final int STOP_FOREGROUND_DETACH = 2;
	public static final int STOP_FOREGROUND_REMOVE = 1;
}
