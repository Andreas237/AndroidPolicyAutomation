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
	static class ConnectivityManagerCompatApi16Impl extends ConnectivityManagerCompatBaseImpl
	{

		public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
		{
			return connectivitymanager.isActiveNetworkMetered();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method boolean ConnectivityManager.isActiveNetworkMetered()>
		//    2    4:ireturn         
		}

		ConnectivityManagerCompatApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class ConnectivityManagerCompatApi24Impl extends ConnectivityManagerCompatApi16Impl
	{

		public int getRestrictBackgroundStatus(ConnectivityManager connectivitymanager)
		{
			return connectivitymanager.getRestrictBackgroundStatus();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int ConnectivityManager.getRestrictBackgroundStatus()>
		//    2    4:ireturn         
		}

		ConnectivityManagerCompatApi24Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl()>
		//    2    4:return          
		}
	}

	static class ConnectivityManagerCompatBaseImpl
		implements ConnectivityManagerCompatImpl
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
		//		               0 9
		//		               1 70
		//		               2 9
		//		               3 9
		//		               4 9
		//		               5 9
		//		               6 9
		//		               7 70
		//		               8 68
		//		               9 70
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

		ConnectivityManagerCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface ConnectivityManagerCompatImpl
	{

		public abstract int getRestrictBackgroundStatus(ConnectivityManager connectivitymanager);

		public abstract boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager);
	}

	public static interface RestrictBackgroundStatus
		extends Annotation
	{
	}


	private ConnectivityManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static NetworkInfo getNetworkInfoFromBroadcast(ConnectivityManager connectivitymanager, Intent intent)
	{
		intent = ((Intent) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
	//    0    0:aload_1         
	//    1    1:ldc1            #48  <String "networkInfo">
	//    2    3:invokevirtual   #54  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    3    6:checkcast       #56  <Class NetworkInfo>
	//    4    9:astore_1        
		if(intent != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          23
			return connectivitymanager.getNetworkInfo(((NetworkInfo) (intent)).getType());
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #60  <Method int NetworkInfo.getType()>
	//   10   19:invokevirtual   #66  <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//   11   22:areturn         
		else
			return null;
	//   12   23:aconst_null     
	//   13   24:areturn         
	}

	public static int getRestrictBackgroundStatus(ConnectivityManager connectivitymanager)
	{
		return IMPL.getRestrictBackgroundStatus(connectivitymanager);
	//    0    0:getstatic       #40  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #70  <Method int ConnectivityManagerCompat$ConnectivityManagerCompatImpl.getRestrictBackgroundStatus(ConnectivityManager)>
	//    3    9:ireturn         
	}

	public static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
	{
		return IMPL.isActiveNetworkMetered(connectivitymanager);
	//    0    0:getstatic       #40  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #77  <Method boolean ConnectivityManagerCompat$ConnectivityManagerCompatImpl.isActiveNetworkMetered(ConnectivityManager)>
	//    3    9:ireturn         
	}

	private static final ConnectivityManagerCompatImpl IMPL;
	public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
	public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
	public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			IMPL = ((ConnectivityManagerCompatImpl) (new ConnectivityManagerCompatApi24Impl()));
	//    3    8:new             #9   <Class ConnectivityManagerCompat$ConnectivityManagerCompatApi24Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #38  <Method void ConnectivityManagerCompat$ConnectivityManagerCompatApi24Impl()>
	//    6   15:putstatic       #40  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   19:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          16
	//*  10   24:icmplt          38
			IMPL = ((ConnectivityManagerCompatImpl) (new ConnectivityManagerCompatApi16Impl()));
	//   11   27:new             #6   <Class ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #41  <Method void ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl()>
	//   14   34:putstatic       #40  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
	//   15   37:return          
		else
			IMPL = ((ConnectivityManagerCompatImpl) (new ConnectivityManagerCompatBaseImpl()));
	//   16   38:new             #12  <Class ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #42  <Method void ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl()>
	//   19   45:putstatic       #40  <Field ConnectivityManagerCompat$ConnectivityManagerCompatImpl IMPL>
	//*  20   48:return          
	}
}
