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
import o.an;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues

public class TransitionSet extends Transition
{
	static class a extends Transition.TransitionListenerAdapter
	{

		public void onTransitionEnd(Transition transition)
		{
			int i = 
// JavaClassFileOutputException: get_constant: invalid tag

		public void onTransitionStart(Transition transition)
		{
			if(!a.mStarted)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field TransitionSet a>
		//*   2    4:invokestatic    #45  <Method boolean TransitionSet.access$000(TransitionSet)>
		//*   3    7:ifne            26
			{
				a.start();
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field TransitionSet a>
		//    6   14:invokevirtual   #48  <Method void TransitionSet.start()>
				a.mStarted = true;
		//    7   17:aload_0         
		//    8   18:getfield        #15  <Field TransitionSet a>
		//    9   21:iconst_1        
		//   10   22:invokestatic    #30  <Method boolean TransitionSet.access$002(TransitionSet, boolean)>
		//   11   25:pop             
			}
		//   12   26:return          
		}

		TransitionSet a;

		a(TransitionSet transitionset)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Transition$TransitionListenerAdapter()>
			a = transitionset;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field TransitionSet a>
		//    5    9:return          
		}
	}


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

	private void setupStartEndListeners()
	{
		a a1 = new a(this);
	//    0    0:new             #8   <Class TransitionSet$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #48  <Method void TransitionSet$a(TransitionSet)>
	//    4    8:astore_1        
		for(Iterator iterator = mTransitions.iterator(); iterator.hasNext(); ((Transition)iterator.next()).addListener(((Transition.TransitionListener) (a1))));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field ArrayList mTransitions>
	//    7   13:invokevirtual   #52  <Method Iterator ArrayList.iterator()>
	//    8   16:astore_2        
	//    9   17:aload_2         
	//   10   18:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            43
	//   12   26:aload_2         
	//   13   27:invokeinterface #62  <Method Object Iterator.next()>
	//   14   32:checkcast       #4   <Class Transition>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #66  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//   17   39:pop             
	//*  18   40:goto            17
		mCurrentListeners = mTransitions.size();
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #30  <Field ArrayList mTransitions>
	//   22   48:invokevirtual   #70  <Method int ArrayList.size()>
	//   23   51:putfield        #43  <Field int mCurrentListeners>
	//   24   54:return          
	}

