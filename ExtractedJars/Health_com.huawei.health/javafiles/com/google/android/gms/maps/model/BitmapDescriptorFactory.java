// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.maps.model.internal.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//			BitmapDescriptor, RuntimeRemoteException

public final class BitmapDescriptorFactory
{

	private BitmapDescriptorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static BitmapDescriptor defaultMarker()
	{
		BitmapDescriptor bitmapdescriptor;
		try
		{
			bitmapdescriptor = new BitmapDescriptor(zzJG().zzJR());
	//    0    0:new             #38  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:invokestatic    #42  <Method zza zzJG()>
	//    3    7:invokeinterface #48  <Method com.google.android.gms.dynamic.IObjectWrapper zza.zzJR()>
	//    4   12:invokespecial   #51  <Method void BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   15:astore_0        
		}
	//*   6   16:aload_0         
	//*   7   17:areturn         
		catch(RemoteException remoteexception)
	//*   8   18:astore_0        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    9   19:new             #53  <Class RuntimeRemoteException>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   13   27:athrow          
		}
		return bitmapdescriptor;
	}

	public static BitmapDescriptor defaultMarker(float f)
	{
		BitmapDescriptor bitmapdescriptor;
		try
		{
			bitmapdescriptor = new BitmapDescriptor(zzJG().zzi(f));
	//    0    0:new             #38  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:invokestatic    #42  <Method zza zzJG()>
	//    3    7:fload_0         
	//    4    8:invokeinterface #61  <Method com.google.android.gms.dynamic.IObjectWrapper zza.zzi(float)>
	//    5   13:invokespecial   #51  <Method void BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_1        
		}
	//*   7   17:aload_1         
	//*   8   18:areturn         
		catch(RemoteException remoteexception)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   10   20:new             #53  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return bitmapdescriptor;
	}

	public static BitmapDescriptor fromAsset(String s)
	{
		try
		{
			s = ((String) (new BitmapDescriptor(zzJG().zzfa(s))));
	//    0    0:new             #38  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:invokestatic    #42  <Method zza zzJG()>
	//    3    7:aload_0         
	//    4    8:invokeinterface #67  <Method com.google.android.gms.dynamic.IObjectWrapper zza.zzfa(String)>
	//    5   13:invokespecial   #51  <Method void BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_0        
		}
	//*   7   17:aload_0         
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   19:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//   10   20:new             #53  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return ((BitmapDescriptor) (s));
	}

	public static BitmapDescriptor fromBitmap(Bitmap bitmap)
	{
		try
		{
			bitmap = ((Bitmap) (new BitmapDescriptor(zzJG().zze(bitmap))));
	//    0    0:new             #38  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:invokestatic    #42  <Method zza zzJG()>
	//    3    7:aload_0         
	//    4    8:invokeinterface #73  <Method com.google.android.gms.dynamic.IObjectWrapper zza.zze(Bitmap)>
	//    5   13:invokespecial   #51  <Method void BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_0        
		}
	//*   7   17:aload_0         
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(Bitmap bitmap)
	//*   9   19:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (bitmap)));
	//   10   20:new             #53  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return ((BitmapDescriptor) (bitmap));
	}

	public static BitmapDescriptor fromFile(String s)
	{
		try
		{
			s = ((String) (new BitmapDescriptor(zzJG().zzfb(s))));
	//    0    0:new             #38  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:invokestatic    #42  <Method zza zzJG()>
	//    3    7:aload_0         
	//    4    8:invokeinterface #77  <Method com.google.android.gms.dynamic.IObjectWrapper zza.zzfb(String)>
	//    5   13:invokespecial   #51  <Method void BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_0        
		}
	//*   7   17:aload_0         
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   19:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//   10   20:new             #53  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return ((BitmapDescriptor) (s));
	}

	public static BitmapDescriptor fromPath(String s)
	{
		try
		{
			s = ((String) (new BitmapDescriptor(zzJG().zzfc(s))));
	//    0    0:new             #38  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:invokestatic    #42  <Method zza zzJG()>
	//    3    7:aload_0         
	//    4    8:invokeinterface #81  <Method com.google.android.gms.dynamic.IObjectWrapper zza.zzfc(String)>
	//    5   13:invokespecial   #51  <Method void BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_0        
		}
	//*   7   17:aload_0         
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   19:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//   10   20:new             #53  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return ((BitmapDescriptor) (s));
	}

	public static BitmapDescriptor fromResource(int i)
	{
		BitmapDescriptor bitmapdescriptor;
		try
		{
			bitmapdescriptor = new BitmapDescriptor(zzJG().zzly(i));
	//    0    0:new             #38  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:invokestatic    #42  <Method zza zzJG()>
	//    3    7:iload_0         
	//    4    8:invokeinterface #87  <Method com.google.android.gms.dynamic.IObjectWrapper zza.zzly(int)>
	//    5   13:invokespecial   #51  <Method void BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_1        
		}
	//*   7   17:aload_1         
	//*   8   18:areturn         
		catch(RemoteException remoteexception)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   10   20:new             #53  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return bitmapdescriptor;
	}

	private static zza zzJG()
	{
		return (zza)zzac.zzb(((Object) (zzboZ)), "IBitmapDescriptorFactory is not initialized");
	//    0    0:getstatic       #89  <Field zza zzboZ>
	//    1    3:ldc1            #91  <String "IBitmapDescriptorFactory is not initialized">
	//    2    5:invokestatic    #97  <Method Object zzac.zzb(Object, Object)>
	//    3    8:checkcast       #44  <Class zza>
	//    4   11:areturn         
	}

	public static void zza(zza zza1)
	{
		if(zzboZ != null)
	//*   0    0:getstatic       #89  <Field zza zzboZ>
	//*   1    3:ifnull          7
		{
			return;
	//    2    6:return          
		} else
		{
			zzboZ = (zza)zzac.zzw(((Object) (zza1)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #103 <Method Object zzac.zzw(Object)>
	//    5   11:checkcast       #44  <Class zza>
	//    6   14:putstatic       #89  <Field zza zzboZ>
			return;
	//    7   17:return          
		}
	}

	public static final float HUE_AZURE = 210F;
	public static final float HUE_BLUE = 240F;
	public static final float HUE_CYAN = 180F;
	public static final float HUE_GREEN = 120F;
	public static final float HUE_MAGENTA = 300F;
	public static final float HUE_ORANGE = 30F;
	public static final float HUE_RED = 0F;
	public static final float HUE_ROSE = 330F;
	public static final float HUE_VIOLET = 270F;
	public static final float HUE_YELLOW = 60F;
	private static zza zzboZ;
}
