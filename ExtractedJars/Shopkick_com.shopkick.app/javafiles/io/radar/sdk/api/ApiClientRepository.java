// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.radar.sdk.internal.RadarLogger;
import io.radar.sdk.internal.extensions.SharedPreferencesKt;
import io.radar.sdk.internal.repository.BaseRepository;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

public final class ApiClientRepository extends BaseRepository
{

	public ApiClientRepository(Context context1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "context">
	//    2    3:invokestatic    #89  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #91  <Method void BaseRepository(Context)>
		context = context1;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #93  <Field Context context>
	//    9   16:aload_0         
	//   10   17:ldc1            #95  <String "ad_id">
	//   11   19:putfield        #97  <Field String KEY_AD_ID>
	//   12   22:aload_0         
	//   13   23:ldc1            #99  <String "is_at_place">
	//   14   25:putfield        #101 <Field String KEY_AT_PLACE>
	//   15   28:aload_0         
	//   16   29:ldc1            #103 <String "places_limit_hit">
	//   17   31:putfield        #105 <Field String KEY_PLACES_LIMIT_TIME>
	//   18   34:aload_0         
	//   19   35:ldc1            #107 <String "last_sent_at_time">
	//   20   37:putfield        #109 <Field String KEY_LAST_SENT_AT>
	//   21   40:aload_0         
	//   22   41:ldc1            #111 <String "radar_api_host">
	//   23   43:putfield        #113 <Field String KEY_RADAR_HOST>
	//   24   46:aload_0         
	//   25   47:ldc1            #115 <String "https://api.radar.io/">
	//   26   49:putfield        #117 <Field String DEFAULT_RADAR_HOST>
	//   27   52:aload_0         
	//   28   53:ldc1            #119 <String "facebook_graph_host">
	//   29   55:putfield        #121 <Field String KEY_FACEBOOK_HOST>
	//   30   58:aload_0         
	//   31   59:ldc1            #123 <String "https://graph.facebook.com/">
	//   32   61:putfield        #125 <Field String DEFAULT_FACEBOOK_HOST>
	//   33   64:aload_0         
	//   34   65:ldc1            #127 <String "last_failed_stop">
	//   35   67:putfield        #129 <Field String KEY_LAST_FAILED_STOP>
	//   36   70:aload_0         
	//   37   71:ldc1            #131 <String "can_exit">
	//   38   73:putfield        #133 <Field String KEY_CAN_EXIT>
	//   39   76:return          
	}

