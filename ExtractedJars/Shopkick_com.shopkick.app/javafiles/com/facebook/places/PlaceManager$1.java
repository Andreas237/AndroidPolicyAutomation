// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places;

import com.facebook.places.internal.LocationPackage;
import com.facebook.places.model.PlaceSearchRequestParams;

// Referenced classes of package com.facebook.places:
//			PlaceManager

static final class PlaceManager$1
	implements com.facebook.places.internal.Manager.Listener
{

	public void onLocationPackage(LocationPackage locationpackage)
	{
		if(locationpackage.locationError == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #32  <Field com.facebook.places.internal.ScannerException$Type LocationPackage.locationError>
	//*   2    4:ifnonnull       30
		{
			locationpackage = ((LocationPackage) (PlaceManager.newPlaceSearchRequestForLocation(val$requestParams, locationpackage.location)));
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field PlaceSearchRequestParams val$requestParams>
	//    5   11:aload_1         
	//    6   12:getfield        #36  <Field android.location.Location LocationPackage.location>
	//    7   15:invokestatic    #40  <Method com.facebook.GraphRequest PlaceManager.newPlaceSearchRequestForLocation(PlaceSearchRequestParams, android.location.Location)>
	//    8   18:astore_1        
			val$callback.onRequestReady(((com.facebook.GraphRequest) (locationpackage)));
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field PlaceManager$OnRequestReadyCallback val$callback>
	//   11   23:aload_1         
	//   12   24:invokeinterface #46  <Method void PlaceManager$OnRequestReadyCallback.onRequestReady(com.facebook.GraphRequest)>
			return;
	//   13   29:return          
		} else
		{
			val$callback.onLocationError(PlaceManager.access$000(locationpackage.locationError));
	//   14   30:aload_0         
	//   15   31:getfield        #20  <Field PlaceManager$OnRequestReadyCallback val$callback>
	//   16   34:aload_1         
	//   17   35:getfield        #32  <Field com.facebook.places.internal.ScannerException$Type LocationPackage.locationError>
	//   18   38:invokestatic    #50  <Method PlaceManager$LocationError PlaceManager.access$000(com.facebook.places.internal.ScannerException$Type)>
	//   19   41:invokeinterface #54  <Method void PlaceManager$OnRequestReadyCallback.onLocationError(PlaceManager$LocationError)>
			return;
	//   20   46:return          
		}
	}

	final RequestReadyCallback val$callback;
	final PlaceSearchRequestParams val$requestParams;

	PlaceManager$1(PlaceSearchRequestParams placesearchrequestparams, RequestReadyCallback requestreadycallback)
	{
		val$requestParams = placesearchrequestparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PlaceSearchRequestParams val$requestParams>
		val$callback = requestreadycallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field PlaceManager$OnRequestReadyCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
