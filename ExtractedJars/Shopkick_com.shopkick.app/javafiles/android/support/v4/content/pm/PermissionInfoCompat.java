// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.pm.PermissionInfo;
import java.lang.annotation.Annotation;

public final class PermissionInfoCompat
{
	public static interface Protection
		extends Annotation
	{
	}

	public static interface ProtectionFlags
		extends Annotation
	{
	}


	private PermissionInfoCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static int getProtection(PermissionInfo permissioninfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return permissioninfo.getProtection();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #32  <Method int PermissionInfo.getProtection()>
	//    5   12:ireturn         
		else
			return permissioninfo.protectionLevel & 0xf;
	//    6   13:aload_0         
	//    7   14:getfield        #35  <Field int PermissionInfo.protectionLevel>
	//    8   17:bipush          15
	//    9   19:iand            
	//   10   20:ireturn         
	}

	public static int getProtectionFlags(PermissionInfo permissioninfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return permissioninfo.getProtectionFlags();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #40  <Method int PermissionInfo.getProtectionFlags()>
	//    5   12:ireturn         
		else
			return permissioninfo.protectionLevel & 0xfffffff0;
	//    6   13:aload_0         
	//    7   14:getfield        #35  <Field int PermissionInfo.protectionLevel>
	//    8   17:bipush          -16
	//    9   19:iand            
	//   10   20:ireturn         
	}
}
