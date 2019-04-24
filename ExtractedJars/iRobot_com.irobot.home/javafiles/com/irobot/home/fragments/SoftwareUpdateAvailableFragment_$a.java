// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import com.irobot.core.OnDemandOTAPathType;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			SoftwareUpdateAvailableFragment_, SoftwareUpdateAvailableFragment

public static class SoftwareUpdateAvailableFragment_$a extends c
{

	public SoftwareUpdateAvailableFragment a()
	{
		SoftwareUpdateAvailableFragment_ softwareupdateavailablefragment_ = new SoftwareUpdateAvailableFragment_();
	//    0    0:new             #7   <Class SoftwareUpdateAvailableFragment_>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void SoftwareUpdateAvailableFragment_()>
	//    3    7:astore_1        
		softwareupdateavailablefragment_.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void SoftwareUpdateAvailableFragment_.setArguments(Bundle)>
		return ((SoftwareUpdateAvailableFragment) (softwareupdateavailablefragment_));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public SoftwareUpdateAvailableFragment_$a a(OnDemandOTAPathType ondemandotapathtype)
	{
		a.putSerializable("pathType", ((java.io.Serializable) (ondemandotapathtype)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "pathType">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public SoftwareUpdateAvailableFragment_$a a(String s)
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

	public SoftwareUpdateAvailableFragment_$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
