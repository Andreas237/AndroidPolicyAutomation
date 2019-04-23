// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.util;

import android.content.Context;
import android.os.Process;
import kotlin.jvm.internal.Intrinsics;

public final class PermissionsHelper
{

	private PermissionsHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public final boolean check(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #34  <String "context">
	//    2    3:invokestatic    #40  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0;
	//    3    6:aload_1         
	//    4    7:ldc1            #42  <String "android.permission.ACCESS_FINE_LOCATION">
	//    5    9:invokestatic    #48  <Method int Process.myPid()>
	//    6   12:invokestatic    #51  <Method int Process.myUid()>
	//    7   15:invokevirtual   #57  <Method int Context.checkPermission(String, int, int)>
	//    8   18:ifne            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public static final PermissionsHelper INSTANCE = new PermissionsHelper();

	static 
	{
	//    0    0:new             #2   <Class PermissionsHelper>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void PermissionsHelper()>
	//    3    7:putstatic       #29  <Field PermissionsHelper INSTANCE>
	//*   4   10:return          
	}
}
