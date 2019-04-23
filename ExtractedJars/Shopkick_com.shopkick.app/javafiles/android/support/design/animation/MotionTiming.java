// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;

import android.animation.*;
import android.view.animation.*;

// Referenced classes of package android.support.design.animation:
//			AnimationUtils

public class MotionTiming
{

	public MotionTiming(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		delay = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #20  <Field long delay>
		duration = 300L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #21  <Long 300L>
	//    7   13:putfield        #24  <Field long duration>
		interpolator = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #26  <Field TimeInterpolator interpolator>
		repeatCount = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #28  <Field int repeatCount>
		repeatMode = 1;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #30  <Field int repeatMode>
		delay = l;
	//   17   31:aload_0         
	//   18   32:lload_1         
	//   19   33:putfield        #20  <Field long delay>
		duration = l1;
	//   20   36:aload_0         
	//   21   37:lload_3         
	//   22   38:putfield        #24  <Field long duration>
	//   23   41:return          
	}

	public MotionTiming(long l, long l1, TimeInterpolator timeinterpolator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		delay = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #20  <Field long delay>
		duration = 300L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #21  <Long 300L>
	//    7   13:putfield        #24  <Field long duration>
		interpolator = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #26  <Field TimeInterpolator interpolator>
		repeatCount = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #28  <Field int repeatCount>
		repeatMode = 1;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #30  <Field int repeatMode>
		delay = l;
	//   17   31:aload_0         
	//   18   32:lload_1         
	//   19   33:putfield        #20  <Field long delay>
		duration = l1;
	//   20   36:aload_0         
	//   21   37:lload_3         
	//   22   38:putfield        #24  <Field long duration>
		interpolator = timeinterpolator;
	//   23   41:aload_0         
	//   24   42:aload           5
	//   25   44:putfield        #26  <Field TimeInterpolator interpolator>
	//   26   47:return          
	}

	static MotionTiming createFromAnimator(ValueAnimator valueanimator)
	{
		MotionTiming motiontiming = new MotionTiming(valueanimator.getStartDelay(), valueanimator.getDuration(), getInterpolatorCompat(valueanimator));
	//    0    0:new             #2   <Class MotionTiming>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #42  <Method long ValueAnimator.getStartDelay()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #45  <Method long ValueAnimator.getDuration()>
	//    6   12:aload_0         
	//    7   13:invokestatic    #49  <Method TimeInterpolator getInterpolatorCompat(ValueAnimator)>
	//    8   16:invokespecial   #51  <Method void MotionTiming(long, long, TimeInterpolator)>
	//    9   19:astore_1        
		motiontiming.repeatCount = valueanimator.getRepeatCount();
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #55  <Method int ValueAnimator.getRepeatCount()>
	//   13   25:putfield        #28  <Field int repeatCount>
		motiontiming.repeatMode = valueanimator.getRepeatMode();
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #58  <Method int ValueAnimator.getRepeatMode()>
	//   17   33:putfield        #30  <Field int repeatMode>
		return motiontiming;
	//   18   36:aload_1         
	//   19   37:areturn         
	}

