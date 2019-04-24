// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, Cap, PatternItem

public final class Polyline
{

	public Polyline(IPolylineDelegate ipolylinedelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbpP = (IPolylineDelegate)zzac.zzw(((Object) (ipolylinedelegate)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class IPolylineDelegate>
	//    6   12:putfield        #21  <Field IPolylineDelegate zzbpP>
	//    7   15:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Polyline))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Polyline>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzbpP.equalsRemote(((Polyline)obj).zzbpP);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Polyline>
	//    9   17:getfield        #21  <Field IPolylineDelegate zzbpP>
	//   10   20:invokeinterface #30  <Method boolean IPolylineDelegate.equalsRemote(IPolylineDelegate)>
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

	public int getColor()
	{
		int i;
		try
		{
			i = zzbpP.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #39  <Method int IPolylineDelegate.getColor()>
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

	public Cap getEndCap()
	{
		Cap cap;
		try
		{
			cap = zzbpP.getEndCap().zzJJ();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #44  <Method Cap IPolylineDelegate.getEndCap()>
	//    3    9:invokevirtual   #49  <Method Cap Cap.zzJJ()>
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
		return cap;
	}

	public String getId()
	{
		String s;
		try
		{
			s = zzbpP.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #54  <Method String IPolylineDelegate.getId()>
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

	public int getJointType()
	{
		int i;
		try
		{
			i = zzbpP.getJointType();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #57  <Method int IPolylineDelegate.getJointType()>
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

	public List getPattern()
	{
		List list;
		try
		{
			list = PatternItem.zzI(zzbpP.getPattern());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #62  <Method List IPolylineDelegate.getPattern()>
	//    3    9:invokestatic    #68  <Method List PatternItem.zzI(List)>
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

	public List getPoints()
	{
		List list;
		try
		{
			list = zzbpP.getPoints();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #73  <Method List IPolylineDelegate.getPoints()>
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

	public Cap getStartCap()
	{
		Cap cap;
		try
		{
			cap = zzbpP.getStartCap().zzJJ();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #77  <Method Cap IPolylineDelegate.getStartCap()>
	//    3    9:invokevirtual   #49  <Method Cap Cap.zzJJ()>
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
		return cap;
	}

	public Object getTag()
	{
		Object obj;
		try
		{
			obj = zzd.zzF(zzbpP.getTag());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #82  <Method com.google.android.gms.dynamic.IObjectWrapper IPolylineDelegate.getTag()>
	//    3    9:invokestatic    #88  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public float getWidth()
	{
		float f;
		try
		{
			f = zzbpP.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #92  <Method float IPolylineDelegate.getWidth()>
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
			f = zzbpP.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #95  <Method float IPolylineDelegate.getZIndex()>
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
			i = zzbpP.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #99  <Method int IPolylineDelegate.hashCodeRemote()>
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
			flag = zzbpP.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #103 <Method boolean IPolylineDelegate.isClickable()>
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
			flag = zzbpP.isGeodesic();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #106 <Method boolean IPolylineDelegate.isGeodesic()>
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
			flag = zzbpP.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #109 <Method boolean IPolylineDelegate.isVisible()>
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
			zzbpP.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:invokeinterface #112 <Method void IPolylineDelegate.remove()>
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
			zzbpP.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:iload_1         
	//    3    5:invokeinterface #116 <Method void IPolylineDelegate.setClickable(boolean)>
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

	public void setColor(int i)
	{
		try
		{
			zzbpP.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:iload_1         
	//    3    5:invokeinterface #120 <Method void IPolylineDelegate.setColor(int)>
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

	public void setEndCap(Cap cap)
	{
		zzac.zzb(((Object) (cap)), "endCap must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #124 <String "endCap must not be null">
	//    2    3:invokestatic    #128 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		try
		{
			zzbpP.setEndCap(cap);
	//    4    7:aload_0         
	//    5    8:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    6   11:aload_1         
	//    7   12:invokeinterface #130 <Method void IPolylineDelegate.setEndCap(Cap)>
			return;
	//    8   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(Cap cap)
	//*   9   18:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cap)));
	//   10   19:new             #32  <Class RuntimeRemoteException>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   14   27:athrow          
		}
	}

	public void setGeodesic(boolean flag)
	{
		try
		{
			zzbpP.setGeodesic(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:iload_1         
	//    3    5:invokeinterface #134 <Method void IPolylineDelegate.setGeodesic(boolean)>
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

	public void setJointType(int i)
	{
		try
		{
			zzbpP.setJointType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:iload_1         
	//    3    5:invokeinterface #137 <Method void IPolylineDelegate.setJointType(int)>
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

	public void setPattern(List list)
	{
		try
		{
			zzbpP.setPattern(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:aload_1         
	//    3    5:invokeinterface #141 <Method void IPolylineDelegate.setPattern(List)>
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
			zzbpP.setPoints(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:aload_1         
	//    3    5:invokeinterface #145 <Method void IPolylineDelegate.setPoints(List)>
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

	public void setStartCap(Cap cap)
	{
		zzac.zzb(((Object) (cap)), "startCap must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #149 <String "startCap must not be null">
	//    2    3:invokestatic    #128 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		try
		{
			zzbpP.setStartCap(cap);
	//    4    7:aload_0         
	//    5    8:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    6   11:aload_1         
	//    7   12:invokeinterface #151 <Method void IPolylineDelegate.setStartCap(Cap)>
			return;
	//    8   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(Cap cap)
	//*   9   18:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cap)));
	//   10   19:new             #32  <Class RuntimeRemoteException>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   14   27:athrow          
		}
	}

	public void setTag(Object obj)
	{
		try
		{
			zzbpP.setTag(zzd.zzA(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:aload_1         
	//    3    5:invokestatic    #157 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    4    8:invokeinterface #160 <Method void IPolylineDelegate.setTag(com.google.android.gms.dynamic.IObjectWrapper)>
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
			zzbpP.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:iload_1         
	//    3    5:invokeinterface #163 <Method void IPolylineDelegate.setVisible(boolean)>
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

	public void setWidth(float f)
	{
		try
		{
			zzbpP.setWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:fload_1         
	//    3    5:invokeinterface #167 <Method void IPolylineDelegate.setWidth(float)>
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
			zzbpP.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IPolylineDelegate zzbpP>
	//    2    4:fload_1         
	//    3    5:invokeinterface #170 <Method void IPolylineDelegate.setZIndex(float)>
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

	private final IPolylineDelegate zzbpP;
}
