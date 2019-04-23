// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.ParsableBitArray;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			H264Reader

private static final class H264Reader$SampleReader
{
	private static final class SliceHeaderData
	{

		private boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceheaderdata)
		{
			boolean flag;
label0:
			{
				flag = isComplete;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field boolean isComplete>
		//    2    4:istore          4
				boolean flag1 = true;
		//    3    6:iconst_1        
		//    4    7:istore          5
				if(flag)
		//*   5    9:iload           4
		//*   6   11:ifeq            278
				{
					flag = flag1;
		//    7   14:iload           5
		//    8   16:istore          4
					if(!sliceheaderdata.isComplete)
						break label0;
		//    9   18:aload_1         
		//   10   19:getfield        #48  <Field boolean isComplete>
		//   11   22:ifeq            281
					flag = flag1;
		//   12   25:iload           5
		//   13   27:istore          4
					if(frameNum != sliceheaderdata.frameNum)
						break label0;
		//   14   29:aload_0         
		//   15   30:getfield        #50  <Field int frameNum>
		//   16   33:aload_1         
		//   17   34:getfield        #50  <Field int frameNum>
		//   18   37:icmpne          281
					flag = flag1;
		//   19   40:iload           5
		//   20   42:istore          4
					if(picParameterSetId != sliceheaderdata.picParameterSetId)
						break label0;
		//   21   44:aload_0         
		//   22   45:getfield        #52  <Field int picParameterSetId>
		//   23   48:aload_1         
		//   24   49:getfield        #52  <Field int picParameterSetId>
		//   25   52:icmpne          281
					flag = flag1;
		//   26   55:iload           5
		//   27   57:istore          4
					if(fieldPicFlag != sliceheaderdata.fieldPicFlag)
						break label0;
		//   28   59:aload_0         
		//   29   60:getfield        #54  <Field boolean fieldPicFlag>
		//   30   63:aload_1         
		//   31   64:getfield        #54  <Field boolean fieldPicFlag>
		//   32   67:icmpne          281
					if(bottomFieldFlagPresent && sliceheaderdata.bottomFieldFlagPresent)
		//*  33   70:aload_0         
		//*  34   71:getfield        #56  <Field boolean bottomFieldFlagPresent>
		//*  35   74:ifeq            99
		//*  36   77:aload_1         
		//*  37   78:getfield        #56  <Field boolean bottomFieldFlagPresent>
		//*  38   81:ifeq            99
					{
						flag = flag1;
		//   39   84:iload           5
		//   40   86:istore          4
						if(bottomFieldFlag != sliceheaderdata.bottomFieldFlag)
							break label0;
		//   41   88:aload_0         
		//   42   89:getfield        #58  <Field boolean bottomFieldFlag>
		//   43   92:aload_1         
		//   44   93:getfield        #58  <Field boolean bottomFieldFlag>
		//   45   96:icmpne          281
					}
					int i = nalRefIdc;
		//   46   99:aload_0         
		//   47  100:getfield        #60  <Field int nalRefIdc>
		//   48  103:istore_2        
					int j = sliceheaderdata.nalRefIdc;
		//   49  104:aload_1         
		//   50  105:getfield        #60  <Field int nalRefIdc>
		//   51  108:istore_3        
					if(i != j)
		//*  52  109:iload_2         
		//*  53  110:iload_3         
		//*  54  111:icmpeq          130
					{
						flag = flag1;
		//   55  114:iload           5
		//   56  116:istore          4
						if(i == 0)
							break label0;
		//   57  118:iload_2         
		//   58  119:ifeq            281
						flag = flag1;
		//   59  122:iload           5
		//   60  124:istore          4
						if(j == 0)
							break label0;
		//   61  126:iload_3         
		//   62  127:ifeq            281
					}
					if(spsData.picOrderCountType == 0 && sliceheaderdata.spsData.picOrderCountType == 0)
		//*  63  130:aload_0         
		//*  64  131:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  65  134:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  66  137:ifne            180
		//*  67  140:aload_1         
		//*  68  141:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  69  144:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  70  147:ifne            180
					{
						flag = flag1;
		//   71  150:iload           5
		//   72  152:istore          4
						if(picOrderCntLsb != sliceheaderdata.picOrderCntLsb)
							break label0;
		//   73  154:aload_0         
		//   74  155:getfield        #69  <Field int picOrderCntLsb>
		//   75  158:aload_1         
		//   76  159:getfield        #69  <Field int picOrderCntLsb>
		//   77  162:icmpne          281
						flag = flag1;
		//   78  165:iload           5
		//   79  167:istore          4
						if(deltaPicOrderCntBottom != sliceheaderdata.deltaPicOrderCntBottom)
							break label0;
		//   80  169:aload_0         
		//   81  170:getfield        #71  <Field int deltaPicOrderCntBottom>
		//   82  173:aload_1         
		//   83  174:getfield        #71  <Field int deltaPicOrderCntBottom>
		//   84  177:icmpne          281
					}
					if(spsData.picOrderCountType == 1 && sliceheaderdata.spsData.picOrderCountType == 1)
		//*  85  180:aload_0         
		//*  86  181:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  87  184:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  88  187:iconst_1        
		//*  89  188:icmpne          232
		//*  90  191:aload_1         
		//*  91  192:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  92  195:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  93  198:iconst_1        
		//*  94  199:icmpne          232
					{
						flag = flag1;
		//   95  202:iload           5
		//   96  204:istore          4
						if(deltaPicOrderCnt0 != sliceheaderdata.deltaPicOrderCnt0)
							break label0;
		//   97  206:aload_0         
		//   98  207:getfield        #73  <Field int deltaPicOrderCnt0>
		//   99  210:aload_1         
		//  100  211:getfield        #73  <Field int deltaPicOrderCnt0>
		//  101  214:icmpne          281
						flag = flag1;
		//  102  217:iload           5
		//  103  219:istore          4
						if(deltaPicOrderCnt1 != sliceheaderdata.deltaPicOrderCnt1)
							break label0;
		//  104  221:aload_0         
		//  105  222:getfield        #75  <Field int deltaPicOrderCnt1>
		//  106  225:aload_1         
		//  107  226:getfield        #75  <Field int deltaPicOrderCnt1>
		//  108  229:icmpne          281
					}
					boolean flag2 = idrPicFlag;
		//  109  232:aload_0         
		//  110  233:getfield        #77  <Field boolean idrPicFlag>
		//  111  236:istore          6
					boolean flag3 = sliceheaderdata.idrPicFlag;
		//  112  238:aload_1         
		//  113  239:getfield        #77  <Field boolean idrPicFlag>
		//  114  242:istore          7
					flag = flag1;
		//  115  244:iload           5
		//  116  246:istore          4
					if(flag2 != flag3)
						break label0;
		//  117  248:iload           6
		//  118  250:iload           7
		//  119  252:icmpne          281
					if(flag2 && flag3 && idrPicId != sliceheaderdata.idrPicId)
		//* 120  255:iload           6
		//* 121  257:ifeq            278
		//* 122  260:iload           7
		//* 123  262:ifeq            278
		//* 124  265:aload_0         
		//* 125  266:getfield        #79  <Field int idrPicId>
		//* 126  269:aload_1         
		//* 127  270:getfield        #79  <Field int idrPicId>
		//* 128  273:icmpeq          278
						return true;
		//  129  276:iconst_1        
		//  130  277:ireturn         
				}
				flag = false;
		//  131  278:iconst_0        
		//  132  279:istore          4
			}
			return flag;
		//  133  281:iload           4
		//  134  283:ireturn         
		}

