// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

public final class RadarLogger
{

	private RadarLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	public static void d$default(RadarLogger radarlogger, String s, Throwable throwable, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #49  <Class Throwable>
	//    6   10:astore_2        
		radarlogger.d(s, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #52  <Method void d(String, Throwable)>
	//   11   17:return          
	}

	public static void e$default(RadarLogger radarlogger, String s, Throwable throwable, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #49  <Class Throwable>
	//    6   10:astore_2        
		radarlogger.e(s, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #55  <Method void e(String, Throwable)>
	//   11   17:return          
	}

	public static void i$default(RadarLogger radarlogger, String s, Throwable throwable, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #49  <Class Throwable>
	//    6   10:astore_2        
		radarlogger.i(s, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #58  <Method void i(String, Throwable)>
	//   11   17:return          
	}

	public static void v$default(RadarLogger radarlogger, String s, Throwable throwable, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #49  <Class Throwable>
	//    6   10:astore_2        
		radarlogger.v(s, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #61  <Method void v(String, Throwable)>
	//   11   17:return          
	}

	public static void w$default(RadarLogger radarlogger, String s, Throwable throwable, int j, Object obj)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			throwable = (Throwable)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #49  <Class Throwable>
	//    6   10:astore_2        
		radarlogger.w(s, throwable);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #64  <Method void w(String, Throwable)>
	//   11   17:return          
	}

	public final void d(String s, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "message");
	//    0    0:aload_1         
	//    1    1:ldc1            #67  <String "message">
	//    2    3:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(DEBUG)
	//*   3    6:getstatic       #75  <Field boolean DEBUG>
	//*   4    9:ifeq            20
			Log.d("RadarLogger", s, throwable);
	//    5   12:ldc1            #37  <String "RadarLogger">
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #80  <Method int Log.d(String, String, Throwable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final void e(String s, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "message");
	//    0    0:aload_1         
	//    1    1:ldc1            #67  <String "message">
	//    2    3:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(DEBUG)
	//*   3    6:getstatic       #75  <Field boolean DEBUG>
	//*   4    9:ifeq            20
			Log.e("RadarLogger", s, throwable);
	//    5   12:ldc1            #37  <String "RadarLogger">
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #83  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final boolean getDEBUG()
	{
		return DEBUG;
	//    0    0:getstatic       #75  <Field boolean DEBUG>
	//    1    3:ireturn         
	}

	public final void i(String s, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "message");
	//    0    0:aload_1         
	//    1    1:ldc1            #67  <String "message">
	//    2    3:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(DEBUG)
	//*   3    6:getstatic       #75  <Field boolean DEBUG>
	//*   4    9:ifeq            20
			Log.i("RadarLogger", s, throwable);
	//    5   12:ldc1            #37  <String "RadarLogger">
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #85  <Method int Log.i(String, String, Throwable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final void setDEBUG(boolean flag)
	{
		DEBUG = flag;
	//    0    0:iload_1         
	//    1    1:putstatic       #75  <Field boolean DEBUG>
	//    2    4:return          
	}

	public final void v(String s, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "message");
	//    0    0:aload_1         
	//    1    1:ldc1            #67  <String "message">
	//    2    3:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(DEBUG)
	//*   3    6:getstatic       #75  <Field boolean DEBUG>
	//*   4    9:ifeq            20
			Log.v("RadarLogger", s, throwable);
	//    5   12:ldc1            #37  <String "RadarLogger">
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #87  <Method int Log.v(String, String, Throwable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public final void w(String s, Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "message");
	//    0    0:aload_1         
	//    1    1:ldc1            #67  <String "message">
	//    2    3:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(DEBUG)
	//*   3    6:getstatic       #75  <Field boolean DEBUG>
	//*   4    9:ifeq            20
			Log.w("RadarLogger", s, throwable);
	//    5   12:ldc1            #37  <String "RadarLogger">
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #89  <Method int Log.w(String, String, Throwable)>
	//    9   19:pop             
	//   10   20:return          
	}

	private static boolean DEBUG = false;
	public static final RadarLogger INSTANCE = new RadarLogger();
	private static final String TAG = "RadarLogger";

	static 
	{
	//    0    0:new             #2   <Class RadarLogger>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void RadarLogger()>
	//    3    7:putstatic       #43  <Field RadarLogger INSTANCE>
	//*   4   10:return          
	}
}
