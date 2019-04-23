// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.at;
import com.google.android.gms.internal.cast.ax;

// Referenced classes of package com.google.android.gms.cast.framework:
//			at, c, t, ag

public class ReconnectionService extends Service
{

	public ReconnectionService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Service()>
	//    2    4:return          
	}

	public IBinder onBind(Intent intent)
	{
		try
		{
			intent = ((Intent) (b.a(intent)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field com.google.android.gms.cast.framework.at b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #33  <Method IBinder at.a(Intent)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//*   7   13:astore_1        
		{
			a.a(((Throwable) (intent)), "Unable to call %s on %s.", new Object[] {
				"onBind", ((Class) (com/google/android/gms/cast/framework/at)).getSimpleName()
			});
	//    8   14:getstatic       #20  <Field at a>
	//    9   17:aload_1         
	//   10   18:ldc1            #35  <String "Unable to call %s on %s.">
	//   11   20:iconst_2        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:ldc1            #38  <String "onBind">
	//   16   28:aastore         
	//   17   29:dup             
	//   18   30:iconst_1        
	//   19   31:ldc1            #31  <Class com.google.android.gms.cast.framework.at>
	//   20   33:invokevirtual   #44  <Method String Class.getSimpleName()>
	//   21   36:aastore         
	//   22   37:invokevirtual   #47  <Method void at.a(Throwable, String, Object[])>
			return null;
	//   23   40:aconst_null     
	//   24   41:areturn         
		}
		return ((IBinder) (intent));
	}

	public void onCreate()
	{
		c c1 = c.a(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method c c.a(android.content.Context)>
	//    2    4:astore_1        
		b = ax.a(((Service) (this)), c1.b().c(), c1.f().a());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #56  <Method t c.b()>
	//    7   11:invokevirtual   #62  <Method com.google.android.gms.c.a t.c()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #66  <Method ag c.f()>
	//   10   18:invokevirtual   #70  <Method com.google.android.gms.c.a ag.a()>
	//   11   21:invokestatic    #75  <Method com.google.android.gms.cast.framework.at ax.a(Service, com.google.android.gms.c.a, com.google.android.gms.c.a)>
	//   12   24:putfield        #29  <Field com.google.android.gms.cast.framework.at b>
		try
		{
			b.a();
	//   13   27:aload_0         
	//   14   28:getfield        #29  <Field com.google.android.gms.cast.framework.at b>
	//   15   31:invokeinterface #77  <Method void at.a()>
		}
	//*  16   36:goto            66
		catch(RemoteException remoteexception)
	//*  17   39:astore_1        
		{
			a.a(((Throwable) (remoteexception)), "Unable to call %s on %s.", new Object[] {
				"onCreate", ((Class) (com/google/android/gms/cast/framework/at)).getSimpleName()
			});
	//   18   40:getstatic       #20  <Field at a>
	//   19   43:aload_1         
	//   20   44:ldc1            #35  <String "Unable to call %s on %s.">
	//   21   46:iconst_2        
	//   22   47:anewarray       Object[]
	//   23   50:dup             
	//   24   51:iconst_0        
	//   25   52:ldc1            #78  <String "onCreate">
	//   26   54:aastore         
	//   27   55:dup             
	//   28   56:iconst_1        
	//   29   57:ldc1            #31  <Class com.google.android.gms.cast.framework.at>
	//   30   59:invokevirtual   #44  <Method String Class.getSimpleName()>
	//   31   62:aastore         
	//   32   63:invokevirtual   #47  <Method void at.a(Throwable, String, Object[])>
		}
		super.onCreate();
	//   33   66:aload_0         
	//   34   67:invokespecial   #80  <Method void Service.onCreate()>
	//   35   70:return          
	}

	public void onDestroy()
	{
		try
		{
			b.b();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field com.google.android.gms.cast.framework.at b>
	//    2    4:invokeinterface #83  <Method void at.b()>
		}
	//*   3    9:goto            39
		catch(RemoteException remoteexception)
	//*   4   12:astore_1        
		{
			a.a(((Throwable) (remoteexception)), "Unable to call %s on %s.", new Object[] {
				"onDestroy", ((Class) (com/google/android/gms/cast/framework/at)).getSimpleName()
			});
	//    5   13:getstatic       #20  <Field at a>
	//    6   16:aload_1         
	//    7   17:ldc1            #35  <String "Unable to call %s on %s.">
	//    8   19:iconst_2        
	//    9   20:anewarray       Object[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:ldc1            #84  <String "onDestroy">
	//   13   27:aastore         
	//   14   28:dup             
	//   15   29:iconst_1        
	//   16   30:ldc1            #31  <Class com.google.android.gms.cast.framework.at>
	//   17   32:invokevirtual   #44  <Method String Class.getSimpleName()>
	//   18   35:aastore         
	//   19   36:invokevirtual   #47  <Method void at.a(Throwable, String, Object[])>
		}
		super.onDestroy();
	//   20   39:aload_0         
	//   21   40:invokespecial   #86  <Method void Service.onDestroy()>
	//   22   43:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		try
		{
			i = b.a(intent, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field com.google.android.gms.cast.framework.at b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #90  <Method int at.a(Intent, int, int)>
	//    6   12:istore_2        
		}
	//*   7   13:iload_2         
	//*   8   14:ireturn         
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//*   9   15:astore_1        
		{
			a.a(((Throwable) (intent)), "Unable to call %s on %s.", new Object[] {
				"onStartCommand", ((Class) (com/google/android/gms/cast/framework/at)).getSimpleName()
			});
	//   10   16:getstatic       #20  <Field at a>
	//   11   19:aload_1         
	//   12   20:ldc1            #35  <String "Unable to call %s on %s.">
	//   13   22:iconst_2        
	//   14   23:anewarray       Object[]
	//   15   26:dup             
	//   16   27:iconst_0        
	//   17   28:ldc1            #91  <String "onStartCommand">
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_1        
	//   21   33:ldc1            #31  <Class com.google.android.gms.cast.framework.at>
	//   22   35:invokevirtual   #44  <Method String Class.getSimpleName()>
	//   23   38:aastore         
	//   24   39:invokevirtual   #47  <Method void at.a(Throwable, String, Object[])>
			return 1;
	//   25   42:iconst_1        
	//   26   43:ireturn         
		}
		return i;
	}

	private static final at a = new at("ReconnectionService");
	private com.google.android.gms.cast.framework.at b;

	static 
	{
	//    0    0:new             #12  <Class at>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "ReconnectionService">
	//    3    6:invokespecial   #18  <Method void at(String)>
	//    4    9:putstatic       #20  <Field at a>
	//*   5   12:return          
	}
}
