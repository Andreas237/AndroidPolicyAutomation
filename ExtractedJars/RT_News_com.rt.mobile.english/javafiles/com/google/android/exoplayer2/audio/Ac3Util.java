// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;

public final class Ac3Util
{
	public static final class SyncFrameInfo
	{

		public static final int STREAM_TYPE_TYPE0 = 0;
		public static final int STREAM_TYPE_TYPE1 = 1;
		public static final int STREAM_TYPE_TYPE2 = 2;
		public static final int STREAM_TYPE_UNDEFINED = -1;
		public final int channelCount;
		public final int frameSize;
		public final String mimeType;
		public final int sampleCount;
		public final int sampleRate;
		public final int streamType;

		private SyncFrameInfo(String s, int i, int j, int k, int l, int i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mimeType = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field String mimeType>
			streamType = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #35  <Field int streamType>
			channelCount = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #37  <Field int channelCount>
			sampleRate = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #39  <Field int sampleRate>
			frameSize = l;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #41  <Field int frameSize>
			sampleCount = i1;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #43  <Field int sampleCount>
		//   20   37:return          
		}

	}

	public static interface SyncFrameInfo.StreamType
		extends Annotation
	{
	}


	private Ac3Util()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static int findTrueHdSyncframeOffset(ByteBuffer bytebuffer)
	{
		int j = bytebuffer.position();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method int ByteBuffer.position()>
	//    2    4:istore_2        
		int k = bytebuffer.limit();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #59  <Method int ByteBuffer.limit()>
	//    5    9:istore_3        
		for(int i = j; i <= k - 10; i++)
	//*   6   10:iload_2         
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:bipush          10
	//*  11   16:isub            
	//*  12   17:icmpgt          46
			if((bytebuffer.getInt(i + 4) & 0xfeffffff) == 0xba6f72f8)
	//*  13   20:aload_0         
	//*  14   21:iload_1         
	//*  15   22:iconst_4        
	//*  16   23:iadd            
	//*  17   24:invokevirtual   #63  <Method int ByteBuffer.getInt(int)>
	//*  18   27:ldc1            #64  <Int 0xfeffffff>
	//*  19   29:iand            
	//*  20   30:ldc1            #65  <Int 0xba6f72f8>
	//*  21   32:icmpne          39
				return i - j;
	//   22   35:iload_1         
	//   23   36:iload_2         
	//   24   37:isub            
	//   25   38:ireturn         

	//   26   39:iload_1         
	//   27   40:iconst_1        
	//   28   41:iadd            
	//   29   42:istore_1        
	//*  30   43:goto            12
		return -1;
	//   31   46:iconst_m1       
	//   32   47:ireturn         
	}

	public static int getAc3SyncframeAudioSampleCount()
	{
		return 1536;
	//    0    0:sipush          1536
	//    1    3:ireturn         
	}

	private static int getAc3SyncframeSize(int i, int j)
	{
		int k = j / 2;
	//    0    0:iload_1         
	//    1    1:iconst_2        
	//    2    2:idiv            
	//    3    3:istore_2        
		if(i >= 0 && i < SAMPLE_RATE_BY_FSCOD.length && j >= 0 && k < SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1.length)
	//*   4    4:iload_0         
	//*   5    5:iflt            77
	//*   6    8:iload_0         
	//*   7    9:getstatic       #36  <Field int[] SAMPLE_RATE_BY_FSCOD>
	//*   8   12:arraylength     
	//*   9   13:icmpge          77
	//*  10   16:iload_1         
	//*  11   17:iflt            77
	//*  12   20:iload_2         
	//*  13   21:getstatic       #44  <Field int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1>
	//*  14   24:arraylength     
	//*  15   25:icmplt          31
	//*  16   28:goto            77
		{
			i = SAMPLE_RATE_BY_FSCOD[i];
	//   17   31:getstatic       #36  <Field int[] SAMPLE_RATE_BY_FSCOD>
	//   18   34:iload_0         
	//   19   35:iaload          
	//   20   36:istore_0        
			if(i == 44100)
	//*  21   37:iload_0         
	//*  22   38:ldc1            #34  <Int 44100>
	//*  23   40:icmpne          55
				return 2 * (SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1[k] + j % 2);
	//   24   43:iconst_2        
	//   25   44:getstatic       #44  <Field int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1>
	//   26   47:iload_2         
	//   27   48:iaload          
	//   28   49:iload_1         
	//   29   50:iconst_2        
	//   30   51:irem            
	//   31   52:iadd            
	//   32   53:imul            
	//   33   54:ireturn         
			j = BITRATE_BY_HALF_FRMSIZECOD[k];
	//   34   55:getstatic       #42  <Field int[] BITRATE_BY_HALF_FRMSIZECOD>
	//   35   58:iload_2         
	//   36   59:iaload          
	//   37   60:istore_1        
			if(i == 32000)
	//*  38   61:iload_0         
	//*  39   62:sipush          32000
	//*  40   65:icmpne          73
				return 6 * j;
	//   41   68:bipush          6
	//   42   70:iload_1         
	//   43   71:imul            
	//   44   72:ireturn         
			else
				return 4 * j;
	//   45   73:iconst_4        
	//   46   74:iload_1         
	//   47   75:imul            
	//   48   76:ireturn         
		} else
		{
			return -1;
	//   49   77:iconst_m1       
	//   50   78:ireturn         
		}
	}

