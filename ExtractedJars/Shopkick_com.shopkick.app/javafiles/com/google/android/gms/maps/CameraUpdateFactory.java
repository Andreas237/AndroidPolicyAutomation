// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			CameraUpdate

public final class CameraUpdateFactory
{

	private CameraUpdateFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static CameraUpdate newCameraPosition(CameraPosition cameraposition)
	{
		try
		{
			cameraposition = ((CameraPosition) (new CameraUpdate(zzb().newCameraPosition(cameraposition))));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:aload_0         
	//    4    8:invokeinterface #26  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.newCameraPosition(CameraPosition)>
	//    5   13:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_0        
		}
	//*   7   17:aload_0         
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(CameraPosition cameraposition)
	//*   9   19:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraposition)));
	//   10   20:new             #31  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return ((CameraUpdate) (cameraposition));
	}

	public static CameraUpdate newLatLng(LatLng latlng)
	{
		try
		{
			latlng = ((LatLng) (new CameraUpdate(zzb().newLatLng(latlng))));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:aload_0         
	//    4    8:invokeinterface #39  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.newLatLng(LatLng)>
	//    5   13:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_0        
		}
	//*   7   17:aload_0         
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   9   19:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//   10   20:new             #31  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return ((CameraUpdate) (latlng));
	}

	public static CameraUpdate newLatLngBounds(LatLngBounds latlngbounds, int i)
	{
		try
		{
			latlngbounds = ((LatLngBounds) (new CameraUpdate(zzb().newLatLngBounds(latlngbounds, i))));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokeinterface #44  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.newLatLngBounds(LatLngBounds, int)>
	//    6   14:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    7   17:astore_0        
		}
	//*   8   18:aload_0         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(LatLngBounds latlngbounds)
	//*  10   20:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlngbounds)));
	//   11   21:new             #31  <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((CameraUpdate) (latlngbounds));
	}

	public static CameraUpdate newLatLngBounds(LatLngBounds latlngbounds, int i, int j, int k)
	{
		try
		{
			latlngbounds = ((LatLngBounds) (new CameraUpdate(zzb().newLatLngBoundsWithSize(latlngbounds, i, j, k))));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokeinterface #49  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.newLatLngBoundsWithSize(LatLngBounds, int, int, int)>
	//    8   16:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:areturn         
		// Misplaced declaration of an exception variable
		catch(LatLngBounds latlngbounds)
	//*  12   22:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlngbounds)));
	//   13   23:new             #31  <Class RuntimeRemoteException>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   17   31:athrow          
		}
		return ((CameraUpdate) (latlngbounds));
	}

	public static CameraUpdate newLatLngZoom(LatLng latlng, float f)
	{
		try
		{
			latlng = ((LatLng) (new CameraUpdate(zzb().newLatLngZoom(latlng, f))));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:aload_0         
	//    4    8:fload_1         
	//    5    9:invokeinterface #54  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.newLatLngZoom(LatLng, float)>
	//    6   14:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    7   17:astore_0        
		}
	//*   8   18:aload_0         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*  10   20:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//   11   21:new             #31  <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((CameraUpdate) (latlng));
	}

	public static CameraUpdate scrollBy(float f, float f1)
	{
		CameraUpdate cameraupdate;
		try
		{
			cameraupdate = new CameraUpdate(zzb().scrollBy(f, f1));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:fload_0         
	//    4    8:fload_1         
	//    5    9:invokeinterface #59  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.scrollBy(float, float)>
	//    6   14:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    7   17:astore_2        
		}
	//*   8   18:aload_2         
	//*   9   19:areturn         
		catch(RemoteException remoteexception)
	//*  10   20:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   11   21:new             #31  <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_2         
	//   14   26:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return cameraupdate;
	}

	public static CameraUpdate zoomBy(float f)
	{
		CameraUpdate cameraupdate;
		try
		{
			cameraupdate = new CameraUpdate(zzb().zoomBy(f));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:fload_0         
	//    4    8:invokeinterface #64  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.zoomBy(float)>
	//    5   13:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_1        
		}
	//*   7   17:aload_1         
	//*   8   18:areturn         
		catch(RemoteException remoteexception)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   10   20:new             #31  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return cameraupdate;
	}

