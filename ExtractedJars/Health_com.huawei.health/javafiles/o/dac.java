// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.huawei.hwcommonmodel.application.BaseApplication;

public class dac
{

	public dac()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	public static final String a = (new StringBuilder()).append(BaseApplication.d().c()).append(".permission.LOCAL_BROADCAST").toString();

	static 
	{
	//    0    0:new             #10  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void StringBuilder()>
	//    3    7:invokestatic    #19  <Method com.huawei.hwcommonmodel.application.BaseApplication$e BaseApplication.d()>
	//    4   10:invokevirtual   #25  <Method String com.huawei.hwcommonmodel.application.BaseApplication$e.c()>
	//    5   13:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    6   16:ldc1            #31  <String ".permission.LOCAL_BROADCAST">
	//    7   18:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    8   21:invokevirtual   #34  <Method String StringBuilder.toString()>
	//    9   24:putstatic       #36  <Field String a>
	//*  10   27:return          
	}
}
