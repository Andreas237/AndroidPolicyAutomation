// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues, TransitionValuesMaps, PathMotion, 
//			TransitionPropagation, TransitionListenerAdapter

public class TransitionSet extends Transition
{
	static class TransitionSetListener extends TransitionListenerAdapter
	{

		public void onTransitionEnd(Transition transition)
		{
			TransitionSet transitionset = mTransitionSet;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field TransitionSet mTransitionSet>
		//    2    4:astore_2        
			transitionset.mCurrentListeners = transitionset.mCurrentListeners - 1;
		//    3    5:aload_2         
		//    4    6:aload_2         
		//    5    7:getfield        #24  <Field int TransitionSet.mCurrentListeners>
		//    6   10:iconst_1        
		//    7   11:isub            
		//    8   12:putfield        #24  <Field int TransitionSet.mCurrentListeners>
			if(mTransitionSet.mCurrentListeners == 0)
		//*   9   15:aload_0         
		//*  10   16:getfield        #16  <Field TransitionSet mTransitionSet>
		//*  11   19:getfield        #24  <Field int TransitionSet.mCurrentListeners>
		//*  12   22:ifne            39
			{
				TransitionSet transitionset1 = mTransitionSet;
		//   13   25:aload_0         
		//   14   26:getfield        #16  <Field TransitionSet mTransitionSet>
		//   15   29:astore_2        
				transitionset1.mStarted = false;
		//   16   30:aload_2         
		//   17   31:iconst_0        
		//   18   32:putfield        #28  <Field boolean TransitionSet.mStarted>
				transitionset1.end();
		//   19   35:aload_2         
		//   20   36:invokevirtual   #31  <Method void TransitionSet.end()>
			}
			transition.removeListener(((Transition.TransitionListener) (this)));
		//   21   39:aload_1         
		//   22   40:aload_0         
		//   23   41:invokevirtual   #37  <Method Transition Transition.removeListener(Transition$TransitionListener)>
		//   24   44:pop             
		//   25   45:return          
		}

		public void onTransitionStart(Transition transition)
		{
			if(!mTransitionSet.mStarted)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field TransitionSet mTransitionSet>
		//*   2    4:getfield        #28  <Field boolean TransitionSet.mStarted>
		//*   3    7:ifne            25
			{
				mTransitionSet.start();
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field TransitionSet mTransitionSet>
		//    6   14:invokevirtual   #42  <Method void TransitionSet.start()>
				mTransitionSet.mStarted = true;
		//    7   17:aload_0         
		//    8   18:getfield        #16  <Field TransitionSet mTransitionSet>
		//    9   21:iconst_1        
		//   10   22:putfield        #28  <Field boolean TransitionSet.mStarted>
			}
		//   11   25:return          
		}

		TransitionSet mTransitionSet;

