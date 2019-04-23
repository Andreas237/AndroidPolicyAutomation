// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection
{

	Projection(IProjectionDelegate iprojectiondelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbm = iprojectiondelegate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field IProjectionDelegate zzbm>
	//    5    9:return          
	}

	public final LatLng fromScreenLocation(Point point)
	{
		try
		{
			point = ((Point) (zzbm.fromScreenLocation(ObjectWrapper.wrap(((Object) (point))))));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IProjectionDelegate zzbm>
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #29  <Method LatLng IProjectionDelegate.fromScreenLocation(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   13:astore_1        
		}
	//*   6   14:aload_1         
	//*   7   15:areturn         
		// Misplaced declaration of an exception variable
		catch(Point point)
	//*   8   16:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (point)));
	//    9   17:new             #31  <Class RuntimeRemoteException>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   13   25:athrow          
		}
		return ((LatLng) (point));
	}

	public final VisibleRegion getVisibleRegion()
	{
		VisibleRegion visibleregion;
		try
		{
			visibleregion = zzbm.getVisibleRegion();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IProjectionDelegate zzbm>
	//    2    4:invokeinterface #38  <Method VisibleRegion IProjectionDelegate.getVisibleRegion()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #31  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return visibleregion;
	}

	public final Point toScreenLocation(LatLng latlng)
	{
		try
		{
			latlng = ((LatLng) ((Point)ObjectWrapper.unwrap(zzbm.toScreenLocation(latlng))));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IProjectionDelegate zzbm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #43  <Method com.google.android.gms.dynamic.IObjectWrapper IProjectionDelegate.toScreenLocation(LatLng)>
	//    4   10:invokestatic    #47  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//    5   13:checkcast       #49  <Class Point>
	//    6   16:astore_1        
		}
	//*   7   17:aload_1         
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlng)));
	//   10   20:new             #31  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #34  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return ((Point) (latlng));
	}

	private final IProjectionDelegate zzbm;
}
