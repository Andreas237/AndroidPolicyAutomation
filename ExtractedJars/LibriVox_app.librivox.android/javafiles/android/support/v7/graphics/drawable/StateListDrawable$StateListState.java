// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

// Referenced classes of package android.support.v7.graphics.drawable:
//			StateListDrawable

class StateListDrawable$StateListState extends erState
{

	int addStateSet(int ai[], Drawable drawable)
	{
		int i = addChild(drawable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #26  <Method int addChild(Drawable)>
	//    3    5:istore_3        
		mStateSets[i] = ai;
	//    4    6:aload_0         
	//    5    7:getfield        #13  <Field int[][] mStateSets>
	//    6   10:iload_3         
	//    7   11:aload_1         
	//    8   12:aastore         
		return i;
	//    9   13:iload_3         
	//   10   14:ireturn         
	}

	public void growArray(int i, int j)
	{
		super.growArray(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void DrawableContainer$DrawableContainerState.growArray(int, int)>
		int ai[][] = new int[j][];
	//    4    6:iload_2         
	//    5    7:anewarray       int[][]
	//    6   10:astore_3        
		System.arraycopy(((Object) (mStateSets)), 0, ((Object) (ai)), 0, i);
	//    7   11:aload_0         
	//    8   12:getfield        #13  <Field int[][] mStateSets>
	//    9   15:iconst_0        
	//   10   16:aload_3         
	//   11   17:iconst_0        
	//   12   18:iload_1         
	//   13   19:invokestatic    #36  <Method void System.arraycopy(Object, int, Object, int, int)>
		mStateSets = ai;
	//   14   22:aload_0         
	//   15   23:aload_3         
	//   16   24:putfield        #13  <Field int[][] mStateSets>
	//   17   27:return          
	}

	int indexOfStateSet(int ai[])
	{
		int ai1[][] = mStateSets;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int[][] mStateSets>
	//    2    4:astore          4
		int j = getChildCount();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #41  <Method int getChildCount()>
	//    5   10:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iload_3         
	//*  10   15:icmpge          38
			if(StateSet.stateSetMatches(ai1[i], ai))
	//*  11   18:aload           4
	//*  12   20:iload_2         
	//*  13   21:aaload          
	//*  14   22:aload_1         
	//*  15   23:invokestatic    #47  <Method boolean StateSet.stateSetMatches(int[], int[])>
	//*  16   26:ifeq            31
				return i;
	//   17   29:iload_2         
	//   18   30:ireturn         

	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
	//*  23   35:goto            13
		return -1;
	//   24   38:iconst_m1       
	//   25   39:ireturn         
	}

	void mutate()
	{
		int ai[][] = mStateSets;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int[][] mStateSets>
	//    2    4:astore_2        
		int ai1[][] = new int[ai.length][];
	//    3    5:aload_2         
	//    4    6:arraylength     
	//    5    7:anewarray       int[][]
	//    6   10:astore_3        
		for(int i = ai.length - 1; i >= 0; i--)
	//*   7   11:aload_2         
	//*   8   12:arraylength     
	//*   9   13:iconst_1        
	//*  10   14:isub            
	//*  11   15:istore_1        
	//*  12   16:iload_1         
	//*  13   17:iflt            57
		{
			Object obj = ((Object) (mStateSets));
	//   14   20:aload_0         
	//   15   21:getfield        #13  <Field int[][] mStateSets>
	//   16   24:astore_2        
			if(obj[i] != null)
	//*  17   25:aload_2         
	//*  18   26:iload_1         
	//*  19   27:aaload          
	//*  20   28:ifnull          44
				obj = ((Object) ((int[])((int []) (obj[i])).clone()));
	//   21   31:aload_2         
	//   22   32:iload_1         
	//   23   33:aaload          
	//   24   34:invokevirtual   #53  <Method Object _5B_I.clone()>
	//   25   37:checkcast       #19  <Class int[]>
	//   26   40:astore_2        
			else
	//*  27   41:goto            46
				obj = null;
	//   28   44:aconst_null     
	//   29   45:astore_2        
			ai1[i] = ((int []) (obj));
	//   30   46:aload_3         
	//   31   47:iload_1         
	//   32   48:aload_2         
	//   33   49:aastore         
		}

	//   34   50:iload_1         
	//   35   51:iconst_1        
	//   36   52:isub            
	//   37   53:istore_1        
	//*  38   54:goto            16
		mStateSets = ai1;
	//   39   57:aload_0         
	//   40   58:aload_3         
	//   41   59:putfield        #13  <Field int[][] mStateSets>
	//   42   62:return          
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new StateListDrawable(this, ((Resources) (null)))));
	//    0    0:new             #57  <Class StateListDrawable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #60  <Method void StateListDrawable(StateListDrawable$StateListState, Resources)>
	//    5    9:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return ((Drawable) (new StateListDrawable(this, resources)));
	//    0    0:new             #57  <Class StateListDrawable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #60  <Method void StateListDrawable(StateListDrawable$StateListState, Resources)>
	//    5    9:areturn         
	}

	int mStateSets[][];

	StateListDrawable$StateListState(StateListDrawable$StateListState statelistdrawable$stateliststate, StateListDrawable statelistdrawable, Resources resources)
	{
		super(((erState) (statelistdrawable$stateliststate)), ((DrawableContainer) (statelistdrawable)), resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #11  <Method void DrawableContainer$DrawableContainerState(DrawableContainer$DrawableContainerState, DrawableContainer, Resources)>
		if(statelistdrawable$stateliststate != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          20
		{
			mStateSets = statelistdrawable$stateliststate.mStateSets;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:getfield        #13  <Field int[][] mStateSets>
	//   10   16:putfield        #13  <Field int[][] mStateSets>
			return;
	//   11   19:return          
		} else
		{
			mStateSets = new int[getCapacity()][];
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #17  <Method int getCapacity()>
	//   15   25:anewarray       int[][]
	//   16   28:putfield        #13  <Field int[][] mStateSets>
			return;
	//   17   31:return          
		}
	}
}
