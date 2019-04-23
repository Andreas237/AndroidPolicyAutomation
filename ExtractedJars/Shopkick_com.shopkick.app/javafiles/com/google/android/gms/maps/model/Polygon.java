// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzw;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, PatternItem

public final class Polygon
{

	public Polygon(zzw zzw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzdv = (zzw)Preconditions.checkNotNull(((Object) (zzw1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #19  <Class zzw>
	//    6   12:putfield        #21  <Field zzw zzdv>
	//    7   15:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof Polygon))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Polygon>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzdv.zzb(((Polygon)obj).zzdv);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzw zzdv>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Polygon>
	//    9   17:getfield        #21  <Field zzw zzdv>
	//   10   20:invokeinterface #30  <Method boolean zzw.zzb(zzw)>
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

	public final int getFillColor()
	{
		int i;
		try
		{
			i = zzdv.getFillColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #39  <Method int zzw.getFillColor()>
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

	public final List getHoles()
	{
		List list;
		try
		{
			list = zzdv.getHoles();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #43  <Method List zzw.getHoles()>
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
		return list;
	}

	public final String getId()
	{
		String s;
		try
		{
			s = zzdv.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #49  <Method String zzw.getId()>
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

	public final List getPoints()
	{
		List list;
		try
		{
			list = zzdv.getPoints();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #52  <Method List zzw.getPoints()>
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
		return list;
	}

	public final int getStrokeColor()
	{
		int i;
		try
		{
			i = zzdv.getStrokeColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #56  <Method int zzw.getStrokeColor()>
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

	public final int getStrokeJointType()
	{
		int i;
		try
		{
			i = zzdv.getStrokeJointType();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #59  <Method int zzw.getStrokeJointType()>
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
			list = PatternItem.zza(zzdv.getStrokePattern());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #63  <Method List zzw.getStrokePattern()>
	//    3    9:invokestatic    #69  <Method List PatternItem.zza(List)>
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
			f = zzdv.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #75  <Method float zzw.getStrokeWidth()>
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
			obj = ObjectWrapper.unwrap(zzdv.zzj());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #81  <Method com.google.android.gms.dynamic.IObjectWrapper zzw.zzj()>
	//    3    9:invokestatic    #87  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
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
			f = zzdv.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #90  <Method float zzw.getZIndex()>
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
			i = zzdv.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #94  <Method int zzw.zzi()>
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
			flag = zzdv.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #98  <Method boolean zzw.isClickable()>
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

	public final boolean isGeodesic()
	{
		boolean flag;
		try
		{
			flag = zzdv.isGeodesic();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #101 <Method boolean zzw.isGeodesic()>
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
			flag = zzdv.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #104 <Method boolean zzw.isVisible()>
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
			zzdv.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:invokeinterface #107 <Method void zzw.remove()>
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

	public final void setClickable(boolean flag)
	{
		try
		{
			zzdv.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #111 <Method void zzw.setClickable(boolean)>
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
			zzdv.setFillColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #115 <Method void zzw.setFillColor(int)>
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

	public final void setGeodesic(boolean flag)
	{
		try
		{
			zzdv.setGeodesic(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #118 <Method void zzw.setGeodesic(boolean)>
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

	public final void setHoles(List list)
	{
		try
		{
			zzdv.setHoles(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #122 <Method void zzw.setHoles(List)>
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

	public final void setPoints(List list)
	{
		try
		{
			zzdv.setPoints(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #126 <Method void zzw.setPoints(List)>
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

	public final void setStrokeColor(int i)
	{
		try
		{
			zzdv.setStrokeColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #130 <Method void zzw.setStrokeColor(int)>
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

	public final void setStrokeJointType(int i)
	{
		try
		{
			zzdv.setStrokeJointType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #133 <Method void zzw.setStrokeJointType(int)>
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
			zzdv.setStrokePattern(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #136 <Method void zzw.setStrokePattern(List)>
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
			zzdv.setStrokeWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:fload_1         
	//    3    5:invokeinterface #142 <Method void zzw.setStrokeWidth(float)>
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
			zzdv.zze(ObjectWrapper.wrap(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:aload_1         
	//    3    5:invokestatic    #148 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #152 <Method void zzw.zze(com.google.android.gms.dynamic.IObjectWrapper)>
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
			zzdv.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:iload_1         
	//    3    5:invokeinterface #155 <Method void zzw.setVisible(boolean)>
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
			zzdv.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzw zzdv>
	//    2    4:fload_1         
	//    3    5:invokeinterface #158 <Method void zzw.setZIndex(float)>
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

	private final zzw zzdv;
}
