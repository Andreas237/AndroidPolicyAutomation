// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			NetworkScenarios

public final class NetworkStatisticsToken
{

	public NetworkStatisticsToken(long l, NetworkScenarios networkscenarios)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mStartTime = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #15  <Field long mStartTime>
		mScenario = networkscenarios;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #17  <Field NetworkScenarios mScenario>
	//    8   14:return          
	}

	public NetworkScenarios getScenario()
	{
		return mScenario;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field NetworkScenarios mScenario>
	//    2    4:areturn         
	}

	public long getStartTime()
	{
		return mStartTime;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long mStartTime>
	//    2    4:lreturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("NetworkStatisticsToken{mStartTime=");
	//    4    8:aload_1         
	//    5    9:ldc1            #29  <String "NetworkStatisticsToken{mStartTime=">
	//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mStartTime);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field long mStartTime>
	//   11   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append(",mScenario=");
	//   13   24:aload_1         
	//   14   25:ldc1            #38  <String ",mScenario=">
	//   15   27:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (mScenario)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #17  <Field NetworkScenarios mScenario>
	//   20   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append("}");
	//   22   40:aload_1         
	//   23   41:ldc1            #43  <String "}">
	//   24   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	final NetworkScenarios mScenario;
	final long mStartTime;
}
