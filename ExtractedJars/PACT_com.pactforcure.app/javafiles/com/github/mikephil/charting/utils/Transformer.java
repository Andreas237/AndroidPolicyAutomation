// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;

import android.graphics.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.interfaces.datasets.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.utils:
//			ViewPortHandler, PointD

public class Transformer
{

	public Transformer(ViewPortHandler viewporthandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mMatrixValueToPx = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Matrix()>
	//    6   12:putfield        #21  <Field Matrix mMatrixValueToPx>
		mMatrixOffset = new Matrix();
	//    7   15:aload_0         
	//    8   16:new             #18  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #19  <Method void Matrix()>
	//   11   23:putfield        #23  <Field Matrix mMatrixOffset>
		mMBuffer1 = new Matrix();
	//   12   26:aload_0         
	//   13   27:new             #18  <Class Matrix>
	//   14   30:dup             
	//   15   31:invokespecial   #19  <Method void Matrix()>
	//   16   34:putfield        #25  <Field Matrix mMBuffer1>
		mMBuffer2 = new Matrix();
	//   17   37:aload_0         
	//   18   38:new             #18  <Class Matrix>
	//   19   41:dup             
	//   20   42:invokespecial   #19  <Method void Matrix()>
	//   21   45:putfield        #27  <Field Matrix mMBuffer2>
		mViewPortHandler = viewporthandler;
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:putfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   25   53:return          
	}

	public float[] generateTransformedValuesBarChart(IBarDataSet ibardataset, int i, BarData bardata, float f)
	{
		float af[] = new float[ibardataset.getEntryCount() * 2];
	//    0    0:aload_1         
	//    1    1:invokeinterface #38  <Method int IBarDataSet.getEntryCount()>
	//    2    6:iconst_2        
	//    3    7:imul            
	//    4    8:newarray        float[]
	//    5   10:astore          13
		int k = bardata.getDataSetCount();
	//    6   12:aload_3         
	//    7   13:invokevirtual   #43  <Method int BarData.getDataSetCount()>
	//    8   16:istore          11
		float f1 = bardata.getGroupSpace();
	//    9   18:aload_3         
	//   10   19:invokevirtual   #47  <Method float BarData.getGroupSpace()>
	//   11   22:fstore          5
		for(int j = 0; j < af.length; j += 2)
	//*  12   24:iconst_0        
	//*  13   25:istore          10
	//*  14   27:iload           10
	//*  15   29:aload           13
	//*  16   31:arraylength     
	//*  17   32:icmpge          123
		{
			bardata = ((BarData) (ibardataset.getEntryForIndex(j / 2)));
	//   18   35:aload_1         
	//   19   36:iload           10
	//   20   38:iconst_2        
	//   21   39:idiv            
	//   22   40:invokeinterface #51  <Method Entry IBarDataSet.getEntryForIndex(int)>
	//   23   45:astore_3        
			int l = ((Entry) (bardata)).getXIndex();
	//   24   46:aload_3         
	//   25   47:invokevirtual   #56  <Method int Entry.getXIndex()>
	//   26   50:istore          12
			float f2 = ((Entry) (bardata)).getXIndex() + (k - 1) * l + i;
	//   27   52:aload_3         
	//   28   53:invokevirtual   #56  <Method int Entry.getXIndex()>
	//   29   56:iload           11
	//   30   58:iconst_1        
	//   31   59:isub            
	//   32   60:iload           12
	//   33   62:imul            
	//   34   63:iadd            
	//   35   64:iload_2         
	//   36   65:iadd            
	//   37   66:i2f             
	//   38   67:fstore          6
			float f3 = l;
	//   39   69:iload           12
	//   40   71:i2f             
	//   41   72:fstore          7
			float f4 = f1 / 2.0F;
	//   42   74:fload           5
	//   43   76:fconst_2        
	//   44   77:fdiv            
	//   45   78:fstore          8
			float f5 = ((Entry) (bardata)).getVal();
	//   46   80:aload_3         
	//   47   81:invokevirtual   #59  <Method float Entry.getVal()>
	//   48   84:fstore          9
			af[j] = f2 + f3 * f1 + f4;
	//   49   86:aload           13
	//   50   88:iload           10
	//   51   90:fload           6
	//   52   92:fload           7
	//   53   94:fload           5
	//   54   96:fmul            
	//   55   97:fadd            
	//   56   98:fload           8
	//   57  100:fadd            
	//   58  101:fastore         
			af[j + 1] = f5 * f;
	//   59  102:aload           13
	//   60  104:iload           10
	//   61  106:iconst_1        
	//   62  107:iadd            
	//   63  108:fload           9
	//   64  110:fload           4
	//   65  112:fmul            
	//   66  113:fastore         
		}

	//   67  114:iload           10
	//   68  116:iconst_2        
	//   69  117:iadd            
	//   70  118:istore          10
	//*  71  120:goto            27
		getValueToPixelMatrix().mapPoints(af);
	//   72  123:aload_0         
	//   73  124:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//   74  127:aload           13
	//   75  129:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		return af;
	//   76  132:aload           13
	//   77  134:areturn         
	}