		public void clear()
		{
			hasSliceType = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #82  <Field boolean hasSliceType>
			isComplete = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #48  <Field boolean isComplete>
		//    6   10:return          
		}

		public boolean isISlice()
		{
			if(hasSliceType)
		//*   0    0:aload_0         
		//*   1    1:getfield        #82  <Field boolean hasSliceType>
		//*   2    4:ifeq            25
			{
				int i = sliceType;
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field int sliceType>
		//    5   11:istore_1        
				if(i == 7 || i == 2)
		//*   6   12:iload_1         
		//*   7   13:bipush          7
		//*   8   15:icmpeq          23
		//*   9   18:iload_1         
		//*  10   19:iconst_2        
		//*  11   20:icmpne          25
					return true;
		//   12   23:iconst_1        
		//   13   24:ireturn         
			}
			return false;
		//   14   25:iconst_0        
		//   15   26:ireturn         
		}

		public void setAll(com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata, int i, int j, int k, int l, boolean flag, boolean flag1, 
				boolean flag2, boolean flag3, int i1, int j1, int k1, int l1, int i2)
		{
			spsData = spsdata;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
			nalRefIdc = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #60  <Field int nalRefIdc>
			sliceType = j;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #86  <Field int sliceType>
			frameNum = k;
		//    9   15:aload_0         
		//   10   16:iload           4
		//   11   18:putfield        #50  <Field int frameNum>
			picParameterSetId = l;
		//   12   21:aload_0         
		//   13   22:iload           5
		//   14   24:putfield        #52  <Field int picParameterSetId>
			fieldPicFlag = flag;
		//   15   27:aload_0         
		//   16   28:iload           6
		//   17   30:putfield        #54  <Field boolean fieldPicFlag>
			bottomFieldFlagPresent = flag1;
		//   18   33:aload_0         
		//   19   34:iload           7
		//   20   36:putfield        #56  <Field boolean bottomFieldFlagPresent>
			bottomFieldFlag = flag2;
		//   21   39:aload_0         
		//   22   40:iload           8
		//   23   42:putfield        #58  <Field boolean bottomFieldFlag>
			idrPicFlag = flag3;
		//   24   45:aload_0         
		//   25   46:iload           9
		//   26   48:putfield        #77  <Field boolean idrPicFlag>
			idrPicId = i1;
		//   27   51:aload_0         
		//   28   52:iload           10
		//   29   54:putfield        #79  <Field int idrPicId>
			picOrderCntLsb = j1;
		//   30   57:aload_0         
		//   31   58:iload           11
		//   32   60:putfield        #69  <Field int picOrderCntLsb>
			deltaPicOrderCntBottom = k1;
		//   33   63:aload_0         
		//   34   64:iload           12
		//   35   66:putfield        #71  <Field int deltaPicOrderCntBottom>
			deltaPicOrderCnt0 = l1;
		//   36   69:aload_0         
		//   37   70:iload           13
		//   38   72:putfield        #73  <Field int deltaPicOrderCnt0>
			deltaPicOrderCnt1 = i2;
		//   39   75:aload_0         
		//   40   76:iload           14
		//   41   78:putfield        #75  <Field int deltaPicOrderCnt1>
			isComplete = true;
		//   42   81:aload_0         
		//   43   82:iconst_1        
		//   44   83:putfield        #48  <Field boolean isComplete>
			hasSliceType = true;
		//   45   86:aload_0         
		//   46   87:iconst_1        
		//   47   88:putfield        #82  <Field boolean hasSliceType>
		//   48   91:return          
		}

