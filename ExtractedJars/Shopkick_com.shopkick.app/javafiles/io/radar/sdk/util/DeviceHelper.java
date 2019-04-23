// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.util;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import java.util.*;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceHelper
{

	private DeviceHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:return          
	}

	public final String getCountry$sdk_release()
	{
		Object obj = ((Object) (Locale.getDefault()));
	//    0    0:invokestatic    #88  <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(obj, "Locale.getDefault()");
	//    2    4:aload_1         
	//    3    5:ldc1            #90  <String "Locale.getDefault()">
	//    4    7:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		obj = ((Object) (((Locale) (obj)).getCountry()));
	//    5   10:aload_1         
	//    6   11:invokevirtual   #93  <Method String Locale.getCountry()>
	//    7   14:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(obj, "Locale.getDefault().country");
	//    8   15:aload_1         
	//    9   16:ldc1            #95  <String "Locale.getDefault().country">
	//   10   18:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((String) (obj));
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	public final String getDeviceId$sdk_release(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #101 <String "context">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		context = ((Context) (android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id")));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #110 <Method android.content.ContentResolver Context.getContentResolver()>
	//    5   10:ldc1            #112 <String "android_id">
	//    6   12:invokestatic    #118 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    7   15:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "Settings.Secure.getStrin\u2026ttings.Secure.ANDROID_ID)");
	//    8   16:aload_1         
	//    9   17:ldc1            #120 <String "Settings.Secure.getStrin\u2026ttings.Secure.ANDROID_ID)">
	//   10   19:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((String) (context));
	//   11   22:aload_1         
	//   12   23:areturn         
	}

	public final String getMake$sdk_release()
	{
		return make;
	//    0    0:getstatic       #64  <Field String make>
	//    1    3:areturn         
	}

	public final String getModel$sdk_release()
	{
		return model;
	//    0    0:getstatic       #71  <Field String model>
	//    1    3:areturn         
	}

	public final String getOs$sdk_release()
	{
		return os;
	//    0    0:getstatic       #80  <Field String os>
	//    1    3:areturn         
	}

	public final int getTimeZoneOffset$sdk_release()
	{
		Object obj = ((Object) (Calendar.getInstance()));
	//    0    0:invokestatic    #127 <Method Calendar Calendar.getInstance()>
	//    1    3:astore_3        
		Intrinsics.checkExpressionValueIsNotNull(obj, "Calendar.getInstance()");
	//    2    4:aload_3         
	//    3    5:ldc1            #129 <String "Calendar.getInstance()">
	//    4    7:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		obj = ((Object) (((Calendar) (obj)).getTimeZone()));
	//    5   10:aload_3         
	//    6   11:invokevirtual   #133 <Method TimeZone Calendar.getTimeZone()>
	//    7   14:astore_3        
		Intrinsics.checkExpressionValueIsNotNull(obj, "timeZone");
	//    8   15:aload_3         
	//    9   16:ldc1            #135 <String "timeZone">
	//   10   18:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		int j = ((TimeZone) (obj)).getRawOffset();
	//   11   21:aload_3         
	//   12   22:invokevirtual   #140 <Method int TimeZone.getRawOffset()>
	//   13   25:istore_2        
		int i = j;
	//   14   26:iload_2         
	//   15   27:istore_1        
		if(((TimeZone) (obj)).inDaylightTime(new Date()))
	//*  16   28:aload_3         
	//*  17   29:new             #142 <Class Date>
	//*  18   32:dup             
	//*  19   33:invokespecial   #143 <Method void Date()>
	//*  20   36:invokevirtual   #147 <Method boolean TimeZone.inDaylightTime(Date)>
	//*  21   39:ifeq            49
			i = j + ((TimeZone) (obj)).getDSTSavings();
	//   22   42:iload_2         
	//   23   43:aload_3         
	//   24   44:invokevirtual   #150 <Method int TimeZone.getDSTSavings()>
	//   25   47:iadd            
	//   26   48:istore_1        
		return i / 1000;
	//   27   49:iload_1         
	//   28   50:sipush          1000
	//   29   53:idiv            
	//   30   54:ireturn         
	}

	public final boolean isLocationOn$sdk_release(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #101 <String "context">
	//    2    3:invokestatic    #104 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		context = ((Context) (context.getSystemService("location")));
	//    3    6:aload_1         
	//    4    7:ldc1            #153 <String "location">
	//    5    9:invokevirtual   #157 <Method Object Context.getSystemService(String)>
	//    6   12:astore_1        
		if(context != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          47
		{
			context = ((Context) ((LocationManager)context));
	//    9   17:aload_1         
	//   10   18:checkcast       #159 <Class LocationManager>
	//   11   21:astore_1        
			return ((LocationManager) (context)).isProviderEnabled("gps") || ((LocationManager) (context)).isProviderEnabled("network");
	//   12   22:aload_1         
	//   13   23:ldc1            #161 <String "gps">
	//   14   25:invokevirtual   #165 <Method boolean LocationManager.isProviderEnabled(String)>
	//   15   28:ifne            45
	//   16   31:aload_1         
	//   17   32:ldc1            #167 <String "network">
	//   18   34:invokevirtual   #165 <Method boolean LocationManager.isProviderEnabled(String)>
	//   19   37:ifeq            43
	//   20   40:goto            45
	//   21   43:iconst_0        
	//   22   44:ireturn         
	//   23   45:iconst_1        
	//   24   46:ireturn         
		} else
		{
			throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
	//   25   47:new             #169 <Class TypeCastException>
	//   26   50:dup             
	//   27   51:ldc1            #171 <String "null cannot be cast to non-null type android.location.LocationManager">
	//   28   53:invokespecial   #174 <Method void TypeCastException(String)>
	//   29   56:athrow          
		}
	}

	public static final DeviceHelper INSTANCE = new DeviceHelper();
	private static final String make;
	private static final String model;
	private static final String os;
	public static final String sdkVersion = "2.1.5";

	static 
	{
	//    0    0:new             #2   <Class DeviceHelper>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void DeviceHelper()>
	//    3    7:putstatic       #49  <Field DeviceHelper INSTANCE>
		String s = Build.MANUFACTURER;
	//    4   10:getstatic       #54  <Field String Build.MANUFACTURER>
	//    5   13:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "Build.MANUFACTURER");
	//    6   14:aload_0         
	//    7   15:ldc1            #56  <String "Build.MANUFACTURER">
	//    8   17:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		make = s;
	//    9   20:aload_0         
	//   10   21:putstatic       #64  <Field String make>
		s = Build.MODEL;
	//   11   24:getstatic       #67  <Field String Build.MODEL>
	//   12   27:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "Build.MODEL");
	//   13   28:aload_0         
	//   14   29:ldc1            #69  <String "Build.MODEL">
	//   15   31:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		model = s;
	//   16   34:aload_0         
	//   17   35:putstatic       #71  <Field String model>
		s = android.os.Build.VERSION.RELEASE;
	//   18   38:getstatic       #76  <Field String android.os.Build$VERSION.RELEASE>
	//   19   41:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "Build.VERSION.RELEASE");
	//   20   42:aload_0         
	//   21   43:ldc1            #78  <String "Build.VERSION.RELEASE">
	//   22   45:invokestatic    #62  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		os = s;
	//   23   48:aload_0         
	//   24   49:putstatic       #80  <Field String os>
	//*  25   52:return          
	}
}
