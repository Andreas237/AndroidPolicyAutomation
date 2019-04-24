// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import com.irobot.core.OnDemandOTAEntryType;
import com.irobot.core.OnDemandOTAPathType;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			ci, ch

public static class ci$a extends c
{

	public ch a()
	{
		ci ci1 = new ci();
	//    0    0:new             #7   <Class ci>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void ci()>
	//    3    7:astore_1        
		ci1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void ci.setArguments(Bundle)>
		return ((ch) (ci1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public ci$a a(OnDemandOTAEntryType ondemandotaentrytype)
	{
		a.putSerializable("entryType", ((java.io.Serializable) (ondemandotaentrytype)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "entryType">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ci$a a(OnDemandOTAPathType ondemandotapathtype)
	{
		a.putSerializable("pathType", ((java.io.Serializable) (ondemandotapathtype)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "pathType">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ci$a a(String s)
	{
		a.putString("assetId", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #37  <String "assetId">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #41  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ci$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
