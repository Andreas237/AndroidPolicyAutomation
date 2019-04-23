// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.*;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader, NalUnitTargetBuffer, SeiReader

final class H265Reader extends ElementaryStreamReader
{
	private static final class SampleReader
	{

		private void outputSample(int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #38  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #40  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #45  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public void endNalUnit(long l, int i)
		{
			if(writingParameterSets && isFirstSlice)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field boolean writingParameterSets>
		//*   2    4:ifeq            28
		//*   3    7:aload_0         
		//*   4    8:getfield        #51  <Field boolean isFirstSlice>
		//*   5   11:ifeq            28
			{
				sampleIsKeyframe = nalUnitHasKeyframeData;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #53  <Field boolean nalUnitHasKeyframeData>
		//    9   19:putfield        #55  <Field boolean sampleIsKeyframe>
				writingParameterSets = false;
		//   10   22:aload_0         
		//   11   23:iconst_0        
		//   12   24:putfield        #49  <Field boolean writingParameterSets>
				return;
		//   13   27:return          
			}
			if(isFirstParameterSet || isFirstSlice)
		//*  14   28:aload_0         
		//*  15   29:getfield        #57  <Field boolean isFirstParameterSet>
		//*  16   32:ifne            42
		//*  17   35:aload_0         
		//*  18   36:getfield        #51  <Field boolean isFirstSlice>
		//*  19   39:ifeq            91
			{
				if(readingSample)
		//*  20   42:aload_0         
		//*  21   43:getfield        #59  <Field boolean readingSample>
		//*  22   46:ifeq            62
					outputSample(i + (int)(l - nalUnitStartPosition));
		//   23   49:aload_0         
		//   24   50:iload_3         
		//   25   51:lload_1         
		//   26   52:aload_0         
		//   27   53:getfield        #61  <Field long nalUnitStartPosition>
		//   28   56:lsub            
		//   29   57:l2i             
		//   30   58:iadd            
		//   31   59:invokespecial   #63  <Method void outputSample(int)>
				samplePosition = nalUnitStartPosition;
		//   32   62:aload_0         
		//   33   63:aload_0         
		//   34   64:getfield        #61  <Field long nalUnitStartPosition>
		//   35   67:putfield        #65  <Field long samplePosition>
				sampleTimeUs = nalUnitTimeUs;
		//   36   70:aload_0         
		//   37   71:aload_0         
		//   38   72:getfield        #67  <Field long nalUnitTimeUs>
		//   39   75:putfield        #69  <Field long sampleTimeUs>
				readingSample = true;
		//   40   78:aload_0         
		//   41   79:iconst_1        
		//   42   80:putfield        #59  <Field boolean readingSample>
				sampleIsKeyframe = nalUnitHasKeyframeData;
		//   43   83:aload_0         
		//   44   84:aload_0         
		//   45   85:getfield        #53  <Field boolean nalUnitHasKeyframeData>
		//   46   88:putfield        #55  <Field boolean sampleIsKeyframe>
			}
		//   47   91:return          
		}

		public void readNalUnitData(byte abyte0[], int i, int j)
		{
			if(lookingForFirstSliceFlag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #73  <Field boolean lookingForFirstSliceFlag>
		//*   2    4:ifeq            69
			{
				int k = nalUnitBytesRead;
		//    3    7:aload_0         
		//    4    8:getfield        #75  <Field int nalUnitBytesRead>
		//    5   11:istore          4
				int l = (i + 2) - k;
		//    6   13:iload_2         
		//    7   14:iconst_2        
		//    8   15:iadd            
		//    9   16:iload           4
		//   10   18:isub            
		//   11   19:istore          5
				if(l < j)
		//*  12   21:iload           5
		//*  13   23:iload_3         
		//*  14   24:icmpge          59
				{
					boolean flag;
					if((abyte0[l] & 0x80) != 0)
		//*  15   27:aload_1         
		//*  16   28:iload           5
		//*  17   30:baload          
		//*  18   31:sipush          128
		//*  19   34:iand            
		//*  20   35:ifeq            44
						flag = true;
		//   21   38:iconst_1        
		//   22   39:istore          6
					else
		//*  23   41:goto            47
						flag = false;
		//   24   44:iconst_0        
		//   25   45:istore          6
					isFirstSlice = flag;
		//   26   47:aload_0         
		//   27   48:iload           6
		//   28   50:putfield        #51  <Field boolean isFirstSlice>
					lookingForFirstSliceFlag = false;
		//   29   53:aload_0         
		//   30   54:iconst_0        
		//   31   55:putfield        #73  <Field boolean lookingForFirstSliceFlag>
					return;
		//   32   58:return          
				}
				nalUnitBytesRead = k + (j - i);
		//   33   59:aload_0         
		//   34   60:iload           4
		//   35   62:iload_3         
		//   36   63:iload_2         
		//   37   64:isub            
		//   38   65:iadd            
		//   39   66:putfield        #75  <Field int nalUnitBytesRead>
			}
		//   40   69:return          
		}

		public void reset()
		{
			lookingForFirstSliceFlag = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #73  <Field boolean lookingForFirstSliceFlag>
			isFirstSlice = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #51  <Field boolean isFirstSlice>
			isFirstParameterSet = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #57  <Field boolean isFirstParameterSet>
			readingSample = false;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #59  <Field boolean readingSample>
			writingParameterSets = false;
		//   12   20:aload_0         
		//   13   21:iconst_0        
		//   14   22:putfield        #49  <Field boolean writingParameterSets>
		//   15   25:return          
		}

		public void startNalUnit(long l, int i, int j, long l1)
		{
			isFirstSlice = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #51  <Field boolean isFirstSlice>
			isFirstParameterSet = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #57  <Field boolean isFirstParameterSet>
			nalUnitTimeUs = l1;
		//    6   10:aload_0         
		//    7   11:lload           5
		//    8   13:putfield        #67  <Field long nalUnitTimeUs>
			nalUnitBytesRead = 0;
		//    9   16:aload_0         
		//   10   17:iconst_0        
		//   11   18:putfield        #75  <Field int nalUnitBytesRead>
			nalUnitStartPosition = l;
		//   12   21:aload_0         
		//   13   22:lload_1         
		//   14   23:putfield        #61  <Field long nalUnitStartPosition>
			boolean flag1 = true;
		//   15   26:iconst_1        
		//   16   27:istore          8
			if(j >= 32)
		//*  17   29:iload           4
		//*  18   31:bipush          32
		//*  19   33:icmplt          82
			{
				if(!writingParameterSets && readingSample)
		//*  20   36:aload_0         
		//*  21   37:getfield        #49  <Field boolean writingParameterSets>
		//*  22   40:ifne            60
		//*  23   43:aload_0         
		//*  24   44:getfield        #59  <Field boolean readingSample>
		//*  25   47:ifeq            60
				{
					outputSample(i);
		//   26   50:aload_0         
		//   27   51:iload_3         
		//   28   52:invokespecial   #63  <Method void outputSample(int)>
					readingSample = false;
		//   29   55:aload_0         
		//   30   56:iconst_0        
		//   31   57:putfield        #59  <Field boolean readingSample>
				}
				if(j <= 34)
		//*  32   60:iload           4
		//*  33   62:bipush          34
		//*  34   64:icmpgt          82
				{
					isFirstParameterSet = writingParameterSets ^ true;
		//   35   67:aload_0         
		//   36   68:aload_0         
		//   37   69:getfield        #49  <Field boolean writingParameterSets>
		//   38   72:iconst_1        
		//   39   73:ixor            
		//   40   74:putfield        #57  <Field boolean isFirstParameterSet>
					writingParameterSets = true;
		//   41   77:aload_0         
		//   42   78:iconst_1        
		//   43   79:putfield        #49  <Field boolean writingParameterSets>
				}
			}
			boolean flag;
			if(j >= 16 && j <= 21)
		//*  44   82:iload           4
		//*  45   84:bipush          16
		//*  46   86:icmplt          102
		//*  47   89:iload           4
		//*  48   91:bipush          21
		//*  49   93:icmpgt          102
				flag = true;
		//   50   96:iconst_1        
		//   51   97:istore          7
			else
		//*  52   99:goto            105
				flag = false;
		//   53  102:iconst_0        
		//   54  103:istore          7
			nalUnitHasKeyframeData = flag;
		//   55  105:aload_0         
		//   56  106:iload           7
		//   57  108:putfield        #53  <Field boolean nalUnitHasKeyframeData>
			flag = flag1;
		//   58  111:iload           8
		//   59  113:istore          7
			if(!nalUnitHasKeyframeData)
		//*  60  115:aload_0         
		//*  61  116:getfield        #53  <Field boolean nalUnitHasKeyframeData>
		//*  62  119:ifne            139
				if(j <= 9)
		//*  63  122:iload           4
		//*  64  124:bipush          9
		//*  65  126:icmpgt          136
					flag = flag1;
		//   66  129:iload           8
		//   67  131:istore          7
				else
		//*  68  133:goto            139
					flag = false;
		//   69  136:iconst_0        
		//   70  137:istore          7
			lookingForFirstSliceFlag = flag;
		//   71  139:aload_0         
		//   72  140:iload           7
		//   73  142:putfield        #73  <Field boolean lookingForFirstSliceFlag>
		//   74  145:return          
		}

		private static final int FIRST_SLICE_FLAG_OFFSET = 2;
		private boolean isFirstParameterSet;
		private boolean isFirstSlice;
		private boolean lookingForFirstSliceFlag;
		private int nalUnitBytesRead;
		private boolean nalUnitHasKeyframeData;
		private long nalUnitStartPosition;
		private long nalUnitTimeUs;
		private final TrackOutput output;
		private boolean readingSample;
		private boolean sampleIsKeyframe;
		private long samplePosition;
		private long sampleTimeUs;
		private boolean writingParameterSets;

		public SampleReader(TrackOutput trackoutput)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			output = trackoutput;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field TrackOutput output>
		//    5    9:return          
		}
	}


