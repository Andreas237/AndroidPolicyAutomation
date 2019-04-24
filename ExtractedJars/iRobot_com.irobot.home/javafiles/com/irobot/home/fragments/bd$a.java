// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			bd, bc

public static class bd$a extends c
{

	public bc a()
	{
		bd bd1 = new bd();
	//    0    0:new             #7   <Class bd>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bd()>
	//    3    7:astore_1        
		bd1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void bd.setArguments(Bundle)>
		return ((bc) (bd1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public bd$a a(String s)
	{
		a.putString("errorTitle", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "errorTitle">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bd$a a(boolean flag)
	{
		a.putBoolean("showHelp", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "showHelp">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bd$a b(String s)
	{
		a.putString("errorDescription", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #41  <String "errorDescription">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bd$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