	public static Format parseAc3AnnexFFormat(ParsableByteArray parsablebytearray, String s, String s1, DrmInitData drminitdata)
	{
		int i = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore          4
		int k = SAMPLE_RATE_BY_FSCOD[(i & 0xc0) >> 6];
	//    3    6:getstatic       #36  <Field int[] SAMPLE_RATE_BY_FSCOD>
	//    4    9:iload           4
	//    5   11:sipush          192
	//    6   14:iand            
	//    7   15:bipush          6
	//    8   17:ishr            
	//    9   18:iaload          
	//   10   19:istore          6
		int l = parsablebytearray.readUnsignedByte();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//   13   25:istore          7
		int j = CHANNEL_COUNT_BY_ACMOD[(l & 0x38) >> 3];
	//   14   27:getstatic       #40  <Field int[] CHANNEL_COUNT_BY_ACMOD>
	//   15   30:iload           7
	//   16   32:bipush          56
	//   17   34:iand            
	//   18   35:iconst_3        
	//   19   36:ishr            
	//   20   37:iaload          
	//   21   38:istore          5
		i = j;
	//   22   40:iload           5
	//   23   42:istore          4
		if((l & 4) != 0)
	//*  24   44:iload           7
	//*  25   46:iconst_4        
	//*  26   47:iand            
	//*  27   48:ifeq            57
			i = j + 1;
	//   28   51:iload           5
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore          4
		return Format.createAudioSampleFormat(s, "audio/ac3", ((String) (null)), -1, -1, i, k, ((java.util.List) (null)), drminitdata, 0, s1);
	//   32   57:aload_1         
	//   33   58:ldc1            #77  <String "audio/ac3">
	//   34   60:aconst_null     
	//   35   61:iconst_m1       
	//   36   62:iconst_m1       
	//   37   63:iload           4
	//   38   65:iload           6
	//   39   67:aconst_null     
	//   40   68:aload_3         
	//   41   69:iconst_0        
	//   42   70:aload_2         
	//   43   71:invokestatic    #83  <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, DrmInitData, int, String)>
	//   44   74:areturn         
	}

