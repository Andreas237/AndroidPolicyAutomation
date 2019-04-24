// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;


// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
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
	//    2    4:istore_2        
			boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
			if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            249
			{
				flag = flag1;
	//    7   11:iload_3         
	//    8   12:istore_2        
				if(!h264reader$samplereader$sliceheaderdata.isComplete)
					break label0;
	//    9   13:aload_1         
	//   10   14:getfield        #48  <Field boolean isComplete>
	//   11   17:ifeq            251
				flag = flag1;
	//   12   20:iload_3         
	//   13   21:istore_2        
				if(frameNum != h264reader$samplereader$sliceheaderdata.frameNum)
					break label0;
	//   14   22:aload_0         
	//   15   23:getfield        #50  <Field int frameNum>
	//   16   26:aload_1         
	//   17   27:getfield        #50  <Field int frameNum>
	//   18   30:icmpne          251
				flag = flag1;
	//   19   33:iload_3         
	//   20   34:istore_2        
				if(picParameterSetId != h264reader$samplereader$sliceheaderdata.picParameterSetId)
					break label0;
	//   21   35:aload_0         
	//   22   36:getfield        #52  <Field int picParameterSetId>
	//   23   39:aload_1         
	//   24   40:getfield        #52  <Field int picParameterSetId>
	//   25   43:icmpne          251
				flag = flag1;
	//   26   46:iload_3         
	//   27   47:istore_2        
				if(fieldPicFlag != h264reader$samplereader$sliceheaderdata.fieldPicFlag)
					break label0;
	//   28   48:aload_0         
	//   29   49:getfield        #54  <Field boolean fieldPicFlag>
	//   30   52:aload_1         
	//   31   53:getfield        #54  <Field boolean fieldPicFlag>
	//   32   56:icmpne          251
				if(bottomFieldFlagPresent && h264reader$samplereader$sliceheaderdata.bottomFieldFlagPresent)
	//*  33   59:aload_0         
	//*  34   60:getfield        #56  <Field boolean bottomFieldFlagPresent>
	//*  35   63:ifeq            86
	//*  36   66:aload_1         
	//*  37   67:getfield        #56  <Field boolean bottomFieldFlagPresent>
	//*  38   70:ifeq            86
				{
					flag = flag1;
	//   39   73:iload_3         
	//   40   74:istore_2        
					if(bottomFieldFlag != h264reader$samplereader$sliceheaderdata.bottomFieldFlag)
						break label0;
	//   41   75:aload_0         
	//   42   76:getfield        #58  <Field boolean bottomFieldFlag>
	//   43   79:aload_1         
	//   44   80:getfield        #58  <Field boolean bottomFieldFlag>
	//   45   83:icmpne          251
				}
				if(nalRefIdc != h264reader$samplereader$sliceheaderdata.nalRefIdc)
	//*  46   86:aload_0         
	//*  47   87:getfield        #60  <Field int nalRefIdc>
	//*  48   90:aload_1         
	//*  49   91:getfield        #60  <Field int nalRefIdc>
	//*  50   94:icmpeq          115
				{
					flag = flag1;
	//   51   97:iload_3         
	//   52   98:istore_2        
					if(nalRefIdc == 0)
						break label0;
	//   53   99:aload_0         
	//   54  100:getfield        #60  <Field int nalRefIdc>
	//   55  103:ifeq            251
					flag = flag1;
	//   56  106:iload_3         
	//   57  107:istore_2        
					if(h264reader$samplereader$sliceheaderdata.nalRefIdc == 0)
						break label0;
	//   58  108:aload_1         
	//   59  109:getfield        #60  <Field int nalRefIdc>
	//   60  112:ifeq            251
				}
				if(spsData.picOrderCountType == 0 && h264reader$samplereader$sliceheaderdata.spsData.picOrderCountType == 0)
	//*  61  115:aload_0         
	//*  62  116:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
	//*  63  119:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
	//*  64  122:ifne            161
	//*  65  125:aload_1         
	//*  66  126:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
	//*  67  129:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
	//*  68  132:ifne            161
				{
					flag = flag1;
	//   69  135:iload_3         
	//   70  136:istore_2        
					if(picOrderCntLsb != h264reader$samplereader$sliceheaderdata.picOrderCntLsb)
						break label0;
	//   71  137:aload_0         
	//   72  138:getfield        #69  <Field int picOrderCntLsb>
	//   73  141:aload_1         
	//   74  142:getfield        #69  <Field int picOrderCntLsb>
	//   75  145:icmpne          251
					flag = flag1;
	//   76  148:iload_3         
	//   77  149:istore_2        
					if(deltaPicOrderCntBottom != h264reader$samplereader$sliceheaderdata.deltaPicOrderCntBottom)
						break label0;
	//   78  150:aload_0         
	//   79  151:getfield        #71  <Field int deltaPicOrderCntBottom>
	//   80  154:aload_1         
	//   81  155:getfield        #71  <Field int deltaPicOrderCntBottom>
	//   82  158:icmpne          251
				}
				if(spsData.picOrderCountType == 1 && h264reader$samplereader$sliceheaderdata.spsData.picOrderCountType == 1)
	//*  83  161:aload_0         
	//*  84  162:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
	//*  85  165:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
	//*  86  168:iconst_1        
	//*  87  169:icmpne          209
	//*  88  172:aload_1         
	//*  89  173:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
	//*  90  176:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
	//*  91  179:iconst_1        
	//*  92  180:icmpne          209
				{
					flag = flag1;
	//   93  183:iload_3         
	//   94  184:istore_2        
					if(deltaPicOrderCnt0 != h264reader$samplereader$sliceheaderdata.deltaPicOrderCnt0)
						break label0;
	//   95  185:aload_0         
	//   96  186:getfield        #73  <Field int deltaPicOrderCnt0>
	//   97  189:aload_1         
	//   98  190:getfield        #73  <Field int deltaPicOrderCnt0>
	//   99  193:icmpne          251
					flag = flag1;
	//  100  196:iload_3         
	//  101  197:istore_2        
					if(deltaPicOrderCnt1 != h264reader$samplereader$sliceheaderdata.deltaPicOrderCnt1)
						break label0;
	//  102  198:aload_0         
	//  103  199:getfield        #75  <Field int deltaPicOrderCnt1>
	//  104  202:aload_1         
	//  105  203:getfield        #75  <Field int deltaPicOrderCnt1>
	//  106  206:icmpne          251
				}
				flag = flag1;
	//  107  209:iload_3         
	//  108  210:istore_2        
				if(idrPicFlag != h264reader$samplereader$sliceheaderdata.idrPicFlag)
					break label0;
	//  109  211:aload_0         
	//  110  212:getfield        #77  <Field boolean idrPicFlag>
	//  111  215:aload_1         
	//  112  216:getfield        #77  <Field boolean idrPicFlag>
	//  113  219:icmpne          251
				if(idrPicFlag && h264reader$samplereader$sliceheaderdata.idrPicFlag && idrPicId != h264reader$samplereader$sliceheaderdata.idrPicId)
	//* 114  222:aload_0         
	//* 115  223:getfield        #77  <Field boolean idrPicFlag>
	//* 116  226:ifeq            249
	//* 117  229:aload_1         
	//* 118  230:getfield        #77  <Field boolean idrPicFlag>
	//* 119  233:ifeq            249
	//* 120  236:aload_0         
	//* 121  237:getfield        #79  <Field int idrPicId>
	//* 122  240:aload_1         
	//* 123  241:getfield        #79  <Field int idrPicId>
	//* 124  244:icmpeq          249
					return true;
	//  125  247:iconst_1        
	//  126  248:ireturn         
			}
			flag = false;
	//  127  249:iconst_0        
	//  128  250:istore_2        
		}
		return flag;
	//  129  251:iload_2         
	//  130  252:ireturn         
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
		return hasSliceType && (sliceType == 7 || sliceType == 2);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field boolean hasSliceType>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #86  <Field int sliceType>
	//    5   11:bipush          7
	//    6   13:icmpeq          24
	//    7   16:aload_0         
	//    8   17:getfield        #86  <Field int sliceType>
	//    9   20:iconst_2        
	//   10   21:icmpne          26
	//   11   24:iconst_1        
	//   12   25:ireturn         
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public void setAll(com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsdata, int i, int j, int k, int l, boolean flag, boolean flag1, 
			boolean flag2, boolean flag3, int i1, int j1, int k1, int l1, int i2)
	{
		spsData = spsdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
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
	private com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsData;


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
