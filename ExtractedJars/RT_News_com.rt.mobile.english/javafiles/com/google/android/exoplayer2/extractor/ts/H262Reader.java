// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader

public final class H262Reader
	implements ElementaryStreamReader
{
	private static final class CsdBuffer
	{

		public void onData(byte abyte0[], int i, int j)
		{
			if(!isFilling)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field boolean isFilling>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			j -= i;
		//    4    8:iload_3         
		//    5    9:iload_2         
		//    6   10:isub            
		//    7   11:istore_3        
			if(data.length < length + j)
		//*   8   12:aload_0         
		//*   9   13:getfield        #28  <Field byte[] data>
		//*  10   16:arraylength     
		//*  11   17:aload_0         
		//*  12   18:getfield        #34  <Field int length>
		//*  13   21:iload_3         
		//*  14   22:iadd            
		//*  15   23:icmpge          45
				data = Arrays.copyOf(data, (length + j) * 2);
		//   16   26:aload_0         
		//   17   27:aload_0         
		//   18   28:getfield        #28  <Field byte[] data>
		//   19   31:aload_0         
		//   20   32:getfield        #34  <Field int length>
		//   21   35:iload_3         
		//   22   36:iadd            
		//   23   37:iconst_2        
		//   24   38:imul            
		//   25   39:invokestatic    #40  <Method byte[] Arrays.copyOf(byte[], int)>
		//   26   42:putfield        #28  <Field byte[] data>
			System.arraycopy(((Object) (abyte0)), i, ((Object) (data)), length, j);
		//   27   45:aload_1         
		//   28   46:iload_2         
		//   29   47:aload_0         
		//   30   48:getfield        #28  <Field byte[] data>
		//   31   51:aload_0         
		//   32   52:getfield        #34  <Field int length>
		//   33   55:iload_3         
		//   34   56:invokestatic    #46  <Method void System.arraycopy(Object, int, Object, int, int)>
			length = length + j;
		//   35   59:aload_0         
		//   36   60:aload_0         
		//   37   61:getfield        #34  <Field int length>
		//   38   64:iload_3         
		//   39   65:iadd            
		//   40   66:putfield        #34  <Field int length>
		//   41   69:return          
		}

		public boolean onStartCode(int i, int j)
		{
			if(isFilling)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field boolean isFilling>
		//*   2    4:ifeq            49
			{
				length = length - j;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #34  <Field int length>
		//    6   12:iload_2         
		//    7   13:isub            
		//    8   14:putfield        #34  <Field int length>
				if(sequenceExtensionPosition == 0 && i == 181)
		//*   9   17:aload_0         
		//*  10   18:getfield        #50  <Field int sequenceExtensionPosition>
		//*  11   21:ifne            42
		//*  12   24:iload_1         
		//*  13   25:sipush          181
		//*  14   28:icmpne          42
				{
					sequenceExtensionPosition = length;
		//   15   31:aload_0         
		//   16   32:aload_0         
		//   17   33:getfield        #34  <Field int length>
		//   18   36:putfield        #50  <Field int sequenceExtensionPosition>
				} else
		//*  19   39:goto            61
				{
					isFilling = false;
		//   20   42:aload_0         
		//   21   43:iconst_0        
		//   22   44:putfield        #32  <Field boolean isFilling>
					return true;
		//   23   47:iconst_1        
		//   24   48:ireturn         
				}
			} else
			if(i == 179)
		//*  25   49:iload_1         
		//*  26   50:sipush          179
		//*  27   53:icmpne          61
				isFilling = true;
		//   28   56:aload_0         
		//   29   57:iconst_1        
		//   30   58:putfield        #32  <Field boolean isFilling>
			onData(START_CODE, 0, START_CODE.length);
		//   31   61:aload_0         
		//   32   62:getstatic       #21  <Field byte[] START_CODE>
		//   33   65:iconst_0        
		//   34   66:getstatic       #21  <Field byte[] START_CODE>
		//   35   69:arraylength     
		//   36   70:invokevirtual   #52  <Method void onData(byte[], int, int)>
			return false;
		//   37   73:iconst_0        
		//   38   74:ireturn         
		}

		public void reset()
		{
			isFilling = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #32  <Field boolean isFilling>
			length = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #34  <Field int length>
			sequenceExtensionPosition = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #50  <Field int sequenceExtensionPosition>
		//    9   15:return          
		}

		private static final byte START_CODE[] = {
			0, 0, 1
		};
		public byte data[];
		private boolean isFilling;
		public int length;
		public int sequenceExtensionPosition;

		static 
		{
		//    0    0:iconst_3        
		//    1    1:newarray        byte[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #18  <Int 0>
		//    5    7:bastore         
		//    6    8:dup             
		//    7    9:iconst_1        
		//    8   10:ldc1            #18  <Int 0>
		//    9   12:bastore         
		//   10   13:dup             
		//   11   14:iconst_2        
		//   12   15:ldc1            #19  <Int 1>
		//   13   17:bastore         
		//   14   18:putstatic       #21  <Field byte[] START_CODE>
		//*  15   21:return          
		}

		public CsdBuffer(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			data = new byte[i];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:newarray        byte[]
		//    5    8:putfield        #28  <Field byte[] data>
		//    6   11:return          
		}
	}


	public H262Reader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:newarray        boolean[]
	//    5    8:putfield        #65  <Field boolean[] prefixFlags>
	//    6   11:aload_0         
	//    7   12:new             #8   <Class H262Reader$CsdBuffer>
	//    8   15:dup             
	//    9   16:sipush          128
	//   10   19:invokespecial   #68  <Method void H262Reader$CsdBuffer(int)>
	//   11   22:putfield        #70  <Field H262Reader$CsdBuffer csdBuffer>
	//   12   25:return          
	}

	private static Pair parseCsdBuffer(CsdBuffer csdbuffer, String s)
	{
		byte abyte0[] = Arrays.copyOf(csdbuffer.data, csdbuffer.length);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field byte[] H262Reader$CsdBuffer.data>
	//    2    4:aload_0         
	//    3    5:getfield        #79  <Field int H262Reader$CsdBuffer.length>
	//    4    8:invokestatic    #85  <Method byte[] Arrays.copyOf(byte[], int)>
	//    5   11:astore          14
		int k = ((int) (abyte0[4]));
	//    6   13:aload           14
	//    7   15:iconst_4        
	//    8   16:baload          
	//    9   17:istore          9
		int i = abyte0[5] & 0xff;
	//   10   19:aload           14
	//   11   21:iconst_5        
	//   12   22:baload          
	//   13   23:sipush          255
	//   14   26:iand            
	//   15   27:istore          7
		byte byte0 = abyte0[6];
	//   16   29:aload           14
	//   17   31:bipush          6
	//   18   33:baload          
	//   19   34:istore          8
		k = (k & 0xff) << 4 | i >> 4;
	//   20   36:iload           9
	//   21   38:sipush          255
	//   22   41:iand            
	//   23   42:iconst_4        
	//   24   43:ishl            
	//   25   44:iload           7
	//   26   46:iconst_4        
	//   27   47:ishr            
	//   28   48:ior             
	//   29   49:istore          9
		i = (i & 0xf) << 8 | byte0 & 0xff;
	//   30   51:iload           7
	//   31   53:bipush          15
	//   32   55:iand            
	//   33   56:bipush          8
	//   34   58:ishl            
	//   35   59:iload           8
	//   36   61:sipush          255
	//   37   64:iand            
	//   38   65:ior             
	//   39   66:istore          7
		float f;
		switch((abyte0[7] & 0xf0) >> 4)
	//*  40   68:aload           14
	//*  41   70:bipush          7
	//*  42   72:baload          
	//*  43   73:sipush          240
	//*  44   76:iand            
	//*  45   77:iconst_4        
	//*  46   78:ishr            
		{
	//*  47   79:tableswitch     2 4: default 104
	//	               2 146
	//	               3 128
	//	               4 110
		default:
			f = 1.0F;
	//   48  104:fconst_1        
	//   49  105:fstore          6
			break;

	//*  50  107:goto            162
		case 4: // '\004'
			f = (float)(121 * i) / (float)(100 * k);
	//   51  110:bipush          121
	//   52  112:iload           7
	//   53  114:imul            
	//   54  115:i2f             
	//   55  116:bipush          100
	//   56  118:iload           9
	//   57  120:imul            
	//   58  121:i2f             
	//   59  122:fdiv            
	//   60  123:fstore          6
			break;

	//*  61  125:goto            107
		case 3: // '\003'
			f = (float)(16 * i) / (float)(9 * k);
	//   62  128:bipush          16
	//   63  130:iload           7
	//   64  132:imul            
	//   65  133:i2f             
	//   66  134:bipush          9
	//   67  136:iload           9
	//   68  138:imul            
	//   69  139:i2f             
	//   70  140:fdiv            
	//   71  141:fstore          6
			break;

	//*  72  143:goto            107
		case 2: // '\002'
			f = (float)(4 * i) / (float)(3 * k);
	//   73  146:iconst_4        
	//   74  147:iload           7
	//   75  149:imul            
	//   76  150:i2f             
	//   77  151:iconst_3        
	//   78  152:iload           9
	//   79  154:imul            
	//   80  155:i2f             
	//   81  156:fdiv            
	//   82  157:fstore          6
			break;
		}
	//*  83  159:goto            107
		s = ((String) (Format.createVideoSampleFormat(s, "video/mpeg2", ((String) (null)), -1, -1, k, i, -1F, Collections.singletonList(((Object) (abyte0))), -1, f, ((com.google.android.exoplayer2.drm.DrmInitData) (null)))));
	//   84  162:aload_1         
	//   85  163:ldc1            #87  <String "video/mpeg2">
	//   86  165:aconst_null     
	//   87  166:iconst_m1       
	//   88  167:iconst_m1       
	//   89  168:iload           9
	//   90  170:iload           7
	//   91  172:ldc1            #88  <Float -1F>
	//   92  174:aload           14
	//   93  176:invokestatic    #94  <Method java.util.List Collections.singletonList(Object)>
	//   94  179:iconst_m1       
	//   95  180:fload           6
	//   96  182:aconst_null     
	//   97  183:invokestatic    #100 <Method Format Format.createVideoSampleFormat(String, String, String, int, int, int, int, float, java.util.List, int, float, com.google.android.exoplayer2.drm.DrmInitData)>
	//   98  186:astore_1        
		long l1 = 0L;
	//   99  187:lconst_0        
	//  100  188:lstore          12
		i = (abyte0[7] & 0xf) - 1;
	//  101  190:aload           14
	//  102  192:bipush          7
	//  103  194:baload          
	//  104  195:bipush          15
	//  105  197:iand            
	//  106  198:iconst_1        
	//  107  199:isub            
	//  108  200:istore          7
		long l = l1;
	//  109  202:lload           12
	//  110  204:lstore          10
		if(i >= 0)
	//* 111  206:iload           7
	//* 112  208:iflt            296
		{
			l = l1;
	//  113  211:lload           12
	//  114  213:lstore          10
			if(i < FRAME_RATE_VALUES.length)
	//* 115  215:iload           7
	//* 116  217:getstatic       #59  <Field double[] FRAME_RATE_VALUES>
	//* 117  220:arraylength     
	//* 118  221:icmpge          296
			{
				double d1 = FRAME_RATE_VALUES[i];
	//  119  224:getstatic       #59  <Field double[] FRAME_RATE_VALUES>
	//  120  227:iload           7
	//  121  229:daload          
	//  122  230:dstore          4
				int j = csdbuffer.sequenceExtensionPosition + 9;
	//  123  232:aload_0         
	//  124  233:getfield        #103 <Field int H262Reader$CsdBuffer.sequenceExtensionPosition>
	//  125  236:bipush          9
	//  126  238:iadd            
	//  127  239:istore          8
				i = (abyte0[j] & 0x60) >> 5;
	//  128  241:aload           14
	//  129  243:iload           8
	//  130  245:baload          
	//  131  246:bipush          96
	//  132  248:iand            
	//  133  249:iconst_5        
	//  134  250:ishr            
	//  135  251:istore          7
				j = abyte0[j] & 0x1f;
	//  136  253:aload           14
	//  137  255:iload           8
	//  138  257:baload          
	//  139  258:bipush          31
	//  140  260:iand            
	//  141  261:istore          8
				double d = d1;
	//  142  263:dload           4
	//  143  265:dstore_2        
				if(i != j)
	//* 144  266:iload           7
	//* 145  268:iload           8
	//* 146  270:icmpeq          288
					d = d1 * (((double)i + 1.0D) / (double)(j + 1));
	//  147  273:dload           4
	//  148  275:iload           7
	//  149  277:i2d             
	//  150  278:dconst_1        
	//  151  279:dadd            
	//  152  280:iload           8
	//  153  282:iconst_1        
	//  154  283:iadd            
	//  155  284:i2d             
	//  156  285:ddiv            
	//  157  286:dmul            
	//  158  287:dstore_2        
				l = (long)(1000000D / d);
	//  159  288:ldc2w           #104 <Double 1000000D>
	//  160  291:dload_2         
	//  161  292:ddiv            
	//  162  293:d2l             
	//  163  294:lstore          10
			}
		}
		return Pair.create(((Object) (s)), ((Object) (Long.valueOf(l))));
	//  164  296:aload_1         
	//  165  297:lload           10
	//  166  299:invokestatic    #111 <Method Long Long.valueOf(long)>
	//  167  302:invokestatic    #117 <Method Pair Pair.create(Object, Object)>
	//  168  305:areturn         
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #123 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #125 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #130 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #137 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		formatId = trackidgenerator.getFormatId();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #141 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//    5    9:putfield        #143 <Field String formatId>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 2);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #147 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   10   18:iconst_2        
	//   11   19:invokeinterface #153 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   12   24:putfield        #155 <Field TrackOutput output>
	//   13   27:return          
	}

	public void packetFinished()
	{
	//    0    0:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		pesTimeUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #160 <Field long pesTimeUs>
	//    3    5:return          
	}

	public void seek()
	{
		NalUnitUtil.clearPrefixFlags(prefixFlags);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean[] prefixFlags>
	//    2    4:invokestatic    #167 <Method void NalUnitUtil.clearPrefixFlags(boolean[])>
		csdBuffer.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field H262Reader$CsdBuffer csdBuffer>
	//    5   11:invokevirtual   #170 <Method void H262Reader$CsdBuffer.reset()>
		totalBytesWritten = 0L;
	//    6   14:aload_0         
	//    7   15:lconst_0        
	//    8   16:putfield        #172 <Field long totalBytesWritten>
		startedFirstSample = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #174 <Field boolean startedFirstSample>
	//   12   24:return          
	}

	private static final double FRAME_RATE_VALUES[] = {
		23.976023976023978D, 24D, 25D, 29.970029970029969D, 30D, 50D, 59.940059940059939D, 60D
	};
	private static final int START_EXTENSION = 181;
	private static final int START_GROUP = 184;
	private static final int START_PICTURE = 0;
	private static final int START_SEQUENCE_HEADER = 179;
	private final CsdBuffer csdBuffer = new CsdBuffer(128);
	private String formatId;
	private long frameDurationUs;
	private boolean hasOutputFormat;
	private TrackOutput output;
	private long pesTimeUs;
	private final boolean prefixFlags[] = new boolean[4];
	private boolean sampleHasPicture;
	private boolean sampleIsKeyframe;
	private long samplePosition;
	private long sampleTimeUs;
	private boolean startedFirstSample;
	private long totalBytesWritten;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        double[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc2w           #42  <Double 23.976023976023978D>
	//    5    9:dastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc2w           #44  <Double 24D>
	//    9   15:dastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:ldc2w           #46  <Double 25D>
	//   13   21:dastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:ldc2w           #48  <Double 29.970029970029969D>
	//   17   27:dastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:ldc2w           #50  <Double 30D>
	//   21   33:dastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:ldc2w           #52  <Double 50D>
	//   25   39:dastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:ldc2w           #54  <Double 59.940059940059939D>
	//   29   46:dastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:ldc2w           #56  <Double 60D>
	//   33   53:dastore         
	//   34   54:putstatic       #59  <Field double[] FRAME_RATE_VALUES>
	//*  35   57:return          
	}
}
