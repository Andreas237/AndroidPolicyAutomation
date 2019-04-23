// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

public final class dx
{

	public static boolean a(Context context, Class class1)
	{
		return context.getPackageManager().queryIntentServices((new Intent()).setClass(context, class1), 0x10000).size() > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #12  <Method PackageManager Context.getPackageManager()>
	//    2    4:new             #14  <Class Intent>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void Intent()>
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #22  <Method Intent Intent.setClass(Context, Class)>
	//    8   16:ldc1            #23  <Int 0x10000>
	//    9   18:invokevirtual   #29  <Method List PackageManager.queryIntentServices(Intent, int)>
	//   10   21:invokeinterface #35  <Method int List.size()>
	//   11   26:ifle            31
	//   12   29:iconst_1        
	//   13   30:ireturn         
	//   14   31:iconst_0        
	//   15   32:ireturn         
	}
}
