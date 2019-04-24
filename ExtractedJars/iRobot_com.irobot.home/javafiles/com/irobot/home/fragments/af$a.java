// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import java.util.ArrayList;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			af, ae

public static class af$a extends c
{

	public ae a()
	{
		af af1 = new af();
	//    0    0:new             #7   <Class af>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void af()>
	//    3    7:astore_1        
		af1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void af.setArguments(Bundle)>
		return ((ae) (af1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public af$a a(int i)
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

	public af$a a(String s)
	{
		a.putString("infoSectionTitle", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "infoSectionTitle">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public af$a a(ArrayList arraylist)
	{
		a.putStringArrayList("infoText", arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #41  <String "infoText">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putStringArrayList(String, ArrayList)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public af$a a(boolean flag)
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

	public af$a b(int i)
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

	public af$a b(String s)
	{
		a.putString("subheaderTitle", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #59  <String "subheaderTitle">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public af$a b(boolean flag)
	{
		a.putBoolean("loopBack", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #61  <String "loopBack">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #54  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public af$a c(boolean flag)
	{
		a.putBoolean("isValidNetwork", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #64  <String "isValidNetwork">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #54  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public af$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