	public H265Reader(TrackOutput trackoutput, SeiReader seireader)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void ElementaryStreamReader(TrackOutput)>
		seiReader = seireader;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #54  <Field SeiReader seiReader>
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:newarray        boolean[]
	//    9   14:putfield        #56  <Field boolean[] prefixFlags>
	//   10   17:aload_0         
	//   11   18:new             #58  <Class NalUnitTargetBuffer>
	//   12   21:dup             
	//   13   22:bipush          32
	//   14   24:sipush          128
	//   15   27:invokespecial   #61  <Method void NalUnitTargetBuffer(int, int)>
	//   16   30:putfield        #63  <Field NalUnitTargetBuffer vps>
	//   17   33:aload_0         
	//   18   34:new             #58  <Class NalUnitTargetBuffer>
	//   19   37:dup             
	//   20   38:bipush          33
	//   21   40:sipush          128
	//   22   43:invokespecial   #61  <Method void NalUnitTargetBuffer(int, int)>
	//   23   46:putfield        #65  <Field NalUnitTargetBuffer sps>
	//   24   49:aload_0         
	//   25   50:new             #58  <Class NalUnitTargetBuffer>
	//   26   53:dup             
	//   27   54:bipush          34
	//   28   56:sipush          128
	//   29   59:invokespecial   #61  <Method void NalUnitTargetBuffer(int, int)>
	//   30   62:putfield        #67  <Field NalUnitTargetBuffer pps>
	//   31   65:aload_0         
	//   32   66:new             #58  <Class NalUnitTargetBuffer>
	//   33   69:dup             
	//   34   70:bipush          39
	//   35   72:sipush          128
	//   36   75:invokespecial   #61  <Method void NalUnitTargetBuffer(int, int)>
	//   37   78:putfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//   38   81:aload_0         
	//   39   82:new             #58  <Class NalUnitTargetBuffer>
	//   40   85:dup             
	//   41   86:bipush          40
	//   42   88:sipush          128
	//   43   91:invokespecial   #61  <Method void NalUnitTargetBuffer(int, int)>
	//   44   94:putfield        #71  <Field NalUnitTargetBuffer suffixSei>
		sampleReader = new SampleReader(trackoutput);
	//   45   97:aload_0         
	//   46   98:new             #6   <Class H265Reader$SampleReader>
	//   47  101:dup             
	//   48  102:aload_1         
	//   49  103:invokespecial   #72  <Method void H265Reader$SampleReader(TrackOutput)>
	//   50  106:putfield        #74  <Field H265Reader$SampleReader sampleReader>
	//   51  109:aload_0         
	//   52  110:new             #76  <Class ParsableByteArray>
	//   53  113:dup             
	//   54  114:invokespecial   #79  <Method void ParsableByteArray()>
	//   55  117:putfield        #81  <Field ParsableByteArray seiWrapper>
	//   56  120:return          
	}

