// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jj, hh, gz, gv

public class hl extends jj
{

	public hl(byte abyte0[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void jj()>
		b = "1";
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "1">
	//    4    7:putfield        #17  <Field String b>
		a = (byte[])((byte []) (abyte0)).clone();
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #22  <Method Object _5B_B.clone()>
	//    8   15:checkcast       #18  <Class byte[]>
	//    9   18:putfield        #24  <Field byte[] a>
		b = s;
	//   10   21:aload_0         
	//   11   22:aload_2         
	//   12   23:putfield        #17  <Field String b>
	//   13   26:return          
	}

	private String d()
	{
		byte abyte0[] = gz.a(hh.b);
	//    0    0:getstatic       #30  <Field String hh.b>
	//    1    3:invokestatic    #35  <Method byte[] gz.a(String)>
	//    2    6:astore_1        
		byte abyte1[] = new byte[abyte0.length + 50];
	//    3    7:aload_1         
	//    4    8:arraylength     
	//    5    9:bipush          50
	//    6   11:iadd            
	//    7   12:newarray        byte[]
	//    8   14:astore_2        
		System.arraycopy(((Object) (a)), 0, ((Object) (abyte1)), 0, 50);
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field byte[] a>
	//   11   19:iconst_0        
	//   12   20:aload_2         
	//   13   21:iconst_0        
	//   14   22:bipush          50
	//   15   24:invokestatic    #41  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 50, abyte0.length);
	//   16   27:aload_1         
	//   17   28:iconst_0        
	//   18   29:aload_2         
	//   19   30:bipush          50
	//   20   32:aload_1         
	//   21   33:arraylength     
	//   22   34:invokestatic    #41  <Method void System.arraycopy(Object, int, Object, int, int)>
		return gv.a(abyte1);
	//   23   37:aload_2         
	//   24   38:invokestatic    #46  <Method String gv.a(byte[])>
	//   25   41:areturn         
	}

	public Map a()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #49  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("Content-Type", "application/zip");
	//    4    8:aload_1         
	//    5    9:ldc1            #52  <String "Content-Type">
	//    6   11:ldc1            #54  <String "application/zip">
	//    7   13:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("Content-Length", ((Object) (String.valueOf(a.length))));
	//    9   19:aload_1         
	//   10   20:ldc1            #62  <String "Content-Length">
	//   11   22:aload_0         
	//   12   23:getfield        #24  <Field byte[] a>
	//   13   26:arraylength     
	//   14   27:invokestatic    #68  <Method String String.valueOf(int)>
	//   15   30:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   16   35:pop             
		return ((Map) (hashmap));
	//   17   36:aload_1         
	//   18   37:areturn         
	}

	public Map b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String c()
	{
		return String.format(gz.c(hh.c), new Object[] {
			"1", b, "1", "open", d()
		});
	//    0    0:getstatic       #73  <Field String hh.c>
	//    1    3:invokestatic    #76  <Method String gz.c(String)>
	//    2    6:iconst_5        
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:ldc1            #15  <String "1">
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #17  <Field String b>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:ldc1            #15  <String "1">
	//   16   26:aastore         
	//   17   27:dup             
	//   18   28:iconst_3        
	//   19   29:ldc1            #80  <String "open">
	//   20   31:aastore         
	//   21   32:dup             
	//   22   33:iconst_4        
	//   23   34:aload_0         
	//   24   35:invokespecial   #82  <Method String d()>
	//   25   38:aastore         
	//   26   39:invokestatic    #86  <Method String String.format(String, Object[])>
	//   27   42:areturn         
	}

	public byte[] g()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field byte[] a>
	//    2    4:areturn         
	}

	private byte a[];
	private String b;
}
