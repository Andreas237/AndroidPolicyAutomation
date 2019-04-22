// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.graphics.drawable:
//			StateListDrawable

public class AnimatedStateListDrawableCompat extends StateListDrawable
{
	private static class AnimatableTransition extends Transition
	{

		public void start()
		{
			mA.start();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Animatable mA>
		//    2    4:invokeinterface #23  <Method void Animatable.start()>
		//    3    9:return          
		}

		public void stop()
		{
			mA.stop();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Animatable mA>
		//    2    4:invokeinterface #26  <Method void Animatable.stop()>
		//    3    9:return          
		}

		private final Animatable mA;

		AnimatableTransition(Animatable animatable)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #14  <Method void AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat$1)>
			mA = animatable;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #16  <Field Animatable mA>
		//    6   10:return          
		}
	}

	static class AnimatedStateListState extends StateListDrawable.StateListState
	{

		private static long generateTransitionKey(int i, int j)
		{
			long l = i;
		//    0    0:iload_0         
		//    1    1:i2l             
		//    2    2:lstore_2        
			return (long)j | l << 32;
		//    3    3:iload_1         
		//    4    4:i2l             
		//    5    5:lload_2         
		//    6    6:bipush          32
		//    7    8:lshl            
		//    8    9:lor             
		//    9   10:lreturn         
		}

		int addStateSet(int ai[], Drawable drawable, int i)
		{
			int j = super.addStateSet(ai, drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #41  <Method int StateListDrawable$StateListState.addStateSet(int[], Drawable)>
		//    4    6:istore          4
			mStateIds.put(j, ((Object) (Integer.valueOf(i))));
		//    5    8:aload_0         
		//    6    9:getfield        #24  <Field SparseArrayCompat mStateIds>
		//    7   12:iload           4
		//    8   14:iload_3         
		//    9   15:invokestatic    #47  <Method Integer Integer.valueOf(int)>
		//   10   18:invokevirtual   #51  <Method void SparseArrayCompat.put(int, Object)>
			return j;
		//   11   21:iload           4
		//   12   23:ireturn         
		}

		int addTransition(int i, int j, Drawable drawable, boolean flag)
		{
			int k = super.addChild(drawable);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokespecial   #57  <Method int StateListDrawable$StateListState.addChild(Drawable)>
		//    3    5:istore          5
			long l1 = generateTransitionKey(i, j);
		//    4    7:iload_1         
		//    5    8:iload_2         
		//    6    9:invokestatic    #59  <Method long generateTransitionKey(int, int)>
		//    7   12:lstore          8
			long l;
			if(flag)
		//*   8   14:iload           4
		//*   9   16:ifeq            27
				l = 0x0L;
		//   10   19:ldc2w           #60  <Long 0x0L>
		//   11   22:lstore          6
			else
		//*  12   24:goto            30
				l = 0L;
		//   13   27:lconst_0        
		//   14   28:lstore          6
			drawable = ((Drawable) (mTransitions));
		//   15   30:aload_0         
		//   16   31:getfield        #22  <Field LongSparseArray mTransitions>
		//   17   34:astore_3        
			long l3 = k;
		//   18   35:iload           5
		//   19   37:i2l             
		//   20   38:lstore          10
			((LongSparseArray) (drawable)).append(l1, ((Object) (Long.valueOf(l3 | l))));
		//   21   40:aload_3         
		//   22   41:lload           8
		//   23   43:lload           10
		//   24   45:lload           6
		//   25   47:lor             
		//   26   48:invokestatic    #66  <Method Long Long.valueOf(long)>
		//   27   51:invokevirtual   #70  <Method void LongSparseArray.append(long, Object)>
			if(flag)
		//*  28   54:iload           4
		//*  29   56:ifeq            87
			{
				long l2 = generateTransitionKey(j, i);
		//   30   59:iload_2         
		//   31   60:iload_1         
		//   32   61:invokestatic    #59  <Method long generateTransitionKey(int, int)>
		//   33   64:lstore          8
				mTransitions.append(l2, ((Object) (Long.valueOf(0x0L | l3 | l))));
		//   34   66:aload_0         
		//   35   67:getfield        #22  <Field LongSparseArray mTransitions>
		//   36   70:lload           8
		//   37   72:ldc2w           #71  <Long 0x0L>
		//   38   75:lload           10
		//   39   77:lor             
		//   40   78:lload           6
		//   41   80:lor             
		//   42   81:invokestatic    #66  <Method Long Long.valueOf(long)>
		//   43   84:invokevirtual   #70  <Method void LongSparseArray.append(long, Object)>
			}
			return k;
		//   44   87:iload           5
		//   45   89:ireturn         
		}

		int getKeyframeIdAt(int i)
		{
			if(i < 0)
		//*   0    0:iload_1         
		//*   1    1:ifge            6
				return 0;
		//    2    4:iconst_0        
		//    3    5:ireturn         
			else
				return ((Integer)mStateIds.get(i, ((Object) (Integer.valueOf(0))))).intValue();
		//    4    6:aload_0         
		//    5    7:getfield        #24  <Field SparseArrayCompat mStateIds>
		//    6   10:iload_1         
		//    7   11:iconst_0        
		//    8   12:invokestatic    #47  <Method Integer Integer.valueOf(int)>
		//    9   15:invokevirtual   #78  <Method Object SparseArrayCompat.get(int, Object)>
		//   10   18:checkcast       #43  <Class Integer>
		//   11   21:invokevirtual   #82  <Method int Integer.intValue()>
		//   12   24:ireturn         
		}

		int indexOfKeyframe(int ai[])
		{
			int i = super.indexOfStateSet(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #87  <Method int StateListDrawable$StateListState.indexOfStateSet(int[])>
		//    3    5:istore_2        
			if(i >= 0)
		//*   4    6:iload_2         
		//*   5    7:iflt            12
				return i;
		//    6   10:iload_2         
		//    7   11:ireturn         
			else
				return super.indexOfStateSet(StateSet.WILD_CARD);
		//    8   12:aload_0         
		//    9   13:getstatic       #93  <Field int[] StateSet.WILD_CARD>
		//   10   16:invokespecial   #87  <Method int StateListDrawable$StateListState.indexOfStateSet(int[])>
		//   11   19:ireturn         
		}

		int indexOfTransition(int i, int j)
		{
			long l = generateTransitionKey(i, j);
		//    0    0:iload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #59  <Method long generateTransitionKey(int, int)>
		//    3    5:lstore_3        
			return (int)((Long)mTransitions.get(l, ((Object) (Long.valueOf(-1L))))).longValue();
		//    4    6:aload_0         
		//    5    7:getfield        #22  <Field LongSparseArray mTransitions>
		//    6   10:lload_3         
		//    7   11:ldc2w           #96  <Long -1L>
		//    8   14:invokestatic    #66  <Method Long Long.valueOf(long)>
		//    9   17:invokevirtual   #100 <Method Object LongSparseArray.get(long, Object)>
		//   10   20:checkcast       #63  <Class Long>
		//   11   23:invokevirtual   #104 <Method long Long.longValue()>
		//   12   26:l2i             
		//   13   27:ireturn         
		}

		boolean isTransitionReversed(int i, int j)
		{
			long l = generateTransitionKey(i, j);
		//    0    0:iload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #59  <Method long generateTransitionKey(int, int)>
		//    3    5:lstore_3        
			return (((Long)mTransitions.get(l, ((Object) (Long.valueOf(-1L))))).longValue() & 0x0L) != 0L;
		//    4    6:aload_0         
		//    5    7:getfield        #22  <Field LongSparseArray mTransitions>
		//    6   10:lload_3         
		//    7   11:ldc2w           #96  <Long -1L>
		//    8   14:invokestatic    #66  <Method Long Long.valueOf(long)>
		//    9   17:invokevirtual   #100 <Method Object LongSparseArray.get(long, Object)>
		//   10   20:checkcast       #63  <Class Long>
		//   11   23:invokevirtual   #104 <Method long Long.longValue()>
		//   12   26:ldc2w           #71  <Long 0x0L>
		//   13   29:land            
		//   14   30:lconst_0        
		//   15   31:lcmp            
		//   16   32:ifeq            37
		//   17   35:iconst_1        
		//   18   36:ireturn         
		//   19   37:iconst_0        
		//   20   38:ireturn         
		}

		void mutate()
		{
			mTransitions = mTransitions.clone();
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #22  <Field LongSparseArray mTransitions>
		//    3    5:invokevirtual   #111 <Method LongSparseArray LongSparseArray.clone()>
		//    4    8:putfield        #22  <Field LongSparseArray mTransitions>
			mStateIds = mStateIds.clone();
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #24  <Field SparseArrayCompat mStateIds>
		//    8   16:invokevirtual   #114 <Method SparseArrayCompat SparseArrayCompat.clone()>
		//    9   19:putfield        #24  <Field SparseArrayCompat mStateIds>
		//   10   22:return          
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new AnimatedStateListDrawableCompat(this, ((Resources) (null)))));
		//    0    0:new             #6   <Class AnimatedStateListDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #119 <Method void AnimatedStateListDrawableCompat(AnimatedStateListDrawableCompat$AnimatedStateListState, Resources)>
		//    5    9:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new AnimatedStateListDrawableCompat(this, resources)));
		//    0    0:new             #6   <Class AnimatedStateListDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #119 <Method void AnimatedStateListDrawableCompat(AnimatedStateListDrawableCompat$AnimatedStateListState, Resources)>
		//    5    9:areturn         
		}

		boolean transitionHasReversibleFlag(int i, int j)
		{
			long l = generateTransitionKey(i, j);
		//    0    0:iload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #59  <Method long generateTransitionKey(int, int)>
		//    3    5:lstore_3        
			return (((Long)mTransitions.get(l, ((Object) (Long.valueOf(-1L))))).longValue() & 0x0L) != 0L;
		//    4    6:aload_0         
		//    5    7:getfield        #22  <Field LongSparseArray mTransitions>
		//    6   10:lload_3         
		//    7   11:ldc2w           #96  <Long -1L>
		//    8   14:invokestatic    #66  <Method Long Long.valueOf(long)>
		//    9   17:invokevirtual   #100 <Method Object LongSparseArray.get(long, Object)>
		//   10   20:checkcast       #63  <Class Long>
		//   11   23:invokevirtual   #104 <Method long Long.longValue()>
		//   12   26:ldc2w           #60  <Long 0x0L>
		//   13   29:land            
		//   14   30:lconst_0        
		//   15   31:lcmp            
		//   16   32:ifeq            37
		//   17   35:iconst_1        
		//   18   36:ireturn         
		//   19   37:iconst_0        
		//   20   38:ireturn         
		}

		SparseArrayCompat mStateIds;
		LongSparseArray mTransitions;

		AnimatedStateListState(AnimatedStateListState animatedstateliststate, AnimatedStateListDrawableCompat animatedstatelistdrawablecompat, Resources resources)
		{
			super(((StateListDrawable.StateListState) (animatedstateliststate)), ((StateListDrawable) (animatedstatelistdrawablecompat)), resources);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #20  <Method void StateListDrawable$StateListState(StateListDrawable$StateListState, StateListDrawable, Resources)>
			if(animatedstateliststate != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          28
			{
				mTransitions = animatedstateliststate.mTransitions;
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:getfield        #22  <Field LongSparseArray mTransitions>
		//   10   16:putfield        #22  <Field LongSparseArray mTransitions>
				mStateIds = animatedstateliststate.mStateIds;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:getfield        #24  <Field SparseArrayCompat mStateIds>
		//   14   24:putfield        #24  <Field SparseArrayCompat mStateIds>
				return;
		//   15   27:return          
			} else
			{
				mTransitions = new LongSparseArray();
		//   16   28:aload_0         
		//   17   29:new             #26  <Class LongSparseArray>
		//   18   32:dup             
		//   19   33:invokespecial   #29  <Method void LongSparseArray()>
		//   20   36:putfield        #22  <Field LongSparseArray mTransitions>
				mStateIds = new SparseArrayCompat();
		//   21   39:aload_0         
		//   22   40:new             #31  <Class SparseArrayCompat>
		//   23   43:dup             
		//   24   44:invokespecial   #32  <Method void SparseArrayCompat()>
		//   25   47:putfield        #24  <Field SparseArrayCompat mStateIds>
				return;
		//   26   50:return          
			}
		}
	}

	private static class AnimatedVectorDrawableTransition extends Transition
	{

		public void start()
		{
			mAvd.start();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field AnimatedVectorDrawableCompat mAvd>
		//    2    4:invokevirtual   #23  <Method void AnimatedVectorDrawableCompat.start()>
		//    3    7:return          
		}

		public void stop()
		{
			mAvd.stop();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field AnimatedVectorDrawableCompat mAvd>
		//    2    4:invokevirtual   #26  <Method void AnimatedVectorDrawableCompat.stop()>
		//    3    7:return          
		}

		private final AnimatedVectorDrawableCompat mAvd;

		AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedvectordrawablecompat)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #14  <Method void AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat$1)>
			mAvd = animatedvectordrawablecompat;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #16  <Field AnimatedVectorDrawableCompat mAvd>
		//    6   10:return          
		}
	}

	private static class AnimationDrawableTransition extends Transition
	{

		public boolean canReverse()
		{
			return mHasReversibleFlag;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field boolean mHasReversibleFlag>
		//    2    4:ireturn         
		}

		public void reverse()
		{
			mAnim.reverse();
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field ObjectAnimator mAnim>
		//    2    4:invokevirtual   #67  <Method void ObjectAnimator.reverse()>
		//    3    7:return          
		}

		public void start()
		{
			mAnim.start();
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field ObjectAnimator mAnim>
		//    2    4:invokevirtual   #70  <Method void ObjectAnimator.start()>
		//    3    7:return          
		}

		public void stop()
		{
			mAnim.cancel();
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field ObjectAnimator mAnim>
		//    2    4:invokevirtual   #74  <Method void ObjectAnimator.cancel()>
		//    3    7:return          
		}

		private final ObjectAnimator mAnim;
		private final boolean mHasReversibleFlag;

		AnimationDrawableTransition(AnimationDrawable animationdrawable, boolean flag, boolean flag1)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #16  <Method void AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat$1)>
			int j = animationdrawable.getNumberOfFrames();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #22  <Method int AnimationDrawable.getNumberOfFrames()>
		//    5    9:istore          5
			int i;
			if(flag)
		//*   6   11:iload_2         
		//*   7   12:ifeq            24
				i = j - 1;
		//    8   15:iload           5
		//    9   17:iconst_1        
		//   10   18:isub            
		//   11   19:istore          4
			else
		//*  12   21:goto            27
				i = 0;
		//   13   24:iconst_0        
		//   14   25:istore          4
			if(flag)
		//*  15   27:iload_2         
		//*  16   28:ifeq            37
				j = 0;
		//   17   31:iconst_0        
		//   18   32:istore          5
			else
		//*  19   34:goto            43
				j--;
		//   20   37:iload           5
		//   21   39:iconst_1        
		//   22   40:isub            
		//   23   41:istore          5
			FrameInterpolator frameinterpolator = new FrameInterpolator(animationdrawable, flag);
		//   24   43:new             #24  <Class AnimatedStateListDrawableCompat$FrameInterpolator>
		//   25   46:dup             
		//   26   47:aload_1         
		//   27   48:iload_2         
		//   28   49:invokespecial   #27  <Method void AnimatedStateListDrawableCompat$FrameInterpolator(AnimationDrawable, boolean)>
		//   29   52:astore          6
			animationdrawable = ((AnimationDrawable) (ObjectAnimator.ofInt(((Object) (animationdrawable)), "currentIndex", new int[] {
				i, j
			})));
		//   30   54:aload_1         
		//   31   55:ldc1            #29  <String "currentIndex">
		//   32   57:iconst_2        
		//   33   58:newarray        int[]
		//   34   60:dup             
		//   35   61:iconst_0        
		//   36   62:iload           4
		//   37   64:iastore         
		//   38   65:dup             
		//   39   66:iconst_1        
		//   40   67:iload           5
		//   41   69:iastore         
		//   42   70:invokestatic    #35  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
		//   43   73:astore_1        
			if(android.os.Build.VERSION.SDK_INT >= 18)
		//*  44   74:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
		//*  45   77:bipush          18
		//*  46   79:icmplt          87
				((ObjectAnimator) (animationdrawable)).setAutoCancel(true);
		//   47   82:aload_1         
		//   48   83:iconst_1        
		//   49   84:invokevirtual   #45  <Method void ObjectAnimator.setAutoCancel(boolean)>
			((ObjectAnimator) (animationdrawable)).setDuration(frameinterpolator.getTotalDuration());
		//   50   87:aload_1         
		//   51   88:aload           6
		//   52   90:invokevirtual   #48  <Method int AnimatedStateListDrawableCompat$FrameInterpolator.getTotalDuration()>
		//   53   93:i2l             
		//   54   94:invokevirtual   #52  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
		//   55   97:pop             
			((ObjectAnimator) (animationdrawable)).setInterpolator(((TimeInterpolator) (frameinterpolator)));
		//   56   98:aload_1         
		//   57   99:aload           6
		//   58  101:invokevirtual   #56  <Method void ObjectAnimator.setInterpolator(TimeInterpolator)>
			mHasReversibleFlag = flag1;
		//   59  104:aload_0         
		//   60  105:iload_3         
		//   61  106:putfield        #58  <Field boolean mHasReversibleFlag>
			mAnim = ((ObjectAnimator) (animationdrawable));
		//   62  109:aload_0         
		//   63  110:aload_1         
		//   64  111:putfield        #60  <Field ObjectAnimator mAnim>
		//   65  114:return          
		}
	}

	private static class FrameInterpolator
		implements TimeInterpolator
	{

		public float getInterpolation(float f)
		{
			int j = (int)(f * (float)mTotalDuration + 0.5F);
		//    0    0:fload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field int mTotalDuration>
		//    3    5:i2f             
		//    4    6:fmul            
		//    5    7:ldc1            #29  <Float 0.5F>
		//    6    9:fadd            
		//    7   10:f2i             
		//    8   11:istore_3        
			int k = mFrames;
		//    9   12:aload_0         
		//   10   13:getfield        #31  <Field int mFrames>
		//   11   16:istore          4
			int ai[] = mFrameTimes;
		//   12   18:aload_0         
		//   13   19:getfield        #33  <Field int[] mFrameTimes>
		//   14   22:astore          5
			int i;
			for(i = 0; i < k && j >= ai[i]; i++)
		//*  15   24:iconst_0        
		//*  16   25:istore_2        
		//*  17   26:iload_2         
		//*  18   27:iload           4
		//*  19   29:icmpge          54
		//*  20   32:iload_3         
		//*  21   33:aload           5
		//*  22   35:iload_2         
		//*  23   36:iaload          
		//*  24   37:icmplt          54
				j -= ai[i];
		//   25   40:iload_3         
		//   26   41:aload           5
		//   27   43:iload_2         
		//   28   44:iaload          
		//   29   45:isub            
		//   30   46:istore_3        

		//   31   47:iload_2         
		//   32   48:iconst_1        
		//   33   49:iadd            
		//   34   50:istore_2        
		//*  35   51:goto            26
			if(i < k)
		//*  36   54:iload_2         
		//*  37   55:iload           4
		//*  38   57:icmpge          72
				f = (float)j / (float)mTotalDuration;
		//   39   60:iload_3         
		//   40   61:i2f             
		//   41   62:aload_0         
		//   42   63:getfield        #28  <Field int mTotalDuration>
		//   43   66:i2f             
		//   44   67:fdiv            
		//   45   68:fstore_1        
			else
		//*  46   69:goto            74
				f = 0.0F;
		//   47   72:fconst_0        
		//   48   73:fstore_1        
			return (float)i / (float)k + f;
		//   49   74:iload_2         
		//   50   75:i2f             
		//   51   76:iload           4
		//   52   78:i2f             
		//   53   79:fdiv            
		//   54   80:fload_1         
		//   55   81:fadd            
		//   56   82:freturn         
		}

		int getTotalDuration()
		{
			return mTotalDuration;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int mTotalDuration>
		//    2    4:ireturn         
		}

		int updateFrames(AnimationDrawable animationdrawable, boolean flag)
		{
			int l = animationdrawable.getNumberOfFrames();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #40  <Method int AnimationDrawable.getNumberOfFrames()>
		//    2    4:istore          6
			mFrames = l;
		//    3    6:aload_0         
		//    4    7:iload           6
		//    5    9:putfield        #31  <Field int mFrames>
			int ai[] = mFrameTimes;
		//    6   12:aload_0         
		//    7   13:getfield        #33  <Field int[] mFrameTimes>
		//    8   16:astore          7
			if(ai == null || ai.length < l)
		//*   9   18:aload           7
		//*  10   20:ifnull          31
		//*  11   23:aload           7
		//*  12   25:arraylength     
		//*  13   26:iload           6
		//*  14   28:icmpge          39
				mFrameTimes = new int[l];
		//   15   31:aload_0         
		//   16   32:iload           6
		//   17   34:newarray        int[]
		//   18   36:putfield        #33  <Field int[] mFrameTimes>
			ai = mFrameTimes;
		//   19   39:aload_0         
		//   20   40:getfield        #33  <Field int[] mFrameTimes>
		//   21   43:astore          7
			int i = 0;
		//   22   45:iconst_0        
		//   23   46:istore_3        
			int j = 0;
		//   24   47:iconst_0        
		//   25   48:istore          4
			for(; i < l; i++)
		//*  26   50:iload_3         
		//*  27   51:iload           6
		//*  28   53:icmpge          102
			{
				int k;
				if(flag)
		//*  29   56:iload_2         
		//*  30   57:ifeq            71
					k = l - i - 1;
		//   31   60:iload           6
		//   32   62:iload_3         
		//   33   63:isub            
		//   34   64:iconst_1        
		//   35   65:isub            
		//   36   66:istore          5
				else
		//*  37   68:goto            74
					k = i;
		//   38   71:iload_3         
		//   39   72:istore          5
				k = animationdrawable.getDuration(k);
		//   40   74:aload_1         
		//   41   75:iload           5
		//   42   77:invokevirtual   #44  <Method int AnimationDrawable.getDuration(int)>
		//   43   80:istore          5
				ai[i] = k;
		//   44   82:aload           7
		//   45   84:iload_3         
		//   46   85:iload           5
		//   47   87:iastore         
				j += k;
		//   48   88:iload           4
		//   49   90:iload           5
		//   50   92:iadd            
		//   51   93:istore          4
			}

		//   52   95:iload_3         
		//   53   96:iconst_1        
		//   54   97:iadd            
		//   55   98:istore_3        
		//*  56   99:goto            50
			mTotalDuration = j;
		//   57  102:aload_0         
		//   58  103:iload           4
		//   59  105:putfield        #28  <Field int mTotalDuration>
			return j;
		//   60  108:iload           4
		//   61  110:ireturn         
		}

		private int mFrameTimes[];
		private int mFrames;
		private int mTotalDuration;

		FrameInterpolator(AnimationDrawable animationdrawable, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			updateFrames(animationdrawable, flag);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokevirtual   #23  <Method int updateFrames(AnimationDrawable, boolean)>
		//    6   10:pop             
		//    7   11:return          
		}
	}

	private static abstract class Transition
	{

		public boolean canReverse()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void reverse()
		{
		//    0    0:return          
		}

		public abstract void start();

		public abstract void stop();

		private Transition()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

	}


	public AnimatedStateListDrawableCompat()
	{
		this(((AnimatedStateListState) (null)), ((Resources) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #44  <Method void AnimatedStateListDrawableCompat(AnimatedStateListDrawableCompat$AnimatedStateListState, Resources)>
	//    4    6:return          
	}

	AnimatedStateListDrawableCompat(AnimatedStateListState animatedstateliststate, Resources resources)
	{
		super(((StateListDrawable.StateListState) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #48  <Method void StateListDrawable(StateListDrawable$StateListState)>
		mTransitionToIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #50  <Field int mTransitionToIndex>
		mTransitionFromIndex = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #52  <Field int mTransitionFromIndex>
		setConstantState(((DrawableContainer.DrawableContainerState) (new AnimatedStateListState(animatedstateliststate, this, resources))));
	//    9   15:aload_0         
	//   10   16:new             #11  <Class AnimatedStateListDrawableCompat$AnimatedStateListState>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokespecial   #55  <Method void AnimatedStateListDrawableCompat$AnimatedStateListState(AnimatedStateListDrawableCompat$AnimatedStateListState, AnimatedStateListDrawableCompat, Resources)>
	//   16   26:invokevirtual   #59  <Method void setConstantState(DrawableContainer$DrawableContainerState)>
		onStateChange(getState());
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:invokevirtual   #63  <Method int[] getState()>
	//   20   34:invokevirtual   #67  <Method boolean onStateChange(int[])>
	//   21   37:pop             
		jumpToCurrentState();
	//   22   38:aload_0         
	//   23   39:invokevirtual   #70  <Method void jumpToCurrentState()>
	//   24   42:return          
	}

	public static AnimatedStateListDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws IOException, XmlPullParserException
	{
		Object obj = ((Object) (xmlpullparser.getName()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #84  <Method String XmlPullParser.getName()>
	//    2    6:astore          5
		if(((String) (obj)).equals("animated-selector"))
	//*   3    8:aload           5
	//*   4   10:ldc1            #86  <String "animated-selector">
	//*   5   12:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*   6   15:ifeq            41
		{
			obj = ((Object) (new AnimatedStateListDrawableCompat()));
	//    7   18:new             #2   <Class AnimatedStateListDrawableCompat>
	//    8   21:dup             
	//    9   22:invokespecial   #94  <Method void AnimatedStateListDrawableCompat()>
	//   10   25:astore          5
			((AnimatedStateListDrawableCompat) (obj)).inflate(context, resources, xmlpullparser, attributeset, theme);
	//   11   27:aload           5
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:aload           4
	//   17   35:invokevirtual   #98  <Method void inflate(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return ((AnimatedStateListDrawableCompat) (obj));
	//   18   38:aload           5
	//   19   40:areturn         
		} else
		{
			context = ((Context) (new StringBuilder()));
	//   20   41:new             #100 <Class StringBuilder>
	//   21   44:dup             
	//   22   45:invokespecial   #101 <Method void StringBuilder()>
	//   23   48:astore_0        
			((StringBuilder) (context)).append(xmlpullparser.getPositionDescription());
	//   24   49:aload_0         
	//   25   50:aload_2         
	//   26   51:invokeinterface #104 <Method String XmlPullParser.getPositionDescription()>
	//   27   56:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
			((StringBuilder) (context)).append(": invalid animated-selector tag ");
	//   29   60:aload_0         
	//   30   61:ldc1            #110 <String ": invalid animated-selector tag ">
	//   31   63:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
			((StringBuilder) (context)).append(((String) (obj)));
	//   33   67:aload_0         
	//   34   68:aload           5
	//   35   70:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   36   73:pop             
			throw new XmlPullParserException(((StringBuilder) (context)).toString());
	//   37   74:new             #77  <Class XmlPullParserException>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   41   82:invokespecial   #116 <Method void XmlPullParserException(String)>
	//   42   85:athrow          
		}
	}

	private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		int i = xmlpullparser.getDepth() + 1;
	//    0    0:aload_3         
	//    1    1:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//    2    6:iconst_1        
	//    3    7:iadd            
	//    4    8:istore          6
		do
		{
			int j = xmlpullparser.next();
	//    5   10:aload_3         
	//    6   11:invokeinterface #125 <Method int XmlPullParser.next()>
	//    7   16:istore          7
			if(j == 1)
				break;
	//    8   18:iload           7
	//    9   20:iconst_1        
	//   10   21:icmpeq          122
			int k = xmlpullparser.getDepth();
	//   11   24:aload_3         
	//   12   25:invokeinterface #122 <Method int XmlPullParser.getDepth()>
	//   13   30:istore          8
			if(k < i && j == 3)
				break;
	//   14   32:iload           8
	//   15   34:iload           6
	//   16   36:icmpge          45
	//   17   39:iload           7
	//   18   41:iconst_3        
	//   19   42:icmpeq          122
			if(j == 2 && k <= i)
	//*  20   45:iload           7
	//*  21   47:iconst_2        
	//*  22   48:icmpeq          54
	//*  23   51:goto            10
	//*  24   54:iload           8
	//*  25   56:iload           6
	//*  26   58:icmple          64
	//*  27   61:goto            10
				if(xmlpullparser.getName().equals("item"))
	//*  28   64:aload_3         
	//*  29   65:invokeinterface #84  <Method String XmlPullParser.getName()>
	//*  30   70:ldc1            #127 <String "item">
	//*  31   72:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  32   75:ifeq            93
					parseItem(context, resources, xmlpullparser, attributeset, theme);
	//   33   78:aload_0         
	//   34   79:aload_1         
	//   35   80:aload_2         
	//   36   81:aload_3         
	//   37   82:aload           4
	//   38   84:aload           5
	//   39   86:invokespecial   #131 <Method int parseItem(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   40   89:pop             
				else
	//*  41   90:goto            10
				if(xmlpullparser.getName().equals("transition"))
	//*  42   93:aload_3         
	//*  43   94:invokeinterface #84  <Method String XmlPullParser.getName()>
	//*  44   99:ldc1            #133 <String "transition">
	//*  45  101:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  46  104:ifeq            10
					parseTransition(context, resources, xmlpullparser, attributeset, theme);
	//   47  107:aload_0         
	//   48  108:aload_1         
	//   49  109:aload_2         
	//   50  110:aload_3         
	//   51  111:aload           4
	//   52  113:aload           5
	//   53  115:invokespecial   #136 <Method int parseTransition(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   54  118:pop             
		} while(true);
	//   55  119:goto            10
	//   56  122:return          
	}

	private void init()
	{
		onStateChange(getState());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #63  <Method int[] getState()>
	//    3    5:invokevirtual   #67  <Method boolean onStateChange(int[])>
	//    4    8:pop             
	//    5    9:return          
	}

	private int parseItem(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableItem);
	//    0    0:aload_2         
	//    1    1:aload           5
	//    2    3:aload           4
	//    3    5:getstatic       #143 <Field int[] android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableItem>
	//    4    8:invokestatic    #149 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5   11:astore          9
		int i = typedarray.getResourceId(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableItem_android_id, 0);
	//    6   13:aload           9
	//    7   15:getstatic       #152 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableItem_android_id>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #158 <Method int TypedArray.getResourceId(int, int)>
	//   10   22:istore          6
		int j = typedarray.getResourceId(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
	//   11   24:aload           9
	//   12   26:getstatic       #161 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableItem_android_drawable>
	//   13   29:iconst_m1       
	//   14   30:invokevirtual   #158 <Method int TypedArray.getResourceId(int, int)>
	//   15   33:istore          7
		Drawable drawable;
		if(j > 0)
	//*  16   35:iload           7
	//*  17   37:ifle            51
			drawable = AppCompatResources.getDrawable(context, j);
	//   18   40:aload_1         
	//   19   41:iload           7
	//   20   43:invokestatic    #167 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   21   46:astore          8
		else
	//*  22   48:goto            54
			drawable = null;
	//   23   51:aconst_null     
	//   24   52:astore          8
		typedarray.recycle();
	//   25   54:aload           9
	//   26   56:invokevirtual   #170 <Method void TypedArray.recycle()>
		int ai[] = extractStateSet(attributeset);
	//   27   59:aload_0         
	//   28   60:aload           4
	//   29   62:invokevirtual   #174 <Method int[] extractStateSet(AttributeSet)>
	//   30   65:astore          9
		context = ((Context) (drawable));
	//   31   67:aload           8
	//   32   69:astore_1        
		if(drawable == null)
	//*  33   70:aload           8
	//*  34   72:ifnonnull       195
		{
			int k;
			do
				k = xmlpullparser.next();
	//   35   75:aload_3         
	//   36   76:invokeinterface #125 <Method int XmlPullParser.next()>
	//   37   81:istore          7
			while(k == 4);
	//   38   83:iload           7
	//   39   85:iconst_4        
	//   40   86:icmpne          92
	//*  41   89:goto            75
			if(k == 2)
	//*  42   92:iload           7
	//*  43   94:iconst_2        
	//*  44   95:icmpne          157
			{
				if(xmlpullparser.getName().equals("vector"))
	//*  45   98:aload_3         
	//*  46   99:invokeinterface #84  <Method String XmlPullParser.getName()>
	//*  47  104:ldc1            #176 <String "vector">
	//*  48  106:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  49  109:ifeq            125
					context = ((Context) (VectorDrawableCompat.createFromXmlInner(resources, xmlpullparser, attributeset, theme)));
	//   50  112:aload_2         
	//   51  113:aload_3         
	//   52  114:aload           4
	//   53  116:aload           5
	//   54  118:invokestatic    #181 <Method VectorDrawableCompat VectorDrawableCompat.createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   55  121:astore_1        
				else
	//*  56  122:goto            195
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  57  125:getstatic       #186 <Field int android.os.Build$VERSION.SDK_INT>
	//*  58  128:bipush          21
	//*  59  130:icmplt          146
					context = ((Context) (Drawable.createFromXmlInner(resources, xmlpullparser, attributeset, theme)));
	//   60  133:aload_2         
	//   61  134:aload_3         
	//   62  135:aload           4
	//   63  137:aload           5
	//   64  139:invokestatic    #191 <Method Drawable Drawable.createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   65  142:astore_1        
				else
	//*  66  143:goto            195
					context = ((Context) (Drawable.createFromXmlInner(resources, xmlpullparser, attributeset)));
	//   67  146:aload_2         
	//   68  147:aload_3         
	//   69  148:aload           4
	//   70  150:invokestatic    #194 <Method Drawable Drawable.createFromXmlInner(Resources, XmlPullParser, AttributeSet)>
	//   71  153:astore_1        
			} else
	//*  72  154:goto            195
			{
				context = ((Context) (new StringBuilder()));
	//   73  157:new             #100 <Class StringBuilder>
	//   74  160:dup             
	//   75  161:invokespecial   #101 <Method void StringBuilder()>
	//   76  164:astore_1        
				((StringBuilder) (context)).append(xmlpullparser.getPositionDescription());
	//   77  165:aload_1         
	//   78  166:aload_3         
	//   79  167:invokeinterface #104 <Method String XmlPullParser.getPositionDescription()>
	//   80  172:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   81  175:pop             
				((StringBuilder) (context)).append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
	//   82  176:aload_1         
	//   83  177:ldc1            #196 <String ": <item> tag requires a 'drawable' attribute or child tag defining a drawable">
	//   84  179:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   85  182:pop             
				throw new XmlPullParserException(((StringBuilder) (context)).toString());
	//   86  183:new             #77  <Class XmlPullParserException>
	//   87  186:dup             
	//   88  187:aload_1         
	//   89  188:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   90  191:invokespecial   #116 <Method void XmlPullParserException(String)>
	//   91  194:athrow          
			}
		}
		if(context != null)
	//*  92  195:aload_1         
	//*  93  196:ifnull          212
		{
			return mState.addStateSet(ai, ((Drawable) (context)), i);
	//   94  199:aload_0         
	//   95  200:getfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//   96  203:aload           9
	//   97  205:aload_1         
	//   98  206:iload           6
	//   99  208:invokevirtual   #202 <Method int AnimatedStateListDrawableCompat$AnimatedStateListState.addStateSet(int[], Drawable, int)>
	//  100  211:ireturn         
		} else
		{
			context = ((Context) (new StringBuilder()));
	//  101  212:new             #100 <Class StringBuilder>
	//  102  215:dup             
	//  103  216:invokespecial   #101 <Method void StringBuilder()>
	//  104  219:astore_1        
			((StringBuilder) (context)).append(xmlpullparser.getPositionDescription());
	//  105  220:aload_1         
	//  106  221:aload_3         
	//  107  222:invokeinterface #104 <Method String XmlPullParser.getPositionDescription()>
	//  108  227:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  109  230:pop             
			((StringBuilder) (context)).append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
	//  110  231:aload_1         
	//  111  232:ldc1            #196 <String ": <item> tag requires a 'drawable' attribute or child tag defining a drawable">
	//  112  234:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  113  237:pop             
			throw new XmlPullParserException(((StringBuilder) (context)).toString());
	//  114  238:new             #77  <Class XmlPullParserException>
	//  115  241:dup             
	//  116  242:aload_1         
	//  117  243:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  118  246:invokespecial   #116 <Method void XmlPullParserException(String)>
	//  119  249:athrow          
		}
	}

	private int parseTransition(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		Object obj = ((Object) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableTransition)));
	//    0    0:aload_2         
	//    1    1:aload           5
	//    2    3:aload           4
	//    3    5:getstatic       #205 <Field int[] android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableTransition>
	//    4    8:invokestatic    #149 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5   11:astore          10
		int i = ((TypedArray) (obj)).getResourceId(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
	//    6   13:aload           10
	//    7   15:getstatic       #208 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_fromId>
	//    8   18:iconst_m1       
	//    9   19:invokevirtual   #158 <Method int TypedArray.getResourceId(int, int)>
	//   10   22:istore          6
		int j = ((TypedArray) (obj)).getResourceId(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
	//   11   24:aload           10
	//   12   26:getstatic       #211 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_toId>
	//   13   29:iconst_m1       
	//   14   30:invokevirtual   #158 <Method int TypedArray.getResourceId(int, int)>
	//   15   33:istore          7
		int k = ((TypedArray) (obj)).getResourceId(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
	//   16   35:aload           10
	//   17   37:getstatic       #214 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_drawable>
	//   18   40:iconst_m1       
	//   19   41:invokevirtual   #158 <Method int TypedArray.getResourceId(int, int)>
	//   20   44:istore          8
		Drawable drawable;
		if(k > 0)
	//*  21   46:iload           8
	//*  22   48:ifle            62
			drawable = AppCompatResources.getDrawable(context, k);
	//   23   51:aload_1         
	//   24   52:iload           8
	//   25   54:invokestatic    #167 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   26   57:astore          11
		else
	//*  27   59:goto            65
			drawable = null;
	//   28   62:aconst_null     
	//   29   63:astore          11
		boolean flag = ((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
	//   30   65:aload           10
	//   31   67:getstatic       #217 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableTransition_android_reversible>
	//   32   70:iconst_0        
	//   33   71:invokevirtual   #221 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   34   74:istore          9
		((TypedArray) (obj)).recycle();
	//   35   76:aload           10
	//   36   78:invokevirtual   #170 <Method void TypedArray.recycle()>
		obj = ((Object) (drawable));
	//   37   81:aload           11
	//   38   83:astore          10
		if(drawable == null)
	//*  39   85:aload           11
	//*  40   87:ifnonnull       214
		{
			int l;
			do
				l = xmlpullparser.next();
	//   41   90:aload_3         
	//   42   91:invokeinterface #125 <Method int XmlPullParser.next()>
	//   43   96:istore          8
			while(l == 4);
	//   44   98:iload           8
	//   45  100:iconst_4        
	//   46  101:icmpne          107
	//*  47  104:goto            90
			if(l == 2)
	//*  48  107:iload           8
	//*  49  109:iconst_2        
	//*  50  110:icmpne          176
			{
				if(xmlpullparser.getName().equals("animated-vector"))
	//*  51  113:aload_3         
	//*  52  114:invokeinterface #84  <Method String XmlPullParser.getName()>
	//*  53  119:ldc1            #223 <String "animated-vector">
	//*  54  121:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  55  124:ifeq            142
					obj = ((Object) (AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlpullparser, attributeset, theme)));
	//   56  127:aload_1         
	//   57  128:aload_2         
	//   58  129:aload_3         
	//   59  130:aload           4
	//   60  132:aload           5
	//   61  134:invokestatic    #228 <Method AnimatedVectorDrawableCompat AnimatedVectorDrawableCompat.createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   62  137:astore          10
				else
	//*  63  139:goto            214
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  64  142:getstatic       #186 <Field int android.os.Build$VERSION.SDK_INT>
	//*  65  145:bipush          21
	//*  66  147:icmplt          164
					obj = ((Object) (Drawable.createFromXmlInner(resources, xmlpullparser, attributeset, theme)));
	//   67  150:aload_2         
	//   68  151:aload_3         
	//   69  152:aload           4
	//   70  154:aload           5
	//   71  156:invokestatic    #191 <Method Drawable Drawable.createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   72  159:astore          10
				else
	//*  73  161:goto            214
					obj = ((Object) (Drawable.createFromXmlInner(resources, xmlpullparser, attributeset)));
	//   74  164:aload_2         
	//   75  165:aload_3         
	//   76  166:aload           4
	//   77  168:invokestatic    #194 <Method Drawable Drawable.createFromXmlInner(Resources, XmlPullParser, AttributeSet)>
	//   78  171:astore          10
			} else
	//*  79  173:goto            214
			{
				context = ((Context) (new StringBuilder()));
	//   80  176:new             #100 <Class StringBuilder>
	//   81  179:dup             
	//   82  180:invokespecial   #101 <Method void StringBuilder()>
	//   83  183:astore_1        
				((StringBuilder) (context)).append(xmlpullparser.getPositionDescription());
	//   84  184:aload_1         
	//   85  185:aload_3         
	//   86  186:invokeinterface #104 <Method String XmlPullParser.getPositionDescription()>
	//   87  191:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   88  194:pop             
				((StringBuilder) (context)).append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
	//   89  195:aload_1         
	//   90  196:ldc1            #230 <String ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable">
	//   91  198:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   92  201:pop             
				throw new XmlPullParserException(((StringBuilder) (context)).toString());
	//   93  202:new             #77  <Class XmlPullParserException>
	//   94  205:dup             
	//   95  206:aload_1         
	//   96  207:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   97  210:invokespecial   #116 <Method void XmlPullParserException(String)>
	//   98  213:athrow          
			}
		}
		if(obj != null)
	//*  99  214:aload           10
	//* 100  216:ifnull          285
		{
			if(i != -1 && j != -1)
	//* 101  219:iload           6
	//* 102  221:iconst_m1       
	//* 103  222:icmpeq          247
	//* 104  225:iload           7
	//* 105  227:iconst_m1       
	//* 106  228:icmpeq          247
			{
				return mState.addTransition(i, j, ((Drawable) (obj)), flag);
	//  107  231:aload_0         
	//  108  232:getfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//  109  235:iload           6
	//  110  237:iload           7
	//  111  239:aload           10
	//  112  241:iload           9
	//  113  243:invokevirtual   #234 <Method int AnimatedStateListDrawableCompat$AnimatedStateListState.addTransition(int, int, Drawable, boolean)>
	//  114  246:ireturn         
			} else
			{
				context = ((Context) (new StringBuilder()));
	//  115  247:new             #100 <Class StringBuilder>
	//  116  250:dup             
	//  117  251:invokespecial   #101 <Method void StringBuilder()>
	//  118  254:astore_1        
				((StringBuilder) (context)).append(xmlpullparser.getPositionDescription());
	//  119  255:aload_1         
	//  120  256:aload_3         
	//  121  257:invokeinterface #104 <Method String XmlPullParser.getPositionDescription()>
	//  122  262:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  123  265:pop             
				((StringBuilder) (context)).append(": <transition> tag requires 'fromId' & 'toId' attributes");
	//  124  266:aload_1         
	//  125  267:ldc1            #236 <String ": <transition> tag requires 'fromId' & 'toId' attributes">
	//  126  269:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  127  272:pop             
				throw new XmlPullParserException(((StringBuilder) (context)).toString());
	//  128  273:new             #77  <Class XmlPullParserException>
	//  129  276:dup             
	//  130  277:aload_1         
	//  131  278:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  132  281:invokespecial   #116 <Method void XmlPullParserException(String)>
	//  133  284:athrow          
			}
		} else
		{
			context = ((Context) (new StringBuilder()));
	//  134  285:new             #100 <Class StringBuilder>
	//  135  288:dup             
	//  136  289:invokespecial   #101 <Method void StringBuilder()>
	//  137  292:astore_1        
			((StringBuilder) (context)).append(xmlpullparser.getPositionDescription());
	//  138  293:aload_1         
	//  139  294:aload_3         
	//  140  295:invokeinterface #104 <Method String XmlPullParser.getPositionDescription()>
	//  141  300:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  142  303:pop             
			((StringBuilder) (context)).append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
	//  143  304:aload_1         
	//  144  305:ldc1            #230 <String ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable">
	//  145  307:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  146  310:pop             
			throw new XmlPullParserException(((StringBuilder) (context)).toString());
	//  147  311:new             #77  <Class XmlPullParserException>
	//  148  314:dup             
	//  149  315:aload_1         
	//  150  316:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  151  319:invokespecial   #116 <Method void XmlPullParserException(String)>
	//  152  322:athrow          
		}
	}

	private boolean selectTransition(int i)
	{
label0:
		{
label1:
			{
				Object obj = ((Object) (mTransition));
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field AnimatedStateListDrawableCompat$Transition mTransition>
	//    2    4:astore          8
				int j;
				if(obj != null)
	//*   3    6:aload           8
	//*   4    8:ifnull          70
				{
					if(i == mTransitionToIndex)
	//*   5   11:iload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #50  <Field int mTransitionToIndex>
	//*   8   16:icmpne          21
						return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
					if(i == mTransitionFromIndex && ((Transition) (obj)).canReverse())
	//*  11   21:iload_1         
	//*  12   22:aload_0         
	//*  13   23:getfield        #52  <Field int mTransitionFromIndex>
	//*  14   26:icmpne          57
	//*  15   29:aload           8
	//*  16   31:invokevirtual   #244 <Method boolean AnimatedStateListDrawableCompat$Transition.canReverse()>
	//*  17   34:ifeq            57
					{
						((Transition) (obj)).reverse();
	//   18   37:aload           8
	//   19   39:invokevirtual   #247 <Method void AnimatedStateListDrawableCompat$Transition.reverse()>
						mTransitionToIndex = mTransitionFromIndex;
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #52  <Field int mTransitionFromIndex>
	//   23   47:putfield        #50  <Field int mTransitionToIndex>
						mTransitionFromIndex = i;
	//   24   50:aload_0         
	//   25   51:iload_1         
	//   26   52:putfield        #52  <Field int mTransitionFromIndex>
						return true;
	//   27   55:iconst_1        
	//   28   56:ireturn         
					}
					j = mTransitionToIndex;
	//   29   57:aload_0         
	//   30   58:getfield        #50  <Field int mTransitionToIndex>
	//   31   61:istore_2        
					((Transition) (obj)).stop();
	//   32   62:aload           8
	//   33   64:invokevirtual   #250 <Method void AnimatedStateListDrawableCompat$Transition.stop()>
				} else
	//*  34   67:goto            75
				{
					j = getCurrentIndex();
	//   35   70:aload_0         
	//   36   71:invokevirtual   #253 <Method int getCurrentIndex()>
	//   37   74:istore_2        
				}
				mTransition = null;
	//   38   75:aload_0         
	//   39   76:aconst_null     
	//   40   77:putfield        #240 <Field AnimatedStateListDrawableCompat$Transition mTransition>
				mTransitionFromIndex = -1;
	//   41   80:aload_0         
	//   42   81:iconst_m1       
	//   43   82:putfield        #52  <Field int mTransitionFromIndex>
				mTransitionToIndex = -1;
	//   44   85:aload_0         
	//   45   86:iconst_m1       
	//   46   87:putfield        #50  <Field int mTransitionToIndex>
				obj = ((Object) (mState));
	//   47   90:aload_0         
	//   48   91:getfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//   49   94:astore          8
				int k = ((AnimatedStateListState) (obj)).getKeyframeIdAt(j);
	//   50   96:aload           8
	//   51   98:iload_2         
	//   52   99:invokevirtual   #257 <Method int AnimatedStateListDrawableCompat$AnimatedStateListState.getKeyframeIdAt(int)>
	//   53  102:istore_3        
				int l = ((AnimatedStateListState) (obj)).getKeyframeIdAt(i);
	//   54  103:aload           8
	//   55  105:iload_1         
	//   56  106:invokevirtual   #257 <Method int AnimatedStateListDrawableCompat$AnimatedStateListState.getKeyframeIdAt(int)>
	//   57  109:istore          4
				if(l == 0)
					break label0;
	//   58  111:iload           4
	//   59  113:ifeq            273
				if(k == 0)
	//*  60  116:iload_3         
	//*  61  117:ifne            122
					return false;
	//   62  120:iconst_0        
	//   63  121:ireturn         
				int i1 = ((AnimatedStateListState) (obj)).indexOfTransition(k, l);
	//   64  122:aload           8
	//   65  124:iload_3         
	//   66  125:iload           4
	//   67  127:invokevirtual   #260 <Method int AnimatedStateListDrawableCompat$AnimatedStateListState.indexOfTransition(int, int)>
	//   68  130:istore          5
				if(i1 < 0)
	//*  69  132:iload           5
	//*  70  134:ifge            139
					return false;
	//   71  137:iconst_0        
	//   72  138:ireturn         
				boolean flag = ((AnimatedStateListState) (obj)).transitionHasReversibleFlag(k, l);
	//   73  139:aload           8
	//   74  141:iload_3         
	//   75  142:iload           4
	//   76  144:invokevirtual   #264 <Method boolean AnimatedStateListDrawableCompat$AnimatedStateListState.transitionHasReversibleFlag(int, int)>
	//   77  147:istore          6
				selectDrawable(i1);
	//   78  149:aload_0         
	//   79  150:iload           5
	//   80  152:invokevirtual   #267 <Method boolean selectDrawable(int)>
	//   81  155:pop             
				Drawable drawable = getCurrent();
	//   82  156:aload_0         
	//   83  157:invokevirtual   #271 <Method Drawable getCurrent()>
	//   84  160:astore          9
				if(drawable instanceof AnimationDrawable)
	//*  85  162:aload           9
	//*  86  164:instanceof      #273 <Class AnimationDrawable>
	//*  87  167:ifeq            201
				{
					boolean flag1 = ((AnimatedStateListState) (obj)).isTransitionReversed(k, l);
	//   88  170:aload           8
	//   89  172:iload_3         
	//   90  173:iload           4
	//   91  175:invokevirtual   #276 <Method boolean AnimatedStateListDrawableCompat$AnimatedStateListState.isTransitionReversed(int, int)>
	//   92  178:istore          7
					obj = ((Object) (new AnimationDrawableTransition((AnimationDrawable)drawable, flag1, flag)));
	//   93  180:new             #17  <Class AnimatedStateListDrawableCompat$AnimationDrawableTransition>
	//   94  183:dup             
	//   95  184:aload           9
	//   96  186:checkcast       #273 <Class AnimationDrawable>
	//   97  189:iload           7
	//   98  191:iload           6
	//   99  193:invokespecial   #279 <Method void AnimatedStateListDrawableCompat$AnimationDrawableTransition(AnimationDrawable, boolean, boolean)>
	//  100  196:astore          8
				} else
	//* 101  198:goto            248
				if(drawable instanceof AnimatedVectorDrawableCompat)
	//* 102  201:aload           9
	//* 103  203:instanceof      #225 <Class AnimatedVectorDrawableCompat>
	//* 104  206:ifeq            226
				{
					obj = ((Object) (new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat)drawable)));
	//  105  209:new             #14  <Class AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition>
	//  106  212:dup             
	//  107  213:aload           9
	//  108  215:checkcast       #225 <Class AnimatedVectorDrawableCompat>
	//  109  218:invokespecial   #282 <Method void AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat)>
	//  110  221:astore          8
				} else
	//* 111  223:goto            248
				{
					if(!(drawable instanceof Animatable))
						break label1;
	//  112  226:aload           9
	//  113  228:instanceof      #284 <Class Animatable>
	//  114  231:ifeq            271
					obj = ((Object) (new AnimatableTransition((Animatable)drawable)));
	//  115  234:new             #8   <Class AnimatedStateListDrawableCompat$AnimatableTransition>
	//  116  237:dup             
	//  117  238:aload           9
	//  118  240:checkcast       #284 <Class Animatable>
	//  119  243:invokespecial   #287 <Method void AnimatedStateListDrawableCompat$AnimatableTransition(Animatable)>
	//  120  246:astore          8
				}
				((Transition) (obj)).start();
	//  121  248:aload           8
	//  122  250:invokevirtual   #290 <Method void AnimatedStateListDrawableCompat$Transition.start()>
				mTransition = ((Transition) (obj));
	//  123  253:aload_0         
	//  124  254:aload           8
	//  125  256:putfield        #240 <Field AnimatedStateListDrawableCompat$Transition mTransition>
				mTransitionFromIndex = j;
	//  126  259:aload_0         
	//  127  260:iload_2         
	//  128  261:putfield        #52  <Field int mTransitionFromIndex>
				mTransitionToIndex = i;
	//  129  264:aload_0         
	//  130  265:iload_1         
	//  131  266:putfield        #50  <Field int mTransitionToIndex>
				return true;
	//  132  269:iconst_1        
	//  133  270:ireturn         
			}
			return false;
	//  134  271:iconst_0        
	//  135  272:ireturn         
		}
		return false;
	//  136  273:iconst_0        
	//  137  274:ireturn         
	}

	private void updateStateFromTypedArray(TypedArray typedarray)
	{
		AnimatedStateListState animatedstateliststate = mState;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//    2    4:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #186 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          26
			animatedstateliststate.mChangingConfigurations = animatedstateliststate.mChangingConfigurations | typedarray.getChangingConfigurations();
	//    6   13:aload_2         
	//    7   14:aload_2         
	//    8   15:getfield        #295 <Field int AnimatedStateListDrawableCompat$AnimatedStateListState.mChangingConfigurations>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #298 <Method int TypedArray.getChangingConfigurations()>
	//   11   22:ior             
	//   12   23:putfield        #295 <Field int AnimatedStateListDrawableCompat$AnimatedStateListState.mChangingConfigurations>
		animatedstateliststate.setVariablePadding(typedarray.getBoolean(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, animatedstateliststate.mVariablePadding));
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:getstatic       #301 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableCompat_android_variablePadding>
	//   16   31:aload_2         
	//   17   32:getfield        #304 <Field boolean AnimatedStateListDrawableCompat$AnimatedStateListState.mVariablePadding>
	//   18   35:invokevirtual   #221 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   19   38:invokevirtual   #308 <Method void AnimatedStateListDrawableCompat$AnimatedStateListState.setVariablePadding(boolean)>
		animatedstateliststate.setConstantSize(typedarray.getBoolean(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableCompat_android_constantSize, animatedstateliststate.mConstantSize));
	//   20   41:aload_2         
	//   21   42:aload_1         
	//   22   43:getstatic       #311 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableCompat_android_constantSize>
	//   23   46:aload_2         
	//   24   47:getfield        #314 <Field boolean AnimatedStateListDrawableCompat$AnimatedStateListState.mConstantSize>
	//   25   50:invokevirtual   #221 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   26   53:invokevirtual   #317 <Method void AnimatedStateListDrawableCompat$AnimatedStateListState.setConstantSize(boolean)>
		animatedstateliststate.setEnterFadeDuration(typedarray.getInt(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, animatedstateliststate.mEnterFadeDuration));
	//   27   56:aload_2         
	//   28   57:aload_1         
	//   29   58:getstatic       #320 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration>
	//   30   61:aload_2         
	//   31   62:getfield        #323 <Field int AnimatedStateListDrawableCompat$AnimatedStateListState.mEnterFadeDuration>
	//   32   65:invokevirtual   #326 <Method int TypedArray.getInt(int, int)>
	//   33   68:invokevirtual   #330 <Method void AnimatedStateListDrawableCompat$AnimatedStateListState.setEnterFadeDuration(int)>
		animatedstateliststate.setExitFadeDuration(typedarray.getInt(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, animatedstateliststate.mExitFadeDuration));
	//   34   71:aload_2         
	//   35   72:aload_1         
	//   36   73:getstatic       #333 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration>
	//   37   76:aload_2         
	//   38   77:getfield        #336 <Field int AnimatedStateListDrawableCompat$AnimatedStateListState.mExitFadeDuration>
	//   39   80:invokevirtual   #326 <Method int TypedArray.getInt(int, int)>
	//   40   83:invokevirtual   #339 <Method void AnimatedStateListDrawableCompat$AnimatedStateListState.setExitFadeDuration(int)>
		setDither(typedarray.getBoolean(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableCompat_android_dither, animatedstateliststate.mDither));
	//   41   86:aload_0         
	//   42   87:aload_1         
	//   43   88:getstatic       #342 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableCompat_android_dither>
	//   44   91:aload_2         
	//   45   92:getfield        #345 <Field boolean AnimatedStateListDrawableCompat$AnimatedStateListState.mDither>
	//   46   95:invokevirtual   #221 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   47   98:invokevirtual   #348 <Method void setDither(boolean)>
	//   48  101:return          
	}

	public volatile void applyTheme(android.content.res.Resources.Theme theme)
	{
		super.applyTheme(theme);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #355 <Method void StateListDrawable.applyTheme(android.content.res.Resources$Theme)>
	//    3    5:return          
	}

	public volatile boolean canApplyTheme()
	{
		return super.canApplyTheme();
	//    0    0:aload_0         
	//    1    1:invokespecial   #359 <Method boolean StateListDrawable.canApplyTheme()>
	//    2    4:ireturn         
	}

	AnimatedStateListState cloneConstantState()
	{
		return new AnimatedStateListState(mState, this, ((Resources) (null)));
	//    0    0:new             #11  <Class AnimatedStateListDrawableCompat$AnimatedStateListState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #55  <Method void AnimatedStateListDrawableCompat$AnimatedStateListState(AnimatedStateListDrawableCompat$AnimatedStateListState, AnimatedStateListDrawableCompat, Resources)>
	//    7   13:areturn         
	}

	volatile DrawableContainer.DrawableContainerState cloneConstantState()
	{
		return ((DrawableContainer.DrawableContainerState) (cloneConstantState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method AnimatedStateListDrawableCompat$AnimatedStateListState cloneConstantState()>
	//    2    4:areturn         
	}

	volatile StateListDrawable.StateListState cloneConstantState()
	{
		return ((StateListDrawable.StateListState) (cloneConstantState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #364 <Method AnimatedStateListDrawableCompat$AnimatedStateListState cloneConstantState()>
	//    2    4:areturn         
	}

	public volatile void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #369 <Method void StateListDrawable.draw(Canvas)>
	//    3    5:return          
	}

	public volatile int getAlpha()
	{
		return super.getAlpha();
	//    0    0:aload_0         
	//    1    1:invokespecial   #372 <Method int StateListDrawable.getAlpha()>
	//    2    4:ireturn         
	}

	public volatile int getChangingConfigurations()
	{
		return super.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #373 <Method int StateListDrawable.getChangingConfigurations()>
	//    2    4:ireturn         
	}

	public volatile Drawable getCurrent()
	{
		return super.getCurrent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #374 <Method Drawable StateListDrawable.getCurrent()>
	//    2    4:areturn         
	}

	public volatile void getHotspotBounds(Rect rect)
	{
		super.getHotspotBounds(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #378 <Method void StateListDrawable.getHotspotBounds(Rect)>
	//    3    5:return          
	}

	public volatile int getIntrinsicHeight()
	{
		return super.getIntrinsicHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #381 <Method int StateListDrawable.getIntrinsicHeight()>
	//    2    4:ireturn         
	}

	public volatile int getIntrinsicWidth()
	{
		return super.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #384 <Method int StateListDrawable.getIntrinsicWidth()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #387 <Method int StateListDrawable.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #390 <Method int StateListDrawable.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public volatile int getOpacity()
	{
		return super.getOpacity();
	//    0    0:aload_0         
	//    1    1:invokespecial   #393 <Method int StateListDrawable.getOpacity()>
	//    2    4:ireturn         
	}

	public volatile void getOutline(Outline outline)
	{
		super.getOutline(outline);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #397 <Method void StateListDrawable.getOutline(Outline)>
	//    3    5:return          
	}

	public volatile boolean getPadding(Rect rect)
	{
		return super.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #401 <Method boolean StateListDrawable.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public void inflate(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		TypedArray typedarray = TypedArrayUtils.obtainAttributes(resources, theme, attributeset, android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableCompat);
	//    0    0:aload_2         
	//    1    1:aload           5
	//    2    3:aload           4
	//    3    5:getstatic       #403 <Field int[] android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableCompat>
	//    4    8:invokestatic    #149 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5   11:astore          6
		setVisible(typedarray.getBoolean(android.support.v7.appcompat.R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
	//    6   13:aload_0         
	//    7   14:aload           6
	//    8   16:getstatic       #406 <Field int android.support.v7.appcompat.R$styleable.AnimatedStateListDrawableCompat_android_visible>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #221 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #410 <Method boolean setVisible(boolean, boolean)>
	//   13   27:pop             
		updateStateFromTypedArray(typedarray);
	//   14   28:aload_0         
	//   15   29:aload           6
	//   16   31:invokespecial   #412 <Method void updateStateFromTypedArray(TypedArray)>
		updateDensity(resources);
	//   17   34:aload_0         
	//   18   35:aload_2         
	//   19   36:invokevirtual   #416 <Method void updateDensity(Resources)>
		typedarray.recycle();
	//   20   39:aload           6
	//   21   41:invokevirtual   #170 <Method void TypedArray.recycle()>
		inflateChildElements(context, resources, xmlpullparser, attributeset, theme);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:aload_3         
	//   26   48:aload           4
	//   27   50:aload           5
	//   28   52:invokespecial   #418 <Method void inflateChildElements(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		init();
	//   29   55:aload_0         
	//   30   56:invokespecial   #420 <Method void init()>
	//   31   59:return          
	}

	public volatile void invalidateDrawable(Drawable drawable)
	{
		super.invalidateDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #424 <Method void StateListDrawable.invalidateDrawable(Drawable)>
	//    3    5:return          
	}

	public volatile boolean isAutoMirrored()
	{
		return super.isAutoMirrored();
	//    0    0:aload_0         
	//    1    1:invokespecial   #427 <Method boolean StateListDrawable.isAutoMirrored()>
	//    2    4:ireturn         
	}

	public boolean isStateful()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #429 <Method void StateListDrawable.jumpToCurrentState()>
		Transition transition = mTransition;
	//    2    4:aload_0         
	//    3    5:getfield        #240 <Field AnimatedStateListDrawableCompat$Transition mTransition>
	//    4    8:astore_1        
		if(transition != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          41
		{
			transition.stop();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #250 <Method void AnimatedStateListDrawableCompat$Transition.stop()>
			mTransition = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #240 <Field AnimatedStateListDrawableCompat$Transition mTransition>
			selectDrawable(mTransitionToIndex);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #50  <Field int mTransitionToIndex>
	//   15   27:invokevirtual   #267 <Method boolean selectDrawable(int)>
	//   16   30:pop             
			mTransitionToIndex = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #50  <Field int mTransitionToIndex>
			mTransitionFromIndex = -1;
	//   20   36:aload_0         
	//   21   37:iconst_m1       
	//   22   38:putfield        #52  <Field int mTransitionFromIndex>
		}
	//   23   41:return          
	}

	public Drawable mutate()
	{
		if(!mMutated && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #432 <Field boolean mMutated>
	//*   2    4:ifne            27
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #434 <Method Drawable StateListDrawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       27
		{
			mState.mutate();
	//    7   15:aload_0         
	//    8   16:getfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//    9   19:invokevirtual   #436 <Method void AnimatedStateListDrawableCompat$AnimatedStateListState.mutate()>
			mMutated = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #432 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public volatile boolean onLayoutDirectionChanged(int i)
	{
		return super.onLayoutDirectionChanged(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #439 <Method boolean StateListDrawable.onLayoutDirectionChanged(int)>
	//    3    5:ireturn         
	}

	protected boolean onStateChange(int ai[])
	{
		int i = mState.indexOfKeyframe(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #443 <Method int AnimatedStateListDrawableCompat$AnimatedStateListState.indexOfKeyframe(int[])>
	//    4    8:istore_2        
		boolean flag;
		if(i != getCurrentIndex() && (selectTransition(i) || selectDrawable(i)))
	//*   5    9:iload_2         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #253 <Method int getCurrentIndex()>
	//*   8   14:icmpeq          38
	//*   9   17:aload_0         
	//*  10   18:iload_2         
	//*  11   19:invokespecial   #445 <Method boolean selectTransition(int)>
	//*  12   22:ifne            33
	//*  13   25:aload_0         
	//*  14   26:iload_2         
	//*  15   27:invokevirtual   #267 <Method boolean selectDrawable(int)>
	//*  16   30:ifeq            38
			flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_3        
		else
	//*  19   35:goto            40
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_3        
		Drawable drawable = getCurrent();
	//   22   40:aload_0         
	//   23   41:invokevirtual   #271 <Method Drawable getCurrent()>
	//   24   44:astore          5
		boolean flag1 = flag;
	//   25   46:iload_3         
	//   26   47:istore          4
		if(drawable != null)
	//*  27   49:aload           5
	//*  28   51:ifnull          64
			flag1 = flag | drawable.setState(ai);
	//   29   54:iload_3         
	//   30   55:aload           5
	//   31   57:aload_1         
	//   32   58:invokevirtual   #448 <Method boolean Drawable.setState(int[])>
	//   33   61:ior             
	//   34   62:istore          4
		return flag1;
	//   35   64:iload           4
	//   36   66:ireturn         
	}

	public volatile void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		super.scheduleDrawable(drawable, runnable, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:invokespecial   #452 <Method void StateListDrawable.scheduleDrawable(Drawable, Runnable, long)>
	//    5    7:return          
	}

	public volatile void setAlpha(int i)
	{
		super.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #455 <Method void StateListDrawable.setAlpha(int)>
	//    3    5:return          
	}

	public volatile void setAutoMirrored(boolean flag)
	{
		super.setAutoMirrored(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #458 <Method void StateListDrawable.setAutoMirrored(boolean)>
	//    3    5:return          
	}

	public volatile void setColorFilter(ColorFilter colorfilter)
	{
		super.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #462 <Method void StateListDrawable.setColorFilter(ColorFilter)>
	//    3    5:return          
	}

	protected void setConstantState(DrawableContainer.DrawableContainerState drawablecontainerstate)
	{
		super.setConstantState(drawablecontainerstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #463 <Method void StateListDrawable.setConstantState(DrawableContainer$DrawableContainerState)>
		if(drawablecontainerstate instanceof AnimatedStateListState)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #11  <Class AnimatedStateListDrawableCompat$AnimatedStateListState>
	//*   5    9:ifeq            20
			mState = (AnimatedStateListState)drawablecontainerstate;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #11  <Class AnimatedStateListDrawableCompat$AnimatedStateListState>
	//    9   17:putfield        #198 <Field AnimatedStateListDrawableCompat$AnimatedStateListState mState>
	//   10   20:return          
	}

	public volatile void setDither(boolean flag)
	{
		super.setDither(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #464 <Method void StateListDrawable.setDither(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #468 <Method void StateListDrawable.setHotspot(float, float)>
	//    4    6:return          
	}

	public volatile void setHotspotBounds(int i, int j, int k, int l)
	{
		super.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #472 <Method void StateListDrawable.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile void setTintList(ColorStateList colorstatelist)
	{
		super.setTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #476 <Method void StateListDrawable.setTintList(ColorStateList)>
	//    3    5:return          
	}

	public volatile void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		super.setTintMode(mode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #480 <Method void StateListDrawable.setTintMode(android.graphics.PorterDuff$Mode)>
	//    3    5:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		boolean flag2 = super.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #481 <Method boolean StateListDrawable.setVisible(boolean, boolean)>
	//    4    6:istore_3        
		if(mTransition != null && (flag2 || flag1))
	//*   5    7:aload_0         
	//*   6    8:getfield        #240 <Field AnimatedStateListDrawableCompat$Transition mTransition>
	//*   7   11:ifnull          39
	//*   8   14:iload_3         
	//*   9   15:ifne            22
	//*  10   18:iload_2         
	//*  11   19:ifeq            39
		{
			if(flag)
	//*  12   22:iload_1         
	//*  13   23:ifeq            35
			{
				mTransition.start();
	//   14   26:aload_0         
	//   15   27:getfield        #240 <Field AnimatedStateListDrawableCompat$Transition mTransition>
	//   16   30:invokevirtual   #290 <Method void AnimatedStateListDrawableCompat$Transition.start()>
				return flag2;
	//   17   33:iload_3         
	//   18   34:ireturn         
			}
			jumpToCurrentState();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #70  <Method void jumpToCurrentState()>
		}
		return flag2;
	//   21   39:iload_3         
	//   22   40:ireturn         
	}

	public volatile void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		super.unscheduleDrawable(drawable, runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #485 <Method void StateListDrawable.unscheduleDrawable(Drawable, Runnable)>
	//    4    6:return          
	}

	private static final String LOGTAG = "AnimatedStateListDrawableCompat";
	private boolean mMutated;
	private AnimatedStateListState mState;
	private Transition mTransition;
	private int mTransitionFromIndex;
	private int mTransitionToIndex;

	static 
	{
	//    0    0:return          
	}
}
