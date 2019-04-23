// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import android.content.*;
import android.location.Location;
import android.os.Parcelable;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import java.text.ParseException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class RadarReceiver extends BroadcastReceiver
{
	public static final class Companion
	{

		public final Intent createErrorIntent$sdk_release(Radar.RadarStatus radarstatus)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
		//    0    0:aload_1         
		//    1    1:ldc1            #50  <String "status">
		//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intent intent = new Intent("io.radar.sdk.RECEIVED");
		//    3    6:new             #58  <Class Intent>
		//    4    9:dup             
		//    5   10:ldc1            #60  <String "io.radar.sdk.RECEIVED">
		//    6   12:invokespecial   #63  <Method void Intent(String)>
		//    7   15:astore_2        
			intent.putExtra("status", radarstatus.ordinal());
		//    8   16:aload_2         
		//    9   17:ldc1            #50  <String "status">
		//   10   19:aload_1         
		//   11   20:invokevirtual   #69  <Method int Radar$RadarStatus.ordinal()>
		//   12   23:invokevirtual   #73  <Method Intent Intent.putExtra(String, int)>
		//   13   26:pop             
			return intent;
		//   14   27:aload_2         
		//   15   28:areturn         
		}

		public final Intent createIntent$sdk_release(JSONObject jsonobject, Location location)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "payload");
		//    0    0:aload_1         
		//    1    1:ldc1            #77  <String "payload">
		//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
		//    3    6:aload_2         
		//    4    7:ldc1            #78  <String "location">
		//    5    9:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intent intent = new Intent("io.radar.sdk.RECEIVED");
		//    6   12:new             #58  <Class Intent>
		//    7   15:dup             
		//    8   16:ldc1            #60  <String "io.radar.sdk.RECEIVED">
		//    9   18:invokespecial   #63  <Method void Intent(String)>
		//   10   21:astore_3        
			intent.putExtra("response", jsonobject.toString());
		//   11   22:aload_3         
		//   12   23:ldc1            #80  <String "response">
		//   13   25:aload_1         
		//   14   26:invokevirtual   #86  <Method String JSONObject.toString()>
		//   15   29:invokevirtual   #89  <Method Intent Intent.putExtra(String, String)>
		//   16   32:pop             
			intent.putExtra("location", (Parcelable)location);
		//   17   33:aload_3         
		//   18   34:ldc1            #78  <String "location">
		//   19   36:aload_2         
		//   20   37:checkcast       #91  <Class Parcelable>
		//   21   40:invokevirtual   #94  <Method Intent Intent.putExtra(String, Parcelable)>
		//   22   43:pop             
			return intent;
		//   23   44:aload_3         
		//   24   45:areturn         
		}

		public final Intent createLocationIntent$sdk_release(Location location, boolean flag)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
		//    0    0:aload_1         
		//    1    1:ldc1            #78  <String "location">
		//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intent intent = new Intent("io.radar.sdk.RECEIVED");
		//    3    6:new             #58  <Class Intent>
		//    4    9:dup             
		//    5   10:ldc1            #60  <String "io.radar.sdk.RECEIVED">
		//    6   12:invokespecial   #63  <Method void Intent(String)>
		//    7   15:astore_3        
			intent.putExtra("location", (Parcelable)location);
		//    8   16:aload_3         
		//    9   17:ldc1            #78  <String "location">
		//   10   19:aload_1         
		//   11   20:checkcast       #91  <Class Parcelable>
		//   12   23:invokevirtual   #94  <Method Intent Intent.putExtra(String, Parcelable)>
		//   13   26:pop             
			intent.putExtra("stopped", flag);
		//   14   27:aload_3         
		//   15   28:ldc1            #96  <String "stopped">
		//   16   30:iload_2         
		//   17   31:invokevirtual   #99  <Method Intent Intent.putExtra(String, boolean)>
		//   18   34:pop             
			return intent;
		//   19   35:aload_3         
		//   20   36:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void RadarReceiver$Companion()>
		//    2    4:return          
		}
	}


	public RadarReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private final void handleError(Context context, Intent intent)
	{
		int i = intent.getIntExtra("status", -1);
	//    0    0:aload_2         
	//    1    1:ldc1            #53  <String "status">
	//    2    3:iconst_m1       
	//    3    4:invokevirtual   #77  <Method int Intent.getIntExtra(String, int)>
	//    4    7:istore_3        
		intent = ((Intent) (Radar.RadarStatus.values()));
	//    5    8:invokestatic    #83  <Method Radar$RadarStatus[] Radar$RadarStatus.values()>
	//    6   11:astore_2        
		int j = intent.length;
	//    7   12:aload_2         
	//    8   13:arraylength     
	//    9   14:istore          4
		if(i >= 0 && j > i)
	//*  10   16:iload_3         
	//*  11   17:ifge            23
	//*  12   20:goto            36
	//*  13   23:iload           4
	//*  14   25:iload_3         
	//*  15   26:icmple          36
			intent = ((Intent) (intent[i]));
	//   16   29:aload_2         
	//   17   30:iload_3         
	//   18   31:aaload          
	//   19   32:astore_2        
		else
	//*  20   33:goto            40
			intent = ((Intent) (Radar.RadarStatus.UNKNOWN));
	//   21   36:getstatic       #86  <Field Radar$RadarStatus Radar$RadarStatus.UNKNOWN>
	//   22   39:astore_2        
		if(intent != Radar.RadarStatus.SUCCESS && intent != Radar.RadarStatus.UNKNOWN)
	//*  23   40:aload_2         
	//*  24   41:getstatic       #89  <Field Radar$RadarStatus Radar$RadarStatus.SUCCESS>
	//*  25   44:if_acmpeq       60
	//*  26   47:aload_2         
	//*  27   48:getstatic       #86  <Field Radar$RadarStatus Radar$RadarStatus.UNKNOWN>
	//*  28   51:if_acmpeq       60
			onError(context, ((Radar.RadarStatus) (intent)));
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:aload_2         
	//   32   57:invokevirtual   #92  <Method void onError(Context, Radar$RadarStatus)>
	//   33   60:return          
	}

	private final void handleLocation(Context context, Intent intent)
	{
		Location location = (Location)intent.getParcelableExtra("location");
	//    0    0:aload_2         
	//    1    1:ldc1            #55  <String "location">
	//    2    3:invokevirtual   #96  <Method Parcelable Intent.getParcelableExtra(String)>
	//    3    6:checkcast       #98  <Class Location>
	//    4    9:astore          4
		boolean flag = intent.getBooleanExtra("stopped", false);
	//    5   11:aload_2         
	//    6   12:ldc1            #60  <String "stopped">
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #102 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//    9   18:istore_3        
		if(location != null)
	//*  10   19:aload           4
	//*  11   21:ifnull          32
			onClientLocationUpdated(context, location, flag);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload           4
	//   15   28:iload_3         
	//   16   29:invokevirtual   #105 <Method void onClientLocationUpdated(Context, Location, boolean)>
	//   17   32:return          
	}

	private final void handleSuccess(Context context, Intent intent)
	{
		Object obj;
		obj = ((Object) (intent.getStringExtra("response")));
	//    0    0:aload_2         
	//    1    1:ldc1            #58  <String "response">
	//    2    3:invokevirtual   #113 <Method String Intent.getStringExtra(String)>
	//    3    6:astore          4
		intent = ((Intent) ((Location)intent.getParcelableExtra("location")));
	//    4    8:aload_2         
	//    5    9:ldc1            #55  <String "location">
	//    6   11:invokevirtual   #96  <Method Parcelable Intent.getParcelableExtra(String)>
	//    7   14:checkcast       #98  <Class Location>
	//    8   17:astore_2        
		if(obj == null || intent == null) goto _L2; else goto _L1
	//    9   18:aload           4
	//   10   20:ifnull          150
	//   11   23:aload_2         
	//   12   24:ifnull          150
_L1:
		RadarEvent aradarevent[];
		obj = ((Object) (new JSONObject(((String) (obj)))));
	//   13   27:new             #115 <Class JSONObject>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokespecial   #118 <Method void JSONObject(String)>
	//   17   36:astore          4
		org.json.JSONArray jsonarray = ((JSONObject) (obj)).getJSONArray("events");
	//   18   38:aload           4
	//   19   40:ldc1            #119 <String "events">
	//   20   42:invokevirtual   #123 <Method org.json.JSONArray JSONObject.getJSONArray(String)>
	//   21   45:astore          5
		Object obj1 = ((Object) (RadarEvent.Companion));
	//   22   47:getstatic       #128 <Field io.radar.sdk.model.RadarEvent$Companion RadarEvent.Companion>
	//   23   50:astore          6
		Intrinsics.checkExpressionValueIsNotNull(((Object) (jsonarray)), "eventsArr");
	//   24   52:aload           5
	//   25   54:ldc1            #130 <String "eventsArr">
	//   26   56:invokestatic    #136 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		aradarevent = ((io.radar.sdk.model.RadarEvent.Companion) (obj1)).eventsFromJSONArray$sdk_release(jsonarray);
	//   27   59:aload           6
	//   28   61:aload           5
	//   29   63:invokevirtual   #142 <Method RadarEvent[] io.radar.sdk.model.RadarEvent$Companion.eventsFromJSONArray$sdk_release(org.json.JSONArray)>
	//   30   66:astore          5
		obj1 = ((Object) (RadarUser.Companion));
	//   31   68:getstatic       #147 <Field io.radar.sdk.model.RadarUser$Companion RadarUser.Companion>
	//   32   71:astore          6
		obj = ((Object) (((JSONObject) (obj)).getJSONObject("user")));
	//   33   73:aload           4
	//   34   75:ldc1            #148 <String "user">
	//   35   77:invokevirtual   #152 <Method JSONObject JSONObject.getJSONObject(String)>
	//   36   80:astore          4
		Intrinsics.checkExpressionValueIsNotNull(obj, "response.getJSONObject(\"user\")");
	//   37   82:aload           4
	//   38   84:ldc1            #154 <String "response.getJSONObject(\"user\")">
	//   39   86:invokestatic    #136 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		obj = ((Object) (((io.radar.sdk.model.RadarUser.Companion) (obj1)).fromJson$sdk_release(((JSONObject) (obj)))));
	//   40   89:aload           6
	//   41   91:aload           4
	//   42   93:invokevirtual   #160 <Method RadarUser io.radar.sdk.model.RadarUser$Companion.fromJson$sdk_release(JSONObject)>
	//   43   96:astore          4
		boolean flag;
		if(aradarevent.length == 0)
	//*  44   98:aload           5
	//*  45  100:arraylength     
	//*  46  101:ifne            159
			flag = true;
	//   47  104:iconst_1        
	//   48  105:istore_3        
		else
	//*  49  106:goto            109
	//*  50  109:iload_3         
	//*  51  110:iconst_1        
	//*  52  111:ixor            
	//*  53  112:ifeq            124
	//*  54  115:aload_0         
	//*  55  116:aload_1         
	//*  56  117:aload           5
	//*  57  119:aload           4
	//*  58  121:invokevirtual   #162 <Method void onEventsReceived(Context, RadarEvent[], RadarUser)>
	//*  59  124:aload_0         
	//*  60  125:aload_1         
	//*  61  126:aload_2         
	//*  62  127:aload           4
	//*  63  129:invokevirtual   #165 <Method void onLocationUpdated(Context, Location, RadarUser)>
	//*  64  132:return          
	//*  65  133:aload_0         
	//*  66  134:aload_1         
	//*  67  135:getstatic       #168 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_UNKNOWN>
	//*  68  138:invokevirtual   #92  <Method void onError(Context, Radar$RadarStatus)>
	//*  69  141:return          
	//*  70  142:aload_0         
	//*  71  143:aload_1         
	//*  72  144:getstatic       #168 <Field Radar$RadarStatus Radar$RadarStatus.ERROR_UNKNOWN>
	//*  73  147:invokevirtual   #92  <Method void onError(Context, Radar$RadarStatus)>
	//*  74  150:return          
	//*  75  151:astore_2        
	//*  76  152:goto            142
	//*  77  155:astore_2        
	//*  78  156:goto            133
			flag = false;
	//   79  159:iconst_0        
	//   80  160:istore_3        
		if(!(flag ^ true))
			break MISSING_BLOCK_LABEL_124;
		onEventsReceived(context, aradarevent, ((RadarUser) (obj)));
		onLocationUpdated(context, ((Location) (intent)), ((RadarUser) (obj)));
		return;
_L6:
		onError(context, Radar.RadarStatus.ERROR_UNKNOWN);
		return;
_L4:
		onError(context, Radar.RadarStatus.ERROR_UNKNOWN);
_L2:
		return;
		intent;
		if(true) goto _L4; else goto _L3
_L3:
		intent;
		if(true) goto _L6; else goto _L5
_L5:
	//*  81  161:goto            109
	}

	public void onClientLocationUpdated(Context context, Location location, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #169 <String "context">
	//    2    3:invokestatic    #172 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    3    6:aload_2         
	//    4    7:ldc1            #55  <String "location">
	//    5    9:invokestatic    #172 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	//    6   12:return          
	}

	public abstract void onError(Context context, Radar.RadarStatus radarstatus);

	public abstract void onEventsReceived(Context context, RadarEvent aradarevent[], RadarUser radaruser);

	public void onLocationUpdated(Context context, Location location, RadarUser radaruser)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #169 <String "context">
	//    2    3:invokestatic    #172 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    3    6:aload_2         
	//    4    7:ldc1            #55  <String "location">
	//    5    9:invokestatic    #172 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radaruser)), "user");
	//    6   12:aload_3         
	//    7   13:ldc1            #148 <String "user">
	//    8   15:invokestatic    #172 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	//    9   18:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #169 <String "context">
	//    2    3:invokestatic    #172 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (intent)), "intent");
	//    3    6:aload_2         
	//    4    7:ldc1            #174 <String "intent">
	//    5    9:invokestatic    #172 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(Intrinsics.areEqual(((Object) (intent.getAction())), "io.radar.sdk.RECEIVED"))
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #178 <Method String Intent.getAction()>
	//*   8   16:ldc1            #49  <String "io.radar.sdk.RECEIVED">
	//*   9   18:invokestatic    #182 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  10   21:ifeq            80
		{
			if(intent.hasExtra("location") && intent.hasExtra("response"))
	//*  11   24:aload_2         
	//*  12   25:ldc1            #55  <String "location">
	//*  13   27:invokevirtual   #186 <Method boolean Intent.hasExtra(String)>
	//*  14   30:ifeq            49
	//*  15   33:aload_2         
	//*  16   34:ldc1            #58  <String "response">
	//*  17   36:invokevirtual   #186 <Method boolean Intent.hasExtra(String)>
	//*  18   39:ifeq            49
			{
				handleSuccess(context, intent);
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:aload_2         
	//   22   45:invokespecial   #188 <Method void handleSuccess(Context, Intent)>
				return;
	//   23   48:return          
			}
			if(intent.hasExtra("location") && intent.hasExtra("stopped"))
	//*  24   49:aload_2         
	//*  25   50:ldc1            #55  <String "location">
	//*  26   52:invokevirtual   #186 <Method boolean Intent.hasExtra(String)>
	//*  27   55:ifeq            74
	//*  28   58:aload_2         
	//*  29   59:ldc1            #60  <String "stopped">
	//*  30   61:invokevirtual   #186 <Method boolean Intent.hasExtra(String)>
	//*  31   64:ifeq            74
			{
				handleLocation(context, intent);
	//   32   67:aload_0         
	//   33   68:aload_1         
	//   34   69:aload_2         
	//   35   70:invokespecial   #190 <Method void handleLocation(Context, Intent)>
				return;
	//   36   73:return          
			}
			handleError(context, intent);
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:aload_2         
	//   40   77:invokespecial   #192 <Method void handleError(Context, Intent)>
		}
	//   41   80:return          
	}

	public static final String ACTION_RECEIVED = "io.radar.sdk.RECEIVED";
	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String EXTRA_ERROR_STATUS = "status";
	public static final String EXTRA_LOCATION = "location";
	public static final String EXTRA_PAYLOAD = "response";
	public static final String EXTRA_STOPPED = "stopped";

	static 
	{
	//    0    0:new             #6   <Class RadarReceiver$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #65  <Method void RadarReceiver$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #67  <Field RadarReceiver$Companion Companion>
	//*   5   11:return          
	}
}