	public float[] generateTransformedValuesBubble(IBubbleDataSet ibubbledataset, float f, float f1, int i, int j)
	{
		int k = (int)Math.ceil(j - i) * 2;
	//    0    0:iload           5
	//    1    2:iload           4
	//    2    4:isub            
	//    3    5:i2d             
	//    4    6:invokestatic    #75  <Method double Math.ceil(double)>
	//    5    9:d2i             
	//    6   10:iconst_2        
	//    7   11:imul            
	//    8   12:istore          6
		float af[] = new float[k];
	//    9   14:iload           6
	//   10   16:newarray        float[]
	//   11   18:astore          7
		for(j = 0; j < k; j += 2)
	//*  12   20:iconst_0        
	//*  13   21:istore          5
	//*  14   23:iload           5
	//*  15   25:iload           6
	//*  16   27:icmpge          93
		{
			Entry entry = ibubbledataset.getEntryForIndex(j / 2 + i);
	//   17   30:aload_1         
	//   18   31:iload           5
	//   19   33:iconst_2        
	//   20   34:idiv            
	//   21   35:iload           4
	//   22   37:iadd            
	//   23   38:invokeinterface #78  <Method Entry IBubbleDataSet.getEntryForIndex(int)>
	//   24   43:astore          8
			if(entry != null)
	//*  25   45:aload           8
	//*  26   47:ifnull          84
			{
				af[j] = (float)(entry.getXIndex() - i) * f + (float)i;
	//   27   50:aload           7
	//   28   52:iload           5
	//   29   54:aload           8
	//   30   56:invokevirtual   #56  <Method int Entry.getXIndex()>
	//   31   59:iload           4
	//   32   61:isub            
	//   33   62:i2f             
	//   34   63:fload_2         
	//   35   64:fmul            
	//   36   65:iload           4
	//   37   67:i2f             
	//   38   68:fadd            
	//   39   69:fastore         
				af[j + 1] = entry.getVal() * f1;
	//   40   70:aload           7
	//   41   72:iload           5
	//   42   74:iconst_1        
	//   43   75:iadd            
	//   44   76:aload           8
	//   45   78:invokevirtual   #59  <Method float Entry.getVal()>
	//   46   81:fload_3         
	//   47   82:fmul            
	//   48   83:fastore         
			}
		}

	//   49   84:iload           5
	//   50   86:iconst_2        
	//   51   87:iadd            
	//   52   88:istore          5
	//*  53   90:goto            23
		getValueToPixelMatrix().mapPoints(af);
	//   54   93:aload_0         
	//   55   94:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//   56   97:aload           7
	//   57   99:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		return af;
	//   58  102:aload           7
	//   59  104:areturn         
	}

