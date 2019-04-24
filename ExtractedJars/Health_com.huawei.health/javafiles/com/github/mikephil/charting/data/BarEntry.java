// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import o.mp;

// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class BarEntry extends Entry
{

	public BarEntry(float f, float f1)
	{
		super(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #18  <Method void Entry(float, float)>
	//    4    6:return          
	}

	public BarEntry(float f, float f1, Drawable drawable)
	{
		super(f, f1, drawable);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #22  <Method void Entry(float, float, Drawable)>
	//    5    7:return          
	}

	public BarEntry(float f, float f1, Drawable drawable, Object obj)
	{
		super(f, f1, drawable, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #25  <Method void Entry(float, float, Drawable, Object)>
	//    6    9:return          
	}

	public BarEntry(float f, float f1, Object obj)
	{
		super(f, f1, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #28  <Method void Entry(float, float, Object)>
	//    5    7:return          
	}

	public BarEntry(float f, float af[])
	{
		super(f, calcSum(af));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method float calcSum(float[])>
	//    4    6:invokespecial   #18  <Method void Entry(float, float)>
		mYVals = af;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field float[] mYVals>
		calcPosNegSum();
	//    8   14:aload_0         
	//    9   15:invokespecial   #39  <Method void calcPosNegSum()>
		calcRanges();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #42  <Method void calcRanges()>
	//   12   22:return          
	}

	public BarEntry(float f, float af[], Drawable drawable)
	{
		super(f, calcSum(af), drawable);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method float calcSum(float[])>
	//    4    6:aload_3         
	//    5    7:invokespecial   #22  <Method void Entry(float, float, Drawable)>
		mYVals = af;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #35  <Field float[] mYVals>
		calcPosNegSum();
	//    9   15:aload_0         
	//   10   16:invokespecial   #39  <Method void calcPosNegSum()>
		calcRanges();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #42  <Method void calcRanges()>
	//   13   23:return          
	}

	public BarEntry(float f, float af[], Drawable drawable, Object obj)
	{
		super(f, calcSum(af), drawable, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method float calcSum(float[])>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #25  <Method void Entry(float, float, Drawable, Object)>
		mYVals = af;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #35  <Field float[] mYVals>
		calcPosNegSum();
	//   10   17:aload_0         
	//   11   18:invokespecial   #39  <Method void calcPosNegSum()>
		calcRanges();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #42  <Method void calcRanges()>
	//   14   25:return          
	}

	public BarEntry(float f, float af[], Object obj)
	{
		super(f, calcSum(af), obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #33  <Method float calcSum(float[])>
	//    4    6:aload_3         
	//    5    7:invokespecial   #28  <Method void Entry(float, float, Object)>
		mYVals = af;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #35  <Field float[] mYVals>
		calcPosNegSum();
	//    9   15:aload_0         
	//   10   16:invokespecial   #39  <Method void calcPosNegSum()>
		calcRanges();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #42  <Method void calcRanges()>
	//   13   23:return          
	}

	private void calcPosNegSum()
	{
		if(mYVals == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field float[] mYVals>
	//*   2    4:ifnonnull       18
		{
			mNegativeSum = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #47  <Field float mNegativeSum>
			mPositiveSum = 0.0F;
	//    6   12:aload_0         
	//    7   13:fconst_0        
	//    8   14:putfield        #49  <Field float mPositiveSum>
			return;
	//    9   17:return          
		}
		float f1 = 0.0F;
	//   10   18:fconst_0        
	//   11   19:fstore_2        
		float f = 0.0F;
	//   12   20:fconst_0        
	//   13   21:fstore_1        
		float af[] = mYVals;
	//   14   22:aload_0         
	//   15   23:getfield        #35  <Field float[] mYVals>
	//   16   26:astore          6
		int j = af.length;
	//   17   28:aload           6
	//   18   30:arraylength     
	//   19   31:istore          5
		for(int i = 0; i < j; i++)
	//*  20   33:iconst_0        
	//*  21   34:istore          4
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
	//*  32   52:ifgt            65
				f1 += Math.abs(f2);
	//   33   55:fload_2         
	//   34   56:fload_3         
	//   35   57:invokestatic    #55  <Method float Math.abs(float)>
	//   36   60:fadd            
	//   37   61:fstore_2        
			else
	//*  38   62:goto            69
				f += f2;
	//   39   65:fload_1         
	//   40   66:fload_3         
	//   41   67:fadd            
	//   42   68:fstore_1        
		}

	//   43   69:iload           4
	//   44   71:iconst_1        
	//   45   72:iadd            
	//   46   73:istore          4
	//*  47   75:goto            36
		mNegativeSum = f1;
	//   48   78:aload_0         
	//   49   79:fload_2         
	//   50   80:putfield        #47  <Field float mNegativeSum>
		mPositiveSum = f;
	//   51   83:aload_0         
	//   52   84:fload_1         
	//   53   85:putfield        #49  <Field float mPositiveSum>
	//   54   88:return          
	}

	private static float calcSum(float af[])
	{
		if(af == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0.0F;
	//    2    4:fconst_0        
	//    3    5:freturn         
		float f = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore_1        
		int j = af.length;
	//    6    8:aload_0         
	//    7    9:arraylength     
	//    8   10:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   11:iconst_0        
	//*  10   12:istore_2        
	//*  11   13:iload_2         
	//*  12   14:iload_3         
	//*  13   15:icmpge          31
			f += af[i];
	//   14   18:fload_1         
	//   15   19:aload_0         
	//   16   20:iload_2         
	//   17   21:faload          
	//   18   22:fadd            
	//   19   23:fstore_1        

	//   20   24:iload_2         
	//   21   25:iconst_1        
	//   22   26:iadd            
	//   23   27:istore_2        
	//*  24   28:goto            13
		return f;
	//   25   31:fload_1         
	//   26   32:freturn         
	}

	protected void calcRanges()
	{
		float af[] = getYVals();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method float[] getYVals()>
	//    2    4:astore          5
		if(af == null || af.length == 0)
	//*   3    6:aload           5
	//*   4    8:ifnull          17
	//*   5   11:aload           5
	//*   6   13:arraylength     
	//*   7   14:ifne            18
			return;
	//    8   17:return          
		mRanges = new mp[af.length];
	//    9   18:aload_0         
	//   10   19:aload           5
	//   11   21:arraylength     
	//   12   22:anewarray       mp[]
	//   13   25:putfield        #63  <Field mp[] mRanges>
		float f1 = -getNegativeSum();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #67  <Method float getNegativeSum()>
	//   16   32:fneg            
	//   17   33:fstore_2        
		float f = 0.0F;
	//   18   34:fconst_0        
	//   19   35:fstore_1        
		for(int i = 0; i < mRanges.length; i++)
	//*  20   36:iconst_0        
	//*  21   37:istore          4
	//*  22   39:iload           4
	//*  23   41:aload_0         
	//*  24   42:getfield        #63  <Field mp[] mRanges>
	//*  25   45:arraylength     
	//*  26   46:icmpge          117
		{
			float f2 = af[i];
	//   27   49:aload           5
	//   28   51:iload           4
	//   29   53:faload          
	//   30   54:fstore_3        
			if(f2 < 0.0F)
	//*  31   55:fload_3         
	//*  32   56:fconst_0        
	//*  33   57:fcmpg           
	//*  34   58:ifge            86
			{
				mRanges[i] = new mp(f1, f1 - f2);
	//   35   61:aload_0         
	//   36   62:getfield        #63  <Field mp[] mRanges>
	//   37   65:iload           4
	//   38   67:new             #61  <Class mp>
	//   39   70:dup             
	//   40   71:fload_2         
	//   41   72:fload_2         
	//   42   73:fload_3         
	//   43   74:fsub            
	//   44   75:invokespecial   #68  <Method void mp(float, float)>
	//   45   78:aastore         
				f1 -= f2;
	//   46   79:fload_2         
	//   47   80:fload_3         
	//   48   81:fsub            
	//   49   82:fstore_2        
			} else
	//*  50   83:goto            108
			{
				mRanges[i] = new mp(f, f + f2);
	//   51   86:aload_0         
	//   52   87:getfield        #63  <Field mp[] mRanges>
	//   53   90:iload           4
	//   54   92:new             #61  <Class mp>
	//   55   95:dup             
	//   56   96:fload_1         
	//   57   97:fload_1         
	//   58   98:fload_3         
	//   59   99:fadd            
	//   60  100:invokespecial   #68  <Method void mp(float, float)>
	//   61  103:aastore         
				f += f2;
	//   62  104:fload_1         
	//   63  105:fload_3         
	//   64  106:fadd            
	//   65  107:fstore_1        
			}
		}

	//   66  108:iload           4
	//   67  110:iconst_1        
	//   68  111:iadd            
	//   69  112:istore          4
	//*  70  114:goto            39
	//   71  117:return          
	}

	public BarEntry copy()
	{
		BarEntry barentry = new BarEntry(getX(), getY(), getData());
	//    0    0:new             #2   <Class BarEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #73  <Method float getX()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #76  <Method float getY()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #80  <Method Object getData()>
	//    8   16:invokespecial   #81  <Method void BarEntry(float, float, Object)>
	//    9   19:astore_1        
		barentry.setVals(mYVals);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field float[] mYVals>
	//   13   25:invokevirtual   #85  <Method void setVals(float[])>
		return barentry;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method BarEntry copy()>
	//    2    4:areturn         
	}

	public float getBelowSum(int i)
	{
		return getSumBelow(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #94  <Method float getSumBelow(int)>
	//    3    5:freturn         
	}

	public float getNegativeSum()
	{
		return mNegativeSum;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float mNegativeSum>
	//    2    4:freturn         
	}

	public float getPositiveSum()
	{
		return mPositiveSum;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field float mPositiveSum>
	//    2    4:freturn         
	}

	public mp[] getRanges()
	{
		return mRanges;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field mp[] mRanges>
	//    2    4:areturn         
	}

	public float getSumBelow(int i)
	{
		if(mYVals == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field float[] mYVals>
	//*   2    4:ifnonnull       9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		float f = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_2        
		for(int j = mYVals.length - 1; j > i && j >= 0; j--)
	//*   7   11:aload_0         
	//*   8   12:getfield        #35  <Field float[] mYVals>
	//*   9   15:arraylength     
	//*  10   16:iconst_1        
	//*  11   17:isub            
	//*  12   18:istore_3        
	//*  13   19:iload_3         
	//*  14   20:iload_1         
	//*  15   21:icmple          44
	//*  16   24:iload_3         
	//*  17   25:iflt            44
			f += mYVals[j];
	//   18   28:fload_2         
	//   19   29:aload_0         
	//   20   30:getfield        #35  <Field float[] mYVals>
	//   21   33:iload_3         
	//   22   34:faload          
	//   23   35:fadd            
	//   24   36:fstore_2        

	//   25   37:iload_3         
	//   26   38:iconst_1        
	//   27   39:isub            
	//   28   40:istore_3        
	//*  29   41:goto            19
		return f;
	//   30   44:fload_2         
	//   31   45:freturn         
	}

	public float getY()
	{
		return super.getY();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method float Entry.getY()>
	//    2    4:freturn         
	}

	public float[] getYVals()
	{
		return mYVals;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float[] mYVals>
	//    2    4:areturn         
	}

	public boolean isStacked()
	{
		return mYVals != null;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float[] mYVals>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setVals(float af[])
	{
		setY(calcSum(af));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #33  <Method float calcSum(float[])>
	//    3    5:invokevirtual   #105 <Method void setY(float)>
		mYVals = af;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #35  <Field float[] mYVals>
		calcPosNegSum();
	//    7   13:aload_0         
	//    8   14:invokespecial   #39  <Method void calcPosNegSum()>
		calcRanges();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #42  <Method void calcRanges()>
	//   11   21:return          
	}

	private float mNegativeSum;
	private float mPositiveSum;
	private mp mRanges[];
	private float mYVals[];
}
