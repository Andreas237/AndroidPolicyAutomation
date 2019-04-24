// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import java.util.HashMap;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			bh, bg

public static class bh$a extends c
{

	public bg a()
	{
		bh bh1 = new bh();
	//    0    0:new             #7   <Class bh>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bh()>
	//    3    7:astore_1        
		bh1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void bh.setArguments(Bundle)>
		return ((bg) (bh1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public bh$a a(String s)
	{
		a.putString("assetId", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "assetId">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bh$a a(HashMap hashmap)
	{
		a.putSerializable("settingsMap", ((java.io.Serializable) (hashmap)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "settingsMap">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bh$a a(boolean flag)
	{
		a.putBoolean("isPresetSupported", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #43  <String "isPresetSupported">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #47  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bh$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
