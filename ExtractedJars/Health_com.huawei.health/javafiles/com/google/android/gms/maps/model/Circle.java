// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, PatternItem, LatLng

public final class Circle
{

	public Circle(zzb zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbpf = (zzb)zzac.zzw(((Object) (zzb1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class zzb>
	//    6   12:putfield        #21  <Field zzb zzbpf>
	//    7   15:return          
	}

	public boolean equals(Object obj)
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
			flag = zzbpf.zzb(((Circle)obj).zzbpf);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzb zzbpf>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Circle>
	//    9   17:getfield        #21  <Field zzb zzbpf>
	//   10   20:invokeinterface #30  <Method boolean zzb.zzb(zzb)>
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

	public LatLng getCenter()
	{
		LatLng latlng;
		try
		{
			latlng = zzbpf.getCenter();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #39  <Method LatLng zzb.getCenter()>
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

	public int getFillColor()
	{
		int i;
		try
		{
			i = zzbpf.getFillColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #43  <Method int zzb.getFillColor()>
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

	public String getId()
	{
		String s;
		try
		{
			s = zzbpf.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #47  <Method String zzb.getId()>
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

	public double getRadius()
	{
		double d;
		try
		{
			d = zzbpf.getRadius();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #51  <Method double zzb.getRadius()>
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

	public int getStrokeColor()
	{
		int i;
		try
		{
			i = zzbpf.getStrokeColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #54  <Method int zzb.getStrokeColor()>
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

	public List getStrokePattern()
	{
		List list;
		try
		{
			list = PatternItem.zzI(zzbpf.getStrokePattern());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #59  <Method List zzb.getStrokePattern()>
	//    3    9:invokestatic    #65  <Method List PatternItem.zzI(List)>
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

	public float getStrokeWidth()
	{
		float f;
		try
		{
			f = zzbpf.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #72  <Method float zzb.getStrokeWidth()>
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

	public Object getTag()
	{
		Object obj;
		try
		{
			obj = zzd.zzF(zzbpf.getTag());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #77  <Method com.google.android.gms.dynamic.IObjectWrapper zzb.getTag()>
	//    3    9:invokestatic    #83  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public float getZIndex()
	{
		float f;
		try
		{
			f = zzbpf.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #86  <Method float zzb.getZIndex()>
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
			i = zzbpf.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #90  <Method int zzb.hashCodeRemote()>
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
			flag = zzbpf.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #94  <Method boolean zzb.isClickable()>
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
			flag = zzbpf.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #97  <Method boolean zzb.isVisible()>
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
			zzbpf.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:invokeinterface #100 <Method void zzb.remove()>
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

	public void setCenter(LatLng latlng)
	{
		try
		{
			zzbpf.setCenter(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:aload_1         
	//    3    5:invokeinterface #104 <Method void zzb.setCenter(LatLng)>
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

	public void setClickable(boolean flag)
	{
		try
		{
			zzbpf.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:iload_1         
	//    3    5:invokeinterface #108 <Method void zzb.setClickable(boolean)>
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

	public void setFillColor(int i)
	{
		try
		{
			zzbpf.setFillColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:iload_1         
	//    3    5:invokeinterface #112 <Method void zzb.setFillColor(int)>
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

	public void setRadius(double d)
	{
		try
		{
			zzbpf.setRadius(d);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:dload_1         
	//    3    5:invokeinterface #116 <Method void zzb.setRadius(double)>
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

	public void setStrokeColor(int i)
	{
		try
		{
			zzbpf.setStrokeColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:iload_1         
	//    3    5:invokeinterface #119 <Method void zzb.setStrokeColor(int)>
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

	public void setStrokePattern(List list)
	{
		try
		{
			zzbpf.setStrokePattern(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:aload_1         
	//    3    5:invokeinterface #123 <Method void zzb.setStrokePattern(List)>
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

	public void setStrokeWidth(float f)
	{
		try
		{
			zzbpf.setStrokeWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:fload_1         
	//    3    5:invokeinterface #129 <Method void zzb.setStrokeWidth(float)>
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

	public void setTag(Object obj)
	{
		try
		{
			zzbpf.setTag(zzd.zzA(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:aload_1         
	//    3    5:invokestatic    #135 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    4    8:invokeinterface #138 <Method void zzb.setTag(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public void setVisible(boolean flag)
	{
		try
		{
			zzbpf.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:iload_1         
	//    3    5:invokeinterface #141 <Method void zzb.setVisible(boolean)>
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
			zzbpf.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzb zzbpf>
	//    2    4:fload_1         
	//    3    5:invokeinterface #144 <Method void zzb.setZIndex(float)>
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

	private final zzb zzbpf;
}