	public float[] generateTransformedValuesCandle(ICandleDataSet icandledataset, float f, float f1, int i, int j)
	{
		int k = (int)Math.ceil((float)(j - i) * f) * 2;
	//    0    0:iload           5
	//    1    2:iload           4
	//    2    4:isub            
	//    3    5:i2f             
	//    4    6:fload_2         
	//    5    7:fmul            
	//    6    8:f2d             
	//    7    9:invokestatic    #75  <Method double Math.ceil(double)>
	//    8   12:d2i             
	//    9   13:iconst_2        
	//   10   14:imul            
	//   11   15:istore          6
		float af[] = new float[k];
	//   12   17:iload           6
	//   13   19:newarray        float[]
	//   14   21:astore          7
		for(j = 0; j < k; j += 2)
	//*  15   23:iconst_0        
	//*  16   24:istore          5
	//*  17   26:iload           5
	//*  18   28:iload           6
	//*  19   30:icmpge          90
		{
			CandleEntry candleentry = (CandleEntry)icandledataset.getEntryForIndex(j / 2 + i);
	//   20   33:aload_1         
	//   21   34:iload           5
	//   22   36:iconst_2        
	//   23   37:idiv            
	//   24   38:iload           4
	//   25   40:iadd            
	//   26   41:invokeinterface #83  <Method Entry ICandleDataSet.getEntryForIndex(int)>
	//   27   46:checkcast       #85  <Class CandleEntry>
	//   28   49:astore          8
			if(candleentry != null)
	//*  29   51:aload           8
	//*  30   53:ifnull          81
			{
				af[j] = candleentry.getXIndex();
	//   31   56:aload           7
	//   32   58:iload           5
	//   33   60:aload           8
	//   34   62:invokevirtual   #86  <Method int CandleEntry.getXIndex()>
	//   35   65:i2f             
	//   36   66:fastore         
				af[j + 1] = candleentry.getHigh() * f1;
	//   37   67:aload           7
	//   38   69:iload           5
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:aload           8
	//   42   75:invokevirtual   #89  <Method float CandleEntry.getHigh()>
	//   43   78:fload_3         
	//   44   79:fmul            
	//   45   80:fastore         
			}
		}

	//   46   81:iload           5
	//   47   83:iconst_2        
	//   48   84:iadd            
	//   49   85:istore          5
	//*  50   87:goto            26
		getValueToPixelMatrix().mapPoints(af);
	//   51   90:aload_0         
	//   52   91:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//   53   94:aload           7
	//   54   96:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		return af;
	//   55   99:aload           7
	//   56  101:areturn         
	}

	public float[] generateTransformedValuesHorizontalBarChart(IBarDataSet ibardataset, int i, BarData bardata, float f)
	{
		float af[] = new float[ibardataset.getEntryCount() * 2];
	//    0    0:aload_1         
	//    1    1:invokeinterface #38  <Method int IBarDataSet.getEntryCount()>
	//    2    6:iconst_2        
	//    3    7:imul            
	//    4    8:newarray        float[]
	//    5   10:astore          12
		int k = bardata.getDataSetCount();
	//    6   12:aload_3         
	//    7   13:invokevirtual   #43  <Method int BarData.getDataSetCount()>
	//    8   16:istore          10
		float f1 = bardata.getGroupSpace();
	//    9   18:aload_3         
	//   10   19:invokevirtual   #47  <Method float BarData.getGroupSpace()>
	//   11   22:fstore          5
		for(int j = 0; j < af.length; j += 2)
	//*  12   24:iconst_0        
	//*  13   25:istore          9
	//*  14   27:iload           9
	//*  15   29:aload           12
	//*  16   31:arraylength     
	//*  17   32:icmpge          117
		{
			bardata = ((BarData) (ibardataset.getEntryForIndex(j / 2)));
	//   18   35:aload_1         
	//   19   36:iload           9
	//   20   38:iconst_2        
	//   21   39:idiv            
	//   22   40:invokeinterface #51  <Method Entry IBarDataSet.getEntryForIndex(int)>
	//   23   45:astore_3        
			int l = ((Entry) (bardata)).getXIndex();
	//   24   46:aload_3         
	//   25   47:invokevirtual   #56  <Method int Entry.getXIndex()>
	//   26   50:istore          11
			float f2 = (k - 1) * l + l + i;
	//   27   52:iload           10
	//   28   54:iconst_1        
	//   29   55:isub            
	//   30   56:iload           11
	//   31   58:imul            
	//   32   59:iload           11
	//   33   61:iadd            
	//   34   62:iload_2         
	//   35   63:iadd            
	//   36   64:i2f             
	//   37   65:fstore          6
			float f3 = l;
	//   38   67:iload           11
	//   39   69:i2f             
	//   40   70:fstore          7
			float f4 = f1 / 2.0F;
	//   41   72:fload           5
	//   42   74:fconst_2        
	//   43   75:fdiv            
	//   44   76:fstore          8
			af[j] = ((Entry) (bardata)).getVal() * f;
	//   45   78:aload           12
	//   46   80:iload           9
	//   47   82:aload_3         
	//   48   83:invokevirtual   #59  <Method float Entry.getVal()>
	//   49   86:fload           4
	//   50   88:fmul            
	//   51   89:fastore         
			af[j + 1] = f2 + f3 * f1 + f4;
	//   52   90:aload           12
	//   53   92:iload           9
	//   54   94:iconst_1        
	//   55   95:iadd            
	//   56   96:fload           6
	//   57   98:fload           7
	//   58  100:fload           5
	//   59  102:fmul            
	//   60  103:fadd            
	//   61  104:fload           8
	//   62  106:fadd            
	//   63  107:fastore         
		}

	//   64  108:iload           9
	//   65  110:iconst_2        
	//   66  111:iadd            
	//   67  112:istore          9
	//*  68  114:goto            27
		getValueToPixelMatrix().mapPoints(af);
	//   69  117:aload_0         
	//   70  118:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//   71  121:aload           12
	//   72  123:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		return af;
	//   73  126:aload           12
	//   74  128:areturn         
	}

