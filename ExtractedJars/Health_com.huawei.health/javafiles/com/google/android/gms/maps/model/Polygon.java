// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzg;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, PatternItem

public final class Polygon
{

	public Polygon(zzg zzg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbpK = (zzg)zzac.zzw(((Object) (zzg1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class zzg>
	//    6   12:putfield        #21  <Field zzg zzbpK>
	//    7   15:return          
	}

	public boolean equals(Object obj)
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
			flag = zzbpK.zzb(((Polygon)obj).zzbpK);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzg zzbpK>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Polygon>
	//    9   17:getfield        #21  <Field zzg zzbpK>
	//   10   20:invokeinterface #30  <Method boolean zzg.zzb(zzg)>
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

	public int getFillColor()
	{
		int i;
		try
		{
			i = zzbpK.getFillColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #39  <Method int zzg.getFillColor()>
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

	public List getHoles()
	{
		List list;
		try
		{
			list = zzbpK.getHoles();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #43  <Method List zzg.getHoles()>
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

	public String getId()
	{
		String s;
		try
		{
			s = zzbpK.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #49  <Method String zzg.getId()>
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

	public List getPoints()
	{
		List list;
		try
		{
			list = zzbpK.getPoints();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #52  <Method List zzg.getPoints()>
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

	public int getStrokeColor()
	{
		int i;
		try
		{
			i = zzbpK.getStrokeColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #56  <Method int zzg.getStrokeColor()>
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

	public int getStrokeJointType()
	{
		int i;
		try
		{
			i = zzbpK.getStrokeJointType();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #59  <Method int zzg.getStrokeJointType()>
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
			list = PatternItem.zzI(zzbpK.getStrokePattern());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #63  <Method List zzg.getStrokePattern()>
	//    3    9:invokestatic    #69  <Method List PatternItem.zzI(List)>
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
			f = zzbpK.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #75  <Method float zzg.getStrokeWidth()>
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
			obj = zzd.zzF(zzbpK.getTag());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #80  <Method com.google.android.gms.dynamic.IObjectWrapper zzg.getTag()>
	//    3    9:invokestatic    #86  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
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
			f = zzbpK.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #89  <Method float zzg.getZIndex()>
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
			i = zzbpK.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #93  <Method int zzg.hashCodeRemote()>
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
			flag = zzbpK.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #97  <Method boolean zzg.isClickable()>
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

	public boolean isGeodesic()
	{
		boolean flag;
		try
		{
			flag = zzbpK.isGeodesic();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #100 <Method boolean zzg.isGeodesic()>
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
			flag = zzbpK.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #103 <Method boolean zzg.isVisible()>
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
			zzbpK.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:invokeinterface #106 <Method void zzg.remove()>
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

	public void setClickable(boolean flag)
	{
		try
		{
			zzbpK.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:iload_1         
	//    3    5:invokeinterface #110 <Method void zzg.setClickable(boolean)>
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
			zzbpK.setFillColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:iload_1         
	//    3    5:invokeinterface #114 <Method void zzg.setFillColor(int)>
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

	public void setGeodesic(boolean flag)
	{
		try
		{
			zzbpK.setGeodesic(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:iload_1         
	//    3    5:invokeinterface #117 <Method void zzg.setGeodesic(boolean)>
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

	public void setHoles(List list)
	{
		try
		{
			zzbpK.setHoles(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:aload_1         
	//    3    5:invokeinterface #121 <Method void zzg.setHoles(List)>
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

	public void setPoints(List list)
	{
		try
		{
			zzbpK.setPoints(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:aload_1         
	//    3    5:invokeinterface #125 <Method void zzg.setPoints(List)>
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

	public void setStrokeColor(int i)
	{
		try
		{
			zzbpK.setStrokeColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:iload_1         
	//    3    5:invokeinterface #129 <Method void zzg.setStrokeColor(int)>
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

	public void setStrokeJointType(int i)
	{
		try
		{
			zzbpK.setStrokeJointType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:iload_1         
	//    3    5:invokeinterface #132 <Method void zzg.setStrokeJointType(int)>
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
			zzbpK.setStrokePattern(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:aload_1         
	//    3    5:invokeinterface #135 <Method void zzg.setStrokePattern(List)>
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
			zzbpK.setStrokeWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:fload_1         
	//    3    5:invokeinterface #141 <Method void zzg.setStrokeWidth(float)>
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
			zzbpK.setTag(zzd.zzA(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:aload_1         
	//    3    5:invokestatic    #147 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    4    8:invokeinterface #150 <Method void zzg.setTag(com.google.android.gms.dynamic.IObjectWrapper)>
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
			zzbpK.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:iload_1         
	//    3    5:invokeinterface #153 <Method void zzg.setVisible(boolean)>
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
			zzbpK.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzg zzbpK>
	//    2    4:fload_1         
	//    3    5:invokeinterface #156 <Method void zzg.setZIndex(float)>
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

	private final zzg zzbpK;
}
