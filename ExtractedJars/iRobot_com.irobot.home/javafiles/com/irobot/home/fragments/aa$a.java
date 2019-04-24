// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import com.irobot.home.model.WifiConfig;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			aa, z

public static class aa$a extends c
{

	public aa$a a(WifiConfig wificonfig)
	{
		a.putParcelable("wifiSettings", ((android.os.Parcelable) (wificonfig)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Bundle a>
	//    2    4:ldc1            #19  <String "wifiSettings">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #25  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public aa$a a(boolean flag)
	{
		a.putBoolean("isProvisioningFirstPass", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Bundle a>
	//    2    4:ldc1            #28  <String "isProvisioningFirstPass">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public z a()
	{
		aa aa1 = new aa();
	//    0    0:new             #7   <Class aa>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void aa()>
	//    3    7:astore_1        
		aa1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field Bundle a>
	//    7   13:invokevirtual   #38  <Method void aa.setArguments(Bundle)>
		return ((z) (aa1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public aa$a b(boolean flag)
	{
		a.putBoolean("invalidPassword", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Bundle a>
	//    2    4:ldc1            #41  <String "invalidPassword">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public aa$a c(boolean flag)
	{
		a.putBoolean("isNotPasswordProtected", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Bundle a>
	//    2    4:ldc1            #44  <String "isNotPasswordProtected">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public aa$a d(boolean flag)
	{
		a.putBoolean("isNetworkSettingClickable", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Bundle a>
	//    2    4:ldc1            #47  <String "isNetworkSettingClickable">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #32  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public aa$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
