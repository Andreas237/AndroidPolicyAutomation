// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.b.b;
import com.google.android.gms.common.b.c;
import com.google.android.gms.common.internal.am;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bzm, zm

public final class bzl
{

	public bzl(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		am.a(((Object) (context)), "Context can not be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #14  <String "Context can not be null">
	//    4    7:invokestatic    #19  <Method Object am.a(Object, Object)>
	//    5   10:pop             
		a = context;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #21  <Field Context a>
	//    9   16:return          
	}

	private final boolean a(Intent intent)
	{
		am.a(((Object) (intent)), "Intent can not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #25  <String "Intent can not be null">
	//    2    3:invokestatic    #19  <Method Object am.a(Object, Object)>
	//    3    6:pop             
		return !a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
	//    4    7:aload_0         
	//    5    8:getfield        #21  <Field Context a>
	//    6   11:invokevirtual   #31  <Method PackageManager Context.getPackageManager()>
	//    7   14:aload_1         
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #37  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   10   19:invokeinterface #43  <Method boolean List.isEmpty()>
	//   11   24:ifne            29
	//   12   27:iconst_1        
	//   13   28:ireturn         
	//   14   29:iconst_0        
	//   15   30:ireturn         
	}

	public final boolean a()
	{
		Intent intent = new Intent("android.intent.action.DIAL");
	//    0    0:new             #45  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #47  <String "android.intent.action.DIAL">
	//    3    6:invokespecial   #50  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setData(Uri.parse("tel:"));
	//    5   10:aload_1         
	//    6   11:ldc1            #52  <String "tel:">
	//    7   13:invokestatic    #58  <Method Uri Uri.parse(String)>
	//    8   16:invokevirtual   #62  <Method Intent Intent.setData(Uri)>
	//    9   19:pop             
		return a(intent);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #64  <Method boolean a(Intent)>
	//   13   25:ireturn         
	}

	public final boolean b()
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #45  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #50  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setData(Uri.parse("sms:"));
	//    5   10:aload_1         
	//    6   11:ldc1            #69  <String "sms:">
	//    7   13:invokestatic    #58  <Method Uri Uri.parse(String)>
	//    8   16:invokevirtual   #62  <Method Intent Intent.setData(Uri)>
	//    9   19:pop             
		return a(intent);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #64  <Method boolean a(Intent)>
	//   13   25:ireturn         
	}

	public final boolean c()
	{
		return ((Boolean)zm.a(a, ((java.util.concurrent.Callable) (new bzm())))).booleanValue() && com.google.android.gms.common.b.c.a(a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context a>
	//    2    4:new             #72  <Class bzm>
	//    3    7:dup             
	//    4    8:invokespecial   #73  <Method void bzm()>
	//    5   11:invokestatic    #78  <Method Object zm.a(Context, java.util.concurrent.Callable)>
	//    6   14:checkcast       #80  <Class Boolean>
	//    7   17:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//    8   20:ifeq            40
	//    9   23:aload_0         
	//   10   24:getfield        #21  <Field Context a>
	//   11   27:invokestatic    #88  <Method b c.a(Context)>
	//   12   30:ldc1            #90  <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//   13   32:invokevirtual   #95  <Method int b.a(String)>
	//   14   35:ifne            40
	//   15   38:iconst_1        
	//   16   39:ireturn         
	//   17   40:iconst_0        
	//   18   41:ireturn         
	}

	public final boolean d()
	{
		return a((new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.dir/event"));
	//    0    0:aload_0         
	//    1    1:new             #45  <Class Intent>
	//    2    4:dup             
	//    3    5:ldc1            #101 <String "android.intent.action.INSERT">
	//    4    7:invokespecial   #50  <Method void Intent(String)>
	//    5   10:ldc1            #103 <String "vnd.android.cursor.dir/event">
	//    6   12:invokevirtual   #107 <Method Intent Intent.setType(String)>
	//    7   15:invokespecial   #64  <Method boolean a(Intent)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private final Context a;
}
