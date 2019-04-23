// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings
{

	UiSettings(IUiSettingsDelegate iuisettingsdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzci = iuisettingsdelegate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field IUiSettingsDelegate zzci>
	//    5    9:return          
	}

	public final boolean isCompassEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isCompassEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #22  <Method boolean IUiSettingsDelegate.isCompassEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isIndoorLevelPickerEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isIndoorLevelPickerEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #30  <Method boolean IUiSettingsDelegate.isIndoorLevelPickerEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isMapToolbarEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isMapToolbarEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #33  <Method boolean IUiSettingsDelegate.isMapToolbarEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isMyLocationButtonEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isMyLocationButtonEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #36  <Method boolean IUiSettingsDelegate.isMyLocationButtonEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isRotateGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isRotateGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #39  <Method boolean IUiSettingsDelegate.isRotateGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isScrollGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isScrollGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #42  <Method boolean IUiSettingsDelegate.isScrollGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isTiltGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isTiltGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #45  <Method boolean IUiSettingsDelegate.isTiltGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isZoomControlsEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isZoomControlsEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #48  <Method boolean IUiSettingsDelegate.isZoomControlsEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isZoomGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzci.isZoomGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:invokeinterface #51  <Method boolean IUiSettingsDelegate.isZoomGesturesEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #24  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final void setAllGesturesEnabled(boolean flag)
	{
		try
		{
			zzci.setAllGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #55  <Method void IUiSettingsDelegate.setAllGesturesEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setCompassEnabled(boolean flag)
	{
		try
		{
			zzci.setCompassEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #58  <Method void IUiSettingsDelegate.setCompassEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setIndoorLevelPickerEnabled(boolean flag)
	{
		try
		{
			zzci.setIndoorLevelPickerEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #61  <Method void IUiSettingsDelegate.setIndoorLevelPickerEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setMapToolbarEnabled(boolean flag)
	{
		try
		{
			zzci.setMapToolbarEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #64  <Method void IUiSettingsDelegate.setMapToolbarEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setMyLocationButtonEnabled(boolean flag)
	{
		try
		{
			zzci.setMyLocationButtonEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #67  <Method void IUiSettingsDelegate.setMyLocationButtonEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setRotateGesturesEnabled(boolean flag)
	{
		try
		{
			zzci.setRotateGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #70  <Method void IUiSettingsDelegate.setRotateGesturesEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setScrollGesturesEnabled(boolean flag)
	{
		try
		{
			zzci.setScrollGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #73  <Method void IUiSettingsDelegate.setScrollGesturesEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setTiltGesturesEnabled(boolean flag)
	{
		try
		{
			zzci.setTiltGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #76  <Method void IUiSettingsDelegate.setTiltGesturesEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setZoomControlsEnabled(boolean flag)
	{
		try
		{
			zzci.setZoomControlsEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #79  <Method void IUiSettingsDelegate.setZoomControlsEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setZoomGesturesEnabled(boolean flag)
	{
		try
		{
			zzci.setZoomGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzci>
	//    2    4:iload_1         
	//    3    5:invokeinterface #82  <Method void IUiSettingsDelegate.setZoomGesturesEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #24  <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #27  <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	private final IUiSettingsDelegate zzci;
}
