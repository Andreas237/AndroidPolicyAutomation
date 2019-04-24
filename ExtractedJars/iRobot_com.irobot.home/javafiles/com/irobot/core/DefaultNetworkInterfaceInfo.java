// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class DefaultNetworkInterfaceInfo
{

	public DefaultNetworkInterfaceInfo(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mUniqueNetworkID = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String mUniqueNetworkID>
		mSignalStrengthdBm = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int mSignalStrengthdBm>
	//    8   14:return          
	}

	public int getSignalStrengthdBm()
	{
		return mSignalStrengthdBm;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mSignalStrengthdBm>
	//    2    4:ireturn         
	}

	public String getUniqueNetworkID()
	{
		return mUniqueNetworkID;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String mUniqueNetworkID>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DefaultNetworkInterfaceInfo{mUniqueNetworkID=");
	//    4    8:aload_1         
	//    5    9:ldc1            #28  <String "DefaultNetworkInterfaceInfo{mUniqueNetworkID=">
	//    6   11:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mUniqueNetworkID);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field String mUniqueNetworkID>
	//   11   20:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mSignalStrengthdBm=");
	//   13   24:aload_1         
	//   14   25:ldc1            #34  <String ",mSignalStrengthdBm=">
	//   15   27:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mSignalStrengthdBm);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #17  <Field int mSignalStrengthdBm>
	//   20   36:invokevirtual   #37  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append("}");
	//   22   40:aload_1         
	//   23   41:ldc1            #39  <String "}">
	//   24   43:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	final int mSignalStrengthdBm;
	final String mUniqueNetworkID;
}