	private static TimeInterpolator getInterpolatorCompat(ValueAnimator valueanimator)
	{
		valueanimator = ((ValueAnimator) (valueanimator.getInterpolator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method TimeInterpolator ValueAnimator.getInterpolator()>
	//    2    4:astore_0        
		if(!(valueanimator instanceof AccelerateDecelerateInterpolator) && valueanimator != null)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #64  <Class AccelerateDecelerateInterpolator>
	//*   5    9:ifne            43
	//*   6   12:aload_0         
	//*   7   13:ifnonnull       19
	//*   8   16:goto            43
		{
			if(valueanimator instanceof AccelerateInterpolator)
	//*   9   19:aload_0         
	//*  10   20:instanceof      #66  <Class AccelerateInterpolator>
	//*  11   23:ifeq            30
				return AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
	//   12   26:getstatic       #71  <Field TimeInterpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   13   29:areturn         
			if(valueanimator instanceof DecelerateInterpolator)
	//*  14   30:aload_0         
	//*  15   31:instanceof      #73  <Class DecelerateInterpolator>
	//*  16   34:ifeq            41
				return AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
	//   17   37:getstatic       #76  <Field TimeInterpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   18   40:areturn         
			else
				return ((TimeInterpolator) (valueanimator));
	//   19   41:aload_0         
	//   20   42:areturn         
		} else
		{
			return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
	//   21   43:getstatic       #79  <Field TimeInterpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   22   46:areturn         
		}
	}

	public void apply(Animator animator)
	{
		animator.setStartDelay(getDelay());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #84  <Method long getDelay()>
	//    3    5:invokevirtual   #90  <Method void Animator.setStartDelay(long)>
		animator.setDuration(getDuration());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #91  <Method long getDuration()>
	//    7   13:invokevirtual   #95  <Method Animator Animator.setDuration(long)>
	//    8   16:pop             
		animator.setInterpolator(getInterpolator());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #96  <Method TimeInterpolator getInterpolator()>
	//   12   22:invokevirtual   #100 <Method void Animator.setInterpolator(TimeInterpolator)>
		if(animator instanceof ValueAnimator)
	//*  13   25:aload_1         
	//*  14   26:instanceof      #38  <Class ValueAnimator>
	//*  15   29:ifeq            53
		{
			animator = ((Animator) ((ValueAnimator)animator));
	//   16   32:aload_1         
	//   17   33:checkcast       #38  <Class ValueAnimator>
	//   18   36:astore_1        
			((ValueAnimator) (animator)).setRepeatCount(getRepeatCount());
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #101 <Method int getRepeatCount()>
	//   22   42:invokevirtual   #105 <Method void ValueAnimator.setRepeatCount(int)>
			((ValueAnimator) (animator)).setRepeatMode(getRepeatMode());
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:invokevirtual   #106 <Method int getRepeatMode()>
	//   26   50:invokevirtual   #109 <Method void ValueAnimator.setRepeatMode(int)>
		}
	//   27   53:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          101
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #115 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #115 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((MotionTiming)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class MotionTiming>
	//   16   28:astore_1        
			if(getDelay() != ((MotionTiming) (obj)).getDelay())
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #84  <Method long getDelay()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #84  <Method long getDelay()>
	//*  21   37:lcmp            
	//*  22   38:ifeq            43
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
			if(getDuration() != ((MotionTiming) (obj)).getDuration())
	//*  25   43:aload_0         
	//*  26   44:invokevirtual   #91  <Method long getDuration()>
	//*  27   47:aload_1         
	//*  28   48:invokevirtual   #91  <Method long getDuration()>
	//*  29   51:lcmp            
	//*  30   52:ifeq            57
				return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
			if(getRepeatCount() != ((MotionTiming) (obj)).getRepeatCount())
	//*  33   57:aload_0         
	//*  34   58:invokevirtual   #101 <Method int getRepeatCount()>
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #101 <Method int getRepeatCount()>
	//*  37   65:icmpeq          70
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
			if(getRepeatMode() != ((MotionTiming) (obj)).getRepeatMode())
	//*  40   70:aload_0         
	//*  41   71:invokevirtual   #106 <Method int getRepeatMode()>
	//*  42   74:aload_1         
	//*  43   75:invokevirtual   #106 <Method int getRepeatMode()>
	//*  44   78:icmpeq          83
				return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
			else
				return ((Object) (((Object) (getInterpolator())).getClass())).equals(((Object) (((Object) (((MotionTiming) (obj)).getInterpolator())).getClass())));
	//   47   83:aload_0         
	//   48   84:invokevirtual   #96  <Method TimeInterpolator getInterpolator()>
	//   49   87:invokevirtual   #115 <Method Class Object.getClass()>
	//   50   90:aload_1         
	//   51   91:invokevirtual   #96  <Method TimeInterpolator getInterpolator()>
	//   52   94:invokevirtual   #115 <Method Class Object.getClass()>
	//   53   97:invokevirtual   #117 <Method boolean Object.equals(Object)>
	//   54  100:ireturn         
		} else
		{
			return false;
	//   55  101:iconst_0        
	//   56  102:ireturn         
		}
	}

	public long getDelay()
	{
		return delay;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long delay>
	//    2    4:lreturn         
	}

	public long getDuration()
	{
		return duration;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long duration>
	//    2    4:lreturn         
	}

	public TimeInterpolator getInterpolator()
	{
		TimeInterpolator timeinterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TimeInterpolator interpolator>
	//    2    4:astore_1        
		if(timeinterpolator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return timeinterpolator;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
	//    7   11:getstatic       #79  <Field TimeInterpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//    8   14:areturn         
	}

	public int getRepeatCount()
	{
		return repeatCount;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int repeatCount>
	//    2    4:ireturn         
	}

	public int getRepeatMode()
	{
		return repeatMode;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int repeatMode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return ((((int)(getDelay() ^ getDelay() >>> 32) * 31 + (int)(getDuration() ^ getDuration() >>> 32)) * 31 + ((Object) (((Object) (getInterpolator())).getClass())).hashCode()) * 31 + getRepeatCount()) * 31 + getRepeatMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method long getDelay()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method long getDelay()>
	//    4    8:bipush          32
	//    5   10:lushr           
	//    6   11:lxor            
	//    7   12:l2i             
	//    8   13:bipush          31
	//    9   15:imul            
	//   10   16:aload_0         
	//   11   17:invokevirtual   #91  <Method long getDuration()>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #91  <Method long getDuration()>
	//   14   24:bipush          32
	//   15   26:lushr           
	//   16   27:lxor            
	//   17   28:l2i             
	//   18   29:iadd            
	//   19   30:bipush          31
	//   20   32:imul            
	//   21   33:aload_0         
	//   22   34:invokevirtual   #96  <Method TimeInterpolator getInterpolator()>
	//   23   37:invokevirtual   #115 <Method Class Object.getClass()>
	//   24   40:invokevirtual   #120 <Method int Object.hashCode()>
	//   25   43:iadd            
	//   26   44:bipush          31
	//   27   46:imul            
	//   28   47:aload_0         
	//   29   48:invokevirtual   #101 <Method int getRepeatCount()>
	//   30   51:iadd            
	//   31   52:bipush          31
	//   32   54:imul            
	//   33   55:aload_0         
	//   34   56:invokevirtual   #106 <Method int getRepeatMode()>
	//   35   59:iadd            
	//   36   60:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #124 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append('\n');
	//    4    8:aload_1         
	//    5    9:bipush          10
	//    6   11:invokevirtual   #129 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #115 <Method Class Object.getClass()>
	//   11   20:invokevirtual   #134 <Method String Class.getName()>
	//   12   23:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append('{');
	//   14   27:aload_1         
	//   15   28:bipush          123
	//   16   30:invokevirtual   #129 <Method StringBuilder StringBuilder.append(char)>
	//   17   33:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokestatic    #143 <Method int System.identityHashCode(Object)>
	//   21   39:invokestatic    #149 <Method String Integer.toHexString(int)>
	//   22   42:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append(" delay: ");
	//   24   46:aload_1         
	//   25   47:ldc1            #151 <String " delay: ">
	//   26   49:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		stringbuilder.append(getDelay());
	//   28   53:aload_1         
	//   29   54:aload_0         
	//   30   55:invokevirtual   #84  <Method long getDelay()>
	//   31   58:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   32   61:pop             
		stringbuilder.append(" duration: ");
	//   33   62:aload_1         
	//   34   63:ldc1            #156 <String " duration: ">
	//   35   65:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
		stringbuilder.append(getDuration());
	//   37   69:aload_1         
	//   38   70:aload_0         
	//   39   71:invokevirtual   #91  <Method long getDuration()>
	//   40   74:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   41   77:pop             
		stringbuilder.append(" interpolator: ");
	//   42   78:aload_1         
	//   43   79:ldc1            #158 <String " interpolator: ">
	//   44   81:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
		stringbuilder.append(((Object) (((Object) (getInterpolator())).getClass())));
	//   46   85:aload_1         
	//   47   86:aload_0         
	//   48   87:invokevirtual   #96  <Method TimeInterpolator getInterpolator()>
	//   49   90:invokevirtual   #115 <Method Class Object.getClass()>
	//   50   93:invokevirtual   #161 <Method StringBuilder StringBuilder.append(Object)>
	//   51   96:pop             
		stringbuilder.append(" repeatCount: ");
	//   52   97:aload_1         
	//   53   98:ldc1            #163 <String " repeatCount: ">
	//   54  100:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   55  103:pop             
		stringbuilder.append(getRepeatCount());
	//   56  104:aload_1         
	//   57  105:aload_0         
	//   58  106:invokevirtual   #101 <Method int getRepeatCount()>
	//   59  109:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   60  112:pop             
		stringbuilder.append(" repeatMode: ");
	//   61  113:aload_1         
	//   62  114:ldc1            #168 <String " repeatMode: ">
	//   63  116:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   64  119:pop             
		stringbuilder.append(getRepeatMode());
	//   65  120:aload_1         
	//   66  121:aload_0         
	//   67  122:invokevirtual   #106 <Method int getRepeatMode()>
	//   68  125:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   69  128:pop             
		stringbuilder.append("}\n");
	//   70  129:aload_1         
	//   71  130:ldc1            #170 <String "}\n">
	//   72  132:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   73  135:pop             
		return stringbuilder.toString();
	//   74  136:aload_1         
	//   75  137:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   76  140:areturn         
	}

	private long delay;
	private long duration;
	private TimeInterpolator interpolator;
	private int repeatCount;
	private int repeatMode;
}