	public final String getAdId$sdk_release()
	{
		return getSharedPreferences().getString(KEY_AD_ID, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field String KEY_AD_ID>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #152 <Method String SharedPreferences.getString(String, String)>
	//    6   14:areturn         
	}

	public final boolean getAtPlace$sdk_release()
	{
		return getSharedPreferences().getBoolean(KEY_AT_PLACE, false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field String KEY_AT_PLACE>
	//    4    8:iconst_0        
	//    5    9:invokeinterface #156 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    6   14:ireturn         
	}

	public final boolean getCanExit$sdk_release()
	{
		return getSharedPreferences().getBoolean(KEY_CAN_EXIT, false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #133 <Field String KEY_CAN_EXIT>
	//    4    8:iconst_0        
	//    5    9:invokeinterface #156 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    6   14:ireturn         
	}

	public final String getDEFAULT_FACEBOOK_HOST$sdk_release()
	{
		return DEFAULT_FACEBOOK_HOST;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field String DEFAULT_FACEBOOK_HOST>
	//    2    4:areturn         
	}

	public final String getDEFAULT_RADAR_HOST$sdk_release()
	{
		return DEFAULT_RADAR_HOST;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String DEFAULT_RADAR_HOST>
	//    2    4:areturn         
	}

	public final String getFacebookHost$sdk_release()
	{
		String s = getSharedPreferences().getString(KEY_FACEBOOK_HOST, DEFAULT_FACEBOOK_HOST);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field String KEY_FACEBOOK_HOST>
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field String DEFAULT_FACEBOOK_HOST>
	//    6   12:invokeinterface #152 <Method String SharedPreferences.getString(String, String)>
	//    7   17:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "sharedPreferences.getStr\u2026T, DEFAULT_FACEBOOK_HOST)");
	//    8   18:aload_1         
	//    9   19:ldc1            #158 <String "sharedPreferences.getStr\u2026T, DEFAULT_FACEBOOK_HOST)">
	//   10   21:invokestatic    #161 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//   11   24:aload_1         
	//   12   25:areturn         
	}

	public final String getKEY_AD_ID$sdk_release()
	{
		return KEY_AD_ID;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String KEY_AD_ID>
	//    2    4:areturn         
	}

	public final String getKEY_AT_PLACE$sdk_release()
	{
		return KEY_AT_PLACE;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String KEY_AT_PLACE>
	//    2    4:areturn         
	}

	public final String getKEY_CAN_EXIT$sdk_release()
	{
		return KEY_CAN_EXIT;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field String KEY_CAN_EXIT>
	//    2    4:areturn         
	}

	public final String getKEY_FACEBOOK_HOST$sdk_release()
	{
		return KEY_FACEBOOK_HOST;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field String KEY_FACEBOOK_HOST>
	//    2    4:areturn         
	}

	public final String getKEY_LAST_FAILED_STOP$sdk_release()
	{
		return KEY_LAST_FAILED_STOP;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field String KEY_LAST_FAILED_STOP>
	//    2    4:areturn         
	}

	public final String getKEY_LAST_SENT_AT$sdk_release()
	{
		return KEY_LAST_SENT_AT;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String KEY_LAST_SENT_AT>
	//    2    4:areturn         
	}

	public final String getKEY_PLACES_LIMIT_TIME$sdk_release()
	{
		return KEY_PLACES_LIMIT_TIME;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String KEY_PLACES_LIMIT_TIME>
	//    2    4:areturn         
	}

	public final String getKEY_RADAR_HOST$sdk_release()
	{
		return KEY_RADAR_HOST;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String KEY_RADAR_HOST>
	//    2    4:areturn         
	}

	public final Location getLastFailedStop$sdk_release()
	{
		return SharedPreferencesKt.getLocation(getSharedPreferences(), KEY_LAST_FAILED_STOP);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #129 <Field String KEY_LAST_FAILED_STOP>
	//    4    8:invokestatic    #167 <Method Location SharedPreferencesKt.getLocation(SharedPreferences, String)>
	//    5   11:areturn         
	}

	public final Date getLastSentAt$sdk_release()
	{
		long l = getSharedPreferences().getLong(KEY_LAST_SENT_AT, 0L);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field String KEY_LAST_SENT_AT>
	//    4    8:lconst_0        
	//    5    9:invokeinterface #171 <Method long SharedPreferences.getLong(String, long)>
	//    6   14:lstore_1        
		if(l > 0L)
	//*   7   15:lload_1         
	//*   8   16:lconst_0        
	//*   9   17:lcmp            
	//*  10   18:ifle            30
			return new Date(l);
	//   11   21:new             #173 <Class Date>
	//   12   24:dup             
	//   13   25:lload_1         
	//   14   26:invokespecial   #176 <Method void Date(long)>
	//   15   29:areturn         
		else
			return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
	}

	public final Date getPlacesLimitAt$sdk_release()
	{
		long l = getSharedPreferences().getLong(KEY_PLACES_LIMIT_TIME, 0L);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #105 <Field String KEY_PLACES_LIMIT_TIME>
	//    4    8:lconst_0        
	//    5    9:invokeinterface #171 <Method long SharedPreferences.getLong(String, long)>
	//    6   14:lstore_1        
		if(l > 0L)
	//*   7   15:lload_1         
	//*   8   16:lconst_0        
	//*   9   17:lcmp            
	//*  10   18:ifle            30
			return new Date(l);
	//   11   21:new             #173 <Class Date>
	//   12   24:dup             
	//   13   25:lload_1         
	//   14   26:invokespecial   #176 <Method void Date(long)>
	//   15   29:areturn         
		else
			return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
	}

	public final String getRadarHost$sdk_release()
	{
		String s = getSharedPreferences().getString(KEY_RADAR_HOST, DEFAULT_RADAR_HOST);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field String KEY_RADAR_HOST>
	//    4    8:aload_0         
	//    5    9:getfield        #117 <Field String DEFAULT_RADAR_HOST>
	//    6   12:invokeinterface #152 <Method String SharedPreferences.getString(String, String)>
	//    7   17:astore_1        
		if(s != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          24
			return s;
	//   10   22:aload_1         
	//   11   23:areturn         
		else
			return DEFAULT_RADAR_HOST;
	//   12   24:aload_0         
	//   13   25:getfield        #117 <Field String DEFAULT_RADAR_HOST>
	//   14   28:areturn         
	}

	public final void loadAdId$sdk_release()
	{
		(new Thread((Runnable)new Runnable(this) {

			public final void run()
			{
				Object obj;
				obj = ((Object) (AdvertisingIdClient.getAdvertisingIdInfo(context)));
			//    0    0:aload_0         
			//    1    1:getfield        #31  <Field ApiClientRepository this$0>
			//    2    4:invokestatic    #40  <Method Context ApiClientRepository.access$getContext$p(ApiClientRepository)>
			//    3    7:invokestatic    #46  <Method com.google.android.gms.ads.identifier.AdvertisingIdClient$Info AdvertisingIdClient.getAdvertisingIdInfo(Context)>
			//    4   10:astore_1        
				Intrinsics.checkExpressionValueIsNotNull(obj, "info");
			//    5   11:aload_1         
			//    6   12:ldc1            #48  <String "info">
			//    7   14:invokestatic    #54  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				if(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).isLimitAdTrackingEnabled())
			//*   8   17:aload_1         
			//*   9   18:invokevirtual   #60  <Method boolean com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
			//*  10   21:ifeq            30
				{
					obj = "OptedOut";
			//   11   24:ldc1            #62  <String "OptedOut">
			//   12   26:astore_1        
					break MISSING_BLOCK_LABEL_35;
			//   13   27:goto            35
				}
				obj = ((Object) (((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).getId()));
			//   14   30:aload_1         
			//   15   31:invokevirtual   #66  <Method String com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId()>
			//   16   34:astore_1        
				android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
			//   17   35:aload_0         
			//   18   36:getfield        #31  <Field ApiClientRepository this$0>
			//   19   39:invokestatic    #70  <Method SharedPreferences ApiClientRepository.access$getSharedPreferences$p(ApiClientRepository)>
			//   20   42:invokeinterface #76  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
			//   21   47:astore_2        
				Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
			//   22   48:aload_2         
			//   23   49:ldc1            #78  <String "editor">
			//   24   51:invokestatic    #54  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				editor.putString(getKEY_AD_ID$sdk_release(), ((String) (obj)));
			//   25   54:aload_2         
			//   26   55:aload_0         
			//   27   56:getfield        #31  <Field ApiClientRepository this$0>
			//   28   59:invokevirtual   #81  <Method String ApiClientRepository.getKEY_AD_ID$sdk_release()>
			//   29   62:aload_1         
			//   30   63:invokeinterface #87  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
			//   31   68:pop             
				editor.apply();
			//   32   69:aload_2         
			//   33   70:invokeinterface #90  <Method void android.content.SharedPreferences$Editor.apply()>
				return;
			//   34   75:return          
				Exception exception;
				exception;
			//   35   76:astore_1        
				RadarLogger.INSTANCE.d("Error getting advertising ID", (Throwable)exception);
			//   36   77:getstatic       #96  <Field RadarLogger RadarLogger.INSTANCE>
			//   37   80:ldc1            #98  <String "Error getting advertising ID">
			//   38   82:aload_1         
			//   39   83:checkcast       #100 <Class Throwable>
			//   40   86:invokevirtual   #104 <Method void RadarLogger.d(String, Throwable)>
				return;
			//   41   89:return          
			}

			final ApiClientRepository this$0;

			
			{
				this$0 = apiclientrepository;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #31  <Field ApiClientRepository this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #33  <Method void Object()>
			//    5    9:return          
			}
		}
)).start();
	//    0    0:new             #179 <Class Thread>
	//    1    3:dup             
	//    2    4:new             #6   <Class ApiClientRepository$loadAdId$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #182 <Method void ApiClientRepository$loadAdId$1(ApiClientRepository)>
	//    6   12:checkcast       #184 <Class Runnable>
	//    7   15:invokespecial   #187 <Method void Thread(Runnable)>
	//    8   18:invokevirtual   #190 <Method void Thread.start()>
	//    9   21:return          
	}

	public final void setAtPlace$sdk_release(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #194 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #196 <String "editor">
	//    6   13:invokestatic    #161 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putBoolean(KEY_AT_PLACE, flag);
	//    7   16:aload_2         
	//    8   17:aload_0         
	//    9   18:getfield        #101 <Field String KEY_AT_PLACE>
	//   10   21:iload_1         
	//   11   22:invokeinterface #202 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   12   27:pop             
		editor.apply();
	//   13   28:aload_2         
	//   14   29:invokeinterface #205 <Method void android.content.SharedPreferences$Editor.apply()>
	//   15   34:return          
	}

	public final void setCanExit$sdk_release(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #194 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #196 <String "editor">
	//    6   13:invokestatic    #161 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putBoolean(KEY_CAN_EXIT, flag);
	//    7   16:aload_2         
	//    8   17:aload_0         
	//    9   18:getfield        #133 <Field String KEY_CAN_EXIT>
	//   10   21:iload_1         
	//   11   22:invokeinterface #202 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   12   27:pop             
		editor.apply();
	//   13   28:aload_2         
	//   14   29:invokeinterface #205 <Method void android.content.SharedPreferences$Editor.apply()>
	//   15   34:return          
	}

	public final void setLastFailedStop$sdk_release(Location location)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #194 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #196 <String "editor">
	//    6   13:invokestatic    #161 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		SharedPreferencesKt.putLocation(editor, KEY_LAST_FAILED_STOP, location);
	//    7   16:aload_2         
	//    8   17:aload_0         
	//    9   18:getfield        #129 <Field String KEY_LAST_FAILED_STOP>
	//   10   21:aload_1         
	//   11   22:invokestatic    #209 <Method void SharedPreferencesKt.putLocation(android.content.SharedPreferences$Editor, String, Location)>
		editor.apply();
	//   12   25:aload_2         
	//   13   26:invokeinterface #205 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   31:return          
	}

	public final void setLastSentAt$sdk_release(Date date)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #194 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore          4
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   11:aload           4
	//    5   13:ldc1            #196 <String "editor">
	//    6   15:invokestatic    #161 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		String s = KEY_LAST_SENT_AT;
	//    7   18:aload_0         
	//    8   19:getfield        #109 <Field String KEY_LAST_SENT_AT>
	//    9   22:astore          5
		long l;
		if(date != null)
	//*  10   24:aload_1         
	//*  11   25:ifnull          36
			l = date.getTime();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #213 <Method long Date.getTime()>
	//   14   32:lstore_2        
		else
	//*  15   33:goto            38
			l = 0L;
	//   16   36:lconst_0        
	//   17   37:lstore_2        
		editor.putLong(s, l);
	//   18   38:aload           4
	//   19   40:aload           5
	//   20   42:lload_2         
	//   21   43:invokeinterface #217 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   22   48:pop             
		editor.apply();
	//   23   49:aload           4
	//   24   51:invokeinterface #205 <Method void android.content.SharedPreferences$Editor.apply()>
	//   25   56:return          
	}

	public final void setPlacesLimitAt$sdk_release(Date date)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #194 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore          4
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   11:aload           4
	//    5   13:ldc1            #196 <String "editor">
	//    6   15:invokestatic    #161 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		String s = KEY_PLACES_LIMIT_TIME;
	//    7   18:aload_0         
	//    8   19:getfield        #105 <Field String KEY_PLACES_LIMIT_TIME>
	//    9   22:astore          5
		long l;
		if(date != null)
	//*  10   24:aload_1         
	//*  11   25:ifnull          36
			l = date.getTime();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #213 <Method long Date.getTime()>
	//   14   32:lstore_2        
		else
	//*  15   33:goto            38
			l = 0L;
	//   16   36:lconst_0        
	//   17   37:lstore_2        
		editor.putLong(s, l);
	//   18   38:aload           4
	//   19   40:aload           5
	//   20   42:lload_2         
	//   21   43:invokeinterface #217 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   22   48:pop             
		editor.apply();
	//   23   49:aload           4
	//   24   51:invokeinterface #205 <Method void android.content.SharedPreferences$Editor.apply()>
	//   25   56:return          
	}

	private final String DEFAULT_FACEBOOK_HOST = "https://graph.facebook.com/";
	private final String DEFAULT_RADAR_HOST = "https://api.radar.io/";
	private final String KEY_AD_ID = "ad_id";
	private final String KEY_AT_PLACE = "is_at_place";
	private final String KEY_CAN_EXIT = "can_exit";
	private final String KEY_FACEBOOK_HOST = "facebook_graph_host";
	private final String KEY_LAST_FAILED_STOP = "last_failed_stop";
	private final String KEY_LAST_SENT_AT = "last_sent_at_time";
	private final String KEY_PLACES_LIMIT_TIME = "places_limit_hit";
	private final String KEY_RADAR_HOST = "radar_api_host";
	private final Context context;


/*
	public static final Context access$getContext$p(ApiClientRepository apiclientrepository)
	{
		return apiclientrepository.context;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Context context>
	//    2    4:areturn         
	}

*/


/*
	public static final SharedPreferences access$getSharedPreferences$p(ApiClientRepository apiclientrepository)
	{
		return apiclientrepository.getSharedPreferences();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method SharedPreferences getSharedPreferences()>
	//    2    4:areturn         
	}

*/
}
