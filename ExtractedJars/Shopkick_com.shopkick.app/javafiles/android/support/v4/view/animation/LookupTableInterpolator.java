// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.animation;

import android.view.animation.Interpolator;

abstract class LookupTableInterpolator
	implements Interpolator
{

	protected LookupTableInterpolator(float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mValues = af;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field float[] mValues>
		mStepSize = 1.0F / (float)(mValues.length - 1);
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:aload_0         
	//    8   12:getfield        #17  <Field float[] mValues>
	//    9   15:arraylength     
	//   10   16:iconst_1        
	//   11   17:isub            
	//   12   18:i2f             
	//   13   19:fdiv            
	//   14   20:putfield        #19  <Field float mStepSize>
	//   15   23:return          
	}

	public float getInterpolation(float f)
	{
		if(f >= 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:iflt            8
			return 1.0F;
	//    4    6:fconst_1        
	//    5    7:freturn         
		if(f <= 0.0F)
	//*   6    8:fload_1         
	//*   7    9:fconst_0        
	//*   8   10:fcmpg           
	//*   9   11:ifgt            16
		{
			return 0.0F;
	//   10   14:fconst_0        
	//   11   15:freturn         
		} else
		{
			float af[] = mValues;
	//   12   16:aload_0         
	//   13   17:getfield        #17  <Field float[] mValues>
	//   14   20:astore          5
			int i = Math.min((int)((float)(af.length - 1) * f), af.length - 2);
	//   15   22:aload           5
	//   16   24:arraylength     
	//   17   25:iconst_1        
	//   18   26:isub            
	//   19   27:i2f             
	//   20   28:fload_1         
	//   21   29:fmul            
	//   22   30:f2i             
	//   23   31:aload           5
	//   24   33:arraylength     
	//   25   34:iconst_2        
	//   26   35:isub            
	//   27   36:invokestatic    #28  <Method int Math.min(int, int)>
	//   28   39:istore          4
			float f1 = i;
	//   29   41:iload           4
	//   30   43:i2f             
	//   31   44:fstore_2        
			float f2 = mStepSize;
	//   32   45:aload_0         
	//   33   46:getfield        #19  <Field float mStepSize>
	//   34   49:fstore_3        
			f = (f - f1 * f2) / f2;
	//   35   50:fload_1         
	//   36   51:fload_2         
	//   37   52:fload_3         
	//   38   53:fmul            
	//   39   54:fsub            
	//   40   55:fload_3         
	//   41   56:fdiv            
	//   42   57:fstore_1        
			af = mValues;
	//   43   58:aload_0         
	//   44   59:getfield        #17  <Field float[] mValues>
	//   45   62:astore          5
			return af[i] + f * (af[i + 1] - af[i]);
	//   46   64:aload           5
	//   47   66:iload           4
	//   48   68:faload          
	//   49   69:fload_1         
	//   50   70:aload           5
	//   51   72:iload           4
	//   52   74:iconst_1        
	//   53   75:iadd            
	//   54   76:faload          
	//   55   77:aload           5
	//   56   79:iload           4
	//   57   81:faload          
	//   58   82:fsub            
	//   59   83:fmul            
	//   60   84:fadd            
	//   61   85:freturn         
		}
	}

	private final float mStepSize;
	private final float mValues[];
}
