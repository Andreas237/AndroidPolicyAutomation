// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsi, zzso

final class zzsk extends zzsi
{

	zzsk(zzso zzso, String s, Integer integer)
	{
		super(zzso, s, ((Object) (integer)), ((zzsj) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #10  <Method void zzsi(zzso, String, Object, zzsj)>
	//    6    8:return          
	}

	private final Integer zzu(Object obj)
	{
		if(obj instanceof Integer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class Integer>
	//*   2    4:ifeq            12
			return (Integer)obj;
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class Integer>
	//    5   11:areturn         
		if(obj instanceof Long)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #19  <Class Long>
	//*   8   16:ifeq            30
			return Integer.valueOf(((Long)obj).intValue());
	//    9   19:aload_1         
	//   10   20:checkcast       #19  <Class Long>
	//   11   23:invokevirtual   #23  <Method int Long.intValue()>
	//   12   26:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   13   29:areturn         
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_50;
	//   14   30:aload_1         
	//   15   31:instanceof      #29  <Class String>
	//   16   34:ifeq            50
		int i = Integer.parseInt((String)obj);
	//   17   37:aload_1         
	//   18   38:checkcast       #29  <Class String>
	//   19   41:invokestatic    #33  <Method int Integer.parseInt(String)>
	//   20   44:istore_2        
		return Integer.valueOf(i);
	//   21   45:iload_2         
	//   22   46:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   23   49:areturn         
_L2:
		String s = super.zztr();
	//   24   50:aload_0         
	//   25   51:invokespecial   #37  <Method String zzsi.zztr()>
	//   26   54:astore_3        
		obj = ((Object) (String.valueOf(obj)));
	//   27   55:aload_1         
	//   28   56:invokestatic    #40  <Method String String.valueOf(Object)>
	//   29   59:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 24 + String.valueOf(obj).length());
	//   30   60:new             #42  <Class StringBuilder>
	//   31   63:dup             
	//   32   64:aload_3         
	//   33   65:invokestatic    #40  <Method String String.valueOf(Object)>
	//   34   68:invokevirtual   #45  <Method int String.length()>
	//   35   71:bipush          24
	//   36   73:iadd            
	//   37   74:aload_1         
	//   38   75:invokestatic    #40  <Method String String.valueOf(Object)>
	//   39   78:invokevirtual   #45  <Method int String.length()>
	//   40   81:iadd            
	//   41   82:invokespecial   #48  <Method void StringBuilder(int)>
	//   42   85:astore          4
		stringbuilder.append("Invalid int value for ");
	//   43   87:aload           4
	//   44   89:ldc1            #50  <String "Invalid int value for ">
	//   45   91:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
		stringbuilder.append(s);
	//   47   95:aload           4
	//   48   97:aload_3         
	//   49   98:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   50  101:pop             
		stringbuilder.append(": ");
	//   51  102:aload           4
	//   52  104:ldc1            #56  <String ": ">
	//   53  106:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   54  109:pop             
		stringbuilder.append(((String) (obj)));
	//   55  110:aload           4
	//   56  112:aload_1         
	//   57  113:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   58  116:pop             
		Log.e("PhenotypeFlag", stringbuilder.toString());
	//   59  117:ldc1            #58  <String "PhenotypeFlag">
	//   60  119:aload           4
	//   61  121:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   62  124:invokestatic    #67  <Method int Log.e(String, String)>
	//   63  127:pop             
		return null;
	//   64  128:aconst_null     
	//   65  129:areturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   66  130:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  67  131:goto            50
	}

	final Object zzs(Object obj)
	{
		return ((Object) (zzu(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method Integer zzu(Object)>
	//    3    5:areturn         
	}
}
