// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			StreamReader

final class OpusReader extends StreamReader
{

	OpusReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void StreamReader()>
	//    2    4:return          
	}

	private long getPacketDurationUs(byte abyte0[])
	{
		int i = abyte0[0] & 0xff;
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:sipush          255
	//    4    6:iand            
	//    5    7:istore_2        
		int j;
		switch(i & 3)
	//*   6    8:iload_2         
	//*   7    9:iconst_3        
	//*   8   10:iand            
		{
	//*   9   11:tableswitch     0 2: default 36
	//	               0 51
	//	               1 46
	//	               2 46
		default:
			j = abyte0[1] & 0x3f;
	//   10   36:aload_1         
	//   11   37:iconst_1        
	//   12   38:baload          
	//   13   39:bipush          63
	//   14   41:iand            
	//   15   42:istore_3        
			break;

	//*  16   43:goto            53
		case 1: // '\001'
		case 2: // '\002'
			j = 2;
	//   17   46:iconst_2        
	//   18   47:istore_3        
			break;

	//*  19   48:goto            53
		case 0: // '\0'
			j = 1;
	//   20   51:iconst_1        
	//   21   52:istore_3        
			break;
		}
		i >>= 3;
	//   22   53:iload_2         
	//   23   54:iconst_3        
	//   24   55:ishr            
	//   25   56:istore_2        
		int k = i & 3;
	//   26   57:iload_2         
	//   27   58:iconst_3        
	//   28   59:iand            
	//   29   60:istore          4
		if(i >= 16)
	//*  30   62:iload_2         
	//*  31   63:bipush          16
	//*  32   65:icmplt          78
			i = 2500 << k;
	//   33   68:sipush          2500
	//   34   71:iload           4
	//   35   73:ishl            
	//   36   74:istore_2        
		else
	//*  37   75:goto            115
		if(i >= 12)
	//*  38   78:iload_2         
	//*  39   79:bipush          12
	//*  40   81:icmplt          96
			i = 10000 << (k & 1);
	//   41   84:sipush          10000
	//   42   87:iload           4
	//   43   89:iconst_1        
	//   44   90:iand            
	//   45   91:ishl            
	//   46   92:istore_2        
		else
	//*  47   93:goto            115
		if(k == 3)
	//*  48   96:iload           4
	//*  49   98:iconst_3        
	//*  50   99:icmpne          108
			i = 60000;
	//   51  102:ldc1            #43  <Int 60000>
	//   52  104:istore_2        
		else
	//*  53  105:goto            115
			i = 10000 << k;
	//   54  108:sipush          10000
	//   55  111:iload           4
	//   56  113:ishl            
	//   57  114:istore_2        
		return (long)j * (long)i;
	//   58  115:iload_3         
	//   59  116:i2l             
	//   60  117:iload_2         
	//   61  118:i2l             
	//   62  119:lmul            
	//   63  120:lreturn         
	}

	private void putNativeOrderLong(List list, int i)
	{
		long l = ((long)i * 0x3b9aca00L) / 48000L;
	//    0    0:iload_2         
	//    1    1:i2l             
	//    2    2:ldc2w           #46  <Long 0x3b9aca00L>
	//    3    5:lmul            
	//    4    6:ldc2w           #48  <Long 48000L>
	//    5    9:ldiv            
	//    6   10:lstore_3        
		list.add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(l).array())));
	//    7   11:aload_1         
	//    8   12:bipush          8
	//    9   14:invokestatic    #55  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   10   17:invokestatic    #61  <Method ByteOrder ByteOrder.nativeOrder()>
	//   11   20:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   23:lload_3         
	//   13   24:invokevirtual   #69  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   14   27:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
	//   15   30:invokeinterface #79  <Method boolean List.add(Object)>
	//   16   35:pop             
	//   17   36:return          
	}

	public static boolean verifyBitstreamType(ParsableByteArray parsablebytearray)
	{
		if(parsablebytearray.bytesLeft() < OPUS_SIGNATURE.length)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #89  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:getstatic       #36  <Field byte[] OPUS_SIGNATURE>
	//*   3    7:arraylength     
	//*   4    8:icmpge          13
		{
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		} else
		{
			byte abyte0[] = new byte[OPUS_SIGNATURE.length];
	//    7   13:getstatic       #36  <Field byte[] OPUS_SIGNATURE>
	//    8   16:arraylength     
	//    9   17:newarray        byte[]
	//   10   19:astore_1        
			parsablebytearray.readBytes(abyte0, 0, OPUS_SIGNATURE.length);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:iconst_0        
	//   14   23:getstatic       #36  <Field byte[] OPUS_SIGNATURE>
	//   15   26:arraylength     
	//   16   27:invokevirtual   #93  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			return Arrays.equals(abyte0, OPUS_SIGNATURE);
	//   17   30:aload_1         
	//   18   31:getstatic       #36  <Field byte[] OPUS_SIGNATURE>
	//   19   34:invokestatic    #99  <Method boolean Arrays.equals(byte[], byte[])>
	//   20   37:ireturn         
		}
	}

	protected long preparePayload(ParsableByteArray parsablebytearray)
	{
		return convertTimeToGranule(getPacketDurationUs(parsablebytearray.data));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:getfield        #104 <Field byte[] ParsableByteArray.data>
	//    4    6:invokespecial   #106 <Method long getPacketDurationUs(byte[])>
	//    5    9:invokevirtual   #110 <Method long convertTimeToGranule(long)>
	//    6   12:lreturn         
	}

	protected boolean readHeaders(ParsableByteArray parsablebytearray, long l, StreamReader.SetupData setupdata)
		throws IOException, InterruptedException
	{
		boolean flag1 = headerRead;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field boolean headerRead>
	//    2    4:istore          9
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          8
		if(!flag1)
	//*   5    9:iload           9
	//*   6   11:ifne            128
		{
			parsablebytearray = ((ParsableByteArray) (Arrays.copyOf(parsablebytearray.data, parsablebytearray.limit())));
	//    7   14:aload_1         
	//    8   15:getfield        #104 <Field byte[] ParsableByteArray.data>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #121 <Method int ParsableByteArray.limit()>
	//   11   22:invokestatic    #125 <Method byte[] Arrays.copyOf(byte[], int)>
	//   12   25:astore_1        
			byte byte0 = parsablebytearray[9];
	//   13   26:aload_1         
	//   14   27:bipush          9
	//   15   29:baload          
	//   16   30:istore          5
			byte byte1 = parsablebytearray[11];
	//   17   32:aload_1         
	//   18   33:bipush          11
	//   19   35:baload          
	//   20   36:istore          6
			byte byte2 = parsablebytearray[10];
	//   21   38:aload_1         
	//   22   39:bipush          10
	//   23   41:baload          
	//   24   42:istore          7
			ArrayList arraylist = new ArrayList(3);
	//   25   44:new             #127 <Class ArrayList>
	//   26   47:dup             
	//   27   48:iconst_3        
	//   28   49:invokespecial   #130 <Method void ArrayList(int)>
	//   29   52:astore          10
			((List) (arraylist)).add(((Object) (parsablebytearray)));
	//   30   54:aload           10
	//   31   56:aload_1         
	//   32   57:invokeinterface #79  <Method boolean List.add(Object)>
	//   33   62:pop             
			putNativeOrderLong(((List) (arraylist)), (byte1 & 0xff) << 8 | byte2 & 0xff);
	//   34   63:aload_0         
	//   35   64:aload           10
	//   36   66:iload           6
	//   37   68:sipush          255
	//   38   71:iand            
	//   39   72:bipush          8
	//   40   74:ishl            
	//   41   75:iload           7
	//   42   77:sipush          255
	//   43   80:iand            
	//   44   81:ior             
	//   45   82:invokespecial   #132 <Method void putNativeOrderLong(List, int)>
			putNativeOrderLong(((List) (arraylist)), 3840);
	//   46   85:aload_0         
	//   47   86:aload           10
	//   48   88:sipush          3840
	//   49   91:invokespecial   #132 <Method void putNativeOrderLong(List, int)>
			setupdata.format = Format.createAudioSampleFormat(((String) (null)), "audio/opus", ((String) (null)), -1, -1, byte0 & 0xff, 48000, ((List) (arraylist)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)));
	//   50   94:aload           4
	//   51   96:aconst_null     
	//   52   97:ldc1            #134 <String "audio/opus">
	//   53   99:aconst_null     
	//   54  100:iconst_m1       
	//   55  101:iconst_m1       
	//   56  102:iload           5
	//   57  104:sipush          255
	//   58  107:iand            
	//   59  108:ldc1            #12  <Int 48000>
	//   60  110:aload           10
	//   61  112:aconst_null     
	//   62  113:iconst_0        
	//   63  114:aconst_null     
	//   64  115:invokestatic    #140 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   65  118:putfield        #146 <Field Format StreamReader$SetupData.format>
			headerRead = true;
	//   66  121:aload_0         
	//   67  122:iconst_1        
	//   68  123:putfield        #118 <Field boolean headerRead>
			return true;
	//   69  126:iconst_1        
	//   70  127:ireturn         
		}
		if(parsablebytearray.readInt() != OPUS_CODE)
	//*  71  128:aload_1         
	//*  72  129:invokevirtual   #149 <Method int ParsableByteArray.readInt()>
	//*  73  132:getstatic       #26  <Field int OPUS_CODE>
	//*  74  135:icmpne          141
	//*  75  138:goto            144
			flag = false;
	//   76  141:iconst_0        
	//   77  142:istore          8
		parsablebytearray.setPosition(0);
	//   78  144:aload_1         
	//   79  145:iconst_0        
	//   80  146:invokevirtual   #152 <Method void ParsableByteArray.setPosition(int)>
		return flag;
	//   81  149:iload           8
	//   82  151:ireturn         
	}

	protected void reset(boolean flag)
	{
		super.reset(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #157 <Method void StreamReader.reset(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			headerRead = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #118 <Field boolean headerRead>
	//    8   14:return          
	}

	private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
	private static final int OPUS_CODE = Util.getIntegerCodeForString("Opus");
	private static final byte OPUS_SIGNATURE[] = {
		79, 112, 117, 115, 72, 101, 97, 100
	};
	private static final int SAMPLE_RATE = 48000;
	private boolean headerRead;

	static 
	{
	//    0    0:ldc1            #18  <String "Opus">
	//    1    2:invokestatic    #24  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #26  <Field int OPUS_CODE>
	//    3    8:bipush          8
	//    4   10:newarray        byte[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:ldc1            #27  <Int 79>
	//    8   16:bastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:ldc1            #28  <Int 112>
	//   12   21:bastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:ldc1            #29  <Int 117>
	//   16   26:bastore         
	//   17   27:dup             
	//   18   28:iconst_3        
	//   19   29:ldc1            #30  <Int 115>
	//   20   31:bastore         
	//   21   32:dup             
	//   22   33:iconst_4        
	//   23   34:ldc1            #31  <Int 72>
	//   24   36:bastore         
	//   25   37:dup             
	//   26   38:iconst_5        
	//   27   39:ldc1            #32  <Int 101>
	//   28   41:bastore         
	//   29   42:dup             
	//   30   43:bipush          6
	//   31   45:ldc1            #33  <Int 97>
	//   32   47:bastore         
	//   33   48:dup             
	//   34   49:bipush          7
	//   35   51:ldc1            #34  <Int 100>
	//   36   53:bastore         
	//   37   54:putstatic       #36  <Field byte[] OPUS_SIGNATURE>
	//*  38   57:return          
	}
}