	private void endNalUnit(long l, int i, int j, long l1)
	{
		if(hasOutputFormat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            19
		{
			sampleReader.endNalUnit(l, i);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field H265Reader$SampleReader sampleReader>
	//    5   11:lload_1         
	//    6   12:iload_3         
	//    7   13:invokevirtual   #89  <Method void H265Reader$SampleReader.endNalUnit(long, int)>
		} else
	//*   8   16:goto            108
		{
			vps.endNalUnit(j);
	//    9   19:aload_0         
	//   10   20:getfield        #63  <Field NalUnitTargetBuffer vps>
	//   11   23:iload           4
	//   12   25:invokevirtual   #92  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   13   28:pop             
			sps.endNalUnit(j);
	//   14   29:aload_0         
	//   15   30:getfield        #65  <Field NalUnitTargetBuffer sps>
	//   16   33:iload           4
	//   17   35:invokevirtual   #92  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   18   38:pop             
			pps.endNalUnit(j);
	//   19   39:aload_0         
	//   20   40:getfield        #67  <Field NalUnitTargetBuffer pps>
	//   21   43:iload           4
	//   22   45:invokevirtual   #92  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   23   48:pop             
			if(vps.isCompleted() && sps.isCompleted() && pps.isCompleted())
	//*  24   49:aload_0         
	//*  25   50:getfield        #63  <Field NalUnitTargetBuffer vps>
	//*  26   53:invokevirtual   #96  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  27   56:ifeq            108
	//*  28   59:aload_0         
	//*  29   60:getfield        #65  <Field NalUnitTargetBuffer sps>
	//*  30   63:invokevirtual   #96  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  31   66:ifeq            108
	//*  32   69:aload_0         
	//*  33   70:getfield        #67  <Field NalUnitTargetBuffer pps>
	//*  34   73:invokevirtual   #96  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  35   76:ifeq            108
			{
				output.format(parseMediaFormat(vps, sps, pps));
	//   36   79:aload_0         
	//   37   80:getfield        #100 <Field TrackOutput output>
	//   38   83:aload_0         
	//   39   84:getfield        #63  <Field NalUnitTargetBuffer vps>
	//   40   87:aload_0         
	//   41   88:getfield        #65  <Field NalUnitTargetBuffer sps>
	//   42   91:aload_0         
	//   43   92:getfield        #67  <Field NalUnitTargetBuffer pps>
	//   44   95:invokestatic    #104 <Method MediaFormat parseMediaFormat(NalUnitTargetBuffer, NalUnitTargetBuffer, NalUnitTargetBuffer)>
	//   45   98:invokeinterface #110 <Method void TrackOutput.format(MediaFormat)>
				hasOutputFormat = true;
	//   46  103:aload_0         
	//   47  104:iconst_1        
	//   48  105:putfield        #86  <Field boolean hasOutputFormat>
			}
		}
		if(prefixSei.endNalUnit(j))
	//*  49  108:aload_0         
	//*  50  109:getfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//*  51  112:iload           4
	//*  52  114:invokevirtual   #92  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//*  53  117:ifeq            174
		{
			i = NalUnitUtil.unescapeStream(prefixSei.nalData, prefixSei.nalLength);
	//   54  120:aload_0         
	//   55  121:getfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//   56  124:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   57  127:aload_0         
	//   58  128:getfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//   59  131:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   60  134:invokestatic    #123 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//   61  137:istore_3        
			seiWrapper.reset(prefixSei.nalData, i);
	//   62  138:aload_0         
	//   63  139:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   64  142:aload_0         
	//   65  143:getfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//   66  146:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   67  149:iload_3         
	//   68  150:invokevirtual   #127 <Method void ParsableByteArray.reset(byte[], int)>
			seiWrapper.skipBytes(5);
	//   69  153:aload_0         
	//   70  154:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   71  157:iconst_5        
	//   72  158:invokevirtual   #131 <Method void ParsableByteArray.skipBytes(int)>
			seiReader.consume(l1, seiWrapper);
	//   73  161:aload_0         
	//   74  162:getfield        #54  <Field SeiReader seiReader>
	//   75  165:lload           5
	//   76  167:aload_0         
	//   77  168:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   78  171:invokevirtual   #137 <Method void SeiReader.consume(long, ParsableByteArray)>
		}
		if(suffixSei.endNalUnit(j))
	//*  79  174:aload_0         
	//*  80  175:getfield        #71  <Field NalUnitTargetBuffer suffixSei>
	//*  81  178:iload           4
	//*  82  180:invokevirtual   #92  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//*  83  183:ifeq            240
		{
			i = NalUnitUtil.unescapeStream(suffixSei.nalData, suffixSei.nalLength);
	//   84  186:aload_0         
	//   85  187:getfield        #71  <Field NalUnitTargetBuffer suffixSei>
	//   86  190:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   87  193:aload_0         
	//   88  194:getfield        #71  <Field NalUnitTargetBuffer suffixSei>
	//   89  197:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   90  200:invokestatic    #123 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//   91  203:istore_3        
			seiWrapper.reset(suffixSei.nalData, i);
	//   92  204:aload_0         
	//   93  205:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   94  208:aload_0         
	//   95  209:getfield        #71  <Field NalUnitTargetBuffer suffixSei>
	//   96  212:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   97  215:iload_3         
	//   98  216:invokevirtual   #127 <Method void ParsableByteArray.reset(byte[], int)>
			seiWrapper.skipBytes(5);
	//   99  219:aload_0         
	//  100  220:getfield        #81  <Field ParsableByteArray seiWrapper>
	//  101  223:iconst_5        
	//  102  224:invokevirtual   #131 <Method void ParsableByteArray.skipBytes(int)>
			seiReader.consume(l1, seiWrapper);
	//  103  227:aload_0         
	//  104  228:getfield        #54  <Field SeiReader seiReader>
	//  105  231:lload           5
	//  106  233:aload_0         
	//  107  234:getfield        #81  <Field ParsableByteArray seiWrapper>
	//  108  237:invokevirtual   #137 <Method void SeiReader.consume(long, ParsableByteArray)>
		}
	//  109  240:return          
	}

	private void nalUnitData(byte abyte0[], int i, int j)
	{
		if(hasOutputFormat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            20
		{
			sampleReader.readNalUnitData(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field H265Reader$SampleReader sampleReader>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #142 <Method void H265Reader$SampleReader.readNalUnitData(byte[], int, int)>
		} else
	//*   9   17:goto            50
		{
			vps.appendToNalUnit(abyte0, i, j);
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field NalUnitTargetBuffer vps>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:iload_3         
	//   15   27:invokevirtual   #145 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
			sps.appendToNalUnit(abyte0, i, j);
	//   16   30:aload_0         
	//   17   31:getfield        #65  <Field NalUnitTargetBuffer sps>
	//   18   34:aload_1         
	//   19   35:iload_2         
	//   20   36:iload_3         
	//   21   37:invokevirtual   #145 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
			pps.appendToNalUnit(abyte0, i, j);
	//   22   40:aload_0         
	//   23   41:getfield        #67  <Field NalUnitTargetBuffer pps>
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:iload_3         
	//   27   47:invokevirtual   #145 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		}
		prefixSei.appendToNalUnit(abyte0, i, j);
	//   28   50:aload_0         
	//   29   51:getfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//   30   54:aload_1         
	//   31   55:iload_2         
	//   32   56:iload_3         
	//   33   57:invokevirtual   #145 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		suffixSei.appendToNalUnit(abyte0, i, j);
	//   34   60:aload_0         
	//   35   61:getfield        #71  <Field NalUnitTargetBuffer suffixSei>
	//   36   64:aload_1         
	//   37   65:iload_2         
	//   38   66:iload_3         
	//   39   67:invokevirtual   #145 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
	//   40   70:return          
	}

	private static MediaFormat parseMediaFormat(NalUnitTargetBuffer nalunittargetbuffer, NalUnitTargetBuffer nalunittargetbuffer1, NalUnitTargetBuffer nalunittargetbuffer2)
	{
		float f;
		int i1;
		int j1;
		byte abyte0[];
label0:
		{
			abyte0 = new byte[nalunittargetbuffer.nalLength + nalunittargetbuffer1.nalLength + nalunittargetbuffer2.nalLength];
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//    2    4:aload_1         
	//    3    5:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//    4    8:iadd            
	//    5    9:aload_2         
	//    6   10:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//    7   13:iadd            
	//    8   14:newarray        byte[]
	//    9   16:astore          15
			byte abyte1[] = nalunittargetbuffer.nalData;
	//   10   18:aload_0         
	//   11   19:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   12   22:astore          16
			int i = nalunittargetbuffer.nalLength;
	//   13   24:aload_0         
	//   14   25:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   15   28:istore          5
			boolean flag = false;
	//   16   30:iconst_0        
	//   17   31:istore          8
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), 0, i);
	//   18   33:aload           16
	//   19   35:iconst_0        
	//   20   36:aload           15
	//   21   38:iconst_0        
	//   22   39:iload           5
	//   23   41:invokestatic    #151 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (nalunittargetbuffer1.nalData)), 0, ((Object) (abyte0)), nalunittargetbuffer.nalLength, nalunittargetbuffer1.nalLength);
	//   24   44:aload_1         
	//   25   45:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   26   48:iconst_0        
	//   27   49:aload           15
	//   28   51:aload_0         
	//   29   52:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   30   55:aload_1         
	//   31   56:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   32   59:invokestatic    #151 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (nalunittargetbuffer2.nalData)), 0, ((Object) (abyte0)), nalunittargetbuffer.nalLength + nalunittargetbuffer1.nalLength, nalunittargetbuffer2.nalLength);
	//   33   62:aload_2         
	//   34   63:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   35   66:iconst_0        
	//   36   67:aload           15
	//   37   69:aload_0         
	//   38   70:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   39   73:aload_1         
	//   40   74:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   41   77:iadd            
	//   42   78:aload_2         
	//   43   79:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   44   82:invokestatic    #151 <Method void System.arraycopy(Object, int, Object, int, int)>
			NalUnitUtil.unescapeStream(nalunittargetbuffer1.nalData, nalunittargetbuffer1.nalLength);
	//   45   85:aload_1         
	//   46   86:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   47   89:aload_1         
	//   48   90:getfield        #117 <Field int NalUnitTargetBuffer.nalLength>
	//   49   93:invokestatic    #123 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//   50   96:pop             
			nalunittargetbuffer = ((NalUnitTargetBuffer) (new ParsableBitArray(nalunittargetbuffer1.nalData)));
	//   51   97:new             #153 <Class ParsableBitArray>
	//   52  100:dup             
	//   53  101:aload_1         
	//   54  102:getfield        #114 <Field byte[] NalUnitTargetBuffer.nalData>
	//   55  105:invokespecial   #156 <Method void ParsableBitArray(byte[])>
	//   56  108:astore_0        
			((ParsableBitArray) (nalunittargetbuffer)).skipBits(44);
	//   57  109:aload_0         
	//   58  110:bipush          44
	//   59  112:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			int l1 = ((ParsableBitArray) (nalunittargetbuffer)).readBits(3);
	//   60  115:aload_0         
	//   61  116:iconst_3        
	//   62  117:invokevirtual   #163 <Method int ParsableBitArray.readBits(int)>
	//   63  120:istore          9
			((ParsableBitArray) (nalunittargetbuffer)).skipBits(1);
	//   64  122:aload_0         
	//   65  123:iconst_1        
	//   66  124:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			((ParsableBitArray) (nalunittargetbuffer)).skipBits(88);
	//   67  127:aload_0         
	//   68  128:bipush          88
	//   69  130:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			((ParsableBitArray) (nalunittargetbuffer)).skipBits(8);
	//   70  133:aload_0         
	//   71  134:bipush          8
	//   72  136:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			j1 = 0;
	//   73  139:iconst_0        
	//   74  140:istore          7
			i = j1;
	//   75  142:iload           7
	//   76  144:istore          5
			for(; j1 < l1; j1++)
	//*  77  146:iload           7
	//*  78  148:iload           9
	//*  79  150:icmpge          198
			{
				int l = i;
	//   80  153:iload           5
	//   81  155:istore          6
				if(((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//*  82  157:aload_0         
	//*  83  158:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//*  84  161:ifeq            171
					l = i + 89;
	//   85  164:iload           5
	//   86  166:bipush          89
	//   87  168:iadd            
	//   88  169:istore          6
				i = l;
	//   89  171:iload           6
	//   90  173:istore          5
				if(((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//*  91  175:aload_0         
	//*  92  176:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//*  93  179:ifeq            189
					i = l + 8;
	//   94  182:iload           6
	//   95  184:bipush          8
	//   96  186:iadd            
	//   97  187:istore          5
			}

	//   98  189:iload           7
	//   99  191:iconst_1        
	//  100  192:iadd            
	//  101  193:istore          7
	//* 102  195:goto            146
			((ParsableBitArray) (nalunittargetbuffer)).skipBits(i);
	//  103  198:aload_0         
	//  104  199:iload           5
	//  105  201:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			if(l1 > 0)
	//* 106  204:iload           9
	//* 107  206:ifle            220
				((ParsableBitArray) (nalunittargetbuffer)).skipBits((8 - l1) * 2);
	//  108  209:aload_0         
	//  109  210:bipush          8
	//  110  212:iload           9
	//  111  214:isub            
	//  112  215:iconst_2        
	//  113  216:imul            
	//  114  217:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  115  220:aload_0         
	//  116  221:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  117  224:pop             
			i1 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  118  225:aload_0         
	//  119  226:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  120  229:istore          6
			if(i1 == 3)
	//* 121  231:iload           6
	//* 122  233:iconst_3        
	//* 123  234:icmpne          242
				((ParsableBitArray) (nalunittargetbuffer)).skipBits(1);
	//  124  237:aload_0         
	//  125  238:iconst_1        
	//  126  239:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			int i2 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  127  242:aload_0         
	//  128  243:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  129  246:istore          10
			j1 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  130  248:aload_0         
	//  131  249:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  132  252:istore          7
			if(((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//* 133  254:aload_0         
	//* 134  255:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 135  258:ifeq            357
			{
				int l2 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  136  261:aload_0         
	//  137  262:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  138  265:istore          13
				int i3 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  139  267:aload_0         
	//  140  268:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  141  271:istore          14
				int j2 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  142  273:aload_0         
	//  143  274:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  144  277:istore          11
				int k2 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  145  279:aload_0         
	//  146  280:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  147  283:istore          12
				if(i1 != 1 && i1 != 2)
	//* 148  285:iload           6
	//* 149  287:iconst_1        
	//* 150  288:icmpeq          306
	//* 151  291:iload           6
	//* 152  293:iconst_2        
	//* 153  294:icmpne          300
	//* 154  297:goto            306
					i = 1;
	//  155  300:iconst_1        
	//  156  301:istore          5
				else
	//* 157  303:goto            309
					i = 2;
	//  158  306:iconst_2        
	//  159  307:istore          5
				if(i1 == 1)
	//* 160  309:iload           6
	//* 161  311:iconst_1        
	//* 162  312:icmpne          321
					i1 = 2;
	//  163  315:iconst_2        
	//  164  316:istore          6
				else
	//* 165  318:goto            324
					i1 = 1;
	//  166  321:iconst_1        
	//  167  322:istore          6
				i = i2 - i * (l2 + i3);
	//  168  324:iload           10
	//  169  326:iload           5
	//  170  328:iload           13
	//  171  330:iload           14
	//  172  332:iadd            
	//  173  333:imul            
	//  174  334:isub            
	//  175  335:istore          5
				j1 -= i1 * (j2 + k2);
	//  176  337:iload           7
	//  177  339:iload           6
	//  178  341:iload           11
	//  179  343:iload           12
	//  180  345:iadd            
	//  181  346:imul            
	//  182  347:isub            
	//  183  348:istore          7
				i1 = i;
	//  184  350:iload           5
	//  185  352:istore          6
			} else
	//* 186  354:goto            361
			{
				i1 = i2;
	//  187  357:iload           10
	//  188  359:istore          6
			}
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  189  361:aload_0         
	//  190  362:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  191  365:pop             
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  192  366:aload_0         
	//  193  367:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  194  370:pop             
			i2 = ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  195  371:aload_0         
	//  196  372:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  197  375:istore          10
			if(((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//* 198  377:aload_0         
	//* 199  378:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 200  381:ifeq            390
				i = 0;
	//  201  384:iconst_0        
	//  202  385:istore          5
			else
	//* 203  387:goto            394
				i = l1;
	//  204  390:iload           9
	//  205  392:istore          5
			for(; i <= l1; i++)
	//* 206  394:iload           5
	//* 207  396:iload           9
	//* 208  398:icmpgt          425
			{
				((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  209  401:aload_0         
	//  210  402:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  211  405:pop             
				((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  212  406:aload_0         
	//  213  407:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  214  410:pop             
				((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  215  411:aload_0         
	//  216  412:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  217  415:pop             
			}

	//  218  416:iload           5
	//  219  418:iconst_1        
	//  220  419:iadd            
	//  221  420:istore          5
	//* 222  422:goto            394
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  223  425:aload_0         
	//  224  426:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  225  429:pop             
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  226  430:aload_0         
	//  227  431:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  228  434:pop             
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  229  435:aload_0         
	//  230  436:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  231  439:pop             
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  232  440:aload_0         
	//  233  441:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  234  444:pop             
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  235  445:aload_0         
	//  236  446:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  237  449:pop             
			((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  238  450:aload_0         
	//  239  451:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  240  454:pop             
			if(((ParsableBitArray) (nalunittargetbuffer)).readBit() && ((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//* 241  455:aload_0         
	//* 242  456:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 243  459:ifeq            473
	//* 244  462:aload_0         
	//* 245  463:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 246  466:ifeq            473
				skipScalingList(((ParsableBitArray) (nalunittargetbuffer)));
	//  247  469:aload_0         
	//  248  470:invokestatic    #174 <Method void skipScalingList(ParsableBitArray)>
			((ParsableBitArray) (nalunittargetbuffer)).skipBits(2);
	//  249  473:aload_0         
	//  250  474:iconst_2        
	//  251  475:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			if(((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//* 252  478:aload_0         
	//* 253  479:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 254  482:ifeq            506
			{
				((ParsableBitArray) (nalunittargetbuffer)).skipBits(8);
	//  255  485:aload_0         
	//  256  486:bipush          8
	//  257  488:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
				((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  258  491:aload_0         
	//  259  492:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  260  495:pop             
				((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  261  496:aload_0         
	//  262  497:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  263  500:pop             
				((ParsableBitArray) (nalunittargetbuffer)).skipBits(1);
	//  264  501:aload_0         
	//  265  502:iconst_1        
	//  266  503:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			}
			skipShortTermRefPicSets(((ParsableBitArray) (nalunittargetbuffer)));
	//  267  506:aload_0         
	//  268  507:invokestatic    #177 <Method void skipShortTermRefPicSets(ParsableBitArray)>
			if(((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//* 269  510:aload_0         
	//* 270  511:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 271  514:ifeq            549
			{
				for(int j = ((int) (flag)); j < ((ParsableBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt(); j++)
	//* 272  517:iload           8
	//* 273  519:istore          5
	//* 274  521:iload           5
	//* 275  523:aload_0         
	//* 276  524:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//* 277  527:icmpge          549
					((ParsableBitArray) (nalunittargetbuffer)).skipBits(i2 + 4 + 1);
	//  278  530:aload_0         
	//  279  531:iload           10
	//  280  533:iconst_4        
	//  281  534:iadd            
	//  282  535:iconst_1        
	//  283  536:iadd            
	//  284  537:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>

	//  285  540:iload           5
	//  286  542:iconst_1        
	//  287  543:iadd            
	//  288  544:istore          5
			}
	//* 289  546:goto            521
			((ParsableBitArray) (nalunittargetbuffer)).skipBits(2);
	//  290  549:aload_0         
	//  291  550:iconst_2        
	//  292  551:invokevirtual   #159 <Method void ParsableBitArray.skipBits(int)>
			float f1 = 1.0F;
	//  293  554:fconst_1        
	//  294  555:fstore          4
			if(((ParsableBitArray) (nalunittargetbuffer)).readBit() && ((ParsableBitArray) (nalunittargetbuffer)).readBit())
	//* 295  557:aload_0         
	//* 296  558:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 297  561:ifeq            681
	//* 298  564:aload_0         
	//* 299  565:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//* 300  568:ifeq            681
			{
				int k = ((ParsableBitArray) (nalunittargetbuffer)).readBits(8);
	//  301  571:aload_0         
	//  302  572:bipush          8
	//  303  574:invokevirtual   #163 <Method int ParsableBitArray.readBits(int)>
	//  304  577:istore          5
				if(k == 255)
	//* 305  579:iload           5
	//* 306  581:sipush          255
	//* 307  584:icmpne          630
				{
					k = ((ParsableBitArray) (nalunittargetbuffer)).readBits(16);
	//  308  587:aload_0         
	//  309  588:bipush          16
	//  310  590:invokevirtual   #163 <Method int ParsableBitArray.readBits(int)>
	//  311  593:istore          5
					int k1 = ((ParsableBitArray) (nalunittargetbuffer)).readBits(16);
	//  312  595:aload_0         
	//  313  596:bipush          16
	//  314  598:invokevirtual   #163 <Method int ParsableBitArray.readBits(int)>
	//  315  601:istore          8
					f = f1;
	//  316  603:fload           4
	//  317  605:fstore_3        
					if(k != 0)
	//* 318  606:iload           5
	//* 319  608:ifeq            627
					{
						f = f1;
	//  320  611:fload           4
	//  321  613:fstore_3        
						if(k1 != 0)
	//* 322  614:iload           8
	//* 323  616:ifeq            627
							f = (float)k / (float)k1;
	//  324  619:iload           5
	//  325  621:i2f             
	//  326  622:iload           8
	//  327  624:i2f             
	//  328  625:fdiv            
	//  329  626:fstore_3        
					}
					break label0;
	//  330  627:goto            683
				}
				if(k < NalUnitUtil.ASPECT_RATIO_IDC_VALUES.length)
	//* 331  630:iload           5
	//* 332  632:getstatic       #181 <Field float[] NalUnitUtil.ASPECT_RATIO_IDC_VALUES>
	//* 333  635:arraylength     
	//* 334  636:icmpge          649
				{
					f = NalUnitUtil.ASPECT_RATIO_IDC_VALUES[k];
	//  335  639:getstatic       #181 <Field float[] NalUnitUtil.ASPECT_RATIO_IDC_VALUES>
	//  336  642:iload           5
	//  337  644:faload          
	//  338  645:fstore_3        
					break label0;
	//  339  646:goto            683
				}
				nalunittargetbuffer = ((NalUnitTargetBuffer) (new StringBuilder()));
	//  340  649:new             #183 <Class StringBuilder>
	//  341  652:dup             
	//  342  653:invokespecial   #184 <Method void StringBuilder()>
	//  343  656:astore_0        
				((StringBuilder) (nalunittargetbuffer)).append("Unexpected aspect_ratio_idc value: ");
	//  344  657:aload_0         
	//  345  658:ldc1            #186 <String "Unexpected aspect_ratio_idc value: ">
	//  346  660:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  347  663:pop             
				((StringBuilder) (nalunittargetbuffer)).append(k);
	//  348  664:aload_0         
	//  349  665:iload           5
	//  350  667:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//  351  670:pop             
				Log.w("H265Reader", ((StringBuilder) (nalunittargetbuffer)).toString());
	//  352  671:ldc1            #26  <String "H265Reader">
	//  353  673:aload_0         
	//  354  674:invokevirtual   #197 <Method String StringBuilder.toString()>
	//  355  677:invokestatic    #203 <Method int Log.w(String, String)>
	//  356  680:pop             
			}
			f = 1.0F;
	//  357  681:fconst_1        
	//  358  682:fstore_3        
		}
		return MediaFormat.createVideoFormat(((String) (null)), "video/hevc", -1, -1, -1L, i1, j1, Collections.singletonList(((Object) (abyte0))), -1, f);
	//  359  683:aconst_null     
	//  360  684:ldc1            #205 <String "video/hevc">
	//  361  686:iconst_m1       
	//  362  687:iconst_m1       
	//  363  688:ldc2w           #206 <Long -1L>
	//  364  691:iload           6
	//  365  693:iload           7
	//  366  695:aload           15
	//  367  697:invokestatic    #213 <Method java.util.List Collections.singletonList(Object)>
	//  368  700:iconst_m1       
	//  369  701:fload_3         
	//  370  702:invokestatic    #219 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, java.util.List, int, float)>
	//  371  705:areturn         
	}

	private static void skipScalingList(ParsableBitArray parsablebitarray)
	{
		for(int i = 0; i < 4; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:iconst_4        
	//*   4    4:icmpge          100
		{
			byte byte0;
			for(int j = 0; j < 6; j += ((int) (byte0)))
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:bipush          6
	//*   9   12:icmpge          93
			{
				if(!parsablebitarray.readBit())
	//*  10   15:aload_0         
	//*  11   16:invokevirtual   #166 <Method boolean ParsableBitArray.readBit()>
	//*  12   19:ifne            30
				{
					parsablebitarray.readUnsignedExpGolombCodedInt();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #170 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//   15   26:pop             
				} else
	//*  16   27:goto            74
				{
					int l = Math.min(64, 1 << (i << 1) + 4);
	//   17   30:bipush          64
	//   18   32:iconst_1        
	//   19   33:iload_1         
	//   20   34:iconst_1        
	//   21   35:ishl            
	//   22   36:iconst_4        
	//   23   37:iadd            
	//   24   38:ishl            
	//   25   39:invokestatic    #225 <Method int Math.min(int, int)>
	//   26   42:istore          4
					if(i > 1)
	//*  27   44:iload_1         
	//*  28   45:iconst_1        
	//*  29   46:icmple          54
						parsablebitarray.readSignedExpGolombCodedInt();
	//   30   49:aload_0         
	//   31   50:invokevirtual   #228 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
	//   32   53:pop             
					for(int k = 0; k < l; k++)
	//*  33   54:iconst_0        
	//*  34   55:istore_3        
	//*  35   56:iload_3         
	//*  36   57:iload           4
	//*  37   59:icmpge          74
						parsablebitarray.readSignedExpGolombCodedInt();
	//   38   62:aload_0         
	//   39   63:invokevirtual   #228 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
	//   40   66:pop             

	//   41   67:iload_3         
	//   42   68:iconst_1        
	//   43   69:iadd            
	//   44   70:istore_3        
				}
	//*  45   71:goto            56
				byte0 = 3;
	//   46   74:iconst_3        
	//   47   75:istore_3        
				if(i != 3)
	//*  48   76:iload_1         
	//*  49   77:iconst_3        
	//*  50   78:icmpne          84
	//*  51   81:goto            86
					byte0 = 1;
	//   52   84:iconst_1        
	//   53   85:istore_3        
			}

	//   54   86:iload_2         
	//   55   87:iload_3         
	//   56   88:iadd            
	//   57   89:istore_2        
		}

	//   58   90:goto            9
	//   59   93:iload_1         
	//   60   94:iconst_1        
	//   61   95:iadd            
	//   62   96:istore_1        
	//*  63   97:goto            2
	//   64  100:return          
	}

	private static void skipShortTermRefPicSets(ParsableBitArray parsablebitarray)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #230 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #232 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #237 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private void startNalUnit(long l, int i, int j, long l1)
	{
		if(hasOutputFormat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            23
		{
			sampleReader.startNalUnit(l, i, j, l1);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field H265Reader$SampleReader sampleReader>
	//    5   11:lload_1         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:lload           5
	//    9   17:invokevirtual   #240 <Method void H265Reader$SampleReader.startNalUnit(long, int, int, long)>
		} else
	//*  10   20:goto            50
		{
			vps.startNalUnit(j);
	//   11   23:aload_0         
	//   12   24:getfield        #63  <Field NalUnitTargetBuffer vps>
	//   13   27:iload           4
	//   14   29:invokevirtual   #242 <Method void NalUnitTargetBuffer.startNalUnit(int)>
			sps.startNalUnit(j);
	//   15   32:aload_0         
	//   16   33:getfield        #65  <Field NalUnitTargetBuffer sps>
	//   17   36:iload           4
	//   18   38:invokevirtual   #242 <Method void NalUnitTargetBuffer.startNalUnit(int)>
			pps.startNalUnit(j);
	//   19   41:aload_0         
	//   20   42:getfield        #67  <Field NalUnitTargetBuffer pps>
	//   21   45:iload           4
	//   22   47:invokevirtual   #242 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		}
		prefixSei.startNalUnit(j);
	//   23   50:aload_0         
	//   24   51:getfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//   25   54:iload           4
	//   26   56:invokevirtual   #242 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		suffixSei.startNalUnit(j);
	//   27   59:aload_0         
	//   28   60:getfield        #71  <Field NalUnitTargetBuffer suffixSei>
	//   29   63:iload           4
	//   30   65:invokevirtual   #242 <Method void NalUnitTargetBuffer.startNalUnit(int)>
	//   31   68:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		while(parsablebytearray.bytesLeft() > 0) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #246 <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:ifle            178
		{
			int i = parsablebytearray.getPosition();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #249 <Method int ParsableByteArray.getPosition()>
	//    5   11:istore_2        
			int j = parsablebytearray.limit();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #252 <Method int ParsableByteArray.limit()>
	//    8   16:istore_3        
			byte abyte0[] = parsablebytearray.data;
	//    9   17:aload_1         
	//   10   18:getfield        #255 <Field byte[] ParsableByteArray.data>
	//   11   21:astore          10
			totalBytesWritten = totalBytesWritten + (long)parsablebytearray.bytesLeft();
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #257 <Field long totalBytesWritten>
	//   15   28:aload_1         
	//   16   29:invokevirtual   #246 <Method int ParsableByteArray.bytesLeft()>
	//   17   32:i2l             
	//   18   33:ladd            
	//   19   34:putfield        #257 <Field long totalBytesWritten>
			output.sampleData(parsablebytearray, parsablebytearray.bytesLeft());
	//   20   37:aload_0         
	//   21   38:getfield        #100 <Field TrackOutput output>
	//   22   41:aload_1         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #246 <Method int ParsableByteArray.bytesLeft()>
	//   25   46:invokeinterface #261 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			while(i < j) 
	//*  26   51:iload_2         
	//*  27   52:iload_3         
	//*  28   53:icmpge          0
			{
				int k = NalUnitUtil.findNalUnit(abyte0, i, j, prefixFlags);
	//   29   56:aload           10
	//   30   58:iload_2         
	//   31   59:iload_3         
	//   32   60:aload_0         
	//   33   61:getfield        #56  <Field boolean[] prefixFlags>
	//   34   64:invokestatic    #265 <Method int NalUnitUtil.findNalUnit(byte[], int, int, boolean[])>
	//   35   67:istore          4
				if(k == j)
	//*  36   69:iload           4
	//*  37   71:iload_3         
	//*  38   72:icmpne          84
				{
					nalUnitData(abyte0, i, j);
	//   39   75:aload_0         
	//   40   76:aload           10
	//   41   78:iload_2         
	//   42   79:iload_3         
	//   43   80:invokespecial   #267 <Method void nalUnitData(byte[], int, int)>
					return;
	//   44   83:return          
				}
				int l = NalUnitUtil.getH265NalUnitType(abyte0, k);
	//   45   84:aload           10
	//   46   86:iload           4
	//   47   88:invokestatic    #270 <Method int NalUnitUtil.getH265NalUnitType(byte[], int)>
	//   48   91:istore          5
				int j1 = k - i;
	//   49   93:iload           4
	//   50   95:iload_2         
	//   51   96:isub            
	//   52   97:istore          7
				if(j1 > 0)
	//*  53   99:iload           7
	//*  54  101:ifle            113
					nalUnitData(abyte0, i, k);
	//   55  104:aload_0         
	//   56  105:aload           10
	//   57  107:iload_2         
	//   58  108:iload           4
	//   59  110:invokespecial   #267 <Method void nalUnitData(byte[], int, int)>
				int i1 = j - k;
	//   60  113:iload_3         
	//   61  114:iload           4
	//   62  116:isub            
	//   63  117:istore          6
				long l1 = totalBytesWritten - (long)i1;
	//   64  119:aload_0         
	//   65  120:getfield        #257 <Field long totalBytesWritten>
	//   66  123:iload           6
	//   67  125:i2l             
	//   68  126:lsub            
	//   69  127:lstore          8
				if(j1 < 0)
	//*  70  129:iload           7
	//*  71  131:ifge            141
					i = -j1;
	//   72  134:iload           7
	//   73  136:ineg            
	//   74  137:istore_2        
				else
	//*  75  138:goto            143
					i = 0;
	//   76  141:iconst_0        
	//   77  142:istore_2        
				endNalUnit(l1, i1, i, pesTimeUs);
	//   78  143:aload_0         
	//   79  144:lload           8
	//   80  146:iload           6
	//   81  148:iload_2         
	//   82  149:aload_0         
	//   83  150:getfield        #272 <Field long pesTimeUs>
	//   84  153:invokespecial   #274 <Method void endNalUnit(long, int, int, long)>
				startNalUnit(l1, i1, l, pesTimeUs);
	//   85  156:aload_0         
	//   86  157:lload           8
	//   87  159:iload           6
	//   88  161:iload           5
	//   89  163:aload_0         
	//   90  164:getfield        #272 <Field long pesTimeUs>
	//   91  167:invokespecial   #275 <Method void startNalUnit(long, int, int, long)>
				i = k + 3;
	//   92  170:iload           4
	//   93  172:iconst_3        
	//   94  173:iadd            
	//   95  174:istore_2        
			}
		}
	//*  96  175:goto            51
	//   97  178:return          
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
	//    2    2:putfield        #272 <Field long pesTimeUs>
	//    3    5:return          
	}

	public void seek()
	{
		NalUnitUtil.clearPrefixFlags(prefixFlags);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean[] prefixFlags>
	//    2    4:invokestatic    #283 <Method void NalUnitUtil.clearPrefixFlags(boolean[])>
		vps.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field NalUnitTargetBuffer vps>
	//    5   11:invokevirtual   #285 <Method void NalUnitTargetBuffer.reset()>
		sps.reset();
	//    6   14:aload_0         
	//    7   15:getfield        #65  <Field NalUnitTargetBuffer sps>
	//    8   18:invokevirtual   #285 <Method void NalUnitTargetBuffer.reset()>
		pps.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #67  <Field NalUnitTargetBuffer pps>
	//   11   25:invokevirtual   #285 <Method void NalUnitTargetBuffer.reset()>
		prefixSei.reset();
	//   12   28:aload_0         
	//   13   29:getfield        #69  <Field NalUnitTargetBuffer prefixSei>
	//   14   32:invokevirtual   #285 <Method void NalUnitTargetBuffer.reset()>
		suffixSei.reset();
	//   15   35:aload_0         
	//   16   36:getfield        #71  <Field NalUnitTargetBuffer suffixSei>
	//   17   39:invokevirtual   #285 <Method void NalUnitTargetBuffer.reset()>
		sampleReader.reset();
	//   18   42:aload_0         
	//   19   43:getfield        #74  <Field H265Reader$SampleReader sampleReader>
	//   20   46:invokevirtual   #286 <Method void H265Reader$SampleReader.reset()>
		totalBytesWritten = 0L;
	//   21   49:aload_0         
	//   22   50:lconst_0        
	//   23   51:putfield        #257 <Field long totalBytesWritten>
	//   24   54:return          
	}

	private static final int BLA_W_LP = 16;
	private static final int CRA_NUT = 21;
	private static final int PPS_NUT = 34;
	private static final int PREFIX_SEI_NUT = 39;
	private static final int RASL_R = 9;
	private static final int SPS_NUT = 33;
	private static final int SUFFIX_SEI_NUT = 40;
	private static final String TAG = "H265Reader";
	private static final int VPS_NUT = 32;
	private boolean hasOutputFormat;
	private long pesTimeUs;
	private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
	private final boolean prefixFlags[] = new boolean[3];
	private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
	private final SampleReader sampleReader;
	private final SeiReader seiReader;
	private final ParsableByteArray seiWrapper = new ParsableByteArray();
	private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
	private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
	private long totalBytesWritten;
	private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
}
