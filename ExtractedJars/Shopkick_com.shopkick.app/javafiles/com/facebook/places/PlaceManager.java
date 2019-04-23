// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.*;
import com.facebook.internal.Utility;
import com.facebook.places.internal.BluetoothScanResult;
import com.facebook.places.internal.LocationPackage;
import com.facebook.places.internal.LocationPackageManager;
import com.facebook.places.internal.WifiScanResult;
import com.facebook.places.model.CurrentPlaceFeedbackRequestParams;
import com.facebook.places.model.CurrentPlaceRequestParams;
import com.facebook.places.model.PlaceInfoRequestParams;
import com.facebook.places.model.PlaceSearchRequestParams;
import java.util.*;
import org.json.*;

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


	private PlaceManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void Object()>
	//    2    4:return          
	}

	private static Bundle getCurrentPlaceParameters(CurrentPlaceRequestParams currentplacerequestparams, LocationPackage locationpackage)
		throws FacebookException
	{
		if(currentplacerequestparams == null)
			break MISSING_BLOCK_LABEL_570;
	//    0    0:aload_0         
	//    1    1:ifnull          570
		Object obj = ((Object) (locationpackage));
	//    2    4:aload_1         
	//    3    5:astore_3        
		if(locationpackage == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       18
			obj = ((Object) (new LocationPackage()));
	//    6   10:new             #139 <Class LocationPackage>
	//    7   13:dup             
	//    8   14:invokespecial   #140 <Method void LocationPackage()>
	//    9   17:astore_3        
		if(((LocationPackage) (obj)).location == null)
	//*  10   18:aload_3         
	//*  11   19:getfield        #144 <Field Location LocationPackage.location>
	//*  12   22:ifnonnull       33
			obj.location = currentplacerequestparams.getLocation();
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #150 <Method Location CurrentPlaceRequestParams.getLocation()>
	//   16   30:putfield        #144 <Field Location LocationPackage.location>
		if(((LocationPackage) (obj)).location == null)
			break MISSING_BLOCK_LABEL_559;
	//   17   33:aload_3         
	//   18   34:getfield        #144 <Field Location LocationPackage.location>
	//   19   37:ifnull          559
		int i;
		Object obj1;
		Object obj2;
		JSONObject jsonobject;
		try
		{
			locationpackage = ((LocationPackage) (new Bundle(6)));
	//   20   40:new             #152 <Class Bundle>
	//   21   43:dup             
	//   22   44:bipush          6
	//   23   46:invokespecial   #155 <Method void Bundle(int)>
	//   24   49:astore_1        
			((Bundle) (locationpackage)).putString("summary", "tracking");
	//   25   50:aload_1         
	//   26   51:ldc1            #102 <String "summary">
	//   27   53:ldc1            #105 <String "tracking">
	//   28   55:invokevirtual   #159 <Method void Bundle.putString(String, String)>
			i = currentplacerequestparams.getLimit();
	//   29   58:aload_0         
	//   30   59:invokevirtual   #163 <Method int CurrentPlaceRequestParams.getLimit()>
	//   31   62:istore_2        
		}
	//*  32   63:iload_2         
	//*  33   64:ifle            74
	//*  34   67:aload_1         
	//*  35   68:ldc1            #66  <String "limit">
	//*  36   70:iload_2         
	//*  37   71:invokevirtual   #167 <Method void Bundle.putInt(String, int)>
	//*  38   74:aload_0         
	//*  39   75:invokevirtual   #171 <Method Set CurrentPlaceRequestParams.getFields()>
	//*  40   78:astore          4
	//*  41   80:aload           4
	//*  42   82:ifnull          108
	//*  43   85:aload           4
	//*  44   87:invokeinterface #177 <Method boolean Set.isEmpty()>
	//*  45   92:ifne            108
	//*  46   95:aload_1         
	//*  47   96:ldc1            #54  <String "fields">
	//*  48   98:ldc1            #179 <String ",">
	//*  49  100:aload           4
	//*  50  102:invokestatic    #185 <Method String TextUtils.join(CharSequence, Iterable)>
	//*  51  105:invokevirtual   #159 <Method void Bundle.putString(String, String)>
	//*  52  108:aload_3         
	//*  53  109:getfield        #144 <Field Location LocationPackage.location>
	//*  54  112:astore          4
	//*  55  114:new             #187 <Class JSONObject>
	//*  56  117:dup             
	//*  57  118:invokespecial   #188 <Method void JSONObject()>
	//*  58  121:astore          5
	//*  59  123:aload           5
	//*  60  125:ldc1            #63  <String "latitude">
	//*  61  127:aload           4
	//*  62  129:invokevirtual   #194 <Method double Location.getLatitude()>
	//*  63  132:invokevirtual   #198 <Method JSONObject JSONObject.put(String, double)>
	//*  64  135:pop             
	//*  65  136:aload           5
	//*  66  138:ldc1            #69  <String "longitude">
	//*  67  140:aload           4
	//*  68  142:invokevirtual   #201 <Method double Location.getLongitude()>
	//*  69  145:invokevirtual   #198 <Method JSONObject JSONObject.put(String, double)>
	//*  70  148:pop             
	//*  71  149:aload           4
	//*  72  151:invokevirtual   #204 <Method boolean Location.hasAccuracy()>
	//*  73  154:ifeq            171
	//*  74  157:aload           5
	//*  75  159:ldc1            #27  <String "accuracy">
	//*  76  161:aload           4
	//*  77  163:invokevirtual   #208 <Method float Location.getAccuracy()>
	//*  78  166:f2d             
	//*  79  167:invokevirtual   #198 <Method JSONObject JSONObject.put(String, double)>
	//*  80  170:pop             
	//*  81  171:aload           4
	//*  82  173:invokevirtual   #211 <Method boolean Location.hasAltitude()>
	//*  83  176:ifeq            192
	//*  84  179:aload           5
	//*  85  181:ldc1            #30  <String "altitude">
	//*  86  183:aload           4
	//*  87  185:invokevirtual   #214 <Method double Location.getAltitude()>
	//*  88  188:invokevirtual   #198 <Method JSONObject JSONObject.put(String, double)>
	//*  89  191:pop             
	//*  90  192:aload           4
	//*  91  194:invokevirtual   #217 <Method boolean Location.hasBearing()>
	//*  92  197:ifeq            214
	//*  93  200:aload           5
	//*  94  202:ldc1            #60  <String "heading">
	//*  95  204:aload           4
	//*  96  206:invokevirtual   #220 <Method float Location.getBearing()>
	//*  97  209:f2d             
	//*  98  210:invokevirtual   #198 <Method JSONObject JSONObject.put(String, double)>
	//*  99  213:pop             
	//* 100  214:aload           4
	//* 101  216:invokevirtual   #223 <Method boolean Location.hasSpeed()>
	//* 102  219:ifeq            236
	//* 103  222:aload           5
	//* 104  224:ldc1            #96  <String "speed">
	//* 105  226:aload           4
	//* 106  228:invokevirtual   #226 <Method float Location.getSpeed()>
	//* 107  231:f2d             
	//* 108  232:invokevirtual   #198 <Method JSONObject JSONObject.put(String, double)>
	//* 109  235:pop             
	//* 110  236:aload_1         
	//* 111  237:ldc1            #42  <String "coordinates">
	//* 112  239:aload           5
	//* 113  241:invokevirtual   #230 <Method String JSONObject.toString()>
	//* 114  244:invokevirtual   #159 <Method void Bundle.putString(String, String)>
	//* 115  247:aload_0         
	//* 116  248:invokevirtual   #234 <Method com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel CurrentPlaceRequestParams.getMinConfidenceLevel()>
	//* 117  251:astore_0        
	//* 118  252:aload_0         
	//* 119  253:getstatic       #240 <Field com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel.LOW>
	//* 120  256:if_acmpeq       273
	//* 121  259:aload_0         
	//* 122  260:getstatic       #243 <Field com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel.MEDIUM>
	//* 123  263:if_acmpeq       273
	//* 124  266:aload_0         
	//* 125  267:getstatic       #246 <Field com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel.HIGH>
	//* 126  270:if_acmpne       289
	//* 127  273:aload_1         
	//* 128  274:ldc1            #75  <String "min_confidence_level">
	//* 129  276:aload_0         
	//* 130  277:invokevirtual   #247 <Method String com.facebook.places.model.CurrentPlaceRequestParams$ConfidenceLevel.toString()>
	//* 131  280:getstatic       #253 <Field Locale Locale.US>
	//* 132  283:invokevirtual   #259 <Method String String.toLowerCase(Locale)>
	//* 133  286:invokevirtual   #159 <Method void Bundle.putString(String, String)>
	//* 134  289:aload_3         
	//* 135  290:ifnull          547
	//* 136  293:new             #187 <Class JSONObject>
	//* 137  296:dup             
	//* 138  297:invokespecial   #188 <Method void JSONObject()>
	//* 139  300:astore_0        
	//* 140  301:aload_0         
	//* 141  302:ldc1            #51  <String "enabled">
	//* 142  304:aload_3         
	//* 143  305:getfield        #263 <Field boolean LocationPackage.isWifiScanningEnabled>
	//* 144  308:invokevirtual   #266 <Method JSONObject JSONObject.put(String, boolean)>
	//* 145  311:pop             
	//* 146  312:aload_3         
	//* 147  313:getfield        #270 <Field WifiScanResult LocationPackage.connectedWifi>
	//* 148  316:astore          4
	//* 149  318:aload           4
	//* 150  320:ifnull          335
	//* 151  323:aload_0         
	//* 152  324:ldc1            #45  <String "current_connection">
	//* 153  326:aload           4
	//* 154  328:invokestatic    #274 <Method JSONObject getWifiScanJson(WifiScanResult)>
	//* 155  331:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 156  334:pop             
	//* 157  335:aload_3         
	//* 158  336:getfield        #281 <Field List LocationPackage.ambientWifi>
	//* 159  339:astore          5
	//* 160  341:aload           5
	//* 161  343:ifnull          405
	//* 162  346:new             #283 <Class JSONArray>
	//* 163  349:dup             
	//* 164  350:invokespecial   #284 <Method void JSONArray()>
	//* 165  353:astore          4
	//* 166  355:aload           5
	//* 167  357:invokeinterface #290 <Method Iterator List.iterator()>
	//* 168  362:astore          5
	//* 169  364:aload           5
	//* 170  366:invokeinterface #295 <Method boolean Iterator.hasNext()>
	//* 171  371:ifeq            396
	//* 172  374:aload           4
	//* 173  376:aload           5
	//* 174  378:invokeinterface #299 <Method Object Iterator.next()>
	//* 175  383:checkcast       #301 <Class WifiScanResult>
	//* 176  386:invokestatic    #274 <Method JSONObject getWifiScanJson(WifiScanResult)>
	//* 177  389:invokevirtual   #304 <Method JSONArray JSONArray.put(Object)>
	//* 178  392:pop             
	//* 179  393:goto            364
	//* 180  396:aload_0         
	//* 181  397:ldc1            #24  <String "access_points">
	//* 182  399:aload           4
	//* 183  401:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 184  404:pop             
	//* 185  405:aload_1         
	//* 186  406:ldc1            #114 <String "wifi">
	//* 187  408:aload_0         
	//* 188  409:invokevirtual   #230 <Method String JSONObject.toString()>
	//* 189  412:invokevirtual   #159 <Method void Bundle.putString(String, String)>
	//* 190  415:new             #187 <Class JSONObject>
	//* 191  418:dup             
	//* 192  419:invokespecial   #188 <Method void JSONObject()>
	//* 193  422:astore_0        
	//* 194  423:aload_0         
	//* 195  424:ldc1            #51  <String "enabled">
	//* 196  426:aload_3         
	//* 197  427:getfield        #307 <Field boolean LocationPackage.isBluetoothScanningEnabled>
	//* 198  430:invokevirtual   #266 <Method JSONObject JSONObject.put(String, boolean)>
	//* 199  433:pop             
	//* 200  434:aload_3         
	//* 201  435:getfield        #310 <Field List LocationPackage.ambientBluetoothLe>
	//* 202  438:astore          4
	//* 203  440:aload           4
	//* 204  442:ifnull          537
	//* 205  445:new             #283 <Class JSONArray>
	//* 206  448:dup             
	//* 207  449:invokespecial   #284 <Method void JSONArray()>
	//* 208  452:astore_3        
	//* 209  453:aload           4
	//* 210  455:invokeinterface #290 <Method Iterator List.iterator()>
	//* 211  460:astore          4
	//* 212  462:aload           4
	//* 213  464:invokeinterface #295 <Method boolean Iterator.hasNext()>
	//* 214  469:ifeq            529
	//* 215  472:aload           4
	//* 216  474:invokeinterface #299 <Method Object Iterator.next()>
	//* 217  479:checkcast       #312 <Class BluetoothScanResult>
	//* 218  482:astore          5
	//* 219  484:new             #187 <Class JSONObject>
	//* 220  487:dup             
	//* 221  488:invokespecial   #188 <Method void JSONObject()>
	//* 222  491:astore          6
	//* 223  493:aload           6
	//* 224  495:ldc1            #78  <String "payload">
	//* 225  497:aload           5
	//* 226  499:getfield        #314 <Field String BluetoothScanResult.payload>
	//* 227  502:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 228  505:pop             
	//* 229  506:aload           6
	//* 230  508:ldc1            #87  <String "rssi">
	//* 231  510:aload           5
	//* 232  512:getfield        #317 <Field int BluetoothScanResult.rssi>
	//* 233  515:invokevirtual   #320 <Method JSONObject JSONObject.put(String, int)>
	//* 234  518:pop             
	//* 235  519:aload_3         
	//* 236  520:aload           6
	//* 237  522:invokevirtual   #304 <Method JSONArray JSONArray.put(Object)>
	//* 238  525:pop             
	//* 239  526:goto            462
	//* 240  529:aload_0         
	//* 241  530:ldc1            #90  <String "scans">
	//* 242  532:aload_3         
	//* 243  533:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//* 244  536:pop             
	//* 245  537:aload_1         
	//* 246  538:ldc1            #33  <String "bluetooth">
	//* 247  540:aload_0         
	//* 248  541:invokevirtual   #230 <Method String JSONObject.toString()>
	//* 249  544:invokevirtual   #159 <Method void Bundle.putString(String, String)>
	//* 250  547:aload_1         
	//* 251  548:areturn         
		// Misplaced declaration of an exception variable
		catch(CurrentPlaceRequestParams currentplacerequestparams)
	//* 252  549:astore_0        
		{
			throw new FacebookException(((Throwable) (currentplacerequestparams)));
	//  253  550:new             #131 <Class FacebookException>
	//  254  553:dup             
	//  255  554:aload_0         
	//  256  555:invokespecial   #323 <Method void FacebookException(Throwable)>
	//  257  558:athrow          
		}
		if(i <= 0)
			break MISSING_BLOCK_LABEL_74;
		((Bundle) (locationpackage)).putInt("limit", i);
		obj1 = ((Object) (currentplacerequestparams.getFields()));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_108;
		if(!((Set) (obj1)).isEmpty())
			((Bundle) (locationpackage)).putString("fields", TextUtils.join(",", ((Iterable) (obj1))));
		obj1 = ((Object) (((LocationPackage) (obj)).location));
		obj2 = ((Object) (new JSONObject()));
		((JSONObject) (obj2)).put("latitude", ((Location) (obj1)).getLatitude());
		((JSONObject) (obj2)).put("longitude", ((Location) (obj1)).getLongitude());
		if(((Location) (obj1)).hasAccuracy())
			((JSONObject) (obj2)).put("accuracy", ((Location) (obj1)).getAccuracy());
		if(((Location) (obj1)).hasAltitude())
			((JSONObject) (obj2)).put("altitude", ((Location) (obj1)).getAltitude());
		if(((Location) (obj1)).hasBearing())
			((JSONObject) (obj2)).put("heading", ((Location) (obj1)).getBearing());
		if(((Location) (obj1)).hasSpeed())
			((JSONObject) (obj2)).put("speed", ((Location) (obj1)).getSpeed());
		((Bundle) (locationpackage)).putString("coordinates", ((JSONObject) (obj2)).toString());
		currentplacerequestparams = ((CurrentPlaceRequestParams) (currentplacerequestparams.getMinConfidenceLevel()));
		if(currentplacerequestparams == com.facebook.places.model.CurrentPlaceRequestParams.ConfidenceLevel.LOW || currentplacerequestparams == com.facebook.places.model.CurrentPlaceRequestParams.ConfidenceLevel.MEDIUM || currentplacerequestparams == com.facebook.places.model.CurrentPlaceRequestParams.ConfidenceLevel.HIGH)
			((Bundle) (locationpackage)).putString("min_confidence_level", ((com.facebook.places.model.CurrentPlaceRequestParams.ConfidenceLevel) (currentplacerequestparams)).toString().toLowerCase(Locale.US));
		if(obj == null)
			break MISSING_BLOCK_LABEL_547;
		currentplacerequestparams = ((CurrentPlaceRequestParams) (new JSONObject()));
		((JSONObject) (currentplacerequestparams)).put("enabled", ((LocationPackage) (obj)).isWifiScanningEnabled);
		obj1 = ((Object) (((LocationPackage) (obj)).connectedWifi));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_335;
		((JSONObject) (currentplacerequestparams)).put("current_connection", ((Object) (getWifiScanJson(((WifiScanResult) (obj1))))));
		obj2 = ((Object) (((LocationPackage) (obj)).ambientWifi));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_405;
		obj1 = ((Object) (new JSONArray()));
		for(obj2 = ((Object) (((List) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); ((JSONArray) (obj1)).put(((Object) (getWifiScanJson((WifiScanResult)((Iterator) (obj2)).next())))));
		((JSONObject) (currentplacerequestparams)).put("access_points", obj1);
		((Bundle) (locationpackage)).putString("wifi", ((JSONObject) (currentplacerequestparams)).toString());
		currentplacerequestparams = ((CurrentPlaceRequestParams) (new JSONObject()));
		((JSONObject) (currentplacerequestparams)).put("enabled", ((LocationPackage) (obj)).isBluetoothScanningEnabled);
		obj1 = ((Object) (((LocationPackage) (obj)).ambientBluetoothLe));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_537;
		obj = ((Object) (new JSONArray()));
		for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put(((Object) (jsonobject))))
		{
			obj2 = ((Object) ((BluetoothScanResult)((Iterator) (obj1)).next()));
			jsonobject = new JSONObject();
			jsonobject.put("payload", ((Object) (((BluetoothScanResult) (obj2)).payload)));
			jsonobject.put("rssi", ((BluetoothScanResult) (obj2)).rssi);
		}

		((JSONObject) (currentplacerequestparams)).put("scans", obj);
		((Bundle) (locationpackage)).putString("bluetooth", ((JSONObject) (currentplacerequestparams)).toString());
		return ((Bundle) (locationpackage));
		throw new FacebookException("A location must be specified");
	//  258  559:new             #131 <Class FacebookException>
	//  259  562:dup             
	//  260  563:ldc2            #325 <String "A location must be specified">
	//  261  566:invokespecial   #328 <Method void FacebookException(String)>
	//  262  569:athrow          
		throw new FacebookException("Request and location must be specified.");
	//  263  570:new             #131 <Class FacebookException>
	//  264  573:dup             
	//  265  574:ldc2            #330 <String "Request and location must be specified.">
	//  266  577:invokespecial   #328 <Method void FacebookException(String)>
	//  267  580:athrow          
	}

	private static LocationError getLocationError(com.facebook.places.internal.ScannerException.Type type)
	{
		if(type == com.facebook.places.internal.ScannerException.Type.PERMISSION_DENIED)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #336 <Field com.facebook.places.internal.ScannerException$Type com.facebook.places.internal.ScannerException$Type.PERMISSION_DENIED>
	//*   2    4:if_acmpne       11
			return LocationError.LOCATION_PERMISSION_DENIED;
	//    3    7:getstatic       #340 <Field PlaceManager$LocationError PlaceManager$LocationError.LOCATION_PERMISSION_DENIED>
	//    4   10:areturn         
		if(type == com.facebook.places.internal.ScannerException.Type.DISABLED)
	//*   5   11:aload_0         
	//*   6   12:getstatic       #343 <Field com.facebook.places.internal.ScannerException$Type com.facebook.places.internal.ScannerException$Type.DISABLED>
	//*   7   15:if_acmpne       22
			return LocationError.LOCATION_SERVICES_DISABLED;
	//    8   18:getstatic       #346 <Field PlaceManager$LocationError PlaceManager$LocationError.LOCATION_SERVICES_DISABLED>
	//    9   21:areturn         
		if(type == com.facebook.places.internal.ScannerException.Type.TIMEOUT)
	//*  10   22:aload_0         
	//*  11   23:getstatic       #349 <Field com.facebook.places.internal.ScannerException$Type com.facebook.places.internal.ScannerException$Type.TIMEOUT>
	//*  12   26:if_acmpne       33
			return LocationError.LOCATION_TIMEOUT;
	//   13   29:getstatic       #352 <Field PlaceManager$LocationError PlaceManager$LocationError.LOCATION_TIMEOUT>
	//   14   32:areturn         
		else
			return LocationError.UNKNOWN_ERROR;
	//   15   33:getstatic       #355 <Field PlaceManager$LocationError PlaceManager$LocationError.UNKNOWN_ERROR>
	//   16   36:areturn         
	}

	private static JSONObject getWifiScanJson(WifiScanResult wifiscanresult)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #187 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #188 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("mac_address", ((Object) (wifiscanresult.bssid)));
	//    4    8:aload_1         
	//    5    9:ldc1            #72  <String "mac_address">
	//    6   11:aload_0         
	//    7   12:getfield        #358 <Field String WifiScanResult.bssid>
	//    8   15:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		jsonobject.put("ssid", ((Object) (wifiscanresult.ssid)));
	//   10   19:aload_1         
	//   11   20:ldc1            #99  <String "ssid">
	//   12   22:aload_0         
	//   13   23:getfield        #360 <Field String WifiScanResult.ssid>
	//   14   26:invokevirtual   #277 <Method JSONObject JSONObject.put(String, Object)>
	//   15   29:pop             
		jsonobject.put("signal_strength", wifiscanresult.rssi);
	//   16   30:aload_1         
	//   17   31:ldc1            #93  <String "signal_strength">
	//   18   33:aload_0         
	//   19   34:getfield        #361 <Field int WifiScanResult.rssi>
	//   20   37:invokevirtual   #320 <Method JSONObject JSONObject.put(String, int)>
	//   21   40:pop             
		jsonobject.put("frequency", wifiscanresult.frequency);
	//   22   41:aload_1         
	//   23   42:ldc1            #57  <String "frequency">
	//   24   44:aload_0         
	//   25   45:getfield        #363 <Field int WifiScanResult.frequency>
	//   26   48:invokevirtual   #320 <Method JSONObject JSONObject.put(String, int)>
	//   27   51:pop             
		return jsonobject;
	//   28   52:aload_1         
	//   29   53:areturn         
	}

	public static GraphRequest newCurrentPlaceFeedbackRequest(CurrentPlaceFeedbackRequestParams currentplacefeedbackrequestparams)
	{
		String s = currentplacefeedbackrequestparams.getPlaceId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method String CurrentPlaceFeedbackRequestParams.getPlaceId()>
	//    2    4:astore_1        
		String s1 = currentplacefeedbackrequestparams.getTracking();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #373 <Method String CurrentPlaceFeedbackRequestParams.getTracking()>
	//    5    9:astore_2        
		currentplacefeedbackrequestparams = ((CurrentPlaceFeedbackRequestParams) (currentplacefeedbackrequestparams.wasHere()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #377 <Method Boolean CurrentPlaceFeedbackRequestParams.wasHere()>
	//    8   14:astore_0        
		if(s1 != null && s != null && currentplacefeedbackrequestparams != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          77
	//*  11   19:aload_1         
	//*  12   20:ifnull          77
	//*  13   23:aload_0         
	//*  14   24:ifnull          77
		{
			Bundle bundle = new Bundle(3);
	//   15   27:new             #152 <Class Bundle>
	//   16   30:dup             
	//   17   31:iconst_3        
	//   18   32:invokespecial   #155 <Method void Bundle(int)>
	//   19   35:astore_3        
			bundle.putString("tracking", s1);
	//   20   36:aload_3         
	//   21   37:ldc1            #105 <String "tracking">
	//   22   39:aload_2         
	//   23   40:invokevirtual   #159 <Method void Bundle.putString(String, String)>
			bundle.putString("place_id", s);
	//   24   43:aload_3         
	//   25   44:ldc1            #81  <String "place_id">
	//   26   46:aload_1         
	//   27   47:invokevirtual   #159 <Method void Bundle.putString(String, String)>
			bundle.putBoolean("was_here", ((Boolean) (currentplacefeedbackrequestparams)).booleanValue());
	//   28   50:aload_3         
	//   29   51:ldc1            #111 <String "was_here">
	//   30   53:aload_0         
	//   31   54:invokevirtual   #382 <Method boolean Boolean.booleanValue()>
	//   32   57:invokevirtual   #386 <Method void Bundle.putBoolean(String, boolean)>
			return new GraphRequest(AccessToken.getCurrentAccessToken(), "current_place/feedback", bundle, HttpMethod.POST);
	//   33   60:new             #388 <Class GraphRequest>
	//   34   63:dup             
	//   35   64:invokestatic    #394 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   36   67:ldc1            #18  <String "current_place/feedback">
	//   37   69:aload_3         
	//   38   70:getstatic       #400 <Field HttpMethod HttpMethod.POST>
	//   39   73:invokespecial   #403 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   40   76:areturn         
		} else
		{
			throw new FacebookException("tracking, placeId and wasHere must be specified.");
	//   41   77:new             #131 <Class FacebookException>
	//   42   80:dup             
	//   43   81:ldc2            #405 <String "tracking, placeId and wasHere must be specified.">
	//   44   84:invokespecial   #328 <Method void FacebookException(String)>
	//   45   87:athrow          
		}
	}

	public static void newCurrentPlaceRequest(CurrentPlaceRequestParams currentplacerequestparams, OnRequestReadyCallback onrequestreadycallback)
	{
		Location location = currentplacerequestparams.getLocation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method Location CurrentPlaceRequestParams.getLocation()>
	//    2    4:astore_3        
		com.facebook.places.model.CurrentPlaceRequestParams.ScanMode scanmode = currentplacerequestparams.getScanMode();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #411 <Method com.facebook.places.model.CurrentPlaceRequestParams$ScanMode CurrentPlaceRequestParams.getScanMode()>
	//    5    9:astore          4
		com.facebook.places.internal.LocationPackageRequestParams.Builder builder = new com.facebook.places.internal.LocationPackageRequestParams.Builder();
	//    6   11:new             #413 <Class com.facebook.places.internal.LocationPackageRequestParams$Builder>
	//    7   14:dup             
	//    8   15:invokespecial   #414 <Method void com.facebook.places.internal.LocationPackageRequestParams$Builder()>
	//    9   18:astore          5
		boolean flag;
		if(location == null)
	//*  10   20:aload_3         
	//*  11   21:ifnonnull       29
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_2        
		else
	//*  14   26:goto            31
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		builder.setLocationScanEnabled(flag);
	//   17   31:aload           5
	//   18   33:iload_2         
	//   19   34:invokevirtual   #418 <Method com.facebook.places.internal.LocationPackageRequestParams$Builder com.facebook.places.internal.LocationPackageRequestParams$Builder.setLocationScanEnabled(boolean)>
	//   20   37:pop             
		if(scanmode != null && scanmode == com.facebook.places.model.CurrentPlaceRequestParams.ScanMode.LOW_LATENCY)
	//*  21   38:aload           4
	//*  22   40:ifnull          58
	//*  23   43:aload           4
	//*  24   45:getstatic       #424 <Field com.facebook.places.model.CurrentPlaceRequestParams$ScanMode com.facebook.places.model.CurrentPlaceRequestParams$ScanMode.LOW_LATENCY>
	//*  25   48:if_acmpne       58
			builder.setWifiActiveScanAllowed(false);
	//   26   51:aload           5
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #427 <Method com.facebook.places.internal.LocationPackageRequestParams$Builder com.facebook.places.internal.LocationPackageRequestParams$Builder.setWifiActiveScanAllowed(boolean)>
	//   29   57:pop             
		LocationPackageManager.requestLocationPackage(builder.build(), new com.facebook.places.internal.LocationPackageManager.Listener(onrequestreadycallback, currentplacerequestparams) {

			public void onLocationPackage(LocationPackage locationpackage)
			{
				if(locationpackage.locationError != null)
			//*   0    0:aload_1         
			//*   1    1:getfield        #33  <Field com.facebook.places.internal.ScannerException$Type LocationPackage.locationError>
			//*   2    4:ifnull          24
				{
					callback.onLocationError(PlaceManager.getLocationError(locationpackage.locationError));
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
					locationpackage = ((LocationPackage) (PlaceManager.getCurrentPlaceParameters(requestParams, locationpackage)));
			//   10   24:aload_0         
			//   11   25:getfield        #21  <Field CurrentPlaceRequestParams val$requestParams>
			//   12   28:aload_1         
			//   13   29:invokestatic    #47  <Method Bundle PlaceManager.access$100(CurrentPlaceRequestParams, LocationPackage)>
			//   14   32:astore_1        
					locationpackage = ((LocationPackage) (new GraphRequest(AccessToken.getCurrentAccessToken(), "current_place/results", ((Bundle) (locationpackage)), HttpMethod.GET)));
			//   15   33:new             #49  <Class GraphRequest>
			//   16   36:dup             
			//   17   37:invokestatic    #55  <Method AccessToken AccessToken.getCurrentAccessToken()>
			//   18   40:ldc1            #57  <String "current_place/results">
			//   19   42:aload_1         
			//   20   43:getstatic       #63  <Field HttpMethod HttpMethod.GET>
			//   21   46:invokespecial   #66  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
			//   22   49:astore_1        
					callback.onRequestReady(((GraphRequest) (locationpackage)));
			//   23   50:aload_0         
			//   24   51:getfield        #19  <Field PlaceManager$OnRequestReadyCallback val$callback>
			//   25   54:aload_1         
			//   26   55:invokeinterface #70  <Method void PlaceManager$OnRequestReadyCallback.onRequestReady(GraphRequest)>
					return;
			//   27   60:return          
				}
			}

			final OnRequestReadyCallback val$callback;
			final CurrentPlaceRequestParams val$requestParams;

			
			{
				callback = onrequestreadycallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PlaceManager$OnRequestReadyCallback val$callback>
				requestParams = currentplacerequestparams;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CurrentPlaceRequestParams val$requestParams>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   30   58:aload           5
	//   31   60:invokevirtual   #431 <Method com.facebook.places.internal.LocationPackageRequestParams com.facebook.places.internal.LocationPackageRequestParams$Builder.build()>
	//   32   63:new             #8   <Class PlaceManager$2>
	//   33   66:dup             
	//   34   67:aload_1         
	//   35   68:aload_0         
	//   36   69:invokespecial   #434 <Method void PlaceManager$2(PlaceManager$OnRequestReadyCallback, CurrentPlaceRequestParams)>
	//   37   72:invokestatic    #440 <Method void LocationPackageManager.requestLocationPackage(com.facebook.places.internal.LocationPackageRequestParams, com.facebook.places.internal.LocationPackageManager$Listener)>
	//   38   75:return          
	}

	public static GraphRequest newPlaceInfoRequest(PlaceInfoRequestParams placeinforequestparams)
	{
		String s = placeinforequestparams.getPlaceId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #445 <Method String PlaceInfoRequestParams.getPlaceId()>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          64
		{
			Bundle bundle = new Bundle(1);
	//    5    9:new             #152 <Class Bundle>
	//    6   12:dup             
	//    7   13:iconst_1        
	//    8   14:invokespecial   #155 <Method void Bundle(int)>
	//    9   17:astore_2        
			placeinforequestparams = ((PlaceInfoRequestParams) (placeinforequestparams.getFields()));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #446 <Method Set PlaceInfoRequestParams.getFields()>
	//   12   22:astore_0        
			if(placeinforequestparams != null && !((Set) (placeinforequestparams)).isEmpty())
	//*  13   23:aload_0         
	//*  14   24:ifnull          48
	//*  15   27:aload_0         
	//*  16   28:invokeinterface #177 <Method boolean Set.isEmpty()>
	//*  17   33:ifne            48
				bundle.putString("fields", TextUtils.join(",", ((Iterable) (placeinforequestparams))));
	//   18   36:aload_2         
	//   19   37:ldc1            #54  <String "fields">
	//   20   39:ldc1            #179 <String ",">
	//   21   41:aload_0         
	//   22   42:invokestatic    #185 <Method String TextUtils.join(CharSequence, Iterable)>
	//   23   45:invokevirtual   #159 <Method void Bundle.putString(String, String)>
			return new GraphRequest(AccessToken.getCurrentAccessToken(), s, bundle, HttpMethod.GET);
	//   24   48:new             #388 <Class GraphRequest>
	//   25   51:dup             
	//   26   52:invokestatic    #394 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   27   55:aload_1         
	//   28   56:aload_2         
	//   29   57:getstatic       #449 <Field HttpMethod HttpMethod.GET>
	//   30   60:invokespecial   #403 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   31   63:areturn         
		} else
		{
			throw new FacebookException("placeId must be specified.");
	//   32   64:new             #131 <Class FacebookException>
	//   33   67:dup             
	//   34   68:ldc2            #451 <String "placeId must be specified.">
	//   35   71:invokespecial   #328 <Method void FacebookException(String)>
	//   36   74:athrow          
		}
	}

	public static void newPlaceSearchRequest(PlaceSearchRequestParams placesearchrequestparams, OnRequestReadyCallback onrequestreadycallback)
	{
		com.facebook.places.internal.LocationPackageRequestParams.Builder builder = new com.facebook.places.internal.LocationPackageRequestParams.Builder();
	//    0    0:new             #413 <Class com.facebook.places.internal.LocationPackageRequestParams$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #414 <Method void com.facebook.places.internal.LocationPackageRequestParams$Builder()>
	//    3    7:astore_2        
		builder.setWifiScanEnabled(false);
	//    4    8:aload_2         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #456 <Method com.facebook.places.internal.LocationPackageRequestParams$Builder com.facebook.places.internal.LocationPackageRequestParams$Builder.setWifiScanEnabled(boolean)>
	//    7   13:pop             
		builder.setBluetoothScanEnabled(false);
	//    8   14:aload_2         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #459 <Method com.facebook.places.internal.LocationPackageRequestParams$Builder com.facebook.places.internal.LocationPackageRequestParams$Builder.setBluetoothScanEnabled(boolean)>
	//   11   19:pop             
		LocationPackageManager.requestLocationPackage(builder.build(), new com.facebook.places.internal.LocationPackageManager.Listener(placesearchrequestparams, onrequestreadycallback) {

			public void onLocationPackage(LocationPackage locationpackage)
			{
				if(locationpackage.locationError == null)
			//*   0    0:aload_1         
			//*   1    1:getfield        #32  <Field com.facebook.places.internal.ScannerException$Type LocationPackage.locationError>
			//*   2    4:ifnonnull       30
				{
					locationpackage = ((LocationPackage) (PlaceManager.newPlaceSearchRequestForLocation(requestParams, locationpackage.location)));
			//    3    7:aload_0         
			//    4    8:getfield        #18  <Field PlaceSearchRequestParams val$requestParams>
			//    5   11:aload_1         
			//    6   12:getfield        #36  <Field Location LocationPackage.location>
			//    7   15:invokestatic    #40  <Method GraphRequest PlaceManager.newPlaceSearchRequestForLocation(PlaceSearchRequestParams, Location)>
			//    8   18:astore_1        
					callback.onRequestReady(((GraphRequest) (locationpackage)));
			//    9   19:aload_0         
			//   10   20:getfield        #20  <Field PlaceManager$OnRequestReadyCallback val$callback>
			//   11   23:aload_1         
			//   12   24:invokeinterface #46  <Method void PlaceManager$OnRequestReadyCallback.onRequestReady(GraphRequest)>
					return;
			//   13   29:return          
				} else
				{
					callback.onLocationError(PlaceManager.getLocationError(locationpackage.locationError));
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

			final OnRequestReadyCallback val$callback;
			final PlaceSearchRequestParams val$requestParams;

			
			{
				requestParams = placesearchrequestparams;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PlaceSearchRequestParams val$requestParams>
				callback = onrequestreadycallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field PlaceManager$OnRequestReadyCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   12   20:aload_2         
	//   13   21:invokevirtual   #431 <Method com.facebook.places.internal.LocationPackageRequestParams com.facebook.places.internal.LocationPackageRequestParams$Builder.build()>
	//   14   24:new             #6   <Class PlaceManager$1>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #461 <Method void PlaceManager$1(PlaceSearchRequestParams, PlaceManager$OnRequestReadyCallback)>
	//   19   33:invokestatic    #440 <Method void LocationPackageManager.requestLocationPackage(com.facebook.places.internal.LocationPackageRequestParams, com.facebook.places.internal.LocationPackageManager$Listener)>
	//   20   36:return          
	}

	public static GraphRequest newPlaceSearchRequestForLocation(PlaceSearchRequestParams placesearchrequestparams, Location location)
	{
		String s = placesearchrequestparams.getSearchText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method String PlaceSearchRequestParams.getSearchText()>
	//    2    4:astore          7
		if(location == null && s == null)
	//*   3    6:aload_1         
	//*   4    7:ifnonnull       29
	//*   5   10:aload           7
	//*   6   12:ifnull          18
	//*   7   15:goto            29
			throw new FacebookException("Either location or searchText must be specified.");
	//    8   18:new             #131 <Class FacebookException>
	//    9   21:dup             
	//   10   22:ldc2            #470 <String "Either location or searchText must be specified.">
	//   11   25:invokespecial   #328 <Method void FacebookException(String)>
	//   12   28:athrow          
		int i = placesearchrequestparams.getLimit();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #471 <Method int PlaceSearchRequestParams.getLimit()>
	//   15   33:istore_2        
		Set set = placesearchrequestparams.getFields();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #472 <Method Set PlaceSearchRequestParams.getFields()>
	//   18   38:astore          4
		Set set1 = placesearchrequestparams.getCategories();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #475 <Method Set PlaceSearchRequestParams.getCategories()>
	//   21   44:astore          6
		Bundle bundle = new Bundle(7);
	//   22   46:new             #152 <Class Bundle>
	//   23   49:dup             
	//   24   50:bipush          7
	//   25   52:invokespecial   #155 <Method void Bundle(int)>
	//   26   55:astore          5
		bundle.putString("type", "place");
	//   27   57:aload           5
	//   28   59:ldc1            #108 <String "type">
	//   29   61:ldc2            #477 <String "place">
	//   30   64:invokevirtual   #159 <Method void Bundle.putString(String, String)>
		if(location != null)
	//*  31   67:aload_1         
	//*  32   68:ifnull          128
		{
			bundle.putString("center", String.format(Locale.US, "%f,%f", new Object[] {
				Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
			}));
	//   33   71:aload           5
	//   34   73:ldc1            #39  <String "center">
	//   35   75:getstatic       #253 <Field Locale Locale.US>
	//   36   78:ldc2            #479 <String "%f,%f">
	//   37   81:iconst_2        
	//   38   82:anewarray       Object[]
	//   39   85:dup             
	//   40   86:iconst_0        
	//   41   87:aload_1         
	//   42   88:invokevirtual   #194 <Method double Location.getLatitude()>
	//   43   91:invokestatic    #485 <Method Double Double.valueOf(double)>
	//   44   94:aastore         
	//   45   95:dup             
	//   46   96:iconst_1        
	//   47   97:aload_1         
	//   48   98:invokevirtual   #201 <Method double Location.getLongitude()>
	//   49  101:invokestatic    #485 <Method Double Double.valueOf(double)>
	//   50  104:aastore         
	//   51  105:invokestatic    #489 <Method String String.format(Locale, String, Object[])>
	//   52  108:invokevirtual   #159 <Method void Bundle.putString(String, String)>
			int j = placesearchrequestparams.getDistance();
	//   53  111:aload_0         
	//   54  112:invokevirtual   #492 <Method int PlaceSearchRequestParams.getDistance()>
	//   55  115:istore_3        
			if(j > 0)
	//*  56  116:iload_3         
	//*  57  117:ifle            128
				bundle.putInt("distance", j);
	//   58  120:aload           5
	//   59  122:ldc1            #48  <String "distance">
	//   60  124:iload_3         
	//   61  125:invokevirtual   #167 <Method void Bundle.putInt(String, int)>
		}
		if(i > 0)
	//*  62  128:iload_2         
	//*  63  129:ifle            140
			bundle.putInt("limit", i);
	//   64  132:aload           5
	//   65  134:ldc1            #66  <String "limit">
	//   66  136:iload_2         
	//   67  137:invokevirtual   #167 <Method void Bundle.putInt(String, int)>
		if(!Utility.isNullOrEmpty(s))
	//*  68  140:aload           7
	//*  69  142:invokestatic    #498 <Method boolean Utility.isNullOrEmpty(String)>
	//*  70  145:ifne            157
			bundle.putString("q", s);
	//   71  148:aload           5
	//   72  150:ldc1            #84  <String "q">
	//   73  152:aload           7
	//   74  154:invokevirtual   #159 <Method void Bundle.putString(String, String)>
		if(set1 != null && !set1.isEmpty())
	//*  75  157:aload           6
	//*  76  159:ifnull          225
	//*  77  162:aload           6
	//*  78  164:invokeinterface #177 <Method boolean Set.isEmpty()>
	//*  79  169:ifne            225
		{
			placesearchrequestparams = ((PlaceSearchRequestParams) (new JSONArray()));
	//   80  172:new             #283 <Class JSONArray>
	//   81  175:dup             
	//   82  176:invokespecial   #284 <Method void JSONArray()>
	//   83  179:astore_0        
			for(location = ((Location) (set1.iterator())); ((Iterator) (location)).hasNext(); ((JSONArray) (placesearchrequestparams)).put(((Object) ((String)((Iterator) (location)).next()))));
	//   84  180:aload           6
	//   85  182:invokeinterface #499 <Method Iterator Set.iterator()>
	//   86  187:astore_1        
	//   87  188:aload_1         
	//   88  189:invokeinterface #295 <Method boolean Iterator.hasNext()>
	//   89  194:ifeq            214
	//   90  197:aload_0         
	//   91  198:aload_1         
	//   92  199:invokeinterface #299 <Method Object Iterator.next()>
	//   93  204:checkcast       #255 <Class String>
	//   94  207:invokevirtual   #304 <Method JSONArray JSONArray.put(Object)>
	//   95  210:pop             
	//*  96  211:goto            188
			bundle.putString("categories", ((JSONArray) (placesearchrequestparams)).toString());
	//   97  214:aload           5
	//   98  216:ldc1            #36  <String "categories">
	//   99  218:aload_0         
	//  100  219:invokevirtual   #500 <Method String JSONArray.toString()>
	//  101  222:invokevirtual   #159 <Method void Bundle.putString(String, String)>
		}
		if(set != null && !set.isEmpty())
	//* 102  225:aload           4
	//* 103  227:ifnull          254
	//* 104  230:aload           4
	//* 105  232:invokeinterface #177 <Method boolean Set.isEmpty()>
	//* 106  237:ifne            254
			bundle.putString("fields", TextUtils.join(",", ((Iterable) (set))));
	//  107  240:aload           5
	//  108  242:ldc1            #54  <String "fields">
	//  109  244:ldc1            #179 <String ",">
	//  110  246:aload           4
	//  111  248:invokestatic    #185 <Method String TextUtils.join(CharSequence, Iterable)>
	//  112  251:invokevirtual   #159 <Method void Bundle.putString(String, String)>
		return new GraphRequest(AccessToken.getCurrentAccessToken(), "search", bundle, HttpMethod.GET);
	//  113  254:new             #388 <Class GraphRequest>
	//  114  257:dup             
	//  115  258:invokestatic    #394 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//  116  261:ldc1            #117 <String "search">
	//  117  263:aload           5
	//  118  265:getstatic       #449 <Field HttpMethod HttpMethod.GET>
	//  119  268:invokespecial   #403 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//  120  271:areturn         
	}

	private static final String CURRENT_PLACE_FEEDBACK = "current_place/feedback";
	private static final String CURRENT_PLACE_RESULTS = "current_place/results";
	private static final String PARAM_ACCESS_POINTS = "access_points";
	private static final String PARAM_ACCURACY = "accuracy";
	private static final String PARAM_ALTITUDE = "altitude";
	private static final String PARAM_BLUETOOTH = "bluetooth";
	private static final String PARAM_CATEGORIES = "categories";
	private static final String PARAM_CENTER = "center";
	private static final String PARAM_COORDINATES = "coordinates";
	private static final String PARAM_CURRENT_CONNECTION = "current_connection";
	private static final String PARAM_DISTANCE = "distance";
	private static final String PARAM_ENABLED = "enabled";
	private static final String PARAM_FIELDS = "fields";
	private static final String PARAM_FREQUENCY = "frequency";
	private static final String PARAM_HEADING = "heading";
	private static final String PARAM_LATITUDE = "latitude";
	private static final String PARAM_LIMIT = "limit";
	private static final String PARAM_LONGITUDE = "longitude";
	private static final String PARAM_MAC_ADDRESS = "mac_address";
	private static final String PARAM_MIN_CONFIDENCE_LEVEL = "min_confidence_level";
	private static final String PARAM_PAYLOAD = "payload";
	private static final String PARAM_PLACE_ID = "place_id";
	private static final String PARAM_Q = "q";
	private static final String PARAM_RSSI = "rssi";
	private static final String PARAM_SCANS = "scans";
	private static final String PARAM_SIGNAL_STRENGTH = "signal_strength";
	private static final String PARAM_SPEED = "speed";
	private static final String PARAM_SSID = "ssid";
	private static final String PARAM_SUMMARY = "summary";
	private static final String PARAM_TRACKING = "tracking";
	private static final String PARAM_TYPE = "type";
	private static final String PARAM_WAS_HERE = "was_here";
	private static final String PARAM_WIFI = "wifi";
	private static final String SEARCH = "search";


/*
	static LocationError access$000(com.facebook.places.internal.ScannerException.Type type)
	{
		return getLocationError(type);
	//    0    0:aload_0         
	//    1    1:invokestatic    #127 <Method PlaceManager$LocationError getLocationError(com.facebook.places.internal.ScannerException$Type)>
	//    2    4:areturn         
	}

*/


/*
	static Bundle access$100(CurrentPlaceRequestParams currentplacerequestparams, LocationPackage locationpackage)
		throws FacebookException
	{
		return getCurrentPlaceParameters(currentplacerequestparams, locationpackage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #134 <Method Bundle getCurrentPlaceParameters(CurrentPlaceRequestParams, LocationPackage)>
	//    3    5:areturn         
	}

*/
}
