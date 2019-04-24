// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzp, zzatg, zzzj

public class zzzo
{

	public zzzo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static zzzj zzbs(String s)
		throws RemoteException
	{
		try
		{
			s = ((String) (new zzzp((zzatg)Class.forName(s, false, ((Class) (com/google/android/gms/internal/ads/zzzo)).getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]))));
	//    0    0:new             #18  <Class zzzp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:ldc1            #2   <Class zzzo>
	//    5    8:invokevirtual   #24  <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokestatic    #28  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    7   14:iconst_0        
	//    8   15:anewarray       Class[]
	//    9   18:invokevirtual   #32  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   10   21:iconst_0        
	//   11   22:anewarray       Object[]
	//   12   25:invokevirtual   #38  <Method Object Constructor.newInstance(Object[])>
	//   13   28:checkcast       #40  <Class zzatg>
	//   14   31:invokespecial   #43  <Method void zzzp(zzatg)>
	//   15   34:astore_0        
		}
	//*  16   35:aload_0         
	//*  17   36:areturn         
	//*  18   37:new             #14  <Class RemoteException>
	//*  19   40:dup             
	//*  20   41:invokespecial   #44  <Method void RemoteException()>
	//*  21   44:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RemoteException();
		}
		return ((zzzj) (s));
	//*  22   45:astore_0        
	//*  23   46:goto            37
	}
}
