// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.*;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader, NalUnitTargetBuffer, SeiReader

public final class H265Reader
	implements ElementaryStreamReader
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
		//*   2    4:ifeq            67
			{
				int k = (i + 2) - nalUnitBytesRead;
		//    3    7:iload_2         
		//    4    8:iconst_2        
		//    5    9:iadd            
		//    6   10:aload_0         
		//    7   11:getfield        #75  <Field int nalUnitBytesRead>
		//    8   14:isub            
		//    9   15:istore          4
				if(k < j)
		//*  10   17:iload           4
		//*  11   19:iload_3         
		//*  12   20:icmpge          55
				{
					boolean flag;
					if((abyte0[k] & 0x80) != 0)
		//*  13   23:aload_1         
		//*  14   24:iload           4
		//*  15   26:baload          
		//*  16   27:sipush          128
		//*  17   30:iand            
		//*  18   31:ifeq            40
						flag = true;
		//   19   34:iconst_1        
		//   20   35:istore          5
					else
		//*  21   37:goto            43
						flag = false;
		//   22   40:iconst_0        
		//   23   41:istore          5
					isFirstSlice = flag;
		//   24   43:aload_0         
		//   25   44:iload           5
		//   26   46:putfield        #51  <Field boolean isFirstSlice>
					lookingForFirstSliceFlag = false;
		//   27   49:aload_0         
		//   28   50:iconst_0        
		//   29   51:putfield        #73  <Field boolean lookingForFirstSliceFlag>
					return;
		//   30   54:return          
				}
				nalUnitBytesRead = nalUnitBytesRead + (j - i);
		//   31   55:aload_0         
		//   32   56:aload_0         
		//   33   57:getfield        #75  <Field int nalUnitBytesRead>
		//   34   60:iload_3         
		//   35   61:iload_2         
		//   36   62:isub            
		//   37   63:iadd            
		//   38   64:putfield        #75  <Field int nalUnitBytesRead>
			}
		//   39   67:return          
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


	public H265Reader(SeiReader seireader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		seiReader = seireader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field SeiReader seiReader>
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:newarray        boolean[]
	//    8   13:putfield        #61  <Field boolean[] prefixFlags>
	//    9   16:aload_0         
	//   10   17:new             #63  <Class NalUnitTargetBuffer>
	//   11   20:dup             
	//   12   21:bipush          32
	//   13   23:sipush          128
	//   14   26:invokespecial   #66  <Method void NalUnitTargetBuffer(int, int)>
	//   15   29:putfield        #68  <Field NalUnitTargetBuffer vps>
	//   16   32:aload_0         
	//   17   33:new             #63  <Class NalUnitTargetBuffer>
	//   18   36:dup             
	//   19   37:bipush          33
	//   20   39:sipush          128
	//   21   42:invokespecial   #66  <Method void NalUnitTargetBuffer(int, int)>
	//   22   45:putfield        #70  <Field NalUnitTargetBuffer sps>
	//   23   48:aload_0         
	//   24   49:new             #63  <Class NalUnitTargetBuffer>
	//   25   52:dup             
	//   26   53:bipush          34
	//   27   55:sipush          128
	//   28   58:invokespecial   #66  <Method void NalUnitTargetBuffer(int, int)>
	//   29   61:putfield        #72  <Field NalUnitTargetBuffer pps>
	//   30   64:aload_0         
	//   31   65:new             #63  <Class NalUnitTargetBuffer>
	//   32   68:dup             
	//   33   69:bipush          39
	//   34   71:sipush          128
	//   35   74:invokespecial   #66  <Method void NalUnitTargetBuffer(int, int)>
	//   36   77:putfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//   37   80:aload_0         
	//   38   81:new             #63  <Class NalUnitTargetBuffer>
	//   39   84:dup             
	//   40   85:bipush          40
	//   41   87:sipush          128
	//   42   90:invokespecial   #66  <Method void NalUnitTargetBuffer(int, int)>
	//   43   93:putfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//   44   96:aload_0         
	//   45   97:new             #78  <Class ParsableByteArray>
	//   46  100:dup             
	//   47  101:invokespecial   #79  <Method void ParsableByteArray()>
	//   48  104:putfield        #81  <Field ParsableByteArray seiWrapper>
	//   49  107:return          
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
	//    4    8:getfield        #88  <Field H265Reader$SampleReader sampleReader>
	//    5   11:lload_1         
	//    6   12:iload_3         
	//    7   13:invokevirtual   #91  <Method void H265Reader$SampleReader.endNalUnit(long, int)>
		} else
	//*   8   16:goto            112
		{
			vps.endNalUnit(j);
	//    9   19:aload_0         
	//   10   20:getfield        #68  <Field NalUnitTargetBuffer vps>
	//   11   23:iload           4
	//   12   25:invokevirtual   #94  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   13   28:pop             
			sps.endNalUnit(j);
	//   14   29:aload_0         
	//   15   30:getfield        #70  <Field NalUnitTargetBuffer sps>
	//   16   33:iload           4
	//   17   35:invokevirtual   #94  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   18   38:pop             
			pps.endNalUnit(j);
	//   19   39:aload_0         
	//   20   40:getfield        #72  <Field NalUnitTargetBuffer pps>
	//   21   43:iload           4
	//   22   45:invokevirtual   #94  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   23   48:pop             
			if(vps.isCompleted() && sps.isCompleted() && pps.isCompleted())
	//*  24   49:aload_0         
	//*  25   50:getfield        #68  <Field NalUnitTargetBuffer vps>
	//*  26   53:invokevirtual   #98  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  27   56:ifeq            112
	//*  28   59:aload_0         
	//*  29   60:getfield        #70  <Field NalUnitTargetBuffer sps>
	//*  30   63:invokevirtual   #98  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  31   66:ifeq            112
	//*  32   69:aload_0         
	//*  33   70:getfield        #72  <Field NalUnitTargetBuffer pps>
	//*  34   73:invokevirtual   #98  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  35   76:ifeq            112
			{
				output.format(parseMediaFormat(formatId, vps, sps, pps));
	//   36   79:aload_0         
	//   37   80:getfield        #100 <Field TrackOutput output>
	//   38   83:aload_0         
	//   39   84:getfield        #102 <Field String formatId>
	//   40   87:aload_0         
	//   41   88:getfield        #68  <Field NalUnitTargetBuffer vps>
	//   42   91:aload_0         
	//   43   92:getfield        #70  <Field NalUnitTargetBuffer sps>
	//   44   95:aload_0         
	//   45   96:getfield        #72  <Field NalUnitTargetBuffer pps>
	//   46   99:invokestatic    #106 <Method Format parseMediaFormat(String, NalUnitTargetBuffer, NalUnitTargetBuffer, NalUnitTargetBuffer)>
	//   47  102:invokeinterface #112 <Method void TrackOutput.format(Format)>
				hasOutputFormat = true;
	//   48  107:aload_0         
	//   49  108:iconst_1        
	//   50  109:putfield        #86  <Field boolean hasOutputFormat>
			}
		}
		if(prefixSei.endNalUnit(j))
	//*  51  112:aload_0         
	//*  52  113:getfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//*  53  116:iload           4
	//*  54  118:invokevirtual   #94  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//*  55  121:ifeq            178
		{
			i = NalUnitUtil.unescapeStream(prefixSei.nalData, prefixSei.nalLength);
	//   56  124:aload_0         
	//   57  125:getfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//   58  128:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   59  131:aload_0         
	//   60  132:getfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//   61  135:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   62  138:invokestatic    #125 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//   63  141:istore_3        
			seiWrapper.reset(prefixSei.nalData, i);
	//   64  142:aload_0         
	//   65  143:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   66  146:aload_0         
	//   67  147:getfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//   68  150:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   69  153:iload_3         
	//   70  154:invokevirtual   #129 <Method void ParsableByteArray.reset(byte[], int)>
			seiWrapper.skipBytes(5);
	//   71  157:aload_0         
	//   72  158:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   73  161:iconst_5        
	//   74  162:invokevirtual   #133 <Method void ParsableByteArray.skipBytes(int)>
			seiReader.consume(l1, seiWrapper);
	//   75  165:aload_0         
	//   76  166:getfield        #59  <Field SeiReader seiReader>
	//   77  169:lload           5
	//   78  171:aload_0         
	//   79  172:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   80  175:invokevirtual   #139 <Method void SeiReader.consume(long, ParsableByteArray)>
		}
		if(suffixSei.endNalUnit(j))
	//*  81  178:aload_0         
	//*  82  179:getfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//*  83  182:iload           4
	//*  84  184:invokevirtual   #94  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//*  85  187:ifeq            244
		{
			i = NalUnitUtil.unescapeStream(suffixSei.nalData, suffixSei.nalLength);
	//   86  190:aload_0         
	//   87  191:getfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//   88  194:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   89  197:aload_0         
	//   90  198:getfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//   91  201:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   92  204:invokestatic    #125 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//   93  207:istore_3        
			seiWrapper.reset(suffixSei.nalData, i);
	//   94  208:aload_0         
	//   95  209:getfield        #81  <Field ParsableByteArray seiWrapper>
	//   96  212:aload_0         
	//   97  213:getfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//   98  216:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   99  219:iload_3         
	//  100  220:invokevirtual   #129 <Method void ParsableByteArray.reset(byte[], int)>
			seiWrapper.skipBytes(5);
	//  101  223:aload_0         
	//  102  224:getfield        #81  <Field ParsableByteArray seiWrapper>
	//  103  227:iconst_5        
	//  104  228:invokevirtual   #133 <Method void ParsableByteArray.skipBytes(int)>
			seiReader.consume(l1, seiWrapper);
	//  105  231:aload_0         
	//  106  232:getfield        #59  <Field SeiReader seiReader>
	//  107  235:lload           5
	//  108  237:aload_0         
	//  109  238:getfield        #81  <Field ParsableByteArray seiWrapper>
	//  110  241:invokevirtual   #139 <Method void SeiReader.consume(long, ParsableByteArray)>
		}
	//  111  244:return          
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
	//    4    8:getfield        #88  <Field H265Reader$SampleReader sampleReader>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #144 <Method void H265Reader$SampleReader.readNalUnitData(byte[], int, int)>
		} else
	//*   9   17:goto            50
		{
			vps.appendToNalUnit(abyte0, i, j);
	//   10   20:aload_0         
	//   11   21:getfield        #68  <Field NalUnitTargetBuffer vps>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:iload_3         
	//   15   27:invokevirtual   #147 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
			sps.appendToNalUnit(abyte0, i, j);
	//   16   30:aload_0         
	//   17   31:getfield        #70  <Field NalUnitTargetBuffer sps>
	//   18   34:aload_1         
	//   19   35:iload_2         
	//   20   36:iload_3         
	//   21   37:invokevirtual   #147 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
			pps.appendToNalUnit(abyte0, i, j);
	//   22   40:aload_0         
	//   23   41:getfield        #72  <Field NalUnitTargetBuffer pps>
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:iload_3         
	//   27   47:invokevirtual   #147 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		}
		prefixSei.appendToNalUnit(abyte0, i, j);
	//   28   50:aload_0         
	//   29   51:getfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//   30   54:aload_1         
	//   31   55:iload_2         
	//   32   56:iload_3         
	//   33   57:invokevirtual   #147 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		suffixSei.appendToNalUnit(abyte0, i, j);
	//   34   60:aload_0         
	//   35   61:getfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//   36   64:aload_1         
	//   37   65:iload_2         
	//   38   66:iload_3         
	//   39   67:invokevirtual   #147 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
	//   40   70:return          
	}

	private static Format parseMediaFormat(String s, NalUnitTargetBuffer nalunittargetbuffer, NalUnitTargetBuffer nalunittargetbuffer1, NalUnitTargetBuffer nalunittargetbuffer2)
	{
		byte abyte0[] = new byte[nalunittargetbuffer.nalLength + nalunittargetbuffer1.nalLength + nalunittargetbuffer2.nalLength];
	//    0    0:aload_1         
	//    1    1:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//    2    4:aload_2         
	//    3    5:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//    4    8:iadd            
	//    5    9:aload_3         
	//    6   10:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//    7   13:iadd            
	//    8   14:newarray        byte[]
	//    9   16:astore          17
		byte abyte1[] = nalunittargetbuffer.nalData;
	//   10   18:aload_1         
	//   11   19:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   12   22:astore          18
		int i = nalunittargetbuffer.nalLength;
	//   13   24:aload_1         
	//   14   25:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   15   28:istore          6
		boolean flag = false;
	//   16   30:iconst_0        
	//   17   31:istore          9
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), 0, i);
	//   18   33:aload           18
	//   19   35:iconst_0        
	//   20   36:aload           17
	//   21   38:iconst_0        
	//   22   39:iload           6
	//   23   41:invokestatic    #153 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (nalunittargetbuffer1.nalData)), 0, ((Object) (abyte0)), nalunittargetbuffer.nalLength, nalunittargetbuffer1.nalLength);
	//   24   44:aload_2         
	//   25   45:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   26   48:iconst_0        
	//   27   49:aload           17
	//   28   51:aload_1         
	//   29   52:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   30   55:aload_2         
	//   31   56:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   32   59:invokestatic    #153 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (nalunittargetbuffer2.nalData)), 0, ((Object) (abyte0)), nalunittargetbuffer.nalLength + nalunittargetbuffer1.nalLength, nalunittargetbuffer2.nalLength);
	//   33   62:aload_3         
	//   34   63:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   35   66:iconst_0        
	//   36   67:aload           17
	//   37   69:aload_1         
	//   38   70:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   39   73:aload_2         
	//   40   74:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   41   77:iadd            
	//   42   78:aload_3         
	//   43   79:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   44   82:invokestatic    #153 <Method void System.arraycopy(Object, int, Object, int, int)>
		nalunittargetbuffer = ((NalUnitTargetBuffer) (new ParsableNalUnitBitArray(nalunittargetbuffer1.nalData, 0, nalunittargetbuffer1.nalLength)));
	//   45   85:new             #155 <Class ParsableNalUnitBitArray>
	//   46   88:dup             
	//   47   89:aload_2         
	//   48   90:getfield        #116 <Field byte[] NalUnitTargetBuffer.nalData>
	//   49   93:iconst_0        
	//   50   94:aload_2         
	//   51   95:getfield        #119 <Field int NalUnitTargetBuffer.nalLength>
	//   52   98:invokespecial   #157 <Method void ParsableNalUnitBitArray(byte[], int, int)>
	//   53  101:astore_1        
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(44);
	//   54  102:aload_1         
	//   55  103:bipush          44
	//   56  105:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
		int l1 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBits(3);
	//   57  108:aload_1         
	//   58  109:iconst_3        
	//   59  110:invokevirtual   #164 <Method int ParsableNalUnitBitArray.readBits(int)>
	//   60  113:istore          10
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBit();
	//   61  115:aload_1         
	//   62  116:invokevirtual   #167 <Method void ParsableNalUnitBitArray.skipBit()>
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(88);
	//   63  119:aload_1         
	//   64  120:bipush          88
	//   65  122:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(8);
	//   66  125:aload_1         
	//   67  126:bipush          8
	//   68  128:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
		int j1 = 0;
	//   69  131:iconst_0        
	//   70  132:istore          8
		i = j1;
	//   71  134:iload           8
	//   72  136:istore          6
		for(; j1 < l1; j1++)
	//*  73  138:iload           8
	//*  74  140:iload           10
	//*  75  142:icmpge          190
		{
			int l = i;
	//   76  145:iload           6
	//   77  147:istore          7
			if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//*  78  149:aload_1         
	//*  79  150:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//*  80  153:ifeq            163
				l = i + 89;
	//   81  156:iload           6
	//   82  158:bipush          89
	//   83  160:iadd            
	//   84  161:istore          7
			i = l;
	//   85  163:iload           7
	//   86  165:istore          6
			if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//*  87  167:aload_1         
	//*  88  168:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//*  89  171:ifeq            181
				i = l + 8;
	//   90  174:iload           7
	//   91  176:bipush          8
	//   92  178:iadd            
	//   93  179:istore          6
		}

	//   94  181:iload           8
	//   95  183:iconst_1        
	//   96  184:iadd            
	//   97  185:istore          8
	//*  98  187:goto            138
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(i);
	//   99  190:aload_1         
	//  100  191:iload           6
	//  101  193:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
		if(l1 > 0)
	//* 102  196:iload           10
	//* 103  198:ifle            212
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits((8 - l1) * 2);
	//  104  201:aload_1         
	//  105  202:bipush          8
	//  106  204:iload           10
	//  107  206:isub            
	//  108  207:iconst_2        
	//  109  208:imul            
	//  110  209:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  111  212:aload_1         
	//  112  213:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  113  216:pop             
		int j3 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  114  217:aload_1         
	//  115  218:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  116  221:istore          16
		if(j3 == 3)
	//* 117  223:iload           16
	//* 118  225:iconst_3        
	//* 119  226:icmpne          233
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBit();
	//  120  229:aload_1         
	//  121  230:invokevirtual   #167 <Method void ParsableNalUnitBitArray.skipBit()>
		int j2 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  122  233:aload_1         
	//  123  234:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  124  237:istore          12
		int i2 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  125  239:aload_1         
	//  126  240:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  127  243:istore          11
		j1 = j2;
	//  128  245:iload           12
	//  129  247:istore          8
		int i1 = i2;
	//  130  249:iload           11
	//  131  251:istore          7
		if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//* 132  253:aload_1         
	//* 133  254:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 134  257:ifeq            349
		{
			j1 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  135  260:aload_1         
	//  136  261:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  137  264:istore          8
			int i3 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  138  266:aload_1         
	//  139  267:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  140  270:istore          15
			int k2 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  141  272:aload_1         
	//  142  273:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  143  276:istore          13
			int l2 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  144  278:aload_1         
	//  145  279:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  146  282:istore          14
			if(j3 != 1 && j3 != 2)
	//* 147  284:iload           16
	//* 148  286:iconst_1        
	//* 149  287:icmpeq          305
	//* 150  290:iload           16
	//* 151  292:iconst_2        
	//* 152  293:icmpne          299
	//* 153  296:goto            305
				i = 1;
	//  154  299:iconst_1        
	//  155  300:istore          6
			else
	//* 156  302:goto            308
				i = 2;
	//  157  305:iconst_2        
	//  158  306:istore          6
			if(j3 == 1)
	//* 159  308:iload           16
	//* 160  310:iconst_1        
	//* 161  311:icmpne          320
				i1 = 2;
	//  162  314:iconst_2        
	//  163  315:istore          7
			else
	//* 164  317:goto            323
				i1 = 1;
	//  165  320:iconst_1        
	//  166  321:istore          7
			j1 = j2 - i * (j1 + i3);
	//  167  323:iload           12
	//  168  325:iload           6
	//  169  327:iload           8
	//  170  329:iload           15
	//  171  331:iadd            
	//  172  332:imul            
	//  173  333:isub            
	//  174  334:istore          8
			i1 = i2 - i1 * (k2 + l2);
	//  175  336:iload           11
	//  176  338:iload           7
	//  177  340:iload           13
	//  178  342:iload           14
	//  179  344:iadd            
	//  180  345:imul            
	//  181  346:isub            
	//  182  347:istore          7
		}
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  183  349:aload_1         
	//  184  350:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  185  353:pop             
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  186  354:aload_1         
	//  187  355:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  188  358:pop             
		i2 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  189  359:aload_1         
	//  190  360:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  191  363:istore          11
		if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//* 192  365:aload_1         
	//* 193  366:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 194  369:ifeq            378
			i = 0;
	//  195  372:iconst_0        
	//  196  373:istore          6
		else
	//* 197  375:goto            382
			i = l1;
	//  198  378:iload           10
	//  199  380:istore          6
		for(; i <= l1; i++)
	//* 200  382:iload           6
	//* 201  384:iload           10
	//* 202  386:icmpgt          413
		{
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  203  389:aload_1         
	//  204  390:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  205  393:pop             
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  206  394:aload_1         
	//  207  395:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  208  398:pop             
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  209  399:aload_1         
	//  210  400:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  211  403:pop             
		}

	//  212  404:iload           6
	//  213  406:iconst_1        
	//  214  407:iadd            
	//  215  408:istore          6
	//* 216  410:goto            382
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  217  413:aload_1         
	//  218  414:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  219  417:pop             
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  220  418:aload_1         
	//  221  419:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  222  422:pop             
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  223  423:aload_1         
	//  224  424:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  225  427:pop             
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  226  428:aload_1         
	//  227  429:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  228  432:pop             
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  229  433:aload_1         
	//  230  434:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  231  437:pop             
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  232  438:aload_1         
	//  233  439:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  234  442:pop             
		if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit() && ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//* 235  443:aload_1         
	//* 236  444:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 237  447:ifeq            461
	//* 238  450:aload_1         
	//* 239  451:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 240  454:ifeq            461
			skipScalingList(((ParsableNalUnitBitArray) (nalunittargetbuffer)));
	//  241  457:aload_1         
	//  242  458:invokestatic    #178 <Method void skipScalingList(ParsableNalUnitBitArray)>
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(2);
	//  243  461:aload_1         
	//  244  462:iconst_2        
	//  245  463:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
		if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//* 246  466:aload_1         
	//* 247  467:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 248  470:ifeq            493
		{
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(8);
	//  249  473:aload_1         
	//  250  474:bipush          8
	//  251  476:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  252  479:aload_1         
	//  253  480:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  254  483:pop             
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt();
	//  255  484:aload_1         
	//  256  485:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//  257  488:pop             
			((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBit();
	//  258  489:aload_1         
	//  259  490:invokevirtual   #167 <Method void ParsableNalUnitBitArray.skipBit()>
		}
		skipShortTermRefPicSets(((ParsableNalUnitBitArray) (nalunittargetbuffer)));
	//  260  493:aload_1         
	//  261  494:invokestatic    #181 <Method void skipShortTermRefPicSets(ParsableNalUnitBitArray)>
		if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//* 262  497:aload_1         
	//* 263  498:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 264  501:ifeq            536
		{
			for(int j = ((int) (flag)); j < ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readUnsignedExpGolombCodedInt(); j++)
	//* 265  504:iload           9
	//* 266  506:istore          6
	//* 267  508:iload           6
	//* 268  510:aload_1         
	//* 269  511:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
	//* 270  514:icmpge          536
				((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(i2 + 4 + 1);
	//  271  517:aload_1         
	//  272  518:iload           11
	//  273  520:iconst_4        
	//  274  521:iadd            
	//  275  522:iconst_1        
	//  276  523:iadd            
	//  277  524:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>

	//  278  527:iload           6
	//  279  529:iconst_1        
	//  280  530:iadd            
	//  281  531:istore          6
		}
	//* 282  533:goto            508
		((ParsableNalUnitBitArray) (nalunittargetbuffer)).skipBits(2);
	//  283  536:aload_1         
	//  284  537:iconst_2        
	//  285  538:invokevirtual   #160 <Method void ParsableNalUnitBitArray.skipBits(int)>
		float f1 = 1.0F;
	//  286  541:fconst_1        
	//  287  542:fstore          5
		float f = f1;
	//  288  544:fload           5
	//  289  546:fstore          4
		if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//* 290  548:aload_1         
	//* 291  549:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 292  552:ifeq            684
		{
			f = f1;
	//  293  555:fload           5
	//  294  557:fstore          4
			if(((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBit())
	//* 295  559:aload_1         
	//* 296  560:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//* 297  563:ifeq            684
			{
				int k = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBits(8);
	//  298  566:aload_1         
	//  299  567:bipush          8
	//  300  569:invokevirtual   #164 <Method int ParsableNalUnitBitArray.readBits(int)>
	//  301  572:istore          6
				if(k == 255)
	//* 302  574:iload           6
	//* 303  576:sipush          255
	//* 304  579:icmpne          628
				{
					k = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBits(16);
	//  305  582:aload_1         
	//  306  583:bipush          16
	//  307  585:invokevirtual   #164 <Method int ParsableNalUnitBitArray.readBits(int)>
	//  308  588:istore          6
					int k1 = ((ParsableNalUnitBitArray) (nalunittargetbuffer)).readBits(16);
	//  309  590:aload_1         
	//  310  591:bipush          16
	//  311  593:invokevirtual   #164 <Method int ParsableNalUnitBitArray.readBits(int)>
	//  312  596:istore          9
					f = f1;
	//  313  598:fload           5
	//  314  600:fstore          4
					if(k != 0)
	//* 315  602:iload           6
	//* 316  604:ifeq            684
					{
						f = f1;
	//  317  607:fload           5
	//  318  609:fstore          4
						if(k1 != 0)
	//* 319  611:iload           9
	//* 320  613:ifeq            684
							f = (float)k / (float)k1;
	//  321  616:iload           6
	//  322  618:i2f             
	//  323  619:iload           9
	//  324  621:i2f             
	//  325  622:fdiv            
	//  326  623:fstore          4
					}
				} else
	//* 327  625:goto            684
				if(k < NalUnitUtil.ASPECT_RATIO_IDC_VALUES.length)
	//* 328  628:iload           6
	//* 329  630:getstatic       #185 <Field float[] NalUnitUtil.ASPECT_RATIO_IDC_VALUES>
	//* 330  633:arraylength     
	//* 331  634:icmpge          648
				{
					f = NalUnitUtil.ASPECT_RATIO_IDC_VALUES[k];
	//  332  637:getstatic       #185 <Field float[] NalUnitUtil.ASPECT_RATIO_IDC_VALUES>
	//  333  640:iload           6
	//  334  642:faload          
	//  335  643:fstore          4
				} else
	//* 336  645:goto            684
				{
					nalunittargetbuffer = ((NalUnitTargetBuffer) (new StringBuilder()));
	//  337  648:new             #187 <Class StringBuilder>
	//  338  651:dup             
	//  339  652:invokespecial   #188 <Method void StringBuilder()>
	//  340  655:astore_1        
					((StringBuilder) (nalunittargetbuffer)).append("Unexpected aspect_ratio_idc value: ");
	//  341  656:aload_1         
	//  342  657:ldc1            #190 <String "Unexpected aspect_ratio_idc value: ">
	//  343  659:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//  344  662:pop             
					((StringBuilder) (nalunittargetbuffer)).append(k);
	//  345  663:aload_1         
	//  346  664:iload           6
	//  347  666:invokevirtual   #197 <Method StringBuilder StringBuilder.append(int)>
	//  348  669:pop             
					Log.w("H265Reader", ((StringBuilder) (nalunittargetbuffer)).toString());
	//  349  670:ldc1            #28  <String "H265Reader">
	//  350  672:aload_1         
	//  351  673:invokevirtual   #201 <Method String StringBuilder.toString()>
	//  352  676:invokestatic    #207 <Method int Log.w(String, String)>
	//  353  679:pop             
					f = f1;
	//  354  680:fload           5
	//  355  682:fstore          4
				}
			}
		}
		return Format.createVideoSampleFormat(s, "video/hevc", ((String) (null)), -1, -1, j1, i1, -1F, Collections.singletonList(((Object) (abyte0))), -1, f, ((com.google.android.exoplayer2.drm.DrmInitData) (null)));
	//  356  684:aload_0         
	//  357  685:ldc1            #209 <String "video/hevc">
	//  358  687:aconst_null     
	//  359  688:iconst_m1       
	//  360  689:iconst_m1       
	//  361  690:iload           8
	//  362  692:iload           7
	//  363  694:ldc1            #210 <Float -1F>
	//  364  696:aload           17
	//  365  698:invokestatic    #216 <Method java.util.List Collections.singletonList(Object)>
	//  366  701:iconst_m1       
	//  367  702:fload           4
	//  368  704:aconst_null     
	//  369  705:invokestatic    #222 <Method Format Format.createVideoSampleFormat(String, String, String, int, int, int, int, float, java.util.List, int, float, com.google.android.exoplayer2.drm.DrmInitData)>
	//  370  708:areturn         
	}

	private static void skipScalingList(ParsableNalUnitBitArray parsablenalunitbitarray)
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
				if(!parsablenalunitbitarray.readBit())
	//*  10   15:aload_0         
	//*  11   16:invokevirtual   #170 <Method boolean ParsableNalUnitBitArray.readBit()>
	//*  12   19:ifne            30
				{
					parsablenalunitbitarray.readUnsignedExpGolombCodedInt();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #174 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
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
	//   25   39:invokestatic    #228 <Method int Math.min(int, int)>
	//   26   42:istore          4
					if(i > 1)
	//*  27   44:iload_1         
	//*  28   45:iconst_1        
	//*  29   46:icmple          54
						parsablenalunitbitarray.readSignedExpGolombCodedInt();
	//   30   49:aload_0         
	//   31   50:invokevirtual   #231 <Method int ParsableNalUnitBitArray.readSignedExpGolombCodedInt()>
	//   32   53:pop             
					for(int k = 0; k < l; k++)
	//*  33   54:iconst_0        
	//*  34   55:istore_3        
	//*  35   56:iload_3         
	//*  36   57:iload           4
	//*  37   59:icmpge          74
						parsablenalunitbitarray.readSignedExpGolombCodedInt();
	//   38   62:aload_0         
	//   39   63:invokevirtual   #231 <Method int ParsableNalUnitBitArray.readSignedExpGolombCodedInt()>
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

	private static void skipShortTermRefPicSets(ParsableNalUnitBitArray parsablenalunitbitarray)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #233 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #235 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #240 <Method void Runtime(String)>
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
	//    4    8:getfield        #88  <Field H265Reader$SampleReader sampleReader>
	//    5   11:lload_1         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:lload           5
	//    9   17:invokevirtual   #243 <Method void H265Reader$SampleReader.startNalUnit(long, int, int, long)>
		} else
	//*  10   20:goto            50
		{
			vps.startNalUnit(j);
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field NalUnitTargetBuffer vps>
	//   13   27:iload           4
	//   14   29:invokevirtual   #245 <Method void NalUnitTargetBuffer.startNalUnit(int)>
			sps.startNalUnit(j);
	//   15   32:aload_0         
	//   16   33:getfield        #70  <Field NalUnitTargetBuffer sps>
	//   17   36:iload           4
	//   18   38:invokevirtual   #245 <Method void NalUnitTargetBuffer.startNalUnit(int)>
			pps.startNalUnit(j);
	//   19   41:aload_0         
	//   20   42:getfield        #72  <Field NalUnitTargetBuffer pps>
	//   21   45:iload           4
	//   22   47:invokevirtual   #245 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		}
		prefixSei.startNalUnit(j);
	//   23   50:aload_0         
	//   24   51:getfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//   25   54:iload           4
	//   26   56:invokevirtual   #245 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		suffixSei.startNalUnit(j);
	//   27   59:aload_0         
	//   28   60:getfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//   29   63:iload           4
	//   30   65:invokevirtual   #245 <Method void NalUnitTargetBuffer.startNalUnit(int)>
	//   31   68:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		while(parsablebytearray.bytesLeft() > 0) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #249 <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:ifle            181
		{
			int i = parsablebytearray.getPosition();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #252 <Method int ParsableByteArray.getPosition()>
	//    5   11:istore_2        
			int j = parsablebytearray.limit();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #255 <Method int ParsableByteArray.limit()>
	//    8   16:istore_3        
			byte abyte0[] = parsablebytearray.data;
	//    9   17:aload_1         
	//   10   18:getfield        #258 <Field byte[] ParsableByteArray.data>
	//   11   21:astore          10
			totalBytesWritten = totalBytesWritten + (long)parsablebytearray.bytesLeft();
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #260 <Field long totalBytesWritten>
	//   15   28:aload_1         
	//   16   29:invokevirtual   #249 <Method int ParsableByteArray.bytesLeft()>
	//   17   32:i2l             
	//   18   33:ladd            
	//   19   34:putfield        #260 <Field long totalBytesWritten>
			output.sampleData(parsablebytearray, parsablebytearray.bytesLeft());
	//   20   37:aload_0         
	//   21   38:getfield        #100 <Field TrackOutput output>
	//   22   41:aload_1         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #249 <Method int ParsableByteArray.bytesLeft()>
	//   25   46:invokeinterface #264 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
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
	//   33   61:getfield        #61  <Field boolean[] prefixFlags>
	//   34   64:invokestatic    #268 <Method int NalUnitUtil.findNalUnit(byte[], int, int, boolean[])>
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
	//   43   80:invokespecial   #270 <Method void nalUnitData(byte[], int, int)>
					return;
	//   44   83:return          
				}
				int l = NalUnitUtil.getH265NalUnitType(abyte0, k);
	//   45   84:aload           10
	//   46   86:iload           4
	//   47   88:invokestatic    #273 <Method int NalUnitUtil.getH265NalUnitType(byte[], int)>
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
	//   59  110:invokespecial   #270 <Method void nalUnitData(byte[], int, int)>
				int i1 = j - k;
	//   60  113:iload_3         
	//   61  114:iload           4
	//   62  116:isub            
	//   63  117:istore          6
				long l1 = totalBytesWritten - (long)i1;
	//   64  119:aload_0         
	//   65  120:getfield        #260 <Field long totalBytesWritten>
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
	//*  75  138:goto            146
					i = 0;
	//   76  141:iconst_0        
	//   77  142:istore_2        
	//*  78  143:goto            138
				endNalUnit(l1, i1, i, pesTimeUs);
	//   79  146:aload_0         
	//   80  147:lload           8
	//   81  149:iload           6
	//   82  151:iload_2         
	//   83  152:aload_0         
	//   84  153:getfield        #275 <Field long pesTimeUs>
	//   85  156:invokespecial   #277 <Method void endNalUnit(long, int, int, long)>
				startNalUnit(l1, i1, l, pesTimeUs);
	//   86  159:aload_0         
	//   87  160:lload           8
	//   88  162:iload           6
	//   89  164:iload           5
	//   90  166:aload_0         
	//   91  167:getfield        #275 <Field long pesTimeUs>
	//   92  170:invokespecial   #278 <Method void startNalUnit(long, int, int, long)>
				i = k + 3;
	//   93  173:iload           4
	//   94  175:iconst_3        
	//   95  176:iadd            
	//   96  177:istore_2        
			}
		}
	//*  97  178:goto            51
	//   98  181:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #285 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		formatId = trackidgenerator.getFormatId();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #288 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//    5    9:putfield        #102 <Field String formatId>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 2);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #291 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   10   18:iconst_2        
	//   11   19:invokeinterface #297 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   12   24:putfield        #100 <Field TrackOutput output>
		sampleReader = new SampleReader(output);
	//   13   27:aload_0         
	//   14   28:new             #8   <Class H265Reader$SampleReader>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:getfield        #100 <Field TrackOutput output>
	//   18   36:invokespecial   #300 <Method void H265Reader$SampleReader(TrackOutput)>
	//   19   39:putfield        #88  <Field H265Reader$SampleReader sampleReader>
		seiReader.createTracks(extractoroutput, trackidgenerator);
	//   20   42:aload_0         
	//   21   43:getfield        #59  <Field SeiReader seiReader>
	//   22   46:aload_1         
	//   23   47:aload_2         
	//   24   48:invokevirtual   #302 <Method void SeiReader.createTracks(ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
	//   25   51:return          
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
	//    2    2:putfield        #275 <Field long pesTimeUs>
	//    3    5:return          
	}

	public void seek()
	{
		NalUnitUtil.clearPrefixFlags(prefixFlags);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean[] prefixFlags>
	//    2    4:invokestatic    #310 <Method void NalUnitUtil.clearPrefixFlags(boolean[])>
		vps.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field NalUnitTargetBuffer vps>
	//    5   11:invokevirtual   #312 <Method void NalUnitTargetBuffer.reset()>
		sps.reset();
	//    6   14:aload_0         
	//    7   15:getfield        #70  <Field NalUnitTargetBuffer sps>
	//    8   18:invokevirtual   #312 <Method void NalUnitTargetBuffer.reset()>
		pps.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #72  <Field NalUnitTargetBuffer pps>
	//   11   25:invokevirtual   #312 <Method void NalUnitTargetBuffer.reset()>
		prefixSei.reset();
	//   12   28:aload_0         
	//   13   29:getfield        #74  <Field NalUnitTargetBuffer prefixSei>
	//   14   32:invokevirtual   #312 <Method void NalUnitTargetBuffer.reset()>
		suffixSei.reset();
	//   15   35:aload_0         
	//   16   36:getfield        #76  <Field NalUnitTargetBuffer suffixSei>
	//   17   39:invokevirtual   #312 <Method void NalUnitTargetBuffer.reset()>
		sampleReader.reset();
	//   18   42:aload_0         
	//   19   43:getfield        #88  <Field H265Reader$SampleReader sampleReader>
	//   20   46:invokevirtual   #313 <Method void H265Reader$SampleReader.reset()>
		totalBytesWritten = 0L;
	//   21   49:aload_0         
	//   22   50:lconst_0        
	//   23   51:putfield        #260 <Field long totalBytesWritten>
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
	private String formatId;
	private boolean hasOutputFormat;
	private TrackOutput output;
	private long pesTimeUs;
	private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
	private final boolean prefixFlags[] = new boolean[3];
	private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
	private SampleReader sampleReader;
	private final SeiReader seiReader;
	private final ParsableByteArray seiWrapper = new ParsableByteArray();
	private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
	private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
	private long totalBytesWritten;
	private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
}
