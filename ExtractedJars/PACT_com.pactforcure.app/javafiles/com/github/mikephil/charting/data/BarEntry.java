// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;


// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class BarEntry extends Entry
{

	public BarEntry(float f, int i)
	{
		super(f, i);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void Entry(float, int)>
	//    4    6:return          
	}

	public BarEntry(float f, int i, Object obj)
	{
		super(f, i, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #17  <Method void Entry(float, int, Object)>
	//    5    7:return          
	}

	public BarEntry(float af[], int i)
	{
		super(calcSum(af), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method float calcSum(float[])>
	//    3    5:iload_2         
	//    4    6:invokespecial   #13  <Method void Entry(float, int)>
		mVals = af;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field float[] mVals>
		calcPosNegSum();
	//    8   14:aload_0         
	//    9   15:invokespecial   #28  <Method void calcPosNegSum()>
	//   10   18:return          
	}

	public BarEntry(float af[], int i, String s)
	{
		super(calcSum(af), i, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method float calcSum(float[])>
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #17  <Method void Entry(float, int, Object)>
		mVals = af;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #24  <Field float[] mVals>
		calcPosNegSum();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void calcPosNegSum()>
	//   11   19:return          
	}

	private void calcPosNegSum()
	{
		if(mVals == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field float[] mVals>
	//*   2    4:ifnonnull       18
		{
			mNegativeSum = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #31  <Field float mNegativeSum>
			mPositiveSum = 0.0F;
	//    6   12:aload_0         
	//    7   13:fconst_0        
	//    8   14:putfield        #33  <Field float mPositiveSum>
			return;
	//    9   17:return          
		}
		float f = 0.0F;
	//   10   18:fconst_0        
	//   11   19:fstore_1        
		float f1 = 0.0F;
	//   12   20:fconst_0        
	//   13   21:fstore_2        
		float af[] = mVals;
	//   14   22:aload_0         
	//   15   23:getfield        #24  <Field float[] mVals>
	//   16   26:astore          6
		int j = af.length;
	//   17   28:aload           6
	//   18   30:arraylength     
	//   19   31:istore          5
		int i = 0;
	//   20   33:iconst_0        
	//   21   34:istore          4
		while(i < j) 
	//*  22   36:iload           4
	//*  23   38:iload           5
	//*  24   40:icmpge          78
		{
			float f2 = af[i];
	//   25   43:aload           6
	//   26   45:iload           4
	//   27   47:faload          
	//   28   48:fstore_3        
			if(f2 <= 0.0F)
	//*  29   49:fload_3         
	//*  30   50:fconst_0        
	//*  31   51:fcmpg           
	//*  32   52:ifgt            71
				f += Math.abs(f2);
	//   33   55:fload_1         
	//   34   56:fload_3         
	//   35   57:invokestatic    #39  <Method float Math.abs(float)>
	//   36   60:fadd            
	//   37   61:fstore_1        
			else
	//*  38   62:iload           4
	//*  39   64:iconst_1        
	//*  40   65:iadd            
	//*  41   66:istore          4
	//*  42   68:goto            36
				f1 += f2;
	//   43   71:fload_2         
	//   44   72:fload_3         
	//   45   73:fadd            
	//   46   74:fstore_2        
			i++;
		}
	//*  47   75:goto            62
		mNegativeSum = f;
	//   48   78:aload_0         
	//   49   79:fload_1         
	//   50   80:putfield        #31  <Field float mNegativeSum>
		mPositiveSum = f1;
	//   51   83:aload_0         
	//   52   84:fload_2         
	//   53   85:putfield        #33  <Field float mPositiveSum>
	//   54   88:return          
	}

	private static float calcSum(float af[])
	{
		if(af != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		float f1 = 0.0F;
	//    2    4:fconst_0        
	//    3    5:fstore_2        
_L4:
		return f1;
	//    4    6:fload_2         
	//    5    7:freturn         
_L2:
		float f = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_1        
		int j = af.length;
	//    8   10:aload_0         
	//    9   11:arraylength     
	//   10   12:istore          4
		int i = 0;
	//   11   14:iconst_0        
	//   12   15:istore_3        
		do
		{
			f1 = f;
	//   13   16:fload_1         
	//   14   17:fstore_2        
			if(i >= j)
				continue;
	//   15   18:iload_3         
	//   16   19:iload           4
	//   17   21:icmpge          6
			f += af[i];
	//   18   24:fload_1         
	//   19   25:aload_0         
	//   20   26:iload_3         
	//   21   27:faload          
	//   22   28:fadd            
	//   23   29:fstore_1        
			i++;
	//   24   30:iload_3         
	//   25   31:iconst_1        
	//   26   32:iadd            
	//   27   33:istore_3        
		} while(true);
	//   28   34:goto            16
		if(true) goto _L4; else goto _L3
_L3:
	}

	public BarEntry copy()
	{
		BarEntry barentry = new BarEntry(getVal(), getXIndex(), getData());
	//    0    0:new             #2   <Class BarEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #45  <Method float getVal()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #49  <Method int getXIndex()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #53  <Method Object getData()>
	//    8   16:invokespecial   #54  <Method void BarEntry(float, int, Object)>
	//    9   19:astore_1        
		barentry.setVals(mVals);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #24  <Field float[] mVals>
	//   13   25:invokevirtual   #58  <Method void setVals(float[])>
		return barentry;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method BarEntry copy()>
	//    2    4:areturn         
	}

	public float getBelowSum(int i)
	{
		if(mVals != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float[] mVals>
	//    2    4:ifnonnull       11
_L1:
		float f1 = 0.0F;
	//    3    7:fconst_0        
	//    4    8:fstore_3        
_L4:
		return f1;
	//    5    9:fload_3         
	//    6   10:freturn         
_L2:
		float f;
		int j;
		f = 0.0F;
	//    7   11:fconst_0        
	//    8   12:fstore_2        
		j = mVals.length - 1;
	//    9   13:aload_0         
	//   10   14:getfield        #24  <Field float[] mVals>
	//   11   17:arraylength     
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:istore          4
_L6:
		f1 = f;
	//   15   22:fload_2         
	//   16   23:fstore_3        
		if(j <= i) goto _L4; else goto _L3
	//   17   24:iload           4
	//   18   26:iload_1         
	//   19   27:icmple          9
_L3:
		f1 = f;
	//   20   30:fload_2         
	//   21   31:fstore_3        
		if(j < 0) goto _L4; else goto _L5
	//   22   32:iload           4
	//   23   34:iflt            9
_L5:
		f += mVals[j];
	//   24   37:fload_2         
	//   25   38:aload_0         
	//   26   39:getfield        #24  <Field float[] mVals>
	//   27   42:iload           4
	//   28   44:faload          
	//   29   45:fadd            
	//   30   46:fstore_2        
		j--;
	//   31   47:iload           4
	//   32   49:iconst_1        
	//   33   50:isub            
	//   34   51:istore          4
		  goto _L6
	//*  35   53:goto            22
	}

	public float getNegativeSum()
	{
		return mNegativeSum;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float mNegativeSum>
	//    2    4:freturn         
	}

	public float getPositiveSum()
	{
		return mPositiveSum;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float mPositiveSum>
	//    2    4:freturn         
	}

	public float getVal()
	{
		return super.getVal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method float Entry.getVal()>
	//    2    4:freturn         
	}

	public float[] getVals()
	{
		return mVals;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float[] mVals>
	//    2    4:areturn         
	}

	public boolean isStacked()
	{
		return mVals != null;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float[] mVals>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setVals(float af[])
	{
		setVal(calcSum(af));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method float calcSum(float[])>
	//    3    5:invokevirtual   #74  <Method void setVal(float)>
		mVals = af;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #24  <Field float[] mVals>
		calcPosNegSum();
	//    7   13:aload_0         
	//    8   14:invokespecial   #28  <Method void calcPosNegSum()>
	//    9   17:return          
	}

	private float mNegativeSum;
	private float mPositiveSum;
	private float mVals[];
}
