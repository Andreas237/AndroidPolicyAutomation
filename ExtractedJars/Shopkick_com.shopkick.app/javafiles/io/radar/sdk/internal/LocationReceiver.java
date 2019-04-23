// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.app.PendingIntent;
import android.content.*;
import android.location.Location;
import android.os.Handler;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationResult;
import io.radar.sdk.Radar;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.internal:
//			RadarLogger

public final class LocationReceiver extends BroadcastReceiver
{
	public static final class Companion
	{

		private final Intent baseIntent(Context context)
		{
			return new Intent(context, io/radar/sdk/internal/LocationReceiver);
		//    0    0:new             #42  <Class Intent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:ldc1            #6   <Class LocationReceiver>
		//    4    7:invokespecial   #45  <Method void Intent(Context, Class)>
		//    5   10:areturn         
		}

		public final PendingIntent getGeofencePendingIntent$sdk_release(Context context)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
		//    0    0:aload_1         
		//    1    1:ldc1            #48  <String "context">
		//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intent intent = baseIntent(context);
		//    3    6:aload_0         
		//    4    7:checkcast       #2   <Class LocationReceiver$Companion>
		//    5   10:aload_1         
		//    6   11:invokespecial   #56  <Method Intent baseIntent(Context)>
		//    7   14:astore_2        
			intent.setAction("io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED");
		//    8   15:aload_2         
		//    9   16:ldc1            #58  <String "io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED">
		//   10   18:invokevirtual   #62  <Method Intent Intent.setAction(String)>
		//   11   21:pop             
			context = ((Context) (PendingIntent.getBroadcast(context, 0, intent, 0x8000000)));
		//   12   22:aload_1         
		//   13   23:iconst_0        
		//   14   24:aload_2         
		//   15   25:ldc1            #63  <Int 0x8000000>
		//   16   27:invokestatic    #69  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
		//   17   30:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)");
		//   18   31:aload_1         
		//   19   32:ldc1            #71  <String "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)">
		//   20   34:invokestatic    #74  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return ((PendingIntent) (context));
		//   21   37:aload_1         
		//   22   38:areturn         
		}

