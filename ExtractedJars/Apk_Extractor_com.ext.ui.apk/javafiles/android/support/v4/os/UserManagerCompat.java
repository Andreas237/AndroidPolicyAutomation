// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.content.Context;
import android.os.UserManager;

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
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          21
			return ((UserManager)context.getSystemService(android/os/UserManager)).isUserUnlocked();
	//    3    8:aload_0         
	//    4    9:ldc1            #19  <Class UserManager>
	//    5   11:invokevirtual   #25  <Method Object Context.getSystemService(Class)>
	//    6   14:checkcast       #19  <Class UserManager>
	//    7   17:invokevirtual   #28  <Method boolean UserManager.isUserUnlocked()>
	//    8   20:ireturn         
		else
			return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         
	}
}
