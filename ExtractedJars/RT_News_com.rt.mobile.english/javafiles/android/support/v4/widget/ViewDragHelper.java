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
	//    1    1:invokespecial   #87  <Method void Object()>
		mActivePointerId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #89  <Field int mActivePointerId>
	//    5    9:aload_0         
	//    6   10:new             #8   <Class ViewDragHelper$2>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #92  <Method void ViewDragHelper$2(ViewDragHelper)>
	//   10   18:putfield        #94  <Field Runnable mSetIdleRunnable>
		if(viewgroup == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       35
			throw new IllegalArgumentException("Parent view may not be null");
	//   13   25:new             #96  <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #98  <String "Parent view may not be null">
	//   16   31:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
		if(callback == null)
	//*  18   35:aload_3         
	//*  19   36:ifnonnull       49
		{
			throw new IllegalArgumentException("Callback may not be null");
	//   20   39:new             #96  <Class IllegalArgumentException>
	//   21   42:dup             
	//   22   43:ldc1            #103 <String "Callback may not be null">
	//   23   45:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   24   48:athrow          
		} else
		{
			mParentView = viewgroup;
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:putfield        #105 <Field ViewGroup mParentView>
			mCallback = callback;
	//   28   54:aload_0         
	//   29   55:aload_3         
	//   30   56:putfield        #107 <Field ViewDragHelper$Callback mCallback>
			viewgroup = ((ViewGroup) (ViewConfiguration.get(context)));
	//   31   59:aload_1         
	//   32   60:invokestatic    #113 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   33   63:astore_2        
			mEdgeSize = (int)(20F * context.getResources().getDisplayMetrics().density + 0.5F);
	//   34   64:aload_0         
	//   35   65:ldc1            #114 <Float 20F>
	//   36   67:aload_1         
	//   37   68:invokevirtual   #120 <Method Resources Context.getResources()>
	//   38   71:invokevirtual   #126 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   39   74:getfield        #131 <Field float DisplayMetrics.density>
	//   40   77:fmul            
	//   41   78:ldc1            #132 <Float 0.5F>
	//   42   80:fadd            
	//   43   81:f2i             
	//   44   82:putfield        #134 <Field int mEdgeSize>
			mTouchSlop = ((ViewConfiguration) (viewgroup)).getScaledTouchSlop();
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:invokevirtual   #138 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   48   90:putfield        #140 <Field int mTouchSlop>
			mMaxVelocity = ((ViewConfiguration) (viewgroup)).getScaledMaximumFlingVelocity();
	//   49   93:aload_0         
	//   50   94:aload_2         
	//   51   95:invokevirtual   #143 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   52   98:i2f             
	//   53   99:putfield        #145 <Field float mMaxVelocity>
			mMinVelocity = ((ViewConfiguration) (viewgroup)).getScaledMinimumFlingVelocity();
	//   54  102:aload_0         
	//   55  103:aload_2         
	//   56  104:invokevirtual   #148 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   57  107:i2f             
	//   58  108:putfield        #150 <Field float mMinVelocity>
			mScroller = new OverScroller(context, sInterpolator);
	//   59  111:aload_0         
	//   60  112:new             #152 <Class OverScroller>
	//   61  115:dup             
	//   62  116:aload_1         
	//   63  117:getstatic       #83  <Field Interpolator sInterpolator>
	//   64  120:invokespecial   #155 <Method void OverScroller(Context, Interpolator)>
	//   65  123:putfield        #157 <Field OverScroller mScroller>
			return;
	//   66  126:return          
		}
	}

	private boolean checkNewEdgeDrag(float f, float f1, int i, int j)
	{
		f = Math.abs(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #166 <Method float Math.abs(float)>
	//    2    4:fstore_1        
		f1 = Math.abs(f1);
	//    3    5:fload_2         
	//    4    6:invokestatic    #166 <Method float Math.abs(float)>
	//    5    9:fstore_2        
		int k = mInitialEdgesTouched[i];
	//    6   10:aload_0         
	//    7   11:getfield        #168 <Field int[] mInitialEdgesTouched>
	//    8   14:iload_3         
	//    9   15:iaload          
	//   10   16:istore          5
		boolean flag1 = false;
	//   11   18:iconst_0        
	//   12   19:istore          7
		if((k & j) == j && (mTrackingEdges & j) != 0 && (mEdgeDragsLocked[i] & j) != j && (mEdgeDragsInProgress[i] & j) != j)
	//*  13   21:iload           5
	//*  14   23:iload           4
	//*  15   25:iand            
	//*  16   26:iload           4
	//*  17   28:icmpne          167
	//*  18   31:aload_0         
	//*  19   32:getfield        #170 <Field int mTrackingEdges>
	//*  20   35:iload           4
	//*  21   37:iand            
	//*  22   38:ifeq            167
	//*  23   41:aload_0         
	//*  24   42:getfield        #172 <Field int[] mEdgeDragsLocked>
	//*  25   45:iload_3         
	//*  26   46:iaload          
	//*  27   47:iload           4
	//*  28   49:iand            
	//*  29   50:iload           4
	//*  30   52:icmpeq          167
	//*  31   55:aload_0         
	//*  32   56:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//*  33   59:iload_3         
	//*  34   60:iaload          
	//*  35   61:iload           4
	//*  36   63:iand            
	//*  37   64:iload           4
	//*  38   66:icmpeq          167
		{
			if(f <= (float)mTouchSlop && f1 <= (float)mTouchSlop)
	//*  39   69:fload_1         
	//*  40   70:aload_0         
	//*  41   71:getfield        #140 <Field int mTouchSlop>
	//*  42   74:i2f             
	//*  43   75:fcmpg           
	//*  44   76:ifgt            91
	//*  45   79:fload_2         
	//*  46   80:aload_0         
	//*  47   81:getfield        #140 <Field int mTouchSlop>
	//*  48   84:i2f             
	//*  49   85:fcmpg           
	//*  50   86:ifgt            91
				return false;
	//   51   89:iconst_0        
	//   52   90:ireturn         
			if(f < f1 * 0.5F && mCallback.onEdgeLock(j))
	//*  53   91:fload_1         
	//*  54   92:fload_2         
	//*  55   93:ldc1            #132 <Float 0.5F>
	//*  56   95:fmul            
	//*  57   96:fcmpg           
	//*  58   97:ifge            131
	//*  59  100:aload_0         
	//*  60  101:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//*  61  104:iload           4
	//*  62  106:invokevirtual   #178 <Method boolean ViewDragHelper$Callback.onEdgeLock(int)>
	//*  63  109:ifeq            131
			{
				int ai[] = mEdgeDragsLocked;
	//   64  112:aload_0         
	//   65  113:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   66  116:astore          8
				ai[i] = ai[i] | j;
	//   67  118:aload           8
	//   68  120:iload_3         
	//   69  121:aload           8
	//   70  123:iload_3         
	//   71  124:iaload          
	//   72  125:iload           4
	//   73  127:ior             
	//   74  128:iastore         
				return false;
	//   75  129:iconst_0        
	//   76  130:ireturn         
			}
			boolean flag = flag1;
	//   77  131:iload           7
	//   78  133:istore          6
			if((mEdgeDragsInProgress[i] & j) == 0)
	//*  79  135:aload_0         
	//*  80  136:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//*  81  139:iload_3         
	//*  82  140:iaload          
	//*  83  141:iload           4
	//*  84  143:iand            
	//*  85  144:ifne            164
			{
				flag = flag1;
	//   86  147:iload           7
	//   87  149:istore          6
				if(f > (float)mTouchSlop)
	//*  88  151:fload_1         
	//*  89  152:aload_0         
	//*  90  153:getfield        #140 <Field int mTouchSlop>
	//*  91  156:i2f             
	//*  92  157:fcmpl           
	//*  93  158:ifle            164
					flag = true;
	//   94  161:iconst_1        
	//   95  162:istore          6
			}
			return flag;
	//   96  164:iload           6
	//   97  166:ireturn         
		} else
		{
			return false;
	//   98  167:iconst_0        
	//   99  168:ireturn         
		}
	}

	private boolean checkTouchSlop(View view, float f, float f1)
	{
		boolean flag5 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		boolean flag6 = false;
	//    2    3:iconst_0        
	//    3    4:istore          8
		boolean flag2 = false;
	//    4    6:iconst_0        
	//    5    7:istore          6
		if(view == null)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       15
			return false;
	//    8   13:iconst_0        
	//    9   14:ireturn         
		boolean flag;
		if(mCallback.getViewHorizontalDragRange(view) > 0)
	//*  10   15:aload_0         
	//*  11   16:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//*  12   19:aload_1         
	//*  13   20:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//*  14   23:ifle            32
			flag = true;
	//   15   26:iconst_1        
	//   16   27:istore          4
		else
	//*  17   29:goto            35
			flag = false;
	//   18   32:iconst_0        
	//   19   33:istore          4
		boolean flag1;
		if(mCallback.getViewVerticalDragRange(view) > 0)
	//*  20   35:aload_0         
	//*  21   36:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//*  22   39:aload_1         
	//*  23   40:invokevirtual   #187 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//*  24   43:ifle            52
			flag1 = true;
	//   25   46:iconst_1        
	//   26   47:istore          5
		else
	//*  27   49:goto            55
			flag1 = false;
	//   28   52:iconst_0        
	//   29   53:istore          5
		if(flag && flag1)
	//*  30   55:iload           4
	//*  31   57:ifeq            92
	//*  32   60:iload           5
	//*  33   62:ifeq            92
		{
			if(f * f + f1 * f1 > (float)(mTouchSlop * mTouchSlop))
	//*  34   65:fload_2         
	//*  35   66:fload_2         
	//*  36   67:fmul            
	//*  37   68:fload_3         
	//*  38   69:fload_3         
	//*  39   70:fmul            
	//*  40   71:fadd            
	//*  41   72:aload_0         
	//*  42   73:getfield        #140 <Field int mTouchSlop>
	//*  43   76:aload_0         
	//*  44   77:getfield        #140 <Field int mTouchSlop>
	//*  45   80:imul            
	//*  46   81:i2f             
	//*  47   82:fcmpl           
	//*  48   83:ifle            89
				flag2 = true;
	//   49   86:iconst_1        
	//   50   87:istore          6
			return flag2;
	//   51   89:iload           6
	//   52   91:ireturn         
		}
		if(flag)
	//*  53   92:iload           4
	//*  54   94:ifeq            120
		{
			boolean flag3 = flag5;
	//   55   97:iload           7
	//   56   99:istore          6
			if(Math.abs(f) > (float)mTouchSlop)
	//*  57  101:fload_2         
	//*  58  102:invokestatic    #166 <Method float Math.abs(float)>
	//*  59  105:aload_0         
	//*  60  106:getfield        #140 <Field int mTouchSlop>
	//*  61  109:i2f             
	//*  62  110:fcmpl           
	//*  63  111:ifle            117
				flag3 = true;
	//   64  114:iconst_1        
	//   65  115:istore          6
			return flag3;
	//   66  117:iload           6
	//   67  119:ireturn         
		}
		if(flag1)
	//*  68  120:iload           5
	//*  69  122:ifeq            148
		{
			boolean flag4 = flag6;
	//   70  125:iload           8
	//   71  127:istore          6
			if(Math.abs(f1) > (float)mTouchSlop)
	//*  72  129:fload_3         
	//*  73  130:invokestatic    #166 <Method float Math.abs(float)>
	//*  74  133:aload_0         
	//*  75  134:getfield        #140 <Field int mTouchSlop>
	//*  76  137:i2f             
	//*  77  138:fcmpl           
	//*  78  139:ifle            145
				flag4 = true;
	//   79  142:iconst_1        
	//   80  143:istore          6
			return flag4;
	//   81  145:iload           6
	//   82  147:ireturn         
		} else
		{
			return false;
	//   83  148:iconst_0        
	//   84  149:ireturn         
		}
	}

	private float clampMag(float f, float f1, float f2)
	{
		float f3 = Math.abs(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #166 <Method float Math.abs(float)>
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
	//    1    1:invokestatic    #193 <Method int Math.abs(int)>
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
	//*   1    1:getfield        #196 <Field float[] mInitialMotionX>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			Arrays.fill(mInitialMotionX, 0.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #196 <Field float[] mInitialMotionX>
	//    6   12:fconst_0        
	//    7   13:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mInitialMotionY, 0.0F);
	//    8   16:aload_0         
	//    9   17:getfield        #204 <Field float[] mInitialMotionY>
	//   10   20:fconst_0        
	//   11   21:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mLastMotionX, 0.0F);
	//   12   24:aload_0         
	//   13   25:getfield        #206 <Field float[] mLastMotionX>
	//   14   28:fconst_0        
	//   15   29:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mLastMotionY, 0.0F);
	//   16   32:aload_0         
	//   17   33:getfield        #208 <Field float[] mLastMotionY>
	//   18   36:fconst_0        
	//   19   37:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mInitialEdgesTouched, 0);
	//   20   40:aload_0         
	//   21   41:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   22   44:iconst_0        
	//   23   45:invokestatic    #211 <Method void Arrays.fill(int[], int)>
			Arrays.fill(mEdgeDragsInProgress, 0);
	//   24   48:aload_0         
	//   25   49:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//   26   52:iconst_0        
	//   27   53:invokestatic    #211 <Method void Arrays.fill(int[], int)>
			Arrays.fill(mEdgeDragsLocked, 0);
	//   28   56:aload_0         
	//   29   57:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   30   60:iconst_0        
	//   31   61:invokestatic    #211 <Method void Arrays.fill(int[], int)>
			mPointersDown = 0;
	//   32   64:aload_0         
	//   33   65:iconst_0        
	//   34   66:putfield        #213 <Field int mPointersDown>
			return;
	//   35   69:return          
		}
	}

	private void clearMotionHistory(int i)
	{
		if(mInitialMotionX != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field float[] mInitialMotionX>
	//*   2    4:ifnull          80
		{
			if(!isPointerDown(i))
	//*   3    7:aload_0         
	//*   4    8:iload_1         
	//*   5    9:invokevirtual   #217 <Method boolean isPointerDown(int)>
	//*   6   12:ifne            16
			{
				return;
	//    7   15:return          
			} else
			{
				mInitialMotionX[i] = 0.0F;
	//    8   16:aload_0         
	//    9   17:getfield        #196 <Field float[] mInitialMotionX>
	//   10   20:iload_1         
	//   11   21:fconst_0        
	//   12   22:fastore         
				mInitialMotionY[i] = 0.0F;
	//   13   23:aload_0         
	//   14   24:getfield        #204 <Field float[] mInitialMotionY>
	//   15   27:iload_1         
	//   16   28:fconst_0        
	//   17   29:fastore         
				mLastMotionX[i] = 0.0F;
	//   18   30:aload_0         
	//   19   31:getfield        #206 <Field float[] mLastMotionX>
	//   20   34:iload_1         
	//   21   35:fconst_0        
	//   22   36:fastore         
				mLastMotionY[i] = 0.0F;
	//   23   37:aload_0         
	//   24   38:getfield        #208 <Field float[] mLastMotionY>
	//   25   41:iload_1         
	//   26   42:fconst_0        
	//   27   43:fastore         
				mInitialEdgesTouched[i] = 0;
	//   28   44:aload_0         
	//   29   45:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   30   48:iload_1         
	//   31   49:iconst_0        
	//   32   50:iastore         
				mEdgeDragsInProgress[i] = 0;
	//   33   51:aload_0         
	//   34   52:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//   35   55:iload_1         
	//   36   56:iconst_0        
	//   37   57:iastore         
				mEdgeDragsLocked[i] = 0;
	//   38   58:aload_0         
	//   39   59:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   40   62:iload_1         
	//   41   63:iconst_0        
	//   42   64:iastore         
				mPointersDown = ~(1 << i) & mPointersDown;
	//   43   65:aload_0         
	//   44   66:iconst_1        
	//   45   67:iload_1         
	//   46   68:ishl            
	//   47   69:iconst_m1       
	//   48   70:ixor            
	//   49   71:aload_0         
	//   50   72:getfield        #213 <Field int mPointersDown>
	//   51   75:iand            
	//   52   76:putfield        #213 <Field int mPointersDown>
				return;
	//   53   79:return          
			}
		} else
		{
			return;
	//   54   80:return          
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
	//    5    7:getfield        #105 <Field ViewGroup mParentView>
	//    6   10:invokevirtual   #223 <Method int ViewGroup.getWidth()>
	//    7   13:istore          6
		int i1 = l / 2;
	//    8   15:iload           6
	//    9   17:iconst_2        
	//   10   18:idiv            
	//   11   19:istore          7
		float f1 = Math.min(1.0F, (float)Math.abs(i) / (float)l);
	//   12   21:fconst_1        
	//   13   22:iload_1         
	//   14   23:invokestatic    #193 <Method int Math.abs(int)>
	//   15   26:i2f             
	//   16   27:iload           6
	//   17   29:i2f             
	//   18   30:fdiv            
	//   19   31:invokestatic    #227 <Method float Math.min(float, float)>
	//   20   34:fstore          5
		float f = i1;
	//   21   36:iload           7
	//   22   38:i2f             
	//   23   39:fstore          4
		f1 = distanceInfluenceForSnapDuration(f1);
	//   24   41:aload_0         
	//   25   42:fload           5
	//   26   44:invokespecial   #230 <Method float distanceInfluenceForSnapDuration(float)>
	//   27   47:fstore          5
		j = Math.abs(j);
	//   28   49:iload_2         
	//   29   50:invokestatic    #193 <Method int Math.abs(int)>
	//   30   53:istore_2        
		if(j > 0)
	//*  31   54:iload_2         
	//*  32   55:ifle            84
			i = 4 * Math.round(1000F * Math.abs((f + f1 * f) / (float)j));
	//   33   58:iconst_4        
	//   34   59:ldc1            #231 <Float 1000F>
	//   35   61:fload           4
	//   36   63:fload           5
	//   37   65:fload           4
	//   38   67:fmul            
	//   39   68:fadd            
	//   40   69:iload_2         
	//   41   70:i2f             
	//   42   71:fdiv            
	//   43   72:invokestatic    #166 <Method float Math.abs(float)>
	//   44   75:fmul            
	//   45   76:invokestatic    #235 <Method int Math.round(float)>
	//   46   79:imul            
	//   47   80:istore_1        
		else
	//*  48   81:goto            99
			i = (int)(((float)Math.abs(i) / (float)k + 1.0F) * 256F);
	//   49   84:iload_1         
	//   50   85:invokestatic    #193 <Method int Math.abs(int)>
	//   51   88:i2f             
	//   52   89:iload_3         
	//   53   90:i2f             
	//   54   91:fdiv            
	//   55   92:fconst_1        
	//   56   93:fadd            
	//   57   94:ldc1            #236 <Float 256F>
	//   58   96:fmul            
	//   59   97:f2i             
	//   60   98:istore_1        
		return Math.min(i, 600);
	//   61   99:iload_1         
	//   62  100:sipush          600
	//   63  103:invokestatic    #239 <Method int Math.min(int, int)>
	//   64  106:ireturn         
	}

	private int computeSettleDuration(View view, int i, int j, int k, int l)
	{
		k = clampMag(k, (int)mMinVelocity, (int)mMaxVelocity);
	//    0    0:aload_0         
	//    1    1:iload           4
	//    2    3:aload_0         
	//    3    4:getfield        #150 <Field float mMinVelocity>
	//    4    7:f2i             
	//    5    8:aload_0         
	//    6    9:getfield        #145 <Field float mMaxVelocity>
	//    7   12:f2i             
	//    8   13:invokespecial   #243 <Method int clampMag(int, int, int)>
	//    9   16:istore          4
		l = clampMag(l, (int)mMinVelocity, (int)mMaxVelocity);
	//   10   18:aload_0         
	//   11   19:iload           5
	//   12   21:aload_0         
	//   13   22:getfield        #150 <Field float mMinVelocity>
	//   14   25:f2i             
	//   15   26:aload_0         
	//   16   27:getfield        #145 <Field float mMaxVelocity>
	//   17   30:f2i             
	//   18   31:invokespecial   #243 <Method int clampMag(int, int, int)>
	//   19   34:istore          5
		int i1 = Math.abs(i);
	//   20   36:iload_2         
	//   21   37:invokestatic    #193 <Method int Math.abs(int)>
	//   22   40:istore          9
		int j1 = Math.abs(j);
	//   23   42:iload_3         
	//   24   43:invokestatic    #193 <Method int Math.abs(int)>
	//   25   46:istore          10
		int k1 = Math.abs(k);
	//   26   48:iload           4
	//   27   50:invokestatic    #193 <Method int Math.abs(int)>
	//   28   53:istore          11
		int l1 = Math.abs(l);
	//   29   55:iload           5
	//   30   57:invokestatic    #193 <Method int Math.abs(int)>
	//   31   60:istore          12
		int i2 = k1 + l1;
	//   32   62:iload           11
	//   33   64:iload           12
	//   34   66:iadd            
	//   35   67:istore          13
		int j2 = i1 + j1;
	//   36   69:iload           9
	//   37   71:iload           10
	//   38   73:iadd            
	//   39   74:istore          14
		float f;
		float f1;
		float f2;
		if(k != 0)
	//*  40   76:iload           4
	//*  41   78:ifeq            101
		{
			f = k1;
	//   42   81:iload           11
	//   43   83:i2f             
	//   44   84:fstore          6
			f1 = i2;
	//   45   86:iload           13
	//   46   88:i2f             
	//   47   89:fstore          7
		} else
	//*  48   91:fload           6
	//*  49   93:fload           7
	//*  50   95:fdiv            
	//*  51   96:fstore          8
	//*  52   98:goto            114
		{
			f = i1;
	//   53  101:iload           9
	//   54  103:i2f             
	//   55  104:fstore          6
			f1 = j2;
	//   56  106:iload           14
	//   57  108:i2f             
	//   58  109:fstore          7
		}
		f2 = f / f1;
	//*  59  111:goto            91
		if(l != 0)
	//*  60  114:iload           5
	//*  61  116:ifeq            139
		{
			f = l1;
	//   62  119:iload           12
	//   63  121:i2f             
	//   64  122:fstore          6
			f1 = i2;
	//   65  124:iload           13
	//   66  126:i2f             
	//   67  127:fstore          7
		} else
	//*  68  129:fload           6
	//*  69  131:fload           7
	//*  70  133:fdiv            
	//*  71  134:fstore          6
	//*  72  136:goto            152
		{
			f = j1;
	//   73  139:iload           10
	//   74  141:i2f             
	//   75  142:fstore          6
			f1 = j2;
	//   76  144:iload           14
	//   77  146:i2f             
	//   78  147:fstore          7
		}
		f /= f1;
	//*  79  149:goto            129
		i = computeAxisDuration(i, k, mCallback.getViewHorizontalDragRange(view));
	//   80  152:aload_0         
	//   81  153:iload_2         
	//   82  154:iload           4
	//   83  156:aload_0         
	//   84  157:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   85  160:aload_1         
	//   86  161:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//   87  164:invokespecial   #245 <Method int computeAxisDuration(int, int, int)>
	//   88  167:istore_2        
		j = computeAxisDuration(j, l, mCallback.getViewVerticalDragRange(view));
	//   89  168:aload_0         
	//   90  169:iload_3         
	//   91  170:iload           5
	//   92  172:aload_0         
	//   93  173:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   94  176:aload_1         
	//   95  177:invokevirtual   #187 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//   96  180:invokespecial   #245 <Method int computeAxisDuration(int, int, int)>
	//   97  183:istore_3        
		return (int)((float)i * f2 + (float)j * f);
	//   98  184:iload_2         
	//   99  185:i2f             
	//  100  186:fload           8
	//  101  188:fmul            
	//  102  189:iload_3         
	//  103  190:i2f             
	//  104  191:fload           6
	//  105  193:fmul            
	//  106  194:fadd            
	//  107  195:f2i             
	//  108  196:ireturn         
	}

	public static ViewDragHelper create(ViewGroup viewgroup, float f, Callback callback)
	{
		viewgroup = ((ViewGroup) (create(viewgroup, callback)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #250 <Method ViewDragHelper create(ViewGroup, ViewDragHelper$Callback)>
	//    3    5:astore_0        
		viewgroup.mTouchSlop = (int)((float)((ViewDragHelper) (viewgroup)).mTouchSlop * (1.0F / f));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #140 <Field int mTouchSlop>
	//    7   11:i2f             
	//    8   12:fconst_1        
	//    9   13:fload_1         
	//   10   14:fdiv            
	//   11   15:fmul            
	//   12   16:f2i             
	//   13   17:putfield        #140 <Field int mTouchSlop>
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
	//    3    5:invokevirtual   #254 <Method Context ViewGroup.getContext()>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #256 <Method void ViewDragHelper(Context, ViewGroup, ViewDragHelper$Callback)>
	//    7   13:areturn         
	}

	private void dispatchViewReleased(float f, float f1)
	{
		mReleaseInProgress = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #260 <Field boolean mReleaseInProgress>
		mCallback.onViewReleased(mCapturedView, f, f1);
	//    3    5:aload_0         
	//    4    6:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//    5    9:aload_0         
	//    6   10:getfield        #262 <Field View mCapturedView>
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:invokevirtual   #266 <Method void ViewDragHelper$Callback.onViewReleased(View, float, float)>
		mReleaseInProgress = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #260 <Field boolean mReleaseInProgress>
		if(mDragState == 1)
	//*  13   23:aload_0         
	//*  14   24:getfield        #268 <Field int mDragState>
	//*  15   27:iconst_1        
	//*  16   28:icmpne          36
			setDragState(0);
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #271 <Method void setDragState(int)>
	//   20   36:return          
	}

	private float distanceInfluenceForSnapDuration(float f)
	{
		return (float)Math.sin((f - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc1            #132 <Float 0.5F>
	//    2    3:fsub            
	//    3    4:ldc2            #272 <Float 0.4712389F>
	//    4    7:fmul            
	//    5    8:f2d             
	//    6    9:invokestatic    #276 <Method double Math.sin(double)>
	//    7   12:d2f             
	//    8   13:freturn         
	}

	private void dragTo(int i, int j, int k, int l)
	{
		int j1 = mCapturedView.getLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field View mCapturedView>
	//    2    4:invokevirtual   #283 <Method int View.getLeft()>
	//    3    7:istore          6
		int k1 = mCapturedView.getTop();
	//    4    9:aload_0         
	//    5   10:getfield        #262 <Field View mCapturedView>
	//    6   13:invokevirtual   #286 <Method int View.getTop()>
	//    7   16:istore          7
		int i1 = i;
	//    8   18:iload_1         
	//    9   19:istore          5
		if(k != 0)
	//*  10   21:iload_3         
	//*  11   22:ifeq            52
		{
			i1 = mCallback.clampViewPositionHorizontal(mCapturedView, i, k);
	//   12   25:aload_0         
	//   13   26:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   14   29:aload_0         
	//   15   30:getfield        #262 <Field View mCapturedView>
	//   16   33:iload_1         
	//   17   34:iload_3         
	//   18   35:invokevirtual   #290 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//   19   38:istore          5
			ViewCompat.offsetLeftAndRight(mCapturedView, i1 - j1);
	//   20   40:aload_0         
	//   21   41:getfield        #262 <Field View mCapturedView>
	//   22   44:iload           5
	//   23   46:iload           6
	//   24   48:isub            
	//   25   49:invokestatic    #296 <Method void ViewCompat.offsetLeftAndRight(View, int)>
		}
		i = j;
	//   26   52:iload_2         
	//   27   53:istore_1        
		if(l != 0)
	//*  28   54:iload           4
	//*  29   56:ifeq            85
		{
			i = mCallback.clampViewPositionVertical(mCapturedView, j, l);
	//   30   59:aload_0         
	//   31   60:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   32   63:aload_0         
	//   33   64:getfield        #262 <Field View mCapturedView>
	//   34   67:iload_2         
	//   35   68:iload           4
	//   36   70:invokevirtual   #299 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//   37   73:istore_1        
			ViewCompat.offsetTopAndBottom(mCapturedView, i - k1);
	//   38   74:aload_0         
	//   39   75:getfield        #262 <Field View mCapturedView>
	//   40   78:iload_1         
	//   41   79:iload           7
	//   42   81:isub            
	//   43   82:invokestatic    #302 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		}
		if(k != 0 || l != 0)
	//*  44   85:iload_3         
	//*  45   86:ifne            94
	//*  46   89:iload           4
	//*  47   91:ifeq            117
			mCallback.onViewPositionChanged(mCapturedView, i1, i, i1 - j1, i - k1);
	//   48   94:aload_0         
	//   49   95:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   50   98:aload_0         
	//   51   99:getfield        #262 <Field View mCapturedView>
	//   52  102:iload           5
	//   53  104:iload_1         
	//   54  105:iload           5
	//   55  107:iload           6
	//   56  109:isub            
	//   57  110:iload_1         
	//   58  111:iload           7
	//   59  113:isub            
	//   60  114:invokevirtual   #306 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
	//   61  117:return          
	}

	private void ensureMotionHistorySizeForId(int i)
	{
		if(mInitialMotionX == null || mInitialMotionX.length <= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field float[] mInitialMotionX>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #196 <Field float[] mInitialMotionX>
	//*   5   11:arraylength     
	//*   6   12:iload_1         
	//*   7   13:icmpgt          210
		{
			i++;
	//    8   16:iload_1         
	//    9   17:iconst_1        
	//   10   18:iadd            
	//   11   19:istore_1        
			float af[] = new float[i];
	//   12   20:iload_1         
	//   13   21:newarray        float[]
	//   14   23:astore_2        
			float af1[] = new float[i];
	//   15   24:iload_1         
	//   16   25:newarray        float[]
	//   17   27:astore_3        
			float af2[] = new float[i];
	//   18   28:iload_1         
	//   19   29:newarray        float[]
	//   20   31:astore          4
			float af3[] = new float[i];
	//   21   33:iload_1         
	//   22   34:newarray        float[]
	//   23   36:astore          5
			int ai[] = new int[i];
	//   24   38:iload_1         
	//   25   39:newarray        int[]
	//   26   41:astore          6
			int ai1[] = new int[i];
	//   27   43:iload_1         
	//   28   44:newarray        int[]
	//   29   46:astore          7
			int ai2[] = new int[i];
	//   30   48:iload_1         
	//   31   49:newarray        int[]
	//   32   51:astore          8
			if(mInitialMotionX != null)
	//*  33   53:aload_0         
	//*  34   54:getfield        #196 <Field float[] mInitialMotionX>
	//*  35   57:ifnull          170
			{
				System.arraycopy(((Object) (mInitialMotionX)), 0, ((Object) (af)), 0, mInitialMotionX.length);
	//   36   60:aload_0         
	//   37   61:getfield        #196 <Field float[] mInitialMotionX>
	//   38   64:iconst_0        
	//   39   65:aload_2         
	//   40   66:iconst_0        
	//   41   67:aload_0         
	//   42   68:getfield        #196 <Field float[] mInitialMotionX>
	//   43   71:arraylength     
	//   44   72:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mInitialMotionY)), 0, ((Object) (af1)), 0, mInitialMotionY.length);
	//   45   75:aload_0         
	//   46   76:getfield        #204 <Field float[] mInitialMotionY>
	//   47   79:iconst_0        
	//   48   80:aload_3         
	//   49   81:iconst_0        
	//   50   82:aload_0         
	//   51   83:getfield        #204 <Field float[] mInitialMotionY>
	//   52   86:arraylength     
	//   53   87:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mLastMotionX)), 0, ((Object) (af2)), 0, mLastMotionX.length);
	//   54   90:aload_0         
	//   55   91:getfield        #206 <Field float[] mLastMotionX>
	//   56   94:iconst_0        
	//   57   95:aload           4
	//   58   97:iconst_0        
	//   59   98:aload_0         
	//   60   99:getfield        #206 <Field float[] mLastMotionX>
	//   61  102:arraylength     
	//   62  103:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mLastMotionY)), 0, ((Object) (af3)), 0, mLastMotionY.length);
	//   63  106:aload_0         
	//   64  107:getfield        #208 <Field float[] mLastMotionY>
	//   65  110:iconst_0        
	//   66  111:aload           5
	//   67  113:iconst_0        
	//   68  114:aload_0         
	//   69  115:getfield        #208 <Field float[] mLastMotionY>
	//   70  118:arraylength     
	//   71  119:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mInitialEdgesTouched)), 0, ((Object) (ai)), 0, mInitialEdgesTouched.length);
	//   72  122:aload_0         
	//   73  123:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   74  126:iconst_0        
	//   75  127:aload           6
	//   76  129:iconst_0        
	//   77  130:aload_0         
	//   78  131:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   79  134:arraylength     
	//   80  135:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mEdgeDragsInProgress)), 0, ((Object) (ai1)), 0, mEdgeDragsInProgress.length);
	//   81  138:aload_0         
	//   82  139:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//   83  142:iconst_0        
	//   84  143:aload           7
	//   85  145:iconst_0        
	//   86  146:aload_0         
	//   87  147:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//   88  150:arraylength     
	//   89  151:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (mEdgeDragsLocked)), 0, ((Object) (ai2)), 0, mEdgeDragsLocked.length);
	//   90  154:aload_0         
	//   91  155:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   92  158:iconst_0        
	//   93  159:aload           8
	//   94  161:iconst_0        
	//   95  162:aload_0         
	//   96  163:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   97  166:arraylength     
	//   98  167:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			mInitialMotionX = af;
	//   99  170:aload_0         
	//  100  171:aload_2         
	//  101  172:putfield        #196 <Field float[] mInitialMotionX>
			mInitialMotionY = af1;
	//  102  175:aload_0         
	//  103  176:aload_3         
	//  104  177:putfield        #204 <Field float[] mInitialMotionY>
			mLastMotionX = af2;
	//  105  180:aload_0         
	//  106  181:aload           4
	//  107  183:putfield        #206 <Field float[] mLastMotionX>
			mLastMotionY = af3;
	//  108  186:aload_0         
	//  109  187:aload           5
	//  110  189:putfield        #208 <Field float[] mLastMotionY>
			mInitialEdgesTouched = ai;
	//  111  192:aload_0         
	//  112  193:aload           6
	//  113  195:putfield        #168 <Field int[] mInitialEdgesTouched>
			mEdgeDragsInProgress = ai1;
	//  114  198:aload_0         
	//  115  199:aload           7
	//  116  201:putfield        #174 <Field int[] mEdgeDragsInProgress>
			mEdgeDragsLocked = ai2;
	//  117  204:aload_0         
	//  118  205:aload           8
	//  119  207:putfield        #172 <Field int[] mEdgeDragsLocked>
		}
	//  120  210:return          
	}

	private boolean forceSettleCapturedViewAt(int i, int j, int k, int l)
	{
		int i1 = mCapturedView.getLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field View mCapturedView>
	//    2    4:invokevirtual   #283 <Method int View.getLeft()>
	//    3    7:istore          5
		int j1 = mCapturedView.getTop();
	//    4    9:aload_0         
	//    5   10:getfield        #262 <Field View mCapturedView>
	//    6   13:invokevirtual   #286 <Method int View.getTop()>
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
	//   21   37:getfield        #157 <Field OverScroller mScroller>
	//   22   40:invokevirtual   #318 <Method void OverScroller.abortAnimation()>
			setDragState(0);
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:invokevirtual   #271 <Method void setDragState(int)>
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		} else
		{
			k = computeSettleDuration(mCapturedView, i, j, k, l);
	//   28   50:aload_0         
	//   29   51:aload_0         
	//   30   52:getfield        #262 <Field View mCapturedView>
	//   31   55:iload_1         
	//   32   56:iload_2         
	//   33   57:iload_3         
	//   34   58:iload           4
	//   35   60:invokespecial   #320 <Method int computeSettleDuration(View, int, int, int, int)>
	//   36   63:istore_3        
			mScroller.startScroll(i1, j1, i, j, k);
	//   37   64:aload_0         
	//   38   65:getfield        #157 <Field OverScroller mScroller>
	//   39   68:iload           5
	//   40   70:iload           6
	//   41   72:iload_1         
	//   42   73:iload_2         
	//   43   74:iload_3         
	//   44   75:invokevirtual   #324 <Method void OverScroller.startScroll(int, int, int, int, int)>
			setDragState(2);
	//   45   78:aload_0         
	//   46   79:iconst_2        
	//   47   80:invokevirtual   #271 <Method void setDragState(int)>
			return true;
	//   48   83:iconst_1        
	//   49   84:ireturn         
		}
	}

	private int getEdgesTouched(int i, int j)
	{
		int l;
		if(i < mParentView.getLeft() + mEdgeSize)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #105 <Field ViewGroup mParentView>
	//*   3    5:invokevirtual   #326 <Method int ViewGroup.getLeft()>
	//*   4    8:aload_0         
	//*   5    9:getfield        #134 <Field int mEdgeSize>
	//*   6   12:iadd            
	//*   7   13:icmpge          22
			l = 1;
	//    8   16:iconst_1        
	//    9   17:istore          4
		else
	//*  10   19:goto            25
			l = 0;
	//   11   22:iconst_0        
	//   12   23:istore          4
		int k = l;
	//   13   25:iload           4
	//   14   27:istore_3        
		if(j < mParentView.getTop() + mEdgeSize)
	//*  15   28:iload_2         
	//*  16   29:aload_0         
	//*  17   30:getfield        #105 <Field ViewGroup mParentView>
	//*  18   33:invokevirtual   #327 <Method int ViewGroup.getTop()>
	//*  19   36:aload_0         
	//*  20   37:getfield        #134 <Field int mEdgeSize>
	//*  21   40:iadd            
	//*  22   41:icmpge          49
			k = l | 4;
	//   23   44:iload           4
	//   24   46:iconst_4        
	//   25   47:ior             
	//   26   48:istore_3        
		l = k;
	//   27   49:iload_3         
	//   28   50:istore          4
		if(i > mParentView.getRight() - mEdgeSize)
	//*  29   52:iload_1         
	//*  30   53:aload_0         
	//*  31   54:getfield        #105 <Field ViewGroup mParentView>
	//*  32   57:invokevirtual   #330 <Method int ViewGroup.getRight()>
	//*  33   60:aload_0         
	//*  34   61:getfield        #134 <Field int mEdgeSize>
	//*  35   64:isub            
	//*  36   65:icmple          73
			l = k | 2;
	//   37   68:iload_3         
	//   38   69:iconst_2        
	//   39   70:ior             
	//   40   71:istore          4
		i = l;
	//   41   73:iload           4
	//   42   75:istore_1        
		if(j > mParentView.getBottom() - mEdgeSize)
	//*  43   76:iload_2         
	//*  44   77:aload_0         
	//*  45   78:getfield        #105 <Field ViewGroup mParentView>
	//*  46   81:invokevirtual   #333 <Method int ViewGroup.getBottom()>
	//*  47   84:aload_0         
	//*  48   85:getfield        #134 <Field int mEdgeSize>
	//*  49   88:isub            
	//*  50   89:icmple          98
			i = l | 8;
	//   51   92:iload           4
	//   52   94:bipush          8
	//   53   96:ior             
	//   54   97:istore_1        
		return i;
	//   55   98:iload_1         
	//   56   99:ireturn         
	}

	private boolean isValidPointerForActionMove(int i)
	{
		if(!isPointerDown(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #217 <Method boolean isPointerDown(int)>
	//*   3    5:ifne            66
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #336 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #337 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("Ignoring pointerId=");
	//    8   16:aload_2         
	//    9   17:ldc2            #339 <String "Ignoring pointerId=">
	//   10   20:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(i);
	//   12   24:aload_2         
	//   13   25:iload_1         
	//   14   26:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//   15   29:pop             
			stringbuilder.append(" because ACTION_DOWN was not received ");
	//   16   30:aload_2         
	//   17   31:ldc2            #348 <String " because ACTION_DOWN was not received ">
	//   18   34:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
	//   20   38:aload_2         
	//   21   39:ldc2            #350 <String "for this pointer before ACTION_MOVE. It likely happened because ">
	//   22   42:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			stringbuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
	//   24   46:aload_2         
	//   25   47:ldc2            #352 <String " ViewDragHelper did not receive all the events in the event stream.">
	//   26   50:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			Log.e("ViewDragHelper", stringbuilder.toString());
	//   28   54:ldc1            #42  <String "ViewDragHelper">
	//   29   56:aload_2         
	//   30   57:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #362 <Method int Log.e(String, String)>
	//   32   63:pop             
			return false;
	//   33   64:iconst_0        
	//   34   65:ireturn         
		} else
		{
			return true;
	//   35   66:iconst_1        
	//   36   67:ireturn         
		}
	}

	private void releaseViewForPointerUp()
	{
		mVelocityTracker.computeCurrentVelocity(1000, mMaxVelocity);
	//    0    0:aload_0         
	//    1    1:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//    2    4:sipush          1000
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field float mMaxVelocity>
	//    5   11:invokevirtual   #371 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		dispatchViewReleased(clampMag(mVelocityTracker.getXVelocity(mActivePointerId), mMinVelocity, mMaxVelocity), clampMag(mVelocityTracker.getYVelocity(mActivePointerId), mMinVelocity, mMaxVelocity));
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   10   20:aload_0         
	//   11   21:getfield        #89  <Field int mActivePointerId>
	//   12   24:invokevirtual   #375 <Method float VelocityTracker.getXVelocity(int)>
	//   13   27:aload_0         
	//   14   28:getfield        #150 <Field float mMinVelocity>
	//   15   31:aload_0         
	//   16   32:getfield        #145 <Field float mMaxVelocity>
	//   17   35:invokespecial   #377 <Method float clampMag(float, float, float)>
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   21   43:aload_0         
	//   22   44:getfield        #89  <Field int mActivePointerId>
	//   23   47:invokevirtual   #380 <Method float VelocityTracker.getYVelocity(int)>
	//   24   50:aload_0         
	//   25   51:getfield        #150 <Field float mMinVelocity>
	//   26   54:aload_0         
	//   27   55:getfield        #145 <Field float mMaxVelocity>
	//   28   58:invokespecial   #377 <Method float clampMag(float, float, float)>
	//   29   61:invokespecial   #382 <Method void dispatchViewReleased(float, float)>
	//   30   64:return          
	}

	private void reportNewEdgeDrags(float f, float f1, int i)
	{
		int k = 1;
	//    0    0:iconst_1        
	//    1    1:istore          5
		if(!checkNewEdgeDrag(f, f1, i, 1))
	//*   2    3:aload_0         
	//*   3    4:fload_1         
	//*   4    5:fload_2         
	//*   5    6:iload_3         
	//*   6    7:iconst_1        
	//*   7    8:invokespecial   #386 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*   8   11:ifeq            17
	//*   9   14:goto            20
			k = 0;
	//   10   17:iconst_0        
	//   11   18:istore          5
		int j = k;
	//   12   20:iload           5
	//   13   22:istore          4
		if(checkNewEdgeDrag(f1, f, i, 4))
	//*  14   24:aload_0         
	//*  15   25:fload_2         
	//*  16   26:fload_1         
	//*  17   27:iload_3         
	//*  18   28:iconst_4        
	//*  19   29:invokespecial   #386 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  20   32:ifeq            41
			j = k | 4;
	//   21   35:iload           5
	//   22   37:iconst_4        
	//   23   38:ior             
	//   24   39:istore          4
		k = j;
	//   25   41:iload           4
	//   26   43:istore          5
		if(checkNewEdgeDrag(f, f1, i, 2))
	//*  27   45:aload_0         
	//*  28   46:fload_1         
	//*  29   47:fload_2         
	//*  30   48:iload_3         
	//*  31   49:iconst_2        
	//*  32   50:invokespecial   #386 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  33   53:ifeq            62
			k = j | 2;
	//   34   56:iload           4
	//   35   58:iconst_2        
	//   36   59:ior             
	//   37   60:istore          5
		j = k;
	//   38   62:iload           5
	//   39   64:istore          4
		if(checkNewEdgeDrag(f1, f, i, 8))
	//*  40   66:aload_0         
	//*  41   67:fload_2         
	//*  42   68:fload_1         
	//*  43   69:iload_3         
	//*  44   70:bipush          8
	//*  45   72:invokespecial   #386 <Method boolean checkNewEdgeDrag(float, float, int, int)>
	//*  46   75:ifeq            85
			j = k | 8;
	//   47   78:iload           5
	//   48   80:bipush          8
	//   49   82:ior             
	//   50   83:istore          4
		if(j != 0)
	//*  51   85:iload           4
	//*  52   87:ifeq            117
		{
			int ai[] = mEdgeDragsInProgress;
	//   53   90:aload_0         
	//   54   91:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//   55   94:astore          6
			ai[i] = ai[i] | j;
	//   56   96:aload           6
	//   57   98:iload_3         
	//   58   99:aload           6
	//   59  101:iload_3         
	//   60  102:iaload          
	//   61  103:iload           4
	//   62  105:ior             
	//   63  106:iastore         
			mCallback.onEdgeDragStarted(j, i);
	//   64  107:aload_0         
	//   65  108:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   66  111:iload           4
	//   67  113:iload_3         
	//   68  114:invokevirtual   #390 <Method void ViewDragHelper$Callback.onEdgeDragStarted(int, int)>
		}
	//   69  117:return          
	}

	private void saveInitialMotion(float f, float f1, int i)
	{
		ensureMotionHistorySizeForId(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokespecial   #393 <Method void ensureMotionHistorySizeForId(int)>
		float af[] = mInitialMotionX;
	//    3    5:aload_0         
	//    4    6:getfield        #196 <Field float[] mInitialMotionX>
	//    5    9:astore          4
		mLastMotionX[i] = f;
	//    6   11:aload_0         
	//    7   12:getfield        #206 <Field float[] mLastMotionX>
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
	//   16   24:getfield        #204 <Field float[] mInitialMotionY>
	//   17   27:astore          4
		mLastMotionY[i] = f1;
	//   18   29:aload_0         
	//   19   30:getfield        #208 <Field float[] mLastMotionY>
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
	//   28   42:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   29   45:iload_3         
	//   30   46:aload_0         
	//   31   47:fload_1         
	//   32   48:f2i             
	//   33   49:fload_2         
	//   34   50:f2i             
	//   35   51:invokespecial   #395 <Method int getEdgesTouched(int, int)>
	//   36   54:iastore         
		mPointersDown = mPointersDown | 1 << i;
	//   37   55:aload_0         
	//   38   56:aload_0         
	//   39   57:getfield        #213 <Field int mPointersDown>
	//   40   60:iconst_1        
	//   41   61:iload_3         
	//   42   62:ishl            
	//   43   63:ior             
	//   44   64:putfield        #213 <Field int mPointersDown>
	//   45   67:return          
	}

	private void saveLastMotion(MotionEvent motionevent)
	{
		int j = motionevent.getPointerCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #402 <Method int MotionEvent.getPointerCount()>
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
	//   10   19:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   11   22:istore          6
			if(isValidPointerForActionMove(k))
	//*  12   24:aload_0         
	//*  13   25:iload           6
	//*  14   27:invokespecial   #407 <Method boolean isValidPointerForActionMove(int)>
	//*  15   30:ifne            36
	//*  16   33:goto            66
			{
				float f = motionevent.getX(i);
	//   17   36:aload_1         
	//   18   37:iload           4
	//   19   39:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//   20   42:fstore_2        
				float f1 = motionevent.getY(i);
	//   21   43:aload_1         
	//   22   44:iload           4
	//   23   46:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//   24   49:fstore_3        
				mLastMotionX[k] = f;
	//   25   50:aload_0         
	//   26   51:getfield        #206 <Field float[] mLastMotionX>
	//   27   54:iload           6
	//   28   56:fload_2         
	//   29   57:fastore         
				mLastMotionY[k] = f1;
	//   30   58:aload_0         
	//   31   59:getfield        #208 <Field float[] mLastMotionY>
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
	//    1    1:invokevirtual   #417 <Method void cancel()>
		if(mDragState == 2)
	//*   2    4:aload_0         
	//*   3    5:getfield        #268 <Field int mDragState>
	//*   4    8:iconst_2        
	//*   5    9:icmpne          73
		{
			int i = mScroller.getCurrX();
	//    6   12:aload_0         
	//    7   13:getfield        #157 <Field OverScroller mScroller>
	//    8   16:invokevirtual   #420 <Method int OverScroller.getCurrX()>
	//    9   19:istore_1        
			int j = mScroller.getCurrY();
	//   10   20:aload_0         
	//   11   21:getfield        #157 <Field OverScroller mScroller>
	//   12   24:invokevirtual   #423 <Method int OverScroller.getCurrY()>
	//   13   27:istore_2        
			mScroller.abortAnimation();
	//   14   28:aload_0         
	//   15   29:getfield        #157 <Field OverScroller mScroller>
	//   16   32:invokevirtual   #318 <Method void OverScroller.abortAnimation()>
			int k = mScroller.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #157 <Field OverScroller mScroller>
	//   19   39:invokevirtual   #420 <Method int OverScroller.getCurrX()>
	//   20   42:istore_3        
			int l = mScroller.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #157 <Field OverScroller mScroller>
	//   23   47:invokevirtual   #423 <Method int OverScroller.getCurrY()>
	//   24   50:istore          4
			mCallback.onViewPositionChanged(mCapturedView, k, l, k - i, l - j);
	//   25   52:aload_0         
	//   26   53:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   27   56:aload_0         
	//   28   57:getfield        #262 <Field View mCapturedView>
	//   29   60:iload_3         
	//   30   61:iload           4
	//   31   63:iload_3         
	//   32   64:iload_1         
	//   33   65:isub            
	//   34   66:iload           4
	//   35   68:iload_2         
	//   36   69:isub            
	//   37   70:invokevirtual   #306 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
		}
		setDragState(0);
	//   38   73:aload_0         
	//   39   74:iconst_0        
	//   40   75:invokevirtual   #271 <Method void setDragState(int)>
	//   41   78:return          
	}

	protected boolean canScroll(View view, boolean flag, int i, int j, int k, int l)
	{
label0:
		{
			boolean flag2 = view instanceof ViewGroup;
	//    0    0:aload_1         
	//    1    1:instanceof      #220 <Class ViewGroup>
	//    2    4:istore          13
			boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          12
			if(flag2)
	//*   5    9:iload           13
	//*   6   11:ifeq            149
			{
				ViewGroup viewgroup = (ViewGroup)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #220 <Class ViewGroup>
	//    9   18:astore          14
				int j1 = view.getScrollX();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #428 <Method int View.getScrollX()>
	//   12   24:istore          8
				int k1 = view.getScrollY();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #431 <Method int View.getScrollY()>
	//   15   30:istore          9
				for(int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
	//*  16   32:aload           14
	//*  17   34:invokevirtual   #434 <Method int ViewGroup.getChildCount()>
	//*  18   37:iconst_1        
	//*  19   38:isub            
	//*  20   39:istore          7
	//*  21   41:iload           7
	//*  22   43:iflt            149
				{
					View view1 = viewgroup.getChildAt(i1);
	//   23   46:aload           14
	//   24   48:iload           7
	//   25   50:invokevirtual   #438 <Method View ViewGroup.getChildAt(int)>
	//   26   53:astore          15
					int l1 = k + j1;
	//   27   55:iload           5
	//   28   57:iload           8
	//   29   59:iadd            
	//   30   60:istore          10
					if(l1 < view1.getLeft() || l1 >= view1.getRight())
						continue;
	//   31   62:iload           10
	//   32   64:aload           15
	//   33   66:invokevirtual   #283 <Method int View.getLeft()>
	//   34   69:icmplt          140
	//   35   72:iload           10
	//   36   74:aload           15
	//   37   76:invokevirtual   #439 <Method int View.getRight()>
	//   38   79:icmpge          140
					int i2 = l + k1;
	//   39   82:iload           6
	//   40   84:iload           9
	//   41   86:iadd            
	//   42   87:istore          11
					if(i2 >= view1.getTop() && i2 < view1.getBottom() && canScroll(view1, true, i, j, l1 - view1.getLeft(), i2 - view1.getTop()))
	//*  43   89:iload           11
	//*  44   91:aload           15
	//*  45   93:invokevirtual   #286 <Method int View.getTop()>
	//*  46   96:icmplt          140
	//*  47   99:iload           11
	//*  48  101:aload           15
	//*  49  103:invokevirtual   #440 <Method int View.getBottom()>
	//*  50  106:icmpge          140
	//*  51  109:aload_0         
	//*  52  110:aload           15
	//*  53  112:iconst_1        
	//*  54  113:iload_3         
	//*  55  114:iload           4
	//*  56  116:iload           10
	//*  57  118:aload           15
	//*  58  120:invokevirtual   #283 <Method int View.getLeft()>
	//*  59  123:isub            
	//*  60  124:iload           11
	//*  61  126:aload           15
	//*  62  128:invokevirtual   #286 <Method int View.getTop()>
	//*  63  131:isub            
	//*  64  132:invokevirtual   #442 <Method boolean canScroll(View, boolean, int, int, int, int)>
	//*  65  135:ifeq            140
						return true;
	//   66  138:iconst_1        
	//   67  139:ireturn         
				}

	//   68  140:iload           7
	//   69  142:iconst_1        
	//   70  143:isub            
	//   71  144:istore          7
			}
	//*  72  146:goto            41
			if(flag)
	//*  73  149:iload_2         
	//*  74  150:ifeq            177
			{
				flag = flag1;
	//   75  153:iload           12
	//   76  155:istore_2        
				if(view.canScrollHorizontally(-i))
					break label0;
	//   77  156:aload_1         
	//   78  157:iload_3         
	//   79  158:ineg            
	//   80  159:invokevirtual   #445 <Method boolean View.canScrollHorizontally(int)>
	//   81  162:ifne            179
				if(view.canScrollVertically(-j))
	//*  82  165:aload_1         
	//*  83  166:iload           4
	//*  84  168:ineg            
	//*  85  169:invokevirtual   #448 <Method boolean View.canScrollVertically(int)>
	//*  86  172:ifeq            177
					return true;
	//   87  175:iconst_1        
	//   88  176:ireturn         
			}
			flag = false;
	//   89  177:iconst_0        
	//   90  178:istore_2        
		}
		return flag;
	//   91  179:iload_2         
	//   92  180:ireturn         
	}

	public void cancel()
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #89  <Field int mActivePointerId>
		clearMotionHistory();
	//    3    5:aload_0         
	//    4    6:invokespecial   #450 <Method void clearMotionHistory()>
		if(mVelocityTracker != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//*   7   13:ifnull          28
		{
			mVelocityTracker.recycle();
	//    8   16:aload_0         
	//    9   17:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   10   20:invokevirtual   #453 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #365 <Field VelocityTracker mVelocityTracker>
		}
	//   14   28:return          
	}

	public void captureChildView(View view, int i)
	{
		if(view.getParent() != mParentView)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #458 <Method android.view.ViewParent View.getParent()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #105 <Field ViewGroup mParentView>
	//*   4    8:if_acmpeq       56
		{
			view = ((View) (new StringBuilder()));
	//    5   11:new             #336 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #337 <Method void StringBuilder()>
	//    8   18:astore_1        
			((StringBuilder) (view)).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
	//    9   19:aload_1         
	//   10   20:ldc2            #460 <String "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (">
	//   11   23:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			((StringBuilder) (view)).append(((Object) (mParentView)));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #105 <Field ViewGroup mParentView>
	//   16   32:invokevirtual   #463 <Method StringBuilder StringBuilder.append(Object)>
	//   17   35:pop             
			((StringBuilder) (view)).append(")");
	//   18   36:aload_1         
	//   19   37:ldc2            #465 <String ")">
	//   20   40:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   22   44:new             #96  <Class IllegalArgumentException>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   26   52:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   27   55:athrow          
		} else
		{
			mCapturedView = view;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:putfield        #262 <Field View mCapturedView>
			mActivePointerId = i;
	//   31   61:aload_0         
	//   32   62:iload_2         
	//   33   63:putfield        #89  <Field int mActivePointerId>
			mCallback.onViewCaptured(view, i);
	//   34   66:aload_0         
	//   35   67:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   36   70:aload_1         
	//   37   71:iload_2         
	//   38   72:invokevirtual   #468 <Method void ViewDragHelper$Callback.onViewCaptured(View, int)>
			setDragState(1);
	//   39   75:aload_0         
	//   40   76:iconst_1        
	//   41   77:invokevirtual   #271 <Method void setDragState(int)>
			return;
	//   42   80:return          
		}
	}

	public boolean checkTouchSlop(int i)
	{
		int k = mInitialMotionX.length;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field float[] mInitialMotionX>
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
	//*  12   16:invokevirtual   #471 <Method boolean checkTouchSlop(int, int)>
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
		boolean flag6 = isPointerDown(j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #217 <Method boolean isPointerDown(int)>
	//    3    5:istore          9
		boolean flag4 = false;
	//    4    7:iconst_0        
	//    5    8:istore          7
		boolean flag5 = false;
	//    6   10:iconst_0        
	//    7   11:istore          8
		boolean flag1 = false;
	//    8   13:iconst_0        
	//    9   14:istore          6
		if(!flag6)
	//*  10   16:iload           9
	//*  11   18:ifne            23
			return false;
	//   12   21:iconst_0        
	//   13   22:ireturn         
		boolean flag;
		if((i & 1) == 1)
	//*  14   23:iload_1         
	//*  15   24:iconst_1        
	//*  16   25:iand            
	//*  17   26:iconst_1        
	//*  18   27:icmpne          36
			flag = true;
	//   19   30:iconst_1        
	//   20   31:istore          5
		else
	//*  21   33:goto            39
			flag = false;
	//   22   36:iconst_0        
	//   23   37:istore          5
		if((i & 2) == 2)
	//*  24   39:iload_1         
	//*  25   40:iconst_2        
	//*  26   41:iand            
	//*  27   42:iconst_2        
	//*  28   43:icmpne          51
			i = 1;
	//   29   46:iconst_1        
	//   30   47:istore_1        
		else
	//*  31   48:goto            53
			i = 0;
	//   32   51:iconst_0        
	//   33   52:istore_1        
		float f = mLastMotionX[j] - mInitialMotionX[j];
	//   34   53:aload_0         
	//   35   54:getfield        #206 <Field float[] mLastMotionX>
	//   36   57:iload_2         
	//   37   58:faload          
	//   38   59:aload_0         
	//   39   60:getfield        #196 <Field float[] mInitialMotionX>
	//   40   63:iload_2         
	//   41   64:faload          
	//   42   65:fsub            
	//   43   66:fstore_3        
		float f1 = mLastMotionY[j] - mInitialMotionY[j];
	//   44   67:aload_0         
	//   45   68:getfield        #208 <Field float[] mLastMotionY>
	//   46   71:iload_2         
	//   47   72:faload          
	//   48   73:aload_0         
	//   49   74:getfield        #204 <Field float[] mInitialMotionY>
	//   50   77:iload_2         
	//   51   78:faload          
	//   52   79:fsub            
	//   53   80:fstore          4
		if(flag && i != 0)
	//*  54   82:iload           5
	//*  55   84:ifeq            120
	//*  56   87:iload_1         
	//*  57   88:ifeq            120
		{
			if(f * f + f1 * f1 > (float)(mTouchSlop * mTouchSlop))
	//*  58   91:fload_3         
	//*  59   92:fload_3         
	//*  60   93:fmul            
	//*  61   94:fload           4
	//*  62   96:fload           4
	//*  63   98:fmul            
	//*  64   99:fadd            
	//*  65  100:aload_0         
	//*  66  101:getfield        #140 <Field int mTouchSlop>
	//*  67  104:aload_0         
	//*  68  105:getfield        #140 <Field int mTouchSlop>
	//*  69  108:imul            
	//*  70  109:i2f             
	//*  71  110:fcmpl           
	//*  72  111:ifle            117
				flag1 = true;
	//   73  114:iconst_1        
	//   74  115:istore          6
			return flag1;
	//   75  117:iload           6
	//   76  119:ireturn         
		}
		if(flag)
	//*  77  120:iload           5
	//*  78  122:ifeq            148
		{
			boolean flag2 = flag4;
	//   79  125:iload           7
	//   80  127:istore          6
			if(Math.abs(f) > (float)mTouchSlop)
	//*  81  129:fload_3         
	//*  82  130:invokestatic    #166 <Method float Math.abs(float)>
	//*  83  133:aload_0         
	//*  84  134:getfield        #140 <Field int mTouchSlop>
	//*  85  137:i2f             
	//*  86  138:fcmpl           
	//*  87  139:ifle            145
				flag2 = true;
	//   88  142:iconst_1        
	//   89  143:istore          6
			return flag2;
	//   90  145:iload           6
	//   91  147:ireturn         
		}
		if(i != 0)
	//*  92  148:iload_1         
	//*  93  149:ifeq            176
		{
			boolean flag3 = flag5;
	//   94  152:iload           8
	//   95  154:istore          6
			if(Math.abs(f1) > (float)mTouchSlop)
	//*  96  156:fload           4
	//*  97  158:invokestatic    #166 <Method float Math.abs(float)>
	//*  98  161:aload_0         
	//*  99  162:getfield        #140 <Field int mTouchSlop>
	//* 100  165:i2f             
	//* 101  166:fcmpl           
	//* 102  167:ifle            173
				flag3 = true;
	//  103  170:iconst_1        
	//  104  171:istore          6
			return flag3;
	//  105  173:iload           6
	//  106  175:ireturn         
		} else
		{
			return false;
	//  107  176:iconst_0        
	//  108  177:ireturn         
		}
	}

	public boolean continueSettling(boolean flag)
	{
		int i = mDragState;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field int mDragState>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore          7
		if(i == 2)
	//*   5    8:iload_2         
	//*   6    9:iconst_2        
	//*   7   10:icmpne          193
		{
			boolean flag3 = mScroller.computeScrollOffset();
	//    8   13:aload_0         
	//    9   14:getfield        #157 <Field OverScroller mScroller>
	//   10   17:invokevirtual   #477 <Method boolean OverScroller.computeScrollOffset()>
	//   11   20:istore          8
			int j = mScroller.getCurrX();
	//   12   22:aload_0         
	//   13   23:getfield        #157 <Field OverScroller mScroller>
	//   14   26:invokevirtual   #420 <Method int OverScroller.getCurrX()>
	//   15   29:istore_2        
			int k = mScroller.getCurrY();
	//   16   30:aload_0         
	//   17   31:getfield        #157 <Field OverScroller mScroller>
	//   18   34:invokevirtual   #423 <Method int OverScroller.getCurrY()>
	//   19   37:istore_3        
			int l = j - mCapturedView.getLeft();
	//   20   38:iload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #262 <Field View mCapturedView>
	//   23   43:invokevirtual   #283 <Method int View.getLeft()>
	//   24   46:isub            
	//   25   47:istore          4
			int i1 = k - mCapturedView.getTop();
	//   26   49:iload_3         
	//   27   50:aload_0         
	//   28   51:getfield        #262 <Field View mCapturedView>
	//   29   54:invokevirtual   #286 <Method int View.getTop()>
	//   30   57:isub            
	//   31   58:istore          5
			if(l != 0)
	//*  32   60:iload           4
	//*  33   62:ifeq            74
				ViewCompat.offsetLeftAndRight(mCapturedView, l);
	//   34   65:aload_0         
	//   35   66:getfield        #262 <Field View mCapturedView>
	//   36   69:iload           4
	//   37   71:invokestatic    #296 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			if(i1 != 0)
	//*  38   74:iload           5
	//*  39   76:ifeq            88
				ViewCompat.offsetTopAndBottom(mCapturedView, i1);
	//   40   79:aload_0         
	//   41   80:getfield        #262 <Field View mCapturedView>
	//   42   83:iload           5
	//   43   85:invokestatic    #302 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			if(l != 0 || i1 != 0)
	//*  44   88:iload           4
	//*  45   90:ifne            98
	//*  46   93:iload           5
	//*  47   95:ifeq            115
				mCallback.onViewPositionChanged(mCapturedView, j, k, l, i1);
	//   48   98:aload_0         
	//   49   99:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   50  102:aload_0         
	//   51  103:getfield        #262 <Field View mCapturedView>
	//   52  106:iload_2         
	//   53  107:iload_3         
	//   54  108:iload           4
	//   55  110:iload           5
	//   56  112:invokevirtual   #306 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
			boolean flag1 = flag3;
	//   57  115:iload           8
	//   58  117:istore          6
			if(flag3)
	//*  59  119:iload           8
	//*  60  121:ifeq            164
			{
				flag1 = flag3;
	//   61  124:iload           8
	//   62  126:istore          6
				if(j == mScroller.getFinalX())
	//*  63  128:iload_2         
	//*  64  129:aload_0         
	//*  65  130:getfield        #157 <Field OverScroller mScroller>
	//*  66  133:invokevirtual   #480 <Method int OverScroller.getFinalX()>
	//*  67  136:icmpne          164
				{
					flag1 = flag3;
	//   68  139:iload           8
	//   69  141:istore          6
					if(k == mScroller.getFinalY())
	//*  70  143:iload_3         
	//*  71  144:aload_0         
	//*  72  145:getfield        #157 <Field OverScroller mScroller>
	//*  73  148:invokevirtual   #483 <Method int OverScroller.getFinalY()>
	//*  74  151:icmpne          164
					{
						mScroller.abortAnimation();
	//   75  154:aload_0         
	//   76  155:getfield        #157 <Field OverScroller mScroller>
	//   77  158:invokevirtual   #318 <Method void OverScroller.abortAnimation()>
						flag1 = false;
	//   78  161:iconst_0        
	//   79  162:istore          6
					}
				}
			}
			if(!flag1)
	//*  80  164:iload           6
	//*  81  166:ifne            193
				if(flag)
	//*  82  169:iload_1         
	//*  83  170:ifeq            188
					mParentView.post(mSetIdleRunnable);
	//   84  173:aload_0         
	//   85  174:getfield        #105 <Field ViewGroup mParentView>
	//   86  177:aload_0         
	//   87  178:getfield        #94  <Field Runnable mSetIdleRunnable>
	//   88  181:invokevirtual   #487 <Method boolean ViewGroup.post(Runnable)>
	//   89  184:pop             
				else
	//*  90  185:goto            193
					setDragState(0);
	//   91  188:aload_0         
	//   92  189:iconst_0        
	//   93  190:invokevirtual   #271 <Method void setDragState(int)>
		}
		flag = flag2;
	//   94  193:iload           7
	//   95  195:istore_1        
		if(mDragState == 2)
	//*  96  196:aload_0         
	//*  97  197:getfield        #268 <Field int mDragState>
	//*  98  200:iconst_2        
	//*  99  201:icmpne          206
			flag = true;
	//  100  204:iconst_1        
	//  101  205:istore_1        
		return flag;
	//  102  206:iload_1         
	//  103  207:ireturn         
	}

	public View findTopChildUnder(int i, int j)
	{
		for(int k = mParentView.getChildCount() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field ViewGroup mParentView>
	//*   2    4:invokevirtual   #434 <Method int ViewGroup.getChildCount()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            77
		{
			View view = mParentView.getChildAt(mCallback.getOrderedChildIndex(k));
	//    8   14:aload_0         
	//    9   15:getfield        #105 <Field ViewGroup mParentView>
	//   10   18:aload_0         
	//   11   19:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   12   22:iload_3         
	//   13   23:invokevirtual   #493 <Method int ViewDragHelper$Callback.getOrderedChildIndex(int)>
	//   14   26:invokevirtual   #438 <Method View ViewGroup.getChildAt(int)>
	//   15   29:astore          4
			if(i >= view.getLeft() && i < view.getRight() && j >= view.getTop() && j < view.getBottom())
	//*  16   31:iload_1         
	//*  17   32:aload           4
	//*  18   34:invokevirtual   #283 <Method int View.getLeft()>
	//*  19   37:icmplt          70
	//*  20   40:iload_1         
	//*  21   41:aload           4
	//*  22   43:invokevirtual   #439 <Method int View.getRight()>
	//*  23   46:icmpge          70
	//*  24   49:iload_2         
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #286 <Method int View.getTop()>
	//*  27   55:icmplt          70
	//*  28   58:iload_2         
	//*  29   59:aload           4
	//*  30   61:invokevirtual   #440 <Method int View.getBottom()>
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
	//*   1    1:getfield        #260 <Field boolean mReleaseInProgress>
	//*   2    4:ifne            18
		{
			throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
	//    3    7:new             #497 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #499 <String "Cannot flingCapturedView outside of a call to Callback#onViewReleased">
	//    6   14:invokespecial   #500 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mScroller.fling(mCapturedView.getLeft(), mCapturedView.getTop(), (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId), i, k, j, l);
	//    8   18:aload_0         
	//    9   19:getfield        #157 <Field OverScroller mScroller>
	//   10   22:aload_0         
	//   11   23:getfield        #262 <Field View mCapturedView>
	//   12   26:invokevirtual   #283 <Method int View.getLeft()>
	//   13   29:aload_0         
	//   14   30:getfield        #262 <Field View mCapturedView>
	//   15   33:invokevirtual   #286 <Method int View.getTop()>
	//   16   36:aload_0         
	//   17   37:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   18   40:aload_0         
	//   19   41:getfield        #89  <Field int mActivePointerId>
	//   20   44:invokevirtual   #375 <Method float VelocityTracker.getXVelocity(int)>
	//   21   47:f2i             
	//   22   48:aload_0         
	//   23   49:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   24   52:aload_0         
	//   25   53:getfield        #89  <Field int mActivePointerId>
	//   26   56:invokevirtual   #380 <Method float VelocityTracker.getYVelocity(int)>
	//   27   59:f2i             
	//   28   60:iload_1         
	//   29   61:iload_3         
	//   30   62:iload_2         
	//   31   63:iload           4
	//   32   65:invokevirtual   #504 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
			setDragState(2);
	//   33   68:aload_0         
	//   34   69:iconst_2        
	//   35   70:invokevirtual   #271 <Method void setDragState(int)>
			return;
	//   36   73:return          
		}
	}

	public int getActivePointerId()
	{
		return mActivePointerId;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int mActivePointerId>
	//    2    4:ireturn         
	}

	public View getCapturedView()
	{
		return mCapturedView;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field View mCapturedView>
	//    2    4:areturn         
	}

	public int getEdgeSize()
	{
		return mEdgeSize;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int mEdgeSize>
	//    2    4:ireturn         
	}

	public float getMinVelocity()
	{
		return mMinVelocity;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field float mMinVelocity>
	//    2    4:freturn         
	}

	public int getTouchSlop()
	{
		return mTouchSlop;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field int mTouchSlop>
	//    2    4:ireturn         
	}

	public int getViewDragState()
	{
		return mDragState;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field int mDragState>
	//    2    4:ireturn         
	}

	public boolean isCapturedViewUnder(int i, int j)
	{
		return isViewUnder(mCapturedView, i, j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #262 <Field View mCapturedView>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #517 <Method boolean isViewUnder(View, int, int)>
	//    6   10:ireturn         
	}

	public boolean isEdgeTouched(int i)
	{
		int k = mInitialEdgesTouched.length;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field int[] mInitialEdgesTouched>
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
	//*  12   16:invokevirtual   #520 <Method boolean isEdgeTouched(int, int)>
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
		return isPointerDown(j) && (i & mInitialEdgesTouched[j]) != 0;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #217 <Method boolean isPointerDown(int)>
	//    3    5:ifeq            21
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #168 <Field int[] mInitialEdgesTouched>
	//    7   13:iload_2         
	//    8   14:iaload          
	//    9   15:iand            
	//   10   16:ifeq            21
	//   11   19:iconst_1        
	//   12   20:ireturn         
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	public boolean isPointerDown(int i)
	{
		return (1 << i & mPointersDown) != 0;
	//    0    0:iconst_1        
	//    1    1:iload_1         
	//    2    2:ishl            
	//    3    3:aload_0         
	//    4    4:getfield        #213 <Field int mPointersDown>
	//    5    7:iand            
	//    6    8:ifeq            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public boolean isViewUnder(View view, int i, int j)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(view == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return false;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		boolean flag = flag1;
	//    6    9:iload           5
	//    7   11:istore          4
		if(i >= view.getLeft())
	//*   8   13:iload_2         
	//*   9   14:aload_1         
	//*  10   15:invokevirtual   #283 <Method int View.getLeft()>
	//*  11   18:icmplt          60
		{
			flag = flag1;
	//   12   21:iload           5
	//   13   23:istore          4
			if(i < view.getRight())
	//*  14   25:iload_2         
	//*  15   26:aload_1         
	//*  16   27:invokevirtual   #439 <Method int View.getRight()>
	//*  17   30:icmpge          60
			{
				flag = flag1;
	//   18   33:iload           5
	//   19   35:istore          4
				if(j >= view.getTop())
	//*  20   37:iload_3         
	//*  21   38:aload_1         
	//*  22   39:invokevirtual   #286 <Method int View.getTop()>
	//*  23   42:icmplt          60
				{
					flag = flag1;
	//   24   45:iload           5
	//   25   47:istore          4
					if(j < view.getBottom())
	//*  26   49:iload_3         
	//*  27   50:aload_1         
	//*  28   51:invokevirtual   #440 <Method int View.getBottom()>
	//*  29   54:icmpge          60
						flag = true;
	//   30   57:iconst_1        
	//   31   58:istore          4
				}
			}
		}
		return flag;
	//   32   60:iload           4
	//   33   62:ireturn         
	}

	public void processTouchEvent(MotionEvent motionevent)
	{
		int i;
		int j1;
		int i2;
		int k2;
		k2 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #524 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          9
		i2 = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #527 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          8
		if(k2 == 0)
	//*   6   12:iload           9
	//*   7   14:ifne            21
			cancel();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #417 <Method void cancel()>
		if(mVelocityTracker == null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//*  12   25:ifnonnull       35
			mVelocityTracker = VelocityTracker.obtain();
	//   13   28:aload_0         
	//   14   29:invokestatic    #531 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #365 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #534 <Method void VelocityTracker.addMovement(MotionEvent)>
		j1 = 0;
	//   20   43:iconst_0        
	//   21   44:istore          7
		i = 0;
	//   22   46:iconst_0        
	//   23   47:istore          6
		k2;
	//   24   49:iload           9
		JVM INSTR tableswitch 0 6: default 92
	//	               0 630
	//	               1 613
	//	               2 361
	//	               3 342
	//	               4 92
	//	               5 231
	//	               6 93;
	//   25   51:tableswitch     0 6: default 92
	//	               0 630
	//	               1 613
	//	               2 361
	//	               3 342
	//	               4 92
	//	               5 231
	//	               6 93
		   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
		return;
	//   26   92:return          
_L7:
		j1 = motionevent.getPointerId(i2);
	//   27   93:aload_1         
	//   28   94:iload           8
	//   29   96:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   30   99:istore          7
		if(mDragState != 1 || j1 != mActivePointerId) goto _L9; else goto _L8
	//   31  101:aload_0         
	//   32  102:getfield        #268 <Field int mDragState>
	//   33  105:iconst_1        
	//   34  106:icmpne          224
	//   35  109:iload           7
	//   36  111:aload_0         
	//   37  112:getfield        #89  <Field int mActivePointerId>
	//   38  115:icmpne          224
_L8:
		i2 = motionevent.getPointerCount();
	//   39  118:aload_1         
	//   40  119:invokevirtual   #402 <Method int MotionEvent.getPointerCount()>
	//   41  122:istore          8
_L15:
		if(i >= i2)
			break; /* Loop/switch isn't completed */
	//   42  124:iload           6
	//   43  126:iload           8
	//   44  128:icmpge          211
		k2 = motionevent.getPointerId(i);
	//   45  131:aload_1         
	//   46  132:iload           6
	//   47  134:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   48  137:istore          9
		if(k2 != mActivePointerId) goto _L11; else goto _L10
	//   49  139:iload           9
	//   50  141:aload_0         
	//   51  142:getfield        #89  <Field int mActivePointerId>
	//   52  145:icmpne          151
	//*  53  148:goto            202
_L11:
		float f;
		float f5;
		f = motionevent.getX(i);
	//   54  151:aload_1         
	//   55  152:iload           6
	//   56  154:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//   57  157:fstore_2        
		f5 = motionevent.getY(i);
	//   58  158:aload_1         
	//   59  159:iload           6
	//   60  161:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//   61  164:fstore_3        
		if(findTopChildUnder((int)f, (int)f5) != mCapturedView || !tryCaptureViewForDrag(mCapturedView, k2)) goto _L10; else goto _L12
	//   62  165:aload_0         
	//   63  166:fload_2         
	//   64  167:f2i             
	//   65  168:fload_3         
	//   66  169:f2i             
	//   67  170:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//   68  173:aload_0         
	//   69  174:getfield        #262 <Field View mCapturedView>
	//   70  177:if_acmpne       202
	//   71  180:aload_0         
	//   72  181:aload_0         
	//   73  182:getfield        #262 <Field View mCapturedView>
	//   74  185:iload           9
	//   75  187:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//   76  190:ifeq            202
_L12:
		i = mActivePointerId;
	//   77  193:aload_0         
	//   78  194:getfield        #89  <Field int mActivePointerId>
	//   79  197:istore          6
		  goto _L13
	//*  80  199:goto            214
_L10:
		i++;
	//   81  202:iload           6
	//   82  204:iconst_1        
	//   83  205:iadd            
	//   84  206:istore          6
		if(true) goto _L15; else goto _L14
	//   85  208:goto            124
_L14:
		i = -1;
	//   86  211:iconst_m1       
	//   87  212:istore          6
_L13:
		if(i == -1)
	//*  88  214:iload           6
	//*  89  216:iconst_m1       
	//*  90  217:icmpne          224
			releaseViewForPointerUp();
	//   91  220:aload_0         
	//   92  221:invokespecial   #542 <Method void releaseViewForPointerUp()>
_L9:
		clearMotionHistory(j1);
	//   93  224:aload_0         
	//   94  225:iload           7
	//   95  227:invokespecial   #544 <Method void clearMotionHistory(int)>
		return;
	//   96  230:return          
_L6:
		int j = motionevent.getPointerId(i2);
	//   97  231:aload_1         
	//   98  232:iload           8
	//   99  234:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  100  237:istore          6
		float f1 = motionevent.getX(i2);
	//  101  239:aload_1         
	//  102  240:iload           8
	//  103  242:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  104  245:fstore_2        
		float f6 = motionevent.getY(i2);
	//  105  246:aload_1         
	//  106  247:iload           8
	//  107  249:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  108  252:fstore_3        
		saveInitialMotion(f1, f6, j);
	//  109  253:aload_0         
	//  110  254:fload_2         
	//  111  255:fload_3         
	//  112  256:iload           6
	//  113  258:invokespecial   #546 <Method void saveInitialMotion(float, float, int)>
		if(mDragState == 0)
	//* 114  261:aload_0         
	//* 115  262:getfield        #268 <Field int mDragState>
	//* 116  265:ifne            319
		{
			tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f6), j);
	//  117  268:aload_0         
	//  118  269:aload_0         
	//  119  270:fload_2         
	//  120  271:f2i             
	//  121  272:fload_3         
	//  122  273:f2i             
	//  123  274:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  124  277:iload           6
	//  125  279:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//  126  282:pop             
			j1 = mInitialEdgesTouched[j];
	//  127  283:aload_0         
	//  128  284:getfield        #168 <Field int[] mInitialEdgesTouched>
	//  129  287:iload           6
	//  130  289:iaload          
	//  131  290:istore          7
			if((mTrackingEdges & j1) != 0)
	//* 132  292:aload_0         
	//* 133  293:getfield        #170 <Field int mTrackingEdges>
	//* 134  296:iload           7
	//* 135  298:iand            
	//* 136  299:ifeq            707
			{
				mCallback.onEdgeTouched(j1 & mTrackingEdges, j);
	//  137  302:aload_0         
	//  138  303:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//  139  306:iload           7
	//  140  308:aload_0         
	//  141  309:getfield        #170 <Field int mTrackingEdges>
	//  142  312:iand            
	//  143  313:iload           6
	//  144  315:invokevirtual   #549 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
				return;
	//  145  318:return          
			}
		} else
		if(isCapturedViewUnder((int)f1, (int)f6))
	//* 146  319:aload_0         
	//* 147  320:fload_2         
	//* 148  321:f2i             
	//* 149  322:fload_3         
	//* 150  323:f2i             
	//* 151  324:invokevirtual   #551 <Method boolean isCapturedViewUnder(int, int)>
	//* 152  327:ifeq            707
		{
			tryCaptureViewForDrag(mCapturedView, j);
	//  153  330:aload_0         
	//  154  331:aload_0         
	//  155  332:getfield        #262 <Field View mCapturedView>
	//  156  335:iload           6
	//  157  337:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//  158  340:pop             
			return;
	//  159  341:return          
		}
		break; /* Loop/switch isn't completed */
_L5:
		if(mDragState == 1)
	//* 160  342:aload_0         
	//* 161  343:getfield        #268 <Field int mDragState>
	//* 162  346:iconst_1        
	//* 163  347:icmpne          356
			dispatchViewReleased(0.0F, 0.0F);
	//  164  350:aload_0         
	//  165  351:fconst_0        
	//  166  352:fconst_0        
	//  167  353:invokespecial   #382 <Method void dispatchViewReleased(float, float)>
		cancel();
	//  168  356:aload_0         
	//  169  357:invokevirtual   #417 <Method void cancel()>
		return;
	//  170  360:return          
_L4:
		if(mDragState == 1)
	//* 171  361:aload_0         
	//* 172  362:getfield        #268 <Field int mDragState>
	//* 173  365:iconst_1        
	//* 174  366:icmpne          467
			if(!isValidPointerForActionMove(mActivePointerId))
	//* 175  369:aload_0         
	//* 176  370:aload_0         
	//* 177  371:getfield        #89  <Field int mActivePointerId>
	//* 178  374:invokespecial   #407 <Method boolean isValidPointerForActionMove(int)>
	//* 179  377:ifne            381
			{
				return;
	//  180  380:return          
			} else
			{
				int k = motionevent.findPointerIndex(mActivePointerId);
	//  181  381:aload_1         
	//  182  382:aload_0         
	//  183  383:getfield        #89  <Field int mActivePointerId>
	//  184  386:invokevirtual   #554 <Method int MotionEvent.findPointerIndex(int)>
	//  185  389:istore          6
				float f2 = motionevent.getX(k);
	//  186  391:aload_1         
	//  187  392:iload           6
	//  188  394:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  189  397:fstore_2        
				float f7 = motionevent.getY(k);
	//  190  398:aload_1         
	//  191  399:iload           6
	//  192  401:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  193  404:fstore_3        
				k = (int)(f2 - mLastMotionX[mActivePointerId]);
	//  194  405:fload_2         
	//  195  406:aload_0         
	//  196  407:getfield        #206 <Field float[] mLastMotionX>
	//  197  410:aload_0         
	//  198  411:getfield        #89  <Field int mActivePointerId>
	//  199  414:faload          
	//  200  415:fsub            
	//  201  416:f2i             
	//  202  417:istore          6
				j1 = (int)(f7 - mLastMotionY[mActivePointerId]);
	//  203  419:fload_3         
	//  204  420:aload_0         
	//  205  421:getfield        #208 <Field float[] mLastMotionY>
	//  206  424:aload_0         
	//  207  425:getfield        #89  <Field int mActivePointerId>
	//  208  428:faload          
	//  209  429:fsub            
	//  210  430:f2i             
	//  211  431:istore          7
				dragTo(mCapturedView.getLeft() + k, mCapturedView.getTop() + j1, k, j1);
	//  212  433:aload_0         
	//  213  434:aload_0         
	//  214  435:getfield        #262 <Field View mCapturedView>
	//  215  438:invokevirtual   #283 <Method int View.getLeft()>
	//  216  441:iload           6
	//  217  443:iadd            
	//  218  444:aload_0         
	//  219  445:getfield        #262 <Field View mCapturedView>
	//  220  448:invokevirtual   #286 <Method int View.getTop()>
	//  221  451:iload           7
	//  222  453:iadd            
	//  223  454:iload           6
	//  224  456:iload           7
	//  225  458:invokespecial   #556 <Method void dragTo(int, int, int, int)>
				saveLastMotion(motionevent);
	//  226  461:aload_0         
	//  227  462:aload_1         
	//  228  463:invokespecial   #558 <Method void saveLastMotion(MotionEvent)>
				return;
	//  229  466:return          
			}
		int j2 = motionevent.getPointerCount();
	//  230  467:aload_1         
	//  231  468:invokevirtual   #402 <Method int MotionEvent.getPointerCount()>
	//  232  471:istore          8
		for(int l = j1; l < j2; l++)
	//* 233  473:iload           7
	//* 234  475:istore          6
	//* 235  477:iload           6
	//* 236  479:iload           8
	//* 237  481:icmpge          607
		{
			int k1 = motionevent.getPointerId(l);
	//  238  484:aload_1         
	//  239  485:iload           6
	//  240  487:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  241  490:istore          7
			if(!isValidPointerForActionMove(k1))
	//* 242  492:aload_0         
	//* 243  493:iload           7
	//* 244  495:invokespecial   #407 <Method boolean isValidPointerForActionMove(int)>
	//* 245  498:ifne            504
				continue;
	//  246  501:goto            598
			float f3 = motionevent.getX(l);
	//  247  504:aload_1         
	//  248  505:iload           6
	//  249  507:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  250  510:fstore_2        
			float f8 = motionevent.getY(l);
	//  251  511:aload_1         
	//  252  512:iload           6
	//  253  514:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  254  517:fstore_3        
			float f10 = f3 - mInitialMotionX[k1];
	//  255  518:fload_2         
	//  256  519:aload_0         
	//  257  520:getfield        #196 <Field float[] mInitialMotionX>
	//  258  523:iload           7
	//  259  525:faload          
	//  260  526:fsub            
	//  261  527:fstore          4
			float f11 = f8 - mInitialMotionY[k1];
	//  262  529:fload_3         
	//  263  530:aload_0         
	//  264  531:getfield        #204 <Field float[] mInitialMotionY>
	//  265  534:iload           7
	//  266  536:faload          
	//  267  537:fsub            
	//  268  538:fstore          5
			reportNewEdgeDrags(f10, f11, k1);
	//  269  540:aload_0         
	//  270  541:fload           4
	//  271  543:fload           5
	//  272  545:iload           7
	//  273  547:invokespecial   #560 <Method void reportNewEdgeDrags(float, float, int)>
			if(mDragState == 1)
	//* 274  550:aload_0         
	//* 275  551:getfield        #268 <Field int mDragState>
	//* 276  554:iconst_1        
	//* 277  555:icmpne          561
				break;
	//  278  558:goto            607
			View view = findTopChildUnder((int)f3, (int)f8);
	//  279  561:aload_0         
	//  280  562:fload_2         
	//  281  563:f2i             
	//  282  564:fload_3         
	//  283  565:f2i             
	//  284  566:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  285  569:astore          10
			if(checkTouchSlop(view, f10, f11) && tryCaptureViewForDrag(view, k1))
	//* 286  571:aload_0         
	//* 287  572:aload           10
	//* 288  574:fload           4
	//* 289  576:fload           5
	//* 290  578:invokespecial   #562 <Method boolean checkTouchSlop(View, float, float)>
	//* 291  581:ifeq            598
	//* 292  584:aload_0         
	//* 293  585:aload           10
	//* 294  587:iload           7
	//* 295  589:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//* 296  592:ifeq            598
				break;
	//  297  595:goto            607
		}

	//  298  598:iload           6
	//  299  600:iconst_1        
	//  300  601:iadd            
	//  301  602:istore          6
	//* 302  604:goto            477
		saveLastMotion(motionevent);
	//  303  607:aload_0         
	//  304  608:aload_1         
	//  305  609:invokespecial   #558 <Method void saveLastMotion(MotionEvent)>
		return;
	//  306  612:return          
_L3:
		if(mDragState == 1)
	//* 307  613:aload_0         
	//* 308  614:getfield        #268 <Field int mDragState>
	//* 309  617:iconst_1        
	//* 310  618:icmpne          625
			releaseViewForPointerUp();
	//  311  621:aload_0         
	//  312  622:invokespecial   #542 <Method void releaseViewForPointerUp()>
		cancel();
	//  313  625:aload_0         
	//  314  626:invokevirtual   #417 <Method void cancel()>
		return;
	//  315  629:return          
_L2:
		float f4 = motionevent.getX();
	//  316  630:aload_1         
	//  317  631:invokevirtual   #564 <Method float MotionEvent.getX()>
	//  318  634:fstore_2        
		float f9 = motionevent.getY();
	//  319  635:aload_1         
	//  320  636:invokevirtual   #566 <Method float MotionEvent.getY()>
	//  321  639:fstore_3        
		int i1 = motionevent.getPointerId(0);
	//  322  640:aload_1         
	//  323  641:iconst_0        
	//  324  642:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  325  645:istore          6
		motionevent = ((MotionEvent) (findTopChildUnder((int)f4, (int)f9)));
	//  326  647:aload_0         
	//  327  648:fload_2         
	//  328  649:f2i             
	//  329  650:fload_3         
	//  330  651:f2i             
	//  331  652:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  332  655:astore_1        
		saveInitialMotion(f4, f9, i1);
	//  333  656:aload_0         
	//  334  657:fload_2         
	//  335  658:fload_3         
	//  336  659:iload           6
	//  337  661:invokespecial   #546 <Method void saveInitialMotion(float, float, int)>
		tryCaptureViewForDrag(((View) (motionevent)), i1);
	//  338  664:aload_0         
	//  339  665:aload_1         
	//  340  666:iload           6
	//  341  668:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//  342  671:pop             
		int l1 = mInitialEdgesTouched[i1];
	//  343  672:aload_0         
	//  344  673:getfield        #168 <Field int[] mInitialEdgesTouched>
	//  345  676:iload           6
	//  346  678:iaload          
	//  347  679:istore          7
		if((mTrackingEdges & l1) != 0)
	//* 348  681:aload_0         
	//* 349  682:getfield        #170 <Field int mTrackingEdges>
	//* 350  685:iload           7
	//* 351  687:iand            
	//* 352  688:ifeq            707
			mCallback.onEdgeTouched(l1 & mTrackingEdges, i1);
	//  353  691:aload_0         
	//  354  692:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//  355  695:iload           7
	//  356  697:aload_0         
	//  357  698:getfield        #170 <Field int mTrackingEdges>
	//  358  701:iand            
	//  359  702:iload           6
	//  360  704:invokevirtual   #549 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
	//  361  707:return          
	}

	void setDragState(int i)
	{
		mParentView.removeCallbacks(mSetIdleRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ViewGroup mParentView>
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field Runnable mSetIdleRunnable>
	//    4    8:invokevirtual   #569 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    5   11:pop             
		if(mDragState != i)
	//*   6   12:aload_0         
	//*   7   13:getfield        #268 <Field int mDragState>
	//*   8   16:iload_1         
	//*   9   17:icmpeq          45
		{
			mDragState = i;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:putfield        #268 <Field int mDragState>
			mCallback.onViewDragStateChanged(i);
	//   13   25:aload_0         
	//   14   26:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #572 <Method void ViewDragHelper$Callback.onViewDragStateChanged(int)>
			if(mDragState == 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #268 <Field int mDragState>
	//*  19   37:ifne            45
				mCapturedView = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #262 <Field View mCapturedView>
		}
	//   23   45:return          
	}

	public void setEdgeTrackingEnabled(int i)
	{
		mTrackingEdges = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #170 <Field int mTrackingEdges>
	//    3    5:return          
	}

	public void setMinVelocity(float f)
	{
		mMinVelocity = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #150 <Field float mMinVelocity>
	//    3    5:return          
	}

	public boolean settleCapturedViewAt(int i, int j)
	{
		if(!mReleaseInProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field boolean mReleaseInProgress>
	//*   2    4:ifne            18
			throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
	//    3    7:new             #497 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #578 <String "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased">
	//    6   14:invokespecial   #500 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return forceSettleCapturedViewAt(i, j, (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId));
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:iload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   13   25:aload_0         
	//   14   26:getfield        #89  <Field int mActivePointerId>
	//   15   29:invokevirtual   #375 <Method float VelocityTracker.getXVelocity(int)>
	//   16   32:f2i             
	//   17   33:aload_0         
	//   18   34:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   19   37:aload_0         
	//   20   38:getfield        #89  <Field int mActivePointerId>
	//   21   41:invokevirtual   #380 <Method float VelocityTracker.getYVelocity(int)>
	//   22   44:f2i             
	//   23   45:invokespecial   #580 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
	//   24   48:ireturn         
	}

	public boolean shouldInterceptTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #524 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          7
		int i = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #527 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          6
		if(i1 == 0)
	//*   6   12:iload           7
	//*   7   14:ifne            21
			cancel();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #417 <Method void cancel()>
		if(mVelocityTracker == null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//*  12   25:ifnonnull       35
			mVelocityTracker = VelocityTracker.obtain();
	//   13   28:aload_0         
	//   14   29:invokestatic    #531 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #365 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #534 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(i1)
	//*  20   43:iload           7
		{
		case 4: // '\004'
		default:
			break;

	//*  21   45:tableswitch     0 6: default 88
	//	               0 529
	//	               1 522
	//	               2 215
	//	               3 522
	//	               4 88
	//	               5 104
	//	               6 91
	//*  22   88:goto            622
		case 6: // '\006'
			clearMotionHistory(motionevent.getPointerId(i));
	//   23   91:aload_0         
	//   24   92:aload_1         
	//   25   93:iload           6
	//   26   95:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   27   98:invokespecial   #544 <Method void clearMotionHistory(int)>
			break;
	//   28  101:goto            88

		case 5: // '\005'
			int j1 = motionevent.getPointerId(i);
	//   29  104:aload_1         
	//   30  105:iload           6
	//   31  107:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   32  110:istore          7
			float f = motionevent.getX(i);
	//   33  112:aload_1         
	//   34  113:iload           6
	//   35  115:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//   36  118:fstore_2        
			float f3 = motionevent.getY(i);
	//   37  119:aload_1         
	//   38  120:iload           6
	//   39  122:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//   40  125:fstore_3        
			saveInitialMotion(f, f3, j1);
	//   41  126:aload_0         
	//   42  127:fload_2         
	//   43  128:fload_3         
	//   44  129:iload           7
	//   45  131:invokespecial   #546 <Method void saveInitialMotion(float, float, int)>
			if(mDragState == 0)
	//*  46  134:aload_0         
	//*  47  135:getfield        #268 <Field int mDragState>
	//*  48  138:ifne            179
			{
				int j = mInitialEdgesTouched[j1];
	//   49  141:aload_0         
	//   50  142:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   51  145:iload           7
	//   52  147:iaload          
	//   53  148:istore          6
				if((mTrackingEdges & j) != 0)
	//*  54  150:aload_0         
	//*  55  151:getfield        #170 <Field int mTrackingEdges>
	//*  56  154:iload           6
	//*  57  156:iand            
	//*  58  157:ifeq            88
					mCallback.onEdgeTouched(j & mTrackingEdges, j1);
	//   59  160:aload_0         
	//   60  161:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//   61  164:iload           6
	//   62  166:aload_0         
	//   63  167:getfield        #170 <Field int mTrackingEdges>
	//   64  170:iand            
	//   65  171:iload           7
	//   66  173:invokevirtual   #549 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
				break;
	//   67  176:goto            88
			}
			if(mDragState != 2)
				break;
	//   68  179:aload_0         
	//   69  180:getfield        #268 <Field int mDragState>
	//   70  183:iconst_2        
	//   71  184:icmpne          88
			motionevent = ((MotionEvent) (findTopChildUnder((int)f, (int)f3)));
	//   72  187:aload_0         
	//   73  188:fload_2         
	//   74  189:f2i             
	//   75  190:fload_3         
	//   76  191:f2i             
	//   77  192:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//   78  195:astore_1        
			if(motionevent == mCapturedView)
	//*  79  196:aload_1         
	//*  80  197:aload_0         
	//*  81  198:getfield        #262 <Field View mCapturedView>
	//*  82  201:if_acmpne       88
				tryCaptureViewForDrag(((View) (motionevent)), j1);
	//   83  204:aload_0         
	//   84  205:aload_1         
	//   85  206:iload           7
	//   86  208:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//   87  211:pop             
			break;
	//   88  212:goto            88

		case 2: // '\002'
			if(mInitialMotionX == null || mInitialMotionY == null)
	//*  89  215:aload_0         
	//*  90  216:getfield        #196 <Field float[] mInitialMotionX>
	//*  91  219:ifnull          88
	//*  92  222:aload_0         
	//*  93  223:getfield        #204 <Field float[] mInitialMotionY>
	//*  94  226:ifnonnull       232
				break;
	//   95  229:goto            88
			int l1 = motionevent.getPointerCount();
	//   96  232:aload_1         
	//   97  233:invokevirtual   #402 <Method int MotionEvent.getPointerCount()>
	//   98  236:istore          8
			for(int k = 0; k < l1; k++)
	//*  99  238:iconst_0        
	//* 100  239:istore          6
	//* 101  241:iload           6
	//* 102  243:iload           8
	//* 103  245:icmpge          514
			{
				int i2 = motionevent.getPointerId(k);
	//  104  248:aload_1         
	//  105  249:iload           6
	//  106  251:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  107  254:istore          9
				if(!isValidPointerForActionMove(i2))
	//* 108  256:aload_0         
	//* 109  257:iload           9
	//* 110  259:invokespecial   #407 <Method boolean isValidPointerForActionMove(int)>
	//* 111  262:ifne            268
					continue;
	//  112  265:goto            505
				float f1 = motionevent.getX(k);
	//  113  268:aload_1         
	//  114  269:iload           6
	//  115  271:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  116  274:fstore_2        
				float f4 = motionevent.getY(k);
	//  117  275:aload_1         
	//  118  276:iload           6
	//  119  278:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  120  281:fstore_3        
				float f6 = f1 - mInitialMotionX[i2];
	//  121  282:fload_2         
	//  122  283:aload_0         
	//  123  284:getfield        #196 <Field float[] mInitialMotionX>
	//  124  287:iload           9
	//  125  289:faload          
	//  126  290:fsub            
	//  127  291:fstore          4
				float f7 = f4 - mInitialMotionY[i2];
	//  128  293:fload_3         
	//  129  294:aload_0         
	//  130  295:getfield        #204 <Field float[] mInitialMotionY>
	//  131  298:iload           9
	//  132  300:faload          
	//  133  301:fsub            
	//  134  302:fstore          5
				View view = findTopChildUnder((int)f1, (int)f4);
	//  135  304:aload_0         
	//  136  305:fload_2         
	//  137  306:f2i             
	//  138  307:fload_3         
	//  139  308:f2i             
	//  140  309:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  141  312:astore          17
				boolean flag;
				if(view != null && checkTouchSlop(view, f6, f7))
	//* 142  314:aload           17
	//* 143  316:ifnull          338
	//* 144  319:aload_0         
	//* 145  320:aload           17
	//* 146  322:fload           4
	//* 147  324:fload           5
	//* 148  326:invokespecial   #562 <Method boolean checkTouchSlop(View, float, float)>
	//* 149  329:ifeq            338
					flag = true;
	//  150  332:iconst_1        
	//  151  333:istore          7
				else
	//* 152  335:goto            341
					flag = false;
	//  153  338:iconst_0        
	//  154  339:istore          7
				if(flag)
	//* 155  341:iload           7
	//* 156  343:ifeq            465
				{
					int j2 = view.getLeft();
	//  157  346:aload           17
	//  158  348:invokevirtual   #283 <Method int View.getLeft()>
	//  159  351:istore          10
					int k2 = (int)f6;
	//  160  353:fload           4
	//  161  355:f2i             
	//  162  356:istore          11
					k2 = mCallback.clampViewPositionHorizontal(view, j2 + k2, k2);
	//  163  358:aload_0         
	//  164  359:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//  165  362:aload           17
	//  166  364:iload           10
	//  167  366:iload           11
	//  168  368:iadd            
	//  169  369:iload           11
	//  170  371:invokevirtual   #290 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//  171  374:istore          11
					int l2 = view.getTop();
	//  172  376:aload           17
	//  173  378:invokevirtual   #286 <Method int View.getTop()>
	//  174  381:istore          12
					int i3 = (int)f7;
	//  175  383:fload           5
	//  176  385:f2i             
	//  177  386:istore          13
					i3 = mCallback.clampViewPositionVertical(view, l2 + i3, i3);
	//  178  388:aload_0         
	//  179  389:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//  180  392:aload           17
	//  181  394:iload           12
	//  182  396:iload           13
	//  183  398:iadd            
	//  184  399:iload           13
	//  185  401:invokevirtual   #299 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//  186  404:istore          13
					int j3 = mCallback.getViewHorizontalDragRange(view);
	//  187  406:aload_0         
	//  188  407:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//  189  410:aload           17
	//  190  412:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//  191  415:istore          14
					int k3 = mCallback.getViewVerticalDragRange(view);
	//  192  417:aload_0         
	//  193  418:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//  194  421:aload           17
	//  195  423:invokevirtual   #187 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//  196  426:istore          15
					if((j3 == 0 || j3 > 0 && k2 == j2) && (k3 == 0 || k3 > 0 && i3 == l2))
	//* 197  428:iload           14
	//* 198  430:ifeq            445
	//* 199  433:iload           14
	//* 200  435:ifle            465
	//* 201  438:iload           11
	//* 202  440:iload           10
	//* 203  442:icmpne          465
	//* 204  445:iload           15
	//* 205  447:ifeq            514
	//* 206  450:iload           15
	//* 207  452:ifle            465
	//* 208  455:iload           13
	//* 209  457:iload           12
	//* 210  459:icmpne          465
						break;
	//  211  462:goto            514
				}
				reportNewEdgeDrags(f6, f7, i2);
	//  212  465:aload_0         
	//  213  466:fload           4
	//  214  468:fload           5
	//  215  470:iload           9
	//  216  472:invokespecial   #560 <Method void reportNewEdgeDrags(float, float, int)>
				if(mDragState == 1 || flag && tryCaptureViewForDrag(view, i2))
	//* 217  475:aload_0         
	//* 218  476:getfield        #268 <Field int mDragState>
	//* 219  479:iconst_1        
	//* 220  480:icmpne          486
	//* 221  483:goto            514
	//* 222  486:iload           7
	//* 223  488:ifeq            505
	//* 224  491:aload_0         
	//* 225  492:aload           17
	//* 226  494:iload           9
	//* 227  496:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//* 228  499:ifeq            505
					break;
	//  229  502:goto            514
			}

	//  230  505:iload           6
	//  231  507:iconst_1        
	//  232  508:iadd            
	//  233  509:istore          6
	//* 234  511:goto            241
			saveLastMotion(motionevent);
	//  235  514:aload_0         
	//  236  515:aload_1         
	//  237  516:invokespecial   #558 <Method void saveLastMotion(MotionEvent)>
			break;
	//  238  519:goto            88

		case 1: // '\001'
		case 3: // '\003'
			cancel();
	//  239  522:aload_0         
	//  240  523:invokevirtual   #417 <Method void cancel()>
			break;
	//  241  526:goto            88

		case 0: // '\0'
			float f2 = motionevent.getX();
	//  242  529:aload_1         
	//  243  530:invokevirtual   #564 <Method float MotionEvent.getX()>
	//  244  533:fstore_2        
			float f5 = motionevent.getY();
	//  245  534:aload_1         
	//  246  535:invokevirtual   #566 <Method float MotionEvent.getY()>
	//  247  538:fstore_3        
			int l = motionevent.getPointerId(0);
	//  248  539:aload_1         
	//  249  540:iconst_0        
	//  250  541:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  251  544:istore          6
			saveInitialMotion(f2, f5, l);
	//  252  546:aload_0         
	//  253  547:fload_2         
	//  254  548:fload_3         
	//  255  549:iload           6
	//  256  551:invokespecial   #546 <Method void saveInitialMotion(float, float, int)>
			motionevent = ((MotionEvent) (findTopChildUnder((int)f2, (int)f5)));
	//  257  554:aload_0         
	//  258  555:fload_2         
	//  259  556:f2i             
	//  260  557:fload_3         
	//  261  558:f2i             
	//  262  559:invokevirtual   #536 <Method View findTopChildUnder(int, int)>
	//  263  562:astore_1        
			if(motionevent == mCapturedView && mDragState == 2)
	//* 264  563:aload_1         
	//* 265  564:aload_0         
	//* 266  565:getfield        #262 <Field View mCapturedView>
	//* 267  568:if_acmpne       587
	//* 268  571:aload_0         
	//* 269  572:getfield        #268 <Field int mDragState>
	//* 270  575:iconst_2        
	//* 271  576:icmpne          587
				tryCaptureViewForDrag(((View) (motionevent)), l);
	//  272  579:aload_0         
	//  273  580:aload_1         
	//  274  581:iload           6
	//  275  583:invokevirtual   #540 <Method boolean tryCaptureViewForDrag(View, int)>
	//  276  586:pop             
			int k1 = mInitialEdgesTouched[l];
	//  277  587:aload_0         
	//  278  588:getfield        #168 <Field int[] mInitialEdgesTouched>
	//  279  591:iload           6
	//  280  593:iaload          
	//  281  594:istore          7
			if((mTrackingEdges & k1) != 0)
	//* 282  596:aload_0         
	//* 283  597:getfield        #170 <Field int mTrackingEdges>
	//* 284  600:iload           7
	//* 285  602:iand            
	//* 286  603:ifeq            622
				mCallback.onEdgeTouched(k1 & mTrackingEdges, l);
	//  287  606:aload_0         
	//  288  607:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//  289  610:iload           7
	//  290  612:aload_0         
	//  291  613:getfield        #170 <Field int mTrackingEdges>
	//  292  616:iand            
	//  293  617:iload           6
	//  294  619:invokevirtual   #549 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
			break;
		}
		boolean flag1 = false;
	//  295  622:iconst_0        
	//  296  623:istore          16
		if(mDragState == 1)
	//* 297  625:aload_0         
	//* 298  626:getfield        #268 <Field int mDragState>
	//* 299  629:iconst_1        
	//* 300  630:icmpne          636
			flag1 = true;
	//  301  633:iconst_1        
	//  302  634:istore          16
		return flag1;
	//  303  636:iload           16
	//  304  638:ireturn         
	}

	public boolean smoothSlideViewTo(View view, int i, int j)
	{
		mCapturedView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #262 <Field View mCapturedView>
		mActivePointerId = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #89  <Field int mActivePointerId>
		boolean flag = forceSettleCapturedViewAt(i, j, 0, 0);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:iconst_0        
	//   10   14:iconst_0        
	//   11   15:invokespecial   #580 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
	//   12   18:istore          4
		if(!flag && mDragState == 0 && mCapturedView != null)
	//*  13   20:iload           4
	//*  14   22:ifne            44
	//*  15   25:aload_0         
	//*  16   26:getfield        #268 <Field int mDragState>
	//*  17   29:ifne            44
	//*  18   32:aload_0         
	//*  19   33:getfield        #262 <Field View mCapturedView>
	//*  20   36:ifnull          44
			mCapturedView = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #262 <Field View mCapturedView>
		return flag;
	//   24   44:iload           4
	//   25   46:ireturn         
	}

	boolean tryCaptureViewForDrag(View view, int i)
	{
		if(view == mCapturedView && mActivePointerId == i)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #262 <Field View mCapturedView>
	//*   3    5:if_acmpne       18
	//*   4    8:aload_0         
	//*   5    9:getfield        #89  <Field int mActivePointerId>
	//*   6   12:iload_2         
	//*   7   13:icmpne          18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(view != null && mCallback.tryCaptureView(view, i))
	//*  10   18:aload_1         
	//*  11   19:ifnull          47
	//*  12   22:aload_0         
	//*  13   23:getfield        #107 <Field ViewDragHelper$Callback mCallback>
	//*  14   26:aload_1         
	//*  15   27:iload_2         
	//*  16   28:invokevirtual   #586 <Method boolean ViewDragHelper$Callback.tryCaptureView(View, int)>
	//*  17   31:ifeq            47
		{
			mActivePointerId = i;
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:putfield        #89  <Field int mActivePointerId>
			captureChildView(view, i);
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:iload_2         
	//   24   42:invokevirtual   #588 <Method void captureChildView(View, int)>
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
