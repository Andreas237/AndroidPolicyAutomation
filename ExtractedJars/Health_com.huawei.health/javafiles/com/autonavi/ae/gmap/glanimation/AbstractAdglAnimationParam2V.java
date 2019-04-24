// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;


// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimationParam

public class AbstractAdglAnimationParam2V extends AbstractAdglAnimationParam
{

	public AbstractAdglAnimationParam2V()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractAdglAnimationParam()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #16  <Method void reset()>
	//    4    8:return          
	}

	public void checkParam()
	{
		needToCaculate = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #22  <Field boolean needToCaculate>
		if(hasFromValue && hasToValue)
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field boolean hasFromValue>
	//*   5    9:ifeq            74
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field boolean hasToValue>
	//*   8   16:ifeq            74
		{
			float f = toXValue;
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field float toXValue>
	//   11   23:fstore_1        
			float f1 = fromXValue;
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field float fromXValue>
	//   14   28:fstore_2        
			float f2 = toYValue;
	//   15   29:aload_0         
	//   16   30:getfield        #34  <Field float toYValue>
	//   17   33:fstore_3        
			float f3 = fromYValue;
	//   18   34:aload_0         
	//   19   35:getfield        #36  <Field float fromYValue>
	//   20   38:fstore          4
			if((double)Math.abs(f - f1) > 0.0001D || (double)Math.abs(f2 - f3) > 0.0001D)
	//*  21   40:fload_1         
	//*  22   41:fload_2         
	//*  23   42:fsub            
	//*  24   43:invokestatic    #42  <Method float Math.abs(float)>
	//*  25   46:f2d             
	//*  26   47:ldc2w           #43  <Double 0.0001D>
	//*  27   50:dcmpl           
	//*  28   51:ifgt            69
	//*  29   54:fload_3         
	//*  30   55:fload           4
	//*  31   57:fsub            
	//*  32   58:invokestatic    #42  <Method float Math.abs(float)>
	//*  33   61:f2d             
	//*  34   62:ldc2w           #43  <Double 0.0001D>
	//*  35   65:dcmpl           
	//*  36   66:ifle            74
				needToCaculate = true;
	//   37   69:aload_0         
	//   38   70:iconst_1        
	//   39   71:putfield        #22  <Field boolean needToCaculate>
		}
		hasCheckedParam = true;
	//   40   74:aload_0         
	//   41   75:iconst_1        
	//   42   76:putfield        #47  <Field boolean hasCheckedParam>
	//   43   79:return          
	}

	public float getCurXValue()
	{
		return fromXValue + (toXValue - fromXValue) * mult;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float fromXValue>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field float toXValue>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field float fromXValue>
	//    6   12:fsub            
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field float mult>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:freturn         
	}

	public float getCurYValue()
	{
		return fromYValue + (toYValue - fromYValue) * mult;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field float fromYValue>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field float toYValue>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field float fromYValue>
	//    6   12:fsub            
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field float mult>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:freturn         
	}

	public float getFromXValue()
	{
		return fromXValue;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float fromXValue>
	//    2    4:freturn         
	}

	public float getFromYValue()
	{
		return fromYValue;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field float fromYValue>
	//    2    4:freturn         
	}

	public float getToXValue()
	{
		return toXValue;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float toXValue>
	//    2    4:freturn         
	}

	public float getToYValue()
	{
		return toYValue;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float toYValue>
	//    2    4:freturn         
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void AbstractAdglAnimationParam.reset()>
		fromXValue = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #32  <Field float fromXValue>
		toXValue = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #30  <Field float toXValue>
		fromYValue = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #36  <Field float fromYValue>
		toYValue = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #34  <Field float toYValue>
	//   14   24:return          
	}

	public void setFromValue(float f, float f1)
	{
		fromXValue = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float fromXValue>
		fromYValue = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #36  <Field float fromYValue>
		hasFromValue = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #25  <Field boolean hasFromValue>
		hasCheckedParam = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #47  <Field boolean hasCheckedParam>
	//   12   20:return          
	}

	public void setToValue(float f, float f1)
	{
		toXValue = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #30  <Field float toXValue>
		toYValue = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #34  <Field float toYValue>
		hasToValue = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #28  <Field boolean hasToValue>
		hasCheckedParam = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #47  <Field boolean hasCheckedParam>
	//   12   20:return          
	}

	public float fromXValue;
	public float fromYValue;
	public float toXValue;
	public float toYValue;
}
