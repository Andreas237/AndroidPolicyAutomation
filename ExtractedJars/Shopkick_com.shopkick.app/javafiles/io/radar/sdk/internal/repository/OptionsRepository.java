// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal.repository;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.internal.repository:
//			BaseRepository

public final class OptionsRepository extends BaseRepository
{
	public static final class Companion
	{

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
		//    1    1:invokespecial   #39  <Method void OptionsRepository$Companion()>
		//    2    4:return          
		}
	}


	public OptionsRepository(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #110 <String "context">
	//    2    3:invokestatic    #116 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #118 <Method void BaseRepository(Context)>
	//    6   11:return          
	}

	public final boolean getBackgroundTracking$sdk_release()
	{
		return getSharedPreferences().getBoolean("background_tracking", false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #71  <String "background_tracking">
	//    3    6:iconst_0        
	//    4    7:invokeinterface #130 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	public final boolean getDebug$sdk_release()
	{
		return getSharedPreferences().getBoolean("debug_mode", false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #75  <String "debug_mode">
	//    3    6:iconst_0        
	//    4    7:invokeinterface #130 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	public final int getDwellDelay$sdk_release()
	{
		return getSharedPreferences().getInt("dwell_delay", (int)150000D);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #78  <String "dwell_delay">
	//    3    6:ldc2w           #131 <Double 150000D>
	//    4    9:d2i             
	//    5   10:invokeinterface #136 <Method int SharedPreferences.getInt(String, int)>
	//    6   15:ireturn         
	}

	public final boolean getForegroundTracking$sdk_release()
	{
		return getSharedPreferences().getBoolean("foreground_tracking", false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #81  <String "foreground_tracking">
	//    3    6:iconst_0        
	//    4    7:invokeinterface #130 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	public final io.radar.sdk.Radar.RadarTrackingOffline getOfflineMode$sdk_release()
	{
		return io.radar.sdk.Radar.RadarTrackingOffline.Companion.fromInt(getSharedPreferences().getInt("offline_mode", 0));
	//    0    0:getstatic       #141 <Field io.radar.sdk.Radar$RadarTrackingOffline$Companion io.radar.sdk.Radar$RadarTrackingOffline.Companion>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    3    7:ldc1            #84  <String "offline_mode">
	//    4    9:iconst_0        
	//    5   10:invokeinterface #136 <Method int SharedPreferences.getInt(String, int)>
	//    6   15:invokevirtual   #147 <Method io.radar.sdk.Radar$RadarTrackingOffline io.radar.sdk.Radar$RadarTrackingOffline$Companion.fromInt(int)>
	//    7   18:areturn         
	}

	public final io.radar.sdk.Radar.RadarPlacesProvider getPlacesProvider$sdk_release()
	{
		String s = getSharedPreferences().getString("places_provider", "none");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #87  <String "places_provider">
	//    3    6:ldc1            #99  <String "none">
	//    4    8:invokeinterface #152 <Method String SharedPreferences.getString(String, String)>
	//    5   13:astore_1        
		if(s != null && s.hashCode() == 0x1da19ac6 && s.equals("facebook"))
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       21
	//*   8   18:goto            46
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #157 <Method int String.hashCode()>
	//*  11   25:ldc1            #158 <Int 0x1da19ac6>
	//*  12   27:icmpeq          33
	//*  13   30:goto            46
	//*  14   33:aload_1         
	//*  15   34:ldc1            #96  <String "facebook">
	//*  16   36:invokevirtual   #162 <Method boolean String.equals(Object)>
	//*  17   39:ifeq            46
			return io.radar.sdk.Radar.RadarPlacesProvider.FACEBOOK;
	//   18   42:getstatic       #167 <Field io.radar.sdk.Radar$RadarPlacesProvider io.radar.sdk.Radar$RadarPlacesProvider.FACEBOOK>
	//   19   45:areturn         
		else
			return io.radar.sdk.Radar.RadarPlacesProvider.NONE;
	//   20   46:getstatic       #170 <Field io.radar.sdk.Radar$RadarPlacesProvider io.radar.sdk.Radar$RadarPlacesProvider.NONE>
	//   21   49:areturn         
	}

	public final io.radar.sdk.Radar.RadarTrackingSync getSyncMode$sdk_release()
	{
		return io.radar.sdk.Radar.RadarTrackingSync.Companion.fromInt(getSharedPreferences().getInt("sync_mode", 0));
	//    0    0:getstatic       #175 <Field io.radar.sdk.Radar$RadarTrackingSync$Companion io.radar.sdk.Radar$RadarTrackingSync.Companion>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    3    7:ldc1            #90  <String "sync_mode">
	//    4    9:iconst_0        
	//    5   10:invokeinterface #136 <Method int SharedPreferences.getInt(String, int)>
	//    6   15:invokevirtual   #180 <Method io.radar.sdk.Radar$RadarTrackingSync io.radar.sdk.Radar$RadarTrackingSync$Companion.fromInt(int)>
	//    7   18:areturn         
	}

	public final long getUpdateInterval$sdk_release()
	{
		return getSharedPreferences().getLong("update_interval", 0x57e40L);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #93  <String "update_interval">
	//    3    6:ldc2w           #181 <Long 0x57e40L>
	//    4    9:invokeinterface #186 <Method long SharedPreferences.getLong(String, long)>
	//    5   14:lreturn         
	}

	public final void setBackgroundTracking$sdk_release(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #192 <String "editor">
	//    6   13:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putBoolean("background_tracking", flag);
	//    7   16:aload_2         
	//    8   17:ldc1            #71  <String "background_tracking">
	//    9   19:iload_1         
	//   10   20:invokeinterface #201 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setDebug$sdk_release(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #192 <String "editor">
	//    6   13:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putBoolean("debug_mode", flag);
	//    7   16:aload_2         
	//    8   17:ldc1            #75  <String "debug_mode">
	//    9   19:iload_1         
	//   10   20:invokeinterface #201 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setDwellDelay$sdk_release(int i)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #192 <String "editor">
	//    6   13:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putInt("dwell_delay", i);
	//    7   16:aload_2         
	//    8   17:ldc1            #78  <String "dwell_delay">
	//    9   19:iload_1         
	//   10   20:invokeinterface #208 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setForegroundTracking$sdk_release(boolean flag)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_2         
	//    5   11:ldc1            #192 <String "editor">
	//    6   13:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putBoolean("foreground_tracking", flag);
	//    7   16:aload_2         
	//    8   17:ldc1            #81  <String "foreground_tracking">
	//    9   19:iload_1         
	//   10   20:invokeinterface #201 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_2         
	//   13   27:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public final void setOfflineMode$sdk_release(io.radar.sdk.Radar.RadarTrackingOffline radartrackingoffline)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radartrackingoffline)), "value");
	//    0    0:aload_1         
	//    1    1:ldc1            #209 <String "value">
	//    2    3:invokestatic    #116 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    5   10:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   15:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    7   16:aload_2         
	//    8   17:ldc1            #192 <String "editor">
	//    9   19:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putInt("offline_mode", radartrackingoffline.getMode$sdk_release());
	//   10   22:aload_2         
	//   11   23:ldc1            #84  <String "offline_mode">
	//   12   25:aload_1         
	//   13   26:invokevirtual   #212 <Method int io.radar.sdk.Radar$RadarTrackingOffline.getMode$sdk_release()>
	//   14   29:invokeinterface #208 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   15   34:pop             
		editor.apply();
	//   16   35:aload_2         
	//   17   36:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   18   41:return          
	}

	public final void setPlacesProvider$sdk_release(io.radar.sdk.Radar.RadarPlacesProvider radarplacesprovider)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarplacesprovider)), "value");
	//    0    0:aload_1         
	//    1    1:ldc1            #209 <String "value">
	//    2    3:invokestatic    #116 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    5   10:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   15:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    7   16:aload_2         
	//    8   17:ldc1            #192 <String "editor">
	//    9   19:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		if(radarplacesprovider == io.radar.sdk.Radar.RadarPlacesProvider.FACEBOOK)
	//*  10   22:aload_1         
	//*  11   23:getstatic       #167 <Field io.radar.sdk.Radar$RadarPlacesProvider io.radar.sdk.Radar$RadarPlacesProvider.FACEBOOK>
	//*  12   26:if_acmpne       35
			radarplacesprovider = "facebook";
	//   13   29:ldc1            #96  <String "facebook">
	//   14   31:astore_1        
		else
	//*  15   32:goto            38
			radarplacesprovider = "none";
	//   16   35:ldc1            #99  <String "none">
	//   17   37:astore_1        
		editor.putString("places_provider", ((String) (radarplacesprovider)));
	//   18   38:aload_2         
	//   19   39:ldc1            #87  <String "places_provider">
	//   20   41:aload_1         
	//   21   42:invokeinterface #216 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   22   47:pop             
		editor.apply();
	//   23   48:aload_2         
	//   24   49:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   25   54:return          
	}

	public final void setSyncMode$sdk_release(io.radar.sdk.Radar.RadarTrackingSync radartrackingsync)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radartrackingsync)), "value");
	//    0    0:aload_1         
	//    1    1:ldc1            #209 <String "value">
	//    2    3:invokestatic    #116 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    5   10:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   15:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    7   16:aload_2         
	//    8   17:ldc1            #192 <String "editor">
	//    9   19:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putInt("sync_mode", radartrackingsync.getMode$sdk_release());
	//   10   22:aload_2         
	//   11   23:ldc1            #90  <String "sync_mode">
	//   12   25:aload_1         
	//   13   26:invokevirtual   #217 <Method int io.radar.sdk.Radar$RadarTrackingSync.getMode$sdk_release()>
	//   14   29:invokeinterface #208 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   15   34:pop             
		editor.apply();
	//   16   35:aload_2         
	//   17   36:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   18   41:return          
	}

	public final void setUpdateInterval$sdk_release(long l)
	{
		android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method SharedPreferences getSharedPreferences()>
	//    2    4:invokeinterface #190 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_3        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    4   10:aload_3         
	//    5   11:ldc1            #192 <String "editor">
	//    6   13:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putLong("update_interval", l);
	//    7   16:aload_3         
	//    8   17:ldc1            #93  <String "update_interval">
	//    9   19:lload_1         
	//   10   20:invokeinterface #221 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   11   25:pop             
		editor.apply();
	//   12   26:aload_3         
	//   13   27:invokeinterface #204 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   32:return          
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String KEY_BACKGROUND_TRACKING = "background_tracking";
	public static final String KEY_DEBUG_MODE = "debug_mode";
	public static final String KEY_DWELL_DELAY = "dwell_delay";
	public static final String KEY_FOREGROUND_TRACKING = "foreground_tracking";
	public static final String KEY_OFFLINE_MODE = "offline_mode";
	public static final String KEY_PLACES_PROVIDER = "places_provider";
	public static final String KEY_SYNC_MODE = "sync_mode";
	public static final String KEY_UPDATE_INTERVAL = "update_interval";
	public static final String PROVIDER_FACEBOOK = "facebook";
	public static final String PROVIDER_NONE = "none";

	static 
	{
	//    0    0:new             #6   <Class OptionsRepository$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #105 <Method void OptionsRepository$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #107 <Field OptionsRepository$Companion Companion>
	//*   5   11:return          
	}
}
