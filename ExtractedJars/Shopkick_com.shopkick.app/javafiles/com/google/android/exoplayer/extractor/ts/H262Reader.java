// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader

final class H262Reader extends ElementaryStreamReader
{
	private static final class CsdBuffer
	{

		public void onData(byte abyte0[], int i, int j)
		{
			if(!isFilling)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field boolean isFilling>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			j -= i;
		//    4    8:iload_3         
		//    5    9:iload_2         
		//    6   10:isub            
		//    7   11:istore_3        
			byte abyte1[] = data;
		//    8   12:aload_0         
		//    9   13:getfield        #21  <Field byte[] data>
		//   10   16:astore          6
			int k = abyte1.length;
		//   11   18:aload           6
		//   12   20:arraylength     
		//   13   21:istore          4
			int l = length;
		//   14   23:aload_0         
		//   15   24:getfield        #28  <Field int length>
		//   16   27:istore          5
			if(k < l + j)
		//*  17   29:iload           4
		//*  18   31:iload           5
		//*  19   33:iload_3         
		//*  20   34:iadd            
		//*  21   35:icmpge          53
				data = Arrays.copyOf(abyte1, (l + j) * 2);
		//   22   38:aload_0         
		//   23   39:aload           6
		//   24   41:iload           5
		//   25   43:iload_3         
		//   26   44:iadd            
		//   27   45:iconst_2        
		//   28   46:imul            
		//   29   47:invokestatic    #34  <Method byte[] Arrays.copyOf(byte[], int)>
		//   30   50:putfield        #21  <Field byte[] data>
			System.arraycopy(((Object) (abyte0)), i, ((Object) (data)), length, j);
		//   31   53:aload_1         
		//   32   54:iload_2         
		//   33   55:aload_0         
		//   34   56:getfield        #21  <Field byte[] data>
		//   35   59:aload_0         
		//   36   60:getfield        #28  <Field int length>
		//   37   63:iload_3         
		//   38   64:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
			length = length + j;
		//   39   67:aload_0         
		//   40   68:aload_0         
		//   41   69:getfield        #28  <Field int length>
		//   42   72:iload_3         
		//   43   73:iadd            
		//   44   74:putfield        #28  <Field int length>
		//   45   77:return          
		}

		public boolean onStartCode(int i, int j)
		{
			if(isFilling)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field boolean isFilling>
		//*   2    4:ifeq            48
				if(sequenceExtensionPosition == 0 && i == 181)
		//*   3    7:aload_0         
		//*   4    8:getfield        #44  <Field int sequenceExtensionPosition>
		//*   5   11:ifne            31
		//*   6   14:iload_1         
		//*   7   15:sipush          181
		//*   8   18:icmpne          31
				{
					sequenceExtensionPosition = length;
		//    9   21:aload_0         
		//   10   22:aload_0         
		//   11   23:getfield        #28  <Field int length>
		//   12   26:putfield        #44  <Field int sequenceExtensionPosition>
					return false;
		//   13   29:iconst_0        
		//   14   30:ireturn         
				} else
				{
					length = length - j;
		//   15   31:aload_0         
		//   16   32:aload_0         
		//   17   33:getfield        #28  <Field int length>
		//   18   36:iload_2         
		//   19   37:isub            
		//   20   38:putfield        #28  <Field int length>
					isFilling = false;
		//   21   41:aload_0         
		//   22   42:iconst_0        
		//   23   43:putfield        #26  <Field boolean isFilling>
					return true;
		//   24   46:iconst_1        
		//   25   47:ireturn         
				}
			if(i == 179)
		//*  26   48:iload_1         
		//*  27   49:sipush          179
		//*  28   52:icmpne          60
				isFilling = true;
		//   29   55:aload_0         
		//   30   56:iconst_1        
		//   31   57:putfield        #26  <Field boolean isFilling>
			return false;
		//   32   60:iconst_0        
		//   33   61:ireturn         
		}

		public void reset()
		{
			isFilling = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #26  <Field boolean isFilling>
			length = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #28  <Field int length>
			sequenceExtensionPosition = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #44  <Field int sequenceExtensionPosition>
		//    9   15:return          
		}

		public byte data[];
		private boolean isFilling;
		public int length;
		public int sequenceExtensionPosition;

		public CsdBuffer(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			data = new byte[i];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:newarray        byte[]
		//    5    8:putfield        #21  <Field byte[] data>
		//    6   11:return          
		}
	}


