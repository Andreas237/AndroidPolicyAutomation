// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.content.Context;
import android.os.UserManager;

public class UserManagerCompatApi24
{

	public UserManagerCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isUserUnlocked(Context context)
	{
		return ((UserManager)context.getSystemService(android/os/UserManager)).isUserUnlocked();
	//    0    0:aload_0         
	//    1    1:ldc1            #19  <Class UserManager>
	//    2    3:invokevirtual   #25  <Method Object Context.getSystemService(Class)>
	//    3    6:checkcast       #19  <Class UserManager>
	//    4    9:invokevirtual   #28  <Method boolean UserManager.isUserUnlocked()>
	//    5   12:ireturn         
	}
}
