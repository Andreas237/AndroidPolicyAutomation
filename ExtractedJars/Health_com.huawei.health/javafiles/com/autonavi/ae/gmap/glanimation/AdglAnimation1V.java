// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;

// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimation, AbstractAdglAnimationParam1V

public class AdglAnimation1V extends AbstractAdglAnimation
{

	public AdglAnimation1V(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractAdglAnimation()>
		v1Param = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
		reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #18  <Method void reset()>
		duration = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #22  <Field int duration>
		curValue = 0.0F;
	//   10   18:aload_0         
	//   11   19:fconst_0        
	//   12   20:putfield        #24  <Field float curValue>
	//   13   23:return          
	}

	public void doAnimation(Object obj)
	{
		if(isOver)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean isOver>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		offsetTime = SystemClock.uptimeMillis() - startTime;
	//    4    8:aload_0         
	//    5    9:invokestatic    #37  <Method long SystemClock.uptimeMillis()>
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field long startTime>
	//    8   16:lsub            
	//    9   17:putfield        #44  <Field long offsetTime>
		float f1 = (float)offsetTime / (float)duration;
	//   10   20:aload_0         
	//   11   21:getfield        #44  <Field long offsetTime>
	//   12   24:l2f             
	//   13   25:aload_0         
	//   14   26:getfield        #22  <Field int duration>
	//   15   29:i2f             
	//   16   30:fdiv            
	//   17   31:fstore_3        
		float f;
		if(f1 > 1.0F)
	//*  18   32:fload_3         
	//*  19   33:fconst_1        
	//*  20   34:fcmpl           
	//*  21   35:ifle            48
		{
			f = 1.0F;
	//   22   38:fconst_1        
	//   23   39:fstore_2        
			isOver = true;
	//   24   40:aload_0         
	//   25   41:iconst_1        
	//   26   42:putfield        #31  <Field boolean isOver>
		} else
	//*  27   45:goto            62
		{
			f = f1;
	//   28   48:fload_3         
	//   29   49:fstore_2        
			if(f1 < 0.0F)
	//*  30   50:fload_3         
	//*  31   51:fconst_0        
	//*  32   52:fcmpg           
	//*  33   53:ifge            62
			{
				isOver = true;
	//   34   56:aload_0         
	//   35   57:iconst_1        
	//   36   58:putfield        #31  <Field boolean isOver>
				return;
	//   37   61:return          
			}
		}
		if(v1Param != null)
	//*  38   62:aload_0         
	//*  39   63:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//*  40   66:ifnull          88
		{
			v1Param.setNormalizedTime(f);
	//   41   69:aload_0         
	//   42   70:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//   43   73:fload_2         
	//   44   74:invokevirtual   #50  <Method void AbstractAdglAnimationParam1V.setNormalizedTime(float)>
			curValue = v1Param.getCurValue();
	//   45   77:aload_0         
	//   46   78:aload_0         
	//   47   79:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//   48   82:invokevirtual   #54  <Method float AbstractAdglAnimationParam1V.getCurValue()>
	//   49   85:putfield        #24  <Field float curValue>
		}
	//   50   88:return          
	}

	public float getCurValue()
	{
		return curValue;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float curValue>
	//    2    4:freturn         
	}

	public float getEndValue()
	{
		if(v1Param != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//*   2    4:ifnull          15
			return v1Param.getToValue();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//    5   11:invokevirtual   #58  <Method float AbstractAdglAnimationParam1V.getToValue()>
	//    6   14:freturn         
		else
			return 0.0F;
	//    7   15:fconst_0        
	//    8   16:freturn         
	}

	public float getStartValue()
	{
		if(v1Param != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//*   2    4:ifnull          15
			return v1Param.getFromValue();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//    5   11:invokevirtual   #62  <Method float AbstractAdglAnimationParam1V.getFromValue()>
	//    6   14:freturn         
		else
			return 0.0F;
	//    7   15:fconst_0        
	//    8   16:freturn         
	}

	public void reset()
	{
		isOver = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #31  <Field boolean isOver>
		duration = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #22  <Field int duration>
		if(v1Param != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//*   8   14:ifnull          24
			v1Param.reset();
	//    9   17:aload_0         
	//   10   18:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//   11   21:invokevirtual   #63  <Method void AbstractAdglAnimationParam1V.reset()>
	//   12   24:return          
	}

	public void setAnimationValue(float f, float f1, int i)
	{
		if(v1Param == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//*   2    4:ifnonnull       18
			v1Param = new AbstractAdglAnimationParam1V();
	//    3    7:aload_0         
	//    4    8:new             #46  <Class AbstractAdglAnimationParam1V>
	//    5   11:dup             
	//    6   12:invokespecial   #66  <Method void AbstractAdglAnimationParam1V()>
	//    7   15:putfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
		v1Param.reset();
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//   10   22:invokevirtual   #63  <Method void AbstractAdglAnimationParam1V.reset()>
		v1Param.setInterpolatorType(i, 1.0F);
	//   11   25:aload_0         
	//   12   26:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//   13   29:iload_3         
	//   14   30:fconst_1        
	//   15   31:invokevirtual   #70  <Method void AbstractAdglAnimationParam1V.setInterpolatorType(int, float)>
		v1Param.setFromValue(f);
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//   18   38:fload_1         
	//   19   39:invokevirtual   #73  <Method void AbstractAdglAnimationParam1V.setFromValue(float)>
		v1Param.setToValue(f1);
	//   20   42:aload_0         
	//   21   43:getfield        #15  <Field AbstractAdglAnimationParam1V v1Param>
	//   22   46:fload_2         
	//   23   47:invokevirtual   #76  <Method void AbstractAdglAnimationParam1V.setToValue(float)>
		startTime = SystemClock.uptimeMillis();
	//   24   50:aload_0         
	//   25   51:invokestatic    #37  <Method long SystemClock.uptimeMillis()>
	//   26   54:putfield        #41  <Field long startTime>
		isOver = false;
	//   27   57:aload_0         
	//   28   58:iconst_0        
	//   29   59:putfield        #31  <Field boolean isOver>
	//   30   62:return          
	}

	private float curValue;
	private AbstractAdglAnimationParam1V v1Param;
}
