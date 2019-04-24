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
			int i = Math.min((int)((float)(mValues.length - 1) * f), mValues.length - 2);
	//   12   16:aload_0         
	//   13   17:getfield        #17  <Field float[] mValues>
	//   14   20:arraylength     
	//   15   21:iconst_1        
	//   16   22:isub            
	//   17   23:i2f             
	//   18   24:fload_1         
	//   19   25:fmul            
	//   20   26:f2i             
	//   21   27:aload_0         
	//   22   28:getfield        #17  <Field float[] mValues>
	//   23   31:arraylength     
	//   24   32:iconst_2        
	//   25   33:isub            
	//   26   34:invokestatic    #28  <Method int Math.min(int, int)>
	//   27   37:istore_2        
			f = (f - (float)i * mStepSize) / mStepSize;
	//   28   38:fload_1         
	//   29   39:iload_2         
	//   30   40:i2f             
	//   31   41:aload_0         
	//   32   42:getfield        #19  <Field float mStepSize>
	//   33   45:fmul            
	//   34   46:fsub            
	//   35   47:aload_0         
	//   36   48:getfield        #19  <Field float mStepSize>
	//   37   51:fdiv            
	//   38   52:fstore_1        
			return mValues[i] + f * (mValues[i + 1] - mValues[i]);
	//   39   53:aload_0         
	//   40   54:getfield        #17  <Field float[] mValues>
	//   41   57:iload_2         
	//   42   58:faload          
	//   43   59:fload_1         
	//   44   60:aload_0         
	//   45   61:getfield        #17  <Field float[] mValues>
	//   46   64:iload_2         
	//   47   65:iconst_1        
	//   48   66:iadd            
	//   49   67:faload          
	//   50   68:aload_0         
	//   51   69:getfield        #17  <Field float[] mValues>
	//   52   72:iload_2         
	//   53   73:faload          
	//   54   74:fsub            
	//   55   75:fmul            
	//   56   76:fadd            
	//   57   77:freturn         
		}
	}

	private final float mStepSize;
	private final float mValues[];
}
