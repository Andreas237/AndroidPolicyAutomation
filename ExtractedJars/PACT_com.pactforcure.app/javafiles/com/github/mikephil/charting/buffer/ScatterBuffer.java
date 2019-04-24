// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;

// Referenced classes of package com.github.mikephil.charting.buffer:
//			AbstractBuffer

public class ScatterBuffer extends AbstractBuffer
{

	public ScatterBuffer(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #9   <Method void AbstractBuffer(int)>
	//    3    5:return          
	}

	protected void addForm(float f, float f1)
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

	public void feed(IScatterDataSet iscatterdataset)
	{
		float f = iscatterdataset.getEntryCount();
	//    0    0:aload_1         
	//    1    1:invokeinterface #28  <Method int IScatterDataSet.getEntryCount()>
	//    2    6:i2f             
	//    3    7:fstore_2        
		float f1 = phaseX;
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field float phaseX>
	//    6   12:fstore_3        
		for(int i = 0; (float)i < f * f1; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore          4
	//*   9   16:iload           4
	//*  10   18:i2f             
	//*  11   19:fload_2         
	//*  12   20:fload_3         
	//*  13   21:fmul            
	//*  14   22:fcmpg           
	//*  15   23:ifge            65
		{
			Entry entry = iscatterdataset.getEntryForIndex(i);
	//   16   26:aload_1         
	//   17   27:iload           4
	//   18   29:invokeinterface #36  <Method Entry IScatterDataSet.getEntryForIndex(int)>
	//   19   34:astore          5
			addForm(entry.getXIndex(), entry.getVal() * phaseY);
	//   20   36:aload_0         
	//   21   37:aload           5
	//   22   39:invokevirtual   #41  <Method int Entry.getXIndex()>
	//   23   42:i2f             
	//   24   43:aload           5
	//   25   45:invokevirtual   #45  <Method float Entry.getVal()>
	//   26   48:aload_0         
	//   27   49:getfield        #48  <Field float phaseY>
	//   28   52:fmul            
	//   29   53:invokevirtual   #50  <Method void addForm(float, float)>
		}

	//   30   56:iload           4
	//   31   58:iconst_1        
	//   32   59:iadd            
	//   33   60:istore          4
	//*  34   62:goto            16
		reset();
	//   35   65:aload_0         
	//   36   66:invokevirtual   #54  <Method void reset()>
	//   37   69:return          
	}

	public volatile void feed(Object obj)
	{
		feed((IScatterDataSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class IScatterDataSet>
	//    3    5:invokevirtual   #57  <Method void feed(IScatterDataSet)>
	//    4    8:return          
	}
}
