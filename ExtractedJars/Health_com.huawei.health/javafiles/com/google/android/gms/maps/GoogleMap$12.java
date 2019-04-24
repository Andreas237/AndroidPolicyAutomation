// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzp;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap, LocationSource

class GoogleMap$12 extends com.google.android.gms.maps.internal.ceDelegate.zza
{

	public void activate(zzp zzp)
	{
		zzbnJ.activate(new LocationSource.OnLocationChangedListener(zzp) {

			public void onLocationChanged(Location location)
			{
				try
				{
					zzbnK.zze(location);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field zzp zzbnK>
			//    2    4:aload_1         
			//    3    5:invokeinterface #30  <Method void zzp.zze(Location)>
					return;
			//    4   10:return          
				}
				// Misplaced declaration of an exception variable
				catch(Location location)
			//*   5   11:astore_1        
				{
					throw new RuntimeRemoteException(((RemoteException) (location)));
			//    6   12:new             #32  <Class RuntimeRemoteException>
			//    7   15:dup             
			//    8   16:aload_1         
			//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
			//   10   20:athrow          
				}
			}

			final zzp zzbnK;

			
			{
				zzbnK = zzp1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #17  <Field zzp zzbnK>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LocationSource zzbnJ>
	//    2    4:new             #11  <Class GoogleMap$12$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #26  <Method void GoogleMap$12$1(GoogleMap$12, zzp)>
	//    7   13:invokeinterface #31  <Method void LocationSource.activate(LocationSource$OnLocationChangedListener)>
	//    8   18:return          
	}

	public void deactivate()
	{
		zzbnJ.deactivate();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LocationSource zzbnJ>
	//    2    4:invokeinterface #34  <Method void LocationSource.deactivate()>
	//    3    9:return          
	}

	final LocationSource zzbnJ;

	GoogleMap$12(GoogleMap googlemap, LocationSource locationsource)
	{
		zzbnJ = locationsource;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #17  <Field LocationSource zzbnJ>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void com.google.android.gms.maps.internal.ILocationSourceDelegate$zza()>
	//    5    9:return          
	}
}