		public void setSliceType(int i)
		{
			sliceType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #86  <Field int sliceType>
			hasSliceType = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #82  <Field boolean hasSliceType>
		//    6   10:return          
		}

		private static final int SLICE_TYPE_ALL_I = 7;
		private static final int SLICE_TYPE_I = 2;
		private boolean bottomFieldFlag;
		private boolean bottomFieldFlagPresent;
		private int deltaPicOrderCnt0;
		private int deltaPicOrderCnt1;
		private int deltaPicOrderCntBottom;
		private boolean fieldPicFlag;
		private int frameNum;
		private boolean hasSliceType;
		private boolean idrPicFlag;
		private int idrPicId;
		private boolean isComplete;
		private int nalRefIdc;
		private int picOrderCntLsb;
		private int picParameterSetId;
		private int sliceType;
		private com.google.android.exoplayer.util.NalUnitUtil.SpsData spsData;


/*
		static boolean access$100(SliceHeaderData sliceheaderdata, SliceHeaderData sliceheaderdata1)
		{
			return sliceheaderdata.isFirstVclNalUnitOfPicture(sliceheaderdata1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #46  <Method boolean isFirstVclNalUnitOfPicture(H264Reader$SampleReader$SliceHeaderData)>
		//    3    5:ireturn         
		}

*/

