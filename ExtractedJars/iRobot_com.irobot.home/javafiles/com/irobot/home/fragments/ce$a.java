// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			ce, SoftwareUpdateCheckFragment

public static class ce$a extends c
{

	public SoftwareUpdateCheckFragment a()
	{
		ce ce1 = new ce();
	//    0    0:new             #7   <Class ce>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void ce()>
	//    3    7:astore_1        
		ce1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void ce.setArguments(Bundle)>
		return ((SoftwareUpdateCheckFragment) (ce1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public ce$a a(String s)
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

	public ce$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
