// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

// Referenced classes of package com.github.mikephil.charting.buffer:
//			AbstractBuffer

public class LineBuffer extends AbstractBuffer
{

	public LineBuffer(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 4)
	//*   2    2:iload_1         
	//*   3    3:iconst_4        
	//*   4    4:icmpge          9
			j = 4;
	//    5    7:iconst_4        
	//    6    8:istore_2        
		super(j);
	//    7    9:aload_0         
	//    8   10:iload_2         
	//    9   11:invokespecial   #9   <Method void AbstractBuffer(int)>
	//   10   14:return          
	}

	public void feed(ILineDataSet ilinedataset)
	{
		moveTo(ilinedataset.getEntryForIndex(mFrom).getXIndex(), ilinedataset.getEntryForIndex(mFrom).getVal() * phaseY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field int mFrom>
	//    4    6:invokeinterface #22  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//    5   11:invokevirtual   #28  <Method int Entry.getXIndex()>
	//    6   14:i2f             
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #16  <Field int mFrom>
	//   10   20:invokeinterface #22  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   11   25:invokevirtual   #32  <Method float Entry.getVal()>
	//   12   28:aload_0         
	//   13   29:getfield        #36  <Field float phaseY>
	//   14   32:fmul            
	//   15   33:invokevirtual   #40  <Method void moveTo(float, float)>
		int j = (int)Math.ceil((float)(mTo - mFrom) * phaseX + (float)mFrom);
	//   16   36:aload_0         
	//   17   37:getfield        #43  <Field int mTo>
	//   18   40:aload_0         
	//   19   41:getfield        #16  <Field int mFrom>
	//   20   44:isub            
	//   21   45:i2f             
	//   22   46:aload_0         
	//   23   47:getfield        #46  <Field float phaseX>
	//   24   50:fmul            
	//   25   51:aload_0         
	//   26   52:getfield        #16  <Field int mFrom>
	//   27   55:i2f             
	//   28   56:fadd            
	//   29   57:f2d             
	//   30   58:invokestatic    #52  <Method double Math.ceil(double)>
	//   31   61:d2i             
	//   32   62:istore_3        
		for(int i = mFrom + 1; i < j; i++)
	//*  33   63:aload_0         
	//*  34   64:getfield        #16  <Field int mFrom>
	//*  35   67:iconst_1        
	//*  36   68:iadd            
	//*  37   69:istore_2        
	//*  38   70:iload_2         
	//*  39   71:iload_3         
	//*  40   72:icmpge          111
		{
			Entry entry = ilinedataset.getEntryForIndex(i);
	//   41   75:aload_1         
	//   42   76:iload_2         
	//   43   77:invokeinterface #22  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   44   82:astore          4
			lineTo(entry.getXIndex(), entry.getVal() * phaseY);
	//   45   84:aload_0         
	//   46   85:aload           4
	//   47   87:invokevirtual   #28  <Method int Entry.getXIndex()>
	//   48   90:i2f             
	//   49   91:aload           4
	//   50   93:invokevirtual   #32  <Method float Entry.getVal()>
	//   51   96:aload_0         
	//   52   97:getfield        #36  <Field float phaseY>
	//   53  100:fmul            
	//   54  101:invokevirtual   #55  <Method void lineTo(float, float)>
		}

	//   55  104:iload_2         
	//   56  105:iconst_1        
	//   57  106:iadd            
	//   58  107:istore_2        
	//*  59  108:goto            70
		reset();
	//   60  111:aload_0         
	//   61  112:invokevirtual   #59  <Method void reset()>
	//   62  115:return          
	}

	public volatile void feed(Object obj)
	{
		feed((ILineDataSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class ILineDataSet>
	//    3    5:invokevirtual   #62  <Method void feed(ILineDataSet)>
	//    4    8:return          
	}

	public void lineTo(float f, float f1)
	{
		if(index == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int index>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          61
		{
			float af[] = buffer;
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field float[] buffer>
	//    6   12:astore          6
			int i = index;
	//    7   14:aload_0         
	//    8   15:getfield        #65  <Field int index>
	//    9   18:istore          5
			index = i + 1;
	//   10   20:aload_0         
	//   11   21:iload           5
	//   12   23:iconst_1        
	//   13   24:iadd            
	//   14   25:putfield        #65  <Field int index>
			af[i] = f;
	//   15   28:aload           6
	//   16   30:iload           5
	//   17   32:fload_1         
	//   18   33:fastore         
			af = buffer;
	//   19   34:aload_0         
	//   20   35:getfield        #69  <Field float[] buffer>
	//   21   38:astore          6
			i = index;
	//   22   40:aload_0         
	//   23   41:getfield        #65  <Field int index>
	//   24   44:istore          5
			index = i + 1;
	//   25   46:aload_0         
	//   26   47:iload           5
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #65  <Field int index>
			af[i] = f1;
	//   30   54:aload           6
	//   31   56:iload           5
	//   32   58:fload_2         
	//   33   59:fastore         
			return;
	//   34   60:return          
		} else
		{
			float f2 = buffer[index - 2];
	//   35   61:aload_0         
	//   36   62:getfield        #69  <Field float[] buffer>
	//   37   65:aload_0         
	//   38   66:getfield        #65  <Field int index>
	//   39   69:iconst_2        
	//   40   70:isub            
	//   41   71:faload          
	//   42   72:fstore_3        
			float f3 = buffer[index - 1];
	//   43   73:aload_0         
	//   44   74:getfield        #69  <Field float[] buffer>
	//   45   77:aload_0         
	//   46   78:getfield        #65  <Field int index>
	//   47   81:iconst_1        
	//   48   82:isub            
	//   49   83:faload          
	//   50   84:fstore          4
			float af1[] = buffer;
	//   51   86:aload_0         
	//   52   87:getfield        #69  <Field float[] buffer>
	//   53   90:astore          6
			int j = index;
	//   54   92:aload_0         
	//   55   93:getfield        #65  <Field int index>
	//   56   96:istore          5
			index = j + 1;
	//   57   98:aload_0         
	//   58   99:iload           5
	//   59  101:iconst_1        
	//   60  102:iadd            
	//   61  103:putfield        #65  <Field int index>
			af1[j] = f2;
	//   62  106:aload           6
	//   63  108:iload           5
	//   64  110:fload_3         
	//   65  111:fastore         
			af1 = buffer;
	//   66  112:aload_0         
	//   67  113:getfield        #69  <Field float[] buffer>
	//   68  116:astore          6
			j = index;
	//   69  118:aload_0         
	//   70  119:getfield        #65  <Field int index>
	//   71  122:istore          5
			index = j + 1;
	//   72  124:aload_0         
	//   73  125:iload           5
	//   74  127:iconst_1        
	//   75  128:iadd            
	//   76  129:putfield        #65  <Field int index>
			af1[j] = f3;
	//   77  132:aload           6
	//   78  134:iload           5
	//   79  136:fload           4
	//   80  138:fastore         
			af1 = buffer;
	//   81  139:aload_0         
	//   82  140:getfield        #69  <Field float[] buffer>
	//   83  143:astore          6
			j = index;
	//   84  145:aload_0         
	//   85  146:getfield        #65  <Field int index>
	//   86  149:istore          5
			index = j + 1;
	//   87  151:aload_0         
	//   88  152:iload           5
	//   89  154:iconst_1        
	//   90  155:iadd            
	//   91  156:putfield        #65  <Field int index>
			af1[j] = f;
	//   92  159:aload           6
	//   93  161:iload           5
	//   94  163:fload_1         
	//   95  164:fastore         
			af1 = buffer;
	//   96  165:aload_0         
	//   97  166:getfield        #69  <Field float[] buffer>
	//   98  169:astore          6
			j = index;
	//   99  171:aload_0         
	//  100  172:getfield        #65  <Field int index>
	//  101  175:istore          5
			index = j + 1;
	//  102  177:aload_0         
	//  103  178:iload           5
	//  104  180:iconst_1        
	//  105  181:iadd            
	//  106  182:putfield        #65  <Field int index>
			af1[j] = f1;
	//  107  185:aload           6
	//  108  187:iload           5
	//  109  189:fload_2         
	//  110  190:fastore         
			return;
	//  111  191:return          
		}
	}

	public void moveTo(float f, float f1)
	{
		if(index != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int index>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			float af[] = buffer;
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field float[] buffer>
	//    6   12:astore          4
			int i = index;
	//    7   14:aload_0         
	//    8   15:getfield        #65  <Field int index>
	//    9   18:istore_3        
			index = i + 1;
	//   10   19:aload_0         
	//   11   20:iload_3         
	//   12   21:iconst_1        
	//   13   22:iadd            
	//   14   23:putfield        #65  <Field int index>
			af[i] = f;
	//   15   26:aload           4
	//   16   28:iload_3         
	//   17   29:fload_1         
	//   18   30:fastore         
			af = buffer;
	//   19   31:aload_0         
	//   20   32:getfield        #69  <Field float[] buffer>
	//   21   35:astore          4
			i = index;
	//   22   37:aload_0         
	//   23   38:getfield        #65  <Field int index>
	//   24   41:istore_3        
			index = i + 1;
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:putfield        #65  <Field int index>
			af[i] = f1;
	//   30   49:aload           4
	//   31   51:iload_3         
	//   32   52:fload_2         
	//   33   53:fastore         
			buffer[index] = f;
	//   34   54:aload_0         
	//   35   55:getfield        #69  <Field float[] buffer>
	//   36   58:aload_0         
	//   37   59:getfield        #65  <Field int index>
	//   38   62:fload_1         
	//   39   63:fastore         
			buffer[index + 1] = f1;
	//   40   64:aload_0         
	//   41   65:getfield        #69  <Field float[] buffer>
	//   42   68:aload_0         
	//   43   69:getfield        #65  <Field int index>
	//   44   72:iconst_1        
	//   45   73:iadd            
	//   46   74:fload_2         
	//   47   75:fastore         
			return;
	//   48   76:return          
		}
	}
}
