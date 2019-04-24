// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzc;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, BitmapDescriptor, LatLngBounds, LatLng

public final class GroundOverlay
{

	public GroundOverlay(zzc zzc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbpm = (zzc)zzac.zzw(((Object) (zzc1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class zzc>
	//    6   12:putfield        #21  <Field zzc zzbpm>
	//    7   15:return          
	}

	public boolean equals(Object obj)
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
			flag = zzbpm.zzb(((GroundOverlay)obj).zzbpm);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzc zzbpm>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class GroundOverlay>
	//    9   17:getfield        #21  <Field zzc zzbpm>
	//   10   20:invokeinterface #30  <Method boolean zzc.zzb(zzc)>
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

	public float getBearing()
	{
		float f;
		try
		{
			f = zzbpm.getBearing();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #39  <Method float zzc.getBearing()>
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

	public LatLngBounds getBounds()
	{
		LatLngBounds latlngbounds;
		try
		{
			latlngbounds = zzbpm.getBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #43  <Method LatLngBounds zzc.getBounds()>
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

	public float getHeight()
	{
		float f;
		try
		{
			f = zzbpm.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #46  <Method float zzc.getHeight()>
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

	public String getId()
	{
		String s;
		try
		{
			s = zzbpm.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #50  <Method String zzc.getId()>
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

	public LatLng getPosition()
	{
		LatLng latlng;
		try
		{
			latlng = zzbpm.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #54  <Method LatLng zzc.getPosition()>
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

	public Object getTag()
	{
		Object obj;
		try
		{
			obj = zzd.zzF(zzbpm.getTag());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #59  <Method com.google.android.gms.dynamic.IObjectWrapper zzc.getTag()>
	//    3    9:invokestatic    #65  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public float getTransparency()
	{
		float f;
		try
		{
			f = zzbpm.getTransparency();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #68  <Method float zzc.getTransparency()>
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

	public float getWidth()
	{
		float f;
		try
		{
			f = zzbpm.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #71  <Method float zzc.getWidth()>
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

	public float getZIndex()
	{
		float f;
		try
		{
			f = zzbpm.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #74  <Method float zzc.getZIndex()>
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

	public int hashCode()
	{
		int i;
		try
		{
			i = zzbpm.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #79  <Method int zzc.hashCodeRemote()>
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

	public boolean isClickable()
	{
		boolean flag;
		try
		{
			flag = zzbpm.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #83  <Method boolean zzc.isClickable()>
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

	public boolean isVisible()
	{
		boolean flag;
		try
		{
			flag = zzbpm.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #86  <Method boolean zzc.isVisible()>
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

	public void remove()
	{
		try
		{
			zzbpm.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:invokeinterface #89  <Method void zzc.remove()>
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

	public void setBearing(float f)
	{
		try
		{
			zzbpm.setBearing(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:fload_1         
	//    3    5:invokeinterface #93  <Method void zzc.setBearing(float)>
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

	public void setClickable(boolean flag)
	{
		try
		{
			zzbpm.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:iload_1         
	//    3    5:invokeinterface #97  <Method void zzc.setClickable(boolean)>
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

	public void setDimensions(float f)
	{
		try
		{
			zzbpm.setDimensions(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:fload_1         
	//    3    5:invokeinterface #100 <Method void zzc.setDimensions(float)>
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

	public void setDimensions(float f, float f1)
	{
		try
		{
			zzbpm.zzg(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #104 <Method void zzc.zzg(float, float)>
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

	public void setImage(BitmapDescriptor bitmapdescriptor)
	{
		zzac.zzb(((Object) (bitmapdescriptor)), "imageDescriptor must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #109 <String "imageDescriptor must not be null">
	//    2    3:invokestatic    #112 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		try
		{
			bitmapdescriptor = ((BitmapDescriptor) (bitmapdescriptor.zzJm()));
	//    4    7:aload_1         
	//    5    8:invokevirtual   #117 <Method com.google.android.gms.dynamic.IObjectWrapper BitmapDescriptor.zzJm()>
	//    6   11:astore_1        
			zzbpm.zzL(((com.google.android.gms.dynamic.IObjectWrapper) (bitmapdescriptor)));
	//    7   12:aload_0         
	//    8   13:getfield        #21  <Field zzc zzbpm>
	//    9   16:aload_1         
	//   10   17:invokeinterface #121 <Method void zzc.zzL(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public void setPosition(LatLng latlng)
	{
		try
		{
			zzbpm.setPosition(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #126 <Method void zzc.setPosition(LatLng)>
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

	public void setPositionFromBounds(LatLngBounds latlngbounds)
	{
		try
		{
			zzbpm.setPositionFromBounds(latlngbounds);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #130 <Method void zzc.setPositionFromBounds(LatLngBounds)>
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

	public void setTag(Object obj)
	{
		try
		{
			zzbpm.setTag(zzd.zzA(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:aload_1         
	//    3    5:invokestatic    #136 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    4    8:invokeinterface #138 <Method void zzc.setTag(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public void setTransparency(float f)
	{
		try
		{
			zzbpm.setTransparency(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:fload_1         
	//    3    5:invokeinterface #141 <Method void zzc.setTransparency(float)>
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

	public void setVisible(boolean flag)
	{
		try
		{
			zzbpm.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:iload_1         
	//    3    5:invokeinterface #144 <Method void zzc.setVisible(boolean)>
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

	public void setZIndex(float f)
	{
		try
		{
			zzbpm.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzc zzbpm>
	//    2    4:fload_1         
	//    3    5:invokeinterface #147 <Method void zzc.setZIndex(float)>
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

	private final zzc zzbpm;
}
