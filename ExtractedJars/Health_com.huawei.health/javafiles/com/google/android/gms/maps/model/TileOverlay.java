// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.maps.model.internal.zzh;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException

public final class TileOverlay
{

	public TileOverlay(zzh zzh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbpV = (zzh)zzac.zzw(((Object) (zzh1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class zzh>
	//    6   12:putfield        #21  <Field zzh zzbpV>
	//    7   15:return          
	}

	public void clearTileCache()
	{
		try
		{
			zzbpV.clearTileCache();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #27  <Method void zzh.clearTileCache()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #29  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof TileOverlay))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class TileOverlay>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzbpV.zza(((TileOverlay)obj).zzbpV);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzh zzbpV>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class TileOverlay>
	//    9   17:getfield        #21  <Field zzh zzbpV>
	//   10   20:invokeinterface #38  <Method boolean zzh.zza(zzh)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  14   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (obj)));
	//   15   29:new             #29  <Class RuntimeRemoteException>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   19   37:athrow          
		}
		return flag;
	}

	public boolean getFadeIn()
	{
		boolean flag;
		try
		{
			flag = zzbpV.getFadeIn();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #42  <Method boolean zzh.getFadeIn()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public String getId()
	{
		String s;
		try
		{
			s = zzbpV.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #46  <Method String zzh.getId()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return s;
	}

	public float getTransparency()
	{
		float f;
		try
		{
			f = zzbpV.getTransparency();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #50  <Method float zzh.getTransparency()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public float getZIndex()
	{
		float f;
		try
		{
			f = zzbpV.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #53  <Method float zzh.getZIndex()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public int hashCode()
	{
		int i;
		try
		{
			i = zzbpV.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #58  <Method int zzh.hashCodeRemote()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public boolean isVisible()
	{
		boolean flag;
		try
		{
			flag = zzbpV.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #61  <Method boolean zzh.isVisible()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public void remove()
	{
		try
		{
			zzbpV.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:invokeinterface #64  <Method void zzh.remove()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #29  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void setFadeIn(boolean flag)
	{
		try
		{
			zzbpV.setFadeIn(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:iload_1         
	//    3    5:invokeinterface #68  <Method void zzh.setFadeIn(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #29  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setTransparency(float f)
	{
		try
		{
			zzbpV.setTransparency(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:fload_1         
	//    3    5:invokeinterface #72  <Method void zzh.setTransparency(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #29  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setVisible(boolean flag)
	{
		try
		{
			zzbpV.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:iload_1         
	//    3    5:invokeinterface #75  <Method void zzh.setVisible(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #29  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setZIndex(float f)
	{
		try
		{
			zzbpV.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzh zzbpV>
	//    2    4:fload_1         
	//    3    5:invokeinterface #78  <Method void zzh.setZIndex(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #29  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	private final zzh zzbpV;
}
