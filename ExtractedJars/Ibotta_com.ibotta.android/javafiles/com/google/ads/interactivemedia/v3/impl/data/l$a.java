// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//			l

public static class l$a
{

	public Map constructMap()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #22  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("type", ((Object) (type)));
	//    4    8:aload_1         
	//    5    9:ldc1            #24  <String "type">
	//    6   11:aload_0         
	//    7   12:getfield        #26  <Field String type>
	//    8   15:invokeinterface #32  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("errorCode", ((Object) (String.valueOf(errorCode))));
	//   10   21:aload_1         
	//   11   22:ldc1            #33  <String "errorCode">
	//   12   24:aload_0         
	//   13   25:getfield        #35  <Field int errorCode>
	//   14   28:invokestatic    #41  <Method String String.valueOf(int)>
	//   15   31:invokeinterface #32  <Method Object Map.put(Object, Object)>
	//   16   36:pop             
		((Map) (hashmap)).put("errorMessage", ((Object) (errorMessage)));
	//   17   37:aload_1         
	//   18   38:ldc1            #42  <String "errorMessage">
	//   19   40:aload_0         
	//   20   41:getfield        #44  <Field String errorMessage>
	//   21   44:invokeinterface #32  <Method Object Map.put(Object, Object)>
	//   22   49:pop             
		String s = innerError;
	//   23   50:aload_0         
	//   24   51:getfield        #46  <Field String innerError>
	//   25   54:astore_2        
		if(s != null)
	//*  26   55:aload_2         
	//*  27   56:ifnull          69
			((Map) (hashmap)).put("innerError", ((Object) (s)));
	//   28   59:aload_1         
	//   29   60:ldc1            #47  <String "innerError">
	//   30   62:aload_2         
	//   31   63:invokeinterface #32  <Method Object Map.put(Object, Object)>
	//   32   68:pop             
		return ((Map) (hashmap));
	//   33   69:aload_1         
	//   34   70:areturn         
	}

	public String toString()
	{
		return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", new Object[] {
			type, Integer.valueOf(errorCode), errorMessage, innerError
		});
	//    0    0:ldc1            #53  <String "Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #26  <Field String type>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #35  <Field int errorCode>
	//   12   19:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_2        
	//   16   25:aload_0         
	//   17   26:getfield        #44  <Field String errorMessage>
	//   18   29:aastore         
	//   19   30:dup             
	//   20   31:iconst_3        
	//   21   32:aload_0         
	//   22   33:getfield        #46  <Field String innerError>
	//   23   36:aastore         
	//   24   37:invokestatic    #62  <Method String String.format(String, Object[])>
	//   25   40:areturn         
	}

	public int errorCode;
	public String errorMessage;
	public String innerError;
	public String type;

	public l$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
