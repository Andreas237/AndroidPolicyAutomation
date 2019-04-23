// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzk;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, BitmapDescriptor, LatLngBounds, LatLng

public final class GroundOverlay
{

	public GroundOverlay(zzk zzk1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzcv = (zzk)Preconditions.checkNotNull(((Object) (zzk1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #19  <Class zzk>
	//    6   12:putfield        #21  <Field zzk zzcv>
	//    7   15:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof GroundOverlay))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GroundOverlay>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzcv.zzb(((GroundOverlay)obj).zzcv);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzk zzcv>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class GroundOverlay>
	//    9   17:getfield        #21  <Field zzk zzcv>
	//   10   20:invokeinterface #30  <Method boolean zzk.zzb(zzk)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  14   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (obj)));
	//   15   29:new             #32  <Class RuntimeRemoteException>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   19   37:athrow          
		}
		return flag;
	}

	public final float getBearing()
	{
		float f;
		try
		{
			f = zzcv.getBearing();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #39  <Method float zzk.getBearing()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final LatLngBounds getBounds()
	{
		LatLngBounds latlngbounds;
		try
		{
			latlngbounds = zzcv.getBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #43  <Method LatLngBounds zzk.getBounds()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return latlngbounds;
	}

	public final float getHeight()
	{
		float f;
		try
		{
			f = zzcv.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #46  <Method float zzk.getHeight()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final String getId()
	{
		String s;
		try
		{
			s = zzcv.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #50  <Method String zzk.getId()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return s;
	}

	public final LatLng getPosition()
	{
		LatLng latlng;
		try
		{
			latlng = zzcv.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #54  <Method LatLng zzk.getPosition()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return latlng;
	}

	public final Object getTag()
	{
		Object obj;
		try
		{
			obj = ObjectWrapper.unwrap(zzcv.zzj());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #61  <Method com.google.android.gms.dynamic.IObjectWrapper zzk.zzj()>
	//    3    9:invokestatic    #67  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//    4   12:astore_1        
		}
	//*   5   13:aload_1         
	//*   6   14:areturn         
		catch(RemoteException remoteexception)
	//*   7   15:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    8   16:new             #32  <Class RuntimeRemoteException>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   12   24:athrow          
		}
		return obj;
	}

	public final float getTransparency()
	{
		float f;
		try
		{
			f = zzcv.getTransparency();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #71  <Method float zzk.getTransparency()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final float getWidth()
	{
		float f;
		try
		{
			f = zzcv.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #74  <Method float zzk.getWidth()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final float getZIndex()
	{
		float f;
		try
		{
			f = zzcv.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #77  <Method float zzk.getZIndex()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final int hashCode()
	{
		int i;
		try
		{
			i = zzcv.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #82  <Method int zzk.zzi()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public final boolean isClickable()
	{
		boolean flag;
		try
		{
			flag = zzcv.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #86  <Method boolean zzk.isClickable()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isVisible()
	{
		boolean flag;
		try
		{
			flag = zzcv.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #89  <Method boolean zzk.isVisible()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final void remove()
	{
		try
		{
			zzcv.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:invokeinterface #92  <Method void zzk.remove()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #32  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void setBearing(float f)
	{
		try
		{
			zzcv.setBearing(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:fload_1         
	//    3    5:invokeinterface #96  <Method void zzk.setBearing(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setClickable(boolean flag)
	{
		try
		{
			zzcv.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #100 <Method void zzk.setClickable(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setDimensions(float f)
	{
		try
		{
			zzcv.setDimensions(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:fload_1         
	//    3    5:invokeinterface #103 <Method void zzk.setDimensions(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setDimensions(float f, float f1)
	{
		try
		{
			zzcv.zza(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #107 <Method void zzk.zza(float, float)>
			return;
	//    5   11:return          
		}
		catch(RemoteException remoteexception)
	//*   6   12:astore_3        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_3         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
	}

	public final void setImage(BitmapDescriptor bitmapdescriptor)
	{
		Preconditions.checkNotNull(((Object) (bitmapdescriptor)), "imageDescriptor must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #112 <String "imageDescriptor must not be null">
	//    2    3:invokestatic    #115 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		try
		{
			bitmapdescriptor = ((BitmapDescriptor) (bitmapdescriptor.zza()));
	//    4    7:aload_1         
	//    5    8:invokevirtual   #119 <Method com.google.android.gms.dynamic.IObjectWrapper BitmapDescriptor.zza()>
	//    6   11:astore_1        
			zzcv.zzf(((com.google.android.gms.dynamic.IObjectWrapper) (bitmapdescriptor)));
	//    7   12:aload_0         
	//    8   13:getfield        #21  <Field zzk zzcv>
	//    9   16:aload_1         
	//   10   17:invokeinterface #123 <Method void zzk.zzf(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//   11   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(BitmapDescriptor bitmapdescriptor)
	//*  12   23:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bitmapdescriptor)));
	//   13   24:new             #32  <Class RuntimeRemoteException>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   17   32:athrow          
		}
	}

	public final void setPosition(LatLng latlng)
	{
		try
		{
			zzcv.setPosition(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #128 <Method void zzk.setPosition(LatLng)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setPositionFromBounds(LatLngBounds latlngbounds)
	{
		try
		{
			zzcv.setPositionFromBounds(latlngbounds);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #132 <Method void zzk.setPositionFromBounds(LatLngBounds)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLngBounds latlngbounds)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlngbounds)));
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setTag(Object obj)
	{
		try
		{
			zzcv.zze(ObjectWrapper.wrap(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:aload_1         
	//    3    5:invokestatic    #138 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #141 <Method void zzk.zze(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   6   14:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (obj)));
	//    7   15:new             #32  <Class RuntimeRemoteException>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   23:athrow          
		}
	}

	public final void setTransparency(float f)
	{
		try
		{
			zzcv.setTransparency(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:fload_1         
	//    3    5:invokeinterface #144 <Method void zzk.setTransparency(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setVisible(boolean flag)
	{
		try
		{
			zzcv.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #147 <Method void zzk.setVisible(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setZIndex(float f)
	{
		try
		{
			zzcv.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzcv>
	//    2    4:fload_1         
	//    3    5:invokeinterface #150 <Method void zzk.setZIndex(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	private final zzk zzcv;
}