	public float[] generateTransformedValuesLine(ILineDataSet ilinedataset, float f, float f1, int i, int j)
	{
		int k = (int)Math.ceil((float)(j - i) * f) * 2;
	//    0    0:iload           5
	//    1    2:iload           4
	//    2    4:isub            
	//    3    5:i2f             
	//    4    6:fload_2         
	//    5    7:fmul            
	//    6    8:f2d             
	//    7    9:invokestatic    #75  <Method double Math.ceil(double)>
	//    8   12:d2i             
	//    9   13:iconst_2        
	//   10   14:imul            
	//   11   15:istore          6
		float af[] = new float[k];
	//   12   17:iload           6
	//   13   19:newarray        float[]
	//   14   21:astore          7
		for(j = 0; j < k; j += 2)
	//*  15   23:iconst_0        
	//*  16   24:istore          5
	//*  17   26:iload           5
	//*  18   28:iload           6
	//*  19   30:icmpge          87
		{
			Entry entry = ilinedataset.getEntryForIndex(j / 2 + i);
	//   20   33:aload_1         
	//   21   34:iload           5
	//   22   36:iconst_2        
	//   23   37:idiv            
	//   24   38:iload           4
	//   25   40:iadd            
	//   26   41:invokeinterface #95  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   27   46:astore          8
			if(entry != null)
	//*  28   48:aload           8
	//*  29   50:ifnull          78
			{
				af[j] = entry.getXIndex();
	//   30   53:aload           7
	//   31   55:iload           5
	//   32   57:aload           8
	//   33   59:invokevirtual   #56  <Method int Entry.getXIndex()>
	//   34   62:i2f             
	//   35   63:fastore         
				af[j + 1] = entry.getVal() * f1;
	//   36   64:aload           7
	//   37   66:iload           5
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:aload           8
	//   41   72:invokevirtual   #59  <Method float Entry.getVal()>
	//   42   75:fload_3         
	//   43   76:fmul            
	//   44   77:fastore         
			}
		}

	//   45   78:iload           5
	//   46   80:iconst_2        
	//   47   81:iadd            
	//   48   82:istore          5
	//*  49   84:goto            26
		getValueToPixelMatrix().mapPoints(af);
	//   50   87:aload_0         
	//   51   88:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//   52   91:aload           7
	//   53   93:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		return af;
	//   54   96:aload           7
	//   55   98:areturn         
	}

