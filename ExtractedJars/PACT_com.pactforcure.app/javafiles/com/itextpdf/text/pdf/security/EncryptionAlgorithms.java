// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.util.HashMap;

public class EncryptionAlgorithms
{

	public EncryptionAlgorithms()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:return          
	}

	public static String getAlgorithm(String s)
	{
		String s1 = (String)algorithmNames.get(((Object) (s)));
	//    0    0:getstatic       #16  <Field HashMap algorithmNames>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #68  <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #70  <Class String>
	//    4   10:astore_1        
		if(s1 == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return s;
	//    7   15:aload_0         
	//    8   16:areturn         
		else
			return s1;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	static final HashMap algorithmNames;

	static 
	{
		algorithmNames = new HashMap();
	//    0    0:new             #11  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:putstatic       #16  <Field HashMap algorithmNames>
		algorithmNames.put("1.2.840.113549.1.1.1", "RSA");
	//    4   10:getstatic       #16  <Field HashMap algorithmNames>
	//    5   13:ldc1            #18  <String "1.2.840.113549.1.1.1">
	//    6   15:ldc1            #20  <String "RSA">
	//    7   17:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//    8   20:pop             
		algorithmNames.put("1.2.840.10040.4.1", "DSA");
	//    9   21:getstatic       #16  <Field HashMap algorithmNames>
	//   10   24:ldc1            #26  <String "1.2.840.10040.4.1">
	//   11   26:ldc1            #28  <String "DSA">
	//   12   28:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   13   31:pop             
		algorithmNames.put("1.2.840.113549.1.1.2", "RSA");
	//   14   32:getstatic       #16  <Field HashMap algorithmNames>
	//   15   35:ldc1            #30  <String "1.2.840.113549.1.1.2">
	//   16   37:ldc1            #20  <String "RSA">
	//   17   39:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   18   42:pop             
		algorithmNames.put("1.2.840.113549.1.1.4", "RSA");
	//   19   43:getstatic       #16  <Field HashMap algorithmNames>
	//   20   46:ldc1            #32  <String "1.2.840.113549.1.1.4">
	//   21   48:ldc1            #20  <String "RSA">
	//   22   50:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   23   53:pop             
		algorithmNames.put("1.2.840.113549.1.1.5", "RSA");
	//   24   54:getstatic       #16  <Field HashMap algorithmNames>
	//   25   57:ldc1            #34  <String "1.2.840.113549.1.1.5">
	//   26   59:ldc1            #20  <String "RSA">
	//   27   61:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   28   64:pop             
		algorithmNames.put("1.2.840.113549.1.1.14", "RSA");
	//   29   65:getstatic       #16  <Field HashMap algorithmNames>
	//   30   68:ldc1            #36  <String "1.2.840.113549.1.1.14">
	//   31   70:ldc1            #20  <String "RSA">
	//   32   72:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   33   75:pop             
		algorithmNames.put("1.2.840.113549.1.1.11", "RSA");
	//   34   76:getstatic       #16  <Field HashMap algorithmNames>
	//   35   79:ldc1            #38  <String "1.2.840.113549.1.1.11">
	//   36   81:ldc1            #20  <String "RSA">
	//   37   83:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   38   86:pop             
		algorithmNames.put("1.2.840.113549.1.1.12", "RSA");
	//   39   87:getstatic       #16  <Field HashMap algorithmNames>
	//   40   90:ldc1            #40  <String "1.2.840.113549.1.1.12">
	//   41   92:ldc1            #20  <String "RSA">
	//   42   94:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   43   97:pop             
		algorithmNames.put("1.2.840.113549.1.1.13", "RSA");
	//   44   98:getstatic       #16  <Field HashMap algorithmNames>
	//   45  101:ldc1            #42  <String "1.2.840.113549.1.1.13">
	//   46  103:ldc1            #20  <String "RSA">
	//   47  105:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   48  108:pop             
		algorithmNames.put("1.2.840.10040.4.3", "DSA");
	//   49  109:getstatic       #16  <Field HashMap algorithmNames>
	//   50  112:ldc1            #44  <String "1.2.840.10040.4.3">
	//   51  114:ldc1            #28  <String "DSA">
	//   52  116:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   53  119:pop             
		algorithmNames.put("2.16.840.1.101.3.4.3.1", "DSA");
	//   54  120:getstatic       #16  <Field HashMap algorithmNames>
	//   55  123:ldc1            #46  <String "2.16.840.1.101.3.4.3.1">
	//   56  125:ldc1            #28  <String "DSA">
	//   57  127:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   58  130:pop             
		algorithmNames.put("2.16.840.1.101.3.4.3.2", "DSA");
	//   59  131:getstatic       #16  <Field HashMap algorithmNames>
	//   60  134:ldc1            #48  <String "2.16.840.1.101.3.4.3.2">
	//   61  136:ldc1            #28  <String "DSA">
	//   62  138:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   63  141:pop             
		algorithmNames.put("1.3.14.3.2.29", "RSA");
	//   64  142:getstatic       #16  <Field HashMap algorithmNames>
	//   65  145:ldc1            #50  <String "1.3.14.3.2.29">
	//   66  147:ldc1            #20  <String "RSA">
	//   67  149:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   68  152:pop             
		algorithmNames.put("1.3.36.3.3.1.2", "RSA");
	//   69  153:getstatic       #16  <Field HashMap algorithmNames>
	//   70  156:ldc1            #52  <String "1.3.36.3.3.1.2">
	//   71  158:ldc1            #20  <String "RSA">
	//   72  160:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   73  163:pop             
		algorithmNames.put("1.3.36.3.3.1.3", "RSA");
	//   74  164:getstatic       #16  <Field HashMap algorithmNames>
	//   75  167:ldc1            #54  <String "1.3.36.3.3.1.3">
	//   76  169:ldc1            #20  <String "RSA">
	//   77  171:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   78  174:pop             
		algorithmNames.put("1.3.36.3.3.1.4", "RSA");
	//   79  175:getstatic       #16  <Field HashMap algorithmNames>
	//   80  178:ldc1            #56  <String "1.3.36.3.3.1.4">
	//   81  180:ldc1            #20  <String "RSA">
	//   82  182:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   83  185:pop             
		algorithmNames.put("1.2.643.2.2.19", "ECGOST3410");
	//   84  186:getstatic       #16  <Field HashMap algorithmNames>
	//   85  189:ldc1            #58  <String "1.2.643.2.2.19">
	//   86  191:ldc1            #60  <String "ECGOST3410">
	//   87  193:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
	//   88  196:pop             
	//*  89  197:return          
	}
}