		TransitionSetListener(TransitionSet transitionset)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TransitionListenerAdapter()>
			mTransitionSet = transitionset;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field TransitionSet mTransitionSet>
		//    5    9:return          
		}
	}


	public TransitionSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Transition()>
		mTransitions = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void ArrayList()>
	//    6   12:putfield        #27  <Field ArrayList mTransitions>
		mPlayTogether = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #29  <Field boolean mPlayTogether>
		mStarted = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #31  <Field boolean mStarted>
		mChangeFlags = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #33  <Field int mChangeFlags>
	//   16   30:return          
	}

	private void setupStartEndListeners()
	{
		TransitionSetListener transitionsetlistener = new TransitionSetListener(this);
	//    0    0:new             #8   <Class TransitionSet$TransitionSetListener>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void TransitionSet$TransitionSetListener(TransitionSet)>
	//    4    8:astore_1        
		for(Iterator iterator = mTransitions.iterator(); iterator.hasNext(); ((Transition)iterator.next()).addListener(((Transition.TransitionListener) (transitionsetlistener))));
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field ArrayList mTransitions>
	//    7   13:invokevirtual   #42  <Method Iterator ArrayList.iterator()>
	//    8   16:astore_2        
	//    9   17:aload_2         
	//   10   18:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            43
	//   12   26:aload_2         
	//   13   27:invokeinterface #52  <Method Object Iterator.next()>
	//   14   32:checkcast       #4   <Class Transition>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #56  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   17   39:pop             
	//*  18   40:goto            17
		mCurrentListeners = mTransitions.size();
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #27  <Field ArrayList mTransitions>
	//   22   48:invokevirtual   #60  <Method int ArrayList.size()>
	//   23   51:putfield        #62  <Field int mCurrentListeners>
	//   24   54:return          
	}

	public volatile Transition addListener(Transition.TransitionListener transitionlistener)
	{
		return ((Transition) (addListener(transitionlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #66  <Method TransitionSet addListener(Transition$TransitionListener)>
	//    3    5:areturn         
	}

	public TransitionSet addListener(Transition.TransitionListener transitionlistener)
	{
		return (TransitionSet)super.addListener(transitionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public volatile Transition addTarget(View view)
	{
		return ((Transition) (addTarget(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #73  <Method TransitionSet addTarget(View)>
	//    3    5:areturn         
	}

	public TransitionSet addTarget(View view)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #27  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #60  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).addTarget(view);
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #79  <Method Transition Transition.addTarget(View)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)super.addTarget(view);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #79  <Method Transition Transition.addTarget(View)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet addTransition(Transition transition)
	{
		mTransitions.add(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mTransitions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		transition.mParent = this;
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:putfield        #89  <Field TransitionSet Transition.mParent>
		if(mDuration >= 0L)
	//*   8   14:aload_0         
	//*   9   15:getfield        #93  <Field long mDuration>
	//*  10   18:lconst_0        
	//*  11   19:lcmp            
	//*  12   20:iflt            32
			transition.setDuration(mDuration);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #93  <Field long mDuration>
	//   16   28:invokevirtual   #97  <Method Transition Transition.setDuration(long)>
	//   17   31:pop             
		if((mChangeFlags & 1) != 0)
	//*  18   32:aload_0         
	//*  19   33:getfield        #33  <Field int mChangeFlags>
	//*  20   36:iconst_1        
	//*  21   37:iand            
	//*  22   38:ifeq            50
			transition.setInterpolator(getInterpolator());
	//   23   41:aload_1         
	//   24   42:aload_0         
	//   25   43:invokevirtual   #101 <Method TimeInterpolator getInterpolator()>
	//   26   46:invokevirtual   #105 <Method Transition Transition.setInterpolator(TimeInterpolator)>
	//   27   49:pop             
		if((mChangeFlags & 2) != 0)
	//*  28   50:aload_0         
	//*  29   51:getfield        #33  <Field int mChangeFlags>
	//*  30   54:iconst_2        
	//*  31   55:iand            
	//*  32   56:ifeq            67
			transition.setPropagation(getPropagation());
	//   33   59:aload_1         
	//   34   60:aload_0         
	//   35   61:invokevirtual   #109 <Method TransitionPropagation getPropagation()>
	//   36   64:invokevirtual   #113 <Method void Transition.setPropagation(TransitionPropagation)>
		if((mChangeFlags & 4) != 0)
	//*  37   67:aload_0         
	//*  38   68:getfield        #33  <Field int mChangeFlags>
	//*  39   71:iconst_4        
	//*  40   72:iand            
	//*  41   73:ifeq            84
			transition.setPathMotion(getPathMotion());
	//   42   76:aload_1         
	//   43   77:aload_0         
	//   44   78:invokevirtual   #117 <Method PathMotion getPathMotion()>
	//   45   81:invokevirtual   #121 <Method void Transition.setPathMotion(PathMotion)>
		if((mChangeFlags & 8) != 0)
	//*  46   84:aload_0         
	//*  47   85:getfield        #33  <Field int mChangeFlags>
	//*  48   88:bipush          8
	//*  49   90:iand            
	//*  50   91:ifeq            102
			transition.setEpicenterCallback(getEpicenterCallback());
	//   51   94:aload_1         
	//   52   95:aload_0         
	//   53   96:invokevirtual   #125 <Method Transition$EpicenterCallback getEpicenterCallback()>
	//   54   99:invokevirtual   #129 <Method void Transition.setEpicenterCallback(Transition$EpicenterCallback)>
		return this;
	//   55  102:aload_0         
	//   56  103:areturn         
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		if(isValidTarget(transitionvalues.view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #137 <Field View TransitionValues.view>
	//*   3    5:invokevirtual   #141 <Method boolean isValidTarget(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = mTransitions.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field ArrayList mTransitions>
	//    7   15:invokevirtual   #42  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #52  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.isValidTarget(transitionvalues.view))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #137 <Field View TransitionValues.view>
	//*  19   43:invokevirtual   #142 <Method boolean Transition.isValidTarget(View)>
	//*  20   46:ifeq            19
				{
					transition.captureEndValues(transitionvalues);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #144 <Method void Transition.captureEndValues(TransitionValues)>
					transitionvalues.mTargetedTransitions.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #147 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   28   62:pop             
				}
			} while(true);
	//   29   63:goto            19
		}
	//   30   66:return          
	}

	void capturePropagationValues(TransitionValues transitionvalues)
	{
		super.capturePropagationValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method void Transition.capturePropagationValues(TransitionValues)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #60  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).capturePropagationValues(transitionvalues);
	//   12   20:aload_0         
	//   13   21:getfield        #27  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #150 <Method void Transition.capturePropagationValues(TransitionValues)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		if(isValidTarget(transitionvalues.view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #137 <Field View TransitionValues.view>
	//*   3    5:invokevirtual   #141 <Method boolean isValidTarget(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = mTransitions.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field ArrayList mTransitions>
	//    7   15:invokevirtual   #42  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #52  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.isValidTarget(transitionvalues.view))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #137 <Field View TransitionValues.view>
	//*  19   43:invokevirtual   #142 <Method boolean Transition.isValidTarget(View)>
	//*  20   46:ifeq            19
				{
					transition.captureStartValues(transitionvalues);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #153 <Method void Transition.captureStartValues(TransitionValues)>
					transitionvalues.mTargetedTransitions.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #147 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   28   62:pop             
				}
			} while(true);
	//   29   63:goto            19
		}
	//   30   66:return          
	}

	public Transition clone()
	{
		TransitionSet transitionset = (TransitionSet)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method Transition Transition.clone()>
	//    2    4:checkcast       #2   <Class TransitionSet>
	//    3    7:astore_3        
		transitionset.mTransitions = new ArrayList();
	//    4    8:aload_3         
	//    5    9:new             #24  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #25  <Method void ArrayList()>
	//    8   16:putfield        #27  <Field ArrayList mTransitions>
		int j = mTransitions.size();
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field ArrayList mTransitions>
	//   11   23:invokevirtual   #60  <Method int ArrayList.size()>
	//   12   26:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          60
			transitionset.addTransition(((Transition)mTransitions.get(i)).clone());
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #27  <Field ArrayList mTransitions>
	//   21   39:iload_1         
	//   22   40:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #4   <Class Transition>
	//   24   46:invokevirtual   #157 <Method Transition Transition.clone()>
	//   25   49:invokevirtual   #159 <Method TransitionSet addTransition(Transition)>
	//   26   52:pop             

	//   27   53:iload_1         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_1        
	//*  31   57:goto            29
		return ((Transition) (transitionset));
	//   32   60:aload_3         
	//   33   61:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method Transition clone()>
	//    2    4:areturn         
	}

	protected void createAnimators(ViewGroup viewgroup, TransitionValuesMaps transitionvaluesmaps, TransitionValuesMaps transitionvaluesmaps1, ArrayList arraylist, ArrayList arraylist1)
	{
		long l = getStartDelay();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method long getStartDelay()>
	//    2    4:lstore          8
		int j = mTransitions.size();
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field ArrayList mTransitions>
	//    5   10:invokevirtual   #60  <Method int ArrayList.size()>
	//    6   13:istore          7
		for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore          6
	//*   9   18:iload           6
	//*  10   20:iload           7
	//*  11   22:icmpge          115
		{
			Transition transition = (Transition)mTransitions.get(i);
	//   12   25:aload_0         
	//   13   26:getfield        #27  <Field ArrayList mTransitions>
	//   14   29:iload           6
	//   15   31:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   16   34:checkcast       #4   <Class Transition>
	//   17   37:astore          12
			if(l > 0L && (mPlayTogether || i == 0))
	//*  18   39:lload           8
	//*  19   41:lconst_0        
	//*  20   42:lcmp            
	//*  21   43:ifle            94
	//*  22   46:aload_0         
	//*  23   47:getfield        #29  <Field boolean mPlayTogether>
	//*  24   50:ifne            58
	//*  25   53:iload           6
	//*  26   55:ifne            94
			{
				long l1 = transition.getStartDelay();
	//   27   58:aload           12
	//   28   60:invokevirtual   #174 <Method long Transition.getStartDelay()>
	//   29   63:lstore          10
				if(l1 > 0L)
	//*  30   65:lload           10
	//*  31   67:lconst_0        
	//*  32   68:lcmp            
	//*  33   69:ifle            86
					transition.setStartDelay(l1 + l);
	//   34   72:aload           12
	//   35   74:lload           10
	//   36   76:lload           8
	//   37   78:ladd            
	//   38   79:invokevirtual   #177 <Method Transition Transition.setStartDelay(long)>
	//   39   82:pop             
				else
	//*  40   83:goto            94
					transition.setStartDelay(l);
	//   41   86:aload           12
	//   42   88:lload           8
	//   43   90:invokevirtual   #177 <Method Transition Transition.setStartDelay(long)>
	//   44   93:pop             
			}
			transition.createAnimators(viewgroup, transitionvaluesmaps, transitionvaluesmaps1, arraylist, arraylist1);
	//   45   94:aload           12
	//   46   96:aload_1         
	//   47   97:aload_2         
	//   48   98:aload_3         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:invokevirtual   #179 <Method void Transition.createAnimators(ViewGroup, TransitionValuesMaps, TransitionValuesMaps, ArrayList, ArrayList)>
		}

	//   52  106:iload           6
	//   53  108:iconst_1        
	//   54  109:iadd            
	//   55  110:istore          6
	//*  56  112:goto            18
	//   57  115:return          
	}

	public Transition getTransitionAt(int i)
	{
		if(i >= 0 && i < mTransitions.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            30
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field ArrayList mTransitions>
	//*   5    9:invokevirtual   #60  <Method int ArrayList.size()>
	//*   6   12:icmplt          18
	//*   7   15:goto            30
			return (Transition)mTransitions.get(i);
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field ArrayList mTransitions>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   12   26:checkcast       #4   <Class Transition>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	public int getTransitionCount()
	{
		return mTransitions.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mTransitions>
	//    2    4:invokevirtual   #60  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void pause(View view)
	{
		super.pause(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #188 <Method void Transition.pause(View)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #60  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).pause(view);
	//   12   20:aload_0         
	//   13   21:getfield        #27  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #188 <Method void Transition.pause(View)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public volatile Transition removeListener(Transition.TransitionListener transitionlistener)
	{
		return ((Transition) (removeListener(transitionlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #191 <Method TransitionSet removeListener(Transition$TransitionListener)>
	//    3    5:areturn         
	}

	public TransitionSet removeListener(Transition.TransitionListener transitionlistener)
	{
		return (TransitionSet)super.removeListener(transitionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #193 <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public volatile Transition removeTarget(View view)
	{
		return ((Transition) (removeTarget(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #196 <Method TransitionSet removeTarget(View)>
	//    3    5:areturn         
	}

	public TransitionSet removeTarget(View view)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #27  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #60  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).removeTarget(view);
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #198 <Method Transition Transition.removeTarget(View)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)super.removeTarget(view);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #198 <Method Transition Transition.removeTarget(View)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public void resume(View view)
	{
		super.resume(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void Transition.resume(View)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #60  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).resume(view);
	//   12   20:aload_0         
	//   13   21:getfield        #27  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #201 <Method void Transition.resume(View)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	protected void runAnimators()
	{
		if(mTransitions.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field ArrayList mTransitions>
	//*   2    4:invokevirtual   #205 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            19
		{
			start();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #208 <Method void start()>
			end();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #211 <Method void end()>
			return;
	//    8   18:return          
		}
		setupStartEndListeners();
	//    9   19:aload_0         
	//   10   20:invokespecial   #213 <Method void setupStartEndListeners()>
		if(!mPlayTogether)
	//*  11   23:aload_0         
	//*  12   24:getfield        #29  <Field boolean mPlayTogether>
	//*  13   27:ifne            107
		{
			for(int i = 1; i < mTransitions.size(); i++)
	//*  14   30:iconst_1        
	//*  15   31:istore_1        
	//*  16   32:iload_1         
	//*  17   33:aload_0         
	//*  18   34:getfield        #27  <Field ArrayList mTransitions>
	//*  19   37:invokevirtual   #60  <Method int ArrayList.size()>
	//*  20   40:icmpge          86
				((Transition)mTransitions.get(i - 1)).addListener(((Transition.TransitionListener) (new TransitionListenerAdapter() {

					public void onTransitionEnd(Transition transition1)
					{
						nextTransition.runAnimators();
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field Transition val$nextTransition>
					//    2    4:invokevirtual   #28  <Method void Transition.runAnimators()>
						transition1.removeListener(((Transition.TransitionListener) (this)));
					//    3    7:aload_1         
					//    4    8:aload_0         
					//    5    9:invokevirtual   #32  <Method Transition Transition.removeListener(Transition$TransitionListener)>
					//    6   12:pop             
					//    7   13:return          
					}

					final TransitionSet this$0;
					final Transition val$nextTransition;

			
			{
				this$0 = TransitionSet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TransitionSet this$0>
				nextTransition = transition;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Transition val$nextTransition>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void TransitionListenerAdapter()>
			//    8   14:return          
			}
				}
)));
	//   21   43:aload_0         
	//   22   44:getfield        #27  <Field ArrayList mTransitions>
	//   23   47:iload_1         
	//   24   48:iconst_1        
	//   25   49:isub            
	//   26   50:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #4   <Class Transition>
	//   28   56:new             #6   <Class TransitionSet$1>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:getfield        #27  <Field ArrayList mTransitions>
	//   33   65:iload_1         
	//   34   66:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   35   69:checkcast       #4   <Class Transition>
	//   36   72:invokespecial   #216 <Method void TransitionSet$1(TransitionSet, Transition)>
	//   37   75:invokevirtual   #56  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   38   78:pop             

	//   39   79:iload_1         
	//   40   80:iconst_1        
	//   41   81:iadd            
	//   42   82:istore_1        
	//*  43   83:goto            32
			Transition transition = (Transition)mTransitions.get(0);
	//   44   86:aload_0         
	//   45   87:getfield        #27  <Field ArrayList mTransitions>
	//   46   90:iconst_0        
	//   47   91:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   48   94:checkcast       #4   <Class Transition>
	//   49   97:astore_2        
			if(transition != null)
	//*  50   98:aload_2         
	//*  51   99:ifnull          139
			{
				transition.runAnimators();
	//   52  102:aload_2         
	//   53  103:invokevirtual   #218 <Method void Transition.runAnimators()>
				return;
	//   54  106:return          
			}
		} else
		{
			for(Iterator iterator = mTransitions.iterator(); iterator.hasNext(); ((Transition)iterator.next()).runAnimators());
	//   55  107:aload_0         
	//   56  108:getfield        #27  <Field ArrayList mTransitions>
	//   57  111:invokevirtual   #42  <Method Iterator ArrayList.iterator()>
	//   58  114:astore_2        
	//   59  115:aload_2         
	//   60  116:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   61  121:ifeq            139
	//   62  124:aload_2         
	//   63  125:invokeinterface #52  <Method Object Iterator.next()>
	//   64  130:checkcast       #4   <Class Transition>
	//   65  133:invokevirtual   #218 <Method void Transition.runAnimators()>
		}
	//*  66  136:goto            115
	//   67  139:return          
	}

	public volatile Transition setDuration(long l)
	{
		return ((Transition) (setDuration(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #221 <Method TransitionSet setDuration(long)>
	//    3    5:areturn         
	}

	public TransitionSet setDuration(long l)
	{
		super.setDuration(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #97  <Method Transition Transition.setDuration(long)>
	//    3    5:pop             
		if(mDuration >= 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #93  <Field long mDuration>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:iflt            55
		{
			int j = mTransitions.size();
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field ArrayList mTransitions>
	//   11   19:invokevirtual   #60  <Method int ArrayList.size()>
	//   12   22:istore          4
			for(int i = 0; i < j; i++)
	//*  13   24:iconst_0        
	//*  14   25:istore_3        
	//*  15   26:iload_3         
	//*  16   27:iload           4
	//*  17   29:icmpge          55
				((Transition)mTransitions.get(i)).setDuration(l);
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field ArrayList mTransitions>
	//   20   36:iload_3         
	//   21   37:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   22   40:checkcast       #4   <Class Transition>
	//   23   43:lload_1         
	//   24   44:invokevirtual   #97  <Method Transition Transition.setDuration(long)>
	//   25   47:pop             

	//   26   48:iload_3         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_3        
		}
	//*  30   52:goto            26
		return this;
	//   31   55:aload_0         
	//   32   56:areturn         
	}

	public void setEpicenterCallback(Transition.EpicenterCallback epicentercallback)
	{
		super.setEpicenterCallback(epicentercallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #129 <Method void Transition.setEpicenterCallback(Transition$EpicenterCallback)>
		mChangeFlags = mChangeFlags | 8;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field int mChangeFlags>
	//    6   10:bipush          8
	//    7   12:ior             
	//    8   13:putfield        #33  <Field int mChangeFlags>
		int j = mTransitions.size();
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field ArrayList mTransitions>
	//   11   20:invokevirtual   #60  <Method int ArrayList.size()>
	//   12   23:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   24:iconst_0        
	//*  14   25:istore_2        
	//*  15   26:iload_2         
	//*  16   27:iload_3         
	//*  17   28:icmpge          53
			((Transition)mTransitions.get(i)).setEpicenterCallback(epicentercallback);
	//   18   31:aload_0         
	//   19   32:getfield        #27  <Field ArrayList mTransitions>
	//   20   35:iload_2         
	//   21   36:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   22   39:checkcast       #4   <Class Transition>
	//   23   42:aload_1         
	//   24   43:invokevirtual   #129 <Method void Transition.setEpicenterCallback(Transition$EpicenterCallback)>

	//   25   46:iload_2         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_2        
	//*  29   50:goto            26
	//   30   53:return          
	}

	public volatile Transition setInterpolator(TimeInterpolator timeinterpolator)
	{
		return ((Transition) (setInterpolator(timeinterpolator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #225 <Method TransitionSet setInterpolator(TimeInterpolator)>
	//    3    5:areturn         
	}

	public TransitionSet setInterpolator(TimeInterpolator timeinterpolator)
	{
		mChangeFlags = mChangeFlags | 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int mChangeFlags>
	//    3    5:iconst_1        
	//    4    6:ior             
	//    5    7:putfield        #33  <Field int mChangeFlags>
		ArrayList arraylist = mTransitions;
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field ArrayList mTransitions>
	//    8   14:astore          4
		if(arraylist != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          57
		{
			int j = arraylist.size();
	//   11   21:aload           4
	//   12   23:invokevirtual   #60  <Method int ArrayList.size()>
	//   13   26:istore_3        
			for(int i = 0; i < j; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:iload_3         
	//*  18   31:icmpge          57
				((Transition)mTransitions.get(i)).setInterpolator(timeinterpolator);
	//   19   34:aload_0         
	//   20   35:getfield        #27  <Field ArrayList mTransitions>
	//   21   38:iload_2         
	//   22   39:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   23   42:checkcast       #4   <Class Transition>
	//   24   45:aload_1         
	//   25   46:invokevirtual   #105 <Method Transition Transition.setInterpolator(TimeInterpolator)>
	//   26   49:pop             

	//   27   50:iload_2         
	//   28   51:iconst_1        
	//   29   52:iadd            
	//   30   53:istore_2        
		}
	//*  31   54:goto            29
		return (TransitionSet)super.setInterpolator(timeinterpolator);
	//   32   57:aload_0         
	//   33   58:aload_1         
	//   34   59:invokespecial   #105 <Method Transition Transition.setInterpolator(TimeInterpolator)>
	//   35   62:checkcast       #2   <Class TransitionSet>
	//   36   65:areturn         
	}

	public TransitionSet setOrdering(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 64
	//	               1 57
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   24:new             #229 <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #230 <Method void StringBuilder()>
	//    5   31:astore_2        
			stringbuilder.append("Invalid parameter for TransitionSet ordering: ");
	//    6   32:aload_2         
	//    7   33:ldc1            #232 <String "Invalid parameter for TransitionSet ordering: ">
	//    8   35:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			stringbuilder.append(i);
	//   10   39:aload_2         
	//   11   40:iload_1         
	//   12   41:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			throw new AndroidRuntimeException(stringbuilder.toString());
	//   14   45:new             #241 <Class AndroidRuntimeException>
	//   15   48:dup             
	//   16   49:aload_2         
	//   17   50:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   18   53:invokespecial   #248 <Method void AndroidRuntimeException(String)>
	//   19   56:athrow          

		case 1: // '\001'
			mPlayTogether = false;
	//   20   57:aload_0         
	//   21   58:iconst_0        
	//   22   59:putfield        #29  <Field boolean mPlayTogether>
			return this;
	//   23   62:aload_0         
	//   24   63:areturn         

		case 0: // '\0'
			mPlayTogether = true;
	//   25   64:aload_0         
	//   26   65:iconst_1        
	//   27   66:putfield        #29  <Field boolean mPlayTogether>
			return this;
	//   28   69:aload_0         
	//   29   70:areturn         
		}
	}

	public void setPathMotion(PathMotion pathmotion)
	{
		super.setPathMotion(pathmotion);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void Transition.setPathMotion(PathMotion)>
		mChangeFlags = mChangeFlags | 4;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field int mChangeFlags>
	//    6   10:iconst_4        
	//    7   11:ior             
	//    8   12:putfield        #33  <Field int mChangeFlags>
		for(int i = 0; i < mTransitions.size(); i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:aload_0         
	//*  13   19:getfield        #27  <Field ArrayList mTransitions>
	//*  14   22:invokevirtual   #60  <Method int ArrayList.size()>
	//*  15   25:icmpge          50
			((Transition)mTransitions.get(i)).setPathMotion(pathmotion);
	//   16   28:aload_0         
	//   17   29:getfield        #27  <Field ArrayList mTransitions>
	//   18   32:iload_2         
	//   19   33:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   20   36:checkcast       #4   <Class Transition>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #121 <Method void Transition.setPathMotion(PathMotion)>

	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_2        
	//*  27   47:goto            17
	//   28   50:return          
	}

	public void setPropagation(TransitionPropagation transitionpropagation)
	{
		super.setPropagation(transitionpropagation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void Transition.setPropagation(TransitionPropagation)>
		mChangeFlags = mChangeFlags | 2;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field int mChangeFlags>
	//    6   10:iconst_2        
	//    7   11:ior             
	//    8   12:putfield        #33  <Field int mChangeFlags>
		int j = mTransitions.size();
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field ArrayList mTransitions>
	//   11   19:invokevirtual   #60  <Method int ArrayList.size()>
	//   12   22:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          52
			((Transition)mTransitions.get(i)).setPropagation(transitionpropagation);
	//   18   30:aload_0         
	//   19   31:getfield        #27  <Field ArrayList mTransitions>
	//   20   34:iload_2         
	//   21   35:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #4   <Class Transition>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #113 <Method void Transition.setPropagation(TransitionPropagation)>

	//   25   45:iload_2         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_2        
	//*  29   49:goto            25
	//   30   52:return          
	}

	public volatile Transition setStartDelay(long l)
	{
		return ((Transition) (setStartDelay(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #250 <Method TransitionSet setStartDelay(long)>
	//    3    5:areturn         
	}

	public TransitionSet setStartDelay(long l)
	{
		return (TransitionSet)super.setStartDelay(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #177 <Method Transition Transition.setStartDelay(long)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	String toString(String s)
	{
		Object obj = ((Object) (super.toString(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #253 <Method String Transition.toString(String)>
	//    3    5:astore_3        
		for(int i = 0; i < mTransitions.size(); i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:aload_0         
	//*   8   10:getfield        #27  <Field ArrayList mTransitions>
	//*   9   13:invokevirtual   #60  <Method int ArrayList.size()>
	//*  10   16:icmpge          108
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #229 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #230 <Method void StringBuilder()>
	//   14   26:astore          4
			stringbuilder.append(((String) (obj)));
	//   15   28:aload           4
	//   16   30:aload_3         
	//   17   31:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append("\n");
	//   19   35:aload           4
	//   20   37:ldc1            #255 <String "\n">
	//   21   39:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			obj = ((Object) ((Transition)mTransitions.get(i)));
	//   23   43:aload_0         
	//   24   44:getfield        #27  <Field ArrayList mTransitions>
	//   25   47:iload_2         
	//   26   48:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   27   51:checkcast       #4   <Class Transition>
	//   28   54:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   29   55:new             #229 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #230 <Method void StringBuilder()>
	//   32   62:astore          5
			stringbuilder1.append(s);
	//   33   64:aload           5
	//   34   66:aload_1         
	//   35   67:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			stringbuilder1.append("  ");
	//   37   71:aload           5
	//   38   73:ldc2            #257 <String "  ">
	//   39   76:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   40   79:pop             
			stringbuilder.append(((Transition) (obj)).toString(stringbuilder1.toString()));
	//   41   80:aload           4
	//   42   82:aload_3         
	//   43   83:aload           5
	//   44   85:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   45   88:invokevirtual   #253 <Method String Transition.toString(String)>
	//   46   91:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   48   95:aload           4
	//   49   97:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   50  100:astore_3        
		}

	//   51  101:iload_2         
	//   52  102:iconst_1        
	//   53  103:iadd            
	//   54  104:istore_2        
	//*  55  105:goto            8
		return ((String) (obj));
	//   56  108:aload_3         
	//   57  109:areturn         
	}

	private int mChangeFlags;
	int mCurrentListeners;
	private boolean mPlayTogether;
	boolean mStarted;
	private ArrayList mTransitions;
}
