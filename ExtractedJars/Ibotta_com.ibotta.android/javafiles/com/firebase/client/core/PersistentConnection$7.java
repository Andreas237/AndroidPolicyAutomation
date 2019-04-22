// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.utilities.LogWrapper;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

class PersistentConnection$7
	implements sponseListener
{

	public void onResponse(Map map)
	{
		String s = (String)map.get("s");
	//    0    0:aload_1         
	//    1    1:ldc1            #24  <String "s">
	//    2    3:invokeinterface #30  <Method Object Map.get(Object)>
	//    3    8:checkcast       #32  <Class String>
	//    4   11:astore_2        
		if(!s.equals("ok"))
	//*   5   12:aload_2         
	//*   6   13:ldc1            #34  <String "ok">
	//*   7   15:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*   8   18:ifne            87
		{
			map = ((Map) (FirebaseError.fromStatus(s, (String)map.get("d"))));
	//    9   21:aload_2         
	//   10   22:aload_1         
	//   11   23:ldc1            #40  <String "d">
	//   12   25:invokeinterface #30  <Method Object Map.get(Object)>
	//   13   30:checkcast       #32  <Class String>
	//   14   33:invokestatic    #46  <Method FirebaseError FirebaseError.fromStatus(String, String)>
	//   15   36:astore_1        
			if(PersistentConnection.access$1100(PersistentConnection.this).logsDebug())
	//*  16   37:aload_0         
	//*  17   38:getfield        #17  <Field PersistentConnection this$0>
	//*  18   41:invokestatic    #50  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
	//*  19   44:invokevirtual   #56  <Method boolean LogWrapper.logsDebug()>
	//*  20   47:ifeq            87
			{
				LogWrapper logwrapper = PersistentConnection.access$1100(PersistentConnection.this);
	//   21   50:aload_0         
	//   22   51:getfield        #17  <Field PersistentConnection this$0>
	//   23   54:invokestatic    #50  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
	//   24   57:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   25   58:new             #58  <Class StringBuilder>
	//   26   61:dup             
	//   27   62:invokespecial   #59  <Method void StringBuilder()>
	//   28   65:astore_3        
				stringbuilder.append("Failed to send stats: ");
	//   29   66:aload_3         
	//   30   67:ldc1            #61  <String "Failed to send stats: ">
	//   31   69:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   32   72:pop             
				stringbuilder.append(((Object) (map)));
	//   33   73:aload_3         
	//   34   74:aload_1         
	//   35   75:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   36   78:pop             
				logwrapper.debug(stringbuilder.toString());
	//   37   79:aload_2         
	//   38   80:aload_3         
	//   39   81:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   40   84:invokevirtual   #76  <Method void LogWrapper.debug(String)>
			}
		}
	//   41   87:return          
	}

	final PersistentConnection this$0;

	PersistentConnection$7()
	{
		this$0 = PersistentConnection.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PersistentConnection this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
