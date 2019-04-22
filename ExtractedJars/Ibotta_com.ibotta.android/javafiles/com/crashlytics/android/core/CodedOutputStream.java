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
	//    1    1:invokespecial   #21  <Method void Object()>
		output = outputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field OutputStream output>
		buffer = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field byte[] buffer>
		position = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #27  <Field int position>
		limit = abyte0.length;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:arraylength     
	//   14   22:putfield        #29  <Field int limit>
	//   15   25:return          
	}

	public static int computeBoolSize(int i, boolean flag)
	{
		return computeTagSize(i) + computeBoolSizeNoTag(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #36  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #40  <Method int computeBoolSizeNoTag(boolean)>
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
	//    1    1:invokestatic    #36  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #46  <Method int computeBytesSizeNoTag(ByteString)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeBytesSizeNoTag(ByteString bytestring)
	{
		return computeRawVarint32Size(bytestring.size()) + bytestring.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int ByteString.size()>
	//    2    4:invokestatic    #55  <Method int computeRawVarint32Size(int)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #52  <Method int ByteString.size()>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static int computeEnumSize(int i, int j)
	{
		return computeTagSize(i) + computeEnumSizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #36  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #60  <Method int computeEnumSizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeEnumSizeNoTag(int i)
	{
		return computeInt32SizeNoTag(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #63  <Method int computeInt32SizeNoTag(int)>
	//    2    4:ireturn         
	}

	public static int computeFloatSize(int i, float f)
	{
		return computeTagSize(i) + computeFloatSizeNoTag(f);
	//    0    0:iload_0         
	//    1    1:invokestatic    #36  <Method int computeTagSize(int)>
	//    2    4:fload_1         
	//    3    5:invokestatic    #69  <Method int computeFloatSizeNoTag(float)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeFloatSizeNoTag(float f)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int computeInt32SizeNoTag(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return computeRawVarint32Size(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #55  <Method int computeRawVarint32Size(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
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
	//*  12   19:ldc1            #70  <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #71  <Int 0xf0000000>
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
	//*   0    0:ldc2w           #74  <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if((-16384L & l) == 0L)
	//*   8   12:ldc2w           #76  <Long -16384L>
	//*   9   15:lload_0         
	//*  10   16:land            
	//*  11   17:lconst_0        
	//*  12   18:lcmp            
	//*  13   19:ifne            24
			return 2;
	//   14   22:iconst_2        
	//   15   23:ireturn         
		if((0xffe00000L & l) == 0L)
	//*  16   24:ldc2w           #78  <Long 0xffe00000L>
	//*  17   27:lload_0         
	//*  18   28:land            
	//*  19   29:lconst_0        
	//*  20   30:lcmp            
	//*  21   31:ifne            36
			return 3;
	//   22   34:iconst_3        
	//   23   35:ireturn         
		if((0xf0000000L & l) == 0L)
	//*  24   36:ldc2w           #80  <Long 0xf0000000L>
	//*  25   39:lload_0         
	//*  26   40:land            
	//*  27   41:lconst_0        
	//*  28   42:lcmp            
	//*  29   43:ifne            48
			return 4;
	//   30   46:iconst_4        
	//   31   47:ireturn         
		if((0x0L & l) == 0L)
	//*  32   48:ldc2w           #82  <Long 0x0L>
	//*  33   51:lload_0         
	//*  34   52:land            
	//*  35   53:lconst_0        
	//*  36   54:lcmp            
	//*  37   55:ifne            60
			return 5;
	//   38   58:iconst_5        
	//   39   59:ireturn         
		if((0x0L & l) == 0L)
	//*  40   60:ldc2w           #84  <Long 0x0L>
	//*  41   63:lload_0         
	//*  42   64:land            
	//*  43   65:lconst_0        
	//*  44   66:lcmp            
	//*  45   67:ifne            73
			return 6;
	//   46   70:bipush          6
	//   47   72:ireturn         
		if((0x0L & l) == 0L)
	//*  48   73:ldc2w           #86  <Long 0x0L>
	//*  49   76:lload_0         
	//*  50   77:land            
	//*  51   78:lconst_0        
	//*  52   79:lcmp            
	//*  53   80:ifne            86
			return 7;
	//   54   83:bipush          7
	//   55   85:ireturn         
		if((0x0L & l) == 0L)
	//*  56   86:ldc2w           #88  <Long 0x0L>
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
	//   65  100:ldc2w           #90  <Long 0x0L>
	//   66  103:land            
	//   67  104:lconst_0        
	//   68  105:lcmp            
	//   69  106:ifne            112
	//   70  109:bipush          9
	//   71  111:ireturn         
	//   72  112:bipush          10
	//   73  114:ireturn         
	}

	public static int computeSInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeSInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #36  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #95  <Method int computeSInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSInt32SizeNoTag(int i)
	{
		return computeRawVarint32Size(encodeZigZag32(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #98  <Method int encodeZigZag32(int)>
	//    2    4:invokestatic    #55  <Method int computeRawVarint32Size(int)>
	//    3    7:ireturn         
	}

	public static int computeTagSize(int i)
	{
		return computeRawVarint32Size(WireFormat.makeTag(i, 0));
	//    0    0:iload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #103 <Method int WireFormat.makeTag(int, int)>
	//    3    5:invokestatic    #55  <Method int computeRawVarint32Size(int)>
	//    4    8:ireturn         
	}

	public static int computeUInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeUInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #36  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #107 <Method int computeUInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeUInt32SizeNoTag(int i)
	{
		return computeRawVarint32Size(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #55  <Method int computeRawVarint32Size(int)>
	//    2    4:ireturn         
	}

	public static int computeUInt64Size(int i, long l)
	{
		return computeTagSize(i) + computeUInt64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #36  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #112 <Method int computeUInt64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeUInt64SizeNoTag(long l)
	{
		return computeRawVarint64Size(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #114 <Method int computeRawVarint64Size(long)>
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

	public static CodedOutputStream newInstance(OutputStream outputstream)
	{
		return newInstance(outputstream, 4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokestatic    #119 <Method CodedOutputStream newInstance(OutputStream, int)>
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
	//    5    8:invokespecial   #121 <Method void CodedOutputStream(OutputStream, byte[])>
	//    6   11:areturn         
	}

	private void refreshBuffer()
		throws IOException
	{
		OutputStream outputstream = output;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field OutputStream output>
	//    2    4:astore_1        
		if(outputstream != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
		{
			outputstream.write(buffer, 0, position);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field byte[] buffer>
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field int position>
	//   11   19:invokevirtual   #130 <Method void OutputStream.write(byte[], int, int)>
			position = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #27  <Field int position>
			return;
	//   15   27:return          
		} else
		{
			throw new OutOfSpaceException();
	//   16   28:new             #8   <Class CodedOutputStream$OutOfSpaceException>
	//   17   31:dup             
	//   18   32:invokespecial   #131 <Method void CodedOutputStream$OutOfSpaceException()>
	//   19   35:athrow          
		}
	}

	public void flush()
		throws IOException
	{
		if(output != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field OutputStream output>
	//*   2    4:ifnull          11
			refreshBuffer();
	//    3    7:aload_0         
	//    4    8:invokespecial   #135 <Method void refreshBuffer()>
	//    5   11:return          
	}

	public void writeBool(int i, boolean flag)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #141 <Method void writeTag(int, int)>
		writeBoolNoTag(flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #145 <Method void writeBoolNoTag(boolean)>
	//    7   11:return          
	}

	public void writeBoolNoTag(boolean flag)
		throws IOException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #147 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #149 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #154 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void writeBytes(int i, ByteString bytestring)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #141 <Method void writeTag(int, int)>
		writeBytesNoTag(bytestring);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #160 <Method void writeBytesNoTag(ByteString)>
	//    7   11:return          
	}

	public void writeBytesNoTag(ByteString bytestring)
		throws IOException
	{
		writeRawVarint32(bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method int ByteString.size()>
	//    3    5:invokevirtual   #164 <Method void writeRawVarint32(int)>
		writeRawBytes(bytestring);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #167 <Method void writeRawBytes(ByteString)>
	//    7   13:return          
	}

	public void writeEnum(int i, int j)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #141 <Method void writeTag(int, int)>
		writeEnumNoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #171 <Method void writeEnumNoTag(int)>
	//    7   11:return          
	}

	public void writeEnumNoTag(int i)
		throws IOException
	{
		writeInt32NoTag(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #174 <Method void writeInt32NoTag(int)>
	//    3    5:return          
	}

	public void writeFloat(int i, float f)
		throws IOException
	{
		writeTag(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #141 <Method void writeTag(int, int)>
		writeFloatNoTag(f);
	//    4    6:aload_0         
	//    5    7:fload_2         
	//    6    8:invokevirtual   #180 <Method void writeFloatNoTag(float)>
	//    7   11:return          
	}

	public void writeFloatNoTag(float f)
		throws IOException
	{
		writeRawLittleEndian32(Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #185 <Method int Float.floatToRawIntBits(float)>
	//    3    5:invokevirtual   #188 <Method void writeRawLittleEndian32(int)>
	//    4    8:return          
	}

	public void writeInt32NoTag(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			writeRawVarint32(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #164 <Method void writeRawVarint32(int)>
			return;
	//    5    9:return          
		} else
		{
			writeRawVarint64(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #192 <Method void writeRawVarint64(long)>
			return;
	//   10   16:return          
		}
	}

	public void writeRawByte(byte byte0)
		throws IOException
	{
		if(position == limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int position>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field int limit>
	//*   4    8:icmpne          15
			refreshBuffer();
	//    5   11:aload_0         
	//    6   12:invokespecial   #135 <Method void refreshBuffer()>
		byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field byte[] buffer>
	//    9   19:astore_3        
		int i = position;
	//   10   20:aload_0         
	//   11   21:getfield        #27  <Field int position>
	//   12   24:istore_2        
		position = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #27  <Field int position>
		abyte0[i] = byte0;
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:iload_1         
	//   21   35:bastore         
	//   22   36:return          
	}

	public void writeRawByte(int i)
		throws IOException
	{
		writeRawByte((byte)i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #196 <Method void writeRawByte(byte)>
	//    4    6:return          
	}

	public void writeRawBytes(ByteString bytestring)
		throws IOException
	{
		writeRawBytes(bytestring, 0, bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #52  <Method int ByteString.size()>
	//    5    7:invokevirtual   #199 <Method void writeRawBytes(ByteString, int, int)>
	//    6   10:return          
	}

	public void writeRawBytes(ByteString bytestring, int i, int j)
		throws IOException
	{
		int i1 = limit;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int limit>
	//    2    4:istore          5
		int k = position;
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field int position>
	//    5   10:istore          4
		if(i1 - k >= j)
	//*   6   12:iload           5
	//*   7   14:iload           4
	//*   8   16:isub            
	//*   9   17:iload_3         
	//*  10   18:icmplt          44
		{
			bytestring.copyTo(buffer, i, k, j);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field byte[] buffer>
	//   14   26:iload_2         
	//   15   27:iload           4
	//   16   29:iload_3         
	//   17   30:invokevirtual   #203 <Method void ByteString.copyTo(byte[], int, int, int)>
			position = position + j;
	//   18   33:aload_0         
	//   19   34:aload_0         
	//   20   35:getfield        #27  <Field int position>
	//   21   38:iload_3         
	//   22   39:iadd            
	//   23   40:putfield        #27  <Field int position>
			return;
	//   24   43:return          
		}
		i1 -= k;
	//   25   44:iload           5
	//   26   46:iload           4
	//   27   48:isub            
	//   28   49:istore          5
		bytestring.copyTo(buffer, i, k, i1);
	//   29   51:aload_1         
	//   30   52:aload_0         
	//   31   53:getfield        #25  <Field byte[] buffer>
	//   32   56:iload_2         
	//   33   57:iload           4
	//   34   59:iload           5
	//   35   61:invokevirtual   #203 <Method void ByteString.copyTo(byte[], int, int, int)>
		k = i + i1;
	//   36   64:iload_2         
	//   37   65:iload           5
	//   38   67:iadd            
	//   39   68:istore          4
		i = j - i1;
	//   40   70:iload_3         
	//   41   71:iload           5
	//   42   73:isub            
	//   43   74:istore_2        
		position = limit;
	//   44   75:aload_0         
	//   45   76:aload_0         
	//   46   77:getfield        #29  <Field int limit>
	//   47   80:putfield        #27  <Field int position>
		refreshBuffer();
	//   48   83:aload_0         
	//   49   84:invokespecial   #135 <Method void refreshBuffer()>
		if(i <= limit)
	//*  50   87:iload_2         
	//*  51   88:aload_0         
	//*  52   89:getfield        #29  <Field int limit>
	//*  53   92:icmpgt          113
		{
			bytestring.copyTo(buffer, k, 0, i);
	//   54   95:aload_1         
	//   55   96:aload_0         
	//   56   97:getfield        #25  <Field byte[] buffer>
	//   57  100:iload           4
	//   58  102:iconst_0        
	//   59  103:iload_2         
	//   60  104:invokevirtual   #203 <Method void ByteString.copyTo(byte[], int, int, int)>
			position = i;
	//   61  107:aload_0         
	//   62  108:iload_2         
	//   63  109:putfield        #27  <Field int position>
			return;
	//   64  112:return          
		}
		bytestring = ((ByteString) (bytestring.newInput()));
	//   65  113:aload_1         
	//   66  114:invokevirtual   #207 <Method InputStream ByteString.newInput()>
	//   67  117:astore_1        
		long l1 = k;
	//   68  118:iload           4
	//   69  120:i2l             
	//   70  121:lstore          6
		if(l1 == ((InputStream) (bytestring)).skip(l1))
	//*  71  123:lload           6
	//*  72  125:aload_1         
	//*  73  126:lload           6
	//*  74  128:invokevirtual   #213 <Method long InputStream.skip(long)>
	//*  75  131:lcmp            
	//*  76  132:ifne            199
		{
			while(i > 0) 
	//*  77  135:iload_2         
	//*  78  136:ifle            198
			{
				j = Math.min(i, limit);
	//   79  139:iload_2         
	//   80  140:aload_0         
	//   81  141:getfield        #29  <Field int limit>
	//   82  144:invokestatic    #218 <Method int Math.min(int, int)>
	//   83  147:istore_3        
				int l = ((InputStream) (bytestring)).read(buffer, 0, j);
	//   84  148:aload_1         
	//   85  149:aload_0         
	//   86  150:getfield        #25  <Field byte[] buffer>
	//   87  153:iconst_0        
	//   88  154:iload_3         
	//   89  155:invokevirtual   #222 <Method int InputStream.read(byte[], int, int)>
	//   90  158:istore          4
				if(l == j)
	//*  91  160:iload           4
	//*  92  162:iload_3         
	//*  93  163:icmpne          188
				{
					output.write(buffer, 0, l);
	//   94  166:aload_0         
	//   95  167:getfield        #23  <Field OutputStream output>
	//   96  170:aload_0         
	//   97  171:getfield        #25  <Field byte[] buffer>
	//   98  174:iconst_0        
	//   99  175:iload           4
	//  100  177:invokevirtual   #130 <Method void OutputStream.write(byte[], int, int)>
					i -= l;
	//  101  180:iload_2         
	//  102  181:iload           4
	//  103  183:isub            
	//  104  184:istore_2        
				} else
	//* 105  185:goto            135
				{
					throw new IllegalStateException("Read failed.");
	//  106  188:new             #224 <Class IllegalStateException>
	//  107  191:dup             
	//  108  192:ldc1            #226 <String "Read failed.">
	//  109  194:invokespecial   #227 <Method void IllegalStateException(String)>
	//  110  197:athrow          
				}
			}
			return;
	//  111  198:return          
		} else
		{
			throw new IllegalStateException("Skip failed.");
	//  112  199:new             #224 <Class IllegalStateException>
	//  113  202:dup             
	//  114  203:ldc1            #229 <String "Skip failed.">
	//  115  205:invokespecial   #227 <Method void IllegalStateException(String)>
	//  116  208:athrow          
		}
	}

	public void writeRawBytes(byte abyte0[])
		throws IOException
	{
		writeRawBytes(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #232 <Method void writeRawBytes(byte[], int, int)>
	//    6    8:return          
	}

	public void writeRawBytes(byte abyte0[], int i, int j)
		throws IOException
	{
		int l = limit;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int limit>
	//    2    4:istore          5
		int k = position;
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field int position>
	//    5   10:istore          4
		if(l - k >= j)
	//*   6   12:iload           5
	//*   7   14:iload           4
	//*   8   16:isub            
	//*   9   17:iload_3         
	//*  10   18:icmplt          44
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), k, j);
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:aload_0         
	//   14   24:getfield        #25  <Field byte[] buffer>
	//   15   27:iload           4
	//   16   29:iload_3         
	//   17   30:invokestatic    #238 <Method void System.arraycopy(Object, int, Object, int, int)>
			position = position + j;
	//   18   33:aload_0         
	//   19   34:aload_0         
	//   20   35:getfield        #27  <Field int position>
	//   21   38:iload_3         
	//   22   39:iadd            
	//   23   40:putfield        #27  <Field int position>
			return;
	//   24   43:return          
		}
		l -= k;
	//   25   44:iload           5
	//   26   46:iload           4
	//   27   48:isub            
	//   28   49:istore          5
		System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), k, l);
	//   29   51:aload_1         
	//   30   52:iload_2         
	//   31   53:aload_0         
	//   32   54:getfield        #25  <Field byte[] buffer>
	//   33   57:iload           4
	//   34   59:iload           5
	//   35   61:invokestatic    #238 <Method void System.arraycopy(Object, int, Object, int, int)>
		i += l;
	//   36   64:iload_2         
	//   37   65:iload           5
	//   38   67:iadd            
	//   39   68:istore_2        
		j -= l;
	//   40   69:iload_3         
	//   41   70:iload           5
	//   42   72:isub            
	//   43   73:istore_3        
		position = limit;
	//   44   74:aload_0         
	//   45   75:aload_0         
	//   46   76:getfield        #29  <Field int limit>
	//   47   79:putfield        #27  <Field int position>
		refreshBuffer();
	//   48   82:aload_0         
	//   49   83:invokespecial   #135 <Method void refreshBuffer()>
		if(j <= limit)
	//*  50   86:iload_3         
	//*  51   87:aload_0         
	//*  52   88:getfield        #29  <Field int limit>
	//*  53   91:icmpgt          111
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), 0, j);
	//   54   94:aload_1         
	//   55   95:iload_2         
	//   56   96:aload_0         
	//   57   97:getfield        #25  <Field byte[] buffer>
	//   58  100:iconst_0        
	//   59  101:iload_3         
	//   60  102:invokestatic    #238 <Method void System.arraycopy(Object, int, Object, int, int)>
			position = j;
	//   61  105:aload_0         
	//   62  106:iload_3         
	//   63  107:putfield        #27  <Field int position>
			return;
	//   64  110:return          
		} else
		{
			output.write(abyte0, i, j);
	//   65  111:aload_0         
	//   66  112:getfield        #23  <Field OutputStream output>
	//   67  115:aload_1         
	//   68  116:iload_2         
	//   69  117:iload_3         
	//   70  118:invokevirtual   #130 <Method void OutputStream.write(byte[], int, int)>
			return;
	//   71  121:return          
		}
	}

	public void writeRawLittleEndian32(int i)
		throws IOException
	{
		writeRawByte(i & 0xff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:sipush          255
	//    3    5:iand            
	//    4    6:invokevirtual   #240 <Method void writeRawByte(int)>
		writeRawByte(i >> 8 & 0xff);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:bipush          8
	//    8   13:ishr            
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:invokevirtual   #240 <Method void writeRawByte(int)>
		writeRawByte(i >> 16 & 0xff);
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:bipush          16
	//   15   25:ishr            
	//   16   26:sipush          255
	//   17   29:iand            
	//   18   30:invokevirtual   #240 <Method void writeRawByte(int)>
		writeRawByte(i >> 24 & 0xff);
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:bipush          24
	//   22   37:ishr            
	//   23   38:sipush          255
	//   24   41:iand            
	//   25   42:invokevirtual   #240 <Method void writeRawByte(int)>
	//   26   45:return          
	}

	public void writeRawVarint32(int i)
		throws IOException
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
	//    6    9:invokevirtual   #240 <Method void writeRawByte(int)>
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
	//   14   22:invokevirtual   #240 <Method void writeRawByte(int)>
			i >>>= 7;
	//   15   25:iload_1         
	//   16   26:bipush          7
	//   17   28:iushr           
	//   18   29:istore_1        
		} while(true);
	//   19   30:goto            0
	}

	public void writeRawVarint64(long l)
		throws IOException
	{
		do
		{
			if((-128L & l) == 0L)
	//*   0    0:ldc2w           #74  <Long -128L>
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
	//    9   13:invokevirtual   #240 <Method void writeRawByte(int)>
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
	//   18   27:invokevirtual   #240 <Method void writeRawByte(int)>
			l >>>= 7;
	//   19   30:lload_1         
	//   20   31:bipush          7
	//   21   33:lushr           
	//   22   34:lstore_1        
		} while(true);
	//   23   35:goto            0
	}

	public void writeSInt32(int i, int j)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #141 <Method void writeTag(int, int)>
		writeSInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #244 <Method void writeSInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeSInt32NoTag(int i)
		throws IOException
	{
		writeRawVarint32(encodeZigZag32(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #98  <Method int encodeZigZag32(int)>
	//    3    5:invokevirtual   #164 <Method void writeRawVarint32(int)>
	//    4    8:return          
	}

	public void writeTag(int i, int j)
		throws IOException
	{
		writeRawVarint32(WireFormat.makeTag(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #103 <Method int WireFormat.makeTag(int, int)>
	//    4    6:invokevirtual   #164 <Method void writeRawVarint32(int)>
	//    5    9:return          
	}

	public void writeUInt32(int i, int j)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #141 <Method void writeTag(int, int)>
		writeUInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #248 <Method void writeUInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeUInt32NoTag(int i)
		throws IOException
	{
		writeRawVarint32(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #164 <Method void writeRawVarint32(int)>
	//    3    5:return          
	}

	public void writeUInt64(int i, long l)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #141 <Method void writeTag(int, int)>
		writeUInt64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #253 <Method void writeUInt64NoTag(long)>
	//    7   11:return          
	}

	public void writeUInt64NoTag(long l)
		throws IOException
	{
		writeRawVarint64(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #192 <Method void writeRawVarint64(long)>
	//    3    5:return          
	}

	private final byte buffer[];
	private final int limit;
	private final OutputStream output;
	private int position;
}
