// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.*;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import io.radar.sdk.Radar;
import io.radar.sdk.di.*;
import io.radar.sdk.util.PermissionsHelper;
import kotlin.jvm.internal.Intrinsics;

public final class RadarInitProvider extends ContentProvider
{
	public final class RadarLifecycleCallbacks
		implements android.app.Application.ActivityLifecycleCallbacks
	{

		public void onActivityCreated(Activity activity, Bundle bundle)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (activity)), "activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #76  <String "activity">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		//    3    6:return          
		}

		public void onActivityDestroyed(Activity activity)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (activity)), "activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #76  <String "activity">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		//    3    6:return          
		}

		public void onActivityPaused(Activity activity)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (activity)), "activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #76  <String "activity">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		//    3    6:return          
		}

		public void onActivityResumed(Activity activity)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (activity)), "activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #76  <String "activity">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			if(!hasPermissions && PermissionsHelper.INSTANCE.check((Context)activity))
		//*   3    6:aload_0         
		//*   4    7:getfield        #69  <Field boolean hasPermissions>
		//*   5   10:ifne            40
		//*   6   13:getstatic       #63  <Field PermissionsHelper PermissionsHelper.INSTANCE>
		//*   7   16:aload_1         
		//*   8   17:checkcast       #79  <Class Context>
		//*   9   20:invokevirtual   #67  <Method boolean PermissionsHelper.check(Context)>
		//*  10   23:ifeq            40
			{
				Radar.requestLocation$sdk_release$default(Radar.INSTANCE, false, 1, ((Object) (null)));
		//   11   26:getstatic       #84  <Field Radar Radar.INSTANCE>
		//   12   29:iconst_0        
		//   13   30:iconst_1        
		//   14   31:aconst_null     
		//   15   32:invokestatic    #88  <Method void Radar.requestLocation$sdk_release$default(Radar, boolean, int, Object)>
				hasPermissions = true;
		//   16   35:aload_0         
		//   17   36:iconst_1        
		//   18   37:putfield        #69  <Field boolean hasPermissions>
			}
		//   19   40:return          
		}

		public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (activity)), "activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #76  <String "activity">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		//    3    6:return          
		}

		public void onActivityStarted(Activity activity)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (activity)), "activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #76  <String "activity">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		//    3    6:return          
		}

		public void onActivityStopped(Activity activity)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (activity)), "activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #76  <String "activity">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		//    3    6:return          
		}

		private boolean hasPermissions;
		final RadarInitProvider this$0;

		public RadarLifecycleCallbacks(Context context)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
		//    0    0:aload_2         
		//    1    1:ldc1            #46  <String "context">
		//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			this$0 = RadarInitProvider.this;
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:putfield        #54  <Field RadarInitProvider this$0>
			super();
		//    6   11:aload_0         
		//    7   12:invokespecial   #57  <Method void Object()>
			hasPermissions = PermissionsHelper.INSTANCE.check(context);
		//    8   15:aload_0         
		//    9   16:getstatic       #63  <Field PermissionsHelper PermissionsHelper.INSTANCE>
		//   10   19:aload_2         
		//   11   20:invokevirtual   #67  <Method boolean PermissionsHelper.check(Context)>
		//   12   23:putfield        #69  <Field boolean hasPermissions>
		//   13   26:return          
		}
	}


	public RadarInitProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void ContentProvider()>
	//    2    4:return          
	}

	public int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onCreate()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Context getContext()>
	//    2    4:astore_1        
		if(context != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          84
		{
			Context context1 = context.getApplicationContext();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #60  <Method Context Context.getApplicationContext()>
	//    7   13:astore_2        
			if(context1 != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          84
			{
				DaggerRadarComponent.builder().coreModule(new CoreModule(context1)).build().inject(Radar.INSTANCE);
	//   10   18:invokestatic    #66  <Method io.radar.sdk.di.DaggerRadarComponent$Builder DaggerRadarComponent.builder()>
	//   11   21:new             #68  <Class CoreModule>
	//   12   24:dup             
	//   13   25:aload_2         
	//   14   26:invokespecial   #71  <Method void CoreModule(Context)>
	//   15   29:invokevirtual   #77  <Method io.radar.sdk.di.DaggerRadarComponent$Builder io.radar.sdk.di.DaggerRadarComponent$Builder.coreModule(CoreModule)>
	//   16   32:invokevirtual   #81  <Method RadarComponent io.radar.sdk.di.DaggerRadarComponent$Builder.build()>
	//   17   35:getstatic       #87  <Field Radar Radar.INSTANCE>
	//   18   38:invokeinterface #93  <Method void RadarComponent.inject(Radar)>
				Object obj = ((Object) (context1));
	//   19   43:aload_2         
	//   20   44:astore_1        
				if(!(context1 instanceof Application))
	//*  21   45:aload_2         
	//*  22   46:instanceof      #95  <Class Application>
	//*  23   49:ifne            54
					obj = null;
	//   24   52:aconst_null     
	//   25   53:astore_1        
				obj = ((Object) ((Application)obj));
	//   26   54:aload_1         
	//   27   55:checkcast       #95  <Class Application>
	//   28   58:astore_1        
				if(obj != null)
	//*  29   59:aload_1         
	//*  30   60:ifnull          82
					((Application) (obj)).registerActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks)new RadarLifecycleCallbacks((Context)obj));
	//   31   63:aload_1         
	//   32   64:new             #6   <Class RadarInitProvider$RadarLifecycleCallbacks>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:checkcast       #57  <Class Context>
	//   37   73:invokespecial   #98  <Method void RadarInitProvider$RadarLifecycleCallbacks(RadarInitProvider, Context)>
	//   38   76:checkcast       #100 <Class android.app.Application$ActivityLifecycleCallbacks>
	//   39   79:invokevirtual   #104 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
				return false;
	//   40   82:iconst_0        
	//   41   83:ireturn         
			}
		}
		return false;
	//   42   84:iconst_0        
	//   43   85:ireturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
