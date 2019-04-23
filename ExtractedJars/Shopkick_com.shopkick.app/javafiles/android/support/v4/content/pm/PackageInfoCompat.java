// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.pm.PackageInfo;

public final class PackageInfoCompat
{

	private PackageInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static long getLongVersionCode(PackageInfo packageinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return packageinfo.getLongVersionCode();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #23  <Method long PackageInfo.getLongVersionCode()>
	//    5   12:lreturn         
		else
			return (long)packageinfo.versionCode;
	//    6   13:aload_0         
	//    7   14:getfield        #26  <Field int PackageInfo.versionCode>
	//    8   17:i2l             
	//    9   18:lreturn         
	}
}
