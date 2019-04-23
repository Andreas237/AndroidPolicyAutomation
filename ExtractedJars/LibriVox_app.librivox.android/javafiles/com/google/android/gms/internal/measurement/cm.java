// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			cl, cr

final class cm extends cl
{

	cm(cr cr, String s, Long long1)
	{
		super(cr, s, ((Object) (long1)), ((cm) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #9   <Method void cl(cr, String, Object, cm)>
	//    6    8:return          
	}

	private final Long b(Object obj)
	{
		if(obj instanceof Long)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class Long>
	//*   2    4:ifeq            12
			return (Long)obj;
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class Long>
	//    5   11:areturn         
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_32;
	//    6   12:aload_1         
	//    7   13:instanceof      #18  <Class String>
	//    8   16:ifeq            32
		long l = Long.parseLong((String)obj);
	//    9   19:aload_1         
	//   10   20:checkcast       #18  <Class String>
	//   11   23:invokestatic    #22  <Method long Long.parseLong(String)>
	//   12   26:lstore_2        
		return Long.valueOf(l);
	//   13   27:lload_2         
	//   14   28:invokestatic    #26  <Method Long Long.valueOf(long)>
	//   15   31:areturn         
_L2:
		String s = super.b();
	//   16   32:aload_0         
	//   17   33:invokespecial   #29  <Method String cl.b()>
	//   18   36:astore          4
		obj = ((Object) (String.valueOf(obj)));
	//   19   38:aload_1         
	//   20   39:invokestatic    #32  <Method String String.valueOf(Object)>
	//   21   42:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 25 + String.valueOf(obj).length());
	//   22   43:new             #34  <Class StringBuilder>
	//   23   46:dup             
	//   24   47:aload           4
	//   25   49:invokestatic    #32  <Method String String.valueOf(Object)>
	//   26   52:invokevirtual   #38  <Method int String.length()>
	//   27   55:bipush          25
	//   28   57:iadd            
	//   29   58:aload_1         
	//   30   59:invokestatic    #32  <Method String String.valueOf(Object)>
	//   31   62:invokevirtual   #38  <Method int String.length()>
	//   32   65:iadd            
	//   33   66:invokespecial   #41  <Method void StringBuilder(int)>
	//   34   69:astore          5
		stringbuilder.append("Invalid long value for ");
	//   35   71:aload           5
	//   36   73:ldc1            #43  <String "Invalid long value for ">
	//   37   75:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		stringbuilder.append(s);
	//   39   79:aload           5
	//   40   81:aload           4
	//   41   83:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		stringbuilder.append(": ");
	//   43   87:aload           5
	//   44   89:ldc1            #49  <String ": ">
	//   45   91:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
		stringbuilder.append(((String) (obj)));
	//   47   95:aload           5
	//   48   97:aload_1         
	//   49   98:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   50  101:pop             
		Log.e("PhenotypeFlag", stringbuilder.toString());
	//   51  102:ldc1            #51  <String "PhenotypeFlag">
	//   52  104:aload           5
	//   53  106:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   54  109:invokestatic    #60  <Method int Log.e(String, String)>
	//   55  112:pop             
		return null;
	//   56  113:aconst_null     
	//   57  114:areturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   58  115:astore          4
		if(true) goto _L2; else goto _L1
	//   59  117:goto            32
_L1:
	}

	final Object a(Object obj)
	{
		return ((Object) (b(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method Long b(Object)>
	//    3    5:areturn         
	}
}
