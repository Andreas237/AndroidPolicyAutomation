// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			ck, cj

public static class ck$a extends c
{

	public cj a()
	{
		ck ck1 = new ck();
	//    0    0:new             #7   <Class ck>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void ck()>
	//    3    7:astore_1        
		ck1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void ck.setArguments(Bundle)>
		return ((cj) (ck1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public ck$a a(String s)
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

	public ck$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
