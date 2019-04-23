// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import io.radar.sdk.Radar;
import io.radar.sdk.util.PermissionsHelper;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.internal:
//			RadarInitProvider

public final class RadarInitProvider$RadarLifecycleCallbacks
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

	public RadarInitProvider$RadarLifecycleCallbacks(Context context)
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