	public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsablebitarray)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #87  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #89  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #94  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static int parseAc3SyncframeSize(byte abyte0[])
	{
		if(abyte0.length < 5)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iconst_5        
	//*   3    3:icmpge          8
			return -1;
	//    4    6:iconst_m1       
	//    5    7:ireturn         
		else
			return getAc3SyncframeSize((abyte0[4] & 0xc0) >> 6, abyte0[4] & 0x3f);
	//    6    8:aload_0         
	//    7    9:iconst_4        
	//    8   10:baload          
	//    9   11:sipush          192
	//   10   14:iand            
	//   11   15:bipush          6
	//   12   17:ishr            
	//   13   18:aload_0         
	//   14   19:iconst_4        
	//   15   20:baload          
	//   16   21:bipush          63
	//   17   23:iand            
	//   18   24:invokestatic    #98  <Method int getAc3SyncframeSize(int, int)>
	//   19   27:ireturn         
	}

	public static Format parseEAc3AnnexFFormat(ParsableByteArray parsablebytearray, String s, String s1, DrmInitData drminitdata)
	{
		parsablebytearray.skipBytes(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #103 <Method void ParsableByteArray.skipBytes(int)>
		int i = parsablebytearray.readUnsignedByte();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//    5    9:istore          4
		int k = SAMPLE_RATE_BY_FSCOD[(i & 0xc0) >> 6];
	//    6   11:getstatic       #36  <Field int[] SAMPLE_RATE_BY_FSCOD>
	//    7   14:iload           4
	//    8   16:sipush          192
	//    9   19:iand            
	//   10   20:bipush          6
	//   11   22:ishr            
	//   12   23:iaload          
	//   13   24:istore          6
		int l = parsablebytearray.readUnsignedByte();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//   16   30:istore          7
		int j = CHANNEL_COUNT_BY_ACMOD[(l & 0xe) >> 1];
	//   17   32:getstatic       #40  <Field int[] CHANNEL_COUNT_BY_ACMOD>
	//   18   35:iload           7
	//   19   37:bipush          14
	//   20   39:iand            
	//   21   40:iconst_1        
	//   22   41:ishr            
	//   23   42:iaload          
	//   24   43:istore          5
		i = j;
	//   25   45:iload           5
	//   26   47:istore          4
		if((l & 1) != 0)
	//*  27   49:iload           7
	//*  28   51:iconst_1        
	//*  29   52:iand            
	//*  30   53:ifeq            62
			i = j + 1;
	//   31   56:iload           5
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore          4
		j = i;
	//   35   62:iload           4
	//   36   64:istore          5
		if((parsablebytearray.readUnsignedByte() & 0x1e) >> 1 > 0)
	//*  37   66:aload_0         
	//*  38   67:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//*  39   70:bipush          30
	//*  40   72:iand            
	//*  41   73:iconst_1        
	//*  42   74:ishr            
	//*  43   75:ifle            97
		{
			j = i;
	//   44   78:iload           4
	//   45   80:istore          5
			if((2 & parsablebytearray.readUnsignedByte()) != 0)
	//*  46   82:iconst_2        
	//*  47   83:aload_0         
	//*  48   84:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//*  49   87:iand            
	//*  50   88:ifeq            97
				j = i + 2;
	//   51   91:iload           4
	//   52   93:iconst_2        
	//   53   94:iadd            
	//   54   95:istore          5
		}
		String s3 = "audio/eac3";
	//   55   97:ldc1            #105 <String "audio/eac3">
	//   56   99:astore          9
		String s2 = s3;
	//   57  101:aload           9
	//   58  103:astore          8
		if(parsablebytearray.bytesLeft() > 0)
	//*  59  105:aload_0         
	//*  60  106:invokevirtual   #108 <Method int ParsableByteArray.bytesLeft()>
	//*  61  109:ifle            129
		{
			s2 = s3;
	//   62  112:aload           9
	//   63  114:astore          8
			if((parsablebytearray.readUnsignedByte() & 1) != 0)
	//*  64  116:aload_0         
	//*  65  117:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//*  66  120:iconst_1        
	//*  67  121:iand            
	//*  68  122:ifeq            129
				s2 = "audio/eac3-joc";
	//   69  125:ldc1            #110 <String "audio/eac3-joc">
	//   70  127:astore          8
		}
		return Format.createAudioSampleFormat(s, s2, ((String) (null)), -1, -1, j, k, ((java.util.List) (null)), drminitdata, 0, s1);
	//   71  129:aload_1         
	//   72  130:aload           8
	//   73  132:aconst_null     
	//   74  133:iconst_m1       
	//   75  134:iconst_m1       
	//   76  135:iload           5
	//   77  137:iload           6
	//   78  139:aconst_null     
	//   79  140:aload_3         
	//   80  141:iconst_0        
	//   81  142:aload_2         
	//   82  143:invokestatic    #83  <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, DrmInitData, int, String)>
	//   83  146:areturn         
	}

	public static int parseEAc3SyncframeAudioSampleCount(ByteBuffer bytebuffer)
	{
		byte byte0 = bytebuffer.get(bytebuffer.position() + 4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #56  <Method int ByteBuffer.position()>
	//    3    5:iconst_4        
	//    4    6:iadd            
	//    5    7:invokevirtual   #115 <Method byte ByteBuffer.get(int)>
	//    6   10:istore_2        
		int i = 6;
	//    7   11:bipush          6
	//    8   13:istore_1        
		if((byte0 & 0xc0) >> 6 != 3)
	//*   9   14:iload_2         
	//*  10   15:sipush          192
	//*  11   18:iand            
	//*  12   19:bipush          6
	//*  13   21:ishr            
	//*  14   22:iconst_3        
	//*  15   23:icmpne          29
	//*  16   26:goto            49
			i = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[(bytebuffer.get(bytebuffer.position() + 4) & 0x30) >> 4];
	//   17   29:getstatic       #32  <Field int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD>
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #56  <Method int ByteBuffer.position()>
	//   21   37:iconst_4        
	//   22   38:iadd            
	//   23   39:invokevirtual   #115 <Method byte ByteBuffer.get(int)>
	//   24   42:bipush          48
	//   25   44:iand            
	//   26   45:iconst_4        
	//   27   46:ishr            
	//   28   47:iaload          
	//   29   48:istore_1        
		return 256 * i;
	//   30   49:sipush          256
	//   31   52:iload_1         
	//   32   53:imul            
	//   33   54:ireturn         
	}

	public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer bytebuffer, int i)
	{
		boolean flag;
		if((bytebuffer.get(bytebuffer.position() + i + 7) & 0xff) == 187)
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #56  <Method int ByteBuffer.position()>
	//*   3    5:iload_1         
	//*   4    6:iadd            
	//*   5    7:bipush          7
	//*   6    9:iadd            
	//*   7   10:invokevirtual   #115 <Method byte ByteBuffer.get(int)>
	//*   8   13:sipush          255
	//*   9   16:iand            
	//*  10   17:sipush          187
	//*  11   20:icmpne          28
			flag = true;
	//   12   23:iconst_1        
	//   13   24:istore_2        
		else
	//*  14   25:goto            30
			flag = false;
	//   15   28:iconst_0        
	//   16   29:istore_2        
		int j = bytebuffer.position();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #56  <Method int ByteBuffer.position()>
	//   19   34:istore_3        
		byte byte0;
		if(flag)
	//*  20   35:iload_2         
	//*  21   36:ifeq            45
			byte0 = 9;
	//   22   39:bipush          9
	//   23   41:istore_2        
		else
	//*  24   42:goto            48
			byte0 = 8;
	//   25   45:bipush          8
	//   26   47:istore_2        
		return 40 << (bytebuffer.get(j + i + byte0) >> 4 & 7);
	//   27   48:bipush          40
	//   28   50:aload_0         
	//   29   51:iload_3         
	//   30   52:iload_1         
	//   31   53:iadd            
	//   32   54:iload_2         
	//   33   55:iadd            
	//   34   56:invokevirtual   #115 <Method byte ByteBuffer.get(int)>
	//   35   59:iconst_4        
	//   36   60:ishr            
	//   37   61:bipush          7
	//   38   63:iand            
	//   39   64:ishl            
	//   40   65:ireturn         
	}

	public static int parseTrueHdSyncframeAudioSampleCount(byte abyte0[])
	{
		byte byte1 = abyte0[4];
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:baload          
	//    3    3:istore_2        
		boolean flag = false;
	//    4    4:iconst_0        
	//    5    5:istore_1        
		if(byte1 == -8 && abyte0[5] == 114 && abyte0[6] == 111)
	//*   6    6:iload_2         
	//*   7    7:bipush          -8
	//*   8    9:icmpne          86
	//*   9   12:aload_0         
	//*  10   13:iconst_5        
	//*  11   14:baload          
	//*  12   15:bipush          114
	//*  13   17:icmpne          86
	//*  14   20:aload_0         
	//*  15   21:bipush          6
	//*  16   23:baload          
	//*  17   24:bipush          111
	//*  18   26:icmpne          86
		{
			if((abyte0[7] & 0xfe) != 186)
	//*  19   29:aload_0         
	//*  20   30:bipush          7
	//*  21   32:baload          
	//*  22   33:sipush          254
	//*  23   36:iand            
	//*  24   37:sipush          186
	//*  25   40:icmpeq          45
				return 0;
	//   26   43:iconst_0        
	//   27   44:ireturn         
			if((abyte0[7] & 0xff) == 187)
	//*  28   45:aload_0         
	//*  29   46:bipush          7
	//*  30   48:baload          
	//*  31   49:sipush          255
	//*  32   52:iand            
	//*  33   53:sipush          187
	//*  34   56:icmpne          61
				flag = true;
	//   35   59:iconst_1        
	//   36   60:istore_1        
			byte byte0;
			if(flag)
	//*  37   61:iload_1         
	//*  38   62:ifeq            71
				byte0 = 9;
	//   39   65:bipush          9
	//   40   67:istore_1        
			else
	//*  41   68:goto            74
				byte0 = 8;
	//   42   71:bipush          8
	//   43   73:istore_1        
			return 40 << (abyte0[byte0] >> 4 & 7);
	//   44   74:bipush          40
	//   45   76:aload_0         
	//   46   77:iload_1         
	//   47   78:baload          
	//   48   79:iconst_4        
	//   49   80:ishr            
	//   50   81:bipush          7
	//   51   83:iand            
	//   52   84:ishl            
	//   53   85:ireturn         
		} else
		{
			return 0;
	//   54   86:iconst_0        
	//   55   87:ireturn         
		}
	}

	private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
	private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
	private static final int BITRATE_BY_HALF_FRMSIZECOD[] = {
		32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
		192, 224, 256, 320, 384, 448, 512, 576, 640
	};
	private static final int BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[] = {
		1, 2, 3, 6
	};
	private static final int CHANNEL_COUNT_BY_ACMOD[] = {
		2, 1, 2, 3, 3, 4, 4, 5
	};
	private static final int SAMPLE_RATE_BY_FSCOD[] = {
		48000, 44100, 32000
	};
	private static final int SAMPLE_RATE_BY_FSCOD2[] = {
		24000, 22050, 16000
	};
	private static final int SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1[] = {
		69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 
		417, 487, 557, 696, 835, 975, 1114, 1253, 1393
	};
	public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
	public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_1        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_2        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:iconst_3        
	//   13   14:iastore         
	//   14   15:dup             
	//   15   16:iconst_3        
	//   16   17:bipush          6
	//   17   19:iastore         
	//   18   20:putstatic       #32  <Field int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD>
	//   19   23:iconst_3        
	//   20   24:newarray        int[]
	//   21   26:dup             
	//   22   27:iconst_0        
	//   23   28:ldc1            #33  <Int 48000>
	//   24   30:iastore         
	//   25   31:dup             
	//   26   32:iconst_1        
	//   27   33:ldc1            #34  <Int 44100>
	//   28   35:iastore         
	//   29   36:dup             
	//   30   37:iconst_2        
	//   31   38:sipush          32000
	//   32   41:iastore         
	//   33   42:putstatic       #36  <Field int[] SAMPLE_RATE_BY_FSCOD>
	//   34   45:iconst_3        
	//   35   46:newarray        int[]
	//   36   48:dup             
	//   37   49:iconst_0        
	//   38   50:sipush          24000
	//   39   53:iastore         
	//   40   54:dup             
	//   41   55:iconst_1        
	//   42   56:sipush          22050
	//   43   59:iastore         
	//   44   60:dup             
	//   45   61:iconst_2        
	//   46   62:sipush          16000
	//   47   65:iastore         
	//   48   66:putstatic       #38  <Field int[] SAMPLE_RATE_BY_FSCOD2>
	//   49   69:bipush          8
	//   50   71:newarray        int[]
	//   51   73:dup             
	//   52   74:iconst_0        
	//   53   75:iconst_2        
	//   54   76:iastore         
	//   55   77:dup             
	//   56   78:iconst_1        
	//   57   79:iconst_1        
	//   58   80:iastore         
	//   59   81:dup             
	//   60   82:iconst_2        
	//   61   83:iconst_2        
	//   62   84:iastore         
	//   63   85:dup             
	//   64   86:iconst_3        
	//   65   87:iconst_3        
	//   66   88:iastore         
	//   67   89:dup             
	//   68   90:iconst_4        
	//   69   91:iconst_3        
	//   70   92:iastore         
	//   71   93:dup             
	//   72   94:iconst_5        
	//   73   95:iconst_4        
	//   74   96:iastore         
	//   75   97:dup             
	//   76   98:bipush          6
	//   77  100:iconst_4        
	//   78  101:iastore         
	//   79  102:dup             
	//   80  103:bipush          7
	//   81  105:iconst_5        
	//   82  106:iastore         
	//   83  107:putstatic       #40  <Field int[] CHANNEL_COUNT_BY_ACMOD>
	//   84  110:bipush          19
	//   85  112:newarray        int[]
	//   86  114:dup             
	//   87  115:iconst_0        
	//   88  116:bipush          32
	//   89  118:iastore         
	//   90  119:dup             
	//   91  120:iconst_1        
	//   92  121:bipush          40
	//   93  123:iastore         
	//   94  124:dup             
	//   95  125:iconst_2        
	//   96  126:bipush          48
	//   97  128:iastore         
	//   98  129:dup             
	//   99  130:iconst_3        
	//  100  131:bipush          56
	//  101  133:iastore         
	//  102  134:dup             
	//  103  135:iconst_4        
	//  104  136:bipush          64
	//  105  138:iastore         
	//  106  139:dup             
	//  107  140:iconst_5        
	//  108  141:bipush          80
	//  109  143:iastore         
	//  110  144:dup             
	//  111  145:bipush          6
	//  112  147:bipush          96
	//  113  149:iastore         
	//  114  150:dup             
	//  115  151:bipush          7
	//  116  153:bipush          112
	//  117  155:iastore         
	//  118  156:dup             
	//  119  157:bipush          8
	//  120  159:sipush          128
	//  121  162:iastore         
	//  122  163:dup             
	//  123  164:bipush          9
	//  124  166:sipush          160
	//  125  169:iastore         
	//  126  170:dup             
	//  127  171:bipush          10
	//  128  173:sipush          192
	//  129  176:iastore         
	//  130  177:dup             
	//  131  178:bipush          11
	//  132  180:sipush          224
	//  133  183:iastore         
	//  134  184:dup             
	//  135  185:bipush          12
	//  136  187:sipush          256
	//  137  190:iastore         
	//  138  191:dup             
	//  139  192:bipush          13
	//  140  194:sipush          320
	//  141  197:iastore         
	//  142  198:dup             
	//  143  199:bipush          14
	//  144  201:sipush          384
	//  145  204:iastore         
	//  146  205:dup             
	//  147  206:bipush          15
	//  148  208:sipush          448
	//  149  211:iastore         
	//  150  212:dup             
	//  151  213:bipush          16
	//  152  215:sipush          512
	//  153  218:iastore         
	//  154  219:dup             
	//  155  220:bipush          17
	//  156  222:sipush          576
	//  157  225:iastore         
	//  158  226:dup             
	//  159  227:bipush          18
	//  160  229:sipush          640
	//  161  232:iastore         
	//  162  233:putstatic       #42  <Field int[] BITRATE_BY_HALF_FRMSIZECOD>
	//  163  236:bipush          19
	//  164  238:newarray        int[]
	//  165  240:dup             
	//  166  241:iconst_0        
	//  167  242:bipush          69
	//  168  244:iastore         
	//  169  245:dup             
	//  170  246:iconst_1        
	//  171  247:bipush          87
	//  172  249:iastore         
	//  173  250:dup             
	//  174  251:iconst_2        
	//  175  252:bipush          104
	//  176  254:iastore         
	//  177  255:dup             
	//  178  256:iconst_3        
	//  179  257:bipush          121
	//  180  259:iastore         
	//  181  260:dup             
	//  182  261:iconst_4        
	//  183  262:sipush          139
	//  184  265:iastore         
	//  185  266:dup             
	//  186  267:iconst_5        
	//  187  268:sipush          174
	//  188  271:iastore         
	//  189  272:dup             
	//  190  273:bipush          6
	//  191  275:sipush          208
	//  192  278:iastore         
	//  193  279:dup             
	//  194  280:bipush          7
	//  195  282:sipush          243
	//  196  285:iastore         
	//  197  286:dup             
	//  198  287:bipush          8
	//  199  289:sipush          278
	//  200  292:iastore         
	//  201  293:dup             
	//  202  294:bipush          9
	//  203  296:sipush          348
	//  204  299:iastore         
	//  205  300:dup             
	//  206  301:bipush          10
	//  207  303:sipush          417
	//  208  306:iastore         
	//  209  307:dup             
	//  210  308:bipush          11
	//  211  310:sipush          487
	//  212  313:iastore         
	//  213  314:dup             
	//  214  315:bipush          12
	//  215  317:sipush          557
	//  216  320:iastore         
	//  217  321:dup             
	//  218  322:bipush          13
	//  219  324:sipush          696
	//  220  327:iastore         
	//  221  328:dup             
	//  222  329:bipush          14
	//  223  331:sipush          835
	//  224  334:iastore         
	//  225  335:dup             
	//  226  336:bipush          15
	//  227  338:sipush          975
	//  228  341:iastore         
	//  229  342:dup             
	//  230  343:bipush          16
	//  231  345:sipush          1114
	//  232  348:iastore         
	//  233  349:dup             
	//  234  350:bipush          17
	//  235  352:sipush          1253
	//  236  355:iastore         
	//  237  356:dup             
	//  238  357:bipush          18
	//  239  359:sipush          1393
	//  240  362:iastore         
	//  241  363:putstatic       #44  <Field int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1>
	//* 242  366:return          
	}
}
