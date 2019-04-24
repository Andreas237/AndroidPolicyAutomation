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
		if(connectivitymanager == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		switch(((NetworkInfo) (connectivitymanager)).getType())
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #30  <Method int NetworkInfo.getType()>
		{
	//*   9   15:tableswitch     0 9: default 68
	//	               0 71
	//	               1 73
	//	               2 71
	//	               3 71
	//	               4 71
	//	               5 71
	//	               6 71
	//	               7 73
	//	               8 75
	//	               9 73
	//*  10   68:goto            75
		case 0: // '\0'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			return true;
	//   11   71:iconst_1        
	//   12   72:ireturn         

		case 1: // '\001'
		case 7: // '\007'
		case 9: // '\t'
			return false;
	//   13   73:iconst_0        
	//   14   74:ireturn         
		}
		return true;
	//   15   75:iconst_1        
	//   16   76:ireturn         
	}

	ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
