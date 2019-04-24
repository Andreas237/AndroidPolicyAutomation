// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package android.support.v4.net:
//			ConnectivityManagerCompat

static class ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl
	implements ConnectivityManagerCompat.ConnectivityManagerCompatImpl
{

	public int getRestrictBackgroundStatus(ConnectivityManager connectivitymanager)
	{
		return 3;
	//    0    0:iconst_3        
	//    1    1:ireturn         
	}

	public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
	{
		connectivitymanager = ((ConnectivityManager) (connectivitymanager.getActiveNetworkInfo()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    2    4:astore_1        
		if(connectivitymanager != null) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:ifnonnull       11
_L1:
		return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
_L2:
		switch(((NetworkInfo) (connectivitymanager)).getType())
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #30  <Method int NetworkInfo.getType()>
		{
	//*   9   15:tableswitch     0 9: default 68
	//	               0 9
	//	               1 70
	//	               2 9
	//	               3 9
	//	               4 9
	//	               5 9
	//	               6 9
	//	               7 70
	//	               8 68
	//	               9 70
		case 8: // '\b'
		default:
			return true;
	//   10   68:iconst_1        
	//   11   69:ireturn         

		case 1: // '\001'
		case 7: // '\007'
		case 9: // '\t'
			return false;
	//   12   70:iconst_0        
	//   13   71:ireturn         

		case 0: // '\0'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			break;
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
