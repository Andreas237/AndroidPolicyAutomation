// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.annotation.Annotation;

public final class ConnectivityManagerCompat
{
	public static interface RestrictBackgroundStatus
		extends Annotation
	{
	}


	public static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return connectivitymanager.isActiveNetworkMetered();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #24  <Method boolean ConnectivityManager.isActiveNetworkMetered()>
	//    5   12:ireturn         
		connectivitymanager = ((ConnectivityManager) (connectivitymanager.getActiveNetworkInfo()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #28  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    8   17:astore_0        
		if(connectivitymanager == null)
	//*   9   18:aload_0         
	//*  10   19:ifnonnull       24
			return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
		switch(((NetworkInfo) (connectivitymanager)).getType())
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #34  <Method int NetworkInfo.getType()>
		{
	//*  15   28:tableswitch     0 9: default 84
	//	               0 88
	//	               1 86
	//	               2 88
	//	               3 88
	//	               4 88
	//	               5 88
	//	               6 88
	//	               7 86
	//	               8 84
	//	               9 86
		case 8: // '\b'
		default:
			return true;
	//   16   84:iconst_1        
	//   17   85:ireturn         

		case 1: // '\001'
		case 7: // '\007'
		case 9: // '\t'
			return false;
	//   18   86:iconst_0        
	//   19   87:ireturn         

		case 0: // '\0'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			return true;
	//   20   88:iconst_1        
	//   21   89:ireturn         
		}
	}
}
