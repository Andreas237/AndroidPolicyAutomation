// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public class BottomSheetBehavior extends CoordinatorLayout.Behavior
{
	public static abstract class BottomSheetCallback
	{

		public abstract void onSlide(View view, float f);

		public abstract void onStateChanged(View view, int i);

		public BottomSheetCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #43  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(state);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #35  <Field int state>
		//    7   11:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method BottomSheetBehavior$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method BottomSheetBehavior$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method BottomSheetBehavior$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		final int state;

		static 
		{
		//    0    0:new             #9   <Class BottomSheetBehavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomSheetBehavior$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel)
		{
			this(parcel, ((ClassLoader) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #26  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
		//    4    6:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void AbsSavedState(Parcel, ClassLoader)>
			state = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #33  <Method int Parcel.readInt()>
		//    7   11:putfield        #35  <Field int state>
		//    8   14:return          
		}

		public SavedState(Parcelable parcelable, int i)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void AbsSavedState(Parcelable)>
			state = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #35  <Field int state>
		//    6   10:return          
		}
	}

	private class SettleRunnable
		implements Runnable
	{

		public void run()
		{
			if(mViewDragHelper != null && mViewDragHelper.continueSettling(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field BottomSheetBehavior this$0>
		//*   2    4:getfield        #32  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
		//*   3    7:ifnull          33
		//*   4   10:aload_0         
		//*   5   11:getfield        #19  <Field BottomSheetBehavior this$0>
		//*   6   14:getfield        #32  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
		//*   7   17:iconst_1        
		//*   8   18:invokevirtual   #38  <Method boolean ViewDragHelper.continueSettling(boolean)>
		//*   9   21:ifeq            33
			{
				ViewCompat.postOnAnimation(mView, ((Runnable) (this)));
		//   10   24:aload_0         
		//   11   25:getfield        #24  <Field View mView>
		//   12   28:aload_0         
		//   13   29:invokestatic    #44  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
		//   14   32:return          
			} else
			{
				setStateInternal(mTargetState);
		//   15   33:aload_0         
		//   16   34:getfield        #19  <Field BottomSheetBehavior this$0>
		//   17   37:aload_0         
		//   18   38:getfield        #26  <Field int mTargetState>
		//   19   41:invokevirtual   #48  <Method void BottomSheetBehavior.setStateInternal(int)>
				return;
		//   20   44:return          
			}
		}

		private final int mTargetState;
		private final View mView;
		final BottomSheetBehavior this$0;

		SettleRunnable(View view, int i)
		{
			this$0 = BottomSheetBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BottomSheetBehavior this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mView = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field View mView>
			mTargetState = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int mTargetState>
		//   11   19:return          
		}
	}

	public static interface State
		extends Annotation
	{
	}


	public BottomSheetBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void CoordinatorLayout$Behavior()>
		mState = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #77  <Field int mState>
		mDragCallback = ((android.support.v4.widget.ViewDragHelper.Callback) (new android.support.v4.widget.ViewDragHelper.Callback() {

			public int clampViewPositionHorizontal(View view, int i, int j)
			{
				return view.getLeft();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method int View.getLeft()>
			//    2    4:ireturn         
			}

			public int clampViewPositionVertical(View view, int i, int j)
			{
				int k = mMinOffset;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//    2    4:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//    3    7:istore          4
				if(mHideable)
			//*   4    9:aload_0         
			//*   5   10:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   6   13:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
			//*   7   16:ifeq            30
					j = mParentHeight;
			//    8   19:aload_0         
			//    9   20:getfield        #12  <Field BottomSheetBehavior this$0>
			//   10   23:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//   11   26:istore_3        
				else
			//*  12   27:goto            38
					j = mMaxOffset;
			//   13   30:aload_0         
			//   14   31:getfield        #12  <Field BottomSheetBehavior this$0>
			//   15   34:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   16   37:istore_3        
				return MathUtils.clamp(i, k, j);
			//   17   38:iload_2         
			//   18   39:iload           4
			//   19   41:iload_3         
			//   20   42:invokestatic    #45  <Method int MathUtils.clamp(int, int, int)>
			//   21   45:ireturn         
			}

			public int getViewVerticalDragRange(View view)
			{
				if(mHideable)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   2    4:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
			//*   3    7:ifeq            26
					return mParentHeight - mMinOffset;
			//    4   10:aload_0         
			//    5   11:getfield        #12  <Field BottomSheetBehavior this$0>
			//    6   14:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//    7   17:aload_0         
			//    8   18:getfield        #12  <Field BottomSheetBehavior this$0>
			//    9   21:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//   10   24:isub            
			//   11   25:ireturn         
				else
					return mMaxOffset - mMinOffset;
			//   12   26:aload_0         
			//   13   27:getfield        #12  <Field BottomSheetBehavior this$0>
			//   14   30:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   15   33:aload_0         
			//   16   34:getfield        #12  <Field BottomSheetBehavior this$0>
			//   17   37:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//   18   40:isub            
			//   19   41:ireturn         
			}

			public void onViewDragStateChanged(int i)
			{
				if(i == 1)
			//*   0    0:iload_1         
			//*   1    1:iconst_1        
			//*   2    2:icmpne          13
					setStateInternal(1);
			//    3    5:aload_0         
			//    4    6:getfield        #12  <Field BottomSheetBehavior this$0>
			//    5    9:iconst_1        
			//    6   10:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			//    7   13:return          
			}

			public void onViewPositionChanged(View view, int i, int j, int k, int l)
			{
				dispatchOnSlide(j);
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//    2    4:iload_3         
			//    3    5:invokevirtual   #57  <Method void BottomSheetBehavior.dispatchOnSlide(int)>
			//    4    8:return          
			}

			public void onViewReleased(View view, float f, float f1)
			{
				byte byte0 = 4;
			//    0    0:iconst_4        
			//    1    1:istore          5
				if(f1 >= 0.0F) goto _L2; else goto _L1
			//    2    3:fload_3         
			//    3    4:fconst_0        
			//    4    5:fcmpg           
			//    5    6:ifge            24
_L1:
				int i = mMinOffset;
			//    6    9:aload_0         
			//    7   10:getfield        #12  <Field BottomSheetBehavior this$0>
			//    8   13:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//    9   16:istore          4
_L4:
				byte0 = 3;
			//   10   18:iconst_3        
			//   11   19:istore          5
				break MISSING_BLOCK_LABEL_135;
			//   12   21:goto            135
_L2:
				if(mHideable && shouldHide(view, f1))
			//*  13   24:aload_0         
			//*  14   25:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  15   28:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
			//*  16   31:ifeq            61
			//*  17   34:aload_0         
			//*  18   35:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  19   38:aload_1         
			//*  20   39:fload_3         
			//*  21   40:invokevirtual   #63  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
			//*  22   43:ifeq            61
				{
					i = mParentHeight;
			//   23   46:aload_0         
			//   24   47:getfield        #12  <Field BottomSheetBehavior this$0>
			//   25   50:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//   26   53:istore          4
					byte0 = 5;
			//   27   55:iconst_5        
			//   28   56:istore          5
					break MISSING_BLOCK_LABEL_135;
			//   29   58:goto            135
				}
				if(f1 != 0.0F)
					break; /* Loop/switch isn't completed */
			//   30   61:fload_3         
			//   31   62:fconst_0        
			//   32   63:fcmpl           
			//   33   64:ifne            126
				i = view.getTop();
			//   34   67:aload_1         
			//   35   68:invokevirtual   #66  <Method int View.getTop()>
			//   36   71:istore          4
				if(Math.abs(i - mMinOffset) < Math.abs(i - mMaxOffset))
			//*  37   73:iload           4
			//*  38   75:aload_0         
			//*  39   76:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  40   79:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//*  41   82:isub            
			//*  42   83:invokestatic    #72  <Method int Math.abs(int)>
			//*  43   86:iload           4
			//*  44   88:aload_0         
			//*  45   89:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  46   92:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//*  47   95:isub            
			//*  48   96:invokestatic    #72  <Method int Math.abs(int)>
			//*  49   99:icmpge          114
				{
					i = mMinOffset;
			//   50  102:aload_0         
			//   51  103:getfield        #12  <Field BottomSheetBehavior this$0>
			//   52  106:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//   53  109:istore          4
				} else
			//*  54  111:goto            18
				{
					i = mMaxOffset;
			//   55  114:aload_0         
			//   56  115:getfield        #12  <Field BottomSheetBehavior this$0>
			//   57  118:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   58  121:istore          4
					break MISSING_BLOCK_LABEL_135;
			//   59  123:goto            135
				}
				if(true) goto _L4; else goto _L3
_L3:
				i = mMaxOffset;
			//   60  126:aload_0         
			//   61  127:getfield        #12  <Field BottomSheetBehavior this$0>
			//   62  130:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   63  133:istore          4
				if(mViewDragHelper.settleCapturedViewAt(view.getLeft(), i))
			//*  64  135:aload_0         
			//*  65  136:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  66  139:getfield        #76  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
			//*  67  142:aload_1         
			//*  68  143:invokevirtual   #24  <Method int View.getLeft()>
			//*  69  146:iload           4
			//*  70  148:invokevirtual   #82  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
			//*  71  151:ifeq            181
				{
					setStateInternal(2);
			//   72  154:aload_0         
			//   73  155:getfield        #12  <Field BottomSheetBehavior this$0>
			//   74  158:iconst_2        
			//   75  159:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
					ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, ((int) (byte0))))));
			//   76  162:aload_1         
			//   77  163:new             #84  <Class BottomSheetBehavior$SettleRunnable>
			//   78  166:dup             
			//   79  167:aload_0         
			//   80  168:getfield        #12  <Field BottomSheetBehavior this$0>
			//   81  171:aload_1         
			//   82  172:iload           5
			//   83  174:invokespecial   #87  <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
			//   84  177:invokestatic    #93  <Method void ViewCompat.postOnAnimation(View, Runnable)>
					return;
			//   85  180:return          
				} else
				{
					setStateInternal(((int) (byte0)));
			//   86  181:aload_0         
			//   87  182:getfield        #12  <Field BottomSheetBehavior this$0>
			//   88  185:iload           5
			//   89  187:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
					return;
			//   90  190:return          
				}
			}

			public boolean tryCaptureView(View view, int i)
			{
				if(mState == 1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   2    4:getfield        #98  <Field int BottomSheetBehavior.mState>
			//*   3    7:iconst_1        
			//*   4    8:icmpne          13
					return false;
			//    5   11:iconst_0        
			//    6   12:ireturn         
				if(mTouchingScrollingChild)
			//*   7   13:aload_0         
			//*   8   14:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   9   17:getfield        #101 <Field boolean BottomSheetBehavior.mTouchingScrollingChild>
			//*  10   20:ifeq            25
					return false;
			//   11   23:iconst_0        
			//   12   24:ireturn         
				if(mState == 3 && mActivePointerId == i)
			//*  13   25:aload_0         
			//*  14   26:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  15   29:getfield        #98  <Field int BottomSheetBehavior.mState>
			//*  16   32:iconst_3        
			//*  17   33:icmpne          75
			//*  18   36:aload_0         
			//*  19   37:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  20   40:getfield        #104 <Field int BottomSheetBehavior.mActivePointerId>
			//*  21   43:iload_2         
			//*  22   44:icmpne          75
				{
					View view1 = (View)mNestedScrollingChildRef.get();
			//   23   47:aload_0         
			//   24   48:getfield        #12  <Field BottomSheetBehavior this$0>
			//   25   51:getfield        #108 <Field WeakReference BottomSheetBehavior.mNestedScrollingChildRef>
			//   26   54:invokevirtual   #114 <Method Object WeakReference.get()>
			//   27   57:checkcast       #20  <Class View>
			//   28   60:astore_3        
					if(view1 != null && view1.canScrollVertically(-1))
			//*  29   61:aload_3         
			//*  30   62:ifnull          75
			//*  31   65:aload_3         
			//*  32   66:iconst_m1       
			//*  33   67:invokevirtual   #118 <Method boolean View.canScrollVertically(int)>
			//*  34   70:ifeq            75
						return false;
			//   35   73:iconst_0        
			//   36   74:ireturn         
				}
				return mViewRef != null && mViewRef.get() == view;
			//   37   75:aload_0         
			//   38   76:getfield        #12  <Field BottomSheetBehavior this$0>
			//   39   79:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
			//   40   82:ifnull          101
			//   41   85:aload_0         
			//   42   86:getfield        #12  <Field BottomSheetBehavior this$0>
			//   43   89:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
			//   44   92:invokevirtual   #114 <Method Object WeakReference.get()>
			//   45   95:aload_1         
			//   46   96:if_acmpne       101
			//   47   99:iconst_1        
			//   48  100:ireturn         
			//   49  101:iconst_0        
			//   50  102:ireturn         
			}

			final BottomSheetBehavior this$0;

			
			{
				this$0 = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BottomSheetBehavior this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
			//    5    9:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #9   <Class BottomSheetBehavior$2>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #80  <Method void BottomSheetBehavior$2(BottomSheetBehavior)>
	//   10   18:putfield        #82  <Field android.support.v4.widget.ViewDragHelper$Callback mDragCallback>
	//   11   21:return          
	}

	public BottomSheetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #86  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
		mState = 4;
	//    4    6:aload_0         
	//    5    7:iconst_4        
	//    6    8:putfield        #77  <Field int mState>
		mDragCallback = ((android.support.v4.widget.ViewDragHelper.Callback) (new _cls2()));
	//    7   11:aload_0         
	//    8   12:new             #9   <Class BottomSheetBehavior$2>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #80  <Method void BottomSheetBehavior$2(BottomSheetBehavior)>
	//   12   20:putfield        #82  <Field android.support.v4.widget.ViewDragHelper$Callback mDragCallback>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.BottomSheetBehavior_Layout)));
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:getstatic       #92  <Field int[] android.support.design.R$styleable.BottomSheetBehavior_Layout>
	//   16   28:invokevirtual   #98  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   17   31:astore_2        
		TypedValue typedvalue = ((TypedArray) (attributeset)).peekValue(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
	//   18   32:aload_2         
	//   19   33:getstatic       #101 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   20   36:invokevirtual   #107 <Method TypedValue TypedArray.peekValue(int)>
	//   21   39:astore_3        
		if(typedvalue != null && typedvalue.data == -1)
	//*  22   40:aload_3         
	//*  23   41:ifnull          63
	//*  24   44:aload_3         
	//*  25   45:getfield        #112 <Field int TypedValue.data>
	//*  26   48:iconst_m1       
	//*  27   49:icmpne          63
			setPeekHeight(typedvalue.data);
	//   28   52:aload_0         
	//   29   53:aload_3         
	//   30   54:getfield        #112 <Field int TypedValue.data>
	//   31   57:invokevirtual   #116 <Method void setPeekHeight(int)>
		else
	//*  32   60:goto            75
			setPeekHeight(((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
	//   33   63:aload_0         
	//   34   64:aload_2         
	//   35   65:getstatic       #101 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   36   68:iconst_m1       
	//   37   69:invokevirtual   #120 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   38   72:invokevirtual   #116 <Method void setPeekHeight(int)>
		setHideable(((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
	//   39   75:aload_0         
	//   40   76:aload_2         
	//   41   77:getstatic       #123 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_hideable>
	//   42   80:iconst_0        
	//   43   81:invokevirtual   #127 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   44   84:invokevirtual   #131 <Method void setHideable(boolean)>
		setSkipCollapsed(((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
	//   45   87:aload_0         
	//   46   88:aload_2         
	//   47   89:getstatic       #134 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed>
	//   48   92:iconst_0        
	//   49   93:invokevirtual   #127 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   50   96:invokevirtual   #137 <Method void setSkipCollapsed(boolean)>
		((TypedArray) (attributeset)).recycle();
	//   51   99:aload_2         
	//   52  100:invokevirtual   #140 <Method void TypedArray.recycle()>
		mMaximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
	//   53  103:aload_0         
	//   54  104:aload_1         
	//   55  105:invokestatic    #146 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   56  108:invokevirtual   #150 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   57  111:i2f             
	//   58  112:putfield        #152 <Field float mMaximumVelocity>
	//   59  115:return          
	}

	public static BottomSheetBehavior from(View view)
	{
		view = ((View) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_0        
		if(!(view instanceof CoordinatorLayout.LayoutParams))
	//*   3    5:aload_0         
	//*   4    6:instanceof      #162 <Class CoordinatorLayout$LayoutParams>
	//*   5    9:ifne            22
			throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
	//    6   12:new             #164 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #166 <String "The view is not a child of CoordinatorLayout">
	//    9   18:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		view = ((View) (((CoordinatorLayout.LayoutParams)view).getBehavior()));
	//   11   22:aload_0         
	//   12   23:checkcast       #162 <Class CoordinatorLayout$LayoutParams>
	//   13   26:invokevirtual   #173 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   14   29:astore_0        
		if(!(view instanceof BottomSheetBehavior))
	//*  15   30:aload_0         
	//*  16   31:instanceof      #2   <Class BottomSheetBehavior>
	//*  17   34:ifne            47
			throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
	//   18   37:new             #164 <Class IllegalArgumentException>
	//   19   40:dup             
	//   20   41:ldc1            #175 <String "The view is not associated with BottomSheetBehavior">
	//   21   43:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   22   46:athrow          
		else
			return (BottomSheetBehavior)view;
	//   23   47:aload_0         
	//   24   48:checkcast       #2   <Class BottomSheetBehavior>
	//   25   51:areturn         
	}

	private float getYVelocity()
	{
		mVelocityTracker.computeCurrentVelocity(1000, mMaximumVelocity);
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//    2    4:sipush          1000
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field float mMaximumVelocity>
	//    5   11:invokevirtual   #187 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		return mVelocityTracker.getYVelocity(mActivePointerId);
	//    6   14:aload_0         
	//    7   15:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//    8   18:aload_0         
	//    9   19:getfield        #189 <Field int mActivePointerId>
	//   10   22:invokevirtual   #192 <Method float VelocityTracker.getYVelocity(int)>
	//   11   25:freturn         
	}

	private void reset()
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #189 <Field int mActivePointerId>
		if(mVelocityTracker != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*   5    9:ifnull          24
		{
			mVelocityTracker.recycle();
	//    6   12:aload_0         
	//    7   13:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//    8   16:invokevirtual   #194 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #181 <Field VelocityTracker mVelocityTracker>
		}
	//   12   24:return          
	}

	void dispatchOnSlide(int i)
	{
		View view = (View)mViewRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field WeakReference mViewRef>
	//    2    4:invokevirtual   #202 <Method Object WeakReference.get()>
	//    3    7:checkcast       #156 <Class View>
	//    4   10:astore_2        
		if(view != null && mCallback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          83
	//*   7   15:aload_0         
	//*   8   16:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//*   9   19:ifnull          83
		{
			if(i > mMaxOffset)
	//*  10   22:iload_1         
	//*  11   23:aload_0         
	//*  12   24:getfield        #206 <Field int mMaxOffset>
	//*  13   27:icmple          57
			{
				mCallback.onSlide(view, (float)(mMaxOffset - i) / (float)(mParentHeight - mMaxOffset));
	//   14   30:aload_0         
	//   15   31:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:getfield        #206 <Field int mMaxOffset>
	//   19   39:iload_1         
	//   20   40:isub            
	//   21   41:i2f             
	//   22   42:aload_0         
	//   23   43:getfield        #208 <Field int mParentHeight>
	//   24   46:aload_0         
	//   25   47:getfield        #206 <Field int mMaxOffset>
	//   26   50:isub            
	//   27   51:i2f             
	//   28   52:fdiv            
	//   29   53:invokevirtual   #212 <Method void BottomSheetBehavior$BottomSheetCallback.onSlide(View, float)>
				return;
	//   30   56:return          
			}
			mCallback.onSlide(view, (float)(mMaxOffset - i) / (float)(mMaxOffset - mMinOffset));
	//   31   57:aload_0         
	//   32   58:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//   33   61:aload_2         
	//   34   62:aload_0         
	//   35   63:getfield        #206 <Field int mMaxOffset>
	//   36   66:iload_1         
	//   37   67:isub            
	//   38   68:i2f             
	//   39   69:aload_0         
	//   40   70:getfield        #206 <Field int mMaxOffset>
	//   41   73:aload_0         
	//   42   74:getfield        #214 <Field int mMinOffset>
	//   43   77:isub            
	//   44   78:i2f             
	//   45   79:fdiv            
	//   46   80:invokevirtual   #212 <Method void BottomSheetBehavior$BottomSheetCallback.onSlide(View, float)>
		}
	//   47   83:return          
	}

	View findScrollingChild(View view)
	{
		if(ViewCompat.isNestedScrollingEnabled(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #223 <Method boolean ViewCompat.isNestedScrollingEnabled(View)>
	//*   2    4:ifeq            9
			return view;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(view instanceof ViewGroup)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #225 <Class ViewGroup>
	//*   7   13:ifeq            59
		{
			view = ((View) ((ViewGroup)view));
	//    8   16:aload_1         
	//    9   17:checkcast       #225 <Class ViewGroup>
	//   10   20:astore_1        
			int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			for(int j = ((ViewGroup) (view)).getChildCount(); i < j; i++)
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #228 <Method int ViewGroup.getChildCount()>
	//*  15   27:istore_3        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          59
			{
				View view1 = findScrollingChild(((ViewGroup) (view)).getChildAt(i));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #232 <Method View ViewGroup.getChildAt(int)>
	//   23   39:invokevirtual   #234 <Method View findScrollingChild(View)>
	//   24   42:astore          4
				if(view1 != null)
	//*  25   44:aload           4
	//*  26   46:ifnull          52
					return view1;
	//   27   49:aload           4
	//   28   51:areturn         
			}

	//   29   52:iload_2         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_2        
		}
	//*  33   56:goto            28
		return null;
	//   34   59:aconst_null     
	//   35   60:areturn         
	}

	public final int getPeekHeight()
	{
		if(mPeekHeightAuto)
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field boolean mPeekHeightAuto>
	//*   2    4:ifeq            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return mPeekHeight;
	//    5    9:aload_0         
	//    6   10:getfield        #240 <Field int mPeekHeight>
	//    7   13:ireturn         
	}

	int getPeekHeightMin()
	{
		return mPeekHeightMin;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field int mPeekHeightMin>
	//    2    4:ireturn         
	}

	public boolean getSkipCollapsed()
	{
		return mSkipCollapsed;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field boolean mSkipCollapsed>
	//    2    4:ireturn         
	}

	public final int getState()
	{
		return mState;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mState>
	//    2    4:ireturn         
	}

	public boolean isHideable()
	{
		return mHideable;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field boolean mHideable>
	//    2    4:ireturn         
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		int i;
		boolean flag3;
		boolean flag = view.isShown();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #256 <Method boolean View.isShown()>
	//    2    4:istore          6
		flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		if(!flag)
	//*   5    9:iload           6
	//*   6   11:ifne            21
		{
			mIgnoreEvents = true;
	//    7   14:aload_0         
	//    8   15:iconst_1        
	//    9   16:putfield        #258 <Field boolean mIgnoreEvents>
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		}
		i = motionevent.getActionMasked();
	//   12   21:aload_3         
	//   13   22:invokevirtual   #263 <Method int MotionEvent.getActionMasked()>
	//   14   25:istore          4
		if(i == 0)
	//*  15   27:iload           4
	//*  16   29:ifne            36
			reset();
	//   17   32:aload_0         
	//   18   33:invokespecial   #265 <Method void reset()>
		if(mVelocityTracker == null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  21   40:ifnonnull       50
			mVelocityTracker = VelocityTracker.obtain();
	//   22   43:aload_0         
	//   23   44:invokestatic    #269 <Method VelocityTracker VelocityTracker.obtain()>
	//   24   47:putfield        #181 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   25   50:aload_0         
	//   26   51:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #273 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i == 3) goto _L2; else goto _L1
	//   29   58:iload           4
	//   30   60:iconst_3        
	//   31   61:icmpeq          209
_L1:
		i;
	//   32   64:iload           4
		JVM INSTR tableswitch 0 1: default 88
	//	               0 91
	//	               1 209;
	//   33   66:tableswitch     0 1: default 88
	//	               0 91
	//	               1 209
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//   34   88:goto            233
_L4:
		int j = (int)motionevent.getX();
	//   35   91:aload_3         
	//   36   92:invokevirtual   #276 <Method float MotionEvent.getX()>
	//   37   95:f2i             
	//   38   96:istore          5
		mInitialY = (int)motionevent.getY();
	//   39   98:aload_0         
	//   40   99:aload_3         
	//   41  100:invokevirtual   #279 <Method float MotionEvent.getY()>
	//   42  103:f2i             
	//   43  104:putfield        #281 <Field int mInitialY>
		View view1;
		if(mNestedScrollingChildRef != null)
	//*  44  107:aload_0         
	//*  45  108:getfield        #283 <Field WeakReference mNestedScrollingChildRef>
	//*  46  111:ifnull          129
			view1 = (View)mNestedScrollingChildRef.get();
	//   47  114:aload_0         
	//   48  115:getfield        #283 <Field WeakReference mNestedScrollingChildRef>
	//   49  118:invokevirtual   #202 <Method Object WeakReference.get()>
	//   50  121:checkcast       #156 <Class View>
	//   51  124:astore          8
		else
	//*  52  126:goto            132
			view1 = null;
	//   53  129:aconst_null     
	//   54  130:astore          8
		if(view1 != null && coordinatorlayout.isPointInChildBounds(view1, j, mInitialY))
	//*  55  132:aload           8
	//*  56  134:ifnull          169
	//*  57  137:aload_1         
	//*  58  138:aload           8
	//*  59  140:iload           5
	//*  60  142:aload_0         
	//*  61  143:getfield        #281 <Field int mInitialY>
	//*  62  146:invokevirtual   #289 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  63  149:ifeq            169
		{
			mActivePointerId = motionevent.getPointerId(motionevent.getActionIndex());
	//   64  152:aload_0         
	//   65  153:aload_3         
	//   66  154:aload_3         
	//   67  155:invokevirtual   #292 <Method int MotionEvent.getActionIndex()>
	//   68  158:invokevirtual   #296 <Method int MotionEvent.getPointerId(int)>
	//   69  161:putfield        #189 <Field int mActivePointerId>
			mTouchingScrollingChild = true;
	//   70  164:aload_0         
	//   71  165:iconst_1        
	//   72  166:putfield        #298 <Field boolean mTouchingScrollingChild>
		}
		boolean flag1;
		if(mActivePointerId == -1 && !coordinatorlayout.isPointInChildBounds(view, j, mInitialY))
	//*  73  169:aload_0         
	//*  74  170:getfield        #189 <Field int mActivePointerId>
	//*  75  173:iconst_m1       
	//*  76  174:icmpne          197
	//*  77  177:aload_1         
	//*  78  178:aload_2         
	//*  79  179:iload           5
	//*  80  181:aload_0         
	//*  81  182:getfield        #281 <Field int mInitialY>
	//*  82  185:invokevirtual   #289 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  83  188:ifne            197
			flag1 = true;
	//   84  191:iconst_1        
	//   85  192:istore          6
		else
	//*  86  194:goto            200
			flag1 = false;
	//   87  197:iconst_0        
	//   88  198:istore          6
		mIgnoreEvents = flag1;
	//   89  200:aload_0         
	//   90  201:iload           6
	//   91  203:putfield        #258 <Field boolean mIgnoreEvents>
		break; /* Loop/switch isn't completed */
	//   92  206:goto            233
_L2:
		mTouchingScrollingChild = false;
	//   93  209:aload_0         
	//   94  210:iconst_0        
	//   95  211:putfield        #298 <Field boolean mTouchingScrollingChild>
		mActivePointerId = -1;
	//   96  214:aload_0         
	//   97  215:iconst_m1       
	//   98  216:putfield        #189 <Field int mActivePointerId>
		if(mIgnoreEvents)
	//*  99  219:aload_0         
	//* 100  220:getfield        #258 <Field boolean mIgnoreEvents>
	//* 101  223:ifeq            233
		{
			mIgnoreEvents = false;
	//  102  226:aload_0         
	//  103  227:iconst_0        
	//  104  228:putfield        #258 <Field boolean mIgnoreEvents>
			return false;
	//  105  231:iconst_0        
	//  106  232:ireturn         
		}
		if(!mIgnoreEvents && mViewDragHelper.shouldInterceptTouchEvent(motionevent))
	//* 107  233:aload_0         
	//* 108  234:getfield        #258 <Field boolean mIgnoreEvents>
	//* 109  237:ifne            253
	//* 110  240:aload_0         
	//* 111  241:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//* 112  244:aload_3         
	//* 113  245:invokevirtual   #306 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//* 114  248:ifeq            253
			return true;
	//  115  251:iconst_1        
	//  116  252:ireturn         
		view = (View)mNestedScrollingChildRef.get();
	//  117  253:aload_0         
	//  118  254:getfield        #283 <Field WeakReference mNestedScrollingChildRef>
	//  119  257:invokevirtual   #202 <Method Object WeakReference.get()>
	//  120  260:checkcast       #156 <Class View>
	//  121  263:astore_2        
		boolean flag2 = flag3;
	//  122  264:iload           7
	//  123  266:istore          6
		if(i == 2)
	//* 124  268:iload           4
	//* 125  270:iconst_2        
	//* 126  271:icmpne          359
		{
			flag2 = flag3;
	//  127  274:iload           7
	//  128  276:istore          6
			if(view != null)
	//* 129  278:aload_2         
	//* 130  279:ifnull          359
			{
				flag2 = flag3;
	//  131  282:iload           7
	//  132  284:istore          6
				if(!mIgnoreEvents)
	//* 133  286:aload_0         
	//* 134  287:getfield        #258 <Field boolean mIgnoreEvents>
	//* 135  290:ifne            359
				{
					flag2 = flag3;
	//  136  293:iload           7
	//  137  295:istore          6
					if(mState != 1)
	//* 138  297:aload_0         
	//* 139  298:getfield        #77  <Field int mState>
	//* 140  301:iconst_1        
	//* 141  302:icmpeq          359
					{
						flag2 = flag3;
	//  142  305:iload           7
	//  143  307:istore          6
						if(!coordinatorlayout.isPointInChildBounds(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//* 144  309:aload_1         
	//* 145  310:aload_2         
	//* 146  311:aload_3         
	//* 147  312:invokevirtual   #276 <Method float MotionEvent.getX()>
	//* 148  315:f2i             
	//* 149  316:aload_3         
	//* 150  317:invokevirtual   #279 <Method float MotionEvent.getY()>
	//* 151  320:f2i             
	//* 152  321:invokevirtual   #289 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//* 153  324:ifne            359
						{
							flag2 = flag3;
	//  154  327:iload           7
	//  155  329:istore          6
							if(Math.abs((float)mInitialY - motionevent.getY()) > (float)mViewDragHelper.getTouchSlop())
	//* 156  331:aload_0         
	//* 157  332:getfield        #281 <Field int mInitialY>
	//* 158  335:i2f             
	//* 159  336:aload_3         
	//* 160  337:invokevirtual   #279 <Method float MotionEvent.getY()>
	//* 161  340:fsub            
	//* 162  341:invokestatic    #312 <Method float Math.abs(float)>
	//* 163  344:aload_0         
	//* 164  345:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//* 165  348:invokevirtual   #315 <Method int ViewDragHelper.getTouchSlop()>
	//* 166  351:i2f             
	//* 167  352:fcmpl           
	//* 168  353:ifle            359
								flag2 = true;
	//  169  356:iconst_1        
	//  170  357:istore          6
						}
					}
				}
			}
		}
		return flag2;
	//  171  359:iload           6
	//  172  361:ireturn         
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		if(ViewCompat.getFitsSystemWindows(((View) (coordinatorlayout))) && !ViewCompat.getFitsSystemWindows(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #321 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   2    4:ifeq            19
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #321 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   5   11:ifne            19
			ViewCompat.setFitsSystemWindows(view, true);
	//    6   14:aload_2         
	//    7   15:iconst_1        
	//    8   16:invokestatic    #325 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
		int j = view.getTop();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #328 <Method int View.getTop()>
	//   11   23:istore          4
		coordinatorlayout.onLayoutChild(view, i);
	//   12   25:aload_1         
	//   13   26:aload_2         
	//   14   27:iload_3         
	//   15   28:invokevirtual   #331 <Method void CoordinatorLayout.onLayoutChild(View, int)>
		mParentHeight = coordinatorlayout.getHeight();
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #334 <Method int CoordinatorLayout.getHeight()>
	//   19   36:putfield        #208 <Field int mParentHeight>
		if(mPeekHeightAuto)
	//*  20   39:aload_0         
	//*  21   40:getfield        #238 <Field boolean mPeekHeightAuto>
	//*  22   43:ifeq            93
		{
			if(mPeekHeightMin == 0)
	//*  23   46:aload_0         
	//*  24   47:getfield        #243 <Field int mPeekHeightMin>
	//*  25   50:ifne            67
				mPeekHeightMin = coordinatorlayout.getResources().getDimensionPixelSize(android.support.design.R.dimen.design_bottom_sheet_peek_height_min);
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #338 <Method Resources CoordinatorLayout.getResources()>
	//   29   58:getstatic       #343 <Field int android.support.design.R$dimen.design_bottom_sheet_peek_height_min>
	//   30   61:invokevirtual   #347 <Method int Resources.getDimensionPixelSize(int)>
	//   31   64:putfield        #243 <Field int mPeekHeightMin>
			i = Math.max(mPeekHeightMin, mParentHeight - (coordinatorlayout.getWidth() * 9) / 16);
	//   32   67:aload_0         
	//   33   68:getfield        #243 <Field int mPeekHeightMin>
	//   34   71:aload_0         
	//   35   72:getfield        #208 <Field int mParentHeight>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #350 <Method int CoordinatorLayout.getWidth()>
	//   38   79:bipush          9
	//   39   81:imul            
	//   40   82:bipush          16
	//   41   84:idiv            
	//   42   85:isub            
	//   43   86:invokestatic    #353 <Method int Math.max(int, int)>
	//   44   89:istore_3        
		} else
	//*  45   90:goto            98
		{
			i = mPeekHeight;
	//   46   93:aload_0         
	//   47   94:getfield        #240 <Field int mPeekHeight>
	//   48   97:istore_3        
		}
		mMinOffset = Math.max(0, mParentHeight - view.getHeight());
	//   49   98:aload_0         
	//   50   99:iconst_0        
	//   51  100:aload_0         
	//   52  101:getfield        #208 <Field int mParentHeight>
	//   53  104:aload_2         
	//   54  105:invokevirtual   #354 <Method int View.getHeight()>
	//   55  108:isub            
	//   56  109:invokestatic    #353 <Method int Math.max(int, int)>
	//   57  112:putfield        #214 <Field int mMinOffset>
		mMaxOffset = Math.max(mParentHeight - i, mMinOffset);
	//   58  115:aload_0         
	//   59  116:aload_0         
	//   60  117:getfield        #208 <Field int mParentHeight>
	//   61  120:iload_3         
	//   62  121:isub            
	//   63  122:aload_0         
	//   64  123:getfield        #214 <Field int mMinOffset>
	//   65  126:invokestatic    #353 <Method int Math.max(int, int)>
	//   66  129:putfield        #206 <Field int mMaxOffset>
		if(mState == 3)
	//*  67  132:aload_0         
	//*  68  133:getfield        #77  <Field int mState>
	//*  69  136:iconst_3        
	//*  70  137:icmpne          151
			ViewCompat.offsetTopAndBottom(view, mMinOffset);
	//   71  140:aload_2         
	//   72  141:aload_0         
	//   73  142:getfield        #214 <Field int mMinOffset>
	//   74  145:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//*  75  148:goto            223
		if(mHideable && mState == 5)
	//*  76  151:aload_0         
	//*  77  152:getfield        #251 <Field boolean mHideable>
	//*  78  155:ifeq            177
	//*  79  158:aload_0         
	//*  80  159:getfield        #77  <Field int mState>
	//*  81  162:iconst_5        
	//*  82  163:icmpne          177
			ViewCompat.offsetTopAndBottom(view, mParentHeight);
	//   83  166:aload_2         
	//   84  167:aload_0         
	//   85  168:getfield        #208 <Field int mParentHeight>
	//   86  171:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//*  87  174:goto            223
		if(mState == 4)
	//*  88  177:aload_0         
	//*  89  178:getfield        #77  <Field int mState>
	//*  90  181:iconst_4        
	//*  91  182:icmpne          196
			ViewCompat.offsetTopAndBottom(view, mMaxOffset);
	//   92  185:aload_2         
	//   93  186:aload_0         
	//   94  187:getfield        #206 <Field int mMaxOffset>
	//   95  190:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//*  96  193:goto            223
		if(mState == 1 || mState == 2)
	//*  97  196:aload_0         
	//*  98  197:getfield        #77  <Field int mState>
	//*  99  200:iconst_1        
	//* 100  201:icmpeq          212
	//* 101  204:aload_0         
	//* 102  205:getfield        #77  <Field int mState>
	//* 103  208:iconst_2        
	//* 104  209:icmpne          223
			ViewCompat.offsetTopAndBottom(view, j - view.getTop());
	//  105  212:aload_2         
	//  106  213:iload           4
	//  107  215:aload_2         
	//  108  216:invokevirtual   #328 <Method int View.getTop()>
	//  109  219:isub            
	//  110  220:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		if(mViewDragHelper == null)
	//* 111  223:aload_0         
	//* 112  224:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//* 113  227:ifnonnull       242
			mViewDragHelper = ViewDragHelper.create(((ViewGroup) (coordinatorlayout)), mDragCallback);
	//  114  230:aload_0         
	//  115  231:aload_1         
	//  116  232:aload_0         
	//  117  233:getfield        #82  <Field android.support.v4.widget.ViewDragHelper$Callback mDragCallback>
	//  118  236:invokestatic    #361 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, android.support.v4.widget.ViewDragHelper$Callback)>
	//  119  239:putfield        #300 <Field ViewDragHelper mViewDragHelper>
		mViewRef = new WeakReference(((Object) (view)));
	//  120  242:aload_0         
	//  121  243:new             #199 <Class WeakReference>
	//  122  246:dup             
	//  123  247:aload_2         
	//  124  248:invokespecial   #364 <Method void WeakReference(Object)>
	//  125  251:putfield        #197 <Field WeakReference mViewRef>
		mNestedScrollingChildRef = new WeakReference(((Object) (findScrollingChild(view))));
	//  126  254:aload_0         
	//  127  255:new             #199 <Class WeakReference>
	//  128  258:dup             
	//  129  259:aload_0         
	//  130  260:aload_2         
	//  131  261:invokevirtual   #234 <Method View findScrollingChild(View)>
	//  132  264:invokespecial   #364 <Method void WeakReference(Object)>
	//  133  267:putfield        #283 <Field WeakReference mNestedScrollingChildRef>
		return true;
	//  134  270:iconst_1        
	//  135  271:ireturn         
	}

	public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
	{
		return view1 == mNestedScrollingChildRef.get() && (mState != 3 || super.onNestedPreFling(coordinatorlayout, view, view1, f, f1));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #283 <Field WeakReference mNestedScrollingChildRef>
	//    3    5:invokevirtual   #202 <Method Object WeakReference.get()>
	//    4    8:if_acmpne       35
	//    5   11:aload_0         
	//    6   12:getfield        #77  <Field int mState>
	//    7   15:iconst_3        
	//    8   16:icmpne          33
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:fload           4
	//   14   25:fload           5
	//   15   27:invokespecial   #369 <Method boolean CoordinatorLayout$Behavior.onNestedPreFling(CoordinatorLayout, View, View, float, float)>
	//   16   30:ifeq            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
	{
		if(view1 != (View)mNestedScrollingChildRef.get())
	//*   0    0:aload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #283 <Field WeakReference mNestedScrollingChildRef>
	//*   3    5:invokevirtual   #202 <Method Object WeakReference.get()>
	//*   4    8:checkcast       #156 <Class View>
	//*   5   11:if_acmpeq       15
			return;
	//    6   14:return          
		i = view.getTop();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #328 <Method int View.getTop()>
	//    9   19:istore          4
		int k = i - j;
	//   10   21:iload           4
	//   11   23:iload           5
	//   12   25:isub            
	//   13   26:istore          7
		if(j > 0)
	//*  14   28:iload           5
	//*  15   30:ifle            91
		{
			if(k < mMinOffset)
	//*  16   33:iload           7
	//*  17   35:aload_0         
	//*  18   36:getfield        #214 <Field int mMinOffset>
	//*  19   39:icmpge          70
			{
				ai[1] = i - mMinOffset;
	//   20   42:aload           6
	//   21   44:iconst_1        
	//   22   45:iload           4
	//   23   47:aload_0         
	//   24   48:getfield        #214 <Field int mMinOffset>
	//   25   51:isub            
	//   26   52:iastore         
				ViewCompat.offsetTopAndBottom(view, -ai[1]);
	//   27   53:aload_2         
	//   28   54:aload           6
	//   29   56:iconst_1        
	//   30   57:iaload          
	//   31   58:ineg            
	//   32   59:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(3);
	//   33   62:aload_0         
	//   34   63:iconst_3        
	//   35   64:invokevirtual   #375 <Method void setStateInternal(int)>
			} else
	//*  36   67:goto            169
			{
				ai[1] = j;
	//   37   70:aload           6
	//   38   72:iconst_1        
	//   39   73:iload           5
	//   40   75:iastore         
				ViewCompat.offsetTopAndBottom(view, -j);
	//   41   76:aload_2         
	//   42   77:iload           5
	//   43   79:ineg            
	//   44   80:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(1);
	//   45   83:aload_0         
	//   46   84:iconst_1        
	//   47   85:invokevirtual   #375 <Method void setStateInternal(int)>
			}
		} else
	//*  48   88:goto            169
		if(j < 0 && !view1.canScrollVertically(-1))
	//*  49   91:iload           5
	//*  50   93:ifge            169
	//*  51   96:aload_3         
	//*  52   97:iconst_m1       
	//*  53   98:invokevirtual   #379 <Method boolean View.canScrollVertically(int)>
	//*  54  101:ifne            169
			if(k > mMaxOffset && !mHideable)
	//*  55  104:iload           7
	//*  56  106:aload_0         
	//*  57  107:getfield        #206 <Field int mMaxOffset>
	//*  58  110:icmple          151
	//*  59  113:aload_0         
	//*  60  114:getfield        #251 <Field boolean mHideable>
	//*  61  117:ifeq            123
	//*  62  120:goto            151
			{
				ai[1] = i - mMaxOffset;
	//   63  123:aload           6
	//   64  125:iconst_1        
	//   65  126:iload           4
	//   66  128:aload_0         
	//   67  129:getfield        #206 <Field int mMaxOffset>
	//   68  132:isub            
	//   69  133:iastore         
				ViewCompat.offsetTopAndBottom(view, -ai[1]);
	//   70  134:aload_2         
	//   71  135:aload           6
	//   72  137:iconst_1        
	//   73  138:iaload          
	//   74  139:ineg            
	//   75  140:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(4);
	//   76  143:aload_0         
	//   77  144:iconst_4        
	//   78  145:invokevirtual   #375 <Method void setStateInternal(int)>
			} else
	//*  79  148:goto            169
			{
				ai[1] = j;
	//   80  151:aload           6
	//   81  153:iconst_1        
	//   82  154:iload           5
	//   83  156:iastore         
				ViewCompat.offsetTopAndBottom(view, -j);
	//   84  157:aload_2         
	//   85  158:iload           5
	//   86  160:ineg            
	//   87  161:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(1);
	//   88  164:aload_0         
	//   89  165:iconst_1        
	//   90  166:invokevirtual   #375 <Method void setStateInternal(int)>
			}
		dispatchOnSlide(view.getTop());
	//   91  169:aload_0         
	//   92  170:aload_2         
	//   93  171:invokevirtual   #328 <Method int View.getTop()>
	//   94  174:invokevirtual   #381 <Method void dispatchOnSlide(int)>
		mLastNestedScrollDy = j;
	//   95  177:aload_0         
	//   96  178:iload           5
	//   97  180:putfield        #383 <Field int mLastNestedScrollDy>
		mNestedScrolled = true;
	//   98  183:aload_0         
	//   99  184:iconst_1        
	//  100  185:putfield        #385 <Field boolean mNestedScrolled>
	//  101  188:return          
	}

	public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_3         
	//    1    1:checkcast       #14  <Class BottomSheetBehavior$SavedState>
	//    2    4:astore_3        
		super.onRestoreInstanceState(coordinatorlayout, view, ((SavedState) (parcelable)).getSuperState());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #392 <Method Parcelable BottomSheetBehavior$SavedState.getSuperState()>
	//    8   12:invokespecial   #394 <Method void CoordinatorLayout$Behavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
		if(((SavedState) (parcelable)).state != 1 && ((SavedState) (parcelable)).state != 2)
	//*   9   15:aload_3         
	//*  10   16:getfield        #397 <Field int BottomSheetBehavior$SavedState.state>
	//*  11   19:iconst_1        
	//*  12   20:icmpeq          43
	//*  13   23:aload_3         
	//*  14   24:getfield        #397 <Field int BottomSheetBehavior$SavedState.state>
	//*  15   27:iconst_2        
	//*  16   28:icmpne          34
	//*  17   31:goto            43
		{
			mState = ((SavedState) (parcelable)).state;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:getfield        #397 <Field int BottomSheetBehavior$SavedState.state>
	//   21   39:putfield        #77  <Field int mState>
			return;
	//   22   42:return          
		} else
		{
			mState = 4;
	//   23   43:aload_0         
	//   24   44:iconst_4        
	//   25   45:putfield        #77  <Field int mState>
			return;
	//   26   48:return          
		}
	}

	public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
	{
		return ((Parcelable) (new SavedState(super.onSaveInstanceState(coordinatorlayout, view), mState)));
	//    0    0:new             #14  <Class BottomSheetBehavior$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #402 <Method Parcelable CoordinatorLayout$Behavior.onSaveInstanceState(CoordinatorLayout, View)>
	//    6   10:aload_0         
	//    7   11:getfield        #77  <Field int mState>
	//    8   14:invokespecial   #405 <Method void BottomSheetBehavior$SavedState(Parcelable, int)>
	//    9   17:areturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		mLastNestedScrollDy = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #383 <Field int mLastNestedScrollDy>
		mNestedScrolled = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #385 <Field boolean mNestedScrolled>
		if((i & 2) != 0)
	//*   8   13:iload           5
	//*   9   15:iconst_2        
	//*  10   16:iand            
	//*  11   17:ifeq            23
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore          6
		return flag;
	//   14   23:iload           6
	//   15   25:ireturn         
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
label0:
		{
			int i;
			byte byte0;
label1:
			{
				i = view.getTop();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #328 <Method int View.getTop()>
	//    2    4:istore          4
				int j = mMinOffset;
	//    3    6:aload_0         
	//    4    7:getfield        #214 <Field int mMinOffset>
	//    5   10:istore          6
				byte0 = 3;
	//    6   12:iconst_3        
	//    7   13:istore          5
				if(i == j)
	//*   8   15:iload           4
	//*   9   17:iload           6
	//*  10   19:icmpne          28
				{
					setStateInternal(3);
	//   11   22:aload_0         
	//   12   23:iconst_3        
	//   13   24:invokevirtual   #375 <Method void setStateInternal(int)>
					return;
	//   14   27:return          
				}
				if(mNestedScrollingChildRef == null || view1 != mNestedScrollingChildRef.get())
					break label0;
	//   15   28:aload_0         
	//   16   29:getfield        #283 <Field WeakReference mNestedScrollingChildRef>
	//   17   32:ifnull          216
	//   18   35:aload_3         
	//   19   36:aload_0         
	//   20   37:getfield        #283 <Field WeakReference mNestedScrollingChildRef>
	//   21   40:invokevirtual   #202 <Method Object WeakReference.get()>
	//   22   43:if_acmpne       216
				if(!mNestedScrolled)
	//*  23   46:aload_0         
	//*  24   47:getfield        #385 <Field boolean mNestedScrolled>
	//*  25   50:ifne            54
					return;
	//   26   53:return          
				if(mLastNestedScrollDy > 0)
	//*  27   54:aload_0         
	//*  28   55:getfield        #383 <Field int mLastNestedScrollDy>
	//*  29   58:ifle            70
				{
					i = mMinOffset;
	//   30   61:aload_0         
	//   31   62:getfield        #214 <Field int mMinOffset>
	//   32   65:istore          4
					break label1;
	//   33   67:goto            164
				}
				if(mHideable && shouldHide(view, getYVelocity()))
	//*  34   70:aload_0         
	//*  35   71:getfield        #251 <Field boolean mHideable>
	//*  36   74:ifeq            101
	//*  37   77:aload_0         
	//*  38   78:aload_2         
	//*  39   79:aload_0         
	//*  40   80:invokespecial   #413 <Method float getYVelocity()>
	//*  41   83:invokevirtual   #417 <Method boolean shouldHide(View, float)>
	//*  42   86:ifeq            101
				{
					i = mParentHeight;
	//   43   89:aload_0         
	//   44   90:getfield        #208 <Field int mParentHeight>
	//   45   93:istore          4
					byte0 = 5;
	//   46   95:iconst_5        
	//   47   96:istore          5
					break label1;
	//   48   98:goto            164
				}
				if(mLastNestedScrollDy == 0)
	//*  49  101:aload_0         
	//*  50  102:getfield        #383 <Field int mLastNestedScrollDy>
	//*  51  105:ifne            155
				{
					i = view.getTop();
	//   52  108:aload_2         
	//   53  109:invokevirtual   #328 <Method int View.getTop()>
	//   54  112:istore          4
					if(Math.abs(i - mMinOffset) < Math.abs(i - mMaxOffset))
	//*  55  114:iload           4
	//*  56  116:aload_0         
	//*  57  117:getfield        #214 <Field int mMinOffset>
	//*  58  120:isub            
	//*  59  121:invokestatic    #419 <Method int Math.abs(int)>
	//*  60  124:iload           4
	//*  61  126:aload_0         
	//*  62  127:getfield        #206 <Field int mMaxOffset>
	//*  63  130:isub            
	//*  64  131:invokestatic    #419 <Method int Math.abs(int)>
	//*  65  134:icmpge          146
					{
						i = mMinOffset;
	//   66  137:aload_0         
	//   67  138:getfield        #214 <Field int mMinOffset>
	//   68  141:istore          4
						break label1;
	//   69  143:goto            164
					}
					i = mMaxOffset;
	//   70  146:aload_0         
	//   71  147:getfield        #206 <Field int mMaxOffset>
	//   72  150:istore          4
				} else
	//*  73  152:goto            161
				{
					i = mMaxOffset;
	//   74  155:aload_0         
	//   75  156:getfield        #206 <Field int mMaxOffset>
	//   76  159:istore          4
				}
				byte0 = 4;
	//   77  161:iconst_4        
	//   78  162:istore          5
			}
			if(mViewDragHelper.smoothSlideViewTo(view, view.getLeft(), i))
	//*  79  164:aload_0         
	//*  80  165:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//*  81  168:aload_2         
	//*  82  169:aload_2         
	//*  83  170:invokevirtual   #422 <Method int View.getLeft()>
	//*  84  173:iload           4
	//*  85  175:invokevirtual   #425 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  86  178:ifeq            204
			{
				setStateInternal(2);
	//   87  181:aload_0         
	//   88  182:iconst_2        
	//   89  183:invokevirtual   #375 <Method void setStateInternal(int)>
				ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, ((int) (byte0))))));
	//   90  186:aload_2         
	//   91  187:new             #19  <Class BottomSheetBehavior$SettleRunnable>
	//   92  190:dup             
	//   93  191:aload_0         
	//   94  192:aload_2         
	//   95  193:iload           5
	//   96  195:invokespecial   #428 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//   97  198:invokestatic    #432 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			} else
	//*  98  201:goto            210
			{
				setStateInternal(((int) (byte0)));
	//   99  204:aload_0         
	//  100  205:iload           5
	//  101  207:invokevirtual   #375 <Method void setStateInternal(int)>
			}
			mNestedScrolled = false;
	//  102  210:aload_0         
	//  103  211:iconst_0        
	//  104  212:putfield        #385 <Field boolean mNestedScrolled>
			return;
	//  105  215:return          
		}
	//  106  216:return          
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(!view.isShown())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #256 <Method boolean View.isShown()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i = motionevent.getActionMasked();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #263 <Method int MotionEvent.getActionMasked()>
	//    7   13:istore          4
		if(mState == 1 && i == 0)
	//*   8   15:aload_0         
	//*   9   16:getfield        #77  <Field int mState>
	//*  10   19:iconst_1        
	//*  11   20:icmpne          30
	//*  12   23:iload           4
	//*  13   25:ifne            30
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		if(mViewDragHelper != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//*  18   34:ifnull          45
			mViewDragHelper.processTouchEvent(motionevent);
	//   19   37:aload_0         
	//   20   38:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//   21   41:aload_3         
	//   22   42:invokevirtual   #437 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		if(i == 0)
	//*  23   45:iload           4
	//*  24   47:ifne            54
			reset();
	//   25   50:aload_0         
	//   26   51:invokespecial   #265 <Method void reset()>
		if(mVelocityTracker == null)
	//*  27   54:aload_0         
	//*  28   55:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  29   58:ifnonnull       68
			mVelocityTracker = VelocityTracker.obtain();
	//   30   61:aload_0         
	//   31   62:invokestatic    #269 <Method VelocityTracker VelocityTracker.obtain()>
	//   32   65:putfield        #181 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   33   68:aload_0         
	//   34   69:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   35   72:aload_3         
	//   36   73:invokevirtual   #273 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i == 2 && !mIgnoreEvents && Math.abs((float)mInitialY - motionevent.getY()) > (float)mViewDragHelper.getTouchSlop())
	//*  37   76:iload           4
	//*  38   78:iconst_2        
	//*  39   79:icmpne          130
	//*  40   82:aload_0         
	//*  41   83:getfield        #258 <Field boolean mIgnoreEvents>
	//*  42   86:ifne            130
	//*  43   89:aload_0         
	//*  44   90:getfield        #281 <Field int mInitialY>
	//*  45   93:i2f             
	//*  46   94:aload_3         
	//*  47   95:invokevirtual   #279 <Method float MotionEvent.getY()>
	//*  48   98:fsub            
	//*  49   99:invokestatic    #312 <Method float Math.abs(float)>
	//*  50  102:aload_0         
	//*  51  103:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//*  52  106:invokevirtual   #315 <Method int ViewDragHelper.getTouchSlop()>
	//*  53  109:i2f             
	//*  54  110:fcmpl           
	//*  55  111:ifle            130
			mViewDragHelper.captureChildView(view, motionevent.getPointerId(motionevent.getActionIndex()));
	//   56  114:aload_0         
	//   57  115:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//   58  118:aload_2         
	//   59  119:aload_3         
	//   60  120:aload_3         
	//   61  121:invokevirtual   #292 <Method int MotionEvent.getActionIndex()>
	//   62  124:invokevirtual   #296 <Method int MotionEvent.getPointerId(int)>
	//   63  127:invokevirtual   #440 <Method void ViewDragHelper.captureChildView(View, int)>
		return mIgnoreEvents ^ true;
	//   64  130:aload_0         
	//   65  131:getfield        #258 <Field boolean mIgnoreEvents>
	//   66  134:iconst_1        
	//   67  135:ixor            
	//   68  136:ireturn         
	}

	public void setBottomSheetCallback(BottomSheetCallback bottomsheetcallback)
	{
		mCallback = bottomsheetcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//    3    5:return          
	}

	public void setHideable(boolean flag)
	{
		mHideable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #251 <Field boolean mHideable>
	//    3    5:return          
	}

	public final void setPeekHeight(int i)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
				if(i == -1)
	//*   2    2:iload_1         
	//*   3    3:iconst_m1       
	//*   4    4:icmpne          24
				{
					if(!mPeekHeightAuto)
	//*   5    7:aload_0         
	//*   6    8:getfield        #238 <Field boolean mPeekHeightAuto>
	//*   7   11:ifne            42
					{
						mPeekHeightAuto = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #238 <Field boolean mPeekHeightAuto>
						i = ((int) (flag));
	//   11   19:iload_2         
	//   12   20:istore_1        
						break label0;
	//   13   21:goto            73
					}
				} else
				if(mPeekHeightAuto || mPeekHeight != i)
	//*  14   24:aload_0         
	//*  15   25:getfield        #238 <Field boolean mPeekHeightAuto>
	//*  16   28:ifne            47
	//*  17   31:aload_0         
	//*  18   32:getfield        #240 <Field int mPeekHeight>
	//*  19   35:iload_1         
	//*  20   36:icmpeq          42
					break label1;
	//   21   39:goto            47
				i = 0;
	//   22   42:iconst_0        
	//   23   43:istore_1        
				break label0;
	//   24   44:goto            73
			}
			mPeekHeightAuto = false;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #238 <Field boolean mPeekHeightAuto>
			mPeekHeight = Math.max(0, i);
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:iload_1         
	//   31   55:invokestatic    #353 <Method int Math.max(int, int)>
	//   32   58:putfield        #240 <Field int mPeekHeight>
			mMaxOffset = mParentHeight - i;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #208 <Field int mParentHeight>
	//   36   66:iload_1         
	//   37   67:isub            
	//   38   68:putfield        #206 <Field int mMaxOffset>
			i = ((int) (flag));
	//   39   71:iload_2         
	//   40   72:istore_1        
		}
		if(i != 0 && mState == 4 && mViewRef != null)
	//*  41   73:iload_1         
	//*  42   74:ifeq            111
	//*  43   77:aload_0         
	//*  44   78:getfield        #77  <Field int mState>
	//*  45   81:iconst_4        
	//*  46   82:icmpne          111
	//*  47   85:aload_0         
	//*  48   86:getfield        #197 <Field WeakReference mViewRef>
	//*  49   89:ifnull          111
		{
			View view = (View)mViewRef.get();
	//   50   92:aload_0         
	//   51   93:getfield        #197 <Field WeakReference mViewRef>
	//   52   96:invokevirtual   #202 <Method Object WeakReference.get()>
	//   53   99:checkcast       #156 <Class View>
	//   54  102:astore_3        
			if(view != null)
	//*  55  103:aload_3         
	//*  56  104:ifnull          111
				view.requestLayout();
	//   57  107:aload_3         
	//   58  108:invokevirtual   #445 <Method void View.requestLayout()>
		}
	//   59  111:return          
	}

	public void setSkipCollapsed(boolean flag)
	{
		mSkipCollapsed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #247 <Field boolean mSkipCollapsed>
	//    3    5:return          
	}

	public final void setState(final int state)
	{
		if(state == mState)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #77  <Field int mState>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		if(mViewRef == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #197 <Field WeakReference mViewRef>
	//*   7   13:ifnonnull       44
		{
			if(state == 4 || state == 3 || mHideable && state == 5)
	//*   8   16:iload_1         
	//*   9   17:iconst_4        
	//*  10   18:icmpeq          38
	//*  11   21:iload_1         
	//*  12   22:iconst_3        
	//*  13   23:icmpeq          38
	//*  14   26:aload_0         
	//*  15   27:getfield        #251 <Field boolean mHideable>
	//*  16   30:ifeq            43
	//*  17   33:iload_1         
	//*  18   34:iconst_5        
	//*  19   35:icmpne          43
				mState = state;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:putfield        #77  <Field int mState>
			return;
	//   23   43:return          
		}
		final View child = (View)mViewRef.get();
	//   24   44:aload_0         
	//   25   45:getfield        #197 <Field WeakReference mViewRef>
	//   26   48:invokevirtual   #202 <Method Object WeakReference.get()>
	//   27   51:checkcast       #156 <Class View>
	//   28   54:astore_2        
		if(child == null)
	//*  29   55:aload_2         
	//*  30   56:ifnonnull       60
			return;
	//   31   59:return          
		ViewParent viewparent = child.getParent();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #450 <Method ViewParent View.getParent()>
	//   34   64:astore_3        
		if(viewparent != null && viewparent.isLayoutRequested() && ViewCompat.isAttachedToWindow(child))
	//*  35   65:aload_3         
	//*  36   66:ifnull          101
	//*  37   69:aload_3         
	//*  38   70:invokeinterface #455 <Method boolean ViewParent.isLayoutRequested()>
	//*  39   75:ifeq            101
	//*  40   78:aload_2         
	//*  41   79:invokestatic    #458 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  42   82:ifeq            101
		{
			child.post(new Runnable() {

				public void run()
				{
					startSettlingAnimation(child, state);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field BottomSheetBehavior this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field View val$child>
				//    4    8:aload_0         
				//    5    9:getfield        #25  <Field int val$state>
				//    6   12:invokevirtual   #34  <Method void BottomSheetBehavior.startSettlingAnimation(View, int)>
				//    7   15:return          
				}

				final BottomSheetBehavior this$0;
				final View val$child;
				final int val$state;

			
			{
				this$0 = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BottomSheetBehavior this$0>
				child = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field View val$child>
				state = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$state>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   43   85:aload_2         
	//   44   86:new             #7   <Class BottomSheetBehavior$1>
	//   45   89:dup             
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:iload_1         
	//   49   93:invokespecial   #459 <Method void BottomSheetBehavior$1(BottomSheetBehavior, View, int)>
	//   50   96:invokevirtual   #463 <Method boolean View.post(Runnable)>
	//   51   99:pop             
			return;
	//   52  100:return          
		} else
		{
			startSettlingAnimation(child, state);
	//   53  101:aload_0         
	//   54  102:aload_2         
	//   55  103:iload_1         
	//   56  104:invokevirtual   #466 <Method void startSettlingAnimation(View, int)>
			return;
	//   57  107:return          
		}
	}

	void setStateInternal(int i)
	{
		if(mState == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int mState>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mState = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #77  <Field int mState>
		View view = (View)mViewRef.get();
	//    8   14:aload_0         
	//    9   15:getfield        #197 <Field WeakReference mViewRef>
	//   10   18:invokevirtual   #202 <Method Object WeakReference.get()>
	//   11   21:checkcast       #156 <Class View>
	//   12   24:astore_2        
		if(view != null && mCallback != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          45
	//*  15   29:aload_0         
	//*  16   30:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//*  17   33:ifnull          45
			mCallback.onStateChanged(view, i);
	//   18   36:aload_0         
	//   19   37:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//   20   40:aload_2         
	//   21   41:iload_1         
	//   22   42:invokevirtual   #469 <Method void BottomSheetBehavior$BottomSheetCallback.onStateChanged(View, int)>
	//   23   45:return          
	}

	boolean shouldHide(View view, float f)
	{
		if(mSkipCollapsed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field boolean mSkipCollapsed>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(view.getTop() < mMaxOffset)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #328 <Method int View.getTop()>
	//*   7   13:aload_0         
	//*   8   14:getfield        #206 <Field int mMaxOffset>
	//*   9   17:icmpge          22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		return Math.abs(((float)view.getTop() + f * 0.1F) - (float)mMaxOffset) / (float)mPeekHeight > 0.5F;
	//   12   22:aload_1         
	//   13   23:invokevirtual   #328 <Method int View.getTop()>
	//   14   26:i2f             
	//   15   27:fload_2         
	//   16   28:ldc1            #26  <Float 0.1F>
	//   17   30:fmul            
	//   18   31:fadd            
	//   19   32:aload_0         
	//   20   33:getfield        #206 <Field int mMaxOffset>
	//   21   36:i2f             
	//   22   37:fsub            
	//   23   38:invokestatic    #312 <Method float Math.abs(float)>
	//   24   41:aload_0         
	//   25   42:getfield        #240 <Field int mPeekHeight>
	//   26   45:i2f             
	//   27   46:fdiv            
	//   28   47:ldc1            #28  <Float 0.5F>
	//   29   49:fcmpl           
	//   30   50:ifle            55
	//   31   53:iconst_1        
	//   32   54:ireturn         
	//   33   55:iconst_0        
	//   34   56:ireturn         
	}

	void startSettlingAnimation(View view, int i)
	{
label0:
		{
			int j;
			if(i == 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          13
				j = mMaxOffset;
	//    3    5:aload_0         
	//    4    6:getfield        #206 <Field int mMaxOffset>
	//    5    9:istore_3        
			else
	//*   6   10:goto            43
			if(i == 3)
	//*   7   13:iload_2         
	//*   8   14:iconst_3        
	//*   9   15:icmpne          26
			{
				j = mMinOffset;
	//   10   18:aload_0         
	//   11   19:getfield        #214 <Field int mMinOffset>
	//   12   22:istore_3        
			} else
	//*  13   23:goto            43
			{
				if(!mHideable || i != 5)
					break label0;
	//   14   26:aload_0         
	//   15   27:getfield        #251 <Field boolean mHideable>
	//   16   30:ifeq            85
	//   17   33:iload_2         
	//   18   34:iconst_5        
	//   19   35:icmpne          85
				j = mParentHeight;
	//   20   38:aload_0         
	//   21   39:getfield        #208 <Field int mParentHeight>
	//   22   42:istore_3        
			}
			if(mViewDragHelper.smoothSlideViewTo(view, view.getLeft(), j))
	//*  23   43:aload_0         
	//*  24   44:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//*  25   47:aload_1         
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #422 <Method int View.getLeft()>
	//*  28   52:iload_3         
	//*  29   53:invokevirtual   #425 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  30   56:ifeq            79
			{
				setStateInternal(2);
	//   31   59:aload_0         
	//   32   60:iconst_2        
	//   33   61:invokevirtual   #375 <Method void setStateInternal(int)>
				ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, i))));
	//   34   64:aload_1         
	//   35   65:new             #19  <Class BottomSheetBehavior$SettleRunnable>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:iload_2         
	//   40   72:invokespecial   #428 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//   41   75:invokestatic    #432 <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
	//   42   78:return          
			} else
			{
				setStateInternal(i);
	//   43   79:aload_0         
	//   44   80:iload_2         
	//   45   81:invokevirtual   #375 <Method void setStateInternal(int)>
				return;
	//   46   84:return          
			}
		}
		view = ((View) (new StringBuilder()));
	//   47   85:new             #471 <Class StringBuilder>
	//   48   88:dup             
	//   49   89:invokespecial   #472 <Method void StringBuilder()>
	//   50   92:astore_1        
		((StringBuilder) (view)).append("Illegal state argument: ");
	//   51   93:aload_1         
	//   52   94:ldc2            #474 <String "Illegal state argument: ">
	//   53   97:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   54  100:pop             
		((StringBuilder) (view)).append(i);
	//   55  101:aload_1         
	//   56  102:iload_2         
	//   57  103:invokevirtual   #481 <Method StringBuilder StringBuilder.append(int)>
	//   58  106:pop             
		throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   59  107:new             #164 <Class IllegalArgumentException>
	//   60  110:dup             
	//   61  111:aload_1         
	//   62  112:invokevirtual   #485 <Method String StringBuilder.toString()>
	//   63  115:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   64  118:athrow          
	}

	private static final float HIDE_FRICTION = 0.1F;
	private static final float HIDE_THRESHOLD = 0.5F;
	public static final int PEEK_HEIGHT_AUTO = -1;
	public static final int STATE_COLLAPSED = 4;
	public static final int STATE_DRAGGING = 1;
	public static final int STATE_EXPANDED = 3;
	public static final int STATE_HIDDEN = 5;
	public static final int STATE_SETTLING = 2;
	int mActivePointerId;
	private BottomSheetCallback mCallback;
	private final android.support.v4.widget.ViewDragHelper.Callback mDragCallback;
	boolean mHideable;
	private boolean mIgnoreEvents;
	private int mInitialY;
	private int mLastNestedScrollDy;
	int mMaxOffset;
	private float mMaximumVelocity;
	int mMinOffset;
	private boolean mNestedScrolled;
	WeakReference mNestedScrollingChildRef;
	int mParentHeight;
	private int mPeekHeight;
	private boolean mPeekHeightAuto;
	private int mPeekHeightMin;
	private boolean mSkipCollapsed;
	int mState;
	boolean mTouchingScrollingChild;
	private VelocityTracker mVelocityTracker;
	ViewDragHelper mViewDragHelper;
	WeakReference mViewRef;
}
