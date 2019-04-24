// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.net.wifi.WifiInfo;
import android.os.Bundle;
import com.irobot.home.model.WifiConfig;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			bx, bw

public static class bx$a extends c
{

	public bw a()
	{
		bx bx1 = new bx();
	//    0    0:new             #7   <Class bx>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bx()>
	//    3    7:astore_1        
		bx1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void bx.setArguments(Bundle)>
		return ((bw) (bx1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public bx$a a(WifiInfo wifiinfo)
	{
		a.putParcelable("homeWifiInfo", ((android.os.Parcelable) (wifiinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "homeWifiInfo">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bx$a a(WifiConfig wificonfig)
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

	public bx$a a(String s)
	{
		a.putString("assetInfoJson", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #37  <String "assetInfoJson">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #41  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bx$a b(WifiInfo wifiinfo)
	{
		a.putParcelable("robotWifiInfo", ((android.os.Parcelable) (wifiinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #44  <String "robotWifiInfo">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bx$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
