// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//			Base64Variant

public final class Base64Variants
{

	public Base64Variants()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
	//    2    4:return          
	}

	public static Base64Variant getDefaultVariant()
	{
		return MIME_NO_LINEFEEDS;
	//    0    0:getstatic       #32  <Field Base64Variant MIME_NO_LINEFEEDS>
	//    1    3:areturn         
	}

	public static Base64Variant valueOf(String s)
		throws IllegalArgumentException
	{
		if(MIME._name.equals(((Object) (s))))
	//*   0    0:getstatic       #24  <Field Base64Variant MIME>
	//*   1    3:getfield        #75  <Field String Base64Variant._name>
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*   4   10:ifeq            17
			return MIME;
	//    5   13:getstatic       #24  <Field Base64Variant MIME>
	//    6   16:areturn         
		if(MIME_NO_LINEFEEDS._name.equals(((Object) (s))))
	//*   7   17:getstatic       #32  <Field Base64Variant MIME_NO_LINEFEEDS>
	//*   8   20:getfield        #75  <Field String Base64Variant._name>
	//*   9   23:aload_0         
	//*  10   24:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  11   27:ifeq            34
			return MIME_NO_LINEFEEDS;
	//   12   30:getstatic       #32  <Field Base64Variant MIME_NO_LINEFEEDS>
	//   13   33:areturn         
		if(PEM._name.equals(((Object) (s))))
	//*  14   34:getstatic       #38  <Field Base64Variant PEM>
	//*  15   37:getfield        #75  <Field String Base64Variant._name>
	//*  16   40:aload_0         
	//*  17   41:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  18   44:ifeq            51
			return PEM;
	//   19   47:getstatic       #38  <Field Base64Variant PEM>
	//   20   50:areturn         
		if(MODIFIED_FOR_URL._name.equals(((Object) (s))))
	//*  21   51:getstatic       #63  <Field Base64Variant MODIFIED_FOR_URL>
	//*  22   54:getfield        #75  <Field String Base64Variant._name>
	//*  23   57:aload_0         
	//*  24   58:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  25   61:ifeq            68
			return MODIFIED_FOR_URL;
	//   26   64:getstatic       #63  <Field Base64Variant MODIFIED_FOR_URL>
	//   27   67:areturn         
		if(s == null)
	//*  28   68:aload_0         
	//*  29   69:ifnonnull       78
		{
			s = "<null>";
	//   30   72:ldc1            #83  <String "<null>">
	//   31   74:astore_0        
		} else
	//*  32   75:goto            111
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   78:new             #40  <Class StringBuilder>
	//   34   81:dup             
	//   35   82:invokespecial   #84  <Method void StringBuilder()>
	//   36   85:astore_1        
			stringbuilder.append("'");
	//   37   86:aload_1         
	//   38   87:ldc1            #86  <String "'">
	//   39   89:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   40   92:pop             
			stringbuilder.append(s);
	//   41   93:aload_1         
	//   42   94:aload_0         
	//   43   95:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   44   98:pop             
			stringbuilder.append("'");
	//   45   99:aload_1         
	//   46  100:ldc1            #86  <String "'">
	//   47  102:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   48  105:pop             
			s = stringbuilder.toString();
	//   49  106:aload_1         
	//   50  107:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   51  110:astore_0        
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//   52  111:new             #40  <Class StringBuilder>
	//   53  114:dup             
	//   54  115:invokespecial   #84  <Method void StringBuilder()>
	//   55  118:astore_1        
		stringbuilder1.append("No Base64Variant with name ");
	//   56  119:aload_1         
	//   57  120:ldc1            #92  <String "No Base64Variant with name ">
	//   58  122:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   59  125:pop             
		stringbuilder1.append(s);
	//   60  126:aload_1         
	//   61  127:aload_0         
	//   62  128:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   63  131:pop             
		throw new IllegalArgumentException(stringbuilder1.toString());
	//   64  132:new             #72  <Class IllegalArgumentException>
	//   65  135:dup             
	//   66  136:aload_1         
	//   67  137:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   68  140:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   69  143:athrow          
	}

	public static final Base64Variant MIME;
	public static final Base64Variant MIME_NO_LINEFEEDS;
	public static final Base64Variant MODIFIED_FOR_URL;
	public static final Base64Variant PEM;
	static final String STD_BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

	static 
	{
		MIME = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
	//    0    0:new             #17  <Class Base64Variant>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "MIME">
	//    3    6:ldc1            #13  <String "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/">
	//    4    8:iconst_1        
	//    5    9:bipush          61
	//    6   11:bipush          76
	//    7   13:invokespecial   #22  <Method void Base64Variant(String, String, boolean, char, int)>
	//    8   16:putstatic       #24  <Field Base64Variant MIME>
		MIME_NO_LINEFEEDS = new Base64Variant(MIME, "MIME-NO-LINEFEEDS", 0x7fffffff);
	//    9   19:new             #17  <Class Base64Variant>
	//   10   22:dup             
	//   11   23:getstatic       #24  <Field Base64Variant MIME>
	//   12   26:ldc1            #26  <String "MIME-NO-LINEFEEDS">
	//   13   28:ldc1            #27  <Int 0x7fffffff>
	//   14   30:invokespecial   #30  <Method void Base64Variant(Base64Variant, String, int)>
	//   15   33:putstatic       #32  <Field Base64Variant MIME_NO_LINEFEEDS>
		PEM = new Base64Variant(MIME, "PEM", true, '=', 64);
	//   16   36:new             #17  <Class Base64Variant>
	//   17   39:dup             
	//   18   40:getstatic       #24  <Field Base64Variant MIME>
	//   19   43:ldc1            #33  <String "PEM">
	//   20   45:iconst_1        
	//   21   46:bipush          61
	//   22   48:bipush          64
	//   23   50:invokespecial   #36  <Method void Base64Variant(Base64Variant, String, boolean, char, int)>
	//   24   53:putstatic       #38  <Field Base64Variant PEM>
		StringBuilder stringbuilder = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
	//   25   56:new             #40  <Class StringBuilder>
	//   26   59:dup             
	//   27   60:ldc1            #13  <String "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/">
	//   28   62:invokespecial   #43  <Method void StringBuilder(String)>
	//   29   65:astore_0        
		stringbuilder.setCharAt(stringbuilder.indexOf("+"), '-');
	//   30   66:aload_0         
	//   31   67:aload_0         
	//   32   68:ldc1            #45  <String "+">
	//   33   70:invokevirtual   #49  <Method int StringBuilder.indexOf(String)>
	//   34   73:bipush          45
	//   35   75:invokevirtual   #53  <Method void StringBuilder.setCharAt(int, char)>
		stringbuilder.setCharAt(stringbuilder.indexOf("/"), '_');
	//   36   78:aload_0         
	//   37   79:aload_0         
	//   38   80:ldc1            #55  <String "/">
	//   39   82:invokevirtual   #49  <Method int StringBuilder.indexOf(String)>
	//   40   85:bipush          95
	//   41   87:invokevirtual   #53  <Method void StringBuilder.setCharAt(int, char)>
		MODIFIED_FOR_URL = new Base64Variant("MODIFIED-FOR-URL", stringbuilder.toString(), false, '\0', 0x7fffffff);
	//   42   90:new             #17  <Class Base64Variant>
	//   43   93:dup             
	//   44   94:ldc1            #57  <String "MODIFIED-FOR-URL">
	//   45   96:aload_0         
	//   46   97:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   47  100:iconst_0        
	//   48  101:iconst_0        
	//   49  102:ldc1            #27  <Int 0x7fffffff>
	//   50  104:invokespecial   #22  <Method void Base64Variant(String, String, boolean, char, int)>
	//   51  107:putstatic       #63  <Field Base64Variant MODIFIED_FOR_URL>
	//*  52  110:return          
	}
}
