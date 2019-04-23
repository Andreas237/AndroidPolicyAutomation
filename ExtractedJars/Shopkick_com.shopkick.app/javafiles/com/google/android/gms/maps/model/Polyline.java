// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzz;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, Cap, PatternItem

public final class Polyline
{

	public Polyline(zzz zzz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzea = (zzz)Preconditions.checkNotNull(((Object) (zzz1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #19  <Class zzz>
	//    6   12:putfield        #21  <Field zzz zzea>
	//    7   15:return          
	}

	public final boolean equals(Object obj)
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
			flag = zzea.zzb(((Polyline)obj).zzea);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzz zzea>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Polyline>
	//    9   17:getfield        #21  <Field zzz zzea>
	//   10   20:invokeinterface #30  <Method boolean zzz.zzb(zzz)>
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

	public final int getColor()
	{
		int i;
		try
		{
			i = zzea.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #39  <Method int zzz.getColor()>
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

	public final Cap getEndCap()
	{
		Cap cap;
		try
		{
			cap = zzea.getEndCap().zzg();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #44  <Method Cap zzz.getEndCap()>
	//    3    9:invokevirtual   #49  <Method Cap Cap.zzg()>
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

	public final String getId()
	{
		String s;
		try
		{
			s = zzea.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #54  <Method String zzz.getId()>
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

	public final int getJointType()
	{
		int i;
		try
		{
			i = zzea.getJointType();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #57  <Method int zzz.getJointType()>
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

	public final List getPattern()
	{
		List list;
		try
		{
			list = PatternItem.zza(zzea.getPattern());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #62  <Method List zzz.getPattern()>
	//    3    9:invokestatic    #68  <Method List PatternItem.zza(List)>
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

	public final List getPoints()
	{
		List list;
		try
		{
			list = zzea.getPoints();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #73  <Method List zzz.getPoints()>
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

	public final Cap getStartCap()
	{
		Cap cap;
		try
		{
			cap = zzea.getStartCap().zzg();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #77  <Method Cap zzz.getStartCap()>
	//    3    9:invokevirtual   #49  <Method Cap Cap.zzg()>
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

	public final Object getTag()
	{
		Object obj;
		try
		{
			obj = ObjectWrapper.unwrap(zzea.zzj());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #83  <Method com.google.android.gms.dynamic.IObjectWrapper zzz.zzj()>
	//    3    9:invokestatic    #89  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public final float getWidth()
	{
		float f;
		try
		{
			f = zzea.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #93  <Method float zzz.getWidth()>
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
			f = zzea.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #96  <Method float zzz.getZIndex()>
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
			i = zzea.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #100 <Method int zzz.zzi()>
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
			flag = zzea.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #104 <Method boolean zzz.isClickable()>
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
			flag = zzea.isGeodesic();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #107 <Method boolean zzz.isGeodesic()>
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
			flag = zzea.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #110 <Method boolean zzz.isVisible()>
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
			zzea.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:invokeinterface #113 <Method void zzz.remove()>
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
			zzea.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:iload_1         
	//    3    5:invokeinterface #117 <Method void zzz.setClickable(boolean)>
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

	public final void setColor(int i)
	{
		try
		{
			zzea.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:iload_1         
	//    3    5:invokeinterface #121 <Method void zzz.setColor(int)>
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

	public final void setEndCap(Cap cap)
	{
		Preconditions.checkNotNull(((Object) (cap)), "endCap must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #125 <String "endCap must not be null">
	//    2    3:invokestatic    #128 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		try
		{
			zzea.setEndCap(cap);
	//    4    7:aload_0         
	//    5    8:getfield        #21  <Field zzz zzea>
	//    6   11:aload_1         
	//    7   12:invokeinterface #130 <Method void zzz.setEndCap(Cap)>
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

	public final void setGeodesic(boolean flag)
	{
		try
		{
			zzea.setGeodesic(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:iload_1         
	//    3    5:invokeinterface #134 <Method void zzz.setGeodesic(boolean)>
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

	public final void setJointType(int i)
	{
		try
		{
			zzea.setJointType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:iload_1         
	//    3    5:invokeinterface #137 <Method void zzz.setJointType(int)>
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

	public final void setPattern(List list)
	{
		try
		{
			zzea.setPattern(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:aload_1         
	//    3    5:invokeinterface #141 <Method void zzz.setPattern(List)>
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
			zzea.setPoints(list);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:aload_1         
	//    3    5:invokeinterface #145 <Method void zzz.setPoints(List)>
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

	public final void setStartCap(Cap cap)
	{
		Preconditions.checkNotNull(((Object) (cap)), "startCap must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #149 <String "startCap must not be null">
	//    2    3:invokestatic    #128 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		try
		{
			zzea.setStartCap(cap);
	//    4    7:aload_0         
	//    5    8:getfield        #21  <Field zzz zzea>
	//    6   11:aload_1         
	//    7   12:invokeinterface #151 <Method void zzz.setStartCap(Cap)>
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

	public final void setTag(Object obj)
	{
		try
		{
			zzea.zze(ObjectWrapper.wrap(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:aload_1         
	//    3    5:invokestatic    #157 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #161 <Method void zzz.zze(com.google.android.gms.dynamic.IObjectWrapper)>
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
			zzea.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:iload_1         
	//    3    5:invokeinterface #164 <Method void zzz.setVisible(boolean)>
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

	public final void setWidth(float f)
	{
		try
		{
			zzea.setWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:fload_1         
	//    3    5:invokeinterface #168 <Method void zzz.setWidth(float)>
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
			zzea.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzz zzea>
	//    2    4:fload_1         
	//    3    5:invokeinterface #171 <Method void zzz.setZIndex(float)>
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

	private final zzz zzea;
}
