// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ml, aic, mf

public class mk
{

	public mk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static mf a(String s)
	{
		try
		{
			s = ((String) (new ml((aic)Class.forName(s, false, ((Class) (com/google/android/gms/internal/ads/mk)).getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]))));
	//    0    0:new             #16  <Class ml>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:ldc1            #2   <Class mk>
	//    5    8:invokevirtual   #22  <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokestatic    #26  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    7   14:iconst_0        
	//    8   15:anewarray       Class[]
	//    9   18:invokevirtual   #30  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   10   21:iconst_0        
	//   11   22:anewarray       Object[]
	//   12   25:invokevirtual   #36  <Method Object Constructor.newInstance(Object[])>
	//   13   28:checkcast       #38  <Class aic>
	//   14   31:invokespecial   #41  <Method void ml(aic)>
	//   15   34:astore_0        
		}
	//*  16   35:aload_0         
	//*  17   36:areturn         
	//*  18   37:new             #43  <Class RemoteException>
	//*  19   40:dup             
	//*  20   41:invokespecial   #44  <Method void RemoteException()>
	//*  21   44:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RemoteException();
		}
		return ((mf) (s));
	//*  22   45:astore_0        
	//*  23   46:goto            37
	}
}
