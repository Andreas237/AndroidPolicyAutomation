// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			H265Reader

private static final class H265Reader$SampleReader
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

	public H265Reader$SampleReader(TrackOutput trackoutput)
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
