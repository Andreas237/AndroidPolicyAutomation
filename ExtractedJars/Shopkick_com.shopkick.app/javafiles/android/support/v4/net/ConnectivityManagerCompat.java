// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.annotation.Annotation;

public final class ConnectivityManagerCompat
{
	public static interface RestrictBackgroundStatus
		extends Annotation
	{
	}


	private ConnectivityManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static NetworkInfo getNetworkInfoFromBroadcast(ConnectivityManager connectivitymanager, Intent intent)
	{
		intent = ((Intent) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
	//    0    0:aload_1         
	//    1    1:ldc1            #28  <String "networkInfo">
	//    2    3:invokevirtual   #34  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    3    6:checkcast       #36  <Class NetworkInfo>
	//    4    9:astore_1        
		if(intent != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          23
			return connectivitymanager.getNetworkInfo(((NetworkInfo) (intent)).getType());
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #40  <Method int NetworkInfo.getType()>
	//   10   19:invokevirtual   #46  <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//   11   22:areturn         
		else
			return null;
	//   12   23:aconst_null     
	//   13   24:areturn         
	}

	public static int getRestrictBackgroundStatus(ConnectivityManager connectivitymanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return connectivitymanager.getRestrictBackgroundStatus();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #57  <Method int ConnectivityManager.getRestrictBackgroundStatus()>
	//    5   12:ireturn         
		else
			return 3;
	//    6   13:iconst_3        
	//    7   14:ireturn         
	}

	public static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return connectivitymanager.isActiveNetworkMetered();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #62  <Method boolean ConnectivityManager.isActiveNetworkMetered()>
	//    5   12:ireturn         
		connectivitymanager = ((ConnectivityManager) (connectivitymanager.getActiveNetworkInfo()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #66  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    8   17:astore_0        
		if(connectivitymanager == null)
	//*   9   18:aload_0         
	//*  10   19:ifnonnull       24
			return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
		switch(((NetworkInfo) (connectivitymanager)).getType())
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #40  <Method int NetworkInfo.getType()>
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

	public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
	public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
	public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;
}
