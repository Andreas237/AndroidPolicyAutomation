// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzco

public final class zzce
{

	public static int version()
	{
		NumberFormatException numberformatexception;
		int i;
		try
		{
			i = Integer.parseInt(android.os.Build.VERSION.SDK);
	//    0    0:getstatic       #14  <Field String android.os.Build$VERSION.SDK>
	//    1    3:invokestatic    #20  <Method int Integer.parseInt(String)>
	//    2    6:istore_0        
		}
	//*   3    7:iload_0         
	//*   4    8:ireturn         
	//*   5    9:ldc1            #22  <String "Invalid version number">
	//*   6   11:getstatic       #14  <Field String android.os.Build$VERSION.SDK>
	//*   7   14:invokestatic    #28  <Method void zzco.zzf(String, Object)>
	//*   8   17:iconst_0        
	//*   9   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			zzco.zzf("Invalid version number", ((Object) (android.os.Build.VERSION.SDK)));
			return 0;
		}
		return i;
	//*  10   19:astore_1        
	//*  11   20:goto            9
	}
}
