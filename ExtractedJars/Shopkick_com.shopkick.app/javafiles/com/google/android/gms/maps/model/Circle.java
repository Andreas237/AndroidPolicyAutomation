// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzh;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, PatternItem, LatLng

public final class Circle
{

	public Circle(zzh zzh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzcn = (zzh)Preconditions.checkNotNull(((Object) (zzh1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #19  <Class zzh>
	//    6   12:putfield        #21  <Field zzh zzcn>
	//    7   15:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof Circle))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Circle>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzcn.zzb(((Circle)obj).zzcn);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzh zzcn>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Circle>
	//    9   17:getfield        #21  <Field zzh zzcn>
	//   10   20:invokeinterface #30  <Method boolean zzh.zzb(zzh)>
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

	public final LatLng getCenter()
	{
		LatLng latlng;
		try
		{
			latlng = zzcn.getCenter();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #39  <Method LatLng zzh.getCenter()>
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

	public final int getFillColor()
	{
		int i;
		try
		{
			i = zzcn.getFillColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #43  <Method int zzh.getFillColor()>
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

	public final String getId()
	{
		String s;
		try
		{
			s = zzcn.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #47  <Method String zzh.getId()>
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

	public final double getRadius()
	{
		double d;
		try
		{
			d = zzcn.getRadius();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #51  <Method double zzh.getRadius()>
	//    3    9:dstore_1        
		}
	//*   4   10:dload_1         
	//*   5   11:dreturn         
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
		return d;
	}

	public final int getStrokeColor()
	{
		int i;
		try
		{
			i = zzcn.getStrokeColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #54  <Method int zzh.getStrokeColor()>
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

	public final List getStrokePattern()
	{
		List list;
		try
		{
			list = PatternItem.zza(zzcn.getStrokePattern());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #59  <Method List zzh.getStrokePattern()>
	//    3    9:invokestatic    #65  <Method List PatternItem.zza(List)>
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
		return list;
	}

	public final float getStrokeWidth()
	{
		float f;
		try
		{
			f = zzcn.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #72  <Method float zzh.getStrokeWidth()>
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

	public final Object getTag()
	{
		Object obj;
		try
		{
			obj = ObjectWrapper.unwrap(zzcn.zzj());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #78  <Method com.google.android.gms.dynamic.IObjectWrapper zzh.zzj()>
	//    3    9:invokestatic    #84  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public final float getZIndex()
	{
		float f;
		try
		{
			f = zzcn.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #87  <Method float zzh.getZIndex()>
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
			i = zzcn.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #91  <Method int zzh.zzi()>
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
			flag = zzcn.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #95  <Method boolean zzh.isClickable()>
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
			flag = zzcn.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #98  <Method boolean zzh.isVisible()>
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
			zzcn.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:invokeinterface #101 <Method void zzh.remove()>
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

	public final void setCenter(LatLng latlng)
	{
		try
		{
			zzcn.setCenter(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #105 <Method void zzh.setCenter(LatLng)>
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

	public final void setClickable(boolean flag)
	{
		try
		{
			zzcn.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #109 <Method void zzh.setClickable(boolean)>
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

	public final void setFillColor(int i)
	{
		try
		{
			zzcn.setFillColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #113 <Method void zzh.setFillColor(int)>
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

	public final void setRadius(double d)
	{
		try
		{
			zzcn.setRadius(d);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:dload_1         
	//    3    5:invokeinterface #117 <Method void zzh.setRadius(double)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_3        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_3         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setStrokeColor(int i)
	{
		try
		{
			zzcn.setStrokeColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #120 <Method void zzh.setStrokeColor(int)>
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

	public final void setStrokePattern(List list)
	{
		try
		{
			zzcn.setStrokePattern(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #124 <Method void zzh.setStrokePattern(List)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (list)));
	//    6   12:new             #32  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setStrokeWidth(float f)
	{
		try
		{
			zzcn.setStrokeWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:fload_1         
	//    3    5:invokeinterface #130 <Method void zzh.setStrokeWidth(float)>
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

	public final void setTag(Object obj)
	{
		try
		{
			zzcn.zze(ObjectWrapper.wrap(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:aload_1         
	//    3    5:invokestatic    #136 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #140 <Method void zzh.zze(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public final void setVisible(boolean flag)
	{
		try
		{
			zzcn.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:iload_1         
	//    3    5:invokeinterface #143 <Method void zzh.setVisible(boolean)>
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
			zzcn.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzcn>
	//    2    4:fload_1         
	//    3    5:invokeinterface #146 <Method void zzh.setZIndex(float)>
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

	private final zzh zzcn;
}
