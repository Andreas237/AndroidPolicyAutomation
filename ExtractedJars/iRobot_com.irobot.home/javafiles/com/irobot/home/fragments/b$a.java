// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import java.util.ArrayList;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			b, a

public static class b$a extends c
{

	public a a()
	{
		b b1 = new b();
	//    0    0:new             #7   <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void b()>
	//    3    7:astore_1        
		b1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void b.setArguments(Bundle)>
		return ((a) (b1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public b$a a(int i)
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

	public b$a a(String s)
	{
		a.putString("activateText", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "activateText">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public b$a a(ArrayList arraylist)
	{
		a.putIntegerArrayList("substringLengthList", arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #41  <String "substringLengthList">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putIntegerArrayList(String, ArrayList)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public b$a a(boolean flag)
	{
		a.putBoolean("isImageRes", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #50  <String "isImageRes">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #54  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public b$a b(int i)
	{
		a.putInt("replayButtonResId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #57  <String "replayButtonResId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public b$a b(ArrayList arraylist)
	{
		a.putIntegerArrayList("imageResIdList", arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #59  <String "imageResIdList">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putIntegerArrayList(String, ArrayList)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public b$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
