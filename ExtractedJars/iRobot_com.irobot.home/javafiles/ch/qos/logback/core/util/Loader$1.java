// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

// Referenced classes of package ch.qos.logback.core.util:
//			Loader

static final class Loader$1
	implements PrivilegedAction
{

	public Boolean run()
	{
		SecurityException securityexception;
		try
		{
			AccessController.checkPermission(((java.security.Permission) (new RuntimePermission("getClassLoader"))));
	//    0    0:new             #20  <Class RuntimePermission>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "getClassLoader">
	//    3    6:invokespecial   #25  <Method void RuntimePermission(String)>
	//    4    9:invokestatic    #31  <Method void AccessController.checkPermission(java.security.Permission)>
		}
	//*   5   12:iconst_1        
	//*   6   13:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
	//*   7   16:areturn         
	//*   8   17:iconst_0        
	//*   9   18:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
	//*  10   21:areturn         
		// Misplaced declaration of an exception variable
		catch(SecurityException securityexception)
		{
			return Boolean.valueOf(false);
		}
		return Boolean.valueOf(true);
	//*  11   22:astore_1        
	//*  12   23:goto            17
	}

	public volatile Object run()
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method Boolean run()>
	//    2    4:areturn         
	}

	Loader$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
