// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


public final class JsonEncoding extends Enum
{

	private JsonEncoding(String s, int i, String s1, boolean flag, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #56  <Method void Enum(String, int)>
		_javaName = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #58  <Field String _javaName>
		_bigEndian = flag;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #60  <Field boolean _bigEndian>
		_bits = j;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #62  <Field int _bits>
	//   13   23:return          
	}

	public static JsonEncoding valueOf(String s)
	{
		return (JsonEncoding)Enum.valueOf(com/fasterxml/jackson/core/JsonEncoding, s);
	//    0    0:ldc1            #2   <Class JsonEncoding>
	//    1    2:aload_0         
	//    2    3:invokestatic    #69  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonEncoding>
	//    4    9:areturn         
	}

	public static JsonEncoding[] values()
	{
		return (JsonEncoding[])((JsonEncoding []) ($VALUES)).clone();
	//    0    0:getstatic       #52  <Field JsonEncoding[] $VALUES>
	//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.fasterxml.jackson.core.JsonEncoding_3B_.clone()>
	//    2    6:checkcast       #72  <Class JsonEncoding[]>
	//    3    9:areturn         
	}

	public int bits()
	{
		return _bits;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int _bits>
	//    2    4:ireturn         
	}

	public String getJavaName()
	{
		return _javaName;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String _javaName>
	//    2    4:areturn         
	}

	public boolean isBigEndian()
	{
		return _bigEndian;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean _bigEndian>
	//    2    4:ireturn         
	}

	private static final JsonEncoding $VALUES[];
	public static final JsonEncoding UTF16_BE;
	public static final JsonEncoding UTF16_LE;
	public static final JsonEncoding UTF32_BE;
	public static final JsonEncoding UTF32_LE;
	public static final JsonEncoding UTF8;
	protected final boolean _bigEndian;
	protected final int _bits;
	protected final String _javaName;

	static 
	{
		UTF8 = new JsonEncoding("UTF8", 0, "UTF-8", false, 8);
	//    0    0:new             #2   <Class JsonEncoding>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "UTF8">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "UTF-8">
	//    5    9:iconst_0        
	//    6   10:bipush          8
	//    7   12:invokespecial   #28  <Method void JsonEncoding(String, int, String, boolean, int)>
	//    8   15:putstatic       #30  <Field JsonEncoding UTF8>
		UTF16_BE = new JsonEncoding("UTF16_BE", 1, "UTF-16BE", true, 16);
	//    9   18:new             #2   <Class JsonEncoding>
	//   10   21:dup             
	//   11   22:ldc1            #31  <String "UTF16_BE">
	//   12   24:iconst_1        
	//   13   25:ldc1            #33  <String "UTF-16BE">
	//   14   27:iconst_1        
	//   15   28:bipush          16
	//   16   30:invokespecial   #28  <Method void JsonEncoding(String, int, String, boolean, int)>
	//   17   33:putstatic       #35  <Field JsonEncoding UTF16_BE>
		UTF16_LE = new JsonEncoding("UTF16_LE", 2, "UTF-16LE", false, 16);
	//   18   36:new             #2   <Class JsonEncoding>
	//   19   39:dup             
	//   20   40:ldc1            #36  <String "UTF16_LE">
	//   21   42:iconst_2        
	//   22   43:ldc1            #38  <String "UTF-16LE">
	//   23   45:iconst_0        
	//   24   46:bipush          16
	//   25   48:invokespecial   #28  <Method void JsonEncoding(String, int, String, boolean, int)>
	//   26   51:putstatic       #40  <Field JsonEncoding UTF16_LE>
		UTF32_BE = new JsonEncoding("UTF32_BE", 3, "UTF-32BE", true, 32);
	//   27   54:new             #2   <Class JsonEncoding>
	//   28   57:dup             
	//   29   58:ldc1            #41  <String "UTF32_BE">
	//   30   60:iconst_3        
	//   31   61:ldc1            #43  <String "UTF-32BE">
	//   32   63:iconst_1        
	//   33   64:bipush          32
	//   34   66:invokespecial   #28  <Method void JsonEncoding(String, int, String, boolean, int)>
	//   35   69:putstatic       #45  <Field JsonEncoding UTF32_BE>
		UTF32_LE = new JsonEncoding("UTF32_LE", 4, "UTF-32LE", false, 32);
	//   36   72:new             #2   <Class JsonEncoding>
	//   37   75:dup             
	//   38   76:ldc1            #46  <String "UTF32_LE">
	//   39   78:iconst_4        
	//   40   79:ldc1            #48  <String "UTF-32LE">
	//   41   81:iconst_0        
	//   42   82:bipush          32
	//   43   84:invokespecial   #28  <Method void JsonEncoding(String, int, String, boolean, int)>
	//   44   87:putstatic       #50  <Field JsonEncoding UTF32_LE>
		$VALUES = (new JsonEncoding[] {
			UTF8, UTF16_BE, UTF16_LE, UTF32_BE, UTF32_LE
		});
	//   45   90:iconst_5        
	//   46   91:anewarray       JsonEncoding[]
	//   47   94:dup             
	//   48   95:iconst_0        
	//   49   96:getstatic       #30  <Field JsonEncoding UTF8>
	//   50   99:aastore         
	//   51  100:dup             
	//   52  101:iconst_1        
	//   53  102:getstatic       #35  <Field JsonEncoding UTF16_BE>
	//   54  105:aastore         
	//   55  106:dup             
	//   56  107:iconst_2        
	//   57  108:getstatic       #40  <Field JsonEncoding UTF16_LE>
	//   58  111:aastore         
	//   59  112:dup             
	//   60  113:iconst_3        
	//   61  114:getstatic       #45  <Field JsonEncoding UTF32_BE>
	//   62  117:aastore         
	//   63  118:dup             
	//   64  119:iconst_4        
	//   65  120:getstatic       #50  <Field JsonEncoding UTF32_LE>
	//   66  123:aastore         
	//   67  124:putstatic       #52  <Field JsonEncoding[] $VALUES>
	//*  68  127:return          
	}
}