	public float[] generateTransformedValuesScatter(IScatterDataSet iscatterdataset, float f)
	{
		float af[] = new float[iscatterdataset.getEntryCount() * 2];
	//    0    0:aload_1         
	//    1    1:invokeinterface #100 <Method int IScatterDataSet.getEntryCount()>
	//    2    6:iconst_2        
	//    3    7:imul            
	//    4    8:newarray        float[]
	//    5   10:astore          4
		for(int i = 0; i < af.length; i += 2)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:aload           4
	//*  10   17:arraylength     
	//*  11   18:icmpge          67
		{
			Entry entry = iscatterdataset.getEntryForIndex(i / 2);
	//   12   21:aload_1         
	//   13   22:iload_3         
	//   14   23:iconst_2        
	//   15   24:idiv            
	//   16   25:invokeinterface #101 <Method Entry IScatterDataSet.getEntryForIndex(int)>
	//   17   30:astore          5
			if(entry != null)
	//*  18   32:aload           5
	//*  19   34:ifnull          60
			{
				af[i] = entry.getXIndex();
	//   20   37:aload           4
	//   21   39:iload_3         
	//   22   40:aload           5
	//   23   42:invokevirtual   #56  <Method int Entry.getXIndex()>
	//   24   45:i2f             
	//   25   46:fastore         
				af[i + 1] = entry.getVal() * f;
	//   26   47:aload           4
	//   27   49:iload_3         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:aload           5
	//   31   54:invokevirtual   #59  <Method float Entry.getVal()>
	//   32   57:fload_2         
	//   33   58:fmul            
	//   34   59:fastore         
			}
		}

	//   35   60:iload_3         
	//   36   61:iconst_2        
	//   37   62:iadd            
	//   38   63:istore_3        
	//*  39   64:goto            14
		getValueToPixelMatrix().mapPoints(af);
	//   40   67:aload_0         
	//   41   68:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//   42   71:aload           4
	//   43   73:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		return af;
	//   44   76:aload           4
	//   45   78:areturn         
	}

	public Matrix getOffsetMatrix()
	{
		return mMatrixOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Matrix mMatrixOffset>
	//    2    4:areturn         
	}

	public Matrix getPixelToValueMatrix()
	{
		getValueToPixelMatrix().invert(mMBuffer2);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Matrix mMBuffer2>
	//    4    8:invokevirtual   #107 <Method boolean Matrix.invert(Matrix)>
	//    5   11:pop             
		return mMBuffer2;
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Matrix mMBuffer2>
	//    8   16:areturn         
	}

	public Matrix getValueMatrix()
	{
		return mMatrixValueToPx;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Matrix mMatrixValueToPx>
	//    2    4:areturn         
	}

	public Matrix getValueToPixelMatrix()
	{
		mMBuffer1.set(mMatrixValueToPx);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Matrix mMBuffer1>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Matrix mMatrixValueToPx>
	//    4    8:invokevirtual   #112 <Method void Matrix.set(Matrix)>
		mMBuffer1.postConcat(mViewPortHandler.mMatrixTouch);
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field Matrix mMBuffer1>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    9   19:getfield        #117 <Field Matrix ViewPortHandler.mMatrixTouch>
	//   10   22:invokevirtual   #120 <Method boolean Matrix.postConcat(Matrix)>
	//   11   25:pop             
		mMBuffer1.postConcat(mMatrixOffset);
	//   12   26:aload_0         
	//   13   27:getfield        #25  <Field Matrix mMBuffer1>
	//   14   30:aload_0         
	//   15   31:getfield        #23  <Field Matrix mMatrixOffset>
	//   16   34:invokevirtual   #120 <Method boolean Matrix.postConcat(Matrix)>
	//   17   37:pop             
		return mMBuffer1;
	//   18   38:aload_0         
	//   19   39:getfield        #25  <Field Matrix mMBuffer1>
	//   20   42:areturn         
	}

