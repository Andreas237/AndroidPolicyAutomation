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
			//*   7   16:ifeq            35
					j = mParentHeight;
			//    8   19:aload_0         
			//    9   20:getfield        #12  <Field BottomSheetBehavior this$0>
			//   10   23:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//   11   26:istore_3        
				else
			//*  12   27:iload_2         
			//*  13   28:iload           4
			//*  14   30:iload_3         
			//*  15   31:invokestatic    #42  <Method int MathUtils.clamp(int, int, int)>
			//*  16   34:ireturn         
					j = mMaxOffset;
			//   17   35:aload_0         
			//   18   36:getfield        #12  <Field BottomSheetBehavior this$0>
			//   19   39:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
			//   20   42:istore_3        
				return MathUtils.clamp(i, k, j);
			//*  21   43:goto            27
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
			//   14   30:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
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
				int i;
				int j;
				if(f1 < 0.0F)
			//*   0    0:fload_3         
			//*   1    1:fconst_0        
			//*   2    2:fcmpg           
			//*   3    3:ifge            64
				{
					j = mMinOffset;
			//    4    6:aload_0         
			//    5    7:getfield        #12  <Field BottomSheetBehavior this$0>
			//    6   10:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//    7   13:istore          5
					i = 3;
			//    8   15:iconst_3        
			//    9   16:istore          4
				} else
			//*  10   18:aload_0         
			//*  11   19:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  12   22:getfield        #63  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
			//*  13   25:aload_1         
			//*  14   26:invokevirtual   #24  <Method int View.getLeft()>
			//*  15   29:iload           5
			//*  16   31:invokevirtual   #69  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
			//*  17   34:ifeq            187
			//*  18   37:aload_0         
			//*  19   38:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  20   41:iconst_2        
			//*  21   42:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			//*  22   45:aload_1         
			//*  23   46:new             #71  <Class BottomSheetBehavior$SettleRunnable>
			//*  24   49:dup             
			//*  25   50:aload_0         
			//*  26   51:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  27   54:aload_1         
			//*  28   55:iload           4
			//*  29   57:invokespecial   #74  <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
			//*  30   60:invokestatic    #80  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			//*  31   63:return          
				if(mHideable && shouldHide(view, f1))
			//*  32   64:aload_0         
			//*  33   65:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  34   68:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
			//*  35   71:ifeq            101
			//*  36   74:aload_0         
			//*  37   75:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  38   78:aload_1         
			//*  39   79:fload_3         
			//*  40   80:invokevirtual   #84  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
			//*  41   83:ifeq            101
				{
					j = mParentHeight;
			//   42   86:aload_0         
			//   43   87:getfield        #12  <Field BottomSheetBehavior this$0>
			//   44   90:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//   45   93:istore          5
					i = 5;
			//   46   95:iconst_5        
			//   47   96:istore          4
				} else
			//*  48   98:goto            18
				if(f1 == 0.0F)
			//*  49  101:fload_3         
			//*  50  102:fconst_0        
			//*  51  103:fcmpl           
			//*  52  104:ifne            172
				{
					i = view.getTop();
			//   53  107:aload_1         
			//   54  108:invokevirtual   #87  <Method int View.getTop()>
			//   55  111:istore          4
					if(Math.abs(i - mMinOffset) < Math.abs(i - mMaxOffset))
			//*  56  113:iload           4
			//*  57  115:aload_0         
			//*  58  116:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  59  119:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//*  60  122:isub            
			//*  61  123:invokestatic    #93  <Method int Math.abs(int)>
			//*  62  126:iload           4
			//*  63  128:aload_0         
			//*  64  129:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  65  132:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
			//*  66  135:isub            
			//*  67  136:invokestatic    #93  <Method int Math.abs(int)>
			//*  68  139:icmpge          157
					{
						j = mMinOffset;
			//   69  142:aload_0         
			//   70  143:getfield        #12  <Field BottomSheetBehavior this$0>
			//   71  146:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//   72  149:istore          5
						i = 3;
			//   73  151:iconst_3        
			//   74  152:istore          4
					} else
			//*  75  154:goto            18
					{
						j = mMaxOffset;
			//   76  157:aload_0         
			//   77  158:getfield        #12  <Field BottomSheetBehavior this$0>
			//   78  161:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
			//   79  164:istore          5
						i = 4;
			//   80  166:iconst_4        
			//   81  167:istore          4
					}
				} else
			//*  82  169:goto            18
				{
					j = mMaxOffset;
			//   83  172:aload_0         
			//   84  173:getfield        #12  <Field BottomSheetBehavior this$0>
			//   85  176:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
			//   86  179:istore          5
					i = 4;
			//   87  181:iconst_4        
			//   88  182:istore          4
				}
				if(mViewDragHelper.settleCapturedViewAt(view.getLeft(), j))
				{
					setStateInternal(2);
					ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, i))));
					return;
				} else
			//*  89  184:goto            18
				{
					setStateInternal(i);
			//   90  187:aload_0         
			//   91  188:getfield        #12  <Field BottomSheetBehavior this$0>
			//   92  191:iload           4
			//   93  193:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
					return;
			//   94  196:return          
				}
			}

			public boolean tryCaptureView(View view, int i)
			{
				boolean flag;
				flag = true;
			//    0    0:iconst_1        
			//    1    1:istore_3        
				break MISSING_BLOCK_LABEL_2;
				View view1;
				for(; view1 != null && view1.canScrollVertically(-1); view1 = (View)mNestedScrollingChildRef.get())
				{
					do
			//*   2    2:aload_0         
			//*   3    3:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   4    6:getfield        #98  <Field int BottomSheetBehavior.mState>
			//*   5    9:iconst_1        
			//*   6   10:icmpne          15
						return false;
			//    7   13:iconst_0        
			//    8   14:ireturn         
					while(mState == 1 || mTouchingScrollingChild);
			//    9   15:aload_0         
			//   10   16:getfield        #12  <Field BottomSheetBehavior this$0>
			//   11   19:getfield        #101 <Field boolean BottomSheetBehavior.mTouchingScrollingChild>
			//   12   22:ifne            13
					if(mState != 3 || mActivePointerId != i)
						break;
			//   13   25:aload_0         
			//   14   26:getfield        #12  <Field BottomSheetBehavior this$0>
			//   15   29:getfield        #98  <Field int BottomSheetBehavior.mState>
			//   16   32:iconst_3        
			//   17   33:icmpne          76
			//   18   36:aload_0         
			//   19   37:getfield        #12  <Field BottomSheetBehavior this$0>
			//   20   40:getfield        #104 <Field int BottomSheetBehavior.mActivePointerId>
			//   21   43:iload_2         
			//   22   44:icmpne          76
				}

			//   23   47:aload_0         
			//   24   48:getfield        #12  <Field BottomSheetBehavior this$0>
			//   25   51:getfield        #108 <Field WeakReference BottomSheetBehavior.mNestedScrollingChildRef>
			//   26   54:invokevirtual   #114 <Method Object WeakReference.get()>
			//   27   57:checkcast       #20  <Class View>
			//   28   60:astore          4
			//   29   62:aload           4
			//   30   64:ifnull          76
			//   31   67:aload           4
			//   32   69:iconst_m1       
			//   33   70:invokevirtual   #118 <Method boolean View.canScrollVertically(int)>
			//   34   73:ifne            13
				if(mViewRef == null || mViewRef.get() != view)
			//*  35   76:aload_0         
			//*  36   77:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  37   80:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
			//*  38   83:ifnull          102
			//*  39   86:aload_0         
			//*  40   87:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  41   90:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
			//*  42   93:invokevirtual   #114 <Method Object WeakReference.get()>
			//*  43   96:aload_1         
			//*  44   97:if_acmpne       102
			//*  45  100:iload_3         
			//*  46  101:ireturn         
					flag = false;
			//   47  102:iconst_0        
			//   48  103:istore_3        
				return flag;
			//*  49  104:goto            100
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
	//*  23   41:ifnull          101
	//*  24   44:aload_3         
	//*  25   45:getfield        #112 <Field int TypedValue.data>
	//*  26   48:iconst_m1       
	//*  27   49:icmpne          101
			setPeekHeight(typedvalue.data);
	//   28   52:aload_0         
	//   29   53:aload_3         
	//   30   54:getfield        #112 <Field int TypedValue.data>
	//   31   57:invokevirtual   #116 <Method void setPeekHeight(int)>
		else
	//*  32   60:aload_0         
	//*  33   61:aload_2         
	//*  34   62:getstatic       #119 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_hideable>
	//*  35   65:iconst_0        
	//*  36   66:invokevirtual   #123 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  37   69:invokevirtual   #127 <Method void setHideable(boolean)>
	//*  38   72:aload_0         
	//*  39   73:aload_2         
	//*  40   74:getstatic       #130 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed>
	//*  41   77:iconst_0        
	//*  42   78:invokevirtual   #123 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  43   81:invokevirtual   #133 <Method void setSkipCollapsed(boolean)>
	//*  44   84:aload_2         
	//*  45   85:invokevirtual   #136 <Method void TypedArray.recycle()>
	//*  46   88:aload_0         
	//*  47   89:aload_1         
	//*  48   90:invokestatic    #142 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  49   93:invokevirtual   #146 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//*  50   96:i2f             
	//*  51   97:putfield        #148 <Field float mMaximumVelocity>
	//*  52  100:return          
			setPeekHeight(((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
	//   53  101:aload_0         
	//   54  102:aload_2         
	//   55  103:getstatic       #101 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   56  106:iconst_m1       
	//   57  107:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   58  110:invokevirtual   #116 <Method void setPeekHeight(int)>
		setHideable(((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
		setSkipCollapsed(((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
		((TypedArray) (attributeset)).recycle();
		mMaximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
	//*  59  113:goto            60
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
	//    4    8:getfield        #148 <Field float mMaximumVelocity>
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
		View view;
label0:
		{
			view = (View)mViewRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field WeakReference mViewRef>
	//    2    4:invokevirtual   #202 <Method Object WeakReference.get()>
	//    3    7:checkcast       #156 <Class View>
	//    4   10:astore_2        
			if(view != null && mCallback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          56
	//*   7   15:aload_0         
	//*   8   16:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//*   9   19:ifnull          56
			{
				if(i <= mMaxOffset)
					break label0;
	//   10   22:iload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #206 <Field int mMaxOffset>
	//   13   27:icmple          57
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
			}
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
		boolean flag2;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          7
		if(!view.isShown())
	//*   2    3:aload_2         
	//*   3    4:invokevirtual   #256 <Method boolean View.isShown()>
	//*   4    7:ifne            17
		{
			mIgnoreEvents = true;
	//    5   10:aload_0         
	//    6   11:iconst_1        
	//    7   12:putfield        #258 <Field boolean mIgnoreEvents>
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
		}
		i = motionevent.getActionMasked();
	//   10   17:aload_3         
	//   11   18:invokevirtual   #263 <Method int MotionEvent.getActionMasked()>
	//   12   21:istore          4
		if(i == 0)
	//*  13   23:iload           4
	//*  14   25:ifne            32
			reset();
	//   15   28:aload_0         
	//   16   29:invokespecial   #265 <Method void reset()>
		if(mVelocityTracker == null)
	//*  17   32:aload_0         
	//*  18   33:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  19   36:ifnonnull       46
			mVelocityTracker = VelocityTracker.obtain();
	//   20   39:aload_0         
	//   21   40:invokestatic    #269 <Method VelocityTracker VelocityTracker.obtain()>
	//   22   43:putfield        #181 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   23   46:aload_0         
	//   24   47:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   25   50:aload_3         
	//   26   51:invokevirtual   #273 <Method void VelocityTracker.addMovement(MotionEvent)>
		i;
	//   27   54:iload           4
		JVM INSTR tableswitch 0 3: default 88
	//	               0 132
	//	               1 108
	//	               2 88
	//	               3 108;
	//   28   56:tableswitch     0 3: default 88
	//	               0 132
	//	               1 108
	//	               2 88
	//	               3 108
		   goto _L1 _L2 _L3 _L1 _L3
_L1:
		if(!mIgnoreEvents && mViewDragHelper.shouldInterceptTouchEvent(motionevent))
	//*  29   88:aload_0         
	//*  30   89:getfield        #258 <Field boolean mIgnoreEvents>
	//*  31   92:ifne            250
	//*  32   95:aload_0         
	//*  33   96:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//*  34   99:aload_3         
	//*  35  100:invokevirtual   #281 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//*  36  103:ifeq            250
			return true;
	//   37  106:iconst_1        
	//   38  107:ireturn         
		break; /* Loop/switch isn't completed */
_L3:
		mTouchingScrollingChild = false;
	//   39  108:aload_0         
	//   40  109:iconst_0        
	//   41  110:putfield        #283 <Field boolean mTouchingScrollingChild>
		mActivePointerId = -1;
	//   42  113:aload_0         
	//   43  114:iconst_m1       
	//   44  115:putfield        #189 <Field int mActivePointerId>
		if(mIgnoreEvents)
	//*  45  118:aload_0         
	//*  46  119:getfield        #258 <Field boolean mIgnoreEvents>
	//*  47  122:ifeq            88
		{
			mIgnoreEvents = false;
	//   48  125:aload_0         
	//   49  126:iconst_0        
	//   50  127:putfield        #258 <Field boolean mIgnoreEvents>
			return false;
	//   51  130:iconst_0        
	//   52  131:ireturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		int j = (int)motionevent.getX();
	//   53  132:aload_3         
	//   54  133:invokevirtual   #286 <Method float MotionEvent.getX()>
	//   55  136:f2i             
	//   56  137:istore          5
		mInitialY = (int)motionevent.getY();
	//   57  139:aload_0         
	//   58  140:aload_3         
	//   59  141:invokevirtual   #289 <Method float MotionEvent.getY()>
	//   60  144:f2i             
	//   61  145:putfield        #291 <Field int mInitialY>
		boolean flag;
		View view1;
		if(mNestedScrollingChildRef != null)
	//*  62  148:aload_0         
	//*  63  149:getfield        #293 <Field WeakReference mNestedScrollingChildRef>
	//*  64  152:ifnull          238
			view1 = (View)mNestedScrollingChildRef.get();
	//   65  155:aload_0         
	//   66  156:getfield        #293 <Field WeakReference mNestedScrollingChildRef>
	//   67  159:invokevirtual   #202 <Method Object WeakReference.get()>
	//   68  162:checkcast       #156 <Class View>
	//   69  165:astore          8
		else
	//*  70  167:aload           8
	//*  71  169:ifnull          204
	//*  72  172:aload_1         
	//*  73  173:aload           8
	//*  74  175:iload           5
	//*  75  177:aload_0         
	//*  76  178:getfield        #291 <Field int mInitialY>
	//*  77  181:invokevirtual   #299 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  78  184:ifeq            204
	//*  79  187:aload_0         
	//*  80  188:aload_3         
	//*  81  189:aload_3         
	//*  82  190:invokevirtual   #302 <Method int MotionEvent.getActionIndex()>
	//*  83  193:invokevirtual   #306 <Method int MotionEvent.getPointerId(int)>
	//*  84  196:putfield        #189 <Field int mActivePointerId>
	//*  85  199:aload_0         
	//*  86  200:iconst_1        
	//*  87  201:putfield        #283 <Field boolean mTouchingScrollingChild>
	//*  88  204:aload_0         
	//*  89  205:getfield        #189 <Field int mActivePointerId>
	//*  90  208:iconst_m1       
	//*  91  209:icmpne          244
	//*  92  212:aload_1         
	//*  93  213:aload_2         
	//*  94  214:iload           5
	//*  95  216:aload_0         
	//*  96  217:getfield        #291 <Field int mInitialY>
	//*  97  220:invokevirtual   #299 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  98  223:ifne            244
	//*  99  226:iconst_1        
	//* 100  227:istore          6
	//* 101  229:aload_0         
	//* 102  230:iload           6
	//* 103  232:putfield        #258 <Field boolean mIgnoreEvents>
	//* 104  235:goto            88
			view1 = null;
	//  105  238:aconst_null     
	//  106  239:astore          8
		if(view1 != null && coordinatorlayout.isPointInChildBounds(view1, j, mInitialY))
		{
			mActivePointerId = motionevent.getPointerId(motionevent.getActionIndex());
			mTouchingScrollingChild = true;
		}
		if(mActivePointerId == -1 && !coordinatorlayout.isPointInChildBounds(view, j, mInitialY))
			flag = true;
		else
	//* 107  241:goto            167
			flag = false;
	//  108  244:iconst_0        
	//  109  245:istore          6
		mIgnoreEvents = flag;
		if(true) goto _L1; else goto _L4
	//  110  247:goto            229
_L4:
		view = (View)mNestedScrollingChildRef.get();
	//  111  250:aload_0         
	//  112  251:getfield        #293 <Field WeakReference mNestedScrollingChildRef>
	//  113  254:invokevirtual   #202 <Method Object WeakReference.get()>
	//  114  257:checkcast       #156 <Class View>
	//  115  260:astore_2        
		boolean flag1;
		if(i == 2 && view != null && !mIgnoreEvents && mState != 1 && !coordinatorlayout.isPointInChildBounds(view, (int)motionevent.getX(), (int)motionevent.getY()) && Math.abs((float)mInitialY - motionevent.getY()) > (float)mViewDragHelper.getTouchSlop())
	//* 116  261:iload           4
	//* 117  263:iconst_2        
	//* 118  264:icmpne          336
	//* 119  267:aload_2         
	//* 120  268:ifnull          336
	//* 121  271:aload_0         
	//* 122  272:getfield        #258 <Field boolean mIgnoreEvents>
	//* 123  275:ifne            336
	//* 124  278:aload_0         
	//* 125  279:getfield        #77  <Field int mState>
	//* 126  282:iconst_1        
	//* 127  283:icmpeq          336
	//* 128  286:aload_1         
	//* 129  287:aload_2         
	//* 130  288:aload_3         
	//* 131  289:invokevirtual   #286 <Method float MotionEvent.getX()>
	//* 132  292:f2i             
	//* 133  293:aload_3         
	//* 134  294:invokevirtual   #289 <Method float MotionEvent.getY()>
	//* 135  297:f2i             
	//* 136  298:invokevirtual   #299 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//* 137  301:ifne            336
	//* 138  304:aload_0         
	//* 139  305:getfield        #291 <Field int mInitialY>
	//* 140  308:i2f             
	//* 141  309:aload_3         
	//* 142  310:invokevirtual   #289 <Method float MotionEvent.getY()>
	//* 143  313:fsub            
	//* 144  314:invokestatic    #312 <Method float Math.abs(float)>
	//* 145  317:aload_0         
	//* 146  318:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//* 147  321:invokevirtual   #315 <Method int ViewDragHelper.getTouchSlop()>
	//* 148  324:i2f             
	//* 149  325:fcmpl           
	//* 150  326:ifle            336
			flag1 = flag2;
	//  151  329:iload           7
	//  152  331:istore          6
		else
	//* 153  333:iload           6
	//* 154  335:ireturn         
			flag1 = false;
	//  155  336:iconst_0        
	//  156  337:istore          6
		return flag1;
	//* 157  339:goto            333
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		int j;
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
		j = view.getTop();
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
	//*  22   43:ifeq            189
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
	//*  45   90:aload_0         
	//*  46   91:iconst_0        
	//*  47   92:aload_0         
	//*  48   93:getfield        #208 <Field int mParentHeight>
	//*  49   96:aload_2         
	//*  50   97:invokevirtual   #354 <Method int View.getHeight()>
	//*  51  100:isub            
	//*  52  101:invokestatic    #353 <Method int Math.max(int, int)>
	//*  53  104:putfield        #214 <Field int mMinOffset>
	//*  54  107:aload_0         
	//*  55  108:aload_0         
	//*  56  109:getfield        #208 <Field int mParentHeight>
	//*  57  112:iload_3         
	//*  58  113:isub            
	//*  59  114:aload_0         
	//*  60  115:getfield        #214 <Field int mMinOffset>
	//*  61  118:invokestatic    #353 <Method int Math.max(int, int)>
	//*  62  121:putfield        #206 <Field int mMaxOffset>
	//*  63  124:aload_0         
	//*  64  125:getfield        #77  <Field int mState>
	//*  65  128:iconst_3        
	//*  66  129:icmpne          197
	//*  67  132:aload_2         
	//*  68  133:aload_0         
	//*  69  134:getfield        #214 <Field int mMinOffset>
	//*  70  137:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
	//*  71  140:aload_0         
	//*  72  141:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//*  73  144:ifnonnull       159
	//*  74  147:aload_0         
	//*  75  148:aload_1         
	//*  76  149:aload_0         
	//*  77  150:getfield        #82  <Field android.support.v4.widget.ViewDragHelper$Callback mDragCallback>
	//*  78  153:invokestatic    #361 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, android.support.v4.widget.ViewDragHelper$Callback)>
	//*  79  156:putfield        #275 <Field ViewDragHelper mViewDragHelper>
	//*  80  159:aload_0         
	//*  81  160:new             #199 <Class WeakReference>
	//*  82  163:dup             
	//*  83  164:aload_2         
	//*  84  165:invokespecial   #364 <Method void WeakReference(Object)>
	//*  85  168:putfield        #197 <Field WeakReference mViewRef>
	//*  86  171:aload_0         
	//*  87  172:new             #199 <Class WeakReference>
	//*  88  175:dup             
	//*  89  176:aload_0         
	//*  90  177:aload_2         
	//*  91  178:invokevirtual   #234 <Method View findScrollingChild(View)>
	//*  92  181:invokespecial   #364 <Method void WeakReference(Object)>
	//*  93  184:putfield        #293 <Field WeakReference mNestedScrollingChildRef>
	//*  94  187:iconst_1        
	//*  95  188:ireturn         
		{
			i = mPeekHeight;
	//   96  189:aload_0         
	//   97  190:getfield        #240 <Field int mPeekHeight>
	//   98  193:istore_3        
		}
		mMinOffset = Math.max(0, mParentHeight - view.getHeight());
		mMaxOffset = Math.max(mParentHeight - i, mMinOffset);
		if(mState != 3) goto _L2; else goto _L1
_L1:
		ViewCompat.offsetTopAndBottom(view, mMinOffset);
_L4:
		if(mViewDragHelper == null)
			mViewDragHelper = ViewDragHelper.create(((ViewGroup) (coordinatorlayout)), mDragCallback);
		mViewRef = new WeakReference(((Object) (view)));
		mNestedScrollingChildRef = new WeakReference(((Object) (findScrollingChild(view))));
		return true;
	//*  99  194:goto            90
_L2:
		if(mHideable && mState == 5)
	//* 100  197:aload_0         
	//* 101  198:getfield        #251 <Field boolean mHideable>
	//* 102  201:ifeq            223
	//* 103  204:aload_0         
	//* 104  205:getfield        #77  <Field int mState>
	//* 105  208:iconst_5        
	//* 106  209:icmpne          223
			ViewCompat.offsetTopAndBottom(view, mParentHeight);
	//  107  212:aload_2         
	//  108  213:aload_0         
	//  109  214:getfield        #208 <Field int mParentHeight>
	//  110  217:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//* 111  220:goto            140
		if(mState == 4)
	//* 112  223:aload_0         
	//* 113  224:getfield        #77  <Field int mState>
	//* 114  227:iconst_4        
	//* 115  228:icmpne          242
			ViewCompat.offsetTopAndBottom(view, mMaxOffset);
	//  116  231:aload_2         
	//  117  232:aload_0         
	//  118  233:getfield        #206 <Field int mMaxOffset>
	//  119  236:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//* 120  239:goto            140
		if(mState == 1 || mState == 2)
	//* 121  242:aload_0         
	//* 122  243:getfield        #77  <Field int mState>
	//* 123  246:iconst_1        
	//* 124  247:icmpeq          258
	//* 125  250:aload_0         
	//* 126  251:getfield        #77  <Field int mState>
	//* 127  254:iconst_2        
	//* 128  255:icmpne          140
			ViewCompat.offsetTopAndBottom(view, j - view.getTop());
	//  129  258:aload_2         
	//  130  259:iload           4
	//  131  261:aload_2         
	//  132  262:invokevirtual   #328 <Method int View.getTop()>
	//  133  265:isub            
	//  134  266:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		if(true) goto _L4; else goto _L3
	//  135  269:goto            140
_L3:
	}

	public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
	{
		return view1 == mNestedScrollingChildRef.get() && (mState != 3 || super.onNestedPreFling(coordinatorlayout, view, view1, f, f1));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #293 <Field WeakReference mNestedScrollingChildRef>
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
		int k;
		if(view1 != (View)mNestedScrollingChildRef.get())
	//*   0    0:aload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #293 <Field WeakReference mNestedScrollingChildRef>
	//*   3    5:invokevirtual   #202 <Method Object WeakReference.get()>
	//*   4    8:checkcast       #156 <Class View>
	//*   5   11:if_acmpeq       15
			return;
	//    6   14:return          
		i = view.getTop();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #328 <Method int View.getTop()>
	//    9   19:istore          4
		k = i - j;
	//   10   21:iload           4
	//   11   23:iload           5
	//   12   25:isub            
	//   13   26:istore          7
		if(j <= 0) goto _L2; else goto _L1
	//   14   28:iload           5
	//   15   30:ifle            108
_L1:
		if(k < mMinOffset)
	//*  16   33:iload           7
	//*  17   35:aload_0         
	//*  18   36:getfield        #214 <Field int mMinOffset>
	//*  19   39:icmpge          87
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
	//*  36   67:aload_0         
	//*  37   68:aload_2         
	//*  38   69:invokevirtual   #328 <Method int View.getTop()>
	//*  39   72:invokevirtual   #377 <Method void dispatchOnSlide(int)>
	//*  40   75:aload_0         
	//*  41   76:iload           5
	//*  42   78:putfield        #379 <Field int mLastNestedScrollDy>
	//*  43   81:aload_0         
	//*  44   82:iconst_1        
	//*  45   83:putfield        #381 <Field boolean mNestedScrolled>
	//*  46   86:return          
		{
			ai[1] = j;
	//   47   87:aload           6
	//   48   89:iconst_1        
	//   49   90:iload           5
	//   50   92:iastore         
			ViewCompat.offsetTopAndBottom(view, -j);
	//   51   93:aload_2         
	//   52   94:iload           5
	//   53   96:ineg            
	//   54   97:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			setStateInternal(1);
	//   55  100:aload_0         
	//   56  101:iconst_1        
	//   57  102:invokevirtual   #375 <Method void setStateInternal(int)>
		}
_L4:
		dispatchOnSlide(view.getTop());
		mLastNestedScrollDy = j;
		mNestedScrolled = true;
		return;
	//*  58  105:goto            67
_L2:
		if(j < 0 && !view1.canScrollVertically(-1))
	//*  59  108:iload           5
	//*  60  110:ifge            67
	//*  61  113:aload_3         
	//*  62  114:iconst_m1       
	//*  63  115:invokevirtual   #385 <Method boolean View.canScrollVertically(int)>
	//*  64  118:ifne            67
			if(k <= mMaxOffset || mHideable)
	//*  65  121:iload           7
	//*  66  123:aload_0         
	//*  67  124:getfield        #206 <Field int mMaxOffset>
	//*  68  127:icmple          137
	//*  69  130:aload_0         
	//*  70  131:getfield        #251 <Field boolean mHideable>
	//*  71  134:ifeq            158
			{
				ai[1] = j;
	//   72  137:aload           6
	//   73  139:iconst_1        
	//   74  140:iload           5
	//   75  142:iastore         
				ViewCompat.offsetTopAndBottom(view, -j);
	//   76  143:aload_2         
	//   77  144:iload           5
	//   78  146:ineg            
	//   79  147:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(1);
	//   80  150:aload_0         
	//   81  151:iconst_1        
	//   82  152:invokevirtual   #375 <Method void setStateInternal(int)>
			} else
	//*  83  155:goto            67
			{
				ai[1] = i - mMaxOffset;
	//   84  158:aload           6
	//   85  160:iconst_1        
	//   86  161:iload           4
	//   87  163:aload_0         
	//   88  164:getfield        #206 <Field int mMaxOffset>
	//   89  167:isub            
	//   90  168:iastore         
				ViewCompat.offsetTopAndBottom(view, -ai[1]);
	//   91  169:aload_2         
	//   92  170:aload           6
	//   93  172:iconst_1        
	//   94  173:iaload          
	//   95  174:ineg            
	//   96  175:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(4);
	//   97  178:aload_0         
	//   98  179:iconst_4        
	//   99  180:invokevirtual   #375 <Method void setStateInternal(int)>
			}
		if(true) goto _L4; else goto _L3
	//  100  183:goto            67
_L3:
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
		if(((SavedState) (parcelable)).state == 1 || ((SavedState) (parcelable)).state == 2)
	//*   9   15:aload_3         
	//*  10   16:getfield        #397 <Field int BottomSheetBehavior$SavedState.state>
	//*  11   19:iconst_1        
	//*  12   20:icmpeq          31
	//*  13   23:aload_3         
	//*  14   24:getfield        #397 <Field int BottomSheetBehavior$SavedState.state>
	//*  15   27:iconst_2        
	//*  16   28:icmpne          37
		{
			mState = 4;
	//   17   31:aload_0         
	//   18   32:iconst_4        
	//   19   33:putfield        #77  <Field int mState>
			return;
	//   20   36:return          
		} else
		{
			mState = ((SavedState) (parcelable)).state;
	//   21   37:aload_0         
	//   22   38:aload_3         
	//   23   39:getfield        #397 <Field int BottomSheetBehavior$SavedState.state>
	//   24   42:putfield        #77  <Field int mState>
			return;
	//   25   45:return          
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
	//    4    5:putfield        #379 <Field int mLastNestedScrollDy>
		mNestedScrolled = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #381 <Field boolean mNestedScrolled>
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
		if(view.getTop() == mMinOffset)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #328 <Method int View.getTop()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #214 <Field int mMinOffset>
	//*   4    8:icmpne          17
			setStateInternal(3);
	//    5   11:aload_0         
	//    6   12:iconst_3        
	//    7   13:invokevirtual   #375 <Method void setStateInternal(int)>
		else
	//*   8   16:return          
		if(mNestedScrollingChildRef != null && view1 == mNestedScrollingChildRef.get() && mNestedScrolled)
	//*   9   17:aload_0         
	//*  10   18:getfield        #293 <Field WeakReference mNestedScrollingChildRef>
	//*  11   21:ifnull          16
	//*  12   24:aload_3         
	//*  13   25:aload_0         
	//*  14   26:getfield        #293 <Field WeakReference mNestedScrollingChildRef>
	//*  15   29:invokevirtual   #202 <Method Object WeakReference.get()>
	//*  16   32:if_acmpne       16
	//*  17   35:aload_0         
	//*  18   36:getfield        #381 <Field boolean mNestedScrolled>
	//*  19   39:ifeq            16
		{
			int i;
			int j;
			if(mLastNestedScrollDy > 0)
	//*  20   42:aload_0         
	//*  21   43:getfield        #379 <Field int mLastNestedScrollDy>
	//*  22   46:ifle            101
			{
				j = mMinOffset;
	//   23   49:aload_0         
	//   24   50:getfield        #214 <Field int mMinOffset>
	//   25   53:istore          5
				i = 3;
	//   26   55:iconst_3        
	//   27   56:istore          4
			} else
	//*  28   58:aload_0         
	//*  29   59:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//*  30   62:aload_2         
	//*  31   63:aload_2         
	//*  32   64:invokevirtual   #414 <Method int View.getLeft()>
	//*  33   67:iload           5
	//*  34   69:invokevirtual   #417 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  35   72:ifeq            204
	//*  36   75:aload_0         
	//*  37   76:iconst_2        
	//*  38   77:invokevirtual   #375 <Method void setStateInternal(int)>
	//*  39   80:aload_2         
	//*  40   81:new             #19  <Class BottomSheetBehavior$SettleRunnable>
	//*  41   84:dup             
	//*  42   85:aload_0         
	//*  43   86:aload_2         
	//*  44   87:iload           4
	//*  45   89:invokespecial   #420 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//*  46   92:invokestatic    #424 <Method void ViewCompat.postOnAnimation(View, Runnable)>
	//*  47   95:aload_0         
	//*  48   96:iconst_0        
	//*  49   97:putfield        #381 <Field boolean mNestedScrolled>
	//*  50  100:return          
			if(mHideable && shouldHide(view, getYVelocity()))
	//*  51  101:aload_0         
	//*  52  102:getfield        #251 <Field boolean mHideable>
	//*  53  105:ifeq            132
	//*  54  108:aload_0         
	//*  55  109:aload_2         
	//*  56  110:aload_0         
	//*  57  111:invokespecial   #426 <Method float getYVelocity()>
	//*  58  114:invokevirtual   #430 <Method boolean shouldHide(View, float)>
	//*  59  117:ifeq            132
			{
				j = mParentHeight;
	//   60  120:aload_0         
	//   61  121:getfield        #208 <Field int mParentHeight>
	//   62  124:istore          5
				i = 5;
	//   63  126:iconst_5        
	//   64  127:istore          4
			} else
	//*  65  129:goto            58
			if(mLastNestedScrollDy == 0)
	//*  66  132:aload_0         
	//*  67  133:getfield        #379 <Field int mLastNestedScrollDy>
	//*  68  136:ifne            192
			{
				i = view.getTop();
	//   69  139:aload_2         
	//   70  140:invokevirtual   #328 <Method int View.getTop()>
	//   71  143:istore          4
				if(Math.abs(i - mMinOffset) < Math.abs(i - mMaxOffset))
	//*  72  145:iload           4
	//*  73  147:aload_0         
	//*  74  148:getfield        #214 <Field int mMinOffset>
	//*  75  151:isub            
	//*  76  152:invokestatic    #432 <Method int Math.abs(int)>
	//*  77  155:iload           4
	//*  78  157:aload_0         
	//*  79  158:getfield        #206 <Field int mMaxOffset>
	//*  80  161:isub            
	//*  81  162:invokestatic    #432 <Method int Math.abs(int)>
	//*  82  165:icmpge          180
				{
					j = mMinOffset;
	//   83  168:aload_0         
	//   84  169:getfield        #214 <Field int mMinOffset>
	//   85  172:istore          5
					i = 3;
	//   86  174:iconst_3        
	//   87  175:istore          4
				} else
	//*  88  177:goto            58
				{
					j = mMaxOffset;
	//   89  180:aload_0         
	//   90  181:getfield        #206 <Field int mMaxOffset>
	//   91  184:istore          5
					i = 4;
	//   92  186:iconst_4        
	//   93  187:istore          4
				}
			} else
	//*  94  189:goto            58
			{
				j = mMaxOffset;
	//   95  192:aload_0         
	//   96  193:getfield        #206 <Field int mMaxOffset>
	//   97  196:istore          5
				i = 4;
	//   98  198:iconst_4        
	//   99  199:istore          4
			}
			if(mViewDragHelper.smoothSlideViewTo(view, view.getLeft(), j))
			{
				setStateInternal(2);
				ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, i))));
			} else
	//* 100  201:goto            58
			{
				setStateInternal(i);
	//  101  204:aload_0         
	//  102  205:iload           4
	//  103  207:invokevirtual   #375 <Method void setStateInternal(int)>
			}
			mNestedScrolled = false;
			return;
		}
	//* 104  210:goto            95
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		if(view.isShown()) goto _L2; else goto _L1
	//    2    3:aload_2         
	//    3    4:invokevirtual   #256 <Method boolean View.isShown()>
	//    4    7:ifne            16
_L1:
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          5
_L4:
		return flag;
	//    7   13:iload           5
	//    8   15:ireturn         
_L2:
		int i;
		i = motionevent.getActionMasked();
	//    9   16:aload_3         
	//   10   17:invokevirtual   #263 <Method int MotionEvent.getActionMasked()>
	//   11   20:istore          4
		if(mState != 1)
			break; /* Loop/switch isn't completed */
	//   12   22:aload_0         
	//   13   23:getfield        #77  <Field int mState>
	//   14   26:iconst_1        
	//   15   27:icmpne          39
		flag = flag1;
	//   16   30:iload           6
	//   17   32:istore          5
		if(i == 0) goto _L4; else goto _L3
	//   18   34:iload           4
	//   19   36:ifeq            13
_L3:
		mViewDragHelper.processTouchEvent(motionevent);
	//   20   39:aload_0         
	//   21   40:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//   22   43:aload_3         
	//   23   44:invokevirtual   #437 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		if(i == 0)
	//*  24   47:iload           4
	//*  25   49:ifne            56
			reset();
	//   26   52:aload_0         
	//   27   53:invokespecial   #265 <Method void reset()>
		if(mVelocityTracker == null)
	//*  28   56:aload_0         
	//*  29   57:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  30   60:ifnonnull       70
			mVelocityTracker = VelocityTracker.obtain();
	//   31   63:aload_0         
	//   32   64:invokestatic    #269 <Method VelocityTracker VelocityTracker.obtain()>
	//   33   67:putfield        #181 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   34   70:aload_0         
	//   35   71:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   36   74:aload_3         
	//   37   75:invokevirtual   #273 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i == 2 && !mIgnoreEvents && Math.abs((float)mInitialY - motionevent.getY()) > (float)mViewDragHelper.getTouchSlop())
	//*  38   78:iload           4
	//*  39   80:iconst_2        
	//*  40   81:icmpne          132
	//*  41   84:aload_0         
	//*  42   85:getfield        #258 <Field boolean mIgnoreEvents>
	//*  43   88:ifne            132
	//*  44   91:aload_0         
	//*  45   92:getfield        #291 <Field int mInitialY>
	//*  46   95:i2f             
	//*  47   96:aload_3         
	//*  48   97:invokevirtual   #289 <Method float MotionEvent.getY()>
	//*  49  100:fsub            
	//*  50  101:invokestatic    #312 <Method float Math.abs(float)>
	//*  51  104:aload_0         
	//*  52  105:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//*  53  108:invokevirtual   #315 <Method int ViewDragHelper.getTouchSlop()>
	//*  54  111:i2f             
	//*  55  112:fcmpl           
	//*  56  113:ifle            132
			mViewDragHelper.captureChildView(view, motionevent.getPointerId(motionevent.getActionIndex()));
	//   57  116:aload_0         
	//   58  117:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//   59  120:aload_2         
	//   60  121:aload_3         
	//   61  122:aload_3         
	//   62  123:invokevirtual   #302 <Method int MotionEvent.getActionIndex()>
	//   63  126:invokevirtual   #306 <Method int MotionEvent.getPointerId(int)>
	//   64  129:invokevirtual   #440 <Method void ViewDragHelper.captureChildView(View, int)>
		flag = flag1;
	//   65  132:iload           6
	//   66  134:istore          5
		if(mIgnoreEvents)
	//*  67  136:aload_0         
	//*  68  137:getfield        #258 <Field boolean mIgnoreEvents>
	//*  69  140:ifeq            13
			return false;
	//   70  143:iconst_0        
	//   71  144:ireturn         
		if(true) goto _L4; else goto _L5
_L5:
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(i != -1) goto _L2; else goto _L1
	//    2    2:iload_1         
	//    3    3:iconst_m1       
	//    4    4:icmpne          60
_L1:
		if(!mPeekHeightAuto)
	//*   5    7:aload_0         
	//*   6    8:getfield        #238 <Field boolean mPeekHeightAuto>
	//*   7   11:ifne            21
		{
			mPeekHeightAuto = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #238 <Field boolean mPeekHeightAuto>
			flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
		}
_L4:
		if(flag && mState == 4 && mViewRef != null)
	//*  13   21:iload_2         
	//*  14   22:ifeq            59
	//*  15   25:aload_0         
	//*  16   26:getfield        #77  <Field int mState>
	//*  17   29:iconst_4        
	//*  18   30:icmpne          59
	//*  19   33:aload_0         
	//*  20   34:getfield        #197 <Field WeakReference mViewRef>
	//*  21   37:ifnull          59
		{
			View view = (View)mViewRef.get();
	//   22   40:aload_0         
	//   23   41:getfield        #197 <Field WeakReference mViewRef>
	//   24   44:invokevirtual   #202 <Method Object WeakReference.get()>
	//   25   47:checkcast       #156 <Class View>
	//   26   50:astore_3        
			if(view != null)
	//*  27   51:aload_3         
	//*  28   52:ifnull          59
				view.requestLayout();
	//   29   55:aload_3         
	//   30   56:invokevirtual   #445 <Method void View.requestLayout()>
		}
		return;
	//   31   59:return          
_L2:
		if(mPeekHeightAuto || mPeekHeight != i)
	//*  32   60:aload_0         
	//*  33   61:getfield        #238 <Field boolean mPeekHeightAuto>
	//*  34   64:ifne            75
	//*  35   67:aload_0         
	//*  36   68:getfield        #240 <Field int mPeekHeight>
	//*  37   71:iload_1         
	//*  38   72:icmpeq          21
		{
			mPeekHeightAuto = false;
	//   39   75:aload_0         
	//   40   76:iconst_0        
	//   41   77:putfield        #238 <Field boolean mPeekHeightAuto>
			mPeekHeight = Math.max(0, i);
	//   42   80:aload_0         
	//   43   81:iconst_0        
	//   44   82:iload_1         
	//   45   83:invokestatic    #353 <Method int Math.max(int, int)>
	//   46   86:putfield        #240 <Field int mPeekHeight>
			mMaxOffset = mParentHeight - i;
	//   47   89:aload_0         
	//   48   90:aload_0         
	//   49   91:getfield        #208 <Field int mParentHeight>
	//   50   94:iload_1         
	//   51   95:isub            
	//   52   96:putfield        #206 <Field int mMaxOffset>
			flag = true;
	//   53   99:iconst_1        
	//   54  100:istore_2        
		}
		if(true) goto _L4; else goto _L3
	//   55  101:goto            21
_L3:
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
		if(state != mState) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field int mState>
	//    3    5:icmpne          9
_L1:
		return;
	//    4    8:return          
_L2:
		if(mViewRef != null)
			break; /* Loop/switch isn't completed */
	//    5    9:aload_0         
	//    6   10:getfield        #197 <Field WeakReference mViewRef>
	//    7   13:ifnonnull       44
		if(state == 4 || state == 3 || mHideable && state == 5)
	//*   8   16:iload_1         
	//*   9   17:iconst_4        
	//*  10   18:icmpeq          38
	//*  11   21:iload_1         
	//*  12   22:iconst_3        
	//*  13   23:icmpeq          38
	//*  14   26:aload_0         
	//*  15   27:getfield        #251 <Field boolean mHideable>
	//*  16   30:ifeq            8
	//*  17   33:iload_1         
	//*  18   34:iconst_5        
	//*  19   35:icmpne          8
		{
			mState = state;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:putfield        #77  <Field int mState>
			return;
	//   23   43:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
		final View child = (View)mViewRef.get();
	//   24   44:aload_0         
	//   25   45:getfield        #197 <Field WeakReference mViewRef>
	//   26   48:invokevirtual   #202 <Method Object WeakReference.get()>
	//   27   51:checkcast       #156 <Class View>
	//   28   54:astore_2        
		if(child != null)
	//*  29   55:aload_2         
	//*  30   56:ifnull          8
		{
			ViewParent viewparent = child.getParent();
	//   31   59:aload_2         
	//   32   60:invokevirtual   #450 <Method ViewParent View.getParent()>
	//   33   63:astore_3        
			if(viewparent != null && viewparent.isLayoutRequested() && ViewCompat.isAttachedToWindow(child))
	//*  34   64:aload_3         
	//*  35   65:ifnull          100
	//*  36   68:aload_3         
	//*  37   69:invokeinterface #455 <Method boolean ViewParent.isLayoutRequested()>
	//*  38   74:ifeq            100
	//*  39   77:aload_2         
	//*  40   78:invokestatic    #458 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  41   81:ifeq            100
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
	//   42   84:aload_2         
	//   43   85:new             #7   <Class BottomSheetBehavior$1>
	//   44   88:dup             
	//   45   89:aload_0         
	//   46   90:aload_2         
	//   47   91:iload_1         
	//   48   92:invokespecial   #459 <Method void BottomSheetBehavior$1(BottomSheetBehavior, View, int)>
	//   49   95:invokevirtual   #463 <Method boolean View.post(Runnable)>
	//   50   98:pop             
				return;
	//   51   99:return          
			} else
			{
				startSettlingAnimation(child, state);
	//   52  100:aload_0         
	//   53  101:aload_2         
	//   54  102:iload_1         
	//   55  103:invokevirtual   #466 <Method void startSettlingAnimation(View, int)>
				return;
	//   56  106:return          
			}
		}
		if(true) goto _L1; else goto _L4
_L4:
	}

	void setStateInternal(int i)
	{
		if(mState != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int mState>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
	//*   4    8:return          
		{
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
	//*  14   26:ifnull          8
	//*  15   29:aload_0         
	//*  16   30:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//*  17   33:ifnull          8
			{
				mCallback.onStateChanged(view, i);
	//   18   36:aload_0         
	//   19   37:getfield        #204 <Field BottomSheetBehavior$BottomSheetCallback mCallback>
	//   20   40:aload_2         
	//   21   41:iload_1         
	//   22   42:invokevirtual   #469 <Method void BottomSheetBehavior$BottomSheetCallback.onStateChanged(View, int)>
				return;
	//   23   45:return          
			}
		}
	}

	boolean shouldHide(View view, float f)
	{
		if(!mSkipCollapsed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field boolean mSkipCollapsed>
	//*   2    4:ifeq            9
	//*   3    7:iconst_1        
	//*   4    8:ireturn         
		{
			if(view.getTop() < mMaxOffset)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #328 <Method int View.getTop()>
	//*   7   13:aload_0         
	//*   8   14:getfield        #206 <Field int mMaxOffset>
	//*   9   17:icmpge          22
				return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
			if(Math.abs(((float)view.getTop() + 0.1F * f) - (float)mMaxOffset) / (float)mPeekHeight <= 0.5F)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #328 <Method int View.getTop()>
	//*  14   26:i2f             
	//*  15   27:ldc1            #26  <Float 0.1F>
	//*  16   29:fload_2         
	//*  17   30:fmul            
	//*  18   31:fadd            
	//*  19   32:aload_0         
	//*  20   33:getfield        #206 <Field int mMaxOffset>
	//*  21   36:i2f             
	//*  22   37:fsub            
	//*  23   38:invokestatic    #312 <Method float Math.abs(float)>
	//*  24   41:aload_0         
	//*  25   42:getfield        #240 <Field int mPeekHeight>
	//*  26   45:i2f             
	//*  27   46:fdiv            
	//*  28   47:ldc1            #28  <Float 0.5F>
	//*  29   49:fcmpl           
	//*  30   50:ifgt            7
				return false;
	//   31   53:iconst_0        
	//   32   54:ireturn         
		}
		return true;
	}

	void startSettlingAnimation(View view, int i)
	{
		int j;
		if(i == 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          46
			j = mMaxOffset;
	//    3    5:aload_0         
	//    4    6:getfield        #206 <Field int mMaxOffset>
	//    5    9:istore_3        
		else
	//*   6   10:aload_0         
	//*   7   11:getfield        #275 <Field ViewDragHelper mViewDragHelper>
	//*   8   14:aload_1         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #414 <Method int View.getLeft()>
	//*  11   19:iload_3         
	//*  12   20:invokevirtual   #417 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  13   23:ifeq            107
	//*  14   26:aload_0         
	//*  15   27:iconst_2        
	//*  16   28:invokevirtual   #375 <Method void setStateInternal(int)>
	//*  17   31:aload_1         
	//*  18   32:new             #19  <Class BottomSheetBehavior$SettleRunnable>
	//*  19   35:dup             
	//*  20   36:aload_0         
	//*  21   37:aload_1         
	//*  22   38:iload_2         
	//*  23   39:invokespecial   #420 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//*  24   42:invokestatic    #424 <Method void ViewCompat.postOnAnimation(View, Runnable)>
	//*  25   45:return          
		if(i == 3)
	//*  26   46:iload_2         
	//*  27   47:iconst_3        
	//*  28   48:icmpne          59
			j = mMinOffset;
	//   29   51:aload_0         
	//   30   52:getfield        #214 <Field int mMinOffset>
	//   31   55:istore_3        
		else
	//*  32   56:goto            10
		if(mHideable && i == 5)
	//*  33   59:aload_0         
	//*  34   60:getfield        #251 <Field boolean mHideable>
	//*  35   63:ifeq            79
	//*  36   66:iload_2         
	//*  37   67:iconst_5        
	//*  38   68:icmpne          79
			j = mParentHeight;
	//   39   71:aload_0         
	//   40   72:getfield        #208 <Field int mParentHeight>
	//   41   75:istore_3        
		else
	//*  42   76:goto            10
			throw new IllegalArgumentException((new StringBuilder()).append("Illegal state argument: ").append(i).toString());
	//   43   79:new             #164 <Class IllegalArgumentException>
	//   44   82:dup             
	//   45   83:new             #471 <Class StringBuilder>
	//   46   86:dup             
	//   47   87:invokespecial   #472 <Method void StringBuilder()>
	//   48   90:ldc2            #474 <String "Illegal state argument: ">
	//   49   93:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   50   96:iload_2         
	//   51   97:invokevirtual   #481 <Method StringBuilder StringBuilder.append(int)>
	//   52  100:invokevirtual   #485 <Method String StringBuilder.toString()>
	//   53  103:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   54  106:athrow          
		if(mViewDragHelper.smoothSlideViewTo(view, view.getLeft(), j))
		{
			setStateInternal(2);
			ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, i))));
			return;
		} else
		{
			setStateInternal(i);
	//   55  107:aload_0         
	//   56  108:iload_2         
	//   57  109:invokevirtual   #375 <Method void setStateInternal(int)>
			return;
	//   58  112:return          
		}
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
