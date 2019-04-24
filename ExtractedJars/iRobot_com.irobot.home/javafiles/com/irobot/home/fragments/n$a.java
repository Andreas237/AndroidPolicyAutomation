// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import com.irobot.home.model.WifiConfig;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			n, m

public static class n$a extends c
{

	public m a()
	{
		n n1 = new n();
	//    0    0:new             #7   <Class n>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void n()>
	//    3    7:astore_1        
		n1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void n.setArguments(Bundle)>
		return ((m) (n1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public n$a a(WifiConfig wificonfig)
	{
		a.putParcelable("wifiSettings", ((android.os.Parcelable) (wificonfig)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "wifiSettings">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public n$a a(boolean flag)
	{
		a.putBoolean("isNetworkSettingClickable", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "isNetworkSettingClickable">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public n$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
