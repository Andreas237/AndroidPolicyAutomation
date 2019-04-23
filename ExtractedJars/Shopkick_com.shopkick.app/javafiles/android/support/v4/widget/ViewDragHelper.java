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
		if(viewgroup != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          117
		{
			if(callback != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          107
			{
				mParentView = viewgroup;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #96  <Field ViewGroup mParentView>
				mCallback = callback;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:putfield        #98  <Field ViewDragHelper$Callback mCallback>
				viewgroup = ((ViewGroup) (ViewConfiguration.get(context)));
	//   21   39:aload_1         
	//   22   40:invokestatic    #104 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   23   43:astore_2        
				mEdgeSize = (int)(context.getResources().getDisplayMetrics().density * 20F + 0.5F);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #110 <Method Resources Context.getResources()>
	//   27   49:invokevirtual   #116 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   28   52:getfield        #121 <Field float DisplayMetrics.density>
	//   29   55:ldc1            #122 <Float 20F>
	//   30   57:fmul            
	//   31   58:ldc1            #123 <Float 0.5F>
	//   32   60:fadd            
	//   33   61:f2i             
	//   34   62:putfield        #125 <Field int mEdgeSize>
				mTouchSlop = ((ViewConfiguration) (viewgroup)).getScaledTouchSlop();
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #129 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   38   70:putfield        #131 <Field int mTouchSlop>
				mMaxVelocity = ((ViewConfiguration) (viewgroup)).getScaledMaximumFlingVelocity();
	//   39   73:aload_0         
	//   40   74:aload_2         
	//   41   75:invokevirtual   #134 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   42   78:i2f             
	//   43   79:putfield        #136 <Field float mMaxVelocity>
				mMinVelocity = ((ViewConfiguration) (viewgroup)).getScaledMinimumFlingVelocity();
	//   44   82:aload_0         
	//   45   83:aload_2         
	//   46   84:invokevirtual   #139 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   47   87:i2f             
	//   48   88:putfield        #141 <Field float mMinVelocity>
				mScroller = new OverScroller(context, sInterpolator);
	//   49   91:aload_0         
	//   50   92:new             #143 <Class OverScroller>
	//   51   95:dup             
	//   52   96:aload_1         
	//   53   97:getstatic       #83  <Field Interpolator sInterpolator>
	//   54  100:invokespecial   #146 <Method void OverScroller(Context, Interpolator)>
	//   55  103:putfield        #148 <Field OverScroller mScroller>
				return;
	//   56  106:return          
			} else
			{
				throw new IllegalArgumentException("Callback may not be null");
	//   57  107:new             #150 <Class IllegalArgumentException>
	//   58  110:dup             
	//   59  111:ldc1            #152 <String "Callback may not be null">
	//   60  113:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//   61  116:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Parent view may not be null");
	//   62  117:new             #150 <Class IllegalArgumentException>
	//   63  120:dup             
	//   64  121:ldc1            #157 <String "Parent view may not be null">
	//   65  123:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//   66  126:athrow          
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
	//*  17   28:icmpne          169
	//*  18   31:aload_0         
	//*  19   32:getfield        #170 <Field int mTrackingEdges>
	//*  20   35:iload           4
	//*  21   37:iand            
	//*  22   38:ifeq            169
	//*  23   41:aload_0         
	//*  24   42:getfield        #172 <Field int[] mEdgeDragsLocked>
	//*  25   45:iload_3         
	//*  26   46:iaload          
	//*  27   47:iload           4
	//*  28   49:iand            
	//*  29   50:iload           4
	//*  30   52:icmpeq          169
	//*  31   55:aload_0         
	//*  32   56:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//*  33   59:iload_3         
	//*  34   60:iaload          
	//*  35   61:iload           4
	//*  36   63:iand            
	//*  37   64:iload           4
	//*  38   66:icmpeq          169
		{
			int l = mTouchSlop;
	//   39   69:aload_0         
	//   40   70:getfield        #131 <Field int mTouchSlop>
	//   41   73:istore          5
			if(f <= (float)l && f1 <= (float)l)
	//*  42   75:fload_1         
	//*  43   76:iload           5
	//*  44   78:i2f             
	//*  45   79:fcmpg           
	//*  46   80:ifgt            93
	//*  47   83:fload_2         
	//*  48   84:iload           5
	//*  49   86:i2f             
	//*  50   87:fcmpg           
	//*  51   88:ifgt            93
				return false;
	//   52   91:iconst_0        
	//   53   92:ireturn         
			if(f < f1 * 0.5F && mCallback.onEdgeLock(j))
	//*  54   93:fload_1         
	//*  55   94:fload_2         
	//*  56   95:ldc1            #123 <Float 0.5F>
	//*  57   97:fmul            
	//*  58   98:fcmpg           
	//*  59   99:ifge            133
	//*  60  102:aload_0         
	//*  61  103:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//*  62  106:iload           4
	//*  63  108:invokevirtual   #178 <Method boolean ViewDragHelper$Callback.onEdgeLock(int)>
	//*  64  111:ifeq            133
			{
				int ai[] = mEdgeDragsLocked;
	//   65  114:aload_0         
	//   66  115:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   67  118:astore          8
				ai[i] = ai[i] | j;
	//   68  120:aload           8
	//   69  122:iload_3         
	//   70  123:aload           8
	//   71  125:iload_3         
	//   72  126:iaload          
	//   73  127:iload           4
	//   74  129:ior             
	//   75  130:iastore         
				return false;
	//   76  131:iconst_0        
	//   77  132:ireturn         
			}
			boolean flag = flag1;
	//   78  133:iload           7
	//   79  135:istore          6
			if((mEdgeDragsInProgress[i] & j) == 0)
	//*  80  137:aload_0         
	//*  81  138:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//*  82  141:iload_3         
	//*  83  142:iaload          
	//*  84  143:iload           4
	//*  85  145:iand            
	//*  86  146:ifne            166
			{
				flag = flag1;
	//   87  149:iload           7
	//   88  151:istore          6
				if(f > (float)mTouchSlop)
	//*  89  153:fload_1         
	//*  90  154:aload_0         
	//*  91  155:getfield        #131 <Field int mTouchSlop>
	//*  92  158:i2f             
	//*  93  159:fcmpl           
	//*  94  160:ifle            166
					flag = true;
	//   95  163:iconst_1        
	//   96  164:istore          6
			}
			return flag;
	//   97  166:iload           6
	//   98  168:ireturn         
		} else
		{
			return false;
	//   99  169:iconst_0        
	//  100  170:ireturn         
		}
	}

	private boolean checkTouchSlop(View view, float f, float f1)
	{
		boolean flag4 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		boolean flag5 = false;
	//    2    3:iconst_0        
	//    3    4:istore          8
		boolean flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          6
		if(view == null)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       15
			return false;
	//    8   13:iconst_0        
	//    9   14:ireturn         
		int i;
		if(mCallback.getViewHorizontalDragRange(view) > 0)
	//*  10   15:aload_0         
	//*  11   16:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//*  12   19:aload_1         
	//*  13   20:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//*  14   23:ifle            32
			i = 1;
	//   15   26:iconst_1        
	//   16   27:istore          4
		else
	//*  17   29:goto            35
			i = 0;
	//   18   32:iconst_0        
	//   19   33:istore          4
		boolean flag;
		if(mCallback.getViewVerticalDragRange(view) > 0)
	//*  20   35:aload_0         
	//*  21   36:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//*  22   39:aload_1         
	//*  23   40:invokevirtual   #187 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//*  24   43:ifle            52
			flag = true;
	//   25   46:iconst_1        
	//   26   47:istore          5
		else
	//*  27   49:goto            55
			flag = false;
	//   28   52:iconst_0        
	//   29   53:istore          5
		if(i != 0 && flag)
	//*  30   55:iload           4
	//*  31   57:ifeq            94
	//*  32   60:iload           5
	//*  33   62:ifeq            94
		{
			i = mTouchSlop;
	//   34   65:aload_0         
	//   35   66:getfield        #131 <Field int mTouchSlop>
	//   36   69:istore          4
			if(f * f + f1 * f1 > (float)(i * i))
	//*  37   71:fload_2         
	//*  38   72:fload_2         
	//*  39   73:fmul            
	//*  40   74:fload_3         
	//*  41   75:fload_3         
	//*  42   76:fmul            
	//*  43   77:fadd            
	//*  44   78:iload           4
	//*  45   80:iload           4
	//*  46   82:imul            
	//*  47   83:i2f             
	//*  48   84:fcmpl           
	//*  49   85:ifle            91
				flag1 = true;
	//   50   88:iconst_1        
	//   51   89:istore          6
			return flag1;
	//   52   91:iload           6
	//   53   93:ireturn         
		}
		if(i != 0)
	//*  54   94:iload           4
	//*  55   96:ifeq            122
		{
			boolean flag2 = flag4;
	//   56   99:iload           7
	//   57  101:istore          6
			if(Math.abs(f) > (float)mTouchSlop)
	//*  58  103:fload_2         
	//*  59  104:invokestatic    #166 <Method float Math.abs(float)>
	//*  60  107:aload_0         
	//*  61  108:getfield        #131 <Field int mTouchSlop>
	//*  62  111:i2f             
	//*  63  112:fcmpl           
	//*  64  113:ifle            119
				flag2 = true;
	//   65  116:iconst_1        
	//   66  117:istore          6
			return flag2;
	//   67  119:iload           6
	//   68  121:ireturn         
		}
		if(flag)
	//*  69  122:iload           5
	//*  70  124:ifeq            150
		{
			boolean flag3 = flag5;
	//   71  127:iload           8
	//   72  129:istore          6
			if(Math.abs(f1) > (float)mTouchSlop)
	//*  73  131:fload_3         
	//*  74  132:invokestatic    #166 <Method float Math.abs(float)>
	//*  75  135:aload_0         
	//*  76  136:getfield        #131 <Field int mTouchSlop>
	//*  77  139:i2f             
	//*  78  140:fcmpl           
	//*  79  141:ifle            147
				flag3 = true;
	//   80  144:iconst_1        
	//   81  145:istore          6
			return flag3;
	//   82  147:iload           6
	//   83  149:ireturn         
		} else
		{
			return false;
	//   84  150:iconst_0        
	//   85  151:ireturn         
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
		float af[] = mInitialMotionX;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field float[] mInitialMotionX>
	//    2    4:astore_1        
		if(af == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			Arrays.fill(af, 0.0F);
	//    6   10:aload_1         
	//    7   11:fconst_0        
	//    8   12:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mInitialMotionY, 0.0F);
	//    9   15:aload_0         
	//   10   16:getfield        #204 <Field float[] mInitialMotionY>
	//   11   19:fconst_0        
	//   12   20:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mLastMotionX, 0.0F);
	//   13   23:aload_0         
	//   14   24:getfield        #206 <Field float[] mLastMotionX>
	//   15   27:fconst_0        
	//   16   28:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mLastMotionY, 0.0F);
	//   17   31:aload_0         
	//   18   32:getfield        #208 <Field float[] mLastMotionY>
	//   19   35:fconst_0        
	//   20   36:invokestatic    #202 <Method void Arrays.fill(float[], float)>
			Arrays.fill(mInitialEdgesTouched, 0);
	//   21   39:aload_0         
	//   22   40:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   23   43:iconst_0        
	//   24   44:invokestatic    #211 <Method void Arrays.fill(int[], int)>
			Arrays.fill(mEdgeDragsInProgress, 0);
	//   25   47:aload_0         
	//   26   48:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//   27   51:iconst_0        
	//   28   52:invokestatic    #211 <Method void Arrays.fill(int[], int)>
			Arrays.fill(mEdgeDragsLocked, 0);
	//   29   55:aload_0         
	//   30   56:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   31   59:iconst_0        
	//   32   60:invokestatic    #211 <Method void Arrays.fill(int[], int)>
			mPointersDown = 0;
	//   33   63:aload_0         
	//   34   64:iconst_0        
	//   35   65:putfield        #213 <Field int mPointersDown>
			return;
	//   36   68:return          
		}
	}

	private void clearMotionHistory(int i)
	{
		if(mInitialMotionX != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field float[] mInitialMotionX>
	//*   2    4:ifnull          78
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
				mPointersDown = 1 << i & mPointersDown;
	//   43   65:aload_0         
	//   44   66:iconst_1        
	//   45   67:iload_1         
	//   46   68:ishl            
	//   47   69:aload_0         
	//   48   70:getfield        #213 <Field int mPointersDown>
	//   49   73:iand            
	//   50   74:putfield        #213 <Field int mPointersDown>
				return;
	//   51   77:return          
			}
		} else
		{
			return;
	//   52   78:return          
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
	//    5    7:getfield        #96  <Field ViewGroup mParentView>
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
			i = Math.round(Math.abs((f + f1 * f) / (float)j) * 1000F) * 4;
	//   33   58:fload           4
	//   34   60:fload           5
	//   35   62:fload           4
	//   36   64:fmul            
	//   37   65:fadd            
	//   38   66:iload_2         
	//   39   67:i2f             
	//   40   68:fdiv            
	//   41   69:invokestatic    #166 <Method float Math.abs(float)>
	//   42   72:ldc1            #231 <Float 1000F>
	//   43   74:fmul            
	//   44   75:invokestatic    #235 <Method int Math.round(float)>
	//   45   78:iconst_4        
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
	//    3    4:getfield        #141 <Field float mMinVelocity>
	//    4    7:f2i             
	//    5    8:aload_0         
	//    6    9:getfield        #136 <Field float mMaxVelocity>
	//    7   12:f2i             
	//    8   13:invokespecial   #243 <Method int clampMag(int, int, int)>
	//    9   16:istore          4
		l = clampMag(l, (int)mMinVelocity, (int)mMaxVelocity);
	//   10   18:aload_0         
	//   11   19:iload           5
	//   12   21:aload_0         
	//   13   22:getfield        #141 <Field float mMinVelocity>
	//   14   25:f2i             
	//   15   26:aload_0         
	//   16   27:getfield        #136 <Field float mMaxVelocity>
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
		if(k != 0)
	//*  40   76:iload           4
	//*  41   78:ifeq            94
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
	//*  48   91:goto            104
		{
			f = i1;
	//   49   94:iload           9
	//   50   96:i2f             
	//   51   97:fstore          6
			f1 = j2;
	//   52   99:iload           14
	//   53  101:i2f             
	//   54  102:fstore          7
		}
		float f2 = f / f1;
	//   55  104:fload           6
	//   56  106:fload           7
	//   57  108:fdiv            
	//   58  109:fstore          8
		if(l != 0)
	//*  59  111:iload           5
	//*  60  113:ifeq            129
		{
			f = l1;
	//   61  116:iload           12
	//   62  118:i2f             
	//   63  119:fstore          6
			f1 = i2;
	//   64  121:iload           13
	//   65  123:i2f             
	//   66  124:fstore          7
		} else
	//*  67  126:goto            139
		{
			f = j1;
	//   68  129:iload           10
	//   69  131:i2f             
	//   70  132:fstore          6
			f1 = j2;
	//   71  134:iload           14
	//   72  136:i2f             
	//   73  137:fstore          7
		}
		f /= f1;
	//   74  139:fload           6
	//   75  141:fload           7
	//   76  143:fdiv            
	//   77  144:fstore          6
		i = computeAxisDuration(i, k, mCallback.getViewHorizontalDragRange(view));
	//   78  146:aload_0         
	//   79  147:iload_2         
	//   80  148:iload           4
	//   81  150:aload_0         
	//   82  151:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   83  154:aload_1         
	//   84  155:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//   85  158:invokespecial   #245 <Method int computeAxisDuration(int, int, int)>
	//   86  161:istore_2        
		j = computeAxisDuration(j, l, mCallback.getViewVerticalDragRange(view));
	//   87  162:aload_0         
	//   88  163:iload_3         
	//   89  164:iload           5
	//   90  166:aload_0         
	//   91  167:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   92  170:aload_1         
	//   93  171:invokevirtual   #187 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//   94  174:invokespecial   #245 <Method int computeAxisDuration(int, int, int)>
	//   95  177:istore_3        
		return (int)((float)i * f2 + (float)j * f);
	//   96  178:iload_2         
	//   97  179:i2f             
	//   98  180:fload           8
	//   99  182:fmul            
	//  100  183:iload_3         
	//  101  184:i2f             
	//  102  185:fload           6
	//  103  187:fmul            
	//  104  188:fadd            
	//  105  189:f2i             
	//  106  190:ireturn         
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
	//    6    8:getfield        #131 <Field int mTouchSlop>
	//    7   11:i2f             
	//    8   12:fconst_1        
	//    9   13:fload_1         
	//   10   14:fdiv            
	//   11   15:fmul            
	//   12   16:f2i             
	//   13   17:putfield        #131 <Field int mTouchSlop>
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
	//    4    6:getfield        #98  <Field ViewDragHelper$Callback mCallback>
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
	//    1    1:ldc1            #123 <Float 0.5F>
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
		if(k != 0)
	//*   8   18:iload_3         
	//*   9   19:ifeq            50
		{
			i = mCallback.clampViewPositionHorizontal(mCapturedView, i, k);
	//   10   22:aload_0         
	//   11   23:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   12   26:aload_0         
	//   13   27:getfield        #262 <Field View mCapturedView>
	//   14   30:iload_1         
	//   15   31:iload_3         
	//   16   32:invokevirtual   #290 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//   17   35:istore_1        
			ViewCompat.offsetLeftAndRight(mCapturedView, i - i1);
	//   18   36:aload_0         
	//   19   37:getfield        #262 <Field View mCapturedView>
	//   20   40:iload_1         
	//   21   41:iload           5
	//   22   43:isub            
	//   23   44:invokestatic    #296 <Method void ViewCompat.offsetLeftAndRight(View, int)>
		}
	//*  24   47:goto            50
		if(l != 0)
	//*  25   50:iload           4
	//*  26   52:ifeq            84
		{
			j = mCallback.clampViewPositionVertical(mCapturedView, j, l);
	//   27   55:aload_0         
	//   28   56:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   29   59:aload_0         
	//   30   60:getfield        #262 <Field View mCapturedView>
	//   31   63:iload_2         
	//   32   64:iload           4
	//   33   66:invokevirtual   #299 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//   34   69:istore_2        
			ViewCompat.offsetTopAndBottom(mCapturedView, j - j1);
	//   35   70:aload_0         
	//   36   71:getfield        #262 <Field View mCapturedView>
	//   37   74:iload_2         
	//   38   75:iload           6
	//   39   77:isub            
	//   40   78:invokestatic    #302 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		}
	//*  41   81:goto            84
		if(k != 0 || l != 0)
	//*  42   84:iload_3         
	//*  43   85:ifne            93
	//*  44   88:iload           4
	//*  45   90:ifeq            114
			mCallback.onViewPositionChanged(mCapturedView, i, j, i - i1, j - j1);
	//   46   93:aload_0         
	//   47   94:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   48   97:aload_0         
	//   49   98:getfield        #262 <Field View mCapturedView>
	//   50  101:iload_1         
	//   51  102:iload_2         
	//   52  103:iload_1         
	//   53  104:iload           5
	//   54  106:isub            
	//   55  107:iload_2         
	//   56  108:iload           6
	//   57  110:isub            
	//   58  111:invokevirtual   #306 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
	//   59  114:return          
	}

	private void ensureMotionHistorySizeForId(int i)
	{
		float af[] = mInitialMotionX;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field float[] mInitialMotionX>
	//    2    4:astore_2        
		if(af == null || af.length <= i)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:iload_1         
	//*   8   12:icmpgt          221
		{
			i++;
	//    9   15:iload_1         
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:istore_1        
			float af1[] = new float[i];
	//   13   19:iload_1         
	//   14   20:newarray        float[]
	//   15   22:astore_2        
			float af2[] = new float[i];
	//   16   23:iload_1         
	//   17   24:newarray        float[]
	//   18   26:astore_3        
			float af3[] = new float[i];
	//   19   27:iload_1         
	//   20   28:newarray        float[]
	//   21   30:astore          4
			float af4[] = new float[i];
	//   22   32:iload_1         
	//   23   33:newarray        float[]
	//   24   35:astore          5
			int ai[] = new int[i];
	//   25   37:iload_1         
	//   26   38:newarray        int[]
	//   27   40:astore          6
			int ai1[] = new int[i];
	//   28   42:iload_1         
	//   29   43:newarray        int[]
	//   30   45:astore          7
			int ai2[] = new int[i];
	//   31   47:iload_1         
	//   32   48:newarray        int[]
	//   33   50:astore          8
			float af5[] = mInitialMotionX;
	//   34   52:aload_0         
	//   35   53:getfield        #196 <Field float[] mInitialMotionX>
	//   36   56:astore          9
			if(af5 != null)
	//*  37   58:aload           9
	//*  38   60:ifnull          181
			{
				System.arraycopy(((Object) (af5)), 0, ((Object) (af1)), 0, af5.length);
	//   39   63:aload           9
	//   40   65:iconst_0        
	//   41   66:aload_2         
	//   42   67:iconst_0        
	//   43   68:aload           9
	//   44   70:arraylength     
	//   45   71:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				af5 = mInitialMotionY;
	//   46   74:aload_0         
	//   47   75:getfield        #204 <Field float[] mInitialMotionY>
	//   48   78:astore          9
				System.arraycopy(((Object) (af5)), 0, ((Object) (af2)), 0, af5.length);
	//   49   80:aload           9
	//   50   82:iconst_0        
	//   51   83:aload_3         
	//   52   84:iconst_0        
	//   53   85:aload           9
	//   54   87:arraylength     
	//   55   88:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				af5 = mLastMotionX;
	//   56   91:aload_0         
	//   57   92:getfield        #206 <Field float[] mLastMotionX>
	//   58   95:astore          9
				System.arraycopy(((Object) (af5)), 0, ((Object) (af3)), 0, af5.length);
	//   59   97:aload           9
	//   60   99:iconst_0        
	//   61  100:aload           4
	//   62  102:iconst_0        
	//   63  103:aload           9
	//   64  105:arraylength     
	//   65  106:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				af5 = mLastMotionY;
	//   66  109:aload_0         
	//   67  110:getfield        #208 <Field float[] mLastMotionY>
	//   68  113:astore          9
				System.arraycopy(((Object) (af5)), 0, ((Object) (af4)), 0, af5.length);
	//   69  115:aload           9
	//   70  117:iconst_0        
	//   71  118:aload           5
	//   72  120:iconst_0        
	//   73  121:aload           9
	//   74  123:arraylength     
	//   75  124:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				af5 = ((float []) (mInitialEdgesTouched));
	//   76  127:aload_0         
	//   77  128:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   78  131:astore          9
				System.arraycopy(((Object) (af5)), 0, ((Object) (ai)), 0, af5.length);
	//   79  133:aload           9
	//   80  135:iconst_0        
	//   81  136:aload           6
	//   82  138:iconst_0        
	//   83  139:aload           9
	//   84  141:arraylength     
	//   85  142:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				af5 = ((float []) (mEdgeDragsInProgress));
	//   86  145:aload_0         
	//   87  146:getfield        #174 <Field int[] mEdgeDragsInProgress>
	//   88  149:astore          9
				System.arraycopy(((Object) (af5)), 0, ((Object) (ai1)), 0, af5.length);
	//   89  151:aload           9
	//   90  153:iconst_0        
	//   91  154:aload           7
	//   92  156:iconst_0        
	//   93  157:aload           9
	//   94  159:arraylength     
	//   95  160:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
				af5 = ((float []) (mEdgeDragsLocked));
	//   96  163:aload_0         
	//   97  164:getfield        #172 <Field int[] mEdgeDragsLocked>
	//   98  167:astore          9
				System.arraycopy(((Object) (af5)), 0, ((Object) (ai2)), 0, af5.length);
	//   99  169:aload           9
	//  100  171:iconst_0        
	//  101  172:aload           8
	//  102  174:iconst_0        
	//  103  175:aload           9
	//  104  177:arraylength     
	//  105  178:invokestatic    #313 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			mInitialMotionX = af1;
	//  106  181:aload_0         
	//  107  182:aload_2         
	//  108  183:putfield        #196 <Field float[] mInitialMotionX>
			mInitialMotionY = af2;
	//  109  186:aload_0         
	//  110  187:aload_3         
	//  111  188:putfield        #204 <Field float[] mInitialMotionY>
			mLastMotionX = af3;
	//  112  191:aload_0         
	//  113  192:aload           4
	//  114  194:putfield        #206 <Field float[] mLastMotionX>
			mLastMotionY = af4;
	//  115  197:aload_0         
	//  116  198:aload           5
	//  117  200:putfield        #208 <Field float[] mLastMotionY>
			mInitialEdgesTouched = ai;
	//  118  203:aload_0         
	//  119  204:aload           6
	//  120  206:putfield        #168 <Field int[] mInitialEdgesTouched>
			mEdgeDragsInProgress = ai1;
	//  121  209:aload_0         
	//  122  210:aload           7
	//  123  212:putfield        #174 <Field int[] mEdgeDragsInProgress>
			mEdgeDragsLocked = ai2;
	//  124  215:aload_0         
	//  125  216:aload           8
	//  126  218:putfield        #172 <Field int[] mEdgeDragsLocked>
		}
	//  127  221:return          
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
	//   21   37:getfield        #148 <Field OverScroller mScroller>
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
	//   38   65:getfield        #148 <Field OverScroller mScroller>
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
	//*   2    2:getfield        #96  <Field ViewGroup mParentView>
	//*   3    5:invokevirtual   #326 <Method int ViewGroup.getLeft()>
	//*   4    8:aload_0         
	//*   5    9:getfield        #125 <Field int mEdgeSize>
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
	//*  17   30:getfield        #96  <Field ViewGroup mParentView>
	//*  18   33:invokevirtual   #327 <Method int ViewGroup.getTop()>
	//*  19   36:aload_0         
	//*  20   37:getfield        #125 <Field int mEdgeSize>
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
	//*  31   54:getfield        #96  <Field ViewGroup mParentView>
	//*  32   57:invokevirtual   #330 <Method int ViewGroup.getRight()>
	//*  33   60:aload_0         
	//*  34   61:getfield        #125 <Field int mEdgeSize>
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
	//*  45   78:getfield        #96  <Field ViewGroup mParentView>
	//*  46   81:invokevirtual   #333 <Method int ViewGroup.getBottom()>
	//*  47   84:aload_0         
	//*  48   85:getfield        #125 <Field int mEdgeSize>
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
	//    4    8:getfield        #136 <Field float mMaxVelocity>
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
	//   14   28:getfield        #141 <Field float mMinVelocity>
	//   15   31:aload_0         
	//   16   32:getfield        #136 <Field float mMaxVelocity>
	//   17   35:invokespecial   #377 <Method float clampMag(float, float, float)>
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   21   43:aload_0         
	//   22   44:getfield        #89  <Field int mActivePointerId>
	//   23   47:invokevirtual   #380 <Method float VelocityTracker.getYVelocity(int)>
	//   24   50:aload_0         
	//   25   51:getfield        #141 <Field float mMinVelocity>
	//   26   54:aload_0         
	//   27   55:getfield        #136 <Field float mMaxVelocity>
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
	//   65  108:getfield        #98  <Field ViewDragHelper$Callback mCallback>
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
	//    7   13:getfield        #148 <Field OverScroller mScroller>
	//    8   16:invokevirtual   #420 <Method int OverScroller.getCurrX()>
	//    9   19:istore_1        
			int j = mScroller.getCurrY();
	//   10   20:aload_0         
	//   11   21:getfield        #148 <Field OverScroller mScroller>
	//   12   24:invokevirtual   #423 <Method int OverScroller.getCurrY()>
	//   13   27:istore_2        
			mScroller.abortAnimation();
	//   14   28:aload_0         
	//   15   29:getfield        #148 <Field OverScroller mScroller>
	//   16   32:invokevirtual   #318 <Method void OverScroller.abortAnimation()>
			int k = mScroller.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #148 <Field OverScroller mScroller>
	//   19   39:invokevirtual   #420 <Method int OverScroller.getCurrX()>
	//   20   42:istore_3        
			int l = mScroller.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #148 <Field OverScroller mScroller>
	//   23   47:invokevirtual   #423 <Method int OverScroller.getCurrY()>
	//   24   50:istore          4
			mCallback.onViewPositionChanged(mCapturedView, k, l, k - i, l - j);
	//   25   52:aload_0         
	//   26   53:getfield        #98  <Field ViewDragHelper$Callback mCallback>
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
		VelocityTracker velocitytracker = mVelocityTracker;
	//    5    9:aload_0         
	//    6   10:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//    7   13:astore_1        
		if(velocitytracker != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          27
		{
			velocitytracker.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #453 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #365 <Field VelocityTracker mVelocityTracker>
		}
	//   15   27:return          
	}

	public void captureChildView(View view, int i)
	{
		if(view.getParent() == mParentView)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #458 <Method android.view.ViewParent View.getParent()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #96  <Field ViewGroup mParentView>
	//*   4    8:if_acmpne       36
		{
			mCapturedView = view;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #262 <Field View mCapturedView>
			mActivePointerId = i;
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:putfield        #89  <Field int mActivePointerId>
			mCallback.onViewCaptured(view, i);
	//   11   21:aload_0         
	//   12   22:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   13   25:aload_1         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #461 <Method void ViewDragHelper$Callback.onViewCaptured(View, int)>
			setDragState(1);
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:invokevirtual   #271 <Method void setDragState(int)>
			return;
	//   19   35:return          
		} else
		{
			view = ((View) (new StringBuilder()));
	//   20   36:new             #336 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #337 <Method void StringBuilder()>
	//   23   43:astore_1        
			((StringBuilder) (view)).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
	//   24   44:aload_1         
	//   25   45:ldc2            #463 <String "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (">
	//   26   48:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			((StringBuilder) (view)).append(((Object) (mParentView)));
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:getfield        #96  <Field ViewGroup mParentView>
	//   31   57:invokevirtual   #466 <Method StringBuilder StringBuilder.append(Object)>
	//   32   60:pop             
			((StringBuilder) (view)).append(")");
	//   33   61:aload_1         
	//   34   62:ldc2            #468 <String ")">
	//   35   65:invokevirtual   #343 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   37   69:new             #150 <Class IllegalArgumentException>
	//   38   72:dup             
	//   39   73:aload_1         
	//   40   74:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   41   77:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//   42   80:athrow          
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
	//*  55   84:ifeq            119
	//*  56   87:iload_1         
	//*  57   88:ifeq            119
		{
			i = mTouchSlop;
	//   58   91:aload_0         
	//   59   92:getfield        #131 <Field int mTouchSlop>
	//   60   95:istore_1        
			if(f * f + f1 * f1 > (float)(i * i))
	//*  61   96:fload_3         
	//*  62   97:fload_3         
	//*  63   98:fmul            
	//*  64   99:fload           4
	//*  65  101:fload           4
	//*  66  103:fmul            
	//*  67  104:fadd            
	//*  68  105:iload_1         
	//*  69  106:iload_1         
	//*  70  107:imul            
	//*  71  108:i2f             
	//*  72  109:fcmpl           
	//*  73  110:ifle            116
				flag1 = true;
	//   74  113:iconst_1        
	//   75  114:istore          6
			return flag1;
	//   76  116:iload           6
	//   77  118:ireturn         
		}
		if(flag)
	//*  78  119:iload           5
	//*  79  121:ifeq            147
		{
			boolean flag2 = flag4;
	//   80  124:iload           7
	//   81  126:istore          6
			if(Math.abs(f) > (float)mTouchSlop)
	//*  82  128:fload_3         
	//*  83  129:invokestatic    #166 <Method float Math.abs(float)>
	//*  84  132:aload_0         
	//*  85  133:getfield        #131 <Field int mTouchSlop>
	//*  86  136:i2f             
	//*  87  137:fcmpl           
	//*  88  138:ifle            144
				flag2 = true;
	//   89  141:iconst_1        
	//   90  142:istore          6
			return flag2;
	//   91  144:iload           6
	//   92  146:ireturn         
		}
		if(i != 0)
	//*  93  147:iload_1         
	//*  94  148:ifeq            175
		{
			boolean flag3 = flag5;
	//   95  151:iload           8
	//   96  153:istore          6
			if(Math.abs(f1) > (float)mTouchSlop)
	//*  97  155:fload           4
	//*  98  157:invokestatic    #166 <Method float Math.abs(float)>
	//*  99  160:aload_0         
	//* 100  161:getfield        #131 <Field int mTouchSlop>
	//* 101  164:i2f             
	//* 102  165:fcmpl           
	//* 103  166:ifle            172
				flag3 = true;
	//  104  169:iconst_1        
	//  105  170:istore          6
			return flag3;
	//  106  172:iload           6
	//  107  174:ireturn         
		} else
		{
			return false;
	//  108  175:iconst_0        
	//  109  176:ireturn         
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
	//    9   14:getfield        #148 <Field OverScroller mScroller>
	//   10   17:invokevirtual   #477 <Method boolean OverScroller.computeScrollOffset()>
	//   11   20:istore          8
			int j = mScroller.getCurrX();
	//   12   22:aload_0         
	//   13   23:getfield        #148 <Field OverScroller mScroller>
	//   14   26:invokevirtual   #420 <Method int OverScroller.getCurrX()>
	//   15   29:istore_2        
			int k = mScroller.getCurrY();
	//   16   30:aload_0         
	//   17   31:getfield        #148 <Field OverScroller mScroller>
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
	//   49   99:getfield        #98  <Field ViewDragHelper$Callback mCallback>
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
	//*  65  130:getfield        #148 <Field OverScroller mScroller>
	//*  66  133:invokevirtual   #480 <Method int OverScroller.getFinalX()>
	//*  67  136:icmpne          164
				{
					flag1 = flag3;
	//   68  139:iload           8
	//   69  141:istore          6
					if(k == mScroller.getFinalY())
	//*  70  143:iload_3         
	//*  71  144:aload_0         
	//*  72  145:getfield        #148 <Field OverScroller mScroller>
	//*  73  148:invokevirtual   #483 <Method int OverScroller.getFinalY()>
	//*  74  151:icmpne          164
					{
						mScroller.abortAnimation();
	//   75  154:aload_0         
	//   76  155:getfield        #148 <Field OverScroller mScroller>
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
	//   85  174:getfield        #96  <Field ViewGroup mParentView>
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
	//*   1    1:getfield        #96  <Field ViewGroup mParentView>
	//*   2    4:invokevirtual   #434 <Method int ViewGroup.getChildCount()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            77
		{
			View view = mParentView.getChildAt(mCallback.getOrderedChildIndex(k));
	//    8   14:aload_0         
	//    9   15:getfield        #96  <Field ViewGroup mParentView>
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field ViewDragHelper$Callback mCallback>
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
		if(mReleaseInProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field boolean mReleaseInProgress>
	//*   2    4:ifeq            63
		{
			mScroller.fling(mCapturedView.getLeft(), mCapturedView.getTop(), (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId), i, k, j, l);
	//    3    7:aload_0         
	//    4    8:getfield        #148 <Field OverScroller mScroller>
	//    5   11:aload_0         
	//    6   12:getfield        #262 <Field View mCapturedView>
	//    7   15:invokevirtual   #283 <Method int View.getLeft()>
	//    8   18:aload_0         
	//    9   19:getfield        #262 <Field View mCapturedView>
	//   10   22:invokevirtual   #286 <Method int View.getTop()>
	//   11   25:aload_0         
	//   12   26:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   13   29:aload_0         
	//   14   30:getfield        #89  <Field int mActivePointerId>
	//   15   33:invokevirtual   #375 <Method float VelocityTracker.getXVelocity(int)>
	//   16   36:f2i             
	//   17   37:aload_0         
	//   18   38:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   19   41:aload_0         
	//   20   42:getfield        #89  <Field int mActivePointerId>
	//   21   45:invokevirtual   #380 <Method float VelocityTracker.getYVelocity(int)>
	//   22   48:f2i             
	//   23   49:iload_1         
	//   24   50:iload_3         
	//   25   51:iload_2         
	//   26   52:iload           4
	//   27   54:invokevirtual   #499 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
			setDragState(2);
	//   28   57:aload_0         
	//   29   58:iconst_2        
	//   30   59:invokevirtual   #271 <Method void setDragState(int)>
			return;
	//   31   62:return          
		} else
		{
			throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
	//   32   63:new             #501 <Class IllegalStateException>
	//   33   66:dup             
	//   34   67:ldc2            #503 <String "Cannot flingCapturedView outside of a call to Callback#onViewReleased">
	//   35   70:invokespecial   #504 <Method void IllegalStateException(String)>
	//   36   73:athrow          
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
	//    1    1:getfield        #125 <Field int mEdgeSize>
	//    2    4:ireturn         
	}

	public float getMinVelocity()
	{
		return mMinVelocity;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field float mMinVelocity>
	//    2    4:freturn         
	}

	public int getTouchSlop()
	{
		return mTouchSlop;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int mTouchSlop>
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
	//    5    7:invokevirtual   #518 <Method boolean isViewUnder(View, int, int)>
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
	//*  12   16:invokevirtual   #521 <Method boolean isEdgeTouched(int, int)>
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
		int i3;
		i3 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #525 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          9
		i2 = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #528 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          8
		if(i3 == 0)
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
	//   14   29:invokestatic    #532 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #365 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #535 <Method void VelocityTracker.addMovement(MotionEvent)>
		j1 = 0;
	//   20   43:iconst_0        
	//   21   44:istore          7
		i = 0;
	//   22   46:iconst_0        
	//   23   47:istore          6
		i3;
	//   24   49:iload           9
		JVM INSTR tableswitch 0 6: default 92
	//	               0 644
	//	               1 627
	//	               2 369
	//	               3 350
	//	               4 92
	//	               5 237
	//	               6 93;
	//   25   51:tableswitch     0 6: default 92
	//	               0 644
	//	               1 627
	//	               2 369
	//	               3 350
	//	               4 92
	//	               5 237
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
	//   34  106:icmpne          230
	//   35  109:iload           7
	//   36  111:aload_0         
	//   37  112:getfield        #89  <Field int mActivePointerId>
	//   38  115:icmpne          230
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
	//   44  128:icmpge          217
		i3 = motionevent.getPointerId(i);
	//   45  131:aload_1         
	//   46  132:iload           6
	//   47  134:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   48  137:istore          9
		if(i3 != mActivePointerId) goto _L11; else goto _L10
	//   49  139:iload           9
	//   50  141:aload_0         
	//   51  142:getfield        #89  <Field int mActivePointerId>
	//   52  145:icmpne          151
	//*  53  148:goto            208
_L11:
		View view;
		View view2;
		float f = motionevent.getX(i);
	//   54  151:aload_1         
	//   55  152:iload           6
	//   56  154:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//   57  157:fstore_2        
		float f5 = motionevent.getY(i);
	//   58  158:aload_1         
	//   59  159:iload           6
	//   60  161:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//   61  164:fstore_3        
		view = findTopChildUnder((int)f, (int)f5);
	//   62  165:aload_0         
	//   63  166:fload_2         
	//   64  167:f2i             
	//   65  168:fload_3         
	//   66  169:f2i             
	//   67  170:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//   68  173:astore          10
		view2 = mCapturedView;
	//   69  175:aload_0         
	//   70  176:getfield        #262 <Field View mCapturedView>
	//   71  179:astore          11
		if(view != view2 || !tryCaptureViewForDrag(view2, i3)) goto _L10; else goto _L12
	//   72  181:aload           10
	//   73  183:aload           11
	//   74  185:if_acmpne       208
	//   75  188:aload_0         
	//   76  189:aload           11
	//   77  191:iload           9
	//   78  193:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//   79  196:ifeq            208
_L12:
		i = mActivePointerId;
	//   80  199:aload_0         
	//   81  200:getfield        #89  <Field int mActivePointerId>
	//   82  203:istore          6
		  goto _L13
	//*  83  205:goto            220
_L10:
		i++;
	//   84  208:iload           6
	//   85  210:iconst_1        
	//   86  211:iadd            
	//   87  212:istore          6
		if(true) goto _L15; else goto _L14
	//   88  214:goto            124
_L14:
		i = -1;
	//   89  217:iconst_m1       
	//   90  218:istore          6
_L13:
		if(i == -1)
	//*  91  220:iload           6
	//*  92  222:iconst_m1       
	//*  93  223:icmpne          230
			releaseViewForPointerUp();
	//   94  226:aload_0         
	//   95  227:invokespecial   #543 <Method void releaseViewForPointerUp()>
_L9:
		clearMotionHistory(j1);
	//   96  230:aload_0         
	//   97  231:iload           7
	//   98  233:invokespecial   #545 <Method void clearMotionHistory(int)>
		return;
	//   99  236:return          
_L6:
		int j = motionevent.getPointerId(i2);
	//  100  237:aload_1         
	//  101  238:iload           8
	//  102  240:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  103  243:istore          6
		float f1 = motionevent.getX(i2);
	//  104  245:aload_1         
	//  105  246:iload           8
	//  106  248:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  107  251:fstore_2        
		float f6 = motionevent.getY(i2);
	//  108  252:aload_1         
	//  109  253:iload           8
	//  110  255:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  111  258:fstore_3        
		saveInitialMotion(f1, f6, j);
	//  112  259:aload_0         
	//  113  260:fload_2         
	//  114  261:fload_3         
	//  115  262:iload           6
	//  116  264:invokespecial   #547 <Method void saveInitialMotion(float, float, int)>
		if(mDragState == 0)
	//* 117  267:aload_0         
	//* 118  268:getfield        #268 <Field int mDragState>
	//* 119  271:ifne            327
		{
			tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f6), j);
	//  120  274:aload_0         
	//  121  275:aload_0         
	//  122  276:fload_2         
	//  123  277:f2i             
	//  124  278:fload_3         
	//  125  279:f2i             
	//  126  280:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  127  283:iload           6
	//  128  285:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//  129  288:pop             
			j1 = mInitialEdgesTouched[j];
	//  130  289:aload_0         
	//  131  290:getfield        #168 <Field int[] mInitialEdgesTouched>
	//  132  293:iload           6
	//  133  295:iaload          
	//  134  296:istore          7
			int j2 = mTrackingEdges;
	//  135  298:aload_0         
	//  136  299:getfield        #170 <Field int mTrackingEdges>
	//  137  302:istore          8
			if((j1 & j2) != 0)
	//* 138  304:iload           7
	//* 139  306:iload           8
	//* 140  308:iand            
	//* 141  309:ifeq            723
			{
				mCallback.onEdgeTouched(j1 & j2, j);
	//  142  312:aload_0         
	//  143  313:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//  144  316:iload           7
	//  145  318:iload           8
	//  146  320:iand            
	//  147  321:iload           6
	//  148  323:invokevirtual   #550 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
				return;
	//  149  326:return          
			}
		} else
		if(isCapturedViewUnder((int)f1, (int)f6))
	//* 150  327:aload_0         
	//* 151  328:fload_2         
	//* 152  329:f2i             
	//* 153  330:fload_3         
	//* 154  331:f2i             
	//* 155  332:invokevirtual   #552 <Method boolean isCapturedViewUnder(int, int)>
	//* 156  335:ifeq            723
		{
			tryCaptureViewForDrag(mCapturedView, j);
	//  157  338:aload_0         
	//  158  339:aload_0         
	//  159  340:getfield        #262 <Field View mCapturedView>
	//  160  343:iload           6
	//  161  345:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//  162  348:pop             
			return;
	//  163  349:return          
		}
		break; /* Loop/switch isn't completed */
_L5:
		if(mDragState == 1)
	//* 164  350:aload_0         
	//* 165  351:getfield        #268 <Field int mDragState>
	//* 166  354:iconst_1        
	//* 167  355:icmpne          364
			dispatchViewReleased(0.0F, 0.0F);
	//  168  358:aload_0         
	//  169  359:fconst_0        
	//  170  360:fconst_0        
	//  171  361:invokespecial   #382 <Method void dispatchViewReleased(float, float)>
		cancel();
	//  172  364:aload_0         
	//  173  365:invokevirtual   #417 <Method void cancel()>
		return;
	//  174  368:return          
_L4:
		if(mDragState == 1)
	//* 175  369:aload_0         
	//* 176  370:getfield        #268 <Field int mDragState>
	//* 177  373:iconst_1        
	//* 178  374:icmpne          481
			if(!isValidPointerForActionMove(mActivePointerId))
	//* 179  377:aload_0         
	//* 180  378:aload_0         
	//* 181  379:getfield        #89  <Field int mActivePointerId>
	//* 182  382:invokespecial   #407 <Method boolean isValidPointerForActionMove(int)>
	//* 183  385:ifne            389
			{
				return;
	//  184  388:return          
			} else
			{
				int k = motionevent.findPointerIndex(mActivePointerId);
	//  185  389:aload_1         
	//  186  390:aload_0         
	//  187  391:getfield        #89  <Field int mActivePointerId>
	//  188  394:invokevirtual   #555 <Method int MotionEvent.findPointerIndex(int)>
	//  189  397:istore          6
				float f2 = motionevent.getX(k);
	//  190  399:aload_1         
	//  191  400:iload           6
	//  192  402:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  193  405:fstore_2        
				float f7 = motionevent.getY(k);
	//  194  406:aload_1         
	//  195  407:iload           6
	//  196  409:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  197  412:fstore_3        
				float af[] = mLastMotionX;
	//  198  413:aload_0         
	//  199  414:getfield        #206 <Field float[] mLastMotionX>
	//  200  417:astore          10
				j1 = mActivePointerId;
	//  201  419:aload_0         
	//  202  420:getfield        #89  <Field int mActivePointerId>
	//  203  423:istore          7
				k = (int)(f2 - af[j1]);
	//  204  425:fload_2         
	//  205  426:aload           10
	//  206  428:iload           7
	//  207  430:faload          
	//  208  431:fsub            
	//  209  432:f2i             
	//  210  433:istore          6
				j1 = (int)(f7 - mLastMotionY[j1]);
	//  211  435:fload_3         
	//  212  436:aload_0         
	//  213  437:getfield        #208 <Field float[] mLastMotionY>
	//  214  440:iload           7
	//  215  442:faload          
	//  216  443:fsub            
	//  217  444:f2i             
	//  218  445:istore          7
				dragTo(mCapturedView.getLeft() + k, mCapturedView.getTop() + j1, k, j1);
	//  219  447:aload_0         
	//  220  448:aload_0         
	//  221  449:getfield        #262 <Field View mCapturedView>
	//  222  452:invokevirtual   #283 <Method int View.getLeft()>
	//  223  455:iload           6
	//  224  457:iadd            
	//  225  458:aload_0         
	//  226  459:getfield        #262 <Field View mCapturedView>
	//  227  462:invokevirtual   #286 <Method int View.getTop()>
	//  228  465:iload           7
	//  229  467:iadd            
	//  230  468:iload           6
	//  231  470:iload           7
	//  232  472:invokespecial   #557 <Method void dragTo(int, int, int, int)>
				saveLastMotion(motionevent);
	//  233  475:aload_0         
	//  234  476:aload_1         
	//  235  477:invokespecial   #559 <Method void saveLastMotion(MotionEvent)>
				return;
	//  236  480:return          
			}
		int k2 = motionevent.getPointerCount();
	//  237  481:aload_1         
	//  238  482:invokevirtual   #402 <Method int MotionEvent.getPointerCount()>
	//  239  485:istore          8
		for(int l = j1; l < k2; l++)
	//* 240  487:iload           7
	//* 241  489:istore          6
	//* 242  491:iload           6
	//* 243  493:iload           8
	//* 244  495:icmpge          621
		{
			int k1 = motionevent.getPointerId(l);
	//  245  498:aload_1         
	//  246  499:iload           6
	//  247  501:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  248  504:istore          7
			if(!isValidPointerForActionMove(k1))
	//* 249  506:aload_0         
	//* 250  507:iload           7
	//* 251  509:invokespecial   #407 <Method boolean isValidPointerForActionMove(int)>
	//* 252  512:ifne            518
				continue;
	//  253  515:goto            612
			float f3 = motionevent.getX(l);
	//  254  518:aload_1         
	//  255  519:iload           6
	//  256  521:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  257  524:fstore_2        
			float f8 = motionevent.getY(l);
	//  258  525:aload_1         
	//  259  526:iload           6
	//  260  528:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  261  531:fstore_3        
			float f10 = f3 - mInitialMotionX[k1];
	//  262  532:fload_2         
	//  263  533:aload_0         
	//  264  534:getfield        #196 <Field float[] mInitialMotionX>
	//  265  537:iload           7
	//  266  539:faload          
	//  267  540:fsub            
	//  268  541:fstore          4
			float f11 = f8 - mInitialMotionY[k1];
	//  269  543:fload_3         
	//  270  544:aload_0         
	//  271  545:getfield        #204 <Field float[] mInitialMotionY>
	//  272  548:iload           7
	//  273  550:faload          
	//  274  551:fsub            
	//  275  552:fstore          5
			reportNewEdgeDrags(f10, f11, k1);
	//  276  554:aload_0         
	//  277  555:fload           4
	//  278  557:fload           5
	//  279  559:iload           7
	//  280  561:invokespecial   #561 <Method void reportNewEdgeDrags(float, float, int)>
			if(mDragState == 1)
	//* 281  564:aload_0         
	//* 282  565:getfield        #268 <Field int mDragState>
	//* 283  568:iconst_1        
	//* 284  569:icmpne          575
				break;
	//  285  572:goto            621
			View view1 = findTopChildUnder((int)f3, (int)f8);
	//  286  575:aload_0         
	//  287  576:fload_2         
	//  288  577:f2i             
	//  289  578:fload_3         
	//  290  579:f2i             
	//  291  580:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  292  583:astore          10
			if(checkTouchSlop(view1, f10, f11) && tryCaptureViewForDrag(view1, k1))
	//* 293  585:aload_0         
	//* 294  586:aload           10
	//* 295  588:fload           4
	//* 296  590:fload           5
	//* 297  592:invokespecial   #563 <Method boolean checkTouchSlop(View, float, float)>
	//* 298  595:ifeq            612
	//* 299  598:aload_0         
	//* 300  599:aload           10
	//* 301  601:iload           7
	//* 302  603:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//* 303  606:ifeq            612
				break;
	//  304  609:goto            621
		}

	//  305  612:iload           6
	//  306  614:iconst_1        
	//  307  615:iadd            
	//  308  616:istore          6
	//* 309  618:goto            491
		saveLastMotion(motionevent);
	//  310  621:aload_0         
	//  311  622:aload_1         
	//  312  623:invokespecial   #559 <Method void saveLastMotion(MotionEvent)>
		return;
	//  313  626:return          
_L3:
		if(mDragState == 1)
	//* 314  627:aload_0         
	//* 315  628:getfield        #268 <Field int mDragState>
	//* 316  631:iconst_1        
	//* 317  632:icmpne          639
			releaseViewForPointerUp();
	//  318  635:aload_0         
	//  319  636:invokespecial   #543 <Method void releaseViewForPointerUp()>
		cancel();
	//  320  639:aload_0         
	//  321  640:invokevirtual   #417 <Method void cancel()>
		return;
	//  322  643:return          
_L2:
		float f4 = motionevent.getX();
	//  323  644:aload_1         
	//  324  645:invokevirtual   #565 <Method float MotionEvent.getX()>
	//  325  648:fstore_2        
		float f9 = motionevent.getY();
	//  326  649:aload_1         
	//  327  650:invokevirtual   #567 <Method float MotionEvent.getY()>
	//  328  653:fstore_3        
		int i1 = motionevent.getPointerId(0);
	//  329  654:aload_1         
	//  330  655:iconst_0        
	//  331  656:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  332  659:istore          6
		motionevent = ((MotionEvent) (findTopChildUnder((int)f4, (int)f9)));
	//  333  661:aload_0         
	//  334  662:fload_2         
	//  335  663:f2i             
	//  336  664:fload_3         
	//  337  665:f2i             
	//  338  666:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  339  669:astore_1        
		saveInitialMotion(f4, f9, i1);
	//  340  670:aload_0         
	//  341  671:fload_2         
	//  342  672:fload_3         
	//  343  673:iload           6
	//  344  675:invokespecial   #547 <Method void saveInitialMotion(float, float, int)>
		tryCaptureViewForDrag(((View) (motionevent)), i1);
	//  345  678:aload_0         
	//  346  679:aload_1         
	//  347  680:iload           6
	//  348  682:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//  349  685:pop             
		int l1 = mInitialEdgesTouched[i1];
	//  350  686:aload_0         
	//  351  687:getfield        #168 <Field int[] mInitialEdgesTouched>
	//  352  690:iload           6
	//  353  692:iaload          
	//  354  693:istore          7
		int l2 = mTrackingEdges;
	//  355  695:aload_0         
	//  356  696:getfield        #170 <Field int mTrackingEdges>
	//  357  699:istore          8
		if((l1 & l2) != 0)
	//* 358  701:iload           7
	//* 359  703:iload           8
	//* 360  705:iand            
	//* 361  706:ifeq            723
			mCallback.onEdgeTouched(l1 & l2, i1);
	//  362  709:aload_0         
	//  363  710:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//  364  713:iload           7
	//  365  715:iload           8
	//  366  717:iand            
	//  367  718:iload           6
	//  368  720:invokevirtual   #550 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
	//  369  723:return          
	}

	void setDragState(int i)
	{
		mParentView.removeCallbacks(mSetIdleRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ViewGroup mParentView>
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field Runnable mSetIdleRunnable>
	//    4    8:invokevirtual   #570 <Method boolean ViewGroup.removeCallbacks(Runnable)>
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
	//   14   26:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #573 <Method void ViewDragHelper$Callback.onViewDragStateChanged(int)>
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
	//    2    2:putfield        #141 <Field float mMinVelocity>
	//    3    5:return          
	}

	public boolean settleCapturedViewAt(int i, int j)
	{
		if(mReleaseInProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field boolean mReleaseInProgress>
	//*   2    4:ifeq            38
			return forceSettleCapturedViewAt(i, j, (int)mVelocityTracker.getXVelocity(mActivePointerId), (int)mVelocityTracker.getYVelocity(mActivePointerId));
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field int mActivePointerId>
	//   10   18:invokevirtual   #375 <Method float VelocityTracker.getXVelocity(int)>
	//   11   21:f2i             
	//   12   22:aload_0         
	//   13   23:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   14   26:aload_0         
	//   15   27:getfield        #89  <Field int mActivePointerId>
	//   16   30:invokevirtual   #380 <Method float VelocityTracker.getYVelocity(int)>
	//   17   33:f2i             
	//   18   34:invokespecial   #579 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
	//   19   37:ireturn         
		else
			throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
	//   20   38:new             #501 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc2            #581 <String "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased">
	//   23   45:invokespecial   #504 <Method void IllegalStateException(String)>
	//   24   48:athrow          
	}

	public boolean shouldInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #525 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          6
		int i1 = motionevent.getActionIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #528 <Method int MotionEvent.getActionIndex()>
	//    5   10:istore          7
		if(i == 0)
	//*   6   12:iload           6
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
	//   14   29:invokestatic    #532 <Method VelocityTracker VelocityTracker.obtain()>
	//   15   32:putfield        #365 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   16   35:aload_0         
	//   17   36:getfield        #365 <Field VelocityTracker mVelocityTracker>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #535 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(i)
	//*  20   43:iload           6
		{
		case 4: // '\004'
		default:
			break;

	//*  21   45:tableswitch     0 6: default 88
	//	               0 539
	//	               1 532
	//	               2 222
	//	               3 532
	//	               4 88
	//	               5 104
	//	               6 91
	//*  22   88:goto            634
		case 6: // '\006'
			clearMotionHistory(motionevent.getPointerId(i1));
	//   23   91:aload_0         
	//   24   92:aload_1         
	//   25   93:iload           7
	//   26   95:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   27   98:invokespecial   #545 <Method void clearMotionHistory(int)>
			break;
	//   28  101:goto            634

		case 5: // '\005'
			int j = motionevent.getPointerId(i1);
	//   29  104:aload_1         
	//   30  105:iload           7
	//   31  107:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//   32  110:istore          6
			float f = motionevent.getX(i1);
	//   33  112:aload_1         
	//   34  113:iload           7
	//   35  115:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//   36  118:fstore_2        
			float f3 = motionevent.getY(i1);
	//   37  119:aload_1         
	//   38  120:iload           7
	//   39  122:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//   40  125:fstore_3        
			saveInitialMotion(f, f3, j);
	//   41  126:aload_0         
	//   42  127:fload_2         
	//   43  128:fload_3         
	//   44  129:iload           6
	//   45  131:invokespecial   #547 <Method void saveInitialMotion(float, float, int)>
			i1 = mDragState;
	//   46  134:aload_0         
	//   47  135:getfield        #268 <Field int mDragState>
	//   48  138:istore          7
			if(i1 == 0)
	//*  49  140:iload           7
	//*  50  142:ifne            185
			{
				i1 = mInitialEdgesTouched[j];
	//   51  145:aload_0         
	//   52  146:getfield        #168 <Field int[] mInitialEdgesTouched>
	//   53  149:iload           6
	//   54  151:iaload          
	//   55  152:istore          7
				int k1 = mTrackingEdges;
	//   56  154:aload_0         
	//   57  155:getfield        #170 <Field int mTrackingEdges>
	//   58  158:istore          8
				if((i1 & k1) != 0)
	//*  59  160:iload           7
	//*  60  162:iload           8
	//*  61  164:iand            
	//*  62  165:ifeq            219
					mCallback.onEdgeTouched(i1 & k1, j);
	//   63  168:aload_0         
	//   64  169:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//   65  172:iload           7
	//   66  174:iload           8
	//   67  176:iand            
	//   68  177:iload           6
	//   69  179:invokevirtual   #550 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
				break;
	//   70  182:goto            219
			}
			if(i1 != 2)
				break;
	//   71  185:iload           7
	//   72  187:iconst_2        
	//   73  188:icmpne          219
			motionevent = ((MotionEvent) (findTopChildUnder((int)f, (int)f3)));
	//   74  191:aload_0         
	//   75  192:fload_2         
	//   76  193:f2i             
	//   77  194:fload_3         
	//   78  195:f2i             
	//   79  196:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//   80  199:astore_1        
			if(motionevent == mCapturedView)
	//*  81  200:aload_1         
	//*  82  201:aload_0         
	//*  83  202:getfield        #262 <Field View mCapturedView>
	//*  84  205:if_acmpne       216
				tryCaptureViewForDrag(((View) (motionevent)), j);
	//   85  208:aload_0         
	//   86  209:aload_1         
	//   87  210:iload           6
	//   88  212:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//   89  215:pop             
			break;
	//   90  216:goto            634

	//*  91  219:goto            634
		case 2: // '\002'
			if(mInitialMotionX == null || mInitialMotionY == null)
	//*  92  222:aload_0         
	//*  93  223:getfield        #196 <Field float[] mInitialMotionX>
	//*  94  226:ifnull          529
	//*  95  229:aload_0         
	//*  96  230:getfield        #204 <Field float[] mInitialMotionY>
	//*  97  233:ifnonnull       239
				break;
	//   98  236:goto            529
			int l1 = motionevent.getPointerCount();
	//   99  239:aload_1         
	//  100  240:invokevirtual   #402 <Method int MotionEvent.getPointerCount()>
	//  101  243:istore          8
			for(int k = 0; k < l1; k++)
	//* 102  245:iconst_0        
	//* 103  246:istore          6
	//* 104  248:iload           6
	//* 105  250:iload           8
	//* 106  252:icmpge          521
			{
				int j2 = motionevent.getPointerId(k);
	//  107  255:aload_1         
	//  108  256:iload           6
	//  109  258:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  110  261:istore          9
				if(!isValidPointerForActionMove(j2))
	//* 111  263:aload_0         
	//* 112  264:iload           9
	//* 113  266:invokespecial   #407 <Method boolean isValidPointerForActionMove(int)>
	//* 114  269:ifne            275
					continue;
	//  115  272:goto            512
				float f1 = motionevent.getX(k);
	//  116  275:aload_1         
	//  117  276:iload           6
	//  118  278:invokevirtual   #410 <Method float MotionEvent.getX(int)>
	//  119  281:fstore_2        
				float f4 = motionevent.getY(k);
	//  120  282:aload_1         
	//  121  283:iload           6
	//  122  285:invokevirtual   #413 <Method float MotionEvent.getY(int)>
	//  123  288:fstore_3        
				float f6 = f1 - mInitialMotionX[j2];
	//  124  289:fload_2         
	//  125  290:aload_0         
	//  126  291:getfield        #196 <Field float[] mInitialMotionX>
	//  127  294:iload           9
	//  128  296:faload          
	//  129  297:fsub            
	//  130  298:fstore          4
				float f7 = f4 - mInitialMotionY[j2];
	//  131  300:fload_3         
	//  132  301:aload_0         
	//  133  302:getfield        #204 <Field float[] mInitialMotionY>
	//  134  305:iload           9
	//  135  307:faload          
	//  136  308:fsub            
	//  137  309:fstore          5
				View view = findTopChildUnder((int)f1, (int)f4);
	//  138  311:aload_0         
	//  139  312:fload_2         
	//  140  313:f2i             
	//  141  314:fload_3         
	//  142  315:f2i             
	//  143  316:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  144  319:astore          17
				boolean flag;
				if(view != null && checkTouchSlop(view, f6, f7))
	//* 145  321:aload           17
	//* 146  323:ifnull          345
	//* 147  326:aload_0         
	//* 148  327:aload           17
	//* 149  329:fload           4
	//* 150  331:fload           5
	//* 151  333:invokespecial   #563 <Method boolean checkTouchSlop(View, float, float)>
	//* 152  336:ifeq            345
					flag = true;
	//  153  339:iconst_1        
	//  154  340:istore          7
				else
	//* 155  342:goto            348
					flag = false;
	//  156  345:iconst_0        
	//  157  346:istore          7
				if(flag)
	//* 158  348:iload           7
	//* 159  350:ifeq            472
				{
					int k2 = view.getLeft();
	//  160  353:aload           17
	//  161  355:invokevirtual   #283 <Method int View.getLeft()>
	//  162  358:istore          10
					int l2 = (int)f6;
	//  163  360:fload           4
	//  164  362:f2i             
	//  165  363:istore          11
					l2 = mCallback.clampViewPositionHorizontal(view, k2 + l2, l2);
	//  166  365:aload_0         
	//  167  366:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//  168  369:aload           17
	//  169  371:iload           10
	//  170  373:iload           11
	//  171  375:iadd            
	//  172  376:iload           11
	//  173  378:invokevirtual   #290 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
	//  174  381:istore          11
					int i3 = view.getTop();
	//  175  383:aload           17
	//  176  385:invokevirtual   #286 <Method int View.getTop()>
	//  177  388:istore          12
					int j3 = (int)f7;
	//  178  390:fload           5
	//  179  392:f2i             
	//  180  393:istore          13
					j3 = mCallback.clampViewPositionVertical(view, i3 + j3, j3);
	//  181  395:aload_0         
	//  182  396:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//  183  399:aload           17
	//  184  401:iload           12
	//  185  403:iload           13
	//  186  405:iadd            
	//  187  406:iload           13
	//  188  408:invokevirtual   #299 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
	//  189  411:istore          13
					int k3 = mCallback.getViewHorizontalDragRange(view);
	//  190  413:aload_0         
	//  191  414:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//  192  417:aload           17
	//  193  419:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
	//  194  422:istore          14
					int l3 = mCallback.getViewVerticalDragRange(view);
	//  195  424:aload_0         
	//  196  425:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//  197  428:aload           17
	//  198  430:invokevirtual   #187 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
	//  199  433:istore          15
					if((k3 == 0 || k3 > 0 && l2 == k2) && (l3 == 0 || l3 > 0 && j3 == i3))
	//* 200  435:iload           14
	//* 201  437:ifeq            452
	//* 202  440:iload           14
	//* 203  442:ifle            472
	//* 204  445:iload           11
	//* 205  447:iload           10
	//* 206  449:icmpne          472
	//* 207  452:iload           15
	//* 208  454:ifeq            521
	//* 209  457:iload           15
	//* 210  459:ifle            472
	//* 211  462:iload           13
	//* 212  464:iload           12
	//* 213  466:icmpne          472
						break;
	//  214  469:goto            521
				}
				reportNewEdgeDrags(f6, f7, j2);
	//  215  472:aload_0         
	//  216  473:fload           4
	//  217  475:fload           5
	//  218  477:iload           9
	//  219  479:invokespecial   #561 <Method void reportNewEdgeDrags(float, float, int)>
				if(mDragState == 1 || flag && tryCaptureViewForDrag(view, j2))
	//* 220  482:aload_0         
	//* 221  483:getfield        #268 <Field int mDragState>
	//* 222  486:iconst_1        
	//* 223  487:icmpne          493
	//* 224  490:goto            521
	//* 225  493:iload           7
	//* 226  495:ifeq            512
	//* 227  498:aload_0         
	//* 228  499:aload           17
	//* 229  501:iload           9
	//* 230  503:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//* 231  506:ifeq            512
					break;
	//  232  509:goto            521
			}

	//  233  512:iload           6
	//  234  514:iconst_1        
	//  235  515:iadd            
	//  236  516:istore          6
	//* 237  518:goto            248
			saveLastMotion(motionevent);
	//  238  521:aload_0         
	//  239  522:aload_1         
	//  240  523:invokespecial   #559 <Method void saveLastMotion(MotionEvent)>
			break;
	//  241  526:goto            634

	//* 242  529:goto            634
		case 1: // '\001'
		case 3: // '\003'
			cancel();
	//  243  532:aload_0         
	//  244  533:invokevirtual   #417 <Method void cancel()>
			break;
	//  245  536:goto            634

		case 0: // '\0'
			float f2 = motionevent.getX();
	//  246  539:aload_1         
	//  247  540:invokevirtual   #565 <Method float MotionEvent.getX()>
	//  248  543:fstore_2        
			float f5 = motionevent.getY();
	//  249  544:aload_1         
	//  250  545:invokevirtual   #567 <Method float MotionEvent.getY()>
	//  251  548:fstore_3        
			int l = motionevent.getPointerId(0);
	//  252  549:aload_1         
	//  253  550:iconst_0        
	//  254  551:invokevirtual   #405 <Method int MotionEvent.getPointerId(int)>
	//  255  554:istore          6
			saveInitialMotion(f2, f5, l);
	//  256  556:aload_0         
	//  257  557:fload_2         
	//  258  558:fload_3         
	//  259  559:iload           6
	//  260  561:invokespecial   #547 <Method void saveInitialMotion(float, float, int)>
			motionevent = ((MotionEvent) (findTopChildUnder((int)f2, (int)f5)));
	//  261  564:aload_0         
	//  262  565:fload_2         
	//  263  566:f2i             
	//  264  567:fload_3         
	//  265  568:f2i             
	//  266  569:invokevirtual   #537 <Method View findTopChildUnder(int, int)>
	//  267  572:astore_1        
			if(motionevent == mCapturedView && mDragState == 2)
	//* 268  573:aload_1         
	//* 269  574:aload_0         
	//* 270  575:getfield        #262 <Field View mCapturedView>
	//* 271  578:if_acmpne       597
	//* 272  581:aload_0         
	//* 273  582:getfield        #268 <Field int mDragState>
	//* 274  585:iconst_2        
	//* 275  586:icmpne          597
				tryCaptureViewForDrag(((View) (motionevent)), l);
	//  276  589:aload_0         
	//  277  590:aload_1         
	//  278  591:iload           6
	//  279  593:invokevirtual   #541 <Method boolean tryCaptureViewForDrag(View, int)>
	//  280  596:pop             
			int j1 = mInitialEdgesTouched[l];
	//  281  597:aload_0         
	//  282  598:getfield        #168 <Field int[] mInitialEdgesTouched>
	//  283  601:iload           6
	//  284  603:iaload          
	//  285  604:istore          7
			int i2 = mTrackingEdges;
	//  286  606:aload_0         
	//  287  607:getfield        #170 <Field int mTrackingEdges>
	//  288  610:istore          8
			if((j1 & i2) != 0)
	//* 289  612:iload           7
	//* 290  614:iload           8
	//* 291  616:iand            
	//* 292  617:ifeq            634
				mCallback.onEdgeTouched(j1 & i2, l);
	//  293  620:aload_0         
	//  294  621:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//  295  624:iload           7
	//  296  626:iload           8
	//  297  628:iand            
	//  298  629:iload           6
	//  299  631:invokevirtual   #550 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
			break;
		}
		boolean flag1 = false;
	//  300  634:iconst_0        
	//  301  635:istore          16
		if(mDragState == 1)
	//* 302  637:aload_0         
	//* 303  638:getfield        #268 <Field int mDragState>
	//* 304  641:iconst_1        
	//* 305  642:icmpne          648
			flag1 = true;
	//  306  645:iconst_1        
	//  307  646:istore          16
		return flag1;
	//  308  648:iload           16
	//  309  650:ireturn         
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
	//   11   15:invokespecial   #579 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
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
	//*  13   23:getfield        #98  <Field ViewDragHelper$Callback mCallback>
	//*  14   26:aload_1         
	//*  15   27:iload_2         
	//*  16   28:invokevirtual   #587 <Method boolean ViewDragHelper$Callback.tryCaptureView(View, int)>
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
	//   24   42:invokevirtual   #589 <Method void captureChildView(View, int)>
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
