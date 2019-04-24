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
		if((mInitialEdgesTouched[i] & j) == j && (mTrackingEdges & j) != 0 && (mEdgeDragsLocked[i] & j) != j && (mEdgeDragsInProgress[i] & j) != j && (f > (float)mTouchSlop || f1 > (float)mTouchSlop))
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
	//*  47   82:iconst_0        
	//*  48   83:ireturn         
		{
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
			if((mEdgeDragsInProgress[i] & j) == 0 && f > (float)mTouchSlop)
	//*  73  124:aload_0         
	//*  74  125:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//*  75  128:iload_3         
	//*  76  129:iaload          
	//*  77  130:iload           4
	//*  78  132:iand            
	//*  79  133:ifne            82
	//*  80  136:fload_1         
	//*  81  137:aload_0         
	//*  82  138:getfield        #139 <Field int mTouchSlop>
	//*  83  141:i2f             
	//*  84  142:fcmpl           
	//*  85  143:ifle            82
				return true;
	//   86  146:iconst_1        
	//   87  147:ireturn         
		}
		return false;
	}

	private boolean checkTouchSlop(View view, float f, float f1)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		if(view != null) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:ifnonnull       13
_L1:
		flag2 = false;
	//    4    7:iconst_0        
	//    5    8:istore          6
_L4:
		return flag2;
	//    6   10:iload           6
	//    7   12:ireturn         
_L2:
		boolean flag;
		boolean flag1;
		if(mCallback.getViewHorizontalDragRange(view) > 0)
	//*   8   13:aload_0         
	//*   9   14:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*  10   17:aload_1         
	//*  11   18:invokevirtual   #182 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//*  12   21:ifle            74
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore          4
		else
	//*  15   27:aload_0         
	//*  16   28:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #185 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//*  19   35:ifle            80
	//*  20   38:iconst_1        
	//*  21   39:istore          5
	//*  22   41:iload           4
	//*  23   43:ifeq            86
	//*  24   46:iload           5
	//*  25   48:ifeq            86
	//*  26   51:fload_2         
	//*  27   52:fload_2         
	//*  28   53:fmul            
	//*  29   54:fload_3         
	//*  30   55:fload_3         
	//*  31   56:fmul            
	//*  32   57:fadd            
	//*  33   58:aload_0         
	//*  34   59:getfield        #139 <Field int mTouchSlop>
	//*  35   62:aload_0         
	//*  36   63:getfield        #139 <Field int mTouchSlop>
	//*  37   66:imul            
	//*  38   67:i2f             
	//*  39   68:fcmpl           
	//*  40   69:ifgt            10
	//*  41   72:iconst_0        
	//*  42   73:ireturn         
			flag = false;
	//   43   74:iconst_0        
	//   44   75:istore          4
		if(mCallback.getViewVerticalDragRange(view) > 0)
			flag1 = true;
		else
	//*  45   77:goto            27
			flag1 = false;
	//   46   80:iconst_0        
	//   47   81:istore          5
		if(!flag || !flag1)
			break; /* Loop/switch isn't completed */
		if(f * f + f1 * f1 <= (float)(mTouchSlop * mTouchSlop))
			return false;
		if(true) goto _L4; else goto _L3
	//*  48   83:goto            41
_L3:
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   49   86:iload           4
	//   50   88:ifeq            106
		if(Math.abs(f) <= (float)mTouchSlop)
	//*  51   91:fload_2         
	//*  52   92:invokestatic    #164 <Method float Math.abs(float)>
	//*  53   95:aload_0         
	//*  54   96:getfield        #139 <Field int mTouchSlop>
	//*  55   99:i2f             
	//*  56  100:fcmpl           
	//*  57  101:ifgt            10
			return false;
	//   58  104:iconst_0        
	//   59  105:ireturn         
		if(true) goto _L4; else goto _L5
_L5:
		if(flag1)
	//*  60  106:iload           5
	//*  61  108:ifeq            126
		{
			if(Math.abs(f1) <= (float)mTouchSlop)
	//*  62  111:fload_3         
	//*  63  112:invokestatic    #164 <Method float Math.abs(float)>
	//*  64  115:aload_0         
	//*  65  116:getfield        #139 <Field int mTouchSlop>
	//*  66  119:i2f             
	//*  67  120:fcmpl           
	//*  68  121:ifgt            10
				return false;
	//   69  124:iconst_0        
	//   70  125:ireturn         
		} else
		{
			return false;
	//   71  126:iconst_0        
	//   72  127:ireturn         
		}
		if(true) goto _L4; else goto _L6
