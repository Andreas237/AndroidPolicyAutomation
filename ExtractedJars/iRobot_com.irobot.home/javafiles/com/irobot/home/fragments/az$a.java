// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import java.util.HashMap;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			az, ay

public static class az$a extends c
{

	public ay a()
	{
		az az1 = new az();
	//    0    0:new             #7   <Class az>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void az()>
	//    3    7:astore_1        
		az1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void az.setArguments(Bundle)>
		return ((ay) (az1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public az$a a(int i)
	{
		a.putInt("selectedTextColor", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "selectedTextColor">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public az$a a(String s)
	{
		a.putString("assetId", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "assetId">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public az$a a(HashMap hashmap)
	{
		a.putSerializable("settingsMap", ((java.io.Serializable) (hashmap)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #41  <String "settingsMap">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public az$a a(boolean flag)
	{
		a.putBoolean("arePresetsSupported", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #50  <String "arePresetsSupported">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #54  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public az$a b(int i)
	{
		a.putInt("unselectedTextColor", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #57  <String "unselectedTextColor">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public az$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
