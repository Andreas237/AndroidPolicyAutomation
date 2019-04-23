// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places;

import com.facebook.*;
import com.facebook.places.internal.LocationPackage;
import com.facebook.places.model.CurrentPlaceRequestParams;

// Referenced classes of package com.facebook.places:
//			PlaceManager

static final class PlaceManager$2
	implements com.facebook.places.internal.Manager.Listener
{

	public void onLocationPackage(LocationPackage locationpackage)
	{
		if(locationpackage.locationError != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #33  <Field com.facebook.places.internal.ScannerException$Type LocationPackage.locationError>
	//*   2    4:ifnull          24
		{
			val$callback.onLocationError(PlaceManager.access$000(locationpackage.locationError));
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field PlaceManager$OnRequestReadyCallback val$callback>
	//    5   11:aload_1         
	//    6   12:getfield        #33  <Field com.facebook.places.internal.ScannerException$Type LocationPackage.locationError>
	//    7   15:invokestatic    #37  <Method PlaceManager$LocationError PlaceManager.access$000(com.facebook.places.internal.ScannerException$Type)>
	//    8   18:invokeinterface #43  <Method void PlaceManager$OnRequestReadyCallback.onLocationError(PlaceManager$LocationError)>
			return;
	//    9   23:return          
		} else
		{
			locationpackage = ((LocationPackage) (PlaceManager.access$100(val$requestParams, locationpackage)));
	//   10   24:aload_0         
	//   11   25:getfield        #21  <Field CurrentPlaceRequestParams val$requestParams>
	//   12   28:aload_1         
	//   13   29:invokestatic    #47  <Method android.os.Bundle PlaceManager.access$100(CurrentPlaceRequestParams, LocationPackage)>
	//   14   32:astore_1        
			locationpackage = ((LocationPackage) (new GraphRequest(AccessToken.getCurrentAccessToken(), "current_place/results", ((android.os.Bundle) (locationpackage)), HttpMethod.GET)));
	//   15   33:new             #49  <Class GraphRequest>
	//   16   36:dup             
	//   17   37:invokestatic    #55  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   18   40:ldc1            #57  <String "current_place/results">
	//   19   42:aload_1         
	//   20   43:getstatic       #63  <Field HttpMethod HttpMethod.GET>
	//   21   46:invokespecial   #66  <Method void GraphRequest(AccessToken, String, android.os.Bundle, HttpMethod)>
	//   22   49:astore_1        
			val$callback.onRequestReady(((GraphRequest) (locationpackage)));
	//   23   50:aload_0         
	//   24   51:getfield        #19  <Field PlaceManager$OnRequestReadyCallback val$callback>
	//   25   54:aload_1         
	//   26   55:invokeinterface #70  <Method void PlaceManager$OnRequestReadyCallback.onRequestReady(GraphRequest)>
			return;
	//   27   60:return          
		}
	}

	final RequestReadyCallback val$callback;
	final CurrentPlaceRequestParams val$requestParams;

	PlaceManager$2(RequestReadyCallback requestreadycallback, CurrentPlaceRequestParams currentplacerequestparams)
	{
		val$callback = requestreadycallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PlaceManager$OnRequestReadyCallback val$callback>
		val$requestParams = currentplacerequestparams;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CurrentPlaceRequestParams val$requestParams>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