		private SliceHeaderData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
		//    2    4:return          
		}

		SliceHeaderData(H264Reader._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void H264Reader$SampleReader$SliceHeaderData()>
		//    2    4:return          
		}
	}


	private void outputSample(int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #88  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #90  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #95  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void appendToNalUnit(byte abyte0[], int i, int j)
	{
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata;
label0:
		{
			if(!isFilling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field boolean isFilling>
	//*   2    4:ifne            8
				return;
	//    3    7:return          
			j -= i;
	//    4    8:iload_3         
	//    5    9:iload_2         
	//    6   10:isub            
	//    7   11:istore_3        
			byte abyte1[] = buffer;
	//    8   12:aload_0         
	//    9   13:getfield        #80  <Field byte[] buffer>
	//   10   16:astore          15
			k = abyte1.length;
	//   11   18:aload           15
	//   12   20:arraylength     
	//   13   21:istore          4
			l = bufferLength;
	//   14   23:aload_0         
	//   15   24:getfield        #101 <Field int bufferLength>
	//   16   27:istore          5
			if(k < l + j)
	//*  17   29:iload           4
	//*  18   31:iload           5
	//*  19   33:iload_3         
	//*  20   34:iadd            
	//*  21   35:icmpge          53
				buffer = Arrays.copyOf(abyte1, (l + j) * 2);
	//   22   38:aload_0         
	//   23   39:aload           15
	//   24   41:iload           5
	//   25   43:iload_3         
	//   26   44:iadd            
	//   27   45:iconst_2        
	//   28   46:imul            
	//   29   47:invokestatic    #107 <Method byte[] Arrays.copyOf(byte[], int)>
	//   30   50:putfield        #80  <Field byte[] buffer>
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), bufferLength, j);
	//   31   53:aload_1         
	//   32   54:iload_2         
	//   33   55:aload_0         
	//   34   56:getfield        #80  <Field byte[] buffer>
	//   35   59:aload_0         
	//   36   60:getfield        #101 <Field int bufferLength>
	//   37   63:iload_3         
	//   38   64:invokestatic    #113 <Method void System.arraycopy(Object, int, Object, int, int)>
			bufferLength = bufferLength + j;
	//   39   67:aload_0         
	//   40   68:aload_0         
	//   41   69:getfield        #101 <Field int bufferLength>
	//   42   72:iload_3         
	//   43   73:iadd            
	//   44   74:putfield        #101 <Field int bufferLength>
			scratch.reset(buffer, bufferLength);
	//   45   77:aload_0         
	//   46   78:getfield        #78  <Field ParsableBitArray scratch>
	//   47   81:aload_0         
	//   48   82:getfield        #80  <Field byte[] buffer>
	//   49   85:aload_0         
	//   50   86:getfield        #101 <Field int bufferLength>
	//   51   89:invokevirtual   #116 <Method void ParsableBitArray.reset(byte[], int)>
			if(scratch.bitsLeft() < 8)
	//*  52   92:aload_0         
	//*  53   93:getfield        #78  <Field ParsableBitArray scratch>
	//*  54   96:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
	//*  55   99:bipush          8
	//*  56  101:icmpge          105
				return;
	//   57  104:return          
			scratch.skipBits(1);
	//   58  105:aload_0         
	//   59  106:getfield        #78  <Field ParsableBitArray scratch>
	//   60  109:iconst_1        
	//   61  110:invokevirtual   #123 <Method void ParsableBitArray.skipBits(int)>
			j1 = scratch.readBits(2);
	//   62  113:aload_0         
	//   63  114:getfield        #78  <Field ParsableBitArray scratch>
	//   64  117:iconst_2        
	//   65  118:invokevirtual   #127 <Method int ParsableBitArray.readBits(int)>
	//   66  121:istore          7
			scratch.skipBits(5);
	//   67  123:aload_0         
	//   68  124:getfield        #78  <Field ParsableBitArray scratch>
	//   69  127:iconst_5        
	//   70  128:invokevirtual   #123 <Method void ParsableBitArray.skipBits(int)>
			if(!scratch.canReadExpGolombCodedNum())
	//*  71  131:aload_0         
	//*  72  132:getfield        #78  <Field ParsableBitArray scratch>
	//*  73  135:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
	//*  74  138:ifne            142
				return;
	//   75  141:return          
			scratch.readUnsignedExpGolombCodedInt();
	//   76  142:aload_0         
	//   77  143:getfield        #78  <Field ParsableBitArray scratch>
	//   78  146:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//   79  149:pop             
			if(!scratch.canReadExpGolombCodedNum())
	//*  80  150:aload_0         
	//*  81  151:getfield        #78  <Field ParsableBitArray scratch>
	//*  82  154:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
	//*  83  157:ifne            161
				return;
	//   84  160:return          
			k1 = scratch.readUnsignedExpGolombCodedInt();
	//   85  161:aload_0         
	//   86  162:getfield        #78  <Field ParsableBitArray scratch>
	//   87  165:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//   88  168:istore          8
			if(!detectAccessUnits)
	//*  89  170:aload_0         
	//*  90  171:getfield        #59  <Field boolean detectAccessUnits>
	//*  91  174:ifne            192
			{
				isFilling = false;
	//   92  177:aload_0         
	//   93  178:iconst_0        
	//   94  179:putfield        #99  <Field boolean isFilling>
				sliceHeader.setSliceType(k1);
	//   95  182:aload_0         
	//   96  183:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//   97  186:iload           8
	//   98  188:invokevirtual   #137 <Method void H264Reader$SampleReader$SliceHeaderData.setSliceType(int)>
				return;
	//   99  191:return          
			}
			if(!scratch.canReadExpGolombCodedNum())
	//* 100  192:aload_0         
	//* 101  193:getfield        #78  <Field ParsableBitArray scratch>
	//* 102  196:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
	//* 103  199:ifne            203
				return;
	//  104  202:return          
			l1 = scratch.readUnsignedExpGolombCodedInt();
	//  105  203:aload_0         
	//  106  204:getfield        #78  <Field ParsableBitArray scratch>
	//  107  207:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  108  210:istore          9
			if(pps.indexOfKey(l1) < 0)
	//* 109  212:aload_0         
	//* 110  213:getfield        #66  <Field SparseArray pps>
	//* 111  216:iload           9
	//* 112  218:invokevirtual   #140 <Method int SparseArray.indexOfKey(int)>
	//* 113  221:ifge            230
			{
				isFilling = false;
	//  114  224:aload_0         
	//  115  225:iconst_0        
	//  116  226:putfield        #99  <Field boolean isFilling>
				return;
	//  117  229:return          
			}
			abyte0 = ((byte []) ((com.google.android.exoplayer.util.NalUnitUtil.PpsData)pps.get(l1)));
	//  118  230:aload_0         
	//  119  231:getfield        #66  <Field SparseArray pps>
	//  120  234:iload           9
	//  121  236:invokevirtual   #144 <Method Object SparseArray.get(int)>
	//  122  239:checkcast       #146 <Class com.google.android.exoplayer.util.NalUnitUtil$PpsData>
	//  123  242:astore_1        
			spsdata = (com.google.android.exoplayer.util.NalUnitUtil.SpsData)sps.get(((com.google.android.exoplayer.util.NalUnitUtil.PpsData) (abyte0)).seqParameterSetId);
	//  124  243:aload_0         
	//  125  244:getfield        #64  <Field SparseArray sps>
	//  126  247:aload_1         
	//  127  248:getfield        #149 <Field int com.google.android.exoplayer.util.NalUnitUtil$PpsData.seqParameterSetId>
	//  128  251:invokevirtual   #144 <Method Object SparseArray.get(int)>
	//  129  254:checkcast       #151 <Class com.google.android.exoplayer.util.NalUnitUtil$SpsData>
	//  130  257:astore          15
			if(spsdata.separateColorPlaneFlag)
	//* 131  259:aload           15
	//* 132  261:getfield        #154 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$SpsData.separateColorPlaneFlag>
	//* 133  264:ifeq            287
			{
				if(scratch.bitsLeft() < 2)
	//* 134  267:aload_0         
	//* 135  268:getfield        #78  <Field ParsableBitArray scratch>
	//* 136  271:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
	//* 137  274:iconst_2        
	//* 138  275:icmpge          279
					return;
	//  139  278:return          
				scratch.skipBits(2);
	//  140  279:aload_0         
	//  141  280:getfield        #78  <Field ParsableBitArray scratch>
	//  142  283:iconst_2        
	//  143  284:invokevirtual   #123 <Method void ParsableBitArray.skipBits(int)>
			}
			if(scratch.bitsLeft() < spsdata.frameNumLength)
	//* 144  287:aload_0         
	//* 145  288:getfield        #78  <Field ParsableBitArray scratch>
	//* 146  291:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
	//* 147  294:aload           15
	//* 148  296:getfield        #157 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.frameNumLength>
	//* 149  299:icmpge          303
				return;
	//  150  302:return          
			i2 = scratch.readBits(spsdata.frameNumLength);
	//  151  303:aload_0         
	//  152  304:getfield        #78  <Field ParsableBitArray scratch>
	//  153  307:aload           15
	//  154  309:getfield        #157 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.frameNumLength>
	//  155  312:invokevirtual   #127 <Method int ParsableBitArray.readBits(int)>
	//  156  315:istore          10
			if(!spsdata.frameMbsOnlyFlag)
	//* 157  317:aload           15
	//* 158  319:getfield        #160 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$SpsData.frameMbsOnlyFlag>
	//* 159  322:ifne            388
			{
				if(scratch.bitsLeft() < 1)
	//* 160  325:aload_0         
	//* 161  326:getfield        #78  <Field ParsableBitArray scratch>
	//* 162  329:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
	//* 163  332:iconst_1        
	//* 164  333:icmpge          337
					return;
	//  165  336:return          
				flag = scratch.readBit();
	//  166  337:aload_0         
	//  167  338:getfield        #78  <Field ParsableBitArray scratch>
	//  168  341:invokevirtual   #163 <Method boolean ParsableBitArray.readBit()>
	//  169  344:istore          11
				if(flag)
	//* 170  346:iload           11
	//* 171  348:ifeq            378
				{
					if(scratch.bitsLeft() < 1)
	//* 172  351:aload_0         
	//* 173  352:getfield        #78  <Field ParsableBitArray scratch>
	//* 174  355:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
	//* 175  358:iconst_1        
	//* 176  359:icmpge          363
						return;
	//  177  362:return          
					flag2 = scratch.readBit();
	//  178  363:aload_0         
	//  179  364:getfield        #78  <Field ParsableBitArray scratch>
	//  180  367:invokevirtual   #163 <Method boolean ParsableBitArray.readBit()>
	//  181  370:istore          13
					flag1 = true;
	//  182  372:iconst_1        
	//  183  373:istore          12
				} else
	//* 184  375:goto            399
				{
					flag1 = false;
	//  185  378:iconst_0        
	//  186  379:istore          12
					flag2 = flag1;
	//  187  381:iload           12
	//  188  383:istore          13
				}
			} else
	//* 189  385:goto            399
			{
				flag = false;
	//  190  388:iconst_0        
	//  191  389:istore          11
				flag1 = flag;
	//  192  391:iload           11
	//  193  393:istore          12
				flag2 = flag1;
	//  194  395:iload           12
	//  195  397:istore          13
			}
			if(nalUnitType == 5)
	//* 196  399:aload_0         
	//* 197  400:getfield        #165 <Field int nalUnitType>
	//* 198  403:iconst_5        
	//* 199  404:icmpne          413
				flag3 = true;
	//  200  407:iconst_1        
	//  201  408:istore          14
			else
	//* 202  410:goto            416
				flag3 = false;
	//  203  413:iconst_0        
	//  204  414:istore          14
			if(flag3)
	//* 205  416:iload           14
	//* 206  418:ifeq            444
			{
				if(!scratch.canReadExpGolombCodedNum())
	//* 207  421:aload_0         
	//* 208  422:getfield        #78  <Field ParsableBitArray scratch>
	//* 209  425:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
	//* 210  428:ifne            432
					return;
	//  211  431:return          
				i1 = scratch.readUnsignedExpGolombCodedInt();
	//  212  432:aload_0         
	//  213  433:getfield        #78  <Field ParsableBitArray scratch>
	//  214  436:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
	//  215  439:istore          6
			} else
	//* 216  441:goto            447
			{
				i1 = 0;
	//  217  444:iconst_0        
	//  218  445:istore          6
			}
			if(spsdata.picOrderCountType == 0)
	//* 219  447:aload           15
	//* 220  449:getfield        #168 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
	//* 221  452:ifne            528
			{
				if(scratch.bitsLeft() < spsdata.picOrderCntLsbLength)
	//* 222  455:aload_0         
	//* 223  456:getfield        #78  <Field ParsableBitArray scratch>
	//* 224  459:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
	//* 225  462:aload           15
	//* 226  464:getfield        #171 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCntLsbLength>
	//* 227  467:icmpge          471
					return;
	//  228  470:return          
				i = scratch.readBits(spsdata.picOrderCntLsbLength);
	//  229  471:aload_0         
	//  230  472:getfield        #78  <Field ParsableBitArray scratch>
	//  231  475:aload           15
	//  232  477:getfield        #171 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCntLsbLength>
	//  233  480:invokevirtual   #127 <Method int ParsableBitArray.readBits(int)>
	//  234  483:istore_2        
				if(((com.google.android.exoplayer.util.NalUnitUtil.PpsData) (abyte0)).bottomFieldPicOrderInFramePresentFlag && !flag)
	//* 235  484:aload_1         
	//* 236  485:getfield        #174 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag>
	//* 237  488:ifeq            525
	//* 238  491:iload           11
	//* 239  493:ifne            525
				{
					if(!scratch.canReadExpGolombCodedNum())
	//* 240  496:aload_0         
	//* 241  497:getfield        #78  <Field ParsableBitArray scratch>
	//* 242  500:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
	//* 243  503:ifne            507
						return;
	//  244  506:return          
					j = scratch.readSignedExpGolombCodedInt();
	//  245  507:aload_0         
	//  246  508:getfield        #78  <Field ParsableBitArray scratch>
	//  247  511:invokevirtual   #177 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
	//  248  514:istore_3        
					k = 0;
	//  249  515:iconst_0        
	//  250  516:istore          4
					l = k;
	//  251  518:iload           4
	//  252  520:istore          5
					break label0;
	//  253  522:goto            625
				}
			} else
	//* 254  525:goto            616
			{
				if(spsdata.picOrderCountType == 1 && !spsdata.deltaPicOrderAlwaysZeroFlag)
	//* 255  528:aload           15
	//* 256  530:getfield        #168 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
	//* 257  533:iconst_1        
	//* 258  534:icmpne          614
	//* 259  537:aload           15
	//* 260  539:getfield        #180 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$SpsData.deltaPicOrderAlwaysZeroFlag>
	//* 261  542:ifne            614
				{
					if(!scratch.canReadExpGolombCodedNum())
	//* 262  545:aload_0         
	//* 263  546:getfield        #78  <Field ParsableBitArray scratch>
	//* 264  549:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
	//* 265  552:ifne            556
						return;
	//  266  555:return          
					k = scratch.readSignedExpGolombCodedInt();
	//  267  556:aload_0         
	//  268  557:getfield        #78  <Field ParsableBitArray scratch>
	//  269  560:invokevirtual   #177 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
	//  270  563:istore          4
					if(((com.google.android.exoplayer.util.NalUnitUtil.PpsData) (abyte0)).bottomFieldPicOrderInFramePresentFlag && !flag)
	//* 271  565:aload_1         
	//* 272  566:getfield        #174 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag>
	//* 273  569:ifeq            604
	//* 274  572:iload           11
	//* 275  574:ifne            604
					{
						if(!scratch.canReadExpGolombCodedNum())
	//* 276  577:aload_0         
	//* 277  578:getfield        #78  <Field ParsableBitArray scratch>
	//* 278  581:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
	//* 279  584:ifne            588
							return;
	//  280  587:return          
						l = scratch.readSignedExpGolombCodedInt();
	//  281  588:aload_0         
	//  282  589:getfield        #78  <Field ParsableBitArray scratch>
	//  283  592:invokevirtual   #177 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
	//  284  595:istore          5
						i = 0;
	//  285  597:iconst_0        
	//  286  598:istore_2        
						j = i;
	//  287  599:iload_2         
	//  288  600:istore_3        
					} else
	//* 289  601:goto            625
					{
						i = 0;
	//  290  604:iconst_0        
	//  291  605:istore_2        
						j = i;
	//  292  606:iload_2         
	//  293  607:istore_3        
						l = j;
	//  294  608:iload_3         
	//  295  609:istore          5
					}
					break label0;
	//  296  611:goto            625
				}
				i = 0;
	//  297  614:iconst_0        
	//  298  615:istore_2        
			}
			j = 0;
	//  299  616:iconst_0        
	//  300  617:istore_3        
			k = 0;
	//  301  618:iconst_0        
	//  302  619:istore          4
			l = k;
	//  303  621:iload           4
	//  304  623:istore          5
		}
		sliceHeader.setAll(spsdata, j1, k1, i2, l1, flag, flag1, flag2, flag3, i1, i, j, k, l);
	//  305  625:aload_0         
	//  306  626:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//  307  629:aload           15
	//  308  631:iload           7
	//  309  633:iload           8
	//  310  635:iload           10
	//  311  637:iload           9
	//  312  639:iload           11
	//  313  641:iload           12
	//  314  643:iload           13
	//  315  645:iload           14
	//  316  647:iload           6
	//  317  649:iload_2         
	//  318  650:iload_3         
	//  319  651:iload           4
	//  320  653:iload           5
	//  321  655:invokevirtual   #184 <Method void H264Reader$SampleReader$SliceHeaderData.setAll(com.google.android.exoplayer.util.NalUnitUtil$SpsData, int, int, int, int, boolean, boolean, boolean, boolean, int, int, int, int, int)>
		isFilling = false;
	//  322  658:aload_0         
	//  323  659:iconst_0        
	//  324  660:putfield        #99  <Field boolean isFilling>
	//  325  663:return          
	}

	public void endNalUnit(long l, int i)
	{
		boolean flag1;
label0:
		{
			int j = nalUnitType;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int nalUnitType>
	//    2    4:istore          5
			boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
			if(j == 9 || detectAccessUnits && sliceHeader.isFirstVclNalUnitOfPicture(previousSliceHeader))
	//*   5    9:iload           5
	//*   6   11:bipush          9
	//*   7   13:icmpeq          37
	//*   8   16:aload_0         
	//*   9   17:getfield        #59  <Field boolean detectAccessUnits>
	//*  10   20:ifeq            83
	//*  11   23:aload_0         
	//*  12   24:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//*  13   27:aload_0         
	//*  14   28:getfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
	//*  15   31:invokestatic    #190 <Method boolean H264Reader$SampleReader$SliceHeaderData.access$100(H264Reader$SampleReader$SliceHeaderData, H264Reader$SampleReader$SliceHeaderData)>
	//*  16   34:ifeq            83
			{
				if(readingSample)
	//*  17   37:aload_0         
	//*  18   38:getfield        #192 <Field boolean readingSample>
	//*  19   41:ifeq            57
					outputSample(i + (int)(l - nalUnitStartPosition));
	//   20   44:aload_0         
	//   21   45:iload_3         
	//   22   46:lload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #194 <Field long nalUnitStartPosition>
	//   25   51:lsub            
	//   26   52:l2i             
	//   27   53:iadd            
	//   28   54:invokespecial   #196 <Method void outputSample(int)>
				samplePosition = nalUnitStartPosition;
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #194 <Field long nalUnitStartPosition>
	//   32   62:putfield        #198 <Field long samplePosition>
				sampleTimeUs = nalUnitTimeUs;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #200 <Field long nalUnitTimeUs>
	//   36   70:putfield        #202 <Field long sampleTimeUs>
				sampleIsKeyframe = false;
	//   37   73:aload_0         
	//   38   74:iconst_0        
	//   39   75:putfield        #204 <Field boolean sampleIsKeyframe>
				readingSample = true;
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:putfield        #192 <Field boolean readingSample>
			}
			flag1 = sampleIsKeyframe;
	//   43   83:aload_0         
	//   44   84:getfield        #204 <Field boolean sampleIsKeyframe>
	//   45   87:istore          6
			j = nalUnitType;
	//   46   89:aload_0         
	//   47   90:getfield        #165 <Field int nalUnitType>
	//   48   93:istore          5
			if(j != 5)
	//*  49   95:iload           5
	//*  50   97:iconst_5        
	//*  51   98:icmpeq          133
			{
				i = ((int) (flag));
	//   52  101:iload           4
	//   53  103:istore_3        
				if(!allowNonIdrKeyframes)
					break label0;
	//   54  104:aload_0         
	//   55  105:getfield        #57  <Field boolean allowNonIdrKeyframes>
	//   56  108:ifeq            135
				i = ((int) (flag));
	//   57  111:iload           4
	//   58  113:istore_3        
				if(j != 1)
					break label0;
	//   59  114:iload           5
	//   60  116:iconst_1        
	//   61  117:icmpne          135
				i = ((int) (flag));
	//   62  120:iload           4
	//   63  122:istore_3        
				if(!sliceHeader.isISlice())
					break label0;
	//   64  123:aload_0         
	//   65  124:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//   66  127:invokevirtual   #207 <Method boolean H264Reader$SampleReader$SliceHeaderData.isISlice()>
	//   67  130:ifeq            135
			}
			i = 1;
	//   68  133:iconst_1        
	//   69  134:istore_3        
		}
		sampleIsKeyframe = ((boolean) (flag1 | i));
	//   70  135:aload_0         
	//   71  136:iload           6
	//   72  138:iload_3         
	//   73  139:ior             
	//   74  140:putfield        #204 <Field boolean sampleIsKeyframe>
	//   75  143:return          
	}

	public boolean needsSpsPps()
	{
		return detectAccessUnits;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean detectAccessUnits>
	//    2    4:ireturn         
	}

	public void putPps(com.google.android.exoplayer.util.NalUnitUtil.PpsData ppsdata)
	{
		pps.append(ppsdata.picParameterSetId, ((Object) (ppsdata)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field SparseArray pps>
	//    2    4:aload_1         
	//    3    5:getfield        #213 <Field int com.google.android.exoplayer.util.NalUnitUtil$PpsData.picParameterSetId>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #217 <Method void SparseArray.append(int, Object)>
	//    6   12:return          
	}

	public void putSps(com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata)
	{
		sps.append(spsdata.seqParameterSetId, ((Object) (spsdata)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field SparseArray sps>
	//    2    4:aload_1         
	//    3    5:getfield        #220 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.seqParameterSetId>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #217 <Method void SparseArray.append(int, Object)>
	//    6   12:return          
	}

	public void reset()
	{
		isFilling = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #99  <Field boolean isFilling>
		readingSample = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #192 <Field boolean readingSample>
		sliceHeader.clear();
	//    6   10:aload_0         
	//    7   11:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//    8   14:invokevirtual   #223 <Method void H264Reader$SampleReader$SliceHeaderData.clear()>
	//    9   17:return          
	}

	public void startNalUnit(long l, int i, long l1)
	{
label0:
		{
			nalUnitType = i;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #165 <Field int nalUnitType>
			nalUnitTimeUs = l1;
	//    3    5:aload_0         
	//    4    6:lload           4
	//    5    8:putfield        #200 <Field long nalUnitTimeUs>
			nalUnitStartPosition = l;
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:putfield        #194 <Field long nalUnitStartPosition>
			if(!allowNonIdrKeyframes || nalUnitType != 1)
	//*   9   16:aload_0         
	//*  10   17:getfield        #57  <Field boolean allowNonIdrKeyframes>
	//*  11   20:ifeq            31
	//*  12   23:aload_0         
	//*  13   24:getfield        #165 <Field int nalUnitType>
	//*  14   27:iconst_1        
	//*  15   28:icmpeq          58
			{
				if(!detectAccessUnits)
					break label0;
	//   16   31:aload_0         
	//   17   32:getfield        #59  <Field boolean detectAccessUnits>
	//   18   35:ifeq            95
				i = nalUnitType;
	//   19   38:aload_0         
	//   20   39:getfield        #165 <Field int nalUnitType>
	//   21   42:istore_3        
				if(i != 5 && i != 1 && i != 2)
					break label0;
	//   22   43:iload_3         
	//   23   44:iconst_5        
	//   24   45:icmpeq          58
	//   25   48:iload_3         
	//   26   49:iconst_1        
	//   27   50:icmpeq          58
	//   28   53:iload_3         
	//   29   54:iconst_2        
	//   30   55:icmpne          95
			}
			SliceHeaderData sliceheaderdata = previousSliceHeader;
	//   31   58:aload_0         
	//   32   59:getfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
	//   33   62:astore          6
			previousSliceHeader = sliceHeader;
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//   37   69:putfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
			sliceHeader = sliceheaderdata;
	//   38   72:aload_0         
	//   39   73:aload           6
	//   40   75:putfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
			sliceHeader.clear();
	//   41   78:aload_0         
	//   42   79:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//   43   82:invokevirtual   #223 <Method void H264Reader$SampleReader$SliceHeaderData.clear()>
			bufferLength = 0;
	//   44   85:aload_0         
	//   45   86:iconst_0        
	//   46   87:putfield        #101 <Field int bufferLength>
			isFilling = true;
	//   47   90:aload_0         
	//   48   91:iconst_1        
	//   49   92:putfield        #99  <Field boolean isFilling>
		}
	//   50   95:return          
	}

	private static final int DEFAULT_BUFFER_SIZE = 128;
	private static final int NAL_UNIT_TYPE_AUD = 9;
	private static final int NAL_UNIT_TYPE_IDR = 5;
	private static final int NAL_UNIT_TYPE_NON_IDR = 1;
	private static final int NAL_UNIT_TYPE_PARTITION_A = 2;
	private final boolean allowNonIdrKeyframes;
	private byte buffer[];
	private int bufferLength;
	private final boolean detectAccessUnits;
	private boolean isFilling;
	private long nalUnitStartPosition;
	private long nalUnitTimeUs;
	private int nalUnitType;
	private final TrackOutput output;
	private final SparseArray pps = new SparseArray();
	private SliceHeaderData previousSliceHeader;
	private boolean readingSample;
	private boolean sampleIsKeyframe;
	private long samplePosition;
	private long sampleTimeUs;
	private final ParsableBitArray scratch = new ParsableBitArray();
	private SliceHeaderData sliceHeader;
	private final SparseArray sps = new SparseArray();

	public H264Reader$SampleReader(TrackOutput trackoutput, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		output = trackoutput;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #55  <Field TrackOutput output>
		allowNonIdrKeyframes = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #57  <Field boolean allowNonIdrKeyframes>
		detectAccessUnits = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #59  <Field boolean detectAccessUnits>
	//   11   19:aload_0         
	//   12   20:new             #61  <Class SparseArray>
	//   13   23:dup             
	//   14   24:invokespecial   #62  <Method void SparseArray()>
	//   15   27:putfield        #64  <Field SparseArray sps>
	//   16   30:aload_0         
	//   17   31:new             #61  <Class SparseArray>
	//   18   34:dup             
	//   19   35:invokespecial   #62  <Method void SparseArray()>
	//   20   38:putfield        #66  <Field SparseArray pps>
		previousSliceHeader = new SliceHeaderData(((H264Reader._cls1) (null)));
	//   21   41:aload_0         
	//   22   42:new             #9   <Class H264Reader$SampleReader$SliceHeaderData>
	//   23   45:dup             
	//   24   46:aconst_null     
	//   25   47:invokespecial   #69  <Method void H264Reader$SampleReader$SliceHeaderData(H264Reader$1)>
	//   26   50:putfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
		sliceHeader = new SliceHeaderData(((H264Reader._cls1) (null)));
	//   27   53:aload_0         
	//   28   54:new             #9   <Class H264Reader$SampleReader$SliceHeaderData>
	//   29   57:dup             
	//   30   58:aconst_null     
	//   31   59:invokespecial   #69  <Method void H264Reader$SampleReader$SliceHeaderData(H264Reader$1)>
	//   32   62:putfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
	//   33   65:aload_0         
	//   34   66:new             #75  <Class ParsableBitArray>
	//   35   69:dup             
	//   36   70:invokespecial   #76  <Method void ParsableBitArray()>
	//   37   73:putfield        #78  <Field ParsableBitArray scratch>
		buffer = new byte[128];
	//   38   76:aload_0         
	//   39   77:sipush          128
	//   40   80:newarray        byte[]
	//   41   82:putfield        #80  <Field byte[] buffer>
		reset();
	//   42   85:aload_0         
	//   43   86:invokevirtual   #83  <Method void reset()>
	//   44   89:return          
	}
}
