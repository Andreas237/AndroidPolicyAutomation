// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class PMIProvisioningData
{

	public PMIProvisioningData(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mDesiredName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String mDesiredName>
		mNetworkSsid = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field String mNetworkSsid>
		mNetworkPassword = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #19  <Field String mNetworkPassword>
	//   11   19:return          
	}

	public String getDesiredName()
	{
		return mDesiredName;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String mDesiredName>
	//    2    4:areturn         
	}

	public String getNetworkPassword()
	{
		return mNetworkPassword;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String mNetworkPassword>
	//    2    4:areturn         
	}

	public String getNetworkSsid()
	{
		return mNetworkSsid;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String mNetworkSsid>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("PMIProvisioningData{mDesiredName=");
	//    4    8:aload_1         
	//    5    9:ldc1            #30  <String "PMIProvisioningData{mDesiredName=">
	//    6   11:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mDesiredName);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field String mDesiredName>
	//   11   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mNetworkSsid=");
	//   13   24:aload_1         
	//   14   25:ldc1            #36  <String ",mNetworkSsid=">
	//   15   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mNetworkSsid);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #17  <Field String mNetworkSsid>
	//   20   36:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mNetworkPassword=");
	//   22   40:aload_1         
	//   23   41:ldc1            #38  <String ",mNetworkPassword=">
	//   24   43:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mNetworkPassword);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #19  <Field String mNetworkPassword>
	//   29   52:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append("}");
	//   31   56:aload_1         
	//   32   57:ldc1            #40  <String "}">
	//   33   59:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	final String mDesiredName;
	final String mNetworkPassword;
	final String mNetworkSsid;
}