		public final PendingIntent getLocationPendingIntent$sdk_release(Context context)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
		//    0    0:aload_1         
		//    1    1:ldc1            #48  <String "context">
		//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Intent intent = baseIntent(context);
		//    3    6:aload_0         
		//    4    7:checkcast       #2   <Class LocationReceiver$Companion>
		//    5   10:aload_1         
		//    6   11:invokespecial   #56  <Method Intent baseIntent(Context)>
		//    7   14:astore_2        
			intent.setAction("io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED");
		//    8   15:aload_2         
		//    9   16:ldc1            #78  <String "io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED">
		//   10   18:invokevirtual   #62  <Method Intent Intent.setAction(String)>
		//   11   21:pop             
			context = ((Context) (PendingIntent.getBroadcast(context, 0, intent, 0x8000000)));
		//   12   22:aload_1         
		//   13   23:iconst_0        
		//   14   24:aload_2         
		//   15   25:ldc1            #63  <Int 0x8000000>
		//   16   27:invokestatic    #69  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
		//   17   30:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)");
		//   18   31:aload_1         
		//   19   32:ldc1            #71  <String "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)">
		//   20   34:invokestatic    #74  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return ((PendingIntent) (context));
		//   21   37:aload_1         
		//   22   38:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void LocationReceiver$Companion()>
		//    2    4:return          
		}
	}


	public LocationReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private final void goAsyncAndFinish()
	{
		android.content.BroadcastReceiver.PendingResult pendingresult = goAsync();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//    2    4:astore_1        
		(new Handler()).postDelayed((Runnable)new Runnable(pendingresult) {

			public final void run()
			{
				$pending.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #31  <Field android.content.BroadcastReceiver$PendingResult $pending>
			//    2    4:invokevirtual   #39  <Method void android.content.BroadcastReceiver$PendingResult.finish()>
			//    3    7:return          
			}

			final android.content.BroadcastReceiver.PendingResult $pending;

			
			{
				$pending = pendingresult;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #31  <Field android.content.BroadcastReceiver$PendingResult $pending>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #33  <Method void Object()>
			//    5    9:return          
			}
		}
, 8000L);
	//    3    5:new             #57  <Class Handler>
	//    4    8:dup             
	//    5    9:invokespecial   #58  <Method void Handler()>
	//    6   12:new             #9   <Class LocationReceiver$goAsyncAndFinish$1>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #61  <Method void LocationReceiver$goAsyncAndFinish$1(android.content.BroadcastReceiver$PendingResult)>
	//   10   20:checkcast       #63  <Class Runnable>
	//   11   23:ldc2w           #64  <Long 8000L>
	//   12   26:invokevirtual   #69  <Method boolean Handler.postDelayed(Runnable, long)>
	//   13   29:pop             
	//   14   30:return          
	}

	private final String toGeofenceTransitionString(int i)
	{
		if(i != 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpeq          37
			switch(i)
	//*   3    5:iload_1         
			{
	//*   4    6:tableswitch     1 2: default 28
	//	               1 34
	//	               2 31
			default:
				return "other";
	//    5   28:ldc1            #72  <String "other">
	//    6   30:areturn         

			case 2: // '\002'
				return "exit";
	//    7   31:ldc1            #74  <String "exit">
	//    8   33:areturn         

			case 1: // '\001'
				return "enter";
	//    9   34:ldc1            #76  <String "enter">
	//   10   36:areturn         
			}
		else
			return "dwell";
	//   11   37:ldc1            #78  <String "dwell">
	//   12   39:areturn         
	}

	public void onReceive(Context context, Intent intent)
	{
label0:
		{
label1:
			{
label2:
				{
					Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "context">
	//    2    3:invokestatic    #89  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
					Intrinsics.checkParameterIsNotNull(((Object) (intent)), "intent");
	//    3    6:aload_2         
	//    4    7:ldc1            #90  <String "intent">
	//    5    9:invokestatic    #89  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
					context = ((Context) (intent.getAction()));
	//    6   12:aload_2         
	//    7   13:invokevirtual   #96  <Method String Intent.getAction()>
	//    8   16:astore_1        
					if(context == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       22
						return;
	//   11   21:return          
					int i = ((String) (context)).hashCode();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #102 <Method int String.hashCode()>
	//   14   26:istore_3        
					if(i == 0xf8f4e53f)
						break label1;
	//   15   27:iload_3         
	//   16   28:ldc1            #103 <Int 0xf8f4e53f>
	//   17   30:icmpeq          215
					if(i != 0x238b3676)
	//*  18   33:iload_3         
	//*  19   34:ldc1            #104 <Int 0x238b3676>
	//*  20   36:icmpeq          69
					{
						if(i != 0x2f94f923)
	//*  21   39:iload_3         
	//*  22   40:ldc1            #105 <Int 0x2f94f923>
	//*  23   42:icmpeq          46
							return;
	//   24   45:return          
						if(((String) (context)).equals("android.intent.action.BOOT_COMPLETED") && Radar.isTracking())
	//*  25   46:aload_1         
	//*  26   47:ldc1            #107 <String "android.intent.action.BOOT_COMPLETED">
	//*  27   49:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  28   52:ifeq            345
	//*  29   55:invokestatic    #117 <Method boolean Radar.isTracking()>
	//*  30   58:ifeq            345
						{
							Radar.INSTANCE.requestLocation$sdk_release(true);
	//   31   61:getstatic       #121 <Field Radar Radar.INSTANCE>
	//   32   64:iconst_1        
	//   33   65:invokevirtual   #125 <Method void Radar.requestLocation$sdk_release(boolean)>
							return;
	//   34   68:return          
						}
						break label0;
					}
					if(!((String) (context)).equals("io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED"))
						break label0;
	//   35   69:aload_1         
	//   36   70:ldc1            #36  <String "io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED">
	//   37   72:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   38   75:ifeq            345
					context = ((Context) (GeofencingEvent.fromIntent(intent)));
	//   39   78:aload_2         
	//   40   79:invokestatic    #131 <Method GeofencingEvent GeofencingEvent.fromIntent(Intent)>
	//   41   82:astore_1        
					if(context != null)
	//*  42   83:aload_1         
	//*  43   84:ifnull          137
					{
						intent = ((Intent) (RadarLogger.INSTANCE));
	//   44   87:getstatic       #136 <Field RadarLogger RadarLogger.INSTANCE>
	//   45   90:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
	//   46   91:new             #138 <Class StringBuilder>
	//   47   94:dup             
	//   48   95:invokespecial   #139 <Method void StringBuilder()>
	//   49   98:astore          4
						stringbuilder.append("Geofence event received: ");
	//   50  100:aload           4
	//   51  102:ldc1            #141 <String "Geofence event received: ">
	//   52  104:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   53  107:pop             
						stringbuilder.append(toGeofenceTransitionString(((GeofencingEvent) (context)).getGeofenceTransition()));
	//   54  108:aload           4
	//   55  110:aload_0         
	//   56  111:aload_1         
	//   57  112:invokevirtual   #148 <Method int GeofencingEvent.getGeofenceTransition()>
	//   58  115:invokespecial   #150 <Method String toGeofenceTransitionString(int)>
	//   59  118:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   60  121:pop             
						RadarLogger.d$default(((RadarLogger) (intent)), stringbuilder.toString(), ((Throwable) (null)), 2, ((Object) (null)));
	//   61  122:aload_2         
	//   62  123:aload           4
	//   63  125:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   64  128:aconst_null     
	//   65  129:iconst_2        
	//   66  130:aconst_null     
	//   67  131:invokestatic    #157 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
					} else
	//*  68  134:goto            139
					{
						context = null;
	//   69  137:aconst_null     
	//   70  138:astore_1        
					}
					if(context != null)
	//*  71  139:aload_1         
	//*  72  140:ifnull          197
					{
						intent = ((Intent) (((GeofencingEvent) (context)).getTriggeringLocation()));
	//   73  143:aload_1         
	//   74  144:invokevirtual   #161 <Method Location GeofencingEvent.getTriggeringLocation()>
	//   75  147:astore_2        
						if(intent != null)
	//*  76  148:aload_2         
	//*  77  149:ifnull          197
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//   78  152:new             #138 <Class StringBuilder>
	//   79  155:dup             
	//   80  156:invokespecial   #139 <Method void StringBuilder()>
	//   81  159:astore          4
							stringbuilder1.append("Geofence ");
	//   82  161:aload           4
	//   83  163:ldc1            #163 <String "Geofence ">
	//   84  165:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   85  168:pop             
							stringbuilder1.append(toGeofenceTransitionString(((GeofencingEvent) (context)).getGeofenceTransition()));
	//   86  169:aload           4
	//   87  171:aload_0         
	//   88  172:aload_1         
	//   89  173:invokevirtual   #148 <Method int GeofencingEvent.getGeofenceTransition()>
	//   90  176:invokespecial   #150 <Method String toGeofenceTransitionString(int)>
	//   91  179:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   92  182:pop             
							((Location) (intent)).setProvider(stringbuilder1.toString());
	//   93  183:aload_2         
	//   94  184:aload           4
	//   95  186:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   96  189:invokevirtual   #169 <Method void Location.setProvider(String)>
							context = ((Context) (intent));
	//   97  192:aload_2         
	//   98  193:astore_1        
							break label2;
	//   99  194:goto            199
						}
					}
					context = null;
	//  100  197:aconst_null     
	//  101  198:astore_1        
				}
				if(context != null)
	//* 102  199:aload_1         
	//* 103  200:ifnull          345
				{
					Radar.INSTANCE.handleLocation$sdk_release(((Location) (context)));
	//  104  203:getstatic       #121 <Field Radar Radar.INSTANCE>
	//  105  206:aload_1         
	//  106  207:invokevirtual   #173 <Method void Radar.handleLocation$sdk_release(Location)>
					goAsyncAndFinish();
	//  107  210:aload_0         
	//  108  211:invokespecial   #175 <Method void goAsyncAndFinish()>
					return;
	//  109  214:return          
				}
				break label0;
			}
			if(((String) (context)).equals("io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED"))
	//* 110  215:aload_1         
	//* 111  216:ldc1            #40  <String "io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED">
	//* 112  218:invokevirtual   #111 <Method boolean String.equals(Object)>
	//* 113  221:ifeq            345
			{
				context = ((Context) (LocationResult.extractResult(intent)));
	//  114  224:aload_2         
	//  115  225:invokestatic    #181 <Method LocationResult LocationResult.extractResult(Intent)>
	//  116  228:astore_1        
				if(context != null)
	//* 117  229:aload_1         
	//* 118  230:ifnull          345
				{
					context = ((Context) (((LocationResult) (context)).getLocations()));
	//  119  233:aload_1         
	//  120  234:invokevirtual   #185 <Method List LocationResult.getLocations()>
	//  121  237:astore_1        
					if(context != null)
	//* 122  238:aload_1         
	//* 123  239:ifnull          345
					{
						if(((List) (context)).size() <= 0)
	//* 124  242:aload_1         
	//* 125  243:invokeinterface #190 <Method int List.size()>
	//* 126  248:ifgt            263
						{
							RadarLogger.d$default(RadarLogger.INSTANCE, "Received empty Locations", ((Throwable) (null)), 2, ((Object) (null)));
	//  127  251:getstatic       #136 <Field RadarLogger RadarLogger.INSTANCE>
	//  128  254:ldc1            #192 <String "Received empty Locations">
	//  129  256:aconst_null     
	//  130  257:iconst_2        
	//  131  258:aconst_null     
	//  132  259:invokestatic    #157 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
							return;
	//  133  262:return          
						}
						if(((List) (context)).size() > 1)
	//* 134  263:aload_1         
	//* 135  264:invokeinterface #190 <Method int List.size()>
	//* 136  269:iconst_1        
	//* 137  270:icmple          326
						{
							intent = ((Intent) (RadarLogger.INSTANCE));
	//  138  273:getstatic       #136 <Field RadarLogger RadarLogger.INSTANCE>
	//  139  276:astore_2        
							StringBuilder stringbuilder2 = new StringBuilder();
	//  140  277:new             #138 <Class StringBuilder>
	//  141  280:dup             
	//  142  281:invokespecial   #139 <Method void StringBuilder()>
	//  143  284:astore          4
							stringbuilder2.append("Handling ");
	//  144  286:aload           4
	//  145  288:ldc1            #194 <String "Handling ">
	//  146  290:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//  147  293:pop             
							stringbuilder2.append(((List) (context)).size());
	//  148  294:aload           4
	//  149  296:aload_1         
	//  150  297:invokeinterface #190 <Method int List.size()>
	//  151  302:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  152  305:pop             
							stringbuilder2.append(" batched locations");
	//  153  306:aload           4
	//  154  308:ldc1            #199 <String " batched locations">
	//  155  310:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//  156  313:pop             
							RadarLogger.d$default(((RadarLogger) (intent)), stringbuilder2.toString(), ((Throwable) (null)), 2, ((Object) (null)));
	//  157  314:aload_2         
	//  158  315:aload           4
	//  159  317:invokevirtual   #153 <Method String StringBuilder.toString()>
	//  160  320:aconst_null     
	//  161  321:iconst_2        
	//  162  322:aconst_null     
	//  163  323:invokestatic    #157 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
						}
						intent = ((Intent) (Radar.INSTANCE));
	//  164  326:getstatic       #121 <Field Radar Radar.INSTANCE>
	//  165  329:astore_2        
						Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "it");
	//  166  330:aload_1         
	//  167  331:ldc1            #201 <String "it">
	//  168  333:invokestatic    #204 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
						((Radar) (intent)).handleLocations$sdk_release(((List) (context)));
	//  169  336:aload_2         
	//  170  337:aload_1         
	//  171  338:invokevirtual   #208 <Method void Radar.handleLocations$sdk_release(List)>
						goAsyncAndFinish();
	//  172  341:aload_0         
	//  173  342:invokespecial   #175 <Method void goAsyncAndFinish()>
					}
				}
			}
		}
	//  174  345:return          
	}

	public static final String ACTION_GEOFENCE = "io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED";
	public static final String ACTION_LOCATION = "io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED";
	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));

	static 
	{
	//    0    0:new             #6   <Class LocationReceiver$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #46  <Method void LocationReceiver$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #48  <Field LocationReceiver$Companion Companion>
	//*   5   11:return          
	}
}
