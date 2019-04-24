// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;


// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimationParam

public class AbstractAdglAnimationParam1V extends AbstractAdglAnimationParam
{

	public AbstractAdglAnimationParam1V()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractAdglAnimationParam()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #14  <Method void reset()>
	//    4    8:return          
	}

	public void checkParam()
	{
		needToCaculate = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #20  <Field boolean needToCaculate>
		if(hasFromValue && hasToValue && (double)Math.abs(toValue - fromValue) > 0.0001D)
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field boolean hasFromValue>
	//*   5    9:ifeq            44
	//*   6   12:aload_0         
	//*   7   13:getfield        #26  <Field boolean hasToValue>
	//*   8   16:ifeq            44
	//*   9   19:aload_0         
	//*  10   20:getfield        #28  <Field float toValue>
	//*  11   23:aload_0         
	//*  12   24:getfield        #30  <Field float fromValue>
	//*  13   27:fsub            
	//*  14   28:invokestatic    #36  <Method float Math.abs(float)>
	//*  15   31:f2d             
	//*  16   32:ldc2w           #37  <Double 0.0001D>
	//*  17   35:dcmpl           
	//*  18   36:ifle            44
			needToCaculate = true;
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:putfield        #20  <Field boolean needToCaculate>
		hasCheckedParam = true;
	//   22   44:aload_0         
	//   23   45:iconst_1        
	//   24   46:putfield        #41  <Field boolean hasCheckedParam>
	//   25   49:return          
	}

	public float getCurValue()
	{
		return fromValue + (toValue - fromValue) * mult;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float fromValue>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field float toValue>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field float fromValue>
	//    6   12:fsub            
	//    7   13:aload_0         
	//    8   14:getfield        #46  <Field float mult>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:freturn         
	}

	public float getFromValue()
	{
		return fromValue;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float fromValue>
	//    2    4:freturn         
	}

	public float getToValue()
	{
		return toValue;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field float toValue>
	//    2    4:freturn         
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AbstractAdglAnimationParam.reset()>
		fromValue = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #30  <Field float fromValue>
		toValue = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #28  <Field float toValue>
	//    8   14:return          
	}

	public void setFromValue(float f)
	{
		fromValue = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #30  <Field float fromValue>
		hasFromValue = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #23  <Field boolean hasFromValue>
		hasCheckedParam = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #41  <Field boolean hasCheckedParam>
	//    9   15:return          
	}

	public void setToValue(float f)
	{
		toValue = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #28  <Field float toValue>
		hasToValue = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #26  <Field boolean hasToValue>
		hasCheckedParam = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #41  <Field boolean hasCheckedParam>
	//    9   15:return          
	}

	private float fromValue;
	private float toValue;
}
