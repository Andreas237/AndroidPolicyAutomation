// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

// Referenced classes of package com.github.mikephil.charting.buffer:
//			AbstractBuffer

public class CircleBuffer extends AbstractBuffer
{

	public CircleBuffer(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #9   <Method void AbstractBuffer(int)>
	//    3    5:return          
	}

	protected void addCircle(float f, float f1)
	{
		float af[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float[] buffer>
	//    2    4:astore          4
		int i = index;
	//    3    6:aload_0         
	//    4    7:getfield        #20  <Field int index>
	//    5   10:istore_3        
		index = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #20  <Field int index>
		af[i] = f;
	//   11   18:aload           4
	//   12   20:iload_3         
	//   13   21:fload_1         
	//   14   22:fastore         
		af = buffer;
	//   15   23:aload_0         
	//   16   24:getfield        #16  <Field float[] buffer>
	//   17   27:astore          4
		i = index;
	//   18   29:aload_0         
	//   19   30:getfield        #20  <Field int index>
	//   20   33:istore_3        
		index = i + 1;
	//   21   34:aload_0         
	//   22   35:iload_3         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:putfield        #20  <Field int index>
		af[i] = f1;
	//   26   41:aload           4
	//   27   43:iload_3         
	//   28   44:fload_2         
	//   29   45:fastore         
	//   30   46:return          
	}

	public void feed(ILineDataSet ilinedataset)
	{
		int j = (int)Math.ceil((float)(mTo - mFrom) * phaseX + (float)mFrom);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mTo>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field int mFrom>
	//    4    8:isub            
	//    5    9:i2f             
	//    6   10:aload_0         
	//    7   11:getfield        #32  <Field float phaseX>
	//    8   14:fmul            
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field int mFrom>
	//   11   19:i2f             
	//   12   20:fadd            
	//   13   21:f2d             
	//   14   22:invokestatic    #38  <Method double Math.ceil(double)>
	//   15   25:d2i             
	//   16   26:istore_3        
		for(int i = mFrom; i < j; i++)
	//*  17   27:aload_0         
	//*  18   28:getfield        #28  <Field int mFrom>
	//*  19   31:istore_2        
	//*  20   32:iload_2         
	//*  21   33:iload_3         
	//*  22   34:icmpge          73
		{
			Entry entry = ilinedataset.getEntryForIndex(i);
	//   23   37:aload_1         
	//   24   38:iload_2         
	//   25   39:invokeinterface #44  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   26   44:astore          4
			addCircle(entry.getXIndex(), entry.getVal() * phaseY);
	//   27   46:aload_0         
	//   28   47:aload           4
	//   29   49:invokevirtual   #50  <Method int Entry.getXIndex()>
	//   30   52:i2f             
	//   31   53:aload           4
	//   32   55:invokevirtual   #54  <Method float Entry.getVal()>
	//   33   58:aload_0         
	//   34   59:getfield        #57  <Field float phaseY>
	//   35   62:fmul            
	//   36   63:invokevirtual   #59  <Method void addCircle(float, float)>
		}

	//   37   66:iload_2         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_2        
	//*  41   70:goto            32
		reset();
	//   42   73:aload_0         
	//   43   74:invokevirtual   #63  <Method void reset()>
	//   44   77:return          
	}

	public volatile void feed(Object obj)
	{
		feed((ILineDataSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class ILineDataSet>
	//    3    5:invokevirtual   #66  <Method void feed(ILineDataSet)>
	//    4    8:return          
	}
}
