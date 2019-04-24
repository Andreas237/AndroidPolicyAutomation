// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.content.Context;

// Referenced classes of package android.support.v4.os:
//			BuildCompat, UserManagerCompatApi24

public class UserManagerCompat
{

	private UserManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isUserUnlocked(Context context)
	{
		if(BuildCompat.isAtLeastN())
	//*   0    0:invokestatic    #17  <Method boolean BuildCompat.isAtLeastN()>
	//*   1    3:ifeq            11
			return UserManagerCompatApi24.isUserUnlocked(context);
	//    2    6:aload_0         
	//    3    7:invokestatic    #21  <Method boolean UserManagerCompatApi24.isUserUnlocked(Context)>
	//    4   10:ireturn         
		else
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
	}
}
