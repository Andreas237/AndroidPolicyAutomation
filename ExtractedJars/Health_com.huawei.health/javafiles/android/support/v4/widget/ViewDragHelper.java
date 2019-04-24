// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class ViewDragHelper
{
	public static abstract class Callback
	{

		public int clampViewPositionHorizontal(View view, int i, int j)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int clampViewPositionVertical(View view, int i, int j)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getOrderedChildIndex(int i)
		{
			return i;
		//    0    0:iload_1         
		//    1    1:ireturn         
		}

		public int getViewHorizontalDragRange(View view)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getViewVerticalDragRange(View view)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onEdgeDragStarted(int i, int j)
		{
		//    0    0:return          
		}

		public boolean onEdgeLock(int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onEdgeTouched(int i, int j)
		{
		//    0    0:return          
		}

		public void onViewCaptured(View view, int i)
		{
		//    0    0:return          
		}

		public void onViewDragStateChanged(int i)
		{
		//    0    0:return          
		}

		public void onViewPositionChanged(View view, int i, int j, int k, int l)
		{
		//    0    0:return          
		}

		public void onViewReleased(View view, float f, float f1)
		{
		//    0    0:return          
		}

		public abstract boolean tryCaptureView(View view, int i);

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private ViewDragHelper(Context context, ViewGroup viewgroup, Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void Object()>
		mActivePointerId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #88  <Field int mActivePointerId>
	//    5    9:aload_0         
	//    6   10:new             #8   <Class ViewDragHelper$2>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #91  <Method void ViewDragHelper$2(ViewDragHelper)>
	//   10   18:putfield        #93  <Field Runnable mSetIdleRunnable>
		if(viewgroup == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       35
			throw new IllegalArgumentException("Parent view may not be null");
	//   13   25:new             #95  <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #97  <String "Parent view may not be null">
	//   16   31:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
		if(callback == null)
	//*  18   35:aload_3         
	//*  19   36:ifnonnull       49
		{
			throw new IllegalArgumentException("Callback may not be null");
	//   20   39:new             #95  <Class IllegalArgumentException>
	//   21   42:dup             
	//   22   43:ldc1            #102 <String "Callback may not be null">
	//   23   45:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//   24   48:athrow          
		} else
		{
			mParentView = viewgroup;
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:putfield        #104 <Field ViewGroup mParentView>
			mCallback = callback;
	//   28   54:aload_0         
	//   29   55:aload_3         
	//   30   56:putfield        #106 <Field ViewDragHelper$Callback mCallback>
			viewgroup = ((ViewGroup) (ViewConfiguration.get(context)));
	//   31   59:aload_1         
	//   32   60:invokestatic    #112 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   33   63:astore_2        
			mEdgeSize = (int)(20F * context.getResources().getDisplayMetrics().density + 0.5F);
	//   34   64:aload_0         
	//   35   65:ldc1            #113 <Float 20F>
	//   36   67:aload_1         
	//   37   68:invokevirtual   #119 <Method Resources Context.getResources()>
	//   38   71:invokevirtual   #125 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   39   74:getfield        #130 <Field float DisplayMetrics.density>
	//   40   77:fmul            
	//   41   78:ldc1            #131 <Float 0.5F>
	//   42   80:fadd            
	//   43   81:f2i             
	//   44   82:putfield        #133 <Field int mEdgeSize>
			mTouchSlop = ((ViewConfiguration) (viewgroup)).getScaledTouchSlop();
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:invokevirtual   #137 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   48   90:putfield        #139 <Field int mTouchSlop>
			mMaxVelocity = ((ViewConfiguration) (viewgroup)).getScaledMaximumFlingVelocity();
	//   49   93:aload_0         
	//   50   94:aload_2         
	//   51   95:invokevirtual   #142 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   52   98:i2f             
	//   53   99:putfield        #144 <Field float mMaxVelocity>
			mMinVelocity = ((ViewConfiguration) (viewgroup)).getScaledMinimumFlingVelocity();
	//   54  102:aload_0         
	//   55  103:aload_2         
	//   56  104:invokevirtual   #147 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   57  107:i2f             
	//   58  108:putfield        #149 <Field float mMinVelocity>
			mScroller = new OverScroller(context, sInterpolator);
	//   59  111:aload_0         
	//   60  112:new             #151 <Class OverScroller>
	//   61  115:dup             
	//   62  116:aload_1         
	//   63  117:getstatic       #83  <Field Interpolator sInterpolator>
	//   64  120:invokespecial   #154 <Method void OverScroller(Context, Interpolator)>
	//   65  123:putfield        #156 <Field OverScroller mScroller>
			return;
	//   66  126:return          
		}
	}

	private boolean checkNewEdgeDrag(float f, float f1, int i, int j)
	{
		f = Math.abs(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #164 <Method float Math.abs(float)>
	//    2    4:fstore_1        
		f1 = Math.abs(f1);
	//    3    5:fload_2         
	//    4    6:invokestatic    #164 <Method float Math.abs(float)>
	//    5    9:fstore_2        
		if((mInitialEdgesTouched[i] & j) != j || (mTrackingEdges & j) == 0 || (mEdgeDragsLocked[i] & j) == j || (mEdgeDragsInProgress[i] & j) == j || f <= (float)mTouchSlop && f1 <= (float)mTouchSlop)
	//*   6   10:aload_0         
	//*   7   11:getfield        #166 <Field int[] mInitialEdgesTouched>
	//*   8   14:iload_3         
	//*   9   15:iaload          
	//*  10   16:iload           4
	//*  11   18:iand            
	//*  12   19:iload           4
	//*  13   21:icmpne          82
	//*  14   24:aload_0         
	//*  15   25:getfield        #168 <Field int mTrackingEdges>
	//*  16   28:iload           4
	//*  17   30:iand            
	//*  18   31:ifeq            82
	//*  19   34:aload_0         
	//*  20   35:getfield        #170 <Field int[] mEdgeDragsLocked>
	//*  21   38:iload_3         
	//*  22   39:iaload          
	//*  23   40:iload           4
	//*  24   42:iand            
	//*  25   43:iload           4
	//*  26   45:icmpeq          82
	//*  27   48:aload_0         
	//*  28   49:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//*  29   52:iload_3         
	//*  30   53:iaload          
	//*  31   54:iload           4
	//*  32   56:iand            
	//*  33   57:iload           4
	//*  34   59:icmpeq          82
	//*  35   62:fload_1         
	//*  36   63:aload_0         
	//*  37   64:getfield        #139 <Field int mTouchSlop>
	//*  38   67:i2f             
	//*  39   68:fcmpg           
	//*  40   69:ifgt            84
	//*  41   72:fload_2         
	//*  42   73:aload_0         
	//*  43   74:getfield        #139 <Field int mTouchSlop>
	//*  44   77:i2f             
	//*  45   78:fcmpg           
	//*  46   79:ifgt            84
			return false;
	//   47   82:iconst_0        
	//   48   83:ireturn         
		if(f < 0.5F * f1 && mCallback.onEdgeLock(j))
	//*  49   84:fload_1         
	//*  50   85:ldc1            #131 <Float 0.5F>
	//*  51   87:fload_2         
	//*  52   88:fmul            
	//*  53   89:fcmpg           
	//*  54   90:ifge            124
	//*  55   93:aload_0         
	//*  56   94:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*  57   97:iload           4
	//*  58   99:invokevirtual   #176 <Method boolean ViewDragHelper$Callback.onEdgeLock(int)>
	//*  59  102:ifeq            124
		{
			int ai[] = mEdgeDragsLocked;
	//   60  105:aload_0         
	//   61  106:getfield        #170 <Field int[] mEdgeDragsLocked>
	//   62  109:astore          5
			ai[i] = ai[i] | j;
	//   63  111:aload           5
	//   64  113:iload_3         
	//   65  114:aload           5
	//   66  116:iload_3         
	//   67  117:iaload          
	//   68  118:iload           4
	//   69  120:ior             
	//   70  121:iastore         
			return false;
	//   71  122:iconst_0        
	//   72  123:ireturn         
		}
		return (mEdgeDragsInProgress[i] & j) == 0 && f > (float)mTouchSlop;
	//   73  124:aload_0         
	//   74  125:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   75  128:iload_3         
	//   76  129:iaload          
	//   77  130:iload           4
	//   78  132:iand            
	//   79  133:ifne            148
	//   80  136:fload_1         
	//   81  137:aload_0         
	//   82  138:getfield        #139 <Field int mTouchSlop>
	//   83  141:i2f             
	//   84  142:fcmpl           
	//   85  143:ifle            148
	//   86  146:iconst_1        
	//   87  147:ireturn         
	//   88  148:iconst_0        
	//   89  149:ireturn         
	}

	private boolean checkTouchSlop(View view, float f, float f1)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		boolean flag;
		if(mCallback.getViewHorizontalDragRange(view) > 0)
	//*   4    6:aload_0         
	//*   5    7:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #182 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//*   8   14:ifle            23
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore          4
		else
	//*  11   20:goto            26
			flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          4
		boolean flag1;
		if(mCallback.getViewVerticalDragRange(view) > 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #185 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//*  18   34:ifle            43
			flag1 = true;
	//   19   37:iconst_1        
	//   20   38:istore          5
		else
	//*  21   40:goto            46
			flag1 = false;
	//   22   43:iconst_0        
	//   23   44:istore          5
		if(flag && flag1)
	//*  24   46:iload           4
	//*  25   48:ifeq            81
	//*  26   51:iload           5
	//*  27   53:ifeq            81
			return f * f + f1 * f1 > (float)(mTouchSlop * mTouchSlop);
	//   28   56:fload_2         
	//   29   57:fload_2         
	//   30   58:fmul            
	//   31   59:fload_3         
	//   32   60:fload_3         
	//   33   61:fmul            
	//   34   62:fadd            
	//   35   63:aload_0         
	//   36   64:getfield        #139 <Field int mTouchSlop>
	//   37   67:aload_0         
	//   38   68:getfield        #139 <Field int mTouchSlop>
	//   39   71:imul            
	//   40   72:i2f             
	//   41   73:fcmpl           
	//   42   74:ifle            79
	//   43   77:iconst_1        
	//   44   78:ireturn         
	//   45   79:iconst_0        
	//   46   80:ireturn         
		if(flag)
	//*  47   81:iload           4
	//*  48   83:ifeq            103
			return Math.abs(f) > (float)mTouchSlop;
	//   49   86:fload_2         
	//   50   87:invokestatic    #164 <Method float Math.abs(float)>
	//   51   90:aload_0         
	//   52   91:getfield        #139 <Field int mTouchSlop>
	//   53   94:i2f             
	//   54   95:fcmpl           
	//   55   96:ifle            101
	//   56   99:iconst_1        
	//   57  100:ireturn         
	//   58  101:iconst_0        
	//   59  102:ireturn         
		if(flag1)
	//*  60  103:iload           5
	//*  61  105:ifeq            125
			return Math.abs(f1) > (float)mTouchSlop;
	//   62  108:fload_3         
	//   63  109:invokestatic    #164 <Method float Math.abs(float)>
	//   64  112:aload_0         
	//   65  113:getfield        #139 <Field int mTouchSlop>
	//   66  116:i2f             
	//   67  117:fcmpl           
	//   68  118:ifle            123
	//   69  121:iconst_1        
	//   70  122:ireturn         
	//   71  123:iconst_0        
	//   72  124:ireturn         
		else
			return false;
	//   73  125:iconst_0        
	//   74  126:ireturn         
	}

	private float clampMag(float f, float f1, float f2)
	{
		float f3 = Math.abs(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #164 <Method float Math.abs(float)>
	//    2    4:fstore          4
		if(f3 < f1)
	//*   3    6:fload           4
	//*   4    8:fload_2         
	//*   5    9:fcmpg           
	//*   6   10:ifge            15
			return 0.0F;
	//    7   13:fconst_0        
	//    8   14:freturn         
		if(f3 > f2)
	//*   9   15:fload           4
	//*  10   17:fload_3         
	//*  11   18:fcmpl           
	//*  12   19:ifle            33
		{
			if(f > 0.0F)
	//*  13   22:fload_1         
	//*  14   23:fconst_0        
	//*  15   24:fcmpl           
	//*  16   25:ifle            30
				return f2;
	//   17   28:fload_3         
	//   18   29:freturn         
			else
				return -f2;
	//   19   30:fload_3         
	//   20   31:fneg            
	//   21   32:freturn         
		} else
		{
			return f;
	//   22   33:fload_1         
	//   23   34:freturn         
		}
	}

	private int clampMag(int i, int j, int k)
	{
		int l = Math.abs(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #191 <Method int Math.abs(int)>
	//    2    4:istore          4
		if(l < j)
	//*   3    6:iload           4
	//*   4    8:iload_2         
	//*   5    9:icmpge          14
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		if(l > k)
	//*   8   14:iload           4
	//*   9   16:iload_3         
	//*  10   17:icmple          29
		{
			if(i > 0)
	//*  11   20:iload_1         
	//*  12   21:ifle            26
				return k;
	//   13   24:iload_3         
	//   14   25:ireturn         
			else
				return -k;
	//   15   26:iload_3         
	//   16   27:ineg            
	//   17   28:ireturn         
		} else
		{
			return i;
	//   18   29:iload_1         
	//   19   30:ireturn         
		}
	}

	private void clearMotionHistory()
	{
		if(mInitialMotionX == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field float[] mInitialMotionX>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			Arrays.fill(mInitialMotionX, 0.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #194 <Field float[] mInitialMotionX>
	//    6   12:fconst_0        
	//    7   13:invokestatic    #200 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mInitialMotionY, 0.0F);
	//    8   16:aload_0         
	//    9   17:getfield        #202 <Field float[] mInitialMotionY>
	//   10   20:fconst_0        
	//   11   21:invokestatic    #200 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mLastMotionX, 0.0F);
	//   12   24:aload_0         
	//   13   25:getfield        #204 <Field float[] mLastMotionX>
	//   14   28:fconst_0        
	//   15   29:invokestatic    #200 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mLastMotionY, 0.0F);
	//   16   32:aload_0         
	//   17   33:getfield        #206 <Field float[] mLastMotionY>
	//   18   36:fconst_0        
	//   19   37:invokestatic    #200 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mInitialEdgesTouched, 0);
	//   20   40:aload_0         
	//   21   41:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   22   44:iconst_0        
	//   23   45:invokestatic    #209 <Method void Arrays.fill(int[], int)>
			Arrays.fill(mEdgeDragsInProgress, 0);
	//   24   48:aload_0         
	//   25   49:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   26   52:iconst_0        
	//   27   53:invokestatic    #209 <Method void Arrays.fill(int[], int)>
			Arrays.fill(mEdgeDragsLocked, 0);
	//   28   56:aload_0         
	//   29   57:getfield        #170 <Field int[] mEdgeDragsLocked>
	//   30   60:iconst_0        
	//   31   61:invokestatic    #209 <Method void Arrays.fill(int[], int)>
			mPointersDown = 0;
	//   32   64:aload_0         
	//   33   65:iconst_0        
	//   34   66:putfield        #211 <Field int mPointersDown>
			return;
	//   35   69:return          
		}
	}

	private void clearMotionHistory(int i)
	{
		if(mInitialMotionX == null || !isPointerDown(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field float[] mInitialMotionX>
	//*   2    4:ifnull          15
	//*   3    7:aload_0         
	//*   4    8:iload_1         
	//*   5    9:invokevirtual   #215 <Method boolean isPointerDown(int)>
	//*   6   12:ifne            16
		{
			return;
	//    7   15:return          
		} else
		{
			mInitialMotionX[i] = 0.0F;
	//    8   16:aload_0         
	//    9   17:getfield        #194 <Field float[] mInitialMotionX>
	//   10   20:iload_1         
	//   11   21:fconst_0        
	//   12   22:fastore         
			mInitialMotionY[i] = 0.0F;
	//   13   23:aload_0         
	//   14   24:getfield        #202 <Field float[] mInitialMotionY>
	//   15   27:iload_1         
	//   16   28:fconst_0        
	//   17   29:fastore         
			mLastMotionX[i] = 0.0F;
	//   18   30:aload_0         
	//   19   31:getfield        #204 <Field float[] mLastMotionX>
	//   20   34:iload_1         
	//   21   35:fconst_0        
	//   22   36:fastore         
			mLastMotionY[i] = 0.0F;
	//   23   37:aload_0         
	//   24   38:getfield        #206 <Field float[] mLastMotionY>
	//   25   41:iload_1         
	//   26   42:fconst_0        
	//   27   43:fastore         
			mInitialEdgesTouched[i] = 0;
	//   28   44:aload_0         
	//   29   45:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   30   48:iload_1         
	//   31   49:iconst_0        
	//   32   50:iastore         
			mEdgeDragsInProgress[i] = 0;
	//   33   51:aload_0         
	//   34   52:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   35   55:iload_1         
	//   36   56:iconst_0        
	//   37   57:iastore         
			mEdgeDragsLocked[i] = 0;
	//   38   58:aload_0         
	//   39   59:getfield        #170 <Field int[] mEdgeDragsLocked>
	//   40   62:iload_1         
	//   41   63:iconst_0        
	//   42   64:iastore         
			mPointersDown = mPointersDown & ~(1 << i);
	//   43   65:aload_0         
	//   44   66:aload_0         
	//   45   67:getfield        #211 <Field int mPointersDown>
	//   46   70:iconst_1        
	//   47   71:iload_1         
	//   48   72:ishl            
	//   49   73:iconst_m1       
	//   50   74:ixor            
	//   51   75:iand            
	//   52   76:putfield        #211 <Field int mPointersDown>
			return;
	//   53   79:return          
		}
	}

	private int computeAxisDuration(int i, int j, int k)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int l = mParentView.getWidth();
	//    4    6:aload_0         
	//    5    7:getfield        #104 <Field ViewGroup mParentView>
	//    6   10:invokevirtual   #221 <Method int ViewGroup.getWidth()>
	//    7   13:istore          7
		int i1 = l / 2;
	//    8   15:iload           7
	//    9   17:iconst_2        
	//   10   18:idiv            
	//   11   19:istore          8
		float f2 = Math.min(1.0F, (float)Math.abs(i) / (float)l);
	//   12   21:fconst_1        
	//   13   22:iload_1         
	//   14   23:invokestatic    #191 <Method int Math.abs(int)>
	//   15   26:i2f             
	//   16   27:iload           7
	//   17   29:i2f             
	//   18   30:fdiv            
	//   19   31:invokestatic    #225 <Method float Math.min(float, float)>
	//   20   34:fstore          6
		float f = i1;
	//   21   36:iload           8
	//   22   38:i2f             
	//   23   39:fstore          4
		float f1 = i1;
	//   24   41:iload           8
	//   25   43:i2f             
	//   26   44:fstore          5
		f2 = distanceInfluenceForSnapDuration(f2);
	//   27   46:aload_0         
	//   28   47:fload           6
	//   29   49:invokespecial   #228 <Method float distanceInfluenceForSnapDuration(float)>
	//   30   52:fstore          6
		j = Math.abs(j);
	//   31   54:iload_2         
	//   32   55:invokestatic    #191 <Method int Math.abs(int)>
	//   33   58:istore_2        
		if(j > 0)
	//*  34   59:iload_2         
	//*  35   60:ifle            89
			i = Math.round(Math.abs((f + f1 * f2) / (float)j) * 1000F) * 4;
	//   36   63:fload           4
	//   37   65:fload           5
	//   38   67:fload           6
	//   39   69:fmul            
	//   40   70:fadd            
	//   41   71:iload_2         
	//   42   72:i2f             
	//   43   73:fdiv            
	//   44   74:invokestatic    #164 <Method float Math.abs(float)>
	//   45   77:ldc1            #229 <Float 1000F>
	//   46   79:fmul            
	//   47   80:invokestatic    #233 <Method int Math.round(float)>
	//   48   83:iconst_4        
	//   49   84:imul            
	//   50   85:istore_1        
		else
	//*  51   86:goto            104
			i = (int)((1.0F + (float)Math.abs(i) / (float)k) * 256F);
	//   52   89:fconst_1        
	//   53   90:iload_1         
	//   54   91:invokestatic    #191 <Method int Math.abs(int)>
	//   55   94:i2f             
	//   56   95:iload_3         
	//   57   96:i2f             
	//   58   97:fdiv            
	//   59   98:fadd            
	//   60   99:ldc1            #234 <Float 256F>
	//   61  101:fmul            
	//   62  102:f2i             
	//   63  103:istore_1        
		return Math.min(i, 600);
	//   64  104:iload_1         
	//   65  105:sipush          600
	//   66  108:invokestatic    #237 <Method int Math.min(int, int)>
	//   67  111:ireturn         
	}

	private int computeSettleDuration(View view, int i, int j, int k, int l)
	{
		k = clampMag(k, (int)mMinVelocity, (int)mMaxVelocity);
	//    0    0:aload_0         
	//    1    1:iload           4
	//    2    3:aload_0         
	//    3    4:getfield        #149 <Field float mMinVelocity>
	//    4    7:f2i             
	//    5    8:aload_0         
	//    6    9:getfield        #144 <Field float mMaxVelocity>
	//    7   12:f2i             
	//    8   13:invokespecial   #241 <Method int clampMag(int, int, int)>
	//    9   16:istore          4
		l = clampMag(l, (int)mMinVelocity, (int)mMaxVelocity);
	//   10   18:aload_0         
	//   11   19:iload           5
	//   12   21:aload_0         
	//   13   22:getfield        #149 <Field float mMinVelocity>
	//   14   25:f2i             
	//   15   26:aload_0         
	//   16   27:getfield        #144 <Field float mMaxVelocity>
	//   17   30:f2i             
	//   18   31:invokespecial   #241 <Method int clampMag(int, int, int)>
	//   19   34:istore          5
		int i1 = Math.abs(i);
	//   20   36:iload_2         
	//   21   37:invokestatic    #191 <Method int Math.abs(int)>
	//   22   40:istore          8
		int j1 = Math.abs(j);
	//   23   42:iload_3         
	//   24   43:invokestatic    #191 <Method int Math.abs(int)>
	//   25   46:istore          9
		int k1 = Math.abs(k);
	//   26   48:iload           4
	//   27   50:invokestatic    #191 <Method int Math.abs(int)>
	//   28   53:istore          10
		int l1 = Math.abs(l);
	//   29   55:iload           5
	//   30   57:invokestatic    #191 <Method int Math.abs(int)>
	//   31   60:istore          11
		int i2 = k1 + l1;
	//   32   62:iload           10
	//   33   64:iload           11
	//   34   66:iadd            
	//   35   67:istore          12
		int j2 = i1 + j1;
	//   36   69:iload           8
	//   37   71:iload           9
	//   38   73:iadd            
	//   39   74:istore          13
		float f;
		if(k != 0)
	//*  40   76:iload           4
	//*  41   78:ifeq            93
			f = (float)k1 / (float)i2;
	//   42   81:iload           10
	//   43   83:i2f             
	//   44   84:iload           12
	//   45   86:i2f             
	//   46   87:fdiv            
	//   47   88:fstore          6
		else
	//*  48   90:goto            102
			f = (float)i1 / (float)j2;
	//   49   93:iload           8
	//   50   95:i2f             
	//   51   96:iload           13
	//   52   98:i2f             
	//   53   99:fdiv            
	//   54  100:fstore          6
		float f1;
		if(l != 0)
	//*  55  102:iload           5
	//*  56  104:ifeq            119
			f1 = (float)l1 / (float)i2;
	//   57  107:iload           11
	//   58  109:i2f             
	//   59  110:iload           12
	//   60  112:i2f             
	//   61  113:fdiv            
	//   62  114:fstore          7
		else
	//*  63  116:goto            128
			f1 = (float)j1 / (float)j2;
	//   64  119:iload           9
	//   65  121:i2f             
	//   66  122:iload           13
	//   67  124:i2f             
	//   68  125:fdiv            
	//   69  126:fstore          7
		i = computeAxisDuration(i, k, mCallback.getViewHorizontalDragRange(view));
	//   70  128:aload_0         
	//   71  129:iload_2         
	//   72  130:iload           4
	//   73  132:aload_0         
	//   74  133:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   75  136:aload_1         
	//   76  137:invokevirtual   #182 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//   77  140:invokespecial   #243 <Method int computeAxisDuration(int, int, int)>
	//   78  143:istore_2        
		j = computeAxisDuration(j, l, mCallback.getViewVerticalDragRange(view));
	//   79  144:aload_0         
	//   80  145:iload_3         
	//   81  146:iload           5
	//   82  148:aload_0         
	//   83  149:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   84  152:aload_1         
	//   85  153:invokevirtual   #185 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//   86  156:invokespecial   #243 <Method int computeAxisDuration(int, int, int)>
	//   87  159:istore_3        
		return (int)((float)i * f + (float)j * f1);
	//   88  160:iload_2         
	//   89  161:i2f             
	//   90  162:fload           6
	//   91  164:fmul            
	//   92  165:iload_3         
	//   93  166:i2f             
	//   94  167:fload           7
	//   95  169:fmul            
	//   96  170:fadd            
	//   97  171:f2i             
	//   98  172:ireturn         
	}

	public static ViewDragHelper create(ViewGroup viewgroup, float f, Callback callback)
	{
		viewgroup = ((ViewGroup) (create(viewgroup, callback)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #248 <Method ViewDragHelper create(ViewGroup, ViewDragHelper$Callback)>
	//    3    5:astore_0        
		viewgroup.mTouchSlop = (int)((float)((ViewDragHelper) (viewgroup)).mTouchSlop * (1.0F / f));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #139 <Field int mTouchSlop>
	//    7   11:i2f             
	//    8   12:fconst_1        
	//    9   13:fload_1         
	//   10   14:fdiv            
	//   11   15:fmul            
	//   12   16:f2i             
	//   13   17:putfield        #139 <Field int mTouchSlop>
		return ((ViewDragHelper) (viewgroup));
	//   14   20:aload_0         
	//   15   21:areturn         
	}

	public static ViewDragHelper create(ViewGroup viewgroup, Callback callback)
	{
		return new ViewDragHelper(viewgroup.getContext(), viewgroup, callback);
	//    0    0:new             #2   <Class ViewDragHelper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #252 <Method Context ViewGroup.getContext()>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #254 <Method void ViewDragHelper(Context, ViewGroup, ViewDragHelper$Callback)>
	//    7   13:areturn         
	}

	private void dispatchViewReleased(float f, float f1)
	{
		mReleaseInProgress = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #258 <Field boolean mReleaseInProgress>
		mCallback.onViewReleased(mCapturedView, f, f1);
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//    5    9:aload_0         
	//    6   10:getfield        #260 <Field View mCapturedView>
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:invokevirtual   #264 <Method void ViewDragHelper$Callback.onViewReleased(View, float, float)>
		mReleaseInProgress = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #258 <Field boolean mReleaseInProgress>
		if(mDragState == 1)
	//*  13   23:aload_0         
	//*  14   24:getfield        #266 <Field int mDragState>
	//*  15   27:iconst_1        
	//*  16   28:icmpne          36
			setDragState(0);
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #269 <Method void setDragState(int)>
	//   20   36:return          
	}

	private float distanceInfluenceForSnapDuration(float f)
	{
		return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
	//    0    0:fload_1         
	//    1    1:ldc1            #131 <Float 0.5F>
	//    2    3:fsub            
	//    3    4:f2d             
	//    4    5:ldc2w           #270 <Double 0.4712389167638204D>
	//    5    8:dmul            
	//    6    9:d2f             
	//    7   10:f2d             
	//    8   11:invokestatic    #275 <Method double Math.sin(double)>
	//    9   14:d2f             
	//   10   15:freturn         
	}

	private void dragTo(int i, int j, int k, int l)
	{
		int j1 = i;
	//    0    0:iload_1         
	//    1    1:istore          6
		int i1 = j;
	//    2    3:iload_2         
	//    3    4:istore          5
		int k1 = mCapturedView.getLeft();
	//    4    6:aload_0         
	//    5    7:getfield        #260 <Field View mCapturedView>
	//    6   10:invokevirtual   #282 <Method int View.getLeft()>
	//    7   13:istore          7
		int l1 = mCapturedView.getTop();
	//    8   15:aload_0         
	//    9   16:getfield        #260 <Field View mCapturedView>
	//   10   19:invokevirtual   #285 <Method int View.getTop()>
	//   11   22:istore          8
		if(k != 0)
	//*  12   24:iload_3         
	//*  13   25:ifeq            55
		{
			j1 = mCallback.clampViewPositionHorizontal(mCapturedView, i, k);
	//   14   28:aload_0         
	//   15   29:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   16   32:aload_0         
	//   17   33:getfield        #260 <Field View mCapturedView>
	//   18   36:iload_1         
	//   19   37:iload_3         
	//   20   38:invokevirtual   #289 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//   21   41:istore          6
			ViewCompat.offsetLeftAndRight(mCapturedView, j1 - k1);
	//   22   43:aload_0         
	//   23   44:getfield        #260 <Field View mCapturedView>
	//   24   47:iload           6
	//   25   49:iload           7
	//   26   51:isub            
	//   27   52:invokestatic    #295 <Method void ViewCompat.offsetLeftAndRight(View, int)>
		}
		if(l != 0)
	//*  28   55:iload           4
	//*  29   57:ifeq            88
		{
			i1 = mCallback.clampViewPositionVertical(mCapturedView, j, l);
	//   30   60:aload_0         
	//   31   61:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   32   64:aload_0         
	//   33   65:getfield        #260 <Field View mCapturedView>
	//   34   68:iload_2         
	//   35   69:iload           4
	//   36   71:invokevirtual   #298 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//   37   74:istore          5
			ViewCompat.offsetTopAndBottom(mCapturedView, i1 - l1);
	//   38   76:aload_0         
	//   39   77:getfield        #260 <Field View mCapturedView>
	//   40   80:iload           5
	//   41   82:iload           8
	//   42   84:isub            
	//   43   85:invokestatic    #301 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		}
		if(k != 0 || l != 0)
	//*  44   88:iload_3         
	//*  45   89:ifne            97
	//*  46   92:iload           4
	//*  47   94:ifeq            122
			mCallback.onViewPositionChanged(mCapturedView, j1, i1, j1 - k1, i1 - l1);
	//   48   97:aload_0         
	//   49   98:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   50  101:aload_0         
	//   51  102:getfield        #260 <Field View mCapturedView>
	//   52  105:iload           6
	//   53  107:iload           5
	//   54  109:iload           6
	//   55  111:iload           7
	//   56  113:isub            
	//   57  114:iload           5
	//   58  116:iload           8
	//   59  118:isub            
	//   60  119:invokevirtual   #305 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
	//   61  122:return          
	}

	private void ensureMotionHistorySizeForId(int i)
	{
		if(mInitialMotionX == null || mInitialMotionX.length <= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field float[] mInitialMotionX>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #194 <Field float[] mInitialMotionX>
	//*   5   11:arraylength     
	//*   6   12:iload_1         
	//*   7   13:icmpgt          220
		{
			float af[] = new float[i + 1];
	//    8   16:iload_1         
	//    9   17:iconst_1        
	//   10   18:iadd            
	//   11   19:newarray        float[]
	//   12   21:astore_2        
			float af1[] = new float[i + 1];
	//   13   22:iload_1         
	//   14   23:iconst_1        
	//   15   24:iadd            
	//   16   25:newarray        float[]
	//   17   27:astore_3        
			float af2[] = new float[i + 1];
	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:newarray        float[]
	//   22   33:astore          4
			float af3[] = new float[i + 1];
	//   23   35:iload_1         
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:newarray        float[]
	//   27   40:astore          5
			int ai[] = new int[i + 1];
	//   28   42:iload_1         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:newarray        int[]
	//   32   47:astore          6
			int ai1[] = new int[i + 1];
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:newarray        int[]
	//   37   54:astore          7
			int ai2[] = new int[i + 1];
	//   38   56:iload_1         
	//   39   57:iconst_1        
	//   40   58:iadd            
	//   41   59:newarray        int[]
	//   42   61:astore          8
			if(mInitialMotionX != null)
	//*  43   63:aload_0         
	//*  44   64:getfield        #194 <Field float[] mInitialMotionX>
	//*  45   67:ifnull          180
			{
				System.arraycopy(((Object) (mInitialMotionX)), 0, ((Object) (af)), 0, mInitialMotionX.length);
	//   46   70:aload_0         
	//   47   71:getfield        #194 <Field float[] mInitialMotionX>
	//   48   74:iconst_0        
	//   49   75:aload_2         
	//   50   76:iconst_0        
	//   51   77:aload_0         
	//   52   78:getfield        #194 <Field float[] mInitialMotionX>
	//   53   81:arraylength     
	//   54   82:invokestatic    #312 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mInitialMotionY)), 0, ((Object) (af1)), 0, mInitialMotionY.length);
	//   55   85:aload_0         
	//   56   86:getfield        #202 <Field float[] mInitialMotionY>
	//   57   89:iconst_0        
	//   58   90:aload_3         
	//   59   91:iconst_0        
	//   60   92:aload_0         
	//   61   93:getfield        #202 <Field float[] mInitialMotionY>
	//   62   96:arraylength     
	//   63   97:invokestatic    #312 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mLastMotionX)), 0, ((Object) (af2)), 0, mLastMotionX.length);
	//   64  100:aload_0         
	//   65  101:getfield        #204 <Field float[] mLastMotionX>
	//   66  104:iconst_0        
	//   67  105:aload           4
	//   68  107:iconst_0        
	//   69  108:aload_0         
	//   70  109:getfield        #204 <Field float[] mLastMotionX>
	//   71  112:arraylength     
	//   72  113:invokestatic    #312 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mLastMotionY)), 0, ((Object) (af3)), 0, mLastMotionY.length);
	//   73  116:aload_0         
	//   74  117:getfield        #206 <Field float[] mLastMotionY>
	//   75  120:iconst_0        
	//   76  121:aload           5
	//   77  123:iconst_0        
	//   78  124:aload_0         
	//   79  125:getfield        #206 <Field float[] mLastMotionY>
	//   80  128:arraylength     
	//   81  129:invokestatic    #312 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mInitialEdgesTouched)), 0, ((Object) (ai)), 0, mInitialEdgesTouched.length);
	//   82  132:aload_0         
	//   83  133:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   84  136:iconst_0        
	//   85  137:aload           6
	//   86  139:iconst_0        
	//   87  140:aload_0         
	//   88  141:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   89  144:arraylength     
	//   90  145:invokestatic    #312 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mEdgeDragsInProgress)), 0, ((Object) (ai1)), 0, mEdgeDragsInProgress.length);
	//   91  148:aload_0         
	//   92  149:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   93  152:iconst_0        
	//   94  153:aload           7
	//   95  155:iconst_0        
	//   96  156:aload_0         
	//   97  157:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   98  160:arraylength     
	//   99  161:invokestatic    #312 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mEdgeDragsLocked)), 0, ((Object) (ai2)), 0, mEdgeDragsLocked.length);
	//  100  164:aload_0         
	//  101  165:getfield        #170 <Field int[] mEdgeDragsLocked>
	//  102  168:iconst_0        
	//  103  169:aload           8
	//  104  171:iconst_0        
	//  105  172:aload_0         
	//  106  173:getfield        #170 <Field int[] mEdgeDragsLocked>
	//  107  176:arraylength     
	//  108  177:invokestatic    #312 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			mInitialMotionX = af;
	//  109  180:aload_0         
	//  110  181:aload_2         
	//  111  182:putfield        #194 <Field float[] mInitialMotionX>
			mInitialMotionY = af1;
	//  112  185:aload_0         
	//  113  186:aload_3         
	//  114  187:putfield        #202 <Field float[] mInitialMotionY>
			mLastMotionX = af2;
	//  115  190:aload_0         
	//  116  191:aload           4
	//  117  193:putfield        #204 <Field float[] mLastMotionX>
			mLastMotionY = af3;
	//  118  196:aload_0         
	//  119  197:aload           5
	//  120  199:putfield        #206 <Field float[] mLastMotionY>
			mInitialEdgesTouched = ai;
	//  121  202:aload_0         
	//  122  203:aload           6
	//  123  205:putfield        #166 <Field int[] mInitialEdgesTouched>
			mEdgeDragsInProgress = ai1;
	//  124  208:aload_0         
	//  125  209:aload           7
	//  126  211:putfield        #172 <Field int[] mEdgeDragsInProgress>
			mEdgeDragsLocked = ai2;
	//  127  214:aload_0         
	//  128  215:aload           8
	//  129  217:putfield        #170 <Field int[] mEdgeDragsLocked>
		}
	//  130  220:return          
	}

	private boolean forceSettleCapturedViewAt(int i, int j, int k, int l)
	{
		int i1 = mCapturedView.getLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field View mCapturedView>
	//    2    4:invokevirtual   #282 <Method int View.getLeft()>
	//    3    7:istore          5
		int j1 = mCapturedView.getTop();
	//    4    9:aload_0         
	//    5   10:getfield        #260 <Field View mCapturedView>
	//    6   13:invokevirtual   #285 <Method int View.getTop()>
	//    7   16:istore          6
		i -= i1;
	//    8   18:iload_1         
	//    9   19:iload           5
	//   10   21:isub            
	//   11   22:istore_1        
		j -= j1;
	//   12   23:iload_2         
	//   13   24:iload           6
	//   14   26:isub            
	//   15   27:istore_2        
		if(i == 0 && j == 0)
	//*  16   28:iload_1         
	//*  17   29:ifne            50
	//*  18   32:iload_2         
	//*  19   33:ifne            50
		{
			mScroller.abortAnimation();
	//   20   36:aload_0         
	//   21   37:getfield        #156 <Field OverScroller mScroller>
	//   22   40:invokevirtual   #317 <Method void OverScroller.abortAnimation()>
			setDragState(0);
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:invokevirtual   #269 <Method void setDragState(int)>
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		} else
		{
			k = computeSettleDuration(mCapturedView, i, j, k, l);
	//   28   50:aload_0         
	//   29   51:aload_0         
	//   30   52:getfield        #260 <Field View mCapturedView>
	//   31   55:iload_1         
	//   32   56:iload_2         
	//   33   57:iload_3         
	//   34   58:iload           4
	//   35   60:invokespecial   #319 <Method int computeSettleDuration(View, int, int, int, int)>
	//   36   63:istore_3        
			mScroller.startScroll(i1, j1, i, j, k);
	//   37   64:aload_0         
	//   38   65:getfield        #156 <Field OverScroller mScroller>
	//   39   68:iload           5
	//   40   70:iload           6
	//   41   72:iload_1         
	//   42   73:iload_2         
	//   43   74:iload_3         
	//   44   75:invokevirtual   #323 <Method void OverScroller.startScroll(int, int, int, int, int)>
			setDragState(2);
	//   45   78:aload_0         
	//   46   79:iconst_2        
	//   47   80:invokevirtual   #269 <Method void setDragState(int)>
			return true;
	//   48   83:iconst_1        
	//   49   84:ireturn         
		}
	}

	private int getEdgesTouched(int i, int j)
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(i < mParentView.getLeft() + mEdgeSize)
	//*   2    3:iload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #104 <Field ViewGroup mParentView>
	//*   5    8:invokevirtual   #325 <Method int ViewGroup.getLeft()>
	//*   6   11:aload_0         
	//*   7   12:getfield        #133 <Field int mEdgeSize>
	//*   8   15:iadd            
	//*   9   16:icmpge          22
			l = 1;
	//   10   19:iconst_1        
	//   11   20:istore          4
		int k = l;
	//   12   22:iload           4
	//   13   24:istore_3        
		if(j < mParentView.getTop() + mEdgeSize)
	//*  14   25:iload_2         
	//*  15   26:aload_0         
	//*  16   27:getfield        #104 <Field ViewGroup mParentView>
	//*  17   30:invokevirtual   #326 <Method int ViewGroup.getTop()>
	//*  18   33:aload_0         
	//*  19   34:getfield        #133 <Field int mEdgeSize>
	//*  20   37:iadd            
	//*  21   38:icmpge          46
			k = l | 4;
	//   22   41:iload           4
	//   23   43:iconst_4        
	//   24   44:ior             
	//   25   45:istore_3        
		l = k;
	//   26   46:iload_3         
	//   27   47:istore          4
		if(i > mParentView.getRight() - mEdgeSize)
	//*  28   49:iload_1         
	//*  29   50:aload_0         
	//*  30   51:getfield        #104 <Field ViewGroup mParentView>
	//*  31   54:invokevirtual   #329 <Method int ViewGroup.getRight()>
	//*  32   57:aload_0         
	//*  33   58:getfield        #133 <Field int mEdgeSize>
	//*  34   61:isub            
	//*  35   62:icmple          70
			l = k | 2;
	//   36   65:iload_3         
	//   37   66:iconst_2        
	//   38   67:ior             
	//   39   68:istore          4
		i = l;
	//   40   70:iload           4
	//   41   72:istore_1        
		if(j > mParentView.getBottom() - mEdgeSize)
	//*  42   73:iload_2         
	//*  43   74:aload_0         
	//*  44   75:getfield        #104 <Field ViewGroup mParentView>
	//*  45   78:invokevirtual   #332 <Method int ViewGroup.getBottom()>
	//*  46   81:aload_0         
	//*  47   82:getfield        #133 <Field int mEdgeSize>
	//*  48   85:isub            
	//*  49   86:icmple          95
			i = l | 8;
	//   50   89:iload           4
	//   51   91:bipush          8
	//   52   93:ior             
	//   53   94:istore_1        
		return i;
	//   54   95:iload_1         
	//   55   96:ireturn         
	}

	private boolean isValidPointerForActionMove(int i)
	{
		if(!isPointerDown(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #215 <Method boolean isPointerDown(int)>
	//*   3    5:ifne            54
		{
			Log.e("ViewDragHelper", (new StringBuilder()).append("Ignoring pointerId=").append(i).append(" because ACTION_DOWN was not received ").append("for this pointer before ACTION_MOVE. It likely happened because ").append(" ViewDragHelper did not receive all the events in the event stream.").toString());
	//    4    8:ldc1            #42  <String "ViewDragHelper">
	//    5   10:new             #335 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #336 <Method void StringBuilder()>
	//    8   17:ldc2            #338 <String "Ignoring pointerId=">
	//    9   20:invokevirtual   #342 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:iload_1         
	//   11   24:invokevirtual   #345 <Method StringBuilder StringBuilder.append(int)>
	//   12   27:ldc2            #347 <String " because ACTION_DOWN was not received ">
	//   13   30:invokevirtual   #342 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:ldc2            #349 <String "for this pointer before ACTION_MOVE. It likely happened because ">
	//   15   36:invokevirtual   #342 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:ldc2            #351 <String " ViewDragHelper did not receive all the events in the event stream.">
	//   17   42:invokevirtual   #342 <Method StringBuilder StringBuilder.append(String)>
	//   18   45:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   19   48:invokestatic    #361 <Method int Log.e(String, String)>
	//   20   51:pop             
			return false;
	//   21   52:iconst_0        
	//   22   53:ireturn         
		} else
		{
			return true;
	//   23   54:iconst_1        
	//   24   55:ireturn         
		}
	}

	private void releaseViewForPointerUp()
	{
		mVelocityTracker.computeCurrentVelocity(1000, mMaxVelocity);
	//    0    0:aload_0         
	//    1    1:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//    2    4:sipush          1000
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field float mMaxVelocity>
	//    5   11:invokevirtual   #370 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		dispatchViewReleased(clampMag(mVelocityTracker.getXVelocity(mActivePointerId), mMinVelocity, mMaxVelocity), clampMag(mVelocityTracker.getYVelocity(mActivePointerId), mMinVelocity, mMaxVelocity));
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   10   20:aload_0         
	//   11   21:getfield        #88  <Field int mActivePointerId>
	//   12   24:invokevirtual   #374 <Method float VelocityTracker.getXVelocity(int)>
	//   13   27:aload_0         
	//   14   28:getfield        #149 <Field float mMinVelocity>
	//   15   31:aload_0         
	//   16   32:getfield        #144 <Field float mMaxVelocity>
	//   17   35:invokespecial   #376 <Method float clampMag(float, float, float)>
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   21   43:aload_0         
	//   22   44:getfield        #88  <Field int mActivePointerId>
	//   23   47:invokevirtual   #379 <Method float VelocityTracker.getYVelocity(int)>
	//   24   50:aload_0         
	//   25   51:getfield        #149 <Field float mMinVelocity>
	//   26   54:aload_0         
	//   27   55:getfield        #144 <Field float mMaxVelocity>
	//   28   58:invokespecial   #376 <Method float clampMag(float, float, float)>
	//   29   61:invokespecial   #381 <Method void dispatchViewReleased(float, float)>
	//   30   64:return          
	}

	private void reportNewEdgeDrags(float f, float f1, int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(checkNewEdgeDrag(f, f1, i, 1))
	//*   2    3:aload_0         
	//*   3    4:fload_1         
	//*   4    5:fload_2         
	//*   5    6:iload_3         
	//*   6    7:iconst_1        
	//*   7    8:invokespecial   #385 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*   8   11:ifeq            17
			k = 1;
	//    9   14:iconst_1        
	//   10   15:istore          5
		int j = k;
	//   11   17:iload           5
	//   12   19:istore          4
		if(checkNewEdgeDrag(f1, f, i, 4))
	//*  13   21:aload_0         
	//*  14   22:fload_2         
	//*  15   23:fload_1         
	//*  16   24:iload_3         
	//*  17   25:iconst_4        
	//*  18   26:invokespecial   #385 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  19   29:ifeq            38
			j = k | 4;
	//   20   32:iload           5
	//   21   34:iconst_4        
	//   22   35:ior             
	//   23   36:istore          4
		k = j;
	//   24   38:iload           4
	//   25   40:istore          5
		if(checkNewEdgeDrag(f, f1, i, 2))
	//*  26   42:aload_0         
	//*  27   43:fload_1         
	//*  28   44:fload_2         
	//*  29   45:iload_3         
	//*  30   46:iconst_2        
	//*  31   47:invokespecial   #385 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  32   50:ifeq            59
			k = j | 2;
	//   33   53:iload           4
	//   34   55:iconst_2        
	//   35   56:ior             
	//   36   57:istore          5
		j = k;
	//   37   59:iload           5
	//   38   61:istore          4
		if(checkNewEdgeDrag(f1, f, i, 8))
	//*  39   63:aload_0         
	//*  40   64:fload_2         
	//*  41   65:fload_1         
	//*  42   66:iload_3         
	//*  43   67:bipush          8
	//*  44   69:invokespecial   #385 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  45   72:ifeq            82
			j = k | 8;
	//   46   75:iload           5
	//   47   77:bipush          8
	//   48   79:ior             
	//   49   80:istore          4
		if(j != 0)
	//*  50   82:iload           4
	//*  51   84:ifeq            114
		{
			int ai[] = mEdgeDragsInProgress;
	//   52   87:aload_0         
	//   53   88:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   54   91:astore          6
			ai[i] = ai[i] | j;
	//   55   93:aload           6
	//   56   95:iload_3         
	//   57   96:aload           6
	//   58   98:iload_3         
	//   59   99:iaload          
	//   60  100:iload           4
	//   61  102:ior             
	//   62  103:iastore         
			mCallback.onEdgeDragStarted(j, i);
	//   63  104:aload_0         
	//   64  105:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   65  108:iload           4
	//   66  110:iload_3         
	//   67  111:invokevirtual   #389 <Method void ViewDragHelper$Callback.onEdgeDragStarted(int, int)>
		}
	//   68  114:return          
	}

	private void saveInitialMotion(float f, float f1, int i)
	{
		ensureMotionHistorySizeForId(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokespecial   #392 <Method void ensureMotionHistorySizeForId(int)>
		float af[] = mInitialMotionX;
	//    3    5:aload_0         
	//    4    6:getfield        #194 <Field float[] mInitialMotionX>
	//    5    9:astore          4
		mLastMotionX[i] = f;
	//    6   11:aload_0         
	//    7   12:getfield        #204 <Field float[] mLastMotionX>
	//    8   15:iload_3         
	//    9   16:fload_1         
	//   10   17:fastore         
		af[i] = f;
	//   11   18:aload           4
	//   12   20:iload_3         
	//   13   21:fload_1         
	//   14   22:fastore         
		af = mInitialMotionY;
	//   15   23:aload_0         
	//   16   24:getfield        #202 <Field float[] mInitialMotionY>
	//   17   27:astore          4
		mLastMotionY[i] = f1;
	//   18   29:aload_0         
	//   19   30:getfield        #206 <Field float[] mLastMotionY>
	//   20   33:iload_3         
	//   21   34:fload_2         
	//   22   35:fastore         
		af[i] = f1;
	//   23   36:aload           4
	//   24   38:iload_3         
	//   25   39:fload_2         
	//   26   40:fastore         
		mInitialEdgesTouched[i] = getEdgesTouched((int)f, (int)f1);
	//   27   41:aload_0         
	//   28   42:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   29   45:iload_3         
	//   30   46:aload_0         
	//   31   47:fload_1         
	//   32   48:f2i             
	//   33   49:fload_2         
	//   34   50:f2i             
	//   35   51:invokespecial   #394 <Method int getEdgesTouched(int, int)>
	//   36   54:iastore         
		mPointersDown = mPointersDown | 1 << i;
	//   37   55:aload_0         
	//   38   56:aload_0         
	//   39   57:getfield        #211 <Field int mPointersDown>
	//   40   60:iconst_1        
	//   41   61:iload_3         
	//   42   62:ishl            
	//   43   63:ior             
	//   44   64:putfield        #211 <Field int mPointersDown>
	//   45   67:return          
	}

	private void saveLastMotion(MotionEvent motionevent)
	{
		int j = motionevent.getPointerCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #401 <Method int MotionEvent.getPointerCount()>
	//    2    4:istore          5
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore          4
	//*   5    9:iload           4
	//*   6   11:iload           5
	//*   7   13:icmpge          75
		{
			int k = motionevent.getPointerId(i);
	//    8   16:aload_1         
	//    9   17:iload           4
	//   10   19:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//   11   22:istore          6
			if(isValidPointerForActionMove(k))
	//*  12   24:aload_0         
	//*  13   25:iload           6
	//*  14   27:invokespecial   #406 <Method boolean isValidPointerForActionMove(int)>
	//*  15   30:ifne            36
	//*  16   33:goto            66
			{
				float f = motionevent.getX(i);
	//   17   36:aload_1         
	//   18   37:iload           4
	//   19   39:invokevirtual   #409 <Method float MotionEvent.getX(int)>
	//   20   42:fstore_2        
				float f1 = motionevent.getY(i);
	//   21   43:aload_1         
	//   22   44:iload           4
	//   23   46:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//   24   49:fstore_3        
				mLastMotionX[k] = f;
	//   25   50:aload_0         
	//   26   51:getfield        #204 <Field float[] mLastMotionX>
	//   27   54:iload           6
	//   28   56:fload_2         
	//   29   57:fastore         
				mLastMotionY[k] = f1;
	//   30   58:aload_0         
	//   31   59:getfield        #206 <Field float[] mLastMotionY>
	//   32   62:iload           6
	//   33   64:fload_3         
	//   34   65:fastore         
			}
		}

	//   35   66:iload           4
	//   36   68:iconst_1        
	//   37   69:iadd            
	//   38   70:istore          4
	//*  39   72:goto            9
	//   40   75:return          
	}

	public void abort()
	{
		cancel();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #416 <Method void cancel()>
		if(mDragState == 2)
	//*   2    4:aload_0         
	//*   3    5:getfield        #266 <Field int mDragState>
	//*   4    8:iconst_2        
	//*   5    9:icmpne          73
		{
			int i = mScroller.getCurrX();
	//    6   12:aload_0         
	//    7   13:getfield        #156 <Field OverScroller mScroller>
	//    8   16:invokevirtual   #419 <Method int OverScroller.getCurrX()>
	//    9   19:istore_1        
			int j = mScroller.getCurrY();
	//   10   20:aload_0         
	//   11   21:getfield        #156 <Field OverScroller mScroller>
	//   12   24:invokevirtual   #422 <Method int OverScroller.getCurrY()>
	//   13   27:istore_2        
			mScroller.abortAnimation();
	//   14   28:aload_0         
	//   15   29:getfield        #156 <Field OverScroller mScroller>
	//   16   32:invokevirtual   #317 <Method void OverScroller.abortAnimation()>
			int k = mScroller.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #156 <Field OverScroller mScroller>
	//   19   39:invokevirtual   #419 <Method int OverScroller.getCurrX()>
	//   20   42:istore_3        
			int l = mScroller.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #156 <Field OverScroller mScroller>
	//   23   47:invokevirtual   #422 <Method int OverScroller.getCurrY()>
	//   24   50:istore          4
			mCallback.onViewPositionChanged(mCapturedView, k, l, k - i, l - j);
	//   25   52:aload_0         
	//   26   53:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   27   56:aload_0         
	//   28   57:getfield        #260 <Field View mCapturedView>
	//   29   60:iload_3         
	//   30   61:iload           4
	//   31   63:iload_3         
	//   32   64:iload_1         
	//   33   65:isub            
	//   34   66:iload           4
	//   35   68:iload_2         
	//   36   69:isub            
	//   37   70:invokevirtual   #305 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
		}
		setDragState(0);
	//   38   73:aload_0         
	//   39   74:iconst_0        
	//   40   75:invokevirtual   #269 <Method void setDragState(int)>
	//   41   78:return          
	}

	protected boolean canScroll(View view, boolean flag, int i, int j, int k, int l)
	{
		if(view instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #218 <Class ViewGroup>
	//*   2    4:ifeq            146
		{
			ViewGroup viewgroup = (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #218 <Class ViewGroup>
	//    5   11:astore          10
			int j1 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #427 <Method int View.getScrollX()>
	//    8   17:istore          8
			int k1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #430 <Method int View.getScrollY()>
	//   11   23:istore          9
			for(int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
	//*  12   25:aload           10
	//*  13   27:invokevirtual   #433 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          7
	//*  17   34:iload           7
	//*  18   36:iflt            146
			{
				View view1 = viewgroup.getChildAt(i1);
	//   19   39:aload           10
	//   20   41:iload           7
	//   21   43:invokevirtual   #437 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          11
				if(k + j1 >= view1.getLeft() && k + j1 < view1.getRight() && l + k1 >= view1.getTop() && l + k1 < view1.getBottom() && canScroll(view1, true, i, j, (k + j1) - view1.getLeft(), (l + k1) - view1.getTop()))
	//*  23   48:iload           5
	//*  24   50:iload           8
	//*  25   52:iadd            
	//*  26   53:aload           11
	//*  27   55:invokevirtual   #282 <Method int View.getLeft()>
	//*  28   58:icmplt          137
	//*  29   61:iload           5
	//*  30   63:iload           8
	//*  31   65:iadd            
	//*  32   66:aload           11
	//*  33   68:invokevirtual   #438 <Method int View.getRight()>
	//*  34   71:icmpge          137
	//*  35   74:iload           6
	//*  36   76:iload           9
	//*  37   78:iadd            
	//*  38   79:aload           11
	//*  39   81:invokevirtual   #285 <Method int View.getTop()>
	//*  40   84:icmplt          137
	//*  41   87:iload           6
	//*  42   89:iload           9
	//*  43   91:iadd            
	//*  44   92:aload           11
	//*  45   94:invokevirtual   #439 <Method int View.getBottom()>
	//*  46   97:icmpge          137
	//*  47  100:aload_0         
	//*  48  101:aload           11
	//*  49  103:iconst_1        
	//*  50  104:iload_3         
	//*  51  105:iload           4
	//*  52  107:iload           5
	//*  53  109:iload           8
	//*  54  111:iadd            
	//*  55  112:aload           11
	//*  56  114:invokevirtual   #282 <Method int View.getLeft()>
	//*  57  117:isub            
	//*  58  118:iload           6
	//*  59  120:iload           9
	//*  60  122:iadd            
	//*  61  123:aload           11
	//*  62  125:invokevirtual   #285 <Method int View.getTop()>
	//*  63  128:isub            
	//*  64  129:invokevirtual   #441 <Method boolean canScroll(View, boolean, int, int, int, int)>
	//*  65  132:ifeq            137
					return true;
	//   66  135:iconst_1        
	//   67  136:ireturn         
			}

	//   68  137:iload           7
	//   69  139:iconst_1        
	//   70  140:isub            
	//   71  141:istore          7
		}
	//*  72  143:goto            34
		return flag && (view.canScrollHorizontally(-i) || view.canScrollVertically(-j));
	//   73  146:iload_2         
	//   74  147:ifeq            171
	//   75  150:aload_1         
	//   76  151:iload_3         
	//   77  152:ineg            
	//   78  153:invokevirtual   #444 <Method boolean View.canScrollHorizontally(int)>
	//   79  156:ifne            169
	//   80  159:aload_1         
	//   81  160:iload           4
	//   82  162:ineg            
	//   83  163:invokevirtual   #447 <Method boolean View.canScrollVertically(int)>
	//   84  166:ifeq            171
	//   85  169:iconst_1        
	//   86  170:ireturn         
	//   87  171:iconst_0        
	//   88  172:ireturn         
	}

	public void cancel()
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #88  <Field int mActivePointerId>
		clearMotionHistory();
	//    3    5:aload_0         
	//    4    6:invokespecial   #449 <Method void clearMotionHistory()>
		if(mVelocityTracker != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//*   7   13:ifnull          28
		{
			mVelocityTracker.recycle();
	//    8   16:aload_0         
	//    9   17:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   10   20:invokevirtual   #452 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #364 <Field VelocityTracker mVelocityTracker>
		}
	//   14   28:return          
	}

	public void captureChildView(View view, int i)
	{
		if(view.getParent() != mParentView)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #457 <Method android.view.ViewParent View.getParent()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #104 <Field ViewGroup mParentView>
	//*   4    8:if_acmpeq       48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (").append(((Object) (mParentView))).append(")").toString());
	//    5   11:new             #95  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:new             #335 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #336 <Method void StringBuilder()>
	//   10   22:ldc2            #459 <String "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (">
	//   11   25:invokevirtual   #342 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #104 <Field ViewGroup mParentView>
	//   14   32:invokevirtual   #462 <Method StringBuilder StringBuilder.append(Object)>
	//   15   35:ldc2            #464 <String ")">
	//   16   38:invokevirtual   #342 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//   19   47:athrow          
		} else
		{
			mCapturedView = view;
	//   20   48:aload_0         
	//   21   49:aload_1         
	//   22   50:putfield        #260 <Field View mCapturedView>
			mActivePointerId = i;
	//   23   53:aload_0         
	//   24   54:iload_2         
	//   25   55:putfield        #88  <Field int mActivePointerId>
			mCallback.onViewCaptured(view, i);
	//   26   58:aload_0         
	//   27   59:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   28   62:aload_1         
	//   29   63:iload_2         
	//   30   64:invokevirtual   #467 <Method void ViewDragHelper$Callback.onViewCaptured(View, int)>
			setDragState(1);
	//   31   67:aload_0         
	//   32   68:iconst_1        
	//   33   69:invokevirtual   #269 <Method void setDragState(int)>
			return;
	//   34   72:return          
		}
	}

	public boolean checkTouchSlop(int i)
	{
		int k = mInitialMotionX.length;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field float[] mInitialMotionX>
	//    2    4:arraylength     
	//    3    5:istore_3        
		for(int j = 0; j < k; j++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          31
			if(checkTouchSlop(i, j))
	//*   9   13:aload_0         
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:invokevirtual   #470 <Method boolean checkTouchSlop(int, int)>
	//*  13   19:ifeq            24
				return true;
	//   14   22:iconst_1        
	//   15   23:ireturn         

	//   16   24:iload_2         
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:istore_2        
	//*  20   28:goto            8
		return false;
	//   21   31:iconst_0        
	//   22   32:ireturn         
	}

	public boolean checkTouchSlop(int i, int j)
	{
		if(!isPointerDown(j))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #215 <Method boolean isPointerDown(int)>
	//*   3    5:ifne            10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		boolean flag;
		if((i & 1) == 1)
	//*   6   10:iload_1         
	//*   7   11:iconst_1        
	//*   8   12:iand            
	//*   9   13:iconst_1        
	//*  10   14:icmpne          23
			flag = true;
	//   11   17:iconst_1        
	//   12   18:istore          5
		else
	//*  13   20:goto            26
			flag = false;
	//   14   23:iconst_0        
	//   15   24:istore          5
		if((i & 2) == 2)
	//*  16   26:iload_1         
	//*  17   27:iconst_2        
	//*  18   28:iand            
	//*  19   29:iconst_2        
	//*  20   30:icmpne          38
			i = 1;
	//   21   33:iconst_1        
	//   22   34:istore_1        
		else
	//*  23   35:goto            40
			i = 0;
	//   24   38:iconst_0        
	//   25   39:istore_1        
		float f = mLastMotionX[j] - mInitialMotionX[j];
	//   26   40:aload_0         
	//   27   41:getfield        #204 <Field float[] mLastMotionX>
	//   28   44:iload_2         
	//   29   45:faload          
	//   30   46:aload_0         
	//   31   47:getfield        #194 <Field float[] mInitialMotionX>
	//   32   50:iload_2         
	//   33   51:faload          
	//   34   52:fsub            
	//   35   53:fstore_3        
		float f1 = mLastMotionY[j] - mInitialMotionY[j];
	//   36   54:aload_0         
	//   37   55:getfield        #206 <Field float[] mLastMotionY>
	//   38   58:iload_2         
	//   39   59:faload          
	//   40   60:aload_0         
	//   41   61:getfield        #202 <Field float[] mInitialMotionY>
	//   42   64:iload_2         
	//   43   65:faload          
	//   44   66:fsub            
	//   45   67:fstore          4
		if(flag && i != 0)
	//*  46   69:iload           5
	//*  47   71:ifeq            105
	//*  48   74:iload_1         
	//*  49   75:ifeq            105
			return f * f + f1 * f1 > (float)(mTouchSlop * mTouchSlop);
	//   50   78:fload_3         
	//   51   79:fload_3         
	//   52   80:fmul            
	//   53   81:fload           4
	//   54   83:fload           4
	//   55   85:fmul            
	//   56   86:fadd            
	//   57   87:aload_0         
	//   58   88:getfield        #139 <Field int mTouchSlop>
	//   59   91:aload_0         
	//   60   92:getfield        #139 <Field int mTouchSlop>
	//   61   95:imul            
	//   62   96:i2f             
	//   63   97:fcmpl           
	//   64   98:ifle            103
	//   65  101:iconst_1        
	//   66  102:ireturn         
	//   67  103:iconst_0        
	//   68  104:ireturn         
		if(flag)
	//*  69  105:iload           5
	//*  70  107:ifeq            127
			return Math.abs(f) > (float)mTouchSlop;
	//   71  110:fload_3         
	//   72  111:invokestatic    #164 <Method float Math.abs(float)>
	//   73  114:aload_0         
	//   74  115:getfield        #139 <Field int mTouchSlop>
	//   75  118:i2f             
	//   76  119:fcmpl           
	//   77  120:ifle            125
	//   78  123:iconst_1        
	//   79  124:ireturn         
	//   80  125:iconst_0        
	//   81  126:ireturn         
		if(i != 0)
	//*  82  127:iload_1         
	//*  83  128:ifeq            149
			return Math.abs(f1) > (float)mTouchSlop;
	//   84  131:fload           4
	//   85  133:invokestatic    #164 <Method float Math.abs(float)>
	//   86  136:aload_0         
	//   87  137:getfield        #139 <Field int mTouchSlop>
	//   88  140:i2f             
	//   89  141:fcmpl           
	//   90  142:ifle            147
	//   91  145:iconst_1        
	//   92  146:ireturn         
	//   93  147:iconst_0        
	//   94  148:ireturn         
		else
			return false;
	//   95  149:iconst_0        
	//   96  150:ireturn         
	}

	public boolean continueSettling(boolean flag)
	{
		if(mDragState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field int mDragState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          188
		{
			boolean flag2 = mScroller.computeScrollOffset();
	//    4    8:aload_0         
	//    5    9:getfield        #156 <Field OverScroller mScroller>
	//    6   12:invokevirtual   #476 <Method boolean OverScroller.computeScrollOffset()>
	//    7   15:istore          7
			int i = mScroller.getCurrX();
	//    8   17:aload_0         
	//    9   18:getfield        #156 <Field OverScroller mScroller>
	//   10   21:invokevirtual   #419 <Method int OverScroller.getCurrX()>
	//   11   24:istore_2        
			int j = mScroller.getCurrY();
	//   12   25:aload_0         
	//   13   26:getfield        #156 <Field OverScroller mScroller>
	//   14   29:invokevirtual   #422 <Method int OverScroller.getCurrY()>
	//   15   32:istore_3        
			int k = i - mCapturedView.getLeft();
	//   16   33:iload_2         
	//   17   34:aload_0         
	//   18   35:getfield        #260 <Field View mCapturedView>
	//   19   38:invokevirtual   #282 <Method int View.getLeft()>
	//   20   41:isub            
	//   21   42:istore          4
			int l = j - mCapturedView.getTop();
	//   22   44:iload_3         
	//   23   45:aload_0         
	//   24   46:getfield        #260 <Field View mCapturedView>
	//   25   49:invokevirtual   #285 <Method int View.getTop()>
	//   26   52:isub            
	//   27   53:istore          5
			if(k != 0)
	//*  28   55:iload           4
	//*  29   57:ifeq            69
				ViewCompat.offsetLeftAndRight(mCapturedView, k);
	//   30   60:aload_0         
	//   31   61:getfield        #260 <Field View mCapturedView>
	//   32   64:iload           4
	//   33   66:invokestatic    #295 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			if(l != 0)
	//*  34   69:iload           5
	//*  35   71:ifeq            83
				ViewCompat.offsetTopAndBottom(mCapturedView, l);
	//   36   74:aload_0         
	//   37   75:getfield        #260 <Field View mCapturedView>
	//   38   78:iload           5
	//   39   80:invokestatic    #301 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			if(k != 0 || l != 0)
	//*  40   83:iload           4
	//*  41   85:ifne            93
	//*  42   88:iload           5
	//*  43   90:ifeq            110
				mCallback.onViewPositionChanged(mCapturedView, i, j, k, l);
	//   44   93:aload_0         
	//   45   94:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   46   97:aload_0         
	//   47   98:getfield        #260 <Field View mCapturedView>
	//   48  101:iload_2         
	//   49  102:iload_3         
	//   50  103:iload           4
	//   51  105:iload           5
	//   52  107:invokevirtual   #305 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
			boolean flag1 = flag2;
	//   53  110:iload           7
	//   54  112:istore          6
			if(flag2)
	//*  55  114:iload           7
	//*  56  116:ifeq            159
			{
				flag1 = flag2;
	//   57  119:iload           7
	//   58  121:istore          6
				if(i == mScroller.getFinalX())
	//*  59  123:iload_2         
	//*  60  124:aload_0         
	//*  61  125:getfield        #156 <Field OverScroller mScroller>
	//*  62  128:invokevirtual   #479 <Method int OverScroller.getFinalX()>
	//*  63  131:icmpne          159
				{
					flag1 = flag2;
	//   64  134:iload           7
	//   65  136:istore          6
					if(j == mScroller.getFinalY())
	//*  66  138:iload_3         
	//*  67  139:aload_0         
	//*  68  140:getfield        #156 <Field OverScroller mScroller>
	//*  69  143:invokevirtual   #482 <Method int OverScroller.getFinalY()>
	//*  70  146:icmpne          159
					{
						mScroller.abortAnimation();
	//   71  149:aload_0         
	//   72  150:getfield        #156 <Field OverScroller mScroller>
	//   73  153:invokevirtual   #317 <Method void OverScroller.abortAnimation()>
						flag1 = false;
	//   74  156:iconst_0        
	//   75  157:istore          6
					}
				}
			}
			if(!flag1)
	//*  76  159:iload           6
	//*  77  161:ifne            188
				if(flag)
	//*  78  164:iload_1         
	//*  79  165:ifeq            183
					mParentView.post(mSetIdleRunnable);
	//   80  168:aload_0         
	//   81  169:getfield        #104 <Field ViewGroup mParentView>
	//   82  172:aload_0         
	//   83  173:getfield        #93  <Field Runnable mSetIdleRunnable>
	//   84  176:invokevirtual   #486 <Method boolean ViewGroup.post(Runnable)>
	//   85  179:pop             
				else
	//*  86  180:goto            188
					setDragState(0);
	//   87  183:aload_0         
	//   88  184:iconst_0        
	//   89  185:invokevirtual   #269 <Method void setDragState(int)>
		}
		return mDragState == 2;
	//   90  188:aload_0         
	//   91  189:getfield        #266 <Field int mDragState>
	//   92  192:iconst_2        
	//   93  193:icmpne          198
	//   94  196:iconst_1        
	//   95  197:ireturn         
	//   96  198:iconst_0        
	//   97  199:ireturn         
	}

	public View findTopChildUnder(int i, int j)
	{
		for(int k = mParentView.getChildCount() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field ViewGroup mParentView>
	//*   2    4:invokevirtual   #433 <Method int ViewGroup.getChildCount()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            77
		{
			View view = mParentView.getChildAt(mCallback.getOrderedChildIndex(k));
	//    8   14:aload_0         
	//    9   15:getfield        #104 <Field ViewGroup mParentView>
	//   10   18:aload_0         
	//   11   19:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   12   22:iload_3         
	//   13   23:invokevirtual   #491 <Method int ViewDragHelper$Callback.getOrderedChildIndex(int)>
	//   14   26:invokevirtual   #437 <Method View ViewGroup.getChildAt(int)>
	//   15   29:astore          4
			if(i >= view.getLeft() && i < view.getRight() && j >= view.getTop() && j < view.getBottom())
	//*  16   31:iload_1         
	//*  17   32:aload           4
	//*  18   34:invokevirtual   #282 <Method int View.getLeft()>
	//*  19   37:icmplt          70
	//*  20   40:iload_1         
	//*  21   41:aload           4
	//*  22   43:invokevirtual   #438 <Method int View.getRight()>
	//*  23   46:icmpge          70
	//*  24   49:iload_2         
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #285 <Method int View.getTop()>
	//*  27   55:icmplt          70
	//*  28   58:iload_2         
	//*  29   59:aload           4
	//*  30   61:invokevirtual   #439 <Method int View.getBottom()>
	//*  31   64:icmpge          70
				return view;
	//   32   67:aload           4
	//   33   69:areturn         
		}

	//   34   70:iload_3         
	//   35   71:iconst_1        
	//   36   72:isub            
	//   37   73:istore_3        
	//*  38   74:goto            10
		return null;
	//   39   77:aconst_null     
	//   40   78:areturn         
	}

	public void flingCapturedView(int i, int j, int k, int l)
	{
		if(!mReleaseInProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field boolean mReleaseInProgress>
	//*   2    4:ifne            18
		{
			throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
	//    3    7:new             #494 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #496 <String "Cannot flingCapturedView outside of a call to Callback#onViewReleased">
	//    6   14:invokespecial   #497 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mScroller.fling(mCapturedView.getLeft(), mCapturedView.getTop(), (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId), i, k, j, l);
	//    8   18:aload_0         
	//    9   19:getfield        #156 <Field OverScroller mScroller>
	//   10   22:aload_0         
	//   11   23:getfield        #260 <Field View mCapturedView>
	//   12   26:invokevirtual   #282 <Method int View.getLeft()>
	//   13   29:aload_0         
	//   14   30:getfield        #260 <Field View mCapturedView>
	//   15   33:invokevirtual   #285 <Method int View.getTop()>
	//   16   36:aload_0         
	//   17   37:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   18   40:aload_0         
	//   19   41:getfield        #88  <Field int mActivePointerId>
	//   20   44:invokevirtual   #374 <Method float VelocityTracker.getXVelocity(int)>
	//   21   47:f2i             
	//   22   48:aload_0         
	//   23   49:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   24   52:aload_0         
	//   25   53:getfield        #88  <Field int mActivePointerId>
	//   26   56:invokevirtual   #379 <Method float VelocityTracker.getYVelocity(int)>
	//   27   59:f2i             
	//   28   60:iload_1         
	//   29   61:iload_3         
	//   30   62:iload_2         
	//   31   63:iload           4
	//   32   65:invokevirtual   #501 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
			setDragState(2);
	//   33   68:aload_0         
	//   34   69:iconst_2        
	//   35   70:invokevirtual   #269 <Method void setDragState(int)>
			return;
	//   36   73:return          
		}
	}

	public int getActivePointerId()
	{
		return mActivePointerId;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int mActivePointerId>
	//    2    4:ireturn         
	}

	public View getCapturedView()
	{
		return mCapturedView;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field View mCapturedView>
	//    2    4:areturn         
	}

	public int getEdgeSize()
	{
		return mEdgeSize;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int mEdgeSize>
	//    2    4:ireturn         
	}

	public float getMinVelocity()
	{
		return mMinVelocity;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field float mMinVelocity>
	//    2    4:freturn         
	}

	public int getTouchSlop()
	{
		return mTouchSlop;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field int mTouchSlop>
	//    2    4:ireturn         
	}

	public int getViewDragState()
	{
		return mDragState;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field int mDragState>
	//    2    4:ireturn         
	}

	public boolean isCapturedViewUnder(int i, int j)
	{
		return isViewUnder(mCapturedView, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #260 <Field View mCapturedView>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #514 <Method boolean isViewUnder(View, int, int)>
	//    6   10:ireturn         
	}

	public boolean isEdgeTouched(int i)
	{
		int k = mInitialEdgesTouched.length;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field int[] mInitialEdgesTouched>
	//    2    4:arraylength     
	//    3    5:istore_3        
		for(int j = 0; j < k; j++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          31
			if(isEdgeTouched(i, j))
	//*   9   13:aload_0         
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:invokevirtual   #517 <Method boolean isEdgeTouched(int, int)>
	//*  13   19:ifeq            24
				return true;
	//   14   22:iconst_1        
	//   15   23:ireturn         

	//   16   24:iload_2         
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:istore_2        
	//*  20   28:goto            8
		return false;
	//   21   31:iconst_0        
	//   22   32:ireturn         
	}

	public boolean isEdgeTouched(int i, int j)
	{
		return isPointerDown(j) && (mInitialEdgesTouched[j] & i) != 0;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #215 <Method boolean isPointerDown(int)>
	//    3    5:ifeq            21
	//    4    8:aload_0         
	//    5    9:getfield        #166 <Field int[] mInitialEdgesTouched>
	//    6   12:iload_2         
	//    7   13:iaload          
	//    8   14:iload_1         
	//    9   15:iand            
	//   10   16:ifeq            21
	//   11   19:iconst_1        
	//   12   20:ireturn         
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	public boolean isPointerDown(int i)
	{
		return (mPointersDown & 1 << i) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field int mPointersDown>
	//    2    4:iconst_1        
	//    3    5:iload_1         
	//    4    6:ishl            
	//    5    7:iand            
	//    6    8:ifeq            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public boolean isViewUnder(View view, int i, int j)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		return i >= view.getLeft() && i < view.getRight() && j >= view.getTop() && j < view.getBottom();
	//    4    6:iload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #282 <Method int View.getLeft()>
	//    7   11:icmplt          40
	//    8   14:iload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #438 <Method int View.getRight()>
	//   11   19:icmpge          40
	//   12   22:iload_3         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #285 <Method int View.getTop()>
	//   15   27:icmplt          40
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #439 <Method int View.getBottom()>
	//   19   35:icmpge          40
	//   20   38:iconst_1        
	//   21   39:ireturn         
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	public void processTouchEvent(MotionEvent motionevent)
	{
		int k = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #521 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          7
		int i = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #524 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          6
		if(k == 0)
	//*   6   12:iload           7
	//*   7   14:ifne            21
			cancel();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #416 <Method void cancel()>
		if(mVelocityTracker == null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//*  12   25:ifnonnull       35
			mVelocityTracker = VelocityTracker.obtain();
	//   13   28:aload_0         
	//   14   29:invokestatic    #528 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #364 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #531 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(k)
	//*  20   43:iload           7
		{
	//*  21   45:tableswitch     0 6: default 88
	//	               0 89
	//	               1 674
	//	               2 278
	//	               3 691
	//	               4 709
	//	               5 167
	//	               6 529
		default:
			return;
	//   22   88:return          

		case 4: // '\004'
			break;

		case 0: // '\0'
			float f = motionevent.getX();
	//   23   89:aload_1         
	//   24   90:invokevirtual   #533 <Method float MotionEvent.getX()>
	//   25   93:fstore_2        
			float f5 = motionevent.getY();
	//   26   94:aload_1         
	//   27   95:invokevirtual   #535 <Method float MotionEvent.getY()>
	//   28   98:fstore_3        
			i = motionevent.getPointerId(0);
	//   29   99:aload_1         
	//   30  100:iconst_0        
	//   31  101:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//   32  104:istore          6
			motionevent = ((MotionEvent) (findTopChildUnder((int)f, (int)f5)));
	//   33  106:aload_0         
	//   34  107:fload_2         
	//   35  108:f2i             
	//   36  109:fload_3         
	//   37  110:f2i             
	//   38  111:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//   39  114:astore_1        
			saveInitialMotion(f, f5, i);
	//   40  115:aload_0         
	//   41  116:fload_2         
	//   42  117:fload_3         
	//   43  118:iload           6
	//   44  120:invokespecial   #539 <Method void saveInitialMotion(float, float, int)>
			tryCaptureViewForDrag(((View) (motionevent)), i);
	//   45  123:aload_0         
	//   46  124:aload_1         
	//   47  125:iload           6
	//   48  127:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//   49  130:pop             
			int l = mInitialEdgesTouched[i];
	//   50  131:aload_0         
	//   51  132:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   52  135:iload           6
	//   53  137:iaload          
	//   54  138:istore          7
			if((mTrackingEdges & l) != 0)
	//*  55  140:aload_0         
	//*  56  141:getfield        #168 <Field int mTrackingEdges>
	//*  57  144:iload           7
	//*  58  146:iand            
	//*  59  147:ifeq            709
			{
				mCallback.onEdgeTouched(mTrackingEdges & l, i);
	//   60  150:aload_0         
	//   61  151:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   62  154:aload_0         
	//   63  155:getfield        #168 <Field int mTrackingEdges>
	//   64  158:iload           7
	//   65  160:iand            
	//   66  161:iload           6
	//   67  163:invokevirtual   #546 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
				return;
	//   68  166:return          
			}
			break;

		case 5: // '\005'
			int i1 = motionevent.getPointerId(i);
	//   69  167:aload_1         
	//   70  168:iload           6
	//   71  170:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//   72  173:istore          7
			float f1 = motionevent.getX(i);
	//   73  175:aload_1         
	//   74  176:iload           6
	//   75  178:invokevirtual   #409 <Method float MotionEvent.getX(int)>
	//   76  181:fstore_2        
			float f6 = motionevent.getY(i);
	//   77  182:aload_1         
	//   78  183:iload           6
	//   79  185:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//   80  188:fstore_3        
			saveInitialMotion(f1, f6, i1);
	//   81  189:aload_0         
	//   82  190:fload_2         
	//   83  191:fload_3         
	//   84  192:iload           7
	//   85  194:invokespecial   #539 <Method void saveInitialMotion(float, float, int)>
			if(mDragState == 0)
	//*  86  197:aload_0         
	//*  87  198:getfield        #266 <Field int mDragState>
	//*  88  201:ifne            255
			{
				tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f6), i1);
	//   89  204:aload_0         
	//   90  205:aload_0         
	//   91  206:fload_2         
	//   92  207:f2i             
	//   93  208:fload_3         
	//   94  209:f2i             
	//   95  210:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//   96  213:iload           7
	//   97  215:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//   98  218:pop             
				i = mInitialEdgesTouched[i1];
	//   99  219:aload_0         
	//  100  220:getfield        #166 <Field int[] mInitialEdgesTouched>
	//  101  223:iload           7
	//  102  225:iaload          
	//  103  226:istore          6
				if((mTrackingEdges & i) != 0)
	//* 104  228:aload_0         
	//* 105  229:getfield        #168 <Field int mTrackingEdges>
	//* 106  232:iload           6
	//* 107  234:iand            
	//* 108  235:ifeq            254
					mCallback.onEdgeTouched(mTrackingEdges & i, i1);
	//  109  238:aload_0         
	//  110  239:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  111  242:aload_0         
	//  112  243:getfield        #168 <Field int mTrackingEdges>
	//  113  246:iload           6
	//  114  248:iand            
	//  115  249:iload           7
	//  116  251:invokevirtual   #546 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
				return;
	//  117  254:return          
			}
			if(isCapturedViewUnder((int)f1, (int)f6))
	//* 118  255:aload_0         
	//* 119  256:fload_2         
	//* 120  257:f2i             
	//* 121  258:fload_3         
	//* 122  259:f2i             
	//* 123  260:invokevirtual   #548 <Method boolean isCapturedViewUnder(int, int)>
	//* 124  263:ifeq            709
			{
				tryCaptureViewForDrag(mCapturedView, i1);
	//  125  266:aload_0         
	//  126  267:aload_0         
	//  127  268:getfield        #260 <Field View mCapturedView>
	//  128  271:iload           7
	//  129  273:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//  130  276:pop             
				return;
	//  131  277:return          
			}
			break;

		case 2: // '\002'
			if(mDragState == 1)
	//* 132  278:aload_0         
	//* 133  279:getfield        #266 <Field int mDragState>
	//* 134  282:iconst_1        
	//* 135  283:icmpne          384
				if(!isValidPointerForActionMove(mActivePointerId))
	//* 136  286:aload_0         
	//* 137  287:aload_0         
	//* 138  288:getfield        #88  <Field int mActivePointerId>
	//* 139  291:invokespecial   #406 <Method boolean isValidPointerForActionMove(int)>
	//* 140  294:ifne            298
				{
					return;
	//  141  297:return          
				} else
				{
					i = motionevent.findPointerIndex(mActivePointerId);
	//  142  298:aload_1         
	//  143  299:aload_0         
	//  144  300:getfield        #88  <Field int mActivePointerId>
	//  145  303:invokevirtual   #551 <Method int MotionEvent.findPointerIndex(int)>
	//  146  306:istore          6
					float f2 = motionevent.getX(i);
	//  147  308:aload_1         
	//  148  309:iload           6
	//  149  311:invokevirtual   #409 <Method float MotionEvent.getX(int)>
	//  150  314:fstore_2        
					float f7 = motionevent.getY(i);
	//  151  315:aload_1         
	//  152  316:iload           6
	//  153  318:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//  154  321:fstore_3        
					i = (int)(f2 - mLastMotionX[mActivePointerId]);
	//  155  322:fload_2         
	//  156  323:aload_0         
	//  157  324:getfield        #204 <Field float[] mLastMotionX>
	//  158  327:aload_0         
	//  159  328:getfield        #88  <Field int mActivePointerId>
	//  160  331:faload          
	//  161  332:fsub            
	//  162  333:f2i             
	//  163  334:istore          6
					int j1 = (int)(f7 - mLastMotionY[mActivePointerId]);
	//  164  336:fload_3         
	//  165  337:aload_0         
	//  166  338:getfield        #206 <Field float[] mLastMotionY>
	//  167  341:aload_0         
	//  168  342:getfield        #88  <Field int mActivePointerId>
	//  169  345:faload          
	//  170  346:fsub            
	//  171  347:f2i             
	//  172  348:istore          7
					dragTo(mCapturedView.getLeft() + i, mCapturedView.getTop() + j1, i, j1);
	//  173  350:aload_0         
	//  174  351:aload_0         
	//  175  352:getfield        #260 <Field View mCapturedView>
	//  176  355:invokevirtual   #282 <Method int View.getLeft()>
	//  177  358:iload           6
	//  178  360:iadd            
	//  179  361:aload_0         
	//  180  362:getfield        #260 <Field View mCapturedView>
	//  181  365:invokevirtual   #285 <Method int View.getTop()>
	//  182  368:iload           7
	//  183  370:iadd            
	//  184  371:iload           6
	//  185  373:iload           7
	//  186  375:invokespecial   #553 <Method void dragTo(int, int, int, int)>
					saveLastMotion(motionevent);
	//  187  378:aload_0         
	//  188  379:aload_1         
	//  189  380:invokespecial   #555 <Method void saveLastMotion(MotionEvent)>
					return;
	//  190  383:return          
				}
			int k1 = motionevent.getPointerCount();
	//  191  384:aload_1         
	//  192  385:invokevirtual   #401 <Method int MotionEvent.getPointerCount()>
	//  193  388:istore          7
			for(i = 0; i < k1; i++)
	//* 194  390:iconst_0        
	//* 195  391:istore          6
	//* 196  393:iload           6
	//* 197  395:iload           7
	//* 198  397:icmpge          523
			{
				int i2 = motionevent.getPointerId(i);
	//  199  400:aload_1         
	//  200  401:iload           6
	//  201  403:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//  202  406:istore          8
				if(!isValidPointerForActionMove(i2))
	//* 203  408:aload_0         
	//* 204  409:iload           8
	//* 205  411:invokespecial   #406 <Method boolean isValidPointerForActionMove(int)>
	//* 206  414:ifne            420
					continue;
	//  207  417:goto            514
				float f3 = motionevent.getX(i);
	//  208  420:aload_1         
	//  209  421:iload           6
	//  210  423:invokevirtual   #409 <Method float MotionEvent.getX(int)>
	//  211  426:fstore_2        
				float f8 = motionevent.getY(i);
	//  212  427:aload_1         
	//  213  428:iload           6
	//  214  430:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//  215  433:fstore_3        
				float f10 = f3 - mInitialMotionX[i2];
	//  216  434:fload_2         
	//  217  435:aload_0         
	//  218  436:getfield        #194 <Field float[] mInitialMotionX>
	//  219  439:iload           8
	//  220  441:faload          
	//  221  442:fsub            
	//  222  443:fstore          4
				float f11 = f8 - mInitialMotionY[i2];
	//  223  445:fload_3         
	//  224  446:aload_0         
	//  225  447:getfield        #202 <Field float[] mInitialMotionY>
	//  226  450:iload           8
	//  227  452:faload          
	//  228  453:fsub            
	//  229  454:fstore          5
				reportNewEdgeDrags(f10, f11, i2);
	//  230  456:aload_0         
	//  231  457:fload           4
	//  232  459:fload           5
	//  233  461:iload           8
	//  234  463:invokespecial   #557 <Method void reportNewEdgeDrags(float, float, int)>
				if(mDragState == 1)
	//* 235  466:aload_0         
	//* 236  467:getfield        #266 <Field int mDragState>
	//* 237  470:iconst_1        
	//* 238  471:icmpne          477
					break;
	//  239  474:goto            523
				View view = findTopChildUnder((int)f3, (int)f8);
	//  240  477:aload_0         
	//  241  478:fload_2         
	//  242  479:f2i             
	//  243  480:fload_3         
	//  244  481:f2i             
	//  245  482:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  246  485:astore          11
				if(checkTouchSlop(view, f10, f11) && tryCaptureViewForDrag(view, i2))
	//* 247  487:aload_0         
	//* 248  488:aload           11
	//* 249  490:fload           4
	//* 250  492:fload           5
	//* 251  494:invokespecial   #559 <Method boolean checkTouchSlop(View, float, float)>
	//* 252  497:ifeq            514
	//* 253  500:aload_0         
	//* 254  501:aload           11
	//* 255  503:iload           8
	//* 256  505:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//* 257  508:ifeq            514
					break;
	//  258  511:goto            523
			}

	//  259  514:iload           6
	//  260  516:iconst_1        
	//  261  517:iadd            
	//  262  518:istore          6
	//* 263  520:goto            393
			saveLastMotion(motionevent);
	//  264  523:aload_0         
	//  265  524:aload_1         
	//  266  525:invokespecial   #555 <Method void saveLastMotion(MotionEvent)>
			return;
	//  267  528:return          

		case 6: // '\006'
			int j2 = motionevent.getPointerId(i);
	//  268  529:aload_1         
	//  269  530:iload           6
	//  270  532:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//  271  535:istore          9
			if(mDragState == 1 && j2 == mActivePointerId)
	//* 272  537:aload_0         
	//* 273  538:getfield        #266 <Field int mDragState>
	//* 274  541:iconst_1        
	//* 275  542:icmpne          667
	//* 276  545:iload           9
	//* 277  547:aload_0         
	//* 278  548:getfield        #88  <Field int mActivePointerId>
	//* 279  551:icmpne          667
			{
				byte byte0 = -1;
	//  280  554:iconst_m1       
	//  281  555:istore          8
				int k2 = motionevent.getPointerCount();
	//  282  557:aload_1         
	//  283  558:invokevirtual   #401 <Method int MotionEvent.getPointerCount()>
	//  284  561:istore          10
				int j = 0;
	//  285  563:iconst_0        
	//  286  564:istore          6
				int l1;
				do
				{
					l1 = ((int) (byte0));
	//  287  566:iload           8
	//  288  568:istore          7
					if(j >= k2)
						break;
	//  289  570:iload           6
	//  290  572:iload           10
	//  291  574:icmpge          657
					l1 = motionevent.getPointerId(j);
	//  292  577:aload_1         
	//  293  578:iload           6
	//  294  580:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//  295  583:istore          7
					if(l1 != mActivePointerId)
	//* 296  585:iload           7
	//* 297  587:aload_0         
	//* 298  588:getfield        #88  <Field int mActivePointerId>
	//* 299  591:icmpne          597
	//* 300  594:goto            648
					{
						float f4 = motionevent.getX(j);
	//  301  597:aload_1         
	//  302  598:iload           6
	//  303  600:invokevirtual   #409 <Method float MotionEvent.getX(int)>
	//  304  603:fstore_2        
						float f9 = motionevent.getY(j);
	//  305  604:aload_1         
	//  306  605:iload           6
	//  307  607:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//  308  610:fstore_3        
						if(findTopChildUnder((int)f4, (int)f9) == mCapturedView && tryCaptureViewForDrag(mCapturedView, l1))
	//* 309  611:aload_0         
	//* 310  612:fload_2         
	//* 311  613:f2i             
	//* 312  614:fload_3         
	//* 313  615:f2i             
	//* 314  616:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//* 315  619:aload_0         
	//* 316  620:getfield        #260 <Field View mCapturedView>
	//* 317  623:if_acmpne       648
	//* 318  626:aload_0         
	//* 319  627:aload_0         
	//* 320  628:getfield        #260 <Field View mCapturedView>
	//* 321  631:iload           7
	//* 322  633:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//* 323  636:ifeq            648
						{
							l1 = mActivePointerId;
	//  324  639:aload_0         
	//  325  640:getfield        #88  <Field int mActivePointerId>
	//  326  643:istore          7
							break;
	//  327  645:goto            657
						}
					}
					j++;
	//  328  648:iload           6
	//  329  650:iconst_1        
	//  330  651:iadd            
	//  331  652:istore          6
				} while(true);
	//  332  654:goto            566
				if(l1 == -1)
	//* 333  657:iload           7
	//* 334  659:iconst_m1       
	//* 335  660:icmpne          667
					releaseViewForPointerUp();
	//  336  663:aload_0         
	//  337  664:invokespecial   #561 <Method void releaseViewForPointerUp()>
			}
			clearMotionHistory(j2);
	//  338  667:aload_0         
	//  339  668:iload           9
	//  340  670:invokespecial   #563 <Method void clearMotionHistory(int)>
			return;
	//  341  673:return          

		case 1: // '\001'
			if(mDragState == 1)
	//* 342  674:aload_0         
	//* 343  675:getfield        #266 <Field int mDragState>
	//* 344  678:iconst_1        
	//* 345  679:icmpne          686
				releaseViewForPointerUp();
	//  346  682:aload_0         
	//  347  683:invokespecial   #561 <Method void releaseViewForPointerUp()>
			cancel();
	//  348  686:aload_0         
	//  349  687:invokevirtual   #416 <Method void cancel()>
			return;
	//  350  690:return          

		case 3: // '\003'
			if(mDragState == 1)
	//* 351  691:aload_0         
	//* 352  692:getfield        #266 <Field int mDragState>
	//* 353  695:iconst_1        
	//* 354  696:icmpne          705
				dispatchViewReleased(0.0F, 0.0F);
	//  355  699:aload_0         
	//  356  700:fconst_0        
	//  357  701:fconst_0        
	//  358  702:invokespecial   #381 <Method void dispatchViewReleased(float, float)>
			cancel();
	//  359  705:aload_0         
	//  360  706:invokevirtual   #416 <Method void cancel()>
			break;
		}
	//  361  709:return          
	}

	void setDragState(int i)
	{
		mParentView.removeCallbacks(mSetIdleRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ViewGroup mParentView>
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field Runnable mSetIdleRunnable>
	//    4    8:invokevirtual   #566 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    5   11:pop             
		if(mDragState != i)
	//*   6   12:aload_0         
	//*   7   13:getfield        #266 <Field int mDragState>
	//*   8   16:iload_1         
	//*   9   17:icmpeq          45
		{
			mDragState = i;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:putfield        #266 <Field int mDragState>
			mCallback.onViewDragStateChanged(i);
	//   13   25:aload_0         
	//   14   26:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #569 <Method void ViewDragHelper$Callback.onViewDragStateChanged(int)>
			if(mDragState == 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #266 <Field int mDragState>
	//*  19   37:ifne            45
				mCapturedView = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #260 <Field View mCapturedView>
		}
	//   23   45:return          
	}

	public void setEdgeTrackingEnabled(int i)
	{
		mTrackingEdges = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #168 <Field int mTrackingEdges>
	//    3    5:return          
	}

	public void setMinVelocity(float f)
	{
		mMinVelocity = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #149 <Field float mMinVelocity>
	//    3    5:return          
	}

	public boolean settleCapturedViewAt(int i, int j)
	{
		if(!mReleaseInProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field boolean mReleaseInProgress>
	//*   2    4:ifne            18
			throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
	//    3    7:new             #494 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #575 <String "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased">
	//    6   14:invokespecial   #497 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return forceSettleCapturedViewAt(i, j, (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId));
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:iload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   13   25:aload_0         
	//   14   26:getfield        #88  <Field int mActivePointerId>
	//   15   29:invokevirtual   #374 <Method float VelocityTracker.getXVelocity(int)>
	//   16   32:f2i             
	//   17   33:aload_0         
	//   18   34:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   19   37:aload_0         
	//   20   38:getfield        #88  <Field int mActivePointerId>
	//   21   41:invokevirtual   #379 <Method float VelocityTracker.getYVelocity(int)>
	//   22   44:f2i             
	//   23   45:invokespecial   #577 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
	//   24   48:ireturn         
	}

	public boolean shouldInterceptTouchEvent(MotionEvent motionevent)
	{
		int j = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #521 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          7
		int i = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #524 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          6
		if(j == 0)
	//*   6   12:iload           7
	//*   7   14:ifne            21
			cancel();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #416 <Method void cancel()>
		if(mVelocityTracker == null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//*  12   25:ifnonnull       35
			mVelocityTracker = VelocityTracker.obtain();
	//   13   28:aload_0         
	//   14   29:invokestatic    #528 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #364 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #364 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #531 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(j)
	//*  20   43:iload           7
		{
	//*  21   45:tableswitch     0 6: default 88
	//	               0 91
	//	               1 620
	//	               2 298
	//	               3 620
	//	               4 624
	//	               5 187
	//	               6 607
	//*  22   88:goto            624
		case 0: // '\0'
			float f = motionevent.getX();
	//   23   91:aload_1         
	//   24   92:invokevirtual   #533 <Method float MotionEvent.getX()>
	//   25   95:fstore_2        
			float f3 = motionevent.getY();
	//   26   96:aload_1         
	//   27   97:invokevirtual   #535 <Method float MotionEvent.getY()>
	//   28  100:fstore_3        
			i = motionevent.getPointerId(0);
	//   29  101:aload_1         
	//   30  102:iconst_0        
	//   31  103:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//   32  106:istore          6
			saveInitialMotion(f, f3, i);
	//   33  108:aload_0         
	//   34  109:fload_2         
	//   35  110:fload_3         
	//   36  111:iload           6
	//   37  113:invokespecial   #539 <Method void saveInitialMotion(float, float, int)>
			motionevent = ((MotionEvent) (findTopChildUnder((int)f, (int)f3)));
	//   38  116:aload_0         
	//   39  117:fload_2         
	//   40  118:f2i             
	//   41  119:fload_3         
	//   42  120:f2i             
	//   43  121:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//   44  124:astore_1        
			if(motionevent == mCapturedView && mDragState == 2)
	//*  45  125:aload_1         
	//*  46  126:aload_0         
	//*  47  127:getfield        #260 <Field View mCapturedView>
	//*  48  130:if_acmpne       149
	//*  49  133:aload_0         
	//*  50  134:getfield        #266 <Field int mDragState>
	//*  51  137:iconst_2        
	//*  52  138:icmpne          149
				tryCaptureViewForDrag(((View) (motionevent)), i);
	//   53  141:aload_0         
	//   54  142:aload_1         
	//   55  143:iload           6
	//   56  145:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//   57  148:pop             
			int k = mInitialEdgesTouched[i];
	//   58  149:aload_0         
	//   59  150:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   60  153:iload           6
	//   61  155:iaload          
	//   62  156:istore          7
			if((mTrackingEdges & k) != 0)
	//*  63  158:aload_0         
	//*  64  159:getfield        #168 <Field int mTrackingEdges>
	//*  65  162:iload           7
	//*  66  164:iand            
	//*  67  165:ifeq            624
				mCallback.onEdgeTouched(mTrackingEdges & k, i);
	//   68  168:aload_0         
	//   69  169:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   70  172:aload_0         
	//   71  173:getfield        #168 <Field int mTrackingEdges>
	//   72  176:iload           7
	//   73  178:iand            
	//   74  179:iload           6
	//   75  181:invokevirtual   #546 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
			break;

	//*  76  184:goto            624
		case 5: // '\005'
			int l = motionevent.getPointerId(i);
	//   77  187:aload_1         
	//   78  188:iload           6
	//   79  190:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//   80  193:istore          7
			float f1 = motionevent.getX(i);
	//   81  195:aload_1         
	//   82  196:iload           6
	//   83  198:invokevirtual   #409 <Method float MotionEvent.getX(int)>
	//   84  201:fstore_2        
			float f4 = motionevent.getY(i);
	//   85  202:aload_1         
	//   86  203:iload           6
	//   87  205:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//   88  208:fstore_3        
			saveInitialMotion(f1, f4, l);
	//   89  209:aload_0         
	//   90  210:fload_2         
	//   91  211:fload_3         
	//   92  212:iload           7
	//   93  214:invokespecial   #539 <Method void saveInitialMotion(float, float, int)>
			if(mDragState == 0)
	//*  94  217:aload_0         
	//*  95  218:getfield        #266 <Field int mDragState>
	//*  96  221:ifne            262
			{
				i = mInitialEdgesTouched[l];
	//   97  224:aload_0         
	//   98  225:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   99  228:iload           7
	//  100  230:iaload          
	//  101  231:istore          6
				if((mTrackingEdges & i) != 0)
	//* 102  233:aload_0         
	//* 103  234:getfield        #168 <Field int mTrackingEdges>
	//* 104  237:iload           6
	//* 105  239:iand            
	//* 106  240:ifeq            259
					mCallback.onEdgeTouched(mTrackingEdges & i, l);
	//  107  243:aload_0         
	//  108  244:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  109  247:aload_0         
	//  110  248:getfield        #168 <Field int mTrackingEdges>
	//  111  251:iload           6
	//  112  253:iand            
	//  113  254:iload           7
	//  114  256:invokevirtual   #546 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
			} else
	//* 115  259:goto            624
			if(mDragState == 2)
	//* 116  262:aload_0         
	//* 117  263:getfield        #266 <Field int mDragState>
	//* 118  266:iconst_2        
	//* 119  267:icmpne          624
			{
				motionevent = ((MotionEvent) (findTopChildUnder((int)f1, (int)f4)));
	//  120  270:aload_0         
	//  121  271:fload_2         
	//  122  272:f2i             
	//  123  273:fload_3         
	//  124  274:f2i             
	//  125  275:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  126  278:astore_1        
				if(motionevent == mCapturedView)
	//* 127  279:aload_1         
	//* 128  280:aload_0         
	//* 129  281:getfield        #260 <Field View mCapturedView>
	//* 130  284:if_acmpne       295
					tryCaptureViewForDrag(((View) (motionevent)), l);
	//  131  287:aload_0         
	//  132  288:aload_1         
	//  133  289:iload           7
	//  134  291:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//  135  294:pop             
			}
			break;

	//* 136  295:goto            624
		case 2: // '\002'
			if(mInitialMotionX != null && mInitialMotionY != null)
	//* 137  298:aload_0         
	//* 138  299:getfield        #194 <Field float[] mInitialMotionX>
	//* 139  302:ifnull          624
	//* 140  305:aload_0         
	//* 141  306:getfield        #202 <Field float[] mInitialMotionY>
	//* 142  309:ifnonnull       315
	//* 143  312:goto            624
			{
				int i1 = motionevent.getPointerCount();
	//  144  315:aload_1         
	//  145  316:invokevirtual   #401 <Method int MotionEvent.getPointerCount()>
	//  146  319:istore          8
				for(i = 0; i < i1; i++)
	//* 147  321:iconst_0        
	//* 148  322:istore          6
	//* 149  324:iload           6
	//* 150  326:iload           8
	//* 151  328:icmpge          599
				{
					int j1 = motionevent.getPointerId(i);
	//  152  331:aload_1         
	//  153  332:iload           6
	//  154  334:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//  155  337:istore          9
					if(!isValidPointerForActionMove(j1))
	//* 156  339:aload_0         
	//* 157  340:iload           9
	//* 158  342:invokespecial   #406 <Method boolean isValidPointerForActionMove(int)>
	//* 159  345:ifne            351
						continue;
	//  160  348:goto            590
					float f2 = motionevent.getX(i);
	//  161  351:aload_1         
	//  162  352:iload           6
	//  163  354:invokevirtual   #409 <Method float MotionEvent.getX(int)>
	//  164  357:fstore_2        
					float f5 = motionevent.getY(i);
	//  165  358:aload_1         
	//  166  359:iload           6
	//  167  361:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//  168  364:fstore_3        
					float f6 = f2 - mInitialMotionX[j1];
	//  169  365:fload_2         
	//  170  366:aload_0         
	//  171  367:getfield        #194 <Field float[] mInitialMotionX>
	//  172  370:iload           9
	//  173  372:faload          
	//  174  373:fsub            
	//  175  374:fstore          4
					float f7 = f5 - mInitialMotionY[j1];
	//  176  376:fload_3         
	//  177  377:aload_0         
	//  178  378:getfield        #202 <Field float[] mInitialMotionY>
	//  179  381:iload           9
	//  180  383:faload          
	//  181  384:fsub            
	//  182  385:fstore          5
					View view = findTopChildUnder((int)f2, (int)f5);
	//  183  387:aload_0         
	//  184  388:fload_2         
	//  185  389:f2i             
	//  186  390:fload_3         
	//  187  391:f2i             
	//  188  392:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  189  395:astore          16
					boolean flag;
					if(view != null && checkTouchSlop(view, f6, f7))
	//* 190  397:aload           16
	//* 191  399:ifnull          421
	//* 192  402:aload_0         
	//* 193  403:aload           16
	//* 194  405:fload           4
	//* 195  407:fload           5
	//* 196  409:invokespecial   #559 <Method boolean checkTouchSlop(View, float, float)>
	//* 197  412:ifeq            421
						flag = true;
	//  198  415:iconst_1        
	//  199  416:istore          7
					else
	//* 200  418:goto            424
						flag = false;
	//  201  421:iconst_0        
	//  202  422:istore          7
					if(flag)
	//* 203  424:iload           7
	//* 204  426:ifeq            550
					{
						int k1 = view.getLeft();
	//  205  429:aload           16
	//  206  431:invokevirtual   #282 <Method int View.getLeft()>
	//  207  434:istore          10
						int l1 = (int)f6;
	//  208  436:fload           4
	//  209  438:f2i             
	//  210  439:istore          11
						l1 = mCallback.clampViewPositionHorizontal(view, k1 + l1, (int)f6);
	//  211  441:aload_0         
	//  212  442:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  213  445:aload           16
	//  214  447:iload           10
	//  215  449:iload           11
	//  216  451:iadd            
	//  217  452:fload           4
	//  218  454:f2i             
	//  219  455:invokevirtual   #289 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//  220  458:istore          11
						int i2 = view.getTop();
	//  221  460:aload           16
	//  222  462:invokevirtual   #285 <Method int View.getTop()>
	//  223  465:istore          12
						int j2 = (int)f7;
	//  224  467:fload           5
	//  225  469:f2i             
	//  226  470:istore          13
						j2 = mCallback.clampViewPositionVertical(view, i2 + j2, (int)f7);
	//  227  472:aload_0         
	//  228  473:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  229  476:aload           16
	//  230  478:iload           12
	//  231  480:iload           13
	//  232  482:iadd            
	//  233  483:fload           5
	//  234  485:f2i             
	//  235  486:invokevirtual   #298 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//  236  489:istore          13
						int k2 = mCallback.getViewHorizontalDragRange(view);
	//  237  491:aload_0         
	//  238  492:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  239  495:aload           16
	//  240  497:invokevirtual   #182 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//  241  500:istore          14
						int l2 = mCallback.getViewVerticalDragRange(view);
	//  242  502:aload_0         
	//  243  503:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  244  506:aload           16
	//  245  508:invokevirtual   #185 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//  246  511:istore          15
						if((k2 == 0 || k2 > 0 && l1 == k1) && (l2 == 0 || l2 > 0 && j2 == i2))
	//* 247  513:iload           14
	//* 248  515:ifeq            530
	//* 249  518:iload           14
	//* 250  520:ifle            550
	//* 251  523:iload           11
	//* 252  525:iload           10
	//* 253  527:icmpne          550
	//* 254  530:iload           15
	//* 255  532:ifeq            599
	//* 256  535:iload           15
	//* 257  537:ifle            550
	//* 258  540:iload           13
	//* 259  542:iload           12
	//* 260  544:icmpne          550
							break;
	//  261  547:goto            599
					}
					reportNewEdgeDrags(f6, f7, j1);
	//  262  550:aload_0         
	//  263  551:fload           4
	//  264  553:fload           5
	//  265  555:iload           9
	//  266  557:invokespecial   #557 <Method void reportNewEdgeDrags(float, float, int)>
					if(mDragState == 1 || flag && tryCaptureViewForDrag(view, j1))
	//* 267  560:aload_0         
	//* 268  561:getfield        #266 <Field int mDragState>
	//* 269  564:iconst_1        
	//* 270  565:icmpne          571
	//* 271  568:goto            599
	//* 272  571:iload           7
	//* 273  573:ifeq            590
	//* 274  576:aload_0         
	//* 275  577:aload           16
	//* 276  579:iload           9
	//* 277  581:invokevirtual   #543 <Method boolean tryCaptureViewForDrag(View, int)>
	//* 278  584:ifeq            590
						break;
	//  279  587:goto            599
				}

	//  280  590:iload           6
	//  281  592:iconst_1        
	//  282  593:iadd            
	//  283  594:istore          6
	//* 284  596:goto            324
				saveLastMotion(motionevent);
	//  285  599:aload_0         
	//  286  600:aload_1         
	//  287  601:invokespecial   #555 <Method void saveLastMotion(MotionEvent)>
			}
			break;

	//* 288  604:goto            624
		case 6: // '\006'
			clearMotionHistory(motionevent.getPointerId(i));
	//  289  607:aload_0         
	//  290  608:aload_1         
	//  291  609:iload           6
	//  292  611:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//  293  614:invokespecial   #563 <Method void clearMotionHistory(int)>
			break;

	//* 294  617:goto            624
		case 1: // '\001'
		case 3: // '\003'
			cancel();
	//  295  620:aload_0         
	//  296  621:invokevirtual   #416 <Method void cancel()>
			break;
		}
		return mDragState == 1;
	//  297  624:aload_0         
	//  298  625:getfield        #266 <Field int mDragState>
	//  299  628:iconst_1        
	//  300  629:icmpne          634
	//  301  632:iconst_1        
	//  302  633:ireturn         
	//  303  634:iconst_0        
	//  304  635:ireturn         
	}

	public boolean smoothSlideViewTo(View view, int i, int j)
	{
		mCapturedView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #260 <Field View mCapturedView>
		mActivePointerId = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #88  <Field int mActivePointerId>
		boolean flag = forceSettleCapturedViewAt(i, j, 0, 0);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:iconst_0        
	//   10   14:iconst_0        
	//   11   15:invokespecial   #577 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
	//   12   18:istore          4
		if(!flag && mDragState == 0 && mCapturedView != null)
	//*  13   20:iload           4
	//*  14   22:ifne            44
	//*  15   25:aload_0         
	//*  16   26:getfield        #266 <Field int mDragState>
	//*  17   29:ifne            44
	//*  18   32:aload_0         
	//*  19   33:getfield        #260 <Field View mCapturedView>
	//*  20   36:ifnull          44
			mCapturedView = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #260 <Field View mCapturedView>
		return flag;
	//   24   44:iload           4
	//   25   46:ireturn         
	}

	boolean tryCaptureViewForDrag(View view, int i)
	{
		if(view == mCapturedView && mActivePointerId == i)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #260 <Field View mCapturedView>
	//*   3    5:if_acmpne       18
	//*   4    8:aload_0         
	//*   5    9:getfield        #88  <Field int mActivePointerId>
	//*   6   12:iload_2         
	//*   7   13:icmpne          18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(view != null && mCallback.tryCaptureView(view, i))
	//*  10   18:aload_1         
	//*  11   19:ifnull          47
	//*  12   22:aload_0         
	//*  13   23:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*  14   26:aload_1         
	//*  15   27:iload_2         
	//*  16   28:invokevirtual   #583 <Method boolean ViewDragHelper$Callback.tryCaptureView(View, int)>
	//*  17   31:ifeq            47
		{
			mActivePointerId = i;
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:putfield        #88  <Field int mActivePointerId>
			captureChildView(view, i);
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:iload_2         
	//   24   42:invokevirtual   #585 <Method void captureChildView(View, int)>
			return true;
	//   25   45:iconst_1        
	//   26   46:ireturn         
		} else
		{
			return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		}
	}

	private static final int BASE_SETTLE_DURATION = 256;
	public static final int DIRECTION_ALL = 3;
	public static final int DIRECTION_HORIZONTAL = 1;
	public static final int DIRECTION_VERTICAL = 2;
	public static final int EDGE_ALL = 15;
	public static final int EDGE_BOTTOM = 8;
	public static final int EDGE_LEFT = 1;
	public static final int EDGE_RIGHT = 2;
	private static final int EDGE_SIZE = 20;
	public static final int EDGE_TOP = 4;
	public static final int INVALID_POINTER = -1;
	private static final int MAX_SETTLE_DURATION = 600;
	public static final int STATE_DRAGGING = 1;
	public static final int STATE_IDLE = 0;
	public static final int STATE_SETTLING = 2;
	private static final String TAG = "ViewDragHelper";
	private static final Interpolator sInterpolator = new Interpolator() {

		public float getInterpolation(float f)
		{
			f--;
		//    0    0:fload_1         
		//    1    1:fconst_1        
		//    2    2:fsub            
		//    3    3:fstore_1        
			return f * f * f * f * f + 1.0F;
		//    4    4:fload_1         
		//    5    5:fload_1         
		//    6    6:fmul            
		//    7    7:fload_1         
		//    8    8:fmul            
		//    9    9:fload_1         
		//   10   10:fmul            
		//   11   11:fload_1         
		//   12   12:fmul            
		//   13   13:fconst_1        
		//   14   14:fadd            
		//   15   15:freturn         
		}

	}
;
	private int mActivePointerId;
	private final Callback mCallback;
	private View mCapturedView;
	private int mDragState;
	private int mEdgeDragsInProgress[];
	private int mEdgeDragsLocked[];
	private int mEdgeSize;
	private int mInitialEdgesTouched[];
	private float mInitialMotionX[];
	private float mInitialMotionY[];
	private float mLastMotionX[];
	private float mLastMotionY[];
	private float mMaxVelocity;
	private float mMinVelocity;
	private final ViewGroup mParentView;
	private int mPointersDown;
	private boolean mReleaseInProgress;
	private OverScroller mScroller;
	private final Runnable mSetIdleRunnable = new Runnable() {

		public void run()
		{
			setDragState(0);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ViewDragHelper this$0>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #23  <Method void ViewDragHelper.setDragState(int)>
		//    4    8:return          
		}

		final ViewDragHelper this$0;

			
			{
				this$0 = ViewDragHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ViewDragHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private int mTouchSlop;
	private int mTrackingEdges;
	private VelocityTracker mVelocityTracker;

	static 
	{
	//    0    0:new             #6   <Class ViewDragHelper$1>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void ViewDragHelper$1()>
	//    3    7:putstatic       #83  <Field Interpolator sInterpolator>
	//*   4   10:return          
	}
}
