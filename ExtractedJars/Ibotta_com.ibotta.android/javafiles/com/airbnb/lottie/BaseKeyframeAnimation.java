// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			Keyframe

abstract class BaseKeyframeAnimation
{
	static interface AnimationListener
	{

		public abstract void onValueChanged();
	}


	BaseKeyframeAnimation(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List listeners>
		isDiscrete = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #33  <Field boolean isDiscrete>
		progress = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #35  <Field float progress>
		keyframes = list;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #37  <Field List keyframes>
	//   16   30:return          
	}

	private Keyframe getCurrentKeyframe()
	{
		if(!keyframes.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field List keyframes>
	//*   2    4:invokeinterface #48  <Method boolean List.isEmpty()>
	//*   3    9:ifne            128
		{
			Object obj = ((Object) (cachedKeyframe));
	//    4   12:aload_0         
	//    5   13:getfield        #50  <Field Keyframe cachedKeyframe>
	//    6   16:astore_2        
			if(obj != null && ((Keyframe) (obj)).containsProgress(progress))
	//*   7   17:aload_2         
	//*   8   18:ifnull          37
	//*   9   21:aload_2         
	//*  10   22:aload_0         
	//*  11   23:getfield        #35  <Field float progress>
	//*  12   26:invokevirtual   #56  <Method boolean Keyframe.containsProgress(float)>
	//*  13   29:ifeq            37
				return cachedKeyframe;
	//   14   32:aload_0         
	//   15   33:getfield        #50  <Field Keyframe cachedKeyframe>
	//   16   36:areturn         
			obj = ((Object) (keyframes));
	//   17   37:aload_0         
	//   18   38:getfield        #37  <Field List keyframes>
	//   19   41:astore_2        
			int i = 0;
	//   20   42:iconst_0        
	//   21   43:istore_1        
			Keyframe keyframe = (Keyframe)((List) (obj)).get(0);
	//   22   44:aload_2         
	//   23   45:iconst_0        
	//   24   46:invokeinterface #60  <Method Object List.get(int)>
	//   25   51:checkcast       #52  <Class Keyframe>
	//   26   54:astore_3        
			obj = ((Object) (keyframe));
	//   27   55:aload_3         
	//   28   56:astore_2        
			if(progress < keyframe.getStartProgress())
	//*  29   57:aload_0         
	//*  30   58:getfield        #35  <Field float progress>
	//*  31   61:aload_3         
	//*  32   62:invokevirtual   #64  <Method float Keyframe.getStartProgress()>
	//*  33   65:fcmpg           
	//*  34   66:ifge            76
			{
				cachedKeyframe = keyframe;
	//   35   69:aload_0         
	//   36   70:aload_3         
	//   37   71:putfield        #50  <Field Keyframe cachedKeyframe>
				return keyframe;
	//   38   74:aload_3         
	//   39   75:areturn         
			}
			for(; !((Keyframe) (obj)).containsProgress(progress) && i < keyframes.size(); i++)
	//*  40   76:aload_2         
	//*  41   77:aload_0         
	//*  42   78:getfield        #35  <Field float progress>
	//*  43   81:invokevirtual   #56  <Method boolean Keyframe.containsProgress(float)>
	//*  44   84:ifne            121
	//*  45   87:iload_1         
	//*  46   88:aload_0         
	//*  47   89:getfield        #37  <Field List keyframes>
	//*  48   92:invokeinterface #68  <Method int List.size()>
	//*  49   97:icmpge          121
				obj = ((Object) ((Keyframe)keyframes.get(i)));
	//   50  100:aload_0         
	//   51  101:getfield        #37  <Field List keyframes>
	//   52  104:iload_1         
	//   53  105:invokeinterface #60  <Method Object List.get(int)>
	//   54  110:checkcast       #52  <Class Keyframe>
	//   55  113:astore_2        

	//   56  114:iload_1         
	//   57  115:iconst_1        
	//   58  116:iadd            
	//   59  117:istore_1        
	//*  60  118:goto            76
			cachedKeyframe = ((Keyframe) (obj));
	//   61  121:aload_0         
	//   62  122:aload_2         
	//   63  123:putfield        #50  <Field Keyframe cachedKeyframe>
			return ((Keyframe) (obj));
	//   64  126:aload_2         
	//   65  127:areturn         
		} else
		{
			throw new IllegalStateException("There are no keyframes");
	//   66  128:new             #70  <Class IllegalStateException>
	//   67  131:dup             
	//   68  132:ldc1            #72  <String "There are no keyframes">
	//   69  134:invokespecial   #75  <Method void IllegalStateException(String)>
	//   70  137:athrow          
		}
	}

	private float getCurrentKeyframeProgress()
	{
		if(isDiscrete)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean isDiscrete>
	//*   2    4:ifeq            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		Keyframe keyframe = getCurrentKeyframe();
	//    5    9:aload_0         
	//    6   10:invokespecial   #79  <Method Keyframe getCurrentKeyframe()>
	//    7   13:astore          5
		if(keyframe.isStatic())
	//*   8   15:aload           5
	//*   9   17:invokevirtual   #82  <Method boolean Keyframe.isStatic()>
	//*  10   20:ifeq            25
		{
			return 0.0F;
	//   11   23:fconst_0        
	//   12   24:freturn         
		} else
		{
			float f = progress;
	//   13   25:aload_0         
	//   14   26:getfield        #35  <Field float progress>
	//   15   29:fstore_1        
			float f1 = keyframe.getStartProgress();
	//   16   30:aload           5
	//   17   32:invokevirtual   #64  <Method float Keyframe.getStartProgress()>
	//   18   35:fstore_2        
			float f2 = keyframe.getEndProgress();
	//   19   36:aload           5
	//   20   38:invokevirtual   #85  <Method float Keyframe.getEndProgress()>
	//   21   41:fstore_3        
			float f3 = keyframe.getStartProgress();
	//   22   42:aload           5
	//   23   44:invokevirtual   #64  <Method float Keyframe.getStartProgress()>
	//   24   47:fstore          4
			return keyframe.interpolator.getInterpolation((f - f1) / (f2 - f3));
	//   25   49:aload           5
	//   26   51:getfield        #89  <Field Interpolator Keyframe.interpolator>
	//   27   54:fload_1         
	//   28   55:fload_2         
	//   29   56:fsub            
	//   30   57:fload_3         
	//   31   58:fload           4
	//   32   60:fsub            
	//   33   61:fdiv            
	//   34   62:invokeinterface #95  <Method float Interpolator.getInterpolation(float)>
	//   35   67:freturn         
		}
	}

	private float getEndProgress()
	{
		if(keyframes.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field List keyframes>
	//*   2    4:invokeinterface #48  <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
		{
			return 1.0F;
	//    4   12:fconst_1        
	//    5   13:freturn         
		} else
		{
			List list = keyframes;
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field List keyframes>
	//    8   18:astore_1        
			return ((Keyframe)list.get(list.size() - 1)).getEndProgress();
	//    9   19:aload_1         
	//   10   20:aload_1         
	//   11   21:invokeinterface #68  <Method int List.size()>
	//   12   26:iconst_1        
	//   13   27:isub            
	//   14   28:invokeinterface #60  <Method Object List.get(int)>
	//   15   33:checkcast       #52  <Class Keyframe>
	//   16   36:invokevirtual   #85  <Method float Keyframe.getEndProgress()>
	//   17   39:freturn         
		}
	}

	private float getStartDelayProgress()
	{
		if(keyframes.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field List keyframes>
	//*   2    4:invokeinterface #48  <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return 0.0F;
	//    4   12:fconst_0        
	//    5   13:freturn         
		else
			return ((Keyframe)keyframes.get(0)).getStartProgress();
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field List keyframes>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #60  <Method Object List.get(int)>
	//   10   24:checkcast       #52  <Class Keyframe>
	//   11   27:invokevirtual   #64  <Method float Keyframe.getStartProgress()>
	//   12   30:freturn         
	}

	void addUpdateListener(AnimationListener animationlistener)
	{
		listeners.add(((Object) (animationlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #110 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	float getProgress()
	{
		return progress;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float progress>
	//    2    4:freturn         
	}

	public Object getValue()
	{
		return getValue(getCurrentKeyframe(), getCurrentKeyframeProgress());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #79  <Method Keyframe getCurrentKeyframe()>
	//    3    5:aload_0         
	//    4    6:invokespecial   #115 <Method float getCurrentKeyframeProgress()>
	//    5    9:invokevirtual   #118 <Method Object getValue(Keyframe, float)>
	//    6   12:areturn         
	}

	abstract Object getValue(Keyframe keyframe, float f);

	void setIsDiscrete()
	{
		isDiscrete = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #33  <Field boolean isDiscrete>
	//    3    5:return          
	}

	void setProgress(float f)
	{
		float f1;
		if(f < getStartDelayProgress())
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:invokespecial   #124 <Method float getStartDelayProgress()>
	//*   3    5:fcmpg           
	//*   4    6:ifge            14
		{
			f1 = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_2        
		} else
	//*   7   11:goto            27
		{
			f1 = f;
	//    8   14:fload_1         
	//    9   15:fstore_2        
			if(f > getEndProgress())
	//*  10   16:fload_1         
	//*  11   17:aload_0         
	//*  12   18:invokespecial   #125 <Method float getEndProgress()>
	//*  13   21:fcmpl           
	//*  14   22:ifle            27
				f1 = 1.0F;
	//   15   25:fconst_1        
	//   16   26:fstore_2        
		}
		if(f1 == progress)
	//*  17   27:fload_2         
	//*  18   28:aload_0         
	//*  19   29:getfield        #35  <Field float progress>
	//*  20   32:fcmpl           
	//*  21   33:ifne            37
			return;
	//   22   36:return          
		progress = f1;
	//   23   37:aload_0         
	//   24   38:fload_2         
	//   25   39:putfield        #35  <Field float progress>
		for(int i = 0; i < listeners.size(); i++)
	//*  26   42:iconst_0        
	//*  27   43:istore_3        
	//*  28   44:iload_3         
	//*  29   45:aload_0         
	//*  30   46:getfield        #31  <Field List listeners>
	//*  31   49:invokeinterface #68  <Method int List.size()>
	//*  32   54:icmpge          82
			((AnimationListener)listeners.get(i)).onValueChanged();
	//   33   57:aload_0         
	//   34   58:getfield        #31  <Field List listeners>
	//   35   61:iload_3         
	//   36   62:invokeinterface #60  <Method Object List.get(int)>
	//   37   67:checkcast       #7   <Class BaseKeyframeAnimation$AnimationListener>
	//   38   70:invokeinterface #128 <Method void BaseKeyframeAnimation$AnimationListener.onValueChanged()>

	//   39   75:iload_3         
	//   40   76:iconst_1        
	//   41   77:iadd            
	//   42   78:istore_3        
	//*  43   79:goto            44
	//   44   82:return          
	}

	private Keyframe cachedKeyframe;
	private boolean isDiscrete;
	private final List keyframes;
	final List listeners = new ArrayList();
	private float progress;
}
