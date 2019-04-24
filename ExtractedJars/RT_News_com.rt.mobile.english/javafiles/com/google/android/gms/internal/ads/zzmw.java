// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmx, zzaml

public final class zzmw
{

	public zzmw(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		Preconditions.checkNotNull(((Object) (context)), "Context can not be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #14  <String "Context can not be null">
	//    4    7:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		mContext = context;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #22  <Field Context mContext>
	//    9   16:return          
	}

	private final boolean zza(Intent intent)
	{
		Preconditions.checkNotNull(((Object) (intent)), "Intent can not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #27  <String "Intent can not be null">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		return !mContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
	//    4    7:aload_0         
	//    5    8:getfield        #22  <Field Context mContext>
	//    6   11:invokevirtual   #33  <Method PackageManager Context.getPackageManager()>
	//    7   14:aload_1         
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #39  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   10   19:invokeinterface #45  <Method boolean List.isEmpty()>
	//   11   24:ifne            29
	//   12   27:iconst_1        
	//   13   28:ireturn         
	//   14   29:iconst_0        
	//   15   30:ireturn         
	}

	public final boolean zziw()
	{
		Intent intent = new Intent("android.intent.action.DIAL");
	//    0    0:new             #48  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #50  <String "android.intent.action.DIAL">
	//    3    6:invokespecial   #53  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setData(Uri.parse("tel:"));
	//    5   10:aload_1         
	//    6   11:ldc1            #55  <String "tel:">
	//    7   13:invokestatic    #61  <Method Uri Uri.parse(String)>
	//    8   16:invokevirtual   #65  <Method Intent Intent.setData(Uri)>
	//    9   19:pop             
		return zza(intent);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #67  <Method boolean zza(Intent)>
	//   13   25:ireturn         
	}

	public final boolean zzix()
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #48  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #70  <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #53  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setData(Uri.parse("sms:"));
	//    5   10:aload_1         
	//    6   11:ldc1            #72  <String "sms:">
	//    7   13:invokestatic    #61  <Method Uri Uri.parse(String)>
	//    8   16:invokevirtual   #65  <Method Intent Intent.setData(Uri)>
	//    9   19:pop             
		return zza(intent);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #67  <Method boolean zza(Intent)>
	//   13   25:ireturn         
	}

	public final boolean zziy()
	{
		return ((Boolean)zzaml.zza(mContext, ((java.util.concurrent.Callable) (new zzmx())))).booleanValue() && Wrappers.packageManager(mContext).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:new             #75  <Class zzmx>
	//    3    7:dup             
	//    4    8:invokespecial   #76  <Method void zzmx()>
	//    5   11:invokestatic    #81  <Method Object zzaml.zza(Context, java.util.concurrent.Callable)>
	//    6   14:checkcast       #83  <Class Boolean>
	//    7   17:invokevirtual   #86  <Method boolean Boolean.booleanValue()>
	//    8   20:ifeq            40
	//    9   23:aload_0         
	//   10   24:getfield        #22  <Field Context mContext>
	//   11   27:invokestatic    #92  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   12   30:ldc1            #94  <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//   13   32:invokevirtual   #100 <Method int PackageManagerWrapper.checkCallingOrSelfPermission(String)>
	//   14   35:ifne            40
	//   15   38:iconst_1        
	//   16   39:ireturn         
	//   17   40:iconst_0        
	//   18   41:ireturn         
	}

	public final boolean zziz()
	{
		return zza((new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.dir/event"));
	//    0    0:aload_0         
	//    1    1:new             #48  <Class Intent>
	//    2    4:dup             
	//    3    5:ldc1            #106 <String "android.intent.action.INSERT">
	//    4    7:invokespecial   #53  <Method void Intent(String)>
	//    5   10:ldc1            #108 <String "vnd.android.cursor.dir/event">
	//    6   12:invokevirtual   #112 <Method Intent Intent.setType(String)>
	//    7   15:invokespecial   #67  <Method boolean zza(Intent)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private final Context mContext;
}