	public volatile Transition addListener(Transition.TransitionListener transitionlistener)
	{
		return ((Transition) (addListener(transitionlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #74  <Method TransitionSet addListener(Transition$TransitionListener)>
	//    3    5:areturn         
	}

	public TransitionSet addListener(Transition.TransitionListener transitionlistener)
	{
		return (TransitionSet)((Transition)this).addListener(transitionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method Transition Transition.addListener(Transition$TransitionListener)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public volatile Transition addTarget(int i)
	{
		return ((Transition) (addTarget(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method TransitionSet addTarget(int)>
	//    3    5:areturn         
	}

	public volatile Transition addTarget(View view)
	{
		return ((Transition) (addTarget(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method TransitionSet addTarget(View)>
	//    3    5:areturn         
	}

	public volatile Transition addTarget(Class class1)
	{
		return ((Transition) (addTarget(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method TransitionSet addTarget(Class)>
	//    3    5:areturn         
	}

	public volatile Transition addTarget(String s)
	{
		return ((Transition) (addTarget(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #94  <Method TransitionSet addTarget(String)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(j)).addTarget(i);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #100 <Method Transition Transition.addTarget(int)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(i);
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:invokespecial   #100 <Method Transition Transition.addTarget(int)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).addTarget(view);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #102 <Method Transition Transition.addTarget(View)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(view);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #102 <Method Transition Transition.addTarget(View)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).addTarget(class1);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #104 <Method Transition Transition.addTarget(Class)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(class1);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #104 <Method Transition Transition.addTarget(Class)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).addTarget(s);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #106 <Method Transition Transition.addTarget(String)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).addTarget(s);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #106 <Method Transition Transition.addTarget(String)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet addTransition(Transition transition)
	{
		mTransitions.add(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList mTransitions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		transition.mParent = this;
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:putfield        #116 <Field TransitionSet Transition.mParent>
		if(mDuration >= 0L)
	//*   8   14:aload_0         
	//*   9   15:getfield        #120 <Field long mDuration>
	//*  10   18:lconst_0        
	//*  11   19:lcmp            
	//*  12   20:iflt            32
			transition.setDuration(mDuration);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #120 <Field long mDuration>
	//   16   28:invokevirtual   #124 <Method Transition Transition.setDuration(long)>
	//   17   31:pop             
		return this;
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	protected void cancel()
	{
		((Transition)this).cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void Transition.cancel()>
		int j = mTransitions.size();
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field ArrayList mTransitions>
	//    4    8:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   14   24:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #4   <Class Transition>
	//   16   30:invokevirtual   #131 <Method void Transition.cancel()>

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
	//*   2    2:getfield        #139 <Field View TransitionValues.view>
	//*   3    5:invokevirtual   #143 <Method boolean isValidTarget(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = mTransitions.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field ArrayList mTransitions>
	//    7   15:invokevirtual   #52  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #62  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.isValidTarget(transitionvalues.view))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #139 <Field View TransitionValues.view>
	//*  19   43:invokevirtual   #144 <Method boolean Transition.isValidTarget(View)>
	//*  20   46:ifeq            63
				{
					transition.captureEndValues(transitionvalues);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #146 <Method void Transition.captureEndValues(TransitionValues)>
					transitionvalues.mTargetedTransitions.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #149 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   28   62:pop             
				}
			} while(true);
	//   29   63:goto            19
		}
	//   30   66:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		if(isValidTarget(transitionvalues.view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #139 <Field View TransitionValues.view>
	//*   3    5:invokevirtual   #143 <Method boolean isValidTarget(View)>
	//*   4    8:ifeq            66
		{
			Iterator iterator = mTransitions.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field ArrayList mTransitions>
	//    7   15:invokevirtual   #52  <Method Iterator ArrayList.iterator()>
	//    8   18:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    9   19:aload_2         
	//   10   20:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            66
				Transition transition = (Transition)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #62  <Method Object Iterator.next()>
	//   14   34:checkcast       #4   <Class Transition>
	//   15   37:astore_3        
				if(transition.isValidTarget(transitionvalues.view))
	//*  16   38:aload_3         
	//*  17   39:aload_1         
	//*  18   40:getfield        #139 <Field View TransitionValues.view>
	//*  19   43:invokevirtual   #144 <Method boolean Transition.isValidTarget(View)>
	//*  20   46:ifeq            63
				{
					transition.captureStartValues(transitionvalues);
	//   21   49:aload_3         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #152 <Method void Transition.captureStartValues(TransitionValues)>
					transitionvalues.mTargetedTransitions.add(((Object) (transition)));
	//   24   54:aload_1         
	//   25   55:getfield        #149 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
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
	//    1    1:invokespecial   #156 <Method Transition Transition.clone()>
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
	//   11   23:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   22   40:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #4   <Class Transition>
	//   24   46:invokevirtual   #156 <Method Transition Transition.clone()>
	//   25   49:invokevirtual   #158 <Method TransitionSet addTransition(Transition)>
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
	//    1    1:invokevirtual   #161 <Method Transition clone()>
	//    2    4:areturn         
	}

	protected void createAnimators(ViewGroup viewgroup, an an, an an1, ArrayList arraylist, ArrayList arraylist1)
	{
		long l = getStartDelay();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method long getStartDelay()>
	//    2    4:lstore          8
		int j = mTransitions.size();
	//    3    6:aload_0         
	//    4    7:getfield        #30  <Field ArrayList mTransitions>
	//    5   10:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   15   31:invokevirtual   #98  <Method Object ArrayList.get(int)>
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
	//   28   60:invokevirtual   #169 <Method long Transition.getStartDelay()>
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
	//   38   79:invokevirtual   #172 <Method Transition Transition.setStartDelay(long)>
	//   39   82:pop             
				else
	//*  40   83:goto            94
					transition.setStartDelay(l);
	//   41   86:aload           12
	//   42   88:lload           8
	//   43   90:invokevirtual   #172 <Method Transition Transition.setStartDelay(long)>
	//   44   93:pop             
			}
			transition.createAnimators(viewgroup, an, an1, arraylist, arraylist1);
	//   45   94:aload           12
	//   46   96:aload_1         
	//   47   97:aload_2         
	//   48   98:aload_3         
	//   49   99:aload           4
	//   50  101:aload           5
	//   51  103:invokevirtual   #174 <Method void Transition.createAnimators(ViewGroup, an, an, ArrayList, ArrayList)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(j)).excludeTarget(i, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #180 <Method Transition Transition.excludeTarget(int, boolean)>
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
	//   24   40:invokespecial   #180 <Method Transition Transition.excludeTarget(int, boolean)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(i)).excludeTarget(view, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #183 <Method Transition Transition.excludeTarget(View, boolean)>
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
	//   24   40:invokespecial   #183 <Method Transition Transition.excludeTarget(View, boolean)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(i)).excludeTarget(class1, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #186 <Method Transition Transition.excludeTarget(Class, boolean)>
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
	//   24   40:invokespecial   #186 <Method Transition Transition.excludeTarget(Class, boolean)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          37
			((Transition)mTransitions.get(i)).excludeTarget(s, flag);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #189 <Method Transition Transition.excludeTarget(String, boolean)>
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
	//   24   40:invokespecial   #189 <Method Transition Transition.excludeTarget(String, boolean)>
	//   25   43:areturn         
	}

	public int getOrdering()
	{
		return !mPlayTogether ? 1 : 0;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean mPlayTogether>
	//    2    4:ifeq            9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public Transition getTransitionAt(int i)
	{
		if(i < 0 || i >= mTransitions.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field ArrayList mTransitions>
	//*   5    9:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   12:icmplt          17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		else
			return (Transition)mTransitions.get(i);
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field ArrayList mTransitions>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #4   <Class Transition>
	//   14   28:areturn         
	}

	public int getTransitionCount()
	{
		return mTransitions.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList mTransitions>
	//    2    4:invokevirtual   #70  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void pause(View view)
	{
		((Transition)this).pause(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #196 <Method void Transition.pause(View)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   15   25:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #196 <Method void Transition.pause(View)>

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
	//    2    2:invokevirtual   #199 <Method TransitionSet removeListener(Transition$TransitionListener)>
	//    3    5:areturn         
	}

	public TransitionSet removeListener(Transition.TransitionListener transitionlistener)
	{
		return (TransitionSet)((Transition)this).removeListener(transitionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public volatile Transition removeTarget(int i)
	{
		return ((Transition) (removeTarget(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #204 <Method TransitionSet removeTarget(int)>
	//    3    5:areturn         
	}

	public volatile Transition removeTarget(View view)
	{
		return ((Transition) (removeTarget(view)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #206 <Method TransitionSet removeTarget(View)>
	//    3    5:areturn         
	}

	public volatile Transition removeTarget(Class class1)
	{
		return ((Transition) (removeTarget(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #208 <Method TransitionSet removeTarget(Class)>
	//    3    5:areturn         
	}

	public volatile Transition removeTarget(String s)
	{
		return ((Transition) (removeTarget(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method TransitionSet removeTarget(String)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(j)).removeTarget(i);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #212 <Method Transition Transition.removeTarget(int)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(i);
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:invokespecial   #212 <Method Transition Transition.removeTarget(int)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).removeTarget(view);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #214 <Method Transition Transition.removeTarget(View)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(view);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #214 <Method Transition Transition.removeTarget(View)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).removeTarget(class1);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #216 <Method Transition Transition.removeTarget(Class)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(class1);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #216 <Method Transition Transition.removeTarget(Class)>
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
	//*   5    7:invokevirtual   #70  <Method int ArrayList.size()>
	//*   6   10:icmpge          36
			((Transition)mTransitions.get(i)).removeTarget(s);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field ArrayList mTransitions>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #4   <Class Transition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #218 <Method Transition Transition.removeTarget(String)>
	//   14   28:pop             

	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_2        
	//*  19   33:goto            2
		return (TransitionSet)((Transition)this).removeTarget(s);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #218 <Method Transition Transition.removeTarget(String)>
	//   23   41:checkcast       #2   <Class TransitionSet>
	//   24   44:areturn         
	}

	public TransitionSet removeTransition(Transition transition)
	{
		mTransitions.remove(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList mTransitions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #222 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		transition.mParent = null;
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:putfield        #116 <Field TransitionSet Transition.mParent>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public void resume(View view)
	{
		((Transition)this).resume(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #225 <Method void Transition.resume(View)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   15   25:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #225 <Method void Transition.resume(View)>

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
	//*   2    4:invokevirtual   #229 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            19
		{
			start();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #232 <Method void start()>
			end();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #235 <Method void end()>
			return;
	//    8   18:return          
		}
		setupStartEndListeners();
	//    9   19:aload_0         
	//   10   20:invokespecial   #237 <Method void setupStartEndListeners()>
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
	//*  19   37:invokevirtual   #70  <Method int ArrayList.size()>
	//*  20   40:icmpge          86
				((Transition)mTransitions.get(i - 1)).addListener(((Transition.TransitionListener) (new Transition.TransitionListenerAdapter((Transition)mTransitions.get(i)) {

					public void onTransitionEnd(Transition transition1)
					{
						d.runAnimators();
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field Transition d>
					//    2    4:invokevirtual   #28  <Method void Transition.runAnimators()>
						transition1.removeListener(((Transition.TransitionListener) (this)));
					//    3    7:aload_1         
					//    4    8:aload_0         
					//    5    9:invokevirtual   #32  <Method Transition Transition.removeListener(Transition$TransitionListener)>
					//    6   12:pop             
					//    7   13:return          
					}

					final TransitionSet c;
					final Transition d;

			
			{
				c = TransitionSet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TransitionSet c>
				d = transition;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Transition d>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void Transition$TransitionListenerAdapter()>
			//    8   14:return          
			}
				}
)));
	//   21   43:aload_0         
	//   22   44:getfield        #30  <Field ArrayList mTransitions>
	//   23   47:iload_1         
	//   24   48:iconst_1        
	//   25   49:isub            
	//   26   50:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #4   <Class Transition>
	//   28   56:new             #6   <Class TransitionSet$5>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:getfield        #30  <Field ArrayList mTransitions>
	//   33   65:iload_1         
	//   34   66:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   35   69:checkcast       #4   <Class Transition>
	//   36   72:invokespecial   #240 <Method void TransitionSet$5(TransitionSet, Transition)>
	//   37   75:invokevirtual   #66  <Method Transition Transition.addListener(Transition$TransitionListener)>
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
	//   47   91:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   48   94:checkcast       #4   <Class Transition>
	//   49   97:astore_2        
			if(transition != null)
	//*  50   98:aload_2         
	//*  51   99:ifnull          106
				transition.runAnimators();
	//   52  102:aload_2         
	//   53  103:invokevirtual   #242 <Method void Transition.runAnimators()>
			return;
	//   54  106:return          
		}
		for(Iterator iterator = mTransitions.iterator(); iterator.hasNext(); ((Transition)iterator.next()).runAnimators());
	//   55  107:aload_0         
	//   56  108:getfield        #30  <Field ArrayList mTransitions>
	//   57  111:invokevirtual   #52  <Method Iterator ArrayList.iterator()>
	//   58  114:astore_2        
	//   59  115:aload_2         
	//   60  116:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   61  121:ifeq            139
	//   62  124:aload_2         
	//   63  125:invokeinterface #62  <Method Object Iterator.next()>
	//   64  130:checkcast       #4   <Class Transition>
	//   65  133:invokevirtual   #242 <Method void Transition.runAnimators()>
	//*  66  136:goto            115
	//   67  139:return          
	}

	void setCanRemoveViews(boolean flag)
	{
		((Transition)this).setCanRemoveViews(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #246 <Method void Transition.setCanRemoveViews(boolean)>
		int j = mTransitions.size();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ArrayList mTransitions>
	//    5    9:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   15   25:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class Transition>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #246 <Method void Transition.setCanRemoveViews(boolean)>

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
	//    2    2:invokevirtual   #249 <Method TransitionSet setDuration(long)>
	//    3    5:areturn         
	}

	public TransitionSet setDuration(long l)
	{
		((Transition)this).setDuration(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #124 <Method Transition Transition.setDuration(long)>
	//    3    5:pop             
		if(mDuration >= 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #120 <Field long mDuration>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:iflt            55
		{
			int j = mTransitions.size();
	//    9   15:aload_0         
	//   10   16:getfield        #30  <Field ArrayList mTransitions>
	//   11   19:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   21   37:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   22   40:checkcast       #4   <Class Transition>
	//   23   43:lload_1         
	//   24   44:invokevirtual   #124 <Method Transition Transition.setDuration(long)>
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

	public volatile Transition setInterpolator(TimeInterpolator timeinterpolator)
	{
		return ((Transition) (setInterpolator(timeinterpolator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #255 <Method TransitionSet setInterpolator(TimeInterpolator)>
	//    3    5:areturn         
	}

	public TransitionSet setInterpolator(TimeInterpolator timeinterpolator)
	{
		return (TransitionSet)((Transition)this).setInterpolator(timeinterpolator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #257 <Method Transition Transition.setInterpolator(TimeInterpolator)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	public TransitionSet setOrdering(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               0: 38
	//	               1: 31
	//*   2   28:goto            45
		case 1: // '\001'
			mPlayTogether = false;
	//    3   31:aload_0         
	//    4   32:iconst_0        
	//    5   33:putfield        #32  <Field boolean mPlayTogether>
			return this;
	//    6   36:aload_0         
	//    7   37:areturn         

		case 0: // '\0'
			mPlayTogether = true;
	//    8   38:aload_0         
	//    9   39:iconst_1        
	//   10   40:putfield        #32  <Field boolean mPlayTogether>
			return this;
	//   11   43:aload_0         
	//   12   44:areturn         
		}
		throw new AndroidRuntimeException((new StringBuilder()).append("Invalid parameter for TransitionSet ordering: ").append(i).toString());
	//   13   45:new             #260 <Class AndroidRuntimeException>
	//   14   48:dup             
	//   15   49:new             #262 <Class StringBuilder>
	//   16   52:dup             
	//   17   53:invokespecial   #263 <Method void StringBuilder()>
	//   18   56:ldc2            #265 <String "Invalid parameter for TransitionSet ordering: ">
	//   19   59:invokevirtual   #269 <Method StringBuilder StringBuilder.append(String)>
	//   20   62:iload_1         
	//   21   63:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//   22   66:invokevirtual   #276 <Method String StringBuilder.toString()>
	//   23   69:invokespecial   #279 <Method void AndroidRuntimeException(String)>
	//   24   72:athrow          
	}

	volatile Transition setSceneRoot(ViewGroup viewgroup)
	{
		return ((Transition) (setSceneRoot(viewgroup)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #284 <Method TransitionSet setSceneRoot(ViewGroup)>
	//    3    5:areturn         
	}

	TransitionSet setSceneRoot(ViewGroup viewgroup)
	{
		((Transition)this).setSceneRoot(viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #286 <Method Transition Transition.setSceneRoot(ViewGroup)>
	//    3    5:pop             
		int j = mTransitions.size();
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field ArrayList mTransitions>
	//    6   10:invokevirtual   #70  <Method int ArrayList.size()>
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
	//   16   26:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #4   <Class Transition>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #286 <Method Transition Transition.setSceneRoot(ViewGroup)>
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
	//    2    2:invokevirtual   #288 <Method TransitionSet setStartDelay(long)>
	//    3    5:areturn         
	}

	public TransitionSet setStartDelay(long l)
	{
		return (TransitionSet)((Transition)this).setStartDelay(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #172 <Method Transition Transition.setStartDelay(long)>
	//    3    5:checkcast       #2   <Class TransitionSet>
	//    4    8:areturn         
	}

	String toString(String s)
	{
		String s1 = ((Transition)this).toString(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #291 <Method String Transition.toString(String)>
	//    3    5:astore_3        
		for(int i = 0; i < mTransitions.size(); i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:aload_0         
	//*   8   10:getfield        #30  <Field ArrayList mTransitions>
	//*   9   13:invokevirtual   #70  <Method int ArrayList.size()>
	//*  10   16:icmpge          84
			s1 = (new StringBuilder()).append(s1).append("\n").append(((Transition)mTransitions.get(i)).toString((new StringBuilder()).append(s).append("  ").toString())).toString();
	//   11   19:new             #262 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #263 <Method void StringBuilder()>
	//   14   26:aload_3         
	//   15   27:invokevirtual   #269 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:ldc2            #293 <String "\n">
	//   17   33:invokevirtual   #269 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:aload_0         
	//   19   37:getfield        #30  <Field ArrayList mTransitions>
	//   20   40:iload_2         
	//   21   41:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   22   44:checkcast       #4   <Class Transition>
	//   23   47:new             #262 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #263 <Method void StringBuilder()>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #269 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:ldc2            #295 <String "  ">
	//   29   61:invokevirtual   #269 <Method StringBuilder StringBuilder.append(String)>
	//   30   64:invokevirtual   #276 <Method String StringBuilder.toString()>
	//   31   67:invokevirtual   #291 <Method String Transition.toString(String)>
	//   32   70:invokevirtual   #269 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:invokevirtual   #276 <Method String StringBuilder.toString()>
	//   34   76:astore_3        

	//   35   77:iload_2         
	//   36   78:iconst_1        
	//   37   79:iadd            
	//   38   80:istore_2        
	//*  39   81:goto            8
		return s1;
	//   40   84:aload_3         
	//   41   85:areturn         
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
	//    1    1:getfield        #43  <Field int mCurrentListeners>
	//    2    4:ireturn         
	}

*/


/*
	static int access$106(TransitionSet transitionset)
	{
		int i = transitionset.mCurrentListeners - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mCurrentListeners>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		transitionset.mCurrentListeners = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #43  <Field int mCurrentListeners>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/
}