_L6:
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
	//*   6   10:ifge            17
			f1 = 0.0F;
	//    7   13:fconst_0        
	//    8   14:fstore_2        
		else
	//*   9   15:fload_2         
	//*  10   16:freturn         
		if(f3 > f2)
	//*  11   17:fload           4
	//*  12   19:fload_3         
	//*  13   20:fcmpl           
	//*  14   21:ifle            35
		{
			f1 = f2;
	//   15   24:fload_3         
	//   16   25:fstore_2        
			if(f <= 0.0F)
	//*  17   26:fload_1         
	//*  18   27:fconst_0        
	//*  19   28:fcmpl           
	//*  20   29:ifgt            15
				return -f2;
	//   21   32:fload_3         
	//   22   33:fneg            
	//   23   34:freturn         
		} else
		{
			return f;
	//   24   35:fload_1         
	//   25   36:freturn         
		}
		return f1;
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
	//*   5    9:icmpge          16
			j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		else
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		if(l > k)
	//*  10   16:iload           4
	//*  11   18:iload_3         
	//*  12   19:icmple          31
		{
			j = k;
	//   13   22:iload_3         
	//   14   23:istore_2        
			if(i <= 0)
	//*  15   24:iload_1         
	//*  16   25:ifgt            14
				return -k;
	//   17   28:iload_3         
	//   18   29:ineg            
	//   19   30:ireturn         
		} else
		{
			return i;
	//   20   31:iload_1         
	//   21   32:ireturn         
		}
		return j;
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
	//*  35   60:ifle            94
			i = Math.round(1000F * Math.abs((f + f1 * f2) / (float)j)) * 4;
	//   36   63:ldc1            #229 <Float 1000F>
	//   37   65:fload           4
	//   38   67:fload           5
	//   39   69:fload           6
	//   40   71:fmul            
	//   41   72:fadd            
	//   42   73:iload_2         
	//   43   74:i2f             
	//   44   75:fdiv            
	//   45   76:invokestatic    #164 <Method float Math.abs(float)>
	//   46   79:fmul            
	//   47   80:invokestatic    #233 <Method int Math.round(float)>
	//   48   83:iconst_4        
	//   49   84:imul            
	//   50   85:istore_1        
		else
	//*  51   86:iload_1         
	//*  52   87:sipush          600
	//*  53   90:invokestatic    #236 <Method int Math.min(int, int)>
	//*  54   93:ireturn         
			i = (int)(((float)Math.abs(i) / (float)k + 1.0F) * 256F);
	//   55   94:iload_1         
	//   56   95:invokestatic    #191 <Method int Math.abs(int)>
	//   57   98:i2f             
	//   58   99:iload_3         
	//   59  100:i2f             
	//   60  101:fdiv            
	//   61  102:fconst_1        
	//   62  103:fadd            
	//   63  104:ldc1            #237 <Float 256F>
	//   64  106:fmul            
	//   65  107:f2i             
	//   66  108:istore_1        
		return Math.min(i, 600);
	//*  67  109:goto            86
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
		float f1;
		if(k != 0)
	//*  40   76:iload           4
	//*  41   78:ifeq            149
			f = (float)k1 / (float)i2;
	//   42   81:iload           10
	//   43   83:i2f             
	//   44   84:iload           12
	//   45   86:i2f             
	//   46   87:fdiv            
	//   47   88:fstore          6
		else
	//*  48   90:iload           5
	//*  49   92:ifeq            161
	//*  50   95:iload           11
	//*  51   97:i2f             
	//*  52   98:iload           12
	//*  53  100:i2f             
	//*  54  101:fdiv            
	//*  55  102:fstore          7
	//*  56  104:aload_0         
	//*  57  105:iload_2         
	//*  58  106:iload           4
	//*  59  108:aload_0         
	//*  60  109:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*  61  112:aload_1         
	//*  62  113:invokevirtual   #182 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//*  63  116:invokespecial   #243 <Method int computeAxisDuration(int, int, int)>
	//*  64  119:istore_2        
	//*  65  120:aload_0         
	//*  66  121:iload_3         
	//*  67  122:iload           5
	//*  68  124:aload_0         
	//*  69  125:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//*  70  128:aload_1         
	//*  71  129:invokevirtual   #185 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//*  72  132:invokespecial   #243 <Method int computeAxisDuration(int, int, int)>
	//*  73  135:istore_3        
	//*  74  136:iload_2         
	//*  75  137:i2f             
	//*  76  138:fload           6
	//*  77  140:fmul            
	//*  78  141:iload_3         
	//*  79  142:i2f             
	//*  80  143:fload           7
	//*  81  145:fmul            
	//*  82  146:fadd            
	//*  83  147:f2i             
	//*  84  148:ireturn         
			f = (float)i1 / (float)j2;
	//   85  149:iload           8
	//   86  151:i2f             
	//   87  152:iload           13
	//   88  154:i2f             
	//   89  155:fdiv            
	//   90  156:fstore          6
		if(l != 0)
			f1 = (float)l1 / (float)i2;
		else
	//*  91  158:goto            90
			f1 = (float)j1 / (float)j2;
	//   92  161:iload           9
	//   93  163:i2f             
	//   94  164:iload           13
	//   95  166:i2f             
	//   96  167:fdiv            
	//   97  168:fstore          7
		i = computeAxisDuration(i, k, mCallback.getViewHorizontalDragRange(view));
		j = computeAxisDuration(j, l, mCallback.getViewVerticalDragRange(view));
		return (int)((float)i * f + (float)j * f1);
	//*  98  170:goto            104
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
		return (float)Math.sin((f - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc1            #131 <Float 0.5F>
	//    2    3:fsub            
	//    3    4:ldc2            #270 <Float 0.4712389F>
	//    4    7:fmul            
	//    5    8:f2d             
	//    6    9:invokestatic    #274 <Method double Math.sin(double)>
	//    7   12:d2f             
	//    8   13:freturn         
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
	//    6   10:invokevirtual   #281 <Method int View.getLeft()>
	//    7   13:istore          7
		int l1 = mCapturedView.getTop();
	//    8   15:aload_0         
	//    9   16:getfield        #260 <Field View mCapturedView>
	//   10   19:invokevirtual   #284 <Method int View.getTop()>
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
	//   20   38:invokevirtual   #288 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//   21   41:istore          6
			ViewCompat.offsetLeftAndRight(mCapturedView, j1 - k1);
	//   22   43:aload_0         
	//   23   44:getfield        #260 <Field View mCapturedView>
	//   24   47:iload           6
	//   25   49:iload           7
	//   26   51:isub            
	//   27   52:invokestatic    #294 <Method void ViewCompat.offsetLeftAndRight(View, int)>
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
	//   36   71:invokevirtual   #297 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//   37   74:istore          5
			ViewCompat.offsetTopAndBottom(mCapturedView, i1 - l1);
	//   38   76:aload_0         
	//   39   77:getfield        #260 <Field View mCapturedView>
	//   40   80:iload           5
	//   41   82:iload           8
	//   42   84:isub            
	//   43   85:invokestatic    #300 <Method void ViewCompat.offsetTopAndBottom(View, int)>
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
	//   60  119:invokevirtual   #304 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
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
	//   54   82:invokestatic    #311 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mInitialMotionY)), 0, ((Object) (af1)), 0, mInitialMotionY.length);
	//   55   85:aload_0         
	//   56   86:getfield        #202 <Field float[] mInitialMotionY>
	//   57   89:iconst_0        
	//   58   90:aload_3         
	//   59   91:iconst_0        
	//   60   92:aload_0         
	//   61   93:getfield        #202 <Field float[] mInitialMotionY>
	//   62   96:arraylength     
	//   63   97:invokestatic    #311 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mLastMotionX)), 0, ((Object) (af2)), 0, mLastMotionX.length);
	//   64  100:aload_0         
	//   65  101:getfield        #204 <Field float[] mLastMotionX>
	//   66  104:iconst_0        
	//   67  105:aload           4
	//   68  107:iconst_0        
	//   69  108:aload_0         
	//   70  109:getfield        #204 <Field float[] mLastMotionX>
	//   71  112:arraylength     
	//   72  113:invokestatic    #311 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mLastMotionY)), 0, ((Object) (af3)), 0, mLastMotionY.length);
	//   73  116:aload_0         
	//   74  117:getfield        #206 <Field float[] mLastMotionY>
	//   75  120:iconst_0        
	//   76  121:aload           5
	//   77  123:iconst_0        
	//   78  124:aload_0         
	//   79  125:getfield        #206 <Field float[] mLastMotionY>
	//   80  128:arraylength     
	//   81  129:invokestatic    #311 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mInitialEdgesTouched)), 0, ((Object) (ai)), 0, mInitialEdgesTouched.length);
	//   82  132:aload_0         
	//   83  133:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   84  136:iconst_0        
	//   85  137:aload           6
	//   86  139:iconst_0        
	//   87  140:aload_0         
	//   88  141:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   89  144:arraylength     
	//   90  145:invokestatic    #311 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mEdgeDragsInProgress)), 0, ((Object) (ai1)), 0, mEdgeDragsInProgress.length);
	//   91  148:aload_0         
	//   92  149:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   93  152:iconst_0        
	//   94  153:aload           7
	//   95  155:iconst_0        
	//   96  156:aload_0         
	//   97  157:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   98  160:arraylength     
	//   99  161:invokestatic    #311 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mEdgeDragsLocked)), 0, ((Object) (ai2)), 0, mEdgeDragsLocked.length);
	//  100  164:aload_0         
	//  101  165:getfield        #170 <Field int[] mEdgeDragsLocked>
	//  102  168:iconst_0        
	//  103  169:aload           8
	//  104  171:iconst_0        
	//  105  172:aload_0         
	//  106  173:getfield        #170 <Field int[] mEdgeDragsLocked>
	//  107  176:arraylength     
	//  108  177:invokestatic    #311 <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//    2    4:invokevirtual   #281 <Method int View.getLeft()>
	//    3    7:istore          5
		int j1 = mCapturedView.getTop();
	//    4    9:aload_0         
	//    5   10:getfield        #260 <Field View mCapturedView>
	//    6   13:invokevirtual   #284 <Method int View.getTop()>
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
	//   22   40:invokevirtual   #316 <Method void OverScroller.abortAnimation()>
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
	//   35   60:invokespecial   #318 <Method int computeSettleDuration(View, int, int, int, int)>
	//   36   63:istore_3        
			mScroller.startScroll(i1, j1, i, j, k);
	//   37   64:aload_0         
	//   38   65:getfield        #156 <Field OverScroller mScroller>
	//   39   68:iload           5
	//   40   70:iload           6
	//   41   72:iload_1         
	//   42   73:iload_2         
	//   43   74:iload_3         
	//   44   75:invokevirtual   #322 <Method void OverScroller.startScroll(int, int, int, int, int)>
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
	//*   5    8:invokevirtual   #324 <Method int ViewGroup.getLeft()>
	//*   6   11:aload_0         
	//*   7   12:getfield        #133 <Field int mEdgeSize>
	//*   8   15:iadd            
	//*   9   16:icmpge          24
			l = ((int) (false | true));
	//   10   19:iconst_0        
	//   11   20:iconst_1        
	//   12   21:ior             
	//   13   22:istore          4
		int k = l;
	//   14   24:iload           4
	//   15   26:istore_3        
		if(j < mParentView.getTop() + mEdgeSize)
	//*  16   27:iload_2         
	//*  17   28:aload_0         
	//*  18   29:getfield        #104 <Field ViewGroup mParentView>
	//*  19   32:invokevirtual   #325 <Method int ViewGroup.getTop()>
	//*  20   35:aload_0         
	//*  21   36:getfield        #133 <Field int mEdgeSize>
	//*  22   39:iadd            
	//*  23   40:icmpge          48
			k = l | 4;
	//   24   43:iload           4
	//   25   45:iconst_4        
	//   26   46:ior             
	//   27   47:istore_3        
		l = k;
	//   28   48:iload_3         
	//   29   49:istore          4
		if(i > mParentView.getRight() - mEdgeSize)
	//*  30   51:iload_1         
	//*  31   52:aload_0         
	//*  32   53:getfield        #104 <Field ViewGroup mParentView>
	//*  33   56:invokevirtual   #328 <Method int ViewGroup.getRight()>
	//*  34   59:aload_0         
	//*  35   60:getfield        #133 <Field int mEdgeSize>
	//*  36   63:isub            
	//*  37   64:icmple          72
			l = k | 2;
	//   38   67:iload_3         
	//   39   68:iconst_2        
	//   40   69:ior             
	//   41   70:istore          4
		i = l;
	//   42   72:iload           4
	//   43   74:istore_1        
		if(j > mParentView.getBottom() - mEdgeSize)
	//*  44   75:iload_2         
	//*  45   76:aload_0         
	//*  46   77:getfield        #104 <Field ViewGroup mParentView>
	//*  47   80:invokevirtual   #331 <Method int ViewGroup.getBottom()>
	//*  48   83:aload_0         
	//*  49   84:getfield        #133 <Field int mEdgeSize>
	//*  50   87:isub            
	//*  51   88:icmple          97
			i = l | 8;
	//   52   91:iload           4
	//   53   93:bipush          8
	//   54   95:ior             
	//   55   96:istore_1        
		return i;
	//   56   97:iload_1         
	//   57   98:ireturn         
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
	//    5   10:new             #334 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #335 <Method void StringBuilder()>
	//    8   17:ldc2            #337 <String "Ignoring pointerId=">
	//    9   20:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:iload_1         
	//   11   24:invokevirtual   #344 <Method StringBuilder StringBuilder.append(int)>
	//   12   27:ldc2            #346 <String " because ACTION_DOWN was not received ">
	//   13   30:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:ldc2            #348 <String "for this pointer before ACTION_MOVE. It likely happened because ">
	//   15   36:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:ldc2            #350 <String " ViewDragHelper did not receive all the events in the event stream.">
	//   17   42:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   18   45:invokevirtual   #354 <Method String StringBuilder.toString()>
	//   19   48:invokestatic    #360 <Method int Log.e(String, String)>
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
	//    1    1:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//    2    4:sipush          1000
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field float mMaxVelocity>
	//    5   11:invokevirtual   #369 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		dispatchViewReleased(clampMag(mVelocityTracker.getXVelocity(mActivePointerId), mMinVelocity, mMaxVelocity), clampMag(mVelocityTracker.getYVelocity(mActivePointerId), mMinVelocity, mMaxVelocity));
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   10   20:aload_0         
	//   11   21:getfield        #88  <Field int mActivePointerId>
	//   12   24:invokevirtual   #373 <Method float VelocityTracker.getXVelocity(int)>
	//   13   27:aload_0         
	//   14   28:getfield        #149 <Field float mMinVelocity>
	//   15   31:aload_0         
	//   16   32:getfield        #144 <Field float mMaxVelocity>
	//   17   35:invokespecial   #375 <Method float clampMag(float, float, float)>
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   21   43:aload_0         
	//   22   44:getfield        #88  <Field int mActivePointerId>
	//   23   47:invokevirtual   #378 <Method float VelocityTracker.getYVelocity(int)>
	//   24   50:aload_0         
	//   25   51:getfield        #149 <Field float mMinVelocity>
	//   26   54:aload_0         
	//   27   55:getfield        #144 <Field float mMaxVelocity>
	//   28   58:invokespecial   #375 <Method float clampMag(float, float, float)>
	//   29   61:invokespecial   #380 <Method void dispatchViewReleased(float, float)>
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
	//*   7    8:invokespecial   #384 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*   8   11:ifeq            19
			k = ((int) (false | true));
	//    9   14:iconst_0        
	//   10   15:iconst_1        
	//   11   16:ior             
	//   12   17:istore          5
		int j = k;
	//   13   19:iload           5
	//   14   21:istore          4
		if(checkNewEdgeDrag(f1, f, i, 4))
	//*  15   23:aload_0         
	//*  16   24:fload_2         
	//*  17   25:fload_1         
	//*  18   26:iload_3         
	//*  19   27:iconst_4        
	//*  20   28:invokespecial   #384 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  21   31:ifeq            40
			j = k | 4;
	//   22   34:iload           5
	//   23   36:iconst_4        
	//   24   37:ior             
	//   25   38:istore          4
		k = j;
	//   26   40:iload           4
	//   27   42:istore          5
		if(checkNewEdgeDrag(f, f1, i, 2))
	//*  28   44:aload_0         
	//*  29   45:fload_1         
	//*  30   46:fload_2         
	//*  31   47:iload_3         
	//*  32   48:iconst_2        
	//*  33   49:invokespecial   #384 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  34   52:ifeq            61
			k = j | 2;
	//   35   55:iload           4
	//   36   57:iconst_2        
	//   37   58:ior             
	//   38   59:istore          5
		j = k;
	//   39   61:iload           5
	//   40   63:istore          4
		if(checkNewEdgeDrag(f1, f, i, 8))
	//*  41   65:aload_0         
	//*  42   66:fload_2         
	//*  43   67:fload_1         
	//*  44   68:iload_3         
	//*  45   69:bipush          8
	//*  46   71:invokespecial   #384 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  47   74:ifeq            84
			j = k | 8;
	//   48   77:iload           5
	//   49   79:bipush          8
	//   50   81:ior             
	//   51   82:istore          4
		if(j != 0)
	//*  52   84:iload           4
	//*  53   86:ifeq            116
		{
			int ai[] = mEdgeDragsInProgress;
	//   54   89:aload_0         
	//   55   90:getfield        #172 <Field int[] mEdgeDragsInProgress>
	//   56   93:astore          6
			ai[i] = ai[i] | j;
	//   57   95:aload           6
	//   58   97:iload_3         
	//   59   98:aload           6
	//   60  100:iload_3         
	//   61  101:iaload          
	//   62  102:iload           4
	//   63  104:ior             
	//   64  105:iastore         
			mCallback.onEdgeDragStarted(j, i);
	//   65  106:aload_0         
	//   66  107:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   67  110:iload           4
	//   68  112:iload_3         
	//   69  113:invokevirtual   #388 <Method void ViewDragHelper$Callback.onEdgeDragStarted(int, int)>
		}
	//   70  116:return          
	}

	private void saveInitialMotion(float f, float f1, int i)
	{
		ensureMotionHistorySizeForId(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokespecial   #391 <Method void ensureMotionHistorySizeForId(int)>
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
	//   35   51:invokespecial   #393 <Method int getEdgesTouched(int, int)>
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
	//    1    1:invokevirtual   #400 <Method int MotionEvent.getPointerCount()>
	//    2    4:istore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		while(i < j) 
	//*   5    9:iload           4
	//*   6   11:iload           5
	//*   7   13:icmpge          75
		{
			int k = motionevent.getPointerId(i);
	//    8   16:aload_1         
	//    9   17:iload           4
	//   10   19:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//   11   22:istore          6
			if(isValidPointerForActionMove(k))
	//*  12   24:aload_0         
	//*  13   25:iload           6
	//*  14   27:invokespecial   #405 <Method boolean isValidPointerForActionMove(int)>
	//*  15   30:ifne            42
	//*  16   33:iload           4
	//*  17   35:iconst_1        
	//*  18   36:iadd            
	//*  19   37:istore          4
	//*  20   39:goto            9
			{
				float f = motionevent.getX(i);
	//   21   42:aload_1         
	//   22   43:iload           4
	//   23   45:invokevirtual   #408 <Method float MotionEvent.getX(int)>
	//   24   48:fstore_2        
				float f1 = motionevent.getY(i);
	//   25   49:aload_1         
	//   26   50:iload           4
	//   27   52:invokevirtual   #411 <Method float MotionEvent.getY(int)>
	//   28   55:fstore_3        
				mLastMotionX[k] = f;
	//   29   56:aload_0         
	//   30   57:getfield        #204 <Field float[] mLastMotionX>
	//   31   60:iload           6
	//   32   62:fload_2         
	//   33   63:fastore         
				mLastMotionY[k] = f1;
	//   34   64:aload_0         
	//   35   65:getfield        #206 <Field float[] mLastMotionY>
	//   36   68:iload           6
	//   37   70:fload_3         
	//   38   71:fastore         
			}
			i++;
		}
	//*  39   72:goto            33
	//   40   75:return          
	}

	public void abort()
	{
		cancel();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #415 <Method void cancel()>
		if(mDragState == 2)
	//*   2    4:aload_0         
	//*   3    5:getfield        #266 <Field int mDragState>
	//*   4    8:iconst_2        
	//*   5    9:icmpne          73
		{
			int i = mScroller.getCurrX();
	//    6   12:aload_0         
	//    7   13:getfield        #156 <Field OverScroller mScroller>
	//    8   16:invokevirtual   #418 <Method int OverScroller.getCurrX()>
	//    9   19:istore_1        
			int j = mScroller.getCurrY();
	//   10   20:aload_0         
	//   11   21:getfield        #156 <Field OverScroller mScroller>
	//   12   24:invokevirtual   #421 <Method int OverScroller.getCurrY()>
	//   13   27:istore_2        
			mScroller.abortAnimation();
	//   14   28:aload_0         
	//   15   29:getfield        #156 <Field OverScroller mScroller>
	//   16   32:invokevirtual   #316 <Method void OverScroller.abortAnimation()>
			int k = mScroller.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #156 <Field OverScroller mScroller>
	//   19   39:invokevirtual   #418 <Method int OverScroller.getCurrX()>
	//   20   42:istore_3        
			int l = mScroller.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #156 <Field OverScroller mScroller>
	//   23   47:invokevirtual   #421 <Method int OverScroller.getCurrY()>
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
	//   37   70:invokevirtual   #304 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
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
	//    7   14:invokevirtual   #426 <Method int View.getScrollX()>
	//    8   17:istore          8
			int k1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #429 <Method int View.getScrollY()>
	//   11   23:istore          9
			for(int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
	//*  12   25:aload           10
	//*  13   27:invokevirtual   #432 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          7
	//*  17   34:iload           7
	//*  18   36:iflt            146
			{
				View view1 = viewgroup.getChildAt(i1);
	//   19   39:aload           10
	//   20   41:iload           7
	//   21   43:invokevirtual   #436 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          11
				if(k + j1 >= view1.getLeft() && k + j1 < view1.getRight() && l + k1 >= view1.getTop() && l + k1 < view1.getBottom() && canScroll(view1, true, i, j, (k + j1) - view1.getLeft(), (l + k1) - view1.getTop()))
	//*  23   48:iload           5
	//*  24   50:iload           8
	//*  25   52:iadd            
	//*  26   53:aload           11
	//*  27   55:invokevirtual   #281 <Method int View.getLeft()>
	//*  28   58:icmplt          137
	//*  29   61:iload           5
	//*  30   63:iload           8
	//*  31   65:iadd            
	//*  32   66:aload           11
	//*  33   68:invokevirtual   #437 <Method int View.getRight()>
	//*  34   71:icmpge          137
	//*  35   74:iload           6
	//*  36   76:iload           9
	//*  37   78:iadd            
	//*  38   79:aload           11
	//*  39   81:invokevirtual   #284 <Method int View.getTop()>
	//*  40   84:icmplt          137
	//*  41   87:iload           6
	//*  42   89:iload           9
	//*  43   91:iadd            
	//*  44   92:aload           11
	//*  45   94:invokevirtual   #438 <Method int View.getBottom()>
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
	//*  56  114:invokevirtual   #281 <Method int View.getLeft()>
	//*  57  117:isub            
	//*  58  118:iload           6
	//*  59  120:iload           9
	//*  60  122:iadd            
	//*  61  123:aload           11
	//*  62  125:invokevirtual   #284 <Method int View.getTop()>
	//*  63  128:isub            
	//*  64  129:invokevirtual   #440 <Method boolean canScroll(View, boolean, int, int, int, int)>
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
	//   78  153:invokevirtual   #443 <Method boolean View.canScrollHorizontally(int)>
	//   79  156:ifne            169
	//   80  159:aload_1         
	//   81  160:iload           4
	//   82  162:ineg            
	//   83  163:invokevirtual   #446 <Method boolean View.canScrollVertically(int)>
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
	//    4    6:invokespecial   #448 <Method void clearMotionHistory()>
		if(mVelocityTracker != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//*   7   13:ifnull          28
		{
			mVelocityTracker.recycle();
	//    8   16:aload_0         
	//    9   17:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   10   20:invokevirtual   #451 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #363 <Field VelocityTracker mVelocityTracker>
		}
	//   14   28:return          
	}

	public void captureChildView(View view, int i)
	{
		if(view.getParent() != mParentView)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #456 <Method android.view.ViewParent View.getParent()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #104 <Field ViewGroup mParentView>
	//*   4    8:if_acmpeq       48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (").append(((Object) (mParentView))).append(")").toString());
	//    5   11:new             #95  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:new             #334 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #335 <Method void StringBuilder()>
	//   10   22:ldc2            #458 <String "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (">
	//   11   25:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #104 <Field ViewGroup mParentView>
	//   14   32:invokevirtual   #461 <Method StringBuilder StringBuilder.append(Object)>
	//   15   35:ldc2            #463 <String ")">
	//   16   38:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #354 <Method String StringBuilder.toString()>
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
	//   30   64:invokevirtual   #466 <Method void ViewDragHelper$Callback.onViewCaptured(View, int)>
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
	//*  12   16:invokevirtual   #469 <Method boolean checkTouchSlop(int, int)>
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		if(isPointerDown(j)) goto _L2; else goto _L1
	//    2    3:aload_0         
	//    3    4:iload_2         
	//    4    5:invokevirtual   #215 <Method boolean isPointerDown(int)>
	//    5    8:ifne            17
_L1:
		flag1 = false;
	//    6   11:iconst_0        
	//    7   12:istore          6
_L4:
		return flag1;
	//    8   14:iload           6
	//    9   16:ireturn         
_L2:
		float f;
		float f1;
		boolean flag;
		if((i & 1) == 1)
	//*  10   17:iload_1         
	//*  11   18:iconst_1        
	//*  12   19:iand            
	//*  13   20:iconst_1        
	//*  14   21:icmpne          99
			flag = true;
	//   15   24:iconst_1        
	//   16   25:istore          5
		else
	//*  17   27:iload_1         
	//*  18   28:iconst_2        
	//*  19   29:iand            
	//*  20   30:iconst_2        
	//*  21   31:icmpne          105
	//*  22   34:iconst_1        
	//*  23   35:istore_1        
	//*  24   36:aload_0         
	//*  25   37:getfield        #204 <Field float[] mLastMotionX>
	//*  26   40:iload_2         
	//*  27   41:faload          
	//*  28   42:aload_0         
	//*  29   43:getfield        #194 <Field float[] mInitialMotionX>
	//*  30   46:iload_2         
	//*  31   47:faload          
	//*  32   48:fsub            
	//*  33   49:fstore_3        
	//*  34   50:aload_0         
	//*  35   51:getfield        #206 <Field float[] mLastMotionY>
	//*  36   54:iload_2         
	//*  37   55:faload          
	//*  38   56:aload_0         
	//*  39   57:getfield        #202 <Field float[] mInitialMotionY>
	//*  40   60:iload_2         
	//*  41   61:faload          
	//*  42   62:fsub            
	//*  43   63:fstore          4
	//*  44   65:iload           5
	//*  45   67:ifeq            110
	//*  46   70:iload_1         
	//*  47   71:ifeq            110
	//*  48   74:fload_3         
	//*  49   75:fload_3         
	//*  50   76:fmul            
	//*  51   77:fload           4
	//*  52   79:fload           4
	//*  53   81:fmul            
	//*  54   82:fadd            
	//*  55   83:aload_0         
	//*  56   84:getfield        #139 <Field int mTouchSlop>
	//*  57   87:aload_0         
	//*  58   88:getfield        #139 <Field int mTouchSlop>
	//*  59   91:imul            
	//*  60   92:i2f             
	//*  61   93:fcmpl           
	//*  62   94:ifgt            14
	//*  63   97:iconst_0        
	//*  64   98:ireturn         
			flag = false;
	//   65   99:iconst_0        
	//   66  100:istore          5
		if((i & 2) == 2)
			i = 1;
		else
	//*  67  102:goto            27
			i = 0;
	//   68  105:iconst_0        
	//   69  106:istore_1        
		f = mLastMotionX[j] - mInitialMotionX[j];
		f1 = mLastMotionY[j] - mInitialMotionY[j];
		if(!flag || i == 0)
			break; /* Loop/switch isn't completed */
		if(f * f + f1 * f1 <= (float)(mTouchSlop * mTouchSlop))
			return false;
		if(true) goto _L4; else goto _L3
	//*  70  107:goto            36
_L3:
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   71  110:iload           5
	//   72  112:ifeq            130
		if(Math.abs(f) <= (float)mTouchSlop)
	//*  73  115:fload_3         
	//*  74  116:invokestatic    #164 <Method float Math.abs(float)>
	//*  75  119:aload_0         
	//*  76  120:getfield        #139 <Field int mTouchSlop>
	//*  77  123:i2f             
	//*  78  124:fcmpl           
	//*  79  125:ifgt            14
			return false;
	//   80  128:iconst_0        
	//   81  129:ireturn         
		if(true) goto _L4; else goto _L5
_L5:
		if(i != 0)
	//*  82  130:iload_1         
	//*  83  131:ifeq            150
		{
			if(Math.abs(f1) <= (float)mTouchSlop)
	//*  84  134:fload           4
	//*  85  136:invokestatic    #164 <Method float Math.abs(float)>
	//*  86  139:aload_0         
	//*  87  140:getfield        #139 <Field int mTouchSlop>
	//*  88  143:i2f             
	//*  89  144:fcmpl           
	//*  90  145:ifgt            14
				return false;
	//   91  148:iconst_0        
	//   92  149:ireturn         
		} else
		{
			return false;
	//   93  150:iconst_0        
	//   94  151:ireturn         
		}
		if(true) goto _L4; else goto _L6
_L6:
	}

	public boolean continueSettling(boolean flag)
	{
		if(mDragState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field int mDragState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          180
		{
			boolean flag2 = mScroller.computeScrollOffset();
	//    4    8:aload_0         
	//    5    9:getfield        #156 <Field OverScroller mScroller>
	//    6   12:invokevirtual   #475 <Method boolean OverScroller.computeScrollOffset()>
	//    7   15:istore          7
			int i = mScroller.getCurrX();
	//    8   17:aload_0         
	//    9   18:getfield        #156 <Field OverScroller mScroller>
	//   10   21:invokevirtual   #418 <Method int OverScroller.getCurrX()>
	//   11   24:istore_2        
			int j = mScroller.getCurrY();
	//   12   25:aload_0         
	//   13   26:getfield        #156 <Field OverScroller mScroller>
	//   14   29:invokevirtual   #421 <Method int OverScroller.getCurrY()>
	//   15   32:istore_3        
			int k = i - mCapturedView.getLeft();
	//   16   33:iload_2         
	//   17   34:aload_0         
	//   18   35:getfield        #260 <Field View mCapturedView>
	//   19   38:invokevirtual   #281 <Method int View.getLeft()>
	//   20   41:isub            
	//   21   42:istore          4
			int l = j - mCapturedView.getTop();
	//   22   44:iload_3         
	//   23   45:aload_0         
	//   24   46:getfield        #260 <Field View mCapturedView>
	//   25   49:invokevirtual   #284 <Method int View.getTop()>
	//   26   52:isub            
	//   27   53:istore          5
			if(k != 0)
	//*  28   55:iload           4
	//*  29   57:ifeq            69
				ViewCompat.offsetLeftAndRight(mCapturedView, k);
	//   30   60:aload_0         
	//   31   61:getfield        #260 <Field View mCapturedView>
	//   32   64:iload           4
	//   33   66:invokestatic    #294 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			if(l != 0)
	//*  34   69:iload           5
	//*  35   71:ifeq            83
				ViewCompat.offsetTopAndBottom(mCapturedView, l);
	//   36   74:aload_0         
	//   37   75:getfield        #260 <Field View mCapturedView>
	//   38   78:iload           5
	//   39   80:invokestatic    #300 <Method void ViewCompat.offsetTopAndBottom(View, int)>
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
	//   52  107:invokevirtual   #304 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
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
	//*  62  128:invokevirtual   #478 <Method int OverScroller.getFinalX()>
	//*  63  131:icmpne          159
				{
					flag1 = flag2;
	//   64  134:iload           7
	//   65  136:istore          6
					if(j == mScroller.getFinalY())
	//*  66  138:iload_3         
	//*  67  139:aload_0         
	//*  68  140:getfield        #156 <Field OverScroller mScroller>
	//*  69  143:invokevirtual   #481 <Method int OverScroller.getFinalY()>
	//*  70  146:icmpne          159
					{
						mScroller.abortAnimation();
	//   71  149:aload_0         
	//   72  150:getfield        #156 <Field OverScroller mScroller>
	//   73  153:invokevirtual   #316 <Method void OverScroller.abortAnimation()>
						flag1 = false;
	//   74  156:iconst_0        
	//   75  157:istore          6
					}
				}
			}
			if(!flag1)
	//*  76  159:iload           6
	//*  77  161:ifne            180
				if(flag)
	//*  78  164:iload_1         
	//*  79  165:ifeq            190
					mParentView.post(mSetIdleRunnable);
	//   80  168:aload_0         
	//   81  169:getfield        #104 <Field ViewGroup mParentView>
	//   82  172:aload_0         
	//   83  173:getfield        #93  <Field Runnable mSetIdleRunnable>
	//   84  176:invokevirtual   #485 <Method boolean ViewGroup.post(Runnable)>
	//   85  179:pop             
				else
	//*  86  180:aload_0         
	//*  87  181:getfield        #266 <Field int mDragState>
	//*  88  184:iconst_2        
	//*  89  185:icmpne          198
	//*  90  188:iconst_1        
	//*  91  189:ireturn         
					setDragState(0);
	//   92  190:aload_0         
	//   93  191:iconst_0        
	//   94  192:invokevirtual   #269 <Method void setDragState(int)>
		}
		return mDragState == 2;
	//   95  195:goto            180
	//   96  198:iconst_0        
	//   97  199:ireturn         
	}

	public View findTopChildUnder(int i, int j)
	{
		for(int k = mParentView.getChildCount() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field ViewGroup mParentView>
	//*   2    4:invokevirtual   #432 <Method int ViewGroup.getChildCount()>
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
	//   13   23:invokevirtual   #490 <Method int ViewDragHelper$Callback.getOrderedChildIndex(int)>
	//   14   26:invokevirtual   #436 <Method View ViewGroup.getChildAt(int)>
	//   15   29:astore          4
			if(i >= view.getLeft() && i < view.getRight() && j >= view.getTop() && j < view.getBottom())
	//*  16   31:iload_1         
	//*  17   32:aload           4
	//*  18   34:invokevirtual   #281 <Method int View.getLeft()>
	//*  19   37:icmplt          70
	//*  20   40:iload_1         
	//*  21   41:aload           4
	//*  22   43:invokevirtual   #437 <Method int View.getRight()>
	//*  23   46:icmpge          70
	//*  24   49:iload_2         
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #284 <Method int View.getTop()>
	//*  27   55:icmplt          70
	//*  28   58:iload_2         
	//*  29   59:aload           4
	//*  30   61:invokevirtual   #438 <Method int View.getBottom()>
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
	//    3    7:new             #493 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #495 <String "Cannot flingCapturedView outside of a call to Callback#onViewReleased">
	//    6   14:invokespecial   #496 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mScroller.fling(mCapturedView.getLeft(), mCapturedView.getTop(), (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId), i, k, j, l);
	//    8   18:aload_0         
	//    9   19:getfield        #156 <Field OverScroller mScroller>
	//   10   22:aload_0         
	//   11   23:getfield        #260 <Field View mCapturedView>
	//   12   26:invokevirtual   #281 <Method int View.getLeft()>
	//   13   29:aload_0         
	//   14   30:getfield        #260 <Field View mCapturedView>
	//   15   33:invokevirtual   #284 <Method int View.getTop()>
	//   16   36:aload_0         
	//   17   37:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   18   40:aload_0         
	//   19   41:getfield        #88  <Field int mActivePointerId>
	//   20   44:invokevirtual   #373 <Method float VelocityTracker.getXVelocity(int)>
	//   21   47:f2i             
	//   22   48:aload_0         
	//   23   49:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   24   52:aload_0         
	//   25   53:getfield        #88  <Field int mActivePointerId>
	//   26   56:invokevirtual   #378 <Method float VelocityTracker.getYVelocity(int)>
	//   27   59:f2i             
	//   28   60:iload_1         
	//   29   61:iload_3         
	//   30   62:iload_2         
	//   31   63:iload           4
	//   32   65:invokevirtual   #500 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
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
	//    5    7:invokevirtual   #513 <Method boolean isViewUnder(View, int, int)>
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
	//*  12   16:invokevirtual   #516 <Method boolean isEdgeTouched(int, int)>
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
		while(view == null || i < view.getLeft() || i >= view.getRight() || j < view.getTop() || j >= view.getBottom()) 
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	//    4    6:iload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #281 <Method int View.getLeft()>
	//    7   11:icmplt          4
	//    8   14:iload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #437 <Method int View.getRight()>
	//   11   19:icmpge          4
	//   12   22:iload_3         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #284 <Method int View.getTop()>
	//   15   27:icmplt          4
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #438 <Method int View.getBottom()>
	//   19   35:icmpge          4
		return true;
	//   20   38:iconst_1        
	//   21   39:ireturn         
	}

	public void processTouchEvent(MotionEvent motionevent)
	{
		int i;
		int j;
		j = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #520 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          7
		i = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #523 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          6
		if(j == 0)
	//*   6   12:iload           7
	//*   7   14:ifne            21
			cancel();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #415 <Method void cancel()>
		if(mVelocityTracker == null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//*  12   25:ifnonnull       35
			mVelocityTracker = VelocityTracker.obtain();
	//   13   28:aload_0         
	//   14   29:invokestatic    #527 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #363 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #530 <Method void VelocityTracker.addMovement(MotionEvent)>
		j;
	//   20   43:iload           7
		JVM INSTR tableswitch 0 6: default 88
	//	               0 89
	//	               1 661
	//	               2 278
	//	               3 678
	//	               4 88
	//	               5 167
	//	               6 522;
	//   21   45:tableswitch     0 6: default 88
	//	               0 89
	//	               1 661
	//	               2 278
	//	               3 678
	//	               4 88
	//	               5 167
	//	               6 522
		   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L3:
		break MISSING_BLOCK_LABEL_661;
_L1:
		break; /* Loop/switch isn't completed */
_L5:
		break MISSING_BLOCK_LABEL_678;
_L9:
		return;
	//   22   88:return          
_L2:
		float f = motionevent.getX();
	//   23   89:aload_1         
	//   24   90:invokevirtual   #532 <Method float MotionEvent.getX()>
	//   25   93:fstore_2        
		float f2 = motionevent.getY();
	//   26   94:aload_1         
	//   27   95:invokevirtual   #534 <Method float MotionEvent.getY()>
	//   28   98:fstore_3        
		i = motionevent.getPointerId(0);
	//   29   99:aload_1         
	//   30  100:iconst_0        
	//   31  101:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//   32  104:istore          6
		motionevent = ((MotionEvent) (findTopChildUnder((int)f, (int)f2)));
	//   33  106:aload_0         
	//   34  107:fload_2         
	//   35  108:f2i             
	//   36  109:fload_3         
	//   37  110:f2i             
	//   38  111:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//   39  114:astore_1        
		saveInitialMotion(f, f2, i);
	//   40  115:aload_0         
	//   41  116:fload_2         
	//   42  117:fload_3         
	//   43  118:iload           6
	//   44  120:invokespecial   #538 <Method void saveInitialMotion(float, float, int)>
		tryCaptureViewForDrag(((View) (motionevent)), i);
	//   45  123:aload_0         
	//   46  124:aload_1         
	//   47  125:iload           6
	//   48  127:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//   49  130:pop             
		j = mInitialEdgesTouched[i];
	//   50  131:aload_0         
	//   51  132:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   52  135:iload           6
	//   53  137:iaload          
	//   54  138:istore          7
		if((mTrackingEdges & j) != 0)
	//*  55  140:aload_0         
	//*  56  141:getfield        #168 <Field int mTrackingEdges>
	//*  57  144:iload           7
	//*  58  146:iand            
	//*  59  147:ifeq            88
		{
			mCallback.onEdgeTouched(mTrackingEdges & j, i);
	//   60  150:aload_0         
	//   61  151:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   62  154:aload_0         
	//   63  155:getfield        #168 <Field int mTrackingEdges>
	//   64  158:iload           7
	//   65  160:iand            
	//   66  161:iload           6
	//   67  163:invokevirtual   #545 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
			return;
	//   68  166:return          
		}
		continue; /* Loop/switch isn't completed */
_L6:
		float f1;
		float f3;
		j = motionevent.getPointerId(i);
	//   69  167:aload_1         
	//   70  168:iload           6
	//   71  170:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//   72  173:istore          7
		f1 = motionevent.getX(i);
	//   73  175:aload_1         
	//   74  176:iload           6
	//   75  178:invokevirtual   #408 <Method float MotionEvent.getX(int)>
	//   76  181:fstore_2        
		f3 = motionevent.getY(i);
	//   77  182:aload_1         
	//   78  183:iload           6
	//   79  185:invokevirtual   #411 <Method float MotionEvent.getY(int)>
	//   80  188:fstore_3        
		saveInitialMotion(f1, f3, j);
	//   81  189:aload_0         
	//   82  190:fload_2         
	//   83  191:fload_3         
	//   84  192:iload           7
	//   85  194:invokespecial   #538 <Method void saveInitialMotion(float, float, int)>
		if(mDragState != 0)
			continue; /* Loop/switch isn't completed */
	//   86  197:aload_0         
	//   87  198:getfield        #266 <Field int mDragState>
	//   88  201:ifne            255
		tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f3), j);
	//   89  204:aload_0         
	//   90  205:aload_0         
	//   91  206:fload_2         
	//   92  207:f2i             
	//   93  208:fload_3         
	//   94  209:f2i             
	//   95  210:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//   96  213:iload           7
	//   97  215:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//   98  218:pop             
		i = mInitialEdgesTouched[j];
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
	//* 108  235:ifeq            88
		{
			mCallback.onEdgeTouched(mTrackingEdges & i, j);
	//  109  238:aload_0         
	//  110  239:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  111  242:aload_0         
	//  112  243:getfield        #168 <Field int mTrackingEdges>
	//  113  246:iload           6
	//  114  248:iand            
	//  115  249:iload           7
	//  116  251:invokevirtual   #545 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
			return;
	//  117  254:return          
		}
		continue; /* Loop/switch isn't completed */
		if(!isCapturedViewUnder((int)f1, (int)f3)) goto _L9; else goto _L8
	//  118  255:aload_0         
	//  119  256:fload_2         
	//  120  257:f2i             
	//  121  258:fload_3         
	//  122  259:f2i             
	//  123  260:invokevirtual   #547 <Method boolean isCapturedViewUnder(int, int)>
	//  124  263:ifeq            88
_L8:
		tryCaptureViewForDrag(mCapturedView, j);
	//  125  266:aload_0         
	//  126  267:aload_0         
	//  127  268:getfield        #260 <Field View mCapturedView>
	//  128  271:iload           7
	//  129  273:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//  130  276:pop             
		return;
	//  131  277:return          
_L4:
		if(mDragState != 1)
			break; /* Loop/switch isn't completed */
	//  132  278:aload_0         
	//  133  279:getfield        #266 <Field int mDragState>
	//  134  282:iconst_1        
	//  135  283:icmpne          383
		if(isValidPointerForActionMove(mActivePointerId))
	//* 136  286:aload_0         
	//* 137  287:aload_0         
	//* 138  288:getfield        #88  <Field int mActivePointerId>
	//* 139  291:invokespecial   #405 <Method boolean isValidPointerForActionMove(int)>
	//* 140  294:ifeq            88
		{
			i = motionevent.findPointerIndex(mActivePointerId);
	//  141  297:aload_1         
	//  142  298:aload_0         
	//  143  299:getfield        #88  <Field int mActivePointerId>
	//  144  302:invokevirtual   #550 <Method int MotionEvent.findPointerIndex(int)>
	//  145  305:istore          6
			f1 = motionevent.getX(i);
	//  146  307:aload_1         
	//  147  308:iload           6
	//  148  310:invokevirtual   #408 <Method float MotionEvent.getX(int)>
	//  149  313:fstore_2        
			f3 = motionevent.getY(i);
	//  150  314:aload_1         
	//  151  315:iload           6
	//  152  317:invokevirtual   #411 <Method float MotionEvent.getY(int)>
	//  153  320:fstore_3        
			i = (int)(f1 - mLastMotionX[mActivePointerId]);
	//  154  321:fload_2         
	//  155  322:aload_0         
	//  156  323:getfield        #204 <Field float[] mLastMotionX>
	//  157  326:aload_0         
	//  158  327:getfield        #88  <Field int mActivePointerId>
	//  159  330:faload          
	//  160  331:fsub            
	//  161  332:f2i             
	//  162  333:istore          6
			j = (int)(f3 - mLastMotionY[mActivePointerId]);
	//  163  335:fload_3         
	//  164  336:aload_0         
	//  165  337:getfield        #206 <Field float[] mLastMotionY>
	//  166  340:aload_0         
	//  167  341:getfield        #88  <Field int mActivePointerId>
	//  168  344:faload          
	//  169  345:fsub            
	//  170  346:f2i             
	//  171  347:istore          7
			dragTo(mCapturedView.getLeft() + i, mCapturedView.getTop() + j, i, j);
	//  172  349:aload_0         
	//  173  350:aload_0         
	//  174  351:getfield        #260 <Field View mCapturedView>
	//  175  354:invokevirtual   #281 <Method int View.getLeft()>
	//  176  357:iload           6
	//  177  359:iadd            
	//  178  360:aload_0         
	//  179  361:getfield        #260 <Field View mCapturedView>
	//  180  364:invokevirtual   #284 <Method int View.getTop()>
	//  181  367:iload           7
	//  182  369:iadd            
	//  183  370:iload           6
	//  184  372:iload           7
	//  185  374:invokespecial   #552 <Method void dragTo(int, int, int, int)>
			saveLastMotion(motionevent);
	//  186  377:aload_0         
	//  187  378:aload_1         
	//  188  379:invokespecial   #554 <Method void saveLastMotion(MotionEvent)>
			return;
	//  189  382:return          
		}
		if(true) goto _L9; else goto _L10
_L10:
		j = motionevent.getPointerCount();
	//  190  383:aload_1         
	//  191  384:invokevirtual   #400 <Method int MotionEvent.getPointerCount()>
	//  192  387:istore          7
		i = 0;
	//  193  389:iconst_0        
	//  194  390:istore          6
_L15:
		if(i >= j) goto _L12; else goto _L11
	//  195  392:iload           6
	//  196  394:iload           7
	//  197  396:icmpge          479
_L11:
		int k = motionevent.getPointerId(i);
	//  198  399:aload_1         
	//  199  400:iload           6
	//  200  402:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//  201  405:istore          8
		if(isValidPointerForActionMove(k)) goto _L14; else goto _L13
	//  202  407:aload_0         
	//  203  408:iload           8
	//  204  410:invokespecial   #405 <Method boolean isValidPointerForActionMove(int)>
	//  205  413:ifne            425
_L13:
		i++;
	//  206  416:iload           6
	//  207  418:iconst_1        
	//  208  419:iadd            
	//  209  420:istore          6
		  goto _L15
	//* 210  422:goto            392
_L14:
		float f4;
		float f5;
		f1 = motionevent.getX(i);
	//  211  425:aload_1         
	//  212  426:iload           6
	//  213  428:invokevirtual   #408 <Method float MotionEvent.getX(int)>
	//  214  431:fstore_2        
		f3 = motionevent.getY(i);
	//  215  432:aload_1         
	//  216  433:iload           6
	//  217  435:invokevirtual   #411 <Method float MotionEvent.getY(int)>
	//  218  438:fstore_3        
		f4 = f1 - mInitialMotionX[k];
	//  219  439:fload_2         
	//  220  440:aload_0         
	//  221  441:getfield        #194 <Field float[] mInitialMotionX>
	//  222  444:iload           8
	//  223  446:faload          
	//  224  447:fsub            
	//  225  448:fstore          4
		f5 = f3 - mInitialMotionY[k];
	//  226  450:fload_3         
	//  227  451:aload_0         
	//  228  452:getfield        #202 <Field float[] mInitialMotionY>
	//  229  455:iload           8
	//  230  457:faload          
	//  231  458:fsub            
	//  232  459:fstore          5
		reportNewEdgeDrags(f4, f5, k);
	//  233  461:aload_0         
	//  234  462:fload           4
	//  235  464:fload           5
	//  236  466:iload           8
	//  237  468:invokespecial   #556 <Method void reportNewEdgeDrags(float, float, int)>
		if(mDragState != 1) goto _L16; else goto _L12
	//  238  471:aload_0         
	//  239  472:getfield        #266 <Field int mDragState>
	//  240  475:iconst_1        
	//  241  476:icmpne          485
_L12:
		saveLastMotion(motionevent);
	//  242  479:aload_0         
	//  243  480:aload_1         
	//  244  481:invokespecial   #554 <Method void saveLastMotion(MotionEvent)>
		return;
	//  245  484:return          
_L16:
		View view = findTopChildUnder((int)f1, (int)f3);
	//  246  485:aload_0         
	//  247  486:fload_2         
	//  248  487:f2i             
	//  249  488:fload_3         
	//  250  489:f2i             
	//  251  490:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  252  493:astore          11
		if(!checkTouchSlop(view, f4, f5) || !tryCaptureViewForDrag(view, k)) goto _L13; else goto _L12
	//  253  495:aload_0         
	//  254  496:aload           11
	//  255  498:fload           4
	//  256  500:fload           5
	//  257  502:invokespecial   #558 <Method boolean checkTouchSlop(View, float, float)>
	//  258  505:ifeq            416
	//  259  508:aload_0         
	//  260  509:aload           11
	//  261  511:iload           8
	//  262  513:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//  263  516:ifeq            416
	//* 264  519:goto            479
_L7:
		int l;
		int i1;
		l = motionevent.getPointerId(i);
	//  265  522:aload_1         
	//  266  523:iload           6
	//  267  525:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//  268  528:istore          9
		if(mDragState != 1 || l != mActivePointerId)
			break MISSING_BLOCK_LABEL_654;
	//  269  530:aload_0         
	//  270  531:getfield        #266 <Field int mDragState>
	//  271  534:iconst_1        
	//  272  535:icmpne          654
	//  273  538:iload           9
	//  274  540:aload_0         
	//  275  541:getfield        #88  <Field int mActivePointerId>
	//  276  544:icmpne          654
		k = -1;
	//  277  547:iconst_m1       
	//  278  548:istore          8
		i1 = motionevent.getPointerCount();
	//  279  550:aload_1         
	//  280  551:invokevirtual   #400 <Method int MotionEvent.getPointerCount()>
	//  281  554:istore          10
		i = 0;
	//  282  556:iconst_0        
	//  283  557:istore          6
_L18:
		j = k;
	//  284  559:iload           8
	//  285  561:istore          7
		if(i >= i1)
			break MISSING_BLOCK_LABEL_644;
	//  286  563:iload           6
	//  287  565:iload           10
	//  288  567:icmpge          644
		j = motionevent.getPointerId(i);
	//  289  570:aload_1         
	//  290  571:iload           6
	//  291  573:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//  292  576:istore          7
		if(j != mActivePointerId)
			break; /* Loop/switch isn't completed */
	//  293  578:iload           7
	//  294  580:aload_0         
	//  295  581:getfield        #88  <Field int mActivePointerId>
	//  296  584:icmpne          596
_L20:
		i++;
	//  297  587:iload           6
	//  298  589:iconst_1        
	//  299  590:iadd            
	//  300  591:istore          6
		if(true) goto _L18; else goto _L17
	//  301  593:goto            559
_L17:
		f1 = motionevent.getX(i);
	//  302  596:aload_1         
	//  303  597:iload           6
	//  304  599:invokevirtual   #408 <Method float MotionEvent.getX(int)>
	//  305  602:fstore_2        
		f3 = motionevent.getY(i);
	//  306  603:aload_1         
	//  307  604:iload           6
	//  308  606:invokevirtual   #411 <Method float MotionEvent.getY(int)>
	//  309  609:fstore_3        
		if(findTopChildUnder((int)f1, (int)f3) != mCapturedView || !tryCaptureViewForDrag(mCapturedView, j)) goto _L20; else goto _L19
	//  310  610:aload_0         
	//  311  611:fload_2         
	//  312  612:f2i             
	//  313  613:fload_3         
	//  314  614:f2i             
	//  315  615:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  316  618:aload_0         
	//  317  619:getfield        #260 <Field View mCapturedView>
	//  318  622:if_acmpne       587
	//  319  625:aload_0         
	//  320  626:aload_0         
	//  321  627:getfield        #260 <Field View mCapturedView>
	//  322  630:iload           7
	//  323  632:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//  324  635:ifeq            587
_L19:
		j = mActivePointerId;
	//  325  638:aload_0         
	//  326  639:getfield        #88  <Field int mActivePointerId>
	//  327  642:istore          7
		if(j == -1)
	//* 328  644:iload           7
	//* 329  646:iconst_m1       
	//* 330  647:icmpne          654
			releaseViewForPointerUp();
	//  331  650:aload_0         
	//  332  651:invokespecial   #560 <Method void releaseViewForPointerUp()>
		clearMotionHistory(l);
	//  333  654:aload_0         
	//  334  655:iload           9
	//  335  657:invokespecial   #562 <Method void clearMotionHistory(int)>
		return;
	//  336  660:return          
		if(mDragState == 1)
	//* 337  661:aload_0         
	//* 338  662:getfield        #266 <Field int mDragState>
	//* 339  665:iconst_1        
	//* 340  666:icmpne          673
			releaseViewForPointerUp();
	//  341  669:aload_0         
	//  342  670:invokespecial   #560 <Method void releaseViewForPointerUp()>
		cancel();
	//  343  673:aload_0         
	//  344  674:invokevirtual   #415 <Method void cancel()>
		return;
	//  345  677:return          
		if(mDragState == 1)
	//* 346  678:aload_0         
	//* 347  679:getfield        #266 <Field int mDragState>
	//* 348  682:iconst_1        
	//* 349  683:icmpne          692
			dispatchViewReleased(0.0F, 0.0F);
	//  350  686:aload_0         
	//  351  687:fconst_0        
	//  352  688:fconst_0        
	//  353  689:invokespecial   #380 <Method void dispatchViewReleased(float, float)>
		cancel();
	//  354  692:aload_0         
	//  355  693:invokevirtual   #415 <Method void cancel()>
		return;
	//  356  696:return          
	}

	void setDragState(int i)
	{
		mParentView.removeCallbacks(mSetIdleRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ViewGroup mParentView>
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field Runnable mSetIdleRunnable>
	//    4    8:invokevirtual   #565 <Method boolean ViewGroup.removeCallbacks(Runnable)>
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
	//   16   30:invokevirtual   #568 <Method void ViewDragHelper$Callback.onViewDragStateChanged(int)>
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
	//    3    7:new             #493 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #574 <String "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased">
	//    6   14:invokespecial   #496 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return forceSettleCapturedViewAt(i, j, (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId));
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:iload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   13   25:aload_0         
	//   14   26:getfield        #88  <Field int mActivePointerId>
	//   15   29:invokevirtual   #373 <Method float VelocityTracker.getXVelocity(int)>
	//   16   32:f2i             
	//   17   33:aload_0         
	//   18   34:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   19   37:aload_0         
	//   20   38:getfield        #88  <Field int mActivePointerId>
	//   21   41:invokevirtual   #378 <Method float VelocityTracker.getYVelocity(int)>
	//   22   44:f2i             
	//   23   45:invokespecial   #576 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
	//   24   48:ireturn         
	}

	public boolean shouldInterceptTouchEvent(MotionEvent motionevent)
	{
		int i;
		int j;
		j = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #520 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          7
		i = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #523 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          6
		if(j == 0)
	//*   6   12:iload           7
	//*   7   14:ifne            21
			cancel();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #415 <Method void cancel()>
		if(mVelocityTracker == null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//*  12   25:ifnonnull       35
			mVelocityTracker = VelocityTracker.obtain();
	//   13   28:aload_0         
	//   14   29:invokestatic    #527 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #363 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #363 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #530 <Method void VelocityTracker.addMovement(MotionEvent)>
		j;
	//   20   43:iload           7
		JVM INSTR tableswitch 0 6: default 88
	//	               0 98
	//	               1 615
	//	               2 305
	//	               3 615
	//	               4 88
	//	               5 194
	//	               6 602;
	//   21   45:tableswitch     0 6: default 88
	//	               0 98
	//	               1 615
	//	               2 305
	//	               3 615
	//	               4 88
	//	               5 194
	//	               6 602
		   goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
		break; /* Loop/switch isn't completed */
_L3:
		break MISSING_BLOCK_LABEL_615;
_L7:
		float f;
		float f3;
		float f6;
		float f7;
		int k;
		int l;
		View view;
		return mDragState == 1;
	//   22   88:aload_0         
	//   23   89:getfield        #266 <Field int mDragState>
	//   24   92:iconst_1        
	//   25   93:icmpne          622
	//   26   96:iconst_1        
	//   27   97:ireturn         
	//   28   98:aload_1         
	//   29   99:invokevirtual   #532 <Method float MotionEvent.getX()>
	//   30  102:fstore_2        
	//   31  103:aload_1         
	//   32  104:invokevirtual   #534 <Method float MotionEvent.getY()>
	//   33  107:fstore_3        
	//   34  108:aload_1         
	//   35  109:iconst_0        
	//   36  110:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//   37  113:istore          6
	//   38  115:aload_0         
	//   39  116:fload_2         
	//   40  117:fload_3         
	//   41  118:iload           6
	//   42  120:invokespecial   #538 <Method void saveInitialMotion(float, float, int)>
	//   43  123:aload_0         
	//   44  124:fload_2         
	//   45  125:f2i             
	//   46  126:fload_3         
	//   47  127:f2i             
	//   48  128:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//   49  131:astore_1        
	//   50  132:aload_1         
	//   51  133:aload_0         
	//   52  134:getfield        #260 <Field View mCapturedView>
	//   53  137:if_acmpne       156
	//   54  140:aload_0         
	//   55  141:getfield        #266 <Field int mDragState>
	//   56  144:iconst_2        
	//   57  145:icmpne          156
	//   58  148:aload_0         
	//   59  149:aload_1         
	//   60  150:iload           6
	//   61  152:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//   62  155:pop             
	//   63  156:aload_0         
	//   64  157:getfield        #166 <Field int[] mInitialEdgesTouched>
	//   65  160:iload           6
	//   66  162:iaload          
	//   67  163:istore          7
	//   68  165:aload_0         
	//   69  166:getfield        #168 <Field int mTrackingEdges>
	//   70  169:iload           7
	//   71  171:iand            
	//   72  172:ifeq            88
	//   73  175:aload_0         
	//   74  176:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//   75  179:aload_0         
	//   76  180:getfield        #168 <Field int mTrackingEdges>
	//   77  183:iload           7
	//   78  185:iand            
	//   79  186:iload           6
	//   80  188:invokevirtual   #545 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
	//   81  191:goto            88
	//   82  194:aload_1         
	//   83  195:iload           6
	//   84  197:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//   85  200:istore          7
	//   86  202:aload_1         
	//   87  203:iload           6
	//   88  205:invokevirtual   #408 <Method float MotionEvent.getX(int)>
	//   89  208:fstore_2        
	//   90  209:aload_1         
	//   91  210:iload           6
	//   92  212:invokevirtual   #411 <Method float MotionEvent.getY(int)>
	//   93  215:fstore_3        
	//   94  216:aload_0         
	//   95  217:fload_2         
	//   96  218:fload_3         
	//   97  219:iload           7
	//   98  221:invokespecial   #538 <Method void saveInitialMotion(float, float, int)>
	//   99  224:aload_0         
	//  100  225:getfield        #266 <Field int mDragState>
	//  101  228:ifne            269
	//  102  231:aload_0         
	//  103  232:getfield        #166 <Field int[] mInitialEdgesTouched>
	//  104  235:iload           7
	//  105  237:iaload          
	//  106  238:istore          6
	//  107  240:aload_0         
	//  108  241:getfield        #168 <Field int mTrackingEdges>
	//  109  244:iload           6
	//  110  246:iand            
	//  111  247:ifeq            88
	//  112  250:aload_0         
	//  113  251:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  114  254:aload_0         
	//  115  255:getfield        #168 <Field int mTrackingEdges>
	//  116  258:iload           6
	//  117  260:iand            
	//  118  261:iload           7
	//  119  263:invokevirtual   #545 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
	//  120  266:goto            88
	//  121  269:aload_0         
	//  122  270:getfield        #266 <Field int mDragState>
	//  123  273:iconst_2        
	//  124  274:icmpne          88
	//  125  277:aload_0         
	//  126  278:fload_2         
	//  127  279:f2i             
	//  128  280:fload_3         
	//  129  281:f2i             
	//  130  282:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  131  285:astore_1        
	//  132  286:aload_1         
	//  133  287:aload_0         
	//  134  288:getfield        #260 <Field View mCapturedView>
	//  135  291:if_acmpne       88
	//  136  294:aload_0         
	//  137  295:aload_1         
	//  138  296:iload           7
	//  139  298:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//  140  301:pop             
	//  141  302:goto            88
	//  142  305:aload_0         
	//  143  306:getfield        #194 <Field float[] mInitialMotionX>
	//  144  309:ifnull          88
	//  145  312:aload_0         
	//  146  313:getfield        #202 <Field float[] mInitialMotionY>
	//  147  316:ifnull          88
	//  148  319:aload_1         
	//  149  320:invokevirtual   #400 <Method int MotionEvent.getPointerCount()>
	//  150  323:istore          8
	//  151  325:iconst_0        
	//  152  326:istore          6
	//  153  328:iload           6
	//  154  330:iload           8
	//  155  332:icmpge          551
	//  156  335:aload_1         
	//  157  336:iload           6
	//  158  338:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//  159  341:istore          9
	//  160  343:aload_0         
	//  161  344:iload           9
	//  162  346:invokespecial   #405 <Method boolean isValidPointerForActionMove(int)>
	//  163  349:ifne            361
	//  164  352:iload           6
	//  165  354:iconst_1        
	//  166  355:iadd            
	//  167  356:istore          6
	//  168  358:goto            328
	//  169  361:aload_1         
	//  170  362:iload           6
	//  171  364:invokevirtual   #408 <Method float MotionEvent.getX(int)>
	//  172  367:fstore_2        
	//  173  368:aload_1         
	//  174  369:iload           6
	//  175  371:invokevirtual   #411 <Method float MotionEvent.getY(int)>
	//  176  374:fstore_3        
	//  177  375:fload_2         
	//  178  376:aload_0         
	//  179  377:getfield        #194 <Field float[] mInitialMotionX>
	//  180  380:iload           9
	//  181  382:faload          
	//  182  383:fsub            
	//  183  384:fstore          4
	//  184  386:fload_3         
	//  185  387:aload_0         
	//  186  388:getfield        #202 <Field float[] mInitialMotionY>
	//  187  391:iload           9
	//  188  393:faload          
	//  189  394:fsub            
	//  190  395:fstore          5
	//  191  397:aload_0         
	//  192  398:fload_2         
	//  193  399:f2i             
	//  194  400:fload_3         
	//  195  401:f2i             
	//  196  402:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  197  405:astore          16
	//  198  407:aload           16
	//  199  409:ifnull          559
	//  200  412:aload_0         
	//  201  413:aload           16
	//  202  415:fload           4
	//  203  417:fload           5
	//  204  419:invokespecial   #558 <Method boolean checkTouchSlop(View, float, float)>
	//  205  422:ifeq            559
	//  206  425:iconst_1        
	//  207  426:istore          7
	//  208  428:iload           7
	//  209  430:ifeq            565
	//  210  433:aload           16
	//  211  435:invokevirtual   #281 <Method int View.getLeft()>
	//  212  438:istore          10
	//  213  440:fload           4
	//  214  442:f2i             
	//  215  443:istore          11
	//  216  445:aload_0         
	//  217  446:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  218  449:aload           16
	//  219  451:iload           10
	//  220  453:iload           11
	//  221  455:iadd            
	//  222  456:fload           4
	//  223  458:f2i             
	//  224  459:invokevirtual   #288 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//  225  462:istore          11
	//  226  464:aload           16
	//  227  466:invokevirtual   #284 <Method int View.getTop()>
	//  228  469:istore          12
	//  229  471:fload           5
	//  230  473:f2i             
	//  231  474:istore          13
	//  232  476:aload_0         
	//  233  477:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  234  480:aload           16
	//  235  482:iload           12
	//  236  484:iload           13
	//  237  486:iadd            
	//  238  487:fload           5
	//  239  489:f2i             
	//  240  490:invokevirtual   #297 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//  241  493:istore          13
	//  242  495:aload_0         
	//  243  496:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  244  499:aload           16
	//  245  501:invokevirtual   #182 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//  246  504:istore          14
	//  247  506:aload_0         
	//  248  507:getfield        #106 <Field ViewDragHelper$Callback mCallback>
	//  249  510:aload           16
	//  250  512:invokevirtual   #185 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//  251  515:istore          15
	//  252  517:iload           14
	//  253  519:ifeq            534
	//  254  522:iload           14
	//  255  524:ifle            565
	//  256  527:iload           11
	//  257  529:iload           10
	//  258  531:icmpne          565
	//  259  534:iload           15
	//  260  536:ifeq            551
	//  261  539:iload           15
	//  262  541:ifle            565
	//  263  544:iload           13
	//  264  546:iload           12
	//  265  548:icmpne          565
	//  266  551:aload_0         
	//  267  552:aload_1         
	//  268  553:invokespecial   #554 <Method void saveLastMotion(MotionEvent)>
	//  269  556:goto            88
	//  270  559:iconst_0        
	//  271  560:istore          7
	//  272  562:goto            428
	//  273  565:aload_0         
	//  274  566:fload           4
	//  275  568:fload           5
	//  276  570:iload           9
	//  277  572:invokespecial   #556 <Method void reportNewEdgeDrags(float, float, int)>
	//  278  575:aload_0         
	//  279  576:getfield        #266 <Field int mDragState>
	//  280  579:iconst_1        
	//  281  580:icmpeq          551
	//  282  583:iload           7
	//  283  585:ifeq            352
	//  284  588:aload_0         
	//  285  589:aload           16
	//  286  591:iload           9
	//  287  593:invokevirtual   #542 <Method boolean tryCaptureViewForDrag(View, int)>
	//  288  596:ifeq            352
	//  289  599:goto            551
	//  290  602:aload_0         
	//  291  603:aload_1         
	//  292  604:iload           6
	//  293  606:invokevirtual   #403 <Method int MotionEvent.getPointerId(int)>
	//  294  609:invokespecial   #562 <Method void clearMotionHistory(int)>
	//  295  612:goto            88
	//  296  615:aload_0         
	//  297  616:invokevirtual   #415 <Method void cancel()>
	//  298  619:goto            88
	//  299  622:iconst_0        
	//  300  623:ireturn         
_L2:
		f = motionevent.getX();
		f3 = motionevent.getY();
		i = motionevent.getPointerId(0);
		saveInitialMotion(f, f3, i);
		motionevent = ((MotionEvent) (findTopChildUnder((int)f, (int)f3)));
		if(motionevent == mCapturedView && mDragState == 2)
			tryCaptureViewForDrag(((View) (motionevent)), i);
		j = mInitialEdgesTouched[i];
		if((mTrackingEdges & j) != 0)
			mCallback.onEdgeTouched(mTrackingEdges & j, i);
		  goto _L7
_L5:
		j = motionevent.getPointerId(i);
		float f1 = motionevent.getX(i);
		float f4 = motionevent.getY(i);
		saveInitialMotion(f1, f4, j);
		if(mDragState == 0)
		{
			i = mInitialEdgesTouched[j];
			if((mTrackingEdges & i) != 0)
				mCallback.onEdgeTouched(mTrackingEdges & i, j);
		} else
		if(mDragState == 2)
		{
			motionevent = ((MotionEvent) (findTopChildUnder((int)f1, (int)f4)));
			if(motionevent == mCapturedView)
				tryCaptureViewForDrag(((View) (motionevent)), j);
		}
		  goto _L7
_L4:
		if(mInitialMotionX == null || mInitialMotionY == null) goto _L7; else goto _L8
_L8:
		k = motionevent.getPointerCount();
		i = 0;
_L13:
		if(i >= k) goto _L10; else goto _L9
_L9:
		l = motionevent.getPointerId(i);
		if(isValidPointerForActionMove(l)) goto _L12; else goto _L11
_L11:
		i++;
		  goto _L13
_L12:
		float f2 = motionevent.getX(i);
		float f5 = motionevent.getY(i);
		f6 = f2 - mInitialMotionX[l];
		f7 = f5 - mInitialMotionY[l];
		view = findTopChildUnder((int)f2, (int)f5);
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		if(view != null && checkTouchSlop(view, f6, f7))
			j = 1;
		else
			j = 0;
		if(!j) goto _L15; else goto _L14
_L14:
		i1 = view.getLeft();
		j1 = (int)f6;
		j1 = mCallback.clampViewPositionHorizontal(view, i1 + j1, (int)f6);
		k1 = view.getTop();
		l1 = (int)f7;
		l1 = mCallback.clampViewPositionVertical(view, k1 + l1, (int)f7);
		i2 = mCallback.getViewHorizontalDragRange(view);
		j2 = mCallback.getViewVerticalDragRange(view);
		if(i2 != 0 && (i2 <= 0 || j1 != i1) || j2 != 0 && (j2 <= 0 || l1 != k1)) goto _L15; else goto _L10
_L10:
		saveLastMotion(motionevent);
		  goto _L7
_L15:
		reportNewEdgeDrags(f6, f7, l);
		if(mDragState != 1 && (!j || !tryCaptureViewForDrag(view, l))) goto _L11; else goto _L10
_L6:
		clearMotionHistory(motionevent.getPointerId(i));
		  goto _L7
		cancel();
		  goto _L7
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
	//   11   15:invokespecial   #576 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
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
	//*  16   28:invokevirtual   #582 <Method boolean ViewDragHelper$Callback.tryCaptureView(View, int)>
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
	//   24   42:invokevirtual   #584 <Method void captureChildView(View, int)>
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
