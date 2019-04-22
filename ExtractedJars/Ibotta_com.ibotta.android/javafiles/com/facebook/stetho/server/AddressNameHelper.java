// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import com.facebook.stetho.common.ProcessUtil;

public class AddressNameHelper
{

	public AddressNameHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static String createCustomAddress(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("stetho_");
	//    4    8:aload_1         
	//    5    9:ldc1            #8   <String "stetho_">
	//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(ProcessUtil.getProcessName());
	//    8   15:aload_1         
	//    9   16:invokestatic    #28  <Method String ProcessUtil.getProcessName()>
	//   10   19:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(s);
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		return stringbuilder.toString();
	//   16   29:aload_1         
	//   17   30:invokevirtual   #31  <Method String StringBuilder.toString()>
	//   18   33:areturn         
	}

	private static final String PREFIX = "stetho_";
}
