// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;


// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			H264Reader

private static final class H264Reader$SampleReader$SliceHeaderData
{

	private boolean isFirstVclNalUnitOfPicture(H264Reader$SampleReader$SliceHeaderData h264reader$samplereader$sliceheaderdata)
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
				if(!h264reader$samplereader$sliceheaderdata.isComplete)
					break label0;
	//    9   18:aload_1         
	//   10   19:getfield        #48  <Field boolean isComplete>
	//   11   22:ifeq            281
				flag = flag1;
	//   12   25:iload           5
	//   13   27:istore          4
				if(frameNum != h264reader$samplereader$sliceheaderdata.frameNum)
					break label0;
	//   14   29:aload_0         
	//   15   30:getfield        #50  <Field int frameNum>
	//   16   33:aload_1         
	//   17   34:getfield        #50  <Field int frameNum>
	//   18   37:icmpne          281
				flag = flag1;
	//   19   40:iload           5
	//   20   42:istore          4
				if(picParameterSetId != h264reader$samplereader$sliceheaderdata.picParameterSetId)
					break label0;
	//   21   44:aload_0         
	//   22   45:getfield        #52  <Field int picParameterSetId>
	//   23   48:aload_1         
	//   24   49:getfield        #52  <Field int picParameterSetId>
	//   25   52:icmpne          281
				flag = flag1;
	//   26   55:iload           5
	//   27   57:istore          4
				if(fieldPicFlag != h264reader$samplereader$sliceheaderdata.fieldPicFlag)
					break label0;
	//   28   59:aload_0         
	//   29   60:getfield        #54  <Field boolean fieldPicFlag>
	//   30   63:aload_1         
	//   31   64:getfield        #54  <Field boolean fieldPicFlag>
	//   32   67:icmpne          281
				if(bottomFieldFlagPresent && h264reader$samplereader$sliceheaderdata.bottomFieldFlagPresent)
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
					if(bottomFieldFlag != h264reader$samplereader$sliceheaderdata.bottomFieldFlag)
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
				int j = h264reader$samplereader$sliceheaderdata.nalRefIdc;
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
				if(spsData.picOrderCountType == 0 && h264reader$samplereader$sliceheaderdata.spsData.picOrderCountType == 0)
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
					if(picOrderCntLsb != h264reader$samplereader$sliceheaderdata.picOrderCntLsb)
						break label0;
	//   73  154:aload_0         
	//   74  155:getfield        #69  <Field int picOrderCntLsb>
	//   75  158:aload_1         
	//   76  159:getfield        #69  <Field int picOrderCntLsb>
	//   77  162:icmpne          281
					flag = flag1;
	//   78  165:iload           5
	//   79  167:istore          4
					if(deltaPicOrderCntBottom != h264reader$samplereader$sliceheaderdata.deltaPicOrderCntBottom)
						break label0;
	//   80  169:aload_0         
	//   81  170:getfield        #71  <Field int deltaPicOrderCntBottom>
	//   82  173:aload_1         
	//   83  174:getfield        #71  <Field int deltaPicOrderCntBottom>
	//   84  177:icmpne          281
				}
				if(spsData.picOrderCountType == 1 && h264reader$samplereader$sliceheaderdata.spsData.picOrderCountType == 1)
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
					if(deltaPicOrderCnt0 != h264reader$samplereader$sliceheaderdata.deltaPicOrderCnt0)
						break label0;
	//   97  206:aload_0         
	//   98  207:getfield        #73  <Field int deltaPicOrderCnt0>
	//   99  210:aload_1         
	//  100  211:getfield        #73  <Field int deltaPicOrderCnt0>
	//  101  214:icmpne          281
					flag = flag1;
	//  102  217:iload           5
	//  103  219:istore          4
					if(deltaPicOrderCnt1 != h264reader$samplereader$sliceheaderdata.deltaPicOrderCnt1)
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
				boolean flag3 = h264reader$samplereader$sliceheaderdata.idrPicFlag;
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
				if(flag2 && flag3 && idrPicId != h264reader$samplereader$sliceheaderdata.idrPicId)
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
	static boolean access$100(H264Reader$SampleReader$SliceHeaderData h264reader$samplereader$sliceheaderdata, H264Reader$SampleReader$SliceHeaderData h264reader$samplereader$sliceheaderdata1)
	{
		return h264reader$samplereader$sliceheaderdata.isFirstVclNalUnitOfPicture(h264reader$samplereader$sliceheaderdata1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method boolean isFirstVclNalUnitOfPicture(H264Reader$SampleReader$SliceHeaderData)>
	//    3    5:ireturn         
	}

*/

	private H264Reader$SampleReader$SliceHeaderData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	H264Reader$SampleReader$SliceHeaderData(H264Reader._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void H264Reader$SampleReader$SliceHeaderData()>
	//    2    4:return          
	}
}
