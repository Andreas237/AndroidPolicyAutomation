// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import java.util.*;

public class ConnectResp
	implements IMessageEntity
{

	public ConnectResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		protocolVersion = Arrays.asList(((Object []) (new Integer[] {
			Integer.valueOf(1), Integer.valueOf(2)
		})));
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:anewarray       Integer[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:iconst_1        
	//    8   12:invokestatic    #22  <Method Integer Integer.valueOf(int)>
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_2        
	//   13   19:invokestatic    #22  <Method Integer Integer.valueOf(int)>
	//   14   22:aastore         
	//   15   23:invokestatic    #28  <Method List Arrays.asList(Object[])>
	//   16   26:putfield        #30  <Field List protocolVersion>
	//   17   29:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("protocol version:");
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "protocol version:">
	//    3    6:invokespecial   #40  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		for(Iterator iterator = protocolVersion.iterator(); iterator.hasNext(); stringbuilder.append(','))
	//*   5   10:aload_0         
	//*   6   11:getfield        #30  <Field List protocolVersion>
	//*   7   14:invokeinterface #46  <Method Iterator List.iterator()>
	//*   8   19:astore_2        
	//*   9   20:aload_2         
	//*  10   21:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  11   26:ifeq            53
			stringbuilder.append(((Object) ((Integer)iterator.next())));
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:invokeinterface #56  <Method Object Iterator.next()>
	//   15   36:checkcast       #18  <Class Integer>
	//   16   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   17   42:pop             

	//   18   43:aload_1         
	//   19   44:bipush          44
	//   20   46:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   21   49:pop             
	//*  22   50:goto            20
		return stringbuilder.toString();
	//   23   53:aload_1         
	//   24   54:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   25   57:areturn         
	}

	public List protocolVersion;
	public String sessionId;
}