	public static CameraUpdate zoomBy(float f, Point point)
	{
		try
		{
			point = ((Point) (new CameraUpdate(zzb().zoomByWithFocus(f, point.x, point.y))));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:fload_0         
	//    4    8:aload_1         
	//    5    9:getfield        #71  <Field int Point.x>
	//    6   12:aload_1         
	//    7   13:getfield        #74  <Field int Point.y>
	//    8   16:invokeinterface #78  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.zoomByWithFocus(float, int, int)>
	//    9   21:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//   10   24:astore_1        
		}
	//*  11   25:aload_1         
	//*  12   26:areturn         
		// Misplaced declaration of an exception variable
		catch(Point point)
	//*  13   27:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (point)));
	//   14   28:new             #31  <Class RuntimeRemoteException>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   18   36:athrow          
		}
		return ((CameraUpdate) (point));
	}

	public static CameraUpdate zoomIn()
	{
		CameraUpdate cameraupdate;
		try
		{
			cameraupdate = new CameraUpdate(zzb().zoomIn());
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:invokeinterface #83  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.zoomIn()>
	//    4   12:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   15:astore_0        
		}
	//*   6   16:aload_0         
	//*   7   17:areturn         
		catch(RemoteException remoteexception)
	//*   8   18:astore_0        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    9   19:new             #31  <Class RuntimeRemoteException>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   13   27:athrow          
		}
		return cameraupdate;
	}

	public static CameraUpdate zoomOut()
	{
		CameraUpdate cameraupdate;
		try
		{
			cameraupdate = new CameraUpdate(zzb().zoomOut());
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:invokeinterface #86  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.zoomOut()>
	//    4   12:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   15:astore_0        
		}
	//*   6   16:aload_0         
	//*   7   17:areturn         
		catch(RemoteException remoteexception)
	//*   8   18:astore_0        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    9   19:new             #31  <Class RuntimeRemoteException>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   13   27:athrow          
		}
		return cameraupdate;
	}

	public static CameraUpdate zoomTo(float f)
	{
		CameraUpdate cameraupdate;
		try
		{
			cameraupdate = new CameraUpdate(zzb().zoomTo(f));
	//    0    0:new             #17  <Class CameraUpdate>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method ICameraUpdateFactoryDelegate zzb()>
	//    3    7:fload_0         
	//    4    8:invokeinterface #89  <Method com.google.android.gms.dynamic.IObjectWrapper ICameraUpdateFactoryDelegate.zoomTo(float)>
	//    5   13:invokespecial   #29  <Method void CameraUpdate(com.google.android.gms.dynamic.IObjectWrapper)>
	//    6   16:astore_1        
		}
	//*   7   17:aload_1         
	//*   8   18:areturn         
		catch(RemoteException remoteexception)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   10   20:new             #31  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return cameraupdate;
	}

	public static void zza(ICameraUpdateFactoryDelegate icameraupdatefactorydelegate)
	{
		zzf = (ICameraUpdateFactoryDelegate)Preconditions.checkNotNull(((Object) (icameraupdatefactorydelegate)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #97  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:checkcast       #23  <Class ICameraUpdateFactoryDelegate>
	//    3    7:putstatic       #99  <Field ICameraUpdateFactoryDelegate zzf>
	//    4   10:return          
	}

	private static ICameraUpdateFactoryDelegate zzb()
	{
		return (ICameraUpdateFactoryDelegate)Preconditions.checkNotNull(((Object) (zzf)), "CameraUpdateFactory is not initialized");
	//    0    0:getstatic       #99  <Field ICameraUpdateFactoryDelegate zzf>
	//    1    3:ldc1            #101 <String "CameraUpdateFactory is not initialized">
	//    2    5:invokestatic    #104 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    8:checkcast       #23  <Class ICameraUpdateFactoryDelegate>
	//    4   11:areturn         
	}

	private static ICameraUpdateFactoryDelegate zzf;
}
