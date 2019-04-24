// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			cd, cc

public static class cd$a extends c
{

	public cc a()
	{
		cd cd1 = new cd();
	//    0    0:new             #7   <Class cd>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void cd()>
	//    3    7:astore_1        
		cd1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void cd.setArguments(Bundle)>
		return ((cc) (cd1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public cd$a a(int i)
	{
		a.putInt("resId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "resId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public cd$a b(int i)
	{
		a.putInt("subtitleResId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "subtitleResId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public cd$a c(int i)
	{
		a.putInt("descriptionResId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #37  <String "descriptionResId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public cd$a d(int i)
	{
		a.putInt("welcomeScreenId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #40  <String "welcomeScreenId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public cd$a e(int i)
	{
		a.putInt("replayButtonResId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #43  <String "replayButtonResId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public cd$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