	public PointD getValuesByTouchPoint(float f, float f1)
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore_3        
		af[0] = f;
	//    3    4:aload_3         
	//    4    5:iconst_0        
	//    5    6:fload_1         
	//    6    7:fastore         
		af[1] = f1;
	//    7    8:aload_3         
	//    8    9:iconst_1        
	//    9   10:fload_2         
	//   10   11:fastore         
		pixelsToValue(af);
	//   11   12:aload_0         
	//   12   13:aload_3         
	//   13   14:invokevirtual   #125 <Method void pixelsToValue(float[])>
		return new PointD(af[0], af[1]);
	//   14   17:new             #127 <Class PointD>
	//   15   20:dup             
	//   16   21:aload_3         
	//   17   22:iconst_0        
	//   18   23:faload          
	//   19   24:f2d             
	//   20   25:aload_3         
	//   21   26:iconst_1        
	//   22   27:faload          
	//   23   28:f2d             
	//   24   29:invokespecial   #130 <Method void PointD(double, double)>
	//   25   32:areturn         
	}

	public void pathValueToPixel(Path path)
	{
		path.transform(mMatrixValueToPx);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field Matrix mMatrixValueToPx>
	//    3    5:invokevirtual   #137 <Method void Path.transform(Matrix)>
		path.transform(mViewPortHandler.getMatrixTouch());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokevirtual   #140 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//    8   16:invokevirtual   #137 <Method void Path.transform(Matrix)>
		path.transform(mMatrixOffset);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field Matrix mMatrixOffset>
	//   12   24:invokevirtual   #137 <Method void Path.transform(Matrix)>
	//   13   27:return          
	}

	public void pathValuesToPixel(List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #147 <Method int List.size()>
	//*   5    9:icmpge          33
			pathValueToPixel((Path)list.get(i));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokeinterface #151 <Method Object List.get(int)>
	//   10   20:checkcast       #134 <Class Path>
	//   11   23:invokevirtual   #153 <Method void pathValueToPixel(Path)>

	//   12   26:iload_2         
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:istore_2        
	//*  16   30:goto            2
	//   17   33:return          
	}

	public void pixelsToValue(float af[])
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #18  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Matrix()>
	//    3    7:astore_2        
		mMatrixOffset.invert(matrix);
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field Matrix mMatrixOffset>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #107 <Method boolean Matrix.invert(Matrix)>
	//    8   16:pop             
		matrix.mapPoints(af);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		mViewPortHandler.getMatrixTouch().invert(matrix);
	//   12   22:aload_0         
	//   13   23:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   14   26:invokevirtual   #140 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #107 <Method boolean Matrix.invert(Matrix)>
	//   17   33:pop             
		matrix.mapPoints(af);
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		mMatrixValueToPx.invert(matrix);
	//   21   39:aload_0         
	//   22   40:getfield        #21  <Field Matrix mMatrixValueToPx>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #107 <Method boolean Matrix.invert(Matrix)>
	//   25   47:pop             
		matrix.mapPoints(af);
	//   26   48:aload_2         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
	//   29   53:return          
	}

	public void pointValuesToPixel(float af[])
	{
		mMatrixValueToPx.mapPoints(af);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Matrix mMatrixValueToPx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		mViewPortHandler.getMatrixTouch().mapPoints(af);
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    6   12:invokevirtual   #140 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
		mMatrixOffset.mapPoints(af);
	//    9   19:aload_0         
	//   10   20:getfield        #23  <Field Matrix mMatrixOffset>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #67  <Method void Matrix.mapPoints(float[])>
	//   13   27:return          
	}

	public void prepareMatrixOffset(boolean flag)
	{
		mMatrixOffset.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Matrix mMatrixOffset>
	//    2    4:invokevirtual   #161 <Method void Matrix.reset()>
		if(!flag)
	//*   3    7:iload_1         
	//*   4    8:ifne            42
		{
			mMatrixOffset.postTranslate(mViewPortHandler.offsetLeft(), mViewPortHandler.getChartHeight() - mViewPortHandler.offsetBottom());
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field Matrix mMatrixOffset>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    9   19:invokevirtual   #164 <Method float ViewPortHandler.offsetLeft()>
	//   10   22:aload_0         
	//   11   23:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   12   26:invokevirtual   #167 <Method float ViewPortHandler.getChartHeight()>
	//   13   29:aload_0         
	//   14   30:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   15   33:invokevirtual   #170 <Method float ViewPortHandler.offsetBottom()>
	//   16   36:fsub            
	//   17   37:invokevirtual   #174 <Method boolean Matrix.postTranslate(float, float)>
	//   18   40:pop             
			return;
	//   19   41:return          
		} else
		{
			mMatrixOffset.setTranslate(mViewPortHandler.offsetLeft(), -mViewPortHandler.offsetTop());
	//   20   42:aload_0         
	//   21   43:getfield        #23  <Field Matrix mMatrixOffset>
	//   22   46:aload_0         
	//   23   47:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   24   50:invokevirtual   #164 <Method float ViewPortHandler.offsetLeft()>
	//   25   53:aload_0         
	//   26   54:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   27   57:invokevirtual   #177 <Method float ViewPortHandler.offsetTop()>
	//   28   60:fneg            
	//   29   61:invokevirtual   #181 <Method void Matrix.setTranslate(float, float)>
			mMatrixOffset.postScale(1.0F, -1F);
	//   30   64:aload_0         
	//   31   65:getfield        #23  <Field Matrix mMatrixOffset>
	//   32   68:fconst_1        
	//   33   69:ldc1            #182 <Float -1F>
	//   34   71:invokevirtual   #185 <Method boolean Matrix.postScale(float, float)>
	//   35   74:pop             
			return;
	//   36   75:return          
		}
	}

	public void prepareMatrixValuePx(float f, float f1, float f2, float f3)
	{
		float f5 = mViewPortHandler.contentWidth() / f1;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #190 <Method float ViewPortHandler.contentWidth()>
	//    3    7:fload_2         
	//    4    8:fdiv            
	//    5    9:fstore          6
		float f4 = mViewPortHandler.contentHeight() / f2;
	//    6   11:aload_0         
	//    7   12:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    8   15:invokevirtual   #193 <Method float ViewPortHandler.contentHeight()>
	//    9   18:fload_3         
	//   10   19:fdiv            
	//   11   20:fstore          5
		f1 = f5;
	//   12   22:fload           6
	//   13   24:fstore_2        
		if(Float.isInfinite(f5))
	//*  14   25:fload           6
	//*  15   27:invokestatic    #199 <Method boolean Float.isInfinite(float)>
	//*  16   30:ifeq            35
			f1 = 0.0F;
	//   17   33:fconst_0        
	//   18   34:fstore_2        
		f2 = f4;
	//   19   35:fload           5
	//   20   37:fstore_3        
		if(Float.isInfinite(f4))
	//*  21   38:fload           5
	//*  22   40:invokestatic    #199 <Method boolean Float.isInfinite(float)>
	//*  23   43:ifeq            48
			f2 = 0.0F;
	//   24   46:fconst_0        
	//   25   47:fstore_3        
		mMatrixValueToPx.reset();
	//   26   48:aload_0         
	//   27   49:getfield        #21  <Field Matrix mMatrixValueToPx>
	//   28   52:invokevirtual   #161 <Method void Matrix.reset()>
		mMatrixValueToPx.postTranslate(-f, -f3);
	//   29   55:aload_0         
	//   30   56:getfield        #21  <Field Matrix mMatrixValueToPx>
	//   31   59:fload_1         
	//   32   60:fneg            
	//   33   61:fload           4
	//   34   63:fneg            
	//   35   64:invokevirtual   #174 <Method boolean Matrix.postTranslate(float, float)>
	//   36   67:pop             
		mMatrixValueToPx.postScale(f1, -f2);
	//   37   68:aload_0         
	//   38   69:getfield        #21  <Field Matrix mMatrixValueToPx>
	//   39   72:fload_2         
	//   40   73:fload_3         
	//   41   74:fneg            
	//   42   75:invokevirtual   #185 <Method boolean Matrix.postScale(float, float)>
	//   43   78:pop             
	//   44   79:return          
	}

	public void rectValueToPixel(RectF rectf)
	{
		mMatrixValueToPx.mapRect(rectf);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Matrix mMatrixValueToPx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//    4    8:pop             
		mViewPortHandler.getMatrixTouch().mapRect(rectf);
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokevirtual   #140 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   10   20:pop             
		mMatrixOffset.mapRect(rectf);
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field Matrix mMatrixOffset>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   15   29:pop             
	//   16   30:return          
	}

	public void rectValueToPixel(RectF rectf, float f)
	{
		rectf.top = rectf.top * f;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #212 <Field float RectF.top>
	//    3    5:fload_2         
	//    4    6:fmul            
	//    5    7:putfield        #212 <Field float RectF.top>
		rectf.bottom = rectf.bottom * f;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #215 <Field float RectF.bottom>
	//    9   15:fload_2         
	//   10   16:fmul            
	//   11   17:putfield        #215 <Field float RectF.bottom>
		mMatrixValueToPx.mapRect(rectf);
	//   12   20:aload_0         
	//   13   21:getfield        #21  <Field Matrix mMatrixValueToPx>
	//   14   24:aload_1         
	//   15   25:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   16   28:pop             
		mViewPortHandler.getMatrixTouch().mapRect(rectf);
	//   17   29:aload_0         
	//   18   30:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   19   33:invokevirtual   #140 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   22   40:pop             
		mMatrixOffset.mapRect(rectf);
	//   23   41:aload_0         
	//   24   42:getfield        #23  <Field Matrix mMatrixOffset>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   27   49:pop             
	//   28   50:return          
	}

	public void rectValueToPixelHorizontal(RectF rectf)
	{
		mMatrixValueToPx.mapRect(rectf);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Matrix mMatrixValueToPx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//    4    8:pop             
		mViewPortHandler.getMatrixTouch().mapRect(rectf);
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokevirtual   #140 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   10   20:pop             
		mMatrixOffset.mapRect(rectf);
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field Matrix mMatrixOffset>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   15   29:pop             
	//   16   30:return          
	}

	public void rectValueToPixelHorizontal(RectF rectf, float f)
	{
		rectf.left = rectf.left * f;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #219 <Field float RectF.left>
	//    3    5:fload_2         
	//    4    6:fmul            
	//    5    7:putfield        #219 <Field float RectF.left>
		rectf.right = rectf.right * f;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #222 <Field float RectF.right>
	//    9   15:fload_2         
	//   10   16:fmul            
	//   11   17:putfield        #222 <Field float RectF.right>
		mMatrixValueToPx.mapRect(rectf);
	//   12   20:aload_0         
	//   13   21:getfield        #21  <Field Matrix mMatrixValueToPx>
	//   14   24:aload_1         
	//   15   25:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   16   28:pop             
		mViewPortHandler.getMatrixTouch().mapRect(rectf);
	//   17   29:aload_0         
	//   18   30:getfield        #29  <Field ViewPortHandler mViewPortHandler>
	//   19   33:invokevirtual   #140 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   22   40:pop             
		mMatrixOffset.mapRect(rectf);
	//   23   41:aload_0         
	//   24   42:getfield        #23  <Field Matrix mMatrixOffset>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   27   49:pop             
	//   28   50:return          
	}

	public void rectValuesToPixel(List list)
	{
		Matrix matrix = getValueToPixelMatrix();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Matrix getValueToPixelMatrix()>
	//    2    4:astore_3        
		for(int i = 0; i < list.size(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_1         
	//*   7    9:invokeinterface #147 <Method int List.size()>
	//*   8   14:icmpge          39
			matrix.mapRect((RectF)list.get(i));
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:invokeinterface #151 <Method Object List.get(int)>
	//   13   25:checkcast       #208 <Class RectF>
	//   14   28:invokevirtual   #205 <Method boolean Matrix.mapRect(RectF)>
	//   15   31:pop             

	//   16   32:iload_2         
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:istore_2        
	//*  20   36:goto            7
	//   21   39:return          
	}

	private Matrix mMBuffer1;
	private Matrix mMBuffer2;
	protected Matrix mMatrixOffset;
	protected Matrix mMatrixValueToPx;
	protected ViewPortHandler mViewPortHandler;
}