	public H262Reader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void ElementaryStreamReader(TrackOutput)>
	//    3    5:aload_0         
	//    4    6:iconst_4        
	//    5    7:newarray        boolean[]
	//    6    9:putfield        #60  <Field boolean[] prefixFlags>
	//    7   12:aload_0         
	//    8   13:new             #6   <Class H262Reader$CsdBuffer>
	//    9   16:dup             
	//   10   17:sipush          128
	//   11   20:invokespecial   #63  <Method void H262Reader$CsdBuffer(int)>
	//   12   23:putfield        #65  <Field H262Reader$CsdBuffer csdBuffer>
	//   13   26:return          
	}

	private static Pair parseCsdBuffer(CsdBuffer csdbuffer)
	{
		byte abyte0[] = Arrays.copyOf(csdbuffer.data, csdbuffer.length);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field byte[] H262Reader$CsdBuffer.data>
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field int H262Reader$CsdBuffer.length>
	//    4    8:invokestatic    #80  <Method byte[] Arrays.copyOf(byte[], int)>
	//    5   11:astore          13
		int k = ((int) (abyte0[4]));
	//    6   13:aload           13
	//    7   15:iconst_4        
	//    8   16:baload          
	//    9   17:istore          8
		int i = abyte0[5] & 0xff;
	//   10   19:aload           13
	//   11   21:iconst_5        
	//   12   22:baload          
	//   13   23:sipush          255
	//   14   26:iand            
	//   15   27:istore          6
		byte byte0 = abyte0[6];
	//   16   29:aload           13
	//   17   31:bipush          6
	//   18   33:baload          
	//   19   34:istore          7
		k = (k & 0xff) << 4 | i >> 4;
	//   20   36:iload           8
	//   21   38:sipush          255
	//   22   41:iand            
	//   23   42:iconst_4        
	//   24   43:ishl            
	//   25   44:iload           6
	//   26   46:iconst_4        
	//   27   47:ishr            
	//   28   48:ior             
	//   29   49:istore          8
		i = (i & 0xf) << 8 | byte0 & 0xff;
	//   30   51:iload           6
	//   31   53:bipush          15
	//   32   55:iand            
	//   33   56:bipush          8
	//   34   58:ishl            
	//   35   59:iload           7
	//   36   61:sipush          255
	//   37   64:iand            
	//   38   65:ior             
	//   39   66:istore          6
		float f;
		switch((abyte0[7] & 0xf0) >> 4)
	//*  40   68:aload           13
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
	//   49  105:fstore          5
			break;

	//*  50  107:goto            159
		case 4: // '\004'
			f = (float)(i * 121) / (float)(k * 100);
	//   51  110:iload           6
	//   52  112:bipush          121
	//   53  114:imul            
	//   54  115:i2f             
	//   55  116:iload           8
	//   56  118:bipush          100
	//   57  120:imul            
	//   58  121:i2f             
	//   59  122:fdiv            
	//   60  123:fstore          5
			break;

	//*  61  125:goto            159
		case 3: // '\003'
			f = (float)(i * 16) / (float)(k * 9);
	//   62  128:iload           6
	//   63  130:bipush          16
	//   64  132:imul            
	//   65  133:i2f             
	//   66  134:iload           8
	//   67  136:bipush          9
	//   68  138:imul            
	//   69  139:i2f             
	//   70  140:fdiv            
	//   71  141:fstore          5
			break;

	//*  72  143:goto            159
		case 2: // '\002'
			f = (float)(i * 4) / (float)(k * 3);
	//   73  146:iload           6
	//   74  148:iconst_4        
	//   75  149:imul            
	//   76  150:i2f             
	//   77  151:iload           8
	//   78  153:iconst_3        
	//   79  154:imul            
	//   80  155:i2f             
	//   81  156:fdiv            
	//   82  157:fstore          5
			break;
		}
		MediaFormat mediaformat = MediaFormat.createVideoFormat(((String) (null)), "video/mpeg2", -1, -1, -1L, k, i, Collections.singletonList(((Object) (abyte0))), -1, f);
	//   83  159:aconst_null     
	//   84  160:ldc1            #82  <String "video/mpeg2">
	//   85  162:iconst_m1       
	//   86  163:iconst_m1       
	//   87  164:ldc2w           #83  <Long -1L>
	//   88  167:iload           8
	//   89  169:iload           6
	//   90  171:aload           13
	//   91  173:invokestatic    #90  <Method java.util.List Collections.singletonList(Object)>
	//   92  176:iconst_m1       
	//   93  177:fload           5
	//   94  179:invokestatic    #96  <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, java.util.List, int, float)>
	//   95  182:astore          14
		long l1 = 0L;
	//   96  184:lconst_0        
	//   97  185:lstore          11
		i = (abyte0[7] & 0xf) - 1;
	//   98  187:aload           13
	//   99  189:bipush          7
	//  100  191:baload          
	//  101  192:bipush          15
	//  102  194:iand            
	//  103  195:iconst_1        
	//  104  196:isub            
	//  105  197:istore          6
		long l = l1;
	//  106  199:lload           11
	//  107  201:lstore          9
		if(i >= 0)
	//* 108  203:iload           6
	//* 109  205:iflt            293
		{
			double ad[] = FRAME_RATE_VALUES;
	//  110  208:getstatic       #53  <Field double[] FRAME_RATE_VALUES>
	//  111  211:astore          15
			l = l1;
	//  112  213:lload           11
	//  113  215:lstore          9
			if(i < ad.length)
	//* 114  217:iload           6
	//* 115  219:aload           15
	//* 116  221:arraylength     
	//* 117  222:icmpge          293
			{
				double d1 = ad[i];
	//  118  225:aload           15
	//  119  227:iload           6
	//  120  229:daload          
	//  121  230:dstore_3        
				int j = csdbuffer.sequenceExtensionPosition + 9;
	//  122  231:aload_0         
	//  123  232:getfield        #99  <Field int H262Reader$CsdBuffer.sequenceExtensionPosition>
	//  124  235:bipush          9
	//  125  237:iadd            
	//  126  238:istore          7
				i = (abyte0[j] & 0x60) >> 5;
	//  127  240:aload           13
	//  128  242:iload           7
	//  129  244:baload          
	//  130  245:bipush          96
	//  131  247:iand            
	//  132  248:iconst_5        
	//  133  249:ishr            
	//  134  250:istore          6
				j = abyte0[j] & 0x1f;
	//  135  252:aload           13
	//  136  254:iload           7
	//  137  256:baload          
	//  138  257:bipush          31
	//  139  259:iand            
	//  140  260:istore          7
				double d = d1;
	//  141  262:dload_3         
	//  142  263:dstore_1        
				if(i != j)
	//* 143  264:iload           6
	//* 144  266:iload           7
	//* 145  268:icmpeq          285
					d = d1 * (((double)i + 1.0D) / (double)(j + 1));
	//  146  271:dload_3         
	//  147  272:iload           6
	//  148  274:i2d             
	//  149  275:dconst_1        
	//  150  276:dadd            
	//  151  277:iload           7
	//  152  279:iconst_1        
	//  153  280:iadd            
	//  154  281:i2d             
	//  155  282:ddiv            
	//  156  283:dmul            
	//  157  284:dstore_1        
				l = (long)(1000000D / d);
	//  158  285:ldc2w           #100 <Double 1000000D>
	//  159  288:dload_1         
	//  160  289:ddiv            
	//  161  290:d2l             
	//  162  291:lstore          9
			}
		}
		return Pair.create(((Object) (mediaformat)), ((Object) (Long.valueOf(l))));
	//  163  293:aload           14
	//  164  295:lload           9
	//  165  297:invokestatic    #107 <Method Long Long.valueOf(long)>
	//  166  300:invokestatic    #113 <Method Pair Pair.create(Object, Object)>
	//  167  303:areturn         
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #119 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #121 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #126 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void packetFinished()
	{
	//    0    0:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		if(l != -1L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #83  <Long -1L>
	//*   2    4:lcmp            
	//*   3    5:ifeq            13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		pesPtsUsAvailable = flag;
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:putfield        #131 <Field boolean pesPtsUsAvailable>
		if(pesPtsUsAvailable)
	//*  12   20:aload_0         
	//*  13   21:getfield        #131 <Field boolean pesPtsUsAvailable>
	//*  14   24:ifeq            32
			pesTimeUs = l;
	//   15   27:aload_0         
	//   16   28:lload_1         
	//   17   29:putfield        #133 <Field long pesTimeUs>
	//   18   32:return          
	}

	public void seek()
	{
		NalUnitUtil.clearPrefixFlags(prefixFlags);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean[] prefixFlags>
	//    2    4:invokestatic    #140 <Method void NalUnitUtil.clearPrefixFlags(boolean[])>
		csdBuffer.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field H262Reader$CsdBuffer csdBuffer>
	//    5   11:invokevirtual   #143 <Method void H262Reader$CsdBuffer.reset()>
		pesPtsUsAvailable = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #131 <Field boolean pesPtsUsAvailable>
		foundFirstFrameInGroup = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #145 <Field boolean foundFirstFrameInGroup>
		totalBytesWritten = 0L;
	//   12   24:aload_0         
	//   13   25:lconst_0        
	//   14   26:putfield        #147 <Field long totalBytesWritten>
	//   15   29:return          
	}

	private static final double FRAME_RATE_VALUES[] = {
		23.976023976023978D, 24D, 25D, 29.970029970029969D, 30D, 50D, 59.940059940059939D, 60D
	};
	private static final int START_EXTENSION = 181;
	private static final int START_GROUP = 184;
	private static final int START_PICTURE = 0;
	private static final int START_SEQUENCE_HEADER = 179;
	private final CsdBuffer csdBuffer = new CsdBuffer(128);
	private boolean foundFirstFrameInGroup;
	private long frameDurationUs;
	private long framePosition;
	private long frameTimeUs;
	private boolean hasOutputFormat;
	private boolean isKeyframe;
	private boolean pesPtsUsAvailable;
	private long pesTimeUs;
	private final boolean prefixFlags[] = new boolean[4];
	private long totalBytesWritten;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        double[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc2w           #36  <Double 23.976023976023978D>
	//    5    9:dastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc2w           #38  <Double 24D>
	//    9   15:dastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:ldc2w           #40  <Double 25D>
	//   13   21:dastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:ldc2w           #42  <Double 29.970029970029969D>
	//   17   27:dastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:ldc2w           #44  <Double 30D>
	//   21   33:dastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:ldc2w           #46  <Double 50D>
	//   25   39:dastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:ldc2w           #48  <Double 59.940059940059939D>
	//   29   46:dastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:ldc2w           #50  <Double 60D>
	//   33   53:dastore         
	//   34   54:putstatic       #53  <Field double[] FRAME_RATE_VALUES>
	//*  35   57:return          
	}
}
