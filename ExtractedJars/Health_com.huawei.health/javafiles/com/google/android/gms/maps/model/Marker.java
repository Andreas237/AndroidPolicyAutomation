// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, BitmapDescriptor, LatLng

public final class Marker
{

	public Marker(zzf zzf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbpB = (zzf)zzac.zzw(((Object) (zzf1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class zzf>
	//    6   12:putfield        #21  <Field zzf zzbpB>
	//    7   15:return          
	}

	public boolean equals(Object obj)
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
			flag = zzbpB.zzj(((Marker)obj).zzbpB);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzf zzbpB>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Marker>
	//    9   17:getfield        #21  <Field zzf zzbpB>
	//   10   20:invokeinterface #30  <Method boolean zzf.zzj(zzf)>
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

	public float getAlpha()
	{
		float f;
		try
		{
			f = zzbpB.getAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #39  <Method float zzf.getAlpha()>
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
			s = zzbpB.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #43  <Method String zzf.getId()>
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
			latlng = zzbpB.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #47  <Method LatLng zzf.getPosition()>
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

	public float getRotation()
	{
		float f;
		try
		{
			f = zzbpB.getRotation();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #50  <Method float zzf.getRotation()>
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

	public String getSnippet()
	{
		String s;
		try
		{
			s = zzbpB.getSnippet();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #53  <Method String zzf.getSnippet()>
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

	public Object getTag()
	{
		Object obj;
		try
		{
			obj = zzd.zzF(zzbpB.getTag());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #59  <Method com.google.android.gms.dynamic.IObjectWrapper zzf.getTag()>
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

	public String getTitle()
	{
		String s;
		try
		{
			s = zzbpB.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #69  <Method String zzf.getTitle()>
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

	public float getZIndex()
	{
		float f;
		try
		{
			f = zzbpB.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #72  <Method float zzf.getZIndex()>
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
			i = zzbpB.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #77  <Method int zzf.hashCodeRemote()>
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

	public void hideInfoWindow()
	{
		try
		{
			zzbpB.hideInfoWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #80  <Method void zzf.hideInfoWindow()>
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

	public boolean isDraggable()
	{
		boolean flag;
		try
		{
			flag = zzbpB.isDraggable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #84  <Method boolean zzf.isDraggable()>
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

	public boolean isFlat()
	{
		boolean flag;
		try
		{
			flag = zzbpB.isFlat();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #87  <Method boolean zzf.isFlat()>
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

	public boolean isInfoWindowShown()
	{
		boolean flag;
		try
		{
			flag = zzbpB.isInfoWindowShown();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #90  <Method boolean zzf.isInfoWindowShown()>
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
			flag = zzbpB.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #93  <Method boolean zzf.isVisible()>
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
			zzbpB.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #96  <Method void zzf.remove()>
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

	public void setAlpha(float f)
	{
		try
		{
			zzbpB.setAlpha(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:fload_1         
	//    3    5:invokeinterface #100 <Method void zzf.setAlpha(float)>
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

	public void setAnchor(float f, float f1)
	{
		try
		{
			zzbpB.setAnchor(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #104 <Method void zzf.setAnchor(float, float)>
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

	public void setDraggable(boolean flag)
	{
		try
		{
			zzbpB.setDraggable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:iload_1         
	//    3    5:invokeinterface #108 <Method void zzf.setDraggable(boolean)>
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

	public void setFlat(boolean flag)
	{
		try
		{
			zzbpB.setFlat(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:iload_1         
	//    3    5:invokeinterface #111 <Method void zzf.setFlat(boolean)>
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

	public void setIcon(BitmapDescriptor bitmapdescriptor)
	{
		if(bitmapdescriptor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbpB.zzM(((com.google.android.gms.dynamic.IObjectWrapper) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzf zzbpB>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #117 <Method void zzf.zzM(com.google.android.gms.dynamic.IObjectWrapper)>
			}
	//*   6   14:goto            32
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #122 <Method com.google.android.gms.dynamic.IObjectWrapper BitmapDescriptor.zzJm()>
	//*   9   21:astore_1        
	//*  10   22:aload_0         
	//*  11   23:getfield        #21  <Field zzf zzbpB>
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #117 <Method void zzf.zzM(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  14   32:return          
			// Misplaced declaration of an exception variable
			catch(BitmapDescriptor bitmapdescriptor)
	//*  15   33:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (bitmapdescriptor)));
	//   16   34:new             #32  <Class RuntimeRemoteException>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   20   42:athrow          
			}
			break MISSING_BLOCK_LABEL_32;
		}
		bitmapdescriptor = ((BitmapDescriptor) (bitmapdescriptor.zzJm()));
		zzbpB.zzM(((com.google.android.gms.dynamic.IObjectWrapper) (bitmapdescriptor)));
	}

	public void setInfoWindowAnchor(float f, float f1)
	{
		try
		{
			zzbpB.setInfoWindowAnchor(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #126 <Method void zzf.setInfoWindowAnchor(float, float)>
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

	public void setPosition(LatLng latlng)
	{
		if(latlng == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("latlng cannot be null - a position is required.");
	//    2    4:new             #131 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #133 <String "latlng cannot be null - a position is required.">
	//    5   10:invokespecial   #136 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			zzbpB.setPosition(latlng);
	//    7   14:aload_0         
	//    8   15:getfield        #21  <Field zzf zzbpB>
	//    9   18:aload_1         
	//   10   19:invokeinterface #138 <Method void zzf.setPosition(LatLng)>
			return;
	//   11   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*  12   25:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//   13   26:new             #32  <Class RuntimeRemoteException>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   17   34:athrow          
		}
	}

	public void setRotation(float f)
	{
		try
		{
			zzbpB.setRotation(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:fload_1         
	//    3    5:invokeinterface #141 <Method void zzf.setRotation(float)>
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

	public void setSnippet(String s)
	{
		try
		{
			zzbpB.setSnippet(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:aload_1         
	//    3    5:invokeinterface #144 <Method void zzf.setSnippet(String)>
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

	public void setTag(Object obj)
	{
		try
		{
			zzbpB.setTag(zzd.zzA(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:aload_1         
	//    3    5:invokestatic    #150 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    4    8:invokeinterface #152 <Method void zzf.setTag(com.google.android.gms.dynamic.IObjectWrapper)>
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

	public void setTitle(String s)
	{
		try
		{
			zzbpB.setTitle(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:aload_1         
	//    3    5:invokeinterface #155 <Method void zzf.setTitle(String)>
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

	public void setVisible(boolean flag)
	{
		try
		{
			zzbpB.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:iload_1         
	//    3    5:invokeinterface #158 <Method void zzf.setVisible(boolean)>
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
			zzbpB.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:fload_1         
	//    3    5:invokeinterface #161 <Method void zzf.setZIndex(float)>
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

	public void showInfoWindow()
	{
		try
		{
			zzbpB.showInfoWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzf zzbpB>
	//    2    4:invokeinterface #164 <Method void zzf.showInfoWindow()>
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

	private final zzf zzbpB;
}
