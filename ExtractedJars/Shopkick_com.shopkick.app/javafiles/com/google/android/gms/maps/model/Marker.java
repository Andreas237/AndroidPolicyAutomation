// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzt;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, BitmapDescriptor, LatLng

public final class Marker
{

	public Marker(zzt zzt1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzdl = (zzt)Preconditions.checkNotNull(((Object) (zzt1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #19  <Class zzt>
	//    6   12:putfield        #21  <Field zzt zzdl>
	//    7   15:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof Marker))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Marker>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzdl.zzj(((Marker)obj).zzdl);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzt zzdl>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Marker>
	//    9   17:getfield        #21  <Field zzt zzdl>
	//   10   20:invokeinterface #30  <Method boolean zzt.zzj(zzt)>
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

	public final float getAlpha()
	{
		float f;
		try
		{
			f = zzdl.getAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #39  <Method float zzt.getAlpha()>
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
			s = zzdl.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #43  <Method String zzt.getId()>
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
			latlng = zzdl.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #47  <Method LatLng zzt.getPosition()>
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

	public final float getRotation()
	{
		float f;
		try
		{
			f = zzdl.getRotation();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #50  <Method float zzt.getRotation()>
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

	public final String getSnippet()
	{
		String s;
		try
		{
			s = zzdl.getSnippet();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #53  <Method String zzt.getSnippet()>
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

	public final Object getTag()
	{
		Object obj;
		try
		{
			obj = ObjectWrapper.unwrap(zzdl.zzj());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #59  <Method com.google.android.gms.dynamic.IObjectWrapper zzt.zzj()>
	//    3    9:invokestatic    #65  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public final String getTitle()
	{
		String s;
		try
		{
			s = zzdl.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #69  <Method String zzt.getTitle()>
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

	public final float getZIndex()
	{
		float f;
		try
		{
			f = zzdl.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #72  <Method float zzt.getZIndex()>
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
			i = zzdl.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #77  <Method int zzt.zzi()>
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

	public final void hideInfoWindow()
	{
		try
		{
			zzdl.hideInfoWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #80  <Method void zzt.hideInfoWindow()>
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

	public final boolean isDraggable()
	{
		boolean flag;
		try
		{
			flag = zzdl.isDraggable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #84  <Method boolean zzt.isDraggable()>
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

	public final boolean isFlat()
	{
		boolean flag;
		try
		{
			flag = zzdl.isFlat();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #87  <Method boolean zzt.isFlat()>
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

	public final boolean isInfoWindowShown()
	{
		boolean flag;
		try
		{
			flag = zzdl.isInfoWindowShown();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #90  <Method boolean zzt.isInfoWindowShown()>
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
			flag = zzdl.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #93  <Method boolean zzt.isVisible()>
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
			zzdl.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #96  <Method void zzt.remove()>
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

	public final void setAlpha(float f)
	{
		try
		{
			zzdl.setAlpha(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:fload_1         
	//    3    5:invokeinterface #100 <Method void zzt.setAlpha(float)>
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

	public final void setAnchor(float f, float f1)
	{
		try
		{
			zzdl.setAnchor(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #104 <Method void zzt.setAnchor(float, float)>
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

	public final void setDraggable(boolean flag)
	{
		try
		{
			zzdl.setDraggable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #108 <Method void zzt.setDraggable(boolean)>
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

	public final void setFlat(boolean flag)
	{
		try
		{
			zzdl.setFlat(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #111 <Method void zzt.setFlat(boolean)>
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

	public final void setIcon(BitmapDescriptor bitmapdescriptor)
	{
		if(bitmapdescriptor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzdl.zzg(((com.google.android.gms.dynamic.IObjectWrapper) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzt zzdl>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #117 <Method void zzt.zzg(com.google.android.gms.dynamic.IObjectWrapper)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #122 <Method com.google.android.gms.dynamic.IObjectWrapper BitmapDescriptor.zza()>
	//*   9   19:astore_1        
	//*  10   20:aload_0         
	//*  11   21:getfield        #21  <Field zzt zzdl>
	//*  12   24:aload_1         
	//*  13   25:invokeinterface #117 <Method void zzt.zzg(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  14   30:return          
			// Misplaced declaration of an exception variable
			catch(BitmapDescriptor bitmapdescriptor)
	//*  15   31:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (bitmapdescriptor)));
	//   16   32:new             #32  <Class RuntimeRemoteException>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   20   40:athrow          
			}
		bitmapdescriptor = ((BitmapDescriptor) (bitmapdescriptor.zza()));
		zzdl.zzg(((com.google.android.gms.dynamic.IObjectWrapper) (bitmapdescriptor)));
		return;
	}

	public final void setInfoWindowAnchor(float f, float f1)
	{
		try
		{
			zzdl.setInfoWindowAnchor(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #126 <Method void zzt.setInfoWindowAnchor(float, float)>
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

	public final void setPosition(LatLng latlng)
	{
		if(latlng != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
			try
			{
				zzdl.setPosition(latlng);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzt zzdl>
	//    4    8:aload_1         
	//    5    9:invokeinterface #131 <Method void zzt.setPosition(LatLng)>
				return;
	//    6   14:return          
			}
			// Misplaced declaration of an exception variable
			catch(LatLng latlng)
	//*   7   15:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//    8   16:new             #32  <Class RuntimeRemoteException>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   12   24:athrow          
			}
		else
			throw new IllegalArgumentException("latlng cannot be null - a position is required.");
	//   13   25:new             #133 <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #135 <String "latlng cannot be null - a position is required.">
	//   16   31:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
	}

	public final void setRotation(float f)
	{
		try
		{
			zzdl.setRotation(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:fload_1         
	//    3    5:invokeinterface #141 <Method void zzt.setRotation(float)>
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

	public final void setSnippet(String s)
	{
		try
		{
			zzdl.setSnippet(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #144 <Method void zzt.setSnippet(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
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
			zzdl.zze(ObjectWrapper.wrap(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:aload_1         
	//    3    5:invokestatic    #150 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #153 <Method void zzt.zze(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public final void setTitle(String s)
	{
		try
		{
			zzdl.setTitle(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #156 <Method void zzt.setTitle(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setVisible(boolean flag)
	{
		try
		{
			zzdl.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #159 <Method void zzt.setVisible(boolean)>
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
			zzdl.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:fload_1         
	//    3    5:invokeinterface #162 <Method void zzt.setZIndex(float)>
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

	public final void showInfoWindow()
	{
		try
		{
			zzdl.showInfoWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzt zzdl>
	//    2    4:invokeinterface #165 <Method void zzt.showInfoWindow()>
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

	private final zzt zzdl;
}
