// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.transition:
//			Transition, Styleable, TransitionValues, TransitionValuesMaps, 
//			PathMotion, TransitionPropagation, TransitionListenerAdapter

public class TransitionSet extends Transition
{

	public TransitionSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Transition()>
		mTransitions = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field ArrayList mTransitions>
		mPlayTogether = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #32  <Field boolean mPlayTogether>
		mStarted = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #34  <Field boolean mStarted>
	//   13   25:return          
	}

	public TransitionSet(Context context, AttributeSet attributeset)
	{
		((Transition)this).Transition(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void Transition(Context, AttributeSet)>
		mTransitions = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #27  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #28  <Method void ArrayList()>
	//    8   14:putfield        #30  <Field ArrayList mTransitions>
		mPlayTogether = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #32  <Field boolean mPlayTogether>
		mStarted = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #34  <Field boolean mStarted>
		context = ((Context) (context.obtainStyledAttributes(attributeset, Styleable.TRANSITION_SET)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:getstatic       #44  <Field int[] Styleable.TRANSITION_SET>
	//   18   32:invokevirtual   #50  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   19   35:astore_1        
		setOrdering(TypedArrayUtils.getNamedInt(((TypedArray) (context)), ((org.xmlpull.v1.XmlPullParser) ((XmlResourceParser)attributeset)), "transitionOrdering", 0, 0));
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:checkcast       #52  <Class XmlResourceParser>
	//   24   42:ldc1            #54  <String "transitionOrdering">
	//   25   44:iconst_0        
	//   26   45:iconst_0        
	//   27   46:invokestatic    #60  <Method int TypedArrayUtils.getNamedInt(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//   28   49:invokevirtual   #64  <Method TransitionSet setOrdering(int)>
	//   29   52:pop             
		((TypedArray) (context)).recycle();
	//   30   53:aload_1         
	//   31   54:invokevirtual   #69  <Method void TypedArray.recycle()>
	//   32   57:return          
	}

	private void setupStartEndListeners()
	{
		TransitionSetListener transitionsetlistener = new TransitionSetListener(this);
	//    0    0:new             #8   <Class TransitionSet$TransitionSetListener>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #82  <Method void TransitionSet$TransitionSetListener(TransitionSet)>
	//    4    8:astore_1        
		for(Iterator iterator = mTransitions.iterator(); iterator.hasNext(); ((Transition)iterator.next()).addListener(((Transition.TransitionListener) (transitionsetlistener))));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field ArrayList mTransitions>
	//    7   13:invokevirtual   #86  <Method Iterator ArrayList.iterator()>
	//    8   16:astore_2        
	//    9   17:aload_2         
	//   10   18:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            43
	//   12   26:aload_2         
	//   13   27:invokeinterface #96  <Method Object Iterator.next()>
	//   14   32:checkcast       #4   <Class Transition>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #100 <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   17   39:pop             
	//*  18   40:goto            17
		mCurrentListeners = mTransitions.size();
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #30  <Field ArrayList mTransitions>
	//   22   48:invokevirtual   #104 <Method int ArrayList.size()>
	//   23   51:putfield        #77  <Field int mCurrentListeners>
	//   24   54:return          
	}

	public volatile Transition addListener(Transition.TransitionListener transitionlistener)
	{
		return ((Transition) (addListener(transitionlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #108 <Method TransitionSet addListener(Transition$TransitionListener)>
	//    3    5:areturn         
	}

	public TransitionSet addListener(Transition.TransitionListener transitionlistener)
	{
		return (TransitionSet)((Transition)this).addListener(transitionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method Transition Transition.addListener(Transition$TransitionListener)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public volatile Transition addTarget(int i)
	{
		return ((Transition) (addTarget(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #115 <Method TransitionSet addTarget(int)>
	//    3    5:areturn         
	}

	public volatile Transition addTarget(View view)
	{
		return ((Transition) (addTarget(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method TransitionSet addTarget(View)>
	//    3    5:areturn         
	}

	public volatile Transition addTarget(Class class1)
	{
		return ((Transition) (addTarget(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #123 <Method TransitionSet addTarget(Class)>
	//    3    5:areturn         
	}

	public volatile Transition addTarget(String s)
	{
		return ((Transition) (addTarget(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #127 <Method TransitionSet addTarget(String)>
	//    3    5:areturn         
	}

	public TransitionSet addTarget(int i)
	{
		for(int j = 0; j < mTransitions.size(); j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(j)).addTarget(i);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #133 <Method Transition Transition.addTarget(int)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(i);
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:invokespecial   #133 <Method Transition Transition.addTarget(int)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet addTarget(View view)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).addTarget(view);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #135 <Method Transition Transition.addTarget(View)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(view);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #135 <Method Transition Transition.addTarget(View)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet addTarget(Class class1)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).addTarget(class1);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #137 <Method Transition Transition.addTarget(Class)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(class1);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #137 <Method Transition Transition.addTarget(Class)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet addTarget(String s)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).addTarget(s);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #139 <Method Transition Transition.addTarget(String)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(s);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #139 <Method Transition Transition.addTarget(String)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet addTransition(Transition transition)
	{
		mTransitions.add(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList mTransitions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		transition.mParent = this;
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:putfield        #149 <Field TransitionSet Transition.mParent>
		if(mDuration >= 0L)
	//*   8   14:aload_0         
	//*   9   15:getfield        #153 <Field long mDuration>
	//*  10   18:lconst_0        
	//*  11   19:lcmp            
	//*  12   20:iflt            32
			transition.setDuration(mDuration);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #153 <Field long mDuration>
	//   16   28:invokevirtual   #157 <Method Transition Transition.setDuration(long)>
	//   17   31:pop             
		return this;
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	protected void cancel()
	{
		((Transition)this).cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void Transition.cancel()>
		int j = mTransitions.size();
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field ArrayList mTransitions>
	//    4    8:invokevirtual   #104 <Method int ArrayList.size()>
	//    5   11:istore_2        
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          40
			((Transition)mTransitions.get(i)).cancel();
	//   11   19:aload_0         
	//   12   20:getfield        #30  <Field ArrayList mTransitions>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #4   <Class Transition>
	//   16   30:invokevirtual   #164 <Method void Transition.cancel()>

	//   17   33:iload_1         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_1        
	//*  21   37:goto            14
	//   22   40:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		if(isValidTarget(transitionvalues.view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #172 <Field View TransitionValues.view>
	//*   3    5:invokevirtual   #176 <Method boolean isValidTarget(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = mTransitions.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field ArrayList mTransitions>
	//    7   15:invokevirtual   #86  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #96  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.isValidTarget(transitionvalues.view))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #172 <Field View TransitionValues.view>
	//*  19   43:invokevirtual   #177 <Method boolean Transition.isValidTarget(View)>
	//*  20   46:ifeq            19
				{
					transition.captureEndValues(transitionvalues);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #179 <Method void Transition.captureEndValues(TransitionValues)>
					transitionvalues.mTargetedTransitions.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #182 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #145 <Method boolean ArrayList.add(Object)>
	//   28   62:pop             
				}
			} while(true);
	//   29   63:goto            19
		}
	//   30   66:return          
	}

	void capturePropagationValues(TransitionValues transitionvalues)
	{
		((Transition)this).capturePropagationValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void Transition.capturePropagationValues(TransitionValues)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).capturePropagationValues(transitionvalues);
	//   12   20:aload_0         
	//   13   21:getfield        #30  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #185 <Method void Transition.capturePropagationValues(TransitionValues)>

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
	//*   2    2:getfield        #172 <Field View TransitionValues.view>
	//*   3    5:invokevirtual   #176 <Method boolean isValidTarget(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = mTransitions.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field ArrayList mTransitions>
	//    7   15:invokevirtual   #86  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #96  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.isValidTarget(transitionvalues.view))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #172 <Field View TransitionValues.view>
	//*  19   43:invokevirtual   #177 <Method boolean Transition.isValidTarget(View)>
	//*  20   46:ifeq            19
				{
					transition.captureStartValues(transitionvalues);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #188 <Method void Transition.captureStartValues(TransitionValues)>
					transitionvalues.mTargetedTransitions.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #182 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #145 <Method boolean ArrayList.add(Object)>
	//   28   62:pop             
				}
			} while(true);
	//   29   63:goto            19
		}
	//   30   66:return          
	}

	public Transition clone()
	{
		TransitionSet transitionset = (TransitionSet)((Transition)this).clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method Transition Transition.clone()>
	//    2    4:checkcast       #2   <Class TransitionSet>
	//    3    7:astore_3        
		transitionset.mTransitions = new ArrayList();
	//    4    8:aload_3         
	//    5    9:new             #27  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #28  <Method void ArrayList()>
	//    8   16:putfield        #30  <Field ArrayList mTransitions>
		int j = mTransitions.size();
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field ArrayList mTransitions>
	//   11   23:invokevirtual   #104 <Method int ArrayList.size()>
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
	//   20   36:getfield        #30  <Field ArrayList mTransitions>
	//   21   39:iload_1         
	//   22   40:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #4   <Class Transition>
	//   24   46:invokevirtual   #192 <Method Transition Transition.clone()>
	//   25   49:invokevirtual   #194 <Method TransitionSet addTransition(Transition)>
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
	//    1    1:invokevirtual   #197 <Method Transition clone()>
	//    2    4:areturn         
	}

	protected void createAnimators(ViewGroup viewgroup, TransitionValuesMaps transitionvaluesmaps, TransitionValuesMaps transitionvaluesmaps1, ArrayList arraylist, ArrayList arraylist1)
	{
		long l = getStartDelay();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method long getStartDelay()>
	//    2    4:lstore          8
		int j = mTransitions.size();
	//    3    6:aload_0         
	//    4    7:getfield        #30  <Field ArrayList mTransitions>
	//    5   10:invokevirtual   #104 <Method int ArrayList.size()>
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
	//   13   26:getfield        #30  <Field ArrayList mTransitions>
	//   14   29:iload           6
	//   15   31:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   34:checkcast       #4   <Class Transition>
	//   17   37:astore          12
			if(l > 0L && (mPlayTogether || i == 0))
	//*  18   39:lload           8
	//*  19   41:lconst_0        
	//*  20   42:lcmp            
	//*  21   43:ifle            94
	//*  22   46:aload_0         
	//*  23   47:getfield        #32  <Field boolean mPlayTogether>
	//*  24   50:ifne            58
	//*  25   53:iload           6
	//*  26   55:ifne            94
			{
				long l1 = transition.getStartDelay();
	//   27   58:aload           12
	//   28   60:invokevirtual   #205 <Method long Transition.getStartDelay()>
	//   29   63:lstore          10
				if(l1 > 0L)
	//*  30   65:lload           10
	//*  31   67:lconst_0        
	//*  32   68:lcmp            
	//*  33   69:ifle            86
					transition.setStartDelay(l + l1);
	//   34   72:aload           12
	//   35   74:lload           8
	//   36   76:lload           10
	//   37   78:ladd            
	//   38   79:invokevirtual   #208 <Method Transition Transition.setStartDelay(long)>
	//   39   82:pop             
				else
	//*  40   83:goto            94
					transition.setStartDelay(l);
	//   41   86:aload           12
	//   42   88:lload           8
	//   43   90:invokevirtual   #208 <Method Transition Transition.setStartDelay(long)>
	//   44   93:pop             
			}
			transition.createAnimators(viewgroup, transitionvaluesmaps, transitionvaluesmaps1, arraylist, arraylist1);
	//   45   94:aload           12
	//   46   96:aload_1         
	//   47   97:aload_2         
	//   48   98:aload_3         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:invokevirtual   #210 <Method void Transition.createAnimators(ViewGroup, TransitionValuesMaps, TransitionValuesMaps, ArrayList, ArrayList)>
		}

	//   52  106:iload           6
	//   53  108:iconst_1        
	//   54  109:iadd            
	//   55  110:istore          6
	//*  56  112:goto            18
	//   57  115:return          
	}

	public Transition excludeTarget(int i, boolean flag)
	{
		for(int j = 0; j < mTransitions.size(); j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(j)).excludeTarget(i, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #216 <Method Transition Transition.excludeTarget(int, boolean)>
	//   15   29:pop             

	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_3        
	//*  20   34:goto            2
		return ((Transition)this).excludeTarget(i, flag);
	//   21   37:aload_0         
	//   22   38:iload_1         
	//   23   39:iload_2         
	//   24   40:invokespecial   #216 <Method Transition Transition.excludeTarget(int, boolean)>
	//   25   43:areturn         
	}

	public Transition excludeTarget(View view, boolean flag)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(i)).excludeTarget(view, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #219 <Method Transition Transition.excludeTarget(View, boolean)>
	//   15   29:pop             

	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_3        
	//*  20   34:goto            2
		return ((Transition)this).excludeTarget(view, flag);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokespecial   #219 <Method Transition Transition.excludeTarget(View, boolean)>
	//   25   43:areturn         
	}

	public Transition excludeTarget(Class class1, boolean flag)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(i)).excludeTarget(class1, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #222 <Method Transition Transition.excludeTarget(Class, boolean)>
	//   15   29:pop             

	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_3        
	//*  20   34:goto            2
		return ((Transition)this).excludeTarget(class1, flag);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokespecial   #222 <Method Transition Transition.excludeTarget(Class, boolean)>
	//   25   43:areturn         
	}

	public Transition excludeTarget(String s, boolean flag)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(i)).excludeTarget(s, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #225 <Method Transition Transition.excludeTarget(String, boolean)>
	//   15   29:pop             

	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_3        
	//*  20   34:goto            2
		return ((Transition)this).excludeTarget(s, flag);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokespecial   #225 <Method Transition Transition.excludeTarget(String, boolean)>
	//   25   43:areturn         
	}

	void forceToEnd(ViewGroup viewgroup)
	{
		((Transition)this).forceToEnd(viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #229 <Method void Transition.forceToEnd(ViewGroup)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).forceToEnd(viewgroup);
	//   12   20:aload_0         
	//   13   21:getfield        #30  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #229 <Method void Transition.forceToEnd(ViewGroup)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public int getOrdering()
	{
		return ((int) (mPlayTogether ^ true));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean mPlayTogether>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public Transition getTransitionAt(int i)
	{
		if(i >= 0 && i < mTransitions.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            30
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field ArrayList mTransitions>
	//*   5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   12:icmplt          18
	//*   7   15:goto            30
			return (Transition)mTransitions.get(i);
	//    8   18:aload_0         
	//    9   19:getfield        #30  <Field ArrayList mTransitions>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #131 <Method Object ArrayList.get(int)>
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
	//    1    1:getfield        #30  <Field ArrayList mTransitions>
	//    2    4:invokevirtual   #104 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void pause(View view)
	{
		((Transition)this).pause(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #236 <Method void Transition.pause(View)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).pause(view);
	//   12   20:aload_0         
	//   13   21:getfield        #30  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #236 <Method void Transition.pause(View)>

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
	//    2    2:invokevirtual   #239 <Method TransitionSet removeListener(Transition$TransitionListener)>
	//    3    5:areturn         
	}

	public TransitionSet removeListener(Transition.TransitionListener transitionlistener)
	{
		return (TransitionSet)((Transition)this).removeListener(transitionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public volatile Transition removeTarget(int i)
	{
		return ((Transition) (removeTarget(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #244 <Method TransitionSet removeTarget(int)>
	//    3    5:areturn         
	}

	public volatile Transition removeTarget(View view)
	{
		return ((Transition) (removeTarget(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #246 <Method TransitionSet removeTarget(View)>
	//    3    5:areturn         
	}

	public volatile Transition removeTarget(Class class1)
	{
		return ((Transition) (removeTarget(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #248 <Method TransitionSet removeTarget(Class)>
	//    3    5:areturn         
	}

	public volatile Transition removeTarget(String s)
	{
		return ((Transition) (removeTarget(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #250 <Method TransitionSet removeTarget(String)>
	//    3    5:areturn         
	}

	public TransitionSet removeTarget(int i)
	{
		for(int j = 0; j < mTransitions.size(); j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(j)).removeTarget(i);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #252 <Method Transition Transition.removeTarget(int)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(i);
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:invokespecial   #252 <Method Transition Transition.removeTarget(int)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet removeTarget(View view)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).removeTarget(view);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #254 <Method Transition Transition.removeTarget(View)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(view);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #254 <Method Transition Transition.removeTarget(View)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet removeTarget(Class class1)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).removeTarget(class1);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #256 <Method Transition Transition.removeTarget(Class)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(class1);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #256 <Method Transition Transition.removeTarget(Class)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet removeTarget(String s)
	{
		for(int i = 0; i < mTransitions.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field ArrayList mTransitions>
	//*   5    7:invokevirtual   #104 <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).removeTarget(s);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #258 <Method Transition Transition.removeTarget(String)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(s);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #258 <Method Transition Transition.removeTarget(String)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet removeTransition(Transition transition)
	{
		mTransitions.remove(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList mTransitions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #262 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		transition.mParent = null;
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:putfield        #149 <Field TransitionSet Transition.mParent>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public void resume(View view)
	{
		((Transition)this).resume(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #265 <Method void Transition.resume(View)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).resume(view);
	//   12   20:aload_0         
	//   13   21:getfield        #30  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #265 <Method void Transition.resume(View)>

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
	//*   1    1:getfield        #30  <Field ArrayList mTransitions>
	//*   2    4:invokevirtual   #269 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            19
		{
			start();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #272 <Method void start()>
			end();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #275 <Method void end()>
			return;
	//    8   18:return          
		}
		setupStartEndListeners();
	//    9   19:aload_0         
	//   10   20:invokespecial   #277 <Method void setupStartEndListeners()>
		if(!mPlayTogether)
	//*  11   23:aload_0         
	//*  12   24:getfield        #32  <Field boolean mPlayTogether>
	//*  13   27:ifne            107
		{
			for(int i = 1; i < mTransitions.size(); i++)
	//*  14   30:iconst_1        
	//*  15   31:istore_1        
	//*  16   32:iload_1         
	//*  17   33:aload_0         
	//*  18   34:getfield        #30  <Field ArrayList mTransitions>
	//*  19   37:invokevirtual   #104 <Method int ArrayList.size()>
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
	//   22   44:getfield        #30  <Field ArrayList mTransitions>
	//   23   47:iload_1         
	//   24   48:iconst_1        
	//   25   49:isub            
	//   26   50:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #4   <Class Transition>
	//   28   56:new             #6   <Class TransitionSet$1>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:getfield        #30  <Field ArrayList mTransitions>
	//   33   65:iload_1         
	//   34   66:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   35   69:checkcast       #4   <Class Transition>
	//   36   72:invokespecial   #280 <Method void TransitionSet$1(TransitionSet, Transition)>
	//   37   75:invokevirtual   #100 <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   38   78:pop             

	//   39   79:iload_1         
	//   40   80:iconst_1        
	//   41   81:iadd            
	//   42   82:istore_1        
	//*  43   83:goto            32
			Transition transition = (Transition)mTransitions.get(0);
	//   44   86:aload_0         
	//   45   87:getfield        #30  <Field ArrayList mTransitions>
	//   46   90:iconst_0        
	//   47   91:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   48   94:checkcast       #4   <Class Transition>
	//   49   97:astore_2        
			if(transition != null)
	//*  50   98:aload_2         
	//*  51   99:ifnull          139
			{
				transition.runAnimators();
	//   52  102:aload_2         
	//   53  103:invokevirtual   #282 <Method void Transition.runAnimators()>
				return;
	//   54  106:return          
			}
		} else
		{
			for(Iterator iterator = mTransitions.iterator(); iterator.hasNext(); ((Transition)iterator.next()).runAnimators());
	//   55  107:aload_0         
	//   56  108:getfield        #30  <Field ArrayList mTransitions>
	//   57  111:invokevirtual   #86  <Method Iterator ArrayList.iterator()>
	//   58  114:astore_2        
	//   59  115:aload_2         
	//   60  116:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   61  121:ifeq            139
	//   62  124:aload_2         
	//   63  125:invokeinterface #96  <Method Object Iterator.next()>
	//   64  130:checkcast       #4   <Class Transition>
	//   65  133:invokevirtual   #282 <Method void Transition.runAnimators()>
		}
	//*  66  136:goto            115
	//   67  139:return          
	}

	void setCanRemoveViews(boolean flag)
	{
		((Transition)this).setCanRemoveViews(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #286 <Method void Transition.setCanRemoveViews(boolean)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).setCanRemoveViews(flag);
	//   12   20:aload_0         
	//   13   21:getfield        #30  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #286 <Method void Transition.setCanRemoveViews(boolean)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public volatile Transition setDuration(long l)
	{
		return ((Transition) (setDuration(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #289 <Method TransitionSet setDuration(long)>
	//    3    5:areturn         
	}

	public TransitionSet setDuration(long l)
	{
		((Transition)this).setDuration(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #157 <Method Transition Transition.setDuration(long)>
	//    3    5:pop             
		if(mDuration >= 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #153 <Field long mDuration>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:iflt            55
		{
			int j = mTransitions.size();
	//    9   15:aload_0         
	//   10   16:getfield        #30  <Field ArrayList mTransitions>
	//   11   19:invokevirtual   #104 <Method int ArrayList.size()>
	//   12   22:istore          4
			for(int i = 0; i < j; i++)
	//*  13   24:iconst_0        
	//*  14   25:istore_3        
	//*  15   26:iload_3         
	//*  16   27:iload           4
	//*  17   29:icmpge          55
				((Transition)mTransitions.get(i)).setDuration(l);
	//   18   32:aload_0         
	//   19   33:getfield        #30  <Field ArrayList mTransitions>
	//   20   36:iload_3         
	//   21   37:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   22   40:checkcast       #4   <Class Transition>
	//   23   43:lload_1         
	//   24   44:invokevirtual   #157 <Method Transition Transition.setDuration(long)>
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
		((Transition)this).setEpicenterCallback(epicentercallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #293 <Method void Transition.setEpicenterCallback(Transition$EpicenterCallback)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).setEpicenterCallback(epicentercallback);
	//   12   20:aload_0         
	//   13   21:getfield        #30  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #293 <Method void Transition.setEpicenterCallback(Transition$EpicenterCallback)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public volatile Transition setInterpolator(TimeInterpolator timeinterpolator)
	{
		return ((Transition) (setInterpolator(timeinterpolator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #299 <Method TransitionSet setInterpolator(TimeInterpolator)>
	//    3    5:areturn         
	}

	public TransitionSet setInterpolator(TimeInterpolator timeinterpolator)
	{
		return (TransitionSet)((Transition)this).setInterpolator(timeinterpolator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #301 <Method Transition Transition.setInterpolator(TimeInterpolator)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public TransitionSet setOrdering(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 65
	//	               1 58
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   24:new             #303 <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #304 <Method void StringBuilder()>
	//    5   31:astore_2        
			stringbuilder.append("Invalid parameter for TransitionSet ordering: ");
	//    6   32:aload_2         
	//    7   33:ldc2            #306 <String "Invalid parameter for TransitionSet ordering: ">
	//    8   36:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//    9   39:pop             
			stringbuilder.append(i);
	//   10   40:aload_2         
	//   11   41:iload_1         
	//   12   42:invokevirtual   #313 <Method StringBuilder StringBuilder.append(int)>
	//   13   45:pop             
			throw new AndroidRuntimeException(stringbuilder.toString());
	//   14   46:new             #315 <Class AndroidRuntimeException>
	//   15   49:dup             
	//   16   50:aload_2         
	//   17   51:invokevirtual   #319 <Method String StringBuilder.toString()>
	//   18   54:invokespecial   #322 <Method void AndroidRuntimeException(String)>
	//   19   57:athrow          

		case 1: // '\001'
			mPlayTogether = false;
	//   20   58:aload_0         
	//   21   59:iconst_0        
	//   22   60:putfield        #32  <Field boolean mPlayTogether>
			return this;
	//   23   63:aload_0         
	//   24   64:areturn         

		case 0: // '\0'
			mPlayTogether = true;
	//   25   65:aload_0         
	//   26   66:iconst_1        
	//   27   67:putfield        #32  <Field boolean mPlayTogether>
			return this;
	//   28   70:aload_0         
	//   29   71:areturn         
		}
	}

	public void setPathMotion(PathMotion pathmotion)
	{
		((Transition)this).setPathMotion(pathmotion);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #326 <Method void Transition.setPathMotion(PathMotion)>
		for(int i = 0; i < mTransitions.size(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #30  <Field ArrayList mTransitions>
	//*   8   12:invokevirtual   #104 <Method int ArrayList.size()>
	//*   9   15:icmpge          40
			((Transition)mTransitions.get(i)).setPathMotion(pathmotion);
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field ArrayList mTransitions>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #4   <Class Transition>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #326 <Method void Transition.setPathMotion(PathMotion)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            7
	//   22   40:return          
	}

	public void setPropagation(TransitionPropagation transitionpropagation)
	{
		((Transition)this).setPropagation(transitionpropagation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #330 <Method void Transition.setPropagation(TransitionPropagation)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #104 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((Transition)mTransitions.get(i)).setPropagation(transitionpropagation);
	//   12   20:aload_0         
	//   13   21:getfield        #30  <Field ArrayList mTransitions>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #330 <Method void Transition.setPropagation(TransitionPropagation)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	volatile Transition setSceneRoot(ViewGroup viewgroup)
	{
		return ((Transition) (setSceneRoot(viewgroup)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #335 <Method TransitionSet setSceneRoot(ViewGroup)>
	//    3    5:areturn         
	}

	TransitionSet setSceneRoot(ViewGroup viewgroup)
	{
		((Transition)this).setSceneRoot(viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #337 <Method Transition Transition.setSceneRoot(ViewGroup)>
	//    3    5:pop             
		int j = mTransitions.size();
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field ArrayList mTransitions>
	//    6   10:invokevirtual   #104 <Method int ArrayList.size()>
	//    7   13:istore_3        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:iload_3         
	//*  12   18:icmpge          44
			((Transition)mTransitions.get(i)).setSceneRoot(viewgroup);
	//   13   21:aload_0         
	//   14   22:getfield        #30  <Field ArrayList mTransitions>
	//   15   25:iload_2         
	//   16   26:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #4   <Class Transition>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #337 <Method Transition Transition.setSceneRoot(ViewGroup)>
	//   20   36:pop             

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            16
		return this;
	//   26   44:aload_0         
	//   27   45:areturn         
	}

	public volatile Transition setStartDelay(long l)
	{
		return ((Transition) (setStartDelay(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #339 <Method TransitionSet setStartDelay(long)>
	//    3    5:areturn         
	}

	public TransitionSet setStartDelay(long l)
	{
		return (TransitionSet)((Transition)this).setStartDelay(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #208 <Method Transition Transition.setStartDelay(long)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	String toString(String s)
	{
		Object obj = ((Object) (((Transition)this).toString(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #342 <Method String Transition.toString(String)>
	//    3    5:astore_3        
		for(int i = 0; i < mTransitions.size(); i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:aload_0         
	//*   8   10:getfield        #30  <Field ArrayList mTransitions>
	//*   9   13:invokevirtual   #104 <Method int ArrayList.size()>
	//*  10   16:icmpge          109
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #303 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #304 <Method void StringBuilder()>
	//   14   26:astore          4
			stringbuilder.append(((String) (obj)));
	//   15   28:aload           4
	//   16   30:aload_3         
	//   17   31:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append("\n");
	//   19   35:aload           4
	//   20   37:ldc2            #344 <String "\n">
	//   21   40:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			obj = ((Object) ((Transition)mTransitions.get(i)));
	//   23   44:aload_0         
	//   24   45:getfield        #30  <Field ArrayList mTransitions>
	//   25   48:iload_2         
	//   26   49:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//   27   52:checkcast       #4   <Class Transition>
	//   28   55:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   29   56:new             #303 <Class StringBuilder>
	//   30   59:dup             
	//   31   60:invokespecial   #304 <Method void StringBuilder()>
	//   32   63:astore          5
			stringbuilder1.append(s);
	//   33   65:aload           5
	//   34   67:aload_1         
	//   35   68:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
			stringbuilder1.append("  ");
	//   37   72:aload           5
	//   38   74:ldc2            #346 <String "  ">
	//   39   77:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
			stringbuilder.append(((Transition) (obj)).toString(stringbuilder1.toString()));
	//   41   81:aload           4
	//   42   83:aload_3         
	//   43   84:aload           5
	//   44   86:invokevirtual   #319 <Method String StringBuilder.toString()>
	//   45   89:invokevirtual   #342 <Method String Transition.toString(String)>
	//   46   92:invokevirtual   #310 <Method StringBuilder StringBuilder.append(String)>
	//   47   95:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   48   96:aload           4
	//   49   98:invokevirtual   #319 <Method String StringBuilder.toString()>
	//   50  101:astore_3        
		}

	//   51  102:iload_2         
	//   52  103:iconst_1        
	//   53  104:iadd            
	//   54  105:istore_2        
	//*  55  106:goto            8
		return ((String) (obj));
	//   56  109:aload_3         
	//   57  110:areturn         
	}

	public static final int ORDERING_SEQUENTIAL = 1;
	public static final int ORDERING_TOGETHER = 0;
	private int mCurrentListeners;
	private boolean mPlayTogether;
	private boolean mStarted;
	private ArrayList mTransitions;


/*
	static boolean access$000(TransitionSet transitionset)
	{
		return transitionset.mStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean mStarted>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(TransitionSet transitionset, boolean flag)
	{
		transitionset.mStarted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean mStarted>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$100(TransitionSet transitionset)
	{
		return transitionset.mCurrentListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mCurrentListeners>
	//    2    4:ireturn         
	}

*/


/*
	static int access$106(TransitionSet transitionset)
	{
		int i = transitionset.mCurrentListeners - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mCurrentListeners>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		transitionset.mCurrentListeners = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #77  <Field int mCurrentListeners>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/
}
