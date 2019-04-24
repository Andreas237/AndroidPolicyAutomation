// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;

import android.os.SystemClock;

// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimation, AbstractAdglAnimationParam2V

public class AdglAnimation2V extends AbstractAdglAnimation
{

	public AdglAnimation2V(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AbstractAdglAnimation()>
		v2Param = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
		reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #19  <Method void reset()>
		duration = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #23  <Field int duration>
		curValue1 = 0.0F;
	//   10   18:aload_0         
	//   11   19:fconst_0        
	//   12   20:putfield        #25  <Field float curValue1>
		curValue2 = 0.0F;
	//   13   23:aload_0         
	//   14   24:fconst_0        
	//   15   25:putfield        #27  <Field float curValue2>
	//   16   28:return          
	}

	public void doAnimation(Object obj)
	{
		if(isOver)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean isOver>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		offsetTime = SystemClock.uptimeMillis() - startTime;
	//    4    8:aload_0         
	//    5    9:invokestatic    #40  <Method long SystemClock.uptimeMillis()>
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field long startTime>
	//    8   16:lsub            
	//    9   17:putfield        #47  <Field long offsetTime>
		float f1 = (float)offsetTime / (float)duration;
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field long offsetTime>
	//   12   24:l2f             
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field int duration>
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
	//   26   42:putfield        #34  <Field boolean isOver>
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
	//   36   58:putfield        #34  <Field boolean isOver>
				return;
	//   37   61:return          
			}
		}
		if(v2Param != null)
	//*  38   62:aload_0         
	//*  39   63:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//*  40   66:ifnull          99
		{
			v2Param.setNormalizedTime(f);
	//   41   69:aload_0         
	//   42   70:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   43   73:fload_2         
	//   44   74:invokevirtual   #53  <Method void AbstractAdglAnimationParam2V.setNormalizedTime(float)>
			curValue1 = v2Param.getCurXValue();
	//   45   77:aload_0         
	//   46   78:aload_0         
	//   47   79:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   48   82:invokevirtual   #57  <Method float AbstractAdglAnimationParam2V.getCurXValue()>
	//   49   85:putfield        #25  <Field float curValue1>
			curValue2 = v2Param.getCurYValue();
	//   50   88:aload_0         
	//   51   89:aload_0         
	//   52   90:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   53   93:invokevirtual   #60  <Method float AbstractAdglAnimationParam2V.getCurYValue()>
	//   54   96:putfield        #27  <Field float curValue2>
		}
	//   55   99:return          
	}

	public float getCurValue(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			return curValue1;
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field float curValue1>
	//    4    8:freturn         
		else
			return curValue2;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field float curValue2>
	//    7   13:freturn         
	}

	public float getEndValue(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            21
			if(v2Param != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//*   4    8:ifnull          19
				return v2Param.getToXValue();
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//    7   15:invokevirtual   #66  <Method float AbstractAdglAnimationParam2V.getToXValue()>
	//    8   18:freturn         
			else
				return 0.0F;
	//    9   19:fconst_0        
	//   10   20:freturn         
		if(v2Param != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//*  13   25:ifnull          36
			return v2Param.getToYValue();
	//   14   28:aload_0         
	//   15   29:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   16   32:invokevirtual   #69  <Method float AbstractAdglAnimationParam2V.getToYValue()>
	//   17   35:freturn         
		else
			return 0.0F;
	//   18   36:fconst_0        
	//   19   37:freturn         
	}

	public float getStartValue(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            21
			if(v2Param != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//*   4    8:ifnull          19
				return v2Param.getFromXValue();
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//    7   15:invokevirtual   #73  <Method float AbstractAdglAnimationParam2V.getFromXValue()>
	//    8   18:freturn         
			else
				return 0.0F;
	//    9   19:fconst_0        
	//   10   20:freturn         
		if(v2Param != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//*  13   25:ifnull          36
			return v2Param.getFromYValue();
	//   14   28:aload_0         
	//   15   29:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   16   32:invokevirtual   #76  <Method float AbstractAdglAnimationParam2V.getFromYValue()>
	//   17   35:freturn         
		else
			return 0.0F;
	//   18   36:fconst_0        
	//   19   37:freturn         
	}

	public void reset()
	{
		isOver = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #34  <Field boolean isOver>
		duration = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #23  <Field int duration>
		curValue1 = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #25  <Field float curValue1>
		curValue2 = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #27  <Field float curValue2>
		if(v2Param != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//*  14   24:ifnull          34
			v2Param.reset();
	//   15   27:aload_0         
	//   16   28:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   17   31:invokevirtual   #77  <Method void AbstractAdglAnimationParam2V.reset()>
	//   18   34:return          
	}

	public void setAnimationValue(float f, float f1, float f2, float f3, int i)
	{
		if(v2Param == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//*   2    4:ifnonnull       18
			v2Param = new AbstractAdglAnimationParam2V();
	//    3    7:aload_0         
	//    4    8:new             #49  <Class AbstractAdglAnimationParam2V>
	//    5   11:dup             
	//    6   12:invokespecial   #80  <Method void AbstractAdglAnimationParam2V()>
	//    7   15:putfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
		v2Param.reset();
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   10   22:invokevirtual   #77  <Method void AbstractAdglAnimationParam2V.reset()>
		v2Param.setInterpolatorType(i, 1.0F);
	//   11   25:aload_0         
	//   12   26:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   13   29:iload           5
	//   14   31:fconst_1        
	//   15   32:invokevirtual   #84  <Method void AbstractAdglAnimationParam2V.setInterpolatorType(int, float)>
		v2Param.setFromValue(f, f2);
	//   16   35:aload_0         
	//   17   36:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   18   39:fload_1         
	//   19   40:fload_3         
	//   20   41:invokevirtual   #88  <Method void AbstractAdglAnimationParam2V.setFromValue(float, float)>
		v2Param.setToValue(f1, f3);
	//   21   44:aload_0         
	//   22   45:getfield        #16  <Field AbstractAdglAnimationParam2V v2Param>
	//   23   48:fload_2         
	//   24   49:fload           4
	//   25   51:invokevirtual   #91  <Method void AbstractAdglAnimationParam2V.setToValue(float, float)>
		startTime = SystemClock.uptimeMillis();
	//   26   54:aload_0         
	//   27   55:invokestatic    #40  <Method long SystemClock.uptimeMillis()>
	//   28   58:putfield        #44  <Field long startTime>
		isOver = false;
	//   29   61:aload_0         
	//   30   62:iconst_0        
	//   31   63:putfield        #34  <Field boolean isOver>
	//   32   66:return          
	}

	private float curValue1;
	private float curValue2;
	private AbstractAdglAnimationParam2V v2Param;
}
