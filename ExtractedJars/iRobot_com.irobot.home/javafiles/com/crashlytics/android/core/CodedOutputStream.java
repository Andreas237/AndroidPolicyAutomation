// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.*;

// Referenced classes of package com.crashlytics.android.core:
//			ByteString, WireFormat

final class CodedOutputStream
	implements Flushable
{
	static class OutOfSpaceException extends IOException
	{

		private static final long serialVersionUID = 0x52ce6e25L;

		OutOfSpaceException()
		{
			super("CodedOutputStream was writing to a flat byte array and ran out of space.");
		//    0    0:aload_0         
		//    1    1:ldc1            #15  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
		//    2    3:invokespecial   #18  <Method void IOException(String)>
		//    3    6:return          
		}
	}


	private CodedOutputStream(OutputStream outputstream, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		output = outputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field OutputStream output>
		buffer = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field byte[] buffer>
		position = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #33  <Field int position>
		limit = abyte0.length;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:arraylength     
	//   14   22:putfield        #35  <Field int limit>
	//   15   25:return          
	}

	private CodedOutputStream(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		output = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field OutputStream output>
		buffer = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #31  <Field byte[] buffer>
		position = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #33  <Field int position>
		limit = i + j;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iadd            
	//   15   23:putfield        #35  <Field int limit>
	//   16   26:return          
	}

	public static int computeBoolSize(int i, boolean flag)
	{
		return computeTagSize(i) + computeBoolSizeNoTag(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #47  <Method int computeBoolSizeNoTag(boolean)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeBoolSizeNoTag(boolean flag)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static int computeBytesSize(int i, ByteString bytestring)
	{
		return computeTagSize(i) + computeBytesSizeNoTag(bytestring);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #53  <Method int computeBytesSizeNoTag(ByteString)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeBytesSizeNoTag(ByteString bytestring)
	{
		return computeRawVarint32Size(bytestring.size()) + bytestring.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method int ByteString.size()>
	//    2    4:invokestatic    #62  <Method int computeRawVarint32Size(int)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #59  <Method int ByteString.size()>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static int computeDoubleSize(int i, double d)
	{
		return computeTagSize(i) + computeDoubleSizeNoTag(d);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:dload_1         
	//    3    5:invokestatic    #68  <Method int computeDoubleSizeNoTag(double)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeDoubleSizeNoTag(double d)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int computeEnumSize(int i, int j)
	{
		return computeTagSize(i) + computeEnumSizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #73  <Method int computeEnumSizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeEnumSizeNoTag(int i)
	{
		return computeInt32SizeNoTag(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #76  <Method int computeInt32SizeNoTag(int)>
	//    2    4:ireturn         
	}

	public static int computeFixed32Size(int i, int j)
	{
		return computeTagSize(i) + computeFixed32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #80  <Method int computeFixed32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeFixed32SizeNoTag(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int computeFixed64Size(int i, long l)
	{
		return computeTagSize(i) + computeFixed64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #86  <Method int computeFixed64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeFixed64SizeNoTag(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int computeFloatSize(int i, float f)
	{
		return computeTagSize(i) + computeFloatSizeNoTag(f);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:fload_1         
	//    3    5:invokestatic    #92  <Method int computeFloatSizeNoTag(float)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeFloatSizeNoTag(float f)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int computeInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #76  <Method int computeInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeInt32SizeNoTag(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return computeRawVarint32Size(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #62  <Method int computeRawVarint32Size(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int computeInt64Size(int i, long l)
	{
		return computeTagSize(i) + computeInt64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #97  <Method int computeInt64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeInt64SizeNoTag(long l)
	{
		return computeRawVarint64Size(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #100 <Method int computeRawVarint64Size(long)>
	//    2    4:ireturn         
	}

	static int computePreferredBufferSize(int i)
	{
		if(i > 4096)
	//*   0    0:iload_0         
	//*   1    1:sipush          4096
	//*   2    4:icmple          11
			return 4096;
	//    3    7:sipush          4096
	//    4   10:ireturn         
		else
			return i;
	//    5   11:iload_0         
	//    6   12:ireturn         
	}

	public static int computeRawMessageSetExtensionSize(int i, ByteString bytestring)
	{
		return computeTagSize(1) * 2 + computeUInt32Size(2, i) + computeBytesSize(3, bytestring);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #105 <Method int computeUInt32Size(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #107 <Method int computeBytesSize(int, ByteString)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int computeRawVarint32Size(int i)
	{
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            9
			return 1;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if((i & 0xffffc000) == 0)
	//*   6    9:iload_0         
	//*   7   10:sipush          -16384
	//*   8   13:iand            
	//*   9   14:ifne            19
			return 2;
	//   10   17:iconst_2        
	//   11   18:ireturn         
		if((0xffe00000 & i) == 0)
	//*  12   19:ldc1            #108 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #109 <Int 0xf0000000>
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int computeRawVarint64Size(long l)
	{
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #110 <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if((-16384L & l) == 0L)
	//*   8   12:ldc2w           #112 <Long -16384L>
	//*   9   15:lload_0         
	//*  10   16:land            
	//*  11   17:lconst_0        
	//*  12   18:lcmp            
	//*  13   19:ifne            24
			return 2;
	//   14   22:iconst_2        
	//   15   23:ireturn         
		if((0xffe00000L & l) == 0L)
	//*  16   24:ldc2w           #114 <Long 0xffe00000L>
	//*  17   27:lload_0         
	//*  18   28:land            
	//*  19   29:lconst_0        
	//*  20   30:lcmp            
	//*  21   31:ifne            36
			return 3;
	//   22   34:iconst_3        
	//   23   35:ireturn         
		if((0xf0000000L & l) == 0L)
	//*  24   36:ldc2w           #116 <Long 0xf0000000L>
	//*  25   39:lload_0         
	//*  26   40:land            
	//*  27   41:lconst_0        
	//*  28   42:lcmp            
	//*  29   43:ifne            48
			return 4;
	//   30   46:iconst_4        
	//   31   47:ireturn         
		if((0x0L & l) == 0L)
	//*  32   48:ldc2w           #118 <Long 0x0L>
	//*  33   51:lload_0         
	//*  34   52:land            
	//*  35   53:lconst_0        
	//*  36   54:lcmp            
	//*  37   55:ifne            60
			return 5;
	//   38   58:iconst_5        
	//   39   59:ireturn         
		if((0x0L & l) == 0L)
	//*  40   60:ldc2w           #120 <Long 0x0L>
	//*  41   63:lload_0         
	//*  42   64:land            
	//*  43   65:lconst_0        
	//*  44   66:lcmp            
	//*  45   67:ifne            73
			return 6;
	//   46   70:bipush          6
	//   47   72:ireturn         
		if((0x0L & l) == 0L)
	//*  48   73:ldc2w           #122 <Long 0x0L>
	//*  49   76:lload_0         
	//*  50   77:land            
	//*  51   78:lconst_0        
	//*  52   79:lcmp            
	//*  53   80:ifne            86
			return 7;
	//   54   83:bipush          7
	//   55   85:ireturn         
		if((0x0L & l) == 0L)
	//*  56   86:ldc2w           #124 <Long 0x0L>
	//*  57   89:lload_0         
	//*  58   90:land            
	//*  59   91:lconst_0        
	//*  60   92:lcmp            
	//*  61   93:ifne            99
			return 8;
	//   62   96:bipush          8
	//   63   98:ireturn         
		return (l & 0x0L) != 0L ? 10 : 9;
	//   64   99:lload_0         
	//   65  100:ldc2w           #126 <Long 0x0L>
	//   66  103:land            
	//   67  104:lconst_0        
	//   68  105:lcmp            
	//   69  106:ifne            112
	//   70  109:bipush          9
	//   71  111:ireturn         
	//   72  112:bipush          10
	//   73  114:ireturn         
	}

	public static int computeSFixed32Size(int i, int j)
	{
		return computeTagSize(i) + computeSFixed32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #131 <Method int computeSFixed32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSFixed32SizeNoTag(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int computeSFixed64Size(int i, long l)
	{
		return computeTagSize(i) + computeSFixed64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #135 <Method int computeSFixed64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSFixed64SizeNoTag(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int computeSInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeSInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #139 <Method int computeSInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSInt32SizeNoTag(int i)
	{
		return computeRawVarint32Size(encodeZigZag32(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #142 <Method int encodeZigZag32(int)>
	//    2    4:invokestatic    #62  <Method int computeRawVarint32Size(int)>
	//    3    7:ireturn         
	}

	public static int computeSInt64Size(int i, long l)
	{
		return computeTagSize(i) + computeSInt64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #146 <Method int computeSInt64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSInt64SizeNoTag(long l)
	{
		return computeRawVarint64Size(encodeZigZag64(l));
	//    0    0:lload_0         
	//    1    1:invokestatic    #150 <Method long encodeZigZag64(long)>
	//    2    4:invokestatic    #100 <Method int computeRawVarint64Size(long)>
	//    3    7:ireturn         
	}

	public static int computeStringSize(int i, String s)
	{
		return computeTagSize(i) + computeStringSizeNoTag(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #156 <Method int computeStringSizeNoTag(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeStringSizeNoTag(String s)
	{
		int i;
		int j;
		try
		{
			s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_0         
	//    1    1:ldc1            #160 <String "UTF-8">
	//    2    3:invokevirtual   #166 <Method byte[] String.getBytes(String)>
	//    3    6:astore_0        
			i = computeRawVarint32Size(s.length);
	//    4    7:aload_0         
	//    5    8:arraylength     
	//    6    9:invokestatic    #62  <Method int computeRawVarint32Size(int)>
	//    7   12:istore_1        
			j = s.length;
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:istore_2        
		}
	//*  11   16:iload_1         
	//*  12   17:iload_2         
	//*  13   18:iadd            
	//*  14   19:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   20:astore_0        
		{
			throw new RuntimeException("UTF-8 not supported.", ((Throwable) (s)));
	//   16   21:new             #168 <Class RuntimeException>
	//   17   24:dup             
	//   18   25:ldc1            #170 <String "UTF-8 not supported.">
	//   19   27:aload_0         
	//   20   28:invokespecial   #173 <Method void RuntimeException(String, Throwable)>
	//   21   31:athrow          
		}
		return i + j;
	}

	public static int computeTagSize(int i)
	{
		return computeRawVarint32Size(WireFormat.makeTag(i, 0));
	//    0    0:iload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #178 <Method int WireFormat.makeTag(int, int)>
	//    3    5:invokestatic    #62  <Method int computeRawVarint32Size(int)>
	//    4    8:ireturn         
	}

	public static int computeUInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeUInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #181 <Method int computeUInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeUInt32SizeNoTag(int i)
	{
		return computeRawVarint32Size(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #62  <Method int computeRawVarint32Size(int)>
	//    2    4:ireturn         
	}

	public static int computeUInt64Size(int i, long l)
	{
		return computeTagSize(i) + computeUInt64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #185 <Method int computeUInt64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeUInt64SizeNoTag(long l)
	{
		return computeRawVarint64Size(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #100 <Method int computeRawVarint64Size(long)>
	//    2    4:ireturn         
	}

	public static int encodeZigZag32(int i)
	{
		return i >> 31 ^ i << 1;
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:ishr            
	//    3    4:iload_0         
	//    4    5:iconst_1        
	//    5    6:ishl            
	//    6    7:ixor            
	//    7    8:ireturn         
	}

	public static long encodeZigZag64(long l)
	{
		return l >> 63 ^ l << 1;
	//    0    0:lload_0         
	//    1    1:bipush          63
	//    2    3:lshr            
	//    3    4:lload_0         
	//    4    5:iconst_1        
	//    5    6:lshl            
	//    6    7:lxor            
	//    7    8:lreturn         
	}

	public static CodedOutputStream newInstance(OutputStream outputstream)
	{
		return newInstance(outputstream, 4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokestatic    #190 <Method CodedOutputStream newInstance(OutputStream, int)>
	//    3    7:areturn         
	}

	public static CodedOutputStream newInstance(OutputStream outputstream, int i)
	{
		return new CodedOutputStream(outputstream, new byte[i]);
	//    0    0:new             #2   <Class CodedOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:invokespecial   #192 <Method void CodedOutputStream(OutputStream, byte[])>
	//    6   11:areturn         
	}

	public static CodedOutputStream newInstance(byte abyte0[])
	{
		return newInstance(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #196 <Method CodedOutputStream newInstance(byte[], int, int)>
	//    5    7:areturn         
	}

	public static CodedOutputStream newInstance(byte abyte0[], int i, int j)
	{
		return new CodedOutputStream(abyte0, i, j);
	//    0    0:new             #2   <Class CodedOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #198 <Method void CodedOutputStream(byte[], int, int)>
	//    6   10:areturn         
	}

	private void refreshBuffer()
	{
		if(output == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field OutputStream output>
	//*   2    4:ifnonnull       15
		{
			throw new OutOfSpaceException();
	//    3    7:new             #8   <Class CodedOutputStream$OutOfSpaceException>
	//    4   10:dup             
	//    5   11:invokespecial   #200 <Method void CodedOutputStream$OutOfSpaceException()>
	//    6   14:athrow          
		} else
		{
			output.write(buffer, 0, position);
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field OutputStream output>
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field byte[] buffer>
	//   11   23:iconst_0        
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field int position>
	//   14   28:invokevirtual   #205 <Method void OutputStream.write(byte[], int, int)>
			position = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #33  <Field int position>
			return;
	//   18   36:return          
		}
	}

	public void checkNoSpaceLeft()
	{
		if(spaceLeft() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #209 <Method int spaceLeft()>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Did not write as much data as expected.");
	//    3    7:new             #211 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #213 <String "Did not write as much data as expected.">
	//    6   13:invokespecial   #216 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public void flush()
	{
		if(output != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field OutputStream output>
	//*   2    4:ifnull          11
			refreshBuffer();
	//    3    7:aload_0         
	//    4    8:invokespecial   #219 <Method void refreshBuffer()>
	//    5   11:return          
	}

	public int spaceLeft()
	{
		if(output == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field OutputStream output>
	//*   2    4:ifnonnull       17
			return limit - position;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field int limit>
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field int position>
	//    7   15:isub            
	//    8   16:ireturn         
		else
			throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
	//    9   17:new             #221 <Class UnsupportedOperationException>
	//   10   20:dup             
	//   11   21:ldc1            #223 <String "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.">
	//   12   23:invokespecial   #224 <Method void UnsupportedOperationException(String)>
	//   13   26:athrow          
	}

	public void writeBool(int i, boolean flag)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeBoolNoTag(flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #234 <Method void writeBoolNoTag(boolean)>
	//    7   11:return          
	}

	public void writeBoolNoTag(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #168 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #236 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #239 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void writeBytes(int i, ByteString bytestring)
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeBytesNoTag(bytestring);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #245 <Method void writeBytesNoTag(ByteString)>
	//    7   11:return          
	}

	public void writeBytesNoTag(ByteString bytestring)
	{
		writeRawVarint32(bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method int ByteString.size()>
	//    3    5:invokevirtual   #249 <Method void writeRawVarint32(int)>
		writeRawBytes(bytestring);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #252 <Method void writeRawBytes(ByteString)>
	//    7   13:return          
	}

	public void writeDouble(int i, double d)
	{
		writeTag(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeDoubleNoTag(d);
	//    4    6:aload_0         
	//    5    7:dload_2         
	//    6    8:invokevirtual   #258 <Method void writeDoubleNoTag(double)>
	//    7   11:return          
	}

	public void writeDoubleNoTag(double d)
	{
		writeRawLittleEndian64(Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #264 <Method long Double.doubleToRawLongBits(double)>
	//    3    5:invokevirtual   #268 <Method void writeRawLittleEndian64(long)>
	//    4    8:return          
	}

	public void writeEnum(int i, int j)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeEnumNoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #272 <Method void writeEnumNoTag(int)>
	//    7   11:return          
	}

	public void writeEnumNoTag(int i)
	{
		writeInt32NoTag(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #275 <Method void writeInt32NoTag(int)>
	//    3    5:return          
	}

	public void writeFixed32(int i, int j)
	{
		writeTag(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeFixed32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #279 <Method void writeFixed32NoTag(int)>
	//    7   11:return          
	}

	public void writeFixed32NoTag(int i)
	{
		writeRawLittleEndian32(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #282 <Method void writeRawLittleEndian32(int)>
	//    3    5:return          
	}

	public void writeFixed64(int i, long l)
	{
		writeTag(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeFixed64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #287 <Method void writeFixed64NoTag(long)>
	//    7   11:return          
	}

	public void writeFixed64NoTag(long l)
	{
		writeRawLittleEndian64(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #268 <Method void writeRawLittleEndian64(long)>
	//    3    5:return          
	}

	public void writeFloat(int i, float f)
	{
		writeTag(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeFloatNoTag(f);
	//    4    6:aload_0         
	//    5    7:fload_2         
	//    6    8:invokevirtual   #293 <Method void writeFloatNoTag(float)>
	//    7   11:return          
	}

	public void writeFloatNoTag(float f)
	{
		writeRawLittleEndian32(Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #298 <Method int Float.floatToRawIntBits(float)>
	//    3    5:invokevirtual   #282 <Method void writeRawLittleEndian32(int)>
	//    4    8:return          
	}

	public void writeInt32(int i, int j)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #275 <Method void writeInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeInt32NoTag(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			writeRawVarint32(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #249 <Method void writeRawVarint32(int)>
			return;
	//    5    9:return          
		} else
		{
			writeRawVarint64(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #302 <Method void writeRawVarint64(long)>
			return;
	//   10   16:return          
		}
	}

	public void writeInt64(int i, long l)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeInt64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #306 <Method void writeInt64NoTag(long)>
	//    7   11:return          
	}

	public void writeInt64NoTag(long l)
	{
		writeRawVarint64(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #302 <Method void writeRawVarint64(long)>
	//    3    5:return          
	}

	public void writeRawByte(byte byte0)
	{
		if(position == limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int position>
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field int limit>
	//*   4    8:icmpne          15
			refreshBuffer();
	//    5   11:aload_0         
	//    6   12:invokespecial   #219 <Method void refreshBuffer()>
		byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #31  <Field byte[] buffer>
	//    9   19:astore_3        
		int i = position;
	//   10   20:aload_0         
	//   11   21:getfield        #33  <Field int position>
	//   12   24:istore_2        
		position = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #33  <Field int position>
		abyte0[i] = byte0;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:iload_1         
	//   21   35:bastore         
	//   22   36:return          
	}

	public void writeRawByte(int i)
	{
		writeRawByte((byte)i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #310 <Method void writeRawByte(byte)>
	//    4    6:return          
	}

	public void writeRawBytes(ByteString bytestring)
	{
		writeRawBytes(bytestring, 0, bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #59  <Method int ByteString.size()>
	//    5    7:invokevirtual   #313 <Method void writeRawBytes(ByteString, int, int)>
	//    6   10:return          
	}

	public void writeRawBytes(ByteString bytestring, int i, int j)
	{
		if(limit - position >= j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int limit>
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field int position>
	//*   4    8:isub            
	//*   5    9:iload_3         
	//*   6   10:icmplt          38
		{
			bytestring.copyTo(buffer, i, position, j);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field byte[] buffer>
	//   10   18:iload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field int position>
	//   13   23:iload_3         
	//   14   24:invokevirtual   #317 <Method void ByteString.copyTo(byte[], int, int, int)>
			position = position + j;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #33  <Field int position>
	//   18   32:iload_3         
	//   19   33:iadd            
	//   20   34:putfield        #33  <Field int position>
			return;
	//   21   37:return          
		}
		int k = limit - position;
	//   22   38:aload_0         
	//   23   39:getfield        #35  <Field int limit>
	//   24   42:aload_0         
	//   25   43:getfield        #33  <Field int position>
	//   26   46:isub            
	//   27   47:istore          4
		bytestring.copyTo(buffer, i, position, k);
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:getfield        #31  <Field byte[] buffer>
	//   31   54:iload_2         
	//   32   55:aload_0         
	//   33   56:getfield        #33  <Field int position>
	//   34   59:iload           4
	//   35   61:invokevirtual   #317 <Method void ByteString.copyTo(byte[], int, int, int)>
		int i1 = i + k;
	//   36   64:iload_2         
	//   37   65:iload           4
	//   38   67:iadd            
	//   39   68:istore          5
		i = j - k;
	//   40   70:iload_3         
	//   41   71:iload           4
	//   42   73:isub            
	//   43   74:istore_2        
		position = limit;
	//   44   75:aload_0         
	//   45   76:aload_0         
	//   46   77:getfield        #35  <Field int limit>
	//   47   80:putfield        #33  <Field int position>
		refreshBuffer();
	//   48   83:aload_0         
	//   49   84:invokespecial   #219 <Method void refreshBuffer()>
		if(i <= limit)
	//*  50   87:iload_2         
	//*  51   88:aload_0         
	//*  52   89:getfield        #35  <Field int limit>
	//*  53   92:icmpgt          113
		{
			bytestring.copyTo(buffer, i1, 0, i);
	//   54   95:aload_1         
	//   55   96:aload_0         
	//   56   97:getfield        #31  <Field byte[] buffer>
	//   57  100:iload           5
	//   58  102:iconst_0        
	//   59  103:iload_2         
	//   60  104:invokevirtual   #317 <Method void ByteString.copyTo(byte[], int, int, int)>
			position = i;
	//   61  107:aload_0         
	//   62  108:iload_2         
	//   63  109:putfield        #33  <Field int position>
			return;
	//   64  112:return          
		}
		bytestring = ((ByteString) (bytestring.newInput()));
	//   65  113:aload_1         
	//   66  114:invokevirtual   #321 <Method InputStream ByteString.newInput()>
	//   67  117:astore_1        
		long l1 = i1;
	//   68  118:iload           5
	//   69  120:i2l             
	//   70  121:lstore          6
		if(l1 != ((InputStream) (bytestring)).skip(l1))
	//*  71  123:lload           6
	//*  72  125:aload_1         
	//*  73  126:lload           6
	//*  74  128:invokevirtual   #326 <Method long InputStream.skip(long)>
	//*  75  131:lcmp            
	//*  76  132:ifeq            146
			throw new IllegalStateException("Skip failed.");
	//   77  135:new             #211 <Class IllegalStateException>
	//   78  138:dup             
	//   79  139:ldc2            #328 <String "Skip failed.">
	//   80  142:invokespecial   #216 <Method void IllegalStateException(String)>
	//   81  145:athrow          
		int l;
		for(; i > 0; i -= l)
	//*  82  146:iload_2         
	//*  83  147:ifle            210
		{
			j = Math.min(i, limit);
	//   84  150:iload_2         
	//   85  151:aload_0         
	//   86  152:getfield        #35  <Field int limit>
	//   87  155:invokestatic    #333 <Method int Math.min(int, int)>
	//   88  158:istore_3        
			l = ((InputStream) (bytestring)).read(buffer, 0, j);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #31  <Field byte[] buffer>
	//   92  164:iconst_0        
	//   93  165:iload_3         
	//   94  166:invokevirtual   #337 <Method int InputStream.read(byte[], int, int)>
	//   95  169:istore          4
			if(l != j)
	//*  96  171:iload           4
	//*  97  173:iload_3         
	//*  98  174:icmpeq          188
				throw new IllegalStateException("Read failed.");
	//   99  177:new             #211 <Class IllegalStateException>
	//  100  180:dup             
	//  101  181:ldc2            #339 <String "Read failed.">
	//  102  184:invokespecial   #216 <Method void IllegalStateException(String)>
	//  103  187:athrow          
			output.write(buffer, 0, l);
	//  104  188:aload_0         
	//  105  189:getfield        #29  <Field OutputStream output>
	//  106  192:aload_0         
	//  107  193:getfield        #31  <Field byte[] buffer>
	//  108  196:iconst_0        
	//  109  197:iload           4
	//  110  199:invokevirtual   #205 <Method void OutputStream.write(byte[], int, int)>
		}

	//  111  202:iload_2         
	//  112  203:iload           4
	//  113  205:isub            
	//  114  206:istore_2        
	//* 115  207:goto            146
	//  116  210:return          
	}

	public void writeRawBytes(byte abyte0[])
	{
		writeRawBytes(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #342 <Method void writeRawBytes(byte[], int, int)>
	//    6    8:return          
	}

	public void writeRawBytes(byte abyte0[], int i, int j)
	{
		if(limit - position >= j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int limit>
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field int position>
	//*   4    8:isub            
	//*   5    9:iload_3         
	//*   6   10:icmplt          38
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field byte[] buffer>
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field int position>
	//   13   23:iload_3         
	//   14   24:invokestatic    #348 <Method void System.arraycopy(Object, int, Object, int, int)>
			position = position + j;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #33  <Field int position>
	//   18   32:iload_3         
	//   19   33:iadd            
	//   20   34:putfield        #33  <Field int position>
			return;
	//   21   37:return          
		}
		int k = limit - position;
	//   22   38:aload_0         
	//   23   39:getfield        #35  <Field int limit>
	//   24   42:aload_0         
	//   25   43:getfield        #33  <Field int position>
	//   26   46:isub            
	//   27   47:istore          4
		System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, k);
	//   28   49:aload_1         
	//   29   50:iload_2         
	//   30   51:aload_0         
	//   31   52:getfield        #31  <Field byte[] buffer>
	//   32   55:aload_0         
	//   33   56:getfield        #33  <Field int position>
	//   34   59:iload           4
	//   35   61:invokestatic    #348 <Method void System.arraycopy(Object, int, Object, int, int)>
		i += k;
	//   36   64:iload_2         
	//   37   65:iload           4
	//   38   67:iadd            
	//   39   68:istore_2        
		j -= k;
	//   40   69:iload_3         
	//   41   70:iload           4
	//   42   72:isub            
	//   43   73:istore_3        
		position = limit;
	//   44   74:aload_0         
	//   45   75:aload_0         
	//   46   76:getfield        #35  <Field int limit>
	//   47   79:putfield        #33  <Field int position>
		refreshBuffer();
	//   48   82:aload_0         
	//   49   83:invokespecial   #219 <Method void refreshBuffer()>
		if(j <= limit)
	//*  50   86:iload_3         
	//*  51   87:aload_0         
	//*  52   88:getfield        #35  <Field int limit>
	//*  53   91:icmpgt          111
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), 0, j);
	//   54   94:aload_1         
	//   55   95:iload_2         
	//   56   96:aload_0         
	//   57   97:getfield        #31  <Field byte[] buffer>
	//   58  100:iconst_0        
	//   59  101:iload_3         
	//   60  102:invokestatic    #348 <Method void System.arraycopy(Object, int, Object, int, int)>
			position = j;
	//   61  105:aload_0         
	//   62  106:iload_3         
	//   63  107:putfield        #33  <Field int position>
			return;
	//   64  110:return          
		} else
		{
			output.write(abyte0, i, j);
	//   65  111:aload_0         
	//   66  112:getfield        #29  <Field OutputStream output>
	//   67  115:aload_1         
	//   68  116:iload_2         
	//   69  117:iload_3         
	//   70  118:invokevirtual   #205 <Method void OutputStream.write(byte[], int, int)>
			return;
	//   71  121:return          
		}
	}

	public void writeRawLittleEndian32(int i)
	{
		writeRawByte(i & 0xff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:sipush          255
	//    3    5:iand            
	//    4    6:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte(i >> 8 & 0xff);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:bipush          8
	//    8   13:ishr            
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte(i >> 16 & 0xff);
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:bipush          16
	//   15   25:ishr            
	//   16   26:sipush          255
	//   17   29:iand            
	//   18   30:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte(i >> 24 & 0xff);
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:bipush          24
	//   22   37:ishr            
	//   23   38:sipush          255
	//   24   41:iand            
	//   25   42:invokevirtual   #350 <Method void writeRawByte(int)>
	//   26   45:return          
	}

	public void writeRawLittleEndian64(long l)
	{
		writeRawByte((int)l & 0xff);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:l2i             
	//    3    3:sipush          255
	//    4    6:iand            
	//    5    7:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte((int)(l >> 8) & 0xff);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:bipush          8
	//    9   14:lshr            
	//   10   15:l2i             
	//   11   16:sipush          255
	//   12   19:iand            
	//   13   20:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte((int)(l >> 16) & 0xff);
	//   14   23:aload_0         
	//   15   24:lload_1         
	//   16   25:bipush          16
	//   17   27:lshr            
	//   18   28:l2i             
	//   19   29:sipush          255
	//   20   32:iand            
	//   21   33:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte((int)(l >> 24) & 0xff);
	//   22   36:aload_0         
	//   23   37:lload_1         
	//   24   38:bipush          24
	//   25   40:lshr            
	//   26   41:l2i             
	//   27   42:sipush          255
	//   28   45:iand            
	//   29   46:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte((int)(l >> 32) & 0xff);
	//   30   49:aload_0         
	//   31   50:lload_1         
	//   32   51:bipush          32
	//   33   53:lshr            
	//   34   54:l2i             
	//   35   55:sipush          255
	//   36   58:iand            
	//   37   59:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte((int)(l >> 40) & 0xff);
	//   38   62:aload_0         
	//   39   63:lload_1         
	//   40   64:bipush          40
	//   41   66:lshr            
	//   42   67:l2i             
	//   43   68:sipush          255
	//   44   71:iand            
	//   45   72:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte((int)(l >> 48) & 0xff);
	//   46   75:aload_0         
	//   47   76:lload_1         
	//   48   77:bipush          48
	//   49   79:lshr            
	//   50   80:l2i             
	//   51   81:sipush          255
	//   52   84:iand            
	//   53   85:invokevirtual   #350 <Method void writeRawByte(int)>
		writeRawByte((int)(l >> 56) & 0xff);
	//   54   88:aload_0         
	//   55   89:lload_1         
	//   56   90:bipush          56
	//   57   92:lshr            
	//   58   93:l2i             
	//   59   94:sipush          255
	//   60   97:iand            
	//   61   98:invokevirtual   #350 <Method void writeRawByte(int)>
	//   62  101:return          
	}

	public void writeRawMessageSetExtension(int i, ByteString bytestring)
	{
		writeTag(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #354 <Method void writeUInt32(int, int)>
		writeBytes(3, bytestring);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #356 <Method void writeBytes(int, ByteString)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #230 <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeRawVarint32(int i)
	{
		do
		{
			if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            13
			{
				writeRawByte(i);
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokevirtual   #350 <Method void writeRawByte(int)>
				return;
	//    7   12:return          
			}
			writeRawByte(i & 0x7f | 0x80);
	//    8   13:aload_0         
	//    9   14:iload_1         
	//   10   15:bipush          127
	//   11   17:iand            
	//   12   18:sipush          128
	//   13   21:ior             
	//   14   22:invokevirtual   #350 <Method void writeRawByte(int)>
			i >>>= 7;
	//   15   25:iload_1         
	//   16   26:bipush          7
	//   17   28:iushr           
	//   18   29:istore_1        
		} while(true);
	//   19   30:goto            0
	}

	public void writeRawVarint64(long l)
	{
		do
		{
			if((-128L & l) == 0L)
	//*   0    0:ldc2w           #110 <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            17
			{
				writeRawByte((int)l);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:l2i             
	//    9   13:invokevirtual   #350 <Method void writeRawByte(int)>
				return;
	//   10   16:return          
			}
			writeRawByte((int)l & 0x7f | 0x80);
	//   11   17:aload_0         
	//   12   18:lload_1         
	//   13   19:l2i             
	//   14   20:bipush          127
	//   15   22:iand            
	//   16   23:sipush          128
	//   17   26:ior             
	//   18   27:invokevirtual   #350 <Method void writeRawByte(int)>
			l >>>= 7;
	//   19   30:lload_1         
	//   20   31:bipush          7
	//   21   33:lushr           
	//   22   34:lstore_1        
		} while(true);
	//   23   35:goto            0
	}

	public void writeSFixed32(int i, int j)
	{
		writeTag(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeSFixed32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #360 <Method void writeSFixed32NoTag(int)>
	//    7   11:return          
	}

	public void writeSFixed32NoTag(int i)
	{
		writeRawLittleEndian32(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #282 <Method void writeRawLittleEndian32(int)>
	//    3    5:return          
	}

	public void writeSFixed64(int i, long l)
	{
		writeTag(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeSFixed64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #364 <Method void writeSFixed64NoTag(long)>
	//    7   11:return          
	}

	public void writeSFixed64NoTag(long l)
	{
		writeRawLittleEndian64(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #268 <Method void writeRawLittleEndian64(long)>
	//    3    5:return          
	}

	public void writeSInt32(int i, int j)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeSInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #368 <Method void writeSInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeSInt32NoTag(int i)
	{
		writeRawVarint32(encodeZigZag32(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #142 <Method int encodeZigZag32(int)>
	//    3    5:invokevirtual   #249 <Method void writeRawVarint32(int)>
	//    4    8:return          
	}

	public void writeSInt64(int i, long l)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeSInt64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #372 <Method void writeSInt64NoTag(long)>
	//    7   11:return          
	}

	public void writeSInt64NoTag(long l)
	{
		writeRawVarint64(encodeZigZag64(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #150 <Method long encodeZigZag64(long)>
	//    3    5:invokevirtual   #302 <Method void writeRawVarint64(long)>
	//    4    8:return          
	}

	public void writeString(int i, String s)
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeStringNoTag(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #377 <Method void writeStringNoTag(String)>
	//    7   11:return          
	}

	public void writeStringNoTag(String s)
	{
		s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_1         
	//    1    1:ldc1            #160 <String "UTF-8">
	//    2    3:invokevirtual   #166 <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		writeRawVarint32(s.length);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:arraylength     
	//    7   10:invokevirtual   #249 <Method void writeRawVarint32(int)>
		writeRawBytes(((byte []) (s)));
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:invokevirtual   #379 <Method void writeRawBytes(byte[])>
	//   11   18:return          
	}

	public void writeTag(int i, int j)
	{
		writeRawVarint32(WireFormat.makeTag(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #178 <Method int WireFormat.makeTag(int, int)>
	//    4    6:invokevirtual   #249 <Method void writeRawVarint32(int)>
	//    5    9:return          
	}

	public void writeUInt32(int i, int j)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeUInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #382 <Method void writeUInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeUInt32NoTag(int i)
	{
		writeRawVarint32(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #249 <Method void writeRawVarint32(int)>
	//    3    5:return          
	}

	public void writeUInt64(int i, long l)
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #230 <Method void writeTag(int, int)>
		writeUInt64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #386 <Method void writeUInt64NoTag(long)>
	//    7   11:return          
	}

	public void writeUInt64NoTag(long l)
	{
		writeRawVarint64(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #302 <Method void writeRawVarint64(long)>
	//    3    5:return          
	}

	public static final int DEFAULT_BUFFER_SIZE = 4096;
	public static final int LITTLE_ENDIAN_32_SIZE = 4;
	public static final int LITTLE_ENDIAN_64_SIZE = 8;
	private final byte buffer[];
	private final int limit;
	private final OutputStream output;
	private int position;
}
