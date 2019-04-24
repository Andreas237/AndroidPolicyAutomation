// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			gg, gr

public abstract class gh extends gg
{

	public gh(Context context, Object obj)
	{
		super(context, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void gg(Context, Object)>
	//    4    6:return          
	}

	public Map a()
	{
		HashMap hashmap = new HashMap(16);
	//    0    0:new             #16  <Class HashMap>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #19  <Method void HashMap(int)>
	//    4    9:astore_1        
		((Map) (hashmap)).put("Content-Type", " application/json");
	//    5   10:aload_1         
	//    6   11:ldc1            #21  <String "Content-Type">
	//    7   13:ldc1            #23  <String " application/json">
	//    8   15:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("Accept-Encoding", "gzip");
	//   10   21:aload_1         
	//   11   22:ldc1            #31  <String "Accept-Encoding">
	//   12   24:ldc1            #33  <String "gzip">
	//   13   26:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//   14   31:pop             
		((Map) (hashmap)).put("User-Agent", "AMAP SDK Android Trace 6.3.1");
	//   15   32:aload_1         
	//   16   33:ldc1            #35  <String "User-Agent">
	//   17   35:ldc1            #37  <String "AMAP SDK Android Trace 6.3.1">
	//   18   37:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//   19   42:pop             
		((Map) (hashmap)).put("x-INFO", ((Object) (gr.b(c))));
	//   20   43:aload_1         
	//   21   44:ldc1            #39  <String "x-INFO">
	//   22   46:aload_0         
	//   23   47:getfield        #43  <Field Context c>
	//   24   50:invokestatic    #49  <Method String gr.b(Context)>
	//   25   53:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//   26   58:pop             
		((Map) (hashmap)).put("platinfo", ((Object) (String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", new Object[] {
			"6.3.1", "trace"
		}))));
	//   27   59:aload_1         
	//   28   60:ldc1            #51  <String "platinfo">
	//   29   62:getstatic       #57  <Field Locale Locale.US>
	//   30   65:ldc1            #59  <String "platform=Android&sdkversion=%s&product=%s">
	//   31   67:iconst_2        
	//   32   68:anewarray       Object[]
	//   33   71:dup             
	//   34   72:iconst_0        
	//   35   73:ldc1            #63  <String "6.3.1">
	//   36   75:aastore         
	//   37   76:dup             
	//   38   77:iconst_1        
	//   39   78:ldc1            #65  <String "trace">
	//   40   80:aastore         
	//   41   81:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   42   84:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//   43   89:pop             
		((Map) (hashmap)).put("logversion", "2.1");
	//   44   90:aload_1         
	//   45   91:ldc1            #73  <String "logversion">
	//   46   93:ldc1            #75  <String "2.1">
	//   47   95:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//   48  100:pop             
		return ((Map) (hashmap));
	//   49  101:aload_1         
	//   50  102:areturn         
	}

	public Map b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected Object e()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected abstract String f();

	public byte[] g()
	{
		byte abyte0[];
		try
		{
			abyte0 = f().getBytes("utf-8");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method String f()>
	//    2    4:ldc1            #89  <String "utf-8">
	//    3    6:invokevirtual   #93  <Method byte[] String.getBytes(String)>
	//    4    9:astore_1        
		}
	//*   5   10:aload_1         
	//*   6   11:areturn         
		catch(Throwable throwable)
	//*   7   12:astore_1        
		{
			throwable.printStackTrace();
	//    8   13:aload_1         
	//    9   14:invokevirtual   #97  <Method void Throwable.printStackTrace()>
			return null;
	//   10   17:aconst_null     
	//   11   18:areturn         
		}
		return abyte0;
	}
}
