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
		zzboW = iuisettingsdelegate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field IUiSettingsDelegate zzboW>
	//    5    9:return          
	}

	public boolean isCompassEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isCompassEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isIndoorLevelPickerEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isIndoorLevelPickerEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isMapToolbarEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isMapToolbarEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isMyLocationButtonEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isMyLocationButtonEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isRotateGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isRotateGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isScrollGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isScrollGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isTiltGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isTiltGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isZoomControlsEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isZoomControlsEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public boolean isZoomGesturesEnabled()
	{
		boolean flag;
		try
		{
			flag = zzboW.isZoomGesturesEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setAllGesturesEnabled(boolean flag)
	{
		try
		{
			zzboW.setAllGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setCompassEnabled(boolean flag)
	{
		try
		{
			zzboW.setCompassEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setIndoorLevelPickerEnabled(boolean flag)
	{
		try
		{
			zzboW.setIndoorLevelPickerEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setMapToolbarEnabled(boolean flag)
	{
		try
		{
			zzboW.setMapToolbarEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setMyLocationButtonEnabled(boolean flag)
	{
		try
		{
			zzboW.setMyLocationButtonEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setRotateGesturesEnabled(boolean flag)
	{
		try
		{
			zzboW.setRotateGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setScrollGesturesEnabled(boolean flag)
	{
		try
		{
			zzboW.setScrollGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setTiltGesturesEnabled(boolean flag)
	{
		try
		{
			zzboW.setTiltGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setZoomControlsEnabled(boolean flag)
	{
		try
		{
			zzboW.setZoomControlsEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	public void setZoomGesturesEnabled(boolean flag)
	{
		try
		{
			zzboW.setZoomGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IUiSettingsDelegate zzboW>
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

	private final IUiSettingsDelegate zzboW;
}
