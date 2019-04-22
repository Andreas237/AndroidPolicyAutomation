// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places;

import com.facebook.GraphRequest;

public class PlaceManager
{
	public static final class LocationError extends Enum
	{

		public static LocationError valueOf(String s)
		{
			return (LocationError)Enum.valueOf(com/facebook/places/PlaceManager$LocationError, s);
		//    0    0:ldc1            #2   <Class PlaceManager$LocationError>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PlaceManager$LocationError>
		//    4    9:areturn         
		}

		public static LocationError[] values()
		{
			return (LocationError[])((LocationError []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field PlaceManager$LocationError[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.places.PlaceManager$LocationError_3B_.clone()>
		//    2    6:checkcast       #46  <Class PlaceManager$LocationError[]>
		//    3    9:areturn         
		}

		private static final LocationError $VALUES[];
		public static final LocationError LOCATION_PERMISSION_DENIED;
		public static final LocationError LOCATION_SERVICES_DISABLED;
		public static final LocationError LOCATION_TIMEOUT;
		public static final LocationError UNKNOWN_ERROR;

		static 
		{
			LOCATION_PERMISSION_DENIED = new LocationError("LOCATION_PERMISSION_DENIED", 0);
		//    0    0:new             #2   <Class PlaceManager$LocationError>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "LOCATION_PERMISSION_DENIED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void PlaceManager$LocationError(String, int)>
		//    5   10:putstatic       #24  <Field PlaceManager$LocationError LOCATION_PERMISSION_DENIED>
			LOCATION_SERVICES_DISABLED = new LocationError("LOCATION_SERVICES_DISABLED", 1);
		//    6   13:new             #2   <Class PlaceManager$LocationError>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "LOCATION_SERVICES_DISABLED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void PlaceManager$LocationError(String, int)>
		//   11   23:putstatic       #27  <Field PlaceManager$LocationError LOCATION_SERVICES_DISABLED>
			LOCATION_TIMEOUT = new LocationError("LOCATION_TIMEOUT", 2);
		//   12   26:new             #2   <Class PlaceManager$LocationError>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "LOCATION_TIMEOUT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void PlaceManager$LocationError(String, int)>
		//   17   36:putstatic       #30  <Field PlaceManager$LocationError LOCATION_TIMEOUT>
			UNKNOWN_ERROR = new LocationError("UNKNOWN_ERROR", 3);
		//   18   39:new             #2   <Class PlaceManager$LocationError>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "UNKNOWN_ERROR">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void PlaceManager$LocationError(String, int)>
		//   23   49:putstatic       #33  <Field PlaceManager$LocationError UNKNOWN_ERROR>
			$VALUES = (new LocationError[] {
				LOCATION_PERMISSION_DENIED, LOCATION_SERVICES_DISABLED, LOCATION_TIMEOUT, UNKNOWN_ERROR
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       LocationError[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field PlaceManager$LocationError LOCATION_PERMISSION_DENIED>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field PlaceManager$LocationError LOCATION_SERVICES_DISABLED>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field PlaceManager$LocationError LOCATION_TIMEOUT>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field PlaceManager$LocationError UNKNOWN_ERROR>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field PlaceManager$LocationError[] $VALUES>
		//*  43   83:return          
		}

		private LocationError(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static interface OnRequestReadyCallback
	{

		public abstract void onLocationError(LocationError locationerror);

		public abstract void onRequestReady(GraphRequest graphrequest);
	}

}
