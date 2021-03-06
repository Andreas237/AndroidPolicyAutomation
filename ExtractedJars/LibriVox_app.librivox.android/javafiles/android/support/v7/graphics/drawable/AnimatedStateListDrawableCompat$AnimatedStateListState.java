// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.g.h;
import android.support.v4.g.x;
import android.util.StateSet;

// Referenced classes of package android.support.v7.graphics.drawable:
//			AnimatedStateListDrawableCompat

class AnimatedStateListDrawableCompat$AnimatedStateListState extends StateListDrawable.StateListState
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
	//    3    3:invokespecial   #40  <Method int StateListDrawable$StateListState.addStateSet(int[], Drawable)>
	//    4    6:istore          4
		mStateIds.b(j, ((Object) (Integer.valueOf(i))));
	//    5    8:aload_0         
	//    6    9:getfield        #24  <Field x mStateIds>
	//    7   12:iload           4
	//    8   14:iload_3         
	//    9   15:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   10   18:invokevirtual   #50  <Method void x.b(int, Object)>
		return j;
	//   11   21:iload           4
	//   12   23:ireturn         
	}

	int addTransition(int i, int j, Drawable drawable, boolean flag)
	{
		int k = super.addChild(drawable);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #56  <Method int StateListDrawable$StateListState.addChild(Drawable)>
	//    3    5:istore          5
		long l1 = generateTransitionKey(i, j);
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:invokestatic    #58  <Method long generateTransitionKey(int, int)>
	//    7   12:lstore          8
		long l;
		if(flag)
	//*   8   14:iload           4
	//*   9   16:ifeq            27
			l = 0x0L;
	//   10   19:ldc2w           #10  <Long 0x0L>
	//   11   22:lstore          6
		else
	//*  12   24:goto            30
			l = 0L;
	//   13   27:lconst_0        
	//   14   28:lstore          6
		drawable = ((Drawable) (mTransitions));
	//   15   30:aload_0         
	//   16   31:getfield        #22  <Field h mTransitions>
	//   17   34:astore_3        
		long l3 = k;
	//   18   35:iload           5
	//   19   37:i2l             
	//   20   38:lstore          10
		((h) (drawable)).c(l1, ((Object) (Long.valueOf(l3 | l))));
	//   21   40:aload_3         
	//   22   41:lload           8
	//   23   43:lload           10
	//   24   45:lload           6
	//   25   47:lor             
	//   26   48:invokestatic    #63  <Method Long Long.valueOf(long)>
	//   27   51:invokevirtual   #67  <Method void h.c(long, Object)>
		if(flag)
	//*  28   54:iload           4
	//*  29   56:ifeq            87
		{
			long l2 = generateTransitionKey(j, i);
	//   30   59:iload_2         
	//   31   60:iload_1         
	//   32   61:invokestatic    #58  <Method long generateTransitionKey(int, int)>
	//   33   64:lstore          8
			mTransitions.c(l2, ((Object) (Long.valueOf(0x0L | l3 | l))));
	//   34   66:aload_0         
	//   35   67:getfield        #22  <Field h mTransitions>
	//   36   70:lload           8
	//   37   72:ldc2w           #7   <Long 0x0L>
	//   38   75:lload           10
	//   39   77:lor             
	//   40   78:lload           6
	//   41   80:lor             
	//   42   81:invokestatic    #63  <Method Long Long.valueOf(long)>
	//   43   84:invokevirtual   #67  <Method void h.c(long, Object)>
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
			return ((Integer)mStateIds.a(i, ((Object) (Integer.valueOf(0))))).intValue();
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field x mStateIds>
	//    6   10:iload_1         
	//    7   11:iconst_0        
	//    8   12:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #73  <Method Object x.a(int, Object)>
	//   10   18:checkcast       #42  <Class Integer>
	//   11   21:invokevirtual   #77  <Method int Integer.intValue()>
	//   12   24:ireturn         
	}

	int indexOfKeyframe(int ai[])
	{
		int i = super.indexOfStateSet(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method int StateListDrawable$StateListState.indexOfStateSet(int[])>
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
	//    9   13:getstatic       #88  <Field int[] StateSet.WILD_CARD>
	//   10   16:invokespecial   #82  <Method int StateListDrawable$StateListState.indexOfStateSet(int[])>
	//   11   19:ireturn         
	}

	int indexOfTransition(int i, int j)
	{
		long l = generateTransitionKey(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #58  <Method long generateTransitionKey(int, int)>
	//    3    5:lstore_3        
		return (int)((Long)mTransitions.a(l, ((Object) (Long.valueOf(-1L))))).longValue();
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field h mTransitions>
	//    6   10:lload_3         
	//    7   11:ldc2w           #91  <Long -1L>
	//    8   14:invokestatic    #63  <Method Long Long.valueOf(long)>
	//    9   17:invokevirtual   #95  <Method Object h.a(long, Object)>
	//   10   20:checkcast       #60  <Class Long>
	//   11   23:invokevirtual   #99  <Method long Long.longValue()>
	//   12   26:l2i             
	//   13   27:ireturn         
	}

	boolean isTransitionReversed(int i, int j)
	{
		long l = generateTransitionKey(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #58  <Method long generateTransitionKey(int, int)>
	//    3    5:lstore_3        
		return (((Long)mTransitions.a(l, ((Object) (Long.valueOf(-1L))))).longValue() & 0x0L) != 0L;
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field h mTransitions>
	//    6   10:lload_3         
	//    7   11:ldc2w           #91  <Long -1L>
	//    8   14:invokestatic    #63  <Method Long Long.valueOf(long)>
	//    9   17:invokevirtual   #95  <Method Object h.a(long, Object)>
	//   10   20:checkcast       #60  <Class Long>
	//   11   23:invokevirtual   #99  <Method long Long.longValue()>
	//   12   26:ldc2w           #7   <Long 0x0L>
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
		mTransitions = mTransitions.a();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field h mTransitions>
	//    3    5:invokevirtual   #105 <Method h h.a()>
	//    4    8:putfield        #22  <Field h mTransitions>
		mStateIds = mStateIds.a();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field x mStateIds>
	//    8   16:invokevirtual   #108 <Method x x.a()>
	//    9   19:putfield        #24  <Field x mStateIds>
	//   10   22:return          
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new AnimatedStateListDrawableCompat(this, ((Resources) (null)))));
	//    0    0:new             #112 <Class AnimatedStateListDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #115 <Method void AnimatedStateListDrawableCompat(AnimatedStateListDrawableCompat$AnimatedStateListState, Resources)>
	//    5    9:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return ((Drawable) (new AnimatedStateListDrawableCompat(this, resources)));
	//    0    0:new             #112 <Class AnimatedStateListDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #115 <Method void AnimatedStateListDrawableCompat(AnimatedStateListDrawableCompat$AnimatedStateListState, Resources)>
	//    5    9:areturn         
	}

	boolean transitionHasReversibleFlag(int i, int j)
	{
		long l = generateTransitionKey(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #58  <Method long generateTransitionKey(int, int)>
	//    3    5:lstore_3        
		return (((Long)mTransitions.a(l, ((Object) (Long.valueOf(-1L))))).longValue() & 0x0L) != 0L;
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field h mTransitions>
	//    6   10:lload_3         
	//    7   11:ldc2w           #91  <Long -1L>
	//    8   14:invokestatic    #63  <Method Long Long.valueOf(long)>
	//    9   17:invokevirtual   #95  <Method Object h.a(long, Object)>
	//   10   20:checkcast       #60  <Class Long>
	//   11   23:invokevirtual   #99  <Method long Long.longValue()>
	//   12   26:ldc2w           #10  <Long 0x0L>
	//   13   29:land            
	//   14   30:lconst_0        
	//   15   31:lcmp            
	//   16   32:ifeq            37
	//   17   35:iconst_1        
	//   18   36:ireturn         
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	private static final long REVERSED_BIT = 0x0L;
	private static final long REVERSIBLE_FLAG_BIT = 0x0L;
	x mStateIds;
	h mTransitions;

	AnimatedStateListDrawableCompat$AnimatedStateListState(AnimatedStateListDrawableCompat$AnimatedStateListState animatedstatelistdrawablecompat$animatedstateliststate, AnimatedStateListDrawableCompat animatedstatelistdrawablecompat, Resources resources)
	{
		super(((StateListDrawable.StateListState) (animatedstatelistdrawablecompat$animatedstateliststate)), ((StateListDrawable) (animatedstatelistdrawablecompat)), resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #20  <Method void StateListDrawable$StateListState(StateListDrawable$StateListState, StateListDrawable, Resources)>
		if(animatedstatelistdrawablecompat$animatedstateliststate != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          28
		{
			mTransitions = animatedstatelistdrawablecompat$animatedstateliststate.mTransitions;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:getfield        #22  <Field h mTransitions>
	//   10   16:putfield        #22  <Field h mTransitions>
			mStateIds = animatedstatelistdrawablecompat$animatedstateliststate.mStateIds;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:getfield        #24  <Field x mStateIds>
	//   14   24:putfield        #24  <Field x mStateIds>
			return;
	//   15   27:return          
		} else
		{
			mTransitions = new h();
	//   16   28:aload_0         
	//   17   29:new             #26  <Class h>
	//   18   32:dup             
	//   19   33:invokespecial   #29  <Method void h()>
	//   20   36:putfield        #22  <Field h mTransitions>
			mStateIds = new x();
	//   21   39:aload_0         
	//   22   40:new             #31  <Class x>
	//   23   43:dup             
	//   24   44:invokespecial   #32  <Method void x()>
	//   25   47:putfield        #24  <Field x mStateIds>
			return;
	//   26   50:return          
		}
	}
}
