// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.net.wifi.WifiInfo;
import android.os.Bundle;
import com.irobot.home.model.WifiConfig;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			bv, bu

public static class bv$a extends c
{

	public bu a()
	{
		bv bv1 = new bv();
	//    0    0:new             #7   <Class bv>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bv()>
	//    3    7:astore_1        
		bv1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void bv.setArguments(Bundle)>
		return ((bu) (bv1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public bv$a a(WifiInfo wifiinfo)
	{
		a.putParcelable("currentWifiInfo", ((android.os.Parcelable) (wifiinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "currentWifiInfo">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bv$a a(WifiConfig wificonfig)
	{
		a.putParcelable("wifiSettings", ((android.os.Parcelable) (wificonfig)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "wifiSettings">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bv$a a(String s)
	{
		a.putString("robotBlid", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #37  <String "robotBlid">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #41  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bv$a a(boolean flag)
	{
		a.putBoolean("isProvisioningFirstPass", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #44  <String "isProvisioningFirstPass">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bv$a b(boolean flag)
	{
		a.putBoolean("checkWifiStatus", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #51  <String "checkWifiStatus">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bv$a c(boolean flag)
	{
		a.putBoolean("resumeNetworkSetup", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #54  <String "resumeNetworkSetup">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bv$a d(boolean flag)
	{
		a.putBoolean("newRobotConfig", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #57  <String "newRobotConfig">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #48  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bv$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
